package facade.amazonaws.services

import facade.amazonaws.services.cloudfront.signer._
import org.scalatest.funsuite.AnyFunSuite

import scala.scalajs.js

class SignerTest extends AnyFunSuite {
  test("constructor") {
    val o = new CloudFrontSigner("keyPairId", "privateKey")
    assert(js.typeOf(o.asInstanceOf[js.Dynamic].getSignedCookie.asInstanceOf[js.Any]) === "function")
    assert(js.typeOf(o.asInstanceOf[js.Dynamic].getSignedUrl.asInstanceOf[js.Any]) === "function")
  }
}
