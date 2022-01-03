package facade.amazonaws.services.ecr

import scalajs.js

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

type ReplicationStatus = "IN_PROGRESS" | "COMPLETE" | "FAILED"
object ReplicationStatus {
  inline val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  inline val COMPLETE: "COMPLETE" = "COMPLETE"
  inline val FAILED: "FAILED" = "FAILED"

  inline def values: js.Array[ReplicationStatus] = js.Array(IN_PROGRESS, COMPLETE, FAILED)
}

type RepositoryFilterType = "PREFIX_MATCH"
object RepositoryFilterType {
  inline val PREFIX_MATCH: "PREFIX_MATCH" = "PREFIX_MATCH"

  inline def values: js.Array[RepositoryFilterType] = js.Array(PREFIX_MATCH)
}

type ScanFrequency = "SCAN_ON_PUSH" | "CONTINUOUS_SCAN" | "MANUAL"
object ScanFrequency {
  inline val SCAN_ON_PUSH: "SCAN_ON_PUSH" = "SCAN_ON_PUSH"
  inline val CONTINUOUS_SCAN: "CONTINUOUS_SCAN" = "CONTINUOUS_SCAN"
  inline val MANUAL: "MANUAL" = "MANUAL"

  inline def values: js.Array[ScanFrequency] = js.Array(SCAN_ON_PUSH, CONTINUOUS_SCAN, MANUAL)
}

type ScanStatus = "IN_PROGRESS" | "COMPLETE" | "FAILED" | "UNSUPPORTED_IMAGE" | "ACTIVE" | "PENDING" | "SCAN_ELIGIBILITY_EXPIRED" | "FINDINGS_UNAVAILABLE"
object ScanStatus {
  inline val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  inline val COMPLETE: "COMPLETE" = "COMPLETE"
  inline val FAILED: "FAILED" = "FAILED"
  inline val UNSUPPORTED_IMAGE: "UNSUPPORTED_IMAGE" = "UNSUPPORTED_IMAGE"
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val PENDING: "PENDING" = "PENDING"
  inline val SCAN_ELIGIBILITY_EXPIRED: "SCAN_ELIGIBILITY_EXPIRED" = "SCAN_ELIGIBILITY_EXPIRED"
  inline val FINDINGS_UNAVAILABLE: "FINDINGS_UNAVAILABLE" = "FINDINGS_UNAVAILABLE"

  inline def values: js.Array[ScanStatus] = js.Array(IN_PROGRESS, COMPLETE, FAILED, UNSUPPORTED_IMAGE, ACTIVE, PENDING, SCAN_ELIGIBILITY_EXPIRED, FINDINGS_UNAVAILABLE)
}

type ScanType = "BASIC" | "ENHANCED"
object ScanType {
  inline val BASIC: "BASIC" = "BASIC"
  inline val ENHANCED: "ENHANCED" = "ENHANCED"

  inline def values: js.Array[ScanType] = js.Array(BASIC, ENHANCED)
}

type ScanningConfigurationFailureCode = "REPOSITORY_NOT_FOUND"
object ScanningConfigurationFailureCode {
  inline val REPOSITORY_NOT_FOUND: "REPOSITORY_NOT_FOUND" = "REPOSITORY_NOT_FOUND"

  inline def values: js.Array[ScanningConfigurationFailureCode] = js.Array(REPOSITORY_NOT_FOUND)
}

type ScanningRepositoryFilterType = "WILDCARD"
object ScanningRepositoryFilterType {
  inline val WILDCARD: "WILDCARD" = "WILDCARD"

  inline def values: js.Array[ScanningRepositoryFilterType] = js.Array(WILDCARD)
}

type TagStatus = "TAGGED" | "UNTAGGED" | "ANY"
object TagStatus {
  inline val TAGGED: "TAGGED" = "TAGGED"
  inline val UNTAGGED: "UNTAGGED" = "UNTAGGED"
  inline val ANY: "ANY" = "ANY"

  inline def values: js.Array[TagStatus] = js.Array(TAGGED, UNTAGGED, ANY)
}
