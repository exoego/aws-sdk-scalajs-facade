package facade.amazonaws

import org.scalatest.funsuite.AnyFunSuite

class CoreTest extends AnyFunSuite {
  test("AWS Object is defined") {
    assert(AWS.config !== null)
  }

  test("AWS.Credentials is constructor") {
    val cred = new AWSCredentials()
    assert(cred.expiryWindow === 15)
  }

  test("AWS.Endpoint is constructor") {
    val endpoint = new Endpoint("http://localhost")
    assert(endpoint.hostname === "localhost")
  }

  test("AWS.HttpRequest is constructor") {
    val http = new HttpRequest(new Endpoint("http://localhost"), "ap-northeast-1")
    assert(http.endpoint.hostname === "localhost")
    assert(http.method === "POST")
  }
}
