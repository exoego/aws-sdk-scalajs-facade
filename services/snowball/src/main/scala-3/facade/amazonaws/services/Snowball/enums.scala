package facade.amazonaws.services.snowball

import scalajs._

type ClusterState = "AwaitingQuorum" | "Pending" | "InUse" | "Complete" | "Cancelled"
object ClusterState {
  val AwaitingQuorum: "AwaitingQuorum" = "AwaitingQuorum"
  val Pending: "Pending" = "Pending"
  val InUse: "InUse" = "InUse"
  val Complete: "Complete" = "Complete"
  val Cancelled: "Cancelled" = "Cancelled"

  @inline def values = js.Array[ClusterState](AwaitingQuorum, Pending, InUse, Complete, Cancelled)
}

type JobState = "New" | "PreparingAppliance" | "PreparingShipment" | "InTransitToCustomer" | "WithCustomer" | "InTransitToAWS" | "WithAWSSortingFacility" | "WithAWS" | "InProgress" | "Complete" | "Cancelled" | "Listing" | "Pending"
object JobState {
  val New: "New" = "New"
  val PreparingAppliance: "PreparingAppliance" = "PreparingAppliance"
  val PreparingShipment: "PreparingShipment" = "PreparingShipment"
  val InTransitToCustomer: "InTransitToCustomer" = "InTransitToCustomer"
  val WithCustomer: "WithCustomer" = "WithCustomer"
  val InTransitToAWS: "InTransitToAWS" = "InTransitToAWS"
  val WithAWSSortingFacility: "WithAWSSortingFacility" = "WithAWSSortingFacility"
  val WithAWS: "WithAWS" = "WithAWS"
  val InProgress: "InProgress" = "InProgress"
  val Complete: "Complete" = "Complete"
  val Cancelled: "Cancelled" = "Cancelled"
  val Listing: "Listing" = "Listing"
  val Pending: "Pending" = "Pending"

  @inline def values = js.Array[JobState](
    New,
    PreparingAppliance,
    PreparingShipment,
    InTransitToCustomer,
    WithCustomer,
    InTransitToAWS,
    WithAWSSortingFacility,
    WithAWS,
    InProgress,
    Complete,
    Cancelled,
    Listing,
    Pending
  )
}

type JobType = "IMPORT" | "EXPORT" | "LOCAL_USE"
object JobType {
  val IMPORT: "IMPORT" = "IMPORT"
  val EXPORT: "EXPORT" = "EXPORT"
  val LOCAL_USE: "LOCAL_USE" = "LOCAL_USE"

  @inline def values = js.Array[JobType](IMPORT, EXPORT, LOCAL_USE)
}

type ShipmentState = "RECEIVED" | "RETURNED"
object ShipmentState {
  val RECEIVED: "RECEIVED" = "RECEIVED"
  val RETURNED: "RETURNED" = "RETURNED"

  @inline def values = js.Array[ShipmentState](RECEIVED, RETURNED)
}

type ShippingLabelStatus = "InProgress" | "TimedOut" | "Succeeded" | "Failed"
object ShippingLabelStatus {
  val InProgress: "InProgress" = "InProgress"
  val TimedOut: "TimedOut" = "TimedOut"
  val Succeeded: "Succeeded" = "Succeeded"
  val Failed: "Failed" = "Failed"

  @inline def values = js.Array[ShippingLabelStatus](InProgress, TimedOut, Succeeded, Failed)
}

type ShippingOption = "SECOND_DAY" | "NEXT_DAY" | "EXPRESS" | "STANDARD"
object ShippingOption {
  val SECOND_DAY: "SECOND_DAY" = "SECOND_DAY"
  val NEXT_DAY: "NEXT_DAY" = "NEXT_DAY"
  val EXPRESS: "EXPRESS" = "EXPRESS"
  val STANDARD: "STANDARD" = "STANDARD"

  @inline def values = js.Array[ShippingOption](SECOND_DAY, NEXT_DAY, EXPRESS, STANDARD)
}

type SnowballCapacity = "T50" | "T80" | "T100" | "T42" | "T98" | "T8" | "NoPreference"
object SnowballCapacity {
  val T50: "T50" = "T50"
  val T80: "T80" = "T80"
  val T100: "T100" = "T100"
  val T42: "T42" = "T42"
  val T98: "T98" = "T98"
  val T8: "T8" = "T8"
  val NoPreference: "NoPreference" = "NoPreference"

  @inline def values = js.Array[SnowballCapacity](T50, T80, T100, T42, T98, T8, NoPreference)
}

type SnowballType = "STANDARD" | "EDGE" | "EDGE_C" | "EDGE_CG" | "EDGE_S" | "SNC1_HDD"
object SnowballType {
  val STANDARD: "STANDARD" = "STANDARD"
  val EDGE: "EDGE" = "EDGE"
  val EDGE_C: "EDGE_C" = "EDGE_C"
  val EDGE_CG: "EDGE_CG" = "EDGE_CG"
  val EDGE_S: "EDGE_S" = "EDGE_S"
  val SNC1_HDD: "SNC1_HDD" = "SNC1_HDD"

  @inline def values = js.Array[SnowballType](STANDARD, EDGE, EDGE_C, EDGE_CG, EDGE_S, SNC1_HDD)
}
