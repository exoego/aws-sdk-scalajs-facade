package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object globalaccelerator {
  type Accelerators               = js.Array[Accelerator]
  type EndpointConfigurations     = js.Array[EndpointConfiguration]
  type EndpointDescriptions       = js.Array[EndpointDescription]
  type EndpointGroups             = js.Array[EndpointGroup]
  type EndpointWeight             = Int
  type GenericBoolean             = Boolean
  type GenericString              = String
  type HealthCheckIntervalSeconds = Int
  type HealthCheckPort            = Int
  type IdempotencyToken           = String
  type IpAddress                  = String
  type IpAddresses                = js.Array[IpAddress]
  type IpSets                     = js.Array[IpSet]
  type Listeners                  = js.Array[Listener]
  type MaxResults                 = Int
  type PortNumber                 = Int
  type PortRanges                 = js.Array[PortRange]
  type ThresholdCount             = Int
  type Timestamp                  = js.Date
  type TrafficDialPercentage      = Float

  implicit final class GlobalAcceleratorOps(private val service: GlobalAccelerator) extends AnyVal {

    @inline def createAcceleratorFuture(params: CreateAcceleratorRequest): Future[CreateAcceleratorResponse] =
      service.createAccelerator(params).promise().toFuture
    @inline def createEndpointGroupFuture(params: CreateEndpointGroupRequest): Future[CreateEndpointGroupResponse] =
      service.createEndpointGroup(params).promise().toFuture
    @inline def createListenerFuture(params: CreateListenerRequest): Future[CreateListenerResponse] =
      service.createListener(params).promise().toFuture
    @inline def deleteAcceleratorFuture(params: DeleteAcceleratorRequest): Future[js.Object] =
      service.deleteAccelerator(params).promise().toFuture
    @inline def deleteEndpointGroupFuture(params: DeleteEndpointGroupRequest): Future[js.Object] =
      service.deleteEndpointGroup(params).promise().toFuture
    @inline def deleteListenerFuture(params: DeleteListenerRequest): Future[js.Object] =
      service.deleteListener(params).promise().toFuture
    @inline def describeAcceleratorAttributesFuture(
        params: DescribeAcceleratorAttributesRequest
    ): Future[DescribeAcceleratorAttributesResponse] = service.describeAcceleratorAttributes(params).promise().toFuture
    @inline def describeAcceleratorFuture(params: DescribeAcceleratorRequest): Future[DescribeAcceleratorResponse] =
      service.describeAccelerator(params).promise().toFuture
    @inline def describeEndpointGroupFuture(
        params: DescribeEndpointGroupRequest
    ): Future[DescribeEndpointGroupResponse] = service.describeEndpointGroup(params).promise().toFuture
    @inline def describeListenerFuture(params: DescribeListenerRequest): Future[DescribeListenerResponse] =
      service.describeListener(params).promise().toFuture
    @inline def listAcceleratorsFuture(params: ListAcceleratorsRequest): Future[ListAcceleratorsResponse] =
      service.listAccelerators(params).promise().toFuture
    @inline def listEndpointGroupsFuture(params: ListEndpointGroupsRequest): Future[ListEndpointGroupsResponse] =
      service.listEndpointGroups(params).promise().toFuture
    @inline def listListenersFuture(params: ListListenersRequest): Future[ListListenersResponse] =
      service.listListeners(params).promise().toFuture
    @inline def updateAcceleratorAttributesFuture(
        params: UpdateAcceleratorAttributesRequest
    ): Future[UpdateAcceleratorAttributesResponse] = service.updateAcceleratorAttributes(params).promise().toFuture
    @inline def updateAcceleratorFuture(params: UpdateAcceleratorRequest): Future[UpdateAcceleratorResponse] =
      service.updateAccelerator(params).promise().toFuture
    @inline def updateEndpointGroupFuture(params: UpdateEndpointGroupRequest): Future[UpdateEndpointGroupResponse] =
      service.updateEndpointGroup(params).promise().toFuture
    @inline def updateListenerFuture(params: UpdateListenerRequest): Future[UpdateListenerResponse] =
      service.updateListener(params).promise().toFuture
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
  @Factory
  trait Accelerator extends js.Object {
    var AcceleratorArn: js.UndefOr[GenericString]
    var CreatedTime: js.UndefOr[Timestamp]
    var DnsName: js.UndefOr[GenericString]
    var Enabled: js.UndefOr[GenericBoolean]
    var IpAddressType: js.UndefOr[IpAddressType]
    var IpSets: js.UndefOr[IpSets]
    var LastModifiedTime: js.UndefOr[Timestamp]
    var Name: js.UndefOr[GenericString]
    var Status: js.UndefOr[AcceleratorStatus]
  }

  /**
    * Attributes of an accelerator.
    */
  @js.native
  @Factory
  trait AcceleratorAttributes extends js.Object {
    var FlowLogsEnabled: js.UndefOr[GenericBoolean]
    var FlowLogsS3Bucket: js.UndefOr[GenericString]
    var FlowLogsS3Prefix: js.UndefOr[GenericString]
  }

  @js.native
  sealed trait AcceleratorStatus extends js.Any
  object AcceleratorStatus extends js.Object {
    val DEPLOYED    = "DEPLOYED".asInstanceOf[AcceleratorStatus]
    val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[AcceleratorStatus]

    val values = js.Object.freeze(js.Array(DEPLOYED, IN_PROGRESS))
  }

  @js.native
  sealed trait ClientAffinity extends js.Any
  object ClientAffinity extends js.Object {
    val NONE      = "NONE".asInstanceOf[ClientAffinity]
    val SOURCE_IP = "SOURCE_IP".asInstanceOf[ClientAffinity]

    val values = js.Object.freeze(js.Array(NONE, SOURCE_IP))
  }

  @js.native
  @Factory
  trait CreateAcceleratorRequest extends js.Object {
    var IdempotencyToken: IdempotencyToken
    var Name: GenericString
    var Enabled: js.UndefOr[GenericBoolean]
    var IpAddressType: js.UndefOr[IpAddressType]
  }

  @js.native
  @Factory
  trait CreateAcceleratorResponse extends js.Object {
    var Accelerator: js.UndefOr[Accelerator]
  }

  @js.native
  @Factory
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

  @js.native
  @Factory
  trait CreateEndpointGroupResponse extends js.Object {
    var EndpointGroup: js.UndefOr[EndpointGroup]
  }

  @js.native
  @Factory
  trait CreateListenerRequest extends js.Object {
    var AcceleratorArn: GenericString
    var IdempotencyToken: IdempotencyToken
    var PortRanges: PortRanges
    var Protocol: Protocol
    var ClientAffinity: js.UndefOr[ClientAffinity]
  }

  @js.native
  @Factory
  trait CreateListenerResponse extends js.Object {
    var Listener: js.UndefOr[Listener]
  }

  @js.native
  @Factory
  trait DeleteAcceleratorRequest extends js.Object {
    var AcceleratorArn: GenericString
  }

  @js.native
  @Factory
  trait DeleteEndpointGroupRequest extends js.Object {
    var EndpointGroupArn: GenericString
  }

  @js.native
  @Factory
  trait DeleteListenerRequest extends js.Object {
    var ListenerArn: GenericString
  }

  @js.native
  @Factory
  trait DescribeAcceleratorAttributesRequest extends js.Object {
    var AcceleratorArn: GenericString
  }

  @js.native
  @Factory
  trait DescribeAcceleratorAttributesResponse extends js.Object {
    var AcceleratorAttributes: js.UndefOr[AcceleratorAttributes]
  }

  @js.native
  @Factory
  trait DescribeAcceleratorRequest extends js.Object {
    var AcceleratorArn: GenericString
  }

  @js.native
  @Factory
  trait DescribeAcceleratorResponse extends js.Object {
    var Accelerator: js.UndefOr[Accelerator]
  }

  @js.native
  @Factory
  trait DescribeEndpointGroupRequest extends js.Object {
    var EndpointGroupArn: GenericString
  }

  @js.native
  @Factory
  trait DescribeEndpointGroupResponse extends js.Object {
    var EndpointGroup: js.UndefOr[EndpointGroup]
  }

  @js.native
  @Factory
  trait DescribeListenerRequest extends js.Object {
    var ListenerArn: GenericString
  }

  @js.native
  @Factory
  trait DescribeListenerResponse extends js.Object {
    var Listener: js.UndefOr[Listener]
  }

  /**
    * A complex type for endpoints.
    */
  @js.native
  @Factory
  trait EndpointConfiguration extends js.Object {
    var ClientIPPreservationEnabled: js.UndefOr[GenericBoolean]
    var EndpointId: js.UndefOr[GenericString]
    var Weight: js.UndefOr[EndpointWeight]
  }

  /**
    * A complex type for an endpoint. Each endpoint group can include one or more endpoints, such as load balancers.
    */
  @js.native
  @Factory
  trait EndpointDescription extends js.Object {
    var ClientIPPreservationEnabled: js.UndefOr[GenericBoolean]
    var EndpointId: js.UndefOr[GenericString]
    var HealthReason: js.UndefOr[GenericString]
    var HealthState: js.UndefOr[HealthState]
    var Weight: js.UndefOr[EndpointWeight]
  }

  /**
    * A complex type for the endpoint group. An AWS Region can have only one endpoint group for a specific listener.
    */
  @js.native
  @Factory
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

  @js.native
  sealed trait HealthCheckProtocol extends js.Any
  object HealthCheckProtocol extends js.Object {
    val TCP   = "TCP".asInstanceOf[HealthCheckProtocol]
    val HTTP  = "HTTP".asInstanceOf[HealthCheckProtocol]
    val HTTPS = "HTTPS".asInstanceOf[HealthCheckProtocol]

    val values = js.Object.freeze(js.Array(TCP, HTTP, HTTPS))
  }

  @js.native
  sealed trait HealthState extends js.Any
  object HealthState extends js.Object {
    val INITIAL   = "INITIAL".asInstanceOf[HealthState]
    val HEALTHY   = "HEALTHY".asInstanceOf[HealthState]
    val UNHEALTHY = "UNHEALTHY".asInstanceOf[HealthState]

    val values = js.Object.freeze(js.Array(INITIAL, HEALTHY, UNHEALTHY))
  }

  @js.native
  sealed trait IpAddressType extends js.Any
  object IpAddressType extends js.Object {
    val IPV4 = "IPV4".asInstanceOf[IpAddressType]

    val values = js.Object.freeze(js.Array(IPV4))
  }

  /**
    * A complex type for the set of IP addresses for an accelerator.
    */
  @js.native
  @Factory
  trait IpSet extends js.Object {
    var IpAddresses: js.UndefOr[IpAddresses]
    var IpFamily: js.UndefOr[GenericString]
  }

  @js.native
  @Factory
  trait ListAcceleratorsRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[GenericString]
  }

  @js.native
  @Factory
  trait ListAcceleratorsResponse extends js.Object {
    var Accelerators: js.UndefOr[Accelerators]
    var NextToken: js.UndefOr[GenericString]
  }

  @js.native
  @Factory
  trait ListEndpointGroupsRequest extends js.Object {
    var ListenerArn: GenericString
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[GenericString]
  }

  @js.native
  @Factory
  trait ListEndpointGroupsResponse extends js.Object {
    var EndpointGroups: js.UndefOr[EndpointGroups]
    var NextToken: js.UndefOr[GenericString]
  }

  @js.native
  @Factory
  trait ListListenersRequest extends js.Object {
    var AcceleratorArn: GenericString
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[GenericString]
  }

  @js.native
  @Factory
  trait ListListenersResponse extends js.Object {
    var Listeners: js.UndefOr[Listeners]
    var NextToken: js.UndefOr[GenericString]
  }

  /**
    * A complex type for a listener.
    */
  @js.native
  @Factory
  trait Listener extends js.Object {
    var ClientAffinity: js.UndefOr[ClientAffinity]
    var ListenerArn: js.UndefOr[GenericString]
    var PortRanges: js.UndefOr[PortRanges]
    var Protocol: js.UndefOr[Protocol]
  }

  /**
    * A complex type for a range of ports for a listener.
    */
  @js.native
  @Factory
  trait PortRange extends js.Object {
    var FromPort: js.UndefOr[PortNumber]
    var ToPort: js.UndefOr[PortNumber]
  }

  @js.native
  sealed trait Protocol extends js.Any
  object Protocol extends js.Object {
    val TCP = "TCP".asInstanceOf[Protocol]
    val UDP = "UDP".asInstanceOf[Protocol]

    val values = js.Object.freeze(js.Array(TCP, UDP))
  }

  @js.native
  @Factory
  trait UpdateAcceleratorAttributesRequest extends js.Object {
    var AcceleratorArn: GenericString
    var FlowLogsEnabled: js.UndefOr[GenericBoolean]
    var FlowLogsS3Bucket: js.UndefOr[GenericString]
    var FlowLogsS3Prefix: js.UndefOr[GenericString]
  }

  @js.native
  @Factory
  trait UpdateAcceleratorAttributesResponse extends js.Object {
    var AcceleratorAttributes: js.UndefOr[AcceleratorAttributes]
  }

  @js.native
  @Factory
  trait UpdateAcceleratorRequest extends js.Object {
    var AcceleratorArn: GenericString
    var Enabled: js.UndefOr[GenericBoolean]
    var IpAddressType: js.UndefOr[IpAddressType]
    var Name: js.UndefOr[GenericString]
  }

  @js.native
  @Factory
  trait UpdateAcceleratorResponse extends js.Object {
    var Accelerator: js.UndefOr[Accelerator]
  }

  @js.native
  @Factory
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

  @js.native
  @Factory
  trait UpdateEndpointGroupResponse extends js.Object {
    var EndpointGroup: js.UndefOr[EndpointGroup]
  }

  @js.native
  @Factory
  trait UpdateListenerRequest extends js.Object {
    var ListenerArn: GenericString
    var ClientAffinity: js.UndefOr[ClientAffinity]
    var PortRanges: js.UndefOr[PortRanges]
    var Protocol: js.UndefOr[Protocol]
  }

  @js.native
  @Factory
  trait UpdateListenerResponse extends js.Object {
    var Listener: js.UndefOr[Listener]
  }
}
