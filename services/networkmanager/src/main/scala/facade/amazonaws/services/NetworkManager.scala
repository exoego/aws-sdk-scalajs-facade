package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

package object networkmanager {
  type CustomerGatewayAssociationList = js.Array[CustomerGatewayAssociation]
  type DateTime = js.Date
  type DeviceList = js.Array[Device]
  type GlobalNetworkList = js.Array[GlobalNetwork]
  type LinkAssociationList = js.Array[LinkAssociation]
  type LinkList = js.Array[Link]
  type MaxResults = Int
  type ResourceARN = String
  type SiteList = js.Array[Site]
  type StringList = js.Array[String]
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagList = js.Array[Tag]
  type TagValue = String
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
    def associateLink(params: AssociateLinkRequest): Request[AssociateLinkResponse] = js.native
    def createDevice(params: CreateDeviceRequest): Request[CreateDeviceResponse] = js.native
    def createGlobalNetwork(params: CreateGlobalNetworkRequest): Request[CreateGlobalNetworkResponse] = js.native
    def createLink(params: CreateLinkRequest): Request[CreateLinkResponse] = js.native
    def createSite(params: CreateSiteRequest): Request[CreateSiteResponse] = js.native
    def deleteDevice(params: DeleteDeviceRequest): Request[DeleteDeviceResponse] = js.native
    def deleteGlobalNetwork(params: DeleteGlobalNetworkRequest): Request[DeleteGlobalNetworkResponse] = js.native
    def deleteLink(params: DeleteLinkRequest): Request[DeleteLinkResponse] = js.native
    def deleteSite(params: DeleteSiteRequest): Request[DeleteSiteResponse] = js.native
    def deregisterTransitGateway(params: DeregisterTransitGatewayRequest): Request[DeregisterTransitGatewayResponse] =
      js.native
    def describeGlobalNetworks(params: DescribeGlobalNetworksRequest): Request[DescribeGlobalNetworksResponse] =
      js.native
    def disassociateCustomerGateway(
        params: DisassociateCustomerGatewayRequest
    ): Request[DisassociateCustomerGatewayResponse] = js.native
    def disassociateLink(params: DisassociateLinkRequest): Request[DisassociateLinkResponse] = js.native
    def getCustomerGatewayAssociations(
        params: GetCustomerGatewayAssociationsRequest
    ): Request[GetCustomerGatewayAssociationsResponse] = js.native
    def getDevices(params: GetDevicesRequest): Request[GetDevicesResponse] = js.native
    def getLinkAssociations(params: GetLinkAssociationsRequest): Request[GetLinkAssociationsResponse] = js.native
    def getLinks(params: GetLinksRequest): Request[GetLinksResponse] = js.native
    def getSites(params: GetSitesRequest): Request[GetSitesResponse] = js.native
    def getTransitGatewayRegistrations(
        params: GetTransitGatewayRegistrationsRequest
    ): Request[GetTransitGatewayRegistrationsResponse] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def registerTransitGateway(params: RegisterTransitGatewayRequest): Request[RegisterTransitGatewayResponse] =
      js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse] = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse] = js.native
    def updateDevice(params: UpdateDeviceRequest): Request[UpdateDeviceResponse] = js.native
    def updateGlobalNetwork(params: UpdateGlobalNetworkRequest): Request[UpdateGlobalNetworkResponse] = js.native
    def updateLink(params: UpdateLinkRequest): Request[UpdateLinkResponse] = js.native
    def updateSite(params: UpdateSiteRequest): Request[UpdateSiteResponse] = js.native
  }

  @js.native
  trait AssociateCustomerGatewayRequest extends js.Object {
    var CustomerGatewayArn: String
    var DeviceId: String
    var GlobalNetworkId: String
    var LinkId: js.UndefOr[String]
  }

  object AssociateCustomerGatewayRequest {
    @inline
    def apply(
        CustomerGatewayArn: String,
        DeviceId: String,
        GlobalNetworkId: String,
        LinkId: js.UndefOr[String] = js.undefined
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
      CustomerGatewayAssociation.foreach(__v =>
        __obj.updateDynamic("CustomerGatewayAssociation")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[AssociateCustomerGatewayResponse]
    }
  }

  @js.native
  trait AssociateLinkRequest extends js.Object {
    var DeviceId: String
    var GlobalNetworkId: String
    var LinkId: String
  }

  object AssociateLinkRequest {
    @inline
    def apply(
        DeviceId: String,
        GlobalNetworkId: String,
        LinkId: String
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

  /**
    * Describes bandwidth information.
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

  @js.native
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

  object CreateDeviceRequest {
    @inline
    def apply(
        GlobalNetworkId: String,
        Description: js.UndefOr[String] = js.undefined,
        Location: js.UndefOr[Location] = js.undefined,
        Model: js.UndefOr[String] = js.undefined,
        SerialNumber: js.UndefOr[String] = js.undefined,
        SiteId: js.UndefOr[String] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined,
        Type: js.UndefOr[String] = js.undefined,
        Vendor: js.UndefOr[String] = js.undefined
    ): CreateDeviceRequest = {
      val __obj = js.Dynamic.literal(
        "GlobalNetworkId" -> GlobalNetworkId.asInstanceOf[js.Any]
      )

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
    var Description: js.UndefOr[String]
    var Tags: js.UndefOr[TagList]
  }

  object CreateGlobalNetworkRequest {
    @inline
    def apply(
        Description: js.UndefOr[String] = js.undefined,
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
    var GlobalNetworkId: String
    var SiteId: String
    var Description: js.UndefOr[String]
    var Provider: js.UndefOr[String]
    var Tags: js.UndefOr[TagList]
    var Type: js.UndefOr[String]
  }

  object CreateLinkRequest {
    @inline
    def apply(
        Bandwidth: Bandwidth,
        GlobalNetworkId: String,
        SiteId: String,
        Description: js.UndefOr[String] = js.undefined,
        Provider: js.UndefOr[String] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined,
        Type: js.UndefOr[String] = js.undefined
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
    var GlobalNetworkId: String
    var Description: js.UndefOr[String]
    var Location: js.UndefOr[Location]
    var Tags: js.UndefOr[TagList]
  }

  object CreateSiteRequest {
    @inline
    def apply(
        GlobalNetworkId: String,
        Description: js.UndefOr[String] = js.undefined,
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

  /**
    * Describes the association between a customer gateway, a device, and a link.
    */
  @js.native
  trait CustomerGatewayAssociation extends js.Object {
    var CustomerGatewayArn: js.UndefOr[String]
    var DeviceId: js.UndefOr[String]
    var GlobalNetworkId: js.UndefOr[String]
    var LinkId: js.UndefOr[String]
    var State: js.UndefOr[CustomerGatewayAssociationState]
  }

  object CustomerGatewayAssociation {
    @inline
    def apply(
        CustomerGatewayArn: js.UndefOr[String] = js.undefined,
        DeviceId: js.UndefOr[String] = js.undefined,
        GlobalNetworkId: js.UndefOr[String] = js.undefined,
        LinkId: js.UndefOr[String] = js.undefined,
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
  sealed trait CustomerGatewayAssociationState extends js.Any
  object CustomerGatewayAssociationState extends js.Object {
    val PENDING = "PENDING".asInstanceOf[CustomerGatewayAssociationState]
    val AVAILABLE = "AVAILABLE".asInstanceOf[CustomerGatewayAssociationState]
    val DELETING = "DELETING".asInstanceOf[CustomerGatewayAssociationState]
    val DELETED = "DELETED".asInstanceOf[CustomerGatewayAssociationState]

    val values = js.Object.freeze(js.Array(PENDING, AVAILABLE, DELETING, DELETED))
  }

  @js.native
  trait DeleteDeviceRequest extends js.Object {
    var DeviceId: String
    var GlobalNetworkId: String
  }

  object DeleteDeviceRequest {
    @inline
    def apply(
        DeviceId: String,
        GlobalNetworkId: String
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
    var GlobalNetworkId: String
  }

  object DeleteGlobalNetworkRequest {
    @inline
    def apply(
        GlobalNetworkId: String
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
    var GlobalNetworkId: String
    var LinkId: String
  }

  object DeleteLinkRequest {
    @inline
    def apply(
        GlobalNetworkId: String,
        LinkId: String
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
  trait DeleteSiteRequest extends js.Object {
    var GlobalNetworkId: String
    var SiteId: String
  }

  object DeleteSiteRequest {
    @inline
    def apply(
        GlobalNetworkId: String,
        SiteId: String
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
    var GlobalNetworkId: String
    var TransitGatewayArn: String
  }

  object DeregisterTransitGatewayRequest {
    @inline
    def apply(
        GlobalNetworkId: String,
        TransitGatewayArn: String
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
      TransitGatewayRegistration.foreach(__v =>
        __obj.updateDynamic("TransitGatewayRegistration")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[DeregisterTransitGatewayResponse]
    }
  }

  @js.native
  trait DescribeGlobalNetworksRequest extends js.Object {
    var GlobalNetworkIds: js.UndefOr[StringList]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[String]
  }

  object DescribeGlobalNetworksRequest {
    @inline
    def apply(
        GlobalNetworkIds: js.UndefOr[StringList] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
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
    var NextToken: js.UndefOr[String]
  }

  object DescribeGlobalNetworksResponse {
    @inline
    def apply(
        GlobalNetworks: js.UndefOr[GlobalNetworkList] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): DescribeGlobalNetworksResponse = {
      val __obj = js.Dynamic.literal()
      GlobalNetworks.foreach(__v => __obj.updateDynamic("GlobalNetworks")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeGlobalNetworksResponse]
    }
  }

  /**
    * Describes a device.
    */
  @js.native
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

  object Device {
    @inline
    def apply(
        CreatedAt: js.UndefOr[DateTime] = js.undefined,
        Description: js.UndefOr[String] = js.undefined,
        DeviceArn: js.UndefOr[String] = js.undefined,
        DeviceId: js.UndefOr[String] = js.undefined,
        GlobalNetworkId: js.UndefOr[String] = js.undefined,
        Location: js.UndefOr[Location] = js.undefined,
        Model: js.UndefOr[String] = js.undefined,
        SerialNumber: js.UndefOr[String] = js.undefined,
        SiteId: js.UndefOr[String] = js.undefined,
        State: js.UndefOr[DeviceState] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined,
        Type: js.UndefOr[String] = js.undefined,
        Vendor: js.UndefOr[String] = js.undefined
    ): Device = {
      val __obj = js.Dynamic.literal()
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
  sealed trait DeviceState extends js.Any
  object DeviceState extends js.Object {
    val PENDING = "PENDING".asInstanceOf[DeviceState]
    val AVAILABLE = "AVAILABLE".asInstanceOf[DeviceState]
    val DELETING = "DELETING".asInstanceOf[DeviceState]
    val UPDATING = "UPDATING".asInstanceOf[DeviceState]

    val values = js.Object.freeze(js.Array(PENDING, AVAILABLE, DELETING, UPDATING))
  }

  @js.native
  trait DisassociateCustomerGatewayRequest extends js.Object {
    var CustomerGatewayArn: String
    var GlobalNetworkId: String
  }

  object DisassociateCustomerGatewayRequest {
    @inline
    def apply(
        CustomerGatewayArn: String,
        GlobalNetworkId: String
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
      CustomerGatewayAssociation.foreach(__v =>
        __obj.updateDynamic("CustomerGatewayAssociation")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[DisassociateCustomerGatewayResponse]
    }
  }

  @js.native
  trait DisassociateLinkRequest extends js.Object {
    var DeviceId: String
    var GlobalNetworkId: String
    var LinkId: String
  }

  object DisassociateLinkRequest {
    @inline
    def apply(
        DeviceId: String,
        GlobalNetworkId: String,
        LinkId: String
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
  trait GetCustomerGatewayAssociationsRequest extends js.Object {
    var GlobalNetworkId: String
    var CustomerGatewayArns: js.UndefOr[StringList]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[String]
  }

  object GetCustomerGatewayAssociationsRequest {
    @inline
    def apply(
        GlobalNetworkId: String,
        CustomerGatewayArns: js.UndefOr[StringList] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
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
    var NextToken: js.UndefOr[String]
  }

  object GetCustomerGatewayAssociationsResponse {
    @inline
    def apply(
        CustomerGatewayAssociations: js.UndefOr[CustomerGatewayAssociationList] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): GetCustomerGatewayAssociationsResponse = {
      val __obj = js.Dynamic.literal()
      CustomerGatewayAssociations.foreach(__v =>
        __obj.updateDynamic("CustomerGatewayAssociations")(__v.asInstanceOf[js.Any])
      )
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetCustomerGatewayAssociationsResponse]
    }
  }

  @js.native
  trait GetDevicesRequest extends js.Object {
    var GlobalNetworkId: String
    var DeviceIds: js.UndefOr[StringList]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[String]
    var SiteId: js.UndefOr[String]
  }

  object GetDevicesRequest {
    @inline
    def apply(
        GlobalNetworkId: String,
        DeviceIds: js.UndefOr[StringList] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined,
        SiteId: js.UndefOr[String] = js.undefined
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
    var NextToken: js.UndefOr[String]
  }

  object GetDevicesResponse {
    @inline
    def apply(
        Devices: js.UndefOr[DeviceList] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): GetDevicesResponse = {
      val __obj = js.Dynamic.literal()
      Devices.foreach(__v => __obj.updateDynamic("Devices")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDevicesResponse]
    }
  }

  @js.native
  trait GetLinkAssociationsRequest extends js.Object {
    var GlobalNetworkId: String
    var DeviceId: js.UndefOr[String]
    var LinkId: js.UndefOr[String]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[String]
  }

  object GetLinkAssociationsRequest {
    @inline
    def apply(
        GlobalNetworkId: String,
        DeviceId: js.UndefOr[String] = js.undefined,
        LinkId: js.UndefOr[String] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
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
    var NextToken: js.UndefOr[String]
  }

  object GetLinkAssociationsResponse {
    @inline
    def apply(
        LinkAssociations: js.UndefOr[LinkAssociationList] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): GetLinkAssociationsResponse = {
      val __obj = js.Dynamic.literal()
      LinkAssociations.foreach(__v => __obj.updateDynamic("LinkAssociations")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetLinkAssociationsResponse]
    }
  }

  @js.native
  trait GetLinksRequest extends js.Object {
    var GlobalNetworkId: String
    var LinkIds: js.UndefOr[StringList]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[String]
    var Provider: js.UndefOr[String]
    var SiteId: js.UndefOr[String]
    var Type: js.UndefOr[String]
  }

  object GetLinksRequest {
    @inline
    def apply(
        GlobalNetworkId: String,
        LinkIds: js.UndefOr[StringList] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined,
        Provider: js.UndefOr[String] = js.undefined,
        SiteId: js.UndefOr[String] = js.undefined,
        Type: js.UndefOr[String] = js.undefined
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
    var NextToken: js.UndefOr[String]
  }

  object GetLinksResponse {
    @inline
    def apply(
        Links: js.UndefOr[LinkList] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): GetLinksResponse = {
      val __obj = js.Dynamic.literal()
      Links.foreach(__v => __obj.updateDynamic("Links")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetLinksResponse]
    }
  }

  @js.native
  trait GetSitesRequest extends js.Object {
    var GlobalNetworkId: String
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[String]
    var SiteIds: js.UndefOr[StringList]
  }

  object GetSitesRequest {
    @inline
    def apply(
        GlobalNetworkId: String,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined,
        SiteIds: js.UndefOr[StringList] = js.undefined
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
    var NextToken: js.UndefOr[String]
    var Sites: js.UndefOr[SiteList]
  }

  object GetSitesResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[String] = js.undefined,
        Sites: js.UndefOr[SiteList] = js.undefined
    ): GetSitesResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Sites.foreach(__v => __obj.updateDynamic("Sites")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetSitesResponse]
    }
  }

  @js.native
  trait GetTransitGatewayRegistrationsRequest extends js.Object {
    var GlobalNetworkId: String
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[String]
    var TransitGatewayArns: js.UndefOr[StringList]
  }

  object GetTransitGatewayRegistrationsRequest {
    @inline
    def apply(
        GlobalNetworkId: String,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined,
        TransitGatewayArns: js.UndefOr[StringList] = js.undefined
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
    var NextToken: js.UndefOr[String]
    var TransitGatewayRegistrations: js.UndefOr[TransitGatewayRegistrationList]
  }

  object GetTransitGatewayRegistrationsResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[String] = js.undefined,
        TransitGatewayRegistrations: js.UndefOr[TransitGatewayRegistrationList] = js.undefined
    ): GetTransitGatewayRegistrationsResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      TransitGatewayRegistrations.foreach(__v =>
        __obj.updateDynamic("TransitGatewayRegistrations")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[GetTransitGatewayRegistrationsResponse]
    }
  }

  /**
    * Describes a global network.
    */
  @js.native
  trait GlobalNetwork extends js.Object {
    var CreatedAt: js.UndefOr[DateTime]
    var Description: js.UndefOr[String]
    var GlobalNetworkArn: js.UndefOr[String]
    var GlobalNetworkId: js.UndefOr[String]
    var State: js.UndefOr[GlobalNetworkState]
    var Tags: js.UndefOr[TagList]
  }

  object GlobalNetwork {
    @inline
    def apply(
        CreatedAt: js.UndefOr[DateTime] = js.undefined,
        Description: js.UndefOr[String] = js.undefined,
        GlobalNetworkArn: js.UndefOr[String] = js.undefined,
        GlobalNetworkId: js.UndefOr[String] = js.undefined,
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

  @js.native
  sealed trait GlobalNetworkState extends js.Any
  object GlobalNetworkState extends js.Object {
    val PENDING = "PENDING".asInstanceOf[GlobalNetworkState]
    val AVAILABLE = "AVAILABLE".asInstanceOf[GlobalNetworkState]
    val DELETING = "DELETING".asInstanceOf[GlobalNetworkState]
    val UPDATING = "UPDATING".asInstanceOf[GlobalNetworkState]

    val values = js.Object.freeze(js.Array(PENDING, AVAILABLE, DELETING, UPDATING))
  }

  /**
    * Describes a link.
    */
  @js.native
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

  object Link {
    @inline
    def apply(
        Bandwidth: js.UndefOr[Bandwidth] = js.undefined,
        CreatedAt: js.UndefOr[DateTime] = js.undefined,
        Description: js.UndefOr[String] = js.undefined,
        GlobalNetworkId: js.UndefOr[String] = js.undefined,
        LinkArn: js.UndefOr[String] = js.undefined,
        LinkId: js.UndefOr[String] = js.undefined,
        Provider: js.UndefOr[String] = js.undefined,
        SiteId: js.UndefOr[String] = js.undefined,
        State: js.UndefOr[LinkState] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined,
        Type: js.UndefOr[String] = js.undefined
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

  /**
    * Describes the association between a device and a link.
    */
  @js.native
  trait LinkAssociation extends js.Object {
    var DeviceId: js.UndefOr[String]
    var GlobalNetworkId: js.UndefOr[String]
    var LinkAssociationState: js.UndefOr[LinkAssociationState]
    var LinkId: js.UndefOr[String]
  }

  object LinkAssociation {
    @inline
    def apply(
        DeviceId: js.UndefOr[String] = js.undefined,
        GlobalNetworkId: js.UndefOr[String] = js.undefined,
        LinkAssociationState: js.UndefOr[LinkAssociationState] = js.undefined,
        LinkId: js.UndefOr[String] = js.undefined
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
  sealed trait LinkAssociationState extends js.Any
  object LinkAssociationState extends js.Object {
    val PENDING = "PENDING".asInstanceOf[LinkAssociationState]
    val AVAILABLE = "AVAILABLE".asInstanceOf[LinkAssociationState]
    val DELETING = "DELETING".asInstanceOf[LinkAssociationState]
    val DELETED = "DELETED".asInstanceOf[LinkAssociationState]

    val values = js.Object.freeze(js.Array(PENDING, AVAILABLE, DELETING, DELETED))
  }

  @js.native
  sealed trait LinkState extends js.Any
  object LinkState extends js.Object {
    val PENDING = "PENDING".asInstanceOf[LinkState]
    val AVAILABLE = "AVAILABLE".asInstanceOf[LinkState]
    val DELETING = "DELETING".asInstanceOf[LinkState]
    val UPDATING = "UPDATING".asInstanceOf[LinkState]

    val values = js.Object.freeze(js.Array(PENDING, AVAILABLE, DELETING, UPDATING))
  }

  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var ResourceArn: ResourceARN
  }

  object ListTagsForResourceRequest {
    @inline
    def apply(
        ResourceArn: ResourceARN
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

  /**
    * Describes a location.
    */
  @js.native
  trait Location extends js.Object {
    var Address: js.UndefOr[String]
    var Latitude: js.UndefOr[String]
    var Longitude: js.UndefOr[String]
  }

  object Location {
    @inline
    def apply(
        Address: js.UndefOr[String] = js.undefined,
        Latitude: js.UndefOr[String] = js.undefined,
        Longitude: js.UndefOr[String] = js.undefined
    ): Location = {
      val __obj = js.Dynamic.literal()
      Address.foreach(__v => __obj.updateDynamic("Address")(__v.asInstanceOf[js.Any]))
      Latitude.foreach(__v => __obj.updateDynamic("Latitude")(__v.asInstanceOf[js.Any]))
      Longitude.foreach(__v => __obj.updateDynamic("Longitude")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Location]
    }
  }

  @js.native
  trait RegisterTransitGatewayRequest extends js.Object {
    var GlobalNetworkId: String
    var TransitGatewayArn: String
  }

  object RegisterTransitGatewayRequest {
    @inline
    def apply(
        GlobalNetworkId: String,
        TransitGatewayArn: String
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
      TransitGatewayRegistration.foreach(__v =>
        __obj.updateDynamic("TransitGatewayRegistration")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[RegisterTransitGatewayResponse]
    }
  }

  /**
    * Describes a site.
    */
  @js.native
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

  object Site {
    @inline
    def apply(
        CreatedAt: js.UndefOr[DateTime] = js.undefined,
        Description: js.UndefOr[String] = js.undefined,
        GlobalNetworkId: js.UndefOr[String] = js.undefined,
        Location: js.UndefOr[Location] = js.undefined,
        SiteArn: js.UndefOr[String] = js.undefined,
        SiteId: js.UndefOr[String] = js.undefined,
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

  @js.native
  sealed trait SiteState extends js.Any
  object SiteState extends js.Object {
    val PENDING = "PENDING".asInstanceOf[SiteState]
    val AVAILABLE = "AVAILABLE".asInstanceOf[SiteState]
    val DELETING = "DELETING".asInstanceOf[SiteState]
    val UPDATING = "UPDATING".asInstanceOf[SiteState]

    val values = js.Object.freeze(js.Array(PENDING, AVAILABLE, DELETING, UPDATING))
  }

  /**
    * Describes a tag.
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
    var ResourceArn: ResourceARN
    var Tags: TagList
  }

  object TagResourceRequest {
    @inline
    def apply(
        ResourceArn: ResourceARN,
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
  trait TagResourceResponse extends js.Object {}

  object TagResourceResponse {
    @inline
    def apply(
    ): TagResourceResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[TagResourceResponse]
    }
  }

  /**
    * Describes the registration of a transit gateway to a global network.
    */
  @js.native
  trait TransitGatewayRegistration extends js.Object {
    var GlobalNetworkId: js.UndefOr[String]
    var State: js.UndefOr[TransitGatewayRegistrationStateReason]
    var TransitGatewayArn: js.UndefOr[String]
  }

  object TransitGatewayRegistration {
    @inline
    def apply(
        GlobalNetworkId: js.UndefOr[String] = js.undefined,
        State: js.UndefOr[TransitGatewayRegistrationStateReason] = js.undefined,
        TransitGatewayArn: js.UndefOr[String] = js.undefined
    ): TransitGatewayRegistration = {
      val __obj = js.Dynamic.literal()
      GlobalNetworkId.foreach(__v => __obj.updateDynamic("GlobalNetworkId")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      TransitGatewayArn.foreach(__v => __obj.updateDynamic("TransitGatewayArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TransitGatewayRegistration]
    }
  }

  @js.native
  sealed trait TransitGatewayRegistrationState extends js.Any
  object TransitGatewayRegistrationState extends js.Object {
    val PENDING = "PENDING".asInstanceOf[TransitGatewayRegistrationState]
    val AVAILABLE = "AVAILABLE".asInstanceOf[TransitGatewayRegistrationState]
    val DELETING = "DELETING".asInstanceOf[TransitGatewayRegistrationState]
    val DELETED = "DELETED".asInstanceOf[TransitGatewayRegistrationState]
    val FAILED = "FAILED".asInstanceOf[TransitGatewayRegistrationState]

    val values = js.Object.freeze(js.Array(PENDING, AVAILABLE, DELETING, DELETED, FAILED))
  }

  /**
    * Describes the status of a transit gateway registration.
    */
  @js.native
  trait TransitGatewayRegistrationStateReason extends js.Object {
    var Code: js.UndefOr[TransitGatewayRegistrationState]
    var Message: js.UndefOr[String]
  }

  object TransitGatewayRegistrationStateReason {
    @inline
    def apply(
        Code: js.UndefOr[TransitGatewayRegistrationState] = js.undefined,
        Message: js.UndefOr[String] = js.undefined
    ): TransitGatewayRegistrationStateReason = {
      val __obj = js.Dynamic.literal()
      Code.foreach(__v => __obj.updateDynamic("Code")(__v.asInstanceOf[js.Any]))
      Message.foreach(__v => __obj.updateDynamic("Message")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TransitGatewayRegistrationStateReason]
    }
  }

  @js.native
  trait UntagResourceRequest extends js.Object {
    var ResourceArn: ResourceARN
    var TagKeys: TagKeyList
  }

  object UntagResourceRequest {
    @inline
    def apply(
        ResourceArn: ResourceARN,
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
  trait UntagResourceResponse extends js.Object {}

  object UntagResourceResponse {
    @inline
    def apply(
    ): UntagResourceResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[UntagResourceResponse]
    }
  }

  @js.native
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

  object UpdateDeviceRequest {
    @inline
    def apply(
        DeviceId: String,
        GlobalNetworkId: String,
        Description: js.UndefOr[String] = js.undefined,
        Location: js.UndefOr[Location] = js.undefined,
        Model: js.UndefOr[String] = js.undefined,
        SerialNumber: js.UndefOr[String] = js.undefined,
        SiteId: js.UndefOr[String] = js.undefined,
        Type: js.UndefOr[String] = js.undefined,
        Vendor: js.UndefOr[String] = js.undefined
    ): UpdateDeviceRequest = {
      val __obj = js.Dynamic.literal(
        "DeviceId" -> DeviceId.asInstanceOf[js.Any],
        "GlobalNetworkId" -> GlobalNetworkId.asInstanceOf[js.Any]
      )

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
    var GlobalNetworkId: String
    var Description: js.UndefOr[String]
  }

  object UpdateGlobalNetworkRequest {
    @inline
    def apply(
        GlobalNetworkId: String,
        Description: js.UndefOr[String] = js.undefined
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
    var GlobalNetworkId: String
    var LinkId: String
    var Bandwidth: js.UndefOr[Bandwidth]
    var Description: js.UndefOr[String]
    var Provider: js.UndefOr[String]
    var Type: js.UndefOr[String]
  }

  object UpdateLinkRequest {
    @inline
    def apply(
        GlobalNetworkId: String,
        LinkId: String,
        Bandwidth: js.UndefOr[Bandwidth] = js.undefined,
        Description: js.UndefOr[String] = js.undefined,
        Provider: js.UndefOr[String] = js.undefined,
        Type: js.UndefOr[String] = js.undefined
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
  trait UpdateSiteRequest extends js.Object {
    var GlobalNetworkId: String
    var SiteId: String
    var Description: js.UndefOr[String]
    var Location: js.UndefOr[Location]
  }

  object UpdateSiteRequest {
    @inline
    def apply(
        GlobalNetworkId: String,
        SiteId: String,
        Description: js.UndefOr[String] = js.undefined,
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
}
