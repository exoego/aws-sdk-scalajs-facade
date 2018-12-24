package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import io.scalajs.nodejs
import facade.amazonaws._

package object glacier {
  type AccessControlPolicyList = js.Array[Grant]
  type ActionCode = String
  type CannedACL = String
  type DataRetrievalRulesList = js.Array[DataRetrievalRule]
  type DateTime = String
  type EncryptionType = String
  type ExpressionType = String
  type FileHeaderInfo = String
  type JobList = js.Array[GlacierJobDescription]
  type NotificationEventList = js.Array[string]
  type NullableLong = Double
  type PartList = js.Array[PartListElement]
  type Permission = String
  type ProvisionedCapacityList = js.Array[ProvisionedCapacityDescription]
  type QuoteFields = String
  type Size = Double
  type StatusCode = String
  type StorageClass = String
  type Stream = nodejs.buffer.Buffer | nodejs.stream.Readable | js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type TagKey = String
  type TagKeyList = js.Array[string]
  type TagMap = js.Dictionary[TagValue]
  type TagValue = String
  type Type = String
  type UploadsList = js.Array[UploadListElement]
  type VaultList = js.Array[DescribeVaultOutput]
  type boolean = Boolean
  type hashmap = js.Dictionary[string]
  type httpstatus = Int
  type long = Double
  type string = String
}

package glacier {
  @js.native
  @JSImport("aws-sdk", "Glacier")
  class Glacier() extends js.Object {
    def this(config: AWSConfig) = this()

    def abortMultipartUpload(params: AbortMultipartUploadInput): Request[js.Object] = js.native
    def abortVaultLock(params: AbortVaultLockInput): Request[js.Object] = js.native
    def addTagsToVault(params: AddTagsToVaultInput): Request[js.Object] = js.native
    def completeMultipartUpload(params: CompleteMultipartUploadInput): Request[ArchiveCreationOutput] = js.native
    def completeVaultLock(params: CompleteVaultLockInput): Request[js.Object] = js.native
    def createVault(params: CreateVaultInput): Request[CreateVaultOutput] = js.native
    def deleteArchive(params: DeleteArchiveInput): Request[js.Object] = js.native
    def deleteVault(params: DeleteVaultInput): Request[js.Object] = js.native
    def deleteVaultAccessPolicy(params: DeleteVaultAccessPolicyInput): Request[js.Object] = js.native
    def deleteVaultNotifications(params: DeleteVaultNotificationsInput): Request[js.Object] = js.native
    def describeJob(params: DescribeJobInput): Request[GlacierJobDescription] = js.native
    def describeVault(params: DescribeVaultInput): Request[DescribeVaultOutput] = js.native
    def getDataRetrievalPolicy(params: GetDataRetrievalPolicyInput): Request[GetDataRetrievalPolicyOutput] = js.native
    def getJobOutput(params: GetJobOutputInput): Request[GetJobOutputOutput] = js.native
    def getVaultAccessPolicy(params: GetVaultAccessPolicyInput): Request[GetVaultAccessPolicyOutput] = js.native
    def getVaultLock(params: GetVaultLockInput): Request[GetVaultLockOutput] = js.native
    def getVaultNotifications(params: GetVaultNotificationsInput): Request[GetVaultNotificationsOutput] = js.native
    def initiateJob(params: InitiateJobInput): Request[InitiateJobOutput] = js.native
    def initiateMultipartUpload(params: InitiateMultipartUploadInput): Request[InitiateMultipartUploadOutput] = js.native
    def initiateVaultLock(params: InitiateVaultLockInput): Request[InitiateVaultLockOutput] = js.native
    def listJobs(params: ListJobsInput): Request[ListJobsOutput] = js.native
    def listMultipartUploads(params: ListMultipartUploadsInput): Request[ListMultipartUploadsOutput] = js.native
    def listParts(params: ListPartsInput): Request[ListPartsOutput] = js.native
    def listProvisionedCapacity(params: ListProvisionedCapacityInput): Request[ListProvisionedCapacityOutput] = js.native
    def listTagsForVault(params: ListTagsForVaultInput): Request[ListTagsForVaultOutput] = js.native
    def listVaults(params: ListVaultsInput): Request[ListVaultsOutput] = js.native
    def purchaseProvisionedCapacity(params: PurchaseProvisionedCapacityInput): Request[PurchaseProvisionedCapacityOutput] = js.native
    def removeTagsFromVault(params: RemoveTagsFromVaultInput): Request[js.Object] = js.native
    def setDataRetrievalPolicy(params: SetDataRetrievalPolicyInput): Request[js.Object] = js.native
    def setVaultAccessPolicy(params: SetVaultAccessPolicyInput): Request[js.Object] = js.native
    def setVaultNotifications(params: SetVaultNotificationsInput): Request[js.Object] = js.native
    def uploadArchive(params: UploadArchiveInput): Request[ArchiveCreationOutput] = js.native
    def uploadMultipartPart(params: UploadMultipartPartInput): Request[UploadMultipartPartOutput] = js.native
  }

  /**
   * Provides options to abort a multipart upload identified by the upload ID.
   *  For information about the underlying REST API, see [[http://docs.aws.amazon.com/amazonglacier/latest/dev/api-multipart-abort-upload.html|Abort Multipart Upload]]. For conceptual information, see [[http://docs.aws.amazon.com/amazonglacier/latest/dev/working-with-archives.html|Working with Archives in Amazon Glacier]].
   */
  @js.native
  trait AbortMultipartUploadInput extends js.Object {
    var accountId: string
    var uploadId: string
    var vaultName: string
  }

  object AbortMultipartUploadInput {
    def apply(
      accountId: string,
      uploadId: string,
      vaultName: string): AbortMultipartUploadInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "accountId" -> accountId.asInstanceOf[js.Any],
        "uploadId" -> uploadId.asInstanceOf[js.Any],
        "vaultName" -> vaultName.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AbortMultipartUploadInput]
    }
  }

  /**
   * The input values for <code>AbortVaultLock</code>.
   */
  @js.native
  trait AbortVaultLockInput extends js.Object {
    var accountId: string
    var vaultName: string
  }

  object AbortVaultLockInput {
    def apply(
      accountId: string,
      vaultName: string): AbortVaultLockInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "accountId" -> accountId.asInstanceOf[js.Any],
        "vaultName" -> vaultName.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AbortVaultLockInput]
    }
  }

  object ActionCodeEnum {
    val ArchiveRetrieval = "ArchiveRetrieval"
    val InventoryRetrieval = "InventoryRetrieval"
    val Select = "Select"

    val values = IndexedSeq(ArchiveRetrieval, InventoryRetrieval, Select)
  }

  /**
   * The input values for <code>AddTagsToVault</code>.
   */
  @js.native
  trait AddTagsToVaultInput extends js.Object {
    var accountId: string
    var vaultName: string
    var Tags: js.UndefOr[TagMap]
  }

  object AddTagsToVaultInput {
    def apply(
      accountId: string,
      vaultName: string,
      Tags: js.UndefOr[TagMap] = js.undefined): AddTagsToVaultInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "accountId" -> accountId.asInstanceOf[js.Any],
        "vaultName" -> vaultName.asInstanceOf[js.Any],
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AddTagsToVaultInput]
    }
  }

  /**
   * Contains the Amazon Glacier response to your request.
   *  For information about the underlying REST API, see [[http://docs.aws.amazon.com/amazonglacier/latest/dev/api-archive-post.html|Upload Archive]]. For conceptual information, see [[http://docs.aws.amazon.com/amazonglacier/latest/dev/working-with-archives.html|Working with Archives in Amazon Glacier]].
   */
  @js.native
  trait ArchiveCreationOutput extends js.Object {
    var archiveId: js.UndefOr[string]
    var checksum: js.UndefOr[string]
    var location: js.UndefOr[string]
  }

  object ArchiveCreationOutput {
    def apply(
      archiveId: js.UndefOr[string] = js.undefined,
      checksum: js.UndefOr[string] = js.undefined,
      location: js.UndefOr[string] = js.undefined): ArchiveCreationOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "archiveId" -> archiveId.map { x => x.asInstanceOf[js.Any] },
        "checksum" -> checksum.map { x => x.asInstanceOf[js.Any] },
        "location" -> location.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ArchiveCreationOutput]
    }
  }

  /**
   * Contains information about the comma-separated value (CSV) file to select from.
   */
  @js.native
  trait CSVInput extends js.Object {
    var Comments: js.UndefOr[string]
    var FieldDelimiter: js.UndefOr[string]
    var FileHeaderInfo: js.UndefOr[FileHeaderInfo]
    var QuoteCharacter: js.UndefOr[string]
    var QuoteEscapeCharacter: js.UndefOr[string]
    var RecordDelimiter: js.UndefOr[string]
  }

  object CSVInput {
    def apply(
      Comments: js.UndefOr[string] = js.undefined,
      FieldDelimiter: js.UndefOr[string] = js.undefined,
      FileHeaderInfo: js.UndefOr[FileHeaderInfo] = js.undefined,
      QuoteCharacter: js.UndefOr[string] = js.undefined,
      QuoteEscapeCharacter: js.UndefOr[string] = js.undefined,
      RecordDelimiter: js.UndefOr[string] = js.undefined): CSVInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Comments" -> Comments.map { x => x.asInstanceOf[js.Any] },
        "FieldDelimiter" -> FieldDelimiter.map { x => x.asInstanceOf[js.Any] },
        "FileHeaderInfo" -> FileHeaderInfo.map { x => x.asInstanceOf[js.Any] },
        "QuoteCharacter" -> QuoteCharacter.map { x => x.asInstanceOf[js.Any] },
        "QuoteEscapeCharacter" -> QuoteEscapeCharacter.map { x => x.asInstanceOf[js.Any] },
        "RecordDelimiter" -> RecordDelimiter.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CSVInput]
    }
  }

  /**
   * Contains information about the comma-separated value (CSV) file that the job results are stored in.
   */
  @js.native
  trait CSVOutput extends js.Object {
    var FieldDelimiter: js.UndefOr[string]
    var QuoteCharacter: js.UndefOr[string]
    var QuoteEscapeCharacter: js.UndefOr[string]
    var QuoteFields: js.UndefOr[QuoteFields]
    var RecordDelimiter: js.UndefOr[string]
  }

  object CSVOutput {
    def apply(
      FieldDelimiter: js.UndefOr[string] = js.undefined,
      QuoteCharacter: js.UndefOr[string] = js.undefined,
      QuoteEscapeCharacter: js.UndefOr[string] = js.undefined,
      QuoteFields: js.UndefOr[QuoteFields] = js.undefined,
      RecordDelimiter: js.UndefOr[string] = js.undefined): CSVOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FieldDelimiter" -> FieldDelimiter.map { x => x.asInstanceOf[js.Any] },
        "QuoteCharacter" -> QuoteCharacter.map { x => x.asInstanceOf[js.Any] },
        "QuoteEscapeCharacter" -> QuoteEscapeCharacter.map { x => x.asInstanceOf[js.Any] },
        "QuoteFields" -> QuoteFields.map { x => x.asInstanceOf[js.Any] },
        "RecordDelimiter" -> RecordDelimiter.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CSVOutput]
    }
  }

  object CannedACLEnum {
    val `private` = "private"
    val `public-read` = "public-read"
    val `public-read-write` = "public-read-write"
    val `aws-exec-read` = "aws-exec-read"
    val `authenticated-read` = "authenticated-read"
    val `bucket-owner-read` = "bucket-owner-read"
    val `bucket-owner-full-control` = "bucket-owner-full-control"

    val values = IndexedSeq(`private`, `public-read`, `public-read-write`, `aws-exec-read`, `authenticated-read`, `bucket-owner-read`, `bucket-owner-full-control`)
  }

  /**
   * Provides options to complete a multipart upload operation. This informs Amazon Glacier that all the archive parts have been uploaded and Amazon Glacier can now assemble the archive from the uploaded parts. After assembling and saving the archive to the vault, Amazon Glacier returns the URI path of the newly created archive resource.
   */
  @js.native
  trait CompleteMultipartUploadInput extends js.Object {
    var accountId: string
    var uploadId: string
    var vaultName: string
    var archiveSize: js.UndefOr[string]
    var checksum: js.UndefOr[string]
  }

  object CompleteMultipartUploadInput {
    def apply(
      accountId: string,
      uploadId: string,
      vaultName: string,
      archiveSize: js.UndefOr[string] = js.undefined,
      checksum: js.UndefOr[string] = js.undefined): CompleteMultipartUploadInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "accountId" -> accountId.asInstanceOf[js.Any],
        "uploadId" -> uploadId.asInstanceOf[js.Any],
        "vaultName" -> vaultName.asInstanceOf[js.Any],
        "archiveSize" -> archiveSize.map { x => x.asInstanceOf[js.Any] },
        "checksum" -> checksum.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CompleteMultipartUploadInput]
    }
  }

  /**
   * The input values for <code>CompleteVaultLock</code>.
   */
  @js.native
  trait CompleteVaultLockInput extends js.Object {
    var accountId: string
    var lockId: string
    var vaultName: string
  }

  object CompleteVaultLockInput {
    def apply(
      accountId: string,
      lockId: string,
      vaultName: string): CompleteVaultLockInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "accountId" -> accountId.asInstanceOf[js.Any],
        "lockId" -> lockId.asInstanceOf[js.Any],
        "vaultName" -> vaultName.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CompleteVaultLockInput]
    }
  }

  /**
   * Provides options to create a vault.
   */
  @js.native
  trait CreateVaultInput extends js.Object {
    var accountId: string
    var vaultName: string
  }

  object CreateVaultInput {
    def apply(
      accountId: string,
      vaultName: string): CreateVaultInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "accountId" -> accountId.asInstanceOf[js.Any],
        "vaultName" -> vaultName.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateVaultInput]
    }
  }

  /**
   * Contains the Amazon Glacier response to your request.
   */
  @js.native
  trait CreateVaultOutput extends js.Object {
    var location: js.UndefOr[string]
  }

  object CreateVaultOutput {
    def apply(
      location: js.UndefOr[string] = js.undefined): CreateVaultOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "location" -> location.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
      Rules: js.UndefOr[DataRetrievalRulesList] = js.undefined): DataRetrievalPolicy = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Rules" -> Rules.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DataRetrievalPolicy]
    }
  }

  /**
   * Data retrieval policy rule.
   */
  @js.native
  trait DataRetrievalRule extends js.Object {
    var BytesPerHour: js.UndefOr[NullableLong]
    var Strategy: js.UndefOr[string]
  }

  object DataRetrievalRule {
    def apply(
      BytesPerHour: js.UndefOr[NullableLong] = js.undefined,
      Strategy: js.UndefOr[string] = js.undefined): DataRetrievalRule = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BytesPerHour" -> BytesPerHour.map { x => x.asInstanceOf[js.Any] },
        "Strategy" -> Strategy.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DataRetrievalRule]
    }
  }

  /**
   * Provides options for deleting an archive from an Amazon Glacier vault.
   */
  @js.native
  trait DeleteArchiveInput extends js.Object {
    var accountId: string
    var archiveId: string
    var vaultName: string
  }

  object DeleteArchiveInput {
    def apply(
      accountId: string,
      archiveId: string,
      vaultName: string): DeleteArchiveInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "accountId" -> accountId.asInstanceOf[js.Any],
        "archiveId" -> archiveId.asInstanceOf[js.Any],
        "vaultName" -> vaultName.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteArchiveInput]
    }
  }

  /**
   * DeleteVaultAccessPolicy input.
   */
  @js.native
  trait DeleteVaultAccessPolicyInput extends js.Object {
    var accountId: string
    var vaultName: string
  }

  object DeleteVaultAccessPolicyInput {
    def apply(
      accountId: string,
      vaultName: string): DeleteVaultAccessPolicyInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "accountId" -> accountId.asInstanceOf[js.Any],
        "vaultName" -> vaultName.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteVaultAccessPolicyInput]
    }
  }

  /**
   * Provides options for deleting a vault from Amazon Glacier.
   */
  @js.native
  trait DeleteVaultInput extends js.Object {
    var accountId: string
    var vaultName: string
  }

  object DeleteVaultInput {
    def apply(
      accountId: string,
      vaultName: string): DeleteVaultInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "accountId" -> accountId.asInstanceOf[js.Any],
        "vaultName" -> vaultName.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteVaultInput]
    }
  }

  /**
   * Provides options for deleting a vault notification configuration from an Amazon Glacier vault.
   */
  @js.native
  trait DeleteVaultNotificationsInput extends js.Object {
    var accountId: string
    var vaultName: string
  }

  object DeleteVaultNotificationsInput {
    def apply(
      accountId: string,
      vaultName: string): DeleteVaultNotificationsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "accountId" -> accountId.asInstanceOf[js.Any],
        "vaultName" -> vaultName.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteVaultNotificationsInput]
    }
  }

  /**
   * Provides options for retrieving a job description.
   */
  @js.native
  trait DescribeJobInput extends js.Object {
    var accountId: string
    var jobId: string
    var vaultName: string
  }

  object DescribeJobInput {
    def apply(
      accountId: string,
      jobId: string,
      vaultName: string): DescribeJobInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "accountId" -> accountId.asInstanceOf[js.Any],
        "jobId" -> jobId.asInstanceOf[js.Any],
        "vaultName" -> vaultName.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeJobInput]
    }
  }

  /**
   * Provides options for retrieving metadata for a specific vault in Amazon Glacier.
   */
  @js.native
  trait DescribeVaultInput extends js.Object {
    var accountId: string
    var vaultName: string
  }

  object DescribeVaultInput {
    def apply(
      accountId: string,
      vaultName: string): DescribeVaultInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "accountId" -> accountId.asInstanceOf[js.Any],
        "vaultName" -> vaultName.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeVaultInput]
    }
  }

  /**
   * Contains the Amazon Glacier response to your request.
   */
  @js.native
  trait DescribeVaultOutput extends js.Object {
    var CreationDate: js.UndefOr[string]
    var LastInventoryDate: js.UndefOr[string]
    var NumberOfArchives: js.UndefOr[long]
    var SizeInBytes: js.UndefOr[long]
    var VaultARN: js.UndefOr[string]
    var VaultName: js.UndefOr[string]
  }

  object DescribeVaultOutput {
    def apply(
      CreationDate: js.UndefOr[string] = js.undefined,
      LastInventoryDate: js.UndefOr[string] = js.undefined,
      NumberOfArchives: js.UndefOr[long] = js.undefined,
      SizeInBytes: js.UndefOr[long] = js.undefined,
      VaultARN: js.UndefOr[string] = js.undefined,
      VaultName: js.UndefOr[string] = js.undefined): DescribeVaultOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CreationDate" -> CreationDate.map { x => x.asInstanceOf[js.Any] },
        "LastInventoryDate" -> LastInventoryDate.map { x => x.asInstanceOf[js.Any] },
        "NumberOfArchives" -> NumberOfArchives.map { x => x.asInstanceOf[js.Any] },
        "SizeInBytes" -> SizeInBytes.map { x => x.asInstanceOf[js.Any] },
        "VaultARN" -> VaultARN.map { x => x.asInstanceOf[js.Any] },
        "VaultName" -> VaultName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeVaultOutput]
    }
  }

  /**
   * Contains information about the encryption used to store the job results in Amazon S3.
   */
  @js.native
  trait Encryption extends js.Object {
    var EncryptionType: js.UndefOr[EncryptionType]
    var KMSContext: js.UndefOr[string]
    var KMSKeyId: js.UndefOr[string]
  }

  object Encryption {
    def apply(
      EncryptionType: js.UndefOr[EncryptionType] = js.undefined,
      KMSContext: js.UndefOr[string] = js.undefined,
      KMSKeyId: js.UndefOr[string] = js.undefined): Encryption = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EncryptionType" -> EncryptionType.map { x => x.asInstanceOf[js.Any] },
        "KMSContext" -> KMSContext.map { x => x.asInstanceOf[js.Any] },
        "KMSKeyId" -> KMSKeyId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Encryption]
    }
  }

  object EncryptionTypeEnum {
    val `aws:kms` = "aws:kms"
    val AES256 = "AES256"

    val values = IndexedSeq(`aws:kms`, AES256)
  }

  object ExpressionTypeEnum {
    val SQL = "SQL"

    val values = IndexedSeq(SQL)
  }

  object FileHeaderInfoEnum {
    val USE = "USE"
    val IGNORE = "IGNORE"
    val NONE = "NONE"

    val values = IndexedSeq(USE, IGNORE, NONE)
  }

  /**
   * Input for GetDataRetrievalPolicy.
   */
  @js.native
  trait GetDataRetrievalPolicyInput extends js.Object {
    var accountId: string
  }

  object GetDataRetrievalPolicyInput {
    def apply(
      accountId: string): GetDataRetrievalPolicyInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "accountId" -> accountId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

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
      Policy: js.UndefOr[DataRetrievalPolicy] = js.undefined): GetDataRetrievalPolicyOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Policy" -> Policy.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDataRetrievalPolicyOutput]
    }
  }

  /**
   * Provides options for downloading output of an Amazon Glacier job.
   */
  @js.native
  trait GetJobOutputInput extends js.Object {
    var accountId: string
    var jobId: string
    var vaultName: string
    var range: js.UndefOr[string]
  }

  object GetJobOutputInput {
    def apply(
      accountId: string,
      jobId: string,
      vaultName: string,
      range: js.UndefOr[string] = js.undefined): GetJobOutputInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "accountId" -> accountId.asInstanceOf[js.Any],
        "jobId" -> jobId.asInstanceOf[js.Any],
        "vaultName" -> vaultName.asInstanceOf[js.Any],
        "range" -> range.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetJobOutputInput]
    }
  }

  /**
   * Contains the Amazon Glacier response to your request.
   */
  @js.native
  trait GetJobOutputOutput extends js.Object {
    var acceptRanges: js.UndefOr[string]
    var archiveDescription: js.UndefOr[string]
    var body: js.UndefOr[Stream]
    var checksum: js.UndefOr[string]
    var contentRange: js.UndefOr[string]
    var contentType: js.UndefOr[string]
    var status: js.UndefOr[httpstatus]
  }

  object GetJobOutputOutput {
    def apply(
      acceptRanges: js.UndefOr[string] = js.undefined,
      archiveDescription: js.UndefOr[string] = js.undefined,
      body: js.UndefOr[Stream] = js.undefined,
      checksum: js.UndefOr[string] = js.undefined,
      contentRange: js.UndefOr[string] = js.undefined,
      contentType: js.UndefOr[string] = js.undefined,
      status: js.UndefOr[httpstatus] = js.undefined): GetJobOutputOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "acceptRanges" -> acceptRanges.map { x => x.asInstanceOf[js.Any] },
        "archiveDescription" -> archiveDescription.map { x => x.asInstanceOf[js.Any] },
        "body" -> body.map { x => x.asInstanceOf[js.Any] },
        "checksum" -> checksum.map { x => x.asInstanceOf[js.Any] },
        "contentRange" -> contentRange.map { x => x.asInstanceOf[js.Any] },
        "contentType" -> contentType.map { x => x.asInstanceOf[js.Any] },
        "status" -> status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetJobOutputOutput]
    }
  }

  /**
   * Input for GetVaultAccessPolicy.
   */
  @js.native
  trait GetVaultAccessPolicyInput extends js.Object {
    var accountId: string
    var vaultName: string
  }

  object GetVaultAccessPolicyInput {
    def apply(
      accountId: string,
      vaultName: string): GetVaultAccessPolicyInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "accountId" -> accountId.asInstanceOf[js.Any],
        "vaultName" -> vaultName.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

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
      policy: js.UndefOr[VaultAccessPolicy] = js.undefined): GetVaultAccessPolicyOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "policy" -> policy.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetVaultAccessPolicyOutput]
    }
  }

  /**
   * The input values for <code>GetVaultLock</code>.
   */
  @js.native
  trait GetVaultLockInput extends js.Object {
    var accountId: string
    var vaultName: string
  }

  object GetVaultLockInput {
    def apply(
      accountId: string,
      vaultName: string): GetVaultLockInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "accountId" -> accountId.asInstanceOf[js.Any],
        "vaultName" -> vaultName.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetVaultLockInput]
    }
  }

  /**
   * Contains the Amazon Glacier response to your request.
   */
  @js.native
  trait GetVaultLockOutput extends js.Object {
    var CreationDate: js.UndefOr[string]
    var ExpirationDate: js.UndefOr[string]
    var Policy: js.UndefOr[string]
    var State: js.UndefOr[string]
  }

  object GetVaultLockOutput {
    def apply(
      CreationDate: js.UndefOr[string] = js.undefined,
      ExpirationDate: js.UndefOr[string] = js.undefined,
      Policy: js.UndefOr[string] = js.undefined,
      State: js.UndefOr[string] = js.undefined): GetVaultLockOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CreationDate" -> CreationDate.map { x => x.asInstanceOf[js.Any] },
        "ExpirationDate" -> ExpirationDate.map { x => x.asInstanceOf[js.Any] },
        "Policy" -> Policy.map { x => x.asInstanceOf[js.Any] },
        "State" -> State.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetVaultLockOutput]
    }
  }

  /**
   * Provides options for retrieving the notification configuration set on an Amazon Glacier vault.
   */
  @js.native
  trait GetVaultNotificationsInput extends js.Object {
    var accountId: string
    var vaultName: string
  }

  object GetVaultNotificationsInput {
    def apply(
      accountId: string,
      vaultName: string): GetVaultNotificationsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "accountId" -> accountId.asInstanceOf[js.Any],
        "vaultName" -> vaultName.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

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
      vaultNotificationConfig: js.UndefOr[VaultNotificationConfig] = js.undefined): GetVaultNotificationsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "vaultNotificationConfig" -> vaultNotificationConfig.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetVaultNotificationsOutput]
    }
  }

  /**
   * Contains the description of an Amazon Glacier job.
   */
  @js.native
  trait GlacierJobDescription extends js.Object {
    var Action: js.UndefOr[ActionCode]
    var ArchiveId: js.UndefOr[string]
    var ArchiveSHA256TreeHash: js.UndefOr[string]
    var ArchiveSizeInBytes: js.UndefOr[Size]
    var Completed: js.UndefOr[boolean]
    var CompletionDate: js.UndefOr[string]
    var CreationDate: js.UndefOr[string]
    var InventoryRetrievalParameters: js.UndefOr[InventoryRetrievalJobDescription]
    var InventorySizeInBytes: js.UndefOr[Size]
    var JobDescription: js.UndefOr[string]
    var JobId: js.UndefOr[string]
    var JobOutputPath: js.UndefOr[string]
    var OutputLocation: js.UndefOr[OutputLocation]
    var RetrievalByteRange: js.UndefOr[string]
    var SHA256TreeHash: js.UndefOr[string]
    var SNSTopic: js.UndefOr[string]
    var SelectParameters: js.UndefOr[SelectParameters]
    var StatusCode: js.UndefOr[StatusCode]
    var StatusMessage: js.UndefOr[string]
    var Tier: js.UndefOr[string]
    var VaultARN: js.UndefOr[string]
  }

  object GlacierJobDescription {
    def apply(
      Action: js.UndefOr[ActionCode] = js.undefined,
      ArchiveId: js.UndefOr[string] = js.undefined,
      ArchiveSHA256TreeHash: js.UndefOr[string] = js.undefined,
      ArchiveSizeInBytes: js.UndefOr[Size] = js.undefined,
      Completed: js.UndefOr[boolean] = js.undefined,
      CompletionDate: js.UndefOr[string] = js.undefined,
      CreationDate: js.UndefOr[string] = js.undefined,
      InventoryRetrievalParameters: js.UndefOr[InventoryRetrievalJobDescription] = js.undefined,
      InventorySizeInBytes: js.UndefOr[Size] = js.undefined,
      JobDescription: js.UndefOr[string] = js.undefined,
      JobId: js.UndefOr[string] = js.undefined,
      JobOutputPath: js.UndefOr[string] = js.undefined,
      OutputLocation: js.UndefOr[OutputLocation] = js.undefined,
      RetrievalByteRange: js.UndefOr[string] = js.undefined,
      SHA256TreeHash: js.UndefOr[string] = js.undefined,
      SNSTopic: js.UndefOr[string] = js.undefined,
      SelectParameters: js.UndefOr[SelectParameters] = js.undefined,
      StatusCode: js.UndefOr[StatusCode] = js.undefined,
      StatusMessage: js.UndefOr[string] = js.undefined,
      Tier: js.UndefOr[string] = js.undefined,
      VaultARN: js.UndefOr[string] = js.undefined): GlacierJobDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Action" -> Action.map { x => x.asInstanceOf[js.Any] },
        "ArchiveId" -> ArchiveId.map { x => x.asInstanceOf[js.Any] },
        "ArchiveSHA256TreeHash" -> ArchiveSHA256TreeHash.map { x => x.asInstanceOf[js.Any] },
        "ArchiveSizeInBytes" -> ArchiveSizeInBytes.map { x => x.asInstanceOf[js.Any] },
        "Completed" -> Completed.map { x => x.asInstanceOf[js.Any] },
        "CompletionDate" -> CompletionDate.map { x => x.asInstanceOf[js.Any] },
        "CreationDate" -> CreationDate.map { x => x.asInstanceOf[js.Any] },
        "InventoryRetrievalParameters" -> InventoryRetrievalParameters.map { x => x.asInstanceOf[js.Any] },
        "InventorySizeInBytes" -> InventorySizeInBytes.map { x => x.asInstanceOf[js.Any] },
        "JobDescription" -> JobDescription.map { x => x.asInstanceOf[js.Any] },
        "JobId" -> JobId.map { x => x.asInstanceOf[js.Any] },
        "JobOutputPath" -> JobOutputPath.map { x => x.asInstanceOf[js.Any] },
        "OutputLocation" -> OutputLocation.map { x => x.asInstanceOf[js.Any] },
        "RetrievalByteRange" -> RetrievalByteRange.map { x => x.asInstanceOf[js.Any] },
        "SHA256TreeHash" -> SHA256TreeHash.map { x => x.asInstanceOf[js.Any] },
        "SNSTopic" -> SNSTopic.map { x => x.asInstanceOf[js.Any] },
        "SelectParameters" -> SelectParameters.map { x => x.asInstanceOf[js.Any] },
        "StatusCode" -> StatusCode.map { x => x.asInstanceOf[js.Any] },
        "StatusMessage" -> StatusMessage.map { x => x.asInstanceOf[js.Any] },
        "Tier" -> Tier.map { x => x.asInstanceOf[js.Any] },
        "VaultARN" -> VaultARN.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
      Permission: js.UndefOr[Permission] = js.undefined): Grant = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Grantee" -> Grantee.map { x => x.asInstanceOf[js.Any] },
        "Permission" -> Permission.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Grant]
    }
  }

  /**
   * Contains information about the grantee.
   */
  @js.native
  trait Grantee extends js.Object {
    var Type: Type
    var DisplayName: js.UndefOr[string]
    var EmailAddress: js.UndefOr[string]
    var ID: js.UndefOr[string]
    var URI: js.UndefOr[string]
  }

  object Grantee {
    def apply(
      Type: Type,
      DisplayName: js.UndefOr[string] = js.undefined,
      EmailAddress: js.UndefOr[string] = js.undefined,
      ID: js.UndefOr[string] = js.undefined,
      URI: js.UndefOr[string] = js.undefined): Grantee = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Type" -> Type.asInstanceOf[js.Any],
        "DisplayName" -> DisplayName.map { x => x.asInstanceOf[js.Any] },
        "EmailAddress" -> EmailAddress.map { x => x.asInstanceOf[js.Any] },
        "ID" -> ID.map { x => x.asInstanceOf[js.Any] },
        "URI" -> URI.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Grantee]
    }
  }

  /**
   * Provides options for initiating an Amazon Glacier job.
   */
  @js.native
  trait InitiateJobInput extends js.Object {
    var accountId: string
    var vaultName: string
    var jobParameters: js.UndefOr[JobParameters]
  }

  object InitiateJobInput {
    def apply(
      accountId: string,
      vaultName: string,
      jobParameters: js.UndefOr[JobParameters] = js.undefined): InitiateJobInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "accountId" -> accountId.asInstanceOf[js.Any],
        "vaultName" -> vaultName.asInstanceOf[js.Any],
        "jobParameters" -> jobParameters.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InitiateJobInput]
    }
  }

  /**
   * Contains the Amazon Glacier response to your request.
   */
  @js.native
  trait InitiateJobOutput extends js.Object {
    var jobId: js.UndefOr[string]
    var jobOutputPath: js.UndefOr[string]
    var location: js.UndefOr[string]
  }

  object InitiateJobOutput {
    def apply(
      jobId: js.UndefOr[string] = js.undefined,
      jobOutputPath: js.UndefOr[string] = js.undefined,
      location: js.UndefOr[string] = js.undefined): InitiateJobOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "jobId" -> jobId.map { x => x.asInstanceOf[js.Any] },
        "jobOutputPath" -> jobOutputPath.map { x => x.asInstanceOf[js.Any] },
        "location" -> location.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InitiateJobOutput]
    }
  }

  /**
   * Provides options for initiating a multipart upload to an Amazon Glacier vault.
   */
  @js.native
  trait InitiateMultipartUploadInput extends js.Object {
    var accountId: string
    var vaultName: string
    var archiveDescription: js.UndefOr[string]
    var partSize: js.UndefOr[string]
  }

  object InitiateMultipartUploadInput {
    def apply(
      accountId: string,
      vaultName: string,
      archiveDescription: js.UndefOr[string] = js.undefined,
      partSize: js.UndefOr[string] = js.undefined): InitiateMultipartUploadInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "accountId" -> accountId.asInstanceOf[js.Any],
        "vaultName" -> vaultName.asInstanceOf[js.Any],
        "archiveDescription" -> archiveDescription.map { x => x.asInstanceOf[js.Any] },
        "partSize" -> partSize.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InitiateMultipartUploadInput]
    }
  }

  /**
   * The Amazon Glacier response to your request.
   */
  @js.native
  trait InitiateMultipartUploadOutput extends js.Object {
    var location: js.UndefOr[string]
    var uploadId: js.UndefOr[string]
  }

  object InitiateMultipartUploadOutput {
    def apply(
      location: js.UndefOr[string] = js.undefined,
      uploadId: js.UndefOr[string] = js.undefined): InitiateMultipartUploadOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "location" -> location.map { x => x.asInstanceOf[js.Any] },
        "uploadId" -> uploadId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InitiateMultipartUploadOutput]
    }
  }

  /**
   * The input values for <code>InitiateVaultLock</code>.
   */
  @js.native
  trait InitiateVaultLockInput extends js.Object {
    var accountId: string
    var vaultName: string
    var policy: js.UndefOr[VaultLockPolicy]
  }

  object InitiateVaultLockInput {
    def apply(
      accountId: string,
      vaultName: string,
      policy: js.UndefOr[VaultLockPolicy] = js.undefined): InitiateVaultLockInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "accountId" -> accountId.asInstanceOf[js.Any],
        "vaultName" -> vaultName.asInstanceOf[js.Any],
        "policy" -> policy.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InitiateVaultLockInput]
    }
  }

  /**
   * Contains the Amazon Glacier response to your request.
   */
  @js.native
  trait InitiateVaultLockOutput extends js.Object {
    var lockId: js.UndefOr[string]
  }

  object InitiateVaultLockOutput {
    def apply(
      lockId: js.UndefOr[string] = js.undefined): InitiateVaultLockOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "lockId" -> lockId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
      csv: js.UndefOr[CSVInput] = js.undefined): InputSerialization = {
      val _fields = IndexedSeq[(String, js.Any)](
        "csv" -> csv.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InputSerialization]
    }
  }

  /**
   * Returned if there is insufficient capacity to process this expedited request. This error only applies to expedited retrievals and not to standard or bulk retrievals.
   */
  @js.native
  trait InsufficientCapacityExceptionException extends js.Object {
    val `type`: string
    val code: string
    val message: string
  }

  /**
   * Returned if a parameter of the request is incorrectly specified.
   */
  @js.native
  trait InvalidParameterValueExceptionException extends js.Object {
    val `type`: string
    val code: string
    val message: string
  }

  /**
   * Describes the options for a range inventory retrieval job.
   */
  @js.native
  trait InventoryRetrievalJobDescription extends js.Object {
    var EndDate: js.UndefOr[DateTime]
    var Format: js.UndefOr[string]
    var Limit: js.UndefOr[string]
    var Marker: js.UndefOr[string]
    var StartDate: js.UndefOr[DateTime]
  }

  object InventoryRetrievalJobDescription {
    def apply(
      EndDate: js.UndefOr[DateTime] = js.undefined,
      Format: js.UndefOr[string] = js.undefined,
      Limit: js.UndefOr[string] = js.undefined,
      Marker: js.UndefOr[string] = js.undefined,
      StartDate: js.UndefOr[DateTime] = js.undefined): InventoryRetrievalJobDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EndDate" -> EndDate.map { x => x.asInstanceOf[js.Any] },
        "Format" -> Format.map { x => x.asInstanceOf[js.Any] },
        "Limit" -> Limit.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "StartDate" -> StartDate.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InventoryRetrievalJobDescription]
    }
  }

  /**
   * Provides options for specifying a range inventory retrieval job.
   */
  @js.native
  trait InventoryRetrievalJobInput extends js.Object {
    var EndDate: js.UndefOr[string]
    var Limit: js.UndefOr[string]
    var Marker: js.UndefOr[string]
    var StartDate: js.UndefOr[string]
  }

  object InventoryRetrievalJobInput {
    def apply(
      EndDate: js.UndefOr[string] = js.undefined,
      Limit: js.UndefOr[string] = js.undefined,
      Marker: js.UndefOr[string] = js.undefined,
      StartDate: js.UndefOr[string] = js.undefined): InventoryRetrievalJobInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EndDate" -> EndDate.map { x => x.asInstanceOf[js.Any] },
        "Limit" -> Limit.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "StartDate" -> StartDate.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InventoryRetrievalJobInput]
    }
  }

  /**
   * Provides options for defining a job.
   */
  @js.native
  trait JobParameters extends js.Object {
    var ArchiveId: js.UndefOr[string]
    var Description: js.UndefOr[string]
    var Format: js.UndefOr[string]
    var InventoryRetrievalParameters: js.UndefOr[InventoryRetrievalJobInput]
    var OutputLocation: js.UndefOr[OutputLocation]
    var RetrievalByteRange: js.UndefOr[string]
    var SNSTopic: js.UndefOr[string]
    var SelectParameters: js.UndefOr[SelectParameters]
    var Tier: js.UndefOr[string]
    var Type: js.UndefOr[string]
  }

  object JobParameters {
    def apply(
      ArchiveId: js.UndefOr[string] = js.undefined,
      Description: js.UndefOr[string] = js.undefined,
      Format: js.UndefOr[string] = js.undefined,
      InventoryRetrievalParameters: js.UndefOr[InventoryRetrievalJobInput] = js.undefined,
      OutputLocation: js.UndefOr[OutputLocation] = js.undefined,
      RetrievalByteRange: js.UndefOr[string] = js.undefined,
      SNSTopic: js.UndefOr[string] = js.undefined,
      SelectParameters: js.UndefOr[SelectParameters] = js.undefined,
      Tier: js.UndefOr[string] = js.undefined,
      Type: js.UndefOr[string] = js.undefined): JobParameters = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ArchiveId" -> ArchiveId.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "Format" -> Format.map { x => x.asInstanceOf[js.Any] },
        "InventoryRetrievalParameters" -> InventoryRetrievalParameters.map { x => x.asInstanceOf[js.Any] },
        "OutputLocation" -> OutputLocation.map { x => x.asInstanceOf[js.Any] },
        "RetrievalByteRange" -> RetrievalByteRange.map { x => x.asInstanceOf[js.Any] },
        "SNSTopic" -> SNSTopic.map { x => x.asInstanceOf[js.Any] },
        "SelectParameters" -> SelectParameters.map { x => x.asInstanceOf[js.Any] },
        "Tier" -> Tier.map { x => x.asInstanceOf[js.Any] },
        "Type" -> Type.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[JobParameters]
    }
  }

  /**
   * Returned if the request results in a vault or account limit being exceeded.
   */
  @js.native
  trait LimitExceededExceptionException extends js.Object {
    val `type`: string
    val code: string
    val message: string
  }

  /**
   * Provides options for retrieving a job list for an Amazon Glacier vault.
   */
  @js.native
  trait ListJobsInput extends js.Object {
    var accountId: string
    var vaultName: string
    var completed: js.UndefOr[string]
    var limit: js.UndefOr[string]
    var marker: js.UndefOr[string]
    var statuscode: js.UndefOr[string]
  }

  object ListJobsInput {
    def apply(
      accountId: string,
      vaultName: string,
      completed: js.UndefOr[string] = js.undefined,
      limit: js.UndefOr[string] = js.undefined,
      marker: js.UndefOr[string] = js.undefined,
      statuscode: js.UndefOr[string] = js.undefined): ListJobsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "accountId" -> accountId.asInstanceOf[js.Any],
        "vaultName" -> vaultName.asInstanceOf[js.Any],
        "completed" -> completed.map { x => x.asInstanceOf[js.Any] },
        "limit" -> limit.map { x => x.asInstanceOf[js.Any] },
        "marker" -> marker.map { x => x.asInstanceOf[js.Any] },
        "statuscode" -> statuscode.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListJobsInput]
    }
  }

  /**
   * Contains the Amazon Glacier response to your request.
   */
  @js.native
  trait ListJobsOutput extends js.Object {
    var JobList: js.UndefOr[JobList]
    var Marker: js.UndefOr[string]
  }

  object ListJobsOutput {
    def apply(
      JobList: js.UndefOr[JobList] = js.undefined,
      Marker: js.UndefOr[string] = js.undefined): ListJobsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "JobList" -> JobList.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListJobsOutput]
    }
  }

  /**
   * Provides options for retrieving list of in-progress multipart uploads for an Amazon Glacier vault.
   */
  @js.native
  trait ListMultipartUploadsInput extends js.Object {
    var accountId: string
    var vaultName: string
    var limit: js.UndefOr[string]
    var marker: js.UndefOr[string]
  }

  object ListMultipartUploadsInput {
    def apply(
      accountId: string,
      vaultName: string,
      limit: js.UndefOr[string] = js.undefined,
      marker: js.UndefOr[string] = js.undefined): ListMultipartUploadsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "accountId" -> accountId.asInstanceOf[js.Any],
        "vaultName" -> vaultName.asInstanceOf[js.Any],
        "limit" -> limit.map { x => x.asInstanceOf[js.Any] },
        "marker" -> marker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListMultipartUploadsInput]
    }
  }

  /**
   * Contains the Amazon Glacier response to your request.
   */
  @js.native
  trait ListMultipartUploadsOutput extends js.Object {
    var Marker: js.UndefOr[string]
    var UploadsList: js.UndefOr[UploadsList]
  }

  object ListMultipartUploadsOutput {
    def apply(
      Marker: js.UndefOr[string] = js.undefined,
      UploadsList: js.UndefOr[UploadsList] = js.undefined): ListMultipartUploadsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "UploadsList" -> UploadsList.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListMultipartUploadsOutput]
    }
  }

  /**
   * Provides options for retrieving a list of parts of an archive that have been uploaded in a specific multipart upload.
   */
  @js.native
  trait ListPartsInput extends js.Object {
    var accountId: string
    var uploadId: string
    var vaultName: string
    var limit: js.UndefOr[string]
    var marker: js.UndefOr[string]
  }

  object ListPartsInput {
    def apply(
      accountId: string,
      uploadId: string,
      vaultName: string,
      limit: js.UndefOr[string] = js.undefined,
      marker: js.UndefOr[string] = js.undefined): ListPartsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "accountId" -> accountId.asInstanceOf[js.Any],
        "uploadId" -> uploadId.asInstanceOf[js.Any],
        "vaultName" -> vaultName.asInstanceOf[js.Any],
        "limit" -> limit.map { x => x.asInstanceOf[js.Any] },
        "marker" -> marker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListPartsInput]
    }
  }

  /**
   * Contains the Amazon Glacier response to your request.
   */
  @js.native
  trait ListPartsOutput extends js.Object {
    var ArchiveDescription: js.UndefOr[string]
    var CreationDate: js.UndefOr[string]
    var Marker: js.UndefOr[string]
    var MultipartUploadId: js.UndefOr[string]
    var PartSizeInBytes: js.UndefOr[long]
    var Parts: js.UndefOr[PartList]
    var VaultARN: js.UndefOr[string]
  }

  object ListPartsOutput {
    def apply(
      ArchiveDescription: js.UndefOr[string] = js.undefined,
      CreationDate: js.UndefOr[string] = js.undefined,
      Marker: js.UndefOr[string] = js.undefined,
      MultipartUploadId: js.UndefOr[string] = js.undefined,
      PartSizeInBytes: js.UndefOr[long] = js.undefined,
      Parts: js.UndefOr[PartList] = js.undefined,
      VaultARN: js.UndefOr[string] = js.undefined): ListPartsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ArchiveDescription" -> ArchiveDescription.map { x => x.asInstanceOf[js.Any] },
        "CreationDate" -> CreationDate.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "MultipartUploadId" -> MultipartUploadId.map { x => x.asInstanceOf[js.Any] },
        "PartSizeInBytes" -> PartSizeInBytes.map { x => x.asInstanceOf[js.Any] },
        "Parts" -> Parts.map { x => x.asInstanceOf[js.Any] },
        "VaultARN" -> VaultARN.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListPartsOutput]
    }
  }

  @js.native
  trait ListProvisionedCapacityInput extends js.Object {
    var accountId: string
  }

  object ListProvisionedCapacityInput {
    def apply(
      accountId: string): ListProvisionedCapacityInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "accountId" -> accountId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListProvisionedCapacityInput]
    }
  }

  @js.native
  trait ListProvisionedCapacityOutput extends js.Object {
    var ProvisionedCapacityList: js.UndefOr[ProvisionedCapacityList]
  }

  object ListProvisionedCapacityOutput {
    def apply(
      ProvisionedCapacityList: js.UndefOr[ProvisionedCapacityList] = js.undefined): ListProvisionedCapacityOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ProvisionedCapacityList" -> ProvisionedCapacityList.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListProvisionedCapacityOutput]
    }
  }

  /**
   * The input value for <code>ListTagsForVaultInput</code>.
   */
  @js.native
  trait ListTagsForVaultInput extends js.Object {
    var accountId: string
    var vaultName: string
  }

  object ListTagsForVaultInput {
    def apply(
      accountId: string,
      vaultName: string): ListTagsForVaultInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "accountId" -> accountId.asInstanceOf[js.Any],
        "vaultName" -> vaultName.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

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
      Tags: js.UndefOr[TagMap] = js.undefined): ListTagsForVaultOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTagsForVaultOutput]
    }
  }

  /**
   * Provides options to retrieve the vault list owned by the calling user's account. The list provides metadata information for each vault.
   */
  @js.native
  trait ListVaultsInput extends js.Object {
    var accountId: string
    var limit: js.UndefOr[string]
    var marker: js.UndefOr[string]
  }

  object ListVaultsInput {
    def apply(
      accountId: string,
      limit: js.UndefOr[string] = js.undefined,
      marker: js.UndefOr[string] = js.undefined): ListVaultsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "accountId" -> accountId.asInstanceOf[js.Any],
        "limit" -> limit.map { x => x.asInstanceOf[js.Any] },
        "marker" -> marker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListVaultsInput]
    }
  }

  /**
   * Contains the Amazon Glacier response to your request.
   */
  @js.native
  trait ListVaultsOutput extends js.Object {
    var Marker: js.UndefOr[string]
    var VaultList: js.UndefOr[VaultList]
  }

  object ListVaultsOutput {
    def apply(
      Marker: js.UndefOr[string] = js.undefined,
      VaultList: js.UndefOr[VaultList] = js.undefined): ListVaultsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "VaultList" -> VaultList.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListVaultsOutput]
    }
  }

  /**
   * Returned if a required header or parameter is missing from the request.
   */
  @js.native
  trait MissingParameterValueExceptionException extends js.Object {
    val `type`: string
    val code: string
    val message: string
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
      S3: js.UndefOr[S3Location] = js.undefined): OutputLocation = {
      val _fields = IndexedSeq[(String, js.Any)](
        "S3" -> S3.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
      csv: js.UndefOr[CSVOutput] = js.undefined): OutputSerialization = {
      val _fields = IndexedSeq[(String, js.Any)](
        "csv" -> csv.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[OutputSerialization]
    }
  }

  /**
   * A list of the part sizes of the multipart upload.
   */
  @js.native
  trait PartListElement extends js.Object {
    var RangeInBytes: js.UndefOr[string]
    var SHA256TreeHash: js.UndefOr[string]
  }

  object PartListElement {
    def apply(
      RangeInBytes: js.UndefOr[string] = js.undefined,
      SHA256TreeHash: js.UndefOr[string] = js.undefined): PartListElement = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RangeInBytes" -> RangeInBytes.map { x => x.asInstanceOf[js.Any] },
        "SHA256TreeHash" -> SHA256TreeHash.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PartListElement]
    }
  }

  object PermissionEnum {
    val FULL_CONTROL = "FULL_CONTROL"
    val WRITE = "WRITE"
    val WRITE_ACP = "WRITE_ACP"
    val READ = "READ"
    val READ_ACP = "READ_ACP"

    val values = IndexedSeq(FULL_CONTROL, WRITE, WRITE_ACP, READ, READ_ACP)
  }

  /**
   * Returned if a retrieval job would exceed the current data policy's retrieval rate limit. For more information about data retrieval policies,
   */
  @js.native
  trait PolicyEnforcedExceptionException extends js.Object {
    val `type`: string
    val code: string
    val message: string
  }

  /**
   * The definition for a provisioned capacity unit.
   */
  @js.native
  trait ProvisionedCapacityDescription extends js.Object {
    var CapacityId: js.UndefOr[string]
    var ExpirationDate: js.UndefOr[string]
    var StartDate: js.UndefOr[string]
  }

  object ProvisionedCapacityDescription {
    def apply(
      CapacityId: js.UndefOr[string] = js.undefined,
      ExpirationDate: js.UndefOr[string] = js.undefined,
      StartDate: js.UndefOr[string] = js.undefined): ProvisionedCapacityDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CapacityId" -> CapacityId.map { x => x.asInstanceOf[js.Any] },
        "ExpirationDate" -> ExpirationDate.map { x => x.asInstanceOf[js.Any] },
        "StartDate" -> StartDate.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ProvisionedCapacityDescription]
    }
  }

  @js.native
  trait PurchaseProvisionedCapacityInput extends js.Object {
    var accountId: string
  }

  object PurchaseProvisionedCapacityInput {
    def apply(
      accountId: string): PurchaseProvisionedCapacityInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "accountId" -> accountId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PurchaseProvisionedCapacityInput]
    }
  }

  @js.native
  trait PurchaseProvisionedCapacityOutput extends js.Object {
    var capacityId: js.UndefOr[string]
  }

  object PurchaseProvisionedCapacityOutput {
    def apply(
      capacityId: js.UndefOr[string] = js.undefined): PurchaseProvisionedCapacityOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "capacityId" -> capacityId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PurchaseProvisionedCapacityOutput]
    }
  }

  object QuoteFieldsEnum {
    val ALWAYS = "ALWAYS"
    val ASNEEDED = "ASNEEDED"

    val values = IndexedSeq(ALWAYS, ASNEEDED)
  }

  /**
   * The input value for <code>RemoveTagsFromVaultInput</code>.
   */
  @js.native
  trait RemoveTagsFromVaultInput extends js.Object {
    var accountId: string
    var vaultName: string
    var TagKeys: js.UndefOr[TagKeyList]
  }

  object RemoveTagsFromVaultInput {
    def apply(
      accountId: string,
      vaultName: string,
      TagKeys: js.UndefOr[TagKeyList] = js.undefined): RemoveTagsFromVaultInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "accountId" -> accountId.asInstanceOf[js.Any],
        "vaultName" -> vaultName.asInstanceOf[js.Any],
        "TagKeys" -> TagKeys.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RemoveTagsFromVaultInput]
    }
  }

  /**
   * Returned if, when uploading an archive, Amazon Glacier times out while receiving the upload.
   */
  @js.native
  trait RequestTimeoutExceptionException extends js.Object {
    val `type`: string
    val code: string
    val message: string
  }

  /**
   * Returned if the specified resource (such as a vault, upload ID, or job ID) doesn't exist.
   */
  @js.native
  trait ResourceNotFoundExceptionException extends js.Object {
    val `type`: string
    val code: string
    val message: string
  }

  /**
   * Contains information about the location in Amazon S3 where the select job results are stored.
   */
  @js.native
  trait S3Location extends js.Object {
    var AccessControlList: js.UndefOr[AccessControlPolicyList]
    var BucketName: js.UndefOr[string]
    var CannedACL: js.UndefOr[CannedACL]
    var Encryption: js.UndefOr[Encryption]
    var Prefix: js.UndefOr[string]
    var StorageClass: js.UndefOr[StorageClass]
    var Tagging: js.UndefOr[hashmap]
    var UserMetadata: js.UndefOr[hashmap]
  }

  object S3Location {
    def apply(
      AccessControlList: js.UndefOr[AccessControlPolicyList] = js.undefined,
      BucketName: js.UndefOr[string] = js.undefined,
      CannedACL: js.UndefOr[CannedACL] = js.undefined,
      Encryption: js.UndefOr[Encryption] = js.undefined,
      Prefix: js.UndefOr[string] = js.undefined,
      StorageClass: js.UndefOr[StorageClass] = js.undefined,
      Tagging: js.UndefOr[hashmap] = js.undefined,
      UserMetadata: js.UndefOr[hashmap] = js.undefined): S3Location = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AccessControlList" -> AccessControlList.map { x => x.asInstanceOf[js.Any] },
        "BucketName" -> BucketName.map { x => x.asInstanceOf[js.Any] },
        "CannedACL" -> CannedACL.map { x => x.asInstanceOf[js.Any] },
        "Encryption" -> Encryption.map { x => x.asInstanceOf[js.Any] },
        "Prefix" -> Prefix.map { x => x.asInstanceOf[js.Any] },
        "StorageClass" -> StorageClass.map { x => x.asInstanceOf[js.Any] },
        "Tagging" -> Tagging.map { x => x.asInstanceOf[js.Any] },
        "UserMetadata" -> UserMetadata.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[S3Location]
    }
  }

  /**
   * Contains information about the parameters used for a select.
   */
  @js.native
  trait SelectParameters extends js.Object {
    var Expression: js.UndefOr[string]
    var ExpressionType: js.UndefOr[ExpressionType]
    var InputSerialization: js.UndefOr[InputSerialization]
    var OutputSerialization: js.UndefOr[OutputSerialization]
  }

  object SelectParameters {
    def apply(
      Expression: js.UndefOr[string] = js.undefined,
      ExpressionType: js.UndefOr[ExpressionType] = js.undefined,
      InputSerialization: js.UndefOr[InputSerialization] = js.undefined,
      OutputSerialization: js.UndefOr[OutputSerialization] = js.undefined): SelectParameters = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Expression" -> Expression.map { x => x.asInstanceOf[js.Any] },
        "ExpressionType" -> ExpressionType.map { x => x.asInstanceOf[js.Any] },
        "InputSerialization" -> InputSerialization.map { x => x.asInstanceOf[js.Any] },
        "OutputSerialization" -> OutputSerialization.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SelectParameters]
    }
  }

  /**
   * Returned if the service cannot complete the request.
   */
  @js.native
  trait ServiceUnavailableExceptionException extends js.Object {
    val `type`: string
    val code: string
    val message: string
  }

  /**
   * SetDataRetrievalPolicy input.
   */
  @js.native
  trait SetDataRetrievalPolicyInput extends js.Object {
    var accountId: string
    var Policy: js.UndefOr[DataRetrievalPolicy]
  }

  object SetDataRetrievalPolicyInput {
    def apply(
      accountId: string,
      Policy: js.UndefOr[DataRetrievalPolicy] = js.undefined): SetDataRetrievalPolicyInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "accountId" -> accountId.asInstanceOf[js.Any],
        "Policy" -> Policy.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SetDataRetrievalPolicyInput]
    }
  }

  /**
   * SetVaultAccessPolicy input.
   */
  @js.native
  trait SetVaultAccessPolicyInput extends js.Object {
    var accountId: string
    var vaultName: string
    var policy: js.UndefOr[VaultAccessPolicy]
  }

  object SetVaultAccessPolicyInput {
    def apply(
      accountId: string,
      vaultName: string,
      policy: js.UndefOr[VaultAccessPolicy] = js.undefined): SetVaultAccessPolicyInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "accountId" -> accountId.asInstanceOf[js.Any],
        "vaultName" -> vaultName.asInstanceOf[js.Any],
        "policy" -> policy.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SetVaultAccessPolicyInput]
    }
  }

  /**
   * Provides options to configure notifications that will be sent when specific events happen to a vault.
   */
  @js.native
  trait SetVaultNotificationsInput extends js.Object {
    var accountId: string
    var vaultName: string
    var vaultNotificationConfig: js.UndefOr[VaultNotificationConfig]
  }

  object SetVaultNotificationsInput {
    def apply(
      accountId: string,
      vaultName: string,
      vaultNotificationConfig: js.UndefOr[VaultNotificationConfig] = js.undefined): SetVaultNotificationsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "accountId" -> accountId.asInstanceOf[js.Any],
        "vaultName" -> vaultName.asInstanceOf[js.Any],
        "vaultNotificationConfig" -> vaultNotificationConfig.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SetVaultNotificationsInput]
    }
  }

  object StatusCodeEnum {
    val InProgress = "InProgress"
    val Succeeded = "Succeeded"
    val Failed = "Failed"

    val values = IndexedSeq(InProgress, Succeeded, Failed)
  }

  object StorageClassEnum {
    val STANDARD = "STANDARD"
    val REDUCED_REDUNDANCY = "REDUCED_REDUNDANCY"
    val STANDARD_IA = "STANDARD_IA"

    val values = IndexedSeq(STANDARD, REDUCED_REDUNDANCY, STANDARD_IA)
  }

  object TypeEnum {
    val AmazonCustomerByEmail = "AmazonCustomerByEmail"
    val CanonicalUser = "CanonicalUser"
    val Group = "Group"

    val values = IndexedSeq(AmazonCustomerByEmail, CanonicalUser, Group)
  }

  /**
   * Provides options to add an archive to a vault.
   */
  @js.native
  trait UploadArchiveInput extends js.Object {
    var accountId: string
    var vaultName: string
    var archiveDescription: js.UndefOr[string]
    var body: js.UndefOr[Stream]
    var checksum: js.UndefOr[string]
  }

  object UploadArchiveInput {
    def apply(
      accountId: string,
      vaultName: string,
      archiveDescription: js.UndefOr[string] = js.undefined,
      body: js.UndefOr[Stream] = js.undefined,
      checksum: js.UndefOr[string] = js.undefined): UploadArchiveInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "accountId" -> accountId.asInstanceOf[js.Any],
        "vaultName" -> vaultName.asInstanceOf[js.Any],
        "archiveDescription" -> archiveDescription.map { x => x.asInstanceOf[js.Any] },
        "body" -> body.map { x => x.asInstanceOf[js.Any] },
        "checksum" -> checksum.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UploadArchiveInput]
    }
  }

  /**
   * A list of in-progress multipart uploads for a vault.
   */
  @js.native
  trait UploadListElement extends js.Object {
    var ArchiveDescription: js.UndefOr[string]
    var CreationDate: js.UndefOr[string]
    var MultipartUploadId: js.UndefOr[string]
    var PartSizeInBytes: js.UndefOr[long]
    var VaultARN: js.UndefOr[string]
  }

  object UploadListElement {
    def apply(
      ArchiveDescription: js.UndefOr[string] = js.undefined,
      CreationDate: js.UndefOr[string] = js.undefined,
      MultipartUploadId: js.UndefOr[string] = js.undefined,
      PartSizeInBytes: js.UndefOr[long] = js.undefined,
      VaultARN: js.UndefOr[string] = js.undefined): UploadListElement = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ArchiveDescription" -> ArchiveDescription.map { x => x.asInstanceOf[js.Any] },
        "CreationDate" -> CreationDate.map { x => x.asInstanceOf[js.Any] },
        "MultipartUploadId" -> MultipartUploadId.map { x => x.asInstanceOf[js.Any] },
        "PartSizeInBytes" -> PartSizeInBytes.map { x => x.asInstanceOf[js.Any] },
        "VaultARN" -> VaultARN.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UploadListElement]
    }
  }

  /**
   * Provides options to upload a part of an archive in a multipart upload operation.
   */
  @js.native
  trait UploadMultipartPartInput extends js.Object {
    var accountId: string
    var uploadId: string
    var vaultName: string
    var body: js.UndefOr[Stream]
    var checksum: js.UndefOr[string]
    var range: js.UndefOr[string]
  }

  object UploadMultipartPartInput {
    def apply(
      accountId: string,
      uploadId: string,
      vaultName: string,
      body: js.UndefOr[Stream] = js.undefined,
      checksum: js.UndefOr[string] = js.undefined,
      range: js.UndefOr[string] = js.undefined): UploadMultipartPartInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "accountId" -> accountId.asInstanceOf[js.Any],
        "uploadId" -> uploadId.asInstanceOf[js.Any],
        "vaultName" -> vaultName.asInstanceOf[js.Any],
        "body" -> body.map { x => x.asInstanceOf[js.Any] },
        "checksum" -> checksum.map { x => x.asInstanceOf[js.Any] },
        "range" -> range.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UploadMultipartPartInput]
    }
  }

  /**
   * Contains the Amazon Glacier response to your request.
   */
  @js.native
  trait UploadMultipartPartOutput extends js.Object {
    var checksum: js.UndefOr[string]
  }

  object UploadMultipartPartOutput {
    def apply(
      checksum: js.UndefOr[string] = js.undefined): UploadMultipartPartOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "checksum" -> checksum.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UploadMultipartPartOutput]
    }
  }

  /**
   * Contains the vault access policy.
   */
  @js.native
  trait VaultAccessPolicy extends js.Object {
    var Policy: js.UndefOr[string]
  }

  object VaultAccessPolicy {
    def apply(
      Policy: js.UndefOr[string] = js.undefined): VaultAccessPolicy = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Policy" -> Policy.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VaultAccessPolicy]
    }
  }

  /**
   * Contains the vault lock policy.
   */
  @js.native
  trait VaultLockPolicy extends js.Object {
    var Policy: js.UndefOr[string]
  }

  object VaultLockPolicy {
    def apply(
      Policy: js.UndefOr[string] = js.undefined): VaultLockPolicy = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Policy" -> Policy.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VaultLockPolicy]
    }
  }

  /**
   * Represents a vault's notification configuration.
   */
  @js.native
  trait VaultNotificationConfig extends js.Object {
    var Events: js.UndefOr[NotificationEventList]
    var SNSTopic: js.UndefOr[string]
  }

  object VaultNotificationConfig {
    def apply(
      Events: js.UndefOr[NotificationEventList] = js.undefined,
      SNSTopic: js.UndefOr[string] = js.undefined): VaultNotificationConfig = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Events" -> Events.map { x => x.asInstanceOf[js.Any] },
        "SNSTopic" -> SNSTopic.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VaultNotificationConfig]
    }
  }
}
