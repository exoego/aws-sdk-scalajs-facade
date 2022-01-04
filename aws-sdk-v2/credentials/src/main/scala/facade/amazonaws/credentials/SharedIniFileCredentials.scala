package facade.amazonaws.credentials

import facade.amazonaws.AWSCredentials
import facade.amazonaws.HttpOptions

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@js.native
@JSImport("aws-sdk/lib/node_loader", "SharedIniFileCredentials", "AWS.SharedIniFileCredentials")
class SharedIniFileCredentials() extends AWSCredentials {
  def this(options: SharedIniFileCredentialsOptions) = this()
}

trait SharedIniFileCredentialsOptions extends js.Object {
  var profile: js.UndefOr[String]
  var filename: js.UndefOr[String]
  var disableAssumeRole: js.UndefOr[Boolean]
  var tokenCodeFn: js.UndefOr[js.Function2[String, js.Function2[js.Error, String, Unit], Unit]]
  var httpOptions: js.UndefOr[HttpOptions]
  var callback: js.UndefOr[js.Function1[js.Error, Unit]]
}

object SharedIniFileCredentialsOptions {
  def apply(
      profile: js.UndefOr[String] = js.undefined,
      filename: js.UndefOr[String] = js.undefined,
      disableAssumeRole: js.UndefOr[Boolean] = js.undefined,
      tokenCodeFn: js.UndefOr[js.Function2[String, js.Function2[js.Error, String, Unit], Unit]] = js.undefined,
      httpOptions: js.UndefOr[HttpOptions] = js.undefined,
      callback: js.UndefOr[js.Function1[js.Error, Unit]] = js.undefined
  ): SharedIniFileCredentialsOptions = {
    val _obj$ = js.Dynamic.literal(
    )
    profile.foreach(_v => _obj$.updateDynamic("profile")(_v.asInstanceOf[js.Any]))
    filename.foreach(_v => _obj$.updateDynamic("filename")(_v.asInstanceOf[js.Any]))
    disableAssumeRole.foreach(_v => _obj$.updateDynamic("disableAssumeRole")(_v.asInstanceOf[js.Any]))
    tokenCodeFn.foreach(_v => _obj$.updateDynamic("tokenCodeFn")(_v.asInstanceOf[js.Any]))
    httpOptions.foreach(_v => _obj$.updateDynamic("httpOptions")(_v.asInstanceOf[js.Any]))
    callback.foreach(_v => _obj$.updateDynamic("callback")(_v.asInstanceOf[js.Any]))
    _obj$.asInstanceOf[SharedIniFileCredentialsOptions]
  }
}
