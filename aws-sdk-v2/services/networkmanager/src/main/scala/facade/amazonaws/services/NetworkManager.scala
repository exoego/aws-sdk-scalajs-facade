package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import scala.language.implicitConversions
import facade.amazonaws._

package object networkmanager {
  type AWSAccountId = String
  type AccountId = String
  type AccountStatusList = js.Array[AccountStatus]
  type Action = String
  type AttachmentId = String
  type AttachmentList = js.Array[Attachment]
  type ClientToken = String
  type ConnectPeerAssociationList = js.Array[ConnectPeerAssociation]
  type ConnectPeerBgpConfigurationList = js.Array[ConnectPeerBgpConfiguration]
  type ConnectPeerId = String
  type ConnectPeerIdList = js.Array[ConnectPeerId]
  type ConnectPeerSummaryList = js.Array[ConnectPeerSummary]
  type ConnectionArn = String
  type ConnectionId = String
  type ConnectionIdList = js.Array[ConnectionId]
  type ConnectionList = js.Array[Connection]
  type ConstrainedString = String
  type ConstrainedStringList = js.Array[ConstrainedString]
  type CoreNetworkArn = String
  type CoreNetworkChangeEventList = js.Array[CoreNetworkChangeEvent]
  type CoreNetworkChangeList = js.Array[CoreNetworkChange]
  type CoreNetworkEdgeList = js.Array[CoreNetworkEdge]
  type CoreNetworkId = String
  type CoreNetworkPolicyDocument = String
  type CoreNetworkPolicyErrorList = js.Array[CoreNetworkPolicyError]
  type CoreNetworkPolicyVersionList = js.Array[CoreNetworkPolicyVersion]
  type CoreNetworkSegmentList = js.Array[CoreNetworkSegment]
  type CoreNetworkSummaryList = js.Array[CoreNetworkSummary]
  type CustomerGatewayArn = String
  type CustomerGatewayArnList = js.Array[CustomerGatewayArn]
  type CustomerGatewayAssociationList = js.Array[CustomerGatewayAssociation]
  type DateTime = js.Date
  type DeviceArn = String
  type DeviceId = String
  type DeviceIdList = js.Array[DeviceId]
  type DeviceList = js.Array[Device]
  type ExternalRegionCode = String
  type ExternalRegionCodeList = js.Array[ExternalRegionCode]
  type FilterMap = js.Dictionary[FilterValues]
  type FilterName = String
  type FilterValue = String
  type FilterValues = js.Array[FilterValue]
  type GlobalNetworkArn = String
  type GlobalNetworkId = String
  type GlobalNetworkIdList = js.Array[GlobalNetworkId]
  type GlobalNetworkList = js.Array[GlobalNetwork]
  type IPAddress = String
  type LinkArn = String
  type LinkAssociationList = js.Array[LinkAssociation]
  type LinkId = String
  type LinkIdList = js.Array[LinkId]
  type LinkList = js.Array[Link]
  type MaxResults = Int
  type NetworkResourceCountList = js.Array[NetworkResourceCount]
  type NetworkResourceList = js.Array[NetworkResource]
  type NetworkResourceMetadataMap = js.Dictionary[ConstrainedString]
  type NetworkRouteDestinationList = js.Array[NetworkRouteDestination]
  type NetworkRouteList = js.Array[NetworkRoute]
  type NetworkTelemetryList = js.Array[NetworkTelemetry]
  type NextToken = String
  type OrganizationAwsServiceAccessStatus = String
  type OrganizationId = String
  type PathComponentList = js.Array[PathComponent]
  type PeeringId = String
  type PeeringList = js.Array[Peering]
  type ReasonContextKey = String
  type ReasonContextMap = js.Dictionary[ReasonContextValue]
  type ReasonContextValue = String
  type RelationshipList = js.Array[Relationship]
  type ResourceArn = String
  type ResourcePolicyDocument = String
  type RouteStateList = js.Array[RouteState]
  type RouteTypeList = js.Array[RouteType]
  type SLRDeploymentStatus = String
  type ServerSideString = String
  type SiteArn = String
  type SiteId = String
  type SiteIdList = js.Array[SiteId]
  type SiteList = js.Array[Site]
  type SubnetArn = String
  type SubnetArnList = js.Array[SubnetArn]
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagList = js.Array[Tag]
  type TagValue = String
  type TransitGatewayArn = String
  type TransitGatewayArnList = js.Array[TransitGatewayArn]
  type TransitGatewayAttachmentArn = String
  type TransitGatewayAttachmentId = String
  type TransitGatewayConnectPeerArn = String
  type TransitGatewayConnectPeerArnList = js.Array[TransitGatewayConnectPeerArn]
  type TransitGatewayConnectPeerAssociationList = js.Array[TransitGatewayConnectPeerAssociation]
  type TransitGatewayPeeringAttachmentId = String
  type TransitGatewayRegistrationList = js.Array[TransitGatewayRegistration]
  type TransitGatewayRouteTableArn = String
  type VpcArn = String
  type VpnConnectionArn = String

  final class NetworkManagerOps(private val service: NetworkManager) extends AnyVal {

    @inline def acceptAttachmentFuture(params: AcceptAttachmentRequest): Future[AcceptAttachmentResponse] = service.acceptAttachment(params).promise().toFuture
    @inline def associateConnectPeerFuture(params: AssociateConnectPeerRequest): Future[AssociateConnectPeerResponse] = service.associateConnectPeer(params).promise().toFuture
    @inline def associateCustomerGatewayFuture(params: AssociateCustomerGatewayRequest): Future[AssociateCustomerGatewayResponse] = service.associateCustomerGateway(params).promise().toFuture
    @inline def associateLinkFuture(params: AssociateLinkRequest): Future[AssociateLinkResponse] = service.associateLink(params).promise().toFuture
    @inline def associateTransitGatewayConnectPeerFuture(params: AssociateTransitGatewayConnectPeerRequest): Future[AssociateTransitGatewayConnectPeerResponse] = service.associateTransitGatewayConnectPeer(params).promise().toFuture
    @inline def createConnectAttachmentFuture(params: CreateConnectAttachmentRequest): Future[CreateConnectAttachmentResponse] = service.createConnectAttachment(params).promise().toFuture
    @inline def createConnectPeerFuture(params: CreateConnectPeerRequest): Future[CreateConnectPeerResponse] = service.createConnectPeer(params).promise().toFuture
    @inline def createConnectionFuture(params: CreateConnectionRequest): Future[CreateConnectionResponse] = service.createConnection(params).promise().toFuture
    @inline def createCoreNetworkFuture(params: CreateCoreNetworkRequest): Future[CreateCoreNetworkResponse] = service.createCoreNetwork(params).promise().toFuture
    @inline def createDeviceFuture(params: CreateDeviceRequest): Future[CreateDeviceResponse] = service.createDevice(params).promise().toFuture
    @inline def createGlobalNetworkFuture(params: CreateGlobalNetworkRequest): Future[CreateGlobalNetworkResponse] = service.createGlobalNetwork(params).promise().toFuture
    @inline def createLinkFuture(params: CreateLinkRequest): Future[CreateLinkResponse] = service.createLink(params).promise().toFuture
    @inline def createSiteFuture(params: CreateSiteRequest): Future[CreateSiteResponse] = service.createSite(params).promise().toFuture
    @inline def createSiteToSiteVpnAttachmentFuture(params: CreateSiteToSiteVpnAttachmentRequest): Future[CreateSiteToSiteVpnAttachmentResponse] = service.createSiteToSiteVpnAttachment(params).promise().toFuture
    @inline def createTransitGatewayPeeringFuture(params: CreateTransitGatewayPeeringRequest): Future[CreateTransitGatewayPeeringResponse] = service.createTransitGatewayPeering(params).promise().toFuture
    @inline def createTransitGatewayRouteTableAttachmentFuture(params: CreateTransitGatewayRouteTableAttachmentRequest): Future[CreateTransitGatewayRouteTableAttachmentResponse] = service.createTransitGatewayRouteTableAttachment(params).promise().toFuture
    @inline def createVpcAttachmentFuture(params: CreateVpcAttachmentRequest): Future[CreateVpcAttachmentResponse] = service.createVpcAttachment(params).promise().toFuture
    @inline def deleteAttachmentFuture(params: DeleteAttachmentRequest): Future[DeleteAttachmentResponse] = service.deleteAttachment(params).promise().toFuture
    @inline def deleteConnectPeerFuture(params: DeleteConnectPeerRequest): Future[DeleteConnectPeerResponse] = service.deleteConnectPeer(params).promise().toFuture
    @inline def deleteConnectionFuture(params: DeleteConnectionRequest): Future[DeleteConnectionResponse] = service.deleteConnection(params).promise().toFuture
    @inline def deleteCoreNetworkFuture(params: DeleteCoreNetworkRequest): Future[DeleteCoreNetworkResponse] = service.deleteCoreNetwork(params).promise().toFuture
    @inline def deleteCoreNetworkPolicyVersionFuture(params: DeleteCoreNetworkPolicyVersionRequest): Future[DeleteCoreNetworkPolicyVersionResponse] = service.deleteCoreNetworkPolicyVersion(params).promise().toFuture
    @inline def deleteDeviceFuture(params: DeleteDeviceRequest): Future[DeleteDeviceResponse] = service.deleteDevice(params).promise().toFuture
    @inline def deleteGlobalNetworkFuture(params: DeleteGlobalNetworkRequest): Future[DeleteGlobalNetworkResponse] = service.deleteGlobalNetwork(params).promise().toFuture
    @inline def deleteLinkFuture(params: DeleteLinkRequest): Future[DeleteLinkResponse] = service.deleteLink(params).promise().toFuture
    @inline def deletePeeringFuture(params: DeletePeeringRequest): Future[DeletePeeringResponse] = service.deletePeering(params).promise().toFuture
    @inline def deleteResourcePolicyFuture(params: DeleteResourcePolicyRequest): Future[DeleteResourcePolicyResponse] = service.deleteResourcePolicy(params).promise().toFuture
    @inline def deleteSiteFuture(params: DeleteSiteRequest): Future[DeleteSiteResponse] = service.deleteSite(params).promise().toFuture
    @inline def deregisterTransitGatewayFuture(params: DeregisterTransitGatewayRequest): Future[DeregisterTransitGatewayResponse] = service.deregisterTransitGateway(params).promise().toFuture
    @inline def describeGlobalNetworksFuture(params: DescribeGlobalNetworksRequest): Future[DescribeGlobalNetworksResponse] = service.describeGlobalNetworks(params).promise().toFuture
    @inline def disassociateConnectPeerFuture(params: DisassociateConnectPeerRequest): Future[DisassociateConnectPeerResponse] = service.disassociateConnectPeer(params).promise().toFuture
    @inline def disassociateCustomerGatewayFuture(params: DisassociateCustomerGatewayRequest): Future[DisassociateCustomerGatewayResponse] = service.disassociateCustomerGateway(params).promise().toFuture
    @inline def disassociateLinkFuture(params: DisassociateLinkRequest): Future[DisassociateLinkResponse] = service.disassociateLink(params).promise().toFuture
    @inline def disassociateTransitGatewayConnectPeerFuture(params: DisassociateTransitGatewayConnectPeerRequest): Future[DisassociateTransitGatewayConnectPeerResponse] = service.disassociateTransitGatewayConnectPeer(params).promise().toFuture
    @inline def executeCoreNetworkChangeSetFuture(params: ExecuteCoreNetworkChangeSetRequest): Future[ExecuteCoreNetworkChangeSetResponse] = service.executeCoreNetworkChangeSet(params).promise().toFuture
    @inline def getConnectAttachmentFuture(params: GetConnectAttachmentRequest): Future[GetConnectAttachmentResponse] = service.getConnectAttachment(params).promise().toFuture
    @inline def getConnectPeerAssociationsFuture(params: GetConnectPeerAssociationsRequest): Future[GetConnectPeerAssociationsResponse] = service.getConnectPeerAssociations(params).promise().toFuture
    @inline def getConnectPeerFuture(params: GetConnectPeerRequest): Future[GetConnectPeerResponse] = service.getConnectPeer(params).promise().toFuture
    @inline def getConnectionsFuture(params: GetConnectionsRequest): Future[GetConnectionsResponse] = service.getConnections(params).promise().toFuture
    @inline def getCoreNetworkChangeEventsFuture(params: GetCoreNetworkChangeEventsRequest): Future[GetCoreNetworkChangeEventsResponse] = service.getCoreNetworkChangeEvents(params).promise().toFuture
    @inline def getCoreNetworkChangeSetFuture(params: GetCoreNetworkChangeSetRequest): Future[GetCoreNetworkChangeSetResponse] = service.getCoreNetworkChangeSet(params).promise().toFuture
    @inline def getCoreNetworkFuture(params: GetCoreNetworkRequest): Future[GetCoreNetworkResponse] = service.getCoreNetwork(params).promise().toFuture
    @inline def getCoreNetworkPolicyFuture(params: GetCoreNetworkPolicyRequest): Future[GetCoreNetworkPolicyResponse] = service.getCoreNetworkPolicy(params).promise().toFuture
    @inline def getCustomerGatewayAssociationsFuture(params: GetCustomerGatewayAssociationsRequest): Future[GetCustomerGatewayAssociationsResponse] = service.getCustomerGatewayAssociations(params).promise().toFuture
    @inline def getDevicesFuture(params: GetDevicesRequest): Future[GetDevicesResponse] = service.getDevices(params).promise().toFuture
    @inline def getLinkAssociationsFuture(params: GetLinkAssociationsRequest): Future[GetLinkAssociationsResponse] = service.getLinkAssociations(params).promise().toFuture
    @inline def getLinksFuture(params: GetLinksRequest): Future[GetLinksResponse] = service.getLinks(params).promise().toFuture
    @inline def getNetworkResourceCountsFuture(params: GetNetworkResourceCountsRequest): Future[GetNetworkResourceCountsResponse] = service.getNetworkResourceCounts(params).promise().toFuture
    @inline def getNetworkResourceRelationshipsFuture(params: GetNetworkResourceRelationshipsRequest): Future[GetNetworkResourceRelationshipsResponse] = service.getNetworkResourceRelationships(params).promise().toFuture
    @inline def getNetworkResourcesFuture(params: GetNetworkResourcesRequest): Future[GetNetworkResourcesResponse] = service.getNetworkResources(params).promise().toFuture
    @inline def getNetworkRoutesFuture(params: GetNetworkRoutesRequest): Future[GetNetworkRoutesResponse] = service.getNetworkRoutes(params).promise().toFuture
    @inline def getNetworkTelemetryFuture(params: GetNetworkTelemetryRequest): Future[GetNetworkTelemetryResponse] = service.getNetworkTelemetry(params).promise().toFuture
    @inline def getResourcePolicyFuture(params: GetResourcePolicyRequest): Future[GetResourcePolicyResponse] = service.getResourcePolicy(params).promise().toFuture
    @inline def getRouteAnalysisFuture(params: GetRouteAnalysisRequest): Future[GetRouteAnalysisResponse] = service.getRouteAnalysis(params).promise().toFuture
    @inline def getSiteToSiteVpnAttachmentFuture(params: GetSiteToSiteVpnAttachmentRequest): Future[GetSiteToSiteVpnAttachmentResponse] = service.getSiteToSiteVpnAttachment(params).promise().toFuture
    @inline def getSitesFuture(params: GetSitesRequest): Future[GetSitesResponse] = service.getSites(params).promise().toFuture
    @inline def getTransitGatewayConnectPeerAssociationsFuture(params: GetTransitGatewayConnectPeerAssociationsRequest): Future[GetTransitGatewayConnectPeerAssociationsResponse] = service.getTransitGatewayConnectPeerAssociations(params).promise().toFuture
    @inline def getTransitGatewayPeeringFuture(params: GetTransitGatewayPeeringRequest): Future[GetTransitGatewayPeeringResponse] = service.getTransitGatewayPeering(params).promise().toFuture
    @inline def getTransitGatewayRegistrationsFuture(params: GetTransitGatewayRegistrationsRequest): Future[GetTransitGatewayRegistrationsResponse] = service.getTransitGatewayRegistrations(params).promise().toFuture
    @inline def getTransitGatewayRouteTableAttachmentFuture(params: GetTransitGatewayRouteTableAttachmentRequest): Future[GetTransitGatewayRouteTableAttachmentResponse] = service.getTransitGatewayRouteTableAttachment(params).promise().toFuture
    @inline def getVpcAttachmentFuture(params: GetVpcAttachmentRequest): Future[GetVpcAttachmentResponse] = service.getVpcAttachment(params).promise().toFuture
    @inline def listAttachmentsFuture(params: ListAttachmentsRequest): Future[ListAttachmentsResponse] = service.listAttachments(params).promise().toFuture
    @inline def listConnectPeersFuture(params: ListConnectPeersRequest): Future[ListConnectPeersResponse] = service.listConnectPeers(params).promise().toFuture
    @inline def listCoreNetworkPolicyVersionsFuture(params: ListCoreNetworkPolicyVersionsRequest): Future[ListCoreNetworkPolicyVersionsResponse] = service.listCoreNetworkPolicyVersions(params).promise().toFuture
    @inline def listCoreNetworksFuture(params: ListCoreNetworksRequest): Future[ListCoreNetworksResponse] = service.listCoreNetworks(params).promise().toFuture
    @inline def listOrganizationServiceAccessStatusFuture(params: ListOrganizationServiceAccessStatusRequest): Future[ListOrganizationServiceAccessStatusResponse] = service.listOrganizationServiceAccessStatus(params).promise().toFuture
    @inline def listPeeringsFuture(params: ListPeeringsRequest): Future[ListPeeringsResponse] = service.listPeerings(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] = service.listTagsForResource(params).promise().toFuture
    @inline def putCoreNetworkPolicyFuture(params: PutCoreNetworkPolicyRequest): Future[PutCoreNetworkPolicyResponse] = service.putCoreNetworkPolicy(params).promise().toFuture
    @inline def putResourcePolicyFuture(params: PutResourcePolicyRequest): Future[PutResourcePolicyResponse] = service.putResourcePolicy(params).promise().toFuture
    @inline def registerTransitGatewayFuture(params: RegisterTransitGatewayRequest): Future[RegisterTransitGatewayResponse] = service.registerTransitGateway(params).promise().toFuture
    @inline def rejectAttachmentFuture(params: RejectAttachmentRequest): Future[RejectAttachmentResponse] = service.rejectAttachment(params).promise().toFuture
    @inline def restoreCoreNetworkPolicyVersionFuture(params: RestoreCoreNetworkPolicyVersionRequest): Future[RestoreCoreNetworkPolicyVersionResponse] = service.restoreCoreNetworkPolicyVersion(params).promise().toFuture
    @inline def startOrganizationServiceAccessUpdateFuture(params: StartOrganizationServiceAccessUpdateRequest): Future[StartOrganizationServiceAccessUpdateResponse] = service.startOrganizationServiceAccessUpdate(params).promise().toFuture
    @inline def startRouteAnalysisFuture(params: StartRouteAnalysisRequest): Future[StartRouteAnalysisResponse] = service.startRouteAnalysis(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] = service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] = service.untagResource(params).promise().toFuture
    @inline def updateConnectionFuture(params: UpdateConnectionRequest): Future[UpdateConnectionResponse] = service.updateConnection(params).promise().toFuture
    @inline def updateCoreNetworkFuture(params: UpdateCoreNetworkRequest): Future[UpdateCoreNetworkResponse] = service.updateCoreNetwork(params).promise().toFuture
    @inline def updateDeviceFuture(params: UpdateDeviceRequest): Future[UpdateDeviceResponse] = service.updateDevice(params).promise().toFuture
    @inline def updateGlobalNetworkFuture(params: UpdateGlobalNetworkRequest): Future[UpdateGlobalNetworkResponse] = service.updateGlobalNetwork(params).promise().toFuture
    @inline def updateLinkFuture(params: UpdateLinkRequest): Future[UpdateLinkResponse] = service.updateLink(params).promise().toFuture
    @inline def updateNetworkResourceMetadataFuture(params: UpdateNetworkResourceMetadataRequest): Future[UpdateNetworkResourceMetadataResponse] = service.updateNetworkResourceMetadata(params).promise().toFuture
    @inline def updateSiteFuture(params: UpdateSiteRequest): Future[UpdateSiteResponse] = service.updateSite(params).promise().toFuture
    @inline def updateVpcAttachmentFuture(params: UpdateVpcAttachmentRequest): Future[UpdateVpcAttachmentResponse] = service.updateVpcAttachment(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/networkmanager", JSImport.Namespace, "AWS.NetworkManager")
  class NetworkManager() extends js.Object {
    def this(config: AWSConfig) = this()

    def acceptAttachment(params: AcceptAttachmentRequest): Request[AcceptAttachmentResponse] = js.native
    def associateConnectPeer(params: AssociateConnectPeerRequest): Request[AssociateConnectPeerResponse] = js.native
    def associateCustomerGateway(params: AssociateCustomerGatewayRequest): Request[AssociateCustomerGatewayResponse] = js.native
    def associateLink(params: AssociateLinkRequest): Request[AssociateLinkResponse] = js.native
    def associateTransitGatewayConnectPeer(params: AssociateTransitGatewayConnectPeerRequest): Request[AssociateTransitGatewayConnectPeerResponse] = js.native
    def createConnectAttachment(params: CreateConnectAttachmentRequest): Request[CreateConnectAttachmentResponse] = js.native
    def createConnectPeer(params: CreateConnectPeerRequest): Request[CreateConnectPeerResponse] = js.native
    def createConnection(params: CreateConnectionRequest): Request[CreateConnectionResponse] = js.native
    def createCoreNetwork(params: CreateCoreNetworkRequest): Request[CreateCoreNetworkResponse] = js.native
    def createDevice(params: CreateDeviceRequest): Request[CreateDeviceResponse] = js.native
    def createGlobalNetwork(params: CreateGlobalNetworkRequest): Request[CreateGlobalNetworkResponse] = js.native
    def createLink(params: CreateLinkRequest): Request[CreateLinkResponse] = js.native
    def createSite(params: CreateSiteRequest): Request[CreateSiteResponse] = js.native
    def createSiteToSiteVpnAttachment(params: CreateSiteToSiteVpnAttachmentRequest): Request[CreateSiteToSiteVpnAttachmentResponse] = js.native
    def createTransitGatewayPeering(params: CreateTransitGatewayPeeringRequest): Request[CreateTransitGatewayPeeringResponse] = js.native
    def createTransitGatewayRouteTableAttachment(params: CreateTransitGatewayRouteTableAttachmentRequest): Request[CreateTransitGatewayRouteTableAttachmentResponse] = js.native
    def createVpcAttachment(params: CreateVpcAttachmentRequest): Request[CreateVpcAttachmentResponse] = js.native
    def deleteAttachment(params: DeleteAttachmentRequest): Request[DeleteAttachmentResponse] = js.native
    def deleteConnectPeer(params: DeleteConnectPeerRequest): Request[DeleteConnectPeerResponse] = js.native
    def deleteConnection(params: DeleteConnectionRequest): Request[DeleteConnectionResponse] = js.native
    def deleteCoreNetwork(params: DeleteCoreNetworkRequest): Request[DeleteCoreNetworkResponse] = js.native
    def deleteCoreNetworkPolicyVersion(params: DeleteCoreNetworkPolicyVersionRequest): Request[DeleteCoreNetworkPolicyVersionResponse] = js.native
    def deleteDevice(params: DeleteDeviceRequest): Request[DeleteDeviceResponse] = js.native
    def deleteGlobalNetwork(params: DeleteGlobalNetworkRequest): Request[DeleteGlobalNetworkResponse] = js.native
    def deleteLink(params: DeleteLinkRequest): Request[DeleteLinkResponse] = js.native
    def deletePeering(params: DeletePeeringRequest): Request[DeletePeeringResponse] = js.native
    def deleteResourcePolicy(params: DeleteResourcePolicyRequest): Request[DeleteResourcePolicyResponse] = js.native
    def deleteSite(params: DeleteSiteRequest): Request[DeleteSiteResponse] = js.native
    def deregisterTransitGateway(params: DeregisterTransitGatewayRequest): Request[DeregisterTransitGatewayResponse] = js.native
    def describeGlobalNetworks(params: DescribeGlobalNetworksRequest): Request[DescribeGlobalNetworksResponse] = js.native
    def disassociateConnectPeer(params: DisassociateConnectPeerRequest): Request[DisassociateConnectPeerResponse] = js.native
    def disassociateCustomerGateway(params: DisassociateCustomerGatewayRequest): Request[DisassociateCustomerGatewayResponse] = js.native
    def disassociateLink(params: DisassociateLinkRequest): Request[DisassociateLinkResponse] = js.native
    def disassociateTransitGatewayConnectPeer(params: DisassociateTransitGatewayConnectPeerRequest): Request[DisassociateTransitGatewayConnectPeerResponse] = js.native
    def executeCoreNetworkChangeSet(params: ExecuteCoreNetworkChangeSetRequest): Request[ExecuteCoreNetworkChangeSetResponse] = js.native
    def getConnectAttachment(params: GetConnectAttachmentRequest): Request[GetConnectAttachmentResponse] = js.native
    def getConnectPeer(params: GetConnectPeerRequest): Request[GetConnectPeerResponse] = js.native
    def getConnectPeerAssociations(params: GetConnectPeerAssociationsRequest): Request[GetConnectPeerAssociationsResponse] = js.native
    def getConnections(params: GetConnectionsRequest): Request[GetConnectionsResponse] = js.native
    def getCoreNetwork(params: GetCoreNetworkRequest): Request[GetCoreNetworkResponse] = js.native
    def getCoreNetworkChangeEvents(params: GetCoreNetworkChangeEventsRequest): Request[GetCoreNetworkChangeEventsResponse] = js.native
    def getCoreNetworkChangeSet(params: GetCoreNetworkChangeSetRequest): Request[GetCoreNetworkChangeSetResponse] = js.native
    def getCoreNetworkPolicy(params: GetCoreNetworkPolicyRequest): Request[GetCoreNetworkPolicyResponse] = js.native
    def getCustomerGatewayAssociations(params: GetCustomerGatewayAssociationsRequest): Request[GetCustomerGatewayAssociationsResponse] = js.native
    def getDevices(params: GetDevicesRequest): Request[GetDevicesResponse] = js.native
    def getLinkAssociations(params: GetLinkAssociationsRequest): Request[GetLinkAssociationsResponse] = js.native
    def getLinks(params: GetLinksRequest): Request[GetLinksResponse] = js.native
    def getNetworkResourceCounts(params: GetNetworkResourceCountsRequest): Request[GetNetworkResourceCountsResponse] = js.native
    def getNetworkResourceRelationships(params: GetNetworkResourceRelationshipsRequest): Request[GetNetworkResourceRelationshipsResponse] = js.native
    def getNetworkResources(params: GetNetworkResourcesRequest): Request[GetNetworkResourcesResponse] = js.native
    def getNetworkRoutes(params: GetNetworkRoutesRequest): Request[GetNetworkRoutesResponse] = js.native
    def getNetworkTelemetry(params: GetNetworkTelemetryRequest): Request[GetNetworkTelemetryResponse] = js.native
    def getResourcePolicy(params: GetResourcePolicyRequest): Request[GetResourcePolicyResponse] = js.native
    def getRouteAnalysis(params: GetRouteAnalysisRequest): Request[GetRouteAnalysisResponse] = js.native
    def getSiteToSiteVpnAttachment(params: GetSiteToSiteVpnAttachmentRequest): Request[GetSiteToSiteVpnAttachmentResponse] = js.native
    def getSites(params: GetSitesRequest): Request[GetSitesResponse] = js.native
    def getTransitGatewayConnectPeerAssociations(params: GetTransitGatewayConnectPeerAssociationsRequest): Request[GetTransitGatewayConnectPeerAssociationsResponse] = js.native
    def getTransitGatewayPeering(params: GetTransitGatewayPeeringRequest): Request[GetTransitGatewayPeeringResponse] = js.native
    def getTransitGatewayRegistrations(params: GetTransitGatewayRegistrationsRequest): Request[GetTransitGatewayRegistrationsResponse] = js.native
    def getTransitGatewayRouteTableAttachment(params: GetTransitGatewayRouteTableAttachmentRequest): Request[GetTransitGatewayRouteTableAttachmentResponse] = js.native
    def getVpcAttachment(params: GetVpcAttachmentRequest): Request[GetVpcAttachmentResponse] = js.native
    def listAttachments(params: ListAttachmentsRequest): Request[ListAttachmentsResponse] = js.native
    def listConnectPeers(params: ListConnectPeersRequest): Request[ListConnectPeersResponse] = js.native
    def listCoreNetworkPolicyVersions(params: ListCoreNetworkPolicyVersionsRequest): Request[ListCoreNetworkPolicyVersionsResponse] = js.native
    def listCoreNetworks(params: ListCoreNetworksRequest): Request[ListCoreNetworksResponse] = js.native
    def listOrganizationServiceAccessStatus(params: ListOrganizationServiceAccessStatusRequest): Request[ListOrganizationServiceAccessStatusResponse] = js.native
    def listPeerings(params: ListPeeringsRequest): Request[ListPeeringsResponse] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def putCoreNetworkPolicy(params: PutCoreNetworkPolicyRequest): Request[PutCoreNetworkPolicyResponse] = js.native
    def putResourcePolicy(params: PutResourcePolicyRequest): Request[PutResourcePolicyResponse] = js.native
    def registerTransitGateway(params: RegisterTransitGatewayRequest): Request[RegisterTransitGatewayResponse] = js.native
    def rejectAttachment(params: RejectAttachmentRequest): Request[RejectAttachmentResponse] = js.native
    def restoreCoreNetworkPolicyVersion(params: RestoreCoreNetworkPolicyVersionRequest): Request[RestoreCoreNetworkPolicyVersionResponse] = js.native
    def startOrganizationServiceAccessUpdate(params: StartOrganizationServiceAccessUpdateRequest): Request[StartOrganizationServiceAccessUpdateResponse] = js.native
    def startRouteAnalysis(params: StartRouteAnalysisRequest): Request[StartRouteAnalysisResponse] = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse] = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse] = js.native
    def updateConnection(params: UpdateConnectionRequest): Request[UpdateConnectionResponse] = js.native
    def updateCoreNetwork(params: UpdateCoreNetworkRequest): Request[UpdateCoreNetworkResponse] = js.native
    def updateDevice(params: UpdateDeviceRequest): Request[UpdateDeviceResponse] = js.native
    def updateGlobalNetwork(params: UpdateGlobalNetworkRequest): Request[UpdateGlobalNetworkResponse] = js.native
    def updateLink(params: UpdateLinkRequest): Request[UpdateLinkResponse] = js.native
    def updateNetworkResourceMetadata(params: UpdateNetworkResourceMetadataRequest): Request[UpdateNetworkResourceMetadataResponse] = js.native
    def updateSite(params: UpdateSiteRequest): Request[UpdateSiteResponse] = js.native
    def updateVpcAttachment(params: UpdateVpcAttachmentRequest): Request[UpdateVpcAttachmentResponse] = js.native
  }
  object NetworkManager {
    @inline implicit def toOps(service: NetworkManager): NetworkManagerOps = {
      new NetworkManagerOps(service)
    }
  }

  /** Specifies a location in Amazon Web Services.
    */
  @js.native
  trait AWSLocation extends js.Object {
    var SubnetArn: js.UndefOr[SubnetArn]
    var Zone: js.UndefOr[ConstrainedString]
  }

  object AWSLocation {
    @inline
    def apply(
        SubnetArn: js.UndefOr[SubnetArn] = js.undefined,
        Zone: js.UndefOr[ConstrainedString] = js.undefined
    ): AWSLocation = {
      val __obj = js.Dynamic.literal()
      SubnetArn.foreach(__v => __obj.updateDynamic("SubnetArn")(__v.asInstanceOf[js.Any]))
      Zone.foreach(__v => __obj.updateDynamic("Zone")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AWSLocation]
    }
  }

  @js.native
  trait AcceptAttachmentRequest extends js.Object {
    var AttachmentId: AttachmentId
  }

  object AcceptAttachmentRequest {
    @inline
    def apply(
        AttachmentId: AttachmentId
    ): AcceptAttachmentRequest = {
      val __obj = js.Dynamic.literal(
        "AttachmentId" -> AttachmentId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AcceptAttachmentRequest]
    }
  }

  @js.native
  trait AcceptAttachmentResponse extends js.Object {
    var Attachment: js.UndefOr[Attachment]
  }

  object AcceptAttachmentResponse {
    @inline
    def apply(
        Attachment: js.UndefOr[Attachment] = js.undefined
    ): AcceptAttachmentResponse = {
      val __obj = js.Dynamic.literal()
      Attachment.foreach(__v => __obj.updateDynamic("Attachment")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AcceptAttachmentResponse]
    }
  }

  /** Describes the current status of an account within an Amazon Web Services Organization, including service-linked roles (SLRs).
    */
  @js.native
  trait AccountStatus extends js.Object {
    var AccountId: js.UndefOr[AccountId]
    var SLRDeploymentStatus: js.UndefOr[SLRDeploymentStatus]
  }

  object AccountStatus {
    @inline
    def apply(
        AccountId: js.UndefOr[AccountId] = js.undefined,
        SLRDeploymentStatus: js.UndefOr[SLRDeploymentStatus] = js.undefined
    ): AccountStatus = {
      val __obj = js.Dynamic.literal()
      AccountId.foreach(__v => __obj.updateDynamic("AccountId")(__v.asInstanceOf[js.Any]))
      SLRDeploymentStatus.foreach(__v => __obj.updateDynamic("SLRDeploymentStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AccountStatus]
    }
  }

  @js.native
  trait AssociateConnectPeerRequest extends js.Object {
    var ConnectPeerId: ConnectPeerId
    var DeviceId: DeviceId
    var GlobalNetworkId: GlobalNetworkId
    var LinkId: js.UndefOr[LinkId]
  }

  object AssociateConnectPeerRequest {
    @inline
    def apply(
        ConnectPeerId: ConnectPeerId,
        DeviceId: DeviceId,
        GlobalNetworkId: GlobalNetworkId,
        LinkId: js.UndefOr[LinkId] = js.undefined
    ): AssociateConnectPeerRequest = {
      val __obj = js.Dynamic.literal(
        "ConnectPeerId" -> ConnectPeerId.asInstanceOf[js.Any],
        "DeviceId" -> DeviceId.asInstanceOf[js.Any],
        "GlobalNetworkId" -> GlobalNetworkId.asInstanceOf[js.Any]
      )

      LinkId.foreach(__v => __obj.updateDynamic("LinkId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssociateConnectPeerRequest]
    }
  }

  @js.native
  trait AssociateConnectPeerResponse extends js.Object {
    var ConnectPeerAssociation: js.UndefOr[ConnectPeerAssociation]
  }

  object AssociateConnectPeerResponse {
    @inline
    def apply(
        ConnectPeerAssociation: js.UndefOr[ConnectPeerAssociation] = js.undefined
    ): AssociateConnectPeerResponse = {
      val __obj = js.Dynamic.literal()
      ConnectPeerAssociation.foreach(__v => __obj.updateDynamic("ConnectPeerAssociation")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssociateConnectPeerResponse]
    }
  }

  @js.native
  trait AssociateCustomerGatewayRequest extends js.Object {
    var CustomerGatewayArn: CustomerGatewayArn
    var DeviceId: DeviceId
    var GlobalNetworkId: GlobalNetworkId
    var LinkId: js.UndefOr[LinkId]
  }

  object AssociateCustomerGatewayRequest {
    @inline
    def apply(
        CustomerGatewayArn: CustomerGatewayArn,
        DeviceId: DeviceId,
        GlobalNetworkId: GlobalNetworkId,
        LinkId: js.UndefOr[LinkId] = js.undefined
    ): AssociateCustomerGatewayRequest = {
      val __obj = js.Dynamic.literal(
        "CustomerGatewayArn" -> CustomerGatewayArn.asInstanceOf[js.Any],
        "DeviceId" -> DeviceId.asInstanceOf[js.Any],
        "GlobalNetworkId" -> GlobalNetworkId.asInstanceOf[js.Any]
      )

      LinkId.foreach(__v => __obj.updateDynamic("LinkId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssociateCustomerGatewayRequest]
    }
  }

  @js.native
  trait AssociateCustomerGatewayResponse extends js.Object {
    var CustomerGatewayAssociation: js.UndefOr[CustomerGatewayAssociation]
  }

  object AssociateCustomerGatewayResponse {
    @inline
    def apply(
        CustomerGatewayAssociation: js.UndefOr[CustomerGatewayAssociation] = js.undefined
    ): AssociateCustomerGatewayResponse = {
      val __obj = js.Dynamic.literal()
      CustomerGatewayAssociation.foreach(__v => __obj.updateDynamic("CustomerGatewayAssociation")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssociateCustomerGatewayResponse]
    }
  }

  @js.native
  trait AssociateLinkRequest extends js.Object {
    var DeviceId: DeviceId
    var GlobalNetworkId: GlobalNetworkId
    var LinkId: LinkId
  }

  object AssociateLinkRequest {
    @inline
    def apply(
        DeviceId: DeviceId,
        GlobalNetworkId: GlobalNetworkId,
        LinkId: LinkId
    ): AssociateLinkRequest = {
      val __obj = js.Dynamic.literal(
        "DeviceId" -> DeviceId.asInstanceOf[js.Any],
        "GlobalNetworkId" -> GlobalNetworkId.asInstanceOf[js.Any],
        "LinkId" -> LinkId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AssociateLinkRequest]
    }
  }

  @js.native
  trait AssociateLinkResponse extends js.Object {
    var LinkAssociation: js.UndefOr[LinkAssociation]
  }

  object AssociateLinkResponse {
    @inline
    def apply(
        LinkAssociation: js.UndefOr[LinkAssociation] = js.undefined
    ): AssociateLinkResponse = {
      val __obj = js.Dynamic.literal()
      LinkAssociation.foreach(__v => __obj.updateDynamic("LinkAssociation")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssociateLinkResponse]
    }
  }

  @js.native
  trait AssociateTransitGatewayConnectPeerRequest extends js.Object {
    var DeviceId: DeviceId
    var GlobalNetworkId: GlobalNetworkId
    var TransitGatewayConnectPeerArn: TransitGatewayConnectPeerArn
    var LinkId: js.UndefOr[LinkId]
  }

  object AssociateTransitGatewayConnectPeerRequest {
    @inline
    def apply(
        DeviceId: DeviceId,
        GlobalNetworkId: GlobalNetworkId,
        TransitGatewayConnectPeerArn: TransitGatewayConnectPeerArn,
        LinkId: js.UndefOr[LinkId] = js.undefined
    ): AssociateTransitGatewayConnectPeerRequest = {
      val __obj = js.Dynamic.literal(
        "DeviceId" -> DeviceId.asInstanceOf[js.Any],
        "GlobalNetworkId" -> GlobalNetworkId.asInstanceOf[js.Any],
        "TransitGatewayConnectPeerArn" -> TransitGatewayConnectPeerArn.asInstanceOf[js.Any]
      )

      LinkId.foreach(__v => __obj.updateDynamic("LinkId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssociateTransitGatewayConnectPeerRequest]
    }
  }

  @js.native
  trait AssociateTransitGatewayConnectPeerResponse extends js.Object {
    var TransitGatewayConnectPeerAssociation: js.UndefOr[TransitGatewayConnectPeerAssociation]
  }

  object AssociateTransitGatewayConnectPeerResponse {
    @inline
    def apply(
        TransitGatewayConnectPeerAssociation: js.UndefOr[TransitGatewayConnectPeerAssociation] = js.undefined
    ): AssociateTransitGatewayConnectPeerResponse = {
      val __obj = js.Dynamic.literal()
      TransitGatewayConnectPeerAssociation.foreach(__v => __obj.updateDynamic("TransitGatewayConnectPeerAssociation")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssociateTransitGatewayConnectPeerResponse]
    }
  }

  /** Describes a core network attachment.
    */
  @js.native
  trait Attachment extends js.Object {
    var AttachmentId: js.UndefOr[AttachmentId]
    var AttachmentPolicyRuleNumber: js.UndefOr[Int]
    var AttachmentType: js.UndefOr[AttachmentType]
    var CoreNetworkArn: js.UndefOr[CoreNetworkArn]
    var CoreNetworkId: js.UndefOr[CoreNetworkId]
    var CreatedAt: js.UndefOr[DateTime]
    var EdgeLocation: js.UndefOr[ExternalRegionCode]
    var OwnerAccountId: js.UndefOr[AWSAccountId]
    var ProposedSegmentChange: js.UndefOr[ProposedSegmentChange]
    var ResourceArn: js.UndefOr[ResourceArn]
    var SegmentName: js.UndefOr[ConstrainedString]
    var State: js.UndefOr[AttachmentState]
    var Tags: js.UndefOr[TagList]
    var UpdatedAt: js.UndefOr[DateTime]
  }

  object Attachment {
    @inline
    def apply(
        AttachmentId: js.UndefOr[AttachmentId] = js.undefined,
        AttachmentPolicyRuleNumber: js.UndefOr[Int] = js.undefined,
        AttachmentType: js.UndefOr[AttachmentType] = js.undefined,
        CoreNetworkArn: js.UndefOr[CoreNetworkArn] = js.undefined,
        CoreNetworkId: js.UndefOr[CoreNetworkId] = js.undefined,
        CreatedAt: js.UndefOr[DateTime] = js.undefined,
        EdgeLocation: js.UndefOr[ExternalRegionCode] = js.undefined,
        OwnerAccountId: js.UndefOr[AWSAccountId] = js.undefined,
        ProposedSegmentChange: js.UndefOr[ProposedSegmentChange] = js.undefined,
        ResourceArn: js.UndefOr[ResourceArn] = js.undefined,
        SegmentName: js.UndefOr[ConstrainedString] = js.undefined,
        State: js.UndefOr[AttachmentState] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined,
        UpdatedAt: js.UndefOr[DateTime] = js.undefined
    ): Attachment = {
      val __obj = js.Dynamic.literal()
      AttachmentId.foreach(__v => __obj.updateDynamic("AttachmentId")(__v.asInstanceOf[js.Any]))
      AttachmentPolicyRuleNumber.foreach(__v => __obj.updateDynamic("AttachmentPolicyRuleNumber")(__v.asInstanceOf[js.Any]))
      AttachmentType.foreach(__v => __obj.updateDynamic("AttachmentType")(__v.asInstanceOf[js.Any]))
      CoreNetworkArn.foreach(__v => __obj.updateDynamic("CoreNetworkArn")(__v.asInstanceOf[js.Any]))
      CoreNetworkId.foreach(__v => __obj.updateDynamic("CoreNetworkId")(__v.asInstanceOf[js.Any]))
      CreatedAt.foreach(__v => __obj.updateDynamic("CreatedAt")(__v.asInstanceOf[js.Any]))
      EdgeLocation.foreach(__v => __obj.updateDynamic("EdgeLocation")(__v.asInstanceOf[js.Any]))
      OwnerAccountId.foreach(__v => __obj.updateDynamic("OwnerAccountId")(__v.asInstanceOf[js.Any]))
      ProposedSegmentChange.foreach(__v => __obj.updateDynamic("ProposedSegmentChange")(__v.asInstanceOf[js.Any]))
      ResourceArn.foreach(__v => __obj.updateDynamic("ResourceArn")(__v.asInstanceOf[js.Any]))
      SegmentName.foreach(__v => __obj.updateDynamic("SegmentName")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      UpdatedAt.foreach(__v => __obj.updateDynamic("UpdatedAt")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Attachment]
    }
  }

  /** Describes bandwidth information.
    */
  @js.native
  trait Bandwidth extends js.Object {
    var DownloadSpeed: js.UndefOr[Int]
    var UploadSpeed: js.UndefOr[Int]
  }

  object Bandwidth {
    @inline
    def apply(
        DownloadSpeed: js.UndefOr[Int] = js.undefined,
        UploadSpeed: js.UndefOr[Int] = js.undefined
    ): Bandwidth = {
      val __obj = js.Dynamic.literal()
      DownloadSpeed.foreach(__v => __obj.updateDynamic("DownloadSpeed")(__v.asInstanceOf[js.Any]))
      UploadSpeed.foreach(__v => __obj.updateDynamic("UploadSpeed")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Bandwidth]
    }
  }

  /** Describes the BGP options.
    */
  @js.native
  trait BgpOptions extends js.Object {
    var PeerAsn: js.UndefOr[Double]
  }

  object BgpOptions {
    @inline
    def apply(
        PeerAsn: js.UndefOr[Double] = js.undefined
    ): BgpOptions = {
      val __obj = js.Dynamic.literal()
      PeerAsn.foreach(__v => __obj.updateDynamic("PeerAsn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BgpOptions]
    }
  }

  /** Describes a core network Connect attachment.
    */
  @js.native
  trait ConnectAttachment extends js.Object {
    var Attachment: js.UndefOr[Attachment]
    var Options: js.UndefOr[ConnectAttachmentOptions]
    var TransportAttachmentId: js.UndefOr[AttachmentId]
  }

  object ConnectAttachment {
    @inline
    def apply(
        Attachment: js.UndefOr[Attachment] = js.undefined,
        Options: js.UndefOr[ConnectAttachmentOptions] = js.undefined,
        TransportAttachmentId: js.UndefOr[AttachmentId] = js.undefined
    ): ConnectAttachment = {
      val __obj = js.Dynamic.literal()
      Attachment.foreach(__v => __obj.updateDynamic("Attachment")(__v.asInstanceOf[js.Any]))
      Options.foreach(__v => __obj.updateDynamic("Options")(__v.asInstanceOf[js.Any]))
      TransportAttachmentId.foreach(__v => __obj.updateDynamic("TransportAttachmentId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ConnectAttachment]
    }
  }

  /** Describes a core network Connect attachment options.
    */
  @js.native
  trait ConnectAttachmentOptions extends js.Object {
    var Protocol: js.UndefOr[TunnelProtocol]
  }

  object ConnectAttachmentOptions {
    @inline
    def apply(
        Protocol: js.UndefOr[TunnelProtocol] = js.undefined
    ): ConnectAttachmentOptions = {
      val __obj = js.Dynamic.literal()
      Protocol.foreach(__v => __obj.updateDynamic("Protocol")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ConnectAttachmentOptions]
    }
  }

  /** Describes a core network Connect peer.
    */
  @js.native
  trait ConnectPeer extends js.Object {
    var Configuration: js.UndefOr[ConnectPeerConfiguration]
    var ConnectAttachmentId: js.UndefOr[AttachmentId]
    var ConnectPeerId: js.UndefOr[ConnectPeerId]
    var CoreNetworkId: js.UndefOr[CoreNetworkId]
    var CreatedAt: js.UndefOr[DateTime]
    var EdgeLocation: js.UndefOr[ExternalRegionCode]
    var State: js.UndefOr[ConnectPeerState]
    var Tags: js.UndefOr[TagList]
  }

  object ConnectPeer {
    @inline
    def apply(
        Configuration: js.UndefOr[ConnectPeerConfiguration] = js.undefined,
        ConnectAttachmentId: js.UndefOr[AttachmentId] = js.undefined,
        ConnectPeerId: js.UndefOr[ConnectPeerId] = js.undefined,
        CoreNetworkId: js.UndefOr[CoreNetworkId] = js.undefined,
        CreatedAt: js.UndefOr[DateTime] = js.undefined,
        EdgeLocation: js.UndefOr[ExternalRegionCode] = js.undefined,
        State: js.UndefOr[ConnectPeerState] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): ConnectPeer = {
      val __obj = js.Dynamic.literal()
      Configuration.foreach(__v => __obj.updateDynamic("Configuration")(__v.asInstanceOf[js.Any]))
      ConnectAttachmentId.foreach(__v => __obj.updateDynamic("ConnectAttachmentId")(__v.asInstanceOf[js.Any]))
      ConnectPeerId.foreach(__v => __obj.updateDynamic("ConnectPeerId")(__v.asInstanceOf[js.Any]))
      CoreNetworkId.foreach(__v => __obj.updateDynamic("CoreNetworkId")(__v.asInstanceOf[js.Any]))
      CreatedAt.foreach(__v => __obj.updateDynamic("CreatedAt")(__v.asInstanceOf[js.Any]))
      EdgeLocation.foreach(__v => __obj.updateDynamic("EdgeLocation")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ConnectPeer]
    }
  }

  /** Describes a core network Connect peer association.
    */
  @js.native
  trait ConnectPeerAssociation extends js.Object {
    var ConnectPeerId: js.UndefOr[ConnectPeerId]
    var DeviceId: js.UndefOr[DeviceId]
    var GlobalNetworkId: js.UndefOr[GlobalNetworkId]
    var LinkId: js.UndefOr[LinkId]
    var State: js.UndefOr[ConnectPeerAssociationState]
  }

  object ConnectPeerAssociation {
    @inline
    def apply(
        ConnectPeerId: js.UndefOr[ConnectPeerId] = js.undefined,
        DeviceId: js.UndefOr[DeviceId] = js.undefined,
        GlobalNetworkId: js.UndefOr[GlobalNetworkId] = js.undefined,
        LinkId: js.UndefOr[LinkId] = js.undefined,
        State: js.UndefOr[ConnectPeerAssociationState] = js.undefined
    ): ConnectPeerAssociation = {
      val __obj = js.Dynamic.literal()
      ConnectPeerId.foreach(__v => __obj.updateDynamic("ConnectPeerId")(__v.asInstanceOf[js.Any]))
      DeviceId.foreach(__v => __obj.updateDynamic("DeviceId")(__v.asInstanceOf[js.Any]))
      GlobalNetworkId.foreach(__v => __obj.updateDynamic("GlobalNetworkId")(__v.asInstanceOf[js.Any]))
      LinkId.foreach(__v => __obj.updateDynamic("LinkId")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ConnectPeerAssociation]
    }
  }

  /** Describes a core network BGP configuration.
    */
  @js.native
  trait ConnectPeerBgpConfiguration extends js.Object {
    var CoreNetworkAddress: js.UndefOr[IPAddress]
    var CoreNetworkAsn: js.UndefOr[Double]
    var PeerAddress: js.UndefOr[IPAddress]
    var PeerAsn: js.UndefOr[Double]
  }

  object ConnectPeerBgpConfiguration {
    @inline
    def apply(
        CoreNetworkAddress: js.UndefOr[IPAddress] = js.undefined,
        CoreNetworkAsn: js.UndefOr[Double] = js.undefined,
        PeerAddress: js.UndefOr[IPAddress] = js.undefined,
        PeerAsn: js.UndefOr[Double] = js.undefined
    ): ConnectPeerBgpConfiguration = {
      val __obj = js.Dynamic.literal()
      CoreNetworkAddress.foreach(__v => __obj.updateDynamic("CoreNetworkAddress")(__v.asInstanceOf[js.Any]))
      CoreNetworkAsn.foreach(__v => __obj.updateDynamic("CoreNetworkAsn")(__v.asInstanceOf[js.Any]))
      PeerAddress.foreach(__v => __obj.updateDynamic("PeerAddress")(__v.asInstanceOf[js.Any]))
      PeerAsn.foreach(__v => __obj.updateDynamic("PeerAsn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ConnectPeerBgpConfiguration]
    }
  }

  /** Describes a core network Connect peer configuration.
    */
  @js.native
  trait ConnectPeerConfiguration extends js.Object {
    var BgpConfigurations: js.UndefOr[ConnectPeerBgpConfigurationList]
    var CoreNetworkAddress: js.UndefOr[IPAddress]
    var InsideCidrBlocks: js.UndefOr[ConstrainedStringList]
    var PeerAddress: js.UndefOr[IPAddress]
    var Protocol: js.UndefOr[TunnelProtocol]
  }

  object ConnectPeerConfiguration {
    @inline
    def apply(
        BgpConfigurations: js.UndefOr[ConnectPeerBgpConfigurationList] = js.undefined,
        CoreNetworkAddress: js.UndefOr[IPAddress] = js.undefined,
        InsideCidrBlocks: js.UndefOr[ConstrainedStringList] = js.undefined,
        PeerAddress: js.UndefOr[IPAddress] = js.undefined,
        Protocol: js.UndefOr[TunnelProtocol] = js.undefined
    ): ConnectPeerConfiguration = {
      val __obj = js.Dynamic.literal()
      BgpConfigurations.foreach(__v => __obj.updateDynamic("BgpConfigurations")(__v.asInstanceOf[js.Any]))
      CoreNetworkAddress.foreach(__v => __obj.updateDynamic("CoreNetworkAddress")(__v.asInstanceOf[js.Any]))
      InsideCidrBlocks.foreach(__v => __obj.updateDynamic("InsideCidrBlocks")(__v.asInstanceOf[js.Any]))
      PeerAddress.foreach(__v => __obj.updateDynamic("PeerAddress")(__v.asInstanceOf[js.Any]))
      Protocol.foreach(__v => __obj.updateDynamic("Protocol")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ConnectPeerConfiguration]
    }
  }

  /** Summary description of a Connect peer.
    */
  @js.native
  trait ConnectPeerSummary extends js.Object {
    var ConnectAttachmentId: js.UndefOr[AttachmentId]
    var ConnectPeerId: js.UndefOr[ConnectPeerId]
    var ConnectPeerState: js.UndefOr[ConnectPeerState]
    var CoreNetworkId: js.UndefOr[CoreNetworkId]
    var CreatedAt: js.UndefOr[DateTime]
    var EdgeLocation: js.UndefOr[ExternalRegionCode]
    var Tags: js.UndefOr[TagList]
  }

  object ConnectPeerSummary {
    @inline
    def apply(
        ConnectAttachmentId: js.UndefOr[AttachmentId] = js.undefined,
        ConnectPeerId: js.UndefOr[ConnectPeerId] = js.undefined,
        ConnectPeerState: js.UndefOr[ConnectPeerState] = js.undefined,
        CoreNetworkId: js.UndefOr[CoreNetworkId] = js.undefined,
        CreatedAt: js.UndefOr[DateTime] = js.undefined,
        EdgeLocation: js.UndefOr[ExternalRegionCode] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): ConnectPeerSummary = {
      val __obj = js.Dynamic.literal()
      ConnectAttachmentId.foreach(__v => __obj.updateDynamic("ConnectAttachmentId")(__v.asInstanceOf[js.Any]))
      ConnectPeerId.foreach(__v => __obj.updateDynamic("ConnectPeerId")(__v.asInstanceOf[js.Any]))
      ConnectPeerState.foreach(__v => __obj.updateDynamic("ConnectPeerState")(__v.asInstanceOf[js.Any]))
      CoreNetworkId.foreach(__v => __obj.updateDynamic("CoreNetworkId")(__v.asInstanceOf[js.Any]))
      CreatedAt.foreach(__v => __obj.updateDynamic("CreatedAt")(__v.asInstanceOf[js.Any]))
      EdgeLocation.foreach(__v => __obj.updateDynamic("EdgeLocation")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ConnectPeerSummary]
    }
  }

  /** Describes a connection.
    */
  @js.native
  trait Connection extends js.Object {
    var ConnectedDeviceId: js.UndefOr[DeviceId]
    var ConnectedLinkId: js.UndefOr[LinkId]
    var ConnectionArn: js.UndefOr[ConnectionArn]
    var ConnectionId: js.UndefOr[ConnectionId]
    var CreatedAt: js.UndefOr[DateTime]
    var Description: js.UndefOr[ConstrainedString]
    var DeviceId: js.UndefOr[DeviceId]
    var GlobalNetworkId: js.UndefOr[GlobalNetworkId]
    var LinkId: js.UndefOr[LinkId]
    var State: js.UndefOr[ConnectionState]
    var Tags: js.UndefOr[TagList]
  }

  object Connection {
    @inline
    def apply(
        ConnectedDeviceId: js.UndefOr[DeviceId] = js.undefined,
        ConnectedLinkId: js.UndefOr[LinkId] = js.undefined,
        ConnectionArn: js.UndefOr[ConnectionArn] = js.undefined,
        ConnectionId: js.UndefOr[ConnectionId] = js.undefined,
        CreatedAt: js.UndefOr[DateTime] = js.undefined,
        Description: js.UndefOr[ConstrainedString] = js.undefined,
        DeviceId: js.UndefOr[DeviceId] = js.undefined,
        GlobalNetworkId: js.UndefOr[GlobalNetworkId] = js.undefined,
        LinkId: js.UndefOr[LinkId] = js.undefined,
        State: js.UndefOr[ConnectionState] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): Connection = {
      val __obj = js.Dynamic.literal()
      ConnectedDeviceId.foreach(__v => __obj.updateDynamic("ConnectedDeviceId")(__v.asInstanceOf[js.Any]))
      ConnectedLinkId.foreach(__v => __obj.updateDynamic("ConnectedLinkId")(__v.asInstanceOf[js.Any]))
      ConnectionArn.foreach(__v => __obj.updateDynamic("ConnectionArn")(__v.asInstanceOf[js.Any]))
      ConnectionId.foreach(__v => __obj.updateDynamic("ConnectionId")(__v.asInstanceOf[js.Any]))
      CreatedAt.foreach(__v => __obj.updateDynamic("CreatedAt")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      DeviceId.foreach(__v => __obj.updateDynamic("DeviceId")(__v.asInstanceOf[js.Any]))
      GlobalNetworkId.foreach(__v => __obj.updateDynamic("GlobalNetworkId")(__v.asInstanceOf[js.Any]))
      LinkId.foreach(__v => __obj.updateDynamic("LinkId")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Connection]
    }
  }

  /** Describes connection health.
    */
  @js.native
  trait ConnectionHealth extends js.Object {
    var Status: js.UndefOr[ConnectionStatus]
    var Timestamp: js.UndefOr[DateTime]
    var Type: js.UndefOr[ConnectionType]
  }

  object ConnectionHealth {
    @inline
    def apply(
        Status: js.UndefOr[ConnectionStatus] = js.undefined,
        Timestamp: js.UndefOr[DateTime] = js.undefined,
        Type: js.UndefOr[ConnectionType] = js.undefined
    ): ConnectionHealth = {
      val __obj = js.Dynamic.literal()
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      Timestamp.foreach(__v => __obj.updateDynamic("Timestamp")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ConnectionHealth]
    }
  }

  /** Describes a core network.
    */
  @js.native
  trait CoreNetwork extends js.Object {
    var CoreNetworkArn: js.UndefOr[CoreNetworkArn]
    var CoreNetworkId: js.UndefOr[CoreNetworkId]
    var CreatedAt: js.UndefOr[DateTime]
    var Description: js.UndefOr[ConstrainedString]
    var Edges: js.UndefOr[CoreNetworkEdgeList]
    var GlobalNetworkId: js.UndefOr[GlobalNetworkId]
    var Segments: js.UndefOr[CoreNetworkSegmentList]
    var State: js.UndefOr[CoreNetworkState]
    var Tags: js.UndefOr[TagList]
  }

  object CoreNetwork {
    @inline
    def apply(
        CoreNetworkArn: js.UndefOr[CoreNetworkArn] = js.undefined,
        CoreNetworkId: js.UndefOr[CoreNetworkId] = js.undefined,
        CreatedAt: js.UndefOr[DateTime] = js.undefined,
        Description: js.UndefOr[ConstrainedString] = js.undefined,
        Edges: js.UndefOr[CoreNetworkEdgeList] = js.undefined,
        GlobalNetworkId: js.UndefOr[GlobalNetworkId] = js.undefined,
        Segments: js.UndefOr[CoreNetworkSegmentList] = js.undefined,
        State: js.UndefOr[CoreNetworkState] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CoreNetwork = {
      val __obj = js.Dynamic.literal()
      CoreNetworkArn.foreach(__v => __obj.updateDynamic("CoreNetworkArn")(__v.asInstanceOf[js.Any]))
      CoreNetworkId.foreach(__v => __obj.updateDynamic("CoreNetworkId")(__v.asInstanceOf[js.Any]))
      CreatedAt.foreach(__v => __obj.updateDynamic("CreatedAt")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Edges.foreach(__v => __obj.updateDynamic("Edges")(__v.asInstanceOf[js.Any]))
      GlobalNetworkId.foreach(__v => __obj.updateDynamic("GlobalNetworkId")(__v.asInstanceOf[js.Any]))
      Segments.foreach(__v => __obj.updateDynamic("Segments")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CoreNetwork]
    }
  }

  /** Details describing a core network change.
    */
  @js.native
  trait CoreNetworkChange extends js.Object {
    var Action: js.UndefOr[ChangeAction]
    var Identifier: js.UndefOr[ConstrainedString]
    var IdentifierPath: js.UndefOr[ConstrainedString]
    var NewValues: js.UndefOr[CoreNetworkChangeValues]
    var PreviousValues: js.UndefOr[CoreNetworkChangeValues]
    var Type: js.UndefOr[ChangeType]
  }

  object CoreNetworkChange {
    @inline
    def apply(
        Action: js.UndefOr[ChangeAction] = js.undefined,
        Identifier: js.UndefOr[ConstrainedString] = js.undefined,
        IdentifierPath: js.UndefOr[ConstrainedString] = js.undefined,
        NewValues: js.UndefOr[CoreNetworkChangeValues] = js.undefined,
        PreviousValues: js.UndefOr[CoreNetworkChangeValues] = js.undefined,
        Type: js.UndefOr[ChangeType] = js.undefined
    ): CoreNetworkChange = {
      val __obj = js.Dynamic.literal()
      Action.foreach(__v => __obj.updateDynamic("Action")(__v.asInstanceOf[js.Any]))
      Identifier.foreach(__v => __obj.updateDynamic("Identifier")(__v.asInstanceOf[js.Any]))
      IdentifierPath.foreach(__v => __obj.updateDynamic("IdentifierPath")(__v.asInstanceOf[js.Any]))
      NewValues.foreach(__v => __obj.updateDynamic("NewValues")(__v.asInstanceOf[js.Any]))
      PreviousValues.foreach(__v => __obj.updateDynamic("PreviousValues")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CoreNetworkChange]
    }
  }

  /** Describes a core network change event. This can be a change to a segment, attachment, route, etc.
    */
  @js.native
  trait CoreNetworkChangeEvent extends js.Object {
    var Action: js.UndefOr[ChangeAction]
    var EventTime: js.UndefOr[DateTime]
    var IdentifierPath: js.UndefOr[ConstrainedString]
    var Status: js.UndefOr[ChangeStatus]
    var Type: js.UndefOr[ChangeType]
    var Values: js.UndefOr[CoreNetworkChangeEventValues]
  }

  object CoreNetworkChangeEvent {
    @inline
    def apply(
        Action: js.UndefOr[ChangeAction] = js.undefined,
        EventTime: js.UndefOr[DateTime] = js.undefined,
        IdentifierPath: js.UndefOr[ConstrainedString] = js.undefined,
        Status: js.UndefOr[ChangeStatus] = js.undefined,
        Type: js.UndefOr[ChangeType] = js.undefined,
        Values: js.UndefOr[CoreNetworkChangeEventValues] = js.undefined
    ): CoreNetworkChangeEvent = {
      val __obj = js.Dynamic.literal()
      Action.foreach(__v => __obj.updateDynamic("Action")(__v.asInstanceOf[js.Any]))
      EventTime.foreach(__v => __obj.updateDynamic("EventTime")(__v.asInstanceOf[js.Any]))
      IdentifierPath.foreach(__v => __obj.updateDynamic("IdentifierPath")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      Values.foreach(__v => __obj.updateDynamic("Values")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CoreNetworkChangeEvent]
    }
  }

  /** Describes a core network change event.
    */
  @js.native
  trait CoreNetworkChangeEventValues extends js.Object {
    var AttachmentId: js.UndefOr[AttachmentId]
    var Cidr: js.UndefOr[ConstrainedString]
    var EdgeLocation: js.UndefOr[ExternalRegionCode]
    var SegmentName: js.UndefOr[ConstrainedString]
  }

  object CoreNetworkChangeEventValues {
    @inline
    def apply(
        AttachmentId: js.UndefOr[AttachmentId] = js.undefined,
        Cidr: js.UndefOr[ConstrainedString] = js.undefined,
        EdgeLocation: js.UndefOr[ExternalRegionCode] = js.undefined,
        SegmentName: js.UndefOr[ConstrainedString] = js.undefined
    ): CoreNetworkChangeEventValues = {
      val __obj = js.Dynamic.literal()
      AttachmentId.foreach(__v => __obj.updateDynamic("AttachmentId")(__v.asInstanceOf[js.Any]))
      Cidr.foreach(__v => __obj.updateDynamic("Cidr")(__v.asInstanceOf[js.Any]))
      EdgeLocation.foreach(__v => __obj.updateDynamic("EdgeLocation")(__v.asInstanceOf[js.Any]))
      SegmentName.foreach(__v => __obj.updateDynamic("SegmentName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CoreNetworkChangeEventValues]
    }
  }

  /** Describes a core network change.
    */
  @js.native
  trait CoreNetworkChangeValues extends js.Object {
    var Asn: js.UndefOr[Double]
    var Cidr: js.UndefOr[ConstrainedString]
    var DestinationIdentifier: js.UndefOr[ConstrainedString]
    var EdgeLocations: js.UndefOr[ExternalRegionCodeList]
    var InsideCidrBlocks: js.UndefOr[ConstrainedStringList]
    var SegmentName: js.UndefOr[ConstrainedString]
    var SharedSegments: js.UndefOr[ConstrainedStringList]
  }

  object CoreNetworkChangeValues {
    @inline
    def apply(
        Asn: js.UndefOr[Double] = js.undefined,
        Cidr: js.UndefOr[ConstrainedString] = js.undefined,
        DestinationIdentifier: js.UndefOr[ConstrainedString] = js.undefined,
        EdgeLocations: js.UndefOr[ExternalRegionCodeList] = js.undefined,
        InsideCidrBlocks: js.UndefOr[ConstrainedStringList] = js.undefined,
        SegmentName: js.UndefOr[ConstrainedString] = js.undefined,
        SharedSegments: js.UndefOr[ConstrainedStringList] = js.undefined
    ): CoreNetworkChangeValues = {
      val __obj = js.Dynamic.literal()
      Asn.foreach(__v => __obj.updateDynamic("Asn")(__v.asInstanceOf[js.Any]))
      Cidr.foreach(__v => __obj.updateDynamic("Cidr")(__v.asInstanceOf[js.Any]))
      DestinationIdentifier.foreach(__v => __obj.updateDynamic("DestinationIdentifier")(__v.asInstanceOf[js.Any]))
      EdgeLocations.foreach(__v => __obj.updateDynamic("EdgeLocations")(__v.asInstanceOf[js.Any]))
      InsideCidrBlocks.foreach(__v => __obj.updateDynamic("InsideCidrBlocks")(__v.asInstanceOf[js.Any]))
      SegmentName.foreach(__v => __obj.updateDynamic("SegmentName")(__v.asInstanceOf[js.Any]))
      SharedSegments.foreach(__v => __obj.updateDynamic("SharedSegments")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CoreNetworkChangeValues]
    }
  }

  /** Describes a core network edge.
    */
  @js.native
  trait CoreNetworkEdge extends js.Object {
    var Asn: js.UndefOr[Double]
    var EdgeLocation: js.UndefOr[ExternalRegionCode]
    var InsideCidrBlocks: js.UndefOr[ConstrainedStringList]
  }

  object CoreNetworkEdge {
    @inline
    def apply(
        Asn: js.UndefOr[Double] = js.undefined,
        EdgeLocation: js.UndefOr[ExternalRegionCode] = js.undefined,
        InsideCidrBlocks: js.UndefOr[ConstrainedStringList] = js.undefined
    ): CoreNetworkEdge = {
      val __obj = js.Dynamic.literal()
      Asn.foreach(__v => __obj.updateDynamic("Asn")(__v.asInstanceOf[js.Any]))
      EdgeLocation.foreach(__v => __obj.updateDynamic("EdgeLocation")(__v.asInstanceOf[js.Any]))
      InsideCidrBlocks.foreach(__v => __obj.updateDynamic("InsideCidrBlocks")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CoreNetworkEdge]
    }
  }

  /** Describes a core network policy. You can have only one LIVE Core Policy.
    */
  @js.native
  trait CoreNetworkPolicy extends js.Object {
    var Alias: js.UndefOr[CoreNetworkPolicyAlias]
    var ChangeSetState: js.UndefOr[ChangeSetState]
    var CoreNetworkId: js.UndefOr[CoreNetworkId]
    var CreatedAt: js.UndefOr[DateTime]
    var Description: js.UndefOr[ConstrainedString]
    var PolicyDocument: js.UndefOr[CoreNetworkPolicyDocument]
    var PolicyErrors: js.UndefOr[CoreNetworkPolicyErrorList]
    var PolicyVersionId: js.UndefOr[Int]
  }

  object CoreNetworkPolicy {
    @inline
    def apply(
        Alias: js.UndefOr[CoreNetworkPolicyAlias] = js.undefined,
        ChangeSetState: js.UndefOr[ChangeSetState] = js.undefined,
        CoreNetworkId: js.UndefOr[CoreNetworkId] = js.undefined,
        CreatedAt: js.UndefOr[DateTime] = js.undefined,
        Description: js.UndefOr[ConstrainedString] = js.undefined,
        PolicyDocument: js.UndefOr[CoreNetworkPolicyDocument] = js.undefined,
        PolicyErrors: js.UndefOr[CoreNetworkPolicyErrorList] = js.undefined,
        PolicyVersionId: js.UndefOr[Int] = js.undefined
    ): CoreNetworkPolicy = {
      val __obj = js.Dynamic.literal()
      Alias.foreach(__v => __obj.updateDynamic("Alias")(__v.asInstanceOf[js.Any]))
      ChangeSetState.foreach(__v => __obj.updateDynamic("ChangeSetState")(__v.asInstanceOf[js.Any]))
      CoreNetworkId.foreach(__v => __obj.updateDynamic("CoreNetworkId")(__v.asInstanceOf[js.Any]))
      CreatedAt.foreach(__v => __obj.updateDynamic("CreatedAt")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      PolicyDocument.foreach(__v => __obj.updateDynamic("PolicyDocument")(__v.asInstanceOf[js.Any]))
      PolicyErrors.foreach(__v => __obj.updateDynamic("PolicyErrors")(__v.asInstanceOf[js.Any]))
      PolicyVersionId.foreach(__v => __obj.updateDynamic("PolicyVersionId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CoreNetworkPolicy]
    }
  }

  /** Provides details about an error in a core network policy.
    */
  @js.native
  trait CoreNetworkPolicyError extends js.Object {
    var ErrorCode: ServerSideString
    var Message: ServerSideString
    var Path: js.UndefOr[ServerSideString]
  }

  object CoreNetworkPolicyError {
    @inline
    def apply(
        ErrorCode: ServerSideString,
        Message: ServerSideString,
        Path: js.UndefOr[ServerSideString] = js.undefined
    ): CoreNetworkPolicyError = {
      val __obj = js.Dynamic.literal(
        "ErrorCode" -> ErrorCode.asInstanceOf[js.Any],
        "Message" -> Message.asInstanceOf[js.Any]
      )

      Path.foreach(__v => __obj.updateDynamic("Path")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CoreNetworkPolicyError]
    }
  }

  /** Describes a core network policy version.
    */
  @js.native
  trait CoreNetworkPolicyVersion extends js.Object {
    var Alias: js.UndefOr[CoreNetworkPolicyAlias]
    var ChangeSetState: js.UndefOr[ChangeSetState]
    var CoreNetworkId: js.UndefOr[CoreNetworkId]
    var CreatedAt: js.UndefOr[DateTime]
    var Description: js.UndefOr[ConstrainedString]
    var PolicyVersionId: js.UndefOr[Int]
  }

  object CoreNetworkPolicyVersion {
    @inline
    def apply(
        Alias: js.UndefOr[CoreNetworkPolicyAlias] = js.undefined,
        ChangeSetState: js.UndefOr[ChangeSetState] = js.undefined,
        CoreNetworkId: js.UndefOr[CoreNetworkId] = js.undefined,
        CreatedAt: js.UndefOr[DateTime] = js.undefined,
        Description: js.UndefOr[ConstrainedString] = js.undefined,
        PolicyVersionId: js.UndefOr[Int] = js.undefined
    ): CoreNetworkPolicyVersion = {
      val __obj = js.Dynamic.literal()
      Alias.foreach(__v => __obj.updateDynamic("Alias")(__v.asInstanceOf[js.Any]))
      ChangeSetState.foreach(__v => __obj.updateDynamic("ChangeSetState")(__v.asInstanceOf[js.Any]))
      CoreNetworkId.foreach(__v => __obj.updateDynamic("CoreNetworkId")(__v.asInstanceOf[js.Any]))
      CreatedAt.foreach(__v => __obj.updateDynamic("CreatedAt")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      PolicyVersionId.foreach(__v => __obj.updateDynamic("PolicyVersionId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CoreNetworkPolicyVersion]
    }
  }

  /** Describes a core network segment, which are dedicated routes. Only attachments within this segment can communicate with each other.
    */
  @js.native
  trait CoreNetworkSegment extends js.Object {
    var EdgeLocations: js.UndefOr[ExternalRegionCodeList]
    var Name: js.UndefOr[ConstrainedString]
    var SharedSegments: js.UndefOr[ConstrainedStringList]
  }

  object CoreNetworkSegment {
    @inline
    def apply(
        EdgeLocations: js.UndefOr[ExternalRegionCodeList] = js.undefined,
        Name: js.UndefOr[ConstrainedString] = js.undefined,
        SharedSegments: js.UndefOr[ConstrainedStringList] = js.undefined
    ): CoreNetworkSegment = {
      val __obj = js.Dynamic.literal()
      EdgeLocations.foreach(__v => __obj.updateDynamic("EdgeLocations")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      SharedSegments.foreach(__v => __obj.updateDynamic("SharedSegments")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CoreNetworkSegment]
    }
  }

  /** Returns details about a core network edge.
    */
  @js.native
  trait CoreNetworkSegmentEdgeIdentifier extends js.Object {
    var CoreNetworkId: js.UndefOr[CoreNetworkId]
    var EdgeLocation: js.UndefOr[ExternalRegionCode]
    var SegmentName: js.UndefOr[ConstrainedString]
  }

  object CoreNetworkSegmentEdgeIdentifier {
    @inline
    def apply(
        CoreNetworkId: js.UndefOr[CoreNetworkId] = js.undefined,
        EdgeLocation: js.UndefOr[ExternalRegionCode] = js.undefined,
        SegmentName: js.UndefOr[ConstrainedString] = js.undefined
    ): CoreNetworkSegmentEdgeIdentifier = {
      val __obj = js.Dynamic.literal()
      CoreNetworkId.foreach(__v => __obj.updateDynamic("CoreNetworkId")(__v.asInstanceOf[js.Any]))
      EdgeLocation.foreach(__v => __obj.updateDynamic("EdgeLocation")(__v.asInstanceOf[js.Any]))
      SegmentName.foreach(__v => __obj.updateDynamic("SegmentName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CoreNetworkSegmentEdgeIdentifier]
    }
  }

  /** Returns summary information about a core network.
    */
  @js.native
  trait CoreNetworkSummary extends js.Object {
    var CoreNetworkArn: js.UndefOr[CoreNetworkArn]
    var CoreNetworkId: js.UndefOr[CoreNetworkId]
    var Description: js.UndefOr[ConstrainedString]
    var GlobalNetworkId: js.UndefOr[GlobalNetworkId]
    var OwnerAccountId: js.UndefOr[AWSAccountId]
    var State: js.UndefOr[CoreNetworkState]
    var Tags: js.UndefOr[TagList]
  }

  object CoreNetworkSummary {
    @inline
    def apply(
        CoreNetworkArn: js.UndefOr[CoreNetworkArn] = js.undefined,
        CoreNetworkId: js.UndefOr[CoreNetworkId] = js.undefined,
        Description: js.UndefOr[ConstrainedString] = js.undefined,
        GlobalNetworkId: js.UndefOr[GlobalNetworkId] = js.undefined,
        OwnerAccountId: js.UndefOr[AWSAccountId] = js.undefined,
        State: js.UndefOr[CoreNetworkState] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CoreNetworkSummary = {
      val __obj = js.Dynamic.literal()
      CoreNetworkArn.foreach(__v => __obj.updateDynamic("CoreNetworkArn")(__v.asInstanceOf[js.Any]))
      CoreNetworkId.foreach(__v => __obj.updateDynamic("CoreNetworkId")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      GlobalNetworkId.foreach(__v => __obj.updateDynamic("GlobalNetworkId")(__v.asInstanceOf[js.Any]))
      OwnerAccountId.foreach(__v => __obj.updateDynamic("OwnerAccountId")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CoreNetworkSummary]
    }
  }

  @js.native
  trait CreateConnectAttachmentRequest extends js.Object {
    var CoreNetworkId: CoreNetworkId
    var EdgeLocation: ExternalRegionCode
    var Options: ConnectAttachmentOptions
    var TransportAttachmentId: AttachmentId
    var ClientToken: js.UndefOr[ClientToken]
    var Tags: js.UndefOr[TagList]
  }

  object CreateConnectAttachmentRequest {
    @inline
    def apply(
        CoreNetworkId: CoreNetworkId,
        EdgeLocation: ExternalRegionCode,
        Options: ConnectAttachmentOptions,
        TransportAttachmentId: AttachmentId,
        ClientToken: js.UndefOr[ClientToken] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateConnectAttachmentRequest = {
      val __obj = js.Dynamic.literal(
        "CoreNetworkId" -> CoreNetworkId.asInstanceOf[js.Any],
        "EdgeLocation" -> EdgeLocation.asInstanceOf[js.Any],
        "Options" -> Options.asInstanceOf[js.Any],
        "TransportAttachmentId" -> TransportAttachmentId.asInstanceOf[js.Any]
      )

      ClientToken.foreach(__v => __obj.updateDynamic("ClientToken")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateConnectAttachmentRequest]
    }
  }

  @js.native
  trait CreateConnectAttachmentResponse extends js.Object {
    var ConnectAttachment: js.UndefOr[ConnectAttachment]
  }

  object CreateConnectAttachmentResponse {
    @inline
    def apply(
        ConnectAttachment: js.UndefOr[ConnectAttachment] = js.undefined
    ): CreateConnectAttachmentResponse = {
      val __obj = js.Dynamic.literal()
      ConnectAttachment.foreach(__v => __obj.updateDynamic("ConnectAttachment")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateConnectAttachmentResponse]
    }
  }

  @js.native
  trait CreateConnectPeerRequest extends js.Object {
    var ConnectAttachmentId: AttachmentId
    var InsideCidrBlocks: ConstrainedStringList
    var PeerAddress: IPAddress
    var BgpOptions: js.UndefOr[BgpOptions]
    var ClientToken: js.UndefOr[ClientToken]
    var CoreNetworkAddress: js.UndefOr[IPAddress]
    var Tags: js.UndefOr[TagList]
  }

  object CreateConnectPeerRequest {
    @inline
    def apply(
        ConnectAttachmentId: AttachmentId,
        InsideCidrBlocks: ConstrainedStringList,
        PeerAddress: IPAddress,
        BgpOptions: js.UndefOr[BgpOptions] = js.undefined,
        ClientToken: js.UndefOr[ClientToken] = js.undefined,
        CoreNetworkAddress: js.UndefOr[IPAddress] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateConnectPeerRequest = {
      val __obj = js.Dynamic.literal(
        "ConnectAttachmentId" -> ConnectAttachmentId.asInstanceOf[js.Any],
        "InsideCidrBlocks" -> InsideCidrBlocks.asInstanceOf[js.Any],
        "PeerAddress" -> PeerAddress.asInstanceOf[js.Any]
      )

      BgpOptions.foreach(__v => __obj.updateDynamic("BgpOptions")(__v.asInstanceOf[js.Any]))
      ClientToken.foreach(__v => __obj.updateDynamic("ClientToken")(__v.asInstanceOf[js.Any]))
      CoreNetworkAddress.foreach(__v => __obj.updateDynamic("CoreNetworkAddress")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateConnectPeerRequest]
    }
  }

  @js.native
  trait CreateConnectPeerResponse extends js.Object {
    var ConnectPeer: js.UndefOr[ConnectPeer]
  }

  object CreateConnectPeerResponse {
    @inline
    def apply(
        ConnectPeer: js.UndefOr[ConnectPeer] = js.undefined
    ): CreateConnectPeerResponse = {
      val __obj = js.Dynamic.literal()
      ConnectPeer.foreach(__v => __obj.updateDynamic("ConnectPeer")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateConnectPeerResponse]
    }
  }

  @js.native
  trait CreateConnectionRequest extends js.Object {
    var ConnectedDeviceId: DeviceId
    var DeviceId: DeviceId
    var GlobalNetworkId: GlobalNetworkId
    var ConnectedLinkId: js.UndefOr[LinkId]
    var Description: js.UndefOr[ConstrainedString]
    var LinkId: js.UndefOr[LinkId]
    var Tags: js.UndefOr[TagList]
  }

  object CreateConnectionRequest {
    @inline
    def apply(
        ConnectedDeviceId: DeviceId,
        DeviceId: DeviceId,
        GlobalNetworkId: GlobalNetworkId,
        ConnectedLinkId: js.UndefOr[LinkId] = js.undefined,
        Description: js.UndefOr[ConstrainedString] = js.undefined,
        LinkId: js.UndefOr[LinkId] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateConnectionRequest = {
      val __obj = js.Dynamic.literal(
        "ConnectedDeviceId" -> ConnectedDeviceId.asInstanceOf[js.Any],
        "DeviceId" -> DeviceId.asInstanceOf[js.Any],
        "GlobalNetworkId" -> GlobalNetworkId.asInstanceOf[js.Any]
      )

      ConnectedLinkId.foreach(__v => __obj.updateDynamic("ConnectedLinkId")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      LinkId.foreach(__v => __obj.updateDynamic("LinkId")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateConnectionRequest]
    }
  }

  @js.native
  trait CreateConnectionResponse extends js.Object {
    var Connection: js.UndefOr[Connection]
  }

  object CreateConnectionResponse {
    @inline
    def apply(
        Connection: js.UndefOr[Connection] = js.undefined
    ): CreateConnectionResponse = {
      val __obj = js.Dynamic.literal()
      Connection.foreach(__v => __obj.updateDynamic("Connection")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateConnectionResponse]
    }
  }

  @js.native
  trait CreateCoreNetworkRequest extends js.Object {
    var GlobalNetworkId: GlobalNetworkId
    var ClientToken: js.UndefOr[ClientToken]
    var Description: js.UndefOr[ConstrainedString]
    var PolicyDocument: js.UndefOr[CoreNetworkPolicyDocument]
    var Tags: js.UndefOr[TagList]
  }

  object CreateCoreNetworkRequest {
    @inline
    def apply(
        GlobalNetworkId: GlobalNetworkId,
        ClientToken: js.UndefOr[ClientToken] = js.undefined,
        Description: js.UndefOr[ConstrainedString] = js.undefined,
        PolicyDocument: js.UndefOr[CoreNetworkPolicyDocument] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateCoreNetworkRequest = {
      val __obj = js.Dynamic.literal(
        "GlobalNetworkId" -> GlobalNetworkId.asInstanceOf[js.Any]
      )

      ClientToken.foreach(__v => __obj.updateDynamic("ClientToken")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      PolicyDocument.foreach(__v => __obj.updateDynamic("PolicyDocument")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateCoreNetworkRequest]
    }
  }

  @js.native
  trait CreateCoreNetworkResponse extends js.Object {
    var CoreNetwork: js.UndefOr[CoreNetwork]
  }

  object CreateCoreNetworkResponse {
    @inline
    def apply(
        CoreNetwork: js.UndefOr[CoreNetwork] = js.undefined
    ): CreateCoreNetworkResponse = {
      val __obj = js.Dynamic.literal()
      CoreNetwork.foreach(__v => __obj.updateDynamic("CoreNetwork")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateCoreNetworkResponse]
    }
  }

  @js.native
  trait CreateDeviceRequest extends js.Object {
    var GlobalNetworkId: GlobalNetworkId
    var AWSLocation: js.UndefOr[AWSLocation]
    var Description: js.UndefOr[ConstrainedString]
    var Location: js.UndefOr[Location]
    var Model: js.UndefOr[ConstrainedString]
    var SerialNumber: js.UndefOr[ConstrainedString]
    var SiteId: js.UndefOr[SiteId]
    var Tags: js.UndefOr[TagList]
    var Type: js.UndefOr[ConstrainedString]
    var Vendor: js.UndefOr[ConstrainedString]
  }

  object CreateDeviceRequest {
    @inline
    def apply(
        GlobalNetworkId: GlobalNetworkId,
        AWSLocation: js.UndefOr[AWSLocation] = js.undefined,
        Description: js.UndefOr[ConstrainedString] = js.undefined,
        Location: js.UndefOr[Location] = js.undefined,
        Model: js.UndefOr[ConstrainedString] = js.undefined,
        SerialNumber: js.UndefOr[ConstrainedString] = js.undefined,
        SiteId: js.UndefOr[SiteId] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined,
        Type: js.UndefOr[ConstrainedString] = js.undefined,
        Vendor: js.UndefOr[ConstrainedString] = js.undefined
    ): CreateDeviceRequest = {
      val __obj = js.Dynamic.literal(
        "GlobalNetworkId" -> GlobalNetworkId.asInstanceOf[js.Any]
      )

      AWSLocation.foreach(__v => __obj.updateDynamic("AWSLocation")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Location.foreach(__v => __obj.updateDynamic("Location")(__v.asInstanceOf[js.Any]))
      Model.foreach(__v => __obj.updateDynamic("Model")(__v.asInstanceOf[js.Any]))
      SerialNumber.foreach(__v => __obj.updateDynamic("SerialNumber")(__v.asInstanceOf[js.Any]))
      SiteId.foreach(__v => __obj.updateDynamic("SiteId")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      Vendor.foreach(__v => __obj.updateDynamic("Vendor")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDeviceRequest]
    }
  }

  @js.native
  trait CreateDeviceResponse extends js.Object {
    var Device: js.UndefOr[Device]
  }

  object CreateDeviceResponse {
    @inline
    def apply(
        Device: js.UndefOr[Device] = js.undefined
    ): CreateDeviceResponse = {
      val __obj = js.Dynamic.literal()
      Device.foreach(__v => __obj.updateDynamic("Device")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDeviceResponse]
    }
  }

  @js.native
  trait CreateGlobalNetworkRequest extends js.Object {
    var Description: js.UndefOr[ConstrainedString]
    var Tags: js.UndefOr[TagList]
  }

  object CreateGlobalNetworkRequest {
    @inline
    def apply(
        Description: js.UndefOr[ConstrainedString] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateGlobalNetworkRequest = {
      val __obj = js.Dynamic.literal()
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateGlobalNetworkRequest]
    }
  }

  @js.native
  trait CreateGlobalNetworkResponse extends js.Object {
    var GlobalNetwork: js.UndefOr[GlobalNetwork]
  }

  object CreateGlobalNetworkResponse {
    @inline
    def apply(
        GlobalNetwork: js.UndefOr[GlobalNetwork] = js.undefined
    ): CreateGlobalNetworkResponse = {
      val __obj = js.Dynamic.literal()
      GlobalNetwork.foreach(__v => __obj.updateDynamic("GlobalNetwork")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateGlobalNetworkResponse]
    }
  }

  @js.native
  trait CreateLinkRequest extends js.Object {
    var Bandwidth: Bandwidth
    var GlobalNetworkId: GlobalNetworkId
    var SiteId: SiteId
    var Description: js.UndefOr[ConstrainedString]
    var Provider: js.UndefOr[ConstrainedString]
    var Tags: js.UndefOr[TagList]
    var Type: js.UndefOr[ConstrainedString]
  }

  object CreateLinkRequest {
    @inline
    def apply(
        Bandwidth: Bandwidth,
        GlobalNetworkId: GlobalNetworkId,
        SiteId: SiteId,
        Description: js.UndefOr[ConstrainedString] = js.undefined,
        Provider: js.UndefOr[ConstrainedString] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined,
        Type: js.UndefOr[ConstrainedString] = js.undefined
    ): CreateLinkRequest = {
      val __obj = js.Dynamic.literal(
        "Bandwidth" -> Bandwidth.asInstanceOf[js.Any],
        "GlobalNetworkId" -> GlobalNetworkId.asInstanceOf[js.Any],
        "SiteId" -> SiteId.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Provider.foreach(__v => __obj.updateDynamic("Provider")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateLinkRequest]
    }
  }

  @js.native
  trait CreateLinkResponse extends js.Object {
    var Link: js.UndefOr[Link]
  }

  object CreateLinkResponse {
    @inline
    def apply(
        Link: js.UndefOr[Link] = js.undefined
    ): CreateLinkResponse = {
      val __obj = js.Dynamic.literal()
      Link.foreach(__v => __obj.updateDynamic("Link")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateLinkResponse]
    }
  }

  @js.native
  trait CreateSiteRequest extends js.Object {
    var GlobalNetworkId: GlobalNetworkId
    var Description: js.UndefOr[ConstrainedString]
    var Location: js.UndefOr[Location]
    var Tags: js.UndefOr[TagList]
  }

  object CreateSiteRequest {
    @inline
    def apply(
        GlobalNetworkId: GlobalNetworkId,
        Description: js.UndefOr[ConstrainedString] = js.undefined,
        Location: js.UndefOr[Location] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateSiteRequest = {
      val __obj = js.Dynamic.literal(
        "GlobalNetworkId" -> GlobalNetworkId.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Location.foreach(__v => __obj.updateDynamic("Location")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateSiteRequest]
    }
  }

  @js.native
  trait CreateSiteResponse extends js.Object {
    var Site: js.UndefOr[Site]
  }

  object CreateSiteResponse {
    @inline
    def apply(
        Site: js.UndefOr[Site] = js.undefined
    ): CreateSiteResponse = {
      val __obj = js.Dynamic.literal()
      Site.foreach(__v => __obj.updateDynamic("Site")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateSiteResponse]
    }
  }

  @js.native
  trait CreateSiteToSiteVpnAttachmentRequest extends js.Object {
    var CoreNetworkId: CoreNetworkId
    var VpnConnectionArn: VpnConnectionArn
    var ClientToken: js.UndefOr[ClientToken]
    var Tags: js.UndefOr[TagList]
  }

  object CreateSiteToSiteVpnAttachmentRequest {
    @inline
    def apply(
        CoreNetworkId: CoreNetworkId,
        VpnConnectionArn: VpnConnectionArn,
        ClientToken: js.UndefOr[ClientToken] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateSiteToSiteVpnAttachmentRequest = {
      val __obj = js.Dynamic.literal(
        "CoreNetworkId" -> CoreNetworkId.asInstanceOf[js.Any],
        "VpnConnectionArn" -> VpnConnectionArn.asInstanceOf[js.Any]
      )

      ClientToken.foreach(__v => __obj.updateDynamic("ClientToken")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateSiteToSiteVpnAttachmentRequest]
    }
  }

  @js.native
  trait CreateSiteToSiteVpnAttachmentResponse extends js.Object {
    var SiteToSiteVpnAttachment: js.UndefOr[SiteToSiteVpnAttachment]
  }

  object CreateSiteToSiteVpnAttachmentResponse {
    @inline
    def apply(
        SiteToSiteVpnAttachment: js.UndefOr[SiteToSiteVpnAttachment] = js.undefined
    ): CreateSiteToSiteVpnAttachmentResponse = {
      val __obj = js.Dynamic.literal()
      SiteToSiteVpnAttachment.foreach(__v => __obj.updateDynamic("SiteToSiteVpnAttachment")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateSiteToSiteVpnAttachmentResponse]
    }
  }

  @js.native
  trait CreateTransitGatewayPeeringRequest extends js.Object {
    var CoreNetworkId: CoreNetworkId
    var TransitGatewayArn: TransitGatewayArn
    var ClientToken: js.UndefOr[ClientToken]
    var Tags: js.UndefOr[TagList]
  }

  object CreateTransitGatewayPeeringRequest {
    @inline
    def apply(
        CoreNetworkId: CoreNetworkId,
        TransitGatewayArn: TransitGatewayArn,
        ClientToken: js.UndefOr[ClientToken] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateTransitGatewayPeeringRequest = {
      val __obj = js.Dynamic.literal(
        "CoreNetworkId" -> CoreNetworkId.asInstanceOf[js.Any],
        "TransitGatewayArn" -> TransitGatewayArn.asInstanceOf[js.Any]
      )

      ClientToken.foreach(__v => __obj.updateDynamic("ClientToken")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateTransitGatewayPeeringRequest]
    }
  }

  @js.native
  trait CreateTransitGatewayPeeringResponse extends js.Object {
    var TransitGatewayPeering: js.UndefOr[TransitGatewayPeering]
  }

  object CreateTransitGatewayPeeringResponse {
    @inline
    def apply(
        TransitGatewayPeering: js.UndefOr[TransitGatewayPeering] = js.undefined
    ): CreateTransitGatewayPeeringResponse = {
      val __obj = js.Dynamic.literal()
      TransitGatewayPeering.foreach(__v => __obj.updateDynamic("TransitGatewayPeering")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateTransitGatewayPeeringResponse]
    }
  }

  @js.native
  trait CreateTransitGatewayRouteTableAttachmentRequest extends js.Object {
    var PeeringId: PeeringId
    var TransitGatewayRouteTableArn: TransitGatewayRouteTableArn
    var ClientToken: js.UndefOr[ClientToken]
    var Tags: js.UndefOr[TagList]
  }

  object CreateTransitGatewayRouteTableAttachmentRequest {
    @inline
    def apply(
        PeeringId: PeeringId,
        TransitGatewayRouteTableArn: TransitGatewayRouteTableArn,
        ClientToken: js.UndefOr[ClientToken] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateTransitGatewayRouteTableAttachmentRequest = {
      val __obj = js.Dynamic.literal(
        "PeeringId" -> PeeringId.asInstanceOf[js.Any],
        "TransitGatewayRouteTableArn" -> TransitGatewayRouteTableArn.asInstanceOf[js.Any]
      )

      ClientToken.foreach(__v => __obj.updateDynamic("ClientToken")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateTransitGatewayRouteTableAttachmentRequest]
    }
  }

  @js.native
  trait CreateTransitGatewayRouteTableAttachmentResponse extends js.Object {
    var TransitGatewayRouteTableAttachment: js.UndefOr[TransitGatewayRouteTableAttachment]
  }

  object CreateTransitGatewayRouteTableAttachmentResponse {
    @inline
    def apply(
        TransitGatewayRouteTableAttachment: js.UndefOr[TransitGatewayRouteTableAttachment] = js.undefined
    ): CreateTransitGatewayRouteTableAttachmentResponse = {
      val __obj = js.Dynamic.literal()
      TransitGatewayRouteTableAttachment.foreach(__v => __obj.updateDynamic("TransitGatewayRouteTableAttachment")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateTransitGatewayRouteTableAttachmentResponse]
    }
  }

  @js.native
  trait CreateVpcAttachmentRequest extends js.Object {
    var CoreNetworkId: CoreNetworkId
    var SubnetArns: SubnetArnList
    var VpcArn: VpcArn
    var ClientToken: js.UndefOr[ClientToken]
    var Options: js.UndefOr[VpcOptions]
    var Tags: js.UndefOr[TagList]
  }

  object CreateVpcAttachmentRequest {
    @inline
    def apply(
        CoreNetworkId: CoreNetworkId,
        SubnetArns: SubnetArnList,
        VpcArn: VpcArn,
        ClientToken: js.UndefOr[ClientToken] = js.undefined,
        Options: js.UndefOr[VpcOptions] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateVpcAttachmentRequest = {
      val __obj = js.Dynamic.literal(
        "CoreNetworkId" -> CoreNetworkId.asInstanceOf[js.Any],
        "SubnetArns" -> SubnetArns.asInstanceOf[js.Any],
        "VpcArn" -> VpcArn.asInstanceOf[js.Any]
      )

      ClientToken.foreach(__v => __obj.updateDynamic("ClientToken")(__v.asInstanceOf[js.Any]))
      Options.foreach(__v => __obj.updateDynamic("Options")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateVpcAttachmentRequest]
    }
  }

  @js.native
  trait CreateVpcAttachmentResponse extends js.Object {
    var VpcAttachment: js.UndefOr[VpcAttachment]
  }

  object CreateVpcAttachmentResponse {
    @inline
    def apply(
        VpcAttachment: js.UndefOr[VpcAttachment] = js.undefined
    ): CreateVpcAttachmentResponse = {
      val __obj = js.Dynamic.literal()
      VpcAttachment.foreach(__v => __obj.updateDynamic("VpcAttachment")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateVpcAttachmentResponse]
    }
  }

  /** Describes the association between a customer gateway, a device, and a link.
    */
  @js.native
  trait CustomerGatewayAssociation extends js.Object {
    var CustomerGatewayArn: js.UndefOr[CustomerGatewayArn]
    var DeviceId: js.UndefOr[DeviceId]
    var GlobalNetworkId: js.UndefOr[GlobalNetworkId]
    var LinkId: js.UndefOr[LinkId]
    var State: js.UndefOr[CustomerGatewayAssociationState]
  }

  object CustomerGatewayAssociation {
    @inline
    def apply(
        CustomerGatewayArn: js.UndefOr[CustomerGatewayArn] = js.undefined,
        DeviceId: js.UndefOr[DeviceId] = js.undefined,
        GlobalNetworkId: js.UndefOr[GlobalNetworkId] = js.undefined,
        LinkId: js.UndefOr[LinkId] = js.undefined,
        State: js.UndefOr[CustomerGatewayAssociationState] = js.undefined
    ): CustomerGatewayAssociation = {
      val __obj = js.Dynamic.literal()
      CustomerGatewayArn.foreach(__v => __obj.updateDynamic("CustomerGatewayArn")(__v.asInstanceOf[js.Any]))
      DeviceId.foreach(__v => __obj.updateDynamic("DeviceId")(__v.asInstanceOf[js.Any]))
      GlobalNetworkId.foreach(__v => __obj.updateDynamic("GlobalNetworkId")(__v.asInstanceOf[js.Any]))
      LinkId.foreach(__v => __obj.updateDynamic("LinkId")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CustomerGatewayAssociation]
    }
  }

  @js.native
  trait DeleteAttachmentRequest extends js.Object {
    var AttachmentId: AttachmentId
  }

  object DeleteAttachmentRequest {
    @inline
    def apply(
        AttachmentId: AttachmentId
    ): DeleteAttachmentRequest = {
      val __obj = js.Dynamic.literal(
        "AttachmentId" -> AttachmentId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteAttachmentRequest]
    }
  }

  @js.native
  trait DeleteAttachmentResponse extends js.Object {
    var Attachment: js.UndefOr[Attachment]
  }

  object DeleteAttachmentResponse {
    @inline
    def apply(
        Attachment: js.UndefOr[Attachment] = js.undefined
    ): DeleteAttachmentResponse = {
      val __obj = js.Dynamic.literal()
      Attachment.foreach(__v => __obj.updateDynamic("Attachment")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteAttachmentResponse]
    }
  }

  @js.native
  trait DeleteConnectPeerRequest extends js.Object {
    var ConnectPeerId: ConnectPeerId
  }

  object DeleteConnectPeerRequest {
    @inline
    def apply(
        ConnectPeerId: ConnectPeerId
    ): DeleteConnectPeerRequest = {
      val __obj = js.Dynamic.literal(
        "ConnectPeerId" -> ConnectPeerId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteConnectPeerRequest]
    }
  }

  @js.native
  trait DeleteConnectPeerResponse extends js.Object {
    var ConnectPeer: js.UndefOr[ConnectPeer]
  }

  object DeleteConnectPeerResponse {
    @inline
    def apply(
        ConnectPeer: js.UndefOr[ConnectPeer] = js.undefined
    ): DeleteConnectPeerResponse = {
      val __obj = js.Dynamic.literal()
      ConnectPeer.foreach(__v => __obj.updateDynamic("ConnectPeer")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteConnectPeerResponse]
    }
  }

  @js.native
  trait DeleteConnectionRequest extends js.Object {
    var ConnectionId: ConnectionId
    var GlobalNetworkId: GlobalNetworkId
  }

  object DeleteConnectionRequest {
    @inline
    def apply(
        ConnectionId: ConnectionId,
        GlobalNetworkId: GlobalNetworkId
    ): DeleteConnectionRequest = {
      val __obj = js.Dynamic.literal(
        "ConnectionId" -> ConnectionId.asInstanceOf[js.Any],
        "GlobalNetworkId" -> GlobalNetworkId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteConnectionRequest]
    }
  }

  @js.native
  trait DeleteConnectionResponse extends js.Object {
    var Connection: js.UndefOr[Connection]
  }

  object DeleteConnectionResponse {
    @inline
    def apply(
        Connection: js.UndefOr[Connection] = js.undefined
    ): DeleteConnectionResponse = {
      val __obj = js.Dynamic.literal()
      Connection.foreach(__v => __obj.updateDynamic("Connection")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteConnectionResponse]
    }
  }

  @js.native
  trait DeleteCoreNetworkPolicyVersionRequest extends js.Object {
    var CoreNetworkId: CoreNetworkId
    var PolicyVersionId: Int
  }

  object DeleteCoreNetworkPolicyVersionRequest {
    @inline
    def apply(
        CoreNetworkId: CoreNetworkId,
        PolicyVersionId: Int
    ): DeleteCoreNetworkPolicyVersionRequest = {
      val __obj = js.Dynamic.literal(
        "CoreNetworkId" -> CoreNetworkId.asInstanceOf[js.Any],
        "PolicyVersionId" -> PolicyVersionId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteCoreNetworkPolicyVersionRequest]
    }
  }

  @js.native
  trait DeleteCoreNetworkPolicyVersionResponse extends js.Object {
    var CoreNetworkPolicy: js.UndefOr[CoreNetworkPolicy]
  }

  object DeleteCoreNetworkPolicyVersionResponse {
    @inline
    def apply(
        CoreNetworkPolicy: js.UndefOr[CoreNetworkPolicy] = js.undefined
    ): DeleteCoreNetworkPolicyVersionResponse = {
      val __obj = js.Dynamic.literal()
      CoreNetworkPolicy.foreach(__v => __obj.updateDynamic("CoreNetworkPolicy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteCoreNetworkPolicyVersionResponse]
    }
  }

  @js.native
  trait DeleteCoreNetworkRequest extends js.Object {
    var CoreNetworkId: CoreNetworkId
  }

  object DeleteCoreNetworkRequest {
    @inline
    def apply(
        CoreNetworkId: CoreNetworkId
    ): DeleteCoreNetworkRequest = {
      val __obj = js.Dynamic.literal(
        "CoreNetworkId" -> CoreNetworkId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteCoreNetworkRequest]
    }
  }

  @js.native
  trait DeleteCoreNetworkResponse extends js.Object {
    var CoreNetwork: js.UndefOr[CoreNetwork]
  }

  object DeleteCoreNetworkResponse {
    @inline
    def apply(
        CoreNetwork: js.UndefOr[CoreNetwork] = js.undefined
    ): DeleteCoreNetworkResponse = {
      val __obj = js.Dynamic.literal()
      CoreNetwork.foreach(__v => __obj.updateDynamic("CoreNetwork")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteCoreNetworkResponse]
    }
  }

  @js.native
  trait DeleteDeviceRequest extends js.Object {
    var DeviceId: DeviceId
    var GlobalNetworkId: GlobalNetworkId
  }

  object DeleteDeviceRequest {
    @inline
    def apply(
        DeviceId: DeviceId,
        GlobalNetworkId: GlobalNetworkId
    ): DeleteDeviceRequest = {
      val __obj = js.Dynamic.literal(
        "DeviceId" -> DeviceId.asInstanceOf[js.Any],
        "GlobalNetworkId" -> GlobalNetworkId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteDeviceRequest]
    }
  }

  @js.native
  trait DeleteDeviceResponse extends js.Object {
    var Device: js.UndefOr[Device]
  }

  object DeleteDeviceResponse {
    @inline
    def apply(
        Device: js.UndefOr[Device] = js.undefined
    ): DeleteDeviceResponse = {
      val __obj = js.Dynamic.literal()
      Device.foreach(__v => __obj.updateDynamic("Device")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteDeviceResponse]
    }
  }

  @js.native
  trait DeleteGlobalNetworkRequest extends js.Object {
    var GlobalNetworkId: GlobalNetworkId
  }

  object DeleteGlobalNetworkRequest {
    @inline
    def apply(
        GlobalNetworkId: GlobalNetworkId
    ): DeleteGlobalNetworkRequest = {
      val __obj = js.Dynamic.literal(
        "GlobalNetworkId" -> GlobalNetworkId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteGlobalNetworkRequest]
    }
  }

  @js.native
  trait DeleteGlobalNetworkResponse extends js.Object {
    var GlobalNetwork: js.UndefOr[GlobalNetwork]
  }

  object DeleteGlobalNetworkResponse {
    @inline
    def apply(
        GlobalNetwork: js.UndefOr[GlobalNetwork] = js.undefined
    ): DeleteGlobalNetworkResponse = {
      val __obj = js.Dynamic.literal()
      GlobalNetwork.foreach(__v => __obj.updateDynamic("GlobalNetwork")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteGlobalNetworkResponse]
    }
  }

  @js.native
  trait DeleteLinkRequest extends js.Object {
    var GlobalNetworkId: GlobalNetworkId
    var LinkId: LinkId
  }

  object DeleteLinkRequest {
    @inline
    def apply(
        GlobalNetworkId: GlobalNetworkId,
        LinkId: LinkId
    ): DeleteLinkRequest = {
      val __obj = js.Dynamic.literal(
        "GlobalNetworkId" -> GlobalNetworkId.asInstanceOf[js.Any],
        "LinkId" -> LinkId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteLinkRequest]
    }
  }

  @js.native
  trait DeleteLinkResponse extends js.Object {
    var Link: js.UndefOr[Link]
  }

  object DeleteLinkResponse {
    @inline
    def apply(
        Link: js.UndefOr[Link] = js.undefined
    ): DeleteLinkResponse = {
      val __obj = js.Dynamic.literal()
      Link.foreach(__v => __obj.updateDynamic("Link")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteLinkResponse]
    }
  }

  @js.native
  trait DeletePeeringRequest extends js.Object {
    var PeeringId: PeeringId
  }

  object DeletePeeringRequest {
    @inline
    def apply(
        PeeringId: PeeringId
    ): DeletePeeringRequest = {
      val __obj = js.Dynamic.literal(
        "PeeringId" -> PeeringId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeletePeeringRequest]
    }
  }

  @js.native
  trait DeletePeeringResponse extends js.Object {
    var Peering: js.UndefOr[Peering]
  }

  object DeletePeeringResponse {
    @inline
    def apply(
        Peering: js.UndefOr[Peering] = js.undefined
    ): DeletePeeringResponse = {
      val __obj = js.Dynamic.literal()
      Peering.foreach(__v => __obj.updateDynamic("Peering")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeletePeeringResponse]
    }
  }

  @js.native
  trait DeleteResourcePolicyRequest extends js.Object {
    var ResourceArn: ResourceArn
  }

  object DeleteResourcePolicyRequest {
    @inline
    def apply(
        ResourceArn: ResourceArn
    ): DeleteResourcePolicyRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteResourcePolicyRequest]
    }
  }

  @js.native
  trait DeleteResourcePolicyResponse extends js.Object

  object DeleteResourcePolicyResponse {
    @inline
    def apply(): DeleteResourcePolicyResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteResourcePolicyResponse]
    }
  }

  @js.native
  trait DeleteSiteRequest extends js.Object {
    var GlobalNetworkId: GlobalNetworkId
    var SiteId: SiteId
  }

  object DeleteSiteRequest {
    @inline
    def apply(
        GlobalNetworkId: GlobalNetworkId,
        SiteId: SiteId
    ): DeleteSiteRequest = {
      val __obj = js.Dynamic.literal(
        "GlobalNetworkId" -> GlobalNetworkId.asInstanceOf[js.Any],
        "SiteId" -> SiteId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteSiteRequest]
    }
  }

  @js.native
  trait DeleteSiteResponse extends js.Object {
    var Site: js.UndefOr[Site]
  }

  object DeleteSiteResponse {
    @inline
    def apply(
        Site: js.UndefOr[Site] = js.undefined
    ): DeleteSiteResponse = {
      val __obj = js.Dynamic.literal()
      Site.foreach(__v => __obj.updateDynamic("Site")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteSiteResponse]
    }
  }

  @js.native
  trait DeregisterTransitGatewayRequest extends js.Object {
    var GlobalNetworkId: GlobalNetworkId
    var TransitGatewayArn: TransitGatewayArn
  }

  object DeregisterTransitGatewayRequest {
    @inline
    def apply(
        GlobalNetworkId: GlobalNetworkId,
        TransitGatewayArn: TransitGatewayArn
    ): DeregisterTransitGatewayRequest = {
      val __obj = js.Dynamic.literal(
        "GlobalNetworkId" -> GlobalNetworkId.asInstanceOf[js.Any],
        "TransitGatewayArn" -> TransitGatewayArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeregisterTransitGatewayRequest]
    }
  }

  @js.native
  trait DeregisterTransitGatewayResponse extends js.Object {
    var TransitGatewayRegistration: js.UndefOr[TransitGatewayRegistration]
  }

  object DeregisterTransitGatewayResponse {
    @inline
    def apply(
        TransitGatewayRegistration: js.UndefOr[TransitGatewayRegistration] = js.undefined
    ): DeregisterTransitGatewayResponse = {
      val __obj = js.Dynamic.literal()
      TransitGatewayRegistration.foreach(__v => __obj.updateDynamic("TransitGatewayRegistration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeregisterTransitGatewayResponse]
    }
  }

  @js.native
  trait DescribeGlobalNetworksRequest extends js.Object {
    var GlobalNetworkIds: js.UndefOr[GlobalNetworkIdList]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribeGlobalNetworksRequest {
    @inline
    def apply(
        GlobalNetworkIds: js.UndefOr[GlobalNetworkIdList] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeGlobalNetworksRequest = {
      val __obj = js.Dynamic.literal()
      GlobalNetworkIds.foreach(__v => __obj.updateDynamic("GlobalNetworkIds")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeGlobalNetworksRequest]
    }
  }

  @js.native
  trait DescribeGlobalNetworksResponse extends js.Object {
    var GlobalNetworks: js.UndefOr[GlobalNetworkList]
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribeGlobalNetworksResponse {
    @inline
    def apply(
        GlobalNetworks: js.UndefOr[GlobalNetworkList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeGlobalNetworksResponse = {
      val __obj = js.Dynamic.literal()
      GlobalNetworks.foreach(__v => __obj.updateDynamic("GlobalNetworks")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeGlobalNetworksResponse]
    }
  }

  /** Describes a device.
    */
  @js.native
  trait Device extends js.Object {
    var AWSLocation: js.UndefOr[AWSLocation]
    var CreatedAt: js.UndefOr[DateTime]
    var Description: js.UndefOr[ConstrainedString]
    var DeviceArn: js.UndefOr[DeviceArn]
    var DeviceId: js.UndefOr[DeviceId]
    var GlobalNetworkId: js.UndefOr[GlobalNetworkId]
    var Location: js.UndefOr[Location]
    var Model: js.UndefOr[ConstrainedString]
    var SerialNumber: js.UndefOr[ConstrainedString]
    var SiteId: js.UndefOr[SiteId]
    var State: js.UndefOr[DeviceState]
    var Tags: js.UndefOr[TagList]
    var Type: js.UndefOr[ConstrainedString]
    var Vendor: js.UndefOr[ConstrainedString]
  }

  object Device {
    @inline
    def apply(
        AWSLocation: js.UndefOr[AWSLocation] = js.undefined,
        CreatedAt: js.UndefOr[DateTime] = js.undefined,
        Description: js.UndefOr[ConstrainedString] = js.undefined,
        DeviceArn: js.UndefOr[DeviceArn] = js.undefined,
        DeviceId: js.UndefOr[DeviceId] = js.undefined,
        GlobalNetworkId: js.UndefOr[GlobalNetworkId] = js.undefined,
        Location: js.UndefOr[Location] = js.undefined,
        Model: js.UndefOr[ConstrainedString] = js.undefined,
        SerialNumber: js.UndefOr[ConstrainedString] = js.undefined,
        SiteId: js.UndefOr[SiteId] = js.undefined,
        State: js.UndefOr[DeviceState] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined,
        Type: js.UndefOr[ConstrainedString] = js.undefined,
        Vendor: js.UndefOr[ConstrainedString] = js.undefined
    ): Device = {
      val __obj = js.Dynamic.literal()
      AWSLocation.foreach(__v => __obj.updateDynamic("AWSLocation")(__v.asInstanceOf[js.Any]))
      CreatedAt.foreach(__v => __obj.updateDynamic("CreatedAt")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      DeviceArn.foreach(__v => __obj.updateDynamic("DeviceArn")(__v.asInstanceOf[js.Any]))
      DeviceId.foreach(__v => __obj.updateDynamic("DeviceId")(__v.asInstanceOf[js.Any]))
      GlobalNetworkId.foreach(__v => __obj.updateDynamic("GlobalNetworkId")(__v.asInstanceOf[js.Any]))
      Location.foreach(__v => __obj.updateDynamic("Location")(__v.asInstanceOf[js.Any]))
      Model.foreach(__v => __obj.updateDynamic("Model")(__v.asInstanceOf[js.Any]))
      SerialNumber.foreach(__v => __obj.updateDynamic("SerialNumber")(__v.asInstanceOf[js.Any]))
      SiteId.foreach(__v => __obj.updateDynamic("SiteId")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      Vendor.foreach(__v => __obj.updateDynamic("Vendor")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Device]
    }
  }

  @js.native
  trait DisassociateConnectPeerRequest extends js.Object {
    var ConnectPeerId: ConnectPeerId
    var GlobalNetworkId: GlobalNetworkId
  }

  object DisassociateConnectPeerRequest {
    @inline
    def apply(
        ConnectPeerId: ConnectPeerId,
        GlobalNetworkId: GlobalNetworkId
    ): DisassociateConnectPeerRequest = {
      val __obj = js.Dynamic.literal(
        "ConnectPeerId" -> ConnectPeerId.asInstanceOf[js.Any],
        "GlobalNetworkId" -> GlobalNetworkId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DisassociateConnectPeerRequest]
    }
  }

  @js.native
  trait DisassociateConnectPeerResponse extends js.Object {
    var ConnectPeerAssociation: js.UndefOr[ConnectPeerAssociation]
  }

  object DisassociateConnectPeerResponse {
    @inline
    def apply(
        ConnectPeerAssociation: js.UndefOr[ConnectPeerAssociation] = js.undefined
    ): DisassociateConnectPeerResponse = {
      val __obj = js.Dynamic.literal()
      ConnectPeerAssociation.foreach(__v => __obj.updateDynamic("ConnectPeerAssociation")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DisassociateConnectPeerResponse]
    }
  }

  @js.native
  trait DisassociateCustomerGatewayRequest extends js.Object {
    var CustomerGatewayArn: CustomerGatewayArn
    var GlobalNetworkId: GlobalNetworkId
  }

  object DisassociateCustomerGatewayRequest {
    @inline
    def apply(
        CustomerGatewayArn: CustomerGatewayArn,
        GlobalNetworkId: GlobalNetworkId
    ): DisassociateCustomerGatewayRequest = {
      val __obj = js.Dynamic.literal(
        "CustomerGatewayArn" -> CustomerGatewayArn.asInstanceOf[js.Any],
        "GlobalNetworkId" -> GlobalNetworkId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DisassociateCustomerGatewayRequest]
    }
  }

  @js.native
  trait DisassociateCustomerGatewayResponse extends js.Object {
    var CustomerGatewayAssociation: js.UndefOr[CustomerGatewayAssociation]
  }

  object DisassociateCustomerGatewayResponse {
    @inline
    def apply(
        CustomerGatewayAssociation: js.UndefOr[CustomerGatewayAssociation] = js.undefined
    ): DisassociateCustomerGatewayResponse = {
      val __obj = js.Dynamic.literal()
      CustomerGatewayAssociation.foreach(__v => __obj.updateDynamic("CustomerGatewayAssociation")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DisassociateCustomerGatewayResponse]
    }
  }

  @js.native
  trait DisassociateLinkRequest extends js.Object {
    var DeviceId: DeviceId
    var GlobalNetworkId: GlobalNetworkId
    var LinkId: LinkId
  }

  object DisassociateLinkRequest {
    @inline
    def apply(
        DeviceId: DeviceId,
        GlobalNetworkId: GlobalNetworkId,
        LinkId: LinkId
    ): DisassociateLinkRequest = {
      val __obj = js.Dynamic.literal(
        "DeviceId" -> DeviceId.asInstanceOf[js.Any],
        "GlobalNetworkId" -> GlobalNetworkId.asInstanceOf[js.Any],
        "LinkId" -> LinkId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DisassociateLinkRequest]
    }
  }

  @js.native
  trait DisassociateLinkResponse extends js.Object {
    var LinkAssociation: js.UndefOr[LinkAssociation]
  }

  object DisassociateLinkResponse {
    @inline
    def apply(
        LinkAssociation: js.UndefOr[LinkAssociation] = js.undefined
    ): DisassociateLinkResponse = {
      val __obj = js.Dynamic.literal()
      LinkAssociation.foreach(__v => __obj.updateDynamic("LinkAssociation")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DisassociateLinkResponse]
    }
  }

  @js.native
  trait DisassociateTransitGatewayConnectPeerRequest extends js.Object {
    var GlobalNetworkId: GlobalNetworkId
    var TransitGatewayConnectPeerArn: TransitGatewayConnectPeerArn
  }

  object DisassociateTransitGatewayConnectPeerRequest {
    @inline
    def apply(
        GlobalNetworkId: GlobalNetworkId,
        TransitGatewayConnectPeerArn: TransitGatewayConnectPeerArn
    ): DisassociateTransitGatewayConnectPeerRequest = {
      val __obj = js.Dynamic.literal(
        "GlobalNetworkId" -> GlobalNetworkId.asInstanceOf[js.Any],
        "TransitGatewayConnectPeerArn" -> TransitGatewayConnectPeerArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DisassociateTransitGatewayConnectPeerRequest]
    }
  }

  @js.native
  trait DisassociateTransitGatewayConnectPeerResponse extends js.Object {
    var TransitGatewayConnectPeerAssociation: js.UndefOr[TransitGatewayConnectPeerAssociation]
  }

  object DisassociateTransitGatewayConnectPeerResponse {
    @inline
    def apply(
        TransitGatewayConnectPeerAssociation: js.UndefOr[TransitGatewayConnectPeerAssociation] = js.undefined
    ): DisassociateTransitGatewayConnectPeerResponse = {
      val __obj = js.Dynamic.literal()
      TransitGatewayConnectPeerAssociation.foreach(__v => __obj.updateDynamic("TransitGatewayConnectPeerAssociation")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DisassociateTransitGatewayConnectPeerResponse]
    }
  }

  @js.native
  trait ExecuteCoreNetworkChangeSetRequest extends js.Object {
    var CoreNetworkId: CoreNetworkId
    var PolicyVersionId: Int
  }

  object ExecuteCoreNetworkChangeSetRequest {
    @inline
    def apply(
        CoreNetworkId: CoreNetworkId,
        PolicyVersionId: Int
    ): ExecuteCoreNetworkChangeSetRequest = {
      val __obj = js.Dynamic.literal(
        "CoreNetworkId" -> CoreNetworkId.asInstanceOf[js.Any],
        "PolicyVersionId" -> PolicyVersionId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ExecuteCoreNetworkChangeSetRequest]
    }
  }

  @js.native
  trait ExecuteCoreNetworkChangeSetResponse extends js.Object

  object ExecuteCoreNetworkChangeSetResponse {
    @inline
    def apply(): ExecuteCoreNetworkChangeSetResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExecuteCoreNetworkChangeSetResponse]
    }
  }

  @js.native
  trait GetConnectAttachmentRequest extends js.Object {
    var AttachmentId: AttachmentId
  }

  object GetConnectAttachmentRequest {
    @inline
    def apply(
        AttachmentId: AttachmentId
    ): GetConnectAttachmentRequest = {
      val __obj = js.Dynamic.literal(
        "AttachmentId" -> AttachmentId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetConnectAttachmentRequest]
    }
  }

  @js.native
  trait GetConnectAttachmentResponse extends js.Object {
    var ConnectAttachment: js.UndefOr[ConnectAttachment]
  }

  object GetConnectAttachmentResponse {
    @inline
    def apply(
        ConnectAttachment: js.UndefOr[ConnectAttachment] = js.undefined
    ): GetConnectAttachmentResponse = {
      val __obj = js.Dynamic.literal()
      ConnectAttachment.foreach(__v => __obj.updateDynamic("ConnectAttachment")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetConnectAttachmentResponse]
    }
  }

  @js.native
  trait GetConnectPeerAssociationsRequest extends js.Object {
    var GlobalNetworkId: GlobalNetworkId
    var ConnectPeerIds: js.UndefOr[ConnectPeerIdList]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object GetConnectPeerAssociationsRequest {
    @inline
    def apply(
        GlobalNetworkId: GlobalNetworkId,
        ConnectPeerIds: js.UndefOr[ConnectPeerIdList] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): GetConnectPeerAssociationsRequest = {
      val __obj = js.Dynamic.literal(
        "GlobalNetworkId" -> GlobalNetworkId.asInstanceOf[js.Any]
      )

      ConnectPeerIds.foreach(__v => __obj.updateDynamic("ConnectPeerIds")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetConnectPeerAssociationsRequest]
    }
  }

  @js.native
  trait GetConnectPeerAssociationsResponse extends js.Object {
    var ConnectPeerAssociations: js.UndefOr[ConnectPeerAssociationList]
    var NextToken: js.UndefOr[NextToken]
  }

  object GetConnectPeerAssociationsResponse {
    @inline
    def apply(
        ConnectPeerAssociations: js.UndefOr[ConnectPeerAssociationList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): GetConnectPeerAssociationsResponse = {
      val __obj = js.Dynamic.literal()
      ConnectPeerAssociations.foreach(__v => __obj.updateDynamic("ConnectPeerAssociations")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetConnectPeerAssociationsResponse]
    }
  }

  @js.native
  trait GetConnectPeerRequest extends js.Object {
    var ConnectPeerId: ConnectPeerId
  }

  object GetConnectPeerRequest {
    @inline
    def apply(
        ConnectPeerId: ConnectPeerId
    ): GetConnectPeerRequest = {
      val __obj = js.Dynamic.literal(
        "ConnectPeerId" -> ConnectPeerId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetConnectPeerRequest]
    }
  }

  @js.native
  trait GetConnectPeerResponse extends js.Object {
    var ConnectPeer: js.UndefOr[ConnectPeer]
  }

  object GetConnectPeerResponse {
    @inline
    def apply(
        ConnectPeer: js.UndefOr[ConnectPeer] = js.undefined
    ): GetConnectPeerResponse = {
      val __obj = js.Dynamic.literal()
      ConnectPeer.foreach(__v => __obj.updateDynamic("ConnectPeer")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetConnectPeerResponse]
    }
  }

  @js.native
  trait GetConnectionsRequest extends js.Object {
    var GlobalNetworkId: GlobalNetworkId
    var ConnectionIds: js.UndefOr[ConnectionIdList]
    var DeviceId: js.UndefOr[DeviceId]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object GetConnectionsRequest {
    @inline
    def apply(
        GlobalNetworkId: GlobalNetworkId,
        ConnectionIds: js.UndefOr[ConnectionIdList] = js.undefined,
        DeviceId: js.UndefOr[DeviceId] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): GetConnectionsRequest = {
      val __obj = js.Dynamic.literal(
        "GlobalNetworkId" -> GlobalNetworkId.asInstanceOf[js.Any]
      )

      ConnectionIds.foreach(__v => __obj.updateDynamic("ConnectionIds")(__v.asInstanceOf[js.Any]))
      DeviceId.foreach(__v => __obj.updateDynamic("DeviceId")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetConnectionsRequest]
    }
  }

  @js.native
  trait GetConnectionsResponse extends js.Object {
    var Connections: js.UndefOr[ConnectionList]
    var NextToken: js.UndefOr[NextToken]
  }

  object GetConnectionsResponse {
    @inline
    def apply(
        Connections: js.UndefOr[ConnectionList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): GetConnectionsResponse = {
      val __obj = js.Dynamic.literal()
      Connections.foreach(__v => __obj.updateDynamic("Connections")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetConnectionsResponse]
    }
  }

  @js.native
  trait GetCoreNetworkChangeEventsRequest extends js.Object {
    var CoreNetworkId: CoreNetworkId
    var PolicyVersionId: Int
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object GetCoreNetworkChangeEventsRequest {
    @inline
    def apply(
        CoreNetworkId: CoreNetworkId,
        PolicyVersionId: Int,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): GetCoreNetworkChangeEventsRequest = {
      val __obj = js.Dynamic.literal(
        "CoreNetworkId" -> CoreNetworkId.asInstanceOf[js.Any],
        "PolicyVersionId" -> PolicyVersionId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetCoreNetworkChangeEventsRequest]
    }
  }

  @js.native
  trait GetCoreNetworkChangeEventsResponse extends js.Object {
    var CoreNetworkChangeEvents: js.UndefOr[CoreNetworkChangeEventList]
    var NextToken: js.UndefOr[NextToken]
  }

  object GetCoreNetworkChangeEventsResponse {
    @inline
    def apply(
        CoreNetworkChangeEvents: js.UndefOr[CoreNetworkChangeEventList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): GetCoreNetworkChangeEventsResponse = {
      val __obj = js.Dynamic.literal()
      CoreNetworkChangeEvents.foreach(__v => __obj.updateDynamic("CoreNetworkChangeEvents")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetCoreNetworkChangeEventsResponse]
    }
  }

  @js.native
  trait GetCoreNetworkChangeSetRequest extends js.Object {
    var CoreNetworkId: CoreNetworkId
    var PolicyVersionId: Int
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object GetCoreNetworkChangeSetRequest {
    @inline
    def apply(
        CoreNetworkId: CoreNetworkId,
        PolicyVersionId: Int,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): GetCoreNetworkChangeSetRequest = {
      val __obj = js.Dynamic.literal(
        "CoreNetworkId" -> CoreNetworkId.asInstanceOf[js.Any],
        "PolicyVersionId" -> PolicyVersionId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetCoreNetworkChangeSetRequest]
    }
  }

  @js.native
  trait GetCoreNetworkChangeSetResponse extends js.Object {
    var CoreNetworkChanges: js.UndefOr[CoreNetworkChangeList]
    var NextToken: js.UndefOr[NextToken]
  }

  object GetCoreNetworkChangeSetResponse {
    @inline
    def apply(
        CoreNetworkChanges: js.UndefOr[CoreNetworkChangeList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): GetCoreNetworkChangeSetResponse = {
      val __obj = js.Dynamic.literal()
      CoreNetworkChanges.foreach(__v => __obj.updateDynamic("CoreNetworkChanges")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetCoreNetworkChangeSetResponse]
    }
  }

  @js.native
  trait GetCoreNetworkPolicyRequest extends js.Object {
    var CoreNetworkId: CoreNetworkId
    var Alias: js.UndefOr[CoreNetworkPolicyAlias]
    var PolicyVersionId: js.UndefOr[Int]
  }

  object GetCoreNetworkPolicyRequest {
    @inline
    def apply(
        CoreNetworkId: CoreNetworkId,
        Alias: js.UndefOr[CoreNetworkPolicyAlias] = js.undefined,
        PolicyVersionId: js.UndefOr[Int] = js.undefined
    ): GetCoreNetworkPolicyRequest = {
      val __obj = js.Dynamic.literal(
        "CoreNetworkId" -> CoreNetworkId.asInstanceOf[js.Any]
      )

      Alias.foreach(__v => __obj.updateDynamic("Alias")(__v.asInstanceOf[js.Any]))
      PolicyVersionId.foreach(__v => __obj.updateDynamic("PolicyVersionId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetCoreNetworkPolicyRequest]
    }
  }

  @js.native
  trait GetCoreNetworkPolicyResponse extends js.Object {
    var CoreNetworkPolicy: js.UndefOr[CoreNetworkPolicy]
  }

  object GetCoreNetworkPolicyResponse {
    @inline
    def apply(
        CoreNetworkPolicy: js.UndefOr[CoreNetworkPolicy] = js.undefined
    ): GetCoreNetworkPolicyResponse = {
      val __obj = js.Dynamic.literal()
      CoreNetworkPolicy.foreach(__v => __obj.updateDynamic("CoreNetworkPolicy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetCoreNetworkPolicyResponse]
    }
  }

  @js.native
  trait GetCoreNetworkRequest extends js.Object {
    var CoreNetworkId: CoreNetworkId
  }

  object GetCoreNetworkRequest {
    @inline
    def apply(
        CoreNetworkId: CoreNetworkId
    ): GetCoreNetworkRequest = {
      val __obj = js.Dynamic.literal(
        "CoreNetworkId" -> CoreNetworkId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetCoreNetworkRequest]
    }
  }

  @js.native
  trait GetCoreNetworkResponse extends js.Object {
    var CoreNetwork: js.UndefOr[CoreNetwork]
  }

  object GetCoreNetworkResponse {
    @inline
    def apply(
        CoreNetwork: js.UndefOr[CoreNetwork] = js.undefined
    ): GetCoreNetworkResponse = {
      val __obj = js.Dynamic.literal()
      CoreNetwork.foreach(__v => __obj.updateDynamic("CoreNetwork")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetCoreNetworkResponse]
    }
  }

  @js.native
  trait GetCustomerGatewayAssociationsRequest extends js.Object {
    var GlobalNetworkId: GlobalNetworkId
    var CustomerGatewayArns: js.UndefOr[CustomerGatewayArnList]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object GetCustomerGatewayAssociationsRequest {
    @inline
    def apply(
        GlobalNetworkId: GlobalNetworkId,
        CustomerGatewayArns: js.UndefOr[CustomerGatewayArnList] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): GetCustomerGatewayAssociationsRequest = {
      val __obj = js.Dynamic.literal(
        "GlobalNetworkId" -> GlobalNetworkId.asInstanceOf[js.Any]
      )

      CustomerGatewayArns.foreach(__v => __obj.updateDynamic("CustomerGatewayArns")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetCustomerGatewayAssociationsRequest]
    }
  }

  @js.native
  trait GetCustomerGatewayAssociationsResponse extends js.Object {
    var CustomerGatewayAssociations: js.UndefOr[CustomerGatewayAssociationList]
    var NextToken: js.UndefOr[NextToken]
  }

  object GetCustomerGatewayAssociationsResponse {
    @inline
    def apply(
        CustomerGatewayAssociations: js.UndefOr[CustomerGatewayAssociationList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): GetCustomerGatewayAssociationsResponse = {
      val __obj = js.Dynamic.literal()
      CustomerGatewayAssociations.foreach(__v => __obj.updateDynamic("CustomerGatewayAssociations")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetCustomerGatewayAssociationsResponse]
    }
  }

  @js.native
  trait GetDevicesRequest extends js.Object {
    var GlobalNetworkId: GlobalNetworkId
    var DeviceIds: js.UndefOr[DeviceIdList]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
    var SiteId: js.UndefOr[SiteId]
  }

  object GetDevicesRequest {
    @inline
    def apply(
        GlobalNetworkId: GlobalNetworkId,
        DeviceIds: js.UndefOr[DeviceIdList] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        SiteId: js.UndefOr[SiteId] = js.undefined
    ): GetDevicesRequest = {
      val __obj = js.Dynamic.literal(
        "GlobalNetworkId" -> GlobalNetworkId.asInstanceOf[js.Any]
      )

      DeviceIds.foreach(__v => __obj.updateDynamic("DeviceIds")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      SiteId.foreach(__v => __obj.updateDynamic("SiteId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDevicesRequest]
    }
  }

  @js.native
  trait GetDevicesResponse extends js.Object {
    var Devices: js.UndefOr[DeviceList]
    var NextToken: js.UndefOr[NextToken]
  }

  object GetDevicesResponse {
    @inline
    def apply(
        Devices: js.UndefOr[DeviceList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): GetDevicesResponse = {
      val __obj = js.Dynamic.literal()
      Devices.foreach(__v => __obj.updateDynamic("Devices")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDevicesResponse]
    }
  }

  @js.native
  trait GetLinkAssociationsRequest extends js.Object {
    var GlobalNetworkId: GlobalNetworkId
    var DeviceId: js.UndefOr[DeviceId]
    var LinkId: js.UndefOr[LinkId]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object GetLinkAssociationsRequest {
    @inline
    def apply(
        GlobalNetworkId: GlobalNetworkId,
        DeviceId: js.UndefOr[DeviceId] = js.undefined,
        LinkId: js.UndefOr[LinkId] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): GetLinkAssociationsRequest = {
      val __obj = js.Dynamic.literal(
        "GlobalNetworkId" -> GlobalNetworkId.asInstanceOf[js.Any]
      )

      DeviceId.foreach(__v => __obj.updateDynamic("DeviceId")(__v.asInstanceOf[js.Any]))
      LinkId.foreach(__v => __obj.updateDynamic("LinkId")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetLinkAssociationsRequest]
    }
  }

  @js.native
  trait GetLinkAssociationsResponse extends js.Object {
    var LinkAssociations: js.UndefOr[LinkAssociationList]
    var NextToken: js.UndefOr[NextToken]
  }

  object GetLinkAssociationsResponse {
    @inline
    def apply(
        LinkAssociations: js.UndefOr[LinkAssociationList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): GetLinkAssociationsResponse = {
      val __obj = js.Dynamic.literal()
      LinkAssociations.foreach(__v => __obj.updateDynamic("LinkAssociations")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetLinkAssociationsResponse]
    }
  }

  @js.native
  trait GetLinksRequest extends js.Object {
    var GlobalNetworkId: GlobalNetworkId
    var LinkIds: js.UndefOr[LinkIdList]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
    var Provider: js.UndefOr[ConstrainedString]
    var SiteId: js.UndefOr[SiteId]
    var Type: js.UndefOr[ConstrainedString]
  }

  object GetLinksRequest {
    @inline
    def apply(
        GlobalNetworkId: GlobalNetworkId,
        LinkIds: js.UndefOr[LinkIdList] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        Provider: js.UndefOr[ConstrainedString] = js.undefined,
        SiteId: js.UndefOr[SiteId] = js.undefined,
        Type: js.UndefOr[ConstrainedString] = js.undefined
    ): GetLinksRequest = {
      val __obj = js.Dynamic.literal(
        "GlobalNetworkId" -> GlobalNetworkId.asInstanceOf[js.Any]
      )

      LinkIds.foreach(__v => __obj.updateDynamic("LinkIds")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Provider.foreach(__v => __obj.updateDynamic("Provider")(__v.asInstanceOf[js.Any]))
      SiteId.foreach(__v => __obj.updateDynamic("SiteId")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetLinksRequest]
    }
  }

  @js.native
  trait GetLinksResponse extends js.Object {
    var Links: js.UndefOr[LinkList]
    var NextToken: js.UndefOr[NextToken]
  }

  object GetLinksResponse {
    @inline
    def apply(
        Links: js.UndefOr[LinkList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): GetLinksResponse = {
      val __obj = js.Dynamic.literal()
      Links.foreach(__v => __obj.updateDynamic("Links")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetLinksResponse]
    }
  }

  @js.native
  trait GetNetworkResourceCountsRequest extends js.Object {
    var GlobalNetworkId: GlobalNetworkId
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
    var ResourceType: js.UndefOr[ConstrainedString]
  }

  object GetNetworkResourceCountsRequest {
    @inline
    def apply(
        GlobalNetworkId: GlobalNetworkId,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        ResourceType: js.UndefOr[ConstrainedString] = js.undefined
    ): GetNetworkResourceCountsRequest = {
      val __obj = js.Dynamic.literal(
        "GlobalNetworkId" -> GlobalNetworkId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      ResourceType.foreach(__v => __obj.updateDynamic("ResourceType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetNetworkResourceCountsRequest]
    }
  }

  @js.native
  trait GetNetworkResourceCountsResponse extends js.Object {
    var NetworkResourceCounts: js.UndefOr[NetworkResourceCountList]
    var NextToken: js.UndefOr[NextToken]
  }

  object GetNetworkResourceCountsResponse {
    @inline
    def apply(
        NetworkResourceCounts: js.UndefOr[NetworkResourceCountList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): GetNetworkResourceCountsResponse = {
      val __obj = js.Dynamic.literal()
      NetworkResourceCounts.foreach(__v => __obj.updateDynamic("NetworkResourceCounts")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetNetworkResourceCountsResponse]
    }
  }

  @js.native
  trait GetNetworkResourceRelationshipsRequest extends js.Object {
    var GlobalNetworkId: GlobalNetworkId
    var AccountId: js.UndefOr[AWSAccountId]
    var AwsRegion: js.UndefOr[ExternalRegionCode]
    var CoreNetworkId: js.UndefOr[CoreNetworkId]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
    var RegisteredGatewayArn: js.UndefOr[ResourceArn]
    var ResourceArn: js.UndefOr[ResourceArn]
    var ResourceType: js.UndefOr[ConstrainedString]
  }

  object GetNetworkResourceRelationshipsRequest {
    @inline
    def apply(
        GlobalNetworkId: GlobalNetworkId,
        AccountId: js.UndefOr[AWSAccountId] = js.undefined,
        AwsRegion: js.UndefOr[ExternalRegionCode] = js.undefined,
        CoreNetworkId: js.UndefOr[CoreNetworkId] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        RegisteredGatewayArn: js.UndefOr[ResourceArn] = js.undefined,
        ResourceArn: js.UndefOr[ResourceArn] = js.undefined,
        ResourceType: js.UndefOr[ConstrainedString] = js.undefined
    ): GetNetworkResourceRelationshipsRequest = {
      val __obj = js.Dynamic.literal(
        "GlobalNetworkId" -> GlobalNetworkId.asInstanceOf[js.Any]
      )

      AccountId.foreach(__v => __obj.updateDynamic("AccountId")(__v.asInstanceOf[js.Any]))
      AwsRegion.foreach(__v => __obj.updateDynamic("AwsRegion")(__v.asInstanceOf[js.Any]))
      CoreNetworkId.foreach(__v => __obj.updateDynamic("CoreNetworkId")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      RegisteredGatewayArn.foreach(__v => __obj.updateDynamic("RegisteredGatewayArn")(__v.asInstanceOf[js.Any]))
      ResourceArn.foreach(__v => __obj.updateDynamic("ResourceArn")(__v.asInstanceOf[js.Any]))
      ResourceType.foreach(__v => __obj.updateDynamic("ResourceType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetNetworkResourceRelationshipsRequest]
    }
  }

  @js.native
  trait GetNetworkResourceRelationshipsResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Relationships: js.UndefOr[RelationshipList]
  }

  object GetNetworkResourceRelationshipsResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        Relationships: js.UndefOr[RelationshipList] = js.undefined
    ): GetNetworkResourceRelationshipsResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Relationships.foreach(__v => __obj.updateDynamic("Relationships")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetNetworkResourceRelationshipsResponse]
    }
  }

  @js.native
  trait GetNetworkResourcesRequest extends js.Object {
    var GlobalNetworkId: GlobalNetworkId
    var AccountId: js.UndefOr[AWSAccountId]
    var AwsRegion: js.UndefOr[ExternalRegionCode]
    var CoreNetworkId: js.UndefOr[CoreNetworkId]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
    var RegisteredGatewayArn: js.UndefOr[ResourceArn]
    var ResourceArn: js.UndefOr[ResourceArn]
    var ResourceType: js.UndefOr[ConstrainedString]
  }

  object GetNetworkResourcesRequest {
    @inline
    def apply(
        GlobalNetworkId: GlobalNetworkId,
        AccountId: js.UndefOr[AWSAccountId] = js.undefined,
        AwsRegion: js.UndefOr[ExternalRegionCode] = js.undefined,
        CoreNetworkId: js.UndefOr[CoreNetworkId] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        RegisteredGatewayArn: js.UndefOr[ResourceArn] = js.undefined,
        ResourceArn: js.UndefOr[ResourceArn] = js.undefined,
        ResourceType: js.UndefOr[ConstrainedString] = js.undefined
    ): GetNetworkResourcesRequest = {
      val __obj = js.Dynamic.literal(
        "GlobalNetworkId" -> GlobalNetworkId.asInstanceOf[js.Any]
      )

      AccountId.foreach(__v => __obj.updateDynamic("AccountId")(__v.asInstanceOf[js.Any]))
      AwsRegion.foreach(__v => __obj.updateDynamic("AwsRegion")(__v.asInstanceOf[js.Any]))
      CoreNetworkId.foreach(__v => __obj.updateDynamic("CoreNetworkId")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      RegisteredGatewayArn.foreach(__v => __obj.updateDynamic("RegisteredGatewayArn")(__v.asInstanceOf[js.Any]))
      ResourceArn.foreach(__v => __obj.updateDynamic("ResourceArn")(__v.asInstanceOf[js.Any]))
      ResourceType.foreach(__v => __obj.updateDynamic("ResourceType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetNetworkResourcesRequest]
    }
  }

  @js.native
  trait GetNetworkResourcesResponse extends js.Object {
    var NetworkResources: js.UndefOr[NetworkResourceList]
    var NextToken: js.UndefOr[NextToken]
  }

  object GetNetworkResourcesResponse {
    @inline
    def apply(
        NetworkResources: js.UndefOr[NetworkResourceList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): GetNetworkResourcesResponse = {
      val __obj = js.Dynamic.literal()
      NetworkResources.foreach(__v => __obj.updateDynamic("NetworkResources")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetNetworkResourcesResponse]
    }
  }

  @js.native
  trait GetNetworkRoutesRequest extends js.Object {
    var GlobalNetworkId: GlobalNetworkId
    var RouteTableIdentifier: RouteTableIdentifier
    var DestinationFilters: js.UndefOr[FilterMap]
    var ExactCidrMatches: js.UndefOr[ConstrainedStringList]
    var LongestPrefixMatches: js.UndefOr[ConstrainedStringList]
    var PrefixListIds: js.UndefOr[ConstrainedStringList]
    var States: js.UndefOr[RouteStateList]
    var SubnetOfMatches: js.UndefOr[ConstrainedStringList]
    var SupernetOfMatches: js.UndefOr[ConstrainedStringList]
    var Types: js.UndefOr[RouteTypeList]
  }

  object GetNetworkRoutesRequest {
    @inline
    def apply(
        GlobalNetworkId: GlobalNetworkId,
        RouteTableIdentifier: RouteTableIdentifier,
        DestinationFilters: js.UndefOr[FilterMap] = js.undefined,
        ExactCidrMatches: js.UndefOr[ConstrainedStringList] = js.undefined,
        LongestPrefixMatches: js.UndefOr[ConstrainedStringList] = js.undefined,
        PrefixListIds: js.UndefOr[ConstrainedStringList] = js.undefined,
        States: js.UndefOr[RouteStateList] = js.undefined,
        SubnetOfMatches: js.UndefOr[ConstrainedStringList] = js.undefined,
        SupernetOfMatches: js.UndefOr[ConstrainedStringList] = js.undefined,
        Types: js.UndefOr[RouteTypeList] = js.undefined
    ): GetNetworkRoutesRequest = {
      val __obj = js.Dynamic.literal(
        "GlobalNetworkId" -> GlobalNetworkId.asInstanceOf[js.Any],
        "RouteTableIdentifier" -> RouteTableIdentifier.asInstanceOf[js.Any]
      )

      DestinationFilters.foreach(__v => __obj.updateDynamic("DestinationFilters")(__v.asInstanceOf[js.Any]))
      ExactCidrMatches.foreach(__v => __obj.updateDynamic("ExactCidrMatches")(__v.asInstanceOf[js.Any]))
      LongestPrefixMatches.foreach(__v => __obj.updateDynamic("LongestPrefixMatches")(__v.asInstanceOf[js.Any]))
      PrefixListIds.foreach(__v => __obj.updateDynamic("PrefixListIds")(__v.asInstanceOf[js.Any]))
      States.foreach(__v => __obj.updateDynamic("States")(__v.asInstanceOf[js.Any]))
      SubnetOfMatches.foreach(__v => __obj.updateDynamic("SubnetOfMatches")(__v.asInstanceOf[js.Any]))
      SupernetOfMatches.foreach(__v => __obj.updateDynamic("SupernetOfMatches")(__v.asInstanceOf[js.Any]))
      Types.foreach(__v => __obj.updateDynamic("Types")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetNetworkRoutesRequest]
    }
  }

  @js.native
  trait GetNetworkRoutesResponse extends js.Object {
    var CoreNetworkSegmentEdge: js.UndefOr[CoreNetworkSegmentEdgeIdentifier]
    var NetworkRoutes: js.UndefOr[NetworkRouteList]
    var RouteTableArn: js.UndefOr[ResourceArn]
    var RouteTableTimestamp: js.UndefOr[DateTime]
    var RouteTableType: js.UndefOr[RouteTableType]
  }

  object GetNetworkRoutesResponse {
    @inline
    def apply(
        CoreNetworkSegmentEdge: js.UndefOr[CoreNetworkSegmentEdgeIdentifier] = js.undefined,
        NetworkRoutes: js.UndefOr[NetworkRouteList] = js.undefined,
        RouteTableArn: js.UndefOr[ResourceArn] = js.undefined,
        RouteTableTimestamp: js.UndefOr[DateTime] = js.undefined,
        RouteTableType: js.UndefOr[RouteTableType] = js.undefined
    ): GetNetworkRoutesResponse = {
      val __obj = js.Dynamic.literal()
      CoreNetworkSegmentEdge.foreach(__v => __obj.updateDynamic("CoreNetworkSegmentEdge")(__v.asInstanceOf[js.Any]))
      NetworkRoutes.foreach(__v => __obj.updateDynamic("NetworkRoutes")(__v.asInstanceOf[js.Any]))
      RouteTableArn.foreach(__v => __obj.updateDynamic("RouteTableArn")(__v.asInstanceOf[js.Any]))
      RouteTableTimestamp.foreach(__v => __obj.updateDynamic("RouteTableTimestamp")(__v.asInstanceOf[js.Any]))
      RouteTableType.foreach(__v => __obj.updateDynamic("RouteTableType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetNetworkRoutesResponse]
    }
  }

  @js.native
  trait GetNetworkTelemetryRequest extends js.Object {
    var GlobalNetworkId: GlobalNetworkId
    var AccountId: js.UndefOr[AWSAccountId]
    var AwsRegion: js.UndefOr[ExternalRegionCode]
    var CoreNetworkId: js.UndefOr[CoreNetworkId]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
    var RegisteredGatewayArn: js.UndefOr[ResourceArn]
    var ResourceArn: js.UndefOr[ResourceArn]
    var ResourceType: js.UndefOr[ConstrainedString]
  }

  object GetNetworkTelemetryRequest {
    @inline
    def apply(
        GlobalNetworkId: GlobalNetworkId,
        AccountId: js.UndefOr[AWSAccountId] = js.undefined,
        AwsRegion: js.UndefOr[ExternalRegionCode] = js.undefined,
        CoreNetworkId: js.UndefOr[CoreNetworkId] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        RegisteredGatewayArn: js.UndefOr[ResourceArn] = js.undefined,
        ResourceArn: js.UndefOr[ResourceArn] = js.undefined,
        ResourceType: js.UndefOr[ConstrainedString] = js.undefined
    ): GetNetworkTelemetryRequest = {
      val __obj = js.Dynamic.literal(
        "GlobalNetworkId" -> GlobalNetworkId.asInstanceOf[js.Any]
      )

      AccountId.foreach(__v => __obj.updateDynamic("AccountId")(__v.asInstanceOf[js.Any]))
      AwsRegion.foreach(__v => __obj.updateDynamic("AwsRegion")(__v.asInstanceOf[js.Any]))
      CoreNetworkId.foreach(__v => __obj.updateDynamic("CoreNetworkId")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      RegisteredGatewayArn.foreach(__v => __obj.updateDynamic("RegisteredGatewayArn")(__v.asInstanceOf[js.Any]))
      ResourceArn.foreach(__v => __obj.updateDynamic("ResourceArn")(__v.asInstanceOf[js.Any]))
      ResourceType.foreach(__v => __obj.updateDynamic("ResourceType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetNetworkTelemetryRequest]
    }
  }

  @js.native
  trait GetNetworkTelemetryResponse extends js.Object {
    var NetworkTelemetry: js.UndefOr[NetworkTelemetryList]
    var NextToken: js.UndefOr[NextToken]
  }

  object GetNetworkTelemetryResponse {
    @inline
    def apply(
        NetworkTelemetry: js.UndefOr[NetworkTelemetryList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): GetNetworkTelemetryResponse = {
      val __obj = js.Dynamic.literal()
      NetworkTelemetry.foreach(__v => __obj.updateDynamic("NetworkTelemetry")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetNetworkTelemetryResponse]
    }
  }

  @js.native
  trait GetResourcePolicyRequest extends js.Object {
    var ResourceArn: ResourceArn
  }

  object GetResourcePolicyRequest {
    @inline
    def apply(
        ResourceArn: ResourceArn
    ): GetResourcePolicyRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetResourcePolicyRequest]
    }
  }

  @js.native
  trait GetResourcePolicyResponse extends js.Object {
    var PolicyDocument: js.UndefOr[ResourcePolicyDocument]
  }

  object GetResourcePolicyResponse {
    @inline
    def apply(
        PolicyDocument: js.UndefOr[ResourcePolicyDocument] = js.undefined
    ): GetResourcePolicyResponse = {
      val __obj = js.Dynamic.literal()
      PolicyDocument.foreach(__v => __obj.updateDynamic("PolicyDocument")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetResourcePolicyResponse]
    }
  }

  @js.native
  trait GetRouteAnalysisRequest extends js.Object {
    var GlobalNetworkId: GlobalNetworkId
    var RouteAnalysisId: ConstrainedString
  }

  object GetRouteAnalysisRequest {
    @inline
    def apply(
        GlobalNetworkId: GlobalNetworkId,
        RouteAnalysisId: ConstrainedString
    ): GetRouteAnalysisRequest = {
      val __obj = js.Dynamic.literal(
        "GlobalNetworkId" -> GlobalNetworkId.asInstanceOf[js.Any],
        "RouteAnalysisId" -> RouteAnalysisId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetRouteAnalysisRequest]
    }
  }

  @js.native
  trait GetRouteAnalysisResponse extends js.Object {
    var RouteAnalysis: js.UndefOr[RouteAnalysis]
  }

  object GetRouteAnalysisResponse {
    @inline
    def apply(
        RouteAnalysis: js.UndefOr[RouteAnalysis] = js.undefined
    ): GetRouteAnalysisResponse = {
      val __obj = js.Dynamic.literal()
      RouteAnalysis.foreach(__v => __obj.updateDynamic("RouteAnalysis")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetRouteAnalysisResponse]
    }
  }

  @js.native
  trait GetSiteToSiteVpnAttachmentRequest extends js.Object {
    var AttachmentId: AttachmentId
  }

  object GetSiteToSiteVpnAttachmentRequest {
    @inline
    def apply(
        AttachmentId: AttachmentId
    ): GetSiteToSiteVpnAttachmentRequest = {
      val __obj = js.Dynamic.literal(
        "AttachmentId" -> AttachmentId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetSiteToSiteVpnAttachmentRequest]
    }
  }

  @js.native
  trait GetSiteToSiteVpnAttachmentResponse extends js.Object {
    var SiteToSiteVpnAttachment: js.UndefOr[SiteToSiteVpnAttachment]
  }

  object GetSiteToSiteVpnAttachmentResponse {
    @inline
    def apply(
        SiteToSiteVpnAttachment: js.UndefOr[SiteToSiteVpnAttachment] = js.undefined
    ): GetSiteToSiteVpnAttachmentResponse = {
      val __obj = js.Dynamic.literal()
      SiteToSiteVpnAttachment.foreach(__v => __obj.updateDynamic("SiteToSiteVpnAttachment")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetSiteToSiteVpnAttachmentResponse]
    }
  }

  @js.native
  trait GetSitesRequest extends js.Object {
    var GlobalNetworkId: GlobalNetworkId
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
    var SiteIds: js.UndefOr[SiteIdList]
  }

  object GetSitesRequest {
    @inline
    def apply(
        GlobalNetworkId: GlobalNetworkId,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        SiteIds: js.UndefOr[SiteIdList] = js.undefined
    ): GetSitesRequest = {
      val __obj = js.Dynamic.literal(
        "GlobalNetworkId" -> GlobalNetworkId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      SiteIds.foreach(__v => __obj.updateDynamic("SiteIds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetSitesRequest]
    }
  }

  @js.native
  trait GetSitesResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Sites: js.UndefOr[SiteList]
  }

  object GetSitesResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        Sites: js.UndefOr[SiteList] = js.undefined
    ): GetSitesResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Sites.foreach(__v => __obj.updateDynamic("Sites")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetSitesResponse]
    }
  }

  @js.native
  trait GetTransitGatewayConnectPeerAssociationsRequest extends js.Object {
    var GlobalNetworkId: GlobalNetworkId
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
    var TransitGatewayConnectPeerArns: js.UndefOr[TransitGatewayConnectPeerArnList]
  }

  object GetTransitGatewayConnectPeerAssociationsRequest {
    @inline
    def apply(
        GlobalNetworkId: GlobalNetworkId,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        TransitGatewayConnectPeerArns: js.UndefOr[TransitGatewayConnectPeerArnList] = js.undefined
    ): GetTransitGatewayConnectPeerAssociationsRequest = {
      val __obj = js.Dynamic.literal(
        "GlobalNetworkId" -> GlobalNetworkId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      TransitGatewayConnectPeerArns.foreach(__v => __obj.updateDynamic("TransitGatewayConnectPeerArns")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetTransitGatewayConnectPeerAssociationsRequest]
    }
  }

  @js.native
  trait GetTransitGatewayConnectPeerAssociationsResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var TransitGatewayConnectPeerAssociations: js.UndefOr[TransitGatewayConnectPeerAssociationList]
  }

  object GetTransitGatewayConnectPeerAssociationsResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        TransitGatewayConnectPeerAssociations: js.UndefOr[TransitGatewayConnectPeerAssociationList] = js.undefined
    ): GetTransitGatewayConnectPeerAssociationsResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      TransitGatewayConnectPeerAssociations.foreach(__v => __obj.updateDynamic("TransitGatewayConnectPeerAssociations")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetTransitGatewayConnectPeerAssociationsResponse]
    }
  }

  @js.native
  trait GetTransitGatewayPeeringRequest extends js.Object {
    var PeeringId: PeeringId
  }

  object GetTransitGatewayPeeringRequest {
    @inline
    def apply(
        PeeringId: PeeringId
    ): GetTransitGatewayPeeringRequest = {
      val __obj = js.Dynamic.literal(
        "PeeringId" -> PeeringId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetTransitGatewayPeeringRequest]
    }
  }

  @js.native
  trait GetTransitGatewayPeeringResponse extends js.Object {
    var TransitGatewayPeering: js.UndefOr[TransitGatewayPeering]
  }

  object GetTransitGatewayPeeringResponse {
    @inline
    def apply(
        TransitGatewayPeering: js.UndefOr[TransitGatewayPeering] = js.undefined
    ): GetTransitGatewayPeeringResponse = {
      val __obj = js.Dynamic.literal()
      TransitGatewayPeering.foreach(__v => __obj.updateDynamic("TransitGatewayPeering")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetTransitGatewayPeeringResponse]
    }
  }

  @js.native
  trait GetTransitGatewayRegistrationsRequest extends js.Object {
    var GlobalNetworkId: GlobalNetworkId
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
    var TransitGatewayArns: js.UndefOr[TransitGatewayArnList]
  }

  object GetTransitGatewayRegistrationsRequest {
    @inline
    def apply(
        GlobalNetworkId: GlobalNetworkId,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        TransitGatewayArns: js.UndefOr[TransitGatewayArnList] = js.undefined
    ): GetTransitGatewayRegistrationsRequest = {
      val __obj = js.Dynamic.literal(
        "GlobalNetworkId" -> GlobalNetworkId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      TransitGatewayArns.foreach(__v => __obj.updateDynamic("TransitGatewayArns")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetTransitGatewayRegistrationsRequest]
    }
  }

  @js.native
  trait GetTransitGatewayRegistrationsResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var TransitGatewayRegistrations: js.UndefOr[TransitGatewayRegistrationList]
  }

  object GetTransitGatewayRegistrationsResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        TransitGatewayRegistrations: js.UndefOr[TransitGatewayRegistrationList] = js.undefined
    ): GetTransitGatewayRegistrationsResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      TransitGatewayRegistrations.foreach(__v => __obj.updateDynamic("TransitGatewayRegistrations")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetTransitGatewayRegistrationsResponse]
    }
  }

  @js.native
  trait GetTransitGatewayRouteTableAttachmentRequest extends js.Object {
    var AttachmentId: AttachmentId
  }

  object GetTransitGatewayRouteTableAttachmentRequest {
    @inline
    def apply(
        AttachmentId: AttachmentId
    ): GetTransitGatewayRouteTableAttachmentRequest = {
      val __obj = js.Dynamic.literal(
        "AttachmentId" -> AttachmentId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetTransitGatewayRouteTableAttachmentRequest]
    }
  }

  @js.native
  trait GetTransitGatewayRouteTableAttachmentResponse extends js.Object {
    var TransitGatewayRouteTableAttachment: js.UndefOr[TransitGatewayRouteTableAttachment]
  }

  object GetTransitGatewayRouteTableAttachmentResponse {
    @inline
    def apply(
        TransitGatewayRouteTableAttachment: js.UndefOr[TransitGatewayRouteTableAttachment] = js.undefined
    ): GetTransitGatewayRouteTableAttachmentResponse = {
      val __obj = js.Dynamic.literal()
      TransitGatewayRouteTableAttachment.foreach(__v => __obj.updateDynamic("TransitGatewayRouteTableAttachment")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetTransitGatewayRouteTableAttachmentResponse]
    }
  }

  @js.native
  trait GetVpcAttachmentRequest extends js.Object {
    var AttachmentId: AttachmentId
  }

  object GetVpcAttachmentRequest {
    @inline
    def apply(
        AttachmentId: AttachmentId
    ): GetVpcAttachmentRequest = {
      val __obj = js.Dynamic.literal(
        "AttachmentId" -> AttachmentId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetVpcAttachmentRequest]
    }
  }

  @js.native
  trait GetVpcAttachmentResponse extends js.Object {
    var VpcAttachment: js.UndefOr[VpcAttachment]
  }

  object GetVpcAttachmentResponse {
    @inline
    def apply(
        VpcAttachment: js.UndefOr[VpcAttachment] = js.undefined
    ): GetVpcAttachmentResponse = {
      val __obj = js.Dynamic.literal()
      VpcAttachment.foreach(__v => __obj.updateDynamic("VpcAttachment")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetVpcAttachmentResponse]
    }
  }

  /** Describes a global network. This is a single private network acting as a high-level container for your network objects, including an Amazon Web Services-managed Core Network.
    */
  @js.native
  trait GlobalNetwork extends js.Object {
    var CreatedAt: js.UndefOr[DateTime]
    var Description: js.UndefOr[ConstrainedString]
    var GlobalNetworkArn: js.UndefOr[GlobalNetworkArn]
    var GlobalNetworkId: js.UndefOr[GlobalNetworkId]
    var State: js.UndefOr[GlobalNetworkState]
    var Tags: js.UndefOr[TagList]
  }

  object GlobalNetwork {
    @inline
    def apply(
        CreatedAt: js.UndefOr[DateTime] = js.undefined,
        Description: js.UndefOr[ConstrainedString] = js.undefined,
        GlobalNetworkArn: js.UndefOr[GlobalNetworkArn] = js.undefined,
        GlobalNetworkId: js.UndefOr[GlobalNetworkId] = js.undefined,
        State: js.UndefOr[GlobalNetworkState] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): GlobalNetwork = {
      val __obj = js.Dynamic.literal()
      CreatedAt.foreach(__v => __obj.updateDynamic("CreatedAt")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      GlobalNetworkArn.foreach(__v => __obj.updateDynamic("GlobalNetworkArn")(__v.asInstanceOf[js.Any]))
      GlobalNetworkId.foreach(__v => __obj.updateDynamic("GlobalNetworkId")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GlobalNetwork]
    }
  }

  /** Describes a link.
    */
  @js.native
  trait Link extends js.Object {
    var Bandwidth: js.UndefOr[Bandwidth]
    var CreatedAt: js.UndefOr[DateTime]
    var Description: js.UndefOr[ConstrainedString]
    var GlobalNetworkId: js.UndefOr[GlobalNetworkId]
    var LinkArn: js.UndefOr[LinkArn]
    var LinkId: js.UndefOr[LinkId]
    var Provider: js.UndefOr[ConstrainedString]
    var SiteId: js.UndefOr[SiteId]
    var State: js.UndefOr[LinkState]
    var Tags: js.UndefOr[TagList]
    var Type: js.UndefOr[ConstrainedString]
  }

  object Link {
    @inline
    def apply(
        Bandwidth: js.UndefOr[Bandwidth] = js.undefined,
        CreatedAt: js.UndefOr[DateTime] = js.undefined,
        Description: js.UndefOr[ConstrainedString] = js.undefined,
        GlobalNetworkId: js.UndefOr[GlobalNetworkId] = js.undefined,
        LinkArn: js.UndefOr[LinkArn] = js.undefined,
        LinkId: js.UndefOr[LinkId] = js.undefined,
        Provider: js.UndefOr[ConstrainedString] = js.undefined,
        SiteId: js.UndefOr[SiteId] = js.undefined,
        State: js.UndefOr[LinkState] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined,
        Type: js.UndefOr[ConstrainedString] = js.undefined
    ): Link = {
      val __obj = js.Dynamic.literal()
      Bandwidth.foreach(__v => __obj.updateDynamic("Bandwidth")(__v.asInstanceOf[js.Any]))
      CreatedAt.foreach(__v => __obj.updateDynamic("CreatedAt")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      GlobalNetworkId.foreach(__v => __obj.updateDynamic("GlobalNetworkId")(__v.asInstanceOf[js.Any]))
      LinkArn.foreach(__v => __obj.updateDynamic("LinkArn")(__v.asInstanceOf[js.Any]))
      LinkId.foreach(__v => __obj.updateDynamic("LinkId")(__v.asInstanceOf[js.Any]))
      Provider.foreach(__v => __obj.updateDynamic("Provider")(__v.asInstanceOf[js.Any]))
      SiteId.foreach(__v => __obj.updateDynamic("SiteId")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Link]
    }
  }

  /** Describes the association between a device and a link.
    */
  @js.native
  trait LinkAssociation extends js.Object {
    var DeviceId: js.UndefOr[DeviceId]
    var GlobalNetworkId: js.UndefOr[GlobalNetworkId]
    var LinkAssociationState: js.UndefOr[LinkAssociationState]
    var LinkId: js.UndefOr[LinkId]
  }

  object LinkAssociation {
    @inline
    def apply(
        DeviceId: js.UndefOr[DeviceId] = js.undefined,
        GlobalNetworkId: js.UndefOr[GlobalNetworkId] = js.undefined,
        LinkAssociationState: js.UndefOr[LinkAssociationState] = js.undefined,
        LinkId: js.UndefOr[LinkId] = js.undefined
    ): LinkAssociation = {
      val __obj = js.Dynamic.literal()
      DeviceId.foreach(__v => __obj.updateDynamic("DeviceId")(__v.asInstanceOf[js.Any]))
      GlobalNetworkId.foreach(__v => __obj.updateDynamic("GlobalNetworkId")(__v.asInstanceOf[js.Any]))
      LinkAssociationState.foreach(__v => __obj.updateDynamic("LinkAssociationState")(__v.asInstanceOf[js.Any]))
      LinkId.foreach(__v => __obj.updateDynamic("LinkId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LinkAssociation]
    }
  }

  @js.native
  trait ListAttachmentsRequest extends js.Object {
    var AttachmentType: js.UndefOr[AttachmentType]
    var CoreNetworkId: js.UndefOr[CoreNetworkId]
    var EdgeLocation: js.UndefOr[ExternalRegionCode]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
    var State: js.UndefOr[AttachmentState]
  }

  object ListAttachmentsRequest {
    @inline
    def apply(
        AttachmentType: js.UndefOr[AttachmentType] = js.undefined,
        CoreNetworkId: js.UndefOr[CoreNetworkId] = js.undefined,
        EdgeLocation: js.UndefOr[ExternalRegionCode] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        State: js.UndefOr[AttachmentState] = js.undefined
    ): ListAttachmentsRequest = {
      val __obj = js.Dynamic.literal()
      AttachmentType.foreach(__v => __obj.updateDynamic("AttachmentType")(__v.asInstanceOf[js.Any]))
      CoreNetworkId.foreach(__v => __obj.updateDynamic("CoreNetworkId")(__v.asInstanceOf[js.Any]))
      EdgeLocation.foreach(__v => __obj.updateDynamic("EdgeLocation")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAttachmentsRequest]
    }
  }

  @js.native
  trait ListAttachmentsResponse extends js.Object {
    var Attachments: js.UndefOr[AttachmentList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListAttachmentsResponse {
    @inline
    def apply(
        Attachments: js.UndefOr[AttachmentList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListAttachmentsResponse = {
      val __obj = js.Dynamic.literal()
      Attachments.foreach(__v => __obj.updateDynamic("Attachments")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAttachmentsResponse]
    }
  }

  @js.native
  trait ListConnectPeersRequest extends js.Object {
    var ConnectAttachmentId: js.UndefOr[AttachmentId]
    var CoreNetworkId: js.UndefOr[CoreNetworkId]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListConnectPeersRequest {
    @inline
    def apply(
        ConnectAttachmentId: js.UndefOr[AttachmentId] = js.undefined,
        CoreNetworkId: js.UndefOr[CoreNetworkId] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListConnectPeersRequest = {
      val __obj = js.Dynamic.literal()
      ConnectAttachmentId.foreach(__v => __obj.updateDynamic("ConnectAttachmentId")(__v.asInstanceOf[js.Any]))
      CoreNetworkId.foreach(__v => __obj.updateDynamic("CoreNetworkId")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListConnectPeersRequest]
    }
  }

  @js.native
  trait ListConnectPeersResponse extends js.Object {
    var ConnectPeers: js.UndefOr[ConnectPeerSummaryList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListConnectPeersResponse {
    @inline
    def apply(
        ConnectPeers: js.UndefOr[ConnectPeerSummaryList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListConnectPeersResponse = {
      val __obj = js.Dynamic.literal()
      ConnectPeers.foreach(__v => __obj.updateDynamic("ConnectPeers")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListConnectPeersResponse]
    }
  }

  @js.native
  trait ListCoreNetworkPolicyVersionsRequest extends js.Object {
    var CoreNetworkId: CoreNetworkId
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListCoreNetworkPolicyVersionsRequest {
    @inline
    def apply(
        CoreNetworkId: CoreNetworkId,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListCoreNetworkPolicyVersionsRequest = {
      val __obj = js.Dynamic.literal(
        "CoreNetworkId" -> CoreNetworkId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListCoreNetworkPolicyVersionsRequest]
    }
  }

  @js.native
  trait ListCoreNetworkPolicyVersionsResponse extends js.Object {
    var CoreNetworkPolicyVersions: js.UndefOr[CoreNetworkPolicyVersionList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListCoreNetworkPolicyVersionsResponse {
    @inline
    def apply(
        CoreNetworkPolicyVersions: js.UndefOr[CoreNetworkPolicyVersionList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListCoreNetworkPolicyVersionsResponse = {
      val __obj = js.Dynamic.literal()
      CoreNetworkPolicyVersions.foreach(__v => __obj.updateDynamic("CoreNetworkPolicyVersions")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListCoreNetworkPolicyVersionsResponse]
    }
  }

  @js.native
  trait ListCoreNetworksRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListCoreNetworksRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListCoreNetworksRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListCoreNetworksRequest]
    }
  }

  @js.native
  trait ListCoreNetworksResponse extends js.Object {
    var CoreNetworks: js.UndefOr[CoreNetworkSummaryList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListCoreNetworksResponse {
    @inline
    def apply(
        CoreNetworks: js.UndefOr[CoreNetworkSummaryList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListCoreNetworksResponse = {
      val __obj = js.Dynamic.literal()
      CoreNetworks.foreach(__v => __obj.updateDynamic("CoreNetworks")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListCoreNetworksResponse]
    }
  }

  @js.native
  trait ListOrganizationServiceAccessStatusRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListOrganizationServiceAccessStatusRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListOrganizationServiceAccessStatusRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListOrganizationServiceAccessStatusRequest]
    }
  }

  @js.native
  trait ListOrganizationServiceAccessStatusResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var OrganizationStatus: js.UndefOr[OrganizationStatus]
  }

  object ListOrganizationServiceAccessStatusResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        OrganizationStatus: js.UndefOr[OrganizationStatus] = js.undefined
    ): ListOrganizationServiceAccessStatusResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      OrganizationStatus.foreach(__v => __obj.updateDynamic("OrganizationStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListOrganizationServiceAccessStatusResponse]
    }
  }

  @js.native
  trait ListPeeringsRequest extends js.Object {
    var CoreNetworkId: js.UndefOr[CoreNetworkId]
    var EdgeLocation: js.UndefOr[ExternalRegionCode]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
    var PeeringType: js.UndefOr[PeeringType]
    var State: js.UndefOr[PeeringState]
  }

  object ListPeeringsRequest {
    @inline
    def apply(
        CoreNetworkId: js.UndefOr[CoreNetworkId] = js.undefined,
        EdgeLocation: js.UndefOr[ExternalRegionCode] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        PeeringType: js.UndefOr[PeeringType] = js.undefined,
        State: js.UndefOr[PeeringState] = js.undefined
    ): ListPeeringsRequest = {
      val __obj = js.Dynamic.literal()
      CoreNetworkId.foreach(__v => __obj.updateDynamic("CoreNetworkId")(__v.asInstanceOf[js.Any]))
      EdgeLocation.foreach(__v => __obj.updateDynamic("EdgeLocation")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      PeeringType.foreach(__v => __obj.updateDynamic("PeeringType")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPeeringsRequest]
    }
  }

  @js.native
  trait ListPeeringsResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Peerings: js.UndefOr[PeeringList]
  }

  object ListPeeringsResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        Peerings: js.UndefOr[PeeringList] = js.undefined
    ): ListPeeringsResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Peerings.foreach(__v => __obj.updateDynamic("Peerings")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPeeringsResponse]
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
    var TagList: js.UndefOr[TagList]
  }

  object ListTagsForResourceResponse {
    @inline
    def apply(
        TagList: js.UndefOr[TagList] = js.undefined
    ): ListTagsForResourceResponse = {
      val __obj = js.Dynamic.literal()
      TagList.foreach(__v => __obj.updateDynamic("TagList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceResponse]
    }
  }

  /** Describes a location.
    */
  @js.native
  trait Location extends js.Object {
    var Address: js.UndefOr[ConstrainedString]
    var Latitude: js.UndefOr[ConstrainedString]
    var Longitude: js.UndefOr[ConstrainedString]
  }

  object Location {
    @inline
    def apply(
        Address: js.UndefOr[ConstrainedString] = js.undefined,
        Latitude: js.UndefOr[ConstrainedString] = js.undefined,
        Longitude: js.UndefOr[ConstrainedString] = js.undefined
    ): Location = {
      val __obj = js.Dynamic.literal()
      Address.foreach(__v => __obj.updateDynamic("Address")(__v.asInstanceOf[js.Any]))
      Latitude.foreach(__v => __obj.updateDynamic("Latitude")(__v.asInstanceOf[js.Any]))
      Longitude.foreach(__v => __obj.updateDynamic("Longitude")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Location]
    }
  }

  /** Describes a network resource.
    */
  @js.native
  trait NetworkResource extends js.Object {
    var AccountId: js.UndefOr[AWSAccountId]
    var AwsRegion: js.UndefOr[ExternalRegionCode]
    var CoreNetworkId: js.UndefOr[CoreNetworkId]
    var Definition: js.UndefOr[ConstrainedString]
    var DefinitionTimestamp: js.UndefOr[DateTime]
    var Metadata: js.UndefOr[NetworkResourceMetadataMap]
    var RegisteredGatewayArn: js.UndefOr[ResourceArn]
    var ResourceArn: js.UndefOr[ResourceArn]
    var ResourceId: js.UndefOr[ConstrainedString]
    var ResourceType: js.UndefOr[ConstrainedString]
    var Tags: js.UndefOr[TagList]
  }

  object NetworkResource {
    @inline
    def apply(
        AccountId: js.UndefOr[AWSAccountId] = js.undefined,
        AwsRegion: js.UndefOr[ExternalRegionCode] = js.undefined,
        CoreNetworkId: js.UndefOr[CoreNetworkId] = js.undefined,
        Definition: js.UndefOr[ConstrainedString] = js.undefined,
        DefinitionTimestamp: js.UndefOr[DateTime] = js.undefined,
        Metadata: js.UndefOr[NetworkResourceMetadataMap] = js.undefined,
        RegisteredGatewayArn: js.UndefOr[ResourceArn] = js.undefined,
        ResourceArn: js.UndefOr[ResourceArn] = js.undefined,
        ResourceId: js.UndefOr[ConstrainedString] = js.undefined,
        ResourceType: js.UndefOr[ConstrainedString] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): NetworkResource = {
      val __obj = js.Dynamic.literal()
      AccountId.foreach(__v => __obj.updateDynamic("AccountId")(__v.asInstanceOf[js.Any]))
      AwsRegion.foreach(__v => __obj.updateDynamic("AwsRegion")(__v.asInstanceOf[js.Any]))
      CoreNetworkId.foreach(__v => __obj.updateDynamic("CoreNetworkId")(__v.asInstanceOf[js.Any]))
      Definition.foreach(__v => __obj.updateDynamic("Definition")(__v.asInstanceOf[js.Any]))
      DefinitionTimestamp.foreach(__v => __obj.updateDynamic("DefinitionTimestamp")(__v.asInstanceOf[js.Any]))
      Metadata.foreach(__v => __obj.updateDynamic("Metadata")(__v.asInstanceOf[js.Any]))
      RegisteredGatewayArn.foreach(__v => __obj.updateDynamic("RegisteredGatewayArn")(__v.asInstanceOf[js.Any]))
      ResourceArn.foreach(__v => __obj.updateDynamic("ResourceArn")(__v.asInstanceOf[js.Any]))
      ResourceId.foreach(__v => __obj.updateDynamic("ResourceId")(__v.asInstanceOf[js.Any]))
      ResourceType.foreach(__v => __obj.updateDynamic("ResourceType")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NetworkResource]
    }
  }

  /** Describes a resource count.
    */
  @js.native
  trait NetworkResourceCount extends js.Object {
    var Count: js.UndefOr[Int]
    var ResourceType: js.UndefOr[ConstrainedString]
  }

  object NetworkResourceCount {
    @inline
    def apply(
        Count: js.UndefOr[Int] = js.undefined,
        ResourceType: js.UndefOr[ConstrainedString] = js.undefined
    ): NetworkResourceCount = {
      val __obj = js.Dynamic.literal()
      Count.foreach(__v => __obj.updateDynamic("Count")(__v.asInstanceOf[js.Any]))
      ResourceType.foreach(__v => __obj.updateDynamic("ResourceType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NetworkResourceCount]
    }
  }

  /** Describes a network resource.
    */
  @js.native
  trait NetworkResourceSummary extends js.Object {
    var Definition: js.UndefOr[ConstrainedString]
    var IsMiddlebox: js.UndefOr[Boolean]
    var NameTag: js.UndefOr[ConstrainedString]
    var RegisteredGatewayArn: js.UndefOr[ResourceArn]
    var ResourceArn: js.UndefOr[ResourceArn]
    var ResourceType: js.UndefOr[ConstrainedString]
  }

  object NetworkResourceSummary {
    @inline
    def apply(
        Definition: js.UndefOr[ConstrainedString] = js.undefined,
        IsMiddlebox: js.UndefOr[Boolean] = js.undefined,
        NameTag: js.UndefOr[ConstrainedString] = js.undefined,
        RegisteredGatewayArn: js.UndefOr[ResourceArn] = js.undefined,
        ResourceArn: js.UndefOr[ResourceArn] = js.undefined,
        ResourceType: js.UndefOr[ConstrainedString] = js.undefined
    ): NetworkResourceSummary = {
      val __obj = js.Dynamic.literal()
      Definition.foreach(__v => __obj.updateDynamic("Definition")(__v.asInstanceOf[js.Any]))
      IsMiddlebox.foreach(__v => __obj.updateDynamic("IsMiddlebox")(__v.asInstanceOf[js.Any]))
      NameTag.foreach(__v => __obj.updateDynamic("NameTag")(__v.asInstanceOf[js.Any]))
      RegisteredGatewayArn.foreach(__v => __obj.updateDynamic("RegisteredGatewayArn")(__v.asInstanceOf[js.Any]))
      ResourceArn.foreach(__v => __obj.updateDynamic("ResourceArn")(__v.asInstanceOf[js.Any]))
      ResourceType.foreach(__v => __obj.updateDynamic("ResourceType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NetworkResourceSummary]
    }
  }

  /** Describes a network route.
    */
  @js.native
  trait NetworkRoute extends js.Object {
    var DestinationCidrBlock: js.UndefOr[ConstrainedString]
    var Destinations: js.UndefOr[NetworkRouteDestinationList]
    var PrefixListId: js.UndefOr[ConstrainedString]
    var State: js.UndefOr[RouteState]
    var Type: js.UndefOr[RouteType]
  }

  object NetworkRoute {
    @inline
    def apply(
        DestinationCidrBlock: js.UndefOr[ConstrainedString] = js.undefined,
        Destinations: js.UndefOr[NetworkRouteDestinationList] = js.undefined,
        PrefixListId: js.UndefOr[ConstrainedString] = js.undefined,
        State: js.UndefOr[RouteState] = js.undefined,
        Type: js.UndefOr[RouteType] = js.undefined
    ): NetworkRoute = {
      val __obj = js.Dynamic.literal()
      DestinationCidrBlock.foreach(__v => __obj.updateDynamic("DestinationCidrBlock")(__v.asInstanceOf[js.Any]))
      Destinations.foreach(__v => __obj.updateDynamic("Destinations")(__v.asInstanceOf[js.Any]))
      PrefixListId.foreach(__v => __obj.updateDynamic("PrefixListId")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NetworkRoute]
    }
  }

  /** Describes the destination of a network route.
    */
  @js.native
  trait NetworkRouteDestination extends js.Object {
    var CoreNetworkAttachmentId: js.UndefOr[AttachmentId]
    var EdgeLocation: js.UndefOr[ExternalRegionCode]
    var ResourceId: js.UndefOr[ConstrainedString]
    var ResourceType: js.UndefOr[ConstrainedString]
    var SegmentName: js.UndefOr[ConstrainedString]
    var TransitGatewayAttachmentId: js.UndefOr[TransitGatewayAttachmentId]
  }

  object NetworkRouteDestination {
    @inline
    def apply(
        CoreNetworkAttachmentId: js.UndefOr[AttachmentId] = js.undefined,
        EdgeLocation: js.UndefOr[ExternalRegionCode] = js.undefined,
        ResourceId: js.UndefOr[ConstrainedString] = js.undefined,
        ResourceType: js.UndefOr[ConstrainedString] = js.undefined,
        SegmentName: js.UndefOr[ConstrainedString] = js.undefined,
        TransitGatewayAttachmentId: js.UndefOr[TransitGatewayAttachmentId] = js.undefined
    ): NetworkRouteDestination = {
      val __obj = js.Dynamic.literal()
      CoreNetworkAttachmentId.foreach(__v => __obj.updateDynamic("CoreNetworkAttachmentId")(__v.asInstanceOf[js.Any]))
      EdgeLocation.foreach(__v => __obj.updateDynamic("EdgeLocation")(__v.asInstanceOf[js.Any]))
      ResourceId.foreach(__v => __obj.updateDynamic("ResourceId")(__v.asInstanceOf[js.Any]))
      ResourceType.foreach(__v => __obj.updateDynamic("ResourceType")(__v.asInstanceOf[js.Any]))
      SegmentName.foreach(__v => __obj.updateDynamic("SegmentName")(__v.asInstanceOf[js.Any]))
      TransitGatewayAttachmentId.foreach(__v => __obj.updateDynamic("TransitGatewayAttachmentId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NetworkRouteDestination]
    }
  }

  /** Describes the telemetry information for a resource.
    */
  @js.native
  trait NetworkTelemetry extends js.Object {
    var AccountId: js.UndefOr[AWSAccountId]
    var Address: js.UndefOr[ConstrainedString]
    var AwsRegion: js.UndefOr[ExternalRegionCode]
    var CoreNetworkId: js.UndefOr[CoreNetworkId]
    var Health: js.UndefOr[ConnectionHealth]
    var RegisteredGatewayArn: js.UndefOr[ResourceArn]
    var ResourceArn: js.UndefOr[ResourceArn]
    var ResourceId: js.UndefOr[ConstrainedString]
    var ResourceType: js.UndefOr[ConstrainedString]
  }

  object NetworkTelemetry {
    @inline
    def apply(
        AccountId: js.UndefOr[AWSAccountId] = js.undefined,
        Address: js.UndefOr[ConstrainedString] = js.undefined,
        AwsRegion: js.UndefOr[ExternalRegionCode] = js.undefined,
        CoreNetworkId: js.UndefOr[CoreNetworkId] = js.undefined,
        Health: js.UndefOr[ConnectionHealth] = js.undefined,
        RegisteredGatewayArn: js.UndefOr[ResourceArn] = js.undefined,
        ResourceArn: js.UndefOr[ResourceArn] = js.undefined,
        ResourceId: js.UndefOr[ConstrainedString] = js.undefined,
        ResourceType: js.UndefOr[ConstrainedString] = js.undefined
    ): NetworkTelemetry = {
      val __obj = js.Dynamic.literal()
      AccountId.foreach(__v => __obj.updateDynamic("AccountId")(__v.asInstanceOf[js.Any]))
      Address.foreach(__v => __obj.updateDynamic("Address")(__v.asInstanceOf[js.Any]))
      AwsRegion.foreach(__v => __obj.updateDynamic("AwsRegion")(__v.asInstanceOf[js.Any]))
      CoreNetworkId.foreach(__v => __obj.updateDynamic("CoreNetworkId")(__v.asInstanceOf[js.Any]))
      Health.foreach(__v => __obj.updateDynamic("Health")(__v.asInstanceOf[js.Any]))
      RegisteredGatewayArn.foreach(__v => __obj.updateDynamic("RegisteredGatewayArn")(__v.asInstanceOf[js.Any]))
      ResourceArn.foreach(__v => __obj.updateDynamic("ResourceArn")(__v.asInstanceOf[js.Any]))
      ResourceId.foreach(__v => __obj.updateDynamic("ResourceId")(__v.asInstanceOf[js.Any]))
      ResourceType.foreach(__v => __obj.updateDynamic("ResourceType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NetworkTelemetry]
    }
  }

  /** The status of an Amazon Web Services Organization and the accounts within that organization.
    */
  @js.native
  trait OrganizationStatus extends js.Object {
    var AccountStatusList: js.UndefOr[AccountStatusList]
    var OrganizationAwsServiceAccessStatus: js.UndefOr[OrganizationAwsServiceAccessStatus]
    var OrganizationId: js.UndefOr[OrganizationId]
    var SLRDeploymentStatus: js.UndefOr[SLRDeploymentStatus]
  }

  object OrganizationStatus {
    @inline
    def apply(
        AccountStatusList: js.UndefOr[AccountStatusList] = js.undefined,
        OrganizationAwsServiceAccessStatus: js.UndefOr[OrganizationAwsServiceAccessStatus] = js.undefined,
        OrganizationId: js.UndefOr[OrganizationId] = js.undefined,
        SLRDeploymentStatus: js.UndefOr[SLRDeploymentStatus] = js.undefined
    ): OrganizationStatus = {
      val __obj = js.Dynamic.literal()
      AccountStatusList.foreach(__v => __obj.updateDynamic("AccountStatusList")(__v.asInstanceOf[js.Any]))
      OrganizationAwsServiceAccessStatus.foreach(__v => __obj.updateDynamic("OrganizationAwsServiceAccessStatus")(__v.asInstanceOf[js.Any]))
      OrganizationId.foreach(__v => __obj.updateDynamic("OrganizationId")(__v.asInstanceOf[js.Any]))
      SLRDeploymentStatus.foreach(__v => __obj.updateDynamic("SLRDeploymentStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OrganizationStatus]
    }
  }

  /** Describes a path component.
    */
  @js.native
  trait PathComponent extends js.Object {
    var DestinationCidrBlock: js.UndefOr[ConstrainedString]
    var Resource: js.UndefOr[NetworkResourceSummary]
    var Sequence: js.UndefOr[Int]
  }

  object PathComponent {
    @inline
    def apply(
        DestinationCidrBlock: js.UndefOr[ConstrainedString] = js.undefined,
        Resource: js.UndefOr[NetworkResourceSummary] = js.undefined,
        Sequence: js.UndefOr[Int] = js.undefined
    ): PathComponent = {
      val __obj = js.Dynamic.literal()
      DestinationCidrBlock.foreach(__v => __obj.updateDynamic("DestinationCidrBlock")(__v.asInstanceOf[js.Any]))
      Resource.foreach(__v => __obj.updateDynamic("Resource")(__v.asInstanceOf[js.Any]))
      Sequence.foreach(__v => __obj.updateDynamic("Sequence")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PathComponent]
    }
  }

  /** Describes a peering connection.
    */
  @js.native
  trait Peering extends js.Object {
    var CoreNetworkArn: js.UndefOr[CoreNetworkArn]
    var CoreNetworkId: js.UndefOr[CoreNetworkId]
    var CreatedAt: js.UndefOr[DateTime]
    var EdgeLocation: js.UndefOr[ExternalRegionCode]
    var OwnerAccountId: js.UndefOr[AWSAccountId]
    var PeeringId: js.UndefOr[PeeringId]
    var PeeringType: js.UndefOr[PeeringType]
    var ResourceArn: js.UndefOr[ResourceArn]
    var State: js.UndefOr[PeeringState]
    var Tags: js.UndefOr[TagList]
  }

  object Peering {
    @inline
    def apply(
        CoreNetworkArn: js.UndefOr[CoreNetworkArn] = js.undefined,
        CoreNetworkId: js.UndefOr[CoreNetworkId] = js.undefined,
        CreatedAt: js.UndefOr[DateTime] = js.undefined,
        EdgeLocation: js.UndefOr[ExternalRegionCode] = js.undefined,
        OwnerAccountId: js.UndefOr[AWSAccountId] = js.undefined,
        PeeringId: js.UndefOr[PeeringId] = js.undefined,
        PeeringType: js.UndefOr[PeeringType] = js.undefined,
        ResourceArn: js.UndefOr[ResourceArn] = js.undefined,
        State: js.UndefOr[PeeringState] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): Peering = {
      val __obj = js.Dynamic.literal()
      CoreNetworkArn.foreach(__v => __obj.updateDynamic("CoreNetworkArn")(__v.asInstanceOf[js.Any]))
      CoreNetworkId.foreach(__v => __obj.updateDynamic("CoreNetworkId")(__v.asInstanceOf[js.Any]))
      CreatedAt.foreach(__v => __obj.updateDynamic("CreatedAt")(__v.asInstanceOf[js.Any]))
      EdgeLocation.foreach(__v => __obj.updateDynamic("EdgeLocation")(__v.asInstanceOf[js.Any]))
      OwnerAccountId.foreach(__v => __obj.updateDynamic("OwnerAccountId")(__v.asInstanceOf[js.Any]))
      PeeringId.foreach(__v => __obj.updateDynamic("PeeringId")(__v.asInstanceOf[js.Any]))
      PeeringType.foreach(__v => __obj.updateDynamic("PeeringType")(__v.asInstanceOf[js.Any]))
      ResourceArn.foreach(__v => __obj.updateDynamic("ResourceArn")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Peering]
    }
  }

  /** Describes a proposed segment change. In some cases, the segment change must first be evaluated and accepted.
    */
  @js.native
  trait ProposedSegmentChange extends js.Object {
    var AttachmentPolicyRuleNumber: js.UndefOr[Int]
    var SegmentName: js.UndefOr[ConstrainedString]
    var Tags: js.UndefOr[TagList]
  }

  object ProposedSegmentChange {
    @inline
    def apply(
        AttachmentPolicyRuleNumber: js.UndefOr[Int] = js.undefined,
        SegmentName: js.UndefOr[ConstrainedString] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): ProposedSegmentChange = {
      val __obj = js.Dynamic.literal()
      AttachmentPolicyRuleNumber.foreach(__v => __obj.updateDynamic("AttachmentPolicyRuleNumber")(__v.asInstanceOf[js.Any]))
      SegmentName.foreach(__v => __obj.updateDynamic("SegmentName")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ProposedSegmentChange]
    }
  }

  @js.native
  trait PutCoreNetworkPolicyRequest extends js.Object {
    var CoreNetworkId: CoreNetworkId
    var PolicyDocument: CoreNetworkPolicyDocument
    var ClientToken: js.UndefOr[ClientToken]
    var Description: js.UndefOr[ConstrainedString]
    var LatestVersionId: js.UndefOr[Int]
  }

  object PutCoreNetworkPolicyRequest {
    @inline
    def apply(
        CoreNetworkId: CoreNetworkId,
        PolicyDocument: CoreNetworkPolicyDocument,
        ClientToken: js.UndefOr[ClientToken] = js.undefined,
        Description: js.UndefOr[ConstrainedString] = js.undefined,
        LatestVersionId: js.UndefOr[Int] = js.undefined
    ): PutCoreNetworkPolicyRequest = {
      val __obj = js.Dynamic.literal(
        "CoreNetworkId" -> CoreNetworkId.asInstanceOf[js.Any],
        "PolicyDocument" -> PolicyDocument.asInstanceOf[js.Any]
      )

      ClientToken.foreach(__v => __obj.updateDynamic("ClientToken")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      LatestVersionId.foreach(__v => __obj.updateDynamic("LatestVersionId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutCoreNetworkPolicyRequest]
    }
  }

  @js.native
  trait PutCoreNetworkPolicyResponse extends js.Object {
    var CoreNetworkPolicy: js.UndefOr[CoreNetworkPolicy]
  }

  object PutCoreNetworkPolicyResponse {
    @inline
    def apply(
        CoreNetworkPolicy: js.UndefOr[CoreNetworkPolicy] = js.undefined
    ): PutCoreNetworkPolicyResponse = {
      val __obj = js.Dynamic.literal()
      CoreNetworkPolicy.foreach(__v => __obj.updateDynamic("CoreNetworkPolicy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutCoreNetworkPolicyResponse]
    }
  }

  @js.native
  trait PutResourcePolicyRequest extends js.Object {
    var PolicyDocument: ResourcePolicyDocument
    var ResourceArn: ResourceArn
  }

  object PutResourcePolicyRequest {
    @inline
    def apply(
        PolicyDocument: ResourcePolicyDocument,
        ResourceArn: ResourceArn
    ): PutResourcePolicyRequest = {
      val __obj = js.Dynamic.literal(
        "PolicyDocument" -> PolicyDocument.asInstanceOf[js.Any],
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[PutResourcePolicyRequest]
    }
  }

  @js.native
  trait PutResourcePolicyResponse extends js.Object

  object PutResourcePolicyResponse {
    @inline
    def apply(): PutResourcePolicyResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PutResourcePolicyResponse]
    }
  }

  @js.native
  trait RegisterTransitGatewayRequest extends js.Object {
    var GlobalNetworkId: GlobalNetworkId
    var TransitGatewayArn: TransitGatewayArn
  }

  object RegisterTransitGatewayRequest {
    @inline
    def apply(
        GlobalNetworkId: GlobalNetworkId,
        TransitGatewayArn: TransitGatewayArn
    ): RegisterTransitGatewayRequest = {
      val __obj = js.Dynamic.literal(
        "GlobalNetworkId" -> GlobalNetworkId.asInstanceOf[js.Any],
        "TransitGatewayArn" -> TransitGatewayArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[RegisterTransitGatewayRequest]
    }
  }

  @js.native
  trait RegisterTransitGatewayResponse extends js.Object {
    var TransitGatewayRegistration: js.UndefOr[TransitGatewayRegistration]
  }

  object RegisterTransitGatewayResponse {
    @inline
    def apply(
        TransitGatewayRegistration: js.UndefOr[TransitGatewayRegistration] = js.undefined
    ): RegisterTransitGatewayResponse = {
      val __obj = js.Dynamic.literal()
      TransitGatewayRegistration.foreach(__v => __obj.updateDynamic("TransitGatewayRegistration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RegisterTransitGatewayResponse]
    }
  }

  @js.native
  trait RejectAttachmentRequest extends js.Object {
    var AttachmentId: AttachmentId
  }

  object RejectAttachmentRequest {
    @inline
    def apply(
        AttachmentId: AttachmentId
    ): RejectAttachmentRequest = {
      val __obj = js.Dynamic.literal(
        "AttachmentId" -> AttachmentId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[RejectAttachmentRequest]
    }
  }

  @js.native
  trait RejectAttachmentResponse extends js.Object {
    var Attachment: js.UndefOr[Attachment]
  }

  object RejectAttachmentResponse {
    @inline
    def apply(
        Attachment: js.UndefOr[Attachment] = js.undefined
    ): RejectAttachmentResponse = {
      val __obj = js.Dynamic.literal()
      Attachment.foreach(__v => __obj.updateDynamic("Attachment")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RejectAttachmentResponse]
    }
  }

  /** Describes a resource relationship.
    */
  @js.native
  trait Relationship extends js.Object {
    var From: js.UndefOr[ConstrainedString]
    var To: js.UndefOr[ConstrainedString]
  }

  object Relationship {
    @inline
    def apply(
        From: js.UndefOr[ConstrainedString] = js.undefined,
        To: js.UndefOr[ConstrainedString] = js.undefined
    ): Relationship = {
      val __obj = js.Dynamic.literal()
      From.foreach(__v => __obj.updateDynamic("From")(__v.asInstanceOf[js.Any]))
      To.foreach(__v => __obj.updateDynamic("To")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Relationship]
    }
  }

  @js.native
  trait RestoreCoreNetworkPolicyVersionRequest extends js.Object {
    var CoreNetworkId: CoreNetworkId
    var PolicyVersionId: Int
  }

  object RestoreCoreNetworkPolicyVersionRequest {
    @inline
    def apply(
        CoreNetworkId: CoreNetworkId,
        PolicyVersionId: Int
    ): RestoreCoreNetworkPolicyVersionRequest = {
      val __obj = js.Dynamic.literal(
        "CoreNetworkId" -> CoreNetworkId.asInstanceOf[js.Any],
        "PolicyVersionId" -> PolicyVersionId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[RestoreCoreNetworkPolicyVersionRequest]
    }
  }

  @js.native
  trait RestoreCoreNetworkPolicyVersionResponse extends js.Object {
    var CoreNetworkPolicy: js.UndefOr[CoreNetworkPolicy]
  }

  object RestoreCoreNetworkPolicyVersionResponse {
    @inline
    def apply(
        CoreNetworkPolicy: js.UndefOr[CoreNetworkPolicy] = js.undefined
    ): RestoreCoreNetworkPolicyVersionResponse = {
      val __obj = js.Dynamic.literal()
      CoreNetworkPolicy.foreach(__v => __obj.updateDynamic("CoreNetworkPolicy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RestoreCoreNetworkPolicyVersionResponse]
    }
  }

  /** Describes a route analysis.
    */
  @js.native
  trait RouteAnalysis extends js.Object {
    var Destination: js.UndefOr[RouteAnalysisEndpointOptions]
    var ForwardPath: js.UndefOr[RouteAnalysisPath]
    var GlobalNetworkId: js.UndefOr[GlobalNetworkId]
    var IncludeReturnPath: js.UndefOr[Boolean]
    var OwnerAccountId: js.UndefOr[AWSAccountId]
    var ReturnPath: js.UndefOr[RouteAnalysisPath]
    var RouteAnalysisId: js.UndefOr[ConstrainedString]
    var Source: js.UndefOr[RouteAnalysisEndpointOptions]
    var StartTimestamp: js.UndefOr[DateTime]
    var Status: js.UndefOr[RouteAnalysisStatus]
    var UseMiddleboxes: js.UndefOr[Boolean]
  }

  object RouteAnalysis {
    @inline
    def apply(
        Destination: js.UndefOr[RouteAnalysisEndpointOptions] = js.undefined,
        ForwardPath: js.UndefOr[RouteAnalysisPath] = js.undefined,
        GlobalNetworkId: js.UndefOr[GlobalNetworkId] = js.undefined,
        IncludeReturnPath: js.UndefOr[Boolean] = js.undefined,
        OwnerAccountId: js.UndefOr[AWSAccountId] = js.undefined,
        ReturnPath: js.UndefOr[RouteAnalysisPath] = js.undefined,
        RouteAnalysisId: js.UndefOr[ConstrainedString] = js.undefined,
        Source: js.UndefOr[RouteAnalysisEndpointOptions] = js.undefined,
        StartTimestamp: js.UndefOr[DateTime] = js.undefined,
        Status: js.UndefOr[RouteAnalysisStatus] = js.undefined,
        UseMiddleboxes: js.UndefOr[Boolean] = js.undefined
    ): RouteAnalysis = {
      val __obj = js.Dynamic.literal()
      Destination.foreach(__v => __obj.updateDynamic("Destination")(__v.asInstanceOf[js.Any]))
      ForwardPath.foreach(__v => __obj.updateDynamic("ForwardPath")(__v.asInstanceOf[js.Any]))
      GlobalNetworkId.foreach(__v => __obj.updateDynamic("GlobalNetworkId")(__v.asInstanceOf[js.Any]))
      IncludeReturnPath.foreach(__v => __obj.updateDynamic("IncludeReturnPath")(__v.asInstanceOf[js.Any]))
      OwnerAccountId.foreach(__v => __obj.updateDynamic("OwnerAccountId")(__v.asInstanceOf[js.Any]))
      ReturnPath.foreach(__v => __obj.updateDynamic("ReturnPath")(__v.asInstanceOf[js.Any]))
      RouteAnalysisId.foreach(__v => __obj.updateDynamic("RouteAnalysisId")(__v.asInstanceOf[js.Any]))
      Source.foreach(__v => __obj.updateDynamic("Source")(__v.asInstanceOf[js.Any]))
      StartTimestamp.foreach(__v => __obj.updateDynamic("StartTimestamp")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      UseMiddleboxes.foreach(__v => __obj.updateDynamic("UseMiddleboxes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RouteAnalysis]
    }
  }

  /** Describes the status of an analysis at completion.
    */
  @js.native
  trait RouteAnalysisCompletion extends js.Object {
    var ReasonCode: js.UndefOr[RouteAnalysisCompletionReasonCode]
    var ReasonContext: js.UndefOr[ReasonContextMap]
    var ResultCode: js.UndefOr[RouteAnalysisCompletionResultCode]
  }

  object RouteAnalysisCompletion {
    @inline
    def apply(
        ReasonCode: js.UndefOr[RouteAnalysisCompletionReasonCode] = js.undefined,
        ReasonContext: js.UndefOr[ReasonContextMap] = js.undefined,
        ResultCode: js.UndefOr[RouteAnalysisCompletionResultCode] = js.undefined
    ): RouteAnalysisCompletion = {
      val __obj = js.Dynamic.literal()
      ReasonCode.foreach(__v => __obj.updateDynamic("ReasonCode")(__v.asInstanceOf[js.Any]))
      ReasonContext.foreach(__v => __obj.updateDynamic("ReasonContext")(__v.asInstanceOf[js.Any]))
      ResultCode.foreach(__v => __obj.updateDynamic("ResultCode")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RouteAnalysisCompletion]
    }
  }

  /** Describes a source or a destination.
    */
  @js.native
  trait RouteAnalysisEndpointOptions extends js.Object {
    var IpAddress: js.UndefOr[IPAddress]
    var TransitGatewayArn: js.UndefOr[TransitGatewayArn]
    var TransitGatewayAttachmentArn: js.UndefOr[TransitGatewayAttachmentArn]
  }

  object RouteAnalysisEndpointOptions {
    @inline
    def apply(
        IpAddress: js.UndefOr[IPAddress] = js.undefined,
        TransitGatewayArn: js.UndefOr[TransitGatewayArn] = js.undefined,
        TransitGatewayAttachmentArn: js.UndefOr[TransitGatewayAttachmentArn] = js.undefined
    ): RouteAnalysisEndpointOptions = {
      val __obj = js.Dynamic.literal()
      IpAddress.foreach(__v => __obj.updateDynamic("IpAddress")(__v.asInstanceOf[js.Any]))
      TransitGatewayArn.foreach(__v => __obj.updateDynamic("TransitGatewayArn")(__v.asInstanceOf[js.Any]))
      TransitGatewayAttachmentArn.foreach(__v => __obj.updateDynamic("TransitGatewayAttachmentArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RouteAnalysisEndpointOptions]
    }
  }

  /** Describes a source or a destination.
    */
  @js.native
  trait RouteAnalysisEndpointOptionsSpecification extends js.Object {
    var IpAddress: js.UndefOr[IPAddress]
    var TransitGatewayAttachmentArn: js.UndefOr[TransitGatewayAttachmentArn]
  }

  object RouteAnalysisEndpointOptionsSpecification {
    @inline
    def apply(
        IpAddress: js.UndefOr[IPAddress] = js.undefined,
        TransitGatewayAttachmentArn: js.UndefOr[TransitGatewayAttachmentArn] = js.undefined
    ): RouteAnalysisEndpointOptionsSpecification = {
      val __obj = js.Dynamic.literal()
      IpAddress.foreach(__v => __obj.updateDynamic("IpAddress")(__v.asInstanceOf[js.Any]))
      TransitGatewayAttachmentArn.foreach(__v => __obj.updateDynamic("TransitGatewayAttachmentArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RouteAnalysisEndpointOptionsSpecification]
    }
  }

  /** Describes a route analysis path.
    */
  @js.native
  trait RouteAnalysisPath extends js.Object {
    var CompletionStatus: js.UndefOr[RouteAnalysisCompletion]
    var Path: js.UndefOr[PathComponentList]
  }

  object RouteAnalysisPath {
    @inline
    def apply(
        CompletionStatus: js.UndefOr[RouteAnalysisCompletion] = js.undefined,
        Path: js.UndefOr[PathComponentList] = js.undefined
    ): RouteAnalysisPath = {
      val __obj = js.Dynamic.literal()
      CompletionStatus.foreach(__v => __obj.updateDynamic("CompletionStatus")(__v.asInstanceOf[js.Any]))
      Path.foreach(__v => __obj.updateDynamic("Path")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RouteAnalysisPath]
    }
  }

  /** Describes a route table.
    */
  @js.native
  trait RouteTableIdentifier extends js.Object {
    var CoreNetworkSegmentEdge: js.UndefOr[CoreNetworkSegmentEdgeIdentifier]
    var TransitGatewayRouteTableArn: js.UndefOr[TransitGatewayRouteTableArn]
  }

  object RouteTableIdentifier {
    @inline
    def apply(
        CoreNetworkSegmentEdge: js.UndefOr[CoreNetworkSegmentEdgeIdentifier] = js.undefined,
        TransitGatewayRouteTableArn: js.UndefOr[TransitGatewayRouteTableArn] = js.undefined
    ): RouteTableIdentifier = {
      val __obj = js.Dynamic.literal()
      CoreNetworkSegmentEdge.foreach(__v => __obj.updateDynamic("CoreNetworkSegmentEdge")(__v.asInstanceOf[js.Any]))
      TransitGatewayRouteTableArn.foreach(__v => __obj.updateDynamic("TransitGatewayRouteTableArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RouteTableIdentifier]
    }
  }

  /** Describes a site.
    */
  @js.native
  trait Site extends js.Object {
    var CreatedAt: js.UndefOr[DateTime]
    var Description: js.UndefOr[ConstrainedString]
    var GlobalNetworkId: js.UndefOr[GlobalNetworkId]
    var Location: js.UndefOr[Location]
    var SiteArn: js.UndefOr[SiteArn]
    var SiteId: js.UndefOr[SiteId]
    var State: js.UndefOr[SiteState]
    var Tags: js.UndefOr[TagList]
  }

  object Site {
    @inline
    def apply(
        CreatedAt: js.UndefOr[DateTime] = js.undefined,
        Description: js.UndefOr[ConstrainedString] = js.undefined,
        GlobalNetworkId: js.UndefOr[GlobalNetworkId] = js.undefined,
        Location: js.UndefOr[Location] = js.undefined,
        SiteArn: js.UndefOr[SiteArn] = js.undefined,
        SiteId: js.UndefOr[SiteId] = js.undefined,
        State: js.UndefOr[SiteState] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): Site = {
      val __obj = js.Dynamic.literal()
      CreatedAt.foreach(__v => __obj.updateDynamic("CreatedAt")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      GlobalNetworkId.foreach(__v => __obj.updateDynamic("GlobalNetworkId")(__v.asInstanceOf[js.Any]))
      Location.foreach(__v => __obj.updateDynamic("Location")(__v.asInstanceOf[js.Any]))
      SiteArn.foreach(__v => __obj.updateDynamic("SiteArn")(__v.asInstanceOf[js.Any]))
      SiteId.foreach(__v => __obj.updateDynamic("SiteId")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Site]
    }
  }

  /** Creates a site-to-site VPN attachment.
    */
  @js.native
  trait SiteToSiteVpnAttachment extends js.Object {
    var Attachment: js.UndefOr[Attachment]
    var VpnConnectionArn: js.UndefOr[VpnConnectionArn]
  }

  object SiteToSiteVpnAttachment {
    @inline
    def apply(
        Attachment: js.UndefOr[Attachment] = js.undefined,
        VpnConnectionArn: js.UndefOr[VpnConnectionArn] = js.undefined
    ): SiteToSiteVpnAttachment = {
      val __obj = js.Dynamic.literal()
      Attachment.foreach(__v => __obj.updateDynamic("Attachment")(__v.asInstanceOf[js.Any]))
      VpnConnectionArn.foreach(__v => __obj.updateDynamic("VpnConnectionArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SiteToSiteVpnAttachment]
    }
  }

  @js.native
  trait StartOrganizationServiceAccessUpdateRequest extends js.Object {
    var Action: Action
  }

  object StartOrganizationServiceAccessUpdateRequest {
    @inline
    def apply(
        Action: Action
    ): StartOrganizationServiceAccessUpdateRequest = {
      val __obj = js.Dynamic.literal(
        "Action" -> Action.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[StartOrganizationServiceAccessUpdateRequest]
    }
  }

  @js.native
  trait StartOrganizationServiceAccessUpdateResponse extends js.Object {
    var OrganizationStatus: js.UndefOr[OrganizationStatus]
  }

  object StartOrganizationServiceAccessUpdateResponse {
    @inline
    def apply(
        OrganizationStatus: js.UndefOr[OrganizationStatus] = js.undefined
    ): StartOrganizationServiceAccessUpdateResponse = {
      val __obj = js.Dynamic.literal()
      OrganizationStatus.foreach(__v => __obj.updateDynamic("OrganizationStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartOrganizationServiceAccessUpdateResponse]
    }
  }

  @js.native
  trait StartRouteAnalysisRequest extends js.Object {
    var Destination: RouteAnalysisEndpointOptionsSpecification
    var GlobalNetworkId: GlobalNetworkId
    var Source: RouteAnalysisEndpointOptionsSpecification
    var IncludeReturnPath: js.UndefOr[Boolean]
    var UseMiddleboxes: js.UndefOr[Boolean]
  }

  object StartRouteAnalysisRequest {
    @inline
    def apply(
        Destination: RouteAnalysisEndpointOptionsSpecification,
        GlobalNetworkId: GlobalNetworkId,
        Source: RouteAnalysisEndpointOptionsSpecification,
        IncludeReturnPath: js.UndefOr[Boolean] = js.undefined,
        UseMiddleboxes: js.UndefOr[Boolean] = js.undefined
    ): StartRouteAnalysisRequest = {
      val __obj = js.Dynamic.literal(
        "Destination" -> Destination.asInstanceOf[js.Any],
        "GlobalNetworkId" -> GlobalNetworkId.asInstanceOf[js.Any],
        "Source" -> Source.asInstanceOf[js.Any]
      )

      IncludeReturnPath.foreach(__v => __obj.updateDynamic("IncludeReturnPath")(__v.asInstanceOf[js.Any]))
      UseMiddleboxes.foreach(__v => __obj.updateDynamic("UseMiddleboxes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartRouteAnalysisRequest]
    }
  }

  @js.native
  trait StartRouteAnalysisResponse extends js.Object {
    var RouteAnalysis: js.UndefOr[RouteAnalysis]
  }

  object StartRouteAnalysisResponse {
    @inline
    def apply(
        RouteAnalysis: js.UndefOr[RouteAnalysis] = js.undefined
    ): StartRouteAnalysisResponse = {
      val __obj = js.Dynamic.literal()
      RouteAnalysis.foreach(__v => __obj.updateDynamic("RouteAnalysis")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartRouteAnalysisResponse]
    }
  }

  /** Describes a tag.
    */
  @js.native
  trait Tag extends js.Object {
    var Key: js.UndefOr[TagKey]
    var Value: js.UndefOr[TagValue]
  }

  object Tag {
    @inline
    def apply(
        Key: js.UndefOr[TagKey] = js.undefined,
        Value: js.UndefOr[TagValue] = js.undefined
    ): Tag = {
      val __obj = js.Dynamic.literal()
      Key.foreach(__v => __obj.updateDynamic("Key")(__v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Tag]
    }
  }

  @js.native
  trait TagResourceRequest extends js.Object {
    var ResourceArn: ResourceArn
    var Tags: TagList
  }

  object TagResourceRequest {
    @inline
    def apply(
        ResourceArn: ResourceArn,
        Tags: TagList
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

  /** Describes a transit gateway Connect peer association.
    */
  @js.native
  trait TransitGatewayConnectPeerAssociation extends js.Object {
    var DeviceId: js.UndefOr[DeviceId]
    var GlobalNetworkId: js.UndefOr[GlobalNetworkId]
    var LinkId: js.UndefOr[LinkId]
    var State: js.UndefOr[TransitGatewayConnectPeerAssociationState]
    var TransitGatewayConnectPeerArn: js.UndefOr[TransitGatewayConnectPeerArn]
  }

  object TransitGatewayConnectPeerAssociation {
    @inline
    def apply(
        DeviceId: js.UndefOr[DeviceId] = js.undefined,
        GlobalNetworkId: js.UndefOr[GlobalNetworkId] = js.undefined,
        LinkId: js.UndefOr[LinkId] = js.undefined,
        State: js.UndefOr[TransitGatewayConnectPeerAssociationState] = js.undefined,
        TransitGatewayConnectPeerArn: js.UndefOr[TransitGatewayConnectPeerArn] = js.undefined
    ): TransitGatewayConnectPeerAssociation = {
      val __obj = js.Dynamic.literal()
      DeviceId.foreach(__v => __obj.updateDynamic("DeviceId")(__v.asInstanceOf[js.Any]))
      GlobalNetworkId.foreach(__v => __obj.updateDynamic("GlobalNetworkId")(__v.asInstanceOf[js.Any]))
      LinkId.foreach(__v => __obj.updateDynamic("LinkId")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      TransitGatewayConnectPeerArn.foreach(__v => __obj.updateDynamic("TransitGatewayConnectPeerArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TransitGatewayConnectPeerAssociation]
    }
  }

  /** Describes a transit gateway peering attachment.
    */
  @js.native
  trait TransitGatewayPeering extends js.Object {
    var Peering: js.UndefOr[Peering]
    var TransitGatewayArn: js.UndefOr[TransitGatewayArn]
    var TransitGatewayPeeringAttachmentId: js.UndefOr[TransitGatewayPeeringAttachmentId]
  }

  object TransitGatewayPeering {
    @inline
    def apply(
        Peering: js.UndefOr[Peering] = js.undefined,
        TransitGatewayArn: js.UndefOr[TransitGatewayArn] = js.undefined,
        TransitGatewayPeeringAttachmentId: js.UndefOr[TransitGatewayPeeringAttachmentId] = js.undefined
    ): TransitGatewayPeering = {
      val __obj = js.Dynamic.literal()
      Peering.foreach(__v => __obj.updateDynamic("Peering")(__v.asInstanceOf[js.Any]))
      TransitGatewayArn.foreach(__v => __obj.updateDynamic("TransitGatewayArn")(__v.asInstanceOf[js.Any]))
      TransitGatewayPeeringAttachmentId.foreach(__v => __obj.updateDynamic("TransitGatewayPeeringAttachmentId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TransitGatewayPeering]
    }
  }

  /** Describes the registration of a transit gateway to a global network.
    */
  @js.native
  trait TransitGatewayRegistration extends js.Object {
    var GlobalNetworkId: js.UndefOr[GlobalNetworkId]
    var State: js.UndefOr[TransitGatewayRegistrationStateReason]
    var TransitGatewayArn: js.UndefOr[TransitGatewayArn]
  }

  object TransitGatewayRegistration {
    @inline
    def apply(
        GlobalNetworkId: js.UndefOr[GlobalNetworkId] = js.undefined,
        State: js.UndefOr[TransitGatewayRegistrationStateReason] = js.undefined,
        TransitGatewayArn: js.UndefOr[TransitGatewayArn] = js.undefined
    ): TransitGatewayRegistration = {
      val __obj = js.Dynamic.literal()
      GlobalNetworkId.foreach(__v => __obj.updateDynamic("GlobalNetworkId")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      TransitGatewayArn.foreach(__v => __obj.updateDynamic("TransitGatewayArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TransitGatewayRegistration]
    }
  }

  /** Describes the status of a transit gateway registration.
    */
  @js.native
  trait TransitGatewayRegistrationStateReason extends js.Object {
    var Code: js.UndefOr[TransitGatewayRegistrationState]
    var Message: js.UndefOr[ConstrainedString]
  }

  object TransitGatewayRegistrationStateReason {
    @inline
    def apply(
        Code: js.UndefOr[TransitGatewayRegistrationState] = js.undefined,
        Message: js.UndefOr[ConstrainedString] = js.undefined
    ): TransitGatewayRegistrationStateReason = {
      val __obj = js.Dynamic.literal()
      Code.foreach(__v => __obj.updateDynamic("Code")(__v.asInstanceOf[js.Any]))
      Message.foreach(__v => __obj.updateDynamic("Message")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TransitGatewayRegistrationStateReason]
    }
  }

  /** Describes a transit gateway route table attachment.
    */
  @js.native
  trait TransitGatewayRouteTableAttachment extends js.Object {
    var Attachment: js.UndefOr[Attachment]
    var PeeringId: js.UndefOr[PeeringId]
    var TransitGatewayRouteTableArn: js.UndefOr[TransitGatewayRouteTableArn]
  }

  object TransitGatewayRouteTableAttachment {
    @inline
    def apply(
        Attachment: js.UndefOr[Attachment] = js.undefined,
        PeeringId: js.UndefOr[PeeringId] = js.undefined,
        TransitGatewayRouteTableArn: js.UndefOr[TransitGatewayRouteTableArn] = js.undefined
    ): TransitGatewayRouteTableAttachment = {
      val __obj = js.Dynamic.literal()
      Attachment.foreach(__v => __obj.updateDynamic("Attachment")(__v.asInstanceOf[js.Any]))
      PeeringId.foreach(__v => __obj.updateDynamic("PeeringId")(__v.asInstanceOf[js.Any]))
      TransitGatewayRouteTableArn.foreach(__v => __obj.updateDynamic("TransitGatewayRouteTableArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TransitGatewayRouteTableAttachment]
    }
  }

  @js.native
  trait UntagResourceRequest extends js.Object {
    var ResourceArn: ResourceArn
    var TagKeys: TagKeyList
  }

  object UntagResourceRequest {
    @inline
    def apply(
        ResourceArn: ResourceArn,
        TagKeys: TagKeyList
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
  trait UpdateConnectionRequest extends js.Object {
    var ConnectionId: ConnectionId
    var GlobalNetworkId: GlobalNetworkId
    var ConnectedLinkId: js.UndefOr[LinkId]
    var Description: js.UndefOr[ConstrainedString]
    var LinkId: js.UndefOr[LinkId]
  }

  object UpdateConnectionRequest {
    @inline
    def apply(
        ConnectionId: ConnectionId,
        GlobalNetworkId: GlobalNetworkId,
        ConnectedLinkId: js.UndefOr[LinkId] = js.undefined,
        Description: js.UndefOr[ConstrainedString] = js.undefined,
        LinkId: js.UndefOr[LinkId] = js.undefined
    ): UpdateConnectionRequest = {
      val __obj = js.Dynamic.literal(
        "ConnectionId" -> ConnectionId.asInstanceOf[js.Any],
        "GlobalNetworkId" -> GlobalNetworkId.asInstanceOf[js.Any]
      )

      ConnectedLinkId.foreach(__v => __obj.updateDynamic("ConnectedLinkId")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      LinkId.foreach(__v => __obj.updateDynamic("LinkId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateConnectionRequest]
    }
  }

  @js.native
  trait UpdateConnectionResponse extends js.Object {
    var Connection: js.UndefOr[Connection]
  }

  object UpdateConnectionResponse {
    @inline
    def apply(
        Connection: js.UndefOr[Connection] = js.undefined
    ): UpdateConnectionResponse = {
      val __obj = js.Dynamic.literal()
      Connection.foreach(__v => __obj.updateDynamic("Connection")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateConnectionResponse]
    }
  }

  @js.native
  trait UpdateCoreNetworkRequest extends js.Object {
    var CoreNetworkId: CoreNetworkId
    var Description: js.UndefOr[ConstrainedString]
  }

  object UpdateCoreNetworkRequest {
    @inline
    def apply(
        CoreNetworkId: CoreNetworkId,
        Description: js.UndefOr[ConstrainedString] = js.undefined
    ): UpdateCoreNetworkRequest = {
      val __obj = js.Dynamic.literal(
        "CoreNetworkId" -> CoreNetworkId.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateCoreNetworkRequest]
    }
  }

  @js.native
  trait UpdateCoreNetworkResponse extends js.Object {
    var CoreNetwork: js.UndefOr[CoreNetwork]
  }

  object UpdateCoreNetworkResponse {
    @inline
    def apply(
        CoreNetwork: js.UndefOr[CoreNetwork] = js.undefined
    ): UpdateCoreNetworkResponse = {
      val __obj = js.Dynamic.literal()
      CoreNetwork.foreach(__v => __obj.updateDynamic("CoreNetwork")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateCoreNetworkResponse]
    }
  }

  @js.native
  trait UpdateDeviceRequest extends js.Object {
    var DeviceId: DeviceId
    var GlobalNetworkId: GlobalNetworkId
    var AWSLocation: js.UndefOr[AWSLocation]
    var Description: js.UndefOr[ConstrainedString]
    var Location: js.UndefOr[Location]
    var Model: js.UndefOr[ConstrainedString]
    var SerialNumber: js.UndefOr[ConstrainedString]
    var SiteId: js.UndefOr[SiteId]
    var Type: js.UndefOr[ConstrainedString]
    var Vendor: js.UndefOr[ConstrainedString]
  }

  object UpdateDeviceRequest {
    @inline
    def apply(
        DeviceId: DeviceId,
        GlobalNetworkId: GlobalNetworkId,
        AWSLocation: js.UndefOr[AWSLocation] = js.undefined,
        Description: js.UndefOr[ConstrainedString] = js.undefined,
        Location: js.UndefOr[Location] = js.undefined,
        Model: js.UndefOr[ConstrainedString] = js.undefined,
        SerialNumber: js.UndefOr[ConstrainedString] = js.undefined,
        SiteId: js.UndefOr[SiteId] = js.undefined,
        Type: js.UndefOr[ConstrainedString] = js.undefined,
        Vendor: js.UndefOr[ConstrainedString] = js.undefined
    ): UpdateDeviceRequest = {
      val __obj = js.Dynamic.literal(
        "DeviceId" -> DeviceId.asInstanceOf[js.Any],
        "GlobalNetworkId" -> GlobalNetworkId.asInstanceOf[js.Any]
      )

      AWSLocation.foreach(__v => __obj.updateDynamic("AWSLocation")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Location.foreach(__v => __obj.updateDynamic("Location")(__v.asInstanceOf[js.Any]))
      Model.foreach(__v => __obj.updateDynamic("Model")(__v.asInstanceOf[js.Any]))
      SerialNumber.foreach(__v => __obj.updateDynamic("SerialNumber")(__v.asInstanceOf[js.Any]))
      SiteId.foreach(__v => __obj.updateDynamic("SiteId")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      Vendor.foreach(__v => __obj.updateDynamic("Vendor")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateDeviceRequest]
    }
  }

  @js.native
  trait UpdateDeviceResponse extends js.Object {
    var Device: js.UndefOr[Device]
  }

  object UpdateDeviceResponse {
    @inline
    def apply(
        Device: js.UndefOr[Device] = js.undefined
    ): UpdateDeviceResponse = {
      val __obj = js.Dynamic.literal()
      Device.foreach(__v => __obj.updateDynamic("Device")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateDeviceResponse]
    }
  }

  @js.native
  trait UpdateGlobalNetworkRequest extends js.Object {
    var GlobalNetworkId: GlobalNetworkId
    var Description: js.UndefOr[ConstrainedString]
  }

  object UpdateGlobalNetworkRequest {
    @inline
    def apply(
        GlobalNetworkId: GlobalNetworkId,
        Description: js.UndefOr[ConstrainedString] = js.undefined
    ): UpdateGlobalNetworkRequest = {
      val __obj = js.Dynamic.literal(
        "GlobalNetworkId" -> GlobalNetworkId.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateGlobalNetworkRequest]
    }
  }

  @js.native
  trait UpdateGlobalNetworkResponse extends js.Object {
    var GlobalNetwork: js.UndefOr[GlobalNetwork]
  }

  object UpdateGlobalNetworkResponse {
    @inline
    def apply(
        GlobalNetwork: js.UndefOr[GlobalNetwork] = js.undefined
    ): UpdateGlobalNetworkResponse = {
      val __obj = js.Dynamic.literal()
      GlobalNetwork.foreach(__v => __obj.updateDynamic("GlobalNetwork")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateGlobalNetworkResponse]
    }
  }

  @js.native
  trait UpdateLinkRequest extends js.Object {
    var GlobalNetworkId: GlobalNetworkId
    var LinkId: LinkId
    var Bandwidth: js.UndefOr[Bandwidth]
    var Description: js.UndefOr[ConstrainedString]
    var Provider: js.UndefOr[ConstrainedString]
    var Type: js.UndefOr[ConstrainedString]
  }

  object UpdateLinkRequest {
    @inline
    def apply(
        GlobalNetworkId: GlobalNetworkId,
        LinkId: LinkId,
        Bandwidth: js.UndefOr[Bandwidth] = js.undefined,
        Description: js.UndefOr[ConstrainedString] = js.undefined,
        Provider: js.UndefOr[ConstrainedString] = js.undefined,
        Type: js.UndefOr[ConstrainedString] = js.undefined
    ): UpdateLinkRequest = {
      val __obj = js.Dynamic.literal(
        "GlobalNetworkId" -> GlobalNetworkId.asInstanceOf[js.Any],
        "LinkId" -> LinkId.asInstanceOf[js.Any]
      )

      Bandwidth.foreach(__v => __obj.updateDynamic("Bandwidth")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Provider.foreach(__v => __obj.updateDynamic("Provider")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateLinkRequest]
    }
  }

  @js.native
  trait UpdateLinkResponse extends js.Object {
    var Link: js.UndefOr[Link]
  }

  object UpdateLinkResponse {
    @inline
    def apply(
        Link: js.UndefOr[Link] = js.undefined
    ): UpdateLinkResponse = {
      val __obj = js.Dynamic.literal()
      Link.foreach(__v => __obj.updateDynamic("Link")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateLinkResponse]
    }
  }

  @js.native
  trait UpdateNetworkResourceMetadataRequest extends js.Object {
    var GlobalNetworkId: GlobalNetworkId
    var Metadata: NetworkResourceMetadataMap
    var ResourceArn: ResourceArn
  }

  object UpdateNetworkResourceMetadataRequest {
    @inline
    def apply(
        GlobalNetworkId: GlobalNetworkId,
        Metadata: NetworkResourceMetadataMap,
        ResourceArn: ResourceArn
    ): UpdateNetworkResourceMetadataRequest = {
      val __obj = js.Dynamic.literal(
        "GlobalNetworkId" -> GlobalNetworkId.asInstanceOf[js.Any],
        "Metadata" -> Metadata.asInstanceOf[js.Any],
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateNetworkResourceMetadataRequest]
    }
  }

  @js.native
  trait UpdateNetworkResourceMetadataResponse extends js.Object {
    var Metadata: js.UndefOr[NetworkResourceMetadataMap]
    var ResourceArn: js.UndefOr[ResourceArn]
  }

  object UpdateNetworkResourceMetadataResponse {
    @inline
    def apply(
        Metadata: js.UndefOr[NetworkResourceMetadataMap] = js.undefined,
        ResourceArn: js.UndefOr[ResourceArn] = js.undefined
    ): UpdateNetworkResourceMetadataResponse = {
      val __obj = js.Dynamic.literal()
      Metadata.foreach(__v => __obj.updateDynamic("Metadata")(__v.asInstanceOf[js.Any]))
      ResourceArn.foreach(__v => __obj.updateDynamic("ResourceArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateNetworkResourceMetadataResponse]
    }
  }

  @js.native
  trait UpdateSiteRequest extends js.Object {
    var GlobalNetworkId: GlobalNetworkId
    var SiteId: SiteId
    var Description: js.UndefOr[ConstrainedString]
    var Location: js.UndefOr[Location]
  }

  object UpdateSiteRequest {
    @inline
    def apply(
        GlobalNetworkId: GlobalNetworkId,
        SiteId: SiteId,
        Description: js.UndefOr[ConstrainedString] = js.undefined,
        Location: js.UndefOr[Location] = js.undefined
    ): UpdateSiteRequest = {
      val __obj = js.Dynamic.literal(
        "GlobalNetworkId" -> GlobalNetworkId.asInstanceOf[js.Any],
        "SiteId" -> SiteId.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Location.foreach(__v => __obj.updateDynamic("Location")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateSiteRequest]
    }
  }

  @js.native
  trait UpdateSiteResponse extends js.Object {
    var Site: js.UndefOr[Site]
  }

  object UpdateSiteResponse {
    @inline
    def apply(
        Site: js.UndefOr[Site] = js.undefined
    ): UpdateSiteResponse = {
      val __obj = js.Dynamic.literal()
      Site.foreach(__v => __obj.updateDynamic("Site")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateSiteResponse]
    }
  }

  @js.native
  trait UpdateVpcAttachmentRequest extends js.Object {
    var AttachmentId: AttachmentId
    var AddSubnetArns: js.UndefOr[SubnetArnList]
    var Options: js.UndefOr[VpcOptions]
    var RemoveSubnetArns: js.UndefOr[SubnetArnList]
  }

  object UpdateVpcAttachmentRequest {
    @inline
    def apply(
        AttachmentId: AttachmentId,
        AddSubnetArns: js.UndefOr[SubnetArnList] = js.undefined,
        Options: js.UndefOr[VpcOptions] = js.undefined,
        RemoveSubnetArns: js.UndefOr[SubnetArnList] = js.undefined
    ): UpdateVpcAttachmentRequest = {
      val __obj = js.Dynamic.literal(
        "AttachmentId" -> AttachmentId.asInstanceOf[js.Any]
      )

      AddSubnetArns.foreach(__v => __obj.updateDynamic("AddSubnetArns")(__v.asInstanceOf[js.Any]))
      Options.foreach(__v => __obj.updateDynamic("Options")(__v.asInstanceOf[js.Any]))
      RemoveSubnetArns.foreach(__v => __obj.updateDynamic("RemoveSubnetArns")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateVpcAttachmentRequest]
    }
  }

  @js.native
  trait UpdateVpcAttachmentResponse extends js.Object {
    var VpcAttachment: js.UndefOr[VpcAttachment]
  }

  object UpdateVpcAttachmentResponse {
    @inline
    def apply(
        VpcAttachment: js.UndefOr[VpcAttachment] = js.undefined
    ): UpdateVpcAttachmentResponse = {
      val __obj = js.Dynamic.literal()
      VpcAttachment.foreach(__v => __obj.updateDynamic("VpcAttachment")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateVpcAttachmentResponse]
    }
  }

  /** Describes a VPC attachment.
    */
  @js.native
  trait VpcAttachment extends js.Object {
    var Attachment: js.UndefOr[Attachment]
    var Options: js.UndefOr[VpcOptions]
    var SubnetArns: js.UndefOr[SubnetArnList]
  }

  object VpcAttachment {
    @inline
    def apply(
        Attachment: js.UndefOr[Attachment] = js.undefined,
        Options: js.UndefOr[VpcOptions] = js.undefined,
        SubnetArns: js.UndefOr[SubnetArnList] = js.undefined
    ): VpcAttachment = {
      val __obj = js.Dynamic.literal()
      Attachment.foreach(__v => __obj.updateDynamic("Attachment")(__v.asInstanceOf[js.Any]))
      Options.foreach(__v => __obj.updateDynamic("Options")(__v.asInstanceOf[js.Any]))
      SubnetArns.foreach(__v => __obj.updateDynamic("SubnetArns")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VpcAttachment]
    }
  }

  /** Describes the VPC options.
    */
  @js.native
  trait VpcOptions extends js.Object {
    var Ipv6Support: js.UndefOr[Boolean]
  }

  object VpcOptions {
    @inline
    def apply(
        Ipv6Support: js.UndefOr[Boolean] = js.undefined
    ): VpcOptions = {
      val __obj = js.Dynamic.literal()
      Ipv6Support.foreach(__v => __obj.updateDynamic("Ipv6Support")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VpcOptions]
    }
  }
}
