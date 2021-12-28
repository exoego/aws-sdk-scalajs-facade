package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

package object ebs {
  type BlockData = js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type BlockIndex = Int
  type BlockSize = Int
  type BlockToken = String
  type Blocks = js.Array[Block]
  type ChangedBlocks = js.Array[ChangedBlock]
  type ChangedBlocksCount = Int
  type Checksum = String
  type DataLength = Int
  type Description = String
  type IdempotencyToken = String
  type KmsKeyArn = String
  type MaxResults = Int
  type OwnerId = String
  type PageToken = String
  type Progress = Int
  type SnapshotId = String
  type TagKey = String
  type TagValue = String
  type Tags = js.Array[Tag]
  type TimeStamp = js.Date
  type Timeout = Int
  type VolumeSize = Double

  final class EBSOps(private val service: EBS) extends AnyVal {

    @inline def completeSnapshotFuture(params: CompleteSnapshotRequest): Future[CompleteSnapshotResponse] = service.completeSnapshot(params).promise().toFuture
    @inline def getSnapshotBlockFuture(params: GetSnapshotBlockRequest): Future[GetSnapshotBlockResponse] = service.getSnapshotBlock(params).promise().toFuture
    @inline def listChangedBlocksFuture(params: ListChangedBlocksRequest): Future[ListChangedBlocksResponse] = service.listChangedBlocks(params).promise().toFuture
    @inline def listSnapshotBlocksFuture(params: ListSnapshotBlocksRequest): Future[ListSnapshotBlocksResponse] = service.listSnapshotBlocks(params).promise().toFuture
    @inline def putSnapshotBlockFuture(params: PutSnapshotBlockRequest): Future[PutSnapshotBlockResponse] = service.putSnapshotBlock(params).promise().toFuture
    @inline def startSnapshotFuture(params: StartSnapshotRequest): Future[StartSnapshotResponse] = service.startSnapshot(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/ebs", JSImport.Namespace, "AWS.EBS")
  class EBS() extends js.Object {
    def this(config: AWSConfig) = this()

    def completeSnapshot(params: CompleteSnapshotRequest): Request[CompleteSnapshotResponse] = js.native
    def getSnapshotBlock(params: GetSnapshotBlockRequest): Request[GetSnapshotBlockResponse] = js.native
    def listChangedBlocks(params: ListChangedBlocksRequest): Request[ListChangedBlocksResponse] = js.native
    def listSnapshotBlocks(params: ListSnapshotBlocksRequest): Request[ListSnapshotBlocksResponse] = js.native
    def putSnapshotBlock(params: PutSnapshotBlockRequest): Request[PutSnapshotBlockResponse] = js.native
    def startSnapshot(params: StartSnapshotRequest): Request[StartSnapshotResponse] = js.native
  }
  object EBS {
    @inline implicit def toOps(service: EBS): EBSOps = {
      new EBSOps(service)
    }
  }

  /** A block of data in an Amazon Elastic Block Store snapshot.
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

  /** A block of data in an Amazon Elastic Block Store snapshot that is different from another snapshot of the same volume/snapshot lineage.
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

  @js.native
  trait CompleteSnapshotRequest extends js.Object {
    var ChangedBlocksCount: ChangedBlocksCount
    var SnapshotId: SnapshotId
    var Checksum: js.UndefOr[Checksum]
    var ChecksumAggregationMethod: js.UndefOr[ChecksumAggregationMethod]
    var ChecksumAlgorithm: js.UndefOr[ChecksumAlgorithm]
  }

  object CompleteSnapshotRequest {
    @inline
    def apply(
        ChangedBlocksCount: ChangedBlocksCount,
        SnapshotId: SnapshotId,
        Checksum: js.UndefOr[Checksum] = js.undefined,
        ChecksumAggregationMethod: js.UndefOr[ChecksumAggregationMethod] = js.undefined,
        ChecksumAlgorithm: js.UndefOr[ChecksumAlgorithm] = js.undefined
    ): CompleteSnapshotRequest = {
      val __obj = js.Dynamic.literal(
        "ChangedBlocksCount" -> ChangedBlocksCount.asInstanceOf[js.Any],
        "SnapshotId" -> SnapshotId.asInstanceOf[js.Any]
      )

      Checksum.foreach(__v => __obj.updateDynamic("Checksum")(__v.asInstanceOf[js.Any]))
      ChecksumAggregationMethod.foreach(__v => __obj.updateDynamic("ChecksumAggregationMethod")(__v.asInstanceOf[js.Any]))
      ChecksumAlgorithm.foreach(__v => __obj.updateDynamic("ChecksumAlgorithm")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CompleteSnapshotRequest]
    }
  }

  @js.native
  trait CompleteSnapshotResponse extends js.Object {
    var Status: js.UndefOr[Status]
  }

  object CompleteSnapshotResponse {
    @inline
    def apply(
        Status: js.UndefOr[Status] = js.undefined
    ): CompleteSnapshotResponse = {
      val __obj = js.Dynamic.literal()
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CompleteSnapshotResponse]
    }
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

  @js.native
  trait PutSnapshotBlockRequest extends js.Object {
    var BlockData: BlockData
    var BlockIndex: BlockIndex
    var Checksum: Checksum
    var ChecksumAlgorithm: ChecksumAlgorithm
    var DataLength: DataLength
    var SnapshotId: SnapshotId
    var Progress: js.UndefOr[Progress]
  }

  object PutSnapshotBlockRequest {
    @inline
    def apply(
        BlockData: BlockData,
        BlockIndex: BlockIndex,
        Checksum: Checksum,
        ChecksumAlgorithm: ChecksumAlgorithm,
        DataLength: DataLength,
        SnapshotId: SnapshotId,
        Progress: js.UndefOr[Progress] = js.undefined
    ): PutSnapshotBlockRequest = {
      val __obj = js.Dynamic.literal(
        "BlockData" -> BlockData.asInstanceOf[js.Any],
        "BlockIndex" -> BlockIndex.asInstanceOf[js.Any],
        "Checksum" -> Checksum.asInstanceOf[js.Any],
        "ChecksumAlgorithm" -> ChecksumAlgorithm.asInstanceOf[js.Any],
        "DataLength" -> DataLength.asInstanceOf[js.Any],
        "SnapshotId" -> SnapshotId.asInstanceOf[js.Any]
      )

      Progress.foreach(__v => __obj.updateDynamic("Progress")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutSnapshotBlockRequest]
    }
  }

  @js.native
  trait PutSnapshotBlockResponse extends js.Object {
    var Checksum: js.UndefOr[Checksum]
    var ChecksumAlgorithm: js.UndefOr[ChecksumAlgorithm]
  }

  object PutSnapshotBlockResponse {
    @inline
    def apply(
        Checksum: js.UndefOr[Checksum] = js.undefined,
        ChecksumAlgorithm: js.UndefOr[ChecksumAlgorithm] = js.undefined
    ): PutSnapshotBlockResponse = {
      val __obj = js.Dynamic.literal()
      Checksum.foreach(__v => __obj.updateDynamic("Checksum")(__v.asInstanceOf[js.Any]))
      ChecksumAlgorithm.foreach(__v => __obj.updateDynamic("ChecksumAlgorithm")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutSnapshotBlockResponse]
    }
  }

  @js.native
  trait StartSnapshotRequest extends js.Object {
    var VolumeSize: VolumeSize
    var ClientToken: js.UndefOr[IdempotencyToken]
    var Description: js.UndefOr[Description]
    var Encrypted: js.UndefOr[Boolean]
    var KmsKeyArn: js.UndefOr[KmsKeyArn]
    var ParentSnapshotId: js.UndefOr[SnapshotId]
    var Tags: js.UndefOr[Tags]
    var Timeout: js.UndefOr[Timeout]
  }

  object StartSnapshotRequest {
    @inline
    def apply(
        VolumeSize: VolumeSize,
        ClientToken: js.UndefOr[IdempotencyToken] = js.undefined,
        Description: js.UndefOr[Description] = js.undefined,
        Encrypted: js.UndefOr[Boolean] = js.undefined,
        KmsKeyArn: js.UndefOr[KmsKeyArn] = js.undefined,
        ParentSnapshotId: js.UndefOr[SnapshotId] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined,
        Timeout: js.UndefOr[Timeout] = js.undefined
    ): StartSnapshotRequest = {
      val __obj = js.Dynamic.literal(
        "VolumeSize" -> VolumeSize.asInstanceOf[js.Any]
      )

      ClientToken.foreach(__v => __obj.updateDynamic("ClientToken")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Encrypted.foreach(__v => __obj.updateDynamic("Encrypted")(__v.asInstanceOf[js.Any]))
      KmsKeyArn.foreach(__v => __obj.updateDynamic("KmsKeyArn")(__v.asInstanceOf[js.Any]))
      ParentSnapshotId.foreach(__v => __obj.updateDynamic("ParentSnapshotId")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      Timeout.foreach(__v => __obj.updateDynamic("Timeout")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartSnapshotRequest]
    }
  }

  @js.native
  trait StartSnapshotResponse extends js.Object {
    var BlockSize: js.UndefOr[BlockSize]
    var Description: js.UndefOr[Description]
    var KmsKeyArn: js.UndefOr[KmsKeyArn]
    var OwnerId: js.UndefOr[OwnerId]
    var ParentSnapshotId: js.UndefOr[SnapshotId]
    var SnapshotId: js.UndefOr[SnapshotId]
    var StartTime: js.UndefOr[TimeStamp]
    var Status: js.UndefOr[Status]
    var Tags: js.UndefOr[Tags]
    var VolumeSize: js.UndefOr[VolumeSize]
  }

  object StartSnapshotResponse {
    @inline
    def apply(
        BlockSize: js.UndefOr[BlockSize] = js.undefined,
        Description: js.UndefOr[Description] = js.undefined,
        KmsKeyArn: js.UndefOr[KmsKeyArn] = js.undefined,
        OwnerId: js.UndefOr[OwnerId] = js.undefined,
        ParentSnapshotId: js.UndefOr[SnapshotId] = js.undefined,
        SnapshotId: js.UndefOr[SnapshotId] = js.undefined,
        StartTime: js.UndefOr[TimeStamp] = js.undefined,
        Status: js.UndefOr[Status] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined,
        VolumeSize: js.UndefOr[VolumeSize] = js.undefined
    ): StartSnapshotResponse = {
      val __obj = js.Dynamic.literal()
      BlockSize.foreach(__v => __obj.updateDynamic("BlockSize")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      KmsKeyArn.foreach(__v => __obj.updateDynamic("KmsKeyArn")(__v.asInstanceOf[js.Any]))
      OwnerId.foreach(__v => __obj.updateDynamic("OwnerId")(__v.asInstanceOf[js.Any]))
      ParentSnapshotId.foreach(__v => __obj.updateDynamic("ParentSnapshotId")(__v.asInstanceOf[js.Any]))
      SnapshotId.foreach(__v => __obj.updateDynamic("SnapshotId")(__v.asInstanceOf[js.Any]))
      StartTime.foreach(__v => __obj.updateDynamic("StartTime")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      VolumeSize.foreach(__v => __obj.updateDynamic("VolumeSize")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartSnapshotResponse]
    }
  }

  /** Describes a tag.
    */
  @js.native
  trait Tag extends js.Object {
    var Key: js.UndefOr[TagKey]
    var Value: js.UndefOr[TagValue]
  }

  object Tag {
    @inline
    def apply(
        Key: js.UndefOr[TagKey] = js.undefined,
        Value: js.UndefOr[TagValue] = js.undefined
    ): Tag = {
      val __obj = js.Dynamic.literal()
      Key.foreach(__v => __obj.updateDynamic("Key")(__v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Tag]
    }
  }
}
