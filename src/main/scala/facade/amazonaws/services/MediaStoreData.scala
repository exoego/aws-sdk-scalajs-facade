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
    var Path: PathNaming
  }

  object DeleteObjectRequest {
    def apply(
      Path: PathNaming): DeleteObjectRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Path" -> Path.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

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
    var Path: PathNaming
  }

  object DescribeObjectRequest {
    def apply(
      Path: PathNaming): DescribeObjectRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Path" -> Path.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeObjectRequest]
    }
  }

  @js.native
  trait DescribeObjectResponse extends js.Object {
    var CacheControl: js.UndefOr[StringPrimitive]
    var ContentLength: js.UndefOr[NonNegativeLong]
    var ContentType: js.UndefOr[ContentType]
    var ETag: js.UndefOr[ETag]
    var LastModified: js.UndefOr[TimeStamp]
  }

  object DescribeObjectResponse {
    def apply(
      CacheControl: js.UndefOr[StringPrimitive] = js.undefined,
      ContentLength: js.UndefOr[NonNegativeLong] = js.undefined,
      ContentType: js.UndefOr[ContentType] = js.undefined,
      ETag: js.UndefOr[ETag] = js.undefined,
      LastModified: js.UndefOr[TimeStamp] = js.undefined): DescribeObjectResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CacheControl" -> CacheControl.map { x => x.asInstanceOf[js.Any] },
        "ContentLength" -> ContentLength.map { x => x.asInstanceOf[js.Any] },
        "ContentType" -> ContentType.map { x => x.asInstanceOf[js.Any] },
        "ETag" -> ETag.map { x => x.asInstanceOf[js.Any] },
        "LastModified" -> LastModified.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeObjectResponse]
    }
  }

  @js.native
  trait GetObjectRequest extends js.Object {
    var Path: PathNaming
    var Range: js.UndefOr[RangePattern]
  }

  object GetObjectRequest {
    def apply(
      Path: PathNaming,
      Range: js.UndefOr[RangePattern] = js.undefined): GetObjectRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Path" -> Path.asInstanceOf[js.Any],
        "Range" -> Range.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetObjectRequest]
    }
  }

  @js.native
  trait GetObjectResponse extends js.Object {
    var StatusCode: statusCode
    var Body: js.UndefOr[PayloadBlob]
    var CacheControl: js.UndefOr[StringPrimitive]
    var ContentLength: js.UndefOr[NonNegativeLong]
    var ContentRange: js.UndefOr[ContentRangePattern]
    var ContentType: js.UndefOr[ContentType]
    var ETag: js.UndefOr[ETag]
    var LastModified: js.UndefOr[TimeStamp]
  }

  object GetObjectResponse {
    def apply(
      StatusCode: statusCode,
      Body: js.UndefOr[PayloadBlob] = js.undefined,
      CacheControl: js.UndefOr[StringPrimitive] = js.undefined,
      ContentLength: js.UndefOr[NonNegativeLong] = js.undefined,
      ContentRange: js.UndefOr[ContentRangePattern] = js.undefined,
      ContentType: js.UndefOr[ContentType] = js.undefined,
      ETag: js.UndefOr[ETag] = js.undefined,
      LastModified: js.UndefOr[TimeStamp] = js.undefined): GetObjectResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StatusCode" -> StatusCode.asInstanceOf[js.Any],
        "Body" -> Body.map { x => x.asInstanceOf[js.Any] },
        "CacheControl" -> CacheControl.map { x => x.asInstanceOf[js.Any] },
        "ContentLength" -> ContentLength.map { x => x.asInstanceOf[js.Any] },
        "ContentRange" -> ContentRange.map { x => x.asInstanceOf[js.Any] },
        "ContentType" -> ContentType.map { x => x.asInstanceOf[js.Any] },
        "ETag" -> ETag.map { x => x.asInstanceOf[js.Any] },
        "LastModified" -> LastModified.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetObjectResponse]
    }
  }

  /**
   * A metadata entry for a folder or object.
   */
  @js.native
  trait Item extends js.Object {
    var ContentLength: js.UndefOr[NonNegativeLong]
    var ContentType: js.UndefOr[ContentType]
    var ETag: js.UndefOr[ETag]
    var LastModified: js.UndefOr[TimeStamp]
    var Name: js.UndefOr[ItemName]
    var Type: js.UndefOr[ItemType]
  }

  object Item {
    def apply(
      ContentLength: js.UndefOr[NonNegativeLong] = js.undefined,
      ContentType: js.UndefOr[ContentType] = js.undefined,
      ETag: js.UndefOr[ETag] = js.undefined,
      LastModified: js.UndefOr[TimeStamp] = js.undefined,
      Name: js.UndefOr[ItemName] = js.undefined,
      Type: js.UndefOr[ItemType] = js.undefined): Item = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ContentLength" -> ContentLength.map { x => x.asInstanceOf[js.Any] },
        "ContentType" -> ContentType.map { x => x.asInstanceOf[js.Any] },
        "ETag" -> ETag.map { x => x.asInstanceOf[js.Any] },
        "LastModified" -> LastModified.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
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
    var MaxResults: js.UndefOr[ListLimit]
    var NextToken: js.UndefOr[PaginationToken]
    var Path: js.UndefOr[ListPathNaming]
  }

  object ListItemsRequest {
    def apply(
      MaxResults: js.UndefOr[ListLimit] = js.undefined,
      NextToken: js.UndefOr[PaginationToken] = js.undefined,
      Path: js.UndefOr[ListPathNaming] = js.undefined): ListItemsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "Path" -> Path.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var Body: PayloadBlob
    var Path: PathNaming
    var CacheControl: js.UndefOr[StringPrimitive]
    var ContentType: js.UndefOr[ContentType]
    var StorageClass: js.UndefOr[StorageClass]
  }

  object PutObjectRequest {
    def apply(
      Body: PayloadBlob,
      Path: PathNaming,
      CacheControl: js.UndefOr[StringPrimitive] = js.undefined,
      ContentType: js.UndefOr[ContentType] = js.undefined,
      StorageClass: js.UndefOr[StorageClass] = js.undefined): PutObjectRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Body" -> Body.asInstanceOf[js.Any],
        "Path" -> Path.asInstanceOf[js.Any],
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
