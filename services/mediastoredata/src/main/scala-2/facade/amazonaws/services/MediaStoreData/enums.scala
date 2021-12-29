package facade.amazonaws.services.mediastoredata

import scalajs._
import scala.scalajs.js.|

@js.native
sealed trait ItemType extends js.Any
object ItemType {
  val OBJECT = "OBJECT".asInstanceOf[ItemType]
  val FOLDER = "FOLDER".asInstanceOf[ItemType]

  @inline def values = js.Array(OBJECT, FOLDER)
}

@js.native
sealed trait StorageClass extends js.Any
object StorageClass {
  val TEMPORAL = "TEMPORAL".asInstanceOf[StorageClass]

  @inline def values = js.Array(TEMPORAL)
}

@js.native
sealed trait UploadAvailability extends js.Any
object UploadAvailability {
  val STANDARD = "STANDARD".asInstanceOf[UploadAvailability]
  val STREAMING = "STREAMING".asInstanceOf[UploadAvailability]

  @inline def values = js.Array(STANDARD, STREAMING)
}

