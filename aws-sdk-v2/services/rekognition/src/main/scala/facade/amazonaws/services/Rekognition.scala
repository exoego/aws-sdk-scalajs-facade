package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import scala.language.implicitConversions
import facade.amazonaws._

package object rekognition {
  type Assets = js.Array[Asset]
  type Attributes = js.Array[Attribute]
  type AudioMetadataList = js.Array[AudioMetadata]
  type BodyParts = js.Array[ProtectiveEquipmentBodyPart]
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
  type ConnectedHomeLabel = String
  type ConnectedHomeLabels = js.Array[ConnectedHomeLabel]
  type ContentClassifiers = js.Array[ContentClassifier]
  type ContentModerationDetections = js.Array[ContentModerationDetection]
  type CustomLabels = js.Array[CustomLabel]
  type DatasetArn = String
  type DatasetEntries = js.Array[DatasetEntry]
  type DatasetEntry = String
  type DatasetLabel = String
  type DatasetLabelDescriptions = js.Array[DatasetLabelDescription]
  type DatasetLabels = js.Array[DatasetLabel]
  type DatasetMetadataList = js.Array[DatasetMetadata]
  type DateTime = js.Date
  type Degree = Float
  type DetectLabelsFeatureList = js.Array[DetectLabelsFeatureName]
  type DetectLabelsMaxDominantColors = Int
  type DistributeDatasetMetadataList = js.Array[DistributeDataset]
  type DominantColors = js.Array[DominantColor]
  type Emotions = js.Array[Emotion]
  type EquipmentDetections = js.Array[EquipmentDetection]
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
  type GeneralLabelsFilterList = js.Array[GeneralLabelsFilterValue]
  type GeneralLabelsFilterValue = String
  type GroundTruthBlob = js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type HasErrors = Boolean
  type HumanLoopActivationConditionsEvaluationResults = String
  type HumanLoopActivationReason = String
  type HumanLoopActivationReasons = js.Array[HumanLoopActivationReason]
  type HumanLoopArn = String
  type HumanLoopName = String
  type ImageBlob = js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type ImageId = String
  type IndexFacesModelVersion = String
  type InferenceUnits = Int
  type Instances = js.Array[Instance]
  type IsLabeled = Boolean
  type JobId = String
  type JobTag = String
  type KinesisDataArn = String
  type KinesisVideoArn = String
  type KinesisVideoStreamFragmentNumber = String
  type KmsKeyId = String
  type LabelAliases = js.Array[LabelAlias]
  type LabelCategories = js.Array[LabelCategory]
  type LabelDetections = js.Array[LabelDetection]
  type Labels = js.Array[Label]
  type Landmarks = js.Array[Landmark]
  type ListDatasetEntriesPageSize = Int
  type ListDatasetLabelsPageSize = Int
  type ListProjectPoliciesPageSize = Int
  type MaxDurationInSecondsULong = Double
  type MaxFaces = Int
  type MaxFacesToIndex = Int
  type MaxPixelThreshold = Float
  type MaxResults = Int
  type MinCoveragePercentage = Float
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
  type ProjectNames = js.Array[ProjectName]
  type ProjectPolicies = js.Array[ProjectPolicy]
  type ProjectPolicyDocument = String
  type ProjectPolicyName = String
  type ProjectPolicyRevisionId = String
  type ProjectVersionArn = String
  type ProjectVersionDescriptions = js.Array[ProjectVersionDescription]
  type ProjectVersionsPageSize = Int
  type ProjectsPageSize = Int
  type ProtectiveEquipmentPersonIds = js.Array[UInteger]
  type ProtectiveEquipmentPersons = js.Array[ProtectiveEquipmentPerson]
  type ProtectiveEquipmentTypes = js.Array[ProtectiveEquipmentType]
  type QueryString = String
  type Reasons = js.Array[Reason]
  type RegionsOfInterest = js.Array[RegionOfInterest]
  type RekognitionUniqueId = String
  type ResourceArn = String
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
  type StartStreamProcessorSessionId = String
  type StatusMessage = String
  type StreamProcessorArn = String
  type StreamProcessorList = js.Array[StreamProcessor]
  type StreamProcessorName = String
  type StreamProcessorParametersToDelete = js.Array[StreamProcessorParameterToDelete]
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagMap = js.Dictionary[TagValue]
  type TagValue = String
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

  final class RekognitionOps(private val service: Rekognition) extends AnyVal {

    @inline def compareFacesFuture(params: CompareFacesRequest): Future[CompareFacesResponse] = service.compareFaces(params).promise().toFuture
    @inline def copyProjectVersionFuture(params: CopyProjectVersionRequest): Future[CopyProjectVersionResponse] = service.copyProjectVersion(params).promise().toFuture
    @inline def createCollectionFuture(params: CreateCollectionRequest): Future[CreateCollectionResponse] = service.createCollection(params).promise().toFuture
    @inline def createDatasetFuture(params: CreateDatasetRequest): Future[CreateDatasetResponse] = service.createDataset(params).promise().toFuture
    @inline def createProjectFuture(params: CreateProjectRequest): Future[CreateProjectResponse] = service.createProject(params).promise().toFuture
    @inline def createProjectVersionFuture(params: CreateProjectVersionRequest): Future[CreateProjectVersionResponse] = service.createProjectVersion(params).promise().toFuture
    @inline def createStreamProcessorFuture(params: CreateStreamProcessorRequest): Future[CreateStreamProcessorResponse] = service.createStreamProcessor(params).promise().toFuture
    @inline def deleteCollectionFuture(params: DeleteCollectionRequest): Future[DeleteCollectionResponse] = service.deleteCollection(params).promise().toFuture
    @inline def deleteDatasetFuture(params: DeleteDatasetRequest): Future[DeleteDatasetResponse] = service.deleteDataset(params).promise().toFuture
    @inline def deleteFacesFuture(params: DeleteFacesRequest): Future[DeleteFacesResponse] = service.deleteFaces(params).promise().toFuture
    @inline def deleteProjectFuture(params: DeleteProjectRequest): Future[DeleteProjectResponse] = service.deleteProject(params).promise().toFuture
    @inline def deleteProjectPolicyFuture(params: DeleteProjectPolicyRequest): Future[DeleteProjectPolicyResponse] = service.deleteProjectPolicy(params).promise().toFuture
    @inline def deleteProjectVersionFuture(params: DeleteProjectVersionRequest): Future[DeleteProjectVersionResponse] = service.deleteProjectVersion(params).promise().toFuture
    @inline def deleteStreamProcessorFuture(params: DeleteStreamProcessorRequest): Future[DeleteStreamProcessorResponse] = service.deleteStreamProcessor(params).promise().toFuture
    @inline def describeCollectionFuture(params: DescribeCollectionRequest): Future[DescribeCollectionResponse] = service.describeCollection(params).promise().toFuture
    @inline def describeDatasetFuture(params: DescribeDatasetRequest): Future[DescribeDatasetResponse] = service.describeDataset(params).promise().toFuture
    @inline def describeProjectVersionsFuture(params: DescribeProjectVersionsRequest): Future[DescribeProjectVersionsResponse] = service.describeProjectVersions(params).promise().toFuture
    @inline def describeProjectsFuture(params: DescribeProjectsRequest): Future[DescribeProjectsResponse] = service.describeProjects(params).promise().toFuture
    @inline def describeStreamProcessorFuture(params: DescribeStreamProcessorRequest): Future[DescribeStreamProcessorResponse] = service.describeStreamProcessor(params).promise().toFuture
    @inline def detectCustomLabelsFuture(params: DetectCustomLabelsRequest): Future[DetectCustomLabelsResponse] = service.detectCustomLabels(params).promise().toFuture
    @inline def detectFacesFuture(params: DetectFacesRequest): Future[DetectFacesResponse] = service.detectFaces(params).promise().toFuture
    @inline def detectLabelsFuture(params: DetectLabelsRequest): Future[DetectLabelsResponse] = service.detectLabels(params).promise().toFuture
    @inline def detectModerationLabelsFuture(params: DetectModerationLabelsRequest): Future[DetectModerationLabelsResponse] = service.detectModerationLabels(params).promise().toFuture
    @inline def detectProtectiveEquipmentFuture(params: DetectProtectiveEquipmentRequest): Future[DetectProtectiveEquipmentResponse] = service.detectProtectiveEquipment(params).promise().toFuture
    @inline def detectTextFuture(params: DetectTextRequest): Future[DetectTextResponse] = service.detectText(params).promise().toFuture
    @inline def distributeDatasetEntriesFuture(params: DistributeDatasetEntriesRequest): Future[DistributeDatasetEntriesResponse] = service.distributeDatasetEntries(params).promise().toFuture
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
    @inline def listDatasetEntriesFuture(params: ListDatasetEntriesRequest): Future[ListDatasetEntriesResponse] = service.listDatasetEntries(params).promise().toFuture
    @inline def listDatasetLabelsFuture(params: ListDatasetLabelsRequest): Future[ListDatasetLabelsResponse] = service.listDatasetLabels(params).promise().toFuture
    @inline def listFacesFuture(params: ListFacesRequest): Future[ListFacesResponse] = service.listFaces(params).promise().toFuture
    @inline def listProjectPoliciesFuture(params: ListProjectPoliciesRequest): Future[ListProjectPoliciesResponse] = service.listProjectPolicies(params).promise().toFuture
    @inline def listStreamProcessorsFuture(params: ListStreamProcessorsRequest): Future[ListStreamProcessorsResponse] = service.listStreamProcessors(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] = service.listTagsForResource(params).promise().toFuture
    @inline def putProjectPolicyFuture(params: PutProjectPolicyRequest): Future[PutProjectPolicyResponse] = service.putProjectPolicy(params).promise().toFuture
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
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] = service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] = service.untagResource(params).promise().toFuture
    @inline def updateDatasetEntriesFuture(params: UpdateDatasetEntriesRequest): Future[UpdateDatasetEntriesResponse] = service.updateDatasetEntries(params).promise().toFuture
    @inline def updateStreamProcessorFuture(params: UpdateStreamProcessorRequest): Future[UpdateStreamProcessorResponse] = service.updateStreamProcessor(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/rekognition", JSImport.Namespace, "AWS.Rekognition")
  class Rekognition() extends js.Object {
    def this(config: AWSConfig) = this()

    def compareFaces(params: CompareFacesRequest): Request[CompareFacesResponse] = js.native
    def copyProjectVersion(params: CopyProjectVersionRequest): Request[CopyProjectVersionResponse] = js.native
    def createCollection(params: CreateCollectionRequest): Request[CreateCollectionResponse] = js.native
    def createDataset(params: CreateDatasetRequest): Request[CreateDatasetResponse] = js.native
    def createProject(params: CreateProjectRequest): Request[CreateProjectResponse] = js.native
    def createProjectVersion(params: CreateProjectVersionRequest): Request[CreateProjectVersionResponse] = js.native
    def createStreamProcessor(params: CreateStreamProcessorRequest): Request[CreateStreamProcessorResponse] = js.native
    def deleteCollection(params: DeleteCollectionRequest): Request[DeleteCollectionResponse] = js.native
    def deleteDataset(params: DeleteDatasetRequest): Request[DeleteDatasetResponse] = js.native
    def deleteFaces(params: DeleteFacesRequest): Request[DeleteFacesResponse] = js.native
    def deleteProject(params: DeleteProjectRequest): Request[DeleteProjectResponse] = js.native
    def deleteProjectPolicy(params: DeleteProjectPolicyRequest): Request[DeleteProjectPolicyResponse] = js.native
    def deleteProjectVersion(params: DeleteProjectVersionRequest): Request[DeleteProjectVersionResponse] = js.native
    def deleteStreamProcessor(params: DeleteStreamProcessorRequest): Request[DeleteStreamProcessorResponse] = js.native
    def describeCollection(params: DescribeCollectionRequest): Request[DescribeCollectionResponse] = js.native
    def describeDataset(params: DescribeDatasetRequest): Request[DescribeDatasetResponse] = js.native
    def describeProjectVersions(params: DescribeProjectVersionsRequest): Request[DescribeProjectVersionsResponse] = js.native
    def describeProjects(params: DescribeProjectsRequest): Request[DescribeProjectsResponse] = js.native
    def describeStreamProcessor(params: DescribeStreamProcessorRequest): Request[DescribeStreamProcessorResponse] = js.native
    def detectCustomLabels(params: DetectCustomLabelsRequest): Request[DetectCustomLabelsResponse] = js.native
    def detectFaces(params: DetectFacesRequest): Request[DetectFacesResponse] = js.native
    def detectLabels(params: DetectLabelsRequest): Request[DetectLabelsResponse] = js.native
    def detectModerationLabels(params: DetectModerationLabelsRequest): Request[DetectModerationLabelsResponse] = js.native
    def detectProtectiveEquipment(params: DetectProtectiveEquipmentRequest): Request[DetectProtectiveEquipmentResponse] = js.native
    def detectText(params: DetectTextRequest): Request[DetectTextResponse] = js.native
    def distributeDatasetEntries(params: DistributeDatasetEntriesRequest): Request[DistributeDatasetEntriesResponse] = js.native
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
    def listDatasetEntries(params: ListDatasetEntriesRequest): Request[ListDatasetEntriesResponse] = js.native
    def listDatasetLabels(params: ListDatasetLabelsRequest): Request[ListDatasetLabelsResponse] = js.native
    def listFaces(params: ListFacesRequest): Request[ListFacesResponse] = js.native
    def listProjectPolicies(params: ListProjectPoliciesRequest): Request[ListProjectPoliciesResponse] = js.native
    def listStreamProcessors(params: ListStreamProcessorsRequest): Request[ListStreamProcessorsResponse] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def putProjectPolicy(params: PutProjectPolicyRequest): Request[PutProjectPolicyResponse] = js.native
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
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse] = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse] = js.native
    def updateDatasetEntries(params: UpdateDatasetEntriesRequest): Request[UpdateDatasetEntriesResponse] = js.native
    def updateStreamProcessor(params: UpdateStreamProcessorRequest): Request[UpdateStreamProcessorResponse] = js.native
  }
  object Rekognition {
    @inline implicit def toOps(service: Rekognition): RekognitionOps = {
      new RekognitionOps(service)
    }
  }

  /** Structure containing the estimated age range, in years, for a face. Amazon Rekognition estimates an age range for faces detected in the input image. Estimated age ranges can overlap. A face of a 5-year-old might have an estimated range of 4-6, while the face of a 6-year-old might have an estimated range of 4-8.
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

  /** Assets are the images that you use to train and evaluate a model version. Assets can also contain validation information that you use to debug a failed model training.
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

  /** Metadata information about an audio stream. An array of <code>AudioMetadata</code> objects for the audio streams found in a stored video is returned by <a>GetSegmentDetection</a>.
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

  /** Indicates whether or not the face has a beard, and the confidence level in the determination.
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

  /** A filter that allows you to control the black frame detection by specifying the black levels and pixel coverage of black pixels in a frame. As videos can come from multiple sources, formats, and time periods, they may contain different standards and varying noise levels for black frames that need to be accounted for. For more information, see <a>StartSegmentDetection</a>.
    */
  @js.native
  trait BlackFrame extends js.Object {
    var MaxPixelThreshold: js.UndefOr[MaxPixelThreshold]
    var MinCoveragePercentage: js.UndefOr[MinCoveragePercentage]
  }

  object BlackFrame {
    @inline
    def apply(
        MaxPixelThreshold: js.UndefOr[MaxPixelThreshold] = js.undefined,
        MinCoveragePercentage: js.UndefOr[MinCoveragePercentage] = js.undefined
    ): BlackFrame = {
      val __obj = js.Dynamic.literal()
      MaxPixelThreshold.foreach(__v => __obj.updateDynamic("MaxPixelThreshold")(__v.asInstanceOf[js.Any]))
      MinCoveragePercentage.foreach(__v => __obj.updateDynamic("MinCoveragePercentage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BlackFrame]
    }
  }

  /** Identifies the bounding box around the label, face, text, object of interest, or personal protective equipment. The <code>left</code> (x-coordinate) and <code>top</code> (y-coordinate) are coordinates representing the top and left sides of the bounding box. Note that the upper-left corner of the image is the origin (0,0). The <code>top</code> and <code>left</code> values returned are ratios of the overall image size. For example, if the input image is 700x200 pixels, and the top-left coordinate of the bounding box is 350x50 pixels, the API returns a <code>left</code> value of 0.5 (350/700) and a <code>top</code> value of 0.25 (50/200). The <code>width</code> and <code>height</code> values represent the dimensions of the bounding box as a ratio of the overall image dimension. For example, if the input image is 700x200 pixels, and the bounding box width is 70 pixels, the width returned is 0.1.
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

  /** Provides information about a celebrity recognized by the <a>RecognizeCelebrities</a> operation.
    */
  @js.native
  trait Celebrity extends js.Object {
    var Face: js.UndefOr[ComparedFace]
    var Id: js.UndefOr[RekognitionUniqueId]
    var KnownGender: js.UndefOr[KnownGender]
    var MatchConfidence: js.UndefOr[Percent]
    var Name: js.UndefOr[String]
    var Urls: js.UndefOr[Urls]
  }

  object Celebrity {
    @inline
    def apply(
        Face: js.UndefOr[ComparedFace] = js.undefined,
        Id: js.UndefOr[RekognitionUniqueId] = js.undefined,
        KnownGender: js.UndefOr[KnownGender] = js.undefined,
        MatchConfidence: js.UndefOr[Percent] = js.undefined,
        Name: js.UndefOr[String] = js.undefined,
        Urls: js.UndefOr[Urls] = js.undefined
    ): Celebrity = {
      val __obj = js.Dynamic.literal()
      Face.foreach(__v => __obj.updateDynamic("Face")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      KnownGender.foreach(__v => __obj.updateDynamic("KnownGender")(__v.asInstanceOf[js.Any]))
      MatchConfidence.foreach(__v => __obj.updateDynamic("MatchConfidence")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Urls.foreach(__v => __obj.updateDynamic("Urls")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Celebrity]
    }
  }

  /** Information about a recognized celebrity.
    */
  @js.native
  trait CelebrityDetail extends js.Object {
    var BoundingBox: js.UndefOr[BoundingBox]
    var Confidence: js.UndefOr[Percent]
    var Face: js.UndefOr[FaceDetail]
    var Id: js.UndefOr[RekognitionUniqueId]
    var KnownGender: js.UndefOr[KnownGender]
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
        KnownGender: js.UndefOr[KnownGender] = js.undefined,
        Name: js.UndefOr[String] = js.undefined,
        Urls: js.UndefOr[Urls] = js.undefined
    ): CelebrityDetail = {
      val __obj = js.Dynamic.literal()
      BoundingBox.foreach(__v => __obj.updateDynamic("BoundingBox")(__v.asInstanceOf[js.Any]))
      Confidence.foreach(__v => __obj.updateDynamic("Confidence")(__v.asInstanceOf[js.Any]))
      Face.foreach(__v => __obj.updateDynamic("Face")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      KnownGender.foreach(__v => __obj.updateDynamic("KnownGender")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Urls.foreach(__v => __obj.updateDynamic("Urls")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CelebrityDetail]
    }
  }

  /** Information about a detected celebrity and the time the celebrity was detected in a stored video. For more information, see GetCelebrityRecognition in the Amazon Rekognition Developer Guide.
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

  /** Provides information about a face in a target image that matches the source image face analyzed by <code>CompareFaces</code>. The <code>Face</code> property contains the bounding box of the face in the target image. The <code>Similarity</code> property is the confidence that the source image face matches the face in the bounding box.
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

  /** Provides face metadata for target image faces that are analyzed by <code>CompareFaces</code> and <code>RecognizeCelebrities</code>.
    */
  @js.native
  trait ComparedFace extends js.Object {
    var BoundingBox: js.UndefOr[BoundingBox]
    var Confidence: js.UndefOr[Percent]
    var Emotions: js.UndefOr[Emotions]
    var Landmarks: js.UndefOr[Landmarks]
    var Pose: js.UndefOr[Pose]
    var Quality: js.UndefOr[ImageQuality]
    var Smile: js.UndefOr[Smile]
  }

  object ComparedFace {
    @inline
    def apply(
        BoundingBox: js.UndefOr[BoundingBox] = js.undefined,
        Confidence: js.UndefOr[Percent] = js.undefined,
        Emotions: js.UndefOr[Emotions] = js.undefined,
        Landmarks: js.UndefOr[Landmarks] = js.undefined,
        Pose: js.UndefOr[Pose] = js.undefined,
        Quality: js.UndefOr[ImageQuality] = js.undefined,
        Smile: js.UndefOr[Smile] = js.undefined
    ): ComparedFace = {
      val __obj = js.Dynamic.literal()
      BoundingBox.foreach(__v => __obj.updateDynamic("BoundingBox")(__v.asInstanceOf[js.Any]))
      Confidence.foreach(__v => __obj.updateDynamic("Confidence")(__v.asInstanceOf[js.Any]))
      Emotions.foreach(__v => __obj.updateDynamic("Emotions")(__v.asInstanceOf[js.Any]))
      Landmarks.foreach(__v => __obj.updateDynamic("Landmarks")(__v.asInstanceOf[js.Any]))
      Pose.foreach(__v => __obj.updateDynamic("Pose")(__v.asInstanceOf[js.Any]))
      Quality.foreach(__v => __obj.updateDynamic("Quality")(__v.asInstanceOf[js.Any]))
      Smile.foreach(__v => __obj.updateDynamic("Smile")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ComparedFace]
    }
  }

  /** Type that describes the face Amazon Rekognition chose to compare with the faces in the target. This contains a bounding box for the selected face and confidence level that the bounding box contains a face. Note that Amazon Rekognition selects the largest face in the source image for this comparison.
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

  /** Label detection settings to use on a streaming video. Defining the settings is required in the request parameter for <a>CreateStreamProcessor</a>. Including this setting in the <code>CreateStreamProcessor</code> request enables you to use the stream processor for label detection. You can then select what you want the stream processor to detect, such as people or pets. When the stream processor has started, one notification is sent for each object class specified. For example, if packages and pets are selected, one SNS notification is published the first time a package is detected and one SNS notification is published the first time a pet is detected, as well as an end-of-session summary.
    */
  @js.native
  trait ConnectedHomeSettings extends js.Object {
    var Labels: ConnectedHomeLabels
    var MinConfidence: js.UndefOr[Percent]
  }

  object ConnectedHomeSettings {
    @inline
    def apply(
        Labels: ConnectedHomeLabels,
        MinConfidence: js.UndefOr[Percent] = js.undefined
    ): ConnectedHomeSettings = {
      val __obj = js.Dynamic.literal(
        "Labels" -> Labels.asInstanceOf[js.Any]
      )

      MinConfidence.foreach(__v => __obj.updateDynamic("MinConfidence")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ConnectedHomeSettings]
    }
  }

  /** The label detection settings you want to use in your stream processor. This includes the labels you want the stream processor to detect and the minimum confidence level allowed to label objects.
    */
  @js.native
  trait ConnectedHomeSettingsForUpdate extends js.Object {
    var Labels: js.UndefOr[ConnectedHomeLabels]
    var MinConfidence: js.UndefOr[Percent]
  }

  object ConnectedHomeSettingsForUpdate {
    @inline
    def apply(
        Labels: js.UndefOr[ConnectedHomeLabels] = js.undefined,
        MinConfidence: js.UndefOr[Percent] = js.undefined
    ): ConnectedHomeSettingsForUpdate = {
      val __obj = js.Dynamic.literal()
      Labels.foreach(__v => __obj.updateDynamic("Labels")(__v.asInstanceOf[js.Any]))
      MinConfidence.foreach(__v => __obj.updateDynamic("MinConfidence")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ConnectedHomeSettingsForUpdate]
    }
  }

  /** Information about an inappropriate, unwanted, or offensive content label detection in a stored video.
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
  trait CopyProjectVersionRequest extends js.Object {
    var DestinationProjectArn: ProjectArn
    var OutputConfig: OutputConfig
    var SourceProjectArn: ProjectArn
    var SourceProjectVersionArn: ProjectVersionArn
    var VersionName: VersionName
    var KmsKeyId: js.UndefOr[KmsKeyId]
    var Tags: js.UndefOr[TagMap]
  }

  object CopyProjectVersionRequest {
    @inline
    def apply(
        DestinationProjectArn: ProjectArn,
        OutputConfig: OutputConfig,
        SourceProjectArn: ProjectArn,
        SourceProjectVersionArn: ProjectVersionArn,
        VersionName: VersionName,
        KmsKeyId: js.UndefOr[KmsKeyId] = js.undefined,
        Tags: js.UndefOr[TagMap] = js.undefined
    ): CopyProjectVersionRequest = {
      val __obj = js.Dynamic.literal(
        "DestinationProjectArn" -> DestinationProjectArn.asInstanceOf[js.Any],
        "OutputConfig" -> OutputConfig.asInstanceOf[js.Any],
        "SourceProjectArn" -> SourceProjectArn.asInstanceOf[js.Any],
        "SourceProjectVersionArn" -> SourceProjectVersionArn.asInstanceOf[js.Any],
        "VersionName" -> VersionName.asInstanceOf[js.Any]
      )

      KmsKeyId.foreach(__v => __obj.updateDynamic("KmsKeyId")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CopyProjectVersionRequest]
    }
  }

  @js.native
  trait CopyProjectVersionResponse extends js.Object {
    var ProjectVersionArn: js.UndefOr[ProjectVersionArn]
  }

  object CopyProjectVersionResponse {
    @inline
    def apply(
        ProjectVersionArn: js.UndefOr[ProjectVersionArn] = js.undefined
    ): CopyProjectVersionResponse = {
      val __obj = js.Dynamic.literal()
      ProjectVersionArn.foreach(__v => __obj.updateDynamic("ProjectVersionArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CopyProjectVersionResponse]
    }
  }

  /** Information about an item of Personal Protective Equipment covering a corresponding body part. For more information, see <a>DetectProtectiveEquipment</a>.
    */
  @js.native
  trait CoversBodyPart extends js.Object {
    var Confidence: js.UndefOr[Percent]
    var Value: js.UndefOr[Boolean]
  }

  object CoversBodyPart {
    @inline
    def apply(
        Confidence: js.UndefOr[Percent] = js.undefined,
        Value: js.UndefOr[Boolean] = js.undefined
    ): CoversBodyPart = {
      val __obj = js.Dynamic.literal()
      Confidence.foreach(__v => __obj.updateDynamic("Confidence")(__v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CoversBodyPart]
    }
  }

  @js.native
  trait CreateCollectionRequest extends js.Object {
    var CollectionId: CollectionId
    var Tags: js.UndefOr[TagMap]
  }

  object CreateCollectionRequest {
    @inline
    def apply(
        CollectionId: CollectionId,
        Tags: js.UndefOr[TagMap] = js.undefined
    ): CreateCollectionRequest = {
      val __obj = js.Dynamic.literal(
        "CollectionId" -> CollectionId.asInstanceOf[js.Any]
      )

      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
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
  trait CreateDatasetRequest extends js.Object {
    var DatasetType: DatasetType
    var ProjectArn: ProjectArn
    var DatasetSource: js.UndefOr[DatasetSource]
  }

  object CreateDatasetRequest {
    @inline
    def apply(
        DatasetType: DatasetType,
        ProjectArn: ProjectArn,
        DatasetSource: js.UndefOr[DatasetSource] = js.undefined
    ): CreateDatasetRequest = {
      val __obj = js.Dynamic.literal(
        "DatasetType" -> DatasetType.asInstanceOf[js.Any],
        "ProjectArn" -> ProjectArn.asInstanceOf[js.Any]
      )

      DatasetSource.foreach(__v => __obj.updateDynamic("DatasetSource")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDatasetRequest]
    }
  }

  @js.native
  trait CreateDatasetResponse extends js.Object {
    var DatasetArn: js.UndefOr[DatasetArn]
  }

  object CreateDatasetResponse {
    @inline
    def apply(
        DatasetArn: js.UndefOr[DatasetArn] = js.undefined
    ): CreateDatasetResponse = {
      val __obj = js.Dynamic.literal()
      DatasetArn.foreach(__v => __obj.updateDynamic("DatasetArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDatasetResponse]
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
    var VersionName: VersionName
    var KmsKeyId: js.UndefOr[KmsKeyId]
    var Tags: js.UndefOr[TagMap]
    var TestingData: js.UndefOr[TestingData]
    var TrainingData: js.UndefOr[TrainingData]
  }

  object CreateProjectVersionRequest {
    @inline
    def apply(
        OutputConfig: OutputConfig,
        ProjectArn: ProjectArn,
        VersionName: VersionName,
        KmsKeyId: js.UndefOr[KmsKeyId] = js.undefined,
        Tags: js.UndefOr[TagMap] = js.undefined,
        TestingData: js.UndefOr[TestingData] = js.undefined,
        TrainingData: js.UndefOr[TrainingData] = js.undefined
    ): CreateProjectVersionRequest = {
      val __obj = js.Dynamic.literal(
        "OutputConfig" -> OutputConfig.asInstanceOf[js.Any],
        "ProjectArn" -> ProjectArn.asInstanceOf[js.Any],
        "VersionName" -> VersionName.asInstanceOf[js.Any]
      )

      KmsKeyId.foreach(__v => __obj.updateDynamic("KmsKeyId")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      TestingData.foreach(__v => __obj.updateDynamic("TestingData")(__v.asInstanceOf[js.Any]))
      TrainingData.foreach(__v => __obj.updateDynamic("TrainingData")(__v.asInstanceOf[js.Any]))
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
    var DataSharingPreference: js.UndefOr[StreamProcessorDataSharingPreference]
    var KmsKeyId: js.UndefOr[KmsKeyId]
    var NotificationChannel: js.UndefOr[StreamProcessorNotificationChannel]
    var RegionsOfInterest: js.UndefOr[RegionsOfInterest]
    var Tags: js.UndefOr[TagMap]
  }

  object CreateStreamProcessorRequest {
    @inline
    def apply(
        Input: StreamProcessorInput,
        Name: StreamProcessorName,
        Output: StreamProcessorOutput,
        RoleArn: RoleArn,
        Settings: StreamProcessorSettings,
        DataSharingPreference: js.UndefOr[StreamProcessorDataSharingPreference] = js.undefined,
        KmsKeyId: js.UndefOr[KmsKeyId] = js.undefined,
        NotificationChannel: js.UndefOr[StreamProcessorNotificationChannel] = js.undefined,
        RegionsOfInterest: js.UndefOr[RegionsOfInterest] = js.undefined,
        Tags: js.UndefOr[TagMap] = js.undefined
    ): CreateStreamProcessorRequest = {
      val __obj = js.Dynamic.literal(
        "Input" -> Input.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any],
        "Output" -> Output.asInstanceOf[js.Any],
        "RoleArn" -> RoleArn.asInstanceOf[js.Any],
        "Settings" -> Settings.asInstanceOf[js.Any]
      )

      DataSharingPreference.foreach(__v => __obj.updateDynamic("DataSharingPreference")(__v.asInstanceOf[js.Any]))
      KmsKeyId.foreach(__v => __obj.updateDynamic("KmsKeyId")(__v.asInstanceOf[js.Any]))
      NotificationChannel.foreach(__v => __obj.updateDynamic("NotificationChannel")(__v.asInstanceOf[js.Any]))
      RegionsOfInterest.foreach(__v => __obj.updateDynamic("RegionsOfInterest")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
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

  /** A custom label detected in an image by a call to <a>DetectCustomLabels</a>.
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

  /** Describes updates or additions to a dataset. A Single update or addition is an entry (JSON Line) that provides information about a single image. To update an existing entry, you match the <code>source-ref</code> field of the update entry with the <code>source-ref</code> filed of the entry that you want to update. If the <code>source-ref</code> field doesn't match an existing entry, the entry is added to dataset as a new entry.
    */
  @js.native
  trait DatasetChanges extends js.Object {
    var GroundTruth: GroundTruthBlob
  }

  object DatasetChanges {
    @inline
    def apply(
        GroundTruth: GroundTruthBlob
    ): DatasetChanges = {
      val __obj = js.Dynamic.literal(
        "GroundTruth" -> GroundTruth.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DatasetChanges]
    }
  }

  /** A description for a dataset. For more information, see <a>DescribeDataset</a>. The status fields <code>Status</code>, <code>StatusMessage</code>, and <code>StatusMessageCode</code> reflect the last operation on the dataset.
    */
  @js.native
  trait DatasetDescription extends js.Object {
    var CreationTimestamp: js.UndefOr[DateTime]
    var DatasetStats: js.UndefOr[DatasetStats]
    var LastUpdatedTimestamp: js.UndefOr[DateTime]
    var Status: js.UndefOr[DatasetStatus]
    var StatusMessage: js.UndefOr[StatusMessage]
    var StatusMessageCode: js.UndefOr[DatasetStatusMessageCode]
  }

  object DatasetDescription {
    @inline
    def apply(
        CreationTimestamp: js.UndefOr[DateTime] = js.undefined,
        DatasetStats: js.UndefOr[DatasetStats] = js.undefined,
        LastUpdatedTimestamp: js.UndefOr[DateTime] = js.undefined,
        Status: js.UndefOr[DatasetStatus] = js.undefined,
        StatusMessage: js.UndefOr[StatusMessage] = js.undefined,
        StatusMessageCode: js.UndefOr[DatasetStatusMessageCode] = js.undefined
    ): DatasetDescription = {
      val __obj = js.Dynamic.literal()
      CreationTimestamp.foreach(__v => __obj.updateDynamic("CreationTimestamp")(__v.asInstanceOf[js.Any]))
      DatasetStats.foreach(__v => __obj.updateDynamic("DatasetStats")(__v.asInstanceOf[js.Any]))
      LastUpdatedTimestamp.foreach(__v => __obj.updateDynamic("LastUpdatedTimestamp")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      StatusMessage.foreach(__v => __obj.updateDynamic("StatusMessage")(__v.asInstanceOf[js.Any]))
      StatusMessageCode.foreach(__v => __obj.updateDynamic("StatusMessageCode")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DatasetDescription]
    }
  }

  /** Describes a dataset label. For more information, see <a>ListDatasetLabels</a>.
    */
  @js.native
  trait DatasetLabelDescription extends js.Object {
    var LabelName: js.UndefOr[DatasetLabel]
    var LabelStats: js.UndefOr[DatasetLabelStats]
  }

  object DatasetLabelDescription {
    @inline
    def apply(
        LabelName: js.UndefOr[DatasetLabel] = js.undefined,
        LabelStats: js.UndefOr[DatasetLabelStats] = js.undefined
    ): DatasetLabelDescription = {
      val __obj = js.Dynamic.literal()
      LabelName.foreach(__v => __obj.updateDynamic("LabelName")(__v.asInstanceOf[js.Any]))
      LabelStats.foreach(__v => __obj.updateDynamic("LabelStats")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DatasetLabelDescription]
    }
  }

  /** Statistics about a label used in a dataset. For more information, see <a>DatasetLabelDescription</a>.
    */
  @js.native
  trait DatasetLabelStats extends js.Object {
    var BoundingBoxCount: js.UndefOr[UInteger]
    var EntryCount: js.UndefOr[UInteger]
  }

  object DatasetLabelStats {
    @inline
    def apply(
        BoundingBoxCount: js.UndefOr[UInteger] = js.undefined,
        EntryCount: js.UndefOr[UInteger] = js.undefined
    ): DatasetLabelStats = {
      val __obj = js.Dynamic.literal()
      BoundingBoxCount.foreach(__v => __obj.updateDynamic("BoundingBoxCount")(__v.asInstanceOf[js.Any]))
      EntryCount.foreach(__v => __obj.updateDynamic("EntryCount")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DatasetLabelStats]
    }
  }

  /** Summary information for an Amazon Rekognition Custom Labels dataset. For more information, see <a>ProjectDescription</a>.
    */
  @js.native
  trait DatasetMetadata extends js.Object {
    var CreationTimestamp: js.UndefOr[DateTime]
    var DatasetArn: js.UndefOr[DatasetArn]
    var DatasetType: js.UndefOr[DatasetType]
    var Status: js.UndefOr[DatasetStatus]
    var StatusMessage: js.UndefOr[StatusMessage]
    var StatusMessageCode: js.UndefOr[DatasetStatusMessageCode]
  }

  object DatasetMetadata {
    @inline
    def apply(
        CreationTimestamp: js.UndefOr[DateTime] = js.undefined,
        DatasetArn: js.UndefOr[DatasetArn] = js.undefined,
        DatasetType: js.UndefOr[DatasetType] = js.undefined,
        Status: js.UndefOr[DatasetStatus] = js.undefined,
        StatusMessage: js.UndefOr[StatusMessage] = js.undefined,
        StatusMessageCode: js.UndefOr[DatasetStatusMessageCode] = js.undefined
    ): DatasetMetadata = {
      val __obj = js.Dynamic.literal()
      CreationTimestamp.foreach(__v => __obj.updateDynamic("CreationTimestamp")(__v.asInstanceOf[js.Any]))
      DatasetArn.foreach(__v => __obj.updateDynamic("DatasetArn")(__v.asInstanceOf[js.Any]))
      DatasetType.foreach(__v => __obj.updateDynamic("DatasetType")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      StatusMessage.foreach(__v => __obj.updateDynamic("StatusMessage")(__v.asInstanceOf[js.Any]))
      StatusMessageCode.foreach(__v => __obj.updateDynamic("StatusMessageCode")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DatasetMetadata]
    }
  }

  /** The source that Amazon Rekognition Custom Labels uses to create a dataset. To use an Amazon Sagemaker format manifest file, specify the S3 bucket location in the <code>GroundTruthManifest</code> field. The S3 bucket must be in your AWS account. To create a copy of an existing dataset, specify the Amazon Resource Name (ARN) of an existing dataset in <code>DatasetArn</code>. You need to specify a value for <code>DatasetArn</code> or <code>GroundTruthManifest</code>, but not both. if you supply both values, or if you don't specify any values, an InvalidParameterException exception occurs. For more information, see <a>CreateDataset</a>.
    */
  @js.native
  trait DatasetSource extends js.Object {
    var DatasetArn: js.UndefOr[DatasetArn]
    var GroundTruthManifest: js.UndefOr[GroundTruthManifest]
  }

  object DatasetSource {
    @inline
    def apply(
        DatasetArn: js.UndefOr[DatasetArn] = js.undefined,
        GroundTruthManifest: js.UndefOr[GroundTruthManifest] = js.undefined
    ): DatasetSource = {
      val __obj = js.Dynamic.literal()
      DatasetArn.foreach(__v => __obj.updateDynamic("DatasetArn")(__v.asInstanceOf[js.Any]))
      GroundTruthManifest.foreach(__v => __obj.updateDynamic("GroundTruthManifest")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DatasetSource]
    }
  }

  /** Provides statistics about a dataset. For more information, see <a>DescribeDataset</a>.
    */
  @js.native
  trait DatasetStats extends js.Object {
    var ErrorEntries: js.UndefOr[UInteger]
    var LabeledEntries: js.UndefOr[UInteger]
    var TotalEntries: js.UndefOr[UInteger]
    var TotalLabels: js.UndefOr[UInteger]
  }

  object DatasetStats {
    @inline
    def apply(
        ErrorEntries: js.UndefOr[UInteger] = js.undefined,
        LabeledEntries: js.UndefOr[UInteger] = js.undefined,
        TotalEntries: js.UndefOr[UInteger] = js.undefined,
        TotalLabels: js.UndefOr[UInteger] = js.undefined
    ): DatasetStats = {
      val __obj = js.Dynamic.literal()
      ErrorEntries.foreach(__v => __obj.updateDynamic("ErrorEntries")(__v.asInstanceOf[js.Any]))
      LabeledEntries.foreach(__v => __obj.updateDynamic("LabeledEntries")(__v.asInstanceOf[js.Any]))
      TotalEntries.foreach(__v => __obj.updateDynamic("TotalEntries")(__v.asInstanceOf[js.Any]))
      TotalLabels.foreach(__v => __obj.updateDynamic("TotalLabels")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DatasetStats]
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
  trait DeleteDatasetRequest extends js.Object {
    var DatasetArn: DatasetArn
  }

  object DeleteDatasetRequest {
    @inline
    def apply(
        DatasetArn: DatasetArn
    ): DeleteDatasetRequest = {
      val __obj = js.Dynamic.literal(
        "DatasetArn" -> DatasetArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteDatasetRequest]
    }
  }

  @js.native
  trait DeleteDatasetResponse extends js.Object

  object DeleteDatasetResponse {
    @inline
    def apply(): DeleteDatasetResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteDatasetResponse]
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
  trait DeleteProjectPolicyRequest extends js.Object {
    var PolicyName: ProjectPolicyName
    var ProjectArn: ProjectArn
    var PolicyRevisionId: js.UndefOr[ProjectPolicyRevisionId]
  }

  object DeleteProjectPolicyRequest {
    @inline
    def apply(
        PolicyName: ProjectPolicyName,
        ProjectArn: ProjectArn,
        PolicyRevisionId: js.UndefOr[ProjectPolicyRevisionId] = js.undefined
    ): DeleteProjectPolicyRequest = {
      val __obj = js.Dynamic.literal(
        "PolicyName" -> PolicyName.asInstanceOf[js.Any],
        "ProjectArn" -> ProjectArn.asInstanceOf[js.Any]
      )

      PolicyRevisionId.foreach(__v => __obj.updateDynamic("PolicyRevisionId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteProjectPolicyRequest]
    }
  }

  @js.native
  trait DeleteProjectPolicyResponse extends js.Object

  object DeleteProjectPolicyResponse {
    @inline
    def apply(): DeleteProjectPolicyResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteProjectPolicyResponse]
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
  trait DeleteStreamProcessorResponse extends js.Object

  object DeleteStreamProcessorResponse {
    @inline
    def apply(): DeleteStreamProcessorResponse = {
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
  trait DescribeDatasetRequest extends js.Object {
    var DatasetArn: DatasetArn
  }

  object DescribeDatasetRequest {
    @inline
    def apply(
        DatasetArn: DatasetArn
    ): DescribeDatasetRequest = {
      val __obj = js.Dynamic.literal(
        "DatasetArn" -> DatasetArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeDatasetRequest]
    }
  }

  @js.native
  trait DescribeDatasetResponse extends js.Object {
    var DatasetDescription: js.UndefOr[DatasetDescription]
  }

  object DescribeDatasetResponse {
    @inline
    def apply(
        DatasetDescription: js.UndefOr[DatasetDescription] = js.undefined
    ): DescribeDatasetResponse = {
      val __obj = js.Dynamic.literal()
      DatasetDescription.foreach(__v => __obj.updateDynamic("DatasetDescription")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeDatasetResponse]
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
    var ProjectNames: js.UndefOr[ProjectNames]
  }

  object DescribeProjectsRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[ProjectsPageSize] = js.undefined,
        NextToken: js.UndefOr[ExtendedPaginationToken] = js.undefined,
        ProjectNames: js.UndefOr[ProjectNames] = js.undefined
    ): DescribeProjectsRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      ProjectNames.foreach(__v => __obj.updateDynamic("ProjectNames")(__v.asInstanceOf[js.Any]))
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
    var DataSharingPreference: js.UndefOr[StreamProcessorDataSharingPreference]
    var Input: js.UndefOr[StreamProcessorInput]
    var KmsKeyId: js.UndefOr[KmsKeyId]
    var LastUpdateTimestamp: js.UndefOr[DateTime]
    var Name: js.UndefOr[StreamProcessorName]
    var NotificationChannel: js.UndefOr[StreamProcessorNotificationChannel]
    var Output: js.UndefOr[StreamProcessorOutput]
    var RegionsOfInterest: js.UndefOr[RegionsOfInterest]
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
        DataSharingPreference: js.UndefOr[StreamProcessorDataSharingPreference] = js.undefined,
        Input: js.UndefOr[StreamProcessorInput] = js.undefined,
        KmsKeyId: js.UndefOr[KmsKeyId] = js.undefined,
        LastUpdateTimestamp: js.UndefOr[DateTime] = js.undefined,
        Name: js.UndefOr[StreamProcessorName] = js.undefined,
        NotificationChannel: js.UndefOr[StreamProcessorNotificationChannel] = js.undefined,
        Output: js.UndefOr[StreamProcessorOutput] = js.undefined,
        RegionsOfInterest: js.UndefOr[RegionsOfInterest] = js.undefined,
        RoleArn: js.UndefOr[RoleArn] = js.undefined,
        Settings: js.UndefOr[StreamProcessorSettings] = js.undefined,
        Status: js.UndefOr[StreamProcessorStatus] = js.undefined,
        StatusMessage: js.UndefOr[String] = js.undefined,
        StreamProcessorArn: js.UndefOr[StreamProcessorArn] = js.undefined
    ): DescribeStreamProcessorResponse = {
      val __obj = js.Dynamic.literal()
      CreationTimestamp.foreach(__v => __obj.updateDynamic("CreationTimestamp")(__v.asInstanceOf[js.Any]))
      DataSharingPreference.foreach(__v => __obj.updateDynamic("DataSharingPreference")(__v.asInstanceOf[js.Any]))
      Input.foreach(__v => __obj.updateDynamic("Input")(__v.asInstanceOf[js.Any]))
      KmsKeyId.foreach(__v => __obj.updateDynamic("KmsKeyId")(__v.asInstanceOf[js.Any]))
      LastUpdateTimestamp.foreach(__v => __obj.updateDynamic("LastUpdateTimestamp")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      NotificationChannel.foreach(__v => __obj.updateDynamic("NotificationChannel")(__v.asInstanceOf[js.Any]))
      Output.foreach(__v => __obj.updateDynamic("Output")(__v.asInstanceOf[js.Any]))
      RegionsOfInterest.foreach(__v => __obj.updateDynamic("RegionsOfInterest")(__v.asInstanceOf[js.Any]))
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

  /** The background of the image with regard to image quality and dominant colors.
    */
  @js.native
  trait DetectLabelsImageBackground extends js.Object {
    var DominantColors: js.UndefOr[DominantColors]
    var Quality: js.UndefOr[DetectLabelsImageQuality]
  }

  object DetectLabelsImageBackground {
    @inline
    def apply(
        DominantColors: js.UndefOr[DominantColors] = js.undefined,
        Quality: js.UndefOr[DetectLabelsImageQuality] = js.undefined
    ): DetectLabelsImageBackground = {
      val __obj = js.Dynamic.literal()
      DominantColors.foreach(__v => __obj.updateDynamic("DominantColors")(__v.asInstanceOf[js.Any]))
      Quality.foreach(__v => __obj.updateDynamic("Quality")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DetectLabelsImageBackground]
    }
  }

  /** The foreground of the image with regard to image quality and dominant colors.
    */
  @js.native
  trait DetectLabelsImageForeground extends js.Object {
    var DominantColors: js.UndefOr[DominantColors]
    var Quality: js.UndefOr[DetectLabelsImageQuality]
  }

  object DetectLabelsImageForeground {
    @inline
    def apply(
        DominantColors: js.UndefOr[DominantColors] = js.undefined,
        Quality: js.UndefOr[DetectLabelsImageQuality] = js.undefined
    ): DetectLabelsImageForeground = {
      val __obj = js.Dynamic.literal()
      DominantColors.foreach(__v => __obj.updateDynamic("DominantColors")(__v.asInstanceOf[js.Any]))
      Quality.foreach(__v => __obj.updateDynamic("Quality")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DetectLabelsImageForeground]
    }
  }

  /** Information about the quality and dominant colors of an input image. Quality and color information is returned for the entire image, foreground, and background.
    */
  @js.native
  trait DetectLabelsImageProperties extends js.Object {
    var Background: js.UndefOr[DetectLabelsImageBackground]
    var DominantColors: js.UndefOr[DominantColors]
    var Foreground: js.UndefOr[DetectLabelsImageForeground]
    var Quality: js.UndefOr[DetectLabelsImageQuality]
  }

  object DetectLabelsImageProperties {
    @inline
    def apply(
        Background: js.UndefOr[DetectLabelsImageBackground] = js.undefined,
        DominantColors: js.UndefOr[DominantColors] = js.undefined,
        Foreground: js.UndefOr[DetectLabelsImageForeground] = js.undefined,
        Quality: js.UndefOr[DetectLabelsImageQuality] = js.undefined
    ): DetectLabelsImageProperties = {
      val __obj = js.Dynamic.literal()
      Background.foreach(__v => __obj.updateDynamic("Background")(__v.asInstanceOf[js.Any]))
      DominantColors.foreach(__v => __obj.updateDynamic("DominantColors")(__v.asInstanceOf[js.Any]))
      Foreground.foreach(__v => __obj.updateDynamic("Foreground")(__v.asInstanceOf[js.Any]))
      Quality.foreach(__v => __obj.updateDynamic("Quality")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DetectLabelsImageProperties]
    }
  }

  /** Settings for the IMAGE_PROPERTIES feature type.
    */
  @js.native
  trait DetectLabelsImagePropertiesSettings extends js.Object {
    var MaxDominantColors: js.UndefOr[DetectLabelsMaxDominantColors]
  }

  object DetectLabelsImagePropertiesSettings {
    @inline
    def apply(
        MaxDominantColors: js.UndefOr[DetectLabelsMaxDominantColors] = js.undefined
    ): DetectLabelsImagePropertiesSettings = {
      val __obj = js.Dynamic.literal()
      MaxDominantColors.foreach(__v => __obj.updateDynamic("MaxDominantColors")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DetectLabelsImagePropertiesSettings]
    }
  }

  /** The quality of an image provided for label detection, with regard to brightness, sharpness, and contrast.
    */
  @js.native
  trait DetectLabelsImageQuality extends js.Object {
    var Brightness: js.UndefOr[Float]
    var Contrast: js.UndefOr[Float]
    var Sharpness: js.UndefOr[Float]
  }

  object DetectLabelsImageQuality {
    @inline
    def apply(
        Brightness: js.UndefOr[Float] = js.undefined,
        Contrast: js.UndefOr[Float] = js.undefined,
        Sharpness: js.UndefOr[Float] = js.undefined
    ): DetectLabelsImageQuality = {
      val __obj = js.Dynamic.literal()
      Brightness.foreach(__v => __obj.updateDynamic("Brightness")(__v.asInstanceOf[js.Any]))
      Contrast.foreach(__v => __obj.updateDynamic("Contrast")(__v.asInstanceOf[js.Any]))
      Sharpness.foreach(__v => __obj.updateDynamic("Sharpness")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DetectLabelsImageQuality]
    }
  }

  @js.native
  trait DetectLabelsRequest extends js.Object {
    var Image: Image
    var Features: js.UndefOr[DetectLabelsFeatureList]
    var MaxLabels: js.UndefOr[UInteger]
    var MinConfidence: js.UndefOr[Percent]
    var Settings: js.UndefOr[DetectLabelsSettings]
  }

  object DetectLabelsRequest {
    @inline
    def apply(
        Image: Image,
        Features: js.UndefOr[DetectLabelsFeatureList] = js.undefined,
        MaxLabels: js.UndefOr[UInteger] = js.undefined,
        MinConfidence: js.UndefOr[Percent] = js.undefined,
        Settings: js.UndefOr[DetectLabelsSettings] = js.undefined
    ): DetectLabelsRequest = {
      val __obj = js.Dynamic.literal(
        "Image" -> Image.asInstanceOf[js.Any]
      )

      Features.foreach(__v => __obj.updateDynamic("Features")(__v.asInstanceOf[js.Any]))
      MaxLabels.foreach(__v => __obj.updateDynamic("MaxLabels")(__v.asInstanceOf[js.Any]))
      MinConfidence.foreach(__v => __obj.updateDynamic("MinConfidence")(__v.asInstanceOf[js.Any]))
      Settings.foreach(__v => __obj.updateDynamic("Settings")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DetectLabelsRequest]
    }
  }

  @js.native
  trait DetectLabelsResponse extends js.Object {
    var ImageProperties: js.UndefOr[DetectLabelsImageProperties]
    var LabelModelVersion: js.UndefOr[String]
    var Labels: js.UndefOr[Labels]
    var OrientationCorrection: js.UndefOr[OrientationCorrection]
  }

  object DetectLabelsResponse {
    @inline
    def apply(
        ImageProperties: js.UndefOr[DetectLabelsImageProperties] = js.undefined,
        LabelModelVersion: js.UndefOr[String] = js.undefined,
        Labels: js.UndefOr[Labels] = js.undefined,
        OrientationCorrection: js.UndefOr[OrientationCorrection] = js.undefined
    ): DetectLabelsResponse = {
      val __obj = js.Dynamic.literal()
      ImageProperties.foreach(__v => __obj.updateDynamic("ImageProperties")(__v.asInstanceOf[js.Any]))
      LabelModelVersion.foreach(__v => __obj.updateDynamic("LabelModelVersion")(__v.asInstanceOf[js.Any]))
      Labels.foreach(__v => __obj.updateDynamic("Labels")(__v.asInstanceOf[js.Any]))
      OrientationCorrection.foreach(__v => __obj.updateDynamic("OrientationCorrection")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DetectLabelsResponse]
    }
  }

  /** Settings for the DetectLabels request. Settings can include filters for both GENERAL_LABELS and IMAGE_PROPERTIES. GENERAL_LABELS filters can be inclusive or exclusive and applied to individual labels or label categories. IMAGE_PROPERTIES filters allow specification of a maximum number of dominant colors.
    */
  @js.native
  trait DetectLabelsSettings extends js.Object {
    var GeneralLabels: js.UndefOr[GeneralLabelsSettings]
    var ImageProperties: js.UndefOr[DetectLabelsImagePropertiesSettings]
  }

  object DetectLabelsSettings {
    @inline
    def apply(
        GeneralLabels: js.UndefOr[GeneralLabelsSettings] = js.undefined,
        ImageProperties: js.UndefOr[DetectLabelsImagePropertiesSettings] = js.undefined
    ): DetectLabelsSettings = {
      val __obj = js.Dynamic.literal()
      GeneralLabels.foreach(__v => __obj.updateDynamic("GeneralLabels")(__v.asInstanceOf[js.Any]))
      ImageProperties.foreach(__v => __obj.updateDynamic("ImageProperties")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DetectLabelsSettings]
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

  @js.native
  trait DetectProtectiveEquipmentRequest extends js.Object {
    var Image: Image
    var SummarizationAttributes: js.UndefOr[ProtectiveEquipmentSummarizationAttributes]
  }

  object DetectProtectiveEquipmentRequest {
    @inline
    def apply(
        Image: Image,
        SummarizationAttributes: js.UndefOr[ProtectiveEquipmentSummarizationAttributes] = js.undefined
    ): DetectProtectiveEquipmentRequest = {
      val __obj = js.Dynamic.literal(
        "Image" -> Image.asInstanceOf[js.Any]
      )

      SummarizationAttributes.foreach(__v => __obj.updateDynamic("SummarizationAttributes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DetectProtectiveEquipmentRequest]
    }
  }

  @js.native
  trait DetectProtectiveEquipmentResponse extends js.Object {
    var Persons: js.UndefOr[ProtectiveEquipmentPersons]
    var ProtectiveEquipmentModelVersion: js.UndefOr[String]
    var Summary: js.UndefOr[ProtectiveEquipmentSummary]
  }

  object DetectProtectiveEquipmentResponse {
    @inline
    def apply(
        Persons: js.UndefOr[ProtectiveEquipmentPersons] = js.undefined,
        ProtectiveEquipmentModelVersion: js.UndefOr[String] = js.undefined,
        Summary: js.UndefOr[ProtectiveEquipmentSummary] = js.undefined
    ): DetectProtectiveEquipmentResponse = {
      val __obj = js.Dynamic.literal()
      Persons.foreach(__v => __obj.updateDynamic("Persons")(__v.asInstanceOf[js.Any]))
      ProtectiveEquipmentModelVersion.foreach(__v => __obj.updateDynamic("ProtectiveEquipmentModelVersion")(__v.asInstanceOf[js.Any]))
      Summary.foreach(__v => __obj.updateDynamic("Summary")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DetectProtectiveEquipmentResponse]
    }
  }

  /** A set of optional parameters that you can use to set the criteria that the text must meet to be included in your response. <code>WordFilter</code> looks at a word’s height, width, and minimum confidence. <code>RegionOfInterest</code> lets you set a specific region of the image to look for text in.
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

  /** A set of parameters that allow you to filter out certain results from your returned results.
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

  /** A training dataset or a test dataset used in a dataset distribution operation. For more information, see <a>DistributeDatasetEntries</a>.
    */
  @js.native
  trait DistributeDataset extends js.Object {
    var Arn: DatasetArn
  }

  object DistributeDataset {
    @inline
    def apply(
        Arn: DatasetArn
    ): DistributeDataset = {
      val __obj = js.Dynamic.literal(
        "Arn" -> Arn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DistributeDataset]
    }
  }

  @js.native
  trait DistributeDatasetEntriesRequest extends js.Object {
    var Datasets: DistributeDatasetMetadataList
  }

  object DistributeDatasetEntriesRequest {
    @inline
    def apply(
        Datasets: DistributeDatasetMetadataList
    ): DistributeDatasetEntriesRequest = {
      val __obj = js.Dynamic.literal(
        "Datasets" -> Datasets.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DistributeDatasetEntriesRequest]
    }
  }

  @js.native
  trait DistributeDatasetEntriesResponse extends js.Object

  object DistributeDatasetEntriesResponse {
    @inline
    def apply(): DistributeDatasetEntriesResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DistributeDatasetEntriesResponse]
    }
  }

  /** A description of the dominant colors in an image.
    */
  @js.native
  trait DominantColor extends js.Object {
    var Blue: js.UndefOr[UInteger]
    var CSSColor: js.UndefOr[String]
    var Green: js.UndefOr[UInteger]
    var HexCode: js.UndefOr[String]
    var PixelPercent: js.UndefOr[Percent]
    var Red: js.UndefOr[UInteger]
    var SimplifiedColor: js.UndefOr[String]
  }

  object DominantColor {
    @inline
    def apply(
        Blue: js.UndefOr[UInteger] = js.undefined,
        CSSColor: js.UndefOr[String] = js.undefined,
        Green: js.UndefOr[UInteger] = js.undefined,
        HexCode: js.UndefOr[String] = js.undefined,
        PixelPercent: js.UndefOr[Percent] = js.undefined,
        Red: js.UndefOr[UInteger] = js.undefined,
        SimplifiedColor: js.UndefOr[String] = js.undefined
    ): DominantColor = {
      val __obj = js.Dynamic.literal()
      Blue.foreach(__v => __obj.updateDynamic("Blue")(__v.asInstanceOf[js.Any]))
      CSSColor.foreach(__v => __obj.updateDynamic("CSSColor")(__v.asInstanceOf[js.Any]))
      Green.foreach(__v => __obj.updateDynamic("Green")(__v.asInstanceOf[js.Any]))
      HexCode.foreach(__v => __obj.updateDynamic("HexCode")(__v.asInstanceOf[js.Any]))
      PixelPercent.foreach(__v => __obj.updateDynamic("PixelPercent")(__v.asInstanceOf[js.Any]))
      Red.foreach(__v => __obj.updateDynamic("Red")(__v.asInstanceOf[js.Any]))
      SimplifiedColor.foreach(__v => __obj.updateDynamic("SimplifiedColor")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DominantColor]
    }
  }

  /** The emotions that appear to be expressed on the face, and the confidence level in the determination. The API is only making a determination of the physical appearance of a person's face. It is not a determination of the person’s internal emotional state and should not be used in such a way. For example, a person pretending to have a sad face might not be sad emotionally.
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

  /** Information about an item of Personal Protective Equipment (PPE) detected by <a>DetectProtectiveEquipment</a>. For more information, see <a>DetectProtectiveEquipment</a>.
    */
  @js.native
  trait EquipmentDetection extends js.Object {
    var BoundingBox: js.UndefOr[BoundingBox]
    var Confidence: js.UndefOr[Percent]
    var CoversBodyPart: js.UndefOr[CoversBodyPart]
    var Type: js.UndefOr[ProtectiveEquipmentType]
  }

  object EquipmentDetection {
    @inline
    def apply(
        BoundingBox: js.UndefOr[BoundingBox] = js.undefined,
        Confidence: js.UndefOr[Percent] = js.undefined,
        CoversBodyPart: js.UndefOr[CoversBodyPart] = js.undefined,
        Type: js.UndefOr[ProtectiveEquipmentType] = js.undefined
    ): EquipmentDetection = {
      val __obj = js.Dynamic.literal()
      BoundingBox.foreach(__v => __obj.updateDynamic("BoundingBox")(__v.asInstanceOf[js.Any]))
      Confidence.foreach(__v => __obj.updateDynamic("Confidence")(__v.asInstanceOf[js.Any]))
      CoversBodyPart.foreach(__v => __obj.updateDynamic("CoversBodyPart")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EquipmentDetection]
    }
  }

  /** The evaluation results for the training of a model.
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

  /** Indicates whether or not the eyes on the face are open, and the confidence level in the determination.
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

  /** Indicates whether or not the face is wearing eye glasses, and the confidence level in the determination.
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

  /** Describes the face properties such as the bounding box, face ID, image ID of the input image, and external image ID that you assigned.
    */
  @js.native
  trait Face extends js.Object {
    var BoundingBox: js.UndefOr[BoundingBox]
    var Confidence: js.UndefOr[Percent]
    var ExternalImageId: js.UndefOr[ExternalImageId]
    var FaceId: js.UndefOr[FaceId]
    var ImageId: js.UndefOr[ImageId]
    var IndexFacesModelVersion: js.UndefOr[IndexFacesModelVersion]
  }

  object Face {
    @inline
    def apply(
        BoundingBox: js.UndefOr[BoundingBox] = js.undefined,
        Confidence: js.UndefOr[Percent] = js.undefined,
        ExternalImageId: js.UndefOr[ExternalImageId] = js.undefined,
        FaceId: js.UndefOr[FaceId] = js.undefined,
        ImageId: js.UndefOr[ImageId] = js.undefined,
        IndexFacesModelVersion: js.UndefOr[IndexFacesModelVersion] = js.undefined
    ): Face = {
      val __obj = js.Dynamic.literal()
      BoundingBox.foreach(__v => __obj.updateDynamic("BoundingBox")(__v.asInstanceOf[js.Any]))
      Confidence.foreach(__v => __obj.updateDynamic("Confidence")(__v.asInstanceOf[js.Any]))
      ExternalImageId.foreach(__v => __obj.updateDynamic("ExternalImageId")(__v.asInstanceOf[js.Any]))
      FaceId.foreach(__v => __obj.updateDynamic("FaceId")(__v.asInstanceOf[js.Any]))
      ImageId.foreach(__v => __obj.updateDynamic("ImageId")(__v.asInstanceOf[js.Any]))
      IndexFacesModelVersion.foreach(__v => __obj.updateDynamic("IndexFacesModelVersion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Face]
    }
  }

  /** Structure containing attributes of the face that the algorithm detected. A <code>FaceDetail</code> object contains either the default facial attributes or all facial attributes. The default attributes are <code>BoundingBox</code>, <code>Confidence</code>, <code>Landmarks</code>, <code>Pose</code>, and <code>Quality</code>. <a>GetFaceDetection</a> is the only Amazon Rekognition Video stored video operation that can return a <code>FaceDetail</code> object with all attributes. To specify which attributes to return, use the <code>FaceAttributes</code> input parameter for <a>StartFaceDetection</a>. The following Amazon Rekognition Video operations return only the default attributes. The corresponding Start operations don't have a <code>FaceAttributes</code> input parameter. * GetCelebrityRecognition * GetPersonTracking * GetFaceSearch The Amazon Rekognition Image <a>DetectFaces</a> and <a>IndexFaces</a> operations can return all facial attributes. To specify which attributes to
    * return, use the <code>Attributes</code> input parameter for <code>DetectFaces</code>. For <code>IndexFaces</code>, use the <code>DetectAttributes</code> input parameter.
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

  /** Information about a face detected in a video analysis request and the time the face was detected in the video.
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

  /** Provides face metadata. In addition, it also provides the confidence in the match of this face with the input face.
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

  /** Object containing both the face metadata (stored in the backend database), and facial attributes that are detected but aren't stored in the database.
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

  /** Input face recognition parameters for an Amazon Rekognition stream processor. Includes the collection to use for face recognition and the face attributes to detect. Defining the settings is required in the request parameter for <a>CreateStreamProcessor</a>.
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

  /** The predicted gender of a detected face. Amazon Rekognition makes gender binary (male/female) predictions based on the physical appearance of a face in a particular image. This kind of prediction is not designed to categorize a person’s gender identity, and you shouldn't use Amazon Rekognition to make such a determination. For example, a male actor wearing a long-haired wig and earrings for a role might be predicted as female. Using Amazon Rekognition to make gender binary predictions is best suited for use cases where aggregate gender distribution statistics need to be analyzed without identifying specific users. For example, the percentage of female users compared to male users on a social media platform. We don't recommend using gender binary predictions to make decisions that impact an individual's rights, privacy, or access to services.
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

  /** Contains filters for the object labels returned by DetectLabels. Filters can be inclusive, exclusive, or a combination of both and can be applied to individual l abels or entire label categories.
    */
  @js.native
  trait GeneralLabelsSettings extends js.Object {
    var LabelCategoryExclusionFilters: js.UndefOr[GeneralLabelsFilterList]
    var LabelCategoryInclusionFilters: js.UndefOr[GeneralLabelsFilterList]
    var LabelExclusionFilters: js.UndefOr[GeneralLabelsFilterList]
    var LabelInclusionFilters: js.UndefOr[GeneralLabelsFilterList]
  }

  object GeneralLabelsSettings {
    @inline
    def apply(
        LabelCategoryExclusionFilters: js.UndefOr[GeneralLabelsFilterList] = js.undefined,
        LabelCategoryInclusionFilters: js.UndefOr[GeneralLabelsFilterList] = js.undefined,
        LabelExclusionFilters: js.UndefOr[GeneralLabelsFilterList] = js.undefined,
        LabelInclusionFilters: js.UndefOr[GeneralLabelsFilterList] = js.undefined
    ): GeneralLabelsSettings = {
      val __obj = js.Dynamic.literal()
      LabelCategoryExclusionFilters.foreach(__v => __obj.updateDynamic("LabelCategoryExclusionFilters")(__v.asInstanceOf[js.Any]))
      LabelCategoryInclusionFilters.foreach(__v => __obj.updateDynamic("LabelCategoryInclusionFilters")(__v.asInstanceOf[js.Any]))
      LabelExclusionFilters.foreach(__v => __obj.updateDynamic("LabelExclusionFilters")(__v.asInstanceOf[js.Any]))
      LabelInclusionFilters.foreach(__v => __obj.updateDynamic("LabelInclusionFilters")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GeneralLabelsSettings]
    }
  }

  /** Information about where an object (<a>DetectCustomLabels</a>) or text (<a>DetectText</a>) is located on an image.
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
    var KnownGender: js.UndefOr[KnownGender]
    var Name: js.UndefOr[String]
    var Urls: js.UndefOr[Urls]
  }

  object GetCelebrityInfoResponse {
    @inline
    def apply(
        KnownGender: js.UndefOr[KnownGender] = js.undefined,
        Name: js.UndefOr[String] = js.undefined,
        Urls: js.UndefOr[Urls] = js.undefined
    ): GetCelebrityInfoResponse = {
      val __obj = js.Dynamic.literal()
      KnownGender.foreach(__v => __obj.updateDynamic("KnownGender")(__v.asInstanceOf[js.Any]))
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

  /** The S3 bucket that contains an Amazon Sagemaker Ground Truth format manifest file.
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

  /** Shows the results of the human in the loop evaluation. If there is no HumanLoopArn, the input did not trigger human review.
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

  /** Sets up the flow definition the image will be sent to if one of the conditions is met. You can also set certain attributes of the image before review.
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

  /** Allows you to set attributes of the image. Currently, you can declare an image as free of personally identifiable information.
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

  /** Provides the input image either as bytes or an S3 object. You pass image bytes to an Amazon Rekognition API operation by using the <code>Bytes</code> property. For example, you would use the <code>Bytes</code> property to pass an image loaded from a local file system. Image bytes passed by using the <code>Bytes</code> property must be base64-encoded. Your code may not need to encode image bytes if you are using an AWS SDK to call Amazon Rekognition API operations. For more information, see Analyzing an Image Loaded from a Local File System in the Amazon Rekognition Developer Guide. You pass images stored in an S3 bucket to an Amazon Rekognition API operation by using the <code>S3Object</code> property. Images stored in an S3 bucket do not need to be base64-encoded. The region for the S3 bucket containing the S3 object must match the region you use for Amazon Rekognition operations. If you use the AWS CLI to call Amazon Rekognition operations, passing image bytes using the Bytes
    * property is not supported. You must first upload the image to an Amazon S3 bucket and then call the operation using the S3Object property. For Amazon Rekognition to process an S3 object, the user must have permission to access the S3 object. For more information, see How Amazon Rekognition works with IAM in the Amazon Rekognition Developer Guide.
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

  /** Identifies face image brightness and sharpness.
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

  /** An instance of a label returned by Amazon Rekognition Image (<a>DetectLabels</a>) or by Amazon Rekognition Video (<a>GetLabelDetection</a>).
    */
  @js.native
  trait Instance extends js.Object {
    var BoundingBox: js.UndefOr[BoundingBox]
    var Confidence: js.UndefOr[Percent]
    var DominantColors: js.UndefOr[DominantColors]
  }

  object Instance {
    @inline
    def apply(
        BoundingBox: js.UndefOr[BoundingBox] = js.undefined,
        Confidence: js.UndefOr[Percent] = js.undefined,
        DominantColors: js.UndefOr[DominantColors] = js.undefined
    ): Instance = {
      val __obj = js.Dynamic.literal()
      BoundingBox.foreach(__v => __obj.updateDynamic("BoundingBox")(__v.asInstanceOf[js.Any]))
      Confidence.foreach(__v => __obj.updateDynamic("Confidence")(__v.asInstanceOf[js.Any]))
      DominantColors.foreach(__v => __obj.updateDynamic("DominantColors")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Instance]
    }
  }

  /** The Kinesis data stream Amazon Rekognition to which the analysis results of a Amazon Rekognition stream processor are streamed. For more information, see CreateStreamProcessor in the Amazon Rekognition Developer Guide.
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

  /** Kinesis video stream stream that provides the source streaming video for a Amazon Rekognition Video stream processor. For more information, see CreateStreamProcessor in the Amazon Rekognition Developer Guide.
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

  /** Specifies the starting point in a Kinesis stream to start processing. You can use the producer timestamp or the fragment number. One of either producer timestamp or fragment number is required. If you use the producer timestamp, you must put the time in milliseconds. For more information about fragment numbers, see [[https://docs.aws.amazon.com/kinesisvideostreams/latest/dg/API_reader_Fragment.html|Fragment]].
    */
  @js.native
  trait KinesisVideoStreamStartSelector extends js.Object {
    var FragmentNumber: js.UndefOr[KinesisVideoStreamFragmentNumber]
    var ProducerTimestamp: js.UndefOr[ULong]
  }

  object KinesisVideoStreamStartSelector {
    @inline
    def apply(
        FragmentNumber: js.UndefOr[KinesisVideoStreamFragmentNumber] = js.undefined,
        ProducerTimestamp: js.UndefOr[ULong] = js.undefined
    ): KinesisVideoStreamStartSelector = {
      val __obj = js.Dynamic.literal()
      FragmentNumber.foreach(__v => __obj.updateDynamic("FragmentNumber")(__v.asInstanceOf[js.Any]))
      ProducerTimestamp.foreach(__v => __obj.updateDynamic("ProducerTimestamp")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[KinesisVideoStreamStartSelector]
    }
  }

  /** The known gender identity for the celebrity that matches the provided ID. The known gender identity can be Male, Female, Nonbinary, or Unlisted.
    */
  @js.native
  trait KnownGender extends js.Object {
    var Type: js.UndefOr[KnownGenderType]
  }

  object KnownGender {
    @inline
    def apply(
        Type: js.UndefOr[KnownGenderType] = js.undefined
    ): KnownGender = {
      val __obj = js.Dynamic.literal()
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[KnownGender]
    }
  }

  /** Structure containing details about the detected label, including the name, detected instances, parent labels, and level of confidence.
    */
  @js.native
  trait Label extends js.Object {
    var Aliases: js.UndefOr[LabelAliases]
    var Categories: js.UndefOr[LabelCategories]
    var Confidence: js.UndefOr[Percent]
    var Instances: js.UndefOr[Instances]
    var Name: js.UndefOr[String]
    var Parents: js.UndefOr[Parents]
  }

  object Label {
    @inline
    def apply(
        Aliases: js.UndefOr[LabelAliases] = js.undefined,
        Categories: js.UndefOr[LabelCategories] = js.undefined,
        Confidence: js.UndefOr[Percent] = js.undefined,
        Instances: js.UndefOr[Instances] = js.undefined,
        Name: js.UndefOr[String] = js.undefined,
        Parents: js.UndefOr[Parents] = js.undefined
    ): Label = {
      val __obj = js.Dynamic.literal()
      Aliases.foreach(__v => __obj.updateDynamic("Aliases")(__v.asInstanceOf[js.Any]))
      Categories.foreach(__v => __obj.updateDynamic("Categories")(__v.asInstanceOf[js.Any]))
      Confidence.foreach(__v => __obj.updateDynamic("Confidence")(__v.asInstanceOf[js.Any]))
      Instances.foreach(__v => __obj.updateDynamic("Instances")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Parents.foreach(__v => __obj.updateDynamic("Parents")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Label]
    }
  }

  /** A potential alias of for a given label.
    */
  @js.native
  trait LabelAlias extends js.Object {
    var Name: js.UndefOr[String]
  }

  object LabelAlias {
    @inline
    def apply(
        Name: js.UndefOr[String] = js.undefined
    ): LabelAlias = {
      val __obj = js.Dynamic.literal()
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LabelAlias]
    }
  }

  /** The category that applies to a given label.
    */
  @js.native
  trait LabelCategory extends js.Object {
    var Name: js.UndefOr[String]
  }

  object LabelCategory {
    @inline
    def apply(
        Name: js.UndefOr[String] = js.undefined
    ): LabelCategory = {
      val __obj = js.Dynamic.literal()
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LabelCategory]
    }
  }

  /** Information about a label detected in a video analysis request and the time the label was detected in the video.
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

  /** Indicates the location of the landmark on the face.
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
  trait ListDatasetEntriesRequest extends js.Object {
    var DatasetArn: DatasetArn
    var ContainsLabels: js.UndefOr[DatasetLabels]
    var HasErrors: js.UndefOr[HasErrors]
    var Labeled: js.UndefOr[IsLabeled]
    var MaxResults: js.UndefOr[ListDatasetEntriesPageSize]
    var NextToken: js.UndefOr[ExtendedPaginationToken]
    var SourceRefContains: js.UndefOr[QueryString]
  }

  object ListDatasetEntriesRequest {
    @inline
    def apply(
        DatasetArn: DatasetArn,
        ContainsLabels: js.UndefOr[DatasetLabels] = js.undefined,
        HasErrors: js.UndefOr[HasErrors] = js.undefined,
        Labeled: js.UndefOr[IsLabeled] = js.undefined,
        MaxResults: js.UndefOr[ListDatasetEntriesPageSize] = js.undefined,
        NextToken: js.UndefOr[ExtendedPaginationToken] = js.undefined,
        SourceRefContains: js.UndefOr[QueryString] = js.undefined
    ): ListDatasetEntriesRequest = {
      val __obj = js.Dynamic.literal(
        "DatasetArn" -> DatasetArn.asInstanceOf[js.Any]
      )

      ContainsLabels.foreach(__v => __obj.updateDynamic("ContainsLabels")(__v.asInstanceOf[js.Any]))
      HasErrors.foreach(__v => __obj.updateDynamic("HasErrors")(__v.asInstanceOf[js.Any]))
      Labeled.foreach(__v => __obj.updateDynamic("Labeled")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      SourceRefContains.foreach(__v => __obj.updateDynamic("SourceRefContains")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDatasetEntriesRequest]
    }
  }

  @js.native
  trait ListDatasetEntriesResponse extends js.Object {
    var DatasetEntries: js.UndefOr[DatasetEntries]
    var NextToken: js.UndefOr[ExtendedPaginationToken]
  }

  object ListDatasetEntriesResponse {
    @inline
    def apply(
        DatasetEntries: js.UndefOr[DatasetEntries] = js.undefined,
        NextToken: js.UndefOr[ExtendedPaginationToken] = js.undefined
    ): ListDatasetEntriesResponse = {
      val __obj = js.Dynamic.literal()
      DatasetEntries.foreach(__v => __obj.updateDynamic("DatasetEntries")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDatasetEntriesResponse]
    }
  }

  @js.native
  trait ListDatasetLabelsRequest extends js.Object {
    var DatasetArn: DatasetArn
    var MaxResults: js.UndefOr[ListDatasetLabelsPageSize]
    var NextToken: js.UndefOr[ExtendedPaginationToken]
  }

  object ListDatasetLabelsRequest {
    @inline
    def apply(
        DatasetArn: DatasetArn,
        MaxResults: js.UndefOr[ListDatasetLabelsPageSize] = js.undefined,
        NextToken: js.UndefOr[ExtendedPaginationToken] = js.undefined
    ): ListDatasetLabelsRequest = {
      val __obj = js.Dynamic.literal(
        "DatasetArn" -> DatasetArn.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDatasetLabelsRequest]
    }
  }

  @js.native
  trait ListDatasetLabelsResponse extends js.Object {
    var DatasetLabelDescriptions: js.UndefOr[DatasetLabelDescriptions]
    var NextToken: js.UndefOr[ExtendedPaginationToken]
  }

  object ListDatasetLabelsResponse {
    @inline
    def apply(
        DatasetLabelDescriptions: js.UndefOr[DatasetLabelDescriptions] = js.undefined,
        NextToken: js.UndefOr[ExtendedPaginationToken] = js.undefined
    ): ListDatasetLabelsResponse = {
      val __obj = js.Dynamic.literal()
      DatasetLabelDescriptions.foreach(__v => __obj.updateDynamic("DatasetLabelDescriptions")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDatasetLabelsResponse]
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
  trait ListProjectPoliciesRequest extends js.Object {
    var ProjectArn: ProjectArn
    var MaxResults: js.UndefOr[ListProjectPoliciesPageSize]
    var NextToken: js.UndefOr[ExtendedPaginationToken]
  }

  object ListProjectPoliciesRequest {
    @inline
    def apply(
        ProjectArn: ProjectArn,
        MaxResults: js.UndefOr[ListProjectPoliciesPageSize] = js.undefined,
        NextToken: js.UndefOr[ExtendedPaginationToken] = js.undefined
    ): ListProjectPoliciesRequest = {
      val __obj = js.Dynamic.literal(
        "ProjectArn" -> ProjectArn.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListProjectPoliciesRequest]
    }
  }

  @js.native
  trait ListProjectPoliciesResponse extends js.Object {
    var NextToken: js.UndefOr[ExtendedPaginationToken]
    var ProjectPolicies: js.UndefOr[ProjectPolicies]
  }

  object ListProjectPoliciesResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[ExtendedPaginationToken] = js.undefined,
        ProjectPolicies: js.UndefOr[ProjectPolicies] = js.undefined
    ): ListProjectPoliciesResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      ProjectPolicies.foreach(__v => __obj.updateDynamic("ProjectPolicies")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListProjectPoliciesResponse]
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

  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var ResourceArn: ResourceArn
  }

  object ListTagsForResourceRequest {
    @inline
    def apply(
        ResourceArn: ResourceArn
    ): ListTagsForResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ListTagsForResourceRequest]
    }
  }

  @js.native
  trait ListTagsForResourceResponse extends js.Object {
    var Tags: js.UndefOr[TagMap]
  }

  object ListTagsForResourceResponse {
    @inline
    def apply(
        Tags: js.UndefOr[TagMap] = js.undefined
    ): ListTagsForResourceResponse = {
      val __obj = js.Dynamic.literal()
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceResponse]
    }
  }

  /** Provides information about a single type of inappropriate, unwanted, or offensive content found in an image or video. Each type of moderated content has a label within a hierarchical taxonomy. For more information, see Content moderation in the Amazon Rekognition Developer Guide.
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

  /** Indicates whether or not the mouth on the face is open, and the confidence level in the determination.
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

  /** Indicates whether or not the face has a mustache, and the confidence level in the determination.
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

  /** The Amazon Simple Notification Service topic to which Amazon Rekognition publishes the completion status of a video analysis operation. For more information, see [[https://docs.aws.amazon.com/rekognition/latest/dg/api-video.html|Calling Amazon Rekognition Video operations]]. Note that the Amazon SNS topic must have a topic name that begins with <i>AmazonRekognition</i> if you are using the AmazonRekognitionServiceRole permissions policy to access the topic. For more information, see [[https://docs.aws.amazon.com/rekognition/latest/dg/api-video-roles.html#api-video-roles-all-topics|Giving access to multiple Amazon SNS topics]].
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

  /** The S3 bucket and folder location where training output is placed.
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

  /** A parent label for a label. A label can have 0, 1, or more parents.
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

  /** Details about a person detected in a video analysis request.
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

  /** Details and path tracking information for a single time a person's path is tracked in a video. Amazon Rekognition operations that track people's paths return an array of <code>PersonDetection</code> objects with elements for each time a person's path is tracked in a video. For more information, see GetPersonTracking in the Amazon Rekognition Developer Guide.
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

  /** Information about a person whose face matches a face(s) in an Amazon Rekognition collection. Includes information about the faces in the Amazon Rekognition collection (<a>FaceMatch</a>), information about the person (<a>PersonDetail</a>), and the time stamp for when the person was detected in a video. An array of <code>PersonMatch</code> objects is returned by <a>GetFaceSearch</a>.
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

  /** The X and Y coordinates of a point on an image or video frame. The X and Y values are ratios of the overall image size or video resolution. For example, if an input image is 700x200 and the values are X=0.5 and Y=0.25, then the point is at the (350,50) pixel coordinate on the image. An array of <code>Point</code> objects makes up a <code>Polygon</code>. A <code>Polygon</code> is returned by <a>DetectText</a> and by <a>DetectCustomLabels</a> <code>Polygon</code> represents a fine-grained polygon around a detected item. For more information, see Geometry in the Amazon Rekognition Developer Guide.
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

  /** Indicates the pose of the face as determined by its pitch, roll, and yaw.
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

  /** A description of an Amazon Rekognition Custom Labels project. For more information, see <a>DescribeProjects</a>.
    */
  @js.native
  trait ProjectDescription extends js.Object {
    var CreationTimestamp: js.UndefOr[DateTime]
    var Datasets: js.UndefOr[DatasetMetadataList]
    var ProjectArn: js.UndefOr[ProjectArn]
    var Status: js.UndefOr[ProjectStatus]
  }

  object ProjectDescription {
    @inline
    def apply(
        CreationTimestamp: js.UndefOr[DateTime] = js.undefined,
        Datasets: js.UndefOr[DatasetMetadataList] = js.undefined,
        ProjectArn: js.UndefOr[ProjectArn] = js.undefined,
        Status: js.UndefOr[ProjectStatus] = js.undefined
    ): ProjectDescription = {
      val __obj = js.Dynamic.literal()
      CreationTimestamp.foreach(__v => __obj.updateDynamic("CreationTimestamp")(__v.asInstanceOf[js.Any]))
      Datasets.foreach(__v => __obj.updateDynamic("Datasets")(__v.asInstanceOf[js.Any]))
      ProjectArn.foreach(__v => __obj.updateDynamic("ProjectArn")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ProjectDescription]
    }
  }

  /** Describes a project policy in the response from <a>ListProjectPolicies</a>.
    */
  @js.native
  trait ProjectPolicy extends js.Object {
    var CreationTimestamp: js.UndefOr[DateTime]
    var LastUpdatedTimestamp: js.UndefOr[DateTime]
    var PolicyDocument: js.UndefOr[ProjectPolicyDocument]
    var PolicyName: js.UndefOr[ProjectPolicyName]
    var PolicyRevisionId: js.UndefOr[ProjectPolicyRevisionId]
    var ProjectArn: js.UndefOr[ProjectArn]
  }

  object ProjectPolicy {
    @inline
    def apply(
        CreationTimestamp: js.UndefOr[DateTime] = js.undefined,
        LastUpdatedTimestamp: js.UndefOr[DateTime] = js.undefined,
        PolicyDocument: js.UndefOr[ProjectPolicyDocument] = js.undefined,
        PolicyName: js.UndefOr[ProjectPolicyName] = js.undefined,
        PolicyRevisionId: js.UndefOr[ProjectPolicyRevisionId] = js.undefined,
        ProjectArn: js.UndefOr[ProjectArn] = js.undefined
    ): ProjectPolicy = {
      val __obj = js.Dynamic.literal()
      CreationTimestamp.foreach(__v => __obj.updateDynamic("CreationTimestamp")(__v.asInstanceOf[js.Any]))
      LastUpdatedTimestamp.foreach(__v => __obj.updateDynamic("LastUpdatedTimestamp")(__v.asInstanceOf[js.Any]))
      PolicyDocument.foreach(__v => __obj.updateDynamic("PolicyDocument")(__v.asInstanceOf[js.Any]))
      PolicyName.foreach(__v => __obj.updateDynamic("PolicyName")(__v.asInstanceOf[js.Any]))
      PolicyRevisionId.foreach(__v => __obj.updateDynamic("PolicyRevisionId")(__v.asInstanceOf[js.Any]))
      ProjectArn.foreach(__v => __obj.updateDynamic("ProjectArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ProjectPolicy]
    }
  }

  /** A description of a version of an Amazon Rekognition Custom Labels model.
    */
  @js.native
  trait ProjectVersionDescription extends js.Object {
    var BillableTrainingTimeInSeconds: js.UndefOr[ULong]
    var CreationTimestamp: js.UndefOr[DateTime]
    var EvaluationResult: js.UndefOr[EvaluationResult]
    var KmsKeyId: js.UndefOr[KmsKeyId]
    var ManifestSummary: js.UndefOr[GroundTruthManifest]
    var MaxInferenceUnits: js.UndefOr[InferenceUnits]
    var MinInferenceUnits: js.UndefOr[InferenceUnits]
    var OutputConfig: js.UndefOr[OutputConfig]
    var ProjectVersionArn: js.UndefOr[ProjectVersionArn]
    var SourceProjectVersionArn: js.UndefOr[ProjectVersionArn]
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
        KmsKeyId: js.UndefOr[KmsKeyId] = js.undefined,
        ManifestSummary: js.UndefOr[GroundTruthManifest] = js.undefined,
        MaxInferenceUnits: js.UndefOr[InferenceUnits] = js.undefined,
        MinInferenceUnits: js.UndefOr[InferenceUnits] = js.undefined,
        OutputConfig: js.UndefOr[OutputConfig] = js.undefined,
        ProjectVersionArn: js.UndefOr[ProjectVersionArn] = js.undefined,
        SourceProjectVersionArn: js.UndefOr[ProjectVersionArn] = js.undefined,
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
      KmsKeyId.foreach(__v => __obj.updateDynamic("KmsKeyId")(__v.asInstanceOf[js.Any]))
      ManifestSummary.foreach(__v => __obj.updateDynamic("ManifestSummary")(__v.asInstanceOf[js.Any]))
      MaxInferenceUnits.foreach(__v => __obj.updateDynamic("MaxInferenceUnits")(__v.asInstanceOf[js.Any]))
      MinInferenceUnits.foreach(__v => __obj.updateDynamic("MinInferenceUnits")(__v.asInstanceOf[js.Any]))
      OutputConfig.foreach(__v => __obj.updateDynamic("OutputConfig")(__v.asInstanceOf[js.Any]))
      ProjectVersionArn.foreach(__v => __obj.updateDynamic("ProjectVersionArn")(__v.asInstanceOf[js.Any]))
      SourceProjectVersionArn.foreach(__v => __obj.updateDynamic("SourceProjectVersionArn")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      StatusMessage.foreach(__v => __obj.updateDynamic("StatusMessage")(__v.asInstanceOf[js.Any]))
      TestingDataResult.foreach(__v => __obj.updateDynamic("TestingDataResult")(__v.asInstanceOf[js.Any]))
      TrainingDataResult.foreach(__v => __obj.updateDynamic("TrainingDataResult")(__v.asInstanceOf[js.Any]))
      TrainingEndTimestamp.foreach(__v => __obj.updateDynamic("TrainingEndTimestamp")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ProjectVersionDescription]
    }
  }

  /** Information about a body part detected by <a>DetectProtectiveEquipment</a> that contains PPE. An array of <code>ProtectiveEquipmentBodyPart</code> objects is returned for each person detected by <code>DetectProtectiveEquipment</code>.
    */
  @js.native
  trait ProtectiveEquipmentBodyPart extends js.Object {
    var Confidence: js.UndefOr[Percent]
    var EquipmentDetections: js.UndefOr[EquipmentDetections]
    var Name: js.UndefOr[BodyPart]
  }

  object ProtectiveEquipmentBodyPart {
    @inline
    def apply(
        Confidence: js.UndefOr[Percent] = js.undefined,
        EquipmentDetections: js.UndefOr[EquipmentDetections] = js.undefined,
        Name: js.UndefOr[BodyPart] = js.undefined
    ): ProtectiveEquipmentBodyPart = {
      val __obj = js.Dynamic.literal()
      Confidence.foreach(__v => __obj.updateDynamic("Confidence")(__v.asInstanceOf[js.Any]))
      EquipmentDetections.foreach(__v => __obj.updateDynamic("EquipmentDetections")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ProtectiveEquipmentBodyPart]
    }
  }

  /** A person detected by a call to <a>DetectProtectiveEquipment</a>. The API returns all persons detected in the input image in an array of <code>ProtectiveEquipmentPerson</code> objects.
    */
  @js.native
  trait ProtectiveEquipmentPerson extends js.Object {
    var BodyParts: js.UndefOr[BodyParts]
    var BoundingBox: js.UndefOr[BoundingBox]
    var Confidence: js.UndefOr[Percent]
    var Id: js.UndefOr[UInteger]
  }

  object ProtectiveEquipmentPerson {
    @inline
    def apply(
        BodyParts: js.UndefOr[BodyParts] = js.undefined,
        BoundingBox: js.UndefOr[BoundingBox] = js.undefined,
        Confidence: js.UndefOr[Percent] = js.undefined,
        Id: js.UndefOr[UInteger] = js.undefined
    ): ProtectiveEquipmentPerson = {
      val __obj = js.Dynamic.literal()
      BodyParts.foreach(__v => __obj.updateDynamic("BodyParts")(__v.asInstanceOf[js.Any]))
      BoundingBox.foreach(__v => __obj.updateDynamic("BoundingBox")(__v.asInstanceOf[js.Any]))
      Confidence.foreach(__v => __obj.updateDynamic("Confidence")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ProtectiveEquipmentPerson]
    }
  }

  /** Specifies summary attributes to return from a call to <a>DetectProtectiveEquipment</a>. You can specify which types of PPE to summarize. You can also specify a minimum confidence value for detections. Summary information is returned in the <code>Summary</code> (<a>ProtectiveEquipmentSummary</a>) field of the response from <code>DetectProtectiveEquipment</code>. The summary includes which persons in an image were detected wearing the requested types of person protective equipment (PPE), which persons were detected as not wearing PPE, and the persons in which a determination could not be made. For more information, see <a>ProtectiveEquipmentSummary</a>.
    */
  @js.native
  trait ProtectiveEquipmentSummarizationAttributes extends js.Object {
    var MinConfidence: Percent
    var RequiredEquipmentTypes: ProtectiveEquipmentTypes
  }

  object ProtectiveEquipmentSummarizationAttributes {
    @inline
    def apply(
        MinConfidence: Percent,
        RequiredEquipmentTypes: ProtectiveEquipmentTypes
    ): ProtectiveEquipmentSummarizationAttributes = {
      val __obj = js.Dynamic.literal(
        "MinConfidence" -> MinConfidence.asInstanceOf[js.Any],
        "RequiredEquipmentTypes" -> RequiredEquipmentTypes.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ProtectiveEquipmentSummarizationAttributes]
    }
  }

  /** Summary information for required items of personal protective equipment (PPE) detected on persons by a call to <a>DetectProtectiveEquipment</a>. You specify the required type of PPE in the <code>SummarizationAttributes</code> (<a>ProtectiveEquipmentSummarizationAttributes</a>) input parameter. The summary includes which persons were detected wearing the required personal protective equipment (<code>PersonsWithRequiredEquipment</code>), which persons were detected as not wearing the required PPE (<code>PersonsWithoutRequiredEquipment</code>), and the persons in which a determination could not be made (<code>PersonsIndeterminate</code>). To get a total for each category, use the size of the field array. For example, to find out how many people were detected as wearing the specified PPE, use the size of the <code>PersonsWithRequiredEquipment</code> array. If you want to find out more about a person, such as the location (<a>BoundingBox</a>) of the person on the image, use the person
    * ID in each array element. Each person ID matches the ID field of a <a>ProtectiveEquipmentPerson</a> object returned in the <code>Persons</code> array by <code>DetectProtectiveEquipment</code>.
    */
  @js.native
  trait ProtectiveEquipmentSummary extends js.Object {
    var PersonsIndeterminate: js.UndefOr[ProtectiveEquipmentPersonIds]
    var PersonsWithRequiredEquipment: js.UndefOr[ProtectiveEquipmentPersonIds]
    var PersonsWithoutRequiredEquipment: js.UndefOr[ProtectiveEquipmentPersonIds]
  }

  object ProtectiveEquipmentSummary {
    @inline
    def apply(
        PersonsIndeterminate: js.UndefOr[ProtectiveEquipmentPersonIds] = js.undefined,
        PersonsWithRequiredEquipment: js.UndefOr[ProtectiveEquipmentPersonIds] = js.undefined,
        PersonsWithoutRequiredEquipment: js.UndefOr[ProtectiveEquipmentPersonIds] = js.undefined
    ): ProtectiveEquipmentSummary = {
      val __obj = js.Dynamic.literal()
      PersonsIndeterminate.foreach(__v => __obj.updateDynamic("PersonsIndeterminate")(__v.asInstanceOf[js.Any]))
      PersonsWithRequiredEquipment.foreach(__v => __obj.updateDynamic("PersonsWithRequiredEquipment")(__v.asInstanceOf[js.Any]))
      PersonsWithoutRequiredEquipment.foreach(__v => __obj.updateDynamic("PersonsWithoutRequiredEquipment")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ProtectiveEquipmentSummary]
    }
  }

  @js.native
  trait PutProjectPolicyRequest extends js.Object {
    var PolicyDocument: ProjectPolicyDocument
    var PolicyName: ProjectPolicyName
    var ProjectArn: ProjectArn
    var PolicyRevisionId: js.UndefOr[ProjectPolicyRevisionId]
  }

  object PutProjectPolicyRequest {
    @inline
    def apply(
        PolicyDocument: ProjectPolicyDocument,
        PolicyName: ProjectPolicyName,
        ProjectArn: ProjectArn,
        PolicyRevisionId: js.UndefOr[ProjectPolicyRevisionId] = js.undefined
    ): PutProjectPolicyRequest = {
      val __obj = js.Dynamic.literal(
        "PolicyDocument" -> PolicyDocument.asInstanceOf[js.Any],
        "PolicyName" -> PolicyName.asInstanceOf[js.Any],
        "ProjectArn" -> ProjectArn.asInstanceOf[js.Any]
      )

      PolicyRevisionId.foreach(__v => __obj.updateDynamic("PolicyRevisionId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutProjectPolicyRequest]
    }
  }

  @js.native
  trait PutProjectPolicyResponse extends js.Object {
    var PolicyRevisionId: js.UndefOr[ProjectPolicyRevisionId]
  }

  object PutProjectPolicyResponse {
    @inline
    def apply(
        PolicyRevisionId: js.UndefOr[ProjectPolicyRevisionId] = js.undefined
    ): PutProjectPolicyResponse = {
      val __obj = js.Dynamic.literal()
      PolicyRevisionId.foreach(__v => __obj.updateDynamic("PolicyRevisionId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutProjectPolicyResponse]
    }
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

  /** Specifies a location within the frame that Rekognition checks for objects of interest such as text, labels, or faces. It uses a <code>BoundingBox</code> or <code>Polygon</code> to set a region of the screen. A word, face, or label is included in the region if it is more than half in that region. If there is more than one region, the word, face, or label is compared with all regions of the screen. Any object of interest that is more than half in a region is kept in the results.
    */
  @js.native
  trait RegionOfInterest extends js.Object {
    var BoundingBox: js.UndefOr[BoundingBox]
    var Polygon: js.UndefOr[Polygon]
  }

  object RegionOfInterest {
    @inline
    def apply(
        BoundingBox: js.UndefOr[BoundingBox] = js.undefined,
        Polygon: js.UndefOr[Polygon] = js.undefined
    ): RegionOfInterest = {
      val __obj = js.Dynamic.literal()
      BoundingBox.foreach(__v => __obj.updateDynamic("BoundingBox")(__v.asInstanceOf[js.Any]))
      Polygon.foreach(__v => __obj.updateDynamic("Polygon")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RegionOfInterest]
    }
  }

  /** The Amazon S3 bucket location to which Amazon Rekognition publishes the detailed inference results of a video analysis operation. These results include the name of the stream processor resource, the session ID of the stream processing session, and labeled timestamps and bounding boxes for detected labels.
    */
  @js.native
  trait S3Destination extends js.Object {
    var Bucket: js.UndefOr[S3Bucket]
    var KeyPrefix: js.UndefOr[S3KeyPrefix]
  }

  object S3Destination {
    @inline
    def apply(
        Bucket: js.UndefOr[S3Bucket] = js.undefined,
        KeyPrefix: js.UndefOr[S3KeyPrefix] = js.undefined
    ): S3Destination = {
      val __obj = js.Dynamic.literal()
      Bucket.foreach(__v => __obj.updateDynamic("Bucket")(__v.asInstanceOf[js.Any]))
      KeyPrefix.foreach(__v => __obj.updateDynamic("KeyPrefix")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[S3Destination]
    }
  }

  /** Provides the S3 bucket name and object name. The region for the S3 bucket containing the S3 object must match the region you use for Amazon Rekognition operations. For Amazon Rekognition to process an S3 object, the user must have permission to access the S3 object. For more information, see How Amazon Rekognition works with IAM in the Amazon Rekognition Developer Guide.
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

  /** A technical cue or shot detection segment detected in a video. An array of <code>SegmentDetection</code> objects containing all segments detected in a stored video is returned by <a>GetSegmentDetection</a>.
    */
  @js.native
  trait SegmentDetection extends js.Object {
    var DurationFrames: js.UndefOr[ULong]
    var DurationMillis: js.UndefOr[ULong]
    var DurationSMPTE: js.UndefOr[Timecode]
    var EndFrameNumber: js.UndefOr[ULong]
    var EndTimecodeSMPTE: js.UndefOr[Timecode]
    var EndTimestampMillis: js.UndefOr[Timestamp]
    var ShotSegment: js.UndefOr[ShotSegment]
    var StartFrameNumber: js.UndefOr[ULong]
    var StartTimecodeSMPTE: js.UndefOr[Timecode]
    var StartTimestampMillis: js.UndefOr[Timestamp]
    var TechnicalCueSegment: js.UndefOr[TechnicalCueSegment]
    var Type: js.UndefOr[SegmentType]
  }

  object SegmentDetection {
    @inline
    def apply(
        DurationFrames: js.UndefOr[ULong] = js.undefined,
        DurationMillis: js.UndefOr[ULong] = js.undefined,
        DurationSMPTE: js.UndefOr[Timecode] = js.undefined,
        EndFrameNumber: js.UndefOr[ULong] = js.undefined,
        EndTimecodeSMPTE: js.UndefOr[Timecode] = js.undefined,
        EndTimestampMillis: js.UndefOr[Timestamp] = js.undefined,
        ShotSegment: js.UndefOr[ShotSegment] = js.undefined,
        StartFrameNumber: js.UndefOr[ULong] = js.undefined,
        StartTimecodeSMPTE: js.UndefOr[Timecode] = js.undefined,
        StartTimestampMillis: js.UndefOr[Timestamp] = js.undefined,
        TechnicalCueSegment: js.UndefOr[TechnicalCueSegment] = js.undefined,
        Type: js.UndefOr[SegmentType] = js.undefined
    ): SegmentDetection = {
      val __obj = js.Dynamic.literal()
      DurationFrames.foreach(__v => __obj.updateDynamic("DurationFrames")(__v.asInstanceOf[js.Any]))
      DurationMillis.foreach(__v => __obj.updateDynamic("DurationMillis")(__v.asInstanceOf[js.Any]))
      DurationSMPTE.foreach(__v => __obj.updateDynamic("DurationSMPTE")(__v.asInstanceOf[js.Any]))
      EndFrameNumber.foreach(__v => __obj.updateDynamic("EndFrameNumber")(__v.asInstanceOf[js.Any]))
      EndTimecodeSMPTE.foreach(__v => __obj.updateDynamic("EndTimecodeSMPTE")(__v.asInstanceOf[js.Any]))
      EndTimestampMillis.foreach(__v => __obj.updateDynamic("EndTimestampMillis")(__v.asInstanceOf[js.Any]))
      ShotSegment.foreach(__v => __obj.updateDynamic("ShotSegment")(__v.asInstanceOf[js.Any]))
      StartFrameNumber.foreach(__v => __obj.updateDynamic("StartFrameNumber")(__v.asInstanceOf[js.Any]))
      StartTimecodeSMPTE.foreach(__v => __obj.updateDynamic("StartTimecodeSMPTE")(__v.asInstanceOf[js.Any]))
      StartTimestampMillis.foreach(__v => __obj.updateDynamic("StartTimestampMillis")(__v.asInstanceOf[js.Any]))
      TechnicalCueSegment.foreach(__v => __obj.updateDynamic("TechnicalCueSegment")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SegmentDetection]
    }
  }

  /** Information about the type of a segment requested in a call to <a>StartSegmentDetection</a>. An array of <code>SegmentTypeInfo</code> objects is returned by the response from <a>GetSegmentDetection</a>.
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

  /** Information about a shot detection segment detected in a video. For more information, see <a>SegmentDetection</a>.
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

  /** Indicates whether or not the face is smiling, and the confidence level in the determination.
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
    var MaxInferenceUnits: js.UndefOr[InferenceUnits]
  }

  object StartProjectVersionRequest {
    @inline
    def apply(
        MinInferenceUnits: InferenceUnits,
        ProjectVersionArn: ProjectVersionArn,
        MaxInferenceUnits: js.UndefOr[InferenceUnits] = js.undefined
    ): StartProjectVersionRequest = {
      val __obj = js.Dynamic.literal(
        "MinInferenceUnits" -> MinInferenceUnits.asInstanceOf[js.Any],
        "ProjectVersionArn" -> ProjectVersionArn.asInstanceOf[js.Any]
      )

      MaxInferenceUnits.foreach(__v => __obj.updateDynamic("MaxInferenceUnits")(__v.asInstanceOf[js.Any]))
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

  /** Filters applied to the technical cue or shot detection segments. For more information, see <a>StartSegmentDetection</a>.
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

  /** Filters for the shot detection segments returned by <code>GetSegmentDetection</code>. For more information, see <a>StartSegmentDetectionFilters</a>.
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
    var StartSelector: js.UndefOr[StreamProcessingStartSelector]
    var StopSelector: js.UndefOr[StreamProcessingStopSelector]
  }

  object StartStreamProcessorRequest {
    @inline
    def apply(
        Name: StreamProcessorName,
        StartSelector: js.UndefOr[StreamProcessingStartSelector] = js.undefined,
        StopSelector: js.UndefOr[StreamProcessingStopSelector] = js.undefined
    ): StartStreamProcessorRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      StartSelector.foreach(__v => __obj.updateDynamic("StartSelector")(__v.asInstanceOf[js.Any]))
      StopSelector.foreach(__v => __obj.updateDynamic("StopSelector")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartStreamProcessorRequest]
    }
  }

  @js.native
  trait StartStreamProcessorResponse extends js.Object {
    var SessionId: js.UndefOr[StartStreamProcessorSessionId]
  }

  object StartStreamProcessorResponse {
    @inline
    def apply(
        SessionId: js.UndefOr[StartStreamProcessorSessionId] = js.undefined
    ): StartStreamProcessorResponse = {
      val __obj = js.Dynamic.literal()
      SessionId.foreach(__v => __obj.updateDynamic("SessionId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartStreamProcessorResponse]
    }
  }

  /** Filters for the technical segments returned by <a>GetSegmentDetection</a>. For more information, see <a>StartSegmentDetectionFilters</a>.
    */
  @js.native
  trait StartTechnicalCueDetectionFilter extends js.Object {
    var BlackFrame: js.UndefOr[BlackFrame]
    var MinSegmentConfidence: js.UndefOr[SegmentConfidence]
  }

  object StartTechnicalCueDetectionFilter {
    @inline
    def apply(
        BlackFrame: js.UndefOr[BlackFrame] = js.undefined,
        MinSegmentConfidence: js.UndefOr[SegmentConfidence] = js.undefined
    ): StartTechnicalCueDetectionFilter = {
      val __obj = js.Dynamic.literal()
      BlackFrame.foreach(__v => __obj.updateDynamic("BlackFrame")(__v.asInstanceOf[js.Any]))
      MinSegmentConfidence.foreach(__v => __obj.updateDynamic("MinSegmentConfidence")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartTechnicalCueDetectionFilter]
    }
  }

  /** Set of optional parameters that let you set the criteria text must meet to be included in your response. <code>WordFilter</code> looks at a word's height, width and minimum confidence. <code>RegionOfInterest</code> lets you set a specific region of the screen to look for text in.
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
  trait StopStreamProcessorResponse extends js.Object

  object StopStreamProcessorResponse {
    @inline
    def apply(): StopStreamProcessorResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StopStreamProcessorResponse]
    }
  }

  /** This is a required parameter for label detection stream processors and should not be used to start a face search stream processor.
    */
  @js.native
  trait StreamProcessingStartSelector extends js.Object {
    var KVSStreamStartSelector: js.UndefOr[KinesisVideoStreamStartSelector]
  }

  object StreamProcessingStartSelector {
    @inline
    def apply(
        KVSStreamStartSelector: js.UndefOr[KinesisVideoStreamStartSelector] = js.undefined
    ): StreamProcessingStartSelector = {
      val __obj = js.Dynamic.literal()
      KVSStreamStartSelector.foreach(__v => __obj.updateDynamic("KVSStreamStartSelector")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StreamProcessingStartSelector]
    }
  }

  /** Specifies when to stop processing the stream. You can specify a maximum amount of time to process the video.
    */
  @js.native
  trait StreamProcessingStopSelector extends js.Object {
    var MaxDurationInSeconds: js.UndefOr[MaxDurationInSecondsULong]
  }

  object StreamProcessingStopSelector {
    @inline
    def apply(
        MaxDurationInSeconds: js.UndefOr[MaxDurationInSecondsULong] = js.undefined
    ): StreamProcessingStopSelector = {
      val __obj = js.Dynamic.literal()
      MaxDurationInSeconds.foreach(__v => __obj.updateDynamic("MaxDurationInSeconds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StreamProcessingStopSelector]
    }
  }

  /** An object that recognizes faces or labels in a streaming video. An Amazon Rekognition stream processor is created by a call to <a>CreateStreamProcessor</a>. The request parameters for <code>CreateStreamProcessor</code> describe the Kinesis video stream source for the streaming video, face recognition parameters, and where to stream the analysis resullts.
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

  /** Allows you to opt in or opt out to share data with Rekognition to improve model performance. You can choose this option at the account level or on a per-stream basis. Note that if you opt out at the account level this setting is ignored on individual streams.
    */
  @js.native
  trait StreamProcessorDataSharingPreference extends js.Object {
    var OptIn: Boolean
  }

  object StreamProcessorDataSharingPreference {
    @inline
    def apply(
        OptIn: Boolean
    ): StreamProcessorDataSharingPreference = {
      val __obj = js.Dynamic.literal(
        "OptIn" -> OptIn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[StreamProcessorDataSharingPreference]
    }
  }

  /** Information about the source streaming video.
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

  /** The Amazon Simple Notification Service topic to which Amazon Rekognition publishes the object detection results and completion status of a video analysis operation. Amazon Rekognition publishes a notification the first time an object of interest or a person is detected in the video stream. For example, if Amazon Rekognition detects a person at second 2, a pet at second 4, and a person again at second 5, Amazon Rekognition sends 2 object class detected notifications, one for a person at second 2 and one for a pet at second 4. Amazon Rekognition also publishes an an end-of-session notification with a summary when the stream processing session is complete.
    */
  @js.native
  trait StreamProcessorNotificationChannel extends js.Object {
    var SNSTopicArn: SNSTopicArn
  }

  object StreamProcessorNotificationChannel {
    @inline
    def apply(
        SNSTopicArn: SNSTopicArn
    ): StreamProcessorNotificationChannel = {
      val __obj = js.Dynamic.literal(
        "SNSTopicArn" -> SNSTopicArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[StreamProcessorNotificationChannel]
    }
  }

  /** Information about the Amazon Kinesis Data Streams stream to which a Amazon Rekognition Video stream processor streams the results of a video analysis. For more information, see CreateStreamProcessor in the Amazon Rekognition Developer Guide.
    */
  @js.native
  trait StreamProcessorOutput extends js.Object {
    var KinesisDataStream: js.UndefOr[KinesisDataStream]
    var S3Destination: js.UndefOr[S3Destination]
  }

  object StreamProcessorOutput {
    @inline
    def apply(
        KinesisDataStream: js.UndefOr[KinesisDataStream] = js.undefined,
        S3Destination: js.UndefOr[S3Destination] = js.undefined
    ): StreamProcessorOutput = {
      val __obj = js.Dynamic.literal()
      KinesisDataStream.foreach(__v => __obj.updateDynamic("KinesisDataStream")(__v.asInstanceOf[js.Any]))
      S3Destination.foreach(__v => __obj.updateDynamic("S3Destination")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StreamProcessorOutput]
    }
  }

  /** Input parameters used in a streaming video analyzed by a Amazon Rekognition stream processor. You can use <code>FaceSearch</code> to recognize faces in a streaming video, or you can use <code>ConnectedHome</code> to detect labels.
    */
  @js.native
  trait StreamProcessorSettings extends js.Object {
    var ConnectedHome: js.UndefOr[ConnectedHomeSettings]
    var FaceSearch: js.UndefOr[FaceSearchSettings]
  }

  object StreamProcessorSettings {
    @inline
    def apply(
        ConnectedHome: js.UndefOr[ConnectedHomeSettings] = js.undefined,
        FaceSearch: js.UndefOr[FaceSearchSettings] = js.undefined
    ): StreamProcessorSettings = {
      val __obj = js.Dynamic.literal()
      ConnectedHome.foreach(__v => __obj.updateDynamic("ConnectedHome")(__v.asInstanceOf[js.Any]))
      FaceSearch.foreach(__v => __obj.updateDynamic("FaceSearch")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StreamProcessorSettings]
    }
  }

  /** The stream processor settings that you want to update. <code>ConnectedHome</code> settings can be updated to detect different labels with a different minimum confidence.
    */
  @js.native
  trait StreamProcessorSettingsForUpdate extends js.Object {
    var ConnectedHomeForUpdate: js.UndefOr[ConnectedHomeSettingsForUpdate]
  }

  object StreamProcessorSettingsForUpdate {
    @inline
    def apply(
        ConnectedHomeForUpdate: js.UndefOr[ConnectedHomeSettingsForUpdate] = js.undefined
    ): StreamProcessorSettingsForUpdate = {
      val __obj = js.Dynamic.literal()
      ConnectedHomeForUpdate.foreach(__v => __obj.updateDynamic("ConnectedHomeForUpdate")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StreamProcessorSettingsForUpdate]
    }
  }

  /** The S3 bucket that contains the training summary. The training summary includes aggregated evaluation metrics for the entire testing dataset and metrics for each individual label. You get the training summary S3 bucket location by calling <a>DescribeProjectVersions</a>.
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

  /** Indicates whether or not the face is wearing sunglasses, and the confidence level in the determination.
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

  @js.native
  trait TagResourceRequest extends js.Object {
    var ResourceArn: ResourceArn
    var Tags: TagMap
  }

  object TagResourceRequest {
    @inline
    def apply(
        ResourceArn: ResourceArn,
        Tags: TagMap
    ): TagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any],
        "Tags" -> Tags.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[TagResourceRequest]
    }
  }

  @js.native
  trait TagResourceResponse extends js.Object

  object TagResourceResponse {
    @inline
    def apply(): TagResourceResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TagResourceResponse]
    }
  }

  /** Information about a technical cue segment. For more information, see <a>SegmentDetection</a>.
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

  /** The dataset used for testing. Optionally, if <code>AutoCreate</code> is set, Amazon Rekognition Custom Labels uses the training dataset to create a test dataset with a temporary split of the training dataset.
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

  /** Sagemaker Groundtruth format manifest files for the input, output and validation datasets that are used and created during testing.
    */
  @js.native
  trait TestingDataResult extends js.Object {
    var Input: js.UndefOr[TestingData]
    var Output: js.UndefOr[TestingData]
    var Validation: js.UndefOr[ValidationData]
  }

  object TestingDataResult {
    @inline
    def apply(
        Input: js.UndefOr[TestingData] = js.undefined,
        Output: js.UndefOr[TestingData] = js.undefined,
        Validation: js.UndefOr[ValidationData] = js.undefined
    ): TestingDataResult = {
      val __obj = js.Dynamic.literal()
      Input.foreach(__v => __obj.updateDynamic("Input")(__v.asInstanceOf[js.Any]))
      Output.foreach(__v => __obj.updateDynamic("Output")(__v.asInstanceOf[js.Any]))
      Validation.foreach(__v => __obj.updateDynamic("Validation")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TestingDataResult]
    }
  }

  /** Information about a word or line of text detected by <a>DetectText</a>. The <code>DetectedText</code> field contains the text that Amazon Rekognition detected in the image. Every word and line has an identifier (<code>Id</code>). Each word belongs to a line and has a parent identifier (<code>ParentId</code>) that identifies the line of text in which the word appears. The word <code>Id</code> is also an index for the word within a line of words. For more information, see Detecting text in the Amazon Rekognition Developer Guide.
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

  /** Information about text detected in a video. Incudes the detected text, the time in milliseconds from the start of the video that the text was detected, and where it was detected on the screen.
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

  /** The dataset used for training.
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

  /** Sagemaker Groundtruth format manifest files for the input, output and validation datasets that are used and created during testing.
    */
  @js.native
  trait TrainingDataResult extends js.Object {
    var Input: js.UndefOr[TrainingData]
    var Output: js.UndefOr[TrainingData]
    var Validation: js.UndefOr[ValidationData]
  }

  object TrainingDataResult {
    @inline
    def apply(
        Input: js.UndefOr[TrainingData] = js.undefined,
        Output: js.UndefOr[TrainingData] = js.undefined,
        Validation: js.UndefOr[ValidationData] = js.undefined
    ): TrainingDataResult = {
      val __obj = js.Dynamic.literal()
      Input.foreach(__v => __obj.updateDynamic("Input")(__v.asInstanceOf[js.Any]))
      Output.foreach(__v => __obj.updateDynamic("Output")(__v.asInstanceOf[js.Any]))
      Validation.foreach(__v => __obj.updateDynamic("Validation")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TrainingDataResult]
    }
  }

  /** A face that <a>IndexFaces</a> detected, but didn't index. Use the <code>Reasons</code> response attribute to determine why a face wasn't indexed.
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

  @js.native
  trait UntagResourceRequest extends js.Object {
    var ResourceArn: ResourceArn
    var TagKeys: TagKeyList
  }

  object UntagResourceRequest {
    @inline
    def apply(
        ResourceArn: ResourceArn,
        TagKeys: TagKeyList
    ): UntagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any],
        "TagKeys" -> TagKeys.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UntagResourceRequest]
    }
  }

  @js.native
  trait UntagResourceResponse extends js.Object

  object UntagResourceResponse {
    @inline
    def apply(): UntagResourceResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UntagResourceResponse]
    }
  }

  @js.native
  trait UpdateDatasetEntriesRequest extends js.Object {
    var Changes: DatasetChanges
    var DatasetArn: DatasetArn
  }

  object UpdateDatasetEntriesRequest {
    @inline
    def apply(
        Changes: DatasetChanges,
        DatasetArn: DatasetArn
    ): UpdateDatasetEntriesRequest = {
      val __obj = js.Dynamic.literal(
        "Changes" -> Changes.asInstanceOf[js.Any],
        "DatasetArn" -> DatasetArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateDatasetEntriesRequest]
    }
  }

  @js.native
  trait UpdateDatasetEntriesResponse extends js.Object

  object UpdateDatasetEntriesResponse {
    @inline
    def apply(): UpdateDatasetEntriesResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateDatasetEntriesResponse]
    }
  }

  @js.native
  trait UpdateStreamProcessorRequest extends js.Object {
    var Name: StreamProcessorName
    var DataSharingPreferenceForUpdate: js.UndefOr[StreamProcessorDataSharingPreference]
    var ParametersToDelete: js.UndefOr[StreamProcessorParametersToDelete]
    var RegionsOfInterestForUpdate: js.UndefOr[RegionsOfInterest]
    var SettingsForUpdate: js.UndefOr[StreamProcessorSettingsForUpdate]
  }

  object UpdateStreamProcessorRequest {
    @inline
    def apply(
        Name: StreamProcessorName,
        DataSharingPreferenceForUpdate: js.UndefOr[StreamProcessorDataSharingPreference] = js.undefined,
        ParametersToDelete: js.UndefOr[StreamProcessorParametersToDelete] = js.undefined,
        RegionsOfInterestForUpdate: js.UndefOr[RegionsOfInterest] = js.undefined,
        SettingsForUpdate: js.UndefOr[StreamProcessorSettingsForUpdate] = js.undefined
    ): UpdateStreamProcessorRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      DataSharingPreferenceForUpdate.foreach(__v => __obj.updateDynamic("DataSharingPreferenceForUpdate")(__v.asInstanceOf[js.Any]))
      ParametersToDelete.foreach(__v => __obj.updateDynamic("ParametersToDelete")(__v.asInstanceOf[js.Any]))
      RegionsOfInterestForUpdate.foreach(__v => __obj.updateDynamic("RegionsOfInterestForUpdate")(__v.asInstanceOf[js.Any]))
      SettingsForUpdate.foreach(__v => __obj.updateDynamic("SettingsForUpdate")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateStreamProcessorRequest]
    }
  }

  @js.native
  trait UpdateStreamProcessorResponse extends js.Object

  object UpdateStreamProcessorResponse {
    @inline
    def apply(): UpdateStreamProcessorResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateStreamProcessorResponse]
    }
  }

  /** Contains the Amazon S3 bucket location of the validation data for a model training job. The validation data includes error information for individual JSON Lines in the dataset. For more information, see <i>Debugging a Failed Model Training</i> in the Amazon Rekognition Custom Labels Developer Guide. You get the <code>ValidationData</code> object for the training dataset (<a>TrainingDataResult</a>) and the test dataset (<a>TestingDataResult</a>) by calling <a>DescribeProjectVersions</a>. The assets array contains a single <a>Asset</a> object. The <a>GroundTruthManifest</a> field of the Asset object contains the S3 bucket location of the validation data.
    */
  @js.native
  trait ValidationData extends js.Object {
    var Assets: js.UndefOr[Assets]
  }

  object ValidationData {
    @inline
    def apply(
        Assets: js.UndefOr[Assets] = js.undefined
    ): ValidationData = {
      val __obj = js.Dynamic.literal()
      Assets.foreach(__v => __obj.updateDynamic("Assets")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ValidationData]
    }
  }

  /** Video file stored in an Amazon S3 bucket. Amazon Rekognition video start operations such as <a>StartLabelDetection</a> use <code>Video</code> to specify a video for analysis. The supported file formats are .mp4, .mov and .avi.
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

  /** Information about a video that Amazon Rekognition analyzed. <code>Videometadata</code> is returned in every page of paginated responses from a Amazon Rekognition video operation.
    */
  @js.native
  trait VideoMetadata extends js.Object {
    var Codec: js.UndefOr[String]
    var ColorRange: js.UndefOr[VideoColorRange]
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
        ColorRange: js.UndefOr[VideoColorRange] = js.undefined,
        DurationMillis: js.UndefOr[ULong] = js.undefined,
        Format: js.UndefOr[String] = js.undefined,
        FrameHeight: js.UndefOr[ULong] = js.undefined,
        FrameRate: js.UndefOr[Float] = js.undefined,
        FrameWidth: js.UndefOr[ULong] = js.undefined
    ): VideoMetadata = {
      val __obj = js.Dynamic.literal()
      Codec.foreach(__v => __obj.updateDynamic("Codec")(__v.asInstanceOf[js.Any]))
      ColorRange.foreach(__v => __obj.updateDynamic("ColorRange")(__v.asInstanceOf[js.Any]))
      DurationMillis.foreach(__v => __obj.updateDynamic("DurationMillis")(__v.asInstanceOf[js.Any]))
      Format.foreach(__v => __obj.updateDynamic("Format")(__v.asInstanceOf[js.Any]))
      FrameHeight.foreach(__v => __obj.updateDynamic("FrameHeight")(__v.asInstanceOf[js.Any]))
      FrameRate.foreach(__v => __obj.updateDynamic("FrameRate")(__v.asInstanceOf[js.Any]))
      FrameWidth.foreach(__v => __obj.updateDynamic("FrameWidth")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VideoMetadata]
    }
  }
}
