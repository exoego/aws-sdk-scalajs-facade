package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import io.scalajs.nodejs
import facade.amazonaws._

package object cur {
  type AWSRegion              = String
  type AdditionalArtifact     = String
  type AdditionalArtifactList = js.Array[AdditionalArtifact]
  type CompressionFormat      = String
  type DeleteResponseMessage  = String
  type GenericString          = String
  type MaxResults             = Int
  type RefreshClosedReports   = Boolean
  type ReportDefinitionList   = js.Array[ReportDefinition]
  type ReportFormat           = String
  type ReportName             = String
  type ReportVersioning       = String
  type S3Bucket               = String
  type S3Prefix               = String
  type SchemaElement          = String
  type SchemaElementList      = js.Array[SchemaElement]
  type TimeUnit               = String

  implicit final class CUROps(val service: CUR) extends AnyVal {

    def deleteReportDefinitionFuture(params: DeleteReportDefinitionRequest): Future[DeleteReportDefinitionResponse] =
      service.deleteReportDefinition(params).promise.toFuture
    def describeReportDefinitionsFuture(
        params: DescribeReportDefinitionsRequest
    ): Future[DescribeReportDefinitionsResponse] = service.describeReportDefinitions(params).promise.toFuture
    def modifyReportDefinitionFuture(params: ModifyReportDefinitionRequest): Future[ModifyReportDefinitionResponse] =
      service.modifyReportDefinition(params).promise.toFuture
    def putReportDefinitionFuture(params: PutReportDefinitionRequest): Future[PutReportDefinitionResponse] =
      service.putReportDefinition(params).promise.toFuture
  }
}

package cur {
  @js.native
  @JSImport("aws-sdk", "CUR")
  class CUR() extends js.Object {
    def this(config: AWSConfig) = this()

    def deleteReportDefinition(params: DeleteReportDefinitionRequest): Request[DeleteReportDefinitionResponse] =
      js.native
    def describeReportDefinitions(
        params: DescribeReportDefinitionsRequest
    ): Request[DescribeReportDefinitionsResponse] = js.native
    def modifyReportDefinition(params: ModifyReportDefinitionRequest): Request[ModifyReportDefinitionResponse] =
      js.native
    def putReportDefinition(params: PutReportDefinitionRequest): Request[PutReportDefinitionResponse] = js.native
  }

  /**
    * The region of the S3 bucket that AWS delivers the report into.
    */
  object AWSRegionEnum {
    val `us-east-1`      = "us-east-1"
    val `us-west-1`      = "us-west-1"
    val `us-west-2`      = "us-west-2"
    val `eu-central-1`   = "eu-central-1"
    val `eu-west-1`      = "eu-west-1"
    val `ap-southeast-1` = "ap-southeast-1"
    val `ap-southeast-2` = "ap-southeast-2"
    val `ap-northeast-1` = "ap-northeast-1"
    val `eu-north-1`     = "eu-north-1"
    val `ap-northeast-3` = "ap-northeast-3"
    val `ap-east-1`      = "ap-east-1"

    val values = IndexedSeq(
      `us-east-1`,
      `us-west-1`,
      `us-west-2`,
      `eu-central-1`,
      `eu-west-1`,
      `ap-southeast-1`,
      `ap-southeast-2`,
      `ap-northeast-1`,
      `eu-north-1`,
      `ap-northeast-3`,
      `ap-east-1`
    )
  }

  /**
    * The types of manifest that you want AWS to create for this report.
    */
  object AdditionalArtifactEnum {
    val REDSHIFT   = "REDSHIFT"
    val QUICKSIGHT = "QUICKSIGHT"
    val ATHENA     = "ATHENA"

    val values = IndexedSeq(REDSHIFT, QUICKSIGHT, ATHENA)
  }

  /**
    * The compression format that AWS uses for the report.
    */
  object CompressionFormatEnum {
    val ZIP     = "ZIP"
    val GZIP    = "GZIP"
    val Parquet = "Parquet"

    val values = IndexedSeq(ZIP, GZIP, Parquet)
  }

  /**
    * Deletes the specified report.
    */
  @js.native
  trait DeleteReportDefinitionRequest extends js.Object {
    var ReportName: js.UndefOr[ReportName]
  }

  object DeleteReportDefinitionRequest {
    def apply(
        ReportName: js.UndefOr[ReportName] = js.undefined
    ): DeleteReportDefinitionRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      ReportName.foreach(__v => __obj.update("ReportName", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteReportDefinitionRequest]
    }
  }

  /**
    * If the action is successful, the service sends back an HTTP 200 response.
    */
  @js.native
  trait DeleteReportDefinitionResponse extends js.Object {
    var ResponseMessage: js.UndefOr[DeleteResponseMessage]
  }

  object DeleteReportDefinitionResponse {
    def apply(
        ResponseMessage: js.UndefOr[DeleteResponseMessage] = js.undefined
    ): DeleteReportDefinitionResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      ResponseMessage.foreach(__v => __obj.update("ResponseMessage", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteReportDefinitionResponse]
    }
  }

  /**
    * Requests a list of AWS Cost and Usage reports owned by the account.
    */
  @js.native
  trait DescribeReportDefinitionsRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[GenericString]
  }

  object DescribeReportDefinitionsRequest {
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[GenericString] = js.undefined
    ): DescribeReportDefinitionsRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeReportDefinitionsRequest]
    }
  }

  /**
    * If the action is successful, the service sends back an HTTP 200 response.
    */
  @js.native
  trait DescribeReportDefinitionsResponse extends js.Object {
    var NextToken: js.UndefOr[GenericString]
    var ReportDefinitions: js.UndefOr[ReportDefinitionList]
  }

  object DescribeReportDefinitionsResponse {
    def apply(
        NextToken: js.UndefOr[GenericString] = js.undefined,
        ReportDefinitions: js.UndefOr[ReportDefinitionList] = js.undefined
    ): DescribeReportDefinitionsResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      ReportDefinitions.foreach(__v => __obj.update("ReportDefinitions", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeReportDefinitionsResponse]
    }
  }

  @js.native
  trait ModifyReportDefinitionRequest extends js.Object {
    var ReportDefinition: ReportDefinition
    var ReportName: ReportName
  }

  object ModifyReportDefinitionRequest {
    def apply(
        ReportDefinition: ReportDefinition,
        ReportName: ReportName
    ): ModifyReportDefinitionRequest = {
      val __obj = js.Dictionary[js.Any](
        "ReportDefinition" -> ReportDefinition.asInstanceOf[js.Any],
        "ReportName"       -> ReportName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ModifyReportDefinitionRequest]
    }
  }

  @js.native
  trait ModifyReportDefinitionResponse extends js.Object {}

  object ModifyReportDefinitionResponse {
    def apply(
        ): ModifyReportDefinitionResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[ModifyReportDefinitionResponse]
    }
  }

  /**
    * Creates a Cost and Usage Report.
    */
  @js.native
  trait PutReportDefinitionRequest extends js.Object {
    var ReportDefinition: ReportDefinition
  }

  object PutReportDefinitionRequest {
    def apply(
        ReportDefinition: ReportDefinition
    ): PutReportDefinitionRequest = {
      val __obj = js.Dictionary[js.Any](
        "ReportDefinition" -> ReportDefinition.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[PutReportDefinitionRequest]
    }
  }

  /**
    * If the action is successful, the service sends back an HTTP 200 response with an empty HTTP body.
    */
  @js.native
  trait PutReportDefinitionResponse extends js.Object {}

  object PutReportDefinitionResponse {
    def apply(
        ): PutReportDefinitionResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[PutReportDefinitionResponse]
    }
  }

  /**
    * The definition of AWS Cost and Usage Report. You can specify the report name, time unit, report format, compression format, S3 bucket, additional artifacts, and schema elements in the definition.
    */
  @js.native
  trait ReportDefinition extends js.Object {
    var AdditionalSchemaElements: SchemaElementList
    var Compression: CompressionFormat
    var Format: ReportFormat
    var ReportName: ReportName
    var S3Bucket: S3Bucket
    var S3Prefix: S3Prefix
    var S3Region: AWSRegion
    var TimeUnit: TimeUnit
    var AdditionalArtifacts: js.UndefOr[AdditionalArtifactList]
    var RefreshClosedReports: js.UndefOr[RefreshClosedReports]
    var ReportVersioning: js.UndefOr[ReportVersioning]
  }

  object ReportDefinition {
    def apply(
        AdditionalSchemaElements: SchemaElementList,
        Compression: CompressionFormat,
        Format: ReportFormat,
        ReportName: ReportName,
        S3Bucket: S3Bucket,
        S3Prefix: S3Prefix,
        S3Region: AWSRegion,
        TimeUnit: TimeUnit,
        AdditionalArtifacts: js.UndefOr[AdditionalArtifactList] = js.undefined,
        RefreshClosedReports: js.UndefOr[RefreshClosedReports] = js.undefined,
        ReportVersioning: js.UndefOr[ReportVersioning] = js.undefined
    ): ReportDefinition = {
      val __obj = js.Dictionary[js.Any](
        "AdditionalSchemaElements" -> AdditionalSchemaElements.asInstanceOf[js.Any],
        "Compression"              -> Compression.asInstanceOf[js.Any],
        "Format"                   -> Format.asInstanceOf[js.Any],
        "ReportName"               -> ReportName.asInstanceOf[js.Any],
        "S3Bucket"                 -> S3Bucket.asInstanceOf[js.Any],
        "S3Prefix"                 -> S3Prefix.asInstanceOf[js.Any],
        "S3Region"                 -> S3Region.asInstanceOf[js.Any],
        "TimeUnit"                 -> TimeUnit.asInstanceOf[js.Any]
      )

      AdditionalArtifacts.foreach(__v => __obj.update("AdditionalArtifacts", __v.asInstanceOf[js.Any]))
      RefreshClosedReports.foreach(__v => __obj.update("RefreshClosedReports", __v.asInstanceOf[js.Any]))
      ReportVersioning.foreach(__v => __obj.update("ReportVersioning", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ReportDefinition]
    }
  }

  /**
    * The format that AWS saves the report in.
    */
  object ReportFormatEnum {
    val textORcsv = "textORcsv"
    val Parquet   = "Parquet"

    val values = IndexedSeq(textORcsv, Parquet)
  }

  object ReportVersioningEnum {
    val CREATE_NEW_REPORT = "CREATE_NEW_REPORT"
    val OVERWRITE_REPORT  = "OVERWRITE_REPORT"

    val values = IndexedSeq(CREATE_NEW_REPORT, OVERWRITE_REPORT)
  }

  /**
    * Whether or not AWS includes resource IDs in the report.
    */
  object SchemaElementEnum {
    val RESOURCES = "RESOURCES"

    val values = IndexedSeq(RESOURCES)
  }

  /**
    * The length of time covered by the report.
    */
  object TimeUnitEnum {
    val HOURLY = "HOURLY"
    val DAILY  = "DAILY"

    val values = IndexedSeq(HOURLY, DAILY)
  }
}
