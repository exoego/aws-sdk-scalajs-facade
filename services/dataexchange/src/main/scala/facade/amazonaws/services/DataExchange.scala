package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

package object dataexchange {
  type Arn                                            = String
  type AssetName                                      = String
  type AssetType                                      = String
  type Code                                           = String
  type Description                                    = String
  type Id                                             = String
  type JobErrorLimitName                              = String
  type JobErrorResourceTypes                          = String
  type ListOfAssetDestinationEntry                    = js.Array[AssetDestinationEntry]
  type ListOfAssetEntry                               = js.Array[AssetEntry]
  type ListOfAssetSourceEntry                         = js.Array[AssetSourceEntry]
  type ListOfDataSetEntry                             = js.Array[DataSetEntry]
  type ListOfJobEntry                                 = js.Array[JobEntry]
  type ListOfJobError                                 = js.Array[JobError]
  type ListOfRevisionEntry                            = js.Array[RevisionEntry]
  type ListOf__string                                 = js.Array[__string]
  type MapOf__string                                  = js.Dictionary[__string]
  type MaxResults                                     = Int
  type Name                                           = String
  type NextToken                                      = String
  type Origin                                         = String
  type State                                          = String
  type Timestamp                                      = js.Date
  type Type                                           = String
  type __boolean                                      = Boolean
  type __double                                       = Double
  type __doubleMin0                                   = Double
  type __string                                       = String
  type __stringMin0Max16384                           = String
  type __stringMin24Max24PatternAZaZ094AZaZ092AZaZ093 = String

  implicit final class DataExchangeOps(private val service: DataExchange) extends AnyVal {

    @inline def cancelJobFuture(params: CancelJobRequest): Future[js.Object] =
      service.cancelJob(params).promise.toFuture
    @inline def createDataSetFuture(params: CreateDataSetRequest): Future[CreateDataSetResponse] =
      service.createDataSet(params).promise.toFuture
    @inline def createJobFuture(params: CreateJobRequest): Future[CreateJobResponse] =
      service.createJob(params).promise.toFuture
    @inline def createRevisionFuture(params: CreateRevisionRequest): Future[CreateRevisionResponse] =
      service.createRevision(params).promise.toFuture
    @inline def deleteAssetFuture(params: DeleteAssetRequest): Future[js.Object] =
      service.deleteAsset(params).promise.toFuture
    @inline def deleteDataSetFuture(params: DeleteDataSetRequest): Future[js.Object] =
      service.deleteDataSet(params).promise.toFuture
    @inline def deleteRevisionFuture(params: DeleteRevisionRequest): Future[js.Object] =
      service.deleteRevision(params).promise.toFuture
    @inline def getAssetFuture(params: GetAssetRequest): Future[GetAssetResponse] =
      service.getAsset(params).promise.toFuture
    @inline def getDataSetFuture(params: GetDataSetRequest): Future[GetDataSetResponse] =
      service.getDataSet(params).promise.toFuture
    @inline def getJobFuture(params: GetJobRequest): Future[GetJobResponse] = service.getJob(params).promise.toFuture
    @inline def getRevisionFuture(params: GetRevisionRequest): Future[GetRevisionResponse] =
      service.getRevision(params).promise.toFuture
    @inline def listDataSetRevisionsFuture(params: ListDataSetRevisionsRequest): Future[ListDataSetRevisionsResponse] =
      service.listDataSetRevisions(params).promise.toFuture
    @inline def listDataSetsFuture(params: ListDataSetsRequest): Future[ListDataSetsResponse] =
      service.listDataSets(params).promise.toFuture
    @inline def listJobsFuture(params: ListJobsRequest): Future[ListJobsResponse] =
      service.listJobs(params).promise.toFuture
    @inline def listRevisionAssetsFuture(params: ListRevisionAssetsRequest): Future[ListRevisionAssetsResponse] =
      service.listRevisionAssets(params).promise.toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] =
      service.listTagsForResource(params).promise.toFuture
    @inline def startJobFuture(params: StartJobRequest): Future[StartJobResponse] =
      service.startJob(params).promise.toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[js.Object] =
      service.tagResource(params).promise.toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[js.Object] =
      service.untagResource(params).promise.toFuture
    @inline def updateAssetFuture(params: UpdateAssetRequest): Future[UpdateAssetResponse] =
      service.updateAsset(params).promise.toFuture
    @inline def updateDataSetFuture(params: UpdateDataSetRequest): Future[UpdateDataSetResponse] =
      service.updateDataSet(params).promise.toFuture
    @inline def updateRevisionFuture(params: UpdateRevisionRequest): Future[UpdateRevisionResponse] =
      service.updateRevision(params).promise.toFuture
  }
}

package dataexchange {
  @js.native
  @JSImport("aws-sdk", "DataExchange")
  class DataExchange() extends js.Object {
    def this(config: AWSConfig) = this()

    def cancelJob(params: CancelJobRequest): Request[js.Object]                                          = js.native
    def createDataSet(params: CreateDataSetRequest): Request[CreateDataSetResponse]                      = js.native
    def createJob(params: CreateJobRequest): Request[CreateJobResponse]                                  = js.native
    def createRevision(params: CreateRevisionRequest): Request[CreateRevisionResponse]                   = js.native
    def deleteAsset(params: DeleteAssetRequest): Request[js.Object]                                      = js.native
    def deleteDataSet(params: DeleteDataSetRequest): Request[js.Object]                                  = js.native
    def deleteRevision(params: DeleteRevisionRequest): Request[js.Object]                                = js.native
    def getAsset(params: GetAssetRequest): Request[GetAssetResponse]                                     = js.native
    def getDataSet(params: GetDataSetRequest): Request[GetDataSetResponse]                               = js.native
    def getJob(params: GetJobRequest): Request[GetJobResponse]                                           = js.native
    def getRevision(params: GetRevisionRequest): Request[GetRevisionResponse]                            = js.native
    def listDataSetRevisions(params: ListDataSetRevisionsRequest): Request[ListDataSetRevisionsResponse] = js.native
    def listDataSets(params: ListDataSetsRequest): Request[ListDataSetsResponse]                         = js.native
    def listJobs(params: ListJobsRequest): Request[ListJobsResponse]                                     = js.native
    def listRevisionAssets(params: ListRevisionAssetsRequest): Request[ListRevisionAssetsResponse]       = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse]    = js.native
    def startJob(params: StartJobRequest): Request[StartJobResponse]                                     = js.native
    def tagResource(params: TagResourceRequest): Request[js.Object]                                      = js.native
    def untagResource(params: UntagResourceRequest): Request[js.Object]                                  = js.native
    def updateAsset(params: UpdateAssetRequest): Request[UpdateAssetResponse]                            = js.native
    def updateDataSet(params: UpdateDataSetRequest): Request[UpdateDataSetResponse]                      = js.native
    def updateRevision(params: UpdateRevisionRequest): Request[UpdateRevisionResponse]                   = js.native
  }

  /**
    * The destination for the asset.
    */
  @js.native
  trait AssetDestinationEntry extends js.Object {
    var AssetId: Id
    var Bucket: __string
    var Key: js.UndefOr[__string]
  }

  object AssetDestinationEntry {
    @inline
    def apply(
        AssetId: Id,
        Bucket: __string,
        Key: js.UndefOr[__string] = js.undefined
    ): AssetDestinationEntry = {
      val __obj = js.Dynamic.literal(
        "AssetId" -> AssetId.asInstanceOf[js.Any],
        "Bucket"  -> Bucket.asInstanceOf[js.Any]
      )

      Key.foreach(__v => __obj.updateDynamic("Key")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssetDestinationEntry]
    }
  }

  @js.native
  trait AssetDetails extends js.Object {
    var S3SnapshotAsset: js.UndefOr[S3SnapshotAsset]
  }

  object AssetDetails {
    @inline
    def apply(
        S3SnapshotAsset: js.UndefOr[S3SnapshotAsset] = js.undefined
    ): AssetDetails = {
      val __obj = js.Dynamic.literal()
      S3SnapshotAsset.foreach(__v => __obj.updateDynamic("S3SnapshotAsset")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssetDetails]
    }
  }

  /**
    * An asset in AWS Data Exchange is a piece of data that can be stored as an S3 object. The asset can be a structured data file, an image file, or some other data file. When you create an import job for your files, you create an asset in AWS Data Exchange for each of those files.
    */
  @js.native
  trait AssetEntry extends js.Object {
    var Arn: Arn
    var AssetDetails: AssetDetails
    var AssetType: AssetType
    var CreatedAt: Timestamp
    var DataSetId: Id
    var Id: Id
    var Name: AssetName
    var RevisionId: Id
    var UpdatedAt: Timestamp
    var SourceId: js.UndefOr[Id]
  }

  object AssetEntry {
    @inline
    def apply(
        Arn: Arn,
        AssetDetails: AssetDetails,
        AssetType: AssetType,
        CreatedAt: Timestamp,
        DataSetId: Id,
        Id: Id,
        Name: AssetName,
        RevisionId: Id,
        UpdatedAt: Timestamp,
        SourceId: js.UndefOr[Id] = js.undefined
    ): AssetEntry = {
      val __obj = js.Dynamic.literal(
        "Arn"          -> Arn.asInstanceOf[js.Any],
        "AssetDetails" -> AssetDetails.asInstanceOf[js.Any],
        "AssetType"    -> AssetType.asInstanceOf[js.Any],
        "CreatedAt"    -> CreatedAt.asInstanceOf[js.Any],
        "DataSetId"    -> DataSetId.asInstanceOf[js.Any],
        "Id"           -> Id.asInstanceOf[js.Any],
        "Name"         -> Name.asInstanceOf[js.Any],
        "RevisionId"   -> RevisionId.asInstanceOf[js.Any],
        "UpdatedAt"    -> UpdatedAt.asInstanceOf[js.Any]
      )

      SourceId.foreach(__v => __obj.updateDynamic("SourceId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssetEntry]
    }
  }

  /**
    * The source of the assets.
    */
  @js.native
  trait AssetSourceEntry extends js.Object {
    var Bucket: __string
    var Key: __string
  }

  object AssetSourceEntry {
    @inline
    def apply(
        Bucket: __string,
        Key: __string
    ): AssetSourceEntry = {
      val __obj = js.Dynamic.literal(
        "Bucket" -> Bucket.asInstanceOf[js.Any],
        "Key"    -> Key.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[AssetSourceEntry]
    }
  }

  /**
    * The type of file your data is stored in. Currently, the supported asset type is S3_SNAPSHOT.
    */
  object AssetTypeEnum {
    val S3_SNAPSHOT = "S3_SNAPSHOT"

    val values = js.Object.freeze(js.Array(S3_SNAPSHOT))
  }

  @js.native
  trait CancelJobRequest extends js.Object {
    var JobId: __string
  }

  object CancelJobRequest {
    @inline
    def apply(
        JobId: __string
    ): CancelJobRequest = {
      val __obj = js.Dynamic.literal(
        "JobId" -> JobId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CancelJobRequest]
    }
  }

  object CodeEnum {
    val ACCESS_DENIED_EXCEPTION          = "ACCESS_DENIED_EXCEPTION"
    val INTERNAL_SERVER_EXCEPTION        = "INTERNAL_SERVER_EXCEPTION"
    val MALWARE_DETECTED                 = "MALWARE_DETECTED"
    val RESOURCE_NOT_FOUND_EXCEPTION     = "RESOURCE_NOT_FOUND_EXCEPTION"
    val SERVICE_QUOTA_EXCEEDED_EXCEPTION = "SERVICE_QUOTA_EXCEEDED_EXCEPTION"
    val VALIDATION_EXCEPTION             = "VALIDATION_EXCEPTION"
    val MALWARE_SCAN_ENCRYPTED_FILE      = "MALWARE_SCAN_ENCRYPTED_FILE"

    val values = js.Object.freeze(
      js.Array(
        ACCESS_DENIED_EXCEPTION,
        INTERNAL_SERVER_EXCEPTION,
        MALWARE_DETECTED,
        RESOURCE_NOT_FOUND_EXCEPTION,
        SERVICE_QUOTA_EXCEEDED_EXCEPTION,
        VALIDATION_EXCEPTION,
        MALWARE_SCAN_ENCRYPTED_FILE
      )
    )
  }

  /**
    * The request body for CreateDataSet.
    */
  @js.native
  trait CreateDataSetRequest extends js.Object {
    var AssetType: AssetType
    var Description: Description
    var Name: Name
    var Tags: js.UndefOr[MapOf__string]
  }

  object CreateDataSetRequest {
    @inline
    def apply(
        AssetType: AssetType,
        Description: Description,
        Name: Name,
        Tags: js.UndefOr[MapOf__string] = js.undefined
    ): CreateDataSetRequest = {
      val __obj = js.Dynamic.literal(
        "AssetType"   -> AssetType.asInstanceOf[js.Any],
        "Description" -> Description.asInstanceOf[js.Any],
        "Name"        -> Name.asInstanceOf[js.Any]
      )

      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDataSetRequest]
    }
  }

  @js.native
  trait CreateDataSetResponse extends js.Object {
    var Arn: js.UndefOr[Arn]
    var AssetType: js.UndefOr[AssetType]
    var CreatedAt: js.UndefOr[Timestamp]
    var Description: js.UndefOr[Description]
    var Id: js.UndefOr[Id]
    var Name: js.UndefOr[Name]
    var Origin: js.UndefOr[Origin]
    var OriginDetails: js.UndefOr[OriginDetails]
    var SourceId: js.UndefOr[Id]
    var Tags: js.UndefOr[MapOf__string]
    var UpdatedAt: js.UndefOr[Timestamp]
  }

  object CreateDataSetResponse {
    @inline
    def apply(
        Arn: js.UndefOr[Arn] = js.undefined,
        AssetType: js.UndefOr[AssetType] = js.undefined,
        CreatedAt: js.UndefOr[Timestamp] = js.undefined,
        Description: js.UndefOr[Description] = js.undefined,
        Id: js.UndefOr[Id] = js.undefined,
        Name: js.UndefOr[Name] = js.undefined,
        Origin: js.UndefOr[Origin] = js.undefined,
        OriginDetails: js.UndefOr[OriginDetails] = js.undefined,
        SourceId: js.UndefOr[Id] = js.undefined,
        Tags: js.UndefOr[MapOf__string] = js.undefined,
        UpdatedAt: js.UndefOr[Timestamp] = js.undefined
    ): CreateDataSetResponse = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      AssetType.foreach(__v => __obj.updateDynamic("AssetType")(__v.asInstanceOf[js.Any]))
      CreatedAt.foreach(__v => __obj.updateDynamic("CreatedAt")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Origin.foreach(__v => __obj.updateDynamic("Origin")(__v.asInstanceOf[js.Any]))
      OriginDetails.foreach(__v => __obj.updateDynamic("OriginDetails")(__v.asInstanceOf[js.Any]))
      SourceId.foreach(__v => __obj.updateDynamic("SourceId")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      UpdatedAt.foreach(__v => __obj.updateDynamic("UpdatedAt")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDataSetResponse]
    }
  }

  /**
    * The request body for CreateJob.
    */
  @js.native
  trait CreateJobRequest extends js.Object {
    var Details: RequestDetails
    var Type: Type
  }

  object CreateJobRequest {
    @inline
    def apply(
        Details: RequestDetails,
        Type: Type
    ): CreateJobRequest = {
      val __obj = js.Dynamic.literal(
        "Details" -> Details.asInstanceOf[js.Any],
        "Type"    -> Type.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateJobRequest]
    }
  }

  @js.native
  trait CreateJobResponse extends js.Object {
    var Arn: js.UndefOr[Arn]
    var CreatedAt: js.UndefOr[Timestamp]
    var Details: js.UndefOr[ResponseDetails]
    var Errors: js.UndefOr[ListOfJobError]
    var Id: js.UndefOr[Id]
    var State: js.UndefOr[State]
    var Type: js.UndefOr[Type]
    var UpdatedAt: js.UndefOr[Timestamp]
  }

  object CreateJobResponse {
    @inline
    def apply(
        Arn: js.UndefOr[Arn] = js.undefined,
        CreatedAt: js.UndefOr[Timestamp] = js.undefined,
        Details: js.UndefOr[ResponseDetails] = js.undefined,
        Errors: js.UndefOr[ListOfJobError] = js.undefined,
        Id: js.UndefOr[Id] = js.undefined,
        State: js.UndefOr[State] = js.undefined,
        Type: js.UndefOr[Type] = js.undefined,
        UpdatedAt: js.UndefOr[Timestamp] = js.undefined
    ): CreateJobResponse = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      CreatedAt.foreach(__v => __obj.updateDynamic("CreatedAt")(__v.asInstanceOf[js.Any]))
      Details.foreach(__v => __obj.updateDynamic("Details")(__v.asInstanceOf[js.Any]))
      Errors.foreach(__v => __obj.updateDynamic("Errors")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      UpdatedAt.foreach(__v => __obj.updateDynamic("UpdatedAt")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateJobResponse]
    }
  }

  /**
    * The request body for CreateRevision.
    */
  @js.native
  trait CreateRevisionRequest extends js.Object {
    var DataSetId: __string
    var Comment: js.UndefOr[__stringMin0Max16384]
    var Tags: js.UndefOr[MapOf__string]
  }

  object CreateRevisionRequest {
    @inline
    def apply(
        DataSetId: __string,
        Comment: js.UndefOr[__stringMin0Max16384] = js.undefined,
        Tags: js.UndefOr[MapOf__string] = js.undefined
    ): CreateRevisionRequest = {
      val __obj = js.Dynamic.literal(
        "DataSetId" -> DataSetId.asInstanceOf[js.Any]
      )

      Comment.foreach(__v => __obj.updateDynamic("Comment")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateRevisionRequest]
    }
  }

  @js.native
  trait CreateRevisionResponse extends js.Object {
    var Arn: js.UndefOr[Arn]
    var Comment: js.UndefOr[__stringMin0Max16384]
    var CreatedAt: js.UndefOr[Timestamp]
    var DataSetId: js.UndefOr[Id]
    var Finalized: js.UndefOr[__boolean]
    var Id: js.UndefOr[Id]
    var SourceId: js.UndefOr[Id]
    var Tags: js.UndefOr[MapOf__string]
    var UpdatedAt: js.UndefOr[Timestamp]
  }

  object CreateRevisionResponse {
    @inline
    def apply(
        Arn: js.UndefOr[Arn] = js.undefined,
        Comment: js.UndefOr[__stringMin0Max16384] = js.undefined,
        CreatedAt: js.UndefOr[Timestamp] = js.undefined,
        DataSetId: js.UndefOr[Id] = js.undefined,
        Finalized: js.UndefOr[__boolean] = js.undefined,
        Id: js.UndefOr[Id] = js.undefined,
        SourceId: js.UndefOr[Id] = js.undefined,
        Tags: js.UndefOr[MapOf__string] = js.undefined,
        UpdatedAt: js.UndefOr[Timestamp] = js.undefined
    ): CreateRevisionResponse = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      Comment.foreach(__v => __obj.updateDynamic("Comment")(__v.asInstanceOf[js.Any]))
      CreatedAt.foreach(__v => __obj.updateDynamic("CreatedAt")(__v.asInstanceOf[js.Any]))
      DataSetId.foreach(__v => __obj.updateDynamic("DataSetId")(__v.asInstanceOf[js.Any]))
      Finalized.foreach(__v => __obj.updateDynamic("Finalized")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      SourceId.foreach(__v => __obj.updateDynamic("SourceId")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      UpdatedAt.foreach(__v => __obj.updateDynamic("UpdatedAt")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateRevisionResponse]
    }
  }

  /**
    * A data set is an AWS resource with one or more revisions.
    */
  @js.native
  trait DataSetEntry extends js.Object {
    var Arn: Arn
    var AssetType: AssetType
    var CreatedAt: Timestamp
    var Description: Description
    var Id: Id
    var Name: Name
    var Origin: Origin
    var UpdatedAt: Timestamp
    var OriginDetails: js.UndefOr[OriginDetails]
    var SourceId: js.UndefOr[Id]
  }

  object DataSetEntry {
    @inline
    def apply(
        Arn: Arn,
        AssetType: AssetType,
        CreatedAt: Timestamp,
        Description: Description,
        Id: Id,
        Name: Name,
        Origin: Origin,
        UpdatedAt: Timestamp,
        OriginDetails: js.UndefOr[OriginDetails] = js.undefined,
        SourceId: js.UndefOr[Id] = js.undefined
    ): DataSetEntry = {
      val __obj = js.Dynamic.literal(
        "Arn"         -> Arn.asInstanceOf[js.Any],
        "AssetType"   -> AssetType.asInstanceOf[js.Any],
        "CreatedAt"   -> CreatedAt.asInstanceOf[js.Any],
        "Description" -> Description.asInstanceOf[js.Any],
        "Id"          -> Id.asInstanceOf[js.Any],
        "Name"        -> Name.asInstanceOf[js.Any],
        "Origin"      -> Origin.asInstanceOf[js.Any],
        "UpdatedAt"   -> UpdatedAt.asInstanceOf[js.Any]
      )

      OriginDetails.foreach(__v => __obj.updateDynamic("OriginDetails")(__v.asInstanceOf[js.Any]))
      SourceId.foreach(__v => __obj.updateDynamic("SourceId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DataSetEntry]
    }
  }

  @js.native
  trait DeleteAssetRequest extends js.Object {
    var AssetId: __string
    var DataSetId: __string
    var RevisionId: __string
  }

  object DeleteAssetRequest {
    @inline
    def apply(
        AssetId: __string,
        DataSetId: __string,
        RevisionId: __string
    ): DeleteAssetRequest = {
      val __obj = js.Dynamic.literal(
        "AssetId"    -> AssetId.asInstanceOf[js.Any],
        "DataSetId"  -> DataSetId.asInstanceOf[js.Any],
        "RevisionId" -> RevisionId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteAssetRequest]
    }
  }

  @js.native
  trait DeleteDataSetRequest extends js.Object {
    var DataSetId: __string
  }

  object DeleteDataSetRequest {
    @inline
    def apply(
        DataSetId: __string
    ): DeleteDataSetRequest = {
      val __obj = js.Dynamic.literal(
        "DataSetId" -> DataSetId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteDataSetRequest]
    }
  }

  @js.native
  trait DeleteRevisionRequest extends js.Object {
    var DataSetId: __string
    var RevisionId: __string
  }

  object DeleteRevisionRequest {
    @inline
    def apply(
        DataSetId: __string,
        RevisionId: __string
    ): DeleteRevisionRequest = {
      val __obj = js.Dynamic.literal(
        "DataSetId"  -> DataSetId.asInstanceOf[js.Any],
        "RevisionId" -> RevisionId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteRevisionRequest]
    }
  }

  @js.native
  trait Details extends js.Object {
    var ImportAssetFromSignedUrlJobErrorDetails: js.UndefOr[ImportAssetFromSignedUrlJobErrorDetails]
    var ImportAssetsFromS3JobErrorDetails: js.UndefOr[ListOfAssetSourceEntry]
  }

  object Details {
    @inline
    def apply(
        ImportAssetFromSignedUrlJobErrorDetails: js.UndefOr[ImportAssetFromSignedUrlJobErrorDetails] = js.undefined,
        ImportAssetsFromS3JobErrorDetails: js.UndefOr[ListOfAssetSourceEntry] = js.undefined
    ): Details = {
      val __obj = js.Dynamic.literal()
      ImportAssetFromSignedUrlJobErrorDetails.foreach(__v =>
        __obj.updateDynamic("ImportAssetFromSignedUrlJobErrorDetails")(__v.asInstanceOf[js.Any])
      )
      ImportAssetsFromS3JobErrorDetails.foreach(__v =>
        __obj.updateDynamic("ImportAssetsFromS3JobErrorDetails")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[Details]
    }
  }

  /**
    * Details of the operation to be performed by the job.
    */
  @js.native
  trait ExportAssetToSignedUrlRequestDetails extends js.Object {
    var AssetId: Id
    var DataSetId: Id
    var RevisionId: Id
  }

  object ExportAssetToSignedUrlRequestDetails {
    @inline
    def apply(
        AssetId: Id,
        DataSetId: Id,
        RevisionId: Id
    ): ExportAssetToSignedUrlRequestDetails = {
      val __obj = js.Dynamic.literal(
        "AssetId"    -> AssetId.asInstanceOf[js.Any],
        "DataSetId"  -> DataSetId.asInstanceOf[js.Any],
        "RevisionId" -> RevisionId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ExportAssetToSignedUrlRequestDetails]
    }
  }

  /**
    * The details of the export to signed URL response.
    */
  @js.native
  trait ExportAssetToSignedUrlResponseDetails extends js.Object {
    var AssetId: Id
    var DataSetId: Id
    var RevisionId: Id
    var SignedUrl: js.UndefOr[__string]
    var SignedUrlExpiresAt: js.UndefOr[Timestamp]
  }

  object ExportAssetToSignedUrlResponseDetails {
    @inline
    def apply(
        AssetId: Id,
        DataSetId: Id,
        RevisionId: Id,
        SignedUrl: js.UndefOr[__string] = js.undefined,
        SignedUrlExpiresAt: js.UndefOr[Timestamp] = js.undefined
    ): ExportAssetToSignedUrlResponseDetails = {
      val __obj = js.Dynamic.literal(
        "AssetId"    -> AssetId.asInstanceOf[js.Any],
        "DataSetId"  -> DataSetId.asInstanceOf[js.Any],
        "RevisionId" -> RevisionId.asInstanceOf[js.Any]
      )

      SignedUrl.foreach(__v => __obj.updateDynamic("SignedUrl")(__v.asInstanceOf[js.Any]))
      SignedUrlExpiresAt.foreach(__v => __obj.updateDynamic("SignedUrlExpiresAt")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ExportAssetToSignedUrlResponseDetails]
    }
  }

  /**
    * Details of the operation to be performed by the job.
    */
  @js.native
  trait ExportAssetsToS3RequestDetails extends js.Object {
    var AssetDestinations: ListOfAssetDestinationEntry
    var DataSetId: Id
    var RevisionId: Id
  }

  object ExportAssetsToS3RequestDetails {
    @inline
    def apply(
        AssetDestinations: ListOfAssetDestinationEntry,
        DataSetId: Id,
        RevisionId: Id
    ): ExportAssetsToS3RequestDetails = {
      val __obj = js.Dynamic.literal(
        "AssetDestinations" -> AssetDestinations.asInstanceOf[js.Any],
        "DataSetId"         -> DataSetId.asInstanceOf[js.Any],
        "RevisionId"        -> RevisionId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ExportAssetsToS3RequestDetails]
    }
  }

  /**
    * Details about the export to Amazon S3 response.
    */
  @js.native
  trait ExportAssetsToS3ResponseDetails extends js.Object {
    var AssetDestinations: ListOfAssetDestinationEntry
    var DataSetId: Id
    var RevisionId: Id
  }

  object ExportAssetsToS3ResponseDetails {
    @inline
    def apply(
        AssetDestinations: ListOfAssetDestinationEntry,
        DataSetId: Id,
        RevisionId: Id
    ): ExportAssetsToS3ResponseDetails = {
      val __obj = js.Dynamic.literal(
        "AssetDestinations" -> AssetDestinations.asInstanceOf[js.Any],
        "DataSetId"         -> DataSetId.asInstanceOf[js.Any],
        "RevisionId"        -> RevisionId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ExportAssetsToS3ResponseDetails]
    }
  }

  @js.native
  trait GetAssetRequest extends js.Object {
    var AssetId: __string
    var DataSetId: __string
    var RevisionId: __string
  }

  object GetAssetRequest {
    @inline
    def apply(
        AssetId: __string,
        DataSetId: __string,
        RevisionId: __string
    ): GetAssetRequest = {
      val __obj = js.Dynamic.literal(
        "AssetId"    -> AssetId.asInstanceOf[js.Any],
        "DataSetId"  -> DataSetId.asInstanceOf[js.Any],
        "RevisionId" -> RevisionId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetAssetRequest]
    }
  }

  @js.native
  trait GetAssetResponse extends js.Object {
    var Arn: js.UndefOr[Arn]
    var AssetDetails: js.UndefOr[AssetDetails]
    var AssetType: js.UndefOr[AssetType]
    var CreatedAt: js.UndefOr[Timestamp]
    var DataSetId: js.UndefOr[Id]
    var Id: js.UndefOr[Id]
    var Name: js.UndefOr[AssetName]
    var RevisionId: js.UndefOr[Id]
    var SourceId: js.UndefOr[Id]
    var UpdatedAt: js.UndefOr[Timestamp]
  }

  object GetAssetResponse {
    @inline
    def apply(
        Arn: js.UndefOr[Arn] = js.undefined,
        AssetDetails: js.UndefOr[AssetDetails] = js.undefined,
        AssetType: js.UndefOr[AssetType] = js.undefined,
        CreatedAt: js.UndefOr[Timestamp] = js.undefined,
        DataSetId: js.UndefOr[Id] = js.undefined,
        Id: js.UndefOr[Id] = js.undefined,
        Name: js.UndefOr[AssetName] = js.undefined,
        RevisionId: js.UndefOr[Id] = js.undefined,
        SourceId: js.UndefOr[Id] = js.undefined,
        UpdatedAt: js.UndefOr[Timestamp] = js.undefined
    ): GetAssetResponse = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      AssetDetails.foreach(__v => __obj.updateDynamic("AssetDetails")(__v.asInstanceOf[js.Any]))
      AssetType.foreach(__v => __obj.updateDynamic("AssetType")(__v.asInstanceOf[js.Any]))
      CreatedAt.foreach(__v => __obj.updateDynamic("CreatedAt")(__v.asInstanceOf[js.Any]))
      DataSetId.foreach(__v => __obj.updateDynamic("DataSetId")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      RevisionId.foreach(__v => __obj.updateDynamic("RevisionId")(__v.asInstanceOf[js.Any]))
      SourceId.foreach(__v => __obj.updateDynamic("SourceId")(__v.asInstanceOf[js.Any]))
      UpdatedAt.foreach(__v => __obj.updateDynamic("UpdatedAt")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetAssetResponse]
    }
  }

  @js.native
  trait GetDataSetRequest extends js.Object {
    var DataSetId: __string
  }

  object GetDataSetRequest {
    @inline
    def apply(
        DataSetId: __string
    ): GetDataSetRequest = {
      val __obj = js.Dynamic.literal(
        "DataSetId" -> DataSetId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetDataSetRequest]
    }
  }

  @js.native
  trait GetDataSetResponse extends js.Object {
    var Arn: js.UndefOr[Arn]
    var AssetType: js.UndefOr[AssetType]
    var CreatedAt: js.UndefOr[Timestamp]
    var Description: js.UndefOr[Description]
    var Id: js.UndefOr[Id]
    var Name: js.UndefOr[Name]
    var Origin: js.UndefOr[Origin]
    var OriginDetails: js.UndefOr[OriginDetails]
    var SourceId: js.UndefOr[Id]
    var Tags: js.UndefOr[MapOf__string]
    var UpdatedAt: js.UndefOr[Timestamp]
  }

  object GetDataSetResponse {
    @inline
    def apply(
        Arn: js.UndefOr[Arn] = js.undefined,
        AssetType: js.UndefOr[AssetType] = js.undefined,
        CreatedAt: js.UndefOr[Timestamp] = js.undefined,
        Description: js.UndefOr[Description] = js.undefined,
        Id: js.UndefOr[Id] = js.undefined,
        Name: js.UndefOr[Name] = js.undefined,
        Origin: js.UndefOr[Origin] = js.undefined,
        OriginDetails: js.UndefOr[OriginDetails] = js.undefined,
        SourceId: js.UndefOr[Id] = js.undefined,
        Tags: js.UndefOr[MapOf__string] = js.undefined,
        UpdatedAt: js.UndefOr[Timestamp] = js.undefined
    ): GetDataSetResponse = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      AssetType.foreach(__v => __obj.updateDynamic("AssetType")(__v.asInstanceOf[js.Any]))
      CreatedAt.foreach(__v => __obj.updateDynamic("CreatedAt")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Origin.foreach(__v => __obj.updateDynamic("Origin")(__v.asInstanceOf[js.Any]))
      OriginDetails.foreach(__v => __obj.updateDynamic("OriginDetails")(__v.asInstanceOf[js.Any]))
      SourceId.foreach(__v => __obj.updateDynamic("SourceId")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      UpdatedAt.foreach(__v => __obj.updateDynamic("UpdatedAt")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDataSetResponse]
    }
  }

  @js.native
  trait GetJobRequest extends js.Object {
    var JobId: __string
  }

  object GetJobRequest {
    @inline
    def apply(
        JobId: __string
    ): GetJobRequest = {
      val __obj = js.Dynamic.literal(
        "JobId" -> JobId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetJobRequest]
    }
  }

  @js.native
  trait GetJobResponse extends js.Object {
    var Arn: js.UndefOr[Arn]
    var CreatedAt: js.UndefOr[Timestamp]
    var Details: js.UndefOr[ResponseDetails]
    var Errors: js.UndefOr[ListOfJobError]
    var Id: js.UndefOr[Id]
    var State: js.UndefOr[State]
    var Type: js.UndefOr[Type]
    var UpdatedAt: js.UndefOr[Timestamp]
  }

  object GetJobResponse {
    @inline
    def apply(
        Arn: js.UndefOr[Arn] = js.undefined,
        CreatedAt: js.UndefOr[Timestamp] = js.undefined,
        Details: js.UndefOr[ResponseDetails] = js.undefined,
        Errors: js.UndefOr[ListOfJobError] = js.undefined,
        Id: js.UndefOr[Id] = js.undefined,
        State: js.UndefOr[State] = js.undefined,
        Type: js.UndefOr[Type] = js.undefined,
        UpdatedAt: js.UndefOr[Timestamp] = js.undefined
    ): GetJobResponse = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      CreatedAt.foreach(__v => __obj.updateDynamic("CreatedAt")(__v.asInstanceOf[js.Any]))
      Details.foreach(__v => __obj.updateDynamic("Details")(__v.asInstanceOf[js.Any]))
      Errors.foreach(__v => __obj.updateDynamic("Errors")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      UpdatedAt.foreach(__v => __obj.updateDynamic("UpdatedAt")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetJobResponse]
    }
  }

  @js.native
  trait GetRevisionRequest extends js.Object {
    var DataSetId: __string
    var RevisionId: __string
  }

  object GetRevisionRequest {
    @inline
    def apply(
        DataSetId: __string,
        RevisionId: __string
    ): GetRevisionRequest = {
      val __obj = js.Dynamic.literal(
        "DataSetId"  -> DataSetId.asInstanceOf[js.Any],
        "RevisionId" -> RevisionId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetRevisionRequest]
    }
  }

  @js.native
  trait GetRevisionResponse extends js.Object {
    var Arn: js.UndefOr[Arn]
    var Comment: js.UndefOr[__stringMin0Max16384]
    var CreatedAt: js.UndefOr[Timestamp]
    var DataSetId: js.UndefOr[Id]
    var Finalized: js.UndefOr[__boolean]
    var Id: js.UndefOr[Id]
    var SourceId: js.UndefOr[Id]
    var Tags: js.UndefOr[MapOf__string]
    var UpdatedAt: js.UndefOr[Timestamp]
  }

  object GetRevisionResponse {
    @inline
    def apply(
        Arn: js.UndefOr[Arn] = js.undefined,
        Comment: js.UndefOr[__stringMin0Max16384] = js.undefined,
        CreatedAt: js.UndefOr[Timestamp] = js.undefined,
        DataSetId: js.UndefOr[Id] = js.undefined,
        Finalized: js.UndefOr[__boolean] = js.undefined,
        Id: js.UndefOr[Id] = js.undefined,
        SourceId: js.UndefOr[Id] = js.undefined,
        Tags: js.UndefOr[MapOf__string] = js.undefined,
        UpdatedAt: js.UndefOr[Timestamp] = js.undefined
    ): GetRevisionResponse = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      Comment.foreach(__v => __obj.updateDynamic("Comment")(__v.asInstanceOf[js.Any]))
      CreatedAt.foreach(__v => __obj.updateDynamic("CreatedAt")(__v.asInstanceOf[js.Any]))
      DataSetId.foreach(__v => __obj.updateDynamic("DataSetId")(__v.asInstanceOf[js.Any]))
      Finalized.foreach(__v => __obj.updateDynamic("Finalized")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      SourceId.foreach(__v => __obj.updateDynamic("SourceId")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      UpdatedAt.foreach(__v => __obj.updateDynamic("UpdatedAt")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetRevisionResponse]
    }
  }

  @js.native
  trait ImportAssetFromSignedUrlJobErrorDetails extends js.Object {
    var AssetName: AssetName
  }

  object ImportAssetFromSignedUrlJobErrorDetails {
    @inline
    def apply(
        AssetName: AssetName
    ): ImportAssetFromSignedUrlJobErrorDetails = {
      val __obj = js.Dynamic.literal(
        "AssetName" -> AssetName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ImportAssetFromSignedUrlJobErrorDetails]
    }
  }

  /**
    * Details of the operation to be performed by the job.
    */
  @js.native
  trait ImportAssetFromSignedUrlRequestDetails extends js.Object {
    var AssetName: AssetName
    var DataSetId: Id
    var Md5Hash: __stringMin24Max24PatternAZaZ094AZaZ092AZaZ093
    var RevisionId: Id
  }

  object ImportAssetFromSignedUrlRequestDetails {
    @inline
    def apply(
        AssetName: AssetName,
        DataSetId: Id,
        Md5Hash: __stringMin24Max24PatternAZaZ094AZaZ092AZaZ093,
        RevisionId: Id
    ): ImportAssetFromSignedUrlRequestDetails = {
      val __obj = js.Dynamic.literal(
        "AssetName"  -> AssetName.asInstanceOf[js.Any],
        "DataSetId"  -> DataSetId.asInstanceOf[js.Any],
        "Md5Hash"    -> Md5Hash.asInstanceOf[js.Any],
        "RevisionId" -> RevisionId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ImportAssetFromSignedUrlRequestDetails]
    }
  }

  /**
    * The details in the response for an import request, including the signed URL and other information.
    */
  @js.native
  trait ImportAssetFromSignedUrlResponseDetails extends js.Object {
    var AssetName: AssetName
    var DataSetId: Id
    var RevisionId: Id
    var Md5Hash: js.UndefOr[__stringMin24Max24PatternAZaZ094AZaZ092AZaZ093]
    var SignedUrl: js.UndefOr[__string]
    var SignedUrlExpiresAt: js.UndefOr[Timestamp]
  }

  object ImportAssetFromSignedUrlResponseDetails {
    @inline
    def apply(
        AssetName: AssetName,
        DataSetId: Id,
        RevisionId: Id,
        Md5Hash: js.UndefOr[__stringMin24Max24PatternAZaZ094AZaZ092AZaZ093] = js.undefined,
        SignedUrl: js.UndefOr[__string] = js.undefined,
        SignedUrlExpiresAt: js.UndefOr[Timestamp] = js.undefined
    ): ImportAssetFromSignedUrlResponseDetails = {
      val __obj = js.Dynamic.literal(
        "AssetName"  -> AssetName.asInstanceOf[js.Any],
        "DataSetId"  -> DataSetId.asInstanceOf[js.Any],
        "RevisionId" -> RevisionId.asInstanceOf[js.Any]
      )

      Md5Hash.foreach(__v => __obj.updateDynamic("Md5Hash")(__v.asInstanceOf[js.Any]))
      SignedUrl.foreach(__v => __obj.updateDynamic("SignedUrl")(__v.asInstanceOf[js.Any]))
      SignedUrlExpiresAt.foreach(__v => __obj.updateDynamic("SignedUrlExpiresAt")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ImportAssetFromSignedUrlResponseDetails]
    }
  }

  /**
    * Details of the operation to be performed by the job.
    */
  @js.native
  trait ImportAssetsFromS3RequestDetails extends js.Object {
    var AssetSources: ListOfAssetSourceEntry
    var DataSetId: Id
    var RevisionId: Id
  }

  object ImportAssetsFromS3RequestDetails {
    @inline
    def apply(
        AssetSources: ListOfAssetSourceEntry,
        DataSetId: Id,
        RevisionId: Id
    ): ImportAssetsFromS3RequestDetails = {
      val __obj = js.Dynamic.literal(
        "AssetSources" -> AssetSources.asInstanceOf[js.Any],
        "DataSetId"    -> DataSetId.asInstanceOf[js.Any],
        "RevisionId"   -> RevisionId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ImportAssetsFromS3RequestDetails]
    }
  }

  /**
    * Details from an import from Amazon S3 response.
    */
  @js.native
  trait ImportAssetsFromS3ResponseDetails extends js.Object {
    var AssetSources: ListOfAssetSourceEntry
    var DataSetId: Id
    var RevisionId: Id
  }

  object ImportAssetsFromS3ResponseDetails {
    @inline
    def apply(
        AssetSources: ListOfAssetSourceEntry,
        DataSetId: Id,
        RevisionId: Id
    ): ImportAssetsFromS3ResponseDetails = {
      val __obj = js.Dynamic.literal(
        "AssetSources" -> AssetSources.asInstanceOf[js.Any],
        "DataSetId"    -> DataSetId.asInstanceOf[js.Any],
        "RevisionId"   -> RevisionId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ImportAssetsFromS3ResponseDetails]
    }
  }

  /**
    * AWS Data Exchange Jobs are asynchronous import or export operations used to create or copy assets. A data set owner can both import and export as they see fit. Someone with an entitlement to a data set can only export. Jobs are deleted 90 days after they are created.
    */
  @js.native
  trait JobEntry extends js.Object {
    var Arn: Arn
    var CreatedAt: Timestamp
    var Details: ResponseDetails
    var Id: Id
    var State: State
    var Type: Type
    var UpdatedAt: Timestamp
    var Errors: js.UndefOr[ListOfJobError]
  }

  object JobEntry {
    @inline
    def apply(
        Arn: Arn,
        CreatedAt: Timestamp,
        Details: ResponseDetails,
        Id: Id,
        State: State,
        Type: Type,
        UpdatedAt: Timestamp,
        Errors: js.UndefOr[ListOfJobError] = js.undefined
    ): JobEntry = {
      val __obj = js.Dynamic.literal(
        "Arn"       -> Arn.asInstanceOf[js.Any],
        "CreatedAt" -> CreatedAt.asInstanceOf[js.Any],
        "Details"   -> Details.asInstanceOf[js.Any],
        "Id"        -> Id.asInstanceOf[js.Any],
        "State"     -> State.asInstanceOf[js.Any],
        "Type"      -> Type.asInstanceOf[js.Any],
        "UpdatedAt" -> UpdatedAt.asInstanceOf[js.Any]
      )

      Errors.foreach(__v => __obj.updateDynamic("Errors")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[JobEntry]
    }
  }

  /**
    * An error that occurred with the job request.
    */
  @js.native
  trait JobError extends js.Object {
    var Code: Code
    var Message: __string
    var Details: js.UndefOr[Details]
    var LimitName: js.UndefOr[JobErrorLimitName]
    var LimitValue: js.UndefOr[__double]
    var ResourceId: js.UndefOr[__string]
    var ResourceType: js.UndefOr[JobErrorResourceTypes]
  }

  object JobError {
    @inline
    def apply(
        Code: Code,
        Message: __string,
        Details: js.UndefOr[Details] = js.undefined,
        LimitName: js.UndefOr[JobErrorLimitName] = js.undefined,
        LimitValue: js.UndefOr[__double] = js.undefined,
        ResourceId: js.UndefOr[__string] = js.undefined,
        ResourceType: js.UndefOr[JobErrorResourceTypes] = js.undefined
    ): JobError = {
      val __obj = js.Dynamic.literal(
        "Code"    -> Code.asInstanceOf[js.Any],
        "Message" -> Message.asInstanceOf[js.Any]
      )

      Details.foreach(__v => __obj.updateDynamic("Details")(__v.asInstanceOf[js.Any]))
      LimitName.foreach(__v => __obj.updateDynamic("LimitName")(__v.asInstanceOf[js.Any]))
      LimitValue.foreach(__v => __obj.updateDynamic("LimitValue")(__v.asInstanceOf[js.Any]))
      ResourceId.foreach(__v => __obj.updateDynamic("ResourceId")(__v.asInstanceOf[js.Any]))
      ResourceType.foreach(__v => __obj.updateDynamic("ResourceType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[JobError]
    }
  }

  /**
    * The name of the limit that was reached.
    */
  object JobErrorLimitNameEnum {
    val `Assets per revision` = "Assets per revision"
    val `Asset size in GB`    = "Asset size in GB"

    val values = js.Object.freeze(js.Array(`Assets per revision`, `Asset size in GB`))
  }

  /**
    * The types of resource which the job error can apply to.
    */
  object JobErrorResourceTypesEnum {
    val REVISION = "REVISION"
    val ASSET    = "ASSET"

    val values = js.Object.freeze(js.Array(REVISION, ASSET))
  }

  @js.native
  trait ListDataSetRevisionsRequest extends js.Object {
    var DataSetId: __string
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[__string]
  }

  object ListDataSetRevisionsRequest {
    @inline
    def apply(
        DataSetId: __string,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): ListDataSetRevisionsRequest = {
      val __obj = js.Dynamic.literal(
        "DataSetId" -> DataSetId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDataSetRevisionsRequest]
    }
  }

  @js.native
  trait ListDataSetRevisionsResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Revisions: js.UndefOr[ListOfRevisionEntry]
  }

  object ListDataSetRevisionsResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        Revisions: js.UndefOr[ListOfRevisionEntry] = js.undefined
    ): ListDataSetRevisionsResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Revisions.foreach(__v => __obj.updateDynamic("Revisions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDataSetRevisionsResponse]
    }
  }

  @js.native
  trait ListDataSetsRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[__string]
    var Origin: js.UndefOr[__string]
  }

  object ListDataSetsRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined,
        Origin: js.UndefOr[__string] = js.undefined
    ): ListDataSetsRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Origin.foreach(__v => __obj.updateDynamic("Origin")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDataSetsRequest]
    }
  }

  @js.native
  trait ListDataSetsResponse extends js.Object {
    var DataSets: js.UndefOr[ListOfDataSetEntry]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListDataSetsResponse {
    @inline
    def apply(
        DataSets: js.UndefOr[ListOfDataSetEntry] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListDataSetsResponse = {
      val __obj = js.Dynamic.literal()
      DataSets.foreach(__v => __obj.updateDynamic("DataSets")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDataSetsResponse]
    }
  }

  @js.native
  trait ListJobsRequest extends js.Object {
    var DataSetId: js.UndefOr[__string]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[__string]
    var RevisionId: js.UndefOr[__string]
  }

  object ListJobsRequest {
    @inline
    def apply(
        DataSetId: js.UndefOr[__string] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined,
        RevisionId: js.UndefOr[__string] = js.undefined
    ): ListJobsRequest = {
      val __obj = js.Dynamic.literal()
      DataSetId.foreach(__v => __obj.updateDynamic("DataSetId")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      RevisionId.foreach(__v => __obj.updateDynamic("RevisionId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListJobsRequest]
    }
  }

  @js.native
  trait ListJobsResponse extends js.Object {
    var Jobs: js.UndefOr[ListOfJobEntry]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListJobsResponse {
    @inline
    def apply(
        Jobs: js.UndefOr[ListOfJobEntry] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListJobsResponse = {
      val __obj = js.Dynamic.literal()
      Jobs.foreach(__v => __obj.updateDynamic("Jobs")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListJobsResponse]
    }
  }

  @js.native
  trait ListRevisionAssetsRequest extends js.Object {
    var DataSetId: __string
    var RevisionId: __string
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[__string]
  }

  object ListRevisionAssetsRequest {
    @inline
    def apply(
        DataSetId: __string,
        RevisionId: __string,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): ListRevisionAssetsRequest = {
      val __obj = js.Dynamic.literal(
        "DataSetId"  -> DataSetId.asInstanceOf[js.Any],
        "RevisionId" -> RevisionId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListRevisionAssetsRequest]
    }
  }

  @js.native
  trait ListRevisionAssetsResponse extends js.Object {
    var Assets: js.UndefOr[ListOfAssetEntry]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListRevisionAssetsResponse {
    @inline
    def apply(
        Assets: js.UndefOr[ListOfAssetEntry] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListRevisionAssetsResponse = {
      val __obj = js.Dynamic.literal()
      Assets.foreach(__v => __obj.updateDynamic("Assets")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListRevisionAssetsResponse]
    }
  }

  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var ResourceArn: __string
  }

  object ListTagsForResourceRequest {
    @inline
    def apply(
        ResourceArn: __string
    ): ListTagsForResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ListTagsForResourceRequest]
    }
  }

  @js.native
  trait ListTagsForResourceResponse extends js.Object {
    var Tags: js.UndefOr[MapOf__string]
  }

  object ListTagsForResourceResponse {
    @inline
    def apply(
        Tags: js.UndefOr[MapOf__string] = js.undefined
    ): ListTagsForResourceResponse = {
      val __obj = js.Dynamic.literal()
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceResponse]
    }
  }

  /**
    * A property that defines the data set as OWNED by the account (for providers) or ENTITLED to the account (for subscribers). When an owned data set is published in a product, AWS Data Exchange creates a copy of the data set. Subscribers can access that copy of the data set as an entitled data set.
    */
  object OriginEnum {
    val OWNED    = "OWNED"
    val ENTITLED = "ENTITLED"

    val values = js.Object.freeze(js.Array(OWNED, ENTITLED))
  }

  @js.native
  trait OriginDetails extends js.Object {
    var ProductId: __string
  }

  object OriginDetails {
    @inline
    def apply(
        ProductId: __string
    ): OriginDetails = {
      val __obj = js.Dynamic.literal(
        "ProductId" -> ProductId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[OriginDetails]
    }
  }

  /**
    * The details for the request.
    */
  @js.native
  trait RequestDetails extends js.Object {
    var ExportAssetToSignedUrl: js.UndefOr[ExportAssetToSignedUrlRequestDetails]
    var ExportAssetsToS3: js.UndefOr[ExportAssetsToS3RequestDetails]
    var ImportAssetFromSignedUrl: js.UndefOr[ImportAssetFromSignedUrlRequestDetails]
    var ImportAssetsFromS3: js.UndefOr[ImportAssetsFromS3RequestDetails]
  }

  object RequestDetails {
    @inline
    def apply(
        ExportAssetToSignedUrl: js.UndefOr[ExportAssetToSignedUrlRequestDetails] = js.undefined,
        ExportAssetsToS3: js.UndefOr[ExportAssetsToS3RequestDetails] = js.undefined,
        ImportAssetFromSignedUrl: js.UndefOr[ImportAssetFromSignedUrlRequestDetails] = js.undefined,
        ImportAssetsFromS3: js.UndefOr[ImportAssetsFromS3RequestDetails] = js.undefined
    ): RequestDetails = {
      val __obj = js.Dynamic.literal()
      ExportAssetToSignedUrl.foreach(__v => __obj.updateDynamic("ExportAssetToSignedUrl")(__v.asInstanceOf[js.Any]))
      ExportAssetsToS3.foreach(__v => __obj.updateDynamic("ExportAssetsToS3")(__v.asInstanceOf[js.Any]))
      ImportAssetFromSignedUrl.foreach(__v => __obj.updateDynamic("ImportAssetFromSignedUrl")(__v.asInstanceOf[js.Any]))
      ImportAssetsFromS3.foreach(__v => __obj.updateDynamic("ImportAssetsFromS3")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RequestDetails]
    }
  }

  /**
    * Details for the response.
    */
  @js.native
  trait ResponseDetails extends js.Object {
    var ExportAssetToSignedUrl: js.UndefOr[ExportAssetToSignedUrlResponseDetails]
    var ExportAssetsToS3: js.UndefOr[ExportAssetsToS3ResponseDetails]
    var ImportAssetFromSignedUrl: js.UndefOr[ImportAssetFromSignedUrlResponseDetails]
    var ImportAssetsFromS3: js.UndefOr[ImportAssetsFromS3ResponseDetails]
  }

  object ResponseDetails {
    @inline
    def apply(
        ExportAssetToSignedUrl: js.UndefOr[ExportAssetToSignedUrlResponseDetails] = js.undefined,
        ExportAssetsToS3: js.UndefOr[ExportAssetsToS3ResponseDetails] = js.undefined,
        ImportAssetFromSignedUrl: js.UndefOr[ImportAssetFromSignedUrlResponseDetails] = js.undefined,
        ImportAssetsFromS3: js.UndefOr[ImportAssetsFromS3ResponseDetails] = js.undefined
    ): ResponseDetails = {
      val __obj = js.Dynamic.literal()
      ExportAssetToSignedUrl.foreach(__v => __obj.updateDynamic("ExportAssetToSignedUrl")(__v.asInstanceOf[js.Any]))
      ExportAssetsToS3.foreach(__v => __obj.updateDynamic("ExportAssetsToS3")(__v.asInstanceOf[js.Any]))
      ImportAssetFromSignedUrl.foreach(__v => __obj.updateDynamic("ImportAssetFromSignedUrl")(__v.asInstanceOf[js.Any]))
      ImportAssetsFromS3.foreach(__v => __obj.updateDynamic("ImportAssetsFromS3")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResponseDetails]
    }
  }

  /**
    * A revision is a container for one or more assets.
    */
  @js.native
  trait RevisionEntry extends js.Object {
    var Arn: Arn
    var CreatedAt: Timestamp
    var DataSetId: Id
    var Id: Id
    var UpdatedAt: Timestamp
    var Comment: js.UndefOr[__stringMin0Max16384]
    var Finalized: js.UndefOr[__boolean]
    var SourceId: js.UndefOr[Id]
  }

  object RevisionEntry {
    @inline
    def apply(
        Arn: Arn,
        CreatedAt: Timestamp,
        DataSetId: Id,
        Id: Id,
        UpdatedAt: Timestamp,
        Comment: js.UndefOr[__stringMin0Max16384] = js.undefined,
        Finalized: js.UndefOr[__boolean] = js.undefined,
        SourceId: js.UndefOr[Id] = js.undefined
    ): RevisionEntry = {
      val __obj = js.Dynamic.literal(
        "Arn"       -> Arn.asInstanceOf[js.Any],
        "CreatedAt" -> CreatedAt.asInstanceOf[js.Any],
        "DataSetId" -> DataSetId.asInstanceOf[js.Any],
        "Id"        -> Id.asInstanceOf[js.Any],
        "UpdatedAt" -> UpdatedAt.asInstanceOf[js.Any]
      )

      Comment.foreach(__v => __obj.updateDynamic("Comment")(__v.asInstanceOf[js.Any]))
      Finalized.foreach(__v => __obj.updateDynamic("Finalized")(__v.asInstanceOf[js.Any]))
      SourceId.foreach(__v => __obj.updateDynamic("SourceId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RevisionEntry]
    }
  }

  /**
    * The S3 object that is the asset.
    */
  @js.native
  trait S3SnapshotAsset extends js.Object {
    var Size: __doubleMin0
  }

  object S3SnapshotAsset {
    @inline
    def apply(
        Size: __doubleMin0
    ): S3SnapshotAsset = {
      val __obj = js.Dynamic.literal(
        "Size" -> Size.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[S3SnapshotAsset]
    }
  }

  @js.native
  trait StartJobRequest extends js.Object {
    var JobId: __string
  }

  object StartJobRequest {
    @inline
    def apply(
        JobId: __string
    ): StartJobRequest = {
      val __obj = js.Dynamic.literal(
        "JobId" -> JobId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[StartJobRequest]
    }
  }

  @js.native
  trait StartJobResponse extends js.Object {}

  object StartJobResponse {
    @inline
    def apply(
        ): StartJobResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[StartJobResponse]
    }
  }

  object StateEnum {
    val WAITING     = "WAITING"
    val IN_PROGRESS = "IN_PROGRESS"
    val ERROR       = "ERROR"
    val COMPLETED   = "COMPLETED"
    val CANCELLED   = "CANCELLED"
    val TIMED_OUT   = "TIMED_OUT"

    val values = js.Object.freeze(js.Array(WAITING, IN_PROGRESS, ERROR, COMPLETED, CANCELLED, TIMED_OUT))
  }

  /**
    * The request body for TagResource.
    */
  @js.native
  trait TagResourceRequest extends js.Object {
    var ResourceArn: __string
    var Tags: MapOf__string
  }

  object TagResourceRequest {
    @inline
    def apply(
        ResourceArn: __string,
        Tags: MapOf__string
    ): TagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any],
        "Tags"        -> Tags.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[TagResourceRequest]
    }
  }

  object TypeEnum {
    val IMPORT_ASSETS_FROM_S3        = "IMPORT_ASSETS_FROM_S3"
    val IMPORT_ASSET_FROM_SIGNED_URL = "IMPORT_ASSET_FROM_SIGNED_URL"
    val EXPORT_ASSETS_TO_S3          = "EXPORT_ASSETS_TO_S3"
    val EXPORT_ASSET_TO_SIGNED_URL   = "EXPORT_ASSET_TO_SIGNED_URL"

    val values = js.Object.freeze(
      js.Array(IMPORT_ASSETS_FROM_S3, IMPORT_ASSET_FROM_SIGNED_URL, EXPORT_ASSETS_TO_S3, EXPORT_ASSET_TO_SIGNED_URL)
    )
  }

  @js.native
  trait UntagResourceRequest extends js.Object {
    var ResourceArn: __string
    var TagKeys: ListOf__string
  }

  object UntagResourceRequest {
    @inline
    def apply(
        ResourceArn: __string,
        TagKeys: ListOf__string
    ): UntagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any],
        "TagKeys"     -> TagKeys.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UntagResourceRequest]
    }
  }

  /**
    * The request body for UpdateAsset.
    */
  @js.native
  trait UpdateAssetRequest extends js.Object {
    var AssetId: __string
    var DataSetId: __string
    var Name: AssetName
    var RevisionId: __string
  }

  object UpdateAssetRequest {
    @inline
    def apply(
        AssetId: __string,
        DataSetId: __string,
        Name: AssetName,
        RevisionId: __string
    ): UpdateAssetRequest = {
      val __obj = js.Dynamic.literal(
        "AssetId"    -> AssetId.asInstanceOf[js.Any],
        "DataSetId"  -> DataSetId.asInstanceOf[js.Any],
        "Name"       -> Name.asInstanceOf[js.Any],
        "RevisionId" -> RevisionId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UpdateAssetRequest]
    }
  }

  @js.native
  trait UpdateAssetResponse extends js.Object {
    var Arn: js.UndefOr[Arn]
    var AssetDetails: js.UndefOr[AssetDetails]
    var AssetType: js.UndefOr[AssetType]
    var CreatedAt: js.UndefOr[Timestamp]
    var DataSetId: js.UndefOr[Id]
    var Id: js.UndefOr[Id]
    var Name: js.UndefOr[AssetName]
    var RevisionId: js.UndefOr[Id]
    var SourceId: js.UndefOr[Id]
    var UpdatedAt: js.UndefOr[Timestamp]
  }

  object UpdateAssetResponse {
    @inline
    def apply(
        Arn: js.UndefOr[Arn] = js.undefined,
        AssetDetails: js.UndefOr[AssetDetails] = js.undefined,
        AssetType: js.UndefOr[AssetType] = js.undefined,
        CreatedAt: js.UndefOr[Timestamp] = js.undefined,
        DataSetId: js.UndefOr[Id] = js.undefined,
        Id: js.UndefOr[Id] = js.undefined,
        Name: js.UndefOr[AssetName] = js.undefined,
        RevisionId: js.UndefOr[Id] = js.undefined,
        SourceId: js.UndefOr[Id] = js.undefined,
        UpdatedAt: js.UndefOr[Timestamp] = js.undefined
    ): UpdateAssetResponse = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      AssetDetails.foreach(__v => __obj.updateDynamic("AssetDetails")(__v.asInstanceOf[js.Any]))
      AssetType.foreach(__v => __obj.updateDynamic("AssetType")(__v.asInstanceOf[js.Any]))
      CreatedAt.foreach(__v => __obj.updateDynamic("CreatedAt")(__v.asInstanceOf[js.Any]))
      DataSetId.foreach(__v => __obj.updateDynamic("DataSetId")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      RevisionId.foreach(__v => __obj.updateDynamic("RevisionId")(__v.asInstanceOf[js.Any]))
      SourceId.foreach(__v => __obj.updateDynamic("SourceId")(__v.asInstanceOf[js.Any]))
      UpdatedAt.foreach(__v => __obj.updateDynamic("UpdatedAt")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateAssetResponse]
    }
  }

  /**
    * The request body for UpdateDataSet.
    */
  @js.native
  trait UpdateDataSetRequest extends js.Object {
    var DataSetId: __string
    var Description: js.UndefOr[Description]
    var Name: js.UndefOr[Name]
  }

  object UpdateDataSetRequest {
    @inline
    def apply(
        DataSetId: __string,
        Description: js.UndefOr[Description] = js.undefined,
        Name: js.UndefOr[Name] = js.undefined
    ): UpdateDataSetRequest = {
      val __obj = js.Dynamic.literal(
        "DataSetId" -> DataSetId.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateDataSetRequest]
    }
  }

  @js.native
  trait UpdateDataSetResponse extends js.Object {
    var Arn: js.UndefOr[Arn]
    var AssetType: js.UndefOr[AssetType]
    var CreatedAt: js.UndefOr[Timestamp]
    var Description: js.UndefOr[Description]
    var Id: js.UndefOr[Id]
    var Name: js.UndefOr[Name]
    var Origin: js.UndefOr[Origin]
    var OriginDetails: js.UndefOr[OriginDetails]
    var SourceId: js.UndefOr[Id]
    var UpdatedAt: js.UndefOr[Timestamp]
  }

  object UpdateDataSetResponse {
    @inline
    def apply(
        Arn: js.UndefOr[Arn] = js.undefined,
        AssetType: js.UndefOr[AssetType] = js.undefined,
        CreatedAt: js.UndefOr[Timestamp] = js.undefined,
        Description: js.UndefOr[Description] = js.undefined,
        Id: js.UndefOr[Id] = js.undefined,
        Name: js.UndefOr[Name] = js.undefined,
        Origin: js.UndefOr[Origin] = js.undefined,
        OriginDetails: js.UndefOr[OriginDetails] = js.undefined,
        SourceId: js.UndefOr[Id] = js.undefined,
        UpdatedAt: js.UndefOr[Timestamp] = js.undefined
    ): UpdateDataSetResponse = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      AssetType.foreach(__v => __obj.updateDynamic("AssetType")(__v.asInstanceOf[js.Any]))
      CreatedAt.foreach(__v => __obj.updateDynamic("CreatedAt")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Origin.foreach(__v => __obj.updateDynamic("Origin")(__v.asInstanceOf[js.Any]))
      OriginDetails.foreach(__v => __obj.updateDynamic("OriginDetails")(__v.asInstanceOf[js.Any]))
      SourceId.foreach(__v => __obj.updateDynamic("SourceId")(__v.asInstanceOf[js.Any]))
      UpdatedAt.foreach(__v => __obj.updateDynamic("UpdatedAt")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateDataSetResponse]
    }
  }

  /**
    * The request body for UpdateRevision.
    */
  @js.native
  trait UpdateRevisionRequest extends js.Object {
    var DataSetId: __string
    var RevisionId: __string
    var Comment: js.UndefOr[__stringMin0Max16384]
    var Finalized: js.UndefOr[__boolean]
  }

  object UpdateRevisionRequest {
    @inline
    def apply(
        DataSetId: __string,
        RevisionId: __string,
        Comment: js.UndefOr[__stringMin0Max16384] = js.undefined,
        Finalized: js.UndefOr[__boolean] = js.undefined
    ): UpdateRevisionRequest = {
      val __obj = js.Dynamic.literal(
        "DataSetId"  -> DataSetId.asInstanceOf[js.Any],
        "RevisionId" -> RevisionId.asInstanceOf[js.Any]
      )

      Comment.foreach(__v => __obj.updateDynamic("Comment")(__v.asInstanceOf[js.Any]))
      Finalized.foreach(__v => __obj.updateDynamic("Finalized")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateRevisionRequest]
    }
  }

  @js.native
  trait UpdateRevisionResponse extends js.Object {
    var Arn: js.UndefOr[Arn]
    var Comment: js.UndefOr[__stringMin0Max16384]
    var CreatedAt: js.UndefOr[Timestamp]
    var DataSetId: js.UndefOr[Id]
    var Finalized: js.UndefOr[__boolean]
    var Id: js.UndefOr[Id]
    var SourceId: js.UndefOr[Id]
    var UpdatedAt: js.UndefOr[Timestamp]
  }

  object UpdateRevisionResponse {
    @inline
    def apply(
        Arn: js.UndefOr[Arn] = js.undefined,
        Comment: js.UndefOr[__stringMin0Max16384] = js.undefined,
        CreatedAt: js.UndefOr[Timestamp] = js.undefined,
        DataSetId: js.UndefOr[Id] = js.undefined,
        Finalized: js.UndefOr[__boolean] = js.undefined,
        Id: js.UndefOr[Id] = js.undefined,
        SourceId: js.UndefOr[Id] = js.undefined,
        UpdatedAt: js.UndefOr[Timestamp] = js.undefined
    ): UpdateRevisionResponse = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      Comment.foreach(__v => __obj.updateDynamic("Comment")(__v.asInstanceOf[js.Any]))
      CreatedAt.foreach(__v => __obj.updateDynamic("CreatedAt")(__v.asInstanceOf[js.Any]))
      DataSetId.foreach(__v => __obj.updateDynamic("DataSetId")(__v.asInstanceOf[js.Any]))
      Finalized.foreach(__v => __obj.updateDynamic("Finalized")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      SourceId.foreach(__v => __obj.updateDynamic("SourceId")(__v.asInstanceOf[js.Any]))
      UpdatedAt.foreach(__v => __obj.updateDynamic("UpdatedAt")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateRevisionResponse]
    }
  }
}
