package facade.amazonaws.services.mwaa

import scalajs.js

@js.native
sealed trait EnvironmentStatus extends js.Any
object EnvironmentStatus {
  val CREATING = "CREATING".asInstanceOf[EnvironmentStatus]
  val CREATE_FAILED = "CREATE_FAILED".asInstanceOf[EnvironmentStatus]
  val AVAILABLE = "AVAILABLE".asInstanceOf[EnvironmentStatus]
  val UPDATING = "UPDATING".asInstanceOf[EnvironmentStatus]
  val DELETING = "DELETING".asInstanceOf[EnvironmentStatus]
  val DELETED = "DELETED".asInstanceOf[EnvironmentStatus]
  val UNAVAILABLE = "UNAVAILABLE".asInstanceOf[EnvironmentStatus]
  val UPDATE_FAILED = "UPDATE_FAILED".asInstanceOf[EnvironmentStatus]

  @inline def values: js.Array[EnvironmentStatus] = js.Array(CREATING, CREATE_FAILED, AVAILABLE, UPDATING, DELETING, DELETED, UNAVAILABLE, UPDATE_FAILED)
}

@js.native
sealed trait LoggingLevel extends js.Any
object LoggingLevel {
  val CRITICAL = "CRITICAL".asInstanceOf[LoggingLevel]
  val ERROR = "ERROR".asInstanceOf[LoggingLevel]
  val WARNING = "WARNING".asInstanceOf[LoggingLevel]
  val INFO = "INFO".asInstanceOf[LoggingLevel]
  val DEBUG = "DEBUG".asInstanceOf[LoggingLevel]

  @inline def values: js.Array[LoggingLevel] = js.Array(CRITICAL, ERROR, WARNING, INFO, DEBUG)
}

@js.native
sealed trait Unit extends js.Any
object Unit {
  val Seconds = "Seconds".asInstanceOf[Unit]
  val Microseconds = "Microseconds".asInstanceOf[Unit]
  val Milliseconds = "Milliseconds".asInstanceOf[Unit]
  val Bytes = "Bytes".asInstanceOf[Unit]
  val Kilobytes = "Kilobytes".asInstanceOf[Unit]
  val Megabytes = "Megabytes".asInstanceOf[Unit]
  val Gigabytes = "Gigabytes".asInstanceOf[Unit]
  val Terabytes = "Terabytes".asInstanceOf[Unit]
  val Bits = "Bits".asInstanceOf[Unit]
  val Kilobits = "Kilobits".asInstanceOf[Unit]
  val Megabits = "Megabits".asInstanceOf[Unit]
  val Gigabits = "Gigabits".asInstanceOf[Unit]
  val Terabits = "Terabits".asInstanceOf[Unit]
  val Percent = "Percent".asInstanceOf[Unit]
  val Count = "Count".asInstanceOf[Unit]
  val `Bytes/Second` = "Bytes/Second".asInstanceOf[Unit]
  val `Kilobytes/Second` = "Kilobytes/Second".asInstanceOf[Unit]
  val `Megabytes/Second` = "Megabytes/Second".asInstanceOf[Unit]
  val `Gigabytes/Second` = "Gigabytes/Second".asInstanceOf[Unit]
  val `Terabytes/Second` = "Terabytes/Second".asInstanceOf[Unit]
  val `Bits/Second` = "Bits/Second".asInstanceOf[Unit]
  val `Kilobits/Second` = "Kilobits/Second".asInstanceOf[Unit]
  val `Megabits/Second` = "Megabits/Second".asInstanceOf[Unit]
  val `Gigabits/Second` = "Gigabits/Second".asInstanceOf[Unit]
  val `Terabits/Second` = "Terabits/Second".asInstanceOf[Unit]
  val `Count/Second` = "Count/Second".asInstanceOf[Unit]
  val None = "None".asInstanceOf[Unit]

  @inline def values: js.Array[Unit] = js.Array(
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

@js.native
sealed trait UpdateStatus extends js.Any
object UpdateStatus {
  val SUCCESS = "SUCCESS".asInstanceOf[UpdateStatus]
  val PENDING = "PENDING".asInstanceOf[UpdateStatus]
  val FAILED = "FAILED".asInstanceOf[UpdateStatus]

  @inline def values: js.Array[UpdateStatus] = js.Array(SUCCESS, PENDING, FAILED)
}

@js.native
sealed trait WebserverAccessMode extends js.Any
object WebserverAccessMode {
  val PRIVATE_ONLY = "PRIVATE_ONLY".asInstanceOf[WebserverAccessMode]
  val PUBLIC_ONLY = "PUBLIC_ONLY".asInstanceOf[WebserverAccessMode]

  @inline def values: js.Array[WebserverAccessMode] = js.Array(PRIVATE_ONLY, PUBLIC_ONLY)
}
