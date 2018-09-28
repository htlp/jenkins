package jenkins.data.parameterType;

import java.lang.reflect.Type;
import java.util.Stack;

/**
 * @author Jesse Glick
 * @author Anderw Bayer
 */
public final class ArrayType extends ParameterType {
    private final ParameterType elementType;

    ArrayType(Type actualClass, ParameterType elementType) {
        super(actualClass);
        this.elementType = elementType;
    }

    /**
     * The element type of the array or list.
     */
    public ParameterType getElementType() {
        return elementType;
    }

    @Override
    public void toString(StringBuilder b, Stack<Class<?>> modelTypes) {
        elementType.toString(b, modelTypes);
        b.append("[]");
    }
}