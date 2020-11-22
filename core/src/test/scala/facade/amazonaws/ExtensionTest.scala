package facade.amazonaws

import org.scalatest.funsuite.AnyFunSuite

import scala.scalajs.js

class ExtensionTest extends AnyFunSuite {
  test("AWS object") {
    assert((AWS.config !== null) && (AWS.config !== js.undefined))
    assert(AWS.config.s3.isEmpty)
    AWS.config.s3 = S3ParamsWithEndpoint()
    assert(AWS.config.s3.nonEmpty)
  }

  test("Endpoint") {
    val o = new Endpoint("http://localhost:1234")
    assert(js.typeOf(o.host) === "string")
  }

  test("HttpRequest") {
    val o = new HttpRequest(
      endpoint = new Endpoint("http://localhost:1234"),
      region = "foo"
    )
    assert(js.typeOf(o.body) === "string")
  }

  test("Credentials") {
    val o = new AWSCredentials("accessKeyID", "secretAccessKey")
    assert(js.typeOf(o.asInstanceOf[js.Dynamic].getPromise.asInstanceOf[js.Any]) === "function")
  }
}
