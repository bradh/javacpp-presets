// Targeted by JavaCPP version 1.5.3: DO NOT EDIT THIS FILE

package org.bytedeco.llvm.LLVM;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.llvm.global.LLVM.*;


/**
 * DebugLoc containing File, Line and Column.
 *
 * @since REMARKS_API_VERSION=0
 */
@Name("LLVMRemarkOpaqueDebugLoc") @Opaque @Properties(inherit = org.bytedeco.llvm.presets.LLVM.class)
public class LLVMRemarkDebugLocRef extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public LLVMRemarkDebugLocRef() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public LLVMRemarkDebugLocRef(Pointer p) { super(p); }
}
