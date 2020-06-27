package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

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
  @Factory
  trait CreateLedgerRequest extends js.Object {
    var Name: LedgerName
    var PermissionsMode: PermissionsMode
    var DeletionProtection: js.UndefOr[DeletionProtection]
    var Tags: js.UndefOr[Tags]
  }

  @js.native
  @Factory
  trait CreateLedgerResponse extends js.Object {
    var Arn: js.UndefOr[Arn]
    var CreationDateTime: js.UndefOr[Timestamp]
    var DeletionProtection: js.UndefOr[DeletionProtection]
    var Name: js.UndefOr[LedgerName]
    var State: js.UndefOr[LedgerState]
  }

  @js.native
  @Factory
  trait DeleteLedgerRequest extends js.Object {
    var Name: LedgerName
  }

  @js.native
  @Factory
  trait DescribeJournalS3ExportRequest extends js.Object {
    var ExportId: UniqueId
    var Name: LedgerName
  }

  @js.native
  @Factory
  trait DescribeJournalS3ExportResponse extends js.Object {
    var ExportDescription: JournalS3ExportDescription
  }

  @js.native
  @Factory
  trait DescribeLedgerRequest extends js.Object {
    var Name: LedgerName
  }

  @js.native
  @Factory
  trait DescribeLedgerResponse extends js.Object {
    var Arn: js.UndefOr[Arn]
    var CreationDateTime: js.UndefOr[Timestamp]
    var DeletionProtection: js.UndefOr[DeletionProtection]
    var Name: js.UndefOr[LedgerName]
    var State: js.UndefOr[LedgerState]
  }

  @js.native
  @Factory
  trait ExportJournalToS3Request extends js.Object {
    var ExclusiveEndTime: Timestamp
    var InclusiveStartTime: Timestamp
    var Name: LedgerName
    var RoleArn: Arn
    var S3ExportConfiguration: S3ExportConfiguration
  }

  @js.native
  @Factory
  trait ExportJournalToS3Response extends js.Object {
    var ExportId: UniqueId
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
  @Factory
  trait GetBlockRequest extends js.Object {
    var BlockAddress: ValueHolder
    var Name: LedgerName
    var DigestTipAddress: js.UndefOr[ValueHolder]
  }

  @js.native
  @Factory
  trait GetBlockResponse extends js.Object {
    var Block: ValueHolder
    var Proof: js.UndefOr[ValueHolder]
  }

  @js.native
  @Factory
  trait GetDigestRequest extends js.Object {
    var Name: LedgerName
  }

  @js.native
  @Factory
  trait GetDigestResponse extends js.Object {
    var Digest: Digest
    var DigestTipAddress: ValueHolder
  }

  @js.native
  @Factory
  trait GetRevisionRequest extends js.Object {
    var BlockAddress: ValueHolder
    var DocumentId: UniqueId
    var Name: LedgerName
    var DigestTipAddress: js.UndefOr[ValueHolder]
  }

  @js.native
  @Factory
  trait GetRevisionResponse extends js.Object {
    var Revision: ValueHolder
    var Proof: js.UndefOr[ValueHolder]
  }

  /**
    * The information about a journal export job, including the ledger name, export ID, when it was created, current status, and its start and end time export parameters.
    */
  @js.native
  @Factory
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
  @Factory
  trait LedgerSummary extends js.Object {
    var CreationDateTime: js.UndefOr[Timestamp]
    var Name: js.UndefOr[LedgerName]
    var State: js.UndefOr[LedgerState]
  }

  @js.native
  @Factory
  trait ListJournalS3ExportsForLedgerRequest extends js.Object {
    var Name: LedgerName
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListJournalS3ExportsForLedgerResponse extends js.Object {
    var JournalS3Exports: js.UndefOr[JournalS3ExportList]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListJournalS3ExportsRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListJournalS3ExportsResponse extends js.Object {
    var JournalS3Exports: js.UndefOr[JournalS3ExportList]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListLedgersRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListLedgersResponse extends js.Object {
    var Ledgers: js.UndefOr[LedgerList]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListTagsForResourceRequest extends js.Object {
    var ResourceArn: Arn
  }

  @js.native
  @Factory
  trait ListTagsForResourceResponse extends js.Object {
    var Tags: js.UndefOr[Tags]
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
  @Factory
  trait S3EncryptionConfiguration extends js.Object {
    var ObjectEncryptionType: S3ObjectEncryptionType
    var KmsKeyArn: js.UndefOr[Arn]
  }

  /**
    * The Amazon Simple Storage Service (Amazon S3) bucket location in which a journal export job writes the journal contents.
    */
  @js.native
  @Factory
  trait S3ExportConfiguration extends js.Object {
    var Bucket: S3Bucket
    var EncryptionConfiguration: S3EncryptionConfiguration
    var Prefix: S3Prefix
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
  @Factory
  trait TagResourceRequest extends js.Object {
    var ResourceArn: Arn
    var Tags: Tags
  }

  @js.native
  @Factory
  trait TagResourceResponse extends js.Object {}

  @js.native
  @Factory
  trait UntagResourceRequest extends js.Object {
    var ResourceArn: Arn
    var TagKeys: TagKeyList
  }

  @js.native
  @Factory
  trait UntagResourceResponse extends js.Object {}

  @js.native
  @Factory
  trait UpdateLedgerRequest extends js.Object {
    var Name: LedgerName
    var DeletionProtection: js.UndefOr[DeletionProtection]
  }

  @js.native
  @Factory
  trait UpdateLedgerResponse extends js.Object {
    var Arn: js.UndefOr[Arn]
    var CreationDateTime: js.UndefOr[Timestamp]
    var DeletionProtection: js.UndefOr[DeletionProtection]
    var Name: js.UndefOr[LedgerName]
    var State: js.UndefOr[LedgerState]
  }

  /**
    * A structure that can contain an Amazon Ion value in multiple encoding formats.
    */
  @js.native
  @Factory
  trait ValueHolder extends js.Object {
    var IonText: js.UndefOr[IonText]
  }
}
