package facade.amazonaws.services.rolesanywhere

import scalajs.js

type TrustAnchorType = "AWS_ACM_PCA" | "CERTIFICATE_BUNDLE" | "SELF_SIGNED_REPOSITORY"
object TrustAnchorType {
  inline val AWS_ACM_PCA: "AWS_ACM_PCA" = "AWS_ACM_PCA"
  inline val CERTIFICATE_BUNDLE: "CERTIFICATE_BUNDLE" = "CERTIFICATE_BUNDLE"
  inline val SELF_SIGNED_REPOSITORY: "SELF_SIGNED_REPOSITORY" = "SELF_SIGNED_REPOSITORY"

  inline def values: js.Array[TrustAnchorType] = js.Array(AWS_ACM_PCA, CERTIFICATE_BUNDLE, SELF_SIGNED_REPOSITORY)
}
