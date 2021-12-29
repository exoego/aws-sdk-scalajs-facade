package facade.amazonaws.services.mediastoredata

import scalajs._

type ItemType = "OBJECT" | "FOLDER"
object ItemType {
  val OBJECT: "OBJECT" = "OBJECT"
  val FOLDER: "FOLDER" = "FOLDER"

  @inline def values = js.Array[ItemType](OBJECT, FOLDER)
}

type StorageClass = "TEMPORAL"
object StorageClass {
  val TEMPORAL: "TEMPORAL" = "TEMPORAL"

  @inline def values = js.Array[StorageClass](TEMPORAL)
}

type UploadAvailability = "STANDARD" | "STREAMING"
object UploadAvailability {
  val STANDARD: "STANDARD" = "STANDARD"
  val STREAMING: "STREAMING" = "STREAMING"

  @inline def values = js.Array[UploadAvailability](STANDARD, STREAMING)
}
