package facade.amazonaws.services.augmentedairuntime

import scalajs._

type ContentClassifier = "FreeOfPersonallyIdentifiableInformation" | "FreeOfAdultContent"
object ContentClassifier {
  val FreeOfPersonallyIdentifiableInformation: "FreeOfPersonallyIdentifiableInformation" = "FreeOfPersonallyIdentifiableInformation"
  val FreeOfAdultContent: "FreeOfAdultContent" = "FreeOfAdultContent"

  @inline def values = js.Array[ContentClassifier](FreeOfPersonallyIdentifiableInformation, FreeOfAdultContent)
}

type HumanLoopStatus = "InProgress" | "Failed" | "Completed" | "Stopped" | "Stopping"
object HumanLoopStatus {
  val InProgress: "InProgress" = "InProgress"
  val Failed: "Failed" = "Failed"
  val Completed: "Completed" = "Completed"
  val Stopped: "Stopped" = "Stopped"
  val Stopping: "Stopping" = "Stopping"

  @inline def values = js.Array[HumanLoopStatus](InProgress, Failed, Completed, Stopped, Stopping)
}

type SortOrder = "Ascending" | "Descending"
object SortOrder {
  val Ascending: "Ascending" = "Ascending"
  val Descending: "Descending" = "Descending"

  @inline def values = js.Array[SortOrder](Ascending, Descending)
}
