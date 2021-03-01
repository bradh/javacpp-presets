// Targeted by JavaCPP version 1.5.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tvm;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.opencl.*;
import static org.bytedeco.opencl.global.OpenCL.*;
import org.bytedeco.dnnl.*;
import static org.bytedeco.dnnl.global.dnnl.*;
import org.bytedeco.llvm.LLVM.*;
import static org.bytedeco.llvm.global.LLVM.*;
import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.mkl.global.mkl_rt.*;

import static org.bytedeco.tvm.global.tvm_runtime.*;


/**
 * \brief Signature for extension function declarer.
 *
 *  TVM call this function to get the extension functions
 *  The declarer will call register_func to register function and their name.
 *
 * @param register_func_handle The register function
 * @return 0 if success, -1 if failure happens
 */
@Properties(inherit = org.bytedeco.tvm.presets.tvm_runtime.class)
public class TVMExtensionFuncDeclarer extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    TVMExtensionFuncDeclarer(Pointer p) { super(p); }
    protected TVMExtensionFuncDeclarer() { allocate(); }
    private native void allocate();
    public native int call(TVMFunctionHandle register_func_handle);
}
