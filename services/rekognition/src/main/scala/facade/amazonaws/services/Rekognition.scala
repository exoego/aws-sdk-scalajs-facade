package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object rekognition {
  type Assets                                         = js.Array[Asset]
  type Attributes                                     = js.Array[Attribute]
  type BoundingBoxHeight                              = Float
  type BoundingBoxWidth                               = Float
  type CelebrityList                                  = js.Array[Celebrity]
  type CelebrityRecognitions                          = js.Array[CelebrityRecognition]
  type ClientRequestToken                             = String
  type CollectionId                                   = String
  type CollectionIdList                               = js.Array[CollectionId]
  type CompareFacesMatchList                          = js.Array[CompareFacesMatch]
  type CompareFacesUnmatchList                        = js.Array[ComparedFace]
  type ComparedFaceList                               = js.Array[ComparedFace]
  type ContentClassifiers                             = js.Array[ContentClassifier]
  type ContentModerationDetections                    = js.Array[ContentModerationDetection]
  type CustomLabels                                   = js.Array[CustomLabel]
  type DateTime                                       = js.Date
  type Degree                                         = Float
  type Emotions                                       = js.Array[Emotion]
  type ExtendedPaginationToken                        = String
  type ExternalImageId                                = String
  type FaceDetailList                                 = js.Array[FaceDetail]
  type FaceDetections                                 = js.Array[FaceDetection]
  type FaceId                                         = String
  type FaceIdList                                     = js.Array[FaceId]
  type FaceList                                       = js.Array[Face]
  type FaceMatchList                                  = js.Array[FaceMatch]
  type FaceModelVersionList                           = js.Array[String]
  type FaceRecordList                                 = js.Array[FaceRecord]
  type FlowDefinitionArn                              = String
  type HumanLoopActivationConditionsEvaluationResults = String
  type HumanLoopActivationReason                      = String
  type HumanLoopActivationReasons                     = js.Array[HumanLoopActivationReason]
  type HumanLoopArn                                   = String
  type HumanLoopName                                  = String
  type ImageBlob                                      = js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type ImageId                                        = String
  type InferenceUnits                                 = Int
  type Instances                                      = js.Array[Instance]
  type JobId                                          = String
  type JobTag                                         = String
  type KinesisDataArn                                 = String
  type KinesisVideoArn                                = String
  type LabelDetections                                = js.Array[LabelDetection]
  type Labels                                         = js.Array[Label]
  type Landmarks                                      = js.Array[Landmark]
  type MaxFaces                                       = Int
  type MaxFacesToIndex                                = Int
  type MaxResults                                     = Int
  type ModerationLabels                               = js.Array[ModerationLabel]
  type PageSize                                       = Int
  type PaginationToken                                = String
  type Parents                                        = js.Array[Parent]
  type Percent                                        = Float
  type PersonDetections                               = js.Array[PersonDetection]
  type PersonIndex                                    = Double
  type PersonMatches                                  = js.Array[PersonMatch]
  type Polygon                                        = js.Array[Point]
  type ProjectArn                                     = String
  type ProjectDescriptions                            = js.Array[ProjectDescription]
  type ProjectName                                    = String
  type ProjectVersionArn                              = String
  type ProjectVersionDescriptions                     = js.Array[ProjectVersionDescription]
  type ProjectVersionsPageSize                        = Int
  type ProjectsPageSize                               = Int
  type Reasons                                        = js.Array[Reason]
  type RegionsOfInterest                              = js.Array[RegionOfInterest]
  type RekognitionUniqueId                            = String
  type RoleArn                                        = String
  type S3Bucket                                       = String
  type S3KeyPrefix                                    = String
  type S3ObjectName                                   = String
  type S3ObjectVersion                                = String
  type SNSTopicArn                                    = String
  type StatusMessage                                  = String
  type StreamProcessorArn                             = String
  type StreamProcessorList                            = js.Array[StreamProcessor]
  type StreamProcessorName                            = String
  type TextDetectionList                              = js.Array[TextDetection]
  type TextDetectionResults                           = js.Array[TextDetectionResult]
  type Timestamp                                      = Double
  type UInteger                                       = Int
  type ULong                                          = Double
  type UnindexedFaces                                 = js.Array[UnindexedFace]
  type Url                                            = String
  type Urls                                           = js.Array[Url]
  type VersionName                                    = String
  type VersionNames                                   = js.Array[VersionName]

  implicit final class RekognitionOps(private val service: Rekognition) extends AnyVal {

    @inline def compareFacesFuture(params: CompareFacesRequest): Future[CompareFacesResponse] =
      service.compareFaces(params).promise().toFuture
    @inline def createCollectionFuture(params: CreateCollectionRequest): Future[CreateCollectionResponse] =
      service.createCollection(params).promise().toFuture
    @inline def createProjectFuture(params: CreateProjectRequest): Future[CreateProjectResponse] =
      service.createProject(params).promise().toFuture
    @inline def createProjectVersionFuture(params: CreateProjectVersionRequest): Future[CreateProjectVersionResponse] =
      service.createProjectVersion(params).promise().toFuture
    @inline def createStreamProcessorFuture(
        params: CreateStreamProcessorRequest
    ): Future[CreateStreamProcessorResponse] = service.createStreamProcessor(params).promise().toFuture
    @inline def deleteCollectionFuture(params: DeleteCollectionRequest): Future[DeleteCollectionResponse] =
      service.deleteCollection(params).promise().toFuture
    @inline def deleteFacesFuture(params: DeleteFacesRequest): Future[DeleteFacesResponse] =
      service.deleteFaces(params).promise().toFuture
    @inline def deleteStreamProcessorFuture(
        params: DeleteStreamProcessorRequest
    ): Future[DeleteStreamProcessorResponse] = service.deleteStreamProcessor(params).promise().toFuture
    @inline def describeCollectionFuture(params: DescribeCollectionRequest): Future[DescribeCollectionResponse] =
      service.describeCollection(params).promise().toFuture
    @inline def describeProjectVersionsFuture(
        params: DescribeProjectVersionsRequest
    ): Future[DescribeProjectVersionsResponse] = service.describeProjectVersions(params).promise().toFuture
    @inline def describeProjectsFuture(params: DescribeProjectsRequest): Future[DescribeProjectsResponse] =
      service.describeProjects(params).promise().toFuture
    @inline def describeStreamProcessorFuture(
        params: DescribeStreamProcessorRequest
    ): Future[DescribeStreamProcessorResponse] = service.describeStreamProcessor(params).promise().toFuture
    @inline def detectCustomLabelsFuture(params: DetectCustomLabelsRequest): Future[DetectCustomLabelsResponse] =
      service.detectCustomLabels(params).promise().toFuture
    @inline def detectFacesFuture(params: DetectFacesRequest): Future[DetectFacesResponse] =
      service.detectFaces(params).promise().toFuture
    @inline def detectLabelsFuture(params: DetectLabelsRequest): Future[DetectLabelsResponse] =
      service.detectLabels(params).promise().toFuture
    @inline def detectModerationLabelsFuture(
        params: DetectModerationLabelsRequest
    ): Future[DetectModerationLabelsResponse] = service.detectModerationLabels(params).promise().toFuture
    @inline def detectTextFuture(params: DetectTextRequest): Future[DetectTextResponse] =
      service.detectText(params).promise().toFuture
    @inline def getCelebrityInfoFuture(params: GetCelebrityInfoRequest): Future[GetCelebrityInfoResponse] =
      service.getCelebrityInfo(params).promise().toFuture
    @inline def getCelebrityRecognitionFuture(
        params: GetCelebrityRecognitionRequest
    ): Future[GetCelebrityRecognitionResponse] = service.getCelebrityRecognition(params).promise().toFuture
    @inline def getContentModerationFuture(params: GetContentModerationRequest): Future[GetContentModerationResponse] =
      service.getContentModeration(params).promise().toFuture
    @inline def getFaceDetectionFuture(params: GetFaceDetectionRequest): Future[GetFaceDetectionResponse] =
      service.getFaceDetection(params).promise().toFuture
    @inline def getFaceSearchFuture(params: GetFaceSearchRequest): Future[GetFaceSearchResponse] =
      service.getFaceSearch(params).promise().toFuture
    @inline def getLabelDetectionFuture(params: GetLabelDetectionRequest): Future[GetLabelDetectionResponse] =
      service.getLabelDetection(params).promise().toFuture
    @inline def getPersonTrackingFuture(params: GetPersonTrackingRequest): Future[GetPersonTrackingResponse] =
      service.getPersonTracking(params).promise().toFuture
    @inline def getTextDetectionFuture(params: GetTextDetectionRequest): Future[GetTextDetectionResponse] =
      service.getTextDetection(params).promise().toFuture
    @inline def indexFacesFuture(params: IndexFacesRequest): Future[IndexFacesResponse] =
      service.indexFaces(params).promise().toFuture
    @inline def listCollectionsFuture(params: ListCollectionsRequest): Future[ListCollectionsResponse] =
      service.listCollections(params).promise().toFuture
    @inline def listFacesFuture(params: ListFacesRequest): Future[ListFacesResponse] =
      service.listFaces(params).promise().toFuture
    @inline def listStreamProcessorsFuture(params: ListStreamProcessorsRequest): Future[ListStreamProcessorsResponse] =
      service.listStreamProcessors(params).promise().toFuture
    @inline def recognizeCelebritiesFuture(params: RecognizeCelebritiesRequest): Future[RecognizeCelebritiesResponse] =
      service.recognizeCelebrities(params).promise().toFuture
    @inline def searchFacesByImageFuture(params: SearchFacesByImageRequest): Future[SearchFacesByImageResponse] =
      service.searchFacesByImage(params).promise().toFuture
    @inline def searchFacesFuture(params: SearchFacesRequest): Future[SearchFacesResponse] =
      service.searchFaces(params).promise().toFuture
    @inline def startCelebrityRecognitionFuture(
        params: StartCelebrityRecognitionRequest
    ): Future[StartCelebrityRecognitionResponse] = service.startCelebrityRecognition(params).promise().toFuture
    @inline def startContentModerationFuture(
        params: StartContentModerationRequest
    ): Future[StartContentModerationResponse] = service.startContentModeration(params).promise().toFuture
    @inline def startFaceDetectionFuture(params: StartFaceDetectionRequest): Future[StartFaceDetectionResponse] =
      service.startFaceDetection(params).promise().toFuture
    @inline def startFaceSearchFuture(params: StartFaceSearchRequest): Future[StartFaceSearchResponse] =
      service.startFaceSearch(params).promise().toFuture
    @inline def startLabelDetectionFuture(params: StartLabelDetectionRequest): Future[StartLabelDetectionResponse] =
      service.startLabelDetection(params).promise().toFuture
    @inline def startPersonTrackingFuture(params: StartPersonTrackingRequest): Future[StartPersonTrackingResponse] =
      service.startPersonTracking(params).promise().toFuture
    @inline def startProjectVersionFuture(params: StartProjectVersionRequest): Future[StartProjectVersionResponse] =
      service.startProjectVersion(params).promise().toFuture
    @inline def startStreamProcessorFuture(params: StartStreamProcessorRequest): Future[StartStreamProcessorResponse] =
      service.startStreamProcessor(params).promise().toFuture
    @inline def startTextDetectionFuture(params: StartTextDetectionRequest): Future[StartTextDetectionResponse] =
      service.startTextDetection(params).promise().toFuture
    @inline def stopProjectVersionFuture(params: StopProjectVersionRequest): Future[StopProjectVersionResponse] =
      service.stopProjectVersion(params).promise().toFuture
    @inline def stopStreamProcessorFuture(params: StopStreamProcessorRequest): Future[StopStreamProcessorResponse] =
      service.stopStreamProcessor(params).promise().toFuture
  }
}

package rekognition {
  @js.native
  @JSImport("aws-sdk", "Rekognition")
  class Rekognition() extends js.Object {
    def this(config: AWSConfig) = this()

    def compareFaces(params: CompareFacesRequest): Request[CompareFacesResponse]                            = js.native
    def createCollection(params: CreateCollectionRequest): Request[CreateCollectionResponse]                = js.native
    def createProject(params: CreateProjectRequest): Request[CreateProjectResponse]                         = js.native
    def createProjectVersion(params: CreateProjectVersionRequest): Request[CreateProjectVersionResponse]    = js.native
    def createStreamProcessor(params: CreateStreamProcessorRequest): Request[CreateStreamProcessorResponse] = js.native
    def deleteCollection(params: DeleteCollectionRequest): Request[DeleteCollectionResponse]                = js.native
    def deleteFaces(params: DeleteFacesRequest): Request[DeleteFacesResponse]                               = js.native
    def deleteStreamProcessor(params: DeleteStreamProcessorRequest): Request[DeleteStreamProcessorResponse] = js.native
    def describeCollection(params: DescribeCollectionRequest): Request[DescribeCollectionResponse]          = js.native
    def describeProjectVersions(params: DescribeProjectVersionsRequest): Request[DescribeProjectVersionsResponse] =
      js.native
    def describeProjects(params: DescribeProjectsRequest): Request[DescribeProjectsResponse] = js.native
    def describeStreamProcessor(params: DescribeStreamProcessorRequest): Request[DescribeStreamProcessorResponse] =
      js.native
    def detectCustomLabels(params: DetectCustomLabelsRequest): Request[DetectCustomLabelsResponse] = js.native
    def detectFaces(params: DetectFacesRequest): Request[DetectFacesResponse]                      = js.native
    def detectLabels(params: DetectLabelsRequest): Request[DetectLabelsResponse]                   = js.native
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
    def getTextDetection(params: GetTextDetectionRequest): Request[GetTextDetectionResponse]             = js.native
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
    def startProjectVersion(params: StartProjectVersionRequest): Request[StartProjectVersionResponse]    = js.native
    def startStreamProcessor(params: StartStreamProcessorRequest): Request[StartStreamProcessorResponse] = js.native
    def startTextDetection(params: StartTextDetectionRequest): Request[StartTextDetectionResponse]       = js.native
    def stopProjectVersion(params: StopProjectVersionRequest): Request[StopProjectVersionResponse]       = js.native
    def stopStreamProcessor(params: StopStreamProcessorRequest): Request[StopStreamProcessorResponse]    = js.native
  }

  /**
    * Structure containing the estimated age range, in years, for a face.
    *  Amazon Rekognition estimates an age range for faces detected in the input image. Estimated age ranges can overlap. A face of a 5-year-old might have an estimated range of 4-6, while the face of a 6-year-old might have an estimated range of 4-8.
    */
  @js.native
  @Factory
  trait AgeRange extends js.Object {
    var High: js.UndefOr[UInteger]
    var Low: js.UndefOr[UInteger]
  }

  /**
    * Assets are the images that you use to train and evaluate a model version. Assets are referenced by Sagemaker GroundTruth manifest files.
    */
  @js.native
  @Factory
  trait Asset extends js.Object {
    var GroundTruthManifest: js.UndefOr[GroundTruthManifest]
  }

  @js.native
  sealed trait Attribute extends js.Any
  object Attribute extends js.Object {
    val DEFAULT = "DEFAULT".asInstanceOf[Attribute]
    val ALL     = "ALL".asInstanceOf[Attribute]

    val values = js.Object.freeze(js.Array(DEFAULT, ALL))
  }

  /**
    * Indicates whether or not the face has a beard, and the confidence level in the determination.
    */
  @js.native
  @Factory
  trait Beard extends js.Object {
    var Confidence: js.UndefOr[Percent]
    var Value: js.UndefOr[Boolean]
  }

  /**
    * Identifies the bounding box around the label, face, or text. The <code>left</code> (x-coordinate) and <code>top</code> (y-coordinate) are coordinates representing the top and left sides of the bounding box. Note that the upper-left corner of the image is the origin (0,0).
    *  The <code>top</code> and <code>left</code> values returned are ratios of the overall image size. For example, if the input image is 700x200 pixels, and the top-left coordinate of the bounding box is 350x50 pixels, the API returns a <code>left</code> value of 0.5 (350/700) and a <code>top</code> value of 0.25 (50/200).
    *  The <code>width</code> and <code>height</code> values represent the dimensions of the bounding box as a ratio of the overall image dimension. For example, if the input image is 700x200 pixels, and the bounding box width is 70 pixels, the width returned is 0.1.
    *
    * '''Note:'''The bounding box coordinates can have negative values. For example, if Amazon Rekognition is able to detect a face that is at the image edge and is only partially visible, the service can return coordinates that are outside the image bounds and, depending on the image edge, you might get negative values or values greater than 1 for the <code>left</code> or <code>top</code> values.
    */
  @js.native
  @Factory
  trait BoundingBox extends js.Object {
    var Height: js.UndefOr[Float]
    var Left: js.UndefOr[Float]
    var Top: js.UndefOr[Float]
    var Width: js.UndefOr[Float]
  }

  /**
    * Provides information about a celebrity recognized by the <a>RecognizeCelebrities</a> operation.
    */
  @js.native
  @Factory
  trait Celebrity extends js.Object {
    var Face: js.UndefOr[ComparedFace]
    var Id: js.UndefOr[RekognitionUniqueId]
    var MatchConfidence: js.UndefOr[Percent]
    var Name: js.UndefOr[String]
    var Urls: js.UndefOr[Urls]
  }

  /**
    * Information about a recognized celebrity.
    */
  @js.native
  @Factory
  trait CelebrityDetail extends js.Object {
    var BoundingBox: js.UndefOr[BoundingBox]
    var Confidence: js.UndefOr[Percent]
    var Face: js.UndefOr[FaceDetail]
    var Id: js.UndefOr[RekognitionUniqueId]
    var Name: js.UndefOr[String]
    var Urls: js.UndefOr[Urls]
  }

  /**
    * Information about a detected celebrity and the time the celebrity was detected in a stored video. For more information, see GetCelebrityRecognition in the Amazon Rekognition Developer Guide.
    */
  @js.native
  @Factory
  trait CelebrityRecognition extends js.Object {
    var Celebrity: js.UndefOr[CelebrityDetail]
    var Timestamp: js.UndefOr[Timestamp]
  }

  @js.native
  sealed trait CelebrityRecognitionSortBy extends js.Any
  object CelebrityRecognitionSortBy extends js.Object {
    val ID        = "ID".asInstanceOf[CelebrityRecognitionSortBy]
    val TIMESTAMP = "TIMESTAMP".asInstanceOf[CelebrityRecognitionSortBy]

    val values = js.Object.freeze(js.Array(ID, TIMESTAMP))
  }

  /**
    * Provides information about a face in a target image that matches the source image face analyzed by <code>CompareFaces</code>. The <code>Face</code> property contains the bounding box of the face in the target image. The <code>Similarity</code> property is the confidence that the source image face matches the face in the bounding box.
    */
  @js.native
  @Factory
  trait CompareFacesMatch extends js.Object {
    var Face: js.UndefOr[ComparedFace]
    var Similarity: js.UndefOr[Percent]
  }

  @js.native
  @Factory
  trait CompareFacesRequest extends js.Object {
    var SourceImage: Image
    var TargetImage: Image
    var QualityFilter: js.UndefOr[QualityFilter]
    var SimilarityThreshold: js.UndefOr[Percent]
  }

  @js.native
  @Factory
  trait CompareFacesResponse extends js.Object {
    var FaceMatches: js.UndefOr[CompareFacesMatchList]
    var SourceImageFace: js.UndefOr[ComparedSourceImageFace]
    var SourceImageOrientationCorrection: js.UndefOr[OrientationCorrection]
    var TargetImageOrientationCorrection: js.UndefOr[OrientationCorrection]
    var UnmatchedFaces: js.UndefOr[CompareFacesUnmatchList]
  }

  /**
    * Provides face metadata for target image faces that are analyzed by <code>CompareFaces</code> and <code>RecognizeCelebrities</code>.
    */
  @js.native
  @Factory
  trait ComparedFace extends js.Object {
    var BoundingBox: js.UndefOr[BoundingBox]
    var Confidence: js.UndefOr[Percent]
    var Landmarks: js.UndefOr[Landmarks]
    var Pose: js.UndefOr[Pose]
    var Quality: js.UndefOr[ImageQuality]
  }

  /**
    * Type that describes the face Amazon Rekognition chose to compare with the faces in the target. This contains a bounding box for the selected face and confidence level that the bounding box contains a face. Note that Amazon Rekognition selects the largest face in the source image for this comparison.
    */
  @js.native
  @Factory
  trait ComparedSourceImageFace extends js.Object {
    var BoundingBox: js.UndefOr[BoundingBox]
    var Confidence: js.UndefOr[Percent]
  }

  @js.native
  sealed trait ContentClassifier extends js.Any
  object ContentClassifier extends js.Object {
    val FreeOfPersonallyIdentifiableInformation =
      "FreeOfPersonallyIdentifiableInformation".asInstanceOf[ContentClassifier]
    val FreeOfAdultContent = "FreeOfAdultContent".asInstanceOf[ContentClassifier]

    val values = js.Object.freeze(js.Array(FreeOfPersonallyIdentifiableInformation, FreeOfAdultContent))
  }

  /**
    * Information about an unsafe content label detection in a stored video.
    */
  @js.native
  @Factory
  trait ContentModerationDetection extends js.Object {
    var ModerationLabel: js.UndefOr[ModerationLabel]
    var Timestamp: js.UndefOr[Timestamp]
  }

  @js.native
  sealed trait ContentModerationSortBy extends js.Any
  object ContentModerationSortBy extends js.Object {
    val NAME      = "NAME".asInstanceOf[ContentModerationSortBy]
    val TIMESTAMP = "TIMESTAMP".asInstanceOf[ContentModerationSortBy]

    val values = js.Object.freeze(js.Array(NAME, TIMESTAMP))
  }

  @js.native
  @Factory
  trait CreateCollectionRequest extends js.Object {
    var CollectionId: CollectionId
  }

  @js.native
  @Factory
  trait CreateCollectionResponse extends js.Object {
    var CollectionArn: js.UndefOr[String]
    var FaceModelVersion: js.UndefOr[String]
    var StatusCode: js.UndefOr[UInteger]
  }

  @js.native
  @Factory
  trait CreateProjectRequest extends js.Object {
    var ProjectName: ProjectName
  }

  @js.native
  @Factory
  trait CreateProjectResponse extends js.Object {
    var ProjectArn: js.UndefOr[ProjectArn]
  }

  @js.native
  @Factory
  trait CreateProjectVersionRequest extends js.Object {
    var OutputConfig: OutputConfig
    var ProjectArn: ProjectArn
    var TestingData: TestingData
    var TrainingData: TrainingData
    var VersionName: VersionName
  }

  @js.native
  @Factory
  trait CreateProjectVersionResponse extends js.Object {
    var ProjectVersionArn: js.UndefOr[ProjectVersionArn]
  }

  @js.native
  @Factory
  trait CreateStreamProcessorRequest extends js.Object {
    var Input: StreamProcessorInput
    var Name: StreamProcessorName
    var Output: StreamProcessorOutput
    var RoleArn: RoleArn
    var Settings: StreamProcessorSettings
  }

  @js.native
  @Factory
  trait CreateStreamProcessorResponse extends js.Object {
    var StreamProcessorArn: js.UndefOr[StreamProcessorArn]
  }

  /**
    * A custom label detected in an image by a call to <a>DetectCustomLabels</a>.
    */
  @js.native
  @Factory
  trait CustomLabel extends js.Object {
    var Confidence: js.UndefOr[Percent]
    var Geometry: js.UndefOr[Geometry]
    var Name: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait DeleteCollectionRequest extends js.Object {
    var CollectionId: CollectionId
  }

  @js.native
  @Factory
  trait DeleteCollectionResponse extends js.Object {
    var StatusCode: js.UndefOr[UInteger]
  }

  @js.native
  @Factory
  trait DeleteFacesRequest extends js.Object {
    var CollectionId: CollectionId
    var FaceIds: FaceIdList
  }

  @js.native
  @Factory
  trait DeleteFacesResponse extends js.Object {
    var DeletedFaces: js.UndefOr[FaceIdList]
  }

  @js.native
  @Factory
  trait DeleteStreamProcessorRequest extends js.Object {
    var Name: StreamProcessorName
  }

  @js.native
  @Factory
  trait DeleteStreamProcessorResponse extends js.Object {}

  @js.native
  @Factory
  trait DescribeCollectionRequest extends js.Object {
    var CollectionId: CollectionId
  }

  @js.native
  @Factory
  trait DescribeCollectionResponse extends js.Object {
    var CollectionARN: js.UndefOr[String]
    var CreationTimestamp: js.UndefOr[DateTime]
    var FaceCount: js.UndefOr[ULong]
    var FaceModelVersion: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait DescribeProjectVersionsRequest extends js.Object {
    var ProjectArn: ProjectArn
    var MaxResults: js.UndefOr[ProjectVersionsPageSize]
    var NextToken: js.UndefOr[ExtendedPaginationToken]
    var VersionNames: js.UndefOr[VersionNames]
  }

  @js.native
  @Factory
  trait DescribeProjectVersionsResponse extends js.Object {
    var NextToken: js.UndefOr[ExtendedPaginationToken]
    var ProjectVersionDescriptions: js.UndefOr[ProjectVersionDescriptions]
  }

  @js.native
  @Factory
  trait DescribeProjectsRequest extends js.Object {
    var MaxResults: js.UndefOr[ProjectsPageSize]
    var NextToken: js.UndefOr[ExtendedPaginationToken]
  }

  @js.native
  @Factory
  trait DescribeProjectsResponse extends js.Object {
    var NextToken: js.UndefOr[ExtendedPaginationToken]
    var ProjectDescriptions: js.UndefOr[ProjectDescriptions]
  }

  @js.native
  @Factory
  trait DescribeStreamProcessorRequest extends js.Object {
    var Name: StreamProcessorName
  }

  @js.native
  @Factory
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

  @js.native
  @Factory
  trait DetectCustomLabelsRequest extends js.Object {
    var Image: Image
    var ProjectVersionArn: ProjectVersionArn
    var MaxResults: js.UndefOr[UInteger]
    var MinConfidence: js.UndefOr[Percent]
  }

  @js.native
  @Factory
  trait DetectCustomLabelsResponse extends js.Object {
    var CustomLabels: js.UndefOr[CustomLabels]
  }

  @js.native
  @Factory
  trait DetectFacesRequest extends js.Object {
    var Image: Image
    var Attributes: js.UndefOr[Attributes]
  }

  @js.native
  @Factory
  trait DetectFacesResponse extends js.Object {
    var FaceDetails: js.UndefOr[FaceDetailList]
    var OrientationCorrection: js.UndefOr[OrientationCorrection]
  }

  @js.native
  @Factory
  trait DetectLabelsRequest extends js.Object {
    var Image: Image
    var MaxLabels: js.UndefOr[UInteger]
    var MinConfidence: js.UndefOr[Percent]
  }

  @js.native
  @Factory
  trait DetectLabelsResponse extends js.Object {
    var LabelModelVersion: js.UndefOr[String]
    var Labels: js.UndefOr[Labels]
    var OrientationCorrection: js.UndefOr[OrientationCorrection]
  }

  @js.native
  @Factory
  trait DetectModerationLabelsRequest extends js.Object {
    var Image: Image
    var HumanLoopConfig: js.UndefOr[HumanLoopConfig]
    var MinConfidence: js.UndefOr[Percent]
  }

  @js.native
  @Factory
  trait DetectModerationLabelsResponse extends js.Object {
    var HumanLoopActivationOutput: js.UndefOr[HumanLoopActivationOutput]
    var ModerationLabels: js.UndefOr[ModerationLabels]
    var ModerationModelVersion: js.UndefOr[String]
  }

  /**
    * A set of optional parameters that you can use to set the criteria that the text must meet to be included in your response. <code>WordFilter</code> looks at a word’s height, width, and minimum confidence. <code>RegionOfInterest</code> lets you set a specific region of the image to look for text in.
    */
  @js.native
  @Factory
  trait DetectTextFilters extends js.Object {
    var RegionsOfInterest: js.UndefOr[RegionsOfInterest]
    var WordFilter: js.UndefOr[DetectionFilter]
  }

  @js.native
  @Factory
  trait DetectTextRequest extends js.Object {
    var Image: Image
    var Filters: js.UndefOr[DetectTextFilters]
  }

  @js.native
  @Factory
  trait DetectTextResponse extends js.Object {
    var TextDetections: js.UndefOr[TextDetectionList]
    var TextModelVersion: js.UndefOr[String]
  }

  /**
    * A set of parameters that allow you to filter out certain results from your returned results.
    */
  @js.native
  @Factory
  trait DetectionFilter extends js.Object {
    var MinBoundingBoxHeight: js.UndefOr[BoundingBoxHeight]
    var MinBoundingBoxWidth: js.UndefOr[BoundingBoxWidth]
    var MinConfidence: js.UndefOr[Percent]
  }

  /**
    * The emotions that appear to be expressed on the face, and the confidence level in the determination. The API is only making a determination of the physical appearance of a person's face. It is not a determination of the person’s internal emotional state and should not be used in such a way. For example, a person pretending to have a sad face might not be sad emotionally.
    */
  @js.native
  @Factory
  trait Emotion extends js.Object {
    var Confidence: js.UndefOr[Percent]
    var Type: js.UndefOr[EmotionName]
  }

  @js.native
  sealed trait EmotionName extends js.Any
  object EmotionName extends js.Object {
    val HAPPY     = "HAPPY".asInstanceOf[EmotionName]
    val SAD       = "SAD".asInstanceOf[EmotionName]
    val ANGRY     = "ANGRY".asInstanceOf[EmotionName]
    val CONFUSED  = "CONFUSED".asInstanceOf[EmotionName]
    val DISGUSTED = "DISGUSTED".asInstanceOf[EmotionName]
    val SURPRISED = "SURPRISED".asInstanceOf[EmotionName]
    val CALM      = "CALM".asInstanceOf[EmotionName]
    val UNKNOWN   = "UNKNOWN".asInstanceOf[EmotionName]
    val FEAR      = "FEAR".asInstanceOf[EmotionName]

    val values = js.Object.freeze(js.Array(HAPPY, SAD, ANGRY, CONFUSED, DISGUSTED, SURPRISED, CALM, UNKNOWN, FEAR))
  }

  /**
    * The evaluation results for the training of a model.
    */
  @js.native
  @Factory
  trait EvaluationResult extends js.Object {
    var F1Score: js.UndefOr[Float]
    var Summary: js.UndefOr[Summary]
  }

  /**
    * Indicates whether or not the eyes on the face are open, and the confidence level in the determination.
    */
  @js.native
  @Factory
  trait EyeOpen extends js.Object {
    var Confidence: js.UndefOr[Percent]
    var Value: js.UndefOr[Boolean]
  }

  /**
    * Indicates whether or not the face is wearing eye glasses, and the confidence level in the determination.
    */
  @js.native
  @Factory
  trait Eyeglasses extends js.Object {
    var Confidence: js.UndefOr[Percent]
    var Value: js.UndefOr[Boolean]
  }

  /**
    * Describes the face properties such as the bounding box, face ID, image ID of the input image, and external image ID that you assigned.
    */
  @js.native
  @Factory
  trait Face extends js.Object {
    var BoundingBox: js.UndefOr[BoundingBox]
    var Confidence: js.UndefOr[Percent]
    var ExternalImageId: js.UndefOr[ExternalImageId]
    var FaceId: js.UndefOr[FaceId]
    var ImageId: js.UndefOr[ImageId]
  }

  @js.native
  sealed trait FaceAttributes extends js.Any
  object FaceAttributes extends js.Object {
    val DEFAULT = "DEFAULT".asInstanceOf[FaceAttributes]
    val ALL     = "ALL".asInstanceOf[FaceAttributes]

    val values = js.Object.freeze(js.Array(DEFAULT, ALL))
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
  @Factory
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

  /**
    * Information about a face detected in a video analysis request and the time the face was detected in the video.
    */
  @js.native
  @Factory
  trait FaceDetection extends js.Object {
    var Face: js.UndefOr[FaceDetail]
    var Timestamp: js.UndefOr[Timestamp]
  }

  /**
    * Provides face metadata. In addition, it also provides the confidence in the match of this face with the input face.
    */
  @js.native
  @Factory
  trait FaceMatch extends js.Object {
    var Face: js.UndefOr[Face]
    var Similarity: js.UndefOr[Percent]
  }

  /**
    * Object containing both the face metadata (stored in the backend database), and facial attributes that are detected but aren't stored in the database.
    */
  @js.native
  @Factory
  trait FaceRecord extends js.Object {
    var Face: js.UndefOr[Face]
    var FaceDetail: js.UndefOr[FaceDetail]
  }

  /**
    * Input face recognition parameters for an Amazon Rekognition stream processor. <code>FaceRecognitionSettings</code> is a request parameter for <a>CreateStreamProcessor</a>.
    */
  @js.native
  @Factory
  trait FaceSearchSettings extends js.Object {
    var CollectionId: js.UndefOr[CollectionId]
    var FaceMatchThreshold: js.UndefOr[Percent]
  }

  @js.native
  sealed trait FaceSearchSortBy extends js.Any
  object FaceSearchSortBy extends js.Object {
    val INDEX     = "INDEX".asInstanceOf[FaceSearchSortBy]
    val TIMESTAMP = "TIMESTAMP".asInstanceOf[FaceSearchSortBy]

    val values = js.Object.freeze(js.Array(INDEX, TIMESTAMP))
  }

  /**
    * The predicted gender of a detected face.
    *  Amazon Rekognition makes gender binary (male/female) predictions based on the physical appearance of a face in a particular image. This kind of prediction is not designed to categorize a person’s gender identity, and you shouldn't use Amazon Rekognition to make such a determination. For example, a male actor wearing a long-haired wig and earrings for a role might be predicted as female.
    *  Using Amazon Rekognition to make gender binary predictions is best suited for use cases where aggregate gender distribution statistics need to be analyzed without identifying specific users. For example, the percentage of female users compared to male users on a social media platform.
    *  We don't recommend using gender binary predictions to make decisions that impact&#x2028; an individual's rights, privacy, or access to services.
    */
  @js.native
  @Factory
  trait Gender extends js.Object {
    var Confidence: js.UndefOr[Percent]
    var Value: js.UndefOr[GenderType]
  }

  @js.native
  sealed trait GenderType extends js.Any
  object GenderType extends js.Object {
    val Male   = "Male".asInstanceOf[GenderType]
    val Female = "Female".asInstanceOf[GenderType]

    val values = js.Object.freeze(js.Array(Male, Female))
  }

  /**
    * Information about where an object (<a>DetectCustomLabels</a>) or text (<a>DetectText</a>) is located on an image.
    */
  @js.native
  @Factory
  trait Geometry extends js.Object {
    var BoundingBox: js.UndefOr[BoundingBox]
    var Polygon: js.UndefOr[Polygon]
  }

  @js.native
  @Factory
  trait GetCelebrityInfoRequest extends js.Object {
    var Id: RekognitionUniqueId
  }

  @js.native
  @Factory
  trait GetCelebrityInfoResponse extends js.Object {
    var Name: js.UndefOr[String]
    var Urls: js.UndefOr[Urls]
  }

  @js.native
  @Factory
  trait GetCelebrityRecognitionRequest extends js.Object {
    var JobId: JobId
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[PaginationToken]
    var SortBy: js.UndefOr[CelebrityRecognitionSortBy]
  }

  @js.native
  @Factory
  trait GetCelebrityRecognitionResponse extends js.Object {
    var Celebrities: js.UndefOr[CelebrityRecognitions]
    var JobStatus: js.UndefOr[VideoJobStatus]
    var NextToken: js.UndefOr[PaginationToken]
    var StatusMessage: js.UndefOr[StatusMessage]
    var VideoMetadata: js.UndefOr[VideoMetadata]
  }

  @js.native
  @Factory
  trait GetContentModerationRequest extends js.Object {
    var JobId: JobId
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[PaginationToken]
    var SortBy: js.UndefOr[ContentModerationSortBy]
  }

  @js.native
  @Factory
  trait GetContentModerationResponse extends js.Object {
    var JobStatus: js.UndefOr[VideoJobStatus]
    var ModerationLabels: js.UndefOr[ContentModerationDetections]
    var ModerationModelVersion: js.UndefOr[String]
    var NextToken: js.UndefOr[PaginationToken]
    var StatusMessage: js.UndefOr[StatusMessage]
    var VideoMetadata: js.UndefOr[VideoMetadata]
  }

  @js.native
  @Factory
  trait GetFaceDetectionRequest extends js.Object {
    var JobId: JobId
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[PaginationToken]
  }

  @js.native
  @Factory
  trait GetFaceDetectionResponse extends js.Object {
    var Faces: js.UndefOr[FaceDetections]
    var JobStatus: js.UndefOr[VideoJobStatus]
    var NextToken: js.UndefOr[PaginationToken]
    var StatusMessage: js.UndefOr[StatusMessage]
    var VideoMetadata: js.UndefOr[VideoMetadata]
  }

  @js.native
  @Factory
  trait GetFaceSearchRequest extends js.Object {
    var JobId: JobId
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[PaginationToken]
    var SortBy: js.UndefOr[FaceSearchSortBy]
  }

  @js.native
  @Factory
  trait GetFaceSearchResponse extends js.Object {
    var JobStatus: js.UndefOr[VideoJobStatus]
    var NextToken: js.UndefOr[PaginationToken]
    var Persons: js.UndefOr[PersonMatches]
    var StatusMessage: js.UndefOr[StatusMessage]
    var VideoMetadata: js.UndefOr[VideoMetadata]
  }

  @js.native
  @Factory
  trait GetLabelDetectionRequest extends js.Object {
    var JobId: JobId
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[PaginationToken]
    var SortBy: js.UndefOr[LabelDetectionSortBy]
  }

  @js.native
  @Factory
  trait GetLabelDetectionResponse extends js.Object {
    var JobStatus: js.UndefOr[VideoJobStatus]
    var LabelModelVersion: js.UndefOr[String]
    var Labels: js.UndefOr[LabelDetections]
    var NextToken: js.UndefOr[PaginationToken]
    var StatusMessage: js.UndefOr[StatusMessage]
    var VideoMetadata: js.UndefOr[VideoMetadata]
  }

  @js.native
  @Factory
  trait GetPersonTrackingRequest extends js.Object {
    var JobId: JobId
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[PaginationToken]
    var SortBy: js.UndefOr[PersonTrackingSortBy]
  }

  @js.native
  @Factory
  trait GetPersonTrackingResponse extends js.Object {
    var JobStatus: js.UndefOr[VideoJobStatus]
    var NextToken: js.UndefOr[PaginationToken]
    var Persons: js.UndefOr[PersonDetections]
    var StatusMessage: js.UndefOr[StatusMessage]
    var VideoMetadata: js.UndefOr[VideoMetadata]
  }

  @js.native
  @Factory
  trait GetTextDetectionRequest extends js.Object {
    var JobId: JobId
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[PaginationToken]
  }

  @js.native
  @Factory
  trait GetTextDetectionResponse extends js.Object {
    var JobStatus: js.UndefOr[VideoJobStatus]
    var NextToken: js.UndefOr[PaginationToken]
    var StatusMessage: js.UndefOr[StatusMessage]
    var TextDetections: js.UndefOr[TextDetectionResults]
    var TextModelVersion: js.UndefOr[String]
    var VideoMetadata: js.UndefOr[VideoMetadata]
  }

  /**
    * The S3 bucket that contains the Ground Truth manifest file.
    */
  @js.native
  @Factory
  trait GroundTruthManifest extends js.Object {
    var S3Object: js.UndefOr[S3Object]
  }

  /**
    * Shows the results of the human in the loop evaluation. If there is no HumanLoopArn, the input did not trigger human review.
    */
  @js.native
  @Factory
  trait HumanLoopActivationOutput extends js.Object {
    var HumanLoopActivationConditionsEvaluationResults: js.UndefOr[HumanLoopActivationConditionsEvaluationResults]
    var HumanLoopActivationReasons: js.UndefOr[HumanLoopActivationReasons]
    var HumanLoopArn: js.UndefOr[HumanLoopArn]
  }

  /**
    * Sets up the flow definition the image will be sent to if one of the conditions is met. You can also set certain attributes of the image before review.
    */
  @js.native
  @Factory
  trait HumanLoopConfig extends js.Object {
    var FlowDefinitionArn: FlowDefinitionArn
    var HumanLoopName: HumanLoopName
    var DataAttributes: js.UndefOr[HumanLoopDataAttributes]
  }

  /**
    * Allows you to set attributes of the image. Currently, you can declare an image as free of personally identifiable information.
    */
  @js.native
  @Factory
  trait HumanLoopDataAttributes extends js.Object {
    var ContentClassifiers: js.UndefOr[ContentClassifiers]
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
  @Factory
  trait Image extends js.Object {
    var Bytes: js.UndefOr[ImageBlob]
    var S3Object: js.UndefOr[S3Object]
  }

  /**
    * Identifies face image brightness and sharpness.
    */
  @js.native
  @Factory
  trait ImageQuality extends js.Object {
    var Brightness: js.UndefOr[Float]
    var Sharpness: js.UndefOr[Float]
  }

  @js.native
  @Factory
  trait IndexFacesRequest extends js.Object {
    var CollectionId: CollectionId
    var Image: Image
    var DetectionAttributes: js.UndefOr[Attributes]
    var ExternalImageId: js.UndefOr[ExternalImageId]
    var MaxFaces: js.UndefOr[MaxFacesToIndex]
    var QualityFilter: js.UndefOr[QualityFilter]
  }

  @js.native
  @Factory
  trait IndexFacesResponse extends js.Object {
    var FaceModelVersion: js.UndefOr[String]
    var FaceRecords: js.UndefOr[FaceRecordList]
    var OrientationCorrection: js.UndefOr[OrientationCorrection]
    var UnindexedFaces: js.UndefOr[UnindexedFaces]
  }

  /**
    * An instance of a label returned by Amazon Rekognition Image (<a>DetectLabels</a>) or by Amazon Rekognition Video (<a>GetLabelDetection</a>).
    */
  @js.native
  @Factory
  trait Instance extends js.Object {
    var BoundingBox: js.UndefOr[BoundingBox]
    var Confidence: js.UndefOr[Percent]
  }

  /**
    * The Kinesis data stream Amazon Rekognition to which the analysis results of a Amazon Rekognition stream processor are streamed. For more information, see CreateStreamProcessor in the Amazon Rekognition Developer Guide.
    */
  @js.native
  @Factory
  trait KinesisDataStream extends js.Object {
    var Arn: js.UndefOr[KinesisDataArn]
  }

  /**
    * Kinesis video stream stream that provides the source streaming video for a Amazon Rekognition Video stream processor. For more information, see CreateStreamProcessor in the Amazon Rekognition Developer Guide.
    */
  @js.native
  @Factory
  trait KinesisVideoStream extends js.Object {
    var Arn: js.UndefOr[KinesisVideoArn]
  }

  /**
    * Structure containing details about the detected label, including the name, detected instances, parent labels, and level of confidence.
    */
  @js.native
  @Factory
  trait Label extends js.Object {
    var Confidence: js.UndefOr[Percent]
    var Instances: js.UndefOr[Instances]
    var Name: js.UndefOr[String]
    var Parents: js.UndefOr[Parents]
  }

  /**
    * Information about a label detected in a video analysis request and the time the label was detected in the video.
    */
  @js.native
  @Factory
  trait LabelDetection extends js.Object {
    var Label: js.UndefOr[Label]
    var Timestamp: js.UndefOr[Timestamp]
  }

  @js.native
  sealed trait LabelDetectionSortBy extends js.Any
  object LabelDetectionSortBy extends js.Object {
    val NAME      = "NAME".asInstanceOf[LabelDetectionSortBy]
    val TIMESTAMP = "TIMESTAMP".asInstanceOf[LabelDetectionSortBy]

    val values = js.Object.freeze(js.Array(NAME, TIMESTAMP))
  }

  /**
    * Indicates the location of the landmark on the face.
    */
  @js.native
  @Factory
  trait Landmark extends js.Object {
    var Type: js.UndefOr[LandmarkType]
    var X: js.UndefOr[Float]
    var Y: js.UndefOr[Float]
  }

  @js.native
  sealed trait LandmarkType extends js.Any
  object LandmarkType extends js.Object {
    val eyeLeft           = "eyeLeft".asInstanceOf[LandmarkType]
    val eyeRight          = "eyeRight".asInstanceOf[LandmarkType]
    val nose              = "nose".asInstanceOf[LandmarkType]
    val mouthLeft         = "mouthLeft".asInstanceOf[LandmarkType]
    val mouthRight        = "mouthRight".asInstanceOf[LandmarkType]
    val leftEyeBrowLeft   = "leftEyeBrowLeft".asInstanceOf[LandmarkType]
    val leftEyeBrowRight  = "leftEyeBrowRight".asInstanceOf[LandmarkType]
    val leftEyeBrowUp     = "leftEyeBrowUp".asInstanceOf[LandmarkType]
    val rightEyeBrowLeft  = "rightEyeBrowLeft".asInstanceOf[LandmarkType]
    val rightEyeBrowRight = "rightEyeBrowRight".asInstanceOf[LandmarkType]
    val rightEyeBrowUp    = "rightEyeBrowUp".asInstanceOf[LandmarkType]
    val leftEyeLeft       = "leftEyeLeft".asInstanceOf[LandmarkType]
    val leftEyeRight      = "leftEyeRight".asInstanceOf[LandmarkType]
    val leftEyeUp         = "leftEyeUp".asInstanceOf[LandmarkType]
    val leftEyeDown       = "leftEyeDown".asInstanceOf[LandmarkType]
    val rightEyeLeft      = "rightEyeLeft".asInstanceOf[LandmarkType]
    val rightEyeRight     = "rightEyeRight".asInstanceOf[LandmarkType]
    val rightEyeUp        = "rightEyeUp".asInstanceOf[LandmarkType]
    val rightEyeDown      = "rightEyeDown".asInstanceOf[LandmarkType]
    val noseLeft          = "noseLeft".asInstanceOf[LandmarkType]
    val noseRight         = "noseRight".asInstanceOf[LandmarkType]
    val mouthUp           = "mouthUp".asInstanceOf[LandmarkType]
    val mouthDown         = "mouthDown".asInstanceOf[LandmarkType]
    val leftPupil         = "leftPupil".asInstanceOf[LandmarkType]
    val rightPupil        = "rightPupil".asInstanceOf[LandmarkType]
    val upperJawlineLeft  = "upperJawlineLeft".asInstanceOf[LandmarkType]
    val midJawlineLeft    = "midJawlineLeft".asInstanceOf[LandmarkType]
    val chinBottom        = "chinBottom".asInstanceOf[LandmarkType]
    val midJawlineRight   = "midJawlineRight".asInstanceOf[LandmarkType]
    val upperJawlineRight = "upperJawlineRight".asInstanceOf[LandmarkType]

    val values = js.Object.freeze(
      js.Array(
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
    )
  }

  @js.native
  @Factory
  trait ListCollectionsRequest extends js.Object {
    var MaxResults: js.UndefOr[PageSize]
    var NextToken: js.UndefOr[PaginationToken]
  }

  @js.native
  @Factory
  trait ListCollectionsResponse extends js.Object {
    var CollectionIds: js.UndefOr[CollectionIdList]
    var FaceModelVersions: js.UndefOr[FaceModelVersionList]
    var NextToken: js.UndefOr[PaginationToken]
  }

  @js.native
  @Factory
  trait ListFacesRequest extends js.Object {
    var CollectionId: CollectionId
    var MaxResults: js.UndefOr[PageSize]
    var NextToken: js.UndefOr[PaginationToken]
  }

  @js.native
  @Factory
  trait ListFacesResponse extends js.Object {
    var FaceModelVersion: js.UndefOr[String]
    var Faces: js.UndefOr[FaceList]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait ListStreamProcessorsRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[PaginationToken]
  }

  @js.native
  @Factory
  trait ListStreamProcessorsResponse extends js.Object {
    var NextToken: js.UndefOr[PaginationToken]
    var StreamProcessors: js.UndefOr[StreamProcessorList]
  }

  /**
    * Provides information about a single type of unsafe content found in an image or video. Each type of moderated content has a label within a hierarchical taxonomy. For more information, see Detecting Unsafe Content in the Amazon Rekognition Developer Guide.
    */
  @js.native
  @Factory
  trait ModerationLabel extends js.Object {
    var Confidence: js.UndefOr[Percent]
    var Name: js.UndefOr[String]
    var ParentName: js.UndefOr[String]
  }

  /**
    * Indicates whether or not the mouth on the face is open, and the confidence level in the determination.
    */
  @js.native
  @Factory
  trait MouthOpen extends js.Object {
    var Confidence: js.UndefOr[Percent]
    var Value: js.UndefOr[Boolean]
  }

  /**
    * Indicates whether or not the face has a mustache, and the confidence level in the determination.
    */
  @js.native
  @Factory
  trait Mustache extends js.Object {
    var Confidence: js.UndefOr[Percent]
    var Value: js.UndefOr[Boolean]
  }

  /**
    * The Amazon Simple Notification Service topic to which Amazon Rekognition publishes the completion status of a video analysis operation. For more information, see <a>api-video</a>.
    */
  @js.native
  @Factory
  trait NotificationChannel extends js.Object {
    var RoleArn: RoleArn
    var SNSTopicArn: SNSTopicArn
  }

  @js.native
  sealed trait OrientationCorrection extends js.Any
  object OrientationCorrection extends js.Object {
    val ROTATE_0   = "ROTATE_0".asInstanceOf[OrientationCorrection]
    val ROTATE_90  = "ROTATE_90".asInstanceOf[OrientationCorrection]
    val ROTATE_180 = "ROTATE_180".asInstanceOf[OrientationCorrection]
    val ROTATE_270 = "ROTATE_270".asInstanceOf[OrientationCorrection]

    val values = js.Object.freeze(js.Array(ROTATE_0, ROTATE_90, ROTATE_180, ROTATE_270))
  }

  /**
    * The S3 bucket and folder location where training output is placed.
    */
  @js.native
  @Factory
  trait OutputConfig extends js.Object {
    var S3Bucket: js.UndefOr[S3Bucket]
    var S3KeyPrefix: js.UndefOr[S3KeyPrefix]
  }

  /**
    * A parent label for a label. A label can have 0, 1, or more parents.
    */
  @js.native
  @Factory
  trait Parent extends js.Object {
    var Name: js.UndefOr[String]
  }

  /**
    * Details about a person detected in a video analysis request.
    */
  @js.native
  @Factory
  trait PersonDetail extends js.Object {
    var BoundingBox: js.UndefOr[BoundingBox]
    var Face: js.UndefOr[FaceDetail]
    var Index: js.UndefOr[PersonIndex]
  }

  /**
    * Details and path tracking information for a single time a person's path is tracked in a video. Amazon Rekognition operations that track people's paths return an array of <code>PersonDetection</code> objects with elements for each time a person's path is tracked in a video.
    *  For more information, see GetPersonTracking in the Amazon Rekognition Developer Guide.
    */
  @js.native
  @Factory
  trait PersonDetection extends js.Object {
    var Person: js.UndefOr[PersonDetail]
    var Timestamp: js.UndefOr[Timestamp]
  }

  /**
    * Information about a person whose face matches a face(s) in an Amazon Rekognition collection. Includes information about the faces in the Amazon Rekognition collection (<a>FaceMatch</a>), information about the person (<a>PersonDetail</a>), and the time stamp for when the person was detected in a video. An array of <code>PersonMatch</code> objects is returned by <a>GetFaceSearch</a>.
    */
  @js.native
  @Factory
  trait PersonMatch extends js.Object {
    var FaceMatches: js.UndefOr[FaceMatchList]
    var Person: js.UndefOr[PersonDetail]
    var Timestamp: js.UndefOr[Timestamp]
  }

  @js.native
  sealed trait PersonTrackingSortBy extends js.Any
  object PersonTrackingSortBy extends js.Object {
    val INDEX     = "INDEX".asInstanceOf[PersonTrackingSortBy]
    val TIMESTAMP = "TIMESTAMP".asInstanceOf[PersonTrackingSortBy]

    val values = js.Object.freeze(js.Array(INDEX, TIMESTAMP))
  }

  /**
    * The X and Y coordinates of a point on an image. The X and Y values returned are ratios of the overall image size. For example, if the input image is 700x200 and the operation returns X=0.5 and Y=0.25, then the point is at the (350,50) pixel coordinate on the image.
    *  An array of <code>Point</code> objects, <code>Polygon</code>, is returned by <a>DetectText</a> and by <a>DetectCustomLabels</a>. <code>Polygon</code> represents a fine-grained polygon around a detected item. For more information, see Geometry in the Amazon Rekognition Developer Guide.
    */
  @js.native
  @Factory
  trait Point extends js.Object {
    var X: js.UndefOr[Float]
    var Y: js.UndefOr[Float]
  }

  /**
    * Indicates the pose of the face as determined by its pitch, roll, and yaw.
    */
  @js.native
  @Factory
  trait Pose extends js.Object {
    var Pitch: js.UndefOr[Degree]
    var Roll: js.UndefOr[Degree]
    var Yaw: js.UndefOr[Degree]
  }

  /**
    * A description of a Amazon Rekognition Custom Labels project.
    */
  @js.native
  @Factory
  trait ProjectDescription extends js.Object {
    var CreationTimestamp: js.UndefOr[DateTime]
    var ProjectArn: js.UndefOr[ProjectArn]
    var Status: js.UndefOr[ProjectStatus]
  }

  @js.native
  sealed trait ProjectStatus extends js.Any
  object ProjectStatus extends js.Object {
    val CREATING = "CREATING".asInstanceOf[ProjectStatus]
    val CREATED  = "CREATED".asInstanceOf[ProjectStatus]
    val DELETING = "DELETING".asInstanceOf[ProjectStatus]

    val values = js.Object.freeze(js.Array(CREATING, CREATED, DELETING))
  }

  /**
    * The description of a version of a model.
    */
  @js.native
  @Factory
  trait ProjectVersionDescription extends js.Object {
    var BillableTrainingTimeInSeconds: js.UndefOr[ULong]
    var CreationTimestamp: js.UndefOr[DateTime]
    var EvaluationResult: js.UndefOr[EvaluationResult]
    var MinInferenceUnits: js.UndefOr[InferenceUnits]
    var OutputConfig: js.UndefOr[OutputConfig]
    var ProjectVersionArn: js.UndefOr[ProjectVersionArn]
    var Status: js.UndefOr[ProjectVersionStatus]
    var StatusMessage: js.UndefOr[StatusMessage]
    var TestingDataResult: js.UndefOr[TestingDataResult]
    var TrainingDataResult: js.UndefOr[TrainingDataResult]
    var TrainingEndTimestamp: js.UndefOr[DateTime]
  }

  @js.native
  sealed trait ProjectVersionStatus extends js.Any
  object ProjectVersionStatus extends js.Object {
    val TRAINING_IN_PROGRESS = "TRAINING_IN_PROGRESS".asInstanceOf[ProjectVersionStatus]
    val TRAINING_COMPLETED   = "TRAINING_COMPLETED".asInstanceOf[ProjectVersionStatus]
    val TRAINING_FAILED      = "TRAINING_FAILED".asInstanceOf[ProjectVersionStatus]
    val STARTING             = "STARTING".asInstanceOf[ProjectVersionStatus]
    val RUNNING              = "RUNNING".asInstanceOf[ProjectVersionStatus]
    val FAILED               = "FAILED".asInstanceOf[ProjectVersionStatus]
    val STOPPING             = "STOPPING".asInstanceOf[ProjectVersionStatus]
    val STOPPED              = "STOPPED".asInstanceOf[ProjectVersionStatus]
    val DELETING             = "DELETING".asInstanceOf[ProjectVersionStatus]

    val values = js.Object.freeze(
      js.Array(
        TRAINING_IN_PROGRESS,
        TRAINING_COMPLETED,
        TRAINING_FAILED,
        STARTING,
        RUNNING,
        FAILED,
        STOPPING,
        STOPPED,
        DELETING
      )
    )
  }

  @js.native
  sealed trait QualityFilter extends js.Any
  object QualityFilter extends js.Object {
    val NONE   = "NONE".asInstanceOf[QualityFilter]
    val AUTO   = "AUTO".asInstanceOf[QualityFilter]
    val LOW    = "LOW".asInstanceOf[QualityFilter]
    val MEDIUM = "MEDIUM".asInstanceOf[QualityFilter]
    val HIGH   = "HIGH".asInstanceOf[QualityFilter]

    val values = js.Object.freeze(js.Array(NONE, AUTO, LOW, MEDIUM, HIGH))
  }

  @js.native
  sealed trait Reason extends js.Any
  object Reason extends js.Object {
    val EXCEEDS_MAX_FACES  = "EXCEEDS_MAX_FACES".asInstanceOf[Reason]
    val EXTREME_POSE       = "EXTREME_POSE".asInstanceOf[Reason]
    val LOW_BRIGHTNESS     = "LOW_BRIGHTNESS".asInstanceOf[Reason]
    val LOW_SHARPNESS      = "LOW_SHARPNESS".asInstanceOf[Reason]
    val LOW_CONFIDENCE     = "LOW_CONFIDENCE".asInstanceOf[Reason]
    val SMALL_BOUNDING_BOX = "SMALL_BOUNDING_BOX".asInstanceOf[Reason]
    val LOW_FACE_QUALITY   = "LOW_FACE_QUALITY".asInstanceOf[Reason]

    val values = js.Object.freeze(
      js.Array(
        EXCEEDS_MAX_FACES,
        EXTREME_POSE,
        LOW_BRIGHTNESS,
        LOW_SHARPNESS,
        LOW_CONFIDENCE,
        SMALL_BOUNDING_BOX,
        LOW_FACE_QUALITY
      )
    )
  }

  @js.native
  @Factory
  trait RecognizeCelebritiesRequest extends js.Object {
    var Image: Image
  }

  @js.native
  @Factory
  trait RecognizeCelebritiesResponse extends js.Object {
    var CelebrityFaces: js.UndefOr[CelebrityList]
    var OrientationCorrection: js.UndefOr[OrientationCorrection]
    var UnrecognizedFaces: js.UndefOr[ComparedFaceList]
  }

  /**
    * Specifies a location within the frame that Rekognition checks for text. Uses a <code>BoundingBox</code> object to set a region of the screen.
    *  A word is included in the region if the word is more than half in that region. If there is more than one region, the word will be compared with all regions of the screen. Any word more than half in a region is kept in the results.
    */
  @js.native
  @Factory
  trait RegionOfInterest extends js.Object {
    var BoundingBox: js.UndefOr[BoundingBox]
  }

  /**
    * Provides the S3 bucket name and object name.
    *  The region for the S3 bucket containing the S3 object must match the region you use for Amazon Rekognition operations.
    *  For Amazon Rekognition to process an S3 object, the user must have permission to access the S3 object. For more information, see Resource-Based Policies in the Amazon Rekognition Developer Guide.
    */
  @js.native
  @Factory
  trait S3Object extends js.Object {
    var Bucket: js.UndefOr[S3Bucket]
    var Name: js.UndefOr[S3ObjectName]
    var Version: js.UndefOr[S3ObjectVersion]
  }

  @js.native
  @Factory
  trait SearchFacesByImageRequest extends js.Object {
    var CollectionId: CollectionId
    var Image: Image
    var FaceMatchThreshold: js.UndefOr[Percent]
    var MaxFaces: js.UndefOr[MaxFaces]
    var QualityFilter: js.UndefOr[QualityFilter]
  }

  @js.native
  @Factory
  trait SearchFacesByImageResponse extends js.Object {
    var FaceMatches: js.UndefOr[FaceMatchList]
    var FaceModelVersion: js.UndefOr[String]
    var SearchedFaceBoundingBox: js.UndefOr[BoundingBox]
    var SearchedFaceConfidence: js.UndefOr[Percent]
  }

  @js.native
  @Factory
  trait SearchFacesRequest extends js.Object {
    var CollectionId: CollectionId
    var FaceId: FaceId
    var FaceMatchThreshold: js.UndefOr[Percent]
    var MaxFaces: js.UndefOr[MaxFaces]
  }

  @js.native
  @Factory
  trait SearchFacesResponse extends js.Object {
    var FaceMatches: js.UndefOr[FaceMatchList]
    var FaceModelVersion: js.UndefOr[String]
    var SearchedFaceId: js.UndefOr[FaceId]
  }

  /**
    * Indicates whether or not the face is smiling, and the confidence level in the determination.
    */
  @js.native
  @Factory
  trait Smile extends js.Object {
    var Confidence: js.UndefOr[Percent]
    var Value: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait StartCelebrityRecognitionRequest extends js.Object {
    var Video: Video
    var ClientRequestToken: js.UndefOr[ClientRequestToken]
    var JobTag: js.UndefOr[JobTag]
    var NotificationChannel: js.UndefOr[NotificationChannel]
  }

  @js.native
  @Factory
  trait StartCelebrityRecognitionResponse extends js.Object {
    var JobId: js.UndefOr[JobId]
  }

  @js.native
  @Factory
  trait StartContentModerationRequest extends js.Object {
    var Video: Video
    var ClientRequestToken: js.UndefOr[ClientRequestToken]
    var JobTag: js.UndefOr[JobTag]
    var MinConfidence: js.UndefOr[Percent]
    var NotificationChannel: js.UndefOr[NotificationChannel]
  }

  @js.native
  @Factory
  trait StartContentModerationResponse extends js.Object {
    var JobId: js.UndefOr[JobId]
  }

  @js.native
  @Factory
  trait StartFaceDetectionRequest extends js.Object {
    var Video: Video
    var ClientRequestToken: js.UndefOr[ClientRequestToken]
    var FaceAttributes: js.UndefOr[FaceAttributes]
    var JobTag: js.UndefOr[JobTag]
    var NotificationChannel: js.UndefOr[NotificationChannel]
  }

  @js.native
  @Factory
  trait StartFaceDetectionResponse extends js.Object {
    var JobId: js.UndefOr[JobId]
  }

  @js.native
  @Factory
  trait StartFaceSearchRequest extends js.Object {
    var CollectionId: CollectionId
    var Video: Video
    var ClientRequestToken: js.UndefOr[ClientRequestToken]
    var FaceMatchThreshold: js.UndefOr[Percent]
    var JobTag: js.UndefOr[JobTag]
    var NotificationChannel: js.UndefOr[NotificationChannel]
  }

  @js.native
  @Factory
  trait StartFaceSearchResponse extends js.Object {
    var JobId: js.UndefOr[JobId]
  }

  @js.native
  @Factory
  trait StartLabelDetectionRequest extends js.Object {
    var Video: Video
    var ClientRequestToken: js.UndefOr[ClientRequestToken]
    var JobTag: js.UndefOr[JobTag]
    var MinConfidence: js.UndefOr[Percent]
    var NotificationChannel: js.UndefOr[NotificationChannel]
  }

  @js.native
  @Factory
  trait StartLabelDetectionResponse extends js.Object {
    var JobId: js.UndefOr[JobId]
  }

  @js.native
  @Factory
  trait StartPersonTrackingRequest extends js.Object {
    var Video: Video
    var ClientRequestToken: js.UndefOr[ClientRequestToken]
    var JobTag: js.UndefOr[JobTag]
    var NotificationChannel: js.UndefOr[NotificationChannel]
  }

  @js.native
  @Factory
  trait StartPersonTrackingResponse extends js.Object {
    var JobId: js.UndefOr[JobId]
  }

  @js.native
  @Factory
  trait StartProjectVersionRequest extends js.Object {
    var MinInferenceUnits: InferenceUnits
    var ProjectVersionArn: ProjectVersionArn
  }

  @js.native
  @Factory
  trait StartProjectVersionResponse extends js.Object {
    var Status: js.UndefOr[ProjectVersionStatus]
  }

  @js.native
  @Factory
  trait StartStreamProcessorRequest extends js.Object {
    var Name: StreamProcessorName
  }

  @js.native
  @Factory
  trait StartStreamProcessorResponse extends js.Object {}

  /**
    * Set of optional parameters that let you set the criteria text must meet to be included in your response. <code>WordFilter</code> looks at a word's height, width and minimum confidence. <code>RegionOfInterest</code> lets you set a specific region of the screen to look for text in.
    */
  @js.native
  @Factory
  trait StartTextDetectionFilters extends js.Object {
    var RegionsOfInterest: js.UndefOr[RegionsOfInterest]
    var WordFilter: js.UndefOr[DetectionFilter]
  }

  @js.native
  @Factory
  trait StartTextDetectionRequest extends js.Object {
    var Video: Video
    var ClientRequestToken: js.UndefOr[ClientRequestToken]
    var Filters: js.UndefOr[StartTextDetectionFilters]
    var JobTag: js.UndefOr[JobTag]
    var NotificationChannel: js.UndefOr[NotificationChannel]
  }

  @js.native
  @Factory
  trait StartTextDetectionResponse extends js.Object {
    var JobId: js.UndefOr[JobId]
  }

  @js.native
  @Factory
  trait StopProjectVersionRequest extends js.Object {
    var ProjectVersionArn: ProjectVersionArn
  }

  @js.native
  @Factory
  trait StopProjectVersionResponse extends js.Object {
    var Status: js.UndefOr[ProjectVersionStatus]
  }

  @js.native
  @Factory
  trait StopStreamProcessorRequest extends js.Object {
    var Name: StreamProcessorName
  }

  @js.native
  @Factory
  trait StopStreamProcessorResponse extends js.Object {}

  /**
    * An object that recognizes faces in a streaming video. An Amazon Rekognition stream processor is created by a call to <a>CreateStreamProcessor</a>. The request parameters for <code>CreateStreamProcessor</code> describe the Kinesis video stream source for the streaming video, face recognition parameters, and where to stream the analysis resullts.
    */
  @js.native
  @Factory
  trait StreamProcessor extends js.Object {
    var Name: js.UndefOr[StreamProcessorName]
    var Status: js.UndefOr[StreamProcessorStatus]
  }

  /**
    * Information about the source streaming video.
    */
  @js.native
  @Factory
  trait StreamProcessorInput extends js.Object {
    var KinesisVideoStream: js.UndefOr[KinesisVideoStream]
  }

  /**
    * Information about the Amazon Kinesis Data Streams stream to which a Amazon Rekognition Video stream processor streams the results of a video analysis. For more information, see CreateStreamProcessor in the Amazon Rekognition Developer Guide.
    */
  @js.native
  @Factory
  trait StreamProcessorOutput extends js.Object {
    var KinesisDataStream: js.UndefOr[KinesisDataStream]
  }

  /**
    * Input parameters used to recognize faces in a streaming video analyzed by a Amazon Rekognition stream processor.
    */
  @js.native
  @Factory
  trait StreamProcessorSettings extends js.Object {
    var FaceSearch: js.UndefOr[FaceSearchSettings]
  }

  @js.native
  sealed trait StreamProcessorStatus extends js.Any
  object StreamProcessorStatus extends js.Object {
    val STOPPED  = "STOPPED".asInstanceOf[StreamProcessorStatus]
    val STARTING = "STARTING".asInstanceOf[StreamProcessorStatus]
    val RUNNING  = "RUNNING".asInstanceOf[StreamProcessorStatus]
    val FAILED   = "FAILED".asInstanceOf[StreamProcessorStatus]
    val STOPPING = "STOPPING".asInstanceOf[StreamProcessorStatus]

    val values = js.Object.freeze(js.Array(STOPPED, STARTING, RUNNING, FAILED, STOPPING))
  }

  /**
    * The S3 bucket that contains the training summary. The training summary includes aggregated evaluation metrics for the entire testing dataset and metrics for each individual label.
    *  You get the training summary S3 bucket location by calling <a>DescribeProjectVersions</a>.
    */
  @js.native
  @Factory
  trait Summary extends js.Object {
    var S3Object: js.UndefOr[S3Object]
  }

  /**
    * Indicates whether or not the face is wearing sunglasses, and the confidence level in the determination.
    */
  @js.native
  @Factory
  trait Sunglasses extends js.Object {
    var Confidence: js.UndefOr[Percent]
    var Value: js.UndefOr[Boolean]
  }

  /**
    * The dataset used for testing. Optionally, if <code>AutoCreate</code> is set, Amazon Rekognition Custom Labels creates a testing dataset using an 80/20 split of the training dataset.
    */
  @js.native
  @Factory
  trait TestingData extends js.Object {
    var Assets: js.UndefOr[Assets]
    var AutoCreate: js.UndefOr[Boolean]
  }

  /**
    * A Sagemaker Groundtruth format manifest file representing the dataset used for testing.
    */
  @js.native
  @Factory
  trait TestingDataResult extends js.Object {
    var Input: js.UndefOr[TestingData]
    var Output: js.UndefOr[TestingData]
  }

  /**
    * Information about a word or line of text detected by <a>DetectText</a>.
    *  The <code>DetectedText</code> field contains the text that Amazon Rekognition detected in the image.
    *  Every word and line has an identifier (<code>Id</code>). Each word belongs to a line and has a parent identifier (<code>ParentId</code>) that identifies the line of text in which the word appears. The word <code>Id</code> is also an index for the word within a line of words.
    *  For more information, see Detecting Text in the Amazon Rekognition Developer Guide.
    */
  @js.native
  @Factory
  trait TextDetection extends js.Object {
    var Confidence: js.UndefOr[Percent]
    var DetectedText: js.UndefOr[String]
    var Geometry: js.UndefOr[Geometry]
    var Id: js.UndefOr[UInteger]
    var ParentId: js.UndefOr[UInteger]
    var Type: js.UndefOr[TextTypes]
  }

  /**
    * Information about text detected in a video. Incudes the detected text, the time in milliseconds from the start of the video that the text was detected, and where it was detected on the screen.
    */
  @js.native
  @Factory
  trait TextDetectionResult extends js.Object {
    var TextDetection: js.UndefOr[TextDetection]
    var Timestamp: js.UndefOr[Timestamp]
  }

  @js.native
  sealed trait TextTypes extends js.Any
  object TextTypes extends js.Object {
    val LINE = "LINE".asInstanceOf[TextTypes]
    val WORD = "WORD".asInstanceOf[TextTypes]

    val values = js.Object.freeze(js.Array(LINE, WORD))
  }

  /**
    * The dataset used for training.
    */
  @js.native
  @Factory
  trait TrainingData extends js.Object {
    var Assets: js.UndefOr[Assets]
  }

  /**
    * A Sagemaker Groundtruth format manifest file that represents the dataset used for training.
    */
  @js.native
  @Factory
  trait TrainingDataResult extends js.Object {
    var Input: js.UndefOr[TrainingData]
    var Output: js.UndefOr[TrainingData]
  }

  /**
    * A face that <a>IndexFaces</a> detected, but didn't index. Use the <code>Reasons</code> response attribute to determine why a face wasn't indexed.
    */
  @js.native
  @Factory
  trait UnindexedFace extends js.Object {
    var FaceDetail: js.UndefOr[FaceDetail]
    var Reasons: js.UndefOr[Reasons]
  }

  /**
    * Video file stored in an Amazon S3 bucket. Amazon Rekognition video start operations such as <a>StartLabelDetection</a> use <code>Video</code> to specify a video for analysis. The supported file formats are .mp4, .mov and .avi.
    */
  @js.native
  @Factory
  trait Video extends js.Object {
    var S3Object: js.UndefOr[S3Object]
  }

  @js.native
  sealed trait VideoJobStatus extends js.Any
  object VideoJobStatus extends js.Object {
    val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[VideoJobStatus]
    val SUCCEEDED   = "SUCCEEDED".asInstanceOf[VideoJobStatus]
    val FAILED      = "FAILED".asInstanceOf[VideoJobStatus]

    val values = js.Object.freeze(js.Array(IN_PROGRESS, SUCCEEDED, FAILED))
  }

  /**
    * Information about a video that Amazon Rekognition analyzed. <code>Videometadata</code> is returned in every page of paginated responses from a Amazon Rekognition video operation.
    */
  @js.native
  @Factory
  trait VideoMetadata extends js.Object {
    var Codec: js.UndefOr[String]
    var DurationMillis: js.UndefOr[ULong]
    var Format: js.UndefOr[String]
    var FrameHeight: js.UndefOr[ULong]
    var FrameRate: js.UndefOr[Float]
    var FrameWidth: js.UndefOr[ULong]
  }
}
