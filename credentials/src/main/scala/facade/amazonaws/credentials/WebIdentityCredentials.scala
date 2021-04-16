package facade.amazonaws.credentials

import facade.amazonaws.services.sts
import facade.amazonaws.{AWSConfig, AWSCredentials}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@js.native
@JSImport("aws-sdk/lib/node_loader", "WebIdentityCredentials", "AWS.WebIdentityCredentials")
class WebIdentityCredentials() extends AWSCredentials {
  def this(options: sts.AssumeRoleWithWebIdentityRequest, clientConfig: AWSConfig) = this()
  def this(options: sts.AssumeRoleWithWebIdentityRequest) = this()

  def data: sts.AssumeRoleWithWebIdentityResponse = js.native
  def params: sts.AssumeRoleWithWebIdentityRequest = js.native
}
