package facade.amazonaws.services.workspacesweb

import scalajs.js

type BrowserType = "Chrome"
object BrowserType {
  inline val Chrome: "Chrome" = "Chrome"

  inline def values: js.Array[BrowserType] = js.Array(Chrome)
}

type EnabledType = "Disabled" | "Enabled"
object EnabledType {
  inline val Disabled: "Disabled" = "Disabled"
  inline val Enabled: "Enabled" = "Enabled"

  inline def values: js.Array[EnabledType] = js.Array(Disabled, Enabled)
}

type IdentityProviderType = "SAML" | "Facebook" | "Google" | "LoginWithAmazon" | "SignInWithApple" | "OIDC"
object IdentityProviderType {
  inline val SAML: "SAML" = "SAML"
  inline val Facebook: "Facebook" = "Facebook"
  inline val Google: "Google" = "Google"
  inline val LoginWithAmazon: "LoginWithAmazon" = "LoginWithAmazon"
  inline val SignInWithApple: "SignInWithApple" = "SignInWithApple"
  inline val OIDC: "OIDC" = "OIDC"

  inline def values: js.Array[IdentityProviderType] = js.Array(SAML, Facebook, Google, LoginWithAmazon, SignInWithApple, OIDC)
}

type PortalStatus = "Incomplete" | "Pending" | "Active"
object PortalStatus {
  inline val Incomplete: "Incomplete" = "Incomplete"
  inline val Pending: "Pending" = "Pending"
  inline val Active: "Active" = "Active"

  inline def values: js.Array[PortalStatus] = js.Array(Incomplete, Pending, Active)
}

type RendererType = "AppStream"
object RendererType {
  inline val AppStream: "AppStream" = "AppStream"

  inline def values: js.Array[RendererType] = js.Array(AppStream)
}
