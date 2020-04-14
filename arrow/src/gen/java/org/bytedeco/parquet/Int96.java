// Targeted by JavaCPP version 1.5.3: DO NOT EDIT THIS FILE

package org.bytedeco.parquet;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.arrow.*;
import static org.bytedeco.arrow.global.arrow.*;

import static org.bytedeco.arrow.global.parquet.*;

  @Namespace("parquet") @Properties(inherit = org.bytedeco.arrow.presets.parquet.class)
public class Int96 extends Pointer {
      static { Loader.load(); }
      /** Default native constructor. */
      public Int96() { super((Pointer)null); allocate(); }
      /** Native array allocator. Access with {@link Pointer#position(long)}. */
      public Int96(long size) { super((Pointer)null); allocateArray(size); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public Int96(Pointer p) { super(p); }
      private native void allocate();
      private native void allocateArray(long size);
      @Override public Int96 position(long position) {
          return (Int96)super.position(position);
      }
   public native @Cast("uint32_t") int value(int i); public native Int96 value(int i, int setter);
@MemberGetter public native @Cast("uint32_t*") IntPointer value(); }
