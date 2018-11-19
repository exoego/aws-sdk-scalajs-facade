package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import io.scalajs.nodejs
import facade.amazonaws._

package object secretsmanager {
  type AutomaticallyRotateAfterDaysType = Double
  type BooleanType = Boolean
  type ClientRequestTokenType = String
  type CreatedDateType = js.Date
  type DeletedDateType = js.Date
  type DeletionDateType = js.Date
  type DescriptionType = String
  type ExcludeCharactersType = String
  type ExcludeLowercaseType = Boolean
  type ExcludeNumbersType = Boolean
  type ExcludePunctuationType = Boolean
  type ExcludeUppercaseType = Boolean
  type IncludeSpaceType = Boolean
  type KmsKeyIdType = String
  type LastAccessedDateType = js.Date
  type LastChangedDateType = js.Date
  type LastRotatedDateType = js.Date
  type MaxResultsType = Int
  type NameType = String
  type NextTokenType = String
  type NonEmptyResourcePolicyType = String
  type PasswordLengthType = Double
  type RandomPasswordType = String
  type RecoveryWindowInDaysType = Double
  type RequireEachIncludedTypeType = Boolean
  type RotationEnabledType = Boolean
  type RotationLambdaARNType = String
  type SecretARNType = String
  type SecretBinaryType = nodejs.buffer.Buffer | nodejs.stream.Readable | js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type SecretIdType = String
  type SecretListType = js.Array[SecretListEntry]
  type SecretNameType = String
  type SecretStringType = String
  type SecretVersionIdType = String
  type SecretVersionStageType = String
  type SecretVersionStagesType = js.Array[SecretVersionStageType]
  type SecretVersionsListType = js.Array[SecretVersionsListEntry]
  type SecretVersionsToStagesMapType = js.Dictionary[SecretVersionStagesType]
  type TagKeyListType = js.Array[TagKeyType]
  type TagKeyType = String
  type TagListType = js.Array[Tag]
  type TagValueType = String
}

package secretsmanager {
  @js.native
  @JSImport("aws-sdk", "SecretsManager")
  class SecretsManager(config: AWSConfig) extends js.Object {
    def cancelRotateSecret(params: CancelRotateSecretRequest): Request[CancelRotateSecretResponse] = js.native
    def createSecret(params: CreateSecretRequest): Request[CreateSecretResponse] = js.native
    def deleteResourcePolicy(params: DeleteResourcePolicyRequest): Request[DeleteResourcePolicyResponse] = js.native
    def deleteSecret(params: DeleteSecretRequest): Request[DeleteSecretResponse] = js.native
    def describeSecret(params: DescribeSecretRequest): Request[DescribeSecretResponse] = js.native
    def getRandomPassword(params: GetRandomPasswordRequest): Request[GetRandomPasswordResponse] = js.native
    def getResourcePolicy(params: GetResourcePolicyRequest): Request[GetResourcePolicyResponse] = js.native
    def getSecretValue(params: GetSecretValueRequest): Request[GetSecretValueResponse] = js.native
    def listSecretVersionIds(params: ListSecretVersionIdsRequest): Request[ListSecretVersionIdsResponse] = js.native
    def listSecrets(params: ListSecretsRequest): Request[ListSecretsResponse] = js.native
    def putResourcePolicy(params: PutResourcePolicyRequest): Request[PutResourcePolicyResponse] = js.native
    def putSecretValue(params: PutSecretValueRequest): Request[PutSecretValueResponse] = js.native
    def restoreSecret(params: RestoreSecretRequest): Request[RestoreSecretResponse] = js.native
    def rotateSecret(params: RotateSecretRequest): Request[RotateSecretResponse] = js.native
    def tagResource(params: TagResourceRequest): Request[js.Object] = js.native
    def untagResource(params: UntagResourceRequest): Request[js.Object] = js.native
    def updateSecret(params: UpdateSecretRequest): Request[UpdateSecretResponse] = js.native
    def updateSecretVersionStage(params: UpdateSecretVersionStageRequest): Request[UpdateSecretVersionStageResponse] = js.native
  }

  @js.native
  trait CancelRotateSecretRequest extends js.Object {
    var SecretId: js.UndefOr[SecretIdType]
  }

  object CancelRotateSecretRequest {
    def apply(
      SecretId: js.UndefOr[SecretIdType] = js.undefined): CancelRotateSecretRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SecretId" -> SecretId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CancelRotateSecretRequest]
    }
  }

  @js.native
  trait CancelRotateSecretResponse extends js.Object {
    var ARN: js.UndefOr[SecretARNType]
    var Name: js.UndefOr[SecretNameType]
    var VersionId: js.UndefOr[SecretVersionIdType]
  }

  object CancelRotateSecretResponse {
    def apply(
      ARN: js.UndefOr[SecretARNType] = js.undefined,
      Name: js.UndefOr[SecretNameType] = js.undefined,
      VersionId: js.UndefOr[SecretVersionIdType] = js.undefined): CancelRotateSecretResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ARN" -> ARN.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "VersionId" -> VersionId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CancelRotateSecretResponse]
    }
  }

  @js.native
  trait CreateSecretRequest extends js.Object {
    var Name: js.UndefOr[NameType]
    var Description: js.UndefOr[DescriptionType]
    var KmsKeyId: js.UndefOr[KmsKeyIdType]
    var SecretBinary: js.UndefOr[SecretBinaryType]
    var SecretString: js.UndefOr[SecretStringType]
    var ClientRequestToken: js.UndefOr[ClientRequestTokenType]
    var Tags: js.UndefOr[TagListType]
  }

  object CreateSecretRequest {
    def apply(
      Name: js.UndefOr[NameType] = js.undefined,
      Description: js.UndefOr[DescriptionType] = js.undefined,
      KmsKeyId: js.UndefOr[KmsKeyIdType] = js.undefined,
      SecretBinary: js.UndefOr[SecretBinaryType] = js.undefined,
      SecretString: js.UndefOr[SecretStringType] = js.undefined,
      ClientRequestToken: js.UndefOr[ClientRequestTokenType] = js.undefined,
      Tags: js.UndefOr[TagListType] = js.undefined): CreateSecretRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "KmsKeyId" -> KmsKeyId.map { x => x.asInstanceOf[js.Any] },
        "SecretBinary" -> SecretBinary.map { x => x.asInstanceOf[js.Any] },
        "SecretString" -> SecretString.map { x => x.asInstanceOf[js.Any] },
        "ClientRequestToken" -> ClientRequestToken.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateSecretRequest]
    }
  }

  @js.native
  trait CreateSecretResponse extends js.Object {
    var ARN: js.UndefOr[SecretARNType]
    var Name: js.UndefOr[SecretNameType]
    var VersionId: js.UndefOr[SecretVersionIdType]
  }

  object CreateSecretResponse {
    def apply(
      ARN: js.UndefOr[SecretARNType] = js.undefined,
      Name: js.UndefOr[SecretNameType] = js.undefined,
      VersionId: js.UndefOr[SecretVersionIdType] = js.undefined): CreateSecretResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ARN" -> ARN.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "VersionId" -> VersionId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateSecretResponse]
    }
  }

  @js.native
  trait DeleteResourcePolicyRequest extends js.Object {
    var SecretId: js.UndefOr[SecretIdType]
  }

  object DeleteResourcePolicyRequest {
    def apply(
      SecretId: js.UndefOr[SecretIdType] = js.undefined): DeleteResourcePolicyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SecretId" -> SecretId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteResourcePolicyRequest]
    }
  }

  @js.native
  trait DeleteResourcePolicyResponse extends js.Object {
    var ARN: js.UndefOr[SecretARNType]
    var Name: js.UndefOr[NameType]
  }

  object DeleteResourcePolicyResponse {
    def apply(
      ARN: js.UndefOr[SecretARNType] = js.undefined,
      Name: js.UndefOr[NameType] = js.undefined): DeleteResourcePolicyResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ARN" -> ARN.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteResourcePolicyResponse]
    }
  }

  @js.native
  trait DeleteSecretRequest extends js.Object {
    var SecretId: js.UndefOr[SecretIdType]
    var RecoveryWindowInDays: js.UndefOr[RecoveryWindowInDaysType]
    var ForceDeleteWithoutRecovery: js.UndefOr[BooleanType]
  }

  object DeleteSecretRequest {
    def apply(
      SecretId: js.UndefOr[SecretIdType] = js.undefined,
      RecoveryWindowInDays: js.UndefOr[RecoveryWindowInDaysType] = js.undefined,
      ForceDeleteWithoutRecovery: js.UndefOr[BooleanType] = js.undefined): DeleteSecretRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SecretId" -> SecretId.map { x => x.asInstanceOf[js.Any] },
        "RecoveryWindowInDays" -> RecoveryWindowInDays.map { x => x.asInstanceOf[js.Any] },
        "ForceDeleteWithoutRecovery" -> ForceDeleteWithoutRecovery.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteSecretRequest]
    }
  }

  @js.native
  trait DeleteSecretResponse extends js.Object {
    var ARN: js.UndefOr[SecretARNType]
    var Name: js.UndefOr[SecretNameType]
    var DeletionDate: js.UndefOr[DeletionDateType]
  }

  object DeleteSecretResponse {
    def apply(
      ARN: js.UndefOr[SecretARNType] = js.undefined,
      Name: js.UndefOr[SecretNameType] = js.undefined,
      DeletionDate: js.UndefOr[DeletionDateType] = js.undefined): DeleteSecretResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ARN" -> ARN.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "DeletionDate" -> DeletionDate.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteSecretResponse]
    }
  }

  @js.native
  trait DescribeSecretRequest extends js.Object {
    var SecretId: js.UndefOr[SecretIdType]
  }

  object DescribeSecretRequest {
    def apply(
      SecretId: js.UndefOr[SecretIdType] = js.undefined): DescribeSecretRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SecretId" -> SecretId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeSecretRequest]
    }
  }

  @js.native
  trait DescribeSecretResponse extends js.Object {
    var ARN: js.UndefOr[SecretARNType]
    var Name: js.UndefOr[SecretNameType]
    var LastChangedDate: js.UndefOr[LastChangedDateType]
    var Description: js.UndefOr[DescriptionType]
    var KmsKeyId: js.UndefOr[KmsKeyIdType]
    var RotationLambdaARN: js.UndefOr[RotationLambdaARNType]
    var VersionIdsToStages: js.UndefOr[SecretVersionsToStagesMapType]
    var RotationRules: js.UndefOr[RotationRulesType]
    var LastRotatedDate: js.UndefOr[LastRotatedDateType]
    var Tags: js.UndefOr[TagListType]
    var DeletedDate: js.UndefOr[DeletedDateType]
    var LastAccessedDate: js.UndefOr[LastAccessedDateType]
    var RotationEnabled: js.UndefOr[RotationEnabledType]
  }

  object DescribeSecretResponse {
    def apply(
      ARN: js.UndefOr[SecretARNType] = js.undefined,
      Name: js.UndefOr[SecretNameType] = js.undefined,
      LastChangedDate: js.UndefOr[LastChangedDateType] = js.undefined,
      Description: js.UndefOr[DescriptionType] = js.undefined,
      KmsKeyId: js.UndefOr[KmsKeyIdType] = js.undefined,
      RotationLambdaARN: js.UndefOr[RotationLambdaARNType] = js.undefined,
      VersionIdsToStages: js.UndefOr[SecretVersionsToStagesMapType] = js.undefined,
      RotationRules: js.UndefOr[RotationRulesType] = js.undefined,
      LastRotatedDate: js.UndefOr[LastRotatedDateType] = js.undefined,
      Tags: js.UndefOr[TagListType] = js.undefined,
      DeletedDate: js.UndefOr[DeletedDateType] = js.undefined,
      LastAccessedDate: js.UndefOr[LastAccessedDateType] = js.undefined,
      RotationEnabled: js.UndefOr[RotationEnabledType] = js.undefined): DescribeSecretResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ARN" -> ARN.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "LastChangedDate" -> LastChangedDate.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "KmsKeyId" -> KmsKeyId.map { x => x.asInstanceOf[js.Any] },
        "RotationLambdaARN" -> RotationLambdaARN.map { x => x.asInstanceOf[js.Any] },
        "VersionIdsToStages" -> VersionIdsToStages.map { x => x.asInstanceOf[js.Any] },
        "RotationRules" -> RotationRules.map { x => x.asInstanceOf[js.Any] },
        "LastRotatedDate" -> LastRotatedDate.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] },
        "DeletedDate" -> DeletedDate.map { x => x.asInstanceOf[js.Any] },
        "LastAccessedDate" -> LastAccessedDate.map { x => x.asInstanceOf[js.Any] },
        "RotationEnabled" -> RotationEnabled.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeSecretResponse]
    }
  }

  @js.native
  trait GetRandomPasswordRequest extends js.Object {
    var IncludeSpace: js.UndefOr[IncludeSpaceType]
    var ExcludeNumbers: js.UndefOr[ExcludeNumbersType]
    var PasswordLength: js.UndefOr[PasswordLengthType]
    var ExcludeLowercase: js.UndefOr[ExcludeLowercaseType]
    var ExcludeUppercase: js.UndefOr[ExcludeUppercaseType]
    var ExcludePunctuation: js.UndefOr[ExcludePunctuationType]
    var ExcludeCharacters: js.UndefOr[ExcludeCharactersType]
    var RequireEachIncludedType: js.UndefOr[RequireEachIncludedTypeType]
  }

  object GetRandomPasswordRequest {
    def apply(
      IncludeSpace: js.UndefOr[IncludeSpaceType] = js.undefined,
      ExcludeNumbers: js.UndefOr[ExcludeNumbersType] = js.undefined,
      PasswordLength: js.UndefOr[PasswordLengthType] = js.undefined,
      ExcludeLowercase: js.UndefOr[ExcludeLowercaseType] = js.undefined,
      ExcludeUppercase: js.UndefOr[ExcludeUppercaseType] = js.undefined,
      ExcludePunctuation: js.UndefOr[ExcludePunctuationType] = js.undefined,
      ExcludeCharacters: js.UndefOr[ExcludeCharactersType] = js.undefined,
      RequireEachIncludedType: js.UndefOr[RequireEachIncludedTypeType] = js.undefined): GetRandomPasswordRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IncludeSpace" -> IncludeSpace.map { x => x.asInstanceOf[js.Any] },
        "ExcludeNumbers" -> ExcludeNumbers.map { x => x.asInstanceOf[js.Any] },
        "PasswordLength" -> PasswordLength.map { x => x.asInstanceOf[js.Any] },
        "ExcludeLowercase" -> ExcludeLowercase.map { x => x.asInstanceOf[js.Any] },
        "ExcludeUppercase" -> ExcludeUppercase.map { x => x.asInstanceOf[js.Any] },
        "ExcludePunctuation" -> ExcludePunctuation.map { x => x.asInstanceOf[js.Any] },
        "ExcludeCharacters" -> ExcludeCharacters.map { x => x.asInstanceOf[js.Any] },
        "RequireEachIncludedType" -> RequireEachIncludedType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetRandomPasswordRequest]
    }
  }

  @js.native
  trait GetRandomPasswordResponse extends js.Object {
    var RandomPassword: js.UndefOr[RandomPasswordType]
  }

  object GetRandomPasswordResponse {
    def apply(
      RandomPassword: js.UndefOr[RandomPasswordType] = js.undefined): GetRandomPasswordResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RandomPassword" -> RandomPassword.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetRandomPasswordResponse]
    }
  }

  @js.native
  trait GetResourcePolicyRequest extends js.Object {
    var SecretId: js.UndefOr[SecretIdType]
  }

  object GetResourcePolicyRequest {
    def apply(
      SecretId: js.UndefOr[SecretIdType] = js.undefined): GetResourcePolicyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SecretId" -> SecretId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetResourcePolicyRequest]
    }
  }

  @js.native
  trait GetResourcePolicyResponse extends js.Object {
    var ARN: js.UndefOr[SecretARNType]
    var Name: js.UndefOr[NameType]
    var ResourcePolicy: js.UndefOr[NonEmptyResourcePolicyType]
  }

  object GetResourcePolicyResponse {
    def apply(
      ARN: js.UndefOr[SecretARNType] = js.undefined,
      Name: js.UndefOr[NameType] = js.undefined,
      ResourcePolicy: js.UndefOr[NonEmptyResourcePolicyType] = js.undefined): GetResourcePolicyResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ARN" -> ARN.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "ResourcePolicy" -> ResourcePolicy.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetResourcePolicyResponse]
    }
  }

  @js.native
  trait GetSecretValueRequest extends js.Object {
    var SecretId: js.UndefOr[SecretIdType]
    var VersionId: js.UndefOr[SecretVersionIdType]
    var VersionStage: js.UndefOr[SecretVersionStageType]
  }

  object GetSecretValueRequest {
    def apply(
      SecretId: js.UndefOr[SecretIdType] = js.undefined,
      VersionId: js.UndefOr[SecretVersionIdType] = js.undefined,
      VersionStage: js.UndefOr[SecretVersionStageType] = js.undefined): GetSecretValueRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SecretId" -> SecretId.map { x => x.asInstanceOf[js.Any] },
        "VersionId" -> VersionId.map { x => x.asInstanceOf[js.Any] },
        "VersionStage" -> VersionStage.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetSecretValueRequest]
    }
  }

  @js.native
  trait GetSecretValueResponse extends js.Object {
    var VersionStages: js.UndefOr[SecretVersionStagesType]
    var ARN: js.UndefOr[SecretARNType]
    var Name: js.UndefOr[SecretNameType]
    var CreatedDate: js.UndefOr[CreatedDateType]
    var SecretBinary: js.UndefOr[SecretBinaryType]
    var SecretString: js.UndefOr[SecretStringType]
    var VersionId: js.UndefOr[SecretVersionIdType]
  }

  object GetSecretValueResponse {
    def apply(
      VersionStages: js.UndefOr[SecretVersionStagesType] = js.undefined,
      ARN: js.UndefOr[SecretARNType] = js.undefined,
      Name: js.UndefOr[SecretNameType] = js.undefined,
      CreatedDate: js.UndefOr[CreatedDateType] = js.undefined,
      SecretBinary: js.UndefOr[SecretBinaryType] = js.undefined,
      SecretString: js.UndefOr[SecretStringType] = js.undefined,
      VersionId: js.UndefOr[SecretVersionIdType] = js.undefined): GetSecretValueResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "VersionStages" -> VersionStages.map { x => x.asInstanceOf[js.Any] },
        "ARN" -> ARN.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "CreatedDate" -> CreatedDate.map { x => x.asInstanceOf[js.Any] },
        "SecretBinary" -> SecretBinary.map { x => x.asInstanceOf[js.Any] },
        "SecretString" -> SecretString.map { x => x.asInstanceOf[js.Any] },
        "VersionId" -> VersionId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetSecretValueResponse]
    }
  }

  @js.native
  trait ListSecretVersionIdsRequest extends js.Object {
    var SecretId: js.UndefOr[SecretIdType]
    var MaxResults: js.UndefOr[MaxResultsType]
    var NextToken: js.UndefOr[NextTokenType]
    var IncludeDeprecated: js.UndefOr[BooleanType]
  }

  object ListSecretVersionIdsRequest {
    def apply(
      SecretId: js.UndefOr[SecretIdType] = js.undefined,
      MaxResults: js.UndefOr[MaxResultsType] = js.undefined,
      NextToken: js.UndefOr[NextTokenType] = js.undefined,
      IncludeDeprecated: js.UndefOr[BooleanType] = js.undefined): ListSecretVersionIdsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SecretId" -> SecretId.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "IncludeDeprecated" -> IncludeDeprecated.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListSecretVersionIdsRequest]
    }
  }

  @js.native
  trait ListSecretVersionIdsResponse extends js.Object {
    var Versions: js.UndefOr[SecretVersionsListType]
    var NextToken: js.UndefOr[NextTokenType]
    var ARN: js.UndefOr[SecretARNType]
    var Name: js.UndefOr[SecretNameType]
  }

  object ListSecretVersionIdsResponse {
    def apply(
      Versions: js.UndefOr[SecretVersionsListType] = js.undefined,
      NextToken: js.UndefOr[NextTokenType] = js.undefined,
      ARN: js.UndefOr[SecretARNType] = js.undefined,
      Name: js.UndefOr[SecretNameType] = js.undefined): ListSecretVersionIdsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Versions" -> Versions.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "ARN" -> ARN.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListSecretVersionIdsResponse]
    }
  }

  @js.native
  trait ListSecretsRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResultsType]
    var NextToken: js.UndefOr[NextTokenType]
  }

  object ListSecretsRequest {
    def apply(
      MaxResults: js.UndefOr[MaxResultsType] = js.undefined,
      NextToken: js.UndefOr[NextTokenType] = js.undefined): ListSecretsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListSecretsRequest]
    }
  }

  @js.native
  trait ListSecretsResponse extends js.Object {
    var SecretList: js.UndefOr[SecretListType]
    var NextToken: js.UndefOr[NextTokenType]
  }

  object ListSecretsResponse {
    def apply(
      SecretList: js.UndefOr[SecretListType] = js.undefined,
      NextToken: js.UndefOr[NextTokenType] = js.undefined): ListSecretsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SecretList" -> SecretList.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListSecretsResponse]
    }
  }

  @js.native
  trait PutResourcePolicyRequest extends js.Object {
    var SecretId: js.UndefOr[SecretIdType]
    var ResourcePolicy: js.UndefOr[NonEmptyResourcePolicyType]
  }

  object PutResourcePolicyRequest {
    def apply(
      SecretId: js.UndefOr[SecretIdType] = js.undefined,
      ResourcePolicy: js.UndefOr[NonEmptyResourcePolicyType] = js.undefined): PutResourcePolicyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SecretId" -> SecretId.map { x => x.asInstanceOf[js.Any] },
        "ResourcePolicy" -> ResourcePolicy.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutResourcePolicyRequest]
    }
  }

  @js.native
  trait PutResourcePolicyResponse extends js.Object {
    var ARN: js.UndefOr[SecretARNType]
    var Name: js.UndefOr[NameType]
  }

  object PutResourcePolicyResponse {
    def apply(
      ARN: js.UndefOr[SecretARNType] = js.undefined,
      Name: js.UndefOr[NameType] = js.undefined): PutResourcePolicyResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ARN" -> ARN.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutResourcePolicyResponse]
    }
  }

  @js.native
  trait PutSecretValueRequest extends js.Object {
    var VersionStages: js.UndefOr[SecretVersionStagesType]
    var SecretBinary: js.UndefOr[SecretBinaryType]
    var SecretString: js.UndefOr[SecretStringType]
    var ClientRequestToken: js.UndefOr[ClientRequestTokenType]
    var SecretId: js.UndefOr[SecretIdType]
  }

  object PutSecretValueRequest {
    def apply(
      VersionStages: js.UndefOr[SecretVersionStagesType] = js.undefined,
      SecretBinary: js.UndefOr[SecretBinaryType] = js.undefined,
      SecretString: js.UndefOr[SecretStringType] = js.undefined,
      ClientRequestToken: js.UndefOr[ClientRequestTokenType] = js.undefined,
      SecretId: js.UndefOr[SecretIdType] = js.undefined): PutSecretValueRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "VersionStages" -> VersionStages.map { x => x.asInstanceOf[js.Any] },
        "SecretBinary" -> SecretBinary.map { x => x.asInstanceOf[js.Any] },
        "SecretString" -> SecretString.map { x => x.asInstanceOf[js.Any] },
        "ClientRequestToken" -> ClientRequestToken.map { x => x.asInstanceOf[js.Any] },
        "SecretId" -> SecretId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutSecretValueRequest]
    }
  }

  @js.native
  trait PutSecretValueResponse extends js.Object {
    var ARN: js.UndefOr[SecretARNType]
    var Name: js.UndefOr[SecretNameType]
    var VersionId: js.UndefOr[SecretVersionIdType]
    var VersionStages: js.UndefOr[SecretVersionStagesType]
  }

  object PutSecretValueResponse {
    def apply(
      ARN: js.UndefOr[SecretARNType] = js.undefined,
      Name: js.UndefOr[SecretNameType] = js.undefined,
      VersionId: js.UndefOr[SecretVersionIdType] = js.undefined,
      VersionStages: js.UndefOr[SecretVersionStagesType] = js.undefined): PutSecretValueResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ARN" -> ARN.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "VersionId" -> VersionId.map { x => x.asInstanceOf[js.Any] },
        "VersionStages" -> VersionStages.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutSecretValueResponse]
    }
  }

  @js.native
  trait RestoreSecretRequest extends js.Object {
    var SecretId: js.UndefOr[SecretIdType]
  }

  object RestoreSecretRequest {
    def apply(
      SecretId: js.UndefOr[SecretIdType] = js.undefined): RestoreSecretRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SecretId" -> SecretId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RestoreSecretRequest]
    }
  }

  @js.native
  trait RestoreSecretResponse extends js.Object {
    var ARN: js.UndefOr[SecretARNType]
    var Name: js.UndefOr[SecretNameType]
  }

  object RestoreSecretResponse {
    def apply(
      ARN: js.UndefOr[SecretARNType] = js.undefined,
      Name: js.UndefOr[SecretNameType] = js.undefined): RestoreSecretResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ARN" -> ARN.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RestoreSecretResponse]
    }
  }

  @js.native
  trait RotateSecretRequest extends js.Object {
    var SecretId: js.UndefOr[SecretIdType]
    var ClientRequestToken: js.UndefOr[ClientRequestTokenType]
    var RotationLambdaARN: js.UndefOr[RotationLambdaARNType]
    var RotationRules: js.UndefOr[RotationRulesType]
  }

  object RotateSecretRequest {
    def apply(
      SecretId: js.UndefOr[SecretIdType] = js.undefined,
      ClientRequestToken: js.UndefOr[ClientRequestTokenType] = js.undefined,
      RotationLambdaARN: js.UndefOr[RotationLambdaARNType] = js.undefined,
      RotationRules: js.UndefOr[RotationRulesType] = js.undefined): RotateSecretRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SecretId" -> SecretId.map { x => x.asInstanceOf[js.Any] },
        "ClientRequestToken" -> ClientRequestToken.map { x => x.asInstanceOf[js.Any] },
        "RotationLambdaARN" -> RotationLambdaARN.map { x => x.asInstanceOf[js.Any] },
        "RotationRules" -> RotationRules.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RotateSecretRequest]
    }
  }

  @js.native
  trait RotateSecretResponse extends js.Object {
    var ARN: js.UndefOr[SecretARNType]
    var Name: js.UndefOr[SecretNameType]
    var VersionId: js.UndefOr[SecretVersionIdType]
  }

  object RotateSecretResponse {
    def apply(
      ARN: js.UndefOr[SecretARNType] = js.undefined,
      Name: js.UndefOr[SecretNameType] = js.undefined,
      VersionId: js.UndefOr[SecretVersionIdType] = js.undefined): RotateSecretResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ARN" -> ARN.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "VersionId" -> VersionId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RotateSecretResponse]
    }
  }

  /**
   * <p>A structure that defines the rotation configuration for the secret.</p>
   */
  @js.native
  trait RotationRulesType extends js.Object {
    var AutomaticallyAfterDays: js.UndefOr[AutomaticallyRotateAfterDaysType]
  }

  object RotationRulesType {
    def apply(
      AutomaticallyAfterDays: js.UndefOr[AutomaticallyRotateAfterDaysType] = js.undefined): RotationRulesType = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AutomaticallyAfterDays" -> AutomaticallyAfterDays.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RotationRulesType]
    }
  }

  /**
   * <p>A structure that contains the details about a secret. It does not include the encrypted <code>SecretString</code> and <code>SecretBinary</code> values. To get those values, use the <a>GetSecretValue</a> operation.</p>
   */
  @js.native
  trait SecretListEntry extends js.Object {
    var ARN: js.UndefOr[SecretARNType]
    var Name: js.UndefOr[SecretNameType]
    var SecretVersionsToStages: js.UndefOr[SecretVersionsToStagesMapType]
    var LastChangedDate: js.UndefOr[LastChangedDateType]
    var Description: js.UndefOr[DescriptionType]
    var KmsKeyId: js.UndefOr[KmsKeyIdType]
    var RotationLambdaARN: js.UndefOr[RotationLambdaARNType]
    var RotationRules: js.UndefOr[RotationRulesType]
    var LastRotatedDate: js.UndefOr[LastRotatedDateType]
    var Tags: js.UndefOr[TagListType]
    var DeletedDate: js.UndefOr[DeletedDateType]
    var LastAccessedDate: js.UndefOr[LastAccessedDateType]
    var RotationEnabled: js.UndefOr[RotationEnabledType]
  }

  object SecretListEntry {
    def apply(
      ARN: js.UndefOr[SecretARNType] = js.undefined,
      Name: js.UndefOr[SecretNameType] = js.undefined,
      SecretVersionsToStages: js.UndefOr[SecretVersionsToStagesMapType] = js.undefined,
      LastChangedDate: js.UndefOr[LastChangedDateType] = js.undefined,
      Description: js.UndefOr[DescriptionType] = js.undefined,
      KmsKeyId: js.UndefOr[KmsKeyIdType] = js.undefined,
      RotationLambdaARN: js.UndefOr[RotationLambdaARNType] = js.undefined,
      RotationRules: js.UndefOr[RotationRulesType] = js.undefined,
      LastRotatedDate: js.UndefOr[LastRotatedDateType] = js.undefined,
      Tags: js.UndefOr[TagListType] = js.undefined,
      DeletedDate: js.UndefOr[DeletedDateType] = js.undefined,
      LastAccessedDate: js.UndefOr[LastAccessedDateType] = js.undefined,
      RotationEnabled: js.UndefOr[RotationEnabledType] = js.undefined): SecretListEntry = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ARN" -> ARN.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "SecretVersionsToStages" -> SecretVersionsToStages.map { x => x.asInstanceOf[js.Any] },
        "LastChangedDate" -> LastChangedDate.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "KmsKeyId" -> KmsKeyId.map { x => x.asInstanceOf[js.Any] },
        "RotationLambdaARN" -> RotationLambdaARN.map { x => x.asInstanceOf[js.Any] },
        "RotationRules" -> RotationRules.map { x => x.asInstanceOf[js.Any] },
        "LastRotatedDate" -> LastRotatedDate.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] },
        "DeletedDate" -> DeletedDate.map { x => x.asInstanceOf[js.Any] },
        "LastAccessedDate" -> LastAccessedDate.map { x => x.asInstanceOf[js.Any] },
        "RotationEnabled" -> RotationEnabled.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SecretListEntry]
    }
  }

  /**
   * <p>A structure that contains information about one version of a secret.</p>
   */
  @js.native
  trait SecretVersionsListEntry extends js.Object {
    var VersionId: js.UndefOr[SecretVersionIdType]
    var VersionStages: js.UndefOr[SecretVersionStagesType]
    var LastAccessedDate: js.UndefOr[LastAccessedDateType]
    var CreatedDate: js.UndefOr[CreatedDateType]
  }

  object SecretVersionsListEntry {
    def apply(
      VersionId: js.UndefOr[SecretVersionIdType] = js.undefined,
      VersionStages: js.UndefOr[SecretVersionStagesType] = js.undefined,
      LastAccessedDate: js.UndefOr[LastAccessedDateType] = js.undefined,
      CreatedDate: js.UndefOr[CreatedDateType] = js.undefined): SecretVersionsListEntry = {
      val _fields = IndexedSeq[(String, js.Any)](
        "VersionId" -> VersionId.map { x => x.asInstanceOf[js.Any] },
        "VersionStages" -> VersionStages.map { x => x.asInstanceOf[js.Any] },
        "LastAccessedDate" -> LastAccessedDate.map { x => x.asInstanceOf[js.Any] },
        "CreatedDate" -> CreatedDate.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SecretVersionsListEntry]
    }
  }

  /**
   * <p>A structure that contains information about a tag.</p>
   */
  @js.native
  trait Tag extends js.Object {
    var Key: js.UndefOr[TagKeyType]
    var Value: js.UndefOr[TagValueType]
  }

  object Tag {
    def apply(
      Key: js.UndefOr[TagKeyType] = js.undefined,
      Value: js.UndefOr[TagValueType] = js.undefined): Tag = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Key" -> Key.map { x => x.asInstanceOf[js.Any] },
        "Value" -> Value.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Tag]
    }
  }

  @js.native
  trait TagResourceRequest extends js.Object {
    var SecretId: js.UndefOr[SecretIdType]
    var Tags: js.UndefOr[TagListType]
  }

  object TagResourceRequest {
    def apply(
      SecretId: js.UndefOr[SecretIdType] = js.undefined,
      Tags: js.UndefOr[TagListType] = js.undefined): TagResourceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SecretId" -> SecretId.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TagResourceRequest]
    }
  }

  @js.native
  trait UntagResourceRequest extends js.Object {
    var SecretId: js.UndefOr[SecretIdType]
    var TagKeys: js.UndefOr[TagKeyListType]
  }

  object UntagResourceRequest {
    def apply(
      SecretId: js.UndefOr[SecretIdType] = js.undefined,
      TagKeys: js.UndefOr[TagKeyListType] = js.undefined): UntagResourceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SecretId" -> SecretId.map { x => x.asInstanceOf[js.Any] },
        "TagKeys" -> TagKeys.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UntagResourceRequest]
    }
  }

  @js.native
  trait UpdateSecretRequest extends js.Object {
    var Description: js.UndefOr[DescriptionType]
    var KmsKeyId: js.UndefOr[KmsKeyIdType]
    var SecretBinary: js.UndefOr[SecretBinaryType]
    var SecretString: js.UndefOr[SecretStringType]
    var ClientRequestToken: js.UndefOr[ClientRequestTokenType]
    var SecretId: js.UndefOr[SecretIdType]
  }

  object UpdateSecretRequest {
    def apply(
      Description: js.UndefOr[DescriptionType] = js.undefined,
      KmsKeyId: js.UndefOr[KmsKeyIdType] = js.undefined,
      SecretBinary: js.UndefOr[SecretBinaryType] = js.undefined,
      SecretString: js.UndefOr[SecretStringType] = js.undefined,
      ClientRequestToken: js.UndefOr[ClientRequestTokenType] = js.undefined,
      SecretId: js.UndefOr[SecretIdType] = js.undefined): UpdateSecretRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "KmsKeyId" -> KmsKeyId.map { x => x.asInstanceOf[js.Any] },
        "SecretBinary" -> SecretBinary.map { x => x.asInstanceOf[js.Any] },
        "SecretString" -> SecretString.map { x => x.asInstanceOf[js.Any] },
        "ClientRequestToken" -> ClientRequestToken.map { x => x.asInstanceOf[js.Any] },
        "SecretId" -> SecretId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateSecretRequest]
    }
  }

  @js.native
  trait UpdateSecretResponse extends js.Object {
    var ARN: js.UndefOr[SecretARNType]
    var Name: js.UndefOr[SecretNameType]
    var VersionId: js.UndefOr[SecretVersionIdType]
  }

  object UpdateSecretResponse {
    def apply(
      ARN: js.UndefOr[SecretARNType] = js.undefined,
      Name: js.UndefOr[SecretNameType] = js.undefined,
      VersionId: js.UndefOr[SecretVersionIdType] = js.undefined): UpdateSecretResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ARN" -> ARN.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "VersionId" -> VersionId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateSecretResponse]
    }
  }

  @js.native
  trait UpdateSecretVersionStageRequest extends js.Object {
    var SecretId: js.UndefOr[SecretIdType]
    var VersionStage: js.UndefOr[SecretVersionStageType]
    var RemoveFromVersionId: js.UndefOr[SecretVersionIdType]
    var MoveToVersionId: js.UndefOr[SecretVersionIdType]
  }

  object UpdateSecretVersionStageRequest {
    def apply(
      SecretId: js.UndefOr[SecretIdType] = js.undefined,
      VersionStage: js.UndefOr[SecretVersionStageType] = js.undefined,
      RemoveFromVersionId: js.UndefOr[SecretVersionIdType] = js.undefined,
      MoveToVersionId: js.UndefOr[SecretVersionIdType] = js.undefined): UpdateSecretVersionStageRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SecretId" -> SecretId.map { x => x.asInstanceOf[js.Any] },
        "VersionStage" -> VersionStage.map { x => x.asInstanceOf[js.Any] },
        "RemoveFromVersionId" -> RemoveFromVersionId.map { x => x.asInstanceOf[js.Any] },
        "MoveToVersionId" -> MoveToVersionId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateSecretVersionStageRequest]
    }
  }

  @js.native
  trait UpdateSecretVersionStageResponse extends js.Object {
    var ARN: js.UndefOr[SecretARNType]
    var Name: js.UndefOr[SecretNameType]
  }

  object UpdateSecretVersionStageResponse {
    def apply(
      ARN: js.UndefOr[SecretARNType] = js.undefined,
      Name: js.UndefOr[SecretNameType] = js.undefined): UpdateSecretVersionStageResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ARN" -> ARN.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateSecretVersionStageResponse]
    }
  }
}
