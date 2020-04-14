// Targeted by JavaCPP version 1.5.3: DO NOT EDIT THIS FILE

package org.bytedeco.ngraph;

import org.bytedeco.ngraph.Allocator;
import org.bytedeco.ngraph.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.ngraph.global.ngraph.*;

    /** \brief Shape for a tensor. */
    @Namespace("ngraph") @Properties(inherit = org.bytedeco.ngraph.presets.ngraph.class)
public class Shape extends SizeTVector {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public Shape(Pointer p) { super(p); }
    

        public Shape(@Const @ByRef SizeTVector axis_lengths) { super((Pointer)null); allocate(axis_lengths); }
        private native void allocate(@Const @ByRef SizeTVector axis_lengths);

        public Shape(@Const @ByRef Shape axis_lengths) { super((Pointer)null); allocate(axis_lengths); }
        private native void allocate(@Const @ByRef Shape axis_lengths);

        public Shape(@Cast("size_t") long n, @Cast("size_t") long initial_value/*=0*/) { super((Pointer)null); allocate(n, initial_value); }
        private native void allocate(@Cast("size_t") long n, @Cast("size_t") long initial_value/*=0*/);
        public Shape(@Cast("size_t") long n) { super((Pointer)null); allocate(n); }
        private native void allocate(@Cast("size_t") long n);

        public Shape() { super((Pointer)null); allocate(); }
        private native void allocate();
        public native @ByRef @Name("operator =") Shape put(@Const @ByRef Shape v);
    }
