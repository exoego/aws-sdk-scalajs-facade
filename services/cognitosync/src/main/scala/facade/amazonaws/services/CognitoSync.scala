package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

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
      service.bulkPublish(params).promise.toFuture
    @inline def deleteDatasetFuture(params: DeleteDatasetRequest): Future[DeleteDatasetResponse] =
      service.deleteDataset(params).promise.toFuture
    @inline def describeDatasetFuture(params: DescribeDatasetRequest): Future[DescribeDatasetResponse] =
      service.describeDataset(params).promise.toFuture
    @inline def describeIdentityPoolUsageFuture(
        params: DescribeIdentityPoolUsageRequest
    ): Future[DescribeIdentityPoolUsageResponse] = service.describeIdentityPoolUsage(params).promise.toFuture
    @inline def describeIdentityUsageFuture(
        params: DescribeIdentityUsageRequest
    ): Future[DescribeIdentityUsageResponse] = service.describeIdentityUsage(params).promise.toFuture
    @inline def getBulkPublishDetailsFuture(
        params: GetBulkPublishDetailsRequest
    ): Future[GetBulkPublishDetailsResponse] = service.getBulkPublishDetails(params).promise.toFuture
    @inline def getCognitoEventsFuture(params: GetCognitoEventsRequest): Future[GetCognitoEventsResponse] =
      service.getCognitoEvents(params).promise.toFuture
    @inline def getIdentityPoolConfigurationFuture(
        params: GetIdentityPoolConfigurationRequest
    ): Future[GetIdentityPoolConfigurationResponse] = service.getIdentityPoolConfiguration(params).promise.toFuture
    @inline def listDatasetsFuture(params: ListDatasetsRequest): Future[ListDatasetsResponse] =
      service.listDatasets(params).promise.toFuture
    @inline def listIdentityPoolUsageFuture(
        params: ListIdentityPoolUsageRequest
    ): Future[ListIdentityPoolUsageResponse] = service.listIdentityPoolUsage(params).promise.toFuture
    @inline def listRecordsFuture(params: ListRecordsRequest): Future[ListRecordsResponse] =
      service.listRecords(params).promise.toFuture
    @inline def registerDeviceFuture(params: RegisterDeviceRequest): Future[RegisterDeviceResponse] =
      service.registerDevice(params).promise.toFuture
    @inline def setCognitoEventsFuture(params: SetCognitoEventsRequest): Future[js.Object] =
      service.setCognitoEvents(params).promise.toFuture
    @inline def setIdentityPoolConfigurationFuture(
        params: SetIdentityPoolConfigurationRequest
    ): Future[SetIdentityPoolConfigurationResponse] = service.setIdentityPoolConfiguration(params).promise.toFuture
    @inline def subscribeToDatasetFuture(params: SubscribeToDatasetRequest): Future[SubscribeToDatasetResponse] =
      service.subscribeToDataset(params).promise.toFuture
    @inline def unsubscribeFromDatasetFuture(
        params: UnsubscribeFromDatasetRequest
    ): Future[UnsubscribeFromDatasetResponse] = service.unsubscribeFromDataset(params).promise.toFuture
    @inline def updateRecordsFuture(params: UpdateRecordsRequest): Future[UpdateRecordsResponse] =
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
    @inline
    def apply(
        IdentityPoolId: IdentityPoolId
    ): BulkPublishRequest = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        IdentityPoolId: js.UndefOr[IdentityPoolId] = js.undefined
    ): BulkPublishResponse = {
      val __obj = js.Dynamic.literal()
      IdentityPoolId.foreach(__v => __obj.updateDynamic("IdentityPoolId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BulkPublishResponse]
    }
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
  trait CognitoStreams extends js.Object {
    var RoleArn: js.UndefOr[AssumeRoleArn]
    var StreamName: js.UndefOr[StreamName]
    var StreamingStatus: js.UndefOr[StreamingStatus]
  }

  object CognitoStreams {
    @inline
    def apply(
        RoleArn: js.UndefOr[AssumeRoleArn] = js.undefined,
        StreamName: js.UndefOr[StreamName] = js.undefined,
        StreamingStatus: js.UndefOr[StreamingStatus] = js.undefined
    ): CognitoStreams = {
      val __obj = js.Dynamic.literal()
      RoleArn.foreach(__v => __obj.updateDynamic("RoleArn")(__v.asInstanceOf[js.Any]))
      StreamName.foreach(__v => __obj.updateDynamic("StreamName")(__v.asInstanceOf[js.Any]))
      StreamingStatus.foreach(__v => __obj.updateDynamic("StreamingStatus")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        CreationDate: js.UndefOr[Date] = js.undefined,
        DataStorage: js.UndefOr[Double] = js.undefined,
        DatasetName: js.UndefOr[DatasetName] = js.undefined,
        IdentityId: js.UndefOr[IdentityId] = js.undefined,
        LastModifiedBy: js.UndefOr[String] = js.undefined,
        LastModifiedDate: js.UndefOr[Date] = js.undefined,
        NumRecords: js.UndefOr[Double] = js.undefined
    ): Dataset = {
      val __obj = js.Dynamic.literal()
      CreationDate.foreach(__v => __obj.updateDynamic("CreationDate")(__v.asInstanceOf[js.Any]))
      DataStorage.foreach(__v => __obj.updateDynamic("DataStorage")(__v.asInstanceOf[js.Any]))
      DatasetName.foreach(__v => __obj.updateDynamic("DatasetName")(__v.asInstanceOf[js.Any]))
      IdentityId.foreach(__v => __obj.updateDynamic("IdentityId")(__v.asInstanceOf[js.Any]))
      LastModifiedBy.foreach(__v => __obj.updateDynamic("LastModifiedBy")(__v.asInstanceOf[js.Any]))
      LastModifiedDate.foreach(__v => __obj.updateDynamic("LastModifiedDate")(__v.asInstanceOf[js.Any]))
      NumRecords.foreach(__v => __obj.updateDynamic("NumRecords")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        DatasetName: DatasetName,
        IdentityId: IdentityId,
        IdentityPoolId: IdentityPoolId
    ): DeleteDatasetRequest = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        Dataset: js.UndefOr[Dataset] = js.undefined
    ): DeleteDatasetResponse = {
      val __obj = js.Dynamic.literal()
      Dataset.foreach(__v => __obj.updateDynamic("Dataset")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        DatasetName: DatasetName,
        IdentityId: IdentityId,
        IdentityPoolId: IdentityPoolId
    ): DescribeDatasetRequest = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        Dataset: js.UndefOr[Dataset] = js.undefined
    ): DescribeDatasetResponse = {
      val __obj = js.Dynamic.literal()
      Dataset.foreach(__v => __obj.updateDynamic("Dataset")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        IdentityPoolId: IdentityPoolId
    ): DescribeIdentityPoolUsageRequest = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        IdentityPoolUsage: js.UndefOr[IdentityPoolUsage] = js.undefined
    ): DescribeIdentityPoolUsageResponse = {
      val __obj = js.Dynamic.literal()
      IdentityPoolUsage.foreach(__v => __obj.updateDynamic("IdentityPoolUsage")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        IdentityId: IdentityId,
        IdentityPoolId: IdentityPoolId
    ): DescribeIdentityUsageRequest = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        IdentityUsage: js.UndefOr[IdentityUsage] = js.undefined
    ): DescribeIdentityUsageResponse = {
      val __obj = js.Dynamic.literal()
      IdentityUsage.foreach(__v => __obj.updateDynamic("IdentityUsage")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        IdentityPoolId: IdentityPoolId
    ): GetBulkPublishDetailsRequest = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        BulkPublishCompleteTime: js.UndefOr[Date] = js.undefined,
        BulkPublishStartTime: js.UndefOr[Date] = js.undefined,
        BulkPublishStatus: js.UndefOr[BulkPublishStatus] = js.undefined,
        FailureMessage: js.UndefOr[String] = js.undefined,
        IdentityPoolId: js.UndefOr[IdentityPoolId] = js.undefined
    ): GetBulkPublishDetailsResponse = {
      val __obj = js.Dynamic.literal()
      BulkPublishCompleteTime.foreach(__v => __obj.updateDynamic("BulkPublishCompleteTime")(__v.asInstanceOf[js.Any]))
      BulkPublishStartTime.foreach(__v => __obj.updateDynamic("BulkPublishStartTime")(__v.asInstanceOf[js.Any]))
      BulkPublishStatus.foreach(__v => __obj.updateDynamic("BulkPublishStatus")(__v.asInstanceOf[js.Any]))
      FailureMessage.foreach(__v => __obj.updateDynamic("FailureMessage")(__v.asInstanceOf[js.Any]))
      IdentityPoolId.foreach(__v => __obj.updateDynamic("IdentityPoolId")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        IdentityPoolId: IdentityPoolId
    ): GetCognitoEventsRequest = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        Events: js.UndefOr[Events] = js.undefined
    ): GetCognitoEventsResponse = {
      val __obj = js.Dynamic.literal()
      Events.foreach(__v => __obj.updateDynamic("Events")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        IdentityPoolId: IdentityPoolId
    ): GetIdentityPoolConfigurationRequest = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        CognitoStreams: js.UndefOr[CognitoStreams] = js.undefined,
        IdentityPoolId: js.UndefOr[IdentityPoolId] = js.undefined,
        PushSync: js.UndefOr[PushSync] = js.undefined
    ): GetIdentityPoolConfigurationResponse = {
      val __obj = js.Dynamic.literal()
      CognitoStreams.foreach(__v => __obj.updateDynamic("CognitoStreams")(__v.asInstanceOf[js.Any]))
      IdentityPoolId.foreach(__v => __obj.updateDynamic("IdentityPoolId")(__v.asInstanceOf[js.Any]))
      PushSync.foreach(__v => __obj.updateDynamic("PushSync")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        DataStorage: js.UndefOr[Double] = js.undefined,
        IdentityPoolId: js.UndefOr[IdentityPoolId] = js.undefined,
        LastModifiedDate: js.UndefOr[Date] = js.undefined,
        SyncSessionsCount: js.UndefOr[Double] = js.undefined
    ): IdentityPoolUsage = {
      val __obj = js.Dynamic.literal()
      DataStorage.foreach(__v => __obj.updateDynamic("DataStorage")(__v.asInstanceOf[js.Any]))
      IdentityPoolId.foreach(__v => __obj.updateDynamic("IdentityPoolId")(__v.asInstanceOf[js.Any]))
      LastModifiedDate.foreach(__v => __obj.updateDynamic("LastModifiedDate")(__v.asInstanceOf[js.Any]))
      SyncSessionsCount.foreach(__v => __obj.updateDynamic("SyncSessionsCount")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        DataStorage: js.UndefOr[Double] = js.undefined,
        DatasetCount: js.UndefOr[Int] = js.undefined,
        IdentityId: js.UndefOr[IdentityId] = js.undefined,
        IdentityPoolId: js.UndefOr[IdentityPoolId] = js.undefined,
        LastModifiedDate: js.UndefOr[Date] = js.undefined
    ): IdentityUsage = {
      val __obj = js.Dynamic.literal()
      DataStorage.foreach(__v => __obj.updateDynamic("DataStorage")(__v.asInstanceOf[js.Any]))
      DatasetCount.foreach(__v => __obj.updateDynamic("DatasetCount")(__v.asInstanceOf[js.Any]))
      IdentityId.foreach(__v => __obj.updateDynamic("IdentityId")(__v.asInstanceOf[js.Any]))
      IdentityPoolId.foreach(__v => __obj.updateDynamic("IdentityPoolId")(__v.asInstanceOf[js.Any]))
      LastModifiedDate.foreach(__v => __obj.updateDynamic("LastModifiedDate")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        IdentityId: IdentityId,
        IdentityPoolId: IdentityPoolId,
        MaxResults: js.UndefOr[IntegerString] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListDatasetsRequest = {
      val __obj = js.Dynamic.literal(
        "IdentityId"     -> IdentityId.asInstanceOf[js.Any],
        "IdentityPoolId" -> IdentityPoolId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        Count: js.UndefOr[Int] = js.undefined,
        Datasets: js.UndefOr[DatasetList] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListDatasetsResponse = {
      val __obj = js.Dynamic.literal()
      Count.foreach(__v => __obj.updateDynamic("Count")(__v.asInstanceOf[js.Any]))
      Datasets.foreach(__v => __obj.updateDynamic("Datasets")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        MaxResults: js.UndefOr[IntegerString] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListIdentityPoolUsageRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        Count: js.UndefOr[Int] = js.undefined,
        IdentityPoolUsages: js.UndefOr[IdentityPoolUsageList] = js.undefined,
        MaxResults: js.UndefOr[Int] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListIdentityPoolUsageResponse = {
      val __obj = js.Dynamic.literal()
      Count.foreach(__v => __obj.updateDynamic("Count")(__v.asInstanceOf[js.Any]))
      IdentityPoolUsages.foreach(__v => __obj.updateDynamic("IdentityPoolUsages")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        DatasetName: DatasetName,
        IdentityId: IdentityId,
        IdentityPoolId: IdentityPoolId,
        LastSyncCount: js.UndefOr[Double] = js.undefined,
        MaxResults: js.UndefOr[IntegerString] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined,
        SyncSessionToken: js.UndefOr[SyncSessionToken] = js.undefined
    ): ListRecordsRequest = {
      val __obj = js.Dynamic.literal(
        "DatasetName"    -> DatasetName.asInstanceOf[js.Any],
        "IdentityId"     -> IdentityId.asInstanceOf[js.Any],
        "IdentityPoolId" -> IdentityPoolId.asInstanceOf[js.Any]
      )

      LastSyncCount.foreach(__v => __obj.updateDynamic("LastSyncCount")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      SyncSessionToken.foreach(__v => __obj.updateDynamic("SyncSessionToken")(__v.asInstanceOf[js.Any]))
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
    @inline
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
      val __obj = js.Dynamic.literal()
      Count.foreach(__v => __obj.updateDynamic("Count")(__v.asInstanceOf[js.Any]))
      DatasetDeletedAfterRequestedSyncCount.foreach(__v =>
        __obj.updateDynamic("DatasetDeletedAfterRequestedSyncCount")(__v.asInstanceOf[js.Any])
      )
      DatasetExists.foreach(__v => __obj.updateDynamic("DatasetExists")(__v.asInstanceOf[js.Any]))
      DatasetSyncCount.foreach(__v => __obj.updateDynamic("DatasetSyncCount")(__v.asInstanceOf[js.Any]))
      LastModifiedBy.foreach(__v => __obj.updateDynamic("LastModifiedBy")(__v.asInstanceOf[js.Any]))
      MergedDatasetNames.foreach(__v => __obj.updateDynamic("MergedDatasetNames")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Records.foreach(__v => __obj.updateDynamic("Records")(__v.asInstanceOf[js.Any]))
      SyncSessionToken.foreach(__v => __obj.updateDynamic("SyncSessionToken")(__v.asInstanceOf[js.Any]))
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
  trait PushSync extends js.Object {
    var ApplicationArns: js.UndefOr[ApplicationArnList]
    var RoleArn: js.UndefOr[AssumeRoleArn]
  }

  object PushSync {
    @inline
    def apply(
        ApplicationArns: js.UndefOr[ApplicationArnList] = js.undefined,
        RoleArn: js.UndefOr[AssumeRoleArn] = js.undefined
    ): PushSync = {
      val __obj = js.Dynamic.literal()
      ApplicationArns.foreach(__v => __obj.updateDynamic("ApplicationArns")(__v.asInstanceOf[js.Any]))
      RoleArn.foreach(__v => __obj.updateDynamic("RoleArn")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        DeviceLastModifiedDate: js.UndefOr[Date] = js.undefined,
        Key: js.UndefOr[RecordKey] = js.undefined,
        LastModifiedBy: js.UndefOr[String] = js.undefined,
        LastModifiedDate: js.UndefOr[Date] = js.undefined,
        SyncCount: js.UndefOr[Double] = js.undefined,
        Value: js.UndefOr[RecordValue] = js.undefined
    ): Record = {
      val __obj = js.Dynamic.literal()
      DeviceLastModifiedDate.foreach(__v => __obj.updateDynamic("DeviceLastModifiedDate")(__v.asInstanceOf[js.Any]))
      Key.foreach(__v => __obj.updateDynamic("Key")(__v.asInstanceOf[js.Any]))
      LastModifiedBy.foreach(__v => __obj.updateDynamic("LastModifiedBy")(__v.asInstanceOf[js.Any]))
      LastModifiedDate.foreach(__v => __obj.updateDynamic("LastModifiedDate")(__v.asInstanceOf[js.Any]))
      SyncCount.foreach(__v => __obj.updateDynamic("SyncCount")(__v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        Key: RecordKey,
        Op: Operation,
        SyncCount: Double,
        DeviceLastModifiedDate: js.UndefOr[Date] = js.undefined,
        Value: js.UndefOr[RecordValue] = js.undefined
    ): RecordPatch = {
      val __obj = js.Dynamic.literal(
        "Key"       -> Key.asInstanceOf[js.Any],
        "Op"        -> Op.asInstanceOf[js.Any],
        "SyncCount" -> SyncCount.asInstanceOf[js.Any]
      )

      DeviceLastModifiedDate.foreach(__v => __obj.updateDynamic("DeviceLastModifiedDate")(__v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        IdentityId: IdentityId,
        IdentityPoolId: IdentityPoolId,
        Platform: Platform,
        Token: PushToken
    ): RegisterDeviceRequest = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        DeviceId: js.UndefOr[DeviceId] = js.undefined
    ): RegisterDeviceResponse = {
      val __obj = js.Dynamic.literal()
      DeviceId.foreach(__v => __obj.updateDynamic("DeviceId")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        Events: Events,
        IdentityPoolId: IdentityPoolId
    ): SetCognitoEventsRequest = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        IdentityPoolId: IdentityPoolId,
        CognitoStreams: js.UndefOr[CognitoStreams] = js.undefined,
        PushSync: js.UndefOr[PushSync] = js.undefined
    ): SetIdentityPoolConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "IdentityPoolId" -> IdentityPoolId.asInstanceOf[js.Any]
      )

      CognitoStreams.foreach(__v => __obj.updateDynamic("CognitoStreams")(__v.asInstanceOf[js.Any]))
      PushSync.foreach(__v => __obj.updateDynamic("PushSync")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        CognitoStreams: js.UndefOr[CognitoStreams] = js.undefined,
        IdentityPoolId: js.UndefOr[IdentityPoolId] = js.undefined,
        PushSync: js.UndefOr[PushSync] = js.undefined
    ): SetIdentityPoolConfigurationResponse = {
      val __obj = js.Dynamic.literal()
      CognitoStreams.foreach(__v => __obj.updateDynamic("CognitoStreams")(__v.asInstanceOf[js.Any]))
      IdentityPoolId.foreach(__v => __obj.updateDynamic("IdentityPoolId")(__v.asInstanceOf[js.Any]))
      PushSync.foreach(__v => __obj.updateDynamic("PushSync")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SetIdentityPoolConfigurationResponse]
    }
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
  trait SubscribeToDatasetRequest extends js.Object {
    var DatasetName: DatasetName
    var DeviceId: DeviceId
    var IdentityId: IdentityId
    var IdentityPoolId: IdentityPoolId
  }

  object SubscribeToDatasetRequest {
    @inline
    def apply(
        DatasetName: DatasetName,
        DeviceId: DeviceId,
        IdentityId: IdentityId,
        IdentityPoolId: IdentityPoolId
    ): SubscribeToDatasetRequest = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
    ): SubscribeToDatasetResponse = {
      val __obj = js.Dynamic.literal()

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
    @inline
    def apply(
        DatasetName: DatasetName,
        DeviceId: DeviceId,
        IdentityId: IdentityId,
        IdentityPoolId: IdentityPoolId
    ): UnsubscribeFromDatasetRequest = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
    ): UnsubscribeFromDatasetResponse = {
      val __obj = js.Dynamic.literal()

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
    @inline
    def apply(
        DatasetName: DatasetName,
        IdentityId: IdentityId,
        IdentityPoolId: IdentityPoolId,
        SyncSessionToken: SyncSessionToken,
        ClientContext: js.UndefOr[ClientContext] = js.undefined,
        DeviceId: js.UndefOr[DeviceId] = js.undefined,
        RecordPatches: js.UndefOr[RecordPatchList] = js.undefined
    ): UpdateRecordsRequest = {
      val __obj = js.Dynamic.literal(
        "DatasetName"      -> DatasetName.asInstanceOf[js.Any],
        "IdentityId"       -> IdentityId.asInstanceOf[js.Any],
        "IdentityPoolId"   -> IdentityPoolId.asInstanceOf[js.Any],
        "SyncSessionToken" -> SyncSessionToken.asInstanceOf[js.Any]
      )

      ClientContext.foreach(__v => __obj.updateDynamic("ClientContext")(__v.asInstanceOf[js.Any]))
      DeviceId.foreach(__v => __obj.updateDynamic("DeviceId")(__v.asInstanceOf[js.Any]))
      RecordPatches.foreach(__v => __obj.updateDynamic("RecordPatches")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        Records: js.UndefOr[RecordList] = js.undefined
    ): UpdateRecordsResponse = {
      val __obj = js.Dynamic.literal()
      Records.foreach(__v => __obj.updateDynamic("Records")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateRecordsResponse]
    }
  }
}
