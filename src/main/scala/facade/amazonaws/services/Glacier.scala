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

  implicit final class GlacierOps(val service: Glacier) extends AnyVal {

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
    *  For information about the underlying REST API, see [[http://docs.aws.amazon.com/amazonglacier/latest/dev/api-multipart-abort-upload.html|Abort Multipart Upload]]. For conceptual information, see [[http://docs.aws.amazon.com/amazonglacier/latest/dev/working-with-archives.html|Working with Archives in Amazon Glacier]].
    */
  @js.native
  trait AbortMultipartUploadInput extends js.Object {
    var accountId: String
    var uploadId: String
    var vaultName: String
  }

  object AbortMultipartUploadInput {
    def apply(
        accountId: String,
        uploadId: String,
        vaultName: String
    ): AbortMultipartUploadInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "accountId" -> accountId.asInstanceOf[js.Any],
        "uploadId"  -> uploadId.asInstanceOf[js.Any],
        "vaultName" -> vaultName.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AbortMultipartUploadInput]
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
    def apply(
        accountId: String,
        vaultName: String
    ): AbortVaultLockInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "accountId" -> accountId.asInstanceOf[js.Any],
        "vaultName" -> vaultName.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AbortVaultLockInput]
    }
  }

  object ActionCodeEnum {
    val ArchiveRetrieval   = "ArchiveRetrieval"
    val InventoryRetrieval = "InventoryRetrieval"
    val Select             = "Select"

    val values = IndexedSeq(ArchiveRetrieval, InventoryRetrieval, Select)
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
    def apply(
        accountId: String,
        vaultName: String,
        Tags: js.UndefOr[TagMap] = js.undefined
    ): AddTagsToVaultInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "accountId" -> accountId.asInstanceOf[js.Any],
        "vaultName" -> vaultName.asInstanceOf[js.Any],
        "Tags" -> Tags.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AddTagsToVaultInput]
    }
  }

  /**
    * Contains the Amazon Glacier response to your request.
    *  For information about the underlying REST API, see [[http://docs.aws.amazon.com/amazonglacier/latest/dev/api-archive-post.html|Upload Archive]]. For conceptual information, see [[http://docs.aws.amazon.com/amazonglacier/latest/dev/working-with-archives.html|Working with Archives in Amazon Glacier]].
    */
  @js.native
  trait ArchiveCreationOutput extends js.Object {
    var archiveId: js.UndefOr[String]
    var checksum: js.UndefOr[String]
    var location: js.UndefOr[String]
  }

  object ArchiveCreationOutput {
    def apply(
        archiveId: js.UndefOr[String] = js.undefined,
        checksum: js.UndefOr[String] = js.undefined,
        location: js.UndefOr[String] = js.undefined
    ): ArchiveCreationOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "archiveId" -> archiveId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "checksum" -> checksum.map { x =>
          x.asInstanceOf[js.Any]
        },
        "location" -> location.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ArchiveCreationOutput]
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
    def apply(
        Comments: js.UndefOr[String] = js.undefined,
        FieldDelimiter: js.UndefOr[String] = js.undefined,
        FileHeaderInfo: js.UndefOr[FileHeaderInfo] = js.undefined,
        QuoteCharacter: js.UndefOr[String] = js.undefined,
        QuoteEscapeCharacter: js.UndefOr[String] = js.undefined,
        RecordDelimiter: js.UndefOr[String] = js.undefined
    ): CSVInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Comments" -> Comments.map { x =>
          x.asInstanceOf[js.Any]
        },
        "FieldDelimiter" -> FieldDelimiter.map { x =>
          x.asInstanceOf[js.Any]
        },
        "FileHeaderInfo" -> FileHeaderInfo.map { x =>
          x.asInstanceOf[js.Any]
        },
        "QuoteCharacter" -> QuoteCharacter.map { x =>
          x.asInstanceOf[js.Any]
        },
        "QuoteEscapeCharacter" -> QuoteEscapeCharacter.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RecordDelimiter" -> RecordDelimiter.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CSVInput]
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
    def apply(
        FieldDelimiter: js.UndefOr[String] = js.undefined,
        QuoteCharacter: js.UndefOr[String] = js.undefined,
        QuoteEscapeCharacter: js.UndefOr[String] = js.undefined,
        QuoteFields: js.UndefOr[QuoteFields] = js.undefined,
        RecordDelimiter: js.UndefOr[String] = js.undefined
    ): CSVOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FieldDelimiter" -> FieldDelimiter.map { x =>
          x.asInstanceOf[js.Any]
        },
        "QuoteCharacter" -> QuoteCharacter.map { x =>
          x.asInstanceOf[js.Any]
        },
        "QuoteEscapeCharacter" -> QuoteEscapeCharacter.map { x =>
          x.asInstanceOf[js.Any]
        },
        "QuoteFields" -> QuoteFields.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RecordDelimiter" -> RecordDelimiter.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CSVOutput]
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

    val values = IndexedSeq(
      `private`,
      `public-read`,
      `public-read-write`,
      `aws-exec-read`,
      `authenticated-read`,
      `bucket-owner-read`,
      `bucket-owner-full-control`
    )
  }

  /**
    * Provides options to complete a multipart upload operation. This informs Amazon Glacier that all the archive parts have been uploaded and Amazon Glacier can now assemble the archive from the uploaded parts. After assembling and saving the archive to the vault, Amazon Glacier returns the URI path of the newly created archive resource.
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
    def apply(
        accountId: String,
        uploadId: String,
        vaultName: String,
        archiveSize: js.UndefOr[String] = js.undefined,
        checksum: js.UndefOr[String] = js.undefined
    ): CompleteMultipartUploadInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "accountId" -> accountId.asInstanceOf[js.Any],
        "uploadId"  -> uploadId.asInstanceOf[js.Any],
        "vaultName" -> vaultName.asInstanceOf[js.Any],
        "archiveSize" -> archiveSize.map { x =>
          x.asInstanceOf[js.Any]
        },
        "checksum" -> checksum.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CompleteMultipartUploadInput]
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
    def apply(
        accountId: String,
        lockId: String,
        vaultName: String
    ): CompleteVaultLockInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "accountId" -> accountId.asInstanceOf[js.Any],
        "lockId"    -> lockId.asInstanceOf[js.Any],
        "vaultName" -> vaultName.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CompleteVaultLockInput]
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
    def apply(
        accountId: String,
        vaultName: String
    ): CreateVaultInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "accountId" -> accountId.asInstanceOf[js.Any],
        "vaultName" -> vaultName.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateVaultInput]
    }
  }

  /**
    * Contains the Amazon Glacier response to your request.
    */
  @js.native
  trait CreateVaultOutput extends js.Object {
    var location: js.UndefOr[String]
  }

  object CreateVaultOutput {
    def apply(
        location: js.UndefOr[String] = js.undefined
    ): CreateVaultOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "location" -> location.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateVaultOutput]
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
    def apply(
        Rules: js.UndefOr[DataRetrievalRulesList] = js.undefined
    ): DataRetrievalPolicy = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Rules" -> Rules.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DataRetrievalPolicy]
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
    def apply(
        BytesPerHour: js.UndefOr[NullableLong] = js.undefined,
        Strategy: js.UndefOr[String] = js.undefined
    ): DataRetrievalRule = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BytesPerHour" -> BytesPerHour.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Strategy" -> Strategy.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DataRetrievalRule]
    }
  }

  /**
    * Provides options for deleting an archive from an Amazon Glacier vault.
    */
  @js.native
  trait DeleteArchiveInput extends js.Object {
    var accountId: String
    var archiveId: String
    var vaultName: String
  }

  object DeleteArchiveInput {
    def apply(
        accountId: String,
        archiveId: String,
        vaultName: String
    ): DeleteArchiveInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "accountId" -> accountId.asInstanceOf[js.Any],
        "archiveId" -> archiveId.asInstanceOf[js.Any],
        "vaultName" -> vaultName.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteArchiveInput]
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
    def apply(
        accountId: String,
        vaultName: String
    ): DeleteVaultAccessPolicyInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "accountId" -> accountId.asInstanceOf[js.Any],
        "vaultName" -> vaultName.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteVaultAccessPolicyInput]
    }
  }

  /**
    * Provides options for deleting a vault from Amazon Glacier.
    */
  @js.native
  trait DeleteVaultInput extends js.Object {
    var accountId: String
    var vaultName: String
  }

  object DeleteVaultInput {
    def apply(
        accountId: String,
        vaultName: String
    ): DeleteVaultInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "accountId" -> accountId.asInstanceOf[js.Any],
        "vaultName" -> vaultName.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteVaultInput]
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
    def apply(
        accountId: String,
        vaultName: String
    ): DeleteVaultNotificationsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "accountId" -> accountId.asInstanceOf[js.Any],
        "vaultName" -> vaultName.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteVaultNotificationsInput]
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
    def apply(
        accountId: String,
        jobId: String,
        vaultName: String
    ): DescribeJobInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "accountId" -> accountId.asInstanceOf[js.Any],
        "jobId"     -> jobId.asInstanceOf[js.Any],
        "vaultName" -> vaultName.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeJobInput]
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
    def apply(
        accountId: String,
        vaultName: String
    ): DescribeVaultInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "accountId" -> accountId.asInstanceOf[js.Any],
        "vaultName" -> vaultName.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeVaultInput]
    }
  }

  /**
    * Contains the Amazon Glacier response to your request.
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
    def apply(
        CreationDate: js.UndefOr[String] = js.undefined,
        LastInventoryDate: js.UndefOr[String] = js.undefined,
        NumberOfArchives: js.UndefOr[Double] = js.undefined,
        SizeInBytes: js.UndefOr[Double] = js.undefined,
        VaultARN: js.UndefOr[String] = js.undefined,
        VaultName: js.UndefOr[String] = js.undefined
    ): DescribeVaultOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CreationDate" -> CreationDate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LastInventoryDate" -> LastInventoryDate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NumberOfArchives" -> NumberOfArchives.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SizeInBytes" -> SizeInBytes.map { x =>
          x.asInstanceOf[js.Any]
        },
        "VaultARN" -> VaultARN.map { x =>
          x.asInstanceOf[js.Any]
        },
        "VaultName" -> VaultName.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeVaultOutput]
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
    def apply(
        EncryptionType: js.UndefOr[EncryptionType] = js.undefined,
        KMSContext: js.UndefOr[String] = js.undefined,
        KMSKeyId: js.UndefOr[String] = js.undefined
    ): Encryption = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EncryptionType" -> EncryptionType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "KMSContext" -> KMSContext.map { x =>
          x.asInstanceOf[js.Any]
        },
        "KMSKeyId" -> KMSKeyId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Encryption]
    }
  }

  object EncryptionTypeEnum {
    val `aws:kms` = "aws:kms"
    val AES256    = "AES256"

    val values = IndexedSeq(`aws:kms`, AES256)
  }

  object ExpressionTypeEnum {
    val SQL = "SQL"

    val values = IndexedSeq(SQL)
  }

  object FileHeaderInfoEnum {
    val USE    = "USE"
    val IGNORE = "IGNORE"
    val NONE   = "NONE"

    val values = IndexedSeq(USE, IGNORE, NONE)
  }

  /**
    * Input for GetDataRetrievalPolicy.
    */
  @js.native
  trait GetDataRetrievalPolicyInput extends js.Object {
    var accountId: String
  }

  object GetDataRetrievalPolicyInput {
    def apply(
        accountId: String
    ): GetDataRetrievalPolicyInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "accountId" -> accountId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDataRetrievalPolicyInput]
    }
  }

  /**
    * Contains the Amazon Glacier response to the <code>GetDataRetrievalPolicy</code> request.
    */
  @js.native
  trait GetDataRetrievalPolicyOutput extends js.Object {
    var Policy: js.UndefOr[DataRetrievalPolicy]
  }

  object GetDataRetrievalPolicyOutput {
    def apply(
        Policy: js.UndefOr[DataRetrievalPolicy] = js.undefined
    ): GetDataRetrievalPolicyOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Policy" -> Policy.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDataRetrievalPolicyOutput]
    }
  }

  /**
    * Provides options for downloading output of an Amazon Glacier job.
    */
  @js.native
  trait GetJobOutputInput extends js.Object {
    var accountId: String
    var jobId: String
    var vaultName: String
    var range: js.UndefOr[String]
  }

  object GetJobOutputInput {
    def apply(
        accountId: String,
        jobId: String,
        vaultName: String,
        range: js.UndefOr[String] = js.undefined
    ): GetJobOutputInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "accountId" -> accountId.asInstanceOf[js.Any],
        "jobId"     -> jobId.asInstanceOf[js.Any],
        "vaultName" -> vaultName.asInstanceOf[js.Any],
        "range" -> range.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetJobOutputInput]
    }
  }

  /**
    * Contains the Amazon Glacier response to your request.
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
    def apply(
        acceptRanges: js.UndefOr[String] = js.undefined,
        archiveDescription: js.UndefOr[String] = js.undefined,
        body: js.UndefOr[Stream] = js.undefined,
        checksum: js.UndefOr[String] = js.undefined,
        contentRange: js.UndefOr[String] = js.undefined,
        contentType: js.UndefOr[String] = js.undefined,
        status: js.UndefOr[httpstatus] = js.undefined
    ): GetJobOutputOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "acceptRanges" -> acceptRanges.map { x =>
          x.asInstanceOf[js.Any]
        },
        "archiveDescription" -> archiveDescription.map { x =>
          x.asInstanceOf[js.Any]
        },
        "body" -> body.map { x =>
          x.asInstanceOf[js.Any]
        },
        "checksum" -> checksum.map { x =>
          x.asInstanceOf[js.Any]
        },
        "contentRange" -> contentRange.map { x =>
          x.asInstanceOf[js.Any]
        },
        "contentType" -> contentType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "status" -> status.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetJobOutputOutput]
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
    def apply(
        accountId: String,
        vaultName: String
    ): GetVaultAccessPolicyInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "accountId" -> accountId.asInstanceOf[js.Any],
        "vaultName" -> vaultName.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetVaultAccessPolicyInput]
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
    def apply(
        policy: js.UndefOr[VaultAccessPolicy] = js.undefined
    ): GetVaultAccessPolicyOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "policy" -> policy.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetVaultAccessPolicyOutput]
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
    def apply(
        accountId: String,
        vaultName: String
    ): GetVaultLockInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "accountId" -> accountId.asInstanceOf[js.Any],
        "vaultName" -> vaultName.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetVaultLockInput]
    }
  }

  /**
    * Contains the Amazon Glacier response to your request.
    */
  @js.native
  trait GetVaultLockOutput extends js.Object {
    var CreationDate: js.UndefOr[String]
    var ExpirationDate: js.UndefOr[String]
    var Policy: js.UndefOr[String]
    var State: js.UndefOr[String]
  }

  object GetVaultLockOutput {
    def apply(
        CreationDate: js.UndefOr[String] = js.undefined,
        ExpirationDate: js.UndefOr[String] = js.undefined,
        Policy: js.UndefOr[String] = js.undefined,
        State: js.UndefOr[String] = js.undefined
    ): GetVaultLockOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CreationDate" -> CreationDate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ExpirationDate" -> ExpirationDate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Policy" -> Policy.map { x =>
          x.asInstanceOf[js.Any]
        },
        "State" -> State.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetVaultLockOutput]
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
    def apply(
        accountId: String,
        vaultName: String
    ): GetVaultNotificationsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "accountId" -> accountId.asInstanceOf[js.Any],
        "vaultName" -> vaultName.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetVaultNotificationsInput]
    }
  }

  /**
    * Contains the Amazon Glacier response to your request.
    */
  @js.native
  trait GetVaultNotificationsOutput extends js.Object {
    var vaultNotificationConfig: js.UndefOr[VaultNotificationConfig]
  }

  object GetVaultNotificationsOutput {
    def apply(
        vaultNotificationConfig: js.UndefOr[VaultNotificationConfig] = js.undefined
    ): GetVaultNotificationsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "vaultNotificationConfig" -> vaultNotificationConfig.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetVaultNotificationsOutput]
    }
  }

  /**
    * Contains the description of an Amazon Glacier job.
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
      val _fields = IndexedSeq[(String, js.Any)](
        "Action" -> Action.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ArchiveId" -> ArchiveId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ArchiveSHA256TreeHash" -> ArchiveSHA256TreeHash.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ArchiveSizeInBytes" -> ArchiveSizeInBytes.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Completed" -> Completed.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CompletionDate" -> CompletionDate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CreationDate" -> CreationDate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "InventoryRetrievalParameters" -> InventoryRetrievalParameters.map { x =>
          x.asInstanceOf[js.Any]
        },
        "InventorySizeInBytes" -> InventorySizeInBytes.map { x =>
          x.asInstanceOf[js.Any]
        },
        "JobDescription" -> JobDescription.map { x =>
          x.asInstanceOf[js.Any]
        },
        "JobId" -> JobId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "JobOutputPath" -> JobOutputPath.map { x =>
          x.asInstanceOf[js.Any]
        },
        "OutputLocation" -> OutputLocation.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RetrievalByteRange" -> RetrievalByteRange.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SHA256TreeHash" -> SHA256TreeHash.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SNSTopic" -> SNSTopic.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SelectParameters" -> SelectParameters.map { x =>
          x.asInstanceOf[js.Any]
        },
        "StatusCode" -> StatusCode.map { x =>
          x.asInstanceOf[js.Any]
        },
        "StatusMessage" -> StatusMessage.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Tier" -> Tier.map { x =>
          x.asInstanceOf[js.Any]
        },
        "VaultARN" -> VaultARN.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GlacierJobDescription]
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
    def apply(
        Grantee: js.UndefOr[Grantee] = js.undefined,
        Permission: js.UndefOr[Permission] = js.undefined
    ): Grant = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Grantee" -> Grantee.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Permission" -> Permission.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Grant]
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
    def apply(
        Type: Type,
        DisplayName: js.UndefOr[String] = js.undefined,
        EmailAddress: js.UndefOr[String] = js.undefined,
        ID: js.UndefOr[String] = js.undefined,
        URI: js.UndefOr[String] = js.undefined
    ): Grantee = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Type" -> Type.asInstanceOf[js.Any],
        "DisplayName" -> DisplayName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EmailAddress" -> EmailAddress.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ID" -> ID.map { x =>
          x.asInstanceOf[js.Any]
        },
        "URI" -> URI.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Grantee]
    }
  }

  /**
    * Provides options for initiating an Amazon Glacier job.
    */
  @js.native
  trait InitiateJobInput extends js.Object {
    var accountId: String
    var vaultName: String
    var jobParameters: js.UndefOr[JobParameters]
  }

  object InitiateJobInput {
    def apply(
        accountId: String,
        vaultName: String,
        jobParameters: js.UndefOr[JobParameters] = js.undefined
    ): InitiateJobInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "accountId" -> accountId.asInstanceOf[js.Any],
        "vaultName" -> vaultName.asInstanceOf[js.Any],
        "jobParameters" -> jobParameters.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InitiateJobInput]
    }
  }

  /**
    * Contains the Amazon Glacier response to your request.
    */
  @js.native
  trait InitiateJobOutput extends js.Object {
    var jobId: js.UndefOr[String]
    var jobOutputPath: js.UndefOr[String]
    var location: js.UndefOr[String]
  }

  object InitiateJobOutput {
    def apply(
        jobId: js.UndefOr[String] = js.undefined,
        jobOutputPath: js.UndefOr[String] = js.undefined,
        location: js.UndefOr[String] = js.undefined
    ): InitiateJobOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "jobId" -> jobId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "jobOutputPath" -> jobOutputPath.map { x =>
          x.asInstanceOf[js.Any]
        },
        "location" -> location.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InitiateJobOutput]
    }
  }

  /**
    * Provides options for initiating a multipart upload to an Amazon Glacier vault.
    */
  @js.native
  trait InitiateMultipartUploadInput extends js.Object {
    var accountId: String
    var vaultName: String
    var archiveDescription: js.UndefOr[String]
    var partSize: js.UndefOr[String]
  }

  object InitiateMultipartUploadInput {
    def apply(
        accountId: String,
        vaultName: String,
        archiveDescription: js.UndefOr[String] = js.undefined,
        partSize: js.UndefOr[String] = js.undefined
    ): InitiateMultipartUploadInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "accountId" -> accountId.asInstanceOf[js.Any],
        "vaultName" -> vaultName.asInstanceOf[js.Any],
        "archiveDescription" -> archiveDescription.map { x =>
          x.asInstanceOf[js.Any]
        },
        "partSize" -> partSize.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InitiateMultipartUploadInput]
    }
  }

  /**
    * The Amazon Glacier response to your request.
    */
  @js.native
  trait InitiateMultipartUploadOutput extends js.Object {
    var location: js.UndefOr[String]
    var uploadId: js.UndefOr[String]
  }

  object InitiateMultipartUploadOutput {
    def apply(
        location: js.UndefOr[String] = js.undefined,
        uploadId: js.UndefOr[String] = js.undefined
    ): InitiateMultipartUploadOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "location" -> location.map { x =>
          x.asInstanceOf[js.Any]
        },
        "uploadId" -> uploadId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InitiateMultipartUploadOutput]
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
    def apply(
        accountId: String,
        vaultName: String,
        policy: js.UndefOr[VaultLockPolicy] = js.undefined
    ): InitiateVaultLockInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "accountId" -> accountId.asInstanceOf[js.Any],
        "vaultName" -> vaultName.asInstanceOf[js.Any],
        "policy" -> policy.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InitiateVaultLockInput]
    }
  }

  /**
    * Contains the Amazon Glacier response to your request.
    */
  @js.native
  trait InitiateVaultLockOutput extends js.Object {
    var lockId: js.UndefOr[String]
  }

  object InitiateVaultLockOutput {
    def apply(
        lockId: js.UndefOr[String] = js.undefined
    ): InitiateVaultLockOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "lockId" -> lockId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InitiateVaultLockOutput]
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
    def apply(
        csv: js.UndefOr[CSVInput] = js.undefined
    ): InputSerialization = {
      val _fields = IndexedSeq[(String, js.Any)](
        "csv" -> csv.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InputSerialization]
    }
  }

  /**
    * Returned if there is insufficient capacity to process this expedited request. This error only applies to expedited retrievals and not to standard or bulk retrievals.
    */
  @js.native
  trait InsufficientCapacityExceptionException extends js.Object {
    val `type`: String
    val code: String
    val message: String
  }

  /**
    * Returned if a parameter of the request is incorrectly specified.
    */
  @js.native
  trait InvalidParameterValueExceptionException extends js.Object {
    val `type`: String
    val code: String
    val message: String
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
    def apply(
        EndDate: js.UndefOr[DateTime] = js.undefined,
        Format: js.UndefOr[String] = js.undefined,
        Limit: js.UndefOr[String] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined,
        StartDate: js.UndefOr[DateTime] = js.undefined
    ): InventoryRetrievalJobDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EndDate" -> EndDate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Format" -> Format.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Limit" -> Limit.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Marker" -> Marker.map { x =>
          x.asInstanceOf[js.Any]
        },
        "StartDate" -> StartDate.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InventoryRetrievalJobDescription]
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
    def apply(
        EndDate: js.UndefOr[String] = js.undefined,
        Limit: js.UndefOr[String] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined,
        StartDate: js.UndefOr[String] = js.undefined
    ): InventoryRetrievalJobInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EndDate" -> EndDate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Limit" -> Limit.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Marker" -> Marker.map { x =>
          x.asInstanceOf[js.Any]
        },
        "StartDate" -> StartDate.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InventoryRetrievalJobInput]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "ArchiveId" -> ArchiveId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Description" -> Description.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Format" -> Format.map { x =>
          x.asInstanceOf[js.Any]
        },
        "InventoryRetrievalParameters" -> InventoryRetrievalParameters.map { x =>
          x.asInstanceOf[js.Any]
        },
        "OutputLocation" -> OutputLocation.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RetrievalByteRange" -> RetrievalByteRange.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SNSTopic" -> SNSTopic.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SelectParameters" -> SelectParameters.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Tier" -> Tier.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Type" -> Type.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[JobParameters]
    }
  }

  /**
    * Returned if the request results in a vault or account limit being exceeded.
    */
  @js.native
  trait LimitExceededExceptionException extends js.Object {
    val `type`: String
    val code: String
    val message: String
  }

  /**
    * Provides options for retrieving a job list for an Amazon Glacier vault.
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
    def apply(
        accountId: String,
        vaultName: String,
        completed: js.UndefOr[String] = js.undefined,
        limit: js.UndefOr[String] = js.undefined,
        marker: js.UndefOr[String] = js.undefined,
        statuscode: js.UndefOr[String] = js.undefined
    ): ListJobsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "accountId" -> accountId.asInstanceOf[js.Any],
        "vaultName" -> vaultName.asInstanceOf[js.Any],
        "completed" -> completed.map { x =>
          x.asInstanceOf[js.Any]
        },
        "limit" -> limit.map { x =>
          x.asInstanceOf[js.Any]
        },
        "marker" -> marker.map { x =>
          x.asInstanceOf[js.Any]
        },
        "statuscode" -> statuscode.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListJobsInput]
    }
  }

  /**
    * Contains the Amazon Glacier response to your request.
    */
  @js.native
  trait ListJobsOutput extends js.Object {
    var JobList: js.UndefOr[JobList]
    var Marker: js.UndefOr[String]
  }

  object ListJobsOutput {
    def apply(
        JobList: js.UndefOr[JobList] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined
    ): ListJobsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "JobList" -> JobList.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Marker" -> Marker.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListJobsOutput]
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
    def apply(
        accountId: String,
        vaultName: String,
        limit: js.UndefOr[String] = js.undefined,
        marker: js.UndefOr[String] = js.undefined
    ): ListMultipartUploadsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "accountId" -> accountId.asInstanceOf[js.Any],
        "vaultName" -> vaultName.asInstanceOf[js.Any],
        "limit" -> limit.map { x =>
          x.asInstanceOf[js.Any]
        },
        "marker" -> marker.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListMultipartUploadsInput]
    }
  }

  /**
    * Contains the Amazon Glacier response to your request.
    */
  @js.native
  trait ListMultipartUploadsOutput extends js.Object {
    var Marker: js.UndefOr[String]
    var UploadsList: js.UndefOr[UploadsList]
  }

  object ListMultipartUploadsOutput {
    def apply(
        Marker: js.UndefOr[String] = js.undefined,
        UploadsList: js.UndefOr[UploadsList] = js.undefined
    ): ListMultipartUploadsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Marker" -> Marker.map { x =>
          x.asInstanceOf[js.Any]
        },
        "UploadsList" -> UploadsList.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListMultipartUploadsOutput]
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
    def apply(
        accountId: String,
        uploadId: String,
        vaultName: String,
        limit: js.UndefOr[String] = js.undefined,
        marker: js.UndefOr[String] = js.undefined
    ): ListPartsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "accountId" -> accountId.asInstanceOf[js.Any],
        "uploadId"  -> uploadId.asInstanceOf[js.Any],
        "vaultName" -> vaultName.asInstanceOf[js.Any],
        "limit" -> limit.map { x =>
          x.asInstanceOf[js.Any]
        },
        "marker" -> marker.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListPartsInput]
    }
  }

  /**
    * Contains the Amazon Glacier response to your request.
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
    def apply(
        ArchiveDescription: js.UndefOr[String] = js.undefined,
        CreationDate: js.UndefOr[String] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined,
        MultipartUploadId: js.UndefOr[String] = js.undefined,
        PartSizeInBytes: js.UndefOr[Double] = js.undefined,
        Parts: js.UndefOr[PartList] = js.undefined,
        VaultARN: js.UndefOr[String] = js.undefined
    ): ListPartsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ArchiveDescription" -> ArchiveDescription.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CreationDate" -> CreationDate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Marker" -> Marker.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MultipartUploadId" -> MultipartUploadId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PartSizeInBytes" -> PartSizeInBytes.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Parts" -> Parts.map { x =>
          x.asInstanceOf[js.Any]
        },
        "VaultARN" -> VaultARN.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListPartsOutput]
    }
  }

  @js.native
  trait ListProvisionedCapacityInput extends js.Object {
    var accountId: String
  }

  object ListProvisionedCapacityInput {
    def apply(
        accountId: String
    ): ListProvisionedCapacityInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "accountId" -> accountId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListProvisionedCapacityInput]
    }
  }

  @js.native
  trait ListProvisionedCapacityOutput extends js.Object {
    var ProvisionedCapacityList: js.UndefOr[ProvisionedCapacityList]
  }

  object ListProvisionedCapacityOutput {
    def apply(
        ProvisionedCapacityList: js.UndefOr[ProvisionedCapacityList] = js.undefined
    ): ListProvisionedCapacityOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ProvisionedCapacityList" -> ProvisionedCapacityList.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListProvisionedCapacityOutput]
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
    def apply(
        accountId: String,
        vaultName: String
    ): ListTagsForVaultInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "accountId" -> accountId.asInstanceOf[js.Any],
        "vaultName" -> vaultName.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTagsForVaultInput]
    }
  }

  /**
    * Contains the Amazon Glacier response to your request.
    */
  @js.native
  trait ListTagsForVaultOutput extends js.Object {
    var Tags: js.UndefOr[TagMap]
  }

  object ListTagsForVaultOutput {
    def apply(
        Tags: js.UndefOr[TagMap] = js.undefined
    ): ListTagsForVaultOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Tags" -> Tags.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTagsForVaultOutput]
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
    def apply(
        accountId: String,
        limit: js.UndefOr[String] = js.undefined,
        marker: js.UndefOr[String] = js.undefined
    ): ListVaultsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "accountId" -> accountId.asInstanceOf[js.Any],
        "limit" -> limit.map { x =>
          x.asInstanceOf[js.Any]
        },
        "marker" -> marker.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListVaultsInput]
    }
  }

  /**
    * Contains the Amazon Glacier response to your request.
    */
  @js.native
  trait ListVaultsOutput extends js.Object {
    var Marker: js.UndefOr[String]
    var VaultList: js.UndefOr[VaultList]
  }

  object ListVaultsOutput {
    def apply(
        Marker: js.UndefOr[String] = js.undefined,
        VaultList: js.UndefOr[VaultList] = js.undefined
    ): ListVaultsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Marker" -> Marker.map { x =>
          x.asInstanceOf[js.Any]
        },
        "VaultList" -> VaultList.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListVaultsOutput]
    }
  }

  /**
    * Returned if a required header or parameter is missing from the request.
    */
  @js.native
  trait MissingParameterValueExceptionException extends js.Object {
    val `type`: String
    val code: String
    val message: String
  }

  /**
    * Contains information about the location where the select job results are stored.
    */
  @js.native
  trait OutputLocation extends js.Object {
    var S3: js.UndefOr[S3Location]
  }

  object OutputLocation {
    def apply(
        S3: js.UndefOr[S3Location] = js.undefined
    ): OutputLocation = {
      val _fields = IndexedSeq[(String, js.Any)](
        "S3" -> S3.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[OutputLocation]
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
    def apply(
        csv: js.UndefOr[CSVOutput] = js.undefined
    ): OutputSerialization = {
      val _fields = IndexedSeq[(String, js.Any)](
        "csv" -> csv.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[OutputSerialization]
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
    def apply(
        RangeInBytes: js.UndefOr[String] = js.undefined,
        SHA256TreeHash: js.UndefOr[String] = js.undefined
    ): PartListElement = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RangeInBytes" -> RangeInBytes.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SHA256TreeHash" -> SHA256TreeHash.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PartListElement]
    }
  }

  object PermissionEnum {
    val FULL_CONTROL = "FULL_CONTROL"
    val WRITE        = "WRITE"
    val WRITE_ACP    = "WRITE_ACP"
    val READ         = "READ"
    val READ_ACP     = "READ_ACP"

    val values = IndexedSeq(FULL_CONTROL, WRITE, WRITE_ACP, READ, READ_ACP)
  }

  /**
    * Returned if a retrieval job would exceed the current data policy's retrieval rate limit. For more information about data retrieval policies,
    */
  @js.native
  trait PolicyEnforcedExceptionException extends js.Object {
    val `type`: String
    val code: String
    val message: String
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
    def apply(
        CapacityId: js.UndefOr[String] = js.undefined,
        ExpirationDate: js.UndefOr[String] = js.undefined,
        StartDate: js.UndefOr[String] = js.undefined
    ): ProvisionedCapacityDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CapacityId" -> CapacityId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ExpirationDate" -> ExpirationDate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "StartDate" -> StartDate.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ProvisionedCapacityDescription]
    }
  }

  @js.native
  trait PurchaseProvisionedCapacityInput extends js.Object {
    var accountId: String
  }

  object PurchaseProvisionedCapacityInput {
    def apply(
        accountId: String
    ): PurchaseProvisionedCapacityInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "accountId" -> accountId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PurchaseProvisionedCapacityInput]
    }
  }

  @js.native
  trait PurchaseProvisionedCapacityOutput extends js.Object {
    var capacityId: js.UndefOr[String]
  }

  object PurchaseProvisionedCapacityOutput {
    def apply(
        capacityId: js.UndefOr[String] = js.undefined
    ): PurchaseProvisionedCapacityOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "capacityId" -> capacityId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PurchaseProvisionedCapacityOutput]
    }
  }

  object QuoteFieldsEnum {
    val ALWAYS   = "ALWAYS"
    val ASNEEDED = "ASNEEDED"

    val values = IndexedSeq(ALWAYS, ASNEEDED)
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
    def apply(
        accountId: String,
        vaultName: String,
        TagKeys: js.UndefOr[TagKeyList] = js.undefined
    ): RemoveTagsFromVaultInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "accountId" -> accountId.asInstanceOf[js.Any],
        "vaultName" -> vaultName.asInstanceOf[js.Any],
        "TagKeys" -> TagKeys.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RemoveTagsFromVaultInput]
    }
  }

  /**
    * Returned if, when uploading an archive, Amazon Glacier times out while receiving the upload.
    */
  @js.native
  trait RequestTimeoutExceptionException extends js.Object {
    val `type`: String
    val code: String
    val message: String
  }

  /**
    * Returned if the specified resource (such as a vault, upload ID, or job ID) doesn't exist.
    */
  @js.native
  trait ResourceNotFoundExceptionException extends js.Object {
    val `type`: String
    val code: String
    val message: String
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
      val _fields = IndexedSeq[(String, js.Any)](
        "AccessControlList" -> AccessControlList.map { x =>
          x.asInstanceOf[js.Any]
        },
        "BucketName" -> BucketName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CannedACL" -> CannedACL.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Encryption" -> Encryption.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Prefix" -> Prefix.map { x =>
          x.asInstanceOf[js.Any]
        },
        "StorageClass" -> StorageClass.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Tagging" -> Tagging.map { x =>
          x.asInstanceOf[js.Any]
        },
        "UserMetadata" -> UserMetadata.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[S3Location]
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
    def apply(
        Expression: js.UndefOr[String] = js.undefined,
        ExpressionType: js.UndefOr[ExpressionType] = js.undefined,
        InputSerialization: js.UndefOr[InputSerialization] = js.undefined,
        OutputSerialization: js.UndefOr[OutputSerialization] = js.undefined
    ): SelectParameters = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Expression" -> Expression.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ExpressionType" -> ExpressionType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "InputSerialization" -> InputSerialization.map { x =>
          x.asInstanceOf[js.Any]
        },
        "OutputSerialization" -> OutputSerialization.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SelectParameters]
    }
  }

  /**
    * Returned if the service cannot complete the request.
    */
  @js.native
  trait ServiceUnavailableExceptionException extends js.Object {
    val `type`: String
    val code: String
    val message: String
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
    def apply(
        accountId: String,
        Policy: js.UndefOr[DataRetrievalPolicy] = js.undefined
    ): SetDataRetrievalPolicyInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "accountId" -> accountId.asInstanceOf[js.Any],
        "Policy" -> Policy.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SetDataRetrievalPolicyInput]
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
    def apply(
        accountId: String,
        vaultName: String,
        policy: js.UndefOr[VaultAccessPolicy] = js.undefined
    ): SetVaultAccessPolicyInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "accountId" -> accountId.asInstanceOf[js.Any],
        "vaultName" -> vaultName.asInstanceOf[js.Any],
        "policy" -> policy.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SetVaultAccessPolicyInput]
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
    def apply(
        accountId: String,
        vaultName: String,
        vaultNotificationConfig: js.UndefOr[VaultNotificationConfig] = js.undefined
    ): SetVaultNotificationsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "accountId" -> accountId.asInstanceOf[js.Any],
        "vaultName" -> vaultName.asInstanceOf[js.Any],
        "vaultNotificationConfig" -> vaultNotificationConfig.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SetVaultNotificationsInput]
    }
  }

  object StatusCodeEnum {
    val InProgress = "InProgress"
    val Succeeded  = "Succeeded"
    val Failed     = "Failed"

    val values = IndexedSeq(InProgress, Succeeded, Failed)
  }

  object StorageClassEnum {
    val STANDARD           = "STANDARD"
    val REDUCED_REDUNDANCY = "REDUCED_REDUNDANCY"
    val STANDARD_IA        = "STANDARD_IA"

    val values = IndexedSeq(STANDARD, REDUCED_REDUNDANCY, STANDARD_IA)
  }

  object TypeEnum {
    val AmazonCustomerByEmail = "AmazonCustomerByEmail"
    val CanonicalUser         = "CanonicalUser"
    val Group                 = "Group"

    val values = IndexedSeq(AmazonCustomerByEmail, CanonicalUser, Group)
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
    def apply(
        accountId: String,
        vaultName: String,
        archiveDescription: js.UndefOr[String] = js.undefined,
        body: js.UndefOr[Stream] = js.undefined,
        checksum: js.UndefOr[String] = js.undefined
    ): UploadArchiveInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "accountId" -> accountId.asInstanceOf[js.Any],
        "vaultName" -> vaultName.asInstanceOf[js.Any],
        "archiveDescription" -> archiveDescription.map { x =>
          x.asInstanceOf[js.Any]
        },
        "body" -> body.map { x =>
          x.asInstanceOf[js.Any]
        },
        "checksum" -> checksum.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UploadArchiveInput]
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
    def apply(
        ArchiveDescription: js.UndefOr[String] = js.undefined,
        CreationDate: js.UndefOr[String] = js.undefined,
        MultipartUploadId: js.UndefOr[String] = js.undefined,
        PartSizeInBytes: js.UndefOr[Double] = js.undefined,
        VaultARN: js.UndefOr[String] = js.undefined
    ): UploadListElement = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ArchiveDescription" -> ArchiveDescription.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CreationDate" -> CreationDate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MultipartUploadId" -> MultipartUploadId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PartSizeInBytes" -> PartSizeInBytes.map { x =>
          x.asInstanceOf[js.Any]
        },
        "VaultARN" -> VaultARN.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UploadListElement]
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
    def apply(
        accountId: String,
        uploadId: String,
        vaultName: String,
        body: js.UndefOr[Stream] = js.undefined,
        checksum: js.UndefOr[String] = js.undefined,
        range: js.UndefOr[String] = js.undefined
    ): UploadMultipartPartInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "accountId" -> accountId.asInstanceOf[js.Any],
        "uploadId"  -> uploadId.asInstanceOf[js.Any],
        "vaultName" -> vaultName.asInstanceOf[js.Any],
        "body" -> body.map { x =>
          x.asInstanceOf[js.Any]
        },
        "checksum" -> checksum.map { x =>
          x.asInstanceOf[js.Any]
        },
        "range" -> range.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UploadMultipartPartInput]
    }
  }

  /**
    * Contains the Amazon Glacier response to your request.
    */
  @js.native
  trait UploadMultipartPartOutput extends js.Object {
    var checksum: js.UndefOr[String]
  }

  object UploadMultipartPartOutput {
    def apply(
        checksum: js.UndefOr[String] = js.undefined
    ): UploadMultipartPartOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "checksum" -> checksum.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UploadMultipartPartOutput]
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
    def apply(
        Policy: js.UndefOr[String] = js.undefined
    ): VaultAccessPolicy = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Policy" -> Policy.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VaultAccessPolicy]
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
    def apply(
        Policy: js.UndefOr[String] = js.undefined
    ): VaultLockPolicy = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Policy" -> Policy.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VaultLockPolicy]
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
    def apply(
        Events: js.UndefOr[NotificationEventList] = js.undefined,
        SNSTopic: js.UndefOr[String] = js.undefined
    ): VaultNotificationConfig = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Events" -> Events.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SNSTopic" -> SNSTopic.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VaultNotificationConfig]
    }
  }
}
