package facade.amazonaws.services.iam

import scalajs._

type AccessAdvisorUsageGranularityType = "SERVICE_LEVEL" | "ACTION_LEVEL"
object AccessAdvisorUsageGranularityType {
  val SERVICE_LEVEL: "SERVICE_LEVEL" = "SERVICE_LEVEL"
  val ACTION_LEVEL: "ACTION_LEVEL" = "ACTION_LEVEL"

  @inline def values = js.Array[AccessAdvisorUsageGranularityType](SERVICE_LEVEL, ACTION_LEVEL)
}

type ContextKeyTypeEnum = "string" | "stringList" | "numeric" | "numericList" | "boolean" | "booleanList" | "ip" | "ipList" | "binary" | "binaryList" | "date" | "dateList"
object ContextKeyTypeEnum {
  val string: "string" = "string"
  val stringList: "stringList" = "stringList"
  val numeric: "numeric" = "numeric"
  val numericList: "numericList" = "numericList"
  val boolean: "boolean" = "boolean"
  val booleanList: "booleanList" = "booleanList"
  val ip: "ip" = "ip"
  val ipList: "ipList" = "ipList"
  val binary: "binary" = "binary"
  val binaryList: "binaryList" = "binaryList"
  val date: "date" = "date"
  val dateList: "dateList" = "dateList"

  @inline def values = js.Array[ContextKeyTypeEnum](string, stringList, numeric, numericList, boolean, booleanList, ip, ipList, binary, binaryList, date, dateList)
}

type DeletionTaskStatusType = "SUCCEEDED" | "IN_PROGRESS" | "FAILED" | "NOT_STARTED"
object DeletionTaskStatusType {
  val SUCCEEDED: "SUCCEEDED" = "SUCCEEDED"
  val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  val FAILED: "FAILED" = "FAILED"
  val NOT_STARTED: "NOT_STARTED" = "NOT_STARTED"

  @inline def values = js.Array[DeletionTaskStatusType](SUCCEEDED, IN_PROGRESS, FAILED, NOT_STARTED)
}

type EntityType = "User" | "Role" | "Group" | "LocalManagedPolicy" | "AWSManagedPolicy"
object EntityType {
  val User: "User" = "User"
  val Role: "Role" = "Role"
  val Group: "Group" = "Group"
  val LocalManagedPolicy: "LocalManagedPolicy" = "LocalManagedPolicy"
  val AWSManagedPolicy: "AWSManagedPolicy" = "AWSManagedPolicy"

  @inline def values = js.Array[EntityType](User, Role, Group, LocalManagedPolicy, AWSManagedPolicy)
}

type PermissionsBoundaryAttachmentType = "PermissionsBoundaryPolicy"
object PermissionsBoundaryAttachmentType {
  val PermissionsBoundaryPolicy: "PermissionsBoundaryPolicy" = "PermissionsBoundaryPolicy"

  @inline def values = js.Array[PermissionsBoundaryAttachmentType](PermissionsBoundaryPolicy)
}

type PolicyEvaluationDecisionType = "allowed" | "explicitDeny" | "implicitDeny"
object PolicyEvaluationDecisionType {
  val allowed: "allowed" = "allowed"
  val explicitDeny: "explicitDeny" = "explicitDeny"
  val implicitDeny: "implicitDeny" = "implicitDeny"

  @inline def values = js.Array[PolicyEvaluationDecisionType](allowed, explicitDeny, implicitDeny)
}

type PolicySourceType = "user" | "group" | "role" | "aws-managed" | "user-managed" | "resource" | "none"
object PolicySourceType {
  val user: "user" = "user"
  val group: "group" = "group"
  val role: "role" = "role"
  val `aws-managed`: "aws-managed" = "aws-managed"
  val `user-managed`: "user-managed" = "user-managed"
  val resource: "resource" = "resource"
  val none: "none" = "none"

  @inline def values = js.Array[PolicySourceType](user, group, role, `aws-managed`, `user-managed`, resource, none)
}

/** The policy usage type that indicates whether the policy is used as a permissions policy or as the permissions boundary for an entity. For more information about permissions boundaries, see [[https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_boundaries.html|Permissions boundaries for IAM identities]] in the <i>IAM User Guide</i>.
  */
type PolicyUsageType = "PermissionsPolicy" | "PermissionsBoundary"
object PolicyUsageType {
  val PermissionsPolicy: "PermissionsPolicy" = "PermissionsPolicy"
  val PermissionsBoundary: "PermissionsBoundary" = "PermissionsBoundary"

  @inline def values = js.Array[PolicyUsageType](PermissionsPolicy, PermissionsBoundary)
}

type ReportFormatType = "text/csv"
object ReportFormatType {
  val `text/csv`: "text/csv" = "text/csv"

  @inline def values = js.Array[ReportFormatType](`text/csv`)
}

type ReportStateType = "STARTED" | "INPROGRESS" | "COMPLETE"
object ReportStateType {
  val STARTED: "STARTED" = "STARTED"
  val INPROGRESS: "INPROGRESS" = "INPROGRESS"
  val COMPLETE: "COMPLETE" = "COMPLETE"

  @inline def values = js.Array[ReportStateType](STARTED, INPROGRESS, COMPLETE)
}

type assignmentStatusType = "Assigned" | "Unassigned" | "Any"
object assignmentStatusType {
  val Assigned: "Assigned" = "Assigned"
  val Unassigned: "Unassigned" = "Unassigned"
  val Any: "Any" = "Any"

  @inline def values = js.Array[assignmentStatusType](Assigned, Unassigned, Any)
}

type encodingType = "SSH" | "PEM"
object encodingType {
  val SSH: "SSH" = "SSH"
  val PEM: "PEM" = "PEM"

  @inline def values = js.Array[encodingType](SSH, PEM)
}

type globalEndpointTokenVersion = "v1Token" | "v2Token"
object globalEndpointTokenVersion {
  val v1Token: "v1Token" = "v1Token"
  val v2Token: "v2Token" = "v2Token"

  @inline def values = js.Array[globalEndpointTokenVersion](v1Token, v2Token)
}

type jobStatusType = "IN_PROGRESS" | "COMPLETED" | "FAILED"
object jobStatusType {
  val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  val COMPLETED: "COMPLETED" = "COMPLETED"
  val FAILED: "FAILED" = "FAILED"

  @inline def values = js.Array[jobStatusType](IN_PROGRESS, COMPLETED, FAILED)
}

type policyOwnerEntityType = "USER" | "ROLE" | "GROUP"
object policyOwnerEntityType {
  val USER: "USER" = "USER"
  val ROLE: "ROLE" = "ROLE"
  val GROUP: "GROUP" = "GROUP"

  @inline def values = js.Array[policyOwnerEntityType](USER, ROLE, GROUP)
}

type policyScopeType = "All" | "AWS" | "Local"
object policyScopeType {
  val All: "All" = "All"
  val AWS: "AWS" = "AWS"
  val Local: "Local" = "Local"

  @inline def values = js.Array[policyScopeType](All, AWS, Local)
}

type policyType = "INLINE" | "MANAGED"
object policyType {
  val INLINE: "INLINE" = "INLINE"
  val MANAGED: "MANAGED" = "MANAGED"

  @inline def values = js.Array[policyType](INLINE, MANAGED)
}

type sortKeyType = "SERVICE_NAMESPACE_ASCENDING" | "SERVICE_NAMESPACE_DESCENDING" | "LAST_AUTHENTICATED_TIME_ASCENDING" | "LAST_AUTHENTICATED_TIME_DESCENDING"
object sortKeyType {
  val SERVICE_NAMESPACE_ASCENDING: "SERVICE_NAMESPACE_ASCENDING" = "SERVICE_NAMESPACE_ASCENDING"
  val SERVICE_NAMESPACE_DESCENDING: "SERVICE_NAMESPACE_DESCENDING" = "SERVICE_NAMESPACE_DESCENDING"
  val LAST_AUTHENTICATED_TIME_ASCENDING: "LAST_AUTHENTICATED_TIME_ASCENDING" = "LAST_AUTHENTICATED_TIME_ASCENDING"
  val LAST_AUTHENTICATED_TIME_DESCENDING: "LAST_AUTHENTICATED_TIME_DESCENDING" = "LAST_AUTHENTICATED_TIME_DESCENDING"

  @inline def values = js.Array[sortKeyType](SERVICE_NAMESPACE_ASCENDING, SERVICE_NAMESPACE_DESCENDING, LAST_AUTHENTICATED_TIME_ASCENDING, LAST_AUTHENTICATED_TIME_DESCENDING)
}

type statusType = "Active" | "Inactive"
object statusType {
  val Active: "Active" = "Active"
  val Inactive: "Inactive" = "Inactive"

  @inline def values = js.Array[statusType](Active, Inactive)
}

type summaryKeyType = "Users" | "UsersQuota" | "Groups" | "GroupsQuota" | "ServerCertificates" | "ServerCertificatesQuota" | "UserPolicySizeQuota" | "GroupPolicySizeQuota" | "GroupsPerUserQuota" | "SigningCertificatesPerUserQuota" | "AccessKeysPerUserQuota" | "MFADevices" | "MFADevicesInUse" | "AccountMFAEnabled" | "AccountAccessKeysPresent" | "AccountSigningCertificatesPresent" | "AttachedPoliciesPerGroupQuota" | "AttachedPoliciesPerRoleQuota" | "AttachedPoliciesPerUserQuota" | "Policies" | "PoliciesQuota" | "PolicySizeQuota" | "PolicyVersionsInUse" | "PolicyVersionsInUseQuota" | "VersionsPerPolicyQuota" | "GlobalEndpointTokenVersion"
object summaryKeyType {
  val Users: "Users" = "Users"
  val UsersQuota: "UsersQuota" = "UsersQuota"
  val Groups: "Groups" = "Groups"
  val GroupsQuota: "GroupsQuota" = "GroupsQuota"
  val ServerCertificates: "ServerCertificates" = "ServerCertificates"
  val ServerCertificatesQuota: "ServerCertificatesQuota" = "ServerCertificatesQuota"
  val UserPolicySizeQuota: "UserPolicySizeQuota" = "UserPolicySizeQuota"
  val GroupPolicySizeQuota: "GroupPolicySizeQuota" = "GroupPolicySizeQuota"
  val GroupsPerUserQuota: "GroupsPerUserQuota" = "GroupsPerUserQuota"
  val SigningCertificatesPerUserQuota: "SigningCertificatesPerUserQuota" = "SigningCertificatesPerUserQuota"
  val AccessKeysPerUserQuota: "AccessKeysPerUserQuota" = "AccessKeysPerUserQuota"
  val MFADevices: "MFADevices" = "MFADevices"
  val MFADevicesInUse: "MFADevicesInUse" = "MFADevicesInUse"
  val AccountMFAEnabled: "AccountMFAEnabled" = "AccountMFAEnabled"
  val AccountAccessKeysPresent: "AccountAccessKeysPresent" = "AccountAccessKeysPresent"
  val AccountSigningCertificatesPresent: "AccountSigningCertificatesPresent" = "AccountSigningCertificatesPresent"
  val AttachedPoliciesPerGroupQuota: "AttachedPoliciesPerGroupQuota" = "AttachedPoliciesPerGroupQuota"
  val AttachedPoliciesPerRoleQuota: "AttachedPoliciesPerRoleQuota" = "AttachedPoliciesPerRoleQuota"
  val AttachedPoliciesPerUserQuota: "AttachedPoliciesPerUserQuota" = "AttachedPoliciesPerUserQuota"
  val Policies: "Policies" = "Policies"
  val PoliciesQuota: "PoliciesQuota" = "PoliciesQuota"
  val PolicySizeQuota: "PolicySizeQuota" = "PolicySizeQuota"
  val PolicyVersionsInUse: "PolicyVersionsInUse" = "PolicyVersionsInUse"
  val PolicyVersionsInUseQuota: "PolicyVersionsInUseQuota" = "PolicyVersionsInUseQuota"
  val VersionsPerPolicyQuota: "VersionsPerPolicyQuota" = "VersionsPerPolicyQuota"
  val GlobalEndpointTokenVersion: "GlobalEndpointTokenVersion" = "GlobalEndpointTokenVersion"

  @inline def values = js.Array[summaryKeyType](
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
