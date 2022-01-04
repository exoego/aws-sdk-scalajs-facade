package facade.amazonaws.services.mwaa

import scalajs.js

type EnvironmentStatus = "CREATING" | "CREATE_FAILED" | "AVAILABLE" | "UPDATING" | "DELETING" | "DELETED" | "UNAVAILABLE" | "UPDATE_FAILED"
object EnvironmentStatus {
  inline val CREATING: "CREATING" = "CREATING"
  inline val CREATE_FAILED: "CREATE_FAILED" = "CREATE_FAILED"
  inline val AVAILABLE: "AVAILABLE" = "AVAILABLE"
  inline val UPDATING: "UPDATING" = "UPDATING"
  inline val DELETING: "DELETING" = "DELETING"
  inline val DELETED: "DELETED" = "DELETED"
  inline val UNAVAILABLE: "UNAVAILABLE" = "UNAVAILABLE"
  inline val UPDATE_FAILED: "UPDATE_FAILED" = "UPDATE_FAILED"

  inline def values: js.Array[EnvironmentStatus] = js.Array(CREATING, CREATE_FAILED, AVAILABLE, UPDATING, DELETING, DELETED, UNAVAILABLE, UPDATE_FAILED)
}

type LoggingLevel = "CRITICAL" | "ERROR" | "WARNING" | "INFO" | "DEBUG"
object LoggingLevel {
  inline val CRITICAL: "CRITICAL" = "CRITICAL"
  inline val ERROR: "ERROR" = "ERROR"
  inline val WARNING: "WARNING" = "WARNING"
  inline val INFO: "INFO" = "INFO"
  inline val DEBUG: "DEBUG" = "DEBUG"

  inline def values: js.Array[LoggingLevel] = js.Array(CRITICAL, ERROR, WARNING, INFO, DEBUG)
}

type Unit = "Seconds" | "Microseconds" | "Milliseconds" | "Bytes" | "Kilobytes" | "Megabytes" | "Gigabytes" | "Terabytes" | "Bits" | "Kilobits" | "Megabits" | "Gigabits" | "Terabits" | "Percent" | "Count" | "Bytes/Second" | "Kilobytes/Second" | "Megabytes/Second" | "Gigabytes/Second" | "Terabytes/Second" | "Bits/Second" | "Kilobits/Second" | "Megabits/Second" | "Gigabits/Second" | "Terabits/Second" | "Count/Second" | "None"
object Unit {
  inline val Seconds: "Seconds" = "Seconds"
  inline val Microseconds: "Microseconds" = "Microseconds"
  inline val Milliseconds: "Milliseconds" = "Milliseconds"
  inline val Bytes: "Bytes" = "Bytes"
  inline val Kilobytes: "Kilobytes" = "Kilobytes"
  inline val Megabytes: "Megabytes" = "Megabytes"
  inline val Gigabytes: "Gigabytes" = "Gigabytes"
  inline val Terabytes: "Terabytes" = "Terabytes"
  inline val Bits: "Bits" = "Bits"
  inline val Kilobits: "Kilobits" = "Kilobits"
  inline val Megabits: "Megabits" = "Megabits"
  inline val Gigabits: "Gigabits" = "Gigabits"
  inline val Terabits: "Terabits" = "Terabits"
  inline val Percent: "Percent" = "Percent"
  inline val Count: "Count" = "Count"
  inline val `Bytes/Second`: "Bytes/Second" = "Bytes/Second"
  inline val `Kilobytes/Second`: "Kilobytes/Second" = "Kilobytes/Second"
  inline val `Megabytes/Second`: "Megabytes/Second" = "Megabytes/Second"
  inline val `Gigabytes/Second`: "Gigabytes/Second" = "Gigabytes/Second"
  inline val `Terabytes/Second`: "Terabytes/Second" = "Terabytes/Second"
  inline val `Bits/Second`: "Bits/Second" = "Bits/Second"
  inline val `Kilobits/Second`: "Kilobits/Second" = "Kilobits/Second"
  inline val `Megabits/Second`: "Megabits/Second" = "Megabits/Second"
  inline val `Gigabits/Second`: "Gigabits/Second" = "Gigabits/Second"
  inline val `Terabits/Second`: "Terabits/Second" = "Terabits/Second"
  inline val `Count/Second`: "Count/Second" = "Count/Second"
  inline val None: "None" = "None"

  inline def values: js.Array[Unit] = js.Array(
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
  inline val SUCCESS: "SUCCESS" = "SUCCESS"
  inline val PENDING: "PENDING" = "PENDING"
  inline val FAILED: "FAILED" = "FAILED"

  inline def values: js.Array[UpdateStatus] = js.Array(SUCCESS, PENDING, FAILED)
}

type WebserverAccessMode = "PRIVATE_ONLY" | "PUBLIC_ONLY"
object WebserverAccessMode {
  inline val PRIVATE_ONLY: "PRIVATE_ONLY" = "PRIVATE_ONLY"
  inline val PUBLIC_ONLY: "PUBLIC_ONLY" = "PUBLIC_ONLY"

  inline def values: js.Array[WebserverAccessMode] = js.Array(PRIVATE_ONLY, PUBLIC_ONLY)
}
