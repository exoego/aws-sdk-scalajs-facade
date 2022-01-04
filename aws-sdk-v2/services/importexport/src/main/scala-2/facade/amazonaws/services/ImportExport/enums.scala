package facade.amazonaws.services.importexport

import scalajs.js

/** Specifies whether the job to initiate is an import or export job.
  */
@js.native
sealed trait JobType extends js.Any
object JobType {
  val Import = "Import".asInstanceOf[JobType]
  val Export = "Export".asInstanceOf[JobType]

  @inline def values: js.Array[JobType] = js.Array(Import, Export)
}
