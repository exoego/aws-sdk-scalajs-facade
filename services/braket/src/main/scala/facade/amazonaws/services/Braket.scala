package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

package object braket {
  type CreateQuantumTaskRequestdeviceParametersJsonValue = String
  type CreateQuantumTaskRequestoutputS3BucketString = String
  type CreateQuantumTaskRequestoutputS3KeyPrefixString = String
  type CreateQuantumTaskRequestshotsLong = Double
  type DeviceArn = String
  type DeviceSummaryList = js.Array[DeviceSummary]
  type JsonValue = String
  type QuantumTaskArn = String
  type QuantumTaskSummaryList = js.Array[QuantumTaskSummary]
  type SearchDevicesFilternameString = String
  type SearchDevicesFiltervaluesString256List = js.Array[String256]
  type SearchDevicesRequestfiltersSearchDevicesFilterList = js.Array[SearchDevicesFilter]
  type SearchDevicesRequestmaxResultsInteger = Int
  type SearchQuantumTasksFiltervaluesString256List = js.Array[String256]
  type SearchQuantumTasksRequestfiltersSearchQuantumTasksFilterList = js.Array[SearchQuantumTasksFilter]
  type SearchQuantumTasksRequestmaxResultsInteger = Int
  type String256 = String
  type String64 = String
  type SyntheticTimestamp_date_time = js.Date

  implicit final class BraketOps(private val service: Braket) extends AnyVal {

    @inline def cancelQuantumTaskFuture(params: CancelQuantumTaskRequest): Future[CancelQuantumTaskResponse] = service.cancelQuantumTask(params).promise().toFuture
    @inline def createQuantumTaskFuture(params: CreateQuantumTaskRequest): Future[CreateQuantumTaskResponse] = service.createQuantumTask(params).promise().toFuture
    @inline def getDeviceFuture(params: GetDeviceRequest): Future[GetDeviceResponse] = service.getDevice(params).promise().toFuture
    @inline def getQuantumTaskFuture(params: GetQuantumTaskRequest): Future[GetQuantumTaskResponse] = service.getQuantumTask(params).promise().toFuture
    @inline def searchDevicesFuture(params: SearchDevicesRequest): Future[SearchDevicesResponse] = service.searchDevices(params).promise().toFuture
    @inline def searchQuantumTasksFuture(params: SearchQuantumTasksRequest): Future[SearchQuantumTasksResponse] = service.searchQuantumTasks(params).promise().toFuture

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
    def searchDevices(params: SearchDevicesRequest): Request[SearchDevicesResponse] = js.native
    def searchQuantumTasks(params: SearchQuantumTasksRequest): Request[SearchQuantumTasksResponse] = js.native
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
    val CANCELLED = "CANCELLED".asInstanceOf[CancellationStatus]
    val CANCELLING = "CANCELLING".asInstanceOf[CancellationStatus]

    @inline def values = js.Array(CANCELLED, CANCELLING)
  }

  @js.native
  trait CreateQuantumTaskRequest extends js.Object {
    var action: JsonValue
    var clientToken: String64
    var deviceArn: DeviceArn
    var outputS3Bucket: CreateQuantumTaskRequestoutputS3BucketString
    var outputS3KeyPrefix: CreateQuantumTaskRequestoutputS3KeyPrefixString
    var shots: CreateQuantumTaskRequestshotsLong
    var deviceParameters: js.UndefOr[CreateQuantumTaskRequestdeviceParametersJsonValue]
  }

  object CreateQuantumTaskRequest {
    @inline
    def apply(
        action: JsonValue,
        clientToken: String64,
        deviceArn: DeviceArn,
        outputS3Bucket: CreateQuantumTaskRequestoutputS3BucketString,
        outputS3KeyPrefix: CreateQuantumTaskRequestoutputS3KeyPrefixString,
        shots: CreateQuantumTaskRequestshotsLong,
        deviceParameters: js.UndefOr[CreateQuantumTaskRequestdeviceParametersJsonValue] = js.undefined
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
    val OFFLINE = "OFFLINE".asInstanceOf[DeviceStatus]
    val ONLINE = "ONLINE".asInstanceOf[DeviceStatus]

    @inline def values = js.Array(OFFLINE, ONLINE)
  }

  /**
    * Includes information about the device.
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
        failureReason: js.UndefOr[String] = js.undefined
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
      __obj.asInstanceOf[GetQuantumTaskResponse]
    }
  }

  @js.native
  sealed trait QuantumTaskStatus extends js.Any
  object QuantumTaskStatus {
    val CANCELLED = "CANCELLED".asInstanceOf[QuantumTaskStatus]
    val CANCELLING = "CANCELLING".asInstanceOf[QuantumTaskStatus]
    val COMPLETED = "COMPLETED".asInstanceOf[QuantumTaskStatus]
    val CREATED = "CREATED".asInstanceOf[QuantumTaskStatus]
    val FAILED = "FAILED".asInstanceOf[QuantumTaskStatus]
    val QUEUED = "QUEUED".asInstanceOf[QuantumTaskStatus]
    val RUNNING = "RUNNING".asInstanceOf[QuantumTaskStatus]

    @inline def values = js.Array(CANCELLED, CANCELLING, COMPLETED, CREATED, FAILED, QUEUED, RUNNING)
  }

  /**
    * Includes information about a quantum task.
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
        endedAt: js.UndefOr[SyntheticTimestamp_date_time] = js.undefined
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
      __obj.asInstanceOf[QuantumTaskSummary]
    }
  }

  /**
    * The filter to use for searching devices.
    */
  @js.native
  trait SearchDevicesFilter extends js.Object {
    var name: SearchDevicesFilternameString
    var values: SearchDevicesFiltervaluesString256List
  }

  object SearchDevicesFilter {
    @inline
    def apply(
        name: SearchDevicesFilternameString,
        values: SearchDevicesFiltervaluesString256List
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
    var filters: SearchDevicesRequestfiltersSearchDevicesFilterList
    var maxResults: js.UndefOr[SearchDevicesRequestmaxResultsInteger]
    var nextToken: js.UndefOr[String]
  }

  object SearchDevicesRequest {
    @inline
    def apply(
        filters: SearchDevicesRequestfiltersSearchDevicesFilterList,
        maxResults: js.UndefOr[SearchDevicesRequestmaxResultsInteger] = js.undefined,
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

  /**
    * A filter to use to search for tasks.
    */
  @js.native
  trait SearchQuantumTasksFilter extends js.Object {
    var name: String64
    var operator: SearchQuantumTasksFilterOperator
    var values: SearchQuantumTasksFiltervaluesString256List
  }

  object SearchQuantumTasksFilter {
    @inline
    def apply(
        name: String64,
        operator: SearchQuantumTasksFilterOperator,
        values: SearchQuantumTasksFiltervaluesString256List
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
    val BETWEEN = "BETWEEN".asInstanceOf[SearchQuantumTasksFilterOperator]
    val EQUAL = "EQUAL".asInstanceOf[SearchQuantumTasksFilterOperator]
    val GT = "GT".asInstanceOf[SearchQuantumTasksFilterOperator]
    val GTE = "GTE".asInstanceOf[SearchQuantumTasksFilterOperator]
    val LT = "LT".asInstanceOf[SearchQuantumTasksFilterOperator]
    val LTE = "LTE".asInstanceOf[SearchQuantumTasksFilterOperator]

    @inline def values = js.Array(BETWEEN, EQUAL, GT, GTE, LT, LTE)
  }

  @js.native
  trait SearchQuantumTasksRequest extends js.Object {
    var filters: SearchQuantumTasksRequestfiltersSearchQuantumTasksFilterList
    var maxResults: js.UndefOr[SearchQuantumTasksRequestmaxResultsInteger]
    var nextToken: js.UndefOr[String]
  }

  object SearchQuantumTasksRequest {
    @inline
    def apply(
        filters: SearchQuantumTasksRequestfiltersSearchQuantumTasksFilterList,
        maxResults: js.UndefOr[SearchQuantumTasksRequestmaxResultsInteger] = js.undefined,
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
}
