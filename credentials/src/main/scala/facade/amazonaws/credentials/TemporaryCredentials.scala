package facade.amazonaws.credentials

import facade.amazonaws.AWSCredentials
import facade.amazonaws.services.sts._

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@js.native
@JSImport("aws-sdk/lib/node_loader", "TemporaryCredentials", "AWS.TemporaryCredentials")
class TemporaryCredentials() extends AWSCredentials {
  def this(options: AssumeRoleRequest, masterCredentials: AWSCredentials) = this()
  def this(options: AssumeRoleRequest) = this()

  def this(options: GetSessionTokenRequest, masterCredentials: AWSCredentials) = this()
  def this(options: GetSessionTokenRequest) = this()

  var masterCredentials: AWSCredentials = js.native
}
