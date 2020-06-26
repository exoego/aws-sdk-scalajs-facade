package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

package object qldb {
  type Arn                 = String
  type DeletionProtection  = Boolean
  type Digest              = js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type IonText             = String
  type JournalS3ExportList = js.Array[JournalS3ExportDescription]
  type LedgerList          = js.Array[LedgerSummary]
  type LedgerName          = String
  type MaxResults          = Int
  type NextToken           = String
  type S3Bucket            = String
  type S3Prefix            = String
  type TagKey              = String
  type TagKeyList          = js.Array[TagKey]
  type TagValue            = String
  type Tags                = js.Dictionary[TagValue]
  type Timestamp           = js.Date
  type UniqueId            = String

  implicit final class QLDBOps(private val service: QLDB) extends AnyVal {

    @inline def createLedgerFuture(params: CreateLedgerRequest): Future[CreateLedgerResponse] =
      service.createLedger(params).promise().toFuture
    @inline def deleteLedgerFuture(params: DeleteLedgerRequest): Future[js.Object] =
      service.deleteLedger(params).promise().toFuture
    @inline def describeJournalS3ExportFuture(
        params: DescribeJournalS3ExportRequest
    ): Future[DescribeJournalS3ExportResponse] = service.describeJournalS3Export(params).promise().toFuture
    @inline def describeLedgerFuture(params: DescribeLedgerRequest): Future[DescribeLedgerResponse] =
      service.describeLedger(params).promise().toFuture
    @inline def exportJournalToS3Future(params: ExportJournalToS3Request): Future[ExportJournalToS3Response] =
      service.exportJournalToS3(params).promise().toFuture
    @inline def getBlockFuture(params: GetBlockRequest): Future[GetBlockResponse] =
      service.getBlock(params).promise().toFuture
    @inline def getDigestFuture(params: GetDigestRequest): Future[GetDigestResponse] =
      service.getDigest(params).promise().toFuture
    @inline def getRevisionFuture(params: GetRevisionRequest): Future[GetRevisionResponse] =
      service.getRevision(params).promise().toFuture
    @inline def listJournalS3ExportsForLedgerFuture(
        params: ListJournalS3ExportsForLedgerRequest
    ): Future[ListJournalS3ExportsForLedgerResponse] = service.listJournalS3ExportsForLedger(params).promise().toFuture
    @inline def listJournalS3ExportsFuture(params: ListJournalS3ExportsRequest): Future[ListJournalS3ExportsResponse] =
      service.listJournalS3Exports(params).promise().toFuture
    @inline def listLedgersFuture(params: ListLedgersRequest): Future[ListLedgersResponse] =
      service.listLedgers(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] =
      service.listTagsForResource(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] =
      service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] =
      service.untagResource(params).promise().toFuture
    @inline def updateLedgerFuture(params: UpdateLedgerRequest): Future[UpdateLedgerResponse] =
      service.updateLedger(params).promise().toFuture
  }
}

package qldb {
  @js.native
  @JSImport("aws-sdk", "QLDB")
  class QLDB() extends js.Object {
    def this(config: AWSConfig) = this()

    def createLedger(params: CreateLedgerRequest): Request[CreateLedgerResponse] = js.native
    def deleteLedger(params: DeleteLedgerRequest): Request[js.Object]            = js.native
    def describeJournalS3Export(params: DescribeJournalS3ExportRequest): Request[DescribeJournalS3ExportResponse] =
      js.native
    def describeLedger(params: DescribeLedgerRequest): Request[DescribeLedgerResponse]                   = js.native
    def exportJournalToS3(params: ExportJournalToS3Request): Request[ExportJournalToS3Response]          = js.native
    def getBlock(params: GetBlockRequest): Request[GetBlockResponse]                                     = js.native
    def getDigest(params: GetDigestRequest): Request[GetDigestResponse]                                  = js.native
    def getRevision(params: GetRevisionRequest): Request[GetRevisionResponse]                            = js.native
    def listJournalS3Exports(params: ListJournalS3ExportsRequest): Request[ListJournalS3ExportsResponse] = js.native
    def listJournalS3ExportsForLedger(
        params: ListJournalS3ExportsForLedgerRequest
    ): Request[ListJournalS3ExportsForLedgerResponse]                                                 = js.native
    def listLedgers(params: ListLedgersRequest): Request[ListLedgersResponse]                         = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse]                         = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse]                   = js.native
    def updateLedger(params: UpdateLedgerRequest): Request[UpdateLedgerResponse]                      = js.native
  }

  @js.native
  trait CreateLedgerRequest extends js.Object {
    var Name: LedgerName
    var PermissionsMode: PermissionsMode
    var DeletionProtection: js.UndefOr[DeletionProtection]
    var Tags: js.UndefOr[Tags]
  }

  object CreateLedgerRequest {
    @inline
    def apply(
        Name: LedgerName,
        PermissionsMode: PermissionsMode,
        DeletionProtection: js.UndefOr[DeletionProtection] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): CreateLedgerRequest = {
      val __obj = js.Dynamic.literal(
        "Name"            -> Name.asInstanceOf[js.Any],
        "PermissionsMode" -> PermissionsMode.asInstanceOf[js.Any]
      )

      DeletionProtection.foreach(__v => __obj.updateDynamic("DeletionProtection")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateLedgerRequest]
    }
  }

  @js.native
  trait CreateLedgerResponse extends js.Object {
    var Arn: js.UndefOr[Arn]
    var CreationDateTime: js.UndefOr[Timestamp]
    var DeletionProtection: js.UndefOr[DeletionProtection]
    var Name: js.UndefOr[LedgerName]
    var State: js.UndefOr[LedgerState]
  }

  object CreateLedgerResponse {
    @inline
    def apply(
        Arn: js.UndefOr[Arn] = js.undefined,
        CreationDateTime: js.UndefOr[Timestamp] = js.undefined,
        DeletionProtection: js.UndefOr[DeletionProtection] = js.undefined,
        Name: js.UndefOr[LedgerName] = js.undefined,
        State: js.UndefOr[LedgerState] = js.undefined
    ): CreateLedgerResponse = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      CreationDateTime.foreach(__v => __obj.updateDynamic("CreationDateTime")(__v.asInstanceOf[js.Any]))
      DeletionProtection.foreach(__v => __obj.updateDynamic("DeletionProtection")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateLedgerResponse]
    }
  }

  @js.native
  trait DeleteLedgerRequest extends js.Object {
    var Name: LedgerName
  }

  object DeleteLedgerRequest {
    @inline
    def apply(
        Name: LedgerName
    ): DeleteLedgerRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteLedgerRequest]
    }
  }

  @js.native
  trait DescribeJournalS3ExportRequest extends js.Object {
    var ExportId: UniqueId
    var Name: LedgerName
  }

  object DescribeJournalS3ExportRequest {
    @inline
    def apply(
        ExportId: UniqueId,
        Name: LedgerName
    ): DescribeJournalS3ExportRequest = {
      val __obj = js.Dynamic.literal(
        "ExportId" -> ExportId.asInstanceOf[js.Any],
        "Name"     -> Name.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeJournalS3ExportRequest]
    }
  }

  @js.native
  trait DescribeJournalS3ExportResponse extends js.Object {
    var ExportDescription: JournalS3ExportDescription
  }

  object DescribeJournalS3ExportResponse {
    @inline
    def apply(
        ExportDescription: JournalS3ExportDescription
    ): DescribeJournalS3ExportResponse = {
      val __obj = js.Dynamic.literal(
        "ExportDescription" -> ExportDescription.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeJournalS3ExportResponse]
    }
  }

  @js.native
  trait DescribeLedgerRequest extends js.Object {
    var Name: LedgerName
  }

  object DescribeLedgerRequest {
    @inline
    def apply(
        Name: LedgerName
    ): DescribeLedgerRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeLedgerRequest]
    }
  }

  @js.native
  trait DescribeLedgerResponse extends js.Object {
    var Arn: js.UndefOr[Arn]
    var CreationDateTime: js.UndefOr[Timestamp]
    var DeletionProtection: js.UndefOr[DeletionProtection]
    var Name: js.UndefOr[LedgerName]
    var State: js.UndefOr[LedgerState]
  }

  object DescribeLedgerResponse {
    @inline
    def apply(
        Arn: js.UndefOr[Arn] = js.undefined,
        CreationDateTime: js.UndefOr[Timestamp] = js.undefined,
        DeletionProtection: js.UndefOr[DeletionProtection] = js.undefined,
        Name: js.UndefOr[LedgerName] = js.undefined,
        State: js.UndefOr[LedgerState] = js.undefined
    ): DescribeLedgerResponse = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      CreationDateTime.foreach(__v => __obj.updateDynamic("CreationDateTime")(__v.asInstanceOf[js.Any]))
      DeletionProtection.foreach(__v => __obj.updateDynamic("DeletionProtection")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeLedgerResponse]
    }
  }

  @js.native
  trait ExportJournalToS3Request extends js.Object {
    var ExclusiveEndTime: Timestamp
    var InclusiveStartTime: Timestamp
    var Name: LedgerName
    var RoleArn: Arn
    var S3ExportConfiguration: S3ExportConfiguration
  }

  object ExportJournalToS3Request {
    @inline
    def apply(
        ExclusiveEndTime: Timestamp,
        InclusiveStartTime: Timestamp,
        Name: LedgerName,
        RoleArn: Arn,
        S3ExportConfiguration: S3ExportConfiguration
    ): ExportJournalToS3Request = {
      val __obj = js.Dynamic.literal(
        "ExclusiveEndTime"      -> ExclusiveEndTime.asInstanceOf[js.Any],
        "InclusiveStartTime"    -> InclusiveStartTime.asInstanceOf[js.Any],
        "Name"                  -> Name.asInstanceOf[js.Any],
        "RoleArn"               -> RoleArn.asInstanceOf[js.Any],
        "S3ExportConfiguration" -> S3ExportConfiguration.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ExportJournalToS3Request]
    }
  }

  @js.native
  trait ExportJournalToS3Response extends js.Object {
    var ExportId: UniqueId
  }

  object ExportJournalToS3Response {
    @inline
    def apply(
        ExportId: UniqueId
    ): ExportJournalToS3Response = {
      val __obj = js.Dynamic.literal(
        "ExportId" -> ExportId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ExportJournalToS3Response]
    }
  }

  @js.native
  sealed trait ExportStatus extends js.Any
  object ExportStatus extends js.Object {
    val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[ExportStatus]
    val COMPLETED   = "COMPLETED".asInstanceOf[ExportStatus]
    val CANCELLED   = "CANCELLED".asInstanceOf[ExportStatus]

    val values = js.Object.freeze(js.Array(IN_PROGRESS, COMPLETED, CANCELLED))
  }

  @js.native
  trait GetBlockRequest extends js.Object {
    var BlockAddress: ValueHolder
    var Name: LedgerName
    var DigestTipAddress: js.UndefOr[ValueHolder]
  }

  object GetBlockRequest {
    @inline
    def apply(
        BlockAddress: ValueHolder,
        Name: LedgerName,
        DigestTipAddress: js.UndefOr[ValueHolder] = js.undefined
    ): GetBlockRequest = {
      val __obj = js.Dynamic.literal(
        "BlockAddress" -> BlockAddress.asInstanceOf[js.Any],
        "Name"         -> Name.asInstanceOf[js.Any]
      )

      DigestTipAddress.foreach(__v => __obj.updateDynamic("DigestTipAddress")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetBlockRequest]
    }
  }

  @js.native
  trait GetBlockResponse extends js.Object {
    var Block: ValueHolder
    var Proof: js.UndefOr[ValueHolder]
  }

  object GetBlockResponse {
    @inline
    def apply(
        Block: ValueHolder,
        Proof: js.UndefOr[ValueHolder] = js.undefined
    ): GetBlockResponse = {
      val __obj = js.Dynamic.literal(
        "Block" -> Block.asInstanceOf[js.Any]
      )

      Proof.foreach(__v => __obj.updateDynamic("Proof")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetBlockResponse]
    }
  }

  @js.native
  trait GetDigestRequest extends js.Object {
    var Name: LedgerName
  }

  object GetDigestRequest {
    @inline
    def apply(
        Name: LedgerName
    ): GetDigestRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetDigestRequest]
    }
  }

  @js.native
  trait GetDigestResponse extends js.Object {
    var Digest: Digest
    var DigestTipAddress: ValueHolder
  }

  object GetDigestResponse {
    @inline
    def apply(
        Digest: Digest,
        DigestTipAddress: ValueHolder
    ): GetDigestResponse = {
      val __obj = js.Dynamic.literal(
        "Digest"           -> Digest.asInstanceOf[js.Any],
        "DigestTipAddress" -> DigestTipAddress.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetDigestResponse]
    }
  }

  @js.native
  trait GetRevisionRequest extends js.Object {
    var BlockAddress: ValueHolder
    var DocumentId: UniqueId
    var Name: LedgerName
    var DigestTipAddress: js.UndefOr[ValueHolder]
  }

  object GetRevisionRequest {
    @inline
    def apply(
        BlockAddress: ValueHolder,
        DocumentId: UniqueId,
        Name: LedgerName,
        DigestTipAddress: js.UndefOr[ValueHolder] = js.undefined
    ): GetRevisionRequest = {
      val __obj = js.Dynamic.literal(
        "BlockAddress" -> BlockAddress.asInstanceOf[js.Any],
        "DocumentId"   -> DocumentId.asInstanceOf[js.Any],
        "Name"         -> Name.asInstanceOf[js.Any]
      )

      DigestTipAddress.foreach(__v => __obj.updateDynamic("DigestTipAddress")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetRevisionRequest]
    }
  }

  @js.native
  trait GetRevisionResponse extends js.Object {
    var Revision: ValueHolder
    var Proof: js.UndefOr[ValueHolder]
  }

  object GetRevisionResponse {
    @inline
    def apply(
        Revision: ValueHolder,
        Proof: js.UndefOr[ValueHolder] = js.undefined
    ): GetRevisionResponse = {
      val __obj = js.Dynamic.literal(
        "Revision" -> Revision.asInstanceOf[js.Any]
      )

      Proof.foreach(__v => __obj.updateDynamic("Proof")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetRevisionResponse]
    }
  }

  /**
    * The information about a journal export job, including the ledger name, export ID, when it was created, current status, and its start and end time export parameters.
    */
  @js.native
  trait JournalS3ExportDescription extends js.Object {
    var ExclusiveEndTime: Timestamp
    var ExportCreationTime: Timestamp
    var ExportId: UniqueId
    var InclusiveStartTime: Timestamp
    var LedgerName: LedgerName
    var RoleArn: Arn
    var S3ExportConfiguration: S3ExportConfiguration
    var Status: ExportStatus
  }

  object JournalS3ExportDescription {
    @inline
    def apply(
        ExclusiveEndTime: Timestamp,
        ExportCreationTime: Timestamp,
        ExportId: UniqueId,
        InclusiveStartTime: Timestamp,
        LedgerName: LedgerName,
        RoleArn: Arn,
        S3ExportConfiguration: S3ExportConfiguration,
        Status: ExportStatus
    ): JournalS3ExportDescription = {
      val __obj = js.Dynamic.literal(
        "ExclusiveEndTime"      -> ExclusiveEndTime.asInstanceOf[js.Any],
        "ExportCreationTime"    -> ExportCreationTime.asInstanceOf[js.Any],
        "ExportId"              -> ExportId.asInstanceOf[js.Any],
        "InclusiveStartTime"    -> InclusiveStartTime.asInstanceOf[js.Any],
        "LedgerName"            -> LedgerName.asInstanceOf[js.Any],
        "RoleArn"               -> RoleArn.asInstanceOf[js.Any],
        "S3ExportConfiguration" -> S3ExportConfiguration.asInstanceOf[js.Any],
        "Status"                -> Status.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[JournalS3ExportDescription]
    }
  }

  @js.native
  sealed trait LedgerState extends js.Any
  object LedgerState extends js.Object {
    val CREATING = "CREATING".asInstanceOf[LedgerState]
    val ACTIVE   = "ACTIVE".asInstanceOf[LedgerState]
    val DELETING = "DELETING".asInstanceOf[LedgerState]
    val DELETED  = "DELETED".asInstanceOf[LedgerState]

    val values = js.Object.freeze(js.Array(CREATING, ACTIVE, DELETING, DELETED))
  }

  /**
    * Information about a ledger, including its name, state, and when it was created.
    */
  @js.native
  trait LedgerSummary extends js.Object {
    var CreationDateTime: js.UndefOr[Timestamp]
    var Name: js.UndefOr[LedgerName]
    var State: js.UndefOr[LedgerState]
  }

  object LedgerSummary {
    @inline
    def apply(
        CreationDateTime: js.UndefOr[Timestamp] = js.undefined,
        Name: js.UndefOr[LedgerName] = js.undefined,
        State: js.UndefOr[LedgerState] = js.undefined
    ): LedgerSummary = {
      val __obj = js.Dynamic.literal()
      CreationDateTime.foreach(__v => __obj.updateDynamic("CreationDateTime")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LedgerSummary]
    }
  }

  @js.native
  trait ListJournalS3ExportsForLedgerRequest extends js.Object {
    var Name: LedgerName
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListJournalS3ExportsForLedgerRequest {
    @inline
    def apply(
        Name: LedgerName,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListJournalS3ExportsForLedgerRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListJournalS3ExportsForLedgerRequest]
    }
  }

  @js.native
  trait ListJournalS3ExportsForLedgerResponse extends js.Object {
    var JournalS3Exports: js.UndefOr[JournalS3ExportList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListJournalS3ExportsForLedgerResponse {
    @inline
    def apply(
        JournalS3Exports: js.UndefOr[JournalS3ExportList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListJournalS3ExportsForLedgerResponse = {
      val __obj = js.Dynamic.literal()
      JournalS3Exports.foreach(__v => __obj.updateDynamic("JournalS3Exports")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListJournalS3ExportsForLedgerResponse]
    }
  }

  @js.native
  trait ListJournalS3ExportsRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListJournalS3ExportsRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListJournalS3ExportsRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListJournalS3ExportsRequest]
    }
  }

  @js.native
  trait ListJournalS3ExportsResponse extends js.Object {
    var JournalS3Exports: js.UndefOr[JournalS3ExportList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListJournalS3ExportsResponse {
    @inline
    def apply(
        JournalS3Exports: js.UndefOr[JournalS3ExportList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListJournalS3ExportsResponse = {
      val __obj = js.Dynamic.literal()
      JournalS3Exports.foreach(__v => __obj.updateDynamic("JournalS3Exports")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListJournalS3ExportsResponse]
    }
  }

  @js.native
  trait ListLedgersRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListLedgersRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListLedgersRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListLedgersRequest]
    }
  }

  @js.native
  trait ListLedgersResponse extends js.Object {
    var Ledgers: js.UndefOr[LedgerList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListLedgersResponse {
    @inline
    def apply(
        Ledgers: js.UndefOr[LedgerList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListLedgersResponse = {
      val __obj = js.Dynamic.literal()
      Ledgers.foreach(__v => __obj.updateDynamic("Ledgers")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListLedgersResponse]
    }
  }

  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var ResourceArn: Arn
  }

  object ListTagsForResourceRequest {
    @inline
    def apply(
        ResourceArn: Arn
    ): ListTagsForResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ListTagsForResourceRequest]
    }
  }

  @js.native
  trait ListTagsForResourceResponse extends js.Object {
    var Tags: js.UndefOr[Tags]
  }

  object ListTagsForResourceResponse {
    @inline
    def apply(
        Tags: js.UndefOr[Tags] = js.undefined
    ): ListTagsForResourceResponse = {
      val __obj = js.Dynamic.literal()
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceResponse]
    }
  }

  @js.native
  sealed trait PermissionsMode extends js.Any
  object PermissionsMode extends js.Object {
    val ALLOW_ALL = "ALLOW_ALL".asInstanceOf[PermissionsMode]

    val values = js.Object.freeze(js.Array(ALLOW_ALL))
  }

  /**
    * The encryption settings that are used by a journal export job to write data in an Amazon Simple Storage Service (Amazon S3) bucket.
    */
  @js.native
  trait S3EncryptionConfiguration extends js.Object {
    var ObjectEncryptionType: S3ObjectEncryptionType
    var KmsKeyArn: js.UndefOr[Arn]
  }

  object S3EncryptionConfiguration {
    @inline
    def apply(
        ObjectEncryptionType: S3ObjectEncryptionType,
        KmsKeyArn: js.UndefOr[Arn] = js.undefined
    ): S3EncryptionConfiguration = {
      val __obj = js.Dynamic.literal(
        "ObjectEncryptionType" -> ObjectEncryptionType.asInstanceOf[js.Any]
      )

      KmsKeyArn.foreach(__v => __obj.updateDynamic("KmsKeyArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[S3EncryptionConfiguration]
    }
  }

  /**
    * The Amazon Simple Storage Service (Amazon S3) bucket location in which a journal export job writes the journal contents.
    */
  @js.native
  trait S3ExportConfiguration extends js.Object {
    var Bucket: S3Bucket
    var EncryptionConfiguration: S3EncryptionConfiguration
    var Prefix: S3Prefix
  }

  object S3ExportConfiguration {
    @inline
    def apply(
        Bucket: S3Bucket,
        EncryptionConfiguration: S3EncryptionConfiguration,
        Prefix: S3Prefix
    ): S3ExportConfiguration = {
      val __obj = js.Dynamic.literal(
        "Bucket"                  -> Bucket.asInstanceOf[js.Any],
        "EncryptionConfiguration" -> EncryptionConfiguration.asInstanceOf[js.Any],
        "Prefix"                  -> Prefix.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[S3ExportConfiguration]
    }
  }

  @js.native
  sealed trait S3ObjectEncryptionType extends js.Any
  object S3ObjectEncryptionType extends js.Object {
    val SSE_KMS       = "SSE_KMS".asInstanceOf[S3ObjectEncryptionType]
    val SSE_S3        = "SSE_S3".asInstanceOf[S3ObjectEncryptionType]
    val NO_ENCRYPTION = "NO_ENCRYPTION".asInstanceOf[S3ObjectEncryptionType]

    val values = js.Object.freeze(js.Array(SSE_KMS, SSE_S3, NO_ENCRYPTION))
  }

  @js.native
  trait TagResourceRequest extends js.Object {
    var ResourceArn: Arn
    var Tags: Tags
  }

  object TagResourceRequest {
    @inline
    def apply(
        ResourceArn: Arn,
        Tags: Tags
    ): TagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any],
        "Tags"        -> Tags.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[TagResourceRequest]
    }
  }

  @js.native
  trait TagResourceResponse extends js.Object {}

  object TagResourceResponse {
    @inline
    def apply(
    ): TagResourceResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[TagResourceResponse]
    }
  }

  @js.native
  trait UntagResourceRequest extends js.Object {
    var ResourceArn: Arn
    var TagKeys: TagKeyList
  }

  object UntagResourceRequest {
    @inline
    def apply(
        ResourceArn: Arn,
        TagKeys: TagKeyList
    ): UntagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any],
        "TagKeys"     -> TagKeys.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UntagResourceRequest]
    }
  }

  @js.native
  trait UntagResourceResponse extends js.Object {}

  object UntagResourceResponse {
    @inline
    def apply(
    ): UntagResourceResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[UntagResourceResponse]
    }
  }

  @js.native
  trait UpdateLedgerRequest extends js.Object {
    var Name: LedgerName
    var DeletionProtection: js.UndefOr[DeletionProtection]
  }

  object UpdateLedgerRequest {
    @inline
    def apply(
        Name: LedgerName,
        DeletionProtection: js.UndefOr[DeletionProtection] = js.undefined
    ): UpdateLedgerRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      DeletionProtection.foreach(__v => __obj.updateDynamic("DeletionProtection")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateLedgerRequest]
    }
  }

  @js.native
  trait UpdateLedgerResponse extends js.Object {
    var Arn: js.UndefOr[Arn]
    var CreationDateTime: js.UndefOr[Timestamp]
    var DeletionProtection: js.UndefOr[DeletionProtection]
    var Name: js.UndefOr[LedgerName]
    var State: js.UndefOr[LedgerState]
  }

  object UpdateLedgerResponse {
    @inline
    def apply(
        Arn: js.UndefOr[Arn] = js.undefined,
        CreationDateTime: js.UndefOr[Timestamp] = js.undefined,
        DeletionProtection: js.UndefOr[DeletionProtection] = js.undefined,
        Name: js.UndefOr[LedgerName] = js.undefined,
        State: js.UndefOr[LedgerState] = js.undefined
    ): UpdateLedgerResponse = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      CreationDateTime.foreach(__v => __obj.updateDynamic("CreationDateTime")(__v.asInstanceOf[js.Any]))
      DeletionProtection.foreach(__v => __obj.updateDynamic("DeletionProtection")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateLedgerResponse]
    }
  }

  /**
    * A structure that can contain an Amazon Ion value in multiple encoding formats.
    */
  @js.native
  trait ValueHolder extends js.Object {
    var IonText: js.UndefOr[IonText]
  }

  object ValueHolder {
    @inline
    def apply(
        IonText: js.UndefOr[IonText] = js.undefined
    ): ValueHolder = {
      val __obj = js.Dynamic.literal()
      IonText.foreach(__v => __obj.updateDynamic("IonText")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ValueHolder]
    }
  }
}
