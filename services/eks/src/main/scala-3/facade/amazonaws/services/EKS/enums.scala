package facade.amazonaws.services.eks

import scalajs._

type AMITypes = "AL2_x86_64" | "AL2_x86_64_GPU" | "AL2_ARM_64"
object AMITypes {
  inline val AL2_x86_64: "AL2_x86_64" = "AL2_x86_64"
  inline val AL2_x86_64_GPU: "AL2_x86_64_GPU" = "AL2_x86_64_GPU"
  inline val AL2_ARM_64: "AL2_ARM_64" = "AL2_ARM_64"

  inline def values: js.Array[AMITypes] = js.Array(AL2_x86_64, AL2_x86_64_GPU, AL2_ARM_64)
}

type AddonIssueCode = "AccessDenied" | "InternalFailure" | "ClusterUnreachable" | "InsufficientNumberOfReplicas" | "ConfigurationConflict" | "AdmissionRequestDenied"
object AddonIssueCode {
  inline val AccessDenied: "AccessDenied" = "AccessDenied"
  inline val InternalFailure: "InternalFailure" = "InternalFailure"
  inline val ClusterUnreachable: "ClusterUnreachable" = "ClusterUnreachable"
  inline val InsufficientNumberOfReplicas: "InsufficientNumberOfReplicas" = "InsufficientNumberOfReplicas"
  inline val ConfigurationConflict: "ConfigurationConflict" = "ConfigurationConflict"
  inline val AdmissionRequestDenied: "AdmissionRequestDenied" = "AdmissionRequestDenied"

  inline def values: js.Array[AddonIssueCode] = js.Array(AccessDenied, InternalFailure, ClusterUnreachable, InsufficientNumberOfReplicas, ConfigurationConflict, AdmissionRequestDenied)
}

type AddonStatus = "CREATING" | "ACTIVE" | "CREATE_FAILED" | "UPDATING" | "DELETING" | "DELETE_FAILED" | "DEGRADED"
object AddonStatus {
  inline val CREATING: "CREATING" = "CREATING"
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val CREATE_FAILED: "CREATE_FAILED" = "CREATE_FAILED"
  inline val UPDATING: "UPDATING" = "UPDATING"
  inline val DELETING: "DELETING" = "DELETING"
  inline val DELETE_FAILED: "DELETE_FAILED" = "DELETE_FAILED"
  inline val DEGRADED: "DEGRADED" = "DEGRADED"

  inline def values: js.Array[AddonStatus] = js.Array(CREATING, ACTIVE, CREATE_FAILED, UPDATING, DELETING, DELETE_FAILED, DEGRADED)
}

type CapacityTypes = "ON_DEMAND" | "SPOT"
object CapacityTypes {
  inline val ON_DEMAND: "ON_DEMAND" = "ON_DEMAND"
  inline val SPOT: "SPOT" = "SPOT"

  inline def values: js.Array[CapacityTypes] = js.Array(ON_DEMAND, SPOT)
}

type ClusterStatus = "CREATING" | "ACTIVE" | "DELETING" | "FAILED" | "UPDATING"
object ClusterStatus {
  inline val CREATING: "CREATING" = "CREATING"
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val DELETING: "DELETING" = "DELETING"
  inline val FAILED: "FAILED" = "FAILED"
  inline val UPDATING: "UPDATING" = "UPDATING"

  inline def values: js.Array[ClusterStatus] = js.Array(CREATING, ACTIVE, DELETING, FAILED, UPDATING)
}

type ErrorCode = "SubnetNotFound" | "SecurityGroupNotFound" | "EniLimitReached" | "IpNotAvailable" | "AccessDenied" | "OperationNotPermitted" | "VpcIdNotFound" | "Unknown" | "NodeCreationFailure" | "PodEvictionFailure" | "InsufficientFreeAddresses" | "ClusterUnreachable" | "InsufficientNumberOfReplicas" | "ConfigurationConflict" | "AdmissionRequestDenied"
object ErrorCode {
  inline val SubnetNotFound: "SubnetNotFound" = "SubnetNotFound"
  inline val SecurityGroupNotFound: "SecurityGroupNotFound" = "SecurityGroupNotFound"
  inline val EniLimitReached: "EniLimitReached" = "EniLimitReached"
  inline val IpNotAvailable: "IpNotAvailable" = "IpNotAvailable"
  inline val AccessDenied: "AccessDenied" = "AccessDenied"
  inline val OperationNotPermitted: "OperationNotPermitted" = "OperationNotPermitted"
  inline val VpcIdNotFound: "VpcIdNotFound" = "VpcIdNotFound"
  inline val Unknown: "Unknown" = "Unknown"
  inline val NodeCreationFailure: "NodeCreationFailure" = "NodeCreationFailure"
  inline val PodEvictionFailure: "PodEvictionFailure" = "PodEvictionFailure"
  inline val InsufficientFreeAddresses: "InsufficientFreeAddresses" = "InsufficientFreeAddresses"
  inline val ClusterUnreachable: "ClusterUnreachable" = "ClusterUnreachable"
  inline val InsufficientNumberOfReplicas: "InsufficientNumberOfReplicas" = "InsufficientNumberOfReplicas"
  inline val ConfigurationConflict: "ConfigurationConflict" = "ConfigurationConflict"
  inline val AdmissionRequestDenied: "AdmissionRequestDenied" = "AdmissionRequestDenied"

  inline def values: js.Array[ErrorCode] = js.Array(
    SubnetNotFound,
    SecurityGroupNotFound,
    EniLimitReached,
    IpNotAvailable,
    AccessDenied,
    OperationNotPermitted,
    VpcIdNotFound,
    Unknown,
    NodeCreationFailure,
    PodEvictionFailure,
    InsufficientFreeAddresses,
    ClusterUnreachable,
    InsufficientNumberOfReplicas,
    ConfigurationConflict,
    AdmissionRequestDenied
  )
}

type FargateProfileStatus = "CREATING" | "ACTIVE" | "DELETING" | "CREATE_FAILED" | "DELETE_FAILED"
object FargateProfileStatus {
  inline val CREATING: "CREATING" = "CREATING"
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val DELETING: "DELETING" = "DELETING"
  inline val CREATE_FAILED: "CREATE_FAILED" = "CREATE_FAILED"
  inline val DELETE_FAILED: "DELETE_FAILED" = "DELETE_FAILED"

  inline def values: js.Array[FargateProfileStatus] = js.Array(CREATING, ACTIVE, DELETING, CREATE_FAILED, DELETE_FAILED)
}

type LogType = "api" | "audit" | "authenticator" | "controllerManager" | "scheduler"
object LogType {
  inline val api: "api" = "api"
  inline val audit: "audit" = "audit"
  inline val authenticator: "authenticator" = "authenticator"
  inline val controllerManager: "controllerManager" = "controllerManager"
  inline val scheduler: "scheduler" = "scheduler"

  inline def values: js.Array[LogType] = js.Array(api, audit, authenticator, controllerManager, scheduler)
}

type NodegroupIssueCode = "AutoScalingGroupNotFound" | "AutoScalingGroupInvalidConfiguration" | "Ec2SecurityGroupNotFound" | "Ec2SecurityGroupDeletionFailure" | "Ec2LaunchTemplateNotFound" | "Ec2LaunchTemplateVersionMismatch" | "Ec2SubnetNotFound" | "Ec2SubnetInvalidConfiguration" | "IamInstanceProfileNotFound" | "IamLimitExceeded" | "IamNodeRoleNotFound" | "NodeCreationFailure" | "AsgInstanceLaunchFailures" | "InstanceLimitExceeded" | "InsufficientFreeAddresses" | "AccessDenied" | "InternalFailure" | "ClusterUnreachable"
object NodegroupIssueCode {
  inline val AutoScalingGroupNotFound: "AutoScalingGroupNotFound" = "AutoScalingGroupNotFound"
  inline val AutoScalingGroupInvalidConfiguration: "AutoScalingGroupInvalidConfiguration" = "AutoScalingGroupInvalidConfiguration"
  inline val Ec2SecurityGroupNotFound: "Ec2SecurityGroupNotFound" = "Ec2SecurityGroupNotFound"
  inline val Ec2SecurityGroupDeletionFailure: "Ec2SecurityGroupDeletionFailure" = "Ec2SecurityGroupDeletionFailure"
  inline val Ec2LaunchTemplateNotFound: "Ec2LaunchTemplateNotFound" = "Ec2LaunchTemplateNotFound"
  inline val Ec2LaunchTemplateVersionMismatch: "Ec2LaunchTemplateVersionMismatch" = "Ec2LaunchTemplateVersionMismatch"
  inline val Ec2SubnetNotFound: "Ec2SubnetNotFound" = "Ec2SubnetNotFound"
  inline val Ec2SubnetInvalidConfiguration: "Ec2SubnetInvalidConfiguration" = "Ec2SubnetInvalidConfiguration"
  inline val IamInstanceProfileNotFound: "IamInstanceProfileNotFound" = "IamInstanceProfileNotFound"
  inline val IamLimitExceeded: "IamLimitExceeded" = "IamLimitExceeded"
  inline val IamNodeRoleNotFound: "IamNodeRoleNotFound" = "IamNodeRoleNotFound"
  inline val NodeCreationFailure: "NodeCreationFailure" = "NodeCreationFailure"
  inline val AsgInstanceLaunchFailures: "AsgInstanceLaunchFailures" = "AsgInstanceLaunchFailures"
  inline val InstanceLimitExceeded: "InstanceLimitExceeded" = "InstanceLimitExceeded"
  inline val InsufficientFreeAddresses: "InsufficientFreeAddresses" = "InsufficientFreeAddresses"
  inline val AccessDenied: "AccessDenied" = "AccessDenied"
  inline val InternalFailure: "InternalFailure" = "InternalFailure"
  inline val ClusterUnreachable: "ClusterUnreachable" = "ClusterUnreachable"

  inline def values: js.Array[NodegroupIssueCode] = js.Array(
    AutoScalingGroupNotFound,
    AutoScalingGroupInvalidConfiguration,
    Ec2SecurityGroupNotFound,
    Ec2SecurityGroupDeletionFailure,
    Ec2LaunchTemplateNotFound,
    Ec2LaunchTemplateVersionMismatch,
    Ec2SubnetNotFound,
    Ec2SubnetInvalidConfiguration,
    IamInstanceProfileNotFound,
    IamLimitExceeded,
    IamNodeRoleNotFound,
    NodeCreationFailure,
    AsgInstanceLaunchFailures,
    InstanceLimitExceeded,
    InsufficientFreeAddresses,
    AccessDenied,
    InternalFailure,
    ClusterUnreachable
  )
}

type NodegroupStatus = "CREATING" | "ACTIVE" | "UPDATING" | "DELETING" | "CREATE_FAILED" | "DELETE_FAILED" | "DEGRADED"
object NodegroupStatus {
  inline val CREATING: "CREATING" = "CREATING"
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val UPDATING: "UPDATING" = "UPDATING"
  inline val DELETING: "DELETING" = "DELETING"
  inline val CREATE_FAILED: "CREATE_FAILED" = "CREATE_FAILED"
  inline val DELETE_FAILED: "DELETE_FAILED" = "DELETE_FAILED"
  inline val DEGRADED: "DEGRADED" = "DEGRADED"

  inline def values: js.Array[NodegroupStatus] = js.Array(CREATING, ACTIVE, UPDATING, DELETING, CREATE_FAILED, DELETE_FAILED, DEGRADED)
}

type ResolveConflicts = "OVERWRITE" | "NONE"
object ResolveConflicts {
  inline val OVERWRITE: "OVERWRITE" = "OVERWRITE"
  inline val NONE: "NONE" = "NONE"

  inline def values: js.Array[ResolveConflicts] = js.Array(OVERWRITE, NONE)
}

type UpdateParamType = "Version" | "PlatformVersion" | "EndpointPrivateAccess" | "EndpointPublicAccess" | "ClusterLogging" | "DesiredSize" | "LabelsToAdd" | "LabelsToRemove" | "MaxSize" | "MinSize" | "ReleaseVersion" | "PublicAccessCidrs" | "IdentityProviderConfig" | "EncryptionConfig" | "AddonVersion" | "ServiceAccountRoleArn" | "ResolveConflicts"
object UpdateParamType {
  inline val Version: "Version" = "Version"
  inline val PlatformVersion: "PlatformVersion" = "PlatformVersion"
  inline val EndpointPrivateAccess: "EndpointPrivateAccess" = "EndpointPrivateAccess"
  inline val EndpointPublicAccess: "EndpointPublicAccess" = "EndpointPublicAccess"
  inline val ClusterLogging: "ClusterLogging" = "ClusterLogging"
  inline val DesiredSize: "DesiredSize" = "DesiredSize"
  inline val LabelsToAdd: "LabelsToAdd" = "LabelsToAdd"
  inline val LabelsToRemove: "LabelsToRemove" = "LabelsToRemove"
  inline val MaxSize: "MaxSize" = "MaxSize"
  inline val MinSize: "MinSize" = "MinSize"
  inline val ReleaseVersion: "ReleaseVersion" = "ReleaseVersion"
  inline val PublicAccessCidrs: "PublicAccessCidrs" = "PublicAccessCidrs"
  inline val IdentityProviderConfig: "IdentityProviderConfig" = "IdentityProviderConfig"
  inline val EncryptionConfig: "EncryptionConfig" = "EncryptionConfig"
  inline val AddonVersion: "AddonVersion" = "AddonVersion"
  inline val ServiceAccountRoleArn: "ServiceAccountRoleArn" = "ServiceAccountRoleArn"
  inline val ResolveConflicts: "ResolveConflicts" = "ResolveConflicts"

  inline def values: js.Array[UpdateParamType] = js.Array(
    Version,
    PlatformVersion,
    EndpointPrivateAccess,
    EndpointPublicAccess,
    ClusterLogging,
    DesiredSize,
    LabelsToAdd,
    LabelsToRemove,
    MaxSize,
    MinSize,
    ReleaseVersion,
    PublicAccessCidrs,
    IdentityProviderConfig,
    EncryptionConfig,
    AddonVersion,
    ServiceAccountRoleArn,
    ResolveConflicts
  )
}

type UpdateStatus = "InProgress" | "Failed" | "Cancelled" | "Successful"
object UpdateStatus {
  inline val InProgress: "InProgress" = "InProgress"
  inline val Failed: "Failed" = "Failed"
  inline val Cancelled: "Cancelled" = "Cancelled"
  inline val Successful: "Successful" = "Successful"

  inline def values: js.Array[UpdateStatus] = js.Array(InProgress, Failed, Cancelled, Successful)
}

type UpdateType = "VersionUpdate" | "EndpointAccessUpdate" | "LoggingUpdate" | "ConfigUpdate" | "AssociateIdentityProviderConfig" | "DisassociateIdentityProviderConfig" | "AssociateEncryptionConfig" | "AddonUpdate"
object UpdateType {
  inline val VersionUpdate: "VersionUpdate" = "VersionUpdate"
  inline val EndpointAccessUpdate: "EndpointAccessUpdate" = "EndpointAccessUpdate"
  inline val LoggingUpdate: "LoggingUpdate" = "LoggingUpdate"
  inline val ConfigUpdate: "ConfigUpdate" = "ConfigUpdate"
  inline val AssociateIdentityProviderConfig: "AssociateIdentityProviderConfig" = "AssociateIdentityProviderConfig"
  inline val DisassociateIdentityProviderConfig: "DisassociateIdentityProviderConfig" = "DisassociateIdentityProviderConfig"
  inline val AssociateEncryptionConfig: "AssociateEncryptionConfig" = "AssociateEncryptionConfig"
  inline val AddonUpdate: "AddonUpdate" = "AddonUpdate"

  inline def values: js.Array[UpdateType] = js.Array(
    VersionUpdate,
    EndpointAccessUpdate,
    LoggingUpdate,
    ConfigUpdate,
    AssociateIdentityProviderConfig,
    DisassociateIdentityProviderConfig,
    AssociateEncryptionConfig,
    AddonUpdate
  )
}

type configStatus = "CREATING" | "DELETING" | "ACTIVE"
object configStatus {
  inline val CREATING: "CREATING" = "CREATING"
  inline val DELETING: "DELETING" = "DELETING"
  inline val ACTIVE: "ACTIVE" = "ACTIVE"

  inline def values: js.Array[configStatus] = js.Array(CREATING, DELETING, ACTIVE)
}
