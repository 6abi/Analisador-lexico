/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package analisador_lexico;
import analisador_lexico.grammar.*;
import analisador_lexico.*;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import java.awt.HeadlessException;
import java.io.IOException;
import java.util.Arrays;
import javax.swing.JFrame;
import javax.swing.JPanel;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.BufferedTokenStream;

public class App {

    private static final String FILE_LOCATION = "src/main/antlr/files/programaTesteSemantico.minip";

    public static void main(String[] args) {
        try {
            CharStream charStreams = CharStreams.fromFileName(FILE_LOCATION);

            MiniPascalLexer lexer = new MiniPascalLexer(charStreams);

            //fluxo de tokens para o parser
            CommonTokenStream tokens = new CommonTokenStream(lexer);

            //parser a partir dos TokenStream
            MiniPascalParser parser = new MiniPascalParser(tokens);

            MiniPascalParser.ProgramContext tree = parser.program();

            //Analisador semantico da linguagem
            SemanticAnalyzer sa = new SemanticAnalyzer();
            sa.visitProgram(tree);
            MiniPascalUtils.semanticErrors.forEach((s) -> System.out.println(s));

        } catch (Exception e){
            System.out.println("UNKNOWN ERROR");
            System.out.println(e.getMessage());
        }

    }
}
