package facade.amazonaws.credentials

import facade.amazonaws.AWSCredentials

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@js.native
@JSImport("aws-sdk/lib/node_loader", "EnvironmentCredentials", "AWS.EnvironmentCredentials")
class EnvironmentCredentials(envPrefix: String) extends AWSCredentials {}
