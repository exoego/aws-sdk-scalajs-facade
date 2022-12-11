package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import scala.language.implicitConversions
import facade.amazonaws._

package object appconfigdata {
  type Identifier = String
  type OptionalPollSeconds = Int
  type SyntheticGetLatestConfigurationResponseBlob = js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type Token = String

  final class AppConfigDataOps(private val service: AppConfigData) extends AnyVal {

    @inline def getLatestConfigurationFuture(params: GetLatestConfigurationRequest): Future[GetLatestConfigurationResponse] = service.getLatestConfiguration(params).promise().toFuture
    @inline def startConfigurationSessionFuture(params: StartConfigurationSessionRequest): Future[StartConfigurationSessionResponse] = service.startConfigurationSession(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/appconfigdata", JSImport.Namespace, "AWS.AppConfigData")
  class AppConfigData() extends js.Object {
    def this(config: AWSConfig) = this()

    def getLatestConfiguration(params: GetLatestConfigurationRequest): Request[GetLatestConfigurationResponse] = js.native
    def startConfigurationSession(params: StartConfigurationSessionRequest): Request[StartConfigurationSessionResponse] = js.native
  }
  object AppConfigData {
    @inline implicit def toOps(service: AppConfigData): AppConfigDataOps = {
      new AppConfigDataOps(service)
    }
  }

  @js.native
  trait GetLatestConfigurationRequest extends js.Object {
    var ConfigurationToken: Token
  }

  object GetLatestConfigurationRequest {
    @inline
    def apply(
        ConfigurationToken: Token
    ): GetLatestConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "ConfigurationToken" -> ConfigurationToken.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetLatestConfigurationRequest]
    }
  }

  @js.native
  trait GetLatestConfigurationResponse extends js.Object {
    var Configuration: js.UndefOr[SyntheticGetLatestConfigurationResponseBlob]
    var ContentType: js.UndefOr[String]
    var NextPollConfigurationToken: js.UndefOr[Token]
    var NextPollIntervalInSeconds: js.UndefOr[Int]
  }

  object GetLatestConfigurationResponse {
    @inline
    def apply(
        Configuration: js.UndefOr[SyntheticGetLatestConfigurationResponseBlob] = js.undefined,
        ContentType: js.UndefOr[String] = js.undefined,
        NextPollConfigurationToken: js.UndefOr[Token] = js.undefined,
        NextPollIntervalInSeconds: js.UndefOr[Int] = js.undefined
    ): GetLatestConfigurationResponse = {
      val __obj = js.Dynamic.literal()
      Configuration.foreach(__v => __obj.updateDynamic("Configuration")(__v.asInstanceOf[js.Any]))
      ContentType.foreach(__v => __obj.updateDynamic("ContentType")(__v.asInstanceOf[js.Any]))
      NextPollConfigurationToken.foreach(__v => __obj.updateDynamic("NextPollConfigurationToken")(__v.asInstanceOf[js.Any]))
      NextPollIntervalInSeconds.foreach(__v => __obj.updateDynamic("NextPollIntervalInSeconds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetLatestConfigurationResponse]
    }
  }

  @js.native
  trait StartConfigurationSessionRequest extends js.Object {
    var ApplicationIdentifier: Identifier
    var ConfigurationProfileIdentifier: Identifier
    var EnvironmentIdentifier: Identifier
    var RequiredMinimumPollIntervalInSeconds: js.UndefOr[OptionalPollSeconds]
  }

  object StartConfigurationSessionRequest {
    @inline
    def apply(
        ApplicationIdentifier: Identifier,
        ConfigurationProfileIdentifier: Identifier,
        EnvironmentIdentifier: Identifier,
        RequiredMinimumPollIntervalInSeconds: js.UndefOr[OptionalPollSeconds] = js.undefined
    ): StartConfigurationSessionRequest = {
      val __obj = js.Dynamic.literal(
        "ApplicationIdentifier" -> ApplicationIdentifier.asInstanceOf[js.Any],
        "ConfigurationProfileIdentifier" -> ConfigurationProfileIdentifier.asInstanceOf[js.Any],
        "EnvironmentIdentifier" -> EnvironmentIdentifier.asInstanceOf[js.Any]
      )

      RequiredMinimumPollIntervalInSeconds.foreach(__v => __obj.updateDynamic("RequiredMinimumPollIntervalInSeconds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartConfigurationSessionRequest]
    }
  }

  @js.native
  trait StartConfigurationSessionResponse extends js.Object {
    var InitialConfigurationToken: js.UndefOr[Token]
  }

  object StartConfigurationSessionResponse {
    @inline
    def apply(
        InitialConfigurationToken: js.UndefOr[Token] = js.undefined
    ): StartConfigurationSessionResponse = {
      val __obj = js.Dynamic.literal()
      InitialConfigurationToken.foreach(__v => __obj.updateDynamic("InitialConfigurationToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartConfigurationSessionResponse]
    }
  }
}
