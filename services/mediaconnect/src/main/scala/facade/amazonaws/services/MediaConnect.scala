package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

package object mediaconnect {
  type MaxResults = Int
  type __integer = Int
  type __listOfAddOutputRequest = js.Array[AddOutputRequest]
  type __listOfEntitlement = js.Array[Entitlement]
  type __listOfGrantEntitlementRequest = js.Array[GrantEntitlementRequest]
  type __listOfListedEntitlement = js.Array[ListedEntitlement]
  type __listOfListedFlow = js.Array[ListedFlow]
  type __listOfOutput = js.Array[Output]
  type __listOfSetSourceRequest = js.Array[SetSourceRequest]
  type __listOfSource = js.Array[Source]
  type __listOfVpcInterface = js.Array[VpcInterface]
  type __listOfVpcInterfaceRequest = js.Array[VpcInterfaceRequest]
  type __listOf__string = js.Array[__string]
  type __mapOf__string = js.Dictionary[__string]
  type __string = String

  implicit final class MediaConnectOps(private val service: MediaConnect) extends AnyVal {

    @inline def addFlowOutputsFuture(params: AddFlowOutputsRequest): Future[AddFlowOutputsResponse] = service.addFlowOutputs(params).promise().toFuture
    @inline def addFlowSourcesFuture(params: AddFlowSourcesRequest): Future[AddFlowSourcesResponse] = service.addFlowSources(params).promise().toFuture
    @inline def addFlowVpcInterfacesFuture(params: AddFlowVpcInterfacesRequest): Future[AddFlowVpcInterfacesResponse] = service.addFlowVpcInterfaces(params).promise().toFuture
    @inline def createFlowFuture(params: CreateFlowRequest): Future[CreateFlowResponse] = service.createFlow(params).promise().toFuture
    @inline def deleteFlowFuture(params: DeleteFlowRequest): Future[DeleteFlowResponse] = service.deleteFlow(params).promise().toFuture
    @inline def describeFlowFuture(params: DescribeFlowRequest): Future[DescribeFlowResponse] = service.describeFlow(params).promise().toFuture
    @inline def grantFlowEntitlementsFuture(params: GrantFlowEntitlementsRequest): Future[GrantFlowEntitlementsResponse] = service.grantFlowEntitlements(params).promise().toFuture
    @inline def listEntitlementsFuture(params: ListEntitlementsRequest): Future[ListEntitlementsResponse] = service.listEntitlements(params).promise().toFuture
    @inline def listFlowsFuture(params: ListFlowsRequest): Future[ListFlowsResponse] = service.listFlows(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] = service.listTagsForResource(params).promise().toFuture
    @inline def removeFlowOutputFuture(params: RemoveFlowOutputRequest): Future[RemoveFlowOutputResponse] = service.removeFlowOutput(params).promise().toFuture
    @inline def removeFlowSourceFuture(params: RemoveFlowSourceRequest): Future[RemoveFlowSourceResponse] = service.removeFlowSource(params).promise().toFuture
    @inline def removeFlowVpcInterfaceFuture(params: RemoveFlowVpcInterfaceRequest): Future[RemoveFlowVpcInterfaceResponse] = service.removeFlowVpcInterface(params).promise().toFuture
    @inline def revokeFlowEntitlementFuture(params: RevokeFlowEntitlementRequest): Future[RevokeFlowEntitlementResponse] = service.revokeFlowEntitlement(params).promise().toFuture
    @inline def startFlowFuture(params: StartFlowRequest): Future[StartFlowResponse] = service.startFlow(params).promise().toFuture
    @inline def stopFlowFuture(params: StopFlowRequest): Future[StopFlowResponse] = service.stopFlow(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[js.Object] = service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[js.Object] = service.untagResource(params).promise().toFuture
    @inline def updateFlowEntitlementFuture(params: UpdateFlowEntitlementRequest): Future[UpdateFlowEntitlementResponse] = service.updateFlowEntitlement(params).promise().toFuture
    @inline def updateFlowFuture(params: UpdateFlowRequest): Future[UpdateFlowResponse] = service.updateFlow(params).promise().toFuture
    @inline def updateFlowOutputFuture(params: UpdateFlowOutputRequest): Future[UpdateFlowOutputResponse] = service.updateFlowOutput(params).promise().toFuture
    @inline def updateFlowSourceFuture(params: UpdateFlowSourceRequest): Future[UpdateFlowSourceResponse] = service.updateFlowSource(params).promise().toFuture
  }
}

package mediaconnect {
  @js.native
  @JSImport("aws-sdk", "MediaConnect", "AWS.MediaConnect")
  class MediaConnect() extends js.Object {
    def this(config: AWSConfig) = this()

    def addFlowOutputs(params: AddFlowOutputsRequest): Request[AddFlowOutputsResponse] = js.native
    def addFlowSources(params: AddFlowSourcesRequest): Request[AddFlowSourcesResponse] = js.native
    def addFlowVpcInterfaces(params: AddFlowVpcInterfacesRequest): Request[AddFlowVpcInterfacesResponse] = js.native
    def createFlow(params: CreateFlowRequest): Request[CreateFlowResponse] = js.native
    def deleteFlow(params: DeleteFlowRequest): Request[DeleteFlowResponse] = js.native
    def describeFlow(params: DescribeFlowRequest): Request[DescribeFlowResponse] = js.native
    def grantFlowEntitlements(params: GrantFlowEntitlementsRequest): Request[GrantFlowEntitlementsResponse] = js.native
    def listEntitlements(params: ListEntitlementsRequest): Request[ListEntitlementsResponse] = js.native
    def listFlows(params: ListFlowsRequest): Request[ListFlowsResponse] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def removeFlowOutput(params: RemoveFlowOutputRequest): Request[RemoveFlowOutputResponse] = js.native
    def removeFlowSource(params: RemoveFlowSourceRequest): Request[RemoveFlowSourceResponse] = js.native
    def removeFlowVpcInterface(params: RemoveFlowVpcInterfaceRequest): Request[RemoveFlowVpcInterfaceResponse] = js.native
    def revokeFlowEntitlement(params: RevokeFlowEntitlementRequest): Request[RevokeFlowEntitlementResponse] = js.native
    def startFlow(params: StartFlowRequest): Request[StartFlowResponse] = js.native
    def stopFlow(params: StopFlowRequest): Request[StopFlowResponse] = js.native
    def tagResource(params: TagResourceRequest): Request[js.Object] = js.native
    def untagResource(params: UntagResourceRequest): Request[js.Object] = js.native
    def updateFlow(params: UpdateFlowRequest): Request[UpdateFlowResponse] = js.native
    def updateFlowEntitlement(params: UpdateFlowEntitlementRequest): Request[UpdateFlowEntitlementResponse] = js.native
    def updateFlowOutput(params: UpdateFlowOutputRequest): Request[UpdateFlowOutputResponse] = js.native
    def updateFlowSource(params: UpdateFlowSourceRequest): Request[UpdateFlowSourceResponse] = js.native
  }

  /**
    * A request to add outputs to the specified flow.
    */
  @js.native
  trait AddFlowOutputsRequest extends js.Object {
    var FlowArn: __string
    var Outputs: __listOfAddOutputRequest
  }

  object AddFlowOutputsRequest {
    @inline
    def apply(
        FlowArn: __string,
        Outputs: __listOfAddOutputRequest
    ): AddFlowOutputsRequest = {
      val __obj = js.Dynamic.literal(
        "FlowArn" -> FlowArn.asInstanceOf[js.Any],
        "Outputs" -> Outputs.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[AddFlowOutputsRequest]
    }
  }

  @js.native
  trait AddFlowOutputsResponse extends js.Object {
    var FlowArn: js.UndefOr[__string]
    var Outputs: js.UndefOr[__listOfOutput]
  }

  object AddFlowOutputsResponse {
    @inline
    def apply(
        FlowArn: js.UndefOr[__string] = js.undefined,
        Outputs: js.UndefOr[__listOfOutput] = js.undefined
    ): AddFlowOutputsResponse = {
      val __obj = js.Dynamic.literal()
      FlowArn.foreach(__v => __obj.updateDynamic("FlowArn")(__v.asInstanceOf[js.Any]))
      Outputs.foreach(__v => __obj.updateDynamic("Outputs")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AddFlowOutputsResponse]
    }
  }

  /**
    * A request to add sources to the flow.
    */
  @js.native
  trait AddFlowSourcesRequest extends js.Object {
    var FlowArn: __string
    var Sources: __listOfSetSourceRequest
  }

  object AddFlowSourcesRequest {
    @inline
    def apply(
        FlowArn: __string,
        Sources: __listOfSetSourceRequest
    ): AddFlowSourcesRequest = {
      val __obj = js.Dynamic.literal(
        "FlowArn" -> FlowArn.asInstanceOf[js.Any],
        "Sources" -> Sources.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[AddFlowSourcesRequest]
    }
  }

  @js.native
  trait AddFlowSourcesResponse extends js.Object {
    var FlowArn: js.UndefOr[__string]
    var Sources: js.UndefOr[__listOfSource]
  }

  object AddFlowSourcesResponse {
    @inline
    def apply(
        FlowArn: js.UndefOr[__string] = js.undefined,
        Sources: js.UndefOr[__listOfSource] = js.undefined
    ): AddFlowSourcesResponse = {
      val __obj = js.Dynamic.literal()
      FlowArn.foreach(__v => __obj.updateDynamic("FlowArn")(__v.asInstanceOf[js.Any]))
      Sources.foreach(__v => __obj.updateDynamic("Sources")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AddFlowSourcesResponse]
    }
  }

  /**
    * A request to add VPC interfaces to the flow.
    */
  @js.native
  trait AddFlowVpcInterfacesRequest extends js.Object {
    var FlowArn: __string
    var VpcInterfaces: __listOfVpcInterfaceRequest
  }

  object AddFlowVpcInterfacesRequest {
    @inline
    def apply(
        FlowArn: __string,
        VpcInterfaces: __listOfVpcInterfaceRequest
    ): AddFlowVpcInterfacesRequest = {
      val __obj = js.Dynamic.literal(
        "FlowArn" -> FlowArn.asInstanceOf[js.Any],
        "VpcInterfaces" -> VpcInterfaces.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[AddFlowVpcInterfacesRequest]
    }
  }

  @js.native
  trait AddFlowVpcInterfacesResponse extends js.Object {
    var FlowArn: js.UndefOr[__string]
    var VpcInterfaces: js.UndefOr[__listOfVpcInterface]
  }

  object AddFlowVpcInterfacesResponse {
    @inline
    def apply(
        FlowArn: js.UndefOr[__string] = js.undefined,
        VpcInterfaces: js.UndefOr[__listOfVpcInterface] = js.undefined
    ): AddFlowVpcInterfacesResponse = {
      val __obj = js.Dynamic.literal()
      FlowArn.foreach(__v => __obj.updateDynamic("FlowArn")(__v.asInstanceOf[js.Any]))
      VpcInterfaces.foreach(__v => __obj.updateDynamic("VpcInterfaces")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AddFlowVpcInterfacesResponse]
    }
  }

  /**
    * The output that you want to add to this flow.
    */
  @js.native
  trait AddOutputRequest extends js.Object {
    var Protocol: Protocol
    var CidrAllowList: js.UndefOr[__listOf__string]
    var Description: js.UndefOr[__string]
    var Destination: js.UndefOr[__string]
    var Encryption: js.UndefOr[Encryption]
    var MaxLatency: js.UndefOr[__integer]
    var Name: js.UndefOr[__string]
    var Port: js.UndefOr[__integer]
    var RemoteId: js.UndefOr[__string]
    var SmoothingLatency: js.UndefOr[__integer]
    var StreamId: js.UndefOr[__string]
    var VpcInterfaceAttachment: js.UndefOr[VpcInterfaceAttachment]
  }

  object AddOutputRequest {
    @inline
    def apply(
        Protocol: Protocol,
        CidrAllowList: js.UndefOr[__listOf__string] = js.undefined,
        Description: js.UndefOr[__string] = js.undefined,
        Destination: js.UndefOr[__string] = js.undefined,
        Encryption: js.UndefOr[Encryption] = js.undefined,
        MaxLatency: js.UndefOr[__integer] = js.undefined,
        Name: js.UndefOr[__string] = js.undefined,
        Port: js.UndefOr[__integer] = js.undefined,
        RemoteId: js.UndefOr[__string] = js.undefined,
        SmoothingLatency: js.UndefOr[__integer] = js.undefined,
        StreamId: js.UndefOr[__string] = js.undefined,
        VpcInterfaceAttachment: js.UndefOr[VpcInterfaceAttachment] = js.undefined
    ): AddOutputRequest = {
      val __obj = js.Dynamic.literal(
        "Protocol" -> Protocol.asInstanceOf[js.Any]
      )

      CidrAllowList.foreach(__v => __obj.updateDynamic("CidrAllowList")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Destination.foreach(__v => __obj.updateDynamic("Destination")(__v.asInstanceOf[js.Any]))
      Encryption.foreach(__v => __obj.updateDynamic("Encryption")(__v.asInstanceOf[js.Any]))
      MaxLatency.foreach(__v => __obj.updateDynamic("MaxLatency")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Port.foreach(__v => __obj.updateDynamic("Port")(__v.asInstanceOf[js.Any]))
      RemoteId.foreach(__v => __obj.updateDynamic("RemoteId")(__v.asInstanceOf[js.Any]))
      SmoothingLatency.foreach(__v => __obj.updateDynamic("SmoothingLatency")(__v.asInstanceOf[js.Any]))
      StreamId.foreach(__v => __obj.updateDynamic("StreamId")(__v.asInstanceOf[js.Any]))
      VpcInterfaceAttachment.foreach(__v => __obj.updateDynamic("VpcInterfaceAttachment")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AddOutputRequest]
    }
  }

  @js.native
  sealed trait Algorithm extends js.Any
  object Algorithm extends js.Object {
    val aes128 = "aes128".asInstanceOf[Algorithm]
    val aes192 = "aes192".asInstanceOf[Algorithm]
    val aes256 = "aes256".asInstanceOf[Algorithm]

    val values = js.Object.freeze(js.Array(aes128, aes192, aes256))
  }

  /**
    * Creates a new flow. The request must include one source. The request optionally can include outputs (up to 50) and entitlements (up to 50).
    */
  @js.native
  trait CreateFlowRequest extends js.Object {
    var Name: __string
    var AvailabilityZone: js.UndefOr[__string]
    var Entitlements: js.UndefOr[__listOfGrantEntitlementRequest]
    var Outputs: js.UndefOr[__listOfAddOutputRequest]
    var Source: js.UndefOr[SetSourceRequest]
    var SourceFailoverConfig: js.UndefOr[FailoverConfig]
    var Sources: js.UndefOr[__listOfSetSourceRequest]
    var VpcInterfaces: js.UndefOr[__listOfVpcInterfaceRequest]
  }

  object CreateFlowRequest {
    @inline
    def apply(
        Name: __string,
        AvailabilityZone: js.UndefOr[__string] = js.undefined,
        Entitlements: js.UndefOr[__listOfGrantEntitlementRequest] = js.undefined,
        Outputs: js.UndefOr[__listOfAddOutputRequest] = js.undefined,
        Source: js.UndefOr[SetSourceRequest] = js.undefined,
        SourceFailoverConfig: js.UndefOr[FailoverConfig] = js.undefined,
        Sources: js.UndefOr[__listOfSetSourceRequest] = js.undefined,
        VpcInterfaces: js.UndefOr[__listOfVpcInterfaceRequest] = js.undefined
    ): CreateFlowRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      AvailabilityZone.foreach(__v => __obj.updateDynamic("AvailabilityZone")(__v.asInstanceOf[js.Any]))
      Entitlements.foreach(__v => __obj.updateDynamic("Entitlements")(__v.asInstanceOf[js.Any]))
      Outputs.foreach(__v => __obj.updateDynamic("Outputs")(__v.asInstanceOf[js.Any]))
      Source.foreach(__v => __obj.updateDynamic("Source")(__v.asInstanceOf[js.Any]))
      SourceFailoverConfig.foreach(__v => __obj.updateDynamic("SourceFailoverConfig")(__v.asInstanceOf[js.Any]))
      Sources.foreach(__v => __obj.updateDynamic("Sources")(__v.asInstanceOf[js.Any]))
      VpcInterfaces.foreach(__v => __obj.updateDynamic("VpcInterfaces")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateFlowRequest]
    }
  }

  @js.native
  trait CreateFlowResponse extends js.Object {
    var Flow: js.UndefOr[Flow]
  }

  object CreateFlowResponse {
    @inline
    def apply(
        Flow: js.UndefOr[Flow] = js.undefined
    ): CreateFlowResponse = {
      val __obj = js.Dynamic.literal()
      Flow.foreach(__v => __obj.updateDynamic("Flow")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateFlowResponse]
    }
  }

  @js.native
  trait DeleteFlowRequest extends js.Object {
    var FlowArn: __string
  }

  object DeleteFlowRequest {
    @inline
    def apply(
        FlowArn: __string
    ): DeleteFlowRequest = {
      val __obj = js.Dynamic.literal(
        "FlowArn" -> FlowArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteFlowRequest]
    }
  }

  @js.native
  trait DeleteFlowResponse extends js.Object {
    var FlowArn: js.UndefOr[__string]
    var Status: js.UndefOr[Status]
  }

  object DeleteFlowResponse {
    @inline
    def apply(
        FlowArn: js.UndefOr[__string] = js.undefined,
        Status: js.UndefOr[Status] = js.undefined
    ): DeleteFlowResponse = {
      val __obj = js.Dynamic.literal()
      FlowArn.foreach(__v => __obj.updateDynamic("FlowArn")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteFlowResponse]
    }
  }

  @js.native
  trait DescribeFlowRequest extends js.Object {
    var FlowArn: __string
  }

  object DescribeFlowRequest {
    @inline
    def apply(
        FlowArn: __string
    ): DescribeFlowRequest = {
      val __obj = js.Dynamic.literal(
        "FlowArn" -> FlowArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeFlowRequest]
    }
  }

  @js.native
  trait DescribeFlowResponse extends js.Object {
    var Flow: js.UndefOr[Flow]
    var Messages: js.UndefOr[Messages]
  }

  object DescribeFlowResponse {
    @inline
    def apply(
        Flow: js.UndefOr[Flow] = js.undefined,
        Messages: js.UndefOr[Messages] = js.undefined
    ): DescribeFlowResponse = {
      val __obj = js.Dynamic.literal()
      Flow.foreach(__v => __obj.updateDynamic("Flow")(__v.asInstanceOf[js.Any]))
      Messages.foreach(__v => __obj.updateDynamic("Messages")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeFlowResponse]
    }
  }

  /**
    * Information about the encryption of the flow.
    */
  @js.native
  trait Encryption extends js.Object {
    var Algorithm: Algorithm
    var RoleArn: __string
    var ConstantInitializationVector: js.UndefOr[__string]
    var DeviceId: js.UndefOr[__string]
    var KeyType: js.UndefOr[KeyType]
    var Region: js.UndefOr[__string]
    var ResourceId: js.UndefOr[__string]
    var SecretArn: js.UndefOr[__string]
    var Url: js.UndefOr[__string]
  }

  object Encryption {
    @inline
    def apply(
        Algorithm: Algorithm,
        RoleArn: __string,
        ConstantInitializationVector: js.UndefOr[__string] = js.undefined,
        DeviceId: js.UndefOr[__string] = js.undefined,
        KeyType: js.UndefOr[KeyType] = js.undefined,
        Region: js.UndefOr[__string] = js.undefined,
        ResourceId: js.UndefOr[__string] = js.undefined,
        SecretArn: js.UndefOr[__string] = js.undefined,
        Url: js.UndefOr[__string] = js.undefined
    ): Encryption = {
      val __obj = js.Dynamic.literal(
        "Algorithm" -> Algorithm.asInstanceOf[js.Any],
        "RoleArn" -> RoleArn.asInstanceOf[js.Any]
      )

      ConstantInitializationVector.foreach(__v => __obj.updateDynamic("ConstantInitializationVector")(__v.asInstanceOf[js.Any]))
      DeviceId.foreach(__v => __obj.updateDynamic("DeviceId")(__v.asInstanceOf[js.Any]))
      KeyType.foreach(__v => __obj.updateDynamic("KeyType")(__v.asInstanceOf[js.Any]))
      Region.foreach(__v => __obj.updateDynamic("Region")(__v.asInstanceOf[js.Any]))
      ResourceId.foreach(__v => __obj.updateDynamic("ResourceId")(__v.asInstanceOf[js.Any]))
      SecretArn.foreach(__v => __obj.updateDynamic("SecretArn")(__v.asInstanceOf[js.Any]))
      Url.foreach(__v => __obj.updateDynamic("Url")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Encryption]
    }
  }

  /**
    * The settings for a flow entitlement.
    */
  @js.native
  trait Entitlement extends js.Object {
    var EntitlementArn: __string
    var Name: __string
    var Subscribers: __listOf__string
    var DataTransferSubscriberFeePercent: js.UndefOr[__integer]
    var Description: js.UndefOr[__string]
    var Encryption: js.UndefOr[Encryption]
    var EntitlementStatus: js.UndefOr[EntitlementStatus]
  }

  object Entitlement {
    @inline
    def apply(
        EntitlementArn: __string,
        Name: __string,
        Subscribers: __listOf__string,
        DataTransferSubscriberFeePercent: js.UndefOr[__integer] = js.undefined,
        Description: js.UndefOr[__string] = js.undefined,
        Encryption: js.UndefOr[Encryption] = js.undefined,
        EntitlementStatus: js.UndefOr[EntitlementStatus] = js.undefined
    ): Entitlement = {
      val __obj = js.Dynamic.literal(
        "EntitlementArn" -> EntitlementArn.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any],
        "Subscribers" -> Subscribers.asInstanceOf[js.Any]
      )

      DataTransferSubscriberFeePercent.foreach(__v => __obj.updateDynamic("DataTransferSubscriberFeePercent")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Encryption.foreach(__v => __obj.updateDynamic("Encryption")(__v.asInstanceOf[js.Any]))
      EntitlementStatus.foreach(__v => __obj.updateDynamic("EntitlementStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Entitlement]
    }
  }

  @js.native
  sealed trait EntitlementStatus extends js.Any
  object EntitlementStatus extends js.Object {
    val ENABLED = "ENABLED".asInstanceOf[EntitlementStatus]
    val DISABLED = "DISABLED".asInstanceOf[EntitlementStatus]

    val values = js.Object.freeze(js.Array(ENABLED, DISABLED))
  }

  /**
    * The settings for source failover
    */
  @js.native
  trait FailoverConfig extends js.Object {
    var RecoveryWindow: js.UndefOr[__integer]
    var State: js.UndefOr[State]
  }

  object FailoverConfig {
    @inline
    def apply(
        RecoveryWindow: js.UndefOr[__integer] = js.undefined,
        State: js.UndefOr[State] = js.undefined
    ): FailoverConfig = {
      val __obj = js.Dynamic.literal()
      RecoveryWindow.foreach(__v => __obj.updateDynamic("RecoveryWindow")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FailoverConfig]
    }
  }

  /**
    * The settings for a flow, including its source, outputs, and entitlements.
    */
  @js.native
  trait Flow extends js.Object {
    var AvailabilityZone: __string
    var Entitlements: __listOfEntitlement
    var FlowArn: __string
    var Name: __string
    var Outputs: __listOfOutput
    var Source: Source
    var Status: Status
    var Description: js.UndefOr[__string]
    var EgressIp: js.UndefOr[__string]
    var SourceFailoverConfig: js.UndefOr[FailoverConfig]
    var Sources: js.UndefOr[__listOfSource]
    var VpcInterfaces: js.UndefOr[__listOfVpcInterface]
  }

  object Flow {
    @inline
    def apply(
        AvailabilityZone: __string,
        Entitlements: __listOfEntitlement,
        FlowArn: __string,
        Name: __string,
        Outputs: __listOfOutput,
        Source: Source,
        Status: Status,
        Description: js.UndefOr[__string] = js.undefined,
        EgressIp: js.UndefOr[__string] = js.undefined,
        SourceFailoverConfig: js.UndefOr[FailoverConfig] = js.undefined,
        Sources: js.UndefOr[__listOfSource] = js.undefined,
        VpcInterfaces: js.UndefOr[__listOfVpcInterface] = js.undefined
    ): Flow = {
      val __obj = js.Dynamic.literal(
        "AvailabilityZone" -> AvailabilityZone.asInstanceOf[js.Any],
        "Entitlements" -> Entitlements.asInstanceOf[js.Any],
        "FlowArn" -> FlowArn.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any],
        "Outputs" -> Outputs.asInstanceOf[js.Any],
        "Source" -> Source.asInstanceOf[js.Any],
        "Status" -> Status.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      EgressIp.foreach(__v => __obj.updateDynamic("EgressIp")(__v.asInstanceOf[js.Any]))
      SourceFailoverConfig.foreach(__v => __obj.updateDynamic("SourceFailoverConfig")(__v.asInstanceOf[js.Any]))
      Sources.foreach(__v => __obj.updateDynamic("Sources")(__v.asInstanceOf[js.Any]))
      VpcInterfaces.foreach(__v => __obj.updateDynamic("VpcInterfaces")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Flow]
    }
  }

  /**
    * The entitlements that you want to grant on a flow.
    */
  @js.native
  trait GrantEntitlementRequest extends js.Object {
    var Subscribers: __listOf__string
    var DataTransferSubscriberFeePercent: js.UndefOr[__integer]
    var Description: js.UndefOr[__string]
    var Encryption: js.UndefOr[Encryption]
    var EntitlementStatus: js.UndefOr[EntitlementStatus]
    var Name: js.UndefOr[__string]
  }

  object GrantEntitlementRequest {
    @inline
    def apply(
        Subscribers: __listOf__string,
        DataTransferSubscriberFeePercent: js.UndefOr[__integer] = js.undefined,
        Description: js.UndefOr[__string] = js.undefined,
        Encryption: js.UndefOr[Encryption] = js.undefined,
        EntitlementStatus: js.UndefOr[EntitlementStatus] = js.undefined,
        Name: js.UndefOr[__string] = js.undefined
    ): GrantEntitlementRequest = {
      val __obj = js.Dynamic.literal(
        "Subscribers" -> Subscribers.asInstanceOf[js.Any]
      )

      DataTransferSubscriberFeePercent.foreach(__v => __obj.updateDynamic("DataTransferSubscriberFeePercent")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Encryption.foreach(__v => __obj.updateDynamic("Encryption")(__v.asInstanceOf[js.Any]))
      EntitlementStatus.foreach(__v => __obj.updateDynamic("EntitlementStatus")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GrantEntitlementRequest]
    }
  }

  /**
    * A request to grant entitlements on a flow.
    */
  @js.native
  trait GrantFlowEntitlementsRequest extends js.Object {
    var Entitlements: __listOfGrantEntitlementRequest
    var FlowArn: __string
  }

  object GrantFlowEntitlementsRequest {
    @inline
    def apply(
        Entitlements: __listOfGrantEntitlementRequest,
        FlowArn: __string
    ): GrantFlowEntitlementsRequest = {
      val __obj = js.Dynamic.literal(
        "Entitlements" -> Entitlements.asInstanceOf[js.Any],
        "FlowArn" -> FlowArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GrantFlowEntitlementsRequest]
    }
  }

  @js.native
  trait GrantFlowEntitlementsResponse extends js.Object {
    var Entitlements: js.UndefOr[__listOfEntitlement]
    var FlowArn: js.UndefOr[__string]
  }

  object GrantFlowEntitlementsResponse {
    @inline
    def apply(
        Entitlements: js.UndefOr[__listOfEntitlement] = js.undefined,
        FlowArn: js.UndefOr[__string] = js.undefined
    ): GrantFlowEntitlementsResponse = {
      val __obj = js.Dynamic.literal()
      Entitlements.foreach(__v => __obj.updateDynamic("Entitlements")(__v.asInstanceOf[js.Any]))
      FlowArn.foreach(__v => __obj.updateDynamic("FlowArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GrantFlowEntitlementsResponse]
    }
  }

  @js.native
  sealed trait KeyType extends js.Any
  object KeyType extends js.Object {
    val speke = "speke".asInstanceOf[KeyType]
    val `static-key` = "static-key".asInstanceOf[KeyType]

    val values = js.Object.freeze(js.Array(speke, `static-key`))
  }

  @js.native
  trait ListEntitlementsRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[__string]
  }

  object ListEntitlementsRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): ListEntitlementsRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListEntitlementsRequest]
    }
  }

  @js.native
  trait ListEntitlementsResponse extends js.Object {
    var Entitlements: js.UndefOr[__listOfListedEntitlement]
    var NextToken: js.UndefOr[__string]
  }

  object ListEntitlementsResponse {
    @inline
    def apply(
        Entitlements: js.UndefOr[__listOfListedEntitlement] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): ListEntitlementsResponse = {
      val __obj = js.Dynamic.literal()
      Entitlements.foreach(__v => __obj.updateDynamic("Entitlements")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListEntitlementsResponse]
    }
  }

  @js.native
  trait ListFlowsRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[__string]
  }

  object ListFlowsRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): ListFlowsRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListFlowsRequest]
    }
  }

  @js.native
  trait ListFlowsResponse extends js.Object {
    var Flows: js.UndefOr[__listOfListedFlow]
    var NextToken: js.UndefOr[__string]
  }

  object ListFlowsResponse {
    @inline
    def apply(
        Flows: js.UndefOr[__listOfListedFlow] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): ListFlowsResponse = {
      val __obj = js.Dynamic.literal()
      Flows.foreach(__v => __obj.updateDynamic("Flows")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListFlowsResponse]
    }
  }

  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var ResourceArn: __string
  }

  object ListTagsForResourceRequest {
    @inline
    def apply(
        ResourceArn: __string
    ): ListTagsForResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ListTagsForResourceRequest]
    }
  }

  @js.native
  trait ListTagsForResourceResponse extends js.Object {
    var Tags: js.UndefOr[__mapOf__string]
  }

  object ListTagsForResourceResponse {
    @inline
    def apply(
        Tags: js.UndefOr[__mapOf__string] = js.undefined
    ): ListTagsForResourceResponse = {
      val __obj = js.Dynamic.literal()
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceResponse]
    }
  }

  /**
    * An entitlement that has been granted to you from other AWS accounts.
    */
  @js.native
  trait ListedEntitlement extends js.Object {
    var EntitlementArn: __string
    var EntitlementName: __string
    var DataTransferSubscriberFeePercent: js.UndefOr[__integer]
  }

  object ListedEntitlement {
    @inline
    def apply(
        EntitlementArn: __string,
        EntitlementName: __string,
        DataTransferSubscriberFeePercent: js.UndefOr[__integer] = js.undefined
    ): ListedEntitlement = {
      val __obj = js.Dynamic.literal(
        "EntitlementArn" -> EntitlementArn.asInstanceOf[js.Any],
        "EntitlementName" -> EntitlementName.asInstanceOf[js.Any]
      )

      DataTransferSubscriberFeePercent.foreach(__v => __obj.updateDynamic("DataTransferSubscriberFeePercent")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListedEntitlement]
    }
  }

  /**
    * Provides a summary of a flow, including its ARN, Availability Zone, and source type.
    */
  @js.native
  trait ListedFlow extends js.Object {
    var AvailabilityZone: __string
    var Description: __string
    var FlowArn: __string
    var Name: __string
    var SourceType: SourceType
    var Status: Status
  }

  object ListedFlow {
    @inline
    def apply(
        AvailabilityZone: __string,
        Description: __string,
        FlowArn: __string,
        Name: __string,
        SourceType: SourceType,
        Status: Status
    ): ListedFlow = {
      val __obj = js.Dynamic.literal(
        "AvailabilityZone" -> AvailabilityZone.asInstanceOf[js.Any],
        "Description" -> Description.asInstanceOf[js.Any],
        "FlowArn" -> FlowArn.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any],
        "SourceType" -> SourceType.asInstanceOf[js.Any],
        "Status" -> Status.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ListedFlow]
    }
  }

  /**
    * Messages that provide the state of the flow.
    */
  @js.native
  trait Messages extends js.Object {
    var Errors: __listOf__string
  }

  object Messages {
    @inline
    def apply(
        Errors: __listOf__string
    ): Messages = {
      val __obj = js.Dynamic.literal(
        "Errors" -> Errors.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[Messages]
    }
  }

  /**
    * The settings for an output.
    */
  @js.native
  trait Output extends js.Object {
    var Name: __string
    var OutputArn: __string
    var DataTransferSubscriberFeePercent: js.UndefOr[__integer]
    var Description: js.UndefOr[__string]
    var Destination: js.UndefOr[__string]
    var Encryption: js.UndefOr[Encryption]
    var EntitlementArn: js.UndefOr[__string]
    var MediaLiveInputArn: js.UndefOr[__string]
    var Port: js.UndefOr[__integer]
    var Transport: js.UndefOr[Transport]
    var VpcInterfaceAttachment: js.UndefOr[VpcInterfaceAttachment]
  }

  object Output {
    @inline
    def apply(
        Name: __string,
        OutputArn: __string,
        DataTransferSubscriberFeePercent: js.UndefOr[__integer] = js.undefined,
        Description: js.UndefOr[__string] = js.undefined,
        Destination: js.UndefOr[__string] = js.undefined,
        Encryption: js.UndefOr[Encryption] = js.undefined,
        EntitlementArn: js.UndefOr[__string] = js.undefined,
        MediaLiveInputArn: js.UndefOr[__string] = js.undefined,
        Port: js.UndefOr[__integer] = js.undefined,
        Transport: js.UndefOr[Transport] = js.undefined,
        VpcInterfaceAttachment: js.UndefOr[VpcInterfaceAttachment] = js.undefined
    ): Output = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "OutputArn" -> OutputArn.asInstanceOf[js.Any]
      )

      DataTransferSubscriberFeePercent.foreach(__v => __obj.updateDynamic("DataTransferSubscriberFeePercent")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Destination.foreach(__v => __obj.updateDynamic("Destination")(__v.asInstanceOf[js.Any]))
      Encryption.foreach(__v => __obj.updateDynamic("Encryption")(__v.asInstanceOf[js.Any]))
      EntitlementArn.foreach(__v => __obj.updateDynamic("EntitlementArn")(__v.asInstanceOf[js.Any]))
      MediaLiveInputArn.foreach(__v => __obj.updateDynamic("MediaLiveInputArn")(__v.asInstanceOf[js.Any]))
      Port.foreach(__v => __obj.updateDynamic("Port")(__v.asInstanceOf[js.Any]))
      Transport.foreach(__v => __obj.updateDynamic("Transport")(__v.asInstanceOf[js.Any]))
      VpcInterfaceAttachment.foreach(__v => __obj.updateDynamic("VpcInterfaceAttachment")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Output]
    }
  }

  @js.native
  sealed trait Protocol extends js.Any
  object Protocol extends js.Object {
    val `zixi-push` = "zixi-push".asInstanceOf[Protocol]
    val `rtp-fec` = "rtp-fec".asInstanceOf[Protocol]
    val rtp = "rtp".asInstanceOf[Protocol]
    val `zixi-pull` = "zixi-pull".asInstanceOf[Protocol]
    val rist = "rist".asInstanceOf[Protocol]

    val values = js.Object.freeze(js.Array(`zixi-push`, `rtp-fec`, rtp, `zixi-pull`, rist))
  }

  @js.native
  trait RemoveFlowOutputRequest extends js.Object {
    var FlowArn: __string
    var OutputArn: __string
  }

  object RemoveFlowOutputRequest {
    @inline
    def apply(
        FlowArn: __string,
        OutputArn: __string
    ): RemoveFlowOutputRequest = {
      val __obj = js.Dynamic.literal(
        "FlowArn" -> FlowArn.asInstanceOf[js.Any],
        "OutputArn" -> OutputArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[RemoveFlowOutputRequest]
    }
  }

  @js.native
  trait RemoveFlowOutputResponse extends js.Object {
    var FlowArn: js.UndefOr[__string]
    var OutputArn: js.UndefOr[__string]
  }

  object RemoveFlowOutputResponse {
    @inline
    def apply(
        FlowArn: js.UndefOr[__string] = js.undefined,
        OutputArn: js.UndefOr[__string] = js.undefined
    ): RemoveFlowOutputResponse = {
      val __obj = js.Dynamic.literal()
      FlowArn.foreach(__v => __obj.updateDynamic("FlowArn")(__v.asInstanceOf[js.Any]))
      OutputArn.foreach(__v => __obj.updateDynamic("OutputArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RemoveFlowOutputResponse]
    }
  }

  @js.native
  trait RemoveFlowSourceRequest extends js.Object {
    var FlowArn: __string
    var SourceArn: __string
  }

  object RemoveFlowSourceRequest {
    @inline
    def apply(
        FlowArn: __string,
        SourceArn: __string
    ): RemoveFlowSourceRequest = {
      val __obj = js.Dynamic.literal(
        "FlowArn" -> FlowArn.asInstanceOf[js.Any],
        "SourceArn" -> SourceArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[RemoveFlowSourceRequest]
    }
  }

  @js.native
  trait RemoveFlowSourceResponse extends js.Object {
    var FlowArn: js.UndefOr[__string]
    var SourceArn: js.UndefOr[__string]
  }

  object RemoveFlowSourceResponse {
    @inline
    def apply(
        FlowArn: js.UndefOr[__string] = js.undefined,
        SourceArn: js.UndefOr[__string] = js.undefined
    ): RemoveFlowSourceResponse = {
      val __obj = js.Dynamic.literal()
      FlowArn.foreach(__v => __obj.updateDynamic("FlowArn")(__v.asInstanceOf[js.Any]))
      SourceArn.foreach(__v => __obj.updateDynamic("SourceArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RemoveFlowSourceResponse]
    }
  }

  @js.native
  trait RemoveFlowVpcInterfaceRequest extends js.Object {
    var FlowArn: __string
    var VpcInterfaceName: __string
  }

  object RemoveFlowVpcInterfaceRequest {
    @inline
    def apply(
        FlowArn: __string,
        VpcInterfaceName: __string
    ): RemoveFlowVpcInterfaceRequest = {
      val __obj = js.Dynamic.literal(
        "FlowArn" -> FlowArn.asInstanceOf[js.Any],
        "VpcInterfaceName" -> VpcInterfaceName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[RemoveFlowVpcInterfaceRequest]
    }
  }

  @js.native
  trait RemoveFlowVpcInterfaceResponse extends js.Object {
    var FlowArn: js.UndefOr[__string]
    var NonDeletedNetworkInterfaceIds: js.UndefOr[__listOf__string]
    var VpcInterfaceName: js.UndefOr[__string]
  }

  object RemoveFlowVpcInterfaceResponse {
    @inline
    def apply(
        FlowArn: js.UndefOr[__string] = js.undefined,
        NonDeletedNetworkInterfaceIds: js.UndefOr[__listOf__string] = js.undefined,
        VpcInterfaceName: js.UndefOr[__string] = js.undefined
    ): RemoveFlowVpcInterfaceResponse = {
      val __obj = js.Dynamic.literal()
      FlowArn.foreach(__v => __obj.updateDynamic("FlowArn")(__v.asInstanceOf[js.Any]))
      NonDeletedNetworkInterfaceIds.foreach(__v => __obj.updateDynamic("NonDeletedNetworkInterfaceIds")(__v.asInstanceOf[js.Any]))
      VpcInterfaceName.foreach(__v => __obj.updateDynamic("VpcInterfaceName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RemoveFlowVpcInterfaceResponse]
    }
  }

  @js.native
  trait RevokeFlowEntitlementRequest extends js.Object {
    var EntitlementArn: __string
    var FlowArn: __string
  }

  object RevokeFlowEntitlementRequest {
    @inline
    def apply(
        EntitlementArn: __string,
        FlowArn: __string
    ): RevokeFlowEntitlementRequest = {
      val __obj = js.Dynamic.literal(
        "EntitlementArn" -> EntitlementArn.asInstanceOf[js.Any],
        "FlowArn" -> FlowArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[RevokeFlowEntitlementRequest]
    }
  }

  @js.native
  trait RevokeFlowEntitlementResponse extends js.Object {
    var EntitlementArn: js.UndefOr[__string]
    var FlowArn: js.UndefOr[__string]
  }

  object RevokeFlowEntitlementResponse {
    @inline
    def apply(
        EntitlementArn: js.UndefOr[__string] = js.undefined,
        FlowArn: js.UndefOr[__string] = js.undefined
    ): RevokeFlowEntitlementResponse = {
      val __obj = js.Dynamic.literal()
      EntitlementArn.foreach(__v => __obj.updateDynamic("EntitlementArn")(__v.asInstanceOf[js.Any]))
      FlowArn.foreach(__v => __obj.updateDynamic("FlowArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RevokeFlowEntitlementResponse]
    }
  }

  /**
    * The settings for the source of the flow.
    */
  @js.native
  trait SetSourceRequest extends js.Object {
    var Decryption: js.UndefOr[Encryption]
    var Description: js.UndefOr[__string]
    var EntitlementArn: js.UndefOr[__string]
    var IngestPort: js.UndefOr[__integer]
    var MaxBitrate: js.UndefOr[__integer]
    var MaxLatency: js.UndefOr[__integer]
    var Name: js.UndefOr[__string]
    var Protocol: js.UndefOr[Protocol]
    var StreamId: js.UndefOr[__string]
    var VpcInterfaceName: js.UndefOr[__string]
    var WhitelistCidr: js.UndefOr[__string]
  }

  object SetSourceRequest {
    @inline
    def apply(
        Decryption: js.UndefOr[Encryption] = js.undefined,
        Description: js.UndefOr[__string] = js.undefined,
        EntitlementArn: js.UndefOr[__string] = js.undefined,
        IngestPort: js.UndefOr[__integer] = js.undefined,
        MaxBitrate: js.UndefOr[__integer] = js.undefined,
        MaxLatency: js.UndefOr[__integer] = js.undefined,
        Name: js.UndefOr[__string] = js.undefined,
        Protocol: js.UndefOr[Protocol] = js.undefined,
        StreamId: js.UndefOr[__string] = js.undefined,
        VpcInterfaceName: js.UndefOr[__string] = js.undefined,
        WhitelistCidr: js.UndefOr[__string] = js.undefined
    ): SetSourceRequest = {
      val __obj = js.Dynamic.literal()
      Decryption.foreach(__v => __obj.updateDynamic("Decryption")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      EntitlementArn.foreach(__v => __obj.updateDynamic("EntitlementArn")(__v.asInstanceOf[js.Any]))
      IngestPort.foreach(__v => __obj.updateDynamic("IngestPort")(__v.asInstanceOf[js.Any]))
      MaxBitrate.foreach(__v => __obj.updateDynamic("MaxBitrate")(__v.asInstanceOf[js.Any]))
      MaxLatency.foreach(__v => __obj.updateDynamic("MaxLatency")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Protocol.foreach(__v => __obj.updateDynamic("Protocol")(__v.asInstanceOf[js.Any]))
      StreamId.foreach(__v => __obj.updateDynamic("StreamId")(__v.asInstanceOf[js.Any]))
      VpcInterfaceName.foreach(__v => __obj.updateDynamic("VpcInterfaceName")(__v.asInstanceOf[js.Any]))
      WhitelistCidr.foreach(__v => __obj.updateDynamic("WhitelistCidr")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SetSourceRequest]
    }
  }

  /**
    * The settings for the source of the flow.
    */
  @js.native
  trait Source extends js.Object {
    var Name: __string
    var SourceArn: __string
    var DataTransferSubscriberFeePercent: js.UndefOr[__integer]
    var Decryption: js.UndefOr[Encryption]
    var Description: js.UndefOr[__string]
    var EntitlementArn: js.UndefOr[__string]
    var IngestIp: js.UndefOr[__string]
    var IngestPort: js.UndefOr[__integer]
    var Transport: js.UndefOr[Transport]
    var VpcInterfaceName: js.UndefOr[__string]
    var WhitelistCidr: js.UndefOr[__string]
  }

  object Source {
    @inline
    def apply(
        Name: __string,
        SourceArn: __string,
        DataTransferSubscriberFeePercent: js.UndefOr[__integer] = js.undefined,
        Decryption: js.UndefOr[Encryption] = js.undefined,
        Description: js.UndefOr[__string] = js.undefined,
        EntitlementArn: js.UndefOr[__string] = js.undefined,
        IngestIp: js.UndefOr[__string] = js.undefined,
        IngestPort: js.UndefOr[__integer] = js.undefined,
        Transport: js.UndefOr[Transport] = js.undefined,
        VpcInterfaceName: js.UndefOr[__string] = js.undefined,
        WhitelistCidr: js.UndefOr[__string] = js.undefined
    ): Source = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "SourceArn" -> SourceArn.asInstanceOf[js.Any]
      )

      DataTransferSubscriberFeePercent.foreach(__v => __obj.updateDynamic("DataTransferSubscriberFeePercent")(__v.asInstanceOf[js.Any]))
      Decryption.foreach(__v => __obj.updateDynamic("Decryption")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      EntitlementArn.foreach(__v => __obj.updateDynamic("EntitlementArn")(__v.asInstanceOf[js.Any]))
      IngestIp.foreach(__v => __obj.updateDynamic("IngestIp")(__v.asInstanceOf[js.Any]))
      IngestPort.foreach(__v => __obj.updateDynamic("IngestPort")(__v.asInstanceOf[js.Any]))
      Transport.foreach(__v => __obj.updateDynamic("Transport")(__v.asInstanceOf[js.Any]))
      VpcInterfaceName.foreach(__v => __obj.updateDynamic("VpcInterfaceName")(__v.asInstanceOf[js.Any]))
      WhitelistCidr.foreach(__v => __obj.updateDynamic("WhitelistCidr")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Source]
    }
  }

  @js.native
  sealed trait SourceType extends js.Any
  object SourceType extends js.Object {
    val OWNED = "OWNED".asInstanceOf[SourceType]
    val ENTITLED = "ENTITLED".asInstanceOf[SourceType]

    val values = js.Object.freeze(js.Array(OWNED, ENTITLED))
  }

  @js.native
  trait StartFlowRequest extends js.Object {
    var FlowArn: __string
  }

  object StartFlowRequest {
    @inline
    def apply(
        FlowArn: __string
    ): StartFlowRequest = {
      val __obj = js.Dynamic.literal(
        "FlowArn" -> FlowArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[StartFlowRequest]
    }
  }

  @js.native
  trait StartFlowResponse extends js.Object {
    var FlowArn: js.UndefOr[__string]
    var Status: js.UndefOr[Status]
  }

  object StartFlowResponse {
    @inline
    def apply(
        FlowArn: js.UndefOr[__string] = js.undefined,
        Status: js.UndefOr[Status] = js.undefined
    ): StartFlowResponse = {
      val __obj = js.Dynamic.literal()
      FlowArn.foreach(__v => __obj.updateDynamic("FlowArn")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartFlowResponse]
    }
  }

  @js.native
  sealed trait State extends js.Any
  object State extends js.Object {
    val ENABLED = "ENABLED".asInstanceOf[State]
    val DISABLED = "DISABLED".asInstanceOf[State]

    val values = js.Object.freeze(js.Array(ENABLED, DISABLED))
  }

  @js.native
  sealed trait Status extends js.Any
  object Status extends js.Object {
    val STANDBY = "STANDBY".asInstanceOf[Status]
    val ACTIVE = "ACTIVE".asInstanceOf[Status]
    val UPDATING = "UPDATING".asInstanceOf[Status]
    val DELETING = "DELETING".asInstanceOf[Status]
    val STARTING = "STARTING".asInstanceOf[Status]
    val STOPPING = "STOPPING".asInstanceOf[Status]
    val ERROR = "ERROR".asInstanceOf[Status]

    val values = js.Object.freeze(js.Array(STANDBY, ACTIVE, UPDATING, DELETING, STARTING, STOPPING, ERROR))
  }

  @js.native
  trait StopFlowRequest extends js.Object {
    var FlowArn: __string
  }

  object StopFlowRequest {
    @inline
    def apply(
        FlowArn: __string
    ): StopFlowRequest = {
      val __obj = js.Dynamic.literal(
        "FlowArn" -> FlowArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[StopFlowRequest]
    }
  }

  @js.native
  trait StopFlowResponse extends js.Object {
    var FlowArn: js.UndefOr[__string]
    var Status: js.UndefOr[Status]
  }

  object StopFlowResponse {
    @inline
    def apply(
        FlowArn: js.UndefOr[__string] = js.undefined,
        Status: js.UndefOr[Status] = js.undefined
    ): StopFlowResponse = {
      val __obj = js.Dynamic.literal()
      FlowArn.foreach(__v => __obj.updateDynamic("FlowArn")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StopFlowResponse]
    }
  }

  /**
    * The tags to add to the resource. A tag is an array of key-value pairs. Tag keys can have a maximum character length of 128 characters, and tag values can have a maximum length of 256 characters.
    */
  @js.native
  trait TagResourceRequest extends js.Object {
    var ResourceArn: __string
    var Tags: __mapOf__string
  }

  object TagResourceRequest {
    @inline
    def apply(
        ResourceArn: __string,
        Tags: __mapOf__string
    ): TagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any],
        "Tags" -> Tags.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[TagResourceRequest]
    }
  }

  /**
    * Attributes related to the transport stream that are used in a source or output.
    */
  @js.native
  trait Transport extends js.Object {
    var Protocol: Protocol
    var CidrAllowList: js.UndefOr[__listOf__string]
    var MaxBitrate: js.UndefOr[__integer]
    var MaxLatency: js.UndefOr[__integer]
    var RemoteId: js.UndefOr[__string]
    var SmoothingLatency: js.UndefOr[__integer]
    var StreamId: js.UndefOr[__string]
  }

  object Transport {
    @inline
    def apply(
        Protocol: Protocol,
        CidrAllowList: js.UndefOr[__listOf__string] = js.undefined,
        MaxBitrate: js.UndefOr[__integer] = js.undefined,
        MaxLatency: js.UndefOr[__integer] = js.undefined,
        RemoteId: js.UndefOr[__string] = js.undefined,
        SmoothingLatency: js.UndefOr[__integer] = js.undefined,
        StreamId: js.UndefOr[__string] = js.undefined
    ): Transport = {
      val __obj = js.Dynamic.literal(
        "Protocol" -> Protocol.asInstanceOf[js.Any]
      )

      CidrAllowList.foreach(__v => __obj.updateDynamic("CidrAllowList")(__v.asInstanceOf[js.Any]))
      MaxBitrate.foreach(__v => __obj.updateDynamic("MaxBitrate")(__v.asInstanceOf[js.Any]))
      MaxLatency.foreach(__v => __obj.updateDynamic("MaxLatency")(__v.asInstanceOf[js.Any]))
      RemoteId.foreach(__v => __obj.updateDynamic("RemoteId")(__v.asInstanceOf[js.Any]))
      SmoothingLatency.foreach(__v => __obj.updateDynamic("SmoothingLatency")(__v.asInstanceOf[js.Any]))
      StreamId.foreach(__v => __obj.updateDynamic("StreamId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Transport]
    }
  }

  @js.native
  trait UntagResourceRequest extends js.Object {
    var ResourceArn: __string
    var TagKeys: __listOf__string
  }

  object UntagResourceRequest {
    @inline
    def apply(
        ResourceArn: __string,
        TagKeys: __listOf__string
    ): UntagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any],
        "TagKeys" -> TagKeys.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UntagResourceRequest]
    }
  }

  /**
    * Information about the encryption of the flow.
    */
  @js.native
  trait UpdateEncryption extends js.Object {
    var Algorithm: js.UndefOr[Algorithm]
    var ConstantInitializationVector: js.UndefOr[__string]
    var DeviceId: js.UndefOr[__string]
    var KeyType: js.UndefOr[KeyType]
    var Region: js.UndefOr[__string]
    var ResourceId: js.UndefOr[__string]
    var RoleArn: js.UndefOr[__string]
    var SecretArn: js.UndefOr[__string]
    var Url: js.UndefOr[__string]
  }

  object UpdateEncryption {
    @inline
    def apply(
        Algorithm: js.UndefOr[Algorithm] = js.undefined,
        ConstantInitializationVector: js.UndefOr[__string] = js.undefined,
        DeviceId: js.UndefOr[__string] = js.undefined,
        KeyType: js.UndefOr[KeyType] = js.undefined,
        Region: js.UndefOr[__string] = js.undefined,
        ResourceId: js.UndefOr[__string] = js.undefined,
        RoleArn: js.UndefOr[__string] = js.undefined,
        SecretArn: js.UndefOr[__string] = js.undefined,
        Url: js.UndefOr[__string] = js.undefined
    ): UpdateEncryption = {
      val __obj = js.Dynamic.literal()
      Algorithm.foreach(__v => __obj.updateDynamic("Algorithm")(__v.asInstanceOf[js.Any]))
      ConstantInitializationVector.foreach(__v => __obj.updateDynamic("ConstantInitializationVector")(__v.asInstanceOf[js.Any]))
      DeviceId.foreach(__v => __obj.updateDynamic("DeviceId")(__v.asInstanceOf[js.Any]))
      KeyType.foreach(__v => __obj.updateDynamic("KeyType")(__v.asInstanceOf[js.Any]))
      Region.foreach(__v => __obj.updateDynamic("Region")(__v.asInstanceOf[js.Any]))
      ResourceId.foreach(__v => __obj.updateDynamic("ResourceId")(__v.asInstanceOf[js.Any]))
      RoleArn.foreach(__v => __obj.updateDynamic("RoleArn")(__v.asInstanceOf[js.Any]))
      SecretArn.foreach(__v => __obj.updateDynamic("SecretArn")(__v.asInstanceOf[js.Any]))
      Url.foreach(__v => __obj.updateDynamic("Url")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateEncryption]
    }
  }

  /**
    * The settings for source failover
    */
  @js.native
  trait UpdateFailoverConfig extends js.Object {
    var RecoveryWindow: js.UndefOr[__integer]
    var State: js.UndefOr[State]
  }

  object UpdateFailoverConfig {
    @inline
    def apply(
        RecoveryWindow: js.UndefOr[__integer] = js.undefined,
        State: js.UndefOr[State] = js.undefined
    ): UpdateFailoverConfig = {
      val __obj = js.Dynamic.literal()
      RecoveryWindow.foreach(__v => __obj.updateDynamic("RecoveryWindow")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateFailoverConfig]
    }
  }

  /**
    * The entitlement fields that you want to update.
    */
  @js.native
  trait UpdateFlowEntitlementRequest extends js.Object {
    var EntitlementArn: __string
    var FlowArn: __string
    var Description: js.UndefOr[__string]
    var Encryption: js.UndefOr[UpdateEncryption]
    var EntitlementStatus: js.UndefOr[EntitlementStatus]
    var Subscribers: js.UndefOr[__listOf__string]
  }

  object UpdateFlowEntitlementRequest {
    @inline
    def apply(
        EntitlementArn: __string,
        FlowArn: __string,
        Description: js.UndefOr[__string] = js.undefined,
        Encryption: js.UndefOr[UpdateEncryption] = js.undefined,
        EntitlementStatus: js.UndefOr[EntitlementStatus] = js.undefined,
        Subscribers: js.UndefOr[__listOf__string] = js.undefined
    ): UpdateFlowEntitlementRequest = {
      val __obj = js.Dynamic.literal(
        "EntitlementArn" -> EntitlementArn.asInstanceOf[js.Any],
        "FlowArn" -> FlowArn.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Encryption.foreach(__v => __obj.updateDynamic("Encryption")(__v.asInstanceOf[js.Any]))
      EntitlementStatus.foreach(__v => __obj.updateDynamic("EntitlementStatus")(__v.asInstanceOf[js.Any]))
      Subscribers.foreach(__v => __obj.updateDynamic("Subscribers")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateFlowEntitlementRequest]
    }
  }

  @js.native
  trait UpdateFlowEntitlementResponse extends js.Object {
    var Entitlement: js.UndefOr[Entitlement]
    var FlowArn: js.UndefOr[__string]
  }

  object UpdateFlowEntitlementResponse {
    @inline
    def apply(
        Entitlement: js.UndefOr[Entitlement] = js.undefined,
        FlowArn: js.UndefOr[__string] = js.undefined
    ): UpdateFlowEntitlementResponse = {
      val __obj = js.Dynamic.literal()
      Entitlement.foreach(__v => __obj.updateDynamic("Entitlement")(__v.asInstanceOf[js.Any]))
      FlowArn.foreach(__v => __obj.updateDynamic("FlowArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateFlowEntitlementResponse]
    }
  }

  /**
    * The fields that you want to update in the output.
    */
  @js.native
  trait UpdateFlowOutputRequest extends js.Object {
    var FlowArn: __string
    var OutputArn: __string
    var CidrAllowList: js.UndefOr[__listOf__string]
    var Description: js.UndefOr[__string]
    var Destination: js.UndefOr[__string]
    var Encryption: js.UndefOr[UpdateEncryption]
    var MaxLatency: js.UndefOr[__integer]
    var Port: js.UndefOr[__integer]
    var Protocol: js.UndefOr[Protocol]
    var RemoteId: js.UndefOr[__string]
    var SmoothingLatency: js.UndefOr[__integer]
    var StreamId: js.UndefOr[__string]
    var VpcInterfaceAttachment: js.UndefOr[VpcInterfaceAttachment]
  }

  object UpdateFlowOutputRequest {
    @inline
    def apply(
        FlowArn: __string,
        OutputArn: __string,
        CidrAllowList: js.UndefOr[__listOf__string] = js.undefined,
        Description: js.UndefOr[__string] = js.undefined,
        Destination: js.UndefOr[__string] = js.undefined,
        Encryption: js.UndefOr[UpdateEncryption] = js.undefined,
        MaxLatency: js.UndefOr[__integer] = js.undefined,
        Port: js.UndefOr[__integer] = js.undefined,
        Protocol: js.UndefOr[Protocol] = js.undefined,
        RemoteId: js.UndefOr[__string] = js.undefined,
        SmoothingLatency: js.UndefOr[__integer] = js.undefined,
        StreamId: js.UndefOr[__string] = js.undefined,
        VpcInterfaceAttachment: js.UndefOr[VpcInterfaceAttachment] = js.undefined
    ): UpdateFlowOutputRequest = {
      val __obj = js.Dynamic.literal(
        "FlowArn" -> FlowArn.asInstanceOf[js.Any],
        "OutputArn" -> OutputArn.asInstanceOf[js.Any]
      )

      CidrAllowList.foreach(__v => __obj.updateDynamic("CidrAllowList")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Destination.foreach(__v => __obj.updateDynamic("Destination")(__v.asInstanceOf[js.Any]))
      Encryption.foreach(__v => __obj.updateDynamic("Encryption")(__v.asInstanceOf[js.Any]))
      MaxLatency.foreach(__v => __obj.updateDynamic("MaxLatency")(__v.asInstanceOf[js.Any]))
      Port.foreach(__v => __obj.updateDynamic("Port")(__v.asInstanceOf[js.Any]))
      Protocol.foreach(__v => __obj.updateDynamic("Protocol")(__v.asInstanceOf[js.Any]))
      RemoteId.foreach(__v => __obj.updateDynamic("RemoteId")(__v.asInstanceOf[js.Any]))
      SmoothingLatency.foreach(__v => __obj.updateDynamic("SmoothingLatency")(__v.asInstanceOf[js.Any]))
      StreamId.foreach(__v => __obj.updateDynamic("StreamId")(__v.asInstanceOf[js.Any]))
      VpcInterfaceAttachment.foreach(__v => __obj.updateDynamic("VpcInterfaceAttachment")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateFlowOutputRequest]
    }
  }

  @js.native
  trait UpdateFlowOutputResponse extends js.Object {
    var FlowArn: js.UndefOr[__string]
    var Output: js.UndefOr[Output]
  }

  object UpdateFlowOutputResponse {
    @inline
    def apply(
        FlowArn: js.UndefOr[__string] = js.undefined,
        Output: js.UndefOr[Output] = js.undefined
    ): UpdateFlowOutputResponse = {
      val __obj = js.Dynamic.literal()
      FlowArn.foreach(__v => __obj.updateDynamic("FlowArn")(__v.asInstanceOf[js.Any]))
      Output.foreach(__v => __obj.updateDynamic("Output")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateFlowOutputResponse]
    }
  }

  /**
    * A request to update flow.
    */
  @js.native
  trait UpdateFlowRequest extends js.Object {
    var FlowArn: __string
    var SourceFailoverConfig: js.UndefOr[UpdateFailoverConfig]
  }

  object UpdateFlowRequest {
    @inline
    def apply(
        FlowArn: __string,
        SourceFailoverConfig: js.UndefOr[UpdateFailoverConfig] = js.undefined
    ): UpdateFlowRequest = {
      val __obj = js.Dynamic.literal(
        "FlowArn" -> FlowArn.asInstanceOf[js.Any]
      )

      SourceFailoverConfig.foreach(__v => __obj.updateDynamic("SourceFailoverConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateFlowRequest]
    }
  }

  @js.native
  trait UpdateFlowResponse extends js.Object {
    var Flow: js.UndefOr[Flow]
  }

  object UpdateFlowResponse {
    @inline
    def apply(
        Flow: js.UndefOr[Flow] = js.undefined
    ): UpdateFlowResponse = {
      val __obj = js.Dynamic.literal()
      Flow.foreach(__v => __obj.updateDynamic("Flow")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateFlowResponse]
    }
  }

  /**
    * A request to update the source of a flow.
    */
  @js.native
  trait UpdateFlowSourceRequest extends js.Object {
    var FlowArn: __string
    var SourceArn: __string
    var Decryption: js.UndefOr[UpdateEncryption]
    var Description: js.UndefOr[__string]
    var EntitlementArn: js.UndefOr[__string]
    var IngestPort: js.UndefOr[__integer]
    var MaxBitrate: js.UndefOr[__integer]
    var MaxLatency: js.UndefOr[__integer]
    var Protocol: js.UndefOr[Protocol]
    var StreamId: js.UndefOr[__string]
    var VpcInterfaceName: js.UndefOr[__string]
    var WhitelistCidr: js.UndefOr[__string]
  }

  object UpdateFlowSourceRequest {
    @inline
    def apply(
        FlowArn: __string,
        SourceArn: __string,
        Decryption: js.UndefOr[UpdateEncryption] = js.undefined,
        Description: js.UndefOr[__string] = js.undefined,
        EntitlementArn: js.UndefOr[__string] = js.undefined,
        IngestPort: js.UndefOr[__integer] = js.undefined,
        MaxBitrate: js.UndefOr[__integer] = js.undefined,
        MaxLatency: js.UndefOr[__integer] = js.undefined,
        Protocol: js.UndefOr[Protocol] = js.undefined,
        StreamId: js.UndefOr[__string] = js.undefined,
        VpcInterfaceName: js.UndefOr[__string] = js.undefined,
        WhitelistCidr: js.UndefOr[__string] = js.undefined
    ): UpdateFlowSourceRequest = {
      val __obj = js.Dynamic.literal(
        "FlowArn" -> FlowArn.asInstanceOf[js.Any],
        "SourceArn" -> SourceArn.asInstanceOf[js.Any]
      )

      Decryption.foreach(__v => __obj.updateDynamic("Decryption")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      EntitlementArn.foreach(__v => __obj.updateDynamic("EntitlementArn")(__v.asInstanceOf[js.Any]))
      IngestPort.foreach(__v => __obj.updateDynamic("IngestPort")(__v.asInstanceOf[js.Any]))
      MaxBitrate.foreach(__v => __obj.updateDynamic("MaxBitrate")(__v.asInstanceOf[js.Any]))
      MaxLatency.foreach(__v => __obj.updateDynamic("MaxLatency")(__v.asInstanceOf[js.Any]))
      Protocol.foreach(__v => __obj.updateDynamic("Protocol")(__v.asInstanceOf[js.Any]))
      StreamId.foreach(__v => __obj.updateDynamic("StreamId")(__v.asInstanceOf[js.Any]))
      VpcInterfaceName.foreach(__v => __obj.updateDynamic("VpcInterfaceName")(__v.asInstanceOf[js.Any]))
      WhitelistCidr.foreach(__v => __obj.updateDynamic("WhitelistCidr")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateFlowSourceRequest]
    }
  }

  @js.native
  trait UpdateFlowSourceResponse extends js.Object {
    var FlowArn: js.UndefOr[__string]
    var Source: js.UndefOr[Source]
  }

  object UpdateFlowSourceResponse {
    @inline
    def apply(
        FlowArn: js.UndefOr[__string] = js.undefined,
        Source: js.UndefOr[Source] = js.undefined
    ): UpdateFlowSourceResponse = {
      val __obj = js.Dynamic.literal()
      FlowArn.foreach(__v => __obj.updateDynamic("FlowArn")(__v.asInstanceOf[js.Any]))
      Source.foreach(__v => __obj.updateDynamic("Source")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateFlowSourceResponse]
    }
  }

  /**
    * The settings for a VPC Source.
    */
  @js.native
  trait VpcInterface extends js.Object {
    var Name: __string
    var NetworkInterfaceIds: __listOf__string
    var RoleArn: __string
    var SecurityGroupIds: __listOf__string
    var SubnetId: __string
  }

  object VpcInterface {
    @inline
    def apply(
        Name: __string,
        NetworkInterfaceIds: __listOf__string,
        RoleArn: __string,
        SecurityGroupIds: __listOf__string,
        SubnetId: __string
    ): VpcInterface = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "NetworkInterfaceIds" -> NetworkInterfaceIds.asInstanceOf[js.Any],
        "RoleArn" -> RoleArn.asInstanceOf[js.Any],
        "SecurityGroupIds" -> SecurityGroupIds.asInstanceOf[js.Any],
        "SubnetId" -> SubnetId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[VpcInterface]
    }
  }

  /**
    * The settings for attaching a VPC interface to an output.
    */
  @js.native
  trait VpcInterfaceAttachment extends js.Object {
    var VpcInterfaceName: js.UndefOr[__string]
  }

  object VpcInterfaceAttachment {
    @inline
    def apply(
        VpcInterfaceName: js.UndefOr[__string] = js.undefined
    ): VpcInterfaceAttachment = {
      val __obj = js.Dynamic.literal()
      VpcInterfaceName.foreach(__v => __obj.updateDynamic("VpcInterfaceName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VpcInterfaceAttachment]
    }
  }

  /**
    * Desired VPC Interface for a Flow
    */
  @js.native
  trait VpcInterfaceRequest extends js.Object {
    var Name: __string
    var RoleArn: __string
    var SecurityGroupIds: __listOf__string
    var SubnetId: __string
  }

  object VpcInterfaceRequest {
    @inline
    def apply(
        Name: __string,
        RoleArn: __string,
        SecurityGroupIds: __listOf__string,
        SubnetId: __string
    ): VpcInterfaceRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "RoleArn" -> RoleArn.asInstanceOf[js.Any],
        "SecurityGroupIds" -> SecurityGroupIds.asInstanceOf[js.Any],
        "SubnetId" -> SubnetId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[VpcInterfaceRequest]
    }
  }
}
