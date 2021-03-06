import ast.nodes.HtmlDocument;
import ast.visitor.BaseVisitor;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import saed.HTMLLexer;
import saed.HTMLParser;

import java.io.IOException;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class Main {
public static int test;
    public static void main(String[] args) {
        try {
            String source = "samples//samples.txt";
            CharStream cs = fromFileName(source);
            HTMLLexer lexer = new HTMLLexer(cs);
            CommonTokenStream token  = new CommonTokenStream(lexer);
            HTMLParser parser = new HTMLParser(token);
            ParseTree tree = parser.htmlDocument();
            HtmlDocument doc = (HtmlDocument) new BaseVisitor().visit(tree);
            System.out.println(doc);


        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
