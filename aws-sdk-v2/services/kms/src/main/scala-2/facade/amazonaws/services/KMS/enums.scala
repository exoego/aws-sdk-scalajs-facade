package facade.amazonaws.services.kms

import scalajs.js

@js.native
sealed trait AlgorithmSpec extends js.Any
object AlgorithmSpec {
  val RSAES_PKCS1_V1_5 = "RSAES_PKCS1_V1_5".asInstanceOf[AlgorithmSpec]
  val RSAES_OAEP_SHA_1 = "RSAES_OAEP_SHA_1".asInstanceOf[AlgorithmSpec]
  val RSAES_OAEP_SHA_256 = "RSAES_OAEP_SHA_256".asInstanceOf[AlgorithmSpec]

  @inline def values: js.Array[AlgorithmSpec] = js.Array(RSAES_PKCS1_V1_5, RSAES_OAEP_SHA_1, RSAES_OAEP_SHA_256)
}

@js.native
sealed trait ConnectionErrorCodeType extends js.Any
object ConnectionErrorCodeType {
  val INVALID_CREDENTIALS = "INVALID_CREDENTIALS".asInstanceOf[ConnectionErrorCodeType]
  val CLUSTER_NOT_FOUND = "CLUSTER_NOT_FOUND".asInstanceOf[ConnectionErrorCodeType]
  val NETWORK_ERRORS = "NETWORK_ERRORS".asInstanceOf[ConnectionErrorCodeType]
  val INTERNAL_ERROR = "INTERNAL_ERROR".asInstanceOf[ConnectionErrorCodeType]
  val INSUFFICIENT_CLOUDHSM_HSMS = "INSUFFICIENT_CLOUDHSM_HSMS".asInstanceOf[ConnectionErrorCodeType]
  val USER_LOCKED_OUT = "USER_LOCKED_OUT".asInstanceOf[ConnectionErrorCodeType]
  val USER_NOT_FOUND = "USER_NOT_FOUND".asInstanceOf[ConnectionErrorCodeType]
  val USER_LOGGED_IN = "USER_LOGGED_IN".asInstanceOf[ConnectionErrorCodeType]
  val SUBNET_NOT_FOUND = "SUBNET_NOT_FOUND".asInstanceOf[ConnectionErrorCodeType]

  @inline def values: js.Array[ConnectionErrorCodeType] = js.Array(
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

@js.native
sealed trait ConnectionStateType extends js.Any
object ConnectionStateType {
  val CONNECTED = "CONNECTED".asInstanceOf[ConnectionStateType]
  val CONNECTING = "CONNECTING".asInstanceOf[ConnectionStateType]
  val FAILED = "FAILED".asInstanceOf[ConnectionStateType]
  val DISCONNECTED = "DISCONNECTED".asInstanceOf[ConnectionStateType]
  val DISCONNECTING = "DISCONNECTING".asInstanceOf[ConnectionStateType]

  @inline def values: js.Array[ConnectionStateType] = js.Array(CONNECTED, CONNECTING, FAILED, DISCONNECTED, DISCONNECTING)
}

@deprecated("This enum has been deprecated. Instead, use the KeySpec enum.", "forever")
@js.native
sealed trait CustomerMasterKeySpec extends js.Any
object CustomerMasterKeySpec {
  val RSA_2048 = "RSA_2048".asInstanceOf[CustomerMasterKeySpec]
  val RSA_3072 = "RSA_3072".asInstanceOf[CustomerMasterKeySpec]
  val RSA_4096 = "RSA_4096".asInstanceOf[CustomerMasterKeySpec]
  val ECC_NIST_P256 = "ECC_NIST_P256".asInstanceOf[CustomerMasterKeySpec]
  val ECC_NIST_P384 = "ECC_NIST_P384".asInstanceOf[CustomerMasterKeySpec]
  val ECC_NIST_P521 = "ECC_NIST_P521".asInstanceOf[CustomerMasterKeySpec]
  val ECC_SECG_P256K1 = "ECC_SECG_P256K1".asInstanceOf[CustomerMasterKeySpec]
  val SYMMETRIC_DEFAULT = "SYMMETRIC_DEFAULT".asInstanceOf[CustomerMasterKeySpec]

  @inline def values: js.Array[CustomerMasterKeySpec] = js.Array(RSA_2048, RSA_3072, RSA_4096, ECC_NIST_P256, ECC_NIST_P384, ECC_NIST_P521, ECC_SECG_P256K1, SYMMETRIC_DEFAULT)
}

@js.native
sealed trait DataKeyPairSpec extends js.Any
object DataKeyPairSpec {
  val RSA_2048 = "RSA_2048".asInstanceOf[DataKeyPairSpec]
  val RSA_3072 = "RSA_3072".asInstanceOf[DataKeyPairSpec]
  val RSA_4096 = "RSA_4096".asInstanceOf[DataKeyPairSpec]
  val ECC_NIST_P256 = "ECC_NIST_P256".asInstanceOf[DataKeyPairSpec]
  val ECC_NIST_P384 = "ECC_NIST_P384".asInstanceOf[DataKeyPairSpec]
  val ECC_NIST_P521 = "ECC_NIST_P521".asInstanceOf[DataKeyPairSpec]
  val ECC_SECG_P256K1 = "ECC_SECG_P256K1".asInstanceOf[DataKeyPairSpec]

  @inline def values: js.Array[DataKeyPairSpec] = js.Array(RSA_2048, RSA_3072, RSA_4096, ECC_NIST_P256, ECC_NIST_P384, ECC_NIST_P521, ECC_SECG_P256K1)
}

@js.native
sealed trait DataKeySpec extends js.Any
object DataKeySpec {
  val AES_256 = "AES_256".asInstanceOf[DataKeySpec]
  val AES_128 = "AES_128".asInstanceOf[DataKeySpec]

  @inline def values: js.Array[DataKeySpec] = js.Array(AES_256, AES_128)
}

@js.native
sealed trait EncryptionAlgorithmSpec extends js.Any
object EncryptionAlgorithmSpec {
  val SYMMETRIC_DEFAULT = "SYMMETRIC_DEFAULT".asInstanceOf[EncryptionAlgorithmSpec]
  val RSAES_OAEP_SHA_1 = "RSAES_OAEP_SHA_1".asInstanceOf[EncryptionAlgorithmSpec]
  val RSAES_OAEP_SHA_256 = "RSAES_OAEP_SHA_256".asInstanceOf[EncryptionAlgorithmSpec]

  @inline def values: js.Array[EncryptionAlgorithmSpec] = js.Array(SYMMETRIC_DEFAULT, RSAES_OAEP_SHA_1, RSAES_OAEP_SHA_256)
}

@js.native
sealed trait ExpirationModelType extends js.Any
object ExpirationModelType {
  val KEY_MATERIAL_EXPIRES = "KEY_MATERIAL_EXPIRES".asInstanceOf[ExpirationModelType]
  val KEY_MATERIAL_DOES_NOT_EXPIRE = "KEY_MATERIAL_DOES_NOT_EXPIRE".asInstanceOf[ExpirationModelType]

  @inline def values: js.Array[ExpirationModelType] = js.Array(KEY_MATERIAL_EXPIRES, KEY_MATERIAL_DOES_NOT_EXPIRE)
}

@js.native
sealed trait GrantOperation extends js.Any
object GrantOperation {
  val Decrypt = "Decrypt".asInstanceOf[GrantOperation]
  val Encrypt = "Encrypt".asInstanceOf[GrantOperation]
  val GenerateDataKey = "GenerateDataKey".asInstanceOf[GrantOperation]
  val GenerateDataKeyWithoutPlaintext = "GenerateDataKeyWithoutPlaintext".asInstanceOf[GrantOperation]
  val ReEncryptFrom = "ReEncryptFrom".asInstanceOf[GrantOperation]
  val ReEncryptTo = "ReEncryptTo".asInstanceOf[GrantOperation]
  val Sign = "Sign".asInstanceOf[GrantOperation]
  val Verify = "Verify".asInstanceOf[GrantOperation]
  val GetPublicKey = "GetPublicKey".asInstanceOf[GrantOperation]
  val CreateGrant = "CreateGrant".asInstanceOf[GrantOperation]
  val RetireGrant = "RetireGrant".asInstanceOf[GrantOperation]
  val DescribeKey = "DescribeKey".asInstanceOf[GrantOperation]
  val GenerateDataKeyPair = "GenerateDataKeyPair".asInstanceOf[GrantOperation]
  val GenerateDataKeyPairWithoutPlaintext = "GenerateDataKeyPairWithoutPlaintext".asInstanceOf[GrantOperation]

  @inline def values: js.Array[GrantOperation] = js.Array(
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

@js.native
sealed trait KeyManagerType extends js.Any
object KeyManagerType {
  val AWS = "AWS".asInstanceOf[KeyManagerType]
  val CUSTOMER = "CUSTOMER".asInstanceOf[KeyManagerType]

  @inline def values: js.Array[KeyManagerType] = js.Array(AWS, CUSTOMER)
}

@js.native
sealed trait KeySpec extends js.Any
object KeySpec {
  val RSA_2048 = "RSA_2048".asInstanceOf[KeySpec]
  val RSA_3072 = "RSA_3072".asInstanceOf[KeySpec]
  val RSA_4096 = "RSA_4096".asInstanceOf[KeySpec]
  val ECC_NIST_P256 = "ECC_NIST_P256".asInstanceOf[KeySpec]
  val ECC_NIST_P384 = "ECC_NIST_P384".asInstanceOf[KeySpec]
  val ECC_NIST_P521 = "ECC_NIST_P521".asInstanceOf[KeySpec]
  val ECC_SECG_P256K1 = "ECC_SECG_P256K1".asInstanceOf[KeySpec]
  val SYMMETRIC_DEFAULT = "SYMMETRIC_DEFAULT".asInstanceOf[KeySpec]

  @inline def values: js.Array[KeySpec] = js.Array(RSA_2048, RSA_3072, RSA_4096, ECC_NIST_P256, ECC_NIST_P384, ECC_NIST_P521, ECC_SECG_P256K1, SYMMETRIC_DEFAULT)
}

@js.native
sealed trait KeyState extends js.Any
object KeyState {
  val Creating = "Creating".asInstanceOf[KeyState]
  val Enabled = "Enabled".asInstanceOf[KeyState]
  val Disabled = "Disabled".asInstanceOf[KeyState]
  val PendingDeletion = "PendingDeletion".asInstanceOf[KeyState]
  val PendingImport = "PendingImport".asInstanceOf[KeyState]
  val PendingReplicaDeletion = "PendingReplicaDeletion".asInstanceOf[KeyState]
  val Unavailable = "Unavailable".asInstanceOf[KeyState]
  val Updating = "Updating".asInstanceOf[KeyState]

  @inline def values: js.Array[KeyState] = js.Array(Creating, Enabled, Disabled, PendingDeletion, PendingImport, PendingReplicaDeletion, Unavailable, Updating)
}

@js.native
sealed trait KeyUsageType extends js.Any
object KeyUsageType {
  val SIGN_VERIFY = "SIGN_VERIFY".asInstanceOf[KeyUsageType]
  val ENCRYPT_DECRYPT = "ENCRYPT_DECRYPT".asInstanceOf[KeyUsageType]

  @inline def values: js.Array[KeyUsageType] = js.Array(SIGN_VERIFY, ENCRYPT_DECRYPT)
}

@js.native
sealed trait MessageType extends js.Any
object MessageType {
  val RAW = "RAW".asInstanceOf[MessageType]
  val DIGEST = "DIGEST".asInstanceOf[MessageType]

  @inline def values: js.Array[MessageType] = js.Array(RAW, DIGEST)
}

@js.native
sealed trait MultiRegionKeyType extends js.Any
object MultiRegionKeyType {
  val PRIMARY = "PRIMARY".asInstanceOf[MultiRegionKeyType]
  val REPLICA = "REPLICA".asInstanceOf[MultiRegionKeyType]

  @inline def values: js.Array[MultiRegionKeyType] = js.Array(PRIMARY, REPLICA)
}

@js.native
sealed trait OriginType extends js.Any
object OriginType {
  val AWS_KMS = "AWS_KMS".asInstanceOf[OriginType]
  val EXTERNAL = "EXTERNAL".asInstanceOf[OriginType]
  val AWS_CLOUDHSM = "AWS_CLOUDHSM".asInstanceOf[OriginType]

  @inline def values: js.Array[OriginType] = js.Array(AWS_KMS, EXTERNAL, AWS_CLOUDHSM)
}

@js.native
sealed trait SigningAlgorithmSpec extends js.Any
object SigningAlgorithmSpec {
  val RSASSA_PSS_SHA_256 = "RSASSA_PSS_SHA_256".asInstanceOf[SigningAlgorithmSpec]
  val RSASSA_PSS_SHA_384 = "RSASSA_PSS_SHA_384".asInstanceOf[SigningAlgorithmSpec]
  val RSASSA_PSS_SHA_512 = "RSASSA_PSS_SHA_512".asInstanceOf[SigningAlgorithmSpec]
  val RSASSA_PKCS1_V1_5_SHA_256 = "RSASSA_PKCS1_V1_5_SHA_256".asInstanceOf[SigningAlgorithmSpec]
  val RSASSA_PKCS1_V1_5_SHA_384 = "RSASSA_PKCS1_V1_5_SHA_384".asInstanceOf[SigningAlgorithmSpec]
  val RSASSA_PKCS1_V1_5_SHA_512 = "RSASSA_PKCS1_V1_5_SHA_512".asInstanceOf[SigningAlgorithmSpec]
  val ECDSA_SHA_256 = "ECDSA_SHA_256".asInstanceOf[SigningAlgorithmSpec]
  val ECDSA_SHA_384 = "ECDSA_SHA_384".asInstanceOf[SigningAlgorithmSpec]
  val ECDSA_SHA_512 = "ECDSA_SHA_512".asInstanceOf[SigningAlgorithmSpec]

  @inline def values: js.Array[SigningAlgorithmSpec] = js.Array(
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

@js.native
sealed trait WrappingKeySpec extends js.Any
object WrappingKeySpec {
  val RSA_2048 = "RSA_2048".asInstanceOf[WrappingKeySpec]

  @inline def values: js.Array[WrappingKeySpec] = js.Array(RSA_2048)
}
