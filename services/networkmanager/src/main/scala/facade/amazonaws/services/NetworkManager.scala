package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object networkmanager {
  type CustomerGatewayAssociationList = js.Array[CustomerGatewayAssociation]
  type DateTime                       = js.Date
  type DeviceList                     = js.Array[Device]
  type GlobalNetworkList              = js.Array[GlobalNetwork]
  type LinkAssociationList            = js.Array[LinkAssociation]
  type LinkList                       = js.Array[Link]
  type MaxResults                     = Int
  type ResourceARN                    = String
  type SiteList                       = js.Array[Site]
  type StringList                     = js.Array[String]
  type TagKey                         = String
  type TagKeyList                     = js.Array[TagKey]
  type TagList                        = js.Array[Tag]
  type TagValue                       = String
  type TransitGatewayRegistrationList = js.Array[TransitGatewayRegistration]

  implicit final class NetworkManagerOps(private val service: NetworkManager) extends AnyVal {

    @inline def associateCustomerGatewayFuture(
        params: AssociateCustomerGatewayRequest
    ): Future[AssociateCustomerGatewayResponse] = service.associateCustomerGateway(params).promise().toFuture
    @inline def associateLinkFuture(params: AssociateLinkRequest): Future[AssociateLinkResponse] =
      service.associateLink(params).promise().toFuture
    @inline def createDeviceFuture(params: CreateDeviceRequest): Future[CreateDeviceResponse] =
      service.createDevice(params).promise().toFuture
    @inline def createGlobalNetworkFuture(params: CreateGlobalNetworkRequest): Future[CreateGlobalNetworkResponse] =
      service.createGlobalNetwork(params).promise().toFuture
    @inline def createLinkFuture(params: CreateLinkRequest): Future[CreateLinkResponse] =
      service.createLink(params).promise().toFuture
    @inline def createSiteFuture(params: CreateSiteRequest): Future[CreateSiteResponse] =
      service.createSite(params).promise().toFuture
    @inline def deleteDeviceFuture(params: DeleteDeviceRequest): Future[DeleteDeviceResponse] =
      service.deleteDevice(params).promise().toFuture
    @inline def deleteGlobalNetworkFuture(params: DeleteGlobalNetworkRequest): Future[DeleteGlobalNetworkResponse] =
      service.deleteGlobalNetwork(params).promise().toFuture
    @inline def deleteLinkFuture(params: DeleteLinkRequest): Future[DeleteLinkResponse] =
      service.deleteLink(params).promise().toFuture
    @inline def deleteSiteFuture(params: DeleteSiteRequest): Future[DeleteSiteResponse] =
      service.deleteSite(params).promise().toFuture
    @inline def deregisterTransitGatewayFuture(
        params: DeregisterTransitGatewayRequest
    ): Future[DeregisterTransitGatewayResponse] = service.deregisterTransitGateway(params).promise().toFuture
    @inline def describeGlobalNetworksFuture(
        params: DescribeGlobalNetworksRequest
    ): Future[DescribeGlobalNetworksResponse] = service.describeGlobalNetworks(params).promise().toFuture
    @inline def disassociateCustomerGatewayFuture(
        params: DisassociateCustomerGatewayRequest
    ): Future[DisassociateCustomerGatewayResponse] = service.disassociateCustomerGateway(params).promise().toFuture
    @inline def disassociateLinkFuture(params: DisassociateLinkRequest): Future[DisassociateLinkResponse] =
      service.disassociateLink(params).promise().toFuture
    @inline def getCustomerGatewayAssociationsFuture(
        params: GetCustomerGatewayAssociationsRequest
    ): Future[GetCustomerGatewayAssociationsResponse] =
      service.getCustomerGatewayAssociations(params).promise().toFuture
    @inline def getDevicesFuture(params: GetDevicesRequest): Future[GetDevicesResponse] =
      service.getDevices(params).promise().toFuture
    @inline def getLinkAssociationsFuture(params: GetLinkAssociationsRequest): Future[GetLinkAssociationsResponse] =
      service.getLinkAssociations(params).promise().toFuture
    @inline def getLinksFuture(params: GetLinksRequest): Future[GetLinksResponse] =
      service.getLinks(params).promise().toFuture
    @inline def getSitesFuture(params: GetSitesRequest): Future[GetSitesResponse] =
      service.getSites(params).promise().toFuture
    @inline def getTransitGatewayRegistrationsFuture(
        params: GetTransitGatewayRegistrationsRequest
    ): Future[GetTransitGatewayRegistrationsResponse] =
      service.getTransitGatewayRegistrations(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] =
      service.listTagsForResource(params).promise().toFuture
    @inline def registerTransitGatewayFuture(
        params: RegisterTransitGatewayRequest
    ): Future[RegisterTransitGatewayResponse] = service.registerTransitGateway(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] =
      service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] =
      service.untagResource(params).promise().toFuture
    @inline def updateDeviceFuture(params: UpdateDeviceRequest): Future[UpdateDeviceResponse] =
      service.updateDevice(params).promise().toFuture
    @inline def updateGlobalNetworkFuture(params: UpdateGlobalNetworkRequest): Future[UpdateGlobalNetworkResponse] =
      service.updateGlobalNetwork(params).promise().toFuture
    @inline def updateLinkFuture(params: UpdateLinkRequest): Future[UpdateLinkResponse] =
      service.updateLink(params).promise().toFuture
    @inline def updateSiteFuture(params: UpdateSiteRequest): Future[UpdateSiteResponse] =
      service.updateSite(params).promise().toFuture
  }
}

package networkmanager {
  @js.native
  @JSImport("aws-sdk", "NetworkManager")
  class NetworkManager() extends js.Object {
    def this(config: AWSConfig) = this()

    def associateCustomerGateway(params: AssociateCustomerGatewayRequest): Request[AssociateCustomerGatewayResponse] =
      js.native
    def associateLink(params: AssociateLinkRequest): Request[AssociateLinkResponse]                   = js.native
    def createDevice(params: CreateDeviceRequest): Request[CreateDeviceResponse]                      = js.native
    def createGlobalNetwork(params: CreateGlobalNetworkRequest): Request[CreateGlobalNetworkResponse] = js.native
    def createLink(params: CreateLinkRequest): Request[CreateLinkResponse]                            = js.native
    def createSite(params: CreateSiteRequest): Request[CreateSiteResponse]                            = js.native
    def deleteDevice(params: DeleteDeviceRequest): Request[DeleteDeviceResponse]                      = js.native
    def deleteGlobalNetwork(params: DeleteGlobalNetworkRequest): Request[DeleteGlobalNetworkResponse] = js.native
    def deleteLink(params: DeleteLinkRequest): Request[DeleteLinkResponse]                            = js.native
    def deleteSite(params: DeleteSiteRequest): Request[DeleteSiteResponse]                            = js.native
    def deregisterTransitGateway(params: DeregisterTransitGatewayRequest): Request[DeregisterTransitGatewayResponse] =
      js.native
    def describeGlobalNetworks(params: DescribeGlobalNetworksRequest): Request[DescribeGlobalNetworksResponse] =
      js.native
    def disassociateCustomerGateway(
        params: DisassociateCustomerGatewayRequest
    ): Request[DisassociateCustomerGatewayResponse]                                          = js.native
    def disassociateLink(params: DisassociateLinkRequest): Request[DisassociateLinkResponse] = js.native
    def getCustomerGatewayAssociations(
        params: GetCustomerGatewayAssociationsRequest
    ): Request[GetCustomerGatewayAssociationsResponse]                                                = js.native
    def getDevices(params: GetDevicesRequest): Request[GetDevicesResponse]                            = js.native
    def getLinkAssociations(params: GetLinkAssociationsRequest): Request[GetLinkAssociationsResponse] = js.native
    def getLinks(params: GetLinksRequest): Request[GetLinksResponse]                                  = js.native
    def getSites(params: GetSitesRequest): Request[GetSitesResponse]                                  = js.native
    def getTransitGatewayRegistrations(
        params: GetTransitGatewayRegistrationsRequest
    ): Request[GetTransitGatewayRegistrationsResponse]                                                = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def registerTransitGateway(params: RegisterTransitGatewayRequest): Request[RegisterTransitGatewayResponse] =
      js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse]                         = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse]                   = js.native
    def updateDevice(params: UpdateDeviceRequest): Request[UpdateDeviceResponse]                      = js.native
    def updateGlobalNetwork(params: UpdateGlobalNetworkRequest): Request[UpdateGlobalNetworkResponse] = js.native
    def updateLink(params: UpdateLinkRequest): Request[UpdateLinkResponse]                            = js.native
    def updateSite(params: UpdateSiteRequest): Request[UpdateSiteResponse]                            = js.native
  }

  @js.native
  @Factory
  trait AssociateCustomerGatewayRequest extends js.Object {
    var CustomerGatewayArn: String
    var DeviceId: String
    var GlobalNetworkId: String
    var LinkId: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait AssociateCustomerGatewayResponse extends js.Object {
    var CustomerGatewayAssociation: js.UndefOr[CustomerGatewayAssociation]
  }

  @js.native
  @Factory
  trait AssociateLinkRequest extends js.Object {
    var DeviceId: String
    var GlobalNetworkId: String
    var LinkId: String
  }

  @js.native
  @Factory
  trait AssociateLinkResponse extends js.Object {
    var LinkAssociation: js.UndefOr[LinkAssociation]
  }

  /**
    * Describes bandwidth information.
    */
  @js.native
  @Factory
  trait Bandwidth extends js.Object {
    var DownloadSpeed: js.UndefOr[Int]
    var UploadSpeed: js.UndefOr[Int]
  }

  @js.native
  @Factory
  trait CreateDeviceRequest extends js.Object {
    var GlobalNetworkId: String
    var Description: js.UndefOr[String]
    var Location: js.UndefOr[Location]
    var Model: js.UndefOr[String]
    var SerialNumber: js.UndefOr[String]
    var SiteId: js.UndefOr[String]
    var Tags: js.UndefOr[TagList]
    var Type: js.UndefOr[String]
    var Vendor: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait CreateDeviceResponse extends js.Object {
    var Device: js.UndefOr[Device]
  }

  @js.native
  @Factory
  trait CreateGlobalNetworkRequest extends js.Object {
    var Description: js.UndefOr[String]
    var Tags: js.UndefOr[TagList]
  }

  @js.native
  @Factory
  trait CreateGlobalNetworkResponse extends js.Object {
    var GlobalNetwork: js.UndefOr[GlobalNetwork]
  }

  @js.native
  @Factory
  trait CreateLinkRequest extends js.Object {
    var Bandwidth: Bandwidth
    var GlobalNetworkId: String
    var SiteId: String
    var Description: js.UndefOr[String]
    var Provider: js.UndefOr[String]
    var Tags: js.UndefOr[TagList]
    var Type: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait CreateLinkResponse extends js.Object {
    var Link: js.UndefOr[Link]
  }

  @js.native
  @Factory
  trait CreateSiteRequest extends js.Object {
    var GlobalNetworkId: String
    var Description: js.UndefOr[String]
    var Location: js.UndefOr[Location]
    var Tags: js.UndefOr[TagList]
  }

  @js.native
  @Factory
  trait CreateSiteResponse extends js.Object {
    var Site: js.UndefOr[Site]
  }

  /**
    * Describes the association between a customer gateway, a device, and a link.
    */
  @js.native
  @Factory
  trait CustomerGatewayAssociation extends js.Object {
    var CustomerGatewayArn: js.UndefOr[String]
    var DeviceId: js.UndefOr[String]
    var GlobalNetworkId: js.UndefOr[String]
    var LinkId: js.UndefOr[String]
    var State: js.UndefOr[CustomerGatewayAssociationState]
  }

  @js.native
  sealed trait CustomerGatewayAssociationState extends js.Any
  object CustomerGatewayAssociationState extends js.Object {
    val PENDING   = "PENDING".asInstanceOf[CustomerGatewayAssociationState]
    val AVAILABLE = "AVAILABLE".asInstanceOf[CustomerGatewayAssociationState]
    val DELETING  = "DELETING".asInstanceOf[CustomerGatewayAssociationState]
    val DELETED   = "DELETED".asInstanceOf[CustomerGatewayAssociationState]

    val values = js.Object.freeze(js.Array(PENDING, AVAILABLE, DELETING, DELETED))
  }

  @js.native
  @Factory
  trait DeleteDeviceRequest extends js.Object {
    var DeviceId: String
    var GlobalNetworkId: String
  }

  @js.native
  @Factory
  trait DeleteDeviceResponse extends js.Object {
    var Device: js.UndefOr[Device]
  }

  @js.native
  @Factory
  trait DeleteGlobalNetworkRequest extends js.Object {
    var GlobalNetworkId: String
  }

  @js.native
  @Factory
  trait DeleteGlobalNetworkResponse extends js.Object {
    var GlobalNetwork: js.UndefOr[GlobalNetwork]
  }

  @js.native
  @Factory
  trait DeleteLinkRequest extends js.Object {
    var GlobalNetworkId: String
    var LinkId: String
  }

  @js.native
  @Factory
  trait DeleteLinkResponse extends js.Object {
    var Link: js.UndefOr[Link]
  }

  @js.native
  @Factory
  trait DeleteSiteRequest extends js.Object {
    var GlobalNetworkId: String
    var SiteId: String
  }

  @js.native
  @Factory
  trait DeleteSiteResponse extends js.Object {
    var Site: js.UndefOr[Site]
  }

  @js.native
  @Factory
  trait DeregisterTransitGatewayRequest extends js.Object {
    var GlobalNetworkId: String
    var TransitGatewayArn: String
  }

  @js.native
  @Factory
  trait DeregisterTransitGatewayResponse extends js.Object {
    var TransitGatewayRegistration: js.UndefOr[TransitGatewayRegistration]
  }

  @js.native
  @Factory
  trait DescribeGlobalNetworksRequest extends js.Object {
    var GlobalNetworkIds: js.UndefOr[StringList]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait DescribeGlobalNetworksResponse extends js.Object {
    var GlobalNetworks: js.UndefOr[GlobalNetworkList]
    var NextToken: js.UndefOr[String]
  }

  /**
    * Describes a device.
    */
  @js.native
  @Factory
  trait Device extends js.Object {
    var CreatedAt: js.UndefOr[DateTime]
    var Description: js.UndefOr[String]
    var DeviceArn: js.UndefOr[String]
    var DeviceId: js.UndefOr[String]
    var GlobalNetworkId: js.UndefOr[String]
    var Location: js.UndefOr[Location]
    var Model: js.UndefOr[String]
    var SerialNumber: js.UndefOr[String]
    var SiteId: js.UndefOr[String]
    var State: js.UndefOr[DeviceState]
    var Tags: js.UndefOr[TagList]
    var Type: js.UndefOr[String]
    var Vendor: js.UndefOr[String]
  }

  @js.native
  sealed trait DeviceState extends js.Any
  object DeviceState extends js.Object {
    val PENDING   = "PENDING".asInstanceOf[DeviceState]
    val AVAILABLE = "AVAILABLE".asInstanceOf[DeviceState]
    val DELETING  = "DELETING".asInstanceOf[DeviceState]
    val UPDATING  = "UPDATING".asInstanceOf[DeviceState]

    val values = js.Object.freeze(js.Array(PENDING, AVAILABLE, DELETING, UPDATING))
  }

  @js.native
  @Factory
  trait DisassociateCustomerGatewayRequest extends js.Object {
    var CustomerGatewayArn: String
    var GlobalNetworkId: String
  }

  @js.native
  @Factory
  trait DisassociateCustomerGatewayResponse extends js.Object {
    var CustomerGatewayAssociation: js.UndefOr[CustomerGatewayAssociation]
  }

  @js.native
  @Factory
  trait DisassociateLinkRequest extends js.Object {
    var DeviceId: String
    var GlobalNetworkId: String
    var LinkId: String
  }

  @js.native
  @Factory
  trait DisassociateLinkResponse extends js.Object {
    var LinkAssociation: js.UndefOr[LinkAssociation]
  }

  @js.native
  @Factory
  trait GetCustomerGatewayAssociationsRequest extends js.Object {
    var GlobalNetworkId: String
    var CustomerGatewayArns: js.UndefOr[StringList]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait GetCustomerGatewayAssociationsResponse extends js.Object {
    var CustomerGatewayAssociations: js.UndefOr[CustomerGatewayAssociationList]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait GetDevicesRequest extends js.Object {
    var GlobalNetworkId: String
    var DeviceIds: js.UndefOr[StringList]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[String]
    var SiteId: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait GetDevicesResponse extends js.Object {
    var Devices: js.UndefOr[DeviceList]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait GetLinkAssociationsRequest extends js.Object {
    var GlobalNetworkId: String
    var DeviceId: js.UndefOr[String]
    var LinkId: js.UndefOr[String]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait GetLinkAssociationsResponse extends js.Object {
    var LinkAssociations: js.UndefOr[LinkAssociationList]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait GetLinksRequest extends js.Object {
    var GlobalNetworkId: String
    var LinkIds: js.UndefOr[StringList]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[String]
    var Provider: js.UndefOr[String]
    var SiteId: js.UndefOr[String]
    var Type: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait GetLinksResponse extends js.Object {
    var Links: js.UndefOr[LinkList]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait GetSitesRequest extends js.Object {
    var GlobalNetworkId: String
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[String]
    var SiteIds: js.UndefOr[StringList]
  }

  @js.native
  @Factory
  trait GetSitesResponse extends js.Object {
    var NextToken: js.UndefOr[String]
    var Sites: js.UndefOr[SiteList]
  }

  @js.native
  @Factory
  trait GetTransitGatewayRegistrationsRequest extends js.Object {
    var GlobalNetworkId: String
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[String]
    var TransitGatewayArns: js.UndefOr[StringList]
  }

  @js.native
  @Factory
  trait GetTransitGatewayRegistrationsResponse extends js.Object {
    var NextToken: js.UndefOr[String]
    var TransitGatewayRegistrations: js.UndefOr[TransitGatewayRegistrationList]
  }

  /**
    * Describes a global network.
    */
  @js.native
  @Factory
  trait GlobalNetwork extends js.Object {
    var CreatedAt: js.UndefOr[DateTime]
    var Description: js.UndefOr[String]
    var GlobalNetworkArn: js.UndefOr[String]
    var GlobalNetworkId: js.UndefOr[String]
    var State: js.UndefOr[GlobalNetworkState]
    var Tags: js.UndefOr[TagList]
  }

  @js.native
  sealed trait GlobalNetworkState extends js.Any
  object GlobalNetworkState extends js.Object {
    val PENDING   = "PENDING".asInstanceOf[GlobalNetworkState]
    val AVAILABLE = "AVAILABLE".asInstanceOf[GlobalNetworkState]
    val DELETING  = "DELETING".asInstanceOf[GlobalNetworkState]
    val UPDATING  = "UPDATING".asInstanceOf[GlobalNetworkState]

    val values = js.Object.freeze(js.Array(PENDING, AVAILABLE, DELETING, UPDATING))
  }

  /**
    * Describes a link.
    */
  @js.native
  @Factory
  trait Link extends js.Object {
    var Bandwidth: js.UndefOr[Bandwidth]
    var CreatedAt: js.UndefOr[DateTime]
    var Description: js.UndefOr[String]
    var GlobalNetworkId: js.UndefOr[String]
    var LinkArn: js.UndefOr[String]
    var LinkId: js.UndefOr[String]
    var Provider: js.UndefOr[String]
    var SiteId: js.UndefOr[String]
    var State: js.UndefOr[LinkState]
    var Tags: js.UndefOr[TagList]
    var Type: js.UndefOr[String]
  }

  /**
    * Describes the association between a device and a link.
    */
  @js.native
  @Factory
  trait LinkAssociation extends js.Object {
    var DeviceId: js.UndefOr[String]
    var GlobalNetworkId: js.UndefOr[String]
    var LinkAssociationState: js.UndefOr[LinkAssociationState]
    var LinkId: js.UndefOr[String]
  }

  @js.native
  sealed trait LinkAssociationState extends js.Any
  object LinkAssociationState extends js.Object {
    val PENDING   = "PENDING".asInstanceOf[LinkAssociationState]
    val AVAILABLE = "AVAILABLE".asInstanceOf[LinkAssociationState]
    val DELETING  = "DELETING".asInstanceOf[LinkAssociationState]
    val DELETED   = "DELETED".asInstanceOf[LinkAssociationState]

    val values = js.Object.freeze(js.Array(PENDING, AVAILABLE, DELETING, DELETED))
  }

  @js.native
  sealed trait LinkState extends js.Any
  object LinkState extends js.Object {
    val PENDING   = "PENDING".asInstanceOf[LinkState]
    val AVAILABLE = "AVAILABLE".asInstanceOf[LinkState]
    val DELETING  = "DELETING".asInstanceOf[LinkState]
    val UPDATING  = "UPDATING".asInstanceOf[LinkState]

    val values = js.Object.freeze(js.Array(PENDING, AVAILABLE, DELETING, UPDATING))
  }

  @js.native
  @Factory
  trait ListTagsForResourceRequest extends js.Object {
    var ResourceArn: ResourceARN
  }

  @js.native
  @Factory
  trait ListTagsForResourceResponse extends js.Object {
    var TagList: js.UndefOr[TagList]
  }

  /**
    * Describes a location.
    */
  @js.native
  @Factory
  trait Location extends js.Object {
    var Address: js.UndefOr[String]
    var Latitude: js.UndefOr[String]
    var Longitude: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait RegisterTransitGatewayRequest extends js.Object {
    var GlobalNetworkId: String
    var TransitGatewayArn: String
  }

  @js.native
  @Factory
  trait RegisterTransitGatewayResponse extends js.Object {
    var TransitGatewayRegistration: js.UndefOr[TransitGatewayRegistration]
  }

  /**
    * Describes a site.
    */
  @js.native
  @Factory
  trait Site extends js.Object {
    var CreatedAt: js.UndefOr[DateTime]
    var Description: js.UndefOr[String]
    var GlobalNetworkId: js.UndefOr[String]
    var Location: js.UndefOr[Location]
    var SiteArn: js.UndefOr[String]
    var SiteId: js.UndefOr[String]
    var State: js.UndefOr[SiteState]
    var Tags: js.UndefOr[TagList]
  }

  @js.native
  sealed trait SiteState extends js.Any
  object SiteState extends js.Object {
    val PENDING   = "PENDING".asInstanceOf[SiteState]
    val AVAILABLE = "AVAILABLE".asInstanceOf[SiteState]
    val DELETING  = "DELETING".asInstanceOf[SiteState]
    val UPDATING  = "UPDATING".asInstanceOf[SiteState]

    val values = js.Object.freeze(js.Array(PENDING, AVAILABLE, DELETING, UPDATING))
  }

  /**
    * Describes a tag.
    */
  @js.native
  @Factory
  trait Tag extends js.Object {
    var Key: js.UndefOr[TagKey]
    var Value: js.UndefOr[TagValue]
  }

  @js.native
  @Factory
  trait TagResourceRequest extends js.Object {
    var ResourceArn: ResourceARN
    var Tags: TagList
  }

  @js.native
  @Factory
  trait TagResourceResponse extends js.Object {}

  /**
    * Describes the registration of a transit gateway to a global network.
    */
  @js.native
  @Factory
  trait TransitGatewayRegistration extends js.Object {
    var GlobalNetworkId: js.UndefOr[String]
    var State: js.UndefOr[TransitGatewayRegistrationStateReason]
    var TransitGatewayArn: js.UndefOr[String]
  }

  @js.native
  sealed trait TransitGatewayRegistrationState extends js.Any
  object TransitGatewayRegistrationState extends js.Object {
    val PENDING   = "PENDING".asInstanceOf[TransitGatewayRegistrationState]
    val AVAILABLE = "AVAILABLE".asInstanceOf[TransitGatewayRegistrationState]
    val DELETING  = "DELETING".asInstanceOf[TransitGatewayRegistrationState]
    val DELETED   = "DELETED".asInstanceOf[TransitGatewayRegistrationState]
    val FAILED    = "FAILED".asInstanceOf[TransitGatewayRegistrationState]

    val values = js.Object.freeze(js.Array(PENDING, AVAILABLE, DELETING, DELETED, FAILED))
  }

  /**
    * Describes the status of a transit gateway registration.
    */
  @js.native
  @Factory
  trait TransitGatewayRegistrationStateReason extends js.Object {
    var Code: js.UndefOr[TransitGatewayRegistrationState]
    var Message: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait UntagResourceRequest extends js.Object {
    var ResourceArn: ResourceARN
    var TagKeys: TagKeyList
  }

  @js.native
  @Factory
  trait UntagResourceResponse extends js.Object {}

  @js.native
  @Factory
  trait UpdateDeviceRequest extends js.Object {
    var DeviceId: String
    var GlobalNetworkId: String
    var Description: js.UndefOr[String]
    var Location: js.UndefOr[Location]
    var Model: js.UndefOr[String]
    var SerialNumber: js.UndefOr[String]
    var SiteId: js.UndefOr[String]
    var Type: js.UndefOr[String]
    var Vendor: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait UpdateDeviceResponse extends js.Object {
    var Device: js.UndefOr[Device]
  }

  @js.native
  @Factory
  trait UpdateGlobalNetworkRequest extends js.Object {
    var GlobalNetworkId: String
    var Description: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait UpdateGlobalNetworkResponse extends js.Object {
    var GlobalNetwork: js.UndefOr[GlobalNetwork]
  }

  @js.native
  @Factory
  trait UpdateLinkRequest extends js.Object {
    var GlobalNetworkId: String
    var LinkId: String
    var Bandwidth: js.UndefOr[Bandwidth]
    var Description: js.UndefOr[String]
    var Provider: js.UndefOr[String]
    var Type: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait UpdateLinkResponse extends js.Object {
    var Link: js.UndefOr[Link]
  }

  @js.native
  @Factory
  trait UpdateSiteRequest extends js.Object {
    var GlobalNetworkId: String
    var SiteId: String
    var Description: js.UndefOr[String]
    var Location: js.UndefOr[Location]
  }

  @js.native
  @Factory
  trait UpdateSiteResponse extends js.Object {
    var Site: js.UndefOr[Site]
  }
}
