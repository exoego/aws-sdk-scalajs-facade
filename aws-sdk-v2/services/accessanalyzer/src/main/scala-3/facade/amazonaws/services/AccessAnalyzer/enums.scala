package facade.amazonaws.services.accessanalyzer

import scalajs.js

type AccessPreviewStatus = "COMPLETED" | "CREATING" | "FAILED"
object AccessPreviewStatus {
  inline val COMPLETED: "COMPLETED" = "COMPLETED"
  inline val CREATING: "CREATING" = "CREATING"
  inline val FAILED: "FAILED" = "FAILED"

  inline def values: js.Array[AccessPreviewStatus] = js.Array(COMPLETED, CREATING, FAILED)
}

type AccessPreviewStatusReasonCode = "INTERNAL_ERROR" | "INVALID_CONFIGURATION"
object AccessPreviewStatusReasonCode {
  inline val INTERNAL_ERROR: "INTERNAL_ERROR" = "INTERNAL_ERROR"
  inline val INVALID_CONFIGURATION: "INVALID_CONFIGURATION" = "INVALID_CONFIGURATION"

  inline def values: js.Array[AccessPreviewStatusReasonCode] = js.Array(INTERNAL_ERROR, INVALID_CONFIGURATION)
}

type AclPermission = "READ" | "WRITE" | "READ_ACP" | "WRITE_ACP" | "FULL_CONTROL"
object AclPermission {
  inline val READ: "READ" = "READ"
  inline val WRITE: "WRITE" = "WRITE"
  inline val READ_ACP: "READ_ACP" = "READ_ACP"
  inline val WRITE_ACP: "WRITE_ACP" = "WRITE_ACP"
  inline val FULL_CONTROL: "FULL_CONTROL" = "FULL_CONTROL"

  inline def values: js.Array[AclPermission] = js.Array(READ, WRITE, READ_ACP, WRITE_ACP, FULL_CONTROL)
}

type AnalyzerStatus = "ACTIVE" | "CREATING" | "DISABLED" | "FAILED"
object AnalyzerStatus {
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val CREATING: "CREATING" = "CREATING"
  inline val DISABLED: "DISABLED" = "DISABLED"
  inline val FAILED: "FAILED" = "FAILED"

  inline def values: js.Array[AnalyzerStatus] = js.Array(ACTIVE, CREATING, DISABLED, FAILED)
}

type FindingChangeType = "CHANGED" | "NEW" | "UNCHANGED"
object FindingChangeType {
  inline val CHANGED: "CHANGED" = "CHANGED"
  inline val NEW: "NEW" = "NEW"
  inline val UNCHANGED: "UNCHANGED" = "UNCHANGED"

  inline def values: js.Array[FindingChangeType] = js.Array(CHANGED, NEW, UNCHANGED)
}

type FindingSourceType = "POLICY" | "BUCKET_ACL" | "S3_ACCESS_POINT"
object FindingSourceType {
  inline val POLICY: "POLICY" = "POLICY"
  inline val BUCKET_ACL: "BUCKET_ACL" = "BUCKET_ACL"
  inline val S3_ACCESS_POINT: "S3_ACCESS_POINT" = "S3_ACCESS_POINT"

  inline def values: js.Array[FindingSourceType] = js.Array(POLICY, BUCKET_ACL, S3_ACCESS_POINT)
}

type FindingStatus = "ACTIVE" | "ARCHIVED" | "RESOLVED"
object FindingStatus {
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val ARCHIVED: "ARCHIVED" = "ARCHIVED"
  inline val RESOLVED: "RESOLVED" = "RESOLVED"

  inline def values: js.Array[FindingStatus] = js.Array(ACTIVE, ARCHIVED, RESOLVED)
}

type FindingStatusUpdate = "ACTIVE" | "ARCHIVED"
object FindingStatusUpdate {
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val ARCHIVED: "ARCHIVED" = "ARCHIVED"

  inline def values: js.Array[FindingStatusUpdate] = js.Array(ACTIVE, ARCHIVED)
}

type JobErrorCode = "AUTHORIZATION_ERROR" | "RESOURCE_NOT_FOUND_ERROR" | "SERVICE_QUOTA_EXCEEDED_ERROR" | "SERVICE_ERROR"
object JobErrorCode {
  inline val AUTHORIZATION_ERROR: "AUTHORIZATION_ERROR" = "AUTHORIZATION_ERROR"
  inline val RESOURCE_NOT_FOUND_ERROR: "RESOURCE_NOT_FOUND_ERROR" = "RESOURCE_NOT_FOUND_ERROR"
  inline val SERVICE_QUOTA_EXCEEDED_ERROR: "SERVICE_QUOTA_EXCEEDED_ERROR" = "SERVICE_QUOTA_EXCEEDED_ERROR"
  inline val SERVICE_ERROR: "SERVICE_ERROR" = "SERVICE_ERROR"

  inline def values: js.Array[JobErrorCode] = js.Array(AUTHORIZATION_ERROR, RESOURCE_NOT_FOUND_ERROR, SERVICE_QUOTA_EXCEEDED_ERROR, SERVICE_ERROR)
}

type JobStatus = "IN_PROGRESS" | "SUCCEEDED" | "FAILED" | "CANCELED"
object JobStatus {
  inline val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  inline val SUCCEEDED: "SUCCEEDED" = "SUCCEEDED"
  inline val FAILED: "FAILED" = "FAILED"
  inline val CANCELED: "CANCELED" = "CANCELED"

  inline def values: js.Array[JobStatus] = js.Array(IN_PROGRESS, SUCCEEDED, FAILED, CANCELED)
}

type KmsGrantOperation = "CreateGrant" | "Decrypt" | "DescribeKey" | "Encrypt" | "GenerateDataKey" | "GenerateDataKeyPair" | "GenerateDataKeyPairWithoutPlaintext" | "GenerateDataKeyWithoutPlaintext" | "GetPublicKey" | "ReEncryptFrom" | "ReEncryptTo" | "RetireGrant" | "Sign" | "Verify"
object KmsGrantOperation {
  inline val CreateGrant: "CreateGrant" = "CreateGrant"
  inline val Decrypt: "Decrypt" = "Decrypt"
  inline val DescribeKey: "DescribeKey" = "DescribeKey"
  inline val Encrypt: "Encrypt" = "Encrypt"
  inline val GenerateDataKey: "GenerateDataKey" = "GenerateDataKey"
  inline val GenerateDataKeyPair: "GenerateDataKeyPair" = "GenerateDataKeyPair"
  inline val GenerateDataKeyPairWithoutPlaintext: "GenerateDataKeyPairWithoutPlaintext" = "GenerateDataKeyPairWithoutPlaintext"
  inline val GenerateDataKeyWithoutPlaintext: "GenerateDataKeyWithoutPlaintext" = "GenerateDataKeyWithoutPlaintext"
  inline val GetPublicKey: "GetPublicKey" = "GetPublicKey"
  inline val ReEncryptFrom: "ReEncryptFrom" = "ReEncryptFrom"
  inline val ReEncryptTo: "ReEncryptTo" = "ReEncryptTo"
  inline val RetireGrant: "RetireGrant" = "RetireGrant"
  inline val Sign: "Sign" = "Sign"
  inline val Verify: "Verify" = "Verify"

  inline def values: js.Array[KmsGrantOperation] = js.Array(
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
  inline val DE: "DE" = "DE"
  inline val EN: "EN" = "EN"
  inline val ES: "ES" = "ES"
  inline val FR: "FR" = "FR"
  inline val IT: "IT" = "IT"
  inline val JA: "JA" = "JA"
  inline val KO: "KO" = "KO"
  inline val PT_BR: "PT_BR" = "PT_BR"
  inline val ZH_CN: "ZH_CN" = "ZH_CN"
  inline val ZH_TW: "ZH_TW" = "ZH_TW"

  inline def values: js.Array[Locale] = js.Array(DE, EN, ES, FR, IT, JA, KO, PT_BR, ZH_CN, ZH_TW)
}

type OrderBy = "ASC" | "DESC"
object OrderBy {
  inline val ASC: "ASC" = "ASC"
  inline val DESC: "DESC" = "DESC"

  inline def values: js.Array[OrderBy] = js.Array(ASC, DESC)
}

type PolicyType = "IDENTITY_POLICY" | "RESOURCE_POLICY" | "SERVICE_CONTROL_POLICY"
object PolicyType {
  inline val IDENTITY_POLICY: "IDENTITY_POLICY" = "IDENTITY_POLICY"
  inline val RESOURCE_POLICY: "RESOURCE_POLICY" = "RESOURCE_POLICY"
  inline val SERVICE_CONTROL_POLICY: "SERVICE_CONTROL_POLICY" = "SERVICE_CONTROL_POLICY"

  inline def values: js.Array[PolicyType] = js.Array(IDENTITY_POLICY, RESOURCE_POLICY, SERVICE_CONTROL_POLICY)
}

type ReasonCode = "AWS_SERVICE_ACCESS_DISABLED" | "DELEGATED_ADMINISTRATOR_DEREGISTERED" | "ORGANIZATION_DELETED" | "SERVICE_LINKED_ROLE_CREATION_FAILED"
object ReasonCode {
  inline val AWS_SERVICE_ACCESS_DISABLED: "AWS_SERVICE_ACCESS_DISABLED" = "AWS_SERVICE_ACCESS_DISABLED"
  inline val DELEGATED_ADMINISTRATOR_DEREGISTERED: "DELEGATED_ADMINISTRATOR_DEREGISTERED" = "DELEGATED_ADMINISTRATOR_DEREGISTERED"
  inline val ORGANIZATION_DELETED: "ORGANIZATION_DELETED" = "ORGANIZATION_DELETED"
  inline val SERVICE_LINKED_ROLE_CREATION_FAILED: "SERVICE_LINKED_ROLE_CREATION_FAILED" = "SERVICE_LINKED_ROLE_CREATION_FAILED"

  inline def values: js.Array[ReasonCode] = js.Array(AWS_SERVICE_ACCESS_DISABLED, DELEGATED_ADMINISTRATOR_DEREGISTERED, ORGANIZATION_DELETED, SERVICE_LINKED_ROLE_CREATION_FAILED)
}

type ResourceType = "AWS::S3::Bucket" | "AWS::IAM::Role" | "AWS::SQS::Queue" | "AWS::Lambda::Function" | "AWS::Lambda::LayerVersion" | "AWS::KMS::Key" | "AWS::SecretsManager::Secret"
object ResourceType {
  inline val `AWS::S3::Bucket`: "AWS::S3::Bucket" = "AWS::S3::Bucket"
  inline val `AWS::IAM::Role`: "AWS::IAM::Role" = "AWS::IAM::Role"
  inline val `AWS::SQS::Queue`: "AWS::SQS::Queue" = "AWS::SQS::Queue"
  inline val `AWS::Lambda::Function`: "AWS::Lambda::Function" = "AWS::Lambda::Function"
  inline val `AWS::Lambda::LayerVersion`: "AWS::Lambda::LayerVersion" = "AWS::Lambda::LayerVersion"
  inline val `AWS::KMS::Key`: "AWS::KMS::Key" = "AWS::KMS::Key"
  inline val `AWS::SecretsManager::Secret`: "AWS::SecretsManager::Secret" = "AWS::SecretsManager::Secret"

  inline def values: js.Array[ResourceType] = js.Array(
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
  inline val ACCOUNT: "ACCOUNT" = "ACCOUNT"
  inline val ORGANIZATION: "ORGANIZATION" = "ORGANIZATION"

  inline def values: js.Array[Type] = js.Array(ACCOUNT, ORGANIZATION)
}

type ValidatePolicyFindingType = "ERROR" | "SECURITY_WARNING" | "SUGGESTION" | "WARNING"
object ValidatePolicyFindingType {
  inline val ERROR: "ERROR" = "ERROR"
  inline val SECURITY_WARNING: "SECURITY_WARNING" = "SECURITY_WARNING"
  inline val SUGGESTION: "SUGGESTION" = "SUGGESTION"
  inline val WARNING: "WARNING" = "WARNING"

  inline def values: js.Array[ValidatePolicyFindingType] = js.Array(ERROR, SECURITY_WARNING, SUGGESTION, WARNING)
}

type ValidatePolicyResourceType = "AWS::S3::Bucket" | "AWS::S3::AccessPoint" | "AWS::S3::MultiRegionAccessPoint" | "AWS::S3ObjectLambda::AccessPoint"
object ValidatePolicyResourceType {
  inline val `AWS::S3::Bucket`: "AWS::S3::Bucket" = "AWS::S3::Bucket"
  inline val `AWS::S3::AccessPoint`: "AWS::S3::AccessPoint" = "AWS::S3::AccessPoint"
  inline val `AWS::S3::MultiRegionAccessPoint`: "AWS::S3::MultiRegionAccessPoint" = "AWS::S3::MultiRegionAccessPoint"
  inline val `AWS::S3ObjectLambda::AccessPoint`: "AWS::S3ObjectLambda::AccessPoint" = "AWS::S3ObjectLambda::AccessPoint"

  inline def values: js.Array[ValidatePolicyResourceType] = js.Array(`AWS::S3::Bucket`, `AWS::S3::AccessPoint`, `AWS::S3::MultiRegionAccessPoint`, `AWS::S3ObjectLambda::AccessPoint`)
}
