package me.lowedermine.jareditor.jar.descriptors;

public enum DescriptorBaseType implements IDescriptorFieldPart {
    BYTE, CHAR, DOUBLE, FLOAT, INT, LONG, SHORT, BOOLEAN;

    @Override
    public String toRaw() {
        switch (this) {
            case BYTE: return "B";
            case CHAR: return "C";
            case DOUBLE: return "D";
            case FLOAT: return "F";
            case INT: return "I";
            case LONG: return "J";
            case SHORT: return "S";
            case BOOLEAN: return "Z";
        }
        return "";
    }
}
