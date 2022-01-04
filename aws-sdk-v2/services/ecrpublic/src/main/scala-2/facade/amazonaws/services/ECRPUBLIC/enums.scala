package facade.amazonaws.services.ecrpublic

import scalajs.js

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
sealed trait RegistryAliasStatus extends js.Any
object RegistryAliasStatus {
  val ACTIVE = "ACTIVE".asInstanceOf[RegistryAliasStatus]
  val PENDING = "PENDING".asInstanceOf[RegistryAliasStatus]
  val REJECTED = "REJECTED".asInstanceOf[RegistryAliasStatus]

  @inline def values: js.Array[RegistryAliasStatus] = js.Array(ACTIVE, PENDING, REJECTED)
}
