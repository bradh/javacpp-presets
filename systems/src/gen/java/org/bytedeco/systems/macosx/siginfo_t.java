// Targeted by JavaCPP version 1.5.3: DO NOT EDIT THIS FILE

package org.bytedeco.systems.macosx;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.macosx.*;



@Properties(inherit = org.bytedeco.systems.presets.macosx.class)
public class siginfo_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public siginfo_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public siginfo_t(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public siginfo_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public siginfo_t position(long position) {
        return (siginfo_t)super.position(position);
    }

	public native int si_signo(); public native siginfo_t si_signo(int setter);		/* signal number */
	public native int si_errno(); public native siginfo_t si_errno(int setter);		/* errno association */
	public native int si_code(); public native siginfo_t si_code(int setter);		/* signal code */
	public native @Cast("pid_t") int si_pid(); public native siginfo_t si_pid(int setter);			/* sending process */
	public native @Cast("uid_t") int si_uid(); public native siginfo_t si_uid(int setter);			/* sender's ruid */
	public native int si_status(); public native siginfo_t si_status(int setter);		/* exit value */
	public native Pointer si_addr(); public native siginfo_t si_addr(Pointer setter);		/* faulting instruction */
	public native @ByRef sigval si_value(); public native siginfo_t si_value(sigval setter);		/* signal value */
	public native long si_band(); public native siginfo_t si_band(long setter);		/* band event for SIGPOLL */
	public native @Cast("unsigned long") long __pad(int i); public native siginfo_t __pad(int i, long setter);
	@MemberGetter public native @Cast("unsigned long*") CLongPointer __pad();	/* Reserved for Future Use */
}
