package me.lowedermine.jareditor.jar.signatures;

import java.util.Objects;

public class SignatureTypeVariableType implements ISignatureReferencePart, ISignatureThrowsPart {
    public String name;

    public SignatureTypeVariableType(String name) {
        this.name = name;
    }

    @Override
    public String toRaw() {
        return "T" + name + ";";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SignatureTypeVariableType that = (SignatureTypeVariableType) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
