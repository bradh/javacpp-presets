// Targeted by JavaCPP version 1.5.3: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


@Name("arrow::json::ParseOptions") @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class JsonParseOptions extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public JsonParseOptions() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public JsonParseOptions(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public JsonParseOptions(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public JsonParseOptions position(long position) {
        return (JsonParseOptions)super.position(position);
    }

  // Parsing options

  /** Optional explicit schema (disables type inference on those fields) */
  
  ///
  public native @SharedPtr @ByRef Schema explicit_schema(); public native JsonParseOptions explicit_schema(Schema setter);

  /** Whether objects may be printed across multiple lines (for example pretty-printed)
   * 
   *  If true, parsing may be slower. */
  public native @Cast("bool") boolean newlines_in_values(); public native JsonParseOptions newlines_in_values(boolean setter);

  /** How JSON fields outside of explicit_schema (if given) are treated */
  public native UnexpectedFieldBehavior unexpected_field_behavior(); public native JsonParseOptions unexpected_field_behavior(UnexpectedFieldBehavior setter);

  /** Create parsing options with default values */
  public static native @ByVal JsonParseOptions Defaults();
}
