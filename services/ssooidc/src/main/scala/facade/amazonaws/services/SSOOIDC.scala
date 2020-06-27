package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object ssooidc {
  type AccessToken         = String
  type AuthCode            = String
  type ClientId            = String
  type ClientName          = String
  type ClientSecret        = String
  type ClientType          = String
  type DeviceCode          = String
  type ExpirationInSeconds = Int
  type GrantType           = String
  type IdToken             = String
  type IntervalInSeconds   = Int
  type LongTimeStampType   = Double
  type RefreshToken        = String
  type Scope               = String
  type Scopes              = js.Array[Scope]
  type TokenType           = String
  type URI                 = String
  type UserCode            = String

  implicit final class SSOOIDCOps(private val service: SSOOIDC) extends AnyVal {

    @inline def createTokenFuture(params: CreateTokenRequest): Future[CreateTokenResponse] =
      service.createToken(params).promise().toFuture
    @inline def registerClientFuture(params: RegisterClientRequest): Future[RegisterClientResponse] =
      service.registerClient(params).promise().toFuture
    @inline def startDeviceAuthorizationFuture(
        params: StartDeviceAuthorizationRequest
    ): Future[StartDeviceAuthorizationResponse] = service.startDeviceAuthorization(params).promise().toFuture
  }
}

package ssooidc {
  @js.native
  @JSImport("aws-sdk", "SSOOIDC")
  class SSOOIDC() extends js.Object {
    def this(config: AWSConfig) = this()

    def createToken(params: CreateTokenRequest): Request[CreateTokenResponse]          = js.native
    def registerClient(params: RegisterClientRequest): Request[RegisterClientResponse] = js.native
    def startDeviceAuthorization(params: StartDeviceAuthorizationRequest): Request[StartDeviceAuthorizationResponse] =
      js.native
  }

  @js.native
  @Factory
  trait CreateTokenRequest extends js.Object {
    var clientId: ClientId
    var clientSecret: ClientSecret
    var deviceCode: DeviceCode
    var grantType: GrantType
    var code: js.UndefOr[AuthCode]
    var redirectUri: js.UndefOr[URI]
    var refreshToken: js.UndefOr[RefreshToken]
    var scope: js.UndefOr[Scopes]
  }

  @js.native
  @Factory
  trait CreateTokenResponse extends js.Object {
    var accessToken: js.UndefOr[AccessToken]
    var expiresIn: js.UndefOr[ExpirationInSeconds]
    var idToken: js.UndefOr[IdToken]
    var refreshToken: js.UndefOr[RefreshToken]
    var tokenType: js.UndefOr[TokenType]
  }

  @js.native
  @Factory
  trait RegisterClientRequest extends js.Object {
    var clientName: ClientName
    var clientType: ClientType
    var scopes: js.UndefOr[Scopes]
  }

  @js.native
  @Factory
  trait RegisterClientResponse extends js.Object {
    var authorizationEndpoint: js.UndefOr[URI]
    var clientId: js.UndefOr[ClientId]
    var clientIdIssuedAt: js.UndefOr[LongTimeStampType]
    var clientSecret: js.UndefOr[ClientSecret]
    var clientSecretExpiresAt: js.UndefOr[LongTimeStampType]
    var tokenEndpoint: js.UndefOr[URI]
  }

  @js.native
  @Factory
  trait StartDeviceAuthorizationRequest extends js.Object {
    var clientId: ClientId
    var clientSecret: ClientSecret
    var startUrl: URI
  }

  @js.native
  @Factory
  trait StartDeviceAuthorizationResponse extends js.Object {
    var deviceCode: js.UndefOr[DeviceCode]
    var expiresIn: js.UndefOr[ExpirationInSeconds]
    var interval: js.UndefOr[IntervalInSeconds]
    var userCode: js.UndefOr[UserCode]
    var verificationUri: js.UndefOr[URI]
    var verificationUriComplete: js.UndefOr[URI]
  }
}
