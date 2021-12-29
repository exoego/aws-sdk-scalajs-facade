package facade.amazonaws.services.ecr

import scalajs._

type EncryptionType = "AES256" | "KMS"
object EncryptionType {
  inline val AES256: "AES256" = "AES256"
  inline val KMS: "KMS" = "KMS"

  inline def values: js.Array[EncryptionType] = js.Array(AES256, KMS)
}

type FindingSeverity = "INFORMATIONAL" | "LOW" | "MEDIUM" | "HIGH" | "CRITICAL" | "UNDEFINED"
object FindingSeverity {
  inline val INFORMATIONAL: "INFORMATIONAL" = "INFORMATIONAL"
  inline val LOW: "LOW" = "LOW"
  inline val MEDIUM: "MEDIUM" = "MEDIUM"
  inline val HIGH: "HIGH" = "HIGH"
  inline val CRITICAL: "CRITICAL" = "CRITICAL"
  inline val UNDEFINED: "UNDEFINED" = "UNDEFINED"

  inline def values: js.Array[FindingSeverity] = js.Array(INFORMATIONAL, LOW, MEDIUM, HIGH, CRITICAL, UNDEFINED)
}

type ImageActionType = "EXPIRE"
object ImageActionType {
  inline val EXPIRE: "EXPIRE" = "EXPIRE"

  inline def values: js.Array[ImageActionType] = js.Array(EXPIRE)
}

type ImageFailureCode = "InvalidImageDigest" | "InvalidImageTag" | "ImageTagDoesNotMatchDigest" | "ImageNotFound" | "MissingDigestAndTag" | "ImageReferencedByManifestList" | "KmsError"
object ImageFailureCode {
  inline val InvalidImageDigest: "InvalidImageDigest" = "InvalidImageDigest"
  inline val InvalidImageTag: "InvalidImageTag" = "InvalidImageTag"
  inline val ImageTagDoesNotMatchDigest: "ImageTagDoesNotMatchDigest" = "ImageTagDoesNotMatchDigest"
  inline val ImageNotFound: "ImageNotFound" = "ImageNotFound"
  inline val MissingDigestAndTag: "MissingDigestAndTag" = "MissingDigestAndTag"
  inline val ImageReferencedByManifestList: "ImageReferencedByManifestList" = "ImageReferencedByManifestList"
  inline val KmsError: "KmsError" = "KmsError"

  inline def values: js.Array[ImageFailureCode] = js.Array(InvalidImageDigest, InvalidImageTag, ImageTagDoesNotMatchDigest, ImageNotFound, MissingDigestAndTag, ImageReferencedByManifestList, KmsError)
}

type ImageTagMutability = "MUTABLE" | "IMMUTABLE"
object ImageTagMutability {
  inline val MUTABLE: "MUTABLE" = "MUTABLE"
  inline val IMMUTABLE: "IMMUTABLE" = "IMMUTABLE"

  inline def values: js.Array[ImageTagMutability] = js.Array(MUTABLE, IMMUTABLE)
}

type LayerAvailability = "AVAILABLE" | "UNAVAILABLE"
object LayerAvailability {
  inline val AVAILABLE: "AVAILABLE" = "AVAILABLE"
  inline val UNAVAILABLE: "UNAVAILABLE" = "UNAVAILABLE"

  inline def values: js.Array[LayerAvailability] = js.Array(AVAILABLE, UNAVAILABLE)
}

type LayerFailureCode = "InvalidLayerDigest" | "MissingLayerDigest"
object LayerFailureCode {
  inline val InvalidLayerDigest: "InvalidLayerDigest" = "InvalidLayerDigest"
  inline val MissingLayerDigest: "MissingLayerDigest" = "MissingLayerDigest"

  inline def values: js.Array[LayerFailureCode] = js.Array(InvalidLayerDigest, MissingLayerDigest)
}

type LifecyclePolicyPreviewStatus = "IN_PROGRESS" | "COMPLETE" | "EXPIRED" | "FAILED"
object LifecyclePolicyPreviewStatus {
  inline val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  inline val COMPLETE: "COMPLETE" = "COMPLETE"
  inline val EXPIRED: "EXPIRED" = "EXPIRED"
  inline val FAILED: "FAILED" = "FAILED"

  inline def values: js.Array[LifecyclePolicyPreviewStatus] = js.Array(IN_PROGRESS, COMPLETE, EXPIRED, FAILED)
}

type ScanStatus = "IN_PROGRESS" | "COMPLETE" | "FAILED"
object ScanStatus {
  inline val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  inline val COMPLETE: "COMPLETE" = "COMPLETE"
  inline val FAILED: "FAILED" = "FAILED"

  inline def values: js.Array[ScanStatus] = js.Array(IN_PROGRESS, COMPLETE, FAILED)
}

type TagStatus = "TAGGED" | "UNTAGGED" | "ANY"
object TagStatus {
  inline val TAGGED: "TAGGED" = "TAGGED"
  inline val UNTAGGED: "UNTAGGED" = "UNTAGGED"
  inline val ANY: "ANY" = "ANY"

  inline def values: js.Array[TagStatus] = js.Array(TAGGED, UNTAGGED, ANY)
}
