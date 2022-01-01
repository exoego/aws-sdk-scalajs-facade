package facade.amazonaws.services.snowball

import scalajs.js

type ClusterState = "AwaitingQuorum" | "Pending" | "InUse" | "Complete" | "Cancelled"
object ClusterState {
  inline val AwaitingQuorum: "AwaitingQuorum" = "AwaitingQuorum"
  inline val Pending: "Pending" = "Pending"
  inline val InUse: "InUse" = "InUse"
  inline val Complete: "Complete" = "Complete"
  inline val Cancelled: "Cancelled" = "Cancelled"

  inline def values: js.Array[ClusterState] = js.Array(AwaitingQuorum, Pending, InUse, Complete, Cancelled)
}

type DeviceServiceName = "NFS_ON_DEVICE_SERVICE" | "S3_ON_DEVICE_SERVICE"
object DeviceServiceName {
  inline val NFS_ON_DEVICE_SERVICE: "NFS_ON_DEVICE_SERVICE" = "NFS_ON_DEVICE_SERVICE"
  inline val S3_ON_DEVICE_SERVICE: "S3_ON_DEVICE_SERVICE" = "S3_ON_DEVICE_SERVICE"

  inline def values: js.Array[DeviceServiceName] = js.Array(NFS_ON_DEVICE_SERVICE, S3_ON_DEVICE_SERVICE)
}

type JobState = "New" | "PreparingAppliance" | "PreparingShipment" | "InTransitToCustomer" | "WithCustomer" | "InTransitToAWS" | "WithAWSSortingFacility" | "WithAWS" | "InProgress" | "Complete" | "Cancelled" | "Listing" | "Pending"
object JobState {
  inline val New: "New" = "New"
  inline val PreparingAppliance: "PreparingAppliance" = "PreparingAppliance"
  inline val PreparingShipment: "PreparingShipment" = "PreparingShipment"
  inline val InTransitToCustomer: "InTransitToCustomer" = "InTransitToCustomer"
  inline val WithCustomer: "WithCustomer" = "WithCustomer"
  inline val InTransitToAWS: "InTransitToAWS" = "InTransitToAWS"
  inline val WithAWSSortingFacility: "WithAWSSortingFacility" = "WithAWSSortingFacility"
  inline val WithAWS: "WithAWS" = "WithAWS"
  inline val InProgress: "InProgress" = "InProgress"
  inline val Complete: "Complete" = "Complete"
  inline val Cancelled: "Cancelled" = "Cancelled"
  inline val Listing: "Listing" = "Listing"
  inline val Pending: "Pending" = "Pending"

  inline def values: js.Array[JobState] = js.Array(
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
  inline val IMPORT: "IMPORT" = "IMPORT"
  inline val EXPORT: "EXPORT" = "EXPORT"
  inline val LOCAL_USE: "LOCAL_USE" = "LOCAL_USE"

  inline def values: js.Array[JobType] = js.Array(IMPORT, EXPORT, LOCAL_USE)
}

type LongTermPricingType = "OneYear" | "ThreeYear"
object LongTermPricingType {
  inline val OneYear: "OneYear" = "OneYear"
  inline val ThreeYear: "ThreeYear" = "ThreeYear"

  inline def values: js.Array[LongTermPricingType] = js.Array(OneYear, ThreeYear)
}

type RemoteManagement = "INSTALLED_ONLY" | "INSTALLED_AUTOSTART"
object RemoteManagement {
  inline val INSTALLED_ONLY: "INSTALLED_ONLY" = "INSTALLED_ONLY"
  inline val INSTALLED_AUTOSTART: "INSTALLED_AUTOSTART" = "INSTALLED_AUTOSTART"

  inline def values: js.Array[RemoteManagement] = js.Array(INSTALLED_ONLY, INSTALLED_AUTOSTART)
}

type ShipmentState = "RECEIVED" | "RETURNED"
object ShipmentState {
  inline val RECEIVED: "RECEIVED" = "RECEIVED"
  inline val RETURNED: "RETURNED" = "RETURNED"

  inline def values: js.Array[ShipmentState] = js.Array(RECEIVED, RETURNED)
}

type ShippingLabelStatus = "InProgress" | "TimedOut" | "Succeeded" | "Failed"
object ShippingLabelStatus {
  inline val InProgress: "InProgress" = "InProgress"
  inline val TimedOut: "TimedOut" = "TimedOut"
  inline val Succeeded: "Succeeded" = "Succeeded"
  inline val Failed: "Failed" = "Failed"

  inline def values: js.Array[ShippingLabelStatus] = js.Array(InProgress, TimedOut, Succeeded, Failed)
}

type ShippingOption = "SECOND_DAY" | "NEXT_DAY" | "EXPRESS" | "STANDARD"
object ShippingOption {
  inline val SECOND_DAY: "SECOND_DAY" = "SECOND_DAY"
  inline val NEXT_DAY: "NEXT_DAY" = "NEXT_DAY"
  inline val EXPRESS: "EXPRESS" = "EXPRESS"
  inline val STANDARD: "STANDARD" = "STANDARD"

  inline def values: js.Array[ShippingOption] = js.Array(SECOND_DAY, NEXT_DAY, EXPRESS, STANDARD)
}

type SnowballCapacity = "T50" | "T80" | "T100" | "T42" | "T98" | "T8" | "T14" | "NoPreference"
object SnowballCapacity {
  inline val T50: "T50" = "T50"
  inline val T80: "T80" = "T80"
  inline val T100: "T100" = "T100"
  inline val T42: "T42" = "T42"
  inline val T98: "T98" = "T98"
  inline val T8: "T8" = "T8"
  inline val T14: "T14" = "T14"
  inline val NoPreference: "NoPreference" = "NoPreference"

  inline def values: js.Array[SnowballCapacity] = js.Array(T50, T80, T100, T42, T98, T8, T14, NoPreference)
}

type SnowballType = "STANDARD" | "EDGE" | "EDGE_C" | "EDGE_CG" | "EDGE_S" | "SNC1_HDD" | "SNC1_SSD"
object SnowballType {
  inline val STANDARD: "STANDARD" = "STANDARD"
  inline val EDGE: "EDGE" = "EDGE"
  inline val EDGE_C: "EDGE_C" = "EDGE_C"
  inline val EDGE_CG: "EDGE_CG" = "EDGE_CG"
  inline val EDGE_S: "EDGE_S" = "EDGE_S"
  inline val SNC1_HDD: "SNC1_HDD" = "SNC1_HDD"
  inline val SNC1_SSD: "SNC1_SSD" = "SNC1_SSD"

  inline def values: js.Array[SnowballType] = js.Array(STANDARD, EDGE, EDGE_C, EDGE_CG, EDGE_S, SNC1_HDD, SNC1_SSD)
}

type StorageUnit = "TB"
object StorageUnit {
  inline val TB: "TB" = "TB"

  inline def values: js.Array[StorageUnit] = js.Array(TB)
}

type TransferOption = "IMPORT" | "EXPORT" | "LOCAL_USE"
object TransferOption {
  inline val IMPORT: "IMPORT" = "IMPORT"
  inline val EXPORT: "EXPORT" = "EXPORT"
  inline val LOCAL_USE: "LOCAL_USE" = "LOCAL_USE"

  inline def values: js.Array[TransferOption] = js.Array(IMPORT, EXPORT, LOCAL_USE)
}
