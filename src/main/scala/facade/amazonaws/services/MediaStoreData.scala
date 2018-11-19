package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import io.scalajs.nodejs
import facade.amazonaws._

package object mediastoredata {
  type ContentRangePattern = String
  type ContentType = String
  type ETag = String
  type ItemList = js.Array[Item]
  type ItemName = String
  type ItemType = String
  type ListLimit = Int
  type ListPathNaming = String
  type NonNegativeLong = Double
  type PaginationToken = String
  type PathNaming = String
  type PayloadBlob = nodejs.buffer.Buffer | nodejs.stream.Readable | js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type RangePattern = String
  type SHA256Hash = String
  type StorageClass = String
  type StringPrimitive = String
  type TimeStamp = js.Date
  type statusCode = Int
}

package mediastoredata {
  @js.native
  @JSImport("aws-sdk", "MediaStoreData")
  class MediaStoreData(config: AWSConfig) extends js.Object {
    def deleteObject(params: DeleteObjectRequest): Request[DeleteObjectResponse] = js.native
    def describeObject(params: DescribeObjectRequest): Request[DescribeObjectResponse] = js.native
    def getObject(params: GetObjectRequest): Request[GetObjectResponse] = js.native
    def listItems(params: ListItemsRequest): Request[ListItemsResponse] = js.native
    def putObject(params: PutObjectRequest): Request[PutObjectResponse] = js.native
  }

  @js.native
  trait DeleteObjectRequest extends js.Object {
    var Path: js.UndefOr[PathNaming]
  }

  object DeleteObjectRequest {
    def apply(
      Path: js.UndefOr[PathNaming] = js.undefined): DeleteObjectRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Path" -> Path.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteObjectRequest]
    }
  }

  @js.native
  trait DeleteObjectResponse extends js.Object {

  }

  object DeleteObjectResponse {
    def apply(): DeleteObjectResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteObjectResponse]
    }
  }

  @js.native
  trait DescribeObjectRequest extends js.Object {
    var Path: js.UndefOr[PathNaming]
  }

  object DescribeObjectRequest {
    def apply(
      Path: js.UndefOr[PathNaming] = js.undefined): DescribeObjectRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Path" -> Path.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeObjectRequest]
    }
  }

  @js.native
  trait DescribeObjectResponse extends js.Object {
    var LastModified: js.UndefOr[TimeStamp]
    var ContentLength: js.UndefOr[NonNegativeLong]
    var CacheControl: js.UndefOr[StringPrimitive]
    var ETag: js.UndefOr[ETag]
    var ContentType: js.UndefOr[ContentType]
  }

  object DescribeObjectResponse {
    def apply(
      LastModified: js.UndefOr[TimeStamp] = js.undefined,
      ContentLength: js.UndefOr[NonNegativeLong] = js.undefined,
      CacheControl: js.UndefOr[StringPrimitive] = js.undefined,
      ETag: js.UndefOr[ETag] = js.undefined,
      ContentType: js.UndefOr[ContentType] = js.undefined): DescribeObjectResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LastModified" -> LastModified.map { x => x.asInstanceOf[js.Any] },
        "ContentLength" -> ContentLength.map { x => x.asInstanceOf[js.Any] },
        "CacheControl" -> CacheControl.map { x => x.asInstanceOf[js.Any] },
        "ETag" -> ETag.map { x => x.asInstanceOf[js.Any] },
        "ContentType" -> ContentType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeObjectResponse]
    }
  }

  @js.native
  trait GetObjectRequest extends js.Object {
    var Path: js.UndefOr[PathNaming]
    var Range: js.UndefOr[RangePattern]
  }

  object GetObjectRequest {
    def apply(
      Path: js.UndefOr[PathNaming] = js.undefined,
      Range: js.UndefOr[RangePattern] = js.undefined): GetObjectRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Path" -> Path.map { x => x.asInstanceOf[js.Any] },
        "Range" -> Range.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetObjectRequest]
    }
  }

  @js.native
  trait GetObjectResponse extends js.Object {
    var ContentRange: js.UndefOr[ContentRangePattern]
    var StatusCode: js.UndefOr[statusCode]
    var LastModified: js.UndefOr[TimeStamp]
    var Body: js.UndefOr[PayloadBlob]
    var ContentLength: js.UndefOr[NonNegativeLong]
    var CacheControl: js.UndefOr[StringPrimitive]
    var ETag: js.UndefOr[ETag]
    var ContentType: js.UndefOr[ContentType]
  }

  object GetObjectResponse {
    def apply(
      ContentRange: js.UndefOr[ContentRangePattern] = js.undefined,
      StatusCode: js.UndefOr[statusCode] = js.undefined,
      LastModified: js.UndefOr[TimeStamp] = js.undefined,
      Body: js.UndefOr[PayloadBlob] = js.undefined,
      ContentLength: js.UndefOr[NonNegativeLong] = js.undefined,
      CacheControl: js.UndefOr[StringPrimitive] = js.undefined,
      ETag: js.UndefOr[ETag] = js.undefined,
      ContentType: js.UndefOr[ContentType] = js.undefined): GetObjectResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ContentRange" -> ContentRange.map { x => x.asInstanceOf[js.Any] },
        "StatusCode" -> StatusCode.map { x => x.asInstanceOf[js.Any] },
        "LastModified" -> LastModified.map { x => x.asInstanceOf[js.Any] },
        "Body" -> Body.map { x => x.asInstanceOf[js.Any] },
        "ContentLength" -> ContentLength.map { x => x.asInstanceOf[js.Any] },
        "CacheControl" -> CacheControl.map { x => x.asInstanceOf[js.Any] },
        "ETag" -> ETag.map { x => x.asInstanceOf[js.Any] },
        "ContentType" -> ContentType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetObjectResponse]
    }
  }

  /**
   * <p>A metadata entry for a folder or object.</p>
   */
  @js.native
  trait Item extends js.Object {
    var Name: js.UndefOr[ItemName]
    var LastModified: js.UndefOr[TimeStamp]
    var ContentLength: js.UndefOr[NonNegativeLong]
    var ETag: js.UndefOr[ETag]
    var ContentType: js.UndefOr[ContentType]
    var Type: js.UndefOr[ItemType]
  }

  object Item {
    def apply(
      Name: js.UndefOr[ItemName] = js.undefined,
      LastModified: js.UndefOr[TimeStamp] = js.undefined,
      ContentLength: js.UndefOr[NonNegativeLong] = js.undefined,
      ETag: js.UndefOr[ETag] = js.undefined,
      ContentType: js.UndefOr[ContentType] = js.undefined,
      Type: js.UndefOr[ItemType] = js.undefined): Item = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "LastModified" -> LastModified.map { x => x.asInstanceOf[js.Any] },
        "ContentLength" -> ContentLength.map { x => x.asInstanceOf[js.Any] },
        "ETag" -> ETag.map { x => x.asInstanceOf[js.Any] },
        "ContentType" -> ContentType.map { x => x.asInstanceOf[js.Any] },
        "Type" -> Type.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Item]
    }
  }

  object ItemTypeEnum {
    val OBJECT = "OBJECT"
    val FOLDER = "FOLDER"

    val values = IndexedSeq(OBJECT, FOLDER)
  }

  @js.native
  trait ListItemsRequest extends js.Object {
    var Path: js.UndefOr[ListPathNaming]
    var MaxResults: js.UndefOr[ListLimit]
    var NextToken: js.UndefOr[PaginationToken]
  }

  object ListItemsRequest {
    def apply(
      Path: js.UndefOr[ListPathNaming] = js.undefined,
      MaxResults: js.UndefOr[ListLimit] = js.undefined,
      NextToken: js.UndefOr[PaginationToken] = js.undefined): ListItemsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Path" -> Path.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListItemsRequest]
    }
  }

  @js.native
  trait ListItemsResponse extends js.Object {
    var Items: js.UndefOr[ItemList]
    var NextToken: js.UndefOr[PaginationToken]
  }

  object ListItemsResponse {
    def apply(
      Items: js.UndefOr[ItemList] = js.undefined,
      NextToken: js.UndefOr[PaginationToken] = js.undefined): ListItemsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Items" -> Items.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListItemsResponse]
    }
  }

  @js.native
  trait PutObjectRequest extends js.Object {
    var Path: js.UndefOr[PathNaming]
    var Body: js.UndefOr[PayloadBlob]
    var CacheControl: js.UndefOr[StringPrimitive]
    var ContentType: js.UndefOr[ContentType]
    var StorageClass: js.UndefOr[StorageClass]
  }

  object PutObjectRequest {
    def apply(
      Path: js.UndefOr[PathNaming] = js.undefined,
      Body: js.UndefOr[PayloadBlob] = js.undefined,
      CacheControl: js.UndefOr[StringPrimitive] = js.undefined,
      ContentType: js.UndefOr[ContentType] = js.undefined,
      StorageClass: js.UndefOr[StorageClass] = js.undefined): PutObjectRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Path" -> Path.map { x => x.asInstanceOf[js.Any] },
        "Body" -> Body.map { x => x.asInstanceOf[js.Any] },
        "CacheControl" -> CacheControl.map { x => x.asInstanceOf[js.Any] },
        "ContentType" -> ContentType.map { x => x.asInstanceOf[js.Any] },
        "StorageClass" -> StorageClass.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutObjectRequest]
    }
  }

  @js.native
  trait PutObjectResponse extends js.Object {
    var ContentSHA256: js.UndefOr[SHA256Hash]
    var ETag: js.UndefOr[ETag]
    var StorageClass: js.UndefOr[StorageClass]
  }

  object PutObjectResponse {
    def apply(
      ContentSHA256: js.UndefOr[SHA256Hash] = js.undefined,
      ETag: js.UndefOr[ETag] = js.undefined,
      StorageClass: js.UndefOr[StorageClass] = js.undefined): PutObjectResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ContentSHA256" -> ContentSHA256.map { x => x.asInstanceOf[js.Any] },
        "ETag" -> ETag.map { x => x.asInstanceOf[js.Any] },
        "StorageClass" -> StorageClass.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutObjectResponse]
    }
  }

  object StorageClassEnum {
    val TEMPORAL = "TEMPORAL"

    val values = IndexedSeq(TEMPORAL)
  }
}
