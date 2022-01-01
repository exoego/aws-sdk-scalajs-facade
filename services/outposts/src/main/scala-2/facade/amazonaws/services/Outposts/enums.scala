package facade.amazonaws.services.outposts

import scalajs.js

@js.native
sealed trait AddressType extends js.Any
object AddressType {
  val SHIPPING_ADDRESS = "SHIPPING_ADDRESS".asInstanceOf[AddressType]
  val OPERATING_ADDRESS = "OPERATING_ADDRESS".asInstanceOf[AddressType]

  @inline def values: js.Array[AddressType] = js.Array(SHIPPING_ADDRESS, OPERATING_ADDRESS)
}

@js.native
sealed trait CatalogItemClass extends js.Any
object CatalogItemClass {
  val RACK = "RACK".asInstanceOf[CatalogItemClass]
  val SERVER = "SERVER".asInstanceOf[CatalogItemClass]

  @inline def values: js.Array[CatalogItemClass] = js.Array(RACK, SERVER)
}

@js.native
sealed trait CatalogItemStatus extends js.Any
object CatalogItemStatus {
  val AVAILABLE = "AVAILABLE".asInstanceOf[CatalogItemStatus]
  val DISCONTINUED = "DISCONTINUED".asInstanceOf[CatalogItemStatus]

  @inline def values: js.Array[CatalogItemStatus] = js.Array(AVAILABLE, DISCONTINUED)
}

@js.native
sealed trait FiberOpticCableType extends js.Any
object FiberOpticCableType {
  val SINGLE_MODE = "SINGLE_MODE".asInstanceOf[FiberOpticCableType]
  val MULTI_MODE = "MULTI_MODE".asInstanceOf[FiberOpticCableType]

  @inline def values: js.Array[FiberOpticCableType] = js.Array(SINGLE_MODE, MULTI_MODE)
}

@js.native
sealed trait LineItemStatus extends js.Any
object LineItemStatus {
  val PREPARING = "PREPARING".asInstanceOf[LineItemStatus]
  val BUILDING = "BUILDING".asInstanceOf[LineItemStatus]
  val SHIPPED = "SHIPPED".asInstanceOf[LineItemStatus]
  val DELIVERED = "DELIVERED".asInstanceOf[LineItemStatus]
  val INSTALLING = "INSTALLING".asInstanceOf[LineItemStatus]
  val INSTALLED = "INSTALLED".asInstanceOf[LineItemStatus]
  val ERROR = "ERROR".asInstanceOf[LineItemStatus]
  val CANCELLED = "CANCELLED".asInstanceOf[LineItemStatus]

  @inline def values: js.Array[LineItemStatus] = js.Array(PREPARING, BUILDING, SHIPPED, DELIVERED, INSTALLING, INSTALLED, ERROR, CANCELLED)
}

@js.native
sealed trait MaximumSupportedWeightLbs extends js.Any
object MaximumSupportedWeightLbs {
  val NO_LIMIT = "NO_LIMIT".asInstanceOf[MaximumSupportedWeightLbs]
  val MAX_1400_LBS = "MAX_1400_LBS".asInstanceOf[MaximumSupportedWeightLbs]
  val MAX_1600_LBS = "MAX_1600_LBS".asInstanceOf[MaximumSupportedWeightLbs]
  val MAX_1800_LBS = "MAX_1800_LBS".asInstanceOf[MaximumSupportedWeightLbs]
  val MAX_2000_LBS = "MAX_2000_LBS".asInstanceOf[MaximumSupportedWeightLbs]

  @inline def values: js.Array[MaximumSupportedWeightLbs] = js.Array(NO_LIMIT, MAX_1400_LBS, MAX_1600_LBS, MAX_1800_LBS, MAX_2000_LBS)
}

@js.native
sealed trait OpticalStandard extends js.Any
object OpticalStandard {
  val OPTIC_10GBASE_SR = "OPTIC_10GBASE_SR".asInstanceOf[OpticalStandard]
  val OPTIC_10GBASE_IR = "OPTIC_10GBASE_IR".asInstanceOf[OpticalStandard]
  val OPTIC_10GBASE_LR = "OPTIC_10GBASE_LR".asInstanceOf[OpticalStandard]
  val OPTIC_40GBASE_SR = "OPTIC_40GBASE_SR".asInstanceOf[OpticalStandard]
  val OPTIC_40GBASE_ESR = "OPTIC_40GBASE_ESR".asInstanceOf[OpticalStandard]
  val OPTIC_40GBASE_IR4_LR4L = "OPTIC_40GBASE_IR4_LR4L".asInstanceOf[OpticalStandard]
  val OPTIC_40GBASE_LR4 = "OPTIC_40GBASE_LR4".asInstanceOf[OpticalStandard]
  val OPTIC_100GBASE_SR4 = "OPTIC_100GBASE_SR4".asInstanceOf[OpticalStandard]
  val OPTIC_100GBASE_CWDM4 = "OPTIC_100GBASE_CWDM4".asInstanceOf[OpticalStandard]
  val OPTIC_100GBASE_LR4 = "OPTIC_100GBASE_LR4".asInstanceOf[OpticalStandard]
  val OPTIC_100G_PSM4_MSA = "OPTIC_100G_PSM4_MSA".asInstanceOf[OpticalStandard]
  val OPTIC_1000BASE_LX = "OPTIC_1000BASE_LX".asInstanceOf[OpticalStandard]
  val OPTIC_1000BASE_SX = "OPTIC_1000BASE_SX".asInstanceOf[OpticalStandard]

  @inline def values: js.Array[OpticalStandard] = js.Array(
    OPTIC_10GBASE_SR,
    OPTIC_10GBASE_IR,
    OPTIC_10GBASE_LR,
    OPTIC_40GBASE_SR,
    OPTIC_40GBASE_ESR,
    OPTIC_40GBASE_IR4_LR4L,
    OPTIC_40GBASE_LR4,
    OPTIC_100GBASE_SR4,
    OPTIC_100GBASE_CWDM4,
    OPTIC_100GBASE_LR4,
    OPTIC_100G_PSM4_MSA,
    OPTIC_1000BASE_LX,
    OPTIC_1000BASE_SX
  )
}

@js.native
sealed trait OrderStatus extends js.Any
object OrderStatus {
  val RECEIVED = "RECEIVED".asInstanceOf[OrderStatus]
  val PENDING = "PENDING".asInstanceOf[OrderStatus]
  val PROCESSING = "PROCESSING".asInstanceOf[OrderStatus]
  val INSTALLING = "INSTALLING".asInstanceOf[OrderStatus]
  val FULFILLED = "FULFILLED".asInstanceOf[OrderStatus]
  val CANCELLED = "CANCELLED".asInstanceOf[OrderStatus]
  val PREPARING = "PREPARING".asInstanceOf[OrderStatus]
  val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[OrderStatus]
  val COMPLETED = "COMPLETED".asInstanceOf[OrderStatus]
  val ERROR = "ERROR".asInstanceOf[OrderStatus]

  @inline def values: js.Array[OrderStatus] = js.Array(RECEIVED, PENDING, PROCESSING, INSTALLING, FULFILLED, CANCELLED, PREPARING, IN_PROGRESS, COMPLETED, ERROR)
}

@js.native
sealed trait OrderType extends js.Any
object OrderType {
  val OUTPOST = "OUTPOST".asInstanceOf[OrderType]
  val REPLACEMENT = "REPLACEMENT".asInstanceOf[OrderType]

  @inline def values: js.Array[OrderType] = js.Array(OUTPOST, REPLACEMENT)
}

@js.native
sealed trait PaymentOption extends js.Any
object PaymentOption {
  val ALL_UPFRONT = "ALL_UPFRONT".asInstanceOf[PaymentOption]
  val NO_UPFRONT = "NO_UPFRONT".asInstanceOf[PaymentOption]
  val PARTIAL_UPFRONT = "PARTIAL_UPFRONT".asInstanceOf[PaymentOption]

  @inline def values: js.Array[PaymentOption] = js.Array(ALL_UPFRONT, NO_UPFRONT, PARTIAL_UPFRONT)
}

@js.native
sealed trait PaymentTerm extends js.Any
object PaymentTerm {
  val THREE_YEARS = "THREE_YEARS".asInstanceOf[PaymentTerm]

  @inline def values: js.Array[PaymentTerm] = js.Array(THREE_YEARS)
}

@js.native
sealed trait PowerConnector extends js.Any
object PowerConnector {
  val L6_30P = "L6_30P".asInstanceOf[PowerConnector]
  val IEC309 = "IEC309".asInstanceOf[PowerConnector]
  val AH530P7W = "AH530P7W".asInstanceOf[PowerConnector]
  val AH532P6W = "AH532P6W".asInstanceOf[PowerConnector]

  @inline def values: js.Array[PowerConnector] = js.Array(L6_30P, IEC309, AH530P7W, AH532P6W)
}

@js.native
sealed trait PowerDrawKva extends js.Any
object PowerDrawKva {
  val POWER_5_KVA = "POWER_5_KVA".asInstanceOf[PowerDrawKva]
  val POWER_10_KVA = "POWER_10_KVA".asInstanceOf[PowerDrawKva]
  val POWER_15_KVA = "POWER_15_KVA".asInstanceOf[PowerDrawKva]

  @inline def values: js.Array[PowerDrawKva] = js.Array(POWER_5_KVA, POWER_10_KVA, POWER_15_KVA)
}

@js.native
sealed trait PowerFeedDrop extends js.Any
object PowerFeedDrop {
  val ABOVE_RACK = "ABOVE_RACK".asInstanceOf[PowerFeedDrop]
  val BELOW_RACK = "BELOW_RACK".asInstanceOf[PowerFeedDrop]

  @inline def values: js.Array[PowerFeedDrop] = js.Array(ABOVE_RACK, BELOW_RACK)
}

@js.native
sealed trait PowerPhase extends js.Any
object PowerPhase {
  val SINGLE_PHASE = "SINGLE_PHASE".asInstanceOf[PowerPhase]
  val THREE_PHASE = "THREE_PHASE".asInstanceOf[PowerPhase]

  @inline def values: js.Array[PowerPhase] = js.Array(SINGLE_PHASE, THREE_PHASE)
}

@js.native
sealed trait SupportedHardwareType extends js.Any
object SupportedHardwareType {
  val RACK = "RACK".asInstanceOf[SupportedHardwareType]
  val SERVER = "SERVER".asInstanceOf[SupportedHardwareType]

  @inline def values: js.Array[SupportedHardwareType] = js.Array(RACK, SERVER)
}

@js.native
sealed trait SupportedStorageEnum extends js.Any
object SupportedStorageEnum {
  val EBS = "EBS".asInstanceOf[SupportedStorageEnum]
  val S3 = "S3".asInstanceOf[SupportedStorageEnum]

  @inline def values: js.Array[SupportedStorageEnum] = js.Array(EBS, S3)
}

@js.native
sealed trait UplinkCount extends js.Any
object UplinkCount {
  val UPLINK_COUNT_1 = "UPLINK_COUNT_1".asInstanceOf[UplinkCount]
  val UPLINK_COUNT_2 = "UPLINK_COUNT_2".asInstanceOf[UplinkCount]
  val UPLINK_COUNT_3 = "UPLINK_COUNT_3".asInstanceOf[UplinkCount]
  val UPLINK_COUNT_4 = "UPLINK_COUNT_4".asInstanceOf[UplinkCount]
  val UPLINK_COUNT_5 = "UPLINK_COUNT_5".asInstanceOf[UplinkCount]
  val UPLINK_COUNT_6 = "UPLINK_COUNT_6".asInstanceOf[UplinkCount]
  val UPLINK_COUNT_7 = "UPLINK_COUNT_7".asInstanceOf[UplinkCount]
  val UPLINK_COUNT_8 = "UPLINK_COUNT_8".asInstanceOf[UplinkCount]
  val UPLINK_COUNT_12 = "UPLINK_COUNT_12".asInstanceOf[UplinkCount]
  val UPLINK_COUNT_16 = "UPLINK_COUNT_16".asInstanceOf[UplinkCount]

  @inline def values: js.Array[UplinkCount] = js.Array(
    UPLINK_COUNT_1,
    UPLINK_COUNT_2,
    UPLINK_COUNT_3,
    UPLINK_COUNT_4,
    UPLINK_COUNT_5,
    UPLINK_COUNT_6,
    UPLINK_COUNT_7,
    UPLINK_COUNT_8,
    UPLINK_COUNT_12,
    UPLINK_COUNT_16
  )
}

@js.native
sealed trait UplinkGbps extends js.Any
object UplinkGbps {
  val UPLINK_1G = "UPLINK_1G".asInstanceOf[UplinkGbps]
  val UPLINK_10G = "UPLINK_10G".asInstanceOf[UplinkGbps]
  val UPLINK_40G = "UPLINK_40G".asInstanceOf[UplinkGbps]
  val UPLINK_100G = "UPLINK_100G".asInstanceOf[UplinkGbps]

  @inline def values: js.Array[UplinkGbps] = js.Array(UPLINK_1G, UPLINK_10G, UPLINK_40G, UPLINK_100G)
}
