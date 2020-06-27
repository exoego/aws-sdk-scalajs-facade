package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object cognitosync {
  type ApplicationArn        = String
  type ApplicationArnList    = js.Array[ApplicationArn]
  type AssumeRoleArn         = String
  type ClientContext         = String
  type CognitoEventType      = String
  type DatasetList           = js.Array[Dataset]
  type DatasetName           = String
  type Date                  = js.Date
  type DeviceId              = String
  type Events                = js.Dictionary[LambdaFunctionArn]
  type ExceptionMessage      = String
  type IdentityId            = String
  type IdentityPoolId        = String
  type IdentityPoolUsageList = js.Array[IdentityPoolUsage]
  type IntegerString         = Int
  type LambdaFunctionArn     = String
  type MergedDatasetNameList = js.Array[String]
  type PushToken             = String
  type RecordKey             = String
  type RecordList            = js.Array[Record]
  type RecordPatchList       = js.Array[RecordPatch]
  type RecordValue           = String
  type StreamName            = String
  type SyncSessionToken      = String

  implicit final class CognitoSyncOps(private val service: CognitoSync) extends AnyVal {

    @inline def bulkPublishFuture(params: BulkPublishRequest): Future[BulkPublishResponse] =
      service.bulkPublish(params).promise().toFuture
    @inline def deleteDatasetFuture(params: DeleteDatasetRequest): Future[DeleteDatasetResponse] =
      service.deleteDataset(params).promise().toFuture
    @inline def describeDatasetFuture(params: DescribeDatasetRequest): Future[DescribeDatasetResponse] =
      service.describeDataset(params).promise().toFuture
    @inline def describeIdentityPoolUsageFuture(
        params: DescribeIdentityPoolUsageRequest
    ): Future[DescribeIdentityPoolUsageResponse] = service.describeIdentityPoolUsage(params).promise().toFuture
    @inline def describeIdentityUsageFuture(
        params: DescribeIdentityUsageRequest
    ): Future[DescribeIdentityUsageResponse] = service.describeIdentityUsage(params).promise().toFuture
    @inline def getBulkPublishDetailsFuture(
        params: GetBulkPublishDetailsRequest
    ): Future[GetBulkPublishDetailsResponse] = service.getBulkPublishDetails(params).promise().toFuture
    @inline def getCognitoEventsFuture(params: GetCognitoEventsRequest): Future[GetCognitoEventsResponse] =
      service.getCognitoEvents(params).promise().toFuture
    @inline def getIdentityPoolConfigurationFuture(
        params: GetIdentityPoolConfigurationRequest
    ): Future[GetIdentityPoolConfigurationResponse] = service.getIdentityPoolConfiguration(params).promise().toFuture
    @inline def listDatasetsFuture(params: ListDatasetsRequest): Future[ListDatasetsResponse] =
      service.listDatasets(params).promise().toFuture
    @inline def listIdentityPoolUsageFuture(
        params: ListIdentityPoolUsageRequest
    ): Future[ListIdentityPoolUsageResponse] = service.listIdentityPoolUsage(params).promise().toFuture
    @inline def listRecordsFuture(params: ListRecordsRequest): Future[ListRecordsResponse] =
      service.listRecords(params).promise().toFuture
    @inline def registerDeviceFuture(params: RegisterDeviceRequest): Future[RegisterDeviceResponse] =
      service.registerDevice(params).promise().toFuture
    @inline def setCognitoEventsFuture(params: SetCognitoEventsRequest): Future[js.Object] =
      service.setCognitoEvents(params).promise().toFuture
    @inline def setIdentityPoolConfigurationFuture(
        params: SetIdentityPoolConfigurationRequest
    ): Future[SetIdentityPoolConfigurationResponse] = service.setIdentityPoolConfiguration(params).promise().toFuture
    @inline def subscribeToDatasetFuture(params: SubscribeToDatasetRequest): Future[SubscribeToDatasetResponse] =
      service.subscribeToDataset(params).promise().toFuture
    @inline def unsubscribeFromDatasetFuture(
        params: UnsubscribeFromDatasetRequest
    ): Future[UnsubscribeFromDatasetResponse] = service.unsubscribeFromDataset(params).promise().toFuture
    @inline def updateRecordsFuture(params: UpdateRecordsRequest): Future[UpdateRecordsResponse] =
      service.updateRecords(params).promise().toFuture
  }
}

package cognitosync {
  @js.native
  @JSImport("aws-sdk", "CognitoSync")
  class CognitoSync() extends js.Object {
    def this(config: AWSConfig) = this()

    def bulkPublish(params: BulkPublishRequest): Request[BulkPublishResponse]             = js.native
    def deleteDataset(params: DeleteDatasetRequest): Request[DeleteDatasetResponse]       = js.native
    def describeDataset(params: DescribeDatasetRequest): Request[DescribeDatasetResponse] = js.native
    def describeIdentityPoolUsage(
        params: DescribeIdentityPoolUsageRequest
    ): Request[DescribeIdentityPoolUsageResponse]                                                           = js.native
    def describeIdentityUsage(params: DescribeIdentityUsageRequest): Request[DescribeIdentityUsageResponse] = js.native
    def getBulkPublishDetails(params: GetBulkPublishDetailsRequest): Request[GetBulkPublishDetailsResponse] = js.native
    def getCognitoEvents(params: GetCognitoEventsRequest): Request[GetCognitoEventsResponse]                = js.native
    def getIdentityPoolConfiguration(
        params: GetIdentityPoolConfigurationRequest
    ): Request[GetIdentityPoolConfigurationResponse]                                                        = js.native
    def listDatasets(params: ListDatasetsRequest): Request[ListDatasetsResponse]                            = js.native
    def listIdentityPoolUsage(params: ListIdentityPoolUsageRequest): Request[ListIdentityPoolUsageResponse] = js.native
    def listRecords(params: ListRecordsRequest): Request[ListRecordsResponse]                               = js.native
    def registerDevice(params: RegisterDeviceRequest): Request[RegisterDeviceResponse]                      = js.native
    def setCognitoEvents(params: SetCognitoEventsRequest): Request[js.Object]                               = js.native
    def setIdentityPoolConfiguration(
        params: SetIdentityPoolConfigurationRequest
    ): Request[SetIdentityPoolConfigurationResponse]                                               = js.native
    def subscribeToDataset(params: SubscribeToDatasetRequest): Request[SubscribeToDatasetResponse] = js.native
    def unsubscribeFromDataset(params: UnsubscribeFromDatasetRequest): Request[UnsubscribeFromDatasetResponse] =
      js.native
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
  @Factory
  trait BulkPublishRequest extends js.Object {
    var IdentityPoolId: IdentityPoolId
  }

  /**
    * The output for the BulkPublish operation.
    */
  @js.native
  @Factory
  trait BulkPublishResponse extends js.Object {
    var IdentityPoolId: js.UndefOr[IdentityPoolId]
  }

  @js.native
  sealed trait BulkPublishStatus extends js.Any
  object BulkPublishStatus extends js.Object {
    val NOT_STARTED = "NOT_STARTED".asInstanceOf[BulkPublishStatus]
    val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[BulkPublishStatus]
    val FAILED      = "FAILED".asInstanceOf[BulkPublishStatus]
    val SUCCEEDED   = "SUCCEEDED".asInstanceOf[BulkPublishStatus]

    val values = js.Object.freeze(js.Array(NOT_STARTED, IN_PROGRESS, FAILED, SUCCEEDED))
  }

  /**
    * Configuration options for configure Cognito streams.
    */
  @js.native
  @Factory
  trait CognitoStreams extends js.Object {
    var RoleArn: js.UndefOr[AssumeRoleArn]
    var StreamName: js.UndefOr[StreamName]
    var StreamingStatus: js.UndefOr[StreamingStatus]
  }

  /**
    * Thrown if there are parallel requests to modify a resource.
    */
  @js.native
  trait ConcurrentModificationExceptionException extends js.Object {
    val message: String
  }

  /**
    * A collection of data for an identity pool. An identity pool can have multiple datasets. A dataset is per identity and can be general or associated with a particular entity in an application (like a saved game). Datasets are automatically created if they don't exist. Data is synced by dataset, and a dataset can hold up to 1MB of key-value pairs.
    */
  @js.native
  @Factory
  trait Dataset extends js.Object {
    var CreationDate: js.UndefOr[Date]
    var DataStorage: js.UndefOr[Double]
    var DatasetName: js.UndefOr[DatasetName]
    var IdentityId: js.UndefOr[IdentityId]
    var LastModifiedBy: js.UndefOr[String]
    var LastModifiedDate: js.UndefOr[Date]
    var NumRecords: js.UndefOr[Double]
  }

  /**
    * A request to delete the specific dataset.
    */
  @js.native
  @Factory
  trait DeleteDatasetRequest extends js.Object {
    var DatasetName: DatasetName
    var IdentityId: IdentityId
    var IdentityPoolId: IdentityPoolId
  }

  /**
    * Response to a successful DeleteDataset request.
    */
  @js.native
  @Factory
  trait DeleteDatasetResponse extends js.Object {
    var Dataset: js.UndefOr[Dataset]
  }

  /**
    * A request for meta data about a dataset (creation date, number of records, size) by owner and dataset name.
    */
  @js.native
  @Factory
  trait DescribeDatasetRequest extends js.Object {
    var DatasetName: DatasetName
    var IdentityId: IdentityId
    var IdentityPoolId: IdentityPoolId
  }

  /**
    * Response to a successful DescribeDataset request.
    */
  @js.native
  @Factory
  trait DescribeDatasetResponse extends js.Object {
    var Dataset: js.UndefOr[Dataset]
  }

  /**
    * A request for usage information about the identity pool.
    */
  @js.native
  @Factory
  trait DescribeIdentityPoolUsageRequest extends js.Object {
    var IdentityPoolId: IdentityPoolId
  }

  /**
    * Response to a successful DescribeIdentityPoolUsage request.
    */
  @js.native
  @Factory
  trait DescribeIdentityPoolUsageResponse extends js.Object {
    var IdentityPoolUsage: js.UndefOr[IdentityPoolUsage]
  }

  /**
    * A request for information about the usage of an identity pool.
    */
  @js.native
  @Factory
  trait DescribeIdentityUsageRequest extends js.Object {
    var IdentityId: IdentityId
    var IdentityPoolId: IdentityPoolId
  }

  /**
    * The response to a successful DescribeIdentityUsage request.
    */
  @js.native
  @Factory
  trait DescribeIdentityUsageResponse extends js.Object {
    var IdentityUsage: js.UndefOr[IdentityUsage]
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
  @Factory
  trait GetBulkPublishDetailsRequest extends js.Object {
    var IdentityPoolId: IdentityPoolId
  }

  /**
    * The output for the GetBulkPublishDetails operation.
    */
  @js.native
  @Factory
  trait GetBulkPublishDetailsResponse extends js.Object {
    var BulkPublishCompleteTime: js.UndefOr[Date]
    var BulkPublishStartTime: js.UndefOr[Date]
    var BulkPublishStatus: js.UndefOr[BulkPublishStatus]
    var FailureMessage: js.UndefOr[String]
    var IdentityPoolId: js.UndefOr[IdentityPoolId]
  }

  /**
    * A request for a list of the configured Cognito Events
    */
  @js.native
  @Factory
  trait GetCognitoEventsRequest extends js.Object {
    var IdentityPoolId: IdentityPoolId
  }

  /**
    * The response from the GetCognitoEvents request
    */
  @js.native
  @Factory
  trait GetCognitoEventsResponse extends js.Object {
    var Events: js.UndefOr[Events]
  }

  /**
    * The input for the GetIdentityPoolConfiguration operation.
    */
  @js.native
  @Factory
  trait GetIdentityPoolConfigurationRequest extends js.Object {
    var IdentityPoolId: IdentityPoolId
  }

  /**
    * The output for the GetIdentityPoolConfiguration operation.
    */
  @js.native
  @Factory
  trait GetIdentityPoolConfigurationResponse extends js.Object {
    var CognitoStreams: js.UndefOr[CognitoStreams]
    var IdentityPoolId: js.UndefOr[IdentityPoolId]
    var PushSync: js.UndefOr[PushSync]
  }

  /**
    * Usage information for the identity pool.
    */
  @js.native
  @Factory
  trait IdentityPoolUsage extends js.Object {
    var DataStorage: js.UndefOr[Double]
    var IdentityPoolId: js.UndefOr[IdentityPoolId]
    var LastModifiedDate: js.UndefOr[Date]
    var SyncSessionsCount: js.UndefOr[Double]
  }

  /**
    * Usage information for the identity.
    */
  @js.native
  @Factory
  trait IdentityUsage extends js.Object {
    var DataStorage: js.UndefOr[Double]
    var DatasetCount: js.UndefOr[Int]
    var IdentityId: js.UndefOr[IdentityId]
    var IdentityPoolId: js.UndefOr[IdentityPoolId]
    var LastModifiedDate: js.UndefOr[Date]
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
    * The AWS Lambda function returned invalid output or an exception.
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
    * AWS Lambda throttled your account, please contact AWS Support
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
  @Factory
  trait ListDatasetsRequest extends js.Object {
    var IdentityId: IdentityId
    var IdentityPoolId: IdentityPoolId
    var MaxResults: js.UndefOr[IntegerString]
    var NextToken: js.UndefOr[String]
  }

  /**
    * Returned for a successful ListDatasets request.
    */
  @js.native
  @Factory
  trait ListDatasetsResponse extends js.Object {
    var Count: js.UndefOr[Int]
    var Datasets: js.UndefOr[DatasetList]
    var NextToken: js.UndefOr[String]
  }

  /**
    * A request for usage information on an identity pool.
    */
  @js.native
  @Factory
  trait ListIdentityPoolUsageRequest extends js.Object {
    var MaxResults: js.UndefOr[IntegerString]
    var NextToken: js.UndefOr[String]
  }

  /**
    * Returned for a successful ListIdentityPoolUsage request.
    */
  @js.native
  @Factory
  trait ListIdentityPoolUsageResponse extends js.Object {
    var Count: js.UndefOr[Int]
    var IdentityPoolUsages: js.UndefOr[IdentityPoolUsageList]
    var MaxResults: js.UndefOr[Int]
    var NextToken: js.UndefOr[String]
  }

  /**
    * A request for a list of records.
    */
  @js.native
  @Factory
  trait ListRecordsRequest extends js.Object {
    var DatasetName: DatasetName
    var IdentityId: IdentityId
    var IdentityPoolId: IdentityPoolId
    var LastSyncCount: js.UndefOr[Double]
    var MaxResults: js.UndefOr[IntegerString]
    var NextToken: js.UndefOr[String]
    var SyncSessionToken: js.UndefOr[SyncSessionToken]
  }

  /**
    * Returned for a successful ListRecordsRequest.
    */
  @js.native
  @Factory
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

  /**
    * Thrown when a user is not authorized to access the requested resource.
    */
  @js.native
  trait NotAuthorizedExceptionException extends js.Object {
    val message: ExceptionMessage
  }

  @js.native
  sealed trait Operation extends js.Any
  object Operation extends js.Object {
    val replace = "replace".asInstanceOf[Operation]
    val remove  = "remove".asInstanceOf[Operation]

    val values = js.Object.freeze(js.Array(replace, remove))
  }

  @js.native
  sealed trait Platform extends js.Any
  object Platform extends js.Object {
    val APNS         = "APNS".asInstanceOf[Platform]
    val APNS_SANDBOX = "APNS_SANDBOX".asInstanceOf[Platform]
    val GCM          = "GCM".asInstanceOf[Platform]
    val ADM          = "ADM".asInstanceOf[Platform]

    val values = js.Object.freeze(js.Array(APNS, APNS_SANDBOX, GCM, ADM))
  }

  /**
    * Configuration options to be applied to the identity pool.
    */
  @js.native
  @Factory
  trait PushSync extends js.Object {
    var ApplicationArns: js.UndefOr[ApplicationArnList]
    var RoleArn: js.UndefOr[AssumeRoleArn]
  }

  /**
    * The basic data structure of a dataset.
    */
  @js.native
  @Factory
  trait Record extends js.Object {
    var DeviceLastModifiedDate: js.UndefOr[Date]
    var Key: js.UndefOr[RecordKey]
    var LastModifiedBy: js.UndefOr[String]
    var LastModifiedDate: js.UndefOr[Date]
    var SyncCount: js.UndefOr[Double]
    var Value: js.UndefOr[RecordValue]
  }

  /**
    * An update operation for a record.
    */
  @js.native
  @Factory
  trait RecordPatch extends js.Object {
    var Key: RecordKey
    var Op: Operation
    var SyncCount: Double
    var DeviceLastModifiedDate: js.UndefOr[Date]
    var Value: js.UndefOr[RecordValue]
  }

  /**
    * A request to RegisterDevice.
    */
  @js.native
  @Factory
  trait RegisterDeviceRequest extends js.Object {
    var IdentityId: IdentityId
    var IdentityPoolId: IdentityPoolId
    var Platform: Platform
    var Token: PushToken
  }

  /**
    * Response to a RegisterDevice request.
    */
  @js.native
  @Factory
  trait RegisterDeviceResponse extends js.Object {
    var DeviceId: js.UndefOr[DeviceId]
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
    * A request to configure Cognito Events"
    * "
    */
  @js.native
  @Factory
  trait SetCognitoEventsRequest extends js.Object {
    var Events: Events
    var IdentityPoolId: IdentityPoolId
  }

  /**
    * The input for the SetIdentityPoolConfiguration operation.
    */
  @js.native
  @Factory
  trait SetIdentityPoolConfigurationRequest extends js.Object {
    var IdentityPoolId: IdentityPoolId
    var CognitoStreams: js.UndefOr[CognitoStreams]
    var PushSync: js.UndefOr[PushSync]
  }

  /**
    * The output for the SetIdentityPoolConfiguration operation
    */
  @js.native
  @Factory
  trait SetIdentityPoolConfigurationResponse extends js.Object {
    var CognitoStreams: js.UndefOr[CognitoStreams]
    var IdentityPoolId: js.UndefOr[IdentityPoolId]
    var PushSync: js.UndefOr[PushSync]
  }

  @js.native
  sealed trait StreamingStatus extends js.Any
  object StreamingStatus extends js.Object {
    val ENABLED  = "ENABLED".asInstanceOf[StreamingStatus]
    val DISABLED = "DISABLED".asInstanceOf[StreamingStatus]

    val values = js.Object.freeze(js.Array(ENABLED, DISABLED))
  }

  /**
    * A request to SubscribeToDatasetRequest.
    */
  @js.native
  @Factory
  trait SubscribeToDatasetRequest extends js.Object {
    var DatasetName: DatasetName
    var DeviceId: DeviceId
    var IdentityId: IdentityId
    var IdentityPoolId: IdentityPoolId
  }

  /**
    * Response to a SubscribeToDataset request.
    */
  @js.native
  @Factory
  trait SubscribeToDatasetResponse extends js.Object {}

  /**
    * Thrown if the request is throttled.
    */
  @js.native
  trait TooManyRequestsExceptionException extends js.Object {
    val message: ExceptionMessage
  }

  /**
    * A request to UnsubscribeFromDataset.
    */
  @js.native
  @Factory
  trait UnsubscribeFromDatasetRequest extends js.Object {
    var DatasetName: DatasetName
    var DeviceId: DeviceId
    var IdentityId: IdentityId
    var IdentityPoolId: IdentityPoolId
  }

  /**
    * Response to an UnsubscribeFromDataset request.
    */
  @js.native
  @Factory
  trait UnsubscribeFromDatasetResponse extends js.Object {}

  /**
    * A request to post updates to records or add and delete records for a dataset and user.
    */
  @js.native
  @Factory
  trait UpdateRecordsRequest extends js.Object {
    var DatasetName: DatasetName
    var IdentityId: IdentityId
    var IdentityPoolId: IdentityPoolId
    var SyncSessionToken: SyncSessionToken
    var ClientContext: js.UndefOr[ClientContext]
    var DeviceId: js.UndefOr[DeviceId]
    var RecordPatches: js.UndefOr[RecordPatchList]
  }

  /**
    * Returned for a successful UpdateRecordsRequest.
    */
  @js.native
  @Factory
  trait UpdateRecordsResponse extends js.Object {
    var Records: js.UndefOr[RecordList]
  }
}
