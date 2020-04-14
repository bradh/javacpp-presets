// Targeted by JavaCPP version 1.5.3: DO NOT EDIT THIS FILE

package org.bytedeco.arrow_dataset;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.arrow.*;
import static org.bytedeco.arrow.global.arrow.*;
import org.bytedeco.parquet.*;
import static org.bytedeco.arrow.global.parquet.*;

import static org.bytedeco.arrow.global.arrow_dataset.*;


/** \brief A Source of FileFragments. */
@Namespace("arrow::dataset") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.arrow_dataset.class)
public class FileSystemSource extends Source {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public FileSystemSource(Pointer p) { super(p); }

  /** \brief Create a FileSystemSource.
   * 
   *  @param schema [in] the top-level schema of the DataSource
   *  @param root_partition [in] the top-level partition of the DataSource
   *  @param format [in] file format to create fragments from.
   *  @param filesystem [in] the filesystem which files are from.
   *  @param stats [in] a list of files/directories to consume.
   *  attach additional partition expressions to FileStats found in {@code stats}.
   * 
   *  The caller is not required to provide a complete coverage of nodes and
   *  partitions. */
  
  ///
  ///
  public static native @ByVal SourceResult Make(@SharedPtr @ByVal Schema schema,
                                                @SharedPtr @ByVal Expression root_partition,
                                                @SharedPtr FileFormat format,
                                                @SharedPtr FileSystem filesystem,
                                                @ByVal FileStatsVector stats);

  /** \brief Create a FileSystemSource with file-level partitions.
   * 
   *  @param schema [in] the top-level schema of the DataSource
   *  @param root_partition [in] the top-level partition of the DataSource
   *  @param format [in] file format to create fragments from.
   *  @param filesystem [in] the filesystem which files are from.
   *  @param stats [in] a list of files/directories to consume.
   *  @param partitions [in] partition information associated with {@code stats}.
   *  attach additional partition expressions to FileStats found in {@code stats}.
   * 
   *  The caller is not required to provide a complete coverage of nodes and
   *  partitions. */
  
  ///
  ///
  public static native @ByVal SourceResult Make(@SharedPtr @ByVal Schema schema,
                                                @SharedPtr @ByVal Expression root_partition,
                                                @SharedPtr FileFormat format,
                                                @SharedPtr FileSystem filesystem,
                                                @ByVal FileStatsVector stats,
                                                @ByVal ExpressionVector partitions);

  /** \brief Create a FileSystemSource with file-level partitions.
   * 
   *  @param schema [in] the top-level schema of the DataSource
   *  @param root_partition [in] the top-level partition of the DataSource
   *  @param format [in] file format to create fragments from.
   *  @param filesystem [in] the filesystem which files are from.
   *  @param forest [in] a PathForest of files/directories to consume.
   *  @param partitions [in] partition information associated with {@code forest}.
   *  attach additional partition expressions to FileStats found in {@code forest}.
   * 
   *  The caller is not required to provide a complete coverage of nodes and
   *  partitions. */
  public static native @ByVal SourceResult Make(@SharedPtr @ByVal Schema schema,
                                                @SharedPtr @ByVal Expression root_partition,
                                                @SharedPtr FileFormat format,
                                                @SharedPtr FileSystem filesystem,
                                                @ByVal PathForest forest,
                                                @ByVal ExpressionVector partitions);

  public native @StdString String type_name();

  public native @StdString String ToString();

  public native @SharedPtr FileFormat format();
}
