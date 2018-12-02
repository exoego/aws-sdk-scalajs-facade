package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import io.scalajs.nodejs
import facade.amazonaws._

package object cognitosync {
  type ApplicationArn = String
  type ApplicationArnList = js.Array[ApplicationArn]
  type AssumeRoleArn = String
  type BulkPublishStatus = String
  type ClientContext = String
  type CognitoEventType = String
  type DatasetList = js.Array[Dataset]
  type DatasetName = String
  type Date = js.Date
  type DeviceId = String
  type Events = js.Dictionary[LambdaFunctionArn]
  type ExceptionMessage = String
  type IdentityId = String
  type IdentityPoolId = String
  type IdentityPoolUsageList = js.Array[IdentityPoolUsage]
  type IntegerString = Int
  type LambdaFunctionArn = String
  type MergedDatasetNameList = js.Array[String]
  type Operation = String
  type Platform = String
  type PushToken = String
  type RecordKey = String
  type RecordList = js.Array[Record]
  type RecordPatchList = js.Array[RecordPatch]
  type RecordValue = String
  type StreamName = String
  type StreamingStatus = String
  type SyncSessionToken = String
}

package cognitosync {
  @js.native
  @JSImport("aws-sdk", "CognitoSync")
  class CognitoSync(config: AWSConfig) extends js.Object {
    def bulkPublish(params: BulkPublishRequest): Request[BulkPublishResponse] = js.native
    def deleteDataset(params: DeleteDatasetRequest): Request[DeleteDatasetResponse] = js.native
    def describeDataset(params: DescribeDatasetRequest): Request[DescribeDatasetResponse] = js.native
    def describeIdentityPoolUsage(params: DescribeIdentityPoolUsageRequest): Request[DescribeIdentityPoolUsageResponse] = js.native
    def describeIdentityUsage(params: DescribeIdentityUsageRequest): Request[DescribeIdentityUsageResponse] = js.native
    def getBulkPublishDetails(params: GetBulkPublishDetailsRequest): Request[GetBulkPublishDetailsResponse] = js.native
    def getCognitoEvents(params: GetCognitoEventsRequest): Request[GetCognitoEventsResponse] = js.native
    def getIdentityPoolConfiguration(params: GetIdentityPoolConfigurationRequest): Request[GetIdentityPoolConfigurationResponse] = js.native
    def listDatasets(params: ListDatasetsRequest): Request[ListDatasetsResponse] = js.native
    def listIdentityPoolUsage(params: ListIdentityPoolUsageRequest): Request[ListIdentityPoolUsageResponse] = js.native
    def listRecords(params: ListRecordsRequest): Request[ListRecordsResponse] = js.native
    def registerDevice(params: RegisterDeviceRequest): Request[RegisterDeviceResponse] = js.native
    def setCognitoEvents(params: SetCognitoEventsRequest): Request[js.Object] = js.native
    def setIdentityPoolConfiguration(params: SetIdentityPoolConfigurationRequest): Request[SetIdentityPoolConfigurationResponse] = js.native
    def subscribeToDataset(params: SubscribeToDatasetRequest): Request[SubscribeToDatasetResponse] = js.native
    def unsubscribeFromDataset(params: UnsubscribeFromDatasetRequest): Request[UnsubscribeFromDatasetResponse] = js.native
    def updateRecords(params: UpdateRecordsRequest): Request[UpdateRecordsResponse] = js.native
  }

  /**
   * An exception thrown when a bulk publish operation is requested less than 24 hours after a previous bulk publish operation completed successfully.
   */
  @js.native
  trait AlreadyStreamedExceptionException extends js.Object {
    val message: ExceptionMessage
  }

  /**
   * The input for the BulkPublish operation.
   */
  @js.native
  trait BulkPublishRequest extends js.Object {
    var IdentityPoolId: IdentityPoolId
  }

  object BulkPublishRequest {
    def apply(
      IdentityPoolId: IdentityPoolId): BulkPublishRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IdentityPoolId" -> IdentityPoolId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BulkPublishRequest]
    }
  }

  /**
   * The output for the BulkPublish operation.
   */
  @js.native
  trait BulkPublishResponse extends js.Object {
    var IdentityPoolId: js.UndefOr[IdentityPoolId]
  }

  object BulkPublishResponse {
    def apply(
      IdentityPoolId: js.UndefOr[IdentityPoolId] = js.undefined): BulkPublishResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IdentityPoolId" -> IdentityPoolId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BulkPublishResponse]
    }
  }

  object BulkPublishStatusEnum {
    val NOT_STARTED = "NOT_STARTED"
    val IN_PROGRESS = "IN_PROGRESS"
    val FAILED = "FAILED"
    val SUCCEEDED = "SUCCEEDED"

    val values = IndexedSeq(NOT_STARTED, IN_PROGRESS, FAILED, SUCCEEDED)
  }

  /**
   * Configuration options for configure Cognito streams.
   */
  @js.native
  trait CognitoStreams extends js.Object {
    var RoleArn: js.UndefOr[AssumeRoleArn]
    var StreamName: js.UndefOr[StreamName]
    var StreamingStatus: js.UndefOr[StreamingStatus]
  }

  object CognitoStreams {
    def apply(
      RoleArn: js.UndefOr[AssumeRoleArn] = js.undefined,
      StreamName: js.UndefOr[StreamName] = js.undefined,
      StreamingStatus: js.UndefOr[StreamingStatus] = js.undefined): CognitoStreams = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RoleArn" -> RoleArn.map { x => x.asInstanceOf[js.Any] },
        "StreamName" -> StreamName.map { x => x.asInstanceOf[js.Any] },
        "StreamingStatus" -> StreamingStatus.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CognitoStreams]
    }
  }

  /**
   * <p>Thrown if there are parallel requests to modify a resource.</p>
   */
  @js.native
  trait ConcurrentModificationExceptionException extends js.Object {
    val message: String
  }

  /**
   * A collection of data for an identity pool. An identity pool can have multiple datasets. A dataset is per identity and can be general or associated with a particular entity in an application (like a saved game). Datasets are automatically created if they don't exist. Data is synced by dataset, and a dataset can hold up to 1MB of key-value pairs.
   */
  @js.native
  trait Dataset extends js.Object {
    var CreationDate: js.UndefOr[Date]
    var DataStorage: js.UndefOr[Double]
    var DatasetName: js.UndefOr[DatasetName]
    var IdentityId: js.UndefOr[IdentityId]
    var LastModifiedBy: js.UndefOr[String]
    var LastModifiedDate: js.UndefOr[Date]
    var NumRecords: js.UndefOr[Double]
  }

  object Dataset {
    def apply(
      CreationDate: js.UndefOr[Date] = js.undefined,
      DataStorage: js.UndefOr[Double] = js.undefined,
      DatasetName: js.UndefOr[DatasetName] = js.undefined,
      IdentityId: js.UndefOr[IdentityId] = js.undefined,
      LastModifiedBy: js.UndefOr[String] = js.undefined,
      LastModifiedDate: js.UndefOr[Date] = js.undefined,
      NumRecords: js.UndefOr[Double] = js.undefined): Dataset = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CreationDate" -> CreationDate.map { x => x.asInstanceOf[js.Any] },
        "DataStorage" -> DataStorage.map { x => x.asInstanceOf[js.Any] },
        "DatasetName" -> DatasetName.map { x => x.asInstanceOf[js.Any] },
        "IdentityId" -> IdentityId.map { x => x.asInstanceOf[js.Any] },
        "LastModifiedBy" -> LastModifiedBy.map { x => x.asInstanceOf[js.Any] },
        "LastModifiedDate" -> LastModifiedDate.map { x => x.asInstanceOf[js.Any] },
        "NumRecords" -> NumRecords.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Dataset]
    }
  }

  /**
   * A request to delete the specific dataset.
   */
  @js.native
  trait DeleteDatasetRequest extends js.Object {
    var DatasetName: DatasetName
    var IdentityId: IdentityId
    var IdentityPoolId: IdentityPoolId
  }

  object DeleteDatasetRequest {
    def apply(
      DatasetName: DatasetName,
      IdentityId: IdentityId,
      IdentityPoolId: IdentityPoolId): DeleteDatasetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DatasetName" -> DatasetName.asInstanceOf[js.Any],
        "IdentityId" -> IdentityId.asInstanceOf[js.Any],
        "IdentityPoolId" -> IdentityPoolId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteDatasetRequest]
    }
  }

  /**
   * Response to a successful DeleteDataset request.
   */
  @js.native
  trait DeleteDatasetResponse extends js.Object {
    var Dataset: js.UndefOr[Dataset]
  }

  object DeleteDatasetResponse {
    def apply(
      Dataset: js.UndefOr[Dataset] = js.undefined): DeleteDatasetResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Dataset" -> Dataset.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteDatasetResponse]
    }
  }

  /**
   * A request for meta data about a dataset (creation date, number of records, size) by owner and dataset name.
   */
  @js.native
  trait DescribeDatasetRequest extends js.Object {
    var DatasetName: DatasetName
    var IdentityId: IdentityId
    var IdentityPoolId: IdentityPoolId
  }

  object DescribeDatasetRequest {
    def apply(
      DatasetName: DatasetName,
      IdentityId: IdentityId,
      IdentityPoolId: IdentityPoolId): DescribeDatasetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DatasetName" -> DatasetName.asInstanceOf[js.Any],
        "IdentityId" -> IdentityId.asInstanceOf[js.Any],
        "IdentityPoolId" -> IdentityPoolId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeDatasetRequest]
    }
  }

  /**
   * Response to a successful DescribeDataset request.
   */
  @js.native
  trait DescribeDatasetResponse extends js.Object {
    var Dataset: js.UndefOr[Dataset]
  }

  object DescribeDatasetResponse {
    def apply(
      Dataset: js.UndefOr[Dataset] = js.undefined): DescribeDatasetResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Dataset" -> Dataset.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeDatasetResponse]
    }
  }

  /**
   * A request for usage information about the identity pool.
   */
  @js.native
  trait DescribeIdentityPoolUsageRequest extends js.Object {
    var IdentityPoolId: IdentityPoolId
  }

  object DescribeIdentityPoolUsageRequest {
    def apply(
      IdentityPoolId: IdentityPoolId): DescribeIdentityPoolUsageRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IdentityPoolId" -> IdentityPoolId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeIdentityPoolUsageRequest]
    }
  }

  /**
   * Response to a successful DescribeIdentityPoolUsage request.
   */
  @js.native
  trait DescribeIdentityPoolUsageResponse extends js.Object {
    var IdentityPoolUsage: js.UndefOr[IdentityPoolUsage]
  }

  object DescribeIdentityPoolUsageResponse {
    def apply(
      IdentityPoolUsage: js.UndefOr[IdentityPoolUsage] = js.undefined): DescribeIdentityPoolUsageResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IdentityPoolUsage" -> IdentityPoolUsage.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeIdentityPoolUsageResponse]
    }
  }

  /**
   * A request for information about the usage of an identity pool.
   */
  @js.native
  trait DescribeIdentityUsageRequest extends js.Object {
    var IdentityId: IdentityId
    var IdentityPoolId: IdentityPoolId
  }

  object DescribeIdentityUsageRequest {
    def apply(
      IdentityId: IdentityId,
      IdentityPoolId: IdentityPoolId): DescribeIdentityUsageRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IdentityId" -> IdentityId.asInstanceOf[js.Any],
        "IdentityPoolId" -> IdentityPoolId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeIdentityUsageRequest]
    }
  }

  /**
   * The response to a successful DescribeIdentityUsage request.
   */
  @js.native
  trait DescribeIdentityUsageResponse extends js.Object {
    var IdentityUsage: js.UndefOr[IdentityUsage]
  }

  object DescribeIdentityUsageResponse {
    def apply(
      IdentityUsage: js.UndefOr[IdentityUsage] = js.undefined): DescribeIdentityUsageResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IdentityUsage" -> IdentityUsage.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeIdentityUsageResponse]
    }
  }

  /**
   * An exception thrown when there is an IN_PROGRESS bulk publish operation for the given identity pool.
   */
  @js.native
  trait DuplicateRequestExceptionException extends js.Object {
    val message: ExceptionMessage
  }

  /**
   * The input for the GetBulkPublishDetails operation.
   */
  @js.native
  trait GetBulkPublishDetailsRequest extends js.Object {
    var IdentityPoolId: IdentityPoolId
  }

  object GetBulkPublishDetailsRequest {
    def apply(
      IdentityPoolId: IdentityPoolId): GetBulkPublishDetailsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IdentityPoolId" -> IdentityPoolId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetBulkPublishDetailsRequest]
    }
  }

  /**
   * The output for the GetBulkPublishDetails operation.
   */
  @js.native
  trait GetBulkPublishDetailsResponse extends js.Object {
    var BulkPublishCompleteTime: js.UndefOr[Date]
    var BulkPublishStartTime: js.UndefOr[Date]
    var BulkPublishStatus: js.UndefOr[BulkPublishStatus]
    var FailureMessage: js.UndefOr[String]
    var IdentityPoolId: js.UndefOr[IdentityPoolId]
  }

  object GetBulkPublishDetailsResponse {
    def apply(
      BulkPublishCompleteTime: js.UndefOr[Date] = js.undefined,
      BulkPublishStartTime: js.UndefOr[Date] = js.undefined,
      BulkPublishStatus: js.UndefOr[BulkPublishStatus] = js.undefined,
      FailureMessage: js.UndefOr[String] = js.undefined,
      IdentityPoolId: js.UndefOr[IdentityPoolId] = js.undefined): GetBulkPublishDetailsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BulkPublishCompleteTime" -> BulkPublishCompleteTime.map { x => x.asInstanceOf[js.Any] },
        "BulkPublishStartTime" -> BulkPublishStartTime.map { x => x.asInstanceOf[js.Any] },
        "BulkPublishStatus" -> BulkPublishStatus.map { x => x.asInstanceOf[js.Any] },
        "FailureMessage" -> FailureMessage.map { x => x.asInstanceOf[js.Any] },
        "IdentityPoolId" -> IdentityPoolId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetBulkPublishDetailsResponse]
    }
  }

  /**
   * <p>A request for a list of the configured Cognito Events</p>
   */
  @js.native
  trait GetCognitoEventsRequest extends js.Object {
    var IdentityPoolId: IdentityPoolId
  }

  object GetCognitoEventsRequest {
    def apply(
      IdentityPoolId: IdentityPoolId): GetCognitoEventsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IdentityPoolId" -> IdentityPoolId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetCognitoEventsRequest]
    }
  }

  /**
   * <p>The response from the GetCognitoEvents request</p>
   */
  @js.native
  trait GetCognitoEventsResponse extends js.Object {
    var Events: js.UndefOr[Events]
  }

  object GetCognitoEventsResponse {
    def apply(
      Events: js.UndefOr[Events] = js.undefined): GetCognitoEventsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Events" -> Events.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetCognitoEventsResponse]
    }
  }

  /**
   * <p>The input for the GetIdentityPoolConfiguration operation.</p>
   */
  @js.native
  trait GetIdentityPoolConfigurationRequest extends js.Object {
    var IdentityPoolId: IdentityPoolId
  }

  object GetIdentityPoolConfigurationRequest {
    def apply(
      IdentityPoolId: IdentityPoolId): GetIdentityPoolConfigurationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IdentityPoolId" -> IdentityPoolId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetIdentityPoolConfigurationRequest]
    }
  }

  /**
   * <p>The output for the GetIdentityPoolConfiguration operation.</p>
   */
  @js.native
  trait GetIdentityPoolConfigurationResponse extends js.Object {
    var CognitoStreams: js.UndefOr[CognitoStreams]
    var IdentityPoolId: js.UndefOr[IdentityPoolId]
    var PushSync: js.UndefOr[PushSync]
  }

  object GetIdentityPoolConfigurationResponse {
    def apply(
      CognitoStreams: js.UndefOr[CognitoStreams] = js.undefined,
      IdentityPoolId: js.UndefOr[IdentityPoolId] = js.undefined,
      PushSync: js.UndefOr[PushSync] = js.undefined): GetIdentityPoolConfigurationResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CognitoStreams" -> CognitoStreams.map { x => x.asInstanceOf[js.Any] },
        "IdentityPoolId" -> IdentityPoolId.map { x => x.asInstanceOf[js.Any] },
        "PushSync" -> PushSync.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetIdentityPoolConfigurationResponse]
    }
  }

  /**
   * Usage information for the identity pool.
   */
  @js.native
  trait IdentityPoolUsage extends js.Object {
    var DataStorage: js.UndefOr[Double]
    var IdentityPoolId: js.UndefOr[IdentityPoolId]
    var LastModifiedDate: js.UndefOr[Date]
    var SyncSessionsCount: js.UndefOr[Double]
  }

  object IdentityPoolUsage {
    def apply(
      DataStorage: js.UndefOr[Double] = js.undefined,
      IdentityPoolId: js.UndefOr[IdentityPoolId] = js.undefined,
      LastModifiedDate: js.UndefOr[Date] = js.undefined,
      SyncSessionsCount: js.UndefOr[Double] = js.undefined): IdentityPoolUsage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DataStorage" -> DataStorage.map { x => x.asInstanceOf[js.Any] },
        "IdentityPoolId" -> IdentityPoolId.map { x => x.asInstanceOf[js.Any] },
        "LastModifiedDate" -> LastModifiedDate.map { x => x.asInstanceOf[js.Any] },
        "SyncSessionsCount" -> SyncSessionsCount.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[IdentityPoolUsage]
    }
  }

  /**
   * Usage information for the identity.
   */
  @js.native
  trait IdentityUsage extends js.Object {
    var DataStorage: js.UndefOr[Double]
    var DatasetCount: js.UndefOr[Int]
    var IdentityId: js.UndefOr[IdentityId]
    var IdentityPoolId: js.UndefOr[IdentityPoolId]
    var LastModifiedDate: js.UndefOr[Date]
  }

  object IdentityUsage {
    def apply(
      DataStorage: js.UndefOr[Double] = js.undefined,
      DatasetCount: js.UndefOr[Int] = js.undefined,
      IdentityId: js.UndefOr[IdentityId] = js.undefined,
      IdentityPoolId: js.UndefOr[IdentityPoolId] = js.undefined,
      LastModifiedDate: js.UndefOr[Date] = js.undefined): IdentityUsage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DataStorage" -> DataStorage.map { x => x.asInstanceOf[js.Any] },
        "DatasetCount" -> DatasetCount.map { x => x.asInstanceOf[js.Any] },
        "IdentityId" -> IdentityId.map { x => x.asInstanceOf[js.Any] },
        "IdentityPoolId" -> IdentityPoolId.map { x => x.asInstanceOf[js.Any] },
        "LastModifiedDate" -> LastModifiedDate.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[IdentityUsage]
    }
  }

  /**
   * Indicates an internal service error.
   */
  @js.native
  trait InternalErrorExceptionException extends js.Object {
    val message: ExceptionMessage
  }

  @js.native
  trait InvalidConfigurationExceptionException extends js.Object {
    val message: ExceptionMessage
  }

  /**
   * <p>The AWS Lambda function returned invalid output or an exception.</p>
   */
  @js.native
  trait InvalidLambdaFunctionOutputExceptionException extends js.Object {
    val message: ExceptionMessage
  }

  /**
   * Thrown when a request parameter does not comply with the associated constraints.
   */
  @js.native
  trait InvalidParameterExceptionException extends js.Object {
    val message: ExceptionMessage
  }

  /**
   * <p>AWS Lambda throttled your account, please contact AWS Support</p>
   */
  @js.native
  trait LambdaThrottledExceptionException extends js.Object {
    val message: ExceptionMessage
  }

  /**
   * Thrown when the limit on the number of objects or operations has been exceeded.
   */
  @js.native
  trait LimitExceededExceptionException extends js.Object {
    val message: ExceptionMessage
  }

  /**
   * Request for a list of datasets for an identity.
   */
  @js.native
  trait ListDatasetsRequest extends js.Object {
    var IdentityId: IdentityId
    var IdentityPoolId: IdentityPoolId
    var MaxResults: js.UndefOr[IntegerString]
    var NextToken: js.UndefOr[String]
  }

  object ListDatasetsRequest {
    def apply(
      IdentityId: IdentityId,
      IdentityPoolId: IdentityPoolId,
      MaxResults: js.UndefOr[IntegerString] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined): ListDatasetsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IdentityId" -> IdentityId.asInstanceOf[js.Any],
        "IdentityPoolId" -> IdentityPoolId.asInstanceOf[js.Any],
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListDatasetsRequest]
    }
  }

  /**
   * Returned for a successful ListDatasets request.
   */
  @js.native
  trait ListDatasetsResponse extends js.Object {
    var Count: js.UndefOr[Int]
    var Datasets: js.UndefOr[DatasetList]
    var NextToken: js.UndefOr[String]
  }

  object ListDatasetsResponse {
    def apply(
      Count: js.UndefOr[Int] = js.undefined,
      Datasets: js.UndefOr[DatasetList] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined): ListDatasetsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Count" -> Count.map { x => x.asInstanceOf[js.Any] },
        "Datasets" -> Datasets.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListDatasetsResponse]
    }
  }

  /**
   * A request for usage information on an identity pool.
   */
  @js.native
  trait ListIdentityPoolUsageRequest extends js.Object {
    var MaxResults: js.UndefOr[IntegerString]
    var NextToken: js.UndefOr[String]
  }

  object ListIdentityPoolUsageRequest {
    def apply(
      MaxResults: js.UndefOr[IntegerString] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined): ListIdentityPoolUsageRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListIdentityPoolUsageRequest]
    }
  }

  /**
   * Returned for a successful ListIdentityPoolUsage request.
   */
  @js.native
  trait ListIdentityPoolUsageResponse extends js.Object {
    var Count: js.UndefOr[Int]
    var IdentityPoolUsages: js.UndefOr[IdentityPoolUsageList]
    var MaxResults: js.UndefOr[Int]
    var NextToken: js.UndefOr[String]
  }

  object ListIdentityPoolUsageResponse {
    def apply(
      Count: js.UndefOr[Int] = js.undefined,
      IdentityPoolUsages: js.UndefOr[IdentityPoolUsageList] = js.undefined,
      MaxResults: js.UndefOr[Int] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined): ListIdentityPoolUsageResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Count" -> Count.map { x => x.asInstanceOf[js.Any] },
        "IdentityPoolUsages" -> IdentityPoolUsages.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListIdentityPoolUsageResponse]
    }
  }

  /**
   * A request for a list of records.
   */
  @js.native
  trait ListRecordsRequest extends js.Object {
    var DatasetName: DatasetName
    var IdentityId: IdentityId
    var IdentityPoolId: IdentityPoolId
    var LastSyncCount: js.UndefOr[Double]
    var MaxResults: js.UndefOr[IntegerString]
    var NextToken: js.UndefOr[String]
    var SyncSessionToken: js.UndefOr[SyncSessionToken]
  }

  object ListRecordsRequest {
    def apply(
      DatasetName: DatasetName,
      IdentityId: IdentityId,
      IdentityPoolId: IdentityPoolId,
      LastSyncCount: js.UndefOr[Double] = js.undefined,
      MaxResults: js.UndefOr[IntegerString] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined,
      SyncSessionToken: js.UndefOr[SyncSessionToken] = js.undefined): ListRecordsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DatasetName" -> DatasetName.asInstanceOf[js.Any],
        "IdentityId" -> IdentityId.asInstanceOf[js.Any],
        "IdentityPoolId" -> IdentityPoolId.asInstanceOf[js.Any],
        "LastSyncCount" -> LastSyncCount.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "SyncSessionToken" -> SyncSessionToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListRecordsRequest]
    }
  }

  /**
   * Returned for a successful ListRecordsRequest.
   */
  @js.native
  trait ListRecordsResponse extends js.Object {
    var Count: js.UndefOr[Int]
    var DatasetDeletedAfterRequestedSyncCount: js.UndefOr[Boolean]
    var DatasetExists: js.UndefOr[Boolean]
    var DatasetSyncCount: js.UndefOr[Double]
    var LastModifiedBy: js.UndefOr[String]
    var MergedDatasetNames: js.UndefOr[MergedDatasetNameList]
    var NextToken: js.UndefOr[String]
    var Records: js.UndefOr[RecordList]
    var SyncSessionToken: js.UndefOr[String]
  }

  object ListRecordsResponse {
    def apply(
      Count: js.UndefOr[Int] = js.undefined,
      DatasetDeletedAfterRequestedSyncCount: js.UndefOr[Boolean] = js.undefined,
      DatasetExists: js.UndefOr[Boolean] = js.undefined,
      DatasetSyncCount: js.UndefOr[Double] = js.undefined,
      LastModifiedBy: js.UndefOr[String] = js.undefined,
      MergedDatasetNames: js.UndefOr[MergedDatasetNameList] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined,
      Records: js.UndefOr[RecordList] = js.undefined,
      SyncSessionToken: js.UndefOr[String] = js.undefined): ListRecordsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Count" -> Count.map { x => x.asInstanceOf[js.Any] },
        "DatasetDeletedAfterRequestedSyncCount" -> DatasetDeletedAfterRequestedSyncCount.map { x => x.asInstanceOf[js.Any] },
        "DatasetExists" -> DatasetExists.map { x => x.asInstanceOf[js.Any] },
        "DatasetSyncCount" -> DatasetSyncCount.map { x => x.asInstanceOf[js.Any] },
        "LastModifiedBy" -> LastModifiedBy.map { x => x.asInstanceOf[js.Any] },
        "MergedDatasetNames" -> MergedDatasetNames.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "Records" -> Records.map { x => x.asInstanceOf[js.Any] },
        "SyncSessionToken" -> SyncSessionToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListRecordsResponse]
    }
  }

  /**
   * Thrown when a user is not authorized to access the requested resource.
   */
  @js.native
  trait NotAuthorizedExceptionException extends js.Object {
    val message: ExceptionMessage
  }

  object OperationEnum {
    val replace = "replace"
    val remove = "remove"

    val values = IndexedSeq(replace, remove)
  }

  object PlatformEnum {
    val APNS = "APNS"
    val APNS_SANDBOX = "APNS_SANDBOX"
    val GCM = "GCM"
    val ADM = "ADM"

    val values = IndexedSeq(APNS, APNS_SANDBOX, GCM, ADM)
  }

  /**
   * <p>Configuration options to be applied to the identity pool.</p>
   */
  @js.native
  trait PushSync extends js.Object {
    var ApplicationArns: js.UndefOr[ApplicationArnList]
    var RoleArn: js.UndefOr[AssumeRoleArn]
  }

  object PushSync {
    def apply(
      ApplicationArns: js.UndefOr[ApplicationArnList] = js.undefined,
      RoleArn: js.UndefOr[AssumeRoleArn] = js.undefined): PushSync = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationArns" -> ApplicationArns.map { x => x.asInstanceOf[js.Any] },
        "RoleArn" -> RoleArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PushSync]
    }
  }

  /**
   * The basic data structure of a dataset.
   */
  @js.native
  trait Record extends js.Object {
    var DeviceLastModifiedDate: js.UndefOr[Date]
    var Key: js.UndefOr[RecordKey]
    var LastModifiedBy: js.UndefOr[String]
    var LastModifiedDate: js.UndefOr[Date]
    var SyncCount: js.UndefOr[Double]
    var Value: js.UndefOr[RecordValue]
  }

  object Record {
    def apply(
      DeviceLastModifiedDate: js.UndefOr[Date] = js.undefined,
      Key: js.UndefOr[RecordKey] = js.undefined,
      LastModifiedBy: js.UndefOr[String] = js.undefined,
      LastModifiedDate: js.UndefOr[Date] = js.undefined,
      SyncCount: js.UndefOr[Double] = js.undefined,
      Value: js.UndefOr[RecordValue] = js.undefined): Record = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DeviceLastModifiedDate" -> DeviceLastModifiedDate.map { x => x.asInstanceOf[js.Any] },
        "Key" -> Key.map { x => x.asInstanceOf[js.Any] },
        "LastModifiedBy" -> LastModifiedBy.map { x => x.asInstanceOf[js.Any] },
        "LastModifiedDate" -> LastModifiedDate.map { x => x.asInstanceOf[js.Any] },
        "SyncCount" -> SyncCount.map { x => x.asInstanceOf[js.Any] },
        "Value" -> Value.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Record]
    }
  }

  /**
   * An update operation for a record.
   */
  @js.native
  trait RecordPatch extends js.Object {
    var Key: RecordKey
    var Op: Operation
    var SyncCount: Double
    var DeviceLastModifiedDate: js.UndefOr[Date]
    var Value: js.UndefOr[RecordValue]
  }

  object RecordPatch {
    def apply(
      Key: RecordKey,
      Op: Operation,
      SyncCount: Double,
      DeviceLastModifiedDate: js.UndefOr[Date] = js.undefined,
      Value: js.UndefOr[RecordValue] = js.undefined): RecordPatch = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Key" -> Key.asInstanceOf[js.Any],
        "Op" -> Op.asInstanceOf[js.Any],
        "SyncCount" -> SyncCount.asInstanceOf[js.Any],
        "DeviceLastModifiedDate" -> DeviceLastModifiedDate.map { x => x.asInstanceOf[js.Any] },
        "Value" -> Value.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RecordPatch]
    }
  }

  /**
   * <p>A request to RegisterDevice.</p>
   */
  @js.native
  trait RegisterDeviceRequest extends js.Object {
    var IdentityId: IdentityId
    var IdentityPoolId: IdentityPoolId
    var Platform: Platform
    var Token: PushToken
  }

  object RegisterDeviceRequest {
    def apply(
      IdentityId: IdentityId,
      IdentityPoolId: IdentityPoolId,
      Platform: Platform,
      Token: PushToken): RegisterDeviceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IdentityId" -> IdentityId.asInstanceOf[js.Any],
        "IdentityPoolId" -> IdentityPoolId.asInstanceOf[js.Any],
        "Platform" -> Platform.asInstanceOf[js.Any],
        "Token" -> Token.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RegisterDeviceRequest]
    }
  }

  /**
   * <p>Response to a RegisterDevice request.</p>
   */
  @js.native
  trait RegisterDeviceResponse extends js.Object {
    var DeviceId: js.UndefOr[DeviceId]
  }

  object RegisterDeviceResponse {
    def apply(
      DeviceId: js.UndefOr[DeviceId] = js.undefined): RegisterDeviceResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DeviceId" -> DeviceId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RegisterDeviceResponse]
    }
  }

  /**
   * Thrown if an update can't be applied because the resource was changed by another call and this would result in a conflict.
   */
  @js.native
  trait ResourceConflictExceptionException extends js.Object {
    val message: ExceptionMessage
  }

  /**
   * Thrown if the resource doesn't exist.
   */
  @js.native
  trait ResourceNotFoundExceptionException extends js.Object {
    val message: ExceptionMessage
  }

  /**
   * <p>A request to configure Cognito Events"</p>"
   */
  @js.native
  trait SetCognitoEventsRequest extends js.Object {
    var Events: Events
    var IdentityPoolId: IdentityPoolId
  }

  object SetCognitoEventsRequest {
    def apply(
      Events: Events,
      IdentityPoolId: IdentityPoolId): SetCognitoEventsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Events" -> Events.asInstanceOf[js.Any],
        "IdentityPoolId" -> IdentityPoolId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SetCognitoEventsRequest]
    }
  }

  /**
   * <p>The input for the SetIdentityPoolConfiguration operation.</p>
   */
  @js.native
  trait SetIdentityPoolConfigurationRequest extends js.Object {
    var IdentityPoolId: IdentityPoolId
    var CognitoStreams: js.UndefOr[CognitoStreams]
    var PushSync: js.UndefOr[PushSync]
  }

  object SetIdentityPoolConfigurationRequest {
    def apply(
      IdentityPoolId: IdentityPoolId,
      CognitoStreams: js.UndefOr[CognitoStreams] = js.undefined,
      PushSync: js.UndefOr[PushSync] = js.undefined): SetIdentityPoolConfigurationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IdentityPoolId" -> IdentityPoolId.asInstanceOf[js.Any],
        "CognitoStreams" -> CognitoStreams.map { x => x.asInstanceOf[js.Any] },
        "PushSync" -> PushSync.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SetIdentityPoolConfigurationRequest]
    }
  }

  /**
   * <p>The output for the SetIdentityPoolConfiguration operation</p>
   */
  @js.native
  trait SetIdentityPoolConfigurationResponse extends js.Object {
    var CognitoStreams: js.UndefOr[CognitoStreams]
    var IdentityPoolId: js.UndefOr[IdentityPoolId]
    var PushSync: js.UndefOr[PushSync]
  }

  object SetIdentityPoolConfigurationResponse {
    def apply(
      CognitoStreams: js.UndefOr[CognitoStreams] = js.undefined,
      IdentityPoolId: js.UndefOr[IdentityPoolId] = js.undefined,
      PushSync: js.UndefOr[PushSync] = js.undefined): SetIdentityPoolConfigurationResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CognitoStreams" -> CognitoStreams.map { x => x.asInstanceOf[js.Any] },
        "IdentityPoolId" -> IdentityPoolId.map { x => x.asInstanceOf[js.Any] },
        "PushSync" -> PushSync.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SetIdentityPoolConfigurationResponse]
    }
  }

  object StreamingStatusEnum {
    val ENABLED = "ENABLED"
    val DISABLED = "DISABLED"

    val values = IndexedSeq(ENABLED, DISABLED)
  }

  /**
   * <p>A request to SubscribeToDatasetRequest.</p>
   */
  @js.native
  trait SubscribeToDatasetRequest extends js.Object {
    var DatasetName: DatasetName
    var DeviceId: DeviceId
    var IdentityId: IdentityId
    var IdentityPoolId: IdentityPoolId
  }

  object SubscribeToDatasetRequest {
    def apply(
      DatasetName: DatasetName,
      DeviceId: DeviceId,
      IdentityId: IdentityId,
      IdentityPoolId: IdentityPoolId): SubscribeToDatasetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DatasetName" -> DatasetName.asInstanceOf[js.Any],
        "DeviceId" -> DeviceId.asInstanceOf[js.Any],
        "IdentityId" -> IdentityId.asInstanceOf[js.Any],
        "IdentityPoolId" -> IdentityPoolId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SubscribeToDatasetRequest]
    }
  }

  /**
   * <p>Response to a SubscribeToDataset request.</p>
   */
  @js.native
  trait SubscribeToDatasetResponse extends js.Object {

  }

  object SubscribeToDatasetResponse {
    def apply(): SubscribeToDatasetResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SubscribeToDatasetResponse]
    }
  }

  /**
   * Thrown if the request is throttled.
   */
  @js.native
  trait TooManyRequestsExceptionException extends js.Object {
    val message: ExceptionMessage
  }

  /**
   * <p>A request to UnsubscribeFromDataset.</p>
   */
  @js.native
  trait UnsubscribeFromDatasetRequest extends js.Object {
    var DatasetName: DatasetName
    var DeviceId: DeviceId
    var IdentityId: IdentityId
    var IdentityPoolId: IdentityPoolId
  }

  object UnsubscribeFromDatasetRequest {
    def apply(
      DatasetName: DatasetName,
      DeviceId: DeviceId,
      IdentityId: IdentityId,
      IdentityPoolId: IdentityPoolId): UnsubscribeFromDatasetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DatasetName" -> DatasetName.asInstanceOf[js.Any],
        "DeviceId" -> DeviceId.asInstanceOf[js.Any],
        "IdentityId" -> IdentityId.asInstanceOf[js.Any],
        "IdentityPoolId" -> IdentityPoolId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UnsubscribeFromDatasetRequest]
    }
  }

  /**
   * <p>Response to an UnsubscribeFromDataset request.</p>
   */
  @js.native
  trait UnsubscribeFromDatasetResponse extends js.Object {

  }

  object UnsubscribeFromDatasetResponse {
    def apply(): UnsubscribeFromDatasetResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UnsubscribeFromDatasetResponse]
    }
  }

  /**
   * A request to post updates to records or add and delete records for a dataset and user.
   */
  @js.native
  trait UpdateRecordsRequest extends js.Object {
    var DatasetName: DatasetName
    var IdentityId: IdentityId
    var IdentityPoolId: IdentityPoolId
    var SyncSessionToken: SyncSessionToken
    var ClientContext: js.UndefOr[ClientContext]
    var DeviceId: js.UndefOr[DeviceId]
    var RecordPatches: js.UndefOr[RecordPatchList]
  }

  object UpdateRecordsRequest {
    def apply(
      DatasetName: DatasetName,
      IdentityId: IdentityId,
      IdentityPoolId: IdentityPoolId,
      SyncSessionToken: SyncSessionToken,
      ClientContext: js.UndefOr[ClientContext] = js.undefined,
      DeviceId: js.UndefOr[DeviceId] = js.undefined,
      RecordPatches: js.UndefOr[RecordPatchList] = js.undefined): UpdateRecordsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DatasetName" -> DatasetName.asInstanceOf[js.Any],
        "IdentityId" -> IdentityId.asInstanceOf[js.Any],
        "IdentityPoolId" -> IdentityPoolId.asInstanceOf[js.Any],
        "SyncSessionToken" -> SyncSessionToken.asInstanceOf[js.Any],
        "ClientContext" -> ClientContext.map { x => x.asInstanceOf[js.Any] },
        "DeviceId" -> DeviceId.map { x => x.asInstanceOf[js.Any] },
        "RecordPatches" -> RecordPatches.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateRecordsRequest]
    }
  }

  /**
   * Returned for a successful UpdateRecordsRequest.
   */
  @js.native
  trait UpdateRecordsResponse extends js.Object {
    var Records: js.UndefOr[RecordList]
  }

  object UpdateRecordsResponse {
    def apply(
      Records: js.UndefOr[RecordList] = js.undefined): UpdateRecordsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Records" -> Records.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateRecordsResponse]
    }
  }
}
