package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

package object ssooidc {
  type AccessToken = String
  type AuthCode = String
  type ClientId = String
  type ClientName = String
  type ClientSecret = String
  type ClientType = String
  type DeviceCode = String
  type ExpirationInSeconds = Int
  type GrantType = String
  type IdToken = String
  type IntervalInSeconds = Int
  type LongTimeStampType = Double
  type RefreshToken = String
  type Scope = String
  type Scopes = js.Array[Scope]
  type TokenType = String
  type URI = String
  type UserCode = String

  implicit final class SSOOIDCOps(private val service: SSOOIDC) extends AnyVal {

    @inline def createTokenFuture(params: CreateTokenRequest): Future[CreateTokenResponse] = service.createToken(params).promise().toFuture
    @inline def registerClientFuture(params: RegisterClientRequest): Future[RegisterClientResponse] = service.registerClient(params).promise().toFuture
    @inline def startDeviceAuthorizationFuture(params: StartDeviceAuthorizationRequest): Future[StartDeviceAuthorizationResponse] = service.startDeviceAuthorization(params).promise().toFuture

  }
}

package ssooidc {
  @js.native
  @JSImport("aws-sdk", "SSOOIDC", "AWS.SSOOIDC")
  class SSOOIDC() extends js.Object {
    def this(config: AWSConfig) = this()

    def createToken(params: CreateTokenRequest): Request[CreateTokenResponse] = js.native
    def registerClient(params: RegisterClientRequest): Request[RegisterClientResponse] = js.native
    def startDeviceAuthorization(params: StartDeviceAuthorizationRequest): Request[StartDeviceAuthorizationResponse] = js.native
  }

  @js.native
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

  object CreateTokenRequest {
    @inline
    def apply(
        clientId: ClientId,
        clientSecret: ClientSecret,
        deviceCode: DeviceCode,
        grantType: GrantType,
        code: js.UndefOr[AuthCode] = js.undefined,
        redirectUri: js.UndefOr[URI] = js.undefined,
        refreshToken: js.UndefOr[RefreshToken] = js.undefined,
        scope: js.UndefOr[Scopes] = js.undefined
    ): CreateTokenRequest = {
      val __obj = js.Dynamic.literal(
        "clientId" -> clientId.asInstanceOf[js.Any],
        "clientSecret" -> clientSecret.asInstanceOf[js.Any],
        "deviceCode" -> deviceCode.asInstanceOf[js.Any],
        "grantType" -> grantType.asInstanceOf[js.Any]
      )

      code.foreach(__v => __obj.updateDynamic("code")(__v.asInstanceOf[js.Any]))
      redirectUri.foreach(__v => __obj.updateDynamic("redirectUri")(__v.asInstanceOf[js.Any]))
      refreshToken.foreach(__v => __obj.updateDynamic("refreshToken")(__v.asInstanceOf[js.Any]))
      scope.foreach(__v => __obj.updateDynamic("scope")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateTokenRequest]
    }
  }

  @js.native
  trait CreateTokenResponse extends js.Object {
    var accessToken: js.UndefOr[AccessToken]
    var expiresIn: js.UndefOr[ExpirationInSeconds]
    var idToken: js.UndefOr[IdToken]
    var refreshToken: js.UndefOr[RefreshToken]
    var tokenType: js.UndefOr[TokenType]
  }

  object CreateTokenResponse {
    @inline
    def apply(
        accessToken: js.UndefOr[AccessToken] = js.undefined,
        expiresIn: js.UndefOr[ExpirationInSeconds] = js.undefined,
        idToken: js.UndefOr[IdToken] = js.undefined,
        refreshToken: js.UndefOr[RefreshToken] = js.undefined,
        tokenType: js.UndefOr[TokenType] = js.undefined
    ): CreateTokenResponse = {
      val __obj = js.Dynamic.literal()
      accessToken.foreach(__v => __obj.updateDynamic("accessToken")(__v.asInstanceOf[js.Any]))
      expiresIn.foreach(__v => __obj.updateDynamic("expiresIn")(__v.asInstanceOf[js.Any]))
      idToken.foreach(__v => __obj.updateDynamic("idToken")(__v.asInstanceOf[js.Any]))
      refreshToken.foreach(__v => __obj.updateDynamic("refreshToken")(__v.asInstanceOf[js.Any]))
      tokenType.foreach(__v => __obj.updateDynamic("tokenType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateTokenResponse]
    }
  }

  @js.native
  trait RegisterClientRequest extends js.Object {
    var clientName: ClientName
    var clientType: ClientType
    var scopes: js.UndefOr[Scopes]
  }

  object RegisterClientRequest {
    @inline
    def apply(
        clientName: ClientName,
        clientType: ClientType,
        scopes: js.UndefOr[Scopes] = js.undefined
    ): RegisterClientRequest = {
      val __obj = js.Dynamic.literal(
        "clientName" -> clientName.asInstanceOf[js.Any],
        "clientType" -> clientType.asInstanceOf[js.Any]
      )

      scopes.foreach(__v => __obj.updateDynamic("scopes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RegisterClientRequest]
    }
  }

  @js.native
  trait RegisterClientResponse extends js.Object {
    var authorizationEndpoint: js.UndefOr[URI]
    var clientId: js.UndefOr[ClientId]
    var clientIdIssuedAt: js.UndefOr[LongTimeStampType]
    var clientSecret: js.UndefOr[ClientSecret]
    var clientSecretExpiresAt: js.UndefOr[LongTimeStampType]
    var tokenEndpoint: js.UndefOr[URI]
  }

  object RegisterClientResponse {
    @inline
    def apply(
        authorizationEndpoint: js.UndefOr[URI] = js.undefined,
        clientId: js.UndefOr[ClientId] = js.undefined,
        clientIdIssuedAt: js.UndefOr[LongTimeStampType] = js.undefined,
        clientSecret: js.UndefOr[ClientSecret] = js.undefined,
        clientSecretExpiresAt: js.UndefOr[LongTimeStampType] = js.undefined,
        tokenEndpoint: js.UndefOr[URI] = js.undefined
    ): RegisterClientResponse = {
      val __obj = js.Dynamic.literal()
      authorizationEndpoint.foreach(__v => __obj.updateDynamic("authorizationEndpoint")(__v.asInstanceOf[js.Any]))
      clientId.foreach(__v => __obj.updateDynamic("clientId")(__v.asInstanceOf[js.Any]))
      clientIdIssuedAt.foreach(__v => __obj.updateDynamic("clientIdIssuedAt")(__v.asInstanceOf[js.Any]))
      clientSecret.foreach(__v => __obj.updateDynamic("clientSecret")(__v.asInstanceOf[js.Any]))
      clientSecretExpiresAt.foreach(__v => __obj.updateDynamic("clientSecretExpiresAt")(__v.asInstanceOf[js.Any]))
      tokenEndpoint.foreach(__v => __obj.updateDynamic("tokenEndpoint")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RegisterClientResponse]
    }
  }

  @js.native
  trait StartDeviceAuthorizationRequest extends js.Object {
    var clientId: ClientId
    var clientSecret: ClientSecret
    var startUrl: URI
  }

  object StartDeviceAuthorizationRequest {
    @inline
    def apply(
        clientId: ClientId,
        clientSecret: ClientSecret,
        startUrl: URI
    ): StartDeviceAuthorizationRequest = {
      val __obj = js.Dynamic.literal(
        "clientId" -> clientId.asInstanceOf[js.Any],
        "clientSecret" -> clientSecret.asInstanceOf[js.Any],
        "startUrl" -> startUrl.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[StartDeviceAuthorizationRequest]
    }
  }

  @js.native
  trait StartDeviceAuthorizationResponse extends js.Object {
    var deviceCode: js.UndefOr[DeviceCode]
    var expiresIn: js.UndefOr[ExpirationInSeconds]
    var interval: js.UndefOr[IntervalInSeconds]
    var userCode: js.UndefOr[UserCode]
    var verificationUri: js.UndefOr[URI]
    var verificationUriComplete: js.UndefOr[URI]
  }

  object StartDeviceAuthorizationResponse {
    @inline
    def apply(
        deviceCode: js.UndefOr[DeviceCode] = js.undefined,
        expiresIn: js.UndefOr[ExpirationInSeconds] = js.undefined,
        interval: js.UndefOr[IntervalInSeconds] = js.undefined,
        userCode: js.UndefOr[UserCode] = js.undefined,
        verificationUri: js.UndefOr[URI] = js.undefined,
        verificationUriComplete: js.UndefOr[URI] = js.undefined
    ): StartDeviceAuthorizationResponse = {
      val __obj = js.Dynamic.literal()
      deviceCode.foreach(__v => __obj.updateDynamic("deviceCode")(__v.asInstanceOf[js.Any]))
      expiresIn.foreach(__v => __obj.updateDynamic("expiresIn")(__v.asInstanceOf[js.Any]))
      interval.foreach(__v => __obj.updateDynamic("interval")(__v.asInstanceOf[js.Any]))
      userCode.foreach(__v => __obj.updateDynamic("userCode")(__v.asInstanceOf[js.Any]))
      verificationUri.foreach(__v => __obj.updateDynamic("verificationUri")(__v.asInstanceOf[js.Any]))
      verificationUriComplete.foreach(__v => __obj.updateDynamic("verificationUriComplete")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartDeviceAuthorizationResponse]
    }
  }
}
