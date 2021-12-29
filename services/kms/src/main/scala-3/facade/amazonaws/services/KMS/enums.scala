package facade.amazonaws.services.kms

import scalajs._

type AlgorithmSpec = "RSAES_PKCS1_V1_5" | "RSAES_OAEP_SHA_1" | "RSAES_OAEP_SHA_256"
object AlgorithmSpec {
  val RSAES_PKCS1_V1_5: "RSAES_PKCS1_V1_5" = "RSAES_PKCS1_V1_5"
  val RSAES_OAEP_SHA_1: "RSAES_OAEP_SHA_1" = "RSAES_OAEP_SHA_1"
  val RSAES_OAEP_SHA_256: "RSAES_OAEP_SHA_256" = "RSAES_OAEP_SHA_256"

  @inline def values = js.Array[AlgorithmSpec](RSAES_PKCS1_V1_5, RSAES_OAEP_SHA_1, RSAES_OAEP_SHA_256)
}

type ConnectionErrorCodeType = "INVALID_CREDENTIALS" | "CLUSTER_NOT_FOUND" | "NETWORK_ERRORS" | "INTERNAL_ERROR" | "INSUFFICIENT_CLOUDHSM_HSMS" | "USER_LOCKED_OUT" | "USER_NOT_FOUND" | "USER_LOGGED_IN" | "SUBNET_NOT_FOUND"
object ConnectionErrorCodeType {
  val INVALID_CREDENTIALS: "INVALID_CREDENTIALS" = "INVALID_CREDENTIALS"
  val CLUSTER_NOT_FOUND: "CLUSTER_NOT_FOUND" = "CLUSTER_NOT_FOUND"
  val NETWORK_ERRORS: "NETWORK_ERRORS" = "NETWORK_ERRORS"
  val INTERNAL_ERROR: "INTERNAL_ERROR" = "INTERNAL_ERROR"
  val INSUFFICIENT_CLOUDHSM_HSMS: "INSUFFICIENT_CLOUDHSM_HSMS" = "INSUFFICIENT_CLOUDHSM_HSMS"
  val USER_LOCKED_OUT: "USER_LOCKED_OUT" = "USER_LOCKED_OUT"
  val USER_NOT_FOUND: "USER_NOT_FOUND" = "USER_NOT_FOUND"
  val USER_LOGGED_IN: "USER_LOGGED_IN" = "USER_LOGGED_IN"
  val SUBNET_NOT_FOUND: "SUBNET_NOT_FOUND" = "SUBNET_NOT_FOUND"

  @inline def values = js.Array[ConnectionErrorCodeType](
    INVALID_CREDENTIALS,
    CLUSTER_NOT_FOUND,
    NETWORK_ERRORS,
    INTERNAL_ERROR,
    INSUFFICIENT_CLOUDHSM_HSMS,
    USER_LOCKED_OUT,
    USER_NOT_FOUND,
    USER_LOGGED_IN,
    SUBNET_NOT_FOUND
  )
}

type ConnectionStateType = "CONNECTED" | "CONNECTING" | "FAILED" | "DISCONNECTED" | "DISCONNECTING"
object ConnectionStateType {
  val CONNECTED: "CONNECTED" = "CONNECTED"
  val CONNECTING: "CONNECTING" = "CONNECTING"
  val FAILED: "FAILED" = "FAILED"
  val DISCONNECTED: "DISCONNECTED" = "DISCONNECTED"
  val DISCONNECTING: "DISCONNECTING" = "DISCONNECTING"

  @inline def values = js.Array[ConnectionStateType](CONNECTED, CONNECTING, FAILED, DISCONNECTED, DISCONNECTING)
}

type CustomerMasterKeySpec = "RSA_2048" | "RSA_3072" | "RSA_4096" | "ECC_NIST_P256" | "ECC_NIST_P384" | "ECC_NIST_P521" | "ECC_SECG_P256K1" | "SYMMETRIC_DEFAULT"
object CustomerMasterKeySpec {
  val RSA_2048: "RSA_2048" = "RSA_2048"
  val RSA_3072: "RSA_3072" = "RSA_3072"
  val RSA_4096: "RSA_4096" = "RSA_4096"
  val ECC_NIST_P256: "ECC_NIST_P256" = "ECC_NIST_P256"
  val ECC_NIST_P384: "ECC_NIST_P384" = "ECC_NIST_P384"
  val ECC_NIST_P521: "ECC_NIST_P521" = "ECC_NIST_P521"
  val ECC_SECG_P256K1: "ECC_SECG_P256K1" = "ECC_SECG_P256K1"
  val SYMMETRIC_DEFAULT: "SYMMETRIC_DEFAULT" = "SYMMETRIC_DEFAULT"

  @inline def values = js.Array[CustomerMasterKeySpec](RSA_2048, RSA_3072, RSA_4096, ECC_NIST_P256, ECC_NIST_P384, ECC_NIST_P521, ECC_SECG_P256K1, SYMMETRIC_DEFAULT)
}

type DataKeyPairSpec = "RSA_2048" | "RSA_3072" | "RSA_4096" | "ECC_NIST_P256" | "ECC_NIST_P384" | "ECC_NIST_P521" | "ECC_SECG_P256K1"
object DataKeyPairSpec {
  val RSA_2048: "RSA_2048" = "RSA_2048"
  val RSA_3072: "RSA_3072" = "RSA_3072"
  val RSA_4096: "RSA_4096" = "RSA_4096"
  val ECC_NIST_P256: "ECC_NIST_P256" = "ECC_NIST_P256"
  val ECC_NIST_P384: "ECC_NIST_P384" = "ECC_NIST_P384"
  val ECC_NIST_P521: "ECC_NIST_P521" = "ECC_NIST_P521"
  val ECC_SECG_P256K1: "ECC_SECG_P256K1" = "ECC_SECG_P256K1"

  @inline def values = js.Array[DataKeyPairSpec](RSA_2048, RSA_3072, RSA_4096, ECC_NIST_P256, ECC_NIST_P384, ECC_NIST_P521, ECC_SECG_P256K1)
}

type DataKeySpec = "AES_256" | "AES_128"
object DataKeySpec {
  val AES_256: "AES_256" = "AES_256"
  val AES_128: "AES_128" = "AES_128"

  @inline def values = js.Array[DataKeySpec](AES_256, AES_128)
}

type EncryptionAlgorithmSpec = "SYMMETRIC_DEFAULT" | "RSAES_OAEP_SHA_1" | "RSAES_OAEP_SHA_256"
object EncryptionAlgorithmSpec {
  val SYMMETRIC_DEFAULT: "SYMMETRIC_DEFAULT" = "SYMMETRIC_DEFAULT"
  val RSAES_OAEP_SHA_1: "RSAES_OAEP_SHA_1" = "RSAES_OAEP_SHA_1"
  val RSAES_OAEP_SHA_256: "RSAES_OAEP_SHA_256" = "RSAES_OAEP_SHA_256"

  @inline def values = js.Array[EncryptionAlgorithmSpec](SYMMETRIC_DEFAULT, RSAES_OAEP_SHA_1, RSAES_OAEP_SHA_256)
}

type ExpirationModelType = "KEY_MATERIAL_EXPIRES" | "KEY_MATERIAL_DOES_NOT_EXPIRE"
object ExpirationModelType {
  val KEY_MATERIAL_EXPIRES: "KEY_MATERIAL_EXPIRES" = "KEY_MATERIAL_EXPIRES"
  val KEY_MATERIAL_DOES_NOT_EXPIRE: "KEY_MATERIAL_DOES_NOT_EXPIRE" = "KEY_MATERIAL_DOES_NOT_EXPIRE"

  @inline def values = js.Array[ExpirationModelType](KEY_MATERIAL_EXPIRES, KEY_MATERIAL_DOES_NOT_EXPIRE)
}

type GrantOperation = "Decrypt" | "Encrypt" | "GenerateDataKey" | "GenerateDataKeyWithoutPlaintext" | "ReEncryptFrom" | "ReEncryptTo" | "Sign" | "Verify" | "GetPublicKey" | "CreateGrant" | "RetireGrant" | "DescribeKey" | "GenerateDataKeyPair" | "GenerateDataKeyPairWithoutPlaintext"
object GrantOperation {
  val Decrypt: "Decrypt" = "Decrypt"
  val Encrypt: "Encrypt" = "Encrypt"
  val GenerateDataKey: "GenerateDataKey" = "GenerateDataKey"
  val GenerateDataKeyWithoutPlaintext: "GenerateDataKeyWithoutPlaintext" = "GenerateDataKeyWithoutPlaintext"
  val ReEncryptFrom: "ReEncryptFrom" = "ReEncryptFrom"
  val ReEncryptTo: "ReEncryptTo" = "ReEncryptTo"
  val Sign: "Sign" = "Sign"
  val Verify: "Verify" = "Verify"
  val GetPublicKey: "GetPublicKey" = "GetPublicKey"
  val CreateGrant: "CreateGrant" = "CreateGrant"
  val RetireGrant: "RetireGrant" = "RetireGrant"
  val DescribeKey: "DescribeKey" = "DescribeKey"
  val GenerateDataKeyPair: "GenerateDataKeyPair" = "GenerateDataKeyPair"
  val GenerateDataKeyPairWithoutPlaintext: "GenerateDataKeyPairWithoutPlaintext" = "GenerateDataKeyPairWithoutPlaintext"

  @inline def values = js.Array[GrantOperation](
    Decrypt,
    Encrypt,
    GenerateDataKey,
    GenerateDataKeyWithoutPlaintext,
    ReEncryptFrom,
    ReEncryptTo,
    Sign,
    Verify,
    GetPublicKey,
    CreateGrant,
    RetireGrant,
    DescribeKey,
    GenerateDataKeyPair,
    GenerateDataKeyPairWithoutPlaintext
  )
}

type KeyManagerType = "AWS" | "CUSTOMER"
object KeyManagerType {
  val AWS: "AWS" = "AWS"
  val CUSTOMER: "CUSTOMER" = "CUSTOMER"

  @inline def values = js.Array[KeyManagerType](AWS, CUSTOMER)
}

type KeyState = "Enabled" | "Disabled" | "PendingDeletion" | "PendingImport" | "Unavailable"
object KeyState {
  val Enabled: "Enabled" = "Enabled"
  val Disabled: "Disabled" = "Disabled"
  val PendingDeletion: "PendingDeletion" = "PendingDeletion"
  val PendingImport: "PendingImport" = "PendingImport"
  val Unavailable: "Unavailable" = "Unavailable"

  @inline def values = js.Array[KeyState](Enabled, Disabled, PendingDeletion, PendingImport, Unavailable)
}

type KeyUsageType = "SIGN_VERIFY" | "ENCRYPT_DECRYPT"
object KeyUsageType {
  val SIGN_VERIFY: "SIGN_VERIFY" = "SIGN_VERIFY"
  val ENCRYPT_DECRYPT: "ENCRYPT_DECRYPT" = "ENCRYPT_DECRYPT"

  @inline def values = js.Array[KeyUsageType](SIGN_VERIFY, ENCRYPT_DECRYPT)
}

type MessageType = "RAW" | "DIGEST"
object MessageType {
  val RAW: "RAW" = "RAW"
  val DIGEST: "DIGEST" = "DIGEST"

  @inline def values = js.Array[MessageType](RAW, DIGEST)
}

type OriginType = "AWS_KMS" | "EXTERNAL" | "AWS_CLOUDHSM"
object OriginType {
  val AWS_KMS: "AWS_KMS" = "AWS_KMS"
  val EXTERNAL: "EXTERNAL" = "EXTERNAL"
  val AWS_CLOUDHSM: "AWS_CLOUDHSM" = "AWS_CLOUDHSM"

  @inline def values = js.Array[OriginType](AWS_KMS, EXTERNAL, AWS_CLOUDHSM)
}

type SigningAlgorithmSpec = "RSASSA_PSS_SHA_256" | "RSASSA_PSS_SHA_384" | "RSASSA_PSS_SHA_512" | "RSASSA_PKCS1_V1_5_SHA_256" | "RSASSA_PKCS1_V1_5_SHA_384" | "RSASSA_PKCS1_V1_5_SHA_512" | "ECDSA_SHA_256" | "ECDSA_SHA_384" | "ECDSA_SHA_512"
object SigningAlgorithmSpec {
  val RSASSA_PSS_SHA_256: "RSASSA_PSS_SHA_256" = "RSASSA_PSS_SHA_256"
  val RSASSA_PSS_SHA_384: "RSASSA_PSS_SHA_384" = "RSASSA_PSS_SHA_384"
  val RSASSA_PSS_SHA_512: "RSASSA_PSS_SHA_512" = "RSASSA_PSS_SHA_512"
  val RSASSA_PKCS1_V1_5_SHA_256: "RSASSA_PKCS1_V1_5_SHA_256" = "RSASSA_PKCS1_V1_5_SHA_256"
  val RSASSA_PKCS1_V1_5_SHA_384: "RSASSA_PKCS1_V1_5_SHA_384" = "RSASSA_PKCS1_V1_5_SHA_384"
  val RSASSA_PKCS1_V1_5_SHA_512: "RSASSA_PKCS1_V1_5_SHA_512" = "RSASSA_PKCS1_V1_5_SHA_512"
  val ECDSA_SHA_256: "ECDSA_SHA_256" = "ECDSA_SHA_256"
  val ECDSA_SHA_384: "ECDSA_SHA_384" = "ECDSA_SHA_384"
  val ECDSA_SHA_512: "ECDSA_SHA_512" = "ECDSA_SHA_512"

  @inline def values = js.Array[SigningAlgorithmSpec](
    RSASSA_PSS_SHA_256,
    RSASSA_PSS_SHA_384,
    RSASSA_PSS_SHA_512,
    RSASSA_PKCS1_V1_5_SHA_256,
    RSASSA_PKCS1_V1_5_SHA_384,
    RSASSA_PKCS1_V1_5_SHA_512,
    ECDSA_SHA_256,
    ECDSA_SHA_384,
    ECDSA_SHA_512
  )
}

type WrappingKeySpec = "RSA_2048"
object WrappingKeySpec {
  val RSA_2048: "RSA_2048" = "RSA_2048"

  @inline def values = js.Array[WrappingKeySpec](RSA_2048)
}
