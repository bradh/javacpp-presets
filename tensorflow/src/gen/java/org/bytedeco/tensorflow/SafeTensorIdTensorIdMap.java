// Targeted by JavaCPP version 1.5.3: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;

@Name("std::map<tensorflow::SafeTensorId,tensorflow::SafeTensorId>") @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class SafeTensorIdTensorIdMap extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SafeTensorIdTensorIdMap(Pointer p) { super(p); }
    public SafeTensorIdTensorIdMap()       { allocate();  }
    private native void allocate();
    public native @Name("operator =") @ByRef SafeTensorIdTensorIdMap put(@ByRef SafeTensorIdTensorIdMap x);

    public boolean empty() { return size() == 0; }
    public native long size();

    @Index public native @ByRef SafeTensorId get(@ByRef SafeTensorId i);
    public native SafeTensorIdTensorIdMap put(@ByRef SafeTensorId i, SafeTensorId value);

    public native @ByVal Iterator begin();
    public native @ByVal Iterator end();
    @NoOffset @Name("iterator") public static class Iterator extends Pointer {
        public Iterator(Pointer p) { super(p); }
        public Iterator() { }

        public native @Name("operator ++") @ByRef Iterator increment();
        public native @Name("operator ==") boolean equals(@ByRef Iterator it);
        public native @Name("operator *().first") @MemberGetter @ByRef @Const SafeTensorId first();
        public native @Name("operator *().second") @MemberGetter @ByRef @Const SafeTensorId second();
    }
}

