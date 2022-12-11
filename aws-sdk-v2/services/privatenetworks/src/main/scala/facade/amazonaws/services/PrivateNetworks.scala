package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import scala.language.implicitConversions
import facade.amazonaws._

package object privatenetworks {
  type AddressContent = String
  type Arn = String
  type ClientToken = String
  type ConfigureAccessPointRequestCpiSecretKeyString = String
  type ConfigureAccessPointRequestCpiUserIdString = String
  type ConfigureAccessPointRequestCpiUserPasswordString = String
  type ConfigureAccessPointRequestCpiUsernameString = String
  type Description = String
  type DeviceIdentifierFilterValues = js.Array[String]
  type DeviceIdentifierFilters = js.Dictionary[DeviceIdentifierFilterValues]
  type DeviceIdentifierImsiString = String
  type DeviceIdentifierList = js.Array[DeviceIdentifier]
  type ListDeviceIdentifiersRequestMaxResultsInteger = Int
  type ListNetworkResourcesRequestMaxResultsInteger = Int
  type ListNetworkSitesRequestMaxResultsInteger = Int
  type ListNetworksRequestMaxResultsInteger = Int
  type ListOrdersRequestMaxResultsInteger = Int
  type Name = String
  type NameValuePairs = js.Array[NameValuePair]
  type NetworkFilterValues = js.Array[String]
  type NetworkFilters = js.Dictionary[NetworkFilterValues]
  type NetworkList = js.Array[Network]
  type NetworkResourceDefinitionCountInteger = Int
  type NetworkResourceDefinitions = js.Array[NetworkResourceDefinition]
  type NetworkResourceFilterValues = js.Array[String]
  type NetworkResourceFilters = js.Dictionary[NetworkResourceFilterValues]
  type NetworkResourceList = js.Array[NetworkResource]
  type NetworkSiteFilterValues = js.Array[String]
  type NetworkSiteFilters = js.Dictionary[NetworkSiteFilterValues]
  type NetworkSiteList = js.Array[NetworkSite]
  type Options = js.Array[NameValuePair]
  type OrderFilterValues = js.Array[String]
  type OrderFilters = js.Dictionary[OrderFilterValues]
  type OrderList = js.Array[Order]
  type PaginationToken = String
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagMap = js.Dictionary[TagValue]
  type TagValue = String
  type Timestamp = js.Date
  type TrackingInformationList = js.Array[TrackingInformation]

  final class PrivateNetworksOps(private val service: PrivateNetworks) extends AnyVal {

    @inline def acknowledgeOrderReceiptFuture(params: AcknowledgeOrderReceiptRequest): Future[AcknowledgeOrderReceiptResponse] = service.acknowledgeOrderReceipt(params).promise().toFuture
    @inline def activateDeviceIdentifierFuture(params: ActivateDeviceIdentifierRequest): Future[ActivateDeviceIdentifierResponse] = service.activateDeviceIdentifier(params).promise().toFuture
    @inline def activateNetworkSiteFuture(params: ActivateNetworkSiteRequest): Future[ActivateNetworkSiteResponse] = service.activateNetworkSite(params).promise().toFuture
    @inline def configureAccessPointFuture(params: ConfigureAccessPointRequest): Future[ConfigureAccessPointResponse] = service.configureAccessPoint(params).promise().toFuture
    @inline def createNetworkFuture(params: CreateNetworkRequest): Future[CreateNetworkResponse] = service.createNetwork(params).promise().toFuture
    @inline def createNetworkSiteFuture(params: CreateNetworkSiteRequest): Future[CreateNetworkSiteResponse] = service.createNetworkSite(params).promise().toFuture
    @inline def deactivateDeviceIdentifierFuture(params: DeactivateDeviceIdentifierRequest): Future[DeactivateDeviceIdentifierResponse] = service.deactivateDeviceIdentifier(params).promise().toFuture
    @inline def deleteNetworkFuture(params: DeleteNetworkRequest): Future[DeleteNetworkResponse] = service.deleteNetwork(params).promise().toFuture
    @inline def deleteNetworkSiteFuture(params: DeleteNetworkSiteRequest): Future[DeleteNetworkSiteResponse] = service.deleteNetworkSite(params).promise().toFuture
    @inline def getDeviceIdentifierFuture(params: GetDeviceIdentifierRequest): Future[GetDeviceIdentifierResponse] = service.getDeviceIdentifier(params).promise().toFuture
    @inline def getNetworkFuture(params: GetNetworkRequest): Future[GetNetworkResponse] = service.getNetwork(params).promise().toFuture
    @inline def getNetworkResourceFuture(params: GetNetworkResourceRequest): Future[GetNetworkResourceResponse] = service.getNetworkResource(params).promise().toFuture
    @inline def getNetworkSiteFuture(params: GetNetworkSiteRequest): Future[GetNetworkSiteResponse] = service.getNetworkSite(params).promise().toFuture
    @inline def getOrderFuture(params: GetOrderRequest): Future[GetOrderResponse] = service.getOrder(params).promise().toFuture
    @inline def listDeviceIdentifiersFuture(params: ListDeviceIdentifiersRequest): Future[ListDeviceIdentifiersResponse] = service.listDeviceIdentifiers(params).promise().toFuture
    @inline def listNetworkResourcesFuture(params: ListNetworkResourcesRequest): Future[ListNetworkResourcesResponse] = service.listNetworkResources(params).promise().toFuture
    @inline def listNetworkSitesFuture(params: ListNetworkSitesRequest): Future[ListNetworkSitesResponse] = service.listNetworkSites(params).promise().toFuture
    @inline def listNetworksFuture(params: ListNetworksRequest): Future[ListNetworksResponse] = service.listNetworks(params).promise().toFuture
    @inline def listOrdersFuture(params: ListOrdersRequest): Future[ListOrdersResponse] = service.listOrders(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] = service.listTagsForResource(params).promise().toFuture
    @inline def pingFuture(): Future[PingResponse] = service.ping().promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] = service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] = service.untagResource(params).promise().toFuture
    @inline def updateNetworkSiteFuture(params: UpdateNetworkSiteRequest): Future[UpdateNetworkSiteResponse] = service.updateNetworkSite(params).promise().toFuture
    @inline def updateNetworkSitePlanFuture(params: UpdateNetworkSitePlanRequest): Future[UpdateNetworkSiteResponse] = service.updateNetworkSitePlan(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/privatenetworks", JSImport.Namespace, "AWS.PrivateNetworks")
  class PrivateNetworks() extends js.Object {
    def this(config: AWSConfig) = this()

    def acknowledgeOrderReceipt(params: AcknowledgeOrderReceiptRequest): Request[AcknowledgeOrderReceiptResponse] = js.native
    def activateDeviceIdentifier(params: ActivateDeviceIdentifierRequest): Request[ActivateDeviceIdentifierResponse] = js.native
    def activateNetworkSite(params: ActivateNetworkSiteRequest): Request[ActivateNetworkSiteResponse] = js.native
    def configureAccessPoint(params: ConfigureAccessPointRequest): Request[ConfigureAccessPointResponse] = js.native
    def createNetwork(params: CreateNetworkRequest): Request[CreateNetworkResponse] = js.native
    def createNetworkSite(params: CreateNetworkSiteRequest): Request[CreateNetworkSiteResponse] = js.native
    def deactivateDeviceIdentifier(params: DeactivateDeviceIdentifierRequest): Request[DeactivateDeviceIdentifierResponse] = js.native
    def deleteNetwork(params: DeleteNetworkRequest): Request[DeleteNetworkResponse] = js.native
    def deleteNetworkSite(params: DeleteNetworkSiteRequest): Request[DeleteNetworkSiteResponse] = js.native
    def getDeviceIdentifier(params: GetDeviceIdentifierRequest): Request[GetDeviceIdentifierResponse] = js.native
    def getNetwork(params: GetNetworkRequest): Request[GetNetworkResponse] = js.native
    def getNetworkResource(params: GetNetworkResourceRequest): Request[GetNetworkResourceResponse] = js.native
    def getNetworkSite(params: GetNetworkSiteRequest): Request[GetNetworkSiteResponse] = js.native
    def getOrder(params: GetOrderRequest): Request[GetOrderResponse] = js.native
    def listDeviceIdentifiers(params: ListDeviceIdentifiersRequest): Request[ListDeviceIdentifiersResponse] = js.native
    def listNetworkResources(params: ListNetworkResourcesRequest): Request[ListNetworkResourcesResponse] = js.native
    def listNetworkSites(params: ListNetworkSitesRequest): Request[ListNetworkSitesResponse] = js.native
    def listNetworks(params: ListNetworksRequest): Request[ListNetworksResponse] = js.native
    def listOrders(params: ListOrdersRequest): Request[ListOrdersResponse] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def ping(): Request[PingResponse] = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse] = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse] = js.native
    def updateNetworkSite(params: UpdateNetworkSiteRequest): Request[UpdateNetworkSiteResponse] = js.native
    def updateNetworkSitePlan(params: UpdateNetworkSitePlanRequest): Request[UpdateNetworkSiteResponse] = js.native
  }
  object PrivateNetworks {
    @inline implicit def toOps(service: PrivateNetworks): PrivateNetworksOps = {
      new PrivateNetworksOps(service)
    }
  }

  @js.native
  trait AcknowledgeOrderReceiptRequest extends js.Object {
    var orderArn: Arn
  }

  object AcknowledgeOrderReceiptRequest {
    @inline
    def apply(
        orderArn: Arn
    ): AcknowledgeOrderReceiptRequest = {
      val __obj = js.Dynamic.literal(
        "orderArn" -> orderArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AcknowledgeOrderReceiptRequest]
    }
  }

  @js.native
  trait AcknowledgeOrderReceiptResponse extends js.Object {
    var order: Order
  }

  object AcknowledgeOrderReceiptResponse {
    @inline
    def apply(
        order: Order
    ): AcknowledgeOrderReceiptResponse = {
      val __obj = js.Dynamic.literal(
        "order" -> order.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AcknowledgeOrderReceiptResponse]
    }
  }

  @js.native
  trait ActivateDeviceIdentifierRequest extends js.Object {
    var deviceIdentifierArn: Arn
    var clientToken: js.UndefOr[ClientToken]
  }

  object ActivateDeviceIdentifierRequest {
    @inline
    def apply(
        deviceIdentifierArn: Arn,
        clientToken: js.UndefOr[ClientToken] = js.undefined
    ): ActivateDeviceIdentifierRequest = {
      val __obj = js.Dynamic.literal(
        "deviceIdentifierArn" -> deviceIdentifierArn.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ActivateDeviceIdentifierRequest]
    }
  }

  @js.native
  trait ActivateDeviceIdentifierResponse extends js.Object {
    var deviceIdentifier: DeviceIdentifier
    var tags: js.UndefOr[TagMap]
  }

  object ActivateDeviceIdentifierResponse {
    @inline
    def apply(
        deviceIdentifier: DeviceIdentifier,
        tags: js.UndefOr[TagMap] = js.undefined
    ): ActivateDeviceIdentifierResponse = {
      val __obj = js.Dynamic.literal(
        "deviceIdentifier" -> deviceIdentifier.asInstanceOf[js.Any]
      )

      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ActivateDeviceIdentifierResponse]
    }
  }

  @js.native
  trait ActivateNetworkSiteRequest extends js.Object {
    var networkSiteArn: Arn
    var shippingAddress: Address
    var clientToken: js.UndefOr[ClientToken]
  }

  object ActivateNetworkSiteRequest {
    @inline
    def apply(
        networkSiteArn: Arn,
        shippingAddress: Address,
        clientToken: js.UndefOr[ClientToken] = js.undefined
    ): ActivateNetworkSiteRequest = {
      val __obj = js.Dynamic.literal(
        "networkSiteArn" -> networkSiteArn.asInstanceOf[js.Any],
        "shippingAddress" -> shippingAddress.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ActivateNetworkSiteRequest]
    }
  }

  @js.native
  trait ActivateNetworkSiteResponse extends js.Object {
    var networkSite: js.UndefOr[NetworkSite]
  }

  object ActivateNetworkSiteResponse {
    @inline
    def apply(
        networkSite: js.UndefOr[NetworkSite] = js.undefined
    ): ActivateNetworkSiteResponse = {
      val __obj = js.Dynamic.literal()
      networkSite.foreach(__v => __obj.updateDynamic("networkSite")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ActivateNetworkSiteResponse]
    }
  }

  /** Information about an address.
    */
  @js.native
  trait Address extends js.Object {
    var city: AddressContent
    var country: AddressContent
    var name: AddressContent
    var postalCode: AddressContent
    var stateOrProvince: AddressContent
    var street1: AddressContent
    var company: js.UndefOr[AddressContent]
    var phoneNumber: js.UndefOr[AddressContent]
    var street2: js.UndefOr[AddressContent]
    var street3: js.UndefOr[AddressContent]
  }

  object Address {
    @inline
    def apply(
        city: AddressContent,
        country: AddressContent,
        name: AddressContent,
        postalCode: AddressContent,
        stateOrProvince: AddressContent,
        street1: AddressContent,
        company: js.UndefOr[AddressContent] = js.undefined,
        phoneNumber: js.UndefOr[AddressContent] = js.undefined,
        street2: js.UndefOr[AddressContent] = js.undefined,
        street3: js.UndefOr[AddressContent] = js.undefined
    ): Address = {
      val __obj = js.Dynamic.literal(
        "city" -> city.asInstanceOf[js.Any],
        "country" -> country.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any],
        "postalCode" -> postalCode.asInstanceOf[js.Any],
        "stateOrProvince" -> stateOrProvince.asInstanceOf[js.Any],
        "street1" -> street1.asInstanceOf[js.Any]
      )

      company.foreach(__v => __obj.updateDynamic("company")(__v.asInstanceOf[js.Any]))
      phoneNumber.foreach(__v => __obj.updateDynamic("phoneNumber")(__v.asInstanceOf[js.Any]))
      street2.foreach(__v => __obj.updateDynamic("street2")(__v.asInstanceOf[js.Any]))
      street3.foreach(__v => __obj.updateDynamic("street3")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Address]
    }
  }

  @js.native
  trait ConfigureAccessPointRequest extends js.Object {
    var accessPointArn: Arn
    var cpiSecretKey: js.UndefOr[ConfigureAccessPointRequestCpiSecretKeyString]
    var cpiUserId: js.UndefOr[ConfigureAccessPointRequestCpiUserIdString]
    var cpiUserPassword: js.UndefOr[ConfigureAccessPointRequestCpiUserPasswordString]
    var cpiUsername: js.UndefOr[ConfigureAccessPointRequestCpiUsernameString]
    var position: js.UndefOr[Position]
  }

  object ConfigureAccessPointRequest {
    @inline
    def apply(
        accessPointArn: Arn,
        cpiSecretKey: js.UndefOr[ConfigureAccessPointRequestCpiSecretKeyString] = js.undefined,
        cpiUserId: js.UndefOr[ConfigureAccessPointRequestCpiUserIdString] = js.undefined,
        cpiUserPassword: js.UndefOr[ConfigureAccessPointRequestCpiUserPasswordString] = js.undefined,
        cpiUsername: js.UndefOr[ConfigureAccessPointRequestCpiUsernameString] = js.undefined,
        position: js.UndefOr[Position] = js.undefined
    ): ConfigureAccessPointRequest = {
      val __obj = js.Dynamic.literal(
        "accessPointArn" -> accessPointArn.asInstanceOf[js.Any]
      )

      cpiSecretKey.foreach(__v => __obj.updateDynamic("cpiSecretKey")(__v.asInstanceOf[js.Any]))
      cpiUserId.foreach(__v => __obj.updateDynamic("cpiUserId")(__v.asInstanceOf[js.Any]))
      cpiUserPassword.foreach(__v => __obj.updateDynamic("cpiUserPassword")(__v.asInstanceOf[js.Any]))
      cpiUsername.foreach(__v => __obj.updateDynamic("cpiUsername")(__v.asInstanceOf[js.Any]))
      position.foreach(__v => __obj.updateDynamic("position")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ConfigureAccessPointRequest]
    }
  }

  @js.native
  trait ConfigureAccessPointResponse extends js.Object {
    var accessPoint: NetworkResource
  }

  object ConfigureAccessPointResponse {
    @inline
    def apply(
        accessPoint: NetworkResource
    ): ConfigureAccessPointResponse = {
      val __obj = js.Dynamic.literal(
        "accessPoint" -> accessPoint.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ConfigureAccessPointResponse]
    }
  }

  @js.native
  trait CreateNetworkRequest extends js.Object {
    var networkName: Name
    var clientToken: js.UndefOr[ClientToken]
    var description: js.UndefOr[Description]
    var tags: js.UndefOr[TagMap]
  }

  object CreateNetworkRequest {
    @inline
    def apply(
        networkName: Name,
        clientToken: js.UndefOr[ClientToken] = js.undefined,
        description: js.UndefOr[Description] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined
    ): CreateNetworkRequest = {
      val __obj = js.Dynamic.literal(
        "networkName" -> networkName.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateNetworkRequest]
    }
  }

  @js.native
  trait CreateNetworkResponse extends js.Object {
    var network: Network
    var tags: js.UndefOr[TagMap]
  }

  object CreateNetworkResponse {
    @inline
    def apply(
        network: Network,
        tags: js.UndefOr[TagMap] = js.undefined
    ): CreateNetworkResponse = {
      val __obj = js.Dynamic.literal(
        "network" -> network.asInstanceOf[js.Any]
      )

      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateNetworkResponse]
    }
  }

  @js.native
  trait CreateNetworkSiteRequest extends js.Object {
    var networkArn: Arn
    var networkSiteName: Name
    var availabilityZone: js.UndefOr[String]
    var availabilityZoneId: js.UndefOr[String]
    var clientToken: js.UndefOr[ClientToken]
    var description: js.UndefOr[Description]
    var pendingPlan: js.UndefOr[SitePlan]
    var tags: js.UndefOr[TagMap]
  }

  object CreateNetworkSiteRequest {
    @inline
    def apply(
        networkArn: Arn,
        networkSiteName: Name,
        availabilityZone: js.UndefOr[String] = js.undefined,
        availabilityZoneId: js.UndefOr[String] = js.undefined,
        clientToken: js.UndefOr[ClientToken] = js.undefined,
        description: js.UndefOr[Description] = js.undefined,
        pendingPlan: js.UndefOr[SitePlan] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined
    ): CreateNetworkSiteRequest = {
      val __obj = js.Dynamic.literal(
        "networkArn" -> networkArn.asInstanceOf[js.Any],
        "networkSiteName" -> networkSiteName.asInstanceOf[js.Any]
      )

      availabilityZone.foreach(__v => __obj.updateDynamic("availabilityZone")(__v.asInstanceOf[js.Any]))
      availabilityZoneId.foreach(__v => __obj.updateDynamic("availabilityZoneId")(__v.asInstanceOf[js.Any]))
      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      pendingPlan.foreach(__v => __obj.updateDynamic("pendingPlan")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateNetworkSiteRequest]
    }
  }

  @js.native
  trait CreateNetworkSiteResponse extends js.Object {
    var networkSite: js.UndefOr[NetworkSite]
    var tags: js.UndefOr[TagMap]
  }

  object CreateNetworkSiteResponse {
    @inline
    def apply(
        networkSite: js.UndefOr[NetworkSite] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined
    ): CreateNetworkSiteResponse = {
      val __obj = js.Dynamic.literal()
      networkSite.foreach(__v => __obj.updateDynamic("networkSite")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateNetworkSiteResponse]
    }
  }

  @js.native
  trait DeactivateDeviceIdentifierRequest extends js.Object {
    var deviceIdentifierArn: Arn
    var clientToken: js.UndefOr[ClientToken]
  }

  object DeactivateDeviceIdentifierRequest {
    @inline
    def apply(
        deviceIdentifierArn: Arn,
        clientToken: js.UndefOr[ClientToken] = js.undefined
    ): DeactivateDeviceIdentifierRequest = {
      val __obj = js.Dynamic.literal(
        "deviceIdentifierArn" -> deviceIdentifierArn.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeactivateDeviceIdentifierRequest]
    }
  }

  @js.native
  trait DeactivateDeviceIdentifierResponse extends js.Object {
    var deviceIdentifier: DeviceIdentifier
  }

  object DeactivateDeviceIdentifierResponse {
    @inline
    def apply(
        deviceIdentifier: DeviceIdentifier
    ): DeactivateDeviceIdentifierResponse = {
      val __obj = js.Dynamic.literal(
        "deviceIdentifier" -> deviceIdentifier.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeactivateDeviceIdentifierResponse]
    }
  }

  @js.native
  trait DeleteNetworkRequest extends js.Object {
    var networkArn: Arn
    var clientToken: js.UndefOr[ClientToken]
  }

  object DeleteNetworkRequest {
    @inline
    def apply(
        networkArn: Arn,
        clientToken: js.UndefOr[ClientToken] = js.undefined
    ): DeleteNetworkRequest = {
      val __obj = js.Dynamic.literal(
        "networkArn" -> networkArn.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteNetworkRequest]
    }
  }

  @js.native
  trait DeleteNetworkResponse extends js.Object {
    var network: Network
  }

  object DeleteNetworkResponse {
    @inline
    def apply(
        network: Network
    ): DeleteNetworkResponse = {
      val __obj = js.Dynamic.literal(
        "network" -> network.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteNetworkResponse]
    }
  }

  @js.native
  trait DeleteNetworkSiteRequest extends js.Object {
    var networkSiteArn: Arn
    var clientToken: js.UndefOr[ClientToken]
  }

  object DeleteNetworkSiteRequest {
    @inline
    def apply(
        networkSiteArn: Arn,
        clientToken: js.UndefOr[ClientToken] = js.undefined
    ): DeleteNetworkSiteRequest = {
      val __obj = js.Dynamic.literal(
        "networkSiteArn" -> networkSiteArn.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteNetworkSiteRequest]
    }
  }

  @js.native
  trait DeleteNetworkSiteResponse extends js.Object {
    var networkSite: js.UndefOr[NetworkSite]
  }

  object DeleteNetworkSiteResponse {
    @inline
    def apply(
        networkSite: js.UndefOr[NetworkSite] = js.undefined
    ): DeleteNetworkSiteResponse = {
      val __obj = js.Dynamic.literal()
      networkSite.foreach(__v => __obj.updateDynamic("networkSite")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteNetworkSiteResponse]
    }
  }

  /** Information about a subscriber of a device that can use a network.
    */
  @js.native
  trait DeviceIdentifier extends js.Object {
    var createdAt: js.UndefOr[Timestamp]
    var deviceIdentifierArn: js.UndefOr[Arn]
    var iccid: js.UndefOr[String]
    var imsi: js.UndefOr[DeviceIdentifierImsiString]
    var networkArn: js.UndefOr[Arn]
    var orderArn: js.UndefOr[String]
    var status: js.UndefOr[DeviceIdentifierStatus]
    var trafficGroupArn: js.UndefOr[Arn]
    var vendor: js.UndefOr[String]
  }

  object DeviceIdentifier {
    @inline
    def apply(
        createdAt: js.UndefOr[Timestamp] = js.undefined,
        deviceIdentifierArn: js.UndefOr[Arn] = js.undefined,
        iccid: js.UndefOr[String] = js.undefined,
        imsi: js.UndefOr[DeviceIdentifierImsiString] = js.undefined,
        networkArn: js.UndefOr[Arn] = js.undefined,
        orderArn: js.UndefOr[String] = js.undefined,
        status: js.UndefOr[DeviceIdentifierStatus] = js.undefined,
        trafficGroupArn: js.UndefOr[Arn] = js.undefined,
        vendor: js.UndefOr[String] = js.undefined
    ): DeviceIdentifier = {
      val __obj = js.Dynamic.literal()
      createdAt.foreach(__v => __obj.updateDynamic("createdAt")(__v.asInstanceOf[js.Any]))
      deviceIdentifierArn.foreach(__v => __obj.updateDynamic("deviceIdentifierArn")(__v.asInstanceOf[js.Any]))
      iccid.foreach(__v => __obj.updateDynamic("iccid")(__v.asInstanceOf[js.Any]))
      imsi.foreach(__v => __obj.updateDynamic("imsi")(__v.asInstanceOf[js.Any]))
      networkArn.foreach(__v => __obj.updateDynamic("networkArn")(__v.asInstanceOf[js.Any]))
      orderArn.foreach(__v => __obj.updateDynamic("orderArn")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      trafficGroupArn.foreach(__v => __obj.updateDynamic("trafficGroupArn")(__v.asInstanceOf[js.Any]))
      vendor.foreach(__v => __obj.updateDynamic("vendor")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeviceIdentifier]
    }
  }

  @js.native
  trait GetDeviceIdentifierRequest extends js.Object {
    var deviceIdentifierArn: Arn
  }

  object GetDeviceIdentifierRequest {
    @inline
    def apply(
        deviceIdentifierArn: Arn
    ): GetDeviceIdentifierRequest = {
      val __obj = js.Dynamic.literal(
        "deviceIdentifierArn" -> deviceIdentifierArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetDeviceIdentifierRequest]
    }
  }

  @js.native
  trait GetDeviceIdentifierResponse extends js.Object {
    var deviceIdentifier: js.UndefOr[DeviceIdentifier]
    var tags: js.UndefOr[TagMap]
  }

  object GetDeviceIdentifierResponse {
    @inline
    def apply(
        deviceIdentifier: js.UndefOr[DeviceIdentifier] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined
    ): GetDeviceIdentifierResponse = {
      val __obj = js.Dynamic.literal()
      deviceIdentifier.foreach(__v => __obj.updateDynamic("deviceIdentifier")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDeviceIdentifierResponse]
    }
  }

  @js.native
  trait GetNetworkRequest extends js.Object {
    var networkArn: Arn
  }

  object GetNetworkRequest {
    @inline
    def apply(
        networkArn: Arn
    ): GetNetworkRequest = {
      val __obj = js.Dynamic.literal(
        "networkArn" -> networkArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetNetworkRequest]
    }
  }

  @js.native
  trait GetNetworkResourceRequest extends js.Object {
    var networkResourceArn: Arn
  }

  object GetNetworkResourceRequest {
    @inline
    def apply(
        networkResourceArn: Arn
    ): GetNetworkResourceRequest = {
      val __obj = js.Dynamic.literal(
        "networkResourceArn" -> networkResourceArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetNetworkResourceRequest]
    }
  }

  @js.native
  trait GetNetworkResourceResponse extends js.Object {
    var networkResource: NetworkResource
    var tags: js.UndefOr[TagMap]
  }

  object GetNetworkResourceResponse {
    @inline
    def apply(
        networkResource: NetworkResource,
        tags: js.UndefOr[TagMap] = js.undefined
    ): GetNetworkResourceResponse = {
      val __obj = js.Dynamic.literal(
        "networkResource" -> networkResource.asInstanceOf[js.Any]
      )

      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetNetworkResourceResponse]
    }
  }

  @js.native
  trait GetNetworkResponse extends js.Object {
    var network: Network
    var tags: js.UndefOr[TagMap]
  }

  object GetNetworkResponse {
    @inline
    def apply(
        network: Network,
        tags: js.UndefOr[TagMap] = js.undefined
    ): GetNetworkResponse = {
      val __obj = js.Dynamic.literal(
        "network" -> network.asInstanceOf[js.Any]
      )

      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetNetworkResponse]
    }
  }

  @js.native
  trait GetNetworkSiteRequest extends js.Object {
    var networkSiteArn: Arn
  }

  object GetNetworkSiteRequest {
    @inline
    def apply(
        networkSiteArn: Arn
    ): GetNetworkSiteRequest = {
      val __obj = js.Dynamic.literal(
        "networkSiteArn" -> networkSiteArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetNetworkSiteRequest]
    }
  }

  @js.native
  trait GetNetworkSiteResponse extends js.Object {
    var networkSite: js.UndefOr[NetworkSite]
    var tags: js.UndefOr[TagMap]
  }

  object GetNetworkSiteResponse {
    @inline
    def apply(
        networkSite: js.UndefOr[NetworkSite] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined
    ): GetNetworkSiteResponse = {
      val __obj = js.Dynamic.literal()
      networkSite.foreach(__v => __obj.updateDynamic("networkSite")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetNetworkSiteResponse]
    }
  }

  @js.native
  trait GetOrderRequest extends js.Object {
    var orderArn: Arn
  }

  object GetOrderRequest {
    @inline
    def apply(
        orderArn: Arn
    ): GetOrderRequest = {
      val __obj = js.Dynamic.literal(
        "orderArn" -> orderArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetOrderRequest]
    }
  }

  @js.native
  trait GetOrderResponse extends js.Object {
    var order: Order
    var tags: js.UndefOr[TagMap]
  }

  object GetOrderResponse {
    @inline
    def apply(
        order: Order,
        tags: js.UndefOr[TagMap] = js.undefined
    ): GetOrderResponse = {
      val __obj = js.Dynamic.literal(
        "order" -> order.asInstanceOf[js.Any]
      )

      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetOrderResponse]
    }
  }

  @js.native
  trait ListDeviceIdentifiersRequest extends js.Object {
    var networkArn: Arn
    var filters: js.UndefOr[DeviceIdentifierFilters]
    var maxResults: js.UndefOr[ListDeviceIdentifiersRequestMaxResultsInteger]
    var startToken: js.UndefOr[PaginationToken]
  }

  object ListDeviceIdentifiersRequest {
    @inline
    def apply(
        networkArn: Arn,
        filters: js.UndefOr[DeviceIdentifierFilters] = js.undefined,
        maxResults: js.UndefOr[ListDeviceIdentifiersRequestMaxResultsInteger] = js.undefined,
        startToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListDeviceIdentifiersRequest = {
      val __obj = js.Dynamic.literal(
        "networkArn" -> networkArn.asInstanceOf[js.Any]
      )

      filters.foreach(__v => __obj.updateDynamic("filters")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      startToken.foreach(__v => __obj.updateDynamic("startToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDeviceIdentifiersRequest]
    }
  }

  @js.native
  trait ListDeviceIdentifiersResponse extends js.Object {
    var deviceIdentifiers: js.UndefOr[DeviceIdentifierList]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListDeviceIdentifiersResponse {
    @inline
    def apply(
        deviceIdentifiers: js.UndefOr[DeviceIdentifierList] = js.undefined,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListDeviceIdentifiersResponse = {
      val __obj = js.Dynamic.literal()
      deviceIdentifiers.foreach(__v => __obj.updateDynamic("deviceIdentifiers")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDeviceIdentifiersResponse]
    }
  }

  @js.native
  trait ListNetworkResourcesRequest extends js.Object {
    var networkArn: Arn
    var filters: js.UndefOr[NetworkResourceFilters]
    var maxResults: js.UndefOr[ListNetworkResourcesRequestMaxResultsInteger]
    var startToken: js.UndefOr[PaginationToken]
  }

  object ListNetworkResourcesRequest {
    @inline
    def apply(
        networkArn: Arn,
        filters: js.UndefOr[NetworkResourceFilters] = js.undefined,
        maxResults: js.UndefOr[ListNetworkResourcesRequestMaxResultsInteger] = js.undefined,
        startToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListNetworkResourcesRequest = {
      val __obj = js.Dynamic.literal(
        "networkArn" -> networkArn.asInstanceOf[js.Any]
      )

      filters.foreach(__v => __obj.updateDynamic("filters")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      startToken.foreach(__v => __obj.updateDynamic("startToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListNetworkResourcesRequest]
    }
  }

  @js.native
  trait ListNetworkResourcesResponse extends js.Object {
    var networkResources: js.UndefOr[NetworkResourceList]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListNetworkResourcesResponse {
    @inline
    def apply(
        networkResources: js.UndefOr[NetworkResourceList] = js.undefined,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListNetworkResourcesResponse = {
      val __obj = js.Dynamic.literal()
      networkResources.foreach(__v => __obj.updateDynamic("networkResources")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListNetworkResourcesResponse]
    }
  }

  @js.native
  trait ListNetworkSitesRequest extends js.Object {
    var networkArn: Arn
    var filters: js.UndefOr[NetworkSiteFilters]
    var maxResults: js.UndefOr[ListNetworkSitesRequestMaxResultsInteger]
    var startToken: js.UndefOr[PaginationToken]
  }

  object ListNetworkSitesRequest {
    @inline
    def apply(
        networkArn: Arn,
        filters: js.UndefOr[NetworkSiteFilters] = js.undefined,
        maxResults: js.UndefOr[ListNetworkSitesRequestMaxResultsInteger] = js.undefined,
        startToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListNetworkSitesRequest = {
      val __obj = js.Dynamic.literal(
        "networkArn" -> networkArn.asInstanceOf[js.Any]
      )

      filters.foreach(__v => __obj.updateDynamic("filters")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      startToken.foreach(__v => __obj.updateDynamic("startToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListNetworkSitesRequest]
    }
  }

  @js.native
  trait ListNetworkSitesResponse extends js.Object {
    var networkSites: js.UndefOr[NetworkSiteList]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListNetworkSitesResponse {
    @inline
    def apply(
        networkSites: js.UndefOr[NetworkSiteList] = js.undefined,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListNetworkSitesResponse = {
      val __obj = js.Dynamic.literal()
      networkSites.foreach(__v => __obj.updateDynamic("networkSites")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListNetworkSitesResponse]
    }
  }

  @js.native
  trait ListNetworksRequest extends js.Object {
    var filters: js.UndefOr[NetworkFilters]
    var maxResults: js.UndefOr[ListNetworksRequestMaxResultsInteger]
    var startToken: js.UndefOr[PaginationToken]
  }

  object ListNetworksRequest {
    @inline
    def apply(
        filters: js.UndefOr[NetworkFilters] = js.undefined,
        maxResults: js.UndefOr[ListNetworksRequestMaxResultsInteger] = js.undefined,
        startToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListNetworksRequest = {
      val __obj = js.Dynamic.literal()
      filters.foreach(__v => __obj.updateDynamic("filters")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      startToken.foreach(__v => __obj.updateDynamic("startToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListNetworksRequest]
    }
  }

  @js.native
  trait ListNetworksResponse extends js.Object {
    var networks: js.UndefOr[NetworkList]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListNetworksResponse {
    @inline
    def apply(
        networks: js.UndefOr[NetworkList] = js.undefined,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListNetworksResponse = {
      val __obj = js.Dynamic.literal()
      networks.foreach(__v => __obj.updateDynamic("networks")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListNetworksResponse]
    }
  }

  @js.native
  trait ListOrdersRequest extends js.Object {
    var networkArn: Arn
    var filters: js.UndefOr[OrderFilters]
    var maxResults: js.UndefOr[ListOrdersRequestMaxResultsInteger]
    var startToken: js.UndefOr[PaginationToken]
  }

  object ListOrdersRequest {
    @inline
    def apply(
        networkArn: Arn,
        filters: js.UndefOr[OrderFilters] = js.undefined,
        maxResults: js.UndefOr[ListOrdersRequestMaxResultsInteger] = js.undefined,
        startToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListOrdersRequest = {
      val __obj = js.Dynamic.literal(
        "networkArn" -> networkArn.asInstanceOf[js.Any]
      )

      filters.foreach(__v => __obj.updateDynamic("filters")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      startToken.foreach(__v => __obj.updateDynamic("startToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListOrdersRequest]
    }
  }

  @js.native
  trait ListOrdersResponse extends js.Object {
    var nextToken: js.UndefOr[PaginationToken]
    var orders: js.UndefOr[OrderList]
  }

  object ListOrdersResponse {
    @inline
    def apply(
        nextToken: js.UndefOr[PaginationToken] = js.undefined,
        orders: js.UndefOr[OrderList] = js.undefined
    ): ListOrdersResponse = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      orders.foreach(__v => __obj.updateDynamic("orders")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListOrdersResponse]
    }
  }

  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var resourceArn: Arn
  }

  object ListTagsForResourceRequest {
    @inline
    def apply(
        resourceArn: Arn
    ): ListTagsForResourceRequest = {
      val __obj = js.Dynamic.literal(
        "resourceArn" -> resourceArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ListTagsForResourceRequest]
    }
  }

  @js.native
  trait ListTagsForResourceResponse extends js.Object {
    var tags: js.UndefOr[TagMap]
  }

  object ListTagsForResourceResponse {
    @inline
    def apply(
        tags: js.UndefOr[TagMap] = js.undefined
    ): ListTagsForResourceResponse = {
      val __obj = js.Dynamic.literal()
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceResponse]
    }
  }

  /** Information about a name/value pair.
    */
  @js.native
  trait NameValuePair extends js.Object {
    var name: String
    var value: js.UndefOr[String]
  }

  object NameValuePair {
    @inline
    def apply(
        name: String,
        value: js.UndefOr[String] = js.undefined
    ): NameValuePair = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any]
      )

      value.foreach(__v => __obj.updateDynamic("value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NameValuePair]
    }
  }

  /** Information about a network.
    */
  @js.native
  trait Network extends js.Object {
    var networkArn: Arn
    var networkName: Name
    var status: NetworkStatus
    var createdAt: js.UndefOr[Timestamp]
    var description: js.UndefOr[Description]
    var statusReason: js.UndefOr[String]
  }

  object Network {
    @inline
    def apply(
        networkArn: Arn,
        networkName: Name,
        status: NetworkStatus,
        createdAt: js.UndefOr[Timestamp] = js.undefined,
        description: js.UndefOr[Description] = js.undefined,
        statusReason: js.UndefOr[String] = js.undefined
    ): Network = {
      val __obj = js.Dynamic.literal(
        "networkArn" -> networkArn.asInstanceOf[js.Any],
        "networkName" -> networkName.asInstanceOf[js.Any],
        "status" -> status.asInstanceOf[js.Any]
      )

      createdAt.foreach(__v => __obj.updateDynamic("createdAt")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      statusReason.foreach(__v => __obj.updateDynamic("statusReason")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Network]
    }
  }

  /** Information about a network resource.
    */
  @js.native
  trait NetworkResource extends js.Object {
    var attributes: js.UndefOr[NameValuePairs]
    var createdAt: js.UndefOr[Timestamp]
    var description: js.UndefOr[Description]
    var health: js.UndefOr[HealthStatus]
    var model: js.UndefOr[String]
    var networkArn: js.UndefOr[Arn]
    var networkResourceArn: js.UndefOr[Arn]
    var networkSiteArn: js.UndefOr[Arn]
    var orderArn: js.UndefOr[Arn]
    var position: js.UndefOr[Position]
    var serialNumber: js.UndefOr[String]
    var status: js.UndefOr[NetworkResourceStatus]
    var statusReason: js.UndefOr[String]
    var `type`: js.UndefOr[NetworkResourceType]
    var vendor: js.UndefOr[String]
  }

  object NetworkResource {
    @inline
    def apply(
        attributes: js.UndefOr[NameValuePairs] = js.undefined,
        createdAt: js.UndefOr[Timestamp] = js.undefined,
        description: js.UndefOr[Description] = js.undefined,
        health: js.UndefOr[HealthStatus] = js.undefined,
        model: js.UndefOr[String] = js.undefined,
        networkArn: js.UndefOr[Arn] = js.undefined,
        networkResourceArn: js.UndefOr[Arn] = js.undefined,
        networkSiteArn: js.UndefOr[Arn] = js.undefined,
        orderArn: js.UndefOr[Arn] = js.undefined,
        position: js.UndefOr[Position] = js.undefined,
        serialNumber: js.UndefOr[String] = js.undefined,
        status: js.UndefOr[NetworkResourceStatus] = js.undefined,
        statusReason: js.UndefOr[String] = js.undefined,
        `type`: js.UndefOr[NetworkResourceType] = js.undefined,
        vendor: js.UndefOr[String] = js.undefined
    ): NetworkResource = {
      val __obj = js.Dynamic.literal()
      attributes.foreach(__v => __obj.updateDynamic("attributes")(__v.asInstanceOf[js.Any]))
      createdAt.foreach(__v => __obj.updateDynamic("createdAt")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      health.foreach(__v => __obj.updateDynamic("health")(__v.asInstanceOf[js.Any]))
      model.foreach(__v => __obj.updateDynamic("model")(__v.asInstanceOf[js.Any]))
      networkArn.foreach(__v => __obj.updateDynamic("networkArn")(__v.asInstanceOf[js.Any]))
      networkResourceArn.foreach(__v => __obj.updateDynamic("networkResourceArn")(__v.asInstanceOf[js.Any]))
      networkSiteArn.foreach(__v => __obj.updateDynamic("networkSiteArn")(__v.asInstanceOf[js.Any]))
      orderArn.foreach(__v => __obj.updateDynamic("orderArn")(__v.asInstanceOf[js.Any]))
      position.foreach(__v => __obj.updateDynamic("position")(__v.asInstanceOf[js.Any]))
      serialNumber.foreach(__v => __obj.updateDynamic("serialNumber")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      statusReason.foreach(__v => __obj.updateDynamic("statusReason")(__v.asInstanceOf[js.Any]))
      `type`.foreach(__v => __obj.updateDynamic("type")(__v.asInstanceOf[js.Any]))
      vendor.foreach(__v => __obj.updateDynamic("vendor")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NetworkResource]
    }
  }

  /** Information about a network resource definition.
    */
  @js.native
  trait NetworkResourceDefinition extends js.Object {
    var count: NetworkResourceDefinitionCountInteger
    var `type`: NetworkResourceDefinitionType
    var options: js.UndefOr[Options]
  }

  object NetworkResourceDefinition {
    @inline
    def apply(
        count: NetworkResourceDefinitionCountInteger,
        `type`: NetworkResourceDefinitionType,
        options: js.UndefOr[Options] = js.undefined
    ): NetworkResourceDefinition = {
      val __obj = js.Dynamic.literal(
        "count" -> count.asInstanceOf[js.Any],
        "type" -> `type`.asInstanceOf[js.Any]
      )

      options.foreach(__v => __obj.updateDynamic("options")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NetworkResourceDefinition]
    }
  }

  /** Information about a network site.
    */
  @js.native
  trait NetworkSite extends js.Object {
    var networkArn: Arn
    var networkSiteArn: Arn
    var networkSiteName: Name
    var status: NetworkSiteStatus
    var availabilityZone: js.UndefOr[String]
    var availabilityZoneId: js.UndefOr[String]
    var createdAt: js.UndefOr[Timestamp]
    var currentPlan: js.UndefOr[SitePlan]
    var description: js.UndefOr[Description]
    var pendingPlan: js.UndefOr[SitePlan]
    var statusReason: js.UndefOr[String]
  }

  object NetworkSite {
    @inline
    def apply(
        networkArn: Arn,
        networkSiteArn: Arn,
        networkSiteName: Name,
        status: NetworkSiteStatus,
        availabilityZone: js.UndefOr[String] = js.undefined,
        availabilityZoneId: js.UndefOr[String] = js.undefined,
        createdAt: js.UndefOr[Timestamp] = js.undefined,
        currentPlan: js.UndefOr[SitePlan] = js.undefined,
        description: js.UndefOr[Description] = js.undefined,
        pendingPlan: js.UndefOr[SitePlan] = js.undefined,
        statusReason: js.UndefOr[String] = js.undefined
    ): NetworkSite = {
      val __obj = js.Dynamic.literal(
        "networkArn" -> networkArn.asInstanceOf[js.Any],
        "networkSiteArn" -> networkSiteArn.asInstanceOf[js.Any],
        "networkSiteName" -> networkSiteName.asInstanceOf[js.Any],
        "status" -> status.asInstanceOf[js.Any]
      )

      availabilityZone.foreach(__v => __obj.updateDynamic("availabilityZone")(__v.asInstanceOf[js.Any]))
      availabilityZoneId.foreach(__v => __obj.updateDynamic("availabilityZoneId")(__v.asInstanceOf[js.Any]))
      createdAt.foreach(__v => __obj.updateDynamic("createdAt")(__v.asInstanceOf[js.Any]))
      currentPlan.foreach(__v => __obj.updateDynamic("currentPlan")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      pendingPlan.foreach(__v => __obj.updateDynamic("pendingPlan")(__v.asInstanceOf[js.Any]))
      statusReason.foreach(__v => __obj.updateDynamic("statusReason")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NetworkSite]
    }
  }

  /** Information about an order.
    */
  @js.native
  trait Order extends js.Object {
    var acknowledgmentStatus: js.UndefOr[AcknowledgmentStatus]
    var createdAt: js.UndefOr[Timestamp]
    var networkArn: js.UndefOr[Arn]
    var networkSiteArn: js.UndefOr[Arn]
    var orderArn: js.UndefOr[Arn]
    var shippingAddress: js.UndefOr[Address]
    var trackingInformation: js.UndefOr[TrackingInformationList]
  }

  object Order {
    @inline
    def apply(
        acknowledgmentStatus: js.UndefOr[AcknowledgmentStatus] = js.undefined,
        createdAt: js.UndefOr[Timestamp] = js.undefined,
        networkArn: js.UndefOr[Arn] = js.undefined,
        networkSiteArn: js.UndefOr[Arn] = js.undefined,
        orderArn: js.UndefOr[Arn] = js.undefined,
        shippingAddress: js.UndefOr[Address] = js.undefined,
        trackingInformation: js.UndefOr[TrackingInformationList] = js.undefined
    ): Order = {
      val __obj = js.Dynamic.literal()
      acknowledgmentStatus.foreach(__v => __obj.updateDynamic("acknowledgmentStatus")(__v.asInstanceOf[js.Any]))
      createdAt.foreach(__v => __obj.updateDynamic("createdAt")(__v.asInstanceOf[js.Any]))
      networkArn.foreach(__v => __obj.updateDynamic("networkArn")(__v.asInstanceOf[js.Any]))
      networkSiteArn.foreach(__v => __obj.updateDynamic("networkSiteArn")(__v.asInstanceOf[js.Any]))
      orderArn.foreach(__v => __obj.updateDynamic("orderArn")(__v.asInstanceOf[js.Any]))
      shippingAddress.foreach(__v => __obj.updateDynamic("shippingAddress")(__v.asInstanceOf[js.Any]))
      trackingInformation.foreach(__v => __obj.updateDynamic("trackingInformation")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Order]
    }
  }

  @js.native
  trait PingResponse extends js.Object {
    var status: js.UndefOr[String]
  }

  object PingResponse {
    @inline
    def apply(
        status: js.UndefOr[String] = js.undefined
    ): PingResponse = {
      val __obj = js.Dynamic.literal()
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PingResponse]
    }
  }

  /** Information about a position.
    */
  @js.native
  trait Position extends js.Object {
    var elevation: js.UndefOr[Double]
    var elevationReference: js.UndefOr[ElevationReference]
    var elevationUnit: js.UndefOr[ElevationUnit]
    var latitude: js.UndefOr[Double]
    var longitude: js.UndefOr[Double]
  }

  object Position {
    @inline
    def apply(
        elevation: js.UndefOr[Double] = js.undefined,
        elevationReference: js.UndefOr[ElevationReference] = js.undefined,
        elevationUnit: js.UndefOr[ElevationUnit] = js.undefined,
        latitude: js.UndefOr[Double] = js.undefined,
        longitude: js.UndefOr[Double] = js.undefined
    ): Position = {
      val __obj = js.Dynamic.literal()
      elevation.foreach(__v => __obj.updateDynamic("elevation")(__v.asInstanceOf[js.Any]))
      elevationReference.foreach(__v => __obj.updateDynamic("elevationReference")(__v.asInstanceOf[js.Any]))
      elevationUnit.foreach(__v => __obj.updateDynamic("elevationUnit")(__v.asInstanceOf[js.Any]))
      latitude.foreach(__v => __obj.updateDynamic("latitude")(__v.asInstanceOf[js.Any]))
      longitude.foreach(__v => __obj.updateDynamic("longitude")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Position]
    }
  }

  /** Information about a site plan.
    */
  @js.native
  trait SitePlan extends js.Object {
    var options: js.UndefOr[Options]
    var resourceDefinitions: js.UndefOr[NetworkResourceDefinitions]
  }

  object SitePlan {
    @inline
    def apply(
        options: js.UndefOr[Options] = js.undefined,
        resourceDefinitions: js.UndefOr[NetworkResourceDefinitions] = js.undefined
    ): SitePlan = {
      val __obj = js.Dynamic.literal()
      options.foreach(__v => __obj.updateDynamic("options")(__v.asInstanceOf[js.Any]))
      resourceDefinitions.foreach(__v => __obj.updateDynamic("resourceDefinitions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SitePlan]
    }
  }

  @js.native
  trait TagResourceRequest extends js.Object {
    var resourceArn: Arn
    var tags: TagMap
  }

  object TagResourceRequest {
    @inline
    def apply(
        resourceArn: Arn,
        tags: TagMap
    ): TagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "resourceArn" -> resourceArn.asInstanceOf[js.Any],
        "tags" -> tags.asInstanceOf[js.Any]
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

  /** Information about tracking a shipment.
    */
  @js.native
  trait TrackingInformation extends js.Object {
    var trackingNumber: js.UndefOr[String]
  }

  object TrackingInformation {
    @inline
    def apply(
        trackingNumber: js.UndefOr[String] = js.undefined
    ): TrackingInformation = {
      val __obj = js.Dynamic.literal()
      trackingNumber.foreach(__v => __obj.updateDynamic("trackingNumber")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TrackingInformation]
    }
  }

  @js.native
  trait UntagResourceRequest extends js.Object {
    var resourceArn: Arn
    var tagKeys: TagKeyList
  }

  object UntagResourceRequest {
    @inline
    def apply(
        resourceArn: Arn,
        tagKeys: TagKeyList
    ): UntagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "resourceArn" -> resourceArn.asInstanceOf[js.Any],
        "tagKeys" -> tagKeys.asInstanceOf[js.Any]
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
  trait UpdateNetworkSitePlanRequest extends js.Object {
    var networkSiteArn: Arn
    var pendingPlan: SitePlan
    var clientToken: js.UndefOr[ClientToken]
  }

  object UpdateNetworkSitePlanRequest {
    @inline
    def apply(
        networkSiteArn: Arn,
        pendingPlan: SitePlan,
        clientToken: js.UndefOr[ClientToken] = js.undefined
    ): UpdateNetworkSitePlanRequest = {
      val __obj = js.Dynamic.literal(
        "networkSiteArn" -> networkSiteArn.asInstanceOf[js.Any],
        "pendingPlan" -> pendingPlan.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateNetworkSitePlanRequest]
    }
  }

  @js.native
  trait UpdateNetworkSiteRequest extends js.Object {
    var networkSiteArn: Arn
    var clientToken: js.UndefOr[ClientToken]
    var description: js.UndefOr[Description]
  }

  object UpdateNetworkSiteRequest {
    @inline
    def apply(
        networkSiteArn: Arn,
        clientToken: js.UndefOr[ClientToken] = js.undefined,
        description: js.UndefOr[Description] = js.undefined
    ): UpdateNetworkSiteRequest = {
      val __obj = js.Dynamic.literal(
        "networkSiteArn" -> networkSiteArn.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateNetworkSiteRequest]
    }
  }

  @js.native
  trait UpdateNetworkSiteResponse extends js.Object {
    var networkSite: js.UndefOr[NetworkSite]
    var tags: js.UndefOr[TagMap]
  }

  object UpdateNetworkSiteResponse {
    @inline
    def apply(
        networkSite: js.UndefOr[NetworkSite] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined
    ): UpdateNetworkSiteResponse = {
      val __obj = js.Dynamic.literal()
      networkSite.foreach(__v => __obj.updateDynamic("networkSite")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateNetworkSiteResponse]
    }
  }
}
