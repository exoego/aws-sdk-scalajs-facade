package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object worklink {
  type AcmCertificateArn                        = String
  type AuditStreamArn                           = String
  type Certificate                              = String
  type CertificateChain                         = String
  type CompanyCode                              = String
  type DateTime                                 = js.Date
  type DeviceManufacturer                       = String
  type DeviceModel                              = String
  type DeviceOperatingSystemName                = String
  type DeviceOperatingSystemVersion             = String
  type DevicePatchLevel                         = String
  type DeviceSummaryList                        = js.Array[DeviceSummary]
  type DisplayName                              = String
  type DomainName                               = String
  type DomainSummaryList                        = js.Array[DomainSummary]
  type FleetArn                                 = String
  type FleetName                                = String
  type FleetSummaryList                         = js.Array[FleetSummary]
  type Id                                       = String
  type MaxResults                               = Int
  type NextToken                                = String
  type SamlMetadata                             = String
  type SecurityGroupId                          = String
  type SecurityGroupIds                         = js.Array[SecurityGroupId]
  type SubnetId                                 = String
  type SubnetIds                                = js.Array[SubnetId]
  type Username                                 = String
  type VpcId                                    = String
  type WebsiteAuthorizationProvidersSummaryList = js.Array[WebsiteAuthorizationProviderSummary]
  type WebsiteCaSummaryList                     = js.Array[WebsiteCaSummary]

  implicit final class WorkLinkOps(private val service: WorkLink) extends AnyVal {

    @inline def associateDomainFuture(params: AssociateDomainRequest): Future[AssociateDomainResponse] =
      service.associateDomain(params).promise().toFuture
    @inline def associateWebsiteAuthorizationProviderFuture(
        params: AssociateWebsiteAuthorizationProviderRequest
    ): Future[AssociateWebsiteAuthorizationProviderResponse] =
      service.associateWebsiteAuthorizationProvider(params).promise().toFuture
    @inline def associateWebsiteCertificateAuthorityFuture(
        params: AssociateWebsiteCertificateAuthorityRequest
    ): Future[AssociateWebsiteCertificateAuthorityResponse] =
      service.associateWebsiteCertificateAuthority(params).promise().toFuture
    @inline def createFleetFuture(params: CreateFleetRequest): Future[CreateFleetResponse] =
      service.createFleet(params).promise().toFuture
    @inline def deleteFleetFuture(params: DeleteFleetRequest): Future[DeleteFleetResponse] =
      service.deleteFleet(params).promise().toFuture
    @inline def describeAuditStreamConfigurationFuture(
        params: DescribeAuditStreamConfigurationRequest
    ): Future[DescribeAuditStreamConfigurationResponse] =
      service.describeAuditStreamConfiguration(params).promise().toFuture
    @inline def describeCompanyNetworkConfigurationFuture(
        params: DescribeCompanyNetworkConfigurationRequest
    ): Future[DescribeCompanyNetworkConfigurationResponse] =
      service.describeCompanyNetworkConfiguration(params).promise().toFuture
    @inline def describeDeviceFuture(params: DescribeDeviceRequest): Future[DescribeDeviceResponse] =
      service.describeDevice(params).promise().toFuture
    @inline def describeDevicePolicyConfigurationFuture(
        params: DescribeDevicePolicyConfigurationRequest
    ): Future[DescribeDevicePolicyConfigurationResponse] =
      service.describeDevicePolicyConfiguration(params).promise().toFuture
    @inline def describeDomainFuture(params: DescribeDomainRequest): Future[DescribeDomainResponse] =
      service.describeDomain(params).promise().toFuture
    @inline def describeFleetMetadataFuture(
        params: DescribeFleetMetadataRequest
    ): Future[DescribeFleetMetadataResponse] = service.describeFleetMetadata(params).promise().toFuture
    @inline def describeIdentityProviderConfigurationFuture(
        params: DescribeIdentityProviderConfigurationRequest
    ): Future[DescribeIdentityProviderConfigurationResponse] =
      service.describeIdentityProviderConfiguration(params).promise().toFuture
    @inline def describeWebsiteCertificateAuthorityFuture(
        params: DescribeWebsiteCertificateAuthorityRequest
    ): Future[DescribeWebsiteCertificateAuthorityResponse] =
      service.describeWebsiteCertificateAuthority(params).promise().toFuture
    @inline def disassociateDomainFuture(params: DisassociateDomainRequest): Future[DisassociateDomainResponse] =
      service.disassociateDomain(params).promise().toFuture
    @inline def disassociateWebsiteAuthorizationProviderFuture(
        params: DisassociateWebsiteAuthorizationProviderRequest
    ): Future[DisassociateWebsiteAuthorizationProviderResponse] =
      service.disassociateWebsiteAuthorizationProvider(params).promise().toFuture
    @inline def disassociateWebsiteCertificateAuthorityFuture(
        params: DisassociateWebsiteCertificateAuthorityRequest
    ): Future[DisassociateWebsiteCertificateAuthorityResponse] =
      service.disassociateWebsiteCertificateAuthority(params).promise().toFuture
    @inline def listDevicesFuture(params: ListDevicesRequest): Future[ListDevicesResponse] =
      service.listDevices(params).promise().toFuture
    @inline def listDomainsFuture(params: ListDomainsRequest): Future[ListDomainsResponse] =
      service.listDomains(params).promise().toFuture
    @inline def listFleetsFuture(params: ListFleetsRequest): Future[ListFleetsResponse] =
      service.listFleets(params).promise().toFuture
    @inline def listWebsiteAuthorizationProvidersFuture(
        params: ListWebsiteAuthorizationProvidersRequest
    ): Future[ListWebsiteAuthorizationProvidersResponse] =
      service.listWebsiteAuthorizationProviders(params).promise().toFuture
    @inline def listWebsiteCertificateAuthoritiesFuture(
        params: ListWebsiteCertificateAuthoritiesRequest
    ): Future[ListWebsiteCertificateAuthoritiesResponse] =
      service.listWebsiteCertificateAuthorities(params).promise().toFuture
    @inline def restoreDomainAccessFuture(params: RestoreDomainAccessRequest): Future[RestoreDomainAccessResponse] =
      service.restoreDomainAccess(params).promise().toFuture
    @inline def revokeDomainAccessFuture(params: RevokeDomainAccessRequest): Future[RevokeDomainAccessResponse] =
      service.revokeDomainAccess(params).promise().toFuture
    @inline def signOutUserFuture(params: SignOutUserRequest): Future[SignOutUserResponse] =
      service.signOutUser(params).promise().toFuture
    @inline def updateAuditStreamConfigurationFuture(
        params: UpdateAuditStreamConfigurationRequest
    ): Future[UpdateAuditStreamConfigurationResponse] =
      service.updateAuditStreamConfiguration(params).promise().toFuture
    @inline def updateCompanyNetworkConfigurationFuture(
        params: UpdateCompanyNetworkConfigurationRequest
    ): Future[UpdateCompanyNetworkConfigurationResponse] =
      service.updateCompanyNetworkConfiguration(params).promise().toFuture
    @inline def updateDevicePolicyConfigurationFuture(
        params: UpdateDevicePolicyConfigurationRequest
    ): Future[UpdateDevicePolicyConfigurationResponse] =
      service.updateDevicePolicyConfiguration(params).promise().toFuture
    @inline def updateDomainMetadataFuture(params: UpdateDomainMetadataRequest): Future[UpdateDomainMetadataResponse] =
      service.updateDomainMetadata(params).promise().toFuture
    @inline def updateFleetMetadataFuture(params: UpdateFleetMetadataRequest): Future[UpdateFleetMetadataResponse] =
      service.updateFleetMetadata(params).promise().toFuture
    @inline def updateIdentityProviderConfigurationFuture(
        params: UpdateIdentityProviderConfigurationRequest
    ): Future[UpdateIdentityProviderConfigurationResponse] =
      service.updateIdentityProviderConfiguration(params).promise().toFuture
  }
}

package worklink {
  @js.native
  @JSImport("aws-sdk", "WorkLink")
  class WorkLink() extends js.Object {
    def this(config: AWSConfig) = this()

    def associateDomain(params: AssociateDomainRequest): Request[AssociateDomainResponse] = js.native
    def associateWebsiteAuthorizationProvider(
        params: AssociateWebsiteAuthorizationProviderRequest
    ): Request[AssociateWebsiteAuthorizationProviderResponse] = js.native
    def associateWebsiteCertificateAuthority(
        params: AssociateWebsiteCertificateAuthorityRequest
    ): Request[AssociateWebsiteCertificateAuthorityResponse]                  = js.native
    def createFleet(params: CreateFleetRequest): Request[CreateFleetResponse] = js.native
    def deleteFleet(params: DeleteFleetRequest): Request[DeleteFleetResponse] = js.native
    def describeAuditStreamConfiguration(
        params: DescribeAuditStreamConfigurationRequest
    ): Request[DescribeAuditStreamConfigurationResponse] = js.native
    def describeCompanyNetworkConfiguration(
        params: DescribeCompanyNetworkConfigurationRequest
    ): Request[DescribeCompanyNetworkConfigurationResponse]                            = js.native
    def describeDevice(params: DescribeDeviceRequest): Request[DescribeDeviceResponse] = js.native
    def describeDevicePolicyConfiguration(
        params: DescribeDevicePolicyConfigurationRequest
    ): Request[DescribeDevicePolicyConfigurationResponse]                                                   = js.native
    def describeDomain(params: DescribeDomainRequest): Request[DescribeDomainResponse]                      = js.native
    def describeFleetMetadata(params: DescribeFleetMetadataRequest): Request[DescribeFleetMetadataResponse] = js.native
    def describeIdentityProviderConfiguration(
        params: DescribeIdentityProviderConfigurationRequest
    ): Request[DescribeIdentityProviderConfigurationResponse] = js.native
    def describeWebsiteCertificateAuthority(
        params: DescribeWebsiteCertificateAuthorityRequest
    ): Request[DescribeWebsiteCertificateAuthorityResponse]                                        = js.native
    def disassociateDomain(params: DisassociateDomainRequest): Request[DisassociateDomainResponse] = js.native
    def disassociateWebsiteAuthorizationProvider(
        params: DisassociateWebsiteAuthorizationProviderRequest
    ): Request[DisassociateWebsiteAuthorizationProviderResponse] = js.native
    def disassociateWebsiteCertificateAuthority(
        params: DisassociateWebsiteCertificateAuthorityRequest
    ): Request[DisassociateWebsiteCertificateAuthorityResponse]               = js.native
    def listDevices(params: ListDevicesRequest): Request[ListDevicesResponse] = js.native
    def listDomains(params: ListDomainsRequest): Request[ListDomainsResponse] = js.native
    def listFleets(params: ListFleetsRequest): Request[ListFleetsResponse]    = js.native
    def listWebsiteAuthorizationProviders(
        params: ListWebsiteAuthorizationProvidersRequest
    ): Request[ListWebsiteAuthorizationProvidersResponse] = js.native
    def listWebsiteCertificateAuthorities(
        params: ListWebsiteCertificateAuthoritiesRequest
    ): Request[ListWebsiteCertificateAuthoritiesResponse]                                             = js.native
    def restoreDomainAccess(params: RestoreDomainAccessRequest): Request[RestoreDomainAccessResponse] = js.native
    def revokeDomainAccess(params: RevokeDomainAccessRequest): Request[RevokeDomainAccessResponse]    = js.native
    def signOutUser(params: SignOutUserRequest): Request[SignOutUserResponse]                         = js.native
    def updateAuditStreamConfiguration(
        params: UpdateAuditStreamConfigurationRequest
    ): Request[UpdateAuditStreamConfigurationResponse] = js.native
    def updateCompanyNetworkConfiguration(
        params: UpdateCompanyNetworkConfigurationRequest
    ): Request[UpdateCompanyNetworkConfigurationResponse] = js.native
    def updateDevicePolicyConfiguration(
        params: UpdateDevicePolicyConfigurationRequest
    ): Request[UpdateDevicePolicyConfigurationResponse]                                                  = js.native
    def updateDomainMetadata(params: UpdateDomainMetadataRequest): Request[UpdateDomainMetadataResponse] = js.native
    def updateFleetMetadata(params: UpdateFleetMetadataRequest): Request[UpdateFleetMetadataResponse]    = js.native
    def updateIdentityProviderConfiguration(
        params: UpdateIdentityProviderConfigurationRequest
    ): Request[UpdateIdentityProviderConfigurationResponse] = js.native
  }

  @js.native
  @Factory
  trait AssociateDomainRequest extends js.Object {
    var AcmCertificateArn: AcmCertificateArn
    var DomainName: DomainName
    var FleetArn: FleetArn
    var DisplayName: js.UndefOr[DisplayName]
  }

  @js.native
  @Factory
  trait AssociateDomainResponse extends js.Object {}

  @js.native
  @Factory
  trait AssociateWebsiteAuthorizationProviderRequest extends js.Object {
    var AuthorizationProviderType: AuthorizationProviderType
    var FleetArn: FleetArn
    var DomainName: js.UndefOr[DomainName]
  }

  @js.native
  @Factory
  trait AssociateWebsiteAuthorizationProviderResponse extends js.Object {
    var AuthorizationProviderId: js.UndefOr[Id]
  }

  @js.native
  @Factory
  trait AssociateWebsiteCertificateAuthorityRequest extends js.Object {
    var Certificate: Certificate
    var FleetArn: FleetArn
    var DisplayName: js.UndefOr[DisplayName]
  }

  @js.native
  @Factory
  trait AssociateWebsiteCertificateAuthorityResponse extends js.Object {
    var WebsiteCaId: js.UndefOr[Id]
  }

  @js.native
  sealed trait AuthorizationProviderType extends js.Any
  object AuthorizationProviderType extends js.Object {
    val SAML = "SAML".asInstanceOf[AuthorizationProviderType]

    val values = js.Object.freeze(js.Array(SAML))
  }

  @js.native
  @Factory
  trait CreateFleetRequest extends js.Object {
    var FleetName: FleetName
    var DisplayName: js.UndefOr[DisplayName]
    var OptimizeForEndUserLocation: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait CreateFleetResponse extends js.Object {
    var FleetArn: js.UndefOr[FleetArn]
  }

  @js.native
  @Factory
  trait DeleteFleetRequest extends js.Object {
    var FleetArn: FleetArn
  }

  @js.native
  @Factory
  trait DeleteFleetResponse extends js.Object {}

  @js.native
  @Factory
  trait DescribeAuditStreamConfigurationRequest extends js.Object {
    var FleetArn: FleetArn
  }

  @js.native
  @Factory
  trait DescribeAuditStreamConfigurationResponse extends js.Object {
    var AuditStreamArn: js.UndefOr[AuditStreamArn]
  }

  @js.native
  @Factory
  trait DescribeCompanyNetworkConfigurationRequest extends js.Object {
    var FleetArn: FleetArn
  }

  @js.native
  @Factory
  trait DescribeCompanyNetworkConfigurationResponse extends js.Object {
    var SecurityGroupIds: js.UndefOr[SecurityGroupIds]
    var SubnetIds: js.UndefOr[SubnetIds]
    var VpcId: js.UndefOr[VpcId]
  }

  @js.native
  @Factory
  trait DescribeDevicePolicyConfigurationRequest extends js.Object {
    var FleetArn: FleetArn
  }

  @js.native
  @Factory
  trait DescribeDevicePolicyConfigurationResponse extends js.Object {
    var DeviceCaCertificate: js.UndefOr[Certificate]
  }

  @js.native
  @Factory
  trait DescribeDeviceRequest extends js.Object {
    var DeviceId: Id
    var FleetArn: FleetArn
  }

  @js.native
  @Factory
  trait DescribeDeviceResponse extends js.Object {
    var FirstAccessedTime: js.UndefOr[DateTime]
    var LastAccessedTime: js.UndefOr[DateTime]
    var Manufacturer: js.UndefOr[DeviceManufacturer]
    var Model: js.UndefOr[DeviceModel]
    var OperatingSystem: js.UndefOr[DeviceOperatingSystemName]
    var OperatingSystemVersion: js.UndefOr[DeviceOperatingSystemVersion]
    var PatchLevel: js.UndefOr[DevicePatchLevel]
    var Status: js.UndefOr[DeviceStatus]
    var Username: js.UndefOr[Username]
  }

  @js.native
  @Factory
  trait DescribeDomainRequest extends js.Object {
    var DomainName: DomainName
    var FleetArn: FleetArn
  }

  @js.native
  @Factory
  trait DescribeDomainResponse extends js.Object {
    var AcmCertificateArn: js.UndefOr[AcmCertificateArn]
    var CreatedTime: js.UndefOr[DateTime]
    var DisplayName: js.UndefOr[DisplayName]
    var DomainName: js.UndefOr[DomainName]
    var DomainStatus: js.UndefOr[DomainStatus]
  }

  @js.native
  @Factory
  trait DescribeFleetMetadataRequest extends js.Object {
    var FleetArn: FleetArn
  }

  @js.native
  @Factory
  trait DescribeFleetMetadataResponse extends js.Object {
    var CompanyCode: js.UndefOr[CompanyCode]
    var CreatedTime: js.UndefOr[DateTime]
    var DisplayName: js.UndefOr[DisplayName]
    var FleetName: js.UndefOr[FleetName]
    var FleetStatus: js.UndefOr[FleetStatus]
    var LastUpdatedTime: js.UndefOr[DateTime]
    var OptimizeForEndUserLocation: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait DescribeIdentityProviderConfigurationRequest extends js.Object {
    var FleetArn: FleetArn
  }

  @js.native
  @Factory
  trait DescribeIdentityProviderConfigurationResponse extends js.Object {
    var IdentityProviderSamlMetadata: js.UndefOr[SamlMetadata]
    var IdentityProviderType: js.UndefOr[IdentityProviderType]
    var ServiceProviderSamlMetadata: js.UndefOr[SamlMetadata]
  }

  @js.native
  @Factory
  trait DescribeWebsiteCertificateAuthorityRequest extends js.Object {
    var FleetArn: FleetArn
    var WebsiteCaId: Id
  }

  @js.native
  @Factory
  trait DescribeWebsiteCertificateAuthorityResponse extends js.Object {
    var Certificate: js.UndefOr[Certificate]
    var CreatedTime: js.UndefOr[DateTime]
    var DisplayName: js.UndefOr[DisplayName]
  }

  @js.native
  sealed trait DeviceStatus extends js.Any
  object DeviceStatus extends js.Object {
    val ACTIVE     = "ACTIVE".asInstanceOf[DeviceStatus]
    val SIGNED_OUT = "SIGNED_OUT".asInstanceOf[DeviceStatus]

    val values = js.Object.freeze(js.Array(ACTIVE, SIGNED_OUT))
  }

  /**
    * The summary of devices.
    */
  @js.native
  @Factory
  trait DeviceSummary extends js.Object {
    var DeviceId: js.UndefOr[Id]
    var DeviceStatus: js.UndefOr[DeviceStatus]
  }

  @js.native
  @Factory
  trait DisassociateDomainRequest extends js.Object {
    var DomainName: DomainName
    var FleetArn: FleetArn
  }

  @js.native
  @Factory
  trait DisassociateDomainResponse extends js.Object {}

  @js.native
  @Factory
  trait DisassociateWebsiteAuthorizationProviderRequest extends js.Object {
    var AuthorizationProviderId: Id
    var FleetArn: FleetArn
  }

  @js.native
  @Factory
  trait DisassociateWebsiteAuthorizationProviderResponse extends js.Object {}

  @js.native
  @Factory
  trait DisassociateWebsiteCertificateAuthorityRequest extends js.Object {
    var FleetArn: FleetArn
    var WebsiteCaId: Id
  }

  @js.native
  @Factory
  trait DisassociateWebsiteCertificateAuthorityResponse extends js.Object {}

  @js.native
  sealed trait DomainStatus extends js.Any
  object DomainStatus extends js.Object {
    val PENDING_VALIDATION     = "PENDING_VALIDATION".asInstanceOf[DomainStatus]
    val ASSOCIATING            = "ASSOCIATING".asInstanceOf[DomainStatus]
    val ACTIVE                 = "ACTIVE".asInstanceOf[DomainStatus]
    val INACTIVE               = "INACTIVE".asInstanceOf[DomainStatus]
    val DISASSOCIATING         = "DISASSOCIATING".asInstanceOf[DomainStatus]
    val DISASSOCIATED          = "DISASSOCIATED".asInstanceOf[DomainStatus]
    val FAILED_TO_ASSOCIATE    = "FAILED_TO_ASSOCIATE".asInstanceOf[DomainStatus]
    val FAILED_TO_DISASSOCIATE = "FAILED_TO_DISASSOCIATE".asInstanceOf[DomainStatus]

    val values = js.Object.freeze(
      js.Array(
        PENDING_VALIDATION,
        ASSOCIATING,
        ACTIVE,
        INACTIVE,
        DISASSOCIATING,
        DISASSOCIATED,
        FAILED_TO_ASSOCIATE,
        FAILED_TO_DISASSOCIATE
      )
    )
  }

  /**
    * The summary of the domain.
    */
  @js.native
  @Factory
  trait DomainSummary extends js.Object {
    var CreatedTime: DateTime
    var DomainName: DomainName
    var DomainStatus: DomainStatus
    var DisplayName: js.UndefOr[DisplayName]
  }

  @js.native
  sealed trait FleetStatus extends js.Any
  object FleetStatus extends js.Object {
    val CREATING         = "CREATING".asInstanceOf[FleetStatus]
    val ACTIVE           = "ACTIVE".asInstanceOf[FleetStatus]
    val DELETING         = "DELETING".asInstanceOf[FleetStatus]
    val DELETED          = "DELETED".asInstanceOf[FleetStatus]
    val FAILED_TO_CREATE = "FAILED_TO_CREATE".asInstanceOf[FleetStatus]
    val FAILED_TO_DELETE = "FAILED_TO_DELETE".asInstanceOf[FleetStatus]

    val values = js.Object.freeze(js.Array(CREATING, ACTIVE, DELETING, DELETED, FAILED_TO_CREATE, FAILED_TO_DELETE))
  }

  /**
    * The summary of the fleet.
    */
  @js.native
  @Factory
  trait FleetSummary extends js.Object {
    var CompanyCode: js.UndefOr[CompanyCode]
    var CreatedTime: js.UndefOr[DateTime]
    var DisplayName: js.UndefOr[DisplayName]
    var FleetArn: js.UndefOr[FleetArn]
    var FleetName: js.UndefOr[FleetName]
    var FleetStatus: js.UndefOr[FleetStatus]
    var LastUpdatedTime: js.UndefOr[DateTime]
  }

  @js.native
  sealed trait IdentityProviderType extends js.Any
  object IdentityProviderType extends js.Object {
    val SAML = "SAML".asInstanceOf[IdentityProviderType]

    val values = js.Object.freeze(js.Array(SAML))
  }

  @js.native
  @Factory
  trait ListDevicesRequest extends js.Object {
    var FleetArn: FleetArn
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListDevicesResponse extends js.Object {
    var Devices: js.UndefOr[DeviceSummaryList]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListDomainsRequest extends js.Object {
    var FleetArn: FleetArn
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListDomainsResponse extends js.Object {
    var Domains: js.UndefOr[DomainSummaryList]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListFleetsRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListFleetsResponse extends js.Object {
    var FleetSummaryList: js.UndefOr[FleetSummaryList]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListWebsiteAuthorizationProvidersRequest extends js.Object {
    var FleetArn: FleetArn
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListWebsiteAuthorizationProvidersResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var WebsiteAuthorizationProviders: js.UndefOr[WebsiteAuthorizationProvidersSummaryList]
  }

  @js.native
  @Factory
  trait ListWebsiteCertificateAuthoritiesRequest extends js.Object {
    var FleetArn: FleetArn
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListWebsiteCertificateAuthoritiesResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var WebsiteCertificateAuthorities: js.UndefOr[WebsiteCaSummaryList]
  }

  @js.native
  @Factory
  trait RestoreDomainAccessRequest extends js.Object {
    var DomainName: DomainName
    var FleetArn: FleetArn
  }

  @js.native
  @Factory
  trait RestoreDomainAccessResponse extends js.Object {}

  @js.native
  @Factory
  trait RevokeDomainAccessRequest extends js.Object {
    var DomainName: DomainName
    var FleetArn: FleetArn
  }

  @js.native
  @Factory
  trait RevokeDomainAccessResponse extends js.Object {}

  @js.native
  @Factory
  trait SignOutUserRequest extends js.Object {
    var FleetArn: FleetArn
    var Username: Username
  }

  @js.native
  @Factory
  trait SignOutUserResponse extends js.Object {}

  @js.native
  @Factory
  trait UpdateAuditStreamConfigurationRequest extends js.Object {
    var FleetArn: FleetArn
    var AuditStreamArn: js.UndefOr[AuditStreamArn]
  }

  @js.native
  @Factory
  trait UpdateAuditStreamConfigurationResponse extends js.Object {}

  @js.native
  @Factory
  trait UpdateCompanyNetworkConfigurationRequest extends js.Object {
    var FleetArn: FleetArn
    var SecurityGroupIds: SecurityGroupIds
    var SubnetIds: SubnetIds
    var VpcId: VpcId
  }

  @js.native
  @Factory
  trait UpdateCompanyNetworkConfigurationResponse extends js.Object {}

  @js.native
  @Factory
  trait UpdateDevicePolicyConfigurationRequest extends js.Object {
    var FleetArn: FleetArn
    var DeviceCaCertificate: js.UndefOr[CertificateChain]
  }

  @js.native
  @Factory
  trait UpdateDevicePolicyConfigurationResponse extends js.Object {}

  @js.native
  @Factory
  trait UpdateDomainMetadataRequest extends js.Object {
    var DomainName: DomainName
    var FleetArn: FleetArn
    var DisplayName: js.UndefOr[DisplayName]
  }

  @js.native
  @Factory
  trait UpdateDomainMetadataResponse extends js.Object {}

  @js.native
  @Factory
  trait UpdateFleetMetadataRequest extends js.Object {
    var FleetArn: FleetArn
    var DisplayName: js.UndefOr[DisplayName]
    var OptimizeForEndUserLocation: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait UpdateFleetMetadataResponse extends js.Object {}

  @js.native
  @Factory
  trait UpdateIdentityProviderConfigurationRequest extends js.Object {
    var FleetArn: FleetArn
    var IdentityProviderType: IdentityProviderType
    var IdentityProviderSamlMetadata: js.UndefOr[SamlMetadata]
  }

  @js.native
  @Factory
  trait UpdateIdentityProviderConfigurationResponse extends js.Object {}

  /**
    * The summary of the website authorization provider.
    */
  @js.native
  @Factory
  trait WebsiteAuthorizationProviderSummary extends js.Object {
    var AuthorizationProviderType: AuthorizationProviderType
    var AuthorizationProviderId: js.UndefOr[Id]
    var CreatedTime: js.UndefOr[DateTime]
    var DomainName: js.UndefOr[DomainName]
  }

  /**
    * The summary of the certificate authority (CA).
    */
  @js.native
  @Factory
  trait WebsiteCaSummary extends js.Object {
    var CreatedTime: js.UndefOr[DateTime]
    var DisplayName: js.UndefOr[DisplayName]
    var WebsiteCaId: js.UndefOr[Id]
  }
}
