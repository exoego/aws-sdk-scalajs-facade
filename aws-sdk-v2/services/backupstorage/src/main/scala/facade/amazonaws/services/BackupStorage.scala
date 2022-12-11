package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import scala.language.implicitConversions
import facade.amazonaws._

package object backupstorage {
  type ChunkList = js.Array[Chunk]
  type MaxResults = Int
  type MetadataString = String
  type ObjectList = js.Array[BackupObject]
  type OptionalLong = Double
  type PayloadBlob = js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type timestamp = js.Date

  final class BackupStorageOps(private val service: BackupStorage) extends AnyVal {

    @inline def deleteObjectFuture(params: DeleteObjectInput): Future[js.Object] = service.deleteObject(params).promise().toFuture
    @inline def getChunkFuture(params: GetChunkInput): Future[GetChunkOutput] = service.getChunk(params).promise().toFuture
    @inline def getObjectMetadataFuture(params: GetObjectMetadataInput): Future[GetObjectMetadataOutput] = service.getObjectMetadata(params).promise().toFuture
    @inline def listChunksFuture(params: ListChunksInput): Future[ListChunksOutput] = service.listChunks(params).promise().toFuture
    @inline def listObjectsFuture(params: ListObjectsInput): Future[ListObjectsOutput] = service.listObjects(params).promise().toFuture
    @inline def notifyObjectCompleteFuture(params: NotifyObjectCompleteInput): Future[NotifyObjectCompleteOutput] = service.notifyObjectComplete(params).promise().toFuture
    @inline def putChunkFuture(params: PutChunkInput): Future[PutChunkOutput] = service.putChunk(params).promise().toFuture
    @inline def putObjectFuture(params: PutObjectInput): Future[PutObjectOutput] = service.putObject(params).promise().toFuture
    @inline def startObjectFuture(params: StartObjectInput): Future[StartObjectOutput] = service.startObject(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/backupstorage", JSImport.Namespace, "AWS.BackupStorage")
  class BackupStorage() extends js.Object {
    def this(config: AWSConfig) = this()

    def deleteObject(params: DeleteObjectInput): Request[js.Object] = js.native
    def getChunk(params: GetChunkInput): Request[GetChunkOutput] = js.native
    def getObjectMetadata(params: GetObjectMetadataInput): Request[GetObjectMetadataOutput] = js.native
    def listChunks(params: ListChunksInput): Request[ListChunksOutput] = js.native
    def listObjects(params: ListObjectsInput): Request[ListObjectsOutput] = js.native
    def notifyObjectComplete(params: NotifyObjectCompleteInput): Request[NotifyObjectCompleteOutput] = js.native
    def putChunk(params: PutChunkInput): Request[PutChunkOutput] = js.native
    def putObject(params: PutObjectInput): Request[PutObjectOutput] = js.native
    def startObject(params: StartObjectInput): Request[StartObjectOutput] = js.native
  }
  object BackupStorage {
    @inline implicit def toOps(service: BackupStorage): BackupStorageOps = {
      new BackupStorageOps(service)
    }
  }

  /** Object
    */
  @js.native
  trait BackupObject extends js.Object {
    var Name: String
    var ObjectChecksum: String
    var ObjectChecksumAlgorithm: SummaryChecksumAlgorithm
    var ObjectToken: String
    var ChunksCount: js.UndefOr[OptionalLong]
    var MetadataString: js.UndefOr[String]
  }

  object BackupObject {
    @inline
    def apply(
        Name: String,
        ObjectChecksum: String,
        ObjectChecksumAlgorithm: SummaryChecksumAlgorithm,
        ObjectToken: String,
        ChunksCount: js.UndefOr[OptionalLong] = js.undefined,
        MetadataString: js.UndefOr[String] = js.undefined
    ): BackupObject = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "ObjectChecksum" -> ObjectChecksum.asInstanceOf[js.Any],
        "ObjectChecksumAlgorithm" -> ObjectChecksumAlgorithm.asInstanceOf[js.Any],
        "ObjectToken" -> ObjectToken.asInstanceOf[js.Any]
      )

      ChunksCount.foreach(__v => __obj.updateDynamic("ChunksCount")(__v.asInstanceOf[js.Any]))
      MetadataString.foreach(__v => __obj.updateDynamic("MetadataString")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BackupObject]
    }
  }

  /** Chunk
    */
  @js.native
  trait Chunk extends js.Object {
    var Checksum: String
    var ChecksumAlgorithm: DataChecksumAlgorithm
    var ChunkToken: String
    var Index: Double
    var Length: Double
  }

  object Chunk {
    @inline
    def apply(
        Checksum: String,
        ChecksumAlgorithm: DataChecksumAlgorithm,
        ChunkToken: String,
        Index: Double,
        Length: Double
    ): Chunk = {
      val __obj = js.Dynamic.literal(
        "Checksum" -> Checksum.asInstanceOf[js.Any],
        "ChecksumAlgorithm" -> ChecksumAlgorithm.asInstanceOf[js.Any],
        "ChunkToken" -> ChunkToken.asInstanceOf[js.Any],
        "Index" -> Index.asInstanceOf[js.Any],
        "Length" -> Length.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[Chunk]
    }
  }

  @js.native
  trait DeleteObjectInput extends js.Object {
    var BackupJobId: String
    var ObjectName: String
  }

  object DeleteObjectInput {
    @inline
    def apply(
        BackupJobId: String,
        ObjectName: String
    ): DeleteObjectInput = {
      val __obj = js.Dynamic.literal(
        "BackupJobId" -> BackupJobId.asInstanceOf[js.Any],
        "ObjectName" -> ObjectName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteObjectInput]
    }
  }

  @js.native
  trait GetChunkInput extends js.Object {
    var ChunkToken: String
    var StorageJobId: String
  }

  object GetChunkInput {
    @inline
    def apply(
        ChunkToken: String,
        StorageJobId: String
    ): GetChunkInput = {
      val __obj = js.Dynamic.literal(
        "ChunkToken" -> ChunkToken.asInstanceOf[js.Any],
        "StorageJobId" -> StorageJobId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetChunkInput]
    }
  }

  @js.native
  trait GetChunkOutput extends js.Object {
    var Checksum: String
    var ChecksumAlgorithm: DataChecksumAlgorithm
    var Data: PayloadBlob
    var Length: Double
  }

  object GetChunkOutput {
    @inline
    def apply(
        Checksum: String,
        ChecksumAlgorithm: DataChecksumAlgorithm,
        Data: PayloadBlob,
        Length: Double
    ): GetChunkOutput = {
      val __obj = js.Dynamic.literal(
        "Checksum" -> Checksum.asInstanceOf[js.Any],
        "ChecksumAlgorithm" -> ChecksumAlgorithm.asInstanceOf[js.Any],
        "Data" -> Data.asInstanceOf[js.Any],
        "Length" -> Length.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetChunkOutput]
    }
  }

  @js.native
  trait GetObjectMetadataInput extends js.Object {
    var ObjectToken: String
    var StorageJobId: String
  }

  object GetObjectMetadataInput {
    @inline
    def apply(
        ObjectToken: String,
        StorageJobId: String
    ): GetObjectMetadataInput = {
      val __obj = js.Dynamic.literal(
        "ObjectToken" -> ObjectToken.asInstanceOf[js.Any],
        "StorageJobId" -> StorageJobId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetObjectMetadataInput]
    }
  }

  @js.native
  trait GetObjectMetadataOutput extends js.Object {
    var MetadataBlob: js.UndefOr[PayloadBlob]
    var MetadataBlobChecksum: js.UndefOr[String]
    var MetadataBlobChecksumAlgorithm: js.UndefOr[DataChecksumAlgorithm]
    var MetadataBlobLength: js.UndefOr[Double]
    var MetadataString: js.UndefOr[String]
  }

  object GetObjectMetadataOutput {
    @inline
    def apply(
        MetadataBlob: js.UndefOr[PayloadBlob] = js.undefined,
        MetadataBlobChecksum: js.UndefOr[String] = js.undefined,
        MetadataBlobChecksumAlgorithm: js.UndefOr[DataChecksumAlgorithm] = js.undefined,
        MetadataBlobLength: js.UndefOr[Double] = js.undefined,
        MetadataString: js.UndefOr[String] = js.undefined
    ): GetObjectMetadataOutput = {
      val __obj = js.Dynamic.literal()
      MetadataBlob.foreach(__v => __obj.updateDynamic("MetadataBlob")(__v.asInstanceOf[js.Any]))
      MetadataBlobChecksum.foreach(__v => __obj.updateDynamic("MetadataBlobChecksum")(__v.asInstanceOf[js.Any]))
      MetadataBlobChecksumAlgorithm.foreach(__v => __obj.updateDynamic("MetadataBlobChecksumAlgorithm")(__v.asInstanceOf[js.Any]))
      MetadataBlobLength.foreach(__v => __obj.updateDynamic("MetadataBlobLength")(__v.asInstanceOf[js.Any]))
      MetadataString.foreach(__v => __obj.updateDynamic("MetadataString")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetObjectMetadataOutput]
    }
  }

  @js.native
  trait ListChunksInput extends js.Object {
    var ObjectToken: String
    var StorageJobId: String
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[String]
  }

  object ListChunksInput {
    @inline
    def apply(
        ObjectToken: String,
        StorageJobId: String,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListChunksInput = {
      val __obj = js.Dynamic.literal(
        "ObjectToken" -> ObjectToken.asInstanceOf[js.Any],
        "StorageJobId" -> StorageJobId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListChunksInput]
    }
  }

  @js.native
  trait ListChunksOutput extends js.Object {
    var ChunkList: ChunkList
    var NextToken: js.UndefOr[String]
  }

  object ListChunksOutput {
    @inline
    def apply(
        ChunkList: ChunkList,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListChunksOutput = {
      val __obj = js.Dynamic.literal(
        "ChunkList" -> ChunkList.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListChunksOutput]
    }
  }

  @js.native
  trait ListObjectsInput extends js.Object {
    var StorageJobId: String
    var CreatedAfter: js.UndefOr[timestamp]
    var CreatedBefore: js.UndefOr[timestamp]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[String]
    var StartingObjectName: js.UndefOr[String]
    var StartingObjectPrefix: js.UndefOr[String]
  }

  object ListObjectsInput {
    @inline
    def apply(
        StorageJobId: String,
        CreatedAfter: js.UndefOr[timestamp] = js.undefined,
        CreatedBefore: js.UndefOr[timestamp] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined,
        StartingObjectName: js.UndefOr[String] = js.undefined,
        StartingObjectPrefix: js.UndefOr[String] = js.undefined
    ): ListObjectsInput = {
      val __obj = js.Dynamic.literal(
        "StorageJobId" -> StorageJobId.asInstanceOf[js.Any]
      )

      CreatedAfter.foreach(__v => __obj.updateDynamic("CreatedAfter")(__v.asInstanceOf[js.Any]))
      CreatedBefore.foreach(__v => __obj.updateDynamic("CreatedBefore")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      StartingObjectName.foreach(__v => __obj.updateDynamic("StartingObjectName")(__v.asInstanceOf[js.Any]))
      StartingObjectPrefix.foreach(__v => __obj.updateDynamic("StartingObjectPrefix")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListObjectsInput]
    }
  }

  @js.native
  trait ListObjectsOutput extends js.Object {
    var ObjectList: ObjectList
    var NextToken: js.UndefOr[String]
  }

  object ListObjectsOutput {
    @inline
    def apply(
        ObjectList: ObjectList,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListObjectsOutput = {
      val __obj = js.Dynamic.literal(
        "ObjectList" -> ObjectList.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListObjectsOutput]
    }
  }

  @js.native
  trait NotifyObjectCompleteInput extends js.Object {
    var BackupJobId: String
    var ObjectChecksum: String
    var ObjectChecksumAlgorithm: SummaryChecksumAlgorithm
    var UploadId: String
    var MetadataBlob: js.UndefOr[PayloadBlob]
    var MetadataBlobChecksum: js.UndefOr[String]
    var MetadataBlobChecksumAlgorithm: js.UndefOr[DataChecksumAlgorithm]
    var MetadataBlobLength: js.UndefOr[Double]
    var MetadataString: js.UndefOr[MetadataString]
  }

  object NotifyObjectCompleteInput {
    @inline
    def apply(
        BackupJobId: String,
        ObjectChecksum: String,
        ObjectChecksumAlgorithm: SummaryChecksumAlgorithm,
        UploadId: String,
        MetadataBlob: js.UndefOr[PayloadBlob] = js.undefined,
        MetadataBlobChecksum: js.UndefOr[String] = js.undefined,
        MetadataBlobChecksumAlgorithm: js.UndefOr[DataChecksumAlgorithm] = js.undefined,
        MetadataBlobLength: js.UndefOr[Double] = js.undefined,
        MetadataString: js.UndefOr[MetadataString] = js.undefined
    ): NotifyObjectCompleteInput = {
      val __obj = js.Dynamic.literal(
        "BackupJobId" -> BackupJobId.asInstanceOf[js.Any],
        "ObjectChecksum" -> ObjectChecksum.asInstanceOf[js.Any],
        "ObjectChecksumAlgorithm" -> ObjectChecksumAlgorithm.asInstanceOf[js.Any],
        "UploadId" -> UploadId.asInstanceOf[js.Any]
      )

      MetadataBlob.foreach(__v => __obj.updateDynamic("MetadataBlob")(__v.asInstanceOf[js.Any]))
      MetadataBlobChecksum.foreach(__v => __obj.updateDynamic("MetadataBlobChecksum")(__v.asInstanceOf[js.Any]))
      MetadataBlobChecksumAlgorithm.foreach(__v => __obj.updateDynamic("MetadataBlobChecksumAlgorithm")(__v.asInstanceOf[js.Any]))
      MetadataBlobLength.foreach(__v => __obj.updateDynamic("MetadataBlobLength")(__v.asInstanceOf[js.Any]))
      MetadataString.foreach(__v => __obj.updateDynamic("MetadataString")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NotifyObjectCompleteInput]
    }
  }

  @js.native
  trait NotifyObjectCompleteOutput extends js.Object {
    var ObjectChecksum: String
    var ObjectChecksumAlgorithm: SummaryChecksumAlgorithm
  }

  object NotifyObjectCompleteOutput {
    @inline
    def apply(
        ObjectChecksum: String,
        ObjectChecksumAlgorithm: SummaryChecksumAlgorithm
    ): NotifyObjectCompleteOutput = {
      val __obj = js.Dynamic.literal(
        "ObjectChecksum" -> ObjectChecksum.asInstanceOf[js.Any],
        "ObjectChecksumAlgorithm" -> ObjectChecksumAlgorithm.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[NotifyObjectCompleteOutput]
    }
  }

  @js.native
  trait PutChunkInput extends js.Object {
    var BackupJobId: String
    var Checksum: String
    var ChecksumAlgorithm: DataChecksumAlgorithm
    var ChunkIndex: Double
    var Data: PayloadBlob
    var Length: Double
    var UploadId: String
  }

  object PutChunkInput {
    @inline
    def apply(
        BackupJobId: String,
        Checksum: String,
        ChecksumAlgorithm: DataChecksumAlgorithm,
        ChunkIndex: Double,
        Data: PayloadBlob,
        Length: Double,
        UploadId: String
    ): PutChunkInput = {
      val __obj = js.Dynamic.literal(
        "BackupJobId" -> BackupJobId.asInstanceOf[js.Any],
        "Checksum" -> Checksum.asInstanceOf[js.Any],
        "ChecksumAlgorithm" -> ChecksumAlgorithm.asInstanceOf[js.Any],
        "ChunkIndex" -> ChunkIndex.asInstanceOf[js.Any],
        "Data" -> Data.asInstanceOf[js.Any],
        "Length" -> Length.asInstanceOf[js.Any],
        "UploadId" -> UploadId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[PutChunkInput]
    }
  }

  @js.native
  trait PutChunkOutput extends js.Object {
    var ChunkChecksum: String
    var ChunkChecksumAlgorithm: DataChecksumAlgorithm
  }

  object PutChunkOutput {
    @inline
    def apply(
        ChunkChecksum: String,
        ChunkChecksumAlgorithm: DataChecksumAlgorithm
    ): PutChunkOutput = {
      val __obj = js.Dynamic.literal(
        "ChunkChecksum" -> ChunkChecksum.asInstanceOf[js.Any],
        "ChunkChecksumAlgorithm" -> ChunkChecksumAlgorithm.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[PutChunkOutput]
    }
  }

  @js.native
  trait PutObjectInput extends js.Object {
    var BackupJobId: String
    var ObjectName: String
    var InlineChunk: js.UndefOr[PayloadBlob]
    var InlineChunkChecksum: js.UndefOr[String]
    var InlineChunkChecksumAlgorithm: js.UndefOr[String]
    var InlineChunkLength: js.UndefOr[Double]
    var MetadataString: js.UndefOr[String]
    var ObjectChecksum: js.UndefOr[String]
    var ObjectChecksumAlgorithm: js.UndefOr[SummaryChecksumAlgorithm]
    var ThrowOnDuplicate: js.UndefOr[Boolean]
  }

  object PutObjectInput {
    @inline
    def apply(
        BackupJobId: String,
        ObjectName: String,
        InlineChunk: js.UndefOr[PayloadBlob] = js.undefined,
        InlineChunkChecksum: js.UndefOr[String] = js.undefined,
        InlineChunkChecksumAlgorithm: js.UndefOr[String] = js.undefined,
        InlineChunkLength: js.UndefOr[Double] = js.undefined,
        MetadataString: js.UndefOr[String] = js.undefined,
        ObjectChecksum: js.UndefOr[String] = js.undefined,
        ObjectChecksumAlgorithm: js.UndefOr[SummaryChecksumAlgorithm] = js.undefined,
        ThrowOnDuplicate: js.UndefOr[Boolean] = js.undefined
    ): PutObjectInput = {
      val __obj = js.Dynamic.literal(
        "BackupJobId" -> BackupJobId.asInstanceOf[js.Any],
        "ObjectName" -> ObjectName.asInstanceOf[js.Any]
      )

      InlineChunk.foreach(__v => __obj.updateDynamic("InlineChunk")(__v.asInstanceOf[js.Any]))
      InlineChunkChecksum.foreach(__v => __obj.updateDynamic("InlineChunkChecksum")(__v.asInstanceOf[js.Any]))
      InlineChunkChecksumAlgorithm.foreach(__v => __obj.updateDynamic("InlineChunkChecksumAlgorithm")(__v.asInstanceOf[js.Any]))
      InlineChunkLength.foreach(__v => __obj.updateDynamic("InlineChunkLength")(__v.asInstanceOf[js.Any]))
      MetadataString.foreach(__v => __obj.updateDynamic("MetadataString")(__v.asInstanceOf[js.Any]))
      ObjectChecksum.foreach(__v => __obj.updateDynamic("ObjectChecksum")(__v.asInstanceOf[js.Any]))
      ObjectChecksumAlgorithm.foreach(__v => __obj.updateDynamic("ObjectChecksumAlgorithm")(__v.asInstanceOf[js.Any]))
      ThrowOnDuplicate.foreach(__v => __obj.updateDynamic("ThrowOnDuplicate")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutObjectInput]
    }
  }

  @js.native
  trait PutObjectOutput extends js.Object {
    var InlineChunkChecksum: String
    var InlineChunkChecksumAlgorithm: DataChecksumAlgorithm
    var ObjectChecksum: String
    var ObjectChecksumAlgorithm: SummaryChecksumAlgorithm
  }

  object PutObjectOutput {
    @inline
    def apply(
        InlineChunkChecksum: String,
        InlineChunkChecksumAlgorithm: DataChecksumAlgorithm,
        ObjectChecksum: String,
        ObjectChecksumAlgorithm: SummaryChecksumAlgorithm
    ): PutObjectOutput = {
      val __obj = js.Dynamic.literal(
        "InlineChunkChecksum" -> InlineChunkChecksum.asInstanceOf[js.Any],
        "InlineChunkChecksumAlgorithm" -> InlineChunkChecksumAlgorithm.asInstanceOf[js.Any],
        "ObjectChecksum" -> ObjectChecksum.asInstanceOf[js.Any],
        "ObjectChecksumAlgorithm" -> ObjectChecksumAlgorithm.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[PutObjectOutput]
    }
  }

  @js.native
  trait StartObjectInput extends js.Object {
    var BackupJobId: String
    var ObjectName: String
    var ThrowOnDuplicate: js.UndefOr[Boolean]
  }

  object StartObjectInput {
    @inline
    def apply(
        BackupJobId: String,
        ObjectName: String,
        ThrowOnDuplicate: js.UndefOr[Boolean] = js.undefined
    ): StartObjectInput = {
      val __obj = js.Dynamic.literal(
        "BackupJobId" -> BackupJobId.asInstanceOf[js.Any],
        "ObjectName" -> ObjectName.asInstanceOf[js.Any]
      )

      ThrowOnDuplicate.foreach(__v => __obj.updateDynamic("ThrowOnDuplicate")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartObjectInput]
    }
  }

  @js.native
  trait StartObjectOutput extends js.Object {
    var UploadId: String
  }

  object StartObjectOutput {
    @inline
    def apply(
        UploadId: String
    ): StartObjectOutput = {
      val __obj = js.Dynamic.literal(
        "UploadId" -> UploadId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[StartObjectOutput]
    }
  }
}
