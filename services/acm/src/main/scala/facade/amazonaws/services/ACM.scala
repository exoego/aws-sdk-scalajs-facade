package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

package object acm {
  type Arn = String
  type CertificateBody = String
  type CertificateBodyBlob = js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type CertificateChain = String
  type CertificateChainBlob = js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type CertificateStatuses = js.Array[CertificateStatus]
  type CertificateSummaryList = js.Array[CertificateSummary]
  type DomainList = js.Array[DomainNameString]
  type DomainNameString = String
  type DomainValidationList = js.Array[DomainValidation]
  type DomainValidationOptionList = js.Array[DomainValidationOption]
  type ExtendedKeyUsageFilterList = js.Array[ExtendedKeyUsageName]
  type ExtendedKeyUsageList = js.Array[ExtendedKeyUsage]
  type IdempotencyToken = String
  type InUseList = js.Array[String]
  type KeyAlgorithmList = js.Array[KeyAlgorithm]
  type KeyUsageFilterList = js.Array[KeyUsageName]
  type KeyUsageList = js.Array[KeyUsage]
  type MaxItems = Int
  type NextToken = String
  type PassphraseBlob = js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type PrivateKey = String
  type PrivateKeyBlob = js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type TStamp = js.Date
  type TagKey = String
  type TagList = js.Array[Tag]
  type TagValue = String
  type ValidationEmailList = js.Array[String]

  implicit final class ACMOps(private val service: ACM) extends AnyVal {

    @inline def addTagsToCertificateFuture(params: AddTagsToCertificateRequest): Future[js.Object] = service.addTagsToCertificate(params).promise().toFuture
    @inline def deleteCertificateFuture(params: DeleteCertificateRequest): Future[js.Object] = service.deleteCertificate(params).promise().toFuture
    @inline def describeCertificateFuture(params: DescribeCertificateRequest): Future[DescribeCertificateResponse] = service.describeCertificate(params).promise().toFuture
    @inline def exportCertificateFuture(params: ExportCertificateRequest): Future[ExportCertificateResponse] = service.exportCertificate(params).promise().toFuture
    @inline def getCertificateFuture(params: GetCertificateRequest): Future[GetCertificateResponse] = service.getCertificate(params).promise().toFuture
    @inline def importCertificateFuture(params: ImportCertificateRequest): Future[ImportCertificateResponse] = service.importCertificate(params).promise().toFuture
    @inline def listCertificatesFuture(params: ListCertificatesRequest): Future[ListCertificatesResponse] = service.listCertificates(params).promise().toFuture
    @inline def listTagsForCertificateFuture(params: ListTagsForCertificateRequest): Future[ListTagsForCertificateResponse] = service.listTagsForCertificate(params).promise().toFuture
    @inline def removeTagsFromCertificateFuture(params: RemoveTagsFromCertificateRequest): Future[js.Object] = service.removeTagsFromCertificate(params).promise().toFuture
    @inline def renewCertificateFuture(params: RenewCertificateRequest): Future[js.Object] = service.renewCertificate(params).promise().toFuture
    @inline def requestCertificateFuture(params: RequestCertificateRequest): Future[RequestCertificateResponse] = service.requestCertificate(params).promise().toFuture
    @inline def resendValidationEmailFuture(params: ResendValidationEmailRequest): Future[js.Object] = service.resendValidationEmail(params).promise().toFuture
    @inline def updateCertificateOptionsFuture(params: UpdateCertificateOptionsRequest): Future[js.Object] = service.updateCertificateOptions(params).promise().toFuture
  }
}

package acm {
  @js.native
  @JSImport("aws-sdk", "ACM", "AWS.ACM")
  class ACM() extends js.Object {
    def this(config: AWSConfig) = this()

    def addTagsToCertificate(params: AddTagsToCertificateRequest): Request[js.Object] = js.native
    def deleteCertificate(params: DeleteCertificateRequest): Request[js.Object] = js.native
    def describeCertificate(params: DescribeCertificateRequest): Request[DescribeCertificateResponse] = js.native
    def exportCertificate(params: ExportCertificateRequest): Request[ExportCertificateResponse] = js.native
    def getCertificate(params: GetCertificateRequest): Request[GetCertificateResponse] = js.native
    def importCertificate(params: ImportCertificateRequest): Request[ImportCertificateResponse] = js.native
    def listCertificates(params: ListCertificatesRequest): Request[ListCertificatesResponse] = js.native
    def listTagsForCertificate(params: ListTagsForCertificateRequest): Request[ListTagsForCertificateResponse] = js.native
    def removeTagsFromCertificate(params: RemoveTagsFromCertificateRequest): Request[js.Object] = js.native
    def renewCertificate(params: RenewCertificateRequest): Request[js.Object] = js.native
    def requestCertificate(params: RequestCertificateRequest): Request[RequestCertificateResponse] = js.native
    def resendValidationEmail(params: ResendValidationEmailRequest): Request[js.Object] = js.native
    def updateCertificateOptions(params: UpdateCertificateOptionsRequest): Request[js.Object] = js.native
  }

  @js.native
  trait AddTagsToCertificateRequest extends js.Object {
    var CertificateArn: Arn
    var Tags: TagList
  }

  object AddTagsToCertificateRequest {
    @inline
    def apply(
        CertificateArn: Arn,
        Tags: TagList
    ): AddTagsToCertificateRequest = {
      val __obj = js.Dynamic.literal(
        "CertificateArn" -> CertificateArn.asInstanceOf[js.Any],
        "Tags" -> Tags.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[AddTagsToCertificateRequest]
    }
  }

  /**
    * Contains metadata about an ACM certificate. This structure is returned in the response to a <a>DescribeCertificate</a> request.
    */
  @js.native
  trait CertificateDetail extends js.Object {
    var CertificateArn: js.UndefOr[Arn]
    var CertificateAuthorityArn: js.UndefOr[Arn]
    var CreatedAt: js.UndefOr[TStamp]
    var DomainName: js.UndefOr[DomainNameString]
    var DomainValidationOptions: js.UndefOr[DomainValidationList]
    var ExtendedKeyUsages: js.UndefOr[ExtendedKeyUsageList]
    var FailureReason: js.UndefOr[FailureReason]
    var ImportedAt: js.UndefOr[TStamp]
    var InUseBy: js.UndefOr[InUseList]
    var IssuedAt: js.UndefOr[TStamp]
    var Issuer: js.UndefOr[String]
    var KeyAlgorithm: js.UndefOr[KeyAlgorithm]
    var KeyUsages: js.UndefOr[KeyUsageList]
    var NotAfter: js.UndefOr[TStamp]
    var NotBefore: js.UndefOr[TStamp]
    var Options: js.UndefOr[CertificateOptions]
    var RenewalEligibility: js.UndefOr[RenewalEligibility]
    var RenewalSummary: js.UndefOr[RenewalSummary]
    var RevocationReason: js.UndefOr[RevocationReason]
    var RevokedAt: js.UndefOr[TStamp]
    var Serial: js.UndefOr[String]
    var SignatureAlgorithm: js.UndefOr[String]
    var Status: js.UndefOr[CertificateStatus]
    var Subject: js.UndefOr[String]
    var SubjectAlternativeNames: js.UndefOr[DomainList]
    var Type: js.UndefOr[CertificateType]
  }

  object CertificateDetail {
    @inline
    def apply(
        CertificateArn: js.UndefOr[Arn] = js.undefined,
        CertificateAuthorityArn: js.UndefOr[Arn] = js.undefined,
        CreatedAt: js.UndefOr[TStamp] = js.undefined,
        DomainName: js.UndefOr[DomainNameString] = js.undefined,
        DomainValidationOptions: js.UndefOr[DomainValidationList] = js.undefined,
        ExtendedKeyUsages: js.UndefOr[ExtendedKeyUsageList] = js.undefined,
        FailureReason: js.UndefOr[FailureReason] = js.undefined,
        ImportedAt: js.UndefOr[TStamp] = js.undefined,
        InUseBy: js.UndefOr[InUseList] = js.undefined,
        IssuedAt: js.UndefOr[TStamp] = js.undefined,
        Issuer: js.UndefOr[String] = js.undefined,
        KeyAlgorithm: js.UndefOr[KeyAlgorithm] = js.undefined,
        KeyUsages: js.UndefOr[KeyUsageList] = js.undefined,
        NotAfter: js.UndefOr[TStamp] = js.undefined,
        NotBefore: js.UndefOr[TStamp] = js.undefined,
        Options: js.UndefOr[CertificateOptions] = js.undefined,
        RenewalEligibility: js.UndefOr[RenewalEligibility] = js.undefined,
        RenewalSummary: js.UndefOr[RenewalSummary] = js.undefined,
        RevocationReason: js.UndefOr[RevocationReason] = js.undefined,
        RevokedAt: js.UndefOr[TStamp] = js.undefined,
        Serial: js.UndefOr[String] = js.undefined,
        SignatureAlgorithm: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[CertificateStatus] = js.undefined,
        Subject: js.UndefOr[String] = js.undefined,
        SubjectAlternativeNames: js.UndefOr[DomainList] = js.undefined,
        Type: js.UndefOr[CertificateType] = js.undefined
    ): CertificateDetail = {
      val __obj = js.Dynamic.literal()
      CertificateArn.foreach(__v => __obj.updateDynamic("CertificateArn")(__v.asInstanceOf[js.Any]))
      CertificateAuthorityArn.foreach(__v => __obj.updateDynamic("CertificateAuthorityArn")(__v.asInstanceOf[js.Any]))
      CreatedAt.foreach(__v => __obj.updateDynamic("CreatedAt")(__v.asInstanceOf[js.Any]))
      DomainName.foreach(__v => __obj.updateDynamic("DomainName")(__v.asInstanceOf[js.Any]))
      DomainValidationOptions.foreach(__v => __obj.updateDynamic("DomainValidationOptions")(__v.asInstanceOf[js.Any]))
      ExtendedKeyUsages.foreach(__v => __obj.updateDynamic("ExtendedKeyUsages")(__v.asInstanceOf[js.Any]))
      FailureReason.foreach(__v => __obj.updateDynamic("FailureReason")(__v.asInstanceOf[js.Any]))
      ImportedAt.foreach(__v => __obj.updateDynamic("ImportedAt")(__v.asInstanceOf[js.Any]))
      InUseBy.foreach(__v => __obj.updateDynamic("InUseBy")(__v.asInstanceOf[js.Any]))
      IssuedAt.foreach(__v => __obj.updateDynamic("IssuedAt")(__v.asInstanceOf[js.Any]))
      Issuer.foreach(__v => __obj.updateDynamic("Issuer")(__v.asInstanceOf[js.Any]))
      KeyAlgorithm.foreach(__v => __obj.updateDynamic("KeyAlgorithm")(__v.asInstanceOf[js.Any]))
      KeyUsages.foreach(__v => __obj.updateDynamic("KeyUsages")(__v.asInstanceOf[js.Any]))
      NotAfter.foreach(__v => __obj.updateDynamic("NotAfter")(__v.asInstanceOf[js.Any]))
      NotBefore.foreach(__v => __obj.updateDynamic("NotBefore")(__v.asInstanceOf[js.Any]))
      Options.foreach(__v => __obj.updateDynamic("Options")(__v.asInstanceOf[js.Any]))
      RenewalEligibility.foreach(__v => __obj.updateDynamic("RenewalEligibility")(__v.asInstanceOf[js.Any]))
      RenewalSummary.foreach(__v => __obj.updateDynamic("RenewalSummary")(__v.asInstanceOf[js.Any]))
      RevocationReason.foreach(__v => __obj.updateDynamic("RevocationReason")(__v.asInstanceOf[js.Any]))
      RevokedAt.foreach(__v => __obj.updateDynamic("RevokedAt")(__v.asInstanceOf[js.Any]))
      Serial.foreach(__v => __obj.updateDynamic("Serial")(__v.asInstanceOf[js.Any]))
      SignatureAlgorithm.foreach(__v => __obj.updateDynamic("SignatureAlgorithm")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      Subject.foreach(__v => __obj.updateDynamic("Subject")(__v.asInstanceOf[js.Any]))
      SubjectAlternativeNames.foreach(__v => __obj.updateDynamic("SubjectAlternativeNames")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CertificateDetail]
    }
  }

  /**
    * Structure that contains options for your certificate. Currently, you can use this only to specify whether to opt in to or out of certificate transparency logging. Some browsers require that public certificates issued for your domain be recorded in a log. Certificates that are not logged typically generate a browser error. Transparency makes it possible for you to detect SSL/TLS certificates that have been mistakenly or maliciously issued for your domain. For general information, see [[https://docs.aws.amazon.com/acm/latest/userguide/acm-concepts.html#concept-transparency|Certificate Transparency Logging]].
    */
  @js.native
  trait CertificateOptions extends js.Object {
    var CertificateTransparencyLoggingPreference: js.UndefOr[CertificateTransparencyLoggingPreference]
  }

  object CertificateOptions {
    @inline
    def apply(
        CertificateTransparencyLoggingPreference: js.UndefOr[CertificateTransparencyLoggingPreference] = js.undefined
    ): CertificateOptions = {
      val __obj = js.Dynamic.literal()
      CertificateTransparencyLoggingPreference.foreach(__v => __obj.updateDynamic("CertificateTransparencyLoggingPreference")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CertificateOptions]
    }
  }

  @js.native
  sealed trait CertificateStatus extends js.Any
  object CertificateStatus extends js.Object {
    val PENDING_VALIDATION = "PENDING_VALIDATION".asInstanceOf[CertificateStatus]
    val ISSUED = "ISSUED".asInstanceOf[CertificateStatus]
    val INACTIVE = "INACTIVE".asInstanceOf[CertificateStatus]
    val EXPIRED = "EXPIRED".asInstanceOf[CertificateStatus]
    val VALIDATION_TIMED_OUT = "VALIDATION_TIMED_OUT".asInstanceOf[CertificateStatus]
    val REVOKED = "REVOKED".asInstanceOf[CertificateStatus]
    val FAILED = "FAILED".asInstanceOf[CertificateStatus]

    val values = js.Object.freeze(js.Array(PENDING_VALIDATION, ISSUED, INACTIVE, EXPIRED, VALIDATION_TIMED_OUT, REVOKED, FAILED))
  }

  /**
    * This structure is returned in the response object of <a>ListCertificates</a> action.
    */
  @js.native
  trait CertificateSummary extends js.Object {
    var CertificateArn: js.UndefOr[Arn]
    var DomainName: js.UndefOr[DomainNameString]
  }

  object CertificateSummary {
    @inline
    def apply(
        CertificateArn: js.UndefOr[Arn] = js.undefined,
        DomainName: js.UndefOr[DomainNameString] = js.undefined
    ): CertificateSummary = {
      val __obj = js.Dynamic.literal()
      CertificateArn.foreach(__v => __obj.updateDynamic("CertificateArn")(__v.asInstanceOf[js.Any]))
      DomainName.foreach(__v => __obj.updateDynamic("DomainName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CertificateSummary]
    }
  }

  @js.native
  sealed trait CertificateTransparencyLoggingPreference extends js.Any
  object CertificateTransparencyLoggingPreference extends js.Object {
    val ENABLED = "ENABLED".asInstanceOf[CertificateTransparencyLoggingPreference]
    val DISABLED = "DISABLED".asInstanceOf[CertificateTransparencyLoggingPreference]

    val values = js.Object.freeze(js.Array(ENABLED, DISABLED))
  }

  @js.native
  sealed trait CertificateType extends js.Any
  object CertificateType extends js.Object {
    val IMPORTED = "IMPORTED".asInstanceOf[CertificateType]
    val AMAZON_ISSUED = "AMAZON_ISSUED".asInstanceOf[CertificateType]
    val PRIVATE = "PRIVATE".asInstanceOf[CertificateType]

    val values = js.Object.freeze(js.Array(IMPORTED, AMAZON_ISSUED, PRIVATE))
  }

  @js.native
  trait DeleteCertificateRequest extends js.Object {
    var CertificateArn: Arn
  }

  object DeleteCertificateRequest {
    @inline
    def apply(
        CertificateArn: Arn
    ): DeleteCertificateRequest = {
      val __obj = js.Dynamic.literal(
        "CertificateArn" -> CertificateArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteCertificateRequest]
    }
  }

  @js.native
  trait DescribeCertificateRequest extends js.Object {
    var CertificateArn: Arn
  }

  object DescribeCertificateRequest {
    @inline
    def apply(
        CertificateArn: Arn
    ): DescribeCertificateRequest = {
      val __obj = js.Dynamic.literal(
        "CertificateArn" -> CertificateArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeCertificateRequest]
    }
  }

  @js.native
  trait DescribeCertificateResponse extends js.Object {
    var Certificate: js.UndefOr[CertificateDetail]
  }

  object DescribeCertificateResponse {
    @inline
    def apply(
        Certificate: js.UndefOr[CertificateDetail] = js.undefined
    ): DescribeCertificateResponse = {
      val __obj = js.Dynamic.literal()
      Certificate.foreach(__v => __obj.updateDynamic("Certificate")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeCertificateResponse]
    }
  }

  @js.native
  sealed trait DomainStatus extends js.Any
  object DomainStatus extends js.Object {
    val PENDING_VALIDATION = "PENDING_VALIDATION".asInstanceOf[DomainStatus]
    val SUCCESS = "SUCCESS".asInstanceOf[DomainStatus]
    val FAILED = "FAILED".asInstanceOf[DomainStatus]

    val values = js.Object.freeze(js.Array(PENDING_VALIDATION, SUCCESS, FAILED))
  }

  /**
    * Contains information about the validation of each domain name in the certificate.
    */
  @js.native
  trait DomainValidation extends js.Object {
    var DomainName: DomainNameString
    var ResourceRecord: js.UndefOr[ResourceRecord]
    var ValidationDomain: js.UndefOr[DomainNameString]
    var ValidationEmails: js.UndefOr[ValidationEmailList]
    var ValidationMethod: js.UndefOr[ValidationMethod]
    var ValidationStatus: js.UndefOr[DomainStatus]
  }

  object DomainValidation {
    @inline
    def apply(
        DomainName: DomainNameString,
        ResourceRecord: js.UndefOr[ResourceRecord] = js.undefined,
        ValidationDomain: js.UndefOr[DomainNameString] = js.undefined,
        ValidationEmails: js.UndefOr[ValidationEmailList] = js.undefined,
        ValidationMethod: js.UndefOr[ValidationMethod] = js.undefined,
        ValidationStatus: js.UndefOr[DomainStatus] = js.undefined
    ): DomainValidation = {
      val __obj = js.Dynamic.literal(
        "DomainName" -> DomainName.asInstanceOf[js.Any]
      )

      ResourceRecord.foreach(__v => __obj.updateDynamic("ResourceRecord")(__v.asInstanceOf[js.Any]))
      ValidationDomain.foreach(__v => __obj.updateDynamic("ValidationDomain")(__v.asInstanceOf[js.Any]))
      ValidationEmails.foreach(__v => __obj.updateDynamic("ValidationEmails")(__v.asInstanceOf[js.Any]))
      ValidationMethod.foreach(__v => __obj.updateDynamic("ValidationMethod")(__v.asInstanceOf[js.Any]))
      ValidationStatus.foreach(__v => __obj.updateDynamic("ValidationStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DomainValidation]
    }
  }

  /**
    * Contains information about the domain names that you want ACM to use to send you emails that enable you to validate domain ownership.
    */
  @js.native
  trait DomainValidationOption extends js.Object {
    var DomainName: DomainNameString
    var ValidationDomain: DomainNameString
  }

  object DomainValidationOption {
    @inline
    def apply(
        DomainName: DomainNameString,
        ValidationDomain: DomainNameString
    ): DomainValidationOption = {
      val __obj = js.Dynamic.literal(
        "DomainName" -> DomainName.asInstanceOf[js.Any],
        "ValidationDomain" -> ValidationDomain.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DomainValidationOption]
    }
  }

  @js.native
  trait ExportCertificateRequest extends js.Object {
    var CertificateArn: Arn
    var Passphrase: PassphraseBlob
  }

  object ExportCertificateRequest {
    @inline
    def apply(
        CertificateArn: Arn,
        Passphrase: PassphraseBlob
    ): ExportCertificateRequest = {
      val __obj = js.Dynamic.literal(
        "CertificateArn" -> CertificateArn.asInstanceOf[js.Any],
        "Passphrase" -> Passphrase.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ExportCertificateRequest]
    }
  }

  @js.native
  trait ExportCertificateResponse extends js.Object {
    var Certificate: js.UndefOr[CertificateBody]
    var CertificateChain: js.UndefOr[CertificateChain]
    var PrivateKey: js.UndefOr[PrivateKey]
  }

  object ExportCertificateResponse {
    @inline
    def apply(
        Certificate: js.UndefOr[CertificateBody] = js.undefined,
        CertificateChain: js.UndefOr[CertificateChain] = js.undefined,
        PrivateKey: js.UndefOr[PrivateKey] = js.undefined
    ): ExportCertificateResponse = {
      val __obj = js.Dynamic.literal()
      Certificate.foreach(__v => __obj.updateDynamic("Certificate")(__v.asInstanceOf[js.Any]))
      CertificateChain.foreach(__v => __obj.updateDynamic("CertificateChain")(__v.asInstanceOf[js.Any]))
      PrivateKey.foreach(__v => __obj.updateDynamic("PrivateKey")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ExportCertificateResponse]
    }
  }

  /**
    * The Extended Key Usage X.509 v3 extension defines one or more purposes for which the public key can be used. This is in addition to or in place of the basic purposes specified by the Key Usage extension.
    */
  @js.native
  trait ExtendedKeyUsage extends js.Object {
    var Name: js.UndefOr[ExtendedKeyUsageName]
    var OID: js.UndefOr[String]
  }

  object ExtendedKeyUsage {
    @inline
    def apply(
        Name: js.UndefOr[ExtendedKeyUsageName] = js.undefined,
        OID: js.UndefOr[String] = js.undefined
    ): ExtendedKeyUsage = {
      val __obj = js.Dynamic.literal()
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      OID.foreach(__v => __obj.updateDynamic("OID")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ExtendedKeyUsage]
    }
  }

  @js.native
  sealed trait ExtendedKeyUsageName extends js.Any
  object ExtendedKeyUsageName extends js.Object {
    val TLS_WEB_SERVER_AUTHENTICATION = "TLS_WEB_SERVER_AUTHENTICATION".asInstanceOf[ExtendedKeyUsageName]
    val TLS_WEB_CLIENT_AUTHENTICATION = "TLS_WEB_CLIENT_AUTHENTICATION".asInstanceOf[ExtendedKeyUsageName]
    val CODE_SIGNING = "CODE_SIGNING".asInstanceOf[ExtendedKeyUsageName]
    val EMAIL_PROTECTION = "EMAIL_PROTECTION".asInstanceOf[ExtendedKeyUsageName]
    val TIME_STAMPING = "TIME_STAMPING".asInstanceOf[ExtendedKeyUsageName]
    val OCSP_SIGNING = "OCSP_SIGNING".asInstanceOf[ExtendedKeyUsageName]
    val IPSEC_END_SYSTEM = "IPSEC_END_SYSTEM".asInstanceOf[ExtendedKeyUsageName]
    val IPSEC_TUNNEL = "IPSEC_TUNNEL".asInstanceOf[ExtendedKeyUsageName]
    val IPSEC_USER = "IPSEC_USER".asInstanceOf[ExtendedKeyUsageName]
    val ANY = "ANY".asInstanceOf[ExtendedKeyUsageName]
    val NONE = "NONE".asInstanceOf[ExtendedKeyUsageName]
    val CUSTOM = "CUSTOM".asInstanceOf[ExtendedKeyUsageName]

    val values = js.Object.freeze(js.Array(
      TLS_WEB_SERVER_AUTHENTICATION,
      TLS_WEB_CLIENT_AUTHENTICATION,
      CODE_SIGNING,
      EMAIL_PROTECTION,
      TIME_STAMPING,
      OCSP_SIGNING,
      IPSEC_END_SYSTEM,
      IPSEC_TUNNEL,
      IPSEC_USER,
      ANY,
      NONE,
      CUSTOM
    ))
  }

  @js.native
  sealed trait FailureReason extends js.Any
  object FailureReason extends js.Object {
    val NO_AVAILABLE_CONTACTS = "NO_AVAILABLE_CONTACTS".asInstanceOf[FailureReason]
    val ADDITIONAL_VERIFICATION_REQUIRED = "ADDITIONAL_VERIFICATION_REQUIRED".asInstanceOf[FailureReason]
    val DOMAIN_NOT_ALLOWED = "DOMAIN_NOT_ALLOWED".asInstanceOf[FailureReason]
    val INVALID_PUBLIC_DOMAIN = "INVALID_PUBLIC_DOMAIN".asInstanceOf[FailureReason]
    val DOMAIN_VALIDATION_DENIED = "DOMAIN_VALIDATION_DENIED".asInstanceOf[FailureReason]
    val CAA_ERROR = "CAA_ERROR".asInstanceOf[FailureReason]
    val PCA_LIMIT_EXCEEDED = "PCA_LIMIT_EXCEEDED".asInstanceOf[FailureReason]
    val PCA_INVALID_ARN = "PCA_INVALID_ARN".asInstanceOf[FailureReason]
    val PCA_INVALID_STATE = "PCA_INVALID_STATE".asInstanceOf[FailureReason]
    val PCA_REQUEST_FAILED = "PCA_REQUEST_FAILED".asInstanceOf[FailureReason]
    val PCA_NAME_CONSTRAINTS_VALIDATION = "PCA_NAME_CONSTRAINTS_VALIDATION".asInstanceOf[FailureReason]
    val PCA_RESOURCE_NOT_FOUND = "PCA_RESOURCE_NOT_FOUND".asInstanceOf[FailureReason]
    val PCA_INVALID_ARGS = "PCA_INVALID_ARGS".asInstanceOf[FailureReason]
    val PCA_INVALID_DURATION = "PCA_INVALID_DURATION".asInstanceOf[FailureReason]
    val PCA_ACCESS_DENIED = "PCA_ACCESS_DENIED".asInstanceOf[FailureReason]
    val OTHER = "OTHER".asInstanceOf[FailureReason]

    val values = js.Object.freeze(js.Array(
      NO_AVAILABLE_CONTACTS,
      ADDITIONAL_VERIFICATION_REQUIRED,
      DOMAIN_NOT_ALLOWED,
      INVALID_PUBLIC_DOMAIN,
      DOMAIN_VALIDATION_DENIED,
      CAA_ERROR,
      PCA_LIMIT_EXCEEDED,
      PCA_INVALID_ARN,
      PCA_INVALID_STATE,
      PCA_REQUEST_FAILED,
      PCA_NAME_CONSTRAINTS_VALIDATION,
      PCA_RESOURCE_NOT_FOUND,
      PCA_INVALID_ARGS,
      PCA_INVALID_DURATION,
      PCA_ACCESS_DENIED,
      OTHER
    ))
  }

  /**
    * This structure can be used in the <a>ListCertificates</a> action to filter the output of the certificate list.
    */
  @js.native
  trait Filters extends js.Object {
    var extendedKeyUsage: js.UndefOr[ExtendedKeyUsageFilterList]
    var keyTypes: js.UndefOr[KeyAlgorithmList]
    var keyUsage: js.UndefOr[KeyUsageFilterList]
  }

  object Filters {
    @inline
    def apply(
        extendedKeyUsage: js.UndefOr[ExtendedKeyUsageFilterList] = js.undefined,
        keyTypes: js.UndefOr[KeyAlgorithmList] = js.undefined,
        keyUsage: js.UndefOr[KeyUsageFilterList] = js.undefined
    ): Filters = {
      val __obj = js.Dynamic.literal()
      extendedKeyUsage.foreach(__v => __obj.updateDynamic("extendedKeyUsage")(__v.asInstanceOf[js.Any]))
      keyTypes.foreach(__v => __obj.updateDynamic("keyTypes")(__v.asInstanceOf[js.Any]))
      keyUsage.foreach(__v => __obj.updateDynamic("keyUsage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Filters]
    }
  }

  @js.native
  trait GetCertificateRequest extends js.Object {
    var CertificateArn: Arn
  }

  object GetCertificateRequest {
    @inline
    def apply(
        CertificateArn: Arn
    ): GetCertificateRequest = {
      val __obj = js.Dynamic.literal(
        "CertificateArn" -> CertificateArn.asInstanceOf[js.Any]
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
  trait ImportCertificateRequest extends js.Object {
    var Certificate: CertificateBodyBlob
    var PrivateKey: PrivateKeyBlob
    var CertificateArn: js.UndefOr[Arn]
    var CertificateChain: js.UndefOr[CertificateChainBlob]
    var Tags: js.UndefOr[TagList]
  }

  object ImportCertificateRequest {
    @inline
    def apply(
        Certificate: CertificateBodyBlob,
        PrivateKey: PrivateKeyBlob,
        CertificateArn: js.UndefOr[Arn] = js.undefined,
        CertificateChain: js.UndefOr[CertificateChainBlob] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): ImportCertificateRequest = {
      val __obj = js.Dynamic.literal(
        "Certificate" -> Certificate.asInstanceOf[js.Any],
        "PrivateKey" -> PrivateKey.asInstanceOf[js.Any]
      )

      CertificateArn.foreach(__v => __obj.updateDynamic("CertificateArn")(__v.asInstanceOf[js.Any]))
      CertificateChain.foreach(__v => __obj.updateDynamic("CertificateChain")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ImportCertificateRequest]
    }
  }

  @js.native
  trait ImportCertificateResponse extends js.Object {
    var CertificateArn: js.UndefOr[Arn]
  }

  object ImportCertificateResponse {
    @inline
    def apply(
        CertificateArn: js.UndefOr[Arn] = js.undefined
    ): ImportCertificateResponse = {
      val __obj = js.Dynamic.literal()
      CertificateArn.foreach(__v => __obj.updateDynamic("CertificateArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ImportCertificateResponse]
    }
  }

  @js.native
  sealed trait KeyAlgorithm extends js.Any
  object KeyAlgorithm extends js.Object {
    val RSA_2048 = "RSA_2048".asInstanceOf[KeyAlgorithm]
    val RSA_1024 = "RSA_1024".asInstanceOf[KeyAlgorithm]
    val RSA_4096 = "RSA_4096".asInstanceOf[KeyAlgorithm]
    val EC_prime256v1 = "EC_prime256v1".asInstanceOf[KeyAlgorithm]
    val EC_secp384r1 = "EC_secp384r1".asInstanceOf[KeyAlgorithm]
    val EC_secp521r1 = "EC_secp521r1".asInstanceOf[KeyAlgorithm]

    val values = js.Object.freeze(js.Array(RSA_2048, RSA_1024, RSA_4096, EC_prime256v1, EC_secp384r1, EC_secp521r1))
  }

  /**
    * The Key Usage X.509 v3 extension defines the purpose of the public key contained in the certificate.
    */
  @js.native
  trait KeyUsage extends js.Object {
    var Name: js.UndefOr[KeyUsageName]
  }

  object KeyUsage {
    @inline
    def apply(
        Name: js.UndefOr[KeyUsageName] = js.undefined
    ): KeyUsage = {
      val __obj = js.Dynamic.literal()
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[KeyUsage]
    }
  }

  @js.native
  sealed trait KeyUsageName extends js.Any
  object KeyUsageName extends js.Object {
    val DIGITAL_SIGNATURE = "DIGITAL_SIGNATURE".asInstanceOf[KeyUsageName]
    val NON_REPUDIATION = "NON_REPUDIATION".asInstanceOf[KeyUsageName]
    val KEY_ENCIPHERMENT = "KEY_ENCIPHERMENT".asInstanceOf[KeyUsageName]
    val DATA_ENCIPHERMENT = "DATA_ENCIPHERMENT".asInstanceOf[KeyUsageName]
    val KEY_AGREEMENT = "KEY_AGREEMENT".asInstanceOf[KeyUsageName]
    val CERTIFICATE_SIGNING = "CERTIFICATE_SIGNING".asInstanceOf[KeyUsageName]
    val CRL_SIGNING = "CRL_SIGNING".asInstanceOf[KeyUsageName]
    val ENCIPHER_ONLY = "ENCIPHER_ONLY".asInstanceOf[KeyUsageName]
    val DECIPHER_ONLY = "DECIPHER_ONLY".asInstanceOf[KeyUsageName]
    val ANY = "ANY".asInstanceOf[KeyUsageName]
    val CUSTOM = "CUSTOM".asInstanceOf[KeyUsageName]

    val values = js.Object.freeze(js.Array(
      DIGITAL_SIGNATURE,
      NON_REPUDIATION,
      KEY_ENCIPHERMENT,
      DATA_ENCIPHERMENT,
      KEY_AGREEMENT,
      CERTIFICATE_SIGNING,
      CRL_SIGNING,
      ENCIPHER_ONLY,
      DECIPHER_ONLY,
      ANY,
      CUSTOM
    ))
  }

  @js.native
  trait ListCertificatesRequest extends js.Object {
    var CertificateStatuses: js.UndefOr[CertificateStatuses]
    var Includes: js.UndefOr[Filters]
    var MaxItems: js.UndefOr[MaxItems]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListCertificatesRequest {
    @inline
    def apply(
        CertificateStatuses: js.UndefOr[CertificateStatuses] = js.undefined,
        Includes: js.UndefOr[Filters] = js.undefined,
        MaxItems: js.UndefOr[MaxItems] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListCertificatesRequest = {
      val __obj = js.Dynamic.literal()
      CertificateStatuses.foreach(__v => __obj.updateDynamic("CertificateStatuses")(__v.asInstanceOf[js.Any]))
      Includes.foreach(__v => __obj.updateDynamic("Includes")(__v.asInstanceOf[js.Any]))
      MaxItems.foreach(__v => __obj.updateDynamic("MaxItems")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListCertificatesRequest]
    }
  }

  @js.native
  trait ListCertificatesResponse extends js.Object {
    var CertificateSummaryList: js.UndefOr[CertificateSummaryList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListCertificatesResponse {
    @inline
    def apply(
        CertificateSummaryList: js.UndefOr[CertificateSummaryList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListCertificatesResponse = {
      val __obj = js.Dynamic.literal()
      CertificateSummaryList.foreach(__v => __obj.updateDynamic("CertificateSummaryList")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListCertificatesResponse]
    }
  }

  @js.native
  trait ListTagsForCertificateRequest extends js.Object {
    var CertificateArn: Arn
  }

  object ListTagsForCertificateRequest {
    @inline
    def apply(
        CertificateArn: Arn
    ): ListTagsForCertificateRequest = {
      val __obj = js.Dynamic.literal(
        "CertificateArn" -> CertificateArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ListTagsForCertificateRequest]
    }
  }

  @js.native
  trait ListTagsForCertificateResponse extends js.Object {
    var Tags: js.UndefOr[TagList]
  }

  object ListTagsForCertificateResponse {
    @inline
    def apply(
        Tags: js.UndefOr[TagList] = js.undefined
    ): ListTagsForCertificateResponse = {
      val __obj = js.Dynamic.literal()
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForCertificateResponse]
    }
  }

  @js.native
  sealed trait RecordType extends js.Any
  object RecordType extends js.Object {
    val CNAME = "CNAME".asInstanceOf[RecordType]

    val values = js.Object.freeze(js.Array(CNAME))
  }

  @js.native
  trait RemoveTagsFromCertificateRequest extends js.Object {
    var CertificateArn: Arn
    var Tags: TagList
  }

  object RemoveTagsFromCertificateRequest {
    @inline
    def apply(
        CertificateArn: Arn,
        Tags: TagList
    ): RemoveTagsFromCertificateRequest = {
      val __obj = js.Dynamic.literal(
        "CertificateArn" -> CertificateArn.asInstanceOf[js.Any],
        "Tags" -> Tags.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[RemoveTagsFromCertificateRequest]
    }
  }

  @js.native
  trait RenewCertificateRequest extends js.Object {
    var CertificateArn: Arn
  }

  object RenewCertificateRequest {
    @inline
    def apply(
        CertificateArn: Arn
    ): RenewCertificateRequest = {
      val __obj = js.Dynamic.literal(
        "CertificateArn" -> CertificateArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[RenewCertificateRequest]
    }
  }

  @js.native
  sealed trait RenewalEligibility extends js.Any
  object RenewalEligibility extends js.Object {
    val ELIGIBLE = "ELIGIBLE".asInstanceOf[RenewalEligibility]
    val INELIGIBLE = "INELIGIBLE".asInstanceOf[RenewalEligibility]

    val values = js.Object.freeze(js.Array(ELIGIBLE, INELIGIBLE))
  }

  @js.native
  sealed trait RenewalStatus extends js.Any
  object RenewalStatus extends js.Object {
    val PENDING_AUTO_RENEWAL = "PENDING_AUTO_RENEWAL".asInstanceOf[RenewalStatus]
    val PENDING_VALIDATION = "PENDING_VALIDATION".asInstanceOf[RenewalStatus]
    val SUCCESS = "SUCCESS".asInstanceOf[RenewalStatus]
    val FAILED = "FAILED".asInstanceOf[RenewalStatus]

    val values = js.Object.freeze(js.Array(PENDING_AUTO_RENEWAL, PENDING_VALIDATION, SUCCESS, FAILED))
  }

  /**
    * Contains information about the status of ACM's [[https://docs.aws.amazon.com/acm/latest/userguide/acm-renewal.html|managed renewal]] for the certificate. This structure exists only when the certificate type is <code>AMAZON_ISSUED</code>.
    */
  @js.native
  trait RenewalSummary extends js.Object {
    var DomainValidationOptions: DomainValidationList
    var RenewalStatus: RenewalStatus
    var UpdatedAt: TStamp
    var RenewalStatusReason: js.UndefOr[FailureReason]
  }

  object RenewalSummary {
    @inline
    def apply(
        DomainValidationOptions: DomainValidationList,
        RenewalStatus: RenewalStatus,
        UpdatedAt: TStamp,
        RenewalStatusReason: js.UndefOr[FailureReason] = js.undefined
    ): RenewalSummary = {
      val __obj = js.Dynamic.literal(
        "DomainValidationOptions" -> DomainValidationOptions.asInstanceOf[js.Any],
        "RenewalStatus" -> RenewalStatus.asInstanceOf[js.Any],
        "UpdatedAt" -> UpdatedAt.asInstanceOf[js.Any]
      )

      RenewalStatusReason.foreach(__v => __obj.updateDynamic("RenewalStatusReason")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RenewalSummary]
    }
  }

  @js.native
  trait RequestCertificateRequest extends js.Object {
    var DomainName: DomainNameString
    var CertificateAuthorityArn: js.UndefOr[Arn]
    var DomainValidationOptions: js.UndefOr[DomainValidationOptionList]
    var IdempotencyToken: js.UndefOr[IdempotencyToken]
    var Options: js.UndefOr[CertificateOptions]
    var SubjectAlternativeNames: js.UndefOr[DomainList]
    var Tags: js.UndefOr[TagList]
    var ValidationMethod: js.UndefOr[ValidationMethod]
  }

  object RequestCertificateRequest {
    @inline
    def apply(
        DomainName: DomainNameString,
        CertificateAuthorityArn: js.UndefOr[Arn] = js.undefined,
        DomainValidationOptions: js.UndefOr[DomainValidationOptionList] = js.undefined,
        IdempotencyToken: js.UndefOr[IdempotencyToken] = js.undefined,
        Options: js.UndefOr[CertificateOptions] = js.undefined,
        SubjectAlternativeNames: js.UndefOr[DomainList] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined,
        ValidationMethod: js.UndefOr[ValidationMethod] = js.undefined
    ): RequestCertificateRequest = {
      val __obj = js.Dynamic.literal(
        "DomainName" -> DomainName.asInstanceOf[js.Any]
      )

      CertificateAuthorityArn.foreach(__v => __obj.updateDynamic("CertificateAuthorityArn")(__v.asInstanceOf[js.Any]))
      DomainValidationOptions.foreach(__v => __obj.updateDynamic("DomainValidationOptions")(__v.asInstanceOf[js.Any]))
      IdempotencyToken.foreach(__v => __obj.updateDynamic("IdempotencyToken")(__v.asInstanceOf[js.Any]))
      Options.foreach(__v => __obj.updateDynamic("Options")(__v.asInstanceOf[js.Any]))
      SubjectAlternativeNames.foreach(__v => __obj.updateDynamic("SubjectAlternativeNames")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      ValidationMethod.foreach(__v => __obj.updateDynamic("ValidationMethod")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RequestCertificateRequest]
    }
  }

  @js.native
  trait RequestCertificateResponse extends js.Object {
    var CertificateArn: js.UndefOr[Arn]
  }

  object RequestCertificateResponse {
    @inline
    def apply(
        CertificateArn: js.UndefOr[Arn] = js.undefined
    ): RequestCertificateResponse = {
      val __obj = js.Dynamic.literal()
      CertificateArn.foreach(__v => __obj.updateDynamic("CertificateArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RequestCertificateResponse]
    }
  }

  @js.native
  trait ResendValidationEmailRequest extends js.Object {
    var CertificateArn: Arn
    var Domain: DomainNameString
    var ValidationDomain: DomainNameString
  }

  object ResendValidationEmailRequest {
    @inline
    def apply(
        CertificateArn: Arn,
        Domain: DomainNameString,
        ValidationDomain: DomainNameString
    ): ResendValidationEmailRequest = {
      val __obj = js.Dynamic.literal(
        "CertificateArn" -> CertificateArn.asInstanceOf[js.Any],
        "Domain" -> Domain.asInstanceOf[js.Any],
        "ValidationDomain" -> ValidationDomain.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ResendValidationEmailRequest]
    }
  }

  /**
    * Contains a DNS record value that you can use to can use to validate ownership or control of a domain. This is used by the <a>DescribeCertificate</a> action.
    */
  @js.native
  trait ResourceRecord extends js.Object {
    var Name: String
    var Type: RecordType
    var Value: String
  }

  object ResourceRecord {
    @inline
    def apply(
        Name: String,
        Type: RecordType,
        Value: String
    ): ResourceRecord = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "Type" -> Type.asInstanceOf[js.Any],
        "Value" -> Value.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ResourceRecord]
    }
  }

  @js.native
  sealed trait RevocationReason extends js.Any
  object RevocationReason extends js.Object {
    val UNSPECIFIED = "UNSPECIFIED".asInstanceOf[RevocationReason]
    val KEY_COMPROMISE = "KEY_COMPROMISE".asInstanceOf[RevocationReason]
    val CA_COMPROMISE = "CA_COMPROMISE".asInstanceOf[RevocationReason]
    val AFFILIATION_CHANGED = "AFFILIATION_CHANGED".asInstanceOf[RevocationReason]
    val SUPERCEDED = "SUPERCEDED".asInstanceOf[RevocationReason]
    val CESSATION_OF_OPERATION = "CESSATION_OF_OPERATION".asInstanceOf[RevocationReason]
    val CERTIFICATE_HOLD = "CERTIFICATE_HOLD".asInstanceOf[RevocationReason]
    val REMOVE_FROM_CRL = "REMOVE_FROM_CRL".asInstanceOf[RevocationReason]
    val PRIVILEGE_WITHDRAWN = "PRIVILEGE_WITHDRAWN".asInstanceOf[RevocationReason]
    val A_A_COMPROMISE = "A_A_COMPROMISE".asInstanceOf[RevocationReason]

    val values = js.Object.freeze(js.Array(
      UNSPECIFIED,
      KEY_COMPROMISE,
      CA_COMPROMISE,
      AFFILIATION_CHANGED,
      SUPERCEDED,
      CESSATION_OF_OPERATION,
      CERTIFICATE_HOLD,
      REMOVE_FROM_CRL,
      PRIVILEGE_WITHDRAWN,
      A_A_COMPROMISE
    ))
  }

  /**
    * A key-value pair that identifies or specifies metadata about an ACM resource.
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
  trait UpdateCertificateOptionsRequest extends js.Object {
    var CertificateArn: Arn
    var Options: CertificateOptions
  }

  object UpdateCertificateOptionsRequest {
    @inline
    def apply(
        CertificateArn: Arn,
        Options: CertificateOptions
    ): UpdateCertificateOptionsRequest = {
      val __obj = js.Dynamic.literal(
        "CertificateArn" -> CertificateArn.asInstanceOf[js.Any],
        "Options" -> Options.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UpdateCertificateOptionsRequest]
    }
  }

  @js.native
  sealed trait ValidationMethod extends js.Any
  object ValidationMethod extends js.Object {
    val EMAIL = "EMAIL".asInstanceOf[ValidationMethod]
    val DNS = "DNS".asInstanceOf[ValidationMethod]

    val values = js.Object.freeze(js.Array(EMAIL, DNS))
  }
}
