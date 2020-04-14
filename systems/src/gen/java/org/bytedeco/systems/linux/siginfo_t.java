// Targeted by JavaCPP version 1.5.3: DO NOT EDIT THIS FILE

package org.bytedeco.systems.linux;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.linux.*;

// # else
// # endif
@Properties(inherit = org.bytedeco.systems.presets.linux.class)
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

      public native int si_signo(); public native siginfo_t si_signo(int si_signo);		/* Signal number.  */
      public native int si_errno(); public native siginfo_t si_errno(int si_errno);		/* If non-zero, an errno value associated with
                     this signal, as defined in <errno.h>.  */
      public native int si_code(); public native siginfo_t si_code(int si_code);		/* Signal code.  */

      public native @Cast("__pid_t") int si_pid(); public native siginfo_t si_pid(int si_pid);	/* Sending process ID.  */
      public native @Cast("__uid_t") int si_uid(); public native siginfo_t si_uid(int si_uid);	/* Real user ID of sending process.  */
      public native int si_timerid(); public native siginfo_t si_timerid(int si_timerid);		/* Timer ID.  */
      public native int si_overrun(); public native siginfo_t si_overrun(int si_overrun);	/* Overrun count.  */
      public native @ByRef sigval si_value(); public native siginfo_t si_value(sigval si_value);	/* Signal value.  */
      public native int si_status(); public native siginfo_t si_status(int si_status);	/* Exit value or signal.  */
      public native @Cast("__clock_t") long si_utime(); public native siginfo_t si_utime(long si_utime);
      public native @Cast("__clock_t") long si_stime(); public native siginfo_t si_stime(long si_stime);
      public native Pointer si_addr(); public native siginfo_t si_addr(Pointer si_addr);	/* Faulting insn/memory ref.  */
      public native long si_band(); public native siginfo_t si_band(long si_band);	/* Band event for SIGPOLL.  */
      public native int si_fd(); public native siginfo_t si_fd(int si_fd);
  }

