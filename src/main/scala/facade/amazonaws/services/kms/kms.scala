package facade.amazonaws.services

import scalajs._
import facade.amazonaws._

package object kms {
  type AWSAccountIdType = String
  type AlgorithmSpec = String
  type AliasList = js.Array[AliasListEntry]
  type AliasNameType = String
  type ArnType = String
  type BooleanType = Boolean
  type CiphertextType = js.Array[Byte]
  type DataKeySpec = String
  type DateType = js.Date
  type DescriptionType = String
  type EncryptionContextKey = String
  type EncryptionContextType = js.Dictionary[EncryptionContextValue]
  type EncryptionContextValue = String
  type ErrorMessageType = String
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
  type KeyState = String
  type KeyUsageType = String
  type LimitType = Integer
  type MarkerType = String
  type NumberOfBytesType = Integer
  type OriginType = String
  type PendingWindowInDaysType = Integer
  type PlaintextType = js.Array[Byte]
  type PolicyNameList = js.Array[PolicyNameType]
  type PolicyNameType = String
  type PolicyType = String
  type PrincipalIdType = String
  type WrappingKeySpec = String
}

package kms {
  @js.native
  trait Kms extends js.Object {
    def cancelKeyDeletion(params: CancelKeyDeletionRequest, callback: Callback[CancelKeyDeletionResponse]): Unit = js.native
    def cancelKeyDeletion(params: CancelKeyDeletionRequest): Request[CancelKeyDeletionResponse] = js.native
    def createAlias(params: CreateAliasRequest, callback: Callback[js.Object]): Unit = js.native
    def createAlias(params: CreateAliasRequest): Request[js.Object] = js.native
    def createGrant(params: CreateGrantRequest, callback: Callback[CreateGrantResponse]): Unit = js.native
    def createGrant(params: CreateGrantRequest): Request[CreateGrantResponse] = js.native
    def createKey(params: CreateKeyRequest, callback: Callback[CreateKeyResponse]): Unit = js.native
    def createKey(params: CreateKeyRequest): Request[CreateKeyResponse] = js.native
    def decrypt(params: DecryptRequest, callback: Callback[DecryptResponse]): Unit = js.native
    def decrypt(params: DecryptRequest): Request[DecryptResponse] = js.native
    def deleteAlias(params: DeleteAliasRequest, callback: Callback[js.Object]): Unit = js.native
    def deleteAlias(params: DeleteAliasRequest): Request[js.Object] = js.native
    def deleteImportedKeyMaterial(params: DeleteImportedKeyMaterialRequest, callback: Callback[js.Object]): Unit = js.native
    def deleteImportedKeyMaterial(params: DeleteImportedKeyMaterialRequest): Request[js.Object] = js.native
    def describeKey(params: DescribeKeyRequest, callback: Callback[DescribeKeyResponse]): Unit = js.native
    def describeKey(params: DescribeKeyRequest): Request[DescribeKeyResponse] = js.native
    def disableKey(params: DisableKeyRequest, callback: Callback[js.Object]): Unit = js.native
    def disableKey(params: DisableKeyRequest): Request[js.Object] = js.native
    def disableKeyRotation(params: DisableKeyRotationRequest, callback: Callback[js.Object]): Unit = js.native
    def disableKeyRotation(params: DisableKeyRotationRequest): Request[js.Object] = js.native
    def enableKey(params: EnableKeyRequest, callback: Callback[js.Object]): Unit = js.native
    def enableKey(params: EnableKeyRequest): Request[js.Object] = js.native
    def enableKeyRotation(params: EnableKeyRotationRequest, callback: Callback[js.Object]): Unit = js.native
    def enableKeyRotation(params: EnableKeyRotationRequest): Request[js.Object] = js.native
    def encrypt(params: EncryptRequest, callback: Callback[EncryptResponse]): Unit = js.native
    def encrypt(params: EncryptRequest): Request[EncryptResponse] = js.native
    def generateDataKey(params: GenerateDataKeyRequest, callback: Callback[GenerateDataKeyResponse]): Unit = js.native
    def generateDataKey(params: GenerateDataKeyRequest): Request[GenerateDataKeyResponse] = js.native
    def generateDataKeyWithoutPlaintext(params: GenerateDataKeyWithoutPlaintextRequest, callback: Callback[GenerateDataKeyWithoutPlaintextResponse]): Unit = js.native
    def generateDataKeyWithoutPlaintext(params: GenerateDataKeyWithoutPlaintextRequest): Request[GenerateDataKeyWithoutPlaintextResponse] = js.native
    def generateRandom(params: GenerateRandomRequest, callback: Callback[GenerateRandomResponse]): Unit = js.native
    def generateRandom(params: GenerateRandomRequest): Request[GenerateRandomResponse] = js.native
    def getKeyPolicy(params: GetKeyPolicyRequest, callback: Callback[GetKeyPolicyResponse]): Unit = js.native
    def getKeyPolicy(params: GetKeyPolicyRequest): Request[GetKeyPolicyResponse] = js.native
    def getKeyRotationStatus(params: GetKeyRotationStatusRequest, callback: Callback[GetKeyRotationStatusResponse]): Unit = js.native
    def getKeyRotationStatus(params: GetKeyRotationStatusRequest): Request[GetKeyRotationStatusResponse] = js.native
    def getParametersForImport(params: GetParametersForImportRequest, callback: Callback[GetParametersForImportResponse]): Unit = js.native
    def getParametersForImport(params: GetParametersForImportRequest): Request[GetParametersForImportResponse] = js.native
    def importKeyMaterial(params: ImportKeyMaterialRequest, callback: Callback[ImportKeyMaterialResponse]): Unit = js.native
    def importKeyMaterial(params: ImportKeyMaterialRequest): Request[ImportKeyMaterialResponse] = js.native
    def listAliases(params: ListAliasesRequest, callback: Callback[ListAliasesResponse]): Unit = js.native
    def listAliases(params: ListAliasesRequest): Request[ListAliasesResponse] = js.native
    def listGrants(params: ListGrantsRequest, callback: Callback[ListGrantsResponse]): Unit = js.native
    def listGrants(params: ListGrantsRequest): Request[ListGrantsResponse] = js.native
    def listKeyPolicies(params: ListKeyPoliciesRequest, callback: Callback[ListKeyPoliciesResponse]): Unit = js.native
    def listKeyPolicies(params: ListKeyPoliciesRequest): Request[ListKeyPoliciesResponse] = js.native
    def listKeys(params: ListKeysRequest, callback: Callback[ListKeysResponse]): Unit = js.native
    def listKeys(params: ListKeysRequest): Request[ListKeysResponse] = js.native
    def listRetirableGrants(params: ListRetirableGrantsRequest, callback: Callback[ListGrantsResponse]): Unit = js.native
    def listRetirableGrants(params: ListRetirableGrantsRequest): Request[ListGrantsResponse] = js.native
    def putKeyPolicy(params: PutKeyPolicyRequest, callback: Callback[js.Object]): Unit = js.native
    def putKeyPolicy(params: PutKeyPolicyRequest): Request[js.Object] = js.native
    def reEncrypt(params: ReEncryptRequest, callback: Callback[ReEncryptResponse]): Unit = js.native
    def reEncrypt(params: ReEncryptRequest): Request[ReEncryptResponse] = js.native
    def retireGrant(params: RetireGrantRequest, callback: Callback[js.Object]): Unit = js.native
    def retireGrant(params: RetireGrantRequest): Request[js.Object] = js.native
    def revokeGrant(params: RevokeGrantRequest, callback: Callback[js.Object]): Unit = js.native
    def revokeGrant(params: RevokeGrantRequest): Request[js.Object] = js.native
    def scheduleKeyDeletion(params: ScheduleKeyDeletionRequest, callback: Callback[ScheduleKeyDeletionResponse]): Unit = js.native
    def scheduleKeyDeletion(params: ScheduleKeyDeletionRequest): Request[ScheduleKeyDeletionResponse] = js.native
    def updateAlias(params: UpdateAliasRequest, callback: Callback[js.Object]): Unit = js.native
    def updateAlias(params: UpdateAliasRequest): Request[js.Object] = js.native
    def updateKeyDescription(params: UpdateKeyDescriptionRequest, callback: Callback[js.Object]): Unit = js.native
    def updateKeyDescription(params: UpdateKeyDescriptionRequest): Request[js.Object] = js.native
  }


  object AlgorithmSpecEnum {
    val `RSAES_PKCS1_V1_5` = "RSAES_PKCS1_V1_5"
    val `RSAES_OAEP_SHA_1` = "RSAES_OAEP_SHA_1"
    val `RSAES_OAEP_SHA_256` = "RSAES_OAEP_SHA_256"

    val values = IndexedSeq(`RSAES_PKCS1_V1_5`, `RSAES_OAEP_SHA_1`, `RSAES_OAEP_SHA_256`)
  }

  /**
   * <p>Contains information about an alias.</p>
   */
  @js.native
  trait AliasListEntry extends js.Object {
    var AliasName: AliasNameType
    var AliasArn: ArnType
    var TargetKeyId: KeyIdType
  }

  object AliasListEntry {
    def apply(
      AliasName: js.UndefOr[AliasNameType] = js.undefined,
      AliasArn: js.UndefOr[ArnType] = js.undefined,
      TargetKeyId: js.UndefOr[KeyIdType] = js.undefined
    ): AliasListEntry = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("AliasName" -> AliasName.map { x => x: js.Any }),
        ("AliasArn" -> AliasArn.map { x => x: js.Any }),
        ("TargetKeyId" -> TargetKeyId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AliasListEntry]
    }
  }

  /**
   * <p>The request was rejected because it attempted to create a resource that already exists.</p>
   */
  @js.native
  trait AlreadyExistsExceptionException extends js.Object {
    var message: ErrorMessageType
  }

  @js.native
  trait CancelKeyDeletionRequest extends js.Object {
    var KeyId: KeyIdType
  }

  object CancelKeyDeletionRequest {
    def apply(
      KeyId: js.UndefOr[KeyIdType] = js.undefined
    ): CancelKeyDeletionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("KeyId" -> KeyId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CancelKeyDeletionRequest]
    }
  }

  @js.native
  trait CancelKeyDeletionResponse extends js.Object {
    var KeyId: KeyIdType
  }

  object CancelKeyDeletionResponse {
    def apply(
      KeyId: js.UndefOr[KeyIdType] = js.undefined
    ): CancelKeyDeletionResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("KeyId" -> KeyId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CancelKeyDeletionResponse]
    }
  }

  @js.native
  trait CreateAliasRequest extends js.Object {
    var AliasName: AliasNameType
    var TargetKeyId: KeyIdType
  }

  object CreateAliasRequest {
    def apply(
      AliasName: js.UndefOr[AliasNameType] = js.undefined,
      TargetKeyId: js.UndefOr[KeyIdType] = js.undefined
    ): CreateAliasRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("AliasName" -> AliasName.map { x => x: js.Any }),
        ("TargetKeyId" -> TargetKeyId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateAliasRequest]
    }
  }

  @js.native
  trait CreateGrantRequest extends js.Object {
    var Operations: GrantOperationList
    var RetiringPrincipal: PrincipalIdType
    var Name: GrantNameType
    var GrantTokens: GrantTokenList
    var Constraints: GrantConstraints
    var KeyId: KeyIdType
    var GranteePrincipal: PrincipalIdType
  }

  object CreateGrantRequest {
    def apply(
      Operations: js.UndefOr[GrantOperationList] = js.undefined,
      RetiringPrincipal: js.UndefOr[PrincipalIdType] = js.undefined,
      Name: js.UndefOr[GrantNameType] = js.undefined,
      GrantTokens: js.UndefOr[GrantTokenList] = js.undefined,
      Constraints: js.UndefOr[GrantConstraints] = js.undefined,
      KeyId: js.UndefOr[KeyIdType] = js.undefined,
      GranteePrincipal: js.UndefOr[PrincipalIdType] = js.undefined
    ): CreateGrantRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Operations" -> Operations.map { x => x: js.Any }),
        ("RetiringPrincipal" -> RetiringPrincipal.map { x => x: js.Any }),
        ("Name" -> Name.map { x => x: js.Any }),
        ("GrantTokens" -> GrantTokens.map { x => x: js.Any }),
        ("Constraints" -> Constraints.map { x => x: js.Any }),
        ("KeyId" -> KeyId.map { x => x: js.Any }),
        ("GranteePrincipal" -> GranteePrincipal.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateGrantRequest]
    }
  }

  @js.native
  trait CreateGrantResponse extends js.Object {
    var GrantToken: GrantTokenType
    var GrantId: GrantIdType
  }

  object CreateGrantResponse {
    def apply(
      GrantToken: js.UndefOr[GrantTokenType] = js.undefined,
      GrantId: js.UndefOr[GrantIdType] = js.undefined
    ): CreateGrantResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("GrantToken" -> GrantToken.map { x => x: js.Any }),
        ("GrantId" -> GrantId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateGrantResponse]
    }
  }

  @js.native
  trait CreateKeyRequest extends js.Object {
    var KeyUsage: KeyUsageType
    var Origin: OriginType
    var Description: DescriptionType
    var Policy: PolicyType
    var BypassPolicyLockoutSafetyCheck: BooleanType
  }

  object CreateKeyRequest {
    def apply(
      KeyUsage: js.UndefOr[KeyUsageType] = js.undefined,
      Origin: js.UndefOr[OriginType] = js.undefined,
      Description: js.UndefOr[DescriptionType] = js.undefined,
      Policy: js.UndefOr[PolicyType] = js.undefined,
      BypassPolicyLockoutSafetyCheck: js.UndefOr[BooleanType] = js.undefined
    ): CreateKeyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("KeyUsage" -> KeyUsage.map { x => x: js.Any }),
        ("Origin" -> Origin.map { x => x: js.Any }),
        ("Description" -> Description.map { x => x: js.Any }),
        ("Policy" -> Policy.map { x => x: js.Any }),
        ("BypassPolicyLockoutSafetyCheck" -> BypassPolicyLockoutSafetyCheck.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateKeyRequest]
    }
  }

  @js.native
  trait CreateKeyResponse extends js.Object {
    var KeyMetadata: KeyMetadata
  }

  object CreateKeyResponse {
    def apply(
      KeyMetadata: js.UndefOr[KeyMetadata] = js.undefined
    ): CreateKeyResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("KeyMetadata" -> KeyMetadata.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateKeyResponse]
    }
  }


  object DataKeySpecEnum {
    val `AES_256` = "AES_256"
    val `AES_128` = "AES_128"

    val values = IndexedSeq(`AES_256`, `AES_128`)
  }

  @js.native
  trait DecryptRequest extends js.Object {
    var CiphertextBlob: CiphertextType
    var EncryptionContext: EncryptionContextType
    var GrantTokens: GrantTokenList
  }

  object DecryptRequest {
    def apply(
      CiphertextBlob: js.UndefOr[CiphertextType] = js.undefined,
      EncryptionContext: js.UndefOr[EncryptionContextType] = js.undefined,
      GrantTokens: js.UndefOr[GrantTokenList] = js.undefined
    ): DecryptRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("CiphertextBlob" -> CiphertextBlob.map { x => x: js.Any }),
        ("EncryptionContext" -> EncryptionContext.map { x => x: js.Any }),
        ("GrantTokens" -> GrantTokens.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DecryptRequest]
    }
  }

  @js.native
  trait DecryptResponse extends js.Object {
    var KeyId: KeyIdType
    var Plaintext: PlaintextType
  }

  object DecryptResponse {
    def apply(
      KeyId: js.UndefOr[KeyIdType] = js.undefined,
      Plaintext: js.UndefOr[PlaintextType] = js.undefined
    ): DecryptResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("KeyId" -> KeyId.map { x => x: js.Any }),
        ("Plaintext" -> Plaintext.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DecryptResponse]
    }
  }

  @js.native
  trait DeleteAliasRequest extends js.Object {
    var AliasName: AliasNameType
  }

  object DeleteAliasRequest {
    def apply(
      AliasName: js.UndefOr[AliasNameType] = js.undefined
    ): DeleteAliasRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("AliasName" -> AliasName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteAliasRequest]
    }
  }

  @js.native
  trait DeleteImportedKeyMaterialRequest extends js.Object {
    var KeyId: KeyIdType
  }

  object DeleteImportedKeyMaterialRequest {
    def apply(
      KeyId: js.UndefOr[KeyIdType] = js.undefined
    ): DeleteImportedKeyMaterialRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("KeyId" -> KeyId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteImportedKeyMaterialRequest]
    }
  }

  /**
   * <p>The system timed out while trying to fulfill the request. The request can be retried.</p>
   */
  @js.native
  trait DependencyTimeoutExceptionException extends js.Object {
    var message: ErrorMessageType
  }

  @js.native
  trait DescribeKeyRequest extends js.Object {
    var KeyId: KeyIdType
    var GrantTokens: GrantTokenList
  }

  object DescribeKeyRequest {
    def apply(
      KeyId: js.UndefOr[KeyIdType] = js.undefined,
      GrantTokens: js.UndefOr[GrantTokenList] = js.undefined
    ): DescribeKeyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("KeyId" -> KeyId.map { x => x: js.Any }),
        ("GrantTokens" -> GrantTokens.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeKeyRequest]
    }
  }

  @js.native
  trait DescribeKeyResponse extends js.Object {
    var KeyMetadata: KeyMetadata
  }

  object DescribeKeyResponse {
    def apply(
      KeyMetadata: js.UndefOr[KeyMetadata] = js.undefined
    ): DescribeKeyResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("KeyMetadata" -> KeyMetadata.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeKeyResponse]
    }
  }

  @js.native
  trait DisableKeyRequest extends js.Object {
    var KeyId: KeyIdType
  }

  object DisableKeyRequest {
    def apply(
      KeyId: js.UndefOr[KeyIdType] = js.undefined
    ): DisableKeyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("KeyId" -> KeyId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DisableKeyRequest]
    }
  }

  @js.native
  trait DisableKeyRotationRequest extends js.Object {
    var KeyId: KeyIdType
  }

  object DisableKeyRotationRequest {
    def apply(
      KeyId: js.UndefOr[KeyIdType] = js.undefined
    ): DisableKeyRotationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("KeyId" -> KeyId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DisableKeyRotationRequest]
    }
  }

  /**
   * <p>The request was rejected because the specified CMK is not enabled.</p>
   */
  @js.native
  trait DisabledExceptionException extends js.Object {
    var message: ErrorMessageType
  }

  @js.native
  trait EnableKeyRequest extends js.Object {
    var KeyId: KeyIdType
  }

  object EnableKeyRequest {
    def apply(
      KeyId: js.UndefOr[KeyIdType] = js.undefined
    ): EnableKeyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("KeyId" -> KeyId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EnableKeyRequest]
    }
  }

  @js.native
  trait EnableKeyRotationRequest extends js.Object {
    var KeyId: KeyIdType
  }

  object EnableKeyRotationRequest {
    def apply(
      KeyId: js.UndefOr[KeyIdType] = js.undefined
    ): EnableKeyRotationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("KeyId" -> KeyId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EnableKeyRotationRequest]
    }
  }

  @js.native
  trait EncryptRequest extends js.Object {
    var KeyId: KeyIdType
    var Plaintext: PlaintextType
    var EncryptionContext: EncryptionContextType
    var GrantTokens: GrantTokenList
  }

  object EncryptRequest {
    def apply(
      KeyId: js.UndefOr[KeyIdType] = js.undefined,
      Plaintext: js.UndefOr[PlaintextType] = js.undefined,
      EncryptionContext: js.UndefOr[EncryptionContextType] = js.undefined,
      GrantTokens: js.UndefOr[GrantTokenList] = js.undefined
    ): EncryptRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("KeyId" -> KeyId.map { x => x: js.Any }),
        ("Plaintext" -> Plaintext.map { x => x: js.Any }),
        ("EncryptionContext" -> EncryptionContext.map { x => x: js.Any }),
        ("GrantTokens" -> GrantTokens.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EncryptRequest]
    }
  }

  @js.native
  trait EncryptResponse extends js.Object {
    var CiphertextBlob: CiphertextType
    var KeyId: KeyIdType
  }

  object EncryptResponse {
    def apply(
      CiphertextBlob: js.UndefOr[CiphertextType] = js.undefined,
      KeyId: js.UndefOr[KeyIdType] = js.undefined
    ): EncryptResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("CiphertextBlob" -> CiphertextBlob.map { x => x: js.Any }),
        ("KeyId" -> KeyId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EncryptResponse]
    }
  }


  object ExpirationModelTypeEnum {
    val `KEY_MATERIAL_EXPIRES` = "KEY_MATERIAL_EXPIRES"
    val `KEY_MATERIAL_DOES_NOT_EXPIRE` = "KEY_MATERIAL_DOES_NOT_EXPIRE"

    val values = IndexedSeq(`KEY_MATERIAL_EXPIRES`, `KEY_MATERIAL_DOES_NOT_EXPIRE`)
  }

  /**
   * <p>The request was rejected because the provided import token is expired. Use <a>GetParametersForImport</a> to retrieve a new import token and public key, use the new public key to encrypt the key material, and then try the request again.</p>
   */
  @js.native
  trait ExpiredImportTokenExceptionException extends js.Object {
    var message: ErrorMessageType
  }

  @js.native
  trait GenerateDataKeyRequest extends js.Object {
    var NumberOfBytes: NumberOfBytesType
    var GrantTokens: GrantTokenList
    var KeySpec: DataKeySpec
    var EncryptionContext: EncryptionContextType
    var KeyId: KeyIdType
  }

  object GenerateDataKeyRequest {
    def apply(
      NumberOfBytes: js.UndefOr[NumberOfBytesType] = js.undefined,
      GrantTokens: js.UndefOr[GrantTokenList] = js.undefined,
      KeySpec: js.UndefOr[DataKeySpec] = js.undefined,
      EncryptionContext: js.UndefOr[EncryptionContextType] = js.undefined,
      KeyId: js.UndefOr[KeyIdType] = js.undefined
    ): GenerateDataKeyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("NumberOfBytes" -> NumberOfBytes.map { x => x: js.Any }),
        ("GrantTokens" -> GrantTokens.map { x => x: js.Any }),
        ("KeySpec" -> KeySpec.map { x => x: js.Any }),
        ("EncryptionContext" -> EncryptionContext.map { x => x: js.Any }),
        ("KeyId" -> KeyId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GenerateDataKeyRequest]
    }
  }

  @js.native
  trait GenerateDataKeyResponse extends js.Object {
    var CiphertextBlob: CiphertextType
    var Plaintext: PlaintextType
    var KeyId: KeyIdType
  }

  object GenerateDataKeyResponse {
    def apply(
      CiphertextBlob: js.UndefOr[CiphertextType] = js.undefined,
      Plaintext: js.UndefOr[PlaintextType] = js.undefined,
      KeyId: js.UndefOr[KeyIdType] = js.undefined
    ): GenerateDataKeyResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("CiphertextBlob" -> CiphertextBlob.map { x => x: js.Any }),
        ("Plaintext" -> Plaintext.map { x => x: js.Any }),
        ("KeyId" -> KeyId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GenerateDataKeyResponse]
    }
  }

  @js.native
  trait GenerateDataKeyWithoutPlaintextRequest extends js.Object {
    var NumberOfBytes: NumberOfBytesType
    var GrantTokens: GrantTokenList
    var KeySpec: DataKeySpec
    var EncryptionContext: EncryptionContextType
    var KeyId: KeyIdType
  }

  object GenerateDataKeyWithoutPlaintextRequest {
    def apply(
      NumberOfBytes: js.UndefOr[NumberOfBytesType] = js.undefined,
      GrantTokens: js.UndefOr[GrantTokenList] = js.undefined,
      KeySpec: js.UndefOr[DataKeySpec] = js.undefined,
      EncryptionContext: js.UndefOr[EncryptionContextType] = js.undefined,
      KeyId: js.UndefOr[KeyIdType] = js.undefined
    ): GenerateDataKeyWithoutPlaintextRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("NumberOfBytes" -> NumberOfBytes.map { x => x: js.Any }),
        ("GrantTokens" -> GrantTokens.map { x => x: js.Any }),
        ("KeySpec" -> KeySpec.map { x => x: js.Any }),
        ("EncryptionContext" -> EncryptionContext.map { x => x: js.Any }),
        ("KeyId" -> KeyId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GenerateDataKeyWithoutPlaintextRequest]
    }
  }

  @js.native
  trait GenerateDataKeyWithoutPlaintextResponse extends js.Object {
    var CiphertextBlob: CiphertextType
    var KeyId: KeyIdType
  }

  object GenerateDataKeyWithoutPlaintextResponse {
    def apply(
      CiphertextBlob: js.UndefOr[CiphertextType] = js.undefined,
      KeyId: js.UndefOr[KeyIdType] = js.undefined
    ): GenerateDataKeyWithoutPlaintextResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("CiphertextBlob" -> CiphertextBlob.map { x => x: js.Any }),
        ("KeyId" -> KeyId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GenerateDataKeyWithoutPlaintextResponse]
    }
  }

  @js.native
  trait GenerateRandomRequest extends js.Object {
    var NumberOfBytes: NumberOfBytesType
  }

  object GenerateRandomRequest {
    def apply(
      NumberOfBytes: js.UndefOr[NumberOfBytesType] = js.undefined
    ): GenerateRandomRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("NumberOfBytes" -> NumberOfBytes.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GenerateRandomRequest]
    }
  }

  @js.native
  trait GenerateRandomResponse extends js.Object {
    var Plaintext: PlaintextType
  }

  object GenerateRandomResponse {
    def apply(
      Plaintext: js.UndefOr[PlaintextType] = js.undefined
    ): GenerateRandomResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Plaintext" -> Plaintext.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GenerateRandomResponse]
    }
  }

  @js.native
  trait GetKeyPolicyRequest extends js.Object {
    var KeyId: KeyIdType
    var PolicyName: PolicyNameType
  }

  object GetKeyPolicyRequest {
    def apply(
      KeyId: js.UndefOr[KeyIdType] = js.undefined,
      PolicyName: js.UndefOr[PolicyNameType] = js.undefined
    ): GetKeyPolicyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("KeyId" -> KeyId.map { x => x: js.Any }),
        ("PolicyName" -> PolicyName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetKeyPolicyRequest]
    }
  }

  @js.native
  trait GetKeyPolicyResponse extends js.Object {
    var Policy: PolicyType
  }

  object GetKeyPolicyResponse {
    def apply(
      Policy: js.UndefOr[PolicyType] = js.undefined
    ): GetKeyPolicyResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Policy" -> Policy.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetKeyPolicyResponse]
    }
  }

  @js.native
  trait GetKeyRotationStatusRequest extends js.Object {
    var KeyId: KeyIdType
  }

  object GetKeyRotationStatusRequest {
    def apply(
      KeyId: js.UndefOr[KeyIdType] = js.undefined
    ): GetKeyRotationStatusRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("KeyId" -> KeyId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetKeyRotationStatusRequest]
    }
  }

  @js.native
  trait GetKeyRotationStatusResponse extends js.Object {
    var KeyRotationEnabled: BooleanType
  }

  object GetKeyRotationStatusResponse {
    def apply(
      KeyRotationEnabled: js.UndefOr[BooleanType] = js.undefined
    ): GetKeyRotationStatusResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("KeyRotationEnabled" -> KeyRotationEnabled.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetKeyRotationStatusResponse]
    }
  }

  @js.native
  trait GetParametersForImportRequest extends js.Object {
    var KeyId: KeyIdType
    var WrappingAlgorithm: AlgorithmSpec
    var WrappingKeySpec: WrappingKeySpec
  }

  object GetParametersForImportRequest {
    def apply(
      KeyId: js.UndefOr[KeyIdType] = js.undefined,
      WrappingAlgorithm: js.UndefOr[AlgorithmSpec] = js.undefined,
      WrappingKeySpec: js.UndefOr[WrappingKeySpec] = js.undefined
    ): GetParametersForImportRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("KeyId" -> KeyId.map { x => x: js.Any }),
        ("WrappingAlgorithm" -> WrappingAlgorithm.map { x => x: js.Any }),
        ("WrappingKeySpec" -> WrappingKeySpec.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetParametersForImportRequest]
    }
  }

  @js.native
  trait GetParametersForImportResponse extends js.Object {
    var KeyId: KeyIdType
    var ImportToken: CiphertextType
    var PublicKey: PlaintextType
    var ParametersValidTo: DateType
  }

  object GetParametersForImportResponse {
    def apply(
      KeyId: js.UndefOr[KeyIdType] = js.undefined,
      ImportToken: js.UndefOr[CiphertextType] = js.undefined,
      PublicKey: js.UndefOr[PlaintextType] = js.undefined,
      ParametersValidTo: js.UndefOr[DateType] = js.undefined
    ): GetParametersForImportResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("KeyId" -> KeyId.map { x => x: js.Any }),
        ("ImportToken" -> ImportToken.map { x => x: js.Any }),
        ("PublicKey" -> PublicKey.map { x => x: js.Any }),
        ("ParametersValidTo" -> ParametersValidTo.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetParametersForImportResponse]
    }
  }

  /**
   * <p>A structure for specifying the conditions under which the operations permitted by the grant are allowed.</p> <p>You can use this structure to allow the operations permitted by the grant only when a specified encryption context is present. For more information about encryption context, see <a href="http://docs.aws.amazon.com/kms/latest/developerguide/encryption-context.html">Encryption Context</a> in the <i>AWS Key Management Service Developer Guide</i>.</p>
   */
  @js.native
  trait GrantConstraints extends js.Object {
    var EncryptionContextSubset: EncryptionContextType
    var EncryptionContextEquals: EncryptionContextType
  }

  object GrantConstraints {
    def apply(
      EncryptionContextSubset: js.UndefOr[EncryptionContextType] = js.undefined,
      EncryptionContextEquals: js.UndefOr[EncryptionContextType] = js.undefined
    ): GrantConstraints = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("EncryptionContextSubset" -> EncryptionContextSubset.map { x => x: js.Any }),
        ("EncryptionContextEquals" -> EncryptionContextEquals.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GrantConstraints]
    }
  }

  /**
   * <p>Contains information about an entry in a list of grants.</p>
   */
  @js.native
  trait GrantListEntry extends js.Object {
    var CreationDate: DateType
    var Operations: GrantOperationList
    var RetiringPrincipal: PrincipalIdType
    var Name: GrantNameType
    var Constraints: GrantConstraints
    var GrantId: GrantIdType
    var KeyId: KeyIdType
    var GranteePrincipal: PrincipalIdType
    var IssuingAccount: PrincipalIdType
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
      IssuingAccount: js.UndefOr[PrincipalIdType] = js.undefined
    ): GrantListEntry = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("CreationDate" -> CreationDate.map { x => x: js.Any }),
        ("Operations" -> Operations.map { x => x: js.Any }),
        ("RetiringPrincipal" -> RetiringPrincipal.map { x => x: js.Any }),
        ("Name" -> Name.map { x => x: js.Any }),
        ("Constraints" -> Constraints.map { x => x: js.Any }),
        ("GrantId" -> GrantId.map { x => x: js.Any }),
        ("KeyId" -> KeyId.map { x => x: js.Any }),
        ("GranteePrincipal" -> GranteePrincipal.map { x => x: js.Any }),
        ("IssuingAccount" -> IssuingAccount.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

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
    var ExpirationModel: ExpirationModelType
    var EncryptedKeyMaterial: CiphertextType
    var ImportToken: CiphertextType
    var KeyId: KeyIdType
    var ValidTo: DateType
  }

  object ImportKeyMaterialRequest {
    def apply(
      ExpirationModel: js.UndefOr[ExpirationModelType] = js.undefined,
      EncryptedKeyMaterial: js.UndefOr[CiphertextType] = js.undefined,
      ImportToken: js.UndefOr[CiphertextType] = js.undefined,
      KeyId: js.UndefOr[KeyIdType] = js.undefined,
      ValidTo: js.UndefOr[DateType] = js.undefined
    ): ImportKeyMaterialRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ExpirationModel" -> ExpirationModel.map { x => x: js.Any }),
        ("EncryptedKeyMaterial" -> EncryptedKeyMaterial.map { x => x: js.Any }),
        ("ImportToken" -> ImportToken.map { x => x: js.Any }),
        ("KeyId" -> KeyId.map { x => x: js.Any }),
        ("ValidTo" -> ValidTo.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ImportKeyMaterialRequest]
    }
  }

  @js.native
  trait ImportKeyMaterialResponse extends js.Object {

  }

  object ImportKeyMaterialResponse {
    def apply(

    ): ImportKeyMaterialResponse = {
      val _fields = IndexedSeq[(String, js.Any)](

      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ImportKeyMaterialResponse]
    }
  }

  /**
   * <p>The request was rejected because the provided key material is invalid or is not the same key material that was previously imported into this customer master key (CMK).</p>
   */
  @js.native
  trait IncorrectKeyMaterialExceptionException extends js.Object {
    var message: ErrorMessageType
  }

  /**
   * <p>The request was rejected because the specified alias name is not valid.</p>
   */
  @js.native
  trait InvalidAliasNameExceptionException extends js.Object {
    var message: ErrorMessageType
  }

  /**
   * <p>The request was rejected because a specified ARN was not valid.</p>
   */
  @js.native
  trait InvalidArnExceptionException extends js.Object {
    var message: ErrorMessageType
  }

  /**
   * <p>The request was rejected because the specified ciphertext has been corrupted or is otherwise invalid.</p>
   */
  @js.native
  trait InvalidCiphertextExceptionException extends js.Object {
    var message: ErrorMessageType
  }

  /**
   * <p>The request was rejected because the specified <code>GrantId</code> is not valid.</p>
   */
  @js.native
  trait InvalidGrantIdExceptionException extends js.Object {
    var message: ErrorMessageType
  }

  /**
   * <p>The request was rejected because the specified grant token is not valid.</p>
   */
  @js.native
  trait InvalidGrantTokenExceptionException extends js.Object {
    var message: ErrorMessageType
  }

  /**
   * <p>The request was rejected because the provided import token is invalid or is associated with a different customer master key (CMK).</p>
   */
  @js.native
  trait InvalidImportTokenExceptionException extends js.Object {
    var message: ErrorMessageType
  }

  /**
   * <p>The request was rejected because the specified <code>KeySpec</code> value is not valid.</p>
   */
  @js.native
  trait InvalidKeyUsageExceptionException extends js.Object {
    var message: ErrorMessageType
  }

  /**
   * <p>The request was rejected because the marker that specifies where pagination should next begin is not valid.</p>
   */
  @js.native
  trait InvalidMarkerExceptionException extends js.Object {
    var message: ErrorMessageType
  }

  /**
   * <p>The request was rejected because an internal exception occurred. The request can be retried.</p>
   */
  @js.native
  trait KMSInternalExceptionException extends js.Object {
    var message: ErrorMessageType
  }

  /**
   * <p>The request was rejected because the state of the specified resource is not valid for this request.</p> <p>For more information about how key state affects the use of a CMK, see <a href="http://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">How Key State Affects Use of a Customer Master Key</a> in the <i>AWS Key Management Service Developer Guide</i>.</p>
   */
  @js.native
  trait KMSInvalidStateExceptionException extends js.Object {
    var message: ErrorMessageType
  }

  /**
   * <p>Contains information about each entry in the key list.</p>
   */
  @js.native
  trait KeyListEntry extends js.Object {
    var KeyId: KeyIdType
    var KeyArn: ArnType
  }

  object KeyListEntry {
    def apply(
      KeyId: js.UndefOr[KeyIdType] = js.undefined,
      KeyArn: js.UndefOr[ArnType] = js.undefined
    ): KeyListEntry = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("KeyId" -> KeyId.map { x => x: js.Any }),
        ("KeyArn" -> KeyArn.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[KeyListEntry]
    }
  }

  /**
   * <p>Contains metadata about a customer master key (CMK).</p> <p>This data type is used as a response element for the <a>CreateKey</a> and <a>DescribeKey</a> operations.</p>
   */
  @js.native
  trait KeyMetadata extends js.Object {
    var CreationDate: DateType
    var ExpirationModel: ExpirationModelType
    var KeyUsage: KeyUsageType
    var Enabled: BooleanType
    var Origin: OriginType
    var Description: DescriptionType
    var AWSAccountId: AWSAccountIdType
    var Arn: ArnType
    var KeyState: KeyState
    var KeyId: KeyIdType
    var ValidTo: DateType
    var DeletionDate: DateType
  }

  object KeyMetadata {
    def apply(
      CreationDate: js.UndefOr[DateType] = js.undefined,
      ExpirationModel: js.UndefOr[ExpirationModelType] = js.undefined,
      KeyUsage: js.UndefOr[KeyUsageType] = js.undefined,
      Enabled: js.UndefOr[BooleanType] = js.undefined,
      Origin: js.UndefOr[OriginType] = js.undefined,
      Description: js.UndefOr[DescriptionType] = js.undefined,
      AWSAccountId: js.UndefOr[AWSAccountIdType] = js.undefined,
      Arn: js.UndefOr[ArnType] = js.undefined,
      KeyState: js.UndefOr[KeyState] = js.undefined,
      KeyId: js.UndefOr[KeyIdType] = js.undefined,
      ValidTo: js.UndefOr[DateType] = js.undefined,
      DeletionDate: js.UndefOr[DateType] = js.undefined
    ): KeyMetadata = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("CreationDate" -> CreationDate.map { x => x: js.Any }),
        ("ExpirationModel" -> ExpirationModel.map { x => x: js.Any }),
        ("KeyUsage" -> KeyUsage.map { x => x: js.Any }),
        ("Enabled" -> Enabled.map { x => x: js.Any }),
        ("Origin" -> Origin.map { x => x: js.Any }),
        ("Description" -> Description.map { x => x: js.Any }),
        ("AWSAccountId" -> AWSAccountId.map { x => x: js.Any }),
        ("Arn" -> Arn.map { x => x: js.Any }),
        ("KeyState" -> KeyState.map { x => x: js.Any }),
        ("KeyId" -> KeyId.map { x => x: js.Any }),
        ("ValidTo" -> ValidTo.map { x => x: js.Any }),
        ("DeletionDate" -> DeletionDate.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[KeyMetadata]
    }
  }


  object KeyStateEnum {
    val Enabled = "Enabled"
    val Disabled = "Disabled"
    val PendingDeletion = "PendingDeletion"
    val PendingImport = "PendingImport"

    val values = IndexedSeq(Enabled, Disabled, PendingDeletion, PendingImport)
  }

  /**
   * <p>The request was rejected because the specified CMK was not available. The request can be retried.</p>
   */
  @js.native
  trait KeyUnavailableExceptionException extends js.Object {
    var message: ErrorMessageType
  }


  object KeyUsageTypeEnum {
    val `ENCRYPT_DECRYPT` = "ENCRYPT_DECRYPT"

    val values = IndexedSeq(`ENCRYPT_DECRYPT`)
  }

  /**
   * <p>The request was rejected because a limit was exceeded. For more information, see <a href="http://docs.aws.amazon.com/kms/latest/developerguide/limits.html">Limits</a> in the <i>AWS Key Management Service Developer Guide</i>.</p>
   */
  @js.native
  trait LimitExceededExceptionException extends js.Object {
    var message: ErrorMessageType
  }

  @js.native
  trait ListAliasesRequest extends js.Object {
    var Limit: LimitType
    var Marker: MarkerType
  }

  object ListAliasesRequest {
    def apply(
      Limit: js.UndefOr[LimitType] = js.undefined,
      Marker: js.UndefOr[MarkerType] = js.undefined
    ): ListAliasesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Limit" -> Limit.map { x => x: js.Any }),
        ("Marker" -> Marker.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListAliasesRequest]
    }
  }

  @js.native
  trait ListAliasesResponse extends js.Object {
    var Aliases: AliasList
    var NextMarker: MarkerType
    var Truncated: BooleanType
  }

  object ListAliasesResponse {
    def apply(
      Aliases: js.UndefOr[AliasList] = js.undefined,
      NextMarker: js.UndefOr[MarkerType] = js.undefined,
      Truncated: js.UndefOr[BooleanType] = js.undefined
    ): ListAliasesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Aliases" -> Aliases.map { x => x: js.Any }),
        ("NextMarker" -> NextMarker.map { x => x: js.Any }),
        ("Truncated" -> Truncated.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListAliasesResponse]
    }
  }

  @js.native
  trait ListGrantsRequest extends js.Object {
    var Limit: LimitType
    var Marker: MarkerType
    var KeyId: KeyIdType
  }

  object ListGrantsRequest {
    def apply(
      Limit: js.UndefOr[LimitType] = js.undefined,
      Marker: js.UndefOr[MarkerType] = js.undefined,
      KeyId: js.UndefOr[KeyIdType] = js.undefined
    ): ListGrantsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Limit" -> Limit.map { x => x: js.Any }),
        ("Marker" -> Marker.map { x => x: js.Any }),
        ("KeyId" -> KeyId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListGrantsRequest]
    }
  }

  @js.native
  trait ListGrantsResponse extends js.Object {
    var Grants: GrantList
    var NextMarker: MarkerType
    var Truncated: BooleanType
  }

  object ListGrantsResponse {
    def apply(
      Grants: js.UndefOr[GrantList] = js.undefined,
      NextMarker: js.UndefOr[MarkerType] = js.undefined,
      Truncated: js.UndefOr[BooleanType] = js.undefined
    ): ListGrantsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Grants" -> Grants.map { x => x: js.Any }),
        ("NextMarker" -> NextMarker.map { x => x: js.Any }),
        ("Truncated" -> Truncated.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListGrantsResponse]
    }
  }

  @js.native
  trait ListKeyPoliciesRequest extends js.Object {
    var KeyId: KeyIdType
    var Limit: LimitType
    var Marker: MarkerType
  }

  object ListKeyPoliciesRequest {
    def apply(
      KeyId: js.UndefOr[KeyIdType] = js.undefined,
      Limit: js.UndefOr[LimitType] = js.undefined,
      Marker: js.UndefOr[MarkerType] = js.undefined
    ): ListKeyPoliciesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("KeyId" -> KeyId.map { x => x: js.Any }),
        ("Limit" -> Limit.map { x => x: js.Any }),
        ("Marker" -> Marker.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListKeyPoliciesRequest]
    }
  }

  @js.native
  trait ListKeyPoliciesResponse extends js.Object {
    var PolicyNames: PolicyNameList
    var NextMarker: MarkerType
    var Truncated: BooleanType
  }

  object ListKeyPoliciesResponse {
    def apply(
      PolicyNames: js.UndefOr[PolicyNameList] = js.undefined,
      NextMarker: js.UndefOr[MarkerType] = js.undefined,
      Truncated: js.UndefOr[BooleanType] = js.undefined
    ): ListKeyPoliciesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("PolicyNames" -> PolicyNames.map { x => x: js.Any }),
        ("NextMarker" -> NextMarker.map { x => x: js.Any }),
        ("Truncated" -> Truncated.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListKeyPoliciesResponse]
    }
  }

  @js.native
  trait ListKeysRequest extends js.Object {
    var Limit: LimitType
    var Marker: MarkerType
  }

  object ListKeysRequest {
    def apply(
      Limit: js.UndefOr[LimitType] = js.undefined,
      Marker: js.UndefOr[MarkerType] = js.undefined
    ): ListKeysRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Limit" -> Limit.map { x => x: js.Any }),
        ("Marker" -> Marker.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListKeysRequest]
    }
  }

  @js.native
  trait ListKeysResponse extends js.Object {
    var Keys: KeyList
    var NextMarker: MarkerType
    var Truncated: BooleanType
  }

  object ListKeysResponse {
    def apply(
      Keys: js.UndefOr[KeyList] = js.undefined,
      NextMarker: js.UndefOr[MarkerType] = js.undefined,
      Truncated: js.UndefOr[BooleanType] = js.undefined
    ): ListKeysResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Keys" -> Keys.map { x => x: js.Any }),
        ("NextMarker" -> NextMarker.map { x => x: js.Any }),
        ("Truncated" -> Truncated.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListKeysResponse]
    }
  }

  @js.native
  trait ListRetirableGrantsRequest extends js.Object {
    var Limit: LimitType
    var Marker: MarkerType
    var RetiringPrincipal: PrincipalIdType
  }

  object ListRetirableGrantsRequest {
    def apply(
      Limit: js.UndefOr[LimitType] = js.undefined,
      Marker: js.UndefOr[MarkerType] = js.undefined,
      RetiringPrincipal: js.UndefOr[PrincipalIdType] = js.undefined
    ): ListRetirableGrantsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Limit" -> Limit.map { x => x: js.Any }),
        ("Marker" -> Marker.map { x => x: js.Any }),
        ("RetiringPrincipal" -> RetiringPrincipal.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListRetirableGrantsRequest]
    }
  }

  /**
   * <p>The request was rejected because the specified policy is not syntactically or semantically correct.</p>
   */
  @js.native
  trait MalformedPolicyDocumentExceptionException extends js.Object {
    var message: ErrorMessageType
  }

  /**
   * <p>The request was rejected because the specified entity or resource could not be found.</p>
   */
  @js.native
  trait NotFoundExceptionException extends js.Object {
    var message: ErrorMessageType
  }


  object OriginTypeEnum {
    val `AWS_KMS` = "AWS_KMS"
    val EXTERNAL = "EXTERNAL"

    val values = IndexedSeq(`AWS_KMS`, EXTERNAL)
  }

  @js.native
  trait PutKeyPolicyRequest extends js.Object {
    var KeyId: KeyIdType
    var PolicyName: PolicyNameType
    var Policy: PolicyType
    var BypassPolicyLockoutSafetyCheck: BooleanType
  }

  object PutKeyPolicyRequest {
    def apply(
      KeyId: js.UndefOr[KeyIdType] = js.undefined,
      PolicyName: js.UndefOr[PolicyNameType] = js.undefined,
      Policy: js.UndefOr[PolicyType] = js.undefined,
      BypassPolicyLockoutSafetyCheck: js.UndefOr[BooleanType] = js.undefined
    ): PutKeyPolicyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("KeyId" -> KeyId.map { x => x: js.Any }),
        ("PolicyName" -> PolicyName.map { x => x: js.Any }),
        ("Policy" -> Policy.map { x => x: js.Any }),
        ("BypassPolicyLockoutSafetyCheck" -> BypassPolicyLockoutSafetyCheck.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutKeyPolicyRequest]
    }
  }

  @js.native
  trait ReEncryptRequest extends js.Object {
    var SourceEncryptionContext: EncryptionContextType
    var GrantTokens: GrantTokenList
    var DestinationKeyId: KeyIdType
    var CiphertextBlob: CiphertextType
    var DestinationEncryptionContext: EncryptionContextType
  }

  object ReEncryptRequest {
    def apply(
      SourceEncryptionContext: js.UndefOr[EncryptionContextType] = js.undefined,
      GrantTokens: js.UndefOr[GrantTokenList] = js.undefined,
      DestinationKeyId: js.UndefOr[KeyIdType] = js.undefined,
      CiphertextBlob: js.UndefOr[CiphertextType] = js.undefined,
      DestinationEncryptionContext: js.UndefOr[EncryptionContextType] = js.undefined
    ): ReEncryptRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("SourceEncryptionContext" -> SourceEncryptionContext.map { x => x: js.Any }),
        ("GrantTokens" -> GrantTokens.map { x => x: js.Any }),
        ("DestinationKeyId" -> DestinationKeyId.map { x => x: js.Any }),
        ("CiphertextBlob" -> CiphertextBlob.map { x => x: js.Any }),
        ("DestinationEncryptionContext" -> DestinationEncryptionContext.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReEncryptRequest]
    }
  }

  @js.native
  trait ReEncryptResponse extends js.Object {
    var CiphertextBlob: CiphertextType
    var SourceKeyId: KeyIdType
    var KeyId: KeyIdType
  }

  object ReEncryptResponse {
    def apply(
      CiphertextBlob: js.UndefOr[CiphertextType] = js.undefined,
      SourceKeyId: js.UndefOr[KeyIdType] = js.undefined,
      KeyId: js.UndefOr[KeyIdType] = js.undefined
    ): ReEncryptResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("CiphertextBlob" -> CiphertextBlob.map { x => x: js.Any }),
        ("SourceKeyId" -> SourceKeyId.map { x => x: js.Any }),
        ("KeyId" -> KeyId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReEncryptResponse]
    }
  }

  @js.native
  trait RetireGrantRequest extends js.Object {
    var GrantToken: GrantTokenType
    var KeyId: KeyIdType
    var GrantId: GrantIdType
  }

  object RetireGrantRequest {
    def apply(
      GrantToken: js.UndefOr[GrantTokenType] = js.undefined,
      KeyId: js.UndefOr[KeyIdType] = js.undefined,
      GrantId: js.UndefOr[GrantIdType] = js.undefined
    ): RetireGrantRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("GrantToken" -> GrantToken.map { x => x: js.Any }),
        ("KeyId" -> KeyId.map { x => x: js.Any }),
        ("GrantId" -> GrantId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RetireGrantRequest]
    }
  }

  @js.native
  trait RevokeGrantRequest extends js.Object {
    var KeyId: KeyIdType
    var GrantId: GrantIdType
  }

  object RevokeGrantRequest {
    def apply(
      KeyId: js.UndefOr[KeyIdType] = js.undefined,
      GrantId: js.UndefOr[GrantIdType] = js.undefined
    ): RevokeGrantRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("KeyId" -> KeyId.map { x => x: js.Any }),
        ("GrantId" -> GrantId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RevokeGrantRequest]
    }
  }

  @js.native
  trait ScheduleKeyDeletionRequest extends js.Object {
    var KeyId: KeyIdType
    var PendingWindowInDays: PendingWindowInDaysType
  }

  object ScheduleKeyDeletionRequest {
    def apply(
      KeyId: js.UndefOr[KeyIdType] = js.undefined,
      PendingWindowInDays: js.UndefOr[PendingWindowInDaysType] = js.undefined
    ): ScheduleKeyDeletionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("KeyId" -> KeyId.map { x => x: js.Any }),
        ("PendingWindowInDays" -> PendingWindowInDays.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ScheduleKeyDeletionRequest]
    }
  }

  @js.native
  trait ScheduleKeyDeletionResponse extends js.Object {
    var KeyId: KeyIdType
    var DeletionDate: DateType
  }

  object ScheduleKeyDeletionResponse {
    def apply(
      KeyId: js.UndefOr[KeyIdType] = js.undefined,
      DeletionDate: js.UndefOr[DateType] = js.undefined
    ): ScheduleKeyDeletionResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("KeyId" -> KeyId.map { x => x: js.Any }),
        ("DeletionDate" -> DeletionDate.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ScheduleKeyDeletionResponse]
    }
  }

  /**
   * <p>The request was rejected because a specified parameter is not supported or a specified resource is not valid for this operation.</p>
   */
  @js.native
  trait UnsupportedOperationExceptionException extends js.Object {
    var message: ErrorMessageType
  }

  @js.native
  trait UpdateAliasRequest extends js.Object {
    var AliasName: AliasNameType
    var TargetKeyId: KeyIdType
  }

  object UpdateAliasRequest {
    def apply(
      AliasName: js.UndefOr[AliasNameType] = js.undefined,
      TargetKeyId: js.UndefOr[KeyIdType] = js.undefined
    ): UpdateAliasRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("AliasName" -> AliasName.map { x => x: js.Any }),
        ("TargetKeyId" -> TargetKeyId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateAliasRequest]
    }
  }

  @js.native
  trait UpdateKeyDescriptionRequest extends js.Object {
    var KeyId: KeyIdType
    var Description: DescriptionType
  }

  object UpdateKeyDescriptionRequest {
    def apply(
      KeyId: js.UndefOr[KeyIdType] = js.undefined,
      Description: js.UndefOr[DescriptionType] = js.undefined
    ): UpdateKeyDescriptionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("KeyId" -> KeyId.map { x => x: js.Any }),
        ("Description" -> Description.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateKeyDescriptionRequest]
    }
  }


  object WrappingKeySpecEnum {
    val `RSA_2048` = "RSA_2048"

    val values = IndexedSeq(`RSA_2048`)
  }
}
