package facade.amazonaws.services

import scalajs._
import facade.amazonaws._

package object glacier {
  type ActionCode = String
  type DataRetrievalRulesList = js.Array[DataRetrievalRule]
  type DateTime = String
  type JobList = js.Array[GlacierJobDescription]
  type NotificationEventList = js.Array[string]
  type NullableLong = Long
  type PartList = js.Array[PartListElement]
  type Size = Long
  type StatusCode = String
  type Stream = js.Array[Byte]
  type UploadsList = js.Array[UploadListElement]
  type VaultList = js.Array[DescribeVaultOutput]
  type boolean = Boolean
  type httpstatus = Integer
  type long = Long
  type string = String
}

package glacier {
  @js.native
  trait Glacier extends js.Object {
    def abortMultipartUpload(params: AbortMultipartUploadInput, callback: Callback[js.Object]): Unit = js.native
    def abortMultipartUpload(params: AbortMultipartUploadInput): Request[js.Object] = js.native
    def completeMultipartUpload(params: CompleteMultipartUploadInput, callback: Callback[ArchiveCreationOutput]): Unit = js.native
    def completeMultipartUpload(params: CompleteMultipartUploadInput): Request[ArchiveCreationOutput] = js.native
    def createVault(params: CreateVaultInput, callback: Callback[CreateVaultOutput]): Unit = js.native
    def createVault(params: CreateVaultInput): Request[CreateVaultOutput] = js.native
    def deleteArchive(params: DeleteArchiveInput, callback: Callback[js.Object]): Unit = js.native
    def deleteArchive(params: DeleteArchiveInput): Request[js.Object] = js.native
    def deleteVault(params: DeleteVaultInput, callback: Callback[js.Object]): Unit = js.native
    def deleteVault(params: DeleteVaultInput): Request[js.Object] = js.native
    def deleteVaultNotifications(params: DeleteVaultNotificationsInput, callback: Callback[js.Object]): Unit = js.native
    def deleteVaultNotifications(params: DeleteVaultNotificationsInput): Request[js.Object] = js.native
    def describeJob(params: DescribeJobInput, callback: Callback[GlacierJobDescription]): Unit = js.native
    def describeJob(params: DescribeJobInput): Request[GlacierJobDescription] = js.native
    def describeVault(params: DescribeVaultInput, callback: Callback[DescribeVaultOutput]): Unit = js.native
    def describeVault(params: DescribeVaultInput): Request[DescribeVaultOutput] = js.native
    def getDataRetrievalPolicy(params: GetDataRetrievalPolicyInput, callback: Callback[GetDataRetrievalPolicyOutput]): Unit = js.native
    def getDataRetrievalPolicy(params: GetDataRetrievalPolicyInput): Request[GetDataRetrievalPolicyOutput] = js.native
    def getJobOutput(params: GetJobOutputInput, callback: Callback[GetJobOutputOutput]): Unit = js.native
    def getJobOutput(params: GetJobOutputInput): Request[GetJobOutputOutput] = js.native
    def getVaultNotifications(params: GetVaultNotificationsInput, callback: Callback[GetVaultNotificationsOutput]): Unit = js.native
    def getVaultNotifications(params: GetVaultNotificationsInput): Request[GetVaultNotificationsOutput] = js.native
    def initiateJob(params: InitiateJobInput, callback: Callback[InitiateJobOutput]): Unit = js.native
    def initiateJob(params: InitiateJobInput): Request[InitiateJobOutput] = js.native
    def initiateMultipartUpload(params: InitiateMultipartUploadInput, callback: Callback[InitiateMultipartUploadOutput]): Unit = js.native
    def initiateMultipartUpload(params: InitiateMultipartUploadInput): Request[InitiateMultipartUploadOutput] = js.native
    def listJobs(params: ListJobsInput, callback: Callback[ListJobsOutput]): Unit = js.native
    def listJobs(params: ListJobsInput): Request[ListJobsOutput] = js.native
    def listMultipartUploads(params: ListMultipartUploadsInput, callback: Callback[ListMultipartUploadsOutput]): Unit = js.native
    def listMultipartUploads(params: ListMultipartUploadsInput): Request[ListMultipartUploadsOutput] = js.native
    def listParts(params: ListPartsInput, callback: Callback[ListPartsOutput]): Unit = js.native
    def listParts(params: ListPartsInput): Request[ListPartsOutput] = js.native
    def listVaults(params: ListVaultsInput, callback: Callback[ListVaultsOutput]): Unit = js.native
    def listVaults(params: ListVaultsInput): Request[ListVaultsOutput] = js.native
    def setDataRetrievalPolicy(params: SetDataRetrievalPolicyInput, callback: Callback[js.Object]): Unit = js.native
    def setDataRetrievalPolicy(params: SetDataRetrievalPolicyInput): Request[js.Object] = js.native
    def setVaultNotifications(params: SetVaultNotificationsInput, callback: Callback[js.Object]): Unit = js.native
    def setVaultNotifications(params: SetVaultNotificationsInput): Request[js.Object] = js.native
    def uploadArchive(params: UploadArchiveInput, callback: Callback[ArchiveCreationOutput]): Unit = js.native
    def uploadArchive(params: UploadArchiveInput): Request[ArchiveCreationOutput] = js.native
    def uploadMultipartPart(params: UploadMultipartPartInput, callback: Callback[UploadMultipartPartOutput]): Unit = js.native
    def uploadMultipartPart(params: UploadMultipartPartInput): Request[UploadMultipartPartOutput] = js.native
  }

  /**
   * <p>Provides options to abort a multipart upload identified by the upload ID. </p> <p>For information about the underlying REST API, go to <a href="http://docs.aws.amazon.com/amazonglacier/latest/dev/api-multipart-abort-upload.html">Abort Multipart Upload</a>. For conceptual information, go to <a href="http://docs.aws.amazon.com/amazonglacier/latest/dev/working-with-archives.html">Working with Archives in Amazon Glacier</a>.</p>
   */
  @js.native
  trait AbortMultipartUploadInput extends js.Object {
    var accountId: string
    var vaultName: string
    var uploadId: string
  }

  object AbortMultipartUploadInput {
    def apply(
      accountId: js.UndefOr[string] = js.undefined,
      vaultName: js.UndefOr[string] = js.undefined,
      uploadId: js.UndefOr[string] = js.undefined
    ): AbortMultipartUploadInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("accountId" -> accountId.map { x => x: js.Any }),
        ("vaultName" -> vaultName.map { x => x: js.Any }),
        ("uploadId" -> uploadId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AbortMultipartUploadInput]
    }
  }


  object ActionCodeEnum {
    val ArchiveRetrieval = "ArchiveRetrieval"
    val InventoryRetrieval = "InventoryRetrieval"

    val values = IndexedSeq(ArchiveRetrieval, InventoryRetrieval)
  }

  /**
   * <p>Contains the Amazon Glacier response to your request.</p> <p>For information about the underlying REST API, go to <a href="http://docs.aws.amazon.com/amazonglacier/latest/dev/api-archive-post.html">Upload Archive</a>. For conceptual information, go to <a href="http://docs.aws.amazon.com/amazonglacier/latest/dev/working-with-archives.html">Working with Archives in Amazon Glacier</a>.</p>
   */
  @js.native
  trait ArchiveCreationOutput extends js.Object {
    var location: string
    var checksum: string
    var archiveId: string
  }

  object ArchiveCreationOutput {
    def apply(
      location: js.UndefOr[string] = js.undefined,
      checksum: js.UndefOr[string] = js.undefined,
      archiveId: js.UndefOr[string] = js.undefined
    ): ArchiveCreationOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("location" -> location.map { x => x: js.Any }),
        ("checksum" -> checksum.map { x => x: js.Any }),
        ("archiveId" -> archiveId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ArchiveCreationOutput]
    }
  }

  /**
   * <p>Provides options to complete a multipart upload operation. This informs Amazon Glacier that all the archive parts have been uploaded and Amazon Glacier can now assemble the archive from the uploaded parts. After assembling and saving the archive to the vault, Amazon Glacier returns the URI path of the newly created archive resource.</p>
   */
  @js.native
  trait CompleteMultipartUploadInput extends js.Object {
    var accountId: string
    var uploadId: string
    var checksum: string
    var archiveSize: string
    var vaultName: string
  }

  object CompleteMultipartUploadInput {
    def apply(
      accountId: js.UndefOr[string] = js.undefined,
      uploadId: js.UndefOr[string] = js.undefined,
      checksum: js.UndefOr[string] = js.undefined,
      archiveSize: js.UndefOr[string] = js.undefined,
      vaultName: js.UndefOr[string] = js.undefined
    ): CompleteMultipartUploadInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("accountId" -> accountId.map { x => x: js.Any }),
        ("uploadId" -> uploadId.map { x => x: js.Any }),
        ("checksum" -> checksum.map { x => x: js.Any }),
        ("archiveSize" -> archiveSize.map { x => x: js.Any }),
        ("vaultName" -> vaultName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CompleteMultipartUploadInput]
    }
  }

  /**
   * <p>Provides options to create a vault.</p>
   */
  @js.native
  trait CreateVaultInput extends js.Object {
    var accountId: string
    var vaultName: string
  }

  object CreateVaultInput {
    def apply(
      accountId: js.UndefOr[string] = js.undefined,
      vaultName: js.UndefOr[string] = js.undefined
    ): CreateVaultInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("accountId" -> accountId.map { x => x: js.Any }),
        ("vaultName" -> vaultName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateVaultInput]
    }
  }

  /**
   * <p>Contains the Amazon Glacier response to your request.</p>
   */
  @js.native
  trait CreateVaultOutput extends js.Object {
    var location: string
  }

  object CreateVaultOutput {
    def apply(
      location: js.UndefOr[string] = js.undefined
    ): CreateVaultOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("location" -> location.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateVaultOutput]
    }
  }

  /**
   * <p>Data retrieval policy.</p>
   */
  @js.native
  trait DataRetrievalPolicy extends js.Object {
    var Rules: DataRetrievalRulesList
  }

  object DataRetrievalPolicy {
    def apply(
      Rules: js.UndefOr[DataRetrievalRulesList] = js.undefined
    ): DataRetrievalPolicy = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Rules" -> Rules.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DataRetrievalPolicy]
    }
  }

  /**
   * <p>Data retrieval policy rule.</p>
   */
  @js.native
  trait DataRetrievalRule extends js.Object {
    var Strategy: string
    var BytesPerHour: NullableLong
  }

  object DataRetrievalRule {
    def apply(
      Strategy: js.UndefOr[string] = js.undefined,
      BytesPerHour: js.UndefOr[NullableLong] = js.undefined
    ): DataRetrievalRule = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Strategy" -> Strategy.map { x => x: js.Any }),
        ("BytesPerHour" -> BytesPerHour.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DataRetrievalRule]
    }
  }

  /**
   * <p>Provides options for deleting an archive from an Amazon Glacier vault.</p>
   */
  @js.native
  trait DeleteArchiveInput extends js.Object {
    var accountId: string
    var vaultName: string
    var archiveId: string
  }

  object DeleteArchiveInput {
    def apply(
      accountId: js.UndefOr[string] = js.undefined,
      vaultName: js.UndefOr[string] = js.undefined,
      archiveId: js.UndefOr[string] = js.undefined
    ): DeleteArchiveInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("accountId" -> accountId.map { x => x: js.Any }),
        ("vaultName" -> vaultName.map { x => x: js.Any }),
        ("archiveId" -> archiveId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteArchiveInput]
    }
  }

  /**
   * <p>Provides options for deleting a vault from Amazon Glacier.</p>
   */
  @js.native
  trait DeleteVaultInput extends js.Object {
    var accountId: string
    var vaultName: string
  }

  object DeleteVaultInput {
    def apply(
      accountId: js.UndefOr[string] = js.undefined,
      vaultName: js.UndefOr[string] = js.undefined
    ): DeleteVaultInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("accountId" -> accountId.map { x => x: js.Any }),
        ("vaultName" -> vaultName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteVaultInput]
    }
  }

  /**
   * <p>Provides options for deleting a vault notification configuration from an Amazon Glacier vault.</p>
   */
  @js.native
  trait DeleteVaultNotificationsInput extends js.Object {
    var accountId: string
    var vaultName: string
  }

  object DeleteVaultNotificationsInput {
    def apply(
      accountId: js.UndefOr[string] = js.undefined,
      vaultName: js.UndefOr[string] = js.undefined
    ): DeleteVaultNotificationsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("accountId" -> accountId.map { x => x: js.Any }),
        ("vaultName" -> vaultName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteVaultNotificationsInput]
    }
  }

  /**
   * <p>Provides options for retrieving a job description.</p>
   */
  @js.native
  trait DescribeJobInput extends js.Object {
    var accountId: string
    var vaultName: string
    var jobId: string
  }

  object DescribeJobInput {
    def apply(
      accountId: js.UndefOr[string] = js.undefined,
      vaultName: js.UndefOr[string] = js.undefined,
      jobId: js.UndefOr[string] = js.undefined
    ): DescribeJobInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("accountId" -> accountId.map { x => x: js.Any }),
        ("vaultName" -> vaultName.map { x => x: js.Any }),
        ("jobId" -> jobId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeJobInput]
    }
  }

  /**
   * <p>Provides options for retrieving metadata for a specific vault in Amazon Glacier.</p>
   */
  @js.native
  trait DescribeVaultInput extends js.Object {
    var accountId: string
    var vaultName: string
  }

  object DescribeVaultInput {
    def apply(
      accountId: js.UndefOr[string] = js.undefined,
      vaultName: js.UndefOr[string] = js.undefined
    ): DescribeVaultInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("accountId" -> accountId.map { x => x: js.Any }),
        ("vaultName" -> vaultName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeVaultInput]
    }
  }

  /**
   * <p>Contains the Amazon Glacier response to your request.</p>
   */
  @js.native
  trait DescribeVaultOutput extends js.Object {
    var CreationDate: string
    var LastInventoryDate: string
    var SizeInBytes: long
    var VaultARN: string
    var VaultName: string
    var NumberOfArchives: long
  }

  object DescribeVaultOutput {
    def apply(
      CreationDate: js.UndefOr[string] = js.undefined,
      LastInventoryDate: js.UndefOr[string] = js.undefined,
      SizeInBytes: js.UndefOr[long] = js.undefined,
      VaultARN: js.UndefOr[string] = js.undefined,
      VaultName: js.UndefOr[string] = js.undefined,
      NumberOfArchives: js.UndefOr[long] = js.undefined
    ): DescribeVaultOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("CreationDate" -> CreationDate.map { x => x: js.Any }),
        ("LastInventoryDate" -> LastInventoryDate.map { x => x: js.Any }),
        ("SizeInBytes" -> SizeInBytes.map { x => x: js.Any }),
        ("VaultARN" -> VaultARN.map { x => x: js.Any }),
        ("VaultName" -> VaultName.map { x => x: js.Any }),
        ("NumberOfArchives" -> NumberOfArchives.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeVaultOutput]
    }
  }

  /**
   * <p>Input for GetDataRetrievalPolicy.</p>
   */
  @js.native
  trait GetDataRetrievalPolicyInput extends js.Object {
    var accountId: string
  }

  object GetDataRetrievalPolicyInput {
    def apply(
      accountId: js.UndefOr[string] = js.undefined
    ): GetDataRetrievalPolicyInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("accountId" -> accountId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDataRetrievalPolicyInput]
    }
  }

  /**
   * <p>Contains the Amazon Glacier response to the <code>GetDataRetrievalPolicy</code> request.</p>
   */
  @js.native
  trait GetDataRetrievalPolicyOutput extends js.Object {
    var Policy: DataRetrievalPolicy
  }

  object GetDataRetrievalPolicyOutput {
    def apply(
      Policy: js.UndefOr[DataRetrievalPolicy] = js.undefined
    ): GetDataRetrievalPolicyOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Policy" -> Policy.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDataRetrievalPolicyOutput]
    }
  }

  /**
   * <p>Provides options for downloading output of an Amazon Glacier job.</p>
   */
  @js.native
  trait GetJobOutputInput extends js.Object {
    var accountId: string
    var vaultName: string
    var jobId: string
    var range: string
  }

  object GetJobOutputInput {
    def apply(
      accountId: js.UndefOr[string] = js.undefined,
      vaultName: js.UndefOr[string] = js.undefined,
      jobId: js.UndefOr[string] = js.undefined,
      range: js.UndefOr[string] = js.undefined
    ): GetJobOutputInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("accountId" -> accountId.map { x => x: js.Any }),
        ("vaultName" -> vaultName.map { x => x: js.Any }),
        ("jobId" -> jobId.map { x => x: js.Any }),
        ("range" -> range.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetJobOutputInput]
    }
  }

  /**
   * <p>Contains the Amazon Glacier response to your request.</p>
   */
  @js.native
  trait GetJobOutputOutput extends js.Object {
    var body: Stream
    var checksum: string
    var contentType: string
    var status: httpstatus
    var contentRange: string
    var acceptRanges: string
    var archiveDescription: string
  }

  object GetJobOutputOutput {
    def apply(
      body: js.UndefOr[Stream] = js.undefined,
      checksum: js.UndefOr[string] = js.undefined,
      contentType: js.UndefOr[string] = js.undefined,
      status: js.UndefOr[httpstatus] = js.undefined,
      contentRange: js.UndefOr[string] = js.undefined,
      acceptRanges: js.UndefOr[string] = js.undefined,
      archiveDescription: js.UndefOr[string] = js.undefined
    ): GetJobOutputOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("body" -> body.map { x => x: js.Any }),
        ("checksum" -> checksum.map { x => x: js.Any }),
        ("contentType" -> contentType.map { x => x: js.Any }),
        ("status" -> status.map { x => x: js.Any }),
        ("contentRange" -> contentRange.map { x => x: js.Any }),
        ("acceptRanges" -> acceptRanges.map { x => x: js.Any }),
        ("archiveDescription" -> archiveDescription.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetJobOutputOutput]
    }
  }

  /**
   * <p>Provides options for retrieving the notification configuration set on an Amazon Glacier vault.</p>
   */
  @js.native
  trait GetVaultNotificationsInput extends js.Object {
    var accountId: string
    var vaultName: string
  }

  object GetVaultNotificationsInput {
    def apply(
      accountId: js.UndefOr[string] = js.undefined,
      vaultName: js.UndefOr[string] = js.undefined
    ): GetVaultNotificationsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("accountId" -> accountId.map { x => x: js.Any }),
        ("vaultName" -> vaultName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetVaultNotificationsInput]
    }
  }

  /**
   * <p>Contains the Amazon Glacier response to your request.</p>
   */
  @js.native
  trait GetVaultNotificationsOutput extends js.Object {
    var vaultNotificationConfig: VaultNotificationConfig
  }

  object GetVaultNotificationsOutput {
    def apply(
      vaultNotificationConfig: js.UndefOr[VaultNotificationConfig] = js.undefined
    ): GetVaultNotificationsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("vaultNotificationConfig" -> vaultNotificationConfig.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetVaultNotificationsOutput]
    }
  }

  /**
   * <p>Describes an Amazon Glacier job.</p>
   */
  @js.native
  trait GlacierJobDescription extends js.Object {
    var CreationDate: string
    var StatusMessage: string
    var JobDescription: string
    var CompletionDate: string
    var ArchiveSHA256TreeHash: string
    var InventoryRetrievalParameters: InventoryRetrievalJobDescription
    var SHA256TreeHash: string
    var StatusCode: StatusCode
    var JobId: string
    var Completed: boolean
    var RetrievalByteRange: string
    var ArchiveId: string
    var ArchiveSizeInBytes: Size
    var VaultARN: string
    var SNSTopic: string
    var InventorySizeInBytes: Size
    var Action: ActionCode
  }

  object GlacierJobDescription {
    def apply(
      CreationDate: js.UndefOr[string] = js.undefined,
      StatusMessage: js.UndefOr[string] = js.undefined,
      JobDescription: js.UndefOr[string] = js.undefined,
      CompletionDate: js.UndefOr[string] = js.undefined,
      ArchiveSHA256TreeHash: js.UndefOr[string] = js.undefined,
      InventoryRetrievalParameters: js.UndefOr[InventoryRetrievalJobDescription] = js.undefined,
      SHA256TreeHash: js.UndefOr[string] = js.undefined,
      StatusCode: js.UndefOr[StatusCode] = js.undefined,
      JobId: js.UndefOr[string] = js.undefined,
      Completed: js.UndefOr[boolean] = js.undefined,
      RetrievalByteRange: js.UndefOr[string] = js.undefined,
      ArchiveId: js.UndefOr[string] = js.undefined,
      ArchiveSizeInBytes: js.UndefOr[Size] = js.undefined,
      VaultARN: js.UndefOr[string] = js.undefined,
      SNSTopic: js.UndefOr[string] = js.undefined,
      InventorySizeInBytes: js.UndefOr[Size] = js.undefined,
      Action: js.UndefOr[ActionCode] = js.undefined
    ): GlacierJobDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("CreationDate" -> CreationDate.map { x => x: js.Any }),
        ("StatusMessage" -> StatusMessage.map { x => x: js.Any }),
        ("JobDescription" -> JobDescription.map { x => x: js.Any }),
        ("CompletionDate" -> CompletionDate.map { x => x: js.Any }),
        ("ArchiveSHA256TreeHash" -> ArchiveSHA256TreeHash.map { x => x: js.Any }),
        ("InventoryRetrievalParameters" -> InventoryRetrievalParameters.map { x => x: js.Any }),
        ("SHA256TreeHash" -> SHA256TreeHash.map { x => x: js.Any }),
        ("StatusCode" -> StatusCode.map { x => x: js.Any }),
        ("JobId" -> JobId.map { x => x: js.Any }),
        ("Completed" -> Completed.map { x => x: js.Any }),
        ("RetrievalByteRange" -> RetrievalByteRange.map { x => x: js.Any }),
        ("ArchiveId" -> ArchiveId.map { x => x: js.Any }),
        ("ArchiveSizeInBytes" -> ArchiveSizeInBytes.map { x => x: js.Any }),
        ("VaultARN" -> VaultARN.map { x => x: js.Any }),
        ("SNSTopic" -> SNSTopic.map { x => x: js.Any }),
        ("InventorySizeInBytes" -> InventorySizeInBytes.map { x => x: js.Any }),
        ("Action" -> Action.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GlacierJobDescription]
    }
  }

  /**
   * <p>Provides options for initiating an Amazon Glacier job.</p>
   */
  @js.native
  trait InitiateJobInput extends js.Object {
    var accountId: string
    var vaultName: string
    var jobParameters: JobParameters
  }

  object InitiateJobInput {
    def apply(
      accountId: js.UndefOr[string] = js.undefined,
      vaultName: js.UndefOr[string] = js.undefined,
      jobParameters: js.UndefOr[JobParameters] = js.undefined
    ): InitiateJobInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("accountId" -> accountId.map { x => x: js.Any }),
        ("vaultName" -> vaultName.map { x => x: js.Any }),
        ("jobParameters" -> jobParameters.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InitiateJobInput]
    }
  }

  /**
   * <p>Contains the Amazon Glacier response to your request.</p>
   */
  @js.native
  trait InitiateJobOutput extends js.Object {
    var location: string
    var jobId: string
  }

  object InitiateJobOutput {
    def apply(
      location: js.UndefOr[string] = js.undefined,
      jobId: js.UndefOr[string] = js.undefined
    ): InitiateJobOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("location" -> location.map { x => x: js.Any }),
        ("jobId" -> jobId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InitiateJobOutput]
    }
  }

  /**
   * <p>Provides options for initiating a multipart upload to an Amazon Glacier vault.</p>
   */
  @js.native
  trait InitiateMultipartUploadInput extends js.Object {
    var accountId: string
    var vaultName: string
    var archiveDescription: string
    var partSize: string
  }

  object InitiateMultipartUploadInput {
    def apply(
      accountId: js.UndefOr[string] = js.undefined,
      vaultName: js.UndefOr[string] = js.undefined,
      archiveDescription: js.UndefOr[string] = js.undefined,
      partSize: js.UndefOr[string] = js.undefined
    ): InitiateMultipartUploadInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("accountId" -> accountId.map { x => x: js.Any }),
        ("vaultName" -> vaultName.map { x => x: js.Any }),
        ("archiveDescription" -> archiveDescription.map { x => x: js.Any }),
        ("partSize" -> partSize.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InitiateMultipartUploadInput]
    }
  }

  /**
   * <p>Contains the Amazon Glacier response to your request.</p>
   */
  @js.native
  trait InitiateMultipartUploadOutput extends js.Object {
    var location: string
    var uploadId: string
  }

  object InitiateMultipartUploadOutput {
    def apply(
      location: js.UndefOr[string] = js.undefined,
      uploadId: js.UndefOr[string] = js.undefined
    ): InitiateMultipartUploadOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("location" -> location.map { x => x: js.Any }),
        ("uploadId" -> uploadId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InitiateMultipartUploadOutput]
    }
  }

  /**
   * <p>Returned if a parameter of the request is incorrectly specified. </p>
   */
  @js.native
  trait InvalidParameterValueExceptionException extends js.Object {
    var `type`: string
    var code: string
    var message: string
  }

  /**
   * <p>Describes the options for a range inventory retrieval job.</p>
   */
  @js.native
  trait InventoryRetrievalJobDescription extends js.Object {
    var Format: string
    var Limit: string
    var StartDate: DateTime
    var EndDate: DateTime
    var Marker: string
  }

  object InventoryRetrievalJobDescription {
    def apply(
      Format: js.UndefOr[string] = js.undefined,
      Limit: js.UndefOr[string] = js.undefined,
      StartDate: js.UndefOr[DateTime] = js.undefined,
      EndDate: js.UndefOr[DateTime] = js.undefined,
      Marker: js.UndefOr[string] = js.undefined
    ): InventoryRetrievalJobDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Format" -> Format.map { x => x: js.Any }),
        ("Limit" -> Limit.map { x => x: js.Any }),
        ("StartDate" -> StartDate.map { x => x: js.Any }),
        ("EndDate" -> EndDate.map { x => x: js.Any }),
        ("Marker" -> Marker.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InventoryRetrievalJobDescription]
    }
  }

  /**
   * <p>Provides options for specifying a range inventory retrieval job.</p>
   */
  @js.native
  trait InventoryRetrievalJobInput extends js.Object {
    var StartDate: string
    var EndDate: string
    var Limit: string
    var Marker: string
  }

  object InventoryRetrievalJobInput {
    def apply(
      StartDate: js.UndefOr[string] = js.undefined,
      EndDate: js.UndefOr[string] = js.undefined,
      Limit: js.UndefOr[string] = js.undefined,
      Marker: js.UndefOr[string] = js.undefined
    ): InventoryRetrievalJobInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("StartDate" -> StartDate.map { x => x: js.Any }),
        ("EndDate" -> EndDate.map { x => x: js.Any }),
        ("Limit" -> Limit.map { x => x: js.Any }),
        ("Marker" -> Marker.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InventoryRetrievalJobInput]
    }
  }

  /**
   * <p>Provides options for defining a job.</p>
   */
  @js.native
  trait JobParameters extends js.Object {
    var Format: string
    var InventoryRetrievalParameters: InventoryRetrievalJobInput
    var RetrievalByteRange: string
    var Description: string
    var ArchiveId: string
    var SNSTopic: string
    var Type: string
  }

  object JobParameters {
    def apply(
      Format: js.UndefOr[string] = js.undefined,
      InventoryRetrievalParameters: js.UndefOr[InventoryRetrievalJobInput] = js.undefined,
      RetrievalByteRange: js.UndefOr[string] = js.undefined,
      Description: js.UndefOr[string] = js.undefined,
      ArchiveId: js.UndefOr[string] = js.undefined,
      SNSTopic: js.UndefOr[string] = js.undefined,
      Type: js.UndefOr[string] = js.undefined
    ): JobParameters = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Format" -> Format.map { x => x: js.Any }),
        ("InventoryRetrievalParameters" -> InventoryRetrievalParameters.map { x => x: js.Any }),
        ("RetrievalByteRange" -> RetrievalByteRange.map { x => x: js.Any }),
        ("Description" -> Description.map { x => x: js.Any }),
        ("ArchiveId" -> ArchiveId.map { x => x: js.Any }),
        ("SNSTopic" -> SNSTopic.map { x => x: js.Any }),
        ("Type" -> Type.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[JobParameters]
    }
  }

  /**
   * <p>Returned if the request results in a vault or account limit being exceeded.</p>
   */
  @js.native
  trait LimitExceededExceptionException extends js.Object {
    var `type`: string
    var code: string
    var message: string
  }

  /**
   * <p>Provides options for retrieving a job list for an Amazon Glacier vault.</p>
   */
  @js.native
  trait ListJobsInput extends js.Object {
    var marker: string
    var accountId: string
    var statuscode: string
    var completed: string
    var vaultName: string
    var limit: string
  }

  object ListJobsInput {
    def apply(
      marker: js.UndefOr[string] = js.undefined,
      accountId: js.UndefOr[string] = js.undefined,
      statuscode: js.UndefOr[string] = js.undefined,
      completed: js.UndefOr[string] = js.undefined,
      vaultName: js.UndefOr[string] = js.undefined,
      limit: js.UndefOr[string] = js.undefined
    ): ListJobsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("marker" -> marker.map { x => x: js.Any }),
        ("accountId" -> accountId.map { x => x: js.Any }),
        ("statuscode" -> statuscode.map { x => x: js.Any }),
        ("completed" -> completed.map { x => x: js.Any }),
        ("vaultName" -> vaultName.map { x => x: js.Any }),
        ("limit" -> limit.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListJobsInput]
    }
  }

  /**
   * <p>Contains the Amazon Glacier response to your request.</p>
   */
  @js.native
  trait ListJobsOutput extends js.Object {
    var JobList: JobList
    var Marker: string
  }

  object ListJobsOutput {
    def apply(
      JobList: js.UndefOr[JobList] = js.undefined,
      Marker: js.UndefOr[string] = js.undefined
    ): ListJobsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("JobList" -> JobList.map { x => x: js.Any }),
        ("Marker" -> Marker.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListJobsOutput]
    }
  }

  /**
   * <p>Provides options for retrieving list of in-progress multipart uploads for an Amazon Glacier vault.</p>
   */
  @js.native
  trait ListMultipartUploadsInput extends js.Object {
    var accountId: string
    var vaultName: string
    var marker: string
    var limit: string
  }

  object ListMultipartUploadsInput {
    def apply(
      accountId: js.UndefOr[string] = js.undefined,
      vaultName: js.UndefOr[string] = js.undefined,
      marker: js.UndefOr[string] = js.undefined,
      limit: js.UndefOr[string] = js.undefined
    ): ListMultipartUploadsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("accountId" -> accountId.map { x => x: js.Any }),
        ("vaultName" -> vaultName.map { x => x: js.Any }),
        ("marker" -> marker.map { x => x: js.Any }),
        ("limit" -> limit.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListMultipartUploadsInput]
    }
  }

  /**
   * <p>Contains the Amazon Glacier response to your request.</p>
   */
  @js.native
  trait ListMultipartUploadsOutput extends js.Object {
    var UploadsList: UploadsList
    var Marker: string
  }

  object ListMultipartUploadsOutput {
    def apply(
      UploadsList: js.UndefOr[UploadsList] = js.undefined,
      Marker: js.UndefOr[string] = js.undefined
    ): ListMultipartUploadsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("UploadsList" -> UploadsList.map { x => x: js.Any }),
        ("Marker" -> Marker.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListMultipartUploadsOutput]
    }
  }

  /**
   * <p>Provides options for retrieving a list of parts of an archive that have been uploaded in a specific multipart upload.</p>
   */
  @js.native
  trait ListPartsInput extends js.Object {
    var marker: string
    var accountId: string
    var uploadId: string
    var vaultName: string
    var limit: string
  }

  object ListPartsInput {
    def apply(
      marker: js.UndefOr[string] = js.undefined,
      accountId: js.UndefOr[string] = js.undefined,
      uploadId: js.UndefOr[string] = js.undefined,
      vaultName: js.UndefOr[string] = js.undefined,
      limit: js.UndefOr[string] = js.undefined
    ): ListPartsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("marker" -> marker.map { x => x: js.Any }),
        ("accountId" -> accountId.map { x => x: js.Any }),
        ("uploadId" -> uploadId.map { x => x: js.Any }),
        ("vaultName" -> vaultName.map { x => x: js.Any }),
        ("limit" -> limit.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListPartsInput]
    }
  }

  /**
   * <p>Contains the Amazon Glacier response to your request.</p>
   */
  @js.native
  trait ListPartsOutput extends js.Object {
    var CreationDate: string
    var MultipartUploadId: string
    var Parts: PartList
    var PartSizeInBytes: long
    var VaultARN: string
    var ArchiveDescription: string
    var Marker: string
  }

  object ListPartsOutput {
    def apply(
      CreationDate: js.UndefOr[string] = js.undefined,
      MultipartUploadId: js.UndefOr[string] = js.undefined,
      Parts: js.UndefOr[PartList] = js.undefined,
      PartSizeInBytes: js.UndefOr[long] = js.undefined,
      VaultARN: js.UndefOr[string] = js.undefined,
      ArchiveDescription: js.UndefOr[string] = js.undefined,
      Marker: js.UndefOr[string] = js.undefined
    ): ListPartsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("CreationDate" -> CreationDate.map { x => x: js.Any }),
        ("MultipartUploadId" -> MultipartUploadId.map { x => x: js.Any }),
        ("Parts" -> Parts.map { x => x: js.Any }),
        ("PartSizeInBytes" -> PartSizeInBytes.map { x => x: js.Any }),
        ("VaultARN" -> VaultARN.map { x => x: js.Any }),
        ("ArchiveDescription" -> ArchiveDescription.map { x => x: js.Any }),
        ("Marker" -> Marker.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListPartsOutput]
    }
  }

  /**
   * <p>Provides options to retrieve the vault list owned by the calling user's account. The list provides metadata information for each vault.</p>
   */
  @js.native
  trait ListVaultsInput extends js.Object {
    var accountId: string
    var marker: string
    var limit: string
  }

  object ListVaultsInput {
    def apply(
      accountId: js.UndefOr[string] = js.undefined,
      marker: js.UndefOr[string] = js.undefined,
      limit: js.UndefOr[string] = js.undefined
    ): ListVaultsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("accountId" -> accountId.map { x => x: js.Any }),
        ("marker" -> marker.map { x => x: js.Any }),
        ("limit" -> limit.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListVaultsInput]
    }
  }

  /**
   * <p>Contains the Amazon Glacier response to your request.</p>
   */
  @js.native
  trait ListVaultsOutput extends js.Object {
    var VaultList: VaultList
    var Marker: string
  }

  object ListVaultsOutput {
    def apply(
      VaultList: js.UndefOr[VaultList] = js.undefined,
      Marker: js.UndefOr[string] = js.undefined
    ): ListVaultsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("VaultList" -> VaultList.map { x => x: js.Any }),
        ("Marker" -> Marker.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListVaultsOutput]
    }
  }

  /**
   * <p>Returned if a required header or parameter is missing from the request.</p>
   */
  @js.native
  trait MissingParameterValueExceptionException extends js.Object {
    var `type`: string
    var code: string
    var message: string
  }

  /**
   * <p>A list of the part sizes of the multipart upload.</p>
   */
  @js.native
  trait PartListElement extends js.Object {
    var RangeInBytes: string
    var SHA256TreeHash: string
  }

  object PartListElement {
    def apply(
      RangeInBytes: js.UndefOr[string] = js.undefined,
      SHA256TreeHash: js.UndefOr[string] = js.undefined
    ): PartListElement = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("RangeInBytes" -> RangeInBytes.map { x => x: js.Any }),
        ("SHA256TreeHash" -> SHA256TreeHash.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PartListElement]
    }
  }

  /**
   * <p>Returned if a retrieval job would exceed the current data policy's retrieval rate limit. For more information about data retrieval policies,</p>
   */
  @js.native
  trait PolicyEnforcedExceptionException extends js.Object {
    var `type`: string
    var code: string
    var message: string
  }

  /**
   * <p>Returned if, when uploading an archive, Amazon Glacier times out while receiving the upload.</p>
   */
  @js.native
  trait RequestTimeoutExceptionException extends js.Object {
    var `type`: string
    var code: string
    var message: string
  }

  /**
   * <p>Returned if the specified resource, such as a vault, upload ID, or job ID, does not exist.</p>
   */
  @js.native
  trait ResourceNotFoundExceptionException extends js.Object {
    var `type`: string
    var code: string
    var message: string
  }

  /**
   * <p>Returned if the service cannot complete the request.</p>
   */
  @js.native
  trait ServiceUnavailableExceptionException extends js.Object {
    var `type`: string
    var code: string
    var message: string
  }

  /**
   * <p>SetDataRetrievalPolicy input.</p>
   */
  @js.native
  trait SetDataRetrievalPolicyInput extends js.Object {
    var accountId: string
    var Policy: DataRetrievalPolicy
  }

  object SetDataRetrievalPolicyInput {
    def apply(
      accountId: js.UndefOr[string] = js.undefined,
      Policy: js.UndefOr[DataRetrievalPolicy] = js.undefined
    ): SetDataRetrievalPolicyInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("accountId" -> accountId.map { x => x: js.Any }),
        ("Policy" -> Policy.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SetDataRetrievalPolicyInput]
    }
  }

  /**
   * <p>Provides options to configure notifications that will be sent when specific events happen to a vault.</p>
   */
  @js.native
  trait SetVaultNotificationsInput extends js.Object {
    var accountId: string
    var vaultName: string
    var vaultNotificationConfig: VaultNotificationConfig
  }

  object SetVaultNotificationsInput {
    def apply(
      accountId: js.UndefOr[string] = js.undefined,
      vaultName: js.UndefOr[string] = js.undefined,
      vaultNotificationConfig: js.UndefOr[VaultNotificationConfig] = js.undefined
    ): SetVaultNotificationsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("accountId" -> accountId.map { x => x: js.Any }),
        ("vaultName" -> vaultName.map { x => x: js.Any }),
        ("vaultNotificationConfig" -> vaultNotificationConfig.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SetVaultNotificationsInput]
    }
  }


  object StatusCodeEnum {
    val InProgress = "InProgress"
    val Succeeded = "Succeeded"
    val Failed = "Failed"

    val values = IndexedSeq(InProgress, Succeeded, Failed)
  }

  /**
   * <p>Provides options to add an archive to a vault.</p>
   */
  @js.native
  trait UploadArchiveInput extends js.Object {
    var body: Stream
    var accountId: string
    var checksum: string
    var vaultName: string
    var archiveDescription: string
  }

  object UploadArchiveInput {
    def apply(
      body: js.UndefOr[Stream] = js.undefined,
      accountId: js.UndefOr[string] = js.undefined,
      checksum: js.UndefOr[string] = js.undefined,
      vaultName: js.UndefOr[string] = js.undefined,
      archiveDescription: js.UndefOr[string] = js.undefined
    ): UploadArchiveInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("body" -> body.map { x => x: js.Any }),
        ("accountId" -> accountId.map { x => x: js.Any }),
        ("checksum" -> checksum.map { x => x: js.Any }),
        ("vaultName" -> vaultName.map { x => x: js.Any }),
        ("archiveDescription" -> archiveDescription.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UploadArchiveInput]
    }
  }

  /**
   * <p>A list of in-progress multipart uploads for a vault.</p>
   */
  @js.native
  trait UploadListElement extends js.Object {
    var CreationDate: string
    var MultipartUploadId: string
    var PartSizeInBytes: long
    var VaultARN: string
    var ArchiveDescription: string
  }

  object UploadListElement {
    def apply(
      CreationDate: js.UndefOr[string] = js.undefined,
      MultipartUploadId: js.UndefOr[string] = js.undefined,
      PartSizeInBytes: js.UndefOr[long] = js.undefined,
      VaultARN: js.UndefOr[string] = js.undefined,
      ArchiveDescription: js.UndefOr[string] = js.undefined
    ): UploadListElement = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("CreationDate" -> CreationDate.map { x => x: js.Any }),
        ("MultipartUploadId" -> MultipartUploadId.map { x => x: js.Any }),
        ("PartSizeInBytes" -> PartSizeInBytes.map { x => x: js.Any }),
        ("VaultARN" -> VaultARN.map { x => x: js.Any }),
        ("ArchiveDescription" -> ArchiveDescription.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UploadListElement]
    }
  }

  /**
   * <p>Provides options to upload a part of an archive in a multipart upload operation.</p>
   */
  @js.native
  trait UploadMultipartPartInput extends js.Object {
    var body: Stream
    var accountId: string
    var uploadId: string
    var checksum: string
    var range: string
    var vaultName: string
  }

  object UploadMultipartPartInput {
    def apply(
      body: js.UndefOr[Stream] = js.undefined,
      accountId: js.UndefOr[string] = js.undefined,
      uploadId: js.UndefOr[string] = js.undefined,
      checksum: js.UndefOr[string] = js.undefined,
      range: js.UndefOr[string] = js.undefined,
      vaultName: js.UndefOr[string] = js.undefined
    ): UploadMultipartPartInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("body" -> body.map { x => x: js.Any }),
        ("accountId" -> accountId.map { x => x: js.Any }),
        ("uploadId" -> uploadId.map { x => x: js.Any }),
        ("checksum" -> checksum.map { x => x: js.Any }),
        ("range" -> range.map { x => x: js.Any }),
        ("vaultName" -> vaultName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UploadMultipartPartInput]
    }
  }

  /**
   * <p>Contains the Amazon Glacier response to your request.</p>
   */
  @js.native
  trait UploadMultipartPartOutput extends js.Object {
    var checksum: string
  }

  object UploadMultipartPartOutput {
    def apply(
      checksum: js.UndefOr[string] = js.undefined
    ): UploadMultipartPartOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("checksum" -> checksum.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UploadMultipartPartOutput]
    }
  }

  /**
   * <p>Represents a vault's notification configuration.</p>
   */
  @js.native
  trait VaultNotificationConfig extends js.Object {
    var SNSTopic: string
    var Events: NotificationEventList
  }

  object VaultNotificationConfig {
    def apply(
      SNSTopic: js.UndefOr[string] = js.undefined,
      Events: js.UndefOr[NotificationEventList] = js.undefined
    ): VaultNotificationConfig = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("SNSTopic" -> SNSTopic.map { x => x: js.Any }),
        ("Events" -> Events.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VaultNotificationConfig]
    }
  }
}
