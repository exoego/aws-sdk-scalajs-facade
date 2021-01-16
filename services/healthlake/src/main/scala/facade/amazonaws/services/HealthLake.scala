package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

package object healthlake {
  type BoundedLengthString = String
  type ClientTokenString = String
  type DatastoreArn = String
  type DatastoreId = String
  type DatastoreName = String
  type DatastorePropertiesList = js.Array[DatastoreProperties]
  type IamRoleArn = String
  type JobId = String
  type JobName = String
  type MaxResultsInteger = Int
  type Message = String
  type NextToken = String
  type S3Uri = String
  type Timestamp = js.Date

  implicit final class HealthLakeOps(private val service: HealthLake) extends AnyVal {

    @inline def createFHIRDatastoreFuture(params: CreateFHIRDatastoreRequest): Future[CreateFHIRDatastoreResponse] = service.createFHIRDatastore(params).promise().toFuture
    @inline def deleteFHIRDatastoreFuture(params: DeleteFHIRDatastoreRequest): Future[DeleteFHIRDatastoreResponse] = service.deleteFHIRDatastore(params).promise().toFuture
    @inline def describeFHIRDatastoreFuture(params: DescribeFHIRDatastoreRequest): Future[DescribeFHIRDatastoreResponse] = service.describeFHIRDatastore(params).promise().toFuture
    @inline def describeFHIRExportJobFuture(params: DescribeFHIRExportJobRequest): Future[DescribeFHIRExportJobResponse] = service.describeFHIRExportJob(params).promise().toFuture
    @inline def describeFHIRImportJobFuture(params: DescribeFHIRImportJobRequest): Future[DescribeFHIRImportJobResponse] = service.describeFHIRImportJob(params).promise().toFuture
    @inline def listFHIRDatastoresFuture(params: ListFHIRDatastoresRequest): Future[ListFHIRDatastoresResponse] = service.listFHIRDatastores(params).promise().toFuture
    @inline def startFHIRExportJobFuture(params: StartFHIRExportJobRequest): Future[StartFHIRExportJobResponse] = service.startFHIRExportJob(params).promise().toFuture
    @inline def startFHIRImportJobFuture(params: StartFHIRImportJobRequest): Future[StartFHIRImportJobResponse] = service.startFHIRImportJob(params).promise().toFuture

  }
}

package healthlake {
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
    def startFHIRExportJob(params: StartFHIRExportJobRequest): Request[StartFHIRExportJobResponse] = js.native
    def startFHIRImportJob(params: StartFHIRImportJobRequest): Request[StartFHIRImportJobResponse] = js.native
  }

  @js.native
  trait CreateFHIRDatastoreRequest extends js.Object {
    var DatastoreTypeVersion: FHIRVersion
    var ClientToken: js.UndefOr[ClientTokenString]
    var DatastoreName: js.UndefOr[DatastoreName]
    var PreloadDataConfig: js.UndefOr[PreloadDataConfig]
  }

  object CreateFHIRDatastoreRequest {
    @inline
    def apply(
        DatastoreTypeVersion: FHIRVersion,
        ClientToken: js.UndefOr[ClientTokenString] = js.undefined,
        DatastoreName: js.UndefOr[DatastoreName] = js.undefined,
        PreloadDataConfig: js.UndefOr[PreloadDataConfig] = js.undefined
    ): CreateFHIRDatastoreRequest = {
      val __obj = js.Dynamic.literal(
        "DatastoreTypeVersion" -> DatastoreTypeVersion.asInstanceOf[js.Any]
      )

      ClientToken.foreach(__v => __obj.updateDynamic("ClientToken")(__v.asInstanceOf[js.Any]))
      DatastoreName.foreach(__v => __obj.updateDynamic("DatastoreName")(__v.asInstanceOf[js.Any]))
      PreloadDataConfig.foreach(__v => __obj.updateDynamic("PreloadDataConfig")(__v.asInstanceOf[js.Any]))
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
        PreloadDataConfig: js.UndefOr[PreloadDataConfig] = js.undefined
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
      __obj.asInstanceOf[DatastoreProperties]
    }
  }

  @js.native
  sealed trait DatastoreStatus extends js.Any
  object DatastoreStatus {
    val CREATING = "CREATING".asInstanceOf[DatastoreStatus]
    val ACTIVE = "ACTIVE".asInstanceOf[DatastoreStatus]
    val DELETING = "DELETING".asInstanceOf[DatastoreStatus]
    val DELETED = "DELETED".asInstanceOf[DatastoreStatus]

    @inline def values = js.Array(CREATING, ACTIVE, DELETING, DELETED)
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

  @js.native
  sealed trait FHIRVersion extends js.Any
  object FHIRVersion {
    val R4 = "R4".asInstanceOf[FHIRVersion]

    @inline def values = js.Array(R4)
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

  @js.native
  sealed trait JobStatus extends js.Any
  object JobStatus {
    val SUBMITTED = "SUBMITTED".asInstanceOf[JobStatus]
    val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[JobStatus]
    val COMPLETED = "COMPLETED".asInstanceOf[JobStatus]
    val FAILED = "FAILED".asInstanceOf[JobStatus]

    @inline def values = js.Array(SUBMITTED, IN_PROGRESS, COMPLETED, FAILED)
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

  /** The output data configuration that was supplied when the export job was created.
    */
  @js.native
  trait OutputDataConfig extends js.Object {
    var S3Uri: js.UndefOr[S3Uri]
  }

  object OutputDataConfig {
    @inline
    def apply(
        S3Uri: js.UndefOr[S3Uri] = js.undefined
    ): OutputDataConfig = {
      val __obj = js.Dynamic.literal()
      S3Uri.foreach(__v => __obj.updateDynamic("S3Uri")(__v.asInstanceOf[js.Any]))
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

  @js.native
  sealed trait PreloadDataType extends js.Any
  object PreloadDataType {
    val SYNTHEA = "SYNTHEA".asInstanceOf[PreloadDataType]

    @inline def values = js.Array(SYNTHEA)
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
    var JobName: js.UndefOr[JobName]
  }

  object StartFHIRImportJobRequest {
    @inline
    def apply(
        ClientToken: ClientTokenString,
        DataAccessRoleArn: IamRoleArn,
        DatastoreId: DatastoreId,
        InputDataConfig: InputDataConfig,
        JobName: js.UndefOr[JobName] = js.undefined
    ): StartFHIRImportJobRequest = {
      val __obj = js.Dynamic.literal(
        "ClientToken" -> ClientToken.asInstanceOf[js.Any],
        "DataAccessRoleArn" -> DataAccessRoleArn.asInstanceOf[js.Any],
        "DatastoreId" -> DatastoreId.asInstanceOf[js.Any],
        "InputDataConfig" -> InputDataConfig.asInstanceOf[js.Any]
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
}
