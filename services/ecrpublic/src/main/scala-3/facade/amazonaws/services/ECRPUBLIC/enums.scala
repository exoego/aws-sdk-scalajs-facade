package facade.amazonaws.services.ecrpublic

import scalajs.js

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

type RegistryAliasStatus = "ACTIVE" | "PENDING" | "REJECTED"
object RegistryAliasStatus {
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val PENDING: "PENDING" = "PENDING"
  inline val REJECTED: "REJECTED" = "REJECTED"

  inline def values: js.Array[RegistryAliasStatus] = js.Array(ACTIVE, PENDING, REJECTED)
}
