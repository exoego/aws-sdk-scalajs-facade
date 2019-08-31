package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import io.scalajs.nodejs
import facade.amazonaws._

package object glacier {
  type AccessControlPolicyList = js.Array[Grant]
  type ActionCode              = String
  type CannedACL               = String
  type DataRetrievalRulesList  = js.Array[DataRetrievalRule]
  type DateTime                = String
  type EncryptionType          = String
  type ExpressionType          = String
  type FileHeaderInfo          = String
  type JobList                 = js.Array[GlacierJobDescription]
  type NotificationEventList   = js.Array[String]
  type NullableLong            = Double
  type PartList                = js.Array[PartListElement]
  type Permission              = String
  type ProvisionedCapacityList = js.Array[ProvisionedCapacityDescription]
  type QuoteFields             = String
  type Size                    = Double
  type StatusCode              = String
  type StorageClass            = String
  type Stream                  = nodejs.buffer.Buffer | nodejs.stream.Readable | js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type TagKey                  = String
  type TagKeyList              = js.Array[String]
  type TagMap                  = js.Dictionary[TagValue]
  type TagValue                = String
  type Type                    = String
  type UploadsList             = js.Array[UploadListElement]
  type VaultList               = js.Array[DescribeVaultOutput]
  type hashmap                 = js.Dictionary[String]
  type httpstatus              = Int

  implicit final class GlacierOps(private val service: Glacier) extends AnyVal {

    def abortMultipartUploadFuture(params: AbortMultipartUploadInput): Future[js.Object] =
      service.abortMultipartUpload(params).promise.toFuture
    def abortVaultLockFuture(params: AbortVaultLockInput): Future[js.Object] =
      service.abortVaultLock(params).promise.toFuture
    def addTagsToVaultFuture(params: AddTagsToVaultInput): Future[js.Object] =
      service.addTagsToVault(params).promise.toFuture
    def completeMultipartUploadFuture(params: CompleteMultipartUploadInput): Future[ArchiveCreationOutput] =
      service.completeMultipartUpload(params).promise.toFuture
    def completeVaultLockFuture(params: CompleteVaultLockInput): Future[js.Object] =
      service.completeVaultLock(params).promise.toFuture
    def createVaultFuture(params: CreateVaultInput): Future[CreateVaultOutput] =
      service.createVault(params).promise.toFuture
    def deleteArchiveFuture(params: DeleteArchiveInput): Future[js.Object] =
      service.deleteArchive(params).promise.toFuture
    def deleteVaultAccessPolicyFuture(params: DeleteVaultAccessPolicyInput): Future[js.Object] =
      service.deleteVaultAccessPolicy(params).promise.toFuture
    def deleteVaultFuture(params: DeleteVaultInput): Future[js.Object] = service.deleteVault(params).promise.toFuture
    def deleteVaultNotificationsFuture(params: DeleteVaultNotificationsInput): Future[js.Object] =
      service.deleteVaultNotifications(params).promise.toFuture
    def describeJobFuture(params: DescribeJobInput): Future[GlacierJobDescription] =
      service.describeJob(params).promise.toFuture
    def describeVaultFuture(params: DescribeVaultInput): Future[DescribeVaultOutput] =
      service.describeVault(params).promise.toFuture
    def getDataRetrievalPolicyFuture(params: GetDataRetrievalPolicyInput): Future[GetDataRetrievalPolicyOutput] =
      service.getDataRetrievalPolicy(params).promise.toFuture
    def getJobOutputFuture(params: GetJobOutputInput): Future[GetJobOutputOutput] =
      service.getJobOutput(params).promise.toFuture
    def getVaultAccessPolicyFuture(params: GetVaultAccessPolicyInput): Future[GetVaultAccessPolicyOutput] =
      service.getVaultAccessPolicy(params).promise.toFuture
    def getVaultLockFuture(params: GetVaultLockInput): Future[GetVaultLockOutput] =
      service.getVaultLock(params).promise.toFuture
    def getVaultNotificationsFuture(params: GetVaultNotificationsInput): Future[GetVaultNotificationsOutput] =
      service.getVaultNotifications(params).promise.toFuture
    def initiateJobFuture(params: InitiateJobInput): Future[InitiateJobOutput] =
      service.initiateJob(params).promise.toFuture
    def initiateMultipartUploadFuture(params: InitiateMultipartUploadInput): Future[InitiateMultipartUploadOutput] =
      service.initiateMultipartUpload(params).promise.toFuture
    def initiateVaultLockFuture(params: InitiateVaultLockInput): Future[InitiateVaultLockOutput] =
      service.initiateVaultLock(params).promise.toFuture
    def listJobsFuture(params: ListJobsInput): Future[ListJobsOutput] = service.listJobs(params).promise.toFuture
    def listMultipartUploadsFuture(params: ListMultipartUploadsInput): Future[ListMultipartUploadsOutput] =
      service.listMultipartUploads(params).promise.toFuture
    def listPartsFuture(params: ListPartsInput): Future[ListPartsOutput] = service.listParts(params).promise.toFuture
    def listProvisionedCapacityFuture(params: ListProvisionedCapacityInput): Future[ListProvisionedCapacityOutput] =
      service.listProvisionedCapacity(params).promise.toFuture
    def listTagsForVaultFuture(params: ListTagsForVaultInput): Future[ListTagsForVaultOutput] =
      service.listTagsForVault(params).promise.toFuture
    def listVaultsFuture(params: ListVaultsInput): Future[ListVaultsOutput] =
      service.listVaults(params).promise.toFuture
    def purchaseProvisionedCapacityFuture(
        params: PurchaseProvisionedCapacityInput
    ): Future[PurchaseProvisionedCapacityOutput] = service.purchaseProvisionedCapacity(params).promise.toFuture
    def removeTagsFromVaultFuture(params: RemoveTagsFromVaultInput): Future[js.Object] =
      service.removeTagsFromVault(params).promise.toFuture
    def setDataRetrievalPolicyFuture(params: SetDataRetrievalPolicyInput): Future[js.Object] =
      service.setDataRetrievalPolicy(params).promise.toFuture
    def setVaultAccessPolicyFuture(params: SetVaultAccessPolicyInput): Future[js.Object] =
      service.setVaultAccessPolicy(params).promise.toFuture
    def setVaultNotificationsFuture(params: SetVaultNotificationsInput): Future[js.Object] =
      service.setVaultNotifications(params).promise.toFuture
    def uploadArchiveFuture(params: UploadArchiveInput): Future[ArchiveCreationOutput] =
      service.uploadArchive(params).promise.toFuture
    def uploadMultipartPartFuture(params: UploadMultipartPartInput): Future[UploadMultipartPartOutput] =
      service.uploadMultipartPart(params).promise.toFuture
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
  trait AbortMultipartUploadInput extends js.Object {
    var accountId: String
    var uploadId: String
    var vaultName: String
  }

  object AbortMultipartUploadInput {
    @inline
    def apply(
        accountId: String,
        uploadId: String,
        vaultName: String
    ): AbortMultipartUploadInput = {
      val __obj = js.Dynamic.literal(
        "accountId" -> accountId.asInstanceOf[js.Any],
        "uploadId"  -> uploadId.asInstanceOf[js.Any],
        "vaultName" -> vaultName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[AbortMultipartUploadInput]
    }
  }

  /**
    * The input values for <code>AbortVaultLock</code>.
    */
  @js.native
  trait AbortVaultLockInput extends js.Object {
    var accountId: String
    var vaultName: String
  }

  object AbortVaultLockInput {
    @inline
    def apply(
        accountId: String,
        vaultName: String
    ): AbortVaultLockInput = {
      val __obj = js.Dynamic.literal(
        "accountId" -> accountId.asInstanceOf[js.Any],
        "vaultName" -> vaultName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[AbortVaultLockInput]
    }
  }

  object ActionCodeEnum {
    val ArchiveRetrieval   = "ArchiveRetrieval"
    val InventoryRetrieval = "InventoryRetrieval"
    val Select             = "Select"

    val values = js.Object.freeze(js.Array(ArchiveRetrieval, InventoryRetrieval, Select))
  }

  /**
    * The input values for <code>AddTagsToVault</code>.
    */
  @js.native
  trait AddTagsToVaultInput extends js.Object {
    var accountId: String
    var vaultName: String
    var Tags: js.UndefOr[TagMap]
  }

  object AddTagsToVaultInput {
    @inline
    def apply(
        accountId: String,
        vaultName: String,
        Tags: js.UndefOr[TagMap] = js.undefined
    ): AddTagsToVaultInput = {
      val __obj = js.Dynamic.literal(
        "accountId" -> accountId.asInstanceOf[js.Any],
        "vaultName" -> vaultName.asInstanceOf[js.Any]
      )

      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AddTagsToVaultInput]
    }
  }

  /**
    * Contains the Amazon S3 Glacier response to your request.
    *  For information about the underlying REST API, see [[https://docs.aws.amazon.com/amazonglacier/latest/dev/api-archive-post.html|Upload Archive]]. For conceptual information, see [[https://docs.aws.amazon.com/amazonglacier/latest/dev/working-with-archives.html|Working with Archives in Amazon S3 Glacier]].
    */
  @js.native
  trait ArchiveCreationOutput extends js.Object {
    var archiveId: js.UndefOr[String]
    var checksum: js.UndefOr[String]
    var location: js.UndefOr[String]
  }

  object ArchiveCreationOutput {
    @inline
    def apply(
        archiveId: js.UndefOr[String] = js.undefined,
        checksum: js.UndefOr[String] = js.undefined,
        location: js.UndefOr[String] = js.undefined
    ): ArchiveCreationOutput = {
      val __obj = js.Dynamic.literal()
      archiveId.foreach(__v => __obj.updateDynamic("archiveId")(__v.asInstanceOf[js.Any]))
      checksum.foreach(__v => __obj.updateDynamic("checksum")(__v.asInstanceOf[js.Any]))
      location.foreach(__v => __obj.updateDynamic("location")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ArchiveCreationOutput]
    }
  }

  /**
    * Contains information about the comma-separated value (CSV) file to select from.
    */
  @js.native
  trait CSVInput extends js.Object {
    var Comments: js.UndefOr[String]
    var FieldDelimiter: js.UndefOr[String]
    var FileHeaderInfo: js.UndefOr[FileHeaderInfo]
    var QuoteCharacter: js.UndefOr[String]
    var QuoteEscapeCharacter: js.UndefOr[String]
    var RecordDelimiter: js.UndefOr[String]
  }

  object CSVInput {
    @inline
    def apply(
        Comments: js.UndefOr[String] = js.undefined,
        FieldDelimiter: js.UndefOr[String] = js.undefined,
        FileHeaderInfo: js.UndefOr[FileHeaderInfo] = js.undefined,
        QuoteCharacter: js.UndefOr[String] = js.undefined,
        QuoteEscapeCharacter: js.UndefOr[String] = js.undefined,
        RecordDelimiter: js.UndefOr[String] = js.undefined
    ): CSVInput = {
      val __obj = js.Dynamic.literal()
      Comments.foreach(__v => __obj.updateDynamic("Comments")(__v.asInstanceOf[js.Any]))
      FieldDelimiter.foreach(__v => __obj.updateDynamic("FieldDelimiter")(__v.asInstanceOf[js.Any]))
      FileHeaderInfo.foreach(__v => __obj.updateDynamic("FileHeaderInfo")(__v.asInstanceOf[js.Any]))
      QuoteCharacter.foreach(__v => __obj.updateDynamic("QuoteCharacter")(__v.asInstanceOf[js.Any]))
      QuoteEscapeCharacter.foreach(__v => __obj.updateDynamic("QuoteEscapeCharacter")(__v.asInstanceOf[js.Any]))
      RecordDelimiter.foreach(__v => __obj.updateDynamic("RecordDelimiter")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CSVInput]
    }
  }

  /**
    * Contains information about the comma-separated value (CSV) file that the job results are stored in.
    */
  @js.native
  trait CSVOutput extends js.Object {
    var FieldDelimiter: js.UndefOr[String]
    var QuoteCharacter: js.UndefOr[String]
    var QuoteEscapeCharacter: js.UndefOr[String]
    var QuoteFields: js.UndefOr[QuoteFields]
    var RecordDelimiter: js.UndefOr[String]
  }

  object CSVOutput {
    @inline
    def apply(
        FieldDelimiter: js.UndefOr[String] = js.undefined,
        QuoteCharacter: js.UndefOr[String] = js.undefined,
        QuoteEscapeCharacter: js.UndefOr[String] = js.undefined,
        QuoteFields: js.UndefOr[QuoteFields] = js.undefined,
        RecordDelimiter: js.UndefOr[String] = js.undefined
    ): CSVOutput = {
      val __obj = js.Dynamic.literal()
      FieldDelimiter.foreach(__v => __obj.updateDynamic("FieldDelimiter")(__v.asInstanceOf[js.Any]))
      QuoteCharacter.foreach(__v => __obj.updateDynamic("QuoteCharacter")(__v.asInstanceOf[js.Any]))
      QuoteEscapeCharacter.foreach(__v => __obj.updateDynamic("QuoteEscapeCharacter")(__v.asInstanceOf[js.Any]))
      QuoteFields.foreach(__v => __obj.updateDynamic("QuoteFields")(__v.asInstanceOf[js.Any]))
      RecordDelimiter.foreach(__v => __obj.updateDynamic("RecordDelimiter")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CSVOutput]
    }
  }

  object CannedACLEnum {
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
    * Provides options to complete a multipart upload operation. This informs Amazon Glacier that all the archive parts have been uploaded and Amazon S3 Glacier (Glacier) can now assemble the archive from the uploaded parts. After assembling and saving the archive to the vault, Glacier returns the URI path of the newly created archive resource.
    */
  @js.native
  trait CompleteMultipartUploadInput extends js.Object {
    var accountId: String
    var uploadId: String
    var vaultName: String
    var archiveSize: js.UndefOr[String]
    var checksum: js.UndefOr[String]
  }

  object CompleteMultipartUploadInput {
    @inline
    def apply(
        accountId: String,
        uploadId: String,
        vaultName: String,
        archiveSize: js.UndefOr[String] = js.undefined,
        checksum: js.UndefOr[String] = js.undefined
    ): CompleteMultipartUploadInput = {
      val __obj = js.Dynamic.literal(
        "accountId" -> accountId.asInstanceOf[js.Any],
        "uploadId"  -> uploadId.asInstanceOf[js.Any],
        "vaultName" -> vaultName.asInstanceOf[js.Any]
      )

      archiveSize.foreach(__v => __obj.updateDynamic("archiveSize")(__v.asInstanceOf[js.Any]))
      checksum.foreach(__v => __obj.updateDynamic("checksum")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CompleteMultipartUploadInput]
    }
  }

  /**
    * The input values for <code>CompleteVaultLock</code>.
    */
  @js.native
  trait CompleteVaultLockInput extends js.Object {
    var accountId: String
    var lockId: String
    var vaultName: String
  }

  object CompleteVaultLockInput {
    @inline
    def apply(
        accountId: String,
        lockId: String,
        vaultName: String
    ): CompleteVaultLockInput = {
      val __obj = js.Dynamic.literal(
        "accountId" -> accountId.asInstanceOf[js.Any],
        "lockId"    -> lockId.asInstanceOf[js.Any],
        "vaultName" -> vaultName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CompleteVaultLockInput]
    }
  }

  /**
    * Provides options to create a vault.
    */
  @js.native
  trait CreateVaultInput extends js.Object {
    var accountId: String
    var vaultName: String
  }

  object CreateVaultInput {
    @inline
    def apply(
        accountId: String,
        vaultName: String
    ): CreateVaultInput = {
      val __obj = js.Dynamic.literal(
        "accountId" -> accountId.asInstanceOf[js.Any],
        "vaultName" -> vaultName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateVaultInput]
    }
  }

  /**
    * Contains the Amazon S3 Glacier response to your request.
    */
  @js.native
  trait CreateVaultOutput extends js.Object {
    var location: js.UndefOr[String]
  }

  object CreateVaultOutput {
    @inline
    def apply(
        location: js.UndefOr[String] = js.undefined
    ): CreateVaultOutput = {
      val __obj = js.Dynamic.literal()
      location.foreach(__v => __obj.updateDynamic("location")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateVaultOutput]
    }
  }

  /**
    * Data retrieval policy.
    */
  @js.native
  trait DataRetrievalPolicy extends js.Object {
    var Rules: js.UndefOr[DataRetrievalRulesList]
  }

  object DataRetrievalPolicy {
    @inline
    def apply(
        Rules: js.UndefOr[DataRetrievalRulesList] = js.undefined
    ): DataRetrievalPolicy = {
      val __obj = js.Dynamic.literal()
      Rules.foreach(__v => __obj.updateDynamic("Rules")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DataRetrievalPolicy]
    }
  }

  /**
    * Data retrieval policy rule.
    */
  @js.native
  trait DataRetrievalRule extends js.Object {
    var BytesPerHour: js.UndefOr[NullableLong]
    var Strategy: js.UndefOr[String]
  }

  object DataRetrievalRule {
    @inline
    def apply(
        BytesPerHour: js.UndefOr[NullableLong] = js.undefined,
        Strategy: js.UndefOr[String] = js.undefined
    ): DataRetrievalRule = {
      val __obj = js.Dynamic.literal()
      BytesPerHour.foreach(__v => __obj.updateDynamic("BytesPerHour")(__v.asInstanceOf[js.Any]))
      Strategy.foreach(__v => __obj.updateDynamic("Strategy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DataRetrievalRule]
    }
  }

  /**
    * Provides options for deleting an archive from an Amazon S3 Glacier vault.
    */
  @js.native
  trait DeleteArchiveInput extends js.Object {
    var accountId: String
    var archiveId: String
    var vaultName: String
  }

  object DeleteArchiveInput {
    @inline
    def apply(
        accountId: String,
        archiveId: String,
        vaultName: String
    ): DeleteArchiveInput = {
      val __obj = js.Dynamic.literal(
        "accountId" -> accountId.asInstanceOf[js.Any],
        "archiveId" -> archiveId.asInstanceOf[js.Any],
        "vaultName" -> vaultName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteArchiveInput]
    }
  }

  /**
    * DeleteVaultAccessPolicy input.
    */
  @js.native
  trait DeleteVaultAccessPolicyInput extends js.Object {
    var accountId: String
    var vaultName: String
  }

  object DeleteVaultAccessPolicyInput {
    @inline
    def apply(
        accountId: String,
        vaultName: String
    ): DeleteVaultAccessPolicyInput = {
      val __obj = js.Dynamic.literal(
        "accountId" -> accountId.asInstanceOf[js.Any],
        "vaultName" -> vaultName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteVaultAccessPolicyInput]
    }
  }

  /**
    * Provides options for deleting a vault from Amazon S3 Glacier.
    */
  @js.native
  trait DeleteVaultInput extends js.Object {
    var accountId: String
    var vaultName: String
  }

  object DeleteVaultInput {
    @inline
    def apply(
        accountId: String,
        vaultName: String
    ): DeleteVaultInput = {
      val __obj = js.Dynamic.literal(
        "accountId" -> accountId.asInstanceOf[js.Any],
        "vaultName" -> vaultName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteVaultInput]
    }
  }

  /**
    * Provides options for deleting a vault notification configuration from an Amazon Glacier vault.
    */
  @js.native
  trait DeleteVaultNotificationsInput extends js.Object {
    var accountId: String
    var vaultName: String
  }

  object DeleteVaultNotificationsInput {
    @inline
    def apply(
        accountId: String,
        vaultName: String
    ): DeleteVaultNotificationsInput = {
      val __obj = js.Dynamic.literal(
        "accountId" -> accountId.asInstanceOf[js.Any],
        "vaultName" -> vaultName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteVaultNotificationsInput]
    }
  }

  /**
    * Provides options for retrieving a job description.
    */
  @js.native
  trait DescribeJobInput extends js.Object {
    var accountId: String
    var jobId: String
    var vaultName: String
  }

  object DescribeJobInput {
    @inline
    def apply(
        accountId: String,
        jobId: String,
        vaultName: String
    ): DescribeJobInput = {
      val __obj = js.Dynamic.literal(
        "accountId" -> accountId.asInstanceOf[js.Any],
        "jobId"     -> jobId.asInstanceOf[js.Any],
        "vaultName" -> vaultName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeJobInput]
    }
  }

  /**
    * Provides options for retrieving metadata for a specific vault in Amazon Glacier.
    */
  @js.native
  trait DescribeVaultInput extends js.Object {
    var accountId: String
    var vaultName: String
  }

  object DescribeVaultInput {
    @inline
    def apply(
        accountId: String,
        vaultName: String
    ): DescribeVaultInput = {
      val __obj = js.Dynamic.literal(
        "accountId" -> accountId.asInstanceOf[js.Any],
        "vaultName" -> vaultName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeVaultInput]
    }
  }

  /**
    * Contains the Amazon S3 Glacier response to your request.
    */
  @js.native
  trait DescribeVaultOutput extends js.Object {
    var CreationDate: js.UndefOr[String]
    var LastInventoryDate: js.UndefOr[String]
    var NumberOfArchives: js.UndefOr[Double]
    var SizeInBytes: js.UndefOr[Double]
    var VaultARN: js.UndefOr[String]
    var VaultName: js.UndefOr[String]
  }

  object DescribeVaultOutput {
    @inline
    def apply(
        CreationDate: js.UndefOr[String] = js.undefined,
        LastInventoryDate: js.UndefOr[String] = js.undefined,
        NumberOfArchives: js.UndefOr[Double] = js.undefined,
        SizeInBytes: js.UndefOr[Double] = js.undefined,
        VaultARN: js.UndefOr[String] = js.undefined,
        VaultName: js.UndefOr[String] = js.undefined
    ): DescribeVaultOutput = {
      val __obj = js.Dynamic.literal()
      CreationDate.foreach(__v => __obj.updateDynamic("CreationDate")(__v.asInstanceOf[js.Any]))
      LastInventoryDate.foreach(__v => __obj.updateDynamic("LastInventoryDate")(__v.asInstanceOf[js.Any]))
      NumberOfArchives.foreach(__v => __obj.updateDynamic("NumberOfArchives")(__v.asInstanceOf[js.Any]))
      SizeInBytes.foreach(__v => __obj.updateDynamic("SizeInBytes")(__v.asInstanceOf[js.Any]))
      VaultARN.foreach(__v => __obj.updateDynamic("VaultARN")(__v.asInstanceOf[js.Any]))
      VaultName.foreach(__v => __obj.updateDynamic("VaultName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeVaultOutput]
    }
  }

  /**
    * Contains information about the encryption used to store the job results in Amazon S3.
    */
  @js.native
  trait Encryption extends js.Object {
    var EncryptionType: js.UndefOr[EncryptionType]
    var KMSContext: js.UndefOr[String]
    var KMSKeyId: js.UndefOr[String]
  }

  object Encryption {
    @inline
    def apply(
        EncryptionType: js.UndefOr[EncryptionType] = js.undefined,
        KMSContext: js.UndefOr[String] = js.undefined,
        KMSKeyId: js.UndefOr[String] = js.undefined
    ): Encryption = {
      val __obj = js.Dynamic.literal()
      EncryptionType.foreach(__v => __obj.updateDynamic("EncryptionType")(__v.asInstanceOf[js.Any]))
      KMSContext.foreach(__v => __obj.updateDynamic("KMSContext")(__v.asInstanceOf[js.Any]))
      KMSKeyId.foreach(__v => __obj.updateDynamic("KMSKeyId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Encryption]
    }
  }

  object EncryptionTypeEnum {
    val `aws:kms` = "aws:kms"
    val AES256    = "AES256"

    val values = js.Object.freeze(js.Array(`aws:kms`, AES256))
  }

  object ExpressionTypeEnum {
    val SQL = "SQL"

    val values = js.Object.freeze(js.Array(SQL))
  }

  object FileHeaderInfoEnum {
    val USE    = "USE"
    val IGNORE = "IGNORE"
    val NONE   = "NONE"

    val values = js.Object.freeze(js.Array(USE, IGNORE, NONE))
  }

  /**
    * Input for GetDataRetrievalPolicy.
    */
  @js.native
  trait GetDataRetrievalPolicyInput extends js.Object {
    var accountId: String
  }

  object GetDataRetrievalPolicyInput {
    @inline
    def apply(
        accountId: String
    ): GetDataRetrievalPolicyInput = {
      val __obj = js.Dynamic.literal(
        "accountId" -> accountId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetDataRetrievalPolicyInput]
    }
  }

  /**
    * Contains the Amazon S3 Glacier response to the <code>GetDataRetrievalPolicy</code> request.
    */
  @js.native
  trait GetDataRetrievalPolicyOutput extends js.Object {
    var Policy: js.UndefOr[DataRetrievalPolicy]
  }

  object GetDataRetrievalPolicyOutput {
    @inline
    def apply(
        Policy: js.UndefOr[DataRetrievalPolicy] = js.undefined
    ): GetDataRetrievalPolicyOutput = {
      val __obj = js.Dynamic.literal()
      Policy.foreach(__v => __obj.updateDynamic("Policy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDataRetrievalPolicyOutput]
    }
  }

  /**
    * Provides options for downloading output of an Amazon S3 Glacier job.
    */
  @js.native
  trait GetJobOutputInput extends js.Object {
    var accountId: String
    var jobId: String
    var vaultName: String
    var range: js.UndefOr[String]
  }

  object GetJobOutputInput {
    @inline
    def apply(
        accountId: String,
        jobId: String,
        vaultName: String,
        range: js.UndefOr[String] = js.undefined
    ): GetJobOutputInput = {
      val __obj = js.Dynamic.literal(
        "accountId" -> accountId.asInstanceOf[js.Any],
        "jobId"     -> jobId.asInstanceOf[js.Any],
        "vaultName" -> vaultName.asInstanceOf[js.Any]
      )

      range.foreach(__v => __obj.updateDynamic("range")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetJobOutputInput]
    }
  }

  /**
    * Contains the Amazon S3 Glacier response to your request.
    */
  @js.native
  trait GetJobOutputOutput extends js.Object {
    var acceptRanges: js.UndefOr[String]
    var archiveDescription: js.UndefOr[String]
    var body: js.UndefOr[Stream]
    var checksum: js.UndefOr[String]
    var contentRange: js.UndefOr[String]
    var contentType: js.UndefOr[String]
    var status: js.UndefOr[httpstatus]
  }

  object GetJobOutputOutput {
    @inline
    def apply(
        acceptRanges: js.UndefOr[String] = js.undefined,
        archiveDescription: js.UndefOr[String] = js.undefined,
        body: js.UndefOr[Stream] = js.undefined,
        checksum: js.UndefOr[String] = js.undefined,
        contentRange: js.UndefOr[String] = js.undefined,
        contentType: js.UndefOr[String] = js.undefined,
        status: js.UndefOr[httpstatus] = js.undefined
    ): GetJobOutputOutput = {
      val __obj = js.Dynamic.literal()
      acceptRanges.foreach(__v => __obj.updateDynamic("acceptRanges")(__v.asInstanceOf[js.Any]))
      archiveDescription.foreach(__v => __obj.updateDynamic("archiveDescription")(__v.asInstanceOf[js.Any]))
      body.foreach(__v => __obj.updateDynamic("body")(__v.asInstanceOf[js.Any]))
      checksum.foreach(__v => __obj.updateDynamic("checksum")(__v.asInstanceOf[js.Any]))
      contentRange.foreach(__v => __obj.updateDynamic("contentRange")(__v.asInstanceOf[js.Any]))
      contentType.foreach(__v => __obj.updateDynamic("contentType")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetJobOutputOutput]
    }
  }

  /**
    * Input for GetVaultAccessPolicy.
    */
  @js.native
  trait GetVaultAccessPolicyInput extends js.Object {
    var accountId: String
    var vaultName: String
  }

  object GetVaultAccessPolicyInput {
    @inline
    def apply(
        accountId: String,
        vaultName: String
    ): GetVaultAccessPolicyInput = {
      val __obj = js.Dynamic.literal(
        "accountId" -> accountId.asInstanceOf[js.Any],
        "vaultName" -> vaultName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetVaultAccessPolicyInput]
    }
  }

  /**
    * Output for GetVaultAccessPolicy.
    */
  @js.native
  trait GetVaultAccessPolicyOutput extends js.Object {
    var policy: js.UndefOr[VaultAccessPolicy]
  }

  object GetVaultAccessPolicyOutput {
    @inline
    def apply(
        policy: js.UndefOr[VaultAccessPolicy] = js.undefined
    ): GetVaultAccessPolicyOutput = {
      val __obj = js.Dynamic.literal()
      policy.foreach(__v => __obj.updateDynamic("policy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetVaultAccessPolicyOutput]
    }
  }

  /**
    * The input values for <code>GetVaultLock</code>.
    */
  @js.native
  trait GetVaultLockInput extends js.Object {
    var accountId: String
    var vaultName: String
  }

  object GetVaultLockInput {
    @inline
    def apply(
        accountId: String,
        vaultName: String
    ): GetVaultLockInput = {
      val __obj = js.Dynamic.literal(
        "accountId" -> accountId.asInstanceOf[js.Any],
        "vaultName" -> vaultName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetVaultLockInput]
    }
  }

  /**
    * Contains the Amazon S3 Glacier response to your request.
    */
  @js.native
  trait GetVaultLockOutput extends js.Object {
    var CreationDate: js.UndefOr[String]
    var ExpirationDate: js.UndefOr[String]
    var Policy: js.UndefOr[String]
    var State: js.UndefOr[String]
  }

  object GetVaultLockOutput {
    @inline
    def apply(
        CreationDate: js.UndefOr[String] = js.undefined,
        ExpirationDate: js.UndefOr[String] = js.undefined,
        Policy: js.UndefOr[String] = js.undefined,
        State: js.UndefOr[String] = js.undefined
    ): GetVaultLockOutput = {
      val __obj = js.Dynamic.literal()
      CreationDate.foreach(__v => __obj.updateDynamic("CreationDate")(__v.asInstanceOf[js.Any]))
      ExpirationDate.foreach(__v => __obj.updateDynamic("ExpirationDate")(__v.asInstanceOf[js.Any]))
      Policy.foreach(__v => __obj.updateDynamic("Policy")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetVaultLockOutput]
    }
  }

  /**
    * Provides options for retrieving the notification configuration set on an Amazon Glacier vault.
    */
  @js.native
  trait GetVaultNotificationsInput extends js.Object {
    var accountId: String
    var vaultName: String
  }

  object GetVaultNotificationsInput {
    @inline
    def apply(
        accountId: String,
        vaultName: String
    ): GetVaultNotificationsInput = {
      val __obj = js.Dynamic.literal(
        "accountId" -> accountId.asInstanceOf[js.Any],
        "vaultName" -> vaultName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetVaultNotificationsInput]
    }
  }

  /**
    * Contains the Amazon S3 Glacier response to your request.
    */
  @js.native
  trait GetVaultNotificationsOutput extends js.Object {
    var vaultNotificationConfig: js.UndefOr[VaultNotificationConfig]
  }

  object GetVaultNotificationsOutput {
    @inline
    def apply(
        vaultNotificationConfig: js.UndefOr[VaultNotificationConfig] = js.undefined
    ): GetVaultNotificationsOutput = {
      val __obj = js.Dynamic.literal()
      vaultNotificationConfig.foreach(__v => __obj.updateDynamic("vaultNotificationConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetVaultNotificationsOutput]
    }
  }

  /**
    * Contains the description of an Amazon S3 Glacier job.
    */
  @js.native
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

  object GlacierJobDescription {
    @inline
    def apply(
        Action: js.UndefOr[ActionCode] = js.undefined,
        ArchiveId: js.UndefOr[String] = js.undefined,
        ArchiveSHA256TreeHash: js.UndefOr[String] = js.undefined,
        ArchiveSizeInBytes: js.UndefOr[Size] = js.undefined,
        Completed: js.UndefOr[Boolean] = js.undefined,
        CompletionDate: js.UndefOr[String] = js.undefined,
        CreationDate: js.UndefOr[String] = js.undefined,
        InventoryRetrievalParameters: js.UndefOr[InventoryRetrievalJobDescription] = js.undefined,
        InventorySizeInBytes: js.UndefOr[Size] = js.undefined,
        JobDescription: js.UndefOr[String] = js.undefined,
        JobId: js.UndefOr[String] = js.undefined,
        JobOutputPath: js.UndefOr[String] = js.undefined,
        OutputLocation: js.UndefOr[OutputLocation] = js.undefined,
        RetrievalByteRange: js.UndefOr[String] = js.undefined,
        SHA256TreeHash: js.UndefOr[String] = js.undefined,
        SNSTopic: js.UndefOr[String] = js.undefined,
        SelectParameters: js.UndefOr[SelectParameters] = js.undefined,
        StatusCode: js.UndefOr[StatusCode] = js.undefined,
        StatusMessage: js.UndefOr[String] = js.undefined,
        Tier: js.UndefOr[String] = js.undefined,
        VaultARN: js.UndefOr[String] = js.undefined
    ): GlacierJobDescription = {
      val __obj = js.Dynamic.literal()
      Action.foreach(__v => __obj.updateDynamic("Action")(__v.asInstanceOf[js.Any]))
      ArchiveId.foreach(__v => __obj.updateDynamic("ArchiveId")(__v.asInstanceOf[js.Any]))
      ArchiveSHA256TreeHash.foreach(__v => __obj.updateDynamic("ArchiveSHA256TreeHash")(__v.asInstanceOf[js.Any]))
      ArchiveSizeInBytes.foreach(__v => __obj.updateDynamic("ArchiveSizeInBytes")(__v.asInstanceOf[js.Any]))
      Completed.foreach(__v => __obj.updateDynamic("Completed")(__v.asInstanceOf[js.Any]))
      CompletionDate.foreach(__v => __obj.updateDynamic("CompletionDate")(__v.asInstanceOf[js.Any]))
      CreationDate.foreach(__v => __obj.updateDynamic("CreationDate")(__v.asInstanceOf[js.Any]))
      InventoryRetrievalParameters.foreach(
        __v => __obj.updateDynamic("InventoryRetrievalParameters")(__v.asInstanceOf[js.Any])
      )
      InventorySizeInBytes.foreach(__v => __obj.updateDynamic("InventorySizeInBytes")(__v.asInstanceOf[js.Any]))
      JobDescription.foreach(__v => __obj.updateDynamic("JobDescription")(__v.asInstanceOf[js.Any]))
      JobId.foreach(__v => __obj.updateDynamic("JobId")(__v.asInstanceOf[js.Any]))
      JobOutputPath.foreach(__v => __obj.updateDynamic("JobOutputPath")(__v.asInstanceOf[js.Any]))
      OutputLocation.foreach(__v => __obj.updateDynamic("OutputLocation")(__v.asInstanceOf[js.Any]))
      RetrievalByteRange.foreach(__v => __obj.updateDynamic("RetrievalByteRange")(__v.asInstanceOf[js.Any]))
      SHA256TreeHash.foreach(__v => __obj.updateDynamic("SHA256TreeHash")(__v.asInstanceOf[js.Any]))
      SNSTopic.foreach(__v => __obj.updateDynamic("SNSTopic")(__v.asInstanceOf[js.Any]))
      SelectParameters.foreach(__v => __obj.updateDynamic("SelectParameters")(__v.asInstanceOf[js.Any]))
      StatusCode.foreach(__v => __obj.updateDynamic("StatusCode")(__v.asInstanceOf[js.Any]))
      StatusMessage.foreach(__v => __obj.updateDynamic("StatusMessage")(__v.asInstanceOf[js.Any]))
      Tier.foreach(__v => __obj.updateDynamic("Tier")(__v.asInstanceOf[js.Any]))
      VaultARN.foreach(__v => __obj.updateDynamic("VaultARN")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GlacierJobDescription]
    }
  }

  /**
    * Contains information about a grant.
    */
  @js.native
  trait Grant extends js.Object {
    var Grantee: js.UndefOr[Grantee]
    var Permission: js.UndefOr[Permission]
  }

  object Grant {
    @inline
    def apply(
        Grantee: js.UndefOr[Grantee] = js.undefined,
        Permission: js.UndefOr[Permission] = js.undefined
    ): Grant = {
      val __obj = js.Dynamic.literal()
      Grantee.foreach(__v => __obj.updateDynamic("Grantee")(__v.asInstanceOf[js.Any]))
      Permission.foreach(__v => __obj.updateDynamic("Permission")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Grant]
    }
  }

  /**
    * Contains information about the grantee.
    */
  @js.native
  trait Grantee extends js.Object {
    var Type: Type
    var DisplayName: js.UndefOr[String]
    var EmailAddress: js.UndefOr[String]
    var ID: js.UndefOr[String]
    var URI: js.UndefOr[String]
  }

  object Grantee {
    @inline
    def apply(
        Type: Type,
        DisplayName: js.UndefOr[String] = js.undefined,
        EmailAddress: js.UndefOr[String] = js.undefined,
        ID: js.UndefOr[String] = js.undefined,
        URI: js.UndefOr[String] = js.undefined
    ): Grantee = {
      val __obj = js.Dynamic.literal(
        "Type" -> Type.asInstanceOf[js.Any]
      )

      DisplayName.foreach(__v => __obj.updateDynamic("DisplayName")(__v.asInstanceOf[js.Any]))
      EmailAddress.foreach(__v => __obj.updateDynamic("EmailAddress")(__v.asInstanceOf[js.Any]))
      ID.foreach(__v => __obj.updateDynamic("ID")(__v.asInstanceOf[js.Any]))
      URI.foreach(__v => __obj.updateDynamic("URI")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Grantee]
    }
  }

  /**
    * Provides options for initiating an Amazon S3 Glacier job.
    */
  @js.native
  trait InitiateJobInput extends js.Object {
    var accountId: String
    var vaultName: String
    var jobParameters: js.UndefOr[JobParameters]
  }

  object InitiateJobInput {
    @inline
    def apply(
        accountId: String,
        vaultName: String,
        jobParameters: js.UndefOr[JobParameters] = js.undefined
    ): InitiateJobInput = {
      val __obj = js.Dynamic.literal(
        "accountId" -> accountId.asInstanceOf[js.Any],
        "vaultName" -> vaultName.asInstanceOf[js.Any]
      )

      jobParameters.foreach(__v => __obj.updateDynamic("jobParameters")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InitiateJobInput]
    }
  }

  /**
    * Contains the Amazon S3 Glacier response to your request.
    */
  @js.native
  trait InitiateJobOutput extends js.Object {
    var jobId: js.UndefOr[String]
    var jobOutputPath: js.UndefOr[String]
    var location: js.UndefOr[String]
  }

  object InitiateJobOutput {
    @inline
    def apply(
        jobId: js.UndefOr[String] = js.undefined,
        jobOutputPath: js.UndefOr[String] = js.undefined,
        location: js.UndefOr[String] = js.undefined
    ): InitiateJobOutput = {
      val __obj = js.Dynamic.literal()
      jobId.foreach(__v => __obj.updateDynamic("jobId")(__v.asInstanceOf[js.Any]))
      jobOutputPath.foreach(__v => __obj.updateDynamic("jobOutputPath")(__v.asInstanceOf[js.Any]))
      location.foreach(__v => __obj.updateDynamic("location")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InitiateJobOutput]
    }
  }

  /**
    * Provides options for initiating a multipart upload to an Amazon S3 Glacier vault.
    */
  @js.native
  trait InitiateMultipartUploadInput extends js.Object {
    var accountId: String
    var vaultName: String
    var archiveDescription: js.UndefOr[String]
    var partSize: js.UndefOr[String]
  }

  object InitiateMultipartUploadInput {
    @inline
    def apply(
        accountId: String,
        vaultName: String,
        archiveDescription: js.UndefOr[String] = js.undefined,
        partSize: js.UndefOr[String] = js.undefined
    ): InitiateMultipartUploadInput = {
      val __obj = js.Dynamic.literal(
        "accountId" -> accountId.asInstanceOf[js.Any],
        "vaultName" -> vaultName.asInstanceOf[js.Any]
      )

      archiveDescription.foreach(__v => __obj.updateDynamic("archiveDescription")(__v.asInstanceOf[js.Any]))
      partSize.foreach(__v => __obj.updateDynamic("partSize")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InitiateMultipartUploadInput]
    }
  }

  /**
    * The Amazon S3 Glacier response to your request.
    */
  @js.native
  trait InitiateMultipartUploadOutput extends js.Object {
    var location: js.UndefOr[String]
    var uploadId: js.UndefOr[String]
  }

  object InitiateMultipartUploadOutput {
    @inline
    def apply(
        location: js.UndefOr[String] = js.undefined,
        uploadId: js.UndefOr[String] = js.undefined
    ): InitiateMultipartUploadOutput = {
      val __obj = js.Dynamic.literal()
      location.foreach(__v => __obj.updateDynamic("location")(__v.asInstanceOf[js.Any]))
      uploadId.foreach(__v => __obj.updateDynamic("uploadId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InitiateMultipartUploadOutput]
    }
  }

  /**
    * The input values for <code>InitiateVaultLock</code>.
    */
  @js.native
  trait InitiateVaultLockInput extends js.Object {
    var accountId: String
    var vaultName: String
    var policy: js.UndefOr[VaultLockPolicy]
  }

  object InitiateVaultLockInput {
    @inline
    def apply(
        accountId: String,
        vaultName: String,
        policy: js.UndefOr[VaultLockPolicy] = js.undefined
    ): InitiateVaultLockInput = {
      val __obj = js.Dynamic.literal(
        "accountId" -> accountId.asInstanceOf[js.Any],
        "vaultName" -> vaultName.asInstanceOf[js.Any]
      )

      policy.foreach(__v => __obj.updateDynamic("policy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InitiateVaultLockInput]
    }
  }

  /**
    * Contains the Amazon S3 Glacier response to your request.
    */
  @js.native
  trait InitiateVaultLockOutput extends js.Object {
    var lockId: js.UndefOr[String]
  }

  object InitiateVaultLockOutput {
    @inline
    def apply(
        lockId: js.UndefOr[String] = js.undefined
    ): InitiateVaultLockOutput = {
      val __obj = js.Dynamic.literal()
      lockId.foreach(__v => __obj.updateDynamic("lockId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InitiateVaultLockOutput]
    }
  }

  /**
    * Describes how the archive is serialized.
    */
  @js.native
  trait InputSerialization extends js.Object {
    var csv: js.UndefOr[CSVInput]
  }

  object InputSerialization {
    @inline
    def apply(
        csv: js.UndefOr[CSVInput] = js.undefined
    ): InputSerialization = {
      val __obj = js.Dynamic.literal()
      csv.foreach(__v => __obj.updateDynamic("csv")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InputSerialization]
    }
  }

  /**
    * Describes the options for a range inventory retrieval job.
    */
  @js.native
  trait InventoryRetrievalJobDescription extends js.Object {
    var EndDate: js.UndefOr[DateTime]
    var Format: js.UndefOr[String]
    var Limit: js.UndefOr[String]
    var Marker: js.UndefOr[String]
    var StartDate: js.UndefOr[DateTime]
  }

  object InventoryRetrievalJobDescription {
    @inline
    def apply(
        EndDate: js.UndefOr[DateTime] = js.undefined,
        Format: js.UndefOr[String] = js.undefined,
        Limit: js.UndefOr[String] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined,
        StartDate: js.UndefOr[DateTime] = js.undefined
    ): InventoryRetrievalJobDescription = {
      val __obj = js.Dynamic.literal()
      EndDate.foreach(__v => __obj.updateDynamic("EndDate")(__v.asInstanceOf[js.Any]))
      Format.foreach(__v => __obj.updateDynamic("Format")(__v.asInstanceOf[js.Any]))
      Limit.foreach(__v => __obj.updateDynamic("Limit")(__v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      StartDate.foreach(__v => __obj.updateDynamic("StartDate")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InventoryRetrievalJobDescription]
    }
  }

  /**
    * Provides options for specifying a range inventory retrieval job.
    */
  @js.native
  trait InventoryRetrievalJobInput extends js.Object {
    var EndDate: js.UndefOr[String]
    var Limit: js.UndefOr[String]
    var Marker: js.UndefOr[String]
    var StartDate: js.UndefOr[String]
  }

  object InventoryRetrievalJobInput {
    @inline
    def apply(
        EndDate: js.UndefOr[String] = js.undefined,
        Limit: js.UndefOr[String] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined,
        StartDate: js.UndefOr[String] = js.undefined
    ): InventoryRetrievalJobInput = {
      val __obj = js.Dynamic.literal()
      EndDate.foreach(__v => __obj.updateDynamic("EndDate")(__v.asInstanceOf[js.Any]))
      Limit.foreach(__v => __obj.updateDynamic("Limit")(__v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      StartDate.foreach(__v => __obj.updateDynamic("StartDate")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InventoryRetrievalJobInput]
    }
  }

  /**
    * Provides options for defining a job.
    */
  @js.native
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

  object JobParameters {
    @inline
    def apply(
        ArchiveId: js.UndefOr[String] = js.undefined,
        Description: js.UndefOr[String] = js.undefined,
        Format: js.UndefOr[String] = js.undefined,
        InventoryRetrievalParameters: js.UndefOr[InventoryRetrievalJobInput] = js.undefined,
        OutputLocation: js.UndefOr[OutputLocation] = js.undefined,
        RetrievalByteRange: js.UndefOr[String] = js.undefined,
        SNSTopic: js.UndefOr[String] = js.undefined,
        SelectParameters: js.UndefOr[SelectParameters] = js.undefined,
        Tier: js.UndefOr[String] = js.undefined,
        Type: js.UndefOr[String] = js.undefined
    ): JobParameters = {
      val __obj = js.Dynamic.literal()
      ArchiveId.foreach(__v => __obj.updateDynamic("ArchiveId")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Format.foreach(__v => __obj.updateDynamic("Format")(__v.asInstanceOf[js.Any]))
      InventoryRetrievalParameters.foreach(
        __v => __obj.updateDynamic("InventoryRetrievalParameters")(__v.asInstanceOf[js.Any])
      )
      OutputLocation.foreach(__v => __obj.updateDynamic("OutputLocation")(__v.asInstanceOf[js.Any]))
      RetrievalByteRange.foreach(__v => __obj.updateDynamic("RetrievalByteRange")(__v.asInstanceOf[js.Any]))
      SNSTopic.foreach(__v => __obj.updateDynamic("SNSTopic")(__v.asInstanceOf[js.Any]))
      SelectParameters.foreach(__v => __obj.updateDynamic("SelectParameters")(__v.asInstanceOf[js.Any]))
      Tier.foreach(__v => __obj.updateDynamic("Tier")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[JobParameters]
    }
  }

  /**
    * Provides options for retrieving a job list for an Amazon S3 Glacier vault.
    */
  @js.native
  trait ListJobsInput extends js.Object {
    var accountId: String
    var vaultName: String
    var completed: js.UndefOr[String]
    var limit: js.UndefOr[String]
    var marker: js.UndefOr[String]
    var statuscode: js.UndefOr[String]
  }

  object ListJobsInput {
    @inline
    def apply(
        accountId: String,
        vaultName: String,
        completed: js.UndefOr[String] = js.undefined,
        limit: js.UndefOr[String] = js.undefined,
        marker: js.UndefOr[String] = js.undefined,
        statuscode: js.UndefOr[String] = js.undefined
    ): ListJobsInput = {
      val __obj = js.Dynamic.literal(
        "accountId" -> accountId.asInstanceOf[js.Any],
        "vaultName" -> vaultName.asInstanceOf[js.Any]
      )

      completed.foreach(__v => __obj.updateDynamic("completed")(__v.asInstanceOf[js.Any]))
      limit.foreach(__v => __obj.updateDynamic("limit")(__v.asInstanceOf[js.Any]))
      marker.foreach(__v => __obj.updateDynamic("marker")(__v.asInstanceOf[js.Any]))
      statuscode.foreach(__v => __obj.updateDynamic("statuscode")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListJobsInput]
    }
  }

  /**
    * Contains the Amazon S3 Glacier response to your request.
    */
  @js.native
  trait ListJobsOutput extends js.Object {
    var JobList: js.UndefOr[JobList]
    var Marker: js.UndefOr[String]
  }

  object ListJobsOutput {
    @inline
    def apply(
        JobList: js.UndefOr[JobList] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined
    ): ListJobsOutput = {
      val __obj = js.Dynamic.literal()
      JobList.foreach(__v => __obj.updateDynamic("JobList")(__v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListJobsOutput]
    }
  }

  /**
    * Provides options for retrieving list of in-progress multipart uploads for an Amazon Glacier vault.
    */
  @js.native
  trait ListMultipartUploadsInput extends js.Object {
    var accountId: String
    var vaultName: String
    var limit: js.UndefOr[String]
    var marker: js.UndefOr[String]
  }

  object ListMultipartUploadsInput {
    @inline
    def apply(
        accountId: String,
        vaultName: String,
        limit: js.UndefOr[String] = js.undefined,
        marker: js.UndefOr[String] = js.undefined
    ): ListMultipartUploadsInput = {
      val __obj = js.Dynamic.literal(
        "accountId" -> accountId.asInstanceOf[js.Any],
        "vaultName" -> vaultName.asInstanceOf[js.Any]
      )

      limit.foreach(__v => __obj.updateDynamic("limit")(__v.asInstanceOf[js.Any]))
      marker.foreach(__v => __obj.updateDynamic("marker")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListMultipartUploadsInput]
    }
  }

  /**
    * Contains the Amazon S3 Glacier response to your request.
    */
  @js.native
  trait ListMultipartUploadsOutput extends js.Object {
    var Marker: js.UndefOr[String]
    var UploadsList: js.UndefOr[UploadsList]
  }

  object ListMultipartUploadsOutput {
    @inline
    def apply(
        Marker: js.UndefOr[String] = js.undefined,
        UploadsList: js.UndefOr[UploadsList] = js.undefined
    ): ListMultipartUploadsOutput = {
      val __obj = js.Dynamic.literal()
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      UploadsList.foreach(__v => __obj.updateDynamic("UploadsList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListMultipartUploadsOutput]
    }
  }

  /**
    * Provides options for retrieving a list of parts of an archive that have been uploaded in a specific multipart upload.
    */
  @js.native
  trait ListPartsInput extends js.Object {
    var accountId: String
    var uploadId: String
    var vaultName: String
    var limit: js.UndefOr[String]
    var marker: js.UndefOr[String]
  }

  object ListPartsInput {
    @inline
    def apply(
        accountId: String,
        uploadId: String,
        vaultName: String,
        limit: js.UndefOr[String] = js.undefined,
        marker: js.UndefOr[String] = js.undefined
    ): ListPartsInput = {
      val __obj = js.Dynamic.literal(
        "accountId" -> accountId.asInstanceOf[js.Any],
        "uploadId"  -> uploadId.asInstanceOf[js.Any],
        "vaultName" -> vaultName.asInstanceOf[js.Any]
      )

      limit.foreach(__v => __obj.updateDynamic("limit")(__v.asInstanceOf[js.Any]))
      marker.foreach(__v => __obj.updateDynamic("marker")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPartsInput]
    }
  }

  /**
    * Contains the Amazon S3 Glacier response to your request.
    */
  @js.native
  trait ListPartsOutput extends js.Object {
    var ArchiveDescription: js.UndefOr[String]
    var CreationDate: js.UndefOr[String]
    var Marker: js.UndefOr[String]
    var MultipartUploadId: js.UndefOr[String]
    var PartSizeInBytes: js.UndefOr[Double]
    var Parts: js.UndefOr[PartList]
    var VaultARN: js.UndefOr[String]
  }

  object ListPartsOutput {
    @inline
    def apply(
        ArchiveDescription: js.UndefOr[String] = js.undefined,
        CreationDate: js.UndefOr[String] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined,
        MultipartUploadId: js.UndefOr[String] = js.undefined,
        PartSizeInBytes: js.UndefOr[Double] = js.undefined,
        Parts: js.UndefOr[PartList] = js.undefined,
        VaultARN: js.UndefOr[String] = js.undefined
    ): ListPartsOutput = {
      val __obj = js.Dynamic.literal()
      ArchiveDescription.foreach(__v => __obj.updateDynamic("ArchiveDescription")(__v.asInstanceOf[js.Any]))
      CreationDate.foreach(__v => __obj.updateDynamic("CreationDate")(__v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      MultipartUploadId.foreach(__v => __obj.updateDynamic("MultipartUploadId")(__v.asInstanceOf[js.Any]))
      PartSizeInBytes.foreach(__v => __obj.updateDynamic("PartSizeInBytes")(__v.asInstanceOf[js.Any]))
      Parts.foreach(__v => __obj.updateDynamic("Parts")(__v.asInstanceOf[js.Any]))
      VaultARN.foreach(__v => __obj.updateDynamic("VaultARN")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPartsOutput]
    }
  }

  @js.native
  trait ListProvisionedCapacityInput extends js.Object {
    var accountId: String
  }

  object ListProvisionedCapacityInput {
    @inline
    def apply(
        accountId: String
    ): ListProvisionedCapacityInput = {
      val __obj = js.Dynamic.literal(
        "accountId" -> accountId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ListProvisionedCapacityInput]
    }
  }

  @js.native
  trait ListProvisionedCapacityOutput extends js.Object {
    var ProvisionedCapacityList: js.UndefOr[ProvisionedCapacityList]
  }

  object ListProvisionedCapacityOutput {
    @inline
    def apply(
        ProvisionedCapacityList: js.UndefOr[ProvisionedCapacityList] = js.undefined
    ): ListProvisionedCapacityOutput = {
      val __obj = js.Dynamic.literal()
      ProvisionedCapacityList.foreach(__v => __obj.updateDynamic("ProvisionedCapacityList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListProvisionedCapacityOutput]
    }
  }

  /**
    * The input value for <code>ListTagsForVaultInput</code>.
    */
  @js.native
  trait ListTagsForVaultInput extends js.Object {
    var accountId: String
    var vaultName: String
  }

  object ListTagsForVaultInput {
    @inline
    def apply(
        accountId: String,
        vaultName: String
    ): ListTagsForVaultInput = {
      val __obj = js.Dynamic.literal(
        "accountId" -> accountId.asInstanceOf[js.Any],
        "vaultName" -> vaultName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ListTagsForVaultInput]
    }
  }

  /**
    * Contains the Amazon S3 Glacier response to your request.
    */
  @js.native
  trait ListTagsForVaultOutput extends js.Object {
    var Tags: js.UndefOr[TagMap]
  }

  object ListTagsForVaultOutput {
    @inline
    def apply(
        Tags: js.UndefOr[TagMap] = js.undefined
    ): ListTagsForVaultOutput = {
      val __obj = js.Dynamic.literal()
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForVaultOutput]
    }
  }

  /**
    * Provides options to retrieve the vault list owned by the calling user's account. The list provides metadata information for each vault.
    */
  @js.native
  trait ListVaultsInput extends js.Object {
    var accountId: String
    var limit: js.UndefOr[String]
    var marker: js.UndefOr[String]
  }

  object ListVaultsInput {
    @inline
    def apply(
        accountId: String,
        limit: js.UndefOr[String] = js.undefined,
        marker: js.UndefOr[String] = js.undefined
    ): ListVaultsInput = {
      val __obj = js.Dynamic.literal(
        "accountId" -> accountId.asInstanceOf[js.Any]
      )

      limit.foreach(__v => __obj.updateDynamic("limit")(__v.asInstanceOf[js.Any]))
      marker.foreach(__v => __obj.updateDynamic("marker")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListVaultsInput]
    }
  }

  /**
    * Contains the Amazon S3 Glacier response to your request.
    */
  @js.native
  trait ListVaultsOutput extends js.Object {
    var Marker: js.UndefOr[String]
    var VaultList: js.UndefOr[VaultList]
  }

  object ListVaultsOutput {
    @inline
    def apply(
        Marker: js.UndefOr[String] = js.undefined,
        VaultList: js.UndefOr[VaultList] = js.undefined
    ): ListVaultsOutput = {
      val __obj = js.Dynamic.literal()
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      VaultList.foreach(__v => __obj.updateDynamic("VaultList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListVaultsOutput]
    }
  }

  /**
    * Contains information about the location where the select job results are stored.
    */
  @js.native
  trait OutputLocation extends js.Object {
    var S3: js.UndefOr[S3Location]
  }

  object OutputLocation {
    @inline
    def apply(
        S3: js.UndefOr[S3Location] = js.undefined
    ): OutputLocation = {
      val __obj = js.Dynamic.literal()
      S3.foreach(__v => __obj.updateDynamic("S3")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OutputLocation]
    }
  }

  /**
    * Describes how the select output is serialized.
    */
  @js.native
  trait OutputSerialization extends js.Object {
    var csv: js.UndefOr[CSVOutput]
  }

  object OutputSerialization {
    @inline
    def apply(
        csv: js.UndefOr[CSVOutput] = js.undefined
    ): OutputSerialization = {
      val __obj = js.Dynamic.literal()
      csv.foreach(__v => __obj.updateDynamic("csv")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OutputSerialization]
    }
  }

  /**
    * A list of the part sizes of the multipart upload.
    */
  @js.native
  trait PartListElement extends js.Object {
    var RangeInBytes: js.UndefOr[String]
    var SHA256TreeHash: js.UndefOr[String]
  }

  object PartListElement {
    @inline
    def apply(
        RangeInBytes: js.UndefOr[String] = js.undefined,
        SHA256TreeHash: js.UndefOr[String] = js.undefined
    ): PartListElement = {
      val __obj = js.Dynamic.literal()
      RangeInBytes.foreach(__v => __obj.updateDynamic("RangeInBytes")(__v.asInstanceOf[js.Any]))
      SHA256TreeHash.foreach(__v => __obj.updateDynamic("SHA256TreeHash")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PartListElement]
    }
  }

  object PermissionEnum {
    val FULL_CONTROL = "FULL_CONTROL"
    val WRITE        = "WRITE"
    val WRITE_ACP    = "WRITE_ACP"
    val READ         = "READ"
    val READ_ACP     = "READ_ACP"

    val values = js.Object.freeze(js.Array(FULL_CONTROL, WRITE, WRITE_ACP, READ, READ_ACP))
  }

  /**
    * The definition for a provisioned capacity unit.
    */
  @js.native
  trait ProvisionedCapacityDescription extends js.Object {
    var CapacityId: js.UndefOr[String]
    var ExpirationDate: js.UndefOr[String]
    var StartDate: js.UndefOr[String]
  }

  object ProvisionedCapacityDescription {
    @inline
    def apply(
        CapacityId: js.UndefOr[String] = js.undefined,
        ExpirationDate: js.UndefOr[String] = js.undefined,
        StartDate: js.UndefOr[String] = js.undefined
    ): ProvisionedCapacityDescription = {
      val __obj = js.Dynamic.literal()
      CapacityId.foreach(__v => __obj.updateDynamic("CapacityId")(__v.asInstanceOf[js.Any]))
      ExpirationDate.foreach(__v => __obj.updateDynamic("ExpirationDate")(__v.asInstanceOf[js.Any]))
      StartDate.foreach(__v => __obj.updateDynamic("StartDate")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ProvisionedCapacityDescription]
    }
  }

  @js.native
  trait PurchaseProvisionedCapacityInput extends js.Object {
    var accountId: String
  }

  object PurchaseProvisionedCapacityInput {
    @inline
    def apply(
        accountId: String
    ): PurchaseProvisionedCapacityInput = {
      val __obj = js.Dynamic.literal(
        "accountId" -> accountId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[PurchaseProvisionedCapacityInput]
    }
  }

  @js.native
  trait PurchaseProvisionedCapacityOutput extends js.Object {
    var capacityId: js.UndefOr[String]
  }

  object PurchaseProvisionedCapacityOutput {
    @inline
    def apply(
        capacityId: js.UndefOr[String] = js.undefined
    ): PurchaseProvisionedCapacityOutput = {
      val __obj = js.Dynamic.literal()
      capacityId.foreach(__v => __obj.updateDynamic("capacityId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PurchaseProvisionedCapacityOutput]
    }
  }

  object QuoteFieldsEnum {
    val ALWAYS   = "ALWAYS"
    val ASNEEDED = "ASNEEDED"

    val values = js.Object.freeze(js.Array(ALWAYS, ASNEEDED))
  }

  /**
    * The input value for <code>RemoveTagsFromVaultInput</code>.
    */
  @js.native
  trait RemoveTagsFromVaultInput extends js.Object {
    var accountId: String
    var vaultName: String
    var TagKeys: js.UndefOr[TagKeyList]
  }

  object RemoveTagsFromVaultInput {
    @inline
    def apply(
        accountId: String,
        vaultName: String,
        TagKeys: js.UndefOr[TagKeyList] = js.undefined
    ): RemoveTagsFromVaultInput = {
      val __obj = js.Dynamic.literal(
        "accountId" -> accountId.asInstanceOf[js.Any],
        "vaultName" -> vaultName.asInstanceOf[js.Any]
      )

      TagKeys.foreach(__v => __obj.updateDynamic("TagKeys")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RemoveTagsFromVaultInput]
    }
  }

  /**
    * Contains information about the location in Amazon S3 where the select job results are stored.
    */
  @js.native
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

  object S3Location {
    @inline
    def apply(
        AccessControlList: js.UndefOr[AccessControlPolicyList] = js.undefined,
        BucketName: js.UndefOr[String] = js.undefined,
        CannedACL: js.UndefOr[CannedACL] = js.undefined,
        Encryption: js.UndefOr[Encryption] = js.undefined,
        Prefix: js.UndefOr[String] = js.undefined,
        StorageClass: js.UndefOr[StorageClass] = js.undefined,
        Tagging: js.UndefOr[hashmap] = js.undefined,
        UserMetadata: js.UndefOr[hashmap] = js.undefined
    ): S3Location = {
      val __obj = js.Dynamic.literal()
      AccessControlList.foreach(__v => __obj.updateDynamic("AccessControlList")(__v.asInstanceOf[js.Any]))
      BucketName.foreach(__v => __obj.updateDynamic("BucketName")(__v.asInstanceOf[js.Any]))
      CannedACL.foreach(__v => __obj.updateDynamic("CannedACL")(__v.asInstanceOf[js.Any]))
      Encryption.foreach(__v => __obj.updateDynamic("Encryption")(__v.asInstanceOf[js.Any]))
      Prefix.foreach(__v => __obj.updateDynamic("Prefix")(__v.asInstanceOf[js.Any]))
      StorageClass.foreach(__v => __obj.updateDynamic("StorageClass")(__v.asInstanceOf[js.Any]))
      Tagging.foreach(__v => __obj.updateDynamic("Tagging")(__v.asInstanceOf[js.Any]))
      UserMetadata.foreach(__v => __obj.updateDynamic("UserMetadata")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[S3Location]
    }
  }

  /**
    * Contains information about the parameters used for a select.
    */
  @js.native
  trait SelectParameters extends js.Object {
    var Expression: js.UndefOr[String]
    var ExpressionType: js.UndefOr[ExpressionType]
    var InputSerialization: js.UndefOr[InputSerialization]
    var OutputSerialization: js.UndefOr[OutputSerialization]
  }

  object SelectParameters {
    @inline
    def apply(
        Expression: js.UndefOr[String] = js.undefined,
        ExpressionType: js.UndefOr[ExpressionType] = js.undefined,
        InputSerialization: js.UndefOr[InputSerialization] = js.undefined,
        OutputSerialization: js.UndefOr[OutputSerialization] = js.undefined
    ): SelectParameters = {
      val __obj = js.Dynamic.literal()
      Expression.foreach(__v => __obj.updateDynamic("Expression")(__v.asInstanceOf[js.Any]))
      ExpressionType.foreach(__v => __obj.updateDynamic("ExpressionType")(__v.asInstanceOf[js.Any]))
      InputSerialization.foreach(__v => __obj.updateDynamic("InputSerialization")(__v.asInstanceOf[js.Any]))
      OutputSerialization.foreach(__v => __obj.updateDynamic("OutputSerialization")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SelectParameters]
    }
  }

  /**
    * SetDataRetrievalPolicy input.
    */
  @js.native
  trait SetDataRetrievalPolicyInput extends js.Object {
    var accountId: String
    var Policy: js.UndefOr[DataRetrievalPolicy]
  }

  object SetDataRetrievalPolicyInput {
    @inline
    def apply(
        accountId: String,
        Policy: js.UndefOr[DataRetrievalPolicy] = js.undefined
    ): SetDataRetrievalPolicyInput = {
      val __obj = js.Dynamic.literal(
        "accountId" -> accountId.asInstanceOf[js.Any]
      )

      Policy.foreach(__v => __obj.updateDynamic("Policy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SetDataRetrievalPolicyInput]
    }
  }

  /**
    * SetVaultAccessPolicy input.
    */
  @js.native
  trait SetVaultAccessPolicyInput extends js.Object {
    var accountId: String
    var vaultName: String
    var policy: js.UndefOr[VaultAccessPolicy]
  }

  object SetVaultAccessPolicyInput {
    @inline
    def apply(
        accountId: String,
        vaultName: String,
        policy: js.UndefOr[VaultAccessPolicy] = js.undefined
    ): SetVaultAccessPolicyInput = {
      val __obj = js.Dynamic.literal(
        "accountId" -> accountId.asInstanceOf[js.Any],
        "vaultName" -> vaultName.asInstanceOf[js.Any]
      )

      policy.foreach(__v => __obj.updateDynamic("policy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SetVaultAccessPolicyInput]
    }
  }

  /**
    * Provides options to configure notifications that will be sent when specific events happen to a vault.
    */
  @js.native
  trait SetVaultNotificationsInput extends js.Object {
    var accountId: String
    var vaultName: String
    var vaultNotificationConfig: js.UndefOr[VaultNotificationConfig]
  }

  object SetVaultNotificationsInput {
    @inline
    def apply(
        accountId: String,
        vaultName: String,
        vaultNotificationConfig: js.UndefOr[VaultNotificationConfig] = js.undefined
    ): SetVaultNotificationsInput = {
      val __obj = js.Dynamic.literal(
        "accountId" -> accountId.asInstanceOf[js.Any],
        "vaultName" -> vaultName.asInstanceOf[js.Any]
      )

      vaultNotificationConfig.foreach(__v => __obj.updateDynamic("vaultNotificationConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SetVaultNotificationsInput]
    }
  }

  object StatusCodeEnum {
    val InProgress = "InProgress"
    val Succeeded  = "Succeeded"
    val Failed     = "Failed"

    val values = js.Object.freeze(js.Array(InProgress, Succeeded, Failed))
  }

  object StorageClassEnum {
    val STANDARD           = "STANDARD"
    val REDUCED_REDUNDANCY = "REDUCED_REDUNDANCY"
    val STANDARD_IA        = "STANDARD_IA"

    val values = js.Object.freeze(js.Array(STANDARD, REDUCED_REDUNDANCY, STANDARD_IA))
  }

  object TypeEnum {
    val AmazonCustomerByEmail = "AmazonCustomerByEmail"
    val CanonicalUser         = "CanonicalUser"
    val Group                 = "Group"

    val values = js.Object.freeze(js.Array(AmazonCustomerByEmail, CanonicalUser, Group))
  }

  /**
    * Provides options to add an archive to a vault.
    */
  @js.native
  trait UploadArchiveInput extends js.Object {
    var accountId: String
    var vaultName: String
    var archiveDescription: js.UndefOr[String]
    var body: js.UndefOr[Stream]
    var checksum: js.UndefOr[String]
  }

  object UploadArchiveInput {
    @inline
    def apply(
        accountId: String,
        vaultName: String,
        archiveDescription: js.UndefOr[String] = js.undefined,
        body: js.UndefOr[Stream] = js.undefined,
        checksum: js.UndefOr[String] = js.undefined
    ): UploadArchiveInput = {
      val __obj = js.Dynamic.literal(
        "accountId" -> accountId.asInstanceOf[js.Any],
        "vaultName" -> vaultName.asInstanceOf[js.Any]
      )

      archiveDescription.foreach(__v => __obj.updateDynamic("archiveDescription")(__v.asInstanceOf[js.Any]))
      body.foreach(__v => __obj.updateDynamic("body")(__v.asInstanceOf[js.Any]))
      checksum.foreach(__v => __obj.updateDynamic("checksum")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UploadArchiveInput]
    }
  }

  /**
    * A list of in-progress multipart uploads for a vault.
    */
  @js.native
  trait UploadListElement extends js.Object {
    var ArchiveDescription: js.UndefOr[String]
    var CreationDate: js.UndefOr[String]
    var MultipartUploadId: js.UndefOr[String]
    var PartSizeInBytes: js.UndefOr[Double]
    var VaultARN: js.UndefOr[String]
  }

  object UploadListElement {
    @inline
    def apply(
        ArchiveDescription: js.UndefOr[String] = js.undefined,
        CreationDate: js.UndefOr[String] = js.undefined,
        MultipartUploadId: js.UndefOr[String] = js.undefined,
        PartSizeInBytes: js.UndefOr[Double] = js.undefined,
        VaultARN: js.UndefOr[String] = js.undefined
    ): UploadListElement = {
      val __obj = js.Dynamic.literal()
      ArchiveDescription.foreach(__v => __obj.updateDynamic("ArchiveDescription")(__v.asInstanceOf[js.Any]))
      CreationDate.foreach(__v => __obj.updateDynamic("CreationDate")(__v.asInstanceOf[js.Any]))
      MultipartUploadId.foreach(__v => __obj.updateDynamic("MultipartUploadId")(__v.asInstanceOf[js.Any]))
      PartSizeInBytes.foreach(__v => __obj.updateDynamic("PartSizeInBytes")(__v.asInstanceOf[js.Any]))
      VaultARN.foreach(__v => __obj.updateDynamic("VaultARN")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UploadListElement]
    }
  }

  /**
    * Provides options to upload a part of an archive in a multipart upload operation.
    */
  @js.native
  trait UploadMultipartPartInput extends js.Object {
    var accountId: String
    var uploadId: String
    var vaultName: String
    var body: js.UndefOr[Stream]
    var checksum: js.UndefOr[String]
    var range: js.UndefOr[String]
  }

  object UploadMultipartPartInput {
    @inline
    def apply(
        accountId: String,
        uploadId: String,
        vaultName: String,
        body: js.UndefOr[Stream] = js.undefined,
        checksum: js.UndefOr[String] = js.undefined,
        range: js.UndefOr[String] = js.undefined
    ): UploadMultipartPartInput = {
      val __obj = js.Dynamic.literal(
        "accountId" -> accountId.asInstanceOf[js.Any],
        "uploadId"  -> uploadId.asInstanceOf[js.Any],
        "vaultName" -> vaultName.asInstanceOf[js.Any]
      )

      body.foreach(__v => __obj.updateDynamic("body")(__v.asInstanceOf[js.Any]))
      checksum.foreach(__v => __obj.updateDynamic("checksum")(__v.asInstanceOf[js.Any]))
      range.foreach(__v => __obj.updateDynamic("range")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UploadMultipartPartInput]
    }
  }

  /**
    * Contains the Amazon S3 Glacier response to your request.
    */
  @js.native
  trait UploadMultipartPartOutput extends js.Object {
    var checksum: js.UndefOr[String]
  }

  object UploadMultipartPartOutput {
    @inline
    def apply(
        checksum: js.UndefOr[String] = js.undefined
    ): UploadMultipartPartOutput = {
      val __obj = js.Dynamic.literal()
      checksum.foreach(__v => __obj.updateDynamic("checksum")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UploadMultipartPartOutput]
    }
  }

  /**
    * Contains the vault access policy.
    */
  @js.native
  trait VaultAccessPolicy extends js.Object {
    var Policy: js.UndefOr[String]
  }

  object VaultAccessPolicy {
    @inline
    def apply(
        Policy: js.UndefOr[String] = js.undefined
    ): VaultAccessPolicy = {
      val __obj = js.Dynamic.literal()
      Policy.foreach(__v => __obj.updateDynamic("Policy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VaultAccessPolicy]
    }
  }

  /**
    * Contains the vault lock policy.
    */
  @js.native
  trait VaultLockPolicy extends js.Object {
    var Policy: js.UndefOr[String]
  }

  object VaultLockPolicy {
    @inline
    def apply(
        Policy: js.UndefOr[String] = js.undefined
    ): VaultLockPolicy = {
      val __obj = js.Dynamic.literal()
      Policy.foreach(__v => __obj.updateDynamic("Policy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VaultLockPolicy]
    }
  }

  /**
    * Represents a vault's notification configuration.
    */
  @js.native
  trait VaultNotificationConfig extends js.Object {
    var Events: js.UndefOr[NotificationEventList]
    var SNSTopic: js.UndefOr[String]
  }

  object VaultNotificationConfig {
    @inline
    def apply(
        Events: js.UndefOr[NotificationEventList] = js.undefined,
        SNSTopic: js.UndefOr[String] = js.undefined
    ): VaultNotificationConfig = {
      val __obj = js.Dynamic.literal()
      Events.foreach(__v => __obj.updateDynamic("Events")(__v.asInstanceOf[js.Any]))
      SNSTopic.foreach(__v => __obj.updateDynamic("SNSTopic")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VaultNotificationConfig]
    }
  }
}
