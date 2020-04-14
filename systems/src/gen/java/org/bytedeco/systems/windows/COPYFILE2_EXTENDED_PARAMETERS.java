// Targeted by JavaCPP version 1.5.3: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.windows.*;


@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class COPYFILE2_EXTENDED_PARAMETERS extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public COPYFILE2_EXTENDED_PARAMETERS() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public COPYFILE2_EXTENDED_PARAMETERS(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public COPYFILE2_EXTENDED_PARAMETERS(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public COPYFILE2_EXTENDED_PARAMETERS position(long position) {
        return (COPYFILE2_EXTENDED_PARAMETERS)super.position(position);
    }

  public native @Cast("DWORD") int dwSize(); public native COPYFILE2_EXTENDED_PARAMETERS dwSize(int setter);
  public native @Cast("DWORD") int dwCopyFlags(); public native COPYFILE2_EXTENDED_PARAMETERS dwCopyFlags(int setter);
  public native @Cast("BOOL*") IntPointer pfCancel(); public native COPYFILE2_EXTENDED_PARAMETERS pfCancel(IntPointer setter);
  public native PCOPYFILE2_PROGRESS_ROUTINE pProgressRoutine(); public native COPYFILE2_EXTENDED_PARAMETERS pProgressRoutine(PCOPYFILE2_PROGRESS_ROUTINE setter);
  public native @Cast("PVOID") Pointer pvCallbackContext(); public native COPYFILE2_EXTENDED_PARAMETERS pvCallbackContext(Pointer setter);
}
