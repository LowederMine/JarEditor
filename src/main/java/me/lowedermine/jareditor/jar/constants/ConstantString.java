package me.lowedermine.jareditor.jar.constants;

import me.lowedermine.jareditor.jar.infos.StringInfo;

import java.io.*;
import java.util.Objects;

public class ConstantString implements IConstant, ILoadable {
    public int string;

    public ConstantString() {

    }

    public ConstantString(DataInputStream in) throws IOException {
        string = in.readUnsignedShort();
    }

    @Override
    public void toBytes(DataOutputStream out) throws IOException {
        out.writeByte(8);
        out.writeShort(string);
    }

    @Override
    public Object objectify(ConstantPool cp) {
        return new StringInfo((String) cp.rc(string).objectify(cp));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ConstantString that = (ConstantString) o;
        return string == that.string;
    }

    @Override
    public int hashCode() {
        return Objects.hash(string);
    }
}
