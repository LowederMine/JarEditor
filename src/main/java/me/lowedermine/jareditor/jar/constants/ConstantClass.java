package me.lowedermine.jareditor.jar.constants;

import me.lowedermine.jareditor.jar.infos.ClassInfo;

import java.io.*;
import java.util.Objects;

public class ConstantClass implements IConstant, ILoadable {
    public int name;

    public ConstantClass() {

    }

    public ConstantClass(DataInputStream in) throws IOException {
        name = in.readUnsignedShort();
    }

    @Override
    public void toBytes(DataOutputStream out) throws IOException {
        out.writeByte(7);
        out.writeShort(name);
    }

    @Override
    public Object objectify(ConstantPool cp) {
        return new ClassInfo((String) cp.rc(name).objectify(cp));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ConstantClass that = (ConstantClass) o;
        return name == that.name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
