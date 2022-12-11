package facade.amazonaws.services.codecatalyst

import scalajs.js

type ComparisonOperator = "EQ" | "GT" | "GE" | "LT" | "LE"
object ComparisonOperator {
  inline val EQ: "EQ" = "EQ"
  inline val GT: "GT" = "GT"
  inline val GE: "GE" = "GE"
  inline val LT: "LT" = "LT"
  inline val LE: "LE" = "LE"

  inline def values: js.Array[ComparisonOperator] = js.Array(EQ, GT, GE, LT, LE)
}

type DevEnvironmentSessionType = "SSM" | "SSH"
object DevEnvironmentSessionType {
  inline val SSM: "SSM" = "SSM"
  inline val SSH: "SSH" = "SSH"

  inline def values: js.Array[DevEnvironmentSessionType] = js.Array(SSM, SSH)
}

type DevEnvironmentStatus = "PENDING" | "RUNNING" | "STARTING" | "STOPPING" | "STOPPED" | "FAILED" | "DELETING" | "DELETED"
object DevEnvironmentStatus {
  inline val PENDING: "PENDING" = "PENDING"
  inline val RUNNING: "RUNNING" = "RUNNING"
  inline val STARTING: "STARTING" = "STARTING"
  inline val STOPPING: "STOPPING" = "STOPPING"
  inline val STOPPED: "STOPPED" = "STOPPED"
  inline val FAILED: "FAILED" = "FAILED"
  inline val DELETING: "DELETING" = "DELETING"
  inline val DELETED: "DELETED" = "DELETED"

  inline def values: js.Array[DevEnvironmentStatus] = js.Array(PENDING, RUNNING, STARTING, STOPPING, STOPPED, FAILED, DELETING, DELETED)
}

type FilterKey = "hasAccessTo"
object FilterKey {
  inline val hasAccessTo: "hasAccessTo" = "hasAccessTo"

  inline def values: js.Array[FilterKey] = js.Array(hasAccessTo)
}

type InstanceType = "dev.standard1.small" | "dev.standard1.medium" | "dev.standard1.large" | "dev.standard1.xlarge"
object InstanceType {
  inline val `dev.standard1.small`: "dev.standard1.small" = "dev.standard1.small"
  inline val `dev.standard1.medium`: "dev.standard1.medium" = "dev.standard1.medium"
  inline val `dev.standard1.large`: "dev.standard1.large" = "dev.standard1.large"
  inline val `dev.standard1.xlarge`: "dev.standard1.xlarge" = "dev.standard1.xlarge"

  inline def values: js.Array[InstanceType] = js.Array(`dev.standard1.small`, `dev.standard1.medium`, `dev.standard1.large`, `dev.standard1.xlarge`)
}

type OperationType = "READONLY" | "MUTATION"
object OperationType {
  inline val READONLY: "READONLY" = "READONLY"
  inline val MUTATION: "MUTATION" = "MUTATION"

  inline def values: js.Array[OperationType] = js.Array(READONLY, MUTATION)
}

type UserType = "USER" | "AWS_ACCOUNT" | "UNKNOWN"
object UserType {
  inline val USER: "USER" = "USER"
  inline val AWS_ACCOUNT: "AWS_ACCOUNT" = "AWS_ACCOUNT"
  inline val UNKNOWN: "UNKNOWN" = "UNKNOWN"

  inline def values: js.Array[UserType] = js.Array(USER, AWS_ACCOUNT, UNKNOWN)
}
