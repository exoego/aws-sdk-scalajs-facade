package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import scala.language.implicitConversions
import facade.amazonaws._

package object workspacesweb {
  type ARN = String
  type ArnList = js.Array[ARN]
  type BrowserPolicy = String
  type BrowserSettingsList = js.Array[BrowserSettingsSummary]
  type CertificateAuthorityBody = js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type CertificateList = js.Array[CertificateAuthorityBody]
  type CertificatePrincipal = String
  type CertificateSummaryList = js.Array[CertificateSummary]
  type CertificateThumbprint = String
  type CertificateThumbprintList = js.Array[CertificateThumbprint]
  type ClientToken = String
  type DisconnectTimeoutInMinutes = Int
  type DisplayName = String
  type EncryptionContextMap = js.Dictionary[StringType]
  type IdentityProviderDetails = js.Dictionary[StringType]
  type IdentityProviderList = js.Array[IdentityProviderSummary]
  type IdentityProviderName = String
  type IdleDisconnectTimeoutInMinutes = Int
  type KinesisStreamArn = String
  type MaxResults = Int
  type NetworkSettingsList = js.Array[NetworkSettingsSummary]
  type PaginationToken = String
  type PortalEndpoint = String
  type PortalList = js.Array[PortalSummary]
  type SamlMetadata = String
  type SecurityGroupId = String
  type SecurityGroupIdList = js.Array[SecurityGroupId]
  type StatusReason = String
  type StringType = String
  type SubnetId = String
  type SubnetIdList = js.Array[SubnetId]
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagList = js.Array[Tag]
  type TagValue = String
  type Timestamp = js.Date
  type TrustStoreSummaryList = js.Array[TrustStoreSummary]
  type UserAccessLoggingSettingsList = js.Array[UserAccessLoggingSettingsSummary]
  type UserSettingsList = js.Array[UserSettingsSummary]
  type VpcId = String
  type keyArn = String

  final class WorkSpacesWebOps(private val service: WorkSpacesWeb) extends AnyVal {

    @inline def associateBrowserSettingsFuture(params: AssociateBrowserSettingsRequest): Future[AssociateBrowserSettingsResponse] = service.associateBrowserSettings(params).promise().toFuture
    @inline def associateNetworkSettingsFuture(params: AssociateNetworkSettingsRequest): Future[AssociateNetworkSettingsResponse] = service.associateNetworkSettings(params).promise().toFuture
    @inline def associateTrustStoreFuture(params: AssociateTrustStoreRequest): Future[AssociateTrustStoreResponse] = service.associateTrustStore(params).promise().toFuture
    @inline def associateUserAccessLoggingSettingsFuture(params: AssociateUserAccessLoggingSettingsRequest): Future[AssociateUserAccessLoggingSettingsResponse] = service.associateUserAccessLoggingSettings(params).promise().toFuture
    @inline def associateUserSettingsFuture(params: AssociateUserSettingsRequest): Future[AssociateUserSettingsResponse] = service.associateUserSettings(params).promise().toFuture
    @inline def createBrowserSettingsFuture(params: CreateBrowserSettingsRequest): Future[CreateBrowserSettingsResponse] = service.createBrowserSettings(params).promise().toFuture
    @inline def createIdentityProviderFuture(params: CreateIdentityProviderRequest): Future[CreateIdentityProviderResponse] = service.createIdentityProvider(params).promise().toFuture
    @inline def createNetworkSettingsFuture(params: CreateNetworkSettingsRequest): Future[CreateNetworkSettingsResponse] = service.createNetworkSettings(params).promise().toFuture
    @inline def createPortalFuture(params: CreatePortalRequest): Future[CreatePortalResponse] = service.createPortal(params).promise().toFuture
    @inline def createTrustStoreFuture(params: CreateTrustStoreRequest): Future[CreateTrustStoreResponse] = service.createTrustStore(params).promise().toFuture
    @inline def createUserAccessLoggingSettingsFuture(params: CreateUserAccessLoggingSettingsRequest): Future[CreateUserAccessLoggingSettingsResponse] = service.createUserAccessLoggingSettings(params).promise().toFuture
    @inline def createUserSettingsFuture(params: CreateUserSettingsRequest): Future[CreateUserSettingsResponse] = service.createUserSettings(params).promise().toFuture
    @inline def deleteBrowserSettingsFuture(params: DeleteBrowserSettingsRequest): Future[DeleteBrowserSettingsResponse] = service.deleteBrowserSettings(params).promise().toFuture
    @inline def deleteIdentityProviderFuture(params: DeleteIdentityProviderRequest): Future[DeleteIdentityProviderResponse] = service.deleteIdentityProvider(params).promise().toFuture
    @inline def deleteNetworkSettingsFuture(params: DeleteNetworkSettingsRequest): Future[DeleteNetworkSettingsResponse] = service.deleteNetworkSettings(params).promise().toFuture
    @inline def deletePortalFuture(params: DeletePortalRequest): Future[DeletePortalResponse] = service.deletePortal(params).promise().toFuture
    @inline def deleteTrustStoreFuture(params: DeleteTrustStoreRequest): Future[DeleteTrustStoreResponse] = service.deleteTrustStore(params).promise().toFuture
    @inline def deleteUserAccessLoggingSettingsFuture(params: DeleteUserAccessLoggingSettingsRequest): Future[DeleteUserAccessLoggingSettingsResponse] = service.deleteUserAccessLoggingSettings(params).promise().toFuture
    @inline def deleteUserSettingsFuture(params: DeleteUserSettingsRequest): Future[DeleteUserSettingsResponse] = service.deleteUserSettings(params).promise().toFuture
    @inline def disassociateBrowserSettingsFuture(params: DisassociateBrowserSettingsRequest): Future[DisassociateBrowserSettingsResponse] = service.disassociateBrowserSettings(params).promise().toFuture
    @inline def disassociateNetworkSettingsFuture(params: DisassociateNetworkSettingsRequest): Future[DisassociateNetworkSettingsResponse] = service.disassociateNetworkSettings(params).promise().toFuture
    @inline def disassociateTrustStoreFuture(params: DisassociateTrustStoreRequest): Future[DisassociateTrustStoreResponse] = service.disassociateTrustStore(params).promise().toFuture
    @inline def disassociateUserAccessLoggingSettingsFuture(params: DisassociateUserAccessLoggingSettingsRequest): Future[DisassociateUserAccessLoggingSettingsResponse] = service.disassociateUserAccessLoggingSettings(params).promise().toFuture
    @inline def disassociateUserSettingsFuture(params: DisassociateUserSettingsRequest): Future[DisassociateUserSettingsResponse] = service.disassociateUserSettings(params).promise().toFuture
    @inline def getBrowserSettingsFuture(params: GetBrowserSettingsRequest): Future[GetBrowserSettingsResponse] = service.getBrowserSettings(params).promise().toFuture
    @inline def getIdentityProviderFuture(params: GetIdentityProviderRequest): Future[GetIdentityProviderResponse] = service.getIdentityProvider(params).promise().toFuture
    @inline def getNetworkSettingsFuture(params: GetNetworkSettingsRequest): Future[GetNetworkSettingsResponse] = service.getNetworkSettings(params).promise().toFuture
    @inline def getPortalFuture(params: GetPortalRequest): Future[GetPortalResponse] = service.getPortal(params).promise().toFuture
    @inline def getPortalServiceProviderMetadataFuture(params: GetPortalServiceProviderMetadataRequest): Future[GetPortalServiceProviderMetadataResponse] = service.getPortalServiceProviderMetadata(params).promise().toFuture
    @inline def getTrustStoreCertificateFuture(params: GetTrustStoreCertificateRequest): Future[GetTrustStoreCertificateResponse] = service.getTrustStoreCertificate(params).promise().toFuture
    @inline def getTrustStoreFuture(params: GetTrustStoreRequest): Future[GetTrustStoreResponse] = service.getTrustStore(params).promise().toFuture
    @inline def getUserAccessLoggingSettingsFuture(params: GetUserAccessLoggingSettingsRequest): Future[GetUserAccessLoggingSettingsResponse] = service.getUserAccessLoggingSettings(params).promise().toFuture
    @inline def getUserSettingsFuture(params: GetUserSettingsRequest): Future[GetUserSettingsResponse] = service.getUserSettings(params).promise().toFuture
    @inline def listBrowserSettingsFuture(params: ListBrowserSettingsRequest): Future[ListBrowserSettingsResponse] = service.listBrowserSettings(params).promise().toFuture
    @inline def listIdentityProvidersFuture(params: ListIdentityProvidersRequest): Future[ListIdentityProvidersResponse] = service.listIdentityProviders(params).promise().toFuture
    @inline def listNetworkSettingsFuture(params: ListNetworkSettingsRequest): Future[ListNetworkSettingsResponse] = service.listNetworkSettings(params).promise().toFuture
    @inline def listPortalsFuture(params: ListPortalsRequest): Future[ListPortalsResponse] = service.listPortals(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] = service.listTagsForResource(params).promise().toFuture
    @inline def listTrustStoreCertificatesFuture(params: ListTrustStoreCertificatesRequest): Future[ListTrustStoreCertificatesResponse] = service.listTrustStoreCertificates(params).promise().toFuture
    @inline def listTrustStoresFuture(params: ListTrustStoresRequest): Future[ListTrustStoresResponse] = service.listTrustStores(params).promise().toFuture
    @inline def listUserAccessLoggingSettingsFuture(params: ListUserAccessLoggingSettingsRequest): Future[ListUserAccessLoggingSettingsResponse] = service.listUserAccessLoggingSettings(params).promise().toFuture
    @inline def listUserSettingsFuture(params: ListUserSettingsRequest): Future[ListUserSettingsResponse] = service.listUserSettings(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] = service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] = service.untagResource(params).promise().toFuture
    @inline def updateBrowserSettingsFuture(params: UpdateBrowserSettingsRequest): Future[UpdateBrowserSettingsResponse] = service.updateBrowserSettings(params).promise().toFuture
    @inline def updateIdentityProviderFuture(params: UpdateIdentityProviderRequest): Future[UpdateIdentityProviderResponse] = service.updateIdentityProvider(params).promise().toFuture
    @inline def updateNetworkSettingsFuture(params: UpdateNetworkSettingsRequest): Future[UpdateNetworkSettingsResponse] = service.updateNetworkSettings(params).promise().toFuture
    @inline def updatePortalFuture(params: UpdatePortalRequest): Future[UpdatePortalResponse] = service.updatePortal(params).promise().toFuture
    @inline def updateTrustStoreFuture(params: UpdateTrustStoreRequest): Future[UpdateTrustStoreResponse] = service.updateTrustStore(params).promise().toFuture
    @inline def updateUserAccessLoggingSettingsFuture(params: UpdateUserAccessLoggingSettingsRequest): Future[UpdateUserAccessLoggingSettingsResponse] = service.updateUserAccessLoggingSettings(params).promise().toFuture
    @inline def updateUserSettingsFuture(params: UpdateUserSettingsRequest): Future[UpdateUserSettingsResponse] = service.updateUserSettings(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/workspacesweb", JSImport.Namespace, "AWS.WorkSpacesWeb")
  class WorkSpacesWeb() extends js.Object {
    def this(config: AWSConfig) = this()

    def associateBrowserSettings(params: AssociateBrowserSettingsRequest): Request[AssociateBrowserSettingsResponse] = js.native
    def associateNetworkSettings(params: AssociateNetworkSettingsRequest): Request[AssociateNetworkSettingsResponse] = js.native
    def associateTrustStore(params: AssociateTrustStoreRequest): Request[AssociateTrustStoreResponse] = js.native
    def associateUserAccessLoggingSettings(params: AssociateUserAccessLoggingSettingsRequest): Request[AssociateUserAccessLoggingSettingsResponse] = js.native
    def associateUserSettings(params: AssociateUserSettingsRequest): Request[AssociateUserSettingsResponse] = js.native
    def createBrowserSettings(params: CreateBrowserSettingsRequest): Request[CreateBrowserSettingsResponse] = js.native
    def createIdentityProvider(params: CreateIdentityProviderRequest): Request[CreateIdentityProviderResponse] = js.native
    def createNetworkSettings(params: CreateNetworkSettingsRequest): Request[CreateNetworkSettingsResponse] = js.native
    def createPortal(params: CreatePortalRequest): Request[CreatePortalResponse] = js.native
    def createTrustStore(params: CreateTrustStoreRequest): Request[CreateTrustStoreResponse] = js.native
    def createUserAccessLoggingSettings(params: CreateUserAccessLoggingSettingsRequest): Request[CreateUserAccessLoggingSettingsResponse] = js.native
    def createUserSettings(params: CreateUserSettingsRequest): Request[CreateUserSettingsResponse] = js.native
    def deleteBrowserSettings(params: DeleteBrowserSettingsRequest): Request[DeleteBrowserSettingsResponse] = js.native
    def deleteIdentityProvider(params: DeleteIdentityProviderRequest): Request[DeleteIdentityProviderResponse] = js.native
    def deleteNetworkSettings(params: DeleteNetworkSettingsRequest): Request[DeleteNetworkSettingsResponse] = js.native
    def deletePortal(params: DeletePortalRequest): Request[DeletePortalResponse] = js.native
    def deleteTrustStore(params: DeleteTrustStoreRequest): Request[DeleteTrustStoreResponse] = js.native
    def deleteUserAccessLoggingSettings(params: DeleteUserAccessLoggingSettingsRequest): Request[DeleteUserAccessLoggingSettingsResponse] = js.native
    def deleteUserSettings(params: DeleteUserSettingsRequest): Request[DeleteUserSettingsResponse] = js.native
    def disassociateBrowserSettings(params: DisassociateBrowserSettingsRequest): Request[DisassociateBrowserSettingsResponse] = js.native
    def disassociateNetworkSettings(params: DisassociateNetworkSettingsRequest): Request[DisassociateNetworkSettingsResponse] = js.native
    def disassociateTrustStore(params: DisassociateTrustStoreRequest): Request[DisassociateTrustStoreResponse] = js.native
    def disassociateUserAccessLoggingSettings(params: DisassociateUserAccessLoggingSettingsRequest): Request[DisassociateUserAccessLoggingSettingsResponse] = js.native
    def disassociateUserSettings(params: DisassociateUserSettingsRequest): Request[DisassociateUserSettingsResponse] = js.native
    def getBrowserSettings(params: GetBrowserSettingsRequest): Request[GetBrowserSettingsResponse] = js.native
    def getIdentityProvider(params: GetIdentityProviderRequest): Request[GetIdentityProviderResponse] = js.native
    def getNetworkSettings(params: GetNetworkSettingsRequest): Request[GetNetworkSettingsResponse] = js.native
    def getPortal(params: GetPortalRequest): Request[GetPortalResponse] = js.native
    def getPortalServiceProviderMetadata(params: GetPortalServiceProviderMetadataRequest): Request[GetPortalServiceProviderMetadataResponse] = js.native
    def getTrustStore(params: GetTrustStoreRequest): Request[GetTrustStoreResponse] = js.native
    def getTrustStoreCertificate(params: GetTrustStoreCertificateRequest): Request[GetTrustStoreCertificateResponse] = js.native
    def getUserAccessLoggingSettings(params: GetUserAccessLoggingSettingsRequest): Request[GetUserAccessLoggingSettingsResponse] = js.native
    def getUserSettings(params: GetUserSettingsRequest): Request[GetUserSettingsResponse] = js.native
    def listBrowserSettings(params: ListBrowserSettingsRequest): Request[ListBrowserSettingsResponse] = js.native
    def listIdentityProviders(params: ListIdentityProvidersRequest): Request[ListIdentityProvidersResponse] = js.native
    def listNetworkSettings(params: ListNetworkSettingsRequest): Request[ListNetworkSettingsResponse] = js.native
    def listPortals(params: ListPortalsRequest): Request[ListPortalsResponse] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def listTrustStoreCertificates(params: ListTrustStoreCertificatesRequest): Request[ListTrustStoreCertificatesResponse] = js.native
    def listTrustStores(params: ListTrustStoresRequest): Request[ListTrustStoresResponse] = js.native
    def listUserAccessLoggingSettings(params: ListUserAccessLoggingSettingsRequest): Request[ListUserAccessLoggingSettingsResponse] = js.native
    def listUserSettings(params: ListUserSettingsRequest): Request[ListUserSettingsResponse] = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse] = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse] = js.native
    def updateBrowserSettings(params: UpdateBrowserSettingsRequest): Request[UpdateBrowserSettingsResponse] = js.native
    def updateIdentityProvider(params: UpdateIdentityProviderRequest): Request[UpdateIdentityProviderResponse] = js.native
    def updateNetworkSettings(params: UpdateNetworkSettingsRequest): Request[UpdateNetworkSettingsResponse] = js.native
    def updatePortal(params: UpdatePortalRequest): Request[UpdatePortalResponse] = js.native
    def updateTrustStore(params: UpdateTrustStoreRequest): Request[UpdateTrustStoreResponse] = js.native
    def updateUserAccessLoggingSettings(params: UpdateUserAccessLoggingSettingsRequest): Request[UpdateUserAccessLoggingSettingsResponse] = js.native
    def updateUserSettings(params: UpdateUserSettingsRequest): Request[UpdateUserSettingsResponse] = js.native
  }
  object WorkSpacesWeb {
    @inline implicit def toOps(service: WorkSpacesWeb): WorkSpacesWebOps = {
      new WorkSpacesWebOps(service)
    }
  }

  @js.native
  trait AssociateBrowserSettingsRequest extends js.Object {
    var browserSettingsArn: ARN
    var portalArn: ARN
  }

  object AssociateBrowserSettingsRequest {
    @inline
    def apply(
        browserSettingsArn: ARN,
        portalArn: ARN
    ): AssociateBrowserSettingsRequest = {
      val __obj = js.Dynamic.literal(
        "browserSettingsArn" -> browserSettingsArn.asInstanceOf[js.Any],
        "portalArn" -> portalArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AssociateBrowserSettingsRequest]
    }
  }

  @js.native
  trait AssociateBrowserSettingsResponse extends js.Object {
    var browserSettingsArn: ARN
    var portalArn: ARN
  }

  object AssociateBrowserSettingsResponse {
    @inline
    def apply(
        browserSettingsArn: ARN,
        portalArn: ARN
    ): AssociateBrowserSettingsResponse = {
      val __obj = js.Dynamic.literal(
        "browserSettingsArn" -> browserSettingsArn.asInstanceOf[js.Any],
        "portalArn" -> portalArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AssociateBrowserSettingsResponse]
    }
  }

  @js.native
  trait AssociateNetworkSettingsRequest extends js.Object {
    var networkSettingsArn: ARN
    var portalArn: ARN
  }

  object AssociateNetworkSettingsRequest {
    @inline
    def apply(
        networkSettingsArn: ARN,
        portalArn: ARN
    ): AssociateNetworkSettingsRequest = {
      val __obj = js.Dynamic.literal(
        "networkSettingsArn" -> networkSettingsArn.asInstanceOf[js.Any],
        "portalArn" -> portalArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AssociateNetworkSettingsRequest]
    }
  }

  @js.native
  trait AssociateNetworkSettingsResponse extends js.Object {
    var networkSettingsArn: ARN
    var portalArn: ARN
  }

  object AssociateNetworkSettingsResponse {
    @inline
    def apply(
        networkSettingsArn: ARN,
        portalArn: ARN
    ): AssociateNetworkSettingsResponse = {
      val __obj = js.Dynamic.literal(
        "networkSettingsArn" -> networkSettingsArn.asInstanceOf[js.Any],
        "portalArn" -> portalArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AssociateNetworkSettingsResponse]
    }
  }

  @js.native
  trait AssociateTrustStoreRequest extends js.Object {
    var portalArn: ARN
    var trustStoreArn: ARN
  }

  object AssociateTrustStoreRequest {
    @inline
    def apply(
        portalArn: ARN,
        trustStoreArn: ARN
    ): AssociateTrustStoreRequest = {
      val __obj = js.Dynamic.literal(
        "portalArn" -> portalArn.asInstanceOf[js.Any],
        "trustStoreArn" -> trustStoreArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AssociateTrustStoreRequest]
    }
  }

  @js.native
  trait AssociateTrustStoreResponse extends js.Object {
    var portalArn: ARN
    var trustStoreArn: ARN
  }

  object AssociateTrustStoreResponse {
    @inline
    def apply(
        portalArn: ARN,
        trustStoreArn: ARN
    ): AssociateTrustStoreResponse = {
      val __obj = js.Dynamic.literal(
        "portalArn" -> portalArn.asInstanceOf[js.Any],
        "trustStoreArn" -> trustStoreArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AssociateTrustStoreResponse]
    }
  }

  @js.native
  trait AssociateUserAccessLoggingSettingsRequest extends js.Object {
    var portalArn: ARN
    var userAccessLoggingSettingsArn: ARN
  }

  object AssociateUserAccessLoggingSettingsRequest {
    @inline
    def apply(
        portalArn: ARN,
        userAccessLoggingSettingsArn: ARN
    ): AssociateUserAccessLoggingSettingsRequest = {
      val __obj = js.Dynamic.literal(
        "portalArn" -> portalArn.asInstanceOf[js.Any],
        "userAccessLoggingSettingsArn" -> userAccessLoggingSettingsArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AssociateUserAccessLoggingSettingsRequest]
    }
  }

  @js.native
  trait AssociateUserAccessLoggingSettingsResponse extends js.Object {
    var portalArn: ARN
    var userAccessLoggingSettingsArn: ARN
  }

  object AssociateUserAccessLoggingSettingsResponse {
    @inline
    def apply(
        portalArn: ARN,
        userAccessLoggingSettingsArn: ARN
    ): AssociateUserAccessLoggingSettingsResponse = {
      val __obj = js.Dynamic.literal(
        "portalArn" -> portalArn.asInstanceOf[js.Any],
        "userAccessLoggingSettingsArn" -> userAccessLoggingSettingsArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AssociateUserAccessLoggingSettingsResponse]
    }
  }

  @js.native
  trait AssociateUserSettingsRequest extends js.Object {
    var portalArn: ARN
    var userSettingsArn: ARN
  }

  object AssociateUserSettingsRequest {
    @inline
    def apply(
        portalArn: ARN,
        userSettingsArn: ARN
    ): AssociateUserSettingsRequest = {
      val __obj = js.Dynamic.literal(
        "portalArn" -> portalArn.asInstanceOf[js.Any],
        "userSettingsArn" -> userSettingsArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AssociateUserSettingsRequest]
    }
  }

  @js.native
  trait AssociateUserSettingsResponse extends js.Object {
    var portalArn: ARN
    var userSettingsArn: ARN
  }

  object AssociateUserSettingsResponse {
    @inline
    def apply(
        portalArn: ARN,
        userSettingsArn: ARN
    ): AssociateUserSettingsResponse = {
      val __obj = js.Dynamic.literal(
        "portalArn" -> portalArn.asInstanceOf[js.Any],
        "userSettingsArn" -> userSettingsArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AssociateUserSettingsResponse]
    }
  }

  /** The browser settings resource that can be associated with a web portal. Once associated with a web portal, browser settings control how the browser will behave once a user starts a streaming session for the web portal.
    */
  @js.native
  trait BrowserSettings extends js.Object {
    var browserSettingsArn: ARN
    var associatedPortalArns: js.UndefOr[ArnList]
    var browserPolicy: js.UndefOr[BrowserPolicy]
  }

  object BrowserSettings {
    @inline
    def apply(
        browserSettingsArn: ARN,
        associatedPortalArns: js.UndefOr[ArnList] = js.undefined,
        browserPolicy: js.UndefOr[BrowserPolicy] = js.undefined
    ): BrowserSettings = {
      val __obj = js.Dynamic.literal(
        "browserSettingsArn" -> browserSettingsArn.asInstanceOf[js.Any]
      )

      associatedPortalArns.foreach(__v => __obj.updateDynamic("associatedPortalArns")(__v.asInstanceOf[js.Any]))
      browserPolicy.foreach(__v => __obj.updateDynamic("browserPolicy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BrowserSettings]
    }
  }

  /** The summary for browser settings.
    */
  @js.native
  trait BrowserSettingsSummary extends js.Object {
    var browserSettingsArn: js.UndefOr[ARN]
  }

  object BrowserSettingsSummary {
    @inline
    def apply(
        browserSettingsArn: js.UndefOr[ARN] = js.undefined
    ): BrowserSettingsSummary = {
      val __obj = js.Dynamic.literal()
      browserSettingsArn.foreach(__v => __obj.updateDynamic("browserSettingsArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BrowserSettingsSummary]
    }
  }

  /** The certificate.
    */
  @js.native
  trait Certificate extends js.Object {
    var body: js.UndefOr[CertificateAuthorityBody]
    var issuer: js.UndefOr[CertificatePrincipal]
    var notValidAfter: js.UndefOr[Timestamp]
    var notValidBefore: js.UndefOr[Timestamp]
    var subject: js.UndefOr[CertificatePrincipal]
    var thumbprint: js.UndefOr[CertificateThumbprint]
  }

  object Certificate {
    @inline
    def apply(
        body: js.UndefOr[CertificateAuthorityBody] = js.undefined,
        issuer: js.UndefOr[CertificatePrincipal] = js.undefined,
        notValidAfter: js.UndefOr[Timestamp] = js.undefined,
        notValidBefore: js.UndefOr[Timestamp] = js.undefined,
        subject: js.UndefOr[CertificatePrincipal] = js.undefined,
        thumbprint: js.UndefOr[CertificateThumbprint] = js.undefined
    ): Certificate = {
      val __obj = js.Dynamic.literal()
      body.foreach(__v => __obj.updateDynamic("body")(__v.asInstanceOf[js.Any]))
      issuer.foreach(__v => __obj.updateDynamic("issuer")(__v.asInstanceOf[js.Any]))
      notValidAfter.foreach(__v => __obj.updateDynamic("notValidAfter")(__v.asInstanceOf[js.Any]))
      notValidBefore.foreach(__v => __obj.updateDynamic("notValidBefore")(__v.asInstanceOf[js.Any]))
      subject.foreach(__v => __obj.updateDynamic("subject")(__v.asInstanceOf[js.Any]))
      thumbprint.foreach(__v => __obj.updateDynamic("thumbprint")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Certificate]
    }
  }

  /** The summary of the certificate.
    */
  @js.native
  trait CertificateSummary extends js.Object {
    var issuer: js.UndefOr[CertificatePrincipal]
    var notValidAfter: js.UndefOr[Timestamp]
    var notValidBefore: js.UndefOr[Timestamp]
    var subject: js.UndefOr[CertificatePrincipal]
    var thumbprint: js.UndefOr[CertificateThumbprint]
  }

  object CertificateSummary {
    @inline
    def apply(
        issuer: js.UndefOr[CertificatePrincipal] = js.undefined,
        notValidAfter: js.UndefOr[Timestamp] = js.undefined,
        notValidBefore: js.UndefOr[Timestamp] = js.undefined,
        subject: js.UndefOr[CertificatePrincipal] = js.undefined,
        thumbprint: js.UndefOr[CertificateThumbprint] = js.undefined
    ): CertificateSummary = {
      val __obj = js.Dynamic.literal()
      issuer.foreach(__v => __obj.updateDynamic("issuer")(__v.asInstanceOf[js.Any]))
      notValidAfter.foreach(__v => __obj.updateDynamic("notValidAfter")(__v.asInstanceOf[js.Any]))
      notValidBefore.foreach(__v => __obj.updateDynamic("notValidBefore")(__v.asInstanceOf[js.Any]))
      subject.foreach(__v => __obj.updateDynamic("subject")(__v.asInstanceOf[js.Any]))
      thumbprint.foreach(__v => __obj.updateDynamic("thumbprint")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CertificateSummary]
    }
  }

  @js.native
  trait CreateBrowserSettingsRequest extends js.Object {
    var browserPolicy: BrowserPolicy
    var additionalEncryptionContext: js.UndefOr[EncryptionContextMap]
    var clientToken: js.UndefOr[ClientToken]
    var customerManagedKey: js.UndefOr[keyArn]
    var tags: js.UndefOr[TagList]
  }

  object CreateBrowserSettingsRequest {
    @inline
    def apply(
        browserPolicy: BrowserPolicy,
        additionalEncryptionContext: js.UndefOr[EncryptionContextMap] = js.undefined,
        clientToken: js.UndefOr[ClientToken] = js.undefined,
        customerManagedKey: js.UndefOr[keyArn] = js.undefined,
        tags: js.UndefOr[TagList] = js.undefined
    ): CreateBrowserSettingsRequest = {
      val __obj = js.Dynamic.literal(
        "browserPolicy" -> browserPolicy.asInstanceOf[js.Any]
      )

      additionalEncryptionContext.foreach(__v => __obj.updateDynamic("additionalEncryptionContext")(__v.asInstanceOf[js.Any]))
      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      customerManagedKey.foreach(__v => __obj.updateDynamic("customerManagedKey")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateBrowserSettingsRequest]
    }
  }

  @js.native
  trait CreateBrowserSettingsResponse extends js.Object {
    var browserSettingsArn: ARN
  }

  object CreateBrowserSettingsResponse {
    @inline
    def apply(
        browserSettingsArn: ARN
    ): CreateBrowserSettingsResponse = {
      val __obj = js.Dynamic.literal(
        "browserSettingsArn" -> browserSettingsArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateBrowserSettingsResponse]
    }
  }

  @js.native
  trait CreateIdentityProviderRequest extends js.Object {
    var identityProviderDetails: IdentityProviderDetails
    var identityProviderName: IdentityProviderName
    var identityProviderType: IdentityProviderType
    var portalArn: ARN
    var clientToken: js.UndefOr[ClientToken]
  }

  object CreateIdentityProviderRequest {
    @inline
    def apply(
        identityProviderDetails: IdentityProviderDetails,
        identityProviderName: IdentityProviderName,
        identityProviderType: IdentityProviderType,
        portalArn: ARN,
        clientToken: js.UndefOr[ClientToken] = js.undefined
    ): CreateIdentityProviderRequest = {
      val __obj = js.Dynamic.literal(
        "identityProviderDetails" -> identityProviderDetails.asInstanceOf[js.Any],
        "identityProviderName" -> identityProviderName.asInstanceOf[js.Any],
        "identityProviderType" -> identityProviderType.asInstanceOf[js.Any],
        "portalArn" -> portalArn.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateIdentityProviderRequest]
    }
  }

  @js.native
  trait CreateIdentityProviderResponse extends js.Object {
    var identityProviderArn: ARN
  }

  object CreateIdentityProviderResponse {
    @inline
    def apply(
        identityProviderArn: ARN
    ): CreateIdentityProviderResponse = {
      val __obj = js.Dynamic.literal(
        "identityProviderArn" -> identityProviderArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateIdentityProviderResponse]
    }
  }

  @js.native
  trait CreateNetworkSettingsRequest extends js.Object {
    var securityGroupIds: SecurityGroupIdList
    var subnetIds: SubnetIdList
    var vpcId: VpcId
    var clientToken: js.UndefOr[ClientToken]
    var tags: js.UndefOr[TagList]
  }

  object CreateNetworkSettingsRequest {
    @inline
    def apply(
        securityGroupIds: SecurityGroupIdList,
        subnetIds: SubnetIdList,
        vpcId: VpcId,
        clientToken: js.UndefOr[ClientToken] = js.undefined,
        tags: js.UndefOr[TagList] = js.undefined
    ): CreateNetworkSettingsRequest = {
      val __obj = js.Dynamic.literal(
        "securityGroupIds" -> securityGroupIds.asInstanceOf[js.Any],
        "subnetIds" -> subnetIds.asInstanceOf[js.Any],
        "vpcId" -> vpcId.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateNetworkSettingsRequest]
    }
  }

  @js.native
  trait CreateNetworkSettingsResponse extends js.Object {
    var networkSettingsArn: ARN
  }

  object CreateNetworkSettingsResponse {
    @inline
    def apply(
        networkSettingsArn: ARN
    ): CreateNetworkSettingsResponse = {
      val __obj = js.Dynamic.literal(
        "networkSettingsArn" -> networkSettingsArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateNetworkSettingsResponse]
    }
  }

  @js.native
  trait CreatePortalRequest extends js.Object {
    var additionalEncryptionContext: js.UndefOr[EncryptionContextMap]
    var clientToken: js.UndefOr[ClientToken]
    var customerManagedKey: js.UndefOr[keyArn]
    var displayName: js.UndefOr[DisplayName]
    var tags: js.UndefOr[TagList]
  }

  object CreatePortalRequest {
    @inline
    def apply(
        additionalEncryptionContext: js.UndefOr[EncryptionContextMap] = js.undefined,
        clientToken: js.UndefOr[ClientToken] = js.undefined,
        customerManagedKey: js.UndefOr[keyArn] = js.undefined,
        displayName: js.UndefOr[DisplayName] = js.undefined,
        tags: js.UndefOr[TagList] = js.undefined
    ): CreatePortalRequest = {
      val __obj = js.Dynamic.literal()
      additionalEncryptionContext.foreach(__v => __obj.updateDynamic("additionalEncryptionContext")(__v.asInstanceOf[js.Any]))
      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      customerManagedKey.foreach(__v => __obj.updateDynamic("customerManagedKey")(__v.asInstanceOf[js.Any]))
      displayName.foreach(__v => __obj.updateDynamic("displayName")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreatePortalRequest]
    }
  }

  @js.native
  trait CreatePortalResponse extends js.Object {
    var portalArn: ARN
    var portalEndpoint: PortalEndpoint
  }

  object CreatePortalResponse {
    @inline
    def apply(
        portalArn: ARN,
        portalEndpoint: PortalEndpoint
    ): CreatePortalResponse = {
      val __obj = js.Dynamic.literal(
        "portalArn" -> portalArn.asInstanceOf[js.Any],
        "portalEndpoint" -> portalEndpoint.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreatePortalResponse]
    }
  }

  @js.native
  trait CreateTrustStoreRequest extends js.Object {
    var certificateList: CertificateList
    var clientToken: js.UndefOr[ClientToken]
    var tags: js.UndefOr[TagList]
  }

  object CreateTrustStoreRequest {
    @inline
    def apply(
        certificateList: CertificateList,
        clientToken: js.UndefOr[ClientToken] = js.undefined,
        tags: js.UndefOr[TagList] = js.undefined
    ): CreateTrustStoreRequest = {
      val __obj = js.Dynamic.literal(
        "certificateList" -> certificateList.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateTrustStoreRequest]
    }
  }

  @js.native
  trait CreateTrustStoreResponse extends js.Object {
    var trustStoreArn: ARN
  }

  object CreateTrustStoreResponse {
    @inline
    def apply(
        trustStoreArn: ARN
    ): CreateTrustStoreResponse = {
      val __obj = js.Dynamic.literal(
        "trustStoreArn" -> trustStoreArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateTrustStoreResponse]
    }
  }

  @js.native
  trait CreateUserAccessLoggingSettingsRequest extends js.Object {
    var kinesisStreamArn: KinesisStreamArn
    var clientToken: js.UndefOr[ClientToken]
    var tags: js.UndefOr[TagList]
  }

  object CreateUserAccessLoggingSettingsRequest {
    @inline
    def apply(
        kinesisStreamArn: KinesisStreamArn,
        clientToken: js.UndefOr[ClientToken] = js.undefined,
        tags: js.UndefOr[TagList] = js.undefined
    ): CreateUserAccessLoggingSettingsRequest = {
      val __obj = js.Dynamic.literal(
        "kinesisStreamArn" -> kinesisStreamArn.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateUserAccessLoggingSettingsRequest]
    }
  }

  @js.native
  trait CreateUserAccessLoggingSettingsResponse extends js.Object {
    var userAccessLoggingSettingsArn: ARN
  }

  object CreateUserAccessLoggingSettingsResponse {
    @inline
    def apply(
        userAccessLoggingSettingsArn: ARN
    ): CreateUserAccessLoggingSettingsResponse = {
      val __obj = js.Dynamic.literal(
        "userAccessLoggingSettingsArn" -> userAccessLoggingSettingsArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateUserAccessLoggingSettingsResponse]
    }
  }

  @js.native
  trait CreateUserSettingsRequest extends js.Object {
    var copyAllowed: EnabledType
    var downloadAllowed: EnabledType
    var pasteAllowed: EnabledType
    var printAllowed: EnabledType
    var uploadAllowed: EnabledType
    var clientToken: js.UndefOr[ClientToken]
    var disconnectTimeoutInMinutes: js.UndefOr[DisconnectTimeoutInMinutes]
    var idleDisconnectTimeoutInMinutes: js.UndefOr[IdleDisconnectTimeoutInMinutes]
    var tags: js.UndefOr[TagList]
  }

  object CreateUserSettingsRequest {
    @inline
    def apply(
        copyAllowed: EnabledType,
        downloadAllowed: EnabledType,
        pasteAllowed: EnabledType,
        printAllowed: EnabledType,
        uploadAllowed: EnabledType,
        clientToken: js.UndefOr[ClientToken] = js.undefined,
        disconnectTimeoutInMinutes: js.UndefOr[DisconnectTimeoutInMinutes] = js.undefined,
        idleDisconnectTimeoutInMinutes: js.UndefOr[IdleDisconnectTimeoutInMinutes] = js.undefined,
        tags: js.UndefOr[TagList] = js.undefined
    ): CreateUserSettingsRequest = {
      val __obj = js.Dynamic.literal(
        "copyAllowed" -> copyAllowed.asInstanceOf[js.Any],
        "downloadAllowed" -> downloadAllowed.asInstanceOf[js.Any],
        "pasteAllowed" -> pasteAllowed.asInstanceOf[js.Any],
        "printAllowed" -> printAllowed.asInstanceOf[js.Any],
        "uploadAllowed" -> uploadAllowed.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      disconnectTimeoutInMinutes.foreach(__v => __obj.updateDynamic("disconnectTimeoutInMinutes")(__v.asInstanceOf[js.Any]))
      idleDisconnectTimeoutInMinutes.foreach(__v => __obj.updateDynamic("idleDisconnectTimeoutInMinutes")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateUserSettingsRequest]
    }
  }

  @js.native
  trait CreateUserSettingsResponse extends js.Object {
    var userSettingsArn: ARN
  }

  object CreateUserSettingsResponse {
    @inline
    def apply(
        userSettingsArn: ARN
    ): CreateUserSettingsResponse = {
      val __obj = js.Dynamic.literal(
        "userSettingsArn" -> userSettingsArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateUserSettingsResponse]
    }
  }

  @js.native
  trait DeleteBrowserSettingsRequest extends js.Object {
    var browserSettingsArn: ARN
  }

  object DeleteBrowserSettingsRequest {
    @inline
    def apply(
        browserSettingsArn: ARN
    ): DeleteBrowserSettingsRequest = {
      val __obj = js.Dynamic.literal(
        "browserSettingsArn" -> browserSettingsArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteBrowserSettingsRequest]
    }
  }

  @js.native
  trait DeleteBrowserSettingsResponse extends js.Object

  object DeleteBrowserSettingsResponse {
    @inline
    def apply(): DeleteBrowserSettingsResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteBrowserSettingsResponse]
    }
  }

  @js.native
  trait DeleteIdentityProviderRequest extends js.Object {
    var identityProviderArn: ARN
  }

  object DeleteIdentityProviderRequest {
    @inline
    def apply(
        identityProviderArn: ARN
    ): DeleteIdentityProviderRequest = {
      val __obj = js.Dynamic.literal(
        "identityProviderArn" -> identityProviderArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteIdentityProviderRequest]
    }
  }

  @js.native
  trait DeleteIdentityProviderResponse extends js.Object

  object DeleteIdentityProviderResponse {
    @inline
    def apply(): DeleteIdentityProviderResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteIdentityProviderResponse]
    }
  }

  @js.native
  trait DeleteNetworkSettingsRequest extends js.Object {
    var networkSettingsArn: ARN
  }

  object DeleteNetworkSettingsRequest {
    @inline
    def apply(
        networkSettingsArn: ARN
    ): DeleteNetworkSettingsRequest = {
      val __obj = js.Dynamic.literal(
        "networkSettingsArn" -> networkSettingsArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteNetworkSettingsRequest]
    }
  }

  @js.native
  trait DeleteNetworkSettingsResponse extends js.Object

  object DeleteNetworkSettingsResponse {
    @inline
    def apply(): DeleteNetworkSettingsResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteNetworkSettingsResponse]
    }
  }

  @js.native
  trait DeletePortalRequest extends js.Object {
    var portalArn: ARN
  }

  object DeletePortalRequest {
    @inline
    def apply(
        portalArn: ARN
    ): DeletePortalRequest = {
      val __obj = js.Dynamic.literal(
        "portalArn" -> portalArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeletePortalRequest]
    }
  }

  @js.native
  trait DeletePortalResponse extends js.Object

  object DeletePortalResponse {
    @inline
    def apply(): DeletePortalResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeletePortalResponse]
    }
  }

  @js.native
  trait DeleteTrustStoreRequest extends js.Object {
    var trustStoreArn: ARN
  }

  object DeleteTrustStoreRequest {
    @inline
    def apply(
        trustStoreArn: ARN
    ): DeleteTrustStoreRequest = {
      val __obj = js.Dynamic.literal(
        "trustStoreArn" -> trustStoreArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteTrustStoreRequest]
    }
  }

  @js.native
  trait DeleteTrustStoreResponse extends js.Object

  object DeleteTrustStoreResponse {
    @inline
    def apply(): DeleteTrustStoreResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteTrustStoreResponse]
    }
  }

  @js.native
  trait DeleteUserAccessLoggingSettingsRequest extends js.Object {
    var userAccessLoggingSettingsArn: ARN
  }

  object DeleteUserAccessLoggingSettingsRequest {
    @inline
    def apply(
        userAccessLoggingSettingsArn: ARN
    ): DeleteUserAccessLoggingSettingsRequest = {
      val __obj = js.Dynamic.literal(
        "userAccessLoggingSettingsArn" -> userAccessLoggingSettingsArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteUserAccessLoggingSettingsRequest]
    }
  }

  @js.native
  trait DeleteUserAccessLoggingSettingsResponse extends js.Object

  object DeleteUserAccessLoggingSettingsResponse {
    @inline
    def apply(): DeleteUserAccessLoggingSettingsResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteUserAccessLoggingSettingsResponse]
    }
  }

  @js.native
  trait DeleteUserSettingsRequest extends js.Object {
    var userSettingsArn: ARN
  }

  object DeleteUserSettingsRequest {
    @inline
    def apply(
        userSettingsArn: ARN
    ): DeleteUserSettingsRequest = {
      val __obj = js.Dynamic.literal(
        "userSettingsArn" -> userSettingsArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteUserSettingsRequest]
    }
  }

  @js.native
  trait DeleteUserSettingsResponse extends js.Object

  object DeleteUserSettingsResponse {
    @inline
    def apply(): DeleteUserSettingsResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteUserSettingsResponse]
    }
  }

  @js.native
  trait DisassociateBrowserSettingsRequest extends js.Object {
    var portalArn: ARN
  }

  object DisassociateBrowserSettingsRequest {
    @inline
    def apply(
        portalArn: ARN
    ): DisassociateBrowserSettingsRequest = {
      val __obj = js.Dynamic.literal(
        "portalArn" -> portalArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DisassociateBrowserSettingsRequest]
    }
  }

  @js.native
  trait DisassociateBrowserSettingsResponse extends js.Object

  object DisassociateBrowserSettingsResponse {
    @inline
    def apply(): DisassociateBrowserSettingsResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DisassociateBrowserSettingsResponse]
    }
  }

  @js.native
  trait DisassociateNetworkSettingsRequest extends js.Object {
    var portalArn: ARN
  }

  object DisassociateNetworkSettingsRequest {
    @inline
    def apply(
        portalArn: ARN
    ): DisassociateNetworkSettingsRequest = {
      val __obj = js.Dynamic.literal(
        "portalArn" -> portalArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DisassociateNetworkSettingsRequest]
    }
  }

  @js.native
  trait DisassociateNetworkSettingsResponse extends js.Object

  object DisassociateNetworkSettingsResponse {
    @inline
    def apply(): DisassociateNetworkSettingsResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DisassociateNetworkSettingsResponse]
    }
  }

  @js.native
  trait DisassociateTrustStoreRequest extends js.Object {
    var portalArn: ARN
  }

  object DisassociateTrustStoreRequest {
    @inline
    def apply(
        portalArn: ARN
    ): DisassociateTrustStoreRequest = {
      val __obj = js.Dynamic.literal(
        "portalArn" -> portalArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DisassociateTrustStoreRequest]
    }
  }

  @js.native
  trait DisassociateTrustStoreResponse extends js.Object

  object DisassociateTrustStoreResponse {
    @inline
    def apply(): DisassociateTrustStoreResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DisassociateTrustStoreResponse]
    }
  }

  @js.native
  trait DisassociateUserAccessLoggingSettingsRequest extends js.Object {
    var portalArn: ARN
  }

  object DisassociateUserAccessLoggingSettingsRequest {
    @inline
    def apply(
        portalArn: ARN
    ): DisassociateUserAccessLoggingSettingsRequest = {
      val __obj = js.Dynamic.literal(
        "portalArn" -> portalArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DisassociateUserAccessLoggingSettingsRequest]
    }
  }

  @js.native
  trait DisassociateUserAccessLoggingSettingsResponse extends js.Object

  object DisassociateUserAccessLoggingSettingsResponse {
    @inline
    def apply(): DisassociateUserAccessLoggingSettingsResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DisassociateUserAccessLoggingSettingsResponse]
    }
  }

  @js.native
  trait DisassociateUserSettingsRequest extends js.Object {
    var portalArn: ARN
  }

  object DisassociateUserSettingsRequest {
    @inline
    def apply(
        portalArn: ARN
    ): DisassociateUserSettingsRequest = {
      val __obj = js.Dynamic.literal(
        "portalArn" -> portalArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DisassociateUserSettingsRequest]
    }
  }

  @js.native
  trait DisassociateUserSettingsResponse extends js.Object

  object DisassociateUserSettingsResponse {
    @inline
    def apply(): DisassociateUserSettingsResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DisassociateUserSettingsResponse]
    }
  }

  @js.native
  trait GetBrowserSettingsRequest extends js.Object {
    var browserSettingsArn: ARN
  }

  object GetBrowserSettingsRequest {
    @inline
    def apply(
        browserSettingsArn: ARN
    ): GetBrowserSettingsRequest = {
      val __obj = js.Dynamic.literal(
        "browserSettingsArn" -> browserSettingsArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetBrowserSettingsRequest]
    }
  }

  @js.native
  trait GetBrowserSettingsResponse extends js.Object {
    var browserSettings: js.UndefOr[BrowserSettings]
  }

  object GetBrowserSettingsResponse {
    @inline
    def apply(
        browserSettings: js.UndefOr[BrowserSettings] = js.undefined
    ): GetBrowserSettingsResponse = {
      val __obj = js.Dynamic.literal()
      browserSettings.foreach(__v => __obj.updateDynamic("browserSettings")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetBrowserSettingsResponse]
    }
  }

  @js.native
  trait GetIdentityProviderRequest extends js.Object {
    var identityProviderArn: ARN
  }

  object GetIdentityProviderRequest {
    @inline
    def apply(
        identityProviderArn: ARN
    ): GetIdentityProviderRequest = {
      val __obj = js.Dynamic.literal(
        "identityProviderArn" -> identityProviderArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetIdentityProviderRequest]
    }
  }

  @js.native
  trait GetIdentityProviderResponse extends js.Object {
    var identityProvider: js.UndefOr[IdentityProvider]
  }

  object GetIdentityProviderResponse {
    @inline
    def apply(
        identityProvider: js.UndefOr[IdentityProvider] = js.undefined
    ): GetIdentityProviderResponse = {
      val __obj = js.Dynamic.literal()
      identityProvider.foreach(__v => __obj.updateDynamic("identityProvider")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetIdentityProviderResponse]
    }
  }

  @js.native
  trait GetNetworkSettingsRequest extends js.Object {
    var networkSettingsArn: ARN
  }

  object GetNetworkSettingsRequest {
    @inline
    def apply(
        networkSettingsArn: ARN
    ): GetNetworkSettingsRequest = {
      val __obj = js.Dynamic.literal(
        "networkSettingsArn" -> networkSettingsArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetNetworkSettingsRequest]
    }
  }

  @js.native
  trait GetNetworkSettingsResponse extends js.Object {
    var networkSettings: js.UndefOr[NetworkSettings]
  }

  object GetNetworkSettingsResponse {
    @inline
    def apply(
        networkSettings: js.UndefOr[NetworkSettings] = js.undefined
    ): GetNetworkSettingsResponse = {
      val __obj = js.Dynamic.literal()
      networkSettings.foreach(__v => __obj.updateDynamic("networkSettings")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetNetworkSettingsResponse]
    }
  }

  @js.native
  trait GetPortalRequest extends js.Object {
    var portalArn: ARN
  }

  object GetPortalRequest {
    @inline
    def apply(
        portalArn: ARN
    ): GetPortalRequest = {
      val __obj = js.Dynamic.literal(
        "portalArn" -> portalArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetPortalRequest]
    }
  }

  @js.native
  trait GetPortalResponse extends js.Object {
    var portal: js.UndefOr[Portal]
  }

  object GetPortalResponse {
    @inline
    def apply(
        portal: js.UndefOr[Portal] = js.undefined
    ): GetPortalResponse = {
      val __obj = js.Dynamic.literal()
      portal.foreach(__v => __obj.updateDynamic("portal")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetPortalResponse]
    }
  }

  @js.native
  trait GetPortalServiceProviderMetadataRequest extends js.Object {
    var portalArn: ARN
  }

  object GetPortalServiceProviderMetadataRequest {
    @inline
    def apply(
        portalArn: ARN
    ): GetPortalServiceProviderMetadataRequest = {
      val __obj = js.Dynamic.literal(
        "portalArn" -> portalArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetPortalServiceProviderMetadataRequest]
    }
  }

  @js.native
  trait GetPortalServiceProviderMetadataResponse extends js.Object {
    var portalArn: ARN
    var serviceProviderSamlMetadata: js.UndefOr[SamlMetadata]
  }

  object GetPortalServiceProviderMetadataResponse {
    @inline
    def apply(
        portalArn: ARN,
        serviceProviderSamlMetadata: js.UndefOr[SamlMetadata] = js.undefined
    ): GetPortalServiceProviderMetadataResponse = {
      val __obj = js.Dynamic.literal(
        "portalArn" -> portalArn.asInstanceOf[js.Any]
      )

      serviceProviderSamlMetadata.foreach(__v => __obj.updateDynamic("serviceProviderSamlMetadata")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetPortalServiceProviderMetadataResponse]
    }
  }

  @js.native
  trait GetTrustStoreCertificateRequest extends js.Object {
    var thumbprint: CertificateThumbprint
    var trustStoreArn: ARN
  }

  object GetTrustStoreCertificateRequest {
    @inline
    def apply(
        thumbprint: CertificateThumbprint,
        trustStoreArn: ARN
    ): GetTrustStoreCertificateRequest = {
      val __obj = js.Dynamic.literal(
        "thumbprint" -> thumbprint.asInstanceOf[js.Any],
        "trustStoreArn" -> trustStoreArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetTrustStoreCertificateRequest]
    }
  }

  @js.native
  trait GetTrustStoreCertificateResponse extends js.Object {
    var certificate: js.UndefOr[Certificate]
    var trustStoreArn: js.UndefOr[ARN]
  }

  object GetTrustStoreCertificateResponse {
    @inline
    def apply(
        certificate: js.UndefOr[Certificate] = js.undefined,
        trustStoreArn: js.UndefOr[ARN] = js.undefined
    ): GetTrustStoreCertificateResponse = {
      val __obj = js.Dynamic.literal()
      certificate.foreach(__v => __obj.updateDynamic("certificate")(__v.asInstanceOf[js.Any]))
      trustStoreArn.foreach(__v => __obj.updateDynamic("trustStoreArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetTrustStoreCertificateResponse]
    }
  }

  @js.native
  trait GetTrustStoreRequest extends js.Object {
    var trustStoreArn: ARN
  }

  object GetTrustStoreRequest {
    @inline
    def apply(
        trustStoreArn: ARN
    ): GetTrustStoreRequest = {
      val __obj = js.Dynamic.literal(
        "trustStoreArn" -> trustStoreArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetTrustStoreRequest]
    }
  }

  @js.native
  trait GetTrustStoreResponse extends js.Object {
    var trustStore: js.UndefOr[TrustStore]
  }

  object GetTrustStoreResponse {
    @inline
    def apply(
        trustStore: js.UndefOr[TrustStore] = js.undefined
    ): GetTrustStoreResponse = {
      val __obj = js.Dynamic.literal()
      trustStore.foreach(__v => __obj.updateDynamic("trustStore")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetTrustStoreResponse]
    }
  }

  @js.native
  trait GetUserAccessLoggingSettingsRequest extends js.Object {
    var userAccessLoggingSettingsArn: ARN
  }

  object GetUserAccessLoggingSettingsRequest {
    @inline
    def apply(
        userAccessLoggingSettingsArn: ARN
    ): GetUserAccessLoggingSettingsRequest = {
      val __obj = js.Dynamic.literal(
        "userAccessLoggingSettingsArn" -> userAccessLoggingSettingsArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetUserAccessLoggingSettingsRequest]
    }
  }

  @js.native
  trait GetUserAccessLoggingSettingsResponse extends js.Object {
    var userAccessLoggingSettings: js.UndefOr[UserAccessLoggingSettings]
  }

  object GetUserAccessLoggingSettingsResponse {
    @inline
    def apply(
        userAccessLoggingSettings: js.UndefOr[UserAccessLoggingSettings] = js.undefined
    ): GetUserAccessLoggingSettingsResponse = {
      val __obj = js.Dynamic.literal()
      userAccessLoggingSettings.foreach(__v => __obj.updateDynamic("userAccessLoggingSettings")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetUserAccessLoggingSettingsResponse]
    }
  }

  @js.native
  trait GetUserSettingsRequest extends js.Object {
    var userSettingsArn: ARN
  }

  object GetUserSettingsRequest {
    @inline
    def apply(
        userSettingsArn: ARN
    ): GetUserSettingsRequest = {
      val __obj = js.Dynamic.literal(
        "userSettingsArn" -> userSettingsArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetUserSettingsRequest]
    }
  }

  @js.native
  trait GetUserSettingsResponse extends js.Object {
    var userSettings: js.UndefOr[UserSettings]
  }

  object GetUserSettingsResponse {
    @inline
    def apply(
        userSettings: js.UndefOr[UserSettings] = js.undefined
    ): GetUserSettingsResponse = {
      val __obj = js.Dynamic.literal()
      userSettings.foreach(__v => __obj.updateDynamic("userSettings")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetUserSettingsResponse]
    }
  }

  /** The identity provider.
    */
  @js.native
  trait IdentityProvider extends js.Object {
    var identityProviderArn: ARN
    var identityProviderDetails: js.UndefOr[IdentityProviderDetails]
    var identityProviderName: js.UndefOr[IdentityProviderName]
    var identityProviderType: js.UndefOr[IdentityProviderType]
  }

  object IdentityProvider {
    @inline
    def apply(
        identityProviderArn: ARN,
        identityProviderDetails: js.UndefOr[IdentityProviderDetails] = js.undefined,
        identityProviderName: js.UndefOr[IdentityProviderName] = js.undefined,
        identityProviderType: js.UndefOr[IdentityProviderType] = js.undefined
    ): IdentityProvider = {
      val __obj = js.Dynamic.literal(
        "identityProviderArn" -> identityProviderArn.asInstanceOf[js.Any]
      )

      identityProviderDetails.foreach(__v => __obj.updateDynamic("identityProviderDetails")(__v.asInstanceOf[js.Any]))
      identityProviderName.foreach(__v => __obj.updateDynamic("identityProviderName")(__v.asInstanceOf[js.Any]))
      identityProviderType.foreach(__v => __obj.updateDynamic("identityProviderType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[IdentityProvider]
    }
  }

  /** The summary of the identity provider.
    */
  @js.native
  trait IdentityProviderSummary extends js.Object {
    var identityProviderArn: js.UndefOr[ARN]
    var identityProviderName: js.UndefOr[IdentityProviderName]
    var identityProviderType: js.UndefOr[IdentityProviderType]
  }

  object IdentityProviderSummary {
    @inline
    def apply(
        identityProviderArn: js.UndefOr[ARN] = js.undefined,
        identityProviderName: js.UndefOr[IdentityProviderName] = js.undefined,
        identityProviderType: js.UndefOr[IdentityProviderType] = js.undefined
    ): IdentityProviderSummary = {
      val __obj = js.Dynamic.literal()
      identityProviderArn.foreach(__v => __obj.updateDynamic("identityProviderArn")(__v.asInstanceOf[js.Any]))
      identityProviderName.foreach(__v => __obj.updateDynamic("identityProviderName")(__v.asInstanceOf[js.Any]))
      identityProviderType.foreach(__v => __obj.updateDynamic("identityProviderType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[IdentityProviderSummary]
    }
  }

  @js.native
  trait ListBrowserSettingsRequest extends js.Object {
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListBrowserSettingsRequest {
    @inline
    def apply(
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListBrowserSettingsRequest = {
      val __obj = js.Dynamic.literal()
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListBrowserSettingsRequest]
    }
  }

  @js.native
  trait ListBrowserSettingsResponse extends js.Object {
    var browserSettings: js.UndefOr[BrowserSettingsList]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListBrowserSettingsResponse {
    @inline
    def apply(
        browserSettings: js.UndefOr[BrowserSettingsList] = js.undefined,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListBrowserSettingsResponse = {
      val __obj = js.Dynamic.literal()
      browserSettings.foreach(__v => __obj.updateDynamic("browserSettings")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListBrowserSettingsResponse]
    }
  }

  @js.native
  trait ListIdentityProvidersRequest extends js.Object {
    var portalArn: ARN
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListIdentityProvidersRequest {
    @inline
    def apply(
        portalArn: ARN,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListIdentityProvidersRequest = {
      val __obj = js.Dynamic.literal(
        "portalArn" -> portalArn.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListIdentityProvidersRequest]
    }
  }

  @js.native
  trait ListIdentityProvidersResponse extends js.Object {
    var identityProviders: js.UndefOr[IdentityProviderList]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListIdentityProvidersResponse {
    @inline
    def apply(
        identityProviders: js.UndefOr[IdentityProviderList] = js.undefined,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListIdentityProvidersResponse = {
      val __obj = js.Dynamic.literal()
      identityProviders.foreach(__v => __obj.updateDynamic("identityProviders")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListIdentityProvidersResponse]
    }
  }

  @js.native
  trait ListNetworkSettingsRequest extends js.Object {
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListNetworkSettingsRequest {
    @inline
    def apply(
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListNetworkSettingsRequest = {
      val __obj = js.Dynamic.literal()
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListNetworkSettingsRequest]
    }
  }

  @js.native
  trait ListNetworkSettingsResponse extends js.Object {
    var networkSettings: js.UndefOr[NetworkSettingsList]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListNetworkSettingsResponse {
    @inline
    def apply(
        networkSettings: js.UndefOr[NetworkSettingsList] = js.undefined,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListNetworkSettingsResponse = {
      val __obj = js.Dynamic.literal()
      networkSettings.foreach(__v => __obj.updateDynamic("networkSettings")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListNetworkSettingsResponse]
    }
  }

  @js.native
  trait ListPortalsRequest extends js.Object {
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListPortalsRequest {
    @inline
    def apply(
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListPortalsRequest = {
      val __obj = js.Dynamic.literal()
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPortalsRequest]
    }
  }

  @js.native
  trait ListPortalsResponse extends js.Object {
    var nextToken: js.UndefOr[PaginationToken]
    var portals: js.UndefOr[PortalList]
  }

  object ListPortalsResponse {
    @inline
    def apply(
        nextToken: js.UndefOr[PaginationToken] = js.undefined,
        portals: js.UndefOr[PortalList] = js.undefined
    ): ListPortalsResponse = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      portals.foreach(__v => __obj.updateDynamic("portals")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPortalsResponse]
    }
  }

  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var resourceArn: ARN
  }

  object ListTagsForResourceRequest {
    @inline
    def apply(
        resourceArn: ARN
    ): ListTagsForResourceRequest = {
      val __obj = js.Dynamic.literal(
        "resourceArn" -> resourceArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ListTagsForResourceRequest]
    }
  }

  @js.native
  trait ListTagsForResourceResponse extends js.Object {
    var tags: js.UndefOr[TagList]
  }

  object ListTagsForResourceResponse {
    @inline
    def apply(
        tags: js.UndefOr[TagList] = js.undefined
    ): ListTagsForResourceResponse = {
      val __obj = js.Dynamic.literal()
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceResponse]
    }
  }

  @js.native
  trait ListTrustStoreCertificatesRequest extends js.Object {
    var trustStoreArn: ARN
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListTrustStoreCertificatesRequest {
    @inline
    def apply(
        trustStoreArn: ARN,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListTrustStoreCertificatesRequest = {
      val __obj = js.Dynamic.literal(
        "trustStoreArn" -> trustStoreArn.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTrustStoreCertificatesRequest]
    }
  }

  @js.native
  trait ListTrustStoreCertificatesResponse extends js.Object {
    var certificateList: js.UndefOr[CertificateSummaryList]
    var nextToken: js.UndefOr[PaginationToken]
    var trustStoreArn: js.UndefOr[ARN]
  }

  object ListTrustStoreCertificatesResponse {
    @inline
    def apply(
        certificateList: js.UndefOr[CertificateSummaryList] = js.undefined,
        nextToken: js.UndefOr[PaginationToken] = js.undefined,
        trustStoreArn: js.UndefOr[ARN] = js.undefined
    ): ListTrustStoreCertificatesResponse = {
      val __obj = js.Dynamic.literal()
      certificateList.foreach(__v => __obj.updateDynamic("certificateList")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      trustStoreArn.foreach(__v => __obj.updateDynamic("trustStoreArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTrustStoreCertificatesResponse]
    }
  }

  @js.native
  trait ListTrustStoresRequest extends js.Object {
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListTrustStoresRequest {
    @inline
    def apply(
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListTrustStoresRequest = {
      val __obj = js.Dynamic.literal()
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTrustStoresRequest]
    }
  }

  @js.native
  trait ListTrustStoresResponse extends js.Object {
    var nextToken: js.UndefOr[PaginationToken]
    var trustStores: js.UndefOr[TrustStoreSummaryList]
  }

  object ListTrustStoresResponse {
    @inline
    def apply(
        nextToken: js.UndefOr[PaginationToken] = js.undefined,
        trustStores: js.UndefOr[TrustStoreSummaryList] = js.undefined
    ): ListTrustStoresResponse = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      trustStores.foreach(__v => __obj.updateDynamic("trustStores")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTrustStoresResponse]
    }
  }

  @js.native
  trait ListUserAccessLoggingSettingsRequest extends js.Object {
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListUserAccessLoggingSettingsRequest {
    @inline
    def apply(
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListUserAccessLoggingSettingsRequest = {
      val __obj = js.Dynamic.literal()
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListUserAccessLoggingSettingsRequest]
    }
  }

  @js.native
  trait ListUserAccessLoggingSettingsResponse extends js.Object {
    var nextToken: js.UndefOr[PaginationToken]
    var userAccessLoggingSettings: js.UndefOr[UserAccessLoggingSettingsList]
  }

  object ListUserAccessLoggingSettingsResponse {
    @inline
    def apply(
        nextToken: js.UndefOr[PaginationToken] = js.undefined,
        userAccessLoggingSettings: js.UndefOr[UserAccessLoggingSettingsList] = js.undefined
    ): ListUserAccessLoggingSettingsResponse = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      userAccessLoggingSettings.foreach(__v => __obj.updateDynamic("userAccessLoggingSettings")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListUserAccessLoggingSettingsResponse]
    }
  }

  @js.native
  trait ListUserSettingsRequest extends js.Object {
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListUserSettingsRequest {
    @inline
    def apply(
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListUserSettingsRequest = {
      val __obj = js.Dynamic.literal()
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListUserSettingsRequest]
    }
  }

  @js.native
  trait ListUserSettingsResponse extends js.Object {
    var nextToken: js.UndefOr[PaginationToken]
    var userSettings: js.UndefOr[UserSettingsList]
  }

  object ListUserSettingsResponse {
    @inline
    def apply(
        nextToken: js.UndefOr[PaginationToken] = js.undefined,
        userSettings: js.UndefOr[UserSettingsList] = js.undefined
    ): ListUserSettingsResponse = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      userSettings.foreach(__v => __obj.updateDynamic("userSettings")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListUserSettingsResponse]
    }
  }

  /** A network settings resource that can be associated with a web portal. Once associated with a web portal, network settings define how streaming instances will connect with your specified VPC.
    */
  @js.native
  trait NetworkSettings extends js.Object {
    var networkSettingsArn: ARN
    var associatedPortalArns: js.UndefOr[ArnList]
    var securityGroupIds: js.UndefOr[SecurityGroupIdList]
    var subnetIds: js.UndefOr[SubnetIdList]
    var vpcId: js.UndefOr[VpcId]
  }

  object NetworkSettings {
    @inline
    def apply(
        networkSettingsArn: ARN,
        associatedPortalArns: js.UndefOr[ArnList] = js.undefined,
        securityGroupIds: js.UndefOr[SecurityGroupIdList] = js.undefined,
        subnetIds: js.UndefOr[SubnetIdList] = js.undefined,
        vpcId: js.UndefOr[VpcId] = js.undefined
    ): NetworkSettings = {
      val __obj = js.Dynamic.literal(
        "networkSettingsArn" -> networkSettingsArn.asInstanceOf[js.Any]
      )

      associatedPortalArns.foreach(__v => __obj.updateDynamic("associatedPortalArns")(__v.asInstanceOf[js.Any]))
      securityGroupIds.foreach(__v => __obj.updateDynamic("securityGroupIds")(__v.asInstanceOf[js.Any]))
      subnetIds.foreach(__v => __obj.updateDynamic("subnetIds")(__v.asInstanceOf[js.Any]))
      vpcId.foreach(__v => __obj.updateDynamic("vpcId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NetworkSettings]
    }
  }

  /** The summary of network settings.
    */
  @js.native
  trait NetworkSettingsSummary extends js.Object {
    var networkSettingsArn: js.UndefOr[ARN]
    var vpcId: js.UndefOr[VpcId]
  }

  object NetworkSettingsSummary {
    @inline
    def apply(
        networkSettingsArn: js.UndefOr[ARN] = js.undefined,
        vpcId: js.UndefOr[VpcId] = js.undefined
    ): NetworkSettingsSummary = {
      val __obj = js.Dynamic.literal()
      networkSettingsArn.foreach(__v => __obj.updateDynamic("networkSettingsArn")(__v.asInstanceOf[js.Any]))
      vpcId.foreach(__v => __obj.updateDynamic("vpcId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NetworkSettingsSummary]
    }
  }

  /** The web portal.
    */
  @js.native
  trait Portal extends js.Object {
    var browserSettingsArn: js.UndefOr[ARN]
    var browserType: js.UndefOr[BrowserType]
    var creationDate: js.UndefOr[Timestamp]
    var displayName: js.UndefOr[DisplayName]
    var networkSettingsArn: js.UndefOr[ARN]
    var portalArn: js.UndefOr[ARN]
    var portalEndpoint: js.UndefOr[PortalEndpoint]
    var portalStatus: js.UndefOr[PortalStatus]
    var rendererType: js.UndefOr[RendererType]
    var statusReason: js.UndefOr[StatusReason]
    var trustStoreArn: js.UndefOr[ARN]
    var userAccessLoggingSettingsArn: js.UndefOr[ARN]
    var userSettingsArn: js.UndefOr[ARN]
  }

  object Portal {
    @inline
    def apply(
        browserSettingsArn: js.UndefOr[ARN] = js.undefined,
        browserType: js.UndefOr[BrowserType] = js.undefined,
        creationDate: js.UndefOr[Timestamp] = js.undefined,
        displayName: js.UndefOr[DisplayName] = js.undefined,
        networkSettingsArn: js.UndefOr[ARN] = js.undefined,
        portalArn: js.UndefOr[ARN] = js.undefined,
        portalEndpoint: js.UndefOr[PortalEndpoint] = js.undefined,
        portalStatus: js.UndefOr[PortalStatus] = js.undefined,
        rendererType: js.UndefOr[RendererType] = js.undefined,
        statusReason: js.UndefOr[StatusReason] = js.undefined,
        trustStoreArn: js.UndefOr[ARN] = js.undefined,
        userAccessLoggingSettingsArn: js.UndefOr[ARN] = js.undefined,
        userSettingsArn: js.UndefOr[ARN] = js.undefined
    ): Portal = {
      val __obj = js.Dynamic.literal()
      browserSettingsArn.foreach(__v => __obj.updateDynamic("browserSettingsArn")(__v.asInstanceOf[js.Any]))
      browserType.foreach(__v => __obj.updateDynamic("browserType")(__v.asInstanceOf[js.Any]))
      creationDate.foreach(__v => __obj.updateDynamic("creationDate")(__v.asInstanceOf[js.Any]))
      displayName.foreach(__v => __obj.updateDynamic("displayName")(__v.asInstanceOf[js.Any]))
      networkSettingsArn.foreach(__v => __obj.updateDynamic("networkSettingsArn")(__v.asInstanceOf[js.Any]))
      portalArn.foreach(__v => __obj.updateDynamic("portalArn")(__v.asInstanceOf[js.Any]))
      portalEndpoint.foreach(__v => __obj.updateDynamic("portalEndpoint")(__v.asInstanceOf[js.Any]))
      portalStatus.foreach(__v => __obj.updateDynamic("portalStatus")(__v.asInstanceOf[js.Any]))
      rendererType.foreach(__v => __obj.updateDynamic("rendererType")(__v.asInstanceOf[js.Any]))
      statusReason.foreach(__v => __obj.updateDynamic("statusReason")(__v.asInstanceOf[js.Any]))
      trustStoreArn.foreach(__v => __obj.updateDynamic("trustStoreArn")(__v.asInstanceOf[js.Any]))
      userAccessLoggingSettingsArn.foreach(__v => __obj.updateDynamic("userAccessLoggingSettingsArn")(__v.asInstanceOf[js.Any]))
      userSettingsArn.foreach(__v => __obj.updateDynamic("userSettingsArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Portal]
    }
  }

  /** The summary of the portal.
    */
  @js.native
  trait PortalSummary extends js.Object {
    var browserSettingsArn: js.UndefOr[ARN]
    var browserType: js.UndefOr[BrowserType]
    var creationDate: js.UndefOr[Timestamp]
    var displayName: js.UndefOr[DisplayName]
    var networkSettingsArn: js.UndefOr[ARN]
    var portalArn: js.UndefOr[ARN]
    var portalEndpoint: js.UndefOr[PortalEndpoint]
    var portalStatus: js.UndefOr[PortalStatus]
    var rendererType: js.UndefOr[RendererType]
    var trustStoreArn: js.UndefOr[ARN]
    var userAccessLoggingSettingsArn: js.UndefOr[ARN]
    var userSettingsArn: js.UndefOr[ARN]
  }

  object PortalSummary {
    @inline
    def apply(
        browserSettingsArn: js.UndefOr[ARN] = js.undefined,
        browserType: js.UndefOr[BrowserType] = js.undefined,
        creationDate: js.UndefOr[Timestamp] = js.undefined,
        displayName: js.UndefOr[DisplayName] = js.undefined,
        networkSettingsArn: js.UndefOr[ARN] = js.undefined,
        portalArn: js.UndefOr[ARN] = js.undefined,
        portalEndpoint: js.UndefOr[PortalEndpoint] = js.undefined,
        portalStatus: js.UndefOr[PortalStatus] = js.undefined,
        rendererType: js.UndefOr[RendererType] = js.undefined,
        trustStoreArn: js.UndefOr[ARN] = js.undefined,
        userAccessLoggingSettingsArn: js.UndefOr[ARN] = js.undefined,
        userSettingsArn: js.UndefOr[ARN] = js.undefined
    ): PortalSummary = {
      val __obj = js.Dynamic.literal()
      browserSettingsArn.foreach(__v => __obj.updateDynamic("browserSettingsArn")(__v.asInstanceOf[js.Any]))
      browserType.foreach(__v => __obj.updateDynamic("browserType")(__v.asInstanceOf[js.Any]))
      creationDate.foreach(__v => __obj.updateDynamic("creationDate")(__v.asInstanceOf[js.Any]))
      displayName.foreach(__v => __obj.updateDynamic("displayName")(__v.asInstanceOf[js.Any]))
      networkSettingsArn.foreach(__v => __obj.updateDynamic("networkSettingsArn")(__v.asInstanceOf[js.Any]))
      portalArn.foreach(__v => __obj.updateDynamic("portalArn")(__v.asInstanceOf[js.Any]))
      portalEndpoint.foreach(__v => __obj.updateDynamic("portalEndpoint")(__v.asInstanceOf[js.Any]))
      portalStatus.foreach(__v => __obj.updateDynamic("portalStatus")(__v.asInstanceOf[js.Any]))
      rendererType.foreach(__v => __obj.updateDynamic("rendererType")(__v.asInstanceOf[js.Any]))
      trustStoreArn.foreach(__v => __obj.updateDynamic("trustStoreArn")(__v.asInstanceOf[js.Any]))
      userAccessLoggingSettingsArn.foreach(__v => __obj.updateDynamic("userAccessLoggingSettingsArn")(__v.asInstanceOf[js.Any]))
      userSettingsArn.foreach(__v => __obj.updateDynamic("userSettingsArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PortalSummary]
    }
  }

  /** The tag.
    */
  @js.native
  trait Tag extends js.Object {
    var Key: TagKey
    var Value: TagValue
  }

  object Tag {
    @inline
    def apply(
        Key: TagKey,
        Value: TagValue
    ): Tag = {
      val __obj = js.Dynamic.literal(
        "Key" -> Key.asInstanceOf[js.Any],
        "Value" -> Value.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[Tag]
    }
  }

  @js.native
  trait TagResourceRequest extends js.Object {
    var resourceArn: ARN
    var tags: TagList
    var clientToken: js.UndefOr[ClientToken]
  }

  object TagResourceRequest {
    @inline
    def apply(
        resourceArn: ARN,
        tags: TagList,
        clientToken: js.UndefOr[ClientToken] = js.undefined
    ): TagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "resourceArn" -> resourceArn.asInstanceOf[js.Any],
        "tags" -> tags.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
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

  /** A trust store that can be associated with a web portal. A trust store contains certificate authority (CA) certificates. Once associated with a web portal, the browser in a streaming session will recognize certificates that have been issued using any of the CAs in the trust store. If your organization has internal websites that use certificates issued by private CAs, you should add the private CA certificate to the trust store.
    */
  @js.native
  trait TrustStore extends js.Object {
    var associatedPortalArns: js.UndefOr[ArnList]
    var trustStoreArn: js.UndefOr[ARN]
  }

  object TrustStore {
    @inline
    def apply(
        associatedPortalArns: js.UndefOr[ArnList] = js.undefined,
        trustStoreArn: js.UndefOr[ARN] = js.undefined
    ): TrustStore = {
      val __obj = js.Dynamic.literal()
      associatedPortalArns.foreach(__v => __obj.updateDynamic("associatedPortalArns")(__v.asInstanceOf[js.Any]))
      trustStoreArn.foreach(__v => __obj.updateDynamic("trustStoreArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TrustStore]
    }
  }

  /** The summary of the trust store.
    */
  @js.native
  trait TrustStoreSummary extends js.Object {
    var trustStoreArn: js.UndefOr[ARN]
  }

  object TrustStoreSummary {
    @inline
    def apply(
        trustStoreArn: js.UndefOr[ARN] = js.undefined
    ): TrustStoreSummary = {
      val __obj = js.Dynamic.literal()
      trustStoreArn.foreach(__v => __obj.updateDynamic("trustStoreArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TrustStoreSummary]
    }
  }

  @js.native
  trait UntagResourceRequest extends js.Object {
    var resourceArn: ARN
    var tagKeys: TagKeyList
  }

  object UntagResourceRequest {
    @inline
    def apply(
        resourceArn: ARN,
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
  trait UpdateBrowserSettingsRequest extends js.Object {
    var browserSettingsArn: ARN
    var browserPolicy: js.UndefOr[BrowserPolicy]
    var clientToken: js.UndefOr[ClientToken]
  }

  object UpdateBrowserSettingsRequest {
    @inline
    def apply(
        browserSettingsArn: ARN,
        browserPolicy: js.UndefOr[BrowserPolicy] = js.undefined,
        clientToken: js.UndefOr[ClientToken] = js.undefined
    ): UpdateBrowserSettingsRequest = {
      val __obj = js.Dynamic.literal(
        "browserSettingsArn" -> browserSettingsArn.asInstanceOf[js.Any]
      )

      browserPolicy.foreach(__v => __obj.updateDynamic("browserPolicy")(__v.asInstanceOf[js.Any]))
      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateBrowserSettingsRequest]
    }
  }

  @js.native
  trait UpdateBrowserSettingsResponse extends js.Object {
    var browserSettings: BrowserSettings
  }

  object UpdateBrowserSettingsResponse {
    @inline
    def apply(
        browserSettings: BrowserSettings
    ): UpdateBrowserSettingsResponse = {
      val __obj = js.Dynamic.literal(
        "browserSettings" -> browserSettings.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateBrowserSettingsResponse]
    }
  }

  @js.native
  trait UpdateIdentityProviderRequest extends js.Object {
    var identityProviderArn: ARN
    var clientToken: js.UndefOr[ClientToken]
    var identityProviderDetails: js.UndefOr[IdentityProviderDetails]
    var identityProviderName: js.UndefOr[IdentityProviderName]
    var identityProviderType: js.UndefOr[IdentityProviderType]
  }

  object UpdateIdentityProviderRequest {
    @inline
    def apply(
        identityProviderArn: ARN,
        clientToken: js.UndefOr[ClientToken] = js.undefined,
        identityProviderDetails: js.UndefOr[IdentityProviderDetails] = js.undefined,
        identityProviderName: js.UndefOr[IdentityProviderName] = js.undefined,
        identityProviderType: js.UndefOr[IdentityProviderType] = js.undefined
    ): UpdateIdentityProviderRequest = {
      val __obj = js.Dynamic.literal(
        "identityProviderArn" -> identityProviderArn.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      identityProviderDetails.foreach(__v => __obj.updateDynamic("identityProviderDetails")(__v.asInstanceOf[js.Any]))
      identityProviderName.foreach(__v => __obj.updateDynamic("identityProviderName")(__v.asInstanceOf[js.Any]))
      identityProviderType.foreach(__v => __obj.updateDynamic("identityProviderType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateIdentityProviderRequest]
    }
  }

  @js.native
  trait UpdateIdentityProviderResponse extends js.Object {
    var identityProvider: IdentityProvider
  }

  object UpdateIdentityProviderResponse {
    @inline
    def apply(
        identityProvider: IdentityProvider
    ): UpdateIdentityProviderResponse = {
      val __obj = js.Dynamic.literal(
        "identityProvider" -> identityProvider.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateIdentityProviderResponse]
    }
  }

  @js.native
  trait UpdateNetworkSettingsRequest extends js.Object {
    var networkSettingsArn: ARN
    var clientToken: js.UndefOr[ClientToken]
    var securityGroupIds: js.UndefOr[SecurityGroupIdList]
    var subnetIds: js.UndefOr[SubnetIdList]
    var vpcId: js.UndefOr[VpcId]
  }

  object UpdateNetworkSettingsRequest {
    @inline
    def apply(
        networkSettingsArn: ARN,
        clientToken: js.UndefOr[ClientToken] = js.undefined,
        securityGroupIds: js.UndefOr[SecurityGroupIdList] = js.undefined,
        subnetIds: js.UndefOr[SubnetIdList] = js.undefined,
        vpcId: js.UndefOr[VpcId] = js.undefined
    ): UpdateNetworkSettingsRequest = {
      val __obj = js.Dynamic.literal(
        "networkSettingsArn" -> networkSettingsArn.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      securityGroupIds.foreach(__v => __obj.updateDynamic("securityGroupIds")(__v.asInstanceOf[js.Any]))
      subnetIds.foreach(__v => __obj.updateDynamic("subnetIds")(__v.asInstanceOf[js.Any]))
      vpcId.foreach(__v => __obj.updateDynamic("vpcId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateNetworkSettingsRequest]
    }
  }

  @js.native
  trait UpdateNetworkSettingsResponse extends js.Object {
    var networkSettings: NetworkSettings
  }

  object UpdateNetworkSettingsResponse {
    @inline
    def apply(
        networkSettings: NetworkSettings
    ): UpdateNetworkSettingsResponse = {
      val __obj = js.Dynamic.literal(
        "networkSettings" -> networkSettings.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateNetworkSettingsResponse]
    }
  }

  @js.native
  trait UpdatePortalRequest extends js.Object {
    var portalArn: ARN
    var displayName: js.UndefOr[DisplayName]
  }

  object UpdatePortalRequest {
    @inline
    def apply(
        portalArn: ARN,
        displayName: js.UndefOr[DisplayName] = js.undefined
    ): UpdatePortalRequest = {
      val __obj = js.Dynamic.literal(
        "portalArn" -> portalArn.asInstanceOf[js.Any]
      )

      displayName.foreach(__v => __obj.updateDynamic("displayName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdatePortalRequest]
    }
  }

  @js.native
  trait UpdatePortalResponse extends js.Object {
    var portal: js.UndefOr[Portal]
  }

  object UpdatePortalResponse {
    @inline
    def apply(
        portal: js.UndefOr[Portal] = js.undefined
    ): UpdatePortalResponse = {
      val __obj = js.Dynamic.literal()
      portal.foreach(__v => __obj.updateDynamic("portal")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdatePortalResponse]
    }
  }

  @js.native
  trait UpdateTrustStoreRequest extends js.Object {
    var trustStoreArn: ARN
    var certificatesToAdd: js.UndefOr[CertificateList]
    var certificatesToDelete: js.UndefOr[CertificateThumbprintList]
    var clientToken: js.UndefOr[ClientToken]
  }

  object UpdateTrustStoreRequest {
    @inline
    def apply(
        trustStoreArn: ARN,
        certificatesToAdd: js.UndefOr[CertificateList] = js.undefined,
        certificatesToDelete: js.UndefOr[CertificateThumbprintList] = js.undefined,
        clientToken: js.UndefOr[ClientToken] = js.undefined
    ): UpdateTrustStoreRequest = {
      val __obj = js.Dynamic.literal(
        "trustStoreArn" -> trustStoreArn.asInstanceOf[js.Any]
      )

      certificatesToAdd.foreach(__v => __obj.updateDynamic("certificatesToAdd")(__v.asInstanceOf[js.Any]))
      certificatesToDelete.foreach(__v => __obj.updateDynamic("certificatesToDelete")(__v.asInstanceOf[js.Any]))
      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateTrustStoreRequest]
    }
  }

  @js.native
  trait UpdateTrustStoreResponse extends js.Object {
    var trustStoreArn: ARN
  }

  object UpdateTrustStoreResponse {
    @inline
    def apply(
        trustStoreArn: ARN
    ): UpdateTrustStoreResponse = {
      val __obj = js.Dynamic.literal(
        "trustStoreArn" -> trustStoreArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateTrustStoreResponse]
    }
  }

  @js.native
  trait UpdateUserAccessLoggingSettingsRequest extends js.Object {
    var userAccessLoggingSettingsArn: ARN
    var clientToken: js.UndefOr[ClientToken]
    var kinesisStreamArn: js.UndefOr[KinesisStreamArn]
  }

  object UpdateUserAccessLoggingSettingsRequest {
    @inline
    def apply(
        userAccessLoggingSettingsArn: ARN,
        clientToken: js.UndefOr[ClientToken] = js.undefined,
        kinesisStreamArn: js.UndefOr[KinesisStreamArn] = js.undefined
    ): UpdateUserAccessLoggingSettingsRequest = {
      val __obj = js.Dynamic.literal(
        "userAccessLoggingSettingsArn" -> userAccessLoggingSettingsArn.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      kinesisStreamArn.foreach(__v => __obj.updateDynamic("kinesisStreamArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateUserAccessLoggingSettingsRequest]
    }
  }

  @js.native
  trait UpdateUserAccessLoggingSettingsResponse extends js.Object {
    var userAccessLoggingSettings: UserAccessLoggingSettings
  }

  object UpdateUserAccessLoggingSettingsResponse {
    @inline
    def apply(
        userAccessLoggingSettings: UserAccessLoggingSettings
    ): UpdateUserAccessLoggingSettingsResponse = {
      val __obj = js.Dynamic.literal(
        "userAccessLoggingSettings" -> userAccessLoggingSettings.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateUserAccessLoggingSettingsResponse]
    }
  }

  @js.native
  trait UpdateUserSettingsRequest extends js.Object {
    var userSettingsArn: ARN
    var clientToken: js.UndefOr[ClientToken]
    var copyAllowed: js.UndefOr[EnabledType]
    var disconnectTimeoutInMinutes: js.UndefOr[DisconnectTimeoutInMinutes]
    var downloadAllowed: js.UndefOr[EnabledType]
    var idleDisconnectTimeoutInMinutes: js.UndefOr[IdleDisconnectTimeoutInMinutes]
    var pasteAllowed: js.UndefOr[EnabledType]
    var printAllowed: js.UndefOr[EnabledType]
    var uploadAllowed: js.UndefOr[EnabledType]
  }

  object UpdateUserSettingsRequest {
    @inline
    def apply(
        userSettingsArn: ARN,
        clientToken: js.UndefOr[ClientToken] = js.undefined,
        copyAllowed: js.UndefOr[EnabledType] = js.undefined,
        disconnectTimeoutInMinutes: js.UndefOr[DisconnectTimeoutInMinutes] = js.undefined,
        downloadAllowed: js.UndefOr[EnabledType] = js.undefined,
        idleDisconnectTimeoutInMinutes: js.UndefOr[IdleDisconnectTimeoutInMinutes] = js.undefined,
        pasteAllowed: js.UndefOr[EnabledType] = js.undefined,
        printAllowed: js.UndefOr[EnabledType] = js.undefined,
        uploadAllowed: js.UndefOr[EnabledType] = js.undefined
    ): UpdateUserSettingsRequest = {
      val __obj = js.Dynamic.literal(
        "userSettingsArn" -> userSettingsArn.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      copyAllowed.foreach(__v => __obj.updateDynamic("copyAllowed")(__v.asInstanceOf[js.Any]))
      disconnectTimeoutInMinutes.foreach(__v => __obj.updateDynamic("disconnectTimeoutInMinutes")(__v.asInstanceOf[js.Any]))
      downloadAllowed.foreach(__v => __obj.updateDynamic("downloadAllowed")(__v.asInstanceOf[js.Any]))
      idleDisconnectTimeoutInMinutes.foreach(__v => __obj.updateDynamic("idleDisconnectTimeoutInMinutes")(__v.asInstanceOf[js.Any]))
      pasteAllowed.foreach(__v => __obj.updateDynamic("pasteAllowed")(__v.asInstanceOf[js.Any]))
      printAllowed.foreach(__v => __obj.updateDynamic("printAllowed")(__v.asInstanceOf[js.Any]))
      uploadAllowed.foreach(__v => __obj.updateDynamic("uploadAllowed")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateUserSettingsRequest]
    }
  }

  @js.native
  trait UpdateUserSettingsResponse extends js.Object {
    var userSettings: UserSettings
  }

  object UpdateUserSettingsResponse {
    @inline
    def apply(
        userSettings: UserSettings
    ): UpdateUserSettingsResponse = {
      val __obj = js.Dynamic.literal(
        "userSettings" -> userSettings.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateUserSettingsResponse]
    }
  }

  /** A user access logging settings resource that can be associated with a web portal.
    */
  @js.native
  trait UserAccessLoggingSettings extends js.Object {
    var userAccessLoggingSettingsArn: ARN
    var associatedPortalArns: js.UndefOr[ArnList]
    var kinesisStreamArn: js.UndefOr[KinesisStreamArn]
  }

  object UserAccessLoggingSettings {
    @inline
    def apply(
        userAccessLoggingSettingsArn: ARN,
        associatedPortalArns: js.UndefOr[ArnList] = js.undefined,
        kinesisStreamArn: js.UndefOr[KinesisStreamArn] = js.undefined
    ): UserAccessLoggingSettings = {
      val __obj = js.Dynamic.literal(
        "userAccessLoggingSettingsArn" -> userAccessLoggingSettingsArn.asInstanceOf[js.Any]
      )

      associatedPortalArns.foreach(__v => __obj.updateDynamic("associatedPortalArns")(__v.asInstanceOf[js.Any]))
      kinesisStreamArn.foreach(__v => __obj.updateDynamic("kinesisStreamArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UserAccessLoggingSettings]
    }
  }

  /** The summary of user access logging settings.
    */
  @js.native
  trait UserAccessLoggingSettingsSummary extends js.Object {
    var kinesisStreamArn: js.UndefOr[KinesisStreamArn]
    var userAccessLoggingSettingsArn: js.UndefOr[ARN]
  }

  object UserAccessLoggingSettingsSummary {
    @inline
    def apply(
        kinesisStreamArn: js.UndefOr[KinesisStreamArn] = js.undefined,
        userAccessLoggingSettingsArn: js.UndefOr[ARN] = js.undefined
    ): UserAccessLoggingSettingsSummary = {
      val __obj = js.Dynamic.literal()
      kinesisStreamArn.foreach(__v => __obj.updateDynamic("kinesisStreamArn")(__v.asInstanceOf[js.Any]))
      userAccessLoggingSettingsArn.foreach(__v => __obj.updateDynamic("userAccessLoggingSettingsArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UserAccessLoggingSettingsSummary]
    }
  }

  /** A user settings resource that can be associated with a web portal. Once associated with a web portal, user settings control how users can transfer data between a streaming session and the their local devices.
    */
  @js.native
  trait UserSettings extends js.Object {
    var userSettingsArn: ARN
    var associatedPortalArns: js.UndefOr[ArnList]
    var copyAllowed: js.UndefOr[EnabledType]
    var disconnectTimeoutInMinutes: js.UndefOr[DisconnectTimeoutInMinutes]
    var downloadAllowed: js.UndefOr[EnabledType]
    var idleDisconnectTimeoutInMinutes: js.UndefOr[IdleDisconnectTimeoutInMinutes]
    var pasteAllowed: js.UndefOr[EnabledType]
    var printAllowed: js.UndefOr[EnabledType]
    var uploadAllowed: js.UndefOr[EnabledType]
  }

  object UserSettings {
    @inline
    def apply(
        userSettingsArn: ARN,
        associatedPortalArns: js.UndefOr[ArnList] = js.undefined,
        copyAllowed: js.UndefOr[EnabledType] = js.undefined,
        disconnectTimeoutInMinutes: js.UndefOr[DisconnectTimeoutInMinutes] = js.undefined,
        downloadAllowed: js.UndefOr[EnabledType] = js.undefined,
        idleDisconnectTimeoutInMinutes: js.UndefOr[IdleDisconnectTimeoutInMinutes] = js.undefined,
        pasteAllowed: js.UndefOr[EnabledType] = js.undefined,
        printAllowed: js.UndefOr[EnabledType] = js.undefined,
        uploadAllowed: js.UndefOr[EnabledType] = js.undefined
    ): UserSettings = {
      val __obj = js.Dynamic.literal(
        "userSettingsArn" -> userSettingsArn.asInstanceOf[js.Any]
      )

      associatedPortalArns.foreach(__v => __obj.updateDynamic("associatedPortalArns")(__v.asInstanceOf[js.Any]))
      copyAllowed.foreach(__v => __obj.updateDynamic("copyAllowed")(__v.asInstanceOf[js.Any]))
      disconnectTimeoutInMinutes.foreach(__v => __obj.updateDynamic("disconnectTimeoutInMinutes")(__v.asInstanceOf[js.Any]))
      downloadAllowed.foreach(__v => __obj.updateDynamic("downloadAllowed")(__v.asInstanceOf[js.Any]))
      idleDisconnectTimeoutInMinutes.foreach(__v => __obj.updateDynamic("idleDisconnectTimeoutInMinutes")(__v.asInstanceOf[js.Any]))
      pasteAllowed.foreach(__v => __obj.updateDynamic("pasteAllowed")(__v.asInstanceOf[js.Any]))
      printAllowed.foreach(__v => __obj.updateDynamic("printAllowed")(__v.asInstanceOf[js.Any]))
      uploadAllowed.foreach(__v => __obj.updateDynamic("uploadAllowed")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UserSettings]
    }
  }

  /** The summary of user settings.
    */
  @js.native
  trait UserSettingsSummary extends js.Object {
    var copyAllowed: js.UndefOr[EnabledType]
    var disconnectTimeoutInMinutes: js.UndefOr[DisconnectTimeoutInMinutes]
    var downloadAllowed: js.UndefOr[EnabledType]
    var idleDisconnectTimeoutInMinutes: js.UndefOr[IdleDisconnectTimeoutInMinutes]
    var pasteAllowed: js.UndefOr[EnabledType]
    var printAllowed: js.UndefOr[EnabledType]
    var uploadAllowed: js.UndefOr[EnabledType]
    var userSettingsArn: js.UndefOr[ARN]
  }

  object UserSettingsSummary {
    @inline
    def apply(
        copyAllowed: js.UndefOr[EnabledType] = js.undefined,
        disconnectTimeoutInMinutes: js.UndefOr[DisconnectTimeoutInMinutes] = js.undefined,
        downloadAllowed: js.UndefOr[EnabledType] = js.undefined,
        idleDisconnectTimeoutInMinutes: js.UndefOr[IdleDisconnectTimeoutInMinutes] = js.undefined,
        pasteAllowed: js.UndefOr[EnabledType] = js.undefined,
        printAllowed: js.UndefOr[EnabledType] = js.undefined,
        uploadAllowed: js.UndefOr[EnabledType] = js.undefined,
        userSettingsArn: js.UndefOr[ARN] = js.undefined
    ): UserSettingsSummary = {
      val __obj = js.Dynamic.literal()
      copyAllowed.foreach(__v => __obj.updateDynamic("copyAllowed")(__v.asInstanceOf[js.Any]))
      disconnectTimeoutInMinutes.foreach(__v => __obj.updateDynamic("disconnectTimeoutInMinutes")(__v.asInstanceOf[js.Any]))
      downloadAllowed.foreach(__v => __obj.updateDynamic("downloadAllowed")(__v.asInstanceOf[js.Any]))
      idleDisconnectTimeoutInMinutes.foreach(__v => __obj.updateDynamic("idleDisconnectTimeoutInMinutes")(__v.asInstanceOf[js.Any]))
      pasteAllowed.foreach(__v => __obj.updateDynamic("pasteAllowed")(__v.asInstanceOf[js.Any]))
      printAllowed.foreach(__v => __obj.updateDynamic("printAllowed")(__v.asInstanceOf[js.Any]))
      uploadAllowed.foreach(__v => __obj.updateDynamic("uploadAllowed")(__v.asInstanceOf[js.Any]))
      userSettingsArn.foreach(__v => __obj.updateDynamic("userSettingsArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UserSettingsSummary]
    }
  }
}
