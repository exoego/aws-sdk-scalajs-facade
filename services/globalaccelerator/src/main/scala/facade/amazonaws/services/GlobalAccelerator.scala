package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

package object globalaccelerator {
  type Accelerators = js.Array[Accelerator]
  type ByoipCidrEvents = js.Array[ByoipCidrEvent]
  type ByoipCidrs = js.Array[ByoipCidr]
  type EndpointConfigurations = js.Array[EndpointConfiguration]
  type EndpointDescriptions = js.Array[EndpointDescription]
  type EndpointGroups = js.Array[EndpointGroup]
  type EndpointWeight = Int
  type GenericBoolean = Boolean
  type GenericString = String
  type HealthCheckIntervalSeconds = Int
  type HealthCheckPort = Int
  type IdempotencyToken = String
  type IpAddress = String
  type IpAddresses = js.Array[IpAddress]
  type IpSets = js.Array[IpSet]
  type Listeners = js.Array[Listener]
  type MaxResults = Int
  type PortNumber = Int
  type PortOverrides = js.Array[PortOverride]
  type PortRanges = js.Array[PortRange]
  type ResourceArn = String
  type TagKey = String
  type TagKeys = js.Array[TagKey]
  type TagValue = String
  type Tags = js.Array[Tag]
  type ThresholdCount = Int
  type Timestamp = js.Date
  type TrafficDialPercentage = Float

  implicit final class GlobalAcceleratorOps(private val service: GlobalAccelerator) extends AnyVal {

    @inline def advertiseByoipCidrFuture(params: AdvertiseByoipCidrRequest): Future[AdvertiseByoipCidrResponse] = service.advertiseByoipCidr(params).promise().toFuture
    @inline def createAcceleratorFuture(params: CreateAcceleratorRequest): Future[CreateAcceleratorResponse] = service.createAccelerator(params).promise().toFuture
    @inline def createEndpointGroupFuture(params: CreateEndpointGroupRequest): Future[CreateEndpointGroupResponse] = service.createEndpointGroup(params).promise().toFuture
    @inline def createListenerFuture(params: CreateListenerRequest): Future[CreateListenerResponse] = service.createListener(params).promise().toFuture
    @inline def deleteAcceleratorFuture(params: DeleteAcceleratorRequest): Future[js.Object] = service.deleteAccelerator(params).promise().toFuture
    @inline def deleteEndpointGroupFuture(params: DeleteEndpointGroupRequest): Future[js.Object] = service.deleteEndpointGroup(params).promise().toFuture
    @inline def deleteListenerFuture(params: DeleteListenerRequest): Future[js.Object] = service.deleteListener(params).promise().toFuture
    @inline def deprovisionByoipCidrFuture(params: DeprovisionByoipCidrRequest): Future[DeprovisionByoipCidrResponse] = service.deprovisionByoipCidr(params).promise().toFuture
    @inline def describeAcceleratorAttributesFuture(params: DescribeAcceleratorAttributesRequest): Future[DescribeAcceleratorAttributesResponse] = service.describeAcceleratorAttributes(params).promise().toFuture
    @inline def describeAcceleratorFuture(params: DescribeAcceleratorRequest): Future[DescribeAcceleratorResponse] = service.describeAccelerator(params).promise().toFuture
    @inline def describeEndpointGroupFuture(params: DescribeEndpointGroupRequest): Future[DescribeEndpointGroupResponse] = service.describeEndpointGroup(params).promise().toFuture
    @inline def describeListenerFuture(params: DescribeListenerRequest): Future[DescribeListenerResponse] = service.describeListener(params).promise().toFuture
    @inline def listAcceleratorsFuture(params: ListAcceleratorsRequest): Future[ListAcceleratorsResponse] = service.listAccelerators(params).promise().toFuture
    @inline def listByoipCidrsFuture(params: ListByoipCidrsRequest): Future[ListByoipCidrsResponse] = service.listByoipCidrs(params).promise().toFuture
    @inline def listEndpointGroupsFuture(params: ListEndpointGroupsRequest): Future[ListEndpointGroupsResponse] = service.listEndpointGroups(params).promise().toFuture
    @inline def listListenersFuture(params: ListListenersRequest): Future[ListListenersResponse] = service.listListeners(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] = service.listTagsForResource(params).promise().toFuture
    @inline def provisionByoipCidrFuture(params: ProvisionByoipCidrRequest): Future[ProvisionByoipCidrResponse] = service.provisionByoipCidr(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] = service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] = service.untagResource(params).promise().toFuture
    @inline def updateAcceleratorAttributesFuture(params: UpdateAcceleratorAttributesRequest): Future[UpdateAcceleratorAttributesResponse] = service.updateAcceleratorAttributes(params).promise().toFuture
    @inline def updateAcceleratorFuture(params: UpdateAcceleratorRequest): Future[UpdateAcceleratorResponse] = service.updateAccelerator(params).promise().toFuture
    @inline def updateEndpointGroupFuture(params: UpdateEndpointGroupRequest): Future[UpdateEndpointGroupResponse] = service.updateEndpointGroup(params).promise().toFuture
    @inline def updateListenerFuture(params: UpdateListenerRequest): Future[UpdateListenerResponse] = service.updateListener(params).promise().toFuture
    @inline def withdrawByoipCidrFuture(params: WithdrawByoipCidrRequest): Future[WithdrawByoipCidrResponse] = service.withdrawByoipCidr(params).promise().toFuture

  }
}

package globalaccelerator {
  @js.native
  @JSImport("aws-sdk/clients/globalaccelerator", JSImport.Namespace, "AWS.GlobalAccelerator")
  class GlobalAccelerator() extends js.Object {
    def this(config: AWSConfig) = this()

    def advertiseByoipCidr(params: AdvertiseByoipCidrRequest): Request[AdvertiseByoipCidrResponse] = js.native
    def createAccelerator(params: CreateAcceleratorRequest): Request[CreateAcceleratorResponse] = js.native
    def createEndpointGroup(params: CreateEndpointGroupRequest): Request[CreateEndpointGroupResponse] = js.native
    def createListener(params: CreateListenerRequest): Request[CreateListenerResponse] = js.native
    def deleteAccelerator(params: DeleteAcceleratorRequest): Request[js.Object] = js.native
    def deleteEndpointGroup(params: DeleteEndpointGroupRequest): Request[js.Object] = js.native
    def deleteListener(params: DeleteListenerRequest): Request[js.Object] = js.native
    def deprovisionByoipCidr(params: DeprovisionByoipCidrRequest): Request[DeprovisionByoipCidrResponse] = js.native
    def describeAccelerator(params: DescribeAcceleratorRequest): Request[DescribeAcceleratorResponse] = js.native
    def describeAcceleratorAttributes(params: DescribeAcceleratorAttributesRequest): Request[DescribeAcceleratorAttributesResponse] = js.native
    def describeEndpointGroup(params: DescribeEndpointGroupRequest): Request[DescribeEndpointGroupResponse] = js.native
    def describeListener(params: DescribeListenerRequest): Request[DescribeListenerResponse] = js.native
    def listAccelerators(params: ListAcceleratorsRequest): Request[ListAcceleratorsResponse] = js.native
    def listByoipCidrs(params: ListByoipCidrsRequest): Request[ListByoipCidrsResponse] = js.native
    def listEndpointGroups(params: ListEndpointGroupsRequest): Request[ListEndpointGroupsResponse] = js.native
    def listListeners(params: ListListenersRequest): Request[ListListenersResponse] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def provisionByoipCidr(params: ProvisionByoipCidrRequest): Request[ProvisionByoipCidrResponse] = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse] = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse] = js.native
    def updateAccelerator(params: UpdateAcceleratorRequest): Request[UpdateAcceleratorResponse] = js.native
    def updateAcceleratorAttributes(params: UpdateAcceleratorAttributesRequest): Request[UpdateAcceleratorAttributesResponse] = js.native
    def updateEndpointGroup(params: UpdateEndpointGroupRequest): Request[UpdateEndpointGroupResponse] = js.native
    def updateListener(params: UpdateListenerRequest): Request[UpdateListenerResponse] = js.native
    def withdrawByoipCidr(params: WithdrawByoipCidrRequest): Request[WithdrawByoipCidrResponse] = js.native
  }

  /** An accelerator is a complex type that includes one or more listeners that process inbound connections and then direct traffic to one or more endpoint groups, each of which includes endpoints, such as load balancers.
    */
  @js.native
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

  object Accelerator {
    @inline
    def apply(
        AcceleratorArn: js.UndefOr[GenericString] = js.undefined,
        CreatedTime: js.UndefOr[Timestamp] = js.undefined,
        DnsName: js.UndefOr[GenericString] = js.undefined,
        Enabled: js.UndefOr[GenericBoolean] = js.undefined,
        IpAddressType: js.UndefOr[IpAddressType] = js.undefined,
        IpSets: js.UndefOr[IpSets] = js.undefined,
        LastModifiedTime: js.UndefOr[Timestamp] = js.undefined,
        Name: js.UndefOr[GenericString] = js.undefined,
        Status: js.UndefOr[AcceleratorStatus] = js.undefined
    ): Accelerator = {
      val __obj = js.Dynamic.literal()
      AcceleratorArn.foreach(__v => __obj.updateDynamic("AcceleratorArn")(__v.asInstanceOf[js.Any]))
      CreatedTime.foreach(__v => __obj.updateDynamic("CreatedTime")(__v.asInstanceOf[js.Any]))
      DnsName.foreach(__v => __obj.updateDynamic("DnsName")(__v.asInstanceOf[js.Any]))
      Enabled.foreach(__v => __obj.updateDynamic("Enabled")(__v.asInstanceOf[js.Any]))
      IpAddressType.foreach(__v => __obj.updateDynamic("IpAddressType")(__v.asInstanceOf[js.Any]))
      IpSets.foreach(__v => __obj.updateDynamic("IpSets")(__v.asInstanceOf[js.Any]))
      LastModifiedTime.foreach(__v => __obj.updateDynamic("LastModifiedTime")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Accelerator]
    }
  }

  /** Attributes of an accelerator.
    */
  @js.native
  trait AcceleratorAttributes extends js.Object {
    var FlowLogsEnabled: js.UndefOr[GenericBoolean]
    var FlowLogsS3Bucket: js.UndefOr[GenericString]
    var FlowLogsS3Prefix: js.UndefOr[GenericString]
  }

  object AcceleratorAttributes {
    @inline
    def apply(
        FlowLogsEnabled: js.UndefOr[GenericBoolean] = js.undefined,
        FlowLogsS3Bucket: js.UndefOr[GenericString] = js.undefined,
        FlowLogsS3Prefix: js.UndefOr[GenericString] = js.undefined
    ): AcceleratorAttributes = {
      val __obj = js.Dynamic.literal()
      FlowLogsEnabled.foreach(__v => __obj.updateDynamic("FlowLogsEnabled")(__v.asInstanceOf[js.Any]))
      FlowLogsS3Bucket.foreach(__v => __obj.updateDynamic("FlowLogsS3Bucket")(__v.asInstanceOf[js.Any]))
      FlowLogsS3Prefix.foreach(__v => __obj.updateDynamic("FlowLogsS3Prefix")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AcceleratorAttributes]
    }
  }

  @js.native
  sealed trait AcceleratorStatus extends js.Any
  object AcceleratorStatus {
    val DEPLOYED = "DEPLOYED".asInstanceOf[AcceleratorStatus]
    val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[AcceleratorStatus]

    @inline def values = js.Array(DEPLOYED, IN_PROGRESS)
  }

  @js.native
  trait AdvertiseByoipCidrRequest extends js.Object {
    var Cidr: GenericString
  }

  object AdvertiseByoipCidrRequest {
    @inline
    def apply(
        Cidr: GenericString
    ): AdvertiseByoipCidrRequest = {
      val __obj = js.Dynamic.literal(
        "Cidr" -> Cidr.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AdvertiseByoipCidrRequest]
    }
  }

  @js.native
  trait AdvertiseByoipCidrResponse extends js.Object {
    var ByoipCidr: js.UndefOr[ByoipCidr]
  }

  object AdvertiseByoipCidrResponse {
    @inline
    def apply(
        ByoipCidr: js.UndefOr[ByoipCidr] = js.undefined
    ): AdvertiseByoipCidrResponse = {
      val __obj = js.Dynamic.literal()
      ByoipCidr.foreach(__v => __obj.updateDynamic("ByoipCidr")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AdvertiseByoipCidrResponse]
    }
  }

  /** Information about an IP address range that is provisioned for use with your AWS resources through bring your own IP address (BYOIP).
    * The following describes each BYOIP <code>State</code> that your IP address range can be in.
    * * ```PENDING_PROVISIONING``` — You’ve submitted a request to provision an IP address range but it is not yet provisioned with AWS Global Accelerator.
    * * ```READY``` — The address range is provisioned with AWS Global Accelerator and can be advertised.
    * * ```PENDING_ADVERTISING``` — You’ve submitted a request for AWS Global Accelerator to advertise an address range but it is not yet being advertised.
    * * ```ADVERTISING``` — The address range is being advertised by AWS Global Accelerator.
    * * ```PENDING_WITHDRAWING``` — You’ve submitted a request to withdraw an address range from being advertised but it is still being advertised by AWS Global Accelerator.
    * * ```PENDING_DEPROVISIONING``` — You’ve submitted a request to deprovision an address range from AWS Global Accelerator but it is still provisioned.
    * * ```DEPROVISIONED``` — The address range is deprovisioned from AWS Global Accelerator.
    * * ```FAILED_PROVISION ``` — The request to provision the address range from AWS Global Accelerator was not successful. Please make sure that you provide all of the correct information, and try again. If the request fails a second time, contact AWS support.
    * * ```FAILED_ADVERTISING``` — The request for AWS Global Accelerator to advertise the address range was not successful. Please make sure that you provide all of the correct information, and try again. If the request fails a second time, contact AWS support.
    * * ```FAILED_WITHDRAW``` — The request to withdraw the address range from advertising by AWS Global Accelerator was not successful. Please make sure that you provide all of the correct information, and try again. If the request fails a second time, contact AWS support.
    * * ```FAILED_DEPROVISION ``` — The request to deprovision the address range from AWS Global Accelerator was not successful. Please make sure that you provide all of the correct information, and try again. If the request fails a second time, contact AWS support.
    */
  @js.native
  trait ByoipCidr extends js.Object {
    var Cidr: js.UndefOr[GenericString]
    var Events: js.UndefOr[ByoipCidrEvents]
    var State: js.UndefOr[ByoipCidrState]
  }

  object ByoipCidr {
    @inline
    def apply(
        Cidr: js.UndefOr[GenericString] = js.undefined,
        Events: js.UndefOr[ByoipCidrEvents] = js.undefined,
        State: js.UndefOr[ByoipCidrState] = js.undefined
    ): ByoipCidr = {
      val __obj = js.Dynamic.literal()
      Cidr.foreach(__v => __obj.updateDynamic("Cidr")(__v.asInstanceOf[js.Any]))
      Events.foreach(__v => __obj.updateDynamic("Events")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ByoipCidr]
    }
  }

  /** A complex type that contains a <code>Message</code> and a <code>Timestamp</code> value for changes that you make in the status an IP address range that you bring to AWS Global Accelerator through bring your own IP address (BYOIP).
    */
  @js.native
  trait ByoipCidrEvent extends js.Object {
    var Message: js.UndefOr[GenericString]
    var Timestamp: js.UndefOr[Timestamp]
  }

  object ByoipCidrEvent {
    @inline
    def apply(
        Message: js.UndefOr[GenericString] = js.undefined,
        Timestamp: js.UndefOr[Timestamp] = js.undefined
    ): ByoipCidrEvent = {
      val __obj = js.Dynamic.literal()
      Message.foreach(__v => __obj.updateDynamic("Message")(__v.asInstanceOf[js.Any]))
      Timestamp.foreach(__v => __obj.updateDynamic("Timestamp")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ByoipCidrEvent]
    }
  }

  @js.native
  sealed trait ByoipCidrState extends js.Any
  object ByoipCidrState {
    val PENDING_PROVISIONING = "PENDING_PROVISIONING".asInstanceOf[ByoipCidrState]
    val READY = "READY".asInstanceOf[ByoipCidrState]
    val PENDING_ADVERTISING = "PENDING_ADVERTISING".asInstanceOf[ByoipCidrState]
    val ADVERTISING = "ADVERTISING".asInstanceOf[ByoipCidrState]
    val PENDING_WITHDRAWING = "PENDING_WITHDRAWING".asInstanceOf[ByoipCidrState]
    val PENDING_DEPROVISIONING = "PENDING_DEPROVISIONING".asInstanceOf[ByoipCidrState]
    val DEPROVISIONED = "DEPROVISIONED".asInstanceOf[ByoipCidrState]
    val FAILED_PROVISION = "FAILED_PROVISION".asInstanceOf[ByoipCidrState]
    val FAILED_ADVERTISING = "FAILED_ADVERTISING".asInstanceOf[ByoipCidrState]
    val FAILED_WITHDRAW = "FAILED_WITHDRAW".asInstanceOf[ByoipCidrState]
    val FAILED_DEPROVISION = "FAILED_DEPROVISION".asInstanceOf[ByoipCidrState]

    @inline def values = js.Array(
      PENDING_PROVISIONING,
      READY,
      PENDING_ADVERTISING,
      ADVERTISING,
      PENDING_WITHDRAWING,
      PENDING_DEPROVISIONING,
      DEPROVISIONED,
      FAILED_PROVISION,
      FAILED_ADVERTISING,
      FAILED_WITHDRAW,
      FAILED_DEPROVISION
    )
  }

  /** Provides authorization for Amazon to bring a specific IP address range to a specific AWS account using bring your own IP addresses (BYOIP).
    * For more information, see [[https://docs.aws.amazon.com/global-accelerator/latest/dg/using-byoip.html|Bring Your Own IP Addresses (BYOIP)]] in the <i>AWS Global Accelerator Developer Guide</i>.
    */
  @js.native
  trait CidrAuthorizationContext extends js.Object {
    var Message: GenericString
    var Signature: GenericString
  }

  object CidrAuthorizationContext {
    @inline
    def apply(
        Message: GenericString,
        Signature: GenericString
    ): CidrAuthorizationContext = {
      val __obj = js.Dynamic.literal(
        "Message" -> Message.asInstanceOf[js.Any],
        "Signature" -> Signature.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CidrAuthorizationContext]
    }
  }

  @js.native
  sealed trait ClientAffinity extends js.Any
  object ClientAffinity {
    val NONE = "NONE".asInstanceOf[ClientAffinity]
    val SOURCE_IP = "SOURCE_IP".asInstanceOf[ClientAffinity]

    @inline def values = js.Array(NONE, SOURCE_IP)
  }

  @js.native
  trait CreateAcceleratorRequest extends js.Object {
    var IdempotencyToken: IdempotencyToken
    var Name: GenericString
    var Enabled: js.UndefOr[GenericBoolean]
    var IpAddressType: js.UndefOr[IpAddressType]
    var IpAddresses: js.UndefOr[IpAddresses]
    var Tags: js.UndefOr[Tags]
  }

  object CreateAcceleratorRequest {
    @inline
    def apply(
        IdempotencyToken: IdempotencyToken,
        Name: GenericString,
        Enabled: js.UndefOr[GenericBoolean] = js.undefined,
        IpAddressType: js.UndefOr[IpAddressType] = js.undefined,
        IpAddresses: js.UndefOr[IpAddresses] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): CreateAcceleratorRequest = {
      val __obj = js.Dynamic.literal(
        "IdempotencyToken" -> IdempotencyToken.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]
      )

      Enabled.foreach(__v => __obj.updateDynamic("Enabled")(__v.asInstanceOf[js.Any]))
      IpAddressType.foreach(__v => __obj.updateDynamic("IpAddressType")(__v.asInstanceOf[js.Any]))
      IpAddresses.foreach(__v => __obj.updateDynamic("IpAddresses")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateAcceleratorRequest]
    }
  }

  @js.native
  trait CreateAcceleratorResponse extends js.Object {
    var Accelerator: js.UndefOr[Accelerator]
  }

  object CreateAcceleratorResponse {
    @inline
    def apply(
        Accelerator: js.UndefOr[Accelerator] = js.undefined
    ): CreateAcceleratorResponse = {
      val __obj = js.Dynamic.literal()
      Accelerator.foreach(__v => __obj.updateDynamic("Accelerator")(__v.asInstanceOf[js.Any]))
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
    var PortOverrides: js.UndefOr[PortOverrides]
    var ThresholdCount: js.UndefOr[ThresholdCount]
    var TrafficDialPercentage: js.UndefOr[TrafficDialPercentage]
  }

  object CreateEndpointGroupRequest {
    @inline
    def apply(
        EndpointGroupRegion: GenericString,
        IdempotencyToken: IdempotencyToken,
        ListenerArn: GenericString,
        EndpointConfigurations: js.UndefOr[EndpointConfigurations] = js.undefined,
        HealthCheckIntervalSeconds: js.UndefOr[HealthCheckIntervalSeconds] = js.undefined,
        HealthCheckPath: js.UndefOr[GenericString] = js.undefined,
        HealthCheckPort: js.UndefOr[HealthCheckPort] = js.undefined,
        HealthCheckProtocol: js.UndefOr[HealthCheckProtocol] = js.undefined,
        PortOverrides: js.UndefOr[PortOverrides] = js.undefined,
        ThresholdCount: js.UndefOr[ThresholdCount] = js.undefined,
        TrafficDialPercentage: js.UndefOr[TrafficDialPercentage] = js.undefined
    ): CreateEndpointGroupRequest = {
      val __obj = js.Dynamic.literal(
        "EndpointGroupRegion" -> EndpointGroupRegion.asInstanceOf[js.Any],
        "IdempotencyToken" -> IdempotencyToken.asInstanceOf[js.Any],
        "ListenerArn" -> ListenerArn.asInstanceOf[js.Any]
      )

      EndpointConfigurations.foreach(__v => __obj.updateDynamic("EndpointConfigurations")(__v.asInstanceOf[js.Any]))
      HealthCheckIntervalSeconds.foreach(__v => __obj.updateDynamic("HealthCheckIntervalSeconds")(__v.asInstanceOf[js.Any]))
      HealthCheckPath.foreach(__v => __obj.updateDynamic("HealthCheckPath")(__v.asInstanceOf[js.Any]))
      HealthCheckPort.foreach(__v => __obj.updateDynamic("HealthCheckPort")(__v.asInstanceOf[js.Any]))
      HealthCheckProtocol.foreach(__v => __obj.updateDynamic("HealthCheckProtocol")(__v.asInstanceOf[js.Any]))
      PortOverrides.foreach(__v => __obj.updateDynamic("PortOverrides")(__v.asInstanceOf[js.Any]))
      ThresholdCount.foreach(__v => __obj.updateDynamic("ThresholdCount")(__v.asInstanceOf[js.Any]))
      TrafficDialPercentage.foreach(__v => __obj.updateDynamic("TrafficDialPercentage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateEndpointGroupRequest]
    }
  }

  @js.native
  trait CreateEndpointGroupResponse extends js.Object {
    var EndpointGroup: js.UndefOr[EndpointGroup]
  }

  object CreateEndpointGroupResponse {
    @inline
    def apply(
        EndpointGroup: js.UndefOr[EndpointGroup] = js.undefined
    ): CreateEndpointGroupResponse = {
      val __obj = js.Dynamic.literal()
      EndpointGroup.foreach(__v => __obj.updateDynamic("EndpointGroup")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        AcceleratorArn: GenericString,
        IdempotencyToken: IdempotencyToken,
        PortRanges: PortRanges,
        Protocol: Protocol,
        ClientAffinity: js.UndefOr[ClientAffinity] = js.undefined
    ): CreateListenerRequest = {
      val __obj = js.Dynamic.literal(
        "AcceleratorArn" -> AcceleratorArn.asInstanceOf[js.Any],
        "IdempotencyToken" -> IdempotencyToken.asInstanceOf[js.Any],
        "PortRanges" -> PortRanges.asInstanceOf[js.Any],
        "Protocol" -> Protocol.asInstanceOf[js.Any]
      )

      ClientAffinity.foreach(__v => __obj.updateDynamic("ClientAffinity")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateListenerRequest]
    }
  }

  @js.native
  trait CreateListenerResponse extends js.Object {
    var Listener: js.UndefOr[Listener]
  }

  object CreateListenerResponse {
    @inline
    def apply(
        Listener: js.UndefOr[Listener] = js.undefined
    ): CreateListenerResponse = {
      val __obj = js.Dynamic.literal()
      Listener.foreach(__v => __obj.updateDynamic("Listener")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateListenerResponse]
    }
  }

  @js.native
  trait DeleteAcceleratorRequest extends js.Object {
    var AcceleratorArn: GenericString
  }

  object DeleteAcceleratorRequest {
    @inline
    def apply(
        AcceleratorArn: GenericString
    ): DeleteAcceleratorRequest = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        EndpointGroupArn: GenericString
    ): DeleteEndpointGroupRequest = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        ListenerArn: GenericString
    ): DeleteListenerRequest = {
      val __obj = js.Dynamic.literal(
        "ListenerArn" -> ListenerArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteListenerRequest]
    }
  }

  @js.native
  trait DeprovisionByoipCidrRequest extends js.Object {
    var Cidr: GenericString
  }

  object DeprovisionByoipCidrRequest {
    @inline
    def apply(
        Cidr: GenericString
    ): DeprovisionByoipCidrRequest = {
      val __obj = js.Dynamic.literal(
        "Cidr" -> Cidr.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeprovisionByoipCidrRequest]
    }
  }

  @js.native
  trait DeprovisionByoipCidrResponse extends js.Object {
    var ByoipCidr: js.UndefOr[ByoipCidr]
  }

  object DeprovisionByoipCidrResponse {
    @inline
    def apply(
        ByoipCidr: js.UndefOr[ByoipCidr] = js.undefined
    ): DeprovisionByoipCidrResponse = {
      val __obj = js.Dynamic.literal()
      ByoipCidr.foreach(__v => __obj.updateDynamic("ByoipCidr")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeprovisionByoipCidrResponse]
    }
  }

  @js.native
  trait DescribeAcceleratorAttributesRequest extends js.Object {
    var AcceleratorArn: GenericString
  }

  object DescribeAcceleratorAttributesRequest {
    @inline
    def apply(
        AcceleratorArn: GenericString
    ): DescribeAcceleratorAttributesRequest = {
      val __obj = js.Dynamic.literal(
        "AcceleratorArn" -> AcceleratorArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeAcceleratorAttributesRequest]
    }
  }

  @js.native
  trait DescribeAcceleratorAttributesResponse extends js.Object {
    var AcceleratorAttributes: js.UndefOr[AcceleratorAttributes]
  }

  object DescribeAcceleratorAttributesResponse {
    @inline
    def apply(
        AcceleratorAttributes: js.UndefOr[AcceleratorAttributes] = js.undefined
    ): DescribeAcceleratorAttributesResponse = {
      val __obj = js.Dynamic.literal()
      AcceleratorAttributes.foreach(__v => __obj.updateDynamic("AcceleratorAttributes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeAcceleratorAttributesResponse]
    }
  }

  @js.native
  trait DescribeAcceleratorRequest extends js.Object {
    var AcceleratorArn: GenericString
  }

  object DescribeAcceleratorRequest {
    @inline
    def apply(
        AcceleratorArn: GenericString
    ): DescribeAcceleratorRequest = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        Accelerator: js.UndefOr[Accelerator] = js.undefined
    ): DescribeAcceleratorResponse = {
      val __obj = js.Dynamic.literal()
      Accelerator.foreach(__v => __obj.updateDynamic("Accelerator")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeAcceleratorResponse]
    }
  }

  @js.native
  trait DescribeEndpointGroupRequest extends js.Object {
    var EndpointGroupArn: GenericString
  }

  object DescribeEndpointGroupRequest {
    @inline
    def apply(
        EndpointGroupArn: GenericString
    ): DescribeEndpointGroupRequest = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        EndpointGroup: js.UndefOr[EndpointGroup] = js.undefined
    ): DescribeEndpointGroupResponse = {
      val __obj = js.Dynamic.literal()
      EndpointGroup.foreach(__v => __obj.updateDynamic("EndpointGroup")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeEndpointGroupResponse]
    }
  }

  @js.native
  trait DescribeListenerRequest extends js.Object {
    var ListenerArn: GenericString
  }

  object DescribeListenerRequest {
    @inline
    def apply(
        ListenerArn: GenericString
    ): DescribeListenerRequest = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        Listener: js.UndefOr[Listener] = js.undefined
    ): DescribeListenerResponse = {
      val __obj = js.Dynamic.literal()
      Listener.foreach(__v => __obj.updateDynamic("Listener")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeListenerResponse]
    }
  }

  /** A complex type for endpoints. A resource must be valid and active when you add it as an endpoint.
    */
  @js.native
  trait EndpointConfiguration extends js.Object {
    var ClientIPPreservationEnabled: js.UndefOr[GenericBoolean]
    var EndpointId: js.UndefOr[GenericString]
    var Weight: js.UndefOr[EndpointWeight]
  }

  object EndpointConfiguration {
    @inline
    def apply(
        ClientIPPreservationEnabled: js.UndefOr[GenericBoolean] = js.undefined,
        EndpointId: js.UndefOr[GenericString] = js.undefined,
        Weight: js.UndefOr[EndpointWeight] = js.undefined
    ): EndpointConfiguration = {
      val __obj = js.Dynamic.literal()
      ClientIPPreservationEnabled.foreach(__v => __obj.updateDynamic("ClientIPPreservationEnabled")(__v.asInstanceOf[js.Any]))
      EndpointId.foreach(__v => __obj.updateDynamic("EndpointId")(__v.asInstanceOf[js.Any]))
      Weight.foreach(__v => __obj.updateDynamic("Weight")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EndpointConfiguration]
    }
  }

  /** A complex type for an endpoint. Each endpoint group can include one or more endpoints, such as load balancers.
    */
  @js.native
  trait EndpointDescription extends js.Object {
    var ClientIPPreservationEnabled: js.UndefOr[GenericBoolean]
    var EndpointId: js.UndefOr[GenericString]
    var HealthReason: js.UndefOr[GenericString]
    var HealthState: js.UndefOr[HealthState]
    var Weight: js.UndefOr[EndpointWeight]
  }

  object EndpointDescription {
    @inline
    def apply(
        ClientIPPreservationEnabled: js.UndefOr[GenericBoolean] = js.undefined,
        EndpointId: js.UndefOr[GenericString] = js.undefined,
        HealthReason: js.UndefOr[GenericString] = js.undefined,
        HealthState: js.UndefOr[HealthState] = js.undefined,
        Weight: js.UndefOr[EndpointWeight] = js.undefined
    ): EndpointDescription = {
      val __obj = js.Dynamic.literal()
      ClientIPPreservationEnabled.foreach(__v => __obj.updateDynamic("ClientIPPreservationEnabled")(__v.asInstanceOf[js.Any]))
      EndpointId.foreach(__v => __obj.updateDynamic("EndpointId")(__v.asInstanceOf[js.Any]))
      HealthReason.foreach(__v => __obj.updateDynamic("HealthReason")(__v.asInstanceOf[js.Any]))
      HealthState.foreach(__v => __obj.updateDynamic("HealthState")(__v.asInstanceOf[js.Any]))
      Weight.foreach(__v => __obj.updateDynamic("Weight")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EndpointDescription]
    }
  }

  /** A complex type for the endpoint group. An AWS Region can have only one endpoint group for a specific listener.
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
    var PortOverrides: js.UndefOr[PortOverrides]
    var ThresholdCount: js.UndefOr[ThresholdCount]
    var TrafficDialPercentage: js.UndefOr[TrafficDialPercentage]
  }

  object EndpointGroup {
    @inline
    def apply(
        EndpointDescriptions: js.UndefOr[EndpointDescriptions] = js.undefined,
        EndpointGroupArn: js.UndefOr[GenericString] = js.undefined,
        EndpointGroupRegion: js.UndefOr[GenericString] = js.undefined,
        HealthCheckIntervalSeconds: js.UndefOr[HealthCheckIntervalSeconds] = js.undefined,
        HealthCheckPath: js.UndefOr[GenericString] = js.undefined,
        HealthCheckPort: js.UndefOr[HealthCheckPort] = js.undefined,
        HealthCheckProtocol: js.UndefOr[HealthCheckProtocol] = js.undefined,
        PortOverrides: js.UndefOr[PortOverrides] = js.undefined,
        ThresholdCount: js.UndefOr[ThresholdCount] = js.undefined,
        TrafficDialPercentage: js.UndefOr[TrafficDialPercentage] = js.undefined
    ): EndpointGroup = {
      val __obj = js.Dynamic.literal()
      EndpointDescriptions.foreach(__v => __obj.updateDynamic("EndpointDescriptions")(__v.asInstanceOf[js.Any]))
      EndpointGroupArn.foreach(__v => __obj.updateDynamic("EndpointGroupArn")(__v.asInstanceOf[js.Any]))
      EndpointGroupRegion.foreach(__v => __obj.updateDynamic("EndpointGroupRegion")(__v.asInstanceOf[js.Any]))
      HealthCheckIntervalSeconds.foreach(__v => __obj.updateDynamic("HealthCheckIntervalSeconds")(__v.asInstanceOf[js.Any]))
      HealthCheckPath.foreach(__v => __obj.updateDynamic("HealthCheckPath")(__v.asInstanceOf[js.Any]))
      HealthCheckPort.foreach(__v => __obj.updateDynamic("HealthCheckPort")(__v.asInstanceOf[js.Any]))
      HealthCheckProtocol.foreach(__v => __obj.updateDynamic("HealthCheckProtocol")(__v.asInstanceOf[js.Any]))
      PortOverrides.foreach(__v => __obj.updateDynamic("PortOverrides")(__v.asInstanceOf[js.Any]))
      ThresholdCount.foreach(__v => __obj.updateDynamic("ThresholdCount")(__v.asInstanceOf[js.Any]))
      TrafficDialPercentage.foreach(__v => __obj.updateDynamic("TrafficDialPercentage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EndpointGroup]
    }
  }

  @js.native
  sealed trait HealthCheckProtocol extends js.Any
  object HealthCheckProtocol {
    val TCP = "TCP".asInstanceOf[HealthCheckProtocol]
    val HTTP = "HTTP".asInstanceOf[HealthCheckProtocol]
    val HTTPS = "HTTPS".asInstanceOf[HealthCheckProtocol]

    @inline def values = js.Array(TCP, HTTP, HTTPS)
  }

  @js.native
  sealed trait HealthState extends js.Any
  object HealthState {
    val INITIAL = "INITIAL".asInstanceOf[HealthState]
    val HEALTHY = "HEALTHY".asInstanceOf[HealthState]
    val UNHEALTHY = "UNHEALTHY".asInstanceOf[HealthState]

    @inline def values = js.Array(INITIAL, HEALTHY, UNHEALTHY)
  }

  @js.native
  sealed trait IpAddressType extends js.Any
  object IpAddressType {
    val IPV4 = "IPV4".asInstanceOf[IpAddressType]

    @inline def values = js.Array(IPV4)
  }

  /** A complex type for the set of IP addresses for an accelerator.
    */
  @js.native
  trait IpSet extends js.Object {
    var IpAddresses: js.UndefOr[IpAddresses]
    var IpFamily: js.UndefOr[GenericString]
  }

  object IpSet {
    @inline
    def apply(
        IpAddresses: js.UndefOr[IpAddresses] = js.undefined,
        IpFamily: js.UndefOr[GenericString] = js.undefined
    ): IpSet = {
      val __obj = js.Dynamic.literal()
      IpAddresses.foreach(__v => __obj.updateDynamic("IpAddresses")(__v.asInstanceOf[js.Any]))
      IpFamily.foreach(__v => __obj.updateDynamic("IpFamily")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[IpSet]
    }
  }

  @js.native
  trait ListAcceleratorsRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[GenericString]
  }

  object ListAcceleratorsRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[GenericString] = js.undefined
    ): ListAcceleratorsRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAcceleratorsRequest]
    }
  }

  @js.native
  trait ListAcceleratorsResponse extends js.Object {
    var Accelerators: js.UndefOr[Accelerators]
    var NextToken: js.UndefOr[GenericString]
  }

  object ListAcceleratorsResponse {
    @inline
    def apply(
        Accelerators: js.UndefOr[Accelerators] = js.undefined,
        NextToken: js.UndefOr[GenericString] = js.undefined
    ): ListAcceleratorsResponse = {
      val __obj = js.Dynamic.literal()
      Accelerators.foreach(__v => __obj.updateDynamic("Accelerators")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAcceleratorsResponse]
    }
  }

  @js.native
  trait ListByoipCidrsRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[GenericString]
  }

  object ListByoipCidrsRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[GenericString] = js.undefined
    ): ListByoipCidrsRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListByoipCidrsRequest]
    }
  }

  @js.native
  trait ListByoipCidrsResponse extends js.Object {
    var ByoipCidrs: js.UndefOr[ByoipCidrs]
    var NextToken: js.UndefOr[GenericString]
  }

  object ListByoipCidrsResponse {
    @inline
    def apply(
        ByoipCidrs: js.UndefOr[ByoipCidrs] = js.undefined,
        NextToken: js.UndefOr[GenericString] = js.undefined
    ): ListByoipCidrsResponse = {
      val __obj = js.Dynamic.literal()
      ByoipCidrs.foreach(__v => __obj.updateDynamic("ByoipCidrs")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListByoipCidrsResponse]
    }
  }

  @js.native
  trait ListEndpointGroupsRequest extends js.Object {
    var ListenerArn: GenericString
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[GenericString]
  }

  object ListEndpointGroupsRequest {
    @inline
    def apply(
        ListenerArn: GenericString,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[GenericString] = js.undefined
    ): ListEndpointGroupsRequest = {
      val __obj = js.Dynamic.literal(
        "ListenerArn" -> ListenerArn.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListEndpointGroupsRequest]
    }
  }

  @js.native
  trait ListEndpointGroupsResponse extends js.Object {
    var EndpointGroups: js.UndefOr[EndpointGroups]
    var NextToken: js.UndefOr[GenericString]
  }

  object ListEndpointGroupsResponse {
    @inline
    def apply(
        EndpointGroups: js.UndefOr[EndpointGroups] = js.undefined,
        NextToken: js.UndefOr[GenericString] = js.undefined
    ): ListEndpointGroupsResponse = {
      val __obj = js.Dynamic.literal()
      EndpointGroups.foreach(__v => __obj.updateDynamic("EndpointGroups")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        AcceleratorArn: GenericString,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[GenericString] = js.undefined
    ): ListListenersRequest = {
      val __obj = js.Dynamic.literal(
        "AcceleratorArn" -> AcceleratorArn.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListListenersRequest]
    }
  }

  @js.native
  trait ListListenersResponse extends js.Object {
    var Listeners: js.UndefOr[Listeners]
    var NextToken: js.UndefOr[GenericString]
  }

  object ListListenersResponse {
    @inline
    def apply(
        Listeners: js.UndefOr[Listeners] = js.undefined,
        NextToken: js.UndefOr[GenericString] = js.undefined
    ): ListListenersResponse = {
      val __obj = js.Dynamic.literal()
      Listeners.foreach(__v => __obj.updateDynamic("Listeners")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListListenersResponse]
    }
  }

  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var ResourceArn: ResourceArn
  }

  object ListTagsForResourceRequest {
    @inline
    def apply(
        ResourceArn: ResourceArn
    ): ListTagsForResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ListTagsForResourceRequest]
    }
  }

  @js.native
  trait ListTagsForResourceResponse extends js.Object {
    var Tags: js.UndefOr[Tags]
  }

  object ListTagsForResourceResponse {
    @inline
    def apply(
        Tags: js.UndefOr[Tags] = js.undefined
    ): ListTagsForResourceResponse = {
      val __obj = js.Dynamic.literal()
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceResponse]
    }
  }

  /** A complex type for a listener.
    */
  @js.native
  trait Listener extends js.Object {
    var ClientAffinity: js.UndefOr[ClientAffinity]
    var ListenerArn: js.UndefOr[GenericString]
    var PortRanges: js.UndefOr[PortRanges]
    var Protocol: js.UndefOr[Protocol]
  }

  object Listener {
    @inline
    def apply(
        ClientAffinity: js.UndefOr[ClientAffinity] = js.undefined,
        ListenerArn: js.UndefOr[GenericString] = js.undefined,
        PortRanges: js.UndefOr[PortRanges] = js.undefined,
        Protocol: js.UndefOr[Protocol] = js.undefined
    ): Listener = {
      val __obj = js.Dynamic.literal()
      ClientAffinity.foreach(__v => __obj.updateDynamic("ClientAffinity")(__v.asInstanceOf[js.Any]))
      ListenerArn.foreach(__v => __obj.updateDynamic("ListenerArn")(__v.asInstanceOf[js.Any]))
      PortRanges.foreach(__v => __obj.updateDynamic("PortRanges")(__v.asInstanceOf[js.Any]))
      Protocol.foreach(__v => __obj.updateDynamic("Protocol")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Listener]
    }
  }

  /** Override specific listener ports used to route traffic to endpoints that are part of an endpoint group. For example, you can create a port override in which the listener receives user traffic on ports 80 and 443, but your accelerator routes that traffic to ports 1080 and 1443, respectively, on the endpoints.
    * For more information, see [[https://docs.aws.amazon.com/global-accelerator/latest/dg/about-endpoint-groups-port-override.html| Port overrides]] in the <i>AWS Global Accelerator Developer Guide</i>.
    */
  @js.native
  trait PortOverride extends js.Object {
    var EndpointPort: js.UndefOr[PortNumber]
    var ListenerPort: js.UndefOr[PortNumber]
  }

  object PortOverride {
    @inline
    def apply(
        EndpointPort: js.UndefOr[PortNumber] = js.undefined,
        ListenerPort: js.UndefOr[PortNumber] = js.undefined
    ): PortOverride = {
      val __obj = js.Dynamic.literal()
      EndpointPort.foreach(__v => __obj.updateDynamic("EndpointPort")(__v.asInstanceOf[js.Any]))
      ListenerPort.foreach(__v => __obj.updateDynamic("ListenerPort")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PortOverride]
    }
  }

  /** A complex type for a range of ports for a listener.
    */
  @js.native
  trait PortRange extends js.Object {
    var FromPort: js.UndefOr[PortNumber]
    var ToPort: js.UndefOr[PortNumber]
  }

  object PortRange {
    @inline
    def apply(
        FromPort: js.UndefOr[PortNumber] = js.undefined,
        ToPort: js.UndefOr[PortNumber] = js.undefined
    ): PortRange = {
      val __obj = js.Dynamic.literal()
      FromPort.foreach(__v => __obj.updateDynamic("FromPort")(__v.asInstanceOf[js.Any]))
      ToPort.foreach(__v => __obj.updateDynamic("ToPort")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PortRange]
    }
  }

  @js.native
  sealed trait Protocol extends js.Any
  object Protocol {
    val TCP = "TCP".asInstanceOf[Protocol]
    val UDP = "UDP".asInstanceOf[Protocol]

    @inline def values = js.Array(TCP, UDP)
  }

  @js.native
  trait ProvisionByoipCidrRequest extends js.Object {
    var Cidr: GenericString
    var CidrAuthorizationContext: CidrAuthorizationContext
  }

  object ProvisionByoipCidrRequest {
    @inline
    def apply(
        Cidr: GenericString,
        CidrAuthorizationContext: CidrAuthorizationContext
    ): ProvisionByoipCidrRequest = {
      val __obj = js.Dynamic.literal(
        "Cidr" -> Cidr.asInstanceOf[js.Any],
        "CidrAuthorizationContext" -> CidrAuthorizationContext.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ProvisionByoipCidrRequest]
    }
  }

  @js.native
  trait ProvisionByoipCidrResponse extends js.Object {
    var ByoipCidr: js.UndefOr[ByoipCidr]
  }

  object ProvisionByoipCidrResponse {
    @inline
    def apply(
        ByoipCidr: js.UndefOr[ByoipCidr] = js.undefined
    ): ProvisionByoipCidrResponse = {
      val __obj = js.Dynamic.literal()
      ByoipCidr.foreach(__v => __obj.updateDynamic("ByoipCidr")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ProvisionByoipCidrResponse]
    }
  }

  /** A complex type that contains a <code>Tag</code> key and <code>Tag</code> value.
    */
  @js.native
  trait Tag extends js.Object {
    var Key: TagKey
    var Value: TagValue
  }

  object Tag {
    @inline
    def apply(
        Key: TagKey,
        Value: TagValue
    ): Tag = {
      val __obj = js.Dynamic.literal(
        "Key" -> Key.asInstanceOf[js.Any],
        "Value" -> Value.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[Tag]
    }
  }

  @js.native
  trait TagResourceRequest extends js.Object {
    var ResourceArn: ResourceArn
    var Tags: Tags
  }

  object TagResourceRequest {
    @inline
    def apply(
        ResourceArn: ResourceArn,
        Tags: Tags
    ): TagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any],
        "Tags" -> Tags.asInstanceOf[js.Any]
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
    var ResourceArn: ResourceArn
    var TagKeys: TagKeys
  }

  object UntagResourceRequest {
    @inline
    def apply(
        ResourceArn: ResourceArn,
        TagKeys: TagKeys
    ): UntagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any],
        "TagKeys" -> TagKeys.asInstanceOf[js.Any]
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

  @js.native
  trait UpdateAcceleratorAttributesRequest extends js.Object {
    var AcceleratorArn: GenericString
    var FlowLogsEnabled: js.UndefOr[GenericBoolean]
    var FlowLogsS3Bucket: js.UndefOr[GenericString]
    var FlowLogsS3Prefix: js.UndefOr[GenericString]
  }

  object UpdateAcceleratorAttributesRequest {
    @inline
    def apply(
        AcceleratorArn: GenericString,
        FlowLogsEnabled: js.UndefOr[GenericBoolean] = js.undefined,
        FlowLogsS3Bucket: js.UndefOr[GenericString] = js.undefined,
        FlowLogsS3Prefix: js.UndefOr[GenericString] = js.undefined
    ): UpdateAcceleratorAttributesRequest = {
      val __obj = js.Dynamic.literal(
        "AcceleratorArn" -> AcceleratorArn.asInstanceOf[js.Any]
      )

      FlowLogsEnabled.foreach(__v => __obj.updateDynamic("FlowLogsEnabled")(__v.asInstanceOf[js.Any]))
      FlowLogsS3Bucket.foreach(__v => __obj.updateDynamic("FlowLogsS3Bucket")(__v.asInstanceOf[js.Any]))
      FlowLogsS3Prefix.foreach(__v => __obj.updateDynamic("FlowLogsS3Prefix")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateAcceleratorAttributesRequest]
    }
  }

  @js.native
  trait UpdateAcceleratorAttributesResponse extends js.Object {
    var AcceleratorAttributes: js.UndefOr[AcceleratorAttributes]
  }

  object UpdateAcceleratorAttributesResponse {
    @inline
    def apply(
        AcceleratorAttributes: js.UndefOr[AcceleratorAttributes] = js.undefined
    ): UpdateAcceleratorAttributesResponse = {
      val __obj = js.Dynamic.literal()
      AcceleratorAttributes.foreach(__v => __obj.updateDynamic("AcceleratorAttributes")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        AcceleratorArn: GenericString,
        Enabled: js.UndefOr[GenericBoolean] = js.undefined,
        IpAddressType: js.UndefOr[IpAddressType] = js.undefined,
        Name: js.UndefOr[GenericString] = js.undefined
    ): UpdateAcceleratorRequest = {
      val __obj = js.Dynamic.literal(
        "AcceleratorArn" -> AcceleratorArn.asInstanceOf[js.Any]
      )

      Enabled.foreach(__v => __obj.updateDynamic("Enabled")(__v.asInstanceOf[js.Any]))
      IpAddressType.foreach(__v => __obj.updateDynamic("IpAddressType")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateAcceleratorRequest]
    }
  }

  @js.native
  trait UpdateAcceleratorResponse extends js.Object {
    var Accelerator: js.UndefOr[Accelerator]
  }

  object UpdateAcceleratorResponse {
    @inline
    def apply(
        Accelerator: js.UndefOr[Accelerator] = js.undefined
    ): UpdateAcceleratorResponse = {
      val __obj = js.Dynamic.literal()
      Accelerator.foreach(__v => __obj.updateDynamic("Accelerator")(__v.asInstanceOf[js.Any]))
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
    var PortOverrides: js.UndefOr[PortOverrides]
    var ThresholdCount: js.UndefOr[ThresholdCount]
    var TrafficDialPercentage: js.UndefOr[TrafficDialPercentage]
  }

  object UpdateEndpointGroupRequest {
    @inline
    def apply(
        EndpointGroupArn: GenericString,
        EndpointConfigurations: js.UndefOr[EndpointConfigurations] = js.undefined,
        HealthCheckIntervalSeconds: js.UndefOr[HealthCheckIntervalSeconds] = js.undefined,
        HealthCheckPath: js.UndefOr[GenericString] = js.undefined,
        HealthCheckPort: js.UndefOr[HealthCheckPort] = js.undefined,
        HealthCheckProtocol: js.UndefOr[HealthCheckProtocol] = js.undefined,
        PortOverrides: js.UndefOr[PortOverrides] = js.undefined,
        ThresholdCount: js.UndefOr[ThresholdCount] = js.undefined,
        TrafficDialPercentage: js.UndefOr[TrafficDialPercentage] = js.undefined
    ): UpdateEndpointGroupRequest = {
      val __obj = js.Dynamic.literal(
        "EndpointGroupArn" -> EndpointGroupArn.asInstanceOf[js.Any]
      )

      EndpointConfigurations.foreach(__v => __obj.updateDynamic("EndpointConfigurations")(__v.asInstanceOf[js.Any]))
      HealthCheckIntervalSeconds.foreach(__v => __obj.updateDynamic("HealthCheckIntervalSeconds")(__v.asInstanceOf[js.Any]))
      HealthCheckPath.foreach(__v => __obj.updateDynamic("HealthCheckPath")(__v.asInstanceOf[js.Any]))
      HealthCheckPort.foreach(__v => __obj.updateDynamic("HealthCheckPort")(__v.asInstanceOf[js.Any]))
      HealthCheckProtocol.foreach(__v => __obj.updateDynamic("HealthCheckProtocol")(__v.asInstanceOf[js.Any]))
      PortOverrides.foreach(__v => __obj.updateDynamic("PortOverrides")(__v.asInstanceOf[js.Any]))
      ThresholdCount.foreach(__v => __obj.updateDynamic("ThresholdCount")(__v.asInstanceOf[js.Any]))
      TrafficDialPercentage.foreach(__v => __obj.updateDynamic("TrafficDialPercentage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateEndpointGroupRequest]
    }
  }

  @js.native
  trait UpdateEndpointGroupResponse extends js.Object {
    var EndpointGroup: js.UndefOr[EndpointGroup]
  }

  object UpdateEndpointGroupResponse {
    @inline
    def apply(
        EndpointGroup: js.UndefOr[EndpointGroup] = js.undefined
    ): UpdateEndpointGroupResponse = {
      val __obj = js.Dynamic.literal()
      EndpointGroup.foreach(__v => __obj.updateDynamic("EndpointGroup")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        ListenerArn: GenericString,
        ClientAffinity: js.UndefOr[ClientAffinity] = js.undefined,
        PortRanges: js.UndefOr[PortRanges] = js.undefined,
        Protocol: js.UndefOr[Protocol] = js.undefined
    ): UpdateListenerRequest = {
      val __obj = js.Dynamic.literal(
        "ListenerArn" -> ListenerArn.asInstanceOf[js.Any]
      )

      ClientAffinity.foreach(__v => __obj.updateDynamic("ClientAffinity")(__v.asInstanceOf[js.Any]))
      PortRanges.foreach(__v => __obj.updateDynamic("PortRanges")(__v.asInstanceOf[js.Any]))
      Protocol.foreach(__v => __obj.updateDynamic("Protocol")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateListenerRequest]
    }
  }

  @js.native
  trait UpdateListenerResponse extends js.Object {
    var Listener: js.UndefOr[Listener]
  }

  object UpdateListenerResponse {
    @inline
    def apply(
        Listener: js.UndefOr[Listener] = js.undefined
    ): UpdateListenerResponse = {
      val __obj = js.Dynamic.literal()
      Listener.foreach(__v => __obj.updateDynamic("Listener")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateListenerResponse]
    }
  }

  @js.native
  trait WithdrawByoipCidrRequest extends js.Object {
    var Cidr: GenericString
  }

  object WithdrawByoipCidrRequest {
    @inline
    def apply(
        Cidr: GenericString
    ): WithdrawByoipCidrRequest = {
      val __obj = js.Dynamic.literal(
        "Cidr" -> Cidr.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[WithdrawByoipCidrRequest]
    }
  }

  @js.native
  trait WithdrawByoipCidrResponse extends js.Object {
    var ByoipCidr: js.UndefOr[ByoipCidr]
  }

  object WithdrawByoipCidrResponse {
    @inline
    def apply(
        ByoipCidr: js.UndefOr[ByoipCidr] = js.undefined
    ): WithdrawByoipCidrResponse = {
      val __obj = js.Dynamic.literal()
      ByoipCidr.foreach(__v => __obj.updateDynamic("ByoipCidr")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[WithdrawByoipCidrResponse]
    }
  }
}
