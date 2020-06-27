package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object dataexchange {
  type Arn                                            = String
  type AssetName                                      = String
  type Description                                    = String
  type Id                                             = String
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
  type Timestamp                                      = js.Date
  type __boolean                                      = Boolean
  type __double                                       = Double
  type __doubleMin0                                   = Double
  type __string                                       = String
  type __stringMin0Max16384                           = String
  type __stringMin24Max24PatternAZaZ094AZaZ092AZaZ093 = String

  implicit final class DataExchangeOps(private val service: DataExchange) extends AnyVal {

    @inline def cancelJobFuture(params: CancelJobRequest): Future[js.Object] =
      service.cancelJob(params).promise().toFuture
    @inline def createDataSetFuture(params: CreateDataSetRequest): Future[CreateDataSetResponse] =
      service.createDataSet(params).promise().toFuture
    @inline def createJobFuture(params: CreateJobRequest): Future[CreateJobResponse] =
      service.createJob(params).promise().toFuture
    @inline def createRevisionFuture(params: CreateRevisionRequest): Future[CreateRevisionResponse] =
      service.createRevision(params).promise().toFuture
    @inline def deleteAssetFuture(params: DeleteAssetRequest): Future[js.Object] =
      service.deleteAsset(params).promise().toFuture
    @inline def deleteDataSetFuture(params: DeleteDataSetRequest): Future[js.Object] =
      service.deleteDataSet(params).promise().toFuture
    @inline def deleteRevisionFuture(params: DeleteRevisionRequest): Future[js.Object] =
      service.deleteRevision(params).promise().toFuture
    @inline def getAssetFuture(params: GetAssetRequest): Future[GetAssetResponse] =
      service.getAsset(params).promise().toFuture
    @inline def getDataSetFuture(params: GetDataSetRequest): Future[GetDataSetResponse] =
      service.getDataSet(params).promise().toFuture
    @inline def getJobFuture(params: GetJobRequest): Future[GetJobResponse] = service.getJob(params).promise().toFuture
    @inline def getRevisionFuture(params: GetRevisionRequest): Future[GetRevisionResponse] =
      service.getRevision(params).promise().toFuture
    @inline def listDataSetRevisionsFuture(params: ListDataSetRevisionsRequest): Future[ListDataSetRevisionsResponse] =
      service.listDataSetRevisions(params).promise().toFuture
    @inline def listDataSetsFuture(params: ListDataSetsRequest): Future[ListDataSetsResponse] =
      service.listDataSets(params).promise().toFuture
    @inline def listJobsFuture(params: ListJobsRequest): Future[ListJobsResponse] =
      service.listJobs(params).promise().toFuture
    @inline def listRevisionAssetsFuture(params: ListRevisionAssetsRequest): Future[ListRevisionAssetsResponse] =
      service.listRevisionAssets(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] =
      service.listTagsForResource(params).promise().toFuture
    @inline def startJobFuture(params: StartJobRequest): Future[StartJobResponse] =
      service.startJob(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[js.Object] =
      service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[js.Object] =
      service.untagResource(params).promise().toFuture
    @inline def updateAssetFuture(params: UpdateAssetRequest): Future[UpdateAssetResponse] =
      service.updateAsset(params).promise().toFuture
    @inline def updateDataSetFuture(params: UpdateDataSetRequest): Future[UpdateDataSetResponse] =
      service.updateDataSet(params).promise().toFuture
    @inline def updateRevisionFuture(params: UpdateRevisionRequest): Future[UpdateRevisionResponse] =
      service.updateRevision(params).promise().toFuture
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
  @Factory
  trait AssetDestinationEntry extends js.Object {
    var AssetId: Id
    var Bucket: __string
    var Key: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait AssetDetails extends js.Object {
    var S3SnapshotAsset: js.UndefOr[S3SnapshotAsset]
  }

  /**
    * An asset in AWS Data Exchange is a piece of data that can be stored as an S3 object. The asset can be a structured data file, an image file, or some other data file. When you create an import job for your files, you create an asset in AWS Data Exchange for each of those files.
    */
  @js.native
  @Factory
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

  /**
    * The source of the assets.
    */
  @js.native
  @Factory
  trait AssetSourceEntry extends js.Object {
    var Bucket: __string
    var Key: __string
  }

  /**
    * The type of file your data is stored in. Currently, the supported asset type is S3_SNAPSHOT.
    */
  @js.native
  sealed trait AssetType extends js.Any
  object AssetType extends js.Object {
    val S3_SNAPSHOT = "S3_SNAPSHOT".asInstanceOf[AssetType]

    val values = js.Object.freeze(js.Array(S3_SNAPSHOT))
  }

  @js.native
  @Factory
  trait CancelJobRequest extends js.Object {
    var JobId: __string
  }

  @js.native
  sealed trait Code extends js.Any
  object Code extends js.Object {
    val ACCESS_DENIED_EXCEPTION          = "ACCESS_DENIED_EXCEPTION".asInstanceOf[Code]
    val INTERNAL_SERVER_EXCEPTION        = "INTERNAL_SERVER_EXCEPTION".asInstanceOf[Code]
    val MALWARE_DETECTED                 = "MALWARE_DETECTED".asInstanceOf[Code]
    val RESOURCE_NOT_FOUND_EXCEPTION     = "RESOURCE_NOT_FOUND_EXCEPTION".asInstanceOf[Code]
    val SERVICE_QUOTA_EXCEEDED_EXCEPTION = "SERVICE_QUOTA_EXCEEDED_EXCEPTION".asInstanceOf[Code]
    val VALIDATION_EXCEPTION             = "VALIDATION_EXCEPTION".asInstanceOf[Code]
    val MALWARE_SCAN_ENCRYPTED_FILE      = "MALWARE_SCAN_ENCRYPTED_FILE".asInstanceOf[Code]

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
  @Factory
  trait CreateDataSetRequest extends js.Object {
    var AssetType: AssetType
    var Description: Description
    var Name: Name
    var Tags: js.UndefOr[MapOf__string]
  }

  @js.native
  @Factory
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

  /**
    * The request body for CreateJob.
    */
  @js.native
  @Factory
  trait CreateJobRequest extends js.Object {
    var Details: RequestDetails
    var Type: Type
  }

  @js.native
  @Factory
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

  /**
    * The request body for CreateRevision.
    */
  @js.native
  @Factory
  trait CreateRevisionRequest extends js.Object {
    var DataSetId: __string
    var Comment: js.UndefOr[__stringMin0Max16384]
    var Tags: js.UndefOr[MapOf__string]
  }

  @js.native
  @Factory
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

  /**
    * A data set is an AWS resource with one or more revisions.
    */
  @js.native
  @Factory
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

  @js.native
  @Factory
  trait DeleteAssetRequest extends js.Object {
    var AssetId: __string
    var DataSetId: __string
    var RevisionId: __string
  }

  @js.native
  @Factory
  trait DeleteDataSetRequest extends js.Object {
    var DataSetId: __string
  }

  @js.native
  @Factory
  trait DeleteRevisionRequest extends js.Object {
    var DataSetId: __string
    var RevisionId: __string
  }

  @js.native
  @Factory
  trait Details extends js.Object {
    var ImportAssetFromSignedUrlJobErrorDetails: js.UndefOr[ImportAssetFromSignedUrlJobErrorDetails]
    var ImportAssetsFromS3JobErrorDetails: js.UndefOr[ListOfAssetSourceEntry]
  }

  /**
    * Details of the operation to be performed by the job.
    */
  @js.native
  @Factory
  trait ExportAssetToSignedUrlRequestDetails extends js.Object {
    var AssetId: Id
    var DataSetId: Id
    var RevisionId: Id
  }

  /**
    * The details of the export to signed URL response.
    */
  @js.native
  @Factory
  trait ExportAssetToSignedUrlResponseDetails extends js.Object {
    var AssetId: Id
    var DataSetId: Id
    var RevisionId: Id
    var SignedUrl: js.UndefOr[__string]
    var SignedUrlExpiresAt: js.UndefOr[Timestamp]
  }

  /**
    * Details of the operation to be performed by the job.
    */
  @js.native
  @Factory
  trait ExportAssetsToS3RequestDetails extends js.Object {
    var AssetDestinations: ListOfAssetDestinationEntry
    var DataSetId: Id
    var RevisionId: Id
  }

  /**
    * Details about the export to Amazon S3 response.
    */
  @js.native
  @Factory
  trait ExportAssetsToS3ResponseDetails extends js.Object {
    var AssetDestinations: ListOfAssetDestinationEntry
    var DataSetId: Id
    var RevisionId: Id
  }

  @js.native
  @Factory
  trait GetAssetRequest extends js.Object {
    var AssetId: __string
    var DataSetId: __string
    var RevisionId: __string
  }

  @js.native
  @Factory
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

  @js.native
  @Factory
  trait GetDataSetRequest extends js.Object {
    var DataSetId: __string
  }

  @js.native
  @Factory
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

  @js.native
  @Factory
  trait GetJobRequest extends js.Object {
    var JobId: __string
  }

  @js.native
  @Factory
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

  @js.native
  @Factory
  trait GetRevisionRequest extends js.Object {
    var DataSetId: __string
    var RevisionId: __string
  }

  @js.native
  @Factory
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

  @js.native
  @Factory
  trait ImportAssetFromSignedUrlJobErrorDetails extends js.Object {
    var AssetName: AssetName
  }

  /**
    * Details of the operation to be performed by the job.
    */
  @js.native
  @Factory
  trait ImportAssetFromSignedUrlRequestDetails extends js.Object {
    var AssetName: AssetName
    var DataSetId: Id
    var Md5Hash: __stringMin24Max24PatternAZaZ094AZaZ092AZaZ093
    var RevisionId: Id
  }

  /**
    * The details in the response for an import request, including the signed URL and other information.
    */
  @js.native
  @Factory
  trait ImportAssetFromSignedUrlResponseDetails extends js.Object {
    var AssetName: AssetName
    var DataSetId: Id
    var RevisionId: Id
    var Md5Hash: js.UndefOr[__stringMin24Max24PatternAZaZ094AZaZ092AZaZ093]
    var SignedUrl: js.UndefOr[__string]
    var SignedUrlExpiresAt: js.UndefOr[Timestamp]
  }

  /**
    * Details of the operation to be performed by the job.
    */
  @js.native
  @Factory
  trait ImportAssetsFromS3RequestDetails extends js.Object {
    var AssetSources: ListOfAssetSourceEntry
    var DataSetId: Id
    var RevisionId: Id
  }

  /**
    * Details from an import from Amazon S3 response.
    */
  @js.native
  @Factory
  trait ImportAssetsFromS3ResponseDetails extends js.Object {
    var AssetSources: ListOfAssetSourceEntry
    var DataSetId: Id
    var RevisionId: Id
  }

  /**
    * AWS Data Exchange Jobs are asynchronous import or export operations used to create or copy assets. A data set owner can both import and export as they see fit. Someone with an entitlement to a data set can only export. Jobs are deleted 90 days after they are created.
    */
  @js.native
  @Factory
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

  /**
    * An error that occurred with the job request.
    */
  @js.native
  @Factory
  trait JobError extends js.Object {
    var Code: Code
    var Message: __string
    var Details: js.UndefOr[Details]
    var LimitName: js.UndefOr[JobErrorLimitName]
    var LimitValue: js.UndefOr[__double]
    var ResourceId: js.UndefOr[__string]
    var ResourceType: js.UndefOr[JobErrorResourceTypes]
  }

  /**
    * The name of the limit that was reached.
    */
  @js.native
  sealed trait JobErrorLimitName extends js.Any
  object JobErrorLimitName extends js.Object {
    val `Assets per revision` = "Assets per revision".asInstanceOf[JobErrorLimitName]
    val `Asset size in GB`    = "Asset size in GB".asInstanceOf[JobErrorLimitName]

    val values = js.Object.freeze(js.Array(`Assets per revision`, `Asset size in GB`))
  }

  /**
    * The types of resource which the job error can apply to.
    */
  @js.native
  sealed trait JobErrorResourceTypes extends js.Any
  object JobErrorResourceTypes extends js.Object {
    val REVISION = "REVISION".asInstanceOf[JobErrorResourceTypes]
    val ASSET    = "ASSET".asInstanceOf[JobErrorResourceTypes]

    val values = js.Object.freeze(js.Array(REVISION, ASSET))
  }

  @js.native
  @Factory
  trait ListDataSetRevisionsRequest extends js.Object {
    var DataSetId: __string
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait ListDataSetRevisionsResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Revisions: js.UndefOr[ListOfRevisionEntry]
  }

  @js.native
  @Factory
  trait ListDataSetsRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[__string]
    var Origin: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait ListDataSetsResponse extends js.Object {
    var DataSets: js.UndefOr[ListOfDataSetEntry]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListJobsRequest extends js.Object {
    var DataSetId: js.UndefOr[__string]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[__string]
    var RevisionId: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait ListJobsResponse extends js.Object {
    var Jobs: js.UndefOr[ListOfJobEntry]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListRevisionAssetsRequest extends js.Object {
    var DataSetId: __string
    var RevisionId: __string
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait ListRevisionAssetsResponse extends js.Object {
    var Assets: js.UndefOr[ListOfAssetEntry]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListTagsForResourceRequest extends js.Object {
    var ResourceArn: __string
  }

  @js.native
  @Factory
  trait ListTagsForResourceResponse extends js.Object {
    var Tags: js.UndefOr[MapOf__string]
  }

  /**
    * A property that defines the data set as OWNED by the account (for providers) or ENTITLED to the account (for subscribers). When an owned data set is published in a product, AWS Data Exchange creates a copy of the data set. Subscribers can access that copy of the data set as an entitled data set.
    */
  @js.native
  sealed trait Origin extends js.Any
  object Origin extends js.Object {
    val OWNED    = "OWNED".asInstanceOf[Origin]
    val ENTITLED = "ENTITLED".asInstanceOf[Origin]

    val values = js.Object.freeze(js.Array(OWNED, ENTITLED))
  }

  @js.native
  @Factory
  trait OriginDetails extends js.Object {
    var ProductId: __string
  }

  /**
    * The details for the request.
    */
  @js.native
  @Factory
  trait RequestDetails extends js.Object {
    var ExportAssetToSignedUrl: js.UndefOr[ExportAssetToSignedUrlRequestDetails]
    var ExportAssetsToS3: js.UndefOr[ExportAssetsToS3RequestDetails]
    var ImportAssetFromSignedUrl: js.UndefOr[ImportAssetFromSignedUrlRequestDetails]
    var ImportAssetsFromS3: js.UndefOr[ImportAssetsFromS3RequestDetails]
  }

  /**
    * Details for the response.
    */
  @js.native
  @Factory
  trait ResponseDetails extends js.Object {
    var ExportAssetToSignedUrl: js.UndefOr[ExportAssetToSignedUrlResponseDetails]
    var ExportAssetsToS3: js.UndefOr[ExportAssetsToS3ResponseDetails]
    var ImportAssetFromSignedUrl: js.UndefOr[ImportAssetFromSignedUrlResponseDetails]
    var ImportAssetsFromS3: js.UndefOr[ImportAssetsFromS3ResponseDetails]
  }

  /**
    * A revision is a container for one or more assets.
    */
  @js.native
  @Factory
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

  /**
    * The S3 object that is the asset.
    */
  @js.native
  @Factory
  trait S3SnapshotAsset extends js.Object {
    var Size: __doubleMin0
  }

  @js.native
  @Factory
  trait StartJobRequest extends js.Object {
    var JobId: __string
  }

  @js.native
  @Factory
  trait StartJobResponse extends js.Object {}

  @js.native
  sealed trait State extends js.Any
  object State extends js.Object {
    val WAITING     = "WAITING".asInstanceOf[State]
    val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[State]
    val ERROR       = "ERROR".asInstanceOf[State]
    val COMPLETED   = "COMPLETED".asInstanceOf[State]
    val CANCELLED   = "CANCELLED".asInstanceOf[State]
    val TIMED_OUT   = "TIMED_OUT".asInstanceOf[State]

    val values = js.Object.freeze(js.Array(WAITING, IN_PROGRESS, ERROR, COMPLETED, CANCELLED, TIMED_OUT))
  }

  /**
    * The request body for TagResource.
    */
  @js.native
  @Factory
  trait TagResourceRequest extends js.Object {
    var ResourceArn: __string
    var Tags: MapOf__string
  }

  @js.native
  sealed trait Type extends js.Any
  object Type extends js.Object {
    val IMPORT_ASSETS_FROM_S3        = "IMPORT_ASSETS_FROM_S3".asInstanceOf[Type]
    val IMPORT_ASSET_FROM_SIGNED_URL = "IMPORT_ASSET_FROM_SIGNED_URL".asInstanceOf[Type]
    val EXPORT_ASSETS_TO_S3          = "EXPORT_ASSETS_TO_S3".asInstanceOf[Type]
    val EXPORT_ASSET_TO_SIGNED_URL   = "EXPORT_ASSET_TO_SIGNED_URL".asInstanceOf[Type]

    val values = js.Object.freeze(
      js.Array(IMPORT_ASSETS_FROM_S3, IMPORT_ASSET_FROM_SIGNED_URL, EXPORT_ASSETS_TO_S3, EXPORT_ASSET_TO_SIGNED_URL)
    )
  }

  @js.native
  @Factory
  trait UntagResourceRequest extends js.Object {
    var ResourceArn: __string
    var TagKeys: ListOf__string
  }

  /**
    * The request body for UpdateAsset.
    */
  @js.native
  @Factory
  trait UpdateAssetRequest extends js.Object {
    var AssetId: __string
    var DataSetId: __string
    var Name: AssetName
    var RevisionId: __string
  }

  @js.native
  @Factory
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

  /**
    * The request body for UpdateDataSet.
    */
  @js.native
  @Factory
  trait UpdateDataSetRequest extends js.Object {
    var DataSetId: __string
    var Description: js.UndefOr[Description]
    var Name: js.UndefOr[Name]
  }

  @js.native
  @Factory
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

  /**
    * The request body for UpdateRevision.
    */
  @js.native
  @Factory
  trait UpdateRevisionRequest extends js.Object {
    var DataSetId: __string
    var RevisionId: __string
    var Comment: js.UndefOr[__stringMin0Max16384]
    var Finalized: js.UndefOr[__boolean]
  }

  @js.native
  @Factory
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
}
