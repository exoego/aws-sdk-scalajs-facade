package facade.amazonaws.services.acmpca

import scalajs._
import scala.scalajs.js.|

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
sealed trait ExtendedKeyUsageType extends js.Any
object ExtendedKeyUsageType {
  val SERVER_AUTH = "SERVER_AUTH".asInstanceOf[ExtendedKeyUsageType]
  val CLIENT_AUTH = "CLIENT_AUTH".asInstanceOf[ExtendedKeyUsageType]
  val CODE_SIGNING = "CODE_SIGNING".asInstanceOf[ExtendedKeyUsageType]
  val EMAIL_PROTECTION = "EMAIL_PROTECTION".asInstanceOf[ExtendedKeyUsageType]
  val TIME_STAMPING = "TIME_STAMPING".asInstanceOf[ExtendedKeyUsageType]
  val OCSP_SIGNING = "OCSP_SIGNING".asInstanceOf[ExtendedKeyUsageType]
  val SMART_CARD_LOGIN = "SMART_CARD_LOGIN".asInstanceOf[ExtendedKeyUsageType]
  val DOCUMENT_SIGNING = "DOCUMENT_SIGNING".asInstanceOf[ExtendedKeyUsageType]
  val CERTIFICATE_TRANSPARENCY = "CERTIFICATE_TRANSPARENCY".asInstanceOf[ExtendedKeyUsageType]

  @inline def values = js.Array(SERVER_AUTH, CLIENT_AUTH, CODE_SIGNING, EMAIL_PROTECTION, TIME_STAMPING, OCSP_SIGNING, SMART_CARD_LOGIN, DOCUMENT_SIGNING, CERTIFICATE_TRANSPARENCY)
}

@js.native
sealed trait FailureReason extends js.Any
object FailureReason {
  val REQUEST_TIMED_OUT = "REQUEST_TIMED_OUT".asInstanceOf[FailureReason]
  val UNSUPPORTED_ALGORITHM = "UNSUPPORTED_ALGORITHM".asInstanceOf[FailureReason]
  val OTHER = "OTHER".asInstanceOf[FailureReason]

  @inline def values = js.Array(REQUEST_TIMED_OUT, UNSUPPORTED_ALGORITHM, OTHER)
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

@js.native
sealed trait PolicyQualifierId extends js.Any
object PolicyQualifierId {
  val CPS = "CPS".asInstanceOf[PolicyQualifierId]

  @inline def values = js.Array(CPS)
}

@js.native
sealed trait ResourceOwner extends js.Any
object ResourceOwner {
  val SELF = "SELF".asInstanceOf[ResourceOwner]
  val OTHER_ACCOUNTS = "OTHER_ACCOUNTS".asInstanceOf[ResourceOwner]

  @inline def values = js.Array(SELF, OTHER_ACCOUNTS)
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

