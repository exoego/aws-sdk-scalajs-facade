package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object comprehend {
  type AnyLengthString                            = String
  type BatchItemErrorList                         = js.Array[BatchItemError]
  type ClientRequestTokenString                   = String
  type ComprehendArn                              = String
  type ComprehendArnName                          = String
  type ComprehendEndpointArn                      = String
  type ComprehendEndpointName                     = String
  type ComprehendModelArn                         = String
  type DocumentClassificationJobPropertiesList    = js.Array[DocumentClassificationJobProperties]
  type DocumentClassifierArn                      = String
  type DocumentClassifierEndpointArn              = String
  type DocumentClassifierPropertiesList           = js.Array[DocumentClassifierProperties]
  type DominantLanguageDetectionJobPropertiesList = js.Array[DominantLanguageDetectionJobProperties]
  type EndpointPropertiesList                     = js.Array[EndpointProperties]
  type EntitiesDetectionJobPropertiesList         = js.Array[EntitiesDetectionJobProperties]
  type EntityRecognizerArn                        = String
  type EntityRecognizerMetadataEntityTypesList    = js.Array[EntityRecognizerMetadataEntityTypesListItem]
  type EntityRecognizerPropertiesList             = js.Array[EntityRecognizerProperties]
  type EntityTypeName                             = String
  type EntityTypesList                            = js.Array[EntityTypesListItem]
  type IamRoleArn                                 = String
  type InferenceUnitsInteger                      = Int
  type JobId                                      = String
  type JobName                                    = String
  type KeyPhrasesDetectionJobPropertiesList       = js.Array[KeyPhrasesDetectionJobProperties]
  type KmsKeyId                                   = String
  type LabelDelimiter                             = String
  type ListOfClasses                              = js.Array[DocumentClass]
  type ListOfDetectDominantLanguageResult         = js.Array[BatchDetectDominantLanguageItemResult]
  type ListOfDetectEntitiesResult                 = js.Array[BatchDetectEntitiesItemResult]
  type ListOfDetectKeyPhrasesResult               = js.Array[BatchDetectKeyPhrasesItemResult]
  type ListOfDetectSentimentResult                = js.Array[BatchDetectSentimentItemResult]
  type ListOfDetectSyntaxResult                   = js.Array[BatchDetectSyntaxItemResult]
  type ListOfDominantLanguages                    = js.Array[DominantLanguage]
  type ListOfEntities                             = js.Array[Entity]
  type ListOfKeyPhrases                           = js.Array[KeyPhrase]
  type ListOfLabels                               = js.Array[DocumentLabel]
  type ListOfSyntaxTokens                         = js.Array[SyntaxToken]
  type MaxResultsInteger                          = Int
  type NumberOfTopicsInteger                      = Int
  type S3Uri                                      = String
  type SecurityGroupId                            = String
  type SecurityGroupIds                           = js.Array[SecurityGroupId]
  type SentimentDetectionJobPropertiesList        = js.Array[SentimentDetectionJobProperties]
  type StringList                                 = js.Array[String]
  type SubnetId                                   = String
  type Subnets                                    = js.Array[SubnetId]
  type TagKey                                     = String
  type TagKeyList                                 = js.Array[TagKey]
  type TagList                                    = js.Array[Tag]
  type TagValue                                   = String
  type Timestamp                                  = js.Date
  type TopicsDetectionJobPropertiesList           = js.Array[TopicsDetectionJobProperties]

  implicit final class ComprehendOps(private val service: Comprehend) extends AnyVal {

    @inline def batchDetectDominantLanguageFuture(
        params: BatchDetectDominantLanguageRequest
    ): Future[BatchDetectDominantLanguageResponse] = service.batchDetectDominantLanguage(params).promise().toFuture
    @inline def batchDetectEntitiesFuture(params: BatchDetectEntitiesRequest): Future[BatchDetectEntitiesResponse] =
      service.batchDetectEntities(params).promise().toFuture
    @inline def batchDetectKeyPhrasesFuture(
        params: BatchDetectKeyPhrasesRequest
    ): Future[BatchDetectKeyPhrasesResponse] = service.batchDetectKeyPhrases(params).promise().toFuture
    @inline def batchDetectSentimentFuture(params: BatchDetectSentimentRequest): Future[BatchDetectSentimentResponse] =
      service.batchDetectSentiment(params).promise().toFuture
    @inline def batchDetectSyntaxFuture(params: BatchDetectSyntaxRequest): Future[BatchDetectSyntaxResponse] =
      service.batchDetectSyntax(params).promise().toFuture
    @inline def classifyDocumentFuture(params: ClassifyDocumentRequest): Future[ClassifyDocumentResponse] =
      service.classifyDocument(params).promise().toFuture
    @inline def createDocumentClassifierFuture(
        params: CreateDocumentClassifierRequest
    ): Future[CreateDocumentClassifierResponse] = service.createDocumentClassifier(params).promise().toFuture
    @inline def createEndpointFuture(params: CreateEndpointRequest): Future[CreateEndpointResponse] =
      service.createEndpoint(params).promise().toFuture
    @inline def createEntityRecognizerFuture(
        params: CreateEntityRecognizerRequest
    ): Future[CreateEntityRecognizerResponse] = service.createEntityRecognizer(params).promise().toFuture
    @inline def deleteDocumentClassifierFuture(
        params: DeleteDocumentClassifierRequest
    ): Future[DeleteDocumentClassifierResponse] = service.deleteDocumentClassifier(params).promise().toFuture
    @inline def deleteEndpointFuture(params: DeleteEndpointRequest): Future[DeleteEndpointResponse] =
      service.deleteEndpoint(params).promise().toFuture
    @inline def deleteEntityRecognizerFuture(
        params: DeleteEntityRecognizerRequest
    ): Future[DeleteEntityRecognizerResponse] = service.deleteEntityRecognizer(params).promise().toFuture
    @inline def describeDocumentClassificationJobFuture(
        params: DescribeDocumentClassificationJobRequest
    ): Future[DescribeDocumentClassificationJobResponse] =
      service.describeDocumentClassificationJob(params).promise().toFuture
    @inline def describeDocumentClassifierFuture(
        params: DescribeDocumentClassifierRequest
    ): Future[DescribeDocumentClassifierResponse] = service.describeDocumentClassifier(params).promise().toFuture
    @inline def describeDominantLanguageDetectionJobFuture(
        params: DescribeDominantLanguageDetectionJobRequest
    ): Future[DescribeDominantLanguageDetectionJobResponse] =
      service.describeDominantLanguageDetectionJob(params).promise().toFuture
    @inline def describeEndpointFuture(params: DescribeEndpointRequest): Future[DescribeEndpointResponse] =
      service.describeEndpoint(params).promise().toFuture
    @inline def describeEntitiesDetectionJobFuture(
        params: DescribeEntitiesDetectionJobRequest
    ): Future[DescribeEntitiesDetectionJobResponse] = service.describeEntitiesDetectionJob(params).promise().toFuture
    @inline def describeEntityRecognizerFuture(
        params: DescribeEntityRecognizerRequest
    ): Future[DescribeEntityRecognizerResponse] = service.describeEntityRecognizer(params).promise().toFuture
    @inline def describeKeyPhrasesDetectionJobFuture(
        params: DescribeKeyPhrasesDetectionJobRequest
    ): Future[DescribeKeyPhrasesDetectionJobResponse] =
      service.describeKeyPhrasesDetectionJob(params).promise().toFuture
    @inline def describeSentimentDetectionJobFuture(
        params: DescribeSentimentDetectionJobRequest
    ): Future[DescribeSentimentDetectionJobResponse] = service.describeSentimentDetectionJob(params).promise().toFuture
    @inline def describeTopicsDetectionJobFuture(
        params: DescribeTopicsDetectionJobRequest
    ): Future[DescribeTopicsDetectionJobResponse] = service.describeTopicsDetectionJob(params).promise().toFuture
    @inline def detectDominantLanguageFuture(
        params: DetectDominantLanguageRequest
    ): Future[DetectDominantLanguageResponse] = service.detectDominantLanguage(params).promise().toFuture
    @inline def detectEntitiesFuture(params: DetectEntitiesRequest): Future[DetectEntitiesResponse] =
      service.detectEntities(params).promise().toFuture
    @inline def detectKeyPhrasesFuture(params: DetectKeyPhrasesRequest): Future[DetectKeyPhrasesResponse] =
      service.detectKeyPhrases(params).promise().toFuture
    @inline def detectSentimentFuture(params: DetectSentimentRequest): Future[DetectSentimentResponse] =
      service.detectSentiment(params).promise().toFuture
    @inline def detectSyntaxFuture(params: DetectSyntaxRequest): Future[DetectSyntaxResponse] =
      service.detectSyntax(params).promise().toFuture
    @inline def listDocumentClassificationJobsFuture(
        params: ListDocumentClassificationJobsRequest
    ): Future[ListDocumentClassificationJobsResponse] =
      service.listDocumentClassificationJobs(params).promise().toFuture
    @inline def listDocumentClassifiersFuture(
        params: ListDocumentClassifiersRequest
    ): Future[ListDocumentClassifiersResponse] = service.listDocumentClassifiers(params).promise().toFuture
    @inline def listDominantLanguageDetectionJobsFuture(
        params: ListDominantLanguageDetectionJobsRequest
    ): Future[ListDominantLanguageDetectionJobsResponse] =
      service.listDominantLanguageDetectionJobs(params).promise().toFuture
    @inline def listEndpointsFuture(params: ListEndpointsRequest): Future[ListEndpointsResponse] =
      service.listEndpoints(params).promise().toFuture
    @inline def listEntitiesDetectionJobsFuture(
        params: ListEntitiesDetectionJobsRequest
    ): Future[ListEntitiesDetectionJobsResponse] = service.listEntitiesDetectionJobs(params).promise().toFuture
    @inline def listEntityRecognizersFuture(
        params: ListEntityRecognizersRequest
    ): Future[ListEntityRecognizersResponse] = service.listEntityRecognizers(params).promise().toFuture
    @inline def listKeyPhrasesDetectionJobsFuture(
        params: ListKeyPhrasesDetectionJobsRequest
    ): Future[ListKeyPhrasesDetectionJobsResponse] = service.listKeyPhrasesDetectionJobs(params).promise().toFuture
    @inline def listSentimentDetectionJobsFuture(
        params: ListSentimentDetectionJobsRequest
    ): Future[ListSentimentDetectionJobsResponse] = service.listSentimentDetectionJobs(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] =
      service.listTagsForResource(params).promise().toFuture
    @inline def listTopicsDetectionJobsFuture(
        params: ListTopicsDetectionJobsRequest
    ): Future[ListTopicsDetectionJobsResponse] = service.listTopicsDetectionJobs(params).promise().toFuture
    @inline def startDocumentClassificationJobFuture(
        params: StartDocumentClassificationJobRequest
    ): Future[StartDocumentClassificationJobResponse] =
      service.startDocumentClassificationJob(params).promise().toFuture
    @inline def startDominantLanguageDetectionJobFuture(
        params: StartDominantLanguageDetectionJobRequest
    ): Future[StartDominantLanguageDetectionJobResponse] =
      service.startDominantLanguageDetectionJob(params).promise().toFuture
    @inline def startEntitiesDetectionJobFuture(
        params: StartEntitiesDetectionJobRequest
    ): Future[StartEntitiesDetectionJobResponse] = service.startEntitiesDetectionJob(params).promise().toFuture
    @inline def startKeyPhrasesDetectionJobFuture(
        params: StartKeyPhrasesDetectionJobRequest
    ): Future[StartKeyPhrasesDetectionJobResponse] = service.startKeyPhrasesDetectionJob(params).promise().toFuture
    @inline def startSentimentDetectionJobFuture(
        params: StartSentimentDetectionJobRequest
    ): Future[StartSentimentDetectionJobResponse] = service.startSentimentDetectionJob(params).promise().toFuture
    @inline def startTopicsDetectionJobFuture(
        params: StartTopicsDetectionJobRequest
    ): Future[StartTopicsDetectionJobResponse] = service.startTopicsDetectionJob(params).promise().toFuture
    @inline def stopDominantLanguageDetectionJobFuture(
        params: StopDominantLanguageDetectionJobRequest
    ): Future[StopDominantLanguageDetectionJobResponse] =
      service.stopDominantLanguageDetectionJob(params).promise().toFuture
    @inline def stopEntitiesDetectionJobFuture(
        params: StopEntitiesDetectionJobRequest
    ): Future[StopEntitiesDetectionJobResponse] = service.stopEntitiesDetectionJob(params).promise().toFuture
    @inline def stopKeyPhrasesDetectionJobFuture(
        params: StopKeyPhrasesDetectionJobRequest
    ): Future[StopKeyPhrasesDetectionJobResponse] = service.stopKeyPhrasesDetectionJob(params).promise().toFuture
    @inline def stopSentimentDetectionJobFuture(
        params: StopSentimentDetectionJobRequest
    ): Future[StopSentimentDetectionJobResponse] = service.stopSentimentDetectionJob(params).promise().toFuture
    @inline def stopTrainingDocumentClassifierFuture(
        params: StopTrainingDocumentClassifierRequest
    ): Future[StopTrainingDocumentClassifierResponse] =
      service.stopTrainingDocumentClassifier(params).promise().toFuture
    @inline def stopTrainingEntityRecognizerFuture(
        params: StopTrainingEntityRecognizerRequest
    ): Future[StopTrainingEntityRecognizerResponse] = service.stopTrainingEntityRecognizer(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] =
      service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] =
      service.untagResource(params).promise().toFuture
    @inline def updateEndpointFuture(params: UpdateEndpointRequest): Future[UpdateEndpointResponse] =
      service.updateEndpoint(params).promise().toFuture
  }
}

package comprehend {
  @js.native
  @JSImport("aws-sdk", "Comprehend")
  class Comprehend() extends js.Object {
    def this(config: AWSConfig) = this()

    def batchDetectDominantLanguage(
        params: BatchDetectDominantLanguageRequest
    ): Request[BatchDetectDominantLanguageResponse]                                                         = js.native
    def batchDetectEntities(params: BatchDetectEntitiesRequest): Request[BatchDetectEntitiesResponse]       = js.native
    def batchDetectKeyPhrases(params: BatchDetectKeyPhrasesRequest): Request[BatchDetectKeyPhrasesResponse] = js.native
    def batchDetectSentiment(params: BatchDetectSentimentRequest): Request[BatchDetectSentimentResponse]    = js.native
    def batchDetectSyntax(params: BatchDetectSyntaxRequest): Request[BatchDetectSyntaxResponse]             = js.native
    def classifyDocument(params: ClassifyDocumentRequest): Request[ClassifyDocumentResponse]                = js.native
    def createDocumentClassifier(params: CreateDocumentClassifierRequest): Request[CreateDocumentClassifierResponse] =
      js.native
    def createEndpoint(params: CreateEndpointRequest): Request[CreateEndpointResponse] = js.native
    def createEntityRecognizer(params: CreateEntityRecognizerRequest): Request[CreateEntityRecognizerResponse] =
      js.native
    def deleteDocumentClassifier(params: DeleteDocumentClassifierRequest): Request[DeleteDocumentClassifierResponse] =
      js.native
    def deleteEndpoint(params: DeleteEndpointRequest): Request[DeleteEndpointResponse] = js.native
    def deleteEntityRecognizer(params: DeleteEntityRecognizerRequest): Request[DeleteEntityRecognizerResponse] =
      js.native
    def describeDocumentClassificationJob(
        params: DescribeDocumentClassificationJobRequest
    ): Request[DescribeDocumentClassificationJobResponse] = js.native
    def describeDocumentClassifier(
        params: DescribeDocumentClassifierRequest
    ): Request[DescribeDocumentClassifierResponse] = js.native
    def describeDominantLanguageDetectionJob(
        params: DescribeDominantLanguageDetectionJobRequest
    ): Request[DescribeDominantLanguageDetectionJobResponse]                                 = js.native
    def describeEndpoint(params: DescribeEndpointRequest): Request[DescribeEndpointResponse] = js.native
    def describeEntitiesDetectionJob(
        params: DescribeEntitiesDetectionJobRequest
    ): Request[DescribeEntitiesDetectionJobResponse] = js.native
    def describeEntityRecognizer(params: DescribeEntityRecognizerRequest): Request[DescribeEntityRecognizerResponse] =
      js.native
    def describeKeyPhrasesDetectionJob(
        params: DescribeKeyPhrasesDetectionJobRequest
    ): Request[DescribeKeyPhrasesDetectionJobResponse] = js.native
    def describeSentimentDetectionJob(
        params: DescribeSentimentDetectionJobRequest
    ): Request[DescribeSentimentDetectionJobResponse] = js.native
    def describeTopicsDetectionJob(
        params: DescribeTopicsDetectionJobRequest
    ): Request[DescribeTopicsDetectionJobResponse] = js.native
    def detectDominantLanguage(params: DetectDominantLanguageRequest): Request[DetectDominantLanguageResponse] =
      js.native
    def detectEntities(params: DetectEntitiesRequest): Request[DetectEntitiesResponse]       = js.native
    def detectKeyPhrases(params: DetectKeyPhrasesRequest): Request[DetectKeyPhrasesResponse] = js.native
    def detectSentiment(params: DetectSentimentRequest): Request[DetectSentimentResponse]    = js.native
    def detectSyntax(params: DetectSyntaxRequest): Request[DetectSyntaxResponse]             = js.native
    def listDocumentClassificationJobs(
        params: ListDocumentClassificationJobsRequest
    ): Request[ListDocumentClassificationJobsResponse] = js.native
    def listDocumentClassifiers(params: ListDocumentClassifiersRequest): Request[ListDocumentClassifiersResponse] =
      js.native
    def listDominantLanguageDetectionJobs(
        params: ListDominantLanguageDetectionJobsRequest
    ): Request[ListDominantLanguageDetectionJobsResponse]                           = js.native
    def listEndpoints(params: ListEndpointsRequest): Request[ListEndpointsResponse] = js.native
    def listEntitiesDetectionJobs(
        params: ListEntitiesDetectionJobsRequest
    ): Request[ListEntitiesDetectionJobsResponse]                                                           = js.native
    def listEntityRecognizers(params: ListEntityRecognizersRequest): Request[ListEntityRecognizersResponse] = js.native
    def listKeyPhrasesDetectionJobs(
        params: ListKeyPhrasesDetectionJobsRequest
    ): Request[ListKeyPhrasesDetectionJobsResponse] = js.native
    def listSentimentDetectionJobs(
        params: ListSentimentDetectionJobsRequest
    ): Request[ListSentimentDetectionJobsResponse]                                                    = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def listTopicsDetectionJobs(params: ListTopicsDetectionJobsRequest): Request[ListTopicsDetectionJobsResponse] =
      js.native
    def startDocumentClassificationJob(
        params: StartDocumentClassificationJobRequest
    ): Request[StartDocumentClassificationJobResponse] = js.native
    def startDominantLanguageDetectionJob(
        params: StartDominantLanguageDetectionJobRequest
    ): Request[StartDominantLanguageDetectionJobResponse] = js.native
    def startEntitiesDetectionJob(
        params: StartEntitiesDetectionJobRequest
    ): Request[StartEntitiesDetectionJobResponse] = js.native
    def startKeyPhrasesDetectionJob(
        params: StartKeyPhrasesDetectionJobRequest
    ): Request[StartKeyPhrasesDetectionJobResponse] = js.native
    def startSentimentDetectionJob(
        params: StartSentimentDetectionJobRequest
    ): Request[StartSentimentDetectionJobResponse] = js.native
    def startTopicsDetectionJob(params: StartTopicsDetectionJobRequest): Request[StartTopicsDetectionJobResponse] =
      js.native
    def stopDominantLanguageDetectionJob(
        params: StopDominantLanguageDetectionJobRequest
    ): Request[StopDominantLanguageDetectionJobResponse] = js.native
    def stopEntitiesDetectionJob(params: StopEntitiesDetectionJobRequest): Request[StopEntitiesDetectionJobResponse] =
      js.native
    def stopKeyPhrasesDetectionJob(
        params: StopKeyPhrasesDetectionJobRequest
    ): Request[StopKeyPhrasesDetectionJobResponse] = js.native
    def stopSentimentDetectionJob(
        params: StopSentimentDetectionJobRequest
    ): Request[StopSentimentDetectionJobResponse] = js.native
    def stopTrainingDocumentClassifier(
        params: StopTrainingDocumentClassifierRequest
    ): Request[StopTrainingDocumentClassifierResponse] = js.native
    def stopTrainingEntityRecognizer(
        params: StopTrainingEntityRecognizerRequest
    ): Request[StopTrainingEntityRecognizerResponse]                                   = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse]          = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse]    = js.native
    def updateEndpoint(params: UpdateEndpointRequest): Request[UpdateEndpointResponse] = js.native
  }

  /**
    * The result of calling the operation. The operation returns one object for each document that is successfully processed by the operation.
    */
  @js.native
  @Factory
  trait BatchDetectDominantLanguageItemResult extends js.Object {
    var Index: js.UndefOr[Int]
    var Languages: js.UndefOr[ListOfDominantLanguages]
  }

  @js.native
  @Factory
  trait BatchDetectDominantLanguageRequest extends js.Object {
    var TextList: StringList
  }

  @js.native
  @Factory
  trait BatchDetectDominantLanguageResponse extends js.Object {
    var ErrorList: BatchItemErrorList
    var ResultList: ListOfDetectDominantLanguageResult
  }

  /**
    * The result of calling the operation. The operation returns one object for each document that is successfully processed by the operation.
    */
  @js.native
  @Factory
  trait BatchDetectEntitiesItemResult extends js.Object {
    var Entities: js.UndefOr[ListOfEntities]
    var Index: js.UndefOr[Int]
  }

  @js.native
  @Factory
  trait BatchDetectEntitiesRequest extends js.Object {
    var LanguageCode: LanguageCode
    var TextList: StringList
  }

  @js.native
  @Factory
  trait BatchDetectEntitiesResponse extends js.Object {
    var ErrorList: BatchItemErrorList
    var ResultList: ListOfDetectEntitiesResult
  }

  /**
    * The result of calling the operation. The operation returns one object for each document that is successfully processed by the operation.
    */
  @js.native
  @Factory
  trait BatchDetectKeyPhrasesItemResult extends js.Object {
    var Index: js.UndefOr[Int]
    var KeyPhrases: js.UndefOr[ListOfKeyPhrases]
  }

  @js.native
  @Factory
  trait BatchDetectKeyPhrasesRequest extends js.Object {
    var LanguageCode: LanguageCode
    var TextList: StringList
  }

  @js.native
  @Factory
  trait BatchDetectKeyPhrasesResponse extends js.Object {
    var ErrorList: BatchItemErrorList
    var ResultList: ListOfDetectKeyPhrasesResult
  }

  /**
    * The result of calling the operation. The operation returns one object for each document that is successfully processed by the operation.
    */
  @js.native
  @Factory
  trait BatchDetectSentimentItemResult extends js.Object {
    var Index: js.UndefOr[Int]
    var Sentiment: js.UndefOr[SentimentType]
    var SentimentScore: js.UndefOr[SentimentScore]
  }

  @js.native
  @Factory
  trait BatchDetectSentimentRequest extends js.Object {
    var LanguageCode: LanguageCode
    var TextList: StringList
  }

  @js.native
  @Factory
  trait BatchDetectSentimentResponse extends js.Object {
    var ErrorList: BatchItemErrorList
    var ResultList: ListOfDetectSentimentResult
  }

  /**
    * The result of calling the operation. The operation returns one object that is successfully processed by the operation.
    */
  @js.native
  @Factory
  trait BatchDetectSyntaxItemResult extends js.Object {
    var Index: js.UndefOr[Int]
    var SyntaxTokens: js.UndefOr[ListOfSyntaxTokens]
  }

  @js.native
  @Factory
  trait BatchDetectSyntaxRequest extends js.Object {
    var LanguageCode: SyntaxLanguageCode
    var TextList: StringList
  }

  @js.native
  @Factory
  trait BatchDetectSyntaxResponse extends js.Object {
    var ErrorList: BatchItemErrorList
    var ResultList: ListOfDetectSyntaxResult
  }

  /**
    * Describes an error that occurred while processing a document in a batch. The operation returns on <code>BatchItemError</code> object for each document that contained an error.
    */
  @js.native
  @Factory
  trait BatchItemError extends js.Object {
    var ErrorCode: js.UndefOr[String]
    var ErrorMessage: js.UndefOr[String]
    var Index: js.UndefOr[Int]
  }

  /**
    * Describes the result metrics for the test data associated with an documentation classifier.
    */
  @js.native
  @Factory
  trait ClassifierEvaluationMetrics extends js.Object {
    var Accuracy: js.UndefOr[Double]
    var F1Score: js.UndefOr[Double]
    var HammingLoss: js.UndefOr[Double]
    var MicroF1Score: js.UndefOr[Double]
    var MicroPrecision: js.UndefOr[Double]
    var MicroRecall: js.UndefOr[Double]
    var Precision: js.UndefOr[Double]
    var Recall: js.UndefOr[Double]
  }

  /**
    * Provides information about a document classifier.
    */
  @js.native
  @Factory
  trait ClassifierMetadata extends js.Object {
    var EvaluationMetrics: js.UndefOr[ClassifierEvaluationMetrics]
    var NumberOfLabels: js.UndefOr[Int]
    var NumberOfTestDocuments: js.UndefOr[Int]
    var NumberOfTrainedDocuments: js.UndefOr[Int]
  }

  @js.native
  @Factory
  trait ClassifyDocumentRequest extends js.Object {
    var EndpointArn: DocumentClassifierEndpointArn
    var Text: String
  }

  @js.native
  @Factory
  trait ClassifyDocumentResponse extends js.Object {
    var Classes: js.UndefOr[ListOfClasses]
    var Labels: js.UndefOr[ListOfLabels]
  }

  @js.native
  @Factory
  trait CreateDocumentClassifierRequest extends js.Object {
    var DataAccessRoleArn: IamRoleArn
    var DocumentClassifierName: ComprehendArnName
    var InputDataConfig: DocumentClassifierInputDataConfig
    var LanguageCode: LanguageCode
    var ClientRequestToken: js.UndefOr[ClientRequestTokenString]
    var Mode: js.UndefOr[DocumentClassifierMode]
    var OutputDataConfig: js.UndefOr[DocumentClassifierOutputDataConfig]
    var Tags: js.UndefOr[TagList]
    var VolumeKmsKeyId: js.UndefOr[KmsKeyId]
    var VpcConfig: js.UndefOr[VpcConfig]
  }

  @js.native
  @Factory
  trait CreateDocumentClassifierResponse extends js.Object {
    var DocumentClassifierArn: js.UndefOr[DocumentClassifierArn]
  }

  @js.native
  @Factory
  trait CreateEndpointRequest extends js.Object {
    var DesiredInferenceUnits: InferenceUnitsInteger
    var EndpointName: ComprehendEndpointName
    var ModelArn: ComprehendModelArn
    var ClientRequestToken: js.UndefOr[ClientRequestTokenString]
    var Tags: js.UndefOr[TagList]
  }

  @js.native
  @Factory
  trait CreateEndpointResponse extends js.Object {
    var EndpointArn: js.UndefOr[ComprehendEndpointArn]
  }

  @js.native
  @Factory
  trait CreateEntityRecognizerRequest extends js.Object {
    var DataAccessRoleArn: IamRoleArn
    var InputDataConfig: EntityRecognizerInputDataConfig
    var LanguageCode: LanguageCode
    var RecognizerName: ComprehendArnName
    var ClientRequestToken: js.UndefOr[ClientRequestTokenString]
    var Tags: js.UndefOr[TagList]
    var VolumeKmsKeyId: js.UndefOr[KmsKeyId]
    var VpcConfig: js.UndefOr[VpcConfig]
  }

  @js.native
  @Factory
  trait CreateEntityRecognizerResponse extends js.Object {
    var EntityRecognizerArn: js.UndefOr[EntityRecognizerArn]
  }

  @js.native
  @Factory
  trait DeleteDocumentClassifierRequest extends js.Object {
    var DocumentClassifierArn: DocumentClassifierArn
  }

  @js.native
  @Factory
  trait DeleteDocumentClassifierResponse extends js.Object {}

  @js.native
  @Factory
  trait DeleteEndpointRequest extends js.Object {
    var EndpointArn: ComprehendEndpointArn
  }

  @js.native
  @Factory
  trait DeleteEndpointResponse extends js.Object {}

  @js.native
  @Factory
  trait DeleteEntityRecognizerRequest extends js.Object {
    var EntityRecognizerArn: EntityRecognizerArn
  }

  @js.native
  @Factory
  trait DeleteEntityRecognizerResponse extends js.Object {}

  @js.native
  @Factory
  trait DescribeDocumentClassificationJobRequest extends js.Object {
    var JobId: JobId
  }

  @js.native
  @Factory
  trait DescribeDocumentClassificationJobResponse extends js.Object {
    var DocumentClassificationJobProperties: js.UndefOr[DocumentClassificationJobProperties]
  }

  @js.native
  @Factory
  trait DescribeDocumentClassifierRequest extends js.Object {
    var DocumentClassifierArn: DocumentClassifierArn
  }

  @js.native
  @Factory
  trait DescribeDocumentClassifierResponse extends js.Object {
    var DocumentClassifierProperties: js.UndefOr[DocumentClassifierProperties]
  }

  @js.native
  @Factory
  trait DescribeDominantLanguageDetectionJobRequest extends js.Object {
    var JobId: JobId
  }

  @js.native
  @Factory
  trait DescribeDominantLanguageDetectionJobResponse extends js.Object {
    var DominantLanguageDetectionJobProperties: js.UndefOr[DominantLanguageDetectionJobProperties]
  }

  @js.native
  @Factory
  trait DescribeEndpointRequest extends js.Object {
    var EndpointArn: ComprehendEndpointArn
  }

  @js.native
  @Factory
  trait DescribeEndpointResponse extends js.Object {
    var EndpointProperties: js.UndefOr[EndpointProperties]
  }

  @js.native
  @Factory
  trait DescribeEntitiesDetectionJobRequest extends js.Object {
    var JobId: JobId
  }

  @js.native
  @Factory
  trait DescribeEntitiesDetectionJobResponse extends js.Object {
    var EntitiesDetectionJobProperties: js.UndefOr[EntitiesDetectionJobProperties]
  }

  @js.native
  @Factory
  trait DescribeEntityRecognizerRequest extends js.Object {
    var EntityRecognizerArn: EntityRecognizerArn
  }

  @js.native
  @Factory
  trait DescribeEntityRecognizerResponse extends js.Object {
    var EntityRecognizerProperties: js.UndefOr[EntityRecognizerProperties]
  }

  @js.native
  @Factory
  trait DescribeKeyPhrasesDetectionJobRequest extends js.Object {
    var JobId: JobId
  }

  @js.native
  @Factory
  trait DescribeKeyPhrasesDetectionJobResponse extends js.Object {
    var KeyPhrasesDetectionJobProperties: js.UndefOr[KeyPhrasesDetectionJobProperties]
  }

  @js.native
  @Factory
  trait DescribeSentimentDetectionJobRequest extends js.Object {
    var JobId: JobId
  }

  @js.native
  @Factory
  trait DescribeSentimentDetectionJobResponse extends js.Object {
    var SentimentDetectionJobProperties: js.UndefOr[SentimentDetectionJobProperties]
  }

  @js.native
  @Factory
  trait DescribeTopicsDetectionJobRequest extends js.Object {
    var JobId: JobId
  }

  @js.native
  @Factory
  trait DescribeTopicsDetectionJobResponse extends js.Object {
    var TopicsDetectionJobProperties: js.UndefOr[TopicsDetectionJobProperties]
  }

  @js.native
  @Factory
  trait DetectDominantLanguageRequest extends js.Object {
    var Text: String
  }

  @js.native
  @Factory
  trait DetectDominantLanguageResponse extends js.Object {
    var Languages: js.UndefOr[ListOfDominantLanguages]
  }

  @js.native
  @Factory
  trait DetectEntitiesRequest extends js.Object {
    var LanguageCode: LanguageCode
    var Text: String
  }

  @js.native
  @Factory
  trait DetectEntitiesResponse extends js.Object {
    var Entities: js.UndefOr[ListOfEntities]
  }

  @js.native
  @Factory
  trait DetectKeyPhrasesRequest extends js.Object {
    var LanguageCode: LanguageCode
    var Text: String
  }

  @js.native
  @Factory
  trait DetectKeyPhrasesResponse extends js.Object {
    var KeyPhrases: js.UndefOr[ListOfKeyPhrases]
  }

  @js.native
  @Factory
  trait DetectSentimentRequest extends js.Object {
    var LanguageCode: LanguageCode
    var Text: String
  }

  @js.native
  @Factory
  trait DetectSentimentResponse extends js.Object {
    var Sentiment: js.UndefOr[SentimentType]
    var SentimentScore: js.UndefOr[SentimentScore]
  }

  @js.native
  @Factory
  trait DetectSyntaxRequest extends js.Object {
    var LanguageCode: SyntaxLanguageCode
    var Text: String
  }

  @js.native
  @Factory
  trait DetectSyntaxResponse extends js.Object {
    var SyntaxTokens: js.UndefOr[ListOfSyntaxTokens]
  }

  /**
    * Specifies the class that categorizes the document being analyzed
    */
  @js.native
  @Factory
  trait DocumentClass extends js.Object {
    var Name: js.UndefOr[String]
    var Score: js.UndefOr[Float]
  }

  /**
    * Provides information for filtering a list of document classification jobs. For more information, see the operation. You can provide only one filter parameter in each request.
    */
  @js.native
  @Factory
  trait DocumentClassificationJobFilter extends js.Object {
    var JobName: js.UndefOr[JobName]
    var JobStatus: js.UndefOr[JobStatus]
    var SubmitTimeAfter: js.UndefOr[Timestamp]
    var SubmitTimeBefore: js.UndefOr[Timestamp]
  }

  /**
    * Provides information about a document classification job.
    */
  @js.native
  @Factory
  trait DocumentClassificationJobProperties extends js.Object {
    var DataAccessRoleArn: js.UndefOr[IamRoleArn]
    var DocumentClassifierArn: js.UndefOr[DocumentClassifierArn]
    var EndTime: js.UndefOr[Timestamp]
    var InputDataConfig: js.UndefOr[InputDataConfig]
    var JobId: js.UndefOr[JobId]
    var JobName: js.UndefOr[JobName]
    var JobStatus: js.UndefOr[JobStatus]
    var Message: js.UndefOr[AnyLengthString]
    var OutputDataConfig: js.UndefOr[OutputDataConfig]
    var SubmitTime: js.UndefOr[Timestamp]
    var VolumeKmsKeyId: js.UndefOr[KmsKeyId]
    var VpcConfig: js.UndefOr[VpcConfig]
  }

  /**
    * Provides information for filtering a list of document classifiers. You can only specify one filtering parameter in a request. For more information, see the operation.
    */
  @js.native
  @Factory
  trait DocumentClassifierFilter extends js.Object {
    var Status: js.UndefOr[ModelStatus]
    var SubmitTimeAfter: js.UndefOr[Timestamp]
    var SubmitTimeBefore: js.UndefOr[Timestamp]
  }

  /**
    * The input properties for training a document classifier.
    *  For more information on how the input file is formatted, see <a>how-document-classification-training-data</a>.
    */
  @js.native
  @Factory
  trait DocumentClassifierInputDataConfig extends js.Object {
    var S3Uri: S3Uri
    var LabelDelimiter: js.UndefOr[LabelDelimiter]
  }

  @js.native
  sealed trait DocumentClassifierMode extends js.Any
  object DocumentClassifierMode extends js.Object {
    val MULTI_CLASS = "MULTI_CLASS".asInstanceOf[DocumentClassifierMode]
    val MULTI_LABEL = "MULTI_LABEL".asInstanceOf[DocumentClassifierMode]

    val values = js.Object.freeze(js.Array(MULTI_CLASS, MULTI_LABEL))
  }

  /**
    * Provides output results configuration parameters for custom classifier jobs.
    */
  @js.native
  @Factory
  trait DocumentClassifierOutputDataConfig extends js.Object {
    var KmsKeyId: js.UndefOr[KmsKeyId]
    var S3Uri: js.UndefOr[S3Uri]
  }

  /**
    * Provides information about a document classifier.
    */
  @js.native
  @Factory
  trait DocumentClassifierProperties extends js.Object {
    var ClassifierMetadata: js.UndefOr[ClassifierMetadata]
    var DataAccessRoleArn: js.UndefOr[IamRoleArn]
    var DocumentClassifierArn: js.UndefOr[DocumentClassifierArn]
    var EndTime: js.UndefOr[Timestamp]
    var InputDataConfig: js.UndefOr[DocumentClassifierInputDataConfig]
    var LanguageCode: js.UndefOr[LanguageCode]
    var Message: js.UndefOr[AnyLengthString]
    var Mode: js.UndefOr[DocumentClassifierMode]
    var OutputDataConfig: js.UndefOr[DocumentClassifierOutputDataConfig]
    var Status: js.UndefOr[ModelStatus]
    var SubmitTime: js.UndefOr[Timestamp]
    var TrainingEndTime: js.UndefOr[Timestamp]
    var TrainingStartTime: js.UndefOr[Timestamp]
    var VolumeKmsKeyId: js.UndefOr[KmsKeyId]
    var VpcConfig: js.UndefOr[VpcConfig]
  }

  /**
    * Specifies one of the label or labels that categorize the document being analyzed.
    */
  @js.native
  @Factory
  trait DocumentLabel extends js.Object {
    var Name: js.UndefOr[String]
    var Score: js.UndefOr[Float]
  }

  /**
    * Returns the code for the dominant language in the input text and the level of confidence that Amazon Comprehend has in the accuracy of the detection.
    */
  @js.native
  @Factory
  trait DominantLanguage extends js.Object {
    var LanguageCode: js.UndefOr[String]
    var Score: js.UndefOr[Float]
  }

  /**
    * Provides information for filtering a list of dominant language detection jobs. For more information, see the operation.
    */
  @js.native
  @Factory
  trait DominantLanguageDetectionJobFilter extends js.Object {
    var JobName: js.UndefOr[JobName]
    var JobStatus: js.UndefOr[JobStatus]
    var SubmitTimeAfter: js.UndefOr[Timestamp]
    var SubmitTimeBefore: js.UndefOr[Timestamp]
  }

  /**
    * Provides information about a dominant language detection job.
    */
  @js.native
  @Factory
  trait DominantLanguageDetectionJobProperties extends js.Object {
    var DataAccessRoleArn: js.UndefOr[IamRoleArn]
    var EndTime: js.UndefOr[Timestamp]
    var InputDataConfig: js.UndefOr[InputDataConfig]
    var JobId: js.UndefOr[JobId]
    var JobName: js.UndefOr[JobName]
    var JobStatus: js.UndefOr[JobStatus]
    var Message: js.UndefOr[AnyLengthString]
    var OutputDataConfig: js.UndefOr[OutputDataConfig]
    var SubmitTime: js.UndefOr[Timestamp]
    var VolumeKmsKeyId: js.UndefOr[KmsKeyId]
    var VpcConfig: js.UndefOr[VpcConfig]
  }

  /**
    * The filter used to determine which endpoints are are returned. You can filter jobs on their name, model, status, or the date and time that they were created. You can only set one filter at a time.
    */
  @js.native
  @Factory
  trait EndpointFilter extends js.Object {
    var CreationTimeAfter: js.UndefOr[Timestamp]
    var CreationTimeBefore: js.UndefOr[Timestamp]
    var ModelArn: js.UndefOr[ComprehendModelArn]
    var Status: js.UndefOr[EndpointStatus]
  }

  /**
    * Specifies information about the specified endpoint.
    */
  @js.native
  @Factory
  trait EndpointProperties extends js.Object {
    var CreationTime: js.UndefOr[Timestamp]
    var CurrentInferenceUnits: js.UndefOr[InferenceUnitsInteger]
    var DesiredInferenceUnits: js.UndefOr[InferenceUnitsInteger]
    var EndpointArn: js.UndefOr[ComprehendEndpointArn]
    var LastModifiedTime: js.UndefOr[Timestamp]
    var Message: js.UndefOr[AnyLengthString]
    var ModelArn: js.UndefOr[ComprehendModelArn]
    var Status: js.UndefOr[EndpointStatus]
  }

  @js.native
  sealed trait EndpointStatus extends js.Any
  object EndpointStatus extends js.Object {
    val CREATING   = "CREATING".asInstanceOf[EndpointStatus]
    val DELETING   = "DELETING".asInstanceOf[EndpointStatus]
    val FAILED     = "FAILED".asInstanceOf[EndpointStatus]
    val IN_SERVICE = "IN_SERVICE".asInstanceOf[EndpointStatus]
    val UPDATING   = "UPDATING".asInstanceOf[EndpointStatus]

    val values = js.Object.freeze(js.Array(CREATING, DELETING, FAILED, IN_SERVICE, UPDATING))
  }

  /**
    * Provides information for filtering a list of dominant language detection jobs. For more information, see the operation.
    */
  @js.native
  @Factory
  trait EntitiesDetectionJobFilter extends js.Object {
    var JobName: js.UndefOr[JobName]
    var JobStatus: js.UndefOr[JobStatus]
    var SubmitTimeAfter: js.UndefOr[Timestamp]
    var SubmitTimeBefore: js.UndefOr[Timestamp]
  }

  /**
    * Provides information about an entities detection job.
    */
  @js.native
  @Factory
  trait EntitiesDetectionJobProperties extends js.Object {
    var DataAccessRoleArn: js.UndefOr[IamRoleArn]
    var EndTime: js.UndefOr[Timestamp]
    var EntityRecognizerArn: js.UndefOr[EntityRecognizerArn]
    var InputDataConfig: js.UndefOr[InputDataConfig]
    var JobId: js.UndefOr[JobId]
    var JobName: js.UndefOr[JobName]
    var JobStatus: js.UndefOr[JobStatus]
    var LanguageCode: js.UndefOr[LanguageCode]
    var Message: js.UndefOr[AnyLengthString]
    var OutputDataConfig: js.UndefOr[OutputDataConfig]
    var SubmitTime: js.UndefOr[Timestamp]
    var VolumeKmsKeyId: js.UndefOr[KmsKeyId]
    var VpcConfig: js.UndefOr[VpcConfig]
  }

  /**
    * Provides information about an entity.
    */
  @js.native
  @Factory
  trait Entity extends js.Object {
    var BeginOffset: js.UndefOr[Int]
    var EndOffset: js.UndefOr[Int]
    var Score: js.UndefOr[Float]
    var Text: js.UndefOr[String]
    var Type: js.UndefOr[EntityType]
  }

  /**
    * Describes the annotations associated with a entity recognizer.
    */
  @js.native
  @Factory
  trait EntityRecognizerAnnotations extends js.Object {
    var S3Uri: S3Uri
  }

  /**
    * Describes the training documents submitted with an entity recognizer.
    */
  @js.native
  @Factory
  trait EntityRecognizerDocuments extends js.Object {
    var S3Uri: S3Uri
  }

  /**
    * Describes the entity recognizer submitted with an entity recognizer.
    */
  @js.native
  @Factory
  trait EntityRecognizerEntityList extends js.Object {
    var S3Uri: S3Uri
  }

  /**
    * Detailed information about the accuracy of an entity recognizer.
    */
  @js.native
  @Factory
  trait EntityRecognizerEvaluationMetrics extends js.Object {
    var F1Score: js.UndefOr[Double]
    var Precision: js.UndefOr[Double]
    var Recall: js.UndefOr[Double]
  }

  /**
    * Provides information for filtering a list of entity recognizers. You can only specify one filtering parameter in a request. For more information, see the operation./&gt;
    */
  @js.native
  @Factory
  trait EntityRecognizerFilter extends js.Object {
    var Status: js.UndefOr[ModelStatus]
    var SubmitTimeAfter: js.UndefOr[Timestamp]
    var SubmitTimeBefore: js.UndefOr[Timestamp]
  }

  /**
    * Specifies the format and location of the input data.
    */
  @js.native
  @Factory
  trait EntityRecognizerInputDataConfig extends js.Object {
    var Documents: EntityRecognizerDocuments
    var EntityTypes: EntityTypesList
    var Annotations: js.UndefOr[EntityRecognizerAnnotations]
    var EntityList: js.UndefOr[EntityRecognizerEntityList]
  }

  /**
    * Detailed information about an entity recognizer.
    */
  @js.native
  @Factory
  trait EntityRecognizerMetadata extends js.Object {
    var EntityTypes: js.UndefOr[EntityRecognizerMetadataEntityTypesList]
    var EvaluationMetrics: js.UndefOr[EntityRecognizerEvaluationMetrics]
    var NumberOfTestDocuments: js.UndefOr[Int]
    var NumberOfTrainedDocuments: js.UndefOr[Int]
  }

  /**
    * Individual item from the list of entity types in the metadata of an entity recognizer.
    */
  @js.native
  @Factory
  trait EntityRecognizerMetadataEntityTypesListItem extends js.Object {
    var EvaluationMetrics: js.UndefOr[EntityTypesEvaluationMetrics]
    var NumberOfTrainMentions: js.UndefOr[Int]
    var Type: js.UndefOr[AnyLengthString]
  }

  /**
    * Describes information about an entity recognizer.
    */
  @js.native
  @Factory
  trait EntityRecognizerProperties extends js.Object {
    var DataAccessRoleArn: js.UndefOr[IamRoleArn]
    var EndTime: js.UndefOr[Timestamp]
    var EntityRecognizerArn: js.UndefOr[EntityRecognizerArn]
    var InputDataConfig: js.UndefOr[EntityRecognizerInputDataConfig]
    var LanguageCode: js.UndefOr[LanguageCode]
    var Message: js.UndefOr[AnyLengthString]
    var RecognizerMetadata: js.UndefOr[EntityRecognizerMetadata]
    var Status: js.UndefOr[ModelStatus]
    var SubmitTime: js.UndefOr[Timestamp]
    var TrainingEndTime: js.UndefOr[Timestamp]
    var TrainingStartTime: js.UndefOr[Timestamp]
    var VolumeKmsKeyId: js.UndefOr[KmsKeyId]
    var VpcConfig: js.UndefOr[VpcConfig]
  }

  @js.native
  sealed trait EntityType extends js.Any
  object EntityType extends js.Object {
    val PERSON          = "PERSON".asInstanceOf[EntityType]
    val LOCATION        = "LOCATION".asInstanceOf[EntityType]
    val ORGANIZATION    = "ORGANIZATION".asInstanceOf[EntityType]
    val COMMERCIAL_ITEM = "COMMERCIAL_ITEM".asInstanceOf[EntityType]
    val EVENT           = "EVENT".asInstanceOf[EntityType]
    val DATE            = "DATE".asInstanceOf[EntityType]
    val QUANTITY        = "QUANTITY".asInstanceOf[EntityType]
    val TITLE           = "TITLE".asInstanceOf[EntityType]
    val OTHER           = "OTHER".asInstanceOf[EntityType]

    val values =
      js.Object.freeze(js.Array(PERSON, LOCATION, ORGANIZATION, COMMERCIAL_ITEM, EVENT, DATE, QUANTITY, TITLE, OTHER))
  }

  /**
    * Detailed information about the accuracy of an entity recognizer for a specific entity type.
    */
  @js.native
  @Factory
  trait EntityTypesEvaluationMetrics extends js.Object {
    var F1Score: js.UndefOr[Double]
    var Precision: js.UndefOr[Double]
    var Recall: js.UndefOr[Double]
  }

  /**
    * Information about an individual item on a list of entity types.
    */
  @js.native
  @Factory
  trait EntityTypesListItem extends js.Object {
    var Type: EntityTypeName
  }

  /**
    * The input properties for a topic detection job.
    */
  @js.native
  @Factory
  trait InputDataConfig extends js.Object {
    var S3Uri: S3Uri
    var InputFormat: js.UndefOr[InputFormat]
  }

  @js.native
  sealed trait InputFormat extends js.Any
  object InputFormat extends js.Object {
    val ONE_DOC_PER_FILE = "ONE_DOC_PER_FILE".asInstanceOf[InputFormat]
    val ONE_DOC_PER_LINE = "ONE_DOC_PER_LINE".asInstanceOf[InputFormat]

    val values = js.Object.freeze(js.Array(ONE_DOC_PER_FILE, ONE_DOC_PER_LINE))
  }

  @js.native
  sealed trait JobStatus extends js.Any
  object JobStatus extends js.Object {
    val SUBMITTED      = "SUBMITTED".asInstanceOf[JobStatus]
    val IN_PROGRESS    = "IN_PROGRESS".asInstanceOf[JobStatus]
    val COMPLETED      = "COMPLETED".asInstanceOf[JobStatus]
    val FAILED         = "FAILED".asInstanceOf[JobStatus]
    val STOP_REQUESTED = "STOP_REQUESTED".asInstanceOf[JobStatus]
    val STOPPED        = "STOPPED".asInstanceOf[JobStatus]

    val values = js.Object.freeze(js.Array(SUBMITTED, IN_PROGRESS, COMPLETED, FAILED, STOP_REQUESTED, STOPPED))
  }

  /**
    * Describes a key noun phrase.
    */
  @js.native
  @Factory
  trait KeyPhrase extends js.Object {
    var BeginOffset: js.UndefOr[Int]
    var EndOffset: js.UndefOr[Int]
    var Score: js.UndefOr[Float]
    var Text: js.UndefOr[String]
  }

  /**
    * Provides information for filtering a list of dominant language detection jobs. For more information, see the operation.
    */
  @js.native
  @Factory
  trait KeyPhrasesDetectionJobFilter extends js.Object {
    var JobName: js.UndefOr[JobName]
    var JobStatus: js.UndefOr[JobStatus]
    var SubmitTimeAfter: js.UndefOr[Timestamp]
    var SubmitTimeBefore: js.UndefOr[Timestamp]
  }

  /**
    * Provides information about a key phrases detection job.
    */
  @js.native
  @Factory
  trait KeyPhrasesDetectionJobProperties extends js.Object {
    var DataAccessRoleArn: js.UndefOr[IamRoleArn]
    var EndTime: js.UndefOr[Timestamp]
    var InputDataConfig: js.UndefOr[InputDataConfig]
    var JobId: js.UndefOr[JobId]
    var JobName: js.UndefOr[JobName]
    var JobStatus: js.UndefOr[JobStatus]
    var LanguageCode: js.UndefOr[LanguageCode]
    var Message: js.UndefOr[AnyLengthString]
    var OutputDataConfig: js.UndefOr[OutputDataConfig]
    var SubmitTime: js.UndefOr[Timestamp]
    var VolumeKmsKeyId: js.UndefOr[KmsKeyId]
    var VpcConfig: js.UndefOr[VpcConfig]
  }

  @js.native
  sealed trait LanguageCode extends js.Any
  object LanguageCode extends js.Object {
    val en      = "en".asInstanceOf[LanguageCode]
    val es      = "es".asInstanceOf[LanguageCode]
    val fr      = "fr".asInstanceOf[LanguageCode]
    val de      = "de".asInstanceOf[LanguageCode]
    val it      = "it".asInstanceOf[LanguageCode]
    val pt      = "pt".asInstanceOf[LanguageCode]
    val ar      = "ar".asInstanceOf[LanguageCode]
    val hi      = "hi".asInstanceOf[LanguageCode]
    val ja      = "ja".asInstanceOf[LanguageCode]
    val ko      = "ko".asInstanceOf[LanguageCode]
    val zh      = "zh".asInstanceOf[LanguageCode]
    val `zh-TW` = "zh-TW".asInstanceOf[LanguageCode]

    val values = js.Object.freeze(js.Array(en, es, fr, de, it, pt, ar, hi, ja, ko, zh, `zh-TW`))
  }

  @js.native
  @Factory
  trait ListDocumentClassificationJobsRequest extends js.Object {
    var Filter: js.UndefOr[DocumentClassificationJobFilter]
    var MaxResults: js.UndefOr[MaxResultsInteger]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait ListDocumentClassificationJobsResponse extends js.Object {
    var DocumentClassificationJobPropertiesList: js.UndefOr[DocumentClassificationJobPropertiesList]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait ListDocumentClassifiersRequest extends js.Object {
    var Filter: js.UndefOr[DocumentClassifierFilter]
    var MaxResults: js.UndefOr[MaxResultsInteger]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait ListDocumentClassifiersResponse extends js.Object {
    var DocumentClassifierPropertiesList: js.UndefOr[DocumentClassifierPropertiesList]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait ListDominantLanguageDetectionJobsRequest extends js.Object {
    var Filter: js.UndefOr[DominantLanguageDetectionJobFilter]
    var MaxResults: js.UndefOr[MaxResultsInteger]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait ListDominantLanguageDetectionJobsResponse extends js.Object {
    var DominantLanguageDetectionJobPropertiesList: js.UndefOr[DominantLanguageDetectionJobPropertiesList]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait ListEndpointsRequest extends js.Object {
    var Filter: js.UndefOr[EndpointFilter]
    var MaxResults: js.UndefOr[MaxResultsInteger]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait ListEndpointsResponse extends js.Object {
    var EndpointPropertiesList: js.UndefOr[EndpointPropertiesList]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait ListEntitiesDetectionJobsRequest extends js.Object {
    var Filter: js.UndefOr[EntitiesDetectionJobFilter]
    var MaxResults: js.UndefOr[MaxResultsInteger]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait ListEntitiesDetectionJobsResponse extends js.Object {
    var EntitiesDetectionJobPropertiesList: js.UndefOr[EntitiesDetectionJobPropertiesList]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait ListEntityRecognizersRequest extends js.Object {
    var Filter: js.UndefOr[EntityRecognizerFilter]
    var MaxResults: js.UndefOr[MaxResultsInteger]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait ListEntityRecognizersResponse extends js.Object {
    var EntityRecognizerPropertiesList: js.UndefOr[EntityRecognizerPropertiesList]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait ListKeyPhrasesDetectionJobsRequest extends js.Object {
    var Filter: js.UndefOr[KeyPhrasesDetectionJobFilter]
    var MaxResults: js.UndefOr[MaxResultsInteger]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait ListKeyPhrasesDetectionJobsResponse extends js.Object {
    var KeyPhrasesDetectionJobPropertiesList: js.UndefOr[KeyPhrasesDetectionJobPropertiesList]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait ListSentimentDetectionJobsRequest extends js.Object {
    var Filter: js.UndefOr[SentimentDetectionJobFilter]
    var MaxResults: js.UndefOr[MaxResultsInteger]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait ListSentimentDetectionJobsResponse extends js.Object {
    var NextToken: js.UndefOr[String]
    var SentimentDetectionJobPropertiesList: js.UndefOr[SentimentDetectionJobPropertiesList]
  }

  @js.native
  @Factory
  trait ListTagsForResourceRequest extends js.Object {
    var ResourceArn: ComprehendArn
  }

  @js.native
  @Factory
  trait ListTagsForResourceResponse extends js.Object {
    var ResourceArn: js.UndefOr[ComprehendArn]
    var Tags: js.UndefOr[TagList]
  }

  @js.native
  @Factory
  trait ListTopicsDetectionJobsRequest extends js.Object {
    var Filter: js.UndefOr[TopicsDetectionJobFilter]
    var MaxResults: js.UndefOr[MaxResultsInteger]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait ListTopicsDetectionJobsResponse extends js.Object {
    var NextToken: js.UndefOr[String]
    var TopicsDetectionJobPropertiesList: js.UndefOr[TopicsDetectionJobPropertiesList]
  }

  @js.native
  sealed trait ModelStatus extends js.Any
  object ModelStatus extends js.Object {
    val SUBMITTED      = "SUBMITTED".asInstanceOf[ModelStatus]
    val TRAINING       = "TRAINING".asInstanceOf[ModelStatus]
    val DELETING       = "DELETING".asInstanceOf[ModelStatus]
    val STOP_REQUESTED = "STOP_REQUESTED".asInstanceOf[ModelStatus]
    val STOPPED        = "STOPPED".asInstanceOf[ModelStatus]
    val IN_ERROR       = "IN_ERROR".asInstanceOf[ModelStatus]
    val TRAINED        = "TRAINED".asInstanceOf[ModelStatus]

    val values = js.Object.freeze(js.Array(SUBMITTED, TRAINING, DELETING, STOP_REQUESTED, STOPPED, IN_ERROR, TRAINED))
  }

  /**
    * Provides configuration parameters for the output of topic detection jobs.
    *  <p/>
    */
  @js.native
  @Factory
  trait OutputDataConfig extends js.Object {
    var S3Uri: S3Uri
    var KmsKeyId: js.UndefOr[KmsKeyId]
  }

  /**
    * Identifies the part of speech represented by the token and gives the confidence that Amazon Comprehend has that the part of speech was correctly identified. For more information about the parts of speech that Amazon Comprehend can identify, see <a>how-syntax</a>.
    */
  @js.native
  @Factory
  trait PartOfSpeechTag extends js.Object {
    var Score: js.UndefOr[Float]
    var Tag: js.UndefOr[PartOfSpeechTagType]
  }

  @js.native
  sealed trait PartOfSpeechTagType extends js.Any
  object PartOfSpeechTagType extends js.Object {
    val ADJ   = "ADJ".asInstanceOf[PartOfSpeechTagType]
    val ADP   = "ADP".asInstanceOf[PartOfSpeechTagType]
    val ADV   = "ADV".asInstanceOf[PartOfSpeechTagType]
    val AUX   = "AUX".asInstanceOf[PartOfSpeechTagType]
    val CONJ  = "CONJ".asInstanceOf[PartOfSpeechTagType]
    val CCONJ = "CCONJ".asInstanceOf[PartOfSpeechTagType]
    val DET   = "DET".asInstanceOf[PartOfSpeechTagType]
    val INTJ  = "INTJ".asInstanceOf[PartOfSpeechTagType]
    val NOUN  = "NOUN".asInstanceOf[PartOfSpeechTagType]
    val NUM   = "NUM".asInstanceOf[PartOfSpeechTagType]
    val O     = "O".asInstanceOf[PartOfSpeechTagType]
    val PART  = "PART".asInstanceOf[PartOfSpeechTagType]
    val PRON  = "PRON".asInstanceOf[PartOfSpeechTagType]
    val PROPN = "PROPN".asInstanceOf[PartOfSpeechTagType]
    val PUNCT = "PUNCT".asInstanceOf[PartOfSpeechTagType]
    val SCONJ = "SCONJ".asInstanceOf[PartOfSpeechTagType]
    val SYM   = "SYM".asInstanceOf[PartOfSpeechTagType]
    val VERB  = "VERB".asInstanceOf[PartOfSpeechTagType]

    val values = js.Object.freeze(
      js.Array(ADJ, ADP, ADV, AUX, CONJ, CCONJ, DET, INTJ, NOUN, NUM, O, PART, PRON, PROPN, PUNCT, SCONJ, SYM, VERB)
    )
  }

  /**
    * Provides information for filtering a list of dominant language detection jobs. For more information, see the operation.
    */
  @js.native
  @Factory
  trait SentimentDetectionJobFilter extends js.Object {
    var JobName: js.UndefOr[JobName]
    var JobStatus: js.UndefOr[JobStatus]
    var SubmitTimeAfter: js.UndefOr[Timestamp]
    var SubmitTimeBefore: js.UndefOr[Timestamp]
  }

  /**
    * Provides information about a sentiment detection job.
    */
  @js.native
  @Factory
  trait SentimentDetectionJobProperties extends js.Object {
    var DataAccessRoleArn: js.UndefOr[IamRoleArn]
    var EndTime: js.UndefOr[Timestamp]
    var InputDataConfig: js.UndefOr[InputDataConfig]
    var JobId: js.UndefOr[JobId]
    var JobName: js.UndefOr[JobName]
    var JobStatus: js.UndefOr[JobStatus]
    var LanguageCode: js.UndefOr[LanguageCode]
    var Message: js.UndefOr[AnyLengthString]
    var OutputDataConfig: js.UndefOr[OutputDataConfig]
    var SubmitTime: js.UndefOr[Timestamp]
    var VolumeKmsKeyId: js.UndefOr[KmsKeyId]
    var VpcConfig: js.UndefOr[VpcConfig]
  }

  /**
    * Describes the level of confidence that Amazon Comprehend has in the accuracy of its detection of sentiments.
    */
  @js.native
  @Factory
  trait SentimentScore extends js.Object {
    var Mixed: js.UndefOr[Float]
    var Negative: js.UndefOr[Float]
    var Neutral: js.UndefOr[Float]
    var Positive: js.UndefOr[Float]
  }

  @js.native
  sealed trait SentimentType extends js.Any
  object SentimentType extends js.Object {
    val POSITIVE = "POSITIVE".asInstanceOf[SentimentType]
    val NEGATIVE = "NEGATIVE".asInstanceOf[SentimentType]
    val NEUTRAL  = "NEUTRAL".asInstanceOf[SentimentType]
    val MIXED    = "MIXED".asInstanceOf[SentimentType]

    val values = js.Object.freeze(js.Array(POSITIVE, NEGATIVE, NEUTRAL, MIXED))
  }

  @js.native
  @Factory
  trait StartDocumentClassificationJobRequest extends js.Object {
    var DataAccessRoleArn: IamRoleArn
    var DocumentClassifierArn: DocumentClassifierArn
    var InputDataConfig: InputDataConfig
    var OutputDataConfig: OutputDataConfig
    var ClientRequestToken: js.UndefOr[ClientRequestTokenString]
    var JobName: js.UndefOr[JobName]
    var VolumeKmsKeyId: js.UndefOr[KmsKeyId]
    var VpcConfig: js.UndefOr[VpcConfig]
  }

  @js.native
  @Factory
  trait StartDocumentClassificationJobResponse extends js.Object {
    var JobId: js.UndefOr[JobId]
    var JobStatus: js.UndefOr[JobStatus]
  }

  @js.native
  @Factory
  trait StartDominantLanguageDetectionJobRequest extends js.Object {
    var DataAccessRoleArn: IamRoleArn
    var InputDataConfig: InputDataConfig
    var OutputDataConfig: OutputDataConfig
    var ClientRequestToken: js.UndefOr[ClientRequestTokenString]
    var JobName: js.UndefOr[JobName]
    var VolumeKmsKeyId: js.UndefOr[KmsKeyId]
    var VpcConfig: js.UndefOr[VpcConfig]
  }

  @js.native
  @Factory
  trait StartDominantLanguageDetectionJobResponse extends js.Object {
    var JobId: js.UndefOr[JobId]
    var JobStatus: js.UndefOr[JobStatus]
  }

  @js.native
  @Factory
  trait StartEntitiesDetectionJobRequest extends js.Object {
    var DataAccessRoleArn: IamRoleArn
    var InputDataConfig: InputDataConfig
    var LanguageCode: LanguageCode
    var OutputDataConfig: OutputDataConfig
    var ClientRequestToken: js.UndefOr[ClientRequestTokenString]
    var EntityRecognizerArn: js.UndefOr[EntityRecognizerArn]
    var JobName: js.UndefOr[JobName]
    var VolumeKmsKeyId: js.UndefOr[KmsKeyId]
    var VpcConfig: js.UndefOr[VpcConfig]
  }

  @js.native
  @Factory
  trait StartEntitiesDetectionJobResponse extends js.Object {
    var JobId: js.UndefOr[JobId]
    var JobStatus: js.UndefOr[JobStatus]
  }

  @js.native
  @Factory
  trait StartKeyPhrasesDetectionJobRequest extends js.Object {
    var DataAccessRoleArn: IamRoleArn
    var InputDataConfig: InputDataConfig
    var LanguageCode: LanguageCode
    var OutputDataConfig: OutputDataConfig
    var ClientRequestToken: js.UndefOr[ClientRequestTokenString]
    var JobName: js.UndefOr[JobName]
    var VolumeKmsKeyId: js.UndefOr[KmsKeyId]
    var VpcConfig: js.UndefOr[VpcConfig]
  }

  @js.native
  @Factory
  trait StartKeyPhrasesDetectionJobResponse extends js.Object {
    var JobId: js.UndefOr[JobId]
    var JobStatus: js.UndefOr[JobStatus]
  }

  @js.native
  @Factory
  trait StartSentimentDetectionJobRequest extends js.Object {
    var DataAccessRoleArn: IamRoleArn
    var InputDataConfig: InputDataConfig
    var LanguageCode: LanguageCode
    var OutputDataConfig: OutputDataConfig
    var ClientRequestToken: js.UndefOr[ClientRequestTokenString]
    var JobName: js.UndefOr[JobName]
    var VolumeKmsKeyId: js.UndefOr[KmsKeyId]
    var VpcConfig: js.UndefOr[VpcConfig]
  }

  @js.native
  @Factory
  trait StartSentimentDetectionJobResponse extends js.Object {
    var JobId: js.UndefOr[JobId]
    var JobStatus: js.UndefOr[JobStatus]
  }

  @js.native
  @Factory
  trait StartTopicsDetectionJobRequest extends js.Object {
    var DataAccessRoleArn: IamRoleArn
    var InputDataConfig: InputDataConfig
    var OutputDataConfig: OutputDataConfig
    var ClientRequestToken: js.UndefOr[ClientRequestTokenString]
    var JobName: js.UndefOr[JobName]
    var NumberOfTopics: js.UndefOr[NumberOfTopicsInteger]
    var VolumeKmsKeyId: js.UndefOr[KmsKeyId]
    var VpcConfig: js.UndefOr[VpcConfig]
  }

  @js.native
  @Factory
  trait StartTopicsDetectionJobResponse extends js.Object {
    var JobId: js.UndefOr[JobId]
    var JobStatus: js.UndefOr[JobStatus]
  }

  @js.native
  @Factory
  trait StopDominantLanguageDetectionJobRequest extends js.Object {
    var JobId: JobId
  }

  @js.native
  @Factory
  trait StopDominantLanguageDetectionJobResponse extends js.Object {
    var JobId: js.UndefOr[JobId]
    var JobStatus: js.UndefOr[JobStatus]
  }

  @js.native
  @Factory
  trait StopEntitiesDetectionJobRequest extends js.Object {
    var JobId: JobId
  }

  @js.native
  @Factory
  trait StopEntitiesDetectionJobResponse extends js.Object {
    var JobId: js.UndefOr[JobId]
    var JobStatus: js.UndefOr[JobStatus]
  }

  @js.native
  @Factory
  trait StopKeyPhrasesDetectionJobRequest extends js.Object {
    var JobId: JobId
  }

  @js.native
  @Factory
  trait StopKeyPhrasesDetectionJobResponse extends js.Object {
    var JobId: js.UndefOr[JobId]
    var JobStatus: js.UndefOr[JobStatus]
  }

  @js.native
  @Factory
  trait StopSentimentDetectionJobRequest extends js.Object {
    var JobId: JobId
  }

  @js.native
  @Factory
  trait StopSentimentDetectionJobResponse extends js.Object {
    var JobId: js.UndefOr[JobId]
    var JobStatus: js.UndefOr[JobStatus]
  }

  @js.native
  @Factory
  trait StopTrainingDocumentClassifierRequest extends js.Object {
    var DocumentClassifierArn: DocumentClassifierArn
  }

  @js.native
  @Factory
  trait StopTrainingDocumentClassifierResponse extends js.Object {}

  @js.native
  @Factory
  trait StopTrainingEntityRecognizerRequest extends js.Object {
    var EntityRecognizerArn: EntityRecognizerArn
  }

  @js.native
  @Factory
  trait StopTrainingEntityRecognizerResponse extends js.Object {}

  @js.native
  sealed trait SyntaxLanguageCode extends js.Any
  object SyntaxLanguageCode extends js.Object {
    val en = "en".asInstanceOf[SyntaxLanguageCode]
    val es = "es".asInstanceOf[SyntaxLanguageCode]
    val fr = "fr".asInstanceOf[SyntaxLanguageCode]
    val de = "de".asInstanceOf[SyntaxLanguageCode]
    val it = "it".asInstanceOf[SyntaxLanguageCode]
    val pt = "pt".asInstanceOf[SyntaxLanguageCode]

    val values = js.Object.freeze(js.Array(en, es, fr, de, it, pt))
  }

  /**
    * Represents a work in the input text that was recognized and assigned a part of speech. There is one syntax token record for each word in the source text.
    */
  @js.native
  @Factory
  trait SyntaxToken extends js.Object {
    var BeginOffset: js.UndefOr[Int]
    var EndOffset: js.UndefOr[Int]
    var PartOfSpeech: js.UndefOr[PartOfSpeechTag]
    var Text: js.UndefOr[String]
    var TokenId: js.UndefOr[Int]
  }

  /**
    * A key-value pair that adds as a metadata to a resource used by Amazon Comprehend. For example, a tag with the key-value pair ‘Department’:’Sales’ might be added to a resource to indicate its use by a particular department.
    */
  @js.native
  @Factory
  trait Tag extends js.Object {
    var Key: TagKey
    var Value: js.UndefOr[TagValue]
  }

  @js.native
  @Factory
  trait TagResourceRequest extends js.Object {
    var ResourceArn: ComprehendArn
    var Tags: TagList
  }

  @js.native
  @Factory
  trait TagResourceResponse extends js.Object {}

  /**
    * Provides information for filtering topic detection jobs. For more information, see .
    */
  @js.native
  @Factory
  trait TopicsDetectionJobFilter extends js.Object {
    var JobName: js.UndefOr[JobName]
    var JobStatus: js.UndefOr[JobStatus]
    var SubmitTimeAfter: js.UndefOr[Timestamp]
    var SubmitTimeBefore: js.UndefOr[Timestamp]
  }

  /**
    * Provides information about a topic detection job.
    */
  @js.native
  @Factory
  trait TopicsDetectionJobProperties extends js.Object {
    var DataAccessRoleArn: js.UndefOr[IamRoleArn]
    var EndTime: js.UndefOr[Timestamp]
    var InputDataConfig: js.UndefOr[InputDataConfig]
    var JobId: js.UndefOr[JobId]
    var JobName: js.UndefOr[JobName]
    var JobStatus: js.UndefOr[JobStatus]
    var Message: js.UndefOr[AnyLengthString]
    var NumberOfTopics: js.UndefOr[Int]
    var OutputDataConfig: js.UndefOr[OutputDataConfig]
    var SubmitTime: js.UndefOr[Timestamp]
    var VolumeKmsKeyId: js.UndefOr[KmsKeyId]
    var VpcConfig: js.UndefOr[VpcConfig]
  }

  @js.native
  @Factory
  trait UntagResourceRequest extends js.Object {
    var ResourceArn: ComprehendArn
    var TagKeys: TagKeyList
  }

  @js.native
  @Factory
  trait UntagResourceResponse extends js.Object {}

  @js.native
  @Factory
  trait UpdateEndpointRequest extends js.Object {
    var DesiredInferenceUnits: InferenceUnitsInteger
    var EndpointArn: ComprehendEndpointArn
  }

  @js.native
  @Factory
  trait UpdateEndpointResponse extends js.Object {}

  /**
    * Configuration parameters for an optional private Virtual Private Cloud (VPC) containing the resources you are using for the job. For For more information, see [[https://docs.aws.amazon.com/vpc/latest/userguide/what-is-amazon-vpc.html|Amazon VPC]].
    */
  @js.native
  @Factory
  trait VpcConfig extends js.Object {
    var SecurityGroupIds: SecurityGroupIds
    var Subnets: Subnets
  }
}
