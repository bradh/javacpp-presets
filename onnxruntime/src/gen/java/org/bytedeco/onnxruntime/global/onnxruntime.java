// Targeted by JavaCPP version 1.5.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.onnxruntime.global;

import org.bytedeco.onnxruntime.*;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.dnnl.*;
import static org.bytedeco.dnnl.global.dnnl.*;

public class onnxruntime extends org.bytedeco.onnxruntime.presets.onnxruntime {
    static { Loader.load(); }

// Targeting ../StringVector.java


// Targeting ../ValueVector.java


// Parsed from onnxruntime/core/session/onnxruntime_c_api.h

// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

// #pragma once
// #include <stdlib.h>
// #include <stdint.h>
// #include <string.h>

// This value is used in structures passed to ORT so that a newer version of ORT will still work with them
public static final int ORT_API_VERSION = 6;

// #ifdef __cplusplus
// #endif

// SAL2 Definitions
// #ifndef _WIN32
// #define _In_
// #define _In_z_
// #define _In_opt_
// #define _In_opt_z_
// #define _Out_
// #define _Outptr_
// #define _Out_opt_
// #define _Inout_
// #define _Inout_opt_
// #define _Frees_ptr_opt_
// #define _Ret_maybenull_
// #define _Ret_notnull_
// #define _Check_return_
// #define _Outptr_result_maybenull_
// #define _In_reads_(X)
// #define _Inout_updates_all_(X)
// #define _Out_writes_bytes_all_(X)
// #define _Out_writes_all_(X)
// #define _Success_(X)
// #define _Outptr_result_buffer_maybenull_(X)
// #define ORT_ALL_ARGS_NONNULL __attribute__((nonnull))
// #else
// #include <specstrings.h>
// #define ORT_ALL_ARGS_NONNULL
// #endif

// #ifdef _WIN32
// Define ORT_DLL_IMPORT if your program is dynamically linked to Ort.
// dllexport is not used, we use a .def file.
// #ifdef ORT_DLL_IMPORT
// #define ORT_EXPORT __declspec(dllimport)
// #else
// #define ORT_EXPORT
// #endif
// #define ORT_API_CALL _stdcall
// #define ORT_MUST_USE_RESULT
// #define ORTCHAR_T wchar_t
// #else
// #define ORT_EXPORT
// #define ORT_API_CALL
// #define ORT_MUST_USE_RESULT __attribute__((warn_unused_result))
// #define ORTCHAR_T char
// #endif

// #ifndef ORT_TSTR
// #ifdef _WIN32
// #define ORT_TSTR(X) L##X
// #else
// #define ORT_TSTR(X) X
// #endif
// #endif

// Any pointer marked with _In_ or _Out_, cannot be NULL.

// Windows users should use unicode paths when possible to bypass the MAX_PATH limitation
// Every pointer marked with _In_ or _Out_, cannot be NULL. Caller should ensure that.
// for ReleaseXXX(...) functions, they can accept NULL pointer.

// #ifdef __cplusplus
// For any compiler with C++11 support, MSVC 2015 and greater, or Clang version supporting noexcept.
// Such complex condition is needed because compilers set __cplusplus value differently.
// #ifndef __has_feature
// #define __has_feature(x) 0
// #endif
// #if ((__cplusplus >= 201103L) || (_MSC_VER >= 1900) || (defined(__has_feature) && __has_feature(cxx_noexcept)))
// #define NO_EXCEPTION
// #else
// #define NO_EXCEPTION throw()
// #endif
// #else
// #define NO_EXCEPTION
// #endif

// Copied from TensorProto::DataType
// Currently, Ort doesn't support complex64, complex128
/** enum ONNXTensorElementDataType */
public static final int
  ONNX_TENSOR_ELEMENT_DATA_TYPE_UNDEFINED = 0,
  ONNX_TENSOR_ELEMENT_DATA_TYPE_FLOAT = 1,   // maps to c type float
  ONNX_TENSOR_ELEMENT_DATA_TYPE_UINT8 = 2,   // maps to c type uint8_t
  ONNX_TENSOR_ELEMENT_DATA_TYPE_INT8 = 3,    // maps to c type int8_t
  ONNX_TENSOR_ELEMENT_DATA_TYPE_UINT16 = 4,  // maps to c type uint16_t
  ONNX_TENSOR_ELEMENT_DATA_TYPE_INT16 = 5,   // maps to c type int16_t
  ONNX_TENSOR_ELEMENT_DATA_TYPE_INT32 = 6,   // maps to c type int32_t
  ONNX_TENSOR_ELEMENT_DATA_TYPE_INT64 = 7,   // maps to c type int64_t
  ONNX_TENSOR_ELEMENT_DATA_TYPE_STRING = 8,  // maps to c++ type std::string
  ONNX_TENSOR_ELEMENT_DATA_TYPE_BOOL = 9,
  ONNX_TENSOR_ELEMENT_DATA_TYPE_FLOAT16 = 10,
  ONNX_TENSOR_ELEMENT_DATA_TYPE_DOUBLE = 11,      // maps to c type double
  ONNX_TENSOR_ELEMENT_DATA_TYPE_UINT32 = 12,      // maps to c type uint32_t
  ONNX_TENSOR_ELEMENT_DATA_TYPE_UINT64 = 13,      // maps to c type uint64_t
  ONNX_TENSOR_ELEMENT_DATA_TYPE_COMPLEX64 = 14,   // complex with float32 real and imaginary components
  ONNX_TENSOR_ELEMENT_DATA_TYPE_COMPLEX128 = 15,  // complex with float64 real and imaginary components
  ONNX_TENSOR_ELEMENT_DATA_TYPE_BFLOAT16 = 16;     // Non-IEEE floating-point format based on IEEE754 single-precision

// Synced with onnx TypeProto oneof
/** enum ONNXType */
public static final int
  ONNX_TYPE_UNKNOWN = 0,
  ONNX_TYPE_TENSOR = 1,
  ONNX_TYPE_SEQUENCE = 2,
  ONNX_TYPE_MAP = 3,
  ONNX_TYPE_OPAQUE = 4,
  ONNX_TYPE_SPARSETENSOR = 5;

/** enum OrtLoggingLevel */
public static final int
  ORT_LOGGING_LEVEL_VERBOSE = 0,
  ORT_LOGGING_LEVEL_INFO = 1,
  ORT_LOGGING_LEVEL_WARNING = 2,
  ORT_LOGGING_LEVEL_ERROR = 3,
  ORT_LOGGING_LEVEL_FATAL = 4;

/** enum OrtErrorCode */
public static final int
  ORT_OK = 0,
  ORT_FAIL = 1,
  ORT_INVALID_ARGUMENT = 2,
  ORT_NO_SUCHFILE = 3,
  ORT_NO_MODEL = 4,
  ORT_ENGINE_ERROR = 5,
  ORT_RUNTIME_EXCEPTION = 6,
  ORT_INVALID_PROTOBUF = 7,
  ORT_MODEL_LOADED = 8,
  ORT_NOT_IMPLEMENTED = 9,
  ORT_INVALID_GRAPH = 10,
  ORT_EP_FAIL = 11;

// #define ORT_RUNTIME_CLASS(X)
//   struct Ort##X;
//   typedef struct Ort##X Ort##X;
// Targeting ../OrtEnv.java


// Targeting ../OrtStatus.java


// Targeting ../OrtMemoryInfo.java


// Targeting ../OrtIoBinding.java


// Targeting ../OrtSession.java


// Targeting ../OrtValue.java


// Targeting ../OrtRunOptions.java


// Targeting ../OrtTypeInfo.java


// Targeting ../OrtTensorTypeAndShapeInfo.java


// Targeting ../OrtSessionOptions.java


// Targeting ../OrtCustomOpDomain.java


// Targeting ../OrtMapTypeInfo.java


// Targeting ../OrtSequenceTypeInfo.java


// Targeting ../OrtModelMetadata.java


// Targeting ../OrtThreadPoolParams.java


// Targeting ../OrtThreadingOptions.java


// Targeting ../OrtArenaCfg.java



// #ifdef _WIN32
// #else
// #endif

// __VA_ARGS__ on Windows and Linux are different
// #define ORT_API(RETURN_TYPE, NAME, ...) ORT_EXPORT RETURN_TYPE ORT_API_CALL NAME(__VA_ARGS__) NO_EXCEPTION

// #define ORT_API_STATUS(NAME, ...)
//   ORT_EXPORT _Check_return_ _Ret_maybenull_ OrtStatusPtr ORT_API_CALL NAME(__VA_ARGS__) NO_EXCEPTION ORT_MUST_USE_RESULT

// XXX: Unfortunately, SAL annotations are known to not work with function pointers
// #define ORT_API2_STATUS(NAME, ...)
//   _Check_return_ _Ret_maybenull_ OrtStatusPtr(ORT_API_CALL* NAME)(__VA_ARGS__) NO_EXCEPTION ORT_MUST_USE_RESULT

// Used in *.cc files. Almost as same as ORT_API_STATUS, except without ORT_MUST_USE_RESULT and ORT_EXPORT
// #define ORT_API_STATUS_IMPL(NAME, ...)
//   _Check_return_ _Ret_maybenull_ OrtStatusPtr ORT_API_CALL NAME(__VA_ARGS__) NO_EXCEPTION

// #define ORT_CLASS_RELEASE(X) void(ORT_API_CALL * Release##X)(_Frees_ptr_opt_ Ort##X * input)
// Targeting ../OrtAllocator.java


// Targeting ../OrtLoggingFunction.java



// Set Graph optimization level.
// Refer https://github.com/microsoft/onnxruntime/blob/master/docs/ONNX_Runtime_Graph_Optimizations.md
// for in-depth undersrtanding of Graph Optimizations in ORT
/** enum GraphOptimizationLevel */
public static final int
  ORT_DISABLE_ALL = 0,
  ORT_ENABLE_BASIC = 1,
  ORT_ENABLE_EXTENDED = 2,
  ORT_ENABLE_ALL = 99;

/** enum ExecutionMode */
public static final int
  ORT_SEQUENTIAL = 0,
  ORT_PARALLEL = 1;

// Set the language projection, default is C, which means it will classify the language not in the list to C also.
/** enum OrtLanguageProjection */
public static final int
  ORT_PROJECTION_C = 0,  // default
  ORT_PROJECTION_CPLUSPLUS = 1,
  ORT_PROJECTION_CSHARP = 2,
  ORT_PROJECTION_PYTHON = 3,
  ORT_PROJECTION_JAVA = 4,
  ORT_PROJECTION_WINML = 5,
  ORT_PROJECTION_NODEJS = 6;
// Targeting ../OrtKernelInfo.java


// Targeting ../OrtKernelContext.java



/** enum OrtAllocatorType */
public static final int
  Invalid = -1,
  OrtDeviceAllocator = 0,
  OrtArenaAllocator = 1;

/**
 * memory types for allocator, exec provider specific types should be extended in each provider
 * Whenever this struct is updated, please also update the MakeKey function in onnxruntime/core/framework/execution_provider.cc
*/
/** enum OrtMemType */
public static final int
  OrtMemTypeCPUInput = -2,              // Any CPU memory used by non-CPU execution provider
  OrtMemTypeCPUOutput = -1,             // CPU accessible memory outputted by non-CPU execution provider, i.e. CUDA_PINNED
  OrtMemTypeCPU = OrtMemTypeCPUOutput,  // temporary CPU accessible memory allocated by non-CPU execution provider, i.e. CUDA_PINNED
  OrtMemTypeDefault = 0;                // the default allocator for execution provider

/** enum OrtCudnnConvAlgoSearch */
public static final int
  EXHAUSTIVE = 0,  // expensive exhaustive benchmarking using cudnnFindConvolutionForwardAlgorithmEx
  HEURISTIC = 1,   // lightweight heuristic based search using cudnnGetConvolutionForwardAlgorithm_v7
  DEFAULT = 2;     // default algorithm using CUDNN_CONVOLUTION_FWD_ALGO_IMPLICIT_PRECOMP_GEMM
// Targeting ../OrtCUDAProviderOptions.java


// Targeting ../OrtOpenVINOProviderOptions.java


// Targeting ../OrtApiBase.java



public static native @Const OrtApiBase OrtGetApiBase();
// Targeting ../OrtApi.java



/*
 * Steps to use a custom op:
 *   1 Create an OrtCustomOpDomain with the domain name used by the custom ops
 *   2 Create an OrtCustomOp structure for each op and add them to the domain
 *   3 Call OrtAddCustomOpDomain to add the custom domain of ops to the session options
*/
// #define OrtCustomOpApi OrtApi
// Targeting ../OrtCustomOp.java



/*
 * END EXPERIMENTAL
*/

// #ifdef __cplusplus
// #endif


// Parsed from onnxruntime/core/session/onnxruntime_cxx_api.h

// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

// Summary: The Ort C++ API is a header only wrapper around the Ort C API.
//
// The C++ API simplifies usage by returning values directly instead of error codes, throwing exceptions on errors
// and automatically releasing resources in the destructors.
//
// Each of the C++ wrapper classes holds only a pointer to the C internal object. Treat them like smart pointers.
// To create an empty object, pass 'nullptr' to the constructor (for example, Env e{nullptr};).
//
// Only move assignment between objects is allowed, there are no copy constructors. Some objects have explicit 'Clone'
// methods for this purpose.

// #pragma once
// #include "onnxruntime_c_api.h"
// #include <cstddef>
// #include <array>
// #include <memory>
// #include <stdexcept>
// #include <string>
// #include <vector>
// #include <utility>
// #include <type_traits>

// #ifdef ORT_NO_EXCEPTIONS
// #include <iostream>
// #endif
// Targeting ../OrtException.java



// #ifdef ORT_NO_EXCEPTIONS
// #define ORT_CXX_API_THROW(string, code)
//   do {
//     std::cerr << Ort::Exception(string, code)
//                      .what()
//               << std::endl;
//     abort();
//   } while (false)
// #else
// #define ORT_CXX_API_THROW(string, code)
//   throw Ort::Exception(string, code)
// #endif

// This is used internally by the C++ API. This class holds the global variable that points to the OrtApi, it's in a template so that we can define a global variable in a header and make
// it transparent to the users of the API.

// If macro ORT_API_MANUAL_INIT is defined, no static initialization will be performed. Instead, user must call InitApi() before using it.


// #endif

// This returns a reference to the OrtApi interface in use, in case someone wants to use the C API functions
@Namespace("Ort") public static native @Const @ByRef OrtApi GetApi();

// This is a C++ wrapper for GetAvailableProviders() C API and returns
// a vector of strings representing the available execution providers.
@Namespace("Ort") public static native @ByVal StringVector GetAvailableProviders();

// This is used internally by the C++ API. This macro is to make it easy to generate overloaded methods for all of the various OrtRelease* functions for every Ort* type
// This can't be done in the C API since C doesn't have function overloading.
// #define ORT_DEFINE_RELEASE(NAME)
//   inline void OrtRelease(Ort##NAME* ptr) { GetApi().Release##NAME(ptr); }

@Namespace("Ort") public static native void OrtRelease(OrtAllocator ptr);
@Namespace("Ort") public static native void OrtRelease(OrtMemoryInfo ptr);
@Namespace("Ort") public static native void OrtRelease(OrtCustomOpDomain ptr);
@Namespace("Ort") public static native void OrtRelease(OrtEnv ptr);
@Namespace("Ort") public static native void OrtRelease(OrtRunOptions ptr);
@Namespace("Ort") public static native void OrtRelease(OrtSession ptr);
@Namespace("Ort") public static native void OrtRelease(OrtSessionOptions ptr);
@Namespace("Ort") public static native void OrtRelease(OrtTensorTypeAndShapeInfo ptr);
@Namespace("Ort") public static native void OrtRelease(OrtSequenceTypeInfo ptr);
@Namespace("Ort") public static native void OrtRelease(OrtMapTypeInfo ptr);
@Namespace("Ort") public static native void OrtRelease(OrtTypeInfo ptr);
@Namespace("Ort") public static native void OrtRelease(OrtValue ptr);
@Namespace("Ort") public static native void OrtRelease(OrtModelMetadata ptr);
@Namespace("Ort") public static native void OrtRelease(OrtThreadingOptions ptr);
@Namespace("Ort") public static native void OrtRelease(OrtIoBinding ptr);
@Namespace("Ort") public static native void OrtRelease(OrtArenaCfg ptr);
// Targeting ../Float16_t.java


// Targeting ../BFloat16_t.java


// Targeting ../BaseArenaCfg.java


// Targeting ../BaseAllocator.java


// Targeting ../BaseIoBinding.java


// Targeting ../BaseMemoryInfo.java


// Targeting ../BaseModelMetadata.java


// Targeting ../BaseCustomOpDomain.java


// Targeting ../BaseEnv.java


// Targeting ../BaseRunOptions.java


// Targeting ../BaseSession.java


// Targeting ../BaseSessionOptions.java


// Targeting ../BaseTensorTypeAndShapeInfo.java


// Targeting ../BaseSequenceTypeInfo.java


// Targeting ../BaseMapTypeInfo.java


// Targeting ../BaseTypeInfo.java


// Targeting ../BaseValue.java


// Targeting ../UnownedTensorTypeAndShapeInfo.java


// Targeting ../UnownedSequenceTypeInfo.java


// Targeting ../UnownedMapTypeInfo.java


// Targeting ../Env.java


// Targeting ../CustomOpDomain.java


// Targeting ../RunOptions.java


// Targeting ../SessionOptions.java


// Targeting ../ModelMetadata.java


// Targeting ../Session.java


// Targeting ../TensorTypeAndShapeInfo.java


// Targeting ../SequenceTypeInfo.java


// Targeting ../MapTypeInfo.java


// Targeting ../TypeInfo.java


// Targeting ../Value.java


// Targeting ../MemoryAllocation.java


// Targeting ../AllocatorWithDefaultOptions.java


// Targeting ../UnownedMemoryInfo.java


// Targeting ../MemoryInfo.java


// Targeting ../Allocator.java


// Targeting ../IoBinding.java


// Targeting ../ArenaCfg.java


// Targeting ../CustomOpApi.java



  // namespace Ort

// #include "onnxruntime_cxx_inline.h"


// Parsed from onnxruntime/core/providers/cuda/cuda_provider_factory.h

// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

// #include "onnxruntime_c_api.h"

// #ifdef __cplusplus
// #endif

/**
 * @param device_id cuda device id, starts from zero.
 */
public static native @Cast("OrtStatusPtr") @Platform(extension="-gpu") OrtStatus OrtSessionOptionsAppendExecutionProvider_CUDA( OrtSessionOptions options, int device_id);

// #ifdef __cplusplus
// #endif


// Parsed from onnxruntime/core/providers/dnnl/dnnl_provider_factory.h

// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

// #include "onnxruntime_c_api.h"

// #ifdef __cplusplus
// #endif

/**
 * @param use_arena zero: false. non-zero: true.
 */
public static native @Cast("OrtStatusPtr") OrtStatus OrtSessionOptionsAppendExecutionProvider_Dnnl( OrtSessionOptions options, int use_arena);

// #ifdef __cplusplus
// #endif


}
