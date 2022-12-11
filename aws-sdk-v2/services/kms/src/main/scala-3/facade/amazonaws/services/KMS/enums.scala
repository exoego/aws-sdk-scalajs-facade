package facade.amazonaws.services.kms

import scalajs.js

type AlgorithmSpec = "RSAES_PKCS1_V1_5" | "RSAES_OAEP_SHA_1" | "RSAES_OAEP_SHA_256"
object AlgorithmSpec {
  inline val RSAES_PKCS1_V1_5: "RSAES_PKCS1_V1_5" = "RSAES_PKCS1_V1_5"
  inline val RSAES_OAEP_SHA_1: "RSAES_OAEP_SHA_1" = "RSAES_OAEP_SHA_1"
  inline val RSAES_OAEP_SHA_256: "RSAES_OAEP_SHA_256" = "RSAES_OAEP_SHA_256"

  inline def values: js.Array[AlgorithmSpec] = js.Array(RSAES_PKCS1_V1_5, RSAES_OAEP_SHA_1, RSAES_OAEP_SHA_256)
}

type ConnectionErrorCodeType = "INVALID_CREDENTIALS" | "CLUSTER_NOT_FOUND" | "NETWORK_ERRORS" | "INTERNAL_ERROR" | "INSUFFICIENT_CLOUDHSM_HSMS" | "USER_LOCKED_OUT" | "USER_NOT_FOUND" | "USER_LOGGED_IN" | "SUBNET_NOT_FOUND" | "INSUFFICIENT_FREE_ADDRESSES_IN_SUBNET" | "XKS_PROXY_ACCESS_DENIED" | "XKS_PROXY_NOT_REACHABLE" | "XKS_VPC_ENDPOINT_SERVICE_NOT_FOUND" | "XKS_PROXY_INVALID_RESPONSE" | "XKS_PROXY_INVALID_CONFIGURATION" | "XKS_VPC_ENDPOINT_SERVICE_INVALID_CONFIGURATION" | "XKS_PROXY_TIMED_OUT" | "XKS_PROXY_INVALID_TLS_CONFIGURATION"
object ConnectionErrorCodeType {
  inline val INVALID_CREDENTIALS: "INVALID_CREDENTIALS" = "INVALID_CREDENTIALS"
  inline val CLUSTER_NOT_FOUND: "CLUSTER_NOT_FOUND" = "CLUSTER_NOT_FOUND"
  inline val NETWORK_ERRORS: "NETWORK_ERRORS" = "NETWORK_ERRORS"
  inline val INTERNAL_ERROR: "INTERNAL_ERROR" = "INTERNAL_ERROR"
  inline val INSUFFICIENT_CLOUDHSM_HSMS: "INSUFFICIENT_CLOUDHSM_HSMS" = "INSUFFICIENT_CLOUDHSM_HSMS"
  inline val USER_LOCKED_OUT: "USER_LOCKED_OUT" = "USER_LOCKED_OUT"
  inline val USER_NOT_FOUND: "USER_NOT_FOUND" = "USER_NOT_FOUND"
  inline val USER_LOGGED_IN: "USER_LOGGED_IN" = "USER_LOGGED_IN"
  inline val SUBNET_NOT_FOUND: "SUBNET_NOT_FOUND" = "SUBNET_NOT_FOUND"
  inline val INSUFFICIENT_FREE_ADDRESSES_IN_SUBNET: "INSUFFICIENT_FREE_ADDRESSES_IN_SUBNET" = "INSUFFICIENT_FREE_ADDRESSES_IN_SUBNET"
  inline val XKS_PROXY_ACCESS_DENIED: "XKS_PROXY_ACCESS_DENIED" = "XKS_PROXY_ACCESS_DENIED"
  inline val XKS_PROXY_NOT_REACHABLE: "XKS_PROXY_NOT_REACHABLE" = "XKS_PROXY_NOT_REACHABLE"
  inline val XKS_VPC_ENDPOINT_SERVICE_NOT_FOUND: "XKS_VPC_ENDPOINT_SERVICE_NOT_FOUND" = "XKS_VPC_ENDPOINT_SERVICE_NOT_FOUND"
  inline val XKS_PROXY_INVALID_RESPONSE: "XKS_PROXY_INVALID_RESPONSE" = "XKS_PROXY_INVALID_RESPONSE"
  inline val XKS_PROXY_INVALID_CONFIGURATION: "XKS_PROXY_INVALID_CONFIGURATION" = "XKS_PROXY_INVALID_CONFIGURATION"
  inline val XKS_VPC_ENDPOINT_SERVICE_INVALID_CONFIGURATION: "XKS_VPC_ENDPOINT_SERVICE_INVALID_CONFIGURATION" = "XKS_VPC_ENDPOINT_SERVICE_INVALID_CONFIGURATION"
  inline val XKS_PROXY_TIMED_OUT: "XKS_PROXY_TIMED_OUT" = "XKS_PROXY_TIMED_OUT"
  inline val XKS_PROXY_INVALID_TLS_CONFIGURATION: "XKS_PROXY_INVALID_TLS_CONFIGURATION" = "XKS_PROXY_INVALID_TLS_CONFIGURATION"

  inline def values: js.Array[ConnectionErrorCodeType] = js.Array(
    INVALID_CREDENTIALS,
    CLUSTER_NOT_FOUND,
    NETWORK_ERRORS,
    INTERNAL_ERROR,
    INSUFFICIENT_CLOUDHSM_HSMS,
    USER_LOCKED_OUT,
    USER_NOT_FOUND,
    USER_LOGGED_IN,
    SUBNET_NOT_FOUND,
    INSUFFICIENT_FREE_ADDRESSES_IN_SUBNET,
    XKS_PROXY_ACCESS_DENIED,
    XKS_PROXY_NOT_REACHABLE,
    XKS_VPC_ENDPOINT_SERVICE_NOT_FOUND,
    XKS_PROXY_INVALID_RESPONSE,
    XKS_PROXY_INVALID_CONFIGURATION,
    XKS_VPC_ENDPOINT_SERVICE_INVALID_CONFIGURATION,
    XKS_PROXY_TIMED_OUT,
    XKS_PROXY_INVALID_TLS_CONFIGURATION
  )
}

type ConnectionStateType = "CONNECTED" | "CONNECTING" | "FAILED" | "DISCONNECTED" | "DISCONNECTING"
object ConnectionStateType {
  inline val CONNECTED: "CONNECTED" = "CONNECTED"
  inline val CONNECTING: "CONNECTING" = "CONNECTING"
  inline val FAILED: "FAILED" = "FAILED"
  inline val DISCONNECTED: "DISCONNECTED" = "DISCONNECTED"
  inline val DISCONNECTING: "DISCONNECTING" = "DISCONNECTING"

  inline def values: js.Array[ConnectionStateType] = js.Array(CONNECTED, CONNECTING, FAILED, DISCONNECTED, DISCONNECTING)
}

type CustomKeyStoreType = "AWS_CLOUDHSM" | "EXTERNAL_KEY_STORE"
object CustomKeyStoreType {
  inline val AWS_CLOUDHSM: "AWS_CLOUDHSM" = "AWS_CLOUDHSM"
  inline val EXTERNAL_KEY_STORE: "EXTERNAL_KEY_STORE" = "EXTERNAL_KEY_STORE"

  inline def values: js.Array[CustomKeyStoreType] = js.Array(AWS_CLOUDHSM, EXTERNAL_KEY_STORE)
}

@deprecated("This enum has been deprecated. Instead, use the KeySpec enum.", "forever")
type CustomerMasterKeySpec = "RSA_2048" | "RSA_3072" | "RSA_4096" | "ECC_NIST_P256" | "ECC_NIST_P384" | "ECC_NIST_P521" | "ECC_SECG_P256K1" | "SYMMETRIC_DEFAULT" | "HMAC_224" | "HMAC_256" | "HMAC_384" | "HMAC_512" | "SM2"
object CustomerMasterKeySpec {
  inline val RSA_2048: "RSA_2048" = "RSA_2048"
  inline val RSA_3072: "RSA_3072" = "RSA_3072"
  inline val RSA_4096: "RSA_4096" = "RSA_4096"
  inline val ECC_NIST_P256: "ECC_NIST_P256" = "ECC_NIST_P256"
  inline val ECC_NIST_P384: "ECC_NIST_P384" = "ECC_NIST_P384"
  inline val ECC_NIST_P521: "ECC_NIST_P521" = "ECC_NIST_P521"
  inline val ECC_SECG_P256K1: "ECC_SECG_P256K1" = "ECC_SECG_P256K1"
  inline val SYMMETRIC_DEFAULT: "SYMMETRIC_DEFAULT" = "SYMMETRIC_DEFAULT"
  inline val HMAC_224: "HMAC_224" = "HMAC_224"
  inline val HMAC_256: "HMAC_256" = "HMAC_256"
  inline val HMAC_384: "HMAC_384" = "HMAC_384"
  inline val HMAC_512: "HMAC_512" = "HMAC_512"
  inline val SM2: "SM2" = "SM2"

  inline def values: js.Array[CustomerMasterKeySpec] = js.Array(RSA_2048, RSA_3072, RSA_4096, ECC_NIST_P256, ECC_NIST_P384, ECC_NIST_P521, ECC_SECG_P256K1, SYMMETRIC_DEFAULT, HMAC_224, HMAC_256, HMAC_384, HMAC_512, SM2)
}

type DataKeyPairSpec = "RSA_2048" | "RSA_3072" | "RSA_4096" | "ECC_NIST_P256" | "ECC_NIST_P384" | "ECC_NIST_P521" | "ECC_SECG_P256K1" | "SM2"
object DataKeyPairSpec {
  inline val RSA_2048: "RSA_2048" = "RSA_2048"
  inline val RSA_3072: "RSA_3072" = "RSA_3072"
  inline val RSA_4096: "RSA_4096" = "RSA_4096"
  inline val ECC_NIST_P256: "ECC_NIST_P256" = "ECC_NIST_P256"
  inline val ECC_NIST_P384: "ECC_NIST_P384" = "ECC_NIST_P384"
  inline val ECC_NIST_P521: "ECC_NIST_P521" = "ECC_NIST_P521"
  inline val ECC_SECG_P256K1: "ECC_SECG_P256K1" = "ECC_SECG_P256K1"
  inline val SM2: "SM2" = "SM2"

  inline def values: js.Array[DataKeyPairSpec] = js.Array(RSA_2048, RSA_3072, RSA_4096, ECC_NIST_P256, ECC_NIST_P384, ECC_NIST_P521, ECC_SECG_P256K1, SM2)
}

type DataKeySpec = "AES_256" | "AES_128"
object DataKeySpec {
  inline val AES_256: "AES_256" = "AES_256"
  inline val AES_128: "AES_128" = "AES_128"

  inline def values: js.Array[DataKeySpec] = js.Array(AES_256, AES_128)
}

type EncryptionAlgorithmSpec = "SYMMETRIC_DEFAULT" | "RSAES_OAEP_SHA_1" | "RSAES_OAEP_SHA_256" | "SM2PKE"
object EncryptionAlgorithmSpec {
  inline val SYMMETRIC_DEFAULT: "SYMMETRIC_DEFAULT" = "SYMMETRIC_DEFAULT"
  inline val RSAES_OAEP_SHA_1: "RSAES_OAEP_SHA_1" = "RSAES_OAEP_SHA_1"
  inline val RSAES_OAEP_SHA_256: "RSAES_OAEP_SHA_256" = "RSAES_OAEP_SHA_256"
  inline val SM2PKE: "SM2PKE" = "SM2PKE"

  inline def values: js.Array[EncryptionAlgorithmSpec] = js.Array(SYMMETRIC_DEFAULT, RSAES_OAEP_SHA_1, RSAES_OAEP_SHA_256, SM2PKE)
}

type ExpirationModelType = "KEY_MATERIAL_EXPIRES" | "KEY_MATERIAL_DOES_NOT_EXPIRE"
object ExpirationModelType {
  inline val KEY_MATERIAL_EXPIRES: "KEY_MATERIAL_EXPIRES" = "KEY_MATERIAL_EXPIRES"
  inline val KEY_MATERIAL_DOES_NOT_EXPIRE: "KEY_MATERIAL_DOES_NOT_EXPIRE" = "KEY_MATERIAL_DOES_NOT_EXPIRE"

  inline def values: js.Array[ExpirationModelType] = js.Array(KEY_MATERIAL_EXPIRES, KEY_MATERIAL_DOES_NOT_EXPIRE)
}

type GrantOperation = "Decrypt" | "Encrypt" | "GenerateDataKey" | "GenerateDataKeyWithoutPlaintext" | "ReEncryptFrom" | "ReEncryptTo" | "Sign" | "Verify" | "GetPublicKey" | "CreateGrant" | "RetireGrant" | "DescribeKey" | "GenerateDataKeyPair" | "GenerateDataKeyPairWithoutPlaintext" | "GenerateMac" | "VerifyMac"
object GrantOperation {
  inline val Decrypt: "Decrypt" = "Decrypt"
  inline val Encrypt: "Encrypt" = "Encrypt"
  inline val GenerateDataKey: "GenerateDataKey" = "GenerateDataKey"
  inline val GenerateDataKeyWithoutPlaintext: "GenerateDataKeyWithoutPlaintext" = "GenerateDataKeyWithoutPlaintext"
  inline val ReEncryptFrom: "ReEncryptFrom" = "ReEncryptFrom"
  inline val ReEncryptTo: "ReEncryptTo" = "ReEncryptTo"
  inline val Sign: "Sign" = "Sign"
  inline val Verify: "Verify" = "Verify"
  inline val GetPublicKey: "GetPublicKey" = "GetPublicKey"
  inline val CreateGrant: "CreateGrant" = "CreateGrant"
  inline val RetireGrant: "RetireGrant" = "RetireGrant"
  inline val DescribeKey: "DescribeKey" = "DescribeKey"
  inline val GenerateDataKeyPair: "GenerateDataKeyPair" = "GenerateDataKeyPair"
  inline val GenerateDataKeyPairWithoutPlaintext: "GenerateDataKeyPairWithoutPlaintext" = "GenerateDataKeyPairWithoutPlaintext"
  inline val GenerateMac: "GenerateMac" = "GenerateMac"
  inline val VerifyMac: "VerifyMac" = "VerifyMac"

  inline def values: js.Array[GrantOperation] = js.Array(
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
    GenerateDataKeyPairWithoutPlaintext,
    GenerateMac,
    VerifyMac
  )
}

type KeyManagerType = "AWS" | "CUSTOMER"
object KeyManagerType {
  inline val AWS: "AWS" = "AWS"
  inline val CUSTOMER: "CUSTOMER" = "CUSTOMER"

  inline def values: js.Array[KeyManagerType] = js.Array(AWS, CUSTOMER)
}

type KeySpec = "RSA_2048" | "RSA_3072" | "RSA_4096" | "ECC_NIST_P256" | "ECC_NIST_P384" | "ECC_NIST_P521" | "ECC_SECG_P256K1" | "SYMMETRIC_DEFAULT" | "HMAC_224" | "HMAC_256" | "HMAC_384" | "HMAC_512" | "SM2"
object KeySpec {
  inline val RSA_2048: "RSA_2048" = "RSA_2048"
  inline val RSA_3072: "RSA_3072" = "RSA_3072"
  inline val RSA_4096: "RSA_4096" = "RSA_4096"
  inline val ECC_NIST_P256: "ECC_NIST_P256" = "ECC_NIST_P256"
  inline val ECC_NIST_P384: "ECC_NIST_P384" = "ECC_NIST_P384"
  inline val ECC_NIST_P521: "ECC_NIST_P521" = "ECC_NIST_P521"
  inline val ECC_SECG_P256K1: "ECC_SECG_P256K1" = "ECC_SECG_P256K1"
  inline val SYMMETRIC_DEFAULT: "SYMMETRIC_DEFAULT" = "SYMMETRIC_DEFAULT"
  inline val HMAC_224: "HMAC_224" = "HMAC_224"
  inline val HMAC_256: "HMAC_256" = "HMAC_256"
  inline val HMAC_384: "HMAC_384" = "HMAC_384"
  inline val HMAC_512: "HMAC_512" = "HMAC_512"
  inline val SM2: "SM2" = "SM2"

  inline def values: js.Array[KeySpec] = js.Array(RSA_2048, RSA_3072, RSA_4096, ECC_NIST_P256, ECC_NIST_P384, ECC_NIST_P521, ECC_SECG_P256K1, SYMMETRIC_DEFAULT, HMAC_224, HMAC_256, HMAC_384, HMAC_512, SM2)
}

type KeyState = "Creating" | "Enabled" | "Disabled" | "PendingDeletion" | "PendingImport" | "PendingReplicaDeletion" | "Unavailable" | "Updating"
object KeyState {
  inline val Creating: "Creating" = "Creating"
  inline val Enabled: "Enabled" = "Enabled"
  inline val Disabled: "Disabled" = "Disabled"
  inline val PendingDeletion: "PendingDeletion" = "PendingDeletion"
  inline val PendingImport: "PendingImport" = "PendingImport"
  inline val PendingReplicaDeletion: "PendingReplicaDeletion" = "PendingReplicaDeletion"
  inline val Unavailable: "Unavailable" = "Unavailable"
  inline val Updating: "Updating" = "Updating"

  inline def values: js.Array[KeyState] = js.Array(Creating, Enabled, Disabled, PendingDeletion, PendingImport, PendingReplicaDeletion, Unavailable, Updating)
}

type KeyUsageType = "SIGN_VERIFY" | "ENCRYPT_DECRYPT" | "GENERATE_VERIFY_MAC"
object KeyUsageType {
  inline val SIGN_VERIFY: "SIGN_VERIFY" = "SIGN_VERIFY"
  inline val ENCRYPT_DECRYPT: "ENCRYPT_DECRYPT" = "ENCRYPT_DECRYPT"
  inline val GENERATE_VERIFY_MAC: "GENERATE_VERIFY_MAC" = "GENERATE_VERIFY_MAC"

  inline def values: js.Array[KeyUsageType] = js.Array(SIGN_VERIFY, ENCRYPT_DECRYPT, GENERATE_VERIFY_MAC)
}

type MacAlgorithmSpec = "HMAC_SHA_224" | "HMAC_SHA_256" | "HMAC_SHA_384" | "HMAC_SHA_512"
object MacAlgorithmSpec {
  inline val HMAC_SHA_224: "HMAC_SHA_224" = "HMAC_SHA_224"
  inline val HMAC_SHA_256: "HMAC_SHA_256" = "HMAC_SHA_256"
  inline val HMAC_SHA_384: "HMAC_SHA_384" = "HMAC_SHA_384"
  inline val HMAC_SHA_512: "HMAC_SHA_512" = "HMAC_SHA_512"

  inline def values: js.Array[MacAlgorithmSpec] = js.Array(HMAC_SHA_224, HMAC_SHA_256, HMAC_SHA_384, HMAC_SHA_512)
}

type MessageType = "RAW" | "DIGEST"
object MessageType {
  inline val RAW: "RAW" = "RAW"
  inline val DIGEST: "DIGEST" = "DIGEST"

  inline def values: js.Array[MessageType] = js.Array(RAW, DIGEST)
}

type MultiRegionKeyType = "PRIMARY" | "REPLICA"
object MultiRegionKeyType {
  inline val PRIMARY: "PRIMARY" = "PRIMARY"
  inline val REPLICA: "REPLICA" = "REPLICA"

  inline def values: js.Array[MultiRegionKeyType] = js.Array(PRIMARY, REPLICA)
}

type OriginType = "AWS_KMS" | "EXTERNAL" | "AWS_CLOUDHSM" | "EXTERNAL_KEY_STORE"
object OriginType {
  inline val AWS_KMS: "AWS_KMS" = "AWS_KMS"
  inline val EXTERNAL: "EXTERNAL" = "EXTERNAL"
  inline val AWS_CLOUDHSM: "AWS_CLOUDHSM" = "AWS_CLOUDHSM"
  inline val EXTERNAL_KEY_STORE: "EXTERNAL_KEY_STORE" = "EXTERNAL_KEY_STORE"

  inline def values: js.Array[OriginType] = js.Array(AWS_KMS, EXTERNAL, AWS_CLOUDHSM, EXTERNAL_KEY_STORE)
}

type SigningAlgorithmSpec = "RSASSA_PSS_SHA_256" | "RSASSA_PSS_SHA_384" | "RSASSA_PSS_SHA_512" | "RSASSA_PKCS1_V1_5_SHA_256" | "RSASSA_PKCS1_V1_5_SHA_384" | "RSASSA_PKCS1_V1_5_SHA_512" | "ECDSA_SHA_256" | "ECDSA_SHA_384" | "ECDSA_SHA_512" | "SM2DSA"
object SigningAlgorithmSpec {
  inline val RSASSA_PSS_SHA_256: "RSASSA_PSS_SHA_256" = "RSASSA_PSS_SHA_256"
  inline val RSASSA_PSS_SHA_384: "RSASSA_PSS_SHA_384" = "RSASSA_PSS_SHA_384"
  inline val RSASSA_PSS_SHA_512: "RSASSA_PSS_SHA_512" = "RSASSA_PSS_SHA_512"
  inline val RSASSA_PKCS1_V1_5_SHA_256: "RSASSA_PKCS1_V1_5_SHA_256" = "RSASSA_PKCS1_V1_5_SHA_256"
  inline val RSASSA_PKCS1_V1_5_SHA_384: "RSASSA_PKCS1_V1_5_SHA_384" = "RSASSA_PKCS1_V1_5_SHA_384"
  inline val RSASSA_PKCS1_V1_5_SHA_512: "RSASSA_PKCS1_V1_5_SHA_512" = "RSASSA_PKCS1_V1_5_SHA_512"
  inline val ECDSA_SHA_256: "ECDSA_SHA_256" = "ECDSA_SHA_256"
  inline val ECDSA_SHA_384: "ECDSA_SHA_384" = "ECDSA_SHA_384"
  inline val ECDSA_SHA_512: "ECDSA_SHA_512" = "ECDSA_SHA_512"
  inline val SM2DSA: "SM2DSA" = "SM2DSA"

  inline def values: js.Array[SigningAlgorithmSpec] = js.Array(
    RSASSA_PSS_SHA_256,
    RSASSA_PSS_SHA_384,
    RSASSA_PSS_SHA_512,
    RSASSA_PKCS1_V1_5_SHA_256,
    RSASSA_PKCS1_V1_5_SHA_384,
    RSASSA_PKCS1_V1_5_SHA_512,
    ECDSA_SHA_256,
    ECDSA_SHA_384,
    ECDSA_SHA_512,
    SM2DSA
  )
}

type WrappingKeySpec = "RSA_2048"
object WrappingKeySpec {
  inline val RSA_2048: "RSA_2048" = "RSA_2048"

  inline def values: js.Array[WrappingKeySpec] = js.Array(RSA_2048)
}

type XksProxyConnectivityType = "PUBLIC_ENDPOINT" | "VPC_ENDPOINT_SERVICE"
object XksProxyConnectivityType {
  inline val PUBLIC_ENDPOINT: "PUBLIC_ENDPOINT" = "PUBLIC_ENDPOINT"
  inline val VPC_ENDPOINT_SERVICE: "VPC_ENDPOINT_SERVICE" = "VPC_ENDPOINT_SERVICE"

  inline def values: js.Array[XksProxyConnectivityType] = js.Array(PUBLIC_ENDPOINT, VPC_ENDPOINT_SERVICE)
}
