// Targeted by JavaCPP version 1.4.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.javacpp;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.opencv_core.*;
import static org.bytedeco.javacpp.opencv_imgproc.*;
import static org.bytedeco.javacpp.opencv_cudaarithm.*;

public class opencv_cudafilters extends org.bytedeco.javacpp.presets.opencv_cudafilters {
    static { Loader.load(); }

// Parsed from <opencv2/cudafilters.hpp>

/*M///////////////////////////////////////////////////////////////////////////////////////
//
//  IMPORTANT: READ BEFORE DOWNLOADING, COPYING, INSTALLING OR USING.
//
//  By downloading, copying, installing or using the software you agree to this license.
//  If you do not agree to this license, do not download, install,
//  copy or use the software.
//
//
//                           License Agreement
//                For Open Source Computer Vision Library
//
// Copyright (C) 2000-2008, Intel Corporation, all rights reserved.
// Copyright (C) 2009, Willow Garage Inc., all rights reserved.
// Third party copyrights are property of their respective owners.
//
// Redistribution and use in source and binary forms, with or without modification,
// are permitted provided that the following conditions are met:
//
//   * Redistribution's of source code must retain the above copyright notice,
//     this list of conditions and the following disclaimer.
//
//   * Redistribution's in binary form must reproduce the above copyright notice,
//     this list of conditions and the following disclaimer in the documentation
//     and/or other materials provided with the distribution.
//
//   * The name of the copyright holders may not be used to endorse or promote products
//     derived from this software without specific prior written permission.
//
// This software is provided by the copyright holders and contributors "as is" and
// any express or implied warranties, including, but not limited to, the implied
// warranties of merchantability and fitness for a particular purpose are disclaimed.
// In no event shall the Intel Corporation or contributors be liable for any direct,
// indirect, incidental, special, exemplary, or consequential damages
// (including, but not limited to, procurement of substitute goods or services;
// loss of use, data, or profits; or business interruption) however caused
// and on any theory of liability, whether in contract, strict liability,
// or tort (including negligence or otherwise) arising in any way out of
// the use of this software, even if advised of the possibility of such damage.
//
//M*/

// #ifndef OPENCV_CUDAFILTERS_HPP
// #define OPENCV_CUDAFILTERS_HPP

// #ifndef __cplusplus
// #endif

// #include "opencv2/core/cuda.hpp"
// #include "opencv2/imgproc.hpp"

/**
  \addtogroup cuda
  \{
    \defgroup cudafilters Image Filtering
<p>
Functions and classes described in this section are used to perform various linear or non-linear
filtering operations on 2D images.
<p>
\note
   -   An example containing all basic morphology operators like erode and dilate can be found at
        opencv_source_code/samples/gpu/morphology.cpp
  <p>
  \}
 */

/** \addtogroup cudafilters
 *  \{
<p>
/** \brief Common interface for all CUDA filters :
 */
@Namespace("cv::cuda") public static class Filter extends Algorithm {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Filter(Pointer p) { super(p); }

    /** \brief Applies the specified filter to the image.
    <p>
    @param src Input image.
    @param dst Output image.
    @param stream Stream for the asynchronous version.
     */
    public native void apply(@ByVal Mat src, @ByVal Mat dst, @ByRef(nullValue = "cv::cuda::Stream::Null()") Stream stream);
    public native void apply(@ByVal Mat src, @ByVal Mat dst);
    public native void apply(@ByVal UMat src, @ByVal UMat dst, @ByRef(nullValue = "cv::cuda::Stream::Null()") Stream stream);
    public native void apply(@ByVal UMat src, @ByVal UMat dst);
    public native void apply(@ByVal GpuMat src, @ByVal GpuMat dst, @ByRef(nullValue = "cv::cuda::Stream::Null()") Stream stream);
    public native void apply(@ByVal GpuMat src, @ByVal GpuMat dst);
}

////////////////////////////////////////////////////////////////////////////////////////////////////
// Box Filter

/** \brief Creates a normalized 2D box filter.
<p>
@param srcType Input image type. Only CV_8UC1, CV_8UC4 and CV_32FC1 are supported for now.
@param dstType Output image type. Only the same type as src is supported for now.
@param ksize Kernel size.
@param anchor Anchor point. The default value Point(-1, -1) means that the anchor is at the kernel
center.
@param borderMode Pixel extrapolation method. For details, see borderInterpolate .
@param borderVal Default border value.
<p>
\sa boxFilter
 */
@Namespace("cv::cuda") public static native @Ptr Filter createBoxFilter(int srcType, int dstType, @ByVal Size ksize, @ByVal(nullValue = "cv::Point(-1,-1)") Point anchor,
                                       int borderMode/*=cv::BORDER_DEFAULT*/, @ByVal(nullValue = "cv::Scalar::all(0)") Scalar borderVal);
@Namespace("cv::cuda") public static native @Ptr Filter createBoxFilter(int srcType, int dstType, @ByVal Size ksize);

////////////////////////////////////////////////////////////////////////////////////////////////////
// Linear Filter

/** \brief Creates a non-separable linear 2D filter.
<p>
@param srcType Input image type. Supports CV_8U , CV_16U and CV_32F one and four channel image.
@param dstType Output image type. Only the same type as src is supported for now.
@param kernel 2D array of filter coefficients.
@param anchor Anchor point. The default value Point(-1, -1) means that the anchor is at the kernel
center.
@param borderMode Pixel extrapolation method. For details, see borderInterpolate .
@param borderVal Default border value.
<p>
\sa filter2D
 */
@Namespace("cv::cuda") public static native @Ptr Filter createLinearFilter(int srcType, int dstType, @ByVal Mat kernel, @ByVal(nullValue = "cv::Point(-1,-1)") Point anchor,
                                          int borderMode/*=cv::BORDER_DEFAULT*/, @ByVal(nullValue = "cv::Scalar::all(0)") Scalar borderVal);
@Namespace("cv::cuda") public static native @Ptr Filter createLinearFilter(int srcType, int dstType, @ByVal Mat kernel);
@Namespace("cv::cuda") public static native @Ptr Filter createLinearFilter(int srcType, int dstType, @ByVal UMat kernel, @ByVal(nullValue = "cv::Point(-1,-1)") Point anchor,
                                          int borderMode/*=cv::BORDER_DEFAULT*/, @ByVal(nullValue = "cv::Scalar::all(0)") Scalar borderVal);
@Namespace("cv::cuda") public static native @Ptr Filter createLinearFilter(int srcType, int dstType, @ByVal UMat kernel);
@Namespace("cv::cuda") public static native @Ptr Filter createLinearFilter(int srcType, int dstType, @ByVal GpuMat kernel, @ByVal(nullValue = "cv::Point(-1,-1)") Point anchor,
                                          int borderMode/*=cv::BORDER_DEFAULT*/, @ByVal(nullValue = "cv::Scalar::all(0)") Scalar borderVal);
@Namespace("cv::cuda") public static native @Ptr Filter createLinearFilter(int srcType, int dstType, @ByVal GpuMat kernel);

////////////////////////////////////////////////////////////////////////////////////////////////////
// Laplacian Filter

/** \brief Creates a Laplacian operator.
<p>
@param srcType Input image type. Supports CV_8U , CV_16U and CV_32F one and four channel image.
@param dstType Output image type. Only the same type as src is supported for now.
@param ksize Aperture size used to compute the second-derivative filters (see getDerivKernels). It
must be positive and odd. Only ksize = 1 and ksize = 3 are supported.
@param scale Optional scale factor for the computed Laplacian values. By default, no scaling is
applied (see getDerivKernels ).
@param borderMode Pixel extrapolation method. For details, see borderInterpolate .
@param borderVal Default border value.
<p>
\sa Laplacian
 */
@Namespace("cv::cuda") public static native @Ptr Filter createLaplacianFilter(int srcType, int dstType, int ksize/*=1*/, double scale/*=1*/,
                                             int borderMode/*=cv::BORDER_DEFAULT*/, @ByVal(nullValue = "cv::Scalar::all(0)") Scalar borderVal);
@Namespace("cv::cuda") public static native @Ptr Filter createLaplacianFilter(int srcType, int dstType);

////////////////////////////////////////////////////////////////////////////////////////////////////
// Separable Linear Filter

/** \brief Creates a separable linear filter.
<p>
@param srcType Source array type.
@param dstType Destination array type.
@param rowKernel Horizontal filter coefficients. Support kernels with size \<= 32 .
@param columnKernel Vertical filter coefficients. Support kernels with size \<= 32 .
@param anchor Anchor position within the kernel. Negative values mean that anchor is positioned at
the aperture center.
@param rowBorderMode Pixel extrapolation method in the vertical direction For details, see
borderInterpolate.
@param columnBorderMode Pixel extrapolation method in the horizontal direction.
<p>
\sa sepFilter2D
 */
@Namespace("cv::cuda") public static native @Ptr Filter createSeparableLinearFilter(int srcType, int dstType, @ByVal Mat rowKernel, @ByVal Mat columnKernel,
                                                   @ByVal(nullValue = "cv::Point(-1,-1)") Point anchor, int rowBorderMode/*=cv::BORDER_DEFAULT*/, int columnBorderMode/*=-1*/);
@Namespace("cv::cuda") public static native @Ptr Filter createSeparableLinearFilter(int srcType, int dstType, @ByVal Mat rowKernel, @ByVal Mat columnKernel);
@Namespace("cv::cuda") public static native @Ptr Filter createSeparableLinearFilter(int srcType, int dstType, @ByVal UMat rowKernel, @ByVal UMat columnKernel,
                                                   @ByVal(nullValue = "cv::Point(-1,-1)") Point anchor, int rowBorderMode/*=cv::BORDER_DEFAULT*/, int columnBorderMode/*=-1*/);
@Namespace("cv::cuda") public static native @Ptr Filter createSeparableLinearFilter(int srcType, int dstType, @ByVal UMat rowKernel, @ByVal UMat columnKernel);
@Namespace("cv::cuda") public static native @Ptr Filter createSeparableLinearFilter(int srcType, int dstType, @ByVal GpuMat rowKernel, @ByVal GpuMat columnKernel,
                                                   @ByVal(nullValue = "cv::Point(-1,-1)") Point anchor, int rowBorderMode/*=cv::BORDER_DEFAULT*/, int columnBorderMode/*=-1*/);
@Namespace("cv::cuda") public static native @Ptr Filter createSeparableLinearFilter(int srcType, int dstType, @ByVal GpuMat rowKernel, @ByVal GpuMat columnKernel);

////////////////////////////////////////////////////////////////////////////////////////////////////
// Deriv Filter

/** \brief Creates a generalized Deriv operator.
<p>
@param srcType Source image type.
@param dstType Destination array type.
@param dx Derivative order in respect of x.
@param dy Derivative order in respect of y.
@param ksize Aperture size. See getDerivKernels for details.
@param normalize Flag indicating whether to normalize (scale down) the filter coefficients or not.
See getDerivKernels for details.
@param scale Optional scale factor for the computed derivative values. By default, no scaling is
applied. For details, see getDerivKernels .
@param rowBorderMode Pixel extrapolation method in the vertical direction. For details, see
borderInterpolate.
@param columnBorderMode Pixel extrapolation method in the horizontal direction.
 */
@Namespace("cv::cuda") public static native @Ptr Filter createDerivFilter(int srcType, int dstType, int dx, int dy,
                                         int ksize, @Cast("bool") boolean normalize/*=false*/, double scale/*=1*/,
                                         int rowBorderMode/*=cv::BORDER_DEFAULT*/, int columnBorderMode/*=-1*/);
@Namespace("cv::cuda") public static native @Ptr Filter createDerivFilter(int srcType, int dstType, int dx, int dy,
                                         int ksize);

/** \brief Creates a Sobel operator.
<p>
@param srcType Source image type.
@param dstType Destination array type.
@param dx Derivative order in respect of x.
@param dy Derivative order in respect of y.
@param ksize Size of the extended Sobel kernel. Possible values are 1, 3, 5 or 7.
@param scale Optional scale factor for the computed derivative values. By default, no scaling is
applied. For details, see getDerivKernels .
@param rowBorderMode Pixel extrapolation method in the vertical direction. For details, see
borderInterpolate.
@param columnBorderMode Pixel extrapolation method in the horizontal direction.
<p>
\sa Sobel
 */
@Namespace("cv::cuda") public static native @Ptr Filter createSobelFilter(int srcType, int dstType, int dx, int dy, int ksize/*=3*/,
                                         double scale/*=1*/, int rowBorderMode/*=cv::BORDER_DEFAULT*/, int columnBorderMode/*=-1*/);
@Namespace("cv::cuda") public static native @Ptr Filter createSobelFilter(int srcType, int dstType, int dx, int dy);

/** \brief Creates a vertical or horizontal Scharr operator.
<p>
@param srcType Source image type.
@param dstType Destination array type.
@param dx Order of the derivative x.
@param dy Order of the derivative y.
@param scale Optional scale factor for the computed derivative values. By default, no scaling is
applied. See getDerivKernels for details.
@param rowBorderMode Pixel extrapolation method in the vertical direction. For details, see
borderInterpolate.
@param columnBorderMode Pixel extrapolation method in the horizontal direction.
<p>
\sa Scharr
 */
@Namespace("cv::cuda") public static native @Ptr Filter createScharrFilter(int srcType, int dstType, int dx, int dy,
                                          double scale/*=1*/, int rowBorderMode/*=cv::BORDER_DEFAULT*/, int columnBorderMode/*=-1*/);
@Namespace("cv::cuda") public static native @Ptr Filter createScharrFilter(int srcType, int dstType, int dx, int dy);

////////////////////////////////////////////////////////////////////////////////////////////////////
// Gaussian Filter

/** \brief Creates a Gaussian filter.
<p>
@param srcType Source image type.
@param dstType Destination array type.
@param ksize Aperture size. See getGaussianKernel for details.
@param sigma1 Gaussian sigma in the horizontal direction. See getGaussianKernel for details.
@param sigma2 Gaussian sigma in the vertical direction. If 0, then
\f$\texttt{sigma2}\leftarrow\texttt{sigma1}\f$ .
@param rowBorderMode Pixel extrapolation method in the vertical direction. For details, see
borderInterpolate.
@param columnBorderMode Pixel extrapolation method in the horizontal direction.
<p>
\sa GaussianBlur
 */
@Namespace("cv::cuda") public static native @Ptr Filter createGaussianFilter(int srcType, int dstType, @ByVal Size ksize,
                                            double sigma1, double sigma2/*=0*/,
                                            int rowBorderMode/*=cv::BORDER_DEFAULT*/, int columnBorderMode/*=-1*/);
@Namespace("cv::cuda") public static native @Ptr Filter createGaussianFilter(int srcType, int dstType, @ByVal Size ksize,
                                            double sigma1);

////////////////////////////////////////////////////////////////////////////////////////////////////
// Morphology Filter

/** \brief Creates a 2D morphological filter.
<p>
@param op Type of morphological operation. The following types are possible:
-   **MORPH_ERODE** erode
-   **MORPH_DILATE** dilate
-   **MORPH_OPEN** opening
-   **MORPH_CLOSE** closing
-   **MORPH_GRADIENT** morphological gradient
-   **MORPH_TOPHAT** "top hat"
-   **MORPH_BLACKHAT** "black hat"
@param srcType Input/output image type. Only CV_8UC1, CV_8UC4, CV_32FC1 and CV_32FC4 are supported.
@param kernel 2D 8-bit structuring element for the morphological operation.
@param anchor Anchor position within the structuring element. Negative values mean that the anchor
is at the center.
@param iterations Number of times erosion and dilation to be applied.
<p>
\sa morphologyEx
 */
@Namespace("cv::cuda") public static native @Ptr Filter createMorphologyFilter(int op, int srcType, @ByVal Mat kernel, @ByVal(nullValue = "cv::Point(-1, -1)") Point anchor, int iterations/*=1*/);
@Namespace("cv::cuda") public static native @Ptr Filter createMorphologyFilter(int op, int srcType, @ByVal Mat kernel);
@Namespace("cv::cuda") public static native @Ptr Filter createMorphologyFilter(int op, int srcType, @ByVal UMat kernel, @ByVal(nullValue = "cv::Point(-1, -1)") Point anchor, int iterations/*=1*/);
@Namespace("cv::cuda") public static native @Ptr Filter createMorphologyFilter(int op, int srcType, @ByVal UMat kernel);
@Namespace("cv::cuda") public static native @Ptr Filter createMorphologyFilter(int op, int srcType, @ByVal GpuMat kernel, @ByVal(nullValue = "cv::Point(-1, -1)") Point anchor, int iterations/*=1*/);
@Namespace("cv::cuda") public static native @Ptr Filter createMorphologyFilter(int op, int srcType, @ByVal GpuMat kernel);

////////////////////////////////////////////////////////////////////////////////////////////////////
// Image Rank Filter

/** \brief Creates the maximum filter.
<p>
@param srcType Input/output image type. Only CV_8UC1 and CV_8UC4 are supported.
@param ksize Kernel size.
@param anchor Anchor point. The default value (-1) means that the anchor is at the kernel center.
@param borderMode Pixel extrapolation method. For details, see borderInterpolate .
@param borderVal Default border value.
 */
@Namespace("cv::cuda") public static native @Ptr Filter createBoxMaxFilter(int srcType, @ByVal Size ksize,
                                          @ByVal(nullValue = "cv::Point(-1, -1)") Point anchor,
                                          int borderMode/*=cv::BORDER_DEFAULT*/, @ByVal(nullValue = "cv::Scalar::all(0)") Scalar borderVal);
@Namespace("cv::cuda") public static native @Ptr Filter createBoxMaxFilter(int srcType, @ByVal Size ksize);

/** \brief Creates the minimum filter.
<p>
@param srcType Input/output image type. Only CV_8UC1 and CV_8UC4 are supported.
@param ksize Kernel size.
@param anchor Anchor point. The default value (-1) means that the anchor is at the kernel center.
@param borderMode Pixel extrapolation method. For details, see borderInterpolate .
@param borderVal Default border value.
 */
@Namespace("cv::cuda") public static native @Ptr Filter createBoxMinFilter(int srcType, @ByVal Size ksize,
                                          @ByVal(nullValue = "cv::Point(-1, -1)") Point anchor,
                                          int borderMode/*=cv::BORDER_DEFAULT*/, @ByVal(nullValue = "cv::Scalar::all(0)") Scalar borderVal);
@Namespace("cv::cuda") public static native @Ptr Filter createBoxMinFilter(int srcType, @ByVal Size ksize);

////////////////////////////////////////////////////////////////////////////////////////////////////
// 1D Sum Filter

/** \brief Creates a horizontal 1D box filter.
<p>
@param srcType Input image type. Only CV_8UC1 type is supported for now.
@param dstType Output image type. Only CV_32FC1 type is supported for now.
@param ksize Kernel size.
@param anchor Anchor point. The default value (-1) means that the anchor is at the kernel center.
@param borderMode Pixel extrapolation method. For details, see borderInterpolate .
@param borderVal Default border value.
 */
@Namespace("cv::cuda") public static native @Ptr Filter createRowSumFilter(int srcType, int dstType, int ksize, int anchor/*=-1*/, int borderMode/*=cv::BORDER_DEFAULT*/, @ByVal(nullValue = "cv::Scalar::all(0)") Scalar borderVal);
@Namespace("cv::cuda") public static native @Ptr Filter createRowSumFilter(int srcType, int dstType, int ksize);

/** \brief Creates a vertical 1D box filter.
<p>
@param srcType Input image type. Only CV_8UC1 type is supported for now.
@param dstType Output image type. Only CV_32FC1 type is supported for now.
@param ksize Kernel size.
@param anchor Anchor point. The default value (-1) means that the anchor is at the kernel center.
@param borderMode Pixel extrapolation method. For details, see borderInterpolate .
@param borderVal Default border value.
 */
@Namespace("cv::cuda") public static native @Ptr Filter createColumnSumFilter(int srcType, int dstType, int ksize, int anchor/*=-1*/, int borderMode/*=cv::BORDER_DEFAULT*/, @ByVal(nullValue = "cv::Scalar::all(0)") Scalar borderVal);
@Namespace("cv::cuda") public static native @Ptr Filter createColumnSumFilter(int srcType, int dstType, int ksize);

/** \}
<p>
///////////////////////////// Median Filtering //////////////////////////////
<p>
/** \brief Performs median filtering for each point of the source image.
<p>
@param srcType type of of source image. Only CV_8UC1 images are supported for now.
@param windowSize Size of the kernerl used for the filtering. Uses a (windowSize x windowSize) filter.
@param partition Specifies the parallel granularity of the workload. This parameter should be used GPU experts when optimizing performance.
<p>
Outputs an image that has been filtered using median-filtering formulation.
 */
@Namespace("cv::cuda") public static native @Ptr Filter createMedianFilter(int srcType, int windowSize, int partition/*=128*/);
@Namespace("cv::cuda") public static native @Ptr Filter createMedianFilter(int srcType, int windowSize);

 // namespace cv { namespace cuda {

// #endif /* OPENCV_CUDAFILTERS_HPP */


}
