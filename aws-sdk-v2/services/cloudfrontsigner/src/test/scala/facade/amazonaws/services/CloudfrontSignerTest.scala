package facade.amazonaws.services

import facade.amazonaws.services.cloudfront.signer
import facade.amazonaws.services.cloudfront.signer.CloudFrontSigner
import org.scalatest.funsuite.AnyFunSuite

import scala.scalajs.js

class CloudfrontSignerTest extends AnyFunSuite {
  test("constructor") {
    val o = new CloudFrontSigner("keyPairId", "privateKey")
    assert(js.typeOf(o.asInstanceOf[js.Dynamic].getSignedCookie.asInstanceOf[js.Any]) === "function")
    assert(js.typeOf(o.asInstanceOf[js.Dynamic].getSignedUrl.asInstanceOf[js.Any]) === "function")
  }

  test("SignerOptionsWithPolicy.apply(PolicyStatement)") {
    val tPolicy = signer.PolicyStatements(
      js.Array(
        signer.PolicyStatement(
          Resource = "https://example.com/hoge/*",
          Condition = signer.PolicyStatementCondition(
            signer.DateConstraint(100)
          )
        )
      )
    )
    assert(
      signer
        .SignerOptionsWithPolicy(tPolicy)
        .policy === """{"Statement":[{"Resource":"https://example.com/hoge/*","Condition":{"DateLessThan":{"AWS:EpochTime":100}}}]}"""
    )
  }
}
