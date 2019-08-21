package net.exoego

import facade.amazonaws.services.cloudfront.signer
import org.scalatest._

import scala.scalajs.js

class CloudfrontSignerTest extends FunSuite {

  test("SignerOptionsWithPolicy.apply(PolicyStatement)") {
    val tPolicy = new signer.PolicyStatements(
      js.Array(
        new signer.PolicyStatement(
          Resource = "https://example.com/hoge/*",
          Condition = new signer.PolicyStatementCondition(
            new signer.DateLessThan(100)
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
