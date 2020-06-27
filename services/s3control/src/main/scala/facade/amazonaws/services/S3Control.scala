package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object s3control {
  type AccessPointList             = js.Array[AccessPoint]
  type AccessPointName             = String
  type AccountId                   = String
  type BucketName                  = String
  type ConfirmationRequired        = Boolean
  type CreationDate                = js.Date
  type IAMRoleArn                  = String
  type IsPublic                    = Boolean
  type JobArn                      = String
  type JobCreationTime             = js.Date
  type JobFailureCode              = String
  type JobFailureList              = js.Array[JobFailure]
  type JobFailureReason            = String
  type JobId                       = String
  type JobListDescriptorList       = js.Array[JobListDescriptor]
  type JobManifestFieldList        = js.Array[JobManifestFieldName]
  type JobNumberOfTasksFailed      = Double
  type JobNumberOfTasksSucceeded   = Double
  type JobPriority                 = Int
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
  type Policy                      = String
  type ReportPrefixString          = String
  type S3BucketArnString           = String
  type S3ContentLength             = Double
  type S3ExpirationInDays          = Int
  type S3GrantList                 = js.Array[S3Grant]
  type S3KeyArnString              = String
  type S3ObjectVersionId           = String
  type S3TagSet                    = js.Array[S3Tag]
  type S3UserMetadata              = js.Dictionary[MaxLength1024String]
  type Setting                     = Boolean
  type SuspendedCause              = String
  type SuspendedDate               = js.Date
  type TimeStamp                   = js.Date
  type VpcId                       = String

  implicit final class S3ControlOps(private val service: S3Control) extends AnyVal {

    @inline def createAccessPointFuture(params: CreateAccessPointRequest): Future[js.Object] =
      service.createAccessPoint(params).promise().toFuture
    @inline def createJobFuture(params: CreateJobRequest): Future[CreateJobResult] =
      service.createJob(params).promise().toFuture
    @inline def deleteAccessPointFuture(params: DeleteAccessPointRequest): Future[js.Object] =
      service.deleteAccessPoint(params).promise().toFuture
    @inline def deleteAccessPointPolicyFuture(params: DeleteAccessPointPolicyRequest): Future[js.Object] =
      service.deleteAccessPointPolicy(params).promise().toFuture
    @inline def deletePublicAccessBlockFuture(params: DeletePublicAccessBlockRequest): Future[js.Object] =
      service.deletePublicAccessBlock(params).promise().toFuture
    @inline def describeJobFuture(params: DescribeJobRequest): Future[DescribeJobResult] =
      service.describeJob(params).promise().toFuture
    @inline def getAccessPointFuture(params: GetAccessPointRequest): Future[GetAccessPointResult] =
      service.getAccessPoint(params).promise().toFuture
    @inline def getAccessPointPolicyFuture(params: GetAccessPointPolicyRequest): Future[GetAccessPointPolicyResult] =
      service.getAccessPointPolicy(params).promise().toFuture
    @inline def getAccessPointPolicyStatusFuture(
        params: GetAccessPointPolicyStatusRequest
    ): Future[GetAccessPointPolicyStatusResult] = service.getAccessPointPolicyStatus(params).promise().toFuture
    @inline def getPublicAccessBlockFuture(params: GetPublicAccessBlockRequest): Future[GetPublicAccessBlockOutput] =
      service.getPublicAccessBlock(params).promise().toFuture
    @inline def listAccessPointsFuture(params: ListAccessPointsRequest): Future[ListAccessPointsResult] =
      service.listAccessPoints(params).promise().toFuture
    @inline def listJobsFuture(params: ListJobsRequest): Future[ListJobsResult] =
      service.listJobs(params).promise().toFuture
    @inline def putAccessPointPolicyFuture(params: PutAccessPointPolicyRequest): Future[js.Object] =
      service.putAccessPointPolicy(params).promise().toFuture
    @inline def putPublicAccessBlockFuture(params: PutPublicAccessBlockRequest): Future[js.Object] =
      service.putPublicAccessBlock(params).promise().toFuture
    @inline def updateJobPriorityFuture(params: UpdateJobPriorityRequest): Future[UpdateJobPriorityResult] =
      service.updateJobPriority(params).promise().toFuture
    @inline def updateJobStatusFuture(params: UpdateJobStatusRequest): Future[UpdateJobStatusResult] =
      service.updateJobStatus(params).promise().toFuture
  }
}

package s3control {
  @js.native
  @JSImport("aws-sdk", "S3Control")
  class S3Control() extends js.Object {
    def this(config: AWSConfig) = this()

    def createAccessPoint(params: CreateAccessPointRequest): Request[js.Object]                        = js.native
    def createJob(params: CreateJobRequest): Request[CreateJobResult]                                  = js.native
    def deleteAccessPoint(params: DeleteAccessPointRequest): Request[js.Object]                        = js.native
    def deleteAccessPointPolicy(params: DeleteAccessPointPolicyRequest): Request[js.Object]            = js.native
    def deletePublicAccessBlock(params: DeletePublicAccessBlockRequest): Request[js.Object]            = js.native
    def describeJob(params: DescribeJobRequest): Request[DescribeJobResult]                            = js.native
    def getAccessPoint(params: GetAccessPointRequest): Request[GetAccessPointResult]                   = js.native
    def getAccessPointPolicy(params: GetAccessPointPolicyRequest): Request[GetAccessPointPolicyResult] = js.native
    def getAccessPointPolicyStatus(
        params: GetAccessPointPolicyStatusRequest
    ): Request[GetAccessPointPolicyStatusResult]                                                       = js.native
    def getPublicAccessBlock(params: GetPublicAccessBlockRequest): Request[GetPublicAccessBlockOutput] = js.native
    def listAccessPoints(params: ListAccessPointsRequest): Request[ListAccessPointsResult]             = js.native
    def listJobs(params: ListJobsRequest): Request[ListJobsResult]                                     = js.native
    def putAccessPointPolicy(params: PutAccessPointPolicyRequest): Request[js.Object]                  = js.native
    def putPublicAccessBlock(params: PutPublicAccessBlockRequest): Request[js.Object]                  = js.native
    def updateJobPriority(params: UpdateJobPriorityRequest): Request[UpdateJobPriorityResult]          = js.native
    def updateJobStatus(params: UpdateJobStatusRequest): Request[UpdateJobStatusResult]                = js.native
  }

  /**
    * An access point used to access a bucket.
    */
  @js.native
  @Factory
  trait AccessPoint extends js.Object {
    var Bucket: BucketName
    var Name: AccessPointName
    var NetworkOrigin: NetworkOrigin
    var VpcConfiguration: js.UndefOr[VpcConfiguration]
  }

  @js.native
  @Factory
  trait CreateAccessPointRequest extends js.Object {
    var AccountId: AccountId
    var Bucket: BucketName
    var Name: AccessPointName
    var PublicAccessBlockConfiguration: js.UndefOr[PublicAccessBlockConfiguration]
    var VpcConfiguration: js.UndefOr[VpcConfiguration]
  }

  @js.native
  @Factory
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

  @js.native
  @Factory
  trait CreateJobResult extends js.Object {
    var JobId: js.UndefOr[JobId]
  }

  @js.native
  @Factory
  trait DeleteAccessPointPolicyRequest extends js.Object {
    var AccountId: AccountId
    var Name: AccessPointName
  }

  @js.native
  @Factory
  trait DeleteAccessPointRequest extends js.Object {
    var AccountId: AccountId
    var Name: AccessPointName
  }

  @js.native
  @Factory
  trait DeletePublicAccessBlockRequest extends js.Object {
    var AccountId: AccountId
  }

  @js.native
  @Factory
  trait DescribeJobRequest extends js.Object {
    var AccountId: AccountId
    var JobId: JobId
  }

  @js.native
  @Factory
  trait DescribeJobResult extends js.Object {
    var Job: js.UndefOr[JobDescriptor]
  }

  @js.native
  @Factory
  trait GetAccessPointPolicyRequest extends js.Object {
    var AccountId: AccountId
    var Name: AccessPointName
  }

  @js.native
  @Factory
  trait GetAccessPointPolicyResult extends js.Object {
    var Policy: js.UndefOr[Policy]
  }

  @js.native
  @Factory
  trait GetAccessPointPolicyStatusRequest extends js.Object {
    var AccountId: AccountId
    var Name: AccessPointName
  }

  @js.native
  @Factory
  trait GetAccessPointPolicyStatusResult extends js.Object {
    var PolicyStatus: js.UndefOr[PolicyStatus]
  }

  @js.native
  @Factory
  trait GetAccessPointRequest extends js.Object {
    var AccountId: AccountId
    var Name: AccessPointName
  }

  @js.native
  @Factory
  trait GetAccessPointResult extends js.Object {
    var Bucket: js.UndefOr[BucketName]
    var CreationDate: js.UndefOr[CreationDate]
    var Name: js.UndefOr[AccessPointName]
    var NetworkOrigin: js.UndefOr[NetworkOrigin]
    var PublicAccessBlockConfiguration: js.UndefOr[PublicAccessBlockConfiguration]
    var VpcConfiguration: js.UndefOr[VpcConfiguration]
  }

  @js.native
  @Factory
  trait GetPublicAccessBlockOutput extends js.Object {
    var PublicAccessBlockConfiguration: js.UndefOr[PublicAccessBlockConfiguration]
  }

  @js.native
  @Factory
  trait GetPublicAccessBlockRequest extends js.Object {
    var AccountId: AccountId
  }

  /**
    * A container element for the job configuration and status information returned by a <code>Describe Job</code> request.
    */
  @js.native
  @Factory
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

  /**
    * If this job failed, this element indicates why the job failed.
    */
  @js.native
  @Factory
  trait JobFailure extends js.Object {
    var FailureCode: js.UndefOr[JobFailureCode]
    var FailureReason: js.UndefOr[JobFailureReason]
  }

  /**
    * Contains the configuration and status information for a single job retrieved as part of a job list.
    */
  @js.native
  @Factory
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

  /**
    * Contains the configuration information for a job's manifest.
    */
  @js.native
  @Factory
  trait JobManifest extends js.Object {
    var Location: JobManifestLocation
    var Spec: JobManifestSpec
  }

  @js.native
  sealed trait JobManifestFieldName extends js.Any
  object JobManifestFieldName extends js.Object {
    val Ignore    = "Ignore".asInstanceOf[JobManifestFieldName]
    val Bucket    = "Bucket".asInstanceOf[JobManifestFieldName]
    val Key       = "Key".asInstanceOf[JobManifestFieldName]
    val VersionId = "VersionId".asInstanceOf[JobManifestFieldName]

    val values = js.Object.freeze(js.Array(Ignore, Bucket, Key, VersionId))
  }

  @js.native
  sealed trait JobManifestFormat extends js.Any
  object JobManifestFormat extends js.Object {
    val S3BatchOperations_CSV_20180820 = "S3BatchOperations_CSV_20180820".asInstanceOf[JobManifestFormat]
    val S3InventoryReport_CSV_20161130 = "S3InventoryReport_CSV_20161130".asInstanceOf[JobManifestFormat]

    val values = js.Object.freeze(js.Array(S3BatchOperations_CSV_20180820, S3InventoryReport_CSV_20161130))
  }

  /**
    * Contains the information required to locate a manifest object.
    */
  @js.native
  @Factory
  trait JobManifestLocation extends js.Object {
    var ETag: NonEmptyMaxLength1024String
    var ObjectArn: S3KeyArnString
    var ObjectVersionId: js.UndefOr[S3ObjectVersionId]
  }

  /**
    * Describes the format of a manifest. If the manifest is in CSV format, also describes the columns contained within the manifest.
    */
  @js.native
  @Factory
  trait JobManifestSpec extends js.Object {
    var Format: JobManifestFormat
    var Fields: js.UndefOr[JobManifestFieldList]
  }

  /**
    * The operation that you want this job to perform on each object listed in the manifest. For more information about the available operations, see [[https://docs.aws.amazon.com/AmazonS3/latest/dev/batch-ops-operations.html|Available Operations]] in the <i>Amazon Simple Storage Service Developer Guide</i>.
    */
  @js.native
  @Factory
  trait JobOperation extends js.Object {
    var LambdaInvoke: js.UndefOr[LambdaInvokeOperation]
    var S3InitiateRestoreObject: js.UndefOr[S3InitiateRestoreObjectOperation]
    var S3PutObjectAcl: js.UndefOr[S3SetObjectAclOperation]
    var S3PutObjectCopy: js.UndefOr[S3CopyObjectOperation]
    var S3PutObjectTagging: js.UndefOr[S3SetObjectTaggingOperation]
  }

  /**
    * Describes the total number of tasks that the specified job has executed, the number of tasks that succeeded, and the number of tasks that failed.
    */
  @js.native
  @Factory
  trait JobProgressSummary extends js.Object {
    var NumberOfTasksFailed: js.UndefOr[JobNumberOfTasksFailed]
    var NumberOfTasksSucceeded: js.UndefOr[JobNumberOfTasksSucceeded]
    var TotalNumberOfTasks: js.UndefOr[JobTotalNumberOfTasks]
  }

  /**
    * Contains the configuration parameters for a job-completion report.
    */
  @js.native
  @Factory
  trait JobReport extends js.Object {
    var Enabled: Boolean
    var Bucket: js.UndefOr[S3BucketArnString]
    var Format: js.UndefOr[JobReportFormat]
    var Prefix: js.UndefOr[ReportPrefixString]
    var ReportScope: js.UndefOr[JobReportScope]
  }

  @js.native
  sealed trait JobReportFormat extends js.Any
  object JobReportFormat extends js.Object {
    val Report_CSV_20180820 = "Report_CSV_20180820".asInstanceOf[JobReportFormat]

    val values = js.Object.freeze(js.Array(Report_CSV_20180820))
  }

  @js.native
  sealed trait JobReportScope extends js.Any
  object JobReportScope extends js.Object {
    val AllTasks        = "AllTasks".asInstanceOf[JobReportScope]
    val FailedTasksOnly = "FailedTasksOnly".asInstanceOf[JobReportScope]

    val values = js.Object.freeze(js.Array(AllTasks, FailedTasksOnly))
  }

  @js.native
  sealed trait JobStatus extends js.Any
  object JobStatus extends js.Object {
    val Active     = "Active".asInstanceOf[JobStatus]
    val Cancelled  = "Cancelled".asInstanceOf[JobStatus]
    val Cancelling = "Cancelling".asInstanceOf[JobStatus]
    val Complete   = "Complete".asInstanceOf[JobStatus]
    val Completing = "Completing".asInstanceOf[JobStatus]
    val Failed     = "Failed".asInstanceOf[JobStatus]
    val Failing    = "Failing".asInstanceOf[JobStatus]
    val New        = "New".asInstanceOf[JobStatus]
    val Paused     = "Paused".asInstanceOf[JobStatus]
    val Pausing    = "Pausing".asInstanceOf[JobStatus]
    val Preparing  = "Preparing".asInstanceOf[JobStatus]
    val Ready      = "Ready".asInstanceOf[JobStatus]
    val Suspended  = "Suspended".asInstanceOf[JobStatus]

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
  @Factory
  trait LambdaInvokeOperation extends js.Object {
    var FunctionArn: js.UndefOr[NonEmptyMaxLength1024String]
  }

  @js.native
  @Factory
  trait ListAccessPointsRequest extends js.Object {
    var AccountId: AccountId
    var Bucket: js.UndefOr[BucketName]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NonEmptyMaxLength1024String]
  }

  @js.native
  @Factory
  trait ListAccessPointsResult extends js.Object {
    var AccessPointList: js.UndefOr[AccessPointList]
    var NextToken: js.UndefOr[NonEmptyMaxLength1024String]
  }

  @js.native
  @Factory
  trait ListJobsRequest extends js.Object {
    var AccountId: AccountId
    var JobStatuses: js.UndefOr[JobStatusList]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NonEmptyMaxLength1024String]
  }

  @js.native
  @Factory
  trait ListJobsResult extends js.Object {
    var Jobs: js.UndefOr[JobListDescriptorList]
    var NextToken: js.UndefOr[NonEmptyMaxLength1024String]
  }

  @js.native
  sealed trait NetworkOrigin extends js.Any
  object NetworkOrigin extends js.Object {
    val Internet = "Internet".asInstanceOf[NetworkOrigin]
    val VPC      = "VPC".asInstanceOf[NetworkOrigin]

    val values = js.Object.freeze(js.Array(Internet, VPC))
  }

  @js.native
  sealed trait OperationName extends js.Any
  object OperationName extends js.Object {
    val LambdaInvoke            = "LambdaInvoke".asInstanceOf[OperationName]
    val S3PutObjectCopy         = "S3PutObjectCopy".asInstanceOf[OperationName]
    val S3PutObjectAcl          = "S3PutObjectAcl".asInstanceOf[OperationName]
    val S3PutObjectTagging      = "S3PutObjectTagging".asInstanceOf[OperationName]
    val S3InitiateRestoreObject = "S3InitiateRestoreObject".asInstanceOf[OperationName]

    val values = js.Object.freeze(
      js.Array(LambdaInvoke, S3PutObjectCopy, S3PutObjectAcl, S3PutObjectTagging, S3InitiateRestoreObject)
    )
  }

  /**
    * Indicates whether this access point policy is public. For more information about how Amazon S3 evaluates policies to determine whether they are public, see [[https://docs.aws.amazon.com/AmazonS3/latest/dev/access-control-block-public-access.html#access-control-block-public-access-policy-status|The Meaning of "Public"]] in the <i>Amazon Simple Storage Service Developer Guide</i>.
    */
  @js.native
  @Factory
  trait PolicyStatus extends js.Object {
    var IsPublic: js.UndefOr[IsPublic]
  }

  /**
    * The <code>PublicAccessBlock</code> configuration that you want to apply to this Amazon S3 bucket. You can enable the configuration options in any combination. For more information about when Amazon S3 considers a bucket or object public, see [[https://docs.aws.amazon.com/AmazonS3/latest/dev/access-control-block-public-access.html#access-control-block-public-access-policy-status|The Meaning of "Public"]] in the Amazon Simple Storage Service Developer Guide.
    */
  @js.native
  @Factory
  trait PublicAccessBlockConfiguration extends js.Object {
    var BlockPublicAcls: js.UndefOr[Setting]
    var BlockPublicPolicy: js.UndefOr[Setting]
    var IgnorePublicAcls: js.UndefOr[Setting]
    var RestrictPublicBuckets: js.UndefOr[Setting]
  }

  @js.native
  @Factory
  trait PutAccessPointPolicyRequest extends js.Object {
    var AccountId: AccountId
    var Name: AccessPointName
    var Policy: Policy
  }

  @js.native
  @Factory
  trait PutPublicAccessBlockRequest extends js.Object {
    var AccountId: AccountId
    var PublicAccessBlockConfiguration: PublicAccessBlockConfiguration
  }

  @js.native
  sealed trait RequestedJobStatus extends js.Any
  object RequestedJobStatus extends js.Object {
    val Cancelled = "Cancelled".asInstanceOf[RequestedJobStatus]
    val Ready     = "Ready".asInstanceOf[RequestedJobStatus]

    val values = js.Object.freeze(js.Array(Cancelled, Ready))
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait S3AccessControlList extends js.Object {
    var Owner: S3ObjectOwner
    var Grants: js.UndefOr[S3GrantList]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait S3AccessControlPolicy extends js.Object {
    var AccessControlList: js.UndefOr[S3AccessControlList]
    var CannedAccessControlList: js.UndefOr[S3CannedAccessControlList]
  }

  @js.native
  sealed trait S3CannedAccessControlList extends js.Any
  object S3CannedAccessControlList extends js.Object {
    val `private`                   = "private".asInstanceOf[S3CannedAccessControlList]
    val `public-read`               = "public-read".asInstanceOf[S3CannedAccessControlList]
    val `public-read-write`         = "public-read-write".asInstanceOf[S3CannedAccessControlList]
    val `aws-exec-read`             = "aws-exec-read".asInstanceOf[S3CannedAccessControlList]
    val `authenticated-read`        = "authenticated-read".asInstanceOf[S3CannedAccessControlList]
    val `bucket-owner-read`         = "bucket-owner-read".asInstanceOf[S3CannedAccessControlList]
    val `bucket-owner-full-control` = "bucket-owner-full-control".asInstanceOf[S3CannedAccessControlList]

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
  @Factory
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

  @js.native
  sealed trait S3GlacierJobTier extends js.Any
  object S3GlacierJobTier extends js.Object {
    val BULK     = "BULK".asInstanceOf[S3GlacierJobTier]
    val STANDARD = "STANDARD".asInstanceOf[S3GlacierJobTier]

    val values = js.Object.freeze(js.Array(BULK, STANDARD))
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait S3Grant extends js.Object {
    var Grantee: js.UndefOr[S3Grantee]
    var Permission: js.UndefOr[S3Permission]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait S3Grantee extends js.Object {
    var DisplayName: js.UndefOr[NonEmptyMaxLength1024String]
    var Identifier: js.UndefOr[NonEmptyMaxLength1024String]
    var TypeIdentifier: js.UndefOr[S3GranteeTypeIdentifier]
  }

  @js.native
  sealed trait S3GranteeTypeIdentifier extends js.Any
  object S3GranteeTypeIdentifier extends js.Object {
    val id           = "id".asInstanceOf[S3GranteeTypeIdentifier]
    val emailAddress = "emailAddress".asInstanceOf[S3GranteeTypeIdentifier]
    val uri          = "uri".asInstanceOf[S3GranteeTypeIdentifier]

    val values = js.Object.freeze(js.Array(id, emailAddress, uri))
  }

  /**
    * Contains the configuration parameters for an Initiate Glacier Restore job. Amazon S3 batch operations passes each value through to the underlying POST Object restore API. For more information about the parameters for this operation, see [[https://docs.aws.amazon.com/AmazonS3/latest/API/RESTObjectPOSTrestore.html#RESTObjectPOSTrestore-restore-request|Restoring Archives]].
    */
  @js.native
  @Factory
  trait S3InitiateRestoreObjectOperation extends js.Object {
    var ExpirationInDays: js.UndefOr[S3ExpirationInDays]
    var GlacierJobTier: js.UndefOr[S3GlacierJobTier]
  }

  @js.native
  sealed trait S3MetadataDirective extends js.Any
  object S3MetadataDirective extends js.Object {
    val COPY    = "COPY".asInstanceOf[S3MetadataDirective]
    val REPLACE = "REPLACE".asInstanceOf[S3MetadataDirective]

    val values = js.Object.freeze(js.Array(COPY, REPLACE))
  }

  @js.native
  sealed trait S3ObjectLockLegalHoldStatus extends js.Any
  object S3ObjectLockLegalHoldStatus extends js.Object {
    val OFF = "OFF".asInstanceOf[S3ObjectLockLegalHoldStatus]
    val ON  = "ON".asInstanceOf[S3ObjectLockLegalHoldStatus]

    val values = js.Object.freeze(js.Array(OFF, ON))
  }

  @js.native
  sealed trait S3ObjectLockMode extends js.Any
  object S3ObjectLockMode extends js.Object {
    val COMPLIANCE = "COMPLIANCE".asInstanceOf[S3ObjectLockMode]
    val GOVERNANCE = "GOVERNANCE".asInstanceOf[S3ObjectLockMode]

    val values = js.Object.freeze(js.Array(COMPLIANCE, GOVERNANCE))
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
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

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait S3ObjectOwner extends js.Object {
    var DisplayName: js.UndefOr[NonEmptyMaxLength1024String]
    var ID: js.UndefOr[NonEmptyMaxLength1024String]
  }

  @js.native
  sealed trait S3Permission extends js.Any
  object S3Permission extends js.Object {
    val FULL_CONTROL = "FULL_CONTROL".asInstanceOf[S3Permission]
    val READ         = "READ".asInstanceOf[S3Permission]
    val WRITE        = "WRITE".asInstanceOf[S3Permission]
    val READ_ACP     = "READ_ACP".asInstanceOf[S3Permission]
    val WRITE_ACP    = "WRITE_ACP".asInstanceOf[S3Permission]

    val values = js.Object.freeze(js.Array(FULL_CONTROL, READ, WRITE, READ_ACP, WRITE_ACP))
  }

  @js.native
  sealed trait S3SSEAlgorithm extends js.Any
  object S3SSEAlgorithm extends js.Object {
    val AES256 = "AES256".asInstanceOf[S3SSEAlgorithm]
    val KMS    = "KMS".asInstanceOf[S3SSEAlgorithm]

    val values = js.Object.freeze(js.Array(AES256, KMS))
  }

  /**
    * Contains the configuration parameters for a Set Object ACL operation. Amazon S3 batch operations passes each value through to the underlying PUT Object acl API. For more information about the parameters for this operation, see [[https://docs.aws.amazon.com/AmazonS3/latest/API/RESTObjectPUTacl.html|PUT Object acl]].
    */
  @js.native
  @Factory
  trait S3SetObjectAclOperation extends js.Object {
    var AccessControlPolicy: js.UndefOr[S3AccessControlPolicy]
  }

  /**
    * Contains the configuration parameters for a Set Object Tagging operation. Amazon S3 batch operations passes each value through to the underlying PUT Object tagging API. For more information about the parameters for this operation, see [[https://docs.aws.amazon.com/AmazonS3/latest/API/RESTObjectPUTtagging.html|PUT Object tagging]].
    */
  @js.native
  @Factory
  trait S3SetObjectTaggingOperation extends js.Object {
    var TagSet: js.UndefOr[S3TagSet]
  }

  @js.native
  sealed trait S3StorageClass extends js.Any
  object S3StorageClass extends js.Object {
    val STANDARD            = "STANDARD".asInstanceOf[S3StorageClass]
    val STANDARD_IA         = "STANDARD_IA".asInstanceOf[S3StorageClass]
    val ONEZONE_IA          = "ONEZONE_IA".asInstanceOf[S3StorageClass]
    val GLACIER             = "GLACIER".asInstanceOf[S3StorageClass]
    val INTELLIGENT_TIERING = "INTELLIGENT_TIERING".asInstanceOf[S3StorageClass]
    val DEEP_ARCHIVE        = "DEEP_ARCHIVE".asInstanceOf[S3StorageClass]

    val values =
      js.Object.freeze(js.Array(STANDARD, STANDARD_IA, ONEZONE_IA, GLACIER, INTELLIGENT_TIERING, DEEP_ARCHIVE))
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait S3Tag extends js.Object {
    var Key: NonEmptyMaxLength1024String
    var Value: MaxLength1024String
  }

  @js.native
  @Factory
  trait UpdateJobPriorityRequest extends js.Object {
    var AccountId: AccountId
    var JobId: JobId
    var Priority: JobPriority
  }

  @js.native
  @Factory
  trait UpdateJobPriorityResult extends js.Object {
    var JobId: JobId
    var Priority: JobPriority
  }

  @js.native
  @Factory
  trait UpdateJobStatusRequest extends js.Object {
    var AccountId: AccountId
    var JobId: JobId
    var RequestedJobStatus: RequestedJobStatus
    var StatusUpdateReason: js.UndefOr[JobStatusUpdateReason]
  }

  @js.native
  @Factory
  trait UpdateJobStatusResult extends js.Object {
    var JobId: js.UndefOr[JobId]
    var Status: js.UndefOr[JobStatus]
    var StatusUpdateReason: js.UndefOr[JobStatusUpdateReason]
  }

  /**
    * The Virtual Private Cloud (VPC) configuration for an access point.
    */
  @js.native
  @Factory
  trait VpcConfiguration extends js.Object {
    var VpcId: VpcId
  }
}
