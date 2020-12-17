package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

package object sagemakeredge {
  type CacheTTLSeconds = String
  type DeviceFleetName = String
  type DeviceName = String
  type DeviceRegistration = String
  type Dimension = String
  type EdgeMetrics = js.Array[EdgeMetric]
  type Metric = String
  type ModelName = String
  type Models = js.Array[Model]
  type Timestamp = js.Date
  type Value = Double
  type Version = String

  implicit final class SagemakerEdgeOps(private val service: SagemakerEdge) extends AnyVal {

    @inline def getDeviceRegistrationFuture(params: GetDeviceRegistrationRequest): Future[GetDeviceRegistrationResult] = service.getDeviceRegistration(params).promise().toFuture
    @inline def sendHeartbeatFuture(params: SendHeartbeatRequest): Future[js.Object] = service.sendHeartbeat(params).promise().toFuture

  }
}

package sagemakeredge {
  @js.native
  @JSImport("aws-sdk/clients/sagemakeredge", JSImport.Namespace, "AWS.SagemakerEdge")
  class SagemakerEdge() extends js.Object {
    def this(config: AWSConfig) = this()

    def getDeviceRegistration(params: GetDeviceRegistrationRequest): Request[GetDeviceRegistrationResult] = js.native
    def sendHeartbeat(params: SendHeartbeatRequest): Request[js.Object] = js.native
  }

  /** Information required for edge device metrics.
    */
  @js.native
  trait EdgeMetric extends js.Object {
    var Dimension: js.UndefOr[Dimension]
    var MetricName: js.UndefOr[Metric]
    var Timestamp: js.UndefOr[Timestamp]
    var Value: js.UndefOr[Value]
  }

  object EdgeMetric {
    @inline
    def apply(
        Dimension: js.UndefOr[Dimension] = js.undefined,
        MetricName: js.UndefOr[Metric] = js.undefined,
        Timestamp: js.UndefOr[Timestamp] = js.undefined,
        Value: js.UndefOr[Value] = js.undefined
    ): EdgeMetric = {
      val __obj = js.Dynamic.literal()
      Dimension.foreach(__v => __obj.updateDynamic("Dimension")(__v.asInstanceOf[js.Any]))
      MetricName.foreach(__v => __obj.updateDynamic("MetricName")(__v.asInstanceOf[js.Any]))
      Timestamp.foreach(__v => __obj.updateDynamic("Timestamp")(__v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EdgeMetric]
    }
  }

  @js.native
  trait GetDeviceRegistrationRequest extends js.Object {
    var DeviceFleetName: DeviceFleetName
    var DeviceName: DeviceName
  }

  object GetDeviceRegistrationRequest {
    @inline
    def apply(
        DeviceFleetName: DeviceFleetName,
        DeviceName: DeviceName
    ): GetDeviceRegistrationRequest = {
      val __obj = js.Dynamic.literal(
        "DeviceFleetName" -> DeviceFleetName.asInstanceOf[js.Any],
        "DeviceName" -> DeviceName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetDeviceRegistrationRequest]
    }
  }

  @js.native
  trait GetDeviceRegistrationResult extends js.Object {
    var CacheTTL: js.UndefOr[CacheTTLSeconds]
    var DeviceRegistration: js.UndefOr[DeviceRegistration]
  }

  object GetDeviceRegistrationResult {
    @inline
    def apply(
        CacheTTL: js.UndefOr[CacheTTLSeconds] = js.undefined,
        DeviceRegistration: js.UndefOr[DeviceRegistration] = js.undefined
    ): GetDeviceRegistrationResult = {
      val __obj = js.Dynamic.literal()
      CacheTTL.foreach(__v => __obj.updateDynamic("CacheTTL")(__v.asInstanceOf[js.Any]))
      DeviceRegistration.foreach(__v => __obj.updateDynamic("DeviceRegistration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDeviceRegistrationResult]
    }
  }

  /** Information about a model deployed on an edge device that is registered with SageMaker Edge Manager.
    */
  @js.native
  trait Model extends js.Object {
    var LatestInference: js.UndefOr[Timestamp]
    var LatestSampleTime: js.UndefOr[Timestamp]
    var ModelMetrics: js.UndefOr[EdgeMetrics]
    var ModelName: js.UndefOr[ModelName]
    var ModelVersion: js.UndefOr[Version]
  }

  object Model {
    @inline
    def apply(
        LatestInference: js.UndefOr[Timestamp] = js.undefined,
        LatestSampleTime: js.UndefOr[Timestamp] = js.undefined,
        ModelMetrics: js.UndefOr[EdgeMetrics] = js.undefined,
        ModelName: js.UndefOr[ModelName] = js.undefined,
        ModelVersion: js.UndefOr[Version] = js.undefined
    ): Model = {
      val __obj = js.Dynamic.literal()
      LatestInference.foreach(__v => __obj.updateDynamic("LatestInference")(__v.asInstanceOf[js.Any]))
      LatestSampleTime.foreach(__v => __obj.updateDynamic("LatestSampleTime")(__v.asInstanceOf[js.Any]))
      ModelMetrics.foreach(__v => __obj.updateDynamic("ModelMetrics")(__v.asInstanceOf[js.Any]))
      ModelName.foreach(__v => __obj.updateDynamic("ModelName")(__v.asInstanceOf[js.Any]))
      ModelVersion.foreach(__v => __obj.updateDynamic("ModelVersion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Model]
    }
  }

  @js.native
  trait SendHeartbeatRequest extends js.Object {
    var AgentVersion: Version
    var DeviceFleetName: DeviceFleetName
    var DeviceName: DeviceName
    var AgentMetrics: js.UndefOr[EdgeMetrics]
    var Models: js.UndefOr[Models]
  }

  object SendHeartbeatRequest {
    @inline
    def apply(
        AgentVersion: Version,
        DeviceFleetName: DeviceFleetName,
        DeviceName: DeviceName,
        AgentMetrics: js.UndefOr[EdgeMetrics] = js.undefined,
        Models: js.UndefOr[Models] = js.undefined
    ): SendHeartbeatRequest = {
      val __obj = js.Dynamic.literal(
        "AgentVersion" -> AgentVersion.asInstanceOf[js.Any],
        "DeviceFleetName" -> DeviceFleetName.asInstanceOf[js.Any],
        "DeviceName" -> DeviceName.asInstanceOf[js.Any]
      )

      AgentMetrics.foreach(__v => __obj.updateDynamic("AgentMetrics")(__v.asInstanceOf[js.Any]))
      Models.foreach(__v => __obj.updateDynamic("Models")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SendHeartbeatRequest]
    }
  }
}
