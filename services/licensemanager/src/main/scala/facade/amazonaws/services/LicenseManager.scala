package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

package object licensemanager {
  type AllowedOperationList = js.Array[AllowedOperation]
  type Arn = String
  type ArnList = js.Array[Arn]
  type BoxBoolean = Boolean
  type BoxInteger = Int
  type BoxLong = Double
  type ClientToken = String
  type ConsumedLicenseSummaryList = js.Array[ConsumedLicenseSummary]
  type DateTime = js.Date
  type EntitlementDataList = js.Array[EntitlementData]
  type EntitlementList = js.Array[Entitlement]
  type EntitlementUsageList = js.Array[EntitlementUsage]
  type FilterList = js.Array[Filter]
  type FilterName = String
  type FilterValue = String
  type FilterValues = js.Array[FilterValue]
  type Filters = js.Array[Filter]
  type GrantList = js.Array[Grant]
  type GrantedLicenseList = js.Array[GrantedLicense]
  type ISO8601DateTime = String
  type IdempotencyToken = String
  type InventoryFilterList = js.Array[InventoryFilter]
  type LicenseConfigurationAssociations = js.Array[LicenseConfigurationAssociation]
  type LicenseConfigurationUsageList = js.Array[LicenseConfigurationUsage]
  type LicenseConfigurations = js.Array[LicenseConfiguration]
  type LicenseList = js.Array[License]
  type LicenseOperationFailureList = js.Array[LicenseOperationFailure]
  type LicenseSpecifications = js.Array[LicenseSpecification]
  type ManagedResourceSummaryList = js.Array[ManagedResourceSummary]
  type MaxSize100 = Int
  type MaxSize3StringList = js.Array[String]
  type MetadataList = js.Array[Metadata]
  type PrincipalArnList = js.Array[Arn]
  type ProductInformationFilterList = js.Array[ProductInformationFilter]
  type ProductInformationList = js.Array[ProductInformation]
  type ResourceInventoryList = js.Array[ResourceInventory]
  type SignedToken = String
  type StringList = js.Array[String]
  type TagKeyList = js.Array[String]
  type TagList = js.Array[Tag]
  type TokenList = js.Array[TokenData]
  type TokenString = String

  implicit final class LicenseManagerOps(private val service: LicenseManager) extends AnyVal {

    @inline def acceptGrantFuture(params: AcceptGrantRequest): Future[AcceptGrantResponse] = service.acceptGrant(params).promise().toFuture
    @inline def checkInLicenseFuture(params: CheckInLicenseRequest): Future[CheckInLicenseResponse] = service.checkInLicense(params).promise().toFuture
    @inline def checkoutBorrowLicenseFuture(params: CheckoutBorrowLicenseRequest): Future[CheckoutBorrowLicenseResponse] = service.checkoutBorrowLicense(params).promise().toFuture
    @inline def checkoutLicenseFuture(params: CheckoutLicenseRequest): Future[CheckoutLicenseResponse] = service.checkoutLicense(params).promise().toFuture
    @inline def createGrantFuture(params: CreateGrantRequest): Future[CreateGrantResponse] = service.createGrant(params).promise().toFuture
    @inline def createGrantVersionFuture(params: CreateGrantVersionRequest): Future[CreateGrantVersionResponse] = service.createGrantVersion(params).promise().toFuture
    @inline def createLicenseConfigurationFuture(params: CreateLicenseConfigurationRequest): Future[CreateLicenseConfigurationResponse] = service.createLicenseConfiguration(params).promise().toFuture
    @inline def createLicenseFuture(params: CreateLicenseRequest): Future[CreateLicenseResponse] = service.createLicense(params).promise().toFuture
    @inline def createLicenseVersionFuture(params: CreateLicenseVersionRequest): Future[CreateLicenseVersionResponse] = service.createLicenseVersion(params).promise().toFuture
    @inline def createTokenFuture(params: CreateTokenRequest): Future[CreateTokenResponse] = service.createToken(params).promise().toFuture
    @inline def deleteGrantFuture(params: DeleteGrantRequest): Future[DeleteGrantResponse] = service.deleteGrant(params).promise().toFuture
    @inline def deleteLicenseConfigurationFuture(params: DeleteLicenseConfigurationRequest): Future[DeleteLicenseConfigurationResponse] = service.deleteLicenseConfiguration(params).promise().toFuture
    @inline def deleteLicenseFuture(params: DeleteLicenseRequest): Future[DeleteLicenseResponse] = service.deleteLicense(params).promise().toFuture
    @inline def deleteTokenFuture(params: DeleteTokenRequest): Future[DeleteTokenResponse] = service.deleteToken(params).promise().toFuture
    @inline def extendLicenseConsumptionFuture(params: ExtendLicenseConsumptionRequest): Future[ExtendLicenseConsumptionResponse] = service.extendLicenseConsumption(params).promise().toFuture
    @inline def getAccessTokenFuture(params: GetAccessTokenRequest): Future[GetAccessTokenResponse] = service.getAccessToken(params).promise().toFuture
    @inline def getGrantFuture(params: GetGrantRequest): Future[GetGrantResponse] = service.getGrant(params).promise().toFuture
    @inline def getLicenseConfigurationFuture(params: GetLicenseConfigurationRequest): Future[GetLicenseConfigurationResponse] = service.getLicenseConfiguration(params).promise().toFuture
    @inline def getLicenseFuture(params: GetLicenseRequest): Future[GetLicenseResponse] = service.getLicense(params).promise().toFuture
    @inline def getLicenseUsageFuture(params: GetLicenseUsageRequest): Future[GetLicenseUsageResponse] = service.getLicenseUsage(params).promise().toFuture
    @inline def getServiceSettingsFuture(params: GetServiceSettingsRequest): Future[GetServiceSettingsResponse] = service.getServiceSettings(params).promise().toFuture
    @inline def listAssociationsForLicenseConfigurationFuture(params: ListAssociationsForLicenseConfigurationRequest): Future[ListAssociationsForLicenseConfigurationResponse] = service.listAssociationsForLicenseConfiguration(params).promise().toFuture
    @inline def listDistributedGrantsFuture(params: ListDistributedGrantsRequest): Future[ListDistributedGrantsResponse] = service.listDistributedGrants(params).promise().toFuture
    @inline def listFailuresForLicenseConfigurationOperationsFuture(params: ListFailuresForLicenseConfigurationOperationsRequest): Future[ListFailuresForLicenseConfigurationOperationsResponse] = service.listFailuresForLicenseConfigurationOperations(params).promise().toFuture
    @inline def listLicenseConfigurationsFuture(params: ListLicenseConfigurationsRequest): Future[ListLicenseConfigurationsResponse] = service.listLicenseConfigurations(params).promise().toFuture
    @inline def listLicenseSpecificationsForResourceFuture(params: ListLicenseSpecificationsForResourceRequest): Future[ListLicenseSpecificationsForResourceResponse] = service.listLicenseSpecificationsForResource(params).promise().toFuture
    @inline def listLicenseVersionsFuture(params: ListLicenseVersionsRequest): Future[ListLicenseVersionsResponse] = service.listLicenseVersions(params).promise().toFuture
    @inline def listLicensesFuture(params: ListLicensesRequest): Future[ListLicensesResponse] = service.listLicenses(params).promise().toFuture
    @inline def listReceivedGrantsFuture(params: ListReceivedGrantsRequest): Future[ListReceivedGrantsResponse] = service.listReceivedGrants(params).promise().toFuture
    @inline def listReceivedLicensesFuture(params: ListReceivedLicensesRequest): Future[ListReceivedLicensesResponse] = service.listReceivedLicenses(params).promise().toFuture
    @inline def listResourceInventoryFuture(params: ListResourceInventoryRequest): Future[ListResourceInventoryResponse] = service.listResourceInventory(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] = service.listTagsForResource(params).promise().toFuture
    @inline def listTokensFuture(params: ListTokensRequest): Future[ListTokensResponse] = service.listTokens(params).promise().toFuture
    @inline def listUsageForLicenseConfigurationFuture(params: ListUsageForLicenseConfigurationRequest): Future[ListUsageForLicenseConfigurationResponse] = service.listUsageForLicenseConfiguration(params).promise().toFuture
    @inline def rejectGrantFuture(params: RejectGrantRequest): Future[RejectGrantResponse] = service.rejectGrant(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] = service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] = service.untagResource(params).promise().toFuture
    @inline def updateLicenseConfigurationFuture(params: UpdateLicenseConfigurationRequest): Future[UpdateLicenseConfigurationResponse] = service.updateLicenseConfiguration(params).promise().toFuture
    @inline def updateLicenseSpecificationsForResourceFuture(params: UpdateLicenseSpecificationsForResourceRequest): Future[UpdateLicenseSpecificationsForResourceResponse] = service.updateLicenseSpecificationsForResource(params).promise().toFuture
    @inline def updateServiceSettingsFuture(params: UpdateServiceSettingsRequest): Future[UpdateServiceSettingsResponse] = service.updateServiceSettings(params).promise().toFuture

  }
}

package licensemanager {
  @js.native
  @JSImport("aws-sdk/clients/licensemanager", JSImport.Namespace, "AWS.LicenseManager")
  class LicenseManager() extends js.Object {
    def this(config: AWSConfig) = this()

    def acceptGrant(params: AcceptGrantRequest): Request[AcceptGrantResponse] = js.native
    def checkInLicense(params: CheckInLicenseRequest): Request[CheckInLicenseResponse] = js.native
    def checkoutBorrowLicense(params: CheckoutBorrowLicenseRequest): Request[CheckoutBorrowLicenseResponse] = js.native
    def checkoutLicense(params: CheckoutLicenseRequest): Request[CheckoutLicenseResponse] = js.native
    def createGrant(params: CreateGrantRequest): Request[CreateGrantResponse] = js.native
    def createGrantVersion(params: CreateGrantVersionRequest): Request[CreateGrantVersionResponse] = js.native
    def createLicense(params: CreateLicenseRequest): Request[CreateLicenseResponse] = js.native
    def createLicenseConfiguration(params: CreateLicenseConfigurationRequest): Request[CreateLicenseConfigurationResponse] = js.native
    def createLicenseVersion(params: CreateLicenseVersionRequest): Request[CreateLicenseVersionResponse] = js.native
    def createToken(params: CreateTokenRequest): Request[CreateTokenResponse] = js.native
    def deleteGrant(params: DeleteGrantRequest): Request[DeleteGrantResponse] = js.native
    def deleteLicense(params: DeleteLicenseRequest): Request[DeleteLicenseResponse] = js.native
    def deleteLicenseConfiguration(params: DeleteLicenseConfigurationRequest): Request[DeleteLicenseConfigurationResponse] = js.native
    def deleteToken(params: DeleteTokenRequest): Request[DeleteTokenResponse] = js.native
    def extendLicenseConsumption(params: ExtendLicenseConsumptionRequest): Request[ExtendLicenseConsumptionResponse] = js.native
    def getAccessToken(params: GetAccessTokenRequest): Request[GetAccessTokenResponse] = js.native
    def getGrant(params: GetGrantRequest): Request[GetGrantResponse] = js.native
    def getLicense(params: GetLicenseRequest): Request[GetLicenseResponse] = js.native
    def getLicenseConfiguration(params: GetLicenseConfigurationRequest): Request[GetLicenseConfigurationResponse] = js.native
    def getLicenseUsage(params: GetLicenseUsageRequest): Request[GetLicenseUsageResponse] = js.native
    def getServiceSettings(params: GetServiceSettingsRequest): Request[GetServiceSettingsResponse] = js.native
    def listAssociationsForLicenseConfiguration(params: ListAssociationsForLicenseConfigurationRequest): Request[ListAssociationsForLicenseConfigurationResponse] = js.native
    def listDistributedGrants(params: ListDistributedGrantsRequest): Request[ListDistributedGrantsResponse] = js.native
    def listFailuresForLicenseConfigurationOperations(params: ListFailuresForLicenseConfigurationOperationsRequest): Request[ListFailuresForLicenseConfigurationOperationsResponse] = js.native
    def listLicenseConfigurations(params: ListLicenseConfigurationsRequest): Request[ListLicenseConfigurationsResponse] = js.native
    def listLicenseSpecificationsForResource(params: ListLicenseSpecificationsForResourceRequest): Request[ListLicenseSpecificationsForResourceResponse] = js.native
    def listLicenseVersions(params: ListLicenseVersionsRequest): Request[ListLicenseVersionsResponse] = js.native
    def listLicenses(params: ListLicensesRequest): Request[ListLicensesResponse] = js.native
    def listReceivedGrants(params: ListReceivedGrantsRequest): Request[ListReceivedGrantsResponse] = js.native
    def listReceivedLicenses(params: ListReceivedLicensesRequest): Request[ListReceivedLicensesResponse] = js.native
    def listResourceInventory(params: ListResourceInventoryRequest): Request[ListResourceInventoryResponse] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def listTokens(params: ListTokensRequest): Request[ListTokensResponse] = js.native
    def listUsageForLicenseConfiguration(params: ListUsageForLicenseConfigurationRequest): Request[ListUsageForLicenseConfigurationResponse] = js.native
    def rejectGrant(params: RejectGrantRequest): Request[RejectGrantResponse] = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse] = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse] = js.native
    def updateLicenseConfiguration(params: UpdateLicenseConfigurationRequest): Request[UpdateLicenseConfigurationResponse] = js.native
    def updateLicenseSpecificationsForResource(params: UpdateLicenseSpecificationsForResourceRequest): Request[UpdateLicenseSpecificationsForResourceResponse] = js.native
    def updateServiceSettings(params: UpdateServiceSettingsRequest): Request[UpdateServiceSettingsResponse] = js.native
  }

  @js.native
  trait AcceptGrantRequest extends js.Object {
    var GrantArn: Arn
  }

  object AcceptGrantRequest {
    @inline
    def apply(
        GrantArn: Arn
    ): AcceptGrantRequest = {
      val __obj = js.Dynamic.literal(
        "GrantArn" -> GrantArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AcceptGrantRequest]
    }
  }

  @js.native
  trait AcceptGrantResponse extends js.Object {
    var GrantArn: js.UndefOr[Arn]
    var Status: js.UndefOr[GrantStatus]
    var Version: js.UndefOr[String]
  }

  object AcceptGrantResponse {
    @inline
    def apply(
        GrantArn: js.UndefOr[Arn] = js.undefined,
        Status: js.UndefOr[GrantStatus] = js.undefined,
        Version: js.UndefOr[String] = js.undefined
    ): AcceptGrantResponse = {
      val __obj = js.Dynamic.literal()
      GrantArn.foreach(__v => __obj.updateDynamic("GrantArn")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      Version.foreach(__v => __obj.updateDynamic("Version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AcceptGrantResponse]
    }
  }

  @js.native
  sealed trait AllowedOperation extends js.Any
  object AllowedOperation {
    val CreateGrant = "CreateGrant".asInstanceOf[AllowedOperation]
    val CheckoutLicense = "CheckoutLicense".asInstanceOf[AllowedOperation]
    val CheckoutBorrowLicense = "CheckoutBorrowLicense".asInstanceOf[AllowedOperation]
    val CheckInLicense = "CheckInLicense".asInstanceOf[AllowedOperation]
    val ExtendConsumptionLicense = "ExtendConsumptionLicense".asInstanceOf[AllowedOperation]
    val ListPurchasedLicenses = "ListPurchasedLicenses".asInstanceOf[AllowedOperation]
    val CreateToken = "CreateToken".asInstanceOf[AllowedOperation]

    @inline def values = js.Array(CreateGrant, CheckoutLicense, CheckoutBorrowLicense, CheckInLicense, ExtendConsumptionLicense, ListPurchasedLicenses, CreateToken)
  }

  /** Describes automated discovery.
    */
  @js.native
  trait AutomatedDiscoveryInformation extends js.Object {
    var LastRunTime: js.UndefOr[DateTime]
  }

  object AutomatedDiscoveryInformation {
    @inline
    def apply(
        LastRunTime: js.UndefOr[DateTime] = js.undefined
    ): AutomatedDiscoveryInformation = {
      val __obj = js.Dynamic.literal()
      LastRunTime.foreach(__v => __obj.updateDynamic("LastRunTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AutomatedDiscoveryInformation]
    }
  }

  /** Details about a borrow configuration.
    */
  @js.native
  trait BorrowConfiguration extends js.Object {
    var AllowEarlyCheckIn: BoxBoolean
    var MaxTimeToLiveInMinutes: BoxInteger
  }

  object BorrowConfiguration {
    @inline
    def apply(
        AllowEarlyCheckIn: BoxBoolean,
        MaxTimeToLiveInMinutes: BoxInteger
    ): BorrowConfiguration = {
      val __obj = js.Dynamic.literal(
        "AllowEarlyCheckIn" -> AllowEarlyCheckIn.asInstanceOf[js.Any],
        "MaxTimeToLiveInMinutes" -> MaxTimeToLiveInMinutes.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[BorrowConfiguration]
    }
  }

  @js.native
  trait CheckInLicenseRequest extends js.Object {
    var LicenseConsumptionToken: String
    var Beneficiary: js.UndefOr[String]
  }

  object CheckInLicenseRequest {
    @inline
    def apply(
        LicenseConsumptionToken: String,
        Beneficiary: js.UndefOr[String] = js.undefined
    ): CheckInLicenseRequest = {
      val __obj = js.Dynamic.literal(
        "LicenseConsumptionToken" -> LicenseConsumptionToken.asInstanceOf[js.Any]
      )

      Beneficiary.foreach(__v => __obj.updateDynamic("Beneficiary")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CheckInLicenseRequest]
    }
  }

  @js.native
  trait CheckInLicenseResponse extends js.Object

  object CheckInLicenseResponse {
    @inline
    def apply(): CheckInLicenseResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CheckInLicenseResponse]
    }
  }

  @js.native
  trait CheckoutBorrowLicenseRequest extends js.Object {
    var ClientToken: ClientToken
    var DigitalSignatureMethod: DigitalSignatureMethod
    var Entitlements: EntitlementDataList
    var LicenseArn: Arn
    var CheckoutMetadata: js.UndefOr[MetadataList]
    var NodeId: js.UndefOr[String]
  }

  object CheckoutBorrowLicenseRequest {
    @inline
    def apply(
        ClientToken: ClientToken,
        DigitalSignatureMethod: DigitalSignatureMethod,
        Entitlements: EntitlementDataList,
        LicenseArn: Arn,
        CheckoutMetadata: js.UndefOr[MetadataList] = js.undefined,
        NodeId: js.UndefOr[String] = js.undefined
    ): CheckoutBorrowLicenseRequest = {
      val __obj = js.Dynamic.literal(
        "ClientToken" -> ClientToken.asInstanceOf[js.Any],
        "DigitalSignatureMethod" -> DigitalSignatureMethod.asInstanceOf[js.Any],
        "Entitlements" -> Entitlements.asInstanceOf[js.Any],
        "LicenseArn" -> LicenseArn.asInstanceOf[js.Any]
      )

      CheckoutMetadata.foreach(__v => __obj.updateDynamic("CheckoutMetadata")(__v.asInstanceOf[js.Any]))
      NodeId.foreach(__v => __obj.updateDynamic("NodeId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CheckoutBorrowLicenseRequest]
    }
  }

  @js.native
  trait CheckoutBorrowLicenseResponse extends js.Object {
    var CheckoutMetadata: js.UndefOr[MetadataList]
    var EntitlementsAllowed: js.UndefOr[EntitlementDataList]
    var Expiration: js.UndefOr[ISO8601DateTime]
    var IssuedAt: js.UndefOr[ISO8601DateTime]
    var LicenseArn: js.UndefOr[Arn]
    var LicenseConsumptionToken: js.UndefOr[String]
    var NodeId: js.UndefOr[String]
    var SignedToken: js.UndefOr[SignedToken]
  }

  object CheckoutBorrowLicenseResponse {
    @inline
    def apply(
        CheckoutMetadata: js.UndefOr[MetadataList] = js.undefined,
        EntitlementsAllowed: js.UndefOr[EntitlementDataList] = js.undefined,
        Expiration: js.UndefOr[ISO8601DateTime] = js.undefined,
        IssuedAt: js.UndefOr[ISO8601DateTime] = js.undefined,
        LicenseArn: js.UndefOr[Arn] = js.undefined,
        LicenseConsumptionToken: js.UndefOr[String] = js.undefined,
        NodeId: js.UndefOr[String] = js.undefined,
        SignedToken: js.UndefOr[SignedToken] = js.undefined
    ): CheckoutBorrowLicenseResponse = {
      val __obj = js.Dynamic.literal()
      CheckoutMetadata.foreach(__v => __obj.updateDynamic("CheckoutMetadata")(__v.asInstanceOf[js.Any]))
      EntitlementsAllowed.foreach(__v => __obj.updateDynamic("EntitlementsAllowed")(__v.asInstanceOf[js.Any]))
      Expiration.foreach(__v => __obj.updateDynamic("Expiration")(__v.asInstanceOf[js.Any]))
      IssuedAt.foreach(__v => __obj.updateDynamic("IssuedAt")(__v.asInstanceOf[js.Any]))
      LicenseArn.foreach(__v => __obj.updateDynamic("LicenseArn")(__v.asInstanceOf[js.Any]))
      LicenseConsumptionToken.foreach(__v => __obj.updateDynamic("LicenseConsumptionToken")(__v.asInstanceOf[js.Any]))
      NodeId.foreach(__v => __obj.updateDynamic("NodeId")(__v.asInstanceOf[js.Any]))
      SignedToken.foreach(__v => __obj.updateDynamic("SignedToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CheckoutBorrowLicenseResponse]
    }
  }

  @js.native
  trait CheckoutLicenseRequest extends js.Object {
    var CheckoutType: CheckoutType
    var ClientToken: ClientToken
    var Entitlements: EntitlementDataList
    var KeyFingerprint: String
    var ProductSKU: String
    var Beneficiary: js.UndefOr[String]
    var NodeId: js.UndefOr[String]
  }

  object CheckoutLicenseRequest {
    @inline
    def apply(
        CheckoutType: CheckoutType,
        ClientToken: ClientToken,
        Entitlements: EntitlementDataList,
        KeyFingerprint: String,
        ProductSKU: String,
        Beneficiary: js.UndefOr[String] = js.undefined,
        NodeId: js.UndefOr[String] = js.undefined
    ): CheckoutLicenseRequest = {
      val __obj = js.Dynamic.literal(
        "CheckoutType" -> CheckoutType.asInstanceOf[js.Any],
        "ClientToken" -> ClientToken.asInstanceOf[js.Any],
        "Entitlements" -> Entitlements.asInstanceOf[js.Any],
        "KeyFingerprint" -> KeyFingerprint.asInstanceOf[js.Any],
        "ProductSKU" -> ProductSKU.asInstanceOf[js.Any]
      )

      Beneficiary.foreach(__v => __obj.updateDynamic("Beneficiary")(__v.asInstanceOf[js.Any]))
      NodeId.foreach(__v => __obj.updateDynamic("NodeId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CheckoutLicenseRequest]
    }
  }

  @js.native
  trait CheckoutLicenseResponse extends js.Object {
    var CheckoutType: js.UndefOr[CheckoutType]
    var EntitlementsAllowed: js.UndefOr[EntitlementDataList]
    var Expiration: js.UndefOr[ISO8601DateTime]
    var IssuedAt: js.UndefOr[ISO8601DateTime]
    var LicenseConsumptionToken: js.UndefOr[String]
    var NodeId: js.UndefOr[String]
    var SignedToken: js.UndefOr[SignedToken]
  }

  object CheckoutLicenseResponse {
    @inline
    def apply(
        CheckoutType: js.UndefOr[CheckoutType] = js.undefined,
        EntitlementsAllowed: js.UndefOr[EntitlementDataList] = js.undefined,
        Expiration: js.UndefOr[ISO8601DateTime] = js.undefined,
        IssuedAt: js.UndefOr[ISO8601DateTime] = js.undefined,
        LicenseConsumptionToken: js.UndefOr[String] = js.undefined,
        NodeId: js.UndefOr[String] = js.undefined,
        SignedToken: js.UndefOr[SignedToken] = js.undefined
    ): CheckoutLicenseResponse = {
      val __obj = js.Dynamic.literal()
      CheckoutType.foreach(__v => __obj.updateDynamic("CheckoutType")(__v.asInstanceOf[js.Any]))
      EntitlementsAllowed.foreach(__v => __obj.updateDynamic("EntitlementsAllowed")(__v.asInstanceOf[js.Any]))
      Expiration.foreach(__v => __obj.updateDynamic("Expiration")(__v.asInstanceOf[js.Any]))
      IssuedAt.foreach(__v => __obj.updateDynamic("IssuedAt")(__v.asInstanceOf[js.Any]))
      LicenseConsumptionToken.foreach(__v => __obj.updateDynamic("LicenseConsumptionToken")(__v.asInstanceOf[js.Any]))
      NodeId.foreach(__v => __obj.updateDynamic("NodeId")(__v.asInstanceOf[js.Any]))
      SignedToken.foreach(__v => __obj.updateDynamic("SignedToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CheckoutLicenseResponse]
    }
  }

  @js.native
  sealed trait CheckoutType extends js.Any
  object CheckoutType {
    val PROVISIONAL = "PROVISIONAL".asInstanceOf[CheckoutType]

    @inline def values = js.Array(PROVISIONAL)
  }

  /** Details about license consumption.
    */
  @js.native
  trait ConsumedLicenseSummary extends js.Object {
    var ConsumedLicenses: js.UndefOr[BoxLong]
    var ResourceType: js.UndefOr[ResourceType]
  }

  object ConsumedLicenseSummary {
    @inline
    def apply(
        ConsumedLicenses: js.UndefOr[BoxLong] = js.undefined,
        ResourceType: js.UndefOr[ResourceType] = js.undefined
    ): ConsumedLicenseSummary = {
      val __obj = js.Dynamic.literal()
      ConsumedLicenses.foreach(__v => __obj.updateDynamic("ConsumedLicenses")(__v.asInstanceOf[js.Any]))
      ResourceType.foreach(__v => __obj.updateDynamic("ResourceType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ConsumedLicenseSummary]
    }
  }

  /** Details about a consumption configuration.
    */
  @js.native
  trait ConsumptionConfiguration extends js.Object {
    var BorrowConfiguration: js.UndefOr[BorrowConfiguration]
    var ProvisionalConfiguration: js.UndefOr[ProvisionalConfiguration]
    var RenewType: js.UndefOr[RenewType]
  }

  object ConsumptionConfiguration {
    @inline
    def apply(
        BorrowConfiguration: js.UndefOr[BorrowConfiguration] = js.undefined,
        ProvisionalConfiguration: js.UndefOr[ProvisionalConfiguration] = js.undefined,
        RenewType: js.UndefOr[RenewType] = js.undefined
    ): ConsumptionConfiguration = {
      val __obj = js.Dynamic.literal()
      BorrowConfiguration.foreach(__v => __obj.updateDynamic("BorrowConfiguration")(__v.asInstanceOf[js.Any]))
      ProvisionalConfiguration.foreach(__v => __obj.updateDynamic("ProvisionalConfiguration")(__v.asInstanceOf[js.Any]))
      RenewType.foreach(__v => __obj.updateDynamic("RenewType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ConsumptionConfiguration]
    }
  }

  @js.native
  trait CreateGrantRequest extends js.Object {
    var AllowedOperations: AllowedOperationList
    var ClientToken: String
    var GrantName: String
    var HomeRegion: String
    var LicenseArn: Arn
    var Principals: PrincipalArnList
  }

  object CreateGrantRequest {
    @inline
    def apply(
        AllowedOperations: AllowedOperationList,
        ClientToken: String,
        GrantName: String,
        HomeRegion: String,
        LicenseArn: Arn,
        Principals: PrincipalArnList
    ): CreateGrantRequest = {
      val __obj = js.Dynamic.literal(
        "AllowedOperations" -> AllowedOperations.asInstanceOf[js.Any],
        "ClientToken" -> ClientToken.asInstanceOf[js.Any],
        "GrantName" -> GrantName.asInstanceOf[js.Any],
        "HomeRegion" -> HomeRegion.asInstanceOf[js.Any],
        "LicenseArn" -> LicenseArn.asInstanceOf[js.Any],
        "Principals" -> Principals.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateGrantRequest]
    }
  }

  @js.native
  trait CreateGrantResponse extends js.Object {
    var GrantArn: js.UndefOr[Arn]
    var Status: js.UndefOr[GrantStatus]
    var Version: js.UndefOr[String]
  }

  object CreateGrantResponse {
    @inline
    def apply(
        GrantArn: js.UndefOr[Arn] = js.undefined,
        Status: js.UndefOr[GrantStatus] = js.undefined,
        Version: js.UndefOr[String] = js.undefined
    ): CreateGrantResponse = {
      val __obj = js.Dynamic.literal()
      GrantArn.foreach(__v => __obj.updateDynamic("GrantArn")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      Version.foreach(__v => __obj.updateDynamic("Version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateGrantResponse]
    }
  }

  @js.native
  trait CreateGrantVersionRequest extends js.Object {
    var ClientToken: String
    var GrantArn: Arn
    var AllowedOperations: js.UndefOr[AllowedOperationList]
    var GrantName: js.UndefOr[String]
    var SourceVersion: js.UndefOr[String]
    var Status: js.UndefOr[GrantStatus]
  }

  object CreateGrantVersionRequest {
    @inline
    def apply(
        ClientToken: String,
        GrantArn: Arn,
        AllowedOperations: js.UndefOr[AllowedOperationList] = js.undefined,
        GrantName: js.UndefOr[String] = js.undefined,
        SourceVersion: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[GrantStatus] = js.undefined
    ): CreateGrantVersionRequest = {
      val __obj = js.Dynamic.literal(
        "ClientToken" -> ClientToken.asInstanceOf[js.Any],
        "GrantArn" -> GrantArn.asInstanceOf[js.Any]
      )

      AllowedOperations.foreach(__v => __obj.updateDynamic("AllowedOperations")(__v.asInstanceOf[js.Any]))
      GrantName.foreach(__v => __obj.updateDynamic("GrantName")(__v.asInstanceOf[js.Any]))
      SourceVersion.foreach(__v => __obj.updateDynamic("SourceVersion")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateGrantVersionRequest]
    }
  }

  @js.native
  trait CreateGrantVersionResponse extends js.Object {
    var GrantArn: js.UndefOr[Arn]
    var Status: js.UndefOr[GrantStatus]
    var Version: js.UndefOr[String]
  }

  object CreateGrantVersionResponse {
    @inline
    def apply(
        GrantArn: js.UndefOr[Arn] = js.undefined,
        Status: js.UndefOr[GrantStatus] = js.undefined,
        Version: js.UndefOr[String] = js.undefined
    ): CreateGrantVersionResponse = {
      val __obj = js.Dynamic.literal()
      GrantArn.foreach(__v => __obj.updateDynamic("GrantArn")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      Version.foreach(__v => __obj.updateDynamic("Version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateGrantVersionResponse]
    }
  }

  @js.native
  trait CreateLicenseConfigurationRequest extends js.Object {
    var LicenseCountingType: LicenseCountingType
    var Name: String
    var Description: js.UndefOr[String]
    var DisassociateWhenNotFound: js.UndefOr[BoxBoolean]
    var LicenseCount: js.UndefOr[BoxLong]
    var LicenseCountHardLimit: js.UndefOr[BoxBoolean]
    var LicenseRules: js.UndefOr[StringList]
    var ProductInformationList: js.UndefOr[ProductInformationList]
    var Tags: js.UndefOr[TagList]
  }

  object CreateLicenseConfigurationRequest {
    @inline
    def apply(
        LicenseCountingType: LicenseCountingType,
        Name: String,
        Description: js.UndefOr[String] = js.undefined,
        DisassociateWhenNotFound: js.UndefOr[BoxBoolean] = js.undefined,
        LicenseCount: js.UndefOr[BoxLong] = js.undefined,
        LicenseCountHardLimit: js.UndefOr[BoxBoolean] = js.undefined,
        LicenseRules: js.UndefOr[StringList] = js.undefined,
        ProductInformationList: js.UndefOr[ProductInformationList] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateLicenseConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "LicenseCountingType" -> LicenseCountingType.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      DisassociateWhenNotFound.foreach(__v => __obj.updateDynamic("DisassociateWhenNotFound")(__v.asInstanceOf[js.Any]))
      LicenseCount.foreach(__v => __obj.updateDynamic("LicenseCount")(__v.asInstanceOf[js.Any]))
      LicenseCountHardLimit.foreach(__v => __obj.updateDynamic("LicenseCountHardLimit")(__v.asInstanceOf[js.Any]))
      LicenseRules.foreach(__v => __obj.updateDynamic("LicenseRules")(__v.asInstanceOf[js.Any]))
      ProductInformationList.foreach(__v => __obj.updateDynamic("ProductInformationList")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateLicenseConfigurationRequest]
    }
  }

  @js.native
  trait CreateLicenseConfigurationResponse extends js.Object {
    var LicenseConfigurationArn: js.UndefOr[String]
  }

  object CreateLicenseConfigurationResponse {
    @inline
    def apply(
        LicenseConfigurationArn: js.UndefOr[String] = js.undefined
    ): CreateLicenseConfigurationResponse = {
      val __obj = js.Dynamic.literal()
      LicenseConfigurationArn.foreach(__v => __obj.updateDynamic("LicenseConfigurationArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateLicenseConfigurationResponse]
    }
  }

  @js.native
  trait CreateLicenseRequest extends js.Object {
    var Beneficiary: String
    var ClientToken: String
    var ConsumptionConfiguration: ConsumptionConfiguration
    var Entitlements: EntitlementList
    var HomeRegion: String
    var Issuer: Issuer
    var LicenseName: String
    var ProductName: String
    var ProductSKU: String
    var Validity: DatetimeRange
    var LicenseMetadata: js.UndefOr[MetadataList]
  }

  object CreateLicenseRequest {
    @inline
    def apply(
        Beneficiary: String,
        ClientToken: String,
        ConsumptionConfiguration: ConsumptionConfiguration,
        Entitlements: EntitlementList,
        HomeRegion: String,
        Issuer: Issuer,
        LicenseName: String,
        ProductName: String,
        ProductSKU: String,
        Validity: DatetimeRange,
        LicenseMetadata: js.UndefOr[MetadataList] = js.undefined
    ): CreateLicenseRequest = {
      val __obj = js.Dynamic.literal(
        "Beneficiary" -> Beneficiary.asInstanceOf[js.Any],
        "ClientToken" -> ClientToken.asInstanceOf[js.Any],
        "ConsumptionConfiguration" -> ConsumptionConfiguration.asInstanceOf[js.Any],
        "Entitlements" -> Entitlements.asInstanceOf[js.Any],
        "HomeRegion" -> HomeRegion.asInstanceOf[js.Any],
        "Issuer" -> Issuer.asInstanceOf[js.Any],
        "LicenseName" -> LicenseName.asInstanceOf[js.Any],
        "ProductName" -> ProductName.asInstanceOf[js.Any],
        "ProductSKU" -> ProductSKU.asInstanceOf[js.Any],
        "Validity" -> Validity.asInstanceOf[js.Any]
      )

      LicenseMetadata.foreach(__v => __obj.updateDynamic("LicenseMetadata")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateLicenseRequest]
    }
  }

  @js.native
  trait CreateLicenseResponse extends js.Object {
    var LicenseArn: js.UndefOr[Arn]
    var Status: js.UndefOr[LicenseStatus]
    var Version: js.UndefOr[String]
  }

  object CreateLicenseResponse {
    @inline
    def apply(
        LicenseArn: js.UndefOr[Arn] = js.undefined,
        Status: js.UndefOr[LicenseStatus] = js.undefined,
        Version: js.UndefOr[String] = js.undefined
    ): CreateLicenseResponse = {
      val __obj = js.Dynamic.literal()
      LicenseArn.foreach(__v => __obj.updateDynamic("LicenseArn")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      Version.foreach(__v => __obj.updateDynamic("Version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateLicenseResponse]
    }
  }

  @js.native
  trait CreateLicenseVersionRequest extends js.Object {
    var ClientToken: String
    var ConsumptionConfiguration: ConsumptionConfiguration
    var Entitlements: EntitlementList
    var HomeRegion: String
    var Issuer: Issuer
    var LicenseArn: Arn
    var LicenseName: String
    var ProductName: String
    var Status: LicenseStatus
    var Validity: DatetimeRange
    var LicenseMetadata: js.UndefOr[MetadataList]
    var SourceVersion: js.UndefOr[String]
  }

  object CreateLicenseVersionRequest {
    @inline
    def apply(
        ClientToken: String,
        ConsumptionConfiguration: ConsumptionConfiguration,
        Entitlements: EntitlementList,
        HomeRegion: String,
        Issuer: Issuer,
        LicenseArn: Arn,
        LicenseName: String,
        ProductName: String,
        Status: LicenseStatus,
        Validity: DatetimeRange,
        LicenseMetadata: js.UndefOr[MetadataList] = js.undefined,
        SourceVersion: js.UndefOr[String] = js.undefined
    ): CreateLicenseVersionRequest = {
      val __obj = js.Dynamic.literal(
        "ClientToken" -> ClientToken.asInstanceOf[js.Any],
        "ConsumptionConfiguration" -> ConsumptionConfiguration.asInstanceOf[js.Any],
        "Entitlements" -> Entitlements.asInstanceOf[js.Any],
        "HomeRegion" -> HomeRegion.asInstanceOf[js.Any],
        "Issuer" -> Issuer.asInstanceOf[js.Any],
        "LicenseArn" -> LicenseArn.asInstanceOf[js.Any],
        "LicenseName" -> LicenseName.asInstanceOf[js.Any],
        "ProductName" -> ProductName.asInstanceOf[js.Any],
        "Status" -> Status.asInstanceOf[js.Any],
        "Validity" -> Validity.asInstanceOf[js.Any]
      )

      LicenseMetadata.foreach(__v => __obj.updateDynamic("LicenseMetadata")(__v.asInstanceOf[js.Any]))
      SourceVersion.foreach(__v => __obj.updateDynamic("SourceVersion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateLicenseVersionRequest]
    }
  }

  @js.native
  trait CreateLicenseVersionResponse extends js.Object {
    var LicenseArn: js.UndefOr[Arn]
    var Status: js.UndefOr[LicenseStatus]
    var Version: js.UndefOr[String]
  }

  object CreateLicenseVersionResponse {
    @inline
    def apply(
        LicenseArn: js.UndefOr[Arn] = js.undefined,
        Status: js.UndefOr[LicenseStatus] = js.undefined,
        Version: js.UndefOr[String] = js.undefined
    ): CreateLicenseVersionResponse = {
      val __obj = js.Dynamic.literal()
      LicenseArn.foreach(__v => __obj.updateDynamic("LicenseArn")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      Version.foreach(__v => __obj.updateDynamic("Version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateLicenseVersionResponse]
    }
  }

  @js.native
  trait CreateTokenRequest extends js.Object {
    var ClientToken: IdempotencyToken
    var LicenseArn: Arn
    var ExpirationInDays: js.UndefOr[Int]
    var RoleArns: js.UndefOr[ArnList]
    var TokenProperties: js.UndefOr[MaxSize3StringList]
  }

  object CreateTokenRequest {
    @inline
    def apply(
        ClientToken: IdempotencyToken,
        LicenseArn: Arn,
        ExpirationInDays: js.UndefOr[Int] = js.undefined,
        RoleArns: js.UndefOr[ArnList] = js.undefined,
        TokenProperties: js.UndefOr[MaxSize3StringList] = js.undefined
    ): CreateTokenRequest = {
      val __obj = js.Dynamic.literal(
        "ClientToken" -> ClientToken.asInstanceOf[js.Any],
        "LicenseArn" -> LicenseArn.asInstanceOf[js.Any]
      )

      ExpirationInDays.foreach(__v => __obj.updateDynamic("ExpirationInDays")(__v.asInstanceOf[js.Any]))
      RoleArns.foreach(__v => __obj.updateDynamic("RoleArns")(__v.asInstanceOf[js.Any]))
      TokenProperties.foreach(__v => __obj.updateDynamic("TokenProperties")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateTokenRequest]
    }
  }

  @js.native
  trait CreateTokenResponse extends js.Object {
    var Token: js.UndefOr[TokenString]
    var TokenId: js.UndefOr[String]
    var TokenType: js.UndefOr[TokenType]
  }

  object CreateTokenResponse {
    @inline
    def apply(
        Token: js.UndefOr[TokenString] = js.undefined,
        TokenId: js.UndefOr[String] = js.undefined,
        TokenType: js.UndefOr[TokenType] = js.undefined
    ): CreateTokenResponse = {
      val __obj = js.Dynamic.literal()
      Token.foreach(__v => __obj.updateDynamic("Token")(__v.asInstanceOf[js.Any]))
      TokenId.foreach(__v => __obj.updateDynamic("TokenId")(__v.asInstanceOf[js.Any]))
      TokenType.foreach(__v => __obj.updateDynamic("TokenType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateTokenResponse]
    }
  }

  /** Describes a time range, in ISO8601-UTC format.
    */
  @js.native
  trait DatetimeRange extends js.Object {
    var Begin: ISO8601DateTime
    var End: js.UndefOr[ISO8601DateTime]
  }

  object DatetimeRange {
    @inline
    def apply(
        Begin: ISO8601DateTime,
        End: js.UndefOr[ISO8601DateTime] = js.undefined
    ): DatetimeRange = {
      val __obj = js.Dynamic.literal(
        "Begin" -> Begin.asInstanceOf[js.Any]
      )

      End.foreach(__v => __obj.updateDynamic("End")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DatetimeRange]
    }
  }

  @js.native
  trait DeleteGrantRequest extends js.Object {
    var GrantArn: Arn
    var Version: String
  }

  object DeleteGrantRequest {
    @inline
    def apply(
        GrantArn: Arn,
        Version: String
    ): DeleteGrantRequest = {
      val __obj = js.Dynamic.literal(
        "GrantArn" -> GrantArn.asInstanceOf[js.Any],
        "Version" -> Version.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteGrantRequest]
    }
  }

  @js.native
  trait DeleteGrantResponse extends js.Object {
    var GrantArn: js.UndefOr[Arn]
    var Status: js.UndefOr[GrantStatus]
    var Version: js.UndefOr[String]
  }

  object DeleteGrantResponse {
    @inline
    def apply(
        GrantArn: js.UndefOr[Arn] = js.undefined,
        Status: js.UndefOr[GrantStatus] = js.undefined,
        Version: js.UndefOr[String] = js.undefined
    ): DeleteGrantResponse = {
      val __obj = js.Dynamic.literal()
      GrantArn.foreach(__v => __obj.updateDynamic("GrantArn")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      Version.foreach(__v => __obj.updateDynamic("Version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteGrantResponse]
    }
  }

  @js.native
  trait DeleteLicenseConfigurationRequest extends js.Object {
    var LicenseConfigurationArn: String
  }

  object DeleteLicenseConfigurationRequest {
    @inline
    def apply(
        LicenseConfigurationArn: String
    ): DeleteLicenseConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "LicenseConfigurationArn" -> LicenseConfigurationArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteLicenseConfigurationRequest]
    }
  }

  @js.native
  trait DeleteLicenseConfigurationResponse extends js.Object

  object DeleteLicenseConfigurationResponse {
    @inline
    def apply(): DeleteLicenseConfigurationResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteLicenseConfigurationResponse]
    }
  }

  @js.native
  trait DeleteLicenseRequest extends js.Object {
    var LicenseArn: Arn
    var SourceVersion: String
  }

  object DeleteLicenseRequest {
    @inline
    def apply(
        LicenseArn: Arn,
        SourceVersion: String
    ): DeleteLicenseRequest = {
      val __obj = js.Dynamic.literal(
        "LicenseArn" -> LicenseArn.asInstanceOf[js.Any],
        "SourceVersion" -> SourceVersion.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteLicenseRequest]
    }
  }

  @js.native
  trait DeleteLicenseResponse extends js.Object {
    var DeletionDate: js.UndefOr[ISO8601DateTime]
    var Status: js.UndefOr[LicenseDeletionStatus]
  }

  object DeleteLicenseResponse {
    @inline
    def apply(
        DeletionDate: js.UndefOr[ISO8601DateTime] = js.undefined,
        Status: js.UndefOr[LicenseDeletionStatus] = js.undefined
    ): DeleteLicenseResponse = {
      val __obj = js.Dynamic.literal()
      DeletionDate.foreach(__v => __obj.updateDynamic("DeletionDate")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteLicenseResponse]
    }
  }

  @js.native
  trait DeleteTokenRequest extends js.Object {
    var TokenId: String
  }

  object DeleteTokenRequest {
    @inline
    def apply(
        TokenId: String
    ): DeleteTokenRequest = {
      val __obj = js.Dynamic.literal(
        "TokenId" -> TokenId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteTokenRequest]
    }
  }

  @js.native
  trait DeleteTokenResponse extends js.Object

  object DeleteTokenResponse {
    @inline
    def apply(): DeleteTokenResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteTokenResponse]
    }
  }

  @js.native
  sealed trait DigitalSignatureMethod extends js.Any
  object DigitalSignatureMethod {
    val JWT_PS384 = "JWT_PS384".asInstanceOf[DigitalSignatureMethod]

    @inline def values = js.Array(JWT_PS384)
  }

  /** Describes a resource entitled for use with a license.
    */
  @js.native
  trait Entitlement extends js.Object {
    var Name: String
    var Unit: EntitlementUnit
    var AllowCheckIn: js.UndefOr[BoxBoolean]
    var MaxCount: js.UndefOr[Double]
    var Overage: js.UndefOr[BoxBoolean]
    var Value: js.UndefOr[String]
  }

  object Entitlement {
    @inline
    def apply(
        Name: String,
        Unit: EntitlementUnit,
        AllowCheckIn: js.UndefOr[BoxBoolean] = js.undefined,
        MaxCount: js.UndefOr[Double] = js.undefined,
        Overage: js.UndefOr[BoxBoolean] = js.undefined,
        Value: js.UndefOr[String] = js.undefined
    ): Entitlement = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "Unit" -> Unit.asInstanceOf[js.Any]
      )

      AllowCheckIn.foreach(__v => __obj.updateDynamic("AllowCheckIn")(__v.asInstanceOf[js.Any]))
      MaxCount.foreach(__v => __obj.updateDynamic("MaxCount")(__v.asInstanceOf[js.Any]))
      Overage.foreach(__v => __obj.updateDynamic("Overage")(__v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Entitlement]
    }
  }

  /** Data associated with an entitlement resource.
    */
  @js.native
  trait EntitlementData extends js.Object {
    var Name: String
    var Unit: EntitlementDataUnit
    var Value: js.UndefOr[String]
  }

  object EntitlementData {
    @inline
    def apply(
        Name: String,
        Unit: EntitlementDataUnit,
        Value: js.UndefOr[String] = js.undefined
    ): EntitlementData = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "Unit" -> Unit.asInstanceOf[js.Any]
      )

      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EntitlementData]
    }
  }

  @js.native
  sealed trait EntitlementDataUnit extends js.Any
  object EntitlementDataUnit {
    val Count = "Count".asInstanceOf[EntitlementDataUnit]
    val None = "None".asInstanceOf[EntitlementDataUnit]
    val Seconds = "Seconds".asInstanceOf[EntitlementDataUnit]
    val Microseconds = "Microseconds".asInstanceOf[EntitlementDataUnit]
    val Milliseconds = "Milliseconds".asInstanceOf[EntitlementDataUnit]
    val Bytes = "Bytes".asInstanceOf[EntitlementDataUnit]
    val Kilobytes = "Kilobytes".asInstanceOf[EntitlementDataUnit]
    val Megabytes = "Megabytes".asInstanceOf[EntitlementDataUnit]
    val Gigabytes = "Gigabytes".asInstanceOf[EntitlementDataUnit]
    val Terabytes = "Terabytes".asInstanceOf[EntitlementDataUnit]
    val Bits = "Bits".asInstanceOf[EntitlementDataUnit]
    val Kilobits = "Kilobits".asInstanceOf[EntitlementDataUnit]
    val Megabits = "Megabits".asInstanceOf[EntitlementDataUnit]
    val Gigabits = "Gigabits".asInstanceOf[EntitlementDataUnit]
    val Terabits = "Terabits".asInstanceOf[EntitlementDataUnit]
    val Percent = "Percent".asInstanceOf[EntitlementDataUnit]
    val `Bytes/Second` = "Bytes/Second".asInstanceOf[EntitlementDataUnit]
    val `Kilobytes/Second` = "Kilobytes/Second".asInstanceOf[EntitlementDataUnit]
    val `Megabytes/Second` = "Megabytes/Second".asInstanceOf[EntitlementDataUnit]
    val `Gigabytes/Second` = "Gigabytes/Second".asInstanceOf[EntitlementDataUnit]
    val `Terabytes/Second` = "Terabytes/Second".asInstanceOf[EntitlementDataUnit]
    val `Bits/Second` = "Bits/Second".asInstanceOf[EntitlementDataUnit]
    val `Kilobits/Second` = "Kilobits/Second".asInstanceOf[EntitlementDataUnit]
    val `Megabits/Second` = "Megabits/Second".asInstanceOf[EntitlementDataUnit]
    val `Gigabits/Second` = "Gigabits/Second".asInstanceOf[EntitlementDataUnit]
    val `Terabits/Second` = "Terabits/Second".asInstanceOf[EntitlementDataUnit]
    val `Count/Second` = "Count/Second".asInstanceOf[EntitlementDataUnit]

    @inline def values = js.Array(
      Count,
      None,
      Seconds,
      Microseconds,
      Milliseconds,
      Bytes,
      Kilobytes,
      Megabytes,
      Gigabytes,
      Terabytes,
      Bits,
      Kilobits,
      Megabits,
      Gigabits,
      Terabits,
      Percent,
      `Bytes/Second`,
      `Kilobytes/Second`,
      `Megabytes/Second`,
      `Gigabytes/Second`,
      `Terabytes/Second`,
      `Bits/Second`,
      `Kilobits/Second`,
      `Megabits/Second`,
      `Gigabits/Second`,
      `Terabits/Second`,
      `Count/Second`
    )
  }

  @js.native
  sealed trait EntitlementUnit extends js.Any
  object EntitlementUnit {
    val Count = "Count".asInstanceOf[EntitlementUnit]
    val None = "None".asInstanceOf[EntitlementUnit]
    val Seconds = "Seconds".asInstanceOf[EntitlementUnit]
    val Microseconds = "Microseconds".asInstanceOf[EntitlementUnit]
    val Milliseconds = "Milliseconds".asInstanceOf[EntitlementUnit]
    val Bytes = "Bytes".asInstanceOf[EntitlementUnit]
    val Kilobytes = "Kilobytes".asInstanceOf[EntitlementUnit]
    val Megabytes = "Megabytes".asInstanceOf[EntitlementUnit]
    val Gigabytes = "Gigabytes".asInstanceOf[EntitlementUnit]
    val Terabytes = "Terabytes".asInstanceOf[EntitlementUnit]
    val Bits = "Bits".asInstanceOf[EntitlementUnit]
    val Kilobits = "Kilobits".asInstanceOf[EntitlementUnit]
    val Megabits = "Megabits".asInstanceOf[EntitlementUnit]
    val Gigabits = "Gigabits".asInstanceOf[EntitlementUnit]
    val Terabits = "Terabits".asInstanceOf[EntitlementUnit]
    val Percent = "Percent".asInstanceOf[EntitlementUnit]
    val `Bytes/Second` = "Bytes/Second".asInstanceOf[EntitlementUnit]
    val `Kilobytes/Second` = "Kilobytes/Second".asInstanceOf[EntitlementUnit]
    val `Megabytes/Second` = "Megabytes/Second".asInstanceOf[EntitlementUnit]
    val `Gigabytes/Second` = "Gigabytes/Second".asInstanceOf[EntitlementUnit]
    val `Terabytes/Second` = "Terabytes/Second".asInstanceOf[EntitlementUnit]
    val `Bits/Second` = "Bits/Second".asInstanceOf[EntitlementUnit]
    val `Kilobits/Second` = "Kilobits/Second".asInstanceOf[EntitlementUnit]
    val `Megabits/Second` = "Megabits/Second".asInstanceOf[EntitlementUnit]
    val `Gigabits/Second` = "Gigabits/Second".asInstanceOf[EntitlementUnit]
    val `Terabits/Second` = "Terabits/Second".asInstanceOf[EntitlementUnit]
    val `Count/Second` = "Count/Second".asInstanceOf[EntitlementUnit]

    @inline def values = js.Array(
      Count,
      None,
      Seconds,
      Microseconds,
      Milliseconds,
      Bytes,
      Kilobytes,
      Megabytes,
      Gigabytes,
      Terabytes,
      Bits,
      Kilobits,
      Megabits,
      Gigabits,
      Terabits,
      Percent,
      `Bytes/Second`,
      `Kilobytes/Second`,
      `Megabytes/Second`,
      `Gigabytes/Second`,
      `Terabytes/Second`,
      `Bits/Second`,
      `Kilobits/Second`,
      `Megabits/Second`,
      `Gigabits/Second`,
      `Terabits/Second`,
      `Count/Second`
    )
  }

  /** Usage associated with an entitlement resource.
    */
  @js.native
  trait EntitlementUsage extends js.Object {
    var ConsumedValue: String
    var Name: String
    var Unit: EntitlementDataUnit
    var MaxCount: js.UndefOr[String]
  }

  object EntitlementUsage {
    @inline
    def apply(
        ConsumedValue: String,
        Name: String,
        Unit: EntitlementDataUnit,
        MaxCount: js.UndefOr[String] = js.undefined
    ): EntitlementUsage = {
      val __obj = js.Dynamic.literal(
        "ConsumedValue" -> ConsumedValue.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any],
        "Unit" -> Unit.asInstanceOf[js.Any]
      )

      MaxCount.foreach(__v => __obj.updateDynamic("MaxCount")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EntitlementUsage]
    }
  }

  @js.native
  trait ExtendLicenseConsumptionRequest extends js.Object {
    var LicenseConsumptionToken: String
    var DryRun: js.UndefOr[Boolean]
  }

  object ExtendLicenseConsumptionRequest {
    @inline
    def apply(
        LicenseConsumptionToken: String,
        DryRun: js.UndefOr[Boolean] = js.undefined
    ): ExtendLicenseConsumptionRequest = {
      val __obj = js.Dynamic.literal(
        "LicenseConsumptionToken" -> LicenseConsumptionToken.asInstanceOf[js.Any]
      )

      DryRun.foreach(__v => __obj.updateDynamic("DryRun")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ExtendLicenseConsumptionRequest]
    }
  }

  @js.native
  trait ExtendLicenseConsumptionResponse extends js.Object {
    var Expiration: js.UndefOr[ISO8601DateTime]
    var LicenseConsumptionToken: js.UndefOr[String]
  }

  object ExtendLicenseConsumptionResponse {
    @inline
    def apply(
        Expiration: js.UndefOr[ISO8601DateTime] = js.undefined,
        LicenseConsumptionToken: js.UndefOr[String] = js.undefined
    ): ExtendLicenseConsumptionResponse = {
      val __obj = js.Dynamic.literal()
      Expiration.foreach(__v => __obj.updateDynamic("Expiration")(__v.asInstanceOf[js.Any]))
      LicenseConsumptionToken.foreach(__v => __obj.updateDynamic("LicenseConsumptionToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ExtendLicenseConsumptionResponse]
    }
  }

  /** A filter name and value pair that is used to return more specific results from a describe operation. Filters can be used to match a set of resources by specific criteria, such as tags, attributes, or IDs.
    */
  @js.native
  trait Filter extends js.Object {
    var Name: js.UndefOr[FilterName]
    var Values: js.UndefOr[FilterValues]
  }

  object Filter {
    @inline
    def apply(
        Name: js.UndefOr[FilterName] = js.undefined,
        Values: js.UndefOr[FilterValues] = js.undefined
    ): Filter = {
      val __obj = js.Dynamic.literal()
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Values.foreach(__v => __obj.updateDynamic("Values")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Filter]
    }
  }

  @js.native
  trait GetAccessTokenRequest extends js.Object {
    var Token: TokenString
    var TokenProperties: js.UndefOr[MaxSize3StringList]
  }

  object GetAccessTokenRequest {
    @inline
    def apply(
        Token: TokenString,
        TokenProperties: js.UndefOr[MaxSize3StringList] = js.undefined
    ): GetAccessTokenRequest = {
      val __obj = js.Dynamic.literal(
        "Token" -> Token.asInstanceOf[js.Any]
      )

      TokenProperties.foreach(__v => __obj.updateDynamic("TokenProperties")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetAccessTokenRequest]
    }
  }

  @js.native
  trait GetAccessTokenResponse extends js.Object {
    var AccessToken: js.UndefOr[TokenString]
  }

  object GetAccessTokenResponse {
    @inline
    def apply(
        AccessToken: js.UndefOr[TokenString] = js.undefined
    ): GetAccessTokenResponse = {
      val __obj = js.Dynamic.literal()
      AccessToken.foreach(__v => __obj.updateDynamic("AccessToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetAccessTokenResponse]
    }
  }

  @js.native
  trait GetGrantRequest extends js.Object {
    var GrantArn: Arn
    var Version: js.UndefOr[String]
  }

  object GetGrantRequest {
    @inline
    def apply(
        GrantArn: Arn,
        Version: js.UndefOr[String] = js.undefined
    ): GetGrantRequest = {
      val __obj = js.Dynamic.literal(
        "GrantArn" -> GrantArn.asInstanceOf[js.Any]
      )

      Version.foreach(__v => __obj.updateDynamic("Version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetGrantRequest]
    }
  }

  @js.native
  trait GetGrantResponse extends js.Object {
    var Grant: js.UndefOr[Grant]
  }

  object GetGrantResponse {
    @inline
    def apply(
        Grant: js.UndefOr[Grant] = js.undefined
    ): GetGrantResponse = {
      val __obj = js.Dynamic.literal()
      Grant.foreach(__v => __obj.updateDynamic("Grant")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetGrantResponse]
    }
  }

  @js.native
  trait GetLicenseConfigurationRequest extends js.Object {
    var LicenseConfigurationArn: String
  }

  object GetLicenseConfigurationRequest {
    @inline
    def apply(
        LicenseConfigurationArn: String
    ): GetLicenseConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "LicenseConfigurationArn" -> LicenseConfigurationArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetLicenseConfigurationRequest]
    }
  }

  @js.native
  trait GetLicenseConfigurationResponse extends js.Object {
    var AutomatedDiscoveryInformation: js.UndefOr[AutomatedDiscoveryInformation]
    var ConsumedLicenseSummaryList: js.UndefOr[ConsumedLicenseSummaryList]
    var ConsumedLicenses: js.UndefOr[BoxLong]
    var Description: js.UndefOr[String]
    var DisassociateWhenNotFound: js.UndefOr[BoxBoolean]
    var LicenseConfigurationArn: js.UndefOr[String]
    var LicenseConfigurationId: js.UndefOr[String]
    var LicenseCount: js.UndefOr[BoxLong]
    var LicenseCountHardLimit: js.UndefOr[BoxBoolean]
    var LicenseCountingType: js.UndefOr[LicenseCountingType]
    var LicenseRules: js.UndefOr[StringList]
    var ManagedResourceSummaryList: js.UndefOr[ManagedResourceSummaryList]
    var Name: js.UndefOr[String]
    var OwnerAccountId: js.UndefOr[String]
    var ProductInformationList: js.UndefOr[ProductInformationList]
    var Status: js.UndefOr[String]
    var Tags: js.UndefOr[TagList]
  }

  object GetLicenseConfigurationResponse {
    @inline
    def apply(
        AutomatedDiscoveryInformation: js.UndefOr[AutomatedDiscoveryInformation] = js.undefined,
        ConsumedLicenseSummaryList: js.UndefOr[ConsumedLicenseSummaryList] = js.undefined,
        ConsumedLicenses: js.UndefOr[BoxLong] = js.undefined,
        Description: js.UndefOr[String] = js.undefined,
        DisassociateWhenNotFound: js.UndefOr[BoxBoolean] = js.undefined,
        LicenseConfigurationArn: js.UndefOr[String] = js.undefined,
        LicenseConfigurationId: js.UndefOr[String] = js.undefined,
        LicenseCount: js.UndefOr[BoxLong] = js.undefined,
        LicenseCountHardLimit: js.UndefOr[BoxBoolean] = js.undefined,
        LicenseCountingType: js.UndefOr[LicenseCountingType] = js.undefined,
        LicenseRules: js.UndefOr[StringList] = js.undefined,
        ManagedResourceSummaryList: js.UndefOr[ManagedResourceSummaryList] = js.undefined,
        Name: js.UndefOr[String] = js.undefined,
        OwnerAccountId: js.UndefOr[String] = js.undefined,
        ProductInformationList: js.UndefOr[ProductInformationList] = js.undefined,
        Status: js.UndefOr[String] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): GetLicenseConfigurationResponse = {
      val __obj = js.Dynamic.literal()
      AutomatedDiscoveryInformation.foreach(__v => __obj.updateDynamic("AutomatedDiscoveryInformation")(__v.asInstanceOf[js.Any]))
      ConsumedLicenseSummaryList.foreach(__v => __obj.updateDynamic("ConsumedLicenseSummaryList")(__v.asInstanceOf[js.Any]))
      ConsumedLicenses.foreach(__v => __obj.updateDynamic("ConsumedLicenses")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      DisassociateWhenNotFound.foreach(__v => __obj.updateDynamic("DisassociateWhenNotFound")(__v.asInstanceOf[js.Any]))
      LicenseConfigurationArn.foreach(__v => __obj.updateDynamic("LicenseConfigurationArn")(__v.asInstanceOf[js.Any]))
      LicenseConfigurationId.foreach(__v => __obj.updateDynamic("LicenseConfigurationId")(__v.asInstanceOf[js.Any]))
      LicenseCount.foreach(__v => __obj.updateDynamic("LicenseCount")(__v.asInstanceOf[js.Any]))
      LicenseCountHardLimit.foreach(__v => __obj.updateDynamic("LicenseCountHardLimit")(__v.asInstanceOf[js.Any]))
      LicenseCountingType.foreach(__v => __obj.updateDynamic("LicenseCountingType")(__v.asInstanceOf[js.Any]))
      LicenseRules.foreach(__v => __obj.updateDynamic("LicenseRules")(__v.asInstanceOf[js.Any]))
      ManagedResourceSummaryList.foreach(__v => __obj.updateDynamic("ManagedResourceSummaryList")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      OwnerAccountId.foreach(__v => __obj.updateDynamic("OwnerAccountId")(__v.asInstanceOf[js.Any]))
      ProductInformationList.foreach(__v => __obj.updateDynamic("ProductInformationList")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetLicenseConfigurationResponse]
    }
  }

  @js.native
  trait GetLicenseRequest extends js.Object {
    var LicenseArn: Arn
    var Version: js.UndefOr[String]
  }

  object GetLicenseRequest {
    @inline
    def apply(
        LicenseArn: Arn,
        Version: js.UndefOr[String] = js.undefined
    ): GetLicenseRequest = {
      val __obj = js.Dynamic.literal(
        "LicenseArn" -> LicenseArn.asInstanceOf[js.Any]
      )

      Version.foreach(__v => __obj.updateDynamic("Version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetLicenseRequest]
    }
  }

  @js.native
  trait GetLicenseResponse extends js.Object {
    var License: js.UndefOr[License]
  }

  object GetLicenseResponse {
    @inline
    def apply(
        License: js.UndefOr[License] = js.undefined
    ): GetLicenseResponse = {
      val __obj = js.Dynamic.literal()
      License.foreach(__v => __obj.updateDynamic("License")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetLicenseResponse]
    }
  }

  @js.native
  trait GetLicenseUsageRequest extends js.Object {
    var LicenseArn: Arn
  }

  object GetLicenseUsageRequest {
    @inline
    def apply(
        LicenseArn: Arn
    ): GetLicenseUsageRequest = {
      val __obj = js.Dynamic.literal(
        "LicenseArn" -> LicenseArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetLicenseUsageRequest]
    }
  }

  @js.native
  trait GetLicenseUsageResponse extends js.Object {
    var LicenseUsage: js.UndefOr[LicenseUsage]
  }

  object GetLicenseUsageResponse {
    @inline
    def apply(
        LicenseUsage: js.UndefOr[LicenseUsage] = js.undefined
    ): GetLicenseUsageResponse = {
      val __obj = js.Dynamic.literal()
      LicenseUsage.foreach(__v => __obj.updateDynamic("LicenseUsage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetLicenseUsageResponse]
    }
  }

  @js.native
  trait GetServiceSettingsRequest extends js.Object

  object GetServiceSettingsRequest {
    @inline
    def apply(): GetServiceSettingsRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetServiceSettingsRequest]
    }
  }

  @js.native
  trait GetServiceSettingsResponse extends js.Object {
    var EnableCrossAccountsDiscovery: js.UndefOr[BoxBoolean]
    var LicenseManagerResourceShareArn: js.UndefOr[String]
    var OrganizationConfiguration: js.UndefOr[OrganizationConfiguration]
    var S3BucketArn: js.UndefOr[String]
    var SnsTopicArn: js.UndefOr[String]
  }

  object GetServiceSettingsResponse {
    @inline
    def apply(
        EnableCrossAccountsDiscovery: js.UndefOr[BoxBoolean] = js.undefined,
        LicenseManagerResourceShareArn: js.UndefOr[String] = js.undefined,
        OrganizationConfiguration: js.UndefOr[OrganizationConfiguration] = js.undefined,
        S3BucketArn: js.UndefOr[String] = js.undefined,
        SnsTopicArn: js.UndefOr[String] = js.undefined
    ): GetServiceSettingsResponse = {
      val __obj = js.Dynamic.literal()
      EnableCrossAccountsDiscovery.foreach(__v => __obj.updateDynamic("EnableCrossAccountsDiscovery")(__v.asInstanceOf[js.Any]))
      LicenseManagerResourceShareArn.foreach(__v => __obj.updateDynamic("LicenseManagerResourceShareArn")(__v.asInstanceOf[js.Any]))
      OrganizationConfiguration.foreach(__v => __obj.updateDynamic("OrganizationConfiguration")(__v.asInstanceOf[js.Any]))
      S3BucketArn.foreach(__v => __obj.updateDynamic("S3BucketArn")(__v.asInstanceOf[js.Any]))
      SnsTopicArn.foreach(__v => __obj.updateDynamic("SnsTopicArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetServiceSettingsResponse]
    }
  }

  /** Describes a grant.
    */
  @js.native
  trait Grant extends js.Object {
    var GrantArn: Arn
    var GrantName: String
    var GrantStatus: GrantStatus
    var GrantedOperations: AllowedOperationList
    var GranteePrincipalArn: Arn
    var HomeRegion: String
    var LicenseArn: Arn
    var ParentArn: Arn
    var Version: String
    var StatusReason: js.UndefOr[String]
  }

  object Grant {
    @inline
    def apply(
        GrantArn: Arn,
        GrantName: String,
        GrantStatus: GrantStatus,
        GrantedOperations: AllowedOperationList,
        GranteePrincipalArn: Arn,
        HomeRegion: String,
        LicenseArn: Arn,
        ParentArn: Arn,
        Version: String,
        StatusReason: js.UndefOr[String] = js.undefined
    ): Grant = {
      val __obj = js.Dynamic.literal(
        "GrantArn" -> GrantArn.asInstanceOf[js.Any],
        "GrantName" -> GrantName.asInstanceOf[js.Any],
        "GrantStatus" -> GrantStatus.asInstanceOf[js.Any],
        "GrantedOperations" -> GrantedOperations.asInstanceOf[js.Any],
        "GranteePrincipalArn" -> GranteePrincipalArn.asInstanceOf[js.Any],
        "HomeRegion" -> HomeRegion.asInstanceOf[js.Any],
        "LicenseArn" -> LicenseArn.asInstanceOf[js.Any],
        "ParentArn" -> ParentArn.asInstanceOf[js.Any],
        "Version" -> Version.asInstanceOf[js.Any]
      )

      StatusReason.foreach(__v => __obj.updateDynamic("StatusReason")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Grant]
    }
  }

  @js.native
  sealed trait GrantStatus extends js.Any
  object GrantStatus {
    val PENDING_WORKFLOW = "PENDING_WORKFLOW".asInstanceOf[GrantStatus]
    val PENDING_ACCEPT = "PENDING_ACCEPT".asInstanceOf[GrantStatus]
    val REJECTED = "REJECTED".asInstanceOf[GrantStatus]
    val ACTIVE = "ACTIVE".asInstanceOf[GrantStatus]
    val FAILED_WORKFLOW = "FAILED_WORKFLOW".asInstanceOf[GrantStatus]
    val DELETED = "DELETED".asInstanceOf[GrantStatus]
    val PENDING_DELETE = "PENDING_DELETE".asInstanceOf[GrantStatus]
    val DISABLED = "DISABLED".asInstanceOf[GrantStatus]

    @inline def values = js.Array(PENDING_WORKFLOW, PENDING_ACCEPT, REJECTED, ACTIVE, FAILED_WORKFLOW, DELETED, PENDING_DELETE, DISABLED)
  }

  /** Describes a license that is granted to a grantee.
    */
  @js.native
  trait GrantedLicense extends js.Object {
    var Beneficiary: js.UndefOr[String]
    var ConsumptionConfiguration: js.UndefOr[ConsumptionConfiguration]
    var CreateTime: js.UndefOr[ISO8601DateTime]
    var Entitlements: js.UndefOr[EntitlementList]
    var HomeRegion: js.UndefOr[String]
    var Issuer: js.UndefOr[IssuerDetails]
    var LicenseArn: js.UndefOr[Arn]
    var LicenseMetadata: js.UndefOr[MetadataList]
    var LicenseName: js.UndefOr[String]
    var ProductName: js.UndefOr[String]
    var ProductSKU: js.UndefOr[String]
    var ReceivedMetadata: js.UndefOr[ReceivedMetadata]
    var Status: js.UndefOr[LicenseStatus]
    var Validity: js.UndefOr[DatetimeRange]
    var Version: js.UndefOr[String]
  }

  object GrantedLicense {
    @inline
    def apply(
        Beneficiary: js.UndefOr[String] = js.undefined,
        ConsumptionConfiguration: js.UndefOr[ConsumptionConfiguration] = js.undefined,
        CreateTime: js.UndefOr[ISO8601DateTime] = js.undefined,
        Entitlements: js.UndefOr[EntitlementList] = js.undefined,
        HomeRegion: js.UndefOr[String] = js.undefined,
        Issuer: js.UndefOr[IssuerDetails] = js.undefined,
        LicenseArn: js.UndefOr[Arn] = js.undefined,
        LicenseMetadata: js.UndefOr[MetadataList] = js.undefined,
        LicenseName: js.UndefOr[String] = js.undefined,
        ProductName: js.UndefOr[String] = js.undefined,
        ProductSKU: js.UndefOr[String] = js.undefined,
        ReceivedMetadata: js.UndefOr[ReceivedMetadata] = js.undefined,
        Status: js.UndefOr[LicenseStatus] = js.undefined,
        Validity: js.UndefOr[DatetimeRange] = js.undefined,
        Version: js.UndefOr[String] = js.undefined
    ): GrantedLicense = {
      val __obj = js.Dynamic.literal()
      Beneficiary.foreach(__v => __obj.updateDynamic("Beneficiary")(__v.asInstanceOf[js.Any]))
      ConsumptionConfiguration.foreach(__v => __obj.updateDynamic("ConsumptionConfiguration")(__v.asInstanceOf[js.Any]))
      CreateTime.foreach(__v => __obj.updateDynamic("CreateTime")(__v.asInstanceOf[js.Any]))
      Entitlements.foreach(__v => __obj.updateDynamic("Entitlements")(__v.asInstanceOf[js.Any]))
      HomeRegion.foreach(__v => __obj.updateDynamic("HomeRegion")(__v.asInstanceOf[js.Any]))
      Issuer.foreach(__v => __obj.updateDynamic("Issuer")(__v.asInstanceOf[js.Any]))
      LicenseArn.foreach(__v => __obj.updateDynamic("LicenseArn")(__v.asInstanceOf[js.Any]))
      LicenseMetadata.foreach(__v => __obj.updateDynamic("LicenseMetadata")(__v.asInstanceOf[js.Any]))
      LicenseName.foreach(__v => __obj.updateDynamic("LicenseName")(__v.asInstanceOf[js.Any]))
      ProductName.foreach(__v => __obj.updateDynamic("ProductName")(__v.asInstanceOf[js.Any]))
      ProductSKU.foreach(__v => __obj.updateDynamic("ProductSKU")(__v.asInstanceOf[js.Any]))
      ReceivedMetadata.foreach(__v => __obj.updateDynamic("ReceivedMetadata")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      Validity.foreach(__v => __obj.updateDynamic("Validity")(__v.asInstanceOf[js.Any]))
      Version.foreach(__v => __obj.updateDynamic("Version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GrantedLicense]
    }
  }

  /** An inventory filter.
    */
  @js.native
  trait InventoryFilter extends js.Object {
    var Condition: InventoryFilterCondition
    var Name: String
    var Value: js.UndefOr[String]
  }

  object InventoryFilter {
    @inline
    def apply(
        Condition: InventoryFilterCondition,
        Name: String,
        Value: js.UndefOr[String] = js.undefined
    ): InventoryFilter = {
      val __obj = js.Dynamic.literal(
        "Condition" -> Condition.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]
      )

      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InventoryFilter]
    }
  }

  @js.native
  sealed trait InventoryFilterCondition extends js.Any
  object InventoryFilterCondition {
    val EQUALS = "EQUALS".asInstanceOf[InventoryFilterCondition]
    val NOT_EQUALS = "NOT_EQUALS".asInstanceOf[InventoryFilterCondition]
    val BEGINS_WITH = "BEGINS_WITH".asInstanceOf[InventoryFilterCondition]
    val CONTAINS = "CONTAINS".asInstanceOf[InventoryFilterCondition]

    @inline def values = js.Array(EQUALS, NOT_EQUALS, BEGINS_WITH, CONTAINS)
  }

  /** Details about the issuer of a license.
    */
  @js.native
  trait Issuer extends js.Object {
    var Name: String
    var SignKey: js.UndefOr[String]
  }

  object Issuer {
    @inline
    def apply(
        Name: String,
        SignKey: js.UndefOr[String] = js.undefined
    ): Issuer = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      SignKey.foreach(__v => __obj.updateDynamic("SignKey")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Issuer]
    }
  }

  /** Details associated with the issuer of a license.
    */
  @js.native
  trait IssuerDetails extends js.Object {
    var KeyFingerprint: js.UndefOr[String]
    var Name: js.UndefOr[String]
    var SignKey: js.UndefOr[String]
  }

  object IssuerDetails {
    @inline
    def apply(
        KeyFingerprint: js.UndefOr[String] = js.undefined,
        Name: js.UndefOr[String] = js.undefined,
        SignKey: js.UndefOr[String] = js.undefined
    ): IssuerDetails = {
      val __obj = js.Dynamic.literal()
      KeyFingerprint.foreach(__v => __obj.updateDynamic("KeyFingerprint")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      SignKey.foreach(__v => __obj.updateDynamic("SignKey")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[IssuerDetails]
    }
  }

  /** Software license that is managed in AWS License Manager.
    */
  @js.native
  trait License extends js.Object {
    var Beneficiary: js.UndefOr[String]
    var ConsumptionConfiguration: js.UndefOr[ConsumptionConfiguration]
    var CreateTime: js.UndefOr[ISO8601DateTime]
    var Entitlements: js.UndefOr[EntitlementList]
    var HomeRegion: js.UndefOr[String]
    var Issuer: js.UndefOr[IssuerDetails]
    var LicenseArn: js.UndefOr[Arn]
    var LicenseMetadata: js.UndefOr[MetadataList]
    var LicenseName: js.UndefOr[String]
    var ProductName: js.UndefOr[String]
    var ProductSKU: js.UndefOr[String]
    var Status: js.UndefOr[LicenseStatus]
    var Validity: js.UndefOr[DatetimeRange]
    var Version: js.UndefOr[String]
  }

  object License {
    @inline
    def apply(
        Beneficiary: js.UndefOr[String] = js.undefined,
        ConsumptionConfiguration: js.UndefOr[ConsumptionConfiguration] = js.undefined,
        CreateTime: js.UndefOr[ISO8601DateTime] = js.undefined,
        Entitlements: js.UndefOr[EntitlementList] = js.undefined,
        HomeRegion: js.UndefOr[String] = js.undefined,
        Issuer: js.UndefOr[IssuerDetails] = js.undefined,
        LicenseArn: js.UndefOr[Arn] = js.undefined,
        LicenseMetadata: js.UndefOr[MetadataList] = js.undefined,
        LicenseName: js.UndefOr[String] = js.undefined,
        ProductName: js.UndefOr[String] = js.undefined,
        ProductSKU: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[LicenseStatus] = js.undefined,
        Validity: js.UndefOr[DatetimeRange] = js.undefined,
        Version: js.UndefOr[String] = js.undefined
    ): License = {
      val __obj = js.Dynamic.literal()
      Beneficiary.foreach(__v => __obj.updateDynamic("Beneficiary")(__v.asInstanceOf[js.Any]))
      ConsumptionConfiguration.foreach(__v => __obj.updateDynamic("ConsumptionConfiguration")(__v.asInstanceOf[js.Any]))
      CreateTime.foreach(__v => __obj.updateDynamic("CreateTime")(__v.asInstanceOf[js.Any]))
      Entitlements.foreach(__v => __obj.updateDynamic("Entitlements")(__v.asInstanceOf[js.Any]))
      HomeRegion.foreach(__v => __obj.updateDynamic("HomeRegion")(__v.asInstanceOf[js.Any]))
      Issuer.foreach(__v => __obj.updateDynamic("Issuer")(__v.asInstanceOf[js.Any]))
      LicenseArn.foreach(__v => __obj.updateDynamic("LicenseArn")(__v.asInstanceOf[js.Any]))
      LicenseMetadata.foreach(__v => __obj.updateDynamic("LicenseMetadata")(__v.asInstanceOf[js.Any]))
      LicenseName.foreach(__v => __obj.updateDynamic("LicenseName")(__v.asInstanceOf[js.Any]))
      ProductName.foreach(__v => __obj.updateDynamic("ProductName")(__v.asInstanceOf[js.Any]))
      ProductSKU.foreach(__v => __obj.updateDynamic("ProductSKU")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      Validity.foreach(__v => __obj.updateDynamic("Validity")(__v.asInstanceOf[js.Any]))
      Version.foreach(__v => __obj.updateDynamic("Version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[License]
    }
  }

  /** A license configuration is an abstraction of a customer license agreement that can be consumed and enforced by License Manager. Components include specifications for the license type (licensing by instance, socket, CPU, or vCPU), allowed tenancy (shared tenancy, Dedicated Instance, Dedicated Host, or all of these), host affinity (how long a VM must be associated with a host), and the number of licenses purchased and used.
    */
  @js.native
  trait LicenseConfiguration extends js.Object {
    var AutomatedDiscoveryInformation: js.UndefOr[AutomatedDiscoveryInformation]
    var ConsumedLicenseSummaryList: js.UndefOr[ConsumedLicenseSummaryList]
    var ConsumedLicenses: js.UndefOr[BoxLong]
    var Description: js.UndefOr[String]
    var DisassociateWhenNotFound: js.UndefOr[BoxBoolean]
    var LicenseConfigurationArn: js.UndefOr[String]
    var LicenseConfigurationId: js.UndefOr[String]
    var LicenseCount: js.UndefOr[BoxLong]
    var LicenseCountHardLimit: js.UndefOr[BoxBoolean]
    var LicenseCountingType: js.UndefOr[LicenseCountingType]
    var LicenseRules: js.UndefOr[StringList]
    var ManagedResourceSummaryList: js.UndefOr[ManagedResourceSummaryList]
    var Name: js.UndefOr[String]
    var OwnerAccountId: js.UndefOr[String]
    var ProductInformationList: js.UndefOr[ProductInformationList]
    var Status: js.UndefOr[String]
  }

  object LicenseConfiguration {
    @inline
    def apply(
        AutomatedDiscoveryInformation: js.UndefOr[AutomatedDiscoveryInformation] = js.undefined,
        ConsumedLicenseSummaryList: js.UndefOr[ConsumedLicenseSummaryList] = js.undefined,
        ConsumedLicenses: js.UndefOr[BoxLong] = js.undefined,
        Description: js.UndefOr[String] = js.undefined,
        DisassociateWhenNotFound: js.UndefOr[BoxBoolean] = js.undefined,
        LicenseConfigurationArn: js.UndefOr[String] = js.undefined,
        LicenseConfigurationId: js.UndefOr[String] = js.undefined,
        LicenseCount: js.UndefOr[BoxLong] = js.undefined,
        LicenseCountHardLimit: js.UndefOr[BoxBoolean] = js.undefined,
        LicenseCountingType: js.UndefOr[LicenseCountingType] = js.undefined,
        LicenseRules: js.UndefOr[StringList] = js.undefined,
        ManagedResourceSummaryList: js.UndefOr[ManagedResourceSummaryList] = js.undefined,
        Name: js.UndefOr[String] = js.undefined,
        OwnerAccountId: js.UndefOr[String] = js.undefined,
        ProductInformationList: js.UndefOr[ProductInformationList] = js.undefined,
        Status: js.UndefOr[String] = js.undefined
    ): LicenseConfiguration = {
      val __obj = js.Dynamic.literal()
      AutomatedDiscoveryInformation.foreach(__v => __obj.updateDynamic("AutomatedDiscoveryInformation")(__v.asInstanceOf[js.Any]))
      ConsumedLicenseSummaryList.foreach(__v => __obj.updateDynamic("ConsumedLicenseSummaryList")(__v.asInstanceOf[js.Any]))
      ConsumedLicenses.foreach(__v => __obj.updateDynamic("ConsumedLicenses")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      DisassociateWhenNotFound.foreach(__v => __obj.updateDynamic("DisassociateWhenNotFound")(__v.asInstanceOf[js.Any]))
      LicenseConfigurationArn.foreach(__v => __obj.updateDynamic("LicenseConfigurationArn")(__v.asInstanceOf[js.Any]))
      LicenseConfigurationId.foreach(__v => __obj.updateDynamic("LicenseConfigurationId")(__v.asInstanceOf[js.Any]))
      LicenseCount.foreach(__v => __obj.updateDynamic("LicenseCount")(__v.asInstanceOf[js.Any]))
      LicenseCountHardLimit.foreach(__v => __obj.updateDynamic("LicenseCountHardLimit")(__v.asInstanceOf[js.Any]))
      LicenseCountingType.foreach(__v => __obj.updateDynamic("LicenseCountingType")(__v.asInstanceOf[js.Any]))
      LicenseRules.foreach(__v => __obj.updateDynamic("LicenseRules")(__v.asInstanceOf[js.Any]))
      ManagedResourceSummaryList.foreach(__v => __obj.updateDynamic("ManagedResourceSummaryList")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      OwnerAccountId.foreach(__v => __obj.updateDynamic("OwnerAccountId")(__v.asInstanceOf[js.Any]))
      ProductInformationList.foreach(__v => __obj.updateDynamic("ProductInformationList")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LicenseConfiguration]
    }
  }

  /** Describes an association with a license configuration.
    */
  @js.native
  trait LicenseConfigurationAssociation extends js.Object {
    var AmiAssociationScope: js.UndefOr[String]
    var AssociationTime: js.UndefOr[DateTime]
    var ResourceArn: js.UndefOr[String]
    var ResourceOwnerId: js.UndefOr[String]
    var ResourceType: js.UndefOr[ResourceType]
  }

  object LicenseConfigurationAssociation {
    @inline
    def apply(
        AmiAssociationScope: js.UndefOr[String] = js.undefined,
        AssociationTime: js.UndefOr[DateTime] = js.undefined,
        ResourceArn: js.UndefOr[String] = js.undefined,
        ResourceOwnerId: js.UndefOr[String] = js.undefined,
        ResourceType: js.UndefOr[ResourceType] = js.undefined
    ): LicenseConfigurationAssociation = {
      val __obj = js.Dynamic.literal()
      AmiAssociationScope.foreach(__v => __obj.updateDynamic("AmiAssociationScope")(__v.asInstanceOf[js.Any]))
      AssociationTime.foreach(__v => __obj.updateDynamic("AssociationTime")(__v.asInstanceOf[js.Any]))
      ResourceArn.foreach(__v => __obj.updateDynamic("ResourceArn")(__v.asInstanceOf[js.Any]))
      ResourceOwnerId.foreach(__v => __obj.updateDynamic("ResourceOwnerId")(__v.asInstanceOf[js.Any]))
      ResourceType.foreach(__v => __obj.updateDynamic("ResourceType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LicenseConfigurationAssociation]
    }
  }

  @js.native
  sealed trait LicenseConfigurationStatus extends js.Any
  object LicenseConfigurationStatus {
    val AVAILABLE = "AVAILABLE".asInstanceOf[LicenseConfigurationStatus]
    val DISABLED = "DISABLED".asInstanceOf[LicenseConfigurationStatus]

    @inline def values = js.Array(AVAILABLE, DISABLED)
  }

  /** Details about the usage of a resource associated with a license configuration.
    */
  @js.native
  trait LicenseConfigurationUsage extends js.Object {
    var AssociationTime: js.UndefOr[DateTime]
    var ConsumedLicenses: js.UndefOr[BoxLong]
    var ResourceArn: js.UndefOr[String]
    var ResourceOwnerId: js.UndefOr[String]
    var ResourceStatus: js.UndefOr[String]
    var ResourceType: js.UndefOr[ResourceType]
  }

  object LicenseConfigurationUsage {
    @inline
    def apply(
        AssociationTime: js.UndefOr[DateTime] = js.undefined,
        ConsumedLicenses: js.UndefOr[BoxLong] = js.undefined,
        ResourceArn: js.UndefOr[String] = js.undefined,
        ResourceOwnerId: js.UndefOr[String] = js.undefined,
        ResourceStatus: js.UndefOr[String] = js.undefined,
        ResourceType: js.UndefOr[ResourceType] = js.undefined
    ): LicenseConfigurationUsage = {
      val __obj = js.Dynamic.literal()
      AssociationTime.foreach(__v => __obj.updateDynamic("AssociationTime")(__v.asInstanceOf[js.Any]))
      ConsumedLicenses.foreach(__v => __obj.updateDynamic("ConsumedLicenses")(__v.asInstanceOf[js.Any]))
      ResourceArn.foreach(__v => __obj.updateDynamic("ResourceArn")(__v.asInstanceOf[js.Any]))
      ResourceOwnerId.foreach(__v => __obj.updateDynamic("ResourceOwnerId")(__v.asInstanceOf[js.Any]))
      ResourceStatus.foreach(__v => __obj.updateDynamic("ResourceStatus")(__v.asInstanceOf[js.Any]))
      ResourceType.foreach(__v => __obj.updateDynamic("ResourceType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LicenseConfigurationUsage]
    }
  }

  @js.native
  sealed trait LicenseCountingType extends js.Any
  object LicenseCountingType {
    val vCPU = "vCPU".asInstanceOf[LicenseCountingType]
    val Instance = "Instance".asInstanceOf[LicenseCountingType]
    val Core = "Core".asInstanceOf[LicenseCountingType]
    val Socket = "Socket".asInstanceOf[LicenseCountingType]

    @inline def values = js.Array(vCPU, Instance, Core, Socket)
  }

  @js.native
  sealed trait LicenseDeletionStatus extends js.Any
  object LicenseDeletionStatus {
    val PENDING_DELETE = "PENDING_DELETE".asInstanceOf[LicenseDeletionStatus]
    val DELETED = "DELETED".asInstanceOf[LicenseDeletionStatus]

    @inline def values = js.Array(PENDING_DELETE, DELETED)
  }

  /** Describes the failure of a license operation.
    */
  @js.native
  trait LicenseOperationFailure extends js.Object {
    var ErrorMessage: js.UndefOr[String]
    var FailureTime: js.UndefOr[DateTime]
    var MetadataList: js.UndefOr[MetadataList]
    var OperationName: js.UndefOr[String]
    var OperationRequestedBy: js.UndefOr[String]
    var ResourceArn: js.UndefOr[String]
    var ResourceOwnerId: js.UndefOr[String]
    var ResourceType: js.UndefOr[ResourceType]
  }

  object LicenseOperationFailure {
    @inline
    def apply(
        ErrorMessage: js.UndefOr[String] = js.undefined,
        FailureTime: js.UndefOr[DateTime] = js.undefined,
        MetadataList: js.UndefOr[MetadataList] = js.undefined,
        OperationName: js.UndefOr[String] = js.undefined,
        OperationRequestedBy: js.UndefOr[String] = js.undefined,
        ResourceArn: js.UndefOr[String] = js.undefined,
        ResourceOwnerId: js.UndefOr[String] = js.undefined,
        ResourceType: js.UndefOr[ResourceType] = js.undefined
    ): LicenseOperationFailure = {
      val __obj = js.Dynamic.literal()
      ErrorMessage.foreach(__v => __obj.updateDynamic("ErrorMessage")(__v.asInstanceOf[js.Any]))
      FailureTime.foreach(__v => __obj.updateDynamic("FailureTime")(__v.asInstanceOf[js.Any]))
      MetadataList.foreach(__v => __obj.updateDynamic("MetadataList")(__v.asInstanceOf[js.Any]))
      OperationName.foreach(__v => __obj.updateDynamic("OperationName")(__v.asInstanceOf[js.Any]))
      OperationRequestedBy.foreach(__v => __obj.updateDynamic("OperationRequestedBy")(__v.asInstanceOf[js.Any]))
      ResourceArn.foreach(__v => __obj.updateDynamic("ResourceArn")(__v.asInstanceOf[js.Any]))
      ResourceOwnerId.foreach(__v => __obj.updateDynamic("ResourceOwnerId")(__v.asInstanceOf[js.Any]))
      ResourceType.foreach(__v => __obj.updateDynamic("ResourceType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LicenseOperationFailure]
    }
  }

  /** Details for associating a license configuration with a resource.
    */
  @js.native
  trait LicenseSpecification extends js.Object {
    var LicenseConfigurationArn: String
    var AmiAssociationScope: js.UndefOr[String]
  }

  object LicenseSpecification {
    @inline
    def apply(
        LicenseConfigurationArn: String,
        AmiAssociationScope: js.UndefOr[String] = js.undefined
    ): LicenseSpecification = {
      val __obj = js.Dynamic.literal(
        "LicenseConfigurationArn" -> LicenseConfigurationArn.asInstanceOf[js.Any]
      )

      AmiAssociationScope.foreach(__v => __obj.updateDynamic("AmiAssociationScope")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LicenseSpecification]
    }
  }

  @js.native
  sealed trait LicenseStatus extends js.Any
  object LicenseStatus {
    val AVAILABLE = "AVAILABLE".asInstanceOf[LicenseStatus]
    val PENDING_AVAILABLE = "PENDING_AVAILABLE".asInstanceOf[LicenseStatus]
    val DEACTIVATED = "DEACTIVATED".asInstanceOf[LicenseStatus]
    val SUSPENDED = "SUSPENDED".asInstanceOf[LicenseStatus]
    val EXPIRED = "EXPIRED".asInstanceOf[LicenseStatus]
    val PENDING_DELETE = "PENDING_DELETE".asInstanceOf[LicenseStatus]
    val DELETED = "DELETED".asInstanceOf[LicenseStatus]

    @inline def values = js.Array(AVAILABLE, PENDING_AVAILABLE, DEACTIVATED, SUSPENDED, EXPIRED, PENDING_DELETE, DELETED)
  }

  /** Describes the entitlement usage associated with a license.
    */
  @js.native
  trait LicenseUsage extends js.Object {
    var EntitlementUsages: js.UndefOr[EntitlementUsageList]
  }

  object LicenseUsage {
    @inline
    def apply(
        EntitlementUsages: js.UndefOr[EntitlementUsageList] = js.undefined
    ): LicenseUsage = {
      val __obj = js.Dynamic.literal()
      EntitlementUsages.foreach(__v => __obj.updateDynamic("EntitlementUsages")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LicenseUsage]
    }
  }

  @js.native
  trait ListAssociationsForLicenseConfigurationRequest extends js.Object {
    var LicenseConfigurationArn: String
    var MaxResults: js.UndefOr[BoxInteger]
    var NextToken: js.UndefOr[String]
  }

  object ListAssociationsForLicenseConfigurationRequest {
    @inline
    def apply(
        LicenseConfigurationArn: String,
        MaxResults: js.UndefOr[BoxInteger] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListAssociationsForLicenseConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "LicenseConfigurationArn" -> LicenseConfigurationArn.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAssociationsForLicenseConfigurationRequest]
    }
  }

  @js.native
  trait ListAssociationsForLicenseConfigurationResponse extends js.Object {
    var LicenseConfigurationAssociations: js.UndefOr[LicenseConfigurationAssociations]
    var NextToken: js.UndefOr[String]
  }

  object ListAssociationsForLicenseConfigurationResponse {
    @inline
    def apply(
        LicenseConfigurationAssociations: js.UndefOr[LicenseConfigurationAssociations] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListAssociationsForLicenseConfigurationResponse = {
      val __obj = js.Dynamic.literal()
      LicenseConfigurationAssociations.foreach(__v => __obj.updateDynamic("LicenseConfigurationAssociations")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAssociationsForLicenseConfigurationResponse]
    }
  }

  @js.native
  trait ListDistributedGrantsRequest extends js.Object {
    var Filters: js.UndefOr[FilterList]
    var GrantArns: js.UndefOr[ArnList]
    var MaxResults: js.UndefOr[MaxSize100]
    var NextToken: js.UndefOr[String]
  }

  object ListDistributedGrantsRequest {
    @inline
    def apply(
        Filters: js.UndefOr[FilterList] = js.undefined,
        GrantArns: js.UndefOr[ArnList] = js.undefined,
        MaxResults: js.UndefOr[MaxSize100] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListDistributedGrantsRequest = {
      val __obj = js.Dynamic.literal()
      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      GrantArns.foreach(__v => __obj.updateDynamic("GrantArns")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDistributedGrantsRequest]
    }
  }

  @js.native
  trait ListDistributedGrantsResponse extends js.Object {
    var Grants: js.UndefOr[GrantList]
    var NextToken: js.UndefOr[String]
  }

  object ListDistributedGrantsResponse {
    @inline
    def apply(
        Grants: js.UndefOr[GrantList] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListDistributedGrantsResponse = {
      val __obj = js.Dynamic.literal()
      Grants.foreach(__v => __obj.updateDynamic("Grants")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDistributedGrantsResponse]
    }
  }

  @js.native
  trait ListFailuresForLicenseConfigurationOperationsRequest extends js.Object {
    var LicenseConfigurationArn: String
    var MaxResults: js.UndefOr[BoxInteger]
    var NextToken: js.UndefOr[String]
  }

  object ListFailuresForLicenseConfigurationOperationsRequest {
    @inline
    def apply(
        LicenseConfigurationArn: String,
        MaxResults: js.UndefOr[BoxInteger] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListFailuresForLicenseConfigurationOperationsRequest = {
      val __obj = js.Dynamic.literal(
        "LicenseConfigurationArn" -> LicenseConfigurationArn.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListFailuresForLicenseConfigurationOperationsRequest]
    }
  }

  @js.native
  trait ListFailuresForLicenseConfigurationOperationsResponse extends js.Object {
    var LicenseOperationFailureList: js.UndefOr[LicenseOperationFailureList]
    var NextToken: js.UndefOr[String]
  }

  object ListFailuresForLicenseConfigurationOperationsResponse {
    @inline
    def apply(
        LicenseOperationFailureList: js.UndefOr[LicenseOperationFailureList] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListFailuresForLicenseConfigurationOperationsResponse = {
      val __obj = js.Dynamic.literal()
      LicenseOperationFailureList.foreach(__v => __obj.updateDynamic("LicenseOperationFailureList")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListFailuresForLicenseConfigurationOperationsResponse]
    }
  }

  @js.native
  trait ListLicenseConfigurationsRequest extends js.Object {
    var Filters: js.UndefOr[Filters]
    var LicenseConfigurationArns: js.UndefOr[StringList]
    var MaxResults: js.UndefOr[BoxInteger]
    var NextToken: js.UndefOr[String]
  }

  object ListLicenseConfigurationsRequest {
    @inline
    def apply(
        Filters: js.UndefOr[Filters] = js.undefined,
        LicenseConfigurationArns: js.UndefOr[StringList] = js.undefined,
        MaxResults: js.UndefOr[BoxInteger] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListLicenseConfigurationsRequest = {
      val __obj = js.Dynamic.literal()
      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      LicenseConfigurationArns.foreach(__v => __obj.updateDynamic("LicenseConfigurationArns")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListLicenseConfigurationsRequest]
    }
  }

  @js.native
  trait ListLicenseConfigurationsResponse extends js.Object {
    var LicenseConfigurations: js.UndefOr[LicenseConfigurations]
    var NextToken: js.UndefOr[String]
  }

  object ListLicenseConfigurationsResponse {
    @inline
    def apply(
        LicenseConfigurations: js.UndefOr[LicenseConfigurations] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListLicenseConfigurationsResponse = {
      val __obj = js.Dynamic.literal()
      LicenseConfigurations.foreach(__v => __obj.updateDynamic("LicenseConfigurations")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListLicenseConfigurationsResponse]
    }
  }

  @js.native
  trait ListLicenseSpecificationsForResourceRequest extends js.Object {
    var ResourceArn: String
    var MaxResults: js.UndefOr[BoxInteger]
    var NextToken: js.UndefOr[String]
  }

  object ListLicenseSpecificationsForResourceRequest {
    @inline
    def apply(
        ResourceArn: String,
        MaxResults: js.UndefOr[BoxInteger] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListLicenseSpecificationsForResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListLicenseSpecificationsForResourceRequest]
    }
  }

  @js.native
  trait ListLicenseSpecificationsForResourceResponse extends js.Object {
    var LicenseSpecifications: js.UndefOr[LicenseSpecifications]
    var NextToken: js.UndefOr[String]
  }

  object ListLicenseSpecificationsForResourceResponse {
    @inline
    def apply(
        LicenseSpecifications: js.UndefOr[LicenseSpecifications] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListLicenseSpecificationsForResourceResponse = {
      val __obj = js.Dynamic.literal()
      LicenseSpecifications.foreach(__v => __obj.updateDynamic("LicenseSpecifications")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListLicenseSpecificationsForResourceResponse]
    }
  }

  @js.native
  trait ListLicenseVersionsRequest extends js.Object {
    var LicenseArn: Arn
    var MaxResults: js.UndefOr[MaxSize100]
    var NextToken: js.UndefOr[String]
  }

  object ListLicenseVersionsRequest {
    @inline
    def apply(
        LicenseArn: Arn,
        MaxResults: js.UndefOr[MaxSize100] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListLicenseVersionsRequest = {
      val __obj = js.Dynamic.literal(
        "LicenseArn" -> LicenseArn.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListLicenseVersionsRequest]
    }
  }

  @js.native
  trait ListLicenseVersionsResponse extends js.Object {
    var Licenses: js.UndefOr[LicenseList]
    var NextToken: js.UndefOr[String]
  }

  object ListLicenseVersionsResponse {
    @inline
    def apply(
        Licenses: js.UndefOr[LicenseList] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListLicenseVersionsResponse = {
      val __obj = js.Dynamic.literal()
      Licenses.foreach(__v => __obj.updateDynamic("Licenses")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListLicenseVersionsResponse]
    }
  }

  @js.native
  trait ListLicensesRequest extends js.Object {
    var Filters: js.UndefOr[FilterList]
    var LicenseArns: js.UndefOr[ArnList]
    var MaxResults: js.UndefOr[MaxSize100]
    var NextToken: js.UndefOr[String]
  }

  object ListLicensesRequest {
    @inline
    def apply(
        Filters: js.UndefOr[FilterList] = js.undefined,
        LicenseArns: js.UndefOr[ArnList] = js.undefined,
        MaxResults: js.UndefOr[MaxSize100] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListLicensesRequest = {
      val __obj = js.Dynamic.literal()
      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      LicenseArns.foreach(__v => __obj.updateDynamic("LicenseArns")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListLicensesRequest]
    }
  }

  @js.native
  trait ListLicensesResponse extends js.Object {
    var Licenses: js.UndefOr[LicenseList]
    var NextToken: js.UndefOr[String]
  }

  object ListLicensesResponse {
    @inline
    def apply(
        Licenses: js.UndefOr[LicenseList] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListLicensesResponse = {
      val __obj = js.Dynamic.literal()
      Licenses.foreach(__v => __obj.updateDynamic("Licenses")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListLicensesResponse]
    }
  }

  @js.native
  trait ListReceivedGrantsRequest extends js.Object {
    var Filters: js.UndefOr[FilterList]
    var GrantArns: js.UndefOr[ArnList]
    var MaxResults: js.UndefOr[MaxSize100]
    var NextToken: js.UndefOr[String]
  }

  object ListReceivedGrantsRequest {
    @inline
    def apply(
        Filters: js.UndefOr[FilterList] = js.undefined,
        GrantArns: js.UndefOr[ArnList] = js.undefined,
        MaxResults: js.UndefOr[MaxSize100] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListReceivedGrantsRequest = {
      val __obj = js.Dynamic.literal()
      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      GrantArns.foreach(__v => __obj.updateDynamic("GrantArns")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListReceivedGrantsRequest]
    }
  }

  @js.native
  trait ListReceivedGrantsResponse extends js.Object {
    var Grants: js.UndefOr[GrantList]
    var NextToken: js.UndefOr[String]
  }

  object ListReceivedGrantsResponse {
    @inline
    def apply(
        Grants: js.UndefOr[GrantList] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListReceivedGrantsResponse = {
      val __obj = js.Dynamic.literal()
      Grants.foreach(__v => __obj.updateDynamic("Grants")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListReceivedGrantsResponse]
    }
  }

  @js.native
  trait ListReceivedLicensesRequest extends js.Object {
    var Filters: js.UndefOr[FilterList]
    var LicenseArns: js.UndefOr[ArnList]
    var MaxResults: js.UndefOr[MaxSize100]
    var NextToken: js.UndefOr[String]
  }

  object ListReceivedLicensesRequest {
    @inline
    def apply(
        Filters: js.UndefOr[FilterList] = js.undefined,
        LicenseArns: js.UndefOr[ArnList] = js.undefined,
        MaxResults: js.UndefOr[MaxSize100] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListReceivedLicensesRequest = {
      val __obj = js.Dynamic.literal()
      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      LicenseArns.foreach(__v => __obj.updateDynamic("LicenseArns")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListReceivedLicensesRequest]
    }
  }

  @js.native
  trait ListReceivedLicensesResponse extends js.Object {
    var Licenses: js.UndefOr[GrantedLicenseList]
    var NextToken: js.UndefOr[String]
  }

  object ListReceivedLicensesResponse {
    @inline
    def apply(
        Licenses: js.UndefOr[GrantedLicenseList] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListReceivedLicensesResponse = {
      val __obj = js.Dynamic.literal()
      Licenses.foreach(__v => __obj.updateDynamic("Licenses")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListReceivedLicensesResponse]
    }
  }

  @js.native
  trait ListResourceInventoryRequest extends js.Object {
    var Filters: js.UndefOr[InventoryFilterList]
    var MaxResults: js.UndefOr[BoxInteger]
    var NextToken: js.UndefOr[String]
  }

  object ListResourceInventoryRequest {
    @inline
    def apply(
        Filters: js.UndefOr[InventoryFilterList] = js.undefined,
        MaxResults: js.UndefOr[BoxInteger] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListResourceInventoryRequest = {
      val __obj = js.Dynamic.literal()
      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListResourceInventoryRequest]
    }
  }

  @js.native
  trait ListResourceInventoryResponse extends js.Object {
    var NextToken: js.UndefOr[String]
    var ResourceInventoryList: js.UndefOr[ResourceInventoryList]
  }

  object ListResourceInventoryResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[String] = js.undefined,
        ResourceInventoryList: js.UndefOr[ResourceInventoryList] = js.undefined
    ): ListResourceInventoryResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      ResourceInventoryList.foreach(__v => __obj.updateDynamic("ResourceInventoryList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListResourceInventoryResponse]
    }
  }

  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var ResourceArn: String
  }

  object ListTagsForResourceRequest {
    @inline
    def apply(
        ResourceArn: String
    ): ListTagsForResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ListTagsForResourceRequest]
    }
  }

  @js.native
  trait ListTagsForResourceResponse extends js.Object {
    var Tags: js.UndefOr[TagList]
  }

  object ListTagsForResourceResponse {
    @inline
    def apply(
        Tags: js.UndefOr[TagList] = js.undefined
    ): ListTagsForResourceResponse = {
      val __obj = js.Dynamic.literal()
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceResponse]
    }
  }

  @js.native
  trait ListTokensRequest extends js.Object {
    var Filters: js.UndefOr[FilterList]
    var MaxResults: js.UndefOr[MaxSize100]
    var NextToken: js.UndefOr[String]
    var TokenIds: js.UndefOr[StringList]
  }

  object ListTokensRequest {
    @inline
    def apply(
        Filters: js.UndefOr[FilterList] = js.undefined,
        MaxResults: js.UndefOr[MaxSize100] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined,
        TokenIds: js.UndefOr[StringList] = js.undefined
    ): ListTokensRequest = {
      val __obj = js.Dynamic.literal()
      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      TokenIds.foreach(__v => __obj.updateDynamic("TokenIds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTokensRequest]
    }
  }

  @js.native
  trait ListTokensResponse extends js.Object {
    var NextToken: js.UndefOr[String]
    var Tokens: js.UndefOr[TokenList]
  }

  object ListTokensResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[String] = js.undefined,
        Tokens: js.UndefOr[TokenList] = js.undefined
    ): ListTokensResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Tokens.foreach(__v => __obj.updateDynamic("Tokens")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTokensResponse]
    }
  }

  @js.native
  trait ListUsageForLicenseConfigurationRequest extends js.Object {
    var LicenseConfigurationArn: String
    var Filters: js.UndefOr[Filters]
    var MaxResults: js.UndefOr[BoxInteger]
    var NextToken: js.UndefOr[String]
  }

  object ListUsageForLicenseConfigurationRequest {
    @inline
    def apply(
        LicenseConfigurationArn: String,
        Filters: js.UndefOr[Filters] = js.undefined,
        MaxResults: js.UndefOr[BoxInteger] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListUsageForLicenseConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "LicenseConfigurationArn" -> LicenseConfigurationArn.asInstanceOf[js.Any]
      )

      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListUsageForLicenseConfigurationRequest]
    }
  }

  @js.native
  trait ListUsageForLicenseConfigurationResponse extends js.Object {
    var LicenseConfigurationUsageList: js.UndefOr[LicenseConfigurationUsageList]
    var NextToken: js.UndefOr[String]
  }

  object ListUsageForLicenseConfigurationResponse {
    @inline
    def apply(
        LicenseConfigurationUsageList: js.UndefOr[LicenseConfigurationUsageList] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListUsageForLicenseConfigurationResponse = {
      val __obj = js.Dynamic.literal()
      LicenseConfigurationUsageList.foreach(__v => __obj.updateDynamic("LicenseConfigurationUsageList")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListUsageForLicenseConfigurationResponse]
    }
  }

  /** Summary information about a managed resource.
    */
  @js.native
  trait ManagedResourceSummary extends js.Object {
    var AssociationCount: js.UndefOr[BoxLong]
    var ResourceType: js.UndefOr[ResourceType]
  }

  object ManagedResourceSummary {
    @inline
    def apply(
        AssociationCount: js.UndefOr[BoxLong] = js.undefined,
        ResourceType: js.UndefOr[ResourceType] = js.undefined
    ): ManagedResourceSummary = {
      val __obj = js.Dynamic.literal()
      AssociationCount.foreach(__v => __obj.updateDynamic("AssociationCount")(__v.asInstanceOf[js.Any]))
      ResourceType.foreach(__v => __obj.updateDynamic("ResourceType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ManagedResourceSummary]
    }
  }

  /** Describes key/value pairs.
    */
  @js.native
  trait Metadata extends js.Object {
    var Name: js.UndefOr[String]
    var Value: js.UndefOr[String]
  }

  object Metadata {
    @inline
    def apply(
        Name: js.UndefOr[String] = js.undefined,
        Value: js.UndefOr[String] = js.undefined
    ): Metadata = {
      val __obj = js.Dynamic.literal()
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Metadata]
    }
  }

  /** Configuration information for AWS Organizations.
    */
  @js.native
  trait OrganizationConfiguration extends js.Object {
    var EnableIntegration: Boolean
  }

  object OrganizationConfiguration {
    @inline
    def apply(
        EnableIntegration: Boolean
    ): OrganizationConfiguration = {
      val __obj = js.Dynamic.literal(
        "EnableIntegration" -> EnableIntegration.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[OrganizationConfiguration]
    }
  }

  /** Describes product information for a license configuration.
    */
  @js.native
  trait ProductInformation extends js.Object {
    var ProductInformationFilterList: ProductInformationFilterList
    var ResourceType: String
  }

  object ProductInformation {
    @inline
    def apply(
        ProductInformationFilterList: ProductInformationFilterList,
        ResourceType: String
    ): ProductInformation = {
      val __obj = js.Dynamic.literal(
        "ProductInformationFilterList" -> ProductInformationFilterList.asInstanceOf[js.Any],
        "ResourceType" -> ResourceType.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ProductInformation]
    }
  }

  /** Describes product information filters.
    */
  @js.native
  trait ProductInformationFilter extends js.Object {
    var ProductInformationFilterComparator: String
    var ProductInformationFilterName: String
    var ProductInformationFilterValue: js.UndefOr[StringList]
  }

  object ProductInformationFilter {
    @inline
    def apply(
        ProductInformationFilterComparator: String,
        ProductInformationFilterName: String,
        ProductInformationFilterValue: js.UndefOr[StringList] = js.undefined
    ): ProductInformationFilter = {
      val __obj = js.Dynamic.literal(
        "ProductInformationFilterComparator" -> ProductInformationFilterComparator.asInstanceOf[js.Any],
        "ProductInformationFilterName" -> ProductInformationFilterName.asInstanceOf[js.Any]
      )

      ProductInformationFilterValue.foreach(__v => __obj.updateDynamic("ProductInformationFilterValue")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ProductInformationFilter]
    }
  }

  /** Details about a provisional configuration.
    */
  @js.native
  trait ProvisionalConfiguration extends js.Object {
    var MaxTimeToLiveInMinutes: BoxInteger
  }

  object ProvisionalConfiguration {
    @inline
    def apply(
        MaxTimeToLiveInMinutes: BoxInteger
    ): ProvisionalConfiguration = {
      val __obj = js.Dynamic.literal(
        "MaxTimeToLiveInMinutes" -> MaxTimeToLiveInMinutes.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ProvisionalConfiguration]
    }
  }

  /** Metadata associated with received licenses and grants.
    */
  @js.native
  trait ReceivedMetadata extends js.Object {
    var AllowedOperations: js.UndefOr[AllowedOperationList]
    var ReceivedStatus: js.UndefOr[ReceivedStatus]
  }

  object ReceivedMetadata {
    @inline
    def apply(
        AllowedOperations: js.UndefOr[AllowedOperationList] = js.undefined,
        ReceivedStatus: js.UndefOr[ReceivedStatus] = js.undefined
    ): ReceivedMetadata = {
      val __obj = js.Dynamic.literal()
      AllowedOperations.foreach(__v => __obj.updateDynamic("AllowedOperations")(__v.asInstanceOf[js.Any]))
      ReceivedStatus.foreach(__v => __obj.updateDynamic("ReceivedStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ReceivedMetadata]
    }
  }

  @js.native
  sealed trait ReceivedStatus extends js.Any
  object ReceivedStatus {
    val PENDING_WORKFLOW = "PENDING_WORKFLOW".asInstanceOf[ReceivedStatus]
    val PENDING_ACCEPT = "PENDING_ACCEPT".asInstanceOf[ReceivedStatus]
    val REJECTED = "REJECTED".asInstanceOf[ReceivedStatus]
    val ACTIVE = "ACTIVE".asInstanceOf[ReceivedStatus]
    val FAILED_WORKFLOW = "FAILED_WORKFLOW".asInstanceOf[ReceivedStatus]
    val DELETED = "DELETED".asInstanceOf[ReceivedStatus]
    val DISABLED = "DISABLED".asInstanceOf[ReceivedStatus]

    @inline def values = js.Array(PENDING_WORKFLOW, PENDING_ACCEPT, REJECTED, ACTIVE, FAILED_WORKFLOW, DELETED, DISABLED)
  }

  @js.native
  trait RejectGrantRequest extends js.Object {
    var GrantArn: Arn
  }

  object RejectGrantRequest {
    @inline
    def apply(
        GrantArn: Arn
    ): RejectGrantRequest = {
      val __obj = js.Dynamic.literal(
        "GrantArn" -> GrantArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[RejectGrantRequest]
    }
  }

  @js.native
  trait RejectGrantResponse extends js.Object {
    var GrantArn: js.UndefOr[Arn]
    var Status: js.UndefOr[GrantStatus]
    var Version: js.UndefOr[String]
  }

  object RejectGrantResponse {
    @inline
    def apply(
        GrantArn: js.UndefOr[Arn] = js.undefined,
        Status: js.UndefOr[GrantStatus] = js.undefined,
        Version: js.UndefOr[String] = js.undefined
    ): RejectGrantResponse = {
      val __obj = js.Dynamic.literal()
      GrantArn.foreach(__v => __obj.updateDynamic("GrantArn")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      Version.foreach(__v => __obj.updateDynamic("Version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RejectGrantResponse]
    }
  }

  @js.native
  sealed trait RenewType extends js.Any
  object RenewType {
    val None = "None".asInstanceOf[RenewType]
    val Weekly = "Weekly".asInstanceOf[RenewType]
    val Monthly = "Monthly".asInstanceOf[RenewType]

    @inline def values = js.Array(None, Weekly, Monthly)
  }

  /** Details about a resource.
    */
  @js.native
  trait ResourceInventory extends js.Object {
    var Platform: js.UndefOr[String]
    var PlatformVersion: js.UndefOr[String]
    var ResourceArn: js.UndefOr[String]
    var ResourceId: js.UndefOr[String]
    var ResourceOwningAccountId: js.UndefOr[String]
    var ResourceType: js.UndefOr[ResourceType]
  }

  object ResourceInventory {
    @inline
    def apply(
        Platform: js.UndefOr[String] = js.undefined,
        PlatformVersion: js.UndefOr[String] = js.undefined,
        ResourceArn: js.UndefOr[String] = js.undefined,
        ResourceId: js.UndefOr[String] = js.undefined,
        ResourceOwningAccountId: js.UndefOr[String] = js.undefined,
        ResourceType: js.UndefOr[ResourceType] = js.undefined
    ): ResourceInventory = {
      val __obj = js.Dynamic.literal()
      Platform.foreach(__v => __obj.updateDynamic("Platform")(__v.asInstanceOf[js.Any]))
      PlatformVersion.foreach(__v => __obj.updateDynamic("PlatformVersion")(__v.asInstanceOf[js.Any]))
      ResourceArn.foreach(__v => __obj.updateDynamic("ResourceArn")(__v.asInstanceOf[js.Any]))
      ResourceId.foreach(__v => __obj.updateDynamic("ResourceId")(__v.asInstanceOf[js.Any]))
      ResourceOwningAccountId.foreach(__v => __obj.updateDynamic("ResourceOwningAccountId")(__v.asInstanceOf[js.Any]))
      ResourceType.foreach(__v => __obj.updateDynamic("ResourceType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResourceInventory]
    }
  }

  @js.native
  sealed trait ResourceType extends js.Any
  object ResourceType {
    val EC2_INSTANCE = "EC2_INSTANCE".asInstanceOf[ResourceType]
    val EC2_HOST = "EC2_HOST".asInstanceOf[ResourceType]
    val EC2_AMI = "EC2_AMI".asInstanceOf[ResourceType]
    val RDS = "RDS".asInstanceOf[ResourceType]
    val SYSTEMS_MANAGER_MANAGED_INSTANCE = "SYSTEMS_MANAGER_MANAGED_INSTANCE".asInstanceOf[ResourceType]

    @inline def values = js.Array(EC2_INSTANCE, EC2_HOST, EC2_AMI, RDS, SYSTEMS_MANAGER_MANAGED_INSTANCE)
  }

  /** Details about a tag for a license configuration.
    */
  @js.native
  trait Tag extends js.Object {
    var Key: js.UndefOr[String]
    var Value: js.UndefOr[String]
  }

  object Tag {
    @inline
    def apply(
        Key: js.UndefOr[String] = js.undefined,
        Value: js.UndefOr[String] = js.undefined
    ): Tag = {
      val __obj = js.Dynamic.literal()
      Key.foreach(__v => __obj.updateDynamic("Key")(__v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Tag]
    }
  }

  @js.native
  trait TagResourceRequest extends js.Object {
    var ResourceArn: String
    var Tags: TagList
  }

  object TagResourceRequest {
    @inline
    def apply(
        ResourceArn: String,
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

  /** Describes a token.
    */
  @js.native
  trait TokenData extends js.Object {
    var ExpirationTime: js.UndefOr[ISO8601DateTime]
    var LicenseArn: js.UndefOr[String]
    var RoleArns: js.UndefOr[ArnList]
    var Status: js.UndefOr[String]
    var TokenId: js.UndefOr[String]
    var TokenProperties: js.UndefOr[MaxSize3StringList]
    var TokenType: js.UndefOr[String]
  }

  object TokenData {
    @inline
    def apply(
        ExpirationTime: js.UndefOr[ISO8601DateTime] = js.undefined,
        LicenseArn: js.UndefOr[String] = js.undefined,
        RoleArns: js.UndefOr[ArnList] = js.undefined,
        Status: js.UndefOr[String] = js.undefined,
        TokenId: js.UndefOr[String] = js.undefined,
        TokenProperties: js.UndefOr[MaxSize3StringList] = js.undefined,
        TokenType: js.UndefOr[String] = js.undefined
    ): TokenData = {
      val __obj = js.Dynamic.literal()
      ExpirationTime.foreach(__v => __obj.updateDynamic("ExpirationTime")(__v.asInstanceOf[js.Any]))
      LicenseArn.foreach(__v => __obj.updateDynamic("LicenseArn")(__v.asInstanceOf[js.Any]))
      RoleArns.foreach(__v => __obj.updateDynamic("RoleArns")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      TokenId.foreach(__v => __obj.updateDynamic("TokenId")(__v.asInstanceOf[js.Any]))
      TokenProperties.foreach(__v => __obj.updateDynamic("TokenProperties")(__v.asInstanceOf[js.Any]))
      TokenType.foreach(__v => __obj.updateDynamic("TokenType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TokenData]
    }
  }

  @js.native
  sealed trait TokenType extends js.Any
  object TokenType {
    val REFRESH_TOKEN = "REFRESH_TOKEN".asInstanceOf[TokenType]

    @inline def values = js.Array(REFRESH_TOKEN)
  }

  @js.native
  trait UntagResourceRequest extends js.Object {
    var ResourceArn: String
    var TagKeys: TagKeyList
  }

  object UntagResourceRequest {
    @inline
    def apply(
        ResourceArn: String,
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
  trait UpdateLicenseConfigurationRequest extends js.Object {
    var LicenseConfigurationArn: String
    var Description: js.UndefOr[String]
    var DisassociateWhenNotFound: js.UndefOr[BoxBoolean]
    var LicenseConfigurationStatus: js.UndefOr[LicenseConfigurationStatus]
    var LicenseCount: js.UndefOr[BoxLong]
    var LicenseCountHardLimit: js.UndefOr[BoxBoolean]
    var LicenseRules: js.UndefOr[StringList]
    var Name: js.UndefOr[String]
    var ProductInformationList: js.UndefOr[ProductInformationList]
  }

  object UpdateLicenseConfigurationRequest {
    @inline
    def apply(
        LicenseConfigurationArn: String,
        Description: js.UndefOr[String] = js.undefined,
        DisassociateWhenNotFound: js.UndefOr[BoxBoolean] = js.undefined,
        LicenseConfigurationStatus: js.UndefOr[LicenseConfigurationStatus] = js.undefined,
        LicenseCount: js.UndefOr[BoxLong] = js.undefined,
        LicenseCountHardLimit: js.UndefOr[BoxBoolean] = js.undefined,
        LicenseRules: js.UndefOr[StringList] = js.undefined,
        Name: js.UndefOr[String] = js.undefined,
        ProductInformationList: js.UndefOr[ProductInformationList] = js.undefined
    ): UpdateLicenseConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "LicenseConfigurationArn" -> LicenseConfigurationArn.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      DisassociateWhenNotFound.foreach(__v => __obj.updateDynamic("DisassociateWhenNotFound")(__v.asInstanceOf[js.Any]))
      LicenseConfigurationStatus.foreach(__v => __obj.updateDynamic("LicenseConfigurationStatus")(__v.asInstanceOf[js.Any]))
      LicenseCount.foreach(__v => __obj.updateDynamic("LicenseCount")(__v.asInstanceOf[js.Any]))
      LicenseCountHardLimit.foreach(__v => __obj.updateDynamic("LicenseCountHardLimit")(__v.asInstanceOf[js.Any]))
      LicenseRules.foreach(__v => __obj.updateDynamic("LicenseRules")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      ProductInformationList.foreach(__v => __obj.updateDynamic("ProductInformationList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateLicenseConfigurationRequest]
    }
  }

  @js.native
  trait UpdateLicenseConfigurationResponse extends js.Object

  object UpdateLicenseConfigurationResponse {
    @inline
    def apply(): UpdateLicenseConfigurationResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateLicenseConfigurationResponse]
    }
  }

  @js.native
  trait UpdateLicenseSpecificationsForResourceRequest extends js.Object {
    var ResourceArn: String
    var AddLicenseSpecifications: js.UndefOr[LicenseSpecifications]
    var RemoveLicenseSpecifications: js.UndefOr[LicenseSpecifications]
  }

  object UpdateLicenseSpecificationsForResourceRequest {
    @inline
    def apply(
        ResourceArn: String,
        AddLicenseSpecifications: js.UndefOr[LicenseSpecifications] = js.undefined,
        RemoveLicenseSpecifications: js.UndefOr[LicenseSpecifications] = js.undefined
    ): UpdateLicenseSpecificationsForResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any]
      )

      AddLicenseSpecifications.foreach(__v => __obj.updateDynamic("AddLicenseSpecifications")(__v.asInstanceOf[js.Any]))
      RemoveLicenseSpecifications.foreach(__v => __obj.updateDynamic("RemoveLicenseSpecifications")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateLicenseSpecificationsForResourceRequest]
    }
  }

  @js.native
  trait UpdateLicenseSpecificationsForResourceResponse extends js.Object

  object UpdateLicenseSpecificationsForResourceResponse {
    @inline
    def apply(): UpdateLicenseSpecificationsForResourceResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateLicenseSpecificationsForResourceResponse]
    }
  }

  @js.native
  trait UpdateServiceSettingsRequest extends js.Object {
    var EnableCrossAccountsDiscovery: js.UndefOr[BoxBoolean]
    var OrganizationConfiguration: js.UndefOr[OrganizationConfiguration]
    var S3BucketArn: js.UndefOr[String]
    var SnsTopicArn: js.UndefOr[String]
  }

  object UpdateServiceSettingsRequest {
    @inline
    def apply(
        EnableCrossAccountsDiscovery: js.UndefOr[BoxBoolean] = js.undefined,
        OrganizationConfiguration: js.UndefOr[OrganizationConfiguration] = js.undefined,
        S3BucketArn: js.UndefOr[String] = js.undefined,
        SnsTopicArn: js.UndefOr[String] = js.undefined
    ): UpdateServiceSettingsRequest = {
      val __obj = js.Dynamic.literal()
      EnableCrossAccountsDiscovery.foreach(__v => __obj.updateDynamic("EnableCrossAccountsDiscovery")(__v.asInstanceOf[js.Any]))
      OrganizationConfiguration.foreach(__v => __obj.updateDynamic("OrganizationConfiguration")(__v.asInstanceOf[js.Any]))
      S3BucketArn.foreach(__v => __obj.updateDynamic("S3BucketArn")(__v.asInstanceOf[js.Any]))
      SnsTopicArn.foreach(__v => __obj.updateDynamic("SnsTopicArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateServiceSettingsRequest]
    }
  }

  @js.native
  trait UpdateServiceSettingsResponse extends js.Object

  object UpdateServiceSettingsResponse {
    @inline
    def apply(): UpdateServiceSettingsResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateServiceSettingsResponse]
    }
  }
}
