// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.arrow.global.arrow.*;


@Namespace("arrow::util::detail") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class StringStreamWrapper extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public StringStreamWrapper(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public StringStreamWrapper(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public StringStreamWrapper position(long position) {
        return (StringStreamWrapper)super.position(position);
    }

  public StringStreamWrapper() { super((Pointer)null); allocate(); }
  private native void allocate();

  public native @Cast("std::ostream*") @ByRef Pointer stream();
  public native @StdString String str();
}
