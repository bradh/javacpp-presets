// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.arrow.global.arrow.*;



///
///
@Namespace("arrow") @Opaque @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class NoExtraMeta extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public NoExtraMeta() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public NoExtraMeta(Pointer p) { super(p); }
}
