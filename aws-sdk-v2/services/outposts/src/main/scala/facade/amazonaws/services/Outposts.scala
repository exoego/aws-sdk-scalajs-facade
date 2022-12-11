package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import scala.language.implicitConversions
import facade.amazonaws._

package object outposts {
  type AccountId = String
  type AddressLine1 = String
  type AddressLine2 = String
  type AddressLine3 = String
  type Arn = String
  type AssetId = String
  type AssetListDefinition = js.Array[AssetInfo]
  type AvailabilityZone = String
  type AvailabilityZoneId = String
  type AvailabilityZoneIdList = js.Array[AvailabilityZoneId]
  type AvailabilityZoneList = js.Array[AvailabilityZone]
  type CIDR = String
  type CIDRList = js.Array[CIDR]
  type CatalogItemClassList = js.Array[CatalogItemClass]
  type CatalogItemListDefinition = js.Array[CatalogItem]
  type CatalogItemPowerKva = Float
  type CatalogItemWeightLbs = Int
  type City = String
  type CityList = js.Array[City]
  type ConnectionId = String
  type ContactName = String
  type ContactPhoneNumber = String
  type CountryCode = String
  type CountryCodeList = js.Array[CountryCode]
  type DeviceSerialNumber = String
  type DistrictOrCounty = String
  type EC2CapacityListDefinition = js.Array[EC2Capacity]
  type EC2FamilyList = js.Array[Family]
  type Family = String
  type HostId = String
  type HostIdList = js.Array[HostId]
  type ISO8601Timestamp = js.Date
  type InstanceType = String
  type InstanceTypeListDefinition = js.Array[InstanceTypeItem]
  type LifeCycleStatus = String
  type LifeCycleStatusList = js.Array[LifeCycleStatus]
  type LineItemAssetInformationList = js.Array[LineItemAssetInformation]
  type LineItemId = String
  type LineItemListDefinition = js.Array[LineItem]
  type LineItemQuantity = Int
  type LineItemRequestListDefinition = js.Array[LineItemRequest]
  type LineItemStatusCounts = js.Dictionary[LineItemQuantity]
  type MacAddress = String
  type MacAddressList = js.Array[MacAddress]
  type MaxResults1000 = Int
  type MaxSize = String
  type Municipality = String
  type NetworkInterfaceDeviceIndex = Int
  type OrderId = String
  type OrderSummaryListDefinition = js.Array[OrderSummary]
  type OutpostArn = String
  type OutpostDescription = String
  type OutpostId = String
  type OutpostIdOnly = String
  type OutpostIdentifier = String
  type OutpostName = String
  type OwnerId = String
  type PostalCode = String
  type Quantity = String
  type RackElevation = Float
  type RackId = String
  type ServerEndpoint = String
  type SiteArn = String
  type SiteDescription = String
  type SiteId = String
  type SiteName = String
  type SiteNotes = String
  type SkuCode = String
  type StateOrRegion = String
  type StateOrRegionList = js.Array[StateOrRegion]
  type StatusList = js.Array[AssetState]
  type SupportedStorageList = js.Array[SupportedStorageEnum]
  type SupportedUplinkGbps = Int
  type SupportedUplinkGbpsListDefinition = js.Array[SupportedUplinkGbps]
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagMap = js.Dictionary[TagValue]
  type TagValue = String
  type Token = String
  type TrackingId = String
  type UnderlayIpAddress = String
  type WireGuardPublicKey = String
  type outpostListDefinition = js.Array[Outpost]
  type siteListDefinition = js.Array[Site]

  final class OutpostsOps(private val service: Outposts) extends AnyVal {

    @inline def cancelOrderFuture(params: CancelOrderInput): Future[CancelOrderOutput] = service.cancelOrder(params).promise().toFuture
    @inline def createOrderFuture(params: CreateOrderInput): Future[CreateOrderOutput] = service.createOrder(params).promise().toFuture
    @inline def createOutpostFuture(params: CreateOutpostInput): Future[CreateOutpostOutput] = service.createOutpost(params).promise().toFuture
    @inline def createSiteFuture(params: CreateSiteInput): Future[CreateSiteOutput] = service.createSite(params).promise().toFuture
    @inline def deleteOutpostFuture(params: DeleteOutpostInput): Future[DeleteOutpostOutput] = service.deleteOutpost(params).promise().toFuture
    @inline def deleteSiteFuture(params: DeleteSiteInput): Future[DeleteSiteOutput] = service.deleteSite(params).promise().toFuture
    @inline def getCatalogItemFuture(params: GetCatalogItemInput): Future[GetCatalogItemOutput] = service.getCatalogItem(params).promise().toFuture
    @inline def getConnectionFuture(params: GetConnectionRequest): Future[GetConnectionResponse] = service.getConnection(params).promise().toFuture
    @inline def getOrderFuture(params: GetOrderInput): Future[GetOrderOutput] = service.getOrder(params).promise().toFuture
    @inline def getOutpostFuture(params: GetOutpostInput): Future[GetOutpostOutput] = service.getOutpost(params).promise().toFuture
    @inline def getOutpostInstanceTypesFuture(params: GetOutpostInstanceTypesInput): Future[GetOutpostInstanceTypesOutput] = service.getOutpostInstanceTypes(params).promise().toFuture
    @inline def getSiteAddressFuture(params: GetSiteAddressInput): Future[GetSiteAddressOutput] = service.getSiteAddress(params).promise().toFuture
    @inline def getSiteFuture(params: GetSiteInput): Future[GetSiteOutput] = service.getSite(params).promise().toFuture
    @inline def listAssetsFuture(params: ListAssetsInput): Future[ListAssetsOutput] = service.listAssets(params).promise().toFuture
    @inline def listCatalogItemsFuture(params: ListCatalogItemsInput): Future[ListCatalogItemsOutput] = service.listCatalogItems(params).promise().toFuture
    @inline def listOrdersFuture(params: ListOrdersInput): Future[ListOrdersOutput] = service.listOrders(params).promise().toFuture
    @inline def listOutpostsFuture(params: ListOutpostsInput): Future[ListOutpostsOutput] = service.listOutposts(params).promise().toFuture
    @inline def listSitesFuture(params: ListSitesInput): Future[ListSitesOutput] = service.listSites(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] = service.listTagsForResource(params).promise().toFuture
    @inline def startConnectionFuture(params: StartConnectionRequest): Future[StartConnectionResponse] = service.startConnection(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] = service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] = service.untagResource(params).promise().toFuture
    @inline def updateOutpostFuture(params: UpdateOutpostInput): Future[UpdateOutpostOutput] = service.updateOutpost(params).promise().toFuture
    @inline def updateSiteAddressFuture(params: UpdateSiteAddressInput): Future[UpdateSiteAddressOutput] = service.updateSiteAddress(params).promise().toFuture
    @inline def updateSiteFuture(params: UpdateSiteInput): Future[UpdateSiteOutput] = service.updateSite(params).promise().toFuture
    @inline def updateSiteRackPhysicalPropertiesFuture(params: UpdateSiteRackPhysicalPropertiesInput): Future[UpdateSiteRackPhysicalPropertiesOutput] = service.updateSiteRackPhysicalProperties(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/outposts", JSImport.Namespace, "AWS.Outposts")
  class Outposts() extends js.Object {
    def this(config: AWSConfig) = this()

    def cancelOrder(params: CancelOrderInput): Request[CancelOrderOutput] = js.native
    def createOrder(params: CreateOrderInput): Request[CreateOrderOutput] = js.native
    def createOutpost(params: CreateOutpostInput): Request[CreateOutpostOutput] = js.native
    def createSite(params: CreateSiteInput): Request[CreateSiteOutput] = js.native
    def deleteOutpost(params: DeleteOutpostInput): Request[DeleteOutpostOutput] = js.native
    def deleteSite(params: DeleteSiteInput): Request[DeleteSiteOutput] = js.native
    def getCatalogItem(params: GetCatalogItemInput): Request[GetCatalogItemOutput] = js.native
    def getConnection(params: GetConnectionRequest): Request[GetConnectionResponse] = js.native
    def getOrder(params: GetOrderInput): Request[GetOrderOutput] = js.native
    def getOutpost(params: GetOutpostInput): Request[GetOutpostOutput] = js.native
    def getOutpostInstanceTypes(params: GetOutpostInstanceTypesInput): Request[GetOutpostInstanceTypesOutput] = js.native
    def getSite(params: GetSiteInput): Request[GetSiteOutput] = js.native
    def getSiteAddress(params: GetSiteAddressInput): Request[GetSiteAddressOutput] = js.native
    def listAssets(params: ListAssetsInput): Request[ListAssetsOutput] = js.native
    def listCatalogItems(params: ListCatalogItemsInput): Request[ListCatalogItemsOutput] = js.native
    def listOrders(params: ListOrdersInput): Request[ListOrdersOutput] = js.native
    def listOutposts(params: ListOutpostsInput): Request[ListOutpostsOutput] = js.native
    def listSites(params: ListSitesInput): Request[ListSitesOutput] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def startConnection(params: StartConnectionRequest): Request[StartConnectionResponse] = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse] = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse] = js.native
    def updateOutpost(params: UpdateOutpostInput): Request[UpdateOutpostOutput] = js.native
    def updateSite(params: UpdateSiteInput): Request[UpdateSiteOutput] = js.native
    def updateSiteAddress(params: UpdateSiteAddressInput): Request[UpdateSiteAddressOutput] = js.native
    def updateSiteRackPhysicalProperties(params: UpdateSiteRackPhysicalPropertiesInput): Request[UpdateSiteRackPhysicalPropertiesOutput] = js.native
  }
  object Outposts {
    @inline implicit def toOps(service: Outposts): OutpostsOps = {
      new OutpostsOps(service)
    }
  }

  /** Information about an address.
    */
  @js.native
  trait Address extends js.Object {
    var AddressLine1: AddressLine1
    var City: City
    var CountryCode: CountryCode
    var PostalCode: PostalCode
    var StateOrRegion: StateOrRegion
    var AddressLine2: js.UndefOr[AddressLine2]
    var AddressLine3: js.UndefOr[AddressLine3]
    var ContactName: js.UndefOr[ContactName]
    var ContactPhoneNumber: js.UndefOr[ContactPhoneNumber]
    var DistrictOrCounty: js.UndefOr[DistrictOrCounty]
    var Municipality: js.UndefOr[Municipality]
  }

  object Address {
    @inline
    def apply(
        AddressLine1: AddressLine1,
        City: City,
        CountryCode: CountryCode,
        PostalCode: PostalCode,
        StateOrRegion: StateOrRegion,
        AddressLine2: js.UndefOr[AddressLine2] = js.undefined,
        AddressLine3: js.UndefOr[AddressLine3] = js.undefined,
        ContactName: js.UndefOr[ContactName] = js.undefined,
        ContactPhoneNumber: js.UndefOr[ContactPhoneNumber] = js.undefined,
        DistrictOrCounty: js.UndefOr[DistrictOrCounty] = js.undefined,
        Municipality: js.UndefOr[Municipality] = js.undefined
    ): Address = {
      val __obj = js.Dynamic.literal(
        "AddressLine1" -> AddressLine1.asInstanceOf[js.Any],
        "City" -> City.asInstanceOf[js.Any],
        "CountryCode" -> CountryCode.asInstanceOf[js.Any],
        "PostalCode" -> PostalCode.asInstanceOf[js.Any],
        "StateOrRegion" -> StateOrRegion.asInstanceOf[js.Any]
      )

      AddressLine2.foreach(__v => __obj.updateDynamic("AddressLine2")(__v.asInstanceOf[js.Any]))
      AddressLine3.foreach(__v => __obj.updateDynamic("AddressLine3")(__v.asInstanceOf[js.Any]))
      ContactName.foreach(__v => __obj.updateDynamic("ContactName")(__v.asInstanceOf[js.Any]))
      ContactPhoneNumber.foreach(__v => __obj.updateDynamic("ContactPhoneNumber")(__v.asInstanceOf[js.Any]))
      DistrictOrCounty.foreach(__v => __obj.updateDynamic("DistrictOrCounty")(__v.asInstanceOf[js.Any]))
      Municipality.foreach(__v => __obj.updateDynamic("Municipality")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Address]
    }
  }

  /** Information about hardware assets.
    */
  @js.native
  trait AssetInfo extends js.Object {
    var AssetId: js.UndefOr[AssetId]
    var AssetLocation: js.UndefOr[AssetLocation]
    var AssetType: js.UndefOr[AssetType]
    var ComputeAttributes: js.UndefOr[ComputeAttributes]
    var RackId: js.UndefOr[RackId]
  }

  object AssetInfo {
    @inline
    def apply(
        AssetId: js.UndefOr[AssetId] = js.undefined,
        AssetLocation: js.UndefOr[AssetLocation] = js.undefined,
        AssetType: js.UndefOr[AssetType] = js.undefined,
        ComputeAttributes: js.UndefOr[ComputeAttributes] = js.undefined,
        RackId: js.UndefOr[RackId] = js.undefined
    ): AssetInfo = {
      val __obj = js.Dynamic.literal()
      AssetId.foreach(__v => __obj.updateDynamic("AssetId")(__v.asInstanceOf[js.Any]))
      AssetLocation.foreach(__v => __obj.updateDynamic("AssetLocation")(__v.asInstanceOf[js.Any]))
      AssetType.foreach(__v => __obj.updateDynamic("AssetType")(__v.asInstanceOf[js.Any]))
      ComputeAttributes.foreach(__v => __obj.updateDynamic("ComputeAttributes")(__v.asInstanceOf[js.Any]))
      RackId.foreach(__v => __obj.updateDynamic("RackId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssetInfo]
    }
  }

  /** Information about the position of the asset in a rack.
    */
  @js.native
  trait AssetLocation extends js.Object {
    var RackElevation: js.UndefOr[RackElevation]
  }

  object AssetLocation {
    @inline
    def apply(
        RackElevation: js.UndefOr[RackElevation] = js.undefined
    ): AssetLocation = {
      val __obj = js.Dynamic.literal()
      RackElevation.foreach(__v => __obj.updateDynamic("RackElevation")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssetLocation]
    }
  }

  @js.native
  trait CancelOrderInput extends js.Object {
    var OrderId: OrderId
  }

  object CancelOrderInput {
    @inline
    def apply(
        OrderId: OrderId
    ): CancelOrderInput = {
      val __obj = js.Dynamic.literal(
        "OrderId" -> OrderId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CancelOrderInput]
    }
  }

  @js.native
  trait CancelOrderOutput extends js.Object

  object CancelOrderOutput {
    @inline
    def apply(): CancelOrderOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CancelOrderOutput]
    }
  }

  /** Information about a catalog item.
    */
  @js.native
  trait CatalogItem extends js.Object {
    var CatalogItemId: js.UndefOr[SkuCode]
    var EC2Capacities: js.UndefOr[EC2CapacityListDefinition]
    var ItemStatus: js.UndefOr[CatalogItemStatus]
    var PowerKva: js.UndefOr[CatalogItemPowerKva]
    var SupportedStorage: js.UndefOr[SupportedStorageList]
    var SupportedUplinkGbps: js.UndefOr[SupportedUplinkGbpsListDefinition]
    var WeightLbs: js.UndefOr[CatalogItemWeightLbs]
  }

  object CatalogItem {
    @inline
    def apply(
        CatalogItemId: js.UndefOr[SkuCode] = js.undefined,
        EC2Capacities: js.UndefOr[EC2CapacityListDefinition] = js.undefined,
        ItemStatus: js.UndefOr[CatalogItemStatus] = js.undefined,
        PowerKva: js.UndefOr[CatalogItemPowerKva] = js.undefined,
        SupportedStorage: js.UndefOr[SupportedStorageList] = js.undefined,
        SupportedUplinkGbps: js.UndefOr[SupportedUplinkGbpsListDefinition] = js.undefined,
        WeightLbs: js.UndefOr[CatalogItemWeightLbs] = js.undefined
    ): CatalogItem = {
      val __obj = js.Dynamic.literal()
      CatalogItemId.foreach(__v => __obj.updateDynamic("CatalogItemId")(__v.asInstanceOf[js.Any]))
      EC2Capacities.foreach(__v => __obj.updateDynamic("EC2Capacities")(__v.asInstanceOf[js.Any]))
      ItemStatus.foreach(__v => __obj.updateDynamic("ItemStatus")(__v.asInstanceOf[js.Any]))
      PowerKva.foreach(__v => __obj.updateDynamic("PowerKva")(__v.asInstanceOf[js.Any]))
      SupportedStorage.foreach(__v => __obj.updateDynamic("SupportedStorage")(__v.asInstanceOf[js.Any]))
      SupportedUplinkGbps.foreach(__v => __obj.updateDynamic("SupportedUplinkGbps")(__v.asInstanceOf[js.Any]))
      WeightLbs.foreach(__v => __obj.updateDynamic("WeightLbs")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CatalogItem]
    }
  }

  /** Information about compute hardware assets.
    */
  @js.native
  trait ComputeAttributes extends js.Object {
    var HostId: js.UndefOr[HostId]
    var State: js.UndefOr[ComputeAssetState]
  }

  object ComputeAttributes {
    @inline
    def apply(
        HostId: js.UndefOr[HostId] = js.undefined,
        State: js.UndefOr[ComputeAssetState] = js.undefined
    ): ComputeAttributes = {
      val __obj = js.Dynamic.literal()
      HostId.foreach(__v => __obj.updateDynamic("HostId")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ComputeAttributes]
    }
  }

  /** Information about a connection.
    */
  @js.native
  trait ConnectionDetails extends js.Object {
    var AllowedIps: js.UndefOr[CIDRList]
    var ClientPublicKey: js.UndefOr[WireGuardPublicKey]
    var ClientTunnelAddress: js.UndefOr[CIDR]
    var ServerEndpoint: js.UndefOr[ServerEndpoint]
    var ServerPublicKey: js.UndefOr[WireGuardPublicKey]
    var ServerTunnelAddress: js.UndefOr[CIDR]
  }

  object ConnectionDetails {
    @inline
    def apply(
        AllowedIps: js.UndefOr[CIDRList] = js.undefined,
        ClientPublicKey: js.UndefOr[WireGuardPublicKey] = js.undefined,
        ClientTunnelAddress: js.UndefOr[CIDR] = js.undefined,
        ServerEndpoint: js.UndefOr[ServerEndpoint] = js.undefined,
        ServerPublicKey: js.UndefOr[WireGuardPublicKey] = js.undefined,
        ServerTunnelAddress: js.UndefOr[CIDR] = js.undefined
    ): ConnectionDetails = {
      val __obj = js.Dynamic.literal()
      AllowedIps.foreach(__v => __obj.updateDynamic("AllowedIps")(__v.asInstanceOf[js.Any]))
      ClientPublicKey.foreach(__v => __obj.updateDynamic("ClientPublicKey")(__v.asInstanceOf[js.Any]))
      ClientTunnelAddress.foreach(__v => __obj.updateDynamic("ClientTunnelAddress")(__v.asInstanceOf[js.Any]))
      ServerEndpoint.foreach(__v => __obj.updateDynamic("ServerEndpoint")(__v.asInstanceOf[js.Any]))
      ServerPublicKey.foreach(__v => __obj.updateDynamic("ServerPublicKey")(__v.asInstanceOf[js.Any]))
      ServerTunnelAddress.foreach(__v => __obj.updateDynamic("ServerTunnelAddress")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ConnectionDetails]
    }
  }

  @js.native
  trait CreateOrderInput extends js.Object {
    var LineItems: LineItemRequestListDefinition
    var OutpostIdentifier: OutpostIdentifier
    var PaymentOption: PaymentOption
    var PaymentTerm: js.UndefOr[PaymentTerm]
  }

  object CreateOrderInput {
    @inline
    def apply(
        LineItems: LineItemRequestListDefinition,
        OutpostIdentifier: OutpostIdentifier,
        PaymentOption: PaymentOption,
        PaymentTerm: js.UndefOr[PaymentTerm] = js.undefined
    ): CreateOrderInput = {
      val __obj = js.Dynamic.literal(
        "LineItems" -> LineItems.asInstanceOf[js.Any],
        "OutpostIdentifier" -> OutpostIdentifier.asInstanceOf[js.Any],
        "PaymentOption" -> PaymentOption.asInstanceOf[js.Any]
      )

      PaymentTerm.foreach(__v => __obj.updateDynamic("PaymentTerm")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateOrderInput]
    }
  }

  @js.native
  trait CreateOrderOutput extends js.Object {
    var Order: js.UndefOr[Order]
  }

  object CreateOrderOutput {
    @inline
    def apply(
        Order: js.UndefOr[Order] = js.undefined
    ): CreateOrderOutput = {
      val __obj = js.Dynamic.literal()
      Order.foreach(__v => __obj.updateDynamic("Order")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateOrderOutput]
    }
  }

  @js.native
  trait CreateOutpostInput extends js.Object {
    var Name: OutpostName
    var SiteId: SiteId
    var AvailabilityZone: js.UndefOr[AvailabilityZone]
    var AvailabilityZoneId: js.UndefOr[AvailabilityZoneId]
    var Description: js.UndefOr[OutpostDescription]
    var SupportedHardwareType: js.UndefOr[SupportedHardwareType]
    var Tags: js.UndefOr[TagMap]
  }

  object CreateOutpostInput {
    @inline
    def apply(
        Name: OutpostName,
        SiteId: SiteId,
        AvailabilityZone: js.UndefOr[AvailabilityZone] = js.undefined,
        AvailabilityZoneId: js.UndefOr[AvailabilityZoneId] = js.undefined,
        Description: js.UndefOr[OutpostDescription] = js.undefined,
        SupportedHardwareType: js.UndefOr[SupportedHardwareType] = js.undefined,
        Tags: js.UndefOr[TagMap] = js.undefined
    ): CreateOutpostInput = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "SiteId" -> SiteId.asInstanceOf[js.Any]
      )

      AvailabilityZone.foreach(__v => __obj.updateDynamic("AvailabilityZone")(__v.asInstanceOf[js.Any]))
      AvailabilityZoneId.foreach(__v => __obj.updateDynamic("AvailabilityZoneId")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      SupportedHardwareType.foreach(__v => __obj.updateDynamic("SupportedHardwareType")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateOutpostInput]
    }
  }

  @js.native
  trait CreateOutpostOutput extends js.Object {
    var Outpost: js.UndefOr[Outpost]
  }

  object CreateOutpostOutput {
    @inline
    def apply(
        Outpost: js.UndefOr[Outpost] = js.undefined
    ): CreateOutpostOutput = {
      val __obj = js.Dynamic.literal()
      Outpost.foreach(__v => __obj.updateDynamic("Outpost")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateOutpostOutput]
    }
  }

  @js.native
  trait CreateSiteInput extends js.Object {
    var Name: SiteName
    var Description: js.UndefOr[SiteDescription]
    var Notes: js.UndefOr[SiteNotes]
    var OperatingAddress: js.UndefOr[Address]
    var RackPhysicalProperties: js.UndefOr[RackPhysicalProperties]
    var ShippingAddress: js.UndefOr[Address]
    var Tags: js.UndefOr[TagMap]
  }

  object CreateSiteInput {
    @inline
    def apply(
        Name: SiteName,
        Description: js.UndefOr[SiteDescription] = js.undefined,
        Notes: js.UndefOr[SiteNotes] = js.undefined,
        OperatingAddress: js.UndefOr[Address] = js.undefined,
        RackPhysicalProperties: js.UndefOr[RackPhysicalProperties] = js.undefined,
        ShippingAddress: js.UndefOr[Address] = js.undefined,
        Tags: js.UndefOr[TagMap] = js.undefined
    ): CreateSiteInput = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Notes.foreach(__v => __obj.updateDynamic("Notes")(__v.asInstanceOf[js.Any]))
      OperatingAddress.foreach(__v => __obj.updateDynamic("OperatingAddress")(__v.asInstanceOf[js.Any]))
      RackPhysicalProperties.foreach(__v => __obj.updateDynamic("RackPhysicalProperties")(__v.asInstanceOf[js.Any]))
      ShippingAddress.foreach(__v => __obj.updateDynamic("ShippingAddress")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateSiteInput]
    }
  }

  @js.native
  trait CreateSiteOutput extends js.Object {
    var Site: js.UndefOr[Site]
  }

  object CreateSiteOutput {
    @inline
    def apply(
        Site: js.UndefOr[Site] = js.undefined
    ): CreateSiteOutput = {
      val __obj = js.Dynamic.literal()
      Site.foreach(__v => __obj.updateDynamic("Site")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateSiteOutput]
    }
  }

  @js.native
  trait DeleteOutpostInput extends js.Object {
    var OutpostId: OutpostId
  }

  object DeleteOutpostInput {
    @inline
    def apply(
        OutpostId: OutpostId
    ): DeleteOutpostInput = {
      val __obj = js.Dynamic.literal(
        "OutpostId" -> OutpostId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteOutpostInput]
    }
  }

  @js.native
  trait DeleteOutpostOutput extends js.Object

  object DeleteOutpostOutput {
    @inline
    def apply(): DeleteOutpostOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteOutpostOutput]
    }
  }

  @js.native
  trait DeleteSiteInput extends js.Object {
    var SiteId: SiteId
  }

  object DeleteSiteInput {
    @inline
    def apply(
        SiteId: SiteId
    ): DeleteSiteInput = {
      val __obj = js.Dynamic.literal(
        "SiteId" -> SiteId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteSiteInput]
    }
  }

  @js.native
  trait DeleteSiteOutput extends js.Object

  object DeleteSiteOutput {
    @inline
    def apply(): DeleteSiteOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteSiteOutput]
    }
  }

  /** Information about EC2 capacity.
    */
  @js.native
  trait EC2Capacity extends js.Object {
    var Family: js.UndefOr[Family]
    var MaxSize: js.UndefOr[MaxSize]
    var Quantity: js.UndefOr[Quantity]
  }

  object EC2Capacity {
    @inline
    def apply(
        Family: js.UndefOr[Family] = js.undefined,
        MaxSize: js.UndefOr[MaxSize] = js.undefined,
        Quantity: js.UndefOr[Quantity] = js.undefined
    ): EC2Capacity = {
      val __obj = js.Dynamic.literal()
      Family.foreach(__v => __obj.updateDynamic("Family")(__v.asInstanceOf[js.Any]))
      MaxSize.foreach(__v => __obj.updateDynamic("MaxSize")(__v.asInstanceOf[js.Any]))
      Quantity.foreach(__v => __obj.updateDynamic("Quantity")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EC2Capacity]
    }
  }

  @js.native
  trait GetCatalogItemInput extends js.Object {
    var CatalogItemId: SkuCode
  }

  object GetCatalogItemInput {
    @inline
    def apply(
        CatalogItemId: SkuCode
    ): GetCatalogItemInput = {
      val __obj = js.Dynamic.literal(
        "CatalogItemId" -> CatalogItemId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetCatalogItemInput]
    }
  }

  @js.native
  trait GetCatalogItemOutput extends js.Object {
    var CatalogItem: js.UndefOr[CatalogItem]
  }

  object GetCatalogItemOutput {
    @inline
    def apply(
        CatalogItem: js.UndefOr[CatalogItem] = js.undefined
    ): GetCatalogItemOutput = {
      val __obj = js.Dynamic.literal()
      CatalogItem.foreach(__v => __obj.updateDynamic("CatalogItem")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetCatalogItemOutput]
    }
  }

  @js.native
  trait GetConnectionRequest extends js.Object {
    var ConnectionId: ConnectionId
  }

  object GetConnectionRequest {
    @inline
    def apply(
        ConnectionId: ConnectionId
    ): GetConnectionRequest = {
      val __obj = js.Dynamic.literal(
        "ConnectionId" -> ConnectionId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetConnectionRequest]
    }
  }

  @js.native
  trait GetConnectionResponse extends js.Object {
    var ConnectionDetails: js.UndefOr[ConnectionDetails]
    var ConnectionId: js.UndefOr[ConnectionId]
  }

  object GetConnectionResponse {
    @inline
    def apply(
        ConnectionDetails: js.UndefOr[ConnectionDetails] = js.undefined,
        ConnectionId: js.UndefOr[ConnectionId] = js.undefined
    ): GetConnectionResponse = {
      val __obj = js.Dynamic.literal()
      ConnectionDetails.foreach(__v => __obj.updateDynamic("ConnectionDetails")(__v.asInstanceOf[js.Any]))
      ConnectionId.foreach(__v => __obj.updateDynamic("ConnectionId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetConnectionResponse]
    }
  }

  @js.native
  trait GetOrderInput extends js.Object {
    var OrderId: OrderId
  }

  object GetOrderInput {
    @inline
    def apply(
        OrderId: OrderId
    ): GetOrderInput = {
      val __obj = js.Dynamic.literal(
        "OrderId" -> OrderId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetOrderInput]
    }
  }

  @js.native
  trait GetOrderOutput extends js.Object {
    var Order: js.UndefOr[Order]
  }

  object GetOrderOutput {
    @inline
    def apply(
        Order: js.UndefOr[Order] = js.undefined
    ): GetOrderOutput = {
      val __obj = js.Dynamic.literal()
      Order.foreach(__v => __obj.updateDynamic("Order")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetOrderOutput]
    }
  }

  @js.native
  trait GetOutpostInput extends js.Object {
    var OutpostId: OutpostId
  }

  object GetOutpostInput {
    @inline
    def apply(
        OutpostId: OutpostId
    ): GetOutpostInput = {
      val __obj = js.Dynamic.literal(
        "OutpostId" -> OutpostId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetOutpostInput]
    }
  }

  @js.native
  trait GetOutpostInstanceTypesInput extends js.Object {
    var OutpostId: OutpostId
    var MaxResults: js.UndefOr[MaxResults1000]
    var NextToken: js.UndefOr[Token]
  }

  object GetOutpostInstanceTypesInput {
    @inline
    def apply(
        OutpostId: OutpostId,
        MaxResults: js.UndefOr[MaxResults1000] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined
    ): GetOutpostInstanceTypesInput = {
      val __obj = js.Dynamic.literal(
        "OutpostId" -> OutpostId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetOutpostInstanceTypesInput]
    }
  }

  @js.native
  trait GetOutpostInstanceTypesOutput extends js.Object {
    var InstanceTypes: js.UndefOr[InstanceTypeListDefinition]
    var NextToken: js.UndefOr[Token]
    var OutpostArn: js.UndefOr[OutpostArn]
    var OutpostId: js.UndefOr[OutpostId]
  }

  object GetOutpostInstanceTypesOutput {
    @inline
    def apply(
        InstanceTypes: js.UndefOr[InstanceTypeListDefinition] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined,
        OutpostArn: js.UndefOr[OutpostArn] = js.undefined,
        OutpostId: js.UndefOr[OutpostId] = js.undefined
    ): GetOutpostInstanceTypesOutput = {
      val __obj = js.Dynamic.literal()
      InstanceTypes.foreach(__v => __obj.updateDynamic("InstanceTypes")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      OutpostArn.foreach(__v => __obj.updateDynamic("OutpostArn")(__v.asInstanceOf[js.Any]))
      OutpostId.foreach(__v => __obj.updateDynamic("OutpostId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetOutpostInstanceTypesOutput]
    }
  }

  @js.native
  trait GetOutpostOutput extends js.Object {
    var Outpost: js.UndefOr[Outpost]
  }

  object GetOutpostOutput {
    @inline
    def apply(
        Outpost: js.UndefOr[Outpost] = js.undefined
    ): GetOutpostOutput = {
      val __obj = js.Dynamic.literal()
      Outpost.foreach(__v => __obj.updateDynamic("Outpost")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetOutpostOutput]
    }
  }

  @js.native
  trait GetSiteAddressInput extends js.Object {
    var AddressType: AddressType
    var SiteId: SiteId
  }

  object GetSiteAddressInput {
    @inline
    def apply(
        AddressType: AddressType,
        SiteId: SiteId
    ): GetSiteAddressInput = {
      val __obj = js.Dynamic.literal(
        "AddressType" -> AddressType.asInstanceOf[js.Any],
        "SiteId" -> SiteId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetSiteAddressInput]
    }
  }

  @js.native
  trait GetSiteAddressOutput extends js.Object {
    var Address: js.UndefOr[Address]
    var AddressType: js.UndefOr[AddressType]
    var SiteId: js.UndefOr[SiteId]
  }

  object GetSiteAddressOutput {
    @inline
    def apply(
        Address: js.UndefOr[Address] = js.undefined,
        AddressType: js.UndefOr[AddressType] = js.undefined,
        SiteId: js.UndefOr[SiteId] = js.undefined
    ): GetSiteAddressOutput = {
      val __obj = js.Dynamic.literal()
      Address.foreach(__v => __obj.updateDynamic("Address")(__v.asInstanceOf[js.Any]))
      AddressType.foreach(__v => __obj.updateDynamic("AddressType")(__v.asInstanceOf[js.Any]))
      SiteId.foreach(__v => __obj.updateDynamic("SiteId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetSiteAddressOutput]
    }
  }

  @js.native
  trait GetSiteInput extends js.Object {
    var SiteId: SiteId
  }

  object GetSiteInput {
    @inline
    def apply(
        SiteId: SiteId
    ): GetSiteInput = {
      val __obj = js.Dynamic.literal(
        "SiteId" -> SiteId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetSiteInput]
    }
  }

  @js.native
  trait GetSiteOutput extends js.Object {
    var Site: js.UndefOr[Site]
  }

  object GetSiteOutput {
    @inline
    def apply(
        Site: js.UndefOr[Site] = js.undefined
    ): GetSiteOutput = {
      val __obj = js.Dynamic.literal()
      Site.foreach(__v => __obj.updateDynamic("Site")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetSiteOutput]
    }
  }

  /** Information about an instance type.
    */
  @js.native
  trait InstanceTypeItem extends js.Object {
    var InstanceType: js.UndefOr[InstanceType]
  }

  object InstanceTypeItem {
    @inline
    def apply(
        InstanceType: js.UndefOr[InstanceType] = js.undefined
    ): InstanceTypeItem = {
      val __obj = js.Dynamic.literal()
      InstanceType.foreach(__v => __obj.updateDynamic("InstanceType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InstanceTypeItem]
    }
  }

  /** Information about a line item.
    */
  @js.native
  trait LineItem extends js.Object {
    var AssetInformationList: js.UndefOr[LineItemAssetInformationList]
    var CatalogItemId: js.UndefOr[SkuCode]
    var LineItemId: js.UndefOr[LineItemId]
    var Quantity: js.UndefOr[LineItemQuantity]
    var ShipmentInformation: js.UndefOr[ShipmentInformation]
    var Status: js.UndefOr[LineItemStatus]
  }

  object LineItem {
    @inline
    def apply(
        AssetInformationList: js.UndefOr[LineItemAssetInformationList] = js.undefined,
        CatalogItemId: js.UndefOr[SkuCode] = js.undefined,
        LineItemId: js.UndefOr[LineItemId] = js.undefined,
        Quantity: js.UndefOr[LineItemQuantity] = js.undefined,
        ShipmentInformation: js.UndefOr[ShipmentInformation] = js.undefined,
        Status: js.UndefOr[LineItemStatus] = js.undefined
    ): LineItem = {
      val __obj = js.Dynamic.literal()
      AssetInformationList.foreach(__v => __obj.updateDynamic("AssetInformationList")(__v.asInstanceOf[js.Any]))
      CatalogItemId.foreach(__v => __obj.updateDynamic("CatalogItemId")(__v.asInstanceOf[js.Any]))
      LineItemId.foreach(__v => __obj.updateDynamic("LineItemId")(__v.asInstanceOf[js.Any]))
      Quantity.foreach(__v => __obj.updateDynamic("Quantity")(__v.asInstanceOf[js.Any]))
      ShipmentInformation.foreach(__v => __obj.updateDynamic("ShipmentInformation")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LineItem]
    }
  }

  /** Information about a line item asset.
    */
  @js.native
  trait LineItemAssetInformation extends js.Object {
    var AssetId: js.UndefOr[AssetId]
    var MacAddressList: js.UndefOr[MacAddressList]
  }

  object LineItemAssetInformation {
    @inline
    def apply(
        AssetId: js.UndefOr[AssetId] = js.undefined,
        MacAddressList: js.UndefOr[MacAddressList] = js.undefined
    ): LineItemAssetInformation = {
      val __obj = js.Dynamic.literal()
      AssetId.foreach(__v => __obj.updateDynamic("AssetId")(__v.asInstanceOf[js.Any]))
      MacAddressList.foreach(__v => __obj.updateDynamic("MacAddressList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LineItemAssetInformation]
    }
  }

  /** Information about a line item request.
    */
  @js.native
  trait LineItemRequest extends js.Object {
    var CatalogItemId: js.UndefOr[SkuCode]
    var Quantity: js.UndefOr[LineItemQuantity]
  }

  object LineItemRequest {
    @inline
    def apply(
        CatalogItemId: js.UndefOr[SkuCode] = js.undefined,
        Quantity: js.UndefOr[LineItemQuantity] = js.undefined
    ): LineItemRequest = {
      val __obj = js.Dynamic.literal()
      CatalogItemId.foreach(__v => __obj.updateDynamic("CatalogItemId")(__v.asInstanceOf[js.Any]))
      Quantity.foreach(__v => __obj.updateDynamic("Quantity")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LineItemRequest]
    }
  }

  @js.native
  trait ListAssetsInput extends js.Object {
    var OutpostIdentifier: OutpostIdentifier
    var HostIdFilter: js.UndefOr[HostIdList]
    var MaxResults: js.UndefOr[MaxResults1000]
    var NextToken: js.UndefOr[Token]
    var StatusFilter: js.UndefOr[StatusList]
  }

  object ListAssetsInput {
    @inline
    def apply(
        OutpostIdentifier: OutpostIdentifier,
        HostIdFilter: js.UndefOr[HostIdList] = js.undefined,
        MaxResults: js.UndefOr[MaxResults1000] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined,
        StatusFilter: js.UndefOr[StatusList] = js.undefined
    ): ListAssetsInput = {
      val __obj = js.Dynamic.literal(
        "OutpostIdentifier" -> OutpostIdentifier.asInstanceOf[js.Any]
      )

      HostIdFilter.foreach(__v => __obj.updateDynamic("HostIdFilter")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      StatusFilter.foreach(__v => __obj.updateDynamic("StatusFilter")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAssetsInput]
    }
  }

  @js.native
  trait ListAssetsOutput extends js.Object {
    var Assets: js.UndefOr[AssetListDefinition]
    var NextToken: js.UndefOr[Token]
  }

  object ListAssetsOutput {
    @inline
    def apply(
        Assets: js.UndefOr[AssetListDefinition] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined
    ): ListAssetsOutput = {
      val __obj = js.Dynamic.literal()
      Assets.foreach(__v => __obj.updateDynamic("Assets")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAssetsOutput]
    }
  }

  @js.native
  trait ListCatalogItemsInput extends js.Object {
    var EC2FamilyFilter: js.UndefOr[EC2FamilyList]
    var ItemClassFilter: js.UndefOr[CatalogItemClassList]
    var MaxResults: js.UndefOr[MaxResults1000]
    var NextToken: js.UndefOr[Token]
    var SupportedStorageFilter: js.UndefOr[SupportedStorageList]
  }

  object ListCatalogItemsInput {
    @inline
    def apply(
        EC2FamilyFilter: js.UndefOr[EC2FamilyList] = js.undefined,
        ItemClassFilter: js.UndefOr[CatalogItemClassList] = js.undefined,
        MaxResults: js.UndefOr[MaxResults1000] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined,
        SupportedStorageFilter: js.UndefOr[SupportedStorageList] = js.undefined
    ): ListCatalogItemsInput = {
      val __obj = js.Dynamic.literal()
      EC2FamilyFilter.foreach(__v => __obj.updateDynamic("EC2FamilyFilter")(__v.asInstanceOf[js.Any]))
      ItemClassFilter.foreach(__v => __obj.updateDynamic("ItemClassFilter")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      SupportedStorageFilter.foreach(__v => __obj.updateDynamic("SupportedStorageFilter")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListCatalogItemsInput]
    }
  }

  @js.native
  trait ListCatalogItemsOutput extends js.Object {
    var CatalogItems: js.UndefOr[CatalogItemListDefinition]
    var NextToken: js.UndefOr[Token]
  }

  object ListCatalogItemsOutput {
    @inline
    def apply(
        CatalogItems: js.UndefOr[CatalogItemListDefinition] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined
    ): ListCatalogItemsOutput = {
      val __obj = js.Dynamic.literal()
      CatalogItems.foreach(__v => __obj.updateDynamic("CatalogItems")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListCatalogItemsOutput]
    }
  }

  @js.native
  trait ListOrdersInput extends js.Object {
    var MaxResults: js.UndefOr[MaxResults1000]
    var NextToken: js.UndefOr[Token]
    var OutpostIdentifierFilter: js.UndefOr[OutpostIdentifier]
  }

  object ListOrdersInput {
    @inline
    def apply(
        MaxResults: js.UndefOr[MaxResults1000] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined,
        OutpostIdentifierFilter: js.UndefOr[OutpostIdentifier] = js.undefined
    ): ListOrdersInput = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      OutpostIdentifierFilter.foreach(__v => __obj.updateDynamic("OutpostIdentifierFilter")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListOrdersInput]
    }
  }

  @js.native
  trait ListOrdersOutput extends js.Object {
    var NextToken: js.UndefOr[Token]
    var Orders: js.UndefOr[OrderSummaryListDefinition]
  }

  object ListOrdersOutput {
    @inline
    def apply(
        NextToken: js.UndefOr[Token] = js.undefined,
        Orders: js.UndefOr[OrderSummaryListDefinition] = js.undefined
    ): ListOrdersOutput = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Orders.foreach(__v => __obj.updateDynamic("Orders")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListOrdersOutput]
    }
  }

  @js.native
  trait ListOutpostsInput extends js.Object {
    var AvailabilityZoneFilter: js.UndefOr[AvailabilityZoneList]
    var AvailabilityZoneIdFilter: js.UndefOr[AvailabilityZoneIdList]
    var LifeCycleStatusFilter: js.UndefOr[LifeCycleStatusList]
    var MaxResults: js.UndefOr[MaxResults1000]
    var NextToken: js.UndefOr[Token]
  }

  object ListOutpostsInput {
    @inline
    def apply(
        AvailabilityZoneFilter: js.UndefOr[AvailabilityZoneList] = js.undefined,
        AvailabilityZoneIdFilter: js.UndefOr[AvailabilityZoneIdList] = js.undefined,
        LifeCycleStatusFilter: js.UndefOr[LifeCycleStatusList] = js.undefined,
        MaxResults: js.UndefOr[MaxResults1000] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined
    ): ListOutpostsInput = {
      val __obj = js.Dynamic.literal()
      AvailabilityZoneFilter.foreach(__v => __obj.updateDynamic("AvailabilityZoneFilter")(__v.asInstanceOf[js.Any]))
      AvailabilityZoneIdFilter.foreach(__v => __obj.updateDynamic("AvailabilityZoneIdFilter")(__v.asInstanceOf[js.Any]))
      LifeCycleStatusFilter.foreach(__v => __obj.updateDynamic("LifeCycleStatusFilter")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListOutpostsInput]
    }
  }

  @js.native
  trait ListOutpostsOutput extends js.Object {
    var NextToken: js.UndefOr[Token]
    var Outposts: js.UndefOr[outpostListDefinition]
  }

  object ListOutpostsOutput {
    @inline
    def apply(
        NextToken: js.UndefOr[Token] = js.undefined,
        Outposts: js.UndefOr[outpostListDefinition] = js.undefined
    ): ListOutpostsOutput = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Outposts.foreach(__v => __obj.updateDynamic("Outposts")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListOutpostsOutput]
    }
  }

  @js.native
  trait ListSitesInput extends js.Object {
    var MaxResults: js.UndefOr[MaxResults1000]
    var NextToken: js.UndefOr[Token]
    var OperatingAddressCityFilter: js.UndefOr[CityList]
    var OperatingAddressCountryCodeFilter: js.UndefOr[CountryCodeList]
    var OperatingAddressStateOrRegionFilter: js.UndefOr[StateOrRegionList]
  }

  object ListSitesInput {
    @inline
    def apply(
        MaxResults: js.UndefOr[MaxResults1000] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined,
        OperatingAddressCityFilter: js.UndefOr[CityList] = js.undefined,
        OperatingAddressCountryCodeFilter: js.UndefOr[CountryCodeList] = js.undefined,
        OperatingAddressStateOrRegionFilter: js.UndefOr[StateOrRegionList] = js.undefined
    ): ListSitesInput = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      OperatingAddressCityFilter.foreach(__v => __obj.updateDynamic("OperatingAddressCityFilter")(__v.asInstanceOf[js.Any]))
      OperatingAddressCountryCodeFilter.foreach(__v => __obj.updateDynamic("OperatingAddressCountryCodeFilter")(__v.asInstanceOf[js.Any]))
      OperatingAddressStateOrRegionFilter.foreach(__v => __obj.updateDynamic("OperatingAddressStateOrRegionFilter")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSitesInput]
    }
  }

  @js.native
  trait ListSitesOutput extends js.Object {
    var NextToken: js.UndefOr[Token]
    var Sites: js.UndefOr[siteListDefinition]
  }

  object ListSitesOutput {
    @inline
    def apply(
        NextToken: js.UndefOr[Token] = js.undefined,
        Sites: js.UndefOr[siteListDefinition] = js.undefined
    ): ListSitesOutput = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Sites.foreach(__v => __obj.updateDynamic("Sites")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSitesOutput]
    }
  }

  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var ResourceArn: Arn
  }

  object ListTagsForResourceRequest {
    @inline
    def apply(
        ResourceArn: Arn
    ): ListTagsForResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ListTagsForResourceRequest]
    }
  }

  @js.native
  trait ListTagsForResourceResponse extends js.Object {
    var Tags: js.UndefOr[TagMap]
  }

  object ListTagsForResourceResponse {
    @inline
    def apply(
        Tags: js.UndefOr[TagMap] = js.undefined
    ): ListTagsForResourceResponse = {
      val __obj = js.Dynamic.literal()
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceResponse]
    }
  }

  /** Information about an order.
    */
  @js.native
  trait Order extends js.Object {
    var LineItems: js.UndefOr[LineItemListDefinition]
    var OrderFulfilledDate: js.UndefOr[ISO8601Timestamp]
    var OrderId: js.UndefOr[OrderId]
    var OrderSubmissionDate: js.UndefOr[ISO8601Timestamp]
    var OutpostId: js.UndefOr[OutpostIdOnly]
    var PaymentOption: js.UndefOr[PaymentOption]
    var Status: js.UndefOr[OrderStatus]
  }

  object Order {
    @inline
    def apply(
        LineItems: js.UndefOr[LineItemListDefinition] = js.undefined,
        OrderFulfilledDate: js.UndefOr[ISO8601Timestamp] = js.undefined,
        OrderId: js.UndefOr[OrderId] = js.undefined,
        OrderSubmissionDate: js.UndefOr[ISO8601Timestamp] = js.undefined,
        OutpostId: js.UndefOr[OutpostIdOnly] = js.undefined,
        PaymentOption: js.UndefOr[PaymentOption] = js.undefined,
        Status: js.UndefOr[OrderStatus] = js.undefined
    ): Order = {
      val __obj = js.Dynamic.literal()
      LineItems.foreach(__v => __obj.updateDynamic("LineItems")(__v.asInstanceOf[js.Any]))
      OrderFulfilledDate.foreach(__v => __obj.updateDynamic("OrderFulfilledDate")(__v.asInstanceOf[js.Any]))
      OrderId.foreach(__v => __obj.updateDynamic("OrderId")(__v.asInstanceOf[js.Any]))
      OrderSubmissionDate.foreach(__v => __obj.updateDynamic("OrderSubmissionDate")(__v.asInstanceOf[js.Any]))
      OutpostId.foreach(__v => __obj.updateDynamic("OutpostId")(__v.asInstanceOf[js.Any]))
      PaymentOption.foreach(__v => __obj.updateDynamic("PaymentOption")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Order]
    }
  }

  /** A summary of line items in your order.
    */
  @js.native
  trait OrderSummary extends js.Object {
    var LineItemCountsByStatus: js.UndefOr[LineItemStatusCounts]
    var OrderFulfilledDate: js.UndefOr[ISO8601Timestamp]
    var OrderId: js.UndefOr[OrderId]
    var OrderSubmissionDate: js.UndefOr[ISO8601Timestamp]
    var OrderType: js.UndefOr[OrderType]
    var OutpostId: js.UndefOr[OutpostIdOnly]
    var Status: js.UndefOr[OrderStatus]
  }

  object OrderSummary {
    @inline
    def apply(
        LineItemCountsByStatus: js.UndefOr[LineItemStatusCounts] = js.undefined,
        OrderFulfilledDate: js.UndefOr[ISO8601Timestamp] = js.undefined,
        OrderId: js.UndefOr[OrderId] = js.undefined,
        OrderSubmissionDate: js.UndefOr[ISO8601Timestamp] = js.undefined,
        OrderType: js.UndefOr[OrderType] = js.undefined,
        OutpostId: js.UndefOr[OutpostIdOnly] = js.undefined,
        Status: js.UndefOr[OrderStatus] = js.undefined
    ): OrderSummary = {
      val __obj = js.Dynamic.literal()
      LineItemCountsByStatus.foreach(__v => __obj.updateDynamic("LineItemCountsByStatus")(__v.asInstanceOf[js.Any]))
      OrderFulfilledDate.foreach(__v => __obj.updateDynamic("OrderFulfilledDate")(__v.asInstanceOf[js.Any]))
      OrderId.foreach(__v => __obj.updateDynamic("OrderId")(__v.asInstanceOf[js.Any]))
      OrderSubmissionDate.foreach(__v => __obj.updateDynamic("OrderSubmissionDate")(__v.asInstanceOf[js.Any]))
      OrderType.foreach(__v => __obj.updateDynamic("OrderType")(__v.asInstanceOf[js.Any]))
      OutpostId.foreach(__v => __obj.updateDynamic("OutpostId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OrderSummary]
    }
  }

  /** Information about an Outpost.
    */
  @js.native
  trait Outpost extends js.Object {
    var AvailabilityZone: js.UndefOr[AvailabilityZone]
    var AvailabilityZoneId: js.UndefOr[AvailabilityZoneId]
    var Description: js.UndefOr[OutpostDescription]
    var LifeCycleStatus: js.UndefOr[LifeCycleStatus]
    var Name: js.UndefOr[OutpostName]
    var OutpostArn: js.UndefOr[OutpostArn]
    var OutpostId: js.UndefOr[OutpostId]
    var OwnerId: js.UndefOr[OwnerId]
    var SiteArn: js.UndefOr[SiteArn]
    var SiteId: js.UndefOr[SiteId]
    var SupportedHardwareType: js.UndefOr[SupportedHardwareType]
    var Tags: js.UndefOr[TagMap]
  }

  object Outpost {
    @inline
    def apply(
        AvailabilityZone: js.UndefOr[AvailabilityZone] = js.undefined,
        AvailabilityZoneId: js.UndefOr[AvailabilityZoneId] = js.undefined,
        Description: js.UndefOr[OutpostDescription] = js.undefined,
        LifeCycleStatus: js.UndefOr[LifeCycleStatus] = js.undefined,
        Name: js.UndefOr[OutpostName] = js.undefined,
        OutpostArn: js.UndefOr[OutpostArn] = js.undefined,
        OutpostId: js.UndefOr[OutpostId] = js.undefined,
        OwnerId: js.UndefOr[OwnerId] = js.undefined,
        SiteArn: js.UndefOr[SiteArn] = js.undefined,
        SiteId: js.UndefOr[SiteId] = js.undefined,
        SupportedHardwareType: js.UndefOr[SupportedHardwareType] = js.undefined,
        Tags: js.UndefOr[TagMap] = js.undefined
    ): Outpost = {
      val __obj = js.Dynamic.literal()
      AvailabilityZone.foreach(__v => __obj.updateDynamic("AvailabilityZone")(__v.asInstanceOf[js.Any]))
      AvailabilityZoneId.foreach(__v => __obj.updateDynamic("AvailabilityZoneId")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      LifeCycleStatus.foreach(__v => __obj.updateDynamic("LifeCycleStatus")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      OutpostArn.foreach(__v => __obj.updateDynamic("OutpostArn")(__v.asInstanceOf[js.Any]))
      OutpostId.foreach(__v => __obj.updateDynamic("OutpostId")(__v.asInstanceOf[js.Any]))
      OwnerId.foreach(__v => __obj.updateDynamic("OwnerId")(__v.asInstanceOf[js.Any]))
      SiteArn.foreach(__v => __obj.updateDynamic("SiteArn")(__v.asInstanceOf[js.Any]))
      SiteId.foreach(__v => __obj.updateDynamic("SiteId")(__v.asInstanceOf[js.Any]))
      SupportedHardwareType.foreach(__v => __obj.updateDynamic("SupportedHardwareType")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Outpost]
    }
  }

  /** Information about the physical and logistical details for racks at sites. For more information about hardware requirements for racks, see [[https://docs.aws.amazon.com/outposts/latest/userguide/outposts-requirements.html#checklist|Network readiness checklist]] in the Amazon Web Services Outposts User Guide.
    */
  @js.native
  trait RackPhysicalProperties extends js.Object {
    var FiberOpticCableType: js.UndefOr[FiberOpticCableType]
    var MaximumSupportedWeightLbs: js.UndefOr[MaximumSupportedWeightLbs]
    var OpticalStandard: js.UndefOr[OpticalStandard]
    var PowerConnector: js.UndefOr[PowerConnector]
    var PowerDrawKva: js.UndefOr[PowerDrawKva]
    var PowerFeedDrop: js.UndefOr[PowerFeedDrop]
    var PowerPhase: js.UndefOr[PowerPhase]
    var UplinkCount: js.UndefOr[UplinkCount]
    var UplinkGbps: js.UndefOr[UplinkGbps]
  }

  object RackPhysicalProperties {
    @inline
    def apply(
        FiberOpticCableType: js.UndefOr[FiberOpticCableType] = js.undefined,
        MaximumSupportedWeightLbs: js.UndefOr[MaximumSupportedWeightLbs] = js.undefined,
        OpticalStandard: js.UndefOr[OpticalStandard] = js.undefined,
        PowerConnector: js.UndefOr[PowerConnector] = js.undefined,
        PowerDrawKva: js.UndefOr[PowerDrawKva] = js.undefined,
        PowerFeedDrop: js.UndefOr[PowerFeedDrop] = js.undefined,
        PowerPhase: js.UndefOr[PowerPhase] = js.undefined,
        UplinkCount: js.UndefOr[UplinkCount] = js.undefined,
        UplinkGbps: js.UndefOr[UplinkGbps] = js.undefined
    ): RackPhysicalProperties = {
      val __obj = js.Dynamic.literal()
      FiberOpticCableType.foreach(__v => __obj.updateDynamic("FiberOpticCableType")(__v.asInstanceOf[js.Any]))
      MaximumSupportedWeightLbs.foreach(__v => __obj.updateDynamic("MaximumSupportedWeightLbs")(__v.asInstanceOf[js.Any]))
      OpticalStandard.foreach(__v => __obj.updateDynamic("OpticalStandard")(__v.asInstanceOf[js.Any]))
      PowerConnector.foreach(__v => __obj.updateDynamic("PowerConnector")(__v.asInstanceOf[js.Any]))
      PowerDrawKva.foreach(__v => __obj.updateDynamic("PowerDrawKva")(__v.asInstanceOf[js.Any]))
      PowerFeedDrop.foreach(__v => __obj.updateDynamic("PowerFeedDrop")(__v.asInstanceOf[js.Any]))
      PowerPhase.foreach(__v => __obj.updateDynamic("PowerPhase")(__v.asInstanceOf[js.Any]))
      UplinkCount.foreach(__v => __obj.updateDynamic("UplinkCount")(__v.asInstanceOf[js.Any]))
      UplinkGbps.foreach(__v => __obj.updateDynamic("UplinkGbps")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RackPhysicalProperties]
    }
  }

  /** Information about a line item shipment.
    */
  @js.native
  trait ShipmentInformation extends js.Object {
    var ShipmentCarrier: js.UndefOr[ShipmentCarrier]
    var ShipmentTrackingNumber: js.UndefOr[TrackingId]
  }

  object ShipmentInformation {
    @inline
    def apply(
        ShipmentCarrier: js.UndefOr[ShipmentCarrier] = js.undefined,
        ShipmentTrackingNumber: js.UndefOr[TrackingId] = js.undefined
    ): ShipmentInformation = {
      val __obj = js.Dynamic.literal()
      ShipmentCarrier.foreach(__v => __obj.updateDynamic("ShipmentCarrier")(__v.asInstanceOf[js.Any]))
      ShipmentTrackingNumber.foreach(__v => __obj.updateDynamic("ShipmentTrackingNumber")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ShipmentInformation]
    }
  }

  /** Information about a site.
    */
  @js.native
  trait Site extends js.Object {
    var AccountId: js.UndefOr[AccountId]
    var Description: js.UndefOr[SiteDescription]
    var Name: js.UndefOr[SiteName]
    var Notes: js.UndefOr[SiteNotes]
    var OperatingAddressCity: js.UndefOr[City]
    var OperatingAddressCountryCode: js.UndefOr[CountryCode]
    var OperatingAddressStateOrRegion: js.UndefOr[StateOrRegion]
    var RackPhysicalProperties: js.UndefOr[RackPhysicalProperties]
    var SiteArn: js.UndefOr[SiteArn]
    var SiteId: js.UndefOr[SiteId]
    var Tags: js.UndefOr[TagMap]
  }

  object Site {
    @inline
    def apply(
        AccountId: js.UndefOr[AccountId] = js.undefined,
        Description: js.UndefOr[SiteDescription] = js.undefined,
        Name: js.UndefOr[SiteName] = js.undefined,
        Notes: js.UndefOr[SiteNotes] = js.undefined,
        OperatingAddressCity: js.UndefOr[City] = js.undefined,
        OperatingAddressCountryCode: js.UndefOr[CountryCode] = js.undefined,
        OperatingAddressStateOrRegion: js.UndefOr[StateOrRegion] = js.undefined,
        RackPhysicalProperties: js.UndefOr[RackPhysicalProperties] = js.undefined,
        SiteArn: js.UndefOr[SiteArn] = js.undefined,
        SiteId: js.UndefOr[SiteId] = js.undefined,
        Tags: js.UndefOr[TagMap] = js.undefined
    ): Site = {
      val __obj = js.Dynamic.literal()
      AccountId.foreach(__v => __obj.updateDynamic("AccountId")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Notes.foreach(__v => __obj.updateDynamic("Notes")(__v.asInstanceOf[js.Any]))
      OperatingAddressCity.foreach(__v => __obj.updateDynamic("OperatingAddressCity")(__v.asInstanceOf[js.Any]))
      OperatingAddressCountryCode.foreach(__v => __obj.updateDynamic("OperatingAddressCountryCode")(__v.asInstanceOf[js.Any]))
      OperatingAddressStateOrRegion.foreach(__v => __obj.updateDynamic("OperatingAddressStateOrRegion")(__v.asInstanceOf[js.Any]))
      RackPhysicalProperties.foreach(__v => __obj.updateDynamic("RackPhysicalProperties")(__v.asInstanceOf[js.Any]))
      SiteArn.foreach(__v => __obj.updateDynamic("SiteArn")(__v.asInstanceOf[js.Any]))
      SiteId.foreach(__v => __obj.updateDynamic("SiteId")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Site]
    }
  }

  @js.native
  trait StartConnectionRequest extends js.Object {
    var AssetId: AssetId
    var ClientPublicKey: WireGuardPublicKey
    var DeviceSerialNumber: DeviceSerialNumber
    var NetworkInterfaceDeviceIndex: NetworkInterfaceDeviceIndex
  }

  object StartConnectionRequest {
    @inline
    def apply(
        AssetId: AssetId,
        ClientPublicKey: WireGuardPublicKey,
        DeviceSerialNumber: DeviceSerialNumber,
        NetworkInterfaceDeviceIndex: NetworkInterfaceDeviceIndex
    ): StartConnectionRequest = {
      val __obj = js.Dynamic.literal(
        "AssetId" -> AssetId.asInstanceOf[js.Any],
        "ClientPublicKey" -> ClientPublicKey.asInstanceOf[js.Any],
        "DeviceSerialNumber" -> DeviceSerialNumber.asInstanceOf[js.Any],
        "NetworkInterfaceDeviceIndex" -> NetworkInterfaceDeviceIndex.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[StartConnectionRequest]
    }
  }

  @js.native
  trait StartConnectionResponse extends js.Object {
    var ConnectionId: js.UndefOr[ConnectionId]
    var UnderlayIpAddress: js.UndefOr[UnderlayIpAddress]
  }

  object StartConnectionResponse {
    @inline
    def apply(
        ConnectionId: js.UndefOr[ConnectionId] = js.undefined,
        UnderlayIpAddress: js.UndefOr[UnderlayIpAddress] = js.undefined
    ): StartConnectionResponse = {
      val __obj = js.Dynamic.literal()
      ConnectionId.foreach(__v => __obj.updateDynamic("ConnectionId")(__v.asInstanceOf[js.Any]))
      UnderlayIpAddress.foreach(__v => __obj.updateDynamic("UnderlayIpAddress")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartConnectionResponse]
    }
  }

  @js.native
  trait TagResourceRequest extends js.Object {
    var ResourceArn: Arn
    var Tags: TagMap
  }

  object TagResourceRequest {
    @inline
    def apply(
        ResourceArn: Arn,
        Tags: TagMap
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
    var ResourceArn: Arn
    var TagKeys: TagKeyList
  }

  object UntagResourceRequest {
    @inline
    def apply(
        ResourceArn: Arn,
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
  trait UpdateOutpostInput extends js.Object {
    var OutpostId: OutpostId
    var Description: js.UndefOr[OutpostDescription]
    var Name: js.UndefOr[OutpostName]
    var SupportedHardwareType: js.UndefOr[SupportedHardwareType]
  }

  object UpdateOutpostInput {
    @inline
    def apply(
        OutpostId: OutpostId,
        Description: js.UndefOr[OutpostDescription] = js.undefined,
        Name: js.UndefOr[OutpostName] = js.undefined,
        SupportedHardwareType: js.UndefOr[SupportedHardwareType] = js.undefined
    ): UpdateOutpostInput = {
      val __obj = js.Dynamic.literal(
        "OutpostId" -> OutpostId.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      SupportedHardwareType.foreach(__v => __obj.updateDynamic("SupportedHardwareType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateOutpostInput]
    }
  }

  @js.native
  trait UpdateOutpostOutput extends js.Object {
    var Outpost: js.UndefOr[Outpost]
  }

  object UpdateOutpostOutput {
    @inline
    def apply(
        Outpost: js.UndefOr[Outpost] = js.undefined
    ): UpdateOutpostOutput = {
      val __obj = js.Dynamic.literal()
      Outpost.foreach(__v => __obj.updateDynamic("Outpost")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateOutpostOutput]
    }
  }

  @js.native
  trait UpdateSiteAddressInput extends js.Object {
    var Address: Address
    var AddressType: AddressType
    var SiteId: SiteId
  }

  object UpdateSiteAddressInput {
    @inline
    def apply(
        Address: Address,
        AddressType: AddressType,
        SiteId: SiteId
    ): UpdateSiteAddressInput = {
      val __obj = js.Dynamic.literal(
        "Address" -> Address.asInstanceOf[js.Any],
        "AddressType" -> AddressType.asInstanceOf[js.Any],
        "SiteId" -> SiteId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateSiteAddressInput]
    }
  }

  @js.native
  trait UpdateSiteAddressOutput extends js.Object {
    var Address: js.UndefOr[Address]
    var AddressType: js.UndefOr[AddressType]
  }

  object UpdateSiteAddressOutput {
    @inline
    def apply(
        Address: js.UndefOr[Address] = js.undefined,
        AddressType: js.UndefOr[AddressType] = js.undefined
    ): UpdateSiteAddressOutput = {
      val __obj = js.Dynamic.literal()
      Address.foreach(__v => __obj.updateDynamic("Address")(__v.asInstanceOf[js.Any]))
      AddressType.foreach(__v => __obj.updateDynamic("AddressType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateSiteAddressOutput]
    }
  }

  @js.native
  trait UpdateSiteInput extends js.Object {
    var SiteId: SiteId
    var Description: js.UndefOr[SiteDescription]
    var Name: js.UndefOr[SiteName]
    var Notes: js.UndefOr[SiteNotes]
  }

  object UpdateSiteInput {
    @inline
    def apply(
        SiteId: SiteId,
        Description: js.UndefOr[SiteDescription] = js.undefined,
        Name: js.UndefOr[SiteName] = js.undefined,
        Notes: js.UndefOr[SiteNotes] = js.undefined
    ): UpdateSiteInput = {
      val __obj = js.Dynamic.literal(
        "SiteId" -> SiteId.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Notes.foreach(__v => __obj.updateDynamic("Notes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateSiteInput]
    }
  }

  @js.native
  trait UpdateSiteOutput extends js.Object {
    var Site: js.UndefOr[Site]
  }

  object UpdateSiteOutput {
    @inline
    def apply(
        Site: js.UndefOr[Site] = js.undefined
    ): UpdateSiteOutput = {
      val __obj = js.Dynamic.literal()
      Site.foreach(__v => __obj.updateDynamic("Site")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateSiteOutput]
    }
  }

  @js.native
  trait UpdateSiteRackPhysicalPropertiesInput extends js.Object {
    var SiteId: SiteId
    var FiberOpticCableType: js.UndefOr[FiberOpticCableType]
    var MaximumSupportedWeightLbs: js.UndefOr[MaximumSupportedWeightLbs]
    var OpticalStandard: js.UndefOr[OpticalStandard]
    var PowerConnector: js.UndefOr[PowerConnector]
    var PowerDrawKva: js.UndefOr[PowerDrawKva]
    var PowerFeedDrop: js.UndefOr[PowerFeedDrop]
    var PowerPhase: js.UndefOr[PowerPhase]
    var UplinkCount: js.UndefOr[UplinkCount]
    var UplinkGbps: js.UndefOr[UplinkGbps]
  }

  object UpdateSiteRackPhysicalPropertiesInput {
    @inline
    def apply(
        SiteId: SiteId,
        FiberOpticCableType: js.UndefOr[FiberOpticCableType] = js.undefined,
        MaximumSupportedWeightLbs: js.UndefOr[MaximumSupportedWeightLbs] = js.undefined,
        OpticalStandard: js.UndefOr[OpticalStandard] = js.undefined,
        PowerConnector: js.UndefOr[PowerConnector] = js.undefined,
        PowerDrawKva: js.UndefOr[PowerDrawKva] = js.undefined,
        PowerFeedDrop: js.UndefOr[PowerFeedDrop] = js.undefined,
        PowerPhase: js.UndefOr[PowerPhase] = js.undefined,
        UplinkCount: js.UndefOr[UplinkCount] = js.undefined,
        UplinkGbps: js.UndefOr[UplinkGbps] = js.undefined
    ): UpdateSiteRackPhysicalPropertiesInput = {
      val __obj = js.Dynamic.literal(
        "SiteId" -> SiteId.asInstanceOf[js.Any]
      )

      FiberOpticCableType.foreach(__v => __obj.updateDynamic("FiberOpticCableType")(__v.asInstanceOf[js.Any]))
      MaximumSupportedWeightLbs.foreach(__v => __obj.updateDynamic("MaximumSupportedWeightLbs")(__v.asInstanceOf[js.Any]))
      OpticalStandard.foreach(__v => __obj.updateDynamic("OpticalStandard")(__v.asInstanceOf[js.Any]))
      PowerConnector.foreach(__v => __obj.updateDynamic("PowerConnector")(__v.asInstanceOf[js.Any]))
      PowerDrawKva.foreach(__v => __obj.updateDynamic("PowerDrawKva")(__v.asInstanceOf[js.Any]))
      PowerFeedDrop.foreach(__v => __obj.updateDynamic("PowerFeedDrop")(__v.asInstanceOf[js.Any]))
      PowerPhase.foreach(__v => __obj.updateDynamic("PowerPhase")(__v.asInstanceOf[js.Any]))
      UplinkCount.foreach(__v => __obj.updateDynamic("UplinkCount")(__v.asInstanceOf[js.Any]))
      UplinkGbps.foreach(__v => __obj.updateDynamic("UplinkGbps")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateSiteRackPhysicalPropertiesInput]
    }
  }

  @js.native
  trait UpdateSiteRackPhysicalPropertiesOutput extends js.Object {
    var Site: js.UndefOr[Site]
  }

  object UpdateSiteRackPhysicalPropertiesOutput {
    @inline
    def apply(
        Site: js.UndefOr[Site] = js.undefined
    ): UpdateSiteRackPhysicalPropertiesOutput = {
      val __obj = js.Dynamic.literal()
      Site.foreach(__v => __obj.updateDynamic("Site")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateSiteRackPhysicalPropertiesOutput]
    }
  }
}
