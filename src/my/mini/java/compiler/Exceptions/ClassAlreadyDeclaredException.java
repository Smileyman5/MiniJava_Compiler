package my.mini.java.compiler.Exceptions;

import org.antlr.v4.runtime.Token;

/**
 * Created by alex on 11/8/2016.
 */
public class ClassAlreadyDeclaredException extends RuntimeException
{

    public ClassAlreadyDeclaredException(String errorMessage, Token className, String sourceName)
    {
        super(errorMessage);
        setStackTrace(new StackTraceElement[]{
                new StackTraceElement(className.getText(), "class", sourceName, className.getLine())
        });
    }
}
