package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

package object rekognition {
  type Assets = js.Array[Asset]
  type Attributes = js.Array[Attribute]
  type AudioMetadataList = js.Array[AudioMetadata]
  type BoundingBoxHeight = Float
  type BoundingBoxWidth = Float
  type CelebrityList = js.Array[Celebrity]
  type CelebrityRecognitions = js.Array[CelebrityRecognition]
  type ClientRequestToken = String
  type CollectionId = String
  type CollectionIdList = js.Array[CollectionId]
  type CompareFacesMatchList = js.Array[CompareFacesMatch]
  type CompareFacesUnmatchList = js.Array[ComparedFace]
  type ComparedFaceList = js.Array[ComparedFace]
  type ContentClassifiers = js.Array[ContentClassifier]
  type ContentModerationDetections = js.Array[ContentModerationDetection]
  type CustomLabels = js.Array[CustomLabel]
  type DateTime = js.Date
  type Degree = Float
  type Emotions = js.Array[Emotion]
  type ExtendedPaginationToken = String
  type ExternalImageId = String
  type FaceDetailList = js.Array[FaceDetail]
  type FaceDetections = js.Array[FaceDetection]
  type FaceId = String
  type FaceIdList = js.Array[FaceId]
  type FaceList = js.Array[Face]
  type FaceMatchList = js.Array[FaceMatch]
  type FaceModelVersionList = js.Array[String]
  type FaceRecordList = js.Array[FaceRecord]
  type FlowDefinitionArn = String
  type HumanLoopActivationConditionsEvaluationResults = String
  type HumanLoopActivationReason = String
  type HumanLoopActivationReasons = js.Array[HumanLoopActivationReason]
  type HumanLoopArn = String
  type HumanLoopName = String
  type ImageBlob = js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type ImageId = String
  type InferenceUnits = Int
  type Instances = js.Array[Instance]
  type JobId = String
  type JobTag = String
  type KinesisDataArn = String
  type KinesisVideoArn = String
  type LabelDetections = js.Array[LabelDetection]
  type Labels = js.Array[Label]
  type Landmarks = js.Array[Landmark]
  type MaxFaces = Int
  type MaxFacesToIndex = Int
  type MaxResults = Int
  type ModerationLabels = js.Array[ModerationLabel]
  type PageSize = Int
  type PaginationToken = String
  type Parents = js.Array[Parent]
  type Percent = Float
  type PersonDetections = js.Array[PersonDetection]
  type PersonIndex = Double
  type PersonMatches = js.Array[PersonMatch]
  type Polygon = js.Array[Point]
  type ProjectArn = String
  type ProjectDescriptions = js.Array[ProjectDescription]
  type ProjectName = String
  type ProjectVersionArn = String
  type ProjectVersionDescriptions = js.Array[ProjectVersionDescription]
  type ProjectVersionsPageSize = Int
  type ProjectsPageSize = Int
  type Reasons = js.Array[Reason]
  type RegionsOfInterest = js.Array[RegionOfInterest]
  type RekognitionUniqueId = String
  type RoleArn = String
  type S3Bucket = String
  type S3KeyPrefix = String
  type S3ObjectName = String
  type S3ObjectVersion = String
  type SNSTopicArn = String
  type SegmentConfidence = Float
  type SegmentDetections = js.Array[SegmentDetection]
  type SegmentTypes = js.Array[SegmentType]
  type SegmentTypesInfo = js.Array[SegmentTypeInfo]
  type StatusMessage = String
  type StreamProcessorArn = String
  type StreamProcessorList = js.Array[StreamProcessor]
  type StreamProcessorName = String
  type TextDetectionList = js.Array[TextDetection]
  type TextDetectionResults = js.Array[TextDetectionResult]
  type Timecode = String
  type Timestamp = Double
  type UInteger = Int
  type ULong = Double
  type UnindexedFaces = js.Array[UnindexedFace]
  type Url = String
  type Urls = js.Array[Url]
  type VersionName = String
  type VersionNames = js.Array[VersionName]
  type VideoMetadataList = js.Array[VideoMetadata]

  implicit final class RekognitionOps(private val service: Rekognition) extends AnyVal {

    @inline def compareFacesFuture(params: CompareFacesRequest): Future[CompareFacesResponse] = service.compareFaces(params).promise().toFuture
    @inline def createCollectionFuture(params: CreateCollectionRequest): Future[CreateCollectionResponse] = service.createCollection(params).promise().toFuture
    @inline def createProjectFuture(params: CreateProjectRequest): Future[CreateProjectResponse] = service.createProject(params).promise().toFuture
    @inline def createProjectVersionFuture(params: CreateProjectVersionRequest): Future[CreateProjectVersionResponse] = service.createProjectVersion(params).promise().toFuture
    @inline def createStreamProcessorFuture(params: CreateStreamProcessorRequest): Future[CreateStreamProcessorResponse] = service.createStreamProcessor(params).promise().toFuture
    @inline def deleteCollectionFuture(params: DeleteCollectionRequest): Future[DeleteCollectionResponse] = service.deleteCollection(params).promise().toFuture
    @inline def deleteFacesFuture(params: DeleteFacesRequest): Future[DeleteFacesResponse] = service.deleteFaces(params).promise().toFuture
    @inline def deleteProjectFuture(params: DeleteProjectRequest): Future[DeleteProjectResponse] = service.deleteProject(params).promise().toFuture
    @inline def deleteProjectVersionFuture(params: DeleteProjectVersionRequest): Future[DeleteProjectVersionResponse] = service.deleteProjectVersion(params).promise().toFuture
    @inline def deleteStreamProcessorFuture(params: DeleteStreamProcessorRequest): Future[DeleteStreamProcessorResponse] = service.deleteStreamProcessor(params).promise().toFuture
    @inline def describeCollectionFuture(params: DescribeCollectionRequest): Future[DescribeCollectionResponse] = service.describeCollection(params).promise().toFuture
    @inline def describeProjectVersionsFuture(params: DescribeProjectVersionsRequest): Future[DescribeProjectVersionsResponse] = service.describeProjectVersions(params).promise().toFuture
    @inline def describeProjectsFuture(params: DescribeProjectsRequest): Future[DescribeProjectsResponse] = service.describeProjects(params).promise().toFuture
    @inline def describeStreamProcessorFuture(params: DescribeStreamProcessorRequest): Future[DescribeStreamProcessorResponse] = service.describeStreamProcessor(params).promise().toFuture
    @inline def detectCustomLabelsFuture(params: DetectCustomLabelsRequest): Future[DetectCustomLabelsResponse] = service.detectCustomLabels(params).promise().toFuture
    @inline def detectFacesFuture(params: DetectFacesRequest): Future[DetectFacesResponse] = service.detectFaces(params).promise().toFuture
    @inline def detectLabelsFuture(params: DetectLabelsRequest): Future[DetectLabelsResponse] = service.detectLabels(params).promise().toFuture
    @inline def detectModerationLabelsFuture(params: DetectModerationLabelsRequest): Future[DetectModerationLabelsResponse] = service.detectModerationLabels(params).promise().toFuture
    @inline def detectTextFuture(params: DetectTextRequest): Future[DetectTextResponse] = service.detectText(params).promise().toFuture
    @inline def getCelebrityInfoFuture(params: GetCelebrityInfoRequest): Future[GetCelebrityInfoResponse] = service.getCelebrityInfo(params).promise().toFuture
    @inline def getCelebrityRecognitionFuture(params: GetCelebrityRecognitionRequest): Future[GetCelebrityRecognitionResponse] = service.getCelebrityRecognition(params).promise().toFuture
    @inline def getContentModerationFuture(params: GetContentModerationRequest): Future[GetContentModerationResponse] = service.getContentModeration(params).promise().toFuture
    @inline def getFaceDetectionFuture(params: GetFaceDetectionRequest): Future[GetFaceDetectionResponse] = service.getFaceDetection(params).promise().toFuture
    @inline def getFaceSearchFuture(params: GetFaceSearchRequest): Future[GetFaceSearchResponse] = service.getFaceSearch(params).promise().toFuture
    @inline def getLabelDetectionFuture(params: GetLabelDetectionRequest): Future[GetLabelDetectionResponse] = service.getLabelDetection(params).promise().toFuture
    @inline def getPersonTrackingFuture(params: GetPersonTrackingRequest): Future[GetPersonTrackingResponse] = service.getPersonTracking(params).promise().toFuture
    @inline def getSegmentDetectionFuture(params: GetSegmentDetectionRequest): Future[GetSegmentDetectionResponse] = service.getSegmentDetection(params).promise().toFuture
    @inline def getTextDetectionFuture(params: GetTextDetectionRequest): Future[GetTextDetectionResponse] = service.getTextDetection(params).promise().toFuture
    @inline def indexFacesFuture(params: IndexFacesRequest): Future[IndexFacesResponse] = service.indexFaces(params).promise().toFuture
    @inline def listCollectionsFuture(params: ListCollectionsRequest): Future[ListCollectionsResponse] = service.listCollections(params).promise().toFuture
    @inline def listFacesFuture(params: ListFacesRequest): Future[ListFacesResponse] = service.listFaces(params).promise().toFuture
    @inline def listStreamProcessorsFuture(params: ListStreamProcessorsRequest): Future[ListStreamProcessorsResponse] = service.listStreamProcessors(params).promise().toFuture
    @inline def recognizeCelebritiesFuture(params: RecognizeCelebritiesRequest): Future[RecognizeCelebritiesResponse] = service.recognizeCelebrities(params).promise().toFuture
    @inline def searchFacesByImageFuture(params: SearchFacesByImageRequest): Future[SearchFacesByImageResponse] = service.searchFacesByImage(params).promise().toFuture
    @inline def searchFacesFuture(params: SearchFacesRequest): Future[SearchFacesResponse] = service.searchFaces(params).promise().toFuture
    @inline def startCelebrityRecognitionFuture(params: StartCelebrityRecognitionRequest): Future[StartCelebrityRecognitionResponse] = service.startCelebrityRecognition(params).promise().toFuture
    @inline def startContentModerationFuture(params: StartContentModerationRequest): Future[StartContentModerationResponse] = service.startContentModeration(params).promise().toFuture
    @inline def startFaceDetectionFuture(params: StartFaceDetectionRequest): Future[StartFaceDetectionResponse] = service.startFaceDetection(params).promise().toFuture
    @inline def startFaceSearchFuture(params: StartFaceSearchRequest): Future[StartFaceSearchResponse] = service.startFaceSearch(params).promise().toFuture
    @inline def startLabelDetectionFuture(params: StartLabelDetectionRequest): Future[StartLabelDetectionResponse] = service.startLabelDetection(params).promise().toFuture
    @inline def startPersonTrackingFuture(params: StartPersonTrackingRequest): Future[StartPersonTrackingResponse] = service.startPersonTracking(params).promise().toFuture
    @inline def startProjectVersionFuture(params: StartProjectVersionRequest): Future[StartProjectVersionResponse] = service.startProjectVersion(params).promise().toFuture
    @inline def startSegmentDetectionFuture(params: StartSegmentDetectionRequest): Future[StartSegmentDetectionResponse] = service.startSegmentDetection(params).promise().toFuture
    @inline def startStreamProcessorFuture(params: StartStreamProcessorRequest): Future[StartStreamProcessorResponse] = service.startStreamProcessor(params).promise().toFuture
    @inline def startTextDetectionFuture(params: StartTextDetectionRequest): Future[StartTextDetectionResponse] = service.startTextDetection(params).promise().toFuture
    @inline def stopProjectVersionFuture(params: StopProjectVersionRequest): Future[StopProjectVersionResponse] = service.stopProjectVersion(params).promise().toFuture
    @inline def stopStreamProcessorFuture(params: StopStreamProcessorRequest): Future[StopStreamProcessorResponse] = service.stopStreamProcessor(params).promise().toFuture

  }
}

package rekognition {
  @js.native
  @JSImport("aws-sdk/clients/rekognition", JSImport.Namespace, "AWS.Rekognition")
  class Rekognition() extends js.Object {
    def this(config: AWSConfig) = this()

    def compareFaces(params: CompareFacesRequest): Request[CompareFacesResponse] = js.native
    def createCollection(params: CreateCollectionRequest): Request[CreateCollectionResponse] = js.native
    def createProject(params: CreateProjectRequest): Request[CreateProjectResponse] = js.native
    def createProjectVersion(params: CreateProjectVersionRequest): Request[CreateProjectVersionResponse] = js.native
    def createStreamProcessor(params: CreateStreamProcessorRequest): Request[CreateStreamProcessorResponse] = js.native
    def deleteCollection(params: DeleteCollectionRequest): Request[DeleteCollectionResponse] = js.native
    def deleteFaces(params: DeleteFacesRequest): Request[DeleteFacesResponse] = js.native
    def deleteProject(params: DeleteProjectRequest): Request[DeleteProjectResponse] = js.native
    def deleteProjectVersion(params: DeleteProjectVersionRequest): Request[DeleteProjectVersionResponse] = js.native
    def deleteStreamProcessor(params: DeleteStreamProcessorRequest): Request[DeleteStreamProcessorResponse] = js.native
    def describeCollection(params: DescribeCollectionRequest): Request[DescribeCollectionResponse] = js.native
    def describeProjectVersions(params: DescribeProjectVersionsRequest): Request[DescribeProjectVersionsResponse] = js.native
    def describeProjects(params: DescribeProjectsRequest): Request[DescribeProjectsResponse] = js.native
    def describeStreamProcessor(params: DescribeStreamProcessorRequest): Request[DescribeStreamProcessorResponse] = js.native
    def detectCustomLabels(params: DetectCustomLabelsRequest): Request[DetectCustomLabelsResponse] = js.native
    def detectFaces(params: DetectFacesRequest): Request[DetectFacesResponse] = js.native
    def detectLabels(params: DetectLabelsRequest): Request[DetectLabelsResponse] = js.native
    def detectModerationLabels(params: DetectModerationLabelsRequest): Request[DetectModerationLabelsResponse] = js.native
    def detectText(params: DetectTextRequest): Request[DetectTextResponse] = js.native
    def getCelebrityInfo(params: GetCelebrityInfoRequest): Request[GetCelebrityInfoResponse] = js.native
    def getCelebrityRecognition(params: GetCelebrityRecognitionRequest): Request[GetCelebrityRecognitionResponse] = js.native
    def getContentModeration(params: GetContentModerationRequest): Request[GetContentModerationResponse] = js.native
    def getFaceDetection(params: GetFaceDetectionRequest): Request[GetFaceDetectionResponse] = js.native
    def getFaceSearch(params: GetFaceSearchRequest): Request[GetFaceSearchResponse] = js.native
    def getLabelDetection(params: GetLabelDetectionRequest): Request[GetLabelDetectionResponse] = js.native
    def getPersonTracking(params: GetPersonTrackingRequest): Request[GetPersonTrackingResponse] = js.native
    def getSegmentDetection(params: GetSegmentDetectionRequest): Request[GetSegmentDetectionResponse] = js.native
    def getTextDetection(params: GetTextDetectionRequest): Request[GetTextDetectionResponse] = js.native
    def indexFaces(params: IndexFacesRequest): Request[IndexFacesResponse] = js.native
    def listCollections(params: ListCollectionsRequest): Request[ListCollectionsResponse] = js.native
    def listFaces(params: ListFacesRequest): Request[ListFacesResponse] = js.native
    def listStreamProcessors(params: ListStreamProcessorsRequest): Request[ListStreamProcessorsResponse] = js.native
    def recognizeCelebrities(params: RecognizeCelebritiesRequest): Request[RecognizeCelebritiesResponse] = js.native
    def searchFaces(params: SearchFacesRequest): Request[SearchFacesResponse] = js.native
    def searchFacesByImage(params: SearchFacesByImageRequest): Request[SearchFacesByImageResponse] = js.native
    def startCelebrityRecognition(params: StartCelebrityRecognitionRequest): Request[StartCelebrityRecognitionResponse] = js.native
    def startContentModeration(params: StartContentModerationRequest): Request[StartContentModerationResponse] = js.native
    def startFaceDetection(params: StartFaceDetectionRequest): Request[StartFaceDetectionResponse] = js.native
    def startFaceSearch(params: StartFaceSearchRequest): Request[StartFaceSearchResponse] = js.native
    def startLabelDetection(params: StartLabelDetectionRequest): Request[StartLabelDetectionResponse] = js.native
    def startPersonTracking(params: StartPersonTrackingRequest): Request[StartPersonTrackingResponse] = js.native
    def startProjectVersion(params: StartProjectVersionRequest): Request[StartProjectVersionResponse] = js.native
    def startSegmentDetection(params: StartSegmentDetectionRequest): Request[StartSegmentDetectionResponse] = js.native
    def startStreamProcessor(params: StartStreamProcessorRequest): Request[StartStreamProcessorResponse] = js.native
    def startTextDetection(params: StartTextDetectionRequest): Request[StartTextDetectionResponse] = js.native
    def stopProjectVersion(params: StopProjectVersionRequest): Request[StopProjectVersionResponse] = js.native
    def stopStreamProcessor(params: StopStreamProcessorRequest): Request[StopStreamProcessorResponse] = js.native
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
    @inline
    def apply(
        High: js.UndefOr[UInteger] = js.undefined,
        Low: js.UndefOr[UInteger] = js.undefined
    ): AgeRange = {
      val __obj = js.Dynamic.literal()
      High.foreach(__v => __obj.updateDynamic("High")(__v.asInstanceOf[js.Any]))
      Low.foreach(__v => __obj.updateDynamic("Low")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AgeRange]
    }
  }

  /**
    * Assets are the images that you use to train and evaluate a model version. Assets are referenced by Sagemaker GroundTruth manifest files.
    */
  @js.native
  trait Asset extends js.Object {
    var GroundTruthManifest: js.UndefOr[GroundTruthManifest]
  }

  object Asset {
    @inline
    def apply(
        GroundTruthManifest: js.UndefOr[GroundTruthManifest] = js.undefined
    ): Asset = {
      val __obj = js.Dynamic.literal()
      GroundTruthManifest.foreach(__v => __obj.updateDynamic("GroundTruthManifest")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Asset]
    }
  }

  @js.native
  sealed trait Attribute extends js.Any
  object Attribute {
    val DEFAULT = "DEFAULT".asInstanceOf[Attribute]
    val ALL = "ALL".asInstanceOf[Attribute]

    @inline def values = js.Array(DEFAULT, ALL)
  }

  /**
    * Metadata information about an audio stream. An array of <code>AudioMetadata</code> objects for the audio streams found in a stored video is returned by <a>GetSegmentDetection</a>.
    */
  @js.native
  trait AudioMetadata extends js.Object {
    var Codec: js.UndefOr[String]
    var DurationMillis: js.UndefOr[ULong]
    var NumberOfChannels: js.UndefOr[ULong]
    var SampleRate: js.UndefOr[ULong]
  }

  object AudioMetadata {
    @inline
    def apply(
        Codec: js.UndefOr[String] = js.undefined,
        DurationMillis: js.UndefOr[ULong] = js.undefined,
        NumberOfChannels: js.UndefOr[ULong] = js.undefined,
        SampleRate: js.UndefOr[ULong] = js.undefined
    ): AudioMetadata = {
      val __obj = js.Dynamic.literal()
      Codec.foreach(__v => __obj.updateDynamic("Codec")(__v.asInstanceOf[js.Any]))
      DurationMillis.foreach(__v => __obj.updateDynamic("DurationMillis")(__v.asInstanceOf[js.Any]))
      NumberOfChannels.foreach(__v => __obj.updateDynamic("NumberOfChannels")(__v.asInstanceOf[js.Any]))
      SampleRate.foreach(__v => __obj.updateDynamic("SampleRate")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AudioMetadata]
    }
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
    @inline
    def apply(
        Confidence: js.UndefOr[Percent] = js.undefined,
        Value: js.UndefOr[Boolean] = js.undefined
    ): Beard = {
      val __obj = js.Dynamic.literal()
      Confidence.foreach(__v => __obj.updateDynamic("Confidence")(__v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Beard]
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
    @inline
    def apply(
        Height: js.UndefOr[Float] = js.undefined,
        Left: js.UndefOr[Float] = js.undefined,
        Top: js.UndefOr[Float] = js.undefined,
        Width: js.UndefOr[Float] = js.undefined
    ): BoundingBox = {
      val __obj = js.Dynamic.literal()
      Height.foreach(__v => __obj.updateDynamic("Height")(__v.asInstanceOf[js.Any]))
      Left.foreach(__v => __obj.updateDynamic("Left")(__v.asInstanceOf[js.Any]))
      Top.foreach(__v => __obj.updateDynamic("Top")(__v.asInstanceOf[js.Any]))
      Width.foreach(__v => __obj.updateDynamic("Width")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BoundingBox]
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
    @inline
    def apply(
        Face: js.UndefOr[ComparedFace] = js.undefined,
        Id: js.UndefOr[RekognitionUniqueId] = js.undefined,
        MatchConfidence: js.UndefOr[Percent] = js.undefined,
        Name: js.UndefOr[String] = js.undefined,
        Urls: js.UndefOr[Urls] = js.undefined
    ): Celebrity = {
      val __obj = js.Dynamic.literal()
      Face.foreach(__v => __obj.updateDynamic("Face")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      MatchConfidence.foreach(__v => __obj.updateDynamic("MatchConfidence")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Urls.foreach(__v => __obj.updateDynamic("Urls")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Celebrity]
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
    @inline
    def apply(
        BoundingBox: js.UndefOr[BoundingBox] = js.undefined,
        Confidence: js.UndefOr[Percent] = js.undefined,
        Face: js.UndefOr[FaceDetail] = js.undefined,
        Id: js.UndefOr[RekognitionUniqueId] = js.undefined,
        Name: js.UndefOr[String] = js.undefined,
        Urls: js.UndefOr[Urls] = js.undefined
    ): CelebrityDetail = {
      val __obj = js.Dynamic.literal()
      BoundingBox.foreach(__v => __obj.updateDynamic("BoundingBox")(__v.asInstanceOf[js.Any]))
      Confidence.foreach(__v => __obj.updateDynamic("Confidence")(__v.asInstanceOf[js.Any]))
      Face.foreach(__v => __obj.updateDynamic("Face")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Urls.foreach(__v => __obj.updateDynamic("Urls")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CelebrityDetail]
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
    @inline
    def apply(
        Celebrity: js.UndefOr[CelebrityDetail] = js.undefined,
        Timestamp: js.UndefOr[Timestamp] = js.undefined
    ): CelebrityRecognition = {
      val __obj = js.Dynamic.literal()
      Celebrity.foreach(__v => __obj.updateDynamic("Celebrity")(__v.asInstanceOf[js.Any]))
      Timestamp.foreach(__v => __obj.updateDynamic("Timestamp")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CelebrityRecognition]
    }
  }

  @js.native
  sealed trait CelebrityRecognitionSortBy extends js.Any
  object CelebrityRecognitionSortBy {
    val ID = "ID".asInstanceOf[CelebrityRecognitionSortBy]
    val TIMESTAMP = "TIMESTAMP".asInstanceOf[CelebrityRecognitionSortBy]

    @inline def values = js.Array(ID, TIMESTAMP)
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
    @inline
    def apply(
        Face: js.UndefOr[ComparedFace] = js.undefined,
        Similarity: js.UndefOr[Percent] = js.undefined
    ): CompareFacesMatch = {
      val __obj = js.Dynamic.literal()
      Face.foreach(__v => __obj.updateDynamic("Face")(__v.asInstanceOf[js.Any]))
      Similarity.foreach(__v => __obj.updateDynamic("Similarity")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CompareFacesMatch]
    }
  }

  @js.native
  trait CompareFacesRequest extends js.Object {
    var SourceImage: Image
    var TargetImage: Image
    var QualityFilter: js.UndefOr[QualityFilter]
    var SimilarityThreshold: js.UndefOr[Percent]
  }

  object CompareFacesRequest {
    @inline
    def apply(
        SourceImage: Image,
        TargetImage: Image,
        QualityFilter: js.UndefOr[QualityFilter] = js.undefined,
        SimilarityThreshold: js.UndefOr[Percent] = js.undefined
    ): CompareFacesRequest = {
      val __obj = js.Dynamic.literal(
        "SourceImage" -> SourceImage.asInstanceOf[js.Any],
        "TargetImage" -> TargetImage.asInstanceOf[js.Any]
      )

      QualityFilter.foreach(__v => __obj.updateDynamic("QualityFilter")(__v.asInstanceOf[js.Any]))
      SimilarityThreshold.foreach(__v => __obj.updateDynamic("SimilarityThreshold")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CompareFacesRequest]
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
    @inline
    def apply(
        FaceMatches: js.UndefOr[CompareFacesMatchList] = js.undefined,
        SourceImageFace: js.UndefOr[ComparedSourceImageFace] = js.undefined,
        SourceImageOrientationCorrection: js.UndefOr[OrientationCorrection] = js.undefined,
        TargetImageOrientationCorrection: js.UndefOr[OrientationCorrection] = js.undefined,
        UnmatchedFaces: js.UndefOr[CompareFacesUnmatchList] = js.undefined
    ): CompareFacesResponse = {
      val __obj = js.Dynamic.literal()
      FaceMatches.foreach(__v => __obj.updateDynamic("FaceMatches")(__v.asInstanceOf[js.Any]))
      SourceImageFace.foreach(__v => __obj.updateDynamic("SourceImageFace")(__v.asInstanceOf[js.Any]))
      SourceImageOrientationCorrection.foreach(__v => __obj.updateDynamic("SourceImageOrientationCorrection")(__v.asInstanceOf[js.Any]))
      TargetImageOrientationCorrection.foreach(__v => __obj.updateDynamic("TargetImageOrientationCorrection")(__v.asInstanceOf[js.Any]))
      UnmatchedFaces.foreach(__v => __obj.updateDynamic("UnmatchedFaces")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CompareFacesResponse]
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
    @inline
    def apply(
        BoundingBox: js.UndefOr[BoundingBox] = js.undefined,
        Confidence: js.UndefOr[Percent] = js.undefined,
        Landmarks: js.UndefOr[Landmarks] = js.undefined,
        Pose: js.UndefOr[Pose] = js.undefined,
        Quality: js.UndefOr[ImageQuality] = js.undefined
    ): ComparedFace = {
      val __obj = js.Dynamic.literal()
      BoundingBox.foreach(__v => __obj.updateDynamic("BoundingBox")(__v.asInstanceOf[js.Any]))
      Confidence.foreach(__v => __obj.updateDynamic("Confidence")(__v.asInstanceOf[js.Any]))
      Landmarks.foreach(__v => __obj.updateDynamic("Landmarks")(__v.asInstanceOf[js.Any]))
      Pose.foreach(__v => __obj.updateDynamic("Pose")(__v.asInstanceOf[js.Any]))
      Quality.foreach(__v => __obj.updateDynamic("Quality")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ComparedFace]
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
    @inline
    def apply(
        BoundingBox: js.UndefOr[BoundingBox] = js.undefined,
        Confidence: js.UndefOr[Percent] = js.undefined
    ): ComparedSourceImageFace = {
      val __obj = js.Dynamic.literal()
      BoundingBox.foreach(__v => __obj.updateDynamic("BoundingBox")(__v.asInstanceOf[js.Any]))
      Confidence.foreach(__v => __obj.updateDynamic("Confidence")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ComparedSourceImageFace]
    }
  }

  @js.native
  sealed trait ContentClassifier extends js.Any
  object ContentClassifier {
    val FreeOfPersonallyIdentifiableInformation = "FreeOfPersonallyIdentifiableInformation".asInstanceOf[ContentClassifier]
    val FreeOfAdultContent = "FreeOfAdultContent".asInstanceOf[ContentClassifier]

    @inline def values = js.Array(FreeOfPersonallyIdentifiableInformation, FreeOfAdultContent)
  }

  /**
    * Information about an unsafe content label detection in a stored video.
    */
  @js.native
  trait ContentModerationDetection extends js.Object {
    var ModerationLabel: js.UndefOr[ModerationLabel]
    var Timestamp: js.UndefOr[Timestamp]
  }

  object ContentModerationDetection {
    @inline
    def apply(
        ModerationLabel: js.UndefOr[ModerationLabel] = js.undefined,
        Timestamp: js.UndefOr[Timestamp] = js.undefined
    ): ContentModerationDetection = {
      val __obj = js.Dynamic.literal()
      ModerationLabel.foreach(__v => __obj.updateDynamic("ModerationLabel")(__v.asInstanceOf[js.Any]))
      Timestamp.foreach(__v => __obj.updateDynamic("Timestamp")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ContentModerationDetection]
    }
  }

  @js.native
  sealed trait ContentModerationSortBy extends js.Any
  object ContentModerationSortBy {
    val NAME = "NAME".asInstanceOf[ContentModerationSortBy]
    val TIMESTAMP = "TIMESTAMP".asInstanceOf[ContentModerationSortBy]

    @inline def values = js.Array(NAME, TIMESTAMP)
  }

  @js.native
  trait CreateCollectionRequest extends js.Object {
    var CollectionId: CollectionId
  }

  object CreateCollectionRequest {
    @inline
    def apply(
        CollectionId: CollectionId
    ): CreateCollectionRequest = {
      val __obj = js.Dynamic.literal(
        "CollectionId" -> CollectionId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateCollectionRequest]
    }
  }

  @js.native
  trait CreateCollectionResponse extends js.Object {
    var CollectionArn: js.UndefOr[String]
    var FaceModelVersion: js.UndefOr[String]
    var StatusCode: js.UndefOr[UInteger]
  }

  object CreateCollectionResponse {
    @inline
    def apply(
        CollectionArn: js.UndefOr[String] = js.undefined,
        FaceModelVersion: js.UndefOr[String] = js.undefined,
        StatusCode: js.UndefOr[UInteger] = js.undefined
    ): CreateCollectionResponse = {
      val __obj = js.Dynamic.literal()
      CollectionArn.foreach(__v => __obj.updateDynamic("CollectionArn")(__v.asInstanceOf[js.Any]))
      FaceModelVersion.foreach(__v => __obj.updateDynamic("FaceModelVersion")(__v.asInstanceOf[js.Any]))
      StatusCode.foreach(__v => __obj.updateDynamic("StatusCode")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateCollectionResponse]
    }
  }

  @js.native
  trait CreateProjectRequest extends js.Object {
    var ProjectName: ProjectName
  }

  object CreateProjectRequest {
    @inline
    def apply(
        ProjectName: ProjectName
    ): CreateProjectRequest = {
      val __obj = js.Dynamic.literal(
        "ProjectName" -> ProjectName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateProjectRequest]
    }
  }

  @js.native
  trait CreateProjectResponse extends js.Object {
    var ProjectArn: js.UndefOr[ProjectArn]
  }

  object CreateProjectResponse {
    @inline
    def apply(
        ProjectArn: js.UndefOr[ProjectArn] = js.undefined
    ): CreateProjectResponse = {
      val __obj = js.Dynamic.literal()
      ProjectArn.foreach(__v => __obj.updateDynamic("ProjectArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateProjectResponse]
    }
  }

  @js.native
  trait CreateProjectVersionRequest extends js.Object {
    var OutputConfig: OutputConfig
    var ProjectArn: ProjectArn
    var TestingData: TestingData
    var TrainingData: TrainingData
    var VersionName: VersionName
  }

  object CreateProjectVersionRequest {
    @inline
    def apply(
        OutputConfig: OutputConfig,
        ProjectArn: ProjectArn,
        TestingData: TestingData,
        TrainingData: TrainingData,
        VersionName: VersionName
    ): CreateProjectVersionRequest = {
      val __obj = js.Dynamic.literal(
        "OutputConfig" -> OutputConfig.asInstanceOf[js.Any],
        "ProjectArn" -> ProjectArn.asInstanceOf[js.Any],
        "TestingData" -> TestingData.asInstanceOf[js.Any],
        "TrainingData" -> TrainingData.asInstanceOf[js.Any],
        "VersionName" -> VersionName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateProjectVersionRequest]
    }
  }

  @js.native
  trait CreateProjectVersionResponse extends js.Object {
    var ProjectVersionArn: js.UndefOr[ProjectVersionArn]
  }

  object CreateProjectVersionResponse {
    @inline
    def apply(
        ProjectVersionArn: js.UndefOr[ProjectVersionArn] = js.undefined
    ): CreateProjectVersionResponse = {
      val __obj = js.Dynamic.literal()
      ProjectVersionArn.foreach(__v => __obj.updateDynamic("ProjectVersionArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateProjectVersionResponse]
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
    @inline
    def apply(
        Input: StreamProcessorInput,
        Name: StreamProcessorName,
        Output: StreamProcessorOutput,
        RoleArn: RoleArn,
        Settings: StreamProcessorSettings
    ): CreateStreamProcessorRequest = {
      val __obj = js.Dynamic.literal(
        "Input" -> Input.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any],
        "Output" -> Output.asInstanceOf[js.Any],
        "RoleArn" -> RoleArn.asInstanceOf[js.Any],
        "Settings" -> Settings.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateStreamProcessorRequest]
    }
  }

  @js.native
  trait CreateStreamProcessorResponse extends js.Object {
    var StreamProcessorArn: js.UndefOr[StreamProcessorArn]
  }

  object CreateStreamProcessorResponse {
    @inline
    def apply(
        StreamProcessorArn: js.UndefOr[StreamProcessorArn] = js.undefined
    ): CreateStreamProcessorResponse = {
      val __obj = js.Dynamic.literal()
      StreamProcessorArn.foreach(__v => __obj.updateDynamic("StreamProcessorArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateStreamProcessorResponse]
    }
  }

  /**
    * A custom label detected in an image by a call to <a>DetectCustomLabels</a>.
    */
  @js.native
  trait CustomLabel extends js.Object {
    var Confidence: js.UndefOr[Percent]
    var Geometry: js.UndefOr[Geometry]
    var Name: js.UndefOr[String]
  }

  object CustomLabel {
    @inline
    def apply(
        Confidence: js.UndefOr[Percent] = js.undefined,
        Geometry: js.UndefOr[Geometry] = js.undefined,
        Name: js.UndefOr[String] = js.undefined
    ): CustomLabel = {
      val __obj = js.Dynamic.literal()
      Confidence.foreach(__v => __obj.updateDynamic("Confidence")(__v.asInstanceOf[js.Any]))
      Geometry.foreach(__v => __obj.updateDynamic("Geometry")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CustomLabel]
    }
  }

  @js.native
  trait DeleteCollectionRequest extends js.Object {
    var CollectionId: CollectionId
  }

  object DeleteCollectionRequest {
    @inline
    def apply(
        CollectionId: CollectionId
    ): DeleteCollectionRequest = {
      val __obj = js.Dynamic.literal(
        "CollectionId" -> CollectionId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteCollectionRequest]
    }
  }

  @js.native
  trait DeleteCollectionResponse extends js.Object {
    var StatusCode: js.UndefOr[UInteger]
  }

  object DeleteCollectionResponse {
    @inline
    def apply(
        StatusCode: js.UndefOr[UInteger] = js.undefined
    ): DeleteCollectionResponse = {
      val __obj = js.Dynamic.literal()
      StatusCode.foreach(__v => __obj.updateDynamic("StatusCode")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteCollectionResponse]
    }
  }

  @js.native
  trait DeleteFacesRequest extends js.Object {
    var CollectionId: CollectionId
    var FaceIds: FaceIdList
  }

  object DeleteFacesRequest {
    @inline
    def apply(
        CollectionId: CollectionId,
        FaceIds: FaceIdList
    ): DeleteFacesRequest = {
      val __obj = js.Dynamic.literal(
        "CollectionId" -> CollectionId.asInstanceOf[js.Any],
        "FaceIds" -> FaceIds.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteFacesRequest]
    }
  }

  @js.native
  trait DeleteFacesResponse extends js.Object {
    var DeletedFaces: js.UndefOr[FaceIdList]
  }

  object DeleteFacesResponse {
    @inline
    def apply(
        DeletedFaces: js.UndefOr[FaceIdList] = js.undefined
    ): DeleteFacesResponse = {
      val __obj = js.Dynamic.literal()
      DeletedFaces.foreach(__v => __obj.updateDynamic("DeletedFaces")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteFacesResponse]
    }
  }

  @js.native
  trait DeleteProjectRequest extends js.Object {
    var ProjectArn: ProjectArn
  }

  object DeleteProjectRequest {
    @inline
    def apply(
        ProjectArn: ProjectArn
    ): DeleteProjectRequest = {
      val __obj = js.Dynamic.literal(
        "ProjectArn" -> ProjectArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteProjectRequest]
    }
  }

  @js.native
  trait DeleteProjectResponse extends js.Object {
    var Status: js.UndefOr[ProjectStatus]
  }

  object DeleteProjectResponse {
    @inline
    def apply(
        Status: js.UndefOr[ProjectStatus] = js.undefined
    ): DeleteProjectResponse = {
      val __obj = js.Dynamic.literal()
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteProjectResponse]
    }
  }

  @js.native
  trait DeleteProjectVersionRequest extends js.Object {
    var ProjectVersionArn: ProjectVersionArn
  }

  object DeleteProjectVersionRequest {
    @inline
    def apply(
        ProjectVersionArn: ProjectVersionArn
    ): DeleteProjectVersionRequest = {
      val __obj = js.Dynamic.literal(
        "ProjectVersionArn" -> ProjectVersionArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteProjectVersionRequest]
    }
  }

  @js.native
  trait DeleteProjectVersionResponse extends js.Object {
    var Status: js.UndefOr[ProjectVersionStatus]
  }

  object DeleteProjectVersionResponse {
    @inline
    def apply(
        Status: js.UndefOr[ProjectVersionStatus] = js.undefined
    ): DeleteProjectVersionResponse = {
      val __obj = js.Dynamic.literal()
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteProjectVersionResponse]
    }
  }

  @js.native
  trait DeleteStreamProcessorRequest extends js.Object {
    var Name: StreamProcessorName
  }

  object DeleteStreamProcessorRequest {
    @inline
    def apply(
        Name: StreamProcessorName
    ): DeleteStreamProcessorRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteStreamProcessorRequest]
    }
  }

  @js.native
  trait DeleteStreamProcessorResponse extends js.Object {}

  object DeleteStreamProcessorResponse {
    @inline
    def apply(
    ): DeleteStreamProcessorResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DeleteStreamProcessorResponse]
    }
  }

  @js.native
  trait DescribeCollectionRequest extends js.Object {
    var CollectionId: CollectionId
  }

  object DescribeCollectionRequest {
    @inline
    def apply(
        CollectionId: CollectionId
    ): DescribeCollectionRequest = {
      val __obj = js.Dynamic.literal(
        "CollectionId" -> CollectionId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeCollectionRequest]
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
    @inline
    def apply(
        CollectionARN: js.UndefOr[String] = js.undefined,
        CreationTimestamp: js.UndefOr[DateTime] = js.undefined,
        FaceCount: js.UndefOr[ULong] = js.undefined,
        FaceModelVersion: js.UndefOr[String] = js.undefined
    ): DescribeCollectionResponse = {
      val __obj = js.Dynamic.literal()
      CollectionARN.foreach(__v => __obj.updateDynamic("CollectionARN")(__v.asInstanceOf[js.Any]))
      CreationTimestamp.foreach(__v => __obj.updateDynamic("CreationTimestamp")(__v.asInstanceOf[js.Any]))
      FaceCount.foreach(__v => __obj.updateDynamic("FaceCount")(__v.asInstanceOf[js.Any]))
      FaceModelVersion.foreach(__v => __obj.updateDynamic("FaceModelVersion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeCollectionResponse]
    }
  }

  @js.native
  trait DescribeProjectVersionsRequest extends js.Object {
    var ProjectArn: ProjectArn
    var MaxResults: js.UndefOr[ProjectVersionsPageSize]
    var NextToken: js.UndefOr[ExtendedPaginationToken]
    var VersionNames: js.UndefOr[VersionNames]
  }

  object DescribeProjectVersionsRequest {
    @inline
    def apply(
        ProjectArn: ProjectArn,
        MaxResults: js.UndefOr[ProjectVersionsPageSize] = js.undefined,
        NextToken: js.UndefOr[ExtendedPaginationToken] = js.undefined,
        VersionNames: js.UndefOr[VersionNames] = js.undefined
    ): DescribeProjectVersionsRequest = {
      val __obj = js.Dynamic.literal(
        "ProjectArn" -> ProjectArn.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      VersionNames.foreach(__v => __obj.updateDynamic("VersionNames")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeProjectVersionsRequest]
    }
  }

  @js.native
  trait DescribeProjectVersionsResponse extends js.Object {
    var NextToken: js.UndefOr[ExtendedPaginationToken]
    var ProjectVersionDescriptions: js.UndefOr[ProjectVersionDescriptions]
  }

  object DescribeProjectVersionsResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[ExtendedPaginationToken] = js.undefined,
        ProjectVersionDescriptions: js.UndefOr[ProjectVersionDescriptions] = js.undefined
    ): DescribeProjectVersionsResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      ProjectVersionDescriptions.foreach(__v => __obj.updateDynamic("ProjectVersionDescriptions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeProjectVersionsResponse]
    }
  }

  @js.native
  trait DescribeProjectsRequest extends js.Object {
    var MaxResults: js.UndefOr[ProjectsPageSize]
    var NextToken: js.UndefOr[ExtendedPaginationToken]
  }

  object DescribeProjectsRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[ProjectsPageSize] = js.undefined,
        NextToken: js.UndefOr[ExtendedPaginationToken] = js.undefined
    ): DescribeProjectsRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeProjectsRequest]
    }
  }

  @js.native
  trait DescribeProjectsResponse extends js.Object {
    var NextToken: js.UndefOr[ExtendedPaginationToken]
    var ProjectDescriptions: js.UndefOr[ProjectDescriptions]
  }

  object DescribeProjectsResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[ExtendedPaginationToken] = js.undefined,
        ProjectDescriptions: js.UndefOr[ProjectDescriptions] = js.undefined
    ): DescribeProjectsResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      ProjectDescriptions.foreach(__v => __obj.updateDynamic("ProjectDescriptions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeProjectsResponse]
    }
  }

  @js.native
  trait DescribeStreamProcessorRequest extends js.Object {
    var Name: StreamProcessorName
  }

  object DescribeStreamProcessorRequest {
    @inline
    def apply(
        Name: StreamProcessorName
    ): DescribeStreamProcessorRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeStreamProcessorRequest]
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
    @inline
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
      val __obj = js.Dynamic.literal()
      CreationTimestamp.foreach(__v => __obj.updateDynamic("CreationTimestamp")(__v.asInstanceOf[js.Any]))
      Input.foreach(__v => __obj.updateDynamic("Input")(__v.asInstanceOf[js.Any]))
      LastUpdateTimestamp.foreach(__v => __obj.updateDynamic("LastUpdateTimestamp")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Output.foreach(__v => __obj.updateDynamic("Output")(__v.asInstanceOf[js.Any]))
      RoleArn.foreach(__v => __obj.updateDynamic("RoleArn")(__v.asInstanceOf[js.Any]))
      Settings.foreach(__v => __obj.updateDynamic("Settings")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      StatusMessage.foreach(__v => __obj.updateDynamic("StatusMessage")(__v.asInstanceOf[js.Any]))
      StreamProcessorArn.foreach(__v => __obj.updateDynamic("StreamProcessorArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeStreamProcessorResponse]
    }
  }

  @js.native
  trait DetectCustomLabelsRequest extends js.Object {
    var Image: Image
    var ProjectVersionArn: ProjectVersionArn
    var MaxResults: js.UndefOr[UInteger]
    var MinConfidence: js.UndefOr[Percent]
  }

  object DetectCustomLabelsRequest {
    @inline
    def apply(
        Image: Image,
        ProjectVersionArn: ProjectVersionArn,
        MaxResults: js.UndefOr[UInteger] = js.undefined,
        MinConfidence: js.UndefOr[Percent] = js.undefined
    ): DetectCustomLabelsRequest = {
      val __obj = js.Dynamic.literal(
        "Image" -> Image.asInstanceOf[js.Any],
        "ProjectVersionArn" -> ProjectVersionArn.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      MinConfidence.foreach(__v => __obj.updateDynamic("MinConfidence")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DetectCustomLabelsRequest]
    }
  }

  @js.native
  trait DetectCustomLabelsResponse extends js.Object {
    var CustomLabels: js.UndefOr[CustomLabels]
  }

  object DetectCustomLabelsResponse {
    @inline
    def apply(
        CustomLabels: js.UndefOr[CustomLabels] = js.undefined
    ): DetectCustomLabelsResponse = {
      val __obj = js.Dynamic.literal()
      CustomLabels.foreach(__v => __obj.updateDynamic("CustomLabels")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DetectCustomLabelsResponse]
    }
  }

  @js.native
  trait DetectFacesRequest extends js.Object {
    var Image: Image
    var Attributes: js.UndefOr[Attributes]
  }

  object DetectFacesRequest {
    @inline
    def apply(
        Image: Image,
        Attributes: js.UndefOr[Attributes] = js.undefined
    ): DetectFacesRequest = {
      val __obj = js.Dynamic.literal(
        "Image" -> Image.asInstanceOf[js.Any]
      )

      Attributes.foreach(__v => __obj.updateDynamic("Attributes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DetectFacesRequest]
    }
  }

  @js.native
  trait DetectFacesResponse extends js.Object {
    var FaceDetails: js.UndefOr[FaceDetailList]
    var OrientationCorrection: js.UndefOr[OrientationCorrection]
  }

  object DetectFacesResponse {
    @inline
    def apply(
        FaceDetails: js.UndefOr[FaceDetailList] = js.undefined,
        OrientationCorrection: js.UndefOr[OrientationCorrection] = js.undefined
    ): DetectFacesResponse = {
      val __obj = js.Dynamic.literal()
      FaceDetails.foreach(__v => __obj.updateDynamic("FaceDetails")(__v.asInstanceOf[js.Any]))
      OrientationCorrection.foreach(__v => __obj.updateDynamic("OrientationCorrection")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DetectFacesResponse]
    }
  }

  @js.native
  trait DetectLabelsRequest extends js.Object {
    var Image: Image
    var MaxLabels: js.UndefOr[UInteger]
    var MinConfidence: js.UndefOr[Percent]
  }

  object DetectLabelsRequest {
    @inline
    def apply(
        Image: Image,
        MaxLabels: js.UndefOr[UInteger] = js.undefined,
        MinConfidence: js.UndefOr[Percent] = js.undefined
    ): DetectLabelsRequest = {
      val __obj = js.Dynamic.literal(
        "Image" -> Image.asInstanceOf[js.Any]
      )

      MaxLabels.foreach(__v => __obj.updateDynamic("MaxLabels")(__v.asInstanceOf[js.Any]))
      MinConfidence.foreach(__v => __obj.updateDynamic("MinConfidence")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DetectLabelsRequest]
    }
  }

  @js.native
  trait DetectLabelsResponse extends js.Object {
    var LabelModelVersion: js.UndefOr[String]
    var Labels: js.UndefOr[Labels]
    var OrientationCorrection: js.UndefOr[OrientationCorrection]
  }

  object DetectLabelsResponse {
    @inline
    def apply(
        LabelModelVersion: js.UndefOr[String] = js.undefined,
        Labels: js.UndefOr[Labels] = js.undefined,
        OrientationCorrection: js.UndefOr[OrientationCorrection] = js.undefined
    ): DetectLabelsResponse = {
      val __obj = js.Dynamic.literal()
      LabelModelVersion.foreach(__v => __obj.updateDynamic("LabelModelVersion")(__v.asInstanceOf[js.Any]))
      Labels.foreach(__v => __obj.updateDynamic("Labels")(__v.asInstanceOf[js.Any]))
      OrientationCorrection.foreach(__v => __obj.updateDynamic("OrientationCorrection")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DetectLabelsResponse]
    }
  }

  @js.native
  trait DetectModerationLabelsRequest extends js.Object {
    var Image: Image
    var HumanLoopConfig: js.UndefOr[HumanLoopConfig]
    var MinConfidence: js.UndefOr[Percent]
  }

  object DetectModerationLabelsRequest {
    @inline
    def apply(
        Image: Image,
        HumanLoopConfig: js.UndefOr[HumanLoopConfig] = js.undefined,
        MinConfidence: js.UndefOr[Percent] = js.undefined
    ): DetectModerationLabelsRequest = {
      val __obj = js.Dynamic.literal(
        "Image" -> Image.asInstanceOf[js.Any]
      )

      HumanLoopConfig.foreach(__v => __obj.updateDynamic("HumanLoopConfig")(__v.asInstanceOf[js.Any]))
      MinConfidence.foreach(__v => __obj.updateDynamic("MinConfidence")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DetectModerationLabelsRequest]
    }
  }

  @js.native
  trait DetectModerationLabelsResponse extends js.Object {
    var HumanLoopActivationOutput: js.UndefOr[HumanLoopActivationOutput]
    var ModerationLabels: js.UndefOr[ModerationLabels]
    var ModerationModelVersion: js.UndefOr[String]
  }

  object DetectModerationLabelsResponse {
    @inline
    def apply(
        HumanLoopActivationOutput: js.UndefOr[HumanLoopActivationOutput] = js.undefined,
        ModerationLabels: js.UndefOr[ModerationLabels] = js.undefined,
        ModerationModelVersion: js.UndefOr[String] = js.undefined
    ): DetectModerationLabelsResponse = {
      val __obj = js.Dynamic.literal()
      HumanLoopActivationOutput.foreach(__v => __obj.updateDynamic("HumanLoopActivationOutput")(__v.asInstanceOf[js.Any]))
      ModerationLabels.foreach(__v => __obj.updateDynamic("ModerationLabels")(__v.asInstanceOf[js.Any]))
      ModerationModelVersion.foreach(__v => __obj.updateDynamic("ModerationModelVersion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DetectModerationLabelsResponse]
    }
  }

  /**
    * A set of optional parameters that you can use to set the criteria that the text must meet to be included in your response. <code>WordFilter</code> looks at a word’s height, width, and minimum confidence. <code>RegionOfInterest</code> lets you set a specific region of the image to look for text in.
    */
  @js.native
  trait DetectTextFilters extends js.Object {
    var RegionsOfInterest: js.UndefOr[RegionsOfInterest]
    var WordFilter: js.UndefOr[DetectionFilter]
  }

  object DetectTextFilters {
    @inline
    def apply(
        RegionsOfInterest: js.UndefOr[RegionsOfInterest] = js.undefined,
        WordFilter: js.UndefOr[DetectionFilter] = js.undefined
    ): DetectTextFilters = {
      val __obj = js.Dynamic.literal()
      RegionsOfInterest.foreach(__v => __obj.updateDynamic("RegionsOfInterest")(__v.asInstanceOf[js.Any]))
      WordFilter.foreach(__v => __obj.updateDynamic("WordFilter")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DetectTextFilters]
    }
  }

  @js.native
  trait DetectTextRequest extends js.Object {
    var Image: Image
    var Filters: js.UndefOr[DetectTextFilters]
  }

  object DetectTextRequest {
    @inline
    def apply(
        Image: Image,
        Filters: js.UndefOr[DetectTextFilters] = js.undefined
    ): DetectTextRequest = {
      val __obj = js.Dynamic.literal(
        "Image" -> Image.asInstanceOf[js.Any]
      )

      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DetectTextRequest]
    }
  }

  @js.native
  trait DetectTextResponse extends js.Object {
    var TextDetections: js.UndefOr[TextDetectionList]
    var TextModelVersion: js.UndefOr[String]
  }

  object DetectTextResponse {
    @inline
    def apply(
        TextDetections: js.UndefOr[TextDetectionList] = js.undefined,
        TextModelVersion: js.UndefOr[String] = js.undefined
    ): DetectTextResponse = {
      val __obj = js.Dynamic.literal()
      TextDetections.foreach(__v => __obj.updateDynamic("TextDetections")(__v.asInstanceOf[js.Any]))
      TextModelVersion.foreach(__v => __obj.updateDynamic("TextModelVersion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DetectTextResponse]
    }
  }

  /**
    * A set of parameters that allow you to filter out certain results from your returned results.
    */
  @js.native
  trait DetectionFilter extends js.Object {
    var MinBoundingBoxHeight: js.UndefOr[BoundingBoxHeight]
    var MinBoundingBoxWidth: js.UndefOr[BoundingBoxWidth]
    var MinConfidence: js.UndefOr[Percent]
  }

  object DetectionFilter {
    @inline
    def apply(
        MinBoundingBoxHeight: js.UndefOr[BoundingBoxHeight] = js.undefined,
        MinBoundingBoxWidth: js.UndefOr[BoundingBoxWidth] = js.undefined,
        MinConfidence: js.UndefOr[Percent] = js.undefined
    ): DetectionFilter = {
      val __obj = js.Dynamic.literal()
      MinBoundingBoxHeight.foreach(__v => __obj.updateDynamic("MinBoundingBoxHeight")(__v.asInstanceOf[js.Any]))
      MinBoundingBoxWidth.foreach(__v => __obj.updateDynamic("MinBoundingBoxWidth")(__v.asInstanceOf[js.Any]))
      MinConfidence.foreach(__v => __obj.updateDynamic("MinConfidence")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DetectionFilter]
    }
  }

  /**
    * The emotions that appear to be expressed on the face, and the confidence level in the determination. The API is only making a determination of the physical appearance of a person's face. It is not a determination of the person’s internal emotional state and should not be used in such a way. For example, a person pretending to have a sad face might not be sad emotionally.
    */
  @js.native
  trait Emotion extends js.Object {
    var Confidence: js.UndefOr[Percent]
    var Type: js.UndefOr[EmotionName]
  }

  object Emotion {
    @inline
    def apply(
        Confidence: js.UndefOr[Percent] = js.undefined,
        Type: js.UndefOr[EmotionName] = js.undefined
    ): Emotion = {
      val __obj = js.Dynamic.literal()
      Confidence.foreach(__v => __obj.updateDynamic("Confidence")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Emotion]
    }
  }

  @js.native
  sealed trait EmotionName extends js.Any
  object EmotionName {
    val HAPPY = "HAPPY".asInstanceOf[EmotionName]
    val SAD = "SAD".asInstanceOf[EmotionName]
    val ANGRY = "ANGRY".asInstanceOf[EmotionName]
    val CONFUSED = "CONFUSED".asInstanceOf[EmotionName]
    val DISGUSTED = "DISGUSTED".asInstanceOf[EmotionName]
    val SURPRISED = "SURPRISED".asInstanceOf[EmotionName]
    val CALM = "CALM".asInstanceOf[EmotionName]
    val UNKNOWN = "UNKNOWN".asInstanceOf[EmotionName]
    val FEAR = "FEAR".asInstanceOf[EmotionName]

    @inline def values = js.Array(HAPPY, SAD, ANGRY, CONFUSED, DISGUSTED, SURPRISED, CALM, UNKNOWN, FEAR)
  }

  /**
    * The evaluation results for the training of a model.
    */
  @js.native
  trait EvaluationResult extends js.Object {
    var F1Score: js.UndefOr[Float]
    var Summary: js.UndefOr[Summary]
  }

  object EvaluationResult {
    @inline
    def apply(
        F1Score: js.UndefOr[Float] = js.undefined,
        Summary: js.UndefOr[Summary] = js.undefined
    ): EvaluationResult = {
      val __obj = js.Dynamic.literal()
      F1Score.foreach(__v => __obj.updateDynamic("F1Score")(__v.asInstanceOf[js.Any]))
      Summary.foreach(__v => __obj.updateDynamic("Summary")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EvaluationResult]
    }
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
    @inline
    def apply(
        Confidence: js.UndefOr[Percent] = js.undefined,
        Value: js.UndefOr[Boolean] = js.undefined
    ): EyeOpen = {
      val __obj = js.Dynamic.literal()
      Confidence.foreach(__v => __obj.updateDynamic("Confidence")(__v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EyeOpen]
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
    @inline
    def apply(
        Confidence: js.UndefOr[Percent] = js.undefined,
        Value: js.UndefOr[Boolean] = js.undefined
    ): Eyeglasses = {
      val __obj = js.Dynamic.literal()
      Confidence.foreach(__v => __obj.updateDynamic("Confidence")(__v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Eyeglasses]
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
    @inline
    def apply(
        BoundingBox: js.UndefOr[BoundingBox] = js.undefined,
        Confidence: js.UndefOr[Percent] = js.undefined,
        ExternalImageId: js.UndefOr[ExternalImageId] = js.undefined,
        FaceId: js.UndefOr[FaceId] = js.undefined,
        ImageId: js.UndefOr[ImageId] = js.undefined
    ): Face = {
      val __obj = js.Dynamic.literal()
      BoundingBox.foreach(__v => __obj.updateDynamic("BoundingBox")(__v.asInstanceOf[js.Any]))
      Confidence.foreach(__v => __obj.updateDynamic("Confidence")(__v.asInstanceOf[js.Any]))
      ExternalImageId.foreach(__v => __obj.updateDynamic("ExternalImageId")(__v.asInstanceOf[js.Any]))
      FaceId.foreach(__v => __obj.updateDynamic("FaceId")(__v.asInstanceOf[js.Any]))
      ImageId.foreach(__v => __obj.updateDynamic("ImageId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Face]
    }
  }

  @js.native
  sealed trait FaceAttributes extends js.Any
  object FaceAttributes {
    val DEFAULT = "DEFAULT".asInstanceOf[FaceAttributes]
    val ALL = "ALL".asInstanceOf[FaceAttributes]

    @inline def values = js.Array(DEFAULT, ALL)
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
    @inline
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
      val __obj = js.Dynamic.literal()
      AgeRange.foreach(__v => __obj.updateDynamic("AgeRange")(__v.asInstanceOf[js.Any]))
      Beard.foreach(__v => __obj.updateDynamic("Beard")(__v.asInstanceOf[js.Any]))
      BoundingBox.foreach(__v => __obj.updateDynamic("BoundingBox")(__v.asInstanceOf[js.Any]))
      Confidence.foreach(__v => __obj.updateDynamic("Confidence")(__v.asInstanceOf[js.Any]))
      Emotions.foreach(__v => __obj.updateDynamic("Emotions")(__v.asInstanceOf[js.Any]))
      Eyeglasses.foreach(__v => __obj.updateDynamic("Eyeglasses")(__v.asInstanceOf[js.Any]))
      EyesOpen.foreach(__v => __obj.updateDynamic("EyesOpen")(__v.asInstanceOf[js.Any]))
      Gender.foreach(__v => __obj.updateDynamic("Gender")(__v.asInstanceOf[js.Any]))
      Landmarks.foreach(__v => __obj.updateDynamic("Landmarks")(__v.asInstanceOf[js.Any]))
      MouthOpen.foreach(__v => __obj.updateDynamic("MouthOpen")(__v.asInstanceOf[js.Any]))
      Mustache.foreach(__v => __obj.updateDynamic("Mustache")(__v.asInstanceOf[js.Any]))
      Pose.foreach(__v => __obj.updateDynamic("Pose")(__v.asInstanceOf[js.Any]))
      Quality.foreach(__v => __obj.updateDynamic("Quality")(__v.asInstanceOf[js.Any]))
      Smile.foreach(__v => __obj.updateDynamic("Smile")(__v.asInstanceOf[js.Any]))
      Sunglasses.foreach(__v => __obj.updateDynamic("Sunglasses")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FaceDetail]
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
    @inline
    def apply(
        Face: js.UndefOr[FaceDetail] = js.undefined,
        Timestamp: js.UndefOr[Timestamp] = js.undefined
    ): FaceDetection = {
      val __obj = js.Dynamic.literal()
      Face.foreach(__v => __obj.updateDynamic("Face")(__v.asInstanceOf[js.Any]))
      Timestamp.foreach(__v => __obj.updateDynamic("Timestamp")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FaceDetection]
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
    @inline
    def apply(
        Face: js.UndefOr[Face] = js.undefined,
        Similarity: js.UndefOr[Percent] = js.undefined
    ): FaceMatch = {
      val __obj = js.Dynamic.literal()
      Face.foreach(__v => __obj.updateDynamic("Face")(__v.asInstanceOf[js.Any]))
      Similarity.foreach(__v => __obj.updateDynamic("Similarity")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FaceMatch]
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
    @inline
    def apply(
        Face: js.UndefOr[Face] = js.undefined,
        FaceDetail: js.UndefOr[FaceDetail] = js.undefined
    ): FaceRecord = {
      val __obj = js.Dynamic.literal()
      Face.foreach(__v => __obj.updateDynamic("Face")(__v.asInstanceOf[js.Any]))
      FaceDetail.foreach(__v => __obj.updateDynamic("FaceDetail")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FaceRecord]
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
    @inline
    def apply(
        CollectionId: js.UndefOr[CollectionId] = js.undefined,
        FaceMatchThreshold: js.UndefOr[Percent] = js.undefined
    ): FaceSearchSettings = {
      val __obj = js.Dynamic.literal()
      CollectionId.foreach(__v => __obj.updateDynamic("CollectionId")(__v.asInstanceOf[js.Any]))
      FaceMatchThreshold.foreach(__v => __obj.updateDynamic("FaceMatchThreshold")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FaceSearchSettings]
    }
  }

  @js.native
  sealed trait FaceSearchSortBy extends js.Any
  object FaceSearchSortBy {
    val INDEX = "INDEX".asInstanceOf[FaceSearchSortBy]
    val TIMESTAMP = "TIMESTAMP".asInstanceOf[FaceSearchSortBy]

    @inline def values = js.Array(INDEX, TIMESTAMP)
  }

  /**
    * The predicted gender of a detected face.
    *  Amazon Rekognition makes gender binary (male/female) predictions based on the physical appearance of a face in a particular image. This kind of prediction is not designed to categorize a person’s gender identity, and you shouldn't use Amazon Rekognition to make such a determination. For example, a male actor wearing a long-haired wig and earrings for a role might be predicted as female.
    *  Using Amazon Rekognition to make gender binary predictions is best suited for use cases where aggregate gender distribution statistics need to be analyzed without identifying specific users. For example, the percentage of female users compared to male users on a social media platform.
    *  We don't recommend using gender binary predictions to make decisions that impact&#x2028; an individual's rights, privacy, or access to services.
    */
  @js.native
  trait Gender extends js.Object {
    var Confidence: js.UndefOr[Percent]
    var Value: js.UndefOr[GenderType]
  }

  object Gender {
    @inline
    def apply(
        Confidence: js.UndefOr[Percent] = js.undefined,
        Value: js.UndefOr[GenderType] = js.undefined
    ): Gender = {
      val __obj = js.Dynamic.literal()
      Confidence.foreach(__v => __obj.updateDynamic("Confidence")(__v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Gender]
    }
  }

  @js.native
  sealed trait GenderType extends js.Any
  object GenderType {
    val Male = "Male".asInstanceOf[GenderType]
    val Female = "Female".asInstanceOf[GenderType]

    @inline def values = js.Array(Male, Female)
  }

  /**
    * Information about where an object (<a>DetectCustomLabels</a>) or text (<a>DetectText</a>) is located on an image.
    */
  @js.native
  trait Geometry extends js.Object {
    var BoundingBox: js.UndefOr[BoundingBox]
    var Polygon: js.UndefOr[Polygon]
  }

  object Geometry {
    @inline
    def apply(
        BoundingBox: js.UndefOr[BoundingBox] = js.undefined,
        Polygon: js.UndefOr[Polygon] = js.undefined
    ): Geometry = {
      val __obj = js.Dynamic.literal()
      BoundingBox.foreach(__v => __obj.updateDynamic("BoundingBox")(__v.asInstanceOf[js.Any]))
      Polygon.foreach(__v => __obj.updateDynamic("Polygon")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Geometry]
    }
  }

  @js.native
  trait GetCelebrityInfoRequest extends js.Object {
    var Id: RekognitionUniqueId
  }

  object GetCelebrityInfoRequest {
    @inline
    def apply(
        Id: RekognitionUniqueId
    ): GetCelebrityInfoRequest = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetCelebrityInfoRequest]
    }
  }

  @js.native
  trait GetCelebrityInfoResponse extends js.Object {
    var Name: js.UndefOr[String]
    var Urls: js.UndefOr[Urls]
  }

  object GetCelebrityInfoResponse {
    @inline
    def apply(
        Name: js.UndefOr[String] = js.undefined,
        Urls: js.UndefOr[Urls] = js.undefined
    ): GetCelebrityInfoResponse = {
      val __obj = js.Dynamic.literal()
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Urls.foreach(__v => __obj.updateDynamic("Urls")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetCelebrityInfoResponse]
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
    @inline
    def apply(
        JobId: JobId,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined,
        SortBy: js.UndefOr[CelebrityRecognitionSortBy] = js.undefined
    ): GetCelebrityRecognitionRequest = {
      val __obj = js.Dynamic.literal(
        "JobId" -> JobId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      SortBy.foreach(__v => __obj.updateDynamic("SortBy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetCelebrityRecognitionRequest]
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
    @inline
    def apply(
        Celebrities: js.UndefOr[CelebrityRecognitions] = js.undefined,
        JobStatus: js.UndefOr[VideoJobStatus] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined,
        StatusMessage: js.UndefOr[StatusMessage] = js.undefined,
        VideoMetadata: js.UndefOr[VideoMetadata] = js.undefined
    ): GetCelebrityRecognitionResponse = {
      val __obj = js.Dynamic.literal()
      Celebrities.foreach(__v => __obj.updateDynamic("Celebrities")(__v.asInstanceOf[js.Any]))
      JobStatus.foreach(__v => __obj.updateDynamic("JobStatus")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      StatusMessage.foreach(__v => __obj.updateDynamic("StatusMessage")(__v.asInstanceOf[js.Any]))
      VideoMetadata.foreach(__v => __obj.updateDynamic("VideoMetadata")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetCelebrityRecognitionResponse]
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
    @inline
    def apply(
        JobId: JobId,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined,
        SortBy: js.UndefOr[ContentModerationSortBy] = js.undefined
    ): GetContentModerationRequest = {
      val __obj = js.Dynamic.literal(
        "JobId" -> JobId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      SortBy.foreach(__v => __obj.updateDynamic("SortBy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetContentModerationRequest]
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
    @inline
    def apply(
        JobStatus: js.UndefOr[VideoJobStatus] = js.undefined,
        ModerationLabels: js.UndefOr[ContentModerationDetections] = js.undefined,
        ModerationModelVersion: js.UndefOr[String] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined,
        StatusMessage: js.UndefOr[StatusMessage] = js.undefined,
        VideoMetadata: js.UndefOr[VideoMetadata] = js.undefined
    ): GetContentModerationResponse = {
      val __obj = js.Dynamic.literal()
      JobStatus.foreach(__v => __obj.updateDynamic("JobStatus")(__v.asInstanceOf[js.Any]))
      ModerationLabels.foreach(__v => __obj.updateDynamic("ModerationLabels")(__v.asInstanceOf[js.Any]))
      ModerationModelVersion.foreach(__v => __obj.updateDynamic("ModerationModelVersion")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      StatusMessage.foreach(__v => __obj.updateDynamic("StatusMessage")(__v.asInstanceOf[js.Any]))
      VideoMetadata.foreach(__v => __obj.updateDynamic("VideoMetadata")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetContentModerationResponse]
    }
  }

  @js.native
  trait GetFaceDetectionRequest extends js.Object {
    var JobId: JobId
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[PaginationToken]
  }

  object GetFaceDetectionRequest {
    @inline
    def apply(
        JobId: JobId,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined
    ): GetFaceDetectionRequest = {
      val __obj = js.Dynamic.literal(
        "JobId" -> JobId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetFaceDetectionRequest]
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
    @inline
    def apply(
        Faces: js.UndefOr[FaceDetections] = js.undefined,
        JobStatus: js.UndefOr[VideoJobStatus] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined,
        StatusMessage: js.UndefOr[StatusMessage] = js.undefined,
        VideoMetadata: js.UndefOr[VideoMetadata] = js.undefined
    ): GetFaceDetectionResponse = {
      val __obj = js.Dynamic.literal()
      Faces.foreach(__v => __obj.updateDynamic("Faces")(__v.asInstanceOf[js.Any]))
      JobStatus.foreach(__v => __obj.updateDynamic("JobStatus")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      StatusMessage.foreach(__v => __obj.updateDynamic("StatusMessage")(__v.asInstanceOf[js.Any]))
      VideoMetadata.foreach(__v => __obj.updateDynamic("VideoMetadata")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetFaceDetectionResponse]
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
    @inline
    def apply(
        JobId: JobId,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined,
        SortBy: js.UndefOr[FaceSearchSortBy] = js.undefined
    ): GetFaceSearchRequest = {
      val __obj = js.Dynamic.literal(
        "JobId" -> JobId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      SortBy.foreach(__v => __obj.updateDynamic("SortBy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetFaceSearchRequest]
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
    @inline
    def apply(
        JobStatus: js.UndefOr[VideoJobStatus] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined,
        Persons: js.UndefOr[PersonMatches] = js.undefined,
        StatusMessage: js.UndefOr[StatusMessage] = js.undefined,
        VideoMetadata: js.UndefOr[VideoMetadata] = js.undefined
    ): GetFaceSearchResponse = {
      val __obj = js.Dynamic.literal()
      JobStatus.foreach(__v => __obj.updateDynamic("JobStatus")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Persons.foreach(__v => __obj.updateDynamic("Persons")(__v.asInstanceOf[js.Any]))
      StatusMessage.foreach(__v => __obj.updateDynamic("StatusMessage")(__v.asInstanceOf[js.Any]))
      VideoMetadata.foreach(__v => __obj.updateDynamic("VideoMetadata")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetFaceSearchResponse]
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
    @inline
    def apply(
        JobId: JobId,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined,
        SortBy: js.UndefOr[LabelDetectionSortBy] = js.undefined
    ): GetLabelDetectionRequest = {
      val __obj = js.Dynamic.literal(
        "JobId" -> JobId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      SortBy.foreach(__v => __obj.updateDynamic("SortBy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetLabelDetectionRequest]
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
    @inline
    def apply(
        JobStatus: js.UndefOr[VideoJobStatus] = js.undefined,
        LabelModelVersion: js.UndefOr[String] = js.undefined,
        Labels: js.UndefOr[LabelDetections] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined,
        StatusMessage: js.UndefOr[StatusMessage] = js.undefined,
        VideoMetadata: js.UndefOr[VideoMetadata] = js.undefined
    ): GetLabelDetectionResponse = {
      val __obj = js.Dynamic.literal()
      JobStatus.foreach(__v => __obj.updateDynamic("JobStatus")(__v.asInstanceOf[js.Any]))
      LabelModelVersion.foreach(__v => __obj.updateDynamic("LabelModelVersion")(__v.asInstanceOf[js.Any]))
      Labels.foreach(__v => __obj.updateDynamic("Labels")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      StatusMessage.foreach(__v => __obj.updateDynamic("StatusMessage")(__v.asInstanceOf[js.Any]))
      VideoMetadata.foreach(__v => __obj.updateDynamic("VideoMetadata")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetLabelDetectionResponse]
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
    @inline
    def apply(
        JobId: JobId,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined,
        SortBy: js.UndefOr[PersonTrackingSortBy] = js.undefined
    ): GetPersonTrackingRequest = {
      val __obj = js.Dynamic.literal(
        "JobId" -> JobId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      SortBy.foreach(__v => __obj.updateDynamic("SortBy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetPersonTrackingRequest]
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
    @inline
    def apply(
        JobStatus: js.UndefOr[VideoJobStatus] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined,
        Persons: js.UndefOr[PersonDetections] = js.undefined,
        StatusMessage: js.UndefOr[StatusMessage] = js.undefined,
        VideoMetadata: js.UndefOr[VideoMetadata] = js.undefined
    ): GetPersonTrackingResponse = {
      val __obj = js.Dynamic.literal()
      JobStatus.foreach(__v => __obj.updateDynamic("JobStatus")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Persons.foreach(__v => __obj.updateDynamic("Persons")(__v.asInstanceOf[js.Any]))
      StatusMessage.foreach(__v => __obj.updateDynamic("StatusMessage")(__v.asInstanceOf[js.Any]))
      VideoMetadata.foreach(__v => __obj.updateDynamic("VideoMetadata")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetPersonTrackingResponse]
    }
  }

  @js.native
  trait GetSegmentDetectionRequest extends js.Object {
    var JobId: JobId
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[PaginationToken]
  }

  object GetSegmentDetectionRequest {
    @inline
    def apply(
        JobId: JobId,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined
    ): GetSegmentDetectionRequest = {
      val __obj = js.Dynamic.literal(
        "JobId" -> JobId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetSegmentDetectionRequest]
    }
  }

  @js.native
  trait GetSegmentDetectionResponse extends js.Object {
    var AudioMetadata: js.UndefOr[AudioMetadataList]
    var JobStatus: js.UndefOr[VideoJobStatus]
    var NextToken: js.UndefOr[PaginationToken]
    var Segments: js.UndefOr[SegmentDetections]
    var SelectedSegmentTypes: js.UndefOr[SegmentTypesInfo]
    var StatusMessage: js.UndefOr[StatusMessage]
    var VideoMetadata: js.UndefOr[VideoMetadataList]
  }

  object GetSegmentDetectionResponse {
    @inline
    def apply(
        AudioMetadata: js.UndefOr[AudioMetadataList] = js.undefined,
        JobStatus: js.UndefOr[VideoJobStatus] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined,
        Segments: js.UndefOr[SegmentDetections] = js.undefined,
        SelectedSegmentTypes: js.UndefOr[SegmentTypesInfo] = js.undefined,
        StatusMessage: js.UndefOr[StatusMessage] = js.undefined,
        VideoMetadata: js.UndefOr[VideoMetadataList] = js.undefined
    ): GetSegmentDetectionResponse = {
      val __obj = js.Dynamic.literal()
      AudioMetadata.foreach(__v => __obj.updateDynamic("AudioMetadata")(__v.asInstanceOf[js.Any]))
      JobStatus.foreach(__v => __obj.updateDynamic("JobStatus")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Segments.foreach(__v => __obj.updateDynamic("Segments")(__v.asInstanceOf[js.Any]))
      SelectedSegmentTypes.foreach(__v => __obj.updateDynamic("SelectedSegmentTypes")(__v.asInstanceOf[js.Any]))
      StatusMessage.foreach(__v => __obj.updateDynamic("StatusMessage")(__v.asInstanceOf[js.Any]))
      VideoMetadata.foreach(__v => __obj.updateDynamic("VideoMetadata")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetSegmentDetectionResponse]
    }
  }

  @js.native
  trait GetTextDetectionRequest extends js.Object {
    var JobId: JobId
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[PaginationToken]
  }

  object GetTextDetectionRequest {
    @inline
    def apply(
        JobId: JobId,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined
    ): GetTextDetectionRequest = {
      val __obj = js.Dynamic.literal(
        "JobId" -> JobId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetTextDetectionRequest]
    }
  }

  @js.native
  trait GetTextDetectionResponse extends js.Object {
    var JobStatus: js.UndefOr[VideoJobStatus]
    var NextToken: js.UndefOr[PaginationToken]
    var StatusMessage: js.UndefOr[StatusMessage]
    var TextDetections: js.UndefOr[TextDetectionResults]
    var TextModelVersion: js.UndefOr[String]
    var VideoMetadata: js.UndefOr[VideoMetadata]
  }

  object GetTextDetectionResponse {
    @inline
    def apply(
        JobStatus: js.UndefOr[VideoJobStatus] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined,
        StatusMessage: js.UndefOr[StatusMessage] = js.undefined,
        TextDetections: js.UndefOr[TextDetectionResults] = js.undefined,
        TextModelVersion: js.UndefOr[String] = js.undefined,
        VideoMetadata: js.UndefOr[VideoMetadata] = js.undefined
    ): GetTextDetectionResponse = {
      val __obj = js.Dynamic.literal()
      JobStatus.foreach(__v => __obj.updateDynamic("JobStatus")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      StatusMessage.foreach(__v => __obj.updateDynamic("StatusMessage")(__v.asInstanceOf[js.Any]))
      TextDetections.foreach(__v => __obj.updateDynamic("TextDetections")(__v.asInstanceOf[js.Any]))
      TextModelVersion.foreach(__v => __obj.updateDynamic("TextModelVersion")(__v.asInstanceOf[js.Any]))
      VideoMetadata.foreach(__v => __obj.updateDynamic("VideoMetadata")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetTextDetectionResponse]
    }
  }

  /**
    * The S3 bucket that contains the Ground Truth manifest file.
    */
  @js.native
  trait GroundTruthManifest extends js.Object {
    var S3Object: js.UndefOr[S3Object]
  }

  object GroundTruthManifest {
    @inline
    def apply(
        S3Object: js.UndefOr[S3Object] = js.undefined
    ): GroundTruthManifest = {
      val __obj = js.Dynamic.literal()
      S3Object.foreach(__v => __obj.updateDynamic("S3Object")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GroundTruthManifest]
    }
  }

  /**
    * Shows the results of the human in the loop evaluation. If there is no HumanLoopArn, the input did not trigger human review.
    */
  @js.native
  trait HumanLoopActivationOutput extends js.Object {
    var HumanLoopActivationConditionsEvaluationResults: js.UndefOr[HumanLoopActivationConditionsEvaluationResults]
    var HumanLoopActivationReasons: js.UndefOr[HumanLoopActivationReasons]
    var HumanLoopArn: js.UndefOr[HumanLoopArn]
  }

  object HumanLoopActivationOutput {
    @inline
    def apply(
        HumanLoopActivationConditionsEvaluationResults: js.UndefOr[HumanLoopActivationConditionsEvaluationResults] = js.undefined,
        HumanLoopActivationReasons: js.UndefOr[HumanLoopActivationReasons] = js.undefined,
        HumanLoopArn: js.UndefOr[HumanLoopArn] = js.undefined
    ): HumanLoopActivationOutput = {
      val __obj = js.Dynamic.literal()
      HumanLoopActivationConditionsEvaluationResults.foreach(__v => __obj.updateDynamic("HumanLoopActivationConditionsEvaluationResults")(__v.asInstanceOf[js.Any]))
      HumanLoopActivationReasons.foreach(__v => __obj.updateDynamic("HumanLoopActivationReasons")(__v.asInstanceOf[js.Any]))
      HumanLoopArn.foreach(__v => __obj.updateDynamic("HumanLoopArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HumanLoopActivationOutput]
    }
  }

  /**
    * Sets up the flow definition the image will be sent to if one of the conditions is met. You can also set certain attributes of the image before review.
    */
  @js.native
  trait HumanLoopConfig extends js.Object {
    var FlowDefinitionArn: FlowDefinitionArn
    var HumanLoopName: HumanLoopName
    var DataAttributes: js.UndefOr[HumanLoopDataAttributes]
  }

  object HumanLoopConfig {
    @inline
    def apply(
        FlowDefinitionArn: FlowDefinitionArn,
        HumanLoopName: HumanLoopName,
        DataAttributes: js.UndefOr[HumanLoopDataAttributes] = js.undefined
    ): HumanLoopConfig = {
      val __obj = js.Dynamic.literal(
        "FlowDefinitionArn" -> FlowDefinitionArn.asInstanceOf[js.Any],
        "HumanLoopName" -> HumanLoopName.asInstanceOf[js.Any]
      )

      DataAttributes.foreach(__v => __obj.updateDynamic("DataAttributes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HumanLoopConfig]
    }
  }

  /**
    * Allows you to set attributes of the image. Currently, you can declare an image as free of personally identifiable information.
    */
  @js.native
  trait HumanLoopDataAttributes extends js.Object {
    var ContentClassifiers: js.UndefOr[ContentClassifiers]
  }

  object HumanLoopDataAttributes {
    @inline
    def apply(
        ContentClassifiers: js.UndefOr[ContentClassifiers] = js.undefined
    ): HumanLoopDataAttributes = {
      val __obj = js.Dynamic.literal()
      ContentClassifiers.foreach(__v => __obj.updateDynamic("ContentClassifiers")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HumanLoopDataAttributes]
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
    @inline
    def apply(
        Bytes: js.UndefOr[ImageBlob] = js.undefined,
        S3Object: js.UndefOr[S3Object] = js.undefined
    ): Image = {
      val __obj = js.Dynamic.literal()
      Bytes.foreach(__v => __obj.updateDynamic("Bytes")(__v.asInstanceOf[js.Any]))
      S3Object.foreach(__v => __obj.updateDynamic("S3Object")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Image]
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
    @inline
    def apply(
        Brightness: js.UndefOr[Float] = js.undefined,
        Sharpness: js.UndefOr[Float] = js.undefined
    ): ImageQuality = {
      val __obj = js.Dynamic.literal()
      Brightness.foreach(__v => __obj.updateDynamic("Brightness")(__v.asInstanceOf[js.Any]))
      Sharpness.foreach(__v => __obj.updateDynamic("Sharpness")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ImageQuality]
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
    @inline
    def apply(
        CollectionId: CollectionId,
        Image: Image,
        DetectionAttributes: js.UndefOr[Attributes] = js.undefined,
        ExternalImageId: js.UndefOr[ExternalImageId] = js.undefined,
        MaxFaces: js.UndefOr[MaxFacesToIndex] = js.undefined,
        QualityFilter: js.UndefOr[QualityFilter] = js.undefined
    ): IndexFacesRequest = {
      val __obj = js.Dynamic.literal(
        "CollectionId" -> CollectionId.asInstanceOf[js.Any],
        "Image" -> Image.asInstanceOf[js.Any]
      )

      DetectionAttributes.foreach(__v => __obj.updateDynamic("DetectionAttributes")(__v.asInstanceOf[js.Any]))
      ExternalImageId.foreach(__v => __obj.updateDynamic("ExternalImageId")(__v.asInstanceOf[js.Any]))
      MaxFaces.foreach(__v => __obj.updateDynamic("MaxFaces")(__v.asInstanceOf[js.Any]))
      QualityFilter.foreach(__v => __obj.updateDynamic("QualityFilter")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[IndexFacesRequest]
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
    @inline
    def apply(
        FaceModelVersion: js.UndefOr[String] = js.undefined,
        FaceRecords: js.UndefOr[FaceRecordList] = js.undefined,
        OrientationCorrection: js.UndefOr[OrientationCorrection] = js.undefined,
        UnindexedFaces: js.UndefOr[UnindexedFaces] = js.undefined
    ): IndexFacesResponse = {
      val __obj = js.Dynamic.literal()
      FaceModelVersion.foreach(__v => __obj.updateDynamic("FaceModelVersion")(__v.asInstanceOf[js.Any]))
      FaceRecords.foreach(__v => __obj.updateDynamic("FaceRecords")(__v.asInstanceOf[js.Any]))
      OrientationCorrection.foreach(__v => __obj.updateDynamic("OrientationCorrection")(__v.asInstanceOf[js.Any]))
      UnindexedFaces.foreach(__v => __obj.updateDynamic("UnindexedFaces")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[IndexFacesResponse]
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
    @inline
    def apply(
        BoundingBox: js.UndefOr[BoundingBox] = js.undefined,
        Confidence: js.UndefOr[Percent] = js.undefined
    ): Instance = {
      val __obj = js.Dynamic.literal()
      BoundingBox.foreach(__v => __obj.updateDynamic("BoundingBox")(__v.asInstanceOf[js.Any]))
      Confidence.foreach(__v => __obj.updateDynamic("Confidence")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Instance]
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
    @inline
    def apply(
        Arn: js.UndefOr[KinesisDataArn] = js.undefined
    ): KinesisDataStream = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[KinesisDataStream]
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
    @inline
    def apply(
        Arn: js.UndefOr[KinesisVideoArn] = js.undefined
    ): KinesisVideoStream = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[KinesisVideoStream]
    }
  }

  /**
    * Structure containing details about the detected label, including the name, detected instances, parent labels, and level of confidence.
    */
  @js.native
  trait Label extends js.Object {
    var Confidence: js.UndefOr[Percent]
    var Instances: js.UndefOr[Instances]
    var Name: js.UndefOr[String]
    var Parents: js.UndefOr[Parents]
  }

  object Label {
    @inline
    def apply(
        Confidence: js.UndefOr[Percent] = js.undefined,
        Instances: js.UndefOr[Instances] = js.undefined,
        Name: js.UndefOr[String] = js.undefined,
        Parents: js.UndefOr[Parents] = js.undefined
    ): Label = {
      val __obj = js.Dynamic.literal()
      Confidence.foreach(__v => __obj.updateDynamic("Confidence")(__v.asInstanceOf[js.Any]))
      Instances.foreach(__v => __obj.updateDynamic("Instances")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Parents.foreach(__v => __obj.updateDynamic("Parents")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Label]
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
    @inline
    def apply(
        Label: js.UndefOr[Label] = js.undefined,
        Timestamp: js.UndefOr[Timestamp] = js.undefined
    ): LabelDetection = {
      val __obj = js.Dynamic.literal()
      Label.foreach(__v => __obj.updateDynamic("Label")(__v.asInstanceOf[js.Any]))
      Timestamp.foreach(__v => __obj.updateDynamic("Timestamp")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LabelDetection]
    }
  }

  @js.native
  sealed trait LabelDetectionSortBy extends js.Any
  object LabelDetectionSortBy {
    val NAME = "NAME".asInstanceOf[LabelDetectionSortBy]
    val TIMESTAMP = "TIMESTAMP".asInstanceOf[LabelDetectionSortBy]

    @inline def values = js.Array(NAME, TIMESTAMP)
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
    @inline
    def apply(
        Type: js.UndefOr[LandmarkType] = js.undefined,
        X: js.UndefOr[Float] = js.undefined,
        Y: js.UndefOr[Float] = js.undefined
    ): Landmark = {
      val __obj = js.Dynamic.literal()
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      X.foreach(__v => __obj.updateDynamic("X")(__v.asInstanceOf[js.Any]))
      Y.foreach(__v => __obj.updateDynamic("Y")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Landmark]
    }
  }

  @js.native
  sealed trait LandmarkType extends js.Any
  object LandmarkType {
    val eyeLeft = "eyeLeft".asInstanceOf[LandmarkType]
    val eyeRight = "eyeRight".asInstanceOf[LandmarkType]
    val nose = "nose".asInstanceOf[LandmarkType]
    val mouthLeft = "mouthLeft".asInstanceOf[LandmarkType]
    val mouthRight = "mouthRight".asInstanceOf[LandmarkType]
    val leftEyeBrowLeft = "leftEyeBrowLeft".asInstanceOf[LandmarkType]
    val leftEyeBrowRight = "leftEyeBrowRight".asInstanceOf[LandmarkType]
    val leftEyeBrowUp = "leftEyeBrowUp".asInstanceOf[LandmarkType]
    val rightEyeBrowLeft = "rightEyeBrowLeft".asInstanceOf[LandmarkType]
    val rightEyeBrowRight = "rightEyeBrowRight".asInstanceOf[LandmarkType]
    val rightEyeBrowUp = "rightEyeBrowUp".asInstanceOf[LandmarkType]
    val leftEyeLeft = "leftEyeLeft".asInstanceOf[LandmarkType]
    val leftEyeRight = "leftEyeRight".asInstanceOf[LandmarkType]
    val leftEyeUp = "leftEyeUp".asInstanceOf[LandmarkType]
    val leftEyeDown = "leftEyeDown".asInstanceOf[LandmarkType]
    val rightEyeLeft = "rightEyeLeft".asInstanceOf[LandmarkType]
    val rightEyeRight = "rightEyeRight".asInstanceOf[LandmarkType]
    val rightEyeUp = "rightEyeUp".asInstanceOf[LandmarkType]
    val rightEyeDown = "rightEyeDown".asInstanceOf[LandmarkType]
    val noseLeft = "noseLeft".asInstanceOf[LandmarkType]
    val noseRight = "noseRight".asInstanceOf[LandmarkType]
    val mouthUp = "mouthUp".asInstanceOf[LandmarkType]
    val mouthDown = "mouthDown".asInstanceOf[LandmarkType]
    val leftPupil = "leftPupil".asInstanceOf[LandmarkType]
    val rightPupil = "rightPupil".asInstanceOf[LandmarkType]
    val upperJawlineLeft = "upperJawlineLeft".asInstanceOf[LandmarkType]
    val midJawlineLeft = "midJawlineLeft".asInstanceOf[LandmarkType]
    val chinBottom = "chinBottom".asInstanceOf[LandmarkType]
    val midJawlineRight = "midJawlineRight".asInstanceOf[LandmarkType]
    val upperJawlineRight = "upperJawlineRight".asInstanceOf[LandmarkType]

    @inline def values =
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
  }

  @js.native
  trait ListCollectionsRequest extends js.Object {
    var MaxResults: js.UndefOr[PageSize]
    var NextToken: js.UndefOr[PaginationToken]
  }

  object ListCollectionsRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[PageSize] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListCollectionsRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListCollectionsRequest]
    }
  }

  @js.native
  trait ListCollectionsResponse extends js.Object {
    var CollectionIds: js.UndefOr[CollectionIdList]
    var FaceModelVersions: js.UndefOr[FaceModelVersionList]
    var NextToken: js.UndefOr[PaginationToken]
  }

  object ListCollectionsResponse {
    @inline
    def apply(
        CollectionIds: js.UndefOr[CollectionIdList] = js.undefined,
        FaceModelVersions: js.UndefOr[FaceModelVersionList] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListCollectionsResponse = {
      val __obj = js.Dynamic.literal()
      CollectionIds.foreach(__v => __obj.updateDynamic("CollectionIds")(__v.asInstanceOf[js.Any]))
      FaceModelVersions.foreach(__v => __obj.updateDynamic("FaceModelVersions")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListCollectionsResponse]
    }
  }

  @js.native
  trait ListFacesRequest extends js.Object {
    var CollectionId: CollectionId
    var MaxResults: js.UndefOr[PageSize]
    var NextToken: js.UndefOr[PaginationToken]
  }

  object ListFacesRequest {
    @inline
    def apply(
        CollectionId: CollectionId,
        MaxResults: js.UndefOr[PageSize] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListFacesRequest = {
      val __obj = js.Dynamic.literal(
        "CollectionId" -> CollectionId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListFacesRequest]
    }
  }

  @js.native
  trait ListFacesResponse extends js.Object {
    var FaceModelVersion: js.UndefOr[String]
    var Faces: js.UndefOr[FaceList]
    var NextToken: js.UndefOr[String]
  }

  object ListFacesResponse {
    @inline
    def apply(
        FaceModelVersion: js.UndefOr[String] = js.undefined,
        Faces: js.UndefOr[FaceList] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListFacesResponse = {
      val __obj = js.Dynamic.literal()
      FaceModelVersion.foreach(__v => __obj.updateDynamic("FaceModelVersion")(__v.asInstanceOf[js.Any]))
      Faces.foreach(__v => __obj.updateDynamic("Faces")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListFacesResponse]
    }
  }

  @js.native
  trait ListStreamProcessorsRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[PaginationToken]
  }

  object ListStreamProcessorsRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListStreamProcessorsRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListStreamProcessorsRequest]
    }
  }

  @js.native
  trait ListStreamProcessorsResponse extends js.Object {
    var NextToken: js.UndefOr[PaginationToken]
    var StreamProcessors: js.UndefOr[StreamProcessorList]
  }

  object ListStreamProcessorsResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[PaginationToken] = js.undefined,
        StreamProcessors: js.UndefOr[StreamProcessorList] = js.undefined
    ): ListStreamProcessorsResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      StreamProcessors.foreach(__v => __obj.updateDynamic("StreamProcessors")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListStreamProcessorsResponse]
    }
  }

  /**
    * Provides information about a single type of unsafe content found in an image or video. Each type of moderated content has a label within a hierarchical taxonomy. For more information, see Detecting Unsafe Content in the Amazon Rekognition Developer Guide.
    */
  @js.native
  trait ModerationLabel extends js.Object {
    var Confidence: js.UndefOr[Percent]
    var Name: js.UndefOr[String]
    var ParentName: js.UndefOr[String]
  }

  object ModerationLabel {
    @inline
    def apply(
        Confidence: js.UndefOr[Percent] = js.undefined,
        Name: js.UndefOr[String] = js.undefined,
        ParentName: js.UndefOr[String] = js.undefined
    ): ModerationLabel = {
      val __obj = js.Dynamic.literal()
      Confidence.foreach(__v => __obj.updateDynamic("Confidence")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      ParentName.foreach(__v => __obj.updateDynamic("ParentName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ModerationLabel]
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
    @inline
    def apply(
        Confidence: js.UndefOr[Percent] = js.undefined,
        Value: js.UndefOr[Boolean] = js.undefined
    ): MouthOpen = {
      val __obj = js.Dynamic.literal()
      Confidence.foreach(__v => __obj.updateDynamic("Confidence")(__v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MouthOpen]
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
    @inline
    def apply(
        Confidence: js.UndefOr[Percent] = js.undefined,
        Value: js.UndefOr[Boolean] = js.undefined
    ): Mustache = {
      val __obj = js.Dynamic.literal()
      Confidence.foreach(__v => __obj.updateDynamic("Confidence")(__v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Mustache]
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
    @inline
    def apply(
        RoleArn: RoleArn,
        SNSTopicArn: SNSTopicArn
    ): NotificationChannel = {
      val __obj = js.Dynamic.literal(
        "RoleArn" -> RoleArn.asInstanceOf[js.Any],
        "SNSTopicArn" -> SNSTopicArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[NotificationChannel]
    }
  }

  @js.native
  sealed trait OrientationCorrection extends js.Any
  object OrientationCorrection {
    val ROTATE_0 = "ROTATE_0".asInstanceOf[OrientationCorrection]
    val ROTATE_90 = "ROTATE_90".asInstanceOf[OrientationCorrection]
    val ROTATE_180 = "ROTATE_180".asInstanceOf[OrientationCorrection]
    val ROTATE_270 = "ROTATE_270".asInstanceOf[OrientationCorrection]

    @inline def values = js.Array(ROTATE_0, ROTATE_90, ROTATE_180, ROTATE_270)
  }

  /**
    * The S3 bucket and folder location where training output is placed.
    */
  @js.native
  trait OutputConfig extends js.Object {
    var S3Bucket: js.UndefOr[S3Bucket]
    var S3KeyPrefix: js.UndefOr[S3KeyPrefix]
  }

  object OutputConfig {
    @inline
    def apply(
        S3Bucket: js.UndefOr[S3Bucket] = js.undefined,
        S3KeyPrefix: js.UndefOr[S3KeyPrefix] = js.undefined
    ): OutputConfig = {
      val __obj = js.Dynamic.literal()
      S3Bucket.foreach(__v => __obj.updateDynamic("S3Bucket")(__v.asInstanceOf[js.Any]))
      S3KeyPrefix.foreach(__v => __obj.updateDynamic("S3KeyPrefix")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OutputConfig]
    }
  }

  /**
    * A parent label for a label. A label can have 0, 1, or more parents.
    */
  @js.native
  trait Parent extends js.Object {
    var Name: js.UndefOr[String]
  }

  object Parent {
    @inline
    def apply(
        Name: js.UndefOr[String] = js.undefined
    ): Parent = {
      val __obj = js.Dynamic.literal()
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Parent]
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
    @inline
    def apply(
        BoundingBox: js.UndefOr[BoundingBox] = js.undefined,
        Face: js.UndefOr[FaceDetail] = js.undefined,
        Index: js.UndefOr[PersonIndex] = js.undefined
    ): PersonDetail = {
      val __obj = js.Dynamic.literal()
      BoundingBox.foreach(__v => __obj.updateDynamic("BoundingBox")(__v.asInstanceOf[js.Any]))
      Face.foreach(__v => __obj.updateDynamic("Face")(__v.asInstanceOf[js.Any]))
      Index.foreach(__v => __obj.updateDynamic("Index")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PersonDetail]
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
    @inline
    def apply(
        Person: js.UndefOr[PersonDetail] = js.undefined,
        Timestamp: js.UndefOr[Timestamp] = js.undefined
    ): PersonDetection = {
      val __obj = js.Dynamic.literal()
      Person.foreach(__v => __obj.updateDynamic("Person")(__v.asInstanceOf[js.Any]))
      Timestamp.foreach(__v => __obj.updateDynamic("Timestamp")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PersonDetection]
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
    @inline
    def apply(
        FaceMatches: js.UndefOr[FaceMatchList] = js.undefined,
        Person: js.UndefOr[PersonDetail] = js.undefined,
        Timestamp: js.UndefOr[Timestamp] = js.undefined
    ): PersonMatch = {
      val __obj = js.Dynamic.literal()
      FaceMatches.foreach(__v => __obj.updateDynamic("FaceMatches")(__v.asInstanceOf[js.Any]))
      Person.foreach(__v => __obj.updateDynamic("Person")(__v.asInstanceOf[js.Any]))
      Timestamp.foreach(__v => __obj.updateDynamic("Timestamp")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PersonMatch]
    }
  }

  @js.native
  sealed trait PersonTrackingSortBy extends js.Any
  object PersonTrackingSortBy {
    val INDEX = "INDEX".asInstanceOf[PersonTrackingSortBy]
    val TIMESTAMP = "TIMESTAMP".asInstanceOf[PersonTrackingSortBy]

    @inline def values = js.Array(INDEX, TIMESTAMP)
  }

  /**
    * The X and Y coordinates of a point on an image. The X and Y values returned are ratios of the overall image size. For example, if the input image is 700x200 and the operation returns X=0.5 and Y=0.25, then the point is at the (350,50) pixel coordinate on the image.
    *  An array of <code>Point</code> objects, <code>Polygon</code>, is returned by <a>DetectText</a> and by <a>DetectCustomLabels</a>. <code>Polygon</code> represents a fine-grained polygon around a detected item. For more information, see Geometry in the Amazon Rekognition Developer Guide.
    */
  @js.native
  trait Point extends js.Object {
    var X: js.UndefOr[Float]
    var Y: js.UndefOr[Float]
  }

  object Point {
    @inline
    def apply(
        X: js.UndefOr[Float] = js.undefined,
        Y: js.UndefOr[Float] = js.undefined
    ): Point = {
      val __obj = js.Dynamic.literal()
      X.foreach(__v => __obj.updateDynamic("X")(__v.asInstanceOf[js.Any]))
      Y.foreach(__v => __obj.updateDynamic("Y")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Point]
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
    @inline
    def apply(
        Pitch: js.UndefOr[Degree] = js.undefined,
        Roll: js.UndefOr[Degree] = js.undefined,
        Yaw: js.UndefOr[Degree] = js.undefined
    ): Pose = {
      val __obj = js.Dynamic.literal()
      Pitch.foreach(__v => __obj.updateDynamic("Pitch")(__v.asInstanceOf[js.Any]))
      Roll.foreach(__v => __obj.updateDynamic("Roll")(__v.asInstanceOf[js.Any]))
      Yaw.foreach(__v => __obj.updateDynamic("Yaw")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Pose]
    }
  }

  /**
    * A description of a Amazon Rekognition Custom Labels project.
    */
  @js.native
  trait ProjectDescription extends js.Object {
    var CreationTimestamp: js.UndefOr[DateTime]
    var ProjectArn: js.UndefOr[ProjectArn]
    var Status: js.UndefOr[ProjectStatus]
  }

  object ProjectDescription {
    @inline
    def apply(
        CreationTimestamp: js.UndefOr[DateTime] = js.undefined,
        ProjectArn: js.UndefOr[ProjectArn] = js.undefined,
        Status: js.UndefOr[ProjectStatus] = js.undefined
    ): ProjectDescription = {
      val __obj = js.Dynamic.literal()
      CreationTimestamp.foreach(__v => __obj.updateDynamic("CreationTimestamp")(__v.asInstanceOf[js.Any]))
      ProjectArn.foreach(__v => __obj.updateDynamic("ProjectArn")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ProjectDescription]
    }
  }

  @js.native
  sealed trait ProjectStatus extends js.Any
  object ProjectStatus {
    val CREATING = "CREATING".asInstanceOf[ProjectStatus]
    val CREATED = "CREATED".asInstanceOf[ProjectStatus]
    val DELETING = "DELETING".asInstanceOf[ProjectStatus]

    @inline def values = js.Array(CREATING, CREATED, DELETING)
  }

  /**
    * The description of a version of a model.
    */
  @js.native
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

  object ProjectVersionDescription {
    @inline
    def apply(
        BillableTrainingTimeInSeconds: js.UndefOr[ULong] = js.undefined,
        CreationTimestamp: js.UndefOr[DateTime] = js.undefined,
        EvaluationResult: js.UndefOr[EvaluationResult] = js.undefined,
        MinInferenceUnits: js.UndefOr[InferenceUnits] = js.undefined,
        OutputConfig: js.UndefOr[OutputConfig] = js.undefined,
        ProjectVersionArn: js.UndefOr[ProjectVersionArn] = js.undefined,
        Status: js.UndefOr[ProjectVersionStatus] = js.undefined,
        StatusMessage: js.UndefOr[StatusMessage] = js.undefined,
        TestingDataResult: js.UndefOr[TestingDataResult] = js.undefined,
        TrainingDataResult: js.UndefOr[TrainingDataResult] = js.undefined,
        TrainingEndTimestamp: js.UndefOr[DateTime] = js.undefined
    ): ProjectVersionDescription = {
      val __obj = js.Dynamic.literal()
      BillableTrainingTimeInSeconds.foreach(__v => __obj.updateDynamic("BillableTrainingTimeInSeconds")(__v.asInstanceOf[js.Any]))
      CreationTimestamp.foreach(__v => __obj.updateDynamic("CreationTimestamp")(__v.asInstanceOf[js.Any]))
      EvaluationResult.foreach(__v => __obj.updateDynamic("EvaluationResult")(__v.asInstanceOf[js.Any]))
      MinInferenceUnits.foreach(__v => __obj.updateDynamic("MinInferenceUnits")(__v.asInstanceOf[js.Any]))
      OutputConfig.foreach(__v => __obj.updateDynamic("OutputConfig")(__v.asInstanceOf[js.Any]))
      ProjectVersionArn.foreach(__v => __obj.updateDynamic("ProjectVersionArn")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      StatusMessage.foreach(__v => __obj.updateDynamic("StatusMessage")(__v.asInstanceOf[js.Any]))
      TestingDataResult.foreach(__v => __obj.updateDynamic("TestingDataResult")(__v.asInstanceOf[js.Any]))
      TrainingDataResult.foreach(__v => __obj.updateDynamic("TrainingDataResult")(__v.asInstanceOf[js.Any]))
      TrainingEndTimestamp.foreach(__v => __obj.updateDynamic("TrainingEndTimestamp")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ProjectVersionDescription]
    }
  }

  @js.native
  sealed trait ProjectVersionStatus extends js.Any
  object ProjectVersionStatus {
    val TRAINING_IN_PROGRESS = "TRAINING_IN_PROGRESS".asInstanceOf[ProjectVersionStatus]
    val TRAINING_COMPLETED = "TRAINING_COMPLETED".asInstanceOf[ProjectVersionStatus]
    val TRAINING_FAILED = "TRAINING_FAILED".asInstanceOf[ProjectVersionStatus]
    val STARTING = "STARTING".asInstanceOf[ProjectVersionStatus]
    val RUNNING = "RUNNING".asInstanceOf[ProjectVersionStatus]
    val FAILED = "FAILED".asInstanceOf[ProjectVersionStatus]
    val STOPPING = "STOPPING".asInstanceOf[ProjectVersionStatus]
    val STOPPED = "STOPPED".asInstanceOf[ProjectVersionStatus]
    val DELETING = "DELETING".asInstanceOf[ProjectVersionStatus]

    @inline def values = js.Array(TRAINING_IN_PROGRESS, TRAINING_COMPLETED, TRAINING_FAILED, STARTING, RUNNING, FAILED, STOPPING, STOPPED, DELETING)
  }

  @js.native
  sealed trait QualityFilter extends js.Any
  object QualityFilter {
    val NONE = "NONE".asInstanceOf[QualityFilter]
    val AUTO = "AUTO".asInstanceOf[QualityFilter]
    val LOW = "LOW".asInstanceOf[QualityFilter]
    val MEDIUM = "MEDIUM".asInstanceOf[QualityFilter]
    val HIGH = "HIGH".asInstanceOf[QualityFilter]

    @inline def values = js.Array(NONE, AUTO, LOW, MEDIUM, HIGH)
  }

  @js.native
  sealed trait Reason extends js.Any
  object Reason {
    val EXCEEDS_MAX_FACES = "EXCEEDS_MAX_FACES".asInstanceOf[Reason]
    val EXTREME_POSE = "EXTREME_POSE".asInstanceOf[Reason]
    val LOW_BRIGHTNESS = "LOW_BRIGHTNESS".asInstanceOf[Reason]
    val LOW_SHARPNESS = "LOW_SHARPNESS".asInstanceOf[Reason]
    val LOW_CONFIDENCE = "LOW_CONFIDENCE".asInstanceOf[Reason]
    val SMALL_BOUNDING_BOX = "SMALL_BOUNDING_BOX".asInstanceOf[Reason]
    val LOW_FACE_QUALITY = "LOW_FACE_QUALITY".asInstanceOf[Reason]

    @inline def values = js.Array(EXCEEDS_MAX_FACES, EXTREME_POSE, LOW_BRIGHTNESS, LOW_SHARPNESS, LOW_CONFIDENCE, SMALL_BOUNDING_BOX, LOW_FACE_QUALITY)
  }

  @js.native
  trait RecognizeCelebritiesRequest extends js.Object {
    var Image: Image
  }

  object RecognizeCelebritiesRequest {
    @inline
    def apply(
        Image: Image
    ): RecognizeCelebritiesRequest = {
      val __obj = js.Dynamic.literal(
        "Image" -> Image.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[RecognizeCelebritiesRequest]
    }
  }

  @js.native
  trait RecognizeCelebritiesResponse extends js.Object {
    var CelebrityFaces: js.UndefOr[CelebrityList]
    var OrientationCorrection: js.UndefOr[OrientationCorrection]
    var UnrecognizedFaces: js.UndefOr[ComparedFaceList]
  }

  object RecognizeCelebritiesResponse {
    @inline
    def apply(
        CelebrityFaces: js.UndefOr[CelebrityList] = js.undefined,
        OrientationCorrection: js.UndefOr[OrientationCorrection] = js.undefined,
        UnrecognizedFaces: js.UndefOr[ComparedFaceList] = js.undefined
    ): RecognizeCelebritiesResponse = {
      val __obj = js.Dynamic.literal()
      CelebrityFaces.foreach(__v => __obj.updateDynamic("CelebrityFaces")(__v.asInstanceOf[js.Any]))
      OrientationCorrection.foreach(__v => __obj.updateDynamic("OrientationCorrection")(__v.asInstanceOf[js.Any]))
      UnrecognizedFaces.foreach(__v => __obj.updateDynamic("UnrecognizedFaces")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RecognizeCelebritiesResponse]
    }
  }

  /**
    * Specifies a location within the frame that Rekognition checks for text. Uses a <code>BoundingBox</code> object to set a region of the screen.
    *  A word is included in the region if the word is more than half in that region. If there is more than one region, the word will be compared with all regions of the screen. Any word more than half in a region is kept in the results.
    */
  @js.native
  trait RegionOfInterest extends js.Object {
    var BoundingBox: js.UndefOr[BoundingBox]
  }

  object RegionOfInterest {
    @inline
    def apply(
        BoundingBox: js.UndefOr[BoundingBox] = js.undefined
    ): RegionOfInterest = {
      val __obj = js.Dynamic.literal()
      BoundingBox.foreach(__v => __obj.updateDynamic("BoundingBox")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RegionOfInterest]
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
    @inline
    def apply(
        Bucket: js.UndefOr[S3Bucket] = js.undefined,
        Name: js.UndefOr[S3ObjectName] = js.undefined,
        Version: js.UndefOr[S3ObjectVersion] = js.undefined
    ): S3Object = {
      val __obj = js.Dynamic.literal()
      Bucket.foreach(__v => __obj.updateDynamic("Bucket")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Version.foreach(__v => __obj.updateDynamic("Version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[S3Object]
    }
  }

  @js.native
  trait SearchFacesByImageRequest extends js.Object {
    var CollectionId: CollectionId
    var Image: Image
    var FaceMatchThreshold: js.UndefOr[Percent]
    var MaxFaces: js.UndefOr[MaxFaces]
    var QualityFilter: js.UndefOr[QualityFilter]
  }

  object SearchFacesByImageRequest {
    @inline
    def apply(
        CollectionId: CollectionId,
        Image: Image,
        FaceMatchThreshold: js.UndefOr[Percent] = js.undefined,
        MaxFaces: js.UndefOr[MaxFaces] = js.undefined,
        QualityFilter: js.UndefOr[QualityFilter] = js.undefined
    ): SearchFacesByImageRequest = {
      val __obj = js.Dynamic.literal(
        "CollectionId" -> CollectionId.asInstanceOf[js.Any],
        "Image" -> Image.asInstanceOf[js.Any]
      )

      FaceMatchThreshold.foreach(__v => __obj.updateDynamic("FaceMatchThreshold")(__v.asInstanceOf[js.Any]))
      MaxFaces.foreach(__v => __obj.updateDynamic("MaxFaces")(__v.asInstanceOf[js.Any]))
      QualityFilter.foreach(__v => __obj.updateDynamic("QualityFilter")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SearchFacesByImageRequest]
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
    @inline
    def apply(
        FaceMatches: js.UndefOr[FaceMatchList] = js.undefined,
        FaceModelVersion: js.UndefOr[String] = js.undefined,
        SearchedFaceBoundingBox: js.UndefOr[BoundingBox] = js.undefined,
        SearchedFaceConfidence: js.UndefOr[Percent] = js.undefined
    ): SearchFacesByImageResponse = {
      val __obj = js.Dynamic.literal()
      FaceMatches.foreach(__v => __obj.updateDynamic("FaceMatches")(__v.asInstanceOf[js.Any]))
      FaceModelVersion.foreach(__v => __obj.updateDynamic("FaceModelVersion")(__v.asInstanceOf[js.Any]))
      SearchedFaceBoundingBox.foreach(__v => __obj.updateDynamic("SearchedFaceBoundingBox")(__v.asInstanceOf[js.Any]))
      SearchedFaceConfidence.foreach(__v => __obj.updateDynamic("SearchedFaceConfidence")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SearchFacesByImageResponse]
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
    @inline
    def apply(
        CollectionId: CollectionId,
        FaceId: FaceId,
        FaceMatchThreshold: js.UndefOr[Percent] = js.undefined,
        MaxFaces: js.UndefOr[MaxFaces] = js.undefined
    ): SearchFacesRequest = {
      val __obj = js.Dynamic.literal(
        "CollectionId" -> CollectionId.asInstanceOf[js.Any],
        "FaceId" -> FaceId.asInstanceOf[js.Any]
      )

      FaceMatchThreshold.foreach(__v => __obj.updateDynamic("FaceMatchThreshold")(__v.asInstanceOf[js.Any]))
      MaxFaces.foreach(__v => __obj.updateDynamic("MaxFaces")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SearchFacesRequest]
    }
  }

  @js.native
  trait SearchFacesResponse extends js.Object {
    var FaceMatches: js.UndefOr[FaceMatchList]
    var FaceModelVersion: js.UndefOr[String]
    var SearchedFaceId: js.UndefOr[FaceId]
  }

  object SearchFacesResponse {
    @inline
    def apply(
        FaceMatches: js.UndefOr[FaceMatchList] = js.undefined,
        FaceModelVersion: js.UndefOr[String] = js.undefined,
        SearchedFaceId: js.UndefOr[FaceId] = js.undefined
    ): SearchFacesResponse = {
      val __obj = js.Dynamic.literal()
      FaceMatches.foreach(__v => __obj.updateDynamic("FaceMatches")(__v.asInstanceOf[js.Any]))
      FaceModelVersion.foreach(__v => __obj.updateDynamic("FaceModelVersion")(__v.asInstanceOf[js.Any]))
      SearchedFaceId.foreach(__v => __obj.updateDynamic("SearchedFaceId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SearchFacesResponse]
    }
  }

  /**
    * A technical cue or shot detection segment detected in a video. An array of <code>SegmentDetection</code> objects containing all segments detected in a stored video is returned by <a>GetSegmentDetection</a>.
    */
  @js.native
  trait SegmentDetection extends js.Object {
    var DurationMillis: js.UndefOr[ULong]
    var DurationSMPTE: js.UndefOr[Timecode]
    var EndTimecodeSMPTE: js.UndefOr[Timecode]
    var EndTimestampMillis: js.UndefOr[Timestamp]
    var ShotSegment: js.UndefOr[ShotSegment]
    var StartTimecodeSMPTE: js.UndefOr[Timecode]
    var StartTimestampMillis: js.UndefOr[Timestamp]
    var TechnicalCueSegment: js.UndefOr[TechnicalCueSegment]
    var Type: js.UndefOr[SegmentType]
  }

  object SegmentDetection {
    @inline
    def apply(
        DurationMillis: js.UndefOr[ULong] = js.undefined,
        DurationSMPTE: js.UndefOr[Timecode] = js.undefined,
        EndTimecodeSMPTE: js.UndefOr[Timecode] = js.undefined,
        EndTimestampMillis: js.UndefOr[Timestamp] = js.undefined,
        ShotSegment: js.UndefOr[ShotSegment] = js.undefined,
        StartTimecodeSMPTE: js.UndefOr[Timecode] = js.undefined,
        StartTimestampMillis: js.UndefOr[Timestamp] = js.undefined,
        TechnicalCueSegment: js.UndefOr[TechnicalCueSegment] = js.undefined,
        Type: js.UndefOr[SegmentType] = js.undefined
    ): SegmentDetection = {
      val __obj = js.Dynamic.literal()
      DurationMillis.foreach(__v => __obj.updateDynamic("DurationMillis")(__v.asInstanceOf[js.Any]))
      DurationSMPTE.foreach(__v => __obj.updateDynamic("DurationSMPTE")(__v.asInstanceOf[js.Any]))
      EndTimecodeSMPTE.foreach(__v => __obj.updateDynamic("EndTimecodeSMPTE")(__v.asInstanceOf[js.Any]))
      EndTimestampMillis.foreach(__v => __obj.updateDynamic("EndTimestampMillis")(__v.asInstanceOf[js.Any]))
      ShotSegment.foreach(__v => __obj.updateDynamic("ShotSegment")(__v.asInstanceOf[js.Any]))
      StartTimecodeSMPTE.foreach(__v => __obj.updateDynamic("StartTimecodeSMPTE")(__v.asInstanceOf[js.Any]))
      StartTimestampMillis.foreach(__v => __obj.updateDynamic("StartTimestampMillis")(__v.asInstanceOf[js.Any]))
      TechnicalCueSegment.foreach(__v => __obj.updateDynamic("TechnicalCueSegment")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SegmentDetection]
    }
  }

  @js.native
  sealed trait SegmentType extends js.Any
  object SegmentType {
    val TECHNICAL_CUE = "TECHNICAL_CUE".asInstanceOf[SegmentType]
    val SHOT = "SHOT".asInstanceOf[SegmentType]

    @inline def values = js.Array(TECHNICAL_CUE, SHOT)
  }

  /**
    * Information about the type of a segment requested in a call to <a>StartSegmentDetection</a>. An array of <code>SegmentTypeInfo</code> objects is returned by the response from <a>GetSegmentDetection</a>.
    */
  @js.native
  trait SegmentTypeInfo extends js.Object {
    var ModelVersion: js.UndefOr[String]
    var Type: js.UndefOr[SegmentType]
  }

  object SegmentTypeInfo {
    @inline
    def apply(
        ModelVersion: js.UndefOr[String] = js.undefined,
        Type: js.UndefOr[SegmentType] = js.undefined
    ): SegmentTypeInfo = {
      val __obj = js.Dynamic.literal()
      ModelVersion.foreach(__v => __obj.updateDynamic("ModelVersion")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SegmentTypeInfo]
    }
  }

  /**
    * Information about a shot detection segment detected in a video. For more information, see <a>SegmentDetection</a>.
    */
  @js.native
  trait ShotSegment extends js.Object {
    var Confidence: js.UndefOr[SegmentConfidence]
    var Index: js.UndefOr[ULong]
  }

  object ShotSegment {
    @inline
    def apply(
        Confidence: js.UndefOr[SegmentConfidence] = js.undefined,
        Index: js.UndefOr[ULong] = js.undefined
    ): ShotSegment = {
      val __obj = js.Dynamic.literal()
      Confidence.foreach(__v => __obj.updateDynamic("Confidence")(__v.asInstanceOf[js.Any]))
      Index.foreach(__v => __obj.updateDynamic("Index")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ShotSegment]
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
    @inline
    def apply(
        Confidence: js.UndefOr[Percent] = js.undefined,
        Value: js.UndefOr[Boolean] = js.undefined
    ): Smile = {
      val __obj = js.Dynamic.literal()
      Confidence.foreach(__v => __obj.updateDynamic("Confidence")(__v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Smile]
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
    @inline
    def apply(
        Video: Video,
        ClientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined,
        JobTag: js.UndefOr[JobTag] = js.undefined,
        NotificationChannel: js.UndefOr[NotificationChannel] = js.undefined
    ): StartCelebrityRecognitionRequest = {
      val __obj = js.Dynamic.literal(
        "Video" -> Video.asInstanceOf[js.Any]
      )

      ClientRequestToken.foreach(__v => __obj.updateDynamic("ClientRequestToken")(__v.asInstanceOf[js.Any]))
      JobTag.foreach(__v => __obj.updateDynamic("JobTag")(__v.asInstanceOf[js.Any]))
      NotificationChannel.foreach(__v => __obj.updateDynamic("NotificationChannel")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartCelebrityRecognitionRequest]
    }
  }

  @js.native
  trait StartCelebrityRecognitionResponse extends js.Object {
    var JobId: js.UndefOr[JobId]
  }

  object StartCelebrityRecognitionResponse {
    @inline
    def apply(
        JobId: js.UndefOr[JobId] = js.undefined
    ): StartCelebrityRecognitionResponse = {
      val __obj = js.Dynamic.literal()
      JobId.foreach(__v => __obj.updateDynamic("JobId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartCelebrityRecognitionResponse]
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
    @inline
    def apply(
        Video: Video,
        ClientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined,
        JobTag: js.UndefOr[JobTag] = js.undefined,
        MinConfidence: js.UndefOr[Percent] = js.undefined,
        NotificationChannel: js.UndefOr[NotificationChannel] = js.undefined
    ): StartContentModerationRequest = {
      val __obj = js.Dynamic.literal(
        "Video" -> Video.asInstanceOf[js.Any]
      )

      ClientRequestToken.foreach(__v => __obj.updateDynamic("ClientRequestToken")(__v.asInstanceOf[js.Any]))
      JobTag.foreach(__v => __obj.updateDynamic("JobTag")(__v.asInstanceOf[js.Any]))
      MinConfidence.foreach(__v => __obj.updateDynamic("MinConfidence")(__v.asInstanceOf[js.Any]))
      NotificationChannel.foreach(__v => __obj.updateDynamic("NotificationChannel")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartContentModerationRequest]
    }
  }

  @js.native
  trait StartContentModerationResponse extends js.Object {
    var JobId: js.UndefOr[JobId]
  }

  object StartContentModerationResponse {
    @inline
    def apply(
        JobId: js.UndefOr[JobId] = js.undefined
    ): StartContentModerationResponse = {
      val __obj = js.Dynamic.literal()
      JobId.foreach(__v => __obj.updateDynamic("JobId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartContentModerationResponse]
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
    @inline
    def apply(
        Video: Video,
        ClientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined,
        FaceAttributes: js.UndefOr[FaceAttributes] = js.undefined,
        JobTag: js.UndefOr[JobTag] = js.undefined,
        NotificationChannel: js.UndefOr[NotificationChannel] = js.undefined
    ): StartFaceDetectionRequest = {
      val __obj = js.Dynamic.literal(
        "Video" -> Video.asInstanceOf[js.Any]
      )

      ClientRequestToken.foreach(__v => __obj.updateDynamic("ClientRequestToken")(__v.asInstanceOf[js.Any]))
      FaceAttributes.foreach(__v => __obj.updateDynamic("FaceAttributes")(__v.asInstanceOf[js.Any]))
      JobTag.foreach(__v => __obj.updateDynamic("JobTag")(__v.asInstanceOf[js.Any]))
      NotificationChannel.foreach(__v => __obj.updateDynamic("NotificationChannel")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartFaceDetectionRequest]
    }
  }

  @js.native
  trait StartFaceDetectionResponse extends js.Object {
    var JobId: js.UndefOr[JobId]
  }

  object StartFaceDetectionResponse {
    @inline
    def apply(
        JobId: js.UndefOr[JobId] = js.undefined
    ): StartFaceDetectionResponse = {
      val __obj = js.Dynamic.literal()
      JobId.foreach(__v => __obj.updateDynamic("JobId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartFaceDetectionResponse]
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
    @inline
    def apply(
        CollectionId: CollectionId,
        Video: Video,
        ClientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined,
        FaceMatchThreshold: js.UndefOr[Percent] = js.undefined,
        JobTag: js.UndefOr[JobTag] = js.undefined,
        NotificationChannel: js.UndefOr[NotificationChannel] = js.undefined
    ): StartFaceSearchRequest = {
      val __obj = js.Dynamic.literal(
        "CollectionId" -> CollectionId.asInstanceOf[js.Any],
        "Video" -> Video.asInstanceOf[js.Any]
      )

      ClientRequestToken.foreach(__v => __obj.updateDynamic("ClientRequestToken")(__v.asInstanceOf[js.Any]))
      FaceMatchThreshold.foreach(__v => __obj.updateDynamic("FaceMatchThreshold")(__v.asInstanceOf[js.Any]))
      JobTag.foreach(__v => __obj.updateDynamic("JobTag")(__v.asInstanceOf[js.Any]))
      NotificationChannel.foreach(__v => __obj.updateDynamic("NotificationChannel")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartFaceSearchRequest]
    }
  }

  @js.native
  trait StartFaceSearchResponse extends js.Object {
    var JobId: js.UndefOr[JobId]
  }

  object StartFaceSearchResponse {
    @inline
    def apply(
        JobId: js.UndefOr[JobId] = js.undefined
    ): StartFaceSearchResponse = {
      val __obj = js.Dynamic.literal()
      JobId.foreach(__v => __obj.updateDynamic("JobId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartFaceSearchResponse]
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
    @inline
    def apply(
        Video: Video,
        ClientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined,
        JobTag: js.UndefOr[JobTag] = js.undefined,
        MinConfidence: js.UndefOr[Percent] = js.undefined,
        NotificationChannel: js.UndefOr[NotificationChannel] = js.undefined
    ): StartLabelDetectionRequest = {
      val __obj = js.Dynamic.literal(
        "Video" -> Video.asInstanceOf[js.Any]
      )

      ClientRequestToken.foreach(__v => __obj.updateDynamic("ClientRequestToken")(__v.asInstanceOf[js.Any]))
      JobTag.foreach(__v => __obj.updateDynamic("JobTag")(__v.asInstanceOf[js.Any]))
      MinConfidence.foreach(__v => __obj.updateDynamic("MinConfidence")(__v.asInstanceOf[js.Any]))
      NotificationChannel.foreach(__v => __obj.updateDynamic("NotificationChannel")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartLabelDetectionRequest]
    }
  }

  @js.native
  trait StartLabelDetectionResponse extends js.Object {
    var JobId: js.UndefOr[JobId]
  }

  object StartLabelDetectionResponse {
    @inline
    def apply(
        JobId: js.UndefOr[JobId] = js.undefined
    ): StartLabelDetectionResponse = {
      val __obj = js.Dynamic.literal()
      JobId.foreach(__v => __obj.updateDynamic("JobId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartLabelDetectionResponse]
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
    @inline
    def apply(
        Video: Video,
        ClientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined,
        JobTag: js.UndefOr[JobTag] = js.undefined,
        NotificationChannel: js.UndefOr[NotificationChannel] = js.undefined
    ): StartPersonTrackingRequest = {
      val __obj = js.Dynamic.literal(
        "Video" -> Video.asInstanceOf[js.Any]
      )

      ClientRequestToken.foreach(__v => __obj.updateDynamic("ClientRequestToken")(__v.asInstanceOf[js.Any]))
      JobTag.foreach(__v => __obj.updateDynamic("JobTag")(__v.asInstanceOf[js.Any]))
      NotificationChannel.foreach(__v => __obj.updateDynamic("NotificationChannel")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartPersonTrackingRequest]
    }
  }

  @js.native
  trait StartPersonTrackingResponse extends js.Object {
    var JobId: js.UndefOr[JobId]
  }

  object StartPersonTrackingResponse {
    @inline
    def apply(
        JobId: js.UndefOr[JobId] = js.undefined
    ): StartPersonTrackingResponse = {
      val __obj = js.Dynamic.literal()
      JobId.foreach(__v => __obj.updateDynamic("JobId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartPersonTrackingResponse]
    }
  }

  @js.native
  trait StartProjectVersionRequest extends js.Object {
    var MinInferenceUnits: InferenceUnits
    var ProjectVersionArn: ProjectVersionArn
  }

  object StartProjectVersionRequest {
    @inline
    def apply(
        MinInferenceUnits: InferenceUnits,
        ProjectVersionArn: ProjectVersionArn
    ): StartProjectVersionRequest = {
      val __obj = js.Dynamic.literal(
        "MinInferenceUnits" -> MinInferenceUnits.asInstanceOf[js.Any],
        "ProjectVersionArn" -> ProjectVersionArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[StartProjectVersionRequest]
    }
  }

  @js.native
  trait StartProjectVersionResponse extends js.Object {
    var Status: js.UndefOr[ProjectVersionStatus]
  }

  object StartProjectVersionResponse {
    @inline
    def apply(
        Status: js.UndefOr[ProjectVersionStatus] = js.undefined
    ): StartProjectVersionResponse = {
      val __obj = js.Dynamic.literal()
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartProjectVersionResponse]
    }
  }

  /**
    * Filters applied to the technical cue or shot detection segments. For more information, see <a>StartSegmentDetection</a>.
    */
  @js.native
  trait StartSegmentDetectionFilters extends js.Object {
    var ShotFilter: js.UndefOr[StartShotDetectionFilter]
    var TechnicalCueFilter: js.UndefOr[StartTechnicalCueDetectionFilter]
  }

  object StartSegmentDetectionFilters {
    @inline
    def apply(
        ShotFilter: js.UndefOr[StartShotDetectionFilter] = js.undefined,
        TechnicalCueFilter: js.UndefOr[StartTechnicalCueDetectionFilter] = js.undefined
    ): StartSegmentDetectionFilters = {
      val __obj = js.Dynamic.literal()
      ShotFilter.foreach(__v => __obj.updateDynamic("ShotFilter")(__v.asInstanceOf[js.Any]))
      TechnicalCueFilter.foreach(__v => __obj.updateDynamic("TechnicalCueFilter")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartSegmentDetectionFilters]
    }
  }

  @js.native
  trait StartSegmentDetectionRequest extends js.Object {
    var SegmentTypes: SegmentTypes
    var Video: Video
    var ClientRequestToken: js.UndefOr[ClientRequestToken]
    var Filters: js.UndefOr[StartSegmentDetectionFilters]
    var JobTag: js.UndefOr[JobTag]
    var NotificationChannel: js.UndefOr[NotificationChannel]
  }

  object StartSegmentDetectionRequest {
    @inline
    def apply(
        SegmentTypes: SegmentTypes,
        Video: Video,
        ClientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined,
        Filters: js.UndefOr[StartSegmentDetectionFilters] = js.undefined,
        JobTag: js.UndefOr[JobTag] = js.undefined,
        NotificationChannel: js.UndefOr[NotificationChannel] = js.undefined
    ): StartSegmentDetectionRequest = {
      val __obj = js.Dynamic.literal(
        "SegmentTypes" -> SegmentTypes.asInstanceOf[js.Any],
        "Video" -> Video.asInstanceOf[js.Any]
      )

      ClientRequestToken.foreach(__v => __obj.updateDynamic("ClientRequestToken")(__v.asInstanceOf[js.Any]))
      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      JobTag.foreach(__v => __obj.updateDynamic("JobTag")(__v.asInstanceOf[js.Any]))
      NotificationChannel.foreach(__v => __obj.updateDynamic("NotificationChannel")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartSegmentDetectionRequest]
    }
  }

  @js.native
  trait StartSegmentDetectionResponse extends js.Object {
    var JobId: js.UndefOr[JobId]
  }

  object StartSegmentDetectionResponse {
    @inline
    def apply(
        JobId: js.UndefOr[JobId] = js.undefined
    ): StartSegmentDetectionResponse = {
      val __obj = js.Dynamic.literal()
      JobId.foreach(__v => __obj.updateDynamic("JobId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartSegmentDetectionResponse]
    }
  }

  /**
    * Filters for the shot detection segments returned by <code>GetSegmentDetection</code>. For more information, see <a>StartSegmentDetectionFilters</a>.
    */
  @js.native
  trait StartShotDetectionFilter extends js.Object {
    var MinSegmentConfidence: js.UndefOr[SegmentConfidence]
  }

  object StartShotDetectionFilter {
    @inline
    def apply(
        MinSegmentConfidence: js.UndefOr[SegmentConfidence] = js.undefined
    ): StartShotDetectionFilter = {
      val __obj = js.Dynamic.literal()
      MinSegmentConfidence.foreach(__v => __obj.updateDynamic("MinSegmentConfidence")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartShotDetectionFilter]
    }
  }

  @js.native
  trait StartStreamProcessorRequest extends js.Object {
    var Name: StreamProcessorName
  }

  object StartStreamProcessorRequest {
    @inline
    def apply(
        Name: StreamProcessorName
    ): StartStreamProcessorRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[StartStreamProcessorRequest]
    }
  }

  @js.native
  trait StartStreamProcessorResponse extends js.Object {}

  object StartStreamProcessorResponse {
    @inline
    def apply(
    ): StartStreamProcessorResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[StartStreamProcessorResponse]
    }
  }

  /**
    * Filters for the technical segments returned by <a>GetSegmentDetection</a>. For more information, see <a>StartSegmentDetectionFilters</a>.
    */
  @js.native
  trait StartTechnicalCueDetectionFilter extends js.Object {
    var MinSegmentConfidence: js.UndefOr[SegmentConfidence]
  }

  object StartTechnicalCueDetectionFilter {
    @inline
    def apply(
        MinSegmentConfidence: js.UndefOr[SegmentConfidence] = js.undefined
    ): StartTechnicalCueDetectionFilter = {
      val __obj = js.Dynamic.literal()
      MinSegmentConfidence.foreach(__v => __obj.updateDynamic("MinSegmentConfidence")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartTechnicalCueDetectionFilter]
    }
  }

  /**
    * Set of optional parameters that let you set the criteria text must meet to be included in your response. <code>WordFilter</code> looks at a word's height, width and minimum confidence. <code>RegionOfInterest</code> lets you set a specific region of the screen to look for text in.
    */
  @js.native
  trait StartTextDetectionFilters extends js.Object {
    var RegionsOfInterest: js.UndefOr[RegionsOfInterest]
    var WordFilter: js.UndefOr[DetectionFilter]
  }

  object StartTextDetectionFilters {
    @inline
    def apply(
        RegionsOfInterest: js.UndefOr[RegionsOfInterest] = js.undefined,
        WordFilter: js.UndefOr[DetectionFilter] = js.undefined
    ): StartTextDetectionFilters = {
      val __obj = js.Dynamic.literal()
      RegionsOfInterest.foreach(__v => __obj.updateDynamic("RegionsOfInterest")(__v.asInstanceOf[js.Any]))
      WordFilter.foreach(__v => __obj.updateDynamic("WordFilter")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartTextDetectionFilters]
    }
  }

  @js.native
  trait StartTextDetectionRequest extends js.Object {
    var Video: Video
    var ClientRequestToken: js.UndefOr[ClientRequestToken]
    var Filters: js.UndefOr[StartTextDetectionFilters]
    var JobTag: js.UndefOr[JobTag]
    var NotificationChannel: js.UndefOr[NotificationChannel]
  }

  object StartTextDetectionRequest {
    @inline
    def apply(
        Video: Video,
        ClientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined,
        Filters: js.UndefOr[StartTextDetectionFilters] = js.undefined,
        JobTag: js.UndefOr[JobTag] = js.undefined,
        NotificationChannel: js.UndefOr[NotificationChannel] = js.undefined
    ): StartTextDetectionRequest = {
      val __obj = js.Dynamic.literal(
        "Video" -> Video.asInstanceOf[js.Any]
      )

      ClientRequestToken.foreach(__v => __obj.updateDynamic("ClientRequestToken")(__v.asInstanceOf[js.Any]))
      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      JobTag.foreach(__v => __obj.updateDynamic("JobTag")(__v.asInstanceOf[js.Any]))
      NotificationChannel.foreach(__v => __obj.updateDynamic("NotificationChannel")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartTextDetectionRequest]
    }
  }

  @js.native
  trait StartTextDetectionResponse extends js.Object {
    var JobId: js.UndefOr[JobId]
  }

  object StartTextDetectionResponse {
    @inline
    def apply(
        JobId: js.UndefOr[JobId] = js.undefined
    ): StartTextDetectionResponse = {
      val __obj = js.Dynamic.literal()
      JobId.foreach(__v => __obj.updateDynamic("JobId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartTextDetectionResponse]
    }
  }

  @js.native
  trait StopProjectVersionRequest extends js.Object {
    var ProjectVersionArn: ProjectVersionArn
  }

  object StopProjectVersionRequest {
    @inline
    def apply(
        ProjectVersionArn: ProjectVersionArn
    ): StopProjectVersionRequest = {
      val __obj = js.Dynamic.literal(
        "ProjectVersionArn" -> ProjectVersionArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[StopProjectVersionRequest]
    }
  }

  @js.native
  trait StopProjectVersionResponse extends js.Object {
    var Status: js.UndefOr[ProjectVersionStatus]
  }

  object StopProjectVersionResponse {
    @inline
    def apply(
        Status: js.UndefOr[ProjectVersionStatus] = js.undefined
    ): StopProjectVersionResponse = {
      val __obj = js.Dynamic.literal()
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StopProjectVersionResponse]
    }
  }

  @js.native
  trait StopStreamProcessorRequest extends js.Object {
    var Name: StreamProcessorName
  }

  object StopStreamProcessorRequest {
    @inline
    def apply(
        Name: StreamProcessorName
    ): StopStreamProcessorRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[StopStreamProcessorRequest]
    }
  }

  @js.native
  trait StopStreamProcessorResponse extends js.Object {}

  object StopStreamProcessorResponse {
    @inline
    def apply(
    ): StopStreamProcessorResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[StopStreamProcessorResponse]
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
    @inline
    def apply(
        Name: js.UndefOr[StreamProcessorName] = js.undefined,
        Status: js.UndefOr[StreamProcessorStatus] = js.undefined
    ): StreamProcessor = {
      val __obj = js.Dynamic.literal()
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StreamProcessor]
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
    @inline
    def apply(
        KinesisVideoStream: js.UndefOr[KinesisVideoStream] = js.undefined
    ): StreamProcessorInput = {
      val __obj = js.Dynamic.literal()
      KinesisVideoStream.foreach(__v => __obj.updateDynamic("KinesisVideoStream")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StreamProcessorInput]
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
    @inline
    def apply(
        KinesisDataStream: js.UndefOr[KinesisDataStream] = js.undefined
    ): StreamProcessorOutput = {
      val __obj = js.Dynamic.literal()
      KinesisDataStream.foreach(__v => __obj.updateDynamic("KinesisDataStream")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StreamProcessorOutput]
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
    @inline
    def apply(
        FaceSearch: js.UndefOr[FaceSearchSettings] = js.undefined
    ): StreamProcessorSettings = {
      val __obj = js.Dynamic.literal()
      FaceSearch.foreach(__v => __obj.updateDynamic("FaceSearch")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StreamProcessorSettings]
    }
  }

  @js.native
  sealed trait StreamProcessorStatus extends js.Any
  object StreamProcessorStatus {
    val STOPPED = "STOPPED".asInstanceOf[StreamProcessorStatus]
    val STARTING = "STARTING".asInstanceOf[StreamProcessorStatus]
    val RUNNING = "RUNNING".asInstanceOf[StreamProcessorStatus]
    val FAILED = "FAILED".asInstanceOf[StreamProcessorStatus]
    val STOPPING = "STOPPING".asInstanceOf[StreamProcessorStatus]

    @inline def values = js.Array(STOPPED, STARTING, RUNNING, FAILED, STOPPING)
  }

  /**
    * The S3 bucket that contains the training summary. The training summary includes aggregated evaluation metrics for the entire testing dataset and metrics for each individual label.
    *  You get the training summary S3 bucket location by calling <a>DescribeProjectVersions</a>.
    */
  @js.native
  trait Summary extends js.Object {
    var S3Object: js.UndefOr[S3Object]
  }

  object Summary {
    @inline
    def apply(
        S3Object: js.UndefOr[S3Object] = js.undefined
    ): Summary = {
      val __obj = js.Dynamic.literal()
      S3Object.foreach(__v => __obj.updateDynamic("S3Object")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Summary]
    }
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
    @inline
    def apply(
        Confidence: js.UndefOr[Percent] = js.undefined,
        Value: js.UndefOr[Boolean] = js.undefined
    ): Sunglasses = {
      val __obj = js.Dynamic.literal()
      Confidence.foreach(__v => __obj.updateDynamic("Confidence")(__v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Sunglasses]
    }
  }

  /**
    * Information about a technical cue segment. For more information, see <a>SegmentDetection</a>.
    */
  @js.native
  trait TechnicalCueSegment extends js.Object {
    var Confidence: js.UndefOr[SegmentConfidence]
    var Type: js.UndefOr[TechnicalCueType]
  }

  object TechnicalCueSegment {
    @inline
    def apply(
        Confidence: js.UndefOr[SegmentConfidence] = js.undefined,
        Type: js.UndefOr[TechnicalCueType] = js.undefined
    ): TechnicalCueSegment = {
      val __obj = js.Dynamic.literal()
      Confidence.foreach(__v => __obj.updateDynamic("Confidence")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TechnicalCueSegment]
    }
  }

  @js.native
  sealed trait TechnicalCueType extends js.Any
  object TechnicalCueType {
    val ColorBars = "ColorBars".asInstanceOf[TechnicalCueType]
    val EndCredits = "EndCredits".asInstanceOf[TechnicalCueType]
    val BlackFrames = "BlackFrames".asInstanceOf[TechnicalCueType]

    @inline def values = js.Array(ColorBars, EndCredits, BlackFrames)
  }

  /**
    * The dataset used for testing. Optionally, if <code>AutoCreate</code> is set, Amazon Rekognition Custom Labels creates a testing dataset using an 80/20 split of the training dataset.
    */
  @js.native
  trait TestingData extends js.Object {
    var Assets: js.UndefOr[Assets]
    var AutoCreate: js.UndefOr[Boolean]
  }

  object TestingData {
    @inline
    def apply(
        Assets: js.UndefOr[Assets] = js.undefined,
        AutoCreate: js.UndefOr[Boolean] = js.undefined
    ): TestingData = {
      val __obj = js.Dynamic.literal()
      Assets.foreach(__v => __obj.updateDynamic("Assets")(__v.asInstanceOf[js.Any]))
      AutoCreate.foreach(__v => __obj.updateDynamic("AutoCreate")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TestingData]
    }
  }

  /**
    * A Sagemaker Groundtruth format manifest file representing the dataset used for testing.
    */
  @js.native
  trait TestingDataResult extends js.Object {
    var Input: js.UndefOr[TestingData]
    var Output: js.UndefOr[TestingData]
  }

  object TestingDataResult {
    @inline
    def apply(
        Input: js.UndefOr[TestingData] = js.undefined,
        Output: js.UndefOr[TestingData] = js.undefined
    ): TestingDataResult = {
      val __obj = js.Dynamic.literal()
      Input.foreach(__v => __obj.updateDynamic("Input")(__v.asInstanceOf[js.Any]))
      Output.foreach(__v => __obj.updateDynamic("Output")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TestingDataResult]
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
    @inline
    def apply(
        Confidence: js.UndefOr[Percent] = js.undefined,
        DetectedText: js.UndefOr[String] = js.undefined,
        Geometry: js.UndefOr[Geometry] = js.undefined,
        Id: js.UndefOr[UInteger] = js.undefined,
        ParentId: js.UndefOr[UInteger] = js.undefined,
        Type: js.UndefOr[TextTypes] = js.undefined
    ): TextDetection = {
      val __obj = js.Dynamic.literal()
      Confidence.foreach(__v => __obj.updateDynamic("Confidence")(__v.asInstanceOf[js.Any]))
      DetectedText.foreach(__v => __obj.updateDynamic("DetectedText")(__v.asInstanceOf[js.Any]))
      Geometry.foreach(__v => __obj.updateDynamic("Geometry")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      ParentId.foreach(__v => __obj.updateDynamic("ParentId")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TextDetection]
    }
  }

  /**
    * Information about text detected in a video. Incudes the detected text, the time in milliseconds from the start of the video that the text was detected, and where it was detected on the screen.
    */
  @js.native
  trait TextDetectionResult extends js.Object {
    var TextDetection: js.UndefOr[TextDetection]
    var Timestamp: js.UndefOr[Timestamp]
  }

  object TextDetectionResult {
    @inline
    def apply(
        TextDetection: js.UndefOr[TextDetection] = js.undefined,
        Timestamp: js.UndefOr[Timestamp] = js.undefined
    ): TextDetectionResult = {
      val __obj = js.Dynamic.literal()
      TextDetection.foreach(__v => __obj.updateDynamic("TextDetection")(__v.asInstanceOf[js.Any]))
      Timestamp.foreach(__v => __obj.updateDynamic("Timestamp")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TextDetectionResult]
    }
  }

  @js.native
  sealed trait TextTypes extends js.Any
  object TextTypes {
    val LINE = "LINE".asInstanceOf[TextTypes]
    val WORD = "WORD".asInstanceOf[TextTypes]

    @inline def values = js.Array(LINE, WORD)
  }

  /**
    * The dataset used for training.
    */
  @js.native
  trait TrainingData extends js.Object {
    var Assets: js.UndefOr[Assets]
  }

  object TrainingData {
    @inline
    def apply(
        Assets: js.UndefOr[Assets] = js.undefined
    ): TrainingData = {
      val __obj = js.Dynamic.literal()
      Assets.foreach(__v => __obj.updateDynamic("Assets")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TrainingData]
    }
  }

  /**
    * A Sagemaker Groundtruth format manifest file that represents the dataset used for training.
    */
  @js.native
  trait TrainingDataResult extends js.Object {
    var Input: js.UndefOr[TrainingData]
    var Output: js.UndefOr[TrainingData]
  }

  object TrainingDataResult {
    @inline
    def apply(
        Input: js.UndefOr[TrainingData] = js.undefined,
        Output: js.UndefOr[TrainingData] = js.undefined
    ): TrainingDataResult = {
      val __obj = js.Dynamic.literal()
      Input.foreach(__v => __obj.updateDynamic("Input")(__v.asInstanceOf[js.Any]))
      Output.foreach(__v => __obj.updateDynamic("Output")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TrainingDataResult]
    }
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
    @inline
    def apply(
        FaceDetail: js.UndefOr[FaceDetail] = js.undefined,
        Reasons: js.UndefOr[Reasons] = js.undefined
    ): UnindexedFace = {
      val __obj = js.Dynamic.literal()
      FaceDetail.foreach(__v => __obj.updateDynamic("FaceDetail")(__v.asInstanceOf[js.Any]))
      Reasons.foreach(__v => __obj.updateDynamic("Reasons")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UnindexedFace]
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
    @inline
    def apply(
        S3Object: js.UndefOr[S3Object] = js.undefined
    ): Video = {
      val __obj = js.Dynamic.literal()
      S3Object.foreach(__v => __obj.updateDynamic("S3Object")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Video]
    }
  }

  @js.native
  sealed trait VideoJobStatus extends js.Any
  object VideoJobStatus {
    val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[VideoJobStatus]
    val SUCCEEDED = "SUCCEEDED".asInstanceOf[VideoJobStatus]
    val FAILED = "FAILED".asInstanceOf[VideoJobStatus]

    @inline def values = js.Array(IN_PROGRESS, SUCCEEDED, FAILED)
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
    @inline
    def apply(
        Codec: js.UndefOr[String] = js.undefined,
        DurationMillis: js.UndefOr[ULong] = js.undefined,
        Format: js.UndefOr[String] = js.undefined,
        FrameHeight: js.UndefOr[ULong] = js.undefined,
        FrameRate: js.UndefOr[Float] = js.undefined,
        FrameWidth: js.UndefOr[ULong] = js.undefined
    ): VideoMetadata = {
      val __obj = js.Dynamic.literal()
      Codec.foreach(__v => __obj.updateDynamic("Codec")(__v.asInstanceOf[js.Any]))
      DurationMillis.foreach(__v => __obj.updateDynamic("DurationMillis")(__v.asInstanceOf[js.Any]))
      Format.foreach(__v => __obj.updateDynamic("Format")(__v.asInstanceOf[js.Any]))
      FrameHeight.foreach(__v => __obj.updateDynamic("FrameHeight")(__v.asInstanceOf[js.Any]))
      FrameRate.foreach(__v => __obj.updateDynamic("FrameRate")(__v.asInstanceOf[js.Any]))
      FrameWidth.foreach(__v => __obj.updateDynamic("FrameWidth")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VideoMetadata]
    }
  }
}
