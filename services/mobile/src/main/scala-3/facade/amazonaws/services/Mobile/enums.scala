package facade.amazonaws.services.mobile

import scalajs._

/** Developer desktop or target mobile app or website platform.
  */
type Platform = "OSX" | "WINDOWS" | "LINUX" | "OBJC" | "SWIFT" | "ANDROID" | "JAVASCRIPT"
object Platform {
  val OSX: "OSX" = "OSX"
  val WINDOWS: "WINDOWS" = "WINDOWS"
  val LINUX: "LINUX" = "LINUX"
  val OBJC: "OBJC" = "OBJC"
  val SWIFT: "SWIFT" = "SWIFT"
  val ANDROID: "ANDROID" = "ANDROID"
  val JAVASCRIPT: "JAVASCRIPT" = "JAVASCRIPT"

  @inline def values = js.Array[Platform](OSX, WINDOWS, LINUX, OBJC, SWIFT, ANDROID, JAVASCRIPT)
}

/** Synchronization state for a project.
  */
type ProjectState = "NORMAL" | "SYNCING" | "IMPORTING"
object ProjectState {
  val NORMAL: "NORMAL" = "NORMAL"
  val SYNCING: "SYNCING" = "SYNCING"
  val IMPORTING: "IMPORTING" = "IMPORTING"

  @inline def values = js.Array[ProjectState](NORMAL, SYNCING, IMPORTING)
}
