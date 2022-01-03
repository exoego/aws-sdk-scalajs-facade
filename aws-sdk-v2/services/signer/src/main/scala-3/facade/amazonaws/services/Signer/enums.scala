package facade.amazonaws.services.signer

import scalajs.js

type Category = "AWSIoT"
object Category {
  inline val AWSIoT: "AWSIoT" = "AWSIoT"

  inline def values: js.Array[Category] = js.Array(AWSIoT)
}

type EncryptionAlgorithm = "RSA" | "ECDSA"
object EncryptionAlgorithm {
  inline val RSA: "RSA" = "RSA"
  inline val ECDSA: "ECDSA" = "ECDSA"

  inline def values: js.Array[EncryptionAlgorithm] = js.Array(RSA, ECDSA)
}

type HashAlgorithm = "SHA1" | "SHA256"
object HashAlgorithm {
  inline val SHA1: "SHA1" = "SHA1"
  inline val SHA256: "SHA256" = "SHA256"

  inline def values: js.Array[HashAlgorithm] = js.Array(SHA1, SHA256)
}

type ImageFormat = "JSON" | "JSONEmbedded" | "JSONDetached"
object ImageFormat {
  inline val JSON: "JSON" = "JSON"
  inline val JSONEmbedded: "JSONEmbedded" = "JSONEmbedded"
  inline val JSONDetached: "JSONDetached" = "JSONDetached"

  inline def values: js.Array[ImageFormat] = js.Array(JSON, JSONEmbedded, JSONDetached)
}

type SigningProfileStatus = "Active" | "Canceled" | "Revoked"
object SigningProfileStatus {
  inline val Active: "Active" = "Active"
  inline val Canceled: "Canceled" = "Canceled"
  inline val Revoked: "Revoked" = "Revoked"

  inline def values: js.Array[SigningProfileStatus] = js.Array(Active, Canceled, Revoked)
}

type SigningStatus = "InProgress" | "Failed" | "Succeeded"
object SigningStatus {
  inline val InProgress: "InProgress" = "InProgress"
  inline val Failed: "Failed" = "Failed"
  inline val Succeeded: "Succeeded" = "Succeeded"

  inline def values: js.Array[SigningStatus] = js.Array(InProgress, Failed, Succeeded)
}

type ValidityType = "DAYS" | "MONTHS" | "YEARS"
object ValidityType {
  inline val DAYS: "DAYS" = "DAYS"
  inline val MONTHS: "MONTHS" = "MONTHS"
  inline val YEARS: "YEARS" = "YEARS"

  inline def values: js.Array[ValidityType] = js.Array(DAYS, MONTHS, YEARS)
}
