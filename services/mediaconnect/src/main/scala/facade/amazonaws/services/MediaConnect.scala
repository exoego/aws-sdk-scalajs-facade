package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import scala.language.implicitConversions
import facade.amazonaws._

package object mediaconnect {
  type MaxResults = Int
  type __double = Double
  type __integer = Int
  type __listOfAddMediaStreamRequest = js.Array[AddMediaStreamRequest]
  type __listOfAddOutputRequest = js.Array[AddOutputRequest]
  type __listOfDestinationConfiguration = js.Array[DestinationConfiguration]
  type __listOfDestinationConfigurationRequest = js.Array[DestinationConfigurationRequest]
  type __listOfEntitlement = js.Array[Entitlement]
  type __listOfGrantEntitlementRequest = js.Array[GrantEntitlementRequest]
  type __listOfInputConfiguration = js.Array[InputConfiguration]
  type __listOfInputConfigurationRequest = js.Array[InputConfigurationRequest]
  type __listOfListedEntitlement = js.Array[ListedEntitlement]
  type __listOfListedFlow = js.Array[ListedFlow]
  type __listOfMediaStream = js.Array[MediaStream]
  type __listOfMediaStreamOutputConfiguration = js.Array[MediaStreamOutputConfiguration]
  type __listOfMediaStreamOutputConfigurationRequest = js.Array[MediaStreamOutputConfigurationRequest]
  type __listOfMediaStreamSourceConfiguration = js.Array[MediaStreamSourceConfiguration]
  type __listOfMediaStreamSourceConfigurationRequest = js.Array[MediaStreamSourceConfigurationRequest]
  type __listOfOffering = js.Array[Offering]
  type __listOfOutput = js.Array[Output]
  type __listOfReservation = js.Array[Reservation]
  type __listOfSetSourceRequest = js.Array[SetSourceRequest]
  type __listOfSource = js.Array[Source]
  type __listOfVpcInterface = js.Array[VpcInterface]
  type __listOfVpcInterfaceRequest = js.Array[VpcInterfaceRequest]
  type __listOf__string = js.Array[__string]
  type __mapOf__string = js.Dictionary[__string]
  type __string = String

  final class MediaConnectOps(private val service: MediaConnect) extends AnyVal {

    @inline def addFlowMediaStreamsFuture(params: AddFlowMediaStreamsRequest): Future[AddFlowMediaStreamsResponse] = service.addFlowMediaStreams(params).promise().toFuture
    @inline def addFlowOutputsFuture(params: AddFlowOutputsRequest): Future[AddFlowOutputsResponse] = service.addFlowOutputs(params).promise().toFuture
    @inline def addFlowSourcesFuture(params: AddFlowSourcesRequest): Future[AddFlowSourcesResponse] = service.addFlowSources(params).promise().toFuture
    @inline def addFlowVpcInterfacesFuture(params: AddFlowVpcInterfacesRequest): Future[AddFlowVpcInterfacesResponse] = service.addFlowVpcInterfaces(params).promise().toFuture
    @inline def createFlowFuture(params: CreateFlowRequest): Future[CreateFlowResponse] = service.createFlow(params).promise().toFuture
    @inline def deleteFlowFuture(params: DeleteFlowRequest): Future[DeleteFlowResponse] = service.deleteFlow(params).promise().toFuture
    @inline def describeFlowFuture(params: DescribeFlowRequest): Future[DescribeFlowResponse] = service.describeFlow(params).promise().toFuture
    @inline def describeOfferingFuture(params: DescribeOfferingRequest): Future[DescribeOfferingResponse] = service.describeOffering(params).promise().toFuture
    @inline def describeReservationFuture(params: DescribeReservationRequest): Future[DescribeReservationResponse] = service.describeReservation(params).promise().toFuture
    @inline def grantFlowEntitlementsFuture(params: GrantFlowEntitlementsRequest): Future[GrantFlowEntitlementsResponse] = service.grantFlowEntitlements(params).promise().toFuture
    @inline def listEntitlementsFuture(params: ListEntitlementsRequest): Future[ListEntitlementsResponse] = service.listEntitlements(params).promise().toFuture
    @inline def listFlowsFuture(params: ListFlowsRequest): Future[ListFlowsResponse] = service.listFlows(params).promise().toFuture
    @inline def listOfferingsFuture(params: ListOfferingsRequest): Future[ListOfferingsResponse] = service.listOfferings(params).promise().toFuture
    @inline def listReservationsFuture(params: ListReservationsRequest): Future[ListReservationsResponse] = service.listReservations(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] = service.listTagsForResource(params).promise().toFuture
    @inline def purchaseOfferingFuture(params: PurchaseOfferingRequest): Future[PurchaseOfferingResponse] = service.purchaseOffering(params).promise().toFuture
    @inline def removeFlowMediaStreamFuture(params: RemoveFlowMediaStreamRequest): Future[RemoveFlowMediaStreamResponse] = service.removeFlowMediaStream(params).promise().toFuture
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
    @inline def updateFlowMediaStreamFuture(params: UpdateFlowMediaStreamRequest): Future[UpdateFlowMediaStreamResponse] = service.updateFlowMediaStream(params).promise().toFuture
    @inline def updateFlowOutputFuture(params: UpdateFlowOutputRequest): Future[UpdateFlowOutputResponse] = service.updateFlowOutput(params).promise().toFuture
    @inline def updateFlowSourceFuture(params: UpdateFlowSourceRequest): Future[UpdateFlowSourceResponse] = service.updateFlowSource(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/mediaconnect", JSImport.Namespace, "AWS.MediaConnect")
  class MediaConnect() extends js.Object {
    def this(config: AWSConfig) = this()

    def addFlowMediaStreams(params: AddFlowMediaStreamsRequest): Request[AddFlowMediaStreamsResponse] = js.native
    def addFlowOutputs(params: AddFlowOutputsRequest): Request[AddFlowOutputsResponse] = js.native
    def addFlowSources(params: AddFlowSourcesRequest): Request[AddFlowSourcesResponse] = js.native
    def addFlowVpcInterfaces(params: AddFlowVpcInterfacesRequest): Request[AddFlowVpcInterfacesResponse] = js.native
    def createFlow(params: CreateFlowRequest): Request[CreateFlowResponse] = js.native
    def deleteFlow(params: DeleteFlowRequest): Request[DeleteFlowResponse] = js.native
    def describeFlow(params: DescribeFlowRequest): Request[DescribeFlowResponse] = js.native
    def describeOffering(params: DescribeOfferingRequest): Request[DescribeOfferingResponse] = js.native
    def describeReservation(params: DescribeReservationRequest): Request[DescribeReservationResponse] = js.native
    def grantFlowEntitlements(params: GrantFlowEntitlementsRequest): Request[GrantFlowEntitlementsResponse] = js.native
    def listEntitlements(params: ListEntitlementsRequest): Request[ListEntitlementsResponse] = js.native
    def listFlows(params: ListFlowsRequest): Request[ListFlowsResponse] = js.native
    def listOfferings(params: ListOfferingsRequest): Request[ListOfferingsResponse] = js.native
    def listReservations(params: ListReservationsRequest): Request[ListReservationsResponse] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def purchaseOffering(params: PurchaseOfferingRequest): Request[PurchaseOfferingResponse] = js.native
    def removeFlowMediaStream(params: RemoveFlowMediaStreamRequest): Request[RemoveFlowMediaStreamResponse] = js.native
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
    def updateFlowMediaStream(params: UpdateFlowMediaStreamRequest): Request[UpdateFlowMediaStreamResponse] = js.native
    def updateFlowOutput(params: UpdateFlowOutputRequest): Request[UpdateFlowOutputResponse] = js.native
    def updateFlowSource(params: UpdateFlowSourceRequest): Request[UpdateFlowSourceResponse] = js.native
  }
  object MediaConnect {
    @inline implicit def toOps(service: MediaConnect): MediaConnectOps = {
      new MediaConnectOps(service)
    }
  }

  /** A request to add media streams to the flow.
    */
  @js.native
  trait AddFlowMediaStreamsRequest extends js.Object {
    var FlowArn: __string
    var MediaStreams: __listOfAddMediaStreamRequest
  }

  object AddFlowMediaStreamsRequest {
    @inline
    def apply(
        FlowArn: __string,
        MediaStreams: __listOfAddMediaStreamRequest
    ): AddFlowMediaStreamsRequest = {
      val __obj = js.Dynamic.literal(
        "FlowArn" -> FlowArn.asInstanceOf[js.Any],
        "MediaStreams" -> MediaStreams.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AddFlowMediaStreamsRequest]
    }
  }

  @js.native
  trait AddFlowMediaStreamsResponse extends js.Object {
    var FlowArn: js.UndefOr[__string]
    var MediaStreams: js.UndefOr[__listOfMediaStream]
  }

  object AddFlowMediaStreamsResponse {
    @inline
    def apply(
        FlowArn: js.UndefOr[__string] = js.undefined,
        MediaStreams: js.UndefOr[__listOfMediaStream] = js.undefined
    ): AddFlowMediaStreamsResponse = {
      val __obj = js.Dynamic.literal()
      FlowArn.foreach(__v => __obj.updateDynamic("FlowArn")(__v.asInstanceOf[js.Any]))
      MediaStreams.foreach(__v => __obj.updateDynamic("MediaStreams")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AddFlowMediaStreamsResponse]
    }
  }

  /** A request to add outputs to the specified flow.
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

  /** A request to add sources to the flow.
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

  /** A request to add VPC interfaces to the flow.
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

  /** The media stream that you want to add to the flow.
    */
  @js.native
  trait AddMediaStreamRequest extends js.Object {
    var MediaStreamId: __integer
    var MediaStreamName: __string
    var MediaStreamType: MediaStreamType
    var Attributes: js.UndefOr[MediaStreamAttributesRequest]
    var ClockRate: js.UndefOr[__integer]
    var Description: js.UndefOr[__string]
    var VideoFormat: js.UndefOr[__string]
  }

  object AddMediaStreamRequest {
    @inline
    def apply(
        MediaStreamId: __integer,
        MediaStreamName: __string,
        MediaStreamType: MediaStreamType,
        Attributes: js.UndefOr[MediaStreamAttributesRequest] = js.undefined,
        ClockRate: js.UndefOr[__integer] = js.undefined,
        Description: js.UndefOr[__string] = js.undefined,
        VideoFormat: js.UndefOr[__string] = js.undefined
    ): AddMediaStreamRequest = {
      val __obj = js.Dynamic.literal(
        "MediaStreamId" -> MediaStreamId.asInstanceOf[js.Any],
        "MediaStreamName" -> MediaStreamName.asInstanceOf[js.Any],
        "MediaStreamType" -> MediaStreamType.asInstanceOf[js.Any]
      )

      Attributes.foreach(__v => __obj.updateDynamic("Attributes")(__v.asInstanceOf[js.Any]))
      ClockRate.foreach(__v => __obj.updateDynamic("ClockRate")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      VideoFormat.foreach(__v => __obj.updateDynamic("VideoFormat")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AddMediaStreamRequest]
    }
  }

  /** The output that you want to add to this flow.
    */
  @js.native
  trait AddOutputRequest extends js.Object {
    var Protocol: Protocol
    var CidrAllowList: js.UndefOr[__listOf__string]
    var Description: js.UndefOr[__string]
    var Destination: js.UndefOr[__string]
    var Encryption: js.UndefOr[Encryption]
    var MaxLatency: js.UndefOr[__integer]
    var MediaStreamOutputConfigurations: js.UndefOr[__listOfMediaStreamOutputConfigurationRequest]
    var MinLatency: js.UndefOr[__integer]
    var Name: js.UndefOr[__string]
    var Port: js.UndefOr[__integer]
    var RemoteId: js.UndefOr[__string]
    var SenderControlPort: js.UndefOr[__integer]
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
        MediaStreamOutputConfigurations: js.UndefOr[__listOfMediaStreamOutputConfigurationRequest] = js.undefined,
        MinLatency: js.UndefOr[__integer] = js.undefined,
        Name: js.UndefOr[__string] = js.undefined,
        Port: js.UndefOr[__integer] = js.undefined,
        RemoteId: js.UndefOr[__string] = js.undefined,
        SenderControlPort: js.UndefOr[__integer] = js.undefined,
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
      MediaStreamOutputConfigurations.foreach(__v => __obj.updateDynamic("MediaStreamOutputConfigurations")(__v.asInstanceOf[js.Any]))
      MinLatency.foreach(__v => __obj.updateDynamic("MinLatency")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Port.foreach(__v => __obj.updateDynamic("Port")(__v.asInstanceOf[js.Any]))
      RemoteId.foreach(__v => __obj.updateDynamic("RemoteId")(__v.asInstanceOf[js.Any]))
      SenderControlPort.foreach(__v => __obj.updateDynamic("SenderControlPort")(__v.asInstanceOf[js.Any]))
      SmoothingLatency.foreach(__v => __obj.updateDynamic("SmoothingLatency")(__v.asInstanceOf[js.Any]))
      StreamId.foreach(__v => __obj.updateDynamic("StreamId")(__v.asInstanceOf[js.Any]))
      VpcInterfaceAttachment.foreach(__v => __obj.updateDynamic("VpcInterfaceAttachment")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AddOutputRequest]
    }
  }

  /** Creates a new flow. The request must include one source. The request optionally can include outputs (up to 50) and entitlements (up to 50).
    */
  @js.native
  trait CreateFlowRequest extends js.Object {
    var Name: __string
    var AvailabilityZone: js.UndefOr[__string]
    var Entitlements: js.UndefOr[__listOfGrantEntitlementRequest]
    var MediaStreams: js.UndefOr[__listOfAddMediaStreamRequest]
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
        MediaStreams: js.UndefOr[__listOfAddMediaStreamRequest] = js.undefined,
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
      MediaStreams.foreach(__v => __obj.updateDynamic("MediaStreams")(__v.asInstanceOf[js.Any]))
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

  @js.native
  trait DescribeOfferingRequest extends js.Object {
    var OfferingArn: __string
  }

  object DescribeOfferingRequest {
    @inline
    def apply(
        OfferingArn: __string
    ): DescribeOfferingRequest = {
      val __obj = js.Dynamic.literal(
        "OfferingArn" -> OfferingArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeOfferingRequest]
    }
  }

  @js.native
  trait DescribeOfferingResponse extends js.Object {
    var Offering: js.UndefOr[Offering]
  }

  object DescribeOfferingResponse {
    @inline
    def apply(
        Offering: js.UndefOr[Offering] = js.undefined
    ): DescribeOfferingResponse = {
      val __obj = js.Dynamic.literal()
      Offering.foreach(__v => __obj.updateDynamic("Offering")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeOfferingResponse]
    }
  }

  @js.native
  trait DescribeReservationRequest extends js.Object {
    var ReservationArn: __string
  }

  object DescribeReservationRequest {
    @inline
    def apply(
        ReservationArn: __string
    ): DescribeReservationRequest = {
      val __obj = js.Dynamic.literal(
        "ReservationArn" -> ReservationArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeReservationRequest]
    }
  }

  @js.native
  trait DescribeReservationResponse extends js.Object {
    var Reservation: js.UndefOr[Reservation]
  }

  object DescribeReservationResponse {
    @inline
    def apply(
        Reservation: js.UndefOr[Reservation] = js.undefined
    ): DescribeReservationResponse = {
      val __obj = js.Dynamic.literal()
      Reservation.foreach(__v => __obj.updateDynamic("Reservation")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeReservationResponse]
    }
  }

  /** The transport parameters that are associated with an outbound media stream.
    */
  @js.native
  trait DestinationConfiguration extends js.Object {
    var DestinationIp: __string
    var DestinationPort: __integer
    var Interface: Interface
    var OutboundIp: __string
  }

  object DestinationConfiguration {
    @inline
    def apply(
        DestinationIp: __string,
        DestinationPort: __integer,
        Interface: Interface,
        OutboundIp: __string
    ): DestinationConfiguration = {
      val __obj = js.Dynamic.literal(
        "DestinationIp" -> DestinationIp.asInstanceOf[js.Any],
        "DestinationPort" -> DestinationPort.asInstanceOf[js.Any],
        "Interface" -> Interface.asInstanceOf[js.Any],
        "OutboundIp" -> OutboundIp.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DestinationConfiguration]
    }
  }

  /** The transport parameters that you want to associate with an outbound media stream.
    */
  @js.native
  trait DestinationConfigurationRequest extends js.Object {
    var DestinationIp: __string
    var DestinationPort: __integer
    var Interface: InterfaceRequest
  }

  object DestinationConfigurationRequest {
    @inline
    def apply(
        DestinationIp: __string,
        DestinationPort: __integer,
        Interface: InterfaceRequest
    ): DestinationConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "DestinationIp" -> DestinationIp.asInstanceOf[js.Any],
        "DestinationPort" -> DestinationPort.asInstanceOf[js.Any],
        "Interface" -> Interface.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DestinationConfigurationRequest]
    }
  }

  /** A collection of parameters that determine how MediaConnect will convert the content. These fields only apply to outputs on flows that have a CDI source.
    */
  @js.native
  trait EncodingParameters extends js.Object {
    var CompressionFactor: __double
    var EncoderProfile: EncoderProfile
  }

  object EncodingParameters {
    @inline
    def apply(
        CompressionFactor: __double,
        EncoderProfile: EncoderProfile
    ): EncodingParameters = {
      val __obj = js.Dynamic.literal(
        "CompressionFactor" -> CompressionFactor.asInstanceOf[js.Any],
        "EncoderProfile" -> EncoderProfile.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[EncodingParameters]
    }
  }

  /** A collection of parameters that determine how MediaConnect will convert the content. These fields only apply to outputs on flows that have a CDI source.
    */
  @js.native
  trait EncodingParametersRequest extends js.Object {
    var CompressionFactor: __double
    var EncoderProfile: EncoderProfile
  }

  object EncodingParametersRequest {
    @inline
    def apply(
        CompressionFactor: __double,
        EncoderProfile: EncoderProfile
    ): EncodingParametersRequest = {
      val __obj = js.Dynamic.literal(
        "CompressionFactor" -> CompressionFactor.asInstanceOf[js.Any],
        "EncoderProfile" -> EncoderProfile.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[EncodingParametersRequest]
    }
  }

  /** Information about the encryption of the flow.
    */
  @js.native
  trait Encryption extends js.Object {
    var RoleArn: __string
    var Algorithm: js.UndefOr[Algorithm]
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
        RoleArn: __string,
        Algorithm: js.UndefOr[Algorithm] = js.undefined,
        ConstantInitializationVector: js.UndefOr[__string] = js.undefined,
        DeviceId: js.UndefOr[__string] = js.undefined,
        KeyType: js.UndefOr[KeyType] = js.undefined,
        Region: js.UndefOr[__string] = js.undefined,
        ResourceId: js.UndefOr[__string] = js.undefined,
        SecretArn: js.UndefOr[__string] = js.undefined,
        Url: js.UndefOr[__string] = js.undefined
    ): Encryption = {
      val __obj = js.Dynamic.literal(
        "RoleArn" -> RoleArn.asInstanceOf[js.Any]
      )

      Algorithm.foreach(__v => __obj.updateDynamic("Algorithm")(__v.asInstanceOf[js.Any]))
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

  /** The settings for a flow entitlement.
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

  /** The settings for source failover.
    */
  @js.native
  trait FailoverConfig extends js.Object {
    var FailoverMode: js.UndefOr[FailoverMode]
    var RecoveryWindow: js.UndefOr[__integer]
    var SourcePriority: js.UndefOr[SourcePriority]
    var State: js.UndefOr[State]
  }

  object FailoverConfig {
    @inline
    def apply(
        FailoverMode: js.UndefOr[FailoverMode] = js.undefined,
        RecoveryWindow: js.UndefOr[__integer] = js.undefined,
        SourcePriority: js.UndefOr[SourcePriority] = js.undefined,
        State: js.UndefOr[State] = js.undefined
    ): FailoverConfig = {
      val __obj = js.Dynamic.literal()
      FailoverMode.foreach(__v => __obj.updateDynamic("FailoverMode")(__v.asInstanceOf[js.Any]))
      RecoveryWindow.foreach(__v => __obj.updateDynamic("RecoveryWindow")(__v.asInstanceOf[js.Any]))
      SourcePriority.foreach(__v => __obj.updateDynamic("SourcePriority")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FailoverConfig]
    }
  }

  /** The settings for a flow, including its source, outputs, and entitlements.
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
    var MediaStreams: js.UndefOr[__listOfMediaStream]
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
        MediaStreams: js.UndefOr[__listOfMediaStream] = js.undefined,
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
      MediaStreams.foreach(__v => __obj.updateDynamic("MediaStreams")(__v.asInstanceOf[js.Any]))
      SourceFailoverConfig.foreach(__v => __obj.updateDynamic("SourceFailoverConfig")(__v.asInstanceOf[js.Any]))
      Sources.foreach(__v => __obj.updateDynamic("Sources")(__v.asInstanceOf[js.Any]))
      VpcInterfaces.foreach(__v => __obj.updateDynamic("VpcInterfaces")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Flow]
    }
  }

  /** FMTP
    */
  @js.native
  trait Fmtp extends js.Object {
    var ChannelOrder: js.UndefOr[__string]
    var Colorimetry: js.UndefOr[Colorimetry]
    var ExactFramerate: js.UndefOr[__string]
    var Par: js.UndefOr[__string]
    var Range: js.UndefOr[Range]
    var ScanMode: js.UndefOr[ScanMode]
    var Tcs: js.UndefOr[Tcs]
  }

  object Fmtp {
    @inline
    def apply(
        ChannelOrder: js.UndefOr[__string] = js.undefined,
        Colorimetry: js.UndefOr[Colorimetry] = js.undefined,
        ExactFramerate: js.UndefOr[__string] = js.undefined,
        Par: js.UndefOr[__string] = js.undefined,
        Range: js.UndefOr[Range] = js.undefined,
        ScanMode: js.UndefOr[ScanMode] = js.undefined,
        Tcs: js.UndefOr[Tcs] = js.undefined
    ): Fmtp = {
      val __obj = js.Dynamic.literal()
      ChannelOrder.foreach(__v => __obj.updateDynamic("ChannelOrder")(__v.asInstanceOf[js.Any]))
      Colorimetry.foreach(__v => __obj.updateDynamic("Colorimetry")(__v.asInstanceOf[js.Any]))
      ExactFramerate.foreach(__v => __obj.updateDynamic("ExactFramerate")(__v.asInstanceOf[js.Any]))
      Par.foreach(__v => __obj.updateDynamic("Par")(__v.asInstanceOf[js.Any]))
      Range.foreach(__v => __obj.updateDynamic("Range")(__v.asInstanceOf[js.Any]))
      ScanMode.foreach(__v => __obj.updateDynamic("ScanMode")(__v.asInstanceOf[js.Any]))
      Tcs.foreach(__v => __obj.updateDynamic("Tcs")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Fmtp]
    }
  }

  /** The settings that you want to use to define the media stream.
    */
  @js.native
  trait FmtpRequest extends js.Object {
    var ChannelOrder: js.UndefOr[__string]
    var Colorimetry: js.UndefOr[Colorimetry]
    var ExactFramerate: js.UndefOr[__string]
    var Par: js.UndefOr[__string]
    var Range: js.UndefOr[Range]
    var ScanMode: js.UndefOr[ScanMode]
    var Tcs: js.UndefOr[Tcs]
  }

  object FmtpRequest {
    @inline
    def apply(
        ChannelOrder: js.UndefOr[__string] = js.undefined,
        Colorimetry: js.UndefOr[Colorimetry] = js.undefined,
        ExactFramerate: js.UndefOr[__string] = js.undefined,
        Par: js.UndefOr[__string] = js.undefined,
        Range: js.UndefOr[Range] = js.undefined,
        ScanMode: js.UndefOr[ScanMode] = js.undefined,
        Tcs: js.UndefOr[Tcs] = js.undefined
    ): FmtpRequest = {
      val __obj = js.Dynamic.literal()
      ChannelOrder.foreach(__v => __obj.updateDynamic("ChannelOrder")(__v.asInstanceOf[js.Any]))
      Colorimetry.foreach(__v => __obj.updateDynamic("Colorimetry")(__v.asInstanceOf[js.Any]))
      ExactFramerate.foreach(__v => __obj.updateDynamic("ExactFramerate")(__v.asInstanceOf[js.Any]))
      Par.foreach(__v => __obj.updateDynamic("Par")(__v.asInstanceOf[js.Any]))
      Range.foreach(__v => __obj.updateDynamic("Range")(__v.asInstanceOf[js.Any]))
      ScanMode.foreach(__v => __obj.updateDynamic("ScanMode")(__v.asInstanceOf[js.Any]))
      Tcs.foreach(__v => __obj.updateDynamic("Tcs")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FmtpRequest]
    }
  }

  /** The entitlements that you want to grant on a flow.
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

  /** A request to grant entitlements on a flow.
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

  /** The transport parameters that are associated with an incoming media stream.
    */
  @js.native
  trait InputConfiguration extends js.Object {
    var InputIp: __string
    var InputPort: __integer
    var Interface: Interface
  }

  object InputConfiguration {
    @inline
    def apply(
        InputIp: __string,
        InputPort: __integer,
        Interface: Interface
    ): InputConfiguration = {
      val __obj = js.Dynamic.literal(
        "InputIp" -> InputIp.asInstanceOf[js.Any],
        "InputPort" -> InputPort.asInstanceOf[js.Any],
        "Interface" -> Interface.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[InputConfiguration]
    }
  }

  /** The transport parameters that you want to associate with an incoming media stream.
    */
  @js.native
  trait InputConfigurationRequest extends js.Object {
    var InputPort: __integer
    var Interface: InterfaceRequest
  }

  object InputConfigurationRequest {
    @inline
    def apply(
        InputPort: __integer,
        Interface: InterfaceRequest
    ): InputConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "InputPort" -> InputPort.asInstanceOf[js.Any],
        "Interface" -> Interface.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[InputConfigurationRequest]
    }
  }

  /** The VPC interface that is used for the media stream associated with the source or output.
    */
  @js.native
  trait Interface extends js.Object {
    var Name: __string
  }

  object Interface {
    @inline
    def apply(
        Name: __string
    ): Interface = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[Interface]
    }
  }

  /** The VPC interface that you want to designate where the media stream is coming from or going to.
    */
  @js.native
  trait InterfaceRequest extends js.Object {
    var Name: __string
  }

  object InterfaceRequest {
    @inline
    def apply(
        Name: __string
    ): InterfaceRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[InterfaceRequest]
    }
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
  trait ListOfferingsRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[__string]
  }

  object ListOfferingsRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): ListOfferingsRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListOfferingsRequest]
    }
  }

  @js.native
  trait ListOfferingsResponse extends js.Object {
    var NextToken: js.UndefOr[__string]
    var Offerings: js.UndefOr[__listOfOffering]
  }

  object ListOfferingsResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[__string] = js.undefined,
        Offerings: js.UndefOr[__listOfOffering] = js.undefined
    ): ListOfferingsResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Offerings.foreach(__v => __obj.updateDynamic("Offerings")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListOfferingsResponse]
    }
  }

  @js.native
  trait ListReservationsRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[__string]
  }

  object ListReservationsRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): ListReservationsRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListReservationsRequest]
    }
  }

  @js.native
  trait ListReservationsResponse extends js.Object {
    var NextToken: js.UndefOr[__string]
    var Reservations: js.UndefOr[__listOfReservation]
  }

  object ListReservationsResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[__string] = js.undefined,
        Reservations: js.UndefOr[__listOfReservation] = js.undefined
    ): ListReservationsResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Reservations.foreach(__v => __obj.updateDynamic("Reservations")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListReservationsResponse]
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

  /** An entitlement that has been granted to you from other AWS accounts.
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

  /** Provides a summary of a flow, including its ARN, Availability Zone, and source type.
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

  /** A single track or stream of media that contains video, audio, or ancillary data. After you add a media stream to a flow, you can associate it with sources and outputs on that flow, as long as they use the CDI protocol or the ST 2110 JPEG XS protocol. Each source or output can consist of one or many media streams.
    */
  @js.native
  trait MediaStream extends js.Object {
    var Fmt: __integer
    var MediaStreamId: __integer
    var MediaStreamName: __string
    var MediaStreamType: MediaStreamType
    var Attributes: js.UndefOr[MediaStreamAttributes]
    var ClockRate: js.UndefOr[__integer]
    var Description: js.UndefOr[__string]
    var VideoFormat: js.UndefOr[__string]
  }

  object MediaStream {
    @inline
    def apply(
        Fmt: __integer,
        MediaStreamId: __integer,
        MediaStreamName: __string,
        MediaStreamType: MediaStreamType,
        Attributes: js.UndefOr[MediaStreamAttributes] = js.undefined,
        ClockRate: js.UndefOr[__integer] = js.undefined,
        Description: js.UndefOr[__string] = js.undefined,
        VideoFormat: js.UndefOr[__string] = js.undefined
    ): MediaStream = {
      val __obj = js.Dynamic.literal(
        "Fmt" -> Fmt.asInstanceOf[js.Any],
        "MediaStreamId" -> MediaStreamId.asInstanceOf[js.Any],
        "MediaStreamName" -> MediaStreamName.asInstanceOf[js.Any],
        "MediaStreamType" -> MediaStreamType.asInstanceOf[js.Any]
      )

      Attributes.foreach(__v => __obj.updateDynamic("Attributes")(__v.asInstanceOf[js.Any]))
      ClockRate.foreach(__v => __obj.updateDynamic("ClockRate")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      VideoFormat.foreach(__v => __obj.updateDynamic("VideoFormat")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MediaStream]
    }
  }

  /** Attributes that are related to the media stream.
    */
  @js.native
  trait MediaStreamAttributes extends js.Object {
    var Fmtp: Fmtp
    var Lang: js.UndefOr[__string]
  }

  object MediaStreamAttributes {
    @inline
    def apply(
        Fmtp: Fmtp,
        Lang: js.UndefOr[__string] = js.undefined
    ): MediaStreamAttributes = {
      val __obj = js.Dynamic.literal(
        "Fmtp" -> Fmtp.asInstanceOf[js.Any]
      )

      Lang.foreach(__v => __obj.updateDynamic("Lang")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MediaStreamAttributes]
    }
  }

  /** Attributes that are related to the media stream.
    */
  @js.native
  trait MediaStreamAttributesRequest extends js.Object {
    var Fmtp: js.UndefOr[FmtpRequest]
    var Lang: js.UndefOr[__string]
  }

  object MediaStreamAttributesRequest {
    @inline
    def apply(
        Fmtp: js.UndefOr[FmtpRequest] = js.undefined,
        Lang: js.UndefOr[__string] = js.undefined
    ): MediaStreamAttributesRequest = {
      val __obj = js.Dynamic.literal()
      Fmtp.foreach(__v => __obj.updateDynamic("Fmtp")(__v.asInstanceOf[js.Any]))
      Lang.foreach(__v => __obj.updateDynamic("Lang")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MediaStreamAttributesRequest]
    }
  }

  /** The media stream that is associated with the output, and the parameters for that association.
    */
  @js.native
  trait MediaStreamOutputConfiguration extends js.Object {
    var EncodingName: EncodingName
    var MediaStreamName: __string
    var DestinationConfigurations: js.UndefOr[__listOfDestinationConfiguration]
    var EncodingParameters: js.UndefOr[EncodingParameters]
  }

  object MediaStreamOutputConfiguration {
    @inline
    def apply(
        EncodingName: EncodingName,
        MediaStreamName: __string,
        DestinationConfigurations: js.UndefOr[__listOfDestinationConfiguration] = js.undefined,
        EncodingParameters: js.UndefOr[EncodingParameters] = js.undefined
    ): MediaStreamOutputConfiguration = {
      val __obj = js.Dynamic.literal(
        "EncodingName" -> EncodingName.asInstanceOf[js.Any],
        "MediaStreamName" -> MediaStreamName.asInstanceOf[js.Any]
      )

      DestinationConfigurations.foreach(__v => __obj.updateDynamic("DestinationConfigurations")(__v.asInstanceOf[js.Any]))
      EncodingParameters.foreach(__v => __obj.updateDynamic("EncodingParameters")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MediaStreamOutputConfiguration]
    }
  }

  /** The media stream that you want to associate with the output, and the parameters for that association.
    */
  @js.native
  trait MediaStreamOutputConfigurationRequest extends js.Object {
    var EncodingName: EncodingName
    var MediaStreamName: __string
    var DestinationConfigurations: js.UndefOr[__listOfDestinationConfigurationRequest]
    var EncodingParameters: js.UndefOr[EncodingParametersRequest]
  }

  object MediaStreamOutputConfigurationRequest {
    @inline
    def apply(
        EncodingName: EncodingName,
        MediaStreamName: __string,
        DestinationConfigurations: js.UndefOr[__listOfDestinationConfigurationRequest] = js.undefined,
        EncodingParameters: js.UndefOr[EncodingParametersRequest] = js.undefined
    ): MediaStreamOutputConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "EncodingName" -> EncodingName.asInstanceOf[js.Any],
        "MediaStreamName" -> MediaStreamName.asInstanceOf[js.Any]
      )

      DestinationConfigurations.foreach(__v => __obj.updateDynamic("DestinationConfigurations")(__v.asInstanceOf[js.Any]))
      EncodingParameters.foreach(__v => __obj.updateDynamic("EncodingParameters")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MediaStreamOutputConfigurationRequest]
    }
  }

  /** The media stream that is associated with the source, and the parameters for that association.
    */
  @js.native
  trait MediaStreamSourceConfiguration extends js.Object {
    var EncodingName: EncodingName
    var MediaStreamName: __string
    var InputConfigurations: js.UndefOr[__listOfInputConfiguration]
  }

  object MediaStreamSourceConfiguration {
    @inline
    def apply(
        EncodingName: EncodingName,
        MediaStreamName: __string,
        InputConfigurations: js.UndefOr[__listOfInputConfiguration] = js.undefined
    ): MediaStreamSourceConfiguration = {
      val __obj = js.Dynamic.literal(
        "EncodingName" -> EncodingName.asInstanceOf[js.Any],
        "MediaStreamName" -> MediaStreamName.asInstanceOf[js.Any]
      )

      InputConfigurations.foreach(__v => __obj.updateDynamic("InputConfigurations")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MediaStreamSourceConfiguration]
    }
  }

  /** The definition of a media stream that you want to associate with the source.
    */
  @js.native
  trait MediaStreamSourceConfigurationRequest extends js.Object {
    var EncodingName: EncodingName
    var MediaStreamName: __string
    var InputConfigurations: js.UndefOr[__listOfInputConfigurationRequest]
  }

  object MediaStreamSourceConfigurationRequest {
    @inline
    def apply(
        EncodingName: EncodingName,
        MediaStreamName: __string,
        InputConfigurations: js.UndefOr[__listOfInputConfigurationRequest] = js.undefined
    ): MediaStreamSourceConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "EncodingName" -> EncodingName.asInstanceOf[js.Any],
        "MediaStreamName" -> MediaStreamName.asInstanceOf[js.Any]
      )

      InputConfigurations.foreach(__v => __obj.updateDynamic("InputConfigurations")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MediaStreamSourceConfigurationRequest]
    }
  }

  /** Messages that provide the state of the flow.
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

  /** A savings plan that reserves a certain amount of outbound bandwidth usage at a discounted rate each month over a period of time.
    */
  @js.native
  trait Offering extends js.Object {
    var CurrencyCode: __string
    var Duration: __integer
    var DurationUnits: DurationUnits
    var OfferingArn: __string
    var OfferingDescription: __string
    var PricePerUnit: __string
    var PriceUnits: PriceUnits
    var ResourceSpecification: ResourceSpecification
  }

  object Offering {
    @inline
    def apply(
        CurrencyCode: __string,
        Duration: __integer,
        DurationUnits: DurationUnits,
        OfferingArn: __string,
        OfferingDescription: __string,
        PricePerUnit: __string,
        PriceUnits: PriceUnits,
        ResourceSpecification: ResourceSpecification
    ): Offering = {
      val __obj = js.Dynamic.literal(
        "CurrencyCode" -> CurrencyCode.asInstanceOf[js.Any],
        "Duration" -> Duration.asInstanceOf[js.Any],
        "DurationUnits" -> DurationUnits.asInstanceOf[js.Any],
        "OfferingArn" -> OfferingArn.asInstanceOf[js.Any],
        "OfferingDescription" -> OfferingDescription.asInstanceOf[js.Any],
        "PricePerUnit" -> PricePerUnit.asInstanceOf[js.Any],
        "PriceUnits" -> PriceUnits.asInstanceOf[js.Any],
        "ResourceSpecification" -> ResourceSpecification.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[Offering]
    }
  }

  /** The settings for an output.
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
    var ListenerAddress: js.UndefOr[__string]
    var MediaLiveInputArn: js.UndefOr[__string]
    var MediaStreamOutputConfigurations: js.UndefOr[__listOfMediaStreamOutputConfiguration]
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
        ListenerAddress: js.UndefOr[__string] = js.undefined,
        MediaLiveInputArn: js.UndefOr[__string] = js.undefined,
        MediaStreamOutputConfigurations: js.UndefOr[__listOfMediaStreamOutputConfiguration] = js.undefined,
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
      ListenerAddress.foreach(__v => __obj.updateDynamic("ListenerAddress")(__v.asInstanceOf[js.Any]))
      MediaLiveInputArn.foreach(__v => __obj.updateDynamic("MediaLiveInputArn")(__v.asInstanceOf[js.Any]))
      MediaStreamOutputConfigurations.foreach(__v => __obj.updateDynamic("MediaStreamOutputConfigurations")(__v.asInstanceOf[js.Any]))
      Port.foreach(__v => __obj.updateDynamic("Port")(__v.asInstanceOf[js.Any]))
      Transport.foreach(__v => __obj.updateDynamic("Transport")(__v.asInstanceOf[js.Any]))
      VpcInterfaceAttachment.foreach(__v => __obj.updateDynamic("VpcInterfaceAttachment")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Output]
    }
  }

  /** A request to purchase a offering.
    */
  @js.native
  trait PurchaseOfferingRequest extends js.Object {
    var OfferingArn: __string
    var ReservationName: __string
    var Start: __string
  }

  object PurchaseOfferingRequest {
    @inline
    def apply(
        OfferingArn: __string,
        ReservationName: __string,
        Start: __string
    ): PurchaseOfferingRequest = {
      val __obj = js.Dynamic.literal(
        "OfferingArn" -> OfferingArn.asInstanceOf[js.Any],
        "ReservationName" -> ReservationName.asInstanceOf[js.Any],
        "Start" -> Start.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[PurchaseOfferingRequest]
    }
  }

  @js.native
  trait PurchaseOfferingResponse extends js.Object {
    var Reservation: js.UndefOr[Reservation]
  }

  object PurchaseOfferingResponse {
    @inline
    def apply(
        Reservation: js.UndefOr[Reservation] = js.undefined
    ): PurchaseOfferingResponse = {
      val __obj = js.Dynamic.literal()
      Reservation.foreach(__v => __obj.updateDynamic("Reservation")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PurchaseOfferingResponse]
    }
  }

  @js.native
  trait RemoveFlowMediaStreamRequest extends js.Object {
    var FlowArn: __string
    var MediaStreamName: __string
  }

  object RemoveFlowMediaStreamRequest {
    @inline
    def apply(
        FlowArn: __string,
        MediaStreamName: __string
    ): RemoveFlowMediaStreamRequest = {
      val __obj = js.Dynamic.literal(
        "FlowArn" -> FlowArn.asInstanceOf[js.Any],
        "MediaStreamName" -> MediaStreamName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[RemoveFlowMediaStreamRequest]
    }
  }

  @js.native
  trait RemoveFlowMediaStreamResponse extends js.Object {
    var FlowArn: js.UndefOr[__string]
    var MediaStreamName: js.UndefOr[__string]
  }

  object RemoveFlowMediaStreamResponse {
    @inline
    def apply(
        FlowArn: js.UndefOr[__string] = js.undefined,
        MediaStreamName: js.UndefOr[__string] = js.undefined
    ): RemoveFlowMediaStreamResponse = {
      val __obj = js.Dynamic.literal()
      FlowArn.foreach(__v => __obj.updateDynamic("FlowArn")(__v.asInstanceOf[js.Any]))
      MediaStreamName.foreach(__v => __obj.updateDynamic("MediaStreamName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RemoveFlowMediaStreamResponse]
    }
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

  /** A pricing agreement for a discounted rate for a specific outbound bandwidth that your MediaConnect account will use each month over a specific time period. The discounted rate in the reservation applies to outbound bandwidth for all flows from your account until your account reaches the amount of bandwidth in your reservation. If you use more outbound bandwidth than the agreed upon amount in a single month, the overage is charged at the on-demand rate.
    */
  @js.native
  trait Reservation extends js.Object {
    var CurrencyCode: __string
    var Duration: __integer
    var DurationUnits: DurationUnits
    var End: __string
    var OfferingArn: __string
    var OfferingDescription: __string
    var PricePerUnit: __string
    var PriceUnits: PriceUnits
    var ReservationArn: __string
    var ReservationName: __string
    var ReservationState: ReservationState
    var ResourceSpecification: ResourceSpecification
    var Start: __string
  }

  object Reservation {
    @inline
    def apply(
        CurrencyCode: __string,
        Duration: __integer,
        DurationUnits: DurationUnits,
        End: __string,
        OfferingArn: __string,
        OfferingDescription: __string,
        PricePerUnit: __string,
        PriceUnits: PriceUnits,
        ReservationArn: __string,
        ReservationName: __string,
        ReservationState: ReservationState,
        ResourceSpecification: ResourceSpecification,
        Start: __string
    ): Reservation = {
      val __obj = js.Dynamic.literal(
        "CurrencyCode" -> CurrencyCode.asInstanceOf[js.Any],
        "Duration" -> Duration.asInstanceOf[js.Any],
        "DurationUnits" -> DurationUnits.asInstanceOf[js.Any],
        "End" -> End.asInstanceOf[js.Any],
        "OfferingArn" -> OfferingArn.asInstanceOf[js.Any],
        "OfferingDescription" -> OfferingDescription.asInstanceOf[js.Any],
        "PricePerUnit" -> PricePerUnit.asInstanceOf[js.Any],
        "PriceUnits" -> PriceUnits.asInstanceOf[js.Any],
        "ReservationArn" -> ReservationArn.asInstanceOf[js.Any],
        "ReservationName" -> ReservationName.asInstanceOf[js.Any],
        "ReservationState" -> ReservationState.asInstanceOf[js.Any],
        "ResourceSpecification" -> ResourceSpecification.asInstanceOf[js.Any],
        "Start" -> Start.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[Reservation]
    }
  }

  /** A definition of what is being billed for, including the type and amount.
    */
  @js.native
  trait ResourceSpecification extends js.Object {
    var ResourceType: ResourceType
    var ReservedBitrate: js.UndefOr[__integer]
  }

  object ResourceSpecification {
    @inline
    def apply(
        ResourceType: ResourceType,
        ReservedBitrate: js.UndefOr[__integer] = js.undefined
    ): ResourceSpecification = {
      val __obj = js.Dynamic.literal(
        "ResourceType" -> ResourceType.asInstanceOf[js.Any]
      )

      ReservedBitrate.foreach(__v => __obj.updateDynamic("ReservedBitrate")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResourceSpecification]
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

  /** The settings for the source of the flow.
    */
  @js.native
  trait SetSourceRequest extends js.Object {
    var Decryption: js.UndefOr[Encryption]
    var Description: js.UndefOr[__string]
    var EntitlementArn: js.UndefOr[__string]
    var IngestPort: js.UndefOr[__integer]
    var MaxBitrate: js.UndefOr[__integer]
    var MaxLatency: js.UndefOr[__integer]
    var MaxSyncBuffer: js.UndefOr[__integer]
    var MediaStreamSourceConfigurations: js.UndefOr[__listOfMediaStreamSourceConfigurationRequest]
    var MinLatency: js.UndefOr[__integer]
    var Name: js.UndefOr[__string]
    var Protocol: js.UndefOr[Protocol]
    var SenderControlPort: js.UndefOr[__integer]
    var SenderIpAddress: js.UndefOr[__string]
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
        MaxSyncBuffer: js.UndefOr[__integer] = js.undefined,
        MediaStreamSourceConfigurations: js.UndefOr[__listOfMediaStreamSourceConfigurationRequest] = js.undefined,
        MinLatency: js.UndefOr[__integer] = js.undefined,
        Name: js.UndefOr[__string] = js.undefined,
        Protocol: js.UndefOr[Protocol] = js.undefined,
        SenderControlPort: js.UndefOr[__integer] = js.undefined,
        SenderIpAddress: js.UndefOr[__string] = js.undefined,
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
      MaxSyncBuffer.foreach(__v => __obj.updateDynamic("MaxSyncBuffer")(__v.asInstanceOf[js.Any]))
      MediaStreamSourceConfigurations.foreach(__v => __obj.updateDynamic("MediaStreamSourceConfigurations")(__v.asInstanceOf[js.Any]))
      MinLatency.foreach(__v => __obj.updateDynamic("MinLatency")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Protocol.foreach(__v => __obj.updateDynamic("Protocol")(__v.asInstanceOf[js.Any]))
      SenderControlPort.foreach(__v => __obj.updateDynamic("SenderControlPort")(__v.asInstanceOf[js.Any]))
      SenderIpAddress.foreach(__v => __obj.updateDynamic("SenderIpAddress")(__v.asInstanceOf[js.Any]))
      StreamId.foreach(__v => __obj.updateDynamic("StreamId")(__v.asInstanceOf[js.Any]))
      VpcInterfaceName.foreach(__v => __obj.updateDynamic("VpcInterfaceName")(__v.asInstanceOf[js.Any]))
      WhitelistCidr.foreach(__v => __obj.updateDynamic("WhitelistCidr")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SetSourceRequest]
    }
  }

  /** The settings for the source of the flow.
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
    var MediaStreamSourceConfigurations: js.UndefOr[__listOfMediaStreamSourceConfiguration]
    var SenderControlPort: js.UndefOr[__integer]
    var SenderIpAddress: js.UndefOr[__string]
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
        MediaStreamSourceConfigurations: js.UndefOr[__listOfMediaStreamSourceConfiguration] = js.undefined,
        SenderControlPort: js.UndefOr[__integer] = js.undefined,
        SenderIpAddress: js.UndefOr[__string] = js.undefined,
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
      MediaStreamSourceConfigurations.foreach(__v => __obj.updateDynamic("MediaStreamSourceConfigurations")(__v.asInstanceOf[js.Any]))
      SenderControlPort.foreach(__v => __obj.updateDynamic("SenderControlPort")(__v.asInstanceOf[js.Any]))
      SenderIpAddress.foreach(__v => __obj.updateDynamic("SenderIpAddress")(__v.asInstanceOf[js.Any]))
      Transport.foreach(__v => __obj.updateDynamic("Transport")(__v.asInstanceOf[js.Any]))
      VpcInterfaceName.foreach(__v => __obj.updateDynamic("VpcInterfaceName")(__v.asInstanceOf[js.Any]))
      WhitelistCidr.foreach(__v => __obj.updateDynamic("WhitelistCidr")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Source]
    }
  }

  /** The priority you want to assign to a source. You can have a primary stream and a backup stream or two equally prioritized streams.
    */
  @js.native
  trait SourcePriority extends js.Object {
    var PrimarySource: js.UndefOr[__string]
  }

  object SourcePriority {
    @inline
    def apply(
        PrimarySource: js.UndefOr[__string] = js.undefined
    ): SourcePriority = {
      val __obj = js.Dynamic.literal()
      PrimarySource.foreach(__v => __obj.updateDynamic("PrimarySource")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SourcePriority]
    }
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

  /** The tags to add to the resource. A tag is an array of key-value pairs. Tag keys can have a maximum character length of 128 characters, and tag values can have a maximum length of 256 characters.
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

  /** Attributes related to the transport stream that are used in a source or output.
    */
  @js.native
  trait Transport extends js.Object {
    var Protocol: Protocol
    var CidrAllowList: js.UndefOr[__listOf__string]
    var MaxBitrate: js.UndefOr[__integer]
    var MaxLatency: js.UndefOr[__integer]
    var MaxSyncBuffer: js.UndefOr[__integer]
    var MinLatency: js.UndefOr[__integer]
    var RemoteId: js.UndefOr[__string]
    var SenderControlPort: js.UndefOr[__integer]
    var SenderIpAddress: js.UndefOr[__string]
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
        MaxSyncBuffer: js.UndefOr[__integer] = js.undefined,
        MinLatency: js.UndefOr[__integer] = js.undefined,
        RemoteId: js.UndefOr[__string] = js.undefined,
        SenderControlPort: js.UndefOr[__integer] = js.undefined,
        SenderIpAddress: js.UndefOr[__string] = js.undefined,
        SmoothingLatency: js.UndefOr[__integer] = js.undefined,
        StreamId: js.UndefOr[__string] = js.undefined
    ): Transport = {
      val __obj = js.Dynamic.literal(
        "Protocol" -> Protocol.asInstanceOf[js.Any]
      )

      CidrAllowList.foreach(__v => __obj.updateDynamic("CidrAllowList")(__v.asInstanceOf[js.Any]))
      MaxBitrate.foreach(__v => __obj.updateDynamic("MaxBitrate")(__v.asInstanceOf[js.Any]))
      MaxLatency.foreach(__v => __obj.updateDynamic("MaxLatency")(__v.asInstanceOf[js.Any]))
      MaxSyncBuffer.foreach(__v => __obj.updateDynamic("MaxSyncBuffer")(__v.asInstanceOf[js.Any]))
      MinLatency.foreach(__v => __obj.updateDynamic("MinLatency")(__v.asInstanceOf[js.Any]))
      RemoteId.foreach(__v => __obj.updateDynamic("RemoteId")(__v.asInstanceOf[js.Any]))
      SenderControlPort.foreach(__v => __obj.updateDynamic("SenderControlPort")(__v.asInstanceOf[js.Any]))
      SenderIpAddress.foreach(__v => __obj.updateDynamic("SenderIpAddress")(__v.asInstanceOf[js.Any]))
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

  /** Information about the encryption of the flow.
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

  /** The settings for source failover.
    */
  @js.native
  trait UpdateFailoverConfig extends js.Object {
    var FailoverMode: js.UndefOr[FailoverMode]
    var RecoveryWindow: js.UndefOr[__integer]
    var SourcePriority: js.UndefOr[SourcePriority]
    var State: js.UndefOr[State]
  }

  object UpdateFailoverConfig {
    @inline
    def apply(
        FailoverMode: js.UndefOr[FailoverMode] = js.undefined,
        RecoveryWindow: js.UndefOr[__integer] = js.undefined,
        SourcePriority: js.UndefOr[SourcePriority] = js.undefined,
        State: js.UndefOr[State] = js.undefined
    ): UpdateFailoverConfig = {
      val __obj = js.Dynamic.literal()
      FailoverMode.foreach(__v => __obj.updateDynamic("FailoverMode")(__v.asInstanceOf[js.Any]))
      RecoveryWindow.foreach(__v => __obj.updateDynamic("RecoveryWindow")(__v.asInstanceOf[js.Any]))
      SourcePriority.foreach(__v => __obj.updateDynamic("SourcePriority")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateFailoverConfig]
    }
  }

  /** The entitlement fields that you want to update.
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

  /** The fields that you want to update in the media stream.
    */
  @js.native
  trait UpdateFlowMediaStreamRequest extends js.Object {
    var FlowArn: __string
    var MediaStreamName: __string
    var Attributes: js.UndefOr[MediaStreamAttributesRequest]
    var ClockRate: js.UndefOr[__integer]
    var Description: js.UndefOr[__string]
    var MediaStreamType: js.UndefOr[MediaStreamType]
    var VideoFormat: js.UndefOr[__string]
  }

  object UpdateFlowMediaStreamRequest {
    @inline
    def apply(
        FlowArn: __string,
        MediaStreamName: __string,
        Attributes: js.UndefOr[MediaStreamAttributesRequest] = js.undefined,
        ClockRate: js.UndefOr[__integer] = js.undefined,
        Description: js.UndefOr[__string] = js.undefined,
        MediaStreamType: js.UndefOr[MediaStreamType] = js.undefined,
        VideoFormat: js.UndefOr[__string] = js.undefined
    ): UpdateFlowMediaStreamRequest = {
      val __obj = js.Dynamic.literal(
        "FlowArn" -> FlowArn.asInstanceOf[js.Any],
        "MediaStreamName" -> MediaStreamName.asInstanceOf[js.Any]
      )

      Attributes.foreach(__v => __obj.updateDynamic("Attributes")(__v.asInstanceOf[js.Any]))
      ClockRate.foreach(__v => __obj.updateDynamic("ClockRate")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      MediaStreamType.foreach(__v => __obj.updateDynamic("MediaStreamType")(__v.asInstanceOf[js.Any]))
      VideoFormat.foreach(__v => __obj.updateDynamic("VideoFormat")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateFlowMediaStreamRequest]
    }
  }

  @js.native
  trait UpdateFlowMediaStreamResponse extends js.Object {
    var FlowArn: js.UndefOr[__string]
    var MediaStream: js.UndefOr[MediaStream]
  }

  object UpdateFlowMediaStreamResponse {
    @inline
    def apply(
        FlowArn: js.UndefOr[__string] = js.undefined,
        MediaStream: js.UndefOr[MediaStream] = js.undefined
    ): UpdateFlowMediaStreamResponse = {
      val __obj = js.Dynamic.literal()
      FlowArn.foreach(__v => __obj.updateDynamic("FlowArn")(__v.asInstanceOf[js.Any]))
      MediaStream.foreach(__v => __obj.updateDynamic("MediaStream")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateFlowMediaStreamResponse]
    }
  }

  /** The fields that you want to update in the output.
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
    var MediaStreamOutputConfigurations: js.UndefOr[__listOfMediaStreamOutputConfigurationRequest]
    var MinLatency: js.UndefOr[__integer]
    var Port: js.UndefOr[__integer]
    var Protocol: js.UndefOr[Protocol]
    var RemoteId: js.UndefOr[__string]
    var SenderControlPort: js.UndefOr[__integer]
    var SenderIpAddress: js.UndefOr[__string]
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
        MediaStreamOutputConfigurations: js.UndefOr[__listOfMediaStreamOutputConfigurationRequest] = js.undefined,
        MinLatency: js.UndefOr[__integer] = js.undefined,
        Port: js.UndefOr[__integer] = js.undefined,
        Protocol: js.UndefOr[Protocol] = js.undefined,
        RemoteId: js.UndefOr[__string] = js.undefined,
        SenderControlPort: js.UndefOr[__integer] = js.undefined,
        SenderIpAddress: js.UndefOr[__string] = js.undefined,
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
      MediaStreamOutputConfigurations.foreach(__v => __obj.updateDynamic("MediaStreamOutputConfigurations")(__v.asInstanceOf[js.Any]))
      MinLatency.foreach(__v => __obj.updateDynamic("MinLatency")(__v.asInstanceOf[js.Any]))
      Port.foreach(__v => __obj.updateDynamic("Port")(__v.asInstanceOf[js.Any]))
      Protocol.foreach(__v => __obj.updateDynamic("Protocol")(__v.asInstanceOf[js.Any]))
      RemoteId.foreach(__v => __obj.updateDynamic("RemoteId")(__v.asInstanceOf[js.Any]))
      SenderControlPort.foreach(__v => __obj.updateDynamic("SenderControlPort")(__v.asInstanceOf[js.Any]))
      SenderIpAddress.foreach(__v => __obj.updateDynamic("SenderIpAddress")(__v.asInstanceOf[js.Any]))
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

  /** A request to update flow.
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

  /** A request to update the source of a flow.
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
    var MaxSyncBuffer: js.UndefOr[__integer]
    var MediaStreamSourceConfigurations: js.UndefOr[__listOfMediaStreamSourceConfigurationRequest]
    var MinLatency: js.UndefOr[__integer]
    var Protocol: js.UndefOr[Protocol]
    var SenderControlPort: js.UndefOr[__integer]
    var SenderIpAddress: js.UndefOr[__string]
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
        MaxSyncBuffer: js.UndefOr[__integer] = js.undefined,
        MediaStreamSourceConfigurations: js.UndefOr[__listOfMediaStreamSourceConfigurationRequest] = js.undefined,
        MinLatency: js.UndefOr[__integer] = js.undefined,
        Protocol: js.UndefOr[Protocol] = js.undefined,
        SenderControlPort: js.UndefOr[__integer] = js.undefined,
        SenderIpAddress: js.UndefOr[__string] = js.undefined,
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
      MaxSyncBuffer.foreach(__v => __obj.updateDynamic("MaxSyncBuffer")(__v.asInstanceOf[js.Any]))
      MediaStreamSourceConfigurations.foreach(__v => __obj.updateDynamic("MediaStreamSourceConfigurations")(__v.asInstanceOf[js.Any]))
      MinLatency.foreach(__v => __obj.updateDynamic("MinLatency")(__v.asInstanceOf[js.Any]))
      Protocol.foreach(__v => __obj.updateDynamic("Protocol")(__v.asInstanceOf[js.Any]))
      SenderControlPort.foreach(__v => __obj.updateDynamic("SenderControlPort")(__v.asInstanceOf[js.Any]))
      SenderIpAddress.foreach(__v => __obj.updateDynamic("SenderIpAddress")(__v.asInstanceOf[js.Any]))
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

  /** The settings for a VPC Source.
    */
  @js.native
  trait VpcInterface extends js.Object {
    var Name: __string
    var NetworkInterfaceIds: __listOf__string
    var NetworkInterfaceType: NetworkInterfaceType
    var RoleArn: __string
    var SecurityGroupIds: __listOf__string
    var SubnetId: __string
  }

  object VpcInterface {
    @inline
    def apply(
        Name: __string,
        NetworkInterfaceIds: __listOf__string,
        NetworkInterfaceType: NetworkInterfaceType,
        RoleArn: __string,
        SecurityGroupIds: __listOf__string,
        SubnetId: __string
    ): VpcInterface = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "NetworkInterfaceIds" -> NetworkInterfaceIds.asInstanceOf[js.Any],
        "NetworkInterfaceType" -> NetworkInterfaceType.asInstanceOf[js.Any],
        "RoleArn" -> RoleArn.asInstanceOf[js.Any],
        "SecurityGroupIds" -> SecurityGroupIds.asInstanceOf[js.Any],
        "SubnetId" -> SubnetId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[VpcInterface]
    }
  }

  /** The settings for attaching a VPC interface to an output.
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

  /** Desired VPC Interface for a Flow
    */
  @js.native
  trait VpcInterfaceRequest extends js.Object {
    var Name: __string
    var RoleArn: __string
    var SecurityGroupIds: __listOf__string
    var SubnetId: __string
    var NetworkInterfaceType: js.UndefOr[NetworkInterfaceType]
  }

  object VpcInterfaceRequest {
    @inline
    def apply(
        Name: __string,
        RoleArn: __string,
        SecurityGroupIds: __listOf__string,
        SubnetId: __string,
        NetworkInterfaceType: js.UndefOr[NetworkInterfaceType] = js.undefined
    ): VpcInterfaceRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "RoleArn" -> RoleArn.asInstanceOf[js.Any],
        "SecurityGroupIds" -> SecurityGroupIds.asInstanceOf[js.Any],
        "SubnetId" -> SubnetId.asInstanceOf[js.Any]
      )

      NetworkInterfaceType.foreach(__v => __obj.updateDynamic("NetworkInterfaceType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VpcInterfaceRequest]
    }
  }
}
