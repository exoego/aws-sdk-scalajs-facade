package net.exoego

import facade.amazonaws.AWS
import facade.amazonaws.services.s3
import org.scalatest._

class ExtensionTest extends FunSuite {
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
