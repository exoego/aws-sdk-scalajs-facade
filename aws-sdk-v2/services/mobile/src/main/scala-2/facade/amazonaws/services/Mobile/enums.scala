package facade.amazonaws.services.mobile

import scalajs.js

/** Developer desktop or target mobile app or website platform.
  */
@js.native
sealed trait Platform extends js.Any
object Platform {
  val OSX = "OSX".asInstanceOf[Platform]
  val WINDOWS = "WINDOWS".asInstanceOf[Platform]
  val LINUX = "LINUX".asInstanceOf[Platform]
  val OBJC = "OBJC".asInstanceOf[Platform]
  val SWIFT = "SWIFT".asInstanceOf[Platform]
  val ANDROID = "ANDROID".asInstanceOf[Platform]
  val JAVASCRIPT = "JAVASCRIPT".asInstanceOf[Platform]

  @inline def values: js.Array[Platform] = js.Array(OSX, WINDOWS, LINUX, OBJC, SWIFT, ANDROID, JAVASCRIPT)
}

/** Synchronization state for a project.
  */
@js.native
sealed trait ProjectState extends js.Any
object ProjectState {
  val NORMAL = "NORMAL".asInstanceOf[ProjectState]
  val SYNCING = "SYNCING".asInstanceOf[ProjectState]
  val IMPORTING = "IMPORTING".asInstanceOf[ProjectState]

  @inline def values: js.Array[ProjectState] = js.Array(NORMAL, SYNCING, IMPORTING)
}
