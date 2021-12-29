package facade.amazonaws.services.acmpca

import scalajs._

type AccessMethodType = "CA_REPOSITORY" | "RESOURCE_PKI_MANIFEST" | "RESOURCE_PKI_NOTIFY"
object AccessMethodType {
  inline val CA_REPOSITORY: "CA_REPOSITORY" = "CA_REPOSITORY"
  inline val RESOURCE_PKI_MANIFEST: "RESOURCE_PKI_MANIFEST" = "RESOURCE_PKI_MANIFEST"
  inline val RESOURCE_PKI_NOTIFY: "RESOURCE_PKI_NOTIFY" = "RESOURCE_PKI_NOTIFY"

  inline def values: js.Array[AccessMethodType] = js.Array(CA_REPOSITORY, RESOURCE_PKI_MANIFEST, RESOURCE_PKI_NOTIFY)
}

type ActionType = "IssueCertificate" | "GetCertificate" | "ListPermissions"
object ActionType {
  inline val IssueCertificate: "IssueCertificate" = "IssueCertificate"
  inline val GetCertificate: "GetCertificate" = "GetCertificate"
  inline val ListPermissions: "ListPermissions" = "ListPermissions"

  inline def values: js.Array[ActionType] = js.Array(IssueCertificate, GetCertificate, ListPermissions)
}

type AuditReportResponseFormat = "JSON" | "CSV"
object AuditReportResponseFormat {
  inline val JSON: "JSON" = "JSON"
  inline val CSV: "CSV" = "CSV"

  inline def values: js.Array[AuditReportResponseFormat] = js.Array(JSON, CSV)
}

type AuditReportStatus = "CREATING" | "SUCCESS" | "FAILED"
object AuditReportStatus {
  inline val CREATING: "CREATING" = "CREATING"
  inline val SUCCESS: "SUCCESS" = "SUCCESS"
  inline val FAILED: "FAILED" = "FAILED"

  inline def values: js.Array[AuditReportStatus] = js.Array(CREATING, SUCCESS, FAILED)
}

type CertificateAuthorityStatus = "CREATING" | "PENDING_CERTIFICATE" | "ACTIVE" | "DELETED" | "DISABLED" | "EXPIRED" | "FAILED"
object CertificateAuthorityStatus {
  inline val CREATING: "CREATING" = "CREATING"
  inline val PENDING_CERTIFICATE: "PENDING_CERTIFICATE" = "PENDING_CERTIFICATE"
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val DELETED: "DELETED" = "DELETED"
  inline val DISABLED: "DISABLED" = "DISABLED"
  inline val EXPIRED: "EXPIRED" = "EXPIRED"
  inline val FAILED: "FAILED" = "FAILED"

  inline def values: js.Array[CertificateAuthorityStatus] = js.Array(CREATING, PENDING_CERTIFICATE, ACTIVE, DELETED, DISABLED, EXPIRED, FAILED)
}

type CertificateAuthorityType = "ROOT" | "SUBORDINATE"
object CertificateAuthorityType {
  inline val ROOT: "ROOT" = "ROOT"
  inline val SUBORDINATE: "SUBORDINATE" = "SUBORDINATE"

  inline def values: js.Array[CertificateAuthorityType] = js.Array(ROOT, SUBORDINATE)
}

type ExtendedKeyUsageType = "SERVER_AUTH" | "CLIENT_AUTH" | "CODE_SIGNING" | "EMAIL_PROTECTION" | "TIME_STAMPING" | "OCSP_SIGNING" | "SMART_CARD_LOGIN" | "DOCUMENT_SIGNING" | "CERTIFICATE_TRANSPARENCY"
object ExtendedKeyUsageType {
  inline val SERVER_AUTH: "SERVER_AUTH" = "SERVER_AUTH"
  inline val CLIENT_AUTH: "CLIENT_AUTH" = "CLIENT_AUTH"
  inline val CODE_SIGNING: "CODE_SIGNING" = "CODE_SIGNING"
  inline val EMAIL_PROTECTION: "EMAIL_PROTECTION" = "EMAIL_PROTECTION"
  inline val TIME_STAMPING: "TIME_STAMPING" = "TIME_STAMPING"
  inline val OCSP_SIGNING: "OCSP_SIGNING" = "OCSP_SIGNING"
  inline val SMART_CARD_LOGIN: "SMART_CARD_LOGIN" = "SMART_CARD_LOGIN"
  inline val DOCUMENT_SIGNING: "DOCUMENT_SIGNING" = "DOCUMENT_SIGNING"
  inline val CERTIFICATE_TRANSPARENCY: "CERTIFICATE_TRANSPARENCY" = "CERTIFICATE_TRANSPARENCY"

  inline def values: js.Array[ExtendedKeyUsageType] = js.Array(SERVER_AUTH, CLIENT_AUTH, CODE_SIGNING, EMAIL_PROTECTION, TIME_STAMPING, OCSP_SIGNING, SMART_CARD_LOGIN, DOCUMENT_SIGNING, CERTIFICATE_TRANSPARENCY)
}

type FailureReason = "REQUEST_TIMED_OUT" | "UNSUPPORTED_ALGORITHM" | "OTHER"
object FailureReason {
  inline val REQUEST_TIMED_OUT: "REQUEST_TIMED_OUT" = "REQUEST_TIMED_OUT"
  inline val UNSUPPORTED_ALGORITHM: "UNSUPPORTED_ALGORITHM" = "UNSUPPORTED_ALGORITHM"
  inline val OTHER: "OTHER" = "OTHER"

  inline def values: js.Array[FailureReason] = js.Array(REQUEST_TIMED_OUT, UNSUPPORTED_ALGORITHM, OTHER)
}

type KeyAlgorithm = "RSA_2048" | "RSA_4096" | "EC_prime256v1" | "EC_secp384r1"
object KeyAlgorithm {
  inline val RSA_2048: "RSA_2048" = "RSA_2048"
  inline val RSA_4096: "RSA_4096" = "RSA_4096"
  inline val EC_prime256v1: "EC_prime256v1" = "EC_prime256v1"
  inline val EC_secp384r1: "EC_secp384r1" = "EC_secp384r1"

  inline def values: js.Array[KeyAlgorithm] = js.Array(RSA_2048, RSA_4096, EC_prime256v1, EC_secp384r1)
}

type PolicyQualifierId = "CPS"
object PolicyQualifierId {
  inline val CPS: "CPS" = "CPS"

  inline def values: js.Array[PolicyQualifierId] = js.Array(CPS)
}

type ResourceOwner = "SELF" | "OTHER_ACCOUNTS"
object ResourceOwner {
  inline val SELF: "SELF" = "SELF"
  inline val OTHER_ACCOUNTS: "OTHER_ACCOUNTS" = "OTHER_ACCOUNTS"

  inline def values: js.Array[ResourceOwner] = js.Array(SELF, OTHER_ACCOUNTS)
}

type RevocationReason = "UNSPECIFIED" | "KEY_COMPROMISE" | "CERTIFICATE_AUTHORITY_COMPROMISE" | "AFFILIATION_CHANGED" | "SUPERSEDED" | "CESSATION_OF_OPERATION" | "PRIVILEGE_WITHDRAWN" | "A_A_COMPROMISE"
object RevocationReason {
  inline val UNSPECIFIED: "UNSPECIFIED" = "UNSPECIFIED"
  inline val KEY_COMPROMISE: "KEY_COMPROMISE" = "KEY_COMPROMISE"
  inline val CERTIFICATE_AUTHORITY_COMPROMISE: "CERTIFICATE_AUTHORITY_COMPROMISE" = "CERTIFICATE_AUTHORITY_COMPROMISE"
  inline val AFFILIATION_CHANGED: "AFFILIATION_CHANGED" = "AFFILIATION_CHANGED"
  inline val SUPERSEDED: "SUPERSEDED" = "SUPERSEDED"
  inline val CESSATION_OF_OPERATION: "CESSATION_OF_OPERATION" = "CESSATION_OF_OPERATION"
  inline val PRIVILEGE_WITHDRAWN: "PRIVILEGE_WITHDRAWN" = "PRIVILEGE_WITHDRAWN"
  inline val A_A_COMPROMISE: "A_A_COMPROMISE" = "A_A_COMPROMISE"

  inline def values: js.Array[RevocationReason] = js.Array(UNSPECIFIED, KEY_COMPROMISE, CERTIFICATE_AUTHORITY_COMPROMISE, AFFILIATION_CHANGED, SUPERSEDED, CESSATION_OF_OPERATION, PRIVILEGE_WITHDRAWN, A_A_COMPROMISE)
}

type SigningAlgorithm = "SHA256WITHECDSA" | "SHA384WITHECDSA" | "SHA512WITHECDSA" | "SHA256WITHRSA" | "SHA384WITHRSA" | "SHA512WITHRSA"
object SigningAlgorithm {
  inline val SHA256WITHECDSA: "SHA256WITHECDSA" = "SHA256WITHECDSA"
  inline val SHA384WITHECDSA: "SHA384WITHECDSA" = "SHA384WITHECDSA"
  inline val SHA512WITHECDSA: "SHA512WITHECDSA" = "SHA512WITHECDSA"
  inline val SHA256WITHRSA: "SHA256WITHRSA" = "SHA256WITHRSA"
  inline val SHA384WITHRSA: "SHA384WITHRSA" = "SHA384WITHRSA"
  inline val SHA512WITHRSA: "SHA512WITHRSA" = "SHA512WITHRSA"

  inline def values: js.Array[SigningAlgorithm] = js.Array(SHA256WITHECDSA, SHA384WITHECDSA, SHA512WITHECDSA, SHA256WITHRSA, SHA384WITHRSA, SHA512WITHRSA)
}

type ValidityPeriodType = "END_DATE" | "ABSOLUTE" | "DAYS" | "MONTHS" | "YEARS"
object ValidityPeriodType {
  inline val END_DATE: "END_DATE" = "END_DATE"
  inline val ABSOLUTE: "ABSOLUTE" = "ABSOLUTE"
  inline val DAYS: "DAYS" = "DAYS"
  inline val MONTHS: "MONTHS" = "MONTHS"
  inline val YEARS: "YEARS" = "YEARS"

  inline def values: js.Array[ValidityPeriodType] = js.Array(END_DATE, ABSOLUTE, DAYS, MONTHS, YEARS)
}
