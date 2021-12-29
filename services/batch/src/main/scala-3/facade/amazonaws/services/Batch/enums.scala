package facade.amazonaws.services.batch

import scalajs._

type ArrayJobDependency = "N_TO_N" | "SEQUENTIAL"
object ArrayJobDependency {
  val N_TO_N: "N_TO_N" = "N_TO_N"
  val SEQUENTIAL: "SEQUENTIAL" = "SEQUENTIAL"

  @inline def values = js.Array[ArrayJobDependency](N_TO_N, SEQUENTIAL)
}

type AssignPublicIp = "ENABLED" | "DISABLED"
object AssignPublicIp {
  val ENABLED: "ENABLED" = "ENABLED"
  val DISABLED: "DISABLED" = "DISABLED"

  @inline def values = js.Array[AssignPublicIp](ENABLED, DISABLED)
}

type CEState = "ENABLED" | "DISABLED"
object CEState {
  val ENABLED: "ENABLED" = "ENABLED"
  val DISABLED: "DISABLED" = "DISABLED"

  @inline def values = js.Array[CEState](ENABLED, DISABLED)
}

type CEStatus = "CREATING" | "UPDATING" | "DELETING" | "DELETED" | "VALID" | "INVALID"
object CEStatus {
  val CREATING: "CREATING" = "CREATING"
  val UPDATING: "UPDATING" = "UPDATING"
  val DELETING: "DELETING" = "DELETING"
  val DELETED: "DELETED" = "DELETED"
  val VALID: "VALID" = "VALID"
  val INVALID: "INVALID" = "INVALID"

  @inline def values = js.Array[CEStatus](CREATING, UPDATING, DELETING, DELETED, VALID, INVALID)
}

type CEType = "MANAGED" | "UNMANAGED"
object CEType {
  val MANAGED: "MANAGED" = "MANAGED"
  val UNMANAGED: "UNMANAGED" = "UNMANAGED"

  @inline def values = js.Array[CEType](MANAGED, UNMANAGED)
}

type CRAllocationStrategy = "BEST_FIT" | "BEST_FIT_PROGRESSIVE" | "SPOT_CAPACITY_OPTIMIZED"
object CRAllocationStrategy {
  val BEST_FIT: "BEST_FIT" = "BEST_FIT"
  val BEST_FIT_PROGRESSIVE: "BEST_FIT_PROGRESSIVE" = "BEST_FIT_PROGRESSIVE"
  val SPOT_CAPACITY_OPTIMIZED: "SPOT_CAPACITY_OPTIMIZED" = "SPOT_CAPACITY_OPTIMIZED"

  @inline def values = js.Array[CRAllocationStrategy](BEST_FIT, BEST_FIT_PROGRESSIVE, SPOT_CAPACITY_OPTIMIZED)
}

type CRType = "EC2" | "SPOT" | "FARGATE" | "FARGATE_SPOT"
object CRType {
  val EC2: "EC2" = "EC2"
  val SPOT: "SPOT" = "SPOT"
  val FARGATE: "FARGATE" = "FARGATE"
  val FARGATE_SPOT: "FARGATE_SPOT" = "FARGATE_SPOT"

  @inline def values = js.Array[CRType](EC2, SPOT, FARGATE, FARGATE_SPOT)
}

type DeviceCgroupPermission = "READ" | "WRITE" | "MKNOD"
object DeviceCgroupPermission {
  val READ: "READ" = "READ"
  val WRITE: "WRITE" = "WRITE"
  val MKNOD: "MKNOD" = "MKNOD"

  @inline def values = js.Array[DeviceCgroupPermission](READ, WRITE, MKNOD)
}

type EFSAuthorizationConfigIAM = "ENABLED" | "DISABLED"
object EFSAuthorizationConfigIAM {
  val ENABLED: "ENABLED" = "ENABLED"
  val DISABLED: "DISABLED" = "DISABLED"

  @inline def values = js.Array[EFSAuthorizationConfigIAM](ENABLED, DISABLED)
}

type EFSTransitEncryption = "ENABLED" | "DISABLED"
object EFSTransitEncryption {
  val ENABLED: "ENABLED" = "ENABLED"
  val DISABLED: "DISABLED" = "DISABLED"

  @inline def values = js.Array[EFSTransitEncryption](ENABLED, DISABLED)
}

type JQState = "ENABLED" | "DISABLED"
object JQState {
  val ENABLED: "ENABLED" = "ENABLED"
  val DISABLED: "DISABLED" = "DISABLED"

  @inline def values = js.Array[JQState](ENABLED, DISABLED)
}

type JQStatus = "CREATING" | "UPDATING" | "DELETING" | "DELETED" | "VALID" | "INVALID"
object JQStatus {
  val CREATING: "CREATING" = "CREATING"
  val UPDATING: "UPDATING" = "UPDATING"
  val DELETING: "DELETING" = "DELETING"
  val DELETED: "DELETED" = "DELETED"
  val VALID: "VALID" = "VALID"
  val INVALID: "INVALID" = "INVALID"

  @inline def values = js.Array[JQStatus](CREATING, UPDATING, DELETING, DELETED, VALID, INVALID)
}

type JobDefinitionType = "container" | "multinode"
object JobDefinitionType {
  val container: "container" = "container"
  val multinode: "multinode" = "multinode"

  @inline def values = js.Array[JobDefinitionType](container, multinode)
}

type JobStatus = "SUBMITTED" | "PENDING" | "RUNNABLE" | "STARTING" | "RUNNING" | "SUCCEEDED" | "FAILED"
object JobStatus {
  val SUBMITTED: "SUBMITTED" = "SUBMITTED"
  val PENDING: "PENDING" = "PENDING"
  val RUNNABLE: "RUNNABLE" = "RUNNABLE"
  val STARTING: "STARTING" = "STARTING"
  val RUNNING: "RUNNING" = "RUNNING"
  val SUCCEEDED: "SUCCEEDED" = "SUCCEEDED"
  val FAILED: "FAILED" = "FAILED"

  @inline def values = js.Array[JobStatus](SUBMITTED, PENDING, RUNNABLE, STARTING, RUNNING, SUCCEEDED, FAILED)
}

type LogDriver = "json-file" | "syslog" | "journald" | "gelf" | "fluentd" | "awslogs" | "splunk"
object LogDriver {
  val `json-file`: "json-file" = "json-file"
  val syslog: "syslog" = "syslog"
  val journald: "journald" = "journald"
  val gelf: "gelf" = "gelf"
  val fluentd: "fluentd" = "fluentd"
  val awslogs: "awslogs" = "awslogs"
  val splunk: "splunk" = "splunk"

  @inline def values = js.Array[LogDriver](`json-file`, syslog, journald, gelf, fluentd, awslogs, splunk)
}

type PlatformCapability = "EC2" | "FARGATE"
object PlatformCapability {
  val EC2: "EC2" = "EC2"
  val FARGATE: "FARGATE" = "FARGATE"

  @inline def values = js.Array[PlatformCapability](EC2, FARGATE)
}

type ResourceType = "GPU" | "VCPU" | "MEMORY"
object ResourceType {
  val GPU: "GPU" = "GPU"
  val VCPU: "VCPU" = "VCPU"
  val MEMORY: "MEMORY" = "MEMORY"

  @inline def values = js.Array[ResourceType](GPU, VCPU, MEMORY)
}

type RetryAction = "RETRY" | "EXIT"
object RetryAction {
  val RETRY: "RETRY" = "RETRY"
  val EXIT: "EXIT" = "EXIT"

  @inline def values = js.Array[RetryAction](RETRY, EXIT)
}
