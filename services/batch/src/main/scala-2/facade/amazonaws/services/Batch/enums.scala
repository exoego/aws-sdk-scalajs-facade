package facade.amazonaws.services.batch

import scalajs.js

@js.native
sealed trait ArrayJobDependency extends js.Any
object ArrayJobDependency {
  val N_TO_N = "N_TO_N".asInstanceOf[ArrayJobDependency]
  val SEQUENTIAL = "SEQUENTIAL".asInstanceOf[ArrayJobDependency]

  @inline def values: js.Array[ArrayJobDependency] = js.Array(N_TO_N, SEQUENTIAL)
}

@js.native
sealed trait AssignPublicIp extends js.Any
object AssignPublicIp {
  val ENABLED = "ENABLED".asInstanceOf[AssignPublicIp]
  val DISABLED = "DISABLED".asInstanceOf[AssignPublicIp]

  @inline def values: js.Array[AssignPublicIp] = js.Array(ENABLED, DISABLED)
}

@js.native
sealed trait CEState extends js.Any
object CEState {
  val ENABLED = "ENABLED".asInstanceOf[CEState]
  val DISABLED = "DISABLED".asInstanceOf[CEState]

  @inline def values: js.Array[CEState] = js.Array(ENABLED, DISABLED)
}

@js.native
sealed trait CEStatus extends js.Any
object CEStatus {
  val CREATING = "CREATING".asInstanceOf[CEStatus]
  val UPDATING = "UPDATING".asInstanceOf[CEStatus]
  val DELETING = "DELETING".asInstanceOf[CEStatus]
  val DELETED = "DELETED".asInstanceOf[CEStatus]
  val VALID = "VALID".asInstanceOf[CEStatus]
  val INVALID = "INVALID".asInstanceOf[CEStatus]

  @inline def values: js.Array[CEStatus] = js.Array(CREATING, UPDATING, DELETING, DELETED, VALID, INVALID)
}

@js.native
sealed trait CEType extends js.Any
object CEType {
  val MANAGED = "MANAGED".asInstanceOf[CEType]
  val UNMANAGED = "UNMANAGED".asInstanceOf[CEType]

  @inline def values: js.Array[CEType] = js.Array(MANAGED, UNMANAGED)
}

@js.native
sealed trait CRAllocationStrategy extends js.Any
object CRAllocationStrategy {
  val BEST_FIT = "BEST_FIT".asInstanceOf[CRAllocationStrategy]
  val BEST_FIT_PROGRESSIVE = "BEST_FIT_PROGRESSIVE".asInstanceOf[CRAllocationStrategy]
  val SPOT_CAPACITY_OPTIMIZED = "SPOT_CAPACITY_OPTIMIZED".asInstanceOf[CRAllocationStrategy]

  @inline def values: js.Array[CRAllocationStrategy] = js.Array(BEST_FIT, BEST_FIT_PROGRESSIVE, SPOT_CAPACITY_OPTIMIZED)
}

@js.native
sealed trait CRType extends js.Any
object CRType {
  val EC2 = "EC2".asInstanceOf[CRType]
  val SPOT = "SPOT".asInstanceOf[CRType]
  val FARGATE = "FARGATE".asInstanceOf[CRType]
  val FARGATE_SPOT = "FARGATE_SPOT".asInstanceOf[CRType]

  @inline def values: js.Array[CRType] = js.Array(EC2, SPOT, FARGATE, FARGATE_SPOT)
}

@js.native
sealed trait DeviceCgroupPermission extends js.Any
object DeviceCgroupPermission {
  val READ = "READ".asInstanceOf[DeviceCgroupPermission]
  val WRITE = "WRITE".asInstanceOf[DeviceCgroupPermission]
  val MKNOD = "MKNOD".asInstanceOf[DeviceCgroupPermission]

  @inline def values: js.Array[DeviceCgroupPermission] = js.Array(READ, WRITE, MKNOD)
}

@js.native
sealed trait EFSAuthorizationConfigIAM extends js.Any
object EFSAuthorizationConfigIAM {
  val ENABLED = "ENABLED".asInstanceOf[EFSAuthorizationConfigIAM]
  val DISABLED = "DISABLED".asInstanceOf[EFSAuthorizationConfigIAM]

  @inline def values: js.Array[EFSAuthorizationConfigIAM] = js.Array(ENABLED, DISABLED)
}

@js.native
sealed trait EFSTransitEncryption extends js.Any
object EFSTransitEncryption {
  val ENABLED = "ENABLED".asInstanceOf[EFSTransitEncryption]
  val DISABLED = "DISABLED".asInstanceOf[EFSTransitEncryption]

  @inline def values: js.Array[EFSTransitEncryption] = js.Array(ENABLED, DISABLED)
}

@js.native
sealed trait JQState extends js.Any
object JQState {
  val ENABLED = "ENABLED".asInstanceOf[JQState]
  val DISABLED = "DISABLED".asInstanceOf[JQState]

  @inline def values: js.Array[JQState] = js.Array(ENABLED, DISABLED)
}

@js.native
sealed trait JQStatus extends js.Any
object JQStatus {
  val CREATING = "CREATING".asInstanceOf[JQStatus]
  val UPDATING = "UPDATING".asInstanceOf[JQStatus]
  val DELETING = "DELETING".asInstanceOf[JQStatus]
  val DELETED = "DELETED".asInstanceOf[JQStatus]
  val VALID = "VALID".asInstanceOf[JQStatus]
  val INVALID = "INVALID".asInstanceOf[JQStatus]

  @inline def values: js.Array[JQStatus] = js.Array(CREATING, UPDATING, DELETING, DELETED, VALID, INVALID)
}

@js.native
sealed trait JobDefinitionType extends js.Any
object JobDefinitionType {
  val container = "container".asInstanceOf[JobDefinitionType]
  val multinode = "multinode".asInstanceOf[JobDefinitionType]

  @inline def values: js.Array[JobDefinitionType] = js.Array(container, multinode)
}

@js.native
sealed trait JobStatus extends js.Any
object JobStatus {
  val SUBMITTED = "SUBMITTED".asInstanceOf[JobStatus]
  val PENDING = "PENDING".asInstanceOf[JobStatus]
  val RUNNABLE = "RUNNABLE".asInstanceOf[JobStatus]
  val STARTING = "STARTING".asInstanceOf[JobStatus]
  val RUNNING = "RUNNING".asInstanceOf[JobStatus]
  val SUCCEEDED = "SUCCEEDED".asInstanceOf[JobStatus]
  val FAILED = "FAILED".asInstanceOf[JobStatus]

  @inline def values: js.Array[JobStatus] = js.Array(SUBMITTED, PENDING, RUNNABLE, STARTING, RUNNING, SUCCEEDED, FAILED)
}

@js.native
sealed trait LogDriver extends js.Any
object LogDriver {
  val `json-file` = "json-file".asInstanceOf[LogDriver]
  val syslog = "syslog".asInstanceOf[LogDriver]
  val journald = "journald".asInstanceOf[LogDriver]
  val gelf = "gelf".asInstanceOf[LogDriver]
  val fluentd = "fluentd".asInstanceOf[LogDriver]
  val awslogs = "awslogs".asInstanceOf[LogDriver]
  val splunk = "splunk".asInstanceOf[LogDriver]

  @inline def values: js.Array[LogDriver] = js.Array(`json-file`, syslog, journald, gelf, fluentd, awslogs, splunk)
}

@js.native
sealed trait PlatformCapability extends js.Any
object PlatformCapability {
  val EC2 = "EC2".asInstanceOf[PlatformCapability]
  val FARGATE = "FARGATE".asInstanceOf[PlatformCapability]

  @inline def values: js.Array[PlatformCapability] = js.Array(EC2, FARGATE)
}

@js.native
sealed trait ResourceType extends js.Any
object ResourceType {
  val GPU = "GPU".asInstanceOf[ResourceType]
  val VCPU = "VCPU".asInstanceOf[ResourceType]
  val MEMORY = "MEMORY".asInstanceOf[ResourceType]

  @inline def values: js.Array[ResourceType] = js.Array(GPU, VCPU, MEMORY)
}

@js.native
sealed trait RetryAction extends js.Any
object RetryAction {
  val RETRY = "RETRY".asInstanceOf[RetryAction]
  val EXIT = "EXIT".asInstanceOf[RetryAction]

  @inline def values: js.Array[RetryAction] = js.Array(RETRY, EXIT)
}
