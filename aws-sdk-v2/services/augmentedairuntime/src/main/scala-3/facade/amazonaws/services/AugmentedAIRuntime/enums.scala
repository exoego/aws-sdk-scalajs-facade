package facade.amazonaws.services.augmentedairuntime

import scalajs.js

type ContentClassifier = "FreeOfPersonallyIdentifiableInformation" | "FreeOfAdultContent"
object ContentClassifier {
  inline val FreeOfPersonallyIdentifiableInformation: "FreeOfPersonallyIdentifiableInformation" = "FreeOfPersonallyIdentifiableInformation"
  inline val FreeOfAdultContent: "FreeOfAdultContent" = "FreeOfAdultContent"

  inline def values: js.Array[ContentClassifier] = js.Array(FreeOfPersonallyIdentifiableInformation, FreeOfAdultContent)
}

type HumanLoopStatus = "InProgress" | "Failed" | "Completed" | "Stopped" | "Stopping"
object HumanLoopStatus {
  inline val InProgress: "InProgress" = "InProgress"
  inline val Failed: "Failed" = "Failed"
  inline val Completed: "Completed" = "Completed"
  inline val Stopped: "Stopped" = "Stopped"
  inline val Stopping: "Stopping" = "Stopping"

  inline def values: js.Array[HumanLoopStatus] = js.Array(InProgress, Failed, Completed, Stopped, Stopping)
}

type SortOrder = "Ascending" | "Descending"
object SortOrder {
  inline val Ascending: "Ascending" = "Ascending"
  inline val Descending: "Descending" = "Descending"

  inline def values: js.Array[SortOrder] = js.Array(Ascending, Descending)
}
