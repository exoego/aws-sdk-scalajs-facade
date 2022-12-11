package facade.amazonaws.services.location

import scalajs.js

@js.native
sealed trait BatchItemErrorCode extends js.Any
object BatchItemErrorCode {
  val AccessDeniedError = "AccessDeniedError".asInstanceOf[BatchItemErrorCode]
  val ConflictError = "ConflictError".asInstanceOf[BatchItemErrorCode]
  val InternalServerError = "InternalServerError".asInstanceOf[BatchItemErrorCode]
  val ResourceNotFoundError = "ResourceNotFoundError".asInstanceOf[BatchItemErrorCode]
  val ThrottlingError = "ThrottlingError".asInstanceOf[BatchItemErrorCode]
  val ValidationError = "ValidationError".asInstanceOf[BatchItemErrorCode]

  @inline def values: js.Array[BatchItemErrorCode] = js.Array(AccessDeniedError, ConflictError, InternalServerError, ResourceNotFoundError, ThrottlingError, ValidationError)
}

@js.native
sealed trait DimensionUnit extends js.Any
object DimensionUnit {
  val Meters = "Meters".asInstanceOf[DimensionUnit]
  val Feet = "Feet".asInstanceOf[DimensionUnit]

  @inline def values: js.Array[DimensionUnit] = js.Array(Meters, Feet)
}

@js.native
sealed trait DistanceUnit extends js.Any
object DistanceUnit {
  val Kilometers = "Kilometers".asInstanceOf[DistanceUnit]
  val Miles = "Miles".asInstanceOf[DistanceUnit]

  @inline def values: js.Array[DistanceUnit] = js.Array(Kilometers, Miles)
}

@js.native
sealed trait IntendedUse extends js.Any
object IntendedUse {
  val SingleUse = "SingleUse".asInstanceOf[IntendedUse]
  val Storage = "Storage".asInstanceOf[IntendedUse]

  @inline def values: js.Array[IntendedUse] = js.Array(SingleUse, Storage)
}

@js.native
sealed trait PositionFiltering extends js.Any
object PositionFiltering {
  val TimeBased = "TimeBased".asInstanceOf[PositionFiltering]
  val DistanceBased = "DistanceBased".asInstanceOf[PositionFiltering]
  val AccuracyBased = "AccuracyBased".asInstanceOf[PositionFiltering]

  @inline def values: js.Array[PositionFiltering] = js.Array(TimeBased, DistanceBased, AccuracyBased)
}

@js.native
sealed trait PricingPlan extends js.Any
object PricingPlan {
  val RequestBasedUsage = "RequestBasedUsage".asInstanceOf[PricingPlan]
  val MobileAssetTracking = "MobileAssetTracking".asInstanceOf[PricingPlan]
  val MobileAssetManagement = "MobileAssetManagement".asInstanceOf[PricingPlan]

  @inline def values: js.Array[PricingPlan] = js.Array(RequestBasedUsage, MobileAssetTracking, MobileAssetManagement)
}

@js.native
sealed trait RouteMatrixErrorCode extends js.Any
object RouteMatrixErrorCode {
  val RouteNotFound = "RouteNotFound".asInstanceOf[RouteMatrixErrorCode]
  val RouteTooLong = "RouteTooLong".asInstanceOf[RouteMatrixErrorCode]
  val PositionsNotFound = "PositionsNotFound".asInstanceOf[RouteMatrixErrorCode]
  val DestinationPositionNotFound = "DestinationPositionNotFound".asInstanceOf[RouteMatrixErrorCode]
  val DeparturePositionNotFound = "DeparturePositionNotFound".asInstanceOf[RouteMatrixErrorCode]
  val OtherValidationError = "OtherValidationError".asInstanceOf[RouteMatrixErrorCode]

  @inline def values: js.Array[RouteMatrixErrorCode] = js.Array(RouteNotFound, RouteTooLong, PositionsNotFound, DestinationPositionNotFound, DeparturePositionNotFound, OtherValidationError)
}

@js.native
sealed trait TravelMode extends js.Any
object TravelMode {
  val Car = "Car".asInstanceOf[TravelMode]
  val Truck = "Truck".asInstanceOf[TravelMode]
  val Walking = "Walking".asInstanceOf[TravelMode]

  @inline def values: js.Array[TravelMode] = js.Array(Car, Truck, Walking)
}

@js.native
sealed trait VehicleWeightUnit extends js.Any
object VehicleWeightUnit {
  val Kilograms = "Kilograms".asInstanceOf[VehicleWeightUnit]
  val Pounds = "Pounds".asInstanceOf[VehicleWeightUnit]

  @inline def values: js.Array[VehicleWeightUnit] = js.Array(Kilograms, Pounds)
}
