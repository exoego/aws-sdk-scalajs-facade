package facade.amazonaws.services.cloudfront

package object signer {
  @deprecated("Use DateConstraint", "v0.31.0")
  type DateLessThan = DateConstraint
  @deprecated("Use DateConstraint", "v0.31.0")
  type DateGreaterThan = DateConstraint

  @deprecated("Use DateConstraint", "v0.31.0")
  @inline val DateLessThan = DateConstraint
  @deprecated("Use DateConstraint", "v0.31.0")
  @inline val DateGreaterThan = DateConstraint
}
