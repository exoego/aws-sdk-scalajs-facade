package facade.amazonaws.credentials

import facade.amazonaws.AWSCredentials

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@js.native
@JSImport("aws-sdk/lib/node_loader", "FileSystemCredentials", "AWS.FileSystemCredentials")
class FileSystemCredentials(val filename: String) extends AWSCredentials {}
