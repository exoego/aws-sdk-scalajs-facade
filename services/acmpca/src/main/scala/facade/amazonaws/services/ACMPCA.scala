package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object acmpca {
  type AccountId                        = String
  type ActionList                       = js.Array[ActionType]
  type Arn                              = String
  type AuditReportId                    = String
  type CertificateAuthorities           = js.Array[CertificateAuthority]
  type CertificateBody                  = String
  type CertificateBodyBlob              = js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type CertificateChain                 = String
  type CertificateChainBlob             = js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type CountryCodeString                = String
  type CsrBlob                          = js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type CsrBody                          = String
  type DistinguishedNameQualifierString = String
  type IdempotencyToken                 = String
  type Integer1To5000                   = Int
  type MaxResults                       = Int
  type NextToken                        = String
  type PermanentDeletionTimeInDays      = Int
  type PermissionList                   = js.Array[Permission]
  type PositiveLong                     = Double
  type Principal                        = String
  type String128                        = String
  type String16                         = String
  type String253                        = String
  type String3                          = String
  type String3To255                     = String
  type String40                         = String
  type String5                          = String
  type String64                         = String
  type TStamp                           = js.Date
  type TagKey                           = String
  type TagList                          = js.Array[Tag]
  type TagValue                         = String

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
    ): Request[CreateCertificateAuthorityAuditReportResponse]                                     = js.native
    def createPermission(params: CreatePermissionRequest): Request[js.Object]                     = js.native
    def deleteCertificateAuthority(params: DeleteCertificateAuthorityRequest): Request[js.Object] = js.native
    def deletePermission(params: DeletePermissionRequest): Request[js.Object]                     = js.native
    def describeCertificateAuthority(
        params: DescribeCertificateAuthorityRequest
    ): Request[DescribeCertificateAuthorityResponse] = js.native
    def describeCertificateAuthorityAuditReport(
        params: DescribeCertificateAuthorityAuditReportRequest
    ): Request[DescribeCertificateAuthorityAuditReportResponse]                        = js.native
    def getCertificate(params: GetCertificateRequest): Request[GetCertificateResponse] = js.native
    def getCertificateAuthorityCertificate(
        params: GetCertificateAuthorityCertificateRequest
    ): Request[GetCertificateAuthorityCertificateResponse] = js.native
    def getCertificateAuthorityCsr(
        params: GetCertificateAuthorityCsrRequest
    ): Request[GetCertificateAuthorityCsrResponse] = js.native
    def importCertificateAuthorityCertificate(
        params: ImportCertificateAuthorityCertificateRequest
    ): Request[js.Object]                                                                    = js.native
    def issueCertificate(params: IssueCertificateRequest): Request[IssueCertificateResponse] = js.native
    def listCertificateAuthorities(
        params: ListCertificateAuthoritiesRequest
    ): Request[ListCertificateAuthoritiesResponse]                                                  = js.native
    def listPermissions(params: ListPermissionsRequest): Request[ListPermissionsResponse]           = js.native
    def listTags(params: ListTagsRequest): Request[ListTagsResponse]                                = js.native
    def restoreCertificateAuthority(params: RestoreCertificateAuthorityRequest): Request[js.Object] = js.native
    def revokeCertificate(params: RevokeCertificateRequest): Request[js.Object]                     = js.native
    def tagCertificateAuthority(params: TagCertificateAuthorityRequest): Request[js.Object]         = js.native
    def untagCertificateAuthority(params: UntagCertificateAuthorityRequest): Request[js.Object]     = js.native
    def updateCertificateAuthority(params: UpdateCertificateAuthorityRequest): Request[js.Object]   = js.native
  }

  /**
    * Contains information about the certificate subject. The certificate can be one issued by your private certificate authority (CA) or it can be your private CA certificate. The ```Subject``` field in the certificate identifies the entity that owns or controls the public key in the certificate. The entity can be a user, computer, device, or service. The ```Subject``` must contain an X.500 distinguished name (DN). A DN is a sequence of relative distinguished names (RDNs). The RDNs are separated by commas in the certificate. The DN must be unique for each entity, but your private CA can issue more than one certificate with the same DN to the same entity.
    */
  @js.native
  @Factory
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

  @js.native
  sealed trait ActionType extends js.Any
  object ActionType extends js.Object {
    val IssueCertificate = "IssueCertificate".asInstanceOf[ActionType]
    val GetCertificate   = "GetCertificate".asInstanceOf[ActionType]
    val ListPermissions  = "ListPermissions".asInstanceOf[ActionType]

    val values = js.Object.freeze(js.Array(IssueCertificate, GetCertificate, ListPermissions))
  }

  @js.native
  sealed trait AuditReportResponseFormat extends js.Any
  object AuditReportResponseFormat extends js.Object {
    val JSON = "JSON".asInstanceOf[AuditReportResponseFormat]
    val CSV  = "CSV".asInstanceOf[AuditReportResponseFormat]

    val values = js.Object.freeze(js.Array(JSON, CSV))
  }

  @js.native
  sealed trait AuditReportStatus extends js.Any
  object AuditReportStatus extends js.Object {
    val CREATING = "CREATING".asInstanceOf[AuditReportStatus]
    val SUCCESS  = "SUCCESS".asInstanceOf[AuditReportStatus]
    val FAILED   = "FAILED".asInstanceOf[AuditReportStatus]

    val values = js.Object.freeze(js.Array(CREATING, SUCCESS, FAILED))
  }

  /**
    * Contains information about your private certificate authority (CA). Your private CA can issue and revoke X.509 digital certificates. Digital certificates verify that the entity named in the certificate ```Subject``` field owns or controls the public key contained in the ```Subject Public Key Info``` field. Call the <a>CreateCertificateAuthority</a> action to create your private CA. You must then call the <a>GetCertificateAuthorityCertificate</a> action to retrieve a private CA certificate signing request (CSR). Sign the CSR with your ACM Private CA-hosted or on-premises root or subordinate CA certificate. Call the <a>ImportCertificateAuthorityCertificate</a> action to import the signed certificate into AWS Certificate Manager (ACM).
    */
  @js.native
  @Factory
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

  /**
    * Contains configuration information for your private certificate authority (CA). This includes information about the class of public key algorithm and the key pair that your private CA creates when it issues a certificate. It also includes the signature algorithm that it uses when issuing certificates, and its X.500 distinguished name. You must specify this information when you call the <a>CreateCertificateAuthority</a> action.
    */
  @js.native
  @Factory
  trait CertificateAuthorityConfiguration extends js.Object {
    var KeyAlgorithm: KeyAlgorithm
    var SigningAlgorithm: SigningAlgorithm
    var Subject: ASN1Subject
  }

  @js.native
  sealed trait CertificateAuthorityStatus extends js.Any
  object CertificateAuthorityStatus extends js.Object {
    val CREATING            = "CREATING".asInstanceOf[CertificateAuthorityStatus]
    val PENDING_CERTIFICATE = "PENDING_CERTIFICATE".asInstanceOf[CertificateAuthorityStatus]
    val ACTIVE              = "ACTIVE".asInstanceOf[CertificateAuthorityStatus]
    val DELETED             = "DELETED".asInstanceOf[CertificateAuthorityStatus]
    val DISABLED            = "DISABLED".asInstanceOf[CertificateAuthorityStatus]
    val EXPIRED             = "EXPIRED".asInstanceOf[CertificateAuthorityStatus]
    val FAILED              = "FAILED".asInstanceOf[CertificateAuthorityStatus]

    val values = js.Object.freeze(js.Array(CREATING, PENDING_CERTIFICATE, ACTIVE, DELETED, DISABLED, EXPIRED, FAILED))
  }

  @js.native
  sealed trait CertificateAuthorityType extends js.Any
  object CertificateAuthorityType extends js.Object {
    val ROOT        = "ROOT".asInstanceOf[CertificateAuthorityType]
    val SUBORDINATE = "SUBORDINATE".asInstanceOf[CertificateAuthorityType]

    val values = js.Object.freeze(js.Array(ROOT, SUBORDINATE))
  }

  @js.native
  @Factory
  trait CreateCertificateAuthorityAuditReportRequest extends js.Object {
    var AuditReportResponseFormat: AuditReportResponseFormat
    var CertificateAuthorityArn: Arn
    var S3BucketName: String
  }

  @js.native
  @Factory
  trait CreateCertificateAuthorityAuditReportResponse extends js.Object {
    var AuditReportId: js.UndefOr[AuditReportId]
    var S3Key: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait CreateCertificateAuthorityRequest extends js.Object {
    var CertificateAuthorityConfiguration: CertificateAuthorityConfiguration
    var CertificateAuthorityType: CertificateAuthorityType
    var IdempotencyToken: js.UndefOr[IdempotencyToken]
    var RevocationConfiguration: js.UndefOr[RevocationConfiguration]
    var Tags: js.UndefOr[TagList]
  }

  @js.native
  @Factory
  trait CreateCertificateAuthorityResponse extends js.Object {
    var CertificateAuthorityArn: js.UndefOr[Arn]
  }

  @js.native
  @Factory
  trait CreatePermissionRequest extends js.Object {
    var Actions: ActionList
    var CertificateAuthorityArn: Arn
    var Principal: Principal
    var SourceAccount: js.UndefOr[AccountId]
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
  @Factory
  trait CrlConfiguration extends js.Object {
    var Enabled: Boolean
    var CustomCname: js.UndefOr[String253]
    var ExpirationInDays: js.UndefOr[Integer1To5000]
    var S3BucketName: js.UndefOr[String3To255]
  }

  @js.native
  @Factory
  trait DeleteCertificateAuthorityRequest extends js.Object {
    var CertificateAuthorityArn: Arn
    var PermanentDeletionTimeInDays: js.UndefOr[PermanentDeletionTimeInDays]
  }

  @js.native
  @Factory
  trait DeletePermissionRequest extends js.Object {
    var CertificateAuthorityArn: Arn
    var Principal: Principal
    var SourceAccount: js.UndefOr[AccountId]
  }

  @js.native
  @Factory
  trait DescribeCertificateAuthorityAuditReportRequest extends js.Object {
    var AuditReportId: AuditReportId
    var CertificateAuthorityArn: Arn
  }

  @js.native
  @Factory
  trait DescribeCertificateAuthorityAuditReportResponse extends js.Object {
    var AuditReportStatus: js.UndefOr[AuditReportStatus]
    var CreatedAt: js.UndefOr[TStamp]
    var S3BucketName: js.UndefOr[String]
    var S3Key: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait DescribeCertificateAuthorityRequest extends js.Object {
    var CertificateAuthorityArn: Arn
  }

  @js.native
  @Factory
  trait DescribeCertificateAuthorityResponse extends js.Object {
    var CertificateAuthority: js.UndefOr[CertificateAuthority]
  }

  @js.native
  sealed trait FailureReason extends js.Any
  object FailureReason extends js.Object {
    val REQUEST_TIMED_OUT     = "REQUEST_TIMED_OUT".asInstanceOf[FailureReason]
    val UNSUPPORTED_ALGORITHM = "UNSUPPORTED_ALGORITHM".asInstanceOf[FailureReason]
    val OTHER                 = "OTHER".asInstanceOf[FailureReason]

    val values = js.Object.freeze(js.Array(REQUEST_TIMED_OUT, UNSUPPORTED_ALGORITHM, OTHER))
  }

  @js.native
  @Factory
  trait GetCertificateAuthorityCertificateRequest extends js.Object {
    var CertificateAuthorityArn: Arn
  }

  @js.native
  @Factory
  trait GetCertificateAuthorityCertificateResponse extends js.Object {
    var Certificate: js.UndefOr[CertificateBody]
    var CertificateChain: js.UndefOr[CertificateChain]
  }

  @js.native
  @Factory
  trait GetCertificateAuthorityCsrRequest extends js.Object {
    var CertificateAuthorityArn: Arn
  }

  @js.native
  @Factory
  trait GetCertificateAuthorityCsrResponse extends js.Object {
    var Csr: js.UndefOr[CsrBody]
  }

  @js.native
  @Factory
  trait GetCertificateRequest extends js.Object {
    var CertificateArn: Arn
    var CertificateAuthorityArn: Arn
  }

  @js.native
  @Factory
  trait GetCertificateResponse extends js.Object {
    var Certificate: js.UndefOr[CertificateBody]
    var CertificateChain: js.UndefOr[CertificateChain]
  }

  @js.native
  @Factory
  trait ImportCertificateAuthorityCertificateRequest extends js.Object {
    var Certificate: CertificateBodyBlob
    var CertificateAuthorityArn: Arn
    var CertificateChain: js.UndefOr[CertificateChainBlob]
  }

  @js.native
  @Factory
  trait IssueCertificateRequest extends js.Object {
    var CertificateAuthorityArn: Arn
    var Csr: CsrBlob
    var SigningAlgorithm: SigningAlgorithm
    var Validity: Validity
    var IdempotencyToken: js.UndefOr[IdempotencyToken]
    var TemplateArn: js.UndefOr[Arn]
  }

  @js.native
  @Factory
  trait IssueCertificateResponse extends js.Object {
    var CertificateArn: js.UndefOr[Arn]
  }

  @js.native
  sealed trait KeyAlgorithm extends js.Any
  object KeyAlgorithm extends js.Object {
    val RSA_2048      = "RSA_2048".asInstanceOf[KeyAlgorithm]
    val RSA_4096      = "RSA_4096".asInstanceOf[KeyAlgorithm]
    val EC_prime256v1 = "EC_prime256v1".asInstanceOf[KeyAlgorithm]
    val EC_secp384r1  = "EC_secp384r1".asInstanceOf[KeyAlgorithm]

    val values = js.Object.freeze(js.Array(RSA_2048, RSA_4096, EC_prime256v1, EC_secp384r1))
  }

  @js.native
  @Factory
  trait ListCertificateAuthoritiesRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListCertificateAuthoritiesResponse extends js.Object {
    var CertificateAuthorities: js.UndefOr[CertificateAuthorities]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListPermissionsRequest extends js.Object {
    var CertificateAuthorityArn: Arn
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListPermissionsResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Permissions: js.UndefOr[PermissionList]
  }

  @js.native
  @Factory
  trait ListTagsRequest extends js.Object {
    var CertificateAuthorityArn: Arn
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListTagsResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Tags: js.UndefOr[TagList]
  }

  /**
    * Permissions designate which private CA actions can be performed by an AWS service or entity. In order for ACM to automatically renew private certificates, you must give the ACM service principal all available permissions (<code>IssueCertificate</code>, <code>GetCertificate</code>, and <code>ListPermissions</code>). Permissions can be assigned with the <a>CreatePermission</a> action, removed with the <a>DeletePermission</a> action, and listed with the <a>ListPermissions</a> action.
    */
  @js.native
  @Factory
  trait Permission extends js.Object {
    var Actions: js.UndefOr[ActionList]
    var CertificateAuthorityArn: js.UndefOr[Arn]
    var CreatedAt: js.UndefOr[TStamp]
    var Policy: js.UndefOr[String]
    var Principal: js.UndefOr[String]
    var SourceAccount: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait RestoreCertificateAuthorityRequest extends js.Object {
    var CertificateAuthorityArn: Arn
  }

  /**
    * Certificate revocation information used by the <a>CreateCertificateAuthority</a> and <a>UpdateCertificateAuthority</a> actions. Your private certificate authority (CA) can create and maintain a certificate revocation list (CRL). A CRL contains information about certificates revoked by your CA. For more information, see <a>RevokeCertificate</a>.
    */
  @js.native
  @Factory
  trait RevocationConfiguration extends js.Object {
    var CrlConfiguration: js.UndefOr[CrlConfiguration]
  }

  @js.native
  sealed trait RevocationReason extends js.Any
  object RevocationReason extends js.Object {
    val UNSPECIFIED                      = "UNSPECIFIED".asInstanceOf[RevocationReason]
    val KEY_COMPROMISE                   = "KEY_COMPROMISE".asInstanceOf[RevocationReason]
    val CERTIFICATE_AUTHORITY_COMPROMISE = "CERTIFICATE_AUTHORITY_COMPROMISE".asInstanceOf[RevocationReason]
    val AFFILIATION_CHANGED              = "AFFILIATION_CHANGED".asInstanceOf[RevocationReason]
    val SUPERSEDED                       = "SUPERSEDED".asInstanceOf[RevocationReason]
    val CESSATION_OF_OPERATION           = "CESSATION_OF_OPERATION".asInstanceOf[RevocationReason]
    val PRIVILEGE_WITHDRAWN              = "PRIVILEGE_WITHDRAWN".asInstanceOf[RevocationReason]
    val A_A_COMPROMISE                   = "A_A_COMPROMISE".asInstanceOf[RevocationReason]

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
  @Factory
  trait RevokeCertificateRequest extends js.Object {
    var CertificateAuthorityArn: Arn
    var CertificateSerial: String128
    var RevocationReason: RevocationReason
  }

  @js.native
  sealed trait SigningAlgorithm extends js.Any
  object SigningAlgorithm extends js.Object {
    val SHA256WITHECDSA = "SHA256WITHECDSA".asInstanceOf[SigningAlgorithm]
    val SHA384WITHECDSA = "SHA384WITHECDSA".asInstanceOf[SigningAlgorithm]
    val SHA512WITHECDSA = "SHA512WITHECDSA".asInstanceOf[SigningAlgorithm]
    val SHA256WITHRSA   = "SHA256WITHRSA".asInstanceOf[SigningAlgorithm]
    val SHA384WITHRSA   = "SHA384WITHRSA".asInstanceOf[SigningAlgorithm]
    val SHA512WITHRSA   = "SHA512WITHRSA".asInstanceOf[SigningAlgorithm]

    val values = js.Object.freeze(
      js.Array(SHA256WITHECDSA, SHA384WITHECDSA, SHA512WITHECDSA, SHA256WITHRSA, SHA384WITHRSA, SHA512WITHRSA)
    )
  }

  /**
    * Tags are labels that you can use to identify and organize your private CAs. Each tag consists of a key and an optional value. You can associate up to 50 tags with a private CA. To add one or more tags to a private CA, call the <a>TagCertificateAuthority</a> action. To remove a tag, call the <a>UntagCertificateAuthority</a> action.
    */
  @js.native
  @Factory
  trait Tag extends js.Object {
    var Key: TagKey
    var Value: js.UndefOr[TagValue]
  }

  @js.native
  @Factory
  trait TagCertificateAuthorityRequest extends js.Object {
    var CertificateAuthorityArn: Arn
    var Tags: TagList
  }

  @js.native
  @Factory
  trait UntagCertificateAuthorityRequest extends js.Object {
    var CertificateAuthorityArn: Arn
    var Tags: TagList
  }

  @js.native
  @Factory
  trait UpdateCertificateAuthorityRequest extends js.Object {
    var CertificateAuthorityArn: Arn
    var RevocationConfiguration: js.UndefOr[RevocationConfiguration]
    var Status: js.UndefOr[CertificateAuthorityStatus]
  }

  /**
    * Length of time for which the certificate issued by your private certificate authority (CA), or by the private CA itself, is valid in days, months, or years. You can issue a certificate by calling the <a>IssueCertificate</a> action.
    */
  @js.native
  @Factory
  trait Validity extends js.Object {
    var Type: ValidityPeriodType
    var Value: PositiveLong
  }

  @js.native
  sealed trait ValidityPeriodType extends js.Any
  object ValidityPeriodType extends js.Object {
    val END_DATE = "END_DATE".asInstanceOf[ValidityPeriodType]
    val ABSOLUTE = "ABSOLUTE".asInstanceOf[ValidityPeriodType]
    val DAYS     = "DAYS".asInstanceOf[ValidityPeriodType]
    val MONTHS   = "MONTHS".asInstanceOf[ValidityPeriodType]
    val YEARS    = "YEARS".asInstanceOf[ValidityPeriodType]

    val values = js.Object.freeze(js.Array(END_DATE, ABSOLUTE, DAYS, MONTHS, YEARS))
  }
}
