package facade.amazonaws.services.workspacesweb

import scalajs.js

@js.native
sealed trait BrowserType extends js.Any
object BrowserType {
  val Chrome = "Chrome".asInstanceOf[BrowserType]

  @inline def values: js.Array[BrowserType] = js.Array(Chrome)
}

@js.native
sealed trait EnabledType extends js.Any
object EnabledType {
  val Disabled = "Disabled".asInstanceOf[EnabledType]
  val Enabled = "Enabled".asInstanceOf[EnabledType]

  @inline def values: js.Array[EnabledType] = js.Array(Disabled, Enabled)
}

@js.native
sealed trait IdentityProviderType extends js.Any
object IdentityProviderType {
  val SAML = "SAML".asInstanceOf[IdentityProviderType]
  val Facebook = "Facebook".asInstanceOf[IdentityProviderType]
  val Google = "Google".asInstanceOf[IdentityProviderType]
  val LoginWithAmazon = "LoginWithAmazon".asInstanceOf[IdentityProviderType]
  val SignInWithApple = "SignInWithApple".asInstanceOf[IdentityProviderType]
  val OIDC = "OIDC".asInstanceOf[IdentityProviderType]

  @inline def values: js.Array[IdentityProviderType] = js.Array(SAML, Facebook, Google, LoginWithAmazon, SignInWithApple, OIDC)
}

@js.native
sealed trait PortalStatus extends js.Any
object PortalStatus {
  val Incomplete = "Incomplete".asInstanceOf[PortalStatus]
  val Pending = "Pending".asInstanceOf[PortalStatus]
  val Active = "Active".asInstanceOf[PortalStatus]

  @inline def values: js.Array[PortalStatus] = js.Array(Incomplete, Pending, Active)
}

@js.native
sealed trait RendererType extends js.Any
object RendererType {
  val AppStream = "AppStream".asInstanceOf[RendererType]

  @inline def values: js.Array[RendererType] = js.Array(AppStream)
}
