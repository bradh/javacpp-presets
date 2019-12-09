// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.arrow.global.arrow.*;

@Name("std::vector<bool>") @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class BoolVector extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public BoolVector(Pointer p) { super(p); }
    public BoolVector(boolean value) { this(1); put(0, value); }
    public BoolVector(boolean ... array) { this(array.length); put(array); }
    public BoolVector()       { allocate();  }
    public BoolVector(long n) { allocate(n); }
    private native void allocate();
    private native void allocate(@Cast("size_t") long n);
    public native @Name("operator=") @ByRef BoolVector put(@ByRef BoolVector x);

    public boolean empty() { return size() == 0; }
    public native long size();
    public void clear() { resize(0); }
    public native void resize(@Cast("size_t") long n);

    @Index(function = "at") public native @Cast("bool") boolean get(@Cast("size_t") long i);
    public native BoolVector put(@Cast("size_t") long i, boolean value);

    public native @ByVal Iterator insert(@ByVal Iterator pos, @Cast("bool") boolean value);
    public native @ByVal Iterator erase(@ByVal Iterator pos);
    public native @ByVal Iterator begin();
    public native @ByVal Iterator end();
    @NoOffset @Name("iterator") public static class Iterator extends Pointer {
        public Iterator(Pointer p) { super(p); }
        public Iterator() { }

        public native @Name("operator++") @ByRef Iterator increment();
        public native @Name("operator==") boolean equals(@ByRef Iterator it);
        public native @Name("operator*") @Cast("bool") boolean get();
    }

    public boolean[] get() {
        boolean[] array = new boolean[size() < Integer.MAX_VALUE ? (int)size() : Integer.MAX_VALUE];
        for (int i = 0; i < array.length; i++) {
            array[i] = get(i);
        }
        return array;
    }
    @Override public String toString() {
        return java.util.Arrays.toString(get());
    }

    public boolean pop_back() {
        long size = size();
        boolean value = get(size - 1);
        resize(size - 1);
        return value;
    }
    public BoolVector push_back(boolean value) {
        long size = size();
        resize(size + 1);
        return put(size, value);
    }
    public BoolVector put(boolean value) {
        if (size() != 1) { resize(1); }
        return put(0, value);
    }
    public BoolVector put(boolean ... array) {
        if (size() != array.length) { resize(array.length); }
        for (int i = 0; i < array.length; i++) {
            put(i, array[i]);
        }
        return this;
    }
}

