package facade.amazonaws.services.mobile

import scalajs._

/** Developer desktop or target mobile app or website platform.
  */
type Platform = "OSX" | "WINDOWS" | "LINUX" | "OBJC" | "SWIFT" | "ANDROID" | "JAVASCRIPT"
object Platform {
  inline val OSX: "OSX" = "OSX"
  inline val WINDOWS: "WINDOWS" = "WINDOWS"
  inline val LINUX: "LINUX" = "LINUX"
  inline val OBJC: "OBJC" = "OBJC"
  inline val SWIFT: "SWIFT" = "SWIFT"
  inline val ANDROID: "ANDROID" = "ANDROID"
  inline val JAVASCRIPT: "JAVASCRIPT" = "JAVASCRIPT"

  inline def values: js.Array[Platform] = js.Array(OSX, WINDOWS, LINUX, OBJC, SWIFT, ANDROID, JAVASCRIPT)
}

/** Synchronization state for a project.
  */
type ProjectState = "NORMAL" | "SYNCING" | "IMPORTING"
object ProjectState {
  inline val NORMAL: "NORMAL" = "NORMAL"
  inline val SYNCING: "SYNCING" = "SYNCING"
  inline val IMPORTING: "IMPORTING" = "IMPORTING"

  inline def values: js.Array[ProjectState] = js.Array(NORMAL, SYNCING, IMPORTING)
}
