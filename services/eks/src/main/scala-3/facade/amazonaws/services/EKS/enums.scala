package facade.amazonaws.services.eks

import scalajs._

type AMITypes = "AL2_x86_64" | "AL2_x86_64_GPU" | "AL2_ARM_64"
object AMITypes {
  val AL2_x86_64: "AL2_x86_64" = "AL2_x86_64"
  val AL2_x86_64_GPU: "AL2_x86_64_GPU" = "AL2_x86_64_GPU"
  val AL2_ARM_64: "AL2_ARM_64" = "AL2_ARM_64"

  @inline def values = js.Array[AMITypes](AL2_x86_64, AL2_x86_64_GPU, AL2_ARM_64)
}

type AddonIssueCode = "AccessDenied" | "InternalFailure" | "ClusterUnreachable" | "InsufficientNumberOfReplicas" | "ConfigurationConflict" | "AdmissionRequestDenied"
object AddonIssueCode {
  val AccessDenied: "AccessDenied" = "AccessDenied"
  val InternalFailure: "InternalFailure" = "InternalFailure"
  val ClusterUnreachable: "ClusterUnreachable" = "ClusterUnreachable"
  val InsufficientNumberOfReplicas: "InsufficientNumberOfReplicas" = "InsufficientNumberOfReplicas"
  val ConfigurationConflict: "ConfigurationConflict" = "ConfigurationConflict"
  val AdmissionRequestDenied: "AdmissionRequestDenied" = "AdmissionRequestDenied"

  @inline def values = js.Array[AddonIssueCode](AccessDenied, InternalFailure, ClusterUnreachable, InsufficientNumberOfReplicas, ConfigurationConflict, AdmissionRequestDenied)
}

type AddonStatus = "CREATING" | "ACTIVE" | "CREATE_FAILED" | "UPDATING" | "DELETING" | "DELETE_FAILED" | "DEGRADED"
object AddonStatus {
  val CREATING: "CREATING" = "CREATING"
  val ACTIVE: "ACTIVE" = "ACTIVE"
  val CREATE_FAILED: "CREATE_FAILED" = "CREATE_FAILED"
  val UPDATING: "UPDATING" = "UPDATING"
  val DELETING: "DELETING" = "DELETING"
  val DELETE_FAILED: "DELETE_FAILED" = "DELETE_FAILED"
  val DEGRADED: "DEGRADED" = "DEGRADED"

  @inline def values = js.Array[AddonStatus](CREATING, ACTIVE, CREATE_FAILED, UPDATING, DELETING, DELETE_FAILED, DEGRADED)
}

type CapacityTypes = "ON_DEMAND" | "SPOT"
object CapacityTypes {
  val ON_DEMAND: "ON_DEMAND" = "ON_DEMAND"
  val SPOT: "SPOT" = "SPOT"

  @inline def values = js.Array[CapacityTypes](ON_DEMAND, SPOT)
}

type ClusterStatus = "CREATING" | "ACTIVE" | "DELETING" | "FAILED" | "UPDATING"
object ClusterStatus {
  val CREATING: "CREATING" = "CREATING"
  val ACTIVE: "ACTIVE" = "ACTIVE"
  val DELETING: "DELETING" = "DELETING"
  val FAILED: "FAILED" = "FAILED"
  val UPDATING: "UPDATING" = "UPDATING"

  @inline def values = js.Array[ClusterStatus](CREATING, ACTIVE, DELETING, FAILED, UPDATING)
}

type ErrorCode = "SubnetNotFound" | "SecurityGroupNotFound" | "EniLimitReached" | "IpNotAvailable" | "AccessDenied" | "OperationNotPermitted" | "VpcIdNotFound" | "Unknown" | "NodeCreationFailure" | "PodEvictionFailure" | "InsufficientFreeAddresses" | "ClusterUnreachable" | "InsufficientNumberOfReplicas" | "ConfigurationConflict" | "AdmissionRequestDenied"
object ErrorCode {
  val SubnetNotFound: "SubnetNotFound" = "SubnetNotFound"
  val SecurityGroupNotFound: "SecurityGroupNotFound" = "SecurityGroupNotFound"
  val EniLimitReached: "EniLimitReached" = "EniLimitReached"
  val IpNotAvailable: "IpNotAvailable" = "IpNotAvailable"
  val AccessDenied: "AccessDenied" = "AccessDenied"
  val OperationNotPermitted: "OperationNotPermitted" = "OperationNotPermitted"
  val VpcIdNotFound: "VpcIdNotFound" = "VpcIdNotFound"
  val Unknown: "Unknown" = "Unknown"
  val NodeCreationFailure: "NodeCreationFailure" = "NodeCreationFailure"
  val PodEvictionFailure: "PodEvictionFailure" = "PodEvictionFailure"
  val InsufficientFreeAddresses: "InsufficientFreeAddresses" = "InsufficientFreeAddresses"
  val ClusterUnreachable: "ClusterUnreachable" = "ClusterUnreachable"
  val InsufficientNumberOfReplicas: "InsufficientNumberOfReplicas" = "InsufficientNumberOfReplicas"
  val ConfigurationConflict: "ConfigurationConflict" = "ConfigurationConflict"
  val AdmissionRequestDenied: "AdmissionRequestDenied" = "AdmissionRequestDenied"

  @inline def values = js.Array[ErrorCode](
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
  val CREATING: "CREATING" = "CREATING"
  val ACTIVE: "ACTIVE" = "ACTIVE"
  val DELETING: "DELETING" = "DELETING"
  val CREATE_FAILED: "CREATE_FAILED" = "CREATE_FAILED"
  val DELETE_FAILED: "DELETE_FAILED" = "DELETE_FAILED"

  @inline def values = js.Array[FargateProfileStatus](CREATING, ACTIVE, DELETING, CREATE_FAILED, DELETE_FAILED)
}

type LogType = "api" | "audit" | "authenticator" | "controllerManager" | "scheduler"
object LogType {
  val api: "api" = "api"
  val audit: "audit" = "audit"
  val authenticator: "authenticator" = "authenticator"
  val controllerManager: "controllerManager" = "controllerManager"
  val scheduler: "scheduler" = "scheduler"

  @inline def values = js.Array[LogType](api, audit, authenticator, controllerManager, scheduler)
}

type NodegroupIssueCode = "AutoScalingGroupNotFound" | "AutoScalingGroupInvalidConfiguration" | "Ec2SecurityGroupNotFound" | "Ec2SecurityGroupDeletionFailure" | "Ec2LaunchTemplateNotFound" | "Ec2LaunchTemplateVersionMismatch" | "Ec2SubnetNotFound" | "Ec2SubnetInvalidConfiguration" | "IamInstanceProfileNotFound" | "IamLimitExceeded" | "IamNodeRoleNotFound" | "NodeCreationFailure" | "AsgInstanceLaunchFailures" | "InstanceLimitExceeded" | "InsufficientFreeAddresses" | "AccessDenied" | "InternalFailure" | "ClusterUnreachable"
object NodegroupIssueCode {
  val AutoScalingGroupNotFound: "AutoScalingGroupNotFound" = "AutoScalingGroupNotFound"
  val AutoScalingGroupInvalidConfiguration: "AutoScalingGroupInvalidConfiguration" = "AutoScalingGroupInvalidConfiguration"
  val Ec2SecurityGroupNotFound: "Ec2SecurityGroupNotFound" = "Ec2SecurityGroupNotFound"
  val Ec2SecurityGroupDeletionFailure: "Ec2SecurityGroupDeletionFailure" = "Ec2SecurityGroupDeletionFailure"
  val Ec2LaunchTemplateNotFound: "Ec2LaunchTemplateNotFound" = "Ec2LaunchTemplateNotFound"
  val Ec2LaunchTemplateVersionMismatch: "Ec2LaunchTemplateVersionMismatch" = "Ec2LaunchTemplateVersionMismatch"
  val Ec2SubnetNotFound: "Ec2SubnetNotFound" = "Ec2SubnetNotFound"
  val Ec2SubnetInvalidConfiguration: "Ec2SubnetInvalidConfiguration" = "Ec2SubnetInvalidConfiguration"
  val IamInstanceProfileNotFound: "IamInstanceProfileNotFound" = "IamInstanceProfileNotFound"
  val IamLimitExceeded: "IamLimitExceeded" = "IamLimitExceeded"
  val IamNodeRoleNotFound: "IamNodeRoleNotFound" = "IamNodeRoleNotFound"
  val NodeCreationFailure: "NodeCreationFailure" = "NodeCreationFailure"
  val AsgInstanceLaunchFailures: "AsgInstanceLaunchFailures" = "AsgInstanceLaunchFailures"
  val InstanceLimitExceeded: "InstanceLimitExceeded" = "InstanceLimitExceeded"
  val InsufficientFreeAddresses: "InsufficientFreeAddresses" = "InsufficientFreeAddresses"
  val AccessDenied: "AccessDenied" = "AccessDenied"
  val InternalFailure: "InternalFailure" = "InternalFailure"
  val ClusterUnreachable: "ClusterUnreachable" = "ClusterUnreachable"

  @inline def values = js.Array[NodegroupIssueCode](
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
  val CREATING: "CREATING" = "CREATING"
  val ACTIVE: "ACTIVE" = "ACTIVE"
  val UPDATING: "UPDATING" = "UPDATING"
  val DELETING: "DELETING" = "DELETING"
  val CREATE_FAILED: "CREATE_FAILED" = "CREATE_FAILED"
  val DELETE_FAILED: "DELETE_FAILED" = "DELETE_FAILED"
  val DEGRADED: "DEGRADED" = "DEGRADED"

  @inline def values = js.Array[NodegroupStatus](CREATING, ACTIVE, UPDATING, DELETING, CREATE_FAILED, DELETE_FAILED, DEGRADED)
}

type ResolveConflicts = "OVERWRITE" | "NONE"
object ResolveConflicts {
  val OVERWRITE: "OVERWRITE" = "OVERWRITE"
  val NONE: "NONE" = "NONE"

  @inline def values = js.Array[ResolveConflicts](OVERWRITE, NONE)
}

type UpdateParamType = "Version" | "PlatformVersion" | "EndpointPrivateAccess" | "EndpointPublicAccess" | "ClusterLogging" | "DesiredSize" | "LabelsToAdd" | "LabelsToRemove" | "MaxSize" | "MinSize" | "ReleaseVersion" | "PublicAccessCidrs" | "IdentityProviderConfig" | "EncryptionConfig" | "AddonVersion" | "ServiceAccountRoleArn" | "ResolveConflicts"
object UpdateParamType {
  val Version: "Version" = "Version"
  val PlatformVersion: "PlatformVersion" = "PlatformVersion"
  val EndpointPrivateAccess: "EndpointPrivateAccess" = "EndpointPrivateAccess"
  val EndpointPublicAccess: "EndpointPublicAccess" = "EndpointPublicAccess"
  val ClusterLogging: "ClusterLogging" = "ClusterLogging"
  val DesiredSize: "DesiredSize" = "DesiredSize"
  val LabelsToAdd: "LabelsToAdd" = "LabelsToAdd"
  val LabelsToRemove: "LabelsToRemove" = "LabelsToRemove"
  val MaxSize: "MaxSize" = "MaxSize"
  val MinSize: "MinSize" = "MinSize"
  val ReleaseVersion: "ReleaseVersion" = "ReleaseVersion"
  val PublicAccessCidrs: "PublicAccessCidrs" = "PublicAccessCidrs"
  val IdentityProviderConfig: "IdentityProviderConfig" = "IdentityProviderConfig"
  val EncryptionConfig: "EncryptionConfig" = "EncryptionConfig"
  val AddonVersion: "AddonVersion" = "AddonVersion"
  val ServiceAccountRoleArn: "ServiceAccountRoleArn" = "ServiceAccountRoleArn"
  val ResolveConflicts: "ResolveConflicts" = "ResolveConflicts"

  @inline def values = js.Array[UpdateParamType](
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
  val InProgress: "InProgress" = "InProgress"
  val Failed: "Failed" = "Failed"
  val Cancelled: "Cancelled" = "Cancelled"
  val Successful: "Successful" = "Successful"

  @inline def values = js.Array[UpdateStatus](InProgress, Failed, Cancelled, Successful)
}

type UpdateType = "VersionUpdate" | "EndpointAccessUpdate" | "LoggingUpdate" | "ConfigUpdate" | "AssociateIdentityProviderConfig" | "DisassociateIdentityProviderConfig" | "AssociateEncryptionConfig" | "AddonUpdate"
object UpdateType {
  val VersionUpdate: "VersionUpdate" = "VersionUpdate"
  val EndpointAccessUpdate: "EndpointAccessUpdate" = "EndpointAccessUpdate"
  val LoggingUpdate: "LoggingUpdate" = "LoggingUpdate"
  val ConfigUpdate: "ConfigUpdate" = "ConfigUpdate"
  val AssociateIdentityProviderConfig: "AssociateIdentityProviderConfig" = "AssociateIdentityProviderConfig"
  val DisassociateIdentityProviderConfig: "DisassociateIdentityProviderConfig" = "DisassociateIdentityProviderConfig"
  val AssociateEncryptionConfig: "AssociateEncryptionConfig" = "AssociateEncryptionConfig"
  val AddonUpdate: "AddonUpdate" = "AddonUpdate"

  @inline def values = js.Array[UpdateType](
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
  val CREATING: "CREATING" = "CREATING"
  val DELETING: "DELETING" = "DELETING"
  val ACTIVE: "ACTIVE" = "ACTIVE"

  @inline def values = js.Array[configStatus](CREATING, DELETING, ACTIVE)
}
