// Targeted by JavaCPP version 1.5.3: DO NOT EDIT THIS FILE

package org.bytedeco.onnx;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.onnx.global.onnx.*;

@Properties(inherit = org.bytedeco.onnx.presets.onnx.class)
public class onnxGetBackendInfoFunction extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    onnxGetBackendInfoFunction(Pointer p) { super(p); }
    protected onnxGetBackendInfoFunction() { allocate(); }
    private native void allocate();
    public native @Cast("onnxStatus") int call(
    onnxBackendID backendID,
    @Cast("onnxBackendInfo") int infoType,
    Pointer infoValue,
    @Cast("size_t*") SizeTPointer infoValueSize);
}
