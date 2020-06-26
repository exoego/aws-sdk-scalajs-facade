package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

package object mediastoredata {
  type ContentRangePattern = String
  type ContentType         = String
  type ETag                = String
  type ItemList            = js.Array[Item]
  type ItemName            = String
  type ListLimit           = Int
  type ListPathNaming      = String
  type NonNegativeLong     = Double
  type PaginationToken     = String
  type PathNaming          = String
  type PayloadBlob         = js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type RangePattern        = String
  type SHA256Hash          = String
  type StringPrimitive     = String
  type TimeStamp           = js.Date
  type statusCode          = Int

  implicit final class MediaStoreDataOps(private val service: MediaStoreData) extends AnyVal {

    @inline def deleteObjectFuture(params: DeleteObjectRequest): Future[DeleteObjectResponse] =
      service.deleteObject(params).promise().toFuture
    @inline def describeObjectFuture(params: DescribeObjectRequest): Future[DescribeObjectResponse] =
      service.describeObject(params).promise().toFuture
    @inline def getObjectFuture(params: GetObjectRequest): Future[GetObjectResponse] =
      service.getObject(params).promise().toFuture
    @inline def listItemsFuture(params: ListItemsRequest): Future[ListItemsResponse] =
      service.listItems(params).promise().toFuture
    @inline def putObjectFuture(params: PutObjectRequest): Future[PutObjectResponse] =
      service.putObject(params).promise().toFuture
  }
}

package mediastoredata {
  @js.native
  @JSImport("aws-sdk", "MediaStoreData")
  class MediaStoreData() extends js.Object {
    def this(config: AWSConfig) = this()

    def deleteObject(params: DeleteObjectRequest): Request[DeleteObjectResponse]       = js.native
    def describeObject(params: DescribeObjectRequest): Request[DescribeObjectResponse] = js.native
    def getObject(params: GetObjectRequest): Request[GetObjectResponse]                = js.native
    def listItems(params: ListItemsRequest): Request[ListItemsResponse]                = js.native
    def putObject(params: PutObjectRequest): Request[PutObjectResponse]                = js.native
  }

  @js.native
  trait DeleteObjectRequest extends js.Object {
    var Path: PathNaming
  }

  object DeleteObjectRequest {
    @inline
    def apply(
        Path: PathNaming
    ): DeleteObjectRequest = {
      val __obj = js.Dynamic.literal(
        "Path" -> Path.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteObjectRequest]
    }
  }

  @js.native
  trait DeleteObjectResponse extends js.Object {}

  object DeleteObjectResponse {
    @inline
    def apply(
    ): DeleteObjectResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DeleteObjectResponse]
    }
  }

  @js.native
  trait DescribeObjectRequest extends js.Object {
    var Path: PathNaming
  }

  object DescribeObjectRequest {
    @inline
    def apply(
        Path: PathNaming
    ): DescribeObjectRequest = {
      val __obj = js.Dynamic.literal(
        "Path" -> Path.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeObjectRequest]
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
    @inline
    def apply(
        CacheControl: js.UndefOr[StringPrimitive] = js.undefined,
        ContentLength: js.UndefOr[NonNegativeLong] = js.undefined,
        ContentType: js.UndefOr[ContentType] = js.undefined,
        ETag: js.UndefOr[ETag] = js.undefined,
        LastModified: js.UndefOr[TimeStamp] = js.undefined
    ): DescribeObjectResponse = {
      val __obj = js.Dynamic.literal()
      CacheControl.foreach(__v => __obj.updateDynamic("CacheControl")(__v.asInstanceOf[js.Any]))
      ContentLength.foreach(__v => __obj.updateDynamic("ContentLength")(__v.asInstanceOf[js.Any]))
      ContentType.foreach(__v => __obj.updateDynamic("ContentType")(__v.asInstanceOf[js.Any]))
      ETag.foreach(__v => __obj.updateDynamic("ETag")(__v.asInstanceOf[js.Any]))
      LastModified.foreach(__v => __obj.updateDynamic("LastModified")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeObjectResponse]
    }
  }

  @js.native
  trait GetObjectRequest extends js.Object {
    var Path: PathNaming
    var Range: js.UndefOr[RangePattern]
  }

  object GetObjectRequest {
    @inline
    def apply(
        Path: PathNaming,
        Range: js.UndefOr[RangePattern] = js.undefined
    ): GetObjectRequest = {
      val __obj = js.Dynamic.literal(
        "Path" -> Path.asInstanceOf[js.Any]
      )

      Range.foreach(__v => __obj.updateDynamic("Range")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetObjectRequest]
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
    @inline
    def apply(
        StatusCode: statusCode,
        Body: js.UndefOr[PayloadBlob] = js.undefined,
        CacheControl: js.UndefOr[StringPrimitive] = js.undefined,
        ContentLength: js.UndefOr[NonNegativeLong] = js.undefined,
        ContentRange: js.UndefOr[ContentRangePattern] = js.undefined,
        ContentType: js.UndefOr[ContentType] = js.undefined,
        ETag: js.UndefOr[ETag] = js.undefined,
        LastModified: js.UndefOr[TimeStamp] = js.undefined
    ): GetObjectResponse = {
      val __obj = js.Dynamic.literal(
        "StatusCode" -> StatusCode.asInstanceOf[js.Any]
      )

      Body.foreach(__v => __obj.updateDynamic("Body")(__v.asInstanceOf[js.Any]))
      CacheControl.foreach(__v => __obj.updateDynamic("CacheControl")(__v.asInstanceOf[js.Any]))
      ContentLength.foreach(__v => __obj.updateDynamic("ContentLength")(__v.asInstanceOf[js.Any]))
      ContentRange.foreach(__v => __obj.updateDynamic("ContentRange")(__v.asInstanceOf[js.Any]))
      ContentType.foreach(__v => __obj.updateDynamic("ContentType")(__v.asInstanceOf[js.Any]))
      ETag.foreach(__v => __obj.updateDynamic("ETag")(__v.asInstanceOf[js.Any]))
      LastModified.foreach(__v => __obj.updateDynamic("LastModified")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetObjectResponse]
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
    @inline
    def apply(
        ContentLength: js.UndefOr[NonNegativeLong] = js.undefined,
        ContentType: js.UndefOr[ContentType] = js.undefined,
        ETag: js.UndefOr[ETag] = js.undefined,
        LastModified: js.UndefOr[TimeStamp] = js.undefined,
        Name: js.UndefOr[ItemName] = js.undefined,
        Type: js.UndefOr[ItemType] = js.undefined
    ): Item = {
      val __obj = js.Dynamic.literal()
      ContentLength.foreach(__v => __obj.updateDynamic("ContentLength")(__v.asInstanceOf[js.Any]))
      ContentType.foreach(__v => __obj.updateDynamic("ContentType")(__v.asInstanceOf[js.Any]))
      ETag.foreach(__v => __obj.updateDynamic("ETag")(__v.asInstanceOf[js.Any]))
      LastModified.foreach(__v => __obj.updateDynamic("LastModified")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Item]
    }
  }

  @js.native
  sealed trait ItemType extends js.Any
  object ItemType extends js.Object {
    val OBJECT = "OBJECT".asInstanceOf[ItemType]
    val FOLDER = "FOLDER".asInstanceOf[ItemType]

    val values = js.Object.freeze(js.Array(OBJECT, FOLDER))
  }

  @js.native
  trait ListItemsRequest extends js.Object {
    var MaxResults: js.UndefOr[ListLimit]
    var NextToken: js.UndefOr[PaginationToken]
    var Path: js.UndefOr[ListPathNaming]
  }

  object ListItemsRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[ListLimit] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined,
        Path: js.UndefOr[ListPathNaming] = js.undefined
    ): ListItemsRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Path.foreach(__v => __obj.updateDynamic("Path")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListItemsRequest]
    }
  }

  @js.native
  trait ListItemsResponse extends js.Object {
    var Items: js.UndefOr[ItemList]
    var NextToken: js.UndefOr[PaginationToken]
  }

  object ListItemsResponse {
    @inline
    def apply(
        Items: js.UndefOr[ItemList] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListItemsResponse = {
      val __obj = js.Dynamic.literal()
      Items.foreach(__v => __obj.updateDynamic("Items")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListItemsResponse]
    }
  }

  @js.native
  trait PutObjectRequest extends js.Object {
    var Body: PayloadBlob
    var Path: PathNaming
    var CacheControl: js.UndefOr[StringPrimitive]
    var ContentType: js.UndefOr[ContentType]
    var StorageClass: js.UndefOr[StorageClass]
    var UploadAvailability: js.UndefOr[UploadAvailability]
  }

  object PutObjectRequest {
    @inline
    def apply(
        Body: PayloadBlob,
        Path: PathNaming,
        CacheControl: js.UndefOr[StringPrimitive] = js.undefined,
        ContentType: js.UndefOr[ContentType] = js.undefined,
        StorageClass: js.UndefOr[StorageClass] = js.undefined,
        UploadAvailability: js.UndefOr[UploadAvailability] = js.undefined
    ): PutObjectRequest = {
      val __obj = js.Dynamic.literal(
        "Body" -> Body.asInstanceOf[js.Any],
        "Path" -> Path.asInstanceOf[js.Any]
      )

      CacheControl.foreach(__v => __obj.updateDynamic("CacheControl")(__v.asInstanceOf[js.Any]))
      ContentType.foreach(__v => __obj.updateDynamic("ContentType")(__v.asInstanceOf[js.Any]))
      StorageClass.foreach(__v => __obj.updateDynamic("StorageClass")(__v.asInstanceOf[js.Any]))
      UploadAvailability.foreach(__v => __obj.updateDynamic("UploadAvailability")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutObjectRequest]
    }
  }

  @js.native
  trait PutObjectResponse extends js.Object {
    var ContentSHA256: js.UndefOr[SHA256Hash]
    var ETag: js.UndefOr[ETag]
    var StorageClass: js.UndefOr[StorageClass]
  }

  object PutObjectResponse {
    @inline
    def apply(
        ContentSHA256: js.UndefOr[SHA256Hash] = js.undefined,
        ETag: js.UndefOr[ETag] = js.undefined,
        StorageClass: js.UndefOr[StorageClass] = js.undefined
    ): PutObjectResponse = {
      val __obj = js.Dynamic.literal()
      ContentSHA256.foreach(__v => __obj.updateDynamic("ContentSHA256")(__v.asInstanceOf[js.Any]))
      ETag.foreach(__v => __obj.updateDynamic("ETag")(__v.asInstanceOf[js.Any]))
      StorageClass.foreach(__v => __obj.updateDynamic("StorageClass")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutObjectResponse]
    }
  }

  @js.native
  sealed trait StorageClass extends js.Any
  object StorageClass extends js.Object {
    val TEMPORAL = "TEMPORAL".asInstanceOf[StorageClass]

    val values = js.Object.freeze(js.Array(TEMPORAL))
  }

  @js.native
  sealed trait UploadAvailability extends js.Any
  object UploadAvailability extends js.Object {
    val STANDARD  = "STANDARD".asInstanceOf[UploadAvailability]
    val STREAMING = "STREAMING".asInstanceOf[UploadAvailability]

    val values = js.Object.freeze(js.Array(STANDARD, STREAMING))
  }
}
