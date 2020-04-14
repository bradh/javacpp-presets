// Targeted by JavaCPP version 1.5.3: DO NOT EDIT THIS FILE

package org.bytedeco.gandiva;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.arrow.*;
import static org.bytedeco.arrow.global.arrow.*;

import static org.bytedeco.arrow.global.gandiva.*;

@Name("std::vector<std::shared_ptr<gandiva::FunctionSignature> >") @Properties(inherit = org.bytedeco.arrow.presets.gandiva.class)
public class FunctionSignatureVector extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public FunctionSignatureVector(Pointer p) { super(p); }
    public FunctionSignatureVector(FunctionSignature value) { this(1); put(0, value); }
    public FunctionSignatureVector(FunctionSignature ... array) { this(array.length); put(array); }
    public FunctionSignatureVector()       { allocate();  }
    public FunctionSignatureVector(long n) { allocate(n); }
    private native void allocate();
    private native void allocate(@Cast("size_t") long n);
    public native @Name("operator =") @ByRef FunctionSignatureVector put(@ByRef FunctionSignatureVector x);

    public boolean empty() { return size() == 0; }
    public native long size();
    public void clear() { resize(0); }
    public native void resize(@Cast("size_t") long n);

    @Index(function = "at") public native @SharedPtr FunctionSignature get(@Cast("size_t") long i);
    public native FunctionSignatureVector put(@Cast("size_t") long i, FunctionSignature value);

    public native @ByVal Iterator insert(@ByVal Iterator pos, @SharedPtr FunctionSignature value);
    public native @ByVal Iterator erase(@ByVal Iterator pos);
    public native @ByVal Iterator begin();
    public native @ByVal Iterator end();
    @NoOffset @Name("iterator") public static class Iterator extends Pointer {
        public Iterator(Pointer p) { super(p); }
        public Iterator() { }

        public native @Name("operator ++") @ByRef Iterator increment();
        public native @Name("operator ==") boolean equals(@ByRef Iterator it);
        public native @Name("operator *") @SharedPtr @Const FunctionSignature get();
    }

    public FunctionSignature[] get() {
        FunctionSignature[] array = new FunctionSignature[size() < Integer.MAX_VALUE ? (int)size() : Integer.MAX_VALUE];
        for (int i = 0; i < array.length; i++) {
            array[i] = get(i);
        }
        return array;
    }
    @Override public String toString() {
        return java.util.Arrays.toString(get());
    }

    public FunctionSignature pop_back() {
        long size = size();
        FunctionSignature value = get(size - 1);
        resize(size - 1);
        return value;
    }
    public FunctionSignatureVector push_back(FunctionSignature value) {
        long size = size();
        resize(size + 1);
        return put(size, value);
    }
    public FunctionSignatureVector put(FunctionSignature value) {
        if (size() != 1) { resize(1); }
        return put(0, value);
    }
    public FunctionSignatureVector put(FunctionSignature ... array) {
        if (size() != array.length) { resize(array.length); }
        for (int i = 0; i < array.length; i++) {
            put(i, array[i]);
        }
        return this;
    }
}

