package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import io.scalajs.nodejs
import facade.amazonaws._

package object cognitosync {
  type ApplicationArn        = String
  type ApplicationArnList    = js.Array[ApplicationArn]
  type AssumeRoleArn         = String
  type BulkPublishStatus     = String
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
  type Operation             = String
  type Platform              = String
  type PushToken             = String
  type RecordKey             = String
  type RecordList            = js.Array[Record]
  type RecordPatchList       = js.Array[RecordPatch]
  type RecordValue           = String
  type StreamName            = String
  type StreamingStatus       = String
  type SyncSessionToken      = String

  implicit final class CognitoSyncOps(private val service: CognitoSync) extends AnyVal {

    def bulkPublishFuture(params: BulkPublishRequest): Future[BulkPublishResponse] =
      service.bulkPublish(params).promise.toFuture
    def deleteDatasetFuture(params: DeleteDatasetRequest): Future[DeleteDatasetResponse] =
      service.deleteDataset(params).promise.toFuture
    def describeDatasetFuture(params: DescribeDatasetRequest): Future[DescribeDatasetResponse] =
      service.describeDataset(params).promise.toFuture
    def describeIdentityPoolUsageFuture(
        params: DescribeIdentityPoolUsageRequest
    ): Future[DescribeIdentityPoolUsageResponse] = service.describeIdentityPoolUsage(params).promise.toFuture
    def describeIdentityUsageFuture(params: DescribeIdentityUsageRequest): Future[DescribeIdentityUsageResponse] =
      service.describeIdentityUsage(params).promise.toFuture
    def getBulkPublishDetailsFuture(params: GetBulkPublishDetailsRequest): Future[GetBulkPublishDetailsResponse] =
      service.getBulkPublishDetails(params).promise.toFuture
    def getCognitoEventsFuture(params: GetCognitoEventsRequest): Future[GetCognitoEventsResponse] =
      service.getCognitoEvents(params).promise.toFuture
    def getIdentityPoolConfigurationFuture(
        params: GetIdentityPoolConfigurationRequest
    ): Future[GetIdentityPoolConfigurationResponse] = service.getIdentityPoolConfiguration(params).promise.toFuture
    def listDatasetsFuture(params: ListDatasetsRequest): Future[ListDatasetsResponse] =
      service.listDatasets(params).promise.toFuture
    def listIdentityPoolUsageFuture(params: ListIdentityPoolUsageRequest): Future[ListIdentityPoolUsageResponse] =
      service.listIdentityPoolUsage(params).promise.toFuture
    def listRecordsFuture(params: ListRecordsRequest): Future[ListRecordsResponse] =
      service.listRecords(params).promise.toFuture
    def registerDeviceFuture(params: RegisterDeviceRequest): Future[RegisterDeviceResponse] =
      service.registerDevice(params).promise.toFuture
    def setCognitoEventsFuture(params: SetCognitoEventsRequest): Future[js.Object] =
      service.setCognitoEvents(params).promise.toFuture
    def setIdentityPoolConfigurationFuture(
        params: SetIdentityPoolConfigurationRequest
    ): Future[SetIdentityPoolConfigurationResponse] = service.setIdentityPoolConfiguration(params).promise.toFuture
    def subscribeToDatasetFuture(params: SubscribeToDatasetRequest): Future[SubscribeToDatasetResponse] =
      service.subscribeToDataset(params).promise.toFuture
    def unsubscribeFromDatasetFuture(params: UnsubscribeFromDatasetRequest): Future[UnsubscribeFromDatasetResponse] =
      service.unsubscribeFromDataset(params).promise.toFuture
    def updateRecordsFuture(params: UpdateRecordsRequest): Future[UpdateRecordsResponse] =
      service.updateRecords(params).promise.toFuture
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
  trait BulkPublishRequest extends js.Object {
    var IdentityPoolId: IdentityPoolId
  }

  object BulkPublishRequest {
    def apply(
        IdentityPoolId: IdentityPoolId
    ): BulkPublishRequest = {
      val __obj = js.Dictionary[js.Any](
        "IdentityPoolId" -> IdentityPoolId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[BulkPublishRequest]
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
        IdentityPoolId: js.UndefOr[IdentityPoolId] = js.undefined
    ): BulkPublishResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      IdentityPoolId.foreach(__v => __obj.update("IdentityPoolId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BulkPublishResponse]
    }
  }

  object BulkPublishStatusEnum {
    val NOT_STARTED = "NOT_STARTED"
    val IN_PROGRESS = "IN_PROGRESS"
    val FAILED      = "FAILED"
    val SUCCEEDED   = "SUCCEEDED"

    val values = js.Object.freeze(js.Array(NOT_STARTED, IN_PROGRESS, FAILED, SUCCEEDED))
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
        StreamingStatus: js.UndefOr[StreamingStatus] = js.undefined
    ): CognitoStreams = {
      val __obj = js.Dictionary.empty[js.Any]
      RoleArn.foreach(__v => __obj.update("RoleArn", __v.asInstanceOf[js.Any]))
      StreamName.foreach(__v => __obj.update("StreamName", __v.asInstanceOf[js.Any]))
      StreamingStatus.foreach(__v => __obj.update("StreamingStatus", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CognitoStreams]
    }
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
        NumRecords: js.UndefOr[Double] = js.undefined
    ): Dataset = {
      val __obj = js.Dictionary.empty[js.Any]
      CreationDate.foreach(__v => __obj.update("CreationDate", __v.asInstanceOf[js.Any]))
      DataStorage.foreach(__v => __obj.update("DataStorage", __v.asInstanceOf[js.Any]))
      DatasetName.foreach(__v => __obj.update("DatasetName", __v.asInstanceOf[js.Any]))
      IdentityId.foreach(__v => __obj.update("IdentityId", __v.asInstanceOf[js.Any]))
      LastModifiedBy.foreach(__v => __obj.update("LastModifiedBy", __v.asInstanceOf[js.Any]))
      LastModifiedDate.foreach(__v => __obj.update("LastModifiedDate", __v.asInstanceOf[js.Any]))
      NumRecords.foreach(__v => __obj.update("NumRecords", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Dataset]
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
        IdentityPoolId: IdentityPoolId
    ): DeleteDatasetRequest = {
      val __obj = js.Dictionary[js.Any](
        "DatasetName"    -> DatasetName.asInstanceOf[js.Any],
        "IdentityId"     -> IdentityId.asInstanceOf[js.Any],
        "IdentityPoolId" -> IdentityPoolId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteDatasetRequest]
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
        Dataset: js.UndefOr[Dataset] = js.undefined
    ): DeleteDatasetResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Dataset.foreach(__v => __obj.update("Dataset", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteDatasetResponse]
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
        IdentityPoolId: IdentityPoolId
    ): DescribeDatasetRequest = {
      val __obj = js.Dictionary[js.Any](
        "DatasetName"    -> DatasetName.asInstanceOf[js.Any],
        "IdentityId"     -> IdentityId.asInstanceOf[js.Any],
        "IdentityPoolId" -> IdentityPoolId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeDatasetRequest]
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
        Dataset: js.UndefOr[Dataset] = js.undefined
    ): DescribeDatasetResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Dataset.foreach(__v => __obj.update("Dataset", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeDatasetResponse]
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
        IdentityPoolId: IdentityPoolId
    ): DescribeIdentityPoolUsageRequest = {
      val __obj = js.Dictionary[js.Any](
        "IdentityPoolId" -> IdentityPoolId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeIdentityPoolUsageRequest]
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
        IdentityPoolUsage: js.UndefOr[IdentityPoolUsage] = js.undefined
    ): DescribeIdentityPoolUsageResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      IdentityPoolUsage.foreach(__v => __obj.update("IdentityPoolUsage", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeIdentityPoolUsageResponse]
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
        IdentityPoolId: IdentityPoolId
    ): DescribeIdentityUsageRequest = {
      val __obj = js.Dictionary[js.Any](
        "IdentityId"     -> IdentityId.asInstanceOf[js.Any],
        "IdentityPoolId" -> IdentityPoolId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeIdentityUsageRequest]
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
        IdentityUsage: js.UndefOr[IdentityUsage] = js.undefined
    ): DescribeIdentityUsageResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      IdentityUsage.foreach(__v => __obj.update("IdentityUsage", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeIdentityUsageResponse]
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
        IdentityPoolId: IdentityPoolId
    ): GetBulkPublishDetailsRequest = {
      val __obj = js.Dictionary[js.Any](
        "IdentityPoolId" -> IdentityPoolId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetBulkPublishDetailsRequest]
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
        IdentityPoolId: js.UndefOr[IdentityPoolId] = js.undefined
    ): GetBulkPublishDetailsResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      BulkPublishCompleteTime.foreach(__v => __obj.update("BulkPublishCompleteTime", __v.asInstanceOf[js.Any]))
      BulkPublishStartTime.foreach(__v => __obj.update("BulkPublishStartTime", __v.asInstanceOf[js.Any]))
      BulkPublishStatus.foreach(__v => __obj.update("BulkPublishStatus", __v.asInstanceOf[js.Any]))
      FailureMessage.foreach(__v => __obj.update("FailureMessage", __v.asInstanceOf[js.Any]))
      IdentityPoolId.foreach(__v => __obj.update("IdentityPoolId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetBulkPublishDetailsResponse]
    }
  }

  /**
    * A request for a list of the configured Cognito Events
    */
  @js.native
  trait GetCognitoEventsRequest extends js.Object {
    var IdentityPoolId: IdentityPoolId
  }

  object GetCognitoEventsRequest {
    def apply(
        IdentityPoolId: IdentityPoolId
    ): GetCognitoEventsRequest = {
      val __obj = js.Dictionary[js.Any](
        "IdentityPoolId" -> IdentityPoolId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetCognitoEventsRequest]
    }
  }

  /**
    * The response from the GetCognitoEvents request
    */
  @js.native
  trait GetCognitoEventsResponse extends js.Object {
    var Events: js.UndefOr[Events]
  }

  object GetCognitoEventsResponse {
    def apply(
        Events: js.UndefOr[Events] = js.undefined
    ): GetCognitoEventsResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Events.foreach(__v => __obj.update("Events", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetCognitoEventsResponse]
    }
  }

  /**
    * The input for the GetIdentityPoolConfiguration operation.
    */
  @js.native
  trait GetIdentityPoolConfigurationRequest extends js.Object {
    var IdentityPoolId: IdentityPoolId
  }

  object GetIdentityPoolConfigurationRequest {
    def apply(
        IdentityPoolId: IdentityPoolId
    ): GetIdentityPoolConfigurationRequest = {
      val __obj = js.Dictionary[js.Any](
        "IdentityPoolId" -> IdentityPoolId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetIdentityPoolConfigurationRequest]
    }
  }

  /**
    * The output for the GetIdentityPoolConfiguration operation.
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
        PushSync: js.UndefOr[PushSync] = js.undefined
    ): GetIdentityPoolConfigurationResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      CognitoStreams.foreach(__v => __obj.update("CognitoStreams", __v.asInstanceOf[js.Any]))
      IdentityPoolId.foreach(__v => __obj.update("IdentityPoolId", __v.asInstanceOf[js.Any]))
      PushSync.foreach(__v => __obj.update("PushSync", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetIdentityPoolConfigurationResponse]
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
        SyncSessionsCount: js.UndefOr[Double] = js.undefined
    ): IdentityPoolUsage = {
      val __obj = js.Dictionary.empty[js.Any]
      DataStorage.foreach(__v => __obj.update("DataStorage", __v.asInstanceOf[js.Any]))
      IdentityPoolId.foreach(__v => __obj.update("IdentityPoolId", __v.asInstanceOf[js.Any]))
      LastModifiedDate.foreach(__v => __obj.update("LastModifiedDate", __v.asInstanceOf[js.Any]))
      SyncSessionsCount.foreach(__v => __obj.update("SyncSessionsCount", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[IdentityPoolUsage]
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
        LastModifiedDate: js.UndefOr[Date] = js.undefined
    ): IdentityUsage = {
      val __obj = js.Dictionary.empty[js.Any]
      DataStorage.foreach(__v => __obj.update("DataStorage", __v.asInstanceOf[js.Any]))
      DatasetCount.foreach(__v => __obj.update("DatasetCount", __v.asInstanceOf[js.Any]))
      IdentityId.foreach(__v => __obj.update("IdentityId", __v.asInstanceOf[js.Any]))
      IdentityPoolId.foreach(__v => __obj.update("IdentityPoolId", __v.asInstanceOf[js.Any]))
      LastModifiedDate.foreach(__v => __obj.update("LastModifiedDate", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[IdentityUsage]
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
        NextToken: js.UndefOr[String] = js.undefined
    ): ListDatasetsRequest = {
      val __obj = js.Dictionary[js.Any](
        "IdentityId"     -> IdentityId.asInstanceOf[js.Any],
        "IdentityPoolId" -> IdentityPoolId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDatasetsRequest]
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
        NextToken: js.UndefOr[String] = js.undefined
    ): ListDatasetsResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Count.foreach(__v => __obj.update("Count", __v.asInstanceOf[js.Any]))
      Datasets.foreach(__v => __obj.update("Datasets", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDatasetsResponse]
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
        NextToken: js.UndefOr[String] = js.undefined
    ): ListIdentityPoolUsageRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListIdentityPoolUsageRequest]
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
        NextToken: js.UndefOr[String] = js.undefined
    ): ListIdentityPoolUsageResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Count.foreach(__v => __obj.update("Count", __v.asInstanceOf[js.Any]))
      IdentityPoolUsages.foreach(__v => __obj.update("IdentityPoolUsages", __v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListIdentityPoolUsageResponse]
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
        SyncSessionToken: js.UndefOr[SyncSessionToken] = js.undefined
    ): ListRecordsRequest = {
      val __obj = js.Dictionary[js.Any](
        "DatasetName"    -> DatasetName.asInstanceOf[js.Any],
        "IdentityId"     -> IdentityId.asInstanceOf[js.Any],
        "IdentityPoolId" -> IdentityPoolId.asInstanceOf[js.Any]
      )

      LastSyncCount.foreach(__v => __obj.update("LastSyncCount", __v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      SyncSessionToken.foreach(__v => __obj.update("SyncSessionToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListRecordsRequest]
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
        SyncSessionToken: js.UndefOr[String] = js.undefined
    ): ListRecordsResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Count.foreach(__v => __obj.update("Count", __v.asInstanceOf[js.Any]))
      DatasetDeletedAfterRequestedSyncCount.foreach(
        __v => __obj.update("DatasetDeletedAfterRequestedSyncCount", __v.asInstanceOf[js.Any])
      )
      DatasetExists.foreach(__v => __obj.update("DatasetExists", __v.asInstanceOf[js.Any]))
      DatasetSyncCount.foreach(__v => __obj.update("DatasetSyncCount", __v.asInstanceOf[js.Any]))
      LastModifiedBy.foreach(__v => __obj.update("LastModifiedBy", __v.asInstanceOf[js.Any]))
      MergedDatasetNames.foreach(__v => __obj.update("MergedDatasetNames", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      Records.foreach(__v => __obj.update("Records", __v.asInstanceOf[js.Any]))
      SyncSessionToken.foreach(__v => __obj.update("SyncSessionToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListRecordsResponse]
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
    val remove  = "remove"

    val values = js.Object.freeze(js.Array(replace, remove))
  }

  object PlatformEnum {
    val APNS         = "APNS"
    val APNS_SANDBOX = "APNS_SANDBOX"
    val GCM          = "GCM"
    val ADM          = "ADM"

    val values = js.Object.freeze(js.Array(APNS, APNS_SANDBOX, GCM, ADM))
  }

  /**
    * Configuration options to be applied to the identity pool.
    */
  @js.native
  trait PushSync extends js.Object {
    var ApplicationArns: js.UndefOr[ApplicationArnList]
    var RoleArn: js.UndefOr[AssumeRoleArn]
  }

  object PushSync {
    def apply(
        ApplicationArns: js.UndefOr[ApplicationArnList] = js.undefined,
        RoleArn: js.UndefOr[AssumeRoleArn] = js.undefined
    ): PushSync = {
      val __obj = js.Dictionary.empty[js.Any]
      ApplicationArns.foreach(__v => __obj.update("ApplicationArns", __v.asInstanceOf[js.Any]))
      RoleArn.foreach(__v => __obj.update("RoleArn", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PushSync]
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
        Value: js.UndefOr[RecordValue] = js.undefined
    ): Record = {
      val __obj = js.Dictionary.empty[js.Any]
      DeviceLastModifiedDate.foreach(__v => __obj.update("DeviceLastModifiedDate", __v.asInstanceOf[js.Any]))
      Key.foreach(__v => __obj.update("Key", __v.asInstanceOf[js.Any]))
      LastModifiedBy.foreach(__v => __obj.update("LastModifiedBy", __v.asInstanceOf[js.Any]))
      LastModifiedDate.foreach(__v => __obj.update("LastModifiedDate", __v.asInstanceOf[js.Any]))
      SyncCount.foreach(__v => __obj.update("SyncCount", __v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.update("Value", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Record]
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
        Value: js.UndefOr[RecordValue] = js.undefined
    ): RecordPatch = {
      val __obj = js.Dictionary[js.Any](
        "Key"       -> Key.asInstanceOf[js.Any],
        "Op"        -> Op.asInstanceOf[js.Any],
        "SyncCount" -> SyncCount.asInstanceOf[js.Any]
      )

      DeviceLastModifiedDate.foreach(__v => __obj.update("DeviceLastModifiedDate", __v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.update("Value", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RecordPatch]
    }
  }

  /**
    * A request to RegisterDevice.
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
        Token: PushToken
    ): RegisterDeviceRequest = {
      val __obj = js.Dictionary[js.Any](
        "IdentityId"     -> IdentityId.asInstanceOf[js.Any],
        "IdentityPoolId" -> IdentityPoolId.asInstanceOf[js.Any],
        "Platform"       -> Platform.asInstanceOf[js.Any],
        "Token"          -> Token.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[RegisterDeviceRequest]
    }
  }

  /**
    * Response to a RegisterDevice request.
    */
  @js.native
  trait RegisterDeviceResponse extends js.Object {
    var DeviceId: js.UndefOr[DeviceId]
  }

  object RegisterDeviceResponse {
    def apply(
        DeviceId: js.UndefOr[DeviceId] = js.undefined
    ): RegisterDeviceResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      DeviceId.foreach(__v => __obj.update("DeviceId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RegisterDeviceResponse]
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
    * A request to configure Cognito Events"
    * "
    */
  @js.native
  trait SetCognitoEventsRequest extends js.Object {
    var Events: Events
    var IdentityPoolId: IdentityPoolId
  }

  object SetCognitoEventsRequest {
    def apply(
        Events: Events,
        IdentityPoolId: IdentityPoolId
    ): SetCognitoEventsRequest = {
      val __obj = js.Dictionary[js.Any](
        "Events"         -> Events.asInstanceOf[js.Any],
        "IdentityPoolId" -> IdentityPoolId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[SetCognitoEventsRequest]
    }
  }

  /**
    * The input for the SetIdentityPoolConfiguration operation.
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
        PushSync: js.UndefOr[PushSync] = js.undefined
    ): SetIdentityPoolConfigurationRequest = {
      val __obj = js.Dictionary[js.Any](
        "IdentityPoolId" -> IdentityPoolId.asInstanceOf[js.Any]
      )

      CognitoStreams.foreach(__v => __obj.update("CognitoStreams", __v.asInstanceOf[js.Any]))
      PushSync.foreach(__v => __obj.update("PushSync", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SetIdentityPoolConfigurationRequest]
    }
  }

  /**
    * The output for the SetIdentityPoolConfiguration operation
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
        PushSync: js.UndefOr[PushSync] = js.undefined
    ): SetIdentityPoolConfigurationResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      CognitoStreams.foreach(__v => __obj.update("CognitoStreams", __v.asInstanceOf[js.Any]))
      IdentityPoolId.foreach(__v => __obj.update("IdentityPoolId", __v.asInstanceOf[js.Any]))
      PushSync.foreach(__v => __obj.update("PushSync", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SetIdentityPoolConfigurationResponse]
    }
  }

  object StreamingStatusEnum {
    val ENABLED  = "ENABLED"
    val DISABLED = "DISABLED"

    val values = js.Object.freeze(js.Array(ENABLED, DISABLED))
  }

  /**
    * A request to SubscribeToDatasetRequest.
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
        IdentityPoolId: IdentityPoolId
    ): SubscribeToDatasetRequest = {
      val __obj = js.Dictionary[js.Any](
        "DatasetName"    -> DatasetName.asInstanceOf[js.Any],
        "DeviceId"       -> DeviceId.asInstanceOf[js.Any],
        "IdentityId"     -> IdentityId.asInstanceOf[js.Any],
        "IdentityPoolId" -> IdentityPoolId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[SubscribeToDatasetRequest]
    }
  }

  /**
    * Response to a SubscribeToDataset request.
    */
  @js.native
  trait SubscribeToDatasetResponse extends js.Object {}

  object SubscribeToDatasetResponse {
    def apply(
        ): SubscribeToDatasetResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[SubscribeToDatasetResponse]
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
    * A request to UnsubscribeFromDataset.
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
        IdentityPoolId: IdentityPoolId
    ): UnsubscribeFromDatasetRequest = {
      val __obj = js.Dictionary[js.Any](
        "DatasetName"    -> DatasetName.asInstanceOf[js.Any],
        "DeviceId"       -> DeviceId.asInstanceOf[js.Any],
        "IdentityId"     -> IdentityId.asInstanceOf[js.Any],
        "IdentityPoolId" -> IdentityPoolId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UnsubscribeFromDatasetRequest]
    }
  }

  /**
    * Response to an UnsubscribeFromDataset request.
    */
  @js.native
  trait UnsubscribeFromDatasetResponse extends js.Object {}

  object UnsubscribeFromDatasetResponse {
    def apply(
        ): UnsubscribeFromDatasetResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[UnsubscribeFromDatasetResponse]
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
        RecordPatches: js.UndefOr[RecordPatchList] = js.undefined
    ): UpdateRecordsRequest = {
      val __obj = js.Dictionary[js.Any](
        "DatasetName"      -> DatasetName.asInstanceOf[js.Any],
        "IdentityId"       -> IdentityId.asInstanceOf[js.Any],
        "IdentityPoolId"   -> IdentityPoolId.asInstanceOf[js.Any],
        "SyncSessionToken" -> SyncSessionToken.asInstanceOf[js.Any]
      )

      ClientContext.foreach(__v => __obj.update("ClientContext", __v.asInstanceOf[js.Any]))
      DeviceId.foreach(__v => __obj.update("DeviceId", __v.asInstanceOf[js.Any]))
      RecordPatches.foreach(__v => __obj.update("RecordPatches", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateRecordsRequest]
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
        Records: js.UndefOr[RecordList] = js.undefined
    ): UpdateRecordsResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Records.foreach(__v => __obj.update("Records", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateRecordsResponse]
    }
  }
}
