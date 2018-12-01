package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import io.scalajs.nodejs
import facade.amazonaws._

package object kms {
  type AWSAccountIdType = String
  type AlgorithmSpec = String
  type AliasList = js.Array[AliasListEntry]
  type AliasNameType = String
  type ArnType = String
  type BooleanType = Boolean
  type CiphertextType = nodejs.buffer.Buffer | nodejs.stream.Readable | js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type CloudHsmClusterIdType = String
  type ConnectionErrorCodeType = String
  type ConnectionStateType = String
  type CustomKeyStoreIdType = String
  type CustomKeyStoreNameType = String
  type CustomKeyStoresList = js.Array[CustomKeyStoresListEntry]
  type DataKeySpec = String
  type DateType = js.Date
  type DescriptionType = String
  type EncryptionContextKey = String
  type EncryptionContextType = js.Dictionary[EncryptionContextValue]
  type EncryptionContextValue = String
  type ExpirationModelType = String
  type GrantIdType = String
  type GrantList = js.Array[GrantListEntry]
  type GrantNameType = String
  type GrantOperation = String
  type GrantOperationList = js.Array[GrantOperation]
  type GrantTokenList = js.Array[GrantTokenType]
  type GrantTokenType = String
  type KeyIdType = String
  type KeyList = js.Array[KeyListEntry]
  type KeyManagerType = String
  type KeyState = String
  type KeyStorePasswordType = String
  type KeyUsageType = String
  type LimitType = Int
  type MarkerType = String
  type NumberOfBytesType = Int
  type OriginType = String
  type PendingWindowInDaysType = Int
  type PlaintextType = nodejs.buffer.Buffer | nodejs.stream.Readable | js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type PolicyNameList = js.Array[PolicyNameType]
  type PolicyNameType = String
  type PolicyType = String
  type PrincipalIdType = String
  type TagKeyList = js.Array[TagKeyType]
  type TagKeyType = String
  type TagList = js.Array[Tag]
  type TagValueType = String
  type TrustAnchorCertificateType = String
  type WrappingKeySpec = String
}

package kms {
  @js.native
  @JSImport("aws-sdk", "KMS")
  class KMS(config: AWSConfig) extends js.Object {
    def cancelKeyDeletion(params: CancelKeyDeletionRequest): Request[CancelKeyDeletionResponse] = js.native
    def connectCustomKeyStore(params: ConnectCustomKeyStoreRequest): Request[ConnectCustomKeyStoreResponse] = js.native
    def createAlias(params: CreateAliasRequest): Request[js.Object] = js.native
    def createCustomKeyStore(params: CreateCustomKeyStoreRequest): Request[CreateCustomKeyStoreResponse] = js.native
    def createGrant(params: CreateGrantRequest): Request[CreateGrantResponse] = js.native
    def createKey(params: CreateKeyRequest): Request[CreateKeyResponse] = js.native
    def decrypt(params: DecryptRequest): Request[DecryptResponse] = js.native
    def deleteAlias(params: DeleteAliasRequest): Request[js.Object] = js.native
    def deleteCustomKeyStore(params: DeleteCustomKeyStoreRequest): Request[DeleteCustomKeyStoreResponse] = js.native
    def deleteImportedKeyMaterial(params: DeleteImportedKeyMaterialRequest): Request[js.Object] = js.native
    def describeCustomKeyStores(params: DescribeCustomKeyStoresRequest): Request[DescribeCustomKeyStoresResponse] = js.native
    def describeKey(params: DescribeKeyRequest): Request[DescribeKeyResponse] = js.native
    def disableKey(params: DisableKeyRequest): Request[js.Object] = js.native
    def disableKeyRotation(params: DisableKeyRotationRequest): Request[js.Object] = js.native
    def disconnectCustomKeyStore(params: DisconnectCustomKeyStoreRequest): Request[DisconnectCustomKeyStoreResponse] = js.native
    def enableKey(params: EnableKeyRequest): Request[js.Object] = js.native
    def enableKeyRotation(params: EnableKeyRotationRequest): Request[js.Object] = js.native
    def encrypt(params: EncryptRequest): Request[EncryptResponse] = js.native
    def generateDataKey(params: GenerateDataKeyRequest): Request[GenerateDataKeyResponse] = js.native
    def generateDataKeyWithoutPlaintext(params: GenerateDataKeyWithoutPlaintextRequest): Request[GenerateDataKeyWithoutPlaintextResponse] = js.native
    def generateRandom(params: GenerateRandomRequest): Request[GenerateRandomResponse] = js.native
    def getKeyPolicy(params: GetKeyPolicyRequest): Request[GetKeyPolicyResponse] = js.native
    def getKeyRotationStatus(params: GetKeyRotationStatusRequest): Request[GetKeyRotationStatusResponse] = js.native
    def getParametersForImport(params: GetParametersForImportRequest): Request[GetParametersForImportResponse] = js.native
    def importKeyMaterial(params: ImportKeyMaterialRequest): Request[ImportKeyMaterialResponse] = js.native
    def listAliases(params: ListAliasesRequest): Request[ListAliasesResponse] = js.native
    def listGrants(params: ListGrantsRequest): Request[ListGrantsResponse] = js.native
    def listKeyPolicies(params: ListKeyPoliciesRequest): Request[ListKeyPoliciesResponse] = js.native
    def listKeys(params: ListKeysRequest): Request[ListKeysResponse] = js.native
    def listResourceTags(params: ListResourceTagsRequest): Request[ListResourceTagsResponse] = js.native
    def listRetirableGrants(params: ListRetirableGrantsRequest): Request[ListGrantsResponse] = js.native
    def putKeyPolicy(params: PutKeyPolicyRequest): Request[js.Object] = js.native
    def reEncrypt(params: ReEncryptRequest): Request[ReEncryptResponse] = js.native
    def retireGrant(params: RetireGrantRequest): Request[js.Object] = js.native
    def revokeGrant(params: RevokeGrantRequest): Request[js.Object] = js.native
    def scheduleKeyDeletion(params: ScheduleKeyDeletionRequest): Request[ScheduleKeyDeletionResponse] = js.native
    def tagResource(params: TagResourceRequest): Request[js.Object] = js.native
    def untagResource(params: UntagResourceRequest): Request[js.Object] = js.native
    def updateAlias(params: UpdateAliasRequest): Request[js.Object] = js.native
    def updateCustomKeyStore(params: UpdateCustomKeyStoreRequest): Request[UpdateCustomKeyStoreResponse] = js.native
    def updateKeyDescription(params: UpdateKeyDescriptionRequest): Request[js.Object] = js.native
  }

  object AlgorithmSpecEnum {
    val RSAES_PKCS1_V1_5 = "RSAES_PKCS1_V1_5"
    val RSAES_OAEP_SHA_1 = "RSAES_OAEP_SHA_1"
    val RSAES_OAEP_SHA_256 = "RSAES_OAEP_SHA_256"

    val values = IndexedSeq(RSAES_PKCS1_V1_5, RSAES_OAEP_SHA_1, RSAES_OAEP_SHA_256)
  }

  /**
   * <p>Contains information about an alias.</p>
   */
  @js.native
  trait AliasListEntry extends js.Object {
    var AliasName: js.UndefOr[AliasNameType]
    var AliasArn: js.UndefOr[ArnType]
    var TargetKeyId: js.UndefOr[KeyIdType]
  }

  object AliasListEntry {
    def apply(
      AliasName: js.UndefOr[AliasNameType] = js.undefined,
      AliasArn: js.UndefOr[ArnType] = js.undefined,
      TargetKeyId: js.UndefOr[KeyIdType] = js.undefined): AliasListEntry = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AliasName" -> AliasName.map { x => x.asInstanceOf[js.Any] },
        "AliasArn" -> AliasArn.map { x => x.asInstanceOf[js.Any] },
        "TargetKeyId" -> TargetKeyId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AliasListEntry]
    }
  }

  @js.native
  trait CancelKeyDeletionRequest extends js.Object {
    var KeyId: js.UndefOr[KeyIdType]
  }

  object CancelKeyDeletionRequest {
    def apply(
      KeyId: js.UndefOr[KeyIdType] = js.undefined): CancelKeyDeletionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "KeyId" -> KeyId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CancelKeyDeletionRequest]
    }
  }

  @js.native
  trait CancelKeyDeletionResponse extends js.Object {
    var KeyId: js.UndefOr[KeyIdType]
  }

  object CancelKeyDeletionResponse {
    def apply(
      KeyId: js.UndefOr[KeyIdType] = js.undefined): CancelKeyDeletionResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "KeyId" -> KeyId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CancelKeyDeletionResponse]
    }
  }

  @js.native
  trait ConnectCustomKeyStoreRequest extends js.Object {
    var CustomKeyStoreId: js.UndefOr[CustomKeyStoreIdType]
  }

  object ConnectCustomKeyStoreRequest {
    def apply(
      CustomKeyStoreId: js.UndefOr[CustomKeyStoreIdType] = js.undefined): ConnectCustomKeyStoreRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CustomKeyStoreId" -> CustomKeyStoreId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ConnectCustomKeyStoreRequest]
    }
  }

  @js.native
  trait ConnectCustomKeyStoreResponse extends js.Object {

  }

  object ConnectCustomKeyStoreResponse {
    def apply(): ConnectCustomKeyStoreResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ConnectCustomKeyStoreResponse]
    }
  }

  object ConnectionErrorCodeTypeEnum {
    val INVALID_CREDENTIALS = "INVALID_CREDENTIALS"
    val CLUSTER_NOT_FOUND = "CLUSTER_NOT_FOUND"
    val NETWORK_ERRORS = "NETWORK_ERRORS"
    val INSUFFICIENT_CLOUDHSM_HSMS = "INSUFFICIENT_CLOUDHSM_HSMS"
    val USER_LOCKED_OUT = "USER_LOCKED_OUT"

    val values = IndexedSeq(INVALID_CREDENTIALS, CLUSTER_NOT_FOUND, NETWORK_ERRORS, INSUFFICIENT_CLOUDHSM_HSMS, USER_LOCKED_OUT)
  }

  object ConnectionStateTypeEnum {
    val CONNECTED = "CONNECTED"
    val CONNECTING = "CONNECTING"
    val FAILED = "FAILED"
    val DISCONNECTED = "DISCONNECTED"
    val DISCONNECTING = "DISCONNECTING"

    val values = IndexedSeq(CONNECTED, CONNECTING, FAILED, DISCONNECTED, DISCONNECTING)
  }

  @js.native
  trait CreateAliasRequest extends js.Object {
    var AliasName: js.UndefOr[AliasNameType]
    var TargetKeyId: js.UndefOr[KeyIdType]
  }

  object CreateAliasRequest {
    def apply(
      AliasName: js.UndefOr[AliasNameType] = js.undefined,
      TargetKeyId: js.UndefOr[KeyIdType] = js.undefined): CreateAliasRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AliasName" -> AliasName.map { x => x.asInstanceOf[js.Any] },
        "TargetKeyId" -> TargetKeyId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateAliasRequest]
    }
  }

  @js.native
  trait CreateCustomKeyStoreRequest extends js.Object {
    var CustomKeyStoreName: js.UndefOr[CustomKeyStoreNameType]
    var CloudHsmClusterId: js.UndefOr[CloudHsmClusterIdType]
    var TrustAnchorCertificate: js.UndefOr[TrustAnchorCertificateType]
    var KeyStorePassword: js.UndefOr[KeyStorePasswordType]
  }

  object CreateCustomKeyStoreRequest {
    def apply(
      CustomKeyStoreName: js.UndefOr[CustomKeyStoreNameType] = js.undefined,
      CloudHsmClusterId: js.UndefOr[CloudHsmClusterIdType] = js.undefined,
      TrustAnchorCertificate: js.UndefOr[TrustAnchorCertificateType] = js.undefined,
      KeyStorePassword: js.UndefOr[KeyStorePasswordType] = js.undefined): CreateCustomKeyStoreRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CustomKeyStoreName" -> CustomKeyStoreName.map { x => x.asInstanceOf[js.Any] },
        "CloudHsmClusterId" -> CloudHsmClusterId.map { x => x.asInstanceOf[js.Any] },
        "TrustAnchorCertificate" -> TrustAnchorCertificate.map { x => x.asInstanceOf[js.Any] },
        "KeyStorePassword" -> KeyStorePassword.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateCustomKeyStoreRequest]
    }
  }

  @js.native
  trait CreateCustomKeyStoreResponse extends js.Object {
    var CustomKeyStoreId: js.UndefOr[CustomKeyStoreIdType]
  }

  object CreateCustomKeyStoreResponse {
    def apply(
      CustomKeyStoreId: js.UndefOr[CustomKeyStoreIdType] = js.undefined): CreateCustomKeyStoreResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CustomKeyStoreId" -> CustomKeyStoreId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateCustomKeyStoreResponse]
    }
  }

  @js.native
  trait CreateGrantRequest extends js.Object {
    var Operations: js.UndefOr[GrantOperationList]
    var RetiringPrincipal: js.UndefOr[PrincipalIdType]
    var Name: js.UndefOr[GrantNameType]
    var GrantTokens: js.UndefOr[GrantTokenList]
    var Constraints: js.UndefOr[GrantConstraints]
    var KeyId: js.UndefOr[KeyIdType]
    var GranteePrincipal: js.UndefOr[PrincipalIdType]
  }

  object CreateGrantRequest {
    def apply(
      Operations: js.UndefOr[GrantOperationList] = js.undefined,
      RetiringPrincipal: js.UndefOr[PrincipalIdType] = js.undefined,
      Name: js.UndefOr[GrantNameType] = js.undefined,
      GrantTokens: js.UndefOr[GrantTokenList] = js.undefined,
      Constraints: js.UndefOr[GrantConstraints] = js.undefined,
      KeyId: js.UndefOr[KeyIdType] = js.undefined,
      GranteePrincipal: js.UndefOr[PrincipalIdType] = js.undefined): CreateGrantRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Operations" -> Operations.map { x => x.asInstanceOf[js.Any] },
        "RetiringPrincipal" -> RetiringPrincipal.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "GrantTokens" -> GrantTokens.map { x => x.asInstanceOf[js.Any] },
        "Constraints" -> Constraints.map { x => x.asInstanceOf[js.Any] },
        "KeyId" -> KeyId.map { x => x.asInstanceOf[js.Any] },
        "GranteePrincipal" -> GranteePrincipal.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateGrantRequest]
    }
  }

  @js.native
  trait CreateGrantResponse extends js.Object {
    var GrantToken: js.UndefOr[GrantTokenType]
    var GrantId: js.UndefOr[GrantIdType]
  }

  object CreateGrantResponse {
    def apply(
      GrantToken: js.UndefOr[GrantTokenType] = js.undefined,
      GrantId: js.UndefOr[GrantIdType] = js.undefined): CreateGrantResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GrantToken" -> GrantToken.map { x => x.asInstanceOf[js.Any] },
        "GrantId" -> GrantId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateGrantResponse]
    }
  }

  @js.native
  trait CreateKeyRequest extends js.Object {
    var KeyUsage: js.UndefOr[KeyUsageType]
    var CustomKeyStoreId: js.UndefOr[CustomKeyStoreIdType]
    var Origin: js.UndefOr[OriginType]
    var Description: js.UndefOr[DescriptionType]
    var Policy: js.UndefOr[PolicyType]
    var BypassPolicyLockoutSafetyCheck: js.UndefOr[BooleanType]
    var Tags: js.UndefOr[TagList]
  }

  object CreateKeyRequest {
    def apply(
      KeyUsage: js.UndefOr[KeyUsageType] = js.undefined,
      CustomKeyStoreId: js.UndefOr[CustomKeyStoreIdType] = js.undefined,
      Origin: js.UndefOr[OriginType] = js.undefined,
      Description: js.UndefOr[DescriptionType] = js.undefined,
      Policy: js.UndefOr[PolicyType] = js.undefined,
      BypassPolicyLockoutSafetyCheck: js.UndefOr[BooleanType] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined): CreateKeyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "KeyUsage" -> KeyUsage.map { x => x.asInstanceOf[js.Any] },
        "CustomKeyStoreId" -> CustomKeyStoreId.map { x => x.asInstanceOf[js.Any] },
        "Origin" -> Origin.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "Policy" -> Policy.map { x => x.asInstanceOf[js.Any] },
        "BypassPolicyLockoutSafetyCheck" -> BypassPolicyLockoutSafetyCheck.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateKeyRequest]
    }
  }

  @js.native
  trait CreateKeyResponse extends js.Object {
    var KeyMetadata: js.UndefOr[KeyMetadata]
  }

  object CreateKeyResponse {
    def apply(
      KeyMetadata: js.UndefOr[KeyMetadata] = js.undefined): CreateKeyResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "KeyMetadata" -> KeyMetadata.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateKeyResponse]
    }
  }

  /**
   * <p>Contains information about each custom key store in the custom key store list.</p>
   */
  @js.native
  trait CustomKeyStoresListEntry extends js.Object {
    var CreationDate: js.UndefOr[DateType]
    var CustomKeyStoreId: js.UndefOr[CustomKeyStoreIdType]
    var CustomKeyStoreName: js.UndefOr[CustomKeyStoreNameType]
    var CloudHsmClusterId: js.UndefOr[CloudHsmClusterIdType]
    var TrustAnchorCertificate: js.UndefOr[TrustAnchorCertificateType]
    var ConnectionState: js.UndefOr[ConnectionStateType]
    var ConnectionErrorCode: js.UndefOr[ConnectionErrorCodeType]
  }

  object CustomKeyStoresListEntry {
    def apply(
      CreationDate: js.UndefOr[DateType] = js.undefined,
      CustomKeyStoreId: js.UndefOr[CustomKeyStoreIdType] = js.undefined,
      CustomKeyStoreName: js.UndefOr[CustomKeyStoreNameType] = js.undefined,
      CloudHsmClusterId: js.UndefOr[CloudHsmClusterIdType] = js.undefined,
      TrustAnchorCertificate: js.UndefOr[TrustAnchorCertificateType] = js.undefined,
      ConnectionState: js.UndefOr[ConnectionStateType] = js.undefined,
      ConnectionErrorCode: js.UndefOr[ConnectionErrorCodeType] = js.undefined): CustomKeyStoresListEntry = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CreationDate" -> CreationDate.map { x => x.asInstanceOf[js.Any] },
        "CustomKeyStoreId" -> CustomKeyStoreId.map { x => x.asInstanceOf[js.Any] },
        "CustomKeyStoreName" -> CustomKeyStoreName.map { x => x.asInstanceOf[js.Any] },
        "CloudHsmClusterId" -> CloudHsmClusterId.map { x => x.asInstanceOf[js.Any] },
        "TrustAnchorCertificate" -> TrustAnchorCertificate.map { x => x.asInstanceOf[js.Any] },
        "ConnectionState" -> ConnectionState.map { x => x.asInstanceOf[js.Any] },
        "ConnectionErrorCode" -> ConnectionErrorCode.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CustomKeyStoresListEntry]
    }
  }

  object DataKeySpecEnum {
    val AES_256 = "AES_256"
    val AES_128 = "AES_128"

    val values = IndexedSeq(AES_256, AES_128)
  }

  @js.native
  trait DecryptRequest extends js.Object {
    var CiphertextBlob: js.UndefOr[CiphertextType]
    var EncryptionContext: js.UndefOr[EncryptionContextType]
    var GrantTokens: js.UndefOr[GrantTokenList]
  }

  object DecryptRequest {
    def apply(
      CiphertextBlob: js.UndefOr[CiphertextType] = js.undefined,
      EncryptionContext: js.UndefOr[EncryptionContextType] = js.undefined,
      GrantTokens: js.UndefOr[GrantTokenList] = js.undefined): DecryptRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CiphertextBlob" -> CiphertextBlob.map { x => x.asInstanceOf[js.Any] },
        "EncryptionContext" -> EncryptionContext.map { x => x.asInstanceOf[js.Any] },
        "GrantTokens" -> GrantTokens.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DecryptRequest]
    }
  }

  @js.native
  trait DecryptResponse extends js.Object {
    var KeyId: js.UndefOr[KeyIdType]
    var Plaintext: js.UndefOr[PlaintextType]
  }

  object DecryptResponse {
    def apply(
      KeyId: js.UndefOr[KeyIdType] = js.undefined,
      Plaintext: js.UndefOr[PlaintextType] = js.undefined): DecryptResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "KeyId" -> KeyId.map { x => x.asInstanceOf[js.Any] },
        "Plaintext" -> Plaintext.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DecryptResponse]
    }
  }

  @js.native
  trait DeleteAliasRequest extends js.Object {
    var AliasName: js.UndefOr[AliasNameType]
  }

  object DeleteAliasRequest {
    def apply(
      AliasName: js.UndefOr[AliasNameType] = js.undefined): DeleteAliasRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AliasName" -> AliasName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteAliasRequest]
    }
  }

  @js.native
  trait DeleteCustomKeyStoreRequest extends js.Object {
    var CustomKeyStoreId: js.UndefOr[CustomKeyStoreIdType]
  }

  object DeleteCustomKeyStoreRequest {
    def apply(
      CustomKeyStoreId: js.UndefOr[CustomKeyStoreIdType] = js.undefined): DeleteCustomKeyStoreRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CustomKeyStoreId" -> CustomKeyStoreId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteCustomKeyStoreRequest]
    }
  }

  @js.native
  trait DeleteCustomKeyStoreResponse extends js.Object {

  }

  object DeleteCustomKeyStoreResponse {
    def apply(): DeleteCustomKeyStoreResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteCustomKeyStoreResponse]
    }
  }

  @js.native
  trait DeleteImportedKeyMaterialRequest extends js.Object {
    var KeyId: js.UndefOr[KeyIdType]
  }

  object DeleteImportedKeyMaterialRequest {
    def apply(
      KeyId: js.UndefOr[KeyIdType] = js.undefined): DeleteImportedKeyMaterialRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "KeyId" -> KeyId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteImportedKeyMaterialRequest]
    }
  }

  @js.native
  trait DescribeCustomKeyStoresRequest extends js.Object {
    var CustomKeyStoreId: js.UndefOr[CustomKeyStoreIdType]
    var CustomKeyStoreName: js.UndefOr[CustomKeyStoreNameType]
    var Limit: js.UndefOr[LimitType]
    var Marker: js.UndefOr[MarkerType]
  }

  object DescribeCustomKeyStoresRequest {
    def apply(
      CustomKeyStoreId: js.UndefOr[CustomKeyStoreIdType] = js.undefined,
      CustomKeyStoreName: js.UndefOr[CustomKeyStoreNameType] = js.undefined,
      Limit: js.UndefOr[LimitType] = js.undefined,
      Marker: js.UndefOr[MarkerType] = js.undefined): DescribeCustomKeyStoresRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CustomKeyStoreId" -> CustomKeyStoreId.map { x => x.asInstanceOf[js.Any] },
        "CustomKeyStoreName" -> CustomKeyStoreName.map { x => x.asInstanceOf[js.Any] },
        "Limit" -> Limit.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeCustomKeyStoresRequest]
    }
  }

  @js.native
  trait DescribeCustomKeyStoresResponse extends js.Object {
    var CustomKeyStores: js.UndefOr[CustomKeyStoresList]
    var NextMarker: js.UndefOr[MarkerType]
    var Truncated: js.UndefOr[BooleanType]
  }

  object DescribeCustomKeyStoresResponse {
    def apply(
      CustomKeyStores: js.UndefOr[CustomKeyStoresList] = js.undefined,
      NextMarker: js.UndefOr[MarkerType] = js.undefined,
      Truncated: js.UndefOr[BooleanType] = js.undefined): DescribeCustomKeyStoresResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CustomKeyStores" -> CustomKeyStores.map { x => x.asInstanceOf[js.Any] },
        "NextMarker" -> NextMarker.map { x => x.asInstanceOf[js.Any] },
        "Truncated" -> Truncated.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeCustomKeyStoresResponse]
    }
  }

  @js.native
  trait DescribeKeyRequest extends js.Object {
    var KeyId: js.UndefOr[KeyIdType]
    var GrantTokens: js.UndefOr[GrantTokenList]
  }

  object DescribeKeyRequest {
    def apply(
      KeyId: js.UndefOr[KeyIdType] = js.undefined,
      GrantTokens: js.UndefOr[GrantTokenList] = js.undefined): DescribeKeyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "KeyId" -> KeyId.map { x => x.asInstanceOf[js.Any] },
        "GrantTokens" -> GrantTokens.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeKeyRequest]
    }
  }

  @js.native
  trait DescribeKeyResponse extends js.Object {
    var KeyMetadata: js.UndefOr[KeyMetadata]
  }

  object DescribeKeyResponse {
    def apply(
      KeyMetadata: js.UndefOr[KeyMetadata] = js.undefined): DescribeKeyResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "KeyMetadata" -> KeyMetadata.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeKeyResponse]
    }
  }

  @js.native
  trait DisableKeyRequest extends js.Object {
    var KeyId: js.UndefOr[KeyIdType]
  }

  object DisableKeyRequest {
    def apply(
      KeyId: js.UndefOr[KeyIdType] = js.undefined): DisableKeyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "KeyId" -> KeyId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DisableKeyRequest]
    }
  }

  @js.native
  trait DisableKeyRotationRequest extends js.Object {
    var KeyId: js.UndefOr[KeyIdType]
  }

  object DisableKeyRotationRequest {
    def apply(
      KeyId: js.UndefOr[KeyIdType] = js.undefined): DisableKeyRotationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "KeyId" -> KeyId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DisableKeyRotationRequest]
    }
  }

  @js.native
  trait DisconnectCustomKeyStoreRequest extends js.Object {
    var CustomKeyStoreId: js.UndefOr[CustomKeyStoreIdType]
  }

  object DisconnectCustomKeyStoreRequest {
    def apply(
      CustomKeyStoreId: js.UndefOr[CustomKeyStoreIdType] = js.undefined): DisconnectCustomKeyStoreRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CustomKeyStoreId" -> CustomKeyStoreId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DisconnectCustomKeyStoreRequest]
    }
  }

  @js.native
  trait DisconnectCustomKeyStoreResponse extends js.Object {

  }

  object DisconnectCustomKeyStoreResponse {
    def apply(): DisconnectCustomKeyStoreResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DisconnectCustomKeyStoreResponse]
    }
  }

  @js.native
  trait EnableKeyRequest extends js.Object {
    var KeyId: js.UndefOr[KeyIdType]
  }

  object EnableKeyRequest {
    def apply(
      KeyId: js.UndefOr[KeyIdType] = js.undefined): EnableKeyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "KeyId" -> KeyId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EnableKeyRequest]
    }
  }

  @js.native
  trait EnableKeyRotationRequest extends js.Object {
    var KeyId: js.UndefOr[KeyIdType]
  }

  object EnableKeyRotationRequest {
    def apply(
      KeyId: js.UndefOr[KeyIdType] = js.undefined): EnableKeyRotationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "KeyId" -> KeyId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EnableKeyRotationRequest]
    }
  }

  @js.native
  trait EncryptRequest extends js.Object {
    var KeyId: js.UndefOr[KeyIdType]
    var Plaintext: js.UndefOr[PlaintextType]
    var EncryptionContext: js.UndefOr[EncryptionContextType]
    var GrantTokens: js.UndefOr[GrantTokenList]
  }

  object EncryptRequest {
    def apply(
      KeyId: js.UndefOr[KeyIdType] = js.undefined,
      Plaintext: js.UndefOr[PlaintextType] = js.undefined,
      EncryptionContext: js.UndefOr[EncryptionContextType] = js.undefined,
      GrantTokens: js.UndefOr[GrantTokenList] = js.undefined): EncryptRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "KeyId" -> KeyId.map { x => x.asInstanceOf[js.Any] },
        "Plaintext" -> Plaintext.map { x => x.asInstanceOf[js.Any] },
        "EncryptionContext" -> EncryptionContext.map { x => x.asInstanceOf[js.Any] },
        "GrantTokens" -> GrantTokens.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EncryptRequest]
    }
  }

  @js.native
  trait EncryptResponse extends js.Object {
    var CiphertextBlob: js.UndefOr[CiphertextType]
    var KeyId: js.UndefOr[KeyIdType]
  }

  object EncryptResponse {
    def apply(
      CiphertextBlob: js.UndefOr[CiphertextType] = js.undefined,
      KeyId: js.UndefOr[KeyIdType] = js.undefined): EncryptResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CiphertextBlob" -> CiphertextBlob.map { x => x.asInstanceOf[js.Any] },
        "KeyId" -> KeyId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EncryptResponse]
    }
  }

  object ExpirationModelTypeEnum {
    val KEY_MATERIAL_EXPIRES = "KEY_MATERIAL_EXPIRES"
    val KEY_MATERIAL_DOES_NOT_EXPIRE = "KEY_MATERIAL_DOES_NOT_EXPIRE"

    val values = IndexedSeq(KEY_MATERIAL_EXPIRES, KEY_MATERIAL_DOES_NOT_EXPIRE)
  }

  @js.native
  trait GenerateDataKeyRequest extends js.Object {
    var NumberOfBytes: js.UndefOr[NumberOfBytesType]
    var GrantTokens: js.UndefOr[GrantTokenList]
    var KeySpec: js.UndefOr[DataKeySpec]
    var EncryptionContext: js.UndefOr[EncryptionContextType]
    var KeyId: js.UndefOr[KeyIdType]
  }

  object GenerateDataKeyRequest {
    def apply(
      NumberOfBytes: js.UndefOr[NumberOfBytesType] = js.undefined,
      GrantTokens: js.UndefOr[GrantTokenList] = js.undefined,
      KeySpec: js.UndefOr[DataKeySpec] = js.undefined,
      EncryptionContext: js.UndefOr[EncryptionContextType] = js.undefined,
      KeyId: js.UndefOr[KeyIdType] = js.undefined): GenerateDataKeyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NumberOfBytes" -> NumberOfBytes.map { x => x.asInstanceOf[js.Any] },
        "GrantTokens" -> GrantTokens.map { x => x.asInstanceOf[js.Any] },
        "KeySpec" -> KeySpec.map { x => x.asInstanceOf[js.Any] },
        "EncryptionContext" -> EncryptionContext.map { x => x.asInstanceOf[js.Any] },
        "KeyId" -> KeyId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GenerateDataKeyRequest]
    }
  }

  @js.native
  trait GenerateDataKeyResponse extends js.Object {
    var CiphertextBlob: js.UndefOr[CiphertextType]
    var Plaintext: js.UndefOr[PlaintextType]
    var KeyId: js.UndefOr[KeyIdType]
  }

  object GenerateDataKeyResponse {
    def apply(
      CiphertextBlob: js.UndefOr[CiphertextType] = js.undefined,
      Plaintext: js.UndefOr[PlaintextType] = js.undefined,
      KeyId: js.UndefOr[KeyIdType] = js.undefined): GenerateDataKeyResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CiphertextBlob" -> CiphertextBlob.map { x => x.asInstanceOf[js.Any] },
        "Plaintext" -> Plaintext.map { x => x.asInstanceOf[js.Any] },
        "KeyId" -> KeyId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GenerateDataKeyResponse]
    }
  }

  @js.native
  trait GenerateDataKeyWithoutPlaintextRequest extends js.Object {
    var NumberOfBytes: js.UndefOr[NumberOfBytesType]
    var GrantTokens: js.UndefOr[GrantTokenList]
    var KeySpec: js.UndefOr[DataKeySpec]
    var EncryptionContext: js.UndefOr[EncryptionContextType]
    var KeyId: js.UndefOr[KeyIdType]
  }

  object GenerateDataKeyWithoutPlaintextRequest {
    def apply(
      NumberOfBytes: js.UndefOr[NumberOfBytesType] = js.undefined,
      GrantTokens: js.UndefOr[GrantTokenList] = js.undefined,
      KeySpec: js.UndefOr[DataKeySpec] = js.undefined,
      EncryptionContext: js.UndefOr[EncryptionContextType] = js.undefined,
      KeyId: js.UndefOr[KeyIdType] = js.undefined): GenerateDataKeyWithoutPlaintextRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NumberOfBytes" -> NumberOfBytes.map { x => x.asInstanceOf[js.Any] },
        "GrantTokens" -> GrantTokens.map { x => x.asInstanceOf[js.Any] },
        "KeySpec" -> KeySpec.map { x => x.asInstanceOf[js.Any] },
        "EncryptionContext" -> EncryptionContext.map { x => x.asInstanceOf[js.Any] },
        "KeyId" -> KeyId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GenerateDataKeyWithoutPlaintextRequest]
    }
  }

  @js.native
  trait GenerateDataKeyWithoutPlaintextResponse extends js.Object {
    var CiphertextBlob: js.UndefOr[CiphertextType]
    var KeyId: js.UndefOr[KeyIdType]
  }

  object GenerateDataKeyWithoutPlaintextResponse {
    def apply(
      CiphertextBlob: js.UndefOr[CiphertextType] = js.undefined,
      KeyId: js.UndefOr[KeyIdType] = js.undefined): GenerateDataKeyWithoutPlaintextResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CiphertextBlob" -> CiphertextBlob.map { x => x.asInstanceOf[js.Any] },
        "KeyId" -> KeyId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GenerateDataKeyWithoutPlaintextResponse]
    }
  }

  @js.native
  trait GenerateRandomRequest extends js.Object {
    var NumberOfBytes: js.UndefOr[NumberOfBytesType]
    var CustomKeyStoreId: js.UndefOr[CustomKeyStoreIdType]
  }

  object GenerateRandomRequest {
    def apply(
      NumberOfBytes: js.UndefOr[NumberOfBytesType] = js.undefined,
      CustomKeyStoreId: js.UndefOr[CustomKeyStoreIdType] = js.undefined): GenerateRandomRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NumberOfBytes" -> NumberOfBytes.map { x => x.asInstanceOf[js.Any] },
        "CustomKeyStoreId" -> CustomKeyStoreId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GenerateRandomRequest]
    }
  }

  @js.native
  trait GenerateRandomResponse extends js.Object {
    var Plaintext: js.UndefOr[PlaintextType]
  }

  object GenerateRandomResponse {
    def apply(
      Plaintext: js.UndefOr[PlaintextType] = js.undefined): GenerateRandomResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Plaintext" -> Plaintext.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GenerateRandomResponse]
    }
  }

  @js.native
  trait GetKeyPolicyRequest extends js.Object {
    var KeyId: js.UndefOr[KeyIdType]
    var PolicyName: js.UndefOr[PolicyNameType]
  }

  object GetKeyPolicyRequest {
    def apply(
      KeyId: js.UndefOr[KeyIdType] = js.undefined,
      PolicyName: js.UndefOr[PolicyNameType] = js.undefined): GetKeyPolicyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "KeyId" -> KeyId.map { x => x.asInstanceOf[js.Any] },
        "PolicyName" -> PolicyName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetKeyPolicyRequest]
    }
  }

  @js.native
  trait GetKeyPolicyResponse extends js.Object {
    var Policy: js.UndefOr[PolicyType]
  }

  object GetKeyPolicyResponse {
    def apply(
      Policy: js.UndefOr[PolicyType] = js.undefined): GetKeyPolicyResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Policy" -> Policy.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetKeyPolicyResponse]
    }
  }

  @js.native
  trait GetKeyRotationStatusRequest extends js.Object {
    var KeyId: js.UndefOr[KeyIdType]
  }

  object GetKeyRotationStatusRequest {
    def apply(
      KeyId: js.UndefOr[KeyIdType] = js.undefined): GetKeyRotationStatusRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "KeyId" -> KeyId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetKeyRotationStatusRequest]
    }
  }

  @js.native
  trait GetKeyRotationStatusResponse extends js.Object {
    var KeyRotationEnabled: js.UndefOr[BooleanType]
  }

  object GetKeyRotationStatusResponse {
    def apply(
      KeyRotationEnabled: js.UndefOr[BooleanType] = js.undefined): GetKeyRotationStatusResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "KeyRotationEnabled" -> KeyRotationEnabled.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetKeyRotationStatusResponse]
    }
  }

  @js.native
  trait GetParametersForImportRequest extends js.Object {
    var KeyId: js.UndefOr[KeyIdType]
    var WrappingAlgorithm: js.UndefOr[AlgorithmSpec]
    var WrappingKeySpec: js.UndefOr[WrappingKeySpec]
  }

  object GetParametersForImportRequest {
    def apply(
      KeyId: js.UndefOr[KeyIdType] = js.undefined,
      WrappingAlgorithm: js.UndefOr[AlgorithmSpec] = js.undefined,
      WrappingKeySpec: js.UndefOr[WrappingKeySpec] = js.undefined): GetParametersForImportRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "KeyId" -> KeyId.map { x => x.asInstanceOf[js.Any] },
        "WrappingAlgorithm" -> WrappingAlgorithm.map { x => x.asInstanceOf[js.Any] },
        "WrappingKeySpec" -> WrappingKeySpec.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetParametersForImportRequest]
    }
  }

  @js.native
  trait GetParametersForImportResponse extends js.Object {
    var KeyId: js.UndefOr[KeyIdType]
    var ImportToken: js.UndefOr[CiphertextType]
    var PublicKey: js.UndefOr[PlaintextType]
    var ParametersValidTo: js.UndefOr[DateType]
  }

  object GetParametersForImportResponse {
    def apply(
      KeyId: js.UndefOr[KeyIdType] = js.undefined,
      ImportToken: js.UndefOr[CiphertextType] = js.undefined,
      PublicKey: js.UndefOr[PlaintextType] = js.undefined,
      ParametersValidTo: js.UndefOr[DateType] = js.undefined): GetParametersForImportResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "KeyId" -> KeyId.map { x => x.asInstanceOf[js.Any] },
        "ImportToken" -> ImportToken.map { x => x.asInstanceOf[js.Any] },
        "PublicKey" -> PublicKey.map { x => x.asInstanceOf[js.Any] },
        "ParametersValidTo" -> ParametersValidTo.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetParametersForImportResponse]
    }
  }

  /**
   * <p>A structure that you can use to allow certain operations in the grant only when the desired encryption context is present. For more information about encryption context, see <a href="http://docs.aws.amazon.com/kms/latest/developerguide/encryption-context.html">Encryption Context</a> in the <i>AWS Key Management Service Developer Guide</i>.</p> <p>Grant constraints apply only to operations that accept encryption context as input. For example, the <code> <a>DescribeKey</a> </code> operation does not accept encryption context as input. A grant that allows the <code>DescribeKey</code> operation does so regardless of the grant constraints. In constrast, the <code> <a>Encrypt</a> </code> operation accepts encryption context as input. A grant that allows the <code>Encrypt</code> operation does so only when the encryption context of the <code>Encrypt</code> operation satisfies the grant constraints.</p>
   */
  @js.native
  trait GrantConstraints extends js.Object {
    var EncryptionContextSubset: js.UndefOr[EncryptionContextType]
    var EncryptionContextEquals: js.UndefOr[EncryptionContextType]
  }

  object GrantConstraints {
    def apply(
      EncryptionContextSubset: js.UndefOr[EncryptionContextType] = js.undefined,
      EncryptionContextEquals: js.UndefOr[EncryptionContextType] = js.undefined): GrantConstraints = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EncryptionContextSubset" -> EncryptionContextSubset.map { x => x.asInstanceOf[js.Any] },
        "EncryptionContextEquals" -> EncryptionContextEquals.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GrantConstraints]
    }
  }

  /**
   * <p>Contains information about an entry in a list of grants.</p>
   */
  @js.native
  trait GrantListEntry extends js.Object {
    var CreationDate: js.UndefOr[DateType]
    var Operations: js.UndefOr[GrantOperationList]
    var RetiringPrincipal: js.UndefOr[PrincipalIdType]
    var Name: js.UndefOr[GrantNameType]
    var Constraints: js.UndefOr[GrantConstraints]
    var GrantId: js.UndefOr[GrantIdType]
    var KeyId: js.UndefOr[KeyIdType]
    var GranteePrincipal: js.UndefOr[PrincipalIdType]
    var IssuingAccount: js.UndefOr[PrincipalIdType]
  }

  object GrantListEntry {
    def apply(
      CreationDate: js.UndefOr[DateType] = js.undefined,
      Operations: js.UndefOr[GrantOperationList] = js.undefined,
      RetiringPrincipal: js.UndefOr[PrincipalIdType] = js.undefined,
      Name: js.UndefOr[GrantNameType] = js.undefined,
      Constraints: js.UndefOr[GrantConstraints] = js.undefined,
      GrantId: js.UndefOr[GrantIdType] = js.undefined,
      KeyId: js.UndefOr[KeyIdType] = js.undefined,
      GranteePrincipal: js.UndefOr[PrincipalIdType] = js.undefined,
      IssuingAccount: js.UndefOr[PrincipalIdType] = js.undefined): GrantListEntry = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CreationDate" -> CreationDate.map { x => x.asInstanceOf[js.Any] },
        "Operations" -> Operations.map { x => x.asInstanceOf[js.Any] },
        "RetiringPrincipal" -> RetiringPrincipal.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "Constraints" -> Constraints.map { x => x.asInstanceOf[js.Any] },
        "GrantId" -> GrantId.map { x => x.asInstanceOf[js.Any] },
        "KeyId" -> KeyId.map { x => x.asInstanceOf[js.Any] },
        "GranteePrincipal" -> GranteePrincipal.map { x => x.asInstanceOf[js.Any] },
        "IssuingAccount" -> IssuingAccount.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GrantListEntry]
    }
  }

  object GrantOperationEnum {
    val Decrypt = "Decrypt"
    val Encrypt = "Encrypt"
    val GenerateDataKey = "GenerateDataKey"
    val GenerateDataKeyWithoutPlaintext = "GenerateDataKeyWithoutPlaintext"
    val ReEncryptFrom = "ReEncryptFrom"
    val ReEncryptTo = "ReEncryptTo"
    val CreateGrant = "CreateGrant"
    val RetireGrant = "RetireGrant"
    val DescribeKey = "DescribeKey"

    val values = IndexedSeq(Decrypt, Encrypt, GenerateDataKey, GenerateDataKeyWithoutPlaintext, ReEncryptFrom, ReEncryptTo, CreateGrant, RetireGrant, DescribeKey)
  }

  @js.native
  trait ImportKeyMaterialRequest extends js.Object {
    var ExpirationModel: js.UndefOr[ExpirationModelType]
    var EncryptedKeyMaterial: js.UndefOr[CiphertextType]
    var ImportToken: js.UndefOr[CiphertextType]
    var KeyId: js.UndefOr[KeyIdType]
    var ValidTo: js.UndefOr[DateType]
  }

  object ImportKeyMaterialRequest {
    def apply(
      ExpirationModel: js.UndefOr[ExpirationModelType] = js.undefined,
      EncryptedKeyMaterial: js.UndefOr[CiphertextType] = js.undefined,
      ImportToken: js.UndefOr[CiphertextType] = js.undefined,
      KeyId: js.UndefOr[KeyIdType] = js.undefined,
      ValidTo: js.UndefOr[DateType] = js.undefined): ImportKeyMaterialRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ExpirationModel" -> ExpirationModel.map { x => x.asInstanceOf[js.Any] },
        "EncryptedKeyMaterial" -> EncryptedKeyMaterial.map { x => x.asInstanceOf[js.Any] },
        "ImportToken" -> ImportToken.map { x => x.asInstanceOf[js.Any] },
        "KeyId" -> KeyId.map { x => x.asInstanceOf[js.Any] },
        "ValidTo" -> ValidTo.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ImportKeyMaterialRequest]
    }
  }

  @js.native
  trait ImportKeyMaterialResponse extends js.Object {

  }

  object ImportKeyMaterialResponse {
    def apply(): ImportKeyMaterialResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ImportKeyMaterialResponse]
    }
  }

  /**
   * <p>Contains information about each entry in the key list.</p>
   */
  @js.native
  trait KeyListEntry extends js.Object {
    var KeyId: js.UndefOr[KeyIdType]
    var KeyArn: js.UndefOr[ArnType]
  }

  object KeyListEntry {
    def apply(
      KeyId: js.UndefOr[KeyIdType] = js.undefined,
      KeyArn: js.UndefOr[ArnType] = js.undefined): KeyListEntry = {
      val _fields = IndexedSeq[(String, js.Any)](
        "KeyId" -> KeyId.map { x => x.asInstanceOf[js.Any] },
        "KeyArn" -> KeyArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[KeyListEntry]
    }
  }

  object KeyManagerTypeEnum {
    val AWS = "AWS"
    val CUSTOMER = "CUSTOMER"

    val values = IndexedSeq(AWS, CUSTOMER)
  }

  /**
   * <p>Contains metadata about a customer master key (CMK).</p> <p>This data type is used as a response element for the <a>CreateKey</a> and <a>DescribeKey</a> operations.</p>
   */
  @js.native
  trait KeyMetadata extends js.Object {
    var CreationDate: js.UndefOr[DateType]
    var ExpirationModel: js.UndefOr[ExpirationModelType]
    var KeyUsage: js.UndefOr[KeyUsageType]
    var Enabled: js.UndefOr[BooleanType]
    var CustomKeyStoreId: js.UndefOr[CustomKeyStoreIdType]
    var Origin: js.UndefOr[OriginType]
    var Description: js.UndefOr[DescriptionType]
    var AWSAccountId: js.UndefOr[AWSAccountIdType]
    var CloudHsmClusterId: js.UndefOr[CloudHsmClusterIdType]
    var Arn: js.UndefOr[ArnType]
    var KeyState: js.UndefOr[KeyState]
    var KeyId: js.UndefOr[KeyIdType]
    var KeyManager: js.UndefOr[KeyManagerType]
    var ValidTo: js.UndefOr[DateType]
    var DeletionDate: js.UndefOr[DateType]
  }

  object KeyMetadata {
    def apply(
      CreationDate: js.UndefOr[DateType] = js.undefined,
      ExpirationModel: js.UndefOr[ExpirationModelType] = js.undefined,
      KeyUsage: js.UndefOr[KeyUsageType] = js.undefined,
      Enabled: js.UndefOr[BooleanType] = js.undefined,
      CustomKeyStoreId: js.UndefOr[CustomKeyStoreIdType] = js.undefined,
      Origin: js.UndefOr[OriginType] = js.undefined,
      Description: js.UndefOr[DescriptionType] = js.undefined,
      AWSAccountId: js.UndefOr[AWSAccountIdType] = js.undefined,
      CloudHsmClusterId: js.UndefOr[CloudHsmClusterIdType] = js.undefined,
      Arn: js.UndefOr[ArnType] = js.undefined,
      KeyState: js.UndefOr[KeyState] = js.undefined,
      KeyId: js.UndefOr[KeyIdType] = js.undefined,
      KeyManager: js.UndefOr[KeyManagerType] = js.undefined,
      ValidTo: js.UndefOr[DateType] = js.undefined,
      DeletionDate: js.UndefOr[DateType] = js.undefined): KeyMetadata = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CreationDate" -> CreationDate.map { x => x.asInstanceOf[js.Any] },
        "ExpirationModel" -> ExpirationModel.map { x => x.asInstanceOf[js.Any] },
        "KeyUsage" -> KeyUsage.map { x => x.asInstanceOf[js.Any] },
        "Enabled" -> Enabled.map { x => x.asInstanceOf[js.Any] },
        "CustomKeyStoreId" -> CustomKeyStoreId.map { x => x.asInstanceOf[js.Any] },
        "Origin" -> Origin.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "AWSAccountId" -> AWSAccountId.map { x => x.asInstanceOf[js.Any] },
        "CloudHsmClusterId" -> CloudHsmClusterId.map { x => x.asInstanceOf[js.Any] },
        "Arn" -> Arn.map { x => x.asInstanceOf[js.Any] },
        "KeyState" -> KeyState.map { x => x.asInstanceOf[js.Any] },
        "KeyId" -> KeyId.map { x => x.asInstanceOf[js.Any] },
        "KeyManager" -> KeyManager.map { x => x.asInstanceOf[js.Any] },
        "ValidTo" -> ValidTo.map { x => x.asInstanceOf[js.Any] },
        "DeletionDate" -> DeletionDate.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[KeyMetadata]
    }
  }

  object KeyStateEnum {
    val Enabled = "Enabled"
    val Disabled = "Disabled"
    val PendingDeletion = "PendingDeletion"
    val PendingImport = "PendingImport"
    val Unavailable = "Unavailable"

    val values = IndexedSeq(Enabled, Disabled, PendingDeletion, PendingImport, Unavailable)
  }

  object KeyUsageTypeEnum {
    val ENCRYPT_DECRYPT = "ENCRYPT_DECRYPT"

    val values = IndexedSeq(ENCRYPT_DECRYPT)
  }

  @js.native
  trait ListAliasesRequest extends js.Object {
    var KeyId: js.UndefOr[KeyIdType]
    var Limit: js.UndefOr[LimitType]
    var Marker: js.UndefOr[MarkerType]
  }

  object ListAliasesRequest {
    def apply(
      KeyId: js.UndefOr[KeyIdType] = js.undefined,
      Limit: js.UndefOr[LimitType] = js.undefined,
      Marker: js.UndefOr[MarkerType] = js.undefined): ListAliasesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "KeyId" -> KeyId.map { x => x.asInstanceOf[js.Any] },
        "Limit" -> Limit.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListAliasesRequest]
    }
  }

  @js.native
  trait ListAliasesResponse extends js.Object {
    var Aliases: js.UndefOr[AliasList]
    var NextMarker: js.UndefOr[MarkerType]
    var Truncated: js.UndefOr[BooleanType]
  }

  object ListAliasesResponse {
    def apply(
      Aliases: js.UndefOr[AliasList] = js.undefined,
      NextMarker: js.UndefOr[MarkerType] = js.undefined,
      Truncated: js.UndefOr[BooleanType] = js.undefined): ListAliasesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Aliases" -> Aliases.map { x => x.asInstanceOf[js.Any] },
        "NextMarker" -> NextMarker.map { x => x.asInstanceOf[js.Any] },
        "Truncated" -> Truncated.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListAliasesResponse]
    }
  }

  @js.native
  trait ListGrantsRequest extends js.Object {
    var Limit: js.UndefOr[LimitType]
    var Marker: js.UndefOr[MarkerType]
    var KeyId: js.UndefOr[KeyIdType]
  }

  object ListGrantsRequest {
    def apply(
      Limit: js.UndefOr[LimitType] = js.undefined,
      Marker: js.UndefOr[MarkerType] = js.undefined,
      KeyId: js.UndefOr[KeyIdType] = js.undefined): ListGrantsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Limit" -> Limit.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "KeyId" -> KeyId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListGrantsRequest]
    }
  }

  @js.native
  trait ListGrantsResponse extends js.Object {
    var Grants: js.UndefOr[GrantList]
    var NextMarker: js.UndefOr[MarkerType]
    var Truncated: js.UndefOr[BooleanType]
  }

  object ListGrantsResponse {
    def apply(
      Grants: js.UndefOr[GrantList] = js.undefined,
      NextMarker: js.UndefOr[MarkerType] = js.undefined,
      Truncated: js.UndefOr[BooleanType] = js.undefined): ListGrantsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Grants" -> Grants.map { x => x.asInstanceOf[js.Any] },
        "NextMarker" -> NextMarker.map { x => x.asInstanceOf[js.Any] },
        "Truncated" -> Truncated.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListGrantsResponse]
    }
  }

  @js.native
  trait ListKeyPoliciesRequest extends js.Object {
    var KeyId: js.UndefOr[KeyIdType]
    var Limit: js.UndefOr[LimitType]
    var Marker: js.UndefOr[MarkerType]
  }

  object ListKeyPoliciesRequest {
    def apply(
      KeyId: js.UndefOr[KeyIdType] = js.undefined,
      Limit: js.UndefOr[LimitType] = js.undefined,
      Marker: js.UndefOr[MarkerType] = js.undefined): ListKeyPoliciesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "KeyId" -> KeyId.map { x => x.asInstanceOf[js.Any] },
        "Limit" -> Limit.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListKeyPoliciesRequest]
    }
  }

  @js.native
  trait ListKeyPoliciesResponse extends js.Object {
    var PolicyNames: js.UndefOr[PolicyNameList]
    var NextMarker: js.UndefOr[MarkerType]
    var Truncated: js.UndefOr[BooleanType]
  }

  object ListKeyPoliciesResponse {
    def apply(
      PolicyNames: js.UndefOr[PolicyNameList] = js.undefined,
      NextMarker: js.UndefOr[MarkerType] = js.undefined,
      Truncated: js.UndefOr[BooleanType] = js.undefined): ListKeyPoliciesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PolicyNames" -> PolicyNames.map { x => x.asInstanceOf[js.Any] },
        "NextMarker" -> NextMarker.map { x => x.asInstanceOf[js.Any] },
        "Truncated" -> Truncated.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListKeyPoliciesResponse]
    }
  }

  @js.native
  trait ListKeysRequest extends js.Object {
    var Limit: js.UndefOr[LimitType]
    var Marker: js.UndefOr[MarkerType]
  }

  object ListKeysRequest {
    def apply(
      Limit: js.UndefOr[LimitType] = js.undefined,
      Marker: js.UndefOr[MarkerType] = js.undefined): ListKeysRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Limit" -> Limit.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListKeysRequest]
    }
  }

  @js.native
  trait ListKeysResponse extends js.Object {
    var Keys: js.UndefOr[KeyList]
    var NextMarker: js.UndefOr[MarkerType]
    var Truncated: js.UndefOr[BooleanType]
  }

  object ListKeysResponse {
    def apply(
      Keys: js.UndefOr[KeyList] = js.undefined,
      NextMarker: js.UndefOr[MarkerType] = js.undefined,
      Truncated: js.UndefOr[BooleanType] = js.undefined): ListKeysResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Keys" -> Keys.map { x => x.asInstanceOf[js.Any] },
        "NextMarker" -> NextMarker.map { x => x.asInstanceOf[js.Any] },
        "Truncated" -> Truncated.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListKeysResponse]
    }
  }

  @js.native
  trait ListResourceTagsRequest extends js.Object {
    var KeyId: js.UndefOr[KeyIdType]
    var Limit: js.UndefOr[LimitType]
    var Marker: js.UndefOr[MarkerType]
  }

  object ListResourceTagsRequest {
    def apply(
      KeyId: js.UndefOr[KeyIdType] = js.undefined,
      Limit: js.UndefOr[LimitType] = js.undefined,
      Marker: js.UndefOr[MarkerType] = js.undefined): ListResourceTagsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "KeyId" -> KeyId.map { x => x.asInstanceOf[js.Any] },
        "Limit" -> Limit.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListResourceTagsRequest]
    }
  }

  @js.native
  trait ListResourceTagsResponse extends js.Object {
    var Tags: js.UndefOr[TagList]
    var NextMarker: js.UndefOr[MarkerType]
    var Truncated: js.UndefOr[BooleanType]
  }

  object ListResourceTagsResponse {
    def apply(
      Tags: js.UndefOr[TagList] = js.undefined,
      NextMarker: js.UndefOr[MarkerType] = js.undefined,
      Truncated: js.UndefOr[BooleanType] = js.undefined): ListResourceTagsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] },
        "NextMarker" -> NextMarker.map { x => x.asInstanceOf[js.Any] },
        "Truncated" -> Truncated.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListResourceTagsResponse]
    }
  }

  @js.native
  trait ListRetirableGrantsRequest extends js.Object {
    var Limit: js.UndefOr[LimitType]
    var Marker: js.UndefOr[MarkerType]
    var RetiringPrincipal: js.UndefOr[PrincipalIdType]
  }

  object ListRetirableGrantsRequest {
    def apply(
      Limit: js.UndefOr[LimitType] = js.undefined,
      Marker: js.UndefOr[MarkerType] = js.undefined,
      RetiringPrincipal: js.UndefOr[PrincipalIdType] = js.undefined): ListRetirableGrantsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Limit" -> Limit.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "RetiringPrincipal" -> RetiringPrincipal.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListRetirableGrantsRequest]
    }
  }

  object OriginTypeEnum {
    val AWS_KMS = "AWS_KMS"
    val EXTERNAL = "EXTERNAL"
    val AWS_CLOUDHSM = "AWS_CLOUDHSM"

    val values = IndexedSeq(AWS_KMS, EXTERNAL, AWS_CLOUDHSM)
  }

  @js.native
  trait PutKeyPolicyRequest extends js.Object {
    var KeyId: js.UndefOr[KeyIdType]
    var PolicyName: js.UndefOr[PolicyNameType]
    var Policy: js.UndefOr[PolicyType]
    var BypassPolicyLockoutSafetyCheck: js.UndefOr[BooleanType]
  }

  object PutKeyPolicyRequest {
    def apply(
      KeyId: js.UndefOr[KeyIdType] = js.undefined,
      PolicyName: js.UndefOr[PolicyNameType] = js.undefined,
      Policy: js.UndefOr[PolicyType] = js.undefined,
      BypassPolicyLockoutSafetyCheck: js.UndefOr[BooleanType] = js.undefined): PutKeyPolicyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "KeyId" -> KeyId.map { x => x.asInstanceOf[js.Any] },
        "PolicyName" -> PolicyName.map { x => x.asInstanceOf[js.Any] },
        "Policy" -> Policy.map { x => x.asInstanceOf[js.Any] },
        "BypassPolicyLockoutSafetyCheck" -> BypassPolicyLockoutSafetyCheck.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutKeyPolicyRequest]
    }
  }

  @js.native
  trait ReEncryptRequest extends js.Object {
    var SourceEncryptionContext: js.UndefOr[EncryptionContextType]
    var GrantTokens: js.UndefOr[GrantTokenList]
    var DestinationKeyId: js.UndefOr[KeyIdType]
    var CiphertextBlob: js.UndefOr[CiphertextType]
    var DestinationEncryptionContext: js.UndefOr[EncryptionContextType]
  }

  object ReEncryptRequest {
    def apply(
      SourceEncryptionContext: js.UndefOr[EncryptionContextType] = js.undefined,
      GrantTokens: js.UndefOr[GrantTokenList] = js.undefined,
      DestinationKeyId: js.UndefOr[KeyIdType] = js.undefined,
      CiphertextBlob: js.UndefOr[CiphertextType] = js.undefined,
      DestinationEncryptionContext: js.UndefOr[EncryptionContextType] = js.undefined): ReEncryptRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SourceEncryptionContext" -> SourceEncryptionContext.map { x => x.asInstanceOf[js.Any] },
        "GrantTokens" -> GrantTokens.map { x => x.asInstanceOf[js.Any] },
        "DestinationKeyId" -> DestinationKeyId.map { x => x.asInstanceOf[js.Any] },
        "CiphertextBlob" -> CiphertextBlob.map { x => x.asInstanceOf[js.Any] },
        "DestinationEncryptionContext" -> DestinationEncryptionContext.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReEncryptRequest]
    }
  }

  @js.native
  trait ReEncryptResponse extends js.Object {
    var CiphertextBlob: js.UndefOr[CiphertextType]
    var SourceKeyId: js.UndefOr[KeyIdType]
    var KeyId: js.UndefOr[KeyIdType]
  }

  object ReEncryptResponse {
    def apply(
      CiphertextBlob: js.UndefOr[CiphertextType] = js.undefined,
      SourceKeyId: js.UndefOr[KeyIdType] = js.undefined,
      KeyId: js.UndefOr[KeyIdType] = js.undefined): ReEncryptResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CiphertextBlob" -> CiphertextBlob.map { x => x.asInstanceOf[js.Any] },
        "SourceKeyId" -> SourceKeyId.map { x => x.asInstanceOf[js.Any] },
        "KeyId" -> KeyId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReEncryptResponse]
    }
  }

  @js.native
  trait RetireGrantRequest extends js.Object {
    var GrantToken: js.UndefOr[GrantTokenType]
    var KeyId: js.UndefOr[KeyIdType]
    var GrantId: js.UndefOr[GrantIdType]
  }

  object RetireGrantRequest {
    def apply(
      GrantToken: js.UndefOr[GrantTokenType] = js.undefined,
      KeyId: js.UndefOr[KeyIdType] = js.undefined,
      GrantId: js.UndefOr[GrantIdType] = js.undefined): RetireGrantRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GrantToken" -> GrantToken.map { x => x.asInstanceOf[js.Any] },
        "KeyId" -> KeyId.map { x => x.asInstanceOf[js.Any] },
        "GrantId" -> GrantId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RetireGrantRequest]
    }
  }

  @js.native
  trait RevokeGrantRequest extends js.Object {
    var KeyId: js.UndefOr[KeyIdType]
    var GrantId: js.UndefOr[GrantIdType]
  }

  object RevokeGrantRequest {
    def apply(
      KeyId: js.UndefOr[KeyIdType] = js.undefined,
      GrantId: js.UndefOr[GrantIdType] = js.undefined): RevokeGrantRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "KeyId" -> KeyId.map { x => x.asInstanceOf[js.Any] },
        "GrantId" -> GrantId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RevokeGrantRequest]
    }
  }

  @js.native
  trait ScheduleKeyDeletionRequest extends js.Object {
    var KeyId: js.UndefOr[KeyIdType]
    var PendingWindowInDays: js.UndefOr[PendingWindowInDaysType]
  }

  object ScheduleKeyDeletionRequest {
    def apply(
      KeyId: js.UndefOr[KeyIdType] = js.undefined,
      PendingWindowInDays: js.UndefOr[PendingWindowInDaysType] = js.undefined): ScheduleKeyDeletionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "KeyId" -> KeyId.map { x => x.asInstanceOf[js.Any] },
        "PendingWindowInDays" -> PendingWindowInDays.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ScheduleKeyDeletionRequest]
    }
  }

  @js.native
  trait ScheduleKeyDeletionResponse extends js.Object {
    var KeyId: js.UndefOr[KeyIdType]
    var DeletionDate: js.UndefOr[DateType]
  }

  object ScheduleKeyDeletionResponse {
    def apply(
      KeyId: js.UndefOr[KeyIdType] = js.undefined,
      DeletionDate: js.UndefOr[DateType] = js.undefined): ScheduleKeyDeletionResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "KeyId" -> KeyId.map { x => x.asInstanceOf[js.Any] },
        "DeletionDate" -> DeletionDate.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ScheduleKeyDeletionResponse]
    }
  }

  /**
   * <p>A key-value pair. A tag consists of a tag key and a tag value. Tag keys and tag values are both required, but tag values can be empty (null) strings.</p> <p>For information about the rules that apply to tag keys and tag values, see <a href="http://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/allocation-tag-restrictions.html">User-Defined Tag Restrictions</a> in the <i>AWS Billing and Cost Management User Guide</i>.</p>
   */
  @js.native
  trait Tag extends js.Object {
    var TagKey: js.UndefOr[TagKeyType]
    var TagValue: js.UndefOr[TagValueType]
  }

  object Tag {
    def apply(
      TagKey: js.UndefOr[TagKeyType] = js.undefined,
      TagValue: js.UndefOr[TagValueType] = js.undefined): Tag = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TagKey" -> TagKey.map { x => x.asInstanceOf[js.Any] },
        "TagValue" -> TagValue.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Tag]
    }
  }

  @js.native
  trait TagResourceRequest extends js.Object {
    var KeyId: js.UndefOr[KeyIdType]
    var Tags: js.UndefOr[TagList]
  }

  object TagResourceRequest {
    def apply(
      KeyId: js.UndefOr[KeyIdType] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined): TagResourceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "KeyId" -> KeyId.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TagResourceRequest]
    }
  }

  @js.native
  trait UntagResourceRequest extends js.Object {
    var KeyId: js.UndefOr[KeyIdType]
    var TagKeys: js.UndefOr[TagKeyList]
  }

  object UntagResourceRequest {
    def apply(
      KeyId: js.UndefOr[KeyIdType] = js.undefined,
      TagKeys: js.UndefOr[TagKeyList] = js.undefined): UntagResourceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "KeyId" -> KeyId.map { x => x.asInstanceOf[js.Any] },
        "TagKeys" -> TagKeys.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UntagResourceRequest]
    }
  }

  @js.native
  trait UpdateAliasRequest extends js.Object {
    var AliasName: js.UndefOr[AliasNameType]
    var TargetKeyId: js.UndefOr[KeyIdType]
  }

  object UpdateAliasRequest {
    def apply(
      AliasName: js.UndefOr[AliasNameType] = js.undefined,
      TargetKeyId: js.UndefOr[KeyIdType] = js.undefined): UpdateAliasRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AliasName" -> AliasName.map { x => x.asInstanceOf[js.Any] },
        "TargetKeyId" -> TargetKeyId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateAliasRequest]
    }
  }

  @js.native
  trait UpdateCustomKeyStoreRequest extends js.Object {
    var CustomKeyStoreId: js.UndefOr[CustomKeyStoreIdType]
    var NewCustomKeyStoreName: js.UndefOr[CustomKeyStoreNameType]
    var KeyStorePassword: js.UndefOr[KeyStorePasswordType]
    var CloudHsmClusterId: js.UndefOr[CloudHsmClusterIdType]
  }

  object UpdateCustomKeyStoreRequest {
    def apply(
      CustomKeyStoreId: js.UndefOr[CustomKeyStoreIdType] = js.undefined,
      NewCustomKeyStoreName: js.UndefOr[CustomKeyStoreNameType] = js.undefined,
      KeyStorePassword: js.UndefOr[KeyStorePasswordType] = js.undefined,
      CloudHsmClusterId: js.UndefOr[CloudHsmClusterIdType] = js.undefined): UpdateCustomKeyStoreRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CustomKeyStoreId" -> CustomKeyStoreId.map { x => x.asInstanceOf[js.Any] },
        "NewCustomKeyStoreName" -> NewCustomKeyStoreName.map { x => x.asInstanceOf[js.Any] },
        "KeyStorePassword" -> KeyStorePassword.map { x => x.asInstanceOf[js.Any] },
        "CloudHsmClusterId" -> CloudHsmClusterId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateCustomKeyStoreRequest]
    }
  }

  @js.native
  trait UpdateCustomKeyStoreResponse extends js.Object {

  }

  object UpdateCustomKeyStoreResponse {
    def apply(): UpdateCustomKeyStoreResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateCustomKeyStoreResponse]
    }
  }

  @js.native
  trait UpdateKeyDescriptionRequest extends js.Object {
    var KeyId: js.UndefOr[KeyIdType]
    var Description: js.UndefOr[DescriptionType]
  }

  object UpdateKeyDescriptionRequest {
    def apply(
      KeyId: js.UndefOr[KeyIdType] = js.undefined,
      Description: js.UndefOr[DescriptionType] = js.undefined): UpdateKeyDescriptionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "KeyId" -> KeyId.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateKeyDescriptionRequest]
    }
  }

  object WrappingKeySpecEnum {
    val RSA_2048 = "RSA_2048"

    val values = IndexedSeq(RSA_2048)
  }
}
