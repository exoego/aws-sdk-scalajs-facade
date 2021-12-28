package facade.amazonaws.services.accessanalyzer

import scalajs._
import scala.scalajs.js.|

@js.native
sealed trait AccessPreviewStatus extends js.Any
object AccessPreviewStatus {
  val COMPLETED = "COMPLETED".asInstanceOf[AccessPreviewStatus]
  val CREATING = "CREATING".asInstanceOf[AccessPreviewStatus]
  val FAILED = "FAILED".asInstanceOf[AccessPreviewStatus]

  @inline def values = js.Array(COMPLETED, CREATING, FAILED)
}

@js.native
sealed trait AccessPreviewStatusReasonCode extends js.Any
object AccessPreviewStatusReasonCode {
  val INTERNAL_ERROR = "INTERNAL_ERROR".asInstanceOf[AccessPreviewStatusReasonCode]
  val INVALID_CONFIGURATION = "INVALID_CONFIGURATION".asInstanceOf[AccessPreviewStatusReasonCode]

  @inline def values = js.Array(INTERNAL_ERROR, INVALID_CONFIGURATION)
}

@js.native
sealed trait AclPermission extends js.Any
object AclPermission {
  val READ = "READ".asInstanceOf[AclPermission]
  val WRITE = "WRITE".asInstanceOf[AclPermission]
  val READ_ACP = "READ_ACP".asInstanceOf[AclPermission]
  val WRITE_ACP = "WRITE_ACP".asInstanceOf[AclPermission]
  val FULL_CONTROL = "FULL_CONTROL".asInstanceOf[AclPermission]

  @inline def values = js.Array(READ, WRITE, READ_ACP, WRITE_ACP, FULL_CONTROL)
}

@js.native
sealed trait AnalyzerStatus extends js.Any
object AnalyzerStatus {
  val ACTIVE = "ACTIVE".asInstanceOf[AnalyzerStatus]
  val CREATING = "CREATING".asInstanceOf[AnalyzerStatus]
  val DISABLED = "DISABLED".asInstanceOf[AnalyzerStatus]
  val FAILED = "FAILED".asInstanceOf[AnalyzerStatus]

  @inline def values = js.Array(ACTIVE, CREATING, DISABLED, FAILED)
}

@js.native
sealed trait FindingChangeType extends js.Any
object FindingChangeType {
  val CHANGED = "CHANGED".asInstanceOf[FindingChangeType]
  val NEW = "NEW".asInstanceOf[FindingChangeType]
  val UNCHANGED = "UNCHANGED".asInstanceOf[FindingChangeType]

  @inline def values = js.Array(CHANGED, NEW, UNCHANGED)
}

@js.native
sealed trait FindingSourceType extends js.Any
object FindingSourceType {
  val POLICY = "POLICY".asInstanceOf[FindingSourceType]
  val BUCKET_ACL = "BUCKET_ACL".asInstanceOf[FindingSourceType]
  val S3_ACCESS_POINT = "S3_ACCESS_POINT".asInstanceOf[FindingSourceType]

  @inline def values = js.Array(POLICY, BUCKET_ACL, S3_ACCESS_POINT)
}

@js.native
sealed trait FindingStatus extends js.Any
object FindingStatus {
  val ACTIVE = "ACTIVE".asInstanceOf[FindingStatus]
  val ARCHIVED = "ARCHIVED".asInstanceOf[FindingStatus]
  val RESOLVED = "RESOLVED".asInstanceOf[FindingStatus]

  @inline def values = js.Array(ACTIVE, ARCHIVED, RESOLVED)
}

@js.native
sealed trait FindingStatusUpdate extends js.Any
object FindingStatusUpdate {
  val ACTIVE = "ACTIVE".asInstanceOf[FindingStatusUpdate]
  val ARCHIVED = "ARCHIVED".asInstanceOf[FindingStatusUpdate]

  @inline def values = js.Array(ACTIVE, ARCHIVED)
}

@js.native
sealed trait JobErrorCode extends js.Any
object JobErrorCode {
  val AUTHORIZATION_ERROR = "AUTHORIZATION_ERROR".asInstanceOf[JobErrorCode]
  val RESOURCE_NOT_FOUND_ERROR = "RESOURCE_NOT_FOUND_ERROR".asInstanceOf[JobErrorCode]
  val SERVICE_QUOTA_EXCEEDED_ERROR = "SERVICE_QUOTA_EXCEEDED_ERROR".asInstanceOf[JobErrorCode]
  val SERVICE_ERROR = "SERVICE_ERROR".asInstanceOf[JobErrorCode]

  @inline def values = js.Array(AUTHORIZATION_ERROR, RESOURCE_NOT_FOUND_ERROR, SERVICE_QUOTA_EXCEEDED_ERROR, SERVICE_ERROR)
}

@js.native
sealed trait JobStatus extends js.Any
object JobStatus {
  val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[JobStatus]
  val SUCCEEDED = "SUCCEEDED".asInstanceOf[JobStatus]
  val FAILED = "FAILED".asInstanceOf[JobStatus]
  val CANCELED = "CANCELED".asInstanceOf[JobStatus]

  @inline def values = js.Array(IN_PROGRESS, SUCCEEDED, FAILED, CANCELED)
}

@js.native
sealed trait KmsGrantOperation extends js.Any
object KmsGrantOperation {
  val CreateGrant = "CreateGrant".asInstanceOf[KmsGrantOperation]
  val Decrypt = "Decrypt".asInstanceOf[KmsGrantOperation]
  val DescribeKey = "DescribeKey".asInstanceOf[KmsGrantOperation]
  val Encrypt = "Encrypt".asInstanceOf[KmsGrantOperation]
  val GenerateDataKey = "GenerateDataKey".asInstanceOf[KmsGrantOperation]
  val GenerateDataKeyPair = "GenerateDataKeyPair".asInstanceOf[KmsGrantOperation]
  val GenerateDataKeyPairWithoutPlaintext = "GenerateDataKeyPairWithoutPlaintext".asInstanceOf[KmsGrantOperation]
  val GenerateDataKeyWithoutPlaintext = "GenerateDataKeyWithoutPlaintext".asInstanceOf[KmsGrantOperation]
  val GetPublicKey = "GetPublicKey".asInstanceOf[KmsGrantOperation]
  val ReEncryptFrom = "ReEncryptFrom".asInstanceOf[KmsGrantOperation]
  val ReEncryptTo = "ReEncryptTo".asInstanceOf[KmsGrantOperation]
  val RetireGrant = "RetireGrant".asInstanceOf[KmsGrantOperation]
  val Sign = "Sign".asInstanceOf[KmsGrantOperation]
  val Verify = "Verify".asInstanceOf[KmsGrantOperation]

  @inline def values = js.Array(
    CreateGrant,
    Decrypt,
    DescribeKey,
    Encrypt,
    GenerateDataKey,
    GenerateDataKeyPair,
    GenerateDataKeyPairWithoutPlaintext,
    GenerateDataKeyWithoutPlaintext,
    GetPublicKey,
    ReEncryptFrom,
    ReEncryptTo,
    RetireGrant,
    Sign,
    Verify
  )
}

@js.native
sealed trait Locale extends js.Any
object Locale {
  val DE = "DE".asInstanceOf[Locale]
  val EN = "EN".asInstanceOf[Locale]
  val ES = "ES".asInstanceOf[Locale]
  val FR = "FR".asInstanceOf[Locale]
  val IT = "IT".asInstanceOf[Locale]
  val JA = "JA".asInstanceOf[Locale]
  val KO = "KO".asInstanceOf[Locale]
  val PT_BR = "PT_BR".asInstanceOf[Locale]
  val ZH_CN = "ZH_CN".asInstanceOf[Locale]
  val ZH_TW = "ZH_TW".asInstanceOf[Locale]

  @inline def values = js.Array(DE, EN, ES, FR, IT, JA, KO, PT_BR, ZH_CN, ZH_TW)
}

@js.native
sealed trait OrderBy extends js.Any
object OrderBy {
  val ASC = "ASC".asInstanceOf[OrderBy]
  val DESC = "DESC".asInstanceOf[OrderBy]

  @inline def values = js.Array(ASC, DESC)
}

@js.native
sealed trait PolicyType extends js.Any
object PolicyType {
  val IDENTITY_POLICY = "IDENTITY_POLICY".asInstanceOf[PolicyType]
  val RESOURCE_POLICY = "RESOURCE_POLICY".asInstanceOf[PolicyType]
  val SERVICE_CONTROL_POLICY = "SERVICE_CONTROL_POLICY".asInstanceOf[PolicyType]

  @inline def values = js.Array(IDENTITY_POLICY, RESOURCE_POLICY, SERVICE_CONTROL_POLICY)
}

@js.native
sealed trait ReasonCode extends js.Any
object ReasonCode {
  val AWS_SERVICE_ACCESS_DISABLED = "AWS_SERVICE_ACCESS_DISABLED".asInstanceOf[ReasonCode]
  val DELEGATED_ADMINISTRATOR_DEREGISTERED = "DELEGATED_ADMINISTRATOR_DEREGISTERED".asInstanceOf[ReasonCode]
  val ORGANIZATION_DELETED = "ORGANIZATION_DELETED".asInstanceOf[ReasonCode]
  val SERVICE_LINKED_ROLE_CREATION_FAILED = "SERVICE_LINKED_ROLE_CREATION_FAILED".asInstanceOf[ReasonCode]

  @inline def values = js.Array(AWS_SERVICE_ACCESS_DISABLED, DELEGATED_ADMINISTRATOR_DEREGISTERED, ORGANIZATION_DELETED, SERVICE_LINKED_ROLE_CREATION_FAILED)
}

@js.native
sealed trait ResourceType extends js.Any
object ResourceType {
  val `AWS::S3::Bucket` = "AWS::S3::Bucket".asInstanceOf[ResourceType]
  val `AWS::IAM::Role` = "AWS::IAM::Role".asInstanceOf[ResourceType]
  val `AWS::SQS::Queue` = "AWS::SQS::Queue".asInstanceOf[ResourceType]
  val `AWS::Lambda::Function` = "AWS::Lambda::Function".asInstanceOf[ResourceType]
  val `AWS::Lambda::LayerVersion` = "AWS::Lambda::LayerVersion".asInstanceOf[ResourceType]
  val `AWS::KMS::Key` = "AWS::KMS::Key".asInstanceOf[ResourceType]
  val `AWS::SecretsManager::Secret` = "AWS::SecretsManager::Secret".asInstanceOf[ResourceType]

  @inline def values = js.Array(
    `AWS::S3::Bucket`,
    `AWS::IAM::Role`,
    `AWS::SQS::Queue`,
    `AWS::Lambda::Function`,
    `AWS::Lambda::LayerVersion`,
    `AWS::KMS::Key`,
    `AWS::SecretsManager::Secret`
  )
}

@js.native
sealed trait Type extends js.Any
object Type {
  val ACCOUNT = "ACCOUNT".asInstanceOf[Type]
  val ORGANIZATION = "ORGANIZATION".asInstanceOf[Type]

  @inline def values = js.Array(ACCOUNT, ORGANIZATION)
}

@js.native
sealed trait ValidatePolicyFindingType extends js.Any
object ValidatePolicyFindingType {
  val ERROR = "ERROR".asInstanceOf[ValidatePolicyFindingType]
  val SECURITY_WARNING = "SECURITY_WARNING".asInstanceOf[ValidatePolicyFindingType]
  val SUGGESTION = "SUGGESTION".asInstanceOf[ValidatePolicyFindingType]
  val WARNING = "WARNING".asInstanceOf[ValidatePolicyFindingType]

  @inline def values = js.Array(ERROR, SECURITY_WARNING, SUGGESTION, WARNING)
}
