package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

package object acmpca {
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
  type DistinguishedNameQualifierString = String
  type IdempotencyToken = String
  type Integer1To5000 = Int
  type MaxResults = Int
  type NextToken = String
  type PermanentDeletionTimeInDays = Int
  type PermissionList = js.Array[Permission]
  type PositiveLong = Double
  type Principal = String
  type String128 = String
  type String16 = String
  type String253 = String
  type String3 = String
  type String3To255 = String
  type String40 = String
  type String5 = String
  type String64 = String
  type TStamp = js.Date
  type TagKey = String
  type TagList = js.Array[Tag]
  type TagValue = String

  implicit final class ACMPCAOps(private val service: ACMPCA) extends AnyVal {

    @inline def createCertificateAuthorityAuditReportFuture(
        params: CreateCertificateAuthorityAuditReportRequest
    ): Future[CreateCertificateAuthorityAuditReportResponse] =
      service.createCertificateAuthorityAuditReport(params).promise().toFuture
    @inline def createCertificateAuthorityFuture(
        params: CreateCertificateAuthorityRequest
    ): Future[CreateCertificateAuthorityResponse] = service.createCertificateAuthority(params).promise().toFuture
    @inline def createPermissionFuture(params: CreatePermissionRequest): Future[js.Object] =
      service.createPermission(params).promise().toFuture
    @inline def deleteCertificateAuthorityFuture(params: DeleteCertificateAuthorityRequest): Future[js.Object] =
      service.deleteCertificateAuthority(params).promise().toFuture
    @inline def deletePermissionFuture(params: DeletePermissionRequest): Future[js.Object] =
      service.deletePermission(params).promise().toFuture
    @inline def describeCertificateAuthorityAuditReportFuture(
        params: DescribeCertificateAuthorityAuditReportRequest
    ): Future[DescribeCertificateAuthorityAuditReportResponse] =
      service.describeCertificateAuthorityAuditReport(params).promise().toFuture
    @inline def describeCertificateAuthorityFuture(
        params: DescribeCertificateAuthorityRequest
    ): Future[DescribeCertificateAuthorityResponse] = service.describeCertificateAuthority(params).promise().toFuture
    @inline def getCertificateAuthorityCertificateFuture(
        params: GetCertificateAuthorityCertificateRequest
    ): Future[GetCertificateAuthorityCertificateResponse] =
      service.getCertificateAuthorityCertificate(params).promise().toFuture
    @inline def getCertificateAuthorityCsrFuture(
        params: GetCertificateAuthorityCsrRequest
    ): Future[GetCertificateAuthorityCsrResponse] = service.getCertificateAuthorityCsr(params).promise().toFuture
    @inline def getCertificateFuture(params: GetCertificateRequest): Future[GetCertificateResponse] =
      service.getCertificate(params).promise().toFuture
    @inline def importCertificateAuthorityCertificateFuture(
        params: ImportCertificateAuthorityCertificateRequest
    ): Future[js.Object] = service.importCertificateAuthorityCertificate(params).promise().toFuture
    @inline def issueCertificateFuture(params: IssueCertificateRequest): Future[IssueCertificateResponse] =
      service.issueCertificate(params).promise().toFuture
    @inline def listCertificateAuthoritiesFuture(
        params: ListCertificateAuthoritiesRequest
    ): Future[ListCertificateAuthoritiesResponse] = service.listCertificateAuthorities(params).promise().toFuture
    @inline def listPermissionsFuture(params: ListPermissionsRequest): Future[ListPermissionsResponse] =
      service.listPermissions(params).promise().toFuture
    @inline def listTagsFuture(params: ListTagsRequest): Future[ListTagsResponse] =
      service.listTags(params).promise().toFuture
    @inline def restoreCertificateAuthorityFuture(params: RestoreCertificateAuthorityRequest): Future[js.Object] =
      service.restoreCertificateAuthority(params).promise().toFuture
    @inline def revokeCertificateFuture(params: RevokeCertificateRequest): Future[js.Object] =
      service.revokeCertificate(params).promise().toFuture
    @inline def tagCertificateAuthorityFuture(params: TagCertificateAuthorityRequest): Future[js.Object] =
      service.tagCertificateAuthority(params).promise().toFuture
    @inline def untagCertificateAuthorityFuture(params: UntagCertificateAuthorityRequest): Future[js.Object] =
      service.untagCertificateAuthority(params).promise().toFuture
    @inline def updateCertificateAuthorityFuture(params: UpdateCertificateAuthorityRequest): Future[js.Object] =
      service.updateCertificateAuthority(params).promise().toFuture
  }
}

package acmpca {
  @js.native
  @JSImport("aws-sdk", "ACMPCA")
  class ACMPCA() extends js.Object {
    def this(config: AWSConfig) = this()

    def createCertificateAuthority(
        params: CreateCertificateAuthorityRequest
    ): Request[CreateCertificateAuthorityResponse] = js.native
    def createCertificateAuthorityAuditReport(
        params: CreateCertificateAuthorityAuditReportRequest
    ): Request[CreateCertificateAuthorityAuditReportResponse] = js.native
    def createPermission(params: CreatePermissionRequest): Request[js.Object] = js.native
    def deleteCertificateAuthority(params: DeleteCertificateAuthorityRequest): Request[js.Object] = js.native
    def deletePermission(params: DeletePermissionRequest): Request[js.Object] = js.native
    def describeCertificateAuthority(
        params: DescribeCertificateAuthorityRequest
    ): Request[DescribeCertificateAuthorityResponse] = js.native
    def describeCertificateAuthorityAuditReport(
        params: DescribeCertificateAuthorityAuditReportRequest
    ): Request[DescribeCertificateAuthorityAuditReportResponse] = js.native
    def getCertificate(params: GetCertificateRequest): Request[GetCertificateResponse] = js.native
    def getCertificateAuthorityCertificate(
        params: GetCertificateAuthorityCertificateRequest
    ): Request[GetCertificateAuthorityCertificateResponse] = js.native
    def getCertificateAuthorityCsr(
        params: GetCertificateAuthorityCsrRequest
    ): Request[GetCertificateAuthorityCsrResponse] = js.native
    def importCertificateAuthorityCertificate(
        params: ImportCertificateAuthorityCertificateRequest
    ): Request[js.Object] = js.native
    def issueCertificate(params: IssueCertificateRequest): Request[IssueCertificateResponse] = js.native
    def listCertificateAuthorities(
        params: ListCertificateAuthoritiesRequest
    ): Request[ListCertificateAuthoritiesResponse] = js.native
    def listPermissions(params: ListPermissionsRequest): Request[ListPermissionsResponse] = js.native
    def listTags(params: ListTagsRequest): Request[ListTagsResponse] = js.native
    def restoreCertificateAuthority(params: RestoreCertificateAuthorityRequest): Request[js.Object] = js.native
    def revokeCertificate(params: RevokeCertificateRequest): Request[js.Object] = js.native
    def tagCertificateAuthority(params: TagCertificateAuthorityRequest): Request[js.Object] = js.native
    def untagCertificateAuthority(params: UntagCertificateAuthorityRequest): Request[js.Object] = js.native
    def updateCertificateAuthority(params: UpdateCertificateAuthorityRequest): Request[js.Object] = js.native
  }

  /**
    * Contains information about the certificate subject. The certificate can be one issued by your private certificate authority (CA) or it can be your private CA certificate. The ```Subject``` field in the certificate identifies the entity that owns or controls the public key in the certificate. The entity can be a user, computer, device, or service. The ```Subject``` must contain an X.500 distinguished name (DN). A DN is a sequence of relative distinguished names (RDNs). The RDNs are separated by commas in the certificate. The DN must be unique for each entity, but your private CA can issue more than one certificate with the same DN to the same entity.
    */
  @js.native
  trait ASN1Subject extends js.Object {
    var CommonName: js.UndefOr[String64]
    var Country: js.UndefOr[CountryCodeString]
    var DistinguishedNameQualifier: js.UndefOr[DistinguishedNameQualifierString]
    var GenerationQualifier: js.UndefOr[String3]
    var GivenName: js.UndefOr[String16]
    var Initials: js.UndefOr[String5]
    var Locality: js.UndefOr[String128]
    var Organization: js.UndefOr[String64]
    var OrganizationalUnit: js.UndefOr[String64]
    var Pseudonym: js.UndefOr[String128]
    var SerialNumber: js.UndefOr[String64]
    var State: js.UndefOr[String128]
    var Surname: js.UndefOr[String40]
    var Title: js.UndefOr[String64]
  }

  object ASN1Subject {
    @inline
    def apply(
        CommonName: js.UndefOr[String64] = js.undefined,
        Country: js.UndefOr[CountryCodeString] = js.undefined,
        DistinguishedNameQualifier: js.UndefOr[DistinguishedNameQualifierString] = js.undefined,
        GenerationQualifier: js.UndefOr[String3] = js.undefined,
        GivenName: js.UndefOr[String16] = js.undefined,
        Initials: js.UndefOr[String5] = js.undefined,
        Locality: js.UndefOr[String128] = js.undefined,
        Organization: js.UndefOr[String64] = js.undefined,
        OrganizationalUnit: js.UndefOr[String64] = js.undefined,
        Pseudonym: js.UndefOr[String128] = js.undefined,
        SerialNumber: js.UndefOr[String64] = js.undefined,
        State: js.UndefOr[String128] = js.undefined,
        Surname: js.UndefOr[String40] = js.undefined,
        Title: js.UndefOr[String64] = js.undefined
    ): ASN1Subject = {
      val __obj = js.Dynamic.literal()
      CommonName.foreach(__v => __obj.updateDynamic("CommonName")(__v.asInstanceOf[js.Any]))
      Country.foreach(__v => __obj.updateDynamic("Country")(__v.asInstanceOf[js.Any]))
      DistinguishedNameQualifier.foreach(__v =>
        __obj.updateDynamic("DistinguishedNameQualifier")(__v.asInstanceOf[js.Any])
      )
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

  @js.native
  sealed trait ActionType extends js.Any
  object ActionType extends js.Object {
    val IssueCertificate = "IssueCertificate".asInstanceOf[ActionType]
    val GetCertificate = "GetCertificate".asInstanceOf[ActionType]
    val ListPermissions = "ListPermissions".asInstanceOf[ActionType]

    val values = js.Object.freeze(js.Array(IssueCertificate, GetCertificate, ListPermissions))
  }

  @js.native
  sealed trait AuditReportResponseFormat extends js.Any
  object AuditReportResponseFormat extends js.Object {
    val JSON = "JSON".asInstanceOf[AuditReportResponseFormat]
    val CSV = "CSV".asInstanceOf[AuditReportResponseFormat]

    val values = js.Object.freeze(js.Array(JSON, CSV))
  }

  @js.native
  sealed trait AuditReportStatus extends js.Any
  object AuditReportStatus extends js.Object {
    val CREATING = "CREATING".asInstanceOf[AuditReportStatus]
    val SUCCESS = "SUCCESS".asInstanceOf[AuditReportStatus]
    val FAILED = "FAILED".asInstanceOf[AuditReportStatus]

    val values = js.Object.freeze(js.Array(CREATING, SUCCESS, FAILED))
  }

  /**
    * Contains information about your private certificate authority (CA). Your private CA can issue and revoke X.509 digital certificates. Digital certificates verify that the entity named in the certificate ```Subject``` field owns or controls the public key contained in the ```Subject Public Key Info``` field. Call the <a>CreateCertificateAuthority</a> action to create your private CA. You must then call the <a>GetCertificateAuthorityCertificate</a> action to retrieve a private CA certificate signing request (CSR). Sign the CSR with your ACM Private CA-hosted or on-premises root or subordinate CA certificate. Call the <a>ImportCertificateAuthorityCertificate</a> action to import the signed certificate into AWS Certificate Manager (ACM).
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
        RestorableUntil: js.UndefOr[TStamp] = js.undefined,
        RevocationConfiguration: js.UndefOr[RevocationConfiguration] = js.undefined,
        Serial: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[CertificateAuthorityStatus] = js.undefined,
        Type: js.UndefOr[CertificateAuthorityType] = js.undefined
    ): CertificateAuthority = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      CertificateAuthorityConfiguration.foreach(__v =>
        __obj.updateDynamic("CertificateAuthorityConfiguration")(__v.asInstanceOf[js.Any])
      )
      CreatedAt.foreach(__v => __obj.updateDynamic("CreatedAt")(__v.asInstanceOf[js.Any]))
      FailureReason.foreach(__v => __obj.updateDynamic("FailureReason")(__v.asInstanceOf[js.Any]))
      LastStateChangeAt.foreach(__v => __obj.updateDynamic("LastStateChangeAt")(__v.asInstanceOf[js.Any]))
      NotAfter.foreach(__v => __obj.updateDynamic("NotAfter")(__v.asInstanceOf[js.Any]))
      NotBefore.foreach(__v => __obj.updateDynamic("NotBefore")(__v.asInstanceOf[js.Any]))
      RestorableUntil.foreach(__v => __obj.updateDynamic("RestorableUntil")(__v.asInstanceOf[js.Any]))
      RevocationConfiguration.foreach(__v => __obj.updateDynamic("RevocationConfiguration")(__v.asInstanceOf[js.Any]))
      Serial.foreach(__v => __obj.updateDynamic("Serial")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CertificateAuthority]
    }
  }

  /**
    * Contains configuration information for your private certificate authority (CA). This includes information about the class of public key algorithm and the key pair that your private CA creates when it issues a certificate. It also includes the signature algorithm that it uses when issuing certificates, and its X.500 distinguished name. You must specify this information when you call the <a>CreateCertificateAuthority</a> action.
    */
  @js.native
  trait CertificateAuthorityConfiguration extends js.Object {
    var KeyAlgorithm: KeyAlgorithm
    var SigningAlgorithm: SigningAlgorithm
    var Subject: ASN1Subject
  }

  object CertificateAuthorityConfiguration {
    @inline
    def apply(
        KeyAlgorithm: KeyAlgorithm,
        SigningAlgorithm: SigningAlgorithm,
        Subject: ASN1Subject
    ): CertificateAuthorityConfiguration = {
      val __obj = js.Dynamic.literal(
        "KeyAlgorithm" -> KeyAlgorithm.asInstanceOf[js.Any],
        "SigningAlgorithm" -> SigningAlgorithm.asInstanceOf[js.Any],
        "Subject" -> Subject.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CertificateAuthorityConfiguration]
    }
  }

  @js.native
  sealed trait CertificateAuthorityStatus extends js.Any
  object CertificateAuthorityStatus extends js.Object {
    val CREATING = "CREATING".asInstanceOf[CertificateAuthorityStatus]
    val PENDING_CERTIFICATE = "PENDING_CERTIFICATE".asInstanceOf[CertificateAuthorityStatus]
    val ACTIVE = "ACTIVE".asInstanceOf[CertificateAuthorityStatus]
    val DELETED = "DELETED".asInstanceOf[CertificateAuthorityStatus]
    val DISABLED = "DISABLED".asInstanceOf[CertificateAuthorityStatus]
    val EXPIRED = "EXPIRED".asInstanceOf[CertificateAuthorityStatus]
    val FAILED = "FAILED".asInstanceOf[CertificateAuthorityStatus]

    val values = js.Object.freeze(js.Array(CREATING, PENDING_CERTIFICATE, ACTIVE, DELETED, DISABLED, EXPIRED, FAILED))
  }

  @js.native
  sealed trait CertificateAuthorityType extends js.Any
  object CertificateAuthorityType extends js.Object {
    val ROOT = "ROOT".asInstanceOf[CertificateAuthorityType]
    val SUBORDINATE = "SUBORDINATE".asInstanceOf[CertificateAuthorityType]

    val values = js.Object.freeze(js.Array(ROOT, SUBORDINATE))
  }

  @js.native
  trait CreateCertificateAuthorityAuditReportRequest extends js.Object {
    var AuditReportResponseFormat: AuditReportResponseFormat
    var CertificateAuthorityArn: Arn
    var S3BucketName: String
  }

  object CreateCertificateAuthorityAuditReportRequest {
    @inline
    def apply(
        AuditReportResponseFormat: AuditReportResponseFormat,
        CertificateAuthorityArn: Arn,
        S3BucketName: String
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
    var S3Key: js.UndefOr[String]
  }

  object CreateCertificateAuthorityAuditReportResponse {
    @inline
    def apply(
        AuditReportId: js.UndefOr[AuditReportId] = js.undefined,
        S3Key: js.UndefOr[String] = js.undefined
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

  /**
    * Contains configuration information for a certificate revocation list (CRL). Your private certificate authority (CA) creates base CRLs. Delta CRLs are not supported. You can enable CRLs for your new or an existing private CA by setting the ```Enabled``` parameter to <code>true</code>. Your private CA writes CRLs to an S3 bucket that you specify in the ```S3BucketName``` parameter. You can hide the name of your bucket by specifying a value for the ```CustomCname``` parameter. Your private CA copies the CNAME or the S3 bucket name to the ```CRL Distribution Points``` extension of each certificate it issues. Your S3 bucket policy must give write permission to ACM Private CA.
    *  Your private CA uses the value in the ```ExpirationInDays``` parameter to calculate the ```nextUpdate``` field in the CRL. The CRL is refreshed at 1/2 the age of next update or when a certificate is revoked. When a certificate is revoked, it is recorded in the next CRL that is generated and in the next audit report. Only time valid certificates are listed in the CRL. Expired certificates are not included.
    *  CRLs contain the following fields:
    * * ```Version```: The current version number defined in RFC 5280 is V2. The integer value is 0x1.
    *  * ```Signature Algorithm```: The name of the algorithm used to sign the CRL.
    *  * ```Issuer```: The X.500 distinguished name of your private CA that issued the CRL.
    *  * ```Last Update```: The issue date and time of this CRL.
    *  * ```Next Update```: The day and time by which the next CRL will be issued.
    *  * ```Revoked Certificates```: List of revoked certificates. Each list item contains the following information.
    * <li> ```Serial Number```: The serial number, in hexadecimal format, of the revoked certificate.
    *  * ```Revocation Date```: Date and time the certificate was revoked.
    *  * ```CRL Entry Extensions```: Optional extensions for the CRL entry.
    * <li> ```X509v3 CRL Reason Code```: Reason the certificate was revoked.
    * </li></li> * ```CRL Extensions```: Optional extensions for the CRL.
    * <li> ```X509v3 Authority Key Identifier```: Identifies the public key associated with the private key used to sign the certificate.
    *  * ```X509v3 CRL Number:```: Decimal sequence number for the CRL.
    * </li> * ```Signature Algorithm```: Algorithm used by your private CA to sign the CRL.
    *  * ```Signature Value```: Signature computed over the CRL.
    * Certificate revocation lists created by ACM Private CA are DER-encoded. You can use the following OpenSSL command to list a CRL.
    *  <code>openssl crl -inform DER -text -in <i>crl_path</i> -noout</code>
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

      PermanentDeletionTimeInDays.foreach(__v =>
        __obj.updateDynamic("PermanentDeletionTimeInDays")(__v.asInstanceOf[js.Any])
      )
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
    var S3BucketName: js.UndefOr[String]
    var S3Key: js.UndefOr[String]
  }

  object DescribeCertificateAuthorityAuditReportResponse {
    @inline
    def apply(
        AuditReportStatus: js.UndefOr[AuditReportStatus] = js.undefined,
        CreatedAt: js.UndefOr[TStamp] = js.undefined,
        S3BucketName: js.UndefOr[String] = js.undefined,
        S3Key: js.UndefOr[String] = js.undefined
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

  @js.native
  sealed trait FailureReason extends js.Any
  object FailureReason extends js.Object {
    val REQUEST_TIMED_OUT = "REQUEST_TIMED_OUT".asInstanceOf[FailureReason]
    val UNSUPPORTED_ALGORITHM = "UNSUPPORTED_ALGORITHM".asInstanceOf[FailureReason]
    val OTHER = "OTHER".asInstanceOf[FailureReason]

    val values = js.Object.freeze(js.Array(REQUEST_TIMED_OUT, UNSUPPORTED_ALGORITHM, OTHER))
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
  object KeyAlgorithm extends js.Object {
    val RSA_2048 = "RSA_2048".asInstanceOf[KeyAlgorithm]
    val RSA_4096 = "RSA_4096".asInstanceOf[KeyAlgorithm]
    val EC_prime256v1 = "EC_prime256v1".asInstanceOf[KeyAlgorithm]
    val EC_secp384r1 = "EC_secp384r1".asInstanceOf[KeyAlgorithm]

    val values = js.Object.freeze(js.Array(RSA_2048, RSA_4096, EC_prime256v1, EC_secp384r1))
  }

  @js.native
  trait ListCertificateAuthoritiesRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListCertificateAuthoritiesRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListCertificateAuthoritiesRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
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

  /**
    * Permissions designate which private CA actions can be performed by an AWS service or entity. In order for ACM to automatically renew private certificates, you must give the ACM service principal all available permissions (<code>IssueCertificate</code>, <code>GetCertificate</code>, and <code>ListPermissions</code>). Permissions can be assigned with the <a>CreatePermission</a> action, removed with the <a>DeletePermission</a> action, and listed with the <a>ListPermissions</a> action.
    */
  @js.native
  trait Permission extends js.Object {
    var Actions: js.UndefOr[ActionList]
    var CertificateAuthorityArn: js.UndefOr[Arn]
    var CreatedAt: js.UndefOr[TStamp]
    var Policy: js.UndefOr[String]
    var Principal: js.UndefOr[String]
    var SourceAccount: js.UndefOr[String]
  }

  object Permission {
    @inline
    def apply(
        Actions: js.UndefOr[ActionList] = js.undefined,
        CertificateAuthorityArn: js.UndefOr[Arn] = js.undefined,
        CreatedAt: js.UndefOr[TStamp] = js.undefined,
        Policy: js.UndefOr[String] = js.undefined,
        Principal: js.UndefOr[String] = js.undefined,
        SourceAccount: js.UndefOr[String] = js.undefined
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

  /**
    * Certificate revocation information used by the <a>CreateCertificateAuthority</a> and <a>UpdateCertificateAuthority</a> actions. Your private certificate authority (CA) can create and maintain a certificate revocation list (CRL). A CRL contains information about certificates revoked by your CA. For more information, see <a>RevokeCertificate</a>.
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
  object RevocationReason extends js.Object {
    val UNSPECIFIED = "UNSPECIFIED".asInstanceOf[RevocationReason]
    val KEY_COMPROMISE = "KEY_COMPROMISE".asInstanceOf[RevocationReason]
    val CERTIFICATE_AUTHORITY_COMPROMISE = "CERTIFICATE_AUTHORITY_COMPROMISE".asInstanceOf[RevocationReason]
    val AFFILIATION_CHANGED = "AFFILIATION_CHANGED".asInstanceOf[RevocationReason]
    val SUPERSEDED = "SUPERSEDED".asInstanceOf[RevocationReason]
    val CESSATION_OF_OPERATION = "CESSATION_OF_OPERATION".asInstanceOf[RevocationReason]
    val PRIVILEGE_WITHDRAWN = "PRIVILEGE_WITHDRAWN".asInstanceOf[RevocationReason]
    val A_A_COMPROMISE = "A_A_COMPROMISE".asInstanceOf[RevocationReason]

    val values = js.Object.freeze(
      js.Array(
        UNSPECIFIED,
        KEY_COMPROMISE,
        CERTIFICATE_AUTHORITY_COMPROMISE,
        AFFILIATION_CHANGED,
        SUPERSEDED,
        CESSATION_OF_OPERATION,
        PRIVILEGE_WITHDRAWN,
        A_A_COMPROMISE
      )
    )
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
  object SigningAlgorithm extends js.Object {
    val SHA256WITHECDSA = "SHA256WITHECDSA".asInstanceOf[SigningAlgorithm]
    val SHA384WITHECDSA = "SHA384WITHECDSA".asInstanceOf[SigningAlgorithm]
    val SHA512WITHECDSA = "SHA512WITHECDSA".asInstanceOf[SigningAlgorithm]
    val SHA256WITHRSA = "SHA256WITHRSA".asInstanceOf[SigningAlgorithm]
    val SHA384WITHRSA = "SHA384WITHRSA".asInstanceOf[SigningAlgorithm]
    val SHA512WITHRSA = "SHA512WITHRSA".asInstanceOf[SigningAlgorithm]

    val values = js.Object.freeze(
      js.Array(SHA256WITHECDSA, SHA384WITHECDSA, SHA512WITHECDSA, SHA256WITHRSA, SHA384WITHRSA, SHA512WITHRSA)
    )
  }

  /**
    * Tags are labels that you can use to identify and organize your private CAs. Each tag consists of a key and an optional value. You can associate up to 50 tags with a private CA. To add one or more tags to a private CA, call the <a>TagCertificateAuthority</a> action. To remove a tag, call the <a>UntagCertificateAuthority</a> action.
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

  /**
    * Length of time for which the certificate issued by your private certificate authority (CA), or by the private CA itself, is valid in days, months, or years. You can issue a certificate by calling the <a>IssueCertificate</a> action.
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
  object ValidityPeriodType extends js.Object {
    val END_DATE = "END_DATE".asInstanceOf[ValidityPeriodType]
    val ABSOLUTE = "ABSOLUTE".asInstanceOf[ValidityPeriodType]
    val DAYS = "DAYS".asInstanceOf[ValidityPeriodType]
    val MONTHS = "MONTHS".asInstanceOf[ValidityPeriodType]
    val YEARS = "YEARS".asInstanceOf[ValidityPeriodType]

    val values = js.Object.freeze(js.Array(END_DATE, ABSOLUTE, DAYS, MONTHS, YEARS))
  }
}
