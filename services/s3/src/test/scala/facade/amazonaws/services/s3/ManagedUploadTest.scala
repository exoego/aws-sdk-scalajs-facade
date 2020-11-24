package facade.amazonaws.services.s3.managedupload

import facade.amazonaws.AWSConfig
import facade.amazonaws.services.s3
import org.scalatest.funsuite.AsyncFunSuite

import scala.concurrent.ExecutionContext

class ManagedUploadTest extends AsyncFunSuite {
  override implicit val executionContext = ExecutionContext.Implicits.global

  test("ManagedUpload") {
    val instance = new ManagedUpload(ManagedUploadOptions(
      params = s3.PutObjectRequest(
        Bucket = "test",
        Key = "test",
        Body = ""
      ),
      service = new s3.S3(AWSConfig(endpoint = "localhost"))
    ))

    assert(instance.maxTotalParts > 0)
    assert(instance.minPartSize > 0)
    instance.sendFuture().failed.map { e =>
      succeed
    }
  }
}
