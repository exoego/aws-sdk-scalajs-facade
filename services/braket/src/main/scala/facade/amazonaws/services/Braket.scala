package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

package object braket {
  type CreateQuantumTaskRequestDeviceParametersString = String
  type CreateQuantumTaskRequestOutputS3BucketString = String
  type CreateQuantumTaskRequestOutputS3KeyPrefixString = String
  type CreateQuantumTaskRequestShotsLong = Double
  type DeviceArn = String
  type DeviceSummaryList = js.Array[DeviceSummary]
  type JsonValue = String
  type QuantumTaskArn = String
  type QuantumTaskSummaryList = js.Array[QuantumTaskSummary]
  type SearchDevicesFilterNameString = String
  type SearchDevicesFilterValuesList = js.Array[String256]
  type SearchDevicesRequestFiltersList = js.Array[SearchDevicesFilter]
  type SearchDevicesRequestMaxResultsInteger = Int
  type SearchQuantumTasksFilterValuesList = js.Array[String256]
  type SearchQuantumTasksRequestFiltersList = js.Array[SearchQuantumTasksFilter]
  type SearchQuantumTasksRequestMaxResultsInteger = Int
  type String256 = String
  type String64 = String
  type SyntheticTimestamp_date_time = js.Date
  type TagKeys = js.Array[String]
  type TagsMap = js.Dictionary[String]

  implicit final class BraketOps(private val service: Braket) extends AnyVal {

    @inline def cancelQuantumTaskFuture(params: CancelQuantumTaskRequest): Future[CancelQuantumTaskResponse] = service.cancelQuantumTask(params).promise().toFuture
    @inline def createQuantumTaskFuture(params: CreateQuantumTaskRequest): Future[CreateQuantumTaskResponse] = service.createQuantumTask(params).promise().toFuture
    @inline def getDeviceFuture(params: GetDeviceRequest): Future[GetDeviceResponse] = service.getDevice(params).promise().toFuture
    @inline def getQuantumTaskFuture(params: GetQuantumTaskRequest): Future[GetQuantumTaskResponse] = service.getQuantumTask(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] = service.listTagsForResource(params).promise().toFuture
    @inline def searchDevicesFuture(params: SearchDevicesRequest): Future[SearchDevicesResponse] = service.searchDevices(params).promise().toFuture
    @inline def searchQuantumTasksFuture(params: SearchQuantumTasksRequest): Future[SearchQuantumTasksResponse] = service.searchQuantumTasks(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] = service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] = service.untagResource(params).promise().toFuture

  }
}

package braket {
  @js.native
  @JSImport("aws-sdk/clients/braket", JSImport.Namespace, "AWS.Braket")
  class Braket() extends js.Object {
    def this(config: AWSConfig) = this()

    def cancelQuantumTask(params: CancelQuantumTaskRequest): Request[CancelQuantumTaskResponse] = js.native
    def createQuantumTask(params: CreateQuantumTaskRequest): Request[CreateQuantumTaskResponse] = js.native
    def getDevice(params: GetDeviceRequest): Request[GetDeviceResponse] = js.native
    def getQuantumTask(params: GetQuantumTaskRequest): Request[GetQuantumTaskResponse] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def searchDevices(params: SearchDevicesRequest): Request[SearchDevicesResponse] = js.native
    def searchQuantumTasks(params: SearchQuantumTasksRequest): Request[SearchQuantumTasksResponse] = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse] = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse] = js.native
  }

  @js.native
  trait CancelQuantumTaskRequest extends js.Object {
    var clientToken: String64
    var quantumTaskArn: QuantumTaskArn
  }

  object CancelQuantumTaskRequest {
    @inline
    def apply(
        clientToken: String64,
        quantumTaskArn: QuantumTaskArn
    ): CancelQuantumTaskRequest = {
      val __obj = js.Dynamic.literal(
        "clientToken" -> clientToken.asInstanceOf[js.Any],
        "quantumTaskArn" -> quantumTaskArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CancelQuantumTaskRequest]
    }
  }

  @js.native
  trait CancelQuantumTaskResponse extends js.Object {
    var cancellationStatus: CancellationStatus
    var quantumTaskArn: QuantumTaskArn
  }

  object CancelQuantumTaskResponse {
    @inline
    def apply(
        cancellationStatus: CancellationStatus,
        quantumTaskArn: QuantumTaskArn
    ): CancelQuantumTaskResponse = {
      val __obj = js.Dynamic.literal(
        "cancellationStatus" -> cancellationStatus.asInstanceOf[js.Any],
        "quantumTaskArn" -> quantumTaskArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CancelQuantumTaskResponse]
    }
  }

  @js.native
  sealed trait CancellationStatus extends js.Any
  object CancellationStatus {
    val CANCELLING = "CANCELLING".asInstanceOf[CancellationStatus]
    val CANCELLED = "CANCELLED".asInstanceOf[CancellationStatus]

    @inline def values = js.Array(CANCELLING, CANCELLED)
  }

  @js.native
  trait CreateQuantumTaskRequest extends js.Object {
    var action: JsonValue
    var clientToken: String64
    var deviceArn: DeviceArn
    var outputS3Bucket: CreateQuantumTaskRequestOutputS3BucketString
    var outputS3KeyPrefix: CreateQuantumTaskRequestOutputS3KeyPrefixString
    var shots: CreateQuantumTaskRequestShotsLong
    var deviceParameters: js.UndefOr[CreateQuantumTaskRequestDeviceParametersString]
    var tags: js.UndefOr[TagsMap]
  }

  object CreateQuantumTaskRequest {
    @inline
    def apply(
        action: JsonValue,
        clientToken: String64,
        deviceArn: DeviceArn,
        outputS3Bucket: CreateQuantumTaskRequestOutputS3BucketString,
        outputS3KeyPrefix: CreateQuantumTaskRequestOutputS3KeyPrefixString,
        shots: CreateQuantumTaskRequestShotsLong,
        deviceParameters: js.UndefOr[CreateQuantumTaskRequestDeviceParametersString] = js.undefined,
        tags: js.UndefOr[TagsMap] = js.undefined
    ): CreateQuantumTaskRequest = {
      val __obj = js.Dynamic.literal(
        "action" -> action.asInstanceOf[js.Any],
        "clientToken" -> clientToken.asInstanceOf[js.Any],
        "deviceArn" -> deviceArn.asInstanceOf[js.Any],
        "outputS3Bucket" -> outputS3Bucket.asInstanceOf[js.Any],
        "outputS3KeyPrefix" -> outputS3KeyPrefix.asInstanceOf[js.Any],
        "shots" -> shots.asInstanceOf[js.Any]
      )

      deviceParameters.foreach(__v => __obj.updateDynamic("deviceParameters")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateQuantumTaskRequest]
    }
  }

  @js.native
  trait CreateQuantumTaskResponse extends js.Object {
    var quantumTaskArn: QuantumTaskArn
  }

  object CreateQuantumTaskResponse {
    @inline
    def apply(
        quantumTaskArn: QuantumTaskArn
    ): CreateQuantumTaskResponse = {
      val __obj = js.Dynamic.literal(
        "quantumTaskArn" -> quantumTaskArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateQuantumTaskResponse]
    }
  }

  @js.native
  sealed trait DeviceStatus extends js.Any
  object DeviceStatus {
    val ONLINE = "ONLINE".asInstanceOf[DeviceStatus]
    val OFFLINE = "OFFLINE".asInstanceOf[DeviceStatus]

    @inline def values = js.Array(ONLINE, OFFLINE)
  }

  /** Includes information about the device.
    */
  @js.native
  trait DeviceSummary extends js.Object {
    var deviceArn: DeviceArn
    var deviceName: String
    var deviceStatus: DeviceStatus
    var deviceType: DeviceType
    var providerName: String
  }

  object DeviceSummary {
    @inline
    def apply(
        deviceArn: DeviceArn,
        deviceName: String,
        deviceStatus: DeviceStatus,
        deviceType: DeviceType,
        providerName: String
    ): DeviceSummary = {
      val __obj = js.Dynamic.literal(
        "deviceArn" -> deviceArn.asInstanceOf[js.Any],
        "deviceName" -> deviceName.asInstanceOf[js.Any],
        "deviceStatus" -> deviceStatus.asInstanceOf[js.Any],
        "deviceType" -> deviceType.asInstanceOf[js.Any],
        "providerName" -> providerName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeviceSummary]
    }
  }

  @js.native
  sealed trait DeviceType extends js.Any
  object DeviceType {
    val QPU = "QPU".asInstanceOf[DeviceType]
    val SIMULATOR = "SIMULATOR".asInstanceOf[DeviceType]

    @inline def values = js.Array(QPU, SIMULATOR)
  }

  @js.native
  trait GetDeviceRequest extends js.Object {
    var deviceArn: DeviceArn
  }

  object GetDeviceRequest {
    @inline
    def apply(
        deviceArn: DeviceArn
    ): GetDeviceRequest = {
      val __obj = js.Dynamic.literal(
        "deviceArn" -> deviceArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetDeviceRequest]
    }
  }

  @js.native
  trait GetDeviceResponse extends js.Object {
    var deviceArn: DeviceArn
    var deviceCapabilities: JsonValue
    var deviceName: String
    var deviceStatus: DeviceStatus
    var deviceType: DeviceType
    var providerName: String
  }

  object GetDeviceResponse {
    @inline
    def apply(
        deviceArn: DeviceArn,
        deviceCapabilities: JsonValue,
        deviceName: String,
        deviceStatus: DeviceStatus,
        deviceType: DeviceType,
        providerName: String
    ): GetDeviceResponse = {
      val __obj = js.Dynamic.literal(
        "deviceArn" -> deviceArn.asInstanceOf[js.Any],
        "deviceCapabilities" -> deviceCapabilities.asInstanceOf[js.Any],
        "deviceName" -> deviceName.asInstanceOf[js.Any],
        "deviceStatus" -> deviceStatus.asInstanceOf[js.Any],
        "deviceType" -> deviceType.asInstanceOf[js.Any],
        "providerName" -> providerName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetDeviceResponse]
    }
  }

  @js.native
  trait GetQuantumTaskRequest extends js.Object {
    var quantumTaskArn: QuantumTaskArn
  }

  object GetQuantumTaskRequest {
    @inline
    def apply(
        quantumTaskArn: QuantumTaskArn
    ): GetQuantumTaskRequest = {
      val __obj = js.Dynamic.literal(
        "quantumTaskArn" -> quantumTaskArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetQuantumTaskRequest]
    }
  }

  @js.native
  trait GetQuantumTaskResponse extends js.Object {
    var createdAt: SyntheticTimestamp_date_time
    var deviceArn: DeviceArn
    var deviceParameters: JsonValue
    var outputS3Bucket: String
    var outputS3Directory: String
    var quantumTaskArn: QuantumTaskArn
    var shots: Double
    var status: QuantumTaskStatus
    var endedAt: js.UndefOr[SyntheticTimestamp_date_time]
    var failureReason: js.UndefOr[String]
    var tags: js.UndefOr[TagsMap]
  }

  object GetQuantumTaskResponse {
    @inline
    def apply(
        createdAt: SyntheticTimestamp_date_time,
        deviceArn: DeviceArn,
        deviceParameters: JsonValue,
        outputS3Bucket: String,
        outputS3Directory: String,
        quantumTaskArn: QuantumTaskArn,
        shots: Double,
        status: QuantumTaskStatus,
        endedAt: js.UndefOr[SyntheticTimestamp_date_time] = js.undefined,
        failureReason: js.UndefOr[String] = js.undefined,
        tags: js.UndefOr[TagsMap] = js.undefined
    ): GetQuantumTaskResponse = {
      val __obj = js.Dynamic.literal(
        "createdAt" -> createdAt.asInstanceOf[js.Any],
        "deviceArn" -> deviceArn.asInstanceOf[js.Any],
        "deviceParameters" -> deviceParameters.asInstanceOf[js.Any],
        "outputS3Bucket" -> outputS3Bucket.asInstanceOf[js.Any],
        "outputS3Directory" -> outputS3Directory.asInstanceOf[js.Any],
        "quantumTaskArn" -> quantumTaskArn.asInstanceOf[js.Any],
        "shots" -> shots.asInstanceOf[js.Any],
        "status" -> status.asInstanceOf[js.Any]
      )

      endedAt.foreach(__v => __obj.updateDynamic("endedAt")(__v.asInstanceOf[js.Any]))
      failureReason.foreach(__v => __obj.updateDynamic("failureReason")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetQuantumTaskResponse]
    }
  }

  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var resourceArn: String
  }

  object ListTagsForResourceRequest {
    @inline
    def apply(
        resourceArn: String
    ): ListTagsForResourceRequest = {
      val __obj = js.Dynamic.literal(
        "resourceArn" -> resourceArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ListTagsForResourceRequest]
    }
  }

  @js.native
  trait ListTagsForResourceResponse extends js.Object {
    var tags: js.UndefOr[TagsMap]
  }

  object ListTagsForResourceResponse {
    @inline
    def apply(
        tags: js.UndefOr[TagsMap] = js.undefined
    ): ListTagsForResourceResponse = {
      val __obj = js.Dynamic.literal()
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceResponse]
    }
  }

  @js.native
  sealed trait QuantumTaskStatus extends js.Any
  object QuantumTaskStatus {
    val CREATED = "CREATED".asInstanceOf[QuantumTaskStatus]
    val QUEUED = "QUEUED".asInstanceOf[QuantumTaskStatus]
    val RUNNING = "RUNNING".asInstanceOf[QuantumTaskStatus]
    val COMPLETED = "COMPLETED".asInstanceOf[QuantumTaskStatus]
    val FAILED = "FAILED".asInstanceOf[QuantumTaskStatus]
    val CANCELLING = "CANCELLING".asInstanceOf[QuantumTaskStatus]
    val CANCELLED = "CANCELLED".asInstanceOf[QuantumTaskStatus]

    @inline def values = js.Array(CREATED, QUEUED, RUNNING, COMPLETED, FAILED, CANCELLING, CANCELLED)
  }

  /** Includes information about a quantum task.
    */
  @js.native
  trait QuantumTaskSummary extends js.Object {
    var createdAt: SyntheticTimestamp_date_time
    var deviceArn: DeviceArn
    var outputS3Bucket: String
    var outputS3Directory: String
    var quantumTaskArn: QuantumTaskArn
    var shots: Double
    var status: QuantumTaskStatus
    var endedAt: js.UndefOr[SyntheticTimestamp_date_time]
    var tags: js.UndefOr[TagsMap]
  }

  object QuantumTaskSummary {
    @inline
    def apply(
        createdAt: SyntheticTimestamp_date_time,
        deviceArn: DeviceArn,
        outputS3Bucket: String,
        outputS3Directory: String,
        quantumTaskArn: QuantumTaskArn,
        shots: Double,
        status: QuantumTaskStatus,
        endedAt: js.UndefOr[SyntheticTimestamp_date_time] = js.undefined,
        tags: js.UndefOr[TagsMap] = js.undefined
    ): QuantumTaskSummary = {
      val __obj = js.Dynamic.literal(
        "createdAt" -> createdAt.asInstanceOf[js.Any],
        "deviceArn" -> deviceArn.asInstanceOf[js.Any],
        "outputS3Bucket" -> outputS3Bucket.asInstanceOf[js.Any],
        "outputS3Directory" -> outputS3Directory.asInstanceOf[js.Any],
        "quantumTaskArn" -> quantumTaskArn.asInstanceOf[js.Any],
        "shots" -> shots.asInstanceOf[js.Any],
        "status" -> status.asInstanceOf[js.Any]
      )

      endedAt.foreach(__v => __obj.updateDynamic("endedAt")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[QuantumTaskSummary]
    }
  }

  /** The filter to use for searching devices.
    */
  @js.native
  trait SearchDevicesFilter extends js.Object {
    var name: SearchDevicesFilterNameString
    var values: SearchDevicesFilterValuesList
  }

  object SearchDevicesFilter {
    @inline
    def apply(
        name: SearchDevicesFilterNameString,
        values: SearchDevicesFilterValuesList
    ): SearchDevicesFilter = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any],
        "values" -> values.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[SearchDevicesFilter]
    }
  }

  @js.native
  trait SearchDevicesRequest extends js.Object {
    var filters: SearchDevicesRequestFiltersList
    var maxResults: js.UndefOr[SearchDevicesRequestMaxResultsInteger]
    var nextToken: js.UndefOr[String]
  }

  object SearchDevicesRequest {
    @inline
    def apply(
        filters: SearchDevicesRequestFiltersList,
        maxResults: js.UndefOr[SearchDevicesRequestMaxResultsInteger] = js.undefined,
        nextToken: js.UndefOr[String] = js.undefined
    ): SearchDevicesRequest = {
      val __obj = js.Dynamic.literal(
        "filters" -> filters.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SearchDevicesRequest]
    }
  }

  @js.native
  trait SearchDevicesResponse extends js.Object {
    var devices: DeviceSummaryList
    var nextToken: js.UndefOr[String]
  }

  object SearchDevicesResponse {
    @inline
    def apply(
        devices: DeviceSummaryList,
        nextToken: js.UndefOr[String] = js.undefined
    ): SearchDevicesResponse = {
      val __obj = js.Dynamic.literal(
        "devices" -> devices.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SearchDevicesResponse]
    }
  }

  /** A filter to use to search for tasks.
    */
  @js.native
  trait SearchQuantumTasksFilter extends js.Object {
    var name: String64
    var operator: SearchQuantumTasksFilterOperator
    var values: SearchQuantumTasksFilterValuesList
  }

  object SearchQuantumTasksFilter {
    @inline
    def apply(
        name: String64,
        operator: SearchQuantumTasksFilterOperator,
        values: SearchQuantumTasksFilterValuesList
    ): SearchQuantumTasksFilter = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any],
        "operator" -> operator.asInstanceOf[js.Any],
        "values" -> values.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[SearchQuantumTasksFilter]
    }
  }

  @js.native
  sealed trait SearchQuantumTasksFilterOperator extends js.Any
  object SearchQuantumTasksFilterOperator {
    val LT = "LT".asInstanceOf[SearchQuantumTasksFilterOperator]
    val LTE = "LTE".asInstanceOf[SearchQuantumTasksFilterOperator]
    val EQUAL = "EQUAL".asInstanceOf[SearchQuantumTasksFilterOperator]
    val GT = "GT".asInstanceOf[SearchQuantumTasksFilterOperator]
    val GTE = "GTE".asInstanceOf[SearchQuantumTasksFilterOperator]
    val BETWEEN = "BETWEEN".asInstanceOf[SearchQuantumTasksFilterOperator]

    @inline def values = js.Array(LT, LTE, EQUAL, GT, GTE, BETWEEN)
  }

  @js.native
  trait SearchQuantumTasksRequest extends js.Object {
    var filters: SearchQuantumTasksRequestFiltersList
    var maxResults: js.UndefOr[SearchQuantumTasksRequestMaxResultsInteger]
    var nextToken: js.UndefOr[String]
  }

  object SearchQuantumTasksRequest {
    @inline
    def apply(
        filters: SearchQuantumTasksRequestFiltersList,
        maxResults: js.UndefOr[SearchQuantumTasksRequestMaxResultsInteger] = js.undefined,
        nextToken: js.UndefOr[String] = js.undefined
    ): SearchQuantumTasksRequest = {
      val __obj = js.Dynamic.literal(
        "filters" -> filters.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SearchQuantumTasksRequest]
    }
  }

  @js.native
  trait SearchQuantumTasksResponse extends js.Object {
    var quantumTasks: QuantumTaskSummaryList
    var nextToken: js.UndefOr[String]
  }

  object SearchQuantumTasksResponse {
    @inline
    def apply(
        quantumTasks: QuantumTaskSummaryList,
        nextToken: js.UndefOr[String] = js.undefined
    ): SearchQuantumTasksResponse = {
      val __obj = js.Dynamic.literal(
        "quantumTasks" -> quantumTasks.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SearchQuantumTasksResponse]
    }
  }

  @js.native
  trait TagResourceRequest extends js.Object {
    var resourceArn: String
    var tags: TagsMap
  }

  object TagResourceRequest {
    @inline
    def apply(
        resourceArn: String,
        tags: TagsMap
    ): TagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "resourceArn" -> resourceArn.asInstanceOf[js.Any],
        "tags" -> tags.asInstanceOf[js.Any]
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

  @js.native
  trait UntagResourceRequest extends js.Object {
    var resourceArn: String
    var tagKeys: TagKeys
  }

  object UntagResourceRequest {
    @inline
    def apply(
        resourceArn: String,
        tagKeys: TagKeys
    ): UntagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "resourceArn" -> resourceArn.asInstanceOf[js.Any],
        "tagKeys" -> tagKeys.asInstanceOf[js.Any]
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
}
