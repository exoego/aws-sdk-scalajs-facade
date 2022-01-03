package facade.amazonaws.services.organizations

import scalajs.js

type AccountJoinedMethod = "INVITED" | "CREATED"
object AccountJoinedMethod {
  inline val INVITED: "INVITED" = "INVITED"
  inline val CREATED: "CREATED" = "CREATED"

  inline def values: js.Array[AccountJoinedMethod] = js.Array(INVITED, CREATED)
}

type AccountStatus = "ACTIVE" | "SUSPENDED"
object AccountStatus {
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val SUSPENDED: "SUSPENDED" = "SUSPENDED"

  inline def values: js.Array[AccountStatus] = js.Array(ACTIVE, SUSPENDED)
}

type ActionType = "INVITE" | "ENABLE_ALL_FEATURES" | "APPROVE_ALL_FEATURES" | "ADD_ORGANIZATIONS_SERVICE_LINKED_ROLE"
object ActionType {
  inline val INVITE: "INVITE" = "INVITE"
  inline val ENABLE_ALL_FEATURES: "ENABLE_ALL_FEATURES" = "ENABLE_ALL_FEATURES"
  inline val APPROVE_ALL_FEATURES: "APPROVE_ALL_FEATURES" = "APPROVE_ALL_FEATURES"
  inline val ADD_ORGANIZATIONS_SERVICE_LINKED_ROLE: "ADD_ORGANIZATIONS_SERVICE_LINKED_ROLE" = "ADD_ORGANIZATIONS_SERVICE_LINKED_ROLE"

  inline def values: js.Array[ActionType] = js.Array(INVITE, ENABLE_ALL_FEATURES, APPROVE_ALL_FEATURES, ADD_ORGANIZATIONS_SERVICE_LINKED_ROLE)
}

type ChildType = "ACCOUNT" | "ORGANIZATIONAL_UNIT"
object ChildType {
  inline val ACCOUNT: "ACCOUNT" = "ACCOUNT"
  inline val ORGANIZATIONAL_UNIT: "ORGANIZATIONAL_UNIT" = "ORGANIZATIONAL_UNIT"

  inline def values: js.Array[ChildType] = js.Array(ACCOUNT, ORGANIZATIONAL_UNIT)
}

type CreateAccountFailureReason = "ACCOUNT_LIMIT_EXCEEDED" | "EMAIL_ALREADY_EXISTS" | "INVALID_ADDRESS" | "INVALID_EMAIL" | "CONCURRENT_ACCOUNT_MODIFICATION" | "INTERNAL_FAILURE" | "GOVCLOUD_ACCOUNT_ALREADY_EXISTS" | "MISSING_BUSINESS_VALIDATION" | "FAILED_BUSINESS_VALIDATION" | "PENDING_BUSINESS_VALIDATION" | "INVALID_IDENTITY_FOR_BUSINESS_VALIDATION" | "UNKNOWN_BUSINESS_VALIDATION" | "MISSING_PAYMENT_INSTRUMENT"
object CreateAccountFailureReason {
  inline val ACCOUNT_LIMIT_EXCEEDED: "ACCOUNT_LIMIT_EXCEEDED" = "ACCOUNT_LIMIT_EXCEEDED"
  inline val EMAIL_ALREADY_EXISTS: "EMAIL_ALREADY_EXISTS" = "EMAIL_ALREADY_EXISTS"
  inline val INVALID_ADDRESS: "INVALID_ADDRESS" = "INVALID_ADDRESS"
  inline val INVALID_EMAIL: "INVALID_EMAIL" = "INVALID_EMAIL"
  inline val CONCURRENT_ACCOUNT_MODIFICATION: "CONCURRENT_ACCOUNT_MODIFICATION" = "CONCURRENT_ACCOUNT_MODIFICATION"
  inline val INTERNAL_FAILURE: "INTERNAL_FAILURE" = "INTERNAL_FAILURE"
  inline val GOVCLOUD_ACCOUNT_ALREADY_EXISTS: "GOVCLOUD_ACCOUNT_ALREADY_EXISTS" = "GOVCLOUD_ACCOUNT_ALREADY_EXISTS"
  inline val MISSING_BUSINESS_VALIDATION: "MISSING_BUSINESS_VALIDATION" = "MISSING_BUSINESS_VALIDATION"
  inline val FAILED_BUSINESS_VALIDATION: "FAILED_BUSINESS_VALIDATION" = "FAILED_BUSINESS_VALIDATION"
  inline val PENDING_BUSINESS_VALIDATION: "PENDING_BUSINESS_VALIDATION" = "PENDING_BUSINESS_VALIDATION"
  inline val INVALID_IDENTITY_FOR_BUSINESS_VALIDATION: "INVALID_IDENTITY_FOR_BUSINESS_VALIDATION" = "INVALID_IDENTITY_FOR_BUSINESS_VALIDATION"
  inline val UNKNOWN_BUSINESS_VALIDATION: "UNKNOWN_BUSINESS_VALIDATION" = "UNKNOWN_BUSINESS_VALIDATION"
  inline val MISSING_PAYMENT_INSTRUMENT: "MISSING_PAYMENT_INSTRUMENT" = "MISSING_PAYMENT_INSTRUMENT"

  inline def values: js.Array[CreateAccountFailureReason] = js.Array(
    ACCOUNT_LIMIT_EXCEEDED,
    EMAIL_ALREADY_EXISTS,
    INVALID_ADDRESS,
    INVALID_EMAIL,
    CONCURRENT_ACCOUNT_MODIFICATION,
    INTERNAL_FAILURE,
    GOVCLOUD_ACCOUNT_ALREADY_EXISTS,
    MISSING_BUSINESS_VALIDATION,
    FAILED_BUSINESS_VALIDATION,
    PENDING_BUSINESS_VALIDATION,
    INVALID_IDENTITY_FOR_BUSINESS_VALIDATION,
    UNKNOWN_BUSINESS_VALIDATION,
    MISSING_PAYMENT_INSTRUMENT
  )
}

type CreateAccountState = "IN_PROGRESS" | "SUCCEEDED" | "FAILED"
object CreateAccountState {
  inline val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  inline val SUCCEEDED: "SUCCEEDED" = "SUCCEEDED"
  inline val FAILED: "FAILED" = "FAILED"

  inline def values: js.Array[CreateAccountState] = js.Array(IN_PROGRESS, SUCCEEDED, FAILED)
}

type EffectivePolicyType = "TAG_POLICY" | "BACKUP_POLICY" | "AISERVICES_OPT_OUT_POLICY"
object EffectivePolicyType {
  inline val TAG_POLICY: "TAG_POLICY" = "TAG_POLICY"
  inline val BACKUP_POLICY: "BACKUP_POLICY" = "BACKUP_POLICY"
  inline val AISERVICES_OPT_OUT_POLICY: "AISERVICES_OPT_OUT_POLICY" = "AISERVICES_OPT_OUT_POLICY"

  inline def values: js.Array[EffectivePolicyType] = js.Array(TAG_POLICY, BACKUP_POLICY, AISERVICES_OPT_OUT_POLICY)
}

type HandshakePartyType = "ACCOUNT" | "ORGANIZATION" | "EMAIL"
object HandshakePartyType {
  inline val ACCOUNT: "ACCOUNT" = "ACCOUNT"
  inline val ORGANIZATION: "ORGANIZATION" = "ORGANIZATION"
  inline val EMAIL: "EMAIL" = "EMAIL"

  inline def values: js.Array[HandshakePartyType] = js.Array(ACCOUNT, ORGANIZATION, EMAIL)
}

type HandshakeResourceType = "ACCOUNT" | "ORGANIZATION" | "ORGANIZATION_FEATURE_SET" | "EMAIL" | "MASTER_EMAIL" | "MASTER_NAME" | "NOTES" | "PARENT_HANDSHAKE"
object HandshakeResourceType {
  inline val ACCOUNT: "ACCOUNT" = "ACCOUNT"
  inline val ORGANIZATION: "ORGANIZATION" = "ORGANIZATION"
  inline val ORGANIZATION_FEATURE_SET: "ORGANIZATION_FEATURE_SET" = "ORGANIZATION_FEATURE_SET"
  inline val EMAIL: "EMAIL" = "EMAIL"
  inline val MASTER_EMAIL: "MASTER_EMAIL" = "MASTER_EMAIL"
  inline val MASTER_NAME: "MASTER_NAME" = "MASTER_NAME"
  inline val NOTES: "NOTES" = "NOTES"
  inline val PARENT_HANDSHAKE: "PARENT_HANDSHAKE" = "PARENT_HANDSHAKE"

  inline def values: js.Array[HandshakeResourceType] = js.Array(ACCOUNT, ORGANIZATION, ORGANIZATION_FEATURE_SET, EMAIL, MASTER_EMAIL, MASTER_NAME, NOTES, PARENT_HANDSHAKE)
}

type HandshakeState = "REQUESTED" | "OPEN" | "CANCELED" | "ACCEPTED" | "DECLINED" | "EXPIRED"
object HandshakeState {
  inline val REQUESTED: "REQUESTED" = "REQUESTED"
  inline val OPEN: "OPEN" = "OPEN"
  inline val CANCELED: "CANCELED" = "CANCELED"
  inline val ACCEPTED: "ACCEPTED" = "ACCEPTED"
  inline val DECLINED: "DECLINED" = "DECLINED"
  inline val EXPIRED: "EXPIRED" = "EXPIRED"

  inline def values: js.Array[HandshakeState] = js.Array(REQUESTED, OPEN, CANCELED, ACCEPTED, DECLINED, EXPIRED)
}

type IAMUserAccessToBilling = "ALLOW" | "DENY"
object IAMUserAccessToBilling {
  inline val ALLOW: "ALLOW" = "ALLOW"
  inline val DENY: "DENY" = "DENY"

  inline def values: js.Array[IAMUserAccessToBilling] = js.Array(ALLOW, DENY)
}

type OrganizationFeatureSet = "ALL" | "CONSOLIDATED_BILLING"
object OrganizationFeatureSet {
  inline val ALL: "ALL" = "ALL"
  inline val CONSOLIDATED_BILLING: "CONSOLIDATED_BILLING" = "CONSOLIDATED_BILLING"

  inline def values: js.Array[OrganizationFeatureSet] = js.Array(ALL, CONSOLIDATED_BILLING)
}

type ParentType = "ROOT" | "ORGANIZATIONAL_UNIT"
object ParentType {
  inline val ROOT: "ROOT" = "ROOT"
  inline val ORGANIZATIONAL_UNIT: "ORGANIZATIONAL_UNIT" = "ORGANIZATIONAL_UNIT"

  inline def values: js.Array[ParentType] = js.Array(ROOT, ORGANIZATIONAL_UNIT)
}

type PolicyType = "SERVICE_CONTROL_POLICY" | "TAG_POLICY" | "BACKUP_POLICY" | "AISERVICES_OPT_OUT_POLICY"
object PolicyType {
  inline val SERVICE_CONTROL_POLICY: "SERVICE_CONTROL_POLICY" = "SERVICE_CONTROL_POLICY"
  inline val TAG_POLICY: "TAG_POLICY" = "TAG_POLICY"
  inline val BACKUP_POLICY: "BACKUP_POLICY" = "BACKUP_POLICY"
  inline val AISERVICES_OPT_OUT_POLICY: "AISERVICES_OPT_OUT_POLICY" = "AISERVICES_OPT_OUT_POLICY"

  inline def values: js.Array[PolicyType] = js.Array(SERVICE_CONTROL_POLICY, TAG_POLICY, BACKUP_POLICY, AISERVICES_OPT_OUT_POLICY)
}

type PolicyTypeStatus = "ENABLED" | "PENDING_ENABLE" | "PENDING_DISABLE"
object PolicyTypeStatus {
  inline val ENABLED: "ENABLED" = "ENABLED"
  inline val PENDING_ENABLE: "PENDING_ENABLE" = "PENDING_ENABLE"
  inline val PENDING_DISABLE: "PENDING_DISABLE" = "PENDING_DISABLE"

  inline def values: js.Array[PolicyTypeStatus] = js.Array(ENABLED, PENDING_ENABLE, PENDING_DISABLE)
}

type TargetType = "ACCOUNT" | "ORGANIZATIONAL_UNIT" | "ROOT"
object TargetType {
  inline val ACCOUNT: "ACCOUNT" = "ACCOUNT"
  inline val ORGANIZATIONAL_UNIT: "ORGANIZATIONAL_UNIT" = "ORGANIZATIONAL_UNIT"
  inline val ROOT: "ROOT" = "ROOT"

  inline def values: js.Array[TargetType] = js.Array(ACCOUNT, ORGANIZATIONAL_UNIT, ROOT)
}