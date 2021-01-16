package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

package object acmpca {
  type ASN1PrintableString64 = String
  type AWSPolicy = String
  type AccessDescriptionList = js.Array[AccessDescription]
  type AccountId = String
  type ActionList = js.Array[ActionType]
  type Arn = String
  type AuditReportId = String
  type CertificateAuthorities = js.Array[CertificateAuthority]
  type CertificateBody = String
  type CertificateBodyBlob = js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type CertificateChain = String
  type CertificateChainBlob = js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type CountryCodeString = String
  type CsrBlob = js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type CsrBody = String
  type CustomObjectIdentifier = String
  type IdempotencyToken = String
  type Integer1To5000 = Int
  type MaxResults = Int
  type NextToken = String
  type PermanentDeletionTimeInDays = Int
  type PermissionList = js.Array[Permission]
  type PositiveLong = Double
  type Principal = String
  type S3BucketName = String
  type S3Key = String
  type String128 = String
  type String16 = String
  type String253 = String
  type String256 = String
  type String3 = String
  type String39 = String
  type String3To255 = String
  type String40 = String
  type String5 = String
  type String64 = String
  type TStamp = js.Date
  type TagKey = String
  type TagList = js.Array[Tag]
  type TagValue = String

  implicit final class ACMPCAOps(private val service: ACMPCA) extends AnyVal {

    @inline def createCertificateAuthorityAuditReportFuture(params: CreateCertificateAuthorityAuditReportRequest): Future[CreateCertificateAuthorityAuditReportResponse] = service.createCertificateAuthorityAuditReport(params).promise().toFuture
    @inline def createCertificateAuthorityFuture(params: CreateCertificateAuthorityRequest): Future[CreateCertificateAuthorityResponse] = service.createCertificateAuthority(params).promise().toFuture
    @inline def createPermissionFuture(params: CreatePermissionRequest): Future[js.Object] = service.createPermission(params).promise().toFuture
    @inline def deleteCertificateAuthorityFuture(params: DeleteCertificateAuthorityRequest): Future[js.Object] = service.deleteCertificateAuthority(params).promise().toFuture
    @inline def deletePermissionFuture(params: DeletePermissionRequest): Future[js.Object] = service.deletePermission(params).promise().toFuture
    @inline def deletePolicyFuture(params: DeletePolicyRequest): Future[js.Object] = service.deletePolicy(params).promise().toFuture
    @inline def describeCertificateAuthorityAuditReportFuture(params: DescribeCertificateAuthorityAuditReportRequest): Future[DescribeCertificateAuthorityAuditReportResponse] = service.describeCertificateAuthorityAuditReport(params).promise().toFuture
    @inline def describeCertificateAuthorityFuture(params: DescribeCertificateAuthorityRequest): Future[DescribeCertificateAuthorityResponse] = service.describeCertificateAuthority(params).promise().toFuture
    @inline def getCertificateAuthorityCertificateFuture(params: GetCertificateAuthorityCertificateRequest): Future[GetCertificateAuthorityCertificateResponse] = service.getCertificateAuthorityCertificate(params).promise().toFuture
    @inline def getCertificateAuthorityCsrFuture(params: GetCertificateAuthorityCsrRequest): Future[GetCertificateAuthorityCsrResponse] = service.getCertificateAuthorityCsr(params).promise().toFuture
    @inline def getCertificateFuture(params: GetCertificateRequest): Future[GetCertificateResponse] = service.getCertificate(params).promise().toFuture
    @inline def getPolicyFuture(params: GetPolicyRequest): Future[GetPolicyResponse] = service.getPolicy(params).promise().toFuture
    @inline def importCertificateAuthorityCertificateFuture(params: ImportCertificateAuthorityCertificateRequest): Future[js.Object] = service.importCertificateAuthorityCertificate(params).promise().toFuture
    @inline def issueCertificateFuture(params: IssueCertificateRequest): Future[IssueCertificateResponse] = service.issueCertificate(params).promise().toFuture
    @inline def listCertificateAuthoritiesFuture(params: ListCertificateAuthoritiesRequest): Future[ListCertificateAuthoritiesResponse] = service.listCertificateAuthorities(params).promise().toFuture
    @inline def listPermissionsFuture(params: ListPermissionsRequest): Future[ListPermissionsResponse] = service.listPermissions(params).promise().toFuture
    @inline def listTagsFuture(params: ListTagsRequest): Future[ListTagsResponse] = service.listTags(params).promise().toFuture
    @inline def putPolicyFuture(params: PutPolicyRequest): Future[js.Object] = service.putPolicy(params).promise().toFuture
    @inline def restoreCertificateAuthorityFuture(params: RestoreCertificateAuthorityRequest): Future[js.Object] = service.restoreCertificateAuthority(params).promise().toFuture
    @inline def revokeCertificateFuture(params: RevokeCertificateRequest): Future[js.Object] = service.revokeCertificate(params).promise().toFuture
    @inline def tagCertificateAuthorityFuture(params: TagCertificateAuthorityRequest): Future[js.Object] = service.tagCertificateAuthority(params).promise().toFuture
    @inline def untagCertificateAuthorityFuture(params: UntagCertificateAuthorityRequest): Future[js.Object] = service.untagCertificateAuthority(params).promise().toFuture
    @inline def updateCertificateAuthorityFuture(params: UpdateCertificateAuthorityRequest): Future[js.Object] = service.updateCertificateAuthority(params).promise().toFuture

  }
}

package acmpca {
  @js.native
  @JSImport("aws-sdk/clients/acmpca", JSImport.Namespace, "AWS.ACMPCA")
  class ACMPCA() extends js.Object {
    def this(config: AWSConfig) = this()

    def createCertificateAuthority(params: CreateCertificateAuthorityRequest): Request[CreateCertificateAuthorityResponse] = js.native
    def createCertificateAuthorityAuditReport(params: CreateCertificateAuthorityAuditReportRequest): Request[CreateCertificateAuthorityAuditReportResponse] = js.native
    def createPermission(params: CreatePermissionRequest): Request[js.Object] = js.native
    def deleteCertificateAuthority(params: DeleteCertificateAuthorityRequest): Request[js.Object] = js.native
    def deletePermission(params: DeletePermissionRequest): Request[js.Object] = js.native
    def deletePolicy(params: DeletePolicyRequest): Request[js.Object] = js.native
    def describeCertificateAuthority(params: DescribeCertificateAuthorityRequest): Request[DescribeCertificateAuthorityResponse] = js.native
    def describeCertificateAuthorityAuditReport(params: DescribeCertificateAuthorityAuditReportRequest): Request[DescribeCertificateAuthorityAuditReportResponse] = js.native
    def getCertificate(params: GetCertificateRequest): Request[GetCertificateResponse] = js.native
    def getCertificateAuthorityCertificate(params: GetCertificateAuthorityCertificateRequest): Request[GetCertificateAuthorityCertificateResponse] = js.native
    def getCertificateAuthorityCsr(params: GetCertificateAuthorityCsrRequest): Request[GetCertificateAuthorityCsrResponse] = js.native
    def getPolicy(params: GetPolicyRequest): Request[GetPolicyResponse] = js.native
    def importCertificateAuthorityCertificate(params: ImportCertificateAuthorityCertificateRequest): Request[js.Object] = js.native
    def issueCertificate(params: IssueCertificateRequest): Request[IssueCertificateResponse] = js.native
    def listCertificateAuthorities(params: ListCertificateAuthoritiesRequest): Request[ListCertificateAuthoritiesResponse] = js.native
    def listPermissions(params: ListPermissionsRequest): Request[ListPermissionsResponse] = js.native
    def listTags(params: ListTagsRequest): Request[ListTagsResponse] = js.native
    def putPolicy(params: PutPolicyRequest): Request[js.Object] = js.native
    def restoreCertificateAuthority(params: RestoreCertificateAuthorityRequest): Request[js.Object] = js.native
    def revokeCertificate(params: RevokeCertificateRequest): Request[js.Object] = js.native
    def tagCertificateAuthority(params: TagCertificateAuthorityRequest): Request[js.Object] = js.native
    def untagCertificateAuthority(params: UntagCertificateAuthorityRequest): Request[js.Object] = js.native
    def updateCertificateAuthority(params: UpdateCertificateAuthorityRequest): Request[js.Object] = js.native
  }

  /** Contains information about the certificate subject. The certificate can be one issued by your private certificate authority (CA) or it can be your private CA certificate. The ```Subject``` field in the certificate identifies the entity that owns or controls the public key in the certificate. The entity can be a user, computer, device, or service. The ```Subject``` must contain an X.500 distinguished name (DN). A DN is a sequence of relative distinguished names (RDNs). The RDNs are separated by commas in the certificate. The DN must be unique for each entity, but your private CA can issue more than one certificate with the same DN to the same entity.
    */
  @js.native
  trait ASN1Subject extends js.Object {
    var CommonName: js.UndefOr[String64]
    var Country: js.UndefOr[CountryCodeString]
    var DistinguishedNameQualifier: js.UndefOr[ASN1PrintableString64]
    var GenerationQualifier: js.UndefOr[String3]
    var GivenName: js.UndefOr[String16]
    var Initials: js.UndefOr[String5]
    var Locality: js.UndefOr[String128]
    var Organization: js.UndefOr[String64]
    var OrganizationalUnit: js.UndefOr[String64]
    var Pseudonym: js.UndefOr[String128]
    var SerialNumber: js.UndefOr[ASN1PrintableString64]
    var State: js.UndefOr[String128]
    var Surname: js.UndefOr[String40]
    var Title: js.UndefOr[String64]
  }

  object ASN1Subject {
    @inline
    def apply(
        CommonName: js.UndefOr[String64] = js.undefined,
        Country: js.UndefOr[CountryCodeString] = js.undefined,
        DistinguishedNameQualifier: js.UndefOr[ASN1PrintableString64] = js.undefined,
        GenerationQualifier: js.UndefOr[String3] = js.undefined,
        GivenName: js.UndefOr[String16] = js.undefined,
        Initials: js.UndefOr[String5] = js.undefined,
        Locality: js.UndefOr[String128] = js.undefined,
        Organization: js.UndefOr[String64] = js.undefined,
        OrganizationalUnit: js.UndefOr[String64] = js.undefined,
        Pseudonym: js.UndefOr[String128] = js.undefined,
        SerialNumber: js.UndefOr[ASN1PrintableString64] = js.undefined,
        State: js.UndefOr[String128] = js.undefined,
        Surname: js.UndefOr[String40] = js.undefined,
        Title: js.UndefOr[String64] = js.undefined
    ): ASN1Subject = {
      val __obj = js.Dynamic.literal()
      CommonName.foreach(__v => __obj.updateDynamic("CommonName")(__v.asInstanceOf[js.Any]))
      Country.foreach(__v => __obj.updateDynamic("Country")(__v.asInstanceOf[js.Any]))
      DistinguishedNameQualifier.foreach(__v => __obj.updateDynamic("DistinguishedNameQualifier")(__v.asInstanceOf[js.Any]))
      GenerationQualifier.foreach(__v => __obj.updateDynamic("GenerationQualifier")(__v.asInstanceOf[js.Any]))
      GivenName.foreach(__v => __obj.updateDynamic("GivenName")(__v.asInstanceOf[js.Any]))
      Initials.foreach(__v => __obj.updateDynamic("Initials")(__v.asInstanceOf[js.Any]))
      Locality.foreach(__v => __obj.updateDynamic("Locality")(__v.asInstanceOf[js.Any]))
      Organization.foreach(__v => __obj.updateDynamic("Organization")(__v.asInstanceOf[js.Any]))
      OrganizationalUnit.foreach(__v => __obj.updateDynamic("OrganizationalUnit")(__v.asInstanceOf[js.Any]))
      Pseudonym.foreach(__v => __obj.updateDynamic("Pseudonym")(__v.asInstanceOf[js.Any]))
      SerialNumber.foreach(__v => __obj.updateDynamic("SerialNumber")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      Surname.foreach(__v => __obj.updateDynamic("Surname")(__v.asInstanceOf[js.Any]))
      Title.foreach(__v => __obj.updateDynamic("Title")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ASN1Subject]
    }
  }

  /** Provides access information used by the <code>authorityInfoAccess</code> and <code>subjectInfoAccess</code> extensions described in [[https://tools.ietf.org/html/rfc5280|RFC 5280]].
    */
  @js.native
  trait AccessDescription extends js.Object {
    var AccessLocation: GeneralName
    var AccessMethod: AccessMethod
  }

  object AccessDescription {
    @inline
    def apply(
        AccessLocation: GeneralName,
        AccessMethod: AccessMethod
    ): AccessDescription = {
      val __obj = js.Dynamic.literal(
        "AccessLocation" -> AccessLocation.asInstanceOf[js.Any],
        "AccessMethod" -> AccessMethod.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AccessDescription]
    }
  }

  /** Describes the type and format of extension access. Only one of <code>CustomObjectIdentifier</code> or <code>AccessMethodType</code> may be provided. Providing both results in <code>InvalidArgsException</code>.
    */
  @js.native
  trait AccessMethod extends js.Object {
    var AccessMethodType: js.UndefOr[AccessMethodType]
    var CustomObjectIdentifier: js.UndefOr[CustomObjectIdentifier]
  }

  object AccessMethod {
    @inline
    def apply(
        AccessMethodType: js.UndefOr[AccessMethodType] = js.undefined,
        CustomObjectIdentifier: js.UndefOr[CustomObjectIdentifier] = js.undefined
    ): AccessMethod = {
      val __obj = js.Dynamic.literal()
      AccessMethodType.foreach(__v => __obj.updateDynamic("AccessMethodType")(__v.asInstanceOf[js.Any]))
      CustomObjectIdentifier.foreach(__v => __obj.updateDynamic("CustomObjectIdentifier")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AccessMethod]
    }
  }

  @js.native
  sealed trait AccessMethodType extends js.Any
  object AccessMethodType {
    val CA_REPOSITORY = "CA_REPOSITORY".asInstanceOf[AccessMethodType]
    val RESOURCE_PKI_MANIFEST = "RESOURCE_PKI_MANIFEST".asInstanceOf[AccessMethodType]
    val RESOURCE_PKI_NOTIFY = "RESOURCE_PKI_NOTIFY".asInstanceOf[AccessMethodType]

    @inline def values = js.Array(CA_REPOSITORY, RESOURCE_PKI_MANIFEST, RESOURCE_PKI_NOTIFY)
  }

  @js.native
  sealed trait ActionType extends js.Any
  object ActionType {
    val IssueCertificate = "IssueCertificate".asInstanceOf[ActionType]
    val GetCertificate = "GetCertificate".asInstanceOf[ActionType]
    val ListPermissions = "ListPermissions".asInstanceOf[ActionType]

    @inline def values = js.Array(IssueCertificate, GetCertificate, ListPermissions)
  }

  @js.native
  sealed trait AuditReportResponseFormat extends js.Any
  object AuditReportResponseFormat {
    val JSON = "JSON".asInstanceOf[AuditReportResponseFormat]
    val CSV = "CSV".asInstanceOf[AuditReportResponseFormat]

    @inline def values = js.Array(JSON, CSV)
  }

  @js.native
  sealed trait AuditReportStatus extends js.Any
  object AuditReportStatus {
    val CREATING = "CREATING".asInstanceOf[AuditReportStatus]
    val SUCCESS = "SUCCESS".asInstanceOf[AuditReportStatus]
    val FAILED = "FAILED".asInstanceOf[AuditReportStatus]

    @inline def values = js.Array(CREATING, SUCCESS, FAILED)
  }

  /** Contains information about your private certificate authority (CA). Your private CA can issue and revoke X.509 digital certificates. Digital certificates verify that the entity named in the certificate ```Subject``` field owns or controls the public key contained in the ```Subject Public Key Info``` field. Call the [[https://docs.aws.amazon.com/acm-pca/latest/APIReference/API_CreateCertificateAuthority.html|CreateCertificateAuthority]] action to create your private CA. You must then call the [[https://docs.aws.amazon.com/acm-pca/latest/APIReference/API_GetCertificateAuthorityCertificate.html|GetCertificateAuthorityCertificate]] action to retrieve a private CA certificate signing request (CSR). Sign the CSR with your ACM Private CA-hosted or on-premises root or subordinate CA certificate. Call the [[https://docs.aws.amazon.com/acm-pca/latest/APIReference/API_ImportCertificateAuthorityCertificate.html|ImportCertificateAuthorityCertificate]] action to import the signed certificate into AWS Certificate Manager (ACM).
    */
  @js.native
  trait CertificateAuthority extends js.Object {
    var Arn: js.UndefOr[Arn]
    var CertificateAuthorityConfiguration: js.UndefOr[CertificateAuthorityConfiguration]
    var CreatedAt: js.UndefOr[TStamp]
    var FailureReason: js.UndefOr[FailureReason]
    var LastStateChangeAt: js.UndefOr[TStamp]
    var NotAfter: js.UndefOr[TStamp]
    var NotBefore: js.UndefOr[TStamp]
    var OwnerAccount: js.UndefOr[AccountId]
    var RestorableUntil: js.UndefOr[TStamp]
    var RevocationConfiguration: js.UndefOr[RevocationConfiguration]
    var Serial: js.UndefOr[String]
    var Status: js.UndefOr[CertificateAuthorityStatus]
    var Type: js.UndefOr[CertificateAuthorityType]
  }

  object CertificateAuthority {
    @inline
    def apply(
        Arn: js.UndefOr[Arn] = js.undefined,
        CertificateAuthorityConfiguration: js.UndefOr[CertificateAuthorityConfiguration] = js.undefined,
        CreatedAt: js.UndefOr[TStamp] = js.undefined,
        FailureReason: js.UndefOr[FailureReason] = js.undefined,
        LastStateChangeAt: js.UndefOr[TStamp] = js.undefined,
        NotAfter: js.UndefOr[TStamp] = js.undefined,
        NotBefore: js.UndefOr[TStamp] = js.undefined,
        OwnerAccount: js.UndefOr[AccountId] = js.undefined,
        RestorableUntil: js.UndefOr[TStamp] = js.undefined,
        RevocationConfiguration: js.UndefOr[RevocationConfiguration] = js.undefined,
        Serial: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[CertificateAuthorityStatus] = js.undefined,
        Type: js.UndefOr[CertificateAuthorityType] = js.undefined
    ): CertificateAuthority = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      CertificateAuthorityConfiguration.foreach(__v => __obj.updateDynamic("CertificateAuthorityConfiguration")(__v.asInstanceOf[js.Any]))
      CreatedAt.foreach(__v => __obj.updateDynamic("CreatedAt")(__v.asInstanceOf[js.Any]))
      FailureReason.foreach(__v => __obj.updateDynamic("FailureReason")(__v.asInstanceOf[js.Any]))
      LastStateChangeAt.foreach(__v => __obj.updateDynamic("LastStateChangeAt")(__v.asInstanceOf[js.Any]))
      NotAfter.foreach(__v => __obj.updateDynamic("NotAfter")(__v.asInstanceOf[js.Any]))
      NotBefore.foreach(__v => __obj.updateDynamic("NotBefore")(__v.asInstanceOf[js.Any]))
      OwnerAccount.foreach(__v => __obj.updateDynamic("OwnerAccount")(__v.asInstanceOf[js.Any]))
      RestorableUntil.foreach(__v => __obj.updateDynamic("RestorableUntil")(__v.asInstanceOf[js.Any]))
      RevocationConfiguration.foreach(__v => __obj.updateDynamic("RevocationConfiguration")(__v.asInstanceOf[js.Any]))
      Serial.foreach(__v => __obj.updateDynamic("Serial")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CertificateAuthority]
    }
  }

  /** Contains configuration information for your private certificate authority (CA). This includes information about the class of public key algorithm and the key pair that your private CA creates when it issues a certificate. It also includes the signature algorithm that it uses when issuing certificates, and its X.500 distinguished name. You must specify this information when you call the [[https://docs.aws.amazon.com/acm-pca/latest/APIReference/API_CreateCertificateAuthority.html|CreateCertificateAuthority]] action.
    */
  @js.native
  trait CertificateAuthorityConfiguration extends js.Object {
    var KeyAlgorithm: KeyAlgorithm
    var SigningAlgorithm: SigningAlgorithm
    var Subject: ASN1Subject
    var CsrExtensions: js.UndefOr[CsrExtensions]
  }

  object CertificateAuthorityConfiguration {
    @inline
    def apply(
        KeyAlgorithm: KeyAlgorithm,
        SigningAlgorithm: SigningAlgorithm,
        Subject: ASN1Subject,
        CsrExtensions: js.UndefOr[CsrExtensions] = js.undefined
    ): CertificateAuthorityConfiguration = {
      val __obj = js.Dynamic.literal(
        "KeyAlgorithm" -> KeyAlgorithm.asInstanceOf[js.Any],
        "SigningAlgorithm" -> SigningAlgorithm.asInstanceOf[js.Any],
        "Subject" -> Subject.asInstanceOf[js.Any]
      )

      CsrExtensions.foreach(__v => __obj.updateDynamic("CsrExtensions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CertificateAuthorityConfiguration]
    }
  }

  @js.native
  sealed trait CertificateAuthorityStatus extends js.Any
  object CertificateAuthorityStatus {
    val CREATING = "CREATING".asInstanceOf[CertificateAuthorityStatus]
    val PENDING_CERTIFICATE = "PENDING_CERTIFICATE".asInstanceOf[CertificateAuthorityStatus]
    val ACTIVE = "ACTIVE".asInstanceOf[CertificateAuthorityStatus]
    val DELETED = "DELETED".asInstanceOf[CertificateAuthorityStatus]
    val DISABLED = "DISABLED".asInstanceOf[CertificateAuthorityStatus]
    val EXPIRED = "EXPIRED".asInstanceOf[CertificateAuthorityStatus]
    val FAILED = "FAILED".asInstanceOf[CertificateAuthorityStatus]

    @inline def values = js.Array(CREATING, PENDING_CERTIFICATE, ACTIVE, DELETED, DISABLED, EXPIRED, FAILED)
  }

  @js.native
  sealed trait CertificateAuthorityType extends js.Any
  object CertificateAuthorityType {
    val ROOT = "ROOT".asInstanceOf[CertificateAuthorityType]
    val SUBORDINATE = "SUBORDINATE".asInstanceOf[CertificateAuthorityType]

    @inline def values = js.Array(ROOT, SUBORDINATE)
  }

  @js.native
  trait CreateCertificateAuthorityAuditReportRequest extends js.Object {
    var AuditReportResponseFormat: AuditReportResponseFormat
    var CertificateAuthorityArn: Arn
    var S3BucketName: S3BucketName
  }

  object CreateCertificateAuthorityAuditReportRequest {
    @inline
    def apply(
        AuditReportResponseFormat: AuditReportResponseFormat,
        CertificateAuthorityArn: Arn,
        S3BucketName: S3BucketName
    ): CreateCertificateAuthorityAuditReportRequest = {
      val __obj = js.Dynamic.literal(
        "AuditReportResponseFormat" -> AuditReportResponseFormat.asInstanceOf[js.Any],
        "CertificateAuthorityArn" -> CertificateAuthorityArn.asInstanceOf[js.Any],
        "S3BucketName" -> S3BucketName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateCertificateAuthorityAuditReportRequest]
    }
  }

  @js.native
  trait CreateCertificateAuthorityAuditReportResponse extends js.Object {
    var AuditReportId: js.UndefOr[AuditReportId]
    var S3Key: js.UndefOr[S3Key]
  }

  object CreateCertificateAuthorityAuditReportResponse {
    @inline
    def apply(
        AuditReportId: js.UndefOr[AuditReportId] = js.undefined,
        S3Key: js.UndefOr[S3Key] = js.undefined
    ): CreateCertificateAuthorityAuditReportResponse = {
      val __obj = js.Dynamic.literal()
      AuditReportId.foreach(__v => __obj.updateDynamic("AuditReportId")(__v.asInstanceOf[js.Any]))
      S3Key.foreach(__v => __obj.updateDynamic("S3Key")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateCertificateAuthorityAuditReportResponse]
    }
  }

  @js.native
  trait CreateCertificateAuthorityRequest extends js.Object {
    var CertificateAuthorityConfiguration: CertificateAuthorityConfiguration
    var CertificateAuthorityType: CertificateAuthorityType
    var IdempotencyToken: js.UndefOr[IdempotencyToken]
    var RevocationConfiguration: js.UndefOr[RevocationConfiguration]
    var Tags: js.UndefOr[TagList]
  }

  object CreateCertificateAuthorityRequest {
    @inline
    def apply(
        CertificateAuthorityConfiguration: CertificateAuthorityConfiguration,
        CertificateAuthorityType: CertificateAuthorityType,
        IdempotencyToken: js.UndefOr[IdempotencyToken] = js.undefined,
        RevocationConfiguration: js.UndefOr[RevocationConfiguration] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateCertificateAuthorityRequest = {
      val __obj = js.Dynamic.literal(
        "CertificateAuthorityConfiguration" -> CertificateAuthorityConfiguration.asInstanceOf[js.Any],
        "CertificateAuthorityType" -> CertificateAuthorityType.asInstanceOf[js.Any]
      )

      IdempotencyToken.foreach(__v => __obj.updateDynamic("IdempotencyToken")(__v.asInstanceOf[js.Any]))
      RevocationConfiguration.foreach(__v => __obj.updateDynamic("RevocationConfiguration")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateCertificateAuthorityRequest]
    }
  }

  @js.native
  trait CreateCertificateAuthorityResponse extends js.Object {
    var CertificateAuthorityArn: js.UndefOr[Arn]
  }

  object CreateCertificateAuthorityResponse {
    @inline
    def apply(
        CertificateAuthorityArn: js.UndefOr[Arn] = js.undefined
    ): CreateCertificateAuthorityResponse = {
      val __obj = js.Dynamic.literal()
      CertificateAuthorityArn.foreach(__v => __obj.updateDynamic("CertificateAuthorityArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateCertificateAuthorityResponse]
    }
  }

  @js.native
  trait CreatePermissionRequest extends js.Object {
    var Actions: ActionList
    var CertificateAuthorityArn: Arn
    var Principal: Principal
    var SourceAccount: js.UndefOr[AccountId]
  }

  object CreatePermissionRequest {
    @inline
    def apply(
        Actions: ActionList,
        CertificateAuthorityArn: Arn,
        Principal: Principal,
        SourceAccount: js.UndefOr[AccountId] = js.undefined
    ): CreatePermissionRequest = {
      val __obj = js.Dynamic.literal(
        "Actions" -> Actions.asInstanceOf[js.Any],
        "CertificateAuthorityArn" -> CertificateAuthorityArn.asInstanceOf[js.Any],
        "Principal" -> Principal.asInstanceOf[js.Any]
      )

      SourceAccount.foreach(__v => __obj.updateDynamic("SourceAccount")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreatePermissionRequest]
    }
  }

  /** Contains configuration information for a certificate revocation list (CRL). Your private certificate authority (CA) creates base CRLs. Delta CRLs are not supported. You can enable CRLs for your new or an existing private CA by setting the ```Enabled``` parameter to <code>true</code>. Your private CA writes CRLs to an S3 bucket that you specify in the ```S3BucketName``` parameter. You can hide the name of your bucket by specifying a value for the ```CustomCname``` parameter. Your private CA copies the CNAME or the S3 bucket name to the ```CRL Distribution Points``` extension of each certificate it issues. Your S3 bucket policy must give write permission to ACM Private CA.
    * ACM Private CAA assets that are stored in Amazon S3 can be protected with encryption. For more information, see [[https://docs.aws.amazon.com/acm-pca/latest/userguide/PcaCreateCa.html#crl-encryption|Encrypting Your CRLs]].
    * Your private CA uses the value in the ```ExpirationInDays``` parameter to calculate the ```nextUpdate``` field in the CRL. The CRL is refreshed at 1/2 the age of next update or when a certificate is revoked. When a certificate is revoked, it is recorded in the next CRL that is generated and in the next audit report. Only time valid certificates are listed in the CRL. Expired certificates are not included.
    * CRLs contain the following fields:
    * * ```Version```: The current version number defined in RFC 5280 is V2. The integer value is 0x1.
    * * ```Signature Algorithm```: The name of the algorithm used to sign the CRL.
    * * ```Issuer```: The X.500 distinguished name of your private CA that issued the CRL.
    * * ```Last Update```: The issue date and time of this CRL.
    * * ```Next Update```: The day and time by which the next CRL will be issued.
    * * ```Revoked Certificates```: List of revoked certificates. Each list item contains the following information.
    * <li> ```Serial Number```: The serial number, in hexadecimal format, of the revoked certificate.
    * * ```Revocation Date```: Date and time the certificate was revoked.
    * * ```CRL Entry Extensions```: Optional extensions for the CRL entry.
    * <li> ```X509v3 CRL Reason Code```: Reason the certificate was revoked.
    * </li></li> * ```CRL Extensions```: Optional extensions for the CRL.
    * <li> ```X509v3 Authority Key Identifier```: Identifies the public key associated with the private key used to sign the certificate.
    * * ```X509v3 CRL Number:```: Decimal sequence number for the CRL.
    * </li> * ```Signature Algorithm```: Algorithm used by your private CA to sign the CRL.
    * * ```Signature Value```: Signature computed over the CRL.
    * Certificate revocation lists created by ACM Private CA are DER-encoded. You can use the following OpenSSL command to list a CRL.
    * <code>openssl crl -inform DER -text -in <i>crl_path</i> -noout</code>
    */
  @js.native
  trait CrlConfiguration extends js.Object {
    var Enabled: Boolean
    var CustomCname: js.UndefOr[String253]
    var ExpirationInDays: js.UndefOr[Integer1To5000]
    var S3BucketName: js.UndefOr[String3To255]
  }

  object CrlConfiguration {
    @inline
    def apply(
        Enabled: Boolean,
        CustomCname: js.UndefOr[String253] = js.undefined,
        ExpirationInDays: js.UndefOr[Integer1To5000] = js.undefined,
        S3BucketName: js.UndefOr[String3To255] = js.undefined
    ): CrlConfiguration = {
      val __obj = js.Dynamic.literal(
        "Enabled" -> Enabled.asInstanceOf[js.Any]
      )

      CustomCname.foreach(__v => __obj.updateDynamic("CustomCname")(__v.asInstanceOf[js.Any]))
      ExpirationInDays.foreach(__v => __obj.updateDynamic("ExpirationInDays")(__v.asInstanceOf[js.Any]))
      S3BucketName.foreach(__v => __obj.updateDynamic("S3BucketName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CrlConfiguration]
    }
  }

  /** Describes the certificate extensions to be added to the certificate signing request (CSR).
    */
  @js.native
  trait CsrExtensions extends js.Object {
    var KeyUsage: js.UndefOr[KeyUsage]
    var SubjectInformationAccess: js.UndefOr[AccessDescriptionList]
  }

  object CsrExtensions {
    @inline
    def apply(
        KeyUsage: js.UndefOr[KeyUsage] = js.undefined,
        SubjectInformationAccess: js.UndefOr[AccessDescriptionList] = js.undefined
    ): CsrExtensions = {
      val __obj = js.Dynamic.literal()
      KeyUsage.foreach(__v => __obj.updateDynamic("KeyUsage")(__v.asInstanceOf[js.Any]))
      SubjectInformationAccess.foreach(__v => __obj.updateDynamic("SubjectInformationAccess")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CsrExtensions]
    }
  }

  @js.native
  trait DeleteCertificateAuthorityRequest extends js.Object {
    var CertificateAuthorityArn: Arn
    var PermanentDeletionTimeInDays: js.UndefOr[PermanentDeletionTimeInDays]
  }

  object DeleteCertificateAuthorityRequest {
    @inline
    def apply(
        CertificateAuthorityArn: Arn,
        PermanentDeletionTimeInDays: js.UndefOr[PermanentDeletionTimeInDays] = js.undefined
    ): DeleteCertificateAuthorityRequest = {
      val __obj = js.Dynamic.literal(
        "CertificateAuthorityArn" -> CertificateAuthorityArn.asInstanceOf[js.Any]
      )

      PermanentDeletionTimeInDays.foreach(__v => __obj.updateDynamic("PermanentDeletionTimeInDays")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteCertificateAuthorityRequest]
    }
  }

  @js.native
  trait DeletePermissionRequest extends js.Object {
    var CertificateAuthorityArn: Arn
    var Principal: Principal
    var SourceAccount: js.UndefOr[AccountId]
  }

  object DeletePermissionRequest {
    @inline
    def apply(
        CertificateAuthorityArn: Arn,
        Principal: Principal,
        SourceAccount: js.UndefOr[AccountId] = js.undefined
    ): DeletePermissionRequest = {
      val __obj = js.Dynamic.literal(
        "CertificateAuthorityArn" -> CertificateAuthorityArn.asInstanceOf[js.Any],
        "Principal" -> Principal.asInstanceOf[js.Any]
      )

      SourceAccount.foreach(__v => __obj.updateDynamic("SourceAccount")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeletePermissionRequest]
    }
  }

  @js.native
  trait DeletePolicyRequest extends js.Object {
    var ResourceArn: Arn
  }

  object DeletePolicyRequest {
    @inline
    def apply(
        ResourceArn: Arn
    ): DeletePolicyRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeletePolicyRequest]
    }
  }

  @js.native
  trait DescribeCertificateAuthorityAuditReportRequest extends js.Object {
    var AuditReportId: AuditReportId
    var CertificateAuthorityArn: Arn
  }

  object DescribeCertificateAuthorityAuditReportRequest {
    @inline
    def apply(
        AuditReportId: AuditReportId,
        CertificateAuthorityArn: Arn
    ): DescribeCertificateAuthorityAuditReportRequest = {
      val __obj = js.Dynamic.literal(
        "AuditReportId" -> AuditReportId.asInstanceOf[js.Any],
        "CertificateAuthorityArn" -> CertificateAuthorityArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeCertificateAuthorityAuditReportRequest]
    }
  }

  @js.native
  trait DescribeCertificateAuthorityAuditReportResponse extends js.Object {
    var AuditReportStatus: js.UndefOr[AuditReportStatus]
    var CreatedAt: js.UndefOr[TStamp]
    var S3BucketName: js.UndefOr[S3BucketName]
    var S3Key: js.UndefOr[S3Key]
  }

  object DescribeCertificateAuthorityAuditReportResponse {
    @inline
    def apply(
        AuditReportStatus: js.UndefOr[AuditReportStatus] = js.undefined,
        CreatedAt: js.UndefOr[TStamp] = js.undefined,
        S3BucketName: js.UndefOr[S3BucketName] = js.undefined,
        S3Key: js.UndefOr[S3Key] = js.undefined
    ): DescribeCertificateAuthorityAuditReportResponse = {
      val __obj = js.Dynamic.literal()
      AuditReportStatus.foreach(__v => __obj.updateDynamic("AuditReportStatus")(__v.asInstanceOf[js.Any]))
      CreatedAt.foreach(__v => __obj.updateDynamic("CreatedAt")(__v.asInstanceOf[js.Any]))
      S3BucketName.foreach(__v => __obj.updateDynamic("S3BucketName")(__v.asInstanceOf[js.Any]))
      S3Key.foreach(__v => __obj.updateDynamic("S3Key")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeCertificateAuthorityAuditReportResponse]
    }
  }

  @js.native
  trait DescribeCertificateAuthorityRequest extends js.Object {
    var CertificateAuthorityArn: Arn
  }

  object DescribeCertificateAuthorityRequest {
    @inline
    def apply(
        CertificateAuthorityArn: Arn
    ): DescribeCertificateAuthorityRequest = {
      val __obj = js.Dynamic.literal(
        "CertificateAuthorityArn" -> CertificateAuthorityArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeCertificateAuthorityRequest]
    }
  }

  @js.native
  trait DescribeCertificateAuthorityResponse extends js.Object {
    var CertificateAuthority: js.UndefOr[CertificateAuthority]
  }

  object DescribeCertificateAuthorityResponse {
    @inline
    def apply(
        CertificateAuthority: js.UndefOr[CertificateAuthority] = js.undefined
    ): DescribeCertificateAuthorityResponse = {
      val __obj = js.Dynamic.literal()
      CertificateAuthority.foreach(__v => __obj.updateDynamic("CertificateAuthority")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeCertificateAuthorityResponse]
    }
  }

  /** Describes an Electronic Data Interchange (EDI) entity as described in as defined in [[https://tools.ietf.org/html/rfc5280|Subject Alternative Name]] in RFC 5280.
    */
  @js.native
  trait EdiPartyName extends js.Object {
    var PartyName: String256
    var NameAssigner: js.UndefOr[String256]
  }

  object EdiPartyName {
    @inline
    def apply(
        PartyName: String256,
        NameAssigner: js.UndefOr[String256] = js.undefined
    ): EdiPartyName = {
      val __obj = js.Dynamic.literal(
        "PartyName" -> PartyName.asInstanceOf[js.Any]
      )

      NameAssigner.foreach(__v => __obj.updateDynamic("NameAssigner")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EdiPartyName]
    }
  }

  @js.native
  sealed trait FailureReason extends js.Any
  object FailureReason {
    val REQUEST_TIMED_OUT = "REQUEST_TIMED_OUT".asInstanceOf[FailureReason]
    val UNSUPPORTED_ALGORITHM = "UNSUPPORTED_ALGORITHM".asInstanceOf[FailureReason]
    val OTHER = "OTHER".asInstanceOf[FailureReason]

    @inline def values = js.Array(REQUEST_TIMED_OUT, UNSUPPORTED_ALGORITHM, OTHER)
  }

  /** Describes an ASN.1 X.400 <code>GeneralName</code> as defined in [[https://tools.ietf.org/html/rfc5280|RFC 5280]]. Only one of the following naming options should be providied. Providing more than one option results in an <code>InvalidArgsException</code> error.
    */
  @js.native
  trait GeneralName extends js.Object {
    var DirectoryName: js.UndefOr[ASN1Subject]
    var DnsName: js.UndefOr[String253]
    var EdiPartyName: js.UndefOr[EdiPartyName]
    var IpAddress: js.UndefOr[String39]
    var OtherName: js.UndefOr[OtherName]
    var RegisteredId: js.UndefOr[CustomObjectIdentifier]
    var Rfc822Name: js.UndefOr[String256]
    var UniformResourceIdentifier: js.UndefOr[String253]
  }

  object GeneralName {
    @inline
    def apply(
        DirectoryName: js.UndefOr[ASN1Subject] = js.undefined,
        DnsName: js.UndefOr[String253] = js.undefined,
        EdiPartyName: js.UndefOr[EdiPartyName] = js.undefined,
        IpAddress: js.UndefOr[String39] = js.undefined,
        OtherName: js.UndefOr[OtherName] = js.undefined,
        RegisteredId: js.UndefOr[CustomObjectIdentifier] = js.undefined,
        Rfc822Name: js.UndefOr[String256] = js.undefined,
        UniformResourceIdentifier: js.UndefOr[String253] = js.undefined
    ): GeneralName = {
      val __obj = js.Dynamic.literal()
      DirectoryName.foreach(__v => __obj.updateDynamic("DirectoryName")(__v.asInstanceOf[js.Any]))
      DnsName.foreach(__v => __obj.updateDynamic("DnsName")(__v.asInstanceOf[js.Any]))
      EdiPartyName.foreach(__v => __obj.updateDynamic("EdiPartyName")(__v.asInstanceOf[js.Any]))
      IpAddress.foreach(__v => __obj.updateDynamic("IpAddress")(__v.asInstanceOf[js.Any]))
      OtherName.foreach(__v => __obj.updateDynamic("OtherName")(__v.asInstanceOf[js.Any]))
      RegisteredId.foreach(__v => __obj.updateDynamic("RegisteredId")(__v.asInstanceOf[js.Any]))
      Rfc822Name.foreach(__v => __obj.updateDynamic("Rfc822Name")(__v.asInstanceOf[js.Any]))
      UniformResourceIdentifier.foreach(__v => __obj.updateDynamic("UniformResourceIdentifier")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GeneralName]
    }
  }

  @js.native
  trait GetCertificateAuthorityCertificateRequest extends js.Object {
    var CertificateAuthorityArn: Arn
  }

  object GetCertificateAuthorityCertificateRequest {
    @inline
    def apply(
        CertificateAuthorityArn: Arn
    ): GetCertificateAuthorityCertificateRequest = {
      val __obj = js.Dynamic.literal(
        "CertificateAuthorityArn" -> CertificateAuthorityArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetCertificateAuthorityCertificateRequest]
    }
  }

  @js.native
  trait GetCertificateAuthorityCertificateResponse extends js.Object {
    var Certificate: js.UndefOr[CertificateBody]
    var CertificateChain: js.UndefOr[CertificateChain]
  }

  object GetCertificateAuthorityCertificateResponse {
    @inline
    def apply(
        Certificate: js.UndefOr[CertificateBody] = js.undefined,
        CertificateChain: js.UndefOr[CertificateChain] = js.undefined
    ): GetCertificateAuthorityCertificateResponse = {
      val __obj = js.Dynamic.literal()
      Certificate.foreach(__v => __obj.updateDynamic("Certificate")(__v.asInstanceOf[js.Any]))
      CertificateChain.foreach(__v => __obj.updateDynamic("CertificateChain")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetCertificateAuthorityCertificateResponse]
    }
  }

  @js.native
  trait GetCertificateAuthorityCsrRequest extends js.Object {
    var CertificateAuthorityArn: Arn
  }

  object GetCertificateAuthorityCsrRequest {
    @inline
    def apply(
        CertificateAuthorityArn: Arn
    ): GetCertificateAuthorityCsrRequest = {
      val __obj = js.Dynamic.literal(
        "CertificateAuthorityArn" -> CertificateAuthorityArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetCertificateAuthorityCsrRequest]
    }
  }

  @js.native
  trait GetCertificateAuthorityCsrResponse extends js.Object {
    var Csr: js.UndefOr[CsrBody]
  }

  object GetCertificateAuthorityCsrResponse {
    @inline
    def apply(
        Csr: js.UndefOr[CsrBody] = js.undefined
    ): GetCertificateAuthorityCsrResponse = {
      val __obj = js.Dynamic.literal()
      Csr.foreach(__v => __obj.updateDynamic("Csr")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetCertificateAuthorityCsrResponse]
    }
  }

  @js.native
  trait GetCertificateRequest extends js.Object {
    var CertificateArn: Arn
    var CertificateAuthorityArn: Arn
  }

  object GetCertificateRequest {
    @inline
    def apply(
        CertificateArn: Arn,
        CertificateAuthorityArn: Arn
    ): GetCertificateRequest = {
      val __obj = js.Dynamic.literal(
        "CertificateArn" -> CertificateArn.asInstanceOf[js.Any],
        "CertificateAuthorityArn" -> CertificateAuthorityArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetCertificateRequest]
    }
  }

  @js.native
  trait GetCertificateResponse extends js.Object {
    var Certificate: js.UndefOr[CertificateBody]
    var CertificateChain: js.UndefOr[CertificateChain]
  }

  object GetCertificateResponse {
    @inline
    def apply(
        Certificate: js.UndefOr[CertificateBody] = js.undefined,
        CertificateChain: js.UndefOr[CertificateChain] = js.undefined
    ): GetCertificateResponse = {
      val __obj = js.Dynamic.literal()
      Certificate.foreach(__v => __obj.updateDynamic("Certificate")(__v.asInstanceOf[js.Any]))
      CertificateChain.foreach(__v => __obj.updateDynamic("CertificateChain")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetCertificateResponse]
    }
  }

  @js.native
  trait GetPolicyRequest extends js.Object {
    var ResourceArn: Arn
  }

  object GetPolicyRequest {
    @inline
    def apply(
        ResourceArn: Arn
    ): GetPolicyRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetPolicyRequest]
    }
  }

  @js.native
  trait GetPolicyResponse extends js.Object {
    var Policy: js.UndefOr[AWSPolicy]
  }

  object GetPolicyResponse {
    @inline
    def apply(
        Policy: js.UndefOr[AWSPolicy] = js.undefined
    ): GetPolicyResponse = {
      val __obj = js.Dynamic.literal()
      Policy.foreach(__v => __obj.updateDynamic("Policy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetPolicyResponse]
    }
  }

  @js.native
  trait ImportCertificateAuthorityCertificateRequest extends js.Object {
    var Certificate: CertificateBodyBlob
    var CertificateAuthorityArn: Arn
    var CertificateChain: js.UndefOr[CertificateChainBlob]
  }

  object ImportCertificateAuthorityCertificateRequest {
    @inline
    def apply(
        Certificate: CertificateBodyBlob,
        CertificateAuthorityArn: Arn,
        CertificateChain: js.UndefOr[CertificateChainBlob] = js.undefined
    ): ImportCertificateAuthorityCertificateRequest = {
      val __obj = js.Dynamic.literal(
        "Certificate" -> Certificate.asInstanceOf[js.Any],
        "CertificateAuthorityArn" -> CertificateAuthorityArn.asInstanceOf[js.Any]
      )

      CertificateChain.foreach(__v => __obj.updateDynamic("CertificateChain")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ImportCertificateAuthorityCertificateRequest]
    }
  }

  @js.native
  trait IssueCertificateRequest extends js.Object {
    var CertificateAuthorityArn: Arn
    var Csr: CsrBlob
    var SigningAlgorithm: SigningAlgorithm
    var Validity: Validity
    var IdempotencyToken: js.UndefOr[IdempotencyToken]
    var TemplateArn: js.UndefOr[Arn]
  }

  object IssueCertificateRequest {
    @inline
    def apply(
        CertificateAuthorityArn: Arn,
        Csr: CsrBlob,
        SigningAlgorithm: SigningAlgorithm,
        Validity: Validity,
        IdempotencyToken: js.UndefOr[IdempotencyToken] = js.undefined,
        TemplateArn: js.UndefOr[Arn] = js.undefined
    ): IssueCertificateRequest = {
      val __obj = js.Dynamic.literal(
        "CertificateAuthorityArn" -> CertificateAuthorityArn.asInstanceOf[js.Any],
        "Csr" -> Csr.asInstanceOf[js.Any],
        "SigningAlgorithm" -> SigningAlgorithm.asInstanceOf[js.Any],
        "Validity" -> Validity.asInstanceOf[js.Any]
      )

      IdempotencyToken.foreach(__v => __obj.updateDynamic("IdempotencyToken")(__v.asInstanceOf[js.Any]))
      TemplateArn.foreach(__v => __obj.updateDynamic("TemplateArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[IssueCertificateRequest]
    }
  }

  @js.native
  trait IssueCertificateResponse extends js.Object {
    var CertificateArn: js.UndefOr[Arn]
  }

  object IssueCertificateResponse {
    @inline
    def apply(
        CertificateArn: js.UndefOr[Arn] = js.undefined
    ): IssueCertificateResponse = {
      val __obj = js.Dynamic.literal()
      CertificateArn.foreach(__v => __obj.updateDynamic("CertificateArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[IssueCertificateResponse]
    }
  }

  @js.native
  sealed trait KeyAlgorithm extends js.Any
  object KeyAlgorithm {
    val RSA_2048 = "RSA_2048".asInstanceOf[KeyAlgorithm]
    val RSA_4096 = "RSA_4096".asInstanceOf[KeyAlgorithm]
    val EC_prime256v1 = "EC_prime256v1".asInstanceOf[KeyAlgorithm]
    val EC_secp384r1 = "EC_secp384r1".asInstanceOf[KeyAlgorithm]

    @inline def values = js.Array(RSA_2048, RSA_4096, EC_prime256v1, EC_secp384r1)
  }

  /** Defines one or more purposes for which the key contained in the certificate can be used. Default value for each option is false.
    */
  @js.native
  trait KeyUsage extends js.Object {
    var CRLSign: js.UndefOr[Boolean]
    var DataEncipherment: js.UndefOr[Boolean]
    var DecipherOnly: js.UndefOr[Boolean]
    var DigitalSignature: js.UndefOr[Boolean]
    var EncipherOnly: js.UndefOr[Boolean]
    var KeyAgreement: js.UndefOr[Boolean]
    var KeyCertSign: js.UndefOr[Boolean]
    var KeyEncipherment: js.UndefOr[Boolean]
    var NonRepudiation: js.UndefOr[Boolean]
  }

  object KeyUsage {
    @inline
    def apply(
        CRLSign: js.UndefOr[Boolean] = js.undefined,
        DataEncipherment: js.UndefOr[Boolean] = js.undefined,
        DecipherOnly: js.UndefOr[Boolean] = js.undefined,
        DigitalSignature: js.UndefOr[Boolean] = js.undefined,
        EncipherOnly: js.UndefOr[Boolean] = js.undefined,
        KeyAgreement: js.UndefOr[Boolean] = js.undefined,
        KeyCertSign: js.UndefOr[Boolean] = js.undefined,
        KeyEncipherment: js.UndefOr[Boolean] = js.undefined,
        NonRepudiation: js.UndefOr[Boolean] = js.undefined
    ): KeyUsage = {
      val __obj = js.Dynamic.literal()
      CRLSign.foreach(__v => __obj.updateDynamic("CRLSign")(__v.asInstanceOf[js.Any]))
      DataEncipherment.foreach(__v => __obj.updateDynamic("DataEncipherment")(__v.asInstanceOf[js.Any]))
      DecipherOnly.foreach(__v => __obj.updateDynamic("DecipherOnly")(__v.asInstanceOf[js.Any]))
      DigitalSignature.foreach(__v => __obj.updateDynamic("DigitalSignature")(__v.asInstanceOf[js.Any]))
      EncipherOnly.foreach(__v => __obj.updateDynamic("EncipherOnly")(__v.asInstanceOf[js.Any]))
      KeyAgreement.foreach(__v => __obj.updateDynamic("KeyAgreement")(__v.asInstanceOf[js.Any]))
      KeyCertSign.foreach(__v => __obj.updateDynamic("KeyCertSign")(__v.asInstanceOf[js.Any]))
      KeyEncipherment.foreach(__v => __obj.updateDynamic("KeyEncipherment")(__v.asInstanceOf[js.Any]))
      NonRepudiation.foreach(__v => __obj.updateDynamic("NonRepudiation")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[KeyUsage]
    }
  }

  @js.native
  trait ListCertificateAuthoritiesRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
    var ResourceOwner: js.UndefOr[ResourceOwner]
  }

  object ListCertificateAuthoritiesRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        ResourceOwner: js.UndefOr[ResourceOwner] = js.undefined
    ): ListCertificateAuthoritiesRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      ResourceOwner.foreach(__v => __obj.updateDynamic("ResourceOwner")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListCertificateAuthoritiesRequest]
    }
  }

  @js.native
  trait ListCertificateAuthoritiesResponse extends js.Object {
    var CertificateAuthorities: js.UndefOr[CertificateAuthorities]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListCertificateAuthoritiesResponse {
    @inline
    def apply(
        CertificateAuthorities: js.UndefOr[CertificateAuthorities] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListCertificateAuthoritiesResponse = {
      val __obj = js.Dynamic.literal()
      CertificateAuthorities.foreach(__v => __obj.updateDynamic("CertificateAuthorities")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListCertificateAuthoritiesResponse]
    }
  }

  @js.native
  trait ListPermissionsRequest extends js.Object {
    var CertificateAuthorityArn: Arn
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListPermissionsRequest {
    @inline
    def apply(
        CertificateAuthorityArn: Arn,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListPermissionsRequest = {
      val __obj = js.Dynamic.literal(
        "CertificateAuthorityArn" -> CertificateAuthorityArn.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPermissionsRequest]
    }
  }

  @js.native
  trait ListPermissionsResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Permissions: js.UndefOr[PermissionList]
  }

  object ListPermissionsResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        Permissions: js.UndefOr[PermissionList] = js.undefined
    ): ListPermissionsResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Permissions.foreach(__v => __obj.updateDynamic("Permissions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPermissionsResponse]
    }
  }

  @js.native
  trait ListTagsRequest extends js.Object {
    var CertificateAuthorityArn: Arn
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListTagsRequest {
    @inline
    def apply(
        CertificateAuthorityArn: Arn,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListTagsRequest = {
      val __obj = js.Dynamic.literal(
        "CertificateAuthorityArn" -> CertificateAuthorityArn.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsRequest]
    }
  }

  @js.native
  trait ListTagsResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Tags: js.UndefOr[TagList]
  }

  object ListTagsResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): ListTagsResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsResponse]
    }
  }

  /** Defines a custom ASN.1 X.400 <code>GeneralName</code> using an object identifier (OID) and value. The OID must satisfy the regular expression shown below. For more information, see NIST's definition of [[https://csrc.nist.gov/glossary/term/Object_Identifier|Object Identifier (OID)]].
    */
  @js.native
  trait OtherName extends js.Object {
    var TypeId: CustomObjectIdentifier
    var Value: String256
  }

  object OtherName {
    @inline
    def apply(
        TypeId: CustomObjectIdentifier,
        Value: String256
    ): OtherName = {
      val __obj = js.Dynamic.literal(
        "TypeId" -> TypeId.asInstanceOf[js.Any],
        "Value" -> Value.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[OtherName]
    }
  }

  /** Permissions designate which private CA actions can be performed by an AWS service or entity. In order for ACM to automatically renew private certificates, you must give the ACM service principal all available permissions (<code>IssueCertificate</code>, <code>GetCertificate</code>, and <code>ListPermissions</code>). Permissions can be assigned with the [[https://docs.aws.amazon.com/acm-pca/latest/APIReference/API_CreatePermission.html|CreatePermission]] action, removed with the [[https://docs.aws.amazon.com/acm-pca/latest/APIReference/API_DeletePermission.html|DeletePermission]] action, and listed with the [[https://docs.aws.amazon.com/acm-pca/latest/APIReference/API_ListPermissions.html|ListPermissions]] action.
    */
  @js.native
  trait Permission extends js.Object {
    var Actions: js.UndefOr[ActionList]
    var CertificateAuthorityArn: js.UndefOr[Arn]
    var CreatedAt: js.UndefOr[TStamp]
    var Policy: js.UndefOr[AWSPolicy]
    var Principal: js.UndefOr[Principal]
    var SourceAccount: js.UndefOr[AccountId]
  }

  object Permission {
    @inline
    def apply(
        Actions: js.UndefOr[ActionList] = js.undefined,
        CertificateAuthorityArn: js.UndefOr[Arn] = js.undefined,
        CreatedAt: js.UndefOr[TStamp] = js.undefined,
        Policy: js.UndefOr[AWSPolicy] = js.undefined,
        Principal: js.UndefOr[Principal] = js.undefined,
        SourceAccount: js.UndefOr[AccountId] = js.undefined
    ): Permission = {
      val __obj = js.Dynamic.literal()
      Actions.foreach(__v => __obj.updateDynamic("Actions")(__v.asInstanceOf[js.Any]))
      CertificateAuthorityArn.foreach(__v => __obj.updateDynamic("CertificateAuthorityArn")(__v.asInstanceOf[js.Any]))
      CreatedAt.foreach(__v => __obj.updateDynamic("CreatedAt")(__v.asInstanceOf[js.Any]))
      Policy.foreach(__v => __obj.updateDynamic("Policy")(__v.asInstanceOf[js.Any]))
      Principal.foreach(__v => __obj.updateDynamic("Principal")(__v.asInstanceOf[js.Any]))
      SourceAccount.foreach(__v => __obj.updateDynamic("SourceAccount")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Permission]
    }
  }

  @js.native
  trait PutPolicyRequest extends js.Object {
    var Policy: AWSPolicy
    var ResourceArn: Arn
  }

  object PutPolicyRequest {
    @inline
    def apply(
        Policy: AWSPolicy,
        ResourceArn: Arn
    ): PutPolicyRequest = {
      val __obj = js.Dynamic.literal(
        "Policy" -> Policy.asInstanceOf[js.Any],
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[PutPolicyRequest]
    }
  }

  @js.native
  sealed trait ResourceOwner extends js.Any
  object ResourceOwner {
    val SELF = "SELF".asInstanceOf[ResourceOwner]
    val OTHER_ACCOUNTS = "OTHER_ACCOUNTS".asInstanceOf[ResourceOwner]

    @inline def values = js.Array(SELF, OTHER_ACCOUNTS)
  }

  @js.native
  trait RestoreCertificateAuthorityRequest extends js.Object {
    var CertificateAuthorityArn: Arn
  }

  object RestoreCertificateAuthorityRequest {
    @inline
    def apply(
        CertificateAuthorityArn: Arn
    ): RestoreCertificateAuthorityRequest = {
      val __obj = js.Dynamic.literal(
        "CertificateAuthorityArn" -> CertificateAuthorityArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[RestoreCertificateAuthorityRequest]
    }
  }

  /** Certificate revocation information used by the [[https://docs.aws.amazon.com/acm-pca/latest/APIReference/API_CreateCertificateAuthority.html|CreateCertificateAuthority]] and [[https://docs.aws.amazon.com/acm-pca/latest/APIReference/API_UpdateCertificateAuthority.html|UpdateCertificateAuthority]] actions. Your private certificate authority (CA) can create and maintain a certificate revocation list (CRL). A CRL contains information about certificates revoked by your CA. For more information, see [[https://docs.aws.amazon.com/acm-pca/latest/APIReference/API_RevokeCertificate.html|RevokeCertificate]].
    */
  @js.native
  trait RevocationConfiguration extends js.Object {
    var CrlConfiguration: js.UndefOr[CrlConfiguration]
  }

  object RevocationConfiguration {
    @inline
    def apply(
        CrlConfiguration: js.UndefOr[CrlConfiguration] = js.undefined
    ): RevocationConfiguration = {
      val __obj = js.Dynamic.literal()
      CrlConfiguration.foreach(__v => __obj.updateDynamic("CrlConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RevocationConfiguration]
    }
  }

  @js.native
  sealed trait RevocationReason extends js.Any
  object RevocationReason {
    val UNSPECIFIED = "UNSPECIFIED".asInstanceOf[RevocationReason]
    val KEY_COMPROMISE = "KEY_COMPROMISE".asInstanceOf[RevocationReason]
    val CERTIFICATE_AUTHORITY_COMPROMISE = "CERTIFICATE_AUTHORITY_COMPROMISE".asInstanceOf[RevocationReason]
    val AFFILIATION_CHANGED = "AFFILIATION_CHANGED".asInstanceOf[RevocationReason]
    val SUPERSEDED = "SUPERSEDED".asInstanceOf[RevocationReason]
    val CESSATION_OF_OPERATION = "CESSATION_OF_OPERATION".asInstanceOf[RevocationReason]
    val PRIVILEGE_WITHDRAWN = "PRIVILEGE_WITHDRAWN".asInstanceOf[RevocationReason]
    val A_A_COMPROMISE = "A_A_COMPROMISE".asInstanceOf[RevocationReason]

    @inline def values = js.Array(UNSPECIFIED, KEY_COMPROMISE, CERTIFICATE_AUTHORITY_COMPROMISE, AFFILIATION_CHANGED, SUPERSEDED, CESSATION_OF_OPERATION, PRIVILEGE_WITHDRAWN, A_A_COMPROMISE)
  }

  @js.native
  trait RevokeCertificateRequest extends js.Object {
    var CertificateAuthorityArn: Arn
    var CertificateSerial: String128
    var RevocationReason: RevocationReason
  }

  object RevokeCertificateRequest {
    @inline
    def apply(
        CertificateAuthorityArn: Arn,
        CertificateSerial: String128,
        RevocationReason: RevocationReason
    ): RevokeCertificateRequest = {
      val __obj = js.Dynamic.literal(
        "CertificateAuthorityArn" -> CertificateAuthorityArn.asInstanceOf[js.Any],
        "CertificateSerial" -> CertificateSerial.asInstanceOf[js.Any],
        "RevocationReason" -> RevocationReason.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[RevokeCertificateRequest]
    }
  }

  @js.native
  sealed trait SigningAlgorithm extends js.Any
  object SigningAlgorithm {
    val SHA256WITHECDSA = "SHA256WITHECDSA".asInstanceOf[SigningAlgorithm]
    val SHA384WITHECDSA = "SHA384WITHECDSA".asInstanceOf[SigningAlgorithm]
    val SHA512WITHECDSA = "SHA512WITHECDSA".asInstanceOf[SigningAlgorithm]
    val SHA256WITHRSA = "SHA256WITHRSA".asInstanceOf[SigningAlgorithm]
    val SHA384WITHRSA = "SHA384WITHRSA".asInstanceOf[SigningAlgorithm]
    val SHA512WITHRSA = "SHA512WITHRSA".asInstanceOf[SigningAlgorithm]

    @inline def values = js.Array(SHA256WITHECDSA, SHA384WITHECDSA, SHA512WITHECDSA, SHA256WITHRSA, SHA384WITHRSA, SHA512WITHRSA)
  }

  /** Tags are labels that you can use to identify and organize your private CAs. Each tag consists of a key and an optional value. You can associate up to 50 tags with a private CA. To add one or more tags to a private CA, call the [[https://docs.aws.amazon.com/acm-pca/latest/APIReference/API_TagCertificateAuthority.html|TagCertificateAuthority]] action. To remove a tag, call the [[https://docs.aws.amazon.com/acm-pca/latest/APIReference/API_UntagCertificateAuthority.html|UntagCertificateAuthority]] action.
    */
  @js.native
  trait Tag extends js.Object {
    var Key: TagKey
    var Value: js.UndefOr[TagValue]
  }

  object Tag {
    @inline
    def apply(
        Key: TagKey,
        Value: js.UndefOr[TagValue] = js.undefined
    ): Tag = {
      val __obj = js.Dynamic.literal(
        "Key" -> Key.asInstanceOf[js.Any]
      )

      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Tag]
    }
  }

  @js.native
  trait TagCertificateAuthorityRequest extends js.Object {
    var CertificateAuthorityArn: Arn
    var Tags: TagList
  }

  object TagCertificateAuthorityRequest {
    @inline
    def apply(
        CertificateAuthorityArn: Arn,
        Tags: TagList
    ): TagCertificateAuthorityRequest = {
      val __obj = js.Dynamic.literal(
        "CertificateAuthorityArn" -> CertificateAuthorityArn.asInstanceOf[js.Any],
        "Tags" -> Tags.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[TagCertificateAuthorityRequest]
    }
  }

  @js.native
  trait UntagCertificateAuthorityRequest extends js.Object {
    var CertificateAuthorityArn: Arn
    var Tags: TagList
  }

  object UntagCertificateAuthorityRequest {
    @inline
    def apply(
        CertificateAuthorityArn: Arn,
        Tags: TagList
    ): UntagCertificateAuthorityRequest = {
      val __obj = js.Dynamic.literal(
        "CertificateAuthorityArn" -> CertificateAuthorityArn.asInstanceOf[js.Any],
        "Tags" -> Tags.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UntagCertificateAuthorityRequest]
    }
  }

  @js.native
  trait UpdateCertificateAuthorityRequest extends js.Object {
    var CertificateAuthorityArn: Arn
    var RevocationConfiguration: js.UndefOr[RevocationConfiguration]
    var Status: js.UndefOr[CertificateAuthorityStatus]
  }

  object UpdateCertificateAuthorityRequest {
    @inline
    def apply(
        CertificateAuthorityArn: Arn,
        RevocationConfiguration: js.UndefOr[RevocationConfiguration] = js.undefined,
        Status: js.UndefOr[CertificateAuthorityStatus] = js.undefined
    ): UpdateCertificateAuthorityRequest = {
      val __obj = js.Dynamic.literal(
        "CertificateAuthorityArn" -> CertificateAuthorityArn.asInstanceOf[js.Any]
      )

      RevocationConfiguration.foreach(__v => __obj.updateDynamic("RevocationConfiguration")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateCertificateAuthorityRequest]
    }
  }

  /** Validity specifies the period of time during which a certificate is valid. Validity can be expressed as an explicit date and time when the certificate expires, or as a span of time after issuance, stated in days, months, or years. For more information, see [[https://tools.ietf.org/html/rfc5280#section-4.1.2.5|Validity]] in RFC 5280.
    * You can issue a certificate by calling the [[https://docs.aws.amazon.com/acm-pca/latest/APIReference/API_IssueCertificate.html|IssueCertificate]] action.
    */
  @js.native
  trait Validity extends js.Object {
    var Type: ValidityPeriodType
    var Value: PositiveLong
  }

  object Validity {
    @inline
    def apply(
        Type: ValidityPeriodType,
        Value: PositiveLong
    ): Validity = {
      val __obj = js.Dynamic.literal(
        "Type" -> Type.asInstanceOf[js.Any],
        "Value" -> Value.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[Validity]
    }
  }

  @js.native
  sealed trait ValidityPeriodType extends js.Any
  object ValidityPeriodType {
    val END_DATE = "END_DATE".asInstanceOf[ValidityPeriodType]
    val ABSOLUTE = "ABSOLUTE".asInstanceOf[ValidityPeriodType]
    val DAYS = "DAYS".asInstanceOf[ValidityPeriodType]
    val MONTHS = "MONTHS".asInstanceOf[ValidityPeriodType]
    val YEARS = "YEARS".asInstanceOf[ValidityPeriodType]

    @inline def values = js.Array(END_DATE, ABSOLUTE, DAYS, MONTHS, YEARS)
  }
}
