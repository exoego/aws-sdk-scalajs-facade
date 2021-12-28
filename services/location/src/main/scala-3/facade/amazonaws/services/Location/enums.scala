package facade.amazonaws.services.location

import scalajs._
import scala.scalajs.js.|

@js.native
sealed trait BatchItemErrorCode extends js.Any
object BatchItemErrorCode {
  val AccessDeniedError = "AccessDeniedError".asInstanceOf[BatchItemErrorCode]
  val ConflictError = "ConflictError".asInstanceOf[BatchItemErrorCode]
  val InternalServerError = "InternalServerError".asInstanceOf[BatchItemErrorCode]
  val ResourceNotFoundError = "ResourceNotFoundError".asInstanceOf[BatchItemErrorCode]
  val ThrottlingError = "ThrottlingError".asInstanceOf[BatchItemErrorCode]
  val ValidationError = "ValidationError".asInstanceOf[BatchItemErrorCode]

  @inline def values = js.Array(AccessDeniedError, ConflictError, InternalServerError, ResourceNotFoundError, ThrottlingError, ValidationError)
}

@js.native
sealed trait IntendedUse extends js.Any
object IntendedUse {
  val SingleUse = "SingleUse".asInstanceOf[IntendedUse]
  val Storage = "Storage".asInstanceOf[IntendedUse]

  @inline def values = js.Array(SingleUse, Storage)
}

@js.native
sealed trait PricingPlan extends js.Any
object PricingPlan {
  val RequestBasedUsage = "RequestBasedUsage".asInstanceOf[PricingPlan]
  val MobileAssetTracking = "MobileAssetTracking".asInstanceOf[PricingPlan]
  val MobileAssetManagement = "MobileAssetManagement".asInstanceOf[PricingPlan]

  @inline def values = js.Array(RequestBasedUsage, MobileAssetTracking, MobileAssetManagement)
}
