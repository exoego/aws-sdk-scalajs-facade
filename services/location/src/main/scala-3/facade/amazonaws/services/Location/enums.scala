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

type IntendedUse = "SingleUse" | "Storage"
object IntendedUse {
  inline val SingleUse: "SingleUse" = "SingleUse"
  inline val Storage: "Storage" = "Storage"

  inline def values: js.Array[IntendedUse] = js.Array(SingleUse, Storage)
}

type PricingPlan = "RequestBasedUsage" | "MobileAssetTracking" | "MobileAssetManagement"
object PricingPlan {
  inline val RequestBasedUsage: "RequestBasedUsage" = "RequestBasedUsage"
  inline val MobileAssetTracking: "MobileAssetTracking" = "MobileAssetTracking"
  inline val MobileAssetManagement: "MobileAssetManagement" = "MobileAssetManagement"

  inline def values: js.Array[PricingPlan] = js.Array(RequestBasedUsage, MobileAssetTracking, MobileAssetManagement)
}
