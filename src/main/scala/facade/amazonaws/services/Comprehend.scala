package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import io.scalajs.nodejs
import facade.amazonaws._

package object comprehend {
  type AnyLengthString = String
  type BatchItemErrorList = js.Array[BatchItemError]
  type ClientRequestTokenString = String
  type ComprehendArnName = String
  type DocumentClassificationJobPropertiesList = js.Array[DocumentClassificationJobProperties]
  type DocumentClassifierArn = String
  type DocumentClassifierPropertiesList = js.Array[DocumentClassifierProperties]
  type DominantLanguageDetectionJobPropertiesList = js.Array[DominantLanguageDetectionJobProperties]
  type EntitiesDetectionJobPropertiesList = js.Array[EntitiesDetectionJobProperties]
  type EntityRecognizerArn = String
  type EntityRecognizerMetadataEntityTypesList = js.Array[EntityRecognizerMetadataEntityTypesListItem]
  type EntityRecognizerPropertiesList = js.Array[EntityRecognizerProperties]
  type EntityType = String
  type EntityTypeName = String
  type EntityTypesList = js.Array[EntityTypesListItem]
  type IamRoleArn = String
  type InputFormat = String
  type JobId = String
  type JobName = String
  type JobStatus = String
  type KeyPhrasesDetectionJobPropertiesList = js.Array[KeyPhrasesDetectionJobProperties]
  type LanguageCode = String
  type ListOfDetectDominantLanguageResult = js.Array[BatchDetectDominantLanguageItemResult]
  type ListOfDetectEntitiesResult = js.Array[BatchDetectEntitiesItemResult]
  type ListOfDetectKeyPhrasesResult = js.Array[BatchDetectKeyPhrasesItemResult]
  type ListOfDetectSentimentResult = js.Array[BatchDetectSentimentItemResult]
  type ListOfDetectSyntaxResult = js.Array[BatchDetectSyntaxItemResult]
  type ListOfDominantLanguages = js.Array[DominantLanguage]
  type ListOfEntities = js.Array[Entity]
  type ListOfKeyPhrases = js.Array[KeyPhrase]
  type ListOfSyntaxTokens = js.Array[SyntaxToken]
  type MaxResultsInteger = Int
  type ModelStatus = String
  type NumberOfTopicsInteger = Int
  type PartOfSpeechTagType = String
  type S3Uri = String
  type SentimentDetectionJobPropertiesList = js.Array[SentimentDetectionJobProperties]
  type SentimentType = String
  type StringList = js.Array[String]
  type SyntaxLanguageCode = String
  type Timestamp = js.Date
  type TopicsDetectionJobPropertiesList = js.Array[TopicsDetectionJobProperties]
}

package comprehend {
  @js.native
  @JSImport("aws-sdk", "Comprehend")
  class Comprehend(config: AWSConfig) extends js.Object {
    def batchDetectDominantLanguage(params: BatchDetectDominantLanguageRequest): Request[BatchDetectDominantLanguageResponse] = js.native
    def batchDetectEntities(params: BatchDetectEntitiesRequest): Request[BatchDetectEntitiesResponse] = js.native
    def batchDetectKeyPhrases(params: BatchDetectKeyPhrasesRequest): Request[BatchDetectKeyPhrasesResponse] = js.native
    def batchDetectSentiment(params: BatchDetectSentimentRequest): Request[BatchDetectSentimentResponse] = js.native
    def batchDetectSyntax(params: BatchDetectSyntaxRequest): Request[BatchDetectSyntaxResponse] = js.native
    def createDocumentClassifier(params: CreateDocumentClassifierRequest): Request[CreateDocumentClassifierResponse] = js.native
    def createEntityRecognizer(params: CreateEntityRecognizerRequest): Request[CreateEntityRecognizerResponse] = js.native
    def deleteDocumentClassifier(params: DeleteDocumentClassifierRequest): Request[DeleteDocumentClassifierResponse] = js.native
    def deleteEntityRecognizer(params: DeleteEntityRecognizerRequest): Request[DeleteEntityRecognizerResponse] = js.native
    def describeDocumentClassificationJob(params: DescribeDocumentClassificationJobRequest): Request[DescribeDocumentClassificationJobResponse] = js.native
    def describeDocumentClassifier(params: DescribeDocumentClassifierRequest): Request[DescribeDocumentClassifierResponse] = js.native
    def describeDominantLanguageDetectionJob(params: DescribeDominantLanguageDetectionJobRequest): Request[DescribeDominantLanguageDetectionJobResponse] = js.native
    def describeEntitiesDetectionJob(params: DescribeEntitiesDetectionJobRequest): Request[DescribeEntitiesDetectionJobResponse] = js.native
    def describeEntityRecognizer(params: DescribeEntityRecognizerRequest): Request[DescribeEntityRecognizerResponse] = js.native
    def describeKeyPhrasesDetectionJob(params: DescribeKeyPhrasesDetectionJobRequest): Request[DescribeKeyPhrasesDetectionJobResponse] = js.native
    def describeSentimentDetectionJob(params: DescribeSentimentDetectionJobRequest): Request[DescribeSentimentDetectionJobResponse] = js.native
    def describeTopicsDetectionJob(params: DescribeTopicsDetectionJobRequest): Request[DescribeTopicsDetectionJobResponse] = js.native
    def detectDominantLanguage(params: DetectDominantLanguageRequest): Request[DetectDominantLanguageResponse] = js.native
    def detectEntities(params: DetectEntitiesRequest): Request[DetectEntitiesResponse] = js.native
    def detectKeyPhrases(params: DetectKeyPhrasesRequest): Request[DetectKeyPhrasesResponse] = js.native
    def detectSentiment(params: DetectSentimentRequest): Request[DetectSentimentResponse] = js.native
    def detectSyntax(params: DetectSyntaxRequest): Request[DetectSyntaxResponse] = js.native
    def listDocumentClassificationJobs(params: ListDocumentClassificationJobsRequest): Request[ListDocumentClassificationJobsResponse] = js.native
    def listDocumentClassifiers(params: ListDocumentClassifiersRequest): Request[ListDocumentClassifiersResponse] = js.native
    def listDominantLanguageDetectionJobs(params: ListDominantLanguageDetectionJobsRequest): Request[ListDominantLanguageDetectionJobsResponse] = js.native
    def listEntitiesDetectionJobs(params: ListEntitiesDetectionJobsRequest): Request[ListEntitiesDetectionJobsResponse] = js.native
    def listEntityRecognizers(params: ListEntityRecognizersRequest): Request[ListEntityRecognizersResponse] = js.native
    def listKeyPhrasesDetectionJobs(params: ListKeyPhrasesDetectionJobsRequest): Request[ListKeyPhrasesDetectionJobsResponse] = js.native
    def listSentimentDetectionJobs(params: ListSentimentDetectionJobsRequest): Request[ListSentimentDetectionJobsResponse] = js.native
    def listTopicsDetectionJobs(params: ListTopicsDetectionJobsRequest): Request[ListTopicsDetectionJobsResponse] = js.native
    def startDocumentClassificationJob(params: StartDocumentClassificationJobRequest): Request[StartDocumentClassificationJobResponse] = js.native
    def startDominantLanguageDetectionJob(params: StartDominantLanguageDetectionJobRequest): Request[StartDominantLanguageDetectionJobResponse] = js.native
    def startEntitiesDetectionJob(params: StartEntitiesDetectionJobRequest): Request[StartEntitiesDetectionJobResponse] = js.native
    def startKeyPhrasesDetectionJob(params: StartKeyPhrasesDetectionJobRequest): Request[StartKeyPhrasesDetectionJobResponse] = js.native
    def startSentimentDetectionJob(params: StartSentimentDetectionJobRequest): Request[StartSentimentDetectionJobResponse] = js.native
    def startTopicsDetectionJob(params: StartTopicsDetectionJobRequest): Request[StartTopicsDetectionJobResponse] = js.native
    def stopDominantLanguageDetectionJob(params: StopDominantLanguageDetectionJobRequest): Request[StopDominantLanguageDetectionJobResponse] = js.native
    def stopEntitiesDetectionJob(params: StopEntitiesDetectionJobRequest): Request[StopEntitiesDetectionJobResponse] = js.native
    def stopKeyPhrasesDetectionJob(params: StopKeyPhrasesDetectionJobRequest): Request[StopKeyPhrasesDetectionJobResponse] = js.native
    def stopSentimentDetectionJob(params: StopSentimentDetectionJobRequest): Request[StopSentimentDetectionJobResponse] = js.native
  }

  /**
   * <p>The result of calling the operation. The operation returns one object for each document that is successfully processed by the operation.</p>
   */
  @js.native
  trait BatchDetectDominantLanguageItemResult extends js.Object {
    var Index: js.UndefOr[Int]
    var Languages: js.UndefOr[ListOfDominantLanguages]
  }

  object BatchDetectDominantLanguageItemResult {
    def apply(
      Index: js.UndefOr[Int] = js.undefined,
      Languages: js.UndefOr[ListOfDominantLanguages] = js.undefined): BatchDetectDominantLanguageItemResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Index" -> Index.map { x => x.asInstanceOf[js.Any] },
        "Languages" -> Languages.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchDetectDominantLanguageItemResult]
    }
  }

  @js.native
  trait BatchDetectDominantLanguageRequest extends js.Object {
    var TextList: js.UndefOr[StringList]
  }

  object BatchDetectDominantLanguageRequest {
    def apply(
      TextList: js.UndefOr[StringList] = js.undefined): BatchDetectDominantLanguageRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TextList" -> TextList.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchDetectDominantLanguageRequest]
    }
  }

  @js.native
  trait BatchDetectDominantLanguageResponse extends js.Object {
    var ResultList: js.UndefOr[ListOfDetectDominantLanguageResult]
    var ErrorList: js.UndefOr[BatchItemErrorList]
  }

  object BatchDetectDominantLanguageResponse {
    def apply(
      ResultList: js.UndefOr[ListOfDetectDominantLanguageResult] = js.undefined,
      ErrorList: js.UndefOr[BatchItemErrorList] = js.undefined): BatchDetectDominantLanguageResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResultList" -> ResultList.map { x => x.asInstanceOf[js.Any] },
        "ErrorList" -> ErrorList.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchDetectDominantLanguageResponse]
    }
  }

  /**
   * <p>The result of calling the operation. The operation returns one object for each document that is successfully processed by the operation.</p>
   */
  @js.native
  trait BatchDetectEntitiesItemResult extends js.Object {
    var Index: js.UndefOr[Int]
    var Entities: js.UndefOr[ListOfEntities]
  }

  object BatchDetectEntitiesItemResult {
    def apply(
      Index: js.UndefOr[Int] = js.undefined,
      Entities: js.UndefOr[ListOfEntities] = js.undefined): BatchDetectEntitiesItemResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Index" -> Index.map { x => x.asInstanceOf[js.Any] },
        "Entities" -> Entities.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchDetectEntitiesItemResult]
    }
  }

  @js.native
  trait BatchDetectEntitiesRequest extends js.Object {
    var TextList: js.UndefOr[StringList]
    var LanguageCode: js.UndefOr[LanguageCode]
  }

  object BatchDetectEntitiesRequest {
    def apply(
      TextList: js.UndefOr[StringList] = js.undefined,
      LanguageCode: js.UndefOr[LanguageCode] = js.undefined): BatchDetectEntitiesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TextList" -> TextList.map { x => x.asInstanceOf[js.Any] },
        "LanguageCode" -> LanguageCode.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchDetectEntitiesRequest]
    }
  }

  @js.native
  trait BatchDetectEntitiesResponse extends js.Object {
    var ResultList: js.UndefOr[ListOfDetectEntitiesResult]
    var ErrorList: js.UndefOr[BatchItemErrorList]
  }

  object BatchDetectEntitiesResponse {
    def apply(
      ResultList: js.UndefOr[ListOfDetectEntitiesResult] = js.undefined,
      ErrorList: js.UndefOr[BatchItemErrorList] = js.undefined): BatchDetectEntitiesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResultList" -> ResultList.map { x => x.asInstanceOf[js.Any] },
        "ErrorList" -> ErrorList.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchDetectEntitiesResponse]
    }
  }

  /**
   * <p>The result of calling the operation. The operation returns one object for each document that is successfully processed by the operation.</p>
   */
  @js.native
  trait BatchDetectKeyPhrasesItemResult extends js.Object {
    var Index: js.UndefOr[Int]
    var KeyPhrases: js.UndefOr[ListOfKeyPhrases]
  }

  object BatchDetectKeyPhrasesItemResult {
    def apply(
      Index: js.UndefOr[Int] = js.undefined,
      KeyPhrases: js.UndefOr[ListOfKeyPhrases] = js.undefined): BatchDetectKeyPhrasesItemResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Index" -> Index.map { x => x.asInstanceOf[js.Any] },
        "KeyPhrases" -> KeyPhrases.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchDetectKeyPhrasesItemResult]
    }
  }

  @js.native
  trait BatchDetectKeyPhrasesRequest extends js.Object {
    var TextList: js.UndefOr[StringList]
    var LanguageCode: js.UndefOr[LanguageCode]
  }

  object BatchDetectKeyPhrasesRequest {
    def apply(
      TextList: js.UndefOr[StringList] = js.undefined,
      LanguageCode: js.UndefOr[LanguageCode] = js.undefined): BatchDetectKeyPhrasesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TextList" -> TextList.map { x => x.asInstanceOf[js.Any] },
        "LanguageCode" -> LanguageCode.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchDetectKeyPhrasesRequest]
    }
  }

  @js.native
  trait BatchDetectKeyPhrasesResponse extends js.Object {
    var ResultList: js.UndefOr[ListOfDetectKeyPhrasesResult]
    var ErrorList: js.UndefOr[BatchItemErrorList]
  }

  object BatchDetectKeyPhrasesResponse {
    def apply(
      ResultList: js.UndefOr[ListOfDetectKeyPhrasesResult] = js.undefined,
      ErrorList: js.UndefOr[BatchItemErrorList] = js.undefined): BatchDetectKeyPhrasesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResultList" -> ResultList.map { x => x.asInstanceOf[js.Any] },
        "ErrorList" -> ErrorList.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchDetectKeyPhrasesResponse]
    }
  }

  /**
   * <p>The result of calling the operation. The operation returns one object for each document that is successfully processed by the operation.</p>
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
      SentimentScore: js.UndefOr[SentimentScore] = js.undefined): BatchDetectSentimentItemResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Index" -> Index.map { x => x.asInstanceOf[js.Any] },
        "Sentiment" -> Sentiment.map { x => x.asInstanceOf[js.Any] },
        "SentimentScore" -> SentimentScore.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchDetectSentimentItemResult]
    }
  }

  @js.native
  trait BatchDetectSentimentRequest extends js.Object {
    var TextList: js.UndefOr[StringList]
    var LanguageCode: js.UndefOr[LanguageCode]
  }

  object BatchDetectSentimentRequest {
    def apply(
      TextList: js.UndefOr[StringList] = js.undefined,
      LanguageCode: js.UndefOr[LanguageCode] = js.undefined): BatchDetectSentimentRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TextList" -> TextList.map { x => x.asInstanceOf[js.Any] },
        "LanguageCode" -> LanguageCode.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchDetectSentimentRequest]
    }
  }

  @js.native
  trait BatchDetectSentimentResponse extends js.Object {
    var ResultList: js.UndefOr[ListOfDetectSentimentResult]
    var ErrorList: js.UndefOr[BatchItemErrorList]
  }

  object BatchDetectSentimentResponse {
    def apply(
      ResultList: js.UndefOr[ListOfDetectSentimentResult] = js.undefined,
      ErrorList: js.UndefOr[BatchItemErrorList] = js.undefined): BatchDetectSentimentResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResultList" -> ResultList.map { x => x.asInstanceOf[js.Any] },
        "ErrorList" -> ErrorList.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchDetectSentimentResponse]
    }
  }

  /**
   * <p>The result of calling the operation. The operation returns one object that is successfully processed by the operation.</p>
   */
  @js.native
  trait BatchDetectSyntaxItemResult extends js.Object {
    var Index: js.UndefOr[Int]
    var SyntaxTokens: js.UndefOr[ListOfSyntaxTokens]
  }

  object BatchDetectSyntaxItemResult {
    def apply(
      Index: js.UndefOr[Int] = js.undefined,
      SyntaxTokens: js.UndefOr[ListOfSyntaxTokens] = js.undefined): BatchDetectSyntaxItemResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Index" -> Index.map { x => x.asInstanceOf[js.Any] },
        "SyntaxTokens" -> SyntaxTokens.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchDetectSyntaxItemResult]
    }
  }

  @js.native
  trait BatchDetectSyntaxRequest extends js.Object {
    var TextList: js.UndefOr[StringList]
    var LanguageCode: js.UndefOr[SyntaxLanguageCode]
  }

  object BatchDetectSyntaxRequest {
    def apply(
      TextList: js.UndefOr[StringList] = js.undefined,
      LanguageCode: js.UndefOr[SyntaxLanguageCode] = js.undefined): BatchDetectSyntaxRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TextList" -> TextList.map { x => x.asInstanceOf[js.Any] },
        "LanguageCode" -> LanguageCode.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchDetectSyntaxRequest]
    }
  }

  @js.native
  trait BatchDetectSyntaxResponse extends js.Object {
    var ResultList: js.UndefOr[ListOfDetectSyntaxResult]
    var ErrorList: js.UndefOr[BatchItemErrorList]
  }

  object BatchDetectSyntaxResponse {
    def apply(
      ResultList: js.UndefOr[ListOfDetectSyntaxResult] = js.undefined,
      ErrorList: js.UndefOr[BatchItemErrorList] = js.undefined): BatchDetectSyntaxResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResultList" -> ResultList.map { x => x.asInstanceOf[js.Any] },
        "ErrorList" -> ErrorList.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchDetectSyntaxResponse]
    }
  }

  /**
   * <p>Describes an error that occurred while processing a document in a batch. The operation returns on <code>BatchItemError</code> object for each document that contained an error.</p>
   */
  @js.native
  trait BatchItemError extends js.Object {
    var Index: js.UndefOr[Int]
    var ErrorCode: js.UndefOr[String]
    var ErrorMessage: js.UndefOr[String]
  }

  object BatchItemError {
    def apply(
      Index: js.UndefOr[Int] = js.undefined,
      ErrorCode: js.UndefOr[String] = js.undefined,
      ErrorMessage: js.UndefOr[String] = js.undefined): BatchItemError = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Index" -> Index.map { x => x.asInstanceOf[js.Any] },
        "ErrorCode" -> ErrorCode.map { x => x.asInstanceOf[js.Any] },
        "ErrorMessage" -> ErrorMessage.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchItemError]
    }
  }

  /**
   * <p>Describes the result metrics for the test data associated with an documentation classifier.</p>
   */
  @js.native
  trait ClassifierEvaluationMetrics extends js.Object {
    var Accuracy: js.UndefOr[Double]
    var Precision: js.UndefOr[Double]
    var Recall: js.UndefOr[Double]
    var F1Score: js.UndefOr[Double]
  }

  object ClassifierEvaluationMetrics {
    def apply(
      Accuracy: js.UndefOr[Double] = js.undefined,
      Precision: js.UndefOr[Double] = js.undefined,
      Recall: js.UndefOr[Double] = js.undefined,
      F1Score: js.UndefOr[Double] = js.undefined): ClassifierEvaluationMetrics = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Accuracy" -> Accuracy.map { x => x.asInstanceOf[js.Any] },
        "Precision" -> Precision.map { x => x.asInstanceOf[js.Any] },
        "Recall" -> Recall.map { x => x.asInstanceOf[js.Any] },
        "F1Score" -> F1Score.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ClassifierEvaluationMetrics]
    }
  }

  /**
   * <p>Provides information about a document classifier.</p>
   */
  @js.native
  trait ClassifierMetadata extends js.Object {
    var NumberOfLabels: js.UndefOr[Int]
    var NumberOfTrainedDocuments: js.UndefOr[Int]
    var NumberOfTestDocuments: js.UndefOr[Int]
    var EvaluationMetrics: js.UndefOr[ClassifierEvaluationMetrics]
  }

  object ClassifierMetadata {
    def apply(
      NumberOfLabels: js.UndefOr[Int] = js.undefined,
      NumberOfTrainedDocuments: js.UndefOr[Int] = js.undefined,
      NumberOfTestDocuments: js.UndefOr[Int] = js.undefined,
      EvaluationMetrics: js.UndefOr[ClassifierEvaluationMetrics] = js.undefined): ClassifierMetadata = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NumberOfLabels" -> NumberOfLabels.map { x => x.asInstanceOf[js.Any] },
        "NumberOfTrainedDocuments" -> NumberOfTrainedDocuments.map { x => x.asInstanceOf[js.Any] },
        "NumberOfTestDocuments" -> NumberOfTestDocuments.map { x => x.asInstanceOf[js.Any] },
        "EvaluationMetrics" -> EvaluationMetrics.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ClassifierMetadata]
    }
  }

  @js.native
  trait CreateDocumentClassifierRequest extends js.Object {
    var ClientRequestToken: js.UndefOr[ClientRequestTokenString]
    var DocumentClassifierName: js.UndefOr[ComprehendArnName]
    var LanguageCode: js.UndefOr[LanguageCode]
    var InputDataConfig: js.UndefOr[DocumentClassifierInputDataConfig]
    var DataAccessRoleArn: js.UndefOr[IamRoleArn]
  }

  object CreateDocumentClassifierRequest {
    def apply(
      ClientRequestToken: js.UndefOr[ClientRequestTokenString] = js.undefined,
      DocumentClassifierName: js.UndefOr[ComprehendArnName] = js.undefined,
      LanguageCode: js.UndefOr[LanguageCode] = js.undefined,
      InputDataConfig: js.UndefOr[DocumentClassifierInputDataConfig] = js.undefined,
      DataAccessRoleArn: js.UndefOr[IamRoleArn] = js.undefined): CreateDocumentClassifierRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ClientRequestToken" -> ClientRequestToken.map { x => x.asInstanceOf[js.Any] },
        "DocumentClassifierName" -> DocumentClassifierName.map { x => x.asInstanceOf[js.Any] },
        "LanguageCode" -> LanguageCode.map { x => x.asInstanceOf[js.Any] },
        "InputDataConfig" -> InputDataConfig.map { x => x.asInstanceOf[js.Any] },
        "DataAccessRoleArn" -> DataAccessRoleArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDocumentClassifierRequest]
    }
  }

  @js.native
  trait CreateDocumentClassifierResponse extends js.Object {
    var DocumentClassifierArn: js.UndefOr[DocumentClassifierArn]
  }

  object CreateDocumentClassifierResponse {
    def apply(
      DocumentClassifierArn: js.UndefOr[DocumentClassifierArn] = js.undefined): CreateDocumentClassifierResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DocumentClassifierArn" -> DocumentClassifierArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDocumentClassifierResponse]
    }
  }

  @js.native
  trait CreateEntityRecognizerRequest extends js.Object {
    var RecognizerName: js.UndefOr[ComprehendArnName]
    var ClientRequestToken: js.UndefOr[ClientRequestTokenString]
    var LanguageCode: js.UndefOr[LanguageCode]
    var InputDataConfig: js.UndefOr[EntityRecognizerInputDataConfig]
    var DataAccessRoleArn: js.UndefOr[IamRoleArn]
  }

  object CreateEntityRecognizerRequest {
    def apply(
      RecognizerName: js.UndefOr[ComprehendArnName] = js.undefined,
      ClientRequestToken: js.UndefOr[ClientRequestTokenString] = js.undefined,
      LanguageCode: js.UndefOr[LanguageCode] = js.undefined,
      InputDataConfig: js.UndefOr[EntityRecognizerInputDataConfig] = js.undefined,
      DataAccessRoleArn: js.UndefOr[IamRoleArn] = js.undefined): CreateEntityRecognizerRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RecognizerName" -> RecognizerName.map { x => x.asInstanceOf[js.Any] },
        "ClientRequestToken" -> ClientRequestToken.map { x => x.asInstanceOf[js.Any] },
        "LanguageCode" -> LanguageCode.map { x => x.asInstanceOf[js.Any] },
        "InputDataConfig" -> InputDataConfig.map { x => x.asInstanceOf[js.Any] },
        "DataAccessRoleArn" -> DataAccessRoleArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateEntityRecognizerRequest]
    }
  }

  @js.native
  trait CreateEntityRecognizerResponse extends js.Object {
    var EntityRecognizerArn: js.UndefOr[EntityRecognizerArn]
  }

  object CreateEntityRecognizerResponse {
    def apply(
      EntityRecognizerArn: js.UndefOr[EntityRecognizerArn] = js.undefined): CreateEntityRecognizerResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EntityRecognizerArn" -> EntityRecognizerArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateEntityRecognizerResponse]
    }
  }

  @js.native
  trait DeleteDocumentClassifierRequest extends js.Object {
    var DocumentClassifierArn: js.UndefOr[DocumentClassifierArn]
  }

  object DeleteDocumentClassifierRequest {
    def apply(
      DocumentClassifierArn: js.UndefOr[DocumentClassifierArn] = js.undefined): DeleteDocumentClassifierRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DocumentClassifierArn" -> DocumentClassifierArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteDocumentClassifierRequest]
    }
  }

  @js.native
  trait DeleteDocumentClassifierResponse extends js.Object {

  }

  object DeleteDocumentClassifierResponse {
    def apply(): DeleteDocumentClassifierResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteDocumentClassifierResponse]
    }
  }

  @js.native
  trait DeleteEntityRecognizerRequest extends js.Object {
    var EntityRecognizerArn: js.UndefOr[EntityRecognizerArn]
  }

  object DeleteEntityRecognizerRequest {
    def apply(
      EntityRecognizerArn: js.UndefOr[EntityRecognizerArn] = js.undefined): DeleteEntityRecognizerRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EntityRecognizerArn" -> EntityRecognizerArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteEntityRecognizerRequest]
    }
  }

  @js.native
  trait DeleteEntityRecognizerResponse extends js.Object {

  }

  object DeleteEntityRecognizerResponse {
    def apply(): DeleteEntityRecognizerResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteEntityRecognizerResponse]
    }
  }

  @js.native
  trait DescribeDocumentClassificationJobRequest extends js.Object {
    var JobId: js.UndefOr[JobId]
  }

  object DescribeDocumentClassificationJobRequest {
    def apply(
      JobId: js.UndefOr[JobId] = js.undefined): DescribeDocumentClassificationJobRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "JobId" -> JobId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeDocumentClassificationJobRequest]
    }
  }

  @js.native
  trait DescribeDocumentClassificationJobResponse extends js.Object {
    var DocumentClassificationJobProperties: js.UndefOr[DocumentClassificationJobProperties]
  }

  object DescribeDocumentClassificationJobResponse {
    def apply(
      DocumentClassificationJobProperties: js.UndefOr[DocumentClassificationJobProperties] = js.undefined): DescribeDocumentClassificationJobResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DocumentClassificationJobProperties" -> DocumentClassificationJobProperties.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeDocumentClassificationJobResponse]
    }
  }

  @js.native
  trait DescribeDocumentClassifierRequest extends js.Object {
    var DocumentClassifierArn: js.UndefOr[DocumentClassifierArn]
  }

  object DescribeDocumentClassifierRequest {
    def apply(
      DocumentClassifierArn: js.UndefOr[DocumentClassifierArn] = js.undefined): DescribeDocumentClassifierRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DocumentClassifierArn" -> DocumentClassifierArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeDocumentClassifierRequest]
    }
  }

  @js.native
  trait DescribeDocumentClassifierResponse extends js.Object {
    var DocumentClassifierProperties: js.UndefOr[DocumentClassifierProperties]
  }

  object DescribeDocumentClassifierResponse {
    def apply(
      DocumentClassifierProperties: js.UndefOr[DocumentClassifierProperties] = js.undefined): DescribeDocumentClassifierResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DocumentClassifierProperties" -> DocumentClassifierProperties.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeDocumentClassifierResponse]
    }
  }

  @js.native
  trait DescribeDominantLanguageDetectionJobRequest extends js.Object {
    var JobId: js.UndefOr[JobId]
  }

  object DescribeDominantLanguageDetectionJobRequest {
    def apply(
      JobId: js.UndefOr[JobId] = js.undefined): DescribeDominantLanguageDetectionJobRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "JobId" -> JobId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeDominantLanguageDetectionJobRequest]
    }
  }

  @js.native
  trait DescribeDominantLanguageDetectionJobResponse extends js.Object {
    var DominantLanguageDetectionJobProperties: js.UndefOr[DominantLanguageDetectionJobProperties]
  }

  object DescribeDominantLanguageDetectionJobResponse {
    def apply(
      DominantLanguageDetectionJobProperties: js.UndefOr[DominantLanguageDetectionJobProperties] = js.undefined): DescribeDominantLanguageDetectionJobResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DominantLanguageDetectionJobProperties" -> DominantLanguageDetectionJobProperties.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeDominantLanguageDetectionJobResponse]
    }
  }

  @js.native
  trait DescribeEntitiesDetectionJobRequest extends js.Object {
    var JobId: js.UndefOr[JobId]
  }

  object DescribeEntitiesDetectionJobRequest {
    def apply(
      JobId: js.UndefOr[JobId] = js.undefined): DescribeEntitiesDetectionJobRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "JobId" -> JobId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeEntitiesDetectionJobRequest]
    }
  }

  @js.native
  trait DescribeEntitiesDetectionJobResponse extends js.Object {
    var EntitiesDetectionJobProperties: js.UndefOr[EntitiesDetectionJobProperties]
  }

  object DescribeEntitiesDetectionJobResponse {
    def apply(
      EntitiesDetectionJobProperties: js.UndefOr[EntitiesDetectionJobProperties] = js.undefined): DescribeEntitiesDetectionJobResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EntitiesDetectionJobProperties" -> EntitiesDetectionJobProperties.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeEntitiesDetectionJobResponse]
    }
  }

  @js.native
  trait DescribeEntityRecognizerRequest extends js.Object {
    var EntityRecognizerArn: js.UndefOr[EntityRecognizerArn]
  }

  object DescribeEntityRecognizerRequest {
    def apply(
      EntityRecognizerArn: js.UndefOr[EntityRecognizerArn] = js.undefined): DescribeEntityRecognizerRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EntityRecognizerArn" -> EntityRecognizerArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeEntityRecognizerRequest]
    }
  }

  @js.native
  trait DescribeEntityRecognizerResponse extends js.Object {
    var EntityRecognizerProperties: js.UndefOr[EntityRecognizerProperties]
  }

  object DescribeEntityRecognizerResponse {
    def apply(
      EntityRecognizerProperties: js.UndefOr[EntityRecognizerProperties] = js.undefined): DescribeEntityRecognizerResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EntityRecognizerProperties" -> EntityRecognizerProperties.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeEntityRecognizerResponse]
    }
  }

  @js.native
  trait DescribeKeyPhrasesDetectionJobRequest extends js.Object {
    var JobId: js.UndefOr[JobId]
  }

  object DescribeKeyPhrasesDetectionJobRequest {
    def apply(
      JobId: js.UndefOr[JobId] = js.undefined): DescribeKeyPhrasesDetectionJobRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "JobId" -> JobId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeKeyPhrasesDetectionJobRequest]
    }
  }

  @js.native
  trait DescribeKeyPhrasesDetectionJobResponse extends js.Object {
    var KeyPhrasesDetectionJobProperties: js.UndefOr[KeyPhrasesDetectionJobProperties]
  }

  object DescribeKeyPhrasesDetectionJobResponse {
    def apply(
      KeyPhrasesDetectionJobProperties: js.UndefOr[KeyPhrasesDetectionJobProperties] = js.undefined): DescribeKeyPhrasesDetectionJobResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "KeyPhrasesDetectionJobProperties" -> KeyPhrasesDetectionJobProperties.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeKeyPhrasesDetectionJobResponse]
    }
  }

  @js.native
  trait DescribeSentimentDetectionJobRequest extends js.Object {
    var JobId: js.UndefOr[JobId]
  }

  object DescribeSentimentDetectionJobRequest {
    def apply(
      JobId: js.UndefOr[JobId] = js.undefined): DescribeSentimentDetectionJobRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "JobId" -> JobId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeSentimentDetectionJobRequest]
    }
  }

  @js.native
  trait DescribeSentimentDetectionJobResponse extends js.Object {
    var SentimentDetectionJobProperties: js.UndefOr[SentimentDetectionJobProperties]
  }

  object DescribeSentimentDetectionJobResponse {
    def apply(
      SentimentDetectionJobProperties: js.UndefOr[SentimentDetectionJobProperties] = js.undefined): DescribeSentimentDetectionJobResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SentimentDetectionJobProperties" -> SentimentDetectionJobProperties.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeSentimentDetectionJobResponse]
    }
  }

  @js.native
  trait DescribeTopicsDetectionJobRequest extends js.Object {
    var JobId: js.UndefOr[JobId]
  }

  object DescribeTopicsDetectionJobRequest {
    def apply(
      JobId: js.UndefOr[JobId] = js.undefined): DescribeTopicsDetectionJobRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "JobId" -> JobId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeTopicsDetectionJobRequest]
    }
  }

  @js.native
  trait DescribeTopicsDetectionJobResponse extends js.Object {
    var TopicsDetectionJobProperties: js.UndefOr[TopicsDetectionJobProperties]
  }

  object DescribeTopicsDetectionJobResponse {
    def apply(
      TopicsDetectionJobProperties: js.UndefOr[TopicsDetectionJobProperties] = js.undefined): DescribeTopicsDetectionJobResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TopicsDetectionJobProperties" -> TopicsDetectionJobProperties.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeTopicsDetectionJobResponse]
    }
  }

  @js.native
  trait DetectDominantLanguageRequest extends js.Object {
    var Text: js.UndefOr[String]
  }

  object DetectDominantLanguageRequest {
    def apply(
      Text: js.UndefOr[String] = js.undefined): DetectDominantLanguageRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Text" -> Text.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DetectDominantLanguageRequest]
    }
  }

  @js.native
  trait DetectDominantLanguageResponse extends js.Object {
    var Languages: js.UndefOr[ListOfDominantLanguages]
  }

  object DetectDominantLanguageResponse {
    def apply(
      Languages: js.UndefOr[ListOfDominantLanguages] = js.undefined): DetectDominantLanguageResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Languages" -> Languages.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DetectDominantLanguageResponse]
    }
  }

  @js.native
  trait DetectEntitiesRequest extends js.Object {
    var Text: js.UndefOr[String]
    var LanguageCode: js.UndefOr[LanguageCode]
  }

  object DetectEntitiesRequest {
    def apply(
      Text: js.UndefOr[String] = js.undefined,
      LanguageCode: js.UndefOr[LanguageCode] = js.undefined): DetectEntitiesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Text" -> Text.map { x => x.asInstanceOf[js.Any] },
        "LanguageCode" -> LanguageCode.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DetectEntitiesRequest]
    }
  }

  @js.native
  trait DetectEntitiesResponse extends js.Object {
    var Entities: js.UndefOr[ListOfEntities]
  }

  object DetectEntitiesResponse {
    def apply(
      Entities: js.UndefOr[ListOfEntities] = js.undefined): DetectEntitiesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Entities" -> Entities.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DetectEntitiesResponse]
    }
  }

  @js.native
  trait DetectKeyPhrasesRequest extends js.Object {
    var Text: js.UndefOr[String]
    var LanguageCode: js.UndefOr[LanguageCode]
  }

  object DetectKeyPhrasesRequest {
    def apply(
      Text: js.UndefOr[String] = js.undefined,
      LanguageCode: js.UndefOr[LanguageCode] = js.undefined): DetectKeyPhrasesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Text" -> Text.map { x => x.asInstanceOf[js.Any] },
        "LanguageCode" -> LanguageCode.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DetectKeyPhrasesRequest]
    }
  }

  @js.native
  trait DetectKeyPhrasesResponse extends js.Object {
    var KeyPhrases: js.UndefOr[ListOfKeyPhrases]
  }

  object DetectKeyPhrasesResponse {
    def apply(
      KeyPhrases: js.UndefOr[ListOfKeyPhrases] = js.undefined): DetectKeyPhrasesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "KeyPhrases" -> KeyPhrases.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DetectKeyPhrasesResponse]
    }
  }

  @js.native
  trait DetectSentimentRequest extends js.Object {
    var Text: js.UndefOr[String]
    var LanguageCode: js.UndefOr[LanguageCode]
  }

  object DetectSentimentRequest {
    def apply(
      Text: js.UndefOr[String] = js.undefined,
      LanguageCode: js.UndefOr[LanguageCode] = js.undefined): DetectSentimentRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Text" -> Text.map { x => x.asInstanceOf[js.Any] },
        "LanguageCode" -> LanguageCode.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DetectSentimentRequest]
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
      SentimentScore: js.UndefOr[SentimentScore] = js.undefined): DetectSentimentResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Sentiment" -> Sentiment.map { x => x.asInstanceOf[js.Any] },
        "SentimentScore" -> SentimentScore.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DetectSentimentResponse]
    }
  }

  @js.native
  trait DetectSyntaxRequest extends js.Object {
    var Text: js.UndefOr[String]
    var LanguageCode: js.UndefOr[SyntaxLanguageCode]
  }

  object DetectSyntaxRequest {
    def apply(
      Text: js.UndefOr[String] = js.undefined,
      LanguageCode: js.UndefOr[SyntaxLanguageCode] = js.undefined): DetectSyntaxRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Text" -> Text.map { x => x.asInstanceOf[js.Any] },
        "LanguageCode" -> LanguageCode.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DetectSyntaxRequest]
    }
  }

  @js.native
  trait DetectSyntaxResponse extends js.Object {
    var SyntaxTokens: js.UndefOr[ListOfSyntaxTokens]
  }

  object DetectSyntaxResponse {
    def apply(
      SyntaxTokens: js.UndefOr[ListOfSyntaxTokens] = js.undefined): DetectSyntaxResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SyntaxTokens" -> SyntaxTokens.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DetectSyntaxResponse]
    }
  }

  /**
   * <p>Provides information for filtering a list of document classification jobs. For more information, see the operation. You can provide only one filter parameter in each request.</p>
   */
  @js.native
  trait DocumentClassificationJobFilter extends js.Object {
    var JobName: js.UndefOr[JobName]
    var JobStatus: js.UndefOr[JobStatus]
    var SubmitTimeBefore: js.UndefOr[Timestamp]
    var SubmitTimeAfter: js.UndefOr[Timestamp]
  }

  object DocumentClassificationJobFilter {
    def apply(
      JobName: js.UndefOr[JobName] = js.undefined,
      JobStatus: js.UndefOr[JobStatus] = js.undefined,
      SubmitTimeBefore: js.UndefOr[Timestamp] = js.undefined,
      SubmitTimeAfter: js.UndefOr[Timestamp] = js.undefined): DocumentClassificationJobFilter = {
      val _fields = IndexedSeq[(String, js.Any)](
        "JobName" -> JobName.map { x => x.asInstanceOf[js.Any] },
        "JobStatus" -> JobStatus.map { x => x.asInstanceOf[js.Any] },
        "SubmitTimeBefore" -> SubmitTimeBefore.map { x => x.asInstanceOf[js.Any] },
        "SubmitTimeAfter" -> SubmitTimeAfter.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DocumentClassificationJobFilter]
    }
  }

  /**
   * <p>Provides information about a document classification job.</p>
   */
  @js.native
  trait DocumentClassificationJobProperties extends js.Object {
    var SubmitTime: js.UndefOr[Timestamp]
    var JobId: js.UndefOr[JobId]
    var JobName: js.UndefOr[JobName]
    var JobStatus: js.UndefOr[JobStatus]
    var EndTime: js.UndefOr[Timestamp]
    var Message: js.UndefOr[AnyLengthString]
    var InputDataConfig: js.UndefOr[InputDataConfig]
    var DocumentClassifierArn: js.UndefOr[DocumentClassifierArn]
    var OutputDataConfig: js.UndefOr[OutputDataConfig]
    var DataAccessRoleArn: js.UndefOr[IamRoleArn]
  }

  object DocumentClassificationJobProperties {
    def apply(
      SubmitTime: js.UndefOr[Timestamp] = js.undefined,
      JobId: js.UndefOr[JobId] = js.undefined,
      JobName: js.UndefOr[JobName] = js.undefined,
      JobStatus: js.UndefOr[JobStatus] = js.undefined,
      EndTime: js.UndefOr[Timestamp] = js.undefined,
      Message: js.UndefOr[AnyLengthString] = js.undefined,
      InputDataConfig: js.UndefOr[InputDataConfig] = js.undefined,
      DocumentClassifierArn: js.UndefOr[DocumentClassifierArn] = js.undefined,
      OutputDataConfig: js.UndefOr[OutputDataConfig] = js.undefined,
      DataAccessRoleArn: js.UndefOr[IamRoleArn] = js.undefined): DocumentClassificationJobProperties = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SubmitTime" -> SubmitTime.map { x => x.asInstanceOf[js.Any] },
        "JobId" -> JobId.map { x => x.asInstanceOf[js.Any] },
        "JobName" -> JobName.map { x => x.asInstanceOf[js.Any] },
        "JobStatus" -> JobStatus.map { x => x.asInstanceOf[js.Any] },
        "EndTime" -> EndTime.map { x => x.asInstanceOf[js.Any] },
        "Message" -> Message.map { x => x.asInstanceOf[js.Any] },
        "InputDataConfig" -> InputDataConfig.map { x => x.asInstanceOf[js.Any] },
        "DocumentClassifierArn" -> DocumentClassifierArn.map { x => x.asInstanceOf[js.Any] },
        "OutputDataConfig" -> OutputDataConfig.map { x => x.asInstanceOf[js.Any] },
        "DataAccessRoleArn" -> DataAccessRoleArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DocumentClassificationJobProperties]
    }
  }

  /**
   * <p>Provides information for filtering a list of document classifiers. You can only specify one filtering parameter in a request. For more information, see the operation.</p>
   */
  @js.native
  trait DocumentClassifierFilter extends js.Object {
    var Status: js.UndefOr[ModelStatus]
    var SubmitTimeBefore: js.UndefOr[Timestamp]
    var SubmitTimeAfter: js.UndefOr[Timestamp]
  }

  object DocumentClassifierFilter {
    def apply(
      Status: js.UndefOr[ModelStatus] = js.undefined,
      SubmitTimeBefore: js.UndefOr[Timestamp] = js.undefined,
      SubmitTimeAfter: js.UndefOr[Timestamp] = js.undefined): DocumentClassifierFilter = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] },
        "SubmitTimeBefore" -> SubmitTimeBefore.map { x => x.asInstanceOf[js.Any] },
        "SubmitTimeAfter" -> SubmitTimeAfter.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DocumentClassifierFilter]
    }
  }

  /**
   * <p>The input properties for training a document classifier. </p> <p>For more information on how the input file is formatted, see <a>how-document-classification-training-data</a>. </p>
   */
  @js.native
  trait DocumentClassifierInputDataConfig extends js.Object {
    var S3Uri: js.UndefOr[S3Uri]
  }

  object DocumentClassifierInputDataConfig {
    def apply(
      S3Uri: js.UndefOr[S3Uri] = js.undefined): DocumentClassifierInputDataConfig = {
      val _fields = IndexedSeq[(String, js.Any)](
        "S3Uri" -> S3Uri.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DocumentClassifierInputDataConfig]
    }
  }

  /**
   * <p>Provides information about a document classifier.</p>
   */
  @js.native
  trait DocumentClassifierProperties extends js.Object {
    var SubmitTime: js.UndefOr[Timestamp]
    var TrainingStartTime: js.UndefOr[Timestamp]
    var ClassifierMetadata: js.UndefOr[ClassifierMetadata]
    var EndTime: js.UndefOr[Timestamp]
    var Message: js.UndefOr[AnyLengthString]
    var LanguageCode: js.UndefOr[LanguageCode]
    var InputDataConfig: js.UndefOr[DocumentClassifierInputDataConfig]
    var DocumentClassifierArn: js.UndefOr[DocumentClassifierArn]
    var TrainingEndTime: js.UndefOr[Timestamp]
    var DataAccessRoleArn: js.UndefOr[IamRoleArn]
    var Status: js.UndefOr[ModelStatus]
  }

  object DocumentClassifierProperties {
    def apply(
      SubmitTime: js.UndefOr[Timestamp] = js.undefined,
      TrainingStartTime: js.UndefOr[Timestamp] = js.undefined,
      ClassifierMetadata: js.UndefOr[ClassifierMetadata] = js.undefined,
      EndTime: js.UndefOr[Timestamp] = js.undefined,
      Message: js.UndefOr[AnyLengthString] = js.undefined,
      LanguageCode: js.UndefOr[LanguageCode] = js.undefined,
      InputDataConfig: js.UndefOr[DocumentClassifierInputDataConfig] = js.undefined,
      DocumentClassifierArn: js.UndefOr[DocumentClassifierArn] = js.undefined,
      TrainingEndTime: js.UndefOr[Timestamp] = js.undefined,
      DataAccessRoleArn: js.UndefOr[IamRoleArn] = js.undefined,
      Status: js.UndefOr[ModelStatus] = js.undefined): DocumentClassifierProperties = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SubmitTime" -> SubmitTime.map { x => x.asInstanceOf[js.Any] },
        "TrainingStartTime" -> TrainingStartTime.map { x => x.asInstanceOf[js.Any] },
        "ClassifierMetadata" -> ClassifierMetadata.map { x => x.asInstanceOf[js.Any] },
        "EndTime" -> EndTime.map { x => x.asInstanceOf[js.Any] },
        "Message" -> Message.map { x => x.asInstanceOf[js.Any] },
        "LanguageCode" -> LanguageCode.map { x => x.asInstanceOf[js.Any] },
        "InputDataConfig" -> InputDataConfig.map { x => x.asInstanceOf[js.Any] },
        "DocumentClassifierArn" -> DocumentClassifierArn.map { x => x.asInstanceOf[js.Any] },
        "TrainingEndTime" -> TrainingEndTime.map { x => x.asInstanceOf[js.Any] },
        "DataAccessRoleArn" -> DataAccessRoleArn.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DocumentClassifierProperties]
    }
  }

  /**
   * <p>Returns the code for the dominant language in the input text and the level of confidence that Amazon Comprehend has in the accuracy of the detection.</p>
   */
  @js.native
  trait DominantLanguage extends js.Object {
    var LanguageCode: js.UndefOr[String]
    var Score: js.UndefOr[Float]
  }

  object DominantLanguage {
    def apply(
      LanguageCode: js.UndefOr[String] = js.undefined,
      Score: js.UndefOr[Float] = js.undefined): DominantLanguage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LanguageCode" -> LanguageCode.map { x => x.asInstanceOf[js.Any] },
        "Score" -> Score.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DominantLanguage]
    }
  }

  /**
   * <p>Provides information for filtering a list of dominant language detection jobs. For more information, see the operation.</p>
   */
  @js.native
  trait DominantLanguageDetectionJobFilter extends js.Object {
    var JobName: js.UndefOr[JobName]
    var JobStatus: js.UndefOr[JobStatus]
    var SubmitTimeBefore: js.UndefOr[Timestamp]
    var SubmitTimeAfter: js.UndefOr[Timestamp]
  }

  object DominantLanguageDetectionJobFilter {
    def apply(
      JobName: js.UndefOr[JobName] = js.undefined,
      JobStatus: js.UndefOr[JobStatus] = js.undefined,
      SubmitTimeBefore: js.UndefOr[Timestamp] = js.undefined,
      SubmitTimeAfter: js.UndefOr[Timestamp] = js.undefined): DominantLanguageDetectionJobFilter = {
      val _fields = IndexedSeq[(String, js.Any)](
        "JobName" -> JobName.map { x => x.asInstanceOf[js.Any] },
        "JobStatus" -> JobStatus.map { x => x.asInstanceOf[js.Any] },
        "SubmitTimeBefore" -> SubmitTimeBefore.map { x => x.asInstanceOf[js.Any] },
        "SubmitTimeAfter" -> SubmitTimeAfter.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DominantLanguageDetectionJobFilter]
    }
  }

  /**
   * <p>Provides information about a dominant language detection job.</p>
   */
  @js.native
  trait DominantLanguageDetectionJobProperties extends js.Object {
    var SubmitTime: js.UndefOr[Timestamp]
    var JobId: js.UndefOr[JobId]
    var JobName: js.UndefOr[JobName]
    var JobStatus: js.UndefOr[JobStatus]
    var EndTime: js.UndefOr[Timestamp]
    var Message: js.UndefOr[AnyLengthString]
    var InputDataConfig: js.UndefOr[InputDataConfig]
    var OutputDataConfig: js.UndefOr[OutputDataConfig]
    var DataAccessRoleArn: js.UndefOr[IamRoleArn]
  }

  object DominantLanguageDetectionJobProperties {
    def apply(
      SubmitTime: js.UndefOr[Timestamp] = js.undefined,
      JobId: js.UndefOr[JobId] = js.undefined,
      JobName: js.UndefOr[JobName] = js.undefined,
      JobStatus: js.UndefOr[JobStatus] = js.undefined,
      EndTime: js.UndefOr[Timestamp] = js.undefined,
      Message: js.UndefOr[AnyLengthString] = js.undefined,
      InputDataConfig: js.UndefOr[InputDataConfig] = js.undefined,
      OutputDataConfig: js.UndefOr[OutputDataConfig] = js.undefined,
      DataAccessRoleArn: js.UndefOr[IamRoleArn] = js.undefined): DominantLanguageDetectionJobProperties = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SubmitTime" -> SubmitTime.map { x => x.asInstanceOf[js.Any] },
        "JobId" -> JobId.map { x => x.asInstanceOf[js.Any] },
        "JobName" -> JobName.map { x => x.asInstanceOf[js.Any] },
        "JobStatus" -> JobStatus.map { x => x.asInstanceOf[js.Any] },
        "EndTime" -> EndTime.map { x => x.asInstanceOf[js.Any] },
        "Message" -> Message.map { x => x.asInstanceOf[js.Any] },
        "InputDataConfig" -> InputDataConfig.map { x => x.asInstanceOf[js.Any] },
        "OutputDataConfig" -> OutputDataConfig.map { x => x.asInstanceOf[js.Any] },
        "DataAccessRoleArn" -> DataAccessRoleArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DominantLanguageDetectionJobProperties]
    }
  }

  /**
   * <p>Provides information for filtering a list of dominant language detection jobs. For more information, see the operation.</p>
   */
  @js.native
  trait EntitiesDetectionJobFilter extends js.Object {
    var JobName: js.UndefOr[JobName]
    var JobStatus: js.UndefOr[JobStatus]
    var SubmitTimeBefore: js.UndefOr[Timestamp]
    var SubmitTimeAfter: js.UndefOr[Timestamp]
  }

  object EntitiesDetectionJobFilter {
    def apply(
      JobName: js.UndefOr[JobName] = js.undefined,
      JobStatus: js.UndefOr[JobStatus] = js.undefined,
      SubmitTimeBefore: js.UndefOr[Timestamp] = js.undefined,
      SubmitTimeAfter: js.UndefOr[Timestamp] = js.undefined): EntitiesDetectionJobFilter = {
      val _fields = IndexedSeq[(String, js.Any)](
        "JobName" -> JobName.map { x => x.asInstanceOf[js.Any] },
        "JobStatus" -> JobStatus.map { x => x.asInstanceOf[js.Any] },
        "SubmitTimeBefore" -> SubmitTimeBefore.map { x => x.asInstanceOf[js.Any] },
        "SubmitTimeAfter" -> SubmitTimeAfter.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EntitiesDetectionJobFilter]
    }
  }

  /**
   * <p>Provides information about an entities detection job.</p>
   */
  @js.native
  trait EntitiesDetectionJobProperties extends js.Object {
    var SubmitTime: js.UndefOr[Timestamp]
    var JobId: js.UndefOr[JobId]
    var JobName: js.UndefOr[JobName]
    var JobStatus: js.UndefOr[JobStatus]
    var EndTime: js.UndefOr[Timestamp]
    var EntityRecognizerArn: js.UndefOr[EntityRecognizerArn]
    var Message: js.UndefOr[AnyLengthString]
    var LanguageCode: js.UndefOr[LanguageCode]
    var InputDataConfig: js.UndefOr[InputDataConfig]
    var OutputDataConfig: js.UndefOr[OutputDataConfig]
    var DataAccessRoleArn: js.UndefOr[IamRoleArn]
  }

  object EntitiesDetectionJobProperties {
    def apply(
      SubmitTime: js.UndefOr[Timestamp] = js.undefined,
      JobId: js.UndefOr[JobId] = js.undefined,
      JobName: js.UndefOr[JobName] = js.undefined,
      JobStatus: js.UndefOr[JobStatus] = js.undefined,
      EndTime: js.UndefOr[Timestamp] = js.undefined,
      EntityRecognizerArn: js.UndefOr[EntityRecognizerArn] = js.undefined,
      Message: js.UndefOr[AnyLengthString] = js.undefined,
      LanguageCode: js.UndefOr[LanguageCode] = js.undefined,
      InputDataConfig: js.UndefOr[InputDataConfig] = js.undefined,
      OutputDataConfig: js.UndefOr[OutputDataConfig] = js.undefined,
      DataAccessRoleArn: js.UndefOr[IamRoleArn] = js.undefined): EntitiesDetectionJobProperties = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SubmitTime" -> SubmitTime.map { x => x.asInstanceOf[js.Any] },
        "JobId" -> JobId.map { x => x.asInstanceOf[js.Any] },
        "JobName" -> JobName.map { x => x.asInstanceOf[js.Any] },
        "JobStatus" -> JobStatus.map { x => x.asInstanceOf[js.Any] },
        "EndTime" -> EndTime.map { x => x.asInstanceOf[js.Any] },
        "EntityRecognizerArn" -> EntityRecognizerArn.map { x => x.asInstanceOf[js.Any] },
        "Message" -> Message.map { x => x.asInstanceOf[js.Any] },
        "LanguageCode" -> LanguageCode.map { x => x.asInstanceOf[js.Any] },
        "InputDataConfig" -> InputDataConfig.map { x => x.asInstanceOf[js.Any] },
        "OutputDataConfig" -> OutputDataConfig.map { x => x.asInstanceOf[js.Any] },
        "DataAccessRoleArn" -> DataAccessRoleArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EntitiesDetectionJobProperties]
    }
  }

  /**
   * <p>Provides information about an entity. </p> <p> </p>
   */
  @js.native
  trait Entity extends js.Object {
    var BeginOffset: js.UndefOr[Int]
    var EndOffset: js.UndefOr[Int]
    var Text: js.UndefOr[String]
    var Score: js.UndefOr[Float]
    var Type: js.UndefOr[EntityType]
  }

  object Entity {
    def apply(
      BeginOffset: js.UndefOr[Int] = js.undefined,
      EndOffset: js.UndefOr[Int] = js.undefined,
      Text: js.UndefOr[String] = js.undefined,
      Score: js.UndefOr[Float] = js.undefined,
      Type: js.UndefOr[EntityType] = js.undefined): Entity = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BeginOffset" -> BeginOffset.map { x => x.asInstanceOf[js.Any] },
        "EndOffset" -> EndOffset.map { x => x.asInstanceOf[js.Any] },
        "Text" -> Text.map { x => x.asInstanceOf[js.Any] },
        "Score" -> Score.map { x => x.asInstanceOf[js.Any] },
        "Type" -> Type.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Entity]
    }
  }

  /**
   * <p>Describes the annotations associated with a entity recognizer.</p>
   */
  @js.native
  trait EntityRecognizerAnnotations extends js.Object {
    var S3Uri: js.UndefOr[S3Uri]
  }

  object EntityRecognizerAnnotations {
    def apply(
      S3Uri: js.UndefOr[S3Uri] = js.undefined): EntityRecognizerAnnotations = {
      val _fields = IndexedSeq[(String, js.Any)](
        "S3Uri" -> S3Uri.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EntityRecognizerAnnotations]
    }
  }

  /**
   * <p>Describes the training documents submitted with an entity recognizer.</p>
   */
  @js.native
  trait EntityRecognizerDocuments extends js.Object {
    var S3Uri: js.UndefOr[S3Uri]
  }

  object EntityRecognizerDocuments {
    def apply(
      S3Uri: js.UndefOr[S3Uri] = js.undefined): EntityRecognizerDocuments = {
      val _fields = IndexedSeq[(String, js.Any)](
        "S3Uri" -> S3Uri.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EntityRecognizerDocuments]
    }
  }

  /**
   * <p>Describes the entity recognizer submitted with an entity recognizer.</p>
   */
  @js.native
  trait EntityRecognizerEntityList extends js.Object {
    var S3Uri: js.UndefOr[S3Uri]
  }

  object EntityRecognizerEntityList {
    def apply(
      S3Uri: js.UndefOr[S3Uri] = js.undefined): EntityRecognizerEntityList = {
      val _fields = IndexedSeq[(String, js.Any)](
        "S3Uri" -> S3Uri.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EntityRecognizerEntityList]
    }
  }

  /**
   * <p> Detailed information about the accuracy of an entity recognizer. </p>
   */
  @js.native
  trait EntityRecognizerEvaluationMetrics extends js.Object {
    var Precision: js.UndefOr[Double]
    var Recall: js.UndefOr[Double]
    var F1Score: js.UndefOr[Double]
  }

  object EntityRecognizerEvaluationMetrics {
    def apply(
      Precision: js.UndefOr[Double] = js.undefined,
      Recall: js.UndefOr[Double] = js.undefined,
      F1Score: js.UndefOr[Double] = js.undefined): EntityRecognizerEvaluationMetrics = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Precision" -> Precision.map { x => x.asInstanceOf[js.Any] },
        "Recall" -> Recall.map { x => x.asInstanceOf[js.Any] },
        "F1Score" -> F1Score.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EntityRecognizerEvaluationMetrics]
    }
  }

  /**
   * <p>Provides information for filtering a list of entity recognizers. You can only specify one filtering parameter in a request. For more information, see the operation./&gt;</p>
   */
  @js.native
  trait EntityRecognizerFilter extends js.Object {
    var Status: js.UndefOr[ModelStatus]
    var SubmitTimeBefore: js.UndefOr[Timestamp]
    var SubmitTimeAfter: js.UndefOr[Timestamp]
  }

  object EntityRecognizerFilter {
    def apply(
      Status: js.UndefOr[ModelStatus] = js.undefined,
      SubmitTimeBefore: js.UndefOr[Timestamp] = js.undefined,
      SubmitTimeAfter: js.UndefOr[Timestamp] = js.undefined): EntityRecognizerFilter = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] },
        "SubmitTimeBefore" -> SubmitTimeBefore.map { x => x.asInstanceOf[js.Any] },
        "SubmitTimeAfter" -> SubmitTimeAfter.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EntityRecognizerFilter]
    }
  }

  /**
   * <p>Specifies the format and location of the input data.</p>
   */
  @js.native
  trait EntityRecognizerInputDataConfig extends js.Object {
    var EntityTypes: js.UndefOr[EntityTypesList]
    var Documents: js.UndefOr[EntityRecognizerDocuments]
    var Annotations: js.UndefOr[EntityRecognizerAnnotations]
    var EntityList: js.UndefOr[EntityRecognizerEntityList]
  }

  object EntityRecognizerInputDataConfig {
    def apply(
      EntityTypes: js.UndefOr[EntityTypesList] = js.undefined,
      Documents: js.UndefOr[EntityRecognizerDocuments] = js.undefined,
      Annotations: js.UndefOr[EntityRecognizerAnnotations] = js.undefined,
      EntityList: js.UndefOr[EntityRecognizerEntityList] = js.undefined): EntityRecognizerInputDataConfig = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EntityTypes" -> EntityTypes.map { x => x.asInstanceOf[js.Any] },
        "Documents" -> Documents.map { x => x.asInstanceOf[js.Any] },
        "Annotations" -> Annotations.map { x => x.asInstanceOf[js.Any] },
        "EntityList" -> EntityList.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EntityRecognizerInputDataConfig]
    }
  }

  /**
   * <p>Detailed information about an entity recognizer.</p>
   */
  @js.native
  trait EntityRecognizerMetadata extends js.Object {
    var NumberOfTrainedDocuments: js.UndefOr[Int]
    var NumberOfTestDocuments: js.UndefOr[Int]
    var EvaluationMetrics: js.UndefOr[EntityRecognizerEvaluationMetrics]
    var EntityTypes: js.UndefOr[EntityRecognizerMetadataEntityTypesList]
  }

  object EntityRecognizerMetadata {
    def apply(
      NumberOfTrainedDocuments: js.UndefOr[Int] = js.undefined,
      NumberOfTestDocuments: js.UndefOr[Int] = js.undefined,
      EvaluationMetrics: js.UndefOr[EntityRecognizerEvaluationMetrics] = js.undefined,
      EntityTypes: js.UndefOr[EntityRecognizerMetadataEntityTypesList] = js.undefined): EntityRecognizerMetadata = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NumberOfTrainedDocuments" -> NumberOfTrainedDocuments.map { x => x.asInstanceOf[js.Any] },
        "NumberOfTestDocuments" -> NumberOfTestDocuments.map { x => x.asInstanceOf[js.Any] },
        "EvaluationMetrics" -> EvaluationMetrics.map { x => x.asInstanceOf[js.Any] },
        "EntityTypes" -> EntityTypes.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EntityRecognizerMetadata]
    }
  }

  /**
   * <p>Individual item from the list of entity types in the metadata of an entity recognizer.</p>
   */
  @js.native
  trait EntityRecognizerMetadataEntityTypesListItem extends js.Object {
    var Type: js.UndefOr[AnyLengthString]
  }

  object EntityRecognizerMetadataEntityTypesListItem {
    def apply(
      Type: js.UndefOr[AnyLengthString] = js.undefined): EntityRecognizerMetadataEntityTypesListItem = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Type" -> Type.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EntityRecognizerMetadataEntityTypesListItem]
    }
  }

  /**
   * <p>Describes information about an entity recognizer.</p>
   */
  @js.native
  trait EntityRecognizerProperties extends js.Object {
    var SubmitTime: js.UndefOr[Timestamp]
    var TrainingStartTime: js.UndefOr[Timestamp]
    var RecognizerMetadata: js.UndefOr[EntityRecognizerMetadata]
    var EndTime: js.UndefOr[Timestamp]
    var EntityRecognizerArn: js.UndefOr[EntityRecognizerArn]
    var Message: js.UndefOr[AnyLengthString]
    var LanguageCode: js.UndefOr[LanguageCode]
    var InputDataConfig: js.UndefOr[EntityRecognizerInputDataConfig]
    var TrainingEndTime: js.UndefOr[Timestamp]
    var DataAccessRoleArn: js.UndefOr[IamRoleArn]
    var Status: js.UndefOr[ModelStatus]
  }

  object EntityRecognizerProperties {
    def apply(
      SubmitTime: js.UndefOr[Timestamp] = js.undefined,
      TrainingStartTime: js.UndefOr[Timestamp] = js.undefined,
      RecognizerMetadata: js.UndefOr[EntityRecognizerMetadata] = js.undefined,
      EndTime: js.UndefOr[Timestamp] = js.undefined,
      EntityRecognizerArn: js.UndefOr[EntityRecognizerArn] = js.undefined,
      Message: js.UndefOr[AnyLengthString] = js.undefined,
      LanguageCode: js.UndefOr[LanguageCode] = js.undefined,
      InputDataConfig: js.UndefOr[EntityRecognizerInputDataConfig] = js.undefined,
      TrainingEndTime: js.UndefOr[Timestamp] = js.undefined,
      DataAccessRoleArn: js.UndefOr[IamRoleArn] = js.undefined,
      Status: js.UndefOr[ModelStatus] = js.undefined): EntityRecognizerProperties = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SubmitTime" -> SubmitTime.map { x => x.asInstanceOf[js.Any] },
        "TrainingStartTime" -> TrainingStartTime.map { x => x.asInstanceOf[js.Any] },
        "RecognizerMetadata" -> RecognizerMetadata.map { x => x.asInstanceOf[js.Any] },
        "EndTime" -> EndTime.map { x => x.asInstanceOf[js.Any] },
        "EntityRecognizerArn" -> EntityRecognizerArn.map { x => x.asInstanceOf[js.Any] },
        "Message" -> Message.map { x => x.asInstanceOf[js.Any] },
        "LanguageCode" -> LanguageCode.map { x => x.asInstanceOf[js.Any] },
        "InputDataConfig" -> InputDataConfig.map { x => x.asInstanceOf[js.Any] },
        "TrainingEndTime" -> TrainingEndTime.map { x => x.asInstanceOf[js.Any] },
        "DataAccessRoleArn" -> DataAccessRoleArn.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EntityRecognizerProperties]
    }
  }

  object EntityTypeEnum {
    val PERSON = "PERSON"
    val LOCATION = "LOCATION"
    val ORGANIZATION = "ORGANIZATION"
    val COMMERCIAL_ITEM = "COMMERCIAL_ITEM"
    val EVENT = "EVENT"
    val DATE = "DATE"
    val QUANTITY = "QUANTITY"
    val TITLE = "TITLE"
    val OTHER = "OTHER"

    val values = IndexedSeq(PERSON, LOCATION, ORGANIZATION, COMMERCIAL_ITEM, EVENT, DATE, QUANTITY, TITLE, OTHER)
  }

  /**
   * <p>Information about an individual item on a list of entity types.</p>
   */
  @js.native
  trait EntityTypesListItem extends js.Object {
    var Type: js.UndefOr[EntityTypeName]
  }

  object EntityTypesListItem {
    def apply(
      Type: js.UndefOr[EntityTypeName] = js.undefined): EntityTypesListItem = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Type" -> Type.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EntityTypesListItem]
    }
  }

  /**
   * <p>The input properties for a topic detection job.</p>
   */
  @js.native
  trait InputDataConfig extends js.Object {
    var S3Uri: js.UndefOr[S3Uri]
    var InputFormat: js.UndefOr[InputFormat]
  }

  object InputDataConfig {
    def apply(
      S3Uri: js.UndefOr[S3Uri] = js.undefined,
      InputFormat: js.UndefOr[InputFormat] = js.undefined): InputDataConfig = {
      val _fields = IndexedSeq[(String, js.Any)](
        "S3Uri" -> S3Uri.map { x => x.asInstanceOf[js.Any] },
        "InputFormat" -> InputFormat.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InputDataConfig]
    }
  }

  object InputFormatEnum {
    val ONE_DOC_PER_FILE = "ONE_DOC_PER_FILE"
    val ONE_DOC_PER_LINE = "ONE_DOC_PER_LINE"

    val values = IndexedSeq(ONE_DOC_PER_FILE, ONE_DOC_PER_LINE)
  }

  object JobStatusEnum {
    val SUBMITTED = "SUBMITTED"
    val IN_PROGRESS = "IN_PROGRESS"
    val COMPLETED = "COMPLETED"
    val FAILED = "FAILED"
    val STOP_REQUESTED = "STOP_REQUESTED"
    val STOPPED = "STOPPED"

    val values = IndexedSeq(SUBMITTED, IN_PROGRESS, COMPLETED, FAILED, STOP_REQUESTED, STOPPED)
  }

  /**
   * <p>Describes a key noun phrase.</p>
   */
  @js.native
  trait KeyPhrase extends js.Object {
    var Score: js.UndefOr[Float]
    var Text: js.UndefOr[String]
    var BeginOffset: js.UndefOr[Int]
    var EndOffset: js.UndefOr[Int]
  }

  object KeyPhrase {
    def apply(
      Score: js.UndefOr[Float] = js.undefined,
      Text: js.UndefOr[String] = js.undefined,
      BeginOffset: js.UndefOr[Int] = js.undefined,
      EndOffset: js.UndefOr[Int] = js.undefined): KeyPhrase = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Score" -> Score.map { x => x.asInstanceOf[js.Any] },
        "Text" -> Text.map { x => x.asInstanceOf[js.Any] },
        "BeginOffset" -> BeginOffset.map { x => x.asInstanceOf[js.Any] },
        "EndOffset" -> EndOffset.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[KeyPhrase]
    }
  }

  /**
   * <p>Provides information for filtering a list of dominant language detection jobs. For more information, see the operation.</p>
   */
  @js.native
  trait KeyPhrasesDetectionJobFilter extends js.Object {
    var JobName: js.UndefOr[JobName]
    var JobStatus: js.UndefOr[JobStatus]
    var SubmitTimeBefore: js.UndefOr[Timestamp]
    var SubmitTimeAfter: js.UndefOr[Timestamp]
  }

  object KeyPhrasesDetectionJobFilter {
    def apply(
      JobName: js.UndefOr[JobName] = js.undefined,
      JobStatus: js.UndefOr[JobStatus] = js.undefined,
      SubmitTimeBefore: js.UndefOr[Timestamp] = js.undefined,
      SubmitTimeAfter: js.UndefOr[Timestamp] = js.undefined): KeyPhrasesDetectionJobFilter = {
      val _fields = IndexedSeq[(String, js.Any)](
        "JobName" -> JobName.map { x => x.asInstanceOf[js.Any] },
        "JobStatus" -> JobStatus.map { x => x.asInstanceOf[js.Any] },
        "SubmitTimeBefore" -> SubmitTimeBefore.map { x => x.asInstanceOf[js.Any] },
        "SubmitTimeAfter" -> SubmitTimeAfter.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[KeyPhrasesDetectionJobFilter]
    }
  }

  /**
   * <p>Provides information about a key phrases detection job.</p>
   */
  @js.native
  trait KeyPhrasesDetectionJobProperties extends js.Object {
    var SubmitTime: js.UndefOr[Timestamp]
    var JobId: js.UndefOr[JobId]
    var JobName: js.UndefOr[JobName]
    var JobStatus: js.UndefOr[JobStatus]
    var EndTime: js.UndefOr[Timestamp]
    var Message: js.UndefOr[AnyLengthString]
    var LanguageCode: js.UndefOr[LanguageCode]
    var InputDataConfig: js.UndefOr[InputDataConfig]
    var OutputDataConfig: js.UndefOr[OutputDataConfig]
    var DataAccessRoleArn: js.UndefOr[IamRoleArn]
  }

  object KeyPhrasesDetectionJobProperties {
    def apply(
      SubmitTime: js.UndefOr[Timestamp] = js.undefined,
      JobId: js.UndefOr[JobId] = js.undefined,
      JobName: js.UndefOr[JobName] = js.undefined,
      JobStatus: js.UndefOr[JobStatus] = js.undefined,
      EndTime: js.UndefOr[Timestamp] = js.undefined,
      Message: js.UndefOr[AnyLengthString] = js.undefined,
      LanguageCode: js.UndefOr[LanguageCode] = js.undefined,
      InputDataConfig: js.UndefOr[InputDataConfig] = js.undefined,
      OutputDataConfig: js.UndefOr[OutputDataConfig] = js.undefined,
      DataAccessRoleArn: js.UndefOr[IamRoleArn] = js.undefined): KeyPhrasesDetectionJobProperties = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SubmitTime" -> SubmitTime.map { x => x.asInstanceOf[js.Any] },
        "JobId" -> JobId.map { x => x.asInstanceOf[js.Any] },
        "JobName" -> JobName.map { x => x.asInstanceOf[js.Any] },
        "JobStatus" -> JobStatus.map { x => x.asInstanceOf[js.Any] },
        "EndTime" -> EndTime.map { x => x.asInstanceOf[js.Any] },
        "Message" -> Message.map { x => x.asInstanceOf[js.Any] },
        "LanguageCode" -> LanguageCode.map { x => x.asInstanceOf[js.Any] },
        "InputDataConfig" -> InputDataConfig.map { x => x.asInstanceOf[js.Any] },
        "OutputDataConfig" -> OutputDataConfig.map { x => x.asInstanceOf[js.Any] },
        "DataAccessRoleArn" -> DataAccessRoleArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[KeyPhrasesDetectionJobProperties]
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
    var NextToken: js.UndefOr[String]
    var MaxResults: js.UndefOr[MaxResultsInteger]
  }

  object ListDocumentClassificationJobsRequest {
    def apply(
      Filter: js.UndefOr[DocumentClassificationJobFilter] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined,
      MaxResults: js.UndefOr[MaxResultsInteger] = js.undefined): ListDocumentClassificationJobsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Filter" -> Filter.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListDocumentClassificationJobsRequest]
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
      NextToken: js.UndefOr[String] = js.undefined): ListDocumentClassificationJobsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DocumentClassificationJobPropertiesList" -> DocumentClassificationJobPropertiesList.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListDocumentClassificationJobsResponse]
    }
  }

  @js.native
  trait ListDocumentClassifiersRequest extends js.Object {
    var Filter: js.UndefOr[DocumentClassifierFilter]
    var NextToken: js.UndefOr[String]
    var MaxResults: js.UndefOr[MaxResultsInteger]
  }

  object ListDocumentClassifiersRequest {
    def apply(
      Filter: js.UndefOr[DocumentClassifierFilter] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined,
      MaxResults: js.UndefOr[MaxResultsInteger] = js.undefined): ListDocumentClassifiersRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Filter" -> Filter.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListDocumentClassifiersRequest]
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
      NextToken: js.UndefOr[String] = js.undefined): ListDocumentClassifiersResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DocumentClassifierPropertiesList" -> DocumentClassifierPropertiesList.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListDocumentClassifiersResponse]
    }
  }

  @js.native
  trait ListDominantLanguageDetectionJobsRequest extends js.Object {
    var Filter: js.UndefOr[DominantLanguageDetectionJobFilter]
    var NextToken: js.UndefOr[String]
    var MaxResults: js.UndefOr[MaxResultsInteger]
  }

  object ListDominantLanguageDetectionJobsRequest {
    def apply(
      Filter: js.UndefOr[DominantLanguageDetectionJobFilter] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined,
      MaxResults: js.UndefOr[MaxResultsInteger] = js.undefined): ListDominantLanguageDetectionJobsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Filter" -> Filter.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListDominantLanguageDetectionJobsRequest]
    }
  }

  @js.native
  trait ListDominantLanguageDetectionJobsResponse extends js.Object {
    var DominantLanguageDetectionJobPropertiesList: js.UndefOr[DominantLanguageDetectionJobPropertiesList]
    var NextToken: js.UndefOr[String]
  }

  object ListDominantLanguageDetectionJobsResponse {
    def apply(
      DominantLanguageDetectionJobPropertiesList: js.UndefOr[DominantLanguageDetectionJobPropertiesList] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined): ListDominantLanguageDetectionJobsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DominantLanguageDetectionJobPropertiesList" -> DominantLanguageDetectionJobPropertiesList.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListDominantLanguageDetectionJobsResponse]
    }
  }

  @js.native
  trait ListEntitiesDetectionJobsRequest extends js.Object {
    var Filter: js.UndefOr[EntitiesDetectionJobFilter]
    var NextToken: js.UndefOr[String]
    var MaxResults: js.UndefOr[MaxResultsInteger]
  }

  object ListEntitiesDetectionJobsRequest {
    def apply(
      Filter: js.UndefOr[EntitiesDetectionJobFilter] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined,
      MaxResults: js.UndefOr[MaxResultsInteger] = js.undefined): ListEntitiesDetectionJobsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Filter" -> Filter.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListEntitiesDetectionJobsRequest]
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
      NextToken: js.UndefOr[String] = js.undefined): ListEntitiesDetectionJobsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EntitiesDetectionJobPropertiesList" -> EntitiesDetectionJobPropertiesList.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListEntitiesDetectionJobsResponse]
    }
  }

  @js.native
  trait ListEntityRecognizersRequest extends js.Object {
    var Filter: js.UndefOr[EntityRecognizerFilter]
    var NextToken: js.UndefOr[String]
    var MaxResults: js.UndefOr[MaxResultsInteger]
  }

  object ListEntityRecognizersRequest {
    def apply(
      Filter: js.UndefOr[EntityRecognizerFilter] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined,
      MaxResults: js.UndefOr[MaxResultsInteger] = js.undefined): ListEntityRecognizersRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Filter" -> Filter.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListEntityRecognizersRequest]
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
      NextToken: js.UndefOr[String] = js.undefined): ListEntityRecognizersResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EntityRecognizerPropertiesList" -> EntityRecognizerPropertiesList.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListEntityRecognizersResponse]
    }
  }

  @js.native
  trait ListKeyPhrasesDetectionJobsRequest extends js.Object {
    var Filter: js.UndefOr[KeyPhrasesDetectionJobFilter]
    var NextToken: js.UndefOr[String]
    var MaxResults: js.UndefOr[MaxResultsInteger]
  }

  object ListKeyPhrasesDetectionJobsRequest {
    def apply(
      Filter: js.UndefOr[KeyPhrasesDetectionJobFilter] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined,
      MaxResults: js.UndefOr[MaxResultsInteger] = js.undefined): ListKeyPhrasesDetectionJobsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Filter" -> Filter.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListKeyPhrasesDetectionJobsRequest]
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
      NextToken: js.UndefOr[String] = js.undefined): ListKeyPhrasesDetectionJobsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "KeyPhrasesDetectionJobPropertiesList" -> KeyPhrasesDetectionJobPropertiesList.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListKeyPhrasesDetectionJobsResponse]
    }
  }

  @js.native
  trait ListSentimentDetectionJobsRequest extends js.Object {
    var Filter: js.UndefOr[SentimentDetectionJobFilter]
    var NextToken: js.UndefOr[String]
    var MaxResults: js.UndefOr[MaxResultsInteger]
  }

  object ListSentimentDetectionJobsRequest {
    def apply(
      Filter: js.UndefOr[SentimentDetectionJobFilter] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined,
      MaxResults: js.UndefOr[MaxResultsInteger] = js.undefined): ListSentimentDetectionJobsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Filter" -> Filter.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListSentimentDetectionJobsRequest]
    }
  }

  @js.native
  trait ListSentimentDetectionJobsResponse extends js.Object {
    var SentimentDetectionJobPropertiesList: js.UndefOr[SentimentDetectionJobPropertiesList]
    var NextToken: js.UndefOr[String]
  }

  object ListSentimentDetectionJobsResponse {
    def apply(
      SentimentDetectionJobPropertiesList: js.UndefOr[SentimentDetectionJobPropertiesList] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined): ListSentimentDetectionJobsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SentimentDetectionJobPropertiesList" -> SentimentDetectionJobPropertiesList.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListSentimentDetectionJobsResponse]
    }
  }

  @js.native
  trait ListTopicsDetectionJobsRequest extends js.Object {
    var Filter: js.UndefOr[TopicsDetectionJobFilter]
    var NextToken: js.UndefOr[String]
    var MaxResults: js.UndefOr[MaxResultsInteger]
  }

  object ListTopicsDetectionJobsRequest {
    def apply(
      Filter: js.UndefOr[TopicsDetectionJobFilter] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined,
      MaxResults: js.UndefOr[MaxResultsInteger] = js.undefined): ListTopicsDetectionJobsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Filter" -> Filter.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTopicsDetectionJobsRequest]
    }
  }

  @js.native
  trait ListTopicsDetectionJobsResponse extends js.Object {
    var TopicsDetectionJobPropertiesList: js.UndefOr[TopicsDetectionJobPropertiesList]
    var NextToken: js.UndefOr[String]
  }

  object ListTopicsDetectionJobsResponse {
    def apply(
      TopicsDetectionJobPropertiesList: js.UndefOr[TopicsDetectionJobPropertiesList] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined): ListTopicsDetectionJobsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TopicsDetectionJobPropertiesList" -> TopicsDetectionJobPropertiesList.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTopicsDetectionJobsResponse]
    }
  }

  object ModelStatusEnum {
    val SUBMITTED = "SUBMITTED"
    val TRAINING = "TRAINING"
    val DELETING = "DELETING"
    val IN_ERROR = "IN_ERROR"
    val TRAINED = "TRAINED"

    val values = IndexedSeq(SUBMITTED, TRAINING, DELETING, IN_ERROR, TRAINED)
  }

  /**
   * <p>Provides configuration parameters for the output of topic detection jobs.</p> <p/>
   */
  @js.native
  trait OutputDataConfig extends js.Object {
    var S3Uri: js.UndefOr[S3Uri]
  }

  object OutputDataConfig {
    def apply(
      S3Uri: js.UndefOr[S3Uri] = js.undefined): OutputDataConfig = {
      val _fields = IndexedSeq[(String, js.Any)](
        "S3Uri" -> S3Uri.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[OutputDataConfig]
    }
  }

  /**
   * <p>Identifies the part of speech represented by the token and gives the confidence that Amazon Comprehend has that the part of speech was correctly identified. For more information about the parts of speech that Amazon Comprehend can identify, see <a>how-syntax</a>.</p>
   */
  @js.native
  trait PartOfSpeechTag extends js.Object {
    var Tag: js.UndefOr[PartOfSpeechTagType]
    var Score: js.UndefOr[Float]
  }

  object PartOfSpeechTag {
    def apply(
      Tag: js.UndefOr[PartOfSpeechTagType] = js.undefined,
      Score: js.UndefOr[Float] = js.undefined): PartOfSpeechTag = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Tag" -> Tag.map { x => x.asInstanceOf[js.Any] },
        "Score" -> Score.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PartOfSpeechTag]
    }
  }

  object PartOfSpeechTagTypeEnum {
    val ADJ = "ADJ"
    val ADP = "ADP"
    val ADV = "ADV"
    val AUX = "AUX"
    val CONJ = "CONJ"
    val CCONJ = "CCONJ"
    val DET = "DET"
    val INTJ = "INTJ"
    val NOUN = "NOUN"
    val NUM = "NUM"
    val O = "O"
    val PART = "PART"
    val PRON = "PRON"
    val PROPN = "PROPN"
    val PUNCT = "PUNCT"
    val SCONJ = "SCONJ"
    val SYM = "SYM"
    val VERB = "VERB"

    val values = IndexedSeq(ADJ, ADP, ADV, AUX, CONJ, CCONJ, DET, INTJ, NOUN, NUM, O, PART, PRON, PROPN, PUNCT, SCONJ, SYM, VERB)
  }

  /**
   * <p>Provides information for filtering a list of dominant language detection jobs. For more information, see the operation.</p>
   */
  @js.native
  trait SentimentDetectionJobFilter extends js.Object {
    var JobName: js.UndefOr[JobName]
    var JobStatus: js.UndefOr[JobStatus]
    var SubmitTimeBefore: js.UndefOr[Timestamp]
    var SubmitTimeAfter: js.UndefOr[Timestamp]
  }

  object SentimentDetectionJobFilter {
    def apply(
      JobName: js.UndefOr[JobName] = js.undefined,
      JobStatus: js.UndefOr[JobStatus] = js.undefined,
      SubmitTimeBefore: js.UndefOr[Timestamp] = js.undefined,
      SubmitTimeAfter: js.UndefOr[Timestamp] = js.undefined): SentimentDetectionJobFilter = {
      val _fields = IndexedSeq[(String, js.Any)](
        "JobName" -> JobName.map { x => x.asInstanceOf[js.Any] },
        "JobStatus" -> JobStatus.map { x => x.asInstanceOf[js.Any] },
        "SubmitTimeBefore" -> SubmitTimeBefore.map { x => x.asInstanceOf[js.Any] },
        "SubmitTimeAfter" -> SubmitTimeAfter.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SentimentDetectionJobFilter]
    }
  }

  /**
   * <p>Provides information about a sentiment detection job.</p>
   */
  @js.native
  trait SentimentDetectionJobProperties extends js.Object {
    var SubmitTime: js.UndefOr[Timestamp]
    var JobId: js.UndefOr[JobId]
    var JobName: js.UndefOr[JobName]
    var JobStatus: js.UndefOr[JobStatus]
    var EndTime: js.UndefOr[Timestamp]
    var Message: js.UndefOr[AnyLengthString]
    var LanguageCode: js.UndefOr[LanguageCode]
    var InputDataConfig: js.UndefOr[InputDataConfig]
    var OutputDataConfig: js.UndefOr[OutputDataConfig]
    var DataAccessRoleArn: js.UndefOr[IamRoleArn]
  }

  object SentimentDetectionJobProperties {
    def apply(
      SubmitTime: js.UndefOr[Timestamp] = js.undefined,
      JobId: js.UndefOr[JobId] = js.undefined,
      JobName: js.UndefOr[JobName] = js.undefined,
      JobStatus: js.UndefOr[JobStatus] = js.undefined,
      EndTime: js.UndefOr[Timestamp] = js.undefined,
      Message: js.UndefOr[AnyLengthString] = js.undefined,
      LanguageCode: js.UndefOr[LanguageCode] = js.undefined,
      InputDataConfig: js.UndefOr[InputDataConfig] = js.undefined,
      OutputDataConfig: js.UndefOr[OutputDataConfig] = js.undefined,
      DataAccessRoleArn: js.UndefOr[IamRoleArn] = js.undefined): SentimentDetectionJobProperties = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SubmitTime" -> SubmitTime.map { x => x.asInstanceOf[js.Any] },
        "JobId" -> JobId.map { x => x.asInstanceOf[js.Any] },
        "JobName" -> JobName.map { x => x.asInstanceOf[js.Any] },
        "JobStatus" -> JobStatus.map { x => x.asInstanceOf[js.Any] },
        "EndTime" -> EndTime.map { x => x.asInstanceOf[js.Any] },
        "Message" -> Message.map { x => x.asInstanceOf[js.Any] },
        "LanguageCode" -> LanguageCode.map { x => x.asInstanceOf[js.Any] },
        "InputDataConfig" -> InputDataConfig.map { x => x.asInstanceOf[js.Any] },
        "OutputDataConfig" -> OutputDataConfig.map { x => x.asInstanceOf[js.Any] },
        "DataAccessRoleArn" -> DataAccessRoleArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SentimentDetectionJobProperties]
    }
  }

  /**
   * <p>Describes the level of confidence that Amazon Comprehend has in the accuracy of its detection of sentiments.</p>
   */
  @js.native
  trait SentimentScore extends js.Object {
    var Positive: js.UndefOr[Float]
    var Negative: js.UndefOr[Float]
    var Neutral: js.UndefOr[Float]
    var Mixed: js.UndefOr[Float]
  }

  object SentimentScore {
    def apply(
      Positive: js.UndefOr[Float] = js.undefined,
      Negative: js.UndefOr[Float] = js.undefined,
      Neutral: js.UndefOr[Float] = js.undefined,
      Mixed: js.UndefOr[Float] = js.undefined): SentimentScore = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Positive" -> Positive.map { x => x.asInstanceOf[js.Any] },
        "Negative" -> Negative.map { x => x.asInstanceOf[js.Any] },
        "Neutral" -> Neutral.map { x => x.asInstanceOf[js.Any] },
        "Mixed" -> Mixed.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SentimentScore]
    }
  }

  object SentimentTypeEnum {
    val POSITIVE = "POSITIVE"
    val NEGATIVE = "NEGATIVE"
    val NEUTRAL = "NEUTRAL"
    val MIXED = "MIXED"

    val values = IndexedSeq(POSITIVE, NEGATIVE, NEUTRAL, MIXED)
  }

  @js.native
  trait StartDocumentClassificationJobRequest extends js.Object {
    var JobName: js.UndefOr[JobName]
    var ClientRequestToken: js.UndefOr[ClientRequestTokenString]
    var InputDataConfig: js.UndefOr[InputDataConfig]
    var DocumentClassifierArn: js.UndefOr[DocumentClassifierArn]
    var OutputDataConfig: js.UndefOr[OutputDataConfig]
    var DataAccessRoleArn: js.UndefOr[IamRoleArn]
  }

  object StartDocumentClassificationJobRequest {
    def apply(
      JobName: js.UndefOr[JobName] = js.undefined,
      ClientRequestToken: js.UndefOr[ClientRequestTokenString] = js.undefined,
      InputDataConfig: js.UndefOr[InputDataConfig] = js.undefined,
      DocumentClassifierArn: js.UndefOr[DocumentClassifierArn] = js.undefined,
      OutputDataConfig: js.UndefOr[OutputDataConfig] = js.undefined,
      DataAccessRoleArn: js.UndefOr[IamRoleArn] = js.undefined): StartDocumentClassificationJobRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "JobName" -> JobName.map { x => x.asInstanceOf[js.Any] },
        "ClientRequestToken" -> ClientRequestToken.map { x => x.asInstanceOf[js.Any] },
        "InputDataConfig" -> InputDataConfig.map { x => x.asInstanceOf[js.Any] },
        "DocumentClassifierArn" -> DocumentClassifierArn.map { x => x.asInstanceOf[js.Any] },
        "OutputDataConfig" -> OutputDataConfig.map { x => x.asInstanceOf[js.Any] },
        "DataAccessRoleArn" -> DataAccessRoleArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartDocumentClassificationJobRequest]
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
      JobStatus: js.UndefOr[JobStatus] = js.undefined): StartDocumentClassificationJobResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "JobId" -> JobId.map { x => x.asInstanceOf[js.Any] },
        "JobStatus" -> JobStatus.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartDocumentClassificationJobResponse]
    }
  }

  @js.native
  trait StartDominantLanguageDetectionJobRequest extends js.Object {
    var JobName: js.UndefOr[JobName]
    var ClientRequestToken: js.UndefOr[ClientRequestTokenString]
    var InputDataConfig: js.UndefOr[InputDataConfig]
    var OutputDataConfig: js.UndefOr[OutputDataConfig]
    var DataAccessRoleArn: js.UndefOr[IamRoleArn]
  }

  object StartDominantLanguageDetectionJobRequest {
    def apply(
      JobName: js.UndefOr[JobName] = js.undefined,
      ClientRequestToken: js.UndefOr[ClientRequestTokenString] = js.undefined,
      InputDataConfig: js.UndefOr[InputDataConfig] = js.undefined,
      OutputDataConfig: js.UndefOr[OutputDataConfig] = js.undefined,
      DataAccessRoleArn: js.UndefOr[IamRoleArn] = js.undefined): StartDominantLanguageDetectionJobRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "JobName" -> JobName.map { x => x.asInstanceOf[js.Any] },
        "ClientRequestToken" -> ClientRequestToken.map { x => x.asInstanceOf[js.Any] },
        "InputDataConfig" -> InputDataConfig.map { x => x.asInstanceOf[js.Any] },
        "OutputDataConfig" -> OutputDataConfig.map { x => x.asInstanceOf[js.Any] },
        "DataAccessRoleArn" -> DataAccessRoleArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartDominantLanguageDetectionJobRequest]
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
      JobStatus: js.UndefOr[JobStatus] = js.undefined): StartDominantLanguageDetectionJobResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "JobId" -> JobId.map { x => x.asInstanceOf[js.Any] },
        "JobStatus" -> JobStatus.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartDominantLanguageDetectionJobResponse]
    }
  }

  @js.native
  trait StartEntitiesDetectionJobRequest extends js.Object {
    var JobName: js.UndefOr[JobName]
    var EntityRecognizerArn: js.UndefOr[EntityRecognizerArn]
    var ClientRequestToken: js.UndefOr[ClientRequestTokenString]
    var LanguageCode: js.UndefOr[LanguageCode]
    var InputDataConfig: js.UndefOr[InputDataConfig]
    var OutputDataConfig: js.UndefOr[OutputDataConfig]
    var DataAccessRoleArn: js.UndefOr[IamRoleArn]
  }

  object StartEntitiesDetectionJobRequest {
    def apply(
      JobName: js.UndefOr[JobName] = js.undefined,
      EntityRecognizerArn: js.UndefOr[EntityRecognizerArn] = js.undefined,
      ClientRequestToken: js.UndefOr[ClientRequestTokenString] = js.undefined,
      LanguageCode: js.UndefOr[LanguageCode] = js.undefined,
      InputDataConfig: js.UndefOr[InputDataConfig] = js.undefined,
      OutputDataConfig: js.UndefOr[OutputDataConfig] = js.undefined,
      DataAccessRoleArn: js.UndefOr[IamRoleArn] = js.undefined): StartEntitiesDetectionJobRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "JobName" -> JobName.map { x => x.asInstanceOf[js.Any] },
        "EntityRecognizerArn" -> EntityRecognizerArn.map { x => x.asInstanceOf[js.Any] },
        "ClientRequestToken" -> ClientRequestToken.map { x => x.asInstanceOf[js.Any] },
        "LanguageCode" -> LanguageCode.map { x => x.asInstanceOf[js.Any] },
        "InputDataConfig" -> InputDataConfig.map { x => x.asInstanceOf[js.Any] },
        "OutputDataConfig" -> OutputDataConfig.map { x => x.asInstanceOf[js.Any] },
        "DataAccessRoleArn" -> DataAccessRoleArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartEntitiesDetectionJobRequest]
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
      JobStatus: js.UndefOr[JobStatus] = js.undefined): StartEntitiesDetectionJobResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "JobId" -> JobId.map { x => x.asInstanceOf[js.Any] },
        "JobStatus" -> JobStatus.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartEntitiesDetectionJobResponse]
    }
  }

  @js.native
  trait StartKeyPhrasesDetectionJobRequest extends js.Object {
    var JobName: js.UndefOr[JobName]
    var ClientRequestToken: js.UndefOr[ClientRequestTokenString]
    var LanguageCode: js.UndefOr[LanguageCode]
    var InputDataConfig: js.UndefOr[InputDataConfig]
    var OutputDataConfig: js.UndefOr[OutputDataConfig]
    var DataAccessRoleArn: js.UndefOr[IamRoleArn]
  }

  object StartKeyPhrasesDetectionJobRequest {
    def apply(
      JobName: js.UndefOr[JobName] = js.undefined,
      ClientRequestToken: js.UndefOr[ClientRequestTokenString] = js.undefined,
      LanguageCode: js.UndefOr[LanguageCode] = js.undefined,
      InputDataConfig: js.UndefOr[InputDataConfig] = js.undefined,
      OutputDataConfig: js.UndefOr[OutputDataConfig] = js.undefined,
      DataAccessRoleArn: js.UndefOr[IamRoleArn] = js.undefined): StartKeyPhrasesDetectionJobRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "JobName" -> JobName.map { x => x.asInstanceOf[js.Any] },
        "ClientRequestToken" -> ClientRequestToken.map { x => x.asInstanceOf[js.Any] },
        "LanguageCode" -> LanguageCode.map { x => x.asInstanceOf[js.Any] },
        "InputDataConfig" -> InputDataConfig.map { x => x.asInstanceOf[js.Any] },
        "OutputDataConfig" -> OutputDataConfig.map { x => x.asInstanceOf[js.Any] },
        "DataAccessRoleArn" -> DataAccessRoleArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartKeyPhrasesDetectionJobRequest]
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
      JobStatus: js.UndefOr[JobStatus] = js.undefined): StartKeyPhrasesDetectionJobResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "JobId" -> JobId.map { x => x.asInstanceOf[js.Any] },
        "JobStatus" -> JobStatus.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartKeyPhrasesDetectionJobResponse]
    }
  }

  @js.native
  trait StartSentimentDetectionJobRequest extends js.Object {
    var JobName: js.UndefOr[JobName]
    var ClientRequestToken: js.UndefOr[ClientRequestTokenString]
    var LanguageCode: js.UndefOr[LanguageCode]
    var InputDataConfig: js.UndefOr[InputDataConfig]
    var OutputDataConfig: js.UndefOr[OutputDataConfig]
    var DataAccessRoleArn: js.UndefOr[IamRoleArn]
  }

  object StartSentimentDetectionJobRequest {
    def apply(
      JobName: js.UndefOr[JobName] = js.undefined,
      ClientRequestToken: js.UndefOr[ClientRequestTokenString] = js.undefined,
      LanguageCode: js.UndefOr[LanguageCode] = js.undefined,
      InputDataConfig: js.UndefOr[InputDataConfig] = js.undefined,
      OutputDataConfig: js.UndefOr[OutputDataConfig] = js.undefined,
      DataAccessRoleArn: js.UndefOr[IamRoleArn] = js.undefined): StartSentimentDetectionJobRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "JobName" -> JobName.map { x => x.asInstanceOf[js.Any] },
        "ClientRequestToken" -> ClientRequestToken.map { x => x.asInstanceOf[js.Any] },
        "LanguageCode" -> LanguageCode.map { x => x.asInstanceOf[js.Any] },
        "InputDataConfig" -> InputDataConfig.map { x => x.asInstanceOf[js.Any] },
        "OutputDataConfig" -> OutputDataConfig.map { x => x.asInstanceOf[js.Any] },
        "DataAccessRoleArn" -> DataAccessRoleArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartSentimentDetectionJobRequest]
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
      JobStatus: js.UndefOr[JobStatus] = js.undefined): StartSentimentDetectionJobResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "JobId" -> JobId.map { x => x.asInstanceOf[js.Any] },
        "JobStatus" -> JobStatus.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartSentimentDetectionJobResponse]
    }
  }

  @js.native
  trait StartTopicsDetectionJobRequest extends js.Object {
    var NumberOfTopics: js.UndefOr[NumberOfTopicsInteger]
    var JobName: js.UndefOr[JobName]
    var ClientRequestToken: js.UndefOr[ClientRequestTokenString]
    var InputDataConfig: js.UndefOr[InputDataConfig]
    var OutputDataConfig: js.UndefOr[OutputDataConfig]
    var DataAccessRoleArn: js.UndefOr[IamRoleArn]
  }

  object StartTopicsDetectionJobRequest {
    def apply(
      NumberOfTopics: js.UndefOr[NumberOfTopicsInteger] = js.undefined,
      JobName: js.UndefOr[JobName] = js.undefined,
      ClientRequestToken: js.UndefOr[ClientRequestTokenString] = js.undefined,
      InputDataConfig: js.UndefOr[InputDataConfig] = js.undefined,
      OutputDataConfig: js.UndefOr[OutputDataConfig] = js.undefined,
      DataAccessRoleArn: js.UndefOr[IamRoleArn] = js.undefined): StartTopicsDetectionJobRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NumberOfTopics" -> NumberOfTopics.map { x => x.asInstanceOf[js.Any] },
        "JobName" -> JobName.map { x => x.asInstanceOf[js.Any] },
        "ClientRequestToken" -> ClientRequestToken.map { x => x.asInstanceOf[js.Any] },
        "InputDataConfig" -> InputDataConfig.map { x => x.asInstanceOf[js.Any] },
        "OutputDataConfig" -> OutputDataConfig.map { x => x.asInstanceOf[js.Any] },
        "DataAccessRoleArn" -> DataAccessRoleArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartTopicsDetectionJobRequest]
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
      JobStatus: js.UndefOr[JobStatus] = js.undefined): StartTopicsDetectionJobResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "JobId" -> JobId.map { x => x.asInstanceOf[js.Any] },
        "JobStatus" -> JobStatus.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartTopicsDetectionJobResponse]
    }
  }

  @js.native
  trait StopDominantLanguageDetectionJobRequest extends js.Object {
    var JobId: js.UndefOr[JobId]
  }

  object StopDominantLanguageDetectionJobRequest {
    def apply(
      JobId: js.UndefOr[JobId] = js.undefined): StopDominantLanguageDetectionJobRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "JobId" -> JobId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StopDominantLanguageDetectionJobRequest]
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
      JobStatus: js.UndefOr[JobStatus] = js.undefined): StopDominantLanguageDetectionJobResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "JobId" -> JobId.map { x => x.asInstanceOf[js.Any] },
        "JobStatus" -> JobStatus.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StopDominantLanguageDetectionJobResponse]
    }
  }

  @js.native
  trait StopEntitiesDetectionJobRequest extends js.Object {
    var JobId: js.UndefOr[JobId]
  }

  object StopEntitiesDetectionJobRequest {
    def apply(
      JobId: js.UndefOr[JobId] = js.undefined): StopEntitiesDetectionJobRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "JobId" -> JobId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StopEntitiesDetectionJobRequest]
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
      JobStatus: js.UndefOr[JobStatus] = js.undefined): StopEntitiesDetectionJobResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "JobId" -> JobId.map { x => x.asInstanceOf[js.Any] },
        "JobStatus" -> JobStatus.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StopEntitiesDetectionJobResponse]
    }
  }

  @js.native
  trait StopKeyPhrasesDetectionJobRequest extends js.Object {
    var JobId: js.UndefOr[JobId]
  }

  object StopKeyPhrasesDetectionJobRequest {
    def apply(
      JobId: js.UndefOr[JobId] = js.undefined): StopKeyPhrasesDetectionJobRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "JobId" -> JobId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StopKeyPhrasesDetectionJobRequest]
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
      JobStatus: js.UndefOr[JobStatus] = js.undefined): StopKeyPhrasesDetectionJobResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "JobId" -> JobId.map { x => x.asInstanceOf[js.Any] },
        "JobStatus" -> JobStatus.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StopKeyPhrasesDetectionJobResponse]
    }
  }

  @js.native
  trait StopSentimentDetectionJobRequest extends js.Object {
    var JobId: js.UndefOr[JobId]
  }

  object StopSentimentDetectionJobRequest {
    def apply(
      JobId: js.UndefOr[JobId] = js.undefined): StopSentimentDetectionJobRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "JobId" -> JobId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StopSentimentDetectionJobRequest]
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
      JobStatus: js.UndefOr[JobStatus] = js.undefined): StopSentimentDetectionJobResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "JobId" -> JobId.map { x => x.asInstanceOf[js.Any] },
        "JobStatus" -> JobStatus.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StopSentimentDetectionJobResponse]
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
   * <p>Represents a work in the input text that was recognized and assigned a part of speech. There is one syntax token record for each word in the source text.</p>
   */
  @js.native
  trait SyntaxToken extends js.Object {
    var BeginOffset: js.UndefOr[Int]
    var EndOffset: js.UndefOr[Int]
    var Text: js.UndefOr[String]
    var TokenId: js.UndefOr[Int]
    var PartOfSpeech: js.UndefOr[PartOfSpeechTag]
  }

  object SyntaxToken {
    def apply(
      BeginOffset: js.UndefOr[Int] = js.undefined,
      EndOffset: js.UndefOr[Int] = js.undefined,
      Text: js.UndefOr[String] = js.undefined,
      TokenId: js.UndefOr[Int] = js.undefined,
      PartOfSpeech: js.UndefOr[PartOfSpeechTag] = js.undefined): SyntaxToken = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BeginOffset" -> BeginOffset.map { x => x.asInstanceOf[js.Any] },
        "EndOffset" -> EndOffset.map { x => x.asInstanceOf[js.Any] },
        "Text" -> Text.map { x => x.asInstanceOf[js.Any] },
        "TokenId" -> TokenId.map { x => x.asInstanceOf[js.Any] },
        "PartOfSpeech" -> PartOfSpeech.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SyntaxToken]
    }
  }

  /**
   * <p>Provides information for filtering topic detection jobs. For more information, see .</p>
   */
  @js.native
  trait TopicsDetectionJobFilter extends js.Object {
    var JobName: js.UndefOr[JobName]
    var JobStatus: js.UndefOr[JobStatus]
    var SubmitTimeBefore: js.UndefOr[Timestamp]
    var SubmitTimeAfter: js.UndefOr[Timestamp]
  }

  object TopicsDetectionJobFilter {
    def apply(
      JobName: js.UndefOr[JobName] = js.undefined,
      JobStatus: js.UndefOr[JobStatus] = js.undefined,
      SubmitTimeBefore: js.UndefOr[Timestamp] = js.undefined,
      SubmitTimeAfter: js.UndefOr[Timestamp] = js.undefined): TopicsDetectionJobFilter = {
      val _fields = IndexedSeq[(String, js.Any)](
        "JobName" -> JobName.map { x => x.asInstanceOf[js.Any] },
        "JobStatus" -> JobStatus.map { x => x.asInstanceOf[js.Any] },
        "SubmitTimeBefore" -> SubmitTimeBefore.map { x => x.asInstanceOf[js.Any] },
        "SubmitTimeAfter" -> SubmitTimeAfter.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TopicsDetectionJobFilter]
    }
  }

  /**
   * <p>Provides information about a topic detection job.</p>
   */
  @js.native
  trait TopicsDetectionJobProperties extends js.Object {
    var SubmitTime: js.UndefOr[Timestamp]
    var JobId: js.UndefOr[JobId]
    var NumberOfTopics: js.UndefOr[Int]
    var JobName: js.UndefOr[JobName]
    var JobStatus: js.UndefOr[JobStatus]
    var EndTime: js.UndefOr[Timestamp]
    var Message: js.UndefOr[AnyLengthString]
    var InputDataConfig: js.UndefOr[InputDataConfig]
    var OutputDataConfig: js.UndefOr[OutputDataConfig]
  }

  object TopicsDetectionJobProperties {
    def apply(
      SubmitTime: js.UndefOr[Timestamp] = js.undefined,
      JobId: js.UndefOr[JobId] = js.undefined,
      NumberOfTopics: js.UndefOr[Int] = js.undefined,
      JobName: js.UndefOr[JobName] = js.undefined,
      JobStatus: js.UndefOr[JobStatus] = js.undefined,
      EndTime: js.UndefOr[Timestamp] = js.undefined,
      Message: js.UndefOr[AnyLengthString] = js.undefined,
      InputDataConfig: js.UndefOr[InputDataConfig] = js.undefined,
      OutputDataConfig: js.UndefOr[OutputDataConfig] = js.undefined): TopicsDetectionJobProperties = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SubmitTime" -> SubmitTime.map { x => x.asInstanceOf[js.Any] },
        "JobId" -> JobId.map { x => x.asInstanceOf[js.Any] },
        "NumberOfTopics" -> NumberOfTopics.map { x => x.asInstanceOf[js.Any] },
        "JobName" -> JobName.map { x => x.asInstanceOf[js.Any] },
        "JobStatus" -> JobStatus.map { x => x.asInstanceOf[js.Any] },
        "EndTime" -> EndTime.map { x => x.asInstanceOf[js.Any] },
        "Message" -> Message.map { x => x.asInstanceOf[js.Any] },
        "InputDataConfig" -> InputDataConfig.map { x => x.asInstanceOf[js.Any] },
        "OutputDataConfig" -> OutputDataConfig.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TopicsDetectionJobProperties]
    }
  }
}
