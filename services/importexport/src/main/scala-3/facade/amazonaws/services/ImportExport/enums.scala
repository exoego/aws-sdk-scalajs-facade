package facade.amazonaws.services.importexport

import scalajs._

/** Specifies whether the job to initiate is an import or export job.
  */
type JobType = "Import" | "Export"
object JobType {
  val Import: "Import" = "Import"
  val Export: "Export" = "Export"

  @inline def values = js.Array[JobType](Import, Export)
}
