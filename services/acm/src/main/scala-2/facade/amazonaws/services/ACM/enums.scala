package facade.amazonaws.services.acm

import scalajs.js

@js.native
sealed trait CertificateStatus extends js.Any
object CertificateStatus {
  val PENDING_VALIDATION = "PENDING_VALIDATION".asInstanceOf[CertificateStatus]
  val ISSUED = "ISSUED".asInstanceOf[CertificateStatus]
  val INACTIVE = "INACTIVE".asInstanceOf[CertificateStatus]
  val EXPIRED = "EXPIRED".asInstanceOf[CertificateStatus]
  val VALIDATION_TIMED_OUT = "VALIDATION_TIMED_OUT".asInstanceOf[CertificateStatus]
  val REVOKED = "REVOKED".asInstanceOf[CertificateStatus]
  val FAILED = "FAILED".asInstanceOf[CertificateStatus]

  @inline def values: js.Array[CertificateStatus] = js.Array(PENDING_VALIDATION, ISSUED, INACTIVE, EXPIRED, VALIDATION_TIMED_OUT, REVOKED, FAILED)
}

@js.native
sealed trait CertificateTransparencyLoggingPreference extends js.Any
object CertificateTransparencyLoggingPreference {
  val ENABLED = "ENABLED".asInstanceOf[CertificateTransparencyLoggingPreference]
  val DISABLED = "DISABLED".asInstanceOf[CertificateTransparencyLoggingPreference]

  @inline def values: js.Array[CertificateTransparencyLoggingPreference] = js.Array(ENABLED, DISABLED)
}

@js.native
sealed trait CertificateType extends js.Any
object CertificateType {
  val IMPORTED = "IMPORTED".asInstanceOf[CertificateType]
  val AMAZON_ISSUED = "AMAZON_ISSUED".asInstanceOf[CertificateType]
  val PRIVATE = "PRIVATE".asInstanceOf[CertificateType]

  @inline def values: js.Array[CertificateType] = js.Array(IMPORTED, AMAZON_ISSUED, PRIVATE)
}

@js.native
sealed trait DomainStatus extends js.Any
object DomainStatus {
  val PENDING_VALIDATION = "PENDING_VALIDATION".asInstanceOf[DomainStatus]
  val SUCCESS = "SUCCESS".asInstanceOf[DomainStatus]
  val FAILED = "FAILED".asInstanceOf[DomainStatus]

  @inline def values: js.Array[DomainStatus] = js.Array(PENDING_VALIDATION, SUCCESS, FAILED)
}

@js.native
sealed trait ExtendedKeyUsageName extends js.Any
object ExtendedKeyUsageName {
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

  @inline def values: js.Array[ExtendedKeyUsageName] = js.Array(
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
  )
}

@js.native
sealed trait FailureReason extends js.Any
object FailureReason {
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
  val SLR_NOT_FOUND = "SLR_NOT_FOUND".asInstanceOf[FailureReason]
  val OTHER = "OTHER".asInstanceOf[FailureReason]

  @inline def values: js.Array[FailureReason] = js.Array(
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
    SLR_NOT_FOUND,
    OTHER
  )
}

@js.native
sealed trait KeyAlgorithm extends js.Any
object KeyAlgorithm {
  val RSA_1024 = "RSA_1024".asInstanceOf[KeyAlgorithm]
  val RSA_2048 = "RSA_2048".asInstanceOf[KeyAlgorithm]
  val RSA_3072 = "RSA_3072".asInstanceOf[KeyAlgorithm]
  val RSA_4096 = "RSA_4096".asInstanceOf[KeyAlgorithm]
  val EC_prime256v1 = "EC_prime256v1".asInstanceOf[KeyAlgorithm]
  val EC_secp384r1 = "EC_secp384r1".asInstanceOf[KeyAlgorithm]
  val EC_secp521r1 = "EC_secp521r1".asInstanceOf[KeyAlgorithm]

  @inline def values: js.Array[KeyAlgorithm] = js.Array(RSA_1024, RSA_2048, RSA_3072, RSA_4096, EC_prime256v1, EC_secp384r1, EC_secp521r1)
}

@js.native
sealed trait KeyUsageName extends js.Any
object KeyUsageName {
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

  @inline def values: js.Array[KeyUsageName] = js.Array(
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
  )
}

@js.native
sealed trait RecordType extends js.Any
object RecordType {
  val CNAME = "CNAME".asInstanceOf[RecordType]

  @inline def values: js.Array[RecordType] = js.Array(CNAME)
}

@js.native
sealed trait RenewalEligibility extends js.Any
object RenewalEligibility {
  val ELIGIBLE = "ELIGIBLE".asInstanceOf[RenewalEligibility]
  val INELIGIBLE = "INELIGIBLE".asInstanceOf[RenewalEligibility]

  @inline def values: js.Array[RenewalEligibility] = js.Array(ELIGIBLE, INELIGIBLE)
}

@js.native
sealed trait RenewalStatus extends js.Any
object RenewalStatus {
  val PENDING_AUTO_RENEWAL = "PENDING_AUTO_RENEWAL".asInstanceOf[RenewalStatus]
  val PENDING_VALIDATION = "PENDING_VALIDATION".asInstanceOf[RenewalStatus]
  val SUCCESS = "SUCCESS".asInstanceOf[RenewalStatus]
  val FAILED = "FAILED".asInstanceOf[RenewalStatus]

  @inline def values: js.Array[RenewalStatus] = js.Array(PENDING_AUTO_RENEWAL, PENDING_VALIDATION, SUCCESS, FAILED)
}

@js.native
sealed trait RevocationReason extends js.Any
object RevocationReason {
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

  @inline def values: js.Array[RevocationReason] = js.Array(
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
  )
}

@js.native
sealed trait ValidationMethod extends js.Any
object ValidationMethod {
  val EMAIL = "EMAIL".asInstanceOf[ValidationMethod]
  val DNS = "DNS".asInstanceOf[ValidationMethod]

  @inline def values: js.Array[ValidationMethod] = js.Array(EMAIL, DNS)
}
