package facade.amazonaws.services.location

import scalajs._

type BatchItemErrorCode = "AccessDeniedError" | "ConflictError" | "InternalServerError" | "ResourceNotFoundError" | "ThrottlingError" | "ValidationError"
object BatchItemErrorCode {
  val AccessDeniedError: "AccessDeniedError" = "AccessDeniedError"
  val ConflictError: "ConflictError" = "ConflictError"
  val InternalServerError: "InternalServerError" = "InternalServerError"
  val ResourceNotFoundError: "ResourceNotFoundError" = "ResourceNotFoundError"
  val ThrottlingError: "ThrottlingError" = "ThrottlingError"
  val ValidationError: "ValidationError" = "ValidationError"

  @inline def values = js.Array[BatchItemErrorCode](AccessDeniedError, ConflictError, InternalServerError, ResourceNotFoundError, ThrottlingError, ValidationError)
}

type IntendedUse = "SingleUse" | "Storage"
object IntendedUse {
  val SingleUse: "SingleUse" = "SingleUse"
  val Storage: "Storage" = "Storage"

  @inline def values = js.Array[IntendedUse](SingleUse, Storage)
}

type PricingPlan = "RequestBasedUsage" | "MobileAssetTracking" | "MobileAssetManagement"
object PricingPlan {
  val RequestBasedUsage: "RequestBasedUsage" = "RequestBasedUsage"
  val MobileAssetTracking: "MobileAssetTracking" = "MobileAssetTracking"
  val MobileAssetManagement: "MobileAssetManagement" = "MobileAssetManagement"

  @inline def values = js.Array[PricingPlan](RequestBasedUsage, MobileAssetTracking, MobileAssetManagement)
}
