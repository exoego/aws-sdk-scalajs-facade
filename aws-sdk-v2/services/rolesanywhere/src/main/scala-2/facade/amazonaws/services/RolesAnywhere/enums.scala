package facade.amazonaws.services.rolesanywhere

import scalajs.js

@js.native
sealed trait TrustAnchorType extends js.Any
object TrustAnchorType {
  val AWS_ACM_PCA = "AWS_ACM_PCA".asInstanceOf[TrustAnchorType]
  val CERTIFICATE_BUNDLE = "CERTIFICATE_BUNDLE".asInstanceOf[TrustAnchorType]
  val SELF_SIGNED_REPOSITORY = "SELF_SIGNED_REPOSITORY".asInstanceOf[TrustAnchorType]

  @inline def values: js.Array[TrustAnchorType] = js.Array(AWS_ACM_PCA, CERTIFICATE_BUNDLE, SELF_SIGNED_REPOSITORY)
}
