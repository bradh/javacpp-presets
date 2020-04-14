// Targeted by JavaCPP version 1.5.3: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.windows.*;


@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class TOKEN_ACCESS_INFORMATION extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public TOKEN_ACCESS_INFORMATION() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public TOKEN_ACCESS_INFORMATION(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TOKEN_ACCESS_INFORMATION(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public TOKEN_ACCESS_INFORMATION position(long position) {
        return (TOKEN_ACCESS_INFORMATION)super.position(position);
    }

    public native @Cast("PSID_AND_ATTRIBUTES_HASH") SID_AND_ATTRIBUTES_HASH SidHash(); public native TOKEN_ACCESS_INFORMATION SidHash(SID_AND_ATTRIBUTES_HASH setter);
    public native @Cast("PSID_AND_ATTRIBUTES_HASH") SID_AND_ATTRIBUTES_HASH RestrictedSidHash(); public native TOKEN_ACCESS_INFORMATION RestrictedSidHash(SID_AND_ATTRIBUTES_HASH setter);
    public native @Cast("PTOKEN_PRIVILEGES") TOKEN_PRIVILEGES Privileges(); public native TOKEN_ACCESS_INFORMATION Privileges(TOKEN_PRIVILEGES setter);
    public native @ByRef LUID AuthenticationId(); public native TOKEN_ACCESS_INFORMATION AuthenticationId(LUID setter);
    public native @Cast("TOKEN_TYPE") int TokenType(); public native TOKEN_ACCESS_INFORMATION TokenType(int setter);
    public native @Cast("SECURITY_IMPERSONATION_LEVEL") int ImpersonationLevel(); public native TOKEN_ACCESS_INFORMATION ImpersonationLevel(int setter);
    public native @ByRef TOKEN_MANDATORY_POLICY MandatoryPolicy(); public native TOKEN_ACCESS_INFORMATION MandatoryPolicy(TOKEN_MANDATORY_POLICY setter);
    public native @Cast("DWORD") int Flags(); public native TOKEN_ACCESS_INFORMATION Flags(int setter);
    public native @Cast("DWORD") int AppContainerNumber(); public native TOKEN_ACCESS_INFORMATION AppContainerNumber(int setter);
    public native @Cast("PSID") Pointer PackageSid(); public native TOKEN_ACCESS_INFORMATION PackageSid(Pointer setter);
    public native @Cast("PSID_AND_ATTRIBUTES_HASH") SID_AND_ATTRIBUTES_HASH CapabilitiesHash(); public native TOKEN_ACCESS_INFORMATION CapabilitiesHash(SID_AND_ATTRIBUTES_HASH setter);
    public native @Cast("PSID") Pointer TrustLevelSid(); public native TOKEN_ACCESS_INFORMATION TrustLevelSid(Pointer setter);
}
