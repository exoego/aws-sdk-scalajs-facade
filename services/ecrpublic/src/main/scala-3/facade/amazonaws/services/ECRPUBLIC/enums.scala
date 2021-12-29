package facade.amazonaws.services.ecrpublic

import scalajs._

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

type RegistryAliasStatus = "ACTIVE" | "PENDING" | "REJECTED"
object RegistryAliasStatus {
  val ACTIVE: "ACTIVE" = "ACTIVE"
  val PENDING: "PENDING" = "PENDING"
  val REJECTED: "REJECTED" = "REJECTED"

  @inline def values = js.Array[RegistryAliasStatus](ACTIVE, PENDING, REJECTED)
}
