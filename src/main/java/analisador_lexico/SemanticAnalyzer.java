package analisador_lexico;
import analisador_lexico.grammar.MiniPascalBaseVisitor;
import analisador_lexico.SymbolsTable.TypeMiniPascal;
import analisador_lexico.grammar.MiniPascalParser;

public class SemanticAnalyzer extends MiniPascalBaseVisitor<Void> {

    SymbolsTable table;

    @Override
    public Void visitProgram(MiniPascalParser.ProgramContext ctx) {
        table = new SymbolsTable();
        return super.visitProgram(ctx);
    }

    @Override
    public Void visitVardecl(MiniPascalParser.VardeclContext ctx) {
        String nomeVar = ctx.variable().getText();
        String strTypeVar = ctx.type().getText();
        TypeMiniPascal typeVar = TypeMiniPascal.INVALID;
        switch (strTypeVar) {
            case "INTEIRO":
                typeVar = TypeMiniPascal.INTEGER;
                break;
            case "FLOAT":
                typeVar = TypeMiniPascal.FLOAT;
                break;
            default:
                // Nunca irá acontecer, pois o analisador sintático não permite
                break;
        }

        // Verificar se a variável já foi declarada
        if (table.exist(nomeVar)) {
            MiniPascalUtils.addSemanticError(ctx.variable().ID().getSymbol(), "Declaração Inválida: Variável " + nomeVar + " já existe");
        } else {
            table.add(nomeVar, typeVar);
        }
        return super.visitVardecl(ctx);
    }


}