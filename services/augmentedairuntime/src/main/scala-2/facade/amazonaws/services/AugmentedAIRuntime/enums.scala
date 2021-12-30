package facade.amazonaws.services.augmentedairuntime

import scalajs.js

@js.native
sealed trait ContentClassifier extends js.Any
object ContentClassifier {
  val FreeOfPersonallyIdentifiableInformation = "FreeOfPersonallyIdentifiableInformation".asInstanceOf[ContentClassifier]
  val FreeOfAdultContent = "FreeOfAdultContent".asInstanceOf[ContentClassifier]

  @inline def values: js.Array[ContentClassifier] = js.Array(FreeOfPersonallyIdentifiableInformation, FreeOfAdultContent)
}

@js.native
sealed trait HumanLoopStatus extends js.Any
object HumanLoopStatus {
  val InProgress = "InProgress".asInstanceOf[HumanLoopStatus]
  val Failed = "Failed".asInstanceOf[HumanLoopStatus]
  val Completed = "Completed".asInstanceOf[HumanLoopStatus]
  val Stopped = "Stopped".asInstanceOf[HumanLoopStatus]
  val Stopping = "Stopping".asInstanceOf[HumanLoopStatus]

  @inline def values: js.Array[HumanLoopStatus] = js.Array(InProgress, Failed, Completed, Stopped, Stopping)
}

@js.native
sealed trait SortOrder extends js.Any
object SortOrder {
  val Ascending = "Ascending".asInstanceOf[SortOrder]
  val Descending = "Descending".asInstanceOf[SortOrder]

  @inline def values: js.Array[SortOrder] = js.Array(Ascending, Descending)
}
