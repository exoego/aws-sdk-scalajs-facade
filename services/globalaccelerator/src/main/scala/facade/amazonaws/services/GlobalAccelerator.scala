package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import io.scalajs.nodejs
import facade.amazonaws._

package object globalaccelerator {
  type AcceleratorStatus          = String
  type Accelerators               = js.Array[Accelerator]
  type ClientAffinity             = String
  type EndpointConfigurations     = js.Array[EndpointConfiguration]
  type EndpointDescriptions       = js.Array[EndpointDescription]
  type EndpointGroups             = js.Array[EndpointGroup]
  type EndpointWeight             = Int
  type GenericBoolean             = Boolean
  type GenericString              = String
  type HealthCheckIntervalSeconds = Int
  type HealthCheckPort            = Int
  type HealthCheckProtocol        = String
  type HealthState                = String
  type IdempotencyToken           = String
  type IpAddress                  = String
  type IpAddressType              = String
  type IpAddresses                = js.Array[IpAddress]
  type IpSets                     = js.Array[IpSet]
  type Listeners                  = js.Array[Listener]
  type MaxResults                 = Int
  type PortNumber                 = Int
  type PortRanges                 = js.Array[PortRange]
  type Protocol                   = String
  type ThresholdCount             = Int
  type Timestamp                  = js.Date
  type TrafficDialPercentage      = Float

  implicit final class GlobalAcceleratorOps(private val service: GlobalAccelerator) extends AnyVal {

    def createAcceleratorFuture(params: CreateAcceleratorRequest): Future[CreateAcceleratorResponse] =
      service.createAccelerator(params).promise.toFuture
    def createEndpointGroupFuture(params: CreateEndpointGroupRequest): Future[CreateEndpointGroupResponse] =
      service.createEndpointGroup(params).promise.toFuture
    def createListenerFuture(params: CreateListenerRequest): Future[CreateListenerResponse] =
      service.createListener(params).promise.toFuture
    def deleteAcceleratorFuture(params: DeleteAcceleratorRequest): Future[js.Object] =
      service.deleteAccelerator(params).promise.toFuture
    def deleteEndpointGroupFuture(params: DeleteEndpointGroupRequest): Future[js.Object] =
      service.deleteEndpointGroup(params).promise.toFuture
    def deleteListenerFuture(params: DeleteListenerRequest): Future[js.Object] =
      service.deleteListener(params).promise.toFuture
    def describeAcceleratorAttributesFuture(
        params: DescribeAcceleratorAttributesRequest
    ): Future[DescribeAcceleratorAttributesResponse] = service.describeAcceleratorAttributes(params).promise.toFuture
    def describeAcceleratorFuture(params: DescribeAcceleratorRequest): Future[DescribeAcceleratorResponse] =
      service.describeAccelerator(params).promise.toFuture
    def describeEndpointGroupFuture(params: DescribeEndpointGroupRequest): Future[DescribeEndpointGroupResponse] =
      service.describeEndpointGroup(params).promise.toFuture
    def describeListenerFuture(params: DescribeListenerRequest): Future[DescribeListenerResponse] =
      service.describeListener(params).promise.toFuture
    def listAcceleratorsFuture(params: ListAcceleratorsRequest): Future[ListAcceleratorsResponse] =
      service.listAccelerators(params).promise.toFuture
    def listEndpointGroupsFuture(params: ListEndpointGroupsRequest): Future[ListEndpointGroupsResponse] =
      service.listEndpointGroups(params).promise.toFuture
    def listListenersFuture(params: ListListenersRequest): Future[ListListenersResponse] =
      service.listListeners(params).promise.toFuture
    def updateAcceleratorAttributesFuture(
        params: UpdateAcceleratorAttributesRequest
    ): Future[UpdateAcceleratorAttributesResponse] = service.updateAcceleratorAttributes(params).promise.toFuture
    def updateAcceleratorFuture(params: UpdateAcceleratorRequest): Future[UpdateAcceleratorResponse] =
      service.updateAccelerator(params).promise.toFuture
    def updateEndpointGroupFuture(params: UpdateEndpointGroupRequest): Future[UpdateEndpointGroupResponse] =
      service.updateEndpointGroup(params).promise.toFuture
    def updateListenerFuture(params: UpdateListenerRequest): Future[UpdateListenerResponse] =
      service.updateListener(params).promise.toFuture
  }
}

package globalaccelerator {
  @js.native
  @JSImport("aws-sdk", "GlobalAccelerator")
  class GlobalAccelerator() extends js.Object {
    def this(config: AWSConfig) = this()

    def createAccelerator(params: CreateAcceleratorRequest): Request[CreateAcceleratorResponse]       = js.native
    def createEndpointGroup(params: CreateEndpointGroupRequest): Request[CreateEndpointGroupResponse] = js.native
    def createListener(params: CreateListenerRequest): Request[CreateListenerResponse]                = js.native
    def deleteAccelerator(params: DeleteAcceleratorRequest): Request[js.Object]                       = js.native
    def deleteEndpointGroup(params: DeleteEndpointGroupRequest): Request[js.Object]                   = js.native
    def deleteListener(params: DeleteListenerRequest): Request[js.Object]                             = js.native
    def describeAccelerator(params: DescribeAcceleratorRequest): Request[DescribeAcceleratorResponse] = js.native
    def describeAcceleratorAttributes(
        params: DescribeAcceleratorAttributesRequest
    ): Request[DescribeAcceleratorAttributesResponse]                                                       = js.native
    def describeEndpointGroup(params: DescribeEndpointGroupRequest): Request[DescribeEndpointGroupResponse] = js.native
    def describeListener(params: DescribeListenerRequest): Request[DescribeListenerResponse]                = js.native
    def listAccelerators(params: ListAcceleratorsRequest): Request[ListAcceleratorsResponse]                = js.native
    def listEndpointGroups(params: ListEndpointGroupsRequest): Request[ListEndpointGroupsResponse]          = js.native
    def listListeners(params: ListListenersRequest): Request[ListListenersResponse]                         = js.native
    def updateAccelerator(params: UpdateAcceleratorRequest): Request[UpdateAcceleratorResponse]             = js.native
    def updateAcceleratorAttributes(
        params: UpdateAcceleratorAttributesRequest
    ): Request[UpdateAcceleratorAttributesResponse]                                                   = js.native
    def updateEndpointGroup(params: UpdateEndpointGroupRequest): Request[UpdateEndpointGroupResponse] = js.native
    def updateListener(params: UpdateListenerRequest): Request[UpdateListenerResponse]                = js.native
  }

  /**
    * An accelerator is a complex type that includes one or more listeners that process inbound connections and then direct traffic to one or more endpoint groups, each of which includes endpoints, such as load balancers.
    */
  @js.native
  trait Accelerator extends js.Object {
    var AcceleratorArn: js.UndefOr[GenericString]
    var CreatedTime: js.UndefOr[Timestamp]
    var Enabled: js.UndefOr[GenericBoolean]
    var IpAddressType: js.UndefOr[IpAddressType]
    var IpSets: js.UndefOr[IpSets]
    var LastModifiedTime: js.UndefOr[Timestamp]
    var Name: js.UndefOr[GenericString]
    var Status: js.UndefOr[AcceleratorStatus]
  }

  object Accelerator {
    def apply(
        AcceleratorArn: js.UndefOr[GenericString] = js.undefined,
        CreatedTime: js.UndefOr[Timestamp] = js.undefined,
        Enabled: js.UndefOr[GenericBoolean] = js.undefined,
        IpAddressType: js.UndefOr[IpAddressType] = js.undefined,
        IpSets: js.UndefOr[IpSets] = js.undefined,
        LastModifiedTime: js.UndefOr[Timestamp] = js.undefined,
        Name: js.UndefOr[GenericString] = js.undefined,
        Status: js.UndefOr[AcceleratorStatus] = js.undefined
    ): Accelerator = {
      val __obj = js.Dictionary.empty[js.Any]
      AcceleratorArn.foreach(__v => __obj.update("AcceleratorArn", __v.asInstanceOf[js.Any]))
      CreatedTime.foreach(__v => __obj.update("CreatedTime", __v.asInstanceOf[js.Any]))
      Enabled.foreach(__v => __obj.update("Enabled", __v.asInstanceOf[js.Any]))
      IpAddressType.foreach(__v => __obj.update("IpAddressType", __v.asInstanceOf[js.Any]))
      IpSets.foreach(__v => __obj.update("IpSets", __v.asInstanceOf[js.Any]))
      LastModifiedTime.foreach(__v => __obj.update("LastModifiedTime", __v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.update("Status", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Accelerator]
    }
  }

  /**
    * Attributes of an accelerator.
    */
  @js.native
  trait AcceleratorAttributes extends js.Object {
    var FlowLogsEnabled: js.UndefOr[GenericBoolean]
    var FlowLogsS3Bucket: js.UndefOr[GenericString]
    var FlowLogsS3Prefix: js.UndefOr[GenericString]
  }

  object AcceleratorAttributes {
    def apply(
        FlowLogsEnabled: js.UndefOr[GenericBoolean] = js.undefined,
        FlowLogsS3Bucket: js.UndefOr[GenericString] = js.undefined,
        FlowLogsS3Prefix: js.UndefOr[GenericString] = js.undefined
    ): AcceleratorAttributes = {
      val __obj = js.Dictionary.empty[js.Any]
      FlowLogsEnabled.foreach(__v => __obj.update("FlowLogsEnabled", __v.asInstanceOf[js.Any]))
      FlowLogsS3Bucket.foreach(__v => __obj.update("FlowLogsS3Bucket", __v.asInstanceOf[js.Any]))
      FlowLogsS3Prefix.foreach(__v => __obj.update("FlowLogsS3Prefix", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AcceleratorAttributes]
    }
  }

  object AcceleratorStatusEnum {
    val DEPLOYED    = "DEPLOYED"
    val IN_PROGRESS = "IN_PROGRESS"

    val values = js.Object.freeze(js.Array(DEPLOYED, IN_PROGRESS))
  }

  object ClientAffinityEnum {
    val NONE      = "NONE"
    val SOURCE_IP = "SOURCE_IP"

    val values = js.Object.freeze(js.Array(NONE, SOURCE_IP))
  }

  @js.native
  trait CreateAcceleratorRequest extends js.Object {
    var IdempotencyToken: IdempotencyToken
    var Name: GenericString
    var Enabled: js.UndefOr[GenericBoolean]
    var IpAddressType: js.UndefOr[IpAddressType]
  }

  object CreateAcceleratorRequest {
    def apply(
        IdempotencyToken: IdempotencyToken,
        Name: GenericString,
        Enabled: js.UndefOr[GenericBoolean] = js.undefined,
        IpAddressType: js.UndefOr[IpAddressType] = js.undefined
    ): CreateAcceleratorRequest = {
      val __obj = js.Dictionary[js.Any](
        "IdempotencyToken" -> IdempotencyToken.asInstanceOf[js.Any],
        "Name"             -> Name.asInstanceOf[js.Any]
      )

      Enabled.foreach(__v => __obj.update("Enabled", __v.asInstanceOf[js.Any]))
      IpAddressType.foreach(__v => __obj.update("IpAddressType", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateAcceleratorRequest]
    }
  }

  @js.native
  trait CreateAcceleratorResponse extends js.Object {
    var Accelerator: js.UndefOr[Accelerator]
  }

  object CreateAcceleratorResponse {
    def apply(
        Accelerator: js.UndefOr[Accelerator] = js.undefined
    ): CreateAcceleratorResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Accelerator.foreach(__v => __obj.update("Accelerator", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateAcceleratorResponse]
    }
  }

  @js.native
  trait CreateEndpointGroupRequest extends js.Object {
    var EndpointGroupRegion: GenericString
    var IdempotencyToken: IdempotencyToken
    var ListenerArn: GenericString
    var EndpointConfigurations: js.UndefOr[EndpointConfigurations]
    var HealthCheckIntervalSeconds: js.UndefOr[HealthCheckIntervalSeconds]
    var HealthCheckPath: js.UndefOr[GenericString]
    var HealthCheckPort: js.UndefOr[HealthCheckPort]
    var HealthCheckProtocol: js.UndefOr[HealthCheckProtocol]
    var ThresholdCount: js.UndefOr[ThresholdCount]
    var TrafficDialPercentage: js.UndefOr[TrafficDialPercentage]
  }

  object CreateEndpointGroupRequest {
    def apply(
        EndpointGroupRegion: GenericString,
        IdempotencyToken: IdempotencyToken,
        ListenerArn: GenericString,
        EndpointConfigurations: js.UndefOr[EndpointConfigurations] = js.undefined,
        HealthCheckIntervalSeconds: js.UndefOr[HealthCheckIntervalSeconds] = js.undefined,
        HealthCheckPath: js.UndefOr[GenericString] = js.undefined,
        HealthCheckPort: js.UndefOr[HealthCheckPort] = js.undefined,
        HealthCheckProtocol: js.UndefOr[HealthCheckProtocol] = js.undefined,
        ThresholdCount: js.UndefOr[ThresholdCount] = js.undefined,
        TrafficDialPercentage: js.UndefOr[TrafficDialPercentage] = js.undefined
    ): CreateEndpointGroupRequest = {
      val __obj = js.Dictionary[js.Any](
        "EndpointGroupRegion" -> EndpointGroupRegion.asInstanceOf[js.Any],
        "IdempotencyToken"    -> IdempotencyToken.asInstanceOf[js.Any],
        "ListenerArn"         -> ListenerArn.asInstanceOf[js.Any]
      )

      EndpointConfigurations.foreach(__v => __obj.update("EndpointConfigurations", __v.asInstanceOf[js.Any]))
      HealthCheckIntervalSeconds.foreach(__v => __obj.update("HealthCheckIntervalSeconds", __v.asInstanceOf[js.Any]))
      HealthCheckPath.foreach(__v => __obj.update("HealthCheckPath", __v.asInstanceOf[js.Any]))
      HealthCheckPort.foreach(__v => __obj.update("HealthCheckPort", __v.asInstanceOf[js.Any]))
      HealthCheckProtocol.foreach(__v => __obj.update("HealthCheckProtocol", __v.asInstanceOf[js.Any]))
      ThresholdCount.foreach(__v => __obj.update("ThresholdCount", __v.asInstanceOf[js.Any]))
      TrafficDialPercentage.foreach(__v => __obj.update("TrafficDialPercentage", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateEndpointGroupRequest]
    }
  }

  @js.native
  trait CreateEndpointGroupResponse extends js.Object {
    var EndpointGroup: js.UndefOr[EndpointGroup]
  }

  object CreateEndpointGroupResponse {
    def apply(
        EndpointGroup: js.UndefOr[EndpointGroup] = js.undefined
    ): CreateEndpointGroupResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      EndpointGroup.foreach(__v => __obj.update("EndpointGroup", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateEndpointGroupResponse]
    }
  }

  @js.native
  trait CreateListenerRequest extends js.Object {
    var AcceleratorArn: GenericString
    var IdempotencyToken: IdempotencyToken
    var PortRanges: PortRanges
    var Protocol: Protocol
    var ClientAffinity: js.UndefOr[ClientAffinity]
  }

  object CreateListenerRequest {
    def apply(
        AcceleratorArn: GenericString,
        IdempotencyToken: IdempotencyToken,
        PortRanges: PortRanges,
        Protocol: Protocol,
        ClientAffinity: js.UndefOr[ClientAffinity] = js.undefined
    ): CreateListenerRequest = {
      val __obj = js.Dictionary[js.Any](
        "AcceleratorArn"   -> AcceleratorArn.asInstanceOf[js.Any],
        "IdempotencyToken" -> IdempotencyToken.asInstanceOf[js.Any],
        "PortRanges"       -> PortRanges.asInstanceOf[js.Any],
        "Protocol"         -> Protocol.asInstanceOf[js.Any]
      )

      ClientAffinity.foreach(__v => __obj.update("ClientAffinity", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateListenerRequest]
    }
  }

  @js.native
  trait CreateListenerResponse extends js.Object {
    var Listener: js.UndefOr[Listener]
  }

  object CreateListenerResponse {
    def apply(
        Listener: js.UndefOr[Listener] = js.undefined
    ): CreateListenerResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Listener.foreach(__v => __obj.update("Listener", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateListenerResponse]
    }
  }

  @js.native
  trait DeleteAcceleratorRequest extends js.Object {
    var AcceleratorArn: GenericString
  }

  object DeleteAcceleratorRequest {
    def apply(
        AcceleratorArn: GenericString
    ): DeleteAcceleratorRequest = {
      val __obj = js.Dictionary[js.Any](
        "AcceleratorArn" -> AcceleratorArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteAcceleratorRequest]
    }
  }

  @js.native
  trait DeleteEndpointGroupRequest extends js.Object {
    var EndpointGroupArn: GenericString
  }

  object DeleteEndpointGroupRequest {
    def apply(
        EndpointGroupArn: GenericString
    ): DeleteEndpointGroupRequest = {
      val __obj = js.Dictionary[js.Any](
        "EndpointGroupArn" -> EndpointGroupArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteEndpointGroupRequest]
    }
  }

  @js.native
  trait DeleteListenerRequest extends js.Object {
    var ListenerArn: GenericString
  }

  object DeleteListenerRequest {
    def apply(
        ListenerArn: GenericString
    ): DeleteListenerRequest = {
      val __obj = js.Dictionary[js.Any](
        "ListenerArn" -> ListenerArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteListenerRequest]
    }
  }

  @js.native
  trait DescribeAcceleratorAttributesRequest extends js.Object {
    var AcceleratorArn: js.UndefOr[GenericString]
  }

  object DescribeAcceleratorAttributesRequest {
    def apply(
        AcceleratorArn: js.UndefOr[GenericString] = js.undefined
    ): DescribeAcceleratorAttributesRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      AcceleratorArn.foreach(__v => __obj.update("AcceleratorArn", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeAcceleratorAttributesRequest]
    }
  }

  @js.native
  trait DescribeAcceleratorAttributesResponse extends js.Object {
    var AcceleratorAttributes: js.UndefOr[AcceleratorAttributes]
  }

  object DescribeAcceleratorAttributesResponse {
    def apply(
        AcceleratorAttributes: js.UndefOr[AcceleratorAttributes] = js.undefined
    ): DescribeAcceleratorAttributesResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      AcceleratorAttributes.foreach(__v => __obj.update("AcceleratorAttributes", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeAcceleratorAttributesResponse]
    }
  }

  @js.native
  trait DescribeAcceleratorRequest extends js.Object {
    var AcceleratorArn: GenericString
  }

  object DescribeAcceleratorRequest {
    def apply(
        AcceleratorArn: GenericString
    ): DescribeAcceleratorRequest = {
      val __obj = js.Dictionary[js.Any](
        "AcceleratorArn" -> AcceleratorArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeAcceleratorRequest]
    }
  }

  @js.native
  trait DescribeAcceleratorResponse extends js.Object {
    var Accelerator: js.UndefOr[Accelerator]
  }

  object DescribeAcceleratorResponse {
    def apply(
        Accelerator: js.UndefOr[Accelerator] = js.undefined
    ): DescribeAcceleratorResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Accelerator.foreach(__v => __obj.update("Accelerator", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeAcceleratorResponse]
    }
  }

  @js.native
  trait DescribeEndpointGroupRequest extends js.Object {
    var EndpointGroupArn: GenericString
  }

  object DescribeEndpointGroupRequest {
    def apply(
        EndpointGroupArn: GenericString
    ): DescribeEndpointGroupRequest = {
      val __obj = js.Dictionary[js.Any](
        "EndpointGroupArn" -> EndpointGroupArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeEndpointGroupRequest]
    }
  }

  @js.native
  trait DescribeEndpointGroupResponse extends js.Object {
    var EndpointGroup: js.UndefOr[EndpointGroup]
  }

  object DescribeEndpointGroupResponse {
    def apply(
        EndpointGroup: js.UndefOr[EndpointGroup] = js.undefined
    ): DescribeEndpointGroupResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      EndpointGroup.foreach(__v => __obj.update("EndpointGroup", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeEndpointGroupResponse]
    }
  }

  @js.native
  trait DescribeListenerRequest extends js.Object {
    var ListenerArn: GenericString
  }

  object DescribeListenerRequest {
    def apply(
        ListenerArn: GenericString
    ): DescribeListenerRequest = {
      val __obj = js.Dictionary[js.Any](
        "ListenerArn" -> ListenerArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeListenerRequest]
    }
  }

  @js.native
  trait DescribeListenerResponse extends js.Object {
    var Listener: js.UndefOr[Listener]
  }

  object DescribeListenerResponse {
    def apply(
        Listener: js.UndefOr[Listener] = js.undefined
    ): DescribeListenerResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Listener.foreach(__v => __obj.update("Listener", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeListenerResponse]
    }
  }

  /**
    * A complex type for endpoints.
    */
  @js.native
  trait EndpointConfiguration extends js.Object {
    var EndpointId: js.UndefOr[GenericString]
    var Weight: js.UndefOr[EndpointWeight]
  }

  object EndpointConfiguration {
    def apply(
        EndpointId: js.UndefOr[GenericString] = js.undefined,
        Weight: js.UndefOr[EndpointWeight] = js.undefined
    ): EndpointConfiguration = {
      val __obj = js.Dictionary.empty[js.Any]
      EndpointId.foreach(__v => __obj.update("EndpointId", __v.asInstanceOf[js.Any]))
      Weight.foreach(__v => __obj.update("Weight", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EndpointConfiguration]
    }
  }

  /**
    * A complex type for an endpoint. Each endpoint group can include one or more endpoints, such as load balancers.
    */
  @js.native
  trait EndpointDescription extends js.Object {
    var EndpointId: js.UndefOr[GenericString]
    var HealthReason: js.UndefOr[GenericString]
    var HealthState: js.UndefOr[HealthState]
    var Weight: js.UndefOr[EndpointWeight]
  }

  object EndpointDescription {
    def apply(
        EndpointId: js.UndefOr[GenericString] = js.undefined,
        HealthReason: js.UndefOr[GenericString] = js.undefined,
        HealthState: js.UndefOr[HealthState] = js.undefined,
        Weight: js.UndefOr[EndpointWeight] = js.undefined
    ): EndpointDescription = {
      val __obj = js.Dictionary.empty[js.Any]
      EndpointId.foreach(__v => __obj.update("EndpointId", __v.asInstanceOf[js.Any]))
      HealthReason.foreach(__v => __obj.update("HealthReason", __v.asInstanceOf[js.Any]))
      HealthState.foreach(__v => __obj.update("HealthState", __v.asInstanceOf[js.Any]))
      Weight.foreach(__v => __obj.update("Weight", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EndpointDescription]
    }
  }

  /**
    * A complex type for the endpoint group. An AWS Region can have only one endpoint group for a specific listener.
    */
  @js.native
  trait EndpointGroup extends js.Object {
    var EndpointDescriptions: js.UndefOr[EndpointDescriptions]
    var EndpointGroupArn: js.UndefOr[GenericString]
    var EndpointGroupRegion: js.UndefOr[GenericString]
    var HealthCheckIntervalSeconds: js.UndefOr[HealthCheckIntervalSeconds]
    var HealthCheckPath: js.UndefOr[GenericString]
    var HealthCheckPort: js.UndefOr[HealthCheckPort]
    var HealthCheckProtocol: js.UndefOr[HealthCheckProtocol]
    var ThresholdCount: js.UndefOr[ThresholdCount]
    var TrafficDialPercentage: js.UndefOr[TrafficDialPercentage]
  }

  object EndpointGroup {
    def apply(
        EndpointDescriptions: js.UndefOr[EndpointDescriptions] = js.undefined,
        EndpointGroupArn: js.UndefOr[GenericString] = js.undefined,
        EndpointGroupRegion: js.UndefOr[GenericString] = js.undefined,
        HealthCheckIntervalSeconds: js.UndefOr[HealthCheckIntervalSeconds] = js.undefined,
        HealthCheckPath: js.UndefOr[GenericString] = js.undefined,
        HealthCheckPort: js.UndefOr[HealthCheckPort] = js.undefined,
        HealthCheckProtocol: js.UndefOr[HealthCheckProtocol] = js.undefined,
        ThresholdCount: js.UndefOr[ThresholdCount] = js.undefined,
        TrafficDialPercentage: js.UndefOr[TrafficDialPercentage] = js.undefined
    ): EndpointGroup = {
      val __obj = js.Dictionary.empty[js.Any]
      EndpointDescriptions.foreach(__v => __obj.update("EndpointDescriptions", __v.asInstanceOf[js.Any]))
      EndpointGroupArn.foreach(__v => __obj.update("EndpointGroupArn", __v.asInstanceOf[js.Any]))
      EndpointGroupRegion.foreach(__v => __obj.update("EndpointGroupRegion", __v.asInstanceOf[js.Any]))
      HealthCheckIntervalSeconds.foreach(__v => __obj.update("HealthCheckIntervalSeconds", __v.asInstanceOf[js.Any]))
      HealthCheckPath.foreach(__v => __obj.update("HealthCheckPath", __v.asInstanceOf[js.Any]))
      HealthCheckPort.foreach(__v => __obj.update("HealthCheckPort", __v.asInstanceOf[js.Any]))
      HealthCheckProtocol.foreach(__v => __obj.update("HealthCheckProtocol", __v.asInstanceOf[js.Any]))
      ThresholdCount.foreach(__v => __obj.update("ThresholdCount", __v.asInstanceOf[js.Any]))
      TrafficDialPercentage.foreach(__v => __obj.update("TrafficDialPercentage", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EndpointGroup]
    }
  }

  object HealthCheckProtocolEnum {
    val TCP   = "TCP"
    val HTTP  = "HTTP"
    val HTTPS = "HTTPS"

    val values = js.Object.freeze(js.Array(TCP, HTTP, HTTPS))
  }

  object HealthStateEnum {
    val INITIAL   = "INITIAL"
    val HEALTHY   = "HEALTHY"
    val UNHEALTHY = "UNHEALTHY"

    val values = js.Object.freeze(js.Array(INITIAL, HEALTHY, UNHEALTHY))
  }

  object IpAddressTypeEnum {
    val IPV4 = "IPV4"

    val values = js.Object.freeze(js.Array(IPV4))
  }

  /**
    * A complex type for the set of IP addresses for an accelerator.
    */
  @js.native
  trait IpSet extends js.Object {
    var IpAddresses: js.UndefOr[IpAddresses]
    var IpFamily: js.UndefOr[GenericString]
  }

  object IpSet {
    def apply(
        IpAddresses: js.UndefOr[IpAddresses] = js.undefined,
        IpFamily: js.UndefOr[GenericString] = js.undefined
    ): IpSet = {
      val __obj = js.Dictionary.empty[js.Any]
      IpAddresses.foreach(__v => __obj.update("IpAddresses", __v.asInstanceOf[js.Any]))
      IpFamily.foreach(__v => __obj.update("IpFamily", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[IpSet]
    }
  }

  @js.native
  trait ListAcceleratorsRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[GenericString]
  }

  object ListAcceleratorsRequest {
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[GenericString] = js.undefined
    ): ListAcceleratorsRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAcceleratorsRequest]
    }
  }

  @js.native
  trait ListAcceleratorsResponse extends js.Object {
    var Accelerators: js.UndefOr[Accelerators]
    var NextToken: js.UndefOr[GenericString]
  }

  object ListAcceleratorsResponse {
    def apply(
        Accelerators: js.UndefOr[Accelerators] = js.undefined,
        NextToken: js.UndefOr[GenericString] = js.undefined
    ): ListAcceleratorsResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Accelerators.foreach(__v => __obj.update("Accelerators", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAcceleratorsResponse]
    }
  }

  @js.native
  trait ListEndpointGroupsRequest extends js.Object {
    var ListenerArn: GenericString
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[GenericString]
  }

  object ListEndpointGroupsRequest {
    def apply(
        ListenerArn: GenericString,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[GenericString] = js.undefined
    ): ListEndpointGroupsRequest = {
      val __obj = js.Dictionary[js.Any](
        "ListenerArn" -> ListenerArn.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListEndpointGroupsRequest]
    }
  }

  @js.native
  trait ListEndpointGroupsResponse extends js.Object {
    var EndpointGroups: js.UndefOr[EndpointGroups]
    var NextToken: js.UndefOr[GenericString]
  }

  object ListEndpointGroupsResponse {
    def apply(
        EndpointGroups: js.UndefOr[EndpointGroups] = js.undefined,
        NextToken: js.UndefOr[GenericString] = js.undefined
    ): ListEndpointGroupsResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      EndpointGroups.foreach(__v => __obj.update("EndpointGroups", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListEndpointGroupsResponse]
    }
  }

  @js.native
  trait ListListenersRequest extends js.Object {
    var AcceleratorArn: GenericString
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[GenericString]
  }

  object ListListenersRequest {
    def apply(
        AcceleratorArn: GenericString,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[GenericString] = js.undefined
    ): ListListenersRequest = {
      val __obj = js.Dictionary[js.Any](
        "AcceleratorArn" -> AcceleratorArn.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListListenersRequest]
    }
  }

  @js.native
  trait ListListenersResponse extends js.Object {
    var Listeners: js.UndefOr[Listeners]
    var NextToken: js.UndefOr[GenericString]
  }

  object ListListenersResponse {
    def apply(
        Listeners: js.UndefOr[Listeners] = js.undefined,
        NextToken: js.UndefOr[GenericString] = js.undefined
    ): ListListenersResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Listeners.foreach(__v => __obj.update("Listeners", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListListenersResponse]
    }
  }

  /**
    * A complex type for a listener.
    */
  @js.native
  trait Listener extends js.Object {
    var ClientAffinity: js.UndefOr[ClientAffinity]
    var ListenerArn: js.UndefOr[GenericString]
    var PortRanges: js.UndefOr[PortRanges]
    var Protocol: js.UndefOr[Protocol]
  }

  object Listener {
    def apply(
        ClientAffinity: js.UndefOr[ClientAffinity] = js.undefined,
        ListenerArn: js.UndefOr[GenericString] = js.undefined,
        PortRanges: js.UndefOr[PortRanges] = js.undefined,
        Protocol: js.UndefOr[Protocol] = js.undefined
    ): Listener = {
      val __obj = js.Dictionary.empty[js.Any]
      ClientAffinity.foreach(__v => __obj.update("ClientAffinity", __v.asInstanceOf[js.Any]))
      ListenerArn.foreach(__v => __obj.update("ListenerArn", __v.asInstanceOf[js.Any]))
      PortRanges.foreach(__v => __obj.update("PortRanges", __v.asInstanceOf[js.Any]))
      Protocol.foreach(__v => __obj.update("Protocol", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Listener]
    }
  }

  /**
    * A complex type for a range of ports for a listener.
    */
  @js.native
  trait PortRange extends js.Object {
    var FromPort: js.UndefOr[PortNumber]
    var ToPort: js.UndefOr[PortNumber]
  }

  object PortRange {
    def apply(
        FromPort: js.UndefOr[PortNumber] = js.undefined,
        ToPort: js.UndefOr[PortNumber] = js.undefined
    ): PortRange = {
      val __obj = js.Dictionary.empty[js.Any]
      FromPort.foreach(__v => __obj.update("FromPort", __v.asInstanceOf[js.Any]))
      ToPort.foreach(__v => __obj.update("ToPort", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PortRange]
    }
  }

  object ProtocolEnum {
    val TCP = "TCP"
    val UDP = "UDP"

    val values = js.Object.freeze(js.Array(TCP, UDP))
  }

  @js.native
  trait UpdateAcceleratorAttributesRequest extends js.Object {
    var AcceleratorArn: js.UndefOr[GenericString]
    var FlowLogsEnabled: js.UndefOr[GenericBoolean]
    var FlowLogsS3Bucket: js.UndefOr[GenericString]
    var FlowLogsS3Prefix: js.UndefOr[GenericString]
  }

  object UpdateAcceleratorAttributesRequest {
    def apply(
        AcceleratorArn: js.UndefOr[GenericString] = js.undefined,
        FlowLogsEnabled: js.UndefOr[GenericBoolean] = js.undefined,
        FlowLogsS3Bucket: js.UndefOr[GenericString] = js.undefined,
        FlowLogsS3Prefix: js.UndefOr[GenericString] = js.undefined
    ): UpdateAcceleratorAttributesRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      AcceleratorArn.foreach(__v => __obj.update("AcceleratorArn", __v.asInstanceOf[js.Any]))
      FlowLogsEnabled.foreach(__v => __obj.update("FlowLogsEnabled", __v.asInstanceOf[js.Any]))
      FlowLogsS3Bucket.foreach(__v => __obj.update("FlowLogsS3Bucket", __v.asInstanceOf[js.Any]))
      FlowLogsS3Prefix.foreach(__v => __obj.update("FlowLogsS3Prefix", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateAcceleratorAttributesRequest]
    }
  }

  @js.native
  trait UpdateAcceleratorAttributesResponse extends js.Object {
    var AcceleratorAttributes: js.UndefOr[AcceleratorAttributes]
  }

  object UpdateAcceleratorAttributesResponse {
    def apply(
        AcceleratorAttributes: js.UndefOr[AcceleratorAttributes] = js.undefined
    ): UpdateAcceleratorAttributesResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      AcceleratorAttributes.foreach(__v => __obj.update("AcceleratorAttributes", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateAcceleratorAttributesResponse]
    }
  }

  @js.native
  trait UpdateAcceleratorRequest extends js.Object {
    var AcceleratorArn: GenericString
    var Enabled: js.UndefOr[GenericBoolean]
    var IpAddressType: js.UndefOr[IpAddressType]
    var Name: js.UndefOr[GenericString]
  }

  object UpdateAcceleratorRequest {
    def apply(
        AcceleratorArn: GenericString,
        Enabled: js.UndefOr[GenericBoolean] = js.undefined,
        IpAddressType: js.UndefOr[IpAddressType] = js.undefined,
        Name: js.UndefOr[GenericString] = js.undefined
    ): UpdateAcceleratorRequest = {
      val __obj = js.Dictionary[js.Any](
        "AcceleratorArn" -> AcceleratorArn.asInstanceOf[js.Any]
      )

      Enabled.foreach(__v => __obj.update("Enabled", __v.asInstanceOf[js.Any]))
      IpAddressType.foreach(__v => __obj.update("IpAddressType", __v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateAcceleratorRequest]
    }
  }

  @js.native
  trait UpdateAcceleratorResponse extends js.Object {
    var Accelerator: js.UndefOr[Accelerator]
  }

  object UpdateAcceleratorResponse {
    def apply(
        Accelerator: js.UndefOr[Accelerator] = js.undefined
    ): UpdateAcceleratorResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Accelerator.foreach(__v => __obj.update("Accelerator", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateAcceleratorResponse]
    }
  }

  @js.native
  trait UpdateEndpointGroupRequest extends js.Object {
    var EndpointGroupArn: GenericString
    var EndpointConfigurations: js.UndefOr[EndpointConfigurations]
    var HealthCheckIntervalSeconds: js.UndefOr[HealthCheckIntervalSeconds]
    var HealthCheckPath: js.UndefOr[GenericString]
    var HealthCheckPort: js.UndefOr[HealthCheckPort]
    var HealthCheckProtocol: js.UndefOr[HealthCheckProtocol]
    var ThresholdCount: js.UndefOr[ThresholdCount]
    var TrafficDialPercentage: js.UndefOr[TrafficDialPercentage]
  }

  object UpdateEndpointGroupRequest {
    def apply(
        EndpointGroupArn: GenericString,
        EndpointConfigurations: js.UndefOr[EndpointConfigurations] = js.undefined,
        HealthCheckIntervalSeconds: js.UndefOr[HealthCheckIntervalSeconds] = js.undefined,
        HealthCheckPath: js.UndefOr[GenericString] = js.undefined,
        HealthCheckPort: js.UndefOr[HealthCheckPort] = js.undefined,
        HealthCheckProtocol: js.UndefOr[HealthCheckProtocol] = js.undefined,
        ThresholdCount: js.UndefOr[ThresholdCount] = js.undefined,
        TrafficDialPercentage: js.UndefOr[TrafficDialPercentage] = js.undefined
    ): UpdateEndpointGroupRequest = {
      val __obj = js.Dictionary[js.Any](
        "EndpointGroupArn" -> EndpointGroupArn.asInstanceOf[js.Any]
      )

      EndpointConfigurations.foreach(__v => __obj.update("EndpointConfigurations", __v.asInstanceOf[js.Any]))
      HealthCheckIntervalSeconds.foreach(__v => __obj.update("HealthCheckIntervalSeconds", __v.asInstanceOf[js.Any]))
      HealthCheckPath.foreach(__v => __obj.update("HealthCheckPath", __v.asInstanceOf[js.Any]))
      HealthCheckPort.foreach(__v => __obj.update("HealthCheckPort", __v.asInstanceOf[js.Any]))
      HealthCheckProtocol.foreach(__v => __obj.update("HealthCheckProtocol", __v.asInstanceOf[js.Any]))
      ThresholdCount.foreach(__v => __obj.update("ThresholdCount", __v.asInstanceOf[js.Any]))
      TrafficDialPercentage.foreach(__v => __obj.update("TrafficDialPercentage", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateEndpointGroupRequest]
    }
  }

  @js.native
  trait UpdateEndpointGroupResponse extends js.Object {
    var EndpointGroup: js.UndefOr[EndpointGroup]
  }

  object UpdateEndpointGroupResponse {
    def apply(
        EndpointGroup: js.UndefOr[EndpointGroup] = js.undefined
    ): UpdateEndpointGroupResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      EndpointGroup.foreach(__v => __obj.update("EndpointGroup", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateEndpointGroupResponse]
    }
  }

  @js.native
  trait UpdateListenerRequest extends js.Object {
    var ListenerArn: GenericString
    var ClientAffinity: js.UndefOr[ClientAffinity]
    var PortRanges: js.UndefOr[PortRanges]
    var Protocol: js.UndefOr[Protocol]
  }

  object UpdateListenerRequest {
    def apply(
        ListenerArn: GenericString,
        ClientAffinity: js.UndefOr[ClientAffinity] = js.undefined,
        PortRanges: js.UndefOr[PortRanges] = js.undefined,
        Protocol: js.UndefOr[Protocol] = js.undefined
    ): UpdateListenerRequest = {
      val __obj = js.Dictionary[js.Any](
        "ListenerArn" -> ListenerArn.asInstanceOf[js.Any]
      )

      ClientAffinity.foreach(__v => __obj.update("ClientAffinity", __v.asInstanceOf[js.Any]))
      PortRanges.foreach(__v => __obj.update("PortRanges", __v.asInstanceOf[js.Any]))
      Protocol.foreach(__v => __obj.update("Protocol", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateListenerRequest]
    }
  }

  @js.native
  trait UpdateListenerResponse extends js.Object {
    var Listener: js.UndefOr[Listener]
  }

  object UpdateListenerResponse {
    def apply(
        Listener: js.UndefOr[Listener] = js.undefined
    ): UpdateListenerResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Listener.foreach(__v => __obj.update("Listener", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateListenerResponse]
    }
  }
}
