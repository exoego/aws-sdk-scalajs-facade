package facade.amazonaws.services.cognitoidentity

import scalajs._

type AmbiguousRoleResolutionType = "AuthenticatedRole" | "Deny"
object AmbiguousRoleResolutionType {
  inline val AuthenticatedRole: "AuthenticatedRole" = "AuthenticatedRole"
  inline val Deny: "Deny" = "Deny"

  inline def values: js.Array[AmbiguousRoleResolutionType] = js.Array(AuthenticatedRole, Deny)
}

type ErrorCode = "AccessDenied" | "InternalServerError"
object ErrorCode {
  inline val AccessDenied: "AccessDenied" = "AccessDenied"
  inline val InternalServerError: "InternalServerError" = "InternalServerError"

  inline def values: js.Array[ErrorCode] = js.Array(AccessDenied, InternalServerError)
}

type MappingRuleMatchType = "Equals" | "Contains" | "StartsWith" | "NotEqual"
object MappingRuleMatchType {
  inline val Equals: "Equals" = "Equals"
  inline val Contains: "Contains" = "Contains"
  inline val StartsWith: "StartsWith" = "StartsWith"
  inline val NotEqual: "NotEqual" = "NotEqual"

  inline def values: js.Array[MappingRuleMatchType] = js.Array(Equals, Contains, StartsWith, NotEqual)
}

type RoleMappingType = "Token" | "Rules"
object RoleMappingType {
  inline val Token: "Token" = "Token"
  inline val Rules: "Rules" = "Rules"

  inline def values: js.Array[RoleMappingType] = js.Array(Token, Rules)
}
