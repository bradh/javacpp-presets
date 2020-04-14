// Targeted by JavaCPP version 1.5.3: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.windows.*;


@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class PROCESS_MITIGATION_STRICT_HANDLE_CHECK_POLICY extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public PROCESS_MITIGATION_STRICT_HANDLE_CHECK_POLICY() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public PROCESS_MITIGATION_STRICT_HANDLE_CHECK_POLICY(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PROCESS_MITIGATION_STRICT_HANDLE_CHECK_POLICY(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public PROCESS_MITIGATION_STRICT_HANDLE_CHECK_POLICY position(long position) {
        return (PROCESS_MITIGATION_STRICT_HANDLE_CHECK_POLICY)super.position(position);
    }

        public native @Cast("DWORD") int Flags(); public native PROCESS_MITIGATION_STRICT_HANDLE_CHECK_POLICY Flags(int setter);
            public native @Cast("DWORD") @NoOffset int RaiseExceptionOnInvalidHandleReference(); public native PROCESS_MITIGATION_STRICT_HANDLE_CHECK_POLICY RaiseExceptionOnInvalidHandleReference(int setter);
            public native @Cast("DWORD") @NoOffset int HandleExceptionsPermanentlyEnabled(); public native PROCESS_MITIGATION_STRICT_HANDLE_CHECK_POLICY HandleExceptionsPermanentlyEnabled(int setter);
            public native @Cast("DWORD") @NoOffset int ReservedFlags(); public native PROCESS_MITIGATION_STRICT_HANDLE_CHECK_POLICY ReservedFlags(int setter);
}
