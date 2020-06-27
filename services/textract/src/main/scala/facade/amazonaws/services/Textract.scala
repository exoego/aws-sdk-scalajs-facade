package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object textract {
  type BlockList                                      = js.Array[Block]
  type ClientRequestToken                             = String
  type ContentClassifiers                             = js.Array[ContentClassifier]
  type EntityTypes                                    = js.Array[EntityType]
  type ErrorCode                                      = String
  type FeatureTypes                                   = js.Array[FeatureType]
  type FlowDefinitionArn                              = String
  type HumanLoopActivationConditionsEvaluationResults = String
  type HumanLoopActivationReason                      = String
  type HumanLoopActivationReasons                     = js.Array[HumanLoopActivationReason]
  type HumanLoopArn                                   = String
  type HumanLoopName                                  = String
  type IdList                                         = js.Array[NonEmptyString]
  type ImageBlob                                      = js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type JobId                                          = String
  type JobTag                                         = String
  type MaxResults                                     = Int
  type NonEmptyString                                 = String
  type Pages                                          = js.Array[UInteger]
  type PaginationToken                                = String
  type Percent                                        = Float
  type Polygon                                        = js.Array[Point]
  type RelationshipList                               = js.Array[Relationship]
  type RoleArn                                        = String
  type S3Bucket                                       = String
  type S3ObjectName                                   = String
  type S3ObjectVersion                                = String
  type SNSTopicArn                                    = String
  type StatusMessage                                  = String
  type UInteger                                       = Int
  type Warnings                                       = js.Array[Warning]

  implicit final class TextractOps(private val service: Textract) extends AnyVal {

    @inline def analyzeDocumentFuture(params: AnalyzeDocumentRequest): Future[AnalyzeDocumentResponse] =
      service.analyzeDocument(params).promise().toFuture
    @inline def detectDocumentTextFuture(params: DetectDocumentTextRequest): Future[DetectDocumentTextResponse] =
      service.detectDocumentText(params).promise().toFuture
    @inline def getDocumentAnalysisFuture(params: GetDocumentAnalysisRequest): Future[GetDocumentAnalysisResponse] =
      service.getDocumentAnalysis(params).promise().toFuture
    @inline def getDocumentTextDetectionFuture(
        params: GetDocumentTextDetectionRequest
    ): Future[GetDocumentTextDetectionResponse] = service.getDocumentTextDetection(params).promise().toFuture
    @inline def startDocumentAnalysisFuture(
        params: StartDocumentAnalysisRequest
    ): Future[StartDocumentAnalysisResponse] = service.startDocumentAnalysis(params).promise().toFuture
    @inline def startDocumentTextDetectionFuture(
        params: StartDocumentTextDetectionRequest
    ): Future[StartDocumentTextDetectionResponse] = service.startDocumentTextDetection(params).promise().toFuture
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
  @Factory
  trait AnalyzeDocumentRequest extends js.Object {
    var Document: Document
    var FeatureTypes: FeatureTypes
    var HumanLoopConfig: js.UndefOr[HumanLoopConfig]
  }

  @js.native
  @Factory
  trait AnalyzeDocumentResponse extends js.Object {
    var AnalyzeDocumentModelVersion: js.UndefOr[String]
    var Blocks: js.UndefOr[BlockList]
    var DocumentMetadata: js.UndefOr[DocumentMetadata]
    var HumanLoopActivationOutput: js.UndefOr[HumanLoopActivationOutput]
  }

  /**
    * A <code>Block</code> represents items that are recognized in a document within a group of pixels close to each other. The information returned in a <code>Block</code> object depends on the type of operation. In text detection for documents (for example <a>DetectDocumentText</a>), you get information about the detected words and lines of text. In text analysis (for example <a>AnalyzeDocument</a>), you can also get information about the fields, tables, and selection elements that are detected in the document.
    *  An array of <code>Block</code> objects is returned by both synchronous and asynchronous operations. In synchronous operations, such as <a>DetectDocumentText</a>, the array of <code>Block</code> objects is the entire set of results. In asynchronous operations, such as <a>GetDocumentAnalysis</a>, the array is returned over one or more responses.
    *  For more information, see [[https://docs.aws.amazon.com/textract/latest/dg/how-it-works.html|How Amazon Textract Works]].
    */
  @js.native
  @Factory
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

  @js.native
  sealed trait BlockType extends js.Any
  object BlockType extends js.Object {
    val KEY_VALUE_SET     = "KEY_VALUE_SET".asInstanceOf[BlockType]
    val PAGE              = "PAGE".asInstanceOf[BlockType]
    val LINE              = "LINE".asInstanceOf[BlockType]
    val WORD              = "WORD".asInstanceOf[BlockType]
    val TABLE             = "TABLE".asInstanceOf[BlockType]
    val CELL              = "CELL".asInstanceOf[BlockType]
    val SELECTION_ELEMENT = "SELECTION_ELEMENT".asInstanceOf[BlockType]

    val values = js.Object.freeze(js.Array(KEY_VALUE_SET, PAGE, LINE, WORD, TABLE, CELL, SELECTION_ELEMENT))
  }

  /**
    * The bounding box around the detected page, text, key-value pair, table, table cell, or selection element on a document page. The <code>left</code> (x-coordinate) and <code>top</code> (y-coordinate) are coordinates that represent the top and left sides of the bounding box. Note that the upper-left corner of the image is the origin (0,0).
    *  The <code>top</code> and <code>left</code> values returned are ratios of the overall document page size. For example, if the input image is 700 x 200 pixels, and the top-left coordinate of the bounding box is 350 x 50 pixels, the API returns a <code>left</code> value of 0.5 (350/700) and a <code>top</code> value of 0.25 (50/200).
    *  The <code>width</code> and <code>height</code> values represent the dimensions of the bounding box as a ratio of the overall document page dimension. For example, if the document page size is 700 x 200 pixels, and the bounding box width is 70 pixels, the width returned is 0.1.
    */
  @js.native
  @Factory
  trait BoundingBox extends js.Object {
    var Height: js.UndefOr[Float]
    var Left: js.UndefOr[Float]
    var Top: js.UndefOr[Float]
    var Width: js.UndefOr[Float]
  }

  @js.native
  sealed trait ContentClassifier extends js.Any
  object ContentClassifier extends js.Object {
    val FreeOfPersonallyIdentifiableInformation =
      "FreeOfPersonallyIdentifiableInformation".asInstanceOf[ContentClassifier]
    val FreeOfAdultContent = "FreeOfAdultContent".asInstanceOf[ContentClassifier]

    val values = js.Object.freeze(js.Array(FreeOfPersonallyIdentifiableInformation, FreeOfAdultContent))
  }

  @js.native
  @Factory
  trait DetectDocumentTextRequest extends js.Object {
    var Document: Document
  }

  @js.native
  @Factory
  trait DetectDocumentTextResponse extends js.Object {
    var Blocks: js.UndefOr[BlockList]
    var DetectDocumentTextModelVersion: js.UndefOr[String]
    var DocumentMetadata: js.UndefOr[DocumentMetadata]
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
  @Factory
  trait Document extends js.Object {
    var Bytes: js.UndefOr[ImageBlob]
    var S3Object: js.UndefOr[S3Object]
  }

  /**
    * The Amazon S3 bucket that contains the document to be processed. It's used by asynchronous operations such as <a>StartDocumentTextDetection</a>.
    *  The input document can be an image file in JPEG or PNG format. It can also be a file in PDF format.
    */
  @js.native
  @Factory
  trait DocumentLocation extends js.Object {
    var S3Object: js.UndefOr[S3Object]
  }

  /**
    * Information about the input document.
    */
  @js.native
  @Factory
  trait DocumentMetadata extends js.Object {
    var Pages: js.UndefOr[UInteger]
  }

  @js.native
  sealed trait EntityType extends js.Any
  object EntityType extends js.Object {
    val KEY   = "KEY".asInstanceOf[EntityType]
    val VALUE = "VALUE".asInstanceOf[EntityType]

    val values = js.Object.freeze(js.Array(KEY, VALUE))
  }

  @js.native
  sealed trait FeatureType extends js.Any
  object FeatureType extends js.Object {
    val TABLES = "TABLES".asInstanceOf[FeatureType]
    val FORMS  = "FORMS".asInstanceOf[FeatureType]

    val values = js.Object.freeze(js.Array(TABLES, FORMS))
  }

  /**
    * Information about where the following items are located on a document page: detected page, text, key-value pairs, tables, table cells, and selection elements.
    */
  @js.native
  @Factory
  trait Geometry extends js.Object {
    var BoundingBox: js.UndefOr[BoundingBox]
    var Polygon: js.UndefOr[Polygon]
  }

  @js.native
  @Factory
  trait GetDocumentAnalysisRequest extends js.Object {
    var JobId: JobId
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[PaginationToken]
  }

  @js.native
  @Factory
  trait GetDocumentAnalysisResponse extends js.Object {
    var AnalyzeDocumentModelVersion: js.UndefOr[String]
    var Blocks: js.UndefOr[BlockList]
    var DocumentMetadata: js.UndefOr[DocumentMetadata]
    var JobStatus: js.UndefOr[JobStatus]
    var NextToken: js.UndefOr[PaginationToken]
    var StatusMessage: js.UndefOr[StatusMessage]
    var Warnings: js.UndefOr[Warnings]
  }

  @js.native
  @Factory
  trait GetDocumentTextDetectionRequest extends js.Object {
    var JobId: JobId
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[PaginationToken]
  }

  @js.native
  @Factory
  trait GetDocumentTextDetectionResponse extends js.Object {
    var Blocks: js.UndefOr[BlockList]
    var DetectDocumentTextModelVersion: js.UndefOr[String]
    var DocumentMetadata: js.UndefOr[DocumentMetadata]
    var JobStatus: js.UndefOr[JobStatus]
    var NextToken: js.UndefOr[PaginationToken]
    var StatusMessage: js.UndefOr[StatusMessage]
    var Warnings: js.UndefOr[Warnings]
  }

  /**
    * Shows the results of the human in the loop evaluation. If there is no HumanLoopArn, the input did not trigger human review.
    */
  @js.native
  @Factory
  trait HumanLoopActivationOutput extends js.Object {
    var HumanLoopActivationConditionsEvaluationResults: js.UndefOr[HumanLoopActivationConditionsEvaluationResults]
    var HumanLoopActivationReasons: js.UndefOr[HumanLoopActivationReasons]
    var HumanLoopArn: js.UndefOr[HumanLoopArn]
  }

  /**
    * Sets up the human review workflow the document will be sent to if one of the conditions is met. You can also set certain attributes of the image before review.
    */
  @js.native
  @Factory
  trait HumanLoopConfig extends js.Object {
    var FlowDefinitionArn: FlowDefinitionArn
    var HumanLoopName: HumanLoopName
    var DataAttributes: js.UndefOr[HumanLoopDataAttributes]
  }

  /**
    * Allows you to set attributes of the image. Currently, you can declare an image as free of personally identifiable information and adult content.
    */
  @js.native
  @Factory
  trait HumanLoopDataAttributes extends js.Object {
    var ContentClassifiers: js.UndefOr[ContentClassifiers]
  }

  @js.native
  sealed trait JobStatus extends js.Any
  object JobStatus extends js.Object {
    val IN_PROGRESS     = "IN_PROGRESS".asInstanceOf[JobStatus]
    val SUCCEEDED       = "SUCCEEDED".asInstanceOf[JobStatus]
    val FAILED          = "FAILED".asInstanceOf[JobStatus]
    val PARTIAL_SUCCESS = "PARTIAL_SUCCESS".asInstanceOf[JobStatus]

    val values = js.Object.freeze(js.Array(IN_PROGRESS, SUCCEEDED, FAILED, PARTIAL_SUCCESS))
  }

  /**
    * The Amazon Simple Notification Service (Amazon SNS) topic to which Amazon Textract publishes the completion status of an asynchronous document operation, such as <a>StartDocumentTextDetection</a>.
    */
  @js.native
  @Factory
  trait NotificationChannel extends js.Object {
    var RoleArn: RoleArn
    var SNSTopicArn: SNSTopicArn
  }

  /**
    * The X and Y coordinates of a point on a document page. The X and Y values that are returned are ratios of the overall document page size. For example, if the input document is 700 x 200 and the operation returns X=0.5 and Y=0.25, then the point is at the (350,50) pixel coordinate on the document page.
    *  An array of <code>Point</code> objects, <code>Polygon</code>, is returned by <a>DetectDocumentText</a>. <code>Polygon</code> represents a fine-grained polygon around detected text. For more information, see Geometry in the Amazon Textract Developer Guide.
    */
  @js.native
  @Factory
  trait Point extends js.Object {
    var X: js.UndefOr[Float]
    var Y: js.UndefOr[Float]
  }

  /**
    * Information about how blocks are related to each other. A <code>Block</code> object contains 0 or more <code>Relation</code> objects in a list, <code>Relationships</code>. For more information, see <a>Block</a>.
    *  The <code>Type</code> element provides the type of the relationship for all blocks in the <code>IDs</code> array.
    */
  @js.native
  @Factory
  trait Relationship extends js.Object {
    var Ids: js.UndefOr[IdList]
    var Type: js.UndefOr[RelationshipType]
  }

  @js.native
  sealed trait RelationshipType extends js.Any
  object RelationshipType extends js.Object {
    val VALUE = "VALUE".asInstanceOf[RelationshipType]
    val CHILD = "CHILD".asInstanceOf[RelationshipType]

    val values = js.Object.freeze(js.Array(VALUE, CHILD))
  }

  /**
    * The S3 bucket name and file name that identifies the document.
    *  The AWS Region for the S3 bucket that contains the document must match the Region that you use for Amazon Textract operations.
    *  For Amazon Textract to process a file in an S3 bucket, the user must have permission to access the S3 bucket and file.
    */
  @js.native
  @Factory
  trait S3Object extends js.Object {
    var Bucket: js.UndefOr[S3Bucket]
    var Name: js.UndefOr[S3ObjectName]
    var Version: js.UndefOr[S3ObjectVersion]
  }

  @js.native
  sealed trait SelectionStatus extends js.Any
  object SelectionStatus extends js.Object {
    val SELECTED     = "SELECTED".asInstanceOf[SelectionStatus]
    val NOT_SELECTED = "NOT_SELECTED".asInstanceOf[SelectionStatus]

    val values = js.Object.freeze(js.Array(SELECTED, NOT_SELECTED))
  }

  @js.native
  @Factory
  trait StartDocumentAnalysisRequest extends js.Object {
    var DocumentLocation: DocumentLocation
    var FeatureTypes: FeatureTypes
    var ClientRequestToken: js.UndefOr[ClientRequestToken]
    var JobTag: js.UndefOr[JobTag]
    var NotificationChannel: js.UndefOr[NotificationChannel]
  }

  @js.native
  @Factory
  trait StartDocumentAnalysisResponse extends js.Object {
    var JobId: js.UndefOr[JobId]
  }

  @js.native
  @Factory
  trait StartDocumentTextDetectionRequest extends js.Object {
    var DocumentLocation: DocumentLocation
    var ClientRequestToken: js.UndefOr[ClientRequestToken]
    var JobTag: js.UndefOr[JobTag]
    var NotificationChannel: js.UndefOr[NotificationChannel]
  }

  @js.native
  @Factory
  trait StartDocumentTextDetectionResponse extends js.Object {
    var JobId: js.UndefOr[JobId]
  }

  /**
    * A warning about an issue that occurred during asynchronous text analysis (<a>StartDocumentAnalysis</a>) or asynchronous document text detection (<a>StartDocumentTextDetection</a>).
    */
  @js.native
  @Factory
  trait Warning extends js.Object {
    var ErrorCode: js.UndefOr[ErrorCode]
    var Pages: js.UndefOr[Pages]
  }
}
