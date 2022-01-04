package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import scala.language.implicitConversions
import facade.amazonaws._

package object dataexchange {
  type ApiDescription = String
  type Arn = String
  type AssetName = String
  type Description = String
  type Id = String
  type ListOfAssetDestinationEntry = js.Array[AssetDestinationEntry]
  type ListOfAssetEntry = js.Array[AssetEntry]
  type ListOfAssetSourceEntry = js.Array[AssetSourceEntry]
  type ListOfDataSetEntry = js.Array[DataSetEntry]
  type ListOfEventActionEntry = js.Array[EventActionEntry]
  type ListOfJobEntry = js.Array[JobEntry]
  type ListOfJobError = js.Array[JobError]
  type ListOfRedshiftDataShareAssetSourceEntry = js.Array[RedshiftDataShareAssetSourceEntry]
  type ListOfRevisionDestinationEntry = js.Array[RevisionDestinationEntry]
  type ListOfRevisionEntry = js.Array[RevisionEntry]
  type ListOf__string = js.Array[__string]
  type MapOf__string = js.Dictionary[__string]
  type MaxResults = Int
  type Name = String
  type NextToken = String
  type Timestamp = js.Date
  type __boolean = Boolean
  type __double = Double
  type __doubleMin0 = Double
  type __string = String
  type __stringMin0Max16384 = String
  type __stringMin24Max24PatternAZaZ094AZaZ092AZaZ093 = String

  final class DataExchangeOps(private val service: DataExchange) extends AnyVal {

    @inline def cancelJobFuture(params: CancelJobRequest): Future[js.Object] = service.cancelJob(params).promise().toFuture
    @inline def createDataSetFuture(params: CreateDataSetRequest): Future[CreateDataSetResponse] = service.createDataSet(params).promise().toFuture
    @inline def createEventActionFuture(params: CreateEventActionRequest): Future[CreateEventActionResponse] = service.createEventAction(params).promise().toFuture
    @inline def createJobFuture(params: CreateJobRequest): Future[CreateJobResponse] = service.createJob(params).promise().toFuture
    @inline def createRevisionFuture(params: CreateRevisionRequest): Future[CreateRevisionResponse] = service.createRevision(params).promise().toFuture
    @inline def deleteAssetFuture(params: DeleteAssetRequest): Future[js.Object] = service.deleteAsset(params).promise().toFuture
    @inline def deleteDataSetFuture(params: DeleteDataSetRequest): Future[js.Object] = service.deleteDataSet(params).promise().toFuture
    @inline def deleteEventActionFuture(params: DeleteEventActionRequest): Future[js.Object] = service.deleteEventAction(params).promise().toFuture
    @inline def deleteRevisionFuture(params: DeleteRevisionRequest): Future[js.Object] = service.deleteRevision(params).promise().toFuture
    @inline def getAssetFuture(params: GetAssetRequest): Future[GetAssetResponse] = service.getAsset(params).promise().toFuture
    @inline def getDataSetFuture(params: GetDataSetRequest): Future[GetDataSetResponse] = service.getDataSet(params).promise().toFuture
    @inline def getEventActionFuture(params: GetEventActionRequest): Future[GetEventActionResponse] = service.getEventAction(params).promise().toFuture
    @inline def getJobFuture(params: GetJobRequest): Future[GetJobResponse] = service.getJob(params).promise().toFuture
    @inline def getRevisionFuture(params: GetRevisionRequest): Future[GetRevisionResponse] = service.getRevision(params).promise().toFuture
    @inline def listDataSetRevisionsFuture(params: ListDataSetRevisionsRequest): Future[ListDataSetRevisionsResponse] = service.listDataSetRevisions(params).promise().toFuture
    @inline def listDataSetsFuture(params: ListDataSetsRequest): Future[ListDataSetsResponse] = service.listDataSets(params).promise().toFuture
    @inline def listEventActionsFuture(params: ListEventActionsRequest): Future[ListEventActionsResponse] = service.listEventActions(params).promise().toFuture
    @inline def listJobsFuture(params: ListJobsRequest): Future[ListJobsResponse] = service.listJobs(params).promise().toFuture
    @inline def listRevisionAssetsFuture(params: ListRevisionAssetsRequest): Future[ListRevisionAssetsResponse] = service.listRevisionAssets(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] = service.listTagsForResource(params).promise().toFuture
    @inline def sendApiAssetFuture(params: SendApiAssetRequest): Future[SendApiAssetResponse] = service.sendApiAsset(params).promise().toFuture
    @inline def startJobFuture(params: StartJobRequest): Future[StartJobResponse] = service.startJob(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[js.Object] = service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[js.Object] = service.untagResource(params).promise().toFuture
    @inline def updateAssetFuture(params: UpdateAssetRequest): Future[UpdateAssetResponse] = service.updateAsset(params).promise().toFuture
    @inline def updateDataSetFuture(params: UpdateDataSetRequest): Future[UpdateDataSetResponse] = service.updateDataSet(params).promise().toFuture
    @inline def updateEventActionFuture(params: UpdateEventActionRequest): Future[UpdateEventActionResponse] = service.updateEventAction(params).promise().toFuture
    @inline def updateRevisionFuture(params: UpdateRevisionRequest): Future[UpdateRevisionResponse] = service.updateRevision(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/dataexchange", JSImport.Namespace, "AWS.DataExchange")
  class DataExchange() extends js.Object {
    def this(config: AWSConfig) = this()

    def cancelJob(params: CancelJobRequest): Request[js.Object] = js.native
    def createDataSet(params: CreateDataSetRequest): Request[CreateDataSetResponse] = js.native
    def createEventAction(params: CreateEventActionRequest): Request[CreateEventActionResponse] = js.native
    def createJob(params: CreateJobRequest): Request[CreateJobResponse] = js.native
    def createRevision(params: CreateRevisionRequest): Request[CreateRevisionResponse] = js.native
    def deleteAsset(params: DeleteAssetRequest): Request[js.Object] = js.native
    def deleteDataSet(params: DeleteDataSetRequest): Request[js.Object] = js.native
    def deleteEventAction(params: DeleteEventActionRequest): Request[js.Object] = js.native
    def deleteRevision(params: DeleteRevisionRequest): Request[js.Object] = js.native
    def getAsset(params: GetAssetRequest): Request[GetAssetResponse] = js.native
    def getDataSet(params: GetDataSetRequest): Request[GetDataSetResponse] = js.native
    def getEventAction(params: GetEventActionRequest): Request[GetEventActionResponse] = js.native
    def getJob(params: GetJobRequest): Request[GetJobResponse] = js.native
    def getRevision(params: GetRevisionRequest): Request[GetRevisionResponse] = js.native
    def listDataSetRevisions(params: ListDataSetRevisionsRequest): Request[ListDataSetRevisionsResponse] = js.native
    def listDataSets(params: ListDataSetsRequest): Request[ListDataSetsResponse] = js.native
    def listEventActions(params: ListEventActionsRequest): Request[ListEventActionsResponse] = js.native
    def listJobs(params: ListJobsRequest): Request[ListJobsResponse] = js.native
    def listRevisionAssets(params: ListRevisionAssetsRequest): Request[ListRevisionAssetsResponse] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def sendApiAsset(params: SendApiAssetRequest): Request[SendApiAssetResponse] = js.native
    def startJob(params: StartJobRequest): Request[StartJobResponse] = js.native
    def tagResource(params: TagResourceRequest): Request[js.Object] = js.native
    def untagResource(params: UntagResourceRequest): Request[js.Object] = js.native
    def updateAsset(params: UpdateAssetRequest): Request[UpdateAssetResponse] = js.native
    def updateDataSet(params: UpdateDataSetRequest): Request[UpdateDataSetResponse] = js.native
    def updateEventAction(params: UpdateEventActionRequest): Request[UpdateEventActionResponse] = js.native
    def updateRevision(params: UpdateRevisionRequest): Request[UpdateRevisionResponse] = js.native
  }
  object DataExchange {
    @inline implicit def toOps(service: DataExchange): DataExchangeOps = {
      new DataExchangeOps(service)
    }
  }

  /** What occurs after a certain event.
    */
  @js.native
  trait Action extends js.Object {
    var ExportRevisionToS3: js.UndefOr[AutoExportRevisionToS3RequestDetails]
  }

  object Action {
    @inline
    def apply(
        ExportRevisionToS3: js.UndefOr[AutoExportRevisionToS3RequestDetails] = js.undefined
    ): Action = {
      val __obj = js.Dynamic.literal()
      ExportRevisionToS3.foreach(__v => __obj.updateDynamic("ExportRevisionToS3")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Action]
    }
  }

  /** The API Gateway API that is the asset.
    */
  @js.native
  trait ApiGatewayApiAsset extends js.Object {
    var ApiDescription: js.UndefOr[ApiDescription]
    var ApiEndpoint: js.UndefOr[__string]
    var ApiId: js.UndefOr[__string]
    var ApiKey: js.UndefOr[__string]
    var ApiName: js.UndefOr[__string]
    var ApiSpecificationDownloadUrl: js.UndefOr[__string]
    var ApiSpecificationDownloadUrlExpiresAt: js.UndefOr[Timestamp]
    var ProtocolType: js.UndefOr[ProtocolType]
    var Stage: js.UndefOr[__string]
  }

  object ApiGatewayApiAsset {
    @inline
    def apply(
        ApiDescription: js.UndefOr[ApiDescription] = js.undefined,
        ApiEndpoint: js.UndefOr[__string] = js.undefined,
        ApiId: js.UndefOr[__string] = js.undefined,
        ApiKey: js.UndefOr[__string] = js.undefined,
        ApiName: js.UndefOr[__string] = js.undefined,
        ApiSpecificationDownloadUrl: js.UndefOr[__string] = js.undefined,
        ApiSpecificationDownloadUrlExpiresAt: js.UndefOr[Timestamp] = js.undefined,
        ProtocolType: js.UndefOr[ProtocolType] = js.undefined,
        Stage: js.UndefOr[__string] = js.undefined
    ): ApiGatewayApiAsset = {
      val __obj = js.Dynamic.literal()
      ApiDescription.foreach(__v => __obj.updateDynamic("ApiDescription")(__v.asInstanceOf[js.Any]))
      ApiEndpoint.foreach(__v => __obj.updateDynamic("ApiEndpoint")(__v.asInstanceOf[js.Any]))
      ApiId.foreach(__v => __obj.updateDynamic("ApiId")(__v.asInstanceOf[js.Any]))
      ApiKey.foreach(__v => __obj.updateDynamic("ApiKey")(__v.asInstanceOf[js.Any]))
      ApiName.foreach(__v => __obj.updateDynamic("ApiName")(__v.asInstanceOf[js.Any]))
      ApiSpecificationDownloadUrl.foreach(__v => __obj.updateDynamic("ApiSpecificationDownloadUrl")(__v.asInstanceOf[js.Any]))
      ApiSpecificationDownloadUrlExpiresAt.foreach(__v => __obj.updateDynamic("ApiSpecificationDownloadUrlExpiresAt")(__v.asInstanceOf[js.Any]))
      ProtocolType.foreach(__v => __obj.updateDynamic("ProtocolType")(__v.asInstanceOf[js.Any]))
      Stage.foreach(__v => __obj.updateDynamic("Stage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ApiGatewayApiAsset]
    }
  }

  /** The destination for the asset.
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
        "Bucket" -> Bucket.asInstanceOf[js.Any]
      )

      Key.foreach(__v => __obj.updateDynamic("Key")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssetDestinationEntry]
    }
  }

  /** Information about the asset.
    */
  @js.native
  trait AssetDetails extends js.Object {
    var ApiGatewayApiAsset: js.UndefOr[ApiGatewayApiAsset]
    var RedshiftDataShareAsset: js.UndefOr[RedshiftDataShareAsset]
    var S3SnapshotAsset: js.UndefOr[S3SnapshotAsset]
  }

  object AssetDetails {
    @inline
    def apply(
        ApiGatewayApiAsset: js.UndefOr[ApiGatewayApiAsset] = js.undefined,
        RedshiftDataShareAsset: js.UndefOr[RedshiftDataShareAsset] = js.undefined,
        S3SnapshotAsset: js.UndefOr[S3SnapshotAsset] = js.undefined
    ): AssetDetails = {
      val __obj = js.Dynamic.literal()
      ApiGatewayApiAsset.foreach(__v => __obj.updateDynamic("ApiGatewayApiAsset")(__v.asInstanceOf[js.Any]))
      RedshiftDataShareAsset.foreach(__v => __obj.updateDynamic("RedshiftDataShareAsset")(__v.asInstanceOf[js.Any]))
      S3SnapshotAsset.foreach(__v => __obj.updateDynamic("S3SnapshotAsset")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssetDetails]
    }
  }

  /** An asset in AWS Data Exchange is a piece of data (S3 object) or a means of fulfilling data (Amazon Redshift datashare or Amazon API Gateway API). The asset can be a structured data file, an image file, or some other data file that can be stored as an S3 object, an Amazon API Gateway API, or an Amazon Redshift datashare (Preview). When you create an import job for your files, API Gateway APIs, or Amazon Redshift datashares, you create an asset in AWS Data Exchange.
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
        "Arn" -> Arn.asInstanceOf[js.Any],
        "AssetDetails" -> AssetDetails.asInstanceOf[js.Any],
        "AssetType" -> AssetType.asInstanceOf[js.Any],
        "CreatedAt" -> CreatedAt.asInstanceOf[js.Any],
        "DataSetId" -> DataSetId.asInstanceOf[js.Any],
        "Id" -> Id.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any],
        "RevisionId" -> RevisionId.asInstanceOf[js.Any],
        "UpdatedAt" -> UpdatedAt.asInstanceOf[js.Any]
      )

      SourceId.foreach(__v => __obj.updateDynamic("SourceId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssetEntry]
    }
  }

  /** The source of the assets.
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
        "Key" -> Key.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AssetSourceEntry]
    }
  }

  /** A revision destination is the Amazon S3 bucket folder destination to where the export will be sent.
    */
  @js.native
  trait AutoExportRevisionDestinationEntry extends js.Object {
    var Bucket: __string
    var KeyPattern: js.UndefOr[__string]
  }

  object AutoExportRevisionDestinationEntry {
    @inline
    def apply(
        Bucket: __string,
        KeyPattern: js.UndefOr[__string] = js.undefined
    ): AutoExportRevisionDestinationEntry = {
      val __obj = js.Dynamic.literal(
        "Bucket" -> Bucket.asInstanceOf[js.Any]
      )

      KeyPattern.foreach(__v => __obj.updateDynamic("KeyPattern")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AutoExportRevisionDestinationEntry]
    }
  }

  /** Details of the operation to be performed by the job.
    */
  @js.native
  trait AutoExportRevisionToS3RequestDetails extends js.Object {
    var RevisionDestination: AutoExportRevisionDestinationEntry
    var Encryption: js.UndefOr[ExportServerSideEncryption]
  }

  object AutoExportRevisionToS3RequestDetails {
    @inline
    def apply(
        RevisionDestination: AutoExportRevisionDestinationEntry,
        Encryption: js.UndefOr[ExportServerSideEncryption] = js.undefined
    ): AutoExportRevisionToS3RequestDetails = {
      val __obj = js.Dynamic.literal(
        "RevisionDestination" -> RevisionDestination.asInstanceOf[js.Any]
      )

      Encryption.foreach(__v => __obj.updateDynamic("Encryption")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AutoExportRevisionToS3RequestDetails]
    }
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

  /** The request body for CreateDataSet.
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
        "AssetType" -> AssetType.asInstanceOf[js.Any],
        "Description" -> Description.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]
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

  /** The request body for CreateEventAction.
    */
  @js.native
  trait CreateEventActionRequest extends js.Object {
    var Action: Action
    var Event: Event
  }

  object CreateEventActionRequest {
    @inline
    def apply(
        Action: Action,
        Event: Event
    ): CreateEventActionRequest = {
      val __obj = js.Dynamic.literal(
        "Action" -> Action.asInstanceOf[js.Any],
        "Event" -> Event.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateEventActionRequest]
    }
  }

  @js.native
  trait CreateEventActionResponse extends js.Object {
    var Action: js.UndefOr[Action]
    var Arn: js.UndefOr[Arn]
    var CreatedAt: js.UndefOr[Timestamp]
    var Event: js.UndefOr[Event]
    var Id: js.UndefOr[Id]
    var UpdatedAt: js.UndefOr[Timestamp]
  }

  object CreateEventActionResponse {
    @inline
    def apply(
        Action: js.UndefOr[Action] = js.undefined,
        Arn: js.UndefOr[Arn] = js.undefined,
        CreatedAt: js.UndefOr[Timestamp] = js.undefined,
        Event: js.UndefOr[Event] = js.undefined,
        Id: js.UndefOr[Id] = js.undefined,
        UpdatedAt: js.UndefOr[Timestamp] = js.undefined
    ): CreateEventActionResponse = {
      val __obj = js.Dynamic.literal()
      Action.foreach(__v => __obj.updateDynamic("Action")(__v.asInstanceOf[js.Any]))
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      CreatedAt.foreach(__v => __obj.updateDynamic("CreatedAt")(__v.asInstanceOf[js.Any]))
      Event.foreach(__v => __obj.updateDynamic("Event")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      UpdatedAt.foreach(__v => __obj.updateDynamic("UpdatedAt")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateEventActionResponse]
    }
  }

  /** The request body for CreateJob.
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
        "Type" -> Type.asInstanceOf[js.Any]
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

  /** The request body for CreateRevision.
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

  /** A data set is an AWS resource with one or more revisions.
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
        "Arn" -> Arn.asInstanceOf[js.Any],
        "AssetType" -> AssetType.asInstanceOf[js.Any],
        "CreatedAt" -> CreatedAt.asInstanceOf[js.Any],
        "Description" -> Description.asInstanceOf[js.Any],
        "Id" -> Id.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any],
        "Origin" -> Origin.asInstanceOf[js.Any],
        "UpdatedAt" -> UpdatedAt.asInstanceOf[js.Any]
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
        "AssetId" -> AssetId.asInstanceOf[js.Any],
        "DataSetId" -> DataSetId.asInstanceOf[js.Any],
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
  trait DeleteEventActionRequest extends js.Object {
    var EventActionId: __string
  }

  object DeleteEventActionRequest {
    @inline
    def apply(
        EventActionId: __string
    ): DeleteEventActionRequest = {
      val __obj = js.Dynamic.literal(
        "EventActionId" -> EventActionId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteEventActionRequest]
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
        "DataSetId" -> DataSetId.asInstanceOf[js.Any],
        "RevisionId" -> RevisionId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteRevisionRequest]
    }
  }

  /** Information about the job error.
    */
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
      ImportAssetFromSignedUrlJobErrorDetails.foreach(__v => __obj.updateDynamic("ImportAssetFromSignedUrlJobErrorDetails")(__v.asInstanceOf[js.Any]))
      ImportAssetsFromS3JobErrorDetails.foreach(__v => __obj.updateDynamic("ImportAssetsFromS3JobErrorDetails")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Details]
    }
  }

  /** What occurs to start an action.
    */
  @js.native
  trait Event extends js.Object {
    var RevisionPublished: js.UndefOr[RevisionPublished]
  }

  object Event {
    @inline
    def apply(
        RevisionPublished: js.UndefOr[RevisionPublished] = js.undefined
    ): Event = {
      val __obj = js.Dynamic.literal()
      RevisionPublished.foreach(__v => __obj.updateDynamic("RevisionPublished")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Event]
    }
  }

  /** An event action is an object that defines the relationship between a specific event and an automated action that will be taken on behalf of the customer.
    */
  @js.native
  trait EventActionEntry extends js.Object {
    var Action: Action
    var Arn: Arn
    var CreatedAt: Timestamp
    var Event: Event
    var Id: Id
    var UpdatedAt: Timestamp
  }

  object EventActionEntry {
    @inline
    def apply(
        Action: Action,
        Arn: Arn,
        CreatedAt: Timestamp,
        Event: Event,
        Id: Id,
        UpdatedAt: Timestamp
    ): EventActionEntry = {
      val __obj = js.Dynamic.literal(
        "Action" -> Action.asInstanceOf[js.Any],
        "Arn" -> Arn.asInstanceOf[js.Any],
        "CreatedAt" -> CreatedAt.asInstanceOf[js.Any],
        "Event" -> Event.asInstanceOf[js.Any],
        "Id" -> Id.asInstanceOf[js.Any],
        "UpdatedAt" -> UpdatedAt.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[EventActionEntry]
    }
  }

  /** Details of the operation to be performed by the job.
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
        "AssetId" -> AssetId.asInstanceOf[js.Any],
        "DataSetId" -> DataSetId.asInstanceOf[js.Any],
        "RevisionId" -> RevisionId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ExportAssetToSignedUrlRequestDetails]
    }
  }

  /** The details of the export to signed URL response.
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
        "AssetId" -> AssetId.asInstanceOf[js.Any],
        "DataSetId" -> DataSetId.asInstanceOf[js.Any],
        "RevisionId" -> RevisionId.asInstanceOf[js.Any]
      )

      SignedUrl.foreach(__v => __obj.updateDynamic("SignedUrl")(__v.asInstanceOf[js.Any]))
      SignedUrlExpiresAt.foreach(__v => __obj.updateDynamic("SignedUrlExpiresAt")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ExportAssetToSignedUrlResponseDetails]
    }
  }

  /** Details of the operation to be performed by the job.
    */
  @js.native
  trait ExportAssetsToS3RequestDetails extends js.Object {
    var AssetDestinations: ListOfAssetDestinationEntry
    var DataSetId: Id
    var RevisionId: Id
    var Encryption: js.UndefOr[ExportServerSideEncryption]
  }

  object ExportAssetsToS3RequestDetails {
    @inline
    def apply(
        AssetDestinations: ListOfAssetDestinationEntry,
        DataSetId: Id,
        RevisionId: Id,
        Encryption: js.UndefOr[ExportServerSideEncryption] = js.undefined
    ): ExportAssetsToS3RequestDetails = {
      val __obj = js.Dynamic.literal(
        "AssetDestinations" -> AssetDestinations.asInstanceOf[js.Any],
        "DataSetId" -> DataSetId.asInstanceOf[js.Any],
        "RevisionId" -> RevisionId.asInstanceOf[js.Any]
      )

      Encryption.foreach(__v => __obj.updateDynamic("Encryption")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ExportAssetsToS3RequestDetails]
    }
  }

  /** Details about the export to Amazon S3 response.
    */
  @js.native
  trait ExportAssetsToS3ResponseDetails extends js.Object {
    var AssetDestinations: ListOfAssetDestinationEntry
    var DataSetId: Id
    var RevisionId: Id
    var Encryption: js.UndefOr[ExportServerSideEncryption]
  }

  object ExportAssetsToS3ResponseDetails {
    @inline
    def apply(
        AssetDestinations: ListOfAssetDestinationEntry,
        DataSetId: Id,
        RevisionId: Id,
        Encryption: js.UndefOr[ExportServerSideEncryption] = js.undefined
    ): ExportAssetsToS3ResponseDetails = {
      val __obj = js.Dynamic.literal(
        "AssetDestinations" -> AssetDestinations.asInstanceOf[js.Any],
        "DataSetId" -> DataSetId.asInstanceOf[js.Any],
        "RevisionId" -> RevisionId.asInstanceOf[js.Any]
      )

      Encryption.foreach(__v => __obj.updateDynamic("Encryption")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ExportAssetsToS3ResponseDetails]
    }
  }

  /** Details of the operation to be performed by the job.
    */
  @js.native
  trait ExportRevisionsToS3RequestDetails extends js.Object {
    var DataSetId: Id
    var RevisionDestinations: ListOfRevisionDestinationEntry
    var Encryption: js.UndefOr[ExportServerSideEncryption]
  }

  object ExportRevisionsToS3RequestDetails {
    @inline
    def apply(
        DataSetId: Id,
        RevisionDestinations: ListOfRevisionDestinationEntry,
        Encryption: js.UndefOr[ExportServerSideEncryption] = js.undefined
    ): ExportRevisionsToS3RequestDetails = {
      val __obj = js.Dynamic.literal(
        "DataSetId" -> DataSetId.asInstanceOf[js.Any],
        "RevisionDestinations" -> RevisionDestinations.asInstanceOf[js.Any]
      )

      Encryption.foreach(__v => __obj.updateDynamic("Encryption")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ExportRevisionsToS3RequestDetails]
    }
  }

  /** Details about the export revisions to Amazon S3 response.
    */
  @js.native
  trait ExportRevisionsToS3ResponseDetails extends js.Object {
    var DataSetId: Id
    var RevisionDestinations: ListOfRevisionDestinationEntry
    var Encryption: js.UndefOr[ExportServerSideEncryption]
    var EventActionArn: js.UndefOr[__string]
  }

  object ExportRevisionsToS3ResponseDetails {
    @inline
    def apply(
        DataSetId: Id,
        RevisionDestinations: ListOfRevisionDestinationEntry,
        Encryption: js.UndefOr[ExportServerSideEncryption] = js.undefined,
        EventActionArn: js.UndefOr[__string] = js.undefined
    ): ExportRevisionsToS3ResponseDetails = {
      val __obj = js.Dynamic.literal(
        "DataSetId" -> DataSetId.asInstanceOf[js.Any],
        "RevisionDestinations" -> RevisionDestinations.asInstanceOf[js.Any]
      )

      Encryption.foreach(__v => __obj.updateDynamic("Encryption")(__v.asInstanceOf[js.Any]))
      EventActionArn.foreach(__v => __obj.updateDynamic("EventActionArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ExportRevisionsToS3ResponseDetails]
    }
  }

  /** Encryption configuration of the export job. Includes the encryption type in addition to the AWS KMS key. The KMS key is only necessary if you chose the KMS encryption. type.
    */
  @js.native
  trait ExportServerSideEncryption extends js.Object {
    var Type: ServerSideEncryptionTypes
    var KmsKeyArn: js.UndefOr[__string]
  }

  object ExportServerSideEncryption {
    @inline
    def apply(
        Type: ServerSideEncryptionTypes,
        KmsKeyArn: js.UndefOr[__string] = js.undefined
    ): ExportServerSideEncryption = {
      val __obj = js.Dynamic.literal(
        "Type" -> Type.asInstanceOf[js.Any]
      )

      KmsKeyArn.foreach(__v => __obj.updateDynamic("KmsKeyArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ExportServerSideEncryption]
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
        "AssetId" -> AssetId.asInstanceOf[js.Any],
        "DataSetId" -> DataSetId.asInstanceOf[js.Any],
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
  trait GetEventActionRequest extends js.Object {
    var EventActionId: __string
  }

  object GetEventActionRequest {
    @inline
    def apply(
        EventActionId: __string
    ): GetEventActionRequest = {
      val __obj = js.Dynamic.literal(
        "EventActionId" -> EventActionId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetEventActionRequest]
    }
  }

  @js.native
  trait GetEventActionResponse extends js.Object {
    var Action: js.UndefOr[Action]
    var Arn: js.UndefOr[Arn]
    var CreatedAt: js.UndefOr[Timestamp]
    var Event: js.UndefOr[Event]
    var Id: js.UndefOr[Id]
    var UpdatedAt: js.UndefOr[Timestamp]
  }

  object GetEventActionResponse {
    @inline
    def apply(
        Action: js.UndefOr[Action] = js.undefined,
        Arn: js.UndefOr[Arn] = js.undefined,
        CreatedAt: js.UndefOr[Timestamp] = js.undefined,
        Event: js.UndefOr[Event] = js.undefined,
        Id: js.UndefOr[Id] = js.undefined,
        UpdatedAt: js.UndefOr[Timestamp] = js.undefined
    ): GetEventActionResponse = {
      val __obj = js.Dynamic.literal()
      Action.foreach(__v => __obj.updateDynamic("Action")(__v.asInstanceOf[js.Any]))
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      CreatedAt.foreach(__v => __obj.updateDynamic("CreatedAt")(__v.asInstanceOf[js.Any]))
      Event.foreach(__v => __obj.updateDynamic("Event")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      UpdatedAt.foreach(__v => __obj.updateDynamic("UpdatedAt")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetEventActionResponse]
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
        "DataSetId" -> DataSetId.asInstanceOf[js.Any],
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

  /** The request details.
    */
  @js.native
  trait ImportAssetFromApiGatewayApiRequestDetails extends js.Object {
    var ApiId: __string
    var ApiName: __string
    var ApiSpecificationMd5Hash: __stringMin24Max24PatternAZaZ094AZaZ092AZaZ093
    var DataSetId: Id
    var ProtocolType: ProtocolType
    var RevisionId: Id
    var Stage: __string
    var ApiDescription: js.UndefOr[ApiDescription]
    var ApiKey: js.UndefOr[__string]
  }

  object ImportAssetFromApiGatewayApiRequestDetails {
    @inline
    def apply(
        ApiId: __string,
        ApiName: __string,
        ApiSpecificationMd5Hash: __stringMin24Max24PatternAZaZ094AZaZ092AZaZ093,
        DataSetId: Id,
        ProtocolType: ProtocolType,
        RevisionId: Id,
        Stage: __string,
        ApiDescription: js.UndefOr[ApiDescription] = js.undefined,
        ApiKey: js.UndefOr[__string] = js.undefined
    ): ImportAssetFromApiGatewayApiRequestDetails = {
      val __obj = js.Dynamic.literal(
        "ApiId" -> ApiId.asInstanceOf[js.Any],
        "ApiName" -> ApiName.asInstanceOf[js.Any],
        "ApiSpecificationMd5Hash" -> ApiSpecificationMd5Hash.asInstanceOf[js.Any],
        "DataSetId" -> DataSetId.asInstanceOf[js.Any],
        "ProtocolType" -> ProtocolType.asInstanceOf[js.Any],
        "RevisionId" -> RevisionId.asInstanceOf[js.Any],
        "Stage" -> Stage.asInstanceOf[js.Any]
      )

      ApiDescription.foreach(__v => __obj.updateDynamic("ApiDescription")(__v.asInstanceOf[js.Any]))
      ApiKey.foreach(__v => __obj.updateDynamic("ApiKey")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ImportAssetFromApiGatewayApiRequestDetails]
    }
  }

  /** The response details.
    */
  @js.native
  trait ImportAssetFromApiGatewayApiResponseDetails extends js.Object {
    var ApiId: __string
    var ApiName: __string
    var ApiSpecificationMd5Hash: __stringMin24Max24PatternAZaZ094AZaZ092AZaZ093
    var ApiSpecificationUploadUrl: __string
    var ApiSpecificationUploadUrlExpiresAt: Timestamp
    var DataSetId: Id
    var ProtocolType: ProtocolType
    var RevisionId: Id
    var Stage: __string
    var ApiDescription: js.UndefOr[ApiDescription]
    var ApiKey: js.UndefOr[__string]
  }

  object ImportAssetFromApiGatewayApiResponseDetails {
    @inline
    def apply(
        ApiId: __string,
        ApiName: __string,
        ApiSpecificationMd5Hash: __stringMin24Max24PatternAZaZ094AZaZ092AZaZ093,
        ApiSpecificationUploadUrl: __string,
        ApiSpecificationUploadUrlExpiresAt: Timestamp,
        DataSetId: Id,
        ProtocolType: ProtocolType,
        RevisionId: Id,
        Stage: __string,
        ApiDescription: js.UndefOr[ApiDescription] = js.undefined,
        ApiKey: js.UndefOr[__string] = js.undefined
    ): ImportAssetFromApiGatewayApiResponseDetails = {
      val __obj = js.Dynamic.literal(
        "ApiId" -> ApiId.asInstanceOf[js.Any],
        "ApiName" -> ApiName.asInstanceOf[js.Any],
        "ApiSpecificationMd5Hash" -> ApiSpecificationMd5Hash.asInstanceOf[js.Any],
        "ApiSpecificationUploadUrl" -> ApiSpecificationUploadUrl.asInstanceOf[js.Any],
        "ApiSpecificationUploadUrlExpiresAt" -> ApiSpecificationUploadUrlExpiresAt.asInstanceOf[js.Any],
        "DataSetId" -> DataSetId.asInstanceOf[js.Any],
        "ProtocolType" -> ProtocolType.asInstanceOf[js.Any],
        "RevisionId" -> RevisionId.asInstanceOf[js.Any],
        "Stage" -> Stage.asInstanceOf[js.Any]
      )

      ApiDescription.foreach(__v => __obj.updateDynamic("ApiDescription")(__v.asInstanceOf[js.Any]))
      ApiKey.foreach(__v => __obj.updateDynamic("ApiKey")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ImportAssetFromApiGatewayApiResponseDetails]
    }
  }

  /** Information about the job error.
    */
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

  /** Details of the operation to be performed by the job.
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
        "AssetName" -> AssetName.asInstanceOf[js.Any],
        "DataSetId" -> DataSetId.asInstanceOf[js.Any],
        "Md5Hash" -> Md5Hash.asInstanceOf[js.Any],
        "RevisionId" -> RevisionId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ImportAssetFromSignedUrlRequestDetails]
    }
  }

  /** The details in the response for an import request, including the signed URL and other information.
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
        "AssetName" -> AssetName.asInstanceOf[js.Any],
        "DataSetId" -> DataSetId.asInstanceOf[js.Any],
        "RevisionId" -> RevisionId.asInstanceOf[js.Any]
      )

      Md5Hash.foreach(__v => __obj.updateDynamic("Md5Hash")(__v.asInstanceOf[js.Any]))
      SignedUrl.foreach(__v => __obj.updateDynamic("SignedUrl")(__v.asInstanceOf[js.Any]))
      SignedUrlExpiresAt.foreach(__v => __obj.updateDynamic("SignedUrlExpiresAt")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ImportAssetFromSignedUrlResponseDetails]
    }
  }

  /** Details from an import from Amazon Redshift datashare request.
    */
  @js.native
  trait ImportAssetsFromRedshiftDataSharesRequestDetails extends js.Object {
    var AssetSources: ListOfRedshiftDataShareAssetSourceEntry
    var DataSetId: Id
    var RevisionId: Id
  }

  object ImportAssetsFromRedshiftDataSharesRequestDetails {
    @inline
    def apply(
        AssetSources: ListOfRedshiftDataShareAssetSourceEntry,
        DataSetId: Id,
        RevisionId: Id
    ): ImportAssetsFromRedshiftDataSharesRequestDetails = {
      val __obj = js.Dynamic.literal(
        "AssetSources" -> AssetSources.asInstanceOf[js.Any],
        "DataSetId" -> DataSetId.asInstanceOf[js.Any],
        "RevisionId" -> RevisionId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ImportAssetsFromRedshiftDataSharesRequestDetails]
    }
  }

  /** Details from an import from Amazon Redshift datashare response.
    */
  @js.native
  trait ImportAssetsFromRedshiftDataSharesResponseDetails extends js.Object {
    var AssetSources: ListOfRedshiftDataShareAssetSourceEntry
    var DataSetId: Id
    var RevisionId: Id
  }

  object ImportAssetsFromRedshiftDataSharesResponseDetails {
    @inline
    def apply(
        AssetSources: ListOfRedshiftDataShareAssetSourceEntry,
        DataSetId: Id,
        RevisionId: Id
    ): ImportAssetsFromRedshiftDataSharesResponseDetails = {
      val __obj = js.Dynamic.literal(
        "AssetSources" -> AssetSources.asInstanceOf[js.Any],
        "DataSetId" -> DataSetId.asInstanceOf[js.Any],
        "RevisionId" -> RevisionId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ImportAssetsFromRedshiftDataSharesResponseDetails]
    }
  }

  /** Details of the operation to be performed by the job.
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
        "DataSetId" -> DataSetId.asInstanceOf[js.Any],
        "RevisionId" -> RevisionId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ImportAssetsFromS3RequestDetails]
    }
  }

  /** Details from an import from Amazon S3 response.
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
        "DataSetId" -> DataSetId.asInstanceOf[js.Any],
        "RevisionId" -> RevisionId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ImportAssetsFromS3ResponseDetails]
    }
  }

  /** AWS Data Exchange Jobs are asynchronous import or export operations used to create or copy assets. A data set owner can both import and export as they see fit. Someone with an entitlement to a data set can only export. Jobs are deleted 90 days after they are created.
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
        "Arn" -> Arn.asInstanceOf[js.Any],
        "CreatedAt" -> CreatedAt.asInstanceOf[js.Any],
        "Details" -> Details.asInstanceOf[js.Any],
        "Id" -> Id.asInstanceOf[js.Any],
        "State" -> State.asInstanceOf[js.Any],
        "Type" -> Type.asInstanceOf[js.Any],
        "UpdatedAt" -> UpdatedAt.asInstanceOf[js.Any]
      )

      Errors.foreach(__v => __obj.updateDynamic("Errors")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[JobEntry]
    }
  }

  /** An error that occurred with the job request.
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
        "Code" -> Code.asInstanceOf[js.Any],
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
  trait ListEventActionsRequest extends js.Object {
    var EventSourceId: js.UndefOr[__string]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[__string]
  }

  object ListEventActionsRequest {
    @inline
    def apply(
        EventSourceId: js.UndefOr[__string] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): ListEventActionsRequest = {
      val __obj = js.Dynamic.literal()
      EventSourceId.foreach(__v => __obj.updateDynamic("EventSourceId")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListEventActionsRequest]
    }
  }

  @js.native
  trait ListEventActionsResponse extends js.Object {
    var EventActions: js.UndefOr[ListOfEventActionEntry]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListEventActionsResponse {
    @inline
    def apply(
        EventActions: js.UndefOr[ListOfEventActionEntry] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListEventActionsResponse = {
      val __obj = js.Dynamic.literal()
      EventActions.foreach(__v => __obj.updateDynamic("EventActions")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListEventActionsResponse]
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
        "DataSetId" -> DataSetId.asInstanceOf[js.Any],
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

  /** Information about the origin of the data set.
    */
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

  /** The Amazon Redshift datashare asset.
    */
  @js.native
  trait RedshiftDataShareAsset extends js.Object {
    var Arn: __string
  }

  object RedshiftDataShareAsset {
    @inline
    def apply(
        Arn: __string
    ): RedshiftDataShareAsset = {
      val __obj = js.Dynamic.literal(
        "Arn" -> Arn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[RedshiftDataShareAsset]
    }
  }

  /** The source of the Amazon Redshift datashare asset.
    */
  @js.native
  trait RedshiftDataShareAssetSourceEntry extends js.Object {
    var DataShareArn: __string
  }

  object RedshiftDataShareAssetSourceEntry {
    @inline
    def apply(
        DataShareArn: __string
    ): RedshiftDataShareAssetSourceEntry = {
      val __obj = js.Dynamic.literal(
        "DataShareArn" -> DataShareArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[RedshiftDataShareAssetSourceEntry]
    }
  }

  /** The details for the request.
    */
  @js.native
  trait RequestDetails extends js.Object {
    var ExportAssetToSignedUrl: js.UndefOr[ExportAssetToSignedUrlRequestDetails]
    var ExportAssetsToS3: js.UndefOr[ExportAssetsToS3RequestDetails]
    var ExportRevisionsToS3: js.UndefOr[ExportRevisionsToS3RequestDetails]
    var ImportAssetFromApiGatewayApi: js.UndefOr[ImportAssetFromApiGatewayApiRequestDetails]
    var ImportAssetFromSignedUrl: js.UndefOr[ImportAssetFromSignedUrlRequestDetails]
    var ImportAssetsFromRedshiftDataShares: js.UndefOr[ImportAssetsFromRedshiftDataSharesRequestDetails]
    var ImportAssetsFromS3: js.UndefOr[ImportAssetsFromS3RequestDetails]
  }

  object RequestDetails {
    @inline
    def apply(
        ExportAssetToSignedUrl: js.UndefOr[ExportAssetToSignedUrlRequestDetails] = js.undefined,
        ExportAssetsToS3: js.UndefOr[ExportAssetsToS3RequestDetails] = js.undefined,
        ExportRevisionsToS3: js.UndefOr[ExportRevisionsToS3RequestDetails] = js.undefined,
        ImportAssetFromApiGatewayApi: js.UndefOr[ImportAssetFromApiGatewayApiRequestDetails] = js.undefined,
        ImportAssetFromSignedUrl: js.UndefOr[ImportAssetFromSignedUrlRequestDetails] = js.undefined,
        ImportAssetsFromRedshiftDataShares: js.UndefOr[ImportAssetsFromRedshiftDataSharesRequestDetails] = js.undefined,
        ImportAssetsFromS3: js.UndefOr[ImportAssetsFromS3RequestDetails] = js.undefined
    ): RequestDetails = {
      val __obj = js.Dynamic.literal()
      ExportAssetToSignedUrl.foreach(__v => __obj.updateDynamic("ExportAssetToSignedUrl")(__v.asInstanceOf[js.Any]))
      ExportAssetsToS3.foreach(__v => __obj.updateDynamic("ExportAssetsToS3")(__v.asInstanceOf[js.Any]))
      ExportRevisionsToS3.foreach(__v => __obj.updateDynamic("ExportRevisionsToS3")(__v.asInstanceOf[js.Any]))
      ImportAssetFromApiGatewayApi.foreach(__v => __obj.updateDynamic("ImportAssetFromApiGatewayApi")(__v.asInstanceOf[js.Any]))
      ImportAssetFromSignedUrl.foreach(__v => __obj.updateDynamic("ImportAssetFromSignedUrl")(__v.asInstanceOf[js.Any]))
      ImportAssetsFromRedshiftDataShares.foreach(__v => __obj.updateDynamic("ImportAssetsFromRedshiftDataShares")(__v.asInstanceOf[js.Any]))
      ImportAssetsFromS3.foreach(__v => __obj.updateDynamic("ImportAssetsFromS3")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RequestDetails]
    }
  }

  /** Details for the response.
    */
  @js.native
  trait ResponseDetails extends js.Object {
    var ExportAssetToSignedUrl: js.UndefOr[ExportAssetToSignedUrlResponseDetails]
    var ExportAssetsToS3: js.UndefOr[ExportAssetsToS3ResponseDetails]
    var ExportRevisionsToS3: js.UndefOr[ExportRevisionsToS3ResponseDetails]
    var ImportAssetFromApiGatewayApi: js.UndefOr[ImportAssetFromApiGatewayApiResponseDetails]
    var ImportAssetFromSignedUrl: js.UndefOr[ImportAssetFromSignedUrlResponseDetails]
    var ImportAssetsFromRedshiftDataShares: js.UndefOr[ImportAssetsFromRedshiftDataSharesResponseDetails]
    var ImportAssetsFromS3: js.UndefOr[ImportAssetsFromS3ResponseDetails]
  }

  object ResponseDetails {
    @inline
    def apply(
        ExportAssetToSignedUrl: js.UndefOr[ExportAssetToSignedUrlResponseDetails] = js.undefined,
        ExportAssetsToS3: js.UndefOr[ExportAssetsToS3ResponseDetails] = js.undefined,
        ExportRevisionsToS3: js.UndefOr[ExportRevisionsToS3ResponseDetails] = js.undefined,
        ImportAssetFromApiGatewayApi: js.UndefOr[ImportAssetFromApiGatewayApiResponseDetails] = js.undefined,
        ImportAssetFromSignedUrl: js.UndefOr[ImportAssetFromSignedUrlResponseDetails] = js.undefined,
        ImportAssetsFromRedshiftDataShares: js.UndefOr[ImportAssetsFromRedshiftDataSharesResponseDetails] = js.undefined,
        ImportAssetsFromS3: js.UndefOr[ImportAssetsFromS3ResponseDetails] = js.undefined
    ): ResponseDetails = {
      val __obj = js.Dynamic.literal()
      ExportAssetToSignedUrl.foreach(__v => __obj.updateDynamic("ExportAssetToSignedUrl")(__v.asInstanceOf[js.Any]))
      ExportAssetsToS3.foreach(__v => __obj.updateDynamic("ExportAssetsToS3")(__v.asInstanceOf[js.Any]))
      ExportRevisionsToS3.foreach(__v => __obj.updateDynamic("ExportRevisionsToS3")(__v.asInstanceOf[js.Any]))
      ImportAssetFromApiGatewayApi.foreach(__v => __obj.updateDynamic("ImportAssetFromApiGatewayApi")(__v.asInstanceOf[js.Any]))
      ImportAssetFromSignedUrl.foreach(__v => __obj.updateDynamic("ImportAssetFromSignedUrl")(__v.asInstanceOf[js.Any]))
      ImportAssetsFromRedshiftDataShares.foreach(__v => __obj.updateDynamic("ImportAssetsFromRedshiftDataShares")(__v.asInstanceOf[js.Any]))
      ImportAssetsFromS3.foreach(__v => __obj.updateDynamic("ImportAssetsFromS3")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResponseDetails]
    }
  }

  /** The destination where the assets in the revision will be exported.
    */
  @js.native
  trait RevisionDestinationEntry extends js.Object {
    var Bucket: __string
    var RevisionId: Id
    var KeyPattern: js.UndefOr[__string]
  }

  object RevisionDestinationEntry {
    @inline
    def apply(
        Bucket: __string,
        RevisionId: Id,
        KeyPattern: js.UndefOr[__string] = js.undefined
    ): RevisionDestinationEntry = {
      val __obj = js.Dynamic.literal(
        "Bucket" -> Bucket.asInstanceOf[js.Any],
        "RevisionId" -> RevisionId.asInstanceOf[js.Any]
      )

      KeyPattern.foreach(__v => __obj.updateDynamic("KeyPattern")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RevisionDestinationEntry]
    }
  }

  /** A revision is a container for one or more assets.
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
        "Arn" -> Arn.asInstanceOf[js.Any],
        "CreatedAt" -> CreatedAt.asInstanceOf[js.Any],
        "DataSetId" -> DataSetId.asInstanceOf[js.Any],
        "Id" -> Id.asInstanceOf[js.Any],
        "UpdatedAt" -> UpdatedAt.asInstanceOf[js.Any]
      )

      Comment.foreach(__v => __obj.updateDynamic("Comment")(__v.asInstanceOf[js.Any]))
      Finalized.foreach(__v => __obj.updateDynamic("Finalized")(__v.asInstanceOf[js.Any]))
      SourceId.foreach(__v => __obj.updateDynamic("SourceId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RevisionEntry]
    }
  }

  /** Information about the published revision.
    */
  @js.native
  trait RevisionPublished extends js.Object {
    var DataSetId: Id
  }

  object RevisionPublished {
    @inline
    def apply(
        DataSetId: Id
    ): RevisionPublished = {
      val __obj = js.Dynamic.literal(
        "DataSetId" -> DataSetId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[RevisionPublished]
    }
  }

  /** The S3 object that is the asset.
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

  /** The request body for SendApiAsset.
    */
  @js.native
  trait SendApiAssetRequest extends js.Object {
    var AssetId: __string
    var DataSetId: __string
    var RevisionId: __string
    var Body: js.UndefOr[__string]
    var Method: js.UndefOr[__string]
    var Path: js.UndefOr[__string]
    var QueryStringParameters: js.UndefOr[MapOf__string]
    var RequestHeaders: js.UndefOr[MapOf__string]
  }

  object SendApiAssetRequest {
    @inline
    def apply(
        AssetId: __string,
        DataSetId: __string,
        RevisionId: __string,
        Body: js.UndefOr[__string] = js.undefined,
        Method: js.UndefOr[__string] = js.undefined,
        Path: js.UndefOr[__string] = js.undefined,
        QueryStringParameters: js.UndefOr[MapOf__string] = js.undefined,
        RequestHeaders: js.UndefOr[MapOf__string] = js.undefined
    ): SendApiAssetRequest = {
      val __obj = js.Dynamic.literal(
        "AssetId" -> AssetId.asInstanceOf[js.Any],
        "DataSetId" -> DataSetId.asInstanceOf[js.Any],
        "RevisionId" -> RevisionId.asInstanceOf[js.Any]
      )

      Body.foreach(__v => __obj.updateDynamic("Body")(__v.asInstanceOf[js.Any]))
      Method.foreach(__v => __obj.updateDynamic("Method")(__v.asInstanceOf[js.Any]))
      Path.foreach(__v => __obj.updateDynamic("Path")(__v.asInstanceOf[js.Any]))
      QueryStringParameters.foreach(__v => __obj.updateDynamic("QueryStringParameters")(__v.asInstanceOf[js.Any]))
      RequestHeaders.foreach(__v => __obj.updateDynamic("RequestHeaders")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SendApiAssetRequest]
    }
  }

  @js.native
  trait SendApiAssetResponse extends js.Object {
    var Body: js.UndefOr[__string]
    var ResponseHeaders: js.UndefOr[MapOf__string]
  }

  object SendApiAssetResponse {
    @inline
    def apply(
        Body: js.UndefOr[__string] = js.undefined,
        ResponseHeaders: js.UndefOr[MapOf__string] = js.undefined
    ): SendApiAssetResponse = {
      val __obj = js.Dynamic.literal()
      Body.foreach(__v => __obj.updateDynamic("Body")(__v.asInstanceOf[js.Any]))
      ResponseHeaders.foreach(__v => __obj.updateDynamic("ResponseHeaders")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SendApiAssetResponse]
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
  trait StartJobResponse extends js.Object

  object StartJobResponse {
    @inline
    def apply(): StartJobResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StartJobResponse]
    }
  }

  /** The request body for TagResource.
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
        "Tags" -> Tags.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[TagResourceRequest]
    }
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
        "TagKeys" -> TagKeys.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UntagResourceRequest]
    }
  }

  /** The request body for UpdateAsset.
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
        "AssetId" -> AssetId.asInstanceOf[js.Any],
        "DataSetId" -> DataSetId.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any],
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

  /** The request body for UpdateDataSet.
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

  /** The request body for UpdateEventAction.
    */
  @js.native
  trait UpdateEventActionRequest extends js.Object {
    var EventActionId: __string
    var Action: js.UndefOr[Action]
  }

  object UpdateEventActionRequest {
    @inline
    def apply(
        EventActionId: __string,
        Action: js.UndefOr[Action] = js.undefined
    ): UpdateEventActionRequest = {
      val __obj = js.Dynamic.literal(
        "EventActionId" -> EventActionId.asInstanceOf[js.Any]
      )

      Action.foreach(__v => __obj.updateDynamic("Action")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateEventActionRequest]
    }
  }

  @js.native
  trait UpdateEventActionResponse extends js.Object {
    var Action: js.UndefOr[Action]
    var Arn: js.UndefOr[Arn]
    var CreatedAt: js.UndefOr[Timestamp]
    var Event: js.UndefOr[Event]
    var Id: js.UndefOr[Id]
    var UpdatedAt: js.UndefOr[Timestamp]
  }

  object UpdateEventActionResponse {
    @inline
    def apply(
        Action: js.UndefOr[Action] = js.undefined,
        Arn: js.UndefOr[Arn] = js.undefined,
        CreatedAt: js.UndefOr[Timestamp] = js.undefined,
        Event: js.UndefOr[Event] = js.undefined,
        Id: js.UndefOr[Id] = js.undefined,
        UpdatedAt: js.UndefOr[Timestamp] = js.undefined
    ): UpdateEventActionResponse = {
      val __obj = js.Dynamic.literal()
      Action.foreach(__v => __obj.updateDynamic("Action")(__v.asInstanceOf[js.Any]))
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      CreatedAt.foreach(__v => __obj.updateDynamic("CreatedAt")(__v.asInstanceOf[js.Any]))
      Event.foreach(__v => __obj.updateDynamic("Event")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      UpdatedAt.foreach(__v => __obj.updateDynamic("UpdatedAt")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateEventActionResponse]
    }
  }

  /** The request body for UpdateRevision.
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
        "DataSetId" -> DataSetId.asInstanceOf[js.Any],
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
