package facade.amazonaws.services.iam

import scalajs._
import scala.scalajs.js.|

@js.native
sealed trait AccessAdvisorUsageGranularityType extends js.Any
object AccessAdvisorUsageGranularityType {
  val SERVICE_LEVEL = "SERVICE_LEVEL".asInstanceOf[AccessAdvisorUsageGranularityType]
  val ACTION_LEVEL = "ACTION_LEVEL".asInstanceOf[AccessAdvisorUsageGranularityType]

  @inline def values = js.Array(SERVICE_LEVEL, ACTION_LEVEL)
}

@js.native
sealed trait ContextKeyTypeEnum extends js.Any
object ContextKeyTypeEnum {
  val string = "string".asInstanceOf[ContextKeyTypeEnum]
  val stringList = "stringList".asInstanceOf[ContextKeyTypeEnum]
  val numeric = "numeric".asInstanceOf[ContextKeyTypeEnum]
  val numericList = "numericList".asInstanceOf[ContextKeyTypeEnum]
  val boolean = "boolean".asInstanceOf[ContextKeyTypeEnum]
  val booleanList = "booleanList".asInstanceOf[ContextKeyTypeEnum]
  val ip = "ip".asInstanceOf[ContextKeyTypeEnum]
  val ipList = "ipList".asInstanceOf[ContextKeyTypeEnum]
  val binary = "binary".asInstanceOf[ContextKeyTypeEnum]
  val binaryList = "binaryList".asInstanceOf[ContextKeyTypeEnum]
  val date = "date".asInstanceOf[ContextKeyTypeEnum]
  val dateList = "dateList".asInstanceOf[ContextKeyTypeEnum]

  @inline def values = js.Array(string, stringList, numeric, numericList, boolean, booleanList, ip, ipList, binary, binaryList, date, dateList)
}

@js.native
sealed trait DeletionTaskStatusType extends js.Any
object DeletionTaskStatusType {
  val SUCCEEDED = "SUCCEEDED".asInstanceOf[DeletionTaskStatusType]
  val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[DeletionTaskStatusType]
  val FAILED = "FAILED".asInstanceOf[DeletionTaskStatusType]
  val NOT_STARTED = "NOT_STARTED".asInstanceOf[DeletionTaskStatusType]

  @inline def values = js.Array(SUCCEEDED, IN_PROGRESS, FAILED, NOT_STARTED)
}

@js.native
sealed trait EntityType extends js.Any
object EntityType {
  val User = "User".asInstanceOf[EntityType]
  val Role = "Role".asInstanceOf[EntityType]
  val Group = "Group".asInstanceOf[EntityType]
  val LocalManagedPolicy = "LocalManagedPolicy".asInstanceOf[EntityType]
  val AWSManagedPolicy = "AWSManagedPolicy".asInstanceOf[EntityType]

  @inline def values = js.Array(User, Role, Group, LocalManagedPolicy, AWSManagedPolicy)
}

@js.native
sealed trait PermissionsBoundaryAttachmentType extends js.Any
object PermissionsBoundaryAttachmentType {
  val PermissionsBoundaryPolicy = "PermissionsBoundaryPolicy".asInstanceOf[PermissionsBoundaryAttachmentType]

  @inline def values = js.Array(PermissionsBoundaryPolicy)
}

@js.native
sealed trait PolicyEvaluationDecisionType extends js.Any
object PolicyEvaluationDecisionType {
  val allowed = "allowed".asInstanceOf[PolicyEvaluationDecisionType]
  val explicitDeny = "explicitDeny".asInstanceOf[PolicyEvaluationDecisionType]
  val implicitDeny = "implicitDeny".asInstanceOf[PolicyEvaluationDecisionType]

  @inline def values = js.Array(allowed, explicitDeny, implicitDeny)
}

@js.native
sealed trait PolicySourceType extends js.Any
object PolicySourceType {
  val user = "user".asInstanceOf[PolicySourceType]
  val group = "group".asInstanceOf[PolicySourceType]
  val role = "role".asInstanceOf[PolicySourceType]
  val `aws-managed` = "aws-managed".asInstanceOf[PolicySourceType]
  val `user-managed` = "user-managed".asInstanceOf[PolicySourceType]
  val resource = "resource".asInstanceOf[PolicySourceType]
  val none = "none".asInstanceOf[PolicySourceType]

  @inline def values = js.Array(user, group, role, `aws-managed`, `user-managed`, resource, none)
}

/** The policy usage type that indicates whether the policy is used as a permissions policy or as the permissions boundary for an entity. For more information about permissions boundaries, see [[https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_boundaries.html|Permissions boundaries for IAM identities]] in the <i>IAM User Guide</i>.
  */
@js.native
sealed trait PolicyUsageType extends js.Any
object PolicyUsageType {
  val PermissionsPolicy = "PermissionsPolicy".asInstanceOf[PolicyUsageType]
  val PermissionsBoundary = "PermissionsBoundary".asInstanceOf[PolicyUsageType]

  @inline def values = js.Array(PermissionsPolicy, PermissionsBoundary)
}

@js.native
sealed trait ReportFormatType extends js.Any
object ReportFormatType {
  val `text/csv` = "text/csv".asInstanceOf[ReportFormatType]

  @inline def values = js.Array(`text/csv`)
}

@js.native
sealed trait ReportStateType extends js.Any
object ReportStateType {
  val STARTED = "STARTED".asInstanceOf[ReportStateType]
  val INPROGRESS = "INPROGRESS".asInstanceOf[ReportStateType]
  val COMPLETE = "COMPLETE".asInstanceOf[ReportStateType]

  @inline def values = js.Array(STARTED, INPROGRESS, COMPLETE)
}

@js.native
sealed trait assignmentStatusType extends js.Any
object assignmentStatusType {
  val Assigned = "Assigned".asInstanceOf[assignmentStatusType]
  val Unassigned = "Unassigned".asInstanceOf[assignmentStatusType]
  val Any = "Any".asInstanceOf[assignmentStatusType]

  @inline def values = js.Array(Assigned, Unassigned, Any)
}

@js.native
sealed trait encodingType extends js.Any
object encodingType {
  val SSH = "SSH".asInstanceOf[encodingType]
  val PEM = "PEM".asInstanceOf[encodingType]

  @inline def values = js.Array(SSH, PEM)
}

@js.native
sealed trait globalEndpointTokenVersion extends js.Any
object globalEndpointTokenVersion {
  val v1Token = "v1Token".asInstanceOf[globalEndpointTokenVersion]
  val v2Token = "v2Token".asInstanceOf[globalEndpointTokenVersion]

  @inline def values = js.Array(v1Token, v2Token)
}

@js.native
sealed trait jobStatusType extends js.Any
object jobStatusType {
  val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[jobStatusType]
  val COMPLETED = "COMPLETED".asInstanceOf[jobStatusType]
  val FAILED = "FAILED".asInstanceOf[jobStatusType]

  @inline def values = js.Array(IN_PROGRESS, COMPLETED, FAILED)
}

@js.native
sealed trait policyOwnerEntityType extends js.Any
object policyOwnerEntityType {
  val USER = "USER".asInstanceOf[policyOwnerEntityType]
  val ROLE = "ROLE".asInstanceOf[policyOwnerEntityType]
  val GROUP = "GROUP".asInstanceOf[policyOwnerEntityType]

  @inline def values = js.Array(USER, ROLE, GROUP)
}

@js.native
sealed trait policyScopeType extends js.Any
object policyScopeType {
  val All = "All".asInstanceOf[policyScopeType]
  val AWS = "AWS".asInstanceOf[policyScopeType]
  val Local = "Local".asInstanceOf[policyScopeType]

  @inline def values = js.Array(All, AWS, Local)
}

@js.native
sealed trait policyType extends js.Any
object policyType {
  val INLINE = "INLINE".asInstanceOf[policyType]
  val MANAGED = "MANAGED".asInstanceOf[policyType]

  @inline def values = js.Array(INLINE, MANAGED)
}

@js.native
sealed trait sortKeyType extends js.Any
object sortKeyType {
  val SERVICE_NAMESPACE_ASCENDING = "SERVICE_NAMESPACE_ASCENDING".asInstanceOf[sortKeyType]
  val SERVICE_NAMESPACE_DESCENDING = "SERVICE_NAMESPACE_DESCENDING".asInstanceOf[sortKeyType]
  val LAST_AUTHENTICATED_TIME_ASCENDING = "LAST_AUTHENTICATED_TIME_ASCENDING".asInstanceOf[sortKeyType]
  val LAST_AUTHENTICATED_TIME_DESCENDING = "LAST_AUTHENTICATED_TIME_DESCENDING".asInstanceOf[sortKeyType]

  @inline def values = js.Array(SERVICE_NAMESPACE_ASCENDING, SERVICE_NAMESPACE_DESCENDING, LAST_AUTHENTICATED_TIME_ASCENDING, LAST_AUTHENTICATED_TIME_DESCENDING)
}

@js.native
sealed trait statusType extends js.Any
object statusType {
  val Active = "Active".asInstanceOf[statusType]
  val Inactive = "Inactive".asInstanceOf[statusType]

  @inline def values = js.Array(Active, Inactive)
}

@js.native
sealed trait summaryKeyType extends js.Any
object summaryKeyType {
  val Users = "Users".asInstanceOf[summaryKeyType]
  val UsersQuota = "UsersQuota".asInstanceOf[summaryKeyType]
  val Groups = "Groups".asInstanceOf[summaryKeyType]
  val GroupsQuota = "GroupsQuota".asInstanceOf[summaryKeyType]
  val ServerCertificates = "ServerCertificates".asInstanceOf[summaryKeyType]
  val ServerCertificatesQuota = "ServerCertificatesQuota".asInstanceOf[summaryKeyType]
  val UserPolicySizeQuota = "UserPolicySizeQuota".asInstanceOf[summaryKeyType]
  val GroupPolicySizeQuota = "GroupPolicySizeQuota".asInstanceOf[summaryKeyType]
  val GroupsPerUserQuota = "GroupsPerUserQuota".asInstanceOf[summaryKeyType]
  val SigningCertificatesPerUserQuota = "SigningCertificatesPerUserQuota".asInstanceOf[summaryKeyType]
  val AccessKeysPerUserQuota = "AccessKeysPerUserQuota".asInstanceOf[summaryKeyType]
  val MFADevices = "MFADevices".asInstanceOf[summaryKeyType]
  val MFADevicesInUse = "MFADevicesInUse".asInstanceOf[summaryKeyType]
  val AccountMFAEnabled = "AccountMFAEnabled".asInstanceOf[summaryKeyType]
  val AccountAccessKeysPresent = "AccountAccessKeysPresent".asInstanceOf[summaryKeyType]
  val AccountSigningCertificatesPresent = "AccountSigningCertificatesPresent".asInstanceOf[summaryKeyType]
  val AttachedPoliciesPerGroupQuota = "AttachedPoliciesPerGroupQuota".asInstanceOf[summaryKeyType]
  val AttachedPoliciesPerRoleQuota = "AttachedPoliciesPerRoleQuota".asInstanceOf[summaryKeyType]
  val AttachedPoliciesPerUserQuota = "AttachedPoliciesPerUserQuota".asInstanceOf[summaryKeyType]
  val Policies = "Policies".asInstanceOf[summaryKeyType]
  val PoliciesQuota = "PoliciesQuota".asInstanceOf[summaryKeyType]
  val PolicySizeQuota = "PolicySizeQuota".asInstanceOf[summaryKeyType]
  val PolicyVersionsInUse = "PolicyVersionsInUse".asInstanceOf[summaryKeyType]
  val PolicyVersionsInUseQuota = "PolicyVersionsInUseQuota".asInstanceOf[summaryKeyType]
  val VersionsPerPolicyQuota = "VersionsPerPolicyQuota".asInstanceOf[summaryKeyType]
  val GlobalEndpointTokenVersion = "GlobalEndpointTokenVersion".asInstanceOf[summaryKeyType]

  @inline def values = js.Array(
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
