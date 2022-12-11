package facade.amazonaws.services.snowball

import scalajs.js

@js.native
sealed trait ClusterState extends js.Any
object ClusterState {
  val AwaitingQuorum = "AwaitingQuorum".asInstanceOf[ClusterState]
  val Pending = "Pending".asInstanceOf[ClusterState]
  val InUse = "InUse".asInstanceOf[ClusterState]
  val Complete = "Complete".asInstanceOf[ClusterState]
  val Cancelled = "Cancelled".asInstanceOf[ClusterState]

  @inline def values: js.Array[ClusterState] = js.Array(AwaitingQuorum, Pending, InUse, Complete, Cancelled)
}

@js.native
sealed trait DeviceServiceName extends js.Any
object DeviceServiceName {
  val NFS_ON_DEVICE_SERVICE = "NFS_ON_DEVICE_SERVICE".asInstanceOf[DeviceServiceName]
  val S3_ON_DEVICE_SERVICE = "S3_ON_DEVICE_SERVICE".asInstanceOf[DeviceServiceName]

  @inline def values: js.Array[DeviceServiceName] = js.Array(NFS_ON_DEVICE_SERVICE, S3_ON_DEVICE_SERVICE)
}

@js.native
sealed trait JobState extends js.Any
object JobState {
  val New = "New".asInstanceOf[JobState]
  val PreparingAppliance = "PreparingAppliance".asInstanceOf[JobState]
  val PreparingShipment = "PreparingShipment".asInstanceOf[JobState]
  val InTransitToCustomer = "InTransitToCustomer".asInstanceOf[JobState]
  val WithCustomer = "WithCustomer".asInstanceOf[JobState]
  val InTransitToAWS = "InTransitToAWS".asInstanceOf[JobState]
  val WithAWSSortingFacility = "WithAWSSortingFacility".asInstanceOf[JobState]
  val WithAWS = "WithAWS".asInstanceOf[JobState]
  val InProgress = "InProgress".asInstanceOf[JobState]
  val Complete = "Complete".asInstanceOf[JobState]
  val Cancelled = "Cancelled".asInstanceOf[JobState]
  val Listing = "Listing".asInstanceOf[JobState]
  val Pending = "Pending".asInstanceOf[JobState]

  @inline def values: js.Array[JobState] = js.Array(
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

@js.native
sealed trait JobType extends js.Any
object JobType {
  val IMPORT = "IMPORT".asInstanceOf[JobType]
  val EXPORT = "EXPORT".asInstanceOf[JobType]
  val LOCAL_USE = "LOCAL_USE".asInstanceOf[JobType]

  @inline def values: js.Array[JobType] = js.Array(IMPORT, EXPORT, LOCAL_USE)
}

@js.native
sealed trait LongTermPricingType extends js.Any
object LongTermPricingType {
  val OneYear = "OneYear".asInstanceOf[LongTermPricingType]
  val ThreeYear = "ThreeYear".asInstanceOf[LongTermPricingType]

  @inline def values: js.Array[LongTermPricingType] = js.Array(OneYear, ThreeYear)
}

@js.native
sealed trait RemoteManagement extends js.Any
object RemoteManagement {
  val INSTALLED_ONLY = "INSTALLED_ONLY".asInstanceOf[RemoteManagement]
  val INSTALLED_AUTOSTART = "INSTALLED_AUTOSTART".asInstanceOf[RemoteManagement]

  @inline def values: js.Array[RemoteManagement] = js.Array(INSTALLED_ONLY, INSTALLED_AUTOSTART)
}

@js.native
sealed trait ShipmentState extends js.Any
object ShipmentState {
  val RECEIVED = "RECEIVED".asInstanceOf[ShipmentState]
  val RETURNED = "RETURNED".asInstanceOf[ShipmentState]

  @inline def values: js.Array[ShipmentState] = js.Array(RECEIVED, RETURNED)
}

@js.native
sealed trait ShippingLabelStatus extends js.Any
object ShippingLabelStatus {
  val InProgress = "InProgress".asInstanceOf[ShippingLabelStatus]
  val TimedOut = "TimedOut".asInstanceOf[ShippingLabelStatus]
  val Succeeded = "Succeeded".asInstanceOf[ShippingLabelStatus]
  val Failed = "Failed".asInstanceOf[ShippingLabelStatus]

  @inline def values: js.Array[ShippingLabelStatus] = js.Array(InProgress, TimedOut, Succeeded, Failed)
}

@js.native
sealed trait ShippingOption extends js.Any
object ShippingOption {
  val SECOND_DAY = "SECOND_DAY".asInstanceOf[ShippingOption]
  val NEXT_DAY = "NEXT_DAY".asInstanceOf[ShippingOption]
  val EXPRESS = "EXPRESS".asInstanceOf[ShippingOption]
  val STANDARD = "STANDARD".asInstanceOf[ShippingOption]

  @inline def values: js.Array[ShippingOption] = js.Array(SECOND_DAY, NEXT_DAY, EXPRESS, STANDARD)
}

@js.native
sealed trait SnowballCapacity extends js.Any
object SnowballCapacity {
  val T50 = "T50".asInstanceOf[SnowballCapacity]
  val T80 = "T80".asInstanceOf[SnowballCapacity]
  val T100 = "T100".asInstanceOf[SnowballCapacity]
  val T42 = "T42".asInstanceOf[SnowballCapacity]
  val T98 = "T98".asInstanceOf[SnowballCapacity]
  val T8 = "T8".asInstanceOf[SnowballCapacity]
  val T14 = "T14".asInstanceOf[SnowballCapacity]
  val NoPreference = "NoPreference".asInstanceOf[SnowballCapacity]
  val T32 = "T32".asInstanceOf[SnowballCapacity]

  @inline def values: js.Array[SnowballCapacity] = js.Array(T50, T80, T100, T42, T98, T8, T14, NoPreference, T32)
}

@js.native
sealed trait SnowballType extends js.Any
object SnowballType {
  val STANDARD = "STANDARD".asInstanceOf[SnowballType]
  val EDGE = "EDGE".asInstanceOf[SnowballType]
  val EDGE_C = "EDGE_C".asInstanceOf[SnowballType]
  val EDGE_CG = "EDGE_CG".asInstanceOf[SnowballType]
  val EDGE_S = "EDGE_S".asInstanceOf[SnowballType]
  val SNC1_HDD = "SNC1_HDD".asInstanceOf[SnowballType]
  val SNC1_SSD = "SNC1_SSD".asInstanceOf[SnowballType]
  val V3_5C = "V3_5C".asInstanceOf[SnowballType]

  @inline def values: js.Array[SnowballType] = js.Array(STANDARD, EDGE, EDGE_C, EDGE_CG, EDGE_S, SNC1_HDD, SNC1_SSD, V3_5C)
}

@js.native
sealed trait StorageUnit extends js.Any
object StorageUnit {
  val TB = "TB".asInstanceOf[StorageUnit]

  @inline def values: js.Array[StorageUnit] = js.Array(TB)
}

@js.native
sealed trait TransferOption extends js.Any
object TransferOption {
  val IMPORT = "IMPORT".asInstanceOf[TransferOption]
  val EXPORT = "EXPORT".asInstanceOf[TransferOption]
  val LOCAL_USE = "LOCAL_USE".asInstanceOf[TransferOption]

  @inline def values: js.Array[TransferOption] = js.Array(IMPORT, EXPORT, LOCAL_USE)
}
