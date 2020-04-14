// Targeted by JavaCPP version 1.5.3: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


// Represents a function call frame. I.e., the data structure used to
// pass arguments to a function and retrieve its results.
//
// Runtime must arrange accesses to one FunctionCallFrame s.t.
//   1. SetArgs() happens before any GetArg();
//   2. GetRetvals happens after all SetRetval();
@Namespace("tensorflow") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class FunctionCallFrame extends CallFrameInterface {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public FunctionCallFrame(Pointer p) { super(p); }

  public FunctionCallFrame(@ByVal @Cast("tensorflow::DataTypeSlice*") DataTypeVector arg_types, @ByVal @Cast("tensorflow::DataTypeSlice*") DataTypeVector ret_types) { super((Pointer)null); allocate(arg_types, ret_types); }
  private native void allocate(@ByVal @Cast("tensorflow::DataTypeSlice*") DataTypeVector arg_types, @ByVal @Cast("tensorflow::DataTypeSlice*") DataTypeVector ret_types);

  // Caller methods.
  public native @ByVal Status SetArgs(@ByVal TensorVector args);
  public native @ByVal Status GetRetvals(TensorVector rets);

  // Moves the return values from the frame to rets. If allow_dead_tensors is
  // false it will fail if any of the retvals do not have a value.
  public native @ByVal Status ConsumeRetvals(TensorVector rets, @Cast("bool") boolean allow_dead_tensors);

  public native @Cast("size_t") long num_args();
  public native @Cast("size_t") long num_retvals();

  // Callee methods.
  public native @ByVal Status GetArg(int index, Tensor val);
  public native @ByVal Status SetRetval(int index, @Const @ByRef Tensor val);
}
