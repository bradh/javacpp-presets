// Targeted by JavaCPP version 1.5.3: DO NOT EDIT THIS FILE

package org.bytedeco.tensorrt.nvinfer;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;
import org.bytedeco.cuda.cublas.*;
import static org.bytedeco.cuda.global.cublas.*;
import org.bytedeco.cuda.cudnn.*;
import static org.bytedeco.cuda.global.cudnn.*;
import org.bytedeco.cuda.nvrtc.*;
import static org.bytedeco.cuda.global.nvrtc.*;

import static org.bytedeco.tensorrt.global.nvinfer.*;


/**
 *  \class Dims2
 *  \brief Descriptor for two-dimensional data.
 *  */
@Namespace("nvinfer1") @Properties(inherit = org.bytedeco.tensorrt.presets.nvinfer.class)
public class Dims2 extends Dims {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Dims2(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public Dims2(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public Dims2 position(long position) {
        return (Dims2)super.position(position);
    }

    /**
     *  \brief Construct an empty Dims2 object.
     *  */
    
    
    //!
    //!
    //!
    public Dims2() { super((Pointer)null); allocate(); }
    private native void allocate();

    /**
     *  \brief Construct a Dims2 from 2 elements.
     * 
     *  @param d0 The first element.
     *  @param d1 The second element.
     *  */
    public Dims2(int d0, int d1) { super((Pointer)null); allocate(d0, d1); }
    private native void allocate(int d0, int d1);
}
