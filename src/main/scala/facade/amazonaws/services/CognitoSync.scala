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
    var IdentityPoolId: js.UndefOr[IdentityPoolId]
  }

  object BulkPublishRequest {
    def apply(
      IdentityPoolId: js.UndefOr[IdentityPoolId] = js.undefined): BulkPublishRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IdentityPoolId" -> IdentityPoolId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var StreamName: js.UndefOr[StreamName]
    var RoleArn: js.UndefOr[AssumeRoleArn]
    var StreamingStatus: js.UndefOr[StreamingStatus]
  }

  object CognitoStreams {
    def apply(
      StreamName: js.UndefOr[StreamName] = js.undefined,
      RoleArn: js.UndefOr[AssumeRoleArn] = js.undefined,
      StreamingStatus: js.UndefOr[StreamingStatus] = js.undefined): CognitoStreams = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StreamName" -> StreamName.map { x => x.asInstanceOf[js.Any] },
        "RoleArn" -> RoleArn.map { x => x.asInstanceOf[js.Any] },
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
    var LastModifiedDate: js.UndefOr[Date]
    var DatasetName: js.UndefOr[DatasetName]
    var DataStorage: js.UndefOr[Double]
    var LastModifiedBy: js.UndefOr[String]
    var IdentityId: js.UndefOr[IdentityId]
    var NumRecords: js.UndefOr[Double]
  }

  object Dataset {
    def apply(
      CreationDate: js.UndefOr[Date] = js.undefined,
      LastModifiedDate: js.UndefOr[Date] = js.undefined,
      DatasetName: js.UndefOr[DatasetName] = js.undefined,
      DataStorage: js.UndefOr[Double] = js.undefined,
      LastModifiedBy: js.UndefOr[String] = js.undefined,
      IdentityId: js.UndefOr[IdentityId] = js.undefined,
      NumRecords: js.UndefOr[Double] = js.undefined): Dataset = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CreationDate" -> CreationDate.map { x => x.asInstanceOf[js.Any] },
        "LastModifiedDate" -> LastModifiedDate.map { x => x.asInstanceOf[js.Any] },
        "DatasetName" -> DatasetName.map { x => x.asInstanceOf[js.Any] },
        "DataStorage" -> DataStorage.map { x => x.asInstanceOf[js.Any] },
        "LastModifiedBy" -> LastModifiedBy.map { x => x.asInstanceOf[js.Any] },
        "IdentityId" -> IdentityId.map { x => x.asInstanceOf[js.Any] },
        "NumRecords" -> NumRecords.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Dataset]
    }
  }

  /**
   * A request to delete the specific dataset.
   */
  @js.native
  trait DeleteDatasetRequest extends js.Object {
    var IdentityPoolId: js.UndefOr[IdentityPoolId]
    var IdentityId: js.UndefOr[IdentityId]
    var DatasetName: js.UndefOr[DatasetName]
  }

  object DeleteDatasetRequest {
    def apply(
      IdentityPoolId: js.UndefOr[IdentityPoolId] = js.undefined,
      IdentityId: js.UndefOr[IdentityId] = js.undefined,
      DatasetName: js.UndefOr[DatasetName] = js.undefined): DeleteDatasetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IdentityPoolId" -> IdentityPoolId.map { x => x.asInstanceOf[js.Any] },
        "IdentityId" -> IdentityId.map { x => x.asInstanceOf[js.Any] },
        "DatasetName" -> DatasetName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var IdentityPoolId: js.UndefOr[IdentityPoolId]
    var IdentityId: js.UndefOr[IdentityId]
    var DatasetName: js.UndefOr[DatasetName]
  }

  object DescribeDatasetRequest {
    def apply(
      IdentityPoolId: js.UndefOr[IdentityPoolId] = js.undefined,
      IdentityId: js.UndefOr[IdentityId] = js.undefined,
      DatasetName: js.UndefOr[DatasetName] = js.undefined): DescribeDatasetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IdentityPoolId" -> IdentityPoolId.map { x => x.asInstanceOf[js.Any] },
        "IdentityId" -> IdentityId.map { x => x.asInstanceOf[js.Any] },
        "DatasetName" -> DatasetName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var IdentityPoolId: js.UndefOr[IdentityPoolId]
  }

  object DescribeIdentityPoolUsageRequest {
    def apply(
      IdentityPoolId: js.UndefOr[IdentityPoolId] = js.undefined): DescribeIdentityPoolUsageRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IdentityPoolId" -> IdentityPoolId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var IdentityPoolId: js.UndefOr[IdentityPoolId]
    var IdentityId: js.UndefOr[IdentityId]
  }

  object DescribeIdentityUsageRequest {
    def apply(
      IdentityPoolId: js.UndefOr[IdentityPoolId] = js.undefined,
      IdentityId: js.UndefOr[IdentityId] = js.undefined): DescribeIdentityUsageRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IdentityPoolId" -> IdentityPoolId.map { x => x.asInstanceOf[js.Any] },
        "IdentityId" -> IdentityId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var IdentityPoolId: js.UndefOr[IdentityPoolId]
  }

  object GetBulkPublishDetailsRequest {
    def apply(
      IdentityPoolId: js.UndefOr[IdentityPoolId] = js.undefined): GetBulkPublishDetailsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IdentityPoolId" -> IdentityPoolId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var FailureMessage: js.UndefOr[String]
    var BulkPublishStatus: js.UndefOr[BulkPublishStatus]
    var IdentityPoolId: js.UndefOr[IdentityPoolId]
  }

  object GetBulkPublishDetailsResponse {
    def apply(
      BulkPublishCompleteTime: js.UndefOr[Date] = js.undefined,
      BulkPublishStartTime: js.UndefOr[Date] = js.undefined,
      FailureMessage: js.UndefOr[String] = js.undefined,
      BulkPublishStatus: js.UndefOr[BulkPublishStatus] = js.undefined,
      IdentityPoolId: js.UndefOr[IdentityPoolId] = js.undefined): GetBulkPublishDetailsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BulkPublishCompleteTime" -> BulkPublishCompleteTime.map { x => x.asInstanceOf[js.Any] },
        "BulkPublishStartTime" -> BulkPublishStartTime.map { x => x.asInstanceOf[js.Any] },
        "FailureMessage" -> FailureMessage.map { x => x.asInstanceOf[js.Any] },
        "BulkPublishStatus" -> BulkPublishStatus.map { x => x.asInstanceOf[js.Any] },
        "IdentityPoolId" -> IdentityPoolId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetBulkPublishDetailsResponse]
    }
  }

  /**
   * <p>A request for a list of the configured Cognito Events</p>
   */
  @js.native
  trait GetCognitoEventsRequest extends js.Object {
    var IdentityPoolId: js.UndefOr[IdentityPoolId]
  }

  object GetCognitoEventsRequest {
    def apply(
      IdentityPoolId: js.UndefOr[IdentityPoolId] = js.undefined): GetCognitoEventsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IdentityPoolId" -> IdentityPoolId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var IdentityPoolId: js.UndefOr[IdentityPoolId]
  }

  object GetIdentityPoolConfigurationRequest {
    def apply(
      IdentityPoolId: js.UndefOr[IdentityPoolId] = js.undefined): GetIdentityPoolConfigurationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IdentityPoolId" -> IdentityPoolId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetIdentityPoolConfigurationRequest]
    }
  }

  /**
   * <p>The output for the GetIdentityPoolConfiguration operation.</p>
   */
  @js.native
  trait GetIdentityPoolConfigurationResponse extends js.Object {
    var IdentityPoolId: js.UndefOr[IdentityPoolId]
    var PushSync: js.UndefOr[PushSync]
    var CognitoStreams: js.UndefOr[CognitoStreams]
  }

  object GetIdentityPoolConfigurationResponse {
    def apply(
      IdentityPoolId: js.UndefOr[IdentityPoolId] = js.undefined,
      PushSync: js.UndefOr[PushSync] = js.undefined,
      CognitoStreams: js.UndefOr[CognitoStreams] = js.undefined): GetIdentityPoolConfigurationResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IdentityPoolId" -> IdentityPoolId.map { x => x.asInstanceOf[js.Any] },
        "PushSync" -> PushSync.map { x => x.asInstanceOf[js.Any] },
        "CognitoStreams" -> CognitoStreams.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetIdentityPoolConfigurationResponse]
    }
  }

  /**
   * Usage information for the identity pool.
   */
  @js.native
  trait IdentityPoolUsage extends js.Object {
    var IdentityPoolId: js.UndefOr[IdentityPoolId]
    var SyncSessionsCount: js.UndefOr[Double]
    var DataStorage: js.UndefOr[Double]
    var LastModifiedDate: js.UndefOr[Date]
  }

  object IdentityPoolUsage {
    def apply(
      IdentityPoolId: js.UndefOr[IdentityPoolId] = js.undefined,
      SyncSessionsCount: js.UndefOr[Double] = js.undefined,
      DataStorage: js.UndefOr[Double] = js.undefined,
      LastModifiedDate: js.UndefOr[Date] = js.undefined): IdentityPoolUsage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IdentityPoolId" -> IdentityPoolId.map { x => x.asInstanceOf[js.Any] },
        "SyncSessionsCount" -> SyncSessionsCount.map { x => x.asInstanceOf[js.Any] },
        "DataStorage" -> DataStorage.map { x => x.asInstanceOf[js.Any] },
        "LastModifiedDate" -> LastModifiedDate.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[IdentityPoolUsage]
    }
  }

  /**
   * Usage information for the identity.
   */
  @js.native
  trait IdentityUsage extends js.Object {
    var LastModifiedDate: js.UndefOr[Date]
    var DataStorage: js.UndefOr[Double]
    var IdentityPoolId: js.UndefOr[IdentityPoolId]
    var IdentityId: js.UndefOr[IdentityId]
    var DatasetCount: js.UndefOr[Int]
  }

  object IdentityUsage {
    def apply(
      LastModifiedDate: js.UndefOr[Date] = js.undefined,
      DataStorage: js.UndefOr[Double] = js.undefined,
      IdentityPoolId: js.UndefOr[IdentityPoolId] = js.undefined,
      IdentityId: js.UndefOr[IdentityId] = js.undefined,
      DatasetCount: js.UndefOr[Int] = js.undefined): IdentityUsage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LastModifiedDate" -> LastModifiedDate.map { x => x.asInstanceOf[js.Any] },
        "DataStorage" -> DataStorage.map { x => x.asInstanceOf[js.Any] },
        "IdentityPoolId" -> IdentityPoolId.map { x => x.asInstanceOf[js.Any] },
        "IdentityId" -> IdentityId.map { x => x.asInstanceOf[js.Any] },
        "DatasetCount" -> DatasetCount.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var IdentityPoolId: js.UndefOr[IdentityPoolId]
    var IdentityId: js.UndefOr[IdentityId]
    var NextToken: js.UndefOr[String]
    var MaxResults: js.UndefOr[IntegerString]
  }

  object ListDatasetsRequest {
    def apply(
      IdentityPoolId: js.UndefOr[IdentityPoolId] = js.undefined,
      IdentityId: js.UndefOr[IdentityId] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined,
      MaxResults: js.UndefOr[IntegerString] = js.undefined): ListDatasetsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IdentityPoolId" -> IdentityPoolId.map { x => x.asInstanceOf[js.Any] },
        "IdentityId" -> IdentityId.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListDatasetsRequest]
    }
  }

  /**
   * Returned for a successful ListDatasets request.
   */
  @js.native
  trait ListDatasetsResponse extends js.Object {
    var Datasets: js.UndefOr[DatasetList]
    var Count: js.UndefOr[Int]
    var NextToken: js.UndefOr[String]
  }

  object ListDatasetsResponse {
    def apply(
      Datasets: js.UndefOr[DatasetList] = js.undefined,
      Count: js.UndefOr[Int] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined): ListDatasetsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Datasets" -> Datasets.map { x => x.asInstanceOf[js.Any] },
        "Count" -> Count.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListDatasetsResponse]
    }
  }

  /**
   * A request for usage information on an identity pool.
   */
  @js.native
  trait ListIdentityPoolUsageRequest extends js.Object {
    var NextToken: js.UndefOr[String]
    var MaxResults: js.UndefOr[IntegerString]
  }

  object ListIdentityPoolUsageRequest {
    def apply(
      NextToken: js.UndefOr[String] = js.undefined,
      MaxResults: js.UndefOr[IntegerString] = js.undefined): ListIdentityPoolUsageRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListIdentityPoolUsageRequest]
    }
  }

  /**
   * Returned for a successful ListIdentityPoolUsage request.
   */
  @js.native
  trait ListIdentityPoolUsageResponse extends js.Object {
    var IdentityPoolUsages: js.UndefOr[IdentityPoolUsageList]
    var MaxResults: js.UndefOr[Int]
    var Count: js.UndefOr[Int]
    var NextToken: js.UndefOr[String]
  }

  object ListIdentityPoolUsageResponse {
    def apply(
      IdentityPoolUsages: js.UndefOr[IdentityPoolUsageList] = js.undefined,
      MaxResults: js.UndefOr[Int] = js.undefined,
      Count: js.UndefOr[Int] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined): ListIdentityPoolUsageResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IdentityPoolUsages" -> IdentityPoolUsages.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "Count" -> Count.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListIdentityPoolUsageResponse]
    }
  }

  /**
   * A request for a list of records.
   */
  @js.native
  trait ListRecordsRequest extends js.Object {
    var MaxResults: js.UndefOr[IntegerString]
    var DatasetName: js.UndefOr[DatasetName]
    var SyncSessionToken: js.UndefOr[SyncSessionToken]
    var IdentityPoolId: js.UndefOr[IdentityPoolId]
    var LastSyncCount: js.UndefOr[Double]
    var IdentityId: js.UndefOr[IdentityId]
    var NextToken: js.UndefOr[String]
  }

  object ListRecordsRequest {
    def apply(
      MaxResults: js.UndefOr[IntegerString] = js.undefined,
      DatasetName: js.UndefOr[DatasetName] = js.undefined,
      SyncSessionToken: js.UndefOr[SyncSessionToken] = js.undefined,
      IdentityPoolId: js.UndefOr[IdentityPoolId] = js.undefined,
      LastSyncCount: js.UndefOr[Double] = js.undefined,
      IdentityId: js.UndefOr[IdentityId] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined): ListRecordsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "DatasetName" -> DatasetName.map { x => x.asInstanceOf[js.Any] },
        "SyncSessionToken" -> SyncSessionToken.map { x => x.asInstanceOf[js.Any] },
        "IdentityPoolId" -> IdentityPoolId.map { x => x.asInstanceOf[js.Any] },
        "LastSyncCount" -> LastSyncCount.map { x => x.asInstanceOf[js.Any] },
        "IdentityId" -> IdentityId.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListRecordsRequest]
    }
  }

  /**
   * Returned for a successful ListRecordsRequest.
   */
  @js.native
  trait ListRecordsResponse extends js.Object {
    var Records: js.UndefOr[RecordList]
    var DatasetSyncCount: js.UndefOr[Double]
    var DatasetDeletedAfterRequestedSyncCount: js.UndefOr[Boolean]
    var MergedDatasetNames: js.UndefOr[MergedDatasetNameList]
    var Count: js.UndefOr[Int]
    var SyncSessionToken: js.UndefOr[String]
    var DatasetExists: js.UndefOr[Boolean]
    var LastModifiedBy: js.UndefOr[String]
    var NextToken: js.UndefOr[String]
  }

  object ListRecordsResponse {
    def apply(
      Records: js.UndefOr[RecordList] = js.undefined,
      DatasetSyncCount: js.UndefOr[Double] = js.undefined,
      DatasetDeletedAfterRequestedSyncCount: js.UndefOr[Boolean] = js.undefined,
      MergedDatasetNames: js.UndefOr[MergedDatasetNameList] = js.undefined,
      Count: js.UndefOr[Int] = js.undefined,
      SyncSessionToken: js.UndefOr[String] = js.undefined,
      DatasetExists: js.UndefOr[Boolean] = js.undefined,
      LastModifiedBy: js.UndefOr[String] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined): ListRecordsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Records" -> Records.map { x => x.asInstanceOf[js.Any] },
        "DatasetSyncCount" -> DatasetSyncCount.map { x => x.asInstanceOf[js.Any] },
        "DatasetDeletedAfterRequestedSyncCount" -> DatasetDeletedAfterRequestedSyncCount.map { x => x.asInstanceOf[js.Any] },
        "MergedDatasetNames" -> MergedDatasetNames.map { x => x.asInstanceOf[js.Any] },
        "Count" -> Count.map { x => x.asInstanceOf[js.Any] },
        "SyncSessionToken" -> SyncSessionToken.map { x => x.asInstanceOf[js.Any] },
        "DatasetExists" -> DatasetExists.map { x => x.asInstanceOf[js.Any] },
        "LastModifiedBy" -> LastModifiedBy.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var LastModifiedDate: js.UndefOr[Date]
    var Value: js.UndefOr[RecordValue]
    var DeviceLastModifiedDate: js.UndefOr[Date]
    var LastModifiedBy: js.UndefOr[String]
    var SyncCount: js.UndefOr[Double]
    var Key: js.UndefOr[RecordKey]
  }

  object Record {
    def apply(
      LastModifiedDate: js.UndefOr[Date] = js.undefined,
      Value: js.UndefOr[RecordValue] = js.undefined,
      DeviceLastModifiedDate: js.UndefOr[Date] = js.undefined,
      LastModifiedBy: js.UndefOr[String] = js.undefined,
      SyncCount: js.UndefOr[Double] = js.undefined,
      Key: js.UndefOr[RecordKey] = js.undefined): Record = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LastModifiedDate" -> LastModifiedDate.map { x => x.asInstanceOf[js.Any] },
        "Value" -> Value.map { x => x.asInstanceOf[js.Any] },
        "DeviceLastModifiedDate" -> DeviceLastModifiedDate.map { x => x.asInstanceOf[js.Any] },
        "LastModifiedBy" -> LastModifiedBy.map { x => x.asInstanceOf[js.Any] },
        "SyncCount" -> SyncCount.map { x => x.asInstanceOf[js.Any] },
        "Key" -> Key.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Record]
    }
  }

  /**
   * An update operation for a record.
   */
  @js.native
  trait RecordPatch extends js.Object {
    var Op: js.UndefOr[Operation]
    var Value: js.UndefOr[RecordValue]
    var DeviceLastModifiedDate: js.UndefOr[Date]
    var SyncCount: js.UndefOr[Double]
    var Key: js.UndefOr[RecordKey]
  }

  object RecordPatch {
    def apply(
      Op: js.UndefOr[Operation] = js.undefined,
      Value: js.UndefOr[RecordValue] = js.undefined,
      DeviceLastModifiedDate: js.UndefOr[Date] = js.undefined,
      SyncCount: js.UndefOr[Double] = js.undefined,
      Key: js.UndefOr[RecordKey] = js.undefined): RecordPatch = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Op" -> Op.map { x => x.asInstanceOf[js.Any] },
        "Value" -> Value.map { x => x.asInstanceOf[js.Any] },
        "DeviceLastModifiedDate" -> DeviceLastModifiedDate.map { x => x.asInstanceOf[js.Any] },
        "SyncCount" -> SyncCount.map { x => x.asInstanceOf[js.Any] },
        "Key" -> Key.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RecordPatch]
    }
  }

  /**
   * <p>A request to RegisterDevice.</p>
   */
  @js.native
  trait RegisterDeviceRequest extends js.Object {
    var IdentityPoolId: js.UndefOr[IdentityPoolId]
    var IdentityId: js.UndefOr[IdentityId]
    var Platform: js.UndefOr[Platform]
    var Token: js.UndefOr[PushToken]
  }

  object RegisterDeviceRequest {
    def apply(
      IdentityPoolId: js.UndefOr[IdentityPoolId] = js.undefined,
      IdentityId: js.UndefOr[IdentityId] = js.undefined,
      Platform: js.UndefOr[Platform] = js.undefined,
      Token: js.UndefOr[PushToken] = js.undefined): RegisterDeviceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IdentityPoolId" -> IdentityPoolId.map { x => x.asInstanceOf[js.Any] },
        "IdentityId" -> IdentityId.map { x => x.asInstanceOf[js.Any] },
        "Platform" -> Platform.map { x => x.asInstanceOf[js.Any] },
        "Token" -> Token.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var IdentityPoolId: js.UndefOr[IdentityPoolId]
    var Events: js.UndefOr[Events]
  }

  object SetCognitoEventsRequest {
    def apply(
      IdentityPoolId: js.UndefOr[IdentityPoolId] = js.undefined,
      Events: js.UndefOr[Events] = js.undefined): SetCognitoEventsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IdentityPoolId" -> IdentityPoolId.map { x => x.asInstanceOf[js.Any] },
        "Events" -> Events.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SetCognitoEventsRequest]
    }
  }

  /**
   * <p>The input for the SetIdentityPoolConfiguration operation.</p>
   */
  @js.native
  trait SetIdentityPoolConfigurationRequest extends js.Object {
    var IdentityPoolId: js.UndefOr[IdentityPoolId]
    var PushSync: js.UndefOr[PushSync]
    var CognitoStreams: js.UndefOr[CognitoStreams]
  }

  object SetIdentityPoolConfigurationRequest {
    def apply(
      IdentityPoolId: js.UndefOr[IdentityPoolId] = js.undefined,
      PushSync: js.UndefOr[PushSync] = js.undefined,
      CognitoStreams: js.UndefOr[CognitoStreams] = js.undefined): SetIdentityPoolConfigurationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IdentityPoolId" -> IdentityPoolId.map { x => x.asInstanceOf[js.Any] },
        "PushSync" -> PushSync.map { x => x.asInstanceOf[js.Any] },
        "CognitoStreams" -> CognitoStreams.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SetIdentityPoolConfigurationRequest]
    }
  }

  /**
   * <p>The output for the SetIdentityPoolConfiguration operation</p>
   */
  @js.native
  trait SetIdentityPoolConfigurationResponse extends js.Object {
    var IdentityPoolId: js.UndefOr[IdentityPoolId]
    var PushSync: js.UndefOr[PushSync]
    var CognitoStreams: js.UndefOr[CognitoStreams]
  }

  object SetIdentityPoolConfigurationResponse {
    def apply(
      IdentityPoolId: js.UndefOr[IdentityPoolId] = js.undefined,
      PushSync: js.UndefOr[PushSync] = js.undefined,
      CognitoStreams: js.UndefOr[CognitoStreams] = js.undefined): SetIdentityPoolConfigurationResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IdentityPoolId" -> IdentityPoolId.map { x => x.asInstanceOf[js.Any] },
        "PushSync" -> PushSync.map { x => x.asInstanceOf[js.Any] },
        "CognitoStreams" -> CognitoStreams.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var IdentityPoolId: js.UndefOr[IdentityPoolId]
    var IdentityId: js.UndefOr[IdentityId]
    var DatasetName: js.UndefOr[DatasetName]
    var DeviceId: js.UndefOr[DeviceId]
  }

  object SubscribeToDatasetRequest {
    def apply(
      IdentityPoolId: js.UndefOr[IdentityPoolId] = js.undefined,
      IdentityId: js.UndefOr[IdentityId] = js.undefined,
      DatasetName: js.UndefOr[DatasetName] = js.undefined,
      DeviceId: js.UndefOr[DeviceId] = js.undefined): SubscribeToDatasetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IdentityPoolId" -> IdentityPoolId.map { x => x.asInstanceOf[js.Any] },
        "IdentityId" -> IdentityId.map { x => x.asInstanceOf[js.Any] },
        "DatasetName" -> DatasetName.map { x => x.asInstanceOf[js.Any] },
        "DeviceId" -> DeviceId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var IdentityPoolId: js.UndefOr[IdentityPoolId]
    var IdentityId: js.UndefOr[IdentityId]
    var DatasetName: js.UndefOr[DatasetName]
    var DeviceId: js.UndefOr[DeviceId]
  }

  object UnsubscribeFromDatasetRequest {
    def apply(
      IdentityPoolId: js.UndefOr[IdentityPoolId] = js.undefined,
      IdentityId: js.UndefOr[IdentityId] = js.undefined,
      DatasetName: js.UndefOr[DatasetName] = js.undefined,
      DeviceId: js.UndefOr[DeviceId] = js.undefined): UnsubscribeFromDatasetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IdentityPoolId" -> IdentityPoolId.map { x => x.asInstanceOf[js.Any] },
        "IdentityId" -> IdentityId.map { x => x.asInstanceOf[js.Any] },
        "DatasetName" -> DatasetName.map { x => x.asInstanceOf[js.Any] },
        "DeviceId" -> DeviceId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var ClientContext: js.UndefOr[ClientContext]
    var DatasetName: js.UndefOr[DatasetName]
    var SyncSessionToken: js.UndefOr[SyncSessionToken]
    var RecordPatches: js.UndefOr[RecordPatchList]
    var IdentityPoolId: js.UndefOr[IdentityPoolId]
    var IdentityId: js.UndefOr[IdentityId]
    var DeviceId: js.UndefOr[DeviceId]
  }

  object UpdateRecordsRequest {
    def apply(
      ClientContext: js.UndefOr[ClientContext] = js.undefined,
      DatasetName: js.UndefOr[DatasetName] = js.undefined,
      SyncSessionToken: js.UndefOr[SyncSessionToken] = js.undefined,
      RecordPatches: js.UndefOr[RecordPatchList] = js.undefined,
      IdentityPoolId: js.UndefOr[IdentityPoolId] = js.undefined,
      IdentityId: js.UndefOr[IdentityId] = js.undefined,
      DeviceId: js.UndefOr[DeviceId] = js.undefined): UpdateRecordsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ClientContext" -> ClientContext.map { x => x.asInstanceOf[js.Any] },
        "DatasetName" -> DatasetName.map { x => x.asInstanceOf[js.Any] },
        "SyncSessionToken" -> SyncSessionToken.map { x => x.asInstanceOf[js.Any] },
        "RecordPatches" -> RecordPatches.map { x => x.asInstanceOf[js.Any] },
        "IdentityPoolId" -> IdentityPoolId.map { x => x.asInstanceOf[js.Any] },
        "IdentityId" -> IdentityId.map { x => x.asInstanceOf[js.Any] },
        "DeviceId" -> DeviceId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
