package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object kms {
  type AWSAccountIdType            = String
  type AliasList                   = js.Array[AliasListEntry]
  type AliasNameType               = String
  type ArnType                     = String
  type BooleanType                 = Boolean
  type CiphertextType              = js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type CloudHsmClusterIdType       = String
  type CustomKeyStoreIdType        = String
  type CustomKeyStoreNameType      = String
  type CustomKeyStoresList         = js.Array[CustomKeyStoresListEntry]
  type DateType                    = js.Date
  type DescriptionType             = String
  type EncryptionAlgorithmSpecList = js.Array[EncryptionAlgorithmSpec]
  type EncryptionContextKey        = String
  type EncryptionContextType       = js.Dictionary[EncryptionContextValue]
  type EncryptionContextValue      = String
  type GrantIdType                 = String
  type GrantList                   = js.Array[GrantListEntry]
  type GrantNameType               = String
  type GrantOperationList          = js.Array[GrantOperation]
  type GrantTokenList              = js.Array[GrantTokenType]
  type GrantTokenType              = String
  type KeyIdType                   = String
  type KeyList                     = js.Array[KeyListEntry]
  type KeyStorePasswordType        = String
  type LimitType                   = Int
  type MarkerType                  = String
  type NumberOfBytesType           = Int
  type PendingWindowInDaysType     = Int
  type PlaintextType               = js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type PolicyNameList              = js.Array[PolicyNameType]
  type PolicyNameType              = String
  type PolicyType                  = String
  type PrincipalIdType             = String
  type PublicKeyType               = js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type SigningAlgorithmSpecList    = js.Array[SigningAlgorithmSpec]
  type TagKeyList                  = js.Array[TagKeyType]
  type TagKeyType                  = String
  type TagList                     = js.Array[Tag]
  type TagValueType                = String
  type TrustAnchorCertificateType  = String

  implicit final class KMSOps(private val service: KMS) extends AnyVal {

    @inline def cancelKeyDeletionFuture(params: CancelKeyDeletionRequest): Future[CancelKeyDeletionResponse] =
      service.cancelKeyDeletion(params).promise().toFuture
    @inline def connectCustomKeyStoreFuture(
        params: ConnectCustomKeyStoreRequest
    ): Future[ConnectCustomKeyStoreResponse] = service.connectCustomKeyStore(params).promise().toFuture
    @inline def createAliasFuture(params: CreateAliasRequest): Future[js.Object] =
      service.createAlias(params).promise().toFuture
    @inline def createCustomKeyStoreFuture(params: CreateCustomKeyStoreRequest): Future[CreateCustomKeyStoreResponse] =
      service.createCustomKeyStore(params).promise().toFuture
    @inline def createGrantFuture(params: CreateGrantRequest): Future[CreateGrantResponse] =
      service.createGrant(params).promise().toFuture
    @inline def createKeyFuture(params: CreateKeyRequest): Future[CreateKeyResponse] =
      service.createKey(params).promise().toFuture
    @inline def decryptFuture(params: DecryptRequest): Future[DecryptResponse] =
      service.decrypt(params).promise().toFuture
    @inline def deleteAliasFuture(params: DeleteAliasRequest): Future[js.Object] =
      service.deleteAlias(params).promise().toFuture
    @inline def deleteCustomKeyStoreFuture(params: DeleteCustomKeyStoreRequest): Future[DeleteCustomKeyStoreResponse] =
      service.deleteCustomKeyStore(params).promise().toFuture
    @inline def deleteImportedKeyMaterialFuture(params: DeleteImportedKeyMaterialRequest): Future[js.Object] =
      service.deleteImportedKeyMaterial(params).promise().toFuture
    @inline def describeCustomKeyStoresFuture(
        params: DescribeCustomKeyStoresRequest
    ): Future[DescribeCustomKeyStoresResponse] = service.describeCustomKeyStores(params).promise().toFuture
    @inline def describeKeyFuture(params: DescribeKeyRequest): Future[DescribeKeyResponse] =
      service.describeKey(params).promise().toFuture
    @inline def disableKeyFuture(params: DisableKeyRequest): Future[js.Object] =
      service.disableKey(params).promise().toFuture
    @inline def disableKeyRotationFuture(params: DisableKeyRotationRequest): Future[js.Object] =
      service.disableKeyRotation(params).promise().toFuture
    @inline def disconnectCustomKeyStoreFuture(
        params: DisconnectCustomKeyStoreRequest
    ): Future[DisconnectCustomKeyStoreResponse] = service.disconnectCustomKeyStore(params).promise().toFuture
    @inline def enableKeyFuture(params: EnableKeyRequest): Future[js.Object] =
      service.enableKey(params).promise().toFuture
    @inline def enableKeyRotationFuture(params: EnableKeyRotationRequest): Future[js.Object] =
      service.enableKeyRotation(params).promise().toFuture
    @inline def encryptFuture(params: EncryptRequest): Future[EncryptResponse] =
      service.encrypt(params).promise().toFuture
    @inline def generateDataKeyFuture(params: GenerateDataKeyRequest): Future[GenerateDataKeyResponse] =
      service.generateDataKey(params).promise().toFuture
    @inline def generateDataKeyPairFuture(params: GenerateDataKeyPairRequest): Future[GenerateDataKeyPairResponse] =
      service.generateDataKeyPair(params).promise().toFuture
    @inline def generateDataKeyPairWithoutPlaintextFuture(
        params: GenerateDataKeyPairWithoutPlaintextRequest
    ): Future[GenerateDataKeyPairWithoutPlaintextResponse] =
      service.generateDataKeyPairWithoutPlaintext(params).promise().toFuture
    @inline def generateDataKeyWithoutPlaintextFuture(
        params: GenerateDataKeyWithoutPlaintextRequest
    ): Future[GenerateDataKeyWithoutPlaintextResponse] =
      service.generateDataKeyWithoutPlaintext(params).promise().toFuture
    @inline def generateRandomFuture(params: GenerateRandomRequest): Future[GenerateRandomResponse] =
      service.generateRandom(params).promise().toFuture
    @inline def getKeyPolicyFuture(params: GetKeyPolicyRequest): Future[GetKeyPolicyResponse] =
      service.getKeyPolicy(params).promise().toFuture
    @inline def getKeyRotationStatusFuture(params: GetKeyRotationStatusRequest): Future[GetKeyRotationStatusResponse] =
      service.getKeyRotationStatus(params).promise().toFuture
    @inline def getParametersForImportFuture(
        params: GetParametersForImportRequest
    ): Future[GetParametersForImportResponse] = service.getParametersForImport(params).promise().toFuture
    @inline def getPublicKeyFuture(params: GetPublicKeyRequest): Future[GetPublicKeyResponse] =
      service.getPublicKey(params).promise().toFuture
    @inline def importKeyMaterialFuture(params: ImportKeyMaterialRequest): Future[ImportKeyMaterialResponse] =
      service.importKeyMaterial(params).promise().toFuture
    @inline def listAliasesFuture(params: ListAliasesRequest): Future[ListAliasesResponse] =
      service.listAliases(params).promise().toFuture
    @inline def listGrantsFuture(params: ListGrantsRequest): Future[ListGrantsResponse] =
      service.listGrants(params).promise().toFuture
    @inline def listKeyPoliciesFuture(params: ListKeyPoliciesRequest): Future[ListKeyPoliciesResponse] =
      service.listKeyPolicies(params).promise().toFuture
    @inline def listKeysFuture(params: ListKeysRequest): Future[ListKeysResponse] =
      service.listKeys(params).promise().toFuture
    @inline def listResourceTagsFuture(params: ListResourceTagsRequest): Future[ListResourceTagsResponse] =
      service.listResourceTags(params).promise().toFuture
    @inline def listRetirableGrantsFuture(params: ListRetirableGrantsRequest): Future[ListGrantsResponse] =
      service.listRetirableGrants(params).promise().toFuture
    @inline def putKeyPolicyFuture(params: PutKeyPolicyRequest): Future[js.Object] =
      service.putKeyPolicy(params).promise().toFuture
    @inline def reEncryptFuture(params: ReEncryptRequest): Future[ReEncryptResponse] =
      service.reEncrypt(params).promise().toFuture
    @inline def retireGrantFuture(params: RetireGrantRequest): Future[js.Object] =
      service.retireGrant(params).promise().toFuture
    @inline def revokeGrantFuture(params: RevokeGrantRequest): Future[js.Object] =
      service.revokeGrant(params).promise().toFuture
    @inline def scheduleKeyDeletionFuture(params: ScheduleKeyDeletionRequest): Future[ScheduleKeyDeletionResponse] =
      service.scheduleKeyDeletion(params).promise().toFuture
    @inline def signFuture(params: SignRequest): Future[SignResponse] = service.sign(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[js.Object] =
      service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[js.Object] =
      service.untagResource(params).promise().toFuture
    @inline def updateAliasFuture(params: UpdateAliasRequest): Future[js.Object] =
      service.updateAlias(params).promise().toFuture
    @inline def updateCustomKeyStoreFuture(params: UpdateCustomKeyStoreRequest): Future[UpdateCustomKeyStoreResponse] =
      service.updateCustomKeyStore(params).promise().toFuture
    @inline def updateKeyDescriptionFuture(params: UpdateKeyDescriptionRequest): Future[js.Object] =
      service.updateKeyDescription(params).promise().toFuture
    @inline def verifyFuture(params: VerifyRequest): Future[VerifyResponse] = service.verify(params).promise().toFuture
  }
}

package kms {
  @js.native
  @JSImport("aws-sdk", "KMS")
  class KMS() extends js.Object {
    def this(config: AWSConfig) = this()

    def cancelKeyDeletion(params: CancelKeyDeletionRequest): Request[CancelKeyDeletionResponse]             = js.native
    def connectCustomKeyStore(params: ConnectCustomKeyStoreRequest): Request[ConnectCustomKeyStoreResponse] = js.native
    def createAlias(params: CreateAliasRequest): Request[js.Object]                                         = js.native
    def createCustomKeyStore(params: CreateCustomKeyStoreRequest): Request[CreateCustomKeyStoreResponse]    = js.native
    def createGrant(params: CreateGrantRequest): Request[CreateGrantResponse]                               = js.native
    def createKey(params: CreateKeyRequest): Request[CreateKeyResponse]                                     = js.native
    def decrypt(params: DecryptRequest): Request[DecryptResponse]                                           = js.native
    def deleteAlias(params: DeleteAliasRequest): Request[js.Object]                                         = js.native
    def deleteCustomKeyStore(params: DeleteCustomKeyStoreRequest): Request[DeleteCustomKeyStoreResponse]    = js.native
    def deleteImportedKeyMaterial(params: DeleteImportedKeyMaterialRequest): Request[js.Object]             = js.native
    def describeCustomKeyStores(params: DescribeCustomKeyStoresRequest): Request[DescribeCustomKeyStoresResponse] =
      js.native
    def describeKey(params: DescribeKeyRequest): Request[DescribeKeyResponse]     = js.native
    def disableKey(params: DisableKeyRequest): Request[js.Object]                 = js.native
    def disableKeyRotation(params: DisableKeyRotationRequest): Request[js.Object] = js.native
    def disconnectCustomKeyStore(params: DisconnectCustomKeyStoreRequest): Request[DisconnectCustomKeyStoreResponse] =
      js.native
    def enableKey(params: EnableKeyRequest): Request[js.Object]                                       = js.native
    def enableKeyRotation(params: EnableKeyRotationRequest): Request[js.Object]                       = js.native
    def encrypt(params: EncryptRequest): Request[EncryptResponse]                                     = js.native
    def generateDataKey(params: GenerateDataKeyRequest): Request[GenerateDataKeyResponse]             = js.native
    def generateDataKeyPair(params: GenerateDataKeyPairRequest): Request[GenerateDataKeyPairResponse] = js.native
    def generateDataKeyPairWithoutPlaintext(
        params: GenerateDataKeyPairWithoutPlaintextRequest
    ): Request[GenerateDataKeyPairWithoutPlaintextResponse] = js.native
    def generateDataKeyWithoutPlaintext(
        params: GenerateDataKeyWithoutPlaintextRequest
    ): Request[GenerateDataKeyWithoutPlaintextResponse]                                                  = js.native
    def generateRandom(params: GenerateRandomRequest): Request[GenerateRandomResponse]                   = js.native
    def getKeyPolicy(params: GetKeyPolicyRequest): Request[GetKeyPolicyResponse]                         = js.native
    def getKeyRotationStatus(params: GetKeyRotationStatusRequest): Request[GetKeyRotationStatusResponse] = js.native
    def getParametersForImport(params: GetParametersForImportRequest): Request[GetParametersForImportResponse] =
      js.native
    def getPublicKey(params: GetPublicKeyRequest): Request[GetPublicKeyResponse]                         = js.native
    def importKeyMaterial(params: ImportKeyMaterialRequest): Request[ImportKeyMaterialResponse]          = js.native
    def listAliases(params: ListAliasesRequest): Request[ListAliasesResponse]                            = js.native
    def listGrants(params: ListGrantsRequest): Request[ListGrantsResponse]                               = js.native
    def listKeyPolicies(params: ListKeyPoliciesRequest): Request[ListKeyPoliciesResponse]                = js.native
    def listKeys(params: ListKeysRequest): Request[ListKeysResponse]                                     = js.native
    def listResourceTags(params: ListResourceTagsRequest): Request[ListResourceTagsResponse]             = js.native
    def listRetirableGrants(params: ListRetirableGrantsRequest): Request[ListGrantsResponse]             = js.native
    def putKeyPolicy(params: PutKeyPolicyRequest): Request[js.Object]                                    = js.native
    def reEncrypt(params: ReEncryptRequest): Request[ReEncryptResponse]                                  = js.native
    def retireGrant(params: RetireGrantRequest): Request[js.Object]                                      = js.native
    def revokeGrant(params: RevokeGrantRequest): Request[js.Object]                                      = js.native
    def scheduleKeyDeletion(params: ScheduleKeyDeletionRequest): Request[ScheduleKeyDeletionResponse]    = js.native
    def sign(params: SignRequest): Request[SignResponse]                                                 = js.native
    def tagResource(params: TagResourceRequest): Request[js.Object]                                      = js.native
    def untagResource(params: UntagResourceRequest): Request[js.Object]                                  = js.native
    def updateAlias(params: UpdateAliasRequest): Request[js.Object]                                      = js.native
    def updateCustomKeyStore(params: UpdateCustomKeyStoreRequest): Request[UpdateCustomKeyStoreResponse] = js.native
    def updateKeyDescription(params: UpdateKeyDescriptionRequest): Request[js.Object]                    = js.native
    def verify(params: VerifyRequest): Request[VerifyResponse]                                           = js.native
  }

  @js.native
  sealed trait AlgorithmSpec extends js.Any
  object AlgorithmSpec extends js.Object {
    val RSAES_PKCS1_V1_5   = "RSAES_PKCS1_V1_5".asInstanceOf[AlgorithmSpec]
    val RSAES_OAEP_SHA_1   = "RSAES_OAEP_SHA_1".asInstanceOf[AlgorithmSpec]
    val RSAES_OAEP_SHA_256 = "RSAES_OAEP_SHA_256".asInstanceOf[AlgorithmSpec]

    val values = js.Object.freeze(js.Array(RSAES_PKCS1_V1_5, RSAES_OAEP_SHA_1, RSAES_OAEP_SHA_256))
  }

  /**
    * Contains information about an alias.
    */
  @js.native
  @Factory
  trait AliasListEntry extends js.Object {
    var AliasArn: js.UndefOr[ArnType]
    var AliasName: js.UndefOr[AliasNameType]
    var TargetKeyId: js.UndefOr[KeyIdType]
  }

  @js.native
  @Factory
  trait CancelKeyDeletionRequest extends js.Object {
    var KeyId: KeyIdType
  }

  @js.native
  @Factory
  trait CancelKeyDeletionResponse extends js.Object {
    var KeyId: js.UndefOr[KeyIdType]
  }

  @js.native
  @Factory
  trait ConnectCustomKeyStoreRequest extends js.Object {
    var CustomKeyStoreId: CustomKeyStoreIdType
  }

  @js.native
  @Factory
  trait ConnectCustomKeyStoreResponse extends js.Object {}

  @js.native
  sealed trait ConnectionErrorCodeType extends js.Any
  object ConnectionErrorCodeType extends js.Object {
    val INVALID_CREDENTIALS        = "INVALID_CREDENTIALS".asInstanceOf[ConnectionErrorCodeType]
    val CLUSTER_NOT_FOUND          = "CLUSTER_NOT_FOUND".asInstanceOf[ConnectionErrorCodeType]
    val NETWORK_ERRORS             = "NETWORK_ERRORS".asInstanceOf[ConnectionErrorCodeType]
    val INTERNAL_ERROR             = "INTERNAL_ERROR".asInstanceOf[ConnectionErrorCodeType]
    val INSUFFICIENT_CLOUDHSM_HSMS = "INSUFFICIENT_CLOUDHSM_HSMS".asInstanceOf[ConnectionErrorCodeType]
    val USER_LOCKED_OUT            = "USER_LOCKED_OUT".asInstanceOf[ConnectionErrorCodeType]
    val USER_NOT_FOUND             = "USER_NOT_FOUND".asInstanceOf[ConnectionErrorCodeType]
    val USER_LOGGED_IN             = "USER_LOGGED_IN".asInstanceOf[ConnectionErrorCodeType]
    val SUBNET_NOT_FOUND           = "SUBNET_NOT_FOUND".asInstanceOf[ConnectionErrorCodeType]

    val values = js.Object.freeze(
      js.Array(
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
    )
  }

  @js.native
  sealed trait ConnectionStateType extends js.Any
  object ConnectionStateType extends js.Object {
    val CONNECTED     = "CONNECTED".asInstanceOf[ConnectionStateType]
    val CONNECTING    = "CONNECTING".asInstanceOf[ConnectionStateType]
    val FAILED        = "FAILED".asInstanceOf[ConnectionStateType]
    val DISCONNECTED  = "DISCONNECTED".asInstanceOf[ConnectionStateType]
    val DISCONNECTING = "DISCONNECTING".asInstanceOf[ConnectionStateType]

    val values = js.Object.freeze(js.Array(CONNECTED, CONNECTING, FAILED, DISCONNECTED, DISCONNECTING))
  }

  @js.native
  @Factory
  trait CreateAliasRequest extends js.Object {
    var AliasName: AliasNameType
    var TargetKeyId: KeyIdType
  }

  @js.native
  @Factory
  trait CreateCustomKeyStoreRequest extends js.Object {
    var CloudHsmClusterId: CloudHsmClusterIdType
    var CustomKeyStoreName: CustomKeyStoreNameType
    var KeyStorePassword: KeyStorePasswordType
    var TrustAnchorCertificate: TrustAnchorCertificateType
  }

  @js.native
  @Factory
  trait CreateCustomKeyStoreResponse extends js.Object {
    var CustomKeyStoreId: js.UndefOr[CustomKeyStoreIdType]
  }

  @js.native
  @Factory
  trait CreateGrantRequest extends js.Object {
    var GranteePrincipal: PrincipalIdType
    var KeyId: KeyIdType
    var Operations: GrantOperationList
    var Constraints: js.UndefOr[GrantConstraints]
    var GrantTokens: js.UndefOr[GrantTokenList]
    var Name: js.UndefOr[GrantNameType]
    var RetiringPrincipal: js.UndefOr[PrincipalIdType]
  }

  @js.native
  @Factory
  trait CreateGrantResponse extends js.Object {
    var GrantId: js.UndefOr[GrantIdType]
    var GrantToken: js.UndefOr[GrantTokenType]
  }

  @js.native
  @Factory
  trait CreateKeyRequest extends js.Object {
    var BypassPolicyLockoutSafetyCheck: js.UndefOr[BooleanType]
    var CustomKeyStoreId: js.UndefOr[CustomKeyStoreIdType]
    var CustomerMasterKeySpec: js.UndefOr[CustomerMasterKeySpec]
    var Description: js.UndefOr[DescriptionType]
    var KeyUsage: js.UndefOr[KeyUsageType]
    var Origin: js.UndefOr[OriginType]
    var Policy: js.UndefOr[PolicyType]
    var Tags: js.UndefOr[TagList]
  }

  @js.native
  @Factory
  trait CreateKeyResponse extends js.Object {
    var KeyMetadata: js.UndefOr[KeyMetadata]
  }

  /**
    * Contains information about each custom key store in the custom key store list.
    */
  @js.native
  @Factory
  trait CustomKeyStoresListEntry extends js.Object {
    var CloudHsmClusterId: js.UndefOr[CloudHsmClusterIdType]
    var ConnectionErrorCode: js.UndefOr[ConnectionErrorCodeType]
    var ConnectionState: js.UndefOr[ConnectionStateType]
    var CreationDate: js.UndefOr[DateType]
    var CustomKeyStoreId: js.UndefOr[CustomKeyStoreIdType]
    var CustomKeyStoreName: js.UndefOr[CustomKeyStoreNameType]
    var TrustAnchorCertificate: js.UndefOr[TrustAnchorCertificateType]
  }

  @js.native
  sealed trait CustomerMasterKeySpec extends js.Any
  object CustomerMasterKeySpec extends js.Object {
    val RSA_2048          = "RSA_2048".asInstanceOf[CustomerMasterKeySpec]
    val RSA_3072          = "RSA_3072".asInstanceOf[CustomerMasterKeySpec]
    val RSA_4096          = "RSA_4096".asInstanceOf[CustomerMasterKeySpec]
    val ECC_NIST_P256     = "ECC_NIST_P256".asInstanceOf[CustomerMasterKeySpec]
    val ECC_NIST_P384     = "ECC_NIST_P384".asInstanceOf[CustomerMasterKeySpec]
    val ECC_NIST_P521     = "ECC_NIST_P521".asInstanceOf[CustomerMasterKeySpec]
    val ECC_SECG_P256K1   = "ECC_SECG_P256K1".asInstanceOf[CustomerMasterKeySpec]
    val SYMMETRIC_DEFAULT = "SYMMETRIC_DEFAULT".asInstanceOf[CustomerMasterKeySpec]

    val values = js.Object.freeze(
      js.Array(
        RSA_2048,
        RSA_3072,
        RSA_4096,
        ECC_NIST_P256,
        ECC_NIST_P384,
        ECC_NIST_P521,
        ECC_SECG_P256K1,
        SYMMETRIC_DEFAULT
      )
    )
  }

  @js.native
  sealed trait DataKeyPairSpec extends js.Any
  object DataKeyPairSpec extends js.Object {
    val RSA_2048        = "RSA_2048".asInstanceOf[DataKeyPairSpec]
    val RSA_3072        = "RSA_3072".asInstanceOf[DataKeyPairSpec]
    val RSA_4096        = "RSA_4096".asInstanceOf[DataKeyPairSpec]
    val ECC_NIST_P256   = "ECC_NIST_P256".asInstanceOf[DataKeyPairSpec]
    val ECC_NIST_P384   = "ECC_NIST_P384".asInstanceOf[DataKeyPairSpec]
    val ECC_NIST_P521   = "ECC_NIST_P521".asInstanceOf[DataKeyPairSpec]
    val ECC_SECG_P256K1 = "ECC_SECG_P256K1".asInstanceOf[DataKeyPairSpec]

    val values = js.Object.freeze(
      js.Array(RSA_2048, RSA_3072, RSA_4096, ECC_NIST_P256, ECC_NIST_P384, ECC_NIST_P521, ECC_SECG_P256K1)
    )
  }

  @js.native
  sealed trait DataKeySpec extends js.Any
  object DataKeySpec extends js.Object {
    val AES_256 = "AES_256".asInstanceOf[DataKeySpec]
    val AES_128 = "AES_128".asInstanceOf[DataKeySpec]

    val values = js.Object.freeze(js.Array(AES_256, AES_128))
  }

  @js.native
  @Factory
  trait DecryptRequest extends js.Object {
    var CiphertextBlob: CiphertextType
    var EncryptionAlgorithm: js.UndefOr[EncryptionAlgorithmSpec]
    var EncryptionContext: js.UndefOr[EncryptionContextType]
    var GrantTokens: js.UndefOr[GrantTokenList]
    var KeyId: js.UndefOr[KeyIdType]
  }

  @js.native
  @Factory
  trait DecryptResponse extends js.Object {
    var EncryptionAlgorithm: js.UndefOr[EncryptionAlgorithmSpec]
    var KeyId: js.UndefOr[KeyIdType]
    var Plaintext: js.UndefOr[PlaintextType]
  }

  @js.native
  @Factory
  trait DeleteAliasRequest extends js.Object {
    var AliasName: AliasNameType
  }

  @js.native
  @Factory
  trait DeleteCustomKeyStoreRequest extends js.Object {
    var CustomKeyStoreId: CustomKeyStoreIdType
  }

  @js.native
  @Factory
  trait DeleteCustomKeyStoreResponse extends js.Object {}

  @js.native
  @Factory
  trait DeleteImportedKeyMaterialRequest extends js.Object {
    var KeyId: KeyIdType
  }

  @js.native
  @Factory
  trait DescribeCustomKeyStoresRequest extends js.Object {
    var CustomKeyStoreId: js.UndefOr[CustomKeyStoreIdType]
    var CustomKeyStoreName: js.UndefOr[CustomKeyStoreNameType]
    var Limit: js.UndefOr[LimitType]
    var Marker: js.UndefOr[MarkerType]
  }

  @js.native
  @Factory
  trait DescribeCustomKeyStoresResponse extends js.Object {
    var CustomKeyStores: js.UndefOr[CustomKeyStoresList]
    var NextMarker: js.UndefOr[MarkerType]
    var Truncated: js.UndefOr[BooleanType]
  }

  @js.native
  @Factory
  trait DescribeKeyRequest extends js.Object {
    var KeyId: KeyIdType
    var GrantTokens: js.UndefOr[GrantTokenList]
  }

  @js.native
  @Factory
  trait DescribeKeyResponse extends js.Object {
    var KeyMetadata: js.UndefOr[KeyMetadata]
  }

  @js.native
  @Factory
  trait DisableKeyRequest extends js.Object {
    var KeyId: KeyIdType
  }

  @js.native
  @Factory
  trait DisableKeyRotationRequest extends js.Object {
    var KeyId: KeyIdType
  }

  @js.native
  @Factory
  trait DisconnectCustomKeyStoreRequest extends js.Object {
    var CustomKeyStoreId: CustomKeyStoreIdType
  }

  @js.native
  @Factory
  trait DisconnectCustomKeyStoreResponse extends js.Object {}

  @js.native
  @Factory
  trait EnableKeyRequest extends js.Object {
    var KeyId: KeyIdType
  }

  @js.native
  @Factory
  trait EnableKeyRotationRequest extends js.Object {
    var KeyId: KeyIdType
  }

  @js.native
  @Factory
  trait EncryptRequest extends js.Object {
    var KeyId: KeyIdType
    var Plaintext: PlaintextType
    var EncryptionAlgorithm: js.UndefOr[EncryptionAlgorithmSpec]
    var EncryptionContext: js.UndefOr[EncryptionContextType]
    var GrantTokens: js.UndefOr[GrantTokenList]
  }

  @js.native
  @Factory
  trait EncryptResponse extends js.Object {
    var CiphertextBlob: js.UndefOr[CiphertextType]
    var EncryptionAlgorithm: js.UndefOr[EncryptionAlgorithmSpec]
    var KeyId: js.UndefOr[KeyIdType]
  }

  @js.native
  sealed trait EncryptionAlgorithmSpec extends js.Any
  object EncryptionAlgorithmSpec extends js.Object {
    val SYMMETRIC_DEFAULT  = "SYMMETRIC_DEFAULT".asInstanceOf[EncryptionAlgorithmSpec]
    val RSAES_OAEP_SHA_1   = "RSAES_OAEP_SHA_1".asInstanceOf[EncryptionAlgorithmSpec]
    val RSAES_OAEP_SHA_256 = "RSAES_OAEP_SHA_256".asInstanceOf[EncryptionAlgorithmSpec]

    val values = js.Object.freeze(js.Array(SYMMETRIC_DEFAULT, RSAES_OAEP_SHA_1, RSAES_OAEP_SHA_256))
  }

  @js.native
  sealed trait ExpirationModelType extends js.Any
  object ExpirationModelType extends js.Object {
    val KEY_MATERIAL_EXPIRES         = "KEY_MATERIAL_EXPIRES".asInstanceOf[ExpirationModelType]
    val KEY_MATERIAL_DOES_NOT_EXPIRE = "KEY_MATERIAL_DOES_NOT_EXPIRE".asInstanceOf[ExpirationModelType]

    val values = js.Object.freeze(js.Array(KEY_MATERIAL_EXPIRES, KEY_MATERIAL_DOES_NOT_EXPIRE))
  }

  @js.native
  @Factory
  trait GenerateDataKeyPairRequest extends js.Object {
    var KeyId: KeyIdType
    var KeyPairSpec: DataKeyPairSpec
    var EncryptionContext: js.UndefOr[EncryptionContextType]
    var GrantTokens: js.UndefOr[GrantTokenList]
  }

  @js.native
  @Factory
  trait GenerateDataKeyPairResponse extends js.Object {
    var KeyId: js.UndefOr[KeyIdType]
    var KeyPairSpec: js.UndefOr[DataKeyPairSpec]
    var PrivateKeyCiphertextBlob: js.UndefOr[CiphertextType]
    var PrivateKeyPlaintext: js.UndefOr[PlaintextType]
    var PublicKey: js.UndefOr[PublicKeyType]
  }

  @js.native
  @Factory
  trait GenerateDataKeyPairWithoutPlaintextRequest extends js.Object {
    var KeyId: KeyIdType
    var KeyPairSpec: DataKeyPairSpec
    var EncryptionContext: js.UndefOr[EncryptionContextType]
    var GrantTokens: js.UndefOr[GrantTokenList]
  }

  @js.native
  @Factory
  trait GenerateDataKeyPairWithoutPlaintextResponse extends js.Object {
    var KeyId: js.UndefOr[KeyIdType]
    var KeyPairSpec: js.UndefOr[DataKeyPairSpec]
    var PrivateKeyCiphertextBlob: js.UndefOr[CiphertextType]
    var PublicKey: js.UndefOr[PublicKeyType]
  }

  @js.native
  @Factory
  trait GenerateDataKeyRequest extends js.Object {
    var KeyId: KeyIdType
    var EncryptionContext: js.UndefOr[EncryptionContextType]
    var GrantTokens: js.UndefOr[GrantTokenList]
    var KeySpec: js.UndefOr[DataKeySpec]
    var NumberOfBytes: js.UndefOr[NumberOfBytesType]
  }

  @js.native
  @Factory
  trait GenerateDataKeyResponse extends js.Object {
    var CiphertextBlob: js.UndefOr[CiphertextType]
    var KeyId: js.UndefOr[KeyIdType]
    var Plaintext: js.UndefOr[PlaintextType]
  }

  @js.native
  @Factory
  trait GenerateDataKeyWithoutPlaintextRequest extends js.Object {
    var KeyId: KeyIdType
    var EncryptionContext: js.UndefOr[EncryptionContextType]
    var GrantTokens: js.UndefOr[GrantTokenList]
    var KeySpec: js.UndefOr[DataKeySpec]
    var NumberOfBytes: js.UndefOr[NumberOfBytesType]
  }

  @js.native
  @Factory
  trait GenerateDataKeyWithoutPlaintextResponse extends js.Object {
    var CiphertextBlob: js.UndefOr[CiphertextType]
    var KeyId: js.UndefOr[KeyIdType]
  }

  @js.native
  @Factory
  trait GenerateRandomRequest extends js.Object {
    var CustomKeyStoreId: js.UndefOr[CustomKeyStoreIdType]
    var NumberOfBytes: js.UndefOr[NumberOfBytesType]
  }

  @js.native
  @Factory
  trait GenerateRandomResponse extends js.Object {
    var Plaintext: js.UndefOr[PlaintextType]
  }

  @js.native
  @Factory
  trait GetKeyPolicyRequest extends js.Object {
    var KeyId: KeyIdType
    var PolicyName: PolicyNameType
  }

  @js.native
  @Factory
  trait GetKeyPolicyResponse extends js.Object {
    var Policy: js.UndefOr[PolicyType]
  }

  @js.native
  @Factory
  trait GetKeyRotationStatusRequest extends js.Object {
    var KeyId: KeyIdType
  }

  @js.native
  @Factory
  trait GetKeyRotationStatusResponse extends js.Object {
    var KeyRotationEnabled: js.UndefOr[BooleanType]
  }

  @js.native
  @Factory
  trait GetParametersForImportRequest extends js.Object {
    var KeyId: KeyIdType
    var WrappingAlgorithm: AlgorithmSpec
    var WrappingKeySpec: WrappingKeySpec
  }

  @js.native
  @Factory
  trait GetParametersForImportResponse extends js.Object {
    var ImportToken: js.UndefOr[CiphertextType]
    var KeyId: js.UndefOr[KeyIdType]
    var ParametersValidTo: js.UndefOr[DateType]
    var PublicKey: js.UndefOr[PlaintextType]
  }

  @js.native
  @Factory
  trait GetPublicKeyRequest extends js.Object {
    var KeyId: KeyIdType
    var GrantTokens: js.UndefOr[GrantTokenList]
  }

  @js.native
  @Factory
  trait GetPublicKeyResponse extends js.Object {
    var CustomerMasterKeySpec: js.UndefOr[CustomerMasterKeySpec]
    var EncryptionAlgorithms: js.UndefOr[EncryptionAlgorithmSpecList]
    var KeyId: js.UndefOr[KeyIdType]
    var KeyUsage: js.UndefOr[KeyUsageType]
    var PublicKey: js.UndefOr[PublicKeyType]
    var SigningAlgorithms: js.UndefOr[SigningAlgorithmSpecList]
  }

  /**
    * Use this structure to allow cryptographic operations in the grant only when the operation request includes the specified [[https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#encrypt_context|encryption context]].
    *  AWS KMS applies the grant constraints only when the grant allows a cryptographic operation that accepts an encryption context as input, such as the following.
    * * <a>Encrypt</a>
    *  * <a>Decrypt</a>
    *  * <a>GenerateDataKey</a>
    *  * <a>GenerateDataKeyWithoutPlaintext</a>
    *  * <a>ReEncrypt</a>
    * AWS KMS does not apply the grant constraints to other operations, such as <a>DescribeKey</a> or <a>ScheduleKeyDeletion</a>.
    *  <important> In a cryptographic operation, the encryption context in the decryption operation must be an exact, case-sensitive match for the keys and values in the encryption context of the encryption operation. Only the order of the pairs can vary.
    *  However, in a grant constraint, the key in each key-value pair is not case sensitive, but the value is case sensitive.
    *  To avoid confusion, do not use multiple encryption context pairs that differ only by case. To require a fully case-sensitive encryption context, use the <code>kms:EncryptionContext:</code> and <code>kms:EncryptionContextKeys</code> conditions in an IAM or key policy. For details, see [[https://docs.aws.amazon.com/kms/latest/developerguide/policy-conditions.html#conditions-kms-encryption-context|kms:EncryptionContext:]] in the <i> <i>AWS Key Management Service Developer Guide</i> </i>.
    *  </important>
    */
  @js.native
  @Factory
  trait GrantConstraints extends js.Object {
    var EncryptionContextEquals: js.UndefOr[EncryptionContextType]
    var EncryptionContextSubset: js.UndefOr[EncryptionContextType]
  }

  /**
    * Contains information about an entry in a list of grants.
    */
  @js.native
  @Factory
  trait GrantListEntry extends js.Object {
    var Constraints: js.UndefOr[GrantConstraints]
    var CreationDate: js.UndefOr[DateType]
    var GrantId: js.UndefOr[GrantIdType]
    var GranteePrincipal: js.UndefOr[PrincipalIdType]
    var IssuingAccount: js.UndefOr[PrincipalIdType]
    var KeyId: js.UndefOr[KeyIdType]
    var Name: js.UndefOr[GrantNameType]
    var Operations: js.UndefOr[GrantOperationList]
    var RetiringPrincipal: js.UndefOr[PrincipalIdType]
  }

  @js.native
  sealed trait GrantOperation extends js.Any
  object GrantOperation extends js.Object {
    val Decrypt                             = "Decrypt".asInstanceOf[GrantOperation]
    val Encrypt                             = "Encrypt".asInstanceOf[GrantOperation]
    val GenerateDataKey                     = "GenerateDataKey".asInstanceOf[GrantOperation]
    val GenerateDataKeyWithoutPlaintext     = "GenerateDataKeyWithoutPlaintext".asInstanceOf[GrantOperation]
    val ReEncryptFrom                       = "ReEncryptFrom".asInstanceOf[GrantOperation]
    val ReEncryptTo                         = "ReEncryptTo".asInstanceOf[GrantOperation]
    val Sign                                = "Sign".asInstanceOf[GrantOperation]
    val Verify                              = "Verify".asInstanceOf[GrantOperation]
    val GetPublicKey                        = "GetPublicKey".asInstanceOf[GrantOperation]
    val CreateGrant                         = "CreateGrant".asInstanceOf[GrantOperation]
    val RetireGrant                         = "RetireGrant".asInstanceOf[GrantOperation]
    val DescribeKey                         = "DescribeKey".asInstanceOf[GrantOperation]
    val GenerateDataKeyPair                 = "GenerateDataKeyPair".asInstanceOf[GrantOperation]
    val GenerateDataKeyPairWithoutPlaintext = "GenerateDataKeyPairWithoutPlaintext".asInstanceOf[GrantOperation]

    val values = js.Object.freeze(
      js.Array(
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
    )
  }

  @js.native
  @Factory
  trait ImportKeyMaterialRequest extends js.Object {
    var EncryptedKeyMaterial: CiphertextType
    var ImportToken: CiphertextType
    var KeyId: KeyIdType
    var ExpirationModel: js.UndefOr[ExpirationModelType]
    var ValidTo: js.UndefOr[DateType]
  }

  @js.native
  @Factory
  trait ImportKeyMaterialResponse extends js.Object {}

  /**
    * Contains information about each entry in the key list.
    */
  @js.native
  @Factory
  trait KeyListEntry extends js.Object {
    var KeyArn: js.UndefOr[ArnType]
    var KeyId: js.UndefOr[KeyIdType]
  }

  @js.native
  sealed trait KeyManagerType extends js.Any
  object KeyManagerType extends js.Object {
    val AWS      = "AWS".asInstanceOf[KeyManagerType]
    val CUSTOMER = "CUSTOMER".asInstanceOf[KeyManagerType]

    val values = js.Object.freeze(js.Array(AWS, CUSTOMER))
  }

  /**
    * Contains metadata about a customer master key (CMK).
    *  This data type is used as a response element for the <a>CreateKey</a> and <a>DescribeKey</a> operations.
    */
  @js.native
  @Factory
  trait KeyMetadata extends js.Object {
    var KeyId: KeyIdType
    var AWSAccountId: js.UndefOr[AWSAccountIdType]
    var Arn: js.UndefOr[ArnType]
    var CloudHsmClusterId: js.UndefOr[CloudHsmClusterIdType]
    var CreationDate: js.UndefOr[DateType]
    var CustomKeyStoreId: js.UndefOr[CustomKeyStoreIdType]
    var CustomerMasterKeySpec: js.UndefOr[CustomerMasterKeySpec]
    var DeletionDate: js.UndefOr[DateType]
    var Description: js.UndefOr[DescriptionType]
    var Enabled: js.UndefOr[BooleanType]
    var EncryptionAlgorithms: js.UndefOr[EncryptionAlgorithmSpecList]
    var ExpirationModel: js.UndefOr[ExpirationModelType]
    var KeyManager: js.UndefOr[KeyManagerType]
    var KeyState: js.UndefOr[KeyState]
    var KeyUsage: js.UndefOr[KeyUsageType]
    var Origin: js.UndefOr[OriginType]
    var SigningAlgorithms: js.UndefOr[SigningAlgorithmSpecList]
    var ValidTo: js.UndefOr[DateType]
  }

  @js.native
  sealed trait KeyState extends js.Any
  object KeyState extends js.Object {
    val Enabled         = "Enabled".asInstanceOf[KeyState]
    val Disabled        = "Disabled".asInstanceOf[KeyState]
    val PendingDeletion = "PendingDeletion".asInstanceOf[KeyState]
    val PendingImport   = "PendingImport".asInstanceOf[KeyState]
    val Unavailable     = "Unavailable".asInstanceOf[KeyState]

    val values = js.Object.freeze(js.Array(Enabled, Disabled, PendingDeletion, PendingImport, Unavailable))
  }

  @js.native
  sealed trait KeyUsageType extends js.Any
  object KeyUsageType extends js.Object {
    val SIGN_VERIFY     = "SIGN_VERIFY".asInstanceOf[KeyUsageType]
    val ENCRYPT_DECRYPT = "ENCRYPT_DECRYPT".asInstanceOf[KeyUsageType]

    val values = js.Object.freeze(js.Array(SIGN_VERIFY, ENCRYPT_DECRYPT))
  }

  @js.native
  @Factory
  trait ListAliasesRequest extends js.Object {
    var KeyId: js.UndefOr[KeyIdType]
    var Limit: js.UndefOr[LimitType]
    var Marker: js.UndefOr[MarkerType]
  }

  @js.native
  @Factory
  trait ListAliasesResponse extends js.Object {
    var Aliases: js.UndefOr[AliasList]
    var NextMarker: js.UndefOr[MarkerType]
    var Truncated: js.UndefOr[BooleanType]
  }

  @js.native
  @Factory
  trait ListGrantsRequest extends js.Object {
    var KeyId: KeyIdType
    var Limit: js.UndefOr[LimitType]
    var Marker: js.UndefOr[MarkerType]
  }

  @js.native
  @Factory
  trait ListGrantsResponse extends js.Object {
    var Grants: js.UndefOr[GrantList]
    var NextMarker: js.UndefOr[MarkerType]
    var Truncated: js.UndefOr[BooleanType]
  }

  @js.native
  @Factory
  trait ListKeyPoliciesRequest extends js.Object {
    var KeyId: KeyIdType
    var Limit: js.UndefOr[LimitType]
    var Marker: js.UndefOr[MarkerType]
  }

  @js.native
  @Factory
  trait ListKeyPoliciesResponse extends js.Object {
    var NextMarker: js.UndefOr[MarkerType]
    var PolicyNames: js.UndefOr[PolicyNameList]
    var Truncated: js.UndefOr[BooleanType]
  }

  @js.native
  @Factory
  trait ListKeysRequest extends js.Object {
    var Limit: js.UndefOr[LimitType]
    var Marker: js.UndefOr[MarkerType]
  }

  @js.native
  @Factory
  trait ListKeysResponse extends js.Object {
    var Keys: js.UndefOr[KeyList]
    var NextMarker: js.UndefOr[MarkerType]
    var Truncated: js.UndefOr[BooleanType]
  }

  @js.native
  @Factory
  trait ListResourceTagsRequest extends js.Object {
    var KeyId: KeyIdType
    var Limit: js.UndefOr[LimitType]
    var Marker: js.UndefOr[MarkerType]
  }

  @js.native
  @Factory
  trait ListResourceTagsResponse extends js.Object {
    var NextMarker: js.UndefOr[MarkerType]
    var Tags: js.UndefOr[TagList]
    var Truncated: js.UndefOr[BooleanType]
  }

  @js.native
  @Factory
  trait ListRetirableGrantsRequest extends js.Object {
    var RetiringPrincipal: PrincipalIdType
    var Limit: js.UndefOr[LimitType]
    var Marker: js.UndefOr[MarkerType]
  }

  @js.native
  sealed trait MessageType extends js.Any
  object MessageType extends js.Object {
    val RAW    = "RAW".asInstanceOf[MessageType]
    val DIGEST = "DIGEST".asInstanceOf[MessageType]

    val values = js.Object.freeze(js.Array(RAW, DIGEST))
  }

  @js.native
  sealed trait OriginType extends js.Any
  object OriginType extends js.Object {
    val AWS_KMS      = "AWS_KMS".asInstanceOf[OriginType]
    val EXTERNAL     = "EXTERNAL".asInstanceOf[OriginType]
    val AWS_CLOUDHSM = "AWS_CLOUDHSM".asInstanceOf[OriginType]

    val values = js.Object.freeze(js.Array(AWS_KMS, EXTERNAL, AWS_CLOUDHSM))
  }

  @js.native
  @Factory
  trait PutKeyPolicyRequest extends js.Object {
    var KeyId: KeyIdType
    var Policy: PolicyType
    var PolicyName: PolicyNameType
    var BypassPolicyLockoutSafetyCheck: js.UndefOr[BooleanType]
  }

  @js.native
  @Factory
  trait ReEncryptRequest extends js.Object {
    var CiphertextBlob: CiphertextType
    var DestinationKeyId: KeyIdType
    var DestinationEncryptionAlgorithm: js.UndefOr[EncryptionAlgorithmSpec]
    var DestinationEncryptionContext: js.UndefOr[EncryptionContextType]
    var GrantTokens: js.UndefOr[GrantTokenList]
    var SourceEncryptionAlgorithm: js.UndefOr[EncryptionAlgorithmSpec]
    var SourceEncryptionContext: js.UndefOr[EncryptionContextType]
    var SourceKeyId: js.UndefOr[KeyIdType]
  }

  @js.native
  @Factory
  trait ReEncryptResponse extends js.Object {
    var CiphertextBlob: js.UndefOr[CiphertextType]
    var DestinationEncryptionAlgorithm: js.UndefOr[EncryptionAlgorithmSpec]
    var KeyId: js.UndefOr[KeyIdType]
    var SourceEncryptionAlgorithm: js.UndefOr[EncryptionAlgorithmSpec]
    var SourceKeyId: js.UndefOr[KeyIdType]
  }

  @js.native
  @Factory
  trait RetireGrantRequest extends js.Object {
    var GrantId: js.UndefOr[GrantIdType]
    var GrantToken: js.UndefOr[GrantTokenType]
    var KeyId: js.UndefOr[KeyIdType]
  }

  @js.native
  @Factory
  trait RevokeGrantRequest extends js.Object {
    var GrantId: GrantIdType
    var KeyId: KeyIdType
  }

  @js.native
  @Factory
  trait ScheduleKeyDeletionRequest extends js.Object {
    var KeyId: KeyIdType
    var PendingWindowInDays: js.UndefOr[PendingWindowInDaysType]
  }

  @js.native
  @Factory
  trait ScheduleKeyDeletionResponse extends js.Object {
    var DeletionDate: js.UndefOr[DateType]
    var KeyId: js.UndefOr[KeyIdType]
  }

  @js.native
  @Factory
  trait SignRequest extends js.Object {
    var KeyId: KeyIdType
    var Message: PlaintextType
    var SigningAlgorithm: SigningAlgorithmSpec
    var GrantTokens: js.UndefOr[GrantTokenList]
    var MessageType: js.UndefOr[MessageType]
  }

  @js.native
  @Factory
  trait SignResponse extends js.Object {
    var KeyId: js.UndefOr[KeyIdType]
    var Signature: js.UndefOr[CiphertextType]
    var SigningAlgorithm: js.UndefOr[SigningAlgorithmSpec]
  }

  @js.native
  sealed trait SigningAlgorithmSpec extends js.Any
  object SigningAlgorithmSpec extends js.Object {
    val RSASSA_PSS_SHA_256        = "RSASSA_PSS_SHA_256".asInstanceOf[SigningAlgorithmSpec]
    val RSASSA_PSS_SHA_384        = "RSASSA_PSS_SHA_384".asInstanceOf[SigningAlgorithmSpec]
    val RSASSA_PSS_SHA_512        = "RSASSA_PSS_SHA_512".asInstanceOf[SigningAlgorithmSpec]
    val RSASSA_PKCS1_V1_5_SHA_256 = "RSASSA_PKCS1_V1_5_SHA_256".asInstanceOf[SigningAlgorithmSpec]
    val RSASSA_PKCS1_V1_5_SHA_384 = "RSASSA_PKCS1_V1_5_SHA_384".asInstanceOf[SigningAlgorithmSpec]
    val RSASSA_PKCS1_V1_5_SHA_512 = "RSASSA_PKCS1_V1_5_SHA_512".asInstanceOf[SigningAlgorithmSpec]
    val ECDSA_SHA_256             = "ECDSA_SHA_256".asInstanceOf[SigningAlgorithmSpec]
    val ECDSA_SHA_384             = "ECDSA_SHA_384".asInstanceOf[SigningAlgorithmSpec]
    val ECDSA_SHA_512             = "ECDSA_SHA_512".asInstanceOf[SigningAlgorithmSpec]

    val values = js.Object.freeze(
      js.Array(
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
    )
  }

  /**
    * A key-value pair. A tag consists of a tag key and a tag value. Tag keys and tag values are both required, but tag values can be empty (null) strings.
    *  For information about the rules that apply to tag keys and tag values, see [[https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/allocation-tag-restrictions.html|User-Defined Tag Restrictions]] in the <i>AWS Billing and Cost Management User Guide</i>.
    */
  @js.native
  @Factory
  trait Tag extends js.Object {
    var TagKey: TagKeyType
    var TagValue: TagValueType
  }

  @js.native
  @Factory
  trait TagResourceRequest extends js.Object {
    var KeyId: KeyIdType
    var Tags: TagList
  }

  @js.native
  @Factory
  trait UntagResourceRequest extends js.Object {
    var KeyId: KeyIdType
    var TagKeys: TagKeyList
  }

  @js.native
  @Factory
  trait UpdateAliasRequest extends js.Object {
    var AliasName: AliasNameType
    var TargetKeyId: KeyIdType
  }

  @js.native
  @Factory
  trait UpdateCustomKeyStoreRequest extends js.Object {
    var CustomKeyStoreId: CustomKeyStoreIdType
    var CloudHsmClusterId: js.UndefOr[CloudHsmClusterIdType]
    var KeyStorePassword: js.UndefOr[KeyStorePasswordType]
    var NewCustomKeyStoreName: js.UndefOr[CustomKeyStoreNameType]
  }

  @js.native
  @Factory
  trait UpdateCustomKeyStoreResponse extends js.Object {}

  @js.native
  @Factory
  trait UpdateKeyDescriptionRequest extends js.Object {
    var Description: DescriptionType
    var KeyId: KeyIdType
  }

  @js.native
  @Factory
  trait VerifyRequest extends js.Object {
    var KeyId: KeyIdType
    var Message: PlaintextType
    var Signature: CiphertextType
    var SigningAlgorithm: SigningAlgorithmSpec
    var GrantTokens: js.UndefOr[GrantTokenList]
    var MessageType: js.UndefOr[MessageType]
  }

  @js.native
  @Factory
  trait VerifyResponse extends js.Object {
    var KeyId: js.UndefOr[KeyIdType]
    var SignatureValid: js.UndefOr[BooleanType]
    var SigningAlgorithm: js.UndefOr[SigningAlgorithmSpec]
  }

  @js.native
  sealed trait WrappingKeySpec extends js.Any
  object WrappingKeySpec extends js.Object {
    val RSA_2048 = "RSA_2048".asInstanceOf[WrappingKeySpec]

    val values = js.Object.freeze(js.Array(RSA_2048))
  }
}
