// Targeted by JavaCPP version 1.5.3: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Returns true if queue is closed.
 * 
 *  This operation returns true if the queue is closed and false if the queue
 *  is open.
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * handle: The handle to a queue.
 * 
 *  Returns:
 *  * {@code Output}: The is_closed tensor. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class QueueIsClosed extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public QueueIsClosed(Pointer p) { super(p); }

  public QueueIsClosed(@Const @ByRef Scope scope, @ByVal Input handle) { super((Pointer)null); allocate(scope, handle); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input handle);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public native @ByRef Operation operation(); public native QueueIsClosed operation(Operation setter);
  public native @ByRef Output is_closed(); public native QueueIsClosed is_closed(Output setter);
}
