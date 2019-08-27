package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import io.scalajs.nodejs
import facade.amazonaws._

package object acmpca {
  type AccountId                  = String
  type ActionList                 = js.Array[ActionType]
  type ActionType                 = String
  type Arn                        = String
  type AuditReportId              = String
  type AuditReportResponseFormat  = String
  type AuditReportStatus          = String
  type CertificateAuthorities     = js.Array[CertificateAuthority]
  type CertificateAuthorityStatus = String
  type CertificateAuthorityType   = String
  type CertificateBody            = String
  type CertificateBodyBlob =
    nodejs.buffer.Buffer | nodejs.stream.Readable | js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type CertificateChain = String
  type CertificateChainBlob =
    nodejs.buffer.Buffer | nodejs.stream.Readable | js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type CountryCodeString = String
  type CsrBlob =
    nodejs.buffer.Buffer | nodejs.stream.Readable | js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type CsrBody                          = String
  type DistinguishedNameQualifierString = String
  type FailureReason                    = String
  type IdempotencyToken                 = String
  type Integer1To5000                   = Int
  type KeyAlgorithm                     = String
  type MaxResults                       = Int
  type NextToken                        = String
  type PermanentDeletionTimeInDays      = Int
  type PermissionList                   = js.Array[Permission]
  type PositiveLong                     = Double
  type Principal                        = String
  type RevocationReason                 = String
  type SigningAlgorithm                 = String
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
  type ValidityPeriodType               = String

  implicit final class ACMPCAOps(val service: ACMPCA) extends AnyVal {

    def createCertificateAuthorityAuditReportFuture(
        params: CreateCertificateAuthorityAuditReportRequest
    ): Future[CreateCertificateAuthorityAuditReportResponse] =
      service.createCertificateAuthorityAuditReport(params).promise.toFuture
    def createCertificateAuthorityFuture(
        params: CreateCertificateAuthorityRequest
    ): Future[CreateCertificateAuthorityResponse] = service.createCertificateAuthority(params).promise.toFuture
    def createPermissionFuture(params: CreatePermissionRequest): Future[js.Object] =
      service.createPermission(params).promise.toFuture
    def deleteCertificateAuthorityFuture(params: DeleteCertificateAuthorityRequest): Future[js.Object] =
      service.deleteCertificateAuthority(params).promise.toFuture
    def deletePermissionFuture(params: DeletePermissionRequest): Future[js.Object] =
      service.deletePermission(params).promise.toFuture
    def describeCertificateAuthorityAuditReportFuture(
        params: DescribeCertificateAuthorityAuditReportRequest
    ): Future[DescribeCertificateAuthorityAuditReportResponse] =
      service.describeCertificateAuthorityAuditReport(params).promise.toFuture
    def describeCertificateAuthorityFuture(
        params: DescribeCertificateAuthorityRequest
    ): Future[DescribeCertificateAuthorityResponse] = service.describeCertificateAuthority(params).promise.toFuture
    def getCertificateAuthorityCertificateFuture(
        params: GetCertificateAuthorityCertificateRequest
    ): Future[GetCertificateAuthorityCertificateResponse] =
      service.getCertificateAuthorityCertificate(params).promise.toFuture
    def getCertificateAuthorityCsrFuture(
        params: GetCertificateAuthorityCsrRequest
    ): Future[GetCertificateAuthorityCsrResponse] = service.getCertificateAuthorityCsr(params).promise.toFuture
    def getCertificateFuture(params: GetCertificateRequest): Future[GetCertificateResponse] =
      service.getCertificate(params).promise.toFuture
    def importCertificateAuthorityCertificateFuture(
        params: ImportCertificateAuthorityCertificateRequest
    ): Future[js.Object] = service.importCertificateAuthorityCertificate(params).promise.toFuture
    def issueCertificateFuture(params: IssueCertificateRequest): Future[IssueCertificateResponse] =
      service.issueCertificate(params).promise.toFuture
    def listCertificateAuthoritiesFuture(
        params: ListCertificateAuthoritiesRequest
    ): Future[ListCertificateAuthoritiesResponse] = service.listCertificateAuthorities(params).promise.toFuture
    def listPermissionsFuture(params: ListPermissionsRequest): Future[ListPermissionsResponse] =
      service.listPermissions(params).promise.toFuture
    def listTagsFuture(params: ListTagsRequest): Future[ListTagsResponse] = service.listTags(params).promise.toFuture
    def restoreCertificateAuthorityFuture(params: RestoreCertificateAuthorityRequest): Future[js.Object] =
      service.restoreCertificateAuthority(params).promise.toFuture
    def revokeCertificateFuture(params: RevokeCertificateRequest): Future[js.Object] =
      service.revokeCertificate(params).promise.toFuture
    def tagCertificateAuthorityFuture(params: TagCertificateAuthorityRequest): Future[js.Object] =
      service.tagCertificateAuthority(params).promise.toFuture
    def untagCertificateAuthorityFuture(params: UntagCertificateAuthorityRequest): Future[js.Object] =
      service.untagCertificateAuthority(params).promise.toFuture
    def updateCertificateAuthorityFuture(params: UpdateCertificateAuthorityRequest): Future[js.Object] =
      service.updateCertificateAuthority(params).promise.toFuture
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
      val __obj = js.Dictionary.empty[js.Any]
      CommonName.foreach(__v => __obj.update("CommonName", __v.asInstanceOf[js.Any]))
      Country.foreach(__v => __obj.update("Country", __v.asInstanceOf[js.Any]))
      DistinguishedNameQualifier.foreach(__v => __obj.update("DistinguishedNameQualifier", __v.asInstanceOf[js.Any]))
      GenerationQualifier.foreach(__v => __obj.update("GenerationQualifier", __v.asInstanceOf[js.Any]))
      GivenName.foreach(__v => __obj.update("GivenName", __v.asInstanceOf[js.Any]))
      Initials.foreach(__v => __obj.update("Initials", __v.asInstanceOf[js.Any]))
      Locality.foreach(__v => __obj.update("Locality", __v.asInstanceOf[js.Any]))
      Organization.foreach(__v => __obj.update("Organization", __v.asInstanceOf[js.Any]))
      OrganizationalUnit.foreach(__v => __obj.update("OrganizationalUnit", __v.asInstanceOf[js.Any]))
      Pseudonym.foreach(__v => __obj.update("Pseudonym", __v.asInstanceOf[js.Any]))
      SerialNumber.foreach(__v => __obj.update("SerialNumber", __v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.update("State", __v.asInstanceOf[js.Any]))
      Surname.foreach(__v => __obj.update("Surname", __v.asInstanceOf[js.Any]))
      Title.foreach(__v => __obj.update("Title", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ASN1Subject]
    }
  }

  object ActionTypeEnum {
    val IssueCertificate = "IssueCertificate"
    val GetCertificate   = "GetCertificate"
    val ListPermissions  = "ListPermissions"

    val values = js.Object.freeze(js.Array(IssueCertificate, GetCertificate, ListPermissions))
  }

  object AuditReportResponseFormatEnum {
    val JSON = "JSON"
    val CSV  = "CSV"

    val values = js.Object.freeze(js.Array(JSON, CSV))
  }

  object AuditReportStatusEnum {
    val CREATING = "CREATING"
    val SUCCESS  = "SUCCESS"
    val FAILED   = "FAILED"

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
      val __obj = js.Dictionary.empty[js.Any]
      Arn.foreach(__v => __obj.update("Arn", __v.asInstanceOf[js.Any]))
      CertificateAuthorityConfiguration.foreach(
        __v => __obj.update("CertificateAuthorityConfiguration", __v.asInstanceOf[js.Any])
      )
      CreatedAt.foreach(__v => __obj.update("CreatedAt", __v.asInstanceOf[js.Any]))
      FailureReason.foreach(__v => __obj.update("FailureReason", __v.asInstanceOf[js.Any]))
      LastStateChangeAt.foreach(__v => __obj.update("LastStateChangeAt", __v.asInstanceOf[js.Any]))
      NotAfter.foreach(__v => __obj.update("NotAfter", __v.asInstanceOf[js.Any]))
      NotBefore.foreach(__v => __obj.update("NotBefore", __v.asInstanceOf[js.Any]))
      RestorableUntil.foreach(__v => __obj.update("RestorableUntil", __v.asInstanceOf[js.Any]))
      RevocationConfiguration.foreach(__v => __obj.update("RevocationConfiguration", __v.asInstanceOf[js.Any]))
      Serial.foreach(__v => __obj.update("Serial", __v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.update("Status", __v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.update("Type", __v.asInstanceOf[js.Any]))
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
    def apply(
        KeyAlgorithm: KeyAlgorithm,
        SigningAlgorithm: SigningAlgorithm,
        Subject: ASN1Subject
    ): CertificateAuthorityConfiguration = {
      val __obj = js.Dictionary[js.Any](
        "KeyAlgorithm"     -> KeyAlgorithm.asInstanceOf[js.Any],
        "SigningAlgorithm" -> SigningAlgorithm.asInstanceOf[js.Any],
        "Subject"          -> Subject.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CertificateAuthorityConfiguration]
    }
  }

  object CertificateAuthorityStatusEnum {
    val CREATING            = "CREATING"
    val PENDING_CERTIFICATE = "PENDING_CERTIFICATE"
    val ACTIVE              = "ACTIVE"
    val DELETED             = "DELETED"
    val DISABLED            = "DISABLED"
    val EXPIRED             = "EXPIRED"
    val FAILED              = "FAILED"

    val values = js.Object.freeze(js.Array(CREATING, PENDING_CERTIFICATE, ACTIVE, DELETED, DISABLED, EXPIRED, FAILED))
  }

  object CertificateAuthorityTypeEnum {
    val ROOT        = "ROOT"
    val SUBORDINATE = "SUBORDINATE"

    val values = js.Object.freeze(js.Array(ROOT, SUBORDINATE))
  }

  @js.native
  trait CreateCertificateAuthorityAuditReportRequest extends js.Object {
    var AuditReportResponseFormat: AuditReportResponseFormat
    var CertificateAuthorityArn: Arn
    var S3BucketName: String
  }

  object CreateCertificateAuthorityAuditReportRequest {
    def apply(
        AuditReportResponseFormat: AuditReportResponseFormat,
        CertificateAuthorityArn: Arn,
        S3BucketName: String
    ): CreateCertificateAuthorityAuditReportRequest = {
      val __obj = js.Dictionary[js.Any](
        "AuditReportResponseFormat" -> AuditReportResponseFormat.asInstanceOf[js.Any],
        "CertificateAuthorityArn"   -> CertificateAuthorityArn.asInstanceOf[js.Any],
        "S3BucketName"              -> S3BucketName.asInstanceOf[js.Any]
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
    def apply(
        AuditReportId: js.UndefOr[AuditReportId] = js.undefined,
        S3Key: js.UndefOr[String] = js.undefined
    ): CreateCertificateAuthorityAuditReportResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      AuditReportId.foreach(__v => __obj.update("AuditReportId", __v.asInstanceOf[js.Any]))
      S3Key.foreach(__v => __obj.update("S3Key", __v.asInstanceOf[js.Any]))
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
    def apply(
        CertificateAuthorityConfiguration: CertificateAuthorityConfiguration,
        CertificateAuthorityType: CertificateAuthorityType,
        IdempotencyToken: js.UndefOr[IdempotencyToken] = js.undefined,
        RevocationConfiguration: js.UndefOr[RevocationConfiguration] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateCertificateAuthorityRequest = {
      val __obj = js.Dictionary[js.Any](
        "CertificateAuthorityConfiguration" -> CertificateAuthorityConfiguration.asInstanceOf[js.Any],
        "CertificateAuthorityType"          -> CertificateAuthorityType.asInstanceOf[js.Any]
      )

      IdempotencyToken.foreach(__v => __obj.update("IdempotencyToken", __v.asInstanceOf[js.Any]))
      RevocationConfiguration.foreach(__v => __obj.update("RevocationConfiguration", __v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.update("Tags", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateCertificateAuthorityRequest]
    }
  }

  @js.native
  trait CreateCertificateAuthorityResponse extends js.Object {
    var CertificateAuthorityArn: js.UndefOr[Arn]
  }

  object CreateCertificateAuthorityResponse {
    def apply(
        CertificateAuthorityArn: js.UndefOr[Arn] = js.undefined
    ): CreateCertificateAuthorityResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      CertificateAuthorityArn.foreach(__v => __obj.update("CertificateAuthorityArn", __v.asInstanceOf[js.Any]))
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
    def apply(
        Actions: ActionList,
        CertificateAuthorityArn: Arn,
        Principal: Principal,
        SourceAccount: js.UndefOr[AccountId] = js.undefined
    ): CreatePermissionRequest = {
      val __obj = js.Dictionary[js.Any](
        "Actions"                 -> Actions.asInstanceOf[js.Any],
        "CertificateAuthorityArn" -> CertificateAuthorityArn.asInstanceOf[js.Any],
        "Principal"               -> Principal.asInstanceOf[js.Any]
      )

      SourceAccount.foreach(__v => __obj.update("SourceAccount", __v.asInstanceOf[js.Any]))
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
    def apply(
        Enabled: Boolean,
        CustomCname: js.UndefOr[String253] = js.undefined,
        ExpirationInDays: js.UndefOr[Integer1To5000] = js.undefined,
        S3BucketName: js.UndefOr[String3To255] = js.undefined
    ): CrlConfiguration = {
      val __obj = js.Dictionary[js.Any](
        "Enabled" -> Enabled.asInstanceOf[js.Any]
      )

      CustomCname.foreach(__v => __obj.update("CustomCname", __v.asInstanceOf[js.Any]))
      ExpirationInDays.foreach(__v => __obj.update("ExpirationInDays", __v.asInstanceOf[js.Any]))
      S3BucketName.foreach(__v => __obj.update("S3BucketName", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CrlConfiguration]
    }
  }

  @js.native
  trait DeleteCertificateAuthorityRequest extends js.Object {
    var CertificateAuthorityArn: Arn
    var PermanentDeletionTimeInDays: js.UndefOr[PermanentDeletionTimeInDays]
  }

  object DeleteCertificateAuthorityRequest {
    def apply(
        CertificateAuthorityArn: Arn,
        PermanentDeletionTimeInDays: js.UndefOr[PermanentDeletionTimeInDays] = js.undefined
    ): DeleteCertificateAuthorityRequest = {
      val __obj = js.Dictionary[js.Any](
        "CertificateAuthorityArn" -> CertificateAuthorityArn.asInstanceOf[js.Any]
      )

      PermanentDeletionTimeInDays.foreach(__v => __obj.update("PermanentDeletionTimeInDays", __v.asInstanceOf[js.Any]))
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
    def apply(
        CertificateAuthorityArn: Arn,
        Principal: Principal,
        SourceAccount: js.UndefOr[AccountId] = js.undefined
    ): DeletePermissionRequest = {
      val __obj = js.Dictionary[js.Any](
        "CertificateAuthorityArn" -> CertificateAuthorityArn.asInstanceOf[js.Any],
        "Principal"               -> Principal.asInstanceOf[js.Any]
      )

      SourceAccount.foreach(__v => __obj.update("SourceAccount", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeletePermissionRequest]
    }
  }

  @js.native
  trait DescribeCertificateAuthorityAuditReportRequest extends js.Object {
    var AuditReportId: AuditReportId
    var CertificateAuthorityArn: Arn
  }

  object DescribeCertificateAuthorityAuditReportRequest {
    def apply(
        AuditReportId: AuditReportId,
        CertificateAuthorityArn: Arn
    ): DescribeCertificateAuthorityAuditReportRequest = {
      val __obj = js.Dictionary[js.Any](
        "AuditReportId"           -> AuditReportId.asInstanceOf[js.Any],
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
    def apply(
        AuditReportStatus: js.UndefOr[AuditReportStatus] = js.undefined,
        CreatedAt: js.UndefOr[TStamp] = js.undefined,
        S3BucketName: js.UndefOr[String] = js.undefined,
        S3Key: js.UndefOr[String] = js.undefined
    ): DescribeCertificateAuthorityAuditReportResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      AuditReportStatus.foreach(__v => __obj.update("AuditReportStatus", __v.asInstanceOf[js.Any]))
      CreatedAt.foreach(__v => __obj.update("CreatedAt", __v.asInstanceOf[js.Any]))
      S3BucketName.foreach(__v => __obj.update("S3BucketName", __v.asInstanceOf[js.Any]))
      S3Key.foreach(__v => __obj.update("S3Key", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeCertificateAuthorityAuditReportResponse]
    }
  }

  @js.native
  trait DescribeCertificateAuthorityRequest extends js.Object {
    var CertificateAuthorityArn: Arn
  }

  object DescribeCertificateAuthorityRequest {
    def apply(
        CertificateAuthorityArn: Arn
    ): DescribeCertificateAuthorityRequest = {
      val __obj = js.Dictionary[js.Any](
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
    def apply(
        CertificateAuthority: js.UndefOr[CertificateAuthority] = js.undefined
    ): DescribeCertificateAuthorityResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      CertificateAuthority.foreach(__v => __obj.update("CertificateAuthority", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeCertificateAuthorityResponse]
    }
  }

  object FailureReasonEnum {
    val REQUEST_TIMED_OUT     = "REQUEST_TIMED_OUT"
    val UNSUPPORTED_ALGORITHM = "UNSUPPORTED_ALGORITHM"
    val OTHER                 = "OTHER"

    val values = js.Object.freeze(js.Array(REQUEST_TIMED_OUT, UNSUPPORTED_ALGORITHM, OTHER))
  }

  @js.native
  trait GetCertificateAuthorityCertificateRequest extends js.Object {
    var CertificateAuthorityArn: Arn
  }

  object GetCertificateAuthorityCertificateRequest {
    def apply(
        CertificateAuthorityArn: Arn
    ): GetCertificateAuthorityCertificateRequest = {
      val __obj = js.Dictionary[js.Any](
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
    def apply(
        Certificate: js.UndefOr[CertificateBody] = js.undefined,
        CertificateChain: js.UndefOr[CertificateChain] = js.undefined
    ): GetCertificateAuthorityCertificateResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Certificate.foreach(__v => __obj.update("Certificate", __v.asInstanceOf[js.Any]))
      CertificateChain.foreach(__v => __obj.update("CertificateChain", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetCertificateAuthorityCertificateResponse]
    }
  }

  @js.native
  trait GetCertificateAuthorityCsrRequest extends js.Object {
    var CertificateAuthorityArn: Arn
  }

  object GetCertificateAuthorityCsrRequest {
    def apply(
        CertificateAuthorityArn: Arn
    ): GetCertificateAuthorityCsrRequest = {
      val __obj = js.Dictionary[js.Any](
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
    def apply(
        Csr: js.UndefOr[CsrBody] = js.undefined
    ): GetCertificateAuthorityCsrResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Csr.foreach(__v => __obj.update("Csr", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetCertificateAuthorityCsrResponse]
    }
  }

  @js.native
  trait GetCertificateRequest extends js.Object {
    var CertificateArn: Arn
    var CertificateAuthorityArn: Arn
  }

  object GetCertificateRequest {
    def apply(
        CertificateArn: Arn,
        CertificateAuthorityArn: Arn
    ): GetCertificateRequest = {
      val __obj = js.Dictionary[js.Any](
        "CertificateArn"          -> CertificateArn.asInstanceOf[js.Any],
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
    def apply(
        Certificate: js.UndefOr[CertificateBody] = js.undefined,
        CertificateChain: js.UndefOr[CertificateChain] = js.undefined
    ): GetCertificateResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Certificate.foreach(__v => __obj.update("Certificate", __v.asInstanceOf[js.Any]))
      CertificateChain.foreach(__v => __obj.update("CertificateChain", __v.asInstanceOf[js.Any]))
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
    def apply(
        Certificate: CertificateBodyBlob,
        CertificateAuthorityArn: Arn,
        CertificateChain: js.UndefOr[CertificateChainBlob] = js.undefined
    ): ImportCertificateAuthorityCertificateRequest = {
      val __obj = js.Dictionary[js.Any](
        "Certificate"             -> Certificate.asInstanceOf[js.Any],
        "CertificateAuthorityArn" -> CertificateAuthorityArn.asInstanceOf[js.Any]
      )

      CertificateChain.foreach(__v => __obj.update("CertificateChain", __v.asInstanceOf[js.Any]))
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
    def apply(
        CertificateAuthorityArn: Arn,
        Csr: CsrBlob,
        SigningAlgorithm: SigningAlgorithm,
        Validity: Validity,
        IdempotencyToken: js.UndefOr[IdempotencyToken] = js.undefined,
        TemplateArn: js.UndefOr[Arn] = js.undefined
    ): IssueCertificateRequest = {
      val __obj = js.Dictionary[js.Any](
        "CertificateAuthorityArn" -> CertificateAuthorityArn.asInstanceOf[js.Any],
        "Csr"                     -> Csr.asInstanceOf[js.Any],
        "SigningAlgorithm"        -> SigningAlgorithm.asInstanceOf[js.Any],
        "Validity"                -> Validity.asInstanceOf[js.Any]
      )

      IdempotencyToken.foreach(__v => __obj.update("IdempotencyToken", __v.asInstanceOf[js.Any]))
      TemplateArn.foreach(__v => __obj.update("TemplateArn", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[IssueCertificateRequest]
    }
  }

  @js.native
  trait IssueCertificateResponse extends js.Object {
    var CertificateArn: js.UndefOr[Arn]
  }

  object IssueCertificateResponse {
    def apply(
        CertificateArn: js.UndefOr[Arn] = js.undefined
    ): IssueCertificateResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      CertificateArn.foreach(__v => __obj.update("CertificateArn", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[IssueCertificateResponse]
    }
  }

  object KeyAlgorithmEnum {
    val RSA_2048      = "RSA_2048"
    val RSA_4096      = "RSA_4096"
    val EC_prime256v1 = "EC_prime256v1"
    val EC_secp384r1  = "EC_secp384r1"

    val values = js.Object.freeze(js.Array(RSA_2048, RSA_4096, EC_prime256v1, EC_secp384r1))
  }

  @js.native
  trait ListCertificateAuthoritiesRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListCertificateAuthoritiesRequest {
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListCertificateAuthoritiesRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListCertificateAuthoritiesRequest]
    }
  }

  @js.native
  trait ListCertificateAuthoritiesResponse extends js.Object {
    var CertificateAuthorities: js.UndefOr[CertificateAuthorities]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListCertificateAuthoritiesResponse {
    def apply(
        CertificateAuthorities: js.UndefOr[CertificateAuthorities] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListCertificateAuthoritiesResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      CertificateAuthorities.foreach(__v => __obj.update("CertificateAuthorities", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
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
    def apply(
        CertificateAuthorityArn: Arn,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListPermissionsRequest = {
      val __obj = js.Dictionary[js.Any](
        "CertificateAuthorityArn" -> CertificateAuthorityArn.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPermissionsRequest]
    }
  }

  @js.native
  trait ListPermissionsResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Permissions: js.UndefOr[PermissionList]
  }

  object ListPermissionsResponse {
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        Permissions: js.UndefOr[PermissionList] = js.undefined
    ): ListPermissionsResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      Permissions.foreach(__v => __obj.update("Permissions", __v.asInstanceOf[js.Any]))
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
    def apply(
        CertificateAuthorityArn: Arn,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListTagsRequest = {
      val __obj = js.Dictionary[js.Any](
        "CertificateAuthorityArn" -> CertificateAuthorityArn.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsRequest]
    }
  }

  @js.native
  trait ListTagsResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Tags: js.UndefOr[TagList]
  }

  object ListTagsResponse {
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): ListTagsResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.update("Tags", __v.asInstanceOf[js.Any]))
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
    def apply(
        Actions: js.UndefOr[ActionList] = js.undefined,
        CertificateAuthorityArn: js.UndefOr[Arn] = js.undefined,
        CreatedAt: js.UndefOr[TStamp] = js.undefined,
        Policy: js.UndefOr[String] = js.undefined,
        Principal: js.UndefOr[String] = js.undefined,
        SourceAccount: js.UndefOr[String] = js.undefined
    ): Permission = {
      val __obj = js.Dictionary.empty[js.Any]
      Actions.foreach(__v => __obj.update("Actions", __v.asInstanceOf[js.Any]))
      CertificateAuthorityArn.foreach(__v => __obj.update("CertificateAuthorityArn", __v.asInstanceOf[js.Any]))
      CreatedAt.foreach(__v => __obj.update("CreatedAt", __v.asInstanceOf[js.Any]))
      Policy.foreach(__v => __obj.update("Policy", __v.asInstanceOf[js.Any]))
      Principal.foreach(__v => __obj.update("Principal", __v.asInstanceOf[js.Any]))
      SourceAccount.foreach(__v => __obj.update("SourceAccount", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Permission]
    }
  }

  @js.native
  trait RestoreCertificateAuthorityRequest extends js.Object {
    var CertificateAuthorityArn: Arn
  }

  object RestoreCertificateAuthorityRequest {
    def apply(
        CertificateAuthorityArn: Arn
    ): RestoreCertificateAuthorityRequest = {
      val __obj = js.Dictionary[js.Any](
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
    def apply(
        CrlConfiguration: js.UndefOr[CrlConfiguration] = js.undefined
    ): RevocationConfiguration = {
      val __obj = js.Dictionary.empty[js.Any]
      CrlConfiguration.foreach(__v => __obj.update("CrlConfiguration", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RevocationConfiguration]
    }
  }

  object RevocationReasonEnum {
    val UNSPECIFIED                      = "UNSPECIFIED"
    val KEY_COMPROMISE                   = "KEY_COMPROMISE"
    val CERTIFICATE_AUTHORITY_COMPROMISE = "CERTIFICATE_AUTHORITY_COMPROMISE"
    val AFFILIATION_CHANGED              = "AFFILIATION_CHANGED"
    val SUPERSEDED                       = "SUPERSEDED"
    val CESSATION_OF_OPERATION           = "CESSATION_OF_OPERATION"
    val PRIVILEGE_WITHDRAWN              = "PRIVILEGE_WITHDRAWN"
    val A_A_COMPROMISE                   = "A_A_COMPROMISE"

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
    def apply(
        CertificateAuthorityArn: Arn,
        CertificateSerial: String128,
        RevocationReason: RevocationReason
    ): RevokeCertificateRequest = {
      val __obj = js.Dictionary[js.Any](
        "CertificateAuthorityArn" -> CertificateAuthorityArn.asInstanceOf[js.Any],
        "CertificateSerial"       -> CertificateSerial.asInstanceOf[js.Any],
        "RevocationReason"        -> RevocationReason.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[RevokeCertificateRequest]
    }
  }

  object SigningAlgorithmEnum {
    val SHA256WITHECDSA = "SHA256WITHECDSA"
    val SHA384WITHECDSA = "SHA384WITHECDSA"
    val SHA512WITHECDSA = "SHA512WITHECDSA"
    val SHA256WITHRSA   = "SHA256WITHRSA"
    val SHA384WITHRSA   = "SHA384WITHRSA"
    val SHA512WITHRSA   = "SHA512WITHRSA"

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
    def apply(
        Key: TagKey,
        Value: js.UndefOr[TagValue] = js.undefined
    ): Tag = {
      val __obj = js.Dictionary[js.Any](
        "Key" -> Key.asInstanceOf[js.Any]
      )

      Value.foreach(__v => __obj.update("Value", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Tag]
    }
  }

  @js.native
  trait TagCertificateAuthorityRequest extends js.Object {
    var CertificateAuthorityArn: Arn
    var Tags: TagList
  }

  object TagCertificateAuthorityRequest {
    def apply(
        CertificateAuthorityArn: Arn,
        Tags: TagList
    ): TagCertificateAuthorityRequest = {
      val __obj = js.Dictionary[js.Any](
        "CertificateAuthorityArn" -> CertificateAuthorityArn.asInstanceOf[js.Any],
        "Tags"                    -> Tags.asInstanceOf[js.Any]
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
    def apply(
        CertificateAuthorityArn: Arn,
        Tags: TagList
    ): UntagCertificateAuthorityRequest = {
      val __obj = js.Dictionary[js.Any](
        "CertificateAuthorityArn" -> CertificateAuthorityArn.asInstanceOf[js.Any],
        "Tags"                    -> Tags.asInstanceOf[js.Any]
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
    def apply(
        CertificateAuthorityArn: Arn,
        RevocationConfiguration: js.UndefOr[RevocationConfiguration] = js.undefined,
        Status: js.UndefOr[CertificateAuthorityStatus] = js.undefined
    ): UpdateCertificateAuthorityRequest = {
      val __obj = js.Dictionary[js.Any](
        "CertificateAuthorityArn" -> CertificateAuthorityArn.asInstanceOf[js.Any]
      )

      RevocationConfiguration.foreach(__v => __obj.update("RevocationConfiguration", __v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.update("Status", __v.asInstanceOf[js.Any]))
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
    def apply(
        Type: ValidityPeriodType,
        Value: PositiveLong
    ): Validity = {
      val __obj = js.Dictionary[js.Any](
        "Type"  -> Type.asInstanceOf[js.Any],
        "Value" -> Value.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[Validity]
    }
  }

  object ValidityPeriodTypeEnum {
    val END_DATE = "END_DATE"
    val ABSOLUTE = "ABSOLUTE"
    val DAYS     = "DAYS"
    val MONTHS   = "MONTHS"
    val YEARS    = "YEARS"

    val values = js.Object.freeze(js.Array(END_DATE, ABSOLUTE, DAYS, MONTHS, YEARS))
  }
}
