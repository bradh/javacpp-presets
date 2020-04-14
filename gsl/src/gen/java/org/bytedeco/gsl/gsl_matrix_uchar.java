// Targeted by JavaCPP version 1.5.3: DO NOT EDIT THIS FILE

package org.bytedeco.gsl;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.gsl.global.gsl.*;

// #else
// #endif

@Properties(inherit = org.bytedeco.gsl.presets.gsl.class)
public class gsl_matrix_uchar extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public gsl_matrix_uchar() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public gsl_matrix_uchar(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public gsl_matrix_uchar(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public gsl_matrix_uchar position(long position) {
        return (gsl_matrix_uchar)super.position(position);
    }

  public native @Cast("size_t") long size1(); public native gsl_matrix_uchar size1(long setter);
  public native @Cast("size_t") long size2(); public native gsl_matrix_uchar size2(long setter);
  public native @Cast("size_t") long tda(); public native gsl_matrix_uchar tda(long setter);
  public native @Cast("unsigned char*") BytePointer data(); public native gsl_matrix_uchar data(BytePointer setter);
  public native gsl_block_uchar block(); public native gsl_matrix_uchar block(gsl_block_uchar setter);
  public native int owner(); public native gsl_matrix_uchar owner(int setter);
}
