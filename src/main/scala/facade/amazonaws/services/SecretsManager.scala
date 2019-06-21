package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import io.scalajs.nodejs
import facade.amazonaws._

package object secretsmanager {
  type AutomaticallyRotateAfterDaysType = Double
  type BooleanType                      = Boolean
  type ClientRequestTokenType           = String
  type CreatedDateType                  = js.Date
  type DeletedDateType                  = js.Date
  type DeletionDateType                 = js.Date
  type DescriptionType                  = String
  type ExcludeCharactersType            = String
  type ExcludeLowercaseType             = Boolean
  type ExcludeNumbersType               = Boolean
  type ExcludePunctuationType           = Boolean
  type ExcludeUppercaseType             = Boolean
  type IncludeSpaceType                 = Boolean
  type KmsKeyIdType                     = String
  type LastAccessedDateType             = js.Date
  type LastChangedDateType              = js.Date
  type LastRotatedDateType              = js.Date
  type MaxResultsType                   = Int
  type NameType                         = String
  type NextTokenType                    = String
  type NonEmptyResourcePolicyType       = String
  type PasswordLengthType               = Double
  type RandomPasswordType               = String
  type RecoveryWindowInDaysType         = Double
  type RequireEachIncludedTypeType      = Boolean
  type RotationEnabledType              = Boolean
  type RotationLambdaARNType            = String
  type SecretARNType                    = String
  type SecretBinaryType =
    nodejs.buffer.Buffer | nodejs.stream.Readable | js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type SecretIdType                  = String
  type SecretListType                = js.Array[SecretListEntry]
  type SecretNameType                = String
  type SecretStringType              = String
  type SecretVersionIdType           = String
  type SecretVersionStageType        = String
  type SecretVersionStagesType       = js.Array[SecretVersionStageType]
  type SecretVersionsListType        = js.Array[SecretVersionsListEntry]
  type SecretVersionsToStagesMapType = js.Dictionary[SecretVersionStagesType]
  type TagKeyListType                = js.Array[TagKeyType]
  type TagKeyType                    = String
  type TagListType                   = js.Array[Tag]
  type TagValueType                  = String

  implicit final class SecretsManagerOps(val service: SecretsManager) extends AnyVal {

    def cancelRotateSecretFuture(params: CancelRotateSecretRequest): Future[CancelRotateSecretResponse] =
      service.cancelRotateSecret(params).promise.toFuture
    def createSecretFuture(params: CreateSecretRequest): Future[CreateSecretResponse] =
      service.createSecret(params).promise.toFuture
    def deleteResourcePolicyFuture(params: DeleteResourcePolicyRequest): Future[DeleteResourcePolicyResponse] =
      service.deleteResourcePolicy(params).promise.toFuture
    def deleteSecretFuture(params: DeleteSecretRequest): Future[DeleteSecretResponse] =
      service.deleteSecret(params).promise.toFuture
    def describeSecretFuture(params: DescribeSecretRequest): Future[DescribeSecretResponse] =
      service.describeSecret(params).promise.toFuture
    def getRandomPasswordFuture(params: GetRandomPasswordRequest): Future[GetRandomPasswordResponse] =
      service.getRandomPassword(params).promise.toFuture
    def getResourcePolicyFuture(params: GetResourcePolicyRequest): Future[GetResourcePolicyResponse] =
      service.getResourcePolicy(params).promise.toFuture
    def getSecretValueFuture(params: GetSecretValueRequest): Future[GetSecretValueResponse] =
      service.getSecretValue(params).promise.toFuture
    def listSecretVersionIdsFuture(params: ListSecretVersionIdsRequest): Future[ListSecretVersionIdsResponse] =
      service.listSecretVersionIds(params).promise.toFuture
    def listSecretsFuture(params: ListSecretsRequest): Future[ListSecretsResponse] =
      service.listSecrets(params).promise.toFuture
    def putResourcePolicyFuture(params: PutResourcePolicyRequest): Future[PutResourcePolicyResponse] =
      service.putResourcePolicy(params).promise.toFuture
    def putSecretValueFuture(params: PutSecretValueRequest): Future[PutSecretValueResponse] =
      service.putSecretValue(params).promise.toFuture
    def restoreSecretFuture(params: RestoreSecretRequest): Future[RestoreSecretResponse] =
      service.restoreSecret(params).promise.toFuture
    def rotateSecretFuture(params: RotateSecretRequest): Future[RotateSecretResponse] =
      service.rotateSecret(params).promise.toFuture
    def tagResourceFuture(params: TagResourceRequest): Future[js.Object] = service.tagResource(params).promise.toFuture
    def untagResourceFuture(params: UntagResourceRequest): Future[js.Object] =
      service.untagResource(params).promise.toFuture
    def updateSecretFuture(params: UpdateSecretRequest): Future[UpdateSecretResponse] =
      service.updateSecret(params).promise.toFuture
    def updateSecretVersionStageFuture(
        params: UpdateSecretVersionStageRequest
    ): Future[UpdateSecretVersionStageResponse] = service.updateSecretVersionStage(params).promise.toFuture
  }
}

package secretsmanager {
  @js.native
  @JSImport("aws-sdk", "SecretsManager")
  class SecretsManager() extends js.Object {
    def this(config: AWSConfig) = this()

    def cancelRotateSecret(params: CancelRotateSecretRequest): Request[CancelRotateSecretResponse]       = js.native
    def createSecret(params: CreateSecretRequest): Request[CreateSecretResponse]                         = js.native
    def deleteResourcePolicy(params: DeleteResourcePolicyRequest): Request[DeleteResourcePolicyResponse] = js.native
    def deleteSecret(params: DeleteSecretRequest): Request[DeleteSecretResponse]                         = js.native
    def describeSecret(params: DescribeSecretRequest): Request[DescribeSecretResponse]                   = js.native
    def getRandomPassword(params: GetRandomPasswordRequest): Request[GetRandomPasswordResponse]          = js.native
    def getResourcePolicy(params: GetResourcePolicyRequest): Request[GetResourcePolicyResponse]          = js.native
    def getSecretValue(params: GetSecretValueRequest): Request[GetSecretValueResponse]                   = js.native
    def listSecretVersionIds(params: ListSecretVersionIdsRequest): Request[ListSecretVersionIdsResponse] = js.native
    def listSecrets(params: ListSecretsRequest): Request[ListSecretsResponse]                            = js.native
    def putResourcePolicy(params: PutResourcePolicyRequest): Request[PutResourcePolicyResponse]          = js.native
    def putSecretValue(params: PutSecretValueRequest): Request[PutSecretValueResponse]                   = js.native
    def restoreSecret(params: RestoreSecretRequest): Request[RestoreSecretResponse]                      = js.native
    def rotateSecret(params: RotateSecretRequest): Request[RotateSecretResponse]                         = js.native
    def tagResource(params: TagResourceRequest): Request[js.Object]                                      = js.native
    def untagResource(params: UntagResourceRequest): Request[js.Object]                                  = js.native
    def updateSecret(params: UpdateSecretRequest): Request[UpdateSecretResponse]                         = js.native
    def updateSecretVersionStage(params: UpdateSecretVersionStageRequest): Request[UpdateSecretVersionStageResponse] =
      js.native
  }

  @js.native
  trait CancelRotateSecretRequest extends js.Object {
    var SecretId: SecretIdType
  }

  object CancelRotateSecretRequest {
    def apply(
        SecretId: SecretIdType
    ): CancelRotateSecretRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SecretId" -> SecretId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

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
        VersionId: js.UndefOr[SecretVersionIdType] = js.undefined
    ): CancelRotateSecretResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ARN" -> ARN.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        },
        "VersionId" -> VersionId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CancelRotateSecretResponse]
    }
  }

  @js.native
  trait CreateSecretRequest extends js.Object {
    var Name: NameType
    var ClientRequestToken: js.UndefOr[ClientRequestTokenType]
    var Description: js.UndefOr[DescriptionType]
    var KmsKeyId: js.UndefOr[KmsKeyIdType]
    var SecretBinary: js.UndefOr[SecretBinaryType]
    var SecretString: js.UndefOr[SecretStringType]
    var Tags: js.UndefOr[TagListType]
  }

  object CreateSecretRequest {
    def apply(
        Name: NameType,
        ClientRequestToken: js.UndefOr[ClientRequestTokenType] = js.undefined,
        Description: js.UndefOr[DescriptionType] = js.undefined,
        KmsKeyId: js.UndefOr[KmsKeyIdType] = js.undefined,
        SecretBinary: js.UndefOr[SecretBinaryType] = js.undefined,
        SecretString: js.UndefOr[SecretStringType] = js.undefined,
        Tags: js.UndefOr[TagListType] = js.undefined
    ): CreateSecretRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.asInstanceOf[js.Any],
        "ClientRequestToken" -> ClientRequestToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Description" -> Description.map { x =>
          x.asInstanceOf[js.Any]
        },
        "KmsKeyId" -> KmsKeyId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SecretBinary" -> SecretBinary.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SecretString" -> SecretString.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Tags" -> Tags.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

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
        VersionId: js.UndefOr[SecretVersionIdType] = js.undefined
    ): CreateSecretResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ARN" -> ARN.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        },
        "VersionId" -> VersionId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateSecretResponse]
    }
  }

  @js.native
  trait DeleteResourcePolicyRequest extends js.Object {
    var SecretId: SecretIdType
  }

  object DeleteResourcePolicyRequest {
    def apply(
        SecretId: SecretIdType
    ): DeleteResourcePolicyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SecretId" -> SecretId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

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
        Name: js.UndefOr[NameType] = js.undefined
    ): DeleteResourcePolicyResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ARN" -> ARN.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteResourcePolicyResponse]
    }
  }

  @js.native
  trait DeleteSecretRequest extends js.Object {
    var SecretId: SecretIdType
    var ForceDeleteWithoutRecovery: js.UndefOr[BooleanType]
    var RecoveryWindowInDays: js.UndefOr[RecoveryWindowInDaysType]
  }

  object DeleteSecretRequest {
    def apply(
        SecretId: SecretIdType,
        ForceDeleteWithoutRecovery: js.UndefOr[BooleanType] = js.undefined,
        RecoveryWindowInDays: js.UndefOr[RecoveryWindowInDaysType] = js.undefined
    ): DeleteSecretRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SecretId" -> SecretId.asInstanceOf[js.Any],
        "ForceDeleteWithoutRecovery" -> ForceDeleteWithoutRecovery.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RecoveryWindowInDays" -> RecoveryWindowInDays.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteSecretRequest]
    }
  }

  @js.native
  trait DeleteSecretResponse extends js.Object {
    var ARN: js.UndefOr[SecretARNType]
    var DeletionDate: js.UndefOr[DeletionDateType]
    var Name: js.UndefOr[SecretNameType]
  }

  object DeleteSecretResponse {
    def apply(
        ARN: js.UndefOr[SecretARNType] = js.undefined,
        DeletionDate: js.UndefOr[DeletionDateType] = js.undefined,
        Name: js.UndefOr[SecretNameType] = js.undefined
    ): DeleteSecretResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ARN" -> ARN.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DeletionDate" -> DeletionDate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteSecretResponse]
    }
  }

  @js.native
  trait DescribeSecretRequest extends js.Object {
    var SecretId: SecretIdType
  }

  object DescribeSecretRequest {
    def apply(
        SecretId: SecretIdType
    ): DescribeSecretRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SecretId" -> SecretId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeSecretRequest]
    }
  }

  @js.native
  trait DescribeSecretResponse extends js.Object {
    var ARN: js.UndefOr[SecretARNType]
    var DeletedDate: js.UndefOr[DeletedDateType]
    var Description: js.UndefOr[DescriptionType]
    var KmsKeyId: js.UndefOr[KmsKeyIdType]
    var LastAccessedDate: js.UndefOr[LastAccessedDateType]
    var LastChangedDate: js.UndefOr[LastChangedDateType]
    var LastRotatedDate: js.UndefOr[LastRotatedDateType]
    var Name: js.UndefOr[SecretNameType]
    var RotationEnabled: js.UndefOr[RotationEnabledType]
    var RotationLambdaARN: js.UndefOr[RotationLambdaARNType]
    var RotationRules: js.UndefOr[RotationRulesType]
    var Tags: js.UndefOr[TagListType]
    var VersionIdsToStages: js.UndefOr[SecretVersionsToStagesMapType]
  }

  object DescribeSecretResponse {
    def apply(
        ARN: js.UndefOr[SecretARNType] = js.undefined,
        DeletedDate: js.UndefOr[DeletedDateType] = js.undefined,
        Description: js.UndefOr[DescriptionType] = js.undefined,
        KmsKeyId: js.UndefOr[KmsKeyIdType] = js.undefined,
        LastAccessedDate: js.UndefOr[LastAccessedDateType] = js.undefined,
        LastChangedDate: js.UndefOr[LastChangedDateType] = js.undefined,
        LastRotatedDate: js.UndefOr[LastRotatedDateType] = js.undefined,
        Name: js.UndefOr[SecretNameType] = js.undefined,
        RotationEnabled: js.UndefOr[RotationEnabledType] = js.undefined,
        RotationLambdaARN: js.UndefOr[RotationLambdaARNType] = js.undefined,
        RotationRules: js.UndefOr[RotationRulesType] = js.undefined,
        Tags: js.UndefOr[TagListType] = js.undefined,
        VersionIdsToStages: js.UndefOr[SecretVersionsToStagesMapType] = js.undefined
    ): DescribeSecretResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ARN" -> ARN.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DeletedDate" -> DeletedDate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Description" -> Description.map { x =>
          x.asInstanceOf[js.Any]
        },
        "KmsKeyId" -> KmsKeyId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LastAccessedDate" -> LastAccessedDate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LastChangedDate" -> LastChangedDate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LastRotatedDate" -> LastRotatedDate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RotationEnabled" -> RotationEnabled.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RotationLambdaARN" -> RotationLambdaARN.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RotationRules" -> RotationRules.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Tags" -> Tags.map { x =>
          x.asInstanceOf[js.Any]
        },
        "VersionIdsToStages" -> VersionIdsToStages.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeSecretResponse]
    }
  }

  @js.native
  trait GetRandomPasswordRequest extends js.Object {
    var ExcludeCharacters: js.UndefOr[ExcludeCharactersType]
    var ExcludeLowercase: js.UndefOr[ExcludeLowercaseType]
    var ExcludeNumbers: js.UndefOr[ExcludeNumbersType]
    var ExcludePunctuation: js.UndefOr[ExcludePunctuationType]
    var ExcludeUppercase: js.UndefOr[ExcludeUppercaseType]
    var IncludeSpace: js.UndefOr[IncludeSpaceType]
    var PasswordLength: js.UndefOr[PasswordLengthType]
    var RequireEachIncludedType: js.UndefOr[RequireEachIncludedTypeType]
  }

  object GetRandomPasswordRequest {
    def apply(
        ExcludeCharacters: js.UndefOr[ExcludeCharactersType] = js.undefined,
        ExcludeLowercase: js.UndefOr[ExcludeLowercaseType] = js.undefined,
        ExcludeNumbers: js.UndefOr[ExcludeNumbersType] = js.undefined,
        ExcludePunctuation: js.UndefOr[ExcludePunctuationType] = js.undefined,
        ExcludeUppercase: js.UndefOr[ExcludeUppercaseType] = js.undefined,
        IncludeSpace: js.UndefOr[IncludeSpaceType] = js.undefined,
        PasswordLength: js.UndefOr[PasswordLengthType] = js.undefined,
        RequireEachIncludedType: js.UndefOr[RequireEachIncludedTypeType] = js.undefined
    ): GetRandomPasswordRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ExcludeCharacters" -> ExcludeCharacters.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ExcludeLowercase" -> ExcludeLowercase.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ExcludeNumbers" -> ExcludeNumbers.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ExcludePunctuation" -> ExcludePunctuation.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ExcludeUppercase" -> ExcludeUppercase.map { x =>
          x.asInstanceOf[js.Any]
        },
        "IncludeSpace" -> IncludeSpace.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PasswordLength" -> PasswordLength.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RequireEachIncludedType" -> RequireEachIncludedType.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetRandomPasswordRequest]
    }
  }

  @js.native
  trait GetRandomPasswordResponse extends js.Object {
    var RandomPassword: js.UndefOr[RandomPasswordType]
  }

  object GetRandomPasswordResponse {
    def apply(
        RandomPassword: js.UndefOr[RandomPasswordType] = js.undefined
    ): GetRandomPasswordResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RandomPassword" -> RandomPassword.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetRandomPasswordResponse]
    }
  }

  @js.native
  trait GetResourcePolicyRequest extends js.Object {
    var SecretId: SecretIdType
  }

  object GetResourcePolicyRequest {
    def apply(
        SecretId: SecretIdType
    ): GetResourcePolicyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SecretId" -> SecretId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

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
        ResourcePolicy: js.UndefOr[NonEmptyResourcePolicyType] = js.undefined
    ): GetResourcePolicyResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ARN" -> ARN.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ResourcePolicy" -> ResourcePolicy.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetResourcePolicyResponse]
    }
  }

  @js.native
  trait GetSecretValueRequest extends js.Object {
    var SecretId: SecretIdType
    var VersionId: js.UndefOr[SecretVersionIdType]
    var VersionStage: js.UndefOr[SecretVersionStageType]
  }

  object GetSecretValueRequest {
    def apply(
        SecretId: SecretIdType,
        VersionId: js.UndefOr[SecretVersionIdType] = js.undefined,
        VersionStage: js.UndefOr[SecretVersionStageType] = js.undefined
    ): GetSecretValueRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SecretId" -> SecretId.asInstanceOf[js.Any],
        "VersionId" -> VersionId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "VersionStage" -> VersionStage.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetSecretValueRequest]
    }
  }

  @js.native
  trait GetSecretValueResponse extends js.Object {
    var ARN: js.UndefOr[SecretARNType]
    var CreatedDate: js.UndefOr[CreatedDateType]
    var Name: js.UndefOr[SecretNameType]
    var SecretBinary: js.UndefOr[SecretBinaryType]
    var SecretString: js.UndefOr[SecretStringType]
    var VersionId: js.UndefOr[SecretVersionIdType]
    var VersionStages: js.UndefOr[SecretVersionStagesType]
  }

  object GetSecretValueResponse {
    def apply(
        ARN: js.UndefOr[SecretARNType] = js.undefined,
        CreatedDate: js.UndefOr[CreatedDateType] = js.undefined,
        Name: js.UndefOr[SecretNameType] = js.undefined,
        SecretBinary: js.UndefOr[SecretBinaryType] = js.undefined,
        SecretString: js.UndefOr[SecretStringType] = js.undefined,
        VersionId: js.UndefOr[SecretVersionIdType] = js.undefined,
        VersionStages: js.UndefOr[SecretVersionStagesType] = js.undefined
    ): GetSecretValueResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ARN" -> ARN.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CreatedDate" -> CreatedDate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SecretBinary" -> SecretBinary.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SecretString" -> SecretString.map { x =>
          x.asInstanceOf[js.Any]
        },
        "VersionId" -> VersionId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "VersionStages" -> VersionStages.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetSecretValueResponse]
    }
  }

  @js.native
  trait ListSecretVersionIdsRequest extends js.Object {
    var SecretId: SecretIdType
    var IncludeDeprecated: js.UndefOr[BooleanType]
    var MaxResults: js.UndefOr[MaxResultsType]
    var NextToken: js.UndefOr[NextTokenType]
  }

  object ListSecretVersionIdsRequest {
    def apply(
        SecretId: SecretIdType,
        IncludeDeprecated: js.UndefOr[BooleanType] = js.undefined,
        MaxResults: js.UndefOr[MaxResultsType] = js.undefined,
        NextToken: js.UndefOr[NextTokenType] = js.undefined
    ): ListSecretVersionIdsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SecretId" -> SecretId.asInstanceOf[js.Any],
        "IncludeDeprecated" -> IncludeDeprecated.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MaxResults" -> MaxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListSecretVersionIdsRequest]
    }
  }

  @js.native
  trait ListSecretVersionIdsResponse extends js.Object {
    var ARN: js.UndefOr[SecretARNType]
    var Name: js.UndefOr[SecretNameType]
    var NextToken: js.UndefOr[NextTokenType]
    var Versions: js.UndefOr[SecretVersionsListType]
  }

  object ListSecretVersionIdsResponse {
    def apply(
        ARN: js.UndefOr[SecretARNType] = js.undefined,
        Name: js.UndefOr[SecretNameType] = js.undefined,
        NextToken: js.UndefOr[NextTokenType] = js.undefined,
        Versions: js.UndefOr[SecretVersionsListType] = js.undefined
    ): ListSecretVersionIdsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ARN" -> ARN.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Versions" -> Versions.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

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
        NextToken: js.UndefOr[NextTokenType] = js.undefined
    ): ListSecretsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MaxResults" -> MaxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListSecretsRequest]
    }
  }

  @js.native
  trait ListSecretsResponse extends js.Object {
    var NextToken: js.UndefOr[NextTokenType]
    var SecretList: js.UndefOr[SecretListType]
  }

  object ListSecretsResponse {
    def apply(
        NextToken: js.UndefOr[NextTokenType] = js.undefined,
        SecretList: js.UndefOr[SecretListType] = js.undefined
    ): ListSecretsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SecretList" -> SecretList.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListSecretsResponse]
    }
  }

  @js.native
  trait PutResourcePolicyRequest extends js.Object {
    var ResourcePolicy: NonEmptyResourcePolicyType
    var SecretId: SecretIdType
  }

  object PutResourcePolicyRequest {
    def apply(
        ResourcePolicy: NonEmptyResourcePolicyType,
        SecretId: SecretIdType
    ): PutResourcePolicyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourcePolicy" -> ResourcePolicy.asInstanceOf[js.Any],
        "SecretId"       -> SecretId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

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
        Name: js.UndefOr[NameType] = js.undefined
    ): PutResourcePolicyResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ARN" -> ARN.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutResourcePolicyResponse]
    }
  }

  @js.native
  trait PutSecretValueRequest extends js.Object {
    var SecretId: SecretIdType
    var ClientRequestToken: js.UndefOr[ClientRequestTokenType]
    var SecretBinary: js.UndefOr[SecretBinaryType]
    var SecretString: js.UndefOr[SecretStringType]
    var VersionStages: js.UndefOr[SecretVersionStagesType]
  }

  object PutSecretValueRequest {
    def apply(
        SecretId: SecretIdType,
        ClientRequestToken: js.UndefOr[ClientRequestTokenType] = js.undefined,
        SecretBinary: js.UndefOr[SecretBinaryType] = js.undefined,
        SecretString: js.UndefOr[SecretStringType] = js.undefined,
        VersionStages: js.UndefOr[SecretVersionStagesType] = js.undefined
    ): PutSecretValueRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SecretId" -> SecretId.asInstanceOf[js.Any],
        "ClientRequestToken" -> ClientRequestToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SecretBinary" -> SecretBinary.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SecretString" -> SecretString.map { x =>
          x.asInstanceOf[js.Any]
        },
        "VersionStages" -> VersionStages.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

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
        VersionStages: js.UndefOr[SecretVersionStagesType] = js.undefined
    ): PutSecretValueResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ARN" -> ARN.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        },
        "VersionId" -> VersionId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "VersionStages" -> VersionStages.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutSecretValueResponse]
    }
  }

  @js.native
  trait RestoreSecretRequest extends js.Object {
    var SecretId: SecretIdType
  }

  object RestoreSecretRequest {
    def apply(
        SecretId: SecretIdType
    ): RestoreSecretRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SecretId" -> SecretId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

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
        Name: js.UndefOr[SecretNameType] = js.undefined
    ): RestoreSecretResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ARN" -> ARN.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RestoreSecretResponse]
    }
  }

  @js.native
  trait RotateSecretRequest extends js.Object {
    var SecretId: SecretIdType
    var ClientRequestToken: js.UndefOr[ClientRequestTokenType]
    var RotationLambdaARN: js.UndefOr[RotationLambdaARNType]
    var RotationRules: js.UndefOr[RotationRulesType]
  }

  object RotateSecretRequest {
    def apply(
        SecretId: SecretIdType,
        ClientRequestToken: js.UndefOr[ClientRequestTokenType] = js.undefined,
        RotationLambdaARN: js.UndefOr[RotationLambdaARNType] = js.undefined,
        RotationRules: js.UndefOr[RotationRulesType] = js.undefined
    ): RotateSecretRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SecretId" -> SecretId.asInstanceOf[js.Any],
        "ClientRequestToken" -> ClientRequestToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RotationLambdaARN" -> RotationLambdaARN.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RotationRules" -> RotationRules.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

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
        VersionId: js.UndefOr[SecretVersionIdType] = js.undefined
    ): RotateSecretResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ARN" -> ARN.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        },
        "VersionId" -> VersionId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RotateSecretResponse]
    }
  }

  /**
    * A structure that defines the rotation configuration for the secret.
    */
  @js.native
  trait RotationRulesType extends js.Object {
    var AutomaticallyAfterDays: js.UndefOr[AutomaticallyRotateAfterDaysType]
  }

  object RotationRulesType {
    def apply(
        AutomaticallyAfterDays: js.UndefOr[AutomaticallyRotateAfterDaysType] = js.undefined
    ): RotationRulesType = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AutomaticallyAfterDays" -> AutomaticallyAfterDays.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RotationRulesType]
    }
  }

  /**
    * A structure that contains the details about a secret. It does not include the encrypted <code>SecretString</code> and <code>SecretBinary</code> values. To get those values, use the <a>GetSecretValue</a> operation.
    */
  @js.native
  trait SecretListEntry extends js.Object {
    var ARN: js.UndefOr[SecretARNType]
    var DeletedDate: js.UndefOr[DeletedDateType]
    var Description: js.UndefOr[DescriptionType]
    var KmsKeyId: js.UndefOr[KmsKeyIdType]
    var LastAccessedDate: js.UndefOr[LastAccessedDateType]
    var LastChangedDate: js.UndefOr[LastChangedDateType]
    var LastRotatedDate: js.UndefOr[LastRotatedDateType]
    var Name: js.UndefOr[SecretNameType]
    var RotationEnabled: js.UndefOr[RotationEnabledType]
    var RotationLambdaARN: js.UndefOr[RotationLambdaARNType]
    var RotationRules: js.UndefOr[RotationRulesType]
    var SecretVersionsToStages: js.UndefOr[SecretVersionsToStagesMapType]
    var Tags: js.UndefOr[TagListType]
  }

  object SecretListEntry {
    def apply(
        ARN: js.UndefOr[SecretARNType] = js.undefined,
        DeletedDate: js.UndefOr[DeletedDateType] = js.undefined,
        Description: js.UndefOr[DescriptionType] = js.undefined,
        KmsKeyId: js.UndefOr[KmsKeyIdType] = js.undefined,
        LastAccessedDate: js.UndefOr[LastAccessedDateType] = js.undefined,
        LastChangedDate: js.UndefOr[LastChangedDateType] = js.undefined,
        LastRotatedDate: js.UndefOr[LastRotatedDateType] = js.undefined,
        Name: js.UndefOr[SecretNameType] = js.undefined,
        RotationEnabled: js.UndefOr[RotationEnabledType] = js.undefined,
        RotationLambdaARN: js.UndefOr[RotationLambdaARNType] = js.undefined,
        RotationRules: js.UndefOr[RotationRulesType] = js.undefined,
        SecretVersionsToStages: js.UndefOr[SecretVersionsToStagesMapType] = js.undefined,
        Tags: js.UndefOr[TagListType] = js.undefined
    ): SecretListEntry = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ARN" -> ARN.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DeletedDate" -> DeletedDate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Description" -> Description.map { x =>
          x.asInstanceOf[js.Any]
        },
        "KmsKeyId" -> KmsKeyId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LastAccessedDate" -> LastAccessedDate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LastChangedDate" -> LastChangedDate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LastRotatedDate" -> LastRotatedDate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RotationEnabled" -> RotationEnabled.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RotationLambdaARN" -> RotationLambdaARN.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RotationRules" -> RotationRules.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SecretVersionsToStages" -> SecretVersionsToStages.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Tags" -> Tags.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SecretListEntry]
    }
  }

  /**
    * A structure that contains information about one version of a secret.
    */
  @js.native
  trait SecretVersionsListEntry extends js.Object {
    var CreatedDate: js.UndefOr[CreatedDateType]
    var LastAccessedDate: js.UndefOr[LastAccessedDateType]
    var VersionId: js.UndefOr[SecretVersionIdType]
    var VersionStages: js.UndefOr[SecretVersionStagesType]
  }

  object SecretVersionsListEntry {
    def apply(
        CreatedDate: js.UndefOr[CreatedDateType] = js.undefined,
        LastAccessedDate: js.UndefOr[LastAccessedDateType] = js.undefined,
        VersionId: js.UndefOr[SecretVersionIdType] = js.undefined,
        VersionStages: js.UndefOr[SecretVersionStagesType] = js.undefined
    ): SecretVersionsListEntry = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CreatedDate" -> CreatedDate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LastAccessedDate" -> LastAccessedDate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "VersionId" -> VersionId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "VersionStages" -> VersionStages.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SecretVersionsListEntry]
    }
  }

  /**
    * A structure that contains information about a tag.
    */
  @js.native
  trait Tag extends js.Object {
    var Key: js.UndefOr[TagKeyType]
    var Value: js.UndefOr[TagValueType]
  }

  object Tag {
    def apply(
        Key: js.UndefOr[TagKeyType] = js.undefined,
        Value: js.UndefOr[TagValueType] = js.undefined
    ): Tag = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Key" -> Key.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Value" -> Value.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Tag]
    }
  }

  @js.native
  trait TagResourceRequest extends js.Object {
    var SecretId: SecretIdType
    var Tags: TagListType
  }

  object TagResourceRequest {
    def apply(
        SecretId: SecretIdType,
        Tags: TagListType
    ): TagResourceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SecretId" -> SecretId.asInstanceOf[js.Any],
        "Tags"     -> Tags.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TagResourceRequest]
    }
  }

  @js.native
  trait UntagResourceRequest extends js.Object {
    var SecretId: SecretIdType
    var TagKeys: TagKeyListType
  }

  object UntagResourceRequest {
    def apply(
        SecretId: SecretIdType,
        TagKeys: TagKeyListType
    ): UntagResourceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SecretId" -> SecretId.asInstanceOf[js.Any],
        "TagKeys"  -> TagKeys.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UntagResourceRequest]
    }
  }

  @js.native
  trait UpdateSecretRequest extends js.Object {
    var SecretId: SecretIdType
    var ClientRequestToken: js.UndefOr[ClientRequestTokenType]
    var Description: js.UndefOr[DescriptionType]
    var KmsKeyId: js.UndefOr[KmsKeyIdType]
    var SecretBinary: js.UndefOr[SecretBinaryType]
    var SecretString: js.UndefOr[SecretStringType]
  }

  object UpdateSecretRequest {
    def apply(
        SecretId: SecretIdType,
        ClientRequestToken: js.UndefOr[ClientRequestTokenType] = js.undefined,
        Description: js.UndefOr[DescriptionType] = js.undefined,
        KmsKeyId: js.UndefOr[KmsKeyIdType] = js.undefined,
        SecretBinary: js.UndefOr[SecretBinaryType] = js.undefined,
        SecretString: js.UndefOr[SecretStringType] = js.undefined
    ): UpdateSecretRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SecretId" -> SecretId.asInstanceOf[js.Any],
        "ClientRequestToken" -> ClientRequestToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Description" -> Description.map { x =>
          x.asInstanceOf[js.Any]
        },
        "KmsKeyId" -> KmsKeyId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SecretBinary" -> SecretBinary.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SecretString" -> SecretString.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

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
        VersionId: js.UndefOr[SecretVersionIdType] = js.undefined
    ): UpdateSecretResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ARN" -> ARN.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        },
        "VersionId" -> VersionId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateSecretResponse]
    }
  }

  @js.native
  trait UpdateSecretVersionStageRequest extends js.Object {
    var SecretId: SecretIdType
    var VersionStage: SecretVersionStageType
    var MoveToVersionId: js.UndefOr[SecretVersionIdType]
    var RemoveFromVersionId: js.UndefOr[SecretVersionIdType]
  }

  object UpdateSecretVersionStageRequest {
    def apply(
        SecretId: SecretIdType,
        VersionStage: SecretVersionStageType,
        MoveToVersionId: js.UndefOr[SecretVersionIdType] = js.undefined,
        RemoveFromVersionId: js.UndefOr[SecretVersionIdType] = js.undefined
    ): UpdateSecretVersionStageRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SecretId"     -> SecretId.asInstanceOf[js.Any],
        "VersionStage" -> VersionStage.asInstanceOf[js.Any],
        "MoveToVersionId" -> MoveToVersionId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RemoveFromVersionId" -> RemoveFromVersionId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

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
        Name: js.UndefOr[SecretNameType] = js.undefined
    ): UpdateSecretVersionStageResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ARN" -> ARN.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateSecretVersionStageResponse]
    }
  }
}
