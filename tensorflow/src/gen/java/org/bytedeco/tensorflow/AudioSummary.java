// Targeted by JavaCPP version 1.5.3: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Outputs a {@code Summary} protocol buffer with audio.
 * 
 *  The summary has up to {@code max_outputs} summary values containing audio. The
 *  audio is built from {@code tensor} which must be 3-D with shape {@code [batch_size,
 *  frames, channels]} or 2-D with shape {@code [batch_size, frames]}. The values are
 *  assumed to be in the range of {@code [-1.0, 1.0]} with a sample rate of {@code sample_rate}.
 * 
 *  The {@code tag} argument is a scalar {@code Tensor} of type {@code string}.  It is used to
 *  build the {@code tag} of the summary values:
 * 
 *  *  If {@code max_outputs} is 1, the summary value tag is '*tag* /audio'.
 *  *  If {@code max_outputs} is greater than 1, the summary value tags are
 *     generated sequentially as '*tag* /audio/0', '*tag* /audio/1', etc.
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * tag: Scalar. Used to build the {@code tag} attribute of the summary values.
 *  * tensor: 2-D of shape {@code [batch_size, frames]}.
 *  * sample_rate: The sample rate of the signal in hertz.
 * 
 *  Optional attributes (see {@code Attrs}):
 *  * max_outputs: Max number of batch elements to generate audio for.
 * 
 *  Returns:
 *  * {@code Output}: Scalar. Serialized {@code Summary} protocol buffer. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class AudioSummary extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AudioSummary(Pointer p) { super(p); }

  /** Optional attribute setters for AudioSummary */
  public static class Attrs extends Pointer {
      static { Loader.load(); }
      /** Default native constructor. */
      public Attrs() { super((Pointer)null); allocate(); }
      /** Native array allocator. Access with {@link Pointer#position(long)}. */
      public Attrs(long size) { super((Pointer)null); allocateArray(size); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public Attrs(Pointer p) { super(p); }
      private native void allocate();
      private native void allocateArray(long size);
      @Override public Attrs position(long position) {
          return (Attrs)super.position(position);
      }
  
    /** Max number of batch elements to generate audio for.
     * 
     *  Defaults to 3 */
    public native @ByVal Attrs MaxOutputs(@Cast("tensorflow::int64") long x);

    public native @Cast("tensorflow::int64") long max_outputs_(); public native Attrs max_outputs_(long setter);
  }
  public AudioSummary(@Const @ByRef Scope scope, @ByVal Input tag,
               @ByVal Input tensor, @ByVal Input sample_rate) { super((Pointer)null); allocate(scope, tag, tensor, sample_rate); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input tag,
               @ByVal Input tensor, @ByVal Input sample_rate);
  public AudioSummary(@Const @ByRef Scope scope, @ByVal Input tag,
               @ByVal Input tensor, @ByVal Input sample_rate, @Const @ByRef Attrs attrs) { super((Pointer)null); allocate(scope, tag, tensor, sample_rate, attrs); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input tag,
               @ByVal Input tensor, @ByVal Input sample_rate, @Const @ByRef Attrs attrs);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public static native @ByVal Attrs MaxOutputs(@Cast("tensorflow::int64") long x);

  public native @ByRef Operation operation(); public native AudioSummary operation(Operation setter);
  public native @ByRef Output summary(); public native AudioSummary summary(Output setter);
}
