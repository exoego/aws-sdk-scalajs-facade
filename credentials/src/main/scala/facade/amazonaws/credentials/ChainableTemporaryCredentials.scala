package facade.amazonaws.credentials

import facade.amazonaws.{AWSConfig, AWSCredentials}
import facade.amazonaws.services.sts

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

@js.native
@JSImport("aws-sdk/lib/node_loader", "ChainableTemporaryCredentials", "AWS.ChainableTemporaryCredentials")
class ChainableTemporaryCredentials() extends AWSCredentials {
  def this(options: ChainableTemporaryCredentialsOptions) = this()

  def service: sts.STS = js.native
}

trait ChainableTemporaryCredentialsOptions extends js.Object {
  var params: js.UndefOr[sts.AssumeRoleRequest | sts.GetSessionTokenRequest]
  var masterCredentials: js.UndefOr[AWSCredentials]
  var stsConfig: js.UndefOr[AWSConfig] // js.UndefOr[ServiceConfigurationOptions with sts.ClientApiVersions]
  var tokenCodeFn: js.UndefOr[js.Function2[String, js.Function2[js.Error, String, Unit], Unit]]
}

object ChainableTemporaryCredentialsOptions {
  def apply(
      params: js.UndefOr[sts.AssumeRoleRequest | sts.GetSessionTokenRequest] = js.undefined,
      masterCredentials: js.UndefOr[AWSCredentials] = js.undefined,
      stsConfig: js.UndefOr[AWSConfig] = js.undefined, // js.UndefOr[ServiceConfigurationOptions with sts.ClientApiVersions]
      tokenCodeFn: js.UndefOr[js.Function2[String, js.Function2[js.Error, String, Unit], Unit]] = js.undefined
  ): ChainableTemporaryCredentialsOptions = {
    val _obj$ = js.Dynamic.literal(
    )
    params.foreach(_v => _obj$.updateDynamic("params")(_v.asInstanceOf[js.Any]))
    masterCredentials.foreach(_v => _obj$.updateDynamic("masterCredentials")(_v.asInstanceOf[js.Any]))
    stsConfig.foreach(_v => _obj$.updateDynamic("stsConfig")(_v.asInstanceOf[js.Any]))
    tokenCodeFn.foreach(_v => _obj$.updateDynamic("tokenCodeFn")(_v.asInstanceOf[js.Any]))
    _obj$.asInstanceOf[ChainableTemporaryCredentialsOptions]
  }
}
