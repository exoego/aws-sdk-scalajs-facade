package facade.amazonaws.services.location

import scalajs.js

type BatchItemErrorCode = "AccessDeniedError" | "ConflictError" | "InternalServerError" | "ResourceNotFoundError" | "ThrottlingError" | "ValidationError"
object BatchItemErrorCode {
  inline val AccessDeniedError: "AccessDeniedError" = "AccessDeniedError"
  inline val ConflictError: "ConflictError" = "ConflictError"
  inline val InternalServerError: "InternalServerError" = "InternalServerError"
  inline val ResourceNotFoundError: "ResourceNotFoundError" = "ResourceNotFoundError"
  inline val ThrottlingError: "ThrottlingError" = "ThrottlingError"
  inline val ValidationError: "ValidationError" = "ValidationError"

  inline def values: js.Array[BatchItemErrorCode] = js.Array(AccessDeniedError, ConflictError, InternalServerError, ResourceNotFoundError, ThrottlingError, ValidationError)
}

type DimensionUnit = "Meters" | "Feet"
object DimensionUnit {
  inline val Meters: "Meters" = "Meters"
  inline val Feet: "Feet" = "Feet"

  inline def values: js.Array[DimensionUnit] = js.Array(Meters, Feet)
}

type DistanceUnit = "Kilometers" | "Miles"
object DistanceUnit {
  inline val Kilometers: "Kilometers" = "Kilometers"
  inline val Miles: "Miles" = "Miles"

  inline def values: js.Array[DistanceUnit] = js.Array(Kilometers, Miles)
}

type IntendedUse = "SingleUse" | "Storage"
object IntendedUse {
  inline val SingleUse: "SingleUse" = "SingleUse"
  inline val Storage: "Storage" = "Storage"

  inline def values: js.Array[IntendedUse] = js.Array(SingleUse, Storage)
}

type PositionFiltering = "TimeBased" | "DistanceBased" | "AccuracyBased"
object PositionFiltering {
  inline val TimeBased: "TimeBased" = "TimeBased"
  inline val DistanceBased: "DistanceBased" = "DistanceBased"
  inline val AccuracyBased: "AccuracyBased" = "AccuracyBased"

  inline def values: js.Array[PositionFiltering] = js.Array(TimeBased, DistanceBased, AccuracyBased)
}

type PricingPlan = "RequestBasedUsage" | "MobileAssetTracking" | "MobileAssetManagement"
object PricingPlan {
  inline val RequestBasedUsage: "RequestBasedUsage" = "RequestBasedUsage"
  inline val MobileAssetTracking: "MobileAssetTracking" = "MobileAssetTracking"
  inline val MobileAssetManagement: "MobileAssetManagement" = "MobileAssetManagement"

  inline def values: js.Array[PricingPlan] = js.Array(RequestBasedUsage, MobileAssetTracking, MobileAssetManagement)
}

type TravelMode = "Car" | "Truck" | "Walking"
object TravelMode {
  inline val Car: "Car" = "Car"
  inline val Truck: "Truck" = "Truck"
  inline val Walking: "Walking" = "Walking"

  inline def values: js.Array[TravelMode] = js.Array(Car, Truck, Walking)
}

type VehicleWeightUnit = "Kilograms" | "Pounds"
object VehicleWeightUnit {
  inline val Kilograms: "Kilograms" = "Kilograms"
  inline val Pounds: "Pounds" = "Pounds"

  inline def values: js.Array[VehicleWeightUnit] = js.Array(Kilograms, Pounds)
}
