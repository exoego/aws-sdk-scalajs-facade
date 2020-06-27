package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

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
  type OwningServiceType                = String
  type PasswordLengthType               = Double
  type RandomPasswordType               = String
  type RecoveryWindowInDaysType         = Double
  type RequireEachIncludedTypeType      = Boolean
  type RotationEnabledType              = Boolean
  type RotationLambdaARNType            = String
  type SecretARNType                    = String
  type SecretBinaryType                 = js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type SecretIdType                     = String
  type SecretListType                   = js.Array[SecretListEntry]
  type SecretNameType                   = String
  type SecretStringType                 = String
  type SecretVersionIdType              = String
  type SecretVersionStageType           = String
  type SecretVersionStagesType          = js.Array[SecretVersionStageType]
  type SecretVersionsListType           = js.Array[SecretVersionsListEntry]
  type SecretVersionsToStagesMapType    = js.Dictionary[SecretVersionStagesType]
  type TagKeyListType                   = js.Array[TagKeyType]
  type TagKeyType                       = String
  type TagListType                      = js.Array[Tag]
  type TagValueType                     = String

  implicit final class SecretsManagerOps(private val service: SecretsManager) extends AnyVal {

    @inline def cancelRotateSecretFuture(params: CancelRotateSecretRequest): Future[CancelRotateSecretResponse] =
      service.cancelRotateSecret(params).promise().toFuture
    @inline def createSecretFuture(params: CreateSecretRequest): Future[CreateSecretResponse] =
      service.createSecret(params).promise().toFuture
    @inline def deleteResourcePolicyFuture(params: DeleteResourcePolicyRequest): Future[DeleteResourcePolicyResponse] =
      service.deleteResourcePolicy(params).promise().toFuture
    @inline def deleteSecretFuture(params: DeleteSecretRequest): Future[DeleteSecretResponse] =
      service.deleteSecret(params).promise().toFuture
    @inline def describeSecretFuture(params: DescribeSecretRequest): Future[DescribeSecretResponse] =
      service.describeSecret(params).promise().toFuture
    @inline def getRandomPasswordFuture(params: GetRandomPasswordRequest): Future[GetRandomPasswordResponse] =
      service.getRandomPassword(params).promise().toFuture
    @inline def getResourcePolicyFuture(params: GetResourcePolicyRequest): Future[GetResourcePolicyResponse] =
      service.getResourcePolicy(params).promise().toFuture
    @inline def getSecretValueFuture(params: GetSecretValueRequest): Future[GetSecretValueResponse] =
      service.getSecretValue(params).promise().toFuture
    @inline def listSecretVersionIdsFuture(params: ListSecretVersionIdsRequest): Future[ListSecretVersionIdsResponse] =
      service.listSecretVersionIds(params).promise().toFuture
    @inline def listSecretsFuture(params: ListSecretsRequest): Future[ListSecretsResponse] =
      service.listSecrets(params).promise().toFuture
    @inline def putResourcePolicyFuture(params: PutResourcePolicyRequest): Future[PutResourcePolicyResponse] =
      service.putResourcePolicy(params).promise().toFuture
    @inline def putSecretValueFuture(params: PutSecretValueRequest): Future[PutSecretValueResponse] =
      service.putSecretValue(params).promise().toFuture
    @inline def restoreSecretFuture(params: RestoreSecretRequest): Future[RestoreSecretResponse] =
      service.restoreSecret(params).promise().toFuture
    @inline def rotateSecretFuture(params: RotateSecretRequest): Future[RotateSecretResponse] =
      service.rotateSecret(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[js.Object] =
      service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[js.Object] =
      service.untagResource(params).promise().toFuture
    @inline def updateSecretFuture(params: UpdateSecretRequest): Future[UpdateSecretResponse] =
      service.updateSecret(params).promise().toFuture
    @inline def updateSecretVersionStageFuture(
        params: UpdateSecretVersionStageRequest
    ): Future[UpdateSecretVersionStageResponse] = service.updateSecretVersionStage(params).promise().toFuture
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
  @Factory
  trait CancelRotateSecretRequest extends js.Object {
    var SecretId: SecretIdType
  }

  @js.native
  @Factory
  trait CancelRotateSecretResponse extends js.Object {
    var ARN: js.UndefOr[SecretARNType]
    var Name: js.UndefOr[SecretNameType]
    var VersionId: js.UndefOr[SecretVersionIdType]
  }

  @js.native
  @Factory
  trait CreateSecretRequest extends js.Object {
    var Name: NameType
    var ClientRequestToken: js.UndefOr[ClientRequestTokenType]
    var Description: js.UndefOr[DescriptionType]
    var KmsKeyId: js.UndefOr[KmsKeyIdType]
    var SecretBinary: js.UndefOr[SecretBinaryType]
    var SecretString: js.UndefOr[SecretStringType]
    var Tags: js.UndefOr[TagListType]
  }

  @js.native
  @Factory
  trait CreateSecretResponse extends js.Object {
    var ARN: js.UndefOr[SecretARNType]
    var Name: js.UndefOr[SecretNameType]
    var VersionId: js.UndefOr[SecretVersionIdType]
  }

  @js.native
  @Factory
  trait DeleteResourcePolicyRequest extends js.Object {
    var SecretId: SecretIdType
  }

  @js.native
  @Factory
  trait DeleteResourcePolicyResponse extends js.Object {
    var ARN: js.UndefOr[SecretARNType]
    var Name: js.UndefOr[NameType]
  }

  @js.native
  @Factory
  trait DeleteSecretRequest extends js.Object {
    var SecretId: SecretIdType
    var ForceDeleteWithoutRecovery: js.UndefOr[BooleanType]
    var RecoveryWindowInDays: js.UndefOr[RecoveryWindowInDaysType]
  }

  @js.native
  @Factory
  trait DeleteSecretResponse extends js.Object {
    var ARN: js.UndefOr[SecretARNType]
    var DeletionDate: js.UndefOr[DeletionDateType]
    var Name: js.UndefOr[SecretNameType]
  }

  @js.native
  @Factory
  trait DescribeSecretRequest extends js.Object {
    var SecretId: SecretIdType
  }

  @js.native
  @Factory
  trait DescribeSecretResponse extends js.Object {
    var ARN: js.UndefOr[SecretARNType]
    var DeletedDate: js.UndefOr[DeletedDateType]
    var Description: js.UndefOr[DescriptionType]
    var KmsKeyId: js.UndefOr[KmsKeyIdType]
    var LastAccessedDate: js.UndefOr[LastAccessedDateType]
    var LastChangedDate: js.UndefOr[LastChangedDateType]
    var LastRotatedDate: js.UndefOr[LastRotatedDateType]
    var Name: js.UndefOr[SecretNameType]
    var OwningService: js.UndefOr[OwningServiceType]
    var RotationEnabled: js.UndefOr[RotationEnabledType]
    var RotationLambdaARN: js.UndefOr[RotationLambdaARNType]
    var RotationRules: js.UndefOr[RotationRulesType]
    var Tags: js.UndefOr[TagListType]
    var VersionIdsToStages: js.UndefOr[SecretVersionsToStagesMapType]
  }

  @js.native
  @Factory
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

  @js.native
  @Factory
  trait GetRandomPasswordResponse extends js.Object {
    var RandomPassword: js.UndefOr[RandomPasswordType]
  }

  @js.native
  @Factory
  trait GetResourcePolicyRequest extends js.Object {
    var SecretId: SecretIdType
  }

  @js.native
  @Factory
  trait GetResourcePolicyResponse extends js.Object {
    var ARN: js.UndefOr[SecretARNType]
    var Name: js.UndefOr[NameType]
    var ResourcePolicy: js.UndefOr[NonEmptyResourcePolicyType]
  }

  @js.native
  @Factory
  trait GetSecretValueRequest extends js.Object {
    var SecretId: SecretIdType
    var VersionId: js.UndefOr[SecretVersionIdType]
    var VersionStage: js.UndefOr[SecretVersionStageType]
  }

  @js.native
  @Factory
  trait GetSecretValueResponse extends js.Object {
    var ARN: js.UndefOr[SecretARNType]
    var CreatedDate: js.UndefOr[CreatedDateType]
    var Name: js.UndefOr[SecretNameType]
    var SecretBinary: js.UndefOr[SecretBinaryType]
    var SecretString: js.UndefOr[SecretStringType]
    var VersionId: js.UndefOr[SecretVersionIdType]
    var VersionStages: js.UndefOr[SecretVersionStagesType]
  }

  @js.native
  @Factory
  trait ListSecretVersionIdsRequest extends js.Object {
    var SecretId: SecretIdType
    var IncludeDeprecated: js.UndefOr[BooleanType]
    var MaxResults: js.UndefOr[MaxResultsType]
    var NextToken: js.UndefOr[NextTokenType]
  }

  @js.native
  @Factory
  trait ListSecretVersionIdsResponse extends js.Object {
    var ARN: js.UndefOr[SecretARNType]
    var Name: js.UndefOr[SecretNameType]
    var NextToken: js.UndefOr[NextTokenType]
    var Versions: js.UndefOr[SecretVersionsListType]
  }

  @js.native
  @Factory
  trait ListSecretsRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResultsType]
    var NextToken: js.UndefOr[NextTokenType]
  }

  @js.native
  @Factory
  trait ListSecretsResponse extends js.Object {
    var NextToken: js.UndefOr[NextTokenType]
    var SecretList: js.UndefOr[SecretListType]
  }

  @js.native
  @Factory
  trait PutResourcePolicyRequest extends js.Object {
    var ResourcePolicy: NonEmptyResourcePolicyType
    var SecretId: SecretIdType
  }

  @js.native
  @Factory
  trait PutResourcePolicyResponse extends js.Object {
    var ARN: js.UndefOr[SecretARNType]
    var Name: js.UndefOr[NameType]
  }

  @js.native
  @Factory
  trait PutSecretValueRequest extends js.Object {
    var SecretId: SecretIdType
    var ClientRequestToken: js.UndefOr[ClientRequestTokenType]
    var SecretBinary: js.UndefOr[SecretBinaryType]
    var SecretString: js.UndefOr[SecretStringType]
    var VersionStages: js.UndefOr[SecretVersionStagesType]
  }

  @js.native
  @Factory
  trait PutSecretValueResponse extends js.Object {
    var ARN: js.UndefOr[SecretARNType]
    var Name: js.UndefOr[SecretNameType]
    var VersionId: js.UndefOr[SecretVersionIdType]
    var VersionStages: js.UndefOr[SecretVersionStagesType]
  }

  @js.native
  @Factory
  trait RestoreSecretRequest extends js.Object {
    var SecretId: SecretIdType
  }

  @js.native
  @Factory
  trait RestoreSecretResponse extends js.Object {
    var ARN: js.UndefOr[SecretARNType]
    var Name: js.UndefOr[SecretNameType]
  }

  @js.native
  @Factory
  trait RotateSecretRequest extends js.Object {
    var SecretId: SecretIdType
    var ClientRequestToken: js.UndefOr[ClientRequestTokenType]
    var RotationLambdaARN: js.UndefOr[RotationLambdaARNType]
    var RotationRules: js.UndefOr[RotationRulesType]
  }

  @js.native
  @Factory
  trait RotateSecretResponse extends js.Object {
    var ARN: js.UndefOr[SecretARNType]
    var Name: js.UndefOr[SecretNameType]
    var VersionId: js.UndefOr[SecretVersionIdType]
  }

  /**
    * A structure that defines the rotation configuration for the secret.
    */
  @js.native
  @Factory
  trait RotationRulesType extends js.Object {
    var AutomaticallyAfterDays: js.UndefOr[AutomaticallyRotateAfterDaysType]
  }

  /**
    * A structure that contains the details about a secret. It does not include the encrypted <code>SecretString</code> and <code>SecretBinary</code> values. To get those values, use the <a>GetSecretValue</a> operation.
    */
  @js.native
  @Factory
  trait SecretListEntry extends js.Object {
    var ARN: js.UndefOr[SecretARNType]
    var DeletedDate: js.UndefOr[DeletedDateType]
    var Description: js.UndefOr[DescriptionType]
    var KmsKeyId: js.UndefOr[KmsKeyIdType]
    var LastAccessedDate: js.UndefOr[LastAccessedDateType]
    var LastChangedDate: js.UndefOr[LastChangedDateType]
    var LastRotatedDate: js.UndefOr[LastRotatedDateType]
    var Name: js.UndefOr[SecretNameType]
    var OwningService: js.UndefOr[OwningServiceType]
    var RotationEnabled: js.UndefOr[RotationEnabledType]
    var RotationLambdaARN: js.UndefOr[RotationLambdaARNType]
    var RotationRules: js.UndefOr[RotationRulesType]
    var SecretVersionsToStages: js.UndefOr[SecretVersionsToStagesMapType]
    var Tags: js.UndefOr[TagListType]
  }

  /**
    * A structure that contains information about one version of a secret.
    */
  @js.native
  @Factory
  trait SecretVersionsListEntry extends js.Object {
    var CreatedDate: js.UndefOr[CreatedDateType]
    var LastAccessedDate: js.UndefOr[LastAccessedDateType]
    var VersionId: js.UndefOr[SecretVersionIdType]
    var VersionStages: js.UndefOr[SecretVersionStagesType]
  }

  /**
    * A structure that contains information about a tag.
    */
  @js.native
  @Factory
  trait Tag extends js.Object {
    var Key: js.UndefOr[TagKeyType]
    var Value: js.UndefOr[TagValueType]
  }

  @js.native
  @Factory
  trait TagResourceRequest extends js.Object {
    var SecretId: SecretIdType
    var Tags: TagListType
  }

  @js.native
  @Factory
  trait UntagResourceRequest extends js.Object {
    var SecretId: SecretIdType
    var TagKeys: TagKeyListType
  }

  @js.native
  @Factory
  trait UpdateSecretRequest extends js.Object {
    var SecretId: SecretIdType
    var ClientRequestToken: js.UndefOr[ClientRequestTokenType]
    var Description: js.UndefOr[DescriptionType]
    var KmsKeyId: js.UndefOr[KmsKeyIdType]
    var SecretBinary: js.UndefOr[SecretBinaryType]
    var SecretString: js.UndefOr[SecretStringType]
  }

  @js.native
  @Factory
  trait UpdateSecretResponse extends js.Object {
    var ARN: js.UndefOr[SecretARNType]
    var Name: js.UndefOr[SecretNameType]
    var VersionId: js.UndefOr[SecretVersionIdType]
  }

  @js.native
  @Factory
  trait UpdateSecretVersionStageRequest extends js.Object {
    var SecretId: SecretIdType
    var VersionStage: SecretVersionStageType
    var MoveToVersionId: js.UndefOr[SecretVersionIdType]
    var RemoveFromVersionId: js.UndefOr[SecretVersionIdType]
  }

  @js.native
  @Factory
  trait UpdateSecretVersionStageResponse extends js.Object {
    var ARN: js.UndefOr[SecretARNType]
    var Name: js.UndefOr[SecretNameType]
  }
}
