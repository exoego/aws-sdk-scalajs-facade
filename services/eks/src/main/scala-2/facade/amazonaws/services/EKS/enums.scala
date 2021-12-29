package facade.amazonaws.services.eks

import scalajs._
import scala.scalajs.js.|

@js.native
sealed trait AMITypes extends js.Any
object AMITypes {
  val AL2_x86_64 = "AL2_x86_64".asInstanceOf[AMITypes]
  val AL2_x86_64_GPU = "AL2_x86_64_GPU".asInstanceOf[AMITypes]
  val AL2_ARM_64 = "AL2_ARM_64".asInstanceOf[AMITypes]

  @inline def values = js.Array(AL2_x86_64, AL2_x86_64_GPU, AL2_ARM_64)
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

  @inline def values = js.Array(AccessDenied, InternalFailure, ClusterUnreachable, InsufficientNumberOfReplicas, ConfigurationConflict, AdmissionRequestDenied)
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

  @inline def values = js.Array(CREATING, ACTIVE, CREATE_FAILED, UPDATING, DELETING, DELETE_FAILED, DEGRADED)
}

@js.native
sealed trait CapacityTypes extends js.Any
object CapacityTypes {
  val ON_DEMAND = "ON_DEMAND".asInstanceOf[CapacityTypes]
  val SPOT = "SPOT".asInstanceOf[CapacityTypes]

  @inline def values = js.Array(ON_DEMAND, SPOT)
}

@js.native
sealed trait ClusterStatus extends js.Any
object ClusterStatus {
  val CREATING = "CREATING".asInstanceOf[ClusterStatus]
  val ACTIVE = "ACTIVE".asInstanceOf[ClusterStatus]
  val DELETING = "DELETING".asInstanceOf[ClusterStatus]
  val FAILED = "FAILED".asInstanceOf[ClusterStatus]
  val UPDATING = "UPDATING".asInstanceOf[ClusterStatus]

  @inline def values = js.Array(CREATING, ACTIVE, DELETING, FAILED, UPDATING)
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

  @inline def values = js.Array(SubnetNotFound, SecurityGroupNotFound, EniLimitReached, IpNotAvailable, AccessDenied, OperationNotPermitted, VpcIdNotFound, Unknown, NodeCreationFailure, PodEvictionFailure, InsufficientFreeAddresses, ClusterUnreachable, InsufficientNumberOfReplicas, ConfigurationConflict, AdmissionRequestDenied)
}

@js.native
sealed trait FargateProfileStatus extends js.Any
object FargateProfileStatus {
  val CREATING = "CREATING".asInstanceOf[FargateProfileStatus]
  val ACTIVE = "ACTIVE".asInstanceOf[FargateProfileStatus]
  val DELETING = "DELETING".asInstanceOf[FargateProfileStatus]
  val CREATE_FAILED = "CREATE_FAILED".asInstanceOf[FargateProfileStatus]
  val DELETE_FAILED = "DELETE_FAILED".asInstanceOf[FargateProfileStatus]

  @inline def values = js.Array(CREATING, ACTIVE, DELETING, CREATE_FAILED, DELETE_FAILED)
}

@js.native
sealed trait LogType extends js.Any
object LogType {
  val api = "api".asInstanceOf[LogType]
  val audit = "audit".asInstanceOf[LogType]
  val authenticator = "authenticator".asInstanceOf[LogType]
  val controllerManager = "controllerManager".asInstanceOf[LogType]
  val scheduler = "scheduler".asInstanceOf[LogType]

  @inline def values = js.Array(api, audit, authenticator, controllerManager, scheduler)
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

  @inline def values = js.Array(AutoScalingGroupNotFound, AutoScalingGroupInvalidConfiguration, Ec2SecurityGroupNotFound, Ec2SecurityGroupDeletionFailure, Ec2LaunchTemplateNotFound, Ec2LaunchTemplateVersionMismatch, Ec2SubnetNotFound, Ec2SubnetInvalidConfiguration, IamInstanceProfileNotFound, IamLimitExceeded, IamNodeRoleNotFound, NodeCreationFailure, AsgInstanceLaunchFailures, InstanceLimitExceeded, InsufficientFreeAddresses, AccessDenied, InternalFailure, ClusterUnreachable)
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

  @inline def values = js.Array(CREATING, ACTIVE, UPDATING, DELETING, CREATE_FAILED, DELETE_FAILED, DEGRADED)
}

@js.native
sealed trait ResolveConflicts extends js.Any
object ResolveConflicts {
  val OVERWRITE = "OVERWRITE".asInstanceOf[ResolveConflicts]
  val NONE = "NONE".asInstanceOf[ResolveConflicts]

  @inline def values = js.Array(OVERWRITE, NONE)
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
  val MaxSize = "MaxSize".asInstanceOf[UpdateParamType]
  val MinSize = "MinSize".asInstanceOf[UpdateParamType]
  val ReleaseVersion = "ReleaseVersion".asInstanceOf[UpdateParamType]
  val PublicAccessCidrs = "PublicAccessCidrs".asInstanceOf[UpdateParamType]
  val IdentityProviderConfig = "IdentityProviderConfig".asInstanceOf[UpdateParamType]
  val EncryptionConfig = "EncryptionConfig".asInstanceOf[UpdateParamType]
  val AddonVersion = "AddonVersion".asInstanceOf[UpdateParamType]
  val ServiceAccountRoleArn = "ServiceAccountRoleArn".asInstanceOf[UpdateParamType]
  val ResolveConflicts = "ResolveConflicts".asInstanceOf[UpdateParamType]

  @inline def values = js.Array(Version, PlatformVersion, EndpointPrivateAccess, EndpointPublicAccess, ClusterLogging, DesiredSize, LabelsToAdd, LabelsToRemove, MaxSize, MinSize, ReleaseVersion, PublicAccessCidrs, IdentityProviderConfig, EncryptionConfig, AddonVersion, ServiceAccountRoleArn, ResolveConflicts)
}

@js.native
sealed trait UpdateStatus extends js.Any
object UpdateStatus {
  val InProgress = "InProgress".asInstanceOf[UpdateStatus]
  val Failed = "Failed".asInstanceOf[UpdateStatus]
  val Cancelled = "Cancelled".asInstanceOf[UpdateStatus]
  val Successful = "Successful".asInstanceOf[UpdateStatus]

  @inline def values = js.Array(InProgress, Failed, Cancelled, Successful)
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

  @inline def values = js.Array(VersionUpdate, EndpointAccessUpdate, LoggingUpdate, ConfigUpdate, AssociateIdentityProviderConfig, DisassociateIdentityProviderConfig, AssociateEncryptionConfig, AddonUpdate)
}

@js.native
sealed trait configStatus extends js.Any
object configStatus {
  val CREATING = "CREATING".asInstanceOf[configStatus]
  val DELETING = "DELETING".asInstanceOf[configStatus]
  val ACTIVE = "ACTIVE".asInstanceOf[configStatus]

  @inline def values = js.Array(CREATING, DELETING, ACTIVE)
}

