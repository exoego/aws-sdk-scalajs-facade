package facade.amazonaws.services.outposts

import scalajs.js

type AddressType = "SHIPPING_ADDRESS" | "OPERATING_ADDRESS"
object AddressType {
  inline val SHIPPING_ADDRESS: "SHIPPING_ADDRESS" = "SHIPPING_ADDRESS"
  inline val OPERATING_ADDRESS: "OPERATING_ADDRESS" = "OPERATING_ADDRESS"

  inline def values: js.Array[AddressType] = js.Array(SHIPPING_ADDRESS, OPERATING_ADDRESS)
}

type AssetState = "ACTIVE" | "RETIRING"
object AssetState {
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val RETIRING: "RETIRING" = "RETIRING"

  inline def values: js.Array[AssetState] = js.Array(ACTIVE, RETIRING)
}

type AssetType = "COMPUTE"
object AssetType {
  inline val COMPUTE: "COMPUTE" = "COMPUTE"

  inline def values: js.Array[AssetType] = js.Array(COMPUTE)
}

type CatalogItemClass = "RACK" | "SERVER"
object CatalogItemClass {
  inline val RACK: "RACK" = "RACK"
  inline val SERVER: "SERVER" = "SERVER"

  inline def values: js.Array[CatalogItemClass] = js.Array(RACK, SERVER)
}

type CatalogItemStatus = "AVAILABLE" | "DISCONTINUED"
object CatalogItemStatus {
  inline val AVAILABLE: "AVAILABLE" = "AVAILABLE"
  inline val DISCONTINUED: "DISCONTINUED" = "DISCONTINUED"

  inline def values: js.Array[CatalogItemStatus] = js.Array(AVAILABLE, DISCONTINUED)
}

type ComputeAssetState = "ACTIVE" | "ISOLATED" | "RETIRING"
object ComputeAssetState {
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val ISOLATED: "ISOLATED" = "ISOLATED"
  inline val RETIRING: "RETIRING" = "RETIRING"

  inline def values: js.Array[ComputeAssetState] = js.Array(ACTIVE, ISOLATED, RETIRING)
}

type FiberOpticCableType = "SINGLE_MODE" | "MULTI_MODE"
object FiberOpticCableType {
  inline val SINGLE_MODE: "SINGLE_MODE" = "SINGLE_MODE"
  inline val MULTI_MODE: "MULTI_MODE" = "MULTI_MODE"

  inline def values: js.Array[FiberOpticCableType] = js.Array(SINGLE_MODE, MULTI_MODE)
}

type LineItemStatus = "PREPARING" | "BUILDING" | "SHIPPED" | "DELIVERED" | "INSTALLING" | "INSTALLED" | "ERROR" | "CANCELLED"
object LineItemStatus {
  inline val PREPARING: "PREPARING" = "PREPARING"
  inline val BUILDING: "BUILDING" = "BUILDING"
  inline val SHIPPED: "SHIPPED" = "SHIPPED"
  inline val DELIVERED: "DELIVERED" = "DELIVERED"
  inline val INSTALLING: "INSTALLING" = "INSTALLING"
  inline val INSTALLED: "INSTALLED" = "INSTALLED"
  inline val ERROR: "ERROR" = "ERROR"
  inline val CANCELLED: "CANCELLED" = "CANCELLED"

  inline def values: js.Array[LineItemStatus] = js.Array(PREPARING, BUILDING, SHIPPED, DELIVERED, INSTALLING, INSTALLED, ERROR, CANCELLED)
}

type MaximumSupportedWeightLbs = "NO_LIMIT" | "MAX_1400_LBS" | "MAX_1600_LBS" | "MAX_1800_LBS" | "MAX_2000_LBS"
object MaximumSupportedWeightLbs {
  inline val NO_LIMIT: "NO_LIMIT" = "NO_LIMIT"
  inline val MAX_1400_LBS: "MAX_1400_LBS" = "MAX_1400_LBS"
  inline val MAX_1600_LBS: "MAX_1600_LBS" = "MAX_1600_LBS"
  inline val MAX_1800_LBS: "MAX_1800_LBS" = "MAX_1800_LBS"
  inline val MAX_2000_LBS: "MAX_2000_LBS" = "MAX_2000_LBS"

  inline def values: js.Array[MaximumSupportedWeightLbs] = js.Array(NO_LIMIT, MAX_1400_LBS, MAX_1600_LBS, MAX_1800_LBS, MAX_2000_LBS)
}

type OpticalStandard = "OPTIC_10GBASE_SR" | "OPTIC_10GBASE_IR" | "OPTIC_10GBASE_LR" | "OPTIC_40GBASE_SR" | "OPTIC_40GBASE_ESR" | "OPTIC_40GBASE_IR4_LR4L" | "OPTIC_40GBASE_LR4" | "OPTIC_100GBASE_SR4" | "OPTIC_100GBASE_CWDM4" | "OPTIC_100GBASE_LR4" | "OPTIC_100G_PSM4_MSA" | "OPTIC_1000BASE_LX" | "OPTIC_1000BASE_SX"
object OpticalStandard {
  inline val OPTIC_10GBASE_SR: "OPTIC_10GBASE_SR" = "OPTIC_10GBASE_SR"
  inline val OPTIC_10GBASE_IR: "OPTIC_10GBASE_IR" = "OPTIC_10GBASE_IR"
  inline val OPTIC_10GBASE_LR: "OPTIC_10GBASE_LR" = "OPTIC_10GBASE_LR"
  inline val OPTIC_40GBASE_SR: "OPTIC_40GBASE_SR" = "OPTIC_40GBASE_SR"
  inline val OPTIC_40GBASE_ESR: "OPTIC_40GBASE_ESR" = "OPTIC_40GBASE_ESR"
  inline val OPTIC_40GBASE_IR4_LR4L: "OPTIC_40GBASE_IR4_LR4L" = "OPTIC_40GBASE_IR4_LR4L"
  inline val OPTIC_40GBASE_LR4: "OPTIC_40GBASE_LR4" = "OPTIC_40GBASE_LR4"
  inline val OPTIC_100GBASE_SR4: "OPTIC_100GBASE_SR4" = "OPTIC_100GBASE_SR4"
  inline val OPTIC_100GBASE_CWDM4: "OPTIC_100GBASE_CWDM4" = "OPTIC_100GBASE_CWDM4"
  inline val OPTIC_100GBASE_LR4: "OPTIC_100GBASE_LR4" = "OPTIC_100GBASE_LR4"
  inline val OPTIC_100G_PSM4_MSA: "OPTIC_100G_PSM4_MSA" = "OPTIC_100G_PSM4_MSA"
  inline val OPTIC_1000BASE_LX: "OPTIC_1000BASE_LX" = "OPTIC_1000BASE_LX"
  inline val OPTIC_1000BASE_SX: "OPTIC_1000BASE_SX" = "OPTIC_1000BASE_SX"

  inline def values: js.Array[OpticalStandard] = js.Array(
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

type OrderStatus = "RECEIVED" | "PENDING" | "PROCESSING" | "INSTALLING" | "FULFILLED" | "CANCELLED" | "PREPARING" | "IN_PROGRESS" | "COMPLETED" | "ERROR"
object OrderStatus {
  inline val RECEIVED: "RECEIVED" = "RECEIVED"
  inline val PENDING: "PENDING" = "PENDING"
  inline val PROCESSING: "PROCESSING" = "PROCESSING"
  inline val INSTALLING: "INSTALLING" = "INSTALLING"
  inline val FULFILLED: "FULFILLED" = "FULFILLED"
  inline val CANCELLED: "CANCELLED" = "CANCELLED"
  inline val PREPARING: "PREPARING" = "PREPARING"
  inline val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  inline val COMPLETED: "COMPLETED" = "COMPLETED"
  inline val ERROR: "ERROR" = "ERROR"

  inline def values: js.Array[OrderStatus] = js.Array(RECEIVED, PENDING, PROCESSING, INSTALLING, FULFILLED, CANCELLED, PREPARING, IN_PROGRESS, COMPLETED, ERROR)
}

type OrderType = "OUTPOST" | "REPLACEMENT"
object OrderType {
  inline val OUTPOST: "OUTPOST" = "OUTPOST"
  inline val REPLACEMENT: "REPLACEMENT" = "REPLACEMENT"

  inline def values: js.Array[OrderType] = js.Array(OUTPOST, REPLACEMENT)
}

type PaymentOption = "ALL_UPFRONT" | "NO_UPFRONT" | "PARTIAL_UPFRONT"
object PaymentOption {
  inline val ALL_UPFRONT: "ALL_UPFRONT" = "ALL_UPFRONT"
  inline val NO_UPFRONT: "NO_UPFRONT" = "NO_UPFRONT"
  inline val PARTIAL_UPFRONT: "PARTIAL_UPFRONT" = "PARTIAL_UPFRONT"

  inline def values: js.Array[PaymentOption] = js.Array(ALL_UPFRONT, NO_UPFRONT, PARTIAL_UPFRONT)
}

type PaymentTerm = "THREE_YEARS" | "ONE_YEAR"
object PaymentTerm {
  inline val THREE_YEARS: "THREE_YEARS" = "THREE_YEARS"
  inline val ONE_YEAR: "ONE_YEAR" = "ONE_YEAR"

  inline def values: js.Array[PaymentTerm] = js.Array(THREE_YEARS, ONE_YEAR)
}

type PowerConnector = "L6_30P" | "IEC309" | "AH530P7W" | "AH532P6W"
object PowerConnector {
  inline val L6_30P: "L6_30P" = "L6_30P"
  inline val IEC309: "IEC309" = "IEC309"
  inline val AH530P7W: "AH530P7W" = "AH530P7W"
  inline val AH532P6W: "AH532P6W" = "AH532P6W"

  inline def values: js.Array[PowerConnector] = js.Array(L6_30P, IEC309, AH530P7W, AH532P6W)
}

type PowerDrawKva = "POWER_5_KVA" | "POWER_10_KVA" | "POWER_15_KVA"
object PowerDrawKva {
  inline val POWER_5_KVA: "POWER_5_KVA" = "POWER_5_KVA"
  inline val POWER_10_KVA: "POWER_10_KVA" = "POWER_10_KVA"
  inline val POWER_15_KVA: "POWER_15_KVA" = "POWER_15_KVA"

  inline def values: js.Array[PowerDrawKva] = js.Array(POWER_5_KVA, POWER_10_KVA, POWER_15_KVA)
}

type PowerFeedDrop = "ABOVE_RACK" | "BELOW_RACK"
object PowerFeedDrop {
  inline val ABOVE_RACK: "ABOVE_RACK" = "ABOVE_RACK"
  inline val BELOW_RACK: "BELOW_RACK" = "BELOW_RACK"

  inline def values: js.Array[PowerFeedDrop] = js.Array(ABOVE_RACK, BELOW_RACK)
}

type PowerPhase = "SINGLE_PHASE" | "THREE_PHASE"
object PowerPhase {
  inline val SINGLE_PHASE: "SINGLE_PHASE" = "SINGLE_PHASE"
  inline val THREE_PHASE: "THREE_PHASE" = "THREE_PHASE"

  inline def values: js.Array[PowerPhase] = js.Array(SINGLE_PHASE, THREE_PHASE)
}

type ShipmentCarrier = "DHL" | "DBS" | "FEDEX" | "UPS"
object ShipmentCarrier {
  inline val DHL: "DHL" = "DHL"
  inline val DBS: "DBS" = "DBS"
  inline val FEDEX: "FEDEX" = "FEDEX"
  inline val UPS: "UPS" = "UPS"

  inline def values: js.Array[ShipmentCarrier] = js.Array(DHL, DBS, FEDEX, UPS)
}

type SupportedHardwareType = "RACK" | "SERVER"
object SupportedHardwareType {
  inline val RACK: "RACK" = "RACK"
  inline val SERVER: "SERVER" = "SERVER"

  inline def values: js.Array[SupportedHardwareType] = js.Array(RACK, SERVER)
}

type SupportedStorageEnum = "EBS" | "S3"
object SupportedStorageEnum {
  inline val EBS: "EBS" = "EBS"
  inline val S3: "S3" = "S3"

  inline def values: js.Array[SupportedStorageEnum] = js.Array(EBS, S3)
}

type UplinkCount = "UPLINK_COUNT_1" | "UPLINK_COUNT_2" | "UPLINK_COUNT_3" | "UPLINK_COUNT_4" | "UPLINK_COUNT_5" | "UPLINK_COUNT_6" | "UPLINK_COUNT_7" | "UPLINK_COUNT_8" | "UPLINK_COUNT_12" | "UPLINK_COUNT_16"
object UplinkCount {
  inline val UPLINK_COUNT_1: "UPLINK_COUNT_1" = "UPLINK_COUNT_1"
  inline val UPLINK_COUNT_2: "UPLINK_COUNT_2" = "UPLINK_COUNT_2"
  inline val UPLINK_COUNT_3: "UPLINK_COUNT_3" = "UPLINK_COUNT_3"
  inline val UPLINK_COUNT_4: "UPLINK_COUNT_4" = "UPLINK_COUNT_4"
  inline val UPLINK_COUNT_5: "UPLINK_COUNT_5" = "UPLINK_COUNT_5"
  inline val UPLINK_COUNT_6: "UPLINK_COUNT_6" = "UPLINK_COUNT_6"
  inline val UPLINK_COUNT_7: "UPLINK_COUNT_7" = "UPLINK_COUNT_7"
  inline val UPLINK_COUNT_8: "UPLINK_COUNT_8" = "UPLINK_COUNT_8"
  inline val UPLINK_COUNT_12: "UPLINK_COUNT_12" = "UPLINK_COUNT_12"
  inline val UPLINK_COUNT_16: "UPLINK_COUNT_16" = "UPLINK_COUNT_16"

  inline def values: js.Array[UplinkCount] = js.Array(
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

type UplinkGbps = "UPLINK_1G" | "UPLINK_10G" | "UPLINK_40G" | "UPLINK_100G"
object UplinkGbps {
  inline val UPLINK_1G: "UPLINK_1G" = "UPLINK_1G"
  inline val UPLINK_10G: "UPLINK_10G" = "UPLINK_10G"
  inline val UPLINK_40G: "UPLINK_40G" = "UPLINK_40G"
  inline val UPLINK_100G: "UPLINK_100G" = "UPLINK_100G"

  inline def values: js.Array[UplinkGbps] = js.Array(UPLINK_1G, UPLINK_10G, UPLINK_40G, UPLINK_100G)
}
