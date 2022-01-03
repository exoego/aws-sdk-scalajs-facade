package facade.amazonaws.services.ecr

import scalajs.js

@js.native
sealed trait EncryptionType extends js.Any
object EncryptionType {
  val AES256 = "AES256".asInstanceOf[EncryptionType]
  val KMS = "KMS".asInstanceOf[EncryptionType]

  @inline def values: js.Array[EncryptionType] = js.Array(AES256, KMS)
}

@js.native
sealed trait FindingSeverity extends js.Any
object FindingSeverity {
  val INFORMATIONAL = "INFORMATIONAL".asInstanceOf[FindingSeverity]
  val LOW = "LOW".asInstanceOf[FindingSeverity]
  val MEDIUM = "MEDIUM".asInstanceOf[FindingSeverity]
  val HIGH = "HIGH".asInstanceOf[FindingSeverity]
  val CRITICAL = "CRITICAL".asInstanceOf[FindingSeverity]
  val UNDEFINED = "UNDEFINED".asInstanceOf[FindingSeverity]

  @inline def values: js.Array[FindingSeverity] = js.Array(INFORMATIONAL, LOW, MEDIUM, HIGH, CRITICAL, UNDEFINED)
}

@js.native
sealed trait ImageActionType extends js.Any
object ImageActionType {
  val EXPIRE = "EXPIRE".asInstanceOf[ImageActionType]

  @inline def values: js.Array[ImageActionType] = js.Array(EXPIRE)
}

@js.native
sealed trait ImageFailureCode extends js.Any
object ImageFailureCode {
  val InvalidImageDigest = "InvalidImageDigest".asInstanceOf[ImageFailureCode]
  val InvalidImageTag = "InvalidImageTag".asInstanceOf[ImageFailureCode]
  val ImageTagDoesNotMatchDigest = "ImageTagDoesNotMatchDigest".asInstanceOf[ImageFailureCode]
  val ImageNotFound = "ImageNotFound".asInstanceOf[ImageFailureCode]
  val MissingDigestAndTag = "MissingDigestAndTag".asInstanceOf[ImageFailureCode]
  val ImageReferencedByManifestList = "ImageReferencedByManifestList".asInstanceOf[ImageFailureCode]
  val KmsError = "KmsError".asInstanceOf[ImageFailureCode]

  @inline def values: js.Array[ImageFailureCode] = js.Array(InvalidImageDigest, InvalidImageTag, ImageTagDoesNotMatchDigest, ImageNotFound, MissingDigestAndTag, ImageReferencedByManifestList, KmsError)
}

@js.native
sealed trait ImageTagMutability extends js.Any
object ImageTagMutability {
  val MUTABLE = "MUTABLE".asInstanceOf[ImageTagMutability]
  val IMMUTABLE = "IMMUTABLE".asInstanceOf[ImageTagMutability]

  @inline def values: js.Array[ImageTagMutability] = js.Array(MUTABLE, IMMUTABLE)
}

@js.native
sealed trait LayerAvailability extends js.Any
object LayerAvailability {
  val AVAILABLE = "AVAILABLE".asInstanceOf[LayerAvailability]
  val UNAVAILABLE = "UNAVAILABLE".asInstanceOf[LayerAvailability]

  @inline def values: js.Array[LayerAvailability] = js.Array(AVAILABLE, UNAVAILABLE)
}

@js.native
sealed trait LayerFailureCode extends js.Any
object LayerFailureCode {
  val InvalidLayerDigest = "InvalidLayerDigest".asInstanceOf[LayerFailureCode]
  val MissingLayerDigest = "MissingLayerDigest".asInstanceOf[LayerFailureCode]

  @inline def values: js.Array[LayerFailureCode] = js.Array(InvalidLayerDigest, MissingLayerDigest)
}

@js.native
sealed trait LifecyclePolicyPreviewStatus extends js.Any
object LifecyclePolicyPreviewStatus {
  val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[LifecyclePolicyPreviewStatus]
  val COMPLETE = "COMPLETE".asInstanceOf[LifecyclePolicyPreviewStatus]
  val EXPIRED = "EXPIRED".asInstanceOf[LifecyclePolicyPreviewStatus]
  val FAILED = "FAILED".asInstanceOf[LifecyclePolicyPreviewStatus]

  @inline def values: js.Array[LifecyclePolicyPreviewStatus] = js.Array(IN_PROGRESS, COMPLETE, EXPIRED, FAILED)
}

@js.native
sealed trait ReplicationStatus extends js.Any
object ReplicationStatus {
  val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[ReplicationStatus]
  val COMPLETE = "COMPLETE".asInstanceOf[ReplicationStatus]
  val FAILED = "FAILED".asInstanceOf[ReplicationStatus]

  @inline def values: js.Array[ReplicationStatus] = js.Array(IN_PROGRESS, COMPLETE, FAILED)
}

@js.native
sealed trait RepositoryFilterType extends js.Any
object RepositoryFilterType {
  val PREFIX_MATCH = "PREFIX_MATCH".asInstanceOf[RepositoryFilterType]

  @inline def values: js.Array[RepositoryFilterType] = js.Array(PREFIX_MATCH)
}

@js.native
sealed trait ScanFrequency extends js.Any
object ScanFrequency {
  val SCAN_ON_PUSH = "SCAN_ON_PUSH".asInstanceOf[ScanFrequency]
  val CONTINUOUS_SCAN = "CONTINUOUS_SCAN".asInstanceOf[ScanFrequency]
  val MANUAL = "MANUAL".asInstanceOf[ScanFrequency]

  @inline def values: js.Array[ScanFrequency] = js.Array(SCAN_ON_PUSH, CONTINUOUS_SCAN, MANUAL)
}

@js.native
sealed trait ScanStatus extends js.Any
object ScanStatus {
  val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[ScanStatus]
  val COMPLETE = "COMPLETE".asInstanceOf[ScanStatus]
  val FAILED = "FAILED".asInstanceOf[ScanStatus]
  val UNSUPPORTED_IMAGE = "UNSUPPORTED_IMAGE".asInstanceOf[ScanStatus]
  val ACTIVE = "ACTIVE".asInstanceOf[ScanStatus]
  val PENDING = "PENDING".asInstanceOf[ScanStatus]
  val SCAN_ELIGIBILITY_EXPIRED = "SCAN_ELIGIBILITY_EXPIRED".asInstanceOf[ScanStatus]
  val FINDINGS_UNAVAILABLE = "FINDINGS_UNAVAILABLE".asInstanceOf[ScanStatus]

  @inline def values: js.Array[ScanStatus] = js.Array(IN_PROGRESS, COMPLETE, FAILED, UNSUPPORTED_IMAGE, ACTIVE, PENDING, SCAN_ELIGIBILITY_EXPIRED, FINDINGS_UNAVAILABLE)
}

@js.native
sealed trait ScanType extends js.Any
object ScanType {
  val BASIC = "BASIC".asInstanceOf[ScanType]
  val ENHANCED = "ENHANCED".asInstanceOf[ScanType]

  @inline def values: js.Array[ScanType] = js.Array(BASIC, ENHANCED)
}

@js.native
sealed trait ScanningConfigurationFailureCode extends js.Any
object ScanningConfigurationFailureCode {
  val REPOSITORY_NOT_FOUND = "REPOSITORY_NOT_FOUND".asInstanceOf[ScanningConfigurationFailureCode]

  @inline def values: js.Array[ScanningConfigurationFailureCode] = js.Array(REPOSITORY_NOT_FOUND)
}

@js.native
sealed trait ScanningRepositoryFilterType extends js.Any
object ScanningRepositoryFilterType {
  val WILDCARD = "WILDCARD".asInstanceOf[ScanningRepositoryFilterType]

  @inline def values: js.Array[ScanningRepositoryFilterType] = js.Array(WILDCARD)
}

@js.native
sealed trait TagStatus extends js.Any
object TagStatus {
  val TAGGED = "TAGGED".asInstanceOf[TagStatus]
  val UNTAGGED = "UNTAGGED".asInstanceOf[TagStatus]
  val ANY = "ANY".asInstanceOf[TagStatus]

  @inline def values: js.Array[TagStatus] = js.Array(TAGGED, UNTAGGED, ANY)
}
