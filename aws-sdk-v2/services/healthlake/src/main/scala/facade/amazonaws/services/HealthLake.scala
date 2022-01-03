package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import scala.language.implicitConversions
import facade.amazonaws._

package object healthlake {
  type AmazonResourceName = String
  type BoundedLengthString = String
  type ClientTokenString = String
  type DatastoreArn = String
  type DatastoreId = String
  type DatastoreName = String
  type DatastorePropertiesList = js.Array[DatastoreProperties]
  type EncryptionKeyID = String
  type ExportJobPropertiesList = js.Array[ExportJobProperties]
  type IamRoleArn = String
  type ImportJobPropertiesList = js.Array[ImportJobProperties]
  type JobId = String
  type JobName = String
  type MaxResultsInteger = Int
  type Message = String
  type NextToken = String
  type S3Uri = String
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagList = js.Array[Tag]
  type TagValue = String
  type Timestamp = js.Date

  final class HealthLakeOps(private val service: HealthLake) extends AnyVal {

    @inline def createFHIRDatastoreFuture(params: CreateFHIRDatastoreRequest): Future[CreateFHIRDatastoreResponse] = service.createFHIRDatastore(params).promise().toFuture
    @inline def deleteFHIRDatastoreFuture(params: DeleteFHIRDatastoreRequest): Future[DeleteFHIRDatastoreResponse] = service.deleteFHIRDatastore(params).promise().toFuture
    @inline def describeFHIRDatastoreFuture(params: DescribeFHIRDatastoreRequest): Future[DescribeFHIRDatastoreResponse] = service.describeFHIRDatastore(params).promise().toFuture
    @inline def describeFHIRExportJobFuture(params: DescribeFHIRExportJobRequest): Future[DescribeFHIRExportJobResponse] = service.describeFHIRExportJob(params).promise().toFuture
    @inline def describeFHIRImportJobFuture(params: DescribeFHIRImportJobRequest): Future[DescribeFHIRImportJobResponse] = service.describeFHIRImportJob(params).promise().toFuture
    @inline def listFHIRDatastoresFuture(params: ListFHIRDatastoresRequest): Future[ListFHIRDatastoresResponse] = service.listFHIRDatastores(params).promise().toFuture
    @inline def listFHIRExportJobsFuture(params: ListFHIRExportJobsRequest): Future[ListFHIRExportJobsResponse] = service.listFHIRExportJobs(params).promise().toFuture
    @inline def listFHIRImportJobsFuture(params: ListFHIRImportJobsRequest): Future[ListFHIRImportJobsResponse] = service.listFHIRImportJobs(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] = service.listTagsForResource(params).promise().toFuture
    @inline def startFHIRExportJobFuture(params: StartFHIRExportJobRequest): Future[StartFHIRExportJobResponse] = service.startFHIRExportJob(params).promise().toFuture
    @inline def startFHIRImportJobFuture(params: StartFHIRImportJobRequest): Future[StartFHIRImportJobResponse] = service.startFHIRImportJob(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] = service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] = service.untagResource(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/healthlake", JSImport.Namespace, "AWS.HealthLake")
  class HealthLake() extends js.Object {
    def this(config: AWSConfig) = this()

    def createFHIRDatastore(params: CreateFHIRDatastoreRequest): Request[CreateFHIRDatastoreResponse] = js.native
    def deleteFHIRDatastore(params: DeleteFHIRDatastoreRequest): Request[DeleteFHIRDatastoreResponse] = js.native
    def describeFHIRDatastore(params: DescribeFHIRDatastoreRequest): Request[DescribeFHIRDatastoreResponse] = js.native
    def describeFHIRExportJob(params: DescribeFHIRExportJobRequest): Request[DescribeFHIRExportJobResponse] = js.native
    def describeFHIRImportJob(params: DescribeFHIRImportJobRequest): Request[DescribeFHIRImportJobResponse] = js.native
    def listFHIRDatastores(params: ListFHIRDatastoresRequest): Request[ListFHIRDatastoresResponse] = js.native
    def listFHIRExportJobs(params: ListFHIRExportJobsRequest): Request[ListFHIRExportJobsResponse] = js.native
    def listFHIRImportJobs(params: ListFHIRImportJobsRequest): Request[ListFHIRImportJobsResponse] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def startFHIRExportJob(params: StartFHIRExportJobRequest): Request[StartFHIRExportJobResponse] = js.native
    def startFHIRImportJob(params: StartFHIRImportJobRequest): Request[StartFHIRImportJobResponse] = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse] = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse] = js.native
  }
  object HealthLake {
    @inline implicit def toOps(service: HealthLake): HealthLakeOps = {
      new HealthLakeOps(service)
    }
  }

  @js.native
  trait CreateFHIRDatastoreRequest extends js.Object {
    var DatastoreTypeVersion: FHIRVersion
    var ClientToken: js.UndefOr[ClientTokenString]
    var DatastoreName: js.UndefOr[DatastoreName]
    var PreloadDataConfig: js.UndefOr[PreloadDataConfig]
    var SseConfiguration: js.UndefOr[SseConfiguration]
    var Tags: js.UndefOr[TagList]
  }

  object CreateFHIRDatastoreRequest {
    @inline
    def apply(
        DatastoreTypeVersion: FHIRVersion,
        ClientToken: js.UndefOr[ClientTokenString] = js.undefined,
        DatastoreName: js.UndefOr[DatastoreName] = js.undefined,
        PreloadDataConfig: js.UndefOr[PreloadDataConfig] = js.undefined,
        SseConfiguration: js.UndefOr[SseConfiguration] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateFHIRDatastoreRequest = {
      val __obj = js.Dynamic.literal(
        "DatastoreTypeVersion" -> DatastoreTypeVersion.asInstanceOf[js.Any]
      )

      ClientToken.foreach(__v => __obj.updateDynamic("ClientToken")(__v.asInstanceOf[js.Any]))
      DatastoreName.foreach(__v => __obj.updateDynamic("DatastoreName")(__v.asInstanceOf[js.Any]))
      PreloadDataConfig.foreach(__v => __obj.updateDynamic("PreloadDataConfig")(__v.asInstanceOf[js.Any]))
      SseConfiguration.foreach(__v => __obj.updateDynamic("SseConfiguration")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateFHIRDatastoreRequest]
    }
  }

  @js.native
  trait CreateFHIRDatastoreResponse extends js.Object {
    var DatastoreArn: DatastoreArn
    var DatastoreEndpoint: BoundedLengthString
    var DatastoreId: DatastoreId
    var DatastoreStatus: DatastoreStatus
  }

  object CreateFHIRDatastoreResponse {
    @inline
    def apply(
        DatastoreArn: DatastoreArn,
        DatastoreEndpoint: BoundedLengthString,
        DatastoreId: DatastoreId,
        DatastoreStatus: DatastoreStatus
    ): CreateFHIRDatastoreResponse = {
      val __obj = js.Dynamic.literal(
        "DatastoreArn" -> DatastoreArn.asInstanceOf[js.Any],
        "DatastoreEndpoint" -> DatastoreEndpoint.asInstanceOf[js.Any],
        "DatastoreId" -> DatastoreId.asInstanceOf[js.Any],
        "DatastoreStatus" -> DatastoreStatus.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateFHIRDatastoreResponse]
    }
  }

  /** The filters applied to Data Store query.
    */
  @js.native
  trait DatastoreFilter extends js.Object {
    var CreatedAfter: js.UndefOr[Timestamp]
    var CreatedBefore: js.UndefOr[Timestamp]
    var DatastoreName: js.UndefOr[DatastoreName]
    var DatastoreStatus: js.UndefOr[DatastoreStatus]
  }

  object DatastoreFilter {
    @inline
    def apply(
        CreatedAfter: js.UndefOr[Timestamp] = js.undefined,
        CreatedBefore: js.UndefOr[Timestamp] = js.undefined,
        DatastoreName: js.UndefOr[DatastoreName] = js.undefined,
        DatastoreStatus: js.UndefOr[DatastoreStatus] = js.undefined
    ): DatastoreFilter = {
      val __obj = js.Dynamic.literal()
      CreatedAfter.foreach(__v => __obj.updateDynamic("CreatedAfter")(__v.asInstanceOf[js.Any]))
      CreatedBefore.foreach(__v => __obj.updateDynamic("CreatedBefore")(__v.asInstanceOf[js.Any]))
      DatastoreName.foreach(__v => __obj.updateDynamic("DatastoreName")(__v.asInstanceOf[js.Any]))
      DatastoreStatus.foreach(__v => __obj.updateDynamic("DatastoreStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DatastoreFilter]
    }
  }

  /** Displays the properties of the Data Store, including the ID, Arn, name, and the status of the Data Store.
    */
  @js.native
  trait DatastoreProperties extends js.Object {
    var DatastoreArn: DatastoreArn
    var DatastoreEndpoint: String
    var DatastoreId: DatastoreId
    var DatastoreStatus: DatastoreStatus
    var DatastoreTypeVersion: FHIRVersion
    var CreatedAt: js.UndefOr[Timestamp]
    var DatastoreName: js.UndefOr[DatastoreName]
    var PreloadDataConfig: js.UndefOr[PreloadDataConfig]
    var SseConfiguration: js.UndefOr[SseConfiguration]
  }

  object DatastoreProperties {
    @inline
    def apply(
        DatastoreArn: DatastoreArn,
        DatastoreEndpoint: String,
        DatastoreId: DatastoreId,
        DatastoreStatus: DatastoreStatus,
        DatastoreTypeVersion: FHIRVersion,
        CreatedAt: js.UndefOr[Timestamp] = js.undefined,
        DatastoreName: js.UndefOr[DatastoreName] = js.undefined,
        PreloadDataConfig: js.UndefOr[PreloadDataConfig] = js.undefined,
        SseConfiguration: js.UndefOr[SseConfiguration] = js.undefined
    ): DatastoreProperties = {
      val __obj = js.Dynamic.literal(
        "DatastoreArn" -> DatastoreArn.asInstanceOf[js.Any],
        "DatastoreEndpoint" -> DatastoreEndpoint.asInstanceOf[js.Any],
        "DatastoreId" -> DatastoreId.asInstanceOf[js.Any],
        "DatastoreStatus" -> DatastoreStatus.asInstanceOf[js.Any],
        "DatastoreTypeVersion" -> DatastoreTypeVersion.asInstanceOf[js.Any]
      )

      CreatedAt.foreach(__v => __obj.updateDynamic("CreatedAt")(__v.asInstanceOf[js.Any]))
      DatastoreName.foreach(__v => __obj.updateDynamic("DatastoreName")(__v.asInstanceOf[js.Any]))
      PreloadDataConfig.foreach(__v => __obj.updateDynamic("PreloadDataConfig")(__v.asInstanceOf[js.Any]))
      SseConfiguration.foreach(__v => __obj.updateDynamic("SseConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DatastoreProperties]
    }
  }

  @js.native
  trait DeleteFHIRDatastoreRequest extends js.Object {
    var DatastoreId: js.UndefOr[DatastoreId]
  }

  object DeleteFHIRDatastoreRequest {
    @inline
    def apply(
        DatastoreId: js.UndefOr[DatastoreId] = js.undefined
    ): DeleteFHIRDatastoreRequest = {
      val __obj = js.Dynamic.literal()
      DatastoreId.foreach(__v => __obj.updateDynamic("DatastoreId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteFHIRDatastoreRequest]
    }
  }

  @js.native
  trait DeleteFHIRDatastoreResponse extends js.Object {
    var DatastoreArn: DatastoreArn
    var DatastoreEndpoint: BoundedLengthString
    var DatastoreId: DatastoreId
    var DatastoreStatus: DatastoreStatus
  }

  object DeleteFHIRDatastoreResponse {
    @inline
    def apply(
        DatastoreArn: DatastoreArn,
        DatastoreEndpoint: BoundedLengthString,
        DatastoreId: DatastoreId,
        DatastoreStatus: DatastoreStatus
    ): DeleteFHIRDatastoreResponse = {
      val __obj = js.Dynamic.literal(
        "DatastoreArn" -> DatastoreArn.asInstanceOf[js.Any],
        "DatastoreEndpoint" -> DatastoreEndpoint.asInstanceOf[js.Any],
        "DatastoreId" -> DatastoreId.asInstanceOf[js.Any],
        "DatastoreStatus" -> DatastoreStatus.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteFHIRDatastoreResponse]
    }
  }

  @js.native
  trait DescribeFHIRDatastoreRequest extends js.Object {
    var DatastoreId: js.UndefOr[DatastoreId]
  }

  object DescribeFHIRDatastoreRequest {
    @inline
    def apply(
        DatastoreId: js.UndefOr[DatastoreId] = js.undefined
    ): DescribeFHIRDatastoreRequest = {
      val __obj = js.Dynamic.literal()
      DatastoreId.foreach(__v => __obj.updateDynamic("DatastoreId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeFHIRDatastoreRequest]
    }
  }

  @js.native
  trait DescribeFHIRDatastoreResponse extends js.Object {
    var DatastoreProperties: DatastoreProperties
  }

  object DescribeFHIRDatastoreResponse {
    @inline
    def apply(
        DatastoreProperties: DatastoreProperties
    ): DescribeFHIRDatastoreResponse = {
      val __obj = js.Dynamic.literal(
        "DatastoreProperties" -> DatastoreProperties.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeFHIRDatastoreResponse]
    }
  }

  @js.native
  trait DescribeFHIRExportJobRequest extends js.Object {
    var DatastoreId: DatastoreId
    var JobId: JobId
  }

  object DescribeFHIRExportJobRequest {
    @inline
    def apply(
        DatastoreId: DatastoreId,
        JobId: JobId
    ): DescribeFHIRExportJobRequest = {
      val __obj = js.Dynamic.literal(
        "DatastoreId" -> DatastoreId.asInstanceOf[js.Any],
        "JobId" -> JobId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeFHIRExportJobRequest]
    }
  }

  @js.native
  trait DescribeFHIRExportJobResponse extends js.Object {
    var ExportJobProperties: ExportJobProperties
  }

  object DescribeFHIRExportJobResponse {
    @inline
    def apply(
        ExportJobProperties: ExportJobProperties
    ): DescribeFHIRExportJobResponse = {
      val __obj = js.Dynamic.literal(
        "ExportJobProperties" -> ExportJobProperties.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeFHIRExportJobResponse]
    }
  }

  @js.native
  trait DescribeFHIRImportJobRequest extends js.Object {
    var DatastoreId: DatastoreId
    var JobId: JobId
  }

  object DescribeFHIRImportJobRequest {
    @inline
    def apply(
        DatastoreId: DatastoreId,
        JobId: JobId
    ): DescribeFHIRImportJobRequest = {
      val __obj = js.Dynamic.literal(
        "DatastoreId" -> DatastoreId.asInstanceOf[js.Any],
        "JobId" -> JobId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeFHIRImportJobRequest]
    }
  }

  @js.native
  trait DescribeFHIRImportJobResponse extends js.Object {
    var ImportJobProperties: ImportJobProperties
  }

  object DescribeFHIRImportJobResponse {
    @inline
    def apply(
        ImportJobProperties: ImportJobProperties
    ): DescribeFHIRImportJobResponse = {
      val __obj = js.Dynamic.literal(
        "ImportJobProperties" -> ImportJobProperties.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeFHIRImportJobResponse]
    }
  }

  /** The properties of a FHIR export job, including the ID, ARN, name, and the status of the job.
    */
  @js.native
  trait ExportJobProperties extends js.Object {
    var DatastoreId: DatastoreId
    var JobId: JobId
    var JobStatus: JobStatus
    var OutputDataConfig: OutputDataConfig
    var SubmitTime: Timestamp
    var DataAccessRoleArn: js.UndefOr[IamRoleArn]
    var EndTime: js.UndefOr[Timestamp]
    var JobName: js.UndefOr[JobName]
    var Message: js.UndefOr[Message]
  }

  object ExportJobProperties {
    @inline
    def apply(
        DatastoreId: DatastoreId,
        JobId: JobId,
        JobStatus: JobStatus,
        OutputDataConfig: OutputDataConfig,
        SubmitTime: Timestamp,
        DataAccessRoleArn: js.UndefOr[IamRoleArn] = js.undefined,
        EndTime: js.UndefOr[Timestamp] = js.undefined,
        JobName: js.UndefOr[JobName] = js.undefined,
        Message: js.UndefOr[Message] = js.undefined
    ): ExportJobProperties = {
      val __obj = js.Dynamic.literal(
        "DatastoreId" -> DatastoreId.asInstanceOf[js.Any],
        "JobId" -> JobId.asInstanceOf[js.Any],
        "JobStatus" -> JobStatus.asInstanceOf[js.Any],
        "OutputDataConfig" -> OutputDataConfig.asInstanceOf[js.Any],
        "SubmitTime" -> SubmitTime.asInstanceOf[js.Any]
      )

      DataAccessRoleArn.foreach(__v => __obj.updateDynamic("DataAccessRoleArn")(__v.asInstanceOf[js.Any]))
      EndTime.foreach(__v => __obj.updateDynamic("EndTime")(__v.asInstanceOf[js.Any]))
      JobName.foreach(__v => __obj.updateDynamic("JobName")(__v.asInstanceOf[js.Any]))
      Message.foreach(__v => __obj.updateDynamic("Message")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ExportJobProperties]
    }
  }

  /** Displays the properties of the import job, including the ID, Arn, Name, and the status of the Data Store.
    */
  @js.native
  trait ImportJobProperties extends js.Object {
    var DatastoreId: DatastoreId
    var InputDataConfig: InputDataConfig
    var JobId: JobId
    var JobStatus: JobStatus
    var SubmitTime: Timestamp
    var DataAccessRoleArn: js.UndefOr[IamRoleArn]
    var EndTime: js.UndefOr[Timestamp]
    var JobName: js.UndefOr[JobName]
    var JobOutputDataConfig: js.UndefOr[OutputDataConfig]
    var Message: js.UndefOr[Message]
  }

  object ImportJobProperties {
    @inline
    def apply(
        DatastoreId: DatastoreId,
        InputDataConfig: InputDataConfig,
        JobId: JobId,
        JobStatus: JobStatus,
        SubmitTime: Timestamp,
        DataAccessRoleArn: js.UndefOr[IamRoleArn] = js.undefined,
        EndTime: js.UndefOr[Timestamp] = js.undefined,
        JobName: js.UndefOr[JobName] = js.undefined,
        JobOutputDataConfig: js.UndefOr[OutputDataConfig] = js.undefined,
        Message: js.UndefOr[Message] = js.undefined
    ): ImportJobProperties = {
      val __obj = js.Dynamic.literal(
        "DatastoreId" -> DatastoreId.asInstanceOf[js.Any],
        "InputDataConfig" -> InputDataConfig.asInstanceOf[js.Any],
        "JobId" -> JobId.asInstanceOf[js.Any],
        "JobStatus" -> JobStatus.asInstanceOf[js.Any],
        "SubmitTime" -> SubmitTime.asInstanceOf[js.Any]
      )

      DataAccessRoleArn.foreach(__v => __obj.updateDynamic("DataAccessRoleArn")(__v.asInstanceOf[js.Any]))
      EndTime.foreach(__v => __obj.updateDynamic("EndTime")(__v.asInstanceOf[js.Any]))
      JobName.foreach(__v => __obj.updateDynamic("JobName")(__v.asInstanceOf[js.Any]))
      JobOutputDataConfig.foreach(__v => __obj.updateDynamic("JobOutputDataConfig")(__v.asInstanceOf[js.Any]))
      Message.foreach(__v => __obj.updateDynamic("Message")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ImportJobProperties]
    }
  }

  /** The input properties for an import job.
    */
  @js.native
  trait InputDataConfig extends js.Object {
    var S3Uri: js.UndefOr[S3Uri]
  }

  object InputDataConfig {
    @inline
    def apply(
        S3Uri: js.UndefOr[S3Uri] = js.undefined
    ): InputDataConfig = {
      val __obj = js.Dynamic.literal()
      S3Uri.foreach(__v => __obj.updateDynamic("S3Uri")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InputDataConfig]
    }
  }

  /** The customer-managed-key(CMK) used when creating a Data Store. If a customer owned key is not specified, an AWS owned key will be used for encryption.
    */
  @js.native
  trait KmsEncryptionConfig extends js.Object {
    var CmkType: CmkType
    var KmsKeyId: js.UndefOr[EncryptionKeyID]
  }

  object KmsEncryptionConfig {
    @inline
    def apply(
        CmkType: CmkType,
        KmsKeyId: js.UndefOr[EncryptionKeyID] = js.undefined
    ): KmsEncryptionConfig = {
      val __obj = js.Dynamic.literal(
        "CmkType" -> CmkType.asInstanceOf[js.Any]
      )

      KmsKeyId.foreach(__v => __obj.updateDynamic("KmsKeyId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[KmsEncryptionConfig]
    }
  }

  @js.native
  trait ListFHIRDatastoresRequest extends js.Object {
    var Filter: js.UndefOr[DatastoreFilter]
    var MaxResults: js.UndefOr[MaxResultsInteger]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListFHIRDatastoresRequest {
    @inline
    def apply(
        Filter: js.UndefOr[DatastoreFilter] = js.undefined,
        MaxResults: js.UndefOr[MaxResultsInteger] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListFHIRDatastoresRequest = {
      val __obj = js.Dynamic.literal()
      Filter.foreach(__v => __obj.updateDynamic("Filter")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListFHIRDatastoresRequest]
    }
  }

  @js.native
  trait ListFHIRDatastoresResponse extends js.Object {
    var DatastorePropertiesList: DatastorePropertiesList
    var NextToken: js.UndefOr[NextToken]
  }

  object ListFHIRDatastoresResponse {
    @inline
    def apply(
        DatastorePropertiesList: DatastorePropertiesList,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListFHIRDatastoresResponse = {
      val __obj = js.Dynamic.literal(
        "DatastorePropertiesList" -> DatastorePropertiesList.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListFHIRDatastoresResponse]
    }
  }

  @js.native
  trait ListFHIRExportJobsRequest extends js.Object {
    var DatastoreId: DatastoreId
    var JobName: js.UndefOr[JobName]
    var JobStatus: js.UndefOr[JobStatus]
    var MaxResults: js.UndefOr[MaxResultsInteger]
    var NextToken: js.UndefOr[NextToken]
    var SubmittedAfter: js.UndefOr[Timestamp]
    var SubmittedBefore: js.UndefOr[Timestamp]
  }

  object ListFHIRExportJobsRequest {
    @inline
    def apply(
        DatastoreId: DatastoreId,
        JobName: js.UndefOr[JobName] = js.undefined,
        JobStatus: js.UndefOr[JobStatus] = js.undefined,
        MaxResults: js.UndefOr[MaxResultsInteger] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        SubmittedAfter: js.UndefOr[Timestamp] = js.undefined,
        SubmittedBefore: js.UndefOr[Timestamp] = js.undefined
    ): ListFHIRExportJobsRequest = {
      val __obj = js.Dynamic.literal(
        "DatastoreId" -> DatastoreId.asInstanceOf[js.Any]
      )

      JobName.foreach(__v => __obj.updateDynamic("JobName")(__v.asInstanceOf[js.Any]))
      JobStatus.foreach(__v => __obj.updateDynamic("JobStatus")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      SubmittedAfter.foreach(__v => __obj.updateDynamic("SubmittedAfter")(__v.asInstanceOf[js.Any]))
      SubmittedBefore.foreach(__v => __obj.updateDynamic("SubmittedBefore")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListFHIRExportJobsRequest]
    }
  }

  @js.native
  trait ListFHIRExportJobsResponse extends js.Object {
    var ExportJobPropertiesList: ExportJobPropertiesList
    var NextToken: js.UndefOr[NextToken]
  }

  object ListFHIRExportJobsResponse {
    @inline
    def apply(
        ExportJobPropertiesList: ExportJobPropertiesList,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListFHIRExportJobsResponse = {
      val __obj = js.Dynamic.literal(
        "ExportJobPropertiesList" -> ExportJobPropertiesList.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListFHIRExportJobsResponse]
    }
  }

  @js.native
  trait ListFHIRImportJobsRequest extends js.Object {
    var DatastoreId: DatastoreId
    var JobName: js.UndefOr[JobName]
    var JobStatus: js.UndefOr[JobStatus]
    var MaxResults: js.UndefOr[MaxResultsInteger]
    var NextToken: js.UndefOr[NextToken]
    var SubmittedAfter: js.UndefOr[Timestamp]
    var SubmittedBefore: js.UndefOr[Timestamp]
  }

  object ListFHIRImportJobsRequest {
    @inline
    def apply(
        DatastoreId: DatastoreId,
        JobName: js.UndefOr[JobName] = js.undefined,
        JobStatus: js.UndefOr[JobStatus] = js.undefined,
        MaxResults: js.UndefOr[MaxResultsInteger] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        SubmittedAfter: js.UndefOr[Timestamp] = js.undefined,
        SubmittedBefore: js.UndefOr[Timestamp] = js.undefined
    ): ListFHIRImportJobsRequest = {
      val __obj = js.Dynamic.literal(
        "DatastoreId" -> DatastoreId.asInstanceOf[js.Any]
      )

      JobName.foreach(__v => __obj.updateDynamic("JobName")(__v.asInstanceOf[js.Any]))
      JobStatus.foreach(__v => __obj.updateDynamic("JobStatus")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      SubmittedAfter.foreach(__v => __obj.updateDynamic("SubmittedAfter")(__v.asInstanceOf[js.Any]))
      SubmittedBefore.foreach(__v => __obj.updateDynamic("SubmittedBefore")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListFHIRImportJobsRequest]
    }
  }

  @js.native
  trait ListFHIRImportJobsResponse extends js.Object {
    var ImportJobPropertiesList: ImportJobPropertiesList
    var NextToken: js.UndefOr[NextToken]
  }

  object ListFHIRImportJobsResponse {
    @inline
    def apply(
        ImportJobPropertiesList: ImportJobPropertiesList,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListFHIRImportJobsResponse = {
      val __obj = js.Dynamic.literal(
        "ImportJobPropertiesList" -> ImportJobPropertiesList.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListFHIRImportJobsResponse]
    }
  }

  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var ResourceARN: AmazonResourceName
  }

  object ListTagsForResourceRequest {
    @inline
    def apply(
        ResourceARN: AmazonResourceName
    ): ListTagsForResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceARN" -> ResourceARN.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ListTagsForResourceRequest]
    }
  }

  @js.native
  trait ListTagsForResourceResponse extends js.Object {
    var Tags: js.UndefOr[TagList]
  }

  object ListTagsForResourceResponse {
    @inline
    def apply(
        Tags: js.UndefOr[TagList] = js.undefined
    ): ListTagsForResourceResponse = {
      val __obj = js.Dynamic.literal()
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceResponse]
    }
  }

  /** The output data configuration that was supplied when the export job was created.
    */
  @js.native
  trait OutputDataConfig extends js.Object {
    var S3Configuration: js.UndefOr[S3Configuration]
  }

  object OutputDataConfig {
    @inline
    def apply(
        S3Configuration: js.UndefOr[S3Configuration] = js.undefined
    ): OutputDataConfig = {
      val __obj = js.Dynamic.literal()
      S3Configuration.foreach(__v => __obj.updateDynamic("S3Configuration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OutputDataConfig]
    }
  }

  /** The input properties for the preloaded Data Store. Only data preloaded from Synthea is supported.
    */
  @js.native
  trait PreloadDataConfig extends js.Object {
    var PreloadDataType: PreloadDataType
  }

  object PreloadDataConfig {
    @inline
    def apply(
        PreloadDataType: PreloadDataType
    ): PreloadDataConfig = {
      val __obj = js.Dynamic.literal(
        "PreloadDataType" -> PreloadDataType.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[PreloadDataConfig]
    }
  }

  /** The configuration of the S3 bucket for either an import or export job. This includes assigning permissions for access.
    */
  @js.native
  trait S3Configuration extends js.Object {
    var KmsKeyId: EncryptionKeyID
    var S3Uri: S3Uri
  }

  object S3Configuration {
    @inline
    def apply(
        KmsKeyId: EncryptionKeyID,
        S3Uri: S3Uri
    ): S3Configuration = {
      val __obj = js.Dynamic.literal(
        "KmsKeyId" -> KmsKeyId.asInstanceOf[js.Any],
        "S3Uri" -> S3Uri.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[S3Configuration]
    }
  }

  /** The server-side encryption key configuration for a customer provided encryption key.
    */
  @js.native
  trait SseConfiguration extends js.Object {
    var KmsEncryptionConfig: KmsEncryptionConfig
  }

  object SseConfiguration {
    @inline
    def apply(
        KmsEncryptionConfig: KmsEncryptionConfig
    ): SseConfiguration = {
      val __obj = js.Dynamic.literal(
        "KmsEncryptionConfig" -> KmsEncryptionConfig.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[SseConfiguration]
    }
  }

  @js.native
  trait StartFHIRExportJobRequest extends js.Object {
    var ClientToken: ClientTokenString
    var DataAccessRoleArn: IamRoleArn
    var DatastoreId: DatastoreId
    var OutputDataConfig: OutputDataConfig
    var JobName: js.UndefOr[JobName]
  }

  object StartFHIRExportJobRequest {
    @inline
    def apply(
        ClientToken: ClientTokenString,
        DataAccessRoleArn: IamRoleArn,
        DatastoreId: DatastoreId,
        OutputDataConfig: OutputDataConfig,
        JobName: js.UndefOr[JobName] = js.undefined
    ): StartFHIRExportJobRequest = {
      val __obj = js.Dynamic.literal(
        "ClientToken" -> ClientToken.asInstanceOf[js.Any],
        "DataAccessRoleArn" -> DataAccessRoleArn.asInstanceOf[js.Any],
        "DatastoreId" -> DatastoreId.asInstanceOf[js.Any],
        "OutputDataConfig" -> OutputDataConfig.asInstanceOf[js.Any]
      )

      JobName.foreach(__v => __obj.updateDynamic("JobName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartFHIRExportJobRequest]
    }
  }

  @js.native
  trait StartFHIRExportJobResponse extends js.Object {
    var JobId: JobId
    var JobStatus: JobStatus
    var DatastoreId: js.UndefOr[DatastoreId]
  }

  object StartFHIRExportJobResponse {
    @inline
    def apply(
        JobId: JobId,
        JobStatus: JobStatus,
        DatastoreId: js.UndefOr[DatastoreId] = js.undefined
    ): StartFHIRExportJobResponse = {
      val __obj = js.Dynamic.literal(
        "JobId" -> JobId.asInstanceOf[js.Any],
        "JobStatus" -> JobStatus.asInstanceOf[js.Any]
      )

      DatastoreId.foreach(__v => __obj.updateDynamic("DatastoreId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartFHIRExportJobResponse]
    }
  }

  @js.native
  trait StartFHIRImportJobRequest extends js.Object {
    var ClientToken: ClientTokenString
    var DataAccessRoleArn: IamRoleArn
    var DatastoreId: DatastoreId
    var InputDataConfig: InputDataConfig
    var JobOutputDataConfig: OutputDataConfig
    var JobName: js.UndefOr[JobName]
  }

  object StartFHIRImportJobRequest {
    @inline
    def apply(
        ClientToken: ClientTokenString,
        DataAccessRoleArn: IamRoleArn,
        DatastoreId: DatastoreId,
        InputDataConfig: InputDataConfig,
        JobOutputDataConfig: OutputDataConfig,
        JobName: js.UndefOr[JobName] = js.undefined
    ): StartFHIRImportJobRequest = {
      val __obj = js.Dynamic.literal(
        "ClientToken" -> ClientToken.asInstanceOf[js.Any],
        "DataAccessRoleArn" -> DataAccessRoleArn.asInstanceOf[js.Any],
        "DatastoreId" -> DatastoreId.asInstanceOf[js.Any],
        "InputDataConfig" -> InputDataConfig.asInstanceOf[js.Any],
        "JobOutputDataConfig" -> JobOutputDataConfig.asInstanceOf[js.Any]
      )

      JobName.foreach(__v => __obj.updateDynamic("JobName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartFHIRImportJobRequest]
    }
  }

  @js.native
  trait StartFHIRImportJobResponse extends js.Object {
    var JobId: JobId
    var JobStatus: JobStatus
    var DatastoreId: js.UndefOr[DatastoreId]
  }

  object StartFHIRImportJobResponse {
    @inline
    def apply(
        JobId: JobId,
        JobStatus: JobStatus,
        DatastoreId: js.UndefOr[DatastoreId] = js.undefined
    ): StartFHIRImportJobResponse = {
      val __obj = js.Dynamic.literal(
        "JobId" -> JobId.asInstanceOf[js.Any],
        "JobStatus" -> JobStatus.asInstanceOf[js.Any]
      )

      DatastoreId.foreach(__v => __obj.updateDynamic("DatastoreId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartFHIRImportJobResponse]
    }
  }

  /** A tag is a label consisting of a user-defined key and value. The form for tags is {"Key", "Value"}
    */
  @js.native
  trait Tag extends js.Object {
    var Key: TagKey
    var Value: TagValue
  }

  object Tag {
    @inline
    def apply(
        Key: TagKey,
        Value: TagValue
    ): Tag = {
      val __obj = js.Dynamic.literal(
        "Key" -> Key.asInstanceOf[js.Any],
        "Value" -> Value.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[Tag]
    }
  }

  @js.native
  trait TagResourceRequest extends js.Object {
    var ResourceARN: AmazonResourceName
    var Tags: TagList
  }

  object TagResourceRequest {
    @inline
    def apply(
        ResourceARN: AmazonResourceName,
        Tags: TagList
    ): TagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceARN" -> ResourceARN.asInstanceOf[js.Any],
        "Tags" -> Tags.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[TagResourceRequest]
    }
  }

  @js.native
  trait TagResourceResponse extends js.Object

  object TagResourceResponse {
    @inline
    def apply(): TagResourceResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TagResourceResponse]
    }
  }

  @js.native
  trait UntagResourceRequest extends js.Object {
    var ResourceARN: AmazonResourceName
    var TagKeys: TagKeyList
  }

  object UntagResourceRequest {
    @inline
    def apply(
        ResourceARN: AmazonResourceName,
        TagKeys: TagKeyList
    ): UntagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceARN" -> ResourceARN.asInstanceOf[js.Any],
        "TagKeys" -> TagKeys.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UntagResourceRequest]
    }
  }

  @js.native
  trait UntagResourceResponse extends js.Object

  object UntagResourceResponse {
    @inline
    def apply(): UntagResourceResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UntagResourceResponse]
    }
  }
}
