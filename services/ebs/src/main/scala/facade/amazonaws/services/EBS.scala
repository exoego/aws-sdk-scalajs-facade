package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object ebs {
  type BlockData     = js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type BlockIndex    = Int
  type BlockSize     = Int
  type BlockToken    = String
  type Blocks        = js.Array[Block]
  type ChangedBlocks = js.Array[ChangedBlock]
  type Checksum      = String
  type DataLength    = Int
  type MaxResults    = Int
  type PageToken     = String
  type SnapshotId    = String
  type TimeStamp     = js.Date
  type VolumeSize    = Double

  implicit final class EBSOps(private val service: EBS) extends AnyVal {

    @inline def getSnapshotBlockFuture(params: GetSnapshotBlockRequest): Future[GetSnapshotBlockResponse] =
      service.getSnapshotBlock(params).promise().toFuture
    @inline def listChangedBlocksFuture(params: ListChangedBlocksRequest): Future[ListChangedBlocksResponse] =
      service.listChangedBlocks(params).promise().toFuture
    @inline def listSnapshotBlocksFuture(params: ListSnapshotBlocksRequest): Future[ListSnapshotBlocksResponse] =
      service.listSnapshotBlocks(params).promise().toFuture
  }
}

package ebs {
  @js.native
  @JSImport("aws-sdk", "EBS")
  class EBS() extends js.Object {
    def this(config: AWSConfig) = this()

    def getSnapshotBlock(params: GetSnapshotBlockRequest): Request[GetSnapshotBlockResponse]       = js.native
    def listChangedBlocks(params: ListChangedBlocksRequest): Request[ListChangedBlocksResponse]    = js.native
    def listSnapshotBlocks(params: ListSnapshotBlocksRequest): Request[ListSnapshotBlocksResponse] = js.native
  }

  /**
    * A block of data in an Amazon Elastic Block Store snapshot.
    */
  @js.native
  @Factory
  trait Block extends js.Object {
    var BlockIndex: js.UndefOr[BlockIndex]
    var BlockToken: js.UndefOr[BlockToken]
  }

  /**
    * A block of data in an Amazon Elastic Block Store snapshot that is different from another snapshot of the same volume/snapshot lineage.
    */
  @js.native
  @Factory
  trait ChangedBlock extends js.Object {
    var BlockIndex: js.UndefOr[BlockIndex]
    var FirstBlockToken: js.UndefOr[BlockToken]
    var SecondBlockToken: js.UndefOr[BlockToken]
  }

  @js.native
  sealed trait ChecksumAlgorithm extends js.Any
  object ChecksumAlgorithm extends js.Object {
    val SHA256 = "SHA256".asInstanceOf[ChecksumAlgorithm]

    val values = js.Object.freeze(js.Array(SHA256))
  }

  @js.native
  @Factory
  trait GetSnapshotBlockRequest extends js.Object {
    var BlockIndex: BlockIndex
    var BlockToken: BlockToken
    var SnapshotId: SnapshotId
  }

  @js.native
  @Factory
  trait GetSnapshotBlockResponse extends js.Object {
    var BlockData: js.UndefOr[BlockData]
    var Checksum: js.UndefOr[Checksum]
    var ChecksumAlgorithm: js.UndefOr[ChecksumAlgorithm]
    var DataLength: js.UndefOr[DataLength]
  }

  @js.native
  @Factory
  trait ListChangedBlocksRequest extends js.Object {
    var SecondSnapshotId: SnapshotId
    var FirstSnapshotId: js.UndefOr[SnapshotId]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[PageToken]
    var StartingBlockIndex: js.UndefOr[BlockIndex]
  }

  @js.native
  @Factory
  trait ListChangedBlocksResponse extends js.Object {
    var BlockSize: js.UndefOr[BlockSize]
    var ChangedBlocks: js.UndefOr[ChangedBlocks]
    var ExpiryTime: js.UndefOr[TimeStamp]
    var NextToken: js.UndefOr[PageToken]
    var VolumeSize: js.UndefOr[VolumeSize]
  }

  @js.native
  @Factory
  trait ListSnapshotBlocksRequest extends js.Object {
    var SnapshotId: SnapshotId
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[PageToken]
    var StartingBlockIndex: js.UndefOr[BlockIndex]
  }

  @js.native
  @Factory
  trait ListSnapshotBlocksResponse extends js.Object {
    var BlockSize: js.UndefOr[BlockSize]
    var Blocks: js.UndefOr[Blocks]
    var ExpiryTime: js.UndefOr[TimeStamp]
    var NextToken: js.UndefOr[PageToken]
    var VolumeSize: js.UndefOr[VolumeSize]
  }
}
