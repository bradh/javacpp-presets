// Targeted by JavaCPP version 1.5.3: DO NOT EDIT THIS FILE

package org.bytedeco.onnx;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.onnx.global.onnx.*;

@Name("std::vector<int64_t>") @Properties(inherit = org.bytedeco.onnx.presets.onnx.class)
public class LongVector extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public LongVector(Pointer p) { super(p); }
    public LongVector(long ... array) { this(array.length); put(array); }
    public LongVector()       { allocate();  }
    public LongVector(long n) { allocate(n); }
    private native void allocate();
    private native void allocate(@Cast("size_t") long n);
    public native @Name("operator =") @ByRef LongVector put(@ByRef LongVector x);

    public boolean empty() { return size() == 0; }
    public native long size();
    public void clear() { resize(0); }
    public native void resize(@Cast("size_t") long n);

    @Index(function = "at") public native @Cast("int64_t") long get(@Cast("size_t") long i);
    public native LongVector put(@Cast("size_t") long i, long value);

    public native @ByVal Iterator insert(@ByVal Iterator pos, @Cast("int64_t") long value);
    public native @ByVal Iterator erase(@ByVal Iterator pos);
    public native @ByVal Iterator begin();
    public native @ByVal Iterator end();
    @NoOffset @Name("iterator") public static class Iterator extends Pointer {
        public Iterator(Pointer p) { super(p); }
        public Iterator() { }

        public native @Name("operator ++") @ByRef Iterator increment();
        public native @Name("operator ==") boolean equals(@ByRef Iterator it);
        public native @Name("operator *") @Cast("int64_t") long get();
    }

    public long[] get() {
        long[] array = new long[size() < Integer.MAX_VALUE ? (int)size() : Integer.MAX_VALUE];
        for (int i = 0; i < array.length; i++) {
            array[i] = get(i);
        }
        return array;
    }
    @Override public String toString() {
        return java.util.Arrays.toString(get());
    }

    public long pop_back() {
        long size = size();
        long value = get(size - 1);
        resize(size - 1);
        return value;
    }
    public LongVector push_back(long value) {
        long size = size();
        resize(size + 1);
        return put(size, value);
    }
    public LongVector put(long value) {
        if (size() != 1) { resize(1); }
        return put(0, value);
    }
    public LongVector put(long ... array) {
        if (size() != array.length) { resize(array.length); }
        for (int i = 0; i < array.length; i++) {
            put(i, array[i]);
        }
        return this;
    }
}

