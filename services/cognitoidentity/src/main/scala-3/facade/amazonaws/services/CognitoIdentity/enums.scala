package facade.amazonaws.services.cognitoidentity

import scalajs._

type AmbiguousRoleResolutionType = "AuthenticatedRole" | "Deny"
object AmbiguousRoleResolutionType {
  val AuthenticatedRole: "AuthenticatedRole" = "AuthenticatedRole"
  val Deny: "Deny" = "Deny"

  @inline def values = js.Array[AmbiguousRoleResolutionType](AuthenticatedRole, Deny)
}

type ErrorCode = "AccessDenied" | "InternalServerError"
object ErrorCode {
  val AccessDenied: "AccessDenied" = "AccessDenied"
  val InternalServerError: "InternalServerError" = "InternalServerError"

  @inline def values = js.Array[ErrorCode](AccessDenied, InternalServerError)
}

type MappingRuleMatchType = "Equals" | "Contains" | "StartsWith" | "NotEqual"
object MappingRuleMatchType {
  val Equals: "Equals" = "Equals"
  val Contains: "Contains" = "Contains"
  val StartsWith: "StartsWith" = "StartsWith"
  val NotEqual: "NotEqual" = "NotEqual"

  @inline def values = js.Array[MappingRuleMatchType](Equals, Contains, StartsWith, NotEqual)
}

type RoleMappingType = "Token" | "Rules"
object RoleMappingType {
  val Token: "Token" = "Token"
  val Rules: "Rules" = "Rules"

  @inline def values = js.Array[RoleMappingType](Token, Rules)
}
