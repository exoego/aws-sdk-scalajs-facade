package facade.amazonaws.services.signer

import scalajs._
import scala.scalajs.js.|

@js.native
sealed trait Category extends js.Any
object Category {
  val AWSIoT = "AWSIoT".asInstanceOf[Category]

  @inline def values = js.Array(AWSIoT)
}

@js.native
sealed trait EncryptionAlgorithm extends js.Any
object EncryptionAlgorithm {
  val RSA = "RSA".asInstanceOf[EncryptionAlgorithm]
  val ECDSA = "ECDSA".asInstanceOf[EncryptionAlgorithm]

  @inline def values = js.Array(RSA, ECDSA)
}

@js.native
sealed trait HashAlgorithm extends js.Any
object HashAlgorithm {
  val SHA1 = "SHA1".asInstanceOf[HashAlgorithm]
  val SHA256 = "SHA256".asInstanceOf[HashAlgorithm]

  @inline def values = js.Array(SHA1, SHA256)
}

@js.native
sealed trait ImageFormat extends js.Any
object ImageFormat {
  val JSON = "JSON".asInstanceOf[ImageFormat]
  val JSONEmbedded = "JSONEmbedded".asInstanceOf[ImageFormat]
  val JSONDetached = "JSONDetached".asInstanceOf[ImageFormat]

  @inline def values = js.Array(JSON, JSONEmbedded, JSONDetached)
}

@js.native
sealed trait SigningProfileStatus extends js.Any
object SigningProfileStatus {
  val Active = "Active".asInstanceOf[SigningProfileStatus]
  val Canceled = "Canceled".asInstanceOf[SigningProfileStatus]
  val Revoked = "Revoked".asInstanceOf[SigningProfileStatus]

  @inline def values = js.Array(Active, Canceled, Revoked)
}

@js.native
sealed trait SigningStatus extends js.Any
object SigningStatus {
  val InProgress = "InProgress".asInstanceOf[SigningStatus]
  val Failed = "Failed".asInstanceOf[SigningStatus]
  val Succeeded = "Succeeded".asInstanceOf[SigningStatus]

  @inline def values = js.Array(InProgress, Failed, Succeeded)
}

@js.native
sealed trait ValidityType extends js.Any
object ValidityType {
  val DAYS = "DAYS".asInstanceOf[ValidityType]
  val MONTHS = "MONTHS".asInstanceOf[ValidityType]
  val YEARS = "YEARS".asInstanceOf[ValidityType]

  @inline def values = js.Array(DAYS, MONTHS, YEARS)
}
