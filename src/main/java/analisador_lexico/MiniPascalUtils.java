package analisador_lexico;

import java.util.ArrayList;
import java.util.List;
import analisador_lexico.grammar.*;
import analisador_lexico.SymbolsTable;
import org.antlr.v4.runtime.Token;

public class MiniPascalUtils {
//    lista de erros semânticos
    public static List<String> semanticErrors = new ArrayList<>();

//    pega o token para saber a linha e coluna do erro
    public static void addSemanticError(Token t, String message) {
        int line = t.getLine();
        int column = t.getCharPositionInLine();
        semanticErrors.add(String.format("Erro %d:%d - %s", line, column, message));
    }

    public static SymbolsTable.TypeMiniPascal checkType(SymbolsTable table, MiniPascalParser.AriExpressionContext ctx) {
        SymbolsTable.TypeMiniPascal ret = null;
        for (var ta : ctx.termAri()) {
            SymbolsTable.TypeMiniPascal aux = checkType(table, ta);
            if (ret == null) {
                ret = aux;
            } else if (ret != aux && aux != SymbolsTable.TypeMiniPascal.INVALID) {
                addSemanticError(ctx.start, "Expressão: " + ctx.getText() + " operação inválida, tipos incompativeis");
                ret = SymbolsTable.TypeMiniPascal.INVALID;
            }
        }
        return ret;
    }

    public static SymbolsTable.TypeMiniPascal checkType(SymbolsTable table, MiniPascalParser.TermAriContext ctx) {
        SymbolsTable.TypeMiniPascal ret = null;
        for (var ta : ctx.factorAri()) {
            SymbolsTable.TypeMiniPascal aux = checkType(table, ta);
            if (ret == null) {
                ret = aux;
            } else if (ret != aux && aux != SymbolsTable.TypeMiniPascal.INVALID) {
                addSemanticError(ctx.start, "Termo: " + ctx.getText() + " contém tipos incompatíveis");
                ret = SymbolsTable.TypeMiniPascal.INVALID;
            }
        }
        return ret;
    }

    public static SymbolsTable.TypeMiniPascal checkType(SymbolsTable table, MiniPascalParser.FactorAriContext ctx) {
        if (ctx.DIGIT() != null) {
            return SymbolsTable.TypeMiniPascal.INTEGER;
        } else if (ctx.DIGIT() != null) {
            return SymbolsTable.TypeMiniPascal.FLOAT;
        }else{
            String nomeVar = ctx.variable().getText();
            if (!table.exist(nomeVar)) {
                addSemanticError(ctx.variable().ID().getSymbol(), "Variavél " + nomeVar + " não foi declarada antes do uso");
                return SymbolsTable.TypeMiniPascal.INVALID;
            }
            return checkType(table, nomeVar);
        }
    }
    public static SymbolsTable.TypeMiniPascal checkType(SymbolsTable table, String nomeVar) {
        return table.verify(nomeVar);
    }
}


