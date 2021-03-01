// Targeted by JavaCPP version 1.5.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tvm;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.opencl.*;
import static org.bytedeco.opencl.global.OpenCL.*;
import org.bytedeco.dnnl.*;
import static org.bytedeco.dnnl.global.dnnl.*;
import org.bytedeco.llvm.LLVM.*;
import static org.bytedeco.llvm.global.LLVM.*;
import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.mkl.global.mkl_rt.*;

import static org.bytedeco.tvm.global.tvm_runtime.*;


/** \brief file system system interface */
@Namespace("dmlc::io") @Properties(inherit = org.bytedeco.tvm.presets.tvm_runtime.class)
public class FileSystem extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public FileSystem(Pointer p) { super(p); }

  /**
   * \brief get singleton of filesystem instance according to URI
   * @param path can be s3://..., hdfs://..., file://...,
   *            empty string(will return local)
   * @return a corresponding filesystem, report error if
   *         we cannot find a matching system
   */
  
  /** \brief virtual destructor */
  /**
   * \brief get information about a path
   * @param path the path to the file
   * @return the information about the file
   */
  public native @ByVal FileInfo GetPathInfo(@Const @ByRef URI path);
  /**
   * \brief list files in a directory
   * @param path to the file
   * @param out_list the output information about the files
   */
  public native void ListDirectory(@Const @ByRef URI path, @StdVector FileInfo out_list);
  /**
   * \brief list files in a directory recursively using ListDirectory
   * @param path to the file
   * @param out_list the output information about the files
   */
  public native void ListDirectoryRecursive(@Const @ByRef URI path,
                                        @StdVector FileInfo out_list);
  /**
   * \brief open a stream
   * @param path path to file
   * @param flag can be "w", "r", "a
   * @param allow_null whether NULL can be returned, or directly report error
   * @return the created stream, can be NULL when allow_null == true and file do not exist
   */
  public native Stream Open(@Const @ByRef URI path,
                         @Cast("const char*") BytePointer flag,
                         @Cast("bool") boolean allow_null/*=false*/);
  public native Stream Open(@Const @ByRef URI path,
                         @Cast("const char*") BytePointer flag);
  public native Stream Open(@Const @ByRef URI path,
                         String flag,
                         @Cast("bool") boolean allow_null/*=false*/);
  public native Stream Open(@Const @ByRef URI path,
                         String flag);
  /**
   * \brief open a seekable stream for read
   * @param path the path to the file
   * @param allow_null whether NULL can be returned, or directly report error
   * @return the created stream, can be NULL when allow_null == true and file do not exist
   */
  public native SeekStream OpenForRead(@Const @ByRef URI path,
                                    @Cast("bool") boolean allow_null/*=false*/);
  public native SeekStream OpenForRead(@Const @ByRef URI path);
}
