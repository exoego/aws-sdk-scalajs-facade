package facade.amazonaws.services.signer

import scalajs._

type Category = "AWSIoT"
object Category {
  val AWSIoT: "AWSIoT" = "AWSIoT"

  @inline def values = js.Array[Category](AWSIoT)
}

type EncryptionAlgorithm = "RSA" | "ECDSA"
object EncryptionAlgorithm {
  val RSA: "RSA" = "RSA"
  val ECDSA: "ECDSA" = "ECDSA"

  @inline def values = js.Array[EncryptionAlgorithm](RSA, ECDSA)
}

type HashAlgorithm = "SHA1" | "SHA256"
object HashAlgorithm {
  val SHA1: "SHA1" = "SHA1"
  val SHA256: "SHA256" = "SHA256"

  @inline def values = js.Array[HashAlgorithm](SHA1, SHA256)
}

type ImageFormat = "JSON" | "JSONEmbedded" | "JSONDetached"
object ImageFormat {
  val JSON: "JSON" = "JSON"
  val JSONEmbedded: "JSONEmbedded" = "JSONEmbedded"
  val JSONDetached: "JSONDetached" = "JSONDetached"

  @inline def values = js.Array[ImageFormat](JSON, JSONEmbedded, JSONDetached)
}

type SigningProfileStatus = "Active" | "Canceled" | "Revoked"
object SigningProfileStatus {
  val Active: "Active" = "Active"
  val Canceled: "Canceled" = "Canceled"
  val Revoked: "Revoked" = "Revoked"

  @inline def values = js.Array[SigningProfileStatus](Active, Canceled, Revoked)
}

type SigningStatus = "InProgress" | "Failed" | "Succeeded"
object SigningStatus {
  val InProgress: "InProgress" = "InProgress"
  val Failed: "Failed" = "Failed"
  val Succeeded: "Succeeded" = "Succeeded"

  @inline def values = js.Array[SigningStatus](InProgress, Failed, Succeeded)
}

type ValidityType = "DAYS" | "MONTHS" | "YEARS"
object ValidityType {
  val DAYS: "DAYS" = "DAYS"
  val MONTHS: "MONTHS" = "MONTHS"
  val YEARS: "YEARS" = "YEARS"

  @inline def values = js.Array[ValidityType](DAYS, MONTHS, YEARS)
}
