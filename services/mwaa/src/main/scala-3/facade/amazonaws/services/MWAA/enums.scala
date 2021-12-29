package facade.amazonaws.services.mwaa

import scalajs._

type EnvironmentStatus = "CREATING" | "CREATE_FAILED" | "AVAILABLE" | "UPDATING" | "DELETING" | "DELETED" | "UNAVAILABLE" | "UPDATE_FAILED"
object EnvironmentStatus {
  val CREATING: "CREATING" = "CREATING"
  val CREATE_FAILED: "CREATE_FAILED" = "CREATE_FAILED"
  val AVAILABLE: "AVAILABLE" = "AVAILABLE"
  val UPDATING: "UPDATING" = "UPDATING"
  val DELETING: "DELETING" = "DELETING"
  val DELETED: "DELETED" = "DELETED"
  val UNAVAILABLE: "UNAVAILABLE" = "UNAVAILABLE"
  val UPDATE_FAILED: "UPDATE_FAILED" = "UPDATE_FAILED"

  @inline def values = js.Array[EnvironmentStatus](CREATING, CREATE_FAILED, AVAILABLE, UPDATING, DELETING, DELETED, UNAVAILABLE, UPDATE_FAILED)
}

type LoggingLevel = "CRITICAL" | "ERROR" | "WARNING" | "INFO" | "DEBUG"
object LoggingLevel {
  val CRITICAL: "CRITICAL" = "CRITICAL"
  val ERROR: "ERROR" = "ERROR"
  val WARNING: "WARNING" = "WARNING"
  val INFO: "INFO" = "INFO"
  val DEBUG: "DEBUG" = "DEBUG"

  @inline def values = js.Array[LoggingLevel](CRITICAL, ERROR, WARNING, INFO, DEBUG)
}

type Unit = "Seconds" | "Microseconds" | "Milliseconds" | "Bytes" | "Kilobytes" | "Megabytes" | "Gigabytes" | "Terabytes" | "Bits" | "Kilobits" | "Megabits" | "Gigabits" | "Terabits" | "Percent" | "Count" | "Bytes/Second" | "Kilobytes/Second" | "Megabytes/Second" | "Gigabytes/Second" | "Terabytes/Second" | "Bits/Second" | "Kilobits/Second" | "Megabits/Second" | "Gigabits/Second" | "Terabits/Second" | "Count/Second" | "None"
object Unit {
  val Seconds: "Seconds" = "Seconds"
  val Microseconds: "Microseconds" = "Microseconds"
  val Milliseconds: "Milliseconds" = "Milliseconds"
  val Bytes: "Bytes" = "Bytes"
  val Kilobytes: "Kilobytes" = "Kilobytes"
  val Megabytes: "Megabytes" = "Megabytes"
  val Gigabytes: "Gigabytes" = "Gigabytes"
  val Terabytes: "Terabytes" = "Terabytes"
  val Bits: "Bits" = "Bits"
  val Kilobits: "Kilobits" = "Kilobits"
  val Megabits: "Megabits" = "Megabits"
  val Gigabits: "Gigabits" = "Gigabits"
  val Terabits: "Terabits" = "Terabits"
  val Percent: "Percent" = "Percent"
  val Count: "Count" = "Count"
  val `Bytes/Second`: "Bytes/Second" = "Bytes/Second"
  val `Kilobytes/Second`: "Kilobytes/Second" = "Kilobytes/Second"
  val `Megabytes/Second`: "Megabytes/Second" = "Megabytes/Second"
  val `Gigabytes/Second`: "Gigabytes/Second" = "Gigabytes/Second"
  val `Terabytes/Second`: "Terabytes/Second" = "Terabytes/Second"
  val `Bits/Second`: "Bits/Second" = "Bits/Second"
  val `Kilobits/Second`: "Kilobits/Second" = "Kilobits/Second"
  val `Megabits/Second`: "Megabits/Second" = "Megabits/Second"
  val `Gigabits/Second`: "Gigabits/Second" = "Gigabits/Second"
  val `Terabits/Second`: "Terabits/Second" = "Terabits/Second"
  val `Count/Second`: "Count/Second" = "Count/Second"
  val None: "None" = "None"

  @inline def values = js.Array[Unit](
    Seconds,
    Microseconds,
    Milliseconds,
    Bytes,
    Kilobytes,
    Megabytes,
    Gigabytes,
    Terabytes,
    Bits,
    Kilobits,
    Megabits,
    Gigabits,
    Terabits,
    Percent,
    Count,
    `Bytes/Second`,
    `Kilobytes/Second`,
    `Megabytes/Second`,
    `Gigabytes/Second`,
    `Terabytes/Second`,
    `Bits/Second`,
    `Kilobits/Second`,
    `Megabits/Second`,
    `Gigabits/Second`,
    `Terabits/Second`,
    `Count/Second`,
    None
  )
}

type UpdateStatus = "SUCCESS" | "PENDING" | "FAILED"
object UpdateStatus {
  val SUCCESS: "SUCCESS" = "SUCCESS"
  val PENDING: "PENDING" = "PENDING"
  val FAILED: "FAILED" = "FAILED"

  @inline def values = js.Array[UpdateStatus](SUCCESS, PENDING, FAILED)
}

type WebserverAccessMode = "PRIVATE_ONLY" | "PUBLIC_ONLY"
object WebserverAccessMode {
  val PRIVATE_ONLY: "PRIVATE_ONLY" = "PRIVATE_ONLY"
  val PUBLIC_ONLY: "PUBLIC_ONLY" = "PUBLIC_ONLY"

  @inline def values = js.Array[WebserverAccessMode](PRIVATE_ONLY, PUBLIC_ONLY)
}
