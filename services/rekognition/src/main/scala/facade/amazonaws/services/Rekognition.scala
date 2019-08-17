package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import io.scalajs.nodejs
import facade.amazonaws._

package object rekognition {
  type Attribute                   = String
  type Attributes                  = js.Array[Attribute]
  type CelebrityList               = js.Array[Celebrity]
  type CelebrityRecognitionSortBy  = String
  type CelebrityRecognitions       = js.Array[CelebrityRecognition]
  type ClientRequestToken          = String
  type CollectionId                = String
  type CollectionIdList            = js.Array[CollectionId]
  type CompareFacesMatchList       = js.Array[CompareFacesMatch]
  type CompareFacesUnmatchList     = js.Array[ComparedFace]
  type ComparedFaceList            = js.Array[ComparedFace]
  type ContentModerationDetections = js.Array[ContentModerationDetection]
  type ContentModerationSortBy     = String
  type DateTime                    = js.Date
  type Degree                      = Float
  type EmotionName                 = String
  type Emotions                    = js.Array[Emotion]
  type ExternalImageId             = String
  type FaceAttributes              = String
  type FaceDetailList              = js.Array[FaceDetail]
  type FaceDetections              = js.Array[FaceDetection]
  type FaceId                      = String
  type FaceIdList                  = js.Array[FaceId]
  type FaceList                    = js.Array[Face]
  type FaceMatchList               = js.Array[FaceMatch]
  type FaceModelVersionList        = js.Array[String]
  type FaceRecordList              = js.Array[FaceRecord]
  type FaceSearchSortBy            = String
  type GenderType                  = String
  type ImageBlob =
    nodejs.buffer.Buffer | nodejs.stream.Readable | js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type ImageId               = String
  type Instances             = js.Array[Instance]
  type JobId                 = String
  type JobTag                = String
  type KinesisDataArn        = String
  type KinesisVideoArn       = String
  type LabelDetectionSortBy  = String
  type LabelDetections       = js.Array[LabelDetection]
  type Labels                = js.Array[Label]
  type LandmarkType          = String
  type Landmarks             = js.Array[Landmark]
  type MaxFaces              = Int
  type MaxFacesToIndex       = Int
  type MaxResults            = Int
  type ModerationLabels      = js.Array[ModerationLabel]
  type OrientationCorrection = String
  type PageSize              = Int
  type PaginationToken       = String
  type Parents               = js.Array[Parent]
  type Percent               = Float
  type PersonDetections      = js.Array[PersonDetection]
  type PersonIndex           = Double
  type PersonMatches         = js.Array[PersonMatch]
  type PersonTrackingSortBy  = String
  type Polygon               = js.Array[Point]
  type QualityFilter         = String
  type Reason                = String
  type Reasons               = js.Array[Reason]
  type RekognitionUniqueId   = String
  type RoleArn               = String
  type S3Bucket              = String
  type S3ObjectName          = String
  type S3ObjectVersion       = String
  type SNSTopicArn           = String
  type StatusMessage         = String
  type StreamProcessorArn    = String
  type StreamProcessorList   = js.Array[StreamProcessor]
  type StreamProcessorName   = String
  type StreamProcessorStatus = String
  type TextDetectionList     = js.Array[TextDetection]
  type TextTypes             = String
  type Timestamp             = Double
  type UInteger              = Int
  type ULong                 = Double
  type UnindexedFaces        = js.Array[UnindexedFace]
  type Url                   = String
  type Urls                  = js.Array[Url]
  type VideoJobStatus        = String

  implicit final class RekognitionOps(val service: Rekognition) extends AnyVal {

    def compareFacesFuture(params: CompareFacesRequest): Future[CompareFacesResponse] =
      service.compareFaces(params).promise.toFuture
    def createCollectionFuture(params: CreateCollectionRequest): Future[CreateCollectionResponse] =
      service.createCollection(params).promise.toFuture
    def createStreamProcessorFuture(params: CreateStreamProcessorRequest): Future[CreateStreamProcessorResponse] =
      service.createStreamProcessor(params).promise.toFuture
    def deleteCollectionFuture(params: DeleteCollectionRequest): Future[DeleteCollectionResponse] =
      service.deleteCollection(params).promise.toFuture
    def deleteFacesFuture(params: DeleteFacesRequest): Future[DeleteFacesResponse] =
      service.deleteFaces(params).promise.toFuture
    def deleteStreamProcessorFuture(params: DeleteStreamProcessorRequest): Future[DeleteStreamProcessorResponse] =
      service.deleteStreamProcessor(params).promise.toFuture
    def describeCollectionFuture(params: DescribeCollectionRequest): Future[DescribeCollectionResponse] =
      service.describeCollection(params).promise.toFuture
    def describeStreamProcessorFuture(params: DescribeStreamProcessorRequest): Future[DescribeStreamProcessorResponse] =
      service.describeStreamProcessor(params).promise.toFuture
    def detectFacesFuture(params: DetectFacesRequest): Future[DetectFacesResponse] =
      service.detectFaces(params).promise.toFuture
    def detectLabelsFuture(params: DetectLabelsRequest): Future[DetectLabelsResponse] =
      service.detectLabels(params).promise.toFuture
    def detectModerationLabelsFuture(params: DetectModerationLabelsRequest): Future[DetectModerationLabelsResponse] =
      service.detectModerationLabels(params).promise.toFuture
    def detectTextFuture(params: DetectTextRequest): Future[DetectTextResponse] =
      service.detectText(params).promise.toFuture
    def getCelebrityInfoFuture(params: GetCelebrityInfoRequest): Future[GetCelebrityInfoResponse] =
      service.getCelebrityInfo(params).promise.toFuture
    def getCelebrityRecognitionFuture(params: GetCelebrityRecognitionRequest): Future[GetCelebrityRecognitionResponse] =
      service.getCelebrityRecognition(params).promise.toFuture
    def getContentModerationFuture(params: GetContentModerationRequest): Future[GetContentModerationResponse] =
      service.getContentModeration(params).promise.toFuture
    def getFaceDetectionFuture(params: GetFaceDetectionRequest): Future[GetFaceDetectionResponse] =
      service.getFaceDetection(params).promise.toFuture
    def getFaceSearchFuture(params: GetFaceSearchRequest): Future[GetFaceSearchResponse] =
      service.getFaceSearch(params).promise.toFuture
    def getLabelDetectionFuture(params: GetLabelDetectionRequest): Future[GetLabelDetectionResponse] =
      service.getLabelDetection(params).promise.toFuture
    def getPersonTrackingFuture(params: GetPersonTrackingRequest): Future[GetPersonTrackingResponse] =
      service.getPersonTracking(params).promise.toFuture
    def indexFacesFuture(params: IndexFacesRequest): Future[IndexFacesResponse] =
      service.indexFaces(params).promise.toFuture
    def listCollectionsFuture(params: ListCollectionsRequest): Future[ListCollectionsResponse] =
      service.listCollections(params).promise.toFuture
    def listFacesFuture(params: ListFacesRequest): Future[ListFacesResponse] =
      service.listFaces(params).promise.toFuture
    def listStreamProcessorsFuture(params: ListStreamProcessorsRequest): Future[ListStreamProcessorsResponse] =
      service.listStreamProcessors(params).promise.toFuture
    def recognizeCelebritiesFuture(params: RecognizeCelebritiesRequest): Future[RecognizeCelebritiesResponse] =
      service.recognizeCelebrities(params).promise.toFuture
    def searchFacesByImageFuture(params: SearchFacesByImageRequest): Future[SearchFacesByImageResponse] =
      service.searchFacesByImage(params).promise.toFuture
    def searchFacesFuture(params: SearchFacesRequest): Future[SearchFacesResponse] =
      service.searchFaces(params).promise.toFuture
    def startCelebrityRecognitionFuture(
        params: StartCelebrityRecognitionRequest
    ): Future[StartCelebrityRecognitionResponse] = service.startCelebrityRecognition(params).promise.toFuture
    def startContentModerationFuture(params: StartContentModerationRequest): Future[StartContentModerationResponse] =
      service.startContentModeration(params).promise.toFuture
    def startFaceDetectionFuture(params: StartFaceDetectionRequest): Future[StartFaceDetectionResponse] =
      service.startFaceDetection(params).promise.toFuture
    def startFaceSearchFuture(params: StartFaceSearchRequest): Future[StartFaceSearchResponse] =
      service.startFaceSearch(params).promise.toFuture
    def startLabelDetectionFuture(params: StartLabelDetectionRequest): Future[StartLabelDetectionResponse] =
      service.startLabelDetection(params).promise.toFuture
    def startPersonTrackingFuture(params: StartPersonTrackingRequest): Future[StartPersonTrackingResponse] =
      service.startPersonTracking(params).promise.toFuture
    def startStreamProcessorFuture(params: StartStreamProcessorRequest): Future[StartStreamProcessorResponse] =
      service.startStreamProcessor(params).promise.toFuture
    def stopStreamProcessorFuture(params: StopStreamProcessorRequest): Future[StopStreamProcessorResponse] =
      service.stopStreamProcessor(params).promise.toFuture
  }
}

package rekognition {
  @js.native
  @JSImport("aws-sdk", "Rekognition")
  class Rekognition() extends js.Object {
    def this(config: AWSConfig) = this()

    def compareFaces(params: CompareFacesRequest): Request[CompareFacesResponse]                            = js.native
    def createCollection(params: CreateCollectionRequest): Request[CreateCollectionResponse]                = js.native
    def createStreamProcessor(params: CreateStreamProcessorRequest): Request[CreateStreamProcessorResponse] = js.native
    def deleteCollection(params: DeleteCollectionRequest): Request[DeleteCollectionResponse]                = js.native
    def deleteFaces(params: DeleteFacesRequest): Request[DeleteFacesResponse]                               = js.native
    def deleteStreamProcessor(params: DeleteStreamProcessorRequest): Request[DeleteStreamProcessorResponse] = js.native
    def describeCollection(params: DescribeCollectionRequest): Request[DescribeCollectionResponse]          = js.native
    def describeStreamProcessor(params: DescribeStreamProcessorRequest): Request[DescribeStreamProcessorResponse] =
      js.native
    def detectFaces(params: DetectFacesRequest): Request[DetectFacesResponse]    = js.native
    def detectLabels(params: DetectLabelsRequest): Request[DetectLabelsResponse] = js.native
    def detectModerationLabels(params: DetectModerationLabelsRequest): Request[DetectModerationLabelsResponse] =
      js.native
    def detectText(params: DetectTextRequest): Request[DetectTextResponse]                   = js.native
    def getCelebrityInfo(params: GetCelebrityInfoRequest): Request[GetCelebrityInfoResponse] = js.native
    def getCelebrityRecognition(params: GetCelebrityRecognitionRequest): Request[GetCelebrityRecognitionResponse] =
      js.native
    def getContentModeration(params: GetContentModerationRequest): Request[GetContentModerationResponse] = js.native
    def getFaceDetection(params: GetFaceDetectionRequest): Request[GetFaceDetectionResponse]             = js.native
    def getFaceSearch(params: GetFaceSearchRequest): Request[GetFaceSearchResponse]                      = js.native
    def getLabelDetection(params: GetLabelDetectionRequest): Request[GetLabelDetectionResponse]          = js.native
    def getPersonTracking(params: GetPersonTrackingRequest): Request[GetPersonTrackingResponse]          = js.native
    def indexFaces(params: IndexFacesRequest): Request[IndexFacesResponse]                               = js.native
    def listCollections(params: ListCollectionsRequest): Request[ListCollectionsResponse]                = js.native
    def listFaces(params: ListFacesRequest): Request[ListFacesResponse]                                  = js.native
    def listStreamProcessors(params: ListStreamProcessorsRequest): Request[ListStreamProcessorsResponse] = js.native
    def recognizeCelebrities(params: RecognizeCelebritiesRequest): Request[RecognizeCelebritiesResponse] = js.native
    def searchFaces(params: SearchFacesRequest): Request[SearchFacesResponse]                            = js.native
    def searchFacesByImage(params: SearchFacesByImageRequest): Request[SearchFacesByImageResponse]       = js.native
    def startCelebrityRecognition(
        params: StartCelebrityRecognitionRequest
    ): Request[StartCelebrityRecognitionResponse] = js.native
    def startContentModeration(params: StartContentModerationRequest): Request[StartContentModerationResponse] =
      js.native
    def startFaceDetection(params: StartFaceDetectionRequest): Request[StartFaceDetectionResponse]       = js.native
    def startFaceSearch(params: StartFaceSearchRequest): Request[StartFaceSearchResponse]                = js.native
    def startLabelDetection(params: StartLabelDetectionRequest): Request[StartLabelDetectionResponse]    = js.native
    def startPersonTracking(params: StartPersonTrackingRequest): Request[StartPersonTrackingResponse]    = js.native
    def startStreamProcessor(params: StartStreamProcessorRequest): Request[StartStreamProcessorResponse] = js.native
    def stopStreamProcessor(params: StopStreamProcessorRequest): Request[StopStreamProcessorResponse]    = js.native
  }

  /**
    * Structure containing the estimated age range, in years, for a face.
    *  Amazon Rekognition estimates an age range for faces detected in the input image. Estimated age ranges can overlap. A face of a 5-year-old might have an estimated range of 4-6, while the face of a 6-year-old might have an estimated range of 4-8.
    */
  @js.native
  trait AgeRange extends js.Object {
    var High: js.UndefOr[UInteger]
    var Low: js.UndefOr[UInteger]
  }

  object AgeRange {
    def apply(
        High: js.UndefOr[UInteger] = js.undefined,
        Low: js.UndefOr[UInteger] = js.undefined
    ): AgeRange = {
      val _fields = IndexedSeq[(String, js.Any)](
        "High" -> High.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Low" -> Low.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AgeRange]
    }
  }

  object AttributeEnum {
    val DEFAULT = "DEFAULT"
    val ALL     = "ALL"

    val values = IndexedSeq(DEFAULT, ALL)
  }

  /**
    * Indicates whether or not the face has a beard, and the confidence level in the determination.
    */
  @js.native
  trait Beard extends js.Object {
    var Confidence: js.UndefOr[Percent]
    var Value: js.UndefOr[Boolean]
  }

  object Beard {
    def apply(
        Confidence: js.UndefOr[Percent] = js.undefined,
        Value: js.UndefOr[Boolean] = js.undefined
    ): Beard = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Confidence" -> Confidence.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Value" -> Value.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Beard]
    }
  }

  /**
    * Identifies the bounding box around the label, face, or text. The <code>left</code> (x-coordinate) and <code>top</code> (y-coordinate) are coordinates representing the top and left sides of the bounding box. Note that the upper-left corner of the image is the origin (0,0).
    *  The <code>top</code> and <code>left</code> values returned are ratios of the overall image size. For example, if the input image is 700x200 pixels, and the top-left coordinate of the bounding box is 350x50 pixels, the API returns a <code>left</code> value of 0.5 (350/700) and a <code>top</code> value of 0.25 (50/200).
    *  The <code>width</code> and <code>height</code> values represent the dimensions of the bounding box as a ratio of the overall image dimension. For example, if the input image is 700x200 pixels, and the bounding box width is 70 pixels, the width returned is 0.1.
    *
    * '''Note:'''The bounding box coordinates can have negative values. For example, if Amazon Rekognition is able to detect a face that is at the image edge and is only partially visible, the service can return coordinates that are outside the image bounds and, depending on the image edge, you might get negative values or values greater than 1 for the <code>left</code> or <code>top</code> values.
    */
  @js.native
  trait BoundingBox extends js.Object {
    var Height: js.UndefOr[Float]
    var Left: js.UndefOr[Float]
    var Top: js.UndefOr[Float]
    var Width: js.UndefOr[Float]
  }

  object BoundingBox {
    def apply(
        Height: js.UndefOr[Float] = js.undefined,
        Left: js.UndefOr[Float] = js.undefined,
        Top: js.UndefOr[Float] = js.undefined,
        Width: js.UndefOr[Float] = js.undefined
    ): BoundingBox = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Height" -> Height.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Left" -> Left.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Top" -> Top.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Width" -> Width.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BoundingBox]
    }
  }

  /**
    * Provides information about a celebrity recognized by the <a>RecognizeCelebrities</a> operation.
    */
  @js.native
  trait Celebrity extends js.Object {
    var Face: js.UndefOr[ComparedFace]
    var Id: js.UndefOr[RekognitionUniqueId]
    var MatchConfidence: js.UndefOr[Percent]
    var Name: js.UndefOr[String]
    var Urls: js.UndefOr[Urls]
  }

  object Celebrity {
    def apply(
        Face: js.UndefOr[ComparedFace] = js.undefined,
        Id: js.UndefOr[RekognitionUniqueId] = js.undefined,
        MatchConfidence: js.UndefOr[Percent] = js.undefined,
        Name: js.UndefOr[String] = js.undefined,
        Urls: js.UndefOr[Urls] = js.undefined
    ): Celebrity = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Face" -> Face.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Id" -> Id.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MatchConfidence" -> MatchConfidence.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Urls" -> Urls.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Celebrity]
    }
  }

  /**
    * Information about a recognized celebrity.
    */
  @js.native
  trait CelebrityDetail extends js.Object {
    var BoundingBox: js.UndefOr[BoundingBox]
    var Confidence: js.UndefOr[Percent]
    var Face: js.UndefOr[FaceDetail]
    var Id: js.UndefOr[RekognitionUniqueId]
    var Name: js.UndefOr[String]
    var Urls: js.UndefOr[Urls]
  }

  object CelebrityDetail {
    def apply(
        BoundingBox: js.UndefOr[BoundingBox] = js.undefined,
        Confidence: js.UndefOr[Percent] = js.undefined,
        Face: js.UndefOr[FaceDetail] = js.undefined,
        Id: js.UndefOr[RekognitionUniqueId] = js.undefined,
        Name: js.UndefOr[String] = js.undefined,
        Urls: js.UndefOr[Urls] = js.undefined
    ): CelebrityDetail = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BoundingBox" -> BoundingBox.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Confidence" -> Confidence.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Face" -> Face.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Id" -> Id.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Urls" -> Urls.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CelebrityDetail]
    }
  }

  /**
    * Information about a detected celebrity and the time the celebrity was detected in a stored video. For more information, see GetCelebrityRecognition in the Amazon Rekognition Developer Guide.
    */
  @js.native
  trait CelebrityRecognition extends js.Object {
    var Celebrity: js.UndefOr[CelebrityDetail]
    var Timestamp: js.UndefOr[Timestamp]
  }

  object CelebrityRecognition {
    def apply(
        Celebrity: js.UndefOr[CelebrityDetail] = js.undefined,
        Timestamp: js.UndefOr[Timestamp] = js.undefined
    ): CelebrityRecognition = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Celebrity" -> Celebrity.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Timestamp" -> Timestamp.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CelebrityRecognition]
    }
  }

  object CelebrityRecognitionSortByEnum {
    val ID        = "ID"
    val TIMESTAMP = "TIMESTAMP"

    val values = IndexedSeq(ID, TIMESTAMP)
  }

  /**
    * Provides information about a face in a target image that matches the source image face analyzed by <code>CompareFaces</code>. The <code>Face</code> property contains the bounding box of the face in the target image. The <code>Similarity</code> property is the confidence that the source image face matches the face in the bounding box.
    */
  @js.native
  trait CompareFacesMatch extends js.Object {
    var Face: js.UndefOr[ComparedFace]
    var Similarity: js.UndefOr[Percent]
  }

  object CompareFacesMatch {
    def apply(
        Face: js.UndefOr[ComparedFace] = js.undefined,
        Similarity: js.UndefOr[Percent] = js.undefined
    ): CompareFacesMatch = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Face" -> Face.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Similarity" -> Similarity.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CompareFacesMatch]
    }
  }

  @js.native
  trait CompareFacesRequest extends js.Object {
    var SourceImage: Image
    var TargetImage: Image
    var SimilarityThreshold: js.UndefOr[Percent]
  }

  object CompareFacesRequest {
    def apply(
        SourceImage: Image,
        TargetImage: Image,
        SimilarityThreshold: js.UndefOr[Percent] = js.undefined
    ): CompareFacesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SourceImage" -> SourceImage.asInstanceOf[js.Any],
        "TargetImage" -> TargetImage.asInstanceOf[js.Any],
        "SimilarityThreshold" -> SimilarityThreshold.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CompareFacesRequest]
    }
  }

  @js.native
  trait CompareFacesResponse extends js.Object {
    var FaceMatches: js.UndefOr[CompareFacesMatchList]
    var SourceImageFace: js.UndefOr[ComparedSourceImageFace]
    var SourceImageOrientationCorrection: js.UndefOr[OrientationCorrection]
    var TargetImageOrientationCorrection: js.UndefOr[OrientationCorrection]
    var UnmatchedFaces: js.UndefOr[CompareFacesUnmatchList]
  }

  object CompareFacesResponse {
    def apply(
        FaceMatches: js.UndefOr[CompareFacesMatchList] = js.undefined,
        SourceImageFace: js.UndefOr[ComparedSourceImageFace] = js.undefined,
        SourceImageOrientationCorrection: js.UndefOr[OrientationCorrection] = js.undefined,
        TargetImageOrientationCorrection: js.UndefOr[OrientationCorrection] = js.undefined,
        UnmatchedFaces: js.UndefOr[CompareFacesUnmatchList] = js.undefined
    ): CompareFacesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FaceMatches" -> FaceMatches.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SourceImageFace" -> SourceImageFace.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SourceImageOrientationCorrection" -> SourceImageOrientationCorrection.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TargetImageOrientationCorrection" -> TargetImageOrientationCorrection.map { x =>
          x.asInstanceOf[js.Any]
        },
        "UnmatchedFaces" -> UnmatchedFaces.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CompareFacesResponse]
    }
  }

  /**
    * Provides face metadata for target image faces that are analyzed by <code>CompareFaces</code> and <code>RecognizeCelebrities</code>.
    */
  @js.native
  trait ComparedFace extends js.Object {
    var BoundingBox: js.UndefOr[BoundingBox]
    var Confidence: js.UndefOr[Percent]
    var Landmarks: js.UndefOr[Landmarks]
    var Pose: js.UndefOr[Pose]
    var Quality: js.UndefOr[ImageQuality]
  }

  object ComparedFace {
    def apply(
        BoundingBox: js.UndefOr[BoundingBox] = js.undefined,
        Confidence: js.UndefOr[Percent] = js.undefined,
        Landmarks: js.UndefOr[Landmarks] = js.undefined,
        Pose: js.UndefOr[Pose] = js.undefined,
        Quality: js.UndefOr[ImageQuality] = js.undefined
    ): ComparedFace = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BoundingBox" -> BoundingBox.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Confidence" -> Confidence.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Landmarks" -> Landmarks.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Pose" -> Pose.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Quality" -> Quality.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ComparedFace]
    }
  }

  /**
    * Type that describes the face Amazon Rekognition chose to compare with the faces in the target. This contains a bounding box for the selected face and confidence level that the bounding box contains a face. Note that Amazon Rekognition selects the largest face in the source image for this comparison.
    */
  @js.native
  trait ComparedSourceImageFace extends js.Object {
    var BoundingBox: js.UndefOr[BoundingBox]
    var Confidence: js.UndefOr[Percent]
  }

  object ComparedSourceImageFace {
    def apply(
        BoundingBox: js.UndefOr[BoundingBox] = js.undefined,
        Confidence: js.UndefOr[Percent] = js.undefined
    ): ComparedSourceImageFace = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BoundingBox" -> BoundingBox.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Confidence" -> Confidence.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ComparedSourceImageFace]
    }
  }

  /**
    * Information about a moderation label detection in a stored video.
    */
  @js.native
  trait ContentModerationDetection extends js.Object {
    var ModerationLabel: js.UndefOr[ModerationLabel]
    var Timestamp: js.UndefOr[Timestamp]
  }

  object ContentModerationDetection {
    def apply(
        ModerationLabel: js.UndefOr[ModerationLabel] = js.undefined,
        Timestamp: js.UndefOr[Timestamp] = js.undefined
    ): ContentModerationDetection = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ModerationLabel" -> ModerationLabel.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Timestamp" -> Timestamp.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ContentModerationDetection]
    }
  }

  object ContentModerationSortByEnum {
    val NAME      = "NAME"
    val TIMESTAMP = "TIMESTAMP"

    val values = IndexedSeq(NAME, TIMESTAMP)
  }

  @js.native
  trait CreateCollectionRequest extends js.Object {
    var CollectionId: CollectionId
  }

  object CreateCollectionRequest {
    def apply(
        CollectionId: CollectionId
    ): CreateCollectionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CollectionId" -> CollectionId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateCollectionRequest]
    }
  }

  @js.native
  trait CreateCollectionResponse extends js.Object {
    var CollectionArn: js.UndefOr[String]
    var FaceModelVersion: js.UndefOr[String]
    var StatusCode: js.UndefOr[UInteger]
  }

  object CreateCollectionResponse {
    def apply(
        CollectionArn: js.UndefOr[String] = js.undefined,
        FaceModelVersion: js.UndefOr[String] = js.undefined,
        StatusCode: js.UndefOr[UInteger] = js.undefined
    ): CreateCollectionResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CollectionArn" -> CollectionArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "FaceModelVersion" -> FaceModelVersion.map { x =>
          x.asInstanceOf[js.Any]
        },
        "StatusCode" -> StatusCode.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateCollectionResponse]
    }
  }

  @js.native
  trait CreateStreamProcessorRequest extends js.Object {
    var Input: StreamProcessorInput
    var Name: StreamProcessorName
    var Output: StreamProcessorOutput
    var RoleArn: RoleArn
    var Settings: StreamProcessorSettings
  }

  object CreateStreamProcessorRequest {
    def apply(
        Input: StreamProcessorInput,
        Name: StreamProcessorName,
        Output: StreamProcessorOutput,
        RoleArn: RoleArn,
        Settings: StreamProcessorSettings
    ): CreateStreamProcessorRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Input"    -> Input.asInstanceOf[js.Any],
        "Name"     -> Name.asInstanceOf[js.Any],
        "Output"   -> Output.asInstanceOf[js.Any],
        "RoleArn"  -> RoleArn.asInstanceOf[js.Any],
        "Settings" -> Settings.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateStreamProcessorRequest]
    }
  }

  @js.native
  trait CreateStreamProcessorResponse extends js.Object {
    var StreamProcessorArn: js.UndefOr[StreamProcessorArn]
  }

  object CreateStreamProcessorResponse {
    def apply(
        StreamProcessorArn: js.UndefOr[StreamProcessorArn] = js.undefined
    ): CreateStreamProcessorResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StreamProcessorArn" -> StreamProcessorArn.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateStreamProcessorResponse]
    }
  }

  @js.native
  trait DeleteCollectionRequest extends js.Object {
    var CollectionId: CollectionId
  }

  object DeleteCollectionRequest {
    def apply(
        CollectionId: CollectionId
    ): DeleteCollectionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CollectionId" -> CollectionId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteCollectionRequest]
    }
  }

  @js.native
  trait DeleteCollectionResponse extends js.Object {
    var StatusCode: js.UndefOr[UInteger]
  }

  object DeleteCollectionResponse {
    def apply(
        StatusCode: js.UndefOr[UInteger] = js.undefined
    ): DeleteCollectionResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StatusCode" -> StatusCode.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteCollectionResponse]
    }
  }

  @js.native
  trait DeleteFacesRequest extends js.Object {
    var CollectionId: CollectionId
    var FaceIds: FaceIdList
  }

  object DeleteFacesRequest {
    def apply(
        CollectionId: CollectionId,
        FaceIds: FaceIdList
    ): DeleteFacesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CollectionId" -> CollectionId.asInstanceOf[js.Any],
        "FaceIds"      -> FaceIds.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteFacesRequest]
    }
  }

  @js.native
  trait DeleteFacesResponse extends js.Object {
    var DeletedFaces: js.UndefOr[FaceIdList]
  }

  object DeleteFacesResponse {
    def apply(
        DeletedFaces: js.UndefOr[FaceIdList] = js.undefined
    ): DeleteFacesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DeletedFaces" -> DeletedFaces.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteFacesResponse]
    }
  }

  @js.native
  trait DeleteStreamProcessorRequest extends js.Object {
    var Name: StreamProcessorName
  }

  object DeleteStreamProcessorRequest {
    def apply(
        Name: StreamProcessorName
    ): DeleteStreamProcessorRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteStreamProcessorRequest]
    }
  }

  @js.native
  trait DeleteStreamProcessorResponse extends js.Object {}

  object DeleteStreamProcessorResponse {
    def apply(
        ): DeleteStreamProcessorResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteStreamProcessorResponse]
    }
  }

  @js.native
  trait DescribeCollectionRequest extends js.Object {
    var CollectionId: CollectionId
  }

  object DescribeCollectionRequest {
    def apply(
        CollectionId: CollectionId
    ): DescribeCollectionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CollectionId" -> CollectionId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeCollectionRequest]
    }
  }

  @js.native
  trait DescribeCollectionResponse extends js.Object {
    var CollectionARN: js.UndefOr[String]
    var CreationTimestamp: js.UndefOr[DateTime]
    var FaceCount: js.UndefOr[ULong]
    var FaceModelVersion: js.UndefOr[String]
  }

  object DescribeCollectionResponse {
    def apply(
        CollectionARN: js.UndefOr[String] = js.undefined,
        CreationTimestamp: js.UndefOr[DateTime] = js.undefined,
        FaceCount: js.UndefOr[ULong] = js.undefined,
        FaceModelVersion: js.UndefOr[String] = js.undefined
    ): DescribeCollectionResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CollectionARN" -> CollectionARN.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CreationTimestamp" -> CreationTimestamp.map { x =>
          x.asInstanceOf[js.Any]
        },
        "FaceCount" -> FaceCount.map { x =>
          x.asInstanceOf[js.Any]
        },
        "FaceModelVersion" -> FaceModelVersion.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeCollectionResponse]
    }
  }

  @js.native
  trait DescribeStreamProcessorRequest extends js.Object {
    var Name: StreamProcessorName
  }

  object DescribeStreamProcessorRequest {
    def apply(
        Name: StreamProcessorName
    ): DescribeStreamProcessorRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeStreamProcessorRequest]
    }
  }

  @js.native
  trait DescribeStreamProcessorResponse extends js.Object {
    var CreationTimestamp: js.UndefOr[DateTime]
    var Input: js.UndefOr[StreamProcessorInput]
    var LastUpdateTimestamp: js.UndefOr[DateTime]
    var Name: js.UndefOr[StreamProcessorName]
    var Output: js.UndefOr[StreamProcessorOutput]
    var RoleArn: js.UndefOr[RoleArn]
    var Settings: js.UndefOr[StreamProcessorSettings]
    var Status: js.UndefOr[StreamProcessorStatus]
    var StatusMessage: js.UndefOr[String]
    var StreamProcessorArn: js.UndefOr[StreamProcessorArn]
  }

  object DescribeStreamProcessorResponse {
    def apply(
        CreationTimestamp: js.UndefOr[DateTime] = js.undefined,
        Input: js.UndefOr[StreamProcessorInput] = js.undefined,
        LastUpdateTimestamp: js.UndefOr[DateTime] = js.undefined,
        Name: js.UndefOr[StreamProcessorName] = js.undefined,
        Output: js.UndefOr[StreamProcessorOutput] = js.undefined,
        RoleArn: js.UndefOr[RoleArn] = js.undefined,
        Settings: js.UndefOr[StreamProcessorSettings] = js.undefined,
        Status: js.UndefOr[StreamProcessorStatus] = js.undefined,
        StatusMessage: js.UndefOr[String] = js.undefined,
        StreamProcessorArn: js.UndefOr[StreamProcessorArn] = js.undefined
    ): DescribeStreamProcessorResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CreationTimestamp" -> CreationTimestamp.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Input" -> Input.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LastUpdateTimestamp" -> LastUpdateTimestamp.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Output" -> Output.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RoleArn" -> RoleArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Settings" -> Settings.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Status" -> Status.map { x =>
          x.asInstanceOf[js.Any]
        },
        "StatusMessage" -> StatusMessage.map { x =>
          x.asInstanceOf[js.Any]
        },
        "StreamProcessorArn" -> StreamProcessorArn.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeStreamProcessorResponse]
    }
  }

  @js.native
  trait DetectFacesRequest extends js.Object {
    var Image: Image
    var Attributes: js.UndefOr[Attributes]
  }

  object DetectFacesRequest {
    def apply(
        Image: Image,
        Attributes: js.UndefOr[Attributes] = js.undefined
    ): DetectFacesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Image" -> Image.asInstanceOf[js.Any],
        "Attributes" -> Attributes.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DetectFacesRequest]
    }
  }

  @js.native
  trait DetectFacesResponse extends js.Object {
    var FaceDetails: js.UndefOr[FaceDetailList]
    var OrientationCorrection: js.UndefOr[OrientationCorrection]
  }

  object DetectFacesResponse {
    def apply(
        FaceDetails: js.UndefOr[FaceDetailList] = js.undefined,
        OrientationCorrection: js.UndefOr[OrientationCorrection] = js.undefined
    ): DetectFacesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FaceDetails" -> FaceDetails.map { x =>
          x.asInstanceOf[js.Any]
        },
        "OrientationCorrection" -> OrientationCorrection.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DetectFacesResponse]
    }
  }

  @js.native
  trait DetectLabelsRequest extends js.Object {
    var Image: Image
    var MaxLabels: js.UndefOr[UInteger]
    var MinConfidence: js.UndefOr[Percent]
  }

  object DetectLabelsRequest {
    def apply(
        Image: Image,
        MaxLabels: js.UndefOr[UInteger] = js.undefined,
        MinConfidence: js.UndefOr[Percent] = js.undefined
    ): DetectLabelsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Image" -> Image.asInstanceOf[js.Any],
        "MaxLabels" -> MaxLabels.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MinConfidence" -> MinConfidence.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DetectLabelsRequest]
    }
  }

  @js.native
  trait DetectLabelsResponse extends js.Object {
    var LabelModelVersion: js.UndefOr[String]
    var Labels: js.UndefOr[Labels]
    var OrientationCorrection: js.UndefOr[OrientationCorrection]
  }

  object DetectLabelsResponse {
    def apply(
        LabelModelVersion: js.UndefOr[String] = js.undefined,
        Labels: js.UndefOr[Labels] = js.undefined,
        OrientationCorrection: js.UndefOr[OrientationCorrection] = js.undefined
    ): DetectLabelsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LabelModelVersion" -> LabelModelVersion.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Labels" -> Labels.map { x =>
          x.asInstanceOf[js.Any]
        },
        "OrientationCorrection" -> OrientationCorrection.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DetectLabelsResponse]
    }
  }

  @js.native
  trait DetectModerationLabelsRequest extends js.Object {
    var Image: Image
    var MinConfidence: js.UndefOr[Percent]
  }

  object DetectModerationLabelsRequest {
    def apply(
        Image: Image,
        MinConfidence: js.UndefOr[Percent] = js.undefined
    ): DetectModerationLabelsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Image" -> Image.asInstanceOf[js.Any],
        "MinConfidence" -> MinConfidence.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DetectModerationLabelsRequest]
    }
  }

  @js.native
  trait DetectModerationLabelsResponse extends js.Object {
    var ModerationLabels: js.UndefOr[ModerationLabels]
    var ModerationModelVersion: js.UndefOr[String]
  }

  object DetectModerationLabelsResponse {
    def apply(
        ModerationLabels: js.UndefOr[ModerationLabels] = js.undefined,
        ModerationModelVersion: js.UndefOr[String] = js.undefined
    ): DetectModerationLabelsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ModerationLabels" -> ModerationLabels.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ModerationModelVersion" -> ModerationModelVersion.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DetectModerationLabelsResponse]
    }
  }

  @js.native
  trait DetectTextRequest extends js.Object {
    var Image: Image
  }

  object DetectTextRequest {
    def apply(
        Image: Image
    ): DetectTextRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Image" -> Image.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DetectTextRequest]
    }
  }

  @js.native
  trait DetectTextResponse extends js.Object {
    var TextDetections: js.UndefOr[TextDetectionList]
  }

  object DetectTextResponse {
    def apply(
        TextDetections: js.UndefOr[TextDetectionList] = js.undefined
    ): DetectTextResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TextDetections" -> TextDetections.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DetectTextResponse]
    }
  }

  /**
    * The emotions detected on the face, and the confidence level in the determination. For example, HAPPY, SAD, and ANGRY.
    */
  @js.native
  trait Emotion extends js.Object {
    var Confidence: js.UndefOr[Percent]
    var Type: js.UndefOr[EmotionName]
  }

  object Emotion {
    def apply(
        Confidence: js.UndefOr[Percent] = js.undefined,
        Type: js.UndefOr[EmotionName] = js.undefined
    ): Emotion = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Confidence" -> Confidence.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Type" -> Type.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Emotion]
    }
  }

  object EmotionNameEnum {
    val HAPPY     = "HAPPY"
    val SAD       = "SAD"
    val ANGRY     = "ANGRY"
    val CONFUSED  = "CONFUSED"
    val DISGUSTED = "DISGUSTED"
    val SURPRISED = "SURPRISED"
    val CALM      = "CALM"
    val UNKNOWN   = "UNKNOWN"

    val values = IndexedSeq(HAPPY, SAD, ANGRY, CONFUSED, DISGUSTED, SURPRISED, CALM, UNKNOWN)
  }

  /**
    * Indicates whether or not the eyes on the face are open, and the confidence level in the determination.
    */
  @js.native
  trait EyeOpen extends js.Object {
    var Confidence: js.UndefOr[Percent]
    var Value: js.UndefOr[Boolean]
  }

  object EyeOpen {
    def apply(
        Confidence: js.UndefOr[Percent] = js.undefined,
        Value: js.UndefOr[Boolean] = js.undefined
    ): EyeOpen = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Confidence" -> Confidence.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Value" -> Value.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EyeOpen]
    }
  }

  /**
    * Indicates whether or not the face is wearing eye glasses, and the confidence level in the determination.
    */
  @js.native
  trait Eyeglasses extends js.Object {
    var Confidence: js.UndefOr[Percent]
    var Value: js.UndefOr[Boolean]
  }

  object Eyeglasses {
    def apply(
        Confidence: js.UndefOr[Percent] = js.undefined,
        Value: js.UndefOr[Boolean] = js.undefined
    ): Eyeglasses = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Confidence" -> Confidence.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Value" -> Value.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Eyeglasses]
    }
  }

  /**
    * Describes the face properties such as the bounding box, face ID, image ID of the input image, and external image ID that you assigned.
    */
  @js.native
  trait Face extends js.Object {
    var BoundingBox: js.UndefOr[BoundingBox]
    var Confidence: js.UndefOr[Percent]
    var ExternalImageId: js.UndefOr[ExternalImageId]
    var FaceId: js.UndefOr[FaceId]
    var ImageId: js.UndefOr[ImageId]
  }

  object Face {
    def apply(
        BoundingBox: js.UndefOr[BoundingBox] = js.undefined,
        Confidence: js.UndefOr[Percent] = js.undefined,
        ExternalImageId: js.UndefOr[ExternalImageId] = js.undefined,
        FaceId: js.UndefOr[FaceId] = js.undefined,
        ImageId: js.UndefOr[ImageId] = js.undefined
    ): Face = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BoundingBox" -> BoundingBox.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Confidence" -> Confidence.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ExternalImageId" -> ExternalImageId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "FaceId" -> FaceId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ImageId" -> ImageId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Face]
    }
  }

  object FaceAttributesEnum {
    val DEFAULT = "DEFAULT"
    val ALL     = "ALL"

    val values = IndexedSeq(DEFAULT, ALL)
  }

  /**
    * Structure containing attributes of the face that the algorithm detected.
    *  A <code>FaceDetail</code> object contains either the default facial attributes or all facial attributes. The default attributes are <code>BoundingBox</code>, <code>Confidence</code>, <code>Landmarks</code>, <code>Pose</code>, and <code>Quality</code>.
    *  <a>GetFaceDetection</a> is the only Amazon Rekognition Video stored video operation that can return a <code>FaceDetail</code> object with all attributes. To specify which attributes to return, use the <code>FaceAttributes</code> input parameter for <a>StartFaceDetection</a>. The following Amazon Rekognition Video operations return only the default attributes. The corresponding Start operations don't have a <code>FaceAttributes</code> input parameter.
    * * GetCelebrityRecognition
    *  * GetPersonTracking
    *  * GetFaceSearch
    * The Amazon Rekognition Image <a>DetectFaces</a> and <a>IndexFaces</a> operations can return all facial attributes. To specify which attributes to return, use the <code>Attributes</code> input parameter for <code>DetectFaces</code>. For <code>IndexFaces</code>, use the <code>DetectAttributes</code> input parameter.
    */
  @js.native
  trait FaceDetail extends js.Object {
    var AgeRange: js.UndefOr[AgeRange]
    var Beard: js.UndefOr[Beard]
    var BoundingBox: js.UndefOr[BoundingBox]
    var Confidence: js.UndefOr[Percent]
    var Emotions: js.UndefOr[Emotions]
    var Eyeglasses: js.UndefOr[Eyeglasses]
    var EyesOpen: js.UndefOr[EyeOpen]
    var Gender: js.UndefOr[Gender]
    var Landmarks: js.UndefOr[Landmarks]
    var MouthOpen: js.UndefOr[MouthOpen]
    var Mustache: js.UndefOr[Mustache]
    var Pose: js.UndefOr[Pose]
    var Quality: js.UndefOr[ImageQuality]
    var Smile: js.UndefOr[Smile]
    var Sunglasses: js.UndefOr[Sunglasses]
  }

  object FaceDetail {
    def apply(
        AgeRange: js.UndefOr[AgeRange] = js.undefined,
        Beard: js.UndefOr[Beard] = js.undefined,
        BoundingBox: js.UndefOr[BoundingBox] = js.undefined,
        Confidence: js.UndefOr[Percent] = js.undefined,
        Emotions: js.UndefOr[Emotions] = js.undefined,
        Eyeglasses: js.UndefOr[Eyeglasses] = js.undefined,
        EyesOpen: js.UndefOr[EyeOpen] = js.undefined,
        Gender: js.UndefOr[Gender] = js.undefined,
        Landmarks: js.UndefOr[Landmarks] = js.undefined,
        MouthOpen: js.UndefOr[MouthOpen] = js.undefined,
        Mustache: js.UndefOr[Mustache] = js.undefined,
        Pose: js.UndefOr[Pose] = js.undefined,
        Quality: js.UndefOr[ImageQuality] = js.undefined,
        Smile: js.UndefOr[Smile] = js.undefined,
        Sunglasses: js.UndefOr[Sunglasses] = js.undefined
    ): FaceDetail = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AgeRange" -> AgeRange.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Beard" -> Beard.map { x =>
          x.asInstanceOf[js.Any]
        },
        "BoundingBox" -> BoundingBox.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Confidence" -> Confidence.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Emotions" -> Emotions.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Eyeglasses" -> Eyeglasses.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EyesOpen" -> EyesOpen.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Gender" -> Gender.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Landmarks" -> Landmarks.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MouthOpen" -> MouthOpen.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Mustache" -> Mustache.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Pose" -> Pose.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Quality" -> Quality.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Smile" -> Smile.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Sunglasses" -> Sunglasses.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[FaceDetail]
    }
  }

  /**
    * Information about a face detected in a video analysis request and the time the face was detected in the video.
    */
  @js.native
  trait FaceDetection extends js.Object {
    var Face: js.UndefOr[FaceDetail]
    var Timestamp: js.UndefOr[Timestamp]
  }

  object FaceDetection {
    def apply(
        Face: js.UndefOr[FaceDetail] = js.undefined,
        Timestamp: js.UndefOr[Timestamp] = js.undefined
    ): FaceDetection = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Face" -> Face.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Timestamp" -> Timestamp.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[FaceDetection]
    }
  }

  /**
    * Provides face metadata. In addition, it also provides the confidence in the match of this face with the input face.
    */
  @js.native
  trait FaceMatch extends js.Object {
    var Face: js.UndefOr[Face]
    var Similarity: js.UndefOr[Percent]
  }

  object FaceMatch {
    def apply(
        Face: js.UndefOr[Face] = js.undefined,
        Similarity: js.UndefOr[Percent] = js.undefined
    ): FaceMatch = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Face" -> Face.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Similarity" -> Similarity.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[FaceMatch]
    }
  }

  /**
    * Object containing both the face metadata (stored in the backend database), and facial attributes that are detected but aren't stored in the database.
    */
  @js.native
  trait FaceRecord extends js.Object {
    var Face: js.UndefOr[Face]
    var FaceDetail: js.UndefOr[FaceDetail]
  }

  object FaceRecord {
    def apply(
        Face: js.UndefOr[Face] = js.undefined,
        FaceDetail: js.UndefOr[FaceDetail] = js.undefined
    ): FaceRecord = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Face" -> Face.map { x =>
          x.asInstanceOf[js.Any]
        },
        "FaceDetail" -> FaceDetail.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[FaceRecord]
    }
  }

  /**
    * Input face recognition parameters for an Amazon Rekognition stream processor. <code>FaceRecognitionSettings</code> is a request parameter for <a>CreateStreamProcessor</a>.
    */
  @js.native
  trait FaceSearchSettings extends js.Object {
    var CollectionId: js.UndefOr[CollectionId]
    var FaceMatchThreshold: js.UndefOr[Percent]
  }

  object FaceSearchSettings {
    def apply(
        CollectionId: js.UndefOr[CollectionId] = js.undefined,
        FaceMatchThreshold: js.UndefOr[Percent] = js.undefined
    ): FaceSearchSettings = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CollectionId" -> CollectionId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "FaceMatchThreshold" -> FaceMatchThreshold.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[FaceSearchSettings]
    }
  }

  object FaceSearchSortByEnum {
    val INDEX     = "INDEX"
    val TIMESTAMP = "TIMESTAMP"

    val values = IndexedSeq(INDEX, TIMESTAMP)
  }

  /**
    * Gender of the face and the confidence level in the determination.
    */
  @js.native
  trait Gender extends js.Object {
    var Confidence: js.UndefOr[Percent]
    var Value: js.UndefOr[GenderType]
  }

  object Gender {
    def apply(
        Confidence: js.UndefOr[Percent] = js.undefined,
        Value: js.UndefOr[GenderType] = js.undefined
    ): Gender = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Confidence" -> Confidence.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Value" -> Value.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Gender]
    }
  }

  object GenderTypeEnum {
    val Male   = "Male"
    val Female = "Female"

    val values = IndexedSeq(Male, Female)
  }

  /**
    * Information about where the text detected by <a>DetectText</a> is located on an image.
    */
  @js.native
  trait Geometry extends js.Object {
    var BoundingBox: js.UndefOr[BoundingBox]
    var Polygon: js.UndefOr[Polygon]
  }

  object Geometry {
    def apply(
        BoundingBox: js.UndefOr[BoundingBox] = js.undefined,
        Polygon: js.UndefOr[Polygon] = js.undefined
    ): Geometry = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BoundingBox" -> BoundingBox.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Polygon" -> Polygon.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Geometry]
    }
  }

  @js.native
  trait GetCelebrityInfoRequest extends js.Object {
    var Id: RekognitionUniqueId
  }

  object GetCelebrityInfoRequest {
    def apply(
        Id: RekognitionUniqueId
    ): GetCelebrityInfoRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetCelebrityInfoRequest]
    }
  }

  @js.native
  trait GetCelebrityInfoResponse extends js.Object {
    var Name: js.UndefOr[String]
    var Urls: js.UndefOr[Urls]
  }

  object GetCelebrityInfoResponse {
    def apply(
        Name: js.UndefOr[String] = js.undefined,
        Urls: js.UndefOr[Urls] = js.undefined
    ): GetCelebrityInfoResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Urls" -> Urls.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetCelebrityInfoResponse]
    }
  }

  @js.native
  trait GetCelebrityRecognitionRequest extends js.Object {
    var JobId: JobId
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[PaginationToken]
    var SortBy: js.UndefOr[CelebrityRecognitionSortBy]
  }

  object GetCelebrityRecognitionRequest {
    def apply(
        JobId: JobId,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined,
        SortBy: js.UndefOr[CelebrityRecognitionSortBy] = js.undefined
    ): GetCelebrityRecognitionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "JobId" -> JobId.asInstanceOf[js.Any],
        "MaxResults" -> MaxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SortBy" -> SortBy.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetCelebrityRecognitionRequest]
    }
  }

  @js.native
  trait GetCelebrityRecognitionResponse extends js.Object {
    var Celebrities: js.UndefOr[CelebrityRecognitions]
    var JobStatus: js.UndefOr[VideoJobStatus]
    var NextToken: js.UndefOr[PaginationToken]
    var StatusMessage: js.UndefOr[StatusMessage]
    var VideoMetadata: js.UndefOr[VideoMetadata]
  }

  object GetCelebrityRecognitionResponse {
    def apply(
        Celebrities: js.UndefOr[CelebrityRecognitions] = js.undefined,
        JobStatus: js.UndefOr[VideoJobStatus] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined,
        StatusMessage: js.UndefOr[StatusMessage] = js.undefined,
        VideoMetadata: js.UndefOr[VideoMetadata] = js.undefined
    ): GetCelebrityRecognitionResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Celebrities" -> Celebrities.map { x =>
          x.asInstanceOf[js.Any]
        },
        "JobStatus" -> JobStatus.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "StatusMessage" -> StatusMessage.map { x =>
          x.asInstanceOf[js.Any]
        },
        "VideoMetadata" -> VideoMetadata.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetCelebrityRecognitionResponse]
    }
  }

  @js.native
  trait GetContentModerationRequest extends js.Object {
    var JobId: JobId
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[PaginationToken]
    var SortBy: js.UndefOr[ContentModerationSortBy]
  }

  object GetContentModerationRequest {
    def apply(
        JobId: JobId,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined,
        SortBy: js.UndefOr[ContentModerationSortBy] = js.undefined
    ): GetContentModerationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "JobId" -> JobId.asInstanceOf[js.Any],
        "MaxResults" -> MaxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SortBy" -> SortBy.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetContentModerationRequest]
    }
  }

  @js.native
  trait GetContentModerationResponse extends js.Object {
    var JobStatus: js.UndefOr[VideoJobStatus]
    var ModerationLabels: js.UndefOr[ContentModerationDetections]
    var ModerationModelVersion: js.UndefOr[String]
    var NextToken: js.UndefOr[PaginationToken]
    var StatusMessage: js.UndefOr[StatusMessage]
    var VideoMetadata: js.UndefOr[VideoMetadata]
  }

  object GetContentModerationResponse {
    def apply(
        JobStatus: js.UndefOr[VideoJobStatus] = js.undefined,
        ModerationLabels: js.UndefOr[ContentModerationDetections] = js.undefined,
        ModerationModelVersion: js.UndefOr[String] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined,
        StatusMessage: js.UndefOr[StatusMessage] = js.undefined,
        VideoMetadata: js.UndefOr[VideoMetadata] = js.undefined
    ): GetContentModerationResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "JobStatus" -> JobStatus.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ModerationLabels" -> ModerationLabels.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ModerationModelVersion" -> ModerationModelVersion.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "StatusMessage" -> StatusMessage.map { x =>
          x.asInstanceOf[js.Any]
        },
        "VideoMetadata" -> VideoMetadata.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetContentModerationResponse]
    }
  }

  @js.native
  trait GetFaceDetectionRequest extends js.Object {
    var JobId: JobId
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[PaginationToken]
  }

  object GetFaceDetectionRequest {
    def apply(
        JobId: JobId,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined
    ): GetFaceDetectionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "JobId" -> JobId.asInstanceOf[js.Any],
        "MaxResults" -> MaxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetFaceDetectionRequest]
    }
  }

  @js.native
  trait GetFaceDetectionResponse extends js.Object {
    var Faces: js.UndefOr[FaceDetections]
    var JobStatus: js.UndefOr[VideoJobStatus]
    var NextToken: js.UndefOr[PaginationToken]
    var StatusMessage: js.UndefOr[StatusMessage]
    var VideoMetadata: js.UndefOr[VideoMetadata]
  }

  object GetFaceDetectionResponse {
    def apply(
        Faces: js.UndefOr[FaceDetections] = js.undefined,
        JobStatus: js.UndefOr[VideoJobStatus] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined,
        StatusMessage: js.UndefOr[StatusMessage] = js.undefined,
        VideoMetadata: js.UndefOr[VideoMetadata] = js.undefined
    ): GetFaceDetectionResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Faces" -> Faces.map { x =>
          x.asInstanceOf[js.Any]
        },
        "JobStatus" -> JobStatus.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "StatusMessage" -> StatusMessage.map { x =>
          x.asInstanceOf[js.Any]
        },
        "VideoMetadata" -> VideoMetadata.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetFaceDetectionResponse]
    }
  }

  @js.native
  trait GetFaceSearchRequest extends js.Object {
    var JobId: JobId
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[PaginationToken]
    var SortBy: js.UndefOr[FaceSearchSortBy]
  }

  object GetFaceSearchRequest {
    def apply(
        JobId: JobId,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined,
        SortBy: js.UndefOr[FaceSearchSortBy] = js.undefined
    ): GetFaceSearchRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "JobId" -> JobId.asInstanceOf[js.Any],
        "MaxResults" -> MaxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SortBy" -> SortBy.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetFaceSearchRequest]
    }
  }

  @js.native
  trait GetFaceSearchResponse extends js.Object {
    var JobStatus: js.UndefOr[VideoJobStatus]
    var NextToken: js.UndefOr[PaginationToken]
    var Persons: js.UndefOr[PersonMatches]
    var StatusMessage: js.UndefOr[StatusMessage]
    var VideoMetadata: js.UndefOr[VideoMetadata]
  }

  object GetFaceSearchResponse {
    def apply(
        JobStatus: js.UndefOr[VideoJobStatus] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined,
        Persons: js.UndefOr[PersonMatches] = js.undefined,
        StatusMessage: js.UndefOr[StatusMessage] = js.undefined,
        VideoMetadata: js.UndefOr[VideoMetadata] = js.undefined
    ): GetFaceSearchResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "JobStatus" -> JobStatus.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Persons" -> Persons.map { x =>
          x.asInstanceOf[js.Any]
        },
        "StatusMessage" -> StatusMessage.map { x =>
          x.asInstanceOf[js.Any]
        },
        "VideoMetadata" -> VideoMetadata.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetFaceSearchResponse]
    }
  }

  @js.native
  trait GetLabelDetectionRequest extends js.Object {
    var JobId: JobId
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[PaginationToken]
    var SortBy: js.UndefOr[LabelDetectionSortBy]
  }

  object GetLabelDetectionRequest {
    def apply(
        JobId: JobId,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined,
        SortBy: js.UndefOr[LabelDetectionSortBy] = js.undefined
    ): GetLabelDetectionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "JobId" -> JobId.asInstanceOf[js.Any],
        "MaxResults" -> MaxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SortBy" -> SortBy.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetLabelDetectionRequest]
    }
  }

  @js.native
  trait GetLabelDetectionResponse extends js.Object {
    var JobStatus: js.UndefOr[VideoJobStatus]
    var LabelModelVersion: js.UndefOr[String]
    var Labels: js.UndefOr[LabelDetections]
    var NextToken: js.UndefOr[PaginationToken]
    var StatusMessage: js.UndefOr[StatusMessage]
    var VideoMetadata: js.UndefOr[VideoMetadata]
  }

  object GetLabelDetectionResponse {
    def apply(
        JobStatus: js.UndefOr[VideoJobStatus] = js.undefined,
        LabelModelVersion: js.UndefOr[String] = js.undefined,
        Labels: js.UndefOr[LabelDetections] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined,
        StatusMessage: js.UndefOr[StatusMessage] = js.undefined,
        VideoMetadata: js.UndefOr[VideoMetadata] = js.undefined
    ): GetLabelDetectionResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "JobStatus" -> JobStatus.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LabelModelVersion" -> LabelModelVersion.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Labels" -> Labels.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "StatusMessage" -> StatusMessage.map { x =>
          x.asInstanceOf[js.Any]
        },
        "VideoMetadata" -> VideoMetadata.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetLabelDetectionResponse]
    }
  }

  @js.native
  trait GetPersonTrackingRequest extends js.Object {
    var JobId: JobId
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[PaginationToken]
    var SortBy: js.UndefOr[PersonTrackingSortBy]
  }

  object GetPersonTrackingRequest {
    def apply(
        JobId: JobId,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined,
        SortBy: js.UndefOr[PersonTrackingSortBy] = js.undefined
    ): GetPersonTrackingRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "JobId" -> JobId.asInstanceOf[js.Any],
        "MaxResults" -> MaxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SortBy" -> SortBy.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetPersonTrackingRequest]
    }
  }

  @js.native
  trait GetPersonTrackingResponse extends js.Object {
    var JobStatus: js.UndefOr[VideoJobStatus]
    var NextToken: js.UndefOr[PaginationToken]
    var Persons: js.UndefOr[PersonDetections]
    var StatusMessage: js.UndefOr[StatusMessage]
    var VideoMetadata: js.UndefOr[VideoMetadata]
  }

  object GetPersonTrackingResponse {
    def apply(
        JobStatus: js.UndefOr[VideoJobStatus] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined,
        Persons: js.UndefOr[PersonDetections] = js.undefined,
        StatusMessage: js.UndefOr[StatusMessage] = js.undefined,
        VideoMetadata: js.UndefOr[VideoMetadata] = js.undefined
    ): GetPersonTrackingResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "JobStatus" -> JobStatus.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Persons" -> Persons.map { x =>
          x.asInstanceOf[js.Any]
        },
        "StatusMessage" -> StatusMessage.map { x =>
          x.asInstanceOf[js.Any]
        },
        "VideoMetadata" -> VideoMetadata.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetPersonTrackingResponse]
    }
  }

  /**
    * Provides the input image either as bytes or an S3 object.
    *  You pass image bytes to an Amazon Rekognition API operation by using the <code>Bytes</code> property. For example, you would use the <code>Bytes</code> property to pass an image loaded from a local file system. Image bytes passed by using the <code>Bytes</code> property must be base64-encoded. Your code may not need to encode image bytes if you are using an AWS SDK to call Amazon Rekognition API operations.
    *  For more information, see Analyzing an Image Loaded from a Local File System in the Amazon Rekognition Developer Guide.
    *  You pass images stored in an S3 bucket to an Amazon Rekognition API operation by using the <code>S3Object</code> property. Images stored in an S3 bucket do not need to be base64-encoded.
    *  The region for the S3 bucket containing the S3 object must match the region you use for Amazon Rekognition operations.
    *  If you use the AWS CLI to call Amazon Rekognition operations, passing image bytes using the Bytes property is not supported. You must first upload the image to an Amazon S3 bucket and then call the operation using the S3Object property.
    *  For Amazon Rekognition to process an S3 object, the user must have permission to access the S3 object. For more information, see Resource Based Policies in the Amazon Rekognition Developer Guide.
    */
  @js.native
  trait Image extends js.Object {
    var Bytes: js.UndefOr[ImageBlob]
    var S3Object: js.UndefOr[S3Object]
  }

  object Image {
    def apply(
        Bytes: js.UndefOr[ImageBlob] = js.undefined,
        S3Object: js.UndefOr[S3Object] = js.undefined
    ): Image = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Bytes" -> Bytes.map { x =>
          x.asInstanceOf[js.Any]
        },
        "S3Object" -> S3Object.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Image]
    }
  }

  /**
    * Identifies face image brightness and sharpness.
    */
  @js.native
  trait ImageQuality extends js.Object {
    var Brightness: js.UndefOr[Float]
    var Sharpness: js.UndefOr[Float]
  }

  object ImageQuality {
    def apply(
        Brightness: js.UndefOr[Float] = js.undefined,
        Sharpness: js.UndefOr[Float] = js.undefined
    ): ImageQuality = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Brightness" -> Brightness.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Sharpness" -> Sharpness.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ImageQuality]
    }
  }

  @js.native
  trait IndexFacesRequest extends js.Object {
    var CollectionId: CollectionId
    var Image: Image
    var DetectionAttributes: js.UndefOr[Attributes]
    var ExternalImageId: js.UndefOr[ExternalImageId]
    var MaxFaces: js.UndefOr[MaxFacesToIndex]
    var QualityFilter: js.UndefOr[QualityFilter]
  }

  object IndexFacesRequest {
    def apply(
        CollectionId: CollectionId,
        Image: Image,
        DetectionAttributes: js.UndefOr[Attributes] = js.undefined,
        ExternalImageId: js.UndefOr[ExternalImageId] = js.undefined,
        MaxFaces: js.UndefOr[MaxFacesToIndex] = js.undefined,
        QualityFilter: js.UndefOr[QualityFilter] = js.undefined
    ): IndexFacesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CollectionId" -> CollectionId.asInstanceOf[js.Any],
        "Image"        -> Image.asInstanceOf[js.Any],
        "DetectionAttributes" -> DetectionAttributes.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ExternalImageId" -> ExternalImageId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MaxFaces" -> MaxFaces.map { x =>
          x.asInstanceOf[js.Any]
        },
        "QualityFilter" -> QualityFilter.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[IndexFacesRequest]
    }
  }

  @js.native
  trait IndexFacesResponse extends js.Object {
    var FaceModelVersion: js.UndefOr[String]
    var FaceRecords: js.UndefOr[FaceRecordList]
    var OrientationCorrection: js.UndefOr[OrientationCorrection]
    var UnindexedFaces: js.UndefOr[UnindexedFaces]
  }

  object IndexFacesResponse {
    def apply(
        FaceModelVersion: js.UndefOr[String] = js.undefined,
        FaceRecords: js.UndefOr[FaceRecordList] = js.undefined,
        OrientationCorrection: js.UndefOr[OrientationCorrection] = js.undefined,
        UnindexedFaces: js.UndefOr[UnindexedFaces] = js.undefined
    ): IndexFacesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FaceModelVersion" -> FaceModelVersion.map { x =>
          x.asInstanceOf[js.Any]
        },
        "FaceRecords" -> FaceRecords.map { x =>
          x.asInstanceOf[js.Any]
        },
        "OrientationCorrection" -> OrientationCorrection.map { x =>
          x.asInstanceOf[js.Any]
        },
        "UnindexedFaces" -> UnindexedFaces.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[IndexFacesResponse]
    }
  }

  /**
    * An instance of a label returned by Amazon Rekognition Image (<a>DetectLabels</a>) or by Amazon Rekognition Video (<a>GetLabelDetection</a>).
    */
  @js.native
  trait Instance extends js.Object {
    var BoundingBox: js.UndefOr[BoundingBox]
    var Confidence: js.UndefOr[Percent]
  }

  object Instance {
    def apply(
        BoundingBox: js.UndefOr[BoundingBox] = js.undefined,
        Confidence: js.UndefOr[Percent] = js.undefined
    ): Instance = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BoundingBox" -> BoundingBox.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Confidence" -> Confidence.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Instance]
    }
  }

  /**
    * The Kinesis data stream Amazon Rekognition to which the analysis results of a Amazon Rekognition stream processor are streamed. For more information, see CreateStreamProcessor in the Amazon Rekognition Developer Guide.
    */
  @js.native
  trait KinesisDataStream extends js.Object {
    var Arn: js.UndefOr[KinesisDataArn]
  }

  object KinesisDataStream {
    def apply(
        Arn: js.UndefOr[KinesisDataArn] = js.undefined
    ): KinesisDataStream = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Arn" -> Arn.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[KinesisDataStream]
    }
  }

  /**
    * Kinesis video stream stream that provides the source streaming video for a Amazon Rekognition Video stream processor. For more information, see CreateStreamProcessor in the Amazon Rekognition Developer Guide.
    */
  @js.native
  trait KinesisVideoStream extends js.Object {
    var Arn: js.UndefOr[KinesisVideoArn]
  }

  object KinesisVideoStream {
    def apply(
        Arn: js.UndefOr[KinesisVideoArn] = js.undefined
    ): KinesisVideoStream = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Arn" -> Arn.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[KinesisVideoStream]
    }
  }

  /**
    * Structure containing details about the detected label, including the name, detected instances, parent labels, and level of confidence.
    *
    */
  @js.native
  trait Label extends js.Object {
    var Confidence: js.UndefOr[Percent]
    var Instances: js.UndefOr[Instances]
    var Name: js.UndefOr[String]
    var Parents: js.UndefOr[Parents]
  }

  object Label {
    def apply(
        Confidence: js.UndefOr[Percent] = js.undefined,
        Instances: js.UndefOr[Instances] = js.undefined,
        Name: js.UndefOr[String] = js.undefined,
        Parents: js.UndefOr[Parents] = js.undefined
    ): Label = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Confidence" -> Confidence.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Instances" -> Instances.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Parents" -> Parents.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Label]
    }
  }

  /**
    * Information about a label detected in a video analysis request and the time the label was detected in the video.
    */
  @js.native
  trait LabelDetection extends js.Object {
    var Label: js.UndefOr[Label]
    var Timestamp: js.UndefOr[Timestamp]
  }

  object LabelDetection {
    def apply(
        Label: js.UndefOr[Label] = js.undefined,
        Timestamp: js.UndefOr[Timestamp] = js.undefined
    ): LabelDetection = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Label" -> Label.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Timestamp" -> Timestamp.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LabelDetection]
    }
  }

  object LabelDetectionSortByEnum {
    val NAME      = "NAME"
    val TIMESTAMP = "TIMESTAMP"

    val values = IndexedSeq(NAME, TIMESTAMP)
  }

  /**
    * Indicates the location of the landmark on the face.
    */
  @js.native
  trait Landmark extends js.Object {
    var Type: js.UndefOr[LandmarkType]
    var X: js.UndefOr[Float]
    var Y: js.UndefOr[Float]
  }

  object Landmark {
    def apply(
        Type: js.UndefOr[LandmarkType] = js.undefined,
        X: js.UndefOr[Float] = js.undefined,
        Y: js.UndefOr[Float] = js.undefined
    ): Landmark = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Type" -> Type.map { x =>
          x.asInstanceOf[js.Any]
        },
        "X" -> X.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Y" -> Y.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Landmark]
    }
  }

  object LandmarkTypeEnum {
    val eyeLeft           = "eyeLeft"
    val eyeRight          = "eyeRight"
    val nose              = "nose"
    val mouthLeft         = "mouthLeft"
    val mouthRight        = "mouthRight"
    val leftEyeBrowLeft   = "leftEyeBrowLeft"
    val leftEyeBrowRight  = "leftEyeBrowRight"
    val leftEyeBrowUp     = "leftEyeBrowUp"
    val rightEyeBrowLeft  = "rightEyeBrowLeft"
    val rightEyeBrowRight = "rightEyeBrowRight"
    val rightEyeBrowUp    = "rightEyeBrowUp"
    val leftEyeLeft       = "leftEyeLeft"
    val leftEyeRight      = "leftEyeRight"
    val leftEyeUp         = "leftEyeUp"
    val leftEyeDown       = "leftEyeDown"
    val rightEyeLeft      = "rightEyeLeft"
    val rightEyeRight     = "rightEyeRight"
    val rightEyeUp        = "rightEyeUp"
    val rightEyeDown      = "rightEyeDown"
    val noseLeft          = "noseLeft"
    val noseRight         = "noseRight"
    val mouthUp           = "mouthUp"
    val mouthDown         = "mouthDown"
    val leftPupil         = "leftPupil"
    val rightPupil        = "rightPupil"
    val upperJawlineLeft  = "upperJawlineLeft"
    val midJawlineLeft    = "midJawlineLeft"
    val chinBottom        = "chinBottom"
    val midJawlineRight   = "midJawlineRight"
    val upperJawlineRight = "upperJawlineRight"

    val values = IndexedSeq(
      eyeLeft,
      eyeRight,
      nose,
      mouthLeft,
      mouthRight,
      leftEyeBrowLeft,
      leftEyeBrowRight,
      leftEyeBrowUp,
      rightEyeBrowLeft,
      rightEyeBrowRight,
      rightEyeBrowUp,
      leftEyeLeft,
      leftEyeRight,
      leftEyeUp,
      leftEyeDown,
      rightEyeLeft,
      rightEyeRight,
      rightEyeUp,
      rightEyeDown,
      noseLeft,
      noseRight,
      mouthUp,
      mouthDown,
      leftPupil,
      rightPupil,
      upperJawlineLeft,
      midJawlineLeft,
      chinBottom,
      midJawlineRight,
      upperJawlineRight
    )
  }

  @js.native
  trait ListCollectionsRequest extends js.Object {
    var MaxResults: js.UndefOr[PageSize]
    var NextToken: js.UndefOr[PaginationToken]
  }

  object ListCollectionsRequest {
    def apply(
        MaxResults: js.UndefOr[PageSize] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListCollectionsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MaxResults" -> MaxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListCollectionsRequest]
    }
  }

  @js.native
  trait ListCollectionsResponse extends js.Object {
    var CollectionIds: js.UndefOr[CollectionIdList]
    var FaceModelVersions: js.UndefOr[FaceModelVersionList]
    var NextToken: js.UndefOr[PaginationToken]
  }

  object ListCollectionsResponse {
    def apply(
        CollectionIds: js.UndefOr[CollectionIdList] = js.undefined,
        FaceModelVersions: js.UndefOr[FaceModelVersionList] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListCollectionsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CollectionIds" -> CollectionIds.map { x =>
          x.asInstanceOf[js.Any]
        },
        "FaceModelVersions" -> FaceModelVersions.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListCollectionsResponse]
    }
  }

  @js.native
  trait ListFacesRequest extends js.Object {
    var CollectionId: CollectionId
    var MaxResults: js.UndefOr[PageSize]
    var NextToken: js.UndefOr[PaginationToken]
  }

  object ListFacesRequest {
    def apply(
        CollectionId: CollectionId,
        MaxResults: js.UndefOr[PageSize] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListFacesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CollectionId" -> CollectionId.asInstanceOf[js.Any],
        "MaxResults" -> MaxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListFacesRequest]
    }
  }

  @js.native
  trait ListFacesResponse extends js.Object {
    var FaceModelVersion: js.UndefOr[String]
    var Faces: js.UndefOr[FaceList]
    var NextToken: js.UndefOr[String]
  }

  object ListFacesResponse {
    def apply(
        FaceModelVersion: js.UndefOr[String] = js.undefined,
        Faces: js.UndefOr[FaceList] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListFacesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FaceModelVersion" -> FaceModelVersion.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Faces" -> Faces.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListFacesResponse]
    }
  }

  @js.native
  trait ListStreamProcessorsRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[PaginationToken]
  }

  object ListStreamProcessorsRequest {
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListStreamProcessorsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MaxResults" -> MaxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListStreamProcessorsRequest]
    }
  }

  @js.native
  trait ListStreamProcessorsResponse extends js.Object {
    var NextToken: js.UndefOr[PaginationToken]
    var StreamProcessors: js.UndefOr[StreamProcessorList]
  }

  object ListStreamProcessorsResponse {
    def apply(
        NextToken: js.UndefOr[PaginationToken] = js.undefined,
        StreamProcessors: js.UndefOr[StreamProcessorList] = js.undefined
    ): ListStreamProcessorsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "StreamProcessors" -> StreamProcessors.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListStreamProcessorsResponse]
    }
  }

  /**
    * Provides information about a single type of moderated content found in an image or video. Each type of moderated content has a label within a hierarchical taxonomy. For more information, see Detecting Unsafe Content in the Amazon Rekognition Developer Guide.
    */
  @js.native
  trait ModerationLabel extends js.Object {
    var Confidence: js.UndefOr[Percent]
    var Name: js.UndefOr[String]
    var ParentName: js.UndefOr[String]
  }

  object ModerationLabel {
    def apply(
        Confidence: js.UndefOr[Percent] = js.undefined,
        Name: js.UndefOr[String] = js.undefined,
        ParentName: js.UndefOr[String] = js.undefined
    ): ModerationLabel = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Confidence" -> Confidence.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ParentName" -> ParentName.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModerationLabel]
    }
  }

  /**
    * Indicates whether or not the mouth on the face is open, and the confidence level in the determination.
    */
  @js.native
  trait MouthOpen extends js.Object {
    var Confidence: js.UndefOr[Percent]
    var Value: js.UndefOr[Boolean]
  }

  object MouthOpen {
    def apply(
        Confidence: js.UndefOr[Percent] = js.undefined,
        Value: js.UndefOr[Boolean] = js.undefined
    ): MouthOpen = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Confidence" -> Confidence.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Value" -> Value.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MouthOpen]
    }
  }

  /**
    * Indicates whether or not the face has a mustache, and the confidence level in the determination.
    */
  @js.native
  trait Mustache extends js.Object {
    var Confidence: js.UndefOr[Percent]
    var Value: js.UndefOr[Boolean]
  }

  object Mustache {
    def apply(
        Confidence: js.UndefOr[Percent] = js.undefined,
        Value: js.UndefOr[Boolean] = js.undefined
    ): Mustache = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Confidence" -> Confidence.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Value" -> Value.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Mustache]
    }
  }

  /**
    * The Amazon Simple Notification Service topic to which Amazon Rekognition publishes the completion status of a video analysis operation. For more information, see <a>api-video</a>.
    */
  @js.native
  trait NotificationChannel extends js.Object {
    var RoleArn: RoleArn
    var SNSTopicArn: SNSTopicArn
  }

  object NotificationChannel {
    def apply(
        RoleArn: RoleArn,
        SNSTopicArn: SNSTopicArn
    ): NotificationChannel = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RoleArn"     -> RoleArn.asInstanceOf[js.Any],
        "SNSTopicArn" -> SNSTopicArn.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[NotificationChannel]
    }
  }

  object OrientationCorrectionEnum {
    val ROTATE_0   = "ROTATE_0"
    val ROTATE_90  = "ROTATE_90"
    val ROTATE_180 = "ROTATE_180"
    val ROTATE_270 = "ROTATE_270"

    val values = IndexedSeq(ROTATE_0, ROTATE_90, ROTATE_180, ROTATE_270)
  }

  /**
    * A parent label for a label. A label can have 0, 1, or more parents.
    */
  @js.native
  trait Parent extends js.Object {
    var Name: js.UndefOr[String]
  }

  object Parent {
    def apply(
        Name: js.UndefOr[String] = js.undefined
    ): Parent = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Parent]
    }
  }

  /**
    * Details about a person detected in a video analysis request.
    */
  @js.native
  trait PersonDetail extends js.Object {
    var BoundingBox: js.UndefOr[BoundingBox]
    var Face: js.UndefOr[FaceDetail]
    var Index: js.UndefOr[PersonIndex]
  }

  object PersonDetail {
    def apply(
        BoundingBox: js.UndefOr[BoundingBox] = js.undefined,
        Face: js.UndefOr[FaceDetail] = js.undefined,
        Index: js.UndefOr[PersonIndex] = js.undefined
    ): PersonDetail = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BoundingBox" -> BoundingBox.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Face" -> Face.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Index" -> Index.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PersonDetail]
    }
  }

  /**
    * Details and path tracking information for a single time a person's path is tracked in a video. Amazon Rekognition operations that track people's paths return an array of <code>PersonDetection</code> objects with elements for each time a person's path is tracked in a video.
    *  For more information, see GetPersonTracking in the Amazon Rekognition Developer Guide.
    */
  @js.native
  trait PersonDetection extends js.Object {
    var Person: js.UndefOr[PersonDetail]
    var Timestamp: js.UndefOr[Timestamp]
  }

  object PersonDetection {
    def apply(
        Person: js.UndefOr[PersonDetail] = js.undefined,
        Timestamp: js.UndefOr[Timestamp] = js.undefined
    ): PersonDetection = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Person" -> Person.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Timestamp" -> Timestamp.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PersonDetection]
    }
  }

  /**
    * Information about a person whose face matches a face(s) in an Amazon Rekognition collection. Includes information about the faces in the Amazon Rekognition collection (<a>FaceMatch</a>), information about the person (<a>PersonDetail</a>), and the time stamp for when the person was detected in a video. An array of <code>PersonMatch</code> objects is returned by <a>GetFaceSearch</a>.
    */
  @js.native
  trait PersonMatch extends js.Object {
    var FaceMatches: js.UndefOr[FaceMatchList]
    var Person: js.UndefOr[PersonDetail]
    var Timestamp: js.UndefOr[Timestamp]
  }

  object PersonMatch {
    def apply(
        FaceMatches: js.UndefOr[FaceMatchList] = js.undefined,
        Person: js.UndefOr[PersonDetail] = js.undefined,
        Timestamp: js.UndefOr[Timestamp] = js.undefined
    ): PersonMatch = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FaceMatches" -> FaceMatches.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Person" -> Person.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Timestamp" -> Timestamp.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PersonMatch]
    }
  }

  object PersonTrackingSortByEnum {
    val INDEX     = "INDEX"
    val TIMESTAMP = "TIMESTAMP"

    val values = IndexedSeq(INDEX, TIMESTAMP)
  }

  /**
    * The X and Y coordinates of a point on an image. The X and Y values returned are ratios of the overall image size. For example, if the input image is 700x200 and the operation returns X=0.5 and Y=0.25, then the point is at the (350,50) pixel coordinate on the image.
    *  An array of <code>Point</code> objects, <code>Polygon</code>, is returned by <a>DetectText</a>. <code>Polygon</code> represents a fine-grained polygon around detected text. For more information, see Geometry in the Amazon Rekognition Developer Guide.
    */
  @js.native
  trait Point extends js.Object {
    var X: js.UndefOr[Float]
    var Y: js.UndefOr[Float]
  }

  object Point {
    def apply(
        X: js.UndefOr[Float] = js.undefined,
        Y: js.UndefOr[Float] = js.undefined
    ): Point = {
      val _fields = IndexedSeq[(String, js.Any)](
        "X" -> X.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Y" -> Y.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Point]
    }
  }

  /**
    * Indicates the pose of the face as determined by its pitch, roll, and yaw.
    */
  @js.native
  trait Pose extends js.Object {
    var Pitch: js.UndefOr[Degree]
    var Roll: js.UndefOr[Degree]
    var Yaw: js.UndefOr[Degree]
  }

  object Pose {
    def apply(
        Pitch: js.UndefOr[Degree] = js.undefined,
        Roll: js.UndefOr[Degree] = js.undefined,
        Yaw: js.UndefOr[Degree] = js.undefined
    ): Pose = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Pitch" -> Pitch.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Roll" -> Roll.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Yaw" -> Yaw.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Pose]
    }
  }

  object QualityFilterEnum {
    val NONE = "NONE"
    val AUTO = "AUTO"

    val values = IndexedSeq(NONE, AUTO)
  }

  object ReasonEnum {
    val EXCEEDS_MAX_FACES  = "EXCEEDS_MAX_FACES"
    val EXTREME_POSE       = "EXTREME_POSE"
    val LOW_BRIGHTNESS     = "LOW_BRIGHTNESS"
    val LOW_SHARPNESS      = "LOW_SHARPNESS"
    val LOW_CONFIDENCE     = "LOW_CONFIDENCE"
    val SMALL_BOUNDING_BOX = "SMALL_BOUNDING_BOX"

    val values =
      IndexedSeq(EXCEEDS_MAX_FACES, EXTREME_POSE, LOW_BRIGHTNESS, LOW_SHARPNESS, LOW_CONFIDENCE, SMALL_BOUNDING_BOX)
  }

  @js.native
  trait RecognizeCelebritiesRequest extends js.Object {
    var Image: Image
  }

  object RecognizeCelebritiesRequest {
    def apply(
        Image: Image
    ): RecognizeCelebritiesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Image" -> Image.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RecognizeCelebritiesRequest]
    }
  }

  @js.native
  trait RecognizeCelebritiesResponse extends js.Object {
    var CelebrityFaces: js.UndefOr[CelebrityList]
    var OrientationCorrection: js.UndefOr[OrientationCorrection]
    var UnrecognizedFaces: js.UndefOr[ComparedFaceList]
  }

  object RecognizeCelebritiesResponse {
    def apply(
        CelebrityFaces: js.UndefOr[CelebrityList] = js.undefined,
        OrientationCorrection: js.UndefOr[OrientationCorrection] = js.undefined,
        UnrecognizedFaces: js.UndefOr[ComparedFaceList] = js.undefined
    ): RecognizeCelebritiesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CelebrityFaces" -> CelebrityFaces.map { x =>
          x.asInstanceOf[js.Any]
        },
        "OrientationCorrection" -> OrientationCorrection.map { x =>
          x.asInstanceOf[js.Any]
        },
        "UnrecognizedFaces" -> UnrecognizedFaces.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RecognizeCelebritiesResponse]
    }
  }

  /**
    * Provides the S3 bucket name and object name.
    *  The region for the S3 bucket containing the S3 object must match the region you use for Amazon Rekognition operations.
    *  For Amazon Rekognition to process an S3 object, the user must have permission to access the S3 object. For more information, see Resource-Based Policies in the Amazon Rekognition Developer Guide.
    */
  @js.native
  trait S3Object extends js.Object {
    var Bucket: js.UndefOr[S3Bucket]
    var Name: js.UndefOr[S3ObjectName]
    var Version: js.UndefOr[S3ObjectVersion]
  }

  object S3Object {
    def apply(
        Bucket: js.UndefOr[S3Bucket] = js.undefined,
        Name: js.UndefOr[S3ObjectName] = js.undefined,
        Version: js.UndefOr[S3ObjectVersion] = js.undefined
    ): S3Object = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Bucket" -> Bucket.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Version" -> Version.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[S3Object]
    }
  }

  @js.native
  trait SearchFacesByImageRequest extends js.Object {
    var CollectionId: CollectionId
    var Image: Image
    var FaceMatchThreshold: js.UndefOr[Percent]
    var MaxFaces: js.UndefOr[MaxFaces]
  }

  object SearchFacesByImageRequest {
    def apply(
        CollectionId: CollectionId,
        Image: Image,
        FaceMatchThreshold: js.UndefOr[Percent] = js.undefined,
        MaxFaces: js.UndefOr[MaxFaces] = js.undefined
    ): SearchFacesByImageRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CollectionId" -> CollectionId.asInstanceOf[js.Any],
        "Image"        -> Image.asInstanceOf[js.Any],
        "FaceMatchThreshold" -> FaceMatchThreshold.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MaxFaces" -> MaxFaces.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SearchFacesByImageRequest]
    }
  }

  @js.native
  trait SearchFacesByImageResponse extends js.Object {
    var FaceMatches: js.UndefOr[FaceMatchList]
    var FaceModelVersion: js.UndefOr[String]
    var SearchedFaceBoundingBox: js.UndefOr[BoundingBox]
    var SearchedFaceConfidence: js.UndefOr[Percent]
  }

  object SearchFacesByImageResponse {
    def apply(
        FaceMatches: js.UndefOr[FaceMatchList] = js.undefined,
        FaceModelVersion: js.UndefOr[String] = js.undefined,
        SearchedFaceBoundingBox: js.UndefOr[BoundingBox] = js.undefined,
        SearchedFaceConfidence: js.UndefOr[Percent] = js.undefined
    ): SearchFacesByImageResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FaceMatches" -> FaceMatches.map { x =>
          x.asInstanceOf[js.Any]
        },
        "FaceModelVersion" -> FaceModelVersion.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SearchedFaceBoundingBox" -> SearchedFaceBoundingBox.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SearchedFaceConfidence" -> SearchedFaceConfidence.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SearchFacesByImageResponse]
    }
  }

  @js.native
  trait SearchFacesRequest extends js.Object {
    var CollectionId: CollectionId
    var FaceId: FaceId
    var FaceMatchThreshold: js.UndefOr[Percent]
    var MaxFaces: js.UndefOr[MaxFaces]
  }

  object SearchFacesRequest {
    def apply(
        CollectionId: CollectionId,
        FaceId: FaceId,
        FaceMatchThreshold: js.UndefOr[Percent] = js.undefined,
        MaxFaces: js.UndefOr[MaxFaces] = js.undefined
    ): SearchFacesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CollectionId" -> CollectionId.asInstanceOf[js.Any],
        "FaceId"       -> FaceId.asInstanceOf[js.Any],
        "FaceMatchThreshold" -> FaceMatchThreshold.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MaxFaces" -> MaxFaces.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SearchFacesRequest]
    }
  }

  @js.native
  trait SearchFacesResponse extends js.Object {
    var FaceMatches: js.UndefOr[FaceMatchList]
    var FaceModelVersion: js.UndefOr[String]
    var SearchedFaceId: js.UndefOr[FaceId]
  }

  object SearchFacesResponse {
    def apply(
        FaceMatches: js.UndefOr[FaceMatchList] = js.undefined,
        FaceModelVersion: js.UndefOr[String] = js.undefined,
        SearchedFaceId: js.UndefOr[FaceId] = js.undefined
    ): SearchFacesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FaceMatches" -> FaceMatches.map { x =>
          x.asInstanceOf[js.Any]
        },
        "FaceModelVersion" -> FaceModelVersion.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SearchedFaceId" -> SearchedFaceId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SearchFacesResponse]
    }
  }

  /**
    * Indicates whether or not the face is smiling, and the confidence level in the determination.
    */
  @js.native
  trait Smile extends js.Object {
    var Confidence: js.UndefOr[Percent]
    var Value: js.UndefOr[Boolean]
  }

  object Smile {
    def apply(
        Confidence: js.UndefOr[Percent] = js.undefined,
        Value: js.UndefOr[Boolean] = js.undefined
    ): Smile = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Confidence" -> Confidence.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Value" -> Value.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Smile]
    }
  }

  @js.native
  trait StartCelebrityRecognitionRequest extends js.Object {
    var Video: Video
    var ClientRequestToken: js.UndefOr[ClientRequestToken]
    var JobTag: js.UndefOr[JobTag]
    var NotificationChannel: js.UndefOr[NotificationChannel]
  }

  object StartCelebrityRecognitionRequest {
    def apply(
        Video: Video,
        ClientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined,
        JobTag: js.UndefOr[JobTag] = js.undefined,
        NotificationChannel: js.UndefOr[NotificationChannel] = js.undefined
    ): StartCelebrityRecognitionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Video" -> Video.asInstanceOf[js.Any],
        "ClientRequestToken" -> ClientRequestToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "JobTag" -> JobTag.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NotificationChannel" -> NotificationChannel.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartCelebrityRecognitionRequest]
    }
  }

  @js.native
  trait StartCelebrityRecognitionResponse extends js.Object {
    var JobId: js.UndefOr[JobId]
  }

  object StartCelebrityRecognitionResponse {
    def apply(
        JobId: js.UndefOr[JobId] = js.undefined
    ): StartCelebrityRecognitionResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "JobId" -> JobId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartCelebrityRecognitionResponse]
    }
  }

  @js.native
  trait StartContentModerationRequest extends js.Object {
    var Video: Video
    var ClientRequestToken: js.UndefOr[ClientRequestToken]
    var JobTag: js.UndefOr[JobTag]
    var MinConfidence: js.UndefOr[Percent]
    var NotificationChannel: js.UndefOr[NotificationChannel]
  }

  object StartContentModerationRequest {
    def apply(
        Video: Video,
        ClientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined,
        JobTag: js.UndefOr[JobTag] = js.undefined,
        MinConfidence: js.UndefOr[Percent] = js.undefined,
        NotificationChannel: js.UndefOr[NotificationChannel] = js.undefined
    ): StartContentModerationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Video" -> Video.asInstanceOf[js.Any],
        "ClientRequestToken" -> ClientRequestToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "JobTag" -> JobTag.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MinConfidence" -> MinConfidence.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NotificationChannel" -> NotificationChannel.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartContentModerationRequest]
    }
  }

  @js.native
  trait StartContentModerationResponse extends js.Object {
    var JobId: js.UndefOr[JobId]
  }

  object StartContentModerationResponse {
    def apply(
        JobId: js.UndefOr[JobId] = js.undefined
    ): StartContentModerationResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "JobId" -> JobId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartContentModerationResponse]
    }
  }

  @js.native
  trait StartFaceDetectionRequest extends js.Object {
    var Video: Video
    var ClientRequestToken: js.UndefOr[ClientRequestToken]
    var FaceAttributes: js.UndefOr[FaceAttributes]
    var JobTag: js.UndefOr[JobTag]
    var NotificationChannel: js.UndefOr[NotificationChannel]
  }

  object StartFaceDetectionRequest {
    def apply(
        Video: Video,
        ClientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined,
        FaceAttributes: js.UndefOr[FaceAttributes] = js.undefined,
        JobTag: js.UndefOr[JobTag] = js.undefined,
        NotificationChannel: js.UndefOr[NotificationChannel] = js.undefined
    ): StartFaceDetectionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Video" -> Video.asInstanceOf[js.Any],
        "ClientRequestToken" -> ClientRequestToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "FaceAttributes" -> FaceAttributes.map { x =>
          x.asInstanceOf[js.Any]
        },
        "JobTag" -> JobTag.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NotificationChannel" -> NotificationChannel.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartFaceDetectionRequest]
    }
  }

  @js.native
  trait StartFaceDetectionResponse extends js.Object {
    var JobId: js.UndefOr[JobId]
  }

  object StartFaceDetectionResponse {
    def apply(
        JobId: js.UndefOr[JobId] = js.undefined
    ): StartFaceDetectionResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "JobId" -> JobId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartFaceDetectionResponse]
    }
  }

  @js.native
  trait StartFaceSearchRequest extends js.Object {
    var CollectionId: CollectionId
    var Video: Video
    var ClientRequestToken: js.UndefOr[ClientRequestToken]
    var FaceMatchThreshold: js.UndefOr[Percent]
    var JobTag: js.UndefOr[JobTag]
    var NotificationChannel: js.UndefOr[NotificationChannel]
  }

  object StartFaceSearchRequest {
    def apply(
        CollectionId: CollectionId,
        Video: Video,
        ClientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined,
        FaceMatchThreshold: js.UndefOr[Percent] = js.undefined,
        JobTag: js.UndefOr[JobTag] = js.undefined,
        NotificationChannel: js.UndefOr[NotificationChannel] = js.undefined
    ): StartFaceSearchRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CollectionId" -> CollectionId.asInstanceOf[js.Any],
        "Video"        -> Video.asInstanceOf[js.Any],
        "ClientRequestToken" -> ClientRequestToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "FaceMatchThreshold" -> FaceMatchThreshold.map { x =>
          x.asInstanceOf[js.Any]
        },
        "JobTag" -> JobTag.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NotificationChannel" -> NotificationChannel.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartFaceSearchRequest]
    }
  }

  @js.native
  trait StartFaceSearchResponse extends js.Object {
    var JobId: js.UndefOr[JobId]
  }

  object StartFaceSearchResponse {
    def apply(
        JobId: js.UndefOr[JobId] = js.undefined
    ): StartFaceSearchResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "JobId" -> JobId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartFaceSearchResponse]
    }
  }

  @js.native
  trait StartLabelDetectionRequest extends js.Object {
    var Video: Video
    var ClientRequestToken: js.UndefOr[ClientRequestToken]
    var JobTag: js.UndefOr[JobTag]
    var MinConfidence: js.UndefOr[Percent]
    var NotificationChannel: js.UndefOr[NotificationChannel]
  }

  object StartLabelDetectionRequest {
    def apply(
        Video: Video,
        ClientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined,
        JobTag: js.UndefOr[JobTag] = js.undefined,
        MinConfidence: js.UndefOr[Percent] = js.undefined,
        NotificationChannel: js.UndefOr[NotificationChannel] = js.undefined
    ): StartLabelDetectionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Video" -> Video.asInstanceOf[js.Any],
        "ClientRequestToken" -> ClientRequestToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "JobTag" -> JobTag.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MinConfidence" -> MinConfidence.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NotificationChannel" -> NotificationChannel.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartLabelDetectionRequest]
    }
  }

  @js.native
  trait StartLabelDetectionResponse extends js.Object {
    var JobId: js.UndefOr[JobId]
  }

  object StartLabelDetectionResponse {
    def apply(
        JobId: js.UndefOr[JobId] = js.undefined
    ): StartLabelDetectionResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "JobId" -> JobId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartLabelDetectionResponse]
    }
  }

  @js.native
  trait StartPersonTrackingRequest extends js.Object {
    var Video: Video
    var ClientRequestToken: js.UndefOr[ClientRequestToken]
    var JobTag: js.UndefOr[JobTag]
    var NotificationChannel: js.UndefOr[NotificationChannel]
  }

  object StartPersonTrackingRequest {
    def apply(
        Video: Video,
        ClientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined,
        JobTag: js.UndefOr[JobTag] = js.undefined,
        NotificationChannel: js.UndefOr[NotificationChannel] = js.undefined
    ): StartPersonTrackingRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Video" -> Video.asInstanceOf[js.Any],
        "ClientRequestToken" -> ClientRequestToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "JobTag" -> JobTag.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NotificationChannel" -> NotificationChannel.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartPersonTrackingRequest]
    }
  }

  @js.native
  trait StartPersonTrackingResponse extends js.Object {
    var JobId: js.UndefOr[JobId]
  }

  object StartPersonTrackingResponse {
    def apply(
        JobId: js.UndefOr[JobId] = js.undefined
    ): StartPersonTrackingResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "JobId" -> JobId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartPersonTrackingResponse]
    }
  }

  @js.native
  trait StartStreamProcessorRequest extends js.Object {
    var Name: StreamProcessorName
  }

  object StartStreamProcessorRequest {
    def apply(
        Name: StreamProcessorName
    ): StartStreamProcessorRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartStreamProcessorRequest]
    }
  }

  @js.native
  trait StartStreamProcessorResponse extends js.Object {}

  object StartStreamProcessorResponse {
    def apply(
        ): StartStreamProcessorResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartStreamProcessorResponse]
    }
  }

  @js.native
  trait StopStreamProcessorRequest extends js.Object {
    var Name: StreamProcessorName
  }

  object StopStreamProcessorRequest {
    def apply(
        Name: StreamProcessorName
    ): StopStreamProcessorRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StopStreamProcessorRequest]
    }
  }

  @js.native
  trait StopStreamProcessorResponse extends js.Object {}

  object StopStreamProcessorResponse {
    def apply(
        ): StopStreamProcessorResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StopStreamProcessorResponse]
    }
  }

  /**
    * An object that recognizes faces in a streaming video. An Amazon Rekognition stream processor is created by a call to <a>CreateStreamProcessor</a>. The request parameters for <code>CreateStreamProcessor</code> describe the Kinesis video stream source for the streaming video, face recognition parameters, and where to stream the analysis resullts.
    */
  @js.native
  trait StreamProcessor extends js.Object {
    var Name: js.UndefOr[StreamProcessorName]
    var Status: js.UndefOr[StreamProcessorStatus]
  }

  object StreamProcessor {
    def apply(
        Name: js.UndefOr[StreamProcessorName] = js.undefined,
        Status: js.UndefOr[StreamProcessorStatus] = js.undefined
    ): StreamProcessor = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Status" -> Status.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StreamProcessor]
    }
  }

  /**
    * Information about the source streaming video.
    */
  @js.native
  trait StreamProcessorInput extends js.Object {
    var KinesisVideoStream: js.UndefOr[KinesisVideoStream]
  }

  object StreamProcessorInput {
    def apply(
        KinesisVideoStream: js.UndefOr[KinesisVideoStream] = js.undefined
    ): StreamProcessorInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "KinesisVideoStream" -> KinesisVideoStream.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StreamProcessorInput]
    }
  }

  /**
    * Information about the Amazon Kinesis Data Streams stream to which a Amazon Rekognition Video stream processor streams the results of a video analysis. For more information, see CreateStreamProcessor in the Amazon Rekognition Developer Guide.
    */
  @js.native
  trait StreamProcessorOutput extends js.Object {
    var KinesisDataStream: js.UndefOr[KinesisDataStream]
  }

  object StreamProcessorOutput {
    def apply(
        KinesisDataStream: js.UndefOr[KinesisDataStream] = js.undefined
    ): StreamProcessorOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "KinesisDataStream" -> KinesisDataStream.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StreamProcessorOutput]
    }
  }

  /**
    * Input parameters used to recognize faces in a streaming video analyzed by a Amazon Rekognition stream processor.
    */
  @js.native
  trait StreamProcessorSettings extends js.Object {
    var FaceSearch: js.UndefOr[FaceSearchSettings]
  }

  object StreamProcessorSettings {
    def apply(
        FaceSearch: js.UndefOr[FaceSearchSettings] = js.undefined
    ): StreamProcessorSettings = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FaceSearch" -> FaceSearch.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StreamProcessorSettings]
    }
  }

  object StreamProcessorStatusEnum {
    val STOPPED  = "STOPPED"
    val STARTING = "STARTING"
    val RUNNING  = "RUNNING"
    val FAILED   = "FAILED"
    val STOPPING = "STOPPING"

    val values = IndexedSeq(STOPPED, STARTING, RUNNING, FAILED, STOPPING)
  }

  /**
    * Indicates whether or not the face is wearing sunglasses, and the confidence level in the determination.
    */
  @js.native
  trait Sunglasses extends js.Object {
    var Confidence: js.UndefOr[Percent]
    var Value: js.UndefOr[Boolean]
  }

  object Sunglasses {
    def apply(
        Confidence: js.UndefOr[Percent] = js.undefined,
        Value: js.UndefOr[Boolean] = js.undefined
    ): Sunglasses = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Confidence" -> Confidence.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Value" -> Value.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Sunglasses]
    }
  }

  /**
    * Information about a word or line of text detected by <a>DetectText</a>.
    *  The <code>DetectedText</code> field contains the text that Amazon Rekognition detected in the image.
    *  Every word and line has an identifier (<code>Id</code>). Each word belongs to a line and has a parent identifier (<code>ParentId</code>) that identifies the line of text in which the word appears. The word <code>Id</code> is also an index for the word within a line of words.
    *  For more information, see Detecting Text in the Amazon Rekognition Developer Guide.
    */
  @js.native
  trait TextDetection extends js.Object {
    var Confidence: js.UndefOr[Percent]
    var DetectedText: js.UndefOr[String]
    var Geometry: js.UndefOr[Geometry]
    var Id: js.UndefOr[UInteger]
    var ParentId: js.UndefOr[UInteger]
    var Type: js.UndefOr[TextTypes]
  }

  object TextDetection {
    def apply(
        Confidence: js.UndefOr[Percent] = js.undefined,
        DetectedText: js.UndefOr[String] = js.undefined,
        Geometry: js.UndefOr[Geometry] = js.undefined,
        Id: js.UndefOr[UInteger] = js.undefined,
        ParentId: js.UndefOr[UInteger] = js.undefined,
        Type: js.UndefOr[TextTypes] = js.undefined
    ): TextDetection = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Confidence" -> Confidence.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DetectedText" -> DetectedText.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Geometry" -> Geometry.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Id" -> Id.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ParentId" -> ParentId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Type" -> Type.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TextDetection]
    }
  }

  object TextTypesEnum {
    val LINE = "LINE"
    val WORD = "WORD"

    val values = IndexedSeq(LINE, WORD)
  }

  /**
    * A face that <a>IndexFaces</a> detected, but didn't index. Use the <code>Reasons</code> response attribute to determine why a face wasn't indexed.
    */
  @js.native
  trait UnindexedFace extends js.Object {
    var FaceDetail: js.UndefOr[FaceDetail]
    var Reasons: js.UndefOr[Reasons]
  }

  object UnindexedFace {
    def apply(
        FaceDetail: js.UndefOr[FaceDetail] = js.undefined,
        Reasons: js.UndefOr[Reasons] = js.undefined
    ): UnindexedFace = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FaceDetail" -> FaceDetail.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Reasons" -> Reasons.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UnindexedFace]
    }
  }

  /**
    * Video file stored in an Amazon S3 bucket. Amazon Rekognition video start operations such as <a>StartLabelDetection</a> use <code>Video</code> to specify a video for analysis. The supported file formats are .mp4, .mov and .avi.
    */
  @js.native
  trait Video extends js.Object {
    var S3Object: js.UndefOr[S3Object]
  }

  object Video {
    def apply(
        S3Object: js.UndefOr[S3Object] = js.undefined
    ): Video = {
      val _fields = IndexedSeq[(String, js.Any)](
        "S3Object" -> S3Object.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Video]
    }
  }

  object VideoJobStatusEnum {
    val IN_PROGRESS = "IN_PROGRESS"
    val SUCCEEDED   = "SUCCEEDED"
    val FAILED      = "FAILED"

    val values = IndexedSeq(IN_PROGRESS, SUCCEEDED, FAILED)
  }

  /**
    * Information about a video that Amazon Rekognition analyzed. <code>Videometadata</code> is returned in every page of paginated responses from a Amazon Rekognition video operation.
    */
  @js.native
  trait VideoMetadata extends js.Object {
    var Codec: js.UndefOr[String]
    var DurationMillis: js.UndefOr[ULong]
    var Format: js.UndefOr[String]
    var FrameHeight: js.UndefOr[ULong]
    var FrameRate: js.UndefOr[Float]
    var FrameWidth: js.UndefOr[ULong]
  }

  object VideoMetadata {
    def apply(
        Codec: js.UndefOr[String] = js.undefined,
        DurationMillis: js.UndefOr[ULong] = js.undefined,
        Format: js.UndefOr[String] = js.undefined,
        FrameHeight: js.UndefOr[ULong] = js.undefined,
        FrameRate: js.UndefOr[Float] = js.undefined,
        FrameWidth: js.UndefOr[ULong] = js.undefined
    ): VideoMetadata = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Codec" -> Codec.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DurationMillis" -> DurationMillis.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Format" -> Format.map { x =>
          x.asInstanceOf[js.Any]
        },
        "FrameHeight" -> FrameHeight.map { x =>
          x.asInstanceOf[js.Any]
        },
        "FrameRate" -> FrameRate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "FrameWidth" -> FrameWidth.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VideoMetadata]
    }
  }
}
