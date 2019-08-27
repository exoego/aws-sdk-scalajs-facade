package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import io.scalajs.nodejs
import facade.amazonaws._

package object textract {
  type BlockList          = js.Array[Block]
  type BlockType          = String
  type ClientRequestToken = String
  type EntityType         = String
  type EntityTypes        = js.Array[EntityType]
  type ErrorCode          = String
  type FeatureType        = String
  type FeatureTypes       = js.Array[FeatureType]
  type IdList             = js.Array[NonEmptyString]
  type ImageBlob =
    nodejs.buffer.Buffer | nodejs.stream.Readable | js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type JobId            = String
  type JobStatus        = String
  type JobTag           = String
  type MaxResults       = Int
  type NonEmptyString   = String
  type Pages            = js.Array[UInteger]
  type PaginationToken  = String
  type Percent          = Float
  type Polygon          = js.Array[Point]
  type RelationshipList = js.Array[Relationship]
  type RelationshipType = String
  type RoleArn          = String
  type S3Bucket         = String
  type S3ObjectName     = String
  type S3ObjectVersion  = String
  type SNSTopicArn      = String
  type SelectionStatus  = String
  type StatusMessage    = String
  type UInteger         = Int
  type Warnings         = js.Array[Warning]

  implicit final class TextractOps(val service: Textract) extends AnyVal {

    def analyzeDocumentFuture(params: AnalyzeDocumentRequest): Future[AnalyzeDocumentResponse] =
      service.analyzeDocument(params).promise.toFuture
    def detectDocumentTextFuture(params: DetectDocumentTextRequest): Future[DetectDocumentTextResponse] =
      service.detectDocumentText(params).promise.toFuture
    def getDocumentAnalysisFuture(params: GetDocumentAnalysisRequest): Future[GetDocumentAnalysisResponse] =
      service.getDocumentAnalysis(params).promise.toFuture
    def getDocumentTextDetectionFuture(
        params: GetDocumentTextDetectionRequest
    ): Future[GetDocumentTextDetectionResponse] = service.getDocumentTextDetection(params).promise.toFuture
    def startDocumentAnalysisFuture(params: StartDocumentAnalysisRequest): Future[StartDocumentAnalysisResponse] =
      service.startDocumentAnalysis(params).promise.toFuture
    def startDocumentTextDetectionFuture(
        params: StartDocumentTextDetectionRequest
    ): Future[StartDocumentTextDetectionResponse] = service.startDocumentTextDetection(params).promise.toFuture
  }
}

package textract {
  @js.native
  @JSImport("aws-sdk", "Textract")
  class Textract() extends js.Object {
    def this(config: AWSConfig) = this()

    def analyzeDocument(params: AnalyzeDocumentRequest): Request[AnalyzeDocumentResponse]             = js.native
    def detectDocumentText(params: DetectDocumentTextRequest): Request[DetectDocumentTextResponse]    = js.native
    def getDocumentAnalysis(params: GetDocumentAnalysisRequest): Request[GetDocumentAnalysisResponse] = js.native
    def getDocumentTextDetection(params: GetDocumentTextDetectionRequest): Request[GetDocumentTextDetectionResponse] =
      js.native
    def startDocumentAnalysis(params: StartDocumentAnalysisRequest): Request[StartDocumentAnalysisResponse] = js.native
    def startDocumentTextDetection(
        params: StartDocumentTextDetectionRequest
    ): Request[StartDocumentTextDetectionResponse] = js.native
  }

  @js.native
  trait AnalyzeDocumentRequest extends js.Object {
    var Document: Document
    var FeatureTypes: FeatureTypes
  }

  object AnalyzeDocumentRequest {
    def apply(
        Document: Document,
        FeatureTypes: FeatureTypes
    ): AnalyzeDocumentRequest = {
      val __obj = js.Dictionary[js.Any](
        "Document"     -> Document.asInstanceOf[js.Any],
        "FeatureTypes" -> FeatureTypes.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[AnalyzeDocumentRequest]
    }
  }

  @js.native
  trait AnalyzeDocumentResponse extends js.Object {
    var Blocks: js.UndefOr[BlockList]
    var DocumentMetadata: js.UndefOr[DocumentMetadata]
  }

  object AnalyzeDocumentResponse {
    def apply(
        Blocks: js.UndefOr[BlockList] = js.undefined,
        DocumentMetadata: js.UndefOr[DocumentMetadata] = js.undefined
    ): AnalyzeDocumentResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Blocks.foreach(__v => __obj.update("Blocks", __v.asInstanceOf[js.Any]))
      DocumentMetadata.foreach(__v => __obj.update("DocumentMetadata", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AnalyzeDocumentResponse]
    }
  }

  /**
    * A <code>Block</code> represents items that are recognized in a document within a group of pixels close to each other. The information returned in a <code>Block</code> depends on the type of operation. In document-text detection (for example <a>DetectDocumentText</a>), you get information about the detected words and lines of text. In text analysis (for example <a>AnalyzeDocument</a>), you can also get information about the fields, tables and selection elements that are detected in the document.
    *  An array of <code>Block</code> objects is returned by both synchronous and asynchronous operations. In synchronous operations, such as <a>DetectDocumentText</a>, the array of <code>Block</code> objects is the entire set of results. In asynchronous operations, such as <a>GetDocumentAnalysis</a>, the array is returned over one or more responses.
    *  For more information, see [[https://docs.aws.amazon.com/textract/latest/dg/how-it-works.html|How Amazon Textract Works]].
    */
  @js.native
  trait Block extends js.Object {
    var BlockType: js.UndefOr[BlockType]
    var ColumnIndex: js.UndefOr[UInteger]
    var ColumnSpan: js.UndefOr[UInteger]
    var Confidence: js.UndefOr[Percent]
    var EntityTypes: js.UndefOr[EntityTypes]
    var Geometry: js.UndefOr[Geometry]
    var Id: js.UndefOr[NonEmptyString]
    var Page: js.UndefOr[UInteger]
    var Relationships: js.UndefOr[RelationshipList]
    var RowIndex: js.UndefOr[UInteger]
    var RowSpan: js.UndefOr[UInteger]
    var SelectionStatus: js.UndefOr[SelectionStatus]
    var Text: js.UndefOr[String]
  }

  object Block {
    def apply(
        BlockType: js.UndefOr[BlockType] = js.undefined,
        ColumnIndex: js.UndefOr[UInteger] = js.undefined,
        ColumnSpan: js.UndefOr[UInteger] = js.undefined,
        Confidence: js.UndefOr[Percent] = js.undefined,
        EntityTypes: js.UndefOr[EntityTypes] = js.undefined,
        Geometry: js.UndefOr[Geometry] = js.undefined,
        Id: js.UndefOr[NonEmptyString] = js.undefined,
        Page: js.UndefOr[UInteger] = js.undefined,
        Relationships: js.UndefOr[RelationshipList] = js.undefined,
        RowIndex: js.UndefOr[UInteger] = js.undefined,
        RowSpan: js.UndefOr[UInteger] = js.undefined,
        SelectionStatus: js.UndefOr[SelectionStatus] = js.undefined,
        Text: js.UndefOr[String] = js.undefined
    ): Block = {
      val __obj = js.Dictionary.empty[js.Any]
      BlockType.foreach(__v => __obj.update("BlockType", __v.asInstanceOf[js.Any]))
      ColumnIndex.foreach(__v => __obj.update("ColumnIndex", __v.asInstanceOf[js.Any]))
      ColumnSpan.foreach(__v => __obj.update("ColumnSpan", __v.asInstanceOf[js.Any]))
      Confidence.foreach(__v => __obj.update("Confidence", __v.asInstanceOf[js.Any]))
      EntityTypes.foreach(__v => __obj.update("EntityTypes", __v.asInstanceOf[js.Any]))
      Geometry.foreach(__v => __obj.update("Geometry", __v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.update("Id", __v.asInstanceOf[js.Any]))
      Page.foreach(__v => __obj.update("Page", __v.asInstanceOf[js.Any]))
      Relationships.foreach(__v => __obj.update("Relationships", __v.asInstanceOf[js.Any]))
      RowIndex.foreach(__v => __obj.update("RowIndex", __v.asInstanceOf[js.Any]))
      RowSpan.foreach(__v => __obj.update("RowSpan", __v.asInstanceOf[js.Any]))
      SelectionStatus.foreach(__v => __obj.update("SelectionStatus", __v.asInstanceOf[js.Any]))
      Text.foreach(__v => __obj.update("Text", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Block]
    }
  }

  object BlockTypeEnum {
    val KEY_VALUE_SET     = "KEY_VALUE_SET"
    val PAGE              = "PAGE"
    val LINE              = "LINE"
    val WORD              = "WORD"
    val TABLE             = "TABLE"
    val CELL              = "CELL"
    val SELECTION_ELEMENT = "SELECTION_ELEMENT"

    val values = IndexedSeq(KEY_VALUE_SET, PAGE, LINE, WORD, TABLE, CELL, SELECTION_ELEMENT)
  }

  /**
    * The bounding box around the recognized text, key, value, table or table cell on a document page. The <code>left</code> (x-coordinate) and <code>top</code> (y-coordinate) are coordinates that represent the top and left sides of the bounding box. Note that the upper-left corner of the image is the origin (0,0).
    *  The <code>top</code> and <code>left</code> values returned are ratios of the overall document page size. For example, if the input image is 700 x 200 pixels, and the top-left coordinate of the bounding box is 350 x 50 pixels, the API returns a <code>left</code> value of 0.5 (350/700) and a <code>top</code> value of 0.25 (50/200).
    *  The <code>width</code> and <code>height</code> values represent the dimensions of the bounding box as a ratio of the overall document page dimension. For example, if the document page size is 700 x 200 pixels, and the bounding box width is 70 pixels, the width returned is 0.1.
    */
  @js.native
  trait BoundingBox extends js.Object {
    var Height: js.UndefOr[Float]
    var Left: js.UndefOr[Float]
    var Top: js.UndefOr[Float]
    var Width: js.UndefOr[Float]
  }

  object BoundingBox {
    def apply(
        Height: js.UndefOr[Float] = js.undefined,
        Left: js.UndefOr[Float] = js.undefined,
        Top: js.UndefOr[Float] = js.undefined,
        Width: js.UndefOr[Float] = js.undefined
    ): BoundingBox = {
      val __obj = js.Dictionary.empty[js.Any]
      Height.foreach(__v => __obj.update("Height", __v.asInstanceOf[js.Any]))
      Left.foreach(__v => __obj.update("Left", __v.asInstanceOf[js.Any]))
      Top.foreach(__v => __obj.update("Top", __v.asInstanceOf[js.Any]))
      Width.foreach(__v => __obj.update("Width", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BoundingBox]
    }
  }

  @js.native
  trait DetectDocumentTextRequest extends js.Object {
    var Document: Document
  }

  object DetectDocumentTextRequest {
    def apply(
        Document: Document
    ): DetectDocumentTextRequest = {
      val __obj = js.Dictionary[js.Any](
        "Document" -> Document.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DetectDocumentTextRequest]
    }
  }

  @js.native
  trait DetectDocumentTextResponse extends js.Object {
    var Blocks: js.UndefOr[BlockList]
    var DocumentMetadata: js.UndefOr[DocumentMetadata]
  }

  object DetectDocumentTextResponse {
    def apply(
        Blocks: js.UndefOr[BlockList] = js.undefined,
        DocumentMetadata: js.UndefOr[DocumentMetadata] = js.undefined
    ): DetectDocumentTextResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Blocks.foreach(__v => __obj.update("Blocks", __v.asInstanceOf[js.Any]))
      DocumentMetadata.foreach(__v => __obj.update("DocumentMetadata", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DetectDocumentTextResponse]
    }
  }

  /**
    * The input document, either as bytes or as an S3 object.
    *  You pass image bytes to an Amazon Textract API operation by using the <code>Bytes</code> property. For example, you would use the <code>Bytes</code> property to pass a document loaded from a local file system. Image bytes passed by using the <code>Bytes</code> property must be base64 encoded. Your code might not need to encode document file bytes if you're using an AWS SDK to call Amazon Textract API operations.
    *  You pass images stored in an S3 bucket to an Amazon Textract API operation by using the <code>S3Object</code> property. Documents stored in an S3 bucket don't need to be base64 encoded.
    *  The AWS Region for the S3 bucket that contains the S3 object must match the AWS Region that you use for Amazon Textract operations.
    *  If you use the AWS CLI to call Amazon Textract operations, passing image bytes using the Bytes property isn't supported. You must first upload the document to an Amazon S3 bucket, and then call the operation using the S3Object property.
    *  For Amazon Textract to process an S3 object, the user must have permission to access the S3 object.
    */
  @js.native
  trait Document extends js.Object {
    var Bytes: js.UndefOr[ImageBlob]
    var S3Object: js.UndefOr[S3Object]
  }

  object Document {
    def apply(
        Bytes: js.UndefOr[ImageBlob] = js.undefined,
        S3Object: js.UndefOr[S3Object] = js.undefined
    ): Document = {
      val __obj = js.Dictionary.empty[js.Any]
      Bytes.foreach(__v => __obj.update("Bytes", __v.asInstanceOf[js.Any]))
      S3Object.foreach(__v => __obj.update("S3Object", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Document]
    }
  }

  /**
    * The Amazon S3 bucket that contains the document to be processed. It's used by asynchronous operations such as <a>StartDocumentTextDetection</a>.
    *  The input document can be an image file in JPG or PNG format. It can also be a file in PDF format.
    */
  @js.native
  trait DocumentLocation extends js.Object {
    var S3Object: js.UndefOr[S3Object]
  }

  object DocumentLocation {
    def apply(
        S3Object: js.UndefOr[S3Object] = js.undefined
    ): DocumentLocation = {
      val __obj = js.Dictionary.empty[js.Any]
      S3Object.foreach(__v => __obj.update("S3Object", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DocumentLocation]
    }
  }

  /**
    * Information about the input document.
    */
  @js.native
  trait DocumentMetadata extends js.Object {
    var Pages: js.UndefOr[UInteger]
  }

  object DocumentMetadata {
    def apply(
        Pages: js.UndefOr[UInteger] = js.undefined
    ): DocumentMetadata = {
      val __obj = js.Dictionary.empty[js.Any]
      Pages.foreach(__v => __obj.update("Pages", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DocumentMetadata]
    }
  }

  object EntityTypeEnum {
    val KEY   = "KEY"
    val VALUE = "VALUE"

    val values = IndexedSeq(KEY, VALUE)
  }

  object FeatureTypeEnum {
    val TABLES = "TABLES"
    val FORMS  = "FORMS"

    val values = IndexedSeq(TABLES, FORMS)
  }

  /**
    * Information about where a recognized text, key, value, table, or table cell is located on a document page.
    */
  @js.native
  trait Geometry extends js.Object {
    var BoundingBox: js.UndefOr[BoundingBox]
    var Polygon: js.UndefOr[Polygon]
  }

  object Geometry {
    def apply(
        BoundingBox: js.UndefOr[BoundingBox] = js.undefined,
        Polygon: js.UndefOr[Polygon] = js.undefined
    ): Geometry = {
      val __obj = js.Dictionary.empty[js.Any]
      BoundingBox.foreach(__v => __obj.update("BoundingBox", __v.asInstanceOf[js.Any]))
      Polygon.foreach(__v => __obj.update("Polygon", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Geometry]
    }
  }

  @js.native
  trait GetDocumentAnalysisRequest extends js.Object {
    var JobId: JobId
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[PaginationToken]
  }

  object GetDocumentAnalysisRequest {
    def apply(
        JobId: JobId,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined
    ): GetDocumentAnalysisRequest = {
      val __obj = js.Dictionary[js.Any](
        "JobId" -> JobId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDocumentAnalysisRequest]
    }
  }

  @js.native
  trait GetDocumentAnalysisResponse extends js.Object {
    var Blocks: js.UndefOr[BlockList]
    var DocumentMetadata: js.UndefOr[DocumentMetadata]
    var JobStatus: js.UndefOr[JobStatus]
    var NextToken: js.UndefOr[PaginationToken]
    var StatusMessage: js.UndefOr[StatusMessage]
    var Warnings: js.UndefOr[Warnings]
  }

  object GetDocumentAnalysisResponse {
    def apply(
        Blocks: js.UndefOr[BlockList] = js.undefined,
        DocumentMetadata: js.UndefOr[DocumentMetadata] = js.undefined,
        JobStatus: js.UndefOr[JobStatus] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined,
        StatusMessage: js.UndefOr[StatusMessage] = js.undefined,
        Warnings: js.UndefOr[Warnings] = js.undefined
    ): GetDocumentAnalysisResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Blocks.foreach(__v => __obj.update("Blocks", __v.asInstanceOf[js.Any]))
      DocumentMetadata.foreach(__v => __obj.update("DocumentMetadata", __v.asInstanceOf[js.Any]))
      JobStatus.foreach(__v => __obj.update("JobStatus", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      StatusMessage.foreach(__v => __obj.update("StatusMessage", __v.asInstanceOf[js.Any]))
      Warnings.foreach(__v => __obj.update("Warnings", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDocumentAnalysisResponse]
    }
  }

  @js.native
  trait GetDocumentTextDetectionRequest extends js.Object {
    var JobId: JobId
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[PaginationToken]
  }

  object GetDocumentTextDetectionRequest {
    def apply(
        JobId: JobId,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined
    ): GetDocumentTextDetectionRequest = {
      val __obj = js.Dictionary[js.Any](
        "JobId" -> JobId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDocumentTextDetectionRequest]
    }
  }

  @js.native
  trait GetDocumentTextDetectionResponse extends js.Object {
    var Blocks: js.UndefOr[BlockList]
    var DocumentMetadata: js.UndefOr[DocumentMetadata]
    var JobStatus: js.UndefOr[JobStatus]
    var NextToken: js.UndefOr[PaginationToken]
    var StatusMessage: js.UndefOr[StatusMessage]
    var Warnings: js.UndefOr[Warnings]
  }

  object GetDocumentTextDetectionResponse {
    def apply(
        Blocks: js.UndefOr[BlockList] = js.undefined,
        DocumentMetadata: js.UndefOr[DocumentMetadata] = js.undefined,
        JobStatus: js.UndefOr[JobStatus] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined,
        StatusMessage: js.UndefOr[StatusMessage] = js.undefined,
        Warnings: js.UndefOr[Warnings] = js.undefined
    ): GetDocumentTextDetectionResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Blocks.foreach(__v => __obj.update("Blocks", __v.asInstanceOf[js.Any]))
      DocumentMetadata.foreach(__v => __obj.update("DocumentMetadata", __v.asInstanceOf[js.Any]))
      JobStatus.foreach(__v => __obj.update("JobStatus", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      StatusMessage.foreach(__v => __obj.update("StatusMessage", __v.asInstanceOf[js.Any]))
      Warnings.foreach(__v => __obj.update("Warnings", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDocumentTextDetectionResponse]
    }
  }

  object JobStatusEnum {
    val IN_PROGRESS     = "IN_PROGRESS"
    val SUCCEEDED       = "SUCCEEDED"
    val FAILED          = "FAILED"
    val PARTIAL_SUCCESS = "PARTIAL_SUCCESS"

    val values = IndexedSeq(IN_PROGRESS, SUCCEEDED, FAILED, PARTIAL_SUCCESS)
  }

  /**
    * The Amazon Simple Notification Service (Amazon SNS) topic to which Amazon Textract publishes the completion status of an asynchronous document operation, such as <a>StartDocumentTextDetection</a>.
    */
  @js.native
  trait NotificationChannel extends js.Object {
    var RoleArn: RoleArn
    var SNSTopicArn: SNSTopicArn
  }

  object NotificationChannel {
    def apply(
        RoleArn: RoleArn,
        SNSTopicArn: SNSTopicArn
    ): NotificationChannel = {
      val __obj = js.Dictionary[js.Any](
        "RoleArn"     -> RoleArn.asInstanceOf[js.Any],
        "SNSTopicArn" -> SNSTopicArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[NotificationChannel]
    }
  }

  /**
    * The X and Y coordinates of a point on a document page. The X and Y values returned are ratios of the overall document page size. For example, if the input document is 700 x 200 and the operation returns X=0.5 and Y=0.25, then the point is at the (350,50) pixel coordinate on the document page.
    *  An array of <code>Point</code> objects, <code>Polygon</code>, is returned by <a>DetectDocumentText</a>. <code>Polygon</code> represents a fine-grained polygon around detected text. For more information, see Geometry in the Amazon Textract Developer Guide.
    */
  @js.native
  trait Point extends js.Object {
    var X: js.UndefOr[Float]
    var Y: js.UndefOr[Float]
  }

  object Point {
    def apply(
        X: js.UndefOr[Float] = js.undefined,
        Y: js.UndefOr[Float] = js.undefined
    ): Point = {
      val __obj = js.Dictionary.empty[js.Any]
      X.foreach(__v => __obj.update("X", __v.asInstanceOf[js.Any]))
      Y.foreach(__v => __obj.update("Y", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Point]
    }
  }

  /**
    * Information about how blocks are related to each other. A <code>Block</code> object contains 0 or more <code>Relation</code> objects in a list, <code>Relationships</code>. For more information, see <a>Block</a>.
    *  The <code>Type</code> element provides the type of the relationship for all blocks in the <code>IDs</code> array.
    */
  @js.native
  trait Relationship extends js.Object {
    var Ids: js.UndefOr[IdList]
    var Type: js.UndefOr[RelationshipType]
  }

  object Relationship {
    def apply(
        Ids: js.UndefOr[IdList] = js.undefined,
        Type: js.UndefOr[RelationshipType] = js.undefined
    ): Relationship = {
      val __obj = js.Dictionary.empty[js.Any]
      Ids.foreach(__v => __obj.update("Ids", __v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.update("Type", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Relationship]
    }
  }

  object RelationshipTypeEnum {
    val VALUE = "VALUE"
    val CHILD = "CHILD"

    val values = IndexedSeq(VALUE, CHILD)
  }

  /**
    * The S3 bucket name and file name that identifies the document.
    *  The AWS Region for the S3 bucket that contains the document must match the Region that you use for Amazon Textract operations.
    *  For Amazon Textract to process a file in an S3 bucket, the user must have permission to access the S3 bucket and file.
    */
  @js.native
  trait S3Object extends js.Object {
    var Bucket: js.UndefOr[S3Bucket]
    var Name: js.UndefOr[S3ObjectName]
    var Version: js.UndefOr[S3ObjectVersion]
  }

  object S3Object {
    def apply(
        Bucket: js.UndefOr[S3Bucket] = js.undefined,
        Name: js.UndefOr[S3ObjectName] = js.undefined,
        Version: js.UndefOr[S3ObjectVersion] = js.undefined
    ): S3Object = {
      val __obj = js.Dictionary.empty[js.Any]
      Bucket.foreach(__v => __obj.update("Bucket", __v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      Version.foreach(__v => __obj.update("Version", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[S3Object]
    }
  }

  object SelectionStatusEnum {
    val SELECTED     = "SELECTED"
    val NOT_SELECTED = "NOT_SELECTED"

    val values = IndexedSeq(SELECTED, NOT_SELECTED)
  }

  @js.native
  trait StartDocumentAnalysisRequest extends js.Object {
    var DocumentLocation: DocumentLocation
    var FeatureTypes: FeatureTypes
    var ClientRequestToken: js.UndefOr[ClientRequestToken]
    var JobTag: js.UndefOr[JobTag]
    var NotificationChannel: js.UndefOr[NotificationChannel]
  }

  object StartDocumentAnalysisRequest {
    def apply(
        DocumentLocation: DocumentLocation,
        FeatureTypes: FeatureTypes,
        ClientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined,
        JobTag: js.UndefOr[JobTag] = js.undefined,
        NotificationChannel: js.UndefOr[NotificationChannel] = js.undefined
    ): StartDocumentAnalysisRequest = {
      val __obj = js.Dictionary[js.Any](
        "DocumentLocation" -> DocumentLocation.asInstanceOf[js.Any],
        "FeatureTypes"     -> FeatureTypes.asInstanceOf[js.Any]
      )

      ClientRequestToken.foreach(__v => __obj.update("ClientRequestToken", __v.asInstanceOf[js.Any]))
      JobTag.foreach(__v => __obj.update("JobTag", __v.asInstanceOf[js.Any]))
      NotificationChannel.foreach(__v => __obj.update("NotificationChannel", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartDocumentAnalysisRequest]
    }
  }

  @js.native
  trait StartDocumentAnalysisResponse extends js.Object {
    var JobId: js.UndefOr[JobId]
  }

  object StartDocumentAnalysisResponse {
    def apply(
        JobId: js.UndefOr[JobId] = js.undefined
    ): StartDocumentAnalysisResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      JobId.foreach(__v => __obj.update("JobId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartDocumentAnalysisResponse]
    }
  }

  @js.native
  trait StartDocumentTextDetectionRequest extends js.Object {
    var DocumentLocation: DocumentLocation
    var ClientRequestToken: js.UndefOr[ClientRequestToken]
    var JobTag: js.UndefOr[JobTag]
    var NotificationChannel: js.UndefOr[NotificationChannel]
  }

  object StartDocumentTextDetectionRequest {
    def apply(
        DocumentLocation: DocumentLocation,
        ClientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined,
        JobTag: js.UndefOr[JobTag] = js.undefined,
        NotificationChannel: js.UndefOr[NotificationChannel] = js.undefined
    ): StartDocumentTextDetectionRequest = {
      val __obj = js.Dictionary[js.Any](
        "DocumentLocation" -> DocumentLocation.asInstanceOf[js.Any]
      )

      ClientRequestToken.foreach(__v => __obj.update("ClientRequestToken", __v.asInstanceOf[js.Any]))
      JobTag.foreach(__v => __obj.update("JobTag", __v.asInstanceOf[js.Any]))
      NotificationChannel.foreach(__v => __obj.update("NotificationChannel", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartDocumentTextDetectionRequest]
    }
  }

  @js.native
  trait StartDocumentTextDetectionResponse extends js.Object {
    var JobId: js.UndefOr[JobId]
  }

  object StartDocumentTextDetectionResponse {
    def apply(
        JobId: js.UndefOr[JobId] = js.undefined
    ): StartDocumentTextDetectionResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      JobId.foreach(__v => __obj.update("JobId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartDocumentTextDetectionResponse]
    }
  }

  /**
    * A warning about an issue that occurred during asynchronous text analysis (<a>StartDocumentAnalysis</a>) or asynchronous document-text detection (<a>StartDocumentTextDetection</a>).
    */
  @js.native
  trait Warning extends js.Object {
    var ErrorCode: js.UndefOr[ErrorCode]
    var Pages: js.UndefOr[Pages]
  }

  object Warning {
    def apply(
        ErrorCode: js.UndefOr[ErrorCode] = js.undefined,
        Pages: js.UndefOr[Pages] = js.undefined
    ): Warning = {
      val __obj = js.Dictionary.empty[js.Any]
      ErrorCode.foreach(__v => __obj.update("ErrorCode", __v.asInstanceOf[js.Any]))
      Pages.foreach(__v => __obj.update("Pages", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Warning]
    }
  }
}
