package facade.amazonaws.services.eks

import scalajs.js

@js.native
sealed trait AMITypes extends js.Any
object AMITypes {
  val AL2_x86_64 = "AL2_x86_64".asInstanceOf[AMITypes]
  val AL2_x86_64_GPU = "AL2_x86_64_GPU".asInstanceOf[AMITypes]
  val AL2_ARM_64 = "AL2_ARM_64".asInstanceOf[AMITypes]
  val CUSTOM = "CUSTOM".asInstanceOf[AMITypes]
  val BOTTLEROCKET_ARM_64 = "BOTTLEROCKET_ARM_64".asInstanceOf[AMITypes]
  val BOTTLEROCKET_x86_64 = "BOTTLEROCKET_x86_64".asInstanceOf[AMITypes]
  val BOTTLEROCKET_ARM_64_NVIDIA = "BOTTLEROCKET_ARM_64_NVIDIA".asInstanceOf[AMITypes]
  val BOTTLEROCKET_x86_64_NVIDIA = "BOTTLEROCKET_x86_64_NVIDIA".asInstanceOf[AMITypes]

  @inline def values: js.Array[AMITypes] = js.Array(AL2_x86_64, AL2_x86_64_GPU, AL2_ARM_64, CUSTOM, BOTTLEROCKET_ARM_64, BOTTLEROCKET_x86_64, BOTTLEROCKET_ARM_64_NVIDIA, BOTTLEROCKET_x86_64_NVIDIA)
}

@js.native
sealed trait AddonIssueCode extends js.Any
object AddonIssueCode {
  val AccessDenied = "AccessDenied".asInstanceOf[AddonIssueCode]
  val InternalFailure = "InternalFailure".asInstanceOf[AddonIssueCode]
  val ClusterUnreachable = "ClusterUnreachable".asInstanceOf[AddonIssueCode]
  val InsufficientNumberOfReplicas = "InsufficientNumberOfReplicas".asInstanceOf[AddonIssueCode]
  val ConfigurationConflict = "ConfigurationConflict".asInstanceOf[AddonIssueCode]
  val AdmissionRequestDenied = "AdmissionRequestDenied".asInstanceOf[AddonIssueCode]
  val UnsupportedAddonModification = "UnsupportedAddonModification".asInstanceOf[AddonIssueCode]
  val K8sResourceNotFound = "K8sResourceNotFound".asInstanceOf[AddonIssueCode]

  @inline def values: js.Array[AddonIssueCode] = js.Array(
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

@js.native
sealed trait AddonStatus extends js.Any
object AddonStatus {
  val CREATING = "CREATING".asInstanceOf[AddonStatus]
  val ACTIVE = "ACTIVE".asInstanceOf[AddonStatus]
  val CREATE_FAILED = "CREATE_FAILED".asInstanceOf[AddonStatus]
  val UPDATING = "UPDATING".asInstanceOf[AddonStatus]
  val DELETING = "DELETING".asInstanceOf[AddonStatus]
  val DELETE_FAILED = "DELETE_FAILED".asInstanceOf[AddonStatus]
  val DEGRADED = "DEGRADED".asInstanceOf[AddonStatus]
  val UPDATE_FAILED = "UPDATE_FAILED".asInstanceOf[AddonStatus]

  @inline def values: js.Array[AddonStatus] = js.Array(CREATING, ACTIVE, CREATE_FAILED, UPDATING, DELETING, DELETE_FAILED, DEGRADED, UPDATE_FAILED)
}

@js.native
sealed trait CapacityTypes extends js.Any
object CapacityTypes {
  val ON_DEMAND = "ON_DEMAND".asInstanceOf[CapacityTypes]
  val SPOT = "SPOT".asInstanceOf[CapacityTypes]

  @inline def values: js.Array[CapacityTypes] = js.Array(ON_DEMAND, SPOT)
}

@js.native
sealed trait ClusterIssueCode extends js.Any
object ClusterIssueCode {
  val AccessDenied = "AccessDenied".asInstanceOf[ClusterIssueCode]
  val ClusterUnreachable = "ClusterUnreachable".asInstanceOf[ClusterIssueCode]
  val ConfigurationConflict = "ConfigurationConflict".asInstanceOf[ClusterIssueCode]
  val InternalFailure = "InternalFailure".asInstanceOf[ClusterIssueCode]
  val ResourceLimitExceeded = "ResourceLimitExceeded".asInstanceOf[ClusterIssueCode]
  val ResourceNotFound = "ResourceNotFound".asInstanceOf[ClusterIssueCode]

  @inline def values: js.Array[ClusterIssueCode] = js.Array(AccessDenied, ClusterUnreachable, ConfigurationConflict, InternalFailure, ResourceLimitExceeded, ResourceNotFound)
}

@js.native
sealed trait ClusterStatus extends js.Any
object ClusterStatus {
  val CREATING = "CREATING".asInstanceOf[ClusterStatus]
  val ACTIVE = "ACTIVE".asInstanceOf[ClusterStatus]
  val DELETING = "DELETING".asInstanceOf[ClusterStatus]
  val FAILED = "FAILED".asInstanceOf[ClusterStatus]
  val UPDATING = "UPDATING".asInstanceOf[ClusterStatus]
  val PENDING = "PENDING".asInstanceOf[ClusterStatus]

  @inline def values: js.Array[ClusterStatus] = js.Array(CREATING, ACTIVE, DELETING, FAILED, UPDATING, PENDING)
}

@js.native
sealed trait ConnectorConfigProvider extends js.Any
object ConnectorConfigProvider {
  val EKS_ANYWHERE = "EKS_ANYWHERE".asInstanceOf[ConnectorConfigProvider]
  val ANTHOS = "ANTHOS".asInstanceOf[ConnectorConfigProvider]
  val GKE = "GKE".asInstanceOf[ConnectorConfigProvider]
  val AKS = "AKS".asInstanceOf[ConnectorConfigProvider]
  val OPENSHIFT = "OPENSHIFT".asInstanceOf[ConnectorConfigProvider]
  val TANZU = "TANZU".asInstanceOf[ConnectorConfigProvider]
  val RANCHER = "RANCHER".asInstanceOf[ConnectorConfigProvider]
  val EC2 = "EC2".asInstanceOf[ConnectorConfigProvider]
  val OTHER = "OTHER".asInstanceOf[ConnectorConfigProvider]

  @inline def values: js.Array[ConnectorConfigProvider] = js.Array(EKS_ANYWHERE, ANTHOS, GKE, AKS, OPENSHIFT, TANZU, RANCHER, EC2, OTHER)
}

@js.native
sealed trait ErrorCode extends js.Any
object ErrorCode {
  val SubnetNotFound = "SubnetNotFound".asInstanceOf[ErrorCode]
  val SecurityGroupNotFound = "SecurityGroupNotFound".asInstanceOf[ErrorCode]
  val EniLimitReached = "EniLimitReached".asInstanceOf[ErrorCode]
  val IpNotAvailable = "IpNotAvailable".asInstanceOf[ErrorCode]
  val AccessDenied = "AccessDenied".asInstanceOf[ErrorCode]
  val OperationNotPermitted = "OperationNotPermitted".asInstanceOf[ErrorCode]
  val VpcIdNotFound = "VpcIdNotFound".asInstanceOf[ErrorCode]
  val Unknown = "Unknown".asInstanceOf[ErrorCode]
  val NodeCreationFailure = "NodeCreationFailure".asInstanceOf[ErrorCode]
  val PodEvictionFailure = "PodEvictionFailure".asInstanceOf[ErrorCode]
  val InsufficientFreeAddresses = "InsufficientFreeAddresses".asInstanceOf[ErrorCode]
  val ClusterUnreachable = "ClusterUnreachable".asInstanceOf[ErrorCode]
  val InsufficientNumberOfReplicas = "InsufficientNumberOfReplicas".asInstanceOf[ErrorCode]
  val ConfigurationConflict = "ConfigurationConflict".asInstanceOf[ErrorCode]
  val AdmissionRequestDenied = "AdmissionRequestDenied".asInstanceOf[ErrorCode]
  val UnsupportedAddonModification = "UnsupportedAddonModification".asInstanceOf[ErrorCode]
  val K8sResourceNotFound = "K8sResourceNotFound".asInstanceOf[ErrorCode]

  @inline def values: js.Array[ErrorCode] = js.Array(
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

@js.native
sealed trait FargateProfileStatus extends js.Any
object FargateProfileStatus {
  val CREATING = "CREATING".asInstanceOf[FargateProfileStatus]
  val ACTIVE = "ACTIVE".asInstanceOf[FargateProfileStatus]
  val DELETING = "DELETING".asInstanceOf[FargateProfileStatus]
  val CREATE_FAILED = "CREATE_FAILED".asInstanceOf[FargateProfileStatus]
  val DELETE_FAILED = "DELETE_FAILED".asInstanceOf[FargateProfileStatus]

  @inline def values: js.Array[FargateProfileStatus] = js.Array(CREATING, ACTIVE, DELETING, CREATE_FAILED, DELETE_FAILED)
}

@js.native
sealed trait IpFamily extends js.Any
object IpFamily {
  val ipv4 = "ipv4".asInstanceOf[IpFamily]
  val ipv6 = "ipv6".asInstanceOf[IpFamily]

  @inline def values: js.Array[IpFamily] = js.Array(ipv4, ipv6)
}

@js.native
sealed trait LogType extends js.Any
object LogType {
  val api = "api".asInstanceOf[LogType]
  val audit = "audit".asInstanceOf[LogType]
  val authenticator = "authenticator".asInstanceOf[LogType]
  val controllerManager = "controllerManager".asInstanceOf[LogType]
  val scheduler = "scheduler".asInstanceOf[LogType]

  @inline def values: js.Array[LogType] = js.Array(api, audit, authenticator, controllerManager, scheduler)
}

@js.native
sealed trait NodegroupIssueCode extends js.Any
object NodegroupIssueCode {
  val AutoScalingGroupNotFound = "AutoScalingGroupNotFound".asInstanceOf[NodegroupIssueCode]
  val AutoScalingGroupInvalidConfiguration = "AutoScalingGroupInvalidConfiguration".asInstanceOf[NodegroupIssueCode]
  val Ec2SecurityGroupNotFound = "Ec2SecurityGroupNotFound".asInstanceOf[NodegroupIssueCode]
  val Ec2SecurityGroupDeletionFailure = "Ec2SecurityGroupDeletionFailure".asInstanceOf[NodegroupIssueCode]
  val Ec2LaunchTemplateNotFound = "Ec2LaunchTemplateNotFound".asInstanceOf[NodegroupIssueCode]
  val Ec2LaunchTemplateVersionMismatch = "Ec2LaunchTemplateVersionMismatch".asInstanceOf[NodegroupIssueCode]
  val Ec2SubnetNotFound = "Ec2SubnetNotFound".asInstanceOf[NodegroupIssueCode]
  val Ec2SubnetInvalidConfiguration = "Ec2SubnetInvalidConfiguration".asInstanceOf[NodegroupIssueCode]
  val IamInstanceProfileNotFound = "IamInstanceProfileNotFound".asInstanceOf[NodegroupIssueCode]
  val IamLimitExceeded = "IamLimitExceeded".asInstanceOf[NodegroupIssueCode]
  val IamNodeRoleNotFound = "IamNodeRoleNotFound".asInstanceOf[NodegroupIssueCode]
  val NodeCreationFailure = "NodeCreationFailure".asInstanceOf[NodegroupIssueCode]
  val AsgInstanceLaunchFailures = "AsgInstanceLaunchFailures".asInstanceOf[NodegroupIssueCode]
  val InstanceLimitExceeded = "InstanceLimitExceeded".asInstanceOf[NodegroupIssueCode]
  val InsufficientFreeAddresses = "InsufficientFreeAddresses".asInstanceOf[NodegroupIssueCode]
  val AccessDenied = "AccessDenied".asInstanceOf[NodegroupIssueCode]
  val InternalFailure = "InternalFailure".asInstanceOf[NodegroupIssueCode]
  val ClusterUnreachable = "ClusterUnreachable".asInstanceOf[NodegroupIssueCode]
  val Ec2SubnetMissingIpv6Assignment = "Ec2SubnetMissingIpv6Assignment".asInstanceOf[NodegroupIssueCode]

  @inline def values: js.Array[NodegroupIssueCode] = js.Array(
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

@js.native
sealed trait NodegroupStatus extends js.Any
object NodegroupStatus {
  val CREATING = "CREATING".asInstanceOf[NodegroupStatus]
  val ACTIVE = "ACTIVE".asInstanceOf[NodegroupStatus]
  val UPDATING = "UPDATING".asInstanceOf[NodegroupStatus]
  val DELETING = "DELETING".asInstanceOf[NodegroupStatus]
  val CREATE_FAILED = "CREATE_FAILED".asInstanceOf[NodegroupStatus]
  val DELETE_FAILED = "DELETE_FAILED".asInstanceOf[NodegroupStatus]
  val DEGRADED = "DEGRADED".asInstanceOf[NodegroupStatus]

  @inline def values: js.Array[NodegroupStatus] = js.Array(CREATING, ACTIVE, UPDATING, DELETING, CREATE_FAILED, DELETE_FAILED, DEGRADED)
}

@js.native
sealed trait ResolveConflicts extends js.Any
object ResolveConflicts {
  val OVERWRITE = "OVERWRITE".asInstanceOf[ResolveConflicts]
  val NONE = "NONE".asInstanceOf[ResolveConflicts]
  val PRESERVE = "PRESERVE".asInstanceOf[ResolveConflicts]

  @inline def values: js.Array[ResolveConflicts] = js.Array(OVERWRITE, NONE, PRESERVE)
}

@js.native
sealed trait TaintEffect extends js.Any
object TaintEffect {
  val NO_SCHEDULE = "NO_SCHEDULE".asInstanceOf[TaintEffect]
  val NO_EXECUTE = "NO_EXECUTE".asInstanceOf[TaintEffect]
  val PREFER_NO_SCHEDULE = "PREFER_NO_SCHEDULE".asInstanceOf[TaintEffect]

  @inline def values: js.Array[TaintEffect] = js.Array(NO_SCHEDULE, NO_EXECUTE, PREFER_NO_SCHEDULE)
}

@js.native
sealed trait UpdateParamType extends js.Any
object UpdateParamType {
  val Version = "Version".asInstanceOf[UpdateParamType]
  val PlatformVersion = "PlatformVersion".asInstanceOf[UpdateParamType]
  val EndpointPrivateAccess = "EndpointPrivateAccess".asInstanceOf[UpdateParamType]
  val EndpointPublicAccess = "EndpointPublicAccess".asInstanceOf[UpdateParamType]
  val ClusterLogging = "ClusterLogging".asInstanceOf[UpdateParamType]
  val DesiredSize = "DesiredSize".asInstanceOf[UpdateParamType]
  val LabelsToAdd = "LabelsToAdd".asInstanceOf[UpdateParamType]
  val LabelsToRemove = "LabelsToRemove".asInstanceOf[UpdateParamType]
  val TaintsToAdd = "TaintsToAdd".asInstanceOf[UpdateParamType]
  val TaintsToRemove = "TaintsToRemove".asInstanceOf[UpdateParamType]
  val MaxSize = "MaxSize".asInstanceOf[UpdateParamType]
  val MinSize = "MinSize".asInstanceOf[UpdateParamType]
  val ReleaseVersion = "ReleaseVersion".asInstanceOf[UpdateParamType]
  val PublicAccessCidrs = "PublicAccessCidrs".asInstanceOf[UpdateParamType]
  val LaunchTemplateName = "LaunchTemplateName".asInstanceOf[UpdateParamType]
  val LaunchTemplateVersion = "LaunchTemplateVersion".asInstanceOf[UpdateParamType]
  val IdentityProviderConfig = "IdentityProviderConfig".asInstanceOf[UpdateParamType]
  val EncryptionConfig = "EncryptionConfig".asInstanceOf[UpdateParamType]
  val AddonVersion = "AddonVersion".asInstanceOf[UpdateParamType]
  val ServiceAccountRoleArn = "ServiceAccountRoleArn".asInstanceOf[UpdateParamType]
  val ResolveConflicts = "ResolveConflicts".asInstanceOf[UpdateParamType]
  val MaxUnavailable = "MaxUnavailable".asInstanceOf[UpdateParamType]
  val MaxUnavailablePercentage = "MaxUnavailablePercentage".asInstanceOf[UpdateParamType]

  @inline def values: js.Array[UpdateParamType] = js.Array(
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

@js.native
sealed trait UpdateStatus extends js.Any
object UpdateStatus {
  val InProgress = "InProgress".asInstanceOf[UpdateStatus]
  val Failed = "Failed".asInstanceOf[UpdateStatus]
  val Cancelled = "Cancelled".asInstanceOf[UpdateStatus]
  val Successful = "Successful".asInstanceOf[UpdateStatus]

  @inline def values: js.Array[UpdateStatus] = js.Array(InProgress, Failed, Cancelled, Successful)
}

@js.native
sealed trait UpdateType extends js.Any
object UpdateType {
  val VersionUpdate = "VersionUpdate".asInstanceOf[UpdateType]
  val EndpointAccessUpdate = "EndpointAccessUpdate".asInstanceOf[UpdateType]
  val LoggingUpdate = "LoggingUpdate".asInstanceOf[UpdateType]
  val ConfigUpdate = "ConfigUpdate".asInstanceOf[UpdateType]
  val AssociateIdentityProviderConfig = "AssociateIdentityProviderConfig".asInstanceOf[UpdateType]
  val DisassociateIdentityProviderConfig = "DisassociateIdentityProviderConfig".asInstanceOf[UpdateType]
  val AssociateEncryptionConfig = "AssociateEncryptionConfig".asInstanceOf[UpdateType]
  val AddonUpdate = "AddonUpdate".asInstanceOf[UpdateType]

  @inline def values: js.Array[UpdateType] = js.Array(
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

@js.native
sealed trait configStatus extends js.Any
object configStatus {
  val CREATING = "CREATING".asInstanceOf[configStatus]
  val DELETING = "DELETING".asInstanceOf[configStatus]
  val ACTIVE = "ACTIVE".asInstanceOf[configStatus]

  @inline def values: js.Array[configStatus] = js.Array(CREATING, DELETING, ACTIVE)
}
