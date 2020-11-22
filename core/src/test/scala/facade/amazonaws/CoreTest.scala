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
}
