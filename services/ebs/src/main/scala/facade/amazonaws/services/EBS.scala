package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import io.scalajs.nodejs
import facade.amazonaws._

package object ebs {
  type BlockData =
    nodejs.buffer.Buffer | nodejs.stream.Readable | js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type BlockIndex        = Int
  type BlockSize         = Int
  type BlockToken        = String
  type Blocks            = js.Array[Block]
  type ChangedBlocks     = js.Array[ChangedBlock]
  type Checksum          = String
  type ChecksumAlgorithm = String
  type DataLength        = Int
  type MaxResults        = Int
  type PageToken         = String
  type SnapshotId        = String
  type TimeStamp         = js.Date
  type VolumeSize        = Double

  implicit final class EBSOps(private val service: EBS) extends AnyVal {

    @inline def getSnapshotBlockFuture(params: GetSnapshotBlockRequest): Future[GetSnapshotBlockResponse] =
      service.getSnapshotBlock(params).promise.toFuture
    @inline def listChangedBlocksFuture(params: ListChangedBlocksRequest): Future[ListChangedBlocksResponse] =
      service.listChangedBlocks(params).promise.toFuture
    @inline def listSnapshotBlocksFuture(params: ListSnapshotBlocksRequest): Future[ListSnapshotBlocksResponse] =
      service.listSnapshotBlocks(params).promise.toFuture
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
  trait Block extends js.Object {
    var BlockIndex: js.UndefOr[BlockIndex]
    var BlockToken: js.UndefOr[BlockToken]
  }

  object Block {
    @inline
    def apply(
        BlockIndex: js.UndefOr[BlockIndex] = js.undefined,
        BlockToken: js.UndefOr[BlockToken] = js.undefined
    ): Block = {
      val __obj = js.Dynamic.literal()
      BlockIndex.foreach(__v => __obj.updateDynamic("BlockIndex")(__v.asInstanceOf[js.Any]))
      BlockToken.foreach(__v => __obj.updateDynamic("BlockToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Block]
    }
  }

  /**
    * A block of data in an Amazon Elastic Block Store snapshot that is different from another snapshot of the same volume/snapshot lineage.
    */
  @js.native
  trait ChangedBlock extends js.Object {
    var BlockIndex: js.UndefOr[BlockIndex]
    var FirstBlockToken: js.UndefOr[BlockToken]
    var SecondBlockToken: js.UndefOr[BlockToken]
  }

  object ChangedBlock {
    @inline
    def apply(
        BlockIndex: js.UndefOr[BlockIndex] = js.undefined,
        FirstBlockToken: js.UndefOr[BlockToken] = js.undefined,
        SecondBlockToken: js.UndefOr[BlockToken] = js.undefined
    ): ChangedBlock = {
      val __obj = js.Dynamic.literal()
      BlockIndex.foreach(__v => __obj.updateDynamic("BlockIndex")(__v.asInstanceOf[js.Any]))
      FirstBlockToken.foreach(__v => __obj.updateDynamic("FirstBlockToken")(__v.asInstanceOf[js.Any]))
      SecondBlockToken.foreach(__v => __obj.updateDynamic("SecondBlockToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ChangedBlock]
    }
  }

  object ChecksumAlgorithmEnum {
    val SHA256 = "SHA256"

    val values = js.Object.freeze(js.Array(SHA256))
  }

  @js.native
  trait GetSnapshotBlockRequest extends js.Object {
    var BlockIndex: BlockIndex
    var BlockToken: BlockToken
    var SnapshotId: SnapshotId
  }

  object GetSnapshotBlockRequest {
    @inline
    def apply(
        BlockIndex: BlockIndex,
        BlockToken: BlockToken,
        SnapshotId: SnapshotId
    ): GetSnapshotBlockRequest = {
      val __obj = js.Dynamic.literal(
        "BlockIndex" -> BlockIndex.asInstanceOf[js.Any],
        "BlockToken" -> BlockToken.asInstanceOf[js.Any],
        "SnapshotId" -> SnapshotId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetSnapshotBlockRequest]
    }
  }

  @js.native
  trait GetSnapshotBlockResponse extends js.Object {
    var BlockData: js.UndefOr[BlockData]
    var Checksum: js.UndefOr[Checksum]
    var ChecksumAlgorithm: js.UndefOr[ChecksumAlgorithm]
    var DataLength: js.UndefOr[DataLength]
  }

  object GetSnapshotBlockResponse {
    @inline
    def apply(
        BlockData: js.UndefOr[BlockData] = js.undefined,
        Checksum: js.UndefOr[Checksum] = js.undefined,
        ChecksumAlgorithm: js.UndefOr[ChecksumAlgorithm] = js.undefined,
        DataLength: js.UndefOr[DataLength] = js.undefined
    ): GetSnapshotBlockResponse = {
      val __obj = js.Dynamic.literal()
      BlockData.foreach(__v => __obj.updateDynamic("BlockData")(__v.asInstanceOf[js.Any]))
      Checksum.foreach(__v => __obj.updateDynamic("Checksum")(__v.asInstanceOf[js.Any]))
      ChecksumAlgorithm.foreach(__v => __obj.updateDynamic("ChecksumAlgorithm")(__v.asInstanceOf[js.Any]))
      DataLength.foreach(__v => __obj.updateDynamic("DataLength")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetSnapshotBlockResponse]
    }
  }

  @js.native
  trait ListChangedBlocksRequest extends js.Object {
    var SecondSnapshotId: SnapshotId
    var FirstSnapshotId: js.UndefOr[SnapshotId]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[PageToken]
    var StartingBlockIndex: js.UndefOr[BlockIndex]
  }

  object ListChangedBlocksRequest {
    @inline
    def apply(
        SecondSnapshotId: SnapshotId,
        FirstSnapshotId: js.UndefOr[SnapshotId] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[PageToken] = js.undefined,
        StartingBlockIndex: js.UndefOr[BlockIndex] = js.undefined
    ): ListChangedBlocksRequest = {
      val __obj = js.Dynamic.literal(
        "SecondSnapshotId" -> SecondSnapshotId.asInstanceOf[js.Any]
      )

      FirstSnapshotId.foreach(__v => __obj.updateDynamic("FirstSnapshotId")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      StartingBlockIndex.foreach(__v => __obj.updateDynamic("StartingBlockIndex")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListChangedBlocksRequest]
    }
  }

  @js.native
  trait ListChangedBlocksResponse extends js.Object {
    var BlockSize: js.UndefOr[BlockSize]
    var ChangedBlocks: js.UndefOr[ChangedBlocks]
    var ExpiryTime: js.UndefOr[TimeStamp]
    var NextToken: js.UndefOr[PageToken]
    var VolumeSize: js.UndefOr[VolumeSize]
  }

  object ListChangedBlocksResponse {
    @inline
    def apply(
        BlockSize: js.UndefOr[BlockSize] = js.undefined,
        ChangedBlocks: js.UndefOr[ChangedBlocks] = js.undefined,
        ExpiryTime: js.UndefOr[TimeStamp] = js.undefined,
        NextToken: js.UndefOr[PageToken] = js.undefined,
        VolumeSize: js.UndefOr[VolumeSize] = js.undefined
    ): ListChangedBlocksResponse = {
      val __obj = js.Dynamic.literal()
      BlockSize.foreach(__v => __obj.updateDynamic("BlockSize")(__v.asInstanceOf[js.Any]))
      ChangedBlocks.foreach(__v => __obj.updateDynamic("ChangedBlocks")(__v.asInstanceOf[js.Any]))
      ExpiryTime.foreach(__v => __obj.updateDynamic("ExpiryTime")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      VolumeSize.foreach(__v => __obj.updateDynamic("VolumeSize")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListChangedBlocksResponse]
    }
  }

  @js.native
  trait ListSnapshotBlocksRequest extends js.Object {
    var SnapshotId: SnapshotId
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[PageToken]
    var StartingBlockIndex: js.UndefOr[BlockIndex]
  }

  object ListSnapshotBlocksRequest {
    @inline
    def apply(
        SnapshotId: SnapshotId,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[PageToken] = js.undefined,
        StartingBlockIndex: js.UndefOr[BlockIndex] = js.undefined
    ): ListSnapshotBlocksRequest = {
      val __obj = js.Dynamic.literal(
        "SnapshotId" -> SnapshotId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      StartingBlockIndex.foreach(__v => __obj.updateDynamic("StartingBlockIndex")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSnapshotBlocksRequest]
    }
  }

  @js.native
  trait ListSnapshotBlocksResponse extends js.Object {
    var BlockSize: js.UndefOr[BlockSize]
    var Blocks: js.UndefOr[Blocks]
    var ExpiryTime: js.UndefOr[TimeStamp]
    var NextToken: js.UndefOr[PageToken]
    var VolumeSize: js.UndefOr[VolumeSize]
  }

  object ListSnapshotBlocksResponse {
    @inline
    def apply(
        BlockSize: js.UndefOr[BlockSize] = js.undefined,
        Blocks: js.UndefOr[Blocks] = js.undefined,
        ExpiryTime: js.UndefOr[TimeStamp] = js.undefined,
        NextToken: js.UndefOr[PageToken] = js.undefined,
        VolumeSize: js.UndefOr[VolumeSize] = js.undefined
    ): ListSnapshotBlocksResponse = {
      val __obj = js.Dynamic.literal()
      BlockSize.foreach(__v => __obj.updateDynamic("BlockSize")(__v.asInstanceOf[js.Any]))
      Blocks.foreach(__v => __obj.updateDynamic("Blocks")(__v.asInstanceOf[js.Any]))
      ExpiryTime.foreach(__v => __obj.updateDynamic("ExpiryTime")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      VolumeSize.foreach(__v => __obj.updateDynamic("VolumeSize")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSnapshotBlocksResponse]
    }
  }
}
