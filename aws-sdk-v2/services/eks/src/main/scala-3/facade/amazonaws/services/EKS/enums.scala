package facade.amazonaws.services.eks

import scalajs.js

type AMITypes = "AL2_x86_64" | "AL2_x86_64_GPU" | "AL2_ARM_64" | "CUSTOM" | "BOTTLEROCKET_ARM_64" | "BOTTLEROCKET_x86_64" | "BOTTLEROCKET_ARM_64_NVIDIA" | "BOTTLEROCKET_x86_64_NVIDIA"
object AMITypes {
  inline val AL2_x86_64: "AL2_x86_64" = "AL2_x86_64"
  inline val AL2_x86_64_GPU: "AL2_x86_64_GPU" = "AL2_x86_64_GPU"
  inline val AL2_ARM_64: "AL2_ARM_64" = "AL2_ARM_64"
  inline val CUSTOM: "CUSTOM" = "CUSTOM"
  inline val BOTTLEROCKET_ARM_64: "BOTTLEROCKET_ARM_64" = "BOTTLEROCKET_ARM_64"
  inline val BOTTLEROCKET_x86_64: "BOTTLEROCKET_x86_64" = "BOTTLEROCKET_x86_64"
  inline val BOTTLEROCKET_ARM_64_NVIDIA: "BOTTLEROCKET_ARM_64_NVIDIA" = "BOTTLEROCKET_ARM_64_NVIDIA"
  inline val BOTTLEROCKET_x86_64_NVIDIA: "BOTTLEROCKET_x86_64_NVIDIA" = "BOTTLEROCKET_x86_64_NVIDIA"

  inline def values: js.Array[AMITypes] = js.Array(AL2_x86_64, AL2_x86_64_GPU, AL2_ARM_64, CUSTOM, BOTTLEROCKET_ARM_64, BOTTLEROCKET_x86_64, BOTTLEROCKET_ARM_64_NVIDIA, BOTTLEROCKET_x86_64_NVIDIA)
}

type AddonIssueCode = "AccessDenied" | "InternalFailure" | "ClusterUnreachable" | "InsufficientNumberOfReplicas" | "ConfigurationConflict" | "AdmissionRequestDenied" | "UnsupportedAddonModification" | "K8sResourceNotFound"
object AddonIssueCode {
  inline val AccessDenied: "AccessDenied" = "AccessDenied"
  inline val InternalFailure: "InternalFailure" = "InternalFailure"
  inline val ClusterUnreachable: "ClusterUnreachable" = "ClusterUnreachable"
  inline val InsufficientNumberOfReplicas: "InsufficientNumberOfReplicas" = "InsufficientNumberOfReplicas"
  inline val ConfigurationConflict: "ConfigurationConflict" = "ConfigurationConflict"
  inline val AdmissionRequestDenied: "AdmissionRequestDenied" = "AdmissionRequestDenied"
  inline val UnsupportedAddonModification: "UnsupportedAddonModification" = "UnsupportedAddonModification"
  inline val K8sResourceNotFound: "K8sResourceNotFound" = "K8sResourceNotFound"

  inline def values: js.Array[AddonIssueCode] = js.Array(
    AccessDenied,
    InternalFailure,
    ClusterUnreachable,
    InsufficientNumberOfReplicas,
    ConfigurationConflict,
    AdmissionRequestDenied,
    UnsupportedAddonModification,
    K8sResourceNotFound
  )
}

type AddonStatus = "CREATING" | "ACTIVE" | "CREATE_FAILED" | "UPDATING" | "DELETING" | "DELETE_FAILED" | "DEGRADED" | "UPDATE_FAILED"
object AddonStatus {
  inline val CREATING: "CREATING" = "CREATING"
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val CREATE_FAILED: "CREATE_FAILED" = "CREATE_FAILED"
  inline val UPDATING: "UPDATING" = "UPDATING"
  inline val DELETING: "DELETING" = "DELETING"
  inline val DELETE_FAILED: "DELETE_FAILED" = "DELETE_FAILED"
  inline val DEGRADED: "DEGRADED" = "DEGRADED"
  inline val UPDATE_FAILED: "UPDATE_FAILED" = "UPDATE_FAILED"

  inline def values: js.Array[AddonStatus] = js.Array(CREATING, ACTIVE, CREATE_FAILED, UPDATING, DELETING, DELETE_FAILED, DEGRADED, UPDATE_FAILED)
}

type CapacityTypes = "ON_DEMAND" | "SPOT"
object CapacityTypes {
  inline val ON_DEMAND: "ON_DEMAND" = "ON_DEMAND"
  inline val SPOT: "SPOT" = "SPOT"

  inline def values: js.Array[CapacityTypes] = js.Array(ON_DEMAND, SPOT)
}

type ClusterIssueCode = "AccessDenied" | "ClusterUnreachable" | "ConfigurationConflict" | "InternalFailure" | "ResourceLimitExceeded" | "ResourceNotFound"
object ClusterIssueCode {
  inline val AccessDenied: "AccessDenied" = "AccessDenied"
  inline val ClusterUnreachable: "ClusterUnreachable" = "ClusterUnreachable"
  inline val ConfigurationConflict: "ConfigurationConflict" = "ConfigurationConflict"
  inline val InternalFailure: "InternalFailure" = "InternalFailure"
  inline val ResourceLimitExceeded: "ResourceLimitExceeded" = "ResourceLimitExceeded"
  inline val ResourceNotFound: "ResourceNotFound" = "ResourceNotFound"

  inline def values: js.Array[ClusterIssueCode] = js.Array(AccessDenied, ClusterUnreachable, ConfigurationConflict, InternalFailure, ResourceLimitExceeded, ResourceNotFound)
}

type ClusterStatus = "CREATING" | "ACTIVE" | "DELETING" | "FAILED" | "UPDATING" | "PENDING"
object ClusterStatus {
  inline val CREATING: "CREATING" = "CREATING"
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val DELETING: "DELETING" = "DELETING"
  inline val FAILED: "FAILED" = "FAILED"
  inline val UPDATING: "UPDATING" = "UPDATING"
  inline val PENDING: "PENDING" = "PENDING"

  inline def values: js.Array[ClusterStatus] = js.Array(CREATING, ACTIVE, DELETING, FAILED, UPDATING, PENDING)
}

type ConnectorConfigProvider = "EKS_ANYWHERE" | "ANTHOS" | "GKE" | "AKS" | "OPENSHIFT" | "TANZU" | "RANCHER" | "EC2" | "OTHER"
object ConnectorConfigProvider {
  inline val EKS_ANYWHERE: "EKS_ANYWHERE" = "EKS_ANYWHERE"
  inline val ANTHOS: "ANTHOS" = "ANTHOS"
  inline val GKE: "GKE" = "GKE"
  inline val AKS: "AKS" = "AKS"
  inline val OPENSHIFT: "OPENSHIFT" = "OPENSHIFT"
  inline val TANZU: "TANZU" = "TANZU"
  inline val RANCHER: "RANCHER" = "RANCHER"
  inline val EC2: "EC2" = "EC2"
  inline val OTHER: "OTHER" = "OTHER"

  inline def values: js.Array[ConnectorConfigProvider] = js.Array(EKS_ANYWHERE, ANTHOS, GKE, AKS, OPENSHIFT, TANZU, RANCHER, EC2, OTHER)
}

type ErrorCode = "SubnetNotFound" | "SecurityGroupNotFound" | "EniLimitReached" | "IpNotAvailable" | "AccessDenied" | "OperationNotPermitted" | "VpcIdNotFound" | "Unknown" | "NodeCreationFailure" | "PodEvictionFailure" | "InsufficientFreeAddresses" | "ClusterUnreachable" | "InsufficientNumberOfReplicas" | "ConfigurationConflict" | "AdmissionRequestDenied" | "UnsupportedAddonModification" | "K8sResourceNotFound"
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
  inline val UnsupportedAddonModification: "UnsupportedAddonModification" = "UnsupportedAddonModification"
  inline val K8sResourceNotFound: "K8sResourceNotFound" = "K8sResourceNotFound"

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
    AdmissionRequestDenied,
    UnsupportedAddonModification,
    K8sResourceNotFound
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

type IpFamily = "ipv4" | "ipv6"
object IpFamily {
  inline val ipv4: "ipv4" = "ipv4"
  inline val ipv6: "ipv6" = "ipv6"

  inline def values: js.Array[IpFamily] = js.Array(ipv4, ipv6)
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

type NodegroupIssueCode = "AutoScalingGroupNotFound" | "AutoScalingGroupInvalidConfiguration" | "Ec2SecurityGroupNotFound" | "Ec2SecurityGroupDeletionFailure" | "Ec2LaunchTemplateNotFound" | "Ec2LaunchTemplateVersionMismatch" | "Ec2SubnetNotFound" | "Ec2SubnetInvalidConfiguration" | "IamInstanceProfileNotFound" | "IamLimitExceeded" | "IamNodeRoleNotFound" | "NodeCreationFailure" | "AsgInstanceLaunchFailures" | "InstanceLimitExceeded" | "InsufficientFreeAddresses" | "AccessDenied" | "InternalFailure" | "ClusterUnreachable" | "Ec2SubnetMissingIpv6Assignment"
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
  inline val Ec2SubnetMissingIpv6Assignment: "Ec2SubnetMissingIpv6Assignment" = "Ec2SubnetMissingIpv6Assignment"

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
    ClusterUnreachable,
    Ec2SubnetMissingIpv6Assignment
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

type ResolveConflicts = "OVERWRITE" | "NONE" | "PRESERVE"
object ResolveConflicts {
  inline val OVERWRITE: "OVERWRITE" = "OVERWRITE"
  inline val NONE: "NONE" = "NONE"
  inline val PRESERVE: "PRESERVE" = "PRESERVE"

  inline def values: js.Array[ResolveConflicts] = js.Array(OVERWRITE, NONE, PRESERVE)
}

type TaintEffect = "NO_SCHEDULE" | "NO_EXECUTE" | "PREFER_NO_SCHEDULE"
object TaintEffect {
  inline val NO_SCHEDULE: "NO_SCHEDULE" = "NO_SCHEDULE"
  inline val NO_EXECUTE: "NO_EXECUTE" = "NO_EXECUTE"
  inline val PREFER_NO_SCHEDULE: "PREFER_NO_SCHEDULE" = "PREFER_NO_SCHEDULE"

  inline def values: js.Array[TaintEffect] = js.Array(NO_SCHEDULE, NO_EXECUTE, PREFER_NO_SCHEDULE)
}

type UpdateParamType = "Version" | "PlatformVersion" | "EndpointPrivateAccess" | "EndpointPublicAccess" | "ClusterLogging" | "DesiredSize" | "LabelsToAdd" | "LabelsToRemove" | "TaintsToAdd" | "TaintsToRemove" | "MaxSize" | "MinSize" | "ReleaseVersion" | "PublicAccessCidrs" | "LaunchTemplateName" | "LaunchTemplateVersion" | "IdentityProviderConfig" | "EncryptionConfig" | "AddonVersion" | "ServiceAccountRoleArn" | "ResolveConflicts" | "MaxUnavailable" | "MaxUnavailablePercentage"
object UpdateParamType {
  inline val Version: "Version" = "Version"
  inline val PlatformVersion: "PlatformVersion" = "PlatformVersion"
  inline val EndpointPrivateAccess: "EndpointPrivateAccess" = "EndpointPrivateAccess"
  inline val EndpointPublicAccess: "EndpointPublicAccess" = "EndpointPublicAccess"
  inline val ClusterLogging: "ClusterLogging" = "ClusterLogging"
  inline val DesiredSize: "DesiredSize" = "DesiredSize"
  inline val LabelsToAdd: "LabelsToAdd" = "LabelsToAdd"
  inline val LabelsToRemove: "LabelsToRemove" = "LabelsToRemove"
  inline val TaintsToAdd: "TaintsToAdd" = "TaintsToAdd"
  inline val TaintsToRemove: "TaintsToRemove" = "TaintsToRemove"
  inline val MaxSize: "MaxSize" = "MaxSize"
  inline val MinSize: "MinSize" = "MinSize"
  inline val ReleaseVersion: "ReleaseVersion" = "ReleaseVersion"
  inline val PublicAccessCidrs: "PublicAccessCidrs" = "PublicAccessCidrs"
  inline val LaunchTemplateName: "LaunchTemplateName" = "LaunchTemplateName"
  inline val LaunchTemplateVersion: "LaunchTemplateVersion" = "LaunchTemplateVersion"
  inline val IdentityProviderConfig: "IdentityProviderConfig" = "IdentityProviderConfig"
  inline val EncryptionConfig: "EncryptionConfig" = "EncryptionConfig"
  inline val AddonVersion: "AddonVersion" = "AddonVersion"
  inline val ServiceAccountRoleArn: "ServiceAccountRoleArn" = "ServiceAccountRoleArn"
  inline val ResolveConflicts: "ResolveConflicts" = "ResolveConflicts"
  inline val MaxUnavailable: "MaxUnavailable" = "MaxUnavailable"
  inline val MaxUnavailablePercentage: "MaxUnavailablePercentage" = "MaxUnavailablePercentage"

  inline def values: js.Array[UpdateParamType] = js.Array(
    Version,
    PlatformVersion,
    EndpointPrivateAccess,
    EndpointPublicAccess,
    ClusterLogging,
    DesiredSize,
    LabelsToAdd,
    LabelsToRemove,
    TaintsToAdd,
    TaintsToRemove,
    MaxSize,
    MinSize,
    ReleaseVersion,
    PublicAccessCidrs,
    LaunchTemplateName,
    LaunchTemplateVersion,
    IdentityProviderConfig,
    EncryptionConfig,
    AddonVersion,
    ServiceAccountRoleArn,
    ResolveConflicts,
    MaxUnavailable,
    MaxUnavailablePercentage
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
