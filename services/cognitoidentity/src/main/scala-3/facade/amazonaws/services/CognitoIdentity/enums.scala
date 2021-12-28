package facade.amazonaws.services.cognitoidentity

import scalajs._
import scala.scalajs.js.|

@js.native
sealed trait AmbiguousRoleResolutionType extends js.Any
object AmbiguousRoleResolutionType {
  val AuthenticatedRole = "AuthenticatedRole".asInstanceOf[AmbiguousRoleResolutionType]
  val Deny = "Deny".asInstanceOf[AmbiguousRoleResolutionType]

  @inline def values = js.Array(AuthenticatedRole, Deny)
}

@js.native
sealed trait ErrorCode extends js.Any
object ErrorCode {
  val AccessDenied = "AccessDenied".asInstanceOf[ErrorCode]
  val InternalServerError = "InternalServerError".asInstanceOf[ErrorCode]

  @inline def values = js.Array(AccessDenied, InternalServerError)
}

@js.native
sealed trait MappingRuleMatchType extends js.Any
object MappingRuleMatchType {
  val Equals = "Equals".asInstanceOf[MappingRuleMatchType]
  val Contains = "Contains".asInstanceOf[MappingRuleMatchType]
  val StartsWith = "StartsWith".asInstanceOf[MappingRuleMatchType]
  val NotEqual = "NotEqual".asInstanceOf[MappingRuleMatchType]

  @inline def values = js.Array(Equals, Contains, StartsWith, NotEqual)
}

@js.native
sealed trait RoleMappingType extends js.Any
object RoleMappingType {
  val Token = "Token".asInstanceOf[RoleMappingType]
  val Rules = "Rules".asInstanceOf[RoleMappingType]

  @inline def values = js.Array(Token, Rules)
}
