package facade.amazonaws.credentials

import facade.amazonaws.AWSCredentials
import facade.amazonaws.HttpOptions

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@js.native
@JSImport("aws-sdk/lib/node_loader", "ProcessCredentials", "AWS.ProcessCredentials")
class ProcessCredentials() extends AWSCredentials {
  def this(options: ProcessCredentialsOptions) = this()
}

trait ProcessCredentialsOptions extends js.Object {
  var profile: js.UndefOr[String]
  var filename: js.UndefOr[String]
  var httpOptions: js.UndefOr[HttpOptions]
}

object ProcessCredentialsOptions {
  def apply(
      profile: js.UndefOr[String] = js.undefined,
      filename: js.UndefOr[String] = js.undefined,
      httpOptions: js.UndefOr[HttpOptions] = js.undefined
  ): ProcessCredentialsOptions = {
    val _obj$ = js.Dynamic.literal(
    )
    profile.foreach(_v => _obj$.updateDynamic("profile")(_v.asInstanceOf[js.Any]))
    filename.foreach(_v => _obj$.updateDynamic("filename")(_v.asInstanceOf[js.Any]))
    httpOptions.foreach(_v => _obj$.updateDynamic("httpOptions")(_v.asInstanceOf[js.Any]))
    _obj$.asInstanceOf[ProcessCredentialsOptions]
  }
}
