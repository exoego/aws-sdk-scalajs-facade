package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

package object textract {
  type BlockList = js.Array[Block]
  type ClientRequestToken = String
  type ContentClassifiers = js.Array[ContentClassifier]
  type EntityTypes = js.Array[EntityType]
  type ErrorCode = String
  type FeatureTypes = js.Array[FeatureType]
  type FlowDefinitionArn = String
  type HumanLoopActivationConditionsEvaluationResults = String
  type HumanLoopActivationReason = String
  type HumanLoopActivationReasons = js.Array[HumanLoopActivationReason]
  type HumanLoopArn = String
  type HumanLoopName = String
  type IdList = js.Array[NonEmptyString]
  type ImageBlob = js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type JobId = String
  type JobTag = String
  type KMSKeyId = String
  type MaxResults = Int
  type NonEmptyString = String
  type Pages = js.Array[UInteger]
  type PaginationToken = String
  type Percent = Float
  type Polygon = js.Array[Point]
  type RelationshipList = js.Array[Relationship]
  type RoleArn = String
  type S3Bucket = String
  type S3ObjectName = String
  type S3ObjectVersion = String
  type SNSTopicArn = String
  type StatusMessage = String
  type UInteger = Int
  type Warnings = js.Array[Warning]

  implicit final class TextractOps(private val service: Textract) extends AnyVal {

    @inline def analyzeDocumentFuture(params: AnalyzeDocumentRequest): Future[AnalyzeDocumentResponse] = service.analyzeDocument(params).promise().toFuture
    @inline def detectDocumentTextFuture(params: DetectDocumentTextRequest): Future[DetectDocumentTextResponse] = service.detectDocumentText(params).promise().toFuture
    @inline def getDocumentAnalysisFuture(params: GetDocumentAnalysisRequest): Future[GetDocumentAnalysisResponse] = service.getDocumentAnalysis(params).promise().toFuture
    @inline def getDocumentTextDetectionFuture(params: GetDocumentTextDetectionRequest): Future[GetDocumentTextDetectionResponse] = service.getDocumentTextDetection(params).promise().toFuture
    @inline def startDocumentAnalysisFuture(params: StartDocumentAnalysisRequest): Future[StartDocumentAnalysisResponse] = service.startDocumentAnalysis(params).promise().toFuture
    @inline def startDocumentTextDetectionFuture(params: StartDocumentTextDetectionRequest): Future[StartDocumentTextDetectionResponse] = service.startDocumentTextDetection(params).promise().toFuture

  }
}

package textract {
  @js.native
  @JSImport("aws-sdk/clients/textract", JSImport.Namespace, "AWS.Textract")
  class Textract() extends js.Object {
    def this(config: AWSConfig) = this()

    def analyzeDocument(params: AnalyzeDocumentRequest): Request[AnalyzeDocumentResponse] = js.native
    def detectDocumentText(params: DetectDocumentTextRequest): Request[DetectDocumentTextResponse] = js.native
    def getDocumentAnalysis(params: GetDocumentAnalysisRequest): Request[GetDocumentAnalysisResponse] = js.native
    def getDocumentTextDetection(params: GetDocumentTextDetectionRequest): Request[GetDocumentTextDetectionResponse] = js.native
    def startDocumentAnalysis(params: StartDocumentAnalysisRequest): Request[StartDocumentAnalysisResponse] = js.native
    def startDocumentTextDetection(params: StartDocumentTextDetectionRequest): Request[StartDocumentTextDetectionResponse] = js.native
  }

  @js.native
  trait AnalyzeDocumentRequest extends js.Object {
    var Document: Document
    var FeatureTypes: FeatureTypes
    var HumanLoopConfig: js.UndefOr[HumanLoopConfig]
  }

  object AnalyzeDocumentRequest {
    @inline
    def apply(
        Document: Document,
        FeatureTypes: FeatureTypes,
        HumanLoopConfig: js.UndefOr[HumanLoopConfig] = js.undefined
    ): AnalyzeDocumentRequest = {
      val __obj = js.Dynamic.literal(
        "Document" -> Document.asInstanceOf[js.Any],
        "FeatureTypes" -> FeatureTypes.asInstanceOf[js.Any]
      )

      HumanLoopConfig.foreach(__v => __obj.updateDynamic("HumanLoopConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AnalyzeDocumentRequest]
    }
  }

  @js.native
  trait AnalyzeDocumentResponse extends js.Object {
    var AnalyzeDocumentModelVersion: js.UndefOr[String]
    var Blocks: js.UndefOr[BlockList]
    var DocumentMetadata: js.UndefOr[DocumentMetadata]
    var HumanLoopActivationOutput: js.UndefOr[HumanLoopActivationOutput]
  }

  object AnalyzeDocumentResponse {
    @inline
    def apply(
        AnalyzeDocumentModelVersion: js.UndefOr[String] = js.undefined,
        Blocks: js.UndefOr[BlockList] = js.undefined,
        DocumentMetadata: js.UndefOr[DocumentMetadata] = js.undefined,
        HumanLoopActivationOutput: js.UndefOr[HumanLoopActivationOutput] = js.undefined
    ): AnalyzeDocumentResponse = {
      val __obj = js.Dynamic.literal()
      AnalyzeDocumentModelVersion.foreach(__v => __obj.updateDynamic("AnalyzeDocumentModelVersion")(__v.asInstanceOf[js.Any]))
      Blocks.foreach(__v => __obj.updateDynamic("Blocks")(__v.asInstanceOf[js.Any]))
      DocumentMetadata.foreach(__v => __obj.updateDynamic("DocumentMetadata")(__v.asInstanceOf[js.Any]))
      HumanLoopActivationOutput.foreach(__v => __obj.updateDynamic("HumanLoopActivationOutput")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AnalyzeDocumentResponse]
    }
  }

  /** A <code>Block</code> represents items that are recognized in a document within a group of pixels close to each other. The information returned in a <code>Block</code> object depends on the type of operation. In text detection for documents (for example <a>DetectDocumentText</a>), you get information about the detected words and lines of text. In text analysis (for example <a>AnalyzeDocument</a>), you can also get information about the fields, tables, and selection elements that are detected in the document. An array of <code>Block</code> objects is returned by both synchronous and asynchronous operations. In synchronous operations, such as <a>DetectDocumentText</a>, the array of <code>Block</code> objects is the entire set of results. In asynchronous operations, such as <a>GetDocumentAnalysis</a>, the array is returned over one or more responses. For more information, see [[https://docs.aws.amazon.com/textract/latest/dg/how-it-works.html|How Amazon Textract Works]].
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
    var TextType: js.UndefOr[TextType]
  }

  object Block {
    @inline
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
        Text: js.UndefOr[String] = js.undefined,
        TextType: js.UndefOr[TextType] = js.undefined
    ): Block = {
      val __obj = js.Dynamic.literal()
      BlockType.foreach(__v => __obj.updateDynamic("BlockType")(__v.asInstanceOf[js.Any]))
      ColumnIndex.foreach(__v => __obj.updateDynamic("ColumnIndex")(__v.asInstanceOf[js.Any]))
      ColumnSpan.foreach(__v => __obj.updateDynamic("ColumnSpan")(__v.asInstanceOf[js.Any]))
      Confidence.foreach(__v => __obj.updateDynamic("Confidence")(__v.asInstanceOf[js.Any]))
      EntityTypes.foreach(__v => __obj.updateDynamic("EntityTypes")(__v.asInstanceOf[js.Any]))
      Geometry.foreach(__v => __obj.updateDynamic("Geometry")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      Page.foreach(__v => __obj.updateDynamic("Page")(__v.asInstanceOf[js.Any]))
      Relationships.foreach(__v => __obj.updateDynamic("Relationships")(__v.asInstanceOf[js.Any]))
      RowIndex.foreach(__v => __obj.updateDynamic("RowIndex")(__v.asInstanceOf[js.Any]))
      RowSpan.foreach(__v => __obj.updateDynamic("RowSpan")(__v.asInstanceOf[js.Any]))
      SelectionStatus.foreach(__v => __obj.updateDynamic("SelectionStatus")(__v.asInstanceOf[js.Any]))
      Text.foreach(__v => __obj.updateDynamic("Text")(__v.asInstanceOf[js.Any]))
      TextType.foreach(__v => __obj.updateDynamic("TextType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Block]
    }
  }

  @js.native
  sealed trait BlockType extends js.Any
  object BlockType {
    val KEY_VALUE_SET = "KEY_VALUE_SET".asInstanceOf[BlockType]
    val PAGE = "PAGE".asInstanceOf[BlockType]
    val LINE = "LINE".asInstanceOf[BlockType]
    val WORD = "WORD".asInstanceOf[BlockType]
    val TABLE = "TABLE".asInstanceOf[BlockType]
    val CELL = "CELL".asInstanceOf[BlockType]
    val SELECTION_ELEMENT = "SELECTION_ELEMENT".asInstanceOf[BlockType]

    @inline def values = js.Array(KEY_VALUE_SET, PAGE, LINE, WORD, TABLE, CELL, SELECTION_ELEMENT)
  }

  /** The bounding box around the detected page, text, key-value pair, table, table cell, or selection element on a document page. The <code>left</code> (x-coordinate) and <code>top</code> (y-coordinate) are coordinates that represent the top and left sides of the bounding box. Note that the upper-left corner of the image is the origin (0,0). The <code>top</code> and <code>left</code> values returned are ratios of the overall document page size. For example, if the input image is 700 x 200 pixels, and the top-left coordinate of the bounding box is 350 x 50 pixels, the API returns a <code>left</code> value of 0.5 (350/700) and a <code>top</code> value of 0.25 (50/200). The <code>width</code> and <code>height</code> values represent the dimensions of the bounding box as a ratio of the overall document page dimension. For example, if the document page size is 700 x 200 pixels, and the bounding box width is 70 pixels, the width returned is 0.1.
    */
  @js.native
  trait BoundingBox extends js.Object {
    var Height: js.UndefOr[Float]
    var Left: js.UndefOr[Float]
    var Top: js.UndefOr[Float]
    var Width: js.UndefOr[Float]
  }

  object BoundingBox {
    @inline
    def apply(
        Height: js.UndefOr[Float] = js.undefined,
        Left: js.UndefOr[Float] = js.undefined,
        Top: js.UndefOr[Float] = js.undefined,
        Width: js.UndefOr[Float] = js.undefined
    ): BoundingBox = {
      val __obj = js.Dynamic.literal()
      Height.foreach(__v => __obj.updateDynamic("Height")(__v.asInstanceOf[js.Any]))
      Left.foreach(__v => __obj.updateDynamic("Left")(__v.asInstanceOf[js.Any]))
      Top.foreach(__v => __obj.updateDynamic("Top")(__v.asInstanceOf[js.Any]))
      Width.foreach(__v => __obj.updateDynamic("Width")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BoundingBox]
    }
  }

  @js.native
  sealed trait ContentClassifier extends js.Any
  object ContentClassifier {
    val FreeOfPersonallyIdentifiableInformation = "FreeOfPersonallyIdentifiableInformation".asInstanceOf[ContentClassifier]
    val FreeOfAdultContent = "FreeOfAdultContent".asInstanceOf[ContentClassifier]

    @inline def values = js.Array(FreeOfPersonallyIdentifiableInformation, FreeOfAdultContent)
  }

  @js.native
  trait DetectDocumentTextRequest extends js.Object {
    var Document: Document
  }

  object DetectDocumentTextRequest {
    @inline
    def apply(
        Document: Document
    ): DetectDocumentTextRequest = {
      val __obj = js.Dynamic.literal(
        "Document" -> Document.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DetectDocumentTextRequest]
    }
  }

  @js.native
  trait DetectDocumentTextResponse extends js.Object {
    var Blocks: js.UndefOr[BlockList]
    var DetectDocumentTextModelVersion: js.UndefOr[String]
    var DocumentMetadata: js.UndefOr[DocumentMetadata]
  }

  object DetectDocumentTextResponse {
    @inline
    def apply(
        Blocks: js.UndefOr[BlockList] = js.undefined,
        DetectDocumentTextModelVersion: js.UndefOr[String] = js.undefined,
        DocumentMetadata: js.UndefOr[DocumentMetadata] = js.undefined
    ): DetectDocumentTextResponse = {
      val __obj = js.Dynamic.literal()
      Blocks.foreach(__v => __obj.updateDynamic("Blocks")(__v.asInstanceOf[js.Any]))
      DetectDocumentTextModelVersion.foreach(__v => __obj.updateDynamic("DetectDocumentTextModelVersion")(__v.asInstanceOf[js.Any]))
      DocumentMetadata.foreach(__v => __obj.updateDynamic("DocumentMetadata")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DetectDocumentTextResponse]
    }
  }

  /** The input document, either as bytes or as an S3 object. You pass image bytes to an Amazon Textract API operation by using the <code>Bytes</code> property. For example, you would use the <code>Bytes</code> property to pass a document loaded from a local file system. Image bytes passed by using the <code>Bytes</code> property must be base64 encoded. Your code might not need to encode document file bytes if you're using an AWS SDK to call Amazon Textract API operations. You pass images stored in an S3 bucket to an Amazon Textract API operation by using the <code>S3Object</code> property. Documents stored in an S3 bucket don't need to be base64 encoded. The AWS Region for the S3 bucket that contains the S3 object must match the AWS Region that you use for Amazon Textract operations. If you use the AWS CLI to call Amazon Textract operations, passing image bytes using the Bytes property isn't supported. You must first upload the document to an Amazon S3 bucket, and then call the
    * operation using the S3Object property. For Amazon Textract to process an S3 object, the user must have permission to access the S3 object.
    */
  @js.native
  trait Document extends js.Object {
    var Bytes: js.UndefOr[ImageBlob]
    var S3Object: js.UndefOr[S3Object]
  }

  object Document {
    @inline
    def apply(
        Bytes: js.UndefOr[ImageBlob] = js.undefined,
        S3Object: js.UndefOr[S3Object] = js.undefined
    ): Document = {
      val __obj = js.Dynamic.literal()
      Bytes.foreach(__v => __obj.updateDynamic("Bytes")(__v.asInstanceOf[js.Any]))
      S3Object.foreach(__v => __obj.updateDynamic("S3Object")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Document]
    }
  }

  /** The Amazon S3 bucket that contains the document to be processed. It's used by asynchronous operations such as <a>StartDocumentTextDetection</a>. The input document can be an image file in JPEG or PNG format. It can also be a file in PDF format.
    */
  @js.native
  trait DocumentLocation extends js.Object {
    var S3Object: js.UndefOr[S3Object]
  }

  object DocumentLocation {
    @inline
    def apply(
        S3Object: js.UndefOr[S3Object] = js.undefined
    ): DocumentLocation = {
      val __obj = js.Dynamic.literal()
      S3Object.foreach(__v => __obj.updateDynamic("S3Object")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DocumentLocation]
    }
  }

  /** Information about the input document.
    */
  @js.native
  trait DocumentMetadata extends js.Object {
    var Pages: js.UndefOr[UInteger]
  }

  object DocumentMetadata {
    @inline
    def apply(
        Pages: js.UndefOr[UInteger] = js.undefined
    ): DocumentMetadata = {
      val __obj = js.Dynamic.literal()
      Pages.foreach(__v => __obj.updateDynamic("Pages")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DocumentMetadata]
    }
  }

  @js.native
  sealed trait EntityType extends js.Any
  object EntityType {
    val KEY = "KEY".asInstanceOf[EntityType]
    val VALUE = "VALUE".asInstanceOf[EntityType]

    @inline def values = js.Array(KEY, VALUE)
  }

  @js.native
  sealed trait FeatureType extends js.Any
  object FeatureType {
    val TABLES = "TABLES".asInstanceOf[FeatureType]
    val FORMS = "FORMS".asInstanceOf[FeatureType]

    @inline def values = js.Array(TABLES, FORMS)
  }

  /** Information about where the following items are located on a document page: detected page, text, key-value pairs, tables, table cells, and selection elements.
    */
  @js.native
  trait Geometry extends js.Object {
    var BoundingBox: js.UndefOr[BoundingBox]
    var Polygon: js.UndefOr[Polygon]
  }

  object Geometry {
    @inline
    def apply(
        BoundingBox: js.UndefOr[BoundingBox] = js.undefined,
        Polygon: js.UndefOr[Polygon] = js.undefined
    ): Geometry = {
      val __obj = js.Dynamic.literal()
      BoundingBox.foreach(__v => __obj.updateDynamic("BoundingBox")(__v.asInstanceOf[js.Any]))
      Polygon.foreach(__v => __obj.updateDynamic("Polygon")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        JobId: JobId,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined
    ): GetDocumentAnalysisRequest = {
      val __obj = js.Dynamic.literal(
        "JobId" -> JobId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDocumentAnalysisRequest]
    }
  }

  @js.native
  trait GetDocumentAnalysisResponse extends js.Object {
    var AnalyzeDocumentModelVersion: js.UndefOr[String]
    var Blocks: js.UndefOr[BlockList]
    var DocumentMetadata: js.UndefOr[DocumentMetadata]
    var JobStatus: js.UndefOr[JobStatus]
    var NextToken: js.UndefOr[PaginationToken]
    var StatusMessage: js.UndefOr[StatusMessage]
    var Warnings: js.UndefOr[Warnings]
  }

  object GetDocumentAnalysisResponse {
    @inline
    def apply(
        AnalyzeDocumentModelVersion: js.UndefOr[String] = js.undefined,
        Blocks: js.UndefOr[BlockList] = js.undefined,
        DocumentMetadata: js.UndefOr[DocumentMetadata] = js.undefined,
        JobStatus: js.UndefOr[JobStatus] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined,
        StatusMessage: js.UndefOr[StatusMessage] = js.undefined,
        Warnings: js.UndefOr[Warnings] = js.undefined
    ): GetDocumentAnalysisResponse = {
      val __obj = js.Dynamic.literal()
      AnalyzeDocumentModelVersion.foreach(__v => __obj.updateDynamic("AnalyzeDocumentModelVersion")(__v.asInstanceOf[js.Any]))
      Blocks.foreach(__v => __obj.updateDynamic("Blocks")(__v.asInstanceOf[js.Any]))
      DocumentMetadata.foreach(__v => __obj.updateDynamic("DocumentMetadata")(__v.asInstanceOf[js.Any]))
      JobStatus.foreach(__v => __obj.updateDynamic("JobStatus")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      StatusMessage.foreach(__v => __obj.updateDynamic("StatusMessage")(__v.asInstanceOf[js.Any]))
      Warnings.foreach(__v => __obj.updateDynamic("Warnings")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        JobId: JobId,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined
    ): GetDocumentTextDetectionRequest = {
      val __obj = js.Dynamic.literal(
        "JobId" -> JobId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDocumentTextDetectionRequest]
    }
  }

  @js.native
  trait GetDocumentTextDetectionResponse extends js.Object {
    var Blocks: js.UndefOr[BlockList]
    var DetectDocumentTextModelVersion: js.UndefOr[String]
    var DocumentMetadata: js.UndefOr[DocumentMetadata]
    var JobStatus: js.UndefOr[JobStatus]
    var NextToken: js.UndefOr[PaginationToken]
    var StatusMessage: js.UndefOr[StatusMessage]
    var Warnings: js.UndefOr[Warnings]
  }

  object GetDocumentTextDetectionResponse {
    @inline
    def apply(
        Blocks: js.UndefOr[BlockList] = js.undefined,
        DetectDocumentTextModelVersion: js.UndefOr[String] = js.undefined,
        DocumentMetadata: js.UndefOr[DocumentMetadata] = js.undefined,
        JobStatus: js.UndefOr[JobStatus] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined,
        StatusMessage: js.UndefOr[StatusMessage] = js.undefined,
        Warnings: js.UndefOr[Warnings] = js.undefined
    ): GetDocumentTextDetectionResponse = {
      val __obj = js.Dynamic.literal()
      Blocks.foreach(__v => __obj.updateDynamic("Blocks")(__v.asInstanceOf[js.Any]))
      DetectDocumentTextModelVersion.foreach(__v => __obj.updateDynamic("DetectDocumentTextModelVersion")(__v.asInstanceOf[js.Any]))
      DocumentMetadata.foreach(__v => __obj.updateDynamic("DocumentMetadata")(__v.asInstanceOf[js.Any]))
      JobStatus.foreach(__v => __obj.updateDynamic("JobStatus")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      StatusMessage.foreach(__v => __obj.updateDynamic("StatusMessage")(__v.asInstanceOf[js.Any]))
      Warnings.foreach(__v => __obj.updateDynamic("Warnings")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDocumentTextDetectionResponse]
    }
  }

  /** Shows the results of the human in the loop evaluation. If there is no HumanLoopArn, the input did not trigger human review.
    */
  @js.native
  trait HumanLoopActivationOutput extends js.Object {
    var HumanLoopActivationConditionsEvaluationResults: js.UndefOr[HumanLoopActivationConditionsEvaluationResults]
    var HumanLoopActivationReasons: js.UndefOr[HumanLoopActivationReasons]
    var HumanLoopArn: js.UndefOr[HumanLoopArn]
  }

  object HumanLoopActivationOutput {
    @inline
    def apply(
        HumanLoopActivationConditionsEvaluationResults: js.UndefOr[HumanLoopActivationConditionsEvaluationResults] = js.undefined,
        HumanLoopActivationReasons: js.UndefOr[HumanLoopActivationReasons] = js.undefined,
        HumanLoopArn: js.UndefOr[HumanLoopArn] = js.undefined
    ): HumanLoopActivationOutput = {
      val __obj = js.Dynamic.literal()
      HumanLoopActivationConditionsEvaluationResults.foreach(__v => __obj.updateDynamic("HumanLoopActivationConditionsEvaluationResults")(__v.asInstanceOf[js.Any]))
      HumanLoopActivationReasons.foreach(__v => __obj.updateDynamic("HumanLoopActivationReasons")(__v.asInstanceOf[js.Any]))
      HumanLoopArn.foreach(__v => __obj.updateDynamic("HumanLoopArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HumanLoopActivationOutput]
    }
  }

  /** Sets up the human review workflow the document will be sent to if one of the conditions is met. You can also set certain attributes of the image before review.
    */
  @js.native
  trait HumanLoopConfig extends js.Object {
    var FlowDefinitionArn: FlowDefinitionArn
    var HumanLoopName: HumanLoopName
    var DataAttributes: js.UndefOr[HumanLoopDataAttributes]
  }

  object HumanLoopConfig {
    @inline
    def apply(
        FlowDefinitionArn: FlowDefinitionArn,
        HumanLoopName: HumanLoopName,
        DataAttributes: js.UndefOr[HumanLoopDataAttributes] = js.undefined
    ): HumanLoopConfig = {
      val __obj = js.Dynamic.literal(
        "FlowDefinitionArn" -> FlowDefinitionArn.asInstanceOf[js.Any],
        "HumanLoopName" -> HumanLoopName.asInstanceOf[js.Any]
      )

      DataAttributes.foreach(__v => __obj.updateDynamic("DataAttributes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HumanLoopConfig]
    }
  }

  /** Allows you to set attributes of the image. Currently, you can declare an image as free of personally identifiable information and adult content.
    */
  @js.native
  trait HumanLoopDataAttributes extends js.Object {
    var ContentClassifiers: js.UndefOr[ContentClassifiers]
  }

  object HumanLoopDataAttributes {
    @inline
    def apply(
        ContentClassifiers: js.UndefOr[ContentClassifiers] = js.undefined
    ): HumanLoopDataAttributes = {
      val __obj = js.Dynamic.literal()
      ContentClassifiers.foreach(__v => __obj.updateDynamic("ContentClassifiers")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HumanLoopDataAttributes]
    }
  }

  @js.native
  sealed trait JobStatus extends js.Any
  object JobStatus {
    val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[JobStatus]
    val SUCCEEDED = "SUCCEEDED".asInstanceOf[JobStatus]
    val FAILED = "FAILED".asInstanceOf[JobStatus]
    val PARTIAL_SUCCESS = "PARTIAL_SUCCESS".asInstanceOf[JobStatus]

    @inline def values = js.Array(IN_PROGRESS, SUCCEEDED, FAILED, PARTIAL_SUCCESS)
  }

  /** The Amazon Simple Notification Service (Amazon SNS) topic to which Amazon Textract publishes the completion status of an asynchronous document operation, such as <a>StartDocumentTextDetection</a>.
    */
  @js.native
  trait NotificationChannel extends js.Object {
    var RoleArn: RoleArn
    var SNSTopicArn: SNSTopicArn
  }

  object NotificationChannel {
    @inline
    def apply(
        RoleArn: RoleArn,
        SNSTopicArn: SNSTopicArn
    ): NotificationChannel = {
      val __obj = js.Dynamic.literal(
        "RoleArn" -> RoleArn.asInstanceOf[js.Any],
        "SNSTopicArn" -> SNSTopicArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[NotificationChannel]
    }
  }

  /** Sets whether or not your output will go to a user created bucket. Used to set the name of the bucket, and the prefix on the output file.
    */
  @js.native
  trait OutputConfig extends js.Object {
    var S3Bucket: S3Bucket
    var S3Prefix: js.UndefOr[S3ObjectName]
  }

  object OutputConfig {
    @inline
    def apply(
        S3Bucket: S3Bucket,
        S3Prefix: js.UndefOr[S3ObjectName] = js.undefined
    ): OutputConfig = {
      val __obj = js.Dynamic.literal(
        "S3Bucket" -> S3Bucket.asInstanceOf[js.Any]
      )

      S3Prefix.foreach(__v => __obj.updateDynamic("S3Prefix")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OutputConfig]
    }
  }

  /** The X and Y coordinates of a point on a document page. The X and Y values that are returned are ratios of the overall document page size. For example, if the input document is 700 x 200 and the operation returns X=0.5 and Y=0.25, then the point is at the (350,50) pixel coordinate on the document page. An array of <code>Point</code> objects, <code>Polygon</code>, is returned by <a>DetectDocumentText</a>. <code>Polygon</code> represents a fine-grained polygon around detected text. For more information, see Geometry in the Amazon Textract Developer Guide.
    */
  @js.native
  trait Point extends js.Object {
    var X: js.UndefOr[Float]
    var Y: js.UndefOr[Float]
  }

  object Point {
    @inline
    def apply(
        X: js.UndefOr[Float] = js.undefined,
        Y: js.UndefOr[Float] = js.undefined
    ): Point = {
      val __obj = js.Dynamic.literal()
      X.foreach(__v => __obj.updateDynamic("X")(__v.asInstanceOf[js.Any]))
      Y.foreach(__v => __obj.updateDynamic("Y")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Point]
    }
  }

  /** Information about how blocks are related to each other. A <code>Block</code> object contains 0 or more <code>Relation</code> objects in a list, <code>Relationships</code>. For more information, see <a>Block</a>. The <code>Type</code> element provides the type of the relationship for all blocks in the <code>IDs</code> array.
    */
  @js.native
  trait Relationship extends js.Object {
    var Ids: js.UndefOr[IdList]
    var Type: js.UndefOr[RelationshipType]
  }

  object Relationship {
    @inline
    def apply(
        Ids: js.UndefOr[IdList] = js.undefined,
        Type: js.UndefOr[RelationshipType] = js.undefined
    ): Relationship = {
      val __obj = js.Dynamic.literal()
      Ids.foreach(__v => __obj.updateDynamic("Ids")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Relationship]
    }
  }

  @js.native
  sealed trait RelationshipType extends js.Any
  object RelationshipType {
    val VALUE = "VALUE".asInstanceOf[RelationshipType]
    val CHILD = "CHILD".asInstanceOf[RelationshipType]
    val COMPLEX_FEATURES = "COMPLEX_FEATURES".asInstanceOf[RelationshipType]

    @inline def values = js.Array(VALUE, CHILD, COMPLEX_FEATURES)
  }

  /** The S3 bucket name and file name that identifies the document. The AWS Region for the S3 bucket that contains the document must match the Region that you use for Amazon Textract operations. For Amazon Textract to process a file in an S3 bucket, the user must have permission to access the S3 bucket and file.
    */
  @js.native
  trait S3Object extends js.Object {
    var Bucket: js.UndefOr[S3Bucket]
    var Name: js.UndefOr[S3ObjectName]
    var Version: js.UndefOr[S3ObjectVersion]
  }

  object S3Object {
    @inline
    def apply(
        Bucket: js.UndefOr[S3Bucket] = js.undefined,
        Name: js.UndefOr[S3ObjectName] = js.undefined,
        Version: js.UndefOr[S3ObjectVersion] = js.undefined
    ): S3Object = {
      val __obj = js.Dynamic.literal()
      Bucket.foreach(__v => __obj.updateDynamic("Bucket")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Version.foreach(__v => __obj.updateDynamic("Version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[S3Object]
    }
  }

  @js.native
  sealed trait SelectionStatus extends js.Any
  object SelectionStatus {
    val SELECTED = "SELECTED".asInstanceOf[SelectionStatus]
    val NOT_SELECTED = "NOT_SELECTED".asInstanceOf[SelectionStatus]

    @inline def values = js.Array(SELECTED, NOT_SELECTED)
  }

  @js.native
  trait StartDocumentAnalysisRequest extends js.Object {
    var DocumentLocation: DocumentLocation
    var FeatureTypes: FeatureTypes
    var ClientRequestToken: js.UndefOr[ClientRequestToken]
    var JobTag: js.UndefOr[JobTag]
    var KMSKeyId: js.UndefOr[KMSKeyId]
    var NotificationChannel: js.UndefOr[NotificationChannel]
    var OutputConfig: js.UndefOr[OutputConfig]
  }

  object StartDocumentAnalysisRequest {
    @inline
    def apply(
        DocumentLocation: DocumentLocation,
        FeatureTypes: FeatureTypes,
        ClientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined,
        JobTag: js.UndefOr[JobTag] = js.undefined,
        KMSKeyId: js.UndefOr[KMSKeyId] = js.undefined,
        NotificationChannel: js.UndefOr[NotificationChannel] = js.undefined,
        OutputConfig: js.UndefOr[OutputConfig] = js.undefined
    ): StartDocumentAnalysisRequest = {
      val __obj = js.Dynamic.literal(
        "DocumentLocation" -> DocumentLocation.asInstanceOf[js.Any],
        "FeatureTypes" -> FeatureTypes.asInstanceOf[js.Any]
      )

      ClientRequestToken.foreach(__v => __obj.updateDynamic("ClientRequestToken")(__v.asInstanceOf[js.Any]))
      JobTag.foreach(__v => __obj.updateDynamic("JobTag")(__v.asInstanceOf[js.Any]))
      KMSKeyId.foreach(__v => __obj.updateDynamic("KMSKeyId")(__v.asInstanceOf[js.Any]))
      NotificationChannel.foreach(__v => __obj.updateDynamic("NotificationChannel")(__v.asInstanceOf[js.Any]))
      OutputConfig.foreach(__v => __obj.updateDynamic("OutputConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartDocumentAnalysisRequest]
    }
  }

  @js.native
  trait StartDocumentAnalysisResponse extends js.Object {
    var JobId: js.UndefOr[JobId]
  }

  object StartDocumentAnalysisResponse {
    @inline
    def apply(
        JobId: js.UndefOr[JobId] = js.undefined
    ): StartDocumentAnalysisResponse = {
      val __obj = js.Dynamic.literal()
      JobId.foreach(__v => __obj.updateDynamic("JobId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartDocumentAnalysisResponse]
    }
  }

  @js.native
  trait StartDocumentTextDetectionRequest extends js.Object {
    var DocumentLocation: DocumentLocation
    var ClientRequestToken: js.UndefOr[ClientRequestToken]
    var JobTag: js.UndefOr[JobTag]
    var KMSKeyId: js.UndefOr[KMSKeyId]
    var NotificationChannel: js.UndefOr[NotificationChannel]
    var OutputConfig: js.UndefOr[OutputConfig]
  }

  object StartDocumentTextDetectionRequest {
    @inline
    def apply(
        DocumentLocation: DocumentLocation,
        ClientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined,
        JobTag: js.UndefOr[JobTag] = js.undefined,
        KMSKeyId: js.UndefOr[KMSKeyId] = js.undefined,
        NotificationChannel: js.UndefOr[NotificationChannel] = js.undefined,
        OutputConfig: js.UndefOr[OutputConfig] = js.undefined
    ): StartDocumentTextDetectionRequest = {
      val __obj = js.Dynamic.literal(
        "DocumentLocation" -> DocumentLocation.asInstanceOf[js.Any]
      )

      ClientRequestToken.foreach(__v => __obj.updateDynamic("ClientRequestToken")(__v.asInstanceOf[js.Any]))
      JobTag.foreach(__v => __obj.updateDynamic("JobTag")(__v.asInstanceOf[js.Any]))
      KMSKeyId.foreach(__v => __obj.updateDynamic("KMSKeyId")(__v.asInstanceOf[js.Any]))
      NotificationChannel.foreach(__v => __obj.updateDynamic("NotificationChannel")(__v.asInstanceOf[js.Any]))
      OutputConfig.foreach(__v => __obj.updateDynamic("OutputConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartDocumentTextDetectionRequest]
    }
  }

  @js.native
  trait StartDocumentTextDetectionResponse extends js.Object {
    var JobId: js.UndefOr[JobId]
  }

  object StartDocumentTextDetectionResponse {
    @inline
    def apply(
        JobId: js.UndefOr[JobId] = js.undefined
    ): StartDocumentTextDetectionResponse = {
      val __obj = js.Dynamic.literal()
      JobId.foreach(__v => __obj.updateDynamic("JobId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartDocumentTextDetectionResponse]
    }
  }

  @js.native
  sealed trait TextType extends js.Any
  object TextType {
    val HANDWRITING = "HANDWRITING".asInstanceOf[TextType]
    val PRINTED = "PRINTED".asInstanceOf[TextType]

    @inline def values = js.Array(HANDWRITING, PRINTED)
  }

  /** A warning about an issue that occurred during asynchronous text analysis (<a>StartDocumentAnalysis</a>) or asynchronous document text detection (<a>StartDocumentTextDetection</a>).
    */
  @js.native
  trait Warning extends js.Object {
    var ErrorCode: js.UndefOr[ErrorCode]
    var Pages: js.UndefOr[Pages]
  }

  object Warning {
    @inline
    def apply(
        ErrorCode: js.UndefOr[ErrorCode] = js.undefined,
        Pages: js.UndefOr[Pages] = js.undefined
    ): Warning = {
      val __obj = js.Dynamic.literal()
      ErrorCode.foreach(__v => __obj.updateDynamic("ErrorCode")(__v.asInstanceOf[js.Any]))
      Pages.foreach(__v => __obj.updateDynamic("Pages")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Warning]
    }
  }
}
