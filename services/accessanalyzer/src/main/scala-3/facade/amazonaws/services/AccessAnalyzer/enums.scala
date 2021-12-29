package facade.amazonaws.services.accessanalyzer

import scalajs._

type AccessPreviewStatus = "COMPLETED" | "CREATING" | "FAILED"
object AccessPreviewStatus {
  val COMPLETED: "COMPLETED" = "COMPLETED"
  val CREATING: "CREATING" = "CREATING"
  val FAILED: "FAILED" = "FAILED"

  @inline def values = js.Array[AccessPreviewStatus](COMPLETED, CREATING, FAILED)
}

type AccessPreviewStatusReasonCode = "INTERNAL_ERROR" | "INVALID_CONFIGURATION"
object AccessPreviewStatusReasonCode {
  val INTERNAL_ERROR: "INTERNAL_ERROR" = "INTERNAL_ERROR"
  val INVALID_CONFIGURATION: "INVALID_CONFIGURATION" = "INVALID_CONFIGURATION"

  @inline def values = js.Array[AccessPreviewStatusReasonCode](INTERNAL_ERROR, INVALID_CONFIGURATION)
}

type AclPermission = "READ" | "WRITE" | "READ_ACP" | "WRITE_ACP" | "FULL_CONTROL"
object AclPermission {
  val READ: "READ" = "READ"
  val WRITE: "WRITE" = "WRITE"
  val READ_ACP: "READ_ACP" = "READ_ACP"
  val WRITE_ACP: "WRITE_ACP" = "WRITE_ACP"
  val FULL_CONTROL: "FULL_CONTROL" = "FULL_CONTROL"

  @inline def values = js.Array[AclPermission](READ, WRITE, READ_ACP, WRITE_ACP, FULL_CONTROL)
}

type AnalyzerStatus = "ACTIVE" | "CREATING" | "DISABLED" | "FAILED"
object AnalyzerStatus {
  val ACTIVE: "ACTIVE" = "ACTIVE"
  val CREATING: "CREATING" = "CREATING"
  val DISABLED: "DISABLED" = "DISABLED"
  val FAILED: "FAILED" = "FAILED"

  @inline def values = js.Array[AnalyzerStatus](ACTIVE, CREATING, DISABLED, FAILED)
}

type FindingChangeType = "CHANGED" | "NEW" | "UNCHANGED"
object FindingChangeType {
  val CHANGED: "CHANGED" = "CHANGED"
  val NEW: "NEW" = "NEW"
  val UNCHANGED: "UNCHANGED" = "UNCHANGED"

  @inline def values = js.Array[FindingChangeType](CHANGED, NEW, UNCHANGED)
}

type FindingSourceType = "POLICY" | "BUCKET_ACL" | "S3_ACCESS_POINT"
object FindingSourceType {
  val POLICY: "POLICY" = "POLICY"
  val BUCKET_ACL: "BUCKET_ACL" = "BUCKET_ACL"
  val S3_ACCESS_POINT: "S3_ACCESS_POINT" = "S3_ACCESS_POINT"

  @inline def values = js.Array[FindingSourceType](POLICY, BUCKET_ACL, S3_ACCESS_POINT)
}

type FindingStatus = "ACTIVE" | "ARCHIVED" | "RESOLVED"
object FindingStatus {
  val ACTIVE: "ACTIVE" = "ACTIVE"
  val ARCHIVED: "ARCHIVED" = "ARCHIVED"
  val RESOLVED: "RESOLVED" = "RESOLVED"

  @inline def values = js.Array[FindingStatus](ACTIVE, ARCHIVED, RESOLVED)
}

type FindingStatusUpdate = "ACTIVE" | "ARCHIVED"
object FindingStatusUpdate {
  val ACTIVE: "ACTIVE" = "ACTIVE"
  val ARCHIVED: "ARCHIVED" = "ARCHIVED"

  @inline def values = js.Array[FindingStatusUpdate](ACTIVE, ARCHIVED)
}

type JobErrorCode = "AUTHORIZATION_ERROR" | "RESOURCE_NOT_FOUND_ERROR" | "SERVICE_QUOTA_EXCEEDED_ERROR" | "SERVICE_ERROR"
object JobErrorCode {
  val AUTHORIZATION_ERROR: "AUTHORIZATION_ERROR" = "AUTHORIZATION_ERROR"
  val RESOURCE_NOT_FOUND_ERROR: "RESOURCE_NOT_FOUND_ERROR" = "RESOURCE_NOT_FOUND_ERROR"
  val SERVICE_QUOTA_EXCEEDED_ERROR: "SERVICE_QUOTA_EXCEEDED_ERROR" = "SERVICE_QUOTA_EXCEEDED_ERROR"
  val SERVICE_ERROR: "SERVICE_ERROR" = "SERVICE_ERROR"

  @inline def values = js.Array[JobErrorCode](AUTHORIZATION_ERROR, RESOURCE_NOT_FOUND_ERROR, SERVICE_QUOTA_EXCEEDED_ERROR, SERVICE_ERROR)
}

type JobStatus = "IN_PROGRESS" | "SUCCEEDED" | "FAILED" | "CANCELED"
object JobStatus {
  val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  val SUCCEEDED: "SUCCEEDED" = "SUCCEEDED"
  val FAILED: "FAILED" = "FAILED"
  val CANCELED: "CANCELED" = "CANCELED"

  @inline def values = js.Array[JobStatus](IN_PROGRESS, SUCCEEDED, FAILED, CANCELED)
}

type KmsGrantOperation = "CreateGrant" | "Decrypt" | "DescribeKey" | "Encrypt" | "GenerateDataKey" | "GenerateDataKeyPair" | "GenerateDataKeyPairWithoutPlaintext" | "GenerateDataKeyWithoutPlaintext" | "GetPublicKey" | "ReEncryptFrom" | "ReEncryptTo" | "RetireGrant" | "Sign" | "Verify"
object KmsGrantOperation {
  val CreateGrant: "CreateGrant" = "CreateGrant"
  val Decrypt: "Decrypt" = "Decrypt"
  val DescribeKey: "DescribeKey" = "DescribeKey"
  val Encrypt: "Encrypt" = "Encrypt"
  val GenerateDataKey: "GenerateDataKey" = "GenerateDataKey"
  val GenerateDataKeyPair: "GenerateDataKeyPair" = "GenerateDataKeyPair"
  val GenerateDataKeyPairWithoutPlaintext: "GenerateDataKeyPairWithoutPlaintext" = "GenerateDataKeyPairWithoutPlaintext"
  val GenerateDataKeyWithoutPlaintext: "GenerateDataKeyWithoutPlaintext" = "GenerateDataKeyWithoutPlaintext"
  val GetPublicKey: "GetPublicKey" = "GetPublicKey"
  val ReEncryptFrom: "ReEncryptFrom" = "ReEncryptFrom"
  val ReEncryptTo: "ReEncryptTo" = "ReEncryptTo"
  val RetireGrant: "RetireGrant" = "RetireGrant"
  val Sign: "Sign" = "Sign"
  val Verify: "Verify" = "Verify"

  @inline def values = js.Array[KmsGrantOperation](
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

type Locale = "DE" | "EN" | "ES" | "FR" | "IT" | "JA" | "KO" | "PT_BR" | "ZH_CN" | "ZH_TW"
object Locale {
  val DE: "DE" = "DE"
  val EN: "EN" = "EN"
  val ES: "ES" = "ES"
  val FR: "FR" = "FR"
  val IT: "IT" = "IT"
  val JA: "JA" = "JA"
  val KO: "KO" = "KO"
  val PT_BR: "PT_BR" = "PT_BR"
  val ZH_CN: "ZH_CN" = "ZH_CN"
  val ZH_TW: "ZH_TW" = "ZH_TW"

  @inline def values = js.Array[Locale](DE, EN, ES, FR, IT, JA, KO, PT_BR, ZH_CN, ZH_TW)
}

type OrderBy = "ASC" | "DESC"
object OrderBy {
  val ASC: "ASC" = "ASC"
  val DESC: "DESC" = "DESC"

  @inline def values = js.Array[OrderBy](ASC, DESC)
}

type PolicyType = "IDENTITY_POLICY" | "RESOURCE_POLICY" | "SERVICE_CONTROL_POLICY"
object PolicyType {
  val IDENTITY_POLICY: "IDENTITY_POLICY" = "IDENTITY_POLICY"
  val RESOURCE_POLICY: "RESOURCE_POLICY" = "RESOURCE_POLICY"
  val SERVICE_CONTROL_POLICY: "SERVICE_CONTROL_POLICY" = "SERVICE_CONTROL_POLICY"

  @inline def values = js.Array[PolicyType](IDENTITY_POLICY, RESOURCE_POLICY, SERVICE_CONTROL_POLICY)
}

type ReasonCode = "AWS_SERVICE_ACCESS_DISABLED" | "DELEGATED_ADMINISTRATOR_DEREGISTERED" | "ORGANIZATION_DELETED" | "SERVICE_LINKED_ROLE_CREATION_FAILED"
object ReasonCode {
  val AWS_SERVICE_ACCESS_DISABLED: "AWS_SERVICE_ACCESS_DISABLED" = "AWS_SERVICE_ACCESS_DISABLED"
  val DELEGATED_ADMINISTRATOR_DEREGISTERED: "DELEGATED_ADMINISTRATOR_DEREGISTERED" = "DELEGATED_ADMINISTRATOR_DEREGISTERED"
  val ORGANIZATION_DELETED: "ORGANIZATION_DELETED" = "ORGANIZATION_DELETED"
  val SERVICE_LINKED_ROLE_CREATION_FAILED: "SERVICE_LINKED_ROLE_CREATION_FAILED" = "SERVICE_LINKED_ROLE_CREATION_FAILED"

  @inline def values = js.Array[ReasonCode](AWS_SERVICE_ACCESS_DISABLED, DELEGATED_ADMINISTRATOR_DEREGISTERED, ORGANIZATION_DELETED, SERVICE_LINKED_ROLE_CREATION_FAILED)
}

type ResourceType = "AWS::S3::Bucket" | "AWS::IAM::Role" | "AWS::SQS::Queue" | "AWS::Lambda::Function" | "AWS::Lambda::LayerVersion" | "AWS::KMS::Key" | "AWS::SecretsManager::Secret"
object ResourceType {
  val `AWS::S3::Bucket`: "AWS::S3::Bucket" = "AWS::S3::Bucket"
  val `AWS::IAM::Role`: "AWS::IAM::Role" = "AWS::IAM::Role"
  val `AWS::SQS::Queue`: "AWS::SQS::Queue" = "AWS::SQS::Queue"
  val `AWS::Lambda::Function`: "AWS::Lambda::Function" = "AWS::Lambda::Function"
  val `AWS::Lambda::LayerVersion`: "AWS::Lambda::LayerVersion" = "AWS::Lambda::LayerVersion"
  val `AWS::KMS::Key`: "AWS::KMS::Key" = "AWS::KMS::Key"
  val `AWS::SecretsManager::Secret`: "AWS::SecretsManager::Secret" = "AWS::SecretsManager::Secret"

  @inline def values = js.Array[ResourceType](
    `AWS::S3::Bucket`,
    `AWS::IAM::Role`,
    `AWS::SQS::Queue`,
    `AWS::Lambda::Function`,
    `AWS::Lambda::LayerVersion`,
    `AWS::KMS::Key`,
    `AWS::SecretsManager::Secret`
  )
}

type Type = "ACCOUNT" | "ORGANIZATION"
object Type {
  val ACCOUNT: "ACCOUNT" = "ACCOUNT"
  val ORGANIZATION: "ORGANIZATION" = "ORGANIZATION"

  @inline def values = js.Array[Type](ACCOUNT, ORGANIZATION)
}

type ValidatePolicyFindingType = "ERROR" | "SECURITY_WARNING" | "SUGGESTION" | "WARNING"
object ValidatePolicyFindingType {
  val ERROR: "ERROR" = "ERROR"
  val SECURITY_WARNING: "SECURITY_WARNING" = "SECURITY_WARNING"
  val SUGGESTION: "SUGGESTION" = "SUGGESTION"
  val WARNING: "WARNING" = "WARNING"

  @inline def values = js.Array[ValidatePolicyFindingType](ERROR, SECURITY_WARNING, SUGGESTION, WARNING)
}
