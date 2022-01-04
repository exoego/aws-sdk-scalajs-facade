package facade.amazonaws.services.batch

import scalajs.js

type ArrayJobDependency = "N_TO_N" | "SEQUENTIAL"
object ArrayJobDependency {
  inline val N_TO_N: "N_TO_N" = "N_TO_N"
  inline val SEQUENTIAL: "SEQUENTIAL" = "SEQUENTIAL"

  inline def values: js.Array[ArrayJobDependency] = js.Array(N_TO_N, SEQUENTIAL)
}

type AssignPublicIp = "ENABLED" | "DISABLED"
object AssignPublicIp {
  inline val ENABLED: "ENABLED" = "ENABLED"
  inline val DISABLED: "DISABLED" = "DISABLED"

  inline def values: js.Array[AssignPublicIp] = js.Array(ENABLED, DISABLED)
}

type CEState = "ENABLED" | "DISABLED"
object CEState {
  inline val ENABLED: "ENABLED" = "ENABLED"
  inline val DISABLED: "DISABLED" = "DISABLED"

  inline def values: js.Array[CEState] = js.Array(ENABLED, DISABLED)
}

type CEStatus = "CREATING" | "UPDATING" | "DELETING" | "DELETED" | "VALID" | "INVALID"
object CEStatus {
  inline val CREATING: "CREATING" = "CREATING"
  inline val UPDATING: "UPDATING" = "UPDATING"
  inline val DELETING: "DELETING" = "DELETING"
  inline val DELETED: "DELETED" = "DELETED"
  inline val VALID: "VALID" = "VALID"
  inline val INVALID: "INVALID" = "INVALID"

  inline def values: js.Array[CEStatus] = js.Array(CREATING, UPDATING, DELETING, DELETED, VALID, INVALID)
}

type CEType = "MANAGED" | "UNMANAGED"
object CEType {
  inline val MANAGED: "MANAGED" = "MANAGED"
  inline val UNMANAGED: "UNMANAGED" = "UNMANAGED"

  inline def values: js.Array[CEType] = js.Array(MANAGED, UNMANAGED)
}

type CRAllocationStrategy = "BEST_FIT" | "BEST_FIT_PROGRESSIVE" | "SPOT_CAPACITY_OPTIMIZED"
object CRAllocationStrategy {
  inline val BEST_FIT: "BEST_FIT" = "BEST_FIT"
  inline val BEST_FIT_PROGRESSIVE: "BEST_FIT_PROGRESSIVE" = "BEST_FIT_PROGRESSIVE"
  inline val SPOT_CAPACITY_OPTIMIZED: "SPOT_CAPACITY_OPTIMIZED" = "SPOT_CAPACITY_OPTIMIZED"

  inline def values: js.Array[CRAllocationStrategy] = js.Array(BEST_FIT, BEST_FIT_PROGRESSIVE, SPOT_CAPACITY_OPTIMIZED)
}

type CRType = "EC2" | "SPOT" | "FARGATE" | "FARGATE_SPOT"
object CRType {
  inline val EC2: "EC2" = "EC2"
  inline val SPOT: "SPOT" = "SPOT"
  inline val FARGATE: "FARGATE" = "FARGATE"
  inline val FARGATE_SPOT: "FARGATE_SPOT" = "FARGATE_SPOT"

  inline def values: js.Array[CRType] = js.Array(EC2, SPOT, FARGATE, FARGATE_SPOT)
}

type DeviceCgroupPermission = "READ" | "WRITE" | "MKNOD"
object DeviceCgroupPermission {
  inline val READ: "READ" = "READ"
  inline val WRITE: "WRITE" = "WRITE"
  inline val MKNOD: "MKNOD" = "MKNOD"

  inline def values: js.Array[DeviceCgroupPermission] = js.Array(READ, WRITE, MKNOD)
}

type EFSAuthorizationConfigIAM = "ENABLED" | "DISABLED"
object EFSAuthorizationConfigIAM {
  inline val ENABLED: "ENABLED" = "ENABLED"
  inline val DISABLED: "DISABLED" = "DISABLED"

  inline def values: js.Array[EFSAuthorizationConfigIAM] = js.Array(ENABLED, DISABLED)
}

type EFSTransitEncryption = "ENABLED" | "DISABLED"
object EFSTransitEncryption {
  inline val ENABLED: "ENABLED" = "ENABLED"
  inline val DISABLED: "DISABLED" = "DISABLED"

  inline def values: js.Array[EFSTransitEncryption] = js.Array(ENABLED, DISABLED)
}

type JQState = "ENABLED" | "DISABLED"
object JQState {
  inline val ENABLED: "ENABLED" = "ENABLED"
  inline val DISABLED: "DISABLED" = "DISABLED"

  inline def values: js.Array[JQState] = js.Array(ENABLED, DISABLED)
}

type JQStatus = "CREATING" | "UPDATING" | "DELETING" | "DELETED" | "VALID" | "INVALID"
object JQStatus {
  inline val CREATING: "CREATING" = "CREATING"
  inline val UPDATING: "UPDATING" = "UPDATING"
  inline val DELETING: "DELETING" = "DELETING"
  inline val DELETED: "DELETED" = "DELETED"
  inline val VALID: "VALID" = "VALID"
  inline val INVALID: "INVALID" = "INVALID"

  inline def values: js.Array[JQStatus] = js.Array(CREATING, UPDATING, DELETING, DELETED, VALID, INVALID)
}

type JobDefinitionType = "container" | "multinode"
object JobDefinitionType {
  inline val container: "container" = "container"
  inline val multinode: "multinode" = "multinode"

  inline def values: js.Array[JobDefinitionType] = js.Array(container, multinode)
}

type JobStatus = "SUBMITTED" | "PENDING" | "RUNNABLE" | "STARTING" | "RUNNING" | "SUCCEEDED" | "FAILED"
object JobStatus {
  inline val SUBMITTED: "SUBMITTED" = "SUBMITTED"
  inline val PENDING: "PENDING" = "PENDING"
  inline val RUNNABLE: "RUNNABLE" = "RUNNABLE"
  inline val STARTING: "STARTING" = "STARTING"
  inline val RUNNING: "RUNNING" = "RUNNING"
  inline val SUCCEEDED: "SUCCEEDED" = "SUCCEEDED"
  inline val FAILED: "FAILED" = "FAILED"

  inline def values: js.Array[JobStatus] = js.Array(SUBMITTED, PENDING, RUNNABLE, STARTING, RUNNING, SUCCEEDED, FAILED)
}

type LogDriver = "json-file" | "syslog" | "journald" | "gelf" | "fluentd" | "awslogs" | "splunk"
object LogDriver {
  inline val `json-file`: "json-file" = "json-file"
  inline val syslog: "syslog" = "syslog"
  inline val journald: "journald" = "journald"
  inline val gelf: "gelf" = "gelf"
  inline val fluentd: "fluentd" = "fluentd"
  inline val awslogs: "awslogs" = "awslogs"
  inline val splunk: "splunk" = "splunk"

  inline def values: js.Array[LogDriver] = js.Array(`json-file`, syslog, journald, gelf, fluentd, awslogs, splunk)
}

type PlatformCapability = "EC2" | "FARGATE"
object PlatformCapability {
  inline val EC2: "EC2" = "EC2"
  inline val FARGATE: "FARGATE" = "FARGATE"

  inline def values: js.Array[PlatformCapability] = js.Array(EC2, FARGATE)
}

type ResourceType = "GPU" | "VCPU" | "MEMORY"
object ResourceType {
  inline val GPU: "GPU" = "GPU"
  inline val VCPU: "VCPU" = "VCPU"
  inline val MEMORY: "MEMORY" = "MEMORY"

  inline def values: js.Array[ResourceType] = js.Array(GPU, VCPU, MEMORY)
}

type RetryAction = "RETRY" | "EXIT"
object RetryAction {
  inline val RETRY: "RETRY" = "RETRY"
  inline val EXIT: "EXIT" = "EXIT"

  inline def values: js.Array[RetryAction] = js.Array(RETRY, EXIT)
}
