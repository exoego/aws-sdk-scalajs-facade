package facade.amazonaws.services.s3

import facade.amazonaws.AWSConfig
import org.scalatest.funsuite.AsyncFunSuite

import scala.concurrent.ExecutionContext

class S3Test extends AsyncFunSuite {
  override implicit val executionContext = ExecutionContext.Implicits.global

  val service = new S3(AWSConfig(endpoint = "localhost"))

  test("upload") {
    val upload = service.upload(PutObjectRequest(
      Bucket = "test",
      Key = "test",
      Body = ""
    ))

    assert(upload.maxTotalParts > 0)
    assert(upload.minPartSize > 0)

    upload.sendFuture().failed.map { e =>
      assert(e.getMessage.startsWith("UnknownEndpoint:"))
    }
  }

  test("uploadFuture") {
    val uploadFuture = service.uploadFuture(PutObjectRequest(
      Bucket = "test",
      Key = "test",
      Body = ""
    ))

    uploadFuture.failed.map { e =>
      assert(e.getMessage.startsWith("UnknownEndpoint:"))
    }
  }
}
