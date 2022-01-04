package facade.amazonaws.credentials

import facade.amazonaws.AWSCredentials

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@js.native
@JSImport("aws-sdk/lib/node_loader", "EC2MetadataCredentials", "AWS.EC2MetadataCredentials")
class EC2MetadataCredentials() extends AWSCredentials {
  def this(options: EC2MetadataCredentialsOptions) = this()
}

trait EC2MetadataCredentialsOptions extends js.Object {
  var httpOptions: js.UndefOr[EC2MetadataCredentialsOptions.HttpOptions]
  var maxRetries: js.UndefOr[Double]
}
object EC2MetadataCredentialsOptions {
  def apply(
      httpOptions: js.UndefOr[EC2MetadataCredentialsOptions.HttpOptions] = js.undefined,
      maxRetries: js.UndefOr[Double] = js.undefined
  ): EC2MetadataCredentialsOptions = {
    val _obj$ = js.Dynamic.literal(
    )
    httpOptions.foreach(_v => _obj$.updateDynamic("httpOptions")(_v.asInstanceOf[js.Any]))
    maxRetries.foreach(_v => _obj$.updateDynamic("maxRetries")(_v.asInstanceOf[js.Any]))
    _obj$.asInstanceOf[EC2MetadataCredentialsOptions]
  }

  trait HttpOptions extends js.Object {
    var timeout: js.UndefOr[Double]
    var connectTimeout: js.UndefOr[Double]
  }

  object HttpOptions {
    def apply(
        timeout: js.UndefOr[Double] = js.undefined,
        connectTimeout: js.UndefOr[Double] = js.undefined
    ): HttpOptions = {
      val _obj$ = js.Dynamic.literal(
      )
      timeout.foreach(_v => _obj$.updateDynamic("timeout")(_v.asInstanceOf[js.Any]))
      connectTimeout.foreach(_v => _obj$.updateDynamic("connectTimeout")(_v.asInstanceOf[js.Any]))
      _obj$.asInstanceOf[HttpOptions]
    }
  }
}
