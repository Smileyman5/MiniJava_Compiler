package my.mini.java.compiler.AST.nodes.statements.exprs.math;

import my.mini.java.compiler.AST.nodes.Node;
import my.mini.java.compiler.AST.nodes.statements.StatementNode;

/**
 * Created by alex on 11/28/2016.
 */
public class MultMathNode extends MathNode
{

    public MultMathNode(Node leftMathNode, Node rightMathNode)
    {
        super(leftMathNode, rightMathNode);
    }
}
