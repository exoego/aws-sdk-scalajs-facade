package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import io.scalajs.nodejs
import facade.amazonaws._

package object acm {
  type Arn = String
  type CertificateBody = String
  type CertificateBodyBlob = nodejs.buffer.Buffer | nodejs.stream.Readable | js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type CertificateChain = String
  type CertificateChainBlob = nodejs.buffer.Buffer | nodejs.stream.Readable | js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type CertificateStatus = String
  type CertificateStatuses = js.Array[CertificateStatus]
  type CertificateSummaryList = js.Array[CertificateSummary]
  type CertificateTransparencyLoggingPreference = String
  type CertificateType = String
  type DomainList = js.Array[DomainNameString]
  type DomainNameString = String
  type DomainStatus = String
  type DomainValidationList = js.Array[DomainValidation]
  type DomainValidationOptionList = js.Array[DomainValidationOption]
  type ExtendedKeyUsageFilterList = js.Array[ExtendedKeyUsageName]
  type ExtendedKeyUsageList = js.Array[ExtendedKeyUsage]
  type ExtendedKeyUsageName = String
  type FailureReason = String
  type IdempotencyToken = String
  type InUseList = js.Array[String]
  type KeyAlgorithm = String
  type KeyAlgorithmList = js.Array[KeyAlgorithm]
  type KeyUsageFilterList = js.Array[KeyUsageName]
  type KeyUsageList = js.Array[KeyUsage]
  type KeyUsageName = String
  type MaxItems = Int
  type NextToken = String
  type PassphraseBlob = nodejs.buffer.Buffer | nodejs.stream.Readable | js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type PrivateKey = String
  type PrivateKeyBlob = nodejs.buffer.Buffer | nodejs.stream.Readable | js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type RecordType = String
  type RenewalEligibility = String
  type RenewalStatus = String
  type RevocationReason = String
  type TStamp = js.Date
  type TagKey = String
  type TagList = js.Array[Tag]
  type TagValue = String
  type ValidationEmailList = js.Array[String]
  type ValidationMethod = String
}

package acm {
  @js.native
  @JSImport("aws-sdk", "ACM")
  class ACM(config: AWSConfig) extends js.Object {
    def addTagsToCertificate(params: AddTagsToCertificateRequest): Request[js.Object] = js.native
    def deleteCertificate(params: DeleteCertificateRequest): Request[js.Object] = js.native
    def describeCertificate(params: DescribeCertificateRequest): Request[DescribeCertificateResponse] = js.native
    def exportCertificate(params: ExportCertificateRequest): Request[ExportCertificateResponse] = js.native
    def getCertificate(params: GetCertificateRequest): Request[GetCertificateResponse] = js.native
    def importCertificate(params: ImportCertificateRequest): Request[ImportCertificateResponse] = js.native
    def listCertificates(params: ListCertificatesRequest): Request[ListCertificatesResponse] = js.native
    def listTagsForCertificate(params: ListTagsForCertificateRequest): Request[ListTagsForCertificateResponse] = js.native
    def removeTagsFromCertificate(params: RemoveTagsFromCertificateRequest): Request[js.Object] = js.native
    def requestCertificate(params: RequestCertificateRequest): Request[RequestCertificateResponse] = js.native
    def resendValidationEmail(params: ResendValidationEmailRequest): Request[js.Object] = js.native
    def updateCertificateOptions(params: UpdateCertificateOptionsRequest): Request[js.Object] = js.native
  }

  @js.native
  trait AddTagsToCertificateRequest extends js.Object {
    var CertificateArn: js.UndefOr[Arn]
    var Tags: js.UndefOr[TagList]
  }

  object AddTagsToCertificateRequest {
    def apply(
      CertificateArn: js.UndefOr[Arn] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined): AddTagsToCertificateRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CertificateArn" -> CertificateArn.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AddTagsToCertificateRequest]
    }
  }

  /**
   * <p>Contains metadata about an ACM certificate. This structure is returned in the response to a <a>DescribeCertificate</a> request. </p>
   */
  @js.native
  trait CertificateDetail extends js.Object {
    var ImportedAt: js.UndefOr[TStamp]
    var NotBefore: js.UndefOr[TStamp]
    var KeyAlgorithm: js.UndefOr[KeyAlgorithm]
    var Subject: js.UndefOr[String]
    var RevocationReason: js.UndefOr[RevocationReason]
    var SubjectAlternativeNames: js.UndefOr[DomainList]
    var InUseBy: js.UndefOr[InUseList]
    var DomainValidationOptions: js.UndefOr[DomainValidationList]
    var ExtendedKeyUsages: js.UndefOr[ExtendedKeyUsageList]
    var CertificateArn: js.UndefOr[Arn]
    var CertificateAuthorityArn: js.UndefOr[Arn]
    var DomainName: js.UndefOr[DomainNameString]
    var RevokedAt: js.UndefOr[TStamp]
    var SignatureAlgorithm: js.UndefOr[String]
    var NotAfter: js.UndefOr[TStamp]
    var FailureReason: js.UndefOr[FailureReason]
    var Issuer: js.UndefOr[String]
    var KeyUsages: js.UndefOr[KeyUsageList]
    var Options: js.UndefOr[CertificateOptions]
    var CreatedAt: js.UndefOr[TStamp]
    var RenewalEligibility: js.UndefOr[RenewalEligibility]
    var RenewalSummary: js.UndefOr[RenewalSummary]
    var Serial: js.UndefOr[String]
    var IssuedAt: js.UndefOr[TStamp]
    var Status: js.UndefOr[CertificateStatus]
    var Type: js.UndefOr[CertificateType]
  }

  object CertificateDetail {
    def apply(
      ImportedAt: js.UndefOr[TStamp] = js.undefined,
      NotBefore: js.UndefOr[TStamp] = js.undefined,
      KeyAlgorithm: js.UndefOr[KeyAlgorithm] = js.undefined,
      Subject: js.UndefOr[String] = js.undefined,
      RevocationReason: js.UndefOr[RevocationReason] = js.undefined,
      SubjectAlternativeNames: js.UndefOr[DomainList] = js.undefined,
      InUseBy: js.UndefOr[InUseList] = js.undefined,
      DomainValidationOptions: js.UndefOr[DomainValidationList] = js.undefined,
      ExtendedKeyUsages: js.UndefOr[ExtendedKeyUsageList] = js.undefined,
      CertificateArn: js.UndefOr[Arn] = js.undefined,
      CertificateAuthorityArn: js.UndefOr[Arn] = js.undefined,
      DomainName: js.UndefOr[DomainNameString] = js.undefined,
      RevokedAt: js.UndefOr[TStamp] = js.undefined,
      SignatureAlgorithm: js.UndefOr[String] = js.undefined,
      NotAfter: js.UndefOr[TStamp] = js.undefined,
      FailureReason: js.UndefOr[FailureReason] = js.undefined,
      Issuer: js.UndefOr[String] = js.undefined,
      KeyUsages: js.UndefOr[KeyUsageList] = js.undefined,
      Options: js.UndefOr[CertificateOptions] = js.undefined,
      CreatedAt: js.UndefOr[TStamp] = js.undefined,
      RenewalEligibility: js.UndefOr[RenewalEligibility] = js.undefined,
      RenewalSummary: js.UndefOr[RenewalSummary] = js.undefined,
      Serial: js.UndefOr[String] = js.undefined,
      IssuedAt: js.UndefOr[TStamp] = js.undefined,
      Status: js.UndefOr[CertificateStatus] = js.undefined,
      Type: js.UndefOr[CertificateType] = js.undefined): CertificateDetail = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ImportedAt" -> ImportedAt.map { x => x.asInstanceOf[js.Any] },
        "NotBefore" -> NotBefore.map { x => x.asInstanceOf[js.Any] },
        "KeyAlgorithm" -> KeyAlgorithm.map { x => x.asInstanceOf[js.Any] },
        "Subject" -> Subject.map { x => x.asInstanceOf[js.Any] },
        "RevocationReason" -> RevocationReason.map { x => x.asInstanceOf[js.Any] },
        "SubjectAlternativeNames" -> SubjectAlternativeNames.map { x => x.asInstanceOf[js.Any] },
        "InUseBy" -> InUseBy.map { x => x.asInstanceOf[js.Any] },
        "DomainValidationOptions" -> DomainValidationOptions.map { x => x.asInstanceOf[js.Any] },
        "ExtendedKeyUsages" -> ExtendedKeyUsages.map { x => x.asInstanceOf[js.Any] },
        "CertificateArn" -> CertificateArn.map { x => x.asInstanceOf[js.Any] },
        "CertificateAuthorityArn" -> CertificateAuthorityArn.map { x => x.asInstanceOf[js.Any] },
        "DomainName" -> DomainName.map { x => x.asInstanceOf[js.Any] },
        "RevokedAt" -> RevokedAt.map { x => x.asInstanceOf[js.Any] },
        "SignatureAlgorithm" -> SignatureAlgorithm.map { x => x.asInstanceOf[js.Any] },
        "NotAfter" -> NotAfter.map { x => x.asInstanceOf[js.Any] },
        "FailureReason" -> FailureReason.map { x => x.asInstanceOf[js.Any] },
        "Issuer" -> Issuer.map { x => x.asInstanceOf[js.Any] },
        "KeyUsages" -> KeyUsages.map { x => x.asInstanceOf[js.Any] },
        "Options" -> Options.map { x => x.asInstanceOf[js.Any] },
        "CreatedAt" -> CreatedAt.map { x => x.asInstanceOf[js.Any] },
        "RenewalEligibility" -> RenewalEligibility.map { x => x.asInstanceOf[js.Any] },
        "RenewalSummary" -> RenewalSummary.map { x => x.asInstanceOf[js.Any] },
        "Serial" -> Serial.map { x => x.asInstanceOf[js.Any] },
        "IssuedAt" -> IssuedAt.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] },
        "Type" -> Type.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CertificateDetail]
    }
  }

  /**
   * <p>Structure that contains options for your certificate. Currently, you can use this only to specify whether to opt in to or out of certificate transparency logging. Some browsers require that public certificates issued for your domain be recorded in a log. Certificates that are not logged typically generate a browser error. Transparency makes it possible for you to detect SSL/TLS certificates that have been mistakenly or maliciously issued for your domain. For general information, see <a href="http://docs.aws.amazon.com/acm/latest/userguide/acm-concepts.html#concept-transparency">Certificate Transparency Logging</a>. </p>
   */
  @js.native
  trait CertificateOptions extends js.Object {
    var CertificateTransparencyLoggingPreference: js.UndefOr[CertificateTransparencyLoggingPreference]
  }

  object CertificateOptions {
    def apply(
      CertificateTransparencyLoggingPreference: js.UndefOr[CertificateTransparencyLoggingPreference] = js.undefined): CertificateOptions = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CertificateTransparencyLoggingPreference" -> CertificateTransparencyLoggingPreference.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CertificateOptions]
    }
  }

  object CertificateStatusEnum {
    val PENDING_VALIDATION = "PENDING_VALIDATION"
    val ISSUED = "ISSUED"
    val INACTIVE = "INACTIVE"
    val EXPIRED = "EXPIRED"
    val VALIDATION_TIMED_OUT = "VALIDATION_TIMED_OUT"
    val REVOKED = "REVOKED"
    val FAILED = "FAILED"

    val values = IndexedSeq(PENDING_VALIDATION, ISSUED, INACTIVE, EXPIRED, VALIDATION_TIMED_OUT, REVOKED, FAILED)
  }

  /**
   * <p>This structure is returned in the response object of <a>ListCertificates</a> action. </p>
   */
  @js.native
  trait CertificateSummary extends js.Object {
    var CertificateArn: js.UndefOr[Arn]
    var DomainName: js.UndefOr[DomainNameString]
  }

  object CertificateSummary {
    def apply(
      CertificateArn: js.UndefOr[Arn] = js.undefined,
      DomainName: js.UndefOr[DomainNameString] = js.undefined): CertificateSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CertificateArn" -> CertificateArn.map { x => x.asInstanceOf[js.Any] },
        "DomainName" -> DomainName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CertificateSummary]
    }
  }

  object CertificateTransparencyLoggingPreferenceEnum {
    val ENABLED = "ENABLED"
    val DISABLED = "DISABLED"

    val values = IndexedSeq(ENABLED, DISABLED)
  }

  object CertificateTypeEnum {
    val IMPORTED = "IMPORTED"
    val AMAZON_ISSUED = "AMAZON_ISSUED"
    val PRIVATE = "PRIVATE"

    val values = IndexedSeq(IMPORTED, AMAZON_ISSUED, PRIVATE)
  }

  @js.native
  trait DeleteCertificateRequest extends js.Object {
    var CertificateArn: js.UndefOr[Arn]
  }

  object DeleteCertificateRequest {
    def apply(
      CertificateArn: js.UndefOr[Arn] = js.undefined): DeleteCertificateRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CertificateArn" -> CertificateArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteCertificateRequest]
    }
  }

  @js.native
  trait DescribeCertificateRequest extends js.Object {
    var CertificateArn: js.UndefOr[Arn]
  }

  object DescribeCertificateRequest {
    def apply(
      CertificateArn: js.UndefOr[Arn] = js.undefined): DescribeCertificateRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CertificateArn" -> CertificateArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeCertificateRequest]
    }
  }

  @js.native
  trait DescribeCertificateResponse extends js.Object {
    var Certificate: js.UndefOr[CertificateDetail]
  }

  object DescribeCertificateResponse {
    def apply(
      Certificate: js.UndefOr[CertificateDetail] = js.undefined): DescribeCertificateResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Certificate" -> Certificate.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeCertificateResponse]
    }
  }

  object DomainStatusEnum {
    val PENDING_VALIDATION = "PENDING_VALIDATION"
    val SUCCESS = "SUCCESS"
    val FAILED = "FAILED"

    val values = IndexedSeq(PENDING_VALIDATION, SUCCESS, FAILED)
  }

  /**
   * <p>Contains information about the validation of each domain name in the certificate.</p>
   */
  @js.native
  trait DomainValidation extends js.Object {
    var ValidationEmails: js.UndefOr[ValidationEmailList]
    var ResourceRecord: js.UndefOr[ResourceRecord]
    var ValidationDomain: js.UndefOr[DomainNameString]
    var DomainName: js.UndefOr[DomainNameString]
    var ValidationStatus: js.UndefOr[DomainStatus]
    var ValidationMethod: js.UndefOr[ValidationMethod]
  }

  object DomainValidation {
    def apply(
      ValidationEmails: js.UndefOr[ValidationEmailList] = js.undefined,
      ResourceRecord: js.UndefOr[ResourceRecord] = js.undefined,
      ValidationDomain: js.UndefOr[DomainNameString] = js.undefined,
      DomainName: js.UndefOr[DomainNameString] = js.undefined,
      ValidationStatus: js.UndefOr[DomainStatus] = js.undefined,
      ValidationMethod: js.UndefOr[ValidationMethod] = js.undefined): DomainValidation = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ValidationEmails" -> ValidationEmails.map { x => x.asInstanceOf[js.Any] },
        "ResourceRecord" -> ResourceRecord.map { x => x.asInstanceOf[js.Any] },
        "ValidationDomain" -> ValidationDomain.map { x => x.asInstanceOf[js.Any] },
        "DomainName" -> DomainName.map { x => x.asInstanceOf[js.Any] },
        "ValidationStatus" -> ValidationStatus.map { x => x.asInstanceOf[js.Any] },
        "ValidationMethod" -> ValidationMethod.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DomainValidation]
    }
  }

  /**
   * <p>Contains information about the domain names that you want ACM to use to send you emails that enable you to validate domain ownership.</p>
   */
  @js.native
  trait DomainValidationOption extends js.Object {
    var DomainName: js.UndefOr[DomainNameString]
    var ValidationDomain: js.UndefOr[DomainNameString]
  }

  object DomainValidationOption {
    def apply(
      DomainName: js.UndefOr[DomainNameString] = js.undefined,
      ValidationDomain: js.UndefOr[DomainNameString] = js.undefined): DomainValidationOption = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DomainName" -> DomainName.map { x => x.asInstanceOf[js.Any] },
        "ValidationDomain" -> ValidationDomain.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DomainValidationOption]
    }
  }

  @js.native
  trait ExportCertificateRequest extends js.Object {
    var CertificateArn: js.UndefOr[Arn]
    var Passphrase: js.UndefOr[PassphraseBlob]
  }

  object ExportCertificateRequest {
    def apply(
      CertificateArn: js.UndefOr[Arn] = js.undefined,
      Passphrase: js.UndefOr[PassphraseBlob] = js.undefined): ExportCertificateRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CertificateArn" -> CertificateArn.map { x => x.asInstanceOf[js.Any] },
        "Passphrase" -> Passphrase.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ExportCertificateRequest]
    }
  }

  @js.native
  trait ExportCertificateResponse extends js.Object {
    var Certificate: js.UndefOr[CertificateBody]
    var CertificateChain: js.UndefOr[CertificateChain]
    var PrivateKey: js.UndefOr[PrivateKey]
  }

  object ExportCertificateResponse {
    def apply(
      Certificate: js.UndefOr[CertificateBody] = js.undefined,
      CertificateChain: js.UndefOr[CertificateChain] = js.undefined,
      PrivateKey: js.UndefOr[PrivateKey] = js.undefined): ExportCertificateResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Certificate" -> Certificate.map { x => x.asInstanceOf[js.Any] },
        "CertificateChain" -> CertificateChain.map { x => x.asInstanceOf[js.Any] },
        "PrivateKey" -> PrivateKey.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ExportCertificateResponse]
    }
  }

  /**
   * <p>The Extended Key Usage X.509 v3 extension defines one or more purposes for which the public key can be used. This is in addition to or in place of the basic purposes specified by the Key Usage extension. </p>
   */
  @js.native
  trait ExtendedKeyUsage extends js.Object {
    var Name: js.UndefOr[ExtendedKeyUsageName]
    var OID: js.UndefOr[String]
  }

  object ExtendedKeyUsage {
    def apply(
      Name: js.UndefOr[ExtendedKeyUsageName] = js.undefined,
      OID: js.UndefOr[String] = js.undefined): ExtendedKeyUsage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "OID" -> OID.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ExtendedKeyUsage]
    }
  }

  object ExtendedKeyUsageNameEnum {
    val TLS_WEB_SERVER_AUTHENTICATION = "TLS_WEB_SERVER_AUTHENTICATION"
    val TLS_WEB_CLIENT_AUTHENTICATION = "TLS_WEB_CLIENT_AUTHENTICATION"
    val CODE_SIGNING = "CODE_SIGNING"
    val EMAIL_PROTECTION = "EMAIL_PROTECTION"
    val TIME_STAMPING = "TIME_STAMPING"
    val OCSP_SIGNING = "OCSP_SIGNING"
    val IPSEC_END_SYSTEM = "IPSEC_END_SYSTEM"
    val IPSEC_TUNNEL = "IPSEC_TUNNEL"
    val IPSEC_USER = "IPSEC_USER"
    val ANY = "ANY"
    val NONE = "NONE"
    val CUSTOM = "CUSTOM"

    val values = IndexedSeq(TLS_WEB_SERVER_AUTHENTICATION, TLS_WEB_CLIENT_AUTHENTICATION, CODE_SIGNING, EMAIL_PROTECTION, TIME_STAMPING, OCSP_SIGNING, IPSEC_END_SYSTEM, IPSEC_TUNNEL, IPSEC_USER, ANY, NONE, CUSTOM)
  }

  object FailureReasonEnum {
    val NO_AVAILABLE_CONTACTS = "NO_AVAILABLE_CONTACTS"
    val ADDITIONAL_VERIFICATION_REQUIRED = "ADDITIONAL_VERIFICATION_REQUIRED"
    val DOMAIN_NOT_ALLOWED = "DOMAIN_NOT_ALLOWED"
    val INVALID_PUBLIC_DOMAIN = "INVALID_PUBLIC_DOMAIN"
    val CAA_ERROR = "CAA_ERROR"
    val PCA_LIMIT_EXCEEDED = "PCA_LIMIT_EXCEEDED"
    val PCA_INVALID_ARN = "PCA_INVALID_ARN"
    val PCA_INVALID_STATE = "PCA_INVALID_STATE"
    val PCA_REQUEST_FAILED = "PCA_REQUEST_FAILED"
    val PCA_RESOURCE_NOT_FOUND = "PCA_RESOURCE_NOT_FOUND"
    val PCA_INVALID_ARGS = "PCA_INVALID_ARGS"
    val OTHER = "OTHER"

    val values = IndexedSeq(NO_AVAILABLE_CONTACTS, ADDITIONAL_VERIFICATION_REQUIRED, DOMAIN_NOT_ALLOWED, INVALID_PUBLIC_DOMAIN, CAA_ERROR, PCA_LIMIT_EXCEEDED, PCA_INVALID_ARN, PCA_INVALID_STATE, PCA_REQUEST_FAILED, PCA_RESOURCE_NOT_FOUND, PCA_INVALID_ARGS, OTHER)
  }

  /**
   * <p>This structure can be used in the <a>ListCertificates</a> action to filter the output of the certificate list. </p>
   */
  @js.native
  trait Filters extends js.Object {
    var extendedKeyUsage: js.UndefOr[ExtendedKeyUsageFilterList]
    var keyUsage: js.UndefOr[KeyUsageFilterList]
    var keyTypes: js.UndefOr[KeyAlgorithmList]
  }

  object Filters {
    def apply(
      extendedKeyUsage: js.UndefOr[ExtendedKeyUsageFilterList] = js.undefined,
      keyUsage: js.UndefOr[KeyUsageFilterList] = js.undefined,
      keyTypes: js.UndefOr[KeyAlgorithmList] = js.undefined): Filters = {
      val _fields = IndexedSeq[(String, js.Any)](
        "extendedKeyUsage" -> extendedKeyUsage.map { x => x.asInstanceOf[js.Any] },
        "keyUsage" -> keyUsage.map { x => x.asInstanceOf[js.Any] },
        "keyTypes" -> keyTypes.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Filters]
    }
  }

  @js.native
  trait GetCertificateRequest extends js.Object {
    var CertificateArn: js.UndefOr[Arn]
  }

  object GetCertificateRequest {
    def apply(
      CertificateArn: js.UndefOr[Arn] = js.undefined): GetCertificateRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CertificateArn" -> CertificateArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetCertificateRequest]
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
      CertificateChain: js.UndefOr[CertificateChain] = js.undefined): GetCertificateResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Certificate" -> Certificate.map { x => x.asInstanceOf[js.Any] },
        "CertificateChain" -> CertificateChain.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetCertificateResponse]
    }
  }

  @js.native
  trait ImportCertificateRequest extends js.Object {
    var CertificateArn: js.UndefOr[Arn]
    var Certificate: js.UndefOr[CertificateBodyBlob]
    var PrivateKey: js.UndefOr[PrivateKeyBlob]
    var CertificateChain: js.UndefOr[CertificateChainBlob]
  }

  object ImportCertificateRequest {
    def apply(
      CertificateArn: js.UndefOr[Arn] = js.undefined,
      Certificate: js.UndefOr[CertificateBodyBlob] = js.undefined,
      PrivateKey: js.UndefOr[PrivateKeyBlob] = js.undefined,
      CertificateChain: js.UndefOr[CertificateChainBlob] = js.undefined): ImportCertificateRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CertificateArn" -> CertificateArn.map { x => x.asInstanceOf[js.Any] },
        "Certificate" -> Certificate.map { x => x.asInstanceOf[js.Any] },
        "PrivateKey" -> PrivateKey.map { x => x.asInstanceOf[js.Any] },
        "CertificateChain" -> CertificateChain.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ImportCertificateRequest]
    }
  }

  @js.native
  trait ImportCertificateResponse extends js.Object {
    var CertificateArn: js.UndefOr[Arn]
  }

  object ImportCertificateResponse {
    def apply(
      CertificateArn: js.UndefOr[Arn] = js.undefined): ImportCertificateResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CertificateArn" -> CertificateArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ImportCertificateResponse]
    }
  }

  /**
   * <p>The requested Amazon Resource Name (ARN) does not refer to an existing resource.</p>
   */
  @js.native
  trait InvalidArnExceptionException extends js.Object {
    val message: String
  }

  /**
   * <p>One or more values in the <a>DomainValidationOption</a> structure is incorrect.</p>
   */
  @js.native
  trait InvalidDomainValidationOptionsExceptionException extends js.Object {
    val message: String
  }

  /**
   * <p>Processing has reached an invalid state.</p>
   */
  @js.native
  trait InvalidStateExceptionException extends js.Object {
    val message: String
  }

  /**
   * <p>One or both of the values that make up the key-value pair is not valid. For example, you cannot specify a tag value that begins with <code>aws:</code>.</p>
   */
  @js.native
  trait InvalidTagExceptionException extends js.Object {
    val message: String
  }

  object KeyAlgorithmEnum {
    val RSA_2048 = "RSA_2048"
    val RSA_1024 = "RSA_1024"
    val RSA_4096 = "RSA_4096"
    val EC_prime256v1 = "EC_prime256v1"
    val EC_secp384r1 = "EC_secp384r1"
    val EC_secp521r1 = "EC_secp521r1"

    val values = IndexedSeq(RSA_2048, RSA_1024, RSA_4096, EC_prime256v1, EC_secp384r1, EC_secp521r1)
  }

  /**
   * <p>The Key Usage X.509 v3 extension defines the purpose of the public key contained in the certificate.</p>
   */
  @js.native
  trait KeyUsage extends js.Object {
    var Name: js.UndefOr[KeyUsageName]
  }

  object KeyUsage {
    def apply(
      Name: js.UndefOr[KeyUsageName] = js.undefined): KeyUsage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[KeyUsage]
    }
  }

  object KeyUsageNameEnum {
    val DIGITAL_SIGNATURE = "DIGITAL_SIGNATURE"
    val NON_REPUDIATION = "NON_REPUDIATION"
    val KEY_ENCIPHERMENT = "KEY_ENCIPHERMENT"
    val DATA_ENCIPHERMENT = "DATA_ENCIPHERMENT"
    val KEY_AGREEMENT = "KEY_AGREEMENT"
    val CERTIFICATE_SIGNING = "CERTIFICATE_SIGNING"
    val CRL_SIGNING = "CRL_SIGNING"
    val ENCIPHER_ONLY = "ENCIPHER_ONLY"
    val DECIPHER_ONLY = "DECIPHER_ONLY"
    val ANY = "ANY"
    val CUSTOM = "CUSTOM"

    val values = IndexedSeq(DIGITAL_SIGNATURE, NON_REPUDIATION, KEY_ENCIPHERMENT, DATA_ENCIPHERMENT, KEY_AGREEMENT, CERTIFICATE_SIGNING, CRL_SIGNING, ENCIPHER_ONLY, DECIPHER_ONLY, ANY, CUSTOM)
  }

  /**
   * <p>An ACM limit has been exceeded.</p>
   */
  @js.native
  trait LimitExceededExceptionException extends js.Object {
    val message: String
  }

  @js.native
  trait ListCertificatesRequest extends js.Object {
    var CertificateStatuses: js.UndefOr[CertificateStatuses]
    var Includes: js.UndefOr[Filters]
    var NextToken: js.UndefOr[NextToken]
    var MaxItems: js.UndefOr[MaxItems]
  }

  object ListCertificatesRequest {
    def apply(
      CertificateStatuses: js.UndefOr[CertificateStatuses] = js.undefined,
      Includes: js.UndefOr[Filters] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined,
      MaxItems: js.UndefOr[MaxItems] = js.undefined): ListCertificatesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CertificateStatuses" -> CertificateStatuses.map { x => x.asInstanceOf[js.Any] },
        "Includes" -> Includes.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "MaxItems" -> MaxItems.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListCertificatesRequest]
    }
  }

  @js.native
  trait ListCertificatesResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var CertificateSummaryList: js.UndefOr[CertificateSummaryList]
  }

  object ListCertificatesResponse {
    def apply(
      NextToken: js.UndefOr[NextToken] = js.undefined,
      CertificateSummaryList: js.UndefOr[CertificateSummaryList] = js.undefined): ListCertificatesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "CertificateSummaryList" -> CertificateSummaryList.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListCertificatesResponse]
    }
  }

  @js.native
  trait ListTagsForCertificateRequest extends js.Object {
    var CertificateArn: js.UndefOr[Arn]
  }

  object ListTagsForCertificateRequest {
    def apply(
      CertificateArn: js.UndefOr[Arn] = js.undefined): ListTagsForCertificateRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CertificateArn" -> CertificateArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTagsForCertificateRequest]
    }
  }

  @js.native
  trait ListTagsForCertificateResponse extends js.Object {
    var Tags: js.UndefOr[TagList]
  }

  object ListTagsForCertificateResponse {
    def apply(
      Tags: js.UndefOr[TagList] = js.undefined): ListTagsForCertificateResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTagsForCertificateResponse]
    }
  }

  object RecordTypeEnum {
    val CNAME = "CNAME"

    val values = IndexedSeq(CNAME)
  }

  @js.native
  trait RemoveTagsFromCertificateRequest extends js.Object {
    var CertificateArn: js.UndefOr[Arn]
    var Tags: js.UndefOr[TagList]
  }

  object RemoveTagsFromCertificateRequest {
    def apply(
      CertificateArn: js.UndefOr[Arn] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined): RemoveTagsFromCertificateRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CertificateArn" -> CertificateArn.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RemoveTagsFromCertificateRequest]
    }
  }

  object RenewalEligibilityEnum {
    val ELIGIBLE = "ELIGIBLE"
    val INELIGIBLE = "INELIGIBLE"

    val values = IndexedSeq(ELIGIBLE, INELIGIBLE)
  }

  object RenewalStatusEnum {
    val PENDING_AUTO_RENEWAL = "PENDING_AUTO_RENEWAL"
    val PENDING_VALIDATION = "PENDING_VALIDATION"
    val SUCCESS = "SUCCESS"
    val FAILED = "FAILED"

    val values = IndexedSeq(PENDING_AUTO_RENEWAL, PENDING_VALIDATION, SUCCESS, FAILED)
  }

  /**
   * <p>Contains information about the status of ACM's <a href="http://docs.aws.amazon.com/acm/latest/userguide/acm-renewal.html">managed renewal</a> for the certificate. This structure exists only when the certificate type is <code>AMAZON_ISSUED</code>.</p>
   */
  @js.native
  trait RenewalSummary extends js.Object {
    var RenewalStatus: js.UndefOr[RenewalStatus]
    var DomainValidationOptions: js.UndefOr[DomainValidationList]
  }

  object RenewalSummary {
    def apply(
      RenewalStatus: js.UndefOr[RenewalStatus] = js.undefined,
      DomainValidationOptions: js.UndefOr[DomainValidationList] = js.undefined): RenewalSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RenewalStatus" -> RenewalStatus.map { x => x.asInstanceOf[js.Any] },
        "DomainValidationOptions" -> DomainValidationOptions.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RenewalSummary]
    }
  }

  @js.native
  trait RequestCertificateRequest extends js.Object {
    var SubjectAlternativeNames: js.UndefOr[DomainList]
    var DomainValidationOptions: js.UndefOr[DomainValidationOptionList]
    var IdempotencyToken: js.UndefOr[IdempotencyToken]
    var CertificateAuthorityArn: js.UndefOr[Arn]
    var DomainName: js.UndefOr[DomainNameString]
    var Options: js.UndefOr[CertificateOptions]
    var ValidationMethod: js.UndefOr[ValidationMethod]
  }

  object RequestCertificateRequest {
    def apply(
      SubjectAlternativeNames: js.UndefOr[DomainList] = js.undefined,
      DomainValidationOptions: js.UndefOr[DomainValidationOptionList] = js.undefined,
      IdempotencyToken: js.UndefOr[IdempotencyToken] = js.undefined,
      CertificateAuthorityArn: js.UndefOr[Arn] = js.undefined,
      DomainName: js.UndefOr[DomainNameString] = js.undefined,
      Options: js.UndefOr[CertificateOptions] = js.undefined,
      ValidationMethod: js.UndefOr[ValidationMethod] = js.undefined): RequestCertificateRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SubjectAlternativeNames" -> SubjectAlternativeNames.map { x => x.asInstanceOf[js.Any] },
        "DomainValidationOptions" -> DomainValidationOptions.map { x => x.asInstanceOf[js.Any] },
        "IdempotencyToken" -> IdempotencyToken.map { x => x.asInstanceOf[js.Any] },
        "CertificateAuthorityArn" -> CertificateAuthorityArn.map { x => x.asInstanceOf[js.Any] },
        "DomainName" -> DomainName.map { x => x.asInstanceOf[js.Any] },
        "Options" -> Options.map { x => x.asInstanceOf[js.Any] },
        "ValidationMethod" -> ValidationMethod.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RequestCertificateRequest]
    }
  }

  @js.native
  trait RequestCertificateResponse extends js.Object {
    var CertificateArn: js.UndefOr[Arn]
  }

  object RequestCertificateResponse {
    def apply(
      CertificateArn: js.UndefOr[Arn] = js.undefined): RequestCertificateResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CertificateArn" -> CertificateArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RequestCertificateResponse]
    }
  }

  /**
   * <p>The certificate request is in process and the certificate in your account has not yet been issued.</p>
   */
  @js.native
  trait RequestInProgressExceptionException extends js.Object {
    val message: String
  }

  @js.native
  trait ResendValidationEmailRequest extends js.Object {
    var CertificateArn: js.UndefOr[Arn]
    var Domain: js.UndefOr[DomainNameString]
    var ValidationDomain: js.UndefOr[DomainNameString]
  }

  object ResendValidationEmailRequest {
    def apply(
      CertificateArn: js.UndefOr[Arn] = js.undefined,
      Domain: js.UndefOr[DomainNameString] = js.undefined,
      ValidationDomain: js.UndefOr[DomainNameString] = js.undefined): ResendValidationEmailRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CertificateArn" -> CertificateArn.map { x => x.asInstanceOf[js.Any] },
        "Domain" -> Domain.map { x => x.asInstanceOf[js.Any] },
        "ValidationDomain" -> ValidationDomain.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResendValidationEmailRequest]
    }
  }

  /**
   * <p>The certificate is in use by another AWS service in the caller's account. Remove the association and try again.</p>
   */
  @js.native
  trait ResourceInUseExceptionException extends js.Object {
    val message: String
  }

  /**
   * <p>The specified certificate cannot be found in the caller's account or the caller's account cannot be found.</p>
   */
  @js.native
  trait ResourceNotFoundExceptionException extends js.Object {
    val message: String
  }

  /**
   * <p>Contains a DNS record value that you can use to can use to validate ownership or control of a domain. This is used by the <a>DescribeCertificate</a> action. </p>
   */
  @js.native
  trait ResourceRecord extends js.Object {
    var Name: js.UndefOr[String]
    var Type: js.UndefOr[RecordType]
    var Value: js.UndefOr[String]
  }

  object ResourceRecord {
    def apply(
      Name: js.UndefOr[String] = js.undefined,
      Type: js.UndefOr[RecordType] = js.undefined,
      Value: js.UndefOr[String] = js.undefined): ResourceRecord = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "Type" -> Type.map { x => x.asInstanceOf[js.Any] },
        "Value" -> Value.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResourceRecord]
    }
  }

  object RevocationReasonEnum {
    val UNSPECIFIED = "UNSPECIFIED"
    val KEY_COMPROMISE = "KEY_COMPROMISE"
    val CA_COMPROMISE = "CA_COMPROMISE"
    val AFFILIATION_CHANGED = "AFFILIATION_CHANGED"
    val SUPERCEDED = "SUPERCEDED"
    val CESSATION_OF_OPERATION = "CESSATION_OF_OPERATION"
    val CERTIFICATE_HOLD = "CERTIFICATE_HOLD"
    val REMOVE_FROM_CRL = "REMOVE_FROM_CRL"
    val PRIVILEGE_WITHDRAWN = "PRIVILEGE_WITHDRAWN"
    val A_A_COMPROMISE = "A_A_COMPROMISE"

    val values = IndexedSeq(UNSPECIFIED, KEY_COMPROMISE, CA_COMPROMISE, AFFILIATION_CHANGED, SUPERCEDED, CESSATION_OF_OPERATION, CERTIFICATE_HOLD, REMOVE_FROM_CRL, PRIVILEGE_WITHDRAWN, A_A_COMPROMISE)
  }

  /**
   * <p>A key-value pair that identifies or specifies metadata about an ACM resource.</p>
   */
  @js.native
  trait Tag extends js.Object {
    var Key: js.UndefOr[TagKey]
    var Value: js.UndefOr[TagValue]
  }

  object Tag {
    def apply(
      Key: js.UndefOr[TagKey] = js.undefined,
      Value: js.UndefOr[TagValue] = js.undefined): Tag = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Key" -> Key.map { x => x.asInstanceOf[js.Any] },
        "Value" -> Value.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Tag]
    }
  }

  /**
   * <p>The request contains too many tags. Try the request again with fewer tags.</p>
   */
  @js.native
  trait TooManyTagsExceptionException extends js.Object {
    val message: String
  }

  @js.native
  trait UpdateCertificateOptionsRequest extends js.Object {
    var CertificateArn: js.UndefOr[Arn]
    var Options: js.UndefOr[CertificateOptions]
  }

  object UpdateCertificateOptionsRequest {
    def apply(
      CertificateArn: js.UndefOr[Arn] = js.undefined,
      Options: js.UndefOr[CertificateOptions] = js.undefined): UpdateCertificateOptionsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CertificateArn" -> CertificateArn.map { x => x.asInstanceOf[js.Any] },
        "Options" -> Options.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateCertificateOptionsRequest]
    }
  }

  object ValidationMethodEnum {
    val EMAIL = "EMAIL"
    val DNS = "DNS"

    val values = IndexedSeq(EMAIL, DNS)
  }
}
