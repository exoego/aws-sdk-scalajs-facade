package facade.amazonaws.services.mediastoredata

import scalajs.js

type ItemType = "OBJECT" | "FOLDER"
object ItemType {
  inline val OBJECT: "OBJECT" = "OBJECT"
  inline val FOLDER: "FOLDER" = "FOLDER"

  inline def values: js.Array[ItemType] = js.Array(OBJECT, FOLDER)
}

type StorageClass = "TEMPORAL"
object StorageClass {
  inline val TEMPORAL: "TEMPORAL" = "TEMPORAL"

  inline def values: js.Array[StorageClass] = js.Array(TEMPORAL)
}

type UploadAvailability = "STANDARD" | "STREAMING"
object UploadAvailability {
  inline val STANDARD: "STANDARD" = "STANDARD"
  inline val STREAMING: "STREAMING" = "STREAMING"

  inline def values: js.Array[UploadAvailability] = js.Array(STANDARD, STREAMING)
}
