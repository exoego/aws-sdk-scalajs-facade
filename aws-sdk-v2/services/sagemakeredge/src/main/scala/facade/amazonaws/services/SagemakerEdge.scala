package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import scala.language.implicitConversions
import facade.amazonaws._

package object sagemakeredge {
  type CacheTTLSeconds = String
  type ChecksumString = String
  type Definitions = js.Array[Definition]
  type DeploymentModels = js.Array[DeploymentModel]
  type DeviceFleetName = String
  type DeviceName = String
  type DeviceRegistration = String
  type Dimension = String
  type EdgeDeployments = js.Array[EdgeDeployment]
  type EdgeMetrics = js.Array[EdgeMetric]
  type EntityName = String
  type Metric = String
  type ModelName = String
  type Models = js.Array[Model]
  type S3Uri = String
  type Timestamp = js.Date
  type Value = Double
  type Version = String

  final class SagemakerEdgeOps(private val service: SagemakerEdge) extends AnyVal {

    @inline def getDeploymentsFuture(params: GetDeploymentsRequest): Future[GetDeploymentsResult] = service.getDeployments(params).promise().toFuture
    @inline def getDeviceRegistrationFuture(params: GetDeviceRegistrationRequest): Future[GetDeviceRegistrationResult] = service.getDeviceRegistration(params).promise().toFuture
    @inline def sendHeartbeatFuture(params: SendHeartbeatRequest): Future[js.Object] = service.sendHeartbeat(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/sagemakeredge", JSImport.Namespace, "AWS.SagemakerEdge")
  class SagemakerEdge() extends js.Object {
    def this(config: AWSConfig) = this()

    def getDeployments(params: GetDeploymentsRequest): Request[GetDeploymentsResult] = js.native
    def getDeviceRegistration(params: GetDeviceRegistrationRequest): Request[GetDeviceRegistrationResult] = js.native
    def sendHeartbeat(params: SendHeartbeatRequest): Request[js.Object] = js.native
  }
  object SagemakerEdge {
    @inline implicit def toOps(service: SagemakerEdge): SagemakerEdgeOps = {
      new SagemakerEdgeOps(service)
    }
  }

  /** Information about the checksum of a model deployed on a device.
    */
  @js.native
  trait Checksum extends js.Object {
    var Sum: js.UndefOr[ChecksumString]
    var Type: js.UndefOr[ChecksumType]
  }

  object Checksum {
    @inline
    def apply(
        Sum: js.UndefOr[ChecksumString] = js.undefined,
        Type: js.UndefOr[ChecksumType] = js.undefined
    ): Checksum = {
      val __obj = js.Dynamic.literal()
      Sum.foreach(__v => __obj.updateDynamic("Sum")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Checksum]
    }
  }

  /** <p/>
    */
  @js.native
  trait Definition extends js.Object {
    var Checksum: js.UndefOr[Checksum]
    var ModelHandle: js.UndefOr[EntityName]
    var S3Url: js.UndefOr[S3Uri]
    var State: js.UndefOr[ModelState]
  }

  object Definition {
    @inline
    def apply(
        Checksum: js.UndefOr[Checksum] = js.undefined,
        ModelHandle: js.UndefOr[EntityName] = js.undefined,
        S3Url: js.UndefOr[S3Uri] = js.undefined,
        State: js.UndefOr[ModelState] = js.undefined
    ): Definition = {
      val __obj = js.Dynamic.literal()
      Checksum.foreach(__v => __obj.updateDynamic("Checksum")(__v.asInstanceOf[js.Any]))
      ModelHandle.foreach(__v => __obj.updateDynamic("ModelHandle")(__v.asInstanceOf[js.Any]))
      S3Url.foreach(__v => __obj.updateDynamic("S3Url")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Definition]
    }
  }

  /** <p/>
    */
  @js.native
  trait DeploymentModel extends js.Object {
    var DesiredState: js.UndefOr[ModelState]
    var ModelHandle: js.UndefOr[EntityName]
    var ModelName: js.UndefOr[ModelName]
    var ModelVersion: js.UndefOr[Version]
    var RollbackFailureReason: js.UndefOr[String]
    var State: js.UndefOr[ModelState]
    var Status: js.UndefOr[DeploymentStatus]
    var StatusReason: js.UndefOr[String]
  }

  object DeploymentModel {
    @inline
    def apply(
        DesiredState: js.UndefOr[ModelState] = js.undefined,
        ModelHandle: js.UndefOr[EntityName] = js.undefined,
        ModelName: js.UndefOr[ModelName] = js.undefined,
        ModelVersion: js.UndefOr[Version] = js.undefined,
        RollbackFailureReason: js.UndefOr[String] = js.undefined,
        State: js.UndefOr[ModelState] = js.undefined,
        Status: js.UndefOr[DeploymentStatus] = js.undefined,
        StatusReason: js.UndefOr[String] = js.undefined
    ): DeploymentModel = {
      val __obj = js.Dynamic.literal()
      DesiredState.foreach(__v => __obj.updateDynamic("DesiredState")(__v.asInstanceOf[js.Any]))
      ModelHandle.foreach(__v => __obj.updateDynamic("ModelHandle")(__v.asInstanceOf[js.Any]))
      ModelName.foreach(__v => __obj.updateDynamic("ModelName")(__v.asInstanceOf[js.Any]))
      ModelVersion.foreach(__v => __obj.updateDynamic("ModelVersion")(__v.asInstanceOf[js.Any]))
      RollbackFailureReason.foreach(__v => __obj.updateDynamic("RollbackFailureReason")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      StatusReason.foreach(__v => __obj.updateDynamic("StatusReason")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeploymentModel]
    }
  }

  /** Information about the result of a deployment on an edge device that is registered with SageMaker Edge Manager.
    */
  @js.native
  trait DeploymentResult extends js.Object {
    var DeploymentEndTime: js.UndefOr[Timestamp]
    var DeploymentModels: js.UndefOr[DeploymentModels]
    var DeploymentName: js.UndefOr[EntityName]
    var DeploymentStartTime: js.UndefOr[Timestamp]
    var DeploymentStatus: js.UndefOr[EntityName]
    var DeploymentStatusMessage: js.UndefOr[String]
  }

  object DeploymentResult {
    @inline
    def apply(
        DeploymentEndTime: js.UndefOr[Timestamp] = js.undefined,
        DeploymentModels: js.UndefOr[DeploymentModels] = js.undefined,
        DeploymentName: js.UndefOr[EntityName] = js.undefined,
        DeploymentStartTime: js.UndefOr[Timestamp] = js.undefined,
        DeploymentStatus: js.UndefOr[EntityName] = js.undefined,
        DeploymentStatusMessage: js.UndefOr[String] = js.undefined
    ): DeploymentResult = {
      val __obj = js.Dynamic.literal()
      DeploymentEndTime.foreach(__v => __obj.updateDynamic("DeploymentEndTime")(__v.asInstanceOf[js.Any]))
      DeploymentModels.foreach(__v => __obj.updateDynamic("DeploymentModels")(__v.asInstanceOf[js.Any]))
      DeploymentName.foreach(__v => __obj.updateDynamic("DeploymentName")(__v.asInstanceOf[js.Any]))
      DeploymentStartTime.foreach(__v => __obj.updateDynamic("DeploymentStartTime")(__v.asInstanceOf[js.Any]))
      DeploymentStatus.foreach(__v => __obj.updateDynamic("DeploymentStatus")(__v.asInstanceOf[js.Any]))
      DeploymentStatusMessage.foreach(__v => __obj.updateDynamic("DeploymentStatusMessage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeploymentResult]
    }
  }

  /** Information about a deployment on an edge device that is registered with SageMaker Edge Manager.
    */
  @js.native
  trait EdgeDeployment extends js.Object {
    var Definitions: js.UndefOr[Definitions]
    var DeploymentName: js.UndefOr[EntityName]
    var FailureHandlingPolicy: js.UndefOr[FailureHandlingPolicy]
    var Type: js.UndefOr[DeploymentType]
  }

  object EdgeDeployment {
    @inline
    def apply(
        Definitions: js.UndefOr[Definitions] = js.undefined,
        DeploymentName: js.UndefOr[EntityName] = js.undefined,
        FailureHandlingPolicy: js.UndefOr[FailureHandlingPolicy] = js.undefined,
        Type: js.UndefOr[DeploymentType] = js.undefined
    ): EdgeDeployment = {
      val __obj = js.Dynamic.literal()
      Definitions.foreach(__v => __obj.updateDynamic("Definitions")(__v.asInstanceOf[js.Any]))
      DeploymentName.foreach(__v => __obj.updateDynamic("DeploymentName")(__v.asInstanceOf[js.Any]))
      FailureHandlingPolicy.foreach(__v => __obj.updateDynamic("FailureHandlingPolicy")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EdgeDeployment]
    }
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
  trait GetDeploymentsRequest extends js.Object {
    var DeviceFleetName: DeviceFleetName
    var DeviceName: DeviceName
  }

  object GetDeploymentsRequest {
    @inline
    def apply(
        DeviceFleetName: DeviceFleetName,
        DeviceName: DeviceName
    ): GetDeploymentsRequest = {
      val __obj = js.Dynamic.literal(
        "DeviceFleetName" -> DeviceFleetName.asInstanceOf[js.Any],
        "DeviceName" -> DeviceName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetDeploymentsRequest]
    }
  }

  @js.native
  trait GetDeploymentsResult extends js.Object {
    var Deployments: js.UndefOr[EdgeDeployments]
  }

  object GetDeploymentsResult {
    @inline
    def apply(
        Deployments: js.UndefOr[EdgeDeployments] = js.undefined
    ): GetDeploymentsResult = {
      val __obj = js.Dynamic.literal()
      Deployments.foreach(__v => __obj.updateDynamic("Deployments")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDeploymentsResult]
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
    var DeploymentResult: js.UndefOr[DeploymentResult]
    var Models: js.UndefOr[Models]
  }

  object SendHeartbeatRequest {
    @inline
    def apply(
        AgentVersion: Version,
        DeviceFleetName: DeviceFleetName,
        DeviceName: DeviceName,
        AgentMetrics: js.UndefOr[EdgeMetrics] = js.undefined,
        DeploymentResult: js.UndefOr[DeploymentResult] = js.undefined,
        Models: js.UndefOr[Models] = js.undefined
    ): SendHeartbeatRequest = {
      val __obj = js.Dynamic.literal(
        "AgentVersion" -> AgentVersion.asInstanceOf[js.Any],
        "DeviceFleetName" -> DeviceFleetName.asInstanceOf[js.Any],
        "DeviceName" -> DeviceName.asInstanceOf[js.Any]
      )

      AgentMetrics.foreach(__v => __obj.updateDynamic("AgentMetrics")(__v.asInstanceOf[js.Any]))
      DeploymentResult.foreach(__v => __obj.updateDynamic("DeploymentResult")(__v.asInstanceOf[js.Any]))
      Models.foreach(__v => __obj.updateDynamic("Models")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SendHeartbeatRequest]
    }
  }
}
