package facade.amazonaws.services.ecr

import scalajs._

type EncryptionType = "AES256" | "KMS"
object EncryptionType {
  val AES256: "AES256" = "AES256"
  val KMS: "KMS" = "KMS"

  @inline def values = js.Array[EncryptionType](AES256, KMS)
}

type FindingSeverity = "INFORMATIONAL" | "LOW" | "MEDIUM" | "HIGH" | "CRITICAL" | "UNDEFINED"
object FindingSeverity {
  val INFORMATIONAL: "INFORMATIONAL" = "INFORMATIONAL"
  val LOW: "LOW" = "LOW"
  val MEDIUM: "MEDIUM" = "MEDIUM"
  val HIGH: "HIGH" = "HIGH"
  val CRITICAL: "CRITICAL" = "CRITICAL"
  val UNDEFINED: "UNDEFINED" = "UNDEFINED"

  @inline def values = js.Array[FindingSeverity](INFORMATIONAL, LOW, MEDIUM, HIGH, CRITICAL, UNDEFINED)
}

type ImageActionType = "EXPIRE"
object ImageActionType {
  val EXPIRE: "EXPIRE" = "EXPIRE"

  @inline def values = js.Array[ImageActionType](EXPIRE)
}

type ImageFailureCode = "InvalidImageDigest" | "InvalidImageTag" | "ImageTagDoesNotMatchDigest" | "ImageNotFound" | "MissingDigestAndTag" | "ImageReferencedByManifestList" | "KmsError"
object ImageFailureCode {
  val InvalidImageDigest: "InvalidImageDigest" = "InvalidImageDigest"
  val InvalidImageTag: "InvalidImageTag" = "InvalidImageTag"
  val ImageTagDoesNotMatchDigest: "ImageTagDoesNotMatchDigest" = "ImageTagDoesNotMatchDigest"
  val ImageNotFound: "ImageNotFound" = "ImageNotFound"
  val MissingDigestAndTag: "MissingDigestAndTag" = "MissingDigestAndTag"
  val ImageReferencedByManifestList: "ImageReferencedByManifestList" = "ImageReferencedByManifestList"
  val KmsError: "KmsError" = "KmsError"

  @inline def values = js.Array[ImageFailureCode](InvalidImageDigest, InvalidImageTag, ImageTagDoesNotMatchDigest, ImageNotFound, MissingDigestAndTag, ImageReferencedByManifestList, KmsError)
}

type ImageTagMutability = "MUTABLE" | "IMMUTABLE"
object ImageTagMutability {
  val MUTABLE: "MUTABLE" = "MUTABLE"
  val IMMUTABLE: "IMMUTABLE" = "IMMUTABLE"

  @inline def values = js.Array[ImageTagMutability](MUTABLE, IMMUTABLE)
}

type LayerAvailability = "AVAILABLE" | "UNAVAILABLE"
object LayerAvailability {
  val AVAILABLE: "AVAILABLE" = "AVAILABLE"
  val UNAVAILABLE: "UNAVAILABLE" = "UNAVAILABLE"

  @inline def values = js.Array[LayerAvailability](AVAILABLE, UNAVAILABLE)
}

type LayerFailureCode = "InvalidLayerDigest" | "MissingLayerDigest"
object LayerFailureCode {
  val InvalidLayerDigest: "InvalidLayerDigest" = "InvalidLayerDigest"
  val MissingLayerDigest: "MissingLayerDigest" = "MissingLayerDigest"

  @inline def values = js.Array[LayerFailureCode](InvalidLayerDigest, MissingLayerDigest)
}

type LifecyclePolicyPreviewStatus = "IN_PROGRESS" | "COMPLETE" | "EXPIRED" | "FAILED"
object LifecyclePolicyPreviewStatus {
  val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  val COMPLETE: "COMPLETE" = "COMPLETE"
  val EXPIRED: "EXPIRED" = "EXPIRED"
  val FAILED: "FAILED" = "FAILED"

  @inline def values = js.Array[LifecyclePolicyPreviewStatus](IN_PROGRESS, COMPLETE, EXPIRED, FAILED)
}

type ScanStatus = "IN_PROGRESS" | "COMPLETE" | "FAILED"
object ScanStatus {
  val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  val COMPLETE: "COMPLETE" = "COMPLETE"
  val FAILED: "FAILED" = "FAILED"

  @inline def values = js.Array[ScanStatus](IN_PROGRESS, COMPLETE, FAILED)
}

type TagStatus = "TAGGED" | "UNTAGGED" | "ANY"
object TagStatus {
  val TAGGED: "TAGGED" = "TAGGED"
  val UNTAGGED: "UNTAGGED" = "UNTAGGED"
  val ANY: "ANY" = "ANY"

  @inline def values = js.Array[TagStatus](TAGGED, UNTAGGED, ANY)
}
