package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

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
  trait AssociateDomainRequest extends js.Object {
    var AcmCertificateArn: AcmCertificateArn
    var DomainName: DomainName
    var FleetArn: FleetArn
    var DisplayName: js.UndefOr[DisplayName]
  }

  object AssociateDomainRequest {
    @inline
    def apply(
        AcmCertificateArn: AcmCertificateArn,
        DomainName: DomainName,
        FleetArn: FleetArn,
        DisplayName: js.UndefOr[DisplayName] = js.undefined
    ): AssociateDomainRequest = {
      val __obj = js.Dynamic.literal(
        "AcmCertificateArn" -> AcmCertificateArn.asInstanceOf[js.Any],
        "DomainName"        -> DomainName.asInstanceOf[js.Any],
        "FleetArn"          -> FleetArn.asInstanceOf[js.Any]
      )

      DisplayName.foreach(__v => __obj.updateDynamic("DisplayName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssociateDomainRequest]
    }
  }

  @js.native
  trait AssociateDomainResponse extends js.Object {}

  object AssociateDomainResponse {
    @inline
    def apply(
    ): AssociateDomainResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[AssociateDomainResponse]
    }
  }

  @js.native
  trait AssociateWebsiteAuthorizationProviderRequest extends js.Object {
    var AuthorizationProviderType: AuthorizationProviderType
    var FleetArn: FleetArn
    var DomainName: js.UndefOr[DomainName]
  }

  object AssociateWebsiteAuthorizationProviderRequest {
    @inline
    def apply(
        AuthorizationProviderType: AuthorizationProviderType,
        FleetArn: FleetArn,
        DomainName: js.UndefOr[DomainName] = js.undefined
    ): AssociateWebsiteAuthorizationProviderRequest = {
      val __obj = js.Dynamic.literal(
        "AuthorizationProviderType" -> AuthorizationProviderType.asInstanceOf[js.Any],
        "FleetArn"                  -> FleetArn.asInstanceOf[js.Any]
      )

      DomainName.foreach(__v => __obj.updateDynamic("DomainName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssociateWebsiteAuthorizationProviderRequest]
    }
  }

  @js.native
  trait AssociateWebsiteAuthorizationProviderResponse extends js.Object {
    var AuthorizationProviderId: js.UndefOr[Id]
  }

  object AssociateWebsiteAuthorizationProviderResponse {
    @inline
    def apply(
        AuthorizationProviderId: js.UndefOr[Id] = js.undefined
    ): AssociateWebsiteAuthorizationProviderResponse = {
      val __obj = js.Dynamic.literal()
      AuthorizationProviderId.foreach(__v => __obj.updateDynamic("AuthorizationProviderId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssociateWebsiteAuthorizationProviderResponse]
    }
  }

  @js.native
  trait AssociateWebsiteCertificateAuthorityRequest extends js.Object {
    var Certificate: Certificate
    var FleetArn: FleetArn
    var DisplayName: js.UndefOr[DisplayName]
  }

  object AssociateWebsiteCertificateAuthorityRequest {
    @inline
    def apply(
        Certificate: Certificate,
        FleetArn: FleetArn,
        DisplayName: js.UndefOr[DisplayName] = js.undefined
    ): AssociateWebsiteCertificateAuthorityRequest = {
      val __obj = js.Dynamic.literal(
        "Certificate" -> Certificate.asInstanceOf[js.Any],
        "FleetArn"    -> FleetArn.asInstanceOf[js.Any]
      )

      DisplayName.foreach(__v => __obj.updateDynamic("DisplayName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssociateWebsiteCertificateAuthorityRequest]
    }
  }

  @js.native
  trait AssociateWebsiteCertificateAuthorityResponse extends js.Object {
    var WebsiteCaId: js.UndefOr[Id]
  }

  object AssociateWebsiteCertificateAuthorityResponse {
    @inline
    def apply(
        WebsiteCaId: js.UndefOr[Id] = js.undefined
    ): AssociateWebsiteCertificateAuthorityResponse = {
      val __obj = js.Dynamic.literal()
      WebsiteCaId.foreach(__v => __obj.updateDynamic("WebsiteCaId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssociateWebsiteCertificateAuthorityResponse]
    }
  }

  @js.native
  sealed trait AuthorizationProviderType extends js.Any
  object AuthorizationProviderType extends js.Object {
    val SAML = "SAML".asInstanceOf[AuthorizationProviderType]

    val values = js.Object.freeze(js.Array(SAML))
  }

  @js.native
  trait CreateFleetRequest extends js.Object {
    var FleetName: FleetName
    var DisplayName: js.UndefOr[DisplayName]
    var OptimizeForEndUserLocation: js.UndefOr[Boolean]
  }

  object CreateFleetRequest {
    @inline
    def apply(
        FleetName: FleetName,
        DisplayName: js.UndefOr[DisplayName] = js.undefined,
        OptimizeForEndUserLocation: js.UndefOr[Boolean] = js.undefined
    ): CreateFleetRequest = {
      val __obj = js.Dynamic.literal(
        "FleetName" -> FleetName.asInstanceOf[js.Any]
      )

      DisplayName.foreach(__v => __obj.updateDynamic("DisplayName")(__v.asInstanceOf[js.Any]))
      OptimizeForEndUserLocation.foreach(__v =>
        __obj.updateDynamic("OptimizeForEndUserLocation")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[CreateFleetRequest]
    }
  }

  @js.native
  trait CreateFleetResponse extends js.Object {
    var FleetArn: js.UndefOr[FleetArn]
  }

  object CreateFleetResponse {
    @inline
    def apply(
        FleetArn: js.UndefOr[FleetArn] = js.undefined
    ): CreateFleetResponse = {
      val __obj = js.Dynamic.literal()
      FleetArn.foreach(__v => __obj.updateDynamic("FleetArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateFleetResponse]
    }
  }

  @js.native
  trait DeleteFleetRequest extends js.Object {
    var FleetArn: FleetArn
  }

  object DeleteFleetRequest {
    @inline
    def apply(
        FleetArn: FleetArn
    ): DeleteFleetRequest = {
      val __obj = js.Dynamic.literal(
        "FleetArn" -> FleetArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteFleetRequest]
    }
  }

  @js.native
  trait DeleteFleetResponse extends js.Object {}

  object DeleteFleetResponse {
    @inline
    def apply(
    ): DeleteFleetResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DeleteFleetResponse]
    }
  }

  @js.native
  trait DescribeAuditStreamConfigurationRequest extends js.Object {
    var FleetArn: FleetArn
  }

  object DescribeAuditStreamConfigurationRequest {
    @inline
    def apply(
        FleetArn: FleetArn
    ): DescribeAuditStreamConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "FleetArn" -> FleetArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeAuditStreamConfigurationRequest]
    }
  }

  @js.native
  trait DescribeAuditStreamConfigurationResponse extends js.Object {
    var AuditStreamArn: js.UndefOr[AuditStreamArn]
  }

  object DescribeAuditStreamConfigurationResponse {
    @inline
    def apply(
        AuditStreamArn: js.UndefOr[AuditStreamArn] = js.undefined
    ): DescribeAuditStreamConfigurationResponse = {
      val __obj = js.Dynamic.literal()
      AuditStreamArn.foreach(__v => __obj.updateDynamic("AuditStreamArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeAuditStreamConfigurationResponse]
    }
  }

  @js.native
  trait DescribeCompanyNetworkConfigurationRequest extends js.Object {
    var FleetArn: FleetArn
  }

  object DescribeCompanyNetworkConfigurationRequest {
    @inline
    def apply(
        FleetArn: FleetArn
    ): DescribeCompanyNetworkConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "FleetArn" -> FleetArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeCompanyNetworkConfigurationRequest]
    }
  }

  @js.native
  trait DescribeCompanyNetworkConfigurationResponse extends js.Object {
    var SecurityGroupIds: js.UndefOr[SecurityGroupIds]
    var SubnetIds: js.UndefOr[SubnetIds]
    var VpcId: js.UndefOr[VpcId]
  }

  object DescribeCompanyNetworkConfigurationResponse {
    @inline
    def apply(
        SecurityGroupIds: js.UndefOr[SecurityGroupIds] = js.undefined,
        SubnetIds: js.UndefOr[SubnetIds] = js.undefined,
        VpcId: js.UndefOr[VpcId] = js.undefined
    ): DescribeCompanyNetworkConfigurationResponse = {
      val __obj = js.Dynamic.literal()
      SecurityGroupIds.foreach(__v => __obj.updateDynamic("SecurityGroupIds")(__v.asInstanceOf[js.Any]))
      SubnetIds.foreach(__v => __obj.updateDynamic("SubnetIds")(__v.asInstanceOf[js.Any]))
      VpcId.foreach(__v => __obj.updateDynamic("VpcId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeCompanyNetworkConfigurationResponse]
    }
  }

  @js.native
  trait DescribeDevicePolicyConfigurationRequest extends js.Object {
    var FleetArn: FleetArn
  }

  object DescribeDevicePolicyConfigurationRequest {
    @inline
    def apply(
        FleetArn: FleetArn
    ): DescribeDevicePolicyConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "FleetArn" -> FleetArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeDevicePolicyConfigurationRequest]
    }
  }

  @js.native
  trait DescribeDevicePolicyConfigurationResponse extends js.Object {
    var DeviceCaCertificate: js.UndefOr[Certificate]
  }

  object DescribeDevicePolicyConfigurationResponse {
    @inline
    def apply(
        DeviceCaCertificate: js.UndefOr[Certificate] = js.undefined
    ): DescribeDevicePolicyConfigurationResponse = {
      val __obj = js.Dynamic.literal()
      DeviceCaCertificate.foreach(__v => __obj.updateDynamic("DeviceCaCertificate")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeDevicePolicyConfigurationResponse]
    }
  }

  @js.native
  trait DescribeDeviceRequest extends js.Object {
    var DeviceId: Id
    var FleetArn: FleetArn
  }

  object DescribeDeviceRequest {
    @inline
    def apply(
        DeviceId: Id,
        FleetArn: FleetArn
    ): DescribeDeviceRequest = {
      val __obj = js.Dynamic.literal(
        "DeviceId" -> DeviceId.asInstanceOf[js.Any],
        "FleetArn" -> FleetArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeDeviceRequest]
    }
  }

  @js.native
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

  object DescribeDeviceResponse {
    @inline
    def apply(
        FirstAccessedTime: js.UndefOr[DateTime] = js.undefined,
        LastAccessedTime: js.UndefOr[DateTime] = js.undefined,
        Manufacturer: js.UndefOr[DeviceManufacturer] = js.undefined,
        Model: js.UndefOr[DeviceModel] = js.undefined,
        OperatingSystem: js.UndefOr[DeviceOperatingSystemName] = js.undefined,
        OperatingSystemVersion: js.UndefOr[DeviceOperatingSystemVersion] = js.undefined,
        PatchLevel: js.UndefOr[DevicePatchLevel] = js.undefined,
        Status: js.UndefOr[DeviceStatus] = js.undefined,
        Username: js.UndefOr[Username] = js.undefined
    ): DescribeDeviceResponse = {
      val __obj = js.Dynamic.literal()
      FirstAccessedTime.foreach(__v => __obj.updateDynamic("FirstAccessedTime")(__v.asInstanceOf[js.Any]))
      LastAccessedTime.foreach(__v => __obj.updateDynamic("LastAccessedTime")(__v.asInstanceOf[js.Any]))
      Manufacturer.foreach(__v => __obj.updateDynamic("Manufacturer")(__v.asInstanceOf[js.Any]))
      Model.foreach(__v => __obj.updateDynamic("Model")(__v.asInstanceOf[js.Any]))
      OperatingSystem.foreach(__v => __obj.updateDynamic("OperatingSystem")(__v.asInstanceOf[js.Any]))
      OperatingSystemVersion.foreach(__v => __obj.updateDynamic("OperatingSystemVersion")(__v.asInstanceOf[js.Any]))
      PatchLevel.foreach(__v => __obj.updateDynamic("PatchLevel")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      Username.foreach(__v => __obj.updateDynamic("Username")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeDeviceResponse]
    }
  }

  @js.native
  trait DescribeDomainRequest extends js.Object {
    var DomainName: DomainName
    var FleetArn: FleetArn
  }

  object DescribeDomainRequest {
    @inline
    def apply(
        DomainName: DomainName,
        FleetArn: FleetArn
    ): DescribeDomainRequest = {
      val __obj = js.Dynamic.literal(
        "DomainName" -> DomainName.asInstanceOf[js.Any],
        "FleetArn"   -> FleetArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeDomainRequest]
    }
  }

  @js.native
  trait DescribeDomainResponse extends js.Object {
    var AcmCertificateArn: js.UndefOr[AcmCertificateArn]
    var CreatedTime: js.UndefOr[DateTime]
    var DisplayName: js.UndefOr[DisplayName]
    var DomainName: js.UndefOr[DomainName]
    var DomainStatus: js.UndefOr[DomainStatus]
  }

  object DescribeDomainResponse {
    @inline
    def apply(
        AcmCertificateArn: js.UndefOr[AcmCertificateArn] = js.undefined,
        CreatedTime: js.UndefOr[DateTime] = js.undefined,
        DisplayName: js.UndefOr[DisplayName] = js.undefined,
        DomainName: js.UndefOr[DomainName] = js.undefined,
        DomainStatus: js.UndefOr[DomainStatus] = js.undefined
    ): DescribeDomainResponse = {
      val __obj = js.Dynamic.literal()
      AcmCertificateArn.foreach(__v => __obj.updateDynamic("AcmCertificateArn")(__v.asInstanceOf[js.Any]))
      CreatedTime.foreach(__v => __obj.updateDynamic("CreatedTime")(__v.asInstanceOf[js.Any]))
      DisplayName.foreach(__v => __obj.updateDynamic("DisplayName")(__v.asInstanceOf[js.Any]))
      DomainName.foreach(__v => __obj.updateDynamic("DomainName")(__v.asInstanceOf[js.Any]))
      DomainStatus.foreach(__v => __obj.updateDynamic("DomainStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeDomainResponse]
    }
  }

  @js.native
  trait DescribeFleetMetadataRequest extends js.Object {
    var FleetArn: FleetArn
  }

  object DescribeFleetMetadataRequest {
    @inline
    def apply(
        FleetArn: FleetArn
    ): DescribeFleetMetadataRequest = {
      val __obj = js.Dynamic.literal(
        "FleetArn" -> FleetArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeFleetMetadataRequest]
    }
  }

  @js.native
  trait DescribeFleetMetadataResponse extends js.Object {
    var CompanyCode: js.UndefOr[CompanyCode]
    var CreatedTime: js.UndefOr[DateTime]
    var DisplayName: js.UndefOr[DisplayName]
    var FleetName: js.UndefOr[FleetName]
    var FleetStatus: js.UndefOr[FleetStatus]
    var LastUpdatedTime: js.UndefOr[DateTime]
    var OptimizeForEndUserLocation: js.UndefOr[Boolean]
  }

  object DescribeFleetMetadataResponse {
    @inline
    def apply(
        CompanyCode: js.UndefOr[CompanyCode] = js.undefined,
        CreatedTime: js.UndefOr[DateTime] = js.undefined,
        DisplayName: js.UndefOr[DisplayName] = js.undefined,
        FleetName: js.UndefOr[FleetName] = js.undefined,
        FleetStatus: js.UndefOr[FleetStatus] = js.undefined,
        LastUpdatedTime: js.UndefOr[DateTime] = js.undefined,
        OptimizeForEndUserLocation: js.UndefOr[Boolean] = js.undefined
    ): DescribeFleetMetadataResponse = {
      val __obj = js.Dynamic.literal()
      CompanyCode.foreach(__v => __obj.updateDynamic("CompanyCode")(__v.asInstanceOf[js.Any]))
      CreatedTime.foreach(__v => __obj.updateDynamic("CreatedTime")(__v.asInstanceOf[js.Any]))
      DisplayName.foreach(__v => __obj.updateDynamic("DisplayName")(__v.asInstanceOf[js.Any]))
      FleetName.foreach(__v => __obj.updateDynamic("FleetName")(__v.asInstanceOf[js.Any]))
      FleetStatus.foreach(__v => __obj.updateDynamic("FleetStatus")(__v.asInstanceOf[js.Any]))
      LastUpdatedTime.foreach(__v => __obj.updateDynamic("LastUpdatedTime")(__v.asInstanceOf[js.Any]))
      OptimizeForEndUserLocation.foreach(__v =>
        __obj.updateDynamic("OptimizeForEndUserLocation")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[DescribeFleetMetadataResponse]
    }
  }

  @js.native
  trait DescribeIdentityProviderConfigurationRequest extends js.Object {
    var FleetArn: FleetArn
  }

  object DescribeIdentityProviderConfigurationRequest {
    @inline
    def apply(
        FleetArn: FleetArn
    ): DescribeIdentityProviderConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "FleetArn" -> FleetArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeIdentityProviderConfigurationRequest]
    }
  }

  @js.native
  trait DescribeIdentityProviderConfigurationResponse extends js.Object {
    var IdentityProviderSamlMetadata: js.UndefOr[SamlMetadata]
    var IdentityProviderType: js.UndefOr[IdentityProviderType]
    var ServiceProviderSamlMetadata: js.UndefOr[SamlMetadata]
  }

  object DescribeIdentityProviderConfigurationResponse {
    @inline
    def apply(
        IdentityProviderSamlMetadata: js.UndefOr[SamlMetadata] = js.undefined,
        IdentityProviderType: js.UndefOr[IdentityProviderType] = js.undefined,
        ServiceProviderSamlMetadata: js.UndefOr[SamlMetadata] = js.undefined
    ): DescribeIdentityProviderConfigurationResponse = {
      val __obj = js.Dynamic.literal()
      IdentityProviderSamlMetadata.foreach(__v =>
        __obj.updateDynamic("IdentityProviderSamlMetadata")(__v.asInstanceOf[js.Any])
      )
      IdentityProviderType.foreach(__v => __obj.updateDynamic("IdentityProviderType")(__v.asInstanceOf[js.Any]))
      ServiceProviderSamlMetadata.foreach(__v =>
        __obj.updateDynamic("ServiceProviderSamlMetadata")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[DescribeIdentityProviderConfigurationResponse]
    }
  }

  @js.native
  trait DescribeWebsiteCertificateAuthorityRequest extends js.Object {
    var FleetArn: FleetArn
    var WebsiteCaId: Id
  }

  object DescribeWebsiteCertificateAuthorityRequest {
    @inline
    def apply(
        FleetArn: FleetArn,
        WebsiteCaId: Id
    ): DescribeWebsiteCertificateAuthorityRequest = {
      val __obj = js.Dynamic.literal(
        "FleetArn"    -> FleetArn.asInstanceOf[js.Any],
        "WebsiteCaId" -> WebsiteCaId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeWebsiteCertificateAuthorityRequest]
    }
  }

  @js.native
  trait DescribeWebsiteCertificateAuthorityResponse extends js.Object {
    var Certificate: js.UndefOr[Certificate]
    var CreatedTime: js.UndefOr[DateTime]
    var DisplayName: js.UndefOr[DisplayName]
  }

  object DescribeWebsiteCertificateAuthorityResponse {
    @inline
    def apply(
        Certificate: js.UndefOr[Certificate] = js.undefined,
        CreatedTime: js.UndefOr[DateTime] = js.undefined,
        DisplayName: js.UndefOr[DisplayName] = js.undefined
    ): DescribeWebsiteCertificateAuthorityResponse = {
      val __obj = js.Dynamic.literal()
      Certificate.foreach(__v => __obj.updateDynamic("Certificate")(__v.asInstanceOf[js.Any]))
      CreatedTime.foreach(__v => __obj.updateDynamic("CreatedTime")(__v.asInstanceOf[js.Any]))
      DisplayName.foreach(__v => __obj.updateDynamic("DisplayName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeWebsiteCertificateAuthorityResponse]
    }
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
  trait DeviceSummary extends js.Object {
    var DeviceId: js.UndefOr[Id]
    var DeviceStatus: js.UndefOr[DeviceStatus]
  }

  object DeviceSummary {
    @inline
    def apply(
        DeviceId: js.UndefOr[Id] = js.undefined,
        DeviceStatus: js.UndefOr[DeviceStatus] = js.undefined
    ): DeviceSummary = {
      val __obj = js.Dynamic.literal()
      DeviceId.foreach(__v => __obj.updateDynamic("DeviceId")(__v.asInstanceOf[js.Any]))
      DeviceStatus.foreach(__v => __obj.updateDynamic("DeviceStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeviceSummary]
    }
  }

  @js.native
  trait DisassociateDomainRequest extends js.Object {
    var DomainName: DomainName
    var FleetArn: FleetArn
  }

  object DisassociateDomainRequest {
    @inline
    def apply(
        DomainName: DomainName,
        FleetArn: FleetArn
    ): DisassociateDomainRequest = {
      val __obj = js.Dynamic.literal(
        "DomainName" -> DomainName.asInstanceOf[js.Any],
        "FleetArn"   -> FleetArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DisassociateDomainRequest]
    }
  }

  @js.native
  trait DisassociateDomainResponse extends js.Object {}

  object DisassociateDomainResponse {
    @inline
    def apply(
    ): DisassociateDomainResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DisassociateDomainResponse]
    }
  }

  @js.native
  trait DisassociateWebsiteAuthorizationProviderRequest extends js.Object {
    var AuthorizationProviderId: Id
    var FleetArn: FleetArn
  }

  object DisassociateWebsiteAuthorizationProviderRequest {
    @inline
    def apply(
        AuthorizationProviderId: Id,
        FleetArn: FleetArn
    ): DisassociateWebsiteAuthorizationProviderRequest = {
      val __obj = js.Dynamic.literal(
        "AuthorizationProviderId" -> AuthorizationProviderId.asInstanceOf[js.Any],
        "FleetArn"                -> FleetArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DisassociateWebsiteAuthorizationProviderRequest]
    }
  }

  @js.native
  trait DisassociateWebsiteAuthorizationProviderResponse extends js.Object {}

  object DisassociateWebsiteAuthorizationProviderResponse {
    @inline
    def apply(
    ): DisassociateWebsiteAuthorizationProviderResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DisassociateWebsiteAuthorizationProviderResponse]
    }
  }

  @js.native
  trait DisassociateWebsiteCertificateAuthorityRequest extends js.Object {
    var FleetArn: FleetArn
    var WebsiteCaId: Id
  }

  object DisassociateWebsiteCertificateAuthorityRequest {
    @inline
    def apply(
        FleetArn: FleetArn,
        WebsiteCaId: Id
    ): DisassociateWebsiteCertificateAuthorityRequest = {
      val __obj = js.Dynamic.literal(
        "FleetArn"    -> FleetArn.asInstanceOf[js.Any],
        "WebsiteCaId" -> WebsiteCaId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DisassociateWebsiteCertificateAuthorityRequest]
    }
  }

  @js.native
  trait DisassociateWebsiteCertificateAuthorityResponse extends js.Object {}

  object DisassociateWebsiteCertificateAuthorityResponse {
    @inline
    def apply(
    ): DisassociateWebsiteCertificateAuthorityResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DisassociateWebsiteCertificateAuthorityResponse]
    }
  }

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
  trait DomainSummary extends js.Object {
    var CreatedTime: DateTime
    var DomainName: DomainName
    var DomainStatus: DomainStatus
    var DisplayName: js.UndefOr[DisplayName]
  }

  object DomainSummary {
    @inline
    def apply(
        CreatedTime: DateTime,
        DomainName: DomainName,
        DomainStatus: DomainStatus,
        DisplayName: js.UndefOr[DisplayName] = js.undefined
    ): DomainSummary = {
      val __obj = js.Dynamic.literal(
        "CreatedTime"  -> CreatedTime.asInstanceOf[js.Any],
        "DomainName"   -> DomainName.asInstanceOf[js.Any],
        "DomainStatus" -> DomainStatus.asInstanceOf[js.Any]
      )

      DisplayName.foreach(__v => __obj.updateDynamic("DisplayName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DomainSummary]
    }
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
  trait FleetSummary extends js.Object {
    var CompanyCode: js.UndefOr[CompanyCode]
    var CreatedTime: js.UndefOr[DateTime]
    var DisplayName: js.UndefOr[DisplayName]
    var FleetArn: js.UndefOr[FleetArn]
    var FleetName: js.UndefOr[FleetName]
    var FleetStatus: js.UndefOr[FleetStatus]
    var LastUpdatedTime: js.UndefOr[DateTime]
  }

  object FleetSummary {
    @inline
    def apply(
        CompanyCode: js.UndefOr[CompanyCode] = js.undefined,
        CreatedTime: js.UndefOr[DateTime] = js.undefined,
        DisplayName: js.UndefOr[DisplayName] = js.undefined,
        FleetArn: js.UndefOr[FleetArn] = js.undefined,
        FleetName: js.UndefOr[FleetName] = js.undefined,
        FleetStatus: js.UndefOr[FleetStatus] = js.undefined,
        LastUpdatedTime: js.UndefOr[DateTime] = js.undefined
    ): FleetSummary = {
      val __obj = js.Dynamic.literal()
      CompanyCode.foreach(__v => __obj.updateDynamic("CompanyCode")(__v.asInstanceOf[js.Any]))
      CreatedTime.foreach(__v => __obj.updateDynamic("CreatedTime")(__v.asInstanceOf[js.Any]))
      DisplayName.foreach(__v => __obj.updateDynamic("DisplayName")(__v.asInstanceOf[js.Any]))
      FleetArn.foreach(__v => __obj.updateDynamic("FleetArn")(__v.asInstanceOf[js.Any]))
      FleetName.foreach(__v => __obj.updateDynamic("FleetName")(__v.asInstanceOf[js.Any]))
      FleetStatus.foreach(__v => __obj.updateDynamic("FleetStatus")(__v.asInstanceOf[js.Any]))
      LastUpdatedTime.foreach(__v => __obj.updateDynamic("LastUpdatedTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FleetSummary]
    }
  }

  @js.native
  sealed trait IdentityProviderType extends js.Any
  object IdentityProviderType extends js.Object {
    val SAML = "SAML".asInstanceOf[IdentityProviderType]

    val values = js.Object.freeze(js.Array(SAML))
  }

  @js.native
  trait ListDevicesRequest extends js.Object {
    var FleetArn: FleetArn
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListDevicesRequest {
    @inline
    def apply(
        FleetArn: FleetArn,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListDevicesRequest = {
      val __obj = js.Dynamic.literal(
        "FleetArn" -> FleetArn.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDevicesRequest]
    }
  }

  @js.native
  trait ListDevicesResponse extends js.Object {
    var Devices: js.UndefOr[DeviceSummaryList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListDevicesResponse {
    @inline
    def apply(
        Devices: js.UndefOr[DeviceSummaryList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListDevicesResponse = {
      val __obj = js.Dynamic.literal()
      Devices.foreach(__v => __obj.updateDynamic("Devices")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDevicesResponse]
    }
  }

  @js.native
  trait ListDomainsRequest extends js.Object {
    var FleetArn: FleetArn
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListDomainsRequest {
    @inline
    def apply(
        FleetArn: FleetArn,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListDomainsRequest = {
      val __obj = js.Dynamic.literal(
        "FleetArn" -> FleetArn.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDomainsRequest]
    }
  }

  @js.native
  trait ListDomainsResponse extends js.Object {
    var Domains: js.UndefOr[DomainSummaryList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListDomainsResponse {
    @inline
    def apply(
        Domains: js.UndefOr[DomainSummaryList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListDomainsResponse = {
      val __obj = js.Dynamic.literal()
      Domains.foreach(__v => __obj.updateDynamic("Domains")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDomainsResponse]
    }
  }

  @js.native
  trait ListFleetsRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListFleetsRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListFleetsRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListFleetsRequest]
    }
  }

  @js.native
  trait ListFleetsResponse extends js.Object {
    var FleetSummaryList: js.UndefOr[FleetSummaryList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListFleetsResponse {
    @inline
    def apply(
        FleetSummaryList: js.UndefOr[FleetSummaryList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListFleetsResponse = {
      val __obj = js.Dynamic.literal()
      FleetSummaryList.foreach(__v => __obj.updateDynamic("FleetSummaryList")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListFleetsResponse]
    }
  }

  @js.native
  trait ListWebsiteAuthorizationProvidersRequest extends js.Object {
    var FleetArn: FleetArn
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListWebsiteAuthorizationProvidersRequest {
    @inline
    def apply(
        FleetArn: FleetArn,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListWebsiteAuthorizationProvidersRequest = {
      val __obj = js.Dynamic.literal(
        "FleetArn" -> FleetArn.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListWebsiteAuthorizationProvidersRequest]
    }
  }

  @js.native
  trait ListWebsiteAuthorizationProvidersResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var WebsiteAuthorizationProviders: js.UndefOr[WebsiteAuthorizationProvidersSummaryList]
  }

  object ListWebsiteAuthorizationProvidersResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        WebsiteAuthorizationProviders: js.UndefOr[WebsiteAuthorizationProvidersSummaryList] = js.undefined
    ): ListWebsiteAuthorizationProvidersResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      WebsiteAuthorizationProviders.foreach(__v =>
        __obj.updateDynamic("WebsiteAuthorizationProviders")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[ListWebsiteAuthorizationProvidersResponse]
    }
  }

  @js.native
  trait ListWebsiteCertificateAuthoritiesRequest extends js.Object {
    var FleetArn: FleetArn
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListWebsiteCertificateAuthoritiesRequest {
    @inline
    def apply(
        FleetArn: FleetArn,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListWebsiteCertificateAuthoritiesRequest = {
      val __obj = js.Dynamic.literal(
        "FleetArn" -> FleetArn.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListWebsiteCertificateAuthoritiesRequest]
    }
  }

  @js.native
  trait ListWebsiteCertificateAuthoritiesResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var WebsiteCertificateAuthorities: js.UndefOr[WebsiteCaSummaryList]
  }

  object ListWebsiteCertificateAuthoritiesResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        WebsiteCertificateAuthorities: js.UndefOr[WebsiteCaSummaryList] = js.undefined
    ): ListWebsiteCertificateAuthoritiesResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      WebsiteCertificateAuthorities.foreach(__v =>
        __obj.updateDynamic("WebsiteCertificateAuthorities")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[ListWebsiteCertificateAuthoritiesResponse]
    }
  }

  @js.native
  trait RestoreDomainAccessRequest extends js.Object {
    var DomainName: DomainName
    var FleetArn: FleetArn
  }

  object RestoreDomainAccessRequest {
    @inline
    def apply(
        DomainName: DomainName,
        FleetArn: FleetArn
    ): RestoreDomainAccessRequest = {
      val __obj = js.Dynamic.literal(
        "DomainName" -> DomainName.asInstanceOf[js.Any],
        "FleetArn"   -> FleetArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[RestoreDomainAccessRequest]
    }
  }

  @js.native
  trait RestoreDomainAccessResponse extends js.Object {}

  object RestoreDomainAccessResponse {
    @inline
    def apply(
    ): RestoreDomainAccessResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[RestoreDomainAccessResponse]
    }
  }

  @js.native
  trait RevokeDomainAccessRequest extends js.Object {
    var DomainName: DomainName
    var FleetArn: FleetArn
  }

  object RevokeDomainAccessRequest {
    @inline
    def apply(
        DomainName: DomainName,
        FleetArn: FleetArn
    ): RevokeDomainAccessRequest = {
      val __obj = js.Dynamic.literal(
        "DomainName" -> DomainName.asInstanceOf[js.Any],
        "FleetArn"   -> FleetArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[RevokeDomainAccessRequest]
    }
  }

  @js.native
  trait RevokeDomainAccessResponse extends js.Object {}

  object RevokeDomainAccessResponse {
    @inline
    def apply(
    ): RevokeDomainAccessResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[RevokeDomainAccessResponse]
    }
  }

  @js.native
  trait SignOutUserRequest extends js.Object {
    var FleetArn: FleetArn
    var Username: Username
  }

  object SignOutUserRequest {
    @inline
    def apply(
        FleetArn: FleetArn,
        Username: Username
    ): SignOutUserRequest = {
      val __obj = js.Dynamic.literal(
        "FleetArn" -> FleetArn.asInstanceOf[js.Any],
        "Username" -> Username.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[SignOutUserRequest]
    }
  }

  @js.native
  trait SignOutUserResponse extends js.Object {}

  object SignOutUserResponse {
    @inline
    def apply(
    ): SignOutUserResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[SignOutUserResponse]
    }
  }

  @js.native
  trait UpdateAuditStreamConfigurationRequest extends js.Object {
    var FleetArn: FleetArn
    var AuditStreamArn: js.UndefOr[AuditStreamArn]
  }

  object UpdateAuditStreamConfigurationRequest {
    @inline
    def apply(
        FleetArn: FleetArn,
        AuditStreamArn: js.UndefOr[AuditStreamArn] = js.undefined
    ): UpdateAuditStreamConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "FleetArn" -> FleetArn.asInstanceOf[js.Any]
      )

      AuditStreamArn.foreach(__v => __obj.updateDynamic("AuditStreamArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateAuditStreamConfigurationRequest]
    }
  }

  @js.native
  trait UpdateAuditStreamConfigurationResponse extends js.Object {}

  object UpdateAuditStreamConfigurationResponse {
    @inline
    def apply(
    ): UpdateAuditStreamConfigurationResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[UpdateAuditStreamConfigurationResponse]
    }
  }

  @js.native
  trait UpdateCompanyNetworkConfigurationRequest extends js.Object {
    var FleetArn: FleetArn
    var SecurityGroupIds: SecurityGroupIds
    var SubnetIds: SubnetIds
    var VpcId: VpcId
  }

  object UpdateCompanyNetworkConfigurationRequest {
    @inline
    def apply(
        FleetArn: FleetArn,
        SecurityGroupIds: SecurityGroupIds,
        SubnetIds: SubnetIds,
        VpcId: VpcId
    ): UpdateCompanyNetworkConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "FleetArn"         -> FleetArn.asInstanceOf[js.Any],
        "SecurityGroupIds" -> SecurityGroupIds.asInstanceOf[js.Any],
        "SubnetIds"        -> SubnetIds.asInstanceOf[js.Any],
        "VpcId"            -> VpcId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UpdateCompanyNetworkConfigurationRequest]
    }
  }

  @js.native
  trait UpdateCompanyNetworkConfigurationResponse extends js.Object {}

  object UpdateCompanyNetworkConfigurationResponse {
    @inline
    def apply(
    ): UpdateCompanyNetworkConfigurationResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[UpdateCompanyNetworkConfigurationResponse]
    }
  }

  @js.native
  trait UpdateDevicePolicyConfigurationRequest extends js.Object {
    var FleetArn: FleetArn
    var DeviceCaCertificate: js.UndefOr[CertificateChain]
  }

  object UpdateDevicePolicyConfigurationRequest {
    @inline
    def apply(
        FleetArn: FleetArn,
        DeviceCaCertificate: js.UndefOr[CertificateChain] = js.undefined
    ): UpdateDevicePolicyConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "FleetArn" -> FleetArn.asInstanceOf[js.Any]
      )

      DeviceCaCertificate.foreach(__v => __obj.updateDynamic("DeviceCaCertificate")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateDevicePolicyConfigurationRequest]
    }
  }

  @js.native
  trait UpdateDevicePolicyConfigurationResponse extends js.Object {}

  object UpdateDevicePolicyConfigurationResponse {
    @inline
    def apply(
    ): UpdateDevicePolicyConfigurationResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[UpdateDevicePolicyConfigurationResponse]
    }
  }

  @js.native
  trait UpdateDomainMetadataRequest extends js.Object {
    var DomainName: DomainName
    var FleetArn: FleetArn
    var DisplayName: js.UndefOr[DisplayName]
  }

  object UpdateDomainMetadataRequest {
    @inline
    def apply(
        DomainName: DomainName,
        FleetArn: FleetArn,
        DisplayName: js.UndefOr[DisplayName] = js.undefined
    ): UpdateDomainMetadataRequest = {
      val __obj = js.Dynamic.literal(
        "DomainName" -> DomainName.asInstanceOf[js.Any],
        "FleetArn"   -> FleetArn.asInstanceOf[js.Any]
      )

      DisplayName.foreach(__v => __obj.updateDynamic("DisplayName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateDomainMetadataRequest]
    }
  }

  @js.native
  trait UpdateDomainMetadataResponse extends js.Object {}

  object UpdateDomainMetadataResponse {
    @inline
    def apply(
    ): UpdateDomainMetadataResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[UpdateDomainMetadataResponse]
    }
  }

  @js.native
  trait UpdateFleetMetadataRequest extends js.Object {
    var FleetArn: FleetArn
    var DisplayName: js.UndefOr[DisplayName]
    var OptimizeForEndUserLocation: js.UndefOr[Boolean]
  }

  object UpdateFleetMetadataRequest {
    @inline
    def apply(
        FleetArn: FleetArn,
        DisplayName: js.UndefOr[DisplayName] = js.undefined,
        OptimizeForEndUserLocation: js.UndefOr[Boolean] = js.undefined
    ): UpdateFleetMetadataRequest = {
      val __obj = js.Dynamic.literal(
        "FleetArn" -> FleetArn.asInstanceOf[js.Any]
      )

      DisplayName.foreach(__v => __obj.updateDynamic("DisplayName")(__v.asInstanceOf[js.Any]))
      OptimizeForEndUserLocation.foreach(__v =>
        __obj.updateDynamic("OptimizeForEndUserLocation")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[UpdateFleetMetadataRequest]
    }
  }

  @js.native
  trait UpdateFleetMetadataResponse extends js.Object {}

  object UpdateFleetMetadataResponse {
    @inline
    def apply(
    ): UpdateFleetMetadataResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[UpdateFleetMetadataResponse]
    }
  }

  @js.native
  trait UpdateIdentityProviderConfigurationRequest extends js.Object {
    var FleetArn: FleetArn
    var IdentityProviderType: IdentityProviderType
    var IdentityProviderSamlMetadata: js.UndefOr[SamlMetadata]
  }

  object UpdateIdentityProviderConfigurationRequest {
    @inline
    def apply(
        FleetArn: FleetArn,
        IdentityProviderType: IdentityProviderType,
        IdentityProviderSamlMetadata: js.UndefOr[SamlMetadata] = js.undefined
    ): UpdateIdentityProviderConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "FleetArn"             -> FleetArn.asInstanceOf[js.Any],
        "IdentityProviderType" -> IdentityProviderType.asInstanceOf[js.Any]
      )

      IdentityProviderSamlMetadata.foreach(__v =>
        __obj.updateDynamic("IdentityProviderSamlMetadata")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[UpdateIdentityProviderConfigurationRequest]
    }
  }

  @js.native
  trait UpdateIdentityProviderConfigurationResponse extends js.Object {}

  object UpdateIdentityProviderConfigurationResponse {
    @inline
    def apply(
    ): UpdateIdentityProviderConfigurationResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[UpdateIdentityProviderConfigurationResponse]
    }
  }

  /**
    * The summary of the website authorization provider.
    */
  @js.native
  trait WebsiteAuthorizationProviderSummary extends js.Object {
    var AuthorizationProviderType: AuthorizationProviderType
    var AuthorizationProviderId: js.UndefOr[Id]
    var CreatedTime: js.UndefOr[DateTime]
    var DomainName: js.UndefOr[DomainName]
  }

  object WebsiteAuthorizationProviderSummary {
    @inline
    def apply(
        AuthorizationProviderType: AuthorizationProviderType,
        AuthorizationProviderId: js.UndefOr[Id] = js.undefined,
        CreatedTime: js.UndefOr[DateTime] = js.undefined,
        DomainName: js.UndefOr[DomainName] = js.undefined
    ): WebsiteAuthorizationProviderSummary = {
      val __obj = js.Dynamic.literal(
        "AuthorizationProviderType" -> AuthorizationProviderType.asInstanceOf[js.Any]
      )

      AuthorizationProviderId.foreach(__v => __obj.updateDynamic("AuthorizationProviderId")(__v.asInstanceOf[js.Any]))
      CreatedTime.foreach(__v => __obj.updateDynamic("CreatedTime")(__v.asInstanceOf[js.Any]))
      DomainName.foreach(__v => __obj.updateDynamic("DomainName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[WebsiteAuthorizationProviderSummary]
    }
  }

  /**
    * The summary of the certificate authority (CA).
    */
  @js.native
  trait WebsiteCaSummary extends js.Object {
    var CreatedTime: js.UndefOr[DateTime]
    var DisplayName: js.UndefOr[DisplayName]
    var WebsiteCaId: js.UndefOr[Id]
  }

  object WebsiteCaSummary {
    @inline
    def apply(
        CreatedTime: js.UndefOr[DateTime] = js.undefined,
        DisplayName: js.UndefOr[DisplayName] = js.undefined,
        WebsiteCaId: js.UndefOr[Id] = js.undefined
    ): WebsiteCaSummary = {
      val __obj = js.Dynamic.literal()
      CreatedTime.foreach(__v => __obj.updateDynamic("CreatedTime")(__v.asInstanceOf[js.Any]))
      DisplayName.foreach(__v => __obj.updateDynamic("DisplayName")(__v.asInstanceOf[js.Any]))
      WebsiteCaId.foreach(__v => __obj.updateDynamic("WebsiteCaId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[WebsiteCaSummary]
    }
  }
}
