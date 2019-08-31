package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import io.scalajs.nodejs
import facade.amazonaws._

package object s3control {
  type AccountId                   = String
  type ConfirmationRequired        = Boolean
  type IAMRoleArn                  = String
  type JobArn                      = String
  type JobCreationTime             = js.Date
  type JobFailureCode              = String
  type JobFailureList              = js.Array[JobFailure]
  type JobFailureReason            = String
  type JobId                       = String
  type JobListDescriptorList       = js.Array[JobListDescriptor]
  type JobManifestFieldList        = js.Array[JobManifestFieldName]
  type JobManifestFieldName        = String
  type JobManifestFormat           = String
  type JobNumberOfTasksFailed      = Double
  type JobNumberOfTasksSucceeded   = Double
  type JobPriority                 = Int
  type JobReportFormat             = String
  type JobReportScope              = String
  type JobStatus                   = String
  type JobStatusList               = js.Array[JobStatus]
  type JobStatusUpdateReason       = String
  type JobTerminationDate          = js.Date
  type JobTotalNumberOfTasks       = Double
  type KmsKeyArnString             = String
  type MaxLength1024String         = String
  type MaxResults                  = Int
  type NonEmptyMaxLength1024String = String
  type NonEmptyMaxLength2048String = String
  type NonEmptyMaxLength256String  = String
  type NonEmptyMaxLength64String   = String
  type OperationName               = String
  type ReportPrefixString          = String
  type RequestedJobStatus          = String
  type S3BucketArnString           = String
  type S3CannedAccessControlList   = String
  type S3ContentLength             = Double
  type S3ExpirationInDays          = Int
  type S3GlacierJobTier            = String
  type S3GrantList                 = js.Array[S3Grant]
  type S3GranteeTypeIdentifier     = String
  type S3KeyArnString              = String
  type S3MetadataDirective         = String
  type S3ObjectLockLegalHoldStatus = String
  type S3ObjectLockMode            = String
  type S3ObjectVersionId           = String
  type S3Permission                = String
  type S3SSEAlgorithm              = String
  type S3StorageClass              = String
  type S3TagSet                    = js.Array[S3Tag]
  type S3UserMetadata              = js.Dictionary[MaxLength1024String]
  type Setting                     = Boolean
  type SuspendedCause              = String
  type SuspendedDate               = js.Date
  type TimeStamp                   = js.Date

  implicit final class S3ControlOps(private val service: S3Control) extends AnyVal {

    def createJobFuture(params: CreateJobRequest): Future[CreateJobResult] = service.createJob(params).promise.toFuture
    def deletePublicAccessBlockFuture(params: DeletePublicAccessBlockRequest): Future[js.Object] =
      service.deletePublicAccessBlock(params).promise.toFuture
    def describeJobFuture(params: DescribeJobRequest): Future[DescribeJobResult] =
      service.describeJob(params).promise.toFuture
    def getPublicAccessBlockFuture(params: GetPublicAccessBlockRequest): Future[GetPublicAccessBlockOutput] =
      service.getPublicAccessBlock(params).promise.toFuture
    def listJobsFuture(params: ListJobsRequest): Future[ListJobsResult] = service.listJobs(params).promise.toFuture
    def putPublicAccessBlockFuture(params: PutPublicAccessBlockRequest): Future[js.Object] =
      service.putPublicAccessBlock(params).promise.toFuture
    def updateJobPriorityFuture(params: UpdateJobPriorityRequest): Future[UpdateJobPriorityResult] =
      service.updateJobPriority(params).promise.toFuture
    def updateJobStatusFuture(params: UpdateJobStatusRequest): Future[UpdateJobStatusResult] =
      service.updateJobStatus(params).promise.toFuture
  }
}

package s3control {
  @js.native
  @JSImport("aws-sdk", "S3Control")
  class S3Control() extends js.Object {
    def this(config: AWSConfig) = this()

    def createJob(params: CreateJobRequest): Request[CreateJobResult]                                  = js.native
    def deletePublicAccessBlock(params: DeletePublicAccessBlockRequest): Request[js.Object]            = js.native
    def describeJob(params: DescribeJobRequest): Request[DescribeJobResult]                            = js.native
    def getPublicAccessBlock(params: GetPublicAccessBlockRequest): Request[GetPublicAccessBlockOutput] = js.native
    def listJobs(params: ListJobsRequest): Request[ListJobsResult]                                     = js.native
    def putPublicAccessBlock(params: PutPublicAccessBlockRequest): Request[js.Object]                  = js.native
    def updateJobPriority(params: UpdateJobPriorityRequest): Request[UpdateJobPriorityResult]          = js.native
    def updateJobStatus(params: UpdateJobStatusRequest): Request[UpdateJobStatusResult]                = js.native
  }

  @js.native
  trait CreateJobRequest extends js.Object {
    var AccountId: AccountId
    var ClientRequestToken: NonEmptyMaxLength64String
    var Manifest: JobManifest
    var Operation: JobOperation
    var Priority: JobPriority
    var Report: JobReport
    var RoleArn: IAMRoleArn
    var ConfirmationRequired: js.UndefOr[ConfirmationRequired]
    var Description: js.UndefOr[NonEmptyMaxLength256String]
  }

  object CreateJobRequest {
    @inline
    def apply(
        AccountId: AccountId,
        ClientRequestToken: NonEmptyMaxLength64String,
        Manifest: JobManifest,
        Operation: JobOperation,
        Priority: JobPriority,
        Report: JobReport,
        RoleArn: IAMRoleArn,
        ConfirmationRequired: js.UndefOr[ConfirmationRequired] = js.undefined,
        Description: js.UndefOr[NonEmptyMaxLength256String] = js.undefined
    ): CreateJobRequest = {
      val __obj = js.Dynamic.literal(
        "AccountId"          -> AccountId.asInstanceOf[js.Any],
        "ClientRequestToken" -> ClientRequestToken.asInstanceOf[js.Any],
        "Manifest"           -> Manifest.asInstanceOf[js.Any],
        "Operation"          -> Operation.asInstanceOf[js.Any],
        "Priority"           -> Priority.asInstanceOf[js.Any],
        "Report"             -> Report.asInstanceOf[js.Any],
        "RoleArn"            -> RoleArn.asInstanceOf[js.Any]
      )

      ConfirmationRequired.foreach(__v => __obj.updateDynamic("ConfirmationRequired")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateJobRequest]
    }
  }

  @js.native
  trait CreateJobResult extends js.Object {
    var JobId: js.UndefOr[JobId]
  }

  object CreateJobResult {
    @inline
    def apply(
        JobId: js.UndefOr[JobId] = js.undefined
    ): CreateJobResult = {
      val __obj = js.Dynamic.literal()
      JobId.foreach(__v => __obj.updateDynamic("JobId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateJobResult]
    }
  }

  @js.native
  trait DeletePublicAccessBlockRequest extends js.Object {
    var AccountId: AccountId
  }

  object DeletePublicAccessBlockRequest {
    @inline
    def apply(
        AccountId: AccountId
    ): DeletePublicAccessBlockRequest = {
      val __obj = js.Dynamic.literal(
        "AccountId" -> AccountId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeletePublicAccessBlockRequest]
    }
  }

  @js.native
  trait DescribeJobRequest extends js.Object {
    var AccountId: AccountId
    var JobId: JobId
  }

  object DescribeJobRequest {
    @inline
    def apply(
        AccountId: AccountId,
        JobId: JobId
    ): DescribeJobRequest = {
      val __obj = js.Dynamic.literal(
        "AccountId" -> AccountId.asInstanceOf[js.Any],
        "JobId"     -> JobId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeJobRequest]
    }
  }

  @js.native
  trait DescribeJobResult extends js.Object {
    var Job: js.UndefOr[JobDescriptor]
  }

  object DescribeJobResult {
    @inline
    def apply(
        Job: js.UndefOr[JobDescriptor] = js.undefined
    ): DescribeJobResult = {
      val __obj = js.Dynamic.literal()
      Job.foreach(__v => __obj.updateDynamic("Job")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeJobResult]
    }
  }

  @js.native
  trait GetPublicAccessBlockOutput extends js.Object {
    var PublicAccessBlockConfiguration: js.UndefOr[PublicAccessBlockConfiguration]
  }

  object GetPublicAccessBlockOutput {
    @inline
    def apply(
        PublicAccessBlockConfiguration: js.UndefOr[PublicAccessBlockConfiguration] = js.undefined
    ): GetPublicAccessBlockOutput = {
      val __obj = js.Dynamic.literal()
      PublicAccessBlockConfiguration.foreach(
        __v => __obj.updateDynamic("PublicAccessBlockConfiguration")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[GetPublicAccessBlockOutput]
    }
  }

  @js.native
  trait GetPublicAccessBlockRequest extends js.Object {
    var AccountId: AccountId
  }

  object GetPublicAccessBlockRequest {
    @inline
    def apply(
        AccountId: AccountId
    ): GetPublicAccessBlockRequest = {
      val __obj = js.Dynamic.literal(
        "AccountId" -> AccountId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetPublicAccessBlockRequest]
    }
  }

  /**
    * A container element for the job configuration and status information returned by a <code>Describe Job</code> request.
    */
  @js.native
  trait JobDescriptor extends js.Object {
    var ConfirmationRequired: js.UndefOr[ConfirmationRequired]
    var CreationTime: js.UndefOr[JobCreationTime]
    var Description: js.UndefOr[NonEmptyMaxLength256String]
    var FailureReasons: js.UndefOr[JobFailureList]
    var JobArn: js.UndefOr[JobArn]
    var JobId: js.UndefOr[JobId]
    var Manifest: js.UndefOr[JobManifest]
    var Operation: js.UndefOr[JobOperation]
    var Priority: js.UndefOr[JobPriority]
    var ProgressSummary: js.UndefOr[JobProgressSummary]
    var Report: js.UndefOr[JobReport]
    var RoleArn: js.UndefOr[IAMRoleArn]
    var Status: js.UndefOr[JobStatus]
    var StatusUpdateReason: js.UndefOr[JobStatusUpdateReason]
    var SuspendedCause: js.UndefOr[SuspendedCause]
    var SuspendedDate: js.UndefOr[SuspendedDate]
    var TerminationDate: js.UndefOr[JobTerminationDate]
  }

  object JobDescriptor {
    @inline
    def apply(
        ConfirmationRequired: js.UndefOr[ConfirmationRequired] = js.undefined,
        CreationTime: js.UndefOr[JobCreationTime] = js.undefined,
        Description: js.UndefOr[NonEmptyMaxLength256String] = js.undefined,
        FailureReasons: js.UndefOr[JobFailureList] = js.undefined,
        JobArn: js.UndefOr[JobArn] = js.undefined,
        JobId: js.UndefOr[JobId] = js.undefined,
        Manifest: js.UndefOr[JobManifest] = js.undefined,
        Operation: js.UndefOr[JobOperation] = js.undefined,
        Priority: js.UndefOr[JobPriority] = js.undefined,
        ProgressSummary: js.UndefOr[JobProgressSummary] = js.undefined,
        Report: js.UndefOr[JobReport] = js.undefined,
        RoleArn: js.UndefOr[IAMRoleArn] = js.undefined,
        Status: js.UndefOr[JobStatus] = js.undefined,
        StatusUpdateReason: js.UndefOr[JobStatusUpdateReason] = js.undefined,
        SuspendedCause: js.UndefOr[SuspendedCause] = js.undefined,
        SuspendedDate: js.UndefOr[SuspendedDate] = js.undefined,
        TerminationDate: js.UndefOr[JobTerminationDate] = js.undefined
    ): JobDescriptor = {
      val __obj = js.Dynamic.literal()
      ConfirmationRequired.foreach(__v => __obj.updateDynamic("ConfirmationRequired")(__v.asInstanceOf[js.Any]))
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      FailureReasons.foreach(__v => __obj.updateDynamic("FailureReasons")(__v.asInstanceOf[js.Any]))
      JobArn.foreach(__v => __obj.updateDynamic("JobArn")(__v.asInstanceOf[js.Any]))
      JobId.foreach(__v => __obj.updateDynamic("JobId")(__v.asInstanceOf[js.Any]))
      Manifest.foreach(__v => __obj.updateDynamic("Manifest")(__v.asInstanceOf[js.Any]))
      Operation.foreach(__v => __obj.updateDynamic("Operation")(__v.asInstanceOf[js.Any]))
      Priority.foreach(__v => __obj.updateDynamic("Priority")(__v.asInstanceOf[js.Any]))
      ProgressSummary.foreach(__v => __obj.updateDynamic("ProgressSummary")(__v.asInstanceOf[js.Any]))
      Report.foreach(__v => __obj.updateDynamic("Report")(__v.asInstanceOf[js.Any]))
      RoleArn.foreach(__v => __obj.updateDynamic("RoleArn")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      StatusUpdateReason.foreach(__v => __obj.updateDynamic("StatusUpdateReason")(__v.asInstanceOf[js.Any]))
      SuspendedCause.foreach(__v => __obj.updateDynamic("SuspendedCause")(__v.asInstanceOf[js.Any]))
      SuspendedDate.foreach(__v => __obj.updateDynamic("SuspendedDate")(__v.asInstanceOf[js.Any]))
      TerminationDate.foreach(__v => __obj.updateDynamic("TerminationDate")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[JobDescriptor]
    }
  }

  /**
    * If this job failed, this element indicates why the job failed.
    */
  @js.native
  trait JobFailure extends js.Object {
    var FailureCode: js.UndefOr[JobFailureCode]
    var FailureReason: js.UndefOr[JobFailureReason]
  }

  object JobFailure {
    @inline
    def apply(
        FailureCode: js.UndefOr[JobFailureCode] = js.undefined,
        FailureReason: js.UndefOr[JobFailureReason] = js.undefined
    ): JobFailure = {
      val __obj = js.Dynamic.literal()
      FailureCode.foreach(__v => __obj.updateDynamic("FailureCode")(__v.asInstanceOf[js.Any]))
      FailureReason.foreach(__v => __obj.updateDynamic("FailureReason")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[JobFailure]
    }
  }

  /**
    * Contains the configuration and status information for a single job retrieved as part of a job list.
    */
  @js.native
  trait JobListDescriptor extends js.Object {
    var CreationTime: js.UndefOr[JobCreationTime]
    var Description: js.UndefOr[NonEmptyMaxLength256String]
    var JobId: js.UndefOr[JobId]
    var Operation: js.UndefOr[OperationName]
    var Priority: js.UndefOr[JobPriority]
    var ProgressSummary: js.UndefOr[JobProgressSummary]
    var Status: js.UndefOr[JobStatus]
    var TerminationDate: js.UndefOr[JobTerminationDate]
  }

  object JobListDescriptor {
    @inline
    def apply(
        CreationTime: js.UndefOr[JobCreationTime] = js.undefined,
        Description: js.UndefOr[NonEmptyMaxLength256String] = js.undefined,
        JobId: js.UndefOr[JobId] = js.undefined,
        Operation: js.UndefOr[OperationName] = js.undefined,
        Priority: js.UndefOr[JobPriority] = js.undefined,
        ProgressSummary: js.UndefOr[JobProgressSummary] = js.undefined,
        Status: js.UndefOr[JobStatus] = js.undefined,
        TerminationDate: js.UndefOr[JobTerminationDate] = js.undefined
    ): JobListDescriptor = {
      val __obj = js.Dynamic.literal()
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      JobId.foreach(__v => __obj.updateDynamic("JobId")(__v.asInstanceOf[js.Any]))
      Operation.foreach(__v => __obj.updateDynamic("Operation")(__v.asInstanceOf[js.Any]))
      Priority.foreach(__v => __obj.updateDynamic("Priority")(__v.asInstanceOf[js.Any]))
      ProgressSummary.foreach(__v => __obj.updateDynamic("ProgressSummary")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      TerminationDate.foreach(__v => __obj.updateDynamic("TerminationDate")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[JobListDescriptor]
    }
  }

  /**
    * Contains the configuration information for a job's manifest.
    */
  @js.native
  trait JobManifest extends js.Object {
    var Location: JobManifestLocation
    var Spec: JobManifestSpec
  }

  object JobManifest {
    @inline
    def apply(
        Location: JobManifestLocation,
        Spec: JobManifestSpec
    ): JobManifest = {
      val __obj = js.Dynamic.literal(
        "Location" -> Location.asInstanceOf[js.Any],
        "Spec"     -> Spec.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[JobManifest]
    }
  }

  object JobManifestFieldNameEnum {
    val Ignore    = "Ignore"
    val Bucket    = "Bucket"
    val Key       = "Key"
    val VersionId = "VersionId"

    val values = js.Object.freeze(js.Array(Ignore, Bucket, Key, VersionId))
  }

  object JobManifestFormatEnum {
    val S3BatchOperations_CSV_20180820 = "S3BatchOperations_CSV_20180820"
    val S3InventoryReport_CSV_20161130 = "S3InventoryReport_CSV_20161130"

    val values = js.Object.freeze(js.Array(S3BatchOperations_CSV_20180820, S3InventoryReport_CSV_20161130))
  }

  /**
    * Contains the information required to locate a manifest object.
    */
  @js.native
  trait JobManifestLocation extends js.Object {
    var ETag: NonEmptyMaxLength1024String
    var ObjectArn: S3KeyArnString
    var ObjectVersionId: js.UndefOr[S3ObjectVersionId]
  }

  object JobManifestLocation {
    @inline
    def apply(
        ETag: NonEmptyMaxLength1024String,
        ObjectArn: S3KeyArnString,
        ObjectVersionId: js.UndefOr[S3ObjectVersionId] = js.undefined
    ): JobManifestLocation = {
      val __obj = js.Dynamic.literal(
        "ETag"      -> ETag.asInstanceOf[js.Any],
        "ObjectArn" -> ObjectArn.asInstanceOf[js.Any]
      )

      ObjectVersionId.foreach(__v => __obj.updateDynamic("ObjectVersionId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[JobManifestLocation]
    }
  }

  /**
    * Describes the format of a manifest. If the manifest is in CSV format, also describes the columns contained within the manifest.
    */
  @js.native
  trait JobManifestSpec extends js.Object {
    var Format: JobManifestFormat
    var Fields: js.UndefOr[JobManifestFieldList]
  }

  object JobManifestSpec {
    @inline
    def apply(
        Format: JobManifestFormat,
        Fields: js.UndefOr[JobManifestFieldList] = js.undefined
    ): JobManifestSpec = {
      val __obj = js.Dynamic.literal(
        "Format" -> Format.asInstanceOf[js.Any]
      )

      Fields.foreach(__v => __obj.updateDynamic("Fields")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[JobManifestSpec]
    }
  }

  /**
    * The operation that you want this job to perform on each object listed in the manifest. For more information about the available operations, see [[https://docs.aws.amazon.com/AmazonS3/latest/dev/batch-ops-operations.html|Available Operations]] in the <i>Amazon Simple Storage Service Developer Guide</i>.
    */
  @js.native
  trait JobOperation extends js.Object {
    var LambdaInvoke: js.UndefOr[LambdaInvokeOperation]
    var S3InitiateRestoreObject: js.UndefOr[S3InitiateRestoreObjectOperation]
    var S3PutObjectAcl: js.UndefOr[S3SetObjectAclOperation]
    var S3PutObjectCopy: js.UndefOr[S3CopyObjectOperation]
    var S3PutObjectTagging: js.UndefOr[S3SetObjectTaggingOperation]
  }

  object JobOperation {
    @inline
    def apply(
        LambdaInvoke: js.UndefOr[LambdaInvokeOperation] = js.undefined,
        S3InitiateRestoreObject: js.UndefOr[S3InitiateRestoreObjectOperation] = js.undefined,
        S3PutObjectAcl: js.UndefOr[S3SetObjectAclOperation] = js.undefined,
        S3PutObjectCopy: js.UndefOr[S3CopyObjectOperation] = js.undefined,
        S3PutObjectTagging: js.UndefOr[S3SetObjectTaggingOperation] = js.undefined
    ): JobOperation = {
      val __obj = js.Dynamic.literal()
      LambdaInvoke.foreach(__v => __obj.updateDynamic("LambdaInvoke")(__v.asInstanceOf[js.Any]))
      S3InitiateRestoreObject.foreach(__v => __obj.updateDynamic("S3InitiateRestoreObject")(__v.asInstanceOf[js.Any]))
      S3PutObjectAcl.foreach(__v => __obj.updateDynamic("S3PutObjectAcl")(__v.asInstanceOf[js.Any]))
      S3PutObjectCopy.foreach(__v => __obj.updateDynamic("S3PutObjectCopy")(__v.asInstanceOf[js.Any]))
      S3PutObjectTagging.foreach(__v => __obj.updateDynamic("S3PutObjectTagging")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[JobOperation]
    }
  }

  /**
    * Describes the total number of tasks that the specified job has executed, the number of tasks that succeeded, and the number of tasks that failed.
    */
  @js.native
  trait JobProgressSummary extends js.Object {
    var NumberOfTasksFailed: js.UndefOr[JobNumberOfTasksFailed]
    var NumberOfTasksSucceeded: js.UndefOr[JobNumberOfTasksSucceeded]
    var TotalNumberOfTasks: js.UndefOr[JobTotalNumberOfTasks]
  }

  object JobProgressSummary {
    @inline
    def apply(
        NumberOfTasksFailed: js.UndefOr[JobNumberOfTasksFailed] = js.undefined,
        NumberOfTasksSucceeded: js.UndefOr[JobNumberOfTasksSucceeded] = js.undefined,
        TotalNumberOfTasks: js.UndefOr[JobTotalNumberOfTasks] = js.undefined
    ): JobProgressSummary = {
      val __obj = js.Dynamic.literal()
      NumberOfTasksFailed.foreach(__v => __obj.updateDynamic("NumberOfTasksFailed")(__v.asInstanceOf[js.Any]))
      NumberOfTasksSucceeded.foreach(__v => __obj.updateDynamic("NumberOfTasksSucceeded")(__v.asInstanceOf[js.Any]))
      TotalNumberOfTasks.foreach(__v => __obj.updateDynamic("TotalNumberOfTasks")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[JobProgressSummary]
    }
  }

  /**
    * Contains the configuration parameters for a job-completion report.
    */
  @js.native
  trait JobReport extends js.Object {
    var Enabled: Boolean
    var Bucket: js.UndefOr[S3BucketArnString]
    var Format: js.UndefOr[JobReportFormat]
    var Prefix: js.UndefOr[ReportPrefixString]
    var ReportScope: js.UndefOr[JobReportScope]
  }

  object JobReport {
    @inline
    def apply(
        Enabled: Boolean,
        Bucket: js.UndefOr[S3BucketArnString] = js.undefined,
        Format: js.UndefOr[JobReportFormat] = js.undefined,
        Prefix: js.UndefOr[ReportPrefixString] = js.undefined,
        ReportScope: js.UndefOr[JobReportScope] = js.undefined
    ): JobReport = {
      val __obj = js.Dynamic.literal(
        "Enabled" -> Enabled.asInstanceOf[js.Any]
      )

      Bucket.foreach(__v => __obj.updateDynamic("Bucket")(__v.asInstanceOf[js.Any]))
      Format.foreach(__v => __obj.updateDynamic("Format")(__v.asInstanceOf[js.Any]))
      Prefix.foreach(__v => __obj.updateDynamic("Prefix")(__v.asInstanceOf[js.Any]))
      ReportScope.foreach(__v => __obj.updateDynamic("ReportScope")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[JobReport]
    }
  }

  object JobReportFormatEnum {
    val Report_CSV_20180820 = "Report_CSV_20180820"

    val values = js.Object.freeze(js.Array(Report_CSV_20180820))
  }

  object JobReportScopeEnum {
    val AllTasks        = "AllTasks"
    val FailedTasksOnly = "FailedTasksOnly"

    val values = js.Object.freeze(js.Array(AllTasks, FailedTasksOnly))
  }

  object JobStatusEnum {
    val Active     = "Active"
    val Cancelled  = "Cancelled"
    val Cancelling = "Cancelling"
    val Complete   = "Complete"
    val Completing = "Completing"
    val Failed     = "Failed"
    val Failing    = "Failing"
    val New        = "New"
    val Paused     = "Paused"
    val Pausing    = "Pausing"
    val Preparing  = "Preparing"
    val Ready      = "Ready"
    val Suspended  = "Suspended"

    val values = js.Object.freeze(
      js.Array(
        Active,
        Cancelled,
        Cancelling,
        Complete,
        Completing,
        Failed,
        Failing,
        New,
        Paused,
        Pausing,
        Preparing,
        Ready,
        Suspended
      )
    )
  }

  /**
    * Contains the configuration parameters for a <code>Lambda Invoke</code> operation.
    */
  @js.native
  trait LambdaInvokeOperation extends js.Object {
    var FunctionArn: js.UndefOr[NonEmptyMaxLength1024String]
  }

  object LambdaInvokeOperation {
    @inline
    def apply(
        FunctionArn: js.UndefOr[NonEmptyMaxLength1024String] = js.undefined
    ): LambdaInvokeOperation = {
      val __obj = js.Dynamic.literal()
      FunctionArn.foreach(__v => __obj.updateDynamic("FunctionArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LambdaInvokeOperation]
    }
  }

  @js.native
  trait ListJobsRequest extends js.Object {
    var AccountId: AccountId
    var JobStatuses: js.UndefOr[JobStatusList]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NonEmptyMaxLength1024String]
  }

  object ListJobsRequest {
    @inline
    def apply(
        AccountId: AccountId,
        JobStatuses: js.UndefOr[JobStatusList] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NonEmptyMaxLength1024String] = js.undefined
    ): ListJobsRequest = {
      val __obj = js.Dynamic.literal(
        "AccountId" -> AccountId.asInstanceOf[js.Any]
      )

      JobStatuses.foreach(__v => __obj.updateDynamic("JobStatuses")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListJobsRequest]
    }
  }

  @js.native
  trait ListJobsResult extends js.Object {
    var Jobs: js.UndefOr[JobListDescriptorList]
    var NextToken: js.UndefOr[NonEmptyMaxLength1024String]
  }

  object ListJobsResult {
    @inline
    def apply(
        Jobs: js.UndefOr[JobListDescriptorList] = js.undefined,
        NextToken: js.UndefOr[NonEmptyMaxLength1024String] = js.undefined
    ): ListJobsResult = {
      val __obj = js.Dynamic.literal()
      Jobs.foreach(__v => __obj.updateDynamic("Jobs")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListJobsResult]
    }
  }

  object OperationNameEnum {
    val LambdaInvoke            = "LambdaInvoke"
    val S3PutObjectCopy         = "S3PutObjectCopy"
    val S3PutObjectAcl          = "S3PutObjectAcl"
    val S3PutObjectTagging      = "S3PutObjectTagging"
    val S3InitiateRestoreObject = "S3InitiateRestoreObject"

    val values = js.Object.freeze(
      js.Array(LambdaInvoke, S3PutObjectCopy, S3PutObjectAcl, S3PutObjectTagging, S3InitiateRestoreObject)
    )
  }

  /**
    * <p/>
    */
  @js.native
  trait PublicAccessBlockConfiguration extends js.Object {
    var BlockPublicAcls: js.UndefOr[Setting]
    var BlockPublicPolicy: js.UndefOr[Setting]
    var IgnorePublicAcls: js.UndefOr[Setting]
    var RestrictPublicBuckets: js.UndefOr[Setting]
  }

  object PublicAccessBlockConfiguration {
    @inline
    def apply(
        BlockPublicAcls: js.UndefOr[Setting] = js.undefined,
        BlockPublicPolicy: js.UndefOr[Setting] = js.undefined,
        IgnorePublicAcls: js.UndefOr[Setting] = js.undefined,
        RestrictPublicBuckets: js.UndefOr[Setting] = js.undefined
    ): PublicAccessBlockConfiguration = {
      val __obj = js.Dynamic.literal()
      BlockPublicAcls.foreach(__v => __obj.updateDynamic("BlockPublicAcls")(__v.asInstanceOf[js.Any]))
      BlockPublicPolicy.foreach(__v => __obj.updateDynamic("BlockPublicPolicy")(__v.asInstanceOf[js.Any]))
      IgnorePublicAcls.foreach(__v => __obj.updateDynamic("IgnorePublicAcls")(__v.asInstanceOf[js.Any]))
      RestrictPublicBuckets.foreach(__v => __obj.updateDynamic("RestrictPublicBuckets")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PublicAccessBlockConfiguration]
    }
  }

  @js.native
  trait PutPublicAccessBlockRequest extends js.Object {
    var AccountId: AccountId
    var PublicAccessBlockConfiguration: PublicAccessBlockConfiguration
  }

  object PutPublicAccessBlockRequest {
    @inline
    def apply(
        AccountId: AccountId,
        PublicAccessBlockConfiguration: PublicAccessBlockConfiguration
    ): PutPublicAccessBlockRequest = {
      val __obj = js.Dynamic.literal(
        "AccountId"                      -> AccountId.asInstanceOf[js.Any],
        "PublicAccessBlockConfiguration" -> PublicAccessBlockConfiguration.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[PutPublicAccessBlockRequest]
    }
  }

  object RequestedJobStatusEnum {
    val Cancelled = "Cancelled"
    val Ready     = "Ready"

    val values = js.Object.freeze(js.Array(Cancelled, Ready))
  }

  /**
    * <p/>
    */
  @js.native
  trait S3AccessControlList extends js.Object {
    var Owner: S3ObjectOwner
    var Grants: js.UndefOr[S3GrantList]
  }

  object S3AccessControlList {
    @inline
    def apply(
        Owner: S3ObjectOwner,
        Grants: js.UndefOr[S3GrantList] = js.undefined
    ): S3AccessControlList = {
      val __obj = js.Dynamic.literal(
        "Owner" -> Owner.asInstanceOf[js.Any]
      )

      Grants.foreach(__v => __obj.updateDynamic("Grants")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[S3AccessControlList]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait S3AccessControlPolicy extends js.Object {
    var AccessControlList: js.UndefOr[S3AccessControlList]
    var CannedAccessControlList: js.UndefOr[S3CannedAccessControlList]
  }

  object S3AccessControlPolicy {
    @inline
    def apply(
        AccessControlList: js.UndefOr[S3AccessControlList] = js.undefined,
        CannedAccessControlList: js.UndefOr[S3CannedAccessControlList] = js.undefined
    ): S3AccessControlPolicy = {
      val __obj = js.Dynamic.literal()
      AccessControlList.foreach(__v => __obj.updateDynamic("AccessControlList")(__v.asInstanceOf[js.Any]))
      CannedAccessControlList.foreach(__v => __obj.updateDynamic("CannedAccessControlList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[S3AccessControlPolicy]
    }
  }

  object S3CannedAccessControlListEnum {
    val `private`                   = "private"
    val `public-read`               = "public-read"
    val `public-read-write`         = "public-read-write"
    val `aws-exec-read`             = "aws-exec-read"
    val `authenticated-read`        = "authenticated-read"
    val `bucket-owner-read`         = "bucket-owner-read"
    val `bucket-owner-full-control` = "bucket-owner-full-control"

    val values = js.Object.freeze(
      js.Array(
        `private`,
        `public-read`,
        `public-read-write`,
        `aws-exec-read`,
        `authenticated-read`,
        `bucket-owner-read`,
        `bucket-owner-full-control`
      )
    )
  }

  /**
    * Contains the configuration parameters for a PUT Copy object operation. Amazon S3 batch operations passes each value through to the underlying PUT Copy object API. For more information about the parameters for this operation, see [[https://docs.aws.amazon.com/AmazonS3/latest/API/RESTObjectCOPY.html|PUT Object - Copy]].
    */
  @js.native
  trait S3CopyObjectOperation extends js.Object {
    var AccessControlGrants: js.UndefOr[S3GrantList]
    var CannedAccessControlList: js.UndefOr[S3CannedAccessControlList]
    var MetadataDirective: js.UndefOr[S3MetadataDirective]
    var ModifiedSinceConstraint: js.UndefOr[TimeStamp]
    var NewObjectMetadata: js.UndefOr[S3ObjectMetadata]
    var NewObjectTagging: js.UndefOr[S3TagSet]
    var ObjectLockLegalHoldStatus: js.UndefOr[S3ObjectLockLegalHoldStatus]
    var ObjectLockMode: js.UndefOr[S3ObjectLockMode]
    var ObjectLockRetainUntilDate: js.UndefOr[TimeStamp]
    var RedirectLocation: js.UndefOr[NonEmptyMaxLength2048String]
    var RequesterPays: js.UndefOr[Boolean]
    var SSEAwsKmsKeyId: js.UndefOr[KmsKeyArnString]
    var StorageClass: js.UndefOr[S3StorageClass]
    var TargetKeyPrefix: js.UndefOr[NonEmptyMaxLength1024String]
    var TargetResource: js.UndefOr[S3BucketArnString]
    var UnModifiedSinceConstraint: js.UndefOr[TimeStamp]
  }

  object S3CopyObjectOperation {
    @inline
    def apply(
        AccessControlGrants: js.UndefOr[S3GrantList] = js.undefined,
        CannedAccessControlList: js.UndefOr[S3CannedAccessControlList] = js.undefined,
        MetadataDirective: js.UndefOr[S3MetadataDirective] = js.undefined,
        ModifiedSinceConstraint: js.UndefOr[TimeStamp] = js.undefined,
        NewObjectMetadata: js.UndefOr[S3ObjectMetadata] = js.undefined,
        NewObjectTagging: js.UndefOr[S3TagSet] = js.undefined,
        ObjectLockLegalHoldStatus: js.UndefOr[S3ObjectLockLegalHoldStatus] = js.undefined,
        ObjectLockMode: js.UndefOr[S3ObjectLockMode] = js.undefined,
        ObjectLockRetainUntilDate: js.UndefOr[TimeStamp] = js.undefined,
        RedirectLocation: js.UndefOr[NonEmptyMaxLength2048String] = js.undefined,
        RequesterPays: js.UndefOr[Boolean] = js.undefined,
        SSEAwsKmsKeyId: js.UndefOr[KmsKeyArnString] = js.undefined,
        StorageClass: js.UndefOr[S3StorageClass] = js.undefined,
        TargetKeyPrefix: js.UndefOr[NonEmptyMaxLength1024String] = js.undefined,
        TargetResource: js.UndefOr[S3BucketArnString] = js.undefined,
        UnModifiedSinceConstraint: js.UndefOr[TimeStamp] = js.undefined
    ): S3CopyObjectOperation = {
      val __obj = js.Dynamic.literal()
      AccessControlGrants.foreach(__v => __obj.updateDynamic("AccessControlGrants")(__v.asInstanceOf[js.Any]))
      CannedAccessControlList.foreach(__v => __obj.updateDynamic("CannedAccessControlList")(__v.asInstanceOf[js.Any]))
      MetadataDirective.foreach(__v => __obj.updateDynamic("MetadataDirective")(__v.asInstanceOf[js.Any]))
      ModifiedSinceConstraint.foreach(__v => __obj.updateDynamic("ModifiedSinceConstraint")(__v.asInstanceOf[js.Any]))
      NewObjectMetadata.foreach(__v => __obj.updateDynamic("NewObjectMetadata")(__v.asInstanceOf[js.Any]))
      NewObjectTagging.foreach(__v => __obj.updateDynamic("NewObjectTagging")(__v.asInstanceOf[js.Any]))
      ObjectLockLegalHoldStatus.foreach(
        __v => __obj.updateDynamic("ObjectLockLegalHoldStatus")(__v.asInstanceOf[js.Any])
      )
      ObjectLockMode.foreach(__v => __obj.updateDynamic("ObjectLockMode")(__v.asInstanceOf[js.Any]))
      ObjectLockRetainUntilDate.foreach(
        __v => __obj.updateDynamic("ObjectLockRetainUntilDate")(__v.asInstanceOf[js.Any])
      )
      RedirectLocation.foreach(__v => __obj.updateDynamic("RedirectLocation")(__v.asInstanceOf[js.Any]))
      RequesterPays.foreach(__v => __obj.updateDynamic("RequesterPays")(__v.asInstanceOf[js.Any]))
      SSEAwsKmsKeyId.foreach(__v => __obj.updateDynamic("SSEAwsKmsKeyId")(__v.asInstanceOf[js.Any]))
      StorageClass.foreach(__v => __obj.updateDynamic("StorageClass")(__v.asInstanceOf[js.Any]))
      TargetKeyPrefix.foreach(__v => __obj.updateDynamic("TargetKeyPrefix")(__v.asInstanceOf[js.Any]))
      TargetResource.foreach(__v => __obj.updateDynamic("TargetResource")(__v.asInstanceOf[js.Any]))
      UnModifiedSinceConstraint.foreach(
        __v => __obj.updateDynamic("UnModifiedSinceConstraint")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[S3CopyObjectOperation]
    }
  }

  object S3GlacierJobTierEnum {
    val BULK     = "BULK"
    val STANDARD = "STANDARD"

    val values = js.Object.freeze(js.Array(BULK, STANDARD))
  }

  /**
    * <p/>
    */
  @js.native
  trait S3Grant extends js.Object {
    var Grantee: js.UndefOr[S3Grantee]
    var Permission: js.UndefOr[S3Permission]
  }

  object S3Grant {
    @inline
    def apply(
        Grantee: js.UndefOr[S3Grantee] = js.undefined,
        Permission: js.UndefOr[S3Permission] = js.undefined
    ): S3Grant = {
      val __obj = js.Dynamic.literal()
      Grantee.foreach(__v => __obj.updateDynamic("Grantee")(__v.asInstanceOf[js.Any]))
      Permission.foreach(__v => __obj.updateDynamic("Permission")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[S3Grant]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait S3Grantee extends js.Object {
    var DisplayName: js.UndefOr[NonEmptyMaxLength1024String]
    var Identifier: js.UndefOr[NonEmptyMaxLength1024String]
    var TypeIdentifier: js.UndefOr[S3GranteeTypeIdentifier]
  }

  object S3Grantee {
    @inline
    def apply(
        DisplayName: js.UndefOr[NonEmptyMaxLength1024String] = js.undefined,
        Identifier: js.UndefOr[NonEmptyMaxLength1024String] = js.undefined,
        TypeIdentifier: js.UndefOr[S3GranteeTypeIdentifier] = js.undefined
    ): S3Grantee = {
      val __obj = js.Dynamic.literal()
      DisplayName.foreach(__v => __obj.updateDynamic("DisplayName")(__v.asInstanceOf[js.Any]))
      Identifier.foreach(__v => __obj.updateDynamic("Identifier")(__v.asInstanceOf[js.Any]))
      TypeIdentifier.foreach(__v => __obj.updateDynamic("TypeIdentifier")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[S3Grantee]
    }
  }

  object S3GranteeTypeIdentifierEnum {
    val id           = "id"
    val emailAddress = "emailAddress"
    val uri          = "uri"

    val values = js.Object.freeze(js.Array(id, emailAddress, uri))
  }

  /**
    * Contains the configuration parameters for an Initiate Glacier Restore job. Amazon S3 batch operations passes each value through to the underlying POST Object restore API. For more information about the parameters for this operation, see [[https://docs.aws.amazon.com/AmazonS3/latest/API/RESTObjectPOSTrestore.html#RESTObjectPOSTrestore-restore-request|Restoring Archives]].
    */
  @js.native
  trait S3InitiateRestoreObjectOperation extends js.Object {
    var ExpirationInDays: js.UndefOr[S3ExpirationInDays]
    var GlacierJobTier: js.UndefOr[S3GlacierJobTier]
  }

  object S3InitiateRestoreObjectOperation {
    @inline
    def apply(
        ExpirationInDays: js.UndefOr[S3ExpirationInDays] = js.undefined,
        GlacierJobTier: js.UndefOr[S3GlacierJobTier] = js.undefined
    ): S3InitiateRestoreObjectOperation = {
      val __obj = js.Dynamic.literal()
      ExpirationInDays.foreach(__v => __obj.updateDynamic("ExpirationInDays")(__v.asInstanceOf[js.Any]))
      GlacierJobTier.foreach(__v => __obj.updateDynamic("GlacierJobTier")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[S3InitiateRestoreObjectOperation]
    }
  }

  object S3MetadataDirectiveEnum {
    val COPY    = "COPY"
    val REPLACE = "REPLACE"

    val values = js.Object.freeze(js.Array(COPY, REPLACE))
  }

  object S3ObjectLockLegalHoldStatusEnum {
    val OFF = "OFF"
    val ON  = "ON"

    val values = js.Object.freeze(js.Array(OFF, ON))
  }

  object S3ObjectLockModeEnum {
    val COMPLIANCE = "COMPLIANCE"
    val GOVERNANCE = "GOVERNANCE"

    val values = js.Object.freeze(js.Array(COMPLIANCE, GOVERNANCE))
  }

  /**
    * <p/>
    */
  @js.native
  trait S3ObjectMetadata extends js.Object {
    var CacheControl: js.UndefOr[NonEmptyMaxLength1024String]
    var ContentDisposition: js.UndefOr[NonEmptyMaxLength1024String]
    var ContentEncoding: js.UndefOr[NonEmptyMaxLength1024String]
    var ContentLanguage: js.UndefOr[NonEmptyMaxLength1024String]
    var ContentLength: js.UndefOr[S3ContentLength]
    var ContentMD5: js.UndefOr[NonEmptyMaxLength1024String]
    var ContentType: js.UndefOr[NonEmptyMaxLength1024String]
    var HttpExpiresDate: js.UndefOr[TimeStamp]
    var RequesterCharged: js.UndefOr[Boolean]
    var SSEAlgorithm: js.UndefOr[S3SSEAlgorithm]
    var UserMetadata: js.UndefOr[S3UserMetadata]
  }

  object S3ObjectMetadata {
    @inline
    def apply(
        CacheControl: js.UndefOr[NonEmptyMaxLength1024String] = js.undefined,
        ContentDisposition: js.UndefOr[NonEmptyMaxLength1024String] = js.undefined,
        ContentEncoding: js.UndefOr[NonEmptyMaxLength1024String] = js.undefined,
        ContentLanguage: js.UndefOr[NonEmptyMaxLength1024String] = js.undefined,
        ContentLength: js.UndefOr[S3ContentLength] = js.undefined,
        ContentMD5: js.UndefOr[NonEmptyMaxLength1024String] = js.undefined,
        ContentType: js.UndefOr[NonEmptyMaxLength1024String] = js.undefined,
        HttpExpiresDate: js.UndefOr[TimeStamp] = js.undefined,
        RequesterCharged: js.UndefOr[Boolean] = js.undefined,
        SSEAlgorithm: js.UndefOr[S3SSEAlgorithm] = js.undefined,
        UserMetadata: js.UndefOr[S3UserMetadata] = js.undefined
    ): S3ObjectMetadata = {
      val __obj = js.Dynamic.literal()
      CacheControl.foreach(__v => __obj.updateDynamic("CacheControl")(__v.asInstanceOf[js.Any]))
      ContentDisposition.foreach(__v => __obj.updateDynamic("ContentDisposition")(__v.asInstanceOf[js.Any]))
      ContentEncoding.foreach(__v => __obj.updateDynamic("ContentEncoding")(__v.asInstanceOf[js.Any]))
      ContentLanguage.foreach(__v => __obj.updateDynamic("ContentLanguage")(__v.asInstanceOf[js.Any]))
      ContentLength.foreach(__v => __obj.updateDynamic("ContentLength")(__v.asInstanceOf[js.Any]))
      ContentMD5.foreach(__v => __obj.updateDynamic("ContentMD5")(__v.asInstanceOf[js.Any]))
      ContentType.foreach(__v => __obj.updateDynamic("ContentType")(__v.asInstanceOf[js.Any]))
      HttpExpiresDate.foreach(__v => __obj.updateDynamic("HttpExpiresDate")(__v.asInstanceOf[js.Any]))
      RequesterCharged.foreach(__v => __obj.updateDynamic("RequesterCharged")(__v.asInstanceOf[js.Any]))
      SSEAlgorithm.foreach(__v => __obj.updateDynamic("SSEAlgorithm")(__v.asInstanceOf[js.Any]))
      UserMetadata.foreach(__v => __obj.updateDynamic("UserMetadata")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[S3ObjectMetadata]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait S3ObjectOwner extends js.Object {
    var DisplayName: js.UndefOr[NonEmptyMaxLength1024String]
    var ID: js.UndefOr[NonEmptyMaxLength1024String]
  }

  object S3ObjectOwner {
    @inline
    def apply(
        DisplayName: js.UndefOr[NonEmptyMaxLength1024String] = js.undefined,
        ID: js.UndefOr[NonEmptyMaxLength1024String] = js.undefined
    ): S3ObjectOwner = {
      val __obj = js.Dynamic.literal()
      DisplayName.foreach(__v => __obj.updateDynamic("DisplayName")(__v.asInstanceOf[js.Any]))
      ID.foreach(__v => __obj.updateDynamic("ID")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[S3ObjectOwner]
    }
  }

  object S3PermissionEnum {
    val FULL_CONTROL = "FULL_CONTROL"
    val READ         = "READ"
    val WRITE        = "WRITE"
    val READ_ACP     = "READ_ACP"
    val WRITE_ACP    = "WRITE_ACP"

    val values = js.Object.freeze(js.Array(FULL_CONTROL, READ, WRITE, READ_ACP, WRITE_ACP))
  }

  object S3SSEAlgorithmEnum {
    val AES256 = "AES256"
    val KMS    = "KMS"

    val values = js.Object.freeze(js.Array(AES256, KMS))
  }

  /**
    * Contains the configuration parameters for a Set Object ACL operation. Amazon S3 batch operations passes each value through to the underlying PUT Object acl API. For more information about the parameters for this operation, see [[https://docs.aws.amazon.com/AmazonS3/latest/API/RESTObjectPUTacl.html|PUT Object acl]].
    */
  @js.native
  trait S3SetObjectAclOperation extends js.Object {
    var AccessControlPolicy: js.UndefOr[S3AccessControlPolicy]
  }

  object S3SetObjectAclOperation {
    @inline
    def apply(
        AccessControlPolicy: js.UndefOr[S3AccessControlPolicy] = js.undefined
    ): S3SetObjectAclOperation = {
      val __obj = js.Dynamic.literal()
      AccessControlPolicy.foreach(__v => __obj.updateDynamic("AccessControlPolicy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[S3SetObjectAclOperation]
    }
  }

  /**
    * Contains the configuration parameters for a Set Object Tagging operation. Amazon S3 batch operations passes each value through to the underlying PUT Object tagging API. For more information about the parameters for this operation, see [[https://docs.aws.amazon.com/AmazonS3/latest/API/RESTObjectPUTtagging.html|PUT Object tagging]].
    */
  @js.native
  trait S3SetObjectTaggingOperation extends js.Object {
    var TagSet: js.UndefOr[S3TagSet]
  }

  object S3SetObjectTaggingOperation {
    @inline
    def apply(
        TagSet: js.UndefOr[S3TagSet] = js.undefined
    ): S3SetObjectTaggingOperation = {
      val __obj = js.Dynamic.literal()
      TagSet.foreach(__v => __obj.updateDynamic("TagSet")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[S3SetObjectTaggingOperation]
    }
  }

  object S3StorageClassEnum {
    val STANDARD            = "STANDARD"
    val STANDARD_IA         = "STANDARD_IA"
    val ONEZONE_IA          = "ONEZONE_IA"
    val GLACIER             = "GLACIER"
    val INTELLIGENT_TIERING = "INTELLIGENT_TIERING"
    val DEEP_ARCHIVE        = "DEEP_ARCHIVE"

    val values =
      js.Object.freeze(js.Array(STANDARD, STANDARD_IA, ONEZONE_IA, GLACIER, INTELLIGENT_TIERING, DEEP_ARCHIVE))
  }

  /**
    * <p/>
    */
  @js.native
  trait S3Tag extends js.Object {
    var Key: NonEmptyMaxLength1024String
    var Value: MaxLength1024String
  }

  object S3Tag {
    @inline
    def apply(
        Key: NonEmptyMaxLength1024String,
        Value: MaxLength1024String
    ): S3Tag = {
      val __obj = js.Dynamic.literal(
        "Key"   -> Key.asInstanceOf[js.Any],
        "Value" -> Value.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[S3Tag]
    }
  }

  @js.native
  trait UpdateJobPriorityRequest extends js.Object {
    var AccountId: AccountId
    var JobId: JobId
    var Priority: JobPriority
  }

  object UpdateJobPriorityRequest {
    @inline
    def apply(
        AccountId: AccountId,
        JobId: JobId,
        Priority: JobPriority
    ): UpdateJobPriorityRequest = {
      val __obj = js.Dynamic.literal(
        "AccountId" -> AccountId.asInstanceOf[js.Any],
        "JobId"     -> JobId.asInstanceOf[js.Any],
        "Priority"  -> Priority.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UpdateJobPriorityRequest]
    }
  }

  @js.native
  trait UpdateJobPriorityResult extends js.Object {
    var JobId: JobId
    var Priority: JobPriority
  }

  object UpdateJobPriorityResult {
    @inline
    def apply(
        JobId: JobId,
        Priority: JobPriority
    ): UpdateJobPriorityResult = {
      val __obj = js.Dynamic.literal(
        "JobId"    -> JobId.asInstanceOf[js.Any],
        "Priority" -> Priority.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UpdateJobPriorityResult]
    }
  }

  @js.native
  trait UpdateJobStatusRequest extends js.Object {
    var AccountId: AccountId
    var JobId: JobId
    var RequestedJobStatus: RequestedJobStatus
    var StatusUpdateReason: js.UndefOr[JobStatusUpdateReason]
  }

  object UpdateJobStatusRequest {
    @inline
    def apply(
        AccountId: AccountId,
        JobId: JobId,
        RequestedJobStatus: RequestedJobStatus,
        StatusUpdateReason: js.UndefOr[JobStatusUpdateReason] = js.undefined
    ): UpdateJobStatusRequest = {
      val __obj = js.Dynamic.literal(
        "AccountId"          -> AccountId.asInstanceOf[js.Any],
        "JobId"              -> JobId.asInstanceOf[js.Any],
        "RequestedJobStatus" -> RequestedJobStatus.asInstanceOf[js.Any]
      )

      StatusUpdateReason.foreach(__v => __obj.updateDynamic("StatusUpdateReason")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateJobStatusRequest]
    }
  }

  @js.native
  trait UpdateJobStatusResult extends js.Object {
    var JobId: js.UndefOr[JobId]
    var Status: js.UndefOr[JobStatus]
    var StatusUpdateReason: js.UndefOr[JobStatusUpdateReason]
  }

  object UpdateJobStatusResult {
    @inline
    def apply(
        JobId: js.UndefOr[JobId] = js.undefined,
        Status: js.UndefOr[JobStatus] = js.undefined,
        StatusUpdateReason: js.UndefOr[JobStatusUpdateReason] = js.undefined
    ): UpdateJobStatusResult = {
      val __obj = js.Dynamic.literal()
      JobId.foreach(__v => __obj.updateDynamic("JobId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      StatusUpdateReason.foreach(__v => __obj.updateDynamic("StatusUpdateReason")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateJobStatusResult]
    }
  }
}
