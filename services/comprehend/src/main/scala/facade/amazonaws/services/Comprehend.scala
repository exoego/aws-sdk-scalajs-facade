package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import io.scalajs.nodejs
import facade.amazonaws._

package object comprehend {
  type AnyLengthString                            = String
  type BatchItemErrorList                         = js.Array[BatchItemError]
  type ClientRequestTokenString                   = String
  type ComprehendArn                              = String
  type ComprehendArnName                          = String
  type DocumentClassificationJobPropertiesList    = js.Array[DocumentClassificationJobProperties]
  type DocumentClassifierArn                      = String
  type DocumentClassifierPropertiesList           = js.Array[DocumentClassifierProperties]
  type DominantLanguageDetectionJobPropertiesList = js.Array[DominantLanguageDetectionJobProperties]
  type EntitiesDetectionJobPropertiesList         = js.Array[EntitiesDetectionJobProperties]
  type EntityRecognizerArn                        = String
  type EntityRecognizerMetadataEntityTypesList    = js.Array[EntityRecognizerMetadataEntityTypesListItem]
  type EntityRecognizerPropertiesList             = js.Array[EntityRecognizerProperties]
  type EntityType                                 = String
  type EntityTypeName                             = String
  type EntityTypesList                            = js.Array[EntityTypesListItem]
  type IamRoleArn                                 = String
  type InputFormat                                = String
  type JobId                                      = String
  type JobName                                    = String
  type JobStatus                                  = String
  type KeyPhrasesDetectionJobPropertiesList       = js.Array[KeyPhrasesDetectionJobProperties]
  type KmsKeyId                                   = String
  type LanguageCode                               = String
  type ListOfDetectDominantLanguageResult         = js.Array[BatchDetectDominantLanguageItemResult]
  type ListOfDetectEntitiesResult                 = js.Array[BatchDetectEntitiesItemResult]
  type ListOfDetectKeyPhrasesResult               = js.Array[BatchDetectKeyPhrasesItemResult]
  type ListOfDetectSentimentResult                = js.Array[BatchDetectSentimentItemResult]
  type ListOfDetectSyntaxResult                   = js.Array[BatchDetectSyntaxItemResult]
  type ListOfDominantLanguages                    = js.Array[DominantLanguage]
  type ListOfEntities                             = js.Array[Entity]
  type ListOfKeyPhrases                           = js.Array[KeyPhrase]
  type ListOfSyntaxTokens                         = js.Array[SyntaxToken]
  type MaxResultsInteger                          = Int
  type ModelStatus                                = String
  type NumberOfTopicsInteger                      = Int
  type PartOfSpeechTagType                        = String
  type S3Uri                                      = String
  type SecurityGroupId                            = String
  type SecurityGroupIds                           = js.Array[SecurityGroupId]
  type SentimentDetectionJobPropertiesList        = js.Array[SentimentDetectionJobProperties]
  type SentimentType                              = String
  type StringList                                 = js.Array[String]
  type SubnetId                                   = String
  type Subnets                                    = js.Array[SubnetId]
  type SyntaxLanguageCode                         = String
  type TagKey                                     = String
  type TagKeyList                                 = js.Array[TagKey]
  type TagList                                    = js.Array[Tag]
  type TagValue                                   = String
  type Timestamp                                  = js.Date
  type TopicsDetectionJobPropertiesList           = js.Array[TopicsDetectionJobProperties]

  implicit final class ComprehendOps(val service: Comprehend) extends AnyVal {

    def batchDetectDominantLanguageFuture(
        params: BatchDetectDominantLanguageRequest
    ): Future[BatchDetectDominantLanguageResponse] = service.batchDetectDominantLanguage(params).promise.toFuture
    def batchDetectEntitiesFuture(params: BatchDetectEntitiesRequest): Future[BatchDetectEntitiesResponse] =
      service.batchDetectEntities(params).promise.toFuture
    def batchDetectKeyPhrasesFuture(params: BatchDetectKeyPhrasesRequest): Future[BatchDetectKeyPhrasesResponse] =
      service.batchDetectKeyPhrases(params).promise.toFuture
    def batchDetectSentimentFuture(params: BatchDetectSentimentRequest): Future[BatchDetectSentimentResponse] =
      service.batchDetectSentiment(params).promise.toFuture
    def batchDetectSyntaxFuture(params: BatchDetectSyntaxRequest): Future[BatchDetectSyntaxResponse] =
      service.batchDetectSyntax(params).promise.toFuture
    def createDocumentClassifierFuture(
        params: CreateDocumentClassifierRequest
    ): Future[CreateDocumentClassifierResponse] = service.createDocumentClassifier(params).promise.toFuture
    def createEntityRecognizerFuture(params: CreateEntityRecognizerRequest): Future[CreateEntityRecognizerResponse] =
      service.createEntityRecognizer(params).promise.toFuture
    def deleteDocumentClassifierFuture(
        params: DeleteDocumentClassifierRequest
    ): Future[DeleteDocumentClassifierResponse] = service.deleteDocumentClassifier(params).promise.toFuture
    def deleteEntityRecognizerFuture(params: DeleteEntityRecognizerRequest): Future[DeleteEntityRecognizerResponse] =
      service.deleteEntityRecognizer(params).promise.toFuture
    def describeDocumentClassificationJobFuture(
        params: DescribeDocumentClassificationJobRequest
    ): Future[DescribeDocumentClassificationJobResponse] =
      service.describeDocumentClassificationJob(params).promise.toFuture
    def describeDocumentClassifierFuture(
        params: DescribeDocumentClassifierRequest
    ): Future[DescribeDocumentClassifierResponse] = service.describeDocumentClassifier(params).promise.toFuture
    def describeDominantLanguageDetectionJobFuture(
        params: DescribeDominantLanguageDetectionJobRequest
    ): Future[DescribeDominantLanguageDetectionJobResponse] =
      service.describeDominantLanguageDetectionJob(params).promise.toFuture
    def describeEntitiesDetectionJobFuture(
        params: DescribeEntitiesDetectionJobRequest
    ): Future[DescribeEntitiesDetectionJobResponse] = service.describeEntitiesDetectionJob(params).promise.toFuture
    def describeEntityRecognizerFuture(
        params: DescribeEntityRecognizerRequest
    ): Future[DescribeEntityRecognizerResponse] = service.describeEntityRecognizer(params).promise.toFuture
    def describeKeyPhrasesDetectionJobFuture(
        params: DescribeKeyPhrasesDetectionJobRequest
    ): Future[DescribeKeyPhrasesDetectionJobResponse] = service.describeKeyPhrasesDetectionJob(params).promise.toFuture
    def describeSentimentDetectionJobFuture(
        params: DescribeSentimentDetectionJobRequest
    ): Future[DescribeSentimentDetectionJobResponse] = service.describeSentimentDetectionJob(params).promise.toFuture
    def describeTopicsDetectionJobFuture(
        params: DescribeTopicsDetectionJobRequest
    ): Future[DescribeTopicsDetectionJobResponse] = service.describeTopicsDetectionJob(params).promise.toFuture
    def detectDominantLanguageFuture(params: DetectDominantLanguageRequest): Future[DetectDominantLanguageResponse] =
      service.detectDominantLanguage(params).promise.toFuture
    def detectEntitiesFuture(params: DetectEntitiesRequest): Future[DetectEntitiesResponse] =
      service.detectEntities(params).promise.toFuture
    def detectKeyPhrasesFuture(params: DetectKeyPhrasesRequest): Future[DetectKeyPhrasesResponse] =
      service.detectKeyPhrases(params).promise.toFuture
    def detectSentimentFuture(params: DetectSentimentRequest): Future[DetectSentimentResponse] =
      service.detectSentiment(params).promise.toFuture
    def detectSyntaxFuture(params: DetectSyntaxRequest): Future[DetectSyntaxResponse] =
      service.detectSyntax(params).promise.toFuture
    def listDocumentClassificationJobsFuture(
        params: ListDocumentClassificationJobsRequest
    ): Future[ListDocumentClassificationJobsResponse] = service.listDocumentClassificationJobs(params).promise.toFuture
    def listDocumentClassifiersFuture(params: ListDocumentClassifiersRequest): Future[ListDocumentClassifiersResponse] =
      service.listDocumentClassifiers(params).promise.toFuture
    def listDominantLanguageDetectionJobsFuture(
        params: ListDominantLanguageDetectionJobsRequest
    ): Future[ListDominantLanguageDetectionJobsResponse] =
      service.listDominantLanguageDetectionJobs(params).promise.toFuture
    def listEntitiesDetectionJobsFuture(
        params: ListEntitiesDetectionJobsRequest
    ): Future[ListEntitiesDetectionJobsResponse] = service.listEntitiesDetectionJobs(params).promise.toFuture
    def listEntityRecognizersFuture(params: ListEntityRecognizersRequest): Future[ListEntityRecognizersResponse] =
      service.listEntityRecognizers(params).promise.toFuture
    def listKeyPhrasesDetectionJobsFuture(
        params: ListKeyPhrasesDetectionJobsRequest
    ): Future[ListKeyPhrasesDetectionJobsResponse] = service.listKeyPhrasesDetectionJobs(params).promise.toFuture
    def listSentimentDetectionJobsFuture(
        params: ListSentimentDetectionJobsRequest
    ): Future[ListSentimentDetectionJobsResponse] = service.listSentimentDetectionJobs(params).promise.toFuture
    def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] =
      service.listTagsForResource(params).promise.toFuture
    def listTopicsDetectionJobsFuture(params: ListTopicsDetectionJobsRequest): Future[ListTopicsDetectionJobsResponse] =
      service.listTopicsDetectionJobs(params).promise.toFuture
    def startDocumentClassificationJobFuture(
        params: StartDocumentClassificationJobRequest
    ): Future[StartDocumentClassificationJobResponse] = service.startDocumentClassificationJob(params).promise.toFuture
    def startDominantLanguageDetectionJobFuture(
        params: StartDominantLanguageDetectionJobRequest
    ): Future[StartDominantLanguageDetectionJobResponse] =
      service.startDominantLanguageDetectionJob(params).promise.toFuture
    def startEntitiesDetectionJobFuture(
        params: StartEntitiesDetectionJobRequest
    ): Future[StartEntitiesDetectionJobResponse] = service.startEntitiesDetectionJob(params).promise.toFuture
    def startKeyPhrasesDetectionJobFuture(
        params: StartKeyPhrasesDetectionJobRequest
    ): Future[StartKeyPhrasesDetectionJobResponse] = service.startKeyPhrasesDetectionJob(params).promise.toFuture
    def startSentimentDetectionJobFuture(
        params: StartSentimentDetectionJobRequest
    ): Future[StartSentimentDetectionJobResponse] = service.startSentimentDetectionJob(params).promise.toFuture
    def startTopicsDetectionJobFuture(params: StartTopicsDetectionJobRequest): Future[StartTopicsDetectionJobResponse] =
      service.startTopicsDetectionJob(params).promise.toFuture
    def stopDominantLanguageDetectionJobFuture(
        params: StopDominantLanguageDetectionJobRequest
    ): Future[StopDominantLanguageDetectionJobResponse] =
      service.stopDominantLanguageDetectionJob(params).promise.toFuture
    def stopEntitiesDetectionJobFuture(
        params: StopEntitiesDetectionJobRequest
    ): Future[StopEntitiesDetectionJobResponse] = service.stopEntitiesDetectionJob(params).promise.toFuture
    def stopKeyPhrasesDetectionJobFuture(
        params: StopKeyPhrasesDetectionJobRequest
    ): Future[StopKeyPhrasesDetectionJobResponse] = service.stopKeyPhrasesDetectionJob(params).promise.toFuture
    def stopSentimentDetectionJobFuture(
        params: StopSentimentDetectionJobRequest
    ): Future[StopSentimentDetectionJobResponse] = service.stopSentimentDetectionJob(params).promise.toFuture
    def stopTrainingDocumentClassifierFuture(
        params: StopTrainingDocumentClassifierRequest
    ): Future[StopTrainingDocumentClassifierResponse] = service.stopTrainingDocumentClassifier(params).promise.toFuture
    def stopTrainingEntityRecognizerFuture(
        params: StopTrainingEntityRecognizerRequest
    ): Future[StopTrainingEntityRecognizerResponse] = service.stopTrainingEntityRecognizer(params).promise.toFuture
    def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] =
      service.tagResource(params).promise.toFuture
    def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] =
      service.untagResource(params).promise.toFuture
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
    def createDocumentClassifier(params: CreateDocumentClassifierRequest): Request[CreateDocumentClassifierResponse] =
      js.native
    def createEntityRecognizer(params: CreateEntityRecognizerRequest): Request[CreateEntityRecognizerResponse] =
      js.native
    def deleteDocumentClassifier(params: DeleteDocumentClassifierRequest): Request[DeleteDocumentClassifierResponse] =
      js.native
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
    ): Request[DescribeDominantLanguageDetectionJobResponse] = js.native
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
    ): Request[ListDominantLanguageDetectionJobsResponse] = js.native
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
    ): Request[StopTrainingEntityRecognizerResponse]                                = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse]       = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse] = js.native
  }

  /**
    * The result of calling the operation. The operation returns one object for each document that is successfully processed by the operation.
    */
  @js.native
  trait BatchDetectDominantLanguageItemResult extends js.Object {
    var Index: js.UndefOr[Int]
    var Languages: js.UndefOr[ListOfDominantLanguages]
  }

  object BatchDetectDominantLanguageItemResult {
    def apply(
        Index: js.UndefOr[Int] = js.undefined,
        Languages: js.UndefOr[ListOfDominantLanguages] = js.undefined
    ): BatchDetectDominantLanguageItemResult = {
      val __obj = js.Dictionary.empty[js.Any]
      Index.foreach(__v => __obj.update("Index", __v.asInstanceOf[js.Any]))
      Languages.foreach(__v => __obj.update("Languages", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchDetectDominantLanguageItemResult]
    }
  }

  @js.native
  trait BatchDetectDominantLanguageRequest extends js.Object {
    var TextList: StringList
  }

  object BatchDetectDominantLanguageRequest {
    def apply(
        TextList: StringList
    ): BatchDetectDominantLanguageRequest = {
      val __obj = js.Dictionary[js.Any](
        "TextList" -> TextList.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[BatchDetectDominantLanguageRequest]
    }
  }

  @js.native
  trait BatchDetectDominantLanguageResponse extends js.Object {
    var ErrorList: BatchItemErrorList
    var ResultList: ListOfDetectDominantLanguageResult
  }

  object BatchDetectDominantLanguageResponse {
    def apply(
        ErrorList: BatchItemErrorList,
        ResultList: ListOfDetectDominantLanguageResult
    ): BatchDetectDominantLanguageResponse = {
      val __obj = js.Dictionary[js.Any](
        "ErrorList"  -> ErrorList.asInstanceOf[js.Any],
        "ResultList" -> ResultList.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[BatchDetectDominantLanguageResponse]
    }
  }

  /**
    * The result of calling the operation. The operation returns one object for each document that is successfully processed by the operation.
    */
  @js.native
  trait BatchDetectEntitiesItemResult extends js.Object {
    var Entities: js.UndefOr[ListOfEntities]
    var Index: js.UndefOr[Int]
  }

  object BatchDetectEntitiesItemResult {
    def apply(
        Entities: js.UndefOr[ListOfEntities] = js.undefined,
        Index: js.UndefOr[Int] = js.undefined
    ): BatchDetectEntitiesItemResult = {
      val __obj = js.Dictionary.empty[js.Any]
      Entities.foreach(__v => __obj.update("Entities", __v.asInstanceOf[js.Any]))
      Index.foreach(__v => __obj.update("Index", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchDetectEntitiesItemResult]
    }
  }

  @js.native
  trait BatchDetectEntitiesRequest extends js.Object {
    var LanguageCode: LanguageCode
    var TextList: StringList
  }

  object BatchDetectEntitiesRequest {
    def apply(
        LanguageCode: LanguageCode,
        TextList: StringList
    ): BatchDetectEntitiesRequest = {
      val __obj = js.Dictionary[js.Any](
        "LanguageCode" -> LanguageCode.asInstanceOf[js.Any],
        "TextList"     -> TextList.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[BatchDetectEntitiesRequest]
    }
  }

  @js.native
  trait BatchDetectEntitiesResponse extends js.Object {
    var ErrorList: BatchItemErrorList
    var ResultList: ListOfDetectEntitiesResult
  }

  object BatchDetectEntitiesResponse {
    def apply(
        ErrorList: BatchItemErrorList,
        ResultList: ListOfDetectEntitiesResult
    ): BatchDetectEntitiesResponse = {
      val __obj = js.Dictionary[js.Any](
        "ErrorList"  -> ErrorList.asInstanceOf[js.Any],
        "ResultList" -> ResultList.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[BatchDetectEntitiesResponse]
    }
  }

  /**
    * The result of calling the operation. The operation returns one object for each document that is successfully processed by the operation.
    */
  @js.native
  trait BatchDetectKeyPhrasesItemResult extends js.Object {
    var Index: js.UndefOr[Int]
    var KeyPhrases: js.UndefOr[ListOfKeyPhrases]
  }

  object BatchDetectKeyPhrasesItemResult {
    def apply(
        Index: js.UndefOr[Int] = js.undefined,
        KeyPhrases: js.UndefOr[ListOfKeyPhrases] = js.undefined
    ): BatchDetectKeyPhrasesItemResult = {
      val __obj = js.Dictionary.empty[js.Any]
      Index.foreach(__v => __obj.update("Index", __v.asInstanceOf[js.Any]))
      KeyPhrases.foreach(__v => __obj.update("KeyPhrases", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchDetectKeyPhrasesItemResult]
    }
  }

  @js.native
  trait BatchDetectKeyPhrasesRequest extends js.Object {
    var LanguageCode: LanguageCode
    var TextList: StringList
  }

  object BatchDetectKeyPhrasesRequest {
    def apply(
        LanguageCode: LanguageCode,
        TextList: StringList
    ): BatchDetectKeyPhrasesRequest = {
      val __obj = js.Dictionary[js.Any](
        "LanguageCode" -> LanguageCode.asInstanceOf[js.Any],
        "TextList"     -> TextList.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[BatchDetectKeyPhrasesRequest]
    }
  }

  @js.native
  trait BatchDetectKeyPhrasesResponse extends js.Object {
    var ErrorList: BatchItemErrorList
    var ResultList: ListOfDetectKeyPhrasesResult
  }

  object BatchDetectKeyPhrasesResponse {
    def apply(
        ErrorList: BatchItemErrorList,
        ResultList: ListOfDetectKeyPhrasesResult
    ): BatchDetectKeyPhrasesResponse = {
      val __obj = js.Dictionary[js.Any](
        "ErrorList"  -> ErrorList.asInstanceOf[js.Any],
        "ResultList" -> ResultList.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[BatchDetectKeyPhrasesResponse]
    }
  }

  /**
    * The result of calling the operation. The operation returns one object for each document that is successfully processed by the operation.
    */
  @js.native
  trait BatchDetectSentimentItemResult extends js.Object {
    var Index: js.UndefOr[Int]
    var Sentiment: js.UndefOr[SentimentType]
    var SentimentScore: js.UndefOr[SentimentScore]
  }

  object BatchDetectSentimentItemResult {
    def apply(
        Index: js.UndefOr[Int] = js.undefined,
        Sentiment: js.UndefOr[SentimentType] = js.undefined,
        SentimentScore: js.UndefOr[SentimentScore] = js.undefined
    ): BatchDetectSentimentItemResult = {
      val __obj = js.Dictionary.empty[js.Any]
      Index.foreach(__v => __obj.update("Index", __v.asInstanceOf[js.Any]))
      Sentiment.foreach(__v => __obj.update("Sentiment", __v.asInstanceOf[js.Any]))
      SentimentScore.foreach(__v => __obj.update("SentimentScore", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchDetectSentimentItemResult]
    }
  }

  @js.native
  trait BatchDetectSentimentRequest extends js.Object {
    var LanguageCode: LanguageCode
    var TextList: StringList
  }

  object BatchDetectSentimentRequest {
    def apply(
        LanguageCode: LanguageCode,
        TextList: StringList
    ): BatchDetectSentimentRequest = {
      val __obj = js.Dictionary[js.Any](
        "LanguageCode" -> LanguageCode.asInstanceOf[js.Any],
        "TextList"     -> TextList.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[BatchDetectSentimentRequest]
    }
  }

  @js.native
  trait BatchDetectSentimentResponse extends js.Object {
    var ErrorList: BatchItemErrorList
    var ResultList: ListOfDetectSentimentResult
  }

  object BatchDetectSentimentResponse {
    def apply(
        ErrorList: BatchItemErrorList,
        ResultList: ListOfDetectSentimentResult
    ): BatchDetectSentimentResponse = {
      val __obj = js.Dictionary[js.Any](
        "ErrorList"  -> ErrorList.asInstanceOf[js.Any],
        "ResultList" -> ResultList.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[BatchDetectSentimentResponse]
    }
  }

  /**
    * The result of calling the operation. The operation returns one object that is successfully processed by the operation.
    */
  @js.native
  trait BatchDetectSyntaxItemResult extends js.Object {
    var Index: js.UndefOr[Int]
    var SyntaxTokens: js.UndefOr[ListOfSyntaxTokens]
  }

  object BatchDetectSyntaxItemResult {
    def apply(
        Index: js.UndefOr[Int] = js.undefined,
        SyntaxTokens: js.UndefOr[ListOfSyntaxTokens] = js.undefined
    ): BatchDetectSyntaxItemResult = {
      val __obj = js.Dictionary.empty[js.Any]
      Index.foreach(__v => __obj.update("Index", __v.asInstanceOf[js.Any]))
      SyntaxTokens.foreach(__v => __obj.update("SyntaxTokens", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchDetectSyntaxItemResult]
    }
  }

  @js.native
  trait BatchDetectSyntaxRequest extends js.Object {
    var LanguageCode: SyntaxLanguageCode
    var TextList: StringList
  }

  object BatchDetectSyntaxRequest {
    def apply(
        LanguageCode: SyntaxLanguageCode,
        TextList: StringList
    ): BatchDetectSyntaxRequest = {
      val __obj = js.Dictionary[js.Any](
        "LanguageCode" -> LanguageCode.asInstanceOf[js.Any],
        "TextList"     -> TextList.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[BatchDetectSyntaxRequest]
    }
  }

  @js.native
  trait BatchDetectSyntaxResponse extends js.Object {
    var ErrorList: BatchItemErrorList
    var ResultList: ListOfDetectSyntaxResult
  }

  object BatchDetectSyntaxResponse {
    def apply(
        ErrorList: BatchItemErrorList,
        ResultList: ListOfDetectSyntaxResult
    ): BatchDetectSyntaxResponse = {
      val __obj = js.Dictionary[js.Any](
        "ErrorList"  -> ErrorList.asInstanceOf[js.Any],
        "ResultList" -> ResultList.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[BatchDetectSyntaxResponse]
    }
  }

  /**
    * Describes an error that occurred while processing a document in a batch. The operation returns on <code>BatchItemError</code> object for each document that contained an error.
    */
  @js.native
  trait BatchItemError extends js.Object {
    var ErrorCode: js.UndefOr[String]
    var ErrorMessage: js.UndefOr[String]
    var Index: js.UndefOr[Int]
  }

  object BatchItemError {
    def apply(
        ErrorCode: js.UndefOr[String] = js.undefined,
        ErrorMessage: js.UndefOr[String] = js.undefined,
        Index: js.UndefOr[Int] = js.undefined
    ): BatchItemError = {
      val __obj = js.Dictionary.empty[js.Any]
      ErrorCode.foreach(__v => __obj.update("ErrorCode", __v.asInstanceOf[js.Any]))
      ErrorMessage.foreach(__v => __obj.update("ErrorMessage", __v.asInstanceOf[js.Any]))
      Index.foreach(__v => __obj.update("Index", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchItemError]
    }
  }

  /**
    * Describes the result metrics for the test data associated with an documentation classifier.
    */
  @js.native
  trait ClassifierEvaluationMetrics extends js.Object {
    var Accuracy: js.UndefOr[Double]
    var F1Score: js.UndefOr[Double]
    var Precision: js.UndefOr[Double]
    var Recall: js.UndefOr[Double]
  }

  object ClassifierEvaluationMetrics {
    def apply(
        Accuracy: js.UndefOr[Double] = js.undefined,
        F1Score: js.UndefOr[Double] = js.undefined,
        Precision: js.UndefOr[Double] = js.undefined,
        Recall: js.UndefOr[Double] = js.undefined
    ): ClassifierEvaluationMetrics = {
      val __obj = js.Dictionary.empty[js.Any]
      Accuracy.foreach(__v => __obj.update("Accuracy", __v.asInstanceOf[js.Any]))
      F1Score.foreach(__v => __obj.update("F1Score", __v.asInstanceOf[js.Any]))
      Precision.foreach(__v => __obj.update("Precision", __v.asInstanceOf[js.Any]))
      Recall.foreach(__v => __obj.update("Recall", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ClassifierEvaluationMetrics]
    }
  }

  /**
    * Provides information about a document classifier.
    */
  @js.native
  trait ClassifierMetadata extends js.Object {
    var EvaluationMetrics: js.UndefOr[ClassifierEvaluationMetrics]
    var NumberOfLabels: js.UndefOr[Int]
    var NumberOfTestDocuments: js.UndefOr[Int]
    var NumberOfTrainedDocuments: js.UndefOr[Int]
  }

  object ClassifierMetadata {
    def apply(
        EvaluationMetrics: js.UndefOr[ClassifierEvaluationMetrics] = js.undefined,
        NumberOfLabels: js.UndefOr[Int] = js.undefined,
        NumberOfTestDocuments: js.UndefOr[Int] = js.undefined,
        NumberOfTrainedDocuments: js.UndefOr[Int] = js.undefined
    ): ClassifierMetadata = {
      val __obj = js.Dictionary.empty[js.Any]
      EvaluationMetrics.foreach(__v => __obj.update("EvaluationMetrics", __v.asInstanceOf[js.Any]))
      NumberOfLabels.foreach(__v => __obj.update("NumberOfLabels", __v.asInstanceOf[js.Any]))
      NumberOfTestDocuments.foreach(__v => __obj.update("NumberOfTestDocuments", __v.asInstanceOf[js.Any]))
      NumberOfTrainedDocuments.foreach(__v => __obj.update("NumberOfTrainedDocuments", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ClassifierMetadata]
    }
  }

  @js.native
  trait CreateDocumentClassifierRequest extends js.Object {
    var DataAccessRoleArn: IamRoleArn
    var DocumentClassifierName: ComprehendArnName
    var InputDataConfig: DocumentClassifierInputDataConfig
    var LanguageCode: LanguageCode
    var ClientRequestToken: js.UndefOr[ClientRequestTokenString]
    var OutputDataConfig: js.UndefOr[DocumentClassifierOutputDataConfig]
    var Tags: js.UndefOr[TagList]
    var VolumeKmsKeyId: js.UndefOr[KmsKeyId]
    var VpcConfig: js.UndefOr[VpcConfig]
  }

  object CreateDocumentClassifierRequest {
    def apply(
        DataAccessRoleArn: IamRoleArn,
        DocumentClassifierName: ComprehendArnName,
        InputDataConfig: DocumentClassifierInputDataConfig,
        LanguageCode: LanguageCode,
        ClientRequestToken: js.UndefOr[ClientRequestTokenString] = js.undefined,
        OutputDataConfig: js.UndefOr[DocumentClassifierOutputDataConfig] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined,
        VolumeKmsKeyId: js.UndefOr[KmsKeyId] = js.undefined,
        VpcConfig: js.UndefOr[VpcConfig] = js.undefined
    ): CreateDocumentClassifierRequest = {
      val __obj = js.Dictionary[js.Any](
        "DataAccessRoleArn"      -> DataAccessRoleArn.asInstanceOf[js.Any],
        "DocumentClassifierName" -> DocumentClassifierName.asInstanceOf[js.Any],
        "InputDataConfig"        -> InputDataConfig.asInstanceOf[js.Any],
        "LanguageCode"           -> LanguageCode.asInstanceOf[js.Any]
      )

      ClientRequestToken.foreach(__v => __obj.update("ClientRequestToken", __v.asInstanceOf[js.Any]))
      OutputDataConfig.foreach(__v => __obj.update("OutputDataConfig", __v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.update("Tags", __v.asInstanceOf[js.Any]))
      VolumeKmsKeyId.foreach(__v => __obj.update("VolumeKmsKeyId", __v.asInstanceOf[js.Any]))
      VpcConfig.foreach(__v => __obj.update("VpcConfig", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDocumentClassifierRequest]
    }
  }

  @js.native
  trait CreateDocumentClassifierResponse extends js.Object {
    var DocumentClassifierArn: js.UndefOr[DocumentClassifierArn]
  }

  object CreateDocumentClassifierResponse {
    def apply(
        DocumentClassifierArn: js.UndefOr[DocumentClassifierArn] = js.undefined
    ): CreateDocumentClassifierResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      DocumentClassifierArn.foreach(__v => __obj.update("DocumentClassifierArn", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDocumentClassifierResponse]
    }
  }

  @js.native
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

  object CreateEntityRecognizerRequest {
    def apply(
        DataAccessRoleArn: IamRoleArn,
        InputDataConfig: EntityRecognizerInputDataConfig,
        LanguageCode: LanguageCode,
        RecognizerName: ComprehendArnName,
        ClientRequestToken: js.UndefOr[ClientRequestTokenString] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined,
        VolumeKmsKeyId: js.UndefOr[KmsKeyId] = js.undefined,
        VpcConfig: js.UndefOr[VpcConfig] = js.undefined
    ): CreateEntityRecognizerRequest = {
      val __obj = js.Dictionary[js.Any](
        "DataAccessRoleArn" -> DataAccessRoleArn.asInstanceOf[js.Any],
        "InputDataConfig"   -> InputDataConfig.asInstanceOf[js.Any],
        "LanguageCode"      -> LanguageCode.asInstanceOf[js.Any],
        "RecognizerName"    -> RecognizerName.asInstanceOf[js.Any]
      )

      ClientRequestToken.foreach(__v => __obj.update("ClientRequestToken", __v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.update("Tags", __v.asInstanceOf[js.Any]))
      VolumeKmsKeyId.foreach(__v => __obj.update("VolumeKmsKeyId", __v.asInstanceOf[js.Any]))
      VpcConfig.foreach(__v => __obj.update("VpcConfig", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateEntityRecognizerRequest]
    }
  }

  @js.native
  trait CreateEntityRecognizerResponse extends js.Object {
    var EntityRecognizerArn: js.UndefOr[EntityRecognizerArn]
  }

  object CreateEntityRecognizerResponse {
    def apply(
        EntityRecognizerArn: js.UndefOr[EntityRecognizerArn] = js.undefined
    ): CreateEntityRecognizerResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      EntityRecognizerArn.foreach(__v => __obj.update("EntityRecognizerArn", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateEntityRecognizerResponse]
    }
  }

  @js.native
  trait DeleteDocumentClassifierRequest extends js.Object {
    var DocumentClassifierArn: DocumentClassifierArn
  }

  object DeleteDocumentClassifierRequest {
    def apply(
        DocumentClassifierArn: DocumentClassifierArn
    ): DeleteDocumentClassifierRequest = {
      val __obj = js.Dictionary[js.Any](
        "DocumentClassifierArn" -> DocumentClassifierArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteDocumentClassifierRequest]
    }
  }

  @js.native
  trait DeleteDocumentClassifierResponse extends js.Object {}

  object DeleteDocumentClassifierResponse {
    def apply(
        ): DeleteDocumentClassifierResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[DeleteDocumentClassifierResponse]
    }
  }

  @js.native
  trait DeleteEntityRecognizerRequest extends js.Object {
    var EntityRecognizerArn: EntityRecognizerArn
  }

  object DeleteEntityRecognizerRequest {
    def apply(
        EntityRecognizerArn: EntityRecognizerArn
    ): DeleteEntityRecognizerRequest = {
      val __obj = js.Dictionary[js.Any](
        "EntityRecognizerArn" -> EntityRecognizerArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteEntityRecognizerRequest]
    }
  }

  @js.native
  trait DeleteEntityRecognizerResponse extends js.Object {}

  object DeleteEntityRecognizerResponse {
    def apply(
        ): DeleteEntityRecognizerResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[DeleteEntityRecognizerResponse]
    }
  }

  @js.native
  trait DescribeDocumentClassificationJobRequest extends js.Object {
    var JobId: JobId
  }

  object DescribeDocumentClassificationJobRequest {
    def apply(
        JobId: JobId
    ): DescribeDocumentClassificationJobRequest = {
      val __obj = js.Dictionary[js.Any](
        "JobId" -> JobId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeDocumentClassificationJobRequest]
    }
  }

  @js.native
  trait DescribeDocumentClassificationJobResponse extends js.Object {
    var DocumentClassificationJobProperties: js.UndefOr[DocumentClassificationJobProperties]
  }

  object DescribeDocumentClassificationJobResponse {
    def apply(
        DocumentClassificationJobProperties: js.UndefOr[DocumentClassificationJobProperties] = js.undefined
    ): DescribeDocumentClassificationJobResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      DocumentClassificationJobProperties.foreach(
        __v => __obj.update("DocumentClassificationJobProperties", __v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[DescribeDocumentClassificationJobResponse]
    }
  }

  @js.native
  trait DescribeDocumentClassifierRequest extends js.Object {
    var DocumentClassifierArn: DocumentClassifierArn
  }

  object DescribeDocumentClassifierRequest {
    def apply(
        DocumentClassifierArn: DocumentClassifierArn
    ): DescribeDocumentClassifierRequest = {
      val __obj = js.Dictionary[js.Any](
        "DocumentClassifierArn" -> DocumentClassifierArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeDocumentClassifierRequest]
    }
  }

  @js.native
  trait DescribeDocumentClassifierResponse extends js.Object {
    var DocumentClassifierProperties: js.UndefOr[DocumentClassifierProperties]
  }

  object DescribeDocumentClassifierResponse {
    def apply(
        DocumentClassifierProperties: js.UndefOr[DocumentClassifierProperties] = js.undefined
    ): DescribeDocumentClassifierResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      DocumentClassifierProperties.foreach(
        __v => __obj.update("DocumentClassifierProperties", __v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[DescribeDocumentClassifierResponse]
    }
  }

  @js.native
  trait DescribeDominantLanguageDetectionJobRequest extends js.Object {
    var JobId: JobId
  }

  object DescribeDominantLanguageDetectionJobRequest {
    def apply(
        JobId: JobId
    ): DescribeDominantLanguageDetectionJobRequest = {
      val __obj = js.Dictionary[js.Any](
        "JobId" -> JobId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeDominantLanguageDetectionJobRequest]
    }
  }

  @js.native
  trait DescribeDominantLanguageDetectionJobResponse extends js.Object {
    var DominantLanguageDetectionJobProperties: js.UndefOr[DominantLanguageDetectionJobProperties]
  }

  object DescribeDominantLanguageDetectionJobResponse {
    def apply(
        DominantLanguageDetectionJobProperties: js.UndefOr[DominantLanguageDetectionJobProperties] = js.undefined
    ): DescribeDominantLanguageDetectionJobResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      DominantLanguageDetectionJobProperties.foreach(
        __v => __obj.update("DominantLanguageDetectionJobProperties", __v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[DescribeDominantLanguageDetectionJobResponse]
    }
  }

  @js.native
  trait DescribeEntitiesDetectionJobRequest extends js.Object {
    var JobId: JobId
  }

  object DescribeEntitiesDetectionJobRequest {
    def apply(
        JobId: JobId
    ): DescribeEntitiesDetectionJobRequest = {
      val __obj = js.Dictionary[js.Any](
        "JobId" -> JobId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeEntitiesDetectionJobRequest]
    }
  }

  @js.native
  trait DescribeEntitiesDetectionJobResponse extends js.Object {
    var EntitiesDetectionJobProperties: js.UndefOr[EntitiesDetectionJobProperties]
  }

  object DescribeEntitiesDetectionJobResponse {
    def apply(
        EntitiesDetectionJobProperties: js.UndefOr[EntitiesDetectionJobProperties] = js.undefined
    ): DescribeEntitiesDetectionJobResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      EntitiesDetectionJobProperties.foreach(
        __v => __obj.update("EntitiesDetectionJobProperties", __v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[DescribeEntitiesDetectionJobResponse]
    }
  }

  @js.native
  trait DescribeEntityRecognizerRequest extends js.Object {
    var EntityRecognizerArn: EntityRecognizerArn
  }

  object DescribeEntityRecognizerRequest {
    def apply(
        EntityRecognizerArn: EntityRecognizerArn
    ): DescribeEntityRecognizerRequest = {
      val __obj = js.Dictionary[js.Any](
        "EntityRecognizerArn" -> EntityRecognizerArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeEntityRecognizerRequest]
    }
  }

  @js.native
  trait DescribeEntityRecognizerResponse extends js.Object {
    var EntityRecognizerProperties: js.UndefOr[EntityRecognizerProperties]
  }

  object DescribeEntityRecognizerResponse {
    def apply(
        EntityRecognizerProperties: js.UndefOr[EntityRecognizerProperties] = js.undefined
    ): DescribeEntityRecognizerResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      EntityRecognizerProperties.foreach(__v => __obj.update("EntityRecognizerProperties", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeEntityRecognizerResponse]
    }
  }

  @js.native
  trait DescribeKeyPhrasesDetectionJobRequest extends js.Object {
    var JobId: JobId
  }

  object DescribeKeyPhrasesDetectionJobRequest {
    def apply(
        JobId: JobId
    ): DescribeKeyPhrasesDetectionJobRequest = {
      val __obj = js.Dictionary[js.Any](
        "JobId" -> JobId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeKeyPhrasesDetectionJobRequest]
    }
  }

  @js.native
  trait DescribeKeyPhrasesDetectionJobResponse extends js.Object {
    var KeyPhrasesDetectionJobProperties: js.UndefOr[KeyPhrasesDetectionJobProperties]
  }

  object DescribeKeyPhrasesDetectionJobResponse {
    def apply(
        KeyPhrasesDetectionJobProperties: js.UndefOr[KeyPhrasesDetectionJobProperties] = js.undefined
    ): DescribeKeyPhrasesDetectionJobResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      KeyPhrasesDetectionJobProperties.foreach(
        __v => __obj.update("KeyPhrasesDetectionJobProperties", __v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[DescribeKeyPhrasesDetectionJobResponse]
    }
  }

  @js.native
  trait DescribeSentimentDetectionJobRequest extends js.Object {
    var JobId: JobId
  }

  object DescribeSentimentDetectionJobRequest {
    def apply(
        JobId: JobId
    ): DescribeSentimentDetectionJobRequest = {
      val __obj = js.Dictionary[js.Any](
        "JobId" -> JobId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeSentimentDetectionJobRequest]
    }
  }

  @js.native
  trait DescribeSentimentDetectionJobResponse extends js.Object {
    var SentimentDetectionJobProperties: js.UndefOr[SentimentDetectionJobProperties]
  }

  object DescribeSentimentDetectionJobResponse {
    def apply(
        SentimentDetectionJobProperties: js.UndefOr[SentimentDetectionJobProperties] = js.undefined
    ): DescribeSentimentDetectionJobResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      SentimentDetectionJobProperties.foreach(
        __v => __obj.update("SentimentDetectionJobProperties", __v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[DescribeSentimentDetectionJobResponse]
    }
  }

  @js.native
  trait DescribeTopicsDetectionJobRequest extends js.Object {
    var JobId: JobId
  }

  object DescribeTopicsDetectionJobRequest {
    def apply(
        JobId: JobId
    ): DescribeTopicsDetectionJobRequest = {
      val __obj = js.Dictionary[js.Any](
        "JobId" -> JobId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeTopicsDetectionJobRequest]
    }
  }

  @js.native
  trait DescribeTopicsDetectionJobResponse extends js.Object {
    var TopicsDetectionJobProperties: js.UndefOr[TopicsDetectionJobProperties]
  }

  object DescribeTopicsDetectionJobResponse {
    def apply(
        TopicsDetectionJobProperties: js.UndefOr[TopicsDetectionJobProperties] = js.undefined
    ): DescribeTopicsDetectionJobResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      TopicsDetectionJobProperties.foreach(
        __v => __obj.update("TopicsDetectionJobProperties", __v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[DescribeTopicsDetectionJobResponse]
    }
  }

  @js.native
  trait DetectDominantLanguageRequest extends js.Object {
    var Text: String
  }

  object DetectDominantLanguageRequest {
    def apply(
        Text: String
    ): DetectDominantLanguageRequest = {
      val __obj = js.Dictionary[js.Any](
        "Text" -> Text.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DetectDominantLanguageRequest]
    }
  }

  @js.native
  trait DetectDominantLanguageResponse extends js.Object {
    var Languages: js.UndefOr[ListOfDominantLanguages]
  }

  object DetectDominantLanguageResponse {
    def apply(
        Languages: js.UndefOr[ListOfDominantLanguages] = js.undefined
    ): DetectDominantLanguageResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Languages.foreach(__v => __obj.update("Languages", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DetectDominantLanguageResponse]
    }
  }

  @js.native
  trait DetectEntitiesRequest extends js.Object {
    var LanguageCode: LanguageCode
    var Text: String
  }

  object DetectEntitiesRequest {
    def apply(
        LanguageCode: LanguageCode,
        Text: String
    ): DetectEntitiesRequest = {
      val __obj = js.Dictionary[js.Any](
        "LanguageCode" -> LanguageCode.asInstanceOf[js.Any],
        "Text"         -> Text.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DetectEntitiesRequest]
    }
  }

  @js.native
  trait DetectEntitiesResponse extends js.Object {
    var Entities: js.UndefOr[ListOfEntities]
  }

  object DetectEntitiesResponse {
    def apply(
        Entities: js.UndefOr[ListOfEntities] = js.undefined
    ): DetectEntitiesResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Entities.foreach(__v => __obj.update("Entities", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DetectEntitiesResponse]
    }
  }

  @js.native
  trait DetectKeyPhrasesRequest extends js.Object {
    var LanguageCode: LanguageCode
    var Text: String
  }

  object DetectKeyPhrasesRequest {
    def apply(
        LanguageCode: LanguageCode,
        Text: String
    ): DetectKeyPhrasesRequest = {
      val __obj = js.Dictionary[js.Any](
        "LanguageCode" -> LanguageCode.asInstanceOf[js.Any],
        "Text"         -> Text.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DetectKeyPhrasesRequest]
    }
  }

  @js.native
  trait DetectKeyPhrasesResponse extends js.Object {
    var KeyPhrases: js.UndefOr[ListOfKeyPhrases]
  }

  object DetectKeyPhrasesResponse {
    def apply(
        KeyPhrases: js.UndefOr[ListOfKeyPhrases] = js.undefined
    ): DetectKeyPhrasesResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      KeyPhrases.foreach(__v => __obj.update("KeyPhrases", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DetectKeyPhrasesResponse]
    }
  }

  @js.native
  trait DetectSentimentRequest extends js.Object {
    var LanguageCode: LanguageCode
    var Text: String
  }

  object DetectSentimentRequest {
    def apply(
        LanguageCode: LanguageCode,
        Text: String
    ): DetectSentimentRequest = {
      val __obj = js.Dictionary[js.Any](
        "LanguageCode" -> LanguageCode.asInstanceOf[js.Any],
        "Text"         -> Text.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DetectSentimentRequest]
    }
  }

  @js.native
  trait DetectSentimentResponse extends js.Object {
    var Sentiment: js.UndefOr[SentimentType]
    var SentimentScore: js.UndefOr[SentimentScore]
  }

  object DetectSentimentResponse {
    def apply(
        Sentiment: js.UndefOr[SentimentType] = js.undefined,
        SentimentScore: js.UndefOr[SentimentScore] = js.undefined
    ): DetectSentimentResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Sentiment.foreach(__v => __obj.update("Sentiment", __v.asInstanceOf[js.Any]))
      SentimentScore.foreach(__v => __obj.update("SentimentScore", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DetectSentimentResponse]
    }
  }

  @js.native
  trait DetectSyntaxRequest extends js.Object {
    var LanguageCode: SyntaxLanguageCode
    var Text: String
  }

  object DetectSyntaxRequest {
    def apply(
        LanguageCode: SyntaxLanguageCode,
        Text: String
    ): DetectSyntaxRequest = {
      val __obj = js.Dictionary[js.Any](
        "LanguageCode" -> LanguageCode.asInstanceOf[js.Any],
        "Text"         -> Text.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DetectSyntaxRequest]
    }
  }

  @js.native
  trait DetectSyntaxResponse extends js.Object {
    var SyntaxTokens: js.UndefOr[ListOfSyntaxTokens]
  }

  object DetectSyntaxResponse {
    def apply(
        SyntaxTokens: js.UndefOr[ListOfSyntaxTokens] = js.undefined
    ): DetectSyntaxResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      SyntaxTokens.foreach(__v => __obj.update("SyntaxTokens", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DetectSyntaxResponse]
    }
  }

  /**
    * Provides information for filtering a list of document classification jobs. For more information, see the operation. You can provide only one filter parameter in each request.
    */
  @js.native
  trait DocumentClassificationJobFilter extends js.Object {
    var JobName: js.UndefOr[JobName]
    var JobStatus: js.UndefOr[JobStatus]
    var SubmitTimeAfter: js.UndefOr[Timestamp]
    var SubmitTimeBefore: js.UndefOr[Timestamp]
  }

  object DocumentClassificationJobFilter {
    def apply(
        JobName: js.UndefOr[JobName] = js.undefined,
        JobStatus: js.UndefOr[JobStatus] = js.undefined,
        SubmitTimeAfter: js.UndefOr[Timestamp] = js.undefined,
        SubmitTimeBefore: js.UndefOr[Timestamp] = js.undefined
    ): DocumentClassificationJobFilter = {
      val __obj = js.Dictionary.empty[js.Any]
      JobName.foreach(__v => __obj.update("JobName", __v.asInstanceOf[js.Any]))
      JobStatus.foreach(__v => __obj.update("JobStatus", __v.asInstanceOf[js.Any]))
      SubmitTimeAfter.foreach(__v => __obj.update("SubmitTimeAfter", __v.asInstanceOf[js.Any]))
      SubmitTimeBefore.foreach(__v => __obj.update("SubmitTimeBefore", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DocumentClassificationJobFilter]
    }
  }

  /**
    * Provides information about a document classification job.
    */
  @js.native
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

  object DocumentClassificationJobProperties {
    def apply(
        DataAccessRoleArn: js.UndefOr[IamRoleArn] = js.undefined,
        DocumentClassifierArn: js.UndefOr[DocumentClassifierArn] = js.undefined,
        EndTime: js.UndefOr[Timestamp] = js.undefined,
        InputDataConfig: js.UndefOr[InputDataConfig] = js.undefined,
        JobId: js.UndefOr[JobId] = js.undefined,
        JobName: js.UndefOr[JobName] = js.undefined,
        JobStatus: js.UndefOr[JobStatus] = js.undefined,
        Message: js.UndefOr[AnyLengthString] = js.undefined,
        OutputDataConfig: js.UndefOr[OutputDataConfig] = js.undefined,
        SubmitTime: js.UndefOr[Timestamp] = js.undefined,
        VolumeKmsKeyId: js.UndefOr[KmsKeyId] = js.undefined,
        VpcConfig: js.UndefOr[VpcConfig] = js.undefined
    ): DocumentClassificationJobProperties = {
      val __obj = js.Dictionary.empty[js.Any]
      DataAccessRoleArn.foreach(__v => __obj.update("DataAccessRoleArn", __v.asInstanceOf[js.Any]))
      DocumentClassifierArn.foreach(__v => __obj.update("DocumentClassifierArn", __v.asInstanceOf[js.Any]))
      EndTime.foreach(__v => __obj.update("EndTime", __v.asInstanceOf[js.Any]))
      InputDataConfig.foreach(__v => __obj.update("InputDataConfig", __v.asInstanceOf[js.Any]))
      JobId.foreach(__v => __obj.update("JobId", __v.asInstanceOf[js.Any]))
      JobName.foreach(__v => __obj.update("JobName", __v.asInstanceOf[js.Any]))
      JobStatus.foreach(__v => __obj.update("JobStatus", __v.asInstanceOf[js.Any]))
      Message.foreach(__v => __obj.update("Message", __v.asInstanceOf[js.Any]))
      OutputDataConfig.foreach(__v => __obj.update("OutputDataConfig", __v.asInstanceOf[js.Any]))
      SubmitTime.foreach(__v => __obj.update("SubmitTime", __v.asInstanceOf[js.Any]))
      VolumeKmsKeyId.foreach(__v => __obj.update("VolumeKmsKeyId", __v.asInstanceOf[js.Any]))
      VpcConfig.foreach(__v => __obj.update("VpcConfig", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DocumentClassificationJobProperties]
    }
  }

  /**
    * Provides information for filtering a list of document classifiers. You can only specify one filtering parameter in a request. For more information, see the operation.
    */
  @js.native
  trait DocumentClassifierFilter extends js.Object {
    var Status: js.UndefOr[ModelStatus]
    var SubmitTimeAfter: js.UndefOr[Timestamp]
    var SubmitTimeBefore: js.UndefOr[Timestamp]
  }

  object DocumentClassifierFilter {
    def apply(
        Status: js.UndefOr[ModelStatus] = js.undefined,
        SubmitTimeAfter: js.UndefOr[Timestamp] = js.undefined,
        SubmitTimeBefore: js.UndefOr[Timestamp] = js.undefined
    ): DocumentClassifierFilter = {
      val __obj = js.Dictionary.empty[js.Any]
      Status.foreach(__v => __obj.update("Status", __v.asInstanceOf[js.Any]))
      SubmitTimeAfter.foreach(__v => __obj.update("SubmitTimeAfter", __v.asInstanceOf[js.Any]))
      SubmitTimeBefore.foreach(__v => __obj.update("SubmitTimeBefore", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DocumentClassifierFilter]
    }
  }

  /**
    * The input properties for training a document classifier.
    *  For more information on how the input file is formatted, see <a>how-document-classification-training-data</a>.
    */
  @js.native
  trait DocumentClassifierInputDataConfig extends js.Object {
    var S3Uri: S3Uri
  }

  object DocumentClassifierInputDataConfig {
    def apply(
        S3Uri: S3Uri
    ): DocumentClassifierInputDataConfig = {
      val __obj = js.Dictionary[js.Any](
        "S3Uri" -> S3Uri.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DocumentClassifierInputDataConfig]
    }
  }

  /**
    * Provides output results configuration parameters for custom classifier jobs.
    */
  @js.native
  trait DocumentClassifierOutputDataConfig extends js.Object {
    var KmsKeyId: js.UndefOr[KmsKeyId]
    var S3Uri: js.UndefOr[S3Uri]
  }

  object DocumentClassifierOutputDataConfig {
    def apply(
        KmsKeyId: js.UndefOr[KmsKeyId] = js.undefined,
        S3Uri: js.UndefOr[S3Uri] = js.undefined
    ): DocumentClassifierOutputDataConfig = {
      val __obj = js.Dictionary.empty[js.Any]
      KmsKeyId.foreach(__v => __obj.update("KmsKeyId", __v.asInstanceOf[js.Any]))
      S3Uri.foreach(__v => __obj.update("S3Uri", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DocumentClassifierOutputDataConfig]
    }
  }

  /**
    * Provides information about a document classifier.
    */
  @js.native
  trait DocumentClassifierProperties extends js.Object {
    var ClassifierMetadata: js.UndefOr[ClassifierMetadata]
    var DataAccessRoleArn: js.UndefOr[IamRoleArn]
    var DocumentClassifierArn: js.UndefOr[DocumentClassifierArn]
    var EndTime: js.UndefOr[Timestamp]
    var InputDataConfig: js.UndefOr[DocumentClassifierInputDataConfig]
    var LanguageCode: js.UndefOr[LanguageCode]
    var Message: js.UndefOr[AnyLengthString]
    var OutputDataConfig: js.UndefOr[DocumentClassifierOutputDataConfig]
    var Status: js.UndefOr[ModelStatus]
    var SubmitTime: js.UndefOr[Timestamp]
    var TrainingEndTime: js.UndefOr[Timestamp]
    var TrainingStartTime: js.UndefOr[Timestamp]
    var VolumeKmsKeyId: js.UndefOr[KmsKeyId]
    var VpcConfig: js.UndefOr[VpcConfig]
  }

  object DocumentClassifierProperties {
    def apply(
        ClassifierMetadata: js.UndefOr[ClassifierMetadata] = js.undefined,
        DataAccessRoleArn: js.UndefOr[IamRoleArn] = js.undefined,
        DocumentClassifierArn: js.UndefOr[DocumentClassifierArn] = js.undefined,
        EndTime: js.UndefOr[Timestamp] = js.undefined,
        InputDataConfig: js.UndefOr[DocumentClassifierInputDataConfig] = js.undefined,
        LanguageCode: js.UndefOr[LanguageCode] = js.undefined,
        Message: js.UndefOr[AnyLengthString] = js.undefined,
        OutputDataConfig: js.UndefOr[DocumentClassifierOutputDataConfig] = js.undefined,
        Status: js.UndefOr[ModelStatus] = js.undefined,
        SubmitTime: js.UndefOr[Timestamp] = js.undefined,
        TrainingEndTime: js.UndefOr[Timestamp] = js.undefined,
        TrainingStartTime: js.UndefOr[Timestamp] = js.undefined,
        VolumeKmsKeyId: js.UndefOr[KmsKeyId] = js.undefined,
        VpcConfig: js.UndefOr[VpcConfig] = js.undefined
    ): DocumentClassifierProperties = {
      val __obj = js.Dictionary.empty[js.Any]
      ClassifierMetadata.foreach(__v => __obj.update("ClassifierMetadata", __v.asInstanceOf[js.Any]))
      DataAccessRoleArn.foreach(__v => __obj.update("DataAccessRoleArn", __v.asInstanceOf[js.Any]))
      DocumentClassifierArn.foreach(__v => __obj.update("DocumentClassifierArn", __v.asInstanceOf[js.Any]))
      EndTime.foreach(__v => __obj.update("EndTime", __v.asInstanceOf[js.Any]))
      InputDataConfig.foreach(__v => __obj.update("InputDataConfig", __v.asInstanceOf[js.Any]))
      LanguageCode.foreach(__v => __obj.update("LanguageCode", __v.asInstanceOf[js.Any]))
      Message.foreach(__v => __obj.update("Message", __v.asInstanceOf[js.Any]))
      OutputDataConfig.foreach(__v => __obj.update("OutputDataConfig", __v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.update("Status", __v.asInstanceOf[js.Any]))
      SubmitTime.foreach(__v => __obj.update("SubmitTime", __v.asInstanceOf[js.Any]))
      TrainingEndTime.foreach(__v => __obj.update("TrainingEndTime", __v.asInstanceOf[js.Any]))
      TrainingStartTime.foreach(__v => __obj.update("TrainingStartTime", __v.asInstanceOf[js.Any]))
      VolumeKmsKeyId.foreach(__v => __obj.update("VolumeKmsKeyId", __v.asInstanceOf[js.Any]))
      VpcConfig.foreach(__v => __obj.update("VpcConfig", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DocumentClassifierProperties]
    }
  }

  /**
    * Returns the code for the dominant language in the input text and the level of confidence that Amazon Comprehend has in the accuracy of the detection.
    */
  @js.native
  trait DominantLanguage extends js.Object {
    var LanguageCode: js.UndefOr[String]
    var Score: js.UndefOr[Float]
  }

  object DominantLanguage {
    def apply(
        LanguageCode: js.UndefOr[String] = js.undefined,
        Score: js.UndefOr[Float] = js.undefined
    ): DominantLanguage = {
      val __obj = js.Dictionary.empty[js.Any]
      LanguageCode.foreach(__v => __obj.update("LanguageCode", __v.asInstanceOf[js.Any]))
      Score.foreach(__v => __obj.update("Score", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DominantLanguage]
    }
  }

  /**
    * Provides information for filtering a list of dominant language detection jobs. For more information, see the operation.
    */
  @js.native
  trait DominantLanguageDetectionJobFilter extends js.Object {
    var JobName: js.UndefOr[JobName]
    var JobStatus: js.UndefOr[JobStatus]
    var SubmitTimeAfter: js.UndefOr[Timestamp]
    var SubmitTimeBefore: js.UndefOr[Timestamp]
  }

  object DominantLanguageDetectionJobFilter {
    def apply(
        JobName: js.UndefOr[JobName] = js.undefined,
        JobStatus: js.UndefOr[JobStatus] = js.undefined,
        SubmitTimeAfter: js.UndefOr[Timestamp] = js.undefined,
        SubmitTimeBefore: js.UndefOr[Timestamp] = js.undefined
    ): DominantLanguageDetectionJobFilter = {
      val __obj = js.Dictionary.empty[js.Any]
      JobName.foreach(__v => __obj.update("JobName", __v.asInstanceOf[js.Any]))
      JobStatus.foreach(__v => __obj.update("JobStatus", __v.asInstanceOf[js.Any]))
      SubmitTimeAfter.foreach(__v => __obj.update("SubmitTimeAfter", __v.asInstanceOf[js.Any]))
      SubmitTimeBefore.foreach(__v => __obj.update("SubmitTimeBefore", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DominantLanguageDetectionJobFilter]
    }
  }

  /**
    * Provides information about a dominant language detection job.
    */
  @js.native
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

  object DominantLanguageDetectionJobProperties {
    def apply(
        DataAccessRoleArn: js.UndefOr[IamRoleArn] = js.undefined,
        EndTime: js.UndefOr[Timestamp] = js.undefined,
        InputDataConfig: js.UndefOr[InputDataConfig] = js.undefined,
        JobId: js.UndefOr[JobId] = js.undefined,
        JobName: js.UndefOr[JobName] = js.undefined,
        JobStatus: js.UndefOr[JobStatus] = js.undefined,
        Message: js.UndefOr[AnyLengthString] = js.undefined,
        OutputDataConfig: js.UndefOr[OutputDataConfig] = js.undefined,
        SubmitTime: js.UndefOr[Timestamp] = js.undefined,
        VolumeKmsKeyId: js.UndefOr[KmsKeyId] = js.undefined,
        VpcConfig: js.UndefOr[VpcConfig] = js.undefined
    ): DominantLanguageDetectionJobProperties = {
      val __obj = js.Dictionary.empty[js.Any]
      DataAccessRoleArn.foreach(__v => __obj.update("DataAccessRoleArn", __v.asInstanceOf[js.Any]))
      EndTime.foreach(__v => __obj.update("EndTime", __v.asInstanceOf[js.Any]))
      InputDataConfig.foreach(__v => __obj.update("InputDataConfig", __v.asInstanceOf[js.Any]))
      JobId.foreach(__v => __obj.update("JobId", __v.asInstanceOf[js.Any]))
      JobName.foreach(__v => __obj.update("JobName", __v.asInstanceOf[js.Any]))
      JobStatus.foreach(__v => __obj.update("JobStatus", __v.asInstanceOf[js.Any]))
      Message.foreach(__v => __obj.update("Message", __v.asInstanceOf[js.Any]))
      OutputDataConfig.foreach(__v => __obj.update("OutputDataConfig", __v.asInstanceOf[js.Any]))
      SubmitTime.foreach(__v => __obj.update("SubmitTime", __v.asInstanceOf[js.Any]))
      VolumeKmsKeyId.foreach(__v => __obj.update("VolumeKmsKeyId", __v.asInstanceOf[js.Any]))
      VpcConfig.foreach(__v => __obj.update("VpcConfig", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DominantLanguageDetectionJobProperties]
    }
  }

  /**
    * Provides information for filtering a list of dominant language detection jobs. For more information, see the operation.
    */
  @js.native
  trait EntitiesDetectionJobFilter extends js.Object {
    var JobName: js.UndefOr[JobName]
    var JobStatus: js.UndefOr[JobStatus]
    var SubmitTimeAfter: js.UndefOr[Timestamp]
    var SubmitTimeBefore: js.UndefOr[Timestamp]
  }

  object EntitiesDetectionJobFilter {
    def apply(
        JobName: js.UndefOr[JobName] = js.undefined,
        JobStatus: js.UndefOr[JobStatus] = js.undefined,
        SubmitTimeAfter: js.UndefOr[Timestamp] = js.undefined,
        SubmitTimeBefore: js.UndefOr[Timestamp] = js.undefined
    ): EntitiesDetectionJobFilter = {
      val __obj = js.Dictionary.empty[js.Any]
      JobName.foreach(__v => __obj.update("JobName", __v.asInstanceOf[js.Any]))
      JobStatus.foreach(__v => __obj.update("JobStatus", __v.asInstanceOf[js.Any]))
      SubmitTimeAfter.foreach(__v => __obj.update("SubmitTimeAfter", __v.asInstanceOf[js.Any]))
      SubmitTimeBefore.foreach(__v => __obj.update("SubmitTimeBefore", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EntitiesDetectionJobFilter]
    }
  }

  /**
    * Provides information about an entities detection job.
    */
  @js.native
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

  object EntitiesDetectionJobProperties {
    def apply(
        DataAccessRoleArn: js.UndefOr[IamRoleArn] = js.undefined,
        EndTime: js.UndefOr[Timestamp] = js.undefined,
        EntityRecognizerArn: js.UndefOr[EntityRecognizerArn] = js.undefined,
        InputDataConfig: js.UndefOr[InputDataConfig] = js.undefined,
        JobId: js.UndefOr[JobId] = js.undefined,
        JobName: js.UndefOr[JobName] = js.undefined,
        JobStatus: js.UndefOr[JobStatus] = js.undefined,
        LanguageCode: js.UndefOr[LanguageCode] = js.undefined,
        Message: js.UndefOr[AnyLengthString] = js.undefined,
        OutputDataConfig: js.UndefOr[OutputDataConfig] = js.undefined,
        SubmitTime: js.UndefOr[Timestamp] = js.undefined,
        VolumeKmsKeyId: js.UndefOr[KmsKeyId] = js.undefined,
        VpcConfig: js.UndefOr[VpcConfig] = js.undefined
    ): EntitiesDetectionJobProperties = {
      val __obj = js.Dictionary.empty[js.Any]
      DataAccessRoleArn.foreach(__v => __obj.update("DataAccessRoleArn", __v.asInstanceOf[js.Any]))
      EndTime.foreach(__v => __obj.update("EndTime", __v.asInstanceOf[js.Any]))
      EntityRecognizerArn.foreach(__v => __obj.update("EntityRecognizerArn", __v.asInstanceOf[js.Any]))
      InputDataConfig.foreach(__v => __obj.update("InputDataConfig", __v.asInstanceOf[js.Any]))
      JobId.foreach(__v => __obj.update("JobId", __v.asInstanceOf[js.Any]))
      JobName.foreach(__v => __obj.update("JobName", __v.asInstanceOf[js.Any]))
      JobStatus.foreach(__v => __obj.update("JobStatus", __v.asInstanceOf[js.Any]))
      LanguageCode.foreach(__v => __obj.update("LanguageCode", __v.asInstanceOf[js.Any]))
      Message.foreach(__v => __obj.update("Message", __v.asInstanceOf[js.Any]))
      OutputDataConfig.foreach(__v => __obj.update("OutputDataConfig", __v.asInstanceOf[js.Any]))
      SubmitTime.foreach(__v => __obj.update("SubmitTime", __v.asInstanceOf[js.Any]))
      VolumeKmsKeyId.foreach(__v => __obj.update("VolumeKmsKeyId", __v.asInstanceOf[js.Any]))
      VpcConfig.foreach(__v => __obj.update("VpcConfig", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EntitiesDetectionJobProperties]
    }
  }

  /**
    * Provides information about an entity.
    *
    */
  @js.native
  trait Entity extends js.Object {
    var BeginOffset: js.UndefOr[Int]
    var EndOffset: js.UndefOr[Int]
    var Score: js.UndefOr[Float]
    var Text: js.UndefOr[String]
    var Type: js.UndefOr[EntityType]
  }

  object Entity {
    def apply(
        BeginOffset: js.UndefOr[Int] = js.undefined,
        EndOffset: js.UndefOr[Int] = js.undefined,
        Score: js.UndefOr[Float] = js.undefined,
        Text: js.UndefOr[String] = js.undefined,
        Type: js.UndefOr[EntityType] = js.undefined
    ): Entity = {
      val __obj = js.Dictionary.empty[js.Any]
      BeginOffset.foreach(__v => __obj.update("BeginOffset", __v.asInstanceOf[js.Any]))
      EndOffset.foreach(__v => __obj.update("EndOffset", __v.asInstanceOf[js.Any]))
      Score.foreach(__v => __obj.update("Score", __v.asInstanceOf[js.Any]))
      Text.foreach(__v => __obj.update("Text", __v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.update("Type", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Entity]
    }
  }

  /**
    * Describes the annotations associated with a entity recognizer.
    */
  @js.native
  trait EntityRecognizerAnnotations extends js.Object {
    var S3Uri: S3Uri
  }

  object EntityRecognizerAnnotations {
    def apply(
        S3Uri: S3Uri
    ): EntityRecognizerAnnotations = {
      val __obj = js.Dictionary[js.Any](
        "S3Uri" -> S3Uri.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[EntityRecognizerAnnotations]
    }
  }

  /**
    * Describes the training documents submitted with an entity recognizer.
    */
  @js.native
  trait EntityRecognizerDocuments extends js.Object {
    var S3Uri: S3Uri
  }

  object EntityRecognizerDocuments {
    def apply(
        S3Uri: S3Uri
    ): EntityRecognizerDocuments = {
      val __obj = js.Dictionary[js.Any](
        "S3Uri" -> S3Uri.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[EntityRecognizerDocuments]
    }
  }

  /**
    * Describes the entity recognizer submitted with an entity recognizer.
    */
  @js.native
  trait EntityRecognizerEntityList extends js.Object {
    var S3Uri: S3Uri
  }

  object EntityRecognizerEntityList {
    def apply(
        S3Uri: S3Uri
    ): EntityRecognizerEntityList = {
      val __obj = js.Dictionary[js.Any](
        "S3Uri" -> S3Uri.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[EntityRecognizerEntityList]
    }
  }

  /**
    * Detailed information about the accuracy of an entity recognizer.
    */
  @js.native
  trait EntityRecognizerEvaluationMetrics extends js.Object {
    var F1Score: js.UndefOr[Double]
    var Precision: js.UndefOr[Double]
    var Recall: js.UndefOr[Double]
  }

  object EntityRecognizerEvaluationMetrics {
    def apply(
        F1Score: js.UndefOr[Double] = js.undefined,
        Precision: js.UndefOr[Double] = js.undefined,
        Recall: js.UndefOr[Double] = js.undefined
    ): EntityRecognizerEvaluationMetrics = {
      val __obj = js.Dictionary.empty[js.Any]
      F1Score.foreach(__v => __obj.update("F1Score", __v.asInstanceOf[js.Any]))
      Precision.foreach(__v => __obj.update("Precision", __v.asInstanceOf[js.Any]))
      Recall.foreach(__v => __obj.update("Recall", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EntityRecognizerEvaluationMetrics]
    }
  }

  /**
    * Provides information for filtering a list of entity recognizers. You can only specify one filtering parameter in a request. For more information, see the operation./&gt;
    */
  @js.native
  trait EntityRecognizerFilter extends js.Object {
    var Status: js.UndefOr[ModelStatus]
    var SubmitTimeAfter: js.UndefOr[Timestamp]
    var SubmitTimeBefore: js.UndefOr[Timestamp]
  }

  object EntityRecognizerFilter {
    def apply(
        Status: js.UndefOr[ModelStatus] = js.undefined,
        SubmitTimeAfter: js.UndefOr[Timestamp] = js.undefined,
        SubmitTimeBefore: js.UndefOr[Timestamp] = js.undefined
    ): EntityRecognizerFilter = {
      val __obj = js.Dictionary.empty[js.Any]
      Status.foreach(__v => __obj.update("Status", __v.asInstanceOf[js.Any]))
      SubmitTimeAfter.foreach(__v => __obj.update("SubmitTimeAfter", __v.asInstanceOf[js.Any]))
      SubmitTimeBefore.foreach(__v => __obj.update("SubmitTimeBefore", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EntityRecognizerFilter]
    }
  }

  /**
    * Specifies the format and location of the input data.
    */
  @js.native
  trait EntityRecognizerInputDataConfig extends js.Object {
    var Documents: EntityRecognizerDocuments
    var EntityTypes: EntityTypesList
    var Annotations: js.UndefOr[EntityRecognizerAnnotations]
    var EntityList: js.UndefOr[EntityRecognizerEntityList]
  }

  object EntityRecognizerInputDataConfig {
    def apply(
        Documents: EntityRecognizerDocuments,
        EntityTypes: EntityTypesList,
        Annotations: js.UndefOr[EntityRecognizerAnnotations] = js.undefined,
        EntityList: js.UndefOr[EntityRecognizerEntityList] = js.undefined
    ): EntityRecognizerInputDataConfig = {
      val __obj = js.Dictionary[js.Any](
        "Documents"   -> Documents.asInstanceOf[js.Any],
        "EntityTypes" -> EntityTypes.asInstanceOf[js.Any]
      )

      Annotations.foreach(__v => __obj.update("Annotations", __v.asInstanceOf[js.Any]))
      EntityList.foreach(__v => __obj.update("EntityList", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EntityRecognizerInputDataConfig]
    }
  }

  /**
    * Detailed information about an entity recognizer.
    */
  @js.native
  trait EntityRecognizerMetadata extends js.Object {
    var EntityTypes: js.UndefOr[EntityRecognizerMetadataEntityTypesList]
    var EvaluationMetrics: js.UndefOr[EntityRecognizerEvaluationMetrics]
    var NumberOfTestDocuments: js.UndefOr[Int]
    var NumberOfTrainedDocuments: js.UndefOr[Int]
  }

  object EntityRecognizerMetadata {
    def apply(
        EntityTypes: js.UndefOr[EntityRecognizerMetadataEntityTypesList] = js.undefined,
        EvaluationMetrics: js.UndefOr[EntityRecognizerEvaluationMetrics] = js.undefined,
        NumberOfTestDocuments: js.UndefOr[Int] = js.undefined,
        NumberOfTrainedDocuments: js.UndefOr[Int] = js.undefined
    ): EntityRecognizerMetadata = {
      val __obj = js.Dictionary.empty[js.Any]
      EntityTypes.foreach(__v => __obj.update("EntityTypes", __v.asInstanceOf[js.Any]))
      EvaluationMetrics.foreach(__v => __obj.update("EvaluationMetrics", __v.asInstanceOf[js.Any]))
      NumberOfTestDocuments.foreach(__v => __obj.update("NumberOfTestDocuments", __v.asInstanceOf[js.Any]))
      NumberOfTrainedDocuments.foreach(__v => __obj.update("NumberOfTrainedDocuments", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EntityRecognizerMetadata]
    }
  }

  /**
    * Individual item from the list of entity types in the metadata of an entity recognizer.
    */
  @js.native
  trait EntityRecognizerMetadataEntityTypesListItem extends js.Object {
    var EvaluationMetrics: js.UndefOr[EntityTypesEvaluationMetrics]
    var NumberOfTrainMentions: js.UndefOr[Int]
    var Type: js.UndefOr[AnyLengthString]
  }

  object EntityRecognizerMetadataEntityTypesListItem {
    def apply(
        EvaluationMetrics: js.UndefOr[EntityTypesEvaluationMetrics] = js.undefined,
        NumberOfTrainMentions: js.UndefOr[Int] = js.undefined,
        Type: js.UndefOr[AnyLengthString] = js.undefined
    ): EntityRecognizerMetadataEntityTypesListItem = {
      val __obj = js.Dictionary.empty[js.Any]
      EvaluationMetrics.foreach(__v => __obj.update("EvaluationMetrics", __v.asInstanceOf[js.Any]))
      NumberOfTrainMentions.foreach(__v => __obj.update("NumberOfTrainMentions", __v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.update("Type", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EntityRecognizerMetadataEntityTypesListItem]
    }
  }

  /**
    * Describes information about an entity recognizer.
    */
  @js.native
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

  object EntityRecognizerProperties {
    def apply(
        DataAccessRoleArn: js.UndefOr[IamRoleArn] = js.undefined,
        EndTime: js.UndefOr[Timestamp] = js.undefined,
        EntityRecognizerArn: js.UndefOr[EntityRecognizerArn] = js.undefined,
        InputDataConfig: js.UndefOr[EntityRecognizerInputDataConfig] = js.undefined,
        LanguageCode: js.UndefOr[LanguageCode] = js.undefined,
        Message: js.UndefOr[AnyLengthString] = js.undefined,
        RecognizerMetadata: js.UndefOr[EntityRecognizerMetadata] = js.undefined,
        Status: js.UndefOr[ModelStatus] = js.undefined,
        SubmitTime: js.UndefOr[Timestamp] = js.undefined,
        TrainingEndTime: js.UndefOr[Timestamp] = js.undefined,
        TrainingStartTime: js.UndefOr[Timestamp] = js.undefined,
        VolumeKmsKeyId: js.UndefOr[KmsKeyId] = js.undefined,
        VpcConfig: js.UndefOr[VpcConfig] = js.undefined
    ): EntityRecognizerProperties = {
      val __obj = js.Dictionary.empty[js.Any]
      DataAccessRoleArn.foreach(__v => __obj.update("DataAccessRoleArn", __v.asInstanceOf[js.Any]))
      EndTime.foreach(__v => __obj.update("EndTime", __v.asInstanceOf[js.Any]))
      EntityRecognizerArn.foreach(__v => __obj.update("EntityRecognizerArn", __v.asInstanceOf[js.Any]))
      InputDataConfig.foreach(__v => __obj.update("InputDataConfig", __v.asInstanceOf[js.Any]))
      LanguageCode.foreach(__v => __obj.update("LanguageCode", __v.asInstanceOf[js.Any]))
      Message.foreach(__v => __obj.update("Message", __v.asInstanceOf[js.Any]))
      RecognizerMetadata.foreach(__v => __obj.update("RecognizerMetadata", __v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.update("Status", __v.asInstanceOf[js.Any]))
      SubmitTime.foreach(__v => __obj.update("SubmitTime", __v.asInstanceOf[js.Any]))
      TrainingEndTime.foreach(__v => __obj.update("TrainingEndTime", __v.asInstanceOf[js.Any]))
      TrainingStartTime.foreach(__v => __obj.update("TrainingStartTime", __v.asInstanceOf[js.Any]))
      VolumeKmsKeyId.foreach(__v => __obj.update("VolumeKmsKeyId", __v.asInstanceOf[js.Any]))
      VpcConfig.foreach(__v => __obj.update("VpcConfig", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EntityRecognizerProperties]
    }
  }

  object EntityTypeEnum {
    val PERSON          = "PERSON"
    val LOCATION        = "LOCATION"
    val ORGANIZATION    = "ORGANIZATION"
    val COMMERCIAL_ITEM = "COMMERCIAL_ITEM"
    val EVENT           = "EVENT"
    val DATE            = "DATE"
    val QUANTITY        = "QUANTITY"
    val TITLE           = "TITLE"
    val OTHER           = "OTHER"

    val values = IndexedSeq(PERSON, LOCATION, ORGANIZATION, COMMERCIAL_ITEM, EVENT, DATE, QUANTITY, TITLE, OTHER)
  }

  /**
    * Detailed information about the accuracy of an entity recognizer for a specific entity type.
    */
  @js.native
  trait EntityTypesEvaluationMetrics extends js.Object {
    var F1Score: js.UndefOr[Double]
    var Precision: js.UndefOr[Double]
    var Recall: js.UndefOr[Double]
  }

  object EntityTypesEvaluationMetrics {
    def apply(
        F1Score: js.UndefOr[Double] = js.undefined,
        Precision: js.UndefOr[Double] = js.undefined,
        Recall: js.UndefOr[Double] = js.undefined
    ): EntityTypesEvaluationMetrics = {
      val __obj = js.Dictionary.empty[js.Any]
      F1Score.foreach(__v => __obj.update("F1Score", __v.asInstanceOf[js.Any]))
      Precision.foreach(__v => __obj.update("Precision", __v.asInstanceOf[js.Any]))
      Recall.foreach(__v => __obj.update("Recall", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EntityTypesEvaluationMetrics]
    }
  }

  /**
    * Information about an individual item on a list of entity types.
    */
  @js.native
  trait EntityTypesListItem extends js.Object {
    var Type: EntityTypeName
  }

  object EntityTypesListItem {
    def apply(
        Type: EntityTypeName
    ): EntityTypesListItem = {
      val __obj = js.Dictionary[js.Any](
        "Type" -> Type.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[EntityTypesListItem]
    }
  }

  /**
    * The input properties for a topic detection job.
    */
  @js.native
  trait InputDataConfig extends js.Object {
    var S3Uri: S3Uri
    var InputFormat: js.UndefOr[InputFormat]
  }

  object InputDataConfig {
    def apply(
        S3Uri: S3Uri,
        InputFormat: js.UndefOr[InputFormat] = js.undefined
    ): InputDataConfig = {
      val __obj = js.Dictionary[js.Any](
        "S3Uri" -> S3Uri.asInstanceOf[js.Any]
      )

      InputFormat.foreach(__v => __obj.update("InputFormat", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InputDataConfig]
    }
  }

  object InputFormatEnum {
    val ONE_DOC_PER_FILE = "ONE_DOC_PER_FILE"
    val ONE_DOC_PER_LINE = "ONE_DOC_PER_LINE"

    val values = IndexedSeq(ONE_DOC_PER_FILE, ONE_DOC_PER_LINE)
  }

  object JobStatusEnum {
    val SUBMITTED      = "SUBMITTED"
    val IN_PROGRESS    = "IN_PROGRESS"
    val COMPLETED      = "COMPLETED"
    val FAILED         = "FAILED"
    val STOP_REQUESTED = "STOP_REQUESTED"
    val STOPPED        = "STOPPED"

    val values = IndexedSeq(SUBMITTED, IN_PROGRESS, COMPLETED, FAILED, STOP_REQUESTED, STOPPED)
  }

  /**
    * Describes a key noun phrase.
    */
  @js.native
  trait KeyPhrase extends js.Object {
    var BeginOffset: js.UndefOr[Int]
    var EndOffset: js.UndefOr[Int]
    var Score: js.UndefOr[Float]
    var Text: js.UndefOr[String]
  }

  object KeyPhrase {
    def apply(
        BeginOffset: js.UndefOr[Int] = js.undefined,
        EndOffset: js.UndefOr[Int] = js.undefined,
        Score: js.UndefOr[Float] = js.undefined,
        Text: js.UndefOr[String] = js.undefined
    ): KeyPhrase = {
      val __obj = js.Dictionary.empty[js.Any]
      BeginOffset.foreach(__v => __obj.update("BeginOffset", __v.asInstanceOf[js.Any]))
      EndOffset.foreach(__v => __obj.update("EndOffset", __v.asInstanceOf[js.Any]))
      Score.foreach(__v => __obj.update("Score", __v.asInstanceOf[js.Any]))
      Text.foreach(__v => __obj.update("Text", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[KeyPhrase]
    }
  }

  /**
    * Provides information for filtering a list of dominant language detection jobs. For more information, see the operation.
    */
  @js.native
  trait KeyPhrasesDetectionJobFilter extends js.Object {
    var JobName: js.UndefOr[JobName]
    var JobStatus: js.UndefOr[JobStatus]
    var SubmitTimeAfter: js.UndefOr[Timestamp]
    var SubmitTimeBefore: js.UndefOr[Timestamp]
  }

  object KeyPhrasesDetectionJobFilter {
    def apply(
        JobName: js.UndefOr[JobName] = js.undefined,
        JobStatus: js.UndefOr[JobStatus] = js.undefined,
        SubmitTimeAfter: js.UndefOr[Timestamp] = js.undefined,
        SubmitTimeBefore: js.UndefOr[Timestamp] = js.undefined
    ): KeyPhrasesDetectionJobFilter = {
      val __obj = js.Dictionary.empty[js.Any]
      JobName.foreach(__v => __obj.update("JobName", __v.asInstanceOf[js.Any]))
      JobStatus.foreach(__v => __obj.update("JobStatus", __v.asInstanceOf[js.Any]))
      SubmitTimeAfter.foreach(__v => __obj.update("SubmitTimeAfter", __v.asInstanceOf[js.Any]))
      SubmitTimeBefore.foreach(__v => __obj.update("SubmitTimeBefore", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[KeyPhrasesDetectionJobFilter]
    }
  }

  /**
    * Provides information about a key phrases detection job.
    */
  @js.native
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

  object KeyPhrasesDetectionJobProperties {
    def apply(
        DataAccessRoleArn: js.UndefOr[IamRoleArn] = js.undefined,
        EndTime: js.UndefOr[Timestamp] = js.undefined,
        InputDataConfig: js.UndefOr[InputDataConfig] = js.undefined,
        JobId: js.UndefOr[JobId] = js.undefined,
        JobName: js.UndefOr[JobName] = js.undefined,
        JobStatus: js.UndefOr[JobStatus] = js.undefined,
        LanguageCode: js.UndefOr[LanguageCode] = js.undefined,
        Message: js.UndefOr[AnyLengthString] = js.undefined,
        OutputDataConfig: js.UndefOr[OutputDataConfig] = js.undefined,
        SubmitTime: js.UndefOr[Timestamp] = js.undefined,
        VolumeKmsKeyId: js.UndefOr[KmsKeyId] = js.undefined,
        VpcConfig: js.UndefOr[VpcConfig] = js.undefined
    ): KeyPhrasesDetectionJobProperties = {
      val __obj = js.Dictionary.empty[js.Any]
      DataAccessRoleArn.foreach(__v => __obj.update("DataAccessRoleArn", __v.asInstanceOf[js.Any]))
      EndTime.foreach(__v => __obj.update("EndTime", __v.asInstanceOf[js.Any]))
      InputDataConfig.foreach(__v => __obj.update("InputDataConfig", __v.asInstanceOf[js.Any]))
      JobId.foreach(__v => __obj.update("JobId", __v.asInstanceOf[js.Any]))
      JobName.foreach(__v => __obj.update("JobName", __v.asInstanceOf[js.Any]))
      JobStatus.foreach(__v => __obj.update("JobStatus", __v.asInstanceOf[js.Any]))
      LanguageCode.foreach(__v => __obj.update("LanguageCode", __v.asInstanceOf[js.Any]))
      Message.foreach(__v => __obj.update("Message", __v.asInstanceOf[js.Any]))
      OutputDataConfig.foreach(__v => __obj.update("OutputDataConfig", __v.asInstanceOf[js.Any]))
      SubmitTime.foreach(__v => __obj.update("SubmitTime", __v.asInstanceOf[js.Any]))
      VolumeKmsKeyId.foreach(__v => __obj.update("VolumeKmsKeyId", __v.asInstanceOf[js.Any]))
      VpcConfig.foreach(__v => __obj.update("VpcConfig", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[KeyPhrasesDetectionJobProperties]
    }
  }

  object LanguageCodeEnum {
    val en = "en"
    val es = "es"
    val fr = "fr"
    val de = "de"
    val it = "it"
    val pt = "pt"

    val values = IndexedSeq(en, es, fr, de, it, pt)
  }

  @js.native
  trait ListDocumentClassificationJobsRequest extends js.Object {
    var Filter: js.UndefOr[DocumentClassificationJobFilter]
    var MaxResults: js.UndefOr[MaxResultsInteger]
    var NextToken: js.UndefOr[String]
  }

  object ListDocumentClassificationJobsRequest {
    def apply(
        Filter: js.UndefOr[DocumentClassificationJobFilter] = js.undefined,
        MaxResults: js.UndefOr[MaxResultsInteger] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListDocumentClassificationJobsRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      Filter.foreach(__v => __obj.update("Filter", __v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDocumentClassificationJobsRequest]
    }
  }

  @js.native
  trait ListDocumentClassificationJobsResponse extends js.Object {
    var DocumentClassificationJobPropertiesList: js.UndefOr[DocumentClassificationJobPropertiesList]
    var NextToken: js.UndefOr[String]
  }

  object ListDocumentClassificationJobsResponse {
    def apply(
        DocumentClassificationJobPropertiesList: js.UndefOr[DocumentClassificationJobPropertiesList] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListDocumentClassificationJobsResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      DocumentClassificationJobPropertiesList.foreach(
        __v => __obj.update("DocumentClassificationJobPropertiesList", __v.asInstanceOf[js.Any])
      )
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDocumentClassificationJobsResponse]
    }
  }

  @js.native
  trait ListDocumentClassifiersRequest extends js.Object {
    var Filter: js.UndefOr[DocumentClassifierFilter]
    var MaxResults: js.UndefOr[MaxResultsInteger]
    var NextToken: js.UndefOr[String]
  }

  object ListDocumentClassifiersRequest {
    def apply(
        Filter: js.UndefOr[DocumentClassifierFilter] = js.undefined,
        MaxResults: js.UndefOr[MaxResultsInteger] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListDocumentClassifiersRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      Filter.foreach(__v => __obj.update("Filter", __v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDocumentClassifiersRequest]
    }
  }

  @js.native
  trait ListDocumentClassifiersResponse extends js.Object {
    var DocumentClassifierPropertiesList: js.UndefOr[DocumentClassifierPropertiesList]
    var NextToken: js.UndefOr[String]
  }

  object ListDocumentClassifiersResponse {
    def apply(
        DocumentClassifierPropertiesList: js.UndefOr[DocumentClassifierPropertiesList] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListDocumentClassifiersResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      DocumentClassifierPropertiesList.foreach(
        __v => __obj.update("DocumentClassifierPropertiesList", __v.asInstanceOf[js.Any])
      )
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDocumentClassifiersResponse]
    }
  }

  @js.native
  trait ListDominantLanguageDetectionJobsRequest extends js.Object {
    var Filter: js.UndefOr[DominantLanguageDetectionJobFilter]
    var MaxResults: js.UndefOr[MaxResultsInteger]
    var NextToken: js.UndefOr[String]
  }

  object ListDominantLanguageDetectionJobsRequest {
    def apply(
        Filter: js.UndefOr[DominantLanguageDetectionJobFilter] = js.undefined,
        MaxResults: js.UndefOr[MaxResultsInteger] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListDominantLanguageDetectionJobsRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      Filter.foreach(__v => __obj.update("Filter", __v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDominantLanguageDetectionJobsRequest]
    }
  }

  @js.native
  trait ListDominantLanguageDetectionJobsResponse extends js.Object {
    var DominantLanguageDetectionJobPropertiesList: js.UndefOr[DominantLanguageDetectionJobPropertiesList]
    var NextToken: js.UndefOr[String]
  }

  object ListDominantLanguageDetectionJobsResponse {
    def apply(
        DominantLanguageDetectionJobPropertiesList: js.UndefOr[DominantLanguageDetectionJobPropertiesList] =
          js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListDominantLanguageDetectionJobsResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      DominantLanguageDetectionJobPropertiesList.foreach(
        __v => __obj.update("DominantLanguageDetectionJobPropertiesList", __v.asInstanceOf[js.Any])
      )
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDominantLanguageDetectionJobsResponse]
    }
  }

  @js.native
  trait ListEntitiesDetectionJobsRequest extends js.Object {
    var Filter: js.UndefOr[EntitiesDetectionJobFilter]
    var MaxResults: js.UndefOr[MaxResultsInteger]
    var NextToken: js.UndefOr[String]
  }

  object ListEntitiesDetectionJobsRequest {
    def apply(
        Filter: js.UndefOr[EntitiesDetectionJobFilter] = js.undefined,
        MaxResults: js.UndefOr[MaxResultsInteger] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListEntitiesDetectionJobsRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      Filter.foreach(__v => __obj.update("Filter", __v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListEntitiesDetectionJobsRequest]
    }
  }

  @js.native
  trait ListEntitiesDetectionJobsResponse extends js.Object {
    var EntitiesDetectionJobPropertiesList: js.UndefOr[EntitiesDetectionJobPropertiesList]
    var NextToken: js.UndefOr[String]
  }

  object ListEntitiesDetectionJobsResponse {
    def apply(
        EntitiesDetectionJobPropertiesList: js.UndefOr[EntitiesDetectionJobPropertiesList] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListEntitiesDetectionJobsResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      EntitiesDetectionJobPropertiesList.foreach(
        __v => __obj.update("EntitiesDetectionJobPropertiesList", __v.asInstanceOf[js.Any])
      )
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListEntitiesDetectionJobsResponse]
    }
  }

  @js.native
  trait ListEntityRecognizersRequest extends js.Object {
    var Filter: js.UndefOr[EntityRecognizerFilter]
    var MaxResults: js.UndefOr[MaxResultsInteger]
    var NextToken: js.UndefOr[String]
  }

  object ListEntityRecognizersRequest {
    def apply(
        Filter: js.UndefOr[EntityRecognizerFilter] = js.undefined,
        MaxResults: js.UndefOr[MaxResultsInteger] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListEntityRecognizersRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      Filter.foreach(__v => __obj.update("Filter", __v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListEntityRecognizersRequest]
    }
  }

  @js.native
  trait ListEntityRecognizersResponse extends js.Object {
    var EntityRecognizerPropertiesList: js.UndefOr[EntityRecognizerPropertiesList]
    var NextToken: js.UndefOr[String]
  }

  object ListEntityRecognizersResponse {
    def apply(
        EntityRecognizerPropertiesList: js.UndefOr[EntityRecognizerPropertiesList] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListEntityRecognizersResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      EntityRecognizerPropertiesList.foreach(
        __v => __obj.update("EntityRecognizerPropertiesList", __v.asInstanceOf[js.Any])
      )
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListEntityRecognizersResponse]
    }
  }

  @js.native
  trait ListKeyPhrasesDetectionJobsRequest extends js.Object {
    var Filter: js.UndefOr[KeyPhrasesDetectionJobFilter]
    var MaxResults: js.UndefOr[MaxResultsInteger]
    var NextToken: js.UndefOr[String]
  }

  object ListKeyPhrasesDetectionJobsRequest {
    def apply(
        Filter: js.UndefOr[KeyPhrasesDetectionJobFilter] = js.undefined,
        MaxResults: js.UndefOr[MaxResultsInteger] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListKeyPhrasesDetectionJobsRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      Filter.foreach(__v => __obj.update("Filter", __v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListKeyPhrasesDetectionJobsRequest]
    }
  }

  @js.native
  trait ListKeyPhrasesDetectionJobsResponse extends js.Object {
    var KeyPhrasesDetectionJobPropertiesList: js.UndefOr[KeyPhrasesDetectionJobPropertiesList]
    var NextToken: js.UndefOr[String]
  }

  object ListKeyPhrasesDetectionJobsResponse {
    def apply(
        KeyPhrasesDetectionJobPropertiesList: js.UndefOr[KeyPhrasesDetectionJobPropertiesList] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListKeyPhrasesDetectionJobsResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      KeyPhrasesDetectionJobPropertiesList.foreach(
        __v => __obj.update("KeyPhrasesDetectionJobPropertiesList", __v.asInstanceOf[js.Any])
      )
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListKeyPhrasesDetectionJobsResponse]
    }
  }

  @js.native
  trait ListSentimentDetectionJobsRequest extends js.Object {
    var Filter: js.UndefOr[SentimentDetectionJobFilter]
    var MaxResults: js.UndefOr[MaxResultsInteger]
    var NextToken: js.UndefOr[String]
  }

  object ListSentimentDetectionJobsRequest {
    def apply(
        Filter: js.UndefOr[SentimentDetectionJobFilter] = js.undefined,
        MaxResults: js.UndefOr[MaxResultsInteger] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListSentimentDetectionJobsRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      Filter.foreach(__v => __obj.update("Filter", __v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSentimentDetectionJobsRequest]
    }
  }

  @js.native
  trait ListSentimentDetectionJobsResponse extends js.Object {
    var NextToken: js.UndefOr[String]
    var SentimentDetectionJobPropertiesList: js.UndefOr[SentimentDetectionJobPropertiesList]
  }

  object ListSentimentDetectionJobsResponse {
    def apply(
        NextToken: js.UndefOr[String] = js.undefined,
        SentimentDetectionJobPropertiesList: js.UndefOr[SentimentDetectionJobPropertiesList] = js.undefined
    ): ListSentimentDetectionJobsResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      SentimentDetectionJobPropertiesList.foreach(
        __v => __obj.update("SentimentDetectionJobPropertiesList", __v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[ListSentimentDetectionJobsResponse]
    }
  }

  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var ResourceArn: ComprehendArn
  }

  object ListTagsForResourceRequest {
    def apply(
        ResourceArn: ComprehendArn
    ): ListTagsForResourceRequest = {
      val __obj = js.Dictionary[js.Any](
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ListTagsForResourceRequest]
    }
  }

  @js.native
  trait ListTagsForResourceResponse extends js.Object {
    var ResourceArn: js.UndefOr[ComprehendArn]
    var Tags: js.UndefOr[TagList]
  }

  object ListTagsForResourceResponse {
    def apply(
        ResourceArn: js.UndefOr[ComprehendArn] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): ListTagsForResourceResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      ResourceArn.foreach(__v => __obj.update("ResourceArn", __v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.update("Tags", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceResponse]
    }
  }

  @js.native
  trait ListTopicsDetectionJobsRequest extends js.Object {
    var Filter: js.UndefOr[TopicsDetectionJobFilter]
    var MaxResults: js.UndefOr[MaxResultsInteger]
    var NextToken: js.UndefOr[String]
  }

  object ListTopicsDetectionJobsRequest {
    def apply(
        Filter: js.UndefOr[TopicsDetectionJobFilter] = js.undefined,
        MaxResults: js.UndefOr[MaxResultsInteger] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListTopicsDetectionJobsRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      Filter.foreach(__v => __obj.update("Filter", __v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTopicsDetectionJobsRequest]
    }
  }

  @js.native
  trait ListTopicsDetectionJobsResponse extends js.Object {
    var NextToken: js.UndefOr[String]
    var TopicsDetectionJobPropertiesList: js.UndefOr[TopicsDetectionJobPropertiesList]
  }

  object ListTopicsDetectionJobsResponse {
    def apply(
        NextToken: js.UndefOr[String] = js.undefined,
        TopicsDetectionJobPropertiesList: js.UndefOr[TopicsDetectionJobPropertiesList] = js.undefined
    ): ListTopicsDetectionJobsResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      TopicsDetectionJobPropertiesList.foreach(
        __v => __obj.update("TopicsDetectionJobPropertiesList", __v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[ListTopicsDetectionJobsResponse]
    }
  }

  object ModelStatusEnum {
    val SUBMITTED      = "SUBMITTED"
    val TRAINING       = "TRAINING"
    val DELETING       = "DELETING"
    val STOP_REQUESTED = "STOP_REQUESTED"
    val STOPPED        = "STOPPED"
    val IN_ERROR       = "IN_ERROR"
    val TRAINED        = "TRAINED"

    val values = IndexedSeq(SUBMITTED, TRAINING, DELETING, STOP_REQUESTED, STOPPED, IN_ERROR, TRAINED)
  }

  /**
    * Provides configuration parameters for the output of topic detection jobs.
    *  <p/>
    */
  @js.native
  trait OutputDataConfig extends js.Object {
    var S3Uri: S3Uri
    var KmsKeyId: js.UndefOr[KmsKeyId]
  }

  object OutputDataConfig {
    def apply(
        S3Uri: S3Uri,
        KmsKeyId: js.UndefOr[KmsKeyId] = js.undefined
    ): OutputDataConfig = {
      val __obj = js.Dictionary[js.Any](
        "S3Uri" -> S3Uri.asInstanceOf[js.Any]
      )

      KmsKeyId.foreach(__v => __obj.update("KmsKeyId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OutputDataConfig]
    }
  }

  /**
    * Identifies the part of speech represented by the token and gives the confidence that Amazon Comprehend has that the part of speech was correctly identified. For more information about the parts of speech that Amazon Comprehend can identify, see <a>how-syntax</a>.
    */
  @js.native
  trait PartOfSpeechTag extends js.Object {
    var Score: js.UndefOr[Float]
    var Tag: js.UndefOr[PartOfSpeechTagType]
  }

  object PartOfSpeechTag {
    def apply(
        Score: js.UndefOr[Float] = js.undefined,
        Tag: js.UndefOr[PartOfSpeechTagType] = js.undefined
    ): PartOfSpeechTag = {
      val __obj = js.Dictionary.empty[js.Any]
      Score.foreach(__v => __obj.update("Score", __v.asInstanceOf[js.Any]))
      Tag.foreach(__v => __obj.update("Tag", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PartOfSpeechTag]
    }
  }

  object PartOfSpeechTagTypeEnum {
    val ADJ   = "ADJ"
    val ADP   = "ADP"
    val ADV   = "ADV"
    val AUX   = "AUX"
    val CONJ  = "CONJ"
    val CCONJ = "CCONJ"
    val DET   = "DET"
    val INTJ  = "INTJ"
    val NOUN  = "NOUN"
    val NUM   = "NUM"
    val O     = "O"
    val PART  = "PART"
    val PRON  = "PRON"
    val PROPN = "PROPN"
    val PUNCT = "PUNCT"
    val SCONJ = "SCONJ"
    val SYM   = "SYM"
    val VERB  = "VERB"

    val values =
      IndexedSeq(ADJ, ADP, ADV, AUX, CONJ, CCONJ, DET, INTJ, NOUN, NUM, O, PART, PRON, PROPN, PUNCT, SCONJ, SYM, VERB)
  }

  /**
    * Provides information for filtering a list of dominant language detection jobs. For more information, see the operation.
    */
  @js.native
  trait SentimentDetectionJobFilter extends js.Object {
    var JobName: js.UndefOr[JobName]
    var JobStatus: js.UndefOr[JobStatus]
    var SubmitTimeAfter: js.UndefOr[Timestamp]
    var SubmitTimeBefore: js.UndefOr[Timestamp]
  }

  object SentimentDetectionJobFilter {
    def apply(
        JobName: js.UndefOr[JobName] = js.undefined,
        JobStatus: js.UndefOr[JobStatus] = js.undefined,
        SubmitTimeAfter: js.UndefOr[Timestamp] = js.undefined,
        SubmitTimeBefore: js.UndefOr[Timestamp] = js.undefined
    ): SentimentDetectionJobFilter = {
      val __obj = js.Dictionary.empty[js.Any]
      JobName.foreach(__v => __obj.update("JobName", __v.asInstanceOf[js.Any]))
      JobStatus.foreach(__v => __obj.update("JobStatus", __v.asInstanceOf[js.Any]))
      SubmitTimeAfter.foreach(__v => __obj.update("SubmitTimeAfter", __v.asInstanceOf[js.Any]))
      SubmitTimeBefore.foreach(__v => __obj.update("SubmitTimeBefore", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SentimentDetectionJobFilter]
    }
  }

  /**
    * Provides information about a sentiment detection job.
    */
  @js.native
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

  object SentimentDetectionJobProperties {
    def apply(
        DataAccessRoleArn: js.UndefOr[IamRoleArn] = js.undefined,
        EndTime: js.UndefOr[Timestamp] = js.undefined,
        InputDataConfig: js.UndefOr[InputDataConfig] = js.undefined,
        JobId: js.UndefOr[JobId] = js.undefined,
        JobName: js.UndefOr[JobName] = js.undefined,
        JobStatus: js.UndefOr[JobStatus] = js.undefined,
        LanguageCode: js.UndefOr[LanguageCode] = js.undefined,
        Message: js.UndefOr[AnyLengthString] = js.undefined,
        OutputDataConfig: js.UndefOr[OutputDataConfig] = js.undefined,
        SubmitTime: js.UndefOr[Timestamp] = js.undefined,
        VolumeKmsKeyId: js.UndefOr[KmsKeyId] = js.undefined,
        VpcConfig: js.UndefOr[VpcConfig] = js.undefined
    ): SentimentDetectionJobProperties = {
      val __obj = js.Dictionary.empty[js.Any]
      DataAccessRoleArn.foreach(__v => __obj.update("DataAccessRoleArn", __v.asInstanceOf[js.Any]))
      EndTime.foreach(__v => __obj.update("EndTime", __v.asInstanceOf[js.Any]))
      InputDataConfig.foreach(__v => __obj.update("InputDataConfig", __v.asInstanceOf[js.Any]))
      JobId.foreach(__v => __obj.update("JobId", __v.asInstanceOf[js.Any]))
      JobName.foreach(__v => __obj.update("JobName", __v.asInstanceOf[js.Any]))
      JobStatus.foreach(__v => __obj.update("JobStatus", __v.asInstanceOf[js.Any]))
      LanguageCode.foreach(__v => __obj.update("LanguageCode", __v.asInstanceOf[js.Any]))
      Message.foreach(__v => __obj.update("Message", __v.asInstanceOf[js.Any]))
      OutputDataConfig.foreach(__v => __obj.update("OutputDataConfig", __v.asInstanceOf[js.Any]))
      SubmitTime.foreach(__v => __obj.update("SubmitTime", __v.asInstanceOf[js.Any]))
      VolumeKmsKeyId.foreach(__v => __obj.update("VolumeKmsKeyId", __v.asInstanceOf[js.Any]))
      VpcConfig.foreach(__v => __obj.update("VpcConfig", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SentimentDetectionJobProperties]
    }
  }

  /**
    * Describes the level of confidence that Amazon Comprehend has in the accuracy of its detection of sentiments.
    */
  @js.native
  trait SentimentScore extends js.Object {
    var Mixed: js.UndefOr[Float]
    var Negative: js.UndefOr[Float]
    var Neutral: js.UndefOr[Float]
    var Positive: js.UndefOr[Float]
  }

  object SentimentScore {
    def apply(
        Mixed: js.UndefOr[Float] = js.undefined,
        Negative: js.UndefOr[Float] = js.undefined,
        Neutral: js.UndefOr[Float] = js.undefined,
        Positive: js.UndefOr[Float] = js.undefined
    ): SentimentScore = {
      val __obj = js.Dictionary.empty[js.Any]
      Mixed.foreach(__v => __obj.update("Mixed", __v.asInstanceOf[js.Any]))
      Negative.foreach(__v => __obj.update("Negative", __v.asInstanceOf[js.Any]))
      Neutral.foreach(__v => __obj.update("Neutral", __v.asInstanceOf[js.Any]))
      Positive.foreach(__v => __obj.update("Positive", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SentimentScore]
    }
  }

  object SentimentTypeEnum {
    val POSITIVE = "POSITIVE"
    val NEGATIVE = "NEGATIVE"
    val NEUTRAL  = "NEUTRAL"
    val MIXED    = "MIXED"

    val values = IndexedSeq(POSITIVE, NEGATIVE, NEUTRAL, MIXED)
  }

  @js.native
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

  object StartDocumentClassificationJobRequest {
    def apply(
        DataAccessRoleArn: IamRoleArn,
        DocumentClassifierArn: DocumentClassifierArn,
        InputDataConfig: InputDataConfig,
        OutputDataConfig: OutputDataConfig,
        ClientRequestToken: js.UndefOr[ClientRequestTokenString] = js.undefined,
        JobName: js.UndefOr[JobName] = js.undefined,
        VolumeKmsKeyId: js.UndefOr[KmsKeyId] = js.undefined,
        VpcConfig: js.UndefOr[VpcConfig] = js.undefined
    ): StartDocumentClassificationJobRequest = {
      val __obj = js.Dictionary[js.Any](
        "DataAccessRoleArn"     -> DataAccessRoleArn.asInstanceOf[js.Any],
        "DocumentClassifierArn" -> DocumentClassifierArn.asInstanceOf[js.Any],
        "InputDataConfig"       -> InputDataConfig.asInstanceOf[js.Any],
        "OutputDataConfig"      -> OutputDataConfig.asInstanceOf[js.Any]
      )

      ClientRequestToken.foreach(__v => __obj.update("ClientRequestToken", __v.asInstanceOf[js.Any]))
      JobName.foreach(__v => __obj.update("JobName", __v.asInstanceOf[js.Any]))
      VolumeKmsKeyId.foreach(__v => __obj.update("VolumeKmsKeyId", __v.asInstanceOf[js.Any]))
      VpcConfig.foreach(__v => __obj.update("VpcConfig", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartDocumentClassificationJobRequest]
    }
  }

  @js.native
  trait StartDocumentClassificationJobResponse extends js.Object {
    var JobId: js.UndefOr[JobId]
    var JobStatus: js.UndefOr[JobStatus]
  }

  object StartDocumentClassificationJobResponse {
    def apply(
        JobId: js.UndefOr[JobId] = js.undefined,
        JobStatus: js.UndefOr[JobStatus] = js.undefined
    ): StartDocumentClassificationJobResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      JobId.foreach(__v => __obj.update("JobId", __v.asInstanceOf[js.Any]))
      JobStatus.foreach(__v => __obj.update("JobStatus", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartDocumentClassificationJobResponse]
    }
  }

  @js.native
  trait StartDominantLanguageDetectionJobRequest extends js.Object {
    var DataAccessRoleArn: IamRoleArn
    var InputDataConfig: InputDataConfig
    var OutputDataConfig: OutputDataConfig
    var ClientRequestToken: js.UndefOr[ClientRequestTokenString]
    var JobName: js.UndefOr[JobName]
    var VolumeKmsKeyId: js.UndefOr[KmsKeyId]
    var VpcConfig: js.UndefOr[VpcConfig]
  }

  object StartDominantLanguageDetectionJobRequest {
    def apply(
        DataAccessRoleArn: IamRoleArn,
        InputDataConfig: InputDataConfig,
        OutputDataConfig: OutputDataConfig,
        ClientRequestToken: js.UndefOr[ClientRequestTokenString] = js.undefined,
        JobName: js.UndefOr[JobName] = js.undefined,
        VolumeKmsKeyId: js.UndefOr[KmsKeyId] = js.undefined,
        VpcConfig: js.UndefOr[VpcConfig] = js.undefined
    ): StartDominantLanguageDetectionJobRequest = {
      val __obj = js.Dictionary[js.Any](
        "DataAccessRoleArn" -> DataAccessRoleArn.asInstanceOf[js.Any],
        "InputDataConfig"   -> InputDataConfig.asInstanceOf[js.Any],
        "OutputDataConfig"  -> OutputDataConfig.asInstanceOf[js.Any]
      )

      ClientRequestToken.foreach(__v => __obj.update("ClientRequestToken", __v.asInstanceOf[js.Any]))
      JobName.foreach(__v => __obj.update("JobName", __v.asInstanceOf[js.Any]))
      VolumeKmsKeyId.foreach(__v => __obj.update("VolumeKmsKeyId", __v.asInstanceOf[js.Any]))
      VpcConfig.foreach(__v => __obj.update("VpcConfig", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartDominantLanguageDetectionJobRequest]
    }
  }

  @js.native
  trait StartDominantLanguageDetectionJobResponse extends js.Object {
    var JobId: js.UndefOr[JobId]
    var JobStatus: js.UndefOr[JobStatus]
  }

  object StartDominantLanguageDetectionJobResponse {
    def apply(
        JobId: js.UndefOr[JobId] = js.undefined,
        JobStatus: js.UndefOr[JobStatus] = js.undefined
    ): StartDominantLanguageDetectionJobResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      JobId.foreach(__v => __obj.update("JobId", __v.asInstanceOf[js.Any]))
      JobStatus.foreach(__v => __obj.update("JobStatus", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartDominantLanguageDetectionJobResponse]
    }
  }

  @js.native
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

  object StartEntitiesDetectionJobRequest {
    def apply(
        DataAccessRoleArn: IamRoleArn,
        InputDataConfig: InputDataConfig,
        LanguageCode: LanguageCode,
        OutputDataConfig: OutputDataConfig,
        ClientRequestToken: js.UndefOr[ClientRequestTokenString] = js.undefined,
        EntityRecognizerArn: js.UndefOr[EntityRecognizerArn] = js.undefined,
        JobName: js.UndefOr[JobName] = js.undefined,
        VolumeKmsKeyId: js.UndefOr[KmsKeyId] = js.undefined,
        VpcConfig: js.UndefOr[VpcConfig] = js.undefined
    ): StartEntitiesDetectionJobRequest = {
      val __obj = js.Dictionary[js.Any](
        "DataAccessRoleArn" -> DataAccessRoleArn.asInstanceOf[js.Any],
        "InputDataConfig"   -> InputDataConfig.asInstanceOf[js.Any],
        "LanguageCode"      -> LanguageCode.asInstanceOf[js.Any],
        "OutputDataConfig"  -> OutputDataConfig.asInstanceOf[js.Any]
      )

      ClientRequestToken.foreach(__v => __obj.update("ClientRequestToken", __v.asInstanceOf[js.Any]))
      EntityRecognizerArn.foreach(__v => __obj.update("EntityRecognizerArn", __v.asInstanceOf[js.Any]))
      JobName.foreach(__v => __obj.update("JobName", __v.asInstanceOf[js.Any]))
      VolumeKmsKeyId.foreach(__v => __obj.update("VolumeKmsKeyId", __v.asInstanceOf[js.Any]))
      VpcConfig.foreach(__v => __obj.update("VpcConfig", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartEntitiesDetectionJobRequest]
    }
  }

  @js.native
  trait StartEntitiesDetectionJobResponse extends js.Object {
    var JobId: js.UndefOr[JobId]
    var JobStatus: js.UndefOr[JobStatus]
  }

  object StartEntitiesDetectionJobResponse {
    def apply(
        JobId: js.UndefOr[JobId] = js.undefined,
        JobStatus: js.UndefOr[JobStatus] = js.undefined
    ): StartEntitiesDetectionJobResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      JobId.foreach(__v => __obj.update("JobId", __v.asInstanceOf[js.Any]))
      JobStatus.foreach(__v => __obj.update("JobStatus", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartEntitiesDetectionJobResponse]
    }
  }

  @js.native
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

  object StartKeyPhrasesDetectionJobRequest {
    def apply(
        DataAccessRoleArn: IamRoleArn,
        InputDataConfig: InputDataConfig,
        LanguageCode: LanguageCode,
        OutputDataConfig: OutputDataConfig,
        ClientRequestToken: js.UndefOr[ClientRequestTokenString] = js.undefined,
        JobName: js.UndefOr[JobName] = js.undefined,
        VolumeKmsKeyId: js.UndefOr[KmsKeyId] = js.undefined,
        VpcConfig: js.UndefOr[VpcConfig] = js.undefined
    ): StartKeyPhrasesDetectionJobRequest = {
      val __obj = js.Dictionary[js.Any](
        "DataAccessRoleArn" -> DataAccessRoleArn.asInstanceOf[js.Any],
        "InputDataConfig"   -> InputDataConfig.asInstanceOf[js.Any],
        "LanguageCode"      -> LanguageCode.asInstanceOf[js.Any],
        "OutputDataConfig"  -> OutputDataConfig.asInstanceOf[js.Any]
      )

      ClientRequestToken.foreach(__v => __obj.update("ClientRequestToken", __v.asInstanceOf[js.Any]))
      JobName.foreach(__v => __obj.update("JobName", __v.asInstanceOf[js.Any]))
      VolumeKmsKeyId.foreach(__v => __obj.update("VolumeKmsKeyId", __v.asInstanceOf[js.Any]))
      VpcConfig.foreach(__v => __obj.update("VpcConfig", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartKeyPhrasesDetectionJobRequest]
    }
  }

  @js.native
  trait StartKeyPhrasesDetectionJobResponse extends js.Object {
    var JobId: js.UndefOr[JobId]
    var JobStatus: js.UndefOr[JobStatus]
  }

  object StartKeyPhrasesDetectionJobResponse {
    def apply(
        JobId: js.UndefOr[JobId] = js.undefined,
        JobStatus: js.UndefOr[JobStatus] = js.undefined
    ): StartKeyPhrasesDetectionJobResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      JobId.foreach(__v => __obj.update("JobId", __v.asInstanceOf[js.Any]))
      JobStatus.foreach(__v => __obj.update("JobStatus", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartKeyPhrasesDetectionJobResponse]
    }
  }

  @js.native
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

  object StartSentimentDetectionJobRequest {
    def apply(
        DataAccessRoleArn: IamRoleArn,
        InputDataConfig: InputDataConfig,
        LanguageCode: LanguageCode,
        OutputDataConfig: OutputDataConfig,
        ClientRequestToken: js.UndefOr[ClientRequestTokenString] = js.undefined,
        JobName: js.UndefOr[JobName] = js.undefined,
        VolumeKmsKeyId: js.UndefOr[KmsKeyId] = js.undefined,
        VpcConfig: js.UndefOr[VpcConfig] = js.undefined
    ): StartSentimentDetectionJobRequest = {
      val __obj = js.Dictionary[js.Any](
        "DataAccessRoleArn" -> DataAccessRoleArn.asInstanceOf[js.Any],
        "InputDataConfig"   -> InputDataConfig.asInstanceOf[js.Any],
        "LanguageCode"      -> LanguageCode.asInstanceOf[js.Any],
        "OutputDataConfig"  -> OutputDataConfig.asInstanceOf[js.Any]
      )

      ClientRequestToken.foreach(__v => __obj.update("ClientRequestToken", __v.asInstanceOf[js.Any]))
      JobName.foreach(__v => __obj.update("JobName", __v.asInstanceOf[js.Any]))
      VolumeKmsKeyId.foreach(__v => __obj.update("VolumeKmsKeyId", __v.asInstanceOf[js.Any]))
      VpcConfig.foreach(__v => __obj.update("VpcConfig", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartSentimentDetectionJobRequest]
    }
  }

  @js.native
  trait StartSentimentDetectionJobResponse extends js.Object {
    var JobId: js.UndefOr[JobId]
    var JobStatus: js.UndefOr[JobStatus]
  }

  object StartSentimentDetectionJobResponse {
    def apply(
        JobId: js.UndefOr[JobId] = js.undefined,
        JobStatus: js.UndefOr[JobStatus] = js.undefined
    ): StartSentimentDetectionJobResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      JobId.foreach(__v => __obj.update("JobId", __v.asInstanceOf[js.Any]))
      JobStatus.foreach(__v => __obj.update("JobStatus", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartSentimentDetectionJobResponse]
    }
  }

  @js.native
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

  object StartTopicsDetectionJobRequest {
    def apply(
        DataAccessRoleArn: IamRoleArn,
        InputDataConfig: InputDataConfig,
        OutputDataConfig: OutputDataConfig,
        ClientRequestToken: js.UndefOr[ClientRequestTokenString] = js.undefined,
        JobName: js.UndefOr[JobName] = js.undefined,
        NumberOfTopics: js.UndefOr[NumberOfTopicsInteger] = js.undefined,
        VolumeKmsKeyId: js.UndefOr[KmsKeyId] = js.undefined,
        VpcConfig: js.UndefOr[VpcConfig] = js.undefined
    ): StartTopicsDetectionJobRequest = {
      val __obj = js.Dictionary[js.Any](
        "DataAccessRoleArn" -> DataAccessRoleArn.asInstanceOf[js.Any],
        "InputDataConfig"   -> InputDataConfig.asInstanceOf[js.Any],
        "OutputDataConfig"  -> OutputDataConfig.asInstanceOf[js.Any]
      )

      ClientRequestToken.foreach(__v => __obj.update("ClientRequestToken", __v.asInstanceOf[js.Any]))
      JobName.foreach(__v => __obj.update("JobName", __v.asInstanceOf[js.Any]))
      NumberOfTopics.foreach(__v => __obj.update("NumberOfTopics", __v.asInstanceOf[js.Any]))
      VolumeKmsKeyId.foreach(__v => __obj.update("VolumeKmsKeyId", __v.asInstanceOf[js.Any]))
      VpcConfig.foreach(__v => __obj.update("VpcConfig", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartTopicsDetectionJobRequest]
    }
  }

  @js.native
  trait StartTopicsDetectionJobResponse extends js.Object {
    var JobId: js.UndefOr[JobId]
    var JobStatus: js.UndefOr[JobStatus]
  }

  object StartTopicsDetectionJobResponse {
    def apply(
        JobId: js.UndefOr[JobId] = js.undefined,
        JobStatus: js.UndefOr[JobStatus] = js.undefined
    ): StartTopicsDetectionJobResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      JobId.foreach(__v => __obj.update("JobId", __v.asInstanceOf[js.Any]))
      JobStatus.foreach(__v => __obj.update("JobStatus", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartTopicsDetectionJobResponse]
    }
  }

  @js.native
  trait StopDominantLanguageDetectionJobRequest extends js.Object {
    var JobId: JobId
  }

  object StopDominantLanguageDetectionJobRequest {
    def apply(
        JobId: JobId
    ): StopDominantLanguageDetectionJobRequest = {
      val __obj = js.Dictionary[js.Any](
        "JobId" -> JobId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[StopDominantLanguageDetectionJobRequest]
    }
  }

  @js.native
  trait StopDominantLanguageDetectionJobResponse extends js.Object {
    var JobId: js.UndefOr[JobId]
    var JobStatus: js.UndefOr[JobStatus]
  }

  object StopDominantLanguageDetectionJobResponse {
    def apply(
        JobId: js.UndefOr[JobId] = js.undefined,
        JobStatus: js.UndefOr[JobStatus] = js.undefined
    ): StopDominantLanguageDetectionJobResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      JobId.foreach(__v => __obj.update("JobId", __v.asInstanceOf[js.Any]))
      JobStatus.foreach(__v => __obj.update("JobStatus", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StopDominantLanguageDetectionJobResponse]
    }
  }

  @js.native
  trait StopEntitiesDetectionJobRequest extends js.Object {
    var JobId: JobId
  }

  object StopEntitiesDetectionJobRequest {
    def apply(
        JobId: JobId
    ): StopEntitiesDetectionJobRequest = {
      val __obj = js.Dictionary[js.Any](
        "JobId" -> JobId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[StopEntitiesDetectionJobRequest]
    }
  }

  @js.native
  trait StopEntitiesDetectionJobResponse extends js.Object {
    var JobId: js.UndefOr[JobId]
    var JobStatus: js.UndefOr[JobStatus]
  }

  object StopEntitiesDetectionJobResponse {
    def apply(
        JobId: js.UndefOr[JobId] = js.undefined,
        JobStatus: js.UndefOr[JobStatus] = js.undefined
    ): StopEntitiesDetectionJobResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      JobId.foreach(__v => __obj.update("JobId", __v.asInstanceOf[js.Any]))
      JobStatus.foreach(__v => __obj.update("JobStatus", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StopEntitiesDetectionJobResponse]
    }
  }

  @js.native
  trait StopKeyPhrasesDetectionJobRequest extends js.Object {
    var JobId: JobId
  }

  object StopKeyPhrasesDetectionJobRequest {
    def apply(
        JobId: JobId
    ): StopKeyPhrasesDetectionJobRequest = {
      val __obj = js.Dictionary[js.Any](
        "JobId" -> JobId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[StopKeyPhrasesDetectionJobRequest]
    }
  }

  @js.native
  trait StopKeyPhrasesDetectionJobResponse extends js.Object {
    var JobId: js.UndefOr[JobId]
    var JobStatus: js.UndefOr[JobStatus]
  }

  object StopKeyPhrasesDetectionJobResponse {
    def apply(
        JobId: js.UndefOr[JobId] = js.undefined,
        JobStatus: js.UndefOr[JobStatus] = js.undefined
    ): StopKeyPhrasesDetectionJobResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      JobId.foreach(__v => __obj.update("JobId", __v.asInstanceOf[js.Any]))
      JobStatus.foreach(__v => __obj.update("JobStatus", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StopKeyPhrasesDetectionJobResponse]
    }
  }

  @js.native
  trait StopSentimentDetectionJobRequest extends js.Object {
    var JobId: JobId
  }

  object StopSentimentDetectionJobRequest {
    def apply(
        JobId: JobId
    ): StopSentimentDetectionJobRequest = {
      val __obj = js.Dictionary[js.Any](
        "JobId" -> JobId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[StopSentimentDetectionJobRequest]
    }
  }

  @js.native
  trait StopSentimentDetectionJobResponse extends js.Object {
    var JobId: js.UndefOr[JobId]
    var JobStatus: js.UndefOr[JobStatus]
  }

  object StopSentimentDetectionJobResponse {
    def apply(
        JobId: js.UndefOr[JobId] = js.undefined,
        JobStatus: js.UndefOr[JobStatus] = js.undefined
    ): StopSentimentDetectionJobResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      JobId.foreach(__v => __obj.update("JobId", __v.asInstanceOf[js.Any]))
      JobStatus.foreach(__v => __obj.update("JobStatus", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StopSentimentDetectionJobResponse]
    }
  }

  @js.native
  trait StopTrainingDocumentClassifierRequest extends js.Object {
    var DocumentClassifierArn: DocumentClassifierArn
  }

  object StopTrainingDocumentClassifierRequest {
    def apply(
        DocumentClassifierArn: DocumentClassifierArn
    ): StopTrainingDocumentClassifierRequest = {
      val __obj = js.Dictionary[js.Any](
        "DocumentClassifierArn" -> DocumentClassifierArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[StopTrainingDocumentClassifierRequest]
    }
  }

  @js.native
  trait StopTrainingDocumentClassifierResponse extends js.Object {}

  object StopTrainingDocumentClassifierResponse {
    def apply(
        ): StopTrainingDocumentClassifierResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[StopTrainingDocumentClassifierResponse]
    }
  }

  @js.native
  trait StopTrainingEntityRecognizerRequest extends js.Object {
    var EntityRecognizerArn: EntityRecognizerArn
  }

  object StopTrainingEntityRecognizerRequest {
    def apply(
        EntityRecognizerArn: EntityRecognizerArn
    ): StopTrainingEntityRecognizerRequest = {
      val __obj = js.Dictionary[js.Any](
        "EntityRecognizerArn" -> EntityRecognizerArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[StopTrainingEntityRecognizerRequest]
    }
  }

  @js.native
  trait StopTrainingEntityRecognizerResponse extends js.Object {}

  object StopTrainingEntityRecognizerResponse {
    def apply(
        ): StopTrainingEntityRecognizerResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[StopTrainingEntityRecognizerResponse]
    }
  }

  object SyntaxLanguageCodeEnum {
    val en = "en"
    val es = "es"
    val fr = "fr"
    val de = "de"
    val it = "it"
    val pt = "pt"

    val values = IndexedSeq(en, es, fr, de, it, pt)
  }

  /**
    * Represents a work in the input text that was recognized and assigned a part of speech. There is one syntax token record for each word in the source text.
    */
  @js.native
  trait SyntaxToken extends js.Object {
    var BeginOffset: js.UndefOr[Int]
    var EndOffset: js.UndefOr[Int]
    var PartOfSpeech: js.UndefOr[PartOfSpeechTag]
    var Text: js.UndefOr[String]
    var TokenId: js.UndefOr[Int]
  }

  object SyntaxToken {
    def apply(
        BeginOffset: js.UndefOr[Int] = js.undefined,
        EndOffset: js.UndefOr[Int] = js.undefined,
        PartOfSpeech: js.UndefOr[PartOfSpeechTag] = js.undefined,
        Text: js.UndefOr[String] = js.undefined,
        TokenId: js.UndefOr[Int] = js.undefined
    ): SyntaxToken = {
      val __obj = js.Dictionary.empty[js.Any]
      BeginOffset.foreach(__v => __obj.update("BeginOffset", __v.asInstanceOf[js.Any]))
      EndOffset.foreach(__v => __obj.update("EndOffset", __v.asInstanceOf[js.Any]))
      PartOfSpeech.foreach(__v => __obj.update("PartOfSpeech", __v.asInstanceOf[js.Any]))
      Text.foreach(__v => __obj.update("Text", __v.asInstanceOf[js.Any]))
      TokenId.foreach(__v => __obj.update("TokenId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SyntaxToken]
    }
  }

  /**
    * A key-value pair that adds as a metadata to a resource used by Amazon Comprehend. For example, a tag with the key-value pair ‘Department’:’Sales’ might be added to a resource to indicate its use by a particular department.
    */
  @js.native
  trait Tag extends js.Object {
    var Key: TagKey
    var Value: js.UndefOr[TagValue]
  }

  object Tag {
    def apply(
        Key: TagKey,
        Value: js.UndefOr[TagValue] = js.undefined
    ): Tag = {
      val __obj = js.Dictionary[js.Any](
        "Key" -> Key.asInstanceOf[js.Any]
      )

      Value.foreach(__v => __obj.update("Value", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Tag]
    }
  }

  @js.native
  trait TagResourceRequest extends js.Object {
    var ResourceArn: ComprehendArn
    var Tags: TagList
  }

  object TagResourceRequest {
    def apply(
        ResourceArn: ComprehendArn,
        Tags: TagList
    ): TagResourceRequest = {
      val __obj = js.Dictionary[js.Any](
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any],
        "Tags"        -> Tags.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[TagResourceRequest]
    }
  }

  @js.native
  trait TagResourceResponse extends js.Object {}

  object TagResourceResponse {
    def apply(
        ): TagResourceResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[TagResourceResponse]
    }
  }

  /**
    * Provides information for filtering topic detection jobs. For more information, see .
    */
  @js.native
  trait TopicsDetectionJobFilter extends js.Object {
    var JobName: js.UndefOr[JobName]
    var JobStatus: js.UndefOr[JobStatus]
    var SubmitTimeAfter: js.UndefOr[Timestamp]
    var SubmitTimeBefore: js.UndefOr[Timestamp]
  }

  object TopicsDetectionJobFilter {
    def apply(
        JobName: js.UndefOr[JobName] = js.undefined,
        JobStatus: js.UndefOr[JobStatus] = js.undefined,
        SubmitTimeAfter: js.UndefOr[Timestamp] = js.undefined,
        SubmitTimeBefore: js.UndefOr[Timestamp] = js.undefined
    ): TopicsDetectionJobFilter = {
      val __obj = js.Dictionary.empty[js.Any]
      JobName.foreach(__v => __obj.update("JobName", __v.asInstanceOf[js.Any]))
      JobStatus.foreach(__v => __obj.update("JobStatus", __v.asInstanceOf[js.Any]))
      SubmitTimeAfter.foreach(__v => __obj.update("SubmitTimeAfter", __v.asInstanceOf[js.Any]))
      SubmitTimeBefore.foreach(__v => __obj.update("SubmitTimeBefore", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TopicsDetectionJobFilter]
    }
  }

  /**
    * Provides information about a topic detection job.
    */
  @js.native
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

  object TopicsDetectionJobProperties {
    def apply(
        DataAccessRoleArn: js.UndefOr[IamRoleArn] = js.undefined,
        EndTime: js.UndefOr[Timestamp] = js.undefined,
        InputDataConfig: js.UndefOr[InputDataConfig] = js.undefined,
        JobId: js.UndefOr[JobId] = js.undefined,
        JobName: js.UndefOr[JobName] = js.undefined,
        JobStatus: js.UndefOr[JobStatus] = js.undefined,
        Message: js.UndefOr[AnyLengthString] = js.undefined,
        NumberOfTopics: js.UndefOr[Int] = js.undefined,
        OutputDataConfig: js.UndefOr[OutputDataConfig] = js.undefined,
        SubmitTime: js.UndefOr[Timestamp] = js.undefined,
        VolumeKmsKeyId: js.UndefOr[KmsKeyId] = js.undefined,
        VpcConfig: js.UndefOr[VpcConfig] = js.undefined
    ): TopicsDetectionJobProperties = {
      val __obj = js.Dictionary.empty[js.Any]
      DataAccessRoleArn.foreach(__v => __obj.update("DataAccessRoleArn", __v.asInstanceOf[js.Any]))
      EndTime.foreach(__v => __obj.update("EndTime", __v.asInstanceOf[js.Any]))
      InputDataConfig.foreach(__v => __obj.update("InputDataConfig", __v.asInstanceOf[js.Any]))
      JobId.foreach(__v => __obj.update("JobId", __v.asInstanceOf[js.Any]))
      JobName.foreach(__v => __obj.update("JobName", __v.asInstanceOf[js.Any]))
      JobStatus.foreach(__v => __obj.update("JobStatus", __v.asInstanceOf[js.Any]))
      Message.foreach(__v => __obj.update("Message", __v.asInstanceOf[js.Any]))
      NumberOfTopics.foreach(__v => __obj.update("NumberOfTopics", __v.asInstanceOf[js.Any]))
      OutputDataConfig.foreach(__v => __obj.update("OutputDataConfig", __v.asInstanceOf[js.Any]))
      SubmitTime.foreach(__v => __obj.update("SubmitTime", __v.asInstanceOf[js.Any]))
      VolumeKmsKeyId.foreach(__v => __obj.update("VolumeKmsKeyId", __v.asInstanceOf[js.Any]))
      VpcConfig.foreach(__v => __obj.update("VpcConfig", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TopicsDetectionJobProperties]
    }
  }

  @js.native
  trait UntagResourceRequest extends js.Object {
    var ResourceArn: ComprehendArn
    var TagKeys: TagKeyList
  }

  object UntagResourceRequest {
    def apply(
        ResourceArn: ComprehendArn,
        TagKeys: TagKeyList
    ): UntagResourceRequest = {
      val __obj = js.Dictionary[js.Any](
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any],
        "TagKeys"     -> TagKeys.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UntagResourceRequest]
    }
  }

  @js.native
  trait UntagResourceResponse extends js.Object {}

  object UntagResourceResponse {
    def apply(
        ): UntagResourceResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[UntagResourceResponse]
    }
  }

  /**
    * Configuration parameters for an optional private Virtual Private Cloud (VPC) containing the resources you are using for the job. For For more information, see [[https://docs.aws.amazon.com/vpc/latest/userguide/what-is-amazon-vpc.html|Amazon VPC]].
    */
  @js.native
  trait VpcConfig extends js.Object {
    var SecurityGroupIds: SecurityGroupIds
    var Subnets: Subnets
  }

  object VpcConfig {
    def apply(
        SecurityGroupIds: SecurityGroupIds,
        Subnets: Subnets
    ): VpcConfig = {
      val __obj = js.Dictionary[js.Any](
        "SecurityGroupIds" -> SecurityGroupIds.asInstanceOf[js.Any],
        "Subnets"          -> Subnets.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[VpcConfig]
    }
  }
}
