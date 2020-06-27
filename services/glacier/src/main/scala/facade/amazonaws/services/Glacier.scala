package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object glacier {
  type AccessControlPolicyList = js.Array[Grant]
  type DataRetrievalRulesList  = js.Array[DataRetrievalRule]
  type DateTime                = String
  type JobList                 = js.Array[GlacierJobDescription]
  type NotificationEventList   = js.Array[String]
  type NullableLong            = Double
  type PartList                = js.Array[PartListElement]
  type ProvisionedCapacityList = js.Array[ProvisionedCapacityDescription]
  type Size                    = Double
  type Stream                  = js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type TagKey                  = String
  type TagKeyList              = js.Array[String]
  type TagMap                  = js.Dictionary[TagValue]
  type TagValue                = String
  type UploadsList             = js.Array[UploadListElement]
  type VaultList               = js.Array[DescribeVaultOutput]
  type hashmap                 = js.Dictionary[String]
  type httpstatus              = Int

  implicit final class GlacierOps(private val service: Glacier) extends AnyVal {

    @inline def abortMultipartUploadFuture(params: AbortMultipartUploadInput): Future[js.Object] =
      service.abortMultipartUpload(params).promise().toFuture
    @inline def abortVaultLockFuture(params: AbortVaultLockInput): Future[js.Object] =
      service.abortVaultLock(params).promise().toFuture
    @inline def addTagsToVaultFuture(params: AddTagsToVaultInput): Future[js.Object] =
      service.addTagsToVault(params).promise().toFuture
    @inline def completeMultipartUploadFuture(params: CompleteMultipartUploadInput): Future[ArchiveCreationOutput] =
      service.completeMultipartUpload(params).promise().toFuture
    @inline def completeVaultLockFuture(params: CompleteVaultLockInput): Future[js.Object] =
      service.completeVaultLock(params).promise().toFuture
    @inline def createVaultFuture(params: CreateVaultInput): Future[CreateVaultOutput] =
      service.createVault(params).promise().toFuture
    @inline def deleteArchiveFuture(params: DeleteArchiveInput): Future[js.Object] =
      service.deleteArchive(params).promise().toFuture
    @inline def deleteVaultAccessPolicyFuture(params: DeleteVaultAccessPolicyInput): Future[js.Object] =
      service.deleteVaultAccessPolicy(params).promise().toFuture
    @inline def deleteVaultFuture(params: DeleteVaultInput): Future[js.Object] =
      service.deleteVault(params).promise().toFuture
    @inline def deleteVaultNotificationsFuture(params: DeleteVaultNotificationsInput): Future[js.Object] =
      service.deleteVaultNotifications(params).promise().toFuture
    @inline def describeJobFuture(params: DescribeJobInput): Future[GlacierJobDescription] =
      service.describeJob(params).promise().toFuture
    @inline def describeVaultFuture(params: DescribeVaultInput): Future[DescribeVaultOutput] =
      service.describeVault(params).promise().toFuture
    @inline def getDataRetrievalPolicyFuture(
        params: GetDataRetrievalPolicyInput
    ): Future[GetDataRetrievalPolicyOutput] = service.getDataRetrievalPolicy(params).promise().toFuture
    @inline def getJobOutputFuture(params: GetJobOutputInput): Future[GetJobOutputOutput] =
      service.getJobOutput(params).promise().toFuture
    @inline def getVaultAccessPolicyFuture(params: GetVaultAccessPolicyInput): Future[GetVaultAccessPolicyOutput] =
      service.getVaultAccessPolicy(params).promise().toFuture
    @inline def getVaultLockFuture(params: GetVaultLockInput): Future[GetVaultLockOutput] =
      service.getVaultLock(params).promise().toFuture
    @inline def getVaultNotificationsFuture(params: GetVaultNotificationsInput): Future[GetVaultNotificationsOutput] =
      service.getVaultNotifications(params).promise().toFuture
    @inline def initiateJobFuture(params: InitiateJobInput): Future[InitiateJobOutput] =
      service.initiateJob(params).promise().toFuture
    @inline def initiateMultipartUploadFuture(
        params: InitiateMultipartUploadInput
    ): Future[InitiateMultipartUploadOutput] = service.initiateMultipartUpload(params).promise().toFuture
    @inline def initiateVaultLockFuture(params: InitiateVaultLockInput): Future[InitiateVaultLockOutput] =
      service.initiateVaultLock(params).promise().toFuture
    @inline def listJobsFuture(params: ListJobsInput): Future[ListJobsOutput] =
      service.listJobs(params).promise().toFuture
    @inline def listMultipartUploadsFuture(params: ListMultipartUploadsInput): Future[ListMultipartUploadsOutput] =
      service.listMultipartUploads(params).promise().toFuture
    @inline def listPartsFuture(params: ListPartsInput): Future[ListPartsOutput] =
      service.listParts(params).promise().toFuture
    @inline def listProvisionedCapacityFuture(
        params: ListProvisionedCapacityInput
    ): Future[ListProvisionedCapacityOutput] = service.listProvisionedCapacity(params).promise().toFuture
    @inline def listTagsForVaultFuture(params: ListTagsForVaultInput): Future[ListTagsForVaultOutput] =
      service.listTagsForVault(params).promise().toFuture
    @inline def listVaultsFuture(params: ListVaultsInput): Future[ListVaultsOutput] =
      service.listVaults(params).promise().toFuture
    @inline def purchaseProvisionedCapacityFuture(
        params: PurchaseProvisionedCapacityInput
    ): Future[PurchaseProvisionedCapacityOutput] = service.purchaseProvisionedCapacity(params).promise().toFuture
    @inline def removeTagsFromVaultFuture(params: RemoveTagsFromVaultInput): Future[js.Object] =
      service.removeTagsFromVault(params).promise().toFuture
    @inline def setDataRetrievalPolicyFuture(params: SetDataRetrievalPolicyInput): Future[js.Object] =
      service.setDataRetrievalPolicy(params).promise().toFuture
    @inline def setVaultAccessPolicyFuture(params: SetVaultAccessPolicyInput): Future[js.Object] =
      service.setVaultAccessPolicy(params).promise().toFuture
    @inline def setVaultNotificationsFuture(params: SetVaultNotificationsInput): Future[js.Object] =
      service.setVaultNotifications(params).promise().toFuture
    @inline def uploadArchiveFuture(params: UploadArchiveInput): Future[ArchiveCreationOutput] =
      service.uploadArchive(params).promise().toFuture
    @inline def uploadMultipartPartFuture(params: UploadMultipartPartInput): Future[UploadMultipartPartOutput] =
      service.uploadMultipartPart(params).promise().toFuture
  }
}

package glacier {
  @js.native
  @JSImport("aws-sdk", "Glacier")
  class Glacier() extends js.Object {
    def this(config: AWSConfig) = this()

    def abortMultipartUpload(params: AbortMultipartUploadInput): Request[js.Object]                        = js.native
    def abortVaultLock(params: AbortVaultLockInput): Request[js.Object]                                    = js.native
    def addTagsToVault(params: AddTagsToVaultInput): Request[js.Object]                                    = js.native
    def completeMultipartUpload(params: CompleteMultipartUploadInput): Request[ArchiveCreationOutput]      = js.native
    def completeVaultLock(params: CompleteVaultLockInput): Request[js.Object]                              = js.native
    def createVault(params: CreateVaultInput): Request[CreateVaultOutput]                                  = js.native
    def deleteArchive(params: DeleteArchiveInput): Request[js.Object]                                      = js.native
    def deleteVault(params: DeleteVaultInput): Request[js.Object]                                          = js.native
    def deleteVaultAccessPolicy(params: DeleteVaultAccessPolicyInput): Request[js.Object]                  = js.native
    def deleteVaultNotifications(params: DeleteVaultNotificationsInput): Request[js.Object]                = js.native
    def describeJob(params: DescribeJobInput): Request[GlacierJobDescription]                              = js.native
    def describeVault(params: DescribeVaultInput): Request[DescribeVaultOutput]                            = js.native
    def getDataRetrievalPolicy(params: GetDataRetrievalPolicyInput): Request[GetDataRetrievalPolicyOutput] = js.native
    def getJobOutput(params: GetJobOutputInput): Request[GetJobOutputOutput]                               = js.native
    def getVaultAccessPolicy(params: GetVaultAccessPolicyInput): Request[GetVaultAccessPolicyOutput]       = js.native
    def getVaultLock(params: GetVaultLockInput): Request[GetVaultLockOutput]                               = js.native
    def getVaultNotifications(params: GetVaultNotificationsInput): Request[GetVaultNotificationsOutput]    = js.native
    def initiateJob(params: InitiateJobInput): Request[InitiateJobOutput]                                  = js.native
    def initiateMultipartUpload(params: InitiateMultipartUploadInput): Request[InitiateMultipartUploadOutput] =
      js.native
    def initiateVaultLock(params: InitiateVaultLockInput): Request[InitiateVaultLockOutput]          = js.native
    def listJobs(params: ListJobsInput): Request[ListJobsOutput]                                     = js.native
    def listMultipartUploads(params: ListMultipartUploadsInput): Request[ListMultipartUploadsOutput] = js.native
    def listParts(params: ListPartsInput): Request[ListPartsOutput]                                  = js.native
    def listProvisionedCapacity(params: ListProvisionedCapacityInput): Request[ListProvisionedCapacityOutput] =
      js.native
    def listTagsForVault(params: ListTagsForVaultInput): Request[ListTagsForVaultOutput] = js.native
    def listVaults(params: ListVaultsInput): Request[ListVaultsOutput]                   = js.native
    def purchaseProvisionedCapacity(
        params: PurchaseProvisionedCapacityInput
    ): Request[PurchaseProvisionedCapacityOutput]                                                 = js.native
    def removeTagsFromVault(params: RemoveTagsFromVaultInput): Request[js.Object]                 = js.native
    def setDataRetrievalPolicy(params: SetDataRetrievalPolicyInput): Request[js.Object]           = js.native
    def setVaultAccessPolicy(params: SetVaultAccessPolicyInput): Request[js.Object]               = js.native
    def setVaultNotifications(params: SetVaultNotificationsInput): Request[js.Object]             = js.native
    def uploadArchive(params: UploadArchiveInput): Request[ArchiveCreationOutput]                 = js.native
    def uploadMultipartPart(params: UploadMultipartPartInput): Request[UploadMultipartPartOutput] = js.native
  }

  /**
    * Provides options to abort a multipart upload identified by the upload ID.
    *  For information about the underlying REST API, see [[https://docs.aws.amazon.com/amazonglacier/latest/dev/api-multipart-abort-upload.html|Abort Multipart Upload]]. For conceptual information, see [[https://docs.aws.amazon.com/amazonglacier/latest/dev/working-with-archives.html|Working with Archives in Amazon S3 Glacier]].
    */
  @js.native
  @Factory
  trait AbortMultipartUploadInput extends js.Object {
    var accountId: String
    var uploadId: String
    var vaultName: String
  }

  /**
    * The input values for <code>AbortVaultLock</code>.
    */
  @js.native
  @Factory
  trait AbortVaultLockInput extends js.Object {
    var accountId: String
    var vaultName: String
  }

  @js.native
  sealed trait ActionCode extends js.Any
  object ActionCode extends js.Object {
    val ArchiveRetrieval   = "ArchiveRetrieval".asInstanceOf[ActionCode]
    val InventoryRetrieval = "InventoryRetrieval".asInstanceOf[ActionCode]
    val Select             = "Select".asInstanceOf[ActionCode]

    val values = js.Object.freeze(js.Array(ArchiveRetrieval, InventoryRetrieval, Select))
  }

  /**
    * The input values for <code>AddTagsToVault</code>.
    */
  @js.native
  @Factory
  trait AddTagsToVaultInput extends js.Object {
    var accountId: String
    var vaultName: String
    var Tags: js.UndefOr[TagMap]
  }

  /**
    * Contains the Amazon S3 Glacier response to your request.
    *  For information about the underlying REST API, see [[https://docs.aws.amazon.com/amazonglacier/latest/dev/api-archive-post.html|Upload Archive]]. For conceptual information, see [[https://docs.aws.amazon.com/amazonglacier/latest/dev/working-with-archives.html|Working with Archives in Amazon S3 Glacier]].
    */
  @js.native
  @Factory
  trait ArchiveCreationOutput extends js.Object {
    var archiveId: js.UndefOr[String]
    var checksum: js.UndefOr[String]
    var location: js.UndefOr[String]
  }

  /**
    * Contains information about the comma-separated value (CSV) file to select from.
    */
  @js.native
  @Factory
  trait CSVInput extends js.Object {
    var Comments: js.UndefOr[String]
    var FieldDelimiter: js.UndefOr[String]
    var FileHeaderInfo: js.UndefOr[FileHeaderInfo]
    var QuoteCharacter: js.UndefOr[String]
    var QuoteEscapeCharacter: js.UndefOr[String]
    var RecordDelimiter: js.UndefOr[String]
  }

  /**
    * Contains information about the comma-separated value (CSV) file that the job results are stored in.
    */
  @js.native
  @Factory
  trait CSVOutput extends js.Object {
    var FieldDelimiter: js.UndefOr[String]
    var QuoteCharacter: js.UndefOr[String]
    var QuoteEscapeCharacter: js.UndefOr[String]
    var QuoteFields: js.UndefOr[QuoteFields]
    var RecordDelimiter: js.UndefOr[String]
  }

  @js.native
  sealed trait CannedACL extends js.Any
  object CannedACL extends js.Object {
    val `private`                   = "private".asInstanceOf[CannedACL]
    val `public-read`               = "public-read".asInstanceOf[CannedACL]
    val `public-read-write`         = "public-read-write".asInstanceOf[CannedACL]
    val `aws-exec-read`             = "aws-exec-read".asInstanceOf[CannedACL]
    val `authenticated-read`        = "authenticated-read".asInstanceOf[CannedACL]
    val `bucket-owner-read`         = "bucket-owner-read".asInstanceOf[CannedACL]
    val `bucket-owner-full-control` = "bucket-owner-full-control".asInstanceOf[CannedACL]

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
    * Provides options to complete a multipart upload operation. This informs Amazon Glacier that all the archive parts have been uploaded and Amazon S3 Glacier (Glacier) can now assemble the archive from the uploaded parts. After assembling and saving the archive to the vault, Glacier returns the URI path of the newly created archive resource.
    */
  @js.native
  @Factory
  trait CompleteMultipartUploadInput extends js.Object {
    var accountId: String
    var uploadId: String
    var vaultName: String
    var archiveSize: js.UndefOr[String]
    var checksum: js.UndefOr[String]
  }

  /**
    * The input values for <code>CompleteVaultLock</code>.
    */
  @js.native
  @Factory
  trait CompleteVaultLockInput extends js.Object {
    var accountId: String
    var lockId: String
    var vaultName: String
  }

  /**
    * Provides options to create a vault.
    */
  @js.native
  @Factory
  trait CreateVaultInput extends js.Object {
    var accountId: String
    var vaultName: String
  }

  /**
    * Contains the Amazon S3 Glacier response to your request.
    */
  @js.native
  @Factory
  trait CreateVaultOutput extends js.Object {
    var location: js.UndefOr[String]
  }

  /**
    * Data retrieval policy.
    */
  @js.native
  @Factory
  trait DataRetrievalPolicy extends js.Object {
    var Rules: js.UndefOr[DataRetrievalRulesList]
  }

  /**
    * Data retrieval policy rule.
    */
  @js.native
  @Factory
  trait DataRetrievalRule extends js.Object {
    var BytesPerHour: js.UndefOr[NullableLong]
    var Strategy: js.UndefOr[String]
  }

  /**
    * Provides options for deleting an archive from an Amazon S3 Glacier vault.
    */
  @js.native
  @Factory
  trait DeleteArchiveInput extends js.Object {
    var accountId: String
    var archiveId: String
    var vaultName: String
  }

  /**
    * DeleteVaultAccessPolicy input.
    */
  @js.native
  @Factory
  trait DeleteVaultAccessPolicyInput extends js.Object {
    var accountId: String
    var vaultName: String
  }

  /**
    * Provides options for deleting a vault from Amazon S3 Glacier.
    */
  @js.native
  @Factory
  trait DeleteVaultInput extends js.Object {
    var accountId: String
    var vaultName: String
  }

  /**
    * Provides options for deleting a vault notification configuration from an Amazon Glacier vault.
    */
  @js.native
  @Factory
  trait DeleteVaultNotificationsInput extends js.Object {
    var accountId: String
    var vaultName: String
  }

  /**
    * Provides options for retrieving a job description.
    */
  @js.native
  @Factory
  trait DescribeJobInput extends js.Object {
    var accountId: String
    var jobId: String
    var vaultName: String
  }

  /**
    * Provides options for retrieving metadata for a specific vault in Amazon Glacier.
    */
  @js.native
  @Factory
  trait DescribeVaultInput extends js.Object {
    var accountId: String
    var vaultName: String
  }

  /**
    * Contains the Amazon S3 Glacier response to your request.
    */
  @js.native
  @Factory
  trait DescribeVaultOutput extends js.Object {
    var CreationDate: js.UndefOr[String]
    var LastInventoryDate: js.UndefOr[String]
    var NumberOfArchives: js.UndefOr[Double]
    var SizeInBytes: js.UndefOr[Double]
    var VaultARN: js.UndefOr[String]
    var VaultName: js.UndefOr[String]
  }

  /**
    * Contains information about the encryption used to store the job results in Amazon S3.
    */
  @js.native
  @Factory
  trait Encryption extends js.Object {
    var EncryptionType: js.UndefOr[EncryptionType]
    var KMSContext: js.UndefOr[String]
    var KMSKeyId: js.UndefOr[String]
  }

  @js.native
  sealed trait EncryptionType extends js.Any
  object EncryptionType extends js.Object {
    val `aws:kms` = "aws:kms".asInstanceOf[EncryptionType]
    val AES256    = "AES256".asInstanceOf[EncryptionType]

    val values = js.Object.freeze(js.Array(`aws:kms`, AES256))
  }

  @js.native
  sealed trait ExpressionType extends js.Any
  object ExpressionType extends js.Object {
    val SQL = "SQL".asInstanceOf[ExpressionType]

    val values = js.Object.freeze(js.Array(SQL))
  }

  @js.native
  sealed trait FileHeaderInfo extends js.Any
  object FileHeaderInfo extends js.Object {
    val USE    = "USE".asInstanceOf[FileHeaderInfo]
    val IGNORE = "IGNORE".asInstanceOf[FileHeaderInfo]
    val NONE   = "NONE".asInstanceOf[FileHeaderInfo]

    val values = js.Object.freeze(js.Array(USE, IGNORE, NONE))
  }

  /**
    * Input for GetDataRetrievalPolicy.
    */
  @js.native
  @Factory
  trait GetDataRetrievalPolicyInput extends js.Object {
    var accountId: String
  }

  /**
    * Contains the Amazon S3 Glacier response to the <code>GetDataRetrievalPolicy</code> request.
    */
  @js.native
  @Factory
  trait GetDataRetrievalPolicyOutput extends js.Object {
    var Policy: js.UndefOr[DataRetrievalPolicy]
  }

  /**
    * Provides options for downloading output of an Amazon S3 Glacier job.
    */
  @js.native
  @Factory
  trait GetJobOutputInput extends js.Object {
    var accountId: String
    var jobId: String
    var vaultName: String
    var range: js.UndefOr[String]
  }

  /**
    * Contains the Amazon S3 Glacier response to your request.
    */
  @js.native
  @Factory
  trait GetJobOutputOutput extends js.Object {
    var acceptRanges: js.UndefOr[String]
    var archiveDescription: js.UndefOr[String]
    var body: js.UndefOr[Stream]
    var checksum: js.UndefOr[String]
    var contentRange: js.UndefOr[String]
    var contentType: js.UndefOr[String]
    var status: js.UndefOr[httpstatus]
  }

  /**
    * Input for GetVaultAccessPolicy.
    */
  @js.native
  @Factory
  trait GetVaultAccessPolicyInput extends js.Object {
    var accountId: String
    var vaultName: String
  }

  /**
    * Output for GetVaultAccessPolicy.
    */
  @js.native
  @Factory
  trait GetVaultAccessPolicyOutput extends js.Object {
    var policy: js.UndefOr[VaultAccessPolicy]
  }

  /**
    * The input values for <code>GetVaultLock</code>.
    */
  @js.native
  @Factory
  trait GetVaultLockInput extends js.Object {
    var accountId: String
    var vaultName: String
  }

  /**
    * Contains the Amazon S3 Glacier response to your request.
    */
  @js.native
  @Factory
  trait GetVaultLockOutput extends js.Object {
    var CreationDate: js.UndefOr[String]
    var ExpirationDate: js.UndefOr[String]
    var Policy: js.UndefOr[String]
    var State: js.UndefOr[String]
  }

  /**
    * Provides options for retrieving the notification configuration set on an Amazon Glacier vault.
    */
  @js.native
  @Factory
  trait GetVaultNotificationsInput extends js.Object {
    var accountId: String
    var vaultName: String
  }

  /**
    * Contains the Amazon S3 Glacier response to your request.
    */
  @js.native
  @Factory
  trait GetVaultNotificationsOutput extends js.Object {
    var vaultNotificationConfig: js.UndefOr[VaultNotificationConfig]
  }

  /**
    * Contains the description of an Amazon S3 Glacier job.
    */
  @js.native
  @Factory
  trait GlacierJobDescription extends js.Object {
    var Action: js.UndefOr[ActionCode]
    var ArchiveId: js.UndefOr[String]
    var ArchiveSHA256TreeHash: js.UndefOr[String]
    var ArchiveSizeInBytes: js.UndefOr[Size]
    var Completed: js.UndefOr[Boolean]
    var CompletionDate: js.UndefOr[String]
    var CreationDate: js.UndefOr[String]
    var InventoryRetrievalParameters: js.UndefOr[InventoryRetrievalJobDescription]
    var InventorySizeInBytes: js.UndefOr[Size]
    var JobDescription: js.UndefOr[String]
    var JobId: js.UndefOr[String]
    var JobOutputPath: js.UndefOr[String]
    var OutputLocation: js.UndefOr[OutputLocation]
    var RetrievalByteRange: js.UndefOr[String]
    var SHA256TreeHash: js.UndefOr[String]
    var SNSTopic: js.UndefOr[String]
    var SelectParameters: js.UndefOr[SelectParameters]
    var StatusCode: js.UndefOr[StatusCode]
    var StatusMessage: js.UndefOr[String]
    var Tier: js.UndefOr[String]
    var VaultARN: js.UndefOr[String]
  }

  /**
    * Contains information about a grant.
    */
  @js.native
  @Factory
  trait Grant extends js.Object {
    var Grantee: js.UndefOr[Grantee]
    var Permission: js.UndefOr[Permission]
  }

  /**
    * Contains information about the grantee.
    */
  @js.native
  @Factory
  trait Grantee extends js.Object {
    var Type: Type
    var DisplayName: js.UndefOr[String]
    var EmailAddress: js.UndefOr[String]
    var ID: js.UndefOr[String]
    var URI: js.UndefOr[String]
  }

  /**
    * Provides options for initiating an Amazon S3 Glacier job.
    */
  @js.native
  @Factory
  trait InitiateJobInput extends js.Object {
    var accountId: String
    var vaultName: String
    var jobParameters: js.UndefOr[JobParameters]
  }

  /**
    * Contains the Amazon S3 Glacier response to your request.
    */
  @js.native
  @Factory
  trait InitiateJobOutput extends js.Object {
    var jobId: js.UndefOr[String]
    var jobOutputPath: js.UndefOr[String]
    var location: js.UndefOr[String]
  }

  /**
    * Provides options for initiating a multipart upload to an Amazon S3 Glacier vault.
    */
  @js.native
  @Factory
  trait InitiateMultipartUploadInput extends js.Object {
    var accountId: String
    var vaultName: String
    var archiveDescription: js.UndefOr[String]
    var partSize: js.UndefOr[String]
  }

  /**
    * The Amazon S3 Glacier response to your request.
    */
  @js.native
  @Factory
  trait InitiateMultipartUploadOutput extends js.Object {
    var location: js.UndefOr[String]
    var uploadId: js.UndefOr[String]
  }

  /**
    * The input values for <code>InitiateVaultLock</code>.
    */
  @js.native
  @Factory
  trait InitiateVaultLockInput extends js.Object {
    var accountId: String
    var vaultName: String
    var policy: js.UndefOr[VaultLockPolicy]
  }

  /**
    * Contains the Amazon S3 Glacier response to your request.
    */
  @js.native
  @Factory
  trait InitiateVaultLockOutput extends js.Object {
    var lockId: js.UndefOr[String]
  }

  /**
    * Describes how the archive is serialized.
    */
  @js.native
  @Factory
  trait InputSerialization extends js.Object {
    var csv: js.UndefOr[CSVInput]
  }

  /**
    * Describes the options for a range inventory retrieval job.
    */
  @js.native
  @Factory
  trait InventoryRetrievalJobDescription extends js.Object {
    var EndDate: js.UndefOr[DateTime]
    var Format: js.UndefOr[String]
    var Limit: js.UndefOr[String]
    var Marker: js.UndefOr[String]
    var StartDate: js.UndefOr[DateTime]
  }

  /**
    * Provides options for specifying a range inventory retrieval job.
    */
  @js.native
  @Factory
  trait InventoryRetrievalJobInput extends js.Object {
    var EndDate: js.UndefOr[String]
    var Limit: js.UndefOr[String]
    var Marker: js.UndefOr[String]
    var StartDate: js.UndefOr[String]
  }

  /**
    * Provides options for defining a job.
    */
  @js.native
  @Factory
  trait JobParameters extends js.Object {
    var ArchiveId: js.UndefOr[String]
    var Description: js.UndefOr[String]
    var Format: js.UndefOr[String]
    var InventoryRetrievalParameters: js.UndefOr[InventoryRetrievalJobInput]
    var OutputLocation: js.UndefOr[OutputLocation]
    var RetrievalByteRange: js.UndefOr[String]
    var SNSTopic: js.UndefOr[String]
    var SelectParameters: js.UndefOr[SelectParameters]
    var Tier: js.UndefOr[String]
    var Type: js.UndefOr[String]
  }

  /**
    * Provides options for retrieving a job list for an Amazon S3 Glacier vault.
    */
  @js.native
  @Factory
  trait ListJobsInput extends js.Object {
    var accountId: String
    var vaultName: String
    var completed: js.UndefOr[String]
    var limit: js.UndefOr[String]
    var marker: js.UndefOr[String]
    var statuscode: js.UndefOr[String]
  }

  /**
    * Contains the Amazon S3 Glacier response to your request.
    */
  @js.native
  @Factory
  trait ListJobsOutput extends js.Object {
    var JobList: js.UndefOr[JobList]
    var Marker: js.UndefOr[String]
  }

  /**
    * Provides options for retrieving list of in-progress multipart uploads for an Amazon Glacier vault.
    */
  @js.native
  @Factory
  trait ListMultipartUploadsInput extends js.Object {
    var accountId: String
    var vaultName: String
    var limit: js.UndefOr[String]
    var marker: js.UndefOr[String]
  }

  /**
    * Contains the Amazon S3 Glacier response to your request.
    */
  @js.native
  @Factory
  trait ListMultipartUploadsOutput extends js.Object {
    var Marker: js.UndefOr[String]
    var UploadsList: js.UndefOr[UploadsList]
  }

  /**
    * Provides options for retrieving a list of parts of an archive that have been uploaded in a specific multipart upload.
    */
  @js.native
  @Factory
  trait ListPartsInput extends js.Object {
    var accountId: String
    var uploadId: String
    var vaultName: String
    var limit: js.UndefOr[String]
    var marker: js.UndefOr[String]
  }

  /**
    * Contains the Amazon S3 Glacier response to your request.
    */
  @js.native
  @Factory
  trait ListPartsOutput extends js.Object {
    var ArchiveDescription: js.UndefOr[String]
    var CreationDate: js.UndefOr[String]
    var Marker: js.UndefOr[String]
    var MultipartUploadId: js.UndefOr[String]
    var PartSizeInBytes: js.UndefOr[Double]
    var Parts: js.UndefOr[PartList]
    var VaultARN: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait ListProvisionedCapacityInput extends js.Object {
    var accountId: String
  }

  @js.native
  @Factory
  trait ListProvisionedCapacityOutput extends js.Object {
    var ProvisionedCapacityList: js.UndefOr[ProvisionedCapacityList]
  }

  /**
    * The input value for <code>ListTagsForVaultInput</code>.
    */
  @js.native
  @Factory
  trait ListTagsForVaultInput extends js.Object {
    var accountId: String
    var vaultName: String
  }

  /**
    * Contains the Amazon S3 Glacier response to your request.
    */
  @js.native
  @Factory
  trait ListTagsForVaultOutput extends js.Object {
    var Tags: js.UndefOr[TagMap]
  }

  /**
    * Provides options to retrieve the vault list owned by the calling user's account. The list provides metadata information for each vault.
    */
  @js.native
  @Factory
  trait ListVaultsInput extends js.Object {
    var accountId: String
    var limit: js.UndefOr[String]
    var marker: js.UndefOr[String]
  }

  /**
    * Contains the Amazon S3 Glacier response to your request.
    */
  @js.native
  @Factory
  trait ListVaultsOutput extends js.Object {
    var Marker: js.UndefOr[String]
    var VaultList: js.UndefOr[VaultList]
  }

  /**
    * Contains information about the location where the select job results are stored.
    */
  @js.native
  @Factory
  trait OutputLocation extends js.Object {
    var S3: js.UndefOr[S3Location]
  }

  /**
    * Describes how the select output is serialized.
    */
  @js.native
  @Factory
  trait OutputSerialization extends js.Object {
    var csv: js.UndefOr[CSVOutput]
  }

  /**
    * A list of the part sizes of the multipart upload.
    */
  @js.native
  @Factory
  trait PartListElement extends js.Object {
    var RangeInBytes: js.UndefOr[String]
    var SHA256TreeHash: js.UndefOr[String]
  }

  @js.native
  sealed trait Permission extends js.Any
  object Permission extends js.Object {
    val FULL_CONTROL = "FULL_CONTROL".asInstanceOf[Permission]
    val WRITE        = "WRITE".asInstanceOf[Permission]
    val WRITE_ACP    = "WRITE_ACP".asInstanceOf[Permission]
    val READ         = "READ".asInstanceOf[Permission]
    val READ_ACP     = "READ_ACP".asInstanceOf[Permission]

    val values = js.Object.freeze(js.Array(FULL_CONTROL, WRITE, WRITE_ACP, READ, READ_ACP))
  }

  /**
    * The definition for a provisioned capacity unit.
    */
  @js.native
  @Factory
  trait ProvisionedCapacityDescription extends js.Object {
    var CapacityId: js.UndefOr[String]
    var ExpirationDate: js.UndefOr[String]
    var StartDate: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait PurchaseProvisionedCapacityInput extends js.Object {
    var accountId: String
  }

  @js.native
  @Factory
  trait PurchaseProvisionedCapacityOutput extends js.Object {
    var capacityId: js.UndefOr[String]
  }

  @js.native
  sealed trait QuoteFields extends js.Any
  object QuoteFields extends js.Object {
    val ALWAYS   = "ALWAYS".asInstanceOf[QuoteFields]
    val ASNEEDED = "ASNEEDED".asInstanceOf[QuoteFields]

    val values = js.Object.freeze(js.Array(ALWAYS, ASNEEDED))
  }

  /**
    * The input value for <code>RemoveTagsFromVaultInput</code>.
    */
  @js.native
  @Factory
  trait RemoveTagsFromVaultInput extends js.Object {
    var accountId: String
    var vaultName: String
    var TagKeys: js.UndefOr[TagKeyList]
  }

  /**
    * Contains information about the location in Amazon S3 where the select job results are stored.
    */
  @js.native
  @Factory
  trait S3Location extends js.Object {
    var AccessControlList: js.UndefOr[AccessControlPolicyList]
    var BucketName: js.UndefOr[String]
    var CannedACL: js.UndefOr[CannedACL]
    var Encryption: js.UndefOr[Encryption]
    var Prefix: js.UndefOr[String]
    var StorageClass: js.UndefOr[StorageClass]
    var Tagging: js.UndefOr[hashmap]
    var UserMetadata: js.UndefOr[hashmap]
  }

  /**
    * Contains information about the parameters used for a select.
    */
  @js.native
  @Factory
  trait SelectParameters extends js.Object {
    var Expression: js.UndefOr[String]
    var ExpressionType: js.UndefOr[ExpressionType]
    var InputSerialization: js.UndefOr[InputSerialization]
    var OutputSerialization: js.UndefOr[OutputSerialization]
  }

  /**
    * SetDataRetrievalPolicy input.
    */
  @js.native
  @Factory
  trait SetDataRetrievalPolicyInput extends js.Object {
    var accountId: String
    var Policy: js.UndefOr[DataRetrievalPolicy]
  }

  /**
    * SetVaultAccessPolicy input.
    */
  @js.native
  @Factory
  trait SetVaultAccessPolicyInput extends js.Object {
    var accountId: String
    var vaultName: String
    var policy: js.UndefOr[VaultAccessPolicy]
  }

  /**
    * Provides options to configure notifications that will be sent when specific events happen to a vault.
    */
  @js.native
  @Factory
  trait SetVaultNotificationsInput extends js.Object {
    var accountId: String
    var vaultName: String
    var vaultNotificationConfig: js.UndefOr[VaultNotificationConfig]
  }

  @js.native
  sealed trait StatusCode extends js.Any
  object StatusCode extends js.Object {
    val InProgress = "InProgress".asInstanceOf[StatusCode]
    val Succeeded  = "Succeeded".asInstanceOf[StatusCode]
    val Failed     = "Failed".asInstanceOf[StatusCode]

    val values = js.Object.freeze(js.Array(InProgress, Succeeded, Failed))
  }

  @js.native
  sealed trait StorageClass extends js.Any
  object StorageClass extends js.Object {
    val STANDARD           = "STANDARD".asInstanceOf[StorageClass]
    val REDUCED_REDUNDANCY = "REDUCED_REDUNDANCY".asInstanceOf[StorageClass]
    val STANDARD_IA        = "STANDARD_IA".asInstanceOf[StorageClass]

    val values = js.Object.freeze(js.Array(STANDARD, REDUCED_REDUNDANCY, STANDARD_IA))
  }

  @js.native
  sealed trait Type extends js.Any
  object Type extends js.Object {
    val AmazonCustomerByEmail = "AmazonCustomerByEmail".asInstanceOf[Type]
    val CanonicalUser         = "CanonicalUser".asInstanceOf[Type]
    val Group                 = "Group".asInstanceOf[Type]

    val values = js.Object.freeze(js.Array(AmazonCustomerByEmail, CanonicalUser, Group))
  }

  /**
    * Provides options to add an archive to a vault.
    */
  @js.native
  @Factory
  trait UploadArchiveInput extends js.Object {
    var accountId: String
    var vaultName: String
    var archiveDescription: js.UndefOr[String]
    var body: js.UndefOr[Stream]
    var checksum: js.UndefOr[String]
  }

  /**
    * A list of in-progress multipart uploads for a vault.
    */
  @js.native
  @Factory
  trait UploadListElement extends js.Object {
    var ArchiveDescription: js.UndefOr[String]
    var CreationDate: js.UndefOr[String]
    var MultipartUploadId: js.UndefOr[String]
    var PartSizeInBytes: js.UndefOr[Double]
    var VaultARN: js.UndefOr[String]
  }

  /**
    * Provides options to upload a part of an archive in a multipart upload operation.
    */
  @js.native
  @Factory
  trait UploadMultipartPartInput extends js.Object {
    var accountId: String
    var uploadId: String
    var vaultName: String
    var body: js.UndefOr[Stream]
    var checksum: js.UndefOr[String]
    var range: js.UndefOr[String]
  }

  /**
    * Contains the Amazon S3 Glacier response to your request.
    */
  @js.native
  @Factory
  trait UploadMultipartPartOutput extends js.Object {
    var checksum: js.UndefOr[String]
  }

  /**
    * Contains the vault access policy.
    */
  @js.native
  @Factory
  trait VaultAccessPolicy extends js.Object {
    var Policy: js.UndefOr[String]
  }

  /**
    * Contains the vault lock policy.
    */
  @js.native
  @Factory
  trait VaultLockPolicy extends js.Object {
    var Policy: js.UndefOr[String]
  }

  /**
    * Represents a vault's notification configuration.
    */
  @js.native
  @Factory
  trait VaultNotificationConfig extends js.Object {
    var Events: js.UndefOr[NotificationEventList]
    var SNSTopic: js.UndefOr[String]
  }
}
