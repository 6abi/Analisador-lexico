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
            case "STRING":
                typeVar = TypeMiniPascal.STRING;
            case "BOOLEAN":
                typeVar = TypeMiniPascal.BOOLEAN;
            default:
                break;
        }

        // Verificar se a variável já foi declarada
        if (table.exist(nomeVar)) {
            MiniPascalUtils.addSemanticError(ctx.variable().ID().getSymbol(), "Declaração Inválida: Variável " + '"' + nomeVar + '"' + " já existe");
        } else {
            table.add(nomeVar, typeVar);
        }
        return super.visitVardecl(ctx);
    }

    @Override
    public Void visitAssignment(MiniPascalParser.AssignmentContext ctx) {
        return super.visitAssignment(ctx);
    }

    @Override
    public Void visitVariable(MiniPascalParser.VariableContext ctx) {
        String nomeVar = ctx.ID().getText();
        if (!table.exist(nomeVar)) {
            MiniPascalUtils.addSemanticError(ctx.ID().getSymbol(), "Variável " + '"' + nomeVar + '"' + " não foi declarada antes do uso");
        }
        return super.visitVariable(ctx);
    }

}