package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import scala.language.implicitConversions
import facade.amazonaws._

package object applicationcostprofiler {
  type ImportId = String
  type ReportDefinitionList = js.Array[ReportDefinition]
  type ReportDescription = String
  type ReportId = String
  type S3Bucket = String
  type S3Key = String
  type S3Prefix = String
  type Timestamp = js.Date
  type Token = String

  final class ApplicationCostProfilerOps(private val service: ApplicationCostProfiler) extends AnyVal {

    @inline def deleteReportDefinitionFuture(params: DeleteReportDefinitionRequest): Future[DeleteReportDefinitionResult] = service.deleteReportDefinition(params).promise().toFuture
    @inline def getReportDefinitionFuture(params: GetReportDefinitionRequest): Future[GetReportDefinitionResult] = service.getReportDefinition(params).promise().toFuture
    @inline def importApplicationUsageFuture(params: ImportApplicationUsageRequest): Future[ImportApplicationUsageResult] = service.importApplicationUsage(params).promise().toFuture
    @inline def listReportDefinitionsFuture(params: ListReportDefinitionsRequest): Future[ListReportDefinitionsResult] = service.listReportDefinitions(params).promise().toFuture
    @inline def putReportDefinitionFuture(params: PutReportDefinitionRequest): Future[PutReportDefinitionResult] = service.putReportDefinition(params).promise().toFuture
    @inline def updateReportDefinitionFuture(params: UpdateReportDefinitionRequest): Future[UpdateReportDefinitionResult] = service.updateReportDefinition(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/applicationcostprofiler", JSImport.Namespace, "AWS.ApplicationCostProfiler")
  class ApplicationCostProfiler() extends js.Object {
    def this(config: AWSConfig) = this()

    def deleteReportDefinition(params: DeleteReportDefinitionRequest): Request[DeleteReportDefinitionResult] = js.native
    def getReportDefinition(params: GetReportDefinitionRequest): Request[GetReportDefinitionResult] = js.native
    def importApplicationUsage(params: ImportApplicationUsageRequest): Request[ImportApplicationUsageResult] = js.native
    def listReportDefinitions(params: ListReportDefinitionsRequest): Request[ListReportDefinitionsResult] = js.native
    def putReportDefinition(params: PutReportDefinitionRequest): Request[PutReportDefinitionResult] = js.native
    def updateReportDefinition(params: UpdateReportDefinitionRequest): Request[UpdateReportDefinitionResult] = js.native
  }
  object ApplicationCostProfiler {
    @inline implicit def toOps(service: ApplicationCostProfiler): ApplicationCostProfilerOps = {
      new ApplicationCostProfilerOps(service)
    }
  }

  @js.native
  trait DeleteReportDefinitionRequest extends js.Object {
    var reportId: ReportId
  }

  object DeleteReportDefinitionRequest {
    @inline
    def apply(
        reportId: ReportId
    ): DeleteReportDefinitionRequest = {
      val __obj = js.Dynamic.literal(
        "reportId" -> reportId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteReportDefinitionRequest]
    }
  }

  @js.native
  trait DeleteReportDefinitionResult extends js.Object {
    var reportId: js.UndefOr[ReportId]
  }

  object DeleteReportDefinitionResult {
    @inline
    def apply(
        reportId: js.UndefOr[ReportId] = js.undefined
    ): DeleteReportDefinitionResult = {
      val __obj = js.Dynamic.literal()
      reportId.foreach(__v => __obj.updateDynamic("reportId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteReportDefinitionResult]
    }
  }

  @js.native
  trait GetReportDefinitionRequest extends js.Object {
    var reportId: ReportId
  }

  object GetReportDefinitionRequest {
    @inline
    def apply(
        reportId: ReportId
    ): GetReportDefinitionRequest = {
      val __obj = js.Dynamic.literal(
        "reportId" -> reportId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetReportDefinitionRequest]
    }
  }

  @js.native
  trait GetReportDefinitionResult extends js.Object {
    var createdAt: Timestamp
    var destinationS3Location: S3Location
    var format: Format
    var lastUpdated: Timestamp
    var reportDescription: ReportDescription
    var reportFrequency: ReportFrequency
    var reportId: ReportId
  }

  object GetReportDefinitionResult {
    @inline
    def apply(
        createdAt: Timestamp,
        destinationS3Location: S3Location,
        format: Format,
        lastUpdated: Timestamp,
        reportDescription: ReportDescription,
        reportFrequency: ReportFrequency,
        reportId: ReportId
    ): GetReportDefinitionResult = {
      val __obj = js.Dynamic.literal(
        "createdAt" -> createdAt.asInstanceOf[js.Any],
        "destinationS3Location" -> destinationS3Location.asInstanceOf[js.Any],
        "format" -> format.asInstanceOf[js.Any],
        "lastUpdated" -> lastUpdated.asInstanceOf[js.Any],
        "reportDescription" -> reportDescription.asInstanceOf[js.Any],
        "reportFrequency" -> reportFrequency.asInstanceOf[js.Any],
        "reportId" -> reportId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetReportDefinitionResult]
    }
  }

  @js.native
  trait ImportApplicationUsageRequest extends js.Object {
    var sourceS3Location: SourceS3Location
  }

  object ImportApplicationUsageRequest {
    @inline
    def apply(
        sourceS3Location: SourceS3Location
    ): ImportApplicationUsageRequest = {
      val __obj = js.Dynamic.literal(
        "sourceS3Location" -> sourceS3Location.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ImportApplicationUsageRequest]
    }
  }

  @js.native
  trait ImportApplicationUsageResult extends js.Object {
    var importId: ImportId
  }

  object ImportApplicationUsageResult {
    @inline
    def apply(
        importId: ImportId
    ): ImportApplicationUsageResult = {
      val __obj = js.Dynamic.literal(
        "importId" -> importId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ImportApplicationUsageResult]
    }
  }

  @js.native
  trait ListReportDefinitionsRequest extends js.Object {
    var maxResults: js.UndefOr[Int]
    var nextToken: js.UndefOr[Token]
  }

  object ListReportDefinitionsRequest {
    @inline
    def apply(
        maxResults: js.UndefOr[Int] = js.undefined,
        nextToken: js.UndefOr[Token] = js.undefined
    ): ListReportDefinitionsRequest = {
      val __obj = js.Dynamic.literal()
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListReportDefinitionsRequest]
    }
  }

  @js.native
  trait ListReportDefinitionsResult extends js.Object {
    var nextToken: js.UndefOr[Token]
    var reportDefinitions: js.UndefOr[ReportDefinitionList]
  }

  object ListReportDefinitionsResult {
    @inline
    def apply(
        nextToken: js.UndefOr[Token] = js.undefined,
        reportDefinitions: js.UndefOr[ReportDefinitionList] = js.undefined
    ): ListReportDefinitionsResult = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      reportDefinitions.foreach(__v => __obj.updateDynamic("reportDefinitions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListReportDefinitionsResult]
    }
  }

  @js.native
  trait PutReportDefinitionRequest extends js.Object {
    var destinationS3Location: S3Location
    var format: Format
    var reportDescription: ReportDescription
    var reportFrequency: ReportFrequency
    var reportId: ReportId
  }

  object PutReportDefinitionRequest {
    @inline
    def apply(
        destinationS3Location: S3Location,
        format: Format,
        reportDescription: ReportDescription,
        reportFrequency: ReportFrequency,
        reportId: ReportId
    ): PutReportDefinitionRequest = {
      val __obj = js.Dynamic.literal(
        "destinationS3Location" -> destinationS3Location.asInstanceOf[js.Any],
        "format" -> format.asInstanceOf[js.Any],
        "reportDescription" -> reportDescription.asInstanceOf[js.Any],
        "reportFrequency" -> reportFrequency.asInstanceOf[js.Any],
        "reportId" -> reportId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[PutReportDefinitionRequest]
    }
  }

  @js.native
  trait PutReportDefinitionResult extends js.Object {
    var reportId: js.UndefOr[ReportId]
  }

  object PutReportDefinitionResult {
    @inline
    def apply(
        reportId: js.UndefOr[ReportId] = js.undefined
    ): PutReportDefinitionResult = {
      val __obj = js.Dynamic.literal()
      reportId.foreach(__v => __obj.updateDynamic("reportId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutReportDefinitionResult]
    }
  }

  /** The configuration of a report in AWS Application Cost Profiler.
    */
  @js.native
  trait ReportDefinition extends js.Object {
    var createdAt: js.UndefOr[Timestamp]
    var destinationS3Location: js.UndefOr[S3Location]
    var format: js.UndefOr[Format]
    var lastUpdatedAt: js.UndefOr[Timestamp]
    var reportDescription: js.UndefOr[ReportDescription]
    var reportFrequency: js.UndefOr[ReportFrequency]
    var reportId: js.UndefOr[ReportId]
  }

  object ReportDefinition {
    @inline
    def apply(
        createdAt: js.UndefOr[Timestamp] = js.undefined,
        destinationS3Location: js.UndefOr[S3Location] = js.undefined,
        format: js.UndefOr[Format] = js.undefined,
        lastUpdatedAt: js.UndefOr[Timestamp] = js.undefined,
        reportDescription: js.UndefOr[ReportDescription] = js.undefined,
        reportFrequency: js.UndefOr[ReportFrequency] = js.undefined,
        reportId: js.UndefOr[ReportId] = js.undefined
    ): ReportDefinition = {
      val __obj = js.Dynamic.literal()
      createdAt.foreach(__v => __obj.updateDynamic("createdAt")(__v.asInstanceOf[js.Any]))
      destinationS3Location.foreach(__v => __obj.updateDynamic("destinationS3Location")(__v.asInstanceOf[js.Any]))
      format.foreach(__v => __obj.updateDynamic("format")(__v.asInstanceOf[js.Any]))
      lastUpdatedAt.foreach(__v => __obj.updateDynamic("lastUpdatedAt")(__v.asInstanceOf[js.Any]))
      reportDescription.foreach(__v => __obj.updateDynamic("reportDescription")(__v.asInstanceOf[js.Any]))
      reportFrequency.foreach(__v => __obj.updateDynamic("reportFrequency")(__v.asInstanceOf[js.Any]))
      reportId.foreach(__v => __obj.updateDynamic("reportId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ReportDefinition]
    }
  }

  /** Represents the Amazon Simple Storage Service (Amazon S3) location where AWS Application Cost Profiler reports are generated and then written to.
    */
  @js.native
  trait S3Location extends js.Object {
    var bucket: S3Bucket
    var prefix: S3Prefix
  }

  object S3Location {
    @inline
    def apply(
        bucket: S3Bucket,
        prefix: S3Prefix
    ): S3Location = {
      val __obj = js.Dynamic.literal(
        "bucket" -> bucket.asInstanceOf[js.Any],
        "prefix" -> prefix.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[S3Location]
    }
  }

  /** Represents the Amazon Simple Storage Service (Amazon S3) location where usage data is read from.
    */
  @js.native
  trait SourceS3Location extends js.Object {
    var bucket: S3Bucket
    var key: S3Key
    var region: js.UndefOr[S3BucketRegion]
  }

  object SourceS3Location {
    @inline
    def apply(
        bucket: S3Bucket,
        key: S3Key,
        region: js.UndefOr[S3BucketRegion] = js.undefined
    ): SourceS3Location = {
      val __obj = js.Dynamic.literal(
        "bucket" -> bucket.asInstanceOf[js.Any],
        "key" -> key.asInstanceOf[js.Any]
      )

      region.foreach(__v => __obj.updateDynamic("region")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SourceS3Location]
    }
  }

  @js.native
  trait UpdateReportDefinitionRequest extends js.Object {
    var destinationS3Location: S3Location
    var format: Format
    var reportDescription: ReportDescription
    var reportFrequency: ReportFrequency
    var reportId: ReportId
  }

  object UpdateReportDefinitionRequest {
    @inline
    def apply(
        destinationS3Location: S3Location,
        format: Format,
        reportDescription: ReportDescription,
        reportFrequency: ReportFrequency,
        reportId: ReportId
    ): UpdateReportDefinitionRequest = {
      val __obj = js.Dynamic.literal(
        "destinationS3Location" -> destinationS3Location.asInstanceOf[js.Any],
        "format" -> format.asInstanceOf[js.Any],
        "reportDescription" -> reportDescription.asInstanceOf[js.Any],
        "reportFrequency" -> reportFrequency.asInstanceOf[js.Any],
        "reportId" -> reportId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateReportDefinitionRequest]
    }
  }

  @js.native
  trait UpdateReportDefinitionResult extends js.Object {
    var reportId: js.UndefOr[ReportId]
  }

  object UpdateReportDefinitionResult {
    @inline
    def apply(
        reportId: js.UndefOr[ReportId] = js.undefined
    ): UpdateReportDefinitionResult = {
      val __obj = js.Dynamic.literal()
      reportId.foreach(__v => __obj.updateDynamic("reportId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateReportDefinitionResult]
    }
  }
}
