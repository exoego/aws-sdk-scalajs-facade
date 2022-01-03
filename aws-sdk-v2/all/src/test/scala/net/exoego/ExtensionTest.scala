package net.exoego

import facade.amazonaws._
import facade.amazonaws.services.s3
import org.scalatest.funsuite.AnyFunSuite

class ExtensionTest extends AnyFunSuite {
  ignore("offer extension method") {
    AWS
      .S3()
      .getObjectFuture(
        s3.GetObjectRequest(
          Bucket = "test",
          Key = "hoge.jpg"
        )
      )
  }
}
