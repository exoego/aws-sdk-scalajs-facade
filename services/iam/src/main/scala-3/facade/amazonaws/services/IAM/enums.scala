package facade.amazonaws.services.iam

import scalajs._

type AccessAdvisorUsageGranularityType = "SERVICE_LEVEL" | "ACTION_LEVEL"
object AccessAdvisorUsageGranularityType {
  inline val SERVICE_LEVEL: "SERVICE_LEVEL" = "SERVICE_LEVEL"
  inline val ACTION_LEVEL: "ACTION_LEVEL" = "ACTION_LEVEL"

  inline def values: js.Array[AccessAdvisorUsageGranularityType] = js.Array(SERVICE_LEVEL, ACTION_LEVEL)
}

type ContextKeyTypeEnum = "string" | "stringList" | "numeric" | "numericList" | "boolean" | "booleanList" | "ip" | "ipList" | "binary" | "binaryList" | "date" | "dateList"
object ContextKeyTypeEnum {
  inline val string: "string" = "string"
  inline val stringList: "stringList" = "stringList"
  inline val numeric: "numeric" = "numeric"
  inline val numericList: "numericList" = "numericList"
  inline val boolean: "boolean" = "boolean"
  inline val booleanList: "booleanList" = "booleanList"
  inline val ip: "ip" = "ip"
  inline val ipList: "ipList" = "ipList"
  inline val binary: "binary" = "binary"
  inline val binaryList: "binaryList" = "binaryList"
  inline val date: "date" = "date"
  inline val dateList: "dateList" = "dateList"

  inline def values: js.Array[ContextKeyTypeEnum] = js.Array(string, stringList, numeric, numericList, boolean, booleanList, ip, ipList, binary, binaryList, date, dateList)
}

type DeletionTaskStatusType = "SUCCEEDED" | "IN_PROGRESS" | "FAILED" | "NOT_STARTED"
object DeletionTaskStatusType {
  inline val SUCCEEDED: "SUCCEEDED" = "SUCCEEDED"
  inline val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  inline val FAILED: "FAILED" = "FAILED"
  inline val NOT_STARTED: "NOT_STARTED" = "NOT_STARTED"

  inline def values: js.Array[DeletionTaskStatusType] = js.Array(SUCCEEDED, IN_PROGRESS, FAILED, NOT_STARTED)
}

type EntityType = "User" | "Role" | "Group" | "LocalManagedPolicy" | "AWSManagedPolicy"
object EntityType {
  inline val User: "User" = "User"
  inline val Role: "Role" = "Role"
  inline val Group: "Group" = "Group"
  inline val LocalManagedPolicy: "LocalManagedPolicy" = "LocalManagedPolicy"
  inline val AWSManagedPolicy: "AWSManagedPolicy" = "AWSManagedPolicy"

  inline def values: js.Array[EntityType] = js.Array(User, Role, Group, LocalManagedPolicy, AWSManagedPolicy)
}

type PermissionsBoundaryAttachmentType = "PermissionsBoundaryPolicy"
object PermissionsBoundaryAttachmentType {
  inline val PermissionsBoundaryPolicy: "PermissionsBoundaryPolicy" = "PermissionsBoundaryPolicy"

  inline def values: js.Array[PermissionsBoundaryAttachmentType] = js.Array(PermissionsBoundaryPolicy)
}

type PolicyEvaluationDecisionType = "allowed" | "explicitDeny" | "implicitDeny"
object PolicyEvaluationDecisionType {
  inline val allowed: "allowed" = "allowed"
  inline val explicitDeny: "explicitDeny" = "explicitDeny"
  inline val implicitDeny: "implicitDeny" = "implicitDeny"

  inline def values: js.Array[PolicyEvaluationDecisionType] = js.Array(allowed, explicitDeny, implicitDeny)
}

type PolicySourceType = "user" | "group" | "role" | "aws-managed" | "user-managed" | "resource" | "none"
object PolicySourceType {
  inline val user: "user" = "user"
  inline val group: "group" = "group"
  inline val role: "role" = "role"
  inline val `aws-managed`: "aws-managed" = "aws-managed"
  inline val `user-managed`: "user-managed" = "user-managed"
  inline val resource: "resource" = "resource"
  inline val none: "none" = "none"

  inline def values: js.Array[PolicySourceType] = js.Array(user, group, role, `aws-managed`, `user-managed`, resource, none)
}

/** The policy usage type that indicates whether the policy is used as a permissions policy or as the permissions boundary for an entity. For more information about permissions boundaries, see [[https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_boundaries.html|Permissions boundaries for IAM identities]] in the <i>IAM User Guide</i>.
  */
type PolicyUsageType = "PermissionsPolicy" | "PermissionsBoundary"
object PolicyUsageType {
  inline val PermissionsPolicy: "PermissionsPolicy" = "PermissionsPolicy"
  inline val PermissionsBoundary: "PermissionsBoundary" = "PermissionsBoundary"

  inline def values: js.Array[PolicyUsageType] = js.Array(PermissionsPolicy, PermissionsBoundary)
}

type ReportFormatType = "text/csv"
object ReportFormatType {
  inline val `text/csv`: "text/csv" = "text/csv"

  inline def values: js.Array[ReportFormatType] = js.Array(`text/csv`)
}

type ReportStateType = "STARTED" | "INPROGRESS" | "COMPLETE"
object ReportStateType {
  inline val STARTED: "STARTED" = "STARTED"
  inline val INPROGRESS: "INPROGRESS" = "INPROGRESS"
  inline val COMPLETE: "COMPLETE" = "COMPLETE"

  inline def values: js.Array[ReportStateType] = js.Array(STARTED, INPROGRESS, COMPLETE)
}

type assignmentStatusType = "Assigned" | "Unassigned" | "Any"
object assignmentStatusType {
  inline val Assigned: "Assigned" = "Assigned"
  inline val Unassigned: "Unassigned" = "Unassigned"
  inline val Any: "Any" = "Any"

  inline def values: js.Array[assignmentStatusType] = js.Array(Assigned, Unassigned, Any)
}

type encodingType = "SSH" | "PEM"
object encodingType {
  inline val SSH: "SSH" = "SSH"
  inline val PEM: "PEM" = "PEM"

  inline def values: js.Array[encodingType] = js.Array(SSH, PEM)
}

type globalEndpointTokenVersion = "v1Token" | "v2Token"
object globalEndpointTokenVersion {
  inline val v1Token: "v1Token" = "v1Token"
  inline val v2Token: "v2Token" = "v2Token"

  inline def values: js.Array[globalEndpointTokenVersion] = js.Array(v1Token, v2Token)
}

type jobStatusType = "IN_PROGRESS" | "COMPLETED" | "FAILED"
object jobStatusType {
  inline val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  inline val COMPLETED: "COMPLETED" = "COMPLETED"
  inline val FAILED: "FAILED" = "FAILED"

  inline def values: js.Array[jobStatusType] = js.Array(IN_PROGRESS, COMPLETED, FAILED)
}

type policyOwnerEntityType = "USER" | "ROLE" | "GROUP"
object policyOwnerEntityType {
  inline val USER: "USER" = "USER"
  inline val ROLE: "ROLE" = "ROLE"
  inline val GROUP: "GROUP" = "GROUP"

  inline def values: js.Array[policyOwnerEntityType] = js.Array(USER, ROLE, GROUP)
}

type policyScopeType = "All" | "AWS" | "Local"
object policyScopeType {
  inline val All: "All" = "All"
  inline val AWS: "AWS" = "AWS"
  inline val Local: "Local" = "Local"

  inline def values: js.Array[policyScopeType] = js.Array(All, AWS, Local)
}

type policyType = "INLINE" | "MANAGED"
object policyType {
  inline val INLINE: "INLINE" = "INLINE"
  inline val MANAGED: "MANAGED" = "MANAGED"

  inline def values: js.Array[policyType] = js.Array(INLINE, MANAGED)
}

type sortKeyType = "SERVICE_NAMESPACE_ASCENDING" | "SERVICE_NAMESPACE_DESCENDING" | "LAST_AUTHENTICATED_TIME_ASCENDING" | "LAST_AUTHENTICATED_TIME_DESCENDING"
object sortKeyType {
  inline val SERVICE_NAMESPACE_ASCENDING: "SERVICE_NAMESPACE_ASCENDING" = "SERVICE_NAMESPACE_ASCENDING"
  inline val SERVICE_NAMESPACE_DESCENDING: "SERVICE_NAMESPACE_DESCENDING" = "SERVICE_NAMESPACE_DESCENDING"
  inline val LAST_AUTHENTICATED_TIME_ASCENDING: "LAST_AUTHENTICATED_TIME_ASCENDING" = "LAST_AUTHENTICATED_TIME_ASCENDING"
  inline val LAST_AUTHENTICATED_TIME_DESCENDING: "LAST_AUTHENTICATED_TIME_DESCENDING" = "LAST_AUTHENTICATED_TIME_DESCENDING"

  inline def values: js.Array[sortKeyType] = js.Array(SERVICE_NAMESPACE_ASCENDING, SERVICE_NAMESPACE_DESCENDING, LAST_AUTHENTICATED_TIME_ASCENDING, LAST_AUTHENTICATED_TIME_DESCENDING)
}

type statusType = "Active" | "Inactive"
object statusType {
  inline val Active: "Active" = "Active"
  inline val Inactive: "Inactive" = "Inactive"

  inline def values: js.Array[statusType] = js.Array(Active, Inactive)
}

type summaryKeyType = "Users" | "UsersQuota" | "Groups" | "GroupsQuota" | "ServerCertificates" | "ServerCertificatesQuota" | "UserPolicySizeQuota" | "GroupPolicySizeQuota" | "GroupsPerUserQuota" | "SigningCertificatesPerUserQuota" | "AccessKeysPerUserQuota" | "MFADevices" | "MFADevicesInUse" | "AccountMFAEnabled" | "AccountAccessKeysPresent" | "AccountSigningCertificatesPresent" | "AttachedPoliciesPerGroupQuota" | "AttachedPoliciesPerRoleQuota" | "AttachedPoliciesPerUserQuota" | "Policies" | "PoliciesQuota" | "PolicySizeQuota" | "PolicyVersionsInUse" | "PolicyVersionsInUseQuota" | "VersionsPerPolicyQuota" | "GlobalEndpointTokenVersion"
object summaryKeyType {
  inline val Users: "Users" = "Users"
  inline val UsersQuota: "UsersQuota" = "UsersQuota"
  inline val Groups: "Groups" = "Groups"
  inline val GroupsQuota: "GroupsQuota" = "GroupsQuota"
  inline val ServerCertificates: "ServerCertificates" = "ServerCertificates"
  inline val ServerCertificatesQuota: "ServerCertificatesQuota" = "ServerCertificatesQuota"
  inline val UserPolicySizeQuota: "UserPolicySizeQuota" = "UserPolicySizeQuota"
  inline val GroupPolicySizeQuota: "GroupPolicySizeQuota" = "GroupPolicySizeQuota"
  inline val GroupsPerUserQuota: "GroupsPerUserQuota" = "GroupsPerUserQuota"
  inline val SigningCertificatesPerUserQuota: "SigningCertificatesPerUserQuota" = "SigningCertificatesPerUserQuota"
  inline val AccessKeysPerUserQuota: "AccessKeysPerUserQuota" = "AccessKeysPerUserQuota"
  inline val MFADevices: "MFADevices" = "MFADevices"
  inline val MFADevicesInUse: "MFADevicesInUse" = "MFADevicesInUse"
  inline val AccountMFAEnabled: "AccountMFAEnabled" = "AccountMFAEnabled"
  inline val AccountAccessKeysPresent: "AccountAccessKeysPresent" = "AccountAccessKeysPresent"
  inline val AccountSigningCertificatesPresent: "AccountSigningCertificatesPresent" = "AccountSigningCertificatesPresent"
  inline val AttachedPoliciesPerGroupQuota: "AttachedPoliciesPerGroupQuota" = "AttachedPoliciesPerGroupQuota"
  inline val AttachedPoliciesPerRoleQuota: "AttachedPoliciesPerRoleQuota" = "AttachedPoliciesPerRoleQuota"
  inline val AttachedPoliciesPerUserQuota: "AttachedPoliciesPerUserQuota" = "AttachedPoliciesPerUserQuota"
  inline val Policies: "Policies" = "Policies"
  inline val PoliciesQuota: "PoliciesQuota" = "PoliciesQuota"
  inline val PolicySizeQuota: "PolicySizeQuota" = "PolicySizeQuota"
  inline val PolicyVersionsInUse: "PolicyVersionsInUse" = "PolicyVersionsInUse"
  inline val PolicyVersionsInUseQuota: "PolicyVersionsInUseQuota" = "PolicyVersionsInUseQuota"
  inline val VersionsPerPolicyQuota: "VersionsPerPolicyQuota" = "VersionsPerPolicyQuota"
  inline val GlobalEndpointTokenVersion: "GlobalEndpointTokenVersion" = "GlobalEndpointTokenVersion"

  inline def values: js.Array[summaryKeyType] = js.Array(
    Users,
    UsersQuota,
    Groups,
    GroupsQuota,
    ServerCertificates,
    ServerCertificatesQuota,
    UserPolicySizeQuota,
    GroupPolicySizeQuota,
    GroupsPerUserQuota,
    SigningCertificatesPerUserQuota,
    AccessKeysPerUserQuota,
    MFADevices,
    MFADevicesInUse,
    AccountMFAEnabled,
    AccountAccessKeysPresent,
    AccountSigningCertificatesPresent,
    AttachedPoliciesPerGroupQuota,
    AttachedPoliciesPerRoleQuota,
    AttachedPoliciesPerUserQuota,
    Policies,
    PoliciesQuota,
    PolicySizeQuota,
    PolicyVersionsInUse,
    PolicyVersionsInUseQuota,
    VersionsPerPolicyQuota,
    GlobalEndpointTokenVersion
  )
}
