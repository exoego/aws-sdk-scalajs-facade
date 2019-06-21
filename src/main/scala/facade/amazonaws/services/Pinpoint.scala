package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import io.scalajs.nodejs
import facade.amazonaws._

package object pinpoint {
  type Action                          = String
  type AttributeType                   = String
  type CampaignStatus                  = String
  type ChannelType                     = String
  type DeliveryStatus                  = String
  type DimensionType                   = String
  type Duration                        = String
  type FilterType                      = String
  type Format                          = String
  type Frequency                       = String
  type Include                         = String
  type JobStatus                       = String
  type ListOfActivityResponse          = js.Array[ActivityResponse]
  type ListOfApplicationResponse       = js.Array[ApplicationResponse]
  type ListOfCampaignResponse          = js.Array[CampaignResponse]
  type ListOfEndpointBatchItem         = js.Array[EndpointBatchItem]
  type ListOfEndpointResponse          = js.Array[EndpointResponse]
  type ListOfExportJobResponse         = js.Array[ExportJobResponse]
  type ListOfImportJobResponse         = js.Array[ImportJobResponse]
  type ListOfSegmentDimensions         = js.Array[SegmentDimensions]
  type ListOfSegmentGroup              = js.Array[SegmentGroup]
  type ListOfSegmentReference          = js.Array[SegmentReference]
  type ListOfSegmentResponse           = js.Array[SegmentResponse]
  type ListOfTreatmentResource         = js.Array[TreatmentResource]
  type ListOfWriteTreatmentResource    = js.Array[WriteTreatmentResource]
  type ListOf__string                  = js.Array[__string]
  type MapOfAddressConfiguration       = js.Dictionary[AddressConfiguration]
  type MapOfAttributeDimension         = js.Dictionary[AttributeDimension]
  type MapOfChannelResponse            = js.Dictionary[ChannelResponse]
  type MapOfEndpointMessageResult      = js.Dictionary[EndpointMessageResult]
  type MapOfEndpointSendConfiguration  = js.Dictionary[EndpointSendConfiguration]
  type MapOfEvent                      = js.Dictionary[Event]
  type MapOfEventItemResponse          = js.Dictionary[EventItemResponse]
  type MapOfEventsBatch                = js.Dictionary[EventsBatch]
  type MapOfItemResponse               = js.Dictionary[ItemResponse]
  type MapOfListOf__string             = js.Dictionary[ListOf__string]
  type MapOfMapOfEndpointMessageResult = js.Dictionary[MapOfEndpointMessageResult]
  type MapOfMessageResult              = js.Dictionary[MessageResult]
  type MapOfMetricDimension            = js.Dictionary[MetricDimension]
  type MapOf__double                   = js.Dictionary[__double]
  type MapOf__integer                  = js.Dictionary[__integer]
  type MapOf__string                   = js.Dictionary[__string]
  type MessageType                     = String
  type Mode                            = String
  type RecencyType                     = String
  type SegmentType                     = String
  type SourceType                      = String
  type Type                            = String
  type __blob                          = nodejs.buffer.Buffer | nodejs.stream.Readable | js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type __boolean                       = Boolean
  type __double                        = Double
  type __integer                       = Int
  type __string                        = String

  implicit final class PinpointOps(val service: Pinpoint) extends AnyVal {

    def createAppFuture(params: CreateAppRequest): Future[CreateAppResponse] =
      service.createApp(params).promise.toFuture
    def createCampaignFuture(params: CreateCampaignRequest): Future[CreateCampaignResponse] =
      service.createCampaign(params).promise.toFuture
    def createExportJobFuture(params: CreateExportJobRequest): Future[CreateExportJobResponse] =
      service.createExportJob(params).promise.toFuture
    def createImportJobFuture(params: CreateImportJobRequest): Future[CreateImportJobResponse] =
      service.createImportJob(params).promise.toFuture
    def createSegmentFuture(params: CreateSegmentRequest): Future[CreateSegmentResponse] =
      service.createSegment(params).promise.toFuture
    def deleteAdmChannelFuture(params: DeleteAdmChannelRequest): Future[DeleteAdmChannelResponse] =
      service.deleteAdmChannel(params).promise.toFuture
    def deleteApnsChannelFuture(params: DeleteApnsChannelRequest): Future[DeleteApnsChannelResponse] =
      service.deleteApnsChannel(params).promise.toFuture
    def deleteApnsSandboxChannelFuture(
        params: DeleteApnsSandboxChannelRequest
    ): Future[DeleteApnsSandboxChannelResponse] = service.deleteApnsSandboxChannel(params).promise.toFuture
    def deleteApnsVoipChannelFuture(params: DeleteApnsVoipChannelRequest): Future[DeleteApnsVoipChannelResponse] =
      service.deleteApnsVoipChannel(params).promise.toFuture
    def deleteApnsVoipSandboxChannelFuture(
        params: DeleteApnsVoipSandboxChannelRequest
    ): Future[DeleteApnsVoipSandboxChannelResponse] = service.deleteApnsVoipSandboxChannel(params).promise.toFuture
    def deleteAppFuture(params: DeleteAppRequest): Future[DeleteAppResponse] =
      service.deleteApp(params).promise.toFuture
    def deleteBaiduChannelFuture(params: DeleteBaiduChannelRequest): Future[DeleteBaiduChannelResponse] =
      service.deleteBaiduChannel(params).promise.toFuture
    def deleteCampaignFuture(params: DeleteCampaignRequest): Future[DeleteCampaignResponse] =
      service.deleteCampaign(params).promise.toFuture
    def deleteEmailChannelFuture(params: DeleteEmailChannelRequest): Future[DeleteEmailChannelResponse] =
      service.deleteEmailChannel(params).promise.toFuture
    def deleteEndpointFuture(params: DeleteEndpointRequest): Future[DeleteEndpointResponse] =
      service.deleteEndpoint(params).promise.toFuture
    def deleteEventStreamFuture(params: DeleteEventStreamRequest): Future[DeleteEventStreamResponse] =
      service.deleteEventStream(params).promise.toFuture
    def deleteGcmChannelFuture(params: DeleteGcmChannelRequest): Future[DeleteGcmChannelResponse] =
      service.deleteGcmChannel(params).promise.toFuture
    def deleteSegmentFuture(params: DeleteSegmentRequest): Future[DeleteSegmentResponse] =
      service.deleteSegment(params).promise.toFuture
    def deleteSmsChannelFuture(params: DeleteSmsChannelRequest): Future[DeleteSmsChannelResponse] =
      service.deleteSmsChannel(params).promise.toFuture
    def deleteUserEndpointsFuture(params: DeleteUserEndpointsRequest): Future[DeleteUserEndpointsResponse] =
      service.deleteUserEndpoints(params).promise.toFuture
    def deleteVoiceChannelFuture(params: DeleteVoiceChannelRequest): Future[DeleteVoiceChannelResponse] =
      service.deleteVoiceChannel(params).promise.toFuture
    def getAdmChannelFuture(params: GetAdmChannelRequest): Future[GetAdmChannelResponse] =
      service.getAdmChannel(params).promise.toFuture
    def getApnsChannelFuture(params: GetApnsChannelRequest): Future[GetApnsChannelResponse] =
      service.getApnsChannel(params).promise.toFuture
    def getApnsSandboxChannelFuture(params: GetApnsSandboxChannelRequest): Future[GetApnsSandboxChannelResponse] =
      service.getApnsSandboxChannel(params).promise.toFuture
    def getApnsVoipChannelFuture(params: GetApnsVoipChannelRequest): Future[GetApnsVoipChannelResponse] =
      service.getApnsVoipChannel(params).promise.toFuture
    def getApnsVoipSandboxChannelFuture(
        params: GetApnsVoipSandboxChannelRequest
    ): Future[GetApnsVoipSandboxChannelResponse]                    = service.getApnsVoipSandboxChannel(params).promise.toFuture
    def getAppFuture(params: GetAppRequest): Future[GetAppResponse] = service.getApp(params).promise.toFuture
    def getApplicationSettingsFuture(params: GetApplicationSettingsRequest): Future[GetApplicationSettingsResponse] =
      service.getApplicationSettings(params).promise.toFuture
    def getAppsFuture(params: GetAppsRequest): Future[GetAppsResponse] = service.getApps(params).promise.toFuture
    def getBaiduChannelFuture(params: GetBaiduChannelRequest): Future[GetBaiduChannelResponse] =
      service.getBaiduChannel(params).promise.toFuture
    def getCampaignActivitiesFuture(params: GetCampaignActivitiesRequest): Future[GetCampaignActivitiesResponse] =
      service.getCampaignActivities(params).promise.toFuture
    def getCampaignFuture(params: GetCampaignRequest): Future[GetCampaignResponse] =
      service.getCampaign(params).promise.toFuture
    def getCampaignVersionFuture(params: GetCampaignVersionRequest): Future[GetCampaignVersionResponse] =
      service.getCampaignVersion(params).promise.toFuture
    def getCampaignVersionsFuture(params: GetCampaignVersionsRequest): Future[GetCampaignVersionsResponse] =
      service.getCampaignVersions(params).promise.toFuture
    def getCampaignsFuture(params: GetCampaignsRequest): Future[GetCampaignsResponse] =
      service.getCampaigns(params).promise.toFuture
    def getChannelsFuture(params: GetChannelsRequest): Future[GetChannelsResponse] =
      service.getChannels(params).promise.toFuture
    def getEmailChannelFuture(params: GetEmailChannelRequest): Future[GetEmailChannelResponse] =
      service.getEmailChannel(params).promise.toFuture
    def getEndpointFuture(params: GetEndpointRequest): Future[GetEndpointResponse] =
      service.getEndpoint(params).promise.toFuture
    def getEventStreamFuture(params: GetEventStreamRequest): Future[GetEventStreamResponse] =
      service.getEventStream(params).promise.toFuture
    def getExportJobFuture(params: GetExportJobRequest): Future[GetExportJobResponse] =
      service.getExportJob(params).promise.toFuture
    def getExportJobsFuture(params: GetExportJobsRequest): Future[GetExportJobsResponse] =
      service.getExportJobs(params).promise.toFuture
    def getGcmChannelFuture(params: GetGcmChannelRequest): Future[GetGcmChannelResponse] =
      service.getGcmChannel(params).promise.toFuture
    def getImportJobFuture(params: GetImportJobRequest): Future[GetImportJobResponse] =
      service.getImportJob(params).promise.toFuture
    def getImportJobsFuture(params: GetImportJobsRequest): Future[GetImportJobsResponse] =
      service.getImportJobs(params).promise.toFuture
    def getSegmentExportJobsFuture(params: GetSegmentExportJobsRequest): Future[GetSegmentExportJobsResponse] =
      service.getSegmentExportJobs(params).promise.toFuture
    def getSegmentFuture(params: GetSegmentRequest): Future[GetSegmentResponse] =
      service.getSegment(params).promise.toFuture
    def getSegmentImportJobsFuture(params: GetSegmentImportJobsRequest): Future[GetSegmentImportJobsResponse] =
      service.getSegmentImportJobs(params).promise.toFuture
    def getSegmentVersionFuture(params: GetSegmentVersionRequest): Future[GetSegmentVersionResponse] =
      service.getSegmentVersion(params).promise.toFuture
    def getSegmentVersionsFuture(params: GetSegmentVersionsRequest): Future[GetSegmentVersionsResponse] =
      service.getSegmentVersions(params).promise.toFuture
    def getSegmentsFuture(params: GetSegmentsRequest): Future[GetSegmentsResponse] =
      service.getSegments(params).promise.toFuture
    def getSmsChannelFuture(params: GetSmsChannelRequest): Future[GetSmsChannelResponse] =
      service.getSmsChannel(params).promise.toFuture
    def getUserEndpointsFuture(params: GetUserEndpointsRequest): Future[GetUserEndpointsResponse] =
      service.getUserEndpoints(params).promise.toFuture
    def getVoiceChannelFuture(params: GetVoiceChannelRequest): Future[GetVoiceChannelResponse] =
      service.getVoiceChannel(params).promise.toFuture
    def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] =
      service.listTagsForResource(params).promise.toFuture
    def phoneNumberValidateFuture(params: PhoneNumberValidateRequest): Future[PhoneNumberValidateResponse] =
      service.phoneNumberValidate(params).promise.toFuture
    def putEventStreamFuture(params: PutEventStreamRequest): Future[PutEventStreamResponse] =
      service.putEventStream(params).promise.toFuture
    def putEventsFuture(params: PutEventsRequest): Future[PutEventsResponse] =
      service.putEvents(params).promise.toFuture
    def removeAttributesFuture(params: RemoveAttributesRequest): Future[RemoveAttributesResponse] =
      service.removeAttributes(params).promise.toFuture
    def sendMessagesFuture(params: SendMessagesRequest): Future[SendMessagesResponse] =
      service.sendMessages(params).promise.toFuture
    def sendUsersMessagesFuture(params: SendUsersMessagesRequest): Future[SendUsersMessagesResponse] =
      service.sendUsersMessages(params).promise.toFuture
    def tagResourceFuture(params: TagResourceRequest): Future[js.Object] = service.tagResource(params).promise.toFuture
    def untagResourceFuture(params: UntagResourceRequest): Future[js.Object] =
      service.untagResource(params).promise.toFuture
    def updateAdmChannelFuture(params: UpdateAdmChannelRequest): Future[UpdateAdmChannelResponse] =
      service.updateAdmChannel(params).promise.toFuture
    def updateApnsChannelFuture(params: UpdateApnsChannelRequest): Future[UpdateApnsChannelResponse] =
      service.updateApnsChannel(params).promise.toFuture
    def updateApnsSandboxChannelFuture(
        params: UpdateApnsSandboxChannelRequest
    ): Future[UpdateApnsSandboxChannelResponse] = service.updateApnsSandboxChannel(params).promise.toFuture
    def updateApnsVoipChannelFuture(params: UpdateApnsVoipChannelRequest): Future[UpdateApnsVoipChannelResponse] =
      service.updateApnsVoipChannel(params).promise.toFuture
    def updateApnsVoipSandboxChannelFuture(
        params: UpdateApnsVoipSandboxChannelRequest
    ): Future[UpdateApnsVoipSandboxChannelResponse] = service.updateApnsVoipSandboxChannel(params).promise.toFuture
    def updateApplicationSettingsFuture(
        params: UpdateApplicationSettingsRequest
    ): Future[UpdateApplicationSettingsResponse] = service.updateApplicationSettings(params).promise.toFuture
    def updateBaiduChannelFuture(params: UpdateBaiduChannelRequest): Future[UpdateBaiduChannelResponse] =
      service.updateBaiduChannel(params).promise.toFuture
    def updateCampaignFuture(params: UpdateCampaignRequest): Future[UpdateCampaignResponse] =
      service.updateCampaign(params).promise.toFuture
    def updateEmailChannelFuture(params: UpdateEmailChannelRequest): Future[UpdateEmailChannelResponse] =
      service.updateEmailChannel(params).promise.toFuture
    def updateEndpointFuture(params: UpdateEndpointRequest): Future[UpdateEndpointResponse] =
      service.updateEndpoint(params).promise.toFuture
    def updateEndpointsBatchFuture(params: UpdateEndpointsBatchRequest): Future[UpdateEndpointsBatchResponse] =
      service.updateEndpointsBatch(params).promise.toFuture
    def updateGcmChannelFuture(params: UpdateGcmChannelRequest): Future[UpdateGcmChannelResponse] =
      service.updateGcmChannel(params).promise.toFuture
    def updateSegmentFuture(params: UpdateSegmentRequest): Future[UpdateSegmentResponse] =
      service.updateSegment(params).promise.toFuture
    def updateSmsChannelFuture(params: UpdateSmsChannelRequest): Future[UpdateSmsChannelResponse] =
      service.updateSmsChannel(params).promise.toFuture
    def updateVoiceChannelFuture(params: UpdateVoiceChannelRequest): Future[UpdateVoiceChannelResponse] =
      service.updateVoiceChannel(params).promise.toFuture
  }
}

package pinpoint {
  @js.native
  @JSImport("aws-sdk", "Pinpoint")
  class Pinpoint() extends js.Object {
    def this(config: AWSConfig) = this()

    def createApp(params: CreateAppRequest): Request[CreateAppResponse]                         = js.native
    def createCampaign(params: CreateCampaignRequest): Request[CreateCampaignResponse]          = js.native
    def createExportJob(params: CreateExportJobRequest): Request[CreateExportJobResponse]       = js.native
    def createImportJob(params: CreateImportJobRequest): Request[CreateImportJobResponse]       = js.native
    def createSegment(params: CreateSegmentRequest): Request[CreateSegmentResponse]             = js.native
    def deleteAdmChannel(params: DeleteAdmChannelRequest): Request[DeleteAdmChannelResponse]    = js.native
    def deleteApnsChannel(params: DeleteApnsChannelRequest): Request[DeleteApnsChannelResponse] = js.native
    def deleteApnsSandboxChannel(params: DeleteApnsSandboxChannelRequest): Request[DeleteApnsSandboxChannelResponse] =
      js.native
    def deleteApnsVoipChannel(params: DeleteApnsVoipChannelRequest): Request[DeleteApnsVoipChannelResponse] = js.native
    def deleteApnsVoipSandboxChannel(
        params: DeleteApnsVoipSandboxChannelRequest
    ): Request[DeleteApnsVoipSandboxChannelResponse]                                                        = js.native
    def deleteApp(params: DeleteAppRequest): Request[DeleteAppResponse]                                     = js.native
    def deleteBaiduChannel(params: DeleteBaiduChannelRequest): Request[DeleteBaiduChannelResponse]          = js.native
    def deleteCampaign(params: DeleteCampaignRequest): Request[DeleteCampaignResponse]                      = js.native
    def deleteEmailChannel(params: DeleteEmailChannelRequest): Request[DeleteEmailChannelResponse]          = js.native
    def deleteEndpoint(params: DeleteEndpointRequest): Request[DeleteEndpointResponse]                      = js.native
    def deleteEventStream(params: DeleteEventStreamRequest): Request[DeleteEventStreamResponse]             = js.native
    def deleteGcmChannel(params: DeleteGcmChannelRequest): Request[DeleteGcmChannelResponse]                = js.native
    def deleteSegment(params: DeleteSegmentRequest): Request[DeleteSegmentResponse]                         = js.native
    def deleteSmsChannel(params: DeleteSmsChannelRequest): Request[DeleteSmsChannelResponse]                = js.native
    def deleteUserEndpoints(params: DeleteUserEndpointsRequest): Request[DeleteUserEndpointsResponse]       = js.native
    def deleteVoiceChannel(params: DeleteVoiceChannelRequest): Request[DeleteVoiceChannelResponse]          = js.native
    def getAdmChannel(params: GetAdmChannelRequest): Request[GetAdmChannelResponse]                         = js.native
    def getApnsChannel(params: GetApnsChannelRequest): Request[GetApnsChannelResponse]                      = js.native
    def getApnsSandboxChannel(params: GetApnsSandboxChannelRequest): Request[GetApnsSandboxChannelResponse] = js.native
    def getApnsVoipChannel(params: GetApnsVoipChannelRequest): Request[GetApnsVoipChannelResponse]          = js.native
    def getApnsVoipSandboxChannel(
        params: GetApnsVoipSandboxChannelRequest
    ): Request[GetApnsVoipSandboxChannelResponse]              = js.native
    def getApp(params: GetAppRequest): Request[GetAppResponse] = js.native
    def getApplicationSettings(params: GetApplicationSettingsRequest): Request[GetApplicationSettingsResponse] =
      js.native
    def getApps(params: GetAppsRequest): Request[GetAppsResponse]                                           = js.native
    def getBaiduChannel(params: GetBaiduChannelRequest): Request[GetBaiduChannelResponse]                   = js.native
    def getCampaign(params: GetCampaignRequest): Request[GetCampaignResponse]                               = js.native
    def getCampaignActivities(params: GetCampaignActivitiesRequest): Request[GetCampaignActivitiesResponse] = js.native
    def getCampaignVersion(params: GetCampaignVersionRequest): Request[GetCampaignVersionResponse]          = js.native
    def getCampaignVersions(params: GetCampaignVersionsRequest): Request[GetCampaignVersionsResponse]       = js.native
    def getCampaigns(params: GetCampaignsRequest): Request[GetCampaignsResponse]                            = js.native
    def getChannels(params: GetChannelsRequest): Request[GetChannelsResponse]                               = js.native
    def getEmailChannel(params: GetEmailChannelRequest): Request[GetEmailChannelResponse]                   = js.native
    def getEndpoint(params: GetEndpointRequest): Request[GetEndpointResponse]                               = js.native
    def getEventStream(params: GetEventStreamRequest): Request[GetEventStreamResponse]                      = js.native
    def getExportJob(params: GetExportJobRequest): Request[GetExportJobResponse]                            = js.native
    def getExportJobs(params: GetExportJobsRequest): Request[GetExportJobsResponse]                         = js.native
    def getGcmChannel(params: GetGcmChannelRequest): Request[GetGcmChannelResponse]                         = js.native
    def getImportJob(params: GetImportJobRequest): Request[GetImportJobResponse]                            = js.native
    def getImportJobs(params: GetImportJobsRequest): Request[GetImportJobsResponse]                         = js.native
    def getSegment(params: GetSegmentRequest): Request[GetSegmentResponse]                                  = js.native
    def getSegmentExportJobs(params: GetSegmentExportJobsRequest): Request[GetSegmentExportJobsResponse]    = js.native
    def getSegmentImportJobs(params: GetSegmentImportJobsRequest): Request[GetSegmentImportJobsResponse]    = js.native
    def getSegmentVersion(params: GetSegmentVersionRequest): Request[GetSegmentVersionResponse]             = js.native
    def getSegmentVersions(params: GetSegmentVersionsRequest): Request[GetSegmentVersionsResponse]          = js.native
    def getSegments(params: GetSegmentsRequest): Request[GetSegmentsResponse]                               = js.native
    def getSmsChannel(params: GetSmsChannelRequest): Request[GetSmsChannelResponse]                         = js.native
    def getUserEndpoints(params: GetUserEndpointsRequest): Request[GetUserEndpointsResponse]                = js.native
    def getVoiceChannel(params: GetVoiceChannelRequest): Request[GetVoiceChannelResponse]                   = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse]       = js.native
    def phoneNumberValidate(params: PhoneNumberValidateRequest): Request[PhoneNumberValidateResponse]       = js.native
    def putEventStream(params: PutEventStreamRequest): Request[PutEventStreamResponse]                      = js.native
    def putEvents(params: PutEventsRequest): Request[PutEventsResponse]                                     = js.native
    def removeAttributes(params: RemoveAttributesRequest): Request[RemoveAttributesResponse]                = js.native
    def sendMessages(params: SendMessagesRequest): Request[SendMessagesResponse]                            = js.native
    def sendUsersMessages(params: SendUsersMessagesRequest): Request[SendUsersMessagesResponse]             = js.native
    def tagResource(params: TagResourceRequest): Request[js.Object]                                         = js.native
    def untagResource(params: UntagResourceRequest): Request[js.Object]                                     = js.native
    def updateAdmChannel(params: UpdateAdmChannelRequest): Request[UpdateAdmChannelResponse]                = js.native
    def updateApnsChannel(params: UpdateApnsChannelRequest): Request[UpdateApnsChannelResponse]             = js.native
    def updateApnsSandboxChannel(params: UpdateApnsSandboxChannelRequest): Request[UpdateApnsSandboxChannelResponse] =
      js.native
    def updateApnsVoipChannel(params: UpdateApnsVoipChannelRequest): Request[UpdateApnsVoipChannelResponse] = js.native
    def updateApnsVoipSandboxChannel(
        params: UpdateApnsVoipSandboxChannelRequest
    ): Request[UpdateApnsVoipSandboxChannelResponse] = js.native
    def updateApplicationSettings(
        params: UpdateApplicationSettingsRequest
    ): Request[UpdateApplicationSettingsResponse]                                                        = js.native
    def updateBaiduChannel(params: UpdateBaiduChannelRequest): Request[UpdateBaiduChannelResponse]       = js.native
    def updateCampaign(params: UpdateCampaignRequest): Request[UpdateCampaignResponse]                   = js.native
    def updateEmailChannel(params: UpdateEmailChannelRequest): Request[UpdateEmailChannelResponse]       = js.native
    def updateEndpoint(params: UpdateEndpointRequest): Request[UpdateEndpointResponse]                   = js.native
    def updateEndpointsBatch(params: UpdateEndpointsBatchRequest): Request[UpdateEndpointsBatchResponse] = js.native
    def updateGcmChannel(params: UpdateGcmChannelRequest): Request[UpdateGcmChannelResponse]             = js.native
    def updateSegment(params: UpdateSegmentRequest): Request[UpdateSegmentResponse]                      = js.native
    def updateSmsChannel(params: UpdateSmsChannelRequest): Request[UpdateSmsChannelResponse]             = js.native
    def updateVoiceChannel(params: UpdateVoiceChannelRequest): Request[UpdateVoiceChannelResponse]       = js.native
  }

  /**
    * Amazon Device Messaging channel definition.
    */
  @js.native
  trait ADMChannelRequest extends js.Object {
    var ClientId: js.UndefOr[__string]
    var ClientSecret: js.UndefOr[__string]
    var Enabled: js.UndefOr[__boolean]
  }

  object ADMChannelRequest {
    def apply(
        ClientId: js.UndefOr[__string] = js.undefined,
        ClientSecret: js.UndefOr[__string] = js.undefined,
        Enabled: js.UndefOr[__boolean] = js.undefined
    ): ADMChannelRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ClientId" -> ClientId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ClientSecret" -> ClientSecret.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Enabled" -> Enabled.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ADMChannelRequest]
    }
  }

  /**
    * Amazon Device Messaging channel definition.
    */
  @js.native
  trait ADMChannelResponse extends js.Object {
    var ApplicationId: js.UndefOr[__string]
    var CreationDate: js.UndefOr[__string]
    var Enabled: js.UndefOr[__boolean]
    var HasCredential: js.UndefOr[__boolean]
    var Id: js.UndefOr[__string]
    var IsArchived: js.UndefOr[__boolean]
    var LastModifiedBy: js.UndefOr[__string]
    var LastModifiedDate: js.UndefOr[__string]
    var Platform: js.UndefOr[__string]
    var Version: js.UndefOr[__integer]
  }

  object ADMChannelResponse {
    def apply(
        ApplicationId: js.UndefOr[__string] = js.undefined,
        CreationDate: js.UndefOr[__string] = js.undefined,
        Enabled: js.UndefOr[__boolean] = js.undefined,
        HasCredential: js.UndefOr[__boolean] = js.undefined,
        Id: js.UndefOr[__string] = js.undefined,
        IsArchived: js.UndefOr[__boolean] = js.undefined,
        LastModifiedBy: js.UndefOr[__string] = js.undefined,
        LastModifiedDate: js.UndefOr[__string] = js.undefined,
        Platform: js.UndefOr[__string] = js.undefined,
        Version: js.UndefOr[__integer] = js.undefined
    ): ADMChannelResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationId" -> ApplicationId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CreationDate" -> CreationDate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Enabled" -> Enabled.map { x =>
          x.asInstanceOf[js.Any]
        },
        "HasCredential" -> HasCredential.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Id" -> Id.map { x =>
          x.asInstanceOf[js.Any]
        },
        "IsArchived" -> IsArchived.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LastModifiedBy" -> LastModifiedBy.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LastModifiedDate" -> LastModifiedDate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Platform" -> Platform.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Version" -> Version.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ADMChannelResponse]
    }
  }

  /**
    * ADM Message.
    */
  @js.native
  trait ADMMessage extends js.Object {
    var Action: js.UndefOr[Action]
    var Body: js.UndefOr[__string]
    var ConsolidationKey: js.UndefOr[__string]
    var Data: js.UndefOr[MapOf__string]
    var ExpiresAfter: js.UndefOr[__string]
    var IconReference: js.UndefOr[__string]
    var ImageIconUrl: js.UndefOr[__string]
    var ImageUrl: js.UndefOr[__string]
    var MD5: js.UndefOr[__string]
    var RawContent: js.UndefOr[__string]
    var SilentPush: js.UndefOr[__boolean]
    var SmallImageIconUrl: js.UndefOr[__string]
    var Sound: js.UndefOr[__string]
    var Substitutions: js.UndefOr[MapOfListOf__string]
    var Title: js.UndefOr[__string]
    var Url: js.UndefOr[__string]
  }

  object ADMMessage {
    def apply(
        Action: js.UndefOr[Action] = js.undefined,
        Body: js.UndefOr[__string] = js.undefined,
        ConsolidationKey: js.UndefOr[__string] = js.undefined,
        Data: js.UndefOr[MapOf__string] = js.undefined,
        ExpiresAfter: js.UndefOr[__string] = js.undefined,
        IconReference: js.UndefOr[__string] = js.undefined,
        ImageIconUrl: js.UndefOr[__string] = js.undefined,
        ImageUrl: js.UndefOr[__string] = js.undefined,
        MD5: js.UndefOr[__string] = js.undefined,
        RawContent: js.UndefOr[__string] = js.undefined,
        SilentPush: js.UndefOr[__boolean] = js.undefined,
        SmallImageIconUrl: js.UndefOr[__string] = js.undefined,
        Sound: js.UndefOr[__string] = js.undefined,
        Substitutions: js.UndefOr[MapOfListOf__string] = js.undefined,
        Title: js.UndefOr[__string] = js.undefined,
        Url: js.UndefOr[__string] = js.undefined
    ): ADMMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Action" -> Action.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Body" -> Body.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ConsolidationKey" -> ConsolidationKey.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Data" -> Data.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ExpiresAfter" -> ExpiresAfter.map { x =>
          x.asInstanceOf[js.Any]
        },
        "IconReference" -> IconReference.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ImageIconUrl" -> ImageIconUrl.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ImageUrl" -> ImageUrl.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MD5" -> MD5.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RawContent" -> RawContent.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SilentPush" -> SilentPush.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SmallImageIconUrl" -> SmallImageIconUrl.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Sound" -> Sound.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Substitutions" -> Substitutions.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Title" -> Title.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Url" -> Url.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ADMMessage]
    }
  }

  /**
    * Apple Push Notification Service channel definition.
    */
  @js.native
  trait APNSChannelRequest extends js.Object {
    var BundleId: js.UndefOr[__string]
    var Certificate: js.UndefOr[__string]
    var DefaultAuthenticationMethod: js.UndefOr[__string]
    var Enabled: js.UndefOr[__boolean]
    var PrivateKey: js.UndefOr[__string]
    var TeamId: js.UndefOr[__string]
    var TokenKey: js.UndefOr[__string]
    var TokenKeyId: js.UndefOr[__string]
  }

  object APNSChannelRequest {
    def apply(
        BundleId: js.UndefOr[__string] = js.undefined,
        Certificate: js.UndefOr[__string] = js.undefined,
        DefaultAuthenticationMethod: js.UndefOr[__string] = js.undefined,
        Enabled: js.UndefOr[__boolean] = js.undefined,
        PrivateKey: js.UndefOr[__string] = js.undefined,
        TeamId: js.UndefOr[__string] = js.undefined,
        TokenKey: js.UndefOr[__string] = js.undefined,
        TokenKeyId: js.UndefOr[__string] = js.undefined
    ): APNSChannelRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BundleId" -> BundleId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Certificate" -> Certificate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DefaultAuthenticationMethod" -> DefaultAuthenticationMethod.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Enabled" -> Enabled.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PrivateKey" -> PrivateKey.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TeamId" -> TeamId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TokenKey" -> TokenKey.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TokenKeyId" -> TokenKeyId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[APNSChannelRequest]
    }
  }

  /**
    * Apple Distribution Push Notification Service channel definition.
    */
  @js.native
  trait APNSChannelResponse extends js.Object {
    var ApplicationId: js.UndefOr[__string]
    var CreationDate: js.UndefOr[__string]
    var DefaultAuthenticationMethod: js.UndefOr[__string]
    var Enabled: js.UndefOr[__boolean]
    var HasCredential: js.UndefOr[__boolean]
    var HasTokenKey: js.UndefOr[__boolean]
    var Id: js.UndefOr[__string]
    var IsArchived: js.UndefOr[__boolean]
    var LastModifiedBy: js.UndefOr[__string]
    var LastModifiedDate: js.UndefOr[__string]
    var Platform: js.UndefOr[__string]
    var Version: js.UndefOr[__integer]
  }

  object APNSChannelResponse {
    def apply(
        ApplicationId: js.UndefOr[__string] = js.undefined,
        CreationDate: js.UndefOr[__string] = js.undefined,
        DefaultAuthenticationMethod: js.UndefOr[__string] = js.undefined,
        Enabled: js.UndefOr[__boolean] = js.undefined,
        HasCredential: js.UndefOr[__boolean] = js.undefined,
        HasTokenKey: js.UndefOr[__boolean] = js.undefined,
        Id: js.UndefOr[__string] = js.undefined,
        IsArchived: js.UndefOr[__boolean] = js.undefined,
        LastModifiedBy: js.UndefOr[__string] = js.undefined,
        LastModifiedDate: js.UndefOr[__string] = js.undefined,
        Platform: js.UndefOr[__string] = js.undefined,
        Version: js.UndefOr[__integer] = js.undefined
    ): APNSChannelResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationId" -> ApplicationId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CreationDate" -> CreationDate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DefaultAuthenticationMethod" -> DefaultAuthenticationMethod.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Enabled" -> Enabled.map { x =>
          x.asInstanceOf[js.Any]
        },
        "HasCredential" -> HasCredential.map { x =>
          x.asInstanceOf[js.Any]
        },
        "HasTokenKey" -> HasTokenKey.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Id" -> Id.map { x =>
          x.asInstanceOf[js.Any]
        },
        "IsArchived" -> IsArchived.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LastModifiedBy" -> LastModifiedBy.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LastModifiedDate" -> LastModifiedDate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Platform" -> Platform.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Version" -> Version.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[APNSChannelResponse]
    }
  }

  /**
    * APNS Message.
    */
  @js.native
  trait APNSMessage extends js.Object {
    var Action: js.UndefOr[Action]
    var Badge: js.UndefOr[__integer]
    var Body: js.UndefOr[__string]
    var Category: js.UndefOr[__string]
    var CollapseId: js.UndefOr[__string]
    var Data: js.UndefOr[MapOf__string]
    var MediaUrl: js.UndefOr[__string]
    var PreferredAuthenticationMethod: js.UndefOr[__string]
    var Priority: js.UndefOr[__string]
    var RawContent: js.UndefOr[__string]
    var SilentPush: js.UndefOr[__boolean]
    var Sound: js.UndefOr[__string]
    var Substitutions: js.UndefOr[MapOfListOf__string]
    var ThreadId: js.UndefOr[__string]
    var TimeToLive: js.UndefOr[__integer]
    var Title: js.UndefOr[__string]
    var Url: js.UndefOr[__string]
  }

  object APNSMessage {
    def apply(
        Action: js.UndefOr[Action] = js.undefined,
        Badge: js.UndefOr[__integer] = js.undefined,
        Body: js.UndefOr[__string] = js.undefined,
        Category: js.UndefOr[__string] = js.undefined,
        CollapseId: js.UndefOr[__string] = js.undefined,
        Data: js.UndefOr[MapOf__string] = js.undefined,
        MediaUrl: js.UndefOr[__string] = js.undefined,
        PreferredAuthenticationMethod: js.UndefOr[__string] = js.undefined,
        Priority: js.UndefOr[__string] = js.undefined,
        RawContent: js.UndefOr[__string] = js.undefined,
        SilentPush: js.UndefOr[__boolean] = js.undefined,
        Sound: js.UndefOr[__string] = js.undefined,
        Substitutions: js.UndefOr[MapOfListOf__string] = js.undefined,
        ThreadId: js.UndefOr[__string] = js.undefined,
        TimeToLive: js.UndefOr[__integer] = js.undefined,
        Title: js.UndefOr[__string] = js.undefined,
        Url: js.UndefOr[__string] = js.undefined
    ): APNSMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Action" -> Action.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Badge" -> Badge.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Body" -> Body.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Category" -> Category.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CollapseId" -> CollapseId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Data" -> Data.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MediaUrl" -> MediaUrl.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PreferredAuthenticationMethod" -> PreferredAuthenticationMethod.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Priority" -> Priority.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RawContent" -> RawContent.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SilentPush" -> SilentPush.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Sound" -> Sound.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Substitutions" -> Substitutions.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ThreadId" -> ThreadId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TimeToLive" -> TimeToLive.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Title" -> Title.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Url" -> Url.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[APNSMessage]
    }
  }

  /**
    * Apple Development Push Notification Service channel definition.
    */
  @js.native
  trait APNSSandboxChannelRequest extends js.Object {
    var BundleId: js.UndefOr[__string]
    var Certificate: js.UndefOr[__string]
    var DefaultAuthenticationMethod: js.UndefOr[__string]
    var Enabled: js.UndefOr[__boolean]
    var PrivateKey: js.UndefOr[__string]
    var TeamId: js.UndefOr[__string]
    var TokenKey: js.UndefOr[__string]
    var TokenKeyId: js.UndefOr[__string]
  }

  object APNSSandboxChannelRequest {
    def apply(
        BundleId: js.UndefOr[__string] = js.undefined,
        Certificate: js.UndefOr[__string] = js.undefined,
        DefaultAuthenticationMethod: js.UndefOr[__string] = js.undefined,
        Enabled: js.UndefOr[__boolean] = js.undefined,
        PrivateKey: js.UndefOr[__string] = js.undefined,
        TeamId: js.UndefOr[__string] = js.undefined,
        TokenKey: js.UndefOr[__string] = js.undefined,
        TokenKeyId: js.UndefOr[__string] = js.undefined
    ): APNSSandboxChannelRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BundleId" -> BundleId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Certificate" -> Certificate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DefaultAuthenticationMethod" -> DefaultAuthenticationMethod.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Enabled" -> Enabled.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PrivateKey" -> PrivateKey.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TeamId" -> TeamId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TokenKey" -> TokenKey.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TokenKeyId" -> TokenKeyId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[APNSSandboxChannelRequest]
    }
  }

  /**
    * Apple Development Push Notification Service channel definition.
    */
  @js.native
  trait APNSSandboxChannelResponse extends js.Object {
    var ApplicationId: js.UndefOr[__string]
    var CreationDate: js.UndefOr[__string]
    var DefaultAuthenticationMethod: js.UndefOr[__string]
    var Enabled: js.UndefOr[__boolean]
    var HasCredential: js.UndefOr[__boolean]
    var HasTokenKey: js.UndefOr[__boolean]
    var Id: js.UndefOr[__string]
    var IsArchived: js.UndefOr[__boolean]
    var LastModifiedBy: js.UndefOr[__string]
    var LastModifiedDate: js.UndefOr[__string]
    var Platform: js.UndefOr[__string]
    var Version: js.UndefOr[__integer]
  }

  object APNSSandboxChannelResponse {
    def apply(
        ApplicationId: js.UndefOr[__string] = js.undefined,
        CreationDate: js.UndefOr[__string] = js.undefined,
        DefaultAuthenticationMethod: js.UndefOr[__string] = js.undefined,
        Enabled: js.UndefOr[__boolean] = js.undefined,
        HasCredential: js.UndefOr[__boolean] = js.undefined,
        HasTokenKey: js.UndefOr[__boolean] = js.undefined,
        Id: js.UndefOr[__string] = js.undefined,
        IsArchived: js.UndefOr[__boolean] = js.undefined,
        LastModifiedBy: js.UndefOr[__string] = js.undefined,
        LastModifiedDate: js.UndefOr[__string] = js.undefined,
        Platform: js.UndefOr[__string] = js.undefined,
        Version: js.UndefOr[__integer] = js.undefined
    ): APNSSandboxChannelResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationId" -> ApplicationId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CreationDate" -> CreationDate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DefaultAuthenticationMethod" -> DefaultAuthenticationMethod.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Enabled" -> Enabled.map { x =>
          x.asInstanceOf[js.Any]
        },
        "HasCredential" -> HasCredential.map { x =>
          x.asInstanceOf[js.Any]
        },
        "HasTokenKey" -> HasTokenKey.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Id" -> Id.map { x =>
          x.asInstanceOf[js.Any]
        },
        "IsArchived" -> IsArchived.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LastModifiedBy" -> LastModifiedBy.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LastModifiedDate" -> LastModifiedDate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Platform" -> Platform.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Version" -> Version.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[APNSSandboxChannelResponse]
    }
  }

  /**
    * Apple VoIP Push Notification Service channel definition.
    */
  @js.native
  trait APNSVoipChannelRequest extends js.Object {
    var BundleId: js.UndefOr[__string]
    var Certificate: js.UndefOr[__string]
    var DefaultAuthenticationMethod: js.UndefOr[__string]
    var Enabled: js.UndefOr[__boolean]
    var PrivateKey: js.UndefOr[__string]
    var TeamId: js.UndefOr[__string]
    var TokenKey: js.UndefOr[__string]
    var TokenKeyId: js.UndefOr[__string]
  }

  object APNSVoipChannelRequest {
    def apply(
        BundleId: js.UndefOr[__string] = js.undefined,
        Certificate: js.UndefOr[__string] = js.undefined,
        DefaultAuthenticationMethod: js.UndefOr[__string] = js.undefined,
        Enabled: js.UndefOr[__boolean] = js.undefined,
        PrivateKey: js.UndefOr[__string] = js.undefined,
        TeamId: js.UndefOr[__string] = js.undefined,
        TokenKey: js.UndefOr[__string] = js.undefined,
        TokenKeyId: js.UndefOr[__string] = js.undefined
    ): APNSVoipChannelRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BundleId" -> BundleId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Certificate" -> Certificate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DefaultAuthenticationMethod" -> DefaultAuthenticationMethod.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Enabled" -> Enabled.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PrivateKey" -> PrivateKey.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TeamId" -> TeamId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TokenKey" -> TokenKey.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TokenKeyId" -> TokenKeyId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[APNSVoipChannelRequest]
    }
  }

  /**
    * Apple VoIP Push Notification Service channel definition.
    */
  @js.native
  trait APNSVoipChannelResponse extends js.Object {
    var ApplicationId: js.UndefOr[__string]
    var CreationDate: js.UndefOr[__string]
    var DefaultAuthenticationMethod: js.UndefOr[__string]
    var Enabled: js.UndefOr[__boolean]
    var HasCredential: js.UndefOr[__boolean]
    var HasTokenKey: js.UndefOr[__boolean]
    var Id: js.UndefOr[__string]
    var IsArchived: js.UndefOr[__boolean]
    var LastModifiedBy: js.UndefOr[__string]
    var LastModifiedDate: js.UndefOr[__string]
    var Platform: js.UndefOr[__string]
    var Version: js.UndefOr[__integer]
  }

  object APNSVoipChannelResponse {
    def apply(
        ApplicationId: js.UndefOr[__string] = js.undefined,
        CreationDate: js.UndefOr[__string] = js.undefined,
        DefaultAuthenticationMethod: js.UndefOr[__string] = js.undefined,
        Enabled: js.UndefOr[__boolean] = js.undefined,
        HasCredential: js.UndefOr[__boolean] = js.undefined,
        HasTokenKey: js.UndefOr[__boolean] = js.undefined,
        Id: js.UndefOr[__string] = js.undefined,
        IsArchived: js.UndefOr[__boolean] = js.undefined,
        LastModifiedBy: js.UndefOr[__string] = js.undefined,
        LastModifiedDate: js.UndefOr[__string] = js.undefined,
        Platform: js.UndefOr[__string] = js.undefined,
        Version: js.UndefOr[__integer] = js.undefined
    ): APNSVoipChannelResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationId" -> ApplicationId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CreationDate" -> CreationDate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DefaultAuthenticationMethod" -> DefaultAuthenticationMethod.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Enabled" -> Enabled.map { x =>
          x.asInstanceOf[js.Any]
        },
        "HasCredential" -> HasCredential.map { x =>
          x.asInstanceOf[js.Any]
        },
        "HasTokenKey" -> HasTokenKey.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Id" -> Id.map { x =>
          x.asInstanceOf[js.Any]
        },
        "IsArchived" -> IsArchived.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LastModifiedBy" -> LastModifiedBy.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LastModifiedDate" -> LastModifiedDate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Platform" -> Platform.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Version" -> Version.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[APNSVoipChannelResponse]
    }
  }

  /**
    * Apple VoIP Developer Push Notification Service channel definition.
    */
  @js.native
  trait APNSVoipSandboxChannelRequest extends js.Object {
    var BundleId: js.UndefOr[__string]
    var Certificate: js.UndefOr[__string]
    var DefaultAuthenticationMethod: js.UndefOr[__string]
    var Enabled: js.UndefOr[__boolean]
    var PrivateKey: js.UndefOr[__string]
    var TeamId: js.UndefOr[__string]
    var TokenKey: js.UndefOr[__string]
    var TokenKeyId: js.UndefOr[__string]
  }

  object APNSVoipSandboxChannelRequest {
    def apply(
        BundleId: js.UndefOr[__string] = js.undefined,
        Certificate: js.UndefOr[__string] = js.undefined,
        DefaultAuthenticationMethod: js.UndefOr[__string] = js.undefined,
        Enabled: js.UndefOr[__boolean] = js.undefined,
        PrivateKey: js.UndefOr[__string] = js.undefined,
        TeamId: js.UndefOr[__string] = js.undefined,
        TokenKey: js.UndefOr[__string] = js.undefined,
        TokenKeyId: js.UndefOr[__string] = js.undefined
    ): APNSVoipSandboxChannelRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BundleId" -> BundleId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Certificate" -> Certificate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DefaultAuthenticationMethod" -> DefaultAuthenticationMethod.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Enabled" -> Enabled.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PrivateKey" -> PrivateKey.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TeamId" -> TeamId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TokenKey" -> TokenKey.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TokenKeyId" -> TokenKeyId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[APNSVoipSandboxChannelRequest]
    }
  }

  /**
    * Apple VoIP Developer Push Notification Service channel definition.
    */
  @js.native
  trait APNSVoipSandboxChannelResponse extends js.Object {
    var ApplicationId: js.UndefOr[__string]
    var CreationDate: js.UndefOr[__string]
    var DefaultAuthenticationMethod: js.UndefOr[__string]
    var Enabled: js.UndefOr[__boolean]
    var HasCredential: js.UndefOr[__boolean]
    var HasTokenKey: js.UndefOr[__boolean]
    var Id: js.UndefOr[__string]
    var IsArchived: js.UndefOr[__boolean]
    var LastModifiedBy: js.UndefOr[__string]
    var LastModifiedDate: js.UndefOr[__string]
    var Platform: js.UndefOr[__string]
    var Version: js.UndefOr[__integer]
  }

  object APNSVoipSandboxChannelResponse {
    def apply(
        ApplicationId: js.UndefOr[__string] = js.undefined,
        CreationDate: js.UndefOr[__string] = js.undefined,
        DefaultAuthenticationMethod: js.UndefOr[__string] = js.undefined,
        Enabled: js.UndefOr[__boolean] = js.undefined,
        HasCredential: js.UndefOr[__boolean] = js.undefined,
        HasTokenKey: js.UndefOr[__boolean] = js.undefined,
        Id: js.UndefOr[__string] = js.undefined,
        IsArchived: js.UndefOr[__boolean] = js.undefined,
        LastModifiedBy: js.UndefOr[__string] = js.undefined,
        LastModifiedDate: js.UndefOr[__string] = js.undefined,
        Platform: js.UndefOr[__string] = js.undefined,
        Version: js.UndefOr[__integer] = js.undefined
    ): APNSVoipSandboxChannelResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationId" -> ApplicationId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CreationDate" -> CreationDate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DefaultAuthenticationMethod" -> DefaultAuthenticationMethod.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Enabled" -> Enabled.map { x =>
          x.asInstanceOf[js.Any]
        },
        "HasCredential" -> HasCredential.map { x =>
          x.asInstanceOf[js.Any]
        },
        "HasTokenKey" -> HasTokenKey.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Id" -> Id.map { x =>
          x.asInstanceOf[js.Any]
        },
        "IsArchived" -> IsArchived.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LastModifiedBy" -> LastModifiedBy.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LastModifiedDate" -> LastModifiedDate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Platform" -> Platform.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Version" -> Version.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[APNSVoipSandboxChannelResponse]
    }
  }

  object ActionEnum {
    val OPEN_APP  = "OPEN_APP"
    val DEEP_LINK = "DEEP_LINK"
    val URL       = "URL"

    val values = IndexedSeq(OPEN_APP, DEEP_LINK, URL)
  }

  /**
    * Activities for campaign.
    */
  @js.native
  trait ActivitiesResponse extends js.Object {
    var Item: js.UndefOr[ListOfActivityResponse]
    var NextToken: js.UndefOr[__string]
  }

  object ActivitiesResponse {
    def apply(
        Item: js.UndefOr[ListOfActivityResponse] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): ActivitiesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Item" -> Item.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ActivitiesResponse]
    }
  }

  /**
    * Activity definition
    */
  @js.native
  trait ActivityResponse extends js.Object {
    var ApplicationId: js.UndefOr[__string]
    var CampaignId: js.UndefOr[__string]
    var End: js.UndefOr[__string]
    var Id: js.UndefOr[__string]
    var Result: js.UndefOr[__string]
    var ScheduledStart: js.UndefOr[__string]
    var Start: js.UndefOr[__string]
    var State: js.UndefOr[__string]
    var SuccessfulEndpointCount: js.UndefOr[__integer]
    var TimezonesCompletedCount: js.UndefOr[__integer]
    var TimezonesTotalCount: js.UndefOr[__integer]
    var TotalEndpointCount: js.UndefOr[__integer]
    var TreatmentId: js.UndefOr[__string]
  }

  object ActivityResponse {
    def apply(
        ApplicationId: js.UndefOr[__string] = js.undefined,
        CampaignId: js.UndefOr[__string] = js.undefined,
        End: js.UndefOr[__string] = js.undefined,
        Id: js.UndefOr[__string] = js.undefined,
        Result: js.UndefOr[__string] = js.undefined,
        ScheduledStart: js.UndefOr[__string] = js.undefined,
        Start: js.UndefOr[__string] = js.undefined,
        State: js.UndefOr[__string] = js.undefined,
        SuccessfulEndpointCount: js.UndefOr[__integer] = js.undefined,
        TimezonesCompletedCount: js.UndefOr[__integer] = js.undefined,
        TimezonesTotalCount: js.UndefOr[__integer] = js.undefined,
        TotalEndpointCount: js.UndefOr[__integer] = js.undefined,
        TreatmentId: js.UndefOr[__string] = js.undefined
    ): ActivityResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationId" -> ApplicationId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CampaignId" -> CampaignId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "End" -> End.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Id" -> Id.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Result" -> Result.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ScheduledStart" -> ScheduledStart.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Start" -> Start.map { x =>
          x.asInstanceOf[js.Any]
        },
        "State" -> State.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SuccessfulEndpointCount" -> SuccessfulEndpointCount.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TimezonesCompletedCount" -> TimezonesCompletedCount.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TimezonesTotalCount" -> TimezonesTotalCount.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TotalEndpointCount" -> TotalEndpointCount.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TreatmentId" -> TreatmentId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ActivityResponse]
    }
  }

  /**
    * Address configuration.
    */
  @js.native
  trait AddressConfiguration extends js.Object {
    var BodyOverride: js.UndefOr[__string]
    var ChannelType: js.UndefOr[ChannelType]
    var Context: js.UndefOr[MapOf__string]
    var RawContent: js.UndefOr[__string]
    var Substitutions: js.UndefOr[MapOfListOf__string]
    var TitleOverride: js.UndefOr[__string]
  }

  object AddressConfiguration {
    def apply(
        BodyOverride: js.UndefOr[__string] = js.undefined,
        ChannelType: js.UndefOr[ChannelType] = js.undefined,
        Context: js.UndefOr[MapOf__string] = js.undefined,
        RawContent: js.UndefOr[__string] = js.undefined,
        Substitutions: js.UndefOr[MapOfListOf__string] = js.undefined,
        TitleOverride: js.UndefOr[__string] = js.undefined
    ): AddressConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BodyOverride" -> BodyOverride.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ChannelType" -> ChannelType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Context" -> Context.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RawContent" -> RawContent.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Substitutions" -> Substitutions.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TitleOverride" -> TitleOverride.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AddressConfiguration]
    }
  }

  /**
    * Application Response.
    */
  @js.native
  trait ApplicationResponse extends js.Object {
    var Arn: js.UndefOr[__string]
    var Id: js.UndefOr[__string]
    var Name: js.UndefOr[__string]
    var tags: js.UndefOr[MapOf__string]
  }

  object ApplicationResponse {
    def apply(
        Arn: js.UndefOr[__string] = js.undefined,
        Id: js.UndefOr[__string] = js.undefined,
        Name: js.UndefOr[__string] = js.undefined,
        tags: js.UndefOr[MapOf__string] = js.undefined
    ): ApplicationResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Arn" -> Arn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Id" -> Id.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        },
        "tags" -> tags.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ApplicationResponse]
    }
  }

  /**
    * Application settings.
    */
  @js.native
  trait ApplicationSettingsResource extends js.Object {
    var ApplicationId: js.UndefOr[__string]
    var CampaignHook: js.UndefOr[CampaignHook]
    var LastModifiedDate: js.UndefOr[__string]
    var Limits: js.UndefOr[CampaignLimits]
    var QuietTime: js.UndefOr[QuietTime]
  }

  object ApplicationSettingsResource {
    def apply(
        ApplicationId: js.UndefOr[__string] = js.undefined,
        CampaignHook: js.UndefOr[CampaignHook] = js.undefined,
        LastModifiedDate: js.UndefOr[__string] = js.undefined,
        Limits: js.UndefOr[CampaignLimits] = js.undefined,
        QuietTime: js.UndefOr[QuietTime] = js.undefined
    ): ApplicationSettingsResource = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationId" -> ApplicationId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CampaignHook" -> CampaignHook.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LastModifiedDate" -> LastModifiedDate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Limits" -> Limits.map { x =>
          x.asInstanceOf[js.Any]
        },
        "QuietTime" -> QuietTime.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ApplicationSettingsResource]
    }
  }

  /**
    * Get Applications Result.
    */
  @js.native
  trait ApplicationsResponse extends js.Object {
    var Item: js.UndefOr[ListOfApplicationResponse]
    var NextToken: js.UndefOr[__string]
  }

  object ApplicationsResponse {
    def apply(
        Item: js.UndefOr[ListOfApplicationResponse] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): ApplicationsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Item" -> Item.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ApplicationsResponse]
    }
  }

  /**
    * Custom attibute dimension
    */
  @js.native
  trait AttributeDimension extends js.Object {
    var AttributeType: js.UndefOr[AttributeType]
    var Values: js.UndefOr[ListOf__string]
  }

  object AttributeDimension {
    def apply(
        AttributeType: js.UndefOr[AttributeType] = js.undefined,
        Values: js.UndefOr[ListOf__string] = js.undefined
    ): AttributeDimension = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AttributeType" -> AttributeType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Values" -> Values.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AttributeDimension]
    }
  }

  object AttributeTypeEnum {
    val INCLUSIVE = "INCLUSIVE"
    val EXCLUSIVE = "EXCLUSIVE"

    val values = IndexedSeq(INCLUSIVE, EXCLUSIVE)
  }

  /**
    * Attributes.
    */
  @js.native
  trait AttributesResource extends js.Object {
    var ApplicationId: js.UndefOr[__string]
    var AttributeType: js.UndefOr[__string]
    var Attributes: js.UndefOr[ListOf__string]
  }

  object AttributesResource {
    def apply(
        ApplicationId: js.UndefOr[__string] = js.undefined,
        AttributeType: js.UndefOr[__string] = js.undefined,
        Attributes: js.UndefOr[ListOf__string] = js.undefined
    ): AttributesResource = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationId" -> ApplicationId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "AttributeType" -> AttributeType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Attributes" -> Attributes.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AttributesResource]
    }
  }

  /**
    * Baidu Cloud Push credentials
    */
  @js.native
  trait BaiduChannelRequest extends js.Object {
    var ApiKey: js.UndefOr[__string]
    var Enabled: js.UndefOr[__boolean]
    var SecretKey: js.UndefOr[__string]
  }

  object BaiduChannelRequest {
    def apply(
        ApiKey: js.UndefOr[__string] = js.undefined,
        Enabled: js.UndefOr[__boolean] = js.undefined,
        SecretKey: js.UndefOr[__string] = js.undefined
    ): BaiduChannelRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApiKey" -> ApiKey.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Enabled" -> Enabled.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SecretKey" -> SecretKey.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BaiduChannelRequest]
    }
  }

  /**
    * Baidu Cloud Messaging channel definition
    */
  @js.native
  trait BaiduChannelResponse extends js.Object {
    var ApplicationId: js.UndefOr[__string]
    var CreationDate: js.UndefOr[__string]
    var Credential: js.UndefOr[__string]
    var Enabled: js.UndefOr[__boolean]
    var HasCredential: js.UndefOr[__boolean]
    var Id: js.UndefOr[__string]
    var IsArchived: js.UndefOr[__boolean]
    var LastModifiedBy: js.UndefOr[__string]
    var LastModifiedDate: js.UndefOr[__string]
    var Platform: js.UndefOr[__string]
    var Version: js.UndefOr[__integer]
  }

  object BaiduChannelResponse {
    def apply(
        ApplicationId: js.UndefOr[__string] = js.undefined,
        CreationDate: js.UndefOr[__string] = js.undefined,
        Credential: js.UndefOr[__string] = js.undefined,
        Enabled: js.UndefOr[__boolean] = js.undefined,
        HasCredential: js.UndefOr[__boolean] = js.undefined,
        Id: js.UndefOr[__string] = js.undefined,
        IsArchived: js.UndefOr[__boolean] = js.undefined,
        LastModifiedBy: js.UndefOr[__string] = js.undefined,
        LastModifiedDate: js.UndefOr[__string] = js.undefined,
        Platform: js.UndefOr[__string] = js.undefined,
        Version: js.UndefOr[__integer] = js.undefined
    ): BaiduChannelResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationId" -> ApplicationId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CreationDate" -> CreationDate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Credential" -> Credential.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Enabled" -> Enabled.map { x =>
          x.asInstanceOf[js.Any]
        },
        "HasCredential" -> HasCredential.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Id" -> Id.map { x =>
          x.asInstanceOf[js.Any]
        },
        "IsArchived" -> IsArchived.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LastModifiedBy" -> LastModifiedBy.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LastModifiedDate" -> LastModifiedDate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Platform" -> Platform.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Version" -> Version.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BaiduChannelResponse]
    }
  }

  /**
    * Baidu Message.
    */
  @js.native
  trait BaiduMessage extends js.Object {
    var Action: js.UndefOr[Action]
    var Body: js.UndefOr[__string]
    var Data: js.UndefOr[MapOf__string]
    var IconReference: js.UndefOr[__string]
    var ImageIconUrl: js.UndefOr[__string]
    var ImageUrl: js.UndefOr[__string]
    var RawContent: js.UndefOr[__string]
    var SilentPush: js.UndefOr[__boolean]
    var SmallImageIconUrl: js.UndefOr[__string]
    var Sound: js.UndefOr[__string]
    var Substitutions: js.UndefOr[MapOfListOf__string]
    var TimeToLive: js.UndefOr[__integer]
    var Title: js.UndefOr[__string]
    var Url: js.UndefOr[__string]
  }

  object BaiduMessage {
    def apply(
        Action: js.UndefOr[Action] = js.undefined,
        Body: js.UndefOr[__string] = js.undefined,
        Data: js.UndefOr[MapOf__string] = js.undefined,
        IconReference: js.UndefOr[__string] = js.undefined,
        ImageIconUrl: js.UndefOr[__string] = js.undefined,
        ImageUrl: js.UndefOr[__string] = js.undefined,
        RawContent: js.UndefOr[__string] = js.undefined,
        SilentPush: js.UndefOr[__boolean] = js.undefined,
        SmallImageIconUrl: js.UndefOr[__string] = js.undefined,
        Sound: js.UndefOr[__string] = js.undefined,
        Substitutions: js.UndefOr[MapOfListOf__string] = js.undefined,
        TimeToLive: js.UndefOr[__integer] = js.undefined,
        Title: js.UndefOr[__string] = js.undefined,
        Url: js.UndefOr[__string] = js.undefined
    ): BaiduMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Action" -> Action.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Body" -> Body.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Data" -> Data.map { x =>
          x.asInstanceOf[js.Any]
        },
        "IconReference" -> IconReference.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ImageIconUrl" -> ImageIconUrl.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ImageUrl" -> ImageUrl.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RawContent" -> RawContent.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SilentPush" -> SilentPush.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SmallImageIconUrl" -> SmallImageIconUrl.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Sound" -> Sound.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Substitutions" -> Substitutions.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TimeToLive" -> TimeToLive.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Title" -> Title.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Url" -> Url.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BaiduMessage]
    }
  }

  /**
    * The email message configuration.
    */
  @js.native
  trait CampaignEmailMessage extends js.Object {
    var Body: js.UndefOr[__string]
    var FromAddress: js.UndefOr[__string]
    var HtmlBody: js.UndefOr[__string]
    var Title: js.UndefOr[__string]
  }

  object CampaignEmailMessage {
    def apply(
        Body: js.UndefOr[__string] = js.undefined,
        FromAddress: js.UndefOr[__string] = js.undefined,
        HtmlBody: js.UndefOr[__string] = js.undefined,
        Title: js.UndefOr[__string] = js.undefined
    ): CampaignEmailMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Body" -> Body.map { x =>
          x.asInstanceOf[js.Any]
        },
        "FromAddress" -> FromAddress.map { x =>
          x.asInstanceOf[js.Any]
        },
        "HtmlBody" -> HtmlBody.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Title" -> Title.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CampaignEmailMessage]
    }
  }

  /**
    * An object that defines the events that cause the campaign to be sent.
    */
  @js.native
  trait CampaignEventFilter extends js.Object {
    var Dimensions: js.UndefOr[EventDimensions]
    var FilterType: js.UndefOr[FilterType]
  }

  object CampaignEventFilter {
    def apply(
        Dimensions: js.UndefOr[EventDimensions] = js.undefined,
        FilterType: js.UndefOr[FilterType] = js.undefined
    ): CampaignEventFilter = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Dimensions" -> Dimensions.map { x =>
          x.asInstanceOf[js.Any]
        },
        "FilterType" -> FilterType.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CampaignEventFilter]
    }
  }

  /**
    * Campaign hook information.
    */
  @js.native
  trait CampaignHook extends js.Object {
    var LambdaFunctionName: js.UndefOr[__string]
    var Mode: js.UndefOr[Mode]
    var WebUrl: js.UndefOr[__string]
  }

  object CampaignHook {
    def apply(
        LambdaFunctionName: js.UndefOr[__string] = js.undefined,
        Mode: js.UndefOr[Mode] = js.undefined,
        WebUrl: js.UndefOr[__string] = js.undefined
    ): CampaignHook = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LambdaFunctionName" -> LambdaFunctionName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Mode" -> Mode.map { x =>
          x.asInstanceOf[js.Any]
        },
        "WebUrl" -> WebUrl.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CampaignHook]
    }
  }

  /**
    * Campaign Limits are used to limit the number of messages that can be sent to a single endpoint.
    */
  @js.native
  trait CampaignLimits extends js.Object {
    var Daily: js.UndefOr[__integer]
    var MaximumDuration: js.UndefOr[__integer]
    var MessagesPerSecond: js.UndefOr[__integer]
    var Total: js.UndefOr[__integer]
  }

  object CampaignLimits {
    def apply(
        Daily: js.UndefOr[__integer] = js.undefined,
        MaximumDuration: js.UndefOr[__integer] = js.undefined,
        MessagesPerSecond: js.UndefOr[__integer] = js.undefined,
        Total: js.UndefOr[__integer] = js.undefined
    ): CampaignLimits = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Daily" -> Daily.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MaximumDuration" -> MaximumDuration.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MessagesPerSecond" -> MessagesPerSecond.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Total" -> Total.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CampaignLimits]
    }
  }

  /**
    * Campaign definition
    */
  @js.native
  trait CampaignResponse extends js.Object {
    var AdditionalTreatments: js.UndefOr[ListOfTreatmentResource]
    var ApplicationId: js.UndefOr[__string]
    var Arn: js.UndefOr[__string]
    var CreationDate: js.UndefOr[__string]
    var DefaultState: js.UndefOr[CampaignState]
    var Description: js.UndefOr[__string]
    var HoldoutPercent: js.UndefOr[__integer]
    var Hook: js.UndefOr[CampaignHook]
    var Id: js.UndefOr[__string]
    var IsPaused: js.UndefOr[__boolean]
    var LastModifiedDate: js.UndefOr[__string]
    var Limits: js.UndefOr[CampaignLimits]
    var MessageConfiguration: js.UndefOr[MessageConfiguration]
    var Name: js.UndefOr[__string]
    var Schedule: js.UndefOr[Schedule]
    var SegmentId: js.UndefOr[__string]
    var SegmentVersion: js.UndefOr[__integer]
    var State: js.UndefOr[CampaignState]
    var TreatmentDescription: js.UndefOr[__string]
    var TreatmentName: js.UndefOr[__string]
    var Version: js.UndefOr[__integer]
    var tags: js.UndefOr[MapOf__string]
  }

  object CampaignResponse {
    def apply(
        AdditionalTreatments: js.UndefOr[ListOfTreatmentResource] = js.undefined,
        ApplicationId: js.UndefOr[__string] = js.undefined,
        Arn: js.UndefOr[__string] = js.undefined,
        CreationDate: js.UndefOr[__string] = js.undefined,
        DefaultState: js.UndefOr[CampaignState] = js.undefined,
        Description: js.UndefOr[__string] = js.undefined,
        HoldoutPercent: js.UndefOr[__integer] = js.undefined,
        Hook: js.UndefOr[CampaignHook] = js.undefined,
        Id: js.UndefOr[__string] = js.undefined,
        IsPaused: js.UndefOr[__boolean] = js.undefined,
        LastModifiedDate: js.UndefOr[__string] = js.undefined,
        Limits: js.UndefOr[CampaignLimits] = js.undefined,
        MessageConfiguration: js.UndefOr[MessageConfiguration] = js.undefined,
        Name: js.UndefOr[__string] = js.undefined,
        Schedule: js.UndefOr[Schedule] = js.undefined,
        SegmentId: js.UndefOr[__string] = js.undefined,
        SegmentVersion: js.UndefOr[__integer] = js.undefined,
        State: js.UndefOr[CampaignState] = js.undefined,
        TreatmentDescription: js.UndefOr[__string] = js.undefined,
        TreatmentName: js.UndefOr[__string] = js.undefined,
        Version: js.UndefOr[__integer] = js.undefined,
        tags: js.UndefOr[MapOf__string] = js.undefined
    ): CampaignResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AdditionalTreatments" -> AdditionalTreatments.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ApplicationId" -> ApplicationId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Arn" -> Arn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CreationDate" -> CreationDate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DefaultState" -> DefaultState.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Description" -> Description.map { x =>
          x.asInstanceOf[js.Any]
        },
        "HoldoutPercent" -> HoldoutPercent.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Hook" -> Hook.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Id" -> Id.map { x =>
          x.asInstanceOf[js.Any]
        },
        "IsPaused" -> IsPaused.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LastModifiedDate" -> LastModifiedDate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Limits" -> Limits.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MessageConfiguration" -> MessageConfiguration.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Schedule" -> Schedule.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SegmentId" -> SegmentId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SegmentVersion" -> SegmentVersion.map { x =>
          x.asInstanceOf[js.Any]
        },
        "State" -> State.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TreatmentDescription" -> TreatmentDescription.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TreatmentName" -> TreatmentName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Version" -> Version.map { x =>
          x.asInstanceOf[js.Any]
        },
        "tags" -> tags.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CampaignResponse]
    }
  }

  /**
    * SMS message configuration.
    */
  @js.native
  trait CampaignSmsMessage extends js.Object {
    var Body: js.UndefOr[__string]
    var MessageType: js.UndefOr[MessageType]
    var SenderId: js.UndefOr[__string]
  }

  object CampaignSmsMessage {
    def apply(
        Body: js.UndefOr[__string] = js.undefined,
        MessageType: js.UndefOr[MessageType] = js.undefined,
        SenderId: js.UndefOr[__string] = js.undefined
    ): CampaignSmsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Body" -> Body.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MessageType" -> MessageType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SenderId" -> SenderId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CampaignSmsMessage]
    }
  }

  /**
    * State of the Campaign
    */
  @js.native
  trait CampaignState extends js.Object {
    var CampaignStatus: js.UndefOr[CampaignStatus]
  }

  object CampaignState {
    def apply(
        CampaignStatus: js.UndefOr[CampaignStatus] = js.undefined
    ): CampaignState = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CampaignStatus" -> CampaignStatus.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CampaignState]
    }
  }

  object CampaignStatusEnum {
    val SCHEDULED        = "SCHEDULED"
    val EXECUTING        = "EXECUTING"
    val PENDING_NEXT_RUN = "PENDING_NEXT_RUN"
    val COMPLETED        = "COMPLETED"
    val PAUSED           = "PAUSED"
    val DELETED          = "DELETED"

    val values = IndexedSeq(SCHEDULED, EXECUTING, PENDING_NEXT_RUN, COMPLETED, PAUSED, DELETED)
  }

  /**
    * List of available campaigns.
    */
  @js.native
  trait CampaignsResponse extends js.Object {
    var Item: js.UndefOr[ListOfCampaignResponse]
    var NextToken: js.UndefOr[__string]
  }

  object CampaignsResponse {
    def apply(
        Item: js.UndefOr[ListOfCampaignResponse] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): CampaignsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Item" -> Item.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CampaignsResponse]
    }
  }

  /**
    * Base definition for channel response.
    */
  @js.native
  trait ChannelResponse extends js.Object {
    var ApplicationId: js.UndefOr[__string]
    var CreationDate: js.UndefOr[__string]
    var Enabled: js.UndefOr[__boolean]
    var HasCredential: js.UndefOr[__boolean]
    var Id: js.UndefOr[__string]
    var IsArchived: js.UndefOr[__boolean]
    var LastModifiedBy: js.UndefOr[__string]
    var LastModifiedDate: js.UndefOr[__string]
    var Version: js.UndefOr[__integer]
  }

  object ChannelResponse {
    def apply(
        ApplicationId: js.UndefOr[__string] = js.undefined,
        CreationDate: js.UndefOr[__string] = js.undefined,
        Enabled: js.UndefOr[__boolean] = js.undefined,
        HasCredential: js.UndefOr[__boolean] = js.undefined,
        Id: js.UndefOr[__string] = js.undefined,
        IsArchived: js.UndefOr[__boolean] = js.undefined,
        LastModifiedBy: js.UndefOr[__string] = js.undefined,
        LastModifiedDate: js.UndefOr[__string] = js.undefined,
        Version: js.UndefOr[__integer] = js.undefined
    ): ChannelResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationId" -> ApplicationId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CreationDate" -> CreationDate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Enabled" -> Enabled.map { x =>
          x.asInstanceOf[js.Any]
        },
        "HasCredential" -> HasCredential.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Id" -> Id.map { x =>
          x.asInstanceOf[js.Any]
        },
        "IsArchived" -> IsArchived.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LastModifiedBy" -> LastModifiedBy.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LastModifiedDate" -> LastModifiedDate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Version" -> Version.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ChannelResponse]
    }
  }

  object ChannelTypeEnum {
    val GCM               = "GCM"
    val APNS              = "APNS"
    val APNS_SANDBOX      = "APNS_SANDBOX"
    val APNS_VOIP         = "APNS_VOIP"
    val APNS_VOIP_SANDBOX = "APNS_VOIP_SANDBOX"
    val ADM               = "ADM"
    val SMS               = "SMS"
    val VOICE             = "VOICE"
    val EMAIL             = "EMAIL"
    val BAIDU             = "BAIDU"
    val CUSTOM            = "CUSTOM"

    val values =
      IndexedSeq(GCM, APNS, APNS_SANDBOX, APNS_VOIP, APNS_VOIP_SANDBOX, ADM, SMS, VOICE, EMAIL, BAIDU, CUSTOM)
  }

  /**
    * Get channels definition
    */
  @js.native
  trait ChannelsResponse extends js.Object {
    var Channels: js.UndefOr[MapOfChannelResponse]
  }

  object ChannelsResponse {
    def apply(
        Channels: js.UndefOr[MapOfChannelResponse] = js.undefined
    ): ChannelsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Channels" -> Channels.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ChannelsResponse]
    }
  }

  @js.native
  trait CreateAppRequest extends js.Object {
    var CreateApplicationRequest: CreateApplicationRequest
  }

  object CreateAppRequest {
    def apply(
        CreateApplicationRequest: CreateApplicationRequest
    ): CreateAppRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CreateApplicationRequest" -> CreateApplicationRequest.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateAppRequest]
    }
  }

  @js.native
  trait CreateAppResponse extends js.Object {
    var ApplicationResponse: ApplicationResponse
  }

  object CreateAppResponse {
    def apply(
        ApplicationResponse: ApplicationResponse
    ): CreateAppResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationResponse" -> ApplicationResponse.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateAppResponse]
    }
  }

  /**
    * Application Request.
    */
  @js.native
  trait CreateApplicationRequest extends js.Object {
    var Name: js.UndefOr[__string]
    var tags: js.UndefOr[MapOf__string]
  }

  object CreateApplicationRequest {
    def apply(
        Name: js.UndefOr[__string] = js.undefined,
        tags: js.UndefOr[MapOf__string] = js.undefined
    ): CreateApplicationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        },
        "tags" -> tags.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateApplicationRequest]
    }
  }

  @js.native
  trait CreateCampaignRequest extends js.Object {
    var ApplicationId: __string
    var WriteCampaignRequest: WriteCampaignRequest
  }

  object CreateCampaignRequest {
    def apply(
        ApplicationId: __string,
        WriteCampaignRequest: WriteCampaignRequest
    ): CreateCampaignRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationId"        -> ApplicationId.asInstanceOf[js.Any],
        "WriteCampaignRequest" -> WriteCampaignRequest.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateCampaignRequest]
    }
  }

  @js.native
  trait CreateCampaignResponse extends js.Object {
    var CampaignResponse: CampaignResponse
  }

  object CreateCampaignResponse {
    def apply(
        CampaignResponse: CampaignResponse
    ): CreateCampaignResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CampaignResponse" -> CampaignResponse.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateCampaignResponse]
    }
  }

  @js.native
  trait CreateExportJobRequest extends js.Object {
    var ApplicationId: __string
    var ExportJobRequest: ExportJobRequest
  }

  object CreateExportJobRequest {
    def apply(
        ApplicationId: __string,
        ExportJobRequest: ExportJobRequest
    ): CreateExportJobRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationId"    -> ApplicationId.asInstanceOf[js.Any],
        "ExportJobRequest" -> ExportJobRequest.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateExportJobRequest]
    }
  }

  @js.native
  trait CreateExportJobResponse extends js.Object {
    var ExportJobResponse: ExportJobResponse
  }

  object CreateExportJobResponse {
    def apply(
        ExportJobResponse: ExportJobResponse
    ): CreateExportJobResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ExportJobResponse" -> ExportJobResponse.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateExportJobResponse]
    }
  }

  @js.native
  trait CreateImportJobRequest extends js.Object {
    var ApplicationId: __string
    var ImportJobRequest: ImportJobRequest
  }

  object CreateImportJobRequest {
    def apply(
        ApplicationId: __string,
        ImportJobRequest: ImportJobRequest
    ): CreateImportJobRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationId"    -> ApplicationId.asInstanceOf[js.Any],
        "ImportJobRequest" -> ImportJobRequest.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateImportJobRequest]
    }
  }

  @js.native
  trait CreateImportJobResponse extends js.Object {
    var ImportJobResponse: ImportJobResponse
  }

  object CreateImportJobResponse {
    def apply(
        ImportJobResponse: ImportJobResponse
    ): CreateImportJobResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ImportJobResponse" -> ImportJobResponse.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateImportJobResponse]
    }
  }

  @js.native
  trait CreateSegmentRequest extends js.Object {
    var ApplicationId: __string
    var WriteSegmentRequest: WriteSegmentRequest
  }

  object CreateSegmentRequest {
    def apply(
        ApplicationId: __string,
        WriteSegmentRequest: WriteSegmentRequest
    ): CreateSegmentRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationId"       -> ApplicationId.asInstanceOf[js.Any],
        "WriteSegmentRequest" -> WriteSegmentRequest.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateSegmentRequest]
    }
  }

  @js.native
  trait CreateSegmentResponse extends js.Object {
    var SegmentResponse: SegmentResponse
  }

  object CreateSegmentResponse {
    def apply(
        SegmentResponse: SegmentResponse
    ): CreateSegmentResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SegmentResponse" -> SegmentResponse.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateSegmentResponse]
    }
  }

  /**
    * The default message to use across all channels.
    */
  @js.native
  trait DefaultMessage extends js.Object {
    var Body: js.UndefOr[__string]
    var Substitutions: js.UndefOr[MapOfListOf__string]
  }

  object DefaultMessage {
    def apply(
        Body: js.UndefOr[__string] = js.undefined,
        Substitutions: js.UndefOr[MapOfListOf__string] = js.undefined
    ): DefaultMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Body" -> Body.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Substitutions" -> Substitutions.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DefaultMessage]
    }
  }

  /**
    * Default Push Notification Message.
    */
  @js.native
  trait DefaultPushNotificationMessage extends js.Object {
    var Action: js.UndefOr[Action]
    var Body: js.UndefOr[__string]
    var Data: js.UndefOr[MapOf__string]
    var SilentPush: js.UndefOr[__boolean]
    var Substitutions: js.UndefOr[MapOfListOf__string]
    var Title: js.UndefOr[__string]
    var Url: js.UndefOr[__string]
  }

  object DefaultPushNotificationMessage {
    def apply(
        Action: js.UndefOr[Action] = js.undefined,
        Body: js.UndefOr[__string] = js.undefined,
        Data: js.UndefOr[MapOf__string] = js.undefined,
        SilentPush: js.UndefOr[__boolean] = js.undefined,
        Substitutions: js.UndefOr[MapOfListOf__string] = js.undefined,
        Title: js.UndefOr[__string] = js.undefined,
        Url: js.UndefOr[__string] = js.undefined
    ): DefaultPushNotificationMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Action" -> Action.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Body" -> Body.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Data" -> Data.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SilentPush" -> SilentPush.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Substitutions" -> Substitutions.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Title" -> Title.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Url" -> Url.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DefaultPushNotificationMessage]
    }
  }

  @js.native
  trait DeleteAdmChannelRequest extends js.Object {
    var ApplicationId: __string
  }

  object DeleteAdmChannelRequest {
    def apply(
        ApplicationId: __string
    ): DeleteAdmChannelRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteAdmChannelRequest]
    }
  }

  @js.native
  trait DeleteAdmChannelResponse extends js.Object {
    var ADMChannelResponse: ADMChannelResponse
  }

  object DeleteAdmChannelResponse {
    def apply(
        ADMChannelResponse: ADMChannelResponse
    ): DeleteAdmChannelResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ADMChannelResponse" -> ADMChannelResponse.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteAdmChannelResponse]
    }
  }

  @js.native
  trait DeleteApnsChannelRequest extends js.Object {
    var ApplicationId: __string
  }

  object DeleteApnsChannelRequest {
    def apply(
        ApplicationId: __string
    ): DeleteApnsChannelRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteApnsChannelRequest]
    }
  }

  @js.native
  trait DeleteApnsChannelResponse extends js.Object {
    var APNSChannelResponse: APNSChannelResponse
  }

  object DeleteApnsChannelResponse {
    def apply(
        APNSChannelResponse: APNSChannelResponse
    ): DeleteApnsChannelResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "APNSChannelResponse" -> APNSChannelResponse.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteApnsChannelResponse]
    }
  }

  @js.native
  trait DeleteApnsSandboxChannelRequest extends js.Object {
    var ApplicationId: __string
  }

  object DeleteApnsSandboxChannelRequest {
    def apply(
        ApplicationId: __string
    ): DeleteApnsSandboxChannelRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteApnsSandboxChannelRequest]
    }
  }

  @js.native
  trait DeleteApnsSandboxChannelResponse extends js.Object {
    var APNSSandboxChannelResponse: APNSSandboxChannelResponse
  }

  object DeleteApnsSandboxChannelResponse {
    def apply(
        APNSSandboxChannelResponse: APNSSandboxChannelResponse
    ): DeleteApnsSandboxChannelResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "APNSSandboxChannelResponse" -> APNSSandboxChannelResponse.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteApnsSandboxChannelResponse]
    }
  }

  @js.native
  trait DeleteApnsVoipChannelRequest extends js.Object {
    var ApplicationId: __string
  }

  object DeleteApnsVoipChannelRequest {
    def apply(
        ApplicationId: __string
    ): DeleteApnsVoipChannelRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteApnsVoipChannelRequest]
    }
  }

  @js.native
  trait DeleteApnsVoipChannelResponse extends js.Object {
    var APNSVoipChannelResponse: APNSVoipChannelResponse
  }

  object DeleteApnsVoipChannelResponse {
    def apply(
        APNSVoipChannelResponse: APNSVoipChannelResponse
    ): DeleteApnsVoipChannelResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "APNSVoipChannelResponse" -> APNSVoipChannelResponse.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteApnsVoipChannelResponse]
    }
  }

  @js.native
  trait DeleteApnsVoipSandboxChannelRequest extends js.Object {
    var ApplicationId: __string
  }

  object DeleteApnsVoipSandboxChannelRequest {
    def apply(
        ApplicationId: __string
    ): DeleteApnsVoipSandboxChannelRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteApnsVoipSandboxChannelRequest]
    }
  }

  @js.native
  trait DeleteApnsVoipSandboxChannelResponse extends js.Object {
    var APNSVoipSandboxChannelResponse: APNSVoipSandboxChannelResponse
  }

  object DeleteApnsVoipSandboxChannelResponse {
    def apply(
        APNSVoipSandboxChannelResponse: APNSVoipSandboxChannelResponse
    ): DeleteApnsVoipSandboxChannelResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "APNSVoipSandboxChannelResponse" -> APNSVoipSandboxChannelResponse.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteApnsVoipSandboxChannelResponse]
    }
  }

  @js.native
  trait DeleteAppRequest extends js.Object {
    var ApplicationId: __string
  }

  object DeleteAppRequest {
    def apply(
        ApplicationId: __string
    ): DeleteAppRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteAppRequest]
    }
  }

  @js.native
  trait DeleteAppResponse extends js.Object {
    var ApplicationResponse: ApplicationResponse
  }

  object DeleteAppResponse {
    def apply(
        ApplicationResponse: ApplicationResponse
    ): DeleteAppResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationResponse" -> ApplicationResponse.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteAppResponse]
    }
  }

  @js.native
  trait DeleteBaiduChannelRequest extends js.Object {
    var ApplicationId: __string
  }

  object DeleteBaiduChannelRequest {
    def apply(
        ApplicationId: __string
    ): DeleteBaiduChannelRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteBaiduChannelRequest]
    }
  }

  @js.native
  trait DeleteBaiduChannelResponse extends js.Object {
    var BaiduChannelResponse: BaiduChannelResponse
  }

  object DeleteBaiduChannelResponse {
    def apply(
        BaiduChannelResponse: BaiduChannelResponse
    ): DeleteBaiduChannelResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BaiduChannelResponse" -> BaiduChannelResponse.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteBaiduChannelResponse]
    }
  }

  @js.native
  trait DeleteCampaignRequest extends js.Object {
    var ApplicationId: __string
    var CampaignId: __string
  }

  object DeleteCampaignRequest {
    def apply(
        ApplicationId: __string,
        CampaignId: __string
    ): DeleteCampaignRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any],
        "CampaignId"    -> CampaignId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteCampaignRequest]
    }
  }

  @js.native
  trait DeleteCampaignResponse extends js.Object {
    var CampaignResponse: CampaignResponse
  }

  object DeleteCampaignResponse {
    def apply(
        CampaignResponse: CampaignResponse
    ): DeleteCampaignResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CampaignResponse" -> CampaignResponse.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteCampaignResponse]
    }
  }

  @js.native
  trait DeleteEmailChannelRequest extends js.Object {
    var ApplicationId: __string
  }

  object DeleteEmailChannelRequest {
    def apply(
        ApplicationId: __string
    ): DeleteEmailChannelRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteEmailChannelRequest]
    }
  }

  @js.native
  trait DeleteEmailChannelResponse extends js.Object {
    var EmailChannelResponse: EmailChannelResponse
  }

  object DeleteEmailChannelResponse {
    def apply(
        EmailChannelResponse: EmailChannelResponse
    ): DeleteEmailChannelResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EmailChannelResponse" -> EmailChannelResponse.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteEmailChannelResponse]
    }
  }

  @js.native
  trait DeleteEndpointRequest extends js.Object {
    var ApplicationId: __string
    var EndpointId: __string
  }

  object DeleteEndpointRequest {
    def apply(
        ApplicationId: __string,
        EndpointId: __string
    ): DeleteEndpointRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any],
        "EndpointId"    -> EndpointId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteEndpointRequest]
    }
  }

  @js.native
  trait DeleteEndpointResponse extends js.Object {
    var EndpointResponse: EndpointResponse
  }

  object DeleteEndpointResponse {
    def apply(
        EndpointResponse: EndpointResponse
    ): DeleteEndpointResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EndpointResponse" -> EndpointResponse.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteEndpointResponse]
    }
  }

  @js.native
  trait DeleteEventStreamRequest extends js.Object {
    var ApplicationId: __string
  }

  object DeleteEventStreamRequest {
    def apply(
        ApplicationId: __string
    ): DeleteEventStreamRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteEventStreamRequest]
    }
  }

  @js.native
  trait DeleteEventStreamResponse extends js.Object {
    var EventStream: EventStream
  }

  object DeleteEventStreamResponse {
    def apply(
        EventStream: EventStream
    ): DeleteEventStreamResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EventStream" -> EventStream.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteEventStreamResponse]
    }
  }

  @js.native
  trait DeleteGcmChannelRequest extends js.Object {
    var ApplicationId: __string
  }

  object DeleteGcmChannelRequest {
    def apply(
        ApplicationId: __string
    ): DeleteGcmChannelRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteGcmChannelRequest]
    }
  }

  @js.native
  trait DeleteGcmChannelResponse extends js.Object {
    var GCMChannelResponse: GCMChannelResponse
  }

  object DeleteGcmChannelResponse {
    def apply(
        GCMChannelResponse: GCMChannelResponse
    ): DeleteGcmChannelResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GCMChannelResponse" -> GCMChannelResponse.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteGcmChannelResponse]
    }
  }

  @js.native
  trait DeleteSegmentRequest extends js.Object {
    var ApplicationId: __string
    var SegmentId: __string
  }

  object DeleteSegmentRequest {
    def apply(
        ApplicationId: __string,
        SegmentId: __string
    ): DeleteSegmentRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any],
        "SegmentId"     -> SegmentId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteSegmentRequest]
    }
  }

  @js.native
  trait DeleteSegmentResponse extends js.Object {
    var SegmentResponse: SegmentResponse
  }

  object DeleteSegmentResponse {
    def apply(
        SegmentResponse: SegmentResponse
    ): DeleteSegmentResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SegmentResponse" -> SegmentResponse.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteSegmentResponse]
    }
  }

  @js.native
  trait DeleteSmsChannelRequest extends js.Object {
    var ApplicationId: __string
  }

  object DeleteSmsChannelRequest {
    def apply(
        ApplicationId: __string
    ): DeleteSmsChannelRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteSmsChannelRequest]
    }
  }

  @js.native
  trait DeleteSmsChannelResponse extends js.Object {
    var SMSChannelResponse: SMSChannelResponse
  }

  object DeleteSmsChannelResponse {
    def apply(
        SMSChannelResponse: SMSChannelResponse
    ): DeleteSmsChannelResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SMSChannelResponse" -> SMSChannelResponse.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteSmsChannelResponse]
    }
  }

  @js.native
  trait DeleteUserEndpointsRequest extends js.Object {
    var ApplicationId: __string
    var UserId: __string
  }

  object DeleteUserEndpointsRequest {
    def apply(
        ApplicationId: __string,
        UserId: __string
    ): DeleteUserEndpointsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any],
        "UserId"        -> UserId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteUserEndpointsRequest]
    }
  }

  @js.native
  trait DeleteUserEndpointsResponse extends js.Object {
    var EndpointsResponse: EndpointsResponse
  }

  object DeleteUserEndpointsResponse {
    def apply(
        EndpointsResponse: EndpointsResponse
    ): DeleteUserEndpointsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EndpointsResponse" -> EndpointsResponse.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteUserEndpointsResponse]
    }
  }

  @js.native
  trait DeleteVoiceChannelRequest extends js.Object {
    var ApplicationId: __string
  }

  object DeleteVoiceChannelRequest {
    def apply(
        ApplicationId: __string
    ): DeleteVoiceChannelRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteVoiceChannelRequest]
    }
  }

  @js.native
  trait DeleteVoiceChannelResponse extends js.Object {
    var VoiceChannelResponse: VoiceChannelResponse
  }

  object DeleteVoiceChannelResponse {
    def apply(
        VoiceChannelResponse: VoiceChannelResponse
    ): DeleteVoiceChannelResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "VoiceChannelResponse" -> VoiceChannelResponse.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteVoiceChannelResponse]
    }
  }

  object DeliveryStatusEnum {
    val SUCCESSFUL        = "SUCCESSFUL"
    val THROTTLED         = "THROTTLED"
    val TEMPORARY_FAILURE = "TEMPORARY_FAILURE"
    val PERMANENT_FAILURE = "PERMANENT_FAILURE"
    val UNKNOWN_FAILURE   = "UNKNOWN_FAILURE"
    val OPT_OUT           = "OPT_OUT"
    val DUPLICATE         = "DUPLICATE"

    val values =
      IndexedSeq(SUCCESSFUL, THROTTLED, TEMPORARY_FAILURE, PERMANENT_FAILURE, UNKNOWN_FAILURE, OPT_OUT, DUPLICATE)
  }

  object DimensionTypeEnum {
    val INCLUSIVE = "INCLUSIVE"
    val EXCLUSIVE = "EXCLUSIVE"

    val values = IndexedSeq(INCLUSIVE, EXCLUSIVE)
  }

  /**
    * Message definitions for the default message and any messages that are tailored for specific channels.
    */
  @js.native
  trait DirectMessageConfiguration extends js.Object {
    var ADMMessage: js.UndefOr[ADMMessage]
    var APNSMessage: js.UndefOr[APNSMessage]
    var BaiduMessage: js.UndefOr[BaiduMessage]
    var DefaultMessage: js.UndefOr[DefaultMessage]
    var DefaultPushNotificationMessage: js.UndefOr[DefaultPushNotificationMessage]
    var EmailMessage: js.UndefOr[EmailMessage]
    var GCMMessage: js.UndefOr[GCMMessage]
    var SMSMessage: js.UndefOr[SMSMessage]
    var VoiceMessage: js.UndefOr[VoiceMessage]
  }

  object DirectMessageConfiguration {
    def apply(
        ADMMessage: js.UndefOr[ADMMessage] = js.undefined,
        APNSMessage: js.UndefOr[APNSMessage] = js.undefined,
        BaiduMessage: js.UndefOr[BaiduMessage] = js.undefined,
        DefaultMessage: js.UndefOr[DefaultMessage] = js.undefined,
        DefaultPushNotificationMessage: js.UndefOr[DefaultPushNotificationMessage] = js.undefined,
        EmailMessage: js.UndefOr[EmailMessage] = js.undefined,
        GCMMessage: js.UndefOr[GCMMessage] = js.undefined,
        SMSMessage: js.UndefOr[SMSMessage] = js.undefined,
        VoiceMessage: js.UndefOr[VoiceMessage] = js.undefined
    ): DirectMessageConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ADMMessage" -> ADMMessage.map { x =>
          x.asInstanceOf[js.Any]
        },
        "APNSMessage" -> APNSMessage.map { x =>
          x.asInstanceOf[js.Any]
        },
        "BaiduMessage" -> BaiduMessage.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DefaultMessage" -> DefaultMessage.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DefaultPushNotificationMessage" -> DefaultPushNotificationMessage.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EmailMessage" -> EmailMessage.map { x =>
          x.asInstanceOf[js.Any]
        },
        "GCMMessage" -> GCMMessage.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SMSMessage" -> SMSMessage.map { x =>
          x.asInstanceOf[js.Any]
        },
        "VoiceMessage" -> VoiceMessage.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DirectMessageConfiguration]
    }
  }

  object DurationEnum {
    val HR_24  = "HR_24"
    val DAY_7  = "DAY_7"
    val DAY_14 = "DAY_14"
    val DAY_30 = "DAY_30"

    val values = IndexedSeq(HR_24, DAY_7, DAY_14, DAY_30)
  }

  /**
    * Email Channel Request
    */
  @js.native
  trait EmailChannelRequest extends js.Object {
    var ConfigurationSet: js.UndefOr[__string]
    var Enabled: js.UndefOr[__boolean]
    var FromAddress: js.UndefOr[__string]
    var Identity: js.UndefOr[__string]
    var RoleArn: js.UndefOr[__string]
  }

  object EmailChannelRequest {
    def apply(
        ConfigurationSet: js.UndefOr[__string] = js.undefined,
        Enabled: js.UndefOr[__boolean] = js.undefined,
        FromAddress: js.UndefOr[__string] = js.undefined,
        Identity: js.UndefOr[__string] = js.undefined,
        RoleArn: js.UndefOr[__string] = js.undefined
    ): EmailChannelRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConfigurationSet" -> ConfigurationSet.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Enabled" -> Enabled.map { x =>
          x.asInstanceOf[js.Any]
        },
        "FromAddress" -> FromAddress.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Identity" -> Identity.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RoleArn" -> RoleArn.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EmailChannelRequest]
    }
  }

  /**
    * Email Channel Response.
    */
  @js.native
  trait EmailChannelResponse extends js.Object {
    var ApplicationId: js.UndefOr[__string]
    var ConfigurationSet: js.UndefOr[__string]
    var CreationDate: js.UndefOr[__string]
    var Enabled: js.UndefOr[__boolean]
    var FromAddress: js.UndefOr[__string]
    var HasCredential: js.UndefOr[__boolean]
    var Id: js.UndefOr[__string]
    var Identity: js.UndefOr[__string]
    var IsArchived: js.UndefOr[__boolean]
    var LastModifiedBy: js.UndefOr[__string]
    var LastModifiedDate: js.UndefOr[__string]
    var MessagesPerSecond: js.UndefOr[__integer]
    var Platform: js.UndefOr[__string]
    var RoleArn: js.UndefOr[__string]
    var Version: js.UndefOr[__integer]
  }

  object EmailChannelResponse {
    def apply(
        ApplicationId: js.UndefOr[__string] = js.undefined,
        ConfigurationSet: js.UndefOr[__string] = js.undefined,
        CreationDate: js.UndefOr[__string] = js.undefined,
        Enabled: js.UndefOr[__boolean] = js.undefined,
        FromAddress: js.UndefOr[__string] = js.undefined,
        HasCredential: js.UndefOr[__boolean] = js.undefined,
        Id: js.UndefOr[__string] = js.undefined,
        Identity: js.UndefOr[__string] = js.undefined,
        IsArchived: js.UndefOr[__boolean] = js.undefined,
        LastModifiedBy: js.UndefOr[__string] = js.undefined,
        LastModifiedDate: js.UndefOr[__string] = js.undefined,
        MessagesPerSecond: js.UndefOr[__integer] = js.undefined,
        Platform: js.UndefOr[__string] = js.undefined,
        RoleArn: js.UndefOr[__string] = js.undefined,
        Version: js.UndefOr[__integer] = js.undefined
    ): EmailChannelResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationId" -> ApplicationId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ConfigurationSet" -> ConfigurationSet.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CreationDate" -> CreationDate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Enabled" -> Enabled.map { x =>
          x.asInstanceOf[js.Any]
        },
        "FromAddress" -> FromAddress.map { x =>
          x.asInstanceOf[js.Any]
        },
        "HasCredential" -> HasCredential.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Id" -> Id.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Identity" -> Identity.map { x =>
          x.asInstanceOf[js.Any]
        },
        "IsArchived" -> IsArchived.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LastModifiedBy" -> LastModifiedBy.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LastModifiedDate" -> LastModifiedDate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MessagesPerSecond" -> MessagesPerSecond.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Platform" -> Platform.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RoleArn" -> RoleArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Version" -> Version.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EmailChannelResponse]
    }
  }

  /**
    * Email Message.
    */
  @js.native
  trait EmailMessage extends js.Object {
    var Body: js.UndefOr[__string]
    var FeedbackForwardingAddress: js.UndefOr[__string]
    var FromAddress: js.UndefOr[__string]
    var RawEmail: js.UndefOr[RawEmail]
    var ReplyToAddresses: js.UndefOr[ListOf__string]
    var SimpleEmail: js.UndefOr[SimpleEmail]
    var Substitutions: js.UndefOr[MapOfListOf__string]
  }

  object EmailMessage {
    def apply(
        Body: js.UndefOr[__string] = js.undefined,
        FeedbackForwardingAddress: js.UndefOr[__string] = js.undefined,
        FromAddress: js.UndefOr[__string] = js.undefined,
        RawEmail: js.UndefOr[RawEmail] = js.undefined,
        ReplyToAddresses: js.UndefOr[ListOf__string] = js.undefined,
        SimpleEmail: js.UndefOr[SimpleEmail] = js.undefined,
        Substitutions: js.UndefOr[MapOfListOf__string] = js.undefined
    ): EmailMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Body" -> Body.map { x =>
          x.asInstanceOf[js.Any]
        },
        "FeedbackForwardingAddress" -> FeedbackForwardingAddress.map { x =>
          x.asInstanceOf[js.Any]
        },
        "FromAddress" -> FromAddress.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RawEmail" -> RawEmail.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ReplyToAddresses" -> ReplyToAddresses.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SimpleEmail" -> SimpleEmail.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Substitutions" -> Substitutions.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EmailMessage]
    }
  }

  /**
    * Endpoint update request
    */
  @js.native
  trait EndpointBatchItem extends js.Object {
    var Address: js.UndefOr[__string]
    var Attributes: js.UndefOr[MapOfListOf__string]
    var ChannelType: js.UndefOr[ChannelType]
    var Demographic: js.UndefOr[EndpointDemographic]
    var EffectiveDate: js.UndefOr[__string]
    var EndpointStatus: js.UndefOr[__string]
    var Id: js.UndefOr[__string]
    var Location: js.UndefOr[EndpointLocation]
    var Metrics: js.UndefOr[MapOf__double]
    var OptOut: js.UndefOr[__string]
    var RequestId: js.UndefOr[__string]
    var User: js.UndefOr[EndpointUser]
  }

  object EndpointBatchItem {
    def apply(
        Address: js.UndefOr[__string] = js.undefined,
        Attributes: js.UndefOr[MapOfListOf__string] = js.undefined,
        ChannelType: js.UndefOr[ChannelType] = js.undefined,
        Demographic: js.UndefOr[EndpointDemographic] = js.undefined,
        EffectiveDate: js.UndefOr[__string] = js.undefined,
        EndpointStatus: js.UndefOr[__string] = js.undefined,
        Id: js.UndefOr[__string] = js.undefined,
        Location: js.UndefOr[EndpointLocation] = js.undefined,
        Metrics: js.UndefOr[MapOf__double] = js.undefined,
        OptOut: js.UndefOr[__string] = js.undefined,
        RequestId: js.UndefOr[__string] = js.undefined,
        User: js.UndefOr[EndpointUser] = js.undefined
    ): EndpointBatchItem = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Address" -> Address.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Attributes" -> Attributes.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ChannelType" -> ChannelType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Demographic" -> Demographic.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EffectiveDate" -> EffectiveDate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EndpointStatus" -> EndpointStatus.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Id" -> Id.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Location" -> Location.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Metrics" -> Metrics.map { x =>
          x.asInstanceOf[js.Any]
        },
        "OptOut" -> OptOut.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RequestId" -> RequestId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "User" -> User.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EndpointBatchItem]
    }
  }

  /**
    * Endpoint batch update request.
    */
  @js.native
  trait EndpointBatchRequest extends js.Object {
    var Item: js.UndefOr[ListOfEndpointBatchItem]
  }

  object EndpointBatchRequest {
    def apply(
        Item: js.UndefOr[ListOfEndpointBatchItem] = js.undefined
    ): EndpointBatchRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Item" -> Item.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EndpointBatchRequest]
    }
  }

  /**
    * Demographic information about the endpoint.
    */
  @js.native
  trait EndpointDemographic extends js.Object {
    var AppVersion: js.UndefOr[__string]
    var Locale: js.UndefOr[__string]
    var Make: js.UndefOr[__string]
    var Model: js.UndefOr[__string]
    var ModelVersion: js.UndefOr[__string]
    var Platform: js.UndefOr[__string]
    var PlatformVersion: js.UndefOr[__string]
    var Timezone: js.UndefOr[__string]
  }

  object EndpointDemographic {
    def apply(
        AppVersion: js.UndefOr[__string] = js.undefined,
        Locale: js.UndefOr[__string] = js.undefined,
        Make: js.UndefOr[__string] = js.undefined,
        Model: js.UndefOr[__string] = js.undefined,
        ModelVersion: js.UndefOr[__string] = js.undefined,
        Platform: js.UndefOr[__string] = js.undefined,
        PlatformVersion: js.UndefOr[__string] = js.undefined,
        Timezone: js.UndefOr[__string] = js.undefined
    ): EndpointDemographic = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AppVersion" -> AppVersion.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Locale" -> Locale.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Make" -> Make.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Model" -> Model.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ModelVersion" -> ModelVersion.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Platform" -> Platform.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PlatformVersion" -> PlatformVersion.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Timezone" -> Timezone.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EndpointDemographic]
    }
  }

  /**
    * A complex object that holds the status code and message as a result of processing an endpoint.
    */
  @js.native
  trait EndpointItemResponse extends js.Object {
    var Message: js.UndefOr[__string]
    var StatusCode: js.UndefOr[__integer]
  }

  object EndpointItemResponse {
    def apply(
        Message: js.UndefOr[__string] = js.undefined,
        StatusCode: js.UndefOr[__integer] = js.undefined
    ): EndpointItemResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Message" -> Message.map { x =>
          x.asInstanceOf[js.Any]
        },
        "StatusCode" -> StatusCode.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EndpointItemResponse]
    }
  }

  /**
    * Location data for the endpoint.
    */
  @js.native
  trait EndpointLocation extends js.Object {
    var City: js.UndefOr[__string]
    var Country: js.UndefOr[__string]
    var Latitude: js.UndefOr[__double]
    var Longitude: js.UndefOr[__double]
    var PostalCode: js.UndefOr[__string]
    var Region: js.UndefOr[__string]
  }

  object EndpointLocation {
    def apply(
        City: js.UndefOr[__string] = js.undefined,
        Country: js.UndefOr[__string] = js.undefined,
        Latitude: js.UndefOr[__double] = js.undefined,
        Longitude: js.UndefOr[__double] = js.undefined,
        PostalCode: js.UndefOr[__string] = js.undefined,
        Region: js.UndefOr[__string] = js.undefined
    ): EndpointLocation = {
      val _fields = IndexedSeq[(String, js.Any)](
        "City" -> City.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Country" -> Country.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Latitude" -> Latitude.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Longitude" -> Longitude.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PostalCode" -> PostalCode.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Region" -> Region.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EndpointLocation]
    }
  }

  /**
    * The result from sending a message to an endpoint.
    */
  @js.native
  trait EndpointMessageResult extends js.Object {
    var Address: js.UndefOr[__string]
    var DeliveryStatus: js.UndefOr[DeliveryStatus]
    var MessageId: js.UndefOr[__string]
    var StatusCode: js.UndefOr[__integer]
    var StatusMessage: js.UndefOr[__string]
    var UpdatedToken: js.UndefOr[__string]
  }

  object EndpointMessageResult {
    def apply(
        Address: js.UndefOr[__string] = js.undefined,
        DeliveryStatus: js.UndefOr[DeliveryStatus] = js.undefined,
        MessageId: js.UndefOr[__string] = js.undefined,
        StatusCode: js.UndefOr[__integer] = js.undefined,
        StatusMessage: js.UndefOr[__string] = js.undefined,
        UpdatedToken: js.UndefOr[__string] = js.undefined
    ): EndpointMessageResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Address" -> Address.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DeliveryStatus" -> DeliveryStatus.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MessageId" -> MessageId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "StatusCode" -> StatusCode.map { x =>
          x.asInstanceOf[js.Any]
        },
        "StatusMessage" -> StatusMessage.map { x =>
          x.asInstanceOf[js.Any]
        },
        "UpdatedToken" -> UpdatedToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EndpointMessageResult]
    }
  }

  /**
    * An endpoint update request.
    */
  @js.native
  trait EndpointRequest extends js.Object {
    var Address: js.UndefOr[__string]
    var Attributes: js.UndefOr[MapOfListOf__string]
    var ChannelType: js.UndefOr[ChannelType]
    var Demographic: js.UndefOr[EndpointDemographic]
    var EffectiveDate: js.UndefOr[__string]
    var EndpointStatus: js.UndefOr[__string]
    var Location: js.UndefOr[EndpointLocation]
    var Metrics: js.UndefOr[MapOf__double]
    var OptOut: js.UndefOr[__string]
    var RequestId: js.UndefOr[__string]
    var User: js.UndefOr[EndpointUser]
  }

  object EndpointRequest {
    def apply(
        Address: js.UndefOr[__string] = js.undefined,
        Attributes: js.UndefOr[MapOfListOf__string] = js.undefined,
        ChannelType: js.UndefOr[ChannelType] = js.undefined,
        Demographic: js.UndefOr[EndpointDemographic] = js.undefined,
        EffectiveDate: js.UndefOr[__string] = js.undefined,
        EndpointStatus: js.UndefOr[__string] = js.undefined,
        Location: js.UndefOr[EndpointLocation] = js.undefined,
        Metrics: js.UndefOr[MapOf__double] = js.undefined,
        OptOut: js.UndefOr[__string] = js.undefined,
        RequestId: js.UndefOr[__string] = js.undefined,
        User: js.UndefOr[EndpointUser] = js.undefined
    ): EndpointRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Address" -> Address.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Attributes" -> Attributes.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ChannelType" -> ChannelType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Demographic" -> Demographic.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EffectiveDate" -> EffectiveDate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EndpointStatus" -> EndpointStatus.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Location" -> Location.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Metrics" -> Metrics.map { x =>
          x.asInstanceOf[js.Any]
        },
        "OptOut" -> OptOut.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RequestId" -> RequestId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "User" -> User.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EndpointRequest]
    }
  }

  /**
    * Endpoint response
    */
  @js.native
  trait EndpointResponse extends js.Object {
    var Address: js.UndefOr[__string]
    var ApplicationId: js.UndefOr[__string]
    var Attributes: js.UndefOr[MapOfListOf__string]
    var ChannelType: js.UndefOr[ChannelType]
    var CohortId: js.UndefOr[__string]
    var CreationDate: js.UndefOr[__string]
    var Demographic: js.UndefOr[EndpointDemographic]
    var EffectiveDate: js.UndefOr[__string]
    var EndpointStatus: js.UndefOr[__string]
    var Id: js.UndefOr[__string]
    var Location: js.UndefOr[EndpointLocation]
    var Metrics: js.UndefOr[MapOf__double]
    var OptOut: js.UndefOr[__string]
    var RequestId: js.UndefOr[__string]
    var User: js.UndefOr[EndpointUser]
  }

  object EndpointResponse {
    def apply(
        Address: js.UndefOr[__string] = js.undefined,
        ApplicationId: js.UndefOr[__string] = js.undefined,
        Attributes: js.UndefOr[MapOfListOf__string] = js.undefined,
        ChannelType: js.UndefOr[ChannelType] = js.undefined,
        CohortId: js.UndefOr[__string] = js.undefined,
        CreationDate: js.UndefOr[__string] = js.undefined,
        Demographic: js.UndefOr[EndpointDemographic] = js.undefined,
        EffectiveDate: js.UndefOr[__string] = js.undefined,
        EndpointStatus: js.UndefOr[__string] = js.undefined,
        Id: js.UndefOr[__string] = js.undefined,
        Location: js.UndefOr[EndpointLocation] = js.undefined,
        Metrics: js.UndefOr[MapOf__double] = js.undefined,
        OptOut: js.UndefOr[__string] = js.undefined,
        RequestId: js.UndefOr[__string] = js.undefined,
        User: js.UndefOr[EndpointUser] = js.undefined
    ): EndpointResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Address" -> Address.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ApplicationId" -> ApplicationId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Attributes" -> Attributes.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ChannelType" -> ChannelType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CohortId" -> CohortId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CreationDate" -> CreationDate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Demographic" -> Demographic.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EffectiveDate" -> EffectiveDate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EndpointStatus" -> EndpointStatus.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Id" -> Id.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Location" -> Location.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Metrics" -> Metrics.map { x =>
          x.asInstanceOf[js.Any]
        },
        "OptOut" -> OptOut.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RequestId" -> RequestId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "User" -> User.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EndpointResponse]
    }
  }

  /**
    * Endpoint send configuration.
    */
  @js.native
  trait EndpointSendConfiguration extends js.Object {
    var BodyOverride: js.UndefOr[__string]
    var Context: js.UndefOr[MapOf__string]
    var RawContent: js.UndefOr[__string]
    var Substitutions: js.UndefOr[MapOfListOf__string]
    var TitleOverride: js.UndefOr[__string]
  }

  object EndpointSendConfiguration {
    def apply(
        BodyOverride: js.UndefOr[__string] = js.undefined,
        Context: js.UndefOr[MapOf__string] = js.undefined,
        RawContent: js.UndefOr[__string] = js.undefined,
        Substitutions: js.UndefOr[MapOfListOf__string] = js.undefined,
        TitleOverride: js.UndefOr[__string] = js.undefined
    ): EndpointSendConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BodyOverride" -> BodyOverride.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Context" -> Context.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RawContent" -> RawContent.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Substitutions" -> Substitutions.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TitleOverride" -> TitleOverride.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EndpointSendConfiguration]
    }
  }

  /**
    * Endpoint user specific custom userAttributes
    */
  @js.native
  trait EndpointUser extends js.Object {
    var UserAttributes: js.UndefOr[MapOfListOf__string]
    var UserId: js.UndefOr[__string]
  }

  object EndpointUser {
    def apply(
        UserAttributes: js.UndefOr[MapOfListOf__string] = js.undefined,
        UserId: js.UndefOr[__string] = js.undefined
    ): EndpointUser = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserAttributes" -> UserAttributes.map { x =>
          x.asInstanceOf[js.Any]
        },
        "UserId" -> UserId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EndpointUser]
    }
  }

  /**
    * List of endpoints
    */
  @js.native
  trait EndpointsResponse extends js.Object {
    var Item: js.UndefOr[ListOfEndpointResponse]
  }

  object EndpointsResponse {
    def apply(
        Item: js.UndefOr[ListOfEndpointResponse] = js.undefined
    ): EndpointsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Item" -> Item.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EndpointsResponse]
    }
  }

  /**
    * Model for creating or updating events.
    */
  @js.native
  trait Event extends js.Object {
    var AppPackageName: js.UndefOr[__string]
    var AppTitle: js.UndefOr[__string]
    var AppVersionCode: js.UndefOr[__string]
    var Attributes: js.UndefOr[MapOf__string]
    var ClientSdkVersion: js.UndefOr[__string]
    var EventType: js.UndefOr[__string]
    var Metrics: js.UndefOr[MapOf__double]
    var SdkName: js.UndefOr[__string]
    var Session: js.UndefOr[Session]
    var Timestamp: js.UndefOr[__string]
  }

  object Event {
    def apply(
        AppPackageName: js.UndefOr[__string] = js.undefined,
        AppTitle: js.UndefOr[__string] = js.undefined,
        AppVersionCode: js.UndefOr[__string] = js.undefined,
        Attributes: js.UndefOr[MapOf__string] = js.undefined,
        ClientSdkVersion: js.UndefOr[__string] = js.undefined,
        EventType: js.UndefOr[__string] = js.undefined,
        Metrics: js.UndefOr[MapOf__double] = js.undefined,
        SdkName: js.UndefOr[__string] = js.undefined,
        Session: js.UndefOr[Session] = js.undefined,
        Timestamp: js.UndefOr[__string] = js.undefined
    ): Event = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AppPackageName" -> AppPackageName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "AppTitle" -> AppTitle.map { x =>
          x.asInstanceOf[js.Any]
        },
        "AppVersionCode" -> AppVersionCode.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Attributes" -> Attributes.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ClientSdkVersion" -> ClientSdkVersion.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EventType" -> EventType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Metrics" -> Metrics.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SdkName" -> SdkName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Session" -> Session.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Timestamp" -> Timestamp.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Event]
    }
  }

  /**
    * Event dimensions.
    */
  @js.native
  trait EventDimensions extends js.Object {
    var Attributes: js.UndefOr[MapOfAttributeDimension]
    var EventType: js.UndefOr[SetDimension]
    var Metrics: js.UndefOr[MapOfMetricDimension]
  }

  object EventDimensions {
    def apply(
        Attributes: js.UndefOr[MapOfAttributeDimension] = js.undefined,
        EventType: js.UndefOr[SetDimension] = js.undefined,
        Metrics: js.UndefOr[MapOfMetricDimension] = js.undefined
    ): EventDimensions = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Attributes" -> Attributes.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EventType" -> EventType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Metrics" -> Metrics.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EventDimensions]
    }
  }

  /**
    * A complex object that holds the status code and message as a result of processing an event.
    */
  @js.native
  trait EventItemResponse extends js.Object {
    var Message: js.UndefOr[__string]
    var StatusCode: js.UndefOr[__integer]
  }

  object EventItemResponse {
    def apply(
        Message: js.UndefOr[__string] = js.undefined,
        StatusCode: js.UndefOr[__integer] = js.undefined
    ): EventItemResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Message" -> Message.map { x =>
          x.asInstanceOf[js.Any]
        },
        "StatusCode" -> StatusCode.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EventItemResponse]
    }
  }

  /**
    * Model for an event publishing subscription export.
    */
  @js.native
  trait EventStream extends js.Object {
    var ApplicationId: js.UndefOr[__string]
    var DestinationStreamArn: js.UndefOr[__string]
    var ExternalId: js.UndefOr[__string]
    var LastModifiedDate: js.UndefOr[__string]
    var LastUpdatedBy: js.UndefOr[__string]
    var RoleArn: js.UndefOr[__string]
  }

  object EventStream {
    def apply(
        ApplicationId: js.UndefOr[__string] = js.undefined,
        DestinationStreamArn: js.UndefOr[__string] = js.undefined,
        ExternalId: js.UndefOr[__string] = js.undefined,
        LastModifiedDate: js.UndefOr[__string] = js.undefined,
        LastUpdatedBy: js.UndefOr[__string] = js.undefined,
        RoleArn: js.UndefOr[__string] = js.undefined
    ): EventStream = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationId" -> ApplicationId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DestinationStreamArn" -> DestinationStreamArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ExternalId" -> ExternalId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LastModifiedDate" -> LastModifiedDate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LastUpdatedBy" -> LastUpdatedBy.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RoleArn" -> RoleArn.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EventStream]
    }
  }

  /**
    * A batch of PublicEndpoints and Events to process.
    */
  @js.native
  trait EventsBatch extends js.Object {
    var Endpoint: js.UndefOr[PublicEndpoint]
    var Events: js.UndefOr[MapOfEvent]
  }

  object EventsBatch {
    def apply(
        Endpoint: js.UndefOr[PublicEndpoint] = js.undefined,
        Events: js.UndefOr[MapOfEvent] = js.undefined
    ): EventsBatch = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Endpoint" -> Endpoint.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Events" -> Events.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EventsBatch]
    }
  }

  /**
    * A set of events to process.
    */
  @js.native
  trait EventsRequest extends js.Object {
    var BatchItem: js.UndefOr[MapOfEventsBatch]
  }

  object EventsRequest {
    def apply(
        BatchItem: js.UndefOr[MapOfEventsBatch] = js.undefined
    ): EventsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BatchItem" -> BatchItem.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EventsRequest]
    }
  }

  /**
    * Custom messages associated with events.
    */
  @js.native
  trait EventsResponse extends js.Object {
    var Results: js.UndefOr[MapOfItemResponse]
  }

  object EventsResponse {
    def apply(
        Results: js.UndefOr[MapOfItemResponse] = js.undefined
    ): EventsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Results" -> Results.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EventsResponse]
    }
  }

  /**
    * Export job request.
    */
  @js.native
  trait ExportJobRequest extends js.Object {
    var RoleArn: js.UndefOr[__string]
    var S3UrlPrefix: js.UndefOr[__string]
    var SegmentId: js.UndefOr[__string]
    var SegmentVersion: js.UndefOr[__integer]
  }

  object ExportJobRequest {
    def apply(
        RoleArn: js.UndefOr[__string] = js.undefined,
        S3UrlPrefix: js.UndefOr[__string] = js.undefined,
        SegmentId: js.UndefOr[__string] = js.undefined,
        SegmentVersion: js.UndefOr[__integer] = js.undefined
    ): ExportJobRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RoleArn" -> RoleArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "S3UrlPrefix" -> S3UrlPrefix.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SegmentId" -> SegmentId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SegmentVersion" -> SegmentVersion.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ExportJobRequest]
    }
  }

  /**
    * Export job resource.
    */
  @js.native
  trait ExportJobResource extends js.Object {
    var RoleArn: js.UndefOr[__string]
    var S3UrlPrefix: js.UndefOr[__string]
    var SegmentId: js.UndefOr[__string]
    var SegmentVersion: js.UndefOr[__integer]
  }

  object ExportJobResource {
    def apply(
        RoleArn: js.UndefOr[__string] = js.undefined,
        S3UrlPrefix: js.UndefOr[__string] = js.undefined,
        SegmentId: js.UndefOr[__string] = js.undefined,
        SegmentVersion: js.UndefOr[__integer] = js.undefined
    ): ExportJobResource = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RoleArn" -> RoleArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "S3UrlPrefix" -> S3UrlPrefix.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SegmentId" -> SegmentId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SegmentVersion" -> SegmentVersion.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ExportJobResource]
    }
  }

  /**
    * Export job response.
    */
  @js.native
  trait ExportJobResponse extends js.Object {
    var ApplicationId: js.UndefOr[__string]
    var CompletedPieces: js.UndefOr[__integer]
    var CompletionDate: js.UndefOr[__string]
    var CreationDate: js.UndefOr[__string]
    var Definition: js.UndefOr[ExportJobResource]
    var FailedPieces: js.UndefOr[__integer]
    var Failures: js.UndefOr[ListOf__string]
    var Id: js.UndefOr[__string]
    var JobStatus: js.UndefOr[JobStatus]
    var TotalFailures: js.UndefOr[__integer]
    var TotalPieces: js.UndefOr[__integer]
    var TotalProcessed: js.UndefOr[__integer]
    var Type: js.UndefOr[__string]
  }

  object ExportJobResponse {
    def apply(
        ApplicationId: js.UndefOr[__string] = js.undefined,
        CompletedPieces: js.UndefOr[__integer] = js.undefined,
        CompletionDate: js.UndefOr[__string] = js.undefined,
        CreationDate: js.UndefOr[__string] = js.undefined,
        Definition: js.UndefOr[ExportJobResource] = js.undefined,
        FailedPieces: js.UndefOr[__integer] = js.undefined,
        Failures: js.UndefOr[ListOf__string] = js.undefined,
        Id: js.UndefOr[__string] = js.undefined,
        JobStatus: js.UndefOr[JobStatus] = js.undefined,
        TotalFailures: js.UndefOr[__integer] = js.undefined,
        TotalPieces: js.UndefOr[__integer] = js.undefined,
        TotalProcessed: js.UndefOr[__integer] = js.undefined,
        Type: js.UndefOr[__string] = js.undefined
    ): ExportJobResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationId" -> ApplicationId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CompletedPieces" -> CompletedPieces.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CompletionDate" -> CompletionDate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CreationDate" -> CreationDate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Definition" -> Definition.map { x =>
          x.asInstanceOf[js.Any]
        },
        "FailedPieces" -> FailedPieces.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Failures" -> Failures.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Id" -> Id.map { x =>
          x.asInstanceOf[js.Any]
        },
        "JobStatus" -> JobStatus.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TotalFailures" -> TotalFailures.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TotalPieces" -> TotalPieces.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TotalProcessed" -> TotalProcessed.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Type" -> Type.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ExportJobResponse]
    }
  }

  /**
    * Export job list.
    */
  @js.native
  trait ExportJobsResponse extends js.Object {
    var Item: js.UndefOr[ListOfExportJobResponse]
    var NextToken: js.UndefOr[__string]
  }

  object ExportJobsResponse {
    def apply(
        Item: js.UndefOr[ListOfExportJobResponse] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): ExportJobsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Item" -> Item.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ExportJobsResponse]
    }
  }

  object FilterTypeEnum {
    val SYSTEM   = "SYSTEM"
    val ENDPOINT = "ENDPOINT"

    val values = IndexedSeq(SYSTEM, ENDPOINT)
  }

  object FormatEnum {
    val CSV  = "CSV"
    val JSON = "JSON"

    val values = IndexedSeq(CSV, JSON)
  }

  object FrequencyEnum {
    val ONCE    = "ONCE"
    val HOURLY  = "HOURLY"
    val DAILY   = "DAILY"
    val WEEKLY  = "WEEKLY"
    val MONTHLY = "MONTHLY"
    val EVENT   = "EVENT"

    val values = IndexedSeq(ONCE, HOURLY, DAILY, WEEKLY, MONTHLY, EVENT)
  }

  /**
    * Google Cloud Messaging credentials
    */
  @js.native
  trait GCMChannelRequest extends js.Object {
    var ApiKey: js.UndefOr[__string]
    var Enabled: js.UndefOr[__boolean]
  }

  object GCMChannelRequest {
    def apply(
        ApiKey: js.UndefOr[__string] = js.undefined,
        Enabled: js.UndefOr[__boolean] = js.undefined
    ): GCMChannelRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApiKey" -> ApiKey.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Enabled" -> Enabled.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GCMChannelRequest]
    }
  }

  /**
    * Google Cloud Messaging channel definition
    */
  @js.native
  trait GCMChannelResponse extends js.Object {
    var ApplicationId: js.UndefOr[__string]
    var CreationDate: js.UndefOr[__string]
    var Credential: js.UndefOr[__string]
    var Enabled: js.UndefOr[__boolean]
    var HasCredential: js.UndefOr[__boolean]
    var Id: js.UndefOr[__string]
    var IsArchived: js.UndefOr[__boolean]
    var LastModifiedBy: js.UndefOr[__string]
    var LastModifiedDate: js.UndefOr[__string]
    var Platform: js.UndefOr[__string]
    var Version: js.UndefOr[__integer]
  }

  object GCMChannelResponse {
    def apply(
        ApplicationId: js.UndefOr[__string] = js.undefined,
        CreationDate: js.UndefOr[__string] = js.undefined,
        Credential: js.UndefOr[__string] = js.undefined,
        Enabled: js.UndefOr[__boolean] = js.undefined,
        HasCredential: js.UndefOr[__boolean] = js.undefined,
        Id: js.UndefOr[__string] = js.undefined,
        IsArchived: js.UndefOr[__boolean] = js.undefined,
        LastModifiedBy: js.UndefOr[__string] = js.undefined,
        LastModifiedDate: js.UndefOr[__string] = js.undefined,
        Platform: js.UndefOr[__string] = js.undefined,
        Version: js.UndefOr[__integer] = js.undefined
    ): GCMChannelResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationId" -> ApplicationId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CreationDate" -> CreationDate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Credential" -> Credential.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Enabled" -> Enabled.map { x =>
          x.asInstanceOf[js.Any]
        },
        "HasCredential" -> HasCredential.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Id" -> Id.map { x =>
          x.asInstanceOf[js.Any]
        },
        "IsArchived" -> IsArchived.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LastModifiedBy" -> LastModifiedBy.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LastModifiedDate" -> LastModifiedDate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Platform" -> Platform.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Version" -> Version.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GCMChannelResponse]
    }
  }

  /**
    * GCM Message.
    */
  @js.native
  trait GCMMessage extends js.Object {
    var Action: js.UndefOr[Action]
    var Body: js.UndefOr[__string]
    var CollapseKey: js.UndefOr[__string]
    var Data: js.UndefOr[MapOf__string]
    var IconReference: js.UndefOr[__string]
    var ImageIconUrl: js.UndefOr[__string]
    var ImageUrl: js.UndefOr[__string]
    var Priority: js.UndefOr[__string]
    var RawContent: js.UndefOr[__string]
    var RestrictedPackageName: js.UndefOr[__string]
    var SilentPush: js.UndefOr[__boolean]
    var SmallImageIconUrl: js.UndefOr[__string]
    var Sound: js.UndefOr[__string]
    var Substitutions: js.UndefOr[MapOfListOf__string]
    var TimeToLive: js.UndefOr[__integer]
    var Title: js.UndefOr[__string]
    var Url: js.UndefOr[__string]
  }

  object GCMMessage {
    def apply(
        Action: js.UndefOr[Action] = js.undefined,
        Body: js.UndefOr[__string] = js.undefined,
        CollapseKey: js.UndefOr[__string] = js.undefined,
        Data: js.UndefOr[MapOf__string] = js.undefined,
        IconReference: js.UndefOr[__string] = js.undefined,
        ImageIconUrl: js.UndefOr[__string] = js.undefined,
        ImageUrl: js.UndefOr[__string] = js.undefined,
        Priority: js.UndefOr[__string] = js.undefined,
        RawContent: js.UndefOr[__string] = js.undefined,
        RestrictedPackageName: js.UndefOr[__string] = js.undefined,
        SilentPush: js.UndefOr[__boolean] = js.undefined,
        SmallImageIconUrl: js.UndefOr[__string] = js.undefined,
        Sound: js.UndefOr[__string] = js.undefined,
        Substitutions: js.UndefOr[MapOfListOf__string] = js.undefined,
        TimeToLive: js.UndefOr[__integer] = js.undefined,
        Title: js.UndefOr[__string] = js.undefined,
        Url: js.UndefOr[__string] = js.undefined
    ): GCMMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Action" -> Action.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Body" -> Body.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CollapseKey" -> CollapseKey.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Data" -> Data.map { x =>
          x.asInstanceOf[js.Any]
        },
        "IconReference" -> IconReference.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ImageIconUrl" -> ImageIconUrl.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ImageUrl" -> ImageUrl.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Priority" -> Priority.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RawContent" -> RawContent.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RestrictedPackageName" -> RestrictedPackageName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SilentPush" -> SilentPush.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SmallImageIconUrl" -> SmallImageIconUrl.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Sound" -> Sound.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Substitutions" -> Substitutions.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TimeToLive" -> TimeToLive.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Title" -> Title.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Url" -> Url.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GCMMessage]
    }
  }

  /**
    * GPS coordinates
    */
  @js.native
  trait GPSCoordinates extends js.Object {
    var Latitude: js.UndefOr[__double]
    var Longitude: js.UndefOr[__double]
  }

  object GPSCoordinates {
    def apply(
        Latitude: js.UndefOr[__double] = js.undefined,
        Longitude: js.UndefOr[__double] = js.undefined
    ): GPSCoordinates = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Latitude" -> Latitude.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Longitude" -> Longitude.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GPSCoordinates]
    }
  }

  /**
    * GPS point location dimension
    */
  @js.native
  trait GPSPointDimension extends js.Object {
    var Coordinates: js.UndefOr[GPSCoordinates]
    var RangeInKilometers: js.UndefOr[__double]
  }

  object GPSPointDimension {
    def apply(
        Coordinates: js.UndefOr[GPSCoordinates] = js.undefined,
        RangeInKilometers: js.UndefOr[__double] = js.undefined
    ): GPSPointDimension = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Coordinates" -> Coordinates.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RangeInKilometers" -> RangeInKilometers.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GPSPointDimension]
    }
  }

  @js.native
  trait GetAdmChannelRequest extends js.Object {
    var ApplicationId: __string
  }

  object GetAdmChannelRequest {
    def apply(
        ApplicationId: __string
    ): GetAdmChannelRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetAdmChannelRequest]
    }
  }

  @js.native
  trait GetAdmChannelResponse extends js.Object {
    var ADMChannelResponse: ADMChannelResponse
  }

  object GetAdmChannelResponse {
    def apply(
        ADMChannelResponse: ADMChannelResponse
    ): GetAdmChannelResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ADMChannelResponse" -> ADMChannelResponse.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetAdmChannelResponse]
    }
  }

  @js.native
  trait GetApnsChannelRequest extends js.Object {
    var ApplicationId: __string
  }

  object GetApnsChannelRequest {
    def apply(
        ApplicationId: __string
    ): GetApnsChannelRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetApnsChannelRequest]
    }
  }

  @js.native
  trait GetApnsChannelResponse extends js.Object {
    var APNSChannelResponse: APNSChannelResponse
  }

  object GetApnsChannelResponse {
    def apply(
        APNSChannelResponse: APNSChannelResponse
    ): GetApnsChannelResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "APNSChannelResponse" -> APNSChannelResponse.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetApnsChannelResponse]
    }
  }

  @js.native
  trait GetApnsSandboxChannelRequest extends js.Object {
    var ApplicationId: __string
  }

  object GetApnsSandboxChannelRequest {
    def apply(
        ApplicationId: __string
    ): GetApnsSandboxChannelRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetApnsSandboxChannelRequest]
    }
  }

  @js.native
  trait GetApnsSandboxChannelResponse extends js.Object {
    var APNSSandboxChannelResponse: APNSSandboxChannelResponse
  }

  object GetApnsSandboxChannelResponse {
    def apply(
        APNSSandboxChannelResponse: APNSSandboxChannelResponse
    ): GetApnsSandboxChannelResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "APNSSandboxChannelResponse" -> APNSSandboxChannelResponse.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetApnsSandboxChannelResponse]
    }
  }

  @js.native
  trait GetApnsVoipChannelRequest extends js.Object {
    var ApplicationId: __string
  }

  object GetApnsVoipChannelRequest {
    def apply(
        ApplicationId: __string
    ): GetApnsVoipChannelRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetApnsVoipChannelRequest]
    }
  }

  @js.native
  trait GetApnsVoipChannelResponse extends js.Object {
    var APNSVoipChannelResponse: APNSVoipChannelResponse
  }

  object GetApnsVoipChannelResponse {
    def apply(
        APNSVoipChannelResponse: APNSVoipChannelResponse
    ): GetApnsVoipChannelResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "APNSVoipChannelResponse" -> APNSVoipChannelResponse.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetApnsVoipChannelResponse]
    }
  }

  @js.native
  trait GetApnsVoipSandboxChannelRequest extends js.Object {
    var ApplicationId: __string
  }

  object GetApnsVoipSandboxChannelRequest {
    def apply(
        ApplicationId: __string
    ): GetApnsVoipSandboxChannelRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetApnsVoipSandboxChannelRequest]
    }
  }

  @js.native
  trait GetApnsVoipSandboxChannelResponse extends js.Object {
    var APNSVoipSandboxChannelResponse: APNSVoipSandboxChannelResponse
  }

  object GetApnsVoipSandboxChannelResponse {
    def apply(
        APNSVoipSandboxChannelResponse: APNSVoipSandboxChannelResponse
    ): GetApnsVoipSandboxChannelResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "APNSVoipSandboxChannelResponse" -> APNSVoipSandboxChannelResponse.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetApnsVoipSandboxChannelResponse]
    }
  }

  @js.native
  trait GetAppRequest extends js.Object {
    var ApplicationId: __string
  }

  object GetAppRequest {
    def apply(
        ApplicationId: __string
    ): GetAppRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetAppRequest]
    }
  }

  @js.native
  trait GetAppResponse extends js.Object {
    var ApplicationResponse: ApplicationResponse
  }

  object GetAppResponse {
    def apply(
        ApplicationResponse: ApplicationResponse
    ): GetAppResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationResponse" -> ApplicationResponse.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetAppResponse]
    }
  }

  @js.native
  trait GetApplicationSettingsRequest extends js.Object {
    var ApplicationId: __string
  }

  object GetApplicationSettingsRequest {
    def apply(
        ApplicationId: __string
    ): GetApplicationSettingsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetApplicationSettingsRequest]
    }
  }

  @js.native
  trait GetApplicationSettingsResponse extends js.Object {
    var ApplicationSettingsResource: ApplicationSettingsResource
  }

  object GetApplicationSettingsResponse {
    def apply(
        ApplicationSettingsResource: ApplicationSettingsResource
    ): GetApplicationSettingsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationSettingsResource" -> ApplicationSettingsResource.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetApplicationSettingsResponse]
    }
  }

  @js.native
  trait GetAppsRequest extends js.Object {
    var PageSize: js.UndefOr[__string]
    var Token: js.UndefOr[__string]
  }

  object GetAppsRequest {
    def apply(
        PageSize: js.UndefOr[__string] = js.undefined,
        Token: js.UndefOr[__string] = js.undefined
    ): GetAppsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PageSize" -> PageSize.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Token" -> Token.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetAppsRequest]
    }
  }

  @js.native
  trait GetAppsResponse extends js.Object {
    var ApplicationsResponse: ApplicationsResponse
  }

  object GetAppsResponse {
    def apply(
        ApplicationsResponse: ApplicationsResponse
    ): GetAppsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationsResponse" -> ApplicationsResponse.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetAppsResponse]
    }
  }

  @js.native
  trait GetBaiduChannelRequest extends js.Object {
    var ApplicationId: __string
  }

  object GetBaiduChannelRequest {
    def apply(
        ApplicationId: __string
    ): GetBaiduChannelRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetBaiduChannelRequest]
    }
  }

  @js.native
  trait GetBaiduChannelResponse extends js.Object {
    var BaiduChannelResponse: BaiduChannelResponse
  }

  object GetBaiduChannelResponse {
    def apply(
        BaiduChannelResponse: BaiduChannelResponse
    ): GetBaiduChannelResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BaiduChannelResponse" -> BaiduChannelResponse.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetBaiduChannelResponse]
    }
  }

  @js.native
  trait GetCampaignActivitiesRequest extends js.Object {
    var ApplicationId: __string
    var CampaignId: __string
    var PageSize: js.UndefOr[__string]
    var Token: js.UndefOr[__string]
  }

  object GetCampaignActivitiesRequest {
    def apply(
        ApplicationId: __string,
        CampaignId: __string,
        PageSize: js.UndefOr[__string] = js.undefined,
        Token: js.UndefOr[__string] = js.undefined
    ): GetCampaignActivitiesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any],
        "CampaignId"    -> CampaignId.asInstanceOf[js.Any],
        "PageSize" -> PageSize.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Token" -> Token.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetCampaignActivitiesRequest]
    }
  }

  @js.native
  trait GetCampaignActivitiesResponse extends js.Object {
    var ActivitiesResponse: ActivitiesResponse
  }

  object GetCampaignActivitiesResponse {
    def apply(
        ActivitiesResponse: ActivitiesResponse
    ): GetCampaignActivitiesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ActivitiesResponse" -> ActivitiesResponse.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetCampaignActivitiesResponse]
    }
  }

  @js.native
  trait GetCampaignRequest extends js.Object {
    var ApplicationId: __string
    var CampaignId: __string
  }

  object GetCampaignRequest {
    def apply(
        ApplicationId: __string,
        CampaignId: __string
    ): GetCampaignRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any],
        "CampaignId"    -> CampaignId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetCampaignRequest]
    }
  }

  @js.native
  trait GetCampaignResponse extends js.Object {
    var CampaignResponse: CampaignResponse
  }

  object GetCampaignResponse {
    def apply(
        CampaignResponse: CampaignResponse
    ): GetCampaignResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CampaignResponse" -> CampaignResponse.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetCampaignResponse]
    }
  }

  @js.native
  trait GetCampaignVersionRequest extends js.Object {
    var ApplicationId: __string
    var CampaignId: __string
    var Version: __string
  }

  object GetCampaignVersionRequest {
    def apply(
        ApplicationId: __string,
        CampaignId: __string,
        Version: __string
    ): GetCampaignVersionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any],
        "CampaignId"    -> CampaignId.asInstanceOf[js.Any],
        "Version"       -> Version.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetCampaignVersionRequest]
    }
  }

  @js.native
  trait GetCampaignVersionResponse extends js.Object {
    var CampaignResponse: CampaignResponse
  }

  object GetCampaignVersionResponse {
    def apply(
        CampaignResponse: CampaignResponse
    ): GetCampaignVersionResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CampaignResponse" -> CampaignResponse.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetCampaignVersionResponse]
    }
  }

  @js.native
  trait GetCampaignVersionsRequest extends js.Object {
    var ApplicationId: __string
    var CampaignId: __string
    var PageSize: js.UndefOr[__string]
    var Token: js.UndefOr[__string]
  }

  object GetCampaignVersionsRequest {
    def apply(
        ApplicationId: __string,
        CampaignId: __string,
        PageSize: js.UndefOr[__string] = js.undefined,
        Token: js.UndefOr[__string] = js.undefined
    ): GetCampaignVersionsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any],
        "CampaignId"    -> CampaignId.asInstanceOf[js.Any],
        "PageSize" -> PageSize.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Token" -> Token.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetCampaignVersionsRequest]
    }
  }

  @js.native
  trait GetCampaignVersionsResponse extends js.Object {
    var CampaignsResponse: CampaignsResponse
  }

  object GetCampaignVersionsResponse {
    def apply(
        CampaignsResponse: CampaignsResponse
    ): GetCampaignVersionsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CampaignsResponse" -> CampaignsResponse.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetCampaignVersionsResponse]
    }
  }

  @js.native
  trait GetCampaignsRequest extends js.Object {
    var ApplicationId: __string
    var PageSize: js.UndefOr[__string]
    var Token: js.UndefOr[__string]
  }

  object GetCampaignsRequest {
    def apply(
        ApplicationId: __string,
        PageSize: js.UndefOr[__string] = js.undefined,
        Token: js.UndefOr[__string] = js.undefined
    ): GetCampaignsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any],
        "PageSize" -> PageSize.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Token" -> Token.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetCampaignsRequest]
    }
  }

  @js.native
  trait GetCampaignsResponse extends js.Object {
    var CampaignsResponse: CampaignsResponse
  }

  object GetCampaignsResponse {
    def apply(
        CampaignsResponse: CampaignsResponse
    ): GetCampaignsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CampaignsResponse" -> CampaignsResponse.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetCampaignsResponse]
    }
  }

  @js.native
  trait GetChannelsRequest extends js.Object {
    var ApplicationId: __string
  }

  object GetChannelsRequest {
    def apply(
        ApplicationId: __string
    ): GetChannelsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetChannelsRequest]
    }
  }

  @js.native
  trait GetChannelsResponse extends js.Object {
    var ChannelsResponse: ChannelsResponse
  }

  object GetChannelsResponse {
    def apply(
        ChannelsResponse: ChannelsResponse
    ): GetChannelsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ChannelsResponse" -> ChannelsResponse.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetChannelsResponse]
    }
  }

  @js.native
  trait GetEmailChannelRequest extends js.Object {
    var ApplicationId: __string
  }

  object GetEmailChannelRequest {
    def apply(
        ApplicationId: __string
    ): GetEmailChannelRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetEmailChannelRequest]
    }
  }

  @js.native
  trait GetEmailChannelResponse extends js.Object {
    var EmailChannelResponse: EmailChannelResponse
  }

  object GetEmailChannelResponse {
    def apply(
        EmailChannelResponse: EmailChannelResponse
    ): GetEmailChannelResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EmailChannelResponse" -> EmailChannelResponse.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetEmailChannelResponse]
    }
  }

  @js.native
  trait GetEndpointRequest extends js.Object {
    var ApplicationId: __string
    var EndpointId: __string
  }

  object GetEndpointRequest {
    def apply(
        ApplicationId: __string,
        EndpointId: __string
    ): GetEndpointRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any],
        "EndpointId"    -> EndpointId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetEndpointRequest]
    }
  }

  @js.native
  trait GetEndpointResponse extends js.Object {
    var EndpointResponse: EndpointResponse
  }

  object GetEndpointResponse {
    def apply(
        EndpointResponse: EndpointResponse
    ): GetEndpointResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EndpointResponse" -> EndpointResponse.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetEndpointResponse]
    }
  }

  @js.native
  trait GetEventStreamRequest extends js.Object {
    var ApplicationId: __string
  }

  object GetEventStreamRequest {
    def apply(
        ApplicationId: __string
    ): GetEventStreamRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetEventStreamRequest]
    }
  }

  @js.native
  trait GetEventStreamResponse extends js.Object {
    var EventStream: EventStream
  }

  object GetEventStreamResponse {
    def apply(
        EventStream: EventStream
    ): GetEventStreamResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EventStream" -> EventStream.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetEventStreamResponse]
    }
  }

  @js.native
  trait GetExportJobRequest extends js.Object {
    var ApplicationId: __string
    var JobId: __string
  }

  object GetExportJobRequest {
    def apply(
        ApplicationId: __string,
        JobId: __string
    ): GetExportJobRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any],
        "JobId"         -> JobId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetExportJobRequest]
    }
  }

  @js.native
  trait GetExportJobResponse extends js.Object {
    var ExportJobResponse: ExportJobResponse
  }

  object GetExportJobResponse {
    def apply(
        ExportJobResponse: ExportJobResponse
    ): GetExportJobResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ExportJobResponse" -> ExportJobResponse.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetExportJobResponse]
    }
  }

  @js.native
  trait GetExportJobsRequest extends js.Object {
    var ApplicationId: __string
    var PageSize: js.UndefOr[__string]
    var Token: js.UndefOr[__string]
  }

  object GetExportJobsRequest {
    def apply(
        ApplicationId: __string,
        PageSize: js.UndefOr[__string] = js.undefined,
        Token: js.UndefOr[__string] = js.undefined
    ): GetExportJobsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any],
        "PageSize" -> PageSize.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Token" -> Token.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetExportJobsRequest]
    }
  }

  @js.native
  trait GetExportJobsResponse extends js.Object {
    var ExportJobsResponse: ExportJobsResponse
  }

  object GetExportJobsResponse {
    def apply(
        ExportJobsResponse: ExportJobsResponse
    ): GetExportJobsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ExportJobsResponse" -> ExportJobsResponse.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetExportJobsResponse]
    }
  }

  @js.native
  trait GetGcmChannelRequest extends js.Object {
    var ApplicationId: __string
  }

  object GetGcmChannelRequest {
    def apply(
        ApplicationId: __string
    ): GetGcmChannelRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetGcmChannelRequest]
    }
  }

  @js.native
  trait GetGcmChannelResponse extends js.Object {
    var GCMChannelResponse: GCMChannelResponse
  }

  object GetGcmChannelResponse {
    def apply(
        GCMChannelResponse: GCMChannelResponse
    ): GetGcmChannelResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GCMChannelResponse" -> GCMChannelResponse.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetGcmChannelResponse]
    }
  }

  @js.native
  trait GetImportJobRequest extends js.Object {
    var ApplicationId: __string
    var JobId: __string
  }

  object GetImportJobRequest {
    def apply(
        ApplicationId: __string,
        JobId: __string
    ): GetImportJobRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any],
        "JobId"         -> JobId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetImportJobRequest]
    }
  }

  @js.native
  trait GetImportJobResponse extends js.Object {
    var ImportJobResponse: ImportJobResponse
  }

  object GetImportJobResponse {
    def apply(
        ImportJobResponse: ImportJobResponse
    ): GetImportJobResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ImportJobResponse" -> ImportJobResponse.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetImportJobResponse]
    }
  }

  @js.native
  trait GetImportJobsRequest extends js.Object {
    var ApplicationId: __string
    var PageSize: js.UndefOr[__string]
    var Token: js.UndefOr[__string]
  }

  object GetImportJobsRequest {
    def apply(
        ApplicationId: __string,
        PageSize: js.UndefOr[__string] = js.undefined,
        Token: js.UndefOr[__string] = js.undefined
    ): GetImportJobsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any],
        "PageSize" -> PageSize.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Token" -> Token.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetImportJobsRequest]
    }
  }

  @js.native
  trait GetImportJobsResponse extends js.Object {
    var ImportJobsResponse: ImportJobsResponse
  }

  object GetImportJobsResponse {
    def apply(
        ImportJobsResponse: ImportJobsResponse
    ): GetImportJobsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ImportJobsResponse" -> ImportJobsResponse.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetImportJobsResponse]
    }
  }

  @js.native
  trait GetSegmentExportJobsRequest extends js.Object {
    var ApplicationId: __string
    var SegmentId: __string
    var PageSize: js.UndefOr[__string]
    var Token: js.UndefOr[__string]
  }

  object GetSegmentExportJobsRequest {
    def apply(
        ApplicationId: __string,
        SegmentId: __string,
        PageSize: js.UndefOr[__string] = js.undefined,
        Token: js.UndefOr[__string] = js.undefined
    ): GetSegmentExportJobsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any],
        "SegmentId"     -> SegmentId.asInstanceOf[js.Any],
        "PageSize" -> PageSize.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Token" -> Token.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetSegmentExportJobsRequest]
    }
  }

  @js.native
  trait GetSegmentExportJobsResponse extends js.Object {
    var ExportJobsResponse: ExportJobsResponse
  }

  object GetSegmentExportJobsResponse {
    def apply(
        ExportJobsResponse: ExportJobsResponse
    ): GetSegmentExportJobsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ExportJobsResponse" -> ExportJobsResponse.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetSegmentExportJobsResponse]
    }
  }

  @js.native
  trait GetSegmentImportJobsRequest extends js.Object {
    var ApplicationId: __string
    var SegmentId: __string
    var PageSize: js.UndefOr[__string]
    var Token: js.UndefOr[__string]
  }

  object GetSegmentImportJobsRequest {
    def apply(
        ApplicationId: __string,
        SegmentId: __string,
        PageSize: js.UndefOr[__string] = js.undefined,
        Token: js.UndefOr[__string] = js.undefined
    ): GetSegmentImportJobsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any],
        "SegmentId"     -> SegmentId.asInstanceOf[js.Any],
        "PageSize" -> PageSize.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Token" -> Token.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetSegmentImportJobsRequest]
    }
  }

  @js.native
  trait GetSegmentImportJobsResponse extends js.Object {
    var ImportJobsResponse: ImportJobsResponse
  }

  object GetSegmentImportJobsResponse {
    def apply(
        ImportJobsResponse: ImportJobsResponse
    ): GetSegmentImportJobsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ImportJobsResponse" -> ImportJobsResponse.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetSegmentImportJobsResponse]
    }
  }

  @js.native
  trait GetSegmentRequest extends js.Object {
    var ApplicationId: __string
    var SegmentId: __string
  }

  object GetSegmentRequest {
    def apply(
        ApplicationId: __string,
        SegmentId: __string
    ): GetSegmentRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any],
        "SegmentId"     -> SegmentId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetSegmentRequest]
    }
  }

  @js.native
  trait GetSegmentResponse extends js.Object {
    var SegmentResponse: SegmentResponse
  }

  object GetSegmentResponse {
    def apply(
        SegmentResponse: SegmentResponse
    ): GetSegmentResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SegmentResponse" -> SegmentResponse.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetSegmentResponse]
    }
  }

  @js.native
  trait GetSegmentVersionRequest extends js.Object {
    var ApplicationId: __string
    var SegmentId: __string
    var Version: __string
  }

  object GetSegmentVersionRequest {
    def apply(
        ApplicationId: __string,
        SegmentId: __string,
        Version: __string
    ): GetSegmentVersionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any],
        "SegmentId"     -> SegmentId.asInstanceOf[js.Any],
        "Version"       -> Version.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetSegmentVersionRequest]
    }
  }

  @js.native
  trait GetSegmentVersionResponse extends js.Object {
    var SegmentResponse: SegmentResponse
  }

  object GetSegmentVersionResponse {
    def apply(
        SegmentResponse: SegmentResponse
    ): GetSegmentVersionResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SegmentResponse" -> SegmentResponse.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetSegmentVersionResponse]
    }
  }

  @js.native
  trait GetSegmentVersionsRequest extends js.Object {
    var ApplicationId: __string
    var SegmentId: __string
    var PageSize: js.UndefOr[__string]
    var Token: js.UndefOr[__string]
  }

  object GetSegmentVersionsRequest {
    def apply(
        ApplicationId: __string,
        SegmentId: __string,
        PageSize: js.UndefOr[__string] = js.undefined,
        Token: js.UndefOr[__string] = js.undefined
    ): GetSegmentVersionsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any],
        "SegmentId"     -> SegmentId.asInstanceOf[js.Any],
        "PageSize" -> PageSize.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Token" -> Token.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetSegmentVersionsRequest]
    }
  }

  @js.native
  trait GetSegmentVersionsResponse extends js.Object {
    var SegmentsResponse: SegmentsResponse
  }

  object GetSegmentVersionsResponse {
    def apply(
        SegmentsResponse: SegmentsResponse
    ): GetSegmentVersionsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SegmentsResponse" -> SegmentsResponse.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetSegmentVersionsResponse]
    }
  }

  @js.native
  trait GetSegmentsRequest extends js.Object {
    var ApplicationId: __string
    var PageSize: js.UndefOr[__string]
    var Token: js.UndefOr[__string]
  }

  object GetSegmentsRequest {
    def apply(
        ApplicationId: __string,
        PageSize: js.UndefOr[__string] = js.undefined,
        Token: js.UndefOr[__string] = js.undefined
    ): GetSegmentsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any],
        "PageSize" -> PageSize.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Token" -> Token.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetSegmentsRequest]
    }
  }

  @js.native
  trait GetSegmentsResponse extends js.Object {
    var SegmentsResponse: SegmentsResponse
  }

  object GetSegmentsResponse {
    def apply(
        SegmentsResponse: SegmentsResponse
    ): GetSegmentsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SegmentsResponse" -> SegmentsResponse.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetSegmentsResponse]
    }
  }

  @js.native
  trait GetSmsChannelRequest extends js.Object {
    var ApplicationId: __string
  }

  object GetSmsChannelRequest {
    def apply(
        ApplicationId: __string
    ): GetSmsChannelRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetSmsChannelRequest]
    }
  }

  @js.native
  trait GetSmsChannelResponse extends js.Object {
    var SMSChannelResponse: SMSChannelResponse
  }

  object GetSmsChannelResponse {
    def apply(
        SMSChannelResponse: SMSChannelResponse
    ): GetSmsChannelResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SMSChannelResponse" -> SMSChannelResponse.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetSmsChannelResponse]
    }
  }

  @js.native
  trait GetUserEndpointsRequest extends js.Object {
    var ApplicationId: __string
    var UserId: __string
  }

  object GetUserEndpointsRequest {
    def apply(
        ApplicationId: __string,
        UserId: __string
    ): GetUserEndpointsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any],
        "UserId"        -> UserId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetUserEndpointsRequest]
    }
  }

  @js.native
  trait GetUserEndpointsResponse extends js.Object {
    var EndpointsResponse: EndpointsResponse
  }

  object GetUserEndpointsResponse {
    def apply(
        EndpointsResponse: EndpointsResponse
    ): GetUserEndpointsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EndpointsResponse" -> EndpointsResponse.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetUserEndpointsResponse]
    }
  }

  @js.native
  trait GetVoiceChannelRequest extends js.Object {
    var ApplicationId: __string
  }

  object GetVoiceChannelRequest {
    def apply(
        ApplicationId: __string
    ): GetVoiceChannelRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetVoiceChannelRequest]
    }
  }

  @js.native
  trait GetVoiceChannelResponse extends js.Object {
    var VoiceChannelResponse: VoiceChannelResponse
  }

  object GetVoiceChannelResponse {
    def apply(
        VoiceChannelResponse: VoiceChannelResponse
    ): GetVoiceChannelResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "VoiceChannelResponse" -> VoiceChannelResponse.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetVoiceChannelResponse]
    }
  }

  /**
    * Import job request.
    */
  @js.native
  trait ImportJobRequest extends js.Object {
    var DefineSegment: js.UndefOr[__boolean]
    var ExternalId: js.UndefOr[__string]
    var Format: js.UndefOr[Format]
    var RegisterEndpoints: js.UndefOr[__boolean]
    var RoleArn: js.UndefOr[__string]
    var S3Url: js.UndefOr[__string]
    var SegmentId: js.UndefOr[__string]
    var SegmentName: js.UndefOr[__string]
  }

  object ImportJobRequest {
    def apply(
        DefineSegment: js.UndefOr[__boolean] = js.undefined,
        ExternalId: js.UndefOr[__string] = js.undefined,
        Format: js.UndefOr[Format] = js.undefined,
        RegisterEndpoints: js.UndefOr[__boolean] = js.undefined,
        RoleArn: js.UndefOr[__string] = js.undefined,
        S3Url: js.UndefOr[__string] = js.undefined,
        SegmentId: js.UndefOr[__string] = js.undefined,
        SegmentName: js.UndefOr[__string] = js.undefined
    ): ImportJobRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DefineSegment" -> DefineSegment.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ExternalId" -> ExternalId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Format" -> Format.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RegisterEndpoints" -> RegisterEndpoints.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RoleArn" -> RoleArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "S3Url" -> S3Url.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SegmentId" -> SegmentId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SegmentName" -> SegmentName.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ImportJobRequest]
    }
  }

  /**
    * Import job resource
    */
  @js.native
  trait ImportJobResource extends js.Object {
    var DefineSegment: js.UndefOr[__boolean]
    var ExternalId: js.UndefOr[__string]
    var Format: js.UndefOr[Format]
    var RegisterEndpoints: js.UndefOr[__boolean]
    var RoleArn: js.UndefOr[__string]
    var S3Url: js.UndefOr[__string]
    var SegmentId: js.UndefOr[__string]
    var SegmentName: js.UndefOr[__string]
  }

  object ImportJobResource {
    def apply(
        DefineSegment: js.UndefOr[__boolean] = js.undefined,
        ExternalId: js.UndefOr[__string] = js.undefined,
        Format: js.UndefOr[Format] = js.undefined,
        RegisterEndpoints: js.UndefOr[__boolean] = js.undefined,
        RoleArn: js.UndefOr[__string] = js.undefined,
        S3Url: js.UndefOr[__string] = js.undefined,
        SegmentId: js.UndefOr[__string] = js.undefined,
        SegmentName: js.UndefOr[__string] = js.undefined
    ): ImportJobResource = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DefineSegment" -> DefineSegment.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ExternalId" -> ExternalId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Format" -> Format.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RegisterEndpoints" -> RegisterEndpoints.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RoleArn" -> RoleArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "S3Url" -> S3Url.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SegmentId" -> SegmentId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SegmentName" -> SegmentName.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ImportJobResource]
    }
  }

  /**
    * Import job response.
    */
  @js.native
  trait ImportJobResponse extends js.Object {
    var ApplicationId: js.UndefOr[__string]
    var CompletedPieces: js.UndefOr[__integer]
    var CompletionDate: js.UndefOr[__string]
    var CreationDate: js.UndefOr[__string]
    var Definition: js.UndefOr[ImportJobResource]
    var FailedPieces: js.UndefOr[__integer]
    var Failures: js.UndefOr[ListOf__string]
    var Id: js.UndefOr[__string]
    var JobStatus: js.UndefOr[JobStatus]
    var TotalFailures: js.UndefOr[__integer]
    var TotalPieces: js.UndefOr[__integer]
    var TotalProcessed: js.UndefOr[__integer]
    var Type: js.UndefOr[__string]
  }

  object ImportJobResponse {
    def apply(
        ApplicationId: js.UndefOr[__string] = js.undefined,
        CompletedPieces: js.UndefOr[__integer] = js.undefined,
        CompletionDate: js.UndefOr[__string] = js.undefined,
        CreationDate: js.UndefOr[__string] = js.undefined,
        Definition: js.UndefOr[ImportJobResource] = js.undefined,
        FailedPieces: js.UndefOr[__integer] = js.undefined,
        Failures: js.UndefOr[ListOf__string] = js.undefined,
        Id: js.UndefOr[__string] = js.undefined,
        JobStatus: js.UndefOr[JobStatus] = js.undefined,
        TotalFailures: js.UndefOr[__integer] = js.undefined,
        TotalPieces: js.UndefOr[__integer] = js.undefined,
        TotalProcessed: js.UndefOr[__integer] = js.undefined,
        Type: js.UndefOr[__string] = js.undefined
    ): ImportJobResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationId" -> ApplicationId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CompletedPieces" -> CompletedPieces.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CompletionDate" -> CompletionDate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CreationDate" -> CreationDate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Definition" -> Definition.map { x =>
          x.asInstanceOf[js.Any]
        },
        "FailedPieces" -> FailedPieces.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Failures" -> Failures.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Id" -> Id.map { x =>
          x.asInstanceOf[js.Any]
        },
        "JobStatus" -> JobStatus.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TotalFailures" -> TotalFailures.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TotalPieces" -> TotalPieces.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TotalProcessed" -> TotalProcessed.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Type" -> Type.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ImportJobResponse]
    }
  }

  /**
    * Import job list.
    */
  @js.native
  trait ImportJobsResponse extends js.Object {
    var Item: js.UndefOr[ListOfImportJobResponse]
    var NextToken: js.UndefOr[__string]
  }

  object ImportJobsResponse {
    def apply(
        Item: js.UndefOr[ListOfImportJobResponse] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): ImportJobsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Item" -> Item.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ImportJobsResponse]
    }
  }

  object IncludeEnum {
    val ALL  = "ALL"
    val ANY  = "ANY"
    val NONE = "NONE"

    val values = IndexedSeq(ALL, ANY, NONE)
  }

  /**
    * The response that's provided after registering the endpoint.
    */
  @js.native
  trait ItemResponse extends js.Object {
    var EndpointItemResponse: js.UndefOr[EndpointItemResponse]
    var EventsItemResponse: js.UndefOr[MapOfEventItemResponse]
  }

  object ItemResponse {
    def apply(
        EndpointItemResponse: js.UndefOr[EndpointItemResponse] = js.undefined,
        EventsItemResponse: js.UndefOr[MapOfEventItemResponse] = js.undefined
    ): ItemResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EndpointItemResponse" -> EndpointItemResponse.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EventsItemResponse" -> EventsItemResponse.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ItemResponse]
    }
  }

  object JobStatusEnum {
    val CREATED      = "CREATED"
    val INITIALIZING = "INITIALIZING"
    val PROCESSING   = "PROCESSING"
    val COMPLETING   = "COMPLETING"
    val COMPLETED    = "COMPLETED"
    val FAILING      = "FAILING"
    val FAILED       = "FAILED"

    val values = IndexedSeq(CREATED, INITIALIZING, PROCESSING, COMPLETING, COMPLETED, FAILING, FAILED)
  }

  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var ResourceArn: __string
  }

  object ListTagsForResourceRequest {
    def apply(
        ResourceArn: __string
    ): ListTagsForResourceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTagsForResourceRequest]
    }
  }

  @js.native
  trait ListTagsForResourceResponse extends js.Object {
    var TagsModel: TagsModel
  }

  object ListTagsForResourceResponse {
    def apply(
        TagsModel: TagsModel
    ): ListTagsForResourceResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TagsModel" -> TagsModel.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTagsForResourceResponse]
    }
  }

  /**
    * Message to send
    */
  @js.native
  trait Message extends js.Object {
    var Action: js.UndefOr[Action]
    var Body: js.UndefOr[__string]
    var ImageIconUrl: js.UndefOr[__string]
    var ImageSmallIconUrl: js.UndefOr[__string]
    var ImageUrl: js.UndefOr[__string]
    var JsonBody: js.UndefOr[__string]
    var MediaUrl: js.UndefOr[__string]
    var RawContent: js.UndefOr[__string]
    var SilentPush: js.UndefOr[__boolean]
    var TimeToLive: js.UndefOr[__integer]
    var Title: js.UndefOr[__string]
    var Url: js.UndefOr[__string]
  }

  object Message {
    def apply(
        Action: js.UndefOr[Action] = js.undefined,
        Body: js.UndefOr[__string] = js.undefined,
        ImageIconUrl: js.UndefOr[__string] = js.undefined,
        ImageSmallIconUrl: js.UndefOr[__string] = js.undefined,
        ImageUrl: js.UndefOr[__string] = js.undefined,
        JsonBody: js.UndefOr[__string] = js.undefined,
        MediaUrl: js.UndefOr[__string] = js.undefined,
        RawContent: js.UndefOr[__string] = js.undefined,
        SilentPush: js.UndefOr[__boolean] = js.undefined,
        TimeToLive: js.UndefOr[__integer] = js.undefined,
        Title: js.UndefOr[__string] = js.undefined,
        Url: js.UndefOr[__string] = js.undefined
    ): Message = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Action" -> Action.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Body" -> Body.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ImageIconUrl" -> ImageIconUrl.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ImageSmallIconUrl" -> ImageSmallIconUrl.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ImageUrl" -> ImageUrl.map { x =>
          x.asInstanceOf[js.Any]
        },
        "JsonBody" -> JsonBody.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MediaUrl" -> MediaUrl.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RawContent" -> RawContent.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SilentPush" -> SilentPush.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TimeToLive" -> TimeToLive.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Title" -> Title.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Url" -> Url.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Message]
    }
  }

  /**
    * Simple message object.
    */
  @js.native
  trait MessageBody extends js.Object {
    var Message: js.UndefOr[__string]
    var RequestID: js.UndefOr[__string]
  }

  object MessageBody {
    def apply(
        Message: js.UndefOr[__string] = js.undefined,
        RequestID: js.UndefOr[__string] = js.undefined
    ): MessageBody = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Message" -> Message.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RequestID" -> RequestID.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MessageBody]
    }
  }

  /**
    * Message configuration for a campaign.
    */
  @js.native
  trait MessageConfiguration extends js.Object {
    var ADMMessage: js.UndefOr[Message]
    var APNSMessage: js.UndefOr[Message]
    var BaiduMessage: js.UndefOr[Message]
    var DefaultMessage: js.UndefOr[Message]
    var EmailMessage: js.UndefOr[CampaignEmailMessage]
    var GCMMessage: js.UndefOr[Message]
    var SMSMessage: js.UndefOr[CampaignSmsMessage]
  }

  object MessageConfiguration {
    def apply(
        ADMMessage: js.UndefOr[Message] = js.undefined,
        APNSMessage: js.UndefOr[Message] = js.undefined,
        BaiduMessage: js.UndefOr[Message] = js.undefined,
        DefaultMessage: js.UndefOr[Message] = js.undefined,
        EmailMessage: js.UndefOr[CampaignEmailMessage] = js.undefined,
        GCMMessage: js.UndefOr[Message] = js.undefined,
        SMSMessage: js.UndefOr[CampaignSmsMessage] = js.undefined
    ): MessageConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ADMMessage" -> ADMMessage.map { x =>
          x.asInstanceOf[js.Any]
        },
        "APNSMessage" -> APNSMessage.map { x =>
          x.asInstanceOf[js.Any]
        },
        "BaiduMessage" -> BaiduMessage.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DefaultMessage" -> DefaultMessage.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EmailMessage" -> EmailMessage.map { x =>
          x.asInstanceOf[js.Any]
        },
        "GCMMessage" -> GCMMessage.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SMSMessage" -> SMSMessage.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MessageConfiguration]
    }
  }

  /**
    * Send message request.
    */
  @js.native
  trait MessageRequest extends js.Object {
    var Addresses: js.UndefOr[MapOfAddressConfiguration]
    var Context: js.UndefOr[MapOf__string]
    var Endpoints: js.UndefOr[MapOfEndpointSendConfiguration]
    var MessageConfiguration: js.UndefOr[DirectMessageConfiguration]
    var TraceId: js.UndefOr[__string]
  }

  object MessageRequest {
    def apply(
        Addresses: js.UndefOr[MapOfAddressConfiguration] = js.undefined,
        Context: js.UndefOr[MapOf__string] = js.undefined,
        Endpoints: js.UndefOr[MapOfEndpointSendConfiguration] = js.undefined,
        MessageConfiguration: js.UndefOr[DirectMessageConfiguration] = js.undefined,
        TraceId: js.UndefOr[__string] = js.undefined
    ): MessageRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Addresses" -> Addresses.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Context" -> Context.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Endpoints" -> Endpoints.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MessageConfiguration" -> MessageConfiguration.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TraceId" -> TraceId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MessageRequest]
    }
  }

  /**
    * Send message response.
    */
  @js.native
  trait MessageResponse extends js.Object {
    var ApplicationId: js.UndefOr[__string]
    var EndpointResult: js.UndefOr[MapOfEndpointMessageResult]
    var RequestId: js.UndefOr[__string]
    var Result: js.UndefOr[MapOfMessageResult]
  }

  object MessageResponse {
    def apply(
        ApplicationId: js.UndefOr[__string] = js.undefined,
        EndpointResult: js.UndefOr[MapOfEndpointMessageResult] = js.undefined,
        RequestId: js.UndefOr[__string] = js.undefined,
        Result: js.UndefOr[MapOfMessageResult] = js.undefined
    ): MessageResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationId" -> ApplicationId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EndpointResult" -> EndpointResult.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RequestId" -> RequestId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Result" -> Result.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MessageResponse]
    }
  }

  /**
    * The result from sending a message to an address.
    */
  @js.native
  trait MessageResult extends js.Object {
    var DeliveryStatus: js.UndefOr[DeliveryStatus]
    var MessageId: js.UndefOr[__string]
    var StatusCode: js.UndefOr[__integer]
    var StatusMessage: js.UndefOr[__string]
    var UpdatedToken: js.UndefOr[__string]
  }

  object MessageResult {
    def apply(
        DeliveryStatus: js.UndefOr[DeliveryStatus] = js.undefined,
        MessageId: js.UndefOr[__string] = js.undefined,
        StatusCode: js.UndefOr[__integer] = js.undefined,
        StatusMessage: js.UndefOr[__string] = js.undefined,
        UpdatedToken: js.UndefOr[__string] = js.undefined
    ): MessageResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DeliveryStatus" -> DeliveryStatus.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MessageId" -> MessageId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "StatusCode" -> StatusCode.map { x =>
          x.asInstanceOf[js.Any]
        },
        "StatusMessage" -> StatusMessage.map { x =>
          x.asInstanceOf[js.Any]
        },
        "UpdatedToken" -> UpdatedToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MessageResult]
    }
  }

  object MessageTypeEnum {
    val TRANSACTIONAL = "TRANSACTIONAL"
    val PROMOTIONAL   = "PROMOTIONAL"

    val values = IndexedSeq(TRANSACTIONAL, PROMOTIONAL)
  }

  /**
    * Custom metric dimension
    */
  @js.native
  trait MetricDimension extends js.Object {
    var ComparisonOperator: js.UndefOr[__string]
    var Value: js.UndefOr[__double]
  }

  object MetricDimension {
    def apply(
        ComparisonOperator: js.UndefOr[__string] = js.undefined,
        Value: js.UndefOr[__double] = js.undefined
    ): MetricDimension = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ComparisonOperator" -> ComparisonOperator.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Value" -> Value.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MetricDimension]
    }
  }

  object ModeEnum {
    val DELIVERY = "DELIVERY"
    val FILTER   = "FILTER"

    val values = IndexedSeq(DELIVERY, FILTER)
  }

  /**
    * Phone Number Validate request.
    */
  @js.native
  trait NumberValidateRequest extends js.Object {
    var IsoCountryCode: js.UndefOr[__string]
    var PhoneNumber: js.UndefOr[__string]
  }

  object NumberValidateRequest {
    def apply(
        IsoCountryCode: js.UndefOr[__string] = js.undefined,
        PhoneNumber: js.UndefOr[__string] = js.undefined
    ): NumberValidateRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IsoCountryCode" -> IsoCountryCode.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PhoneNumber" -> PhoneNumber.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[NumberValidateRequest]
    }
  }

  /**
    * Phone Number Validate response.
    */
  @js.native
  trait NumberValidateResponse extends js.Object {
    var Carrier: js.UndefOr[__string]
    var City: js.UndefOr[__string]
    var CleansedPhoneNumberE164: js.UndefOr[__string]
    var CleansedPhoneNumberNational: js.UndefOr[__string]
    var Country: js.UndefOr[__string]
    var CountryCodeIso2: js.UndefOr[__string]
    var CountryCodeNumeric: js.UndefOr[__string]
    var County: js.UndefOr[__string]
    var OriginalCountryCodeIso2: js.UndefOr[__string]
    var OriginalPhoneNumber: js.UndefOr[__string]
    var PhoneType: js.UndefOr[__string]
    var PhoneTypeCode: js.UndefOr[__integer]
    var Timezone: js.UndefOr[__string]
    var ZipCode: js.UndefOr[__string]
  }

  object NumberValidateResponse {
    def apply(
        Carrier: js.UndefOr[__string] = js.undefined,
        City: js.UndefOr[__string] = js.undefined,
        CleansedPhoneNumberE164: js.UndefOr[__string] = js.undefined,
        CleansedPhoneNumberNational: js.UndefOr[__string] = js.undefined,
        Country: js.UndefOr[__string] = js.undefined,
        CountryCodeIso2: js.UndefOr[__string] = js.undefined,
        CountryCodeNumeric: js.UndefOr[__string] = js.undefined,
        County: js.UndefOr[__string] = js.undefined,
        OriginalCountryCodeIso2: js.UndefOr[__string] = js.undefined,
        OriginalPhoneNumber: js.UndefOr[__string] = js.undefined,
        PhoneType: js.UndefOr[__string] = js.undefined,
        PhoneTypeCode: js.UndefOr[__integer] = js.undefined,
        Timezone: js.UndefOr[__string] = js.undefined,
        ZipCode: js.UndefOr[__string] = js.undefined
    ): NumberValidateResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Carrier" -> Carrier.map { x =>
          x.asInstanceOf[js.Any]
        },
        "City" -> City.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CleansedPhoneNumberE164" -> CleansedPhoneNumberE164.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CleansedPhoneNumberNational" -> CleansedPhoneNumberNational.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Country" -> Country.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CountryCodeIso2" -> CountryCodeIso2.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CountryCodeNumeric" -> CountryCodeNumeric.map { x =>
          x.asInstanceOf[js.Any]
        },
        "County" -> County.map { x =>
          x.asInstanceOf[js.Any]
        },
        "OriginalCountryCodeIso2" -> OriginalCountryCodeIso2.map { x =>
          x.asInstanceOf[js.Any]
        },
        "OriginalPhoneNumber" -> OriginalPhoneNumber.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PhoneType" -> PhoneType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PhoneTypeCode" -> PhoneTypeCode.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Timezone" -> Timezone.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ZipCode" -> ZipCode.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[NumberValidateResponse]
    }
  }

  @js.native
  trait PhoneNumberValidateRequest extends js.Object {
    var NumberValidateRequest: NumberValidateRequest
  }

  object PhoneNumberValidateRequest {
    def apply(
        NumberValidateRequest: NumberValidateRequest
    ): PhoneNumberValidateRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NumberValidateRequest" -> NumberValidateRequest.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PhoneNumberValidateRequest]
    }
  }

  @js.native
  trait PhoneNumberValidateResponse extends js.Object {
    var NumberValidateResponse: NumberValidateResponse
  }

  object PhoneNumberValidateResponse {
    def apply(
        NumberValidateResponse: NumberValidateResponse
    ): PhoneNumberValidateResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NumberValidateResponse" -> NumberValidateResponse.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PhoneNumberValidateResponse]
    }
  }

  /**
    * Public endpoint attributes.
    */
  @js.native
  trait PublicEndpoint extends js.Object {
    var Address: js.UndefOr[__string]
    var Attributes: js.UndefOr[MapOfListOf__string]
    var ChannelType: js.UndefOr[ChannelType]
    var Demographic: js.UndefOr[EndpointDemographic]
    var EffectiveDate: js.UndefOr[__string]
    var EndpointStatus: js.UndefOr[__string]
    var Location: js.UndefOr[EndpointLocation]
    var Metrics: js.UndefOr[MapOf__double]
    var OptOut: js.UndefOr[__string]
    var RequestId: js.UndefOr[__string]
    var User: js.UndefOr[EndpointUser]
  }

  object PublicEndpoint {
    def apply(
        Address: js.UndefOr[__string] = js.undefined,
        Attributes: js.UndefOr[MapOfListOf__string] = js.undefined,
        ChannelType: js.UndefOr[ChannelType] = js.undefined,
        Demographic: js.UndefOr[EndpointDemographic] = js.undefined,
        EffectiveDate: js.UndefOr[__string] = js.undefined,
        EndpointStatus: js.UndefOr[__string] = js.undefined,
        Location: js.UndefOr[EndpointLocation] = js.undefined,
        Metrics: js.UndefOr[MapOf__double] = js.undefined,
        OptOut: js.UndefOr[__string] = js.undefined,
        RequestId: js.UndefOr[__string] = js.undefined,
        User: js.UndefOr[EndpointUser] = js.undefined
    ): PublicEndpoint = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Address" -> Address.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Attributes" -> Attributes.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ChannelType" -> ChannelType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Demographic" -> Demographic.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EffectiveDate" -> EffectiveDate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EndpointStatus" -> EndpointStatus.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Location" -> Location.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Metrics" -> Metrics.map { x =>
          x.asInstanceOf[js.Any]
        },
        "OptOut" -> OptOut.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RequestId" -> RequestId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "User" -> User.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PublicEndpoint]
    }
  }

  @js.native
  trait PutEventStreamRequest extends js.Object {
    var ApplicationId: __string
    var WriteEventStream: WriteEventStream
  }

  object PutEventStreamRequest {
    def apply(
        ApplicationId: __string,
        WriteEventStream: WriteEventStream
    ): PutEventStreamRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationId"    -> ApplicationId.asInstanceOf[js.Any],
        "WriteEventStream" -> WriteEventStream.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutEventStreamRequest]
    }
  }

  @js.native
  trait PutEventStreamResponse extends js.Object {
    var EventStream: EventStream
  }

  object PutEventStreamResponse {
    def apply(
        EventStream: EventStream
    ): PutEventStreamResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EventStream" -> EventStream.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutEventStreamResponse]
    }
  }

  @js.native
  trait PutEventsRequest extends js.Object {
    var ApplicationId: __string
    var EventsRequest: EventsRequest
  }

  object PutEventsRequest {
    def apply(
        ApplicationId: __string,
        EventsRequest: EventsRequest
    ): PutEventsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any],
        "EventsRequest" -> EventsRequest.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutEventsRequest]
    }
  }

  @js.native
  trait PutEventsResponse extends js.Object {
    var EventsResponse: EventsResponse
  }

  object PutEventsResponse {
    def apply(
        EventsResponse: EventsResponse
    ): PutEventsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EventsResponse" -> EventsResponse.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutEventsResponse]
    }
  }

  /**
    * Quiet Time
    */
  @js.native
  trait QuietTime extends js.Object {
    var End: js.UndefOr[__string]
    var Start: js.UndefOr[__string]
  }

  object QuietTime {
    def apply(
        End: js.UndefOr[__string] = js.undefined,
        Start: js.UndefOr[__string] = js.undefined
    ): QuietTime = {
      val _fields = IndexedSeq[(String, js.Any)](
        "End" -> End.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Start" -> Start.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[QuietTime]
    }
  }

  /**
    * An email represented as a raw MIME message.
    */
  @js.native
  trait RawEmail extends js.Object {
    var Data: js.UndefOr[__blob]
  }

  object RawEmail {
    def apply(
        Data: js.UndefOr[__blob] = js.undefined
    ): RawEmail = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Data" -> Data.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RawEmail]
    }
  }

  /**
    * Define how a segment based on recency of use.
    */
  @js.native
  trait RecencyDimension extends js.Object {
    var Duration: js.UndefOr[Duration]
    var RecencyType: js.UndefOr[RecencyType]
  }

  object RecencyDimension {
    def apply(
        Duration: js.UndefOr[Duration] = js.undefined,
        RecencyType: js.UndefOr[RecencyType] = js.undefined
    ): RecencyDimension = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Duration" -> Duration.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RecencyType" -> RecencyType.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RecencyDimension]
    }
  }

  object RecencyTypeEnum {
    val ACTIVE   = "ACTIVE"
    val INACTIVE = "INACTIVE"

    val values = IndexedSeq(ACTIVE, INACTIVE)
  }

  @js.native
  trait RemoveAttributesRequest extends js.Object {
    var ApplicationId: __string
    var AttributeType: __string
    var UpdateAttributesRequest: UpdateAttributesRequest
  }

  object RemoveAttributesRequest {
    def apply(
        ApplicationId: __string,
        AttributeType: __string,
        UpdateAttributesRequest: UpdateAttributesRequest
    ): RemoveAttributesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationId"           -> ApplicationId.asInstanceOf[js.Any],
        "AttributeType"           -> AttributeType.asInstanceOf[js.Any],
        "UpdateAttributesRequest" -> UpdateAttributesRequest.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RemoveAttributesRequest]
    }
  }

  @js.native
  trait RemoveAttributesResponse extends js.Object {
    var AttributesResource: AttributesResource
  }

  object RemoveAttributesResponse {
    def apply(
        AttributesResource: AttributesResource
    ): RemoveAttributesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AttributesResource" -> AttributesResource.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RemoveAttributesResponse]
    }
  }

  /**
    * SMS Channel Request
    */
  @js.native
  trait SMSChannelRequest extends js.Object {
    var Enabled: js.UndefOr[__boolean]
    var SenderId: js.UndefOr[__string]
    var ShortCode: js.UndefOr[__string]
  }

  object SMSChannelRequest {
    def apply(
        Enabled: js.UndefOr[__boolean] = js.undefined,
        SenderId: js.UndefOr[__string] = js.undefined,
        ShortCode: js.UndefOr[__string] = js.undefined
    ): SMSChannelRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Enabled" -> Enabled.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SenderId" -> SenderId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ShortCode" -> ShortCode.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SMSChannelRequest]
    }
  }

  /**
    * SMS Channel Response.
    */
  @js.native
  trait SMSChannelResponse extends js.Object {
    var ApplicationId: js.UndefOr[__string]
    var CreationDate: js.UndefOr[__string]
    var Enabled: js.UndefOr[__boolean]
    var HasCredential: js.UndefOr[__boolean]
    var Id: js.UndefOr[__string]
    var IsArchived: js.UndefOr[__boolean]
    var LastModifiedBy: js.UndefOr[__string]
    var LastModifiedDate: js.UndefOr[__string]
    var Platform: js.UndefOr[__string]
    var PromotionalMessagesPerSecond: js.UndefOr[__integer]
    var SenderId: js.UndefOr[__string]
    var ShortCode: js.UndefOr[__string]
    var TransactionalMessagesPerSecond: js.UndefOr[__integer]
    var Version: js.UndefOr[__integer]
  }

  object SMSChannelResponse {
    def apply(
        ApplicationId: js.UndefOr[__string] = js.undefined,
        CreationDate: js.UndefOr[__string] = js.undefined,
        Enabled: js.UndefOr[__boolean] = js.undefined,
        HasCredential: js.UndefOr[__boolean] = js.undefined,
        Id: js.UndefOr[__string] = js.undefined,
        IsArchived: js.UndefOr[__boolean] = js.undefined,
        LastModifiedBy: js.UndefOr[__string] = js.undefined,
        LastModifiedDate: js.UndefOr[__string] = js.undefined,
        Platform: js.UndefOr[__string] = js.undefined,
        PromotionalMessagesPerSecond: js.UndefOr[__integer] = js.undefined,
        SenderId: js.UndefOr[__string] = js.undefined,
        ShortCode: js.UndefOr[__string] = js.undefined,
        TransactionalMessagesPerSecond: js.UndefOr[__integer] = js.undefined,
        Version: js.UndefOr[__integer] = js.undefined
    ): SMSChannelResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationId" -> ApplicationId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CreationDate" -> CreationDate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Enabled" -> Enabled.map { x =>
          x.asInstanceOf[js.Any]
        },
        "HasCredential" -> HasCredential.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Id" -> Id.map { x =>
          x.asInstanceOf[js.Any]
        },
        "IsArchived" -> IsArchived.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LastModifiedBy" -> LastModifiedBy.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LastModifiedDate" -> LastModifiedDate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Platform" -> Platform.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PromotionalMessagesPerSecond" -> PromotionalMessagesPerSecond.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SenderId" -> SenderId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ShortCode" -> ShortCode.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TransactionalMessagesPerSecond" -> TransactionalMessagesPerSecond.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Version" -> Version.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SMSChannelResponse]
    }
  }

  /**
    * SMS Message.
    */
  @js.native
  trait SMSMessage extends js.Object {
    var Body: js.UndefOr[__string]
    var Keyword: js.UndefOr[__string]
    var MessageType: js.UndefOr[MessageType]
    var OriginationNumber: js.UndefOr[__string]
    var SenderId: js.UndefOr[__string]
    var Substitutions: js.UndefOr[MapOfListOf__string]
  }

  object SMSMessage {
    def apply(
        Body: js.UndefOr[__string] = js.undefined,
        Keyword: js.UndefOr[__string] = js.undefined,
        MessageType: js.UndefOr[MessageType] = js.undefined,
        OriginationNumber: js.UndefOr[__string] = js.undefined,
        SenderId: js.UndefOr[__string] = js.undefined,
        Substitutions: js.UndefOr[MapOfListOf__string] = js.undefined
    ): SMSMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Body" -> Body.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Keyword" -> Keyword.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MessageType" -> MessageType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "OriginationNumber" -> OriginationNumber.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SenderId" -> SenderId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Substitutions" -> Substitutions.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SMSMessage]
    }
  }

  /**
    * Shcedule that defines when a campaign is run.
    */
  @js.native
  trait Schedule extends js.Object {
    var EndTime: js.UndefOr[__string]
    var EventFilter: js.UndefOr[CampaignEventFilter]
    var Frequency: js.UndefOr[Frequency]
    var IsLocalTime: js.UndefOr[__boolean]
    var QuietTime: js.UndefOr[QuietTime]
    var StartTime: js.UndefOr[__string]
    var Timezone: js.UndefOr[__string]
  }

  object Schedule {
    def apply(
        EndTime: js.UndefOr[__string] = js.undefined,
        EventFilter: js.UndefOr[CampaignEventFilter] = js.undefined,
        Frequency: js.UndefOr[Frequency] = js.undefined,
        IsLocalTime: js.UndefOr[__boolean] = js.undefined,
        QuietTime: js.UndefOr[QuietTime] = js.undefined,
        StartTime: js.UndefOr[__string] = js.undefined,
        Timezone: js.UndefOr[__string] = js.undefined
    ): Schedule = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EndTime" -> EndTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EventFilter" -> EventFilter.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Frequency" -> Frequency.map { x =>
          x.asInstanceOf[js.Any]
        },
        "IsLocalTime" -> IsLocalTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "QuietTime" -> QuietTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "StartTime" -> StartTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Timezone" -> Timezone.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Schedule]
    }
  }

  /**
    * Segment behavior dimensions
    */
  @js.native
  trait SegmentBehaviors extends js.Object {
    var Recency: js.UndefOr[RecencyDimension]
  }

  object SegmentBehaviors {
    def apply(
        Recency: js.UndefOr[RecencyDimension] = js.undefined
    ): SegmentBehaviors = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Recency" -> Recency.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SegmentBehaviors]
    }
  }

  /**
    * Segment demographic dimensions
    */
  @js.native
  trait SegmentDemographics extends js.Object {
    var AppVersion: js.UndefOr[SetDimension]
    var Channel: js.UndefOr[SetDimension]
    var DeviceType: js.UndefOr[SetDimension]
    var Make: js.UndefOr[SetDimension]
    var Model: js.UndefOr[SetDimension]
    var Platform: js.UndefOr[SetDimension]
  }

  object SegmentDemographics {
    def apply(
        AppVersion: js.UndefOr[SetDimension] = js.undefined,
        Channel: js.UndefOr[SetDimension] = js.undefined,
        DeviceType: js.UndefOr[SetDimension] = js.undefined,
        Make: js.UndefOr[SetDimension] = js.undefined,
        Model: js.UndefOr[SetDimension] = js.undefined,
        Platform: js.UndefOr[SetDimension] = js.undefined
    ): SegmentDemographics = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AppVersion" -> AppVersion.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Channel" -> Channel.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DeviceType" -> DeviceType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Make" -> Make.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Model" -> Model.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Platform" -> Platform.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SegmentDemographics]
    }
  }

  /**
    * Segment dimensions
    */
  @js.native
  trait SegmentDimensions extends js.Object {
    var Attributes: js.UndefOr[MapOfAttributeDimension]
    var Behavior: js.UndefOr[SegmentBehaviors]
    var Demographic: js.UndefOr[SegmentDemographics]
    var Location: js.UndefOr[SegmentLocation]
    var Metrics: js.UndefOr[MapOfMetricDimension]
    var UserAttributes: js.UndefOr[MapOfAttributeDimension]
  }

  object SegmentDimensions {
    def apply(
        Attributes: js.UndefOr[MapOfAttributeDimension] = js.undefined,
        Behavior: js.UndefOr[SegmentBehaviors] = js.undefined,
        Demographic: js.UndefOr[SegmentDemographics] = js.undefined,
        Location: js.UndefOr[SegmentLocation] = js.undefined,
        Metrics: js.UndefOr[MapOfMetricDimension] = js.undefined,
        UserAttributes: js.UndefOr[MapOfAttributeDimension] = js.undefined
    ): SegmentDimensions = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Attributes" -> Attributes.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Behavior" -> Behavior.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Demographic" -> Demographic.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Location" -> Location.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Metrics" -> Metrics.map { x =>
          x.asInstanceOf[js.Any]
        },
        "UserAttributes" -> UserAttributes.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SegmentDimensions]
    }
  }

  /**
    * Segment group definition.
    */
  @js.native
  trait SegmentGroup extends js.Object {
    var Dimensions: js.UndefOr[ListOfSegmentDimensions]
    var SourceSegments: js.UndefOr[ListOfSegmentReference]
    var SourceType: js.UndefOr[SourceType]
    var Type: js.UndefOr[Type]
  }

  object SegmentGroup {
    def apply(
        Dimensions: js.UndefOr[ListOfSegmentDimensions] = js.undefined,
        SourceSegments: js.UndefOr[ListOfSegmentReference] = js.undefined,
        SourceType: js.UndefOr[SourceType] = js.undefined,
        Type: js.UndefOr[Type] = js.undefined
    ): SegmentGroup = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Dimensions" -> Dimensions.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SourceSegments" -> SourceSegments.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SourceType" -> SourceType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Type" -> Type.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SegmentGroup]
    }
  }

  /**
    * Segment group definition.
    */
  @js.native
  trait SegmentGroupList extends js.Object {
    var Groups: js.UndefOr[ListOfSegmentGroup]
    var Include: js.UndefOr[Include]
  }

  object SegmentGroupList {
    def apply(
        Groups: js.UndefOr[ListOfSegmentGroup] = js.undefined,
        Include: js.UndefOr[Include] = js.undefined
    ): SegmentGroupList = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Groups" -> Groups.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Include" -> Include.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SegmentGroupList]
    }
  }

  /**
    * Segment import definition.
    */
  @js.native
  trait SegmentImportResource extends js.Object {
    var ChannelCounts: js.UndefOr[MapOf__integer]
    var ExternalId: js.UndefOr[__string]
    var Format: js.UndefOr[Format]
    var RoleArn: js.UndefOr[__string]
    var S3Url: js.UndefOr[__string]
    var Size: js.UndefOr[__integer]
  }

  object SegmentImportResource {
    def apply(
        ChannelCounts: js.UndefOr[MapOf__integer] = js.undefined,
        ExternalId: js.UndefOr[__string] = js.undefined,
        Format: js.UndefOr[Format] = js.undefined,
        RoleArn: js.UndefOr[__string] = js.undefined,
        S3Url: js.UndefOr[__string] = js.undefined,
        Size: js.UndefOr[__integer] = js.undefined
    ): SegmentImportResource = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ChannelCounts" -> ChannelCounts.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ExternalId" -> ExternalId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Format" -> Format.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RoleArn" -> RoleArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "S3Url" -> S3Url.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Size" -> Size.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SegmentImportResource]
    }
  }

  /**
    * Segment location dimensions
    */
  @js.native
  trait SegmentLocation extends js.Object {
    var Country: js.UndefOr[SetDimension]
    var GPSPoint: js.UndefOr[GPSPointDimension]
  }

  object SegmentLocation {
    def apply(
        Country: js.UndefOr[SetDimension] = js.undefined,
        GPSPoint: js.UndefOr[GPSPointDimension] = js.undefined
    ): SegmentLocation = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Country" -> Country.map { x =>
          x.asInstanceOf[js.Any]
        },
        "GPSPoint" -> GPSPoint.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SegmentLocation]
    }
  }

  /**
    * Segment reference.
    */
  @js.native
  trait SegmentReference extends js.Object {
    var Id: js.UndefOr[__string]
    var Version: js.UndefOr[__integer]
  }

  object SegmentReference {
    def apply(
        Id: js.UndefOr[__string] = js.undefined,
        Version: js.UndefOr[__integer] = js.undefined
    ): SegmentReference = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Version" -> Version.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SegmentReference]
    }
  }

  /**
    * Segment definition.
    */
  @js.native
  trait SegmentResponse extends js.Object {
    var ApplicationId: js.UndefOr[__string]
    var Arn: js.UndefOr[__string]
    var CreationDate: js.UndefOr[__string]
    var Dimensions: js.UndefOr[SegmentDimensions]
    var Id: js.UndefOr[__string]
    var ImportDefinition: js.UndefOr[SegmentImportResource]
    var LastModifiedDate: js.UndefOr[__string]
    var Name: js.UndefOr[__string]
    var SegmentGroups: js.UndefOr[SegmentGroupList]
    var SegmentType: js.UndefOr[SegmentType]
    var Version: js.UndefOr[__integer]
    var tags: js.UndefOr[MapOf__string]
  }

  object SegmentResponse {
    def apply(
        ApplicationId: js.UndefOr[__string] = js.undefined,
        Arn: js.UndefOr[__string] = js.undefined,
        CreationDate: js.UndefOr[__string] = js.undefined,
        Dimensions: js.UndefOr[SegmentDimensions] = js.undefined,
        Id: js.UndefOr[__string] = js.undefined,
        ImportDefinition: js.UndefOr[SegmentImportResource] = js.undefined,
        LastModifiedDate: js.UndefOr[__string] = js.undefined,
        Name: js.UndefOr[__string] = js.undefined,
        SegmentGroups: js.UndefOr[SegmentGroupList] = js.undefined,
        SegmentType: js.UndefOr[SegmentType] = js.undefined,
        Version: js.UndefOr[__integer] = js.undefined,
        tags: js.UndefOr[MapOf__string] = js.undefined
    ): SegmentResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationId" -> ApplicationId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Arn" -> Arn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CreationDate" -> CreationDate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Dimensions" -> Dimensions.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Id" -> Id.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ImportDefinition" -> ImportDefinition.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LastModifiedDate" -> LastModifiedDate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SegmentGroups" -> SegmentGroups.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SegmentType" -> SegmentType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Version" -> Version.map { x =>
          x.asInstanceOf[js.Any]
        },
        "tags" -> tags.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SegmentResponse]
    }
  }

  object SegmentTypeEnum {
    val DIMENSIONAL = "DIMENSIONAL"
    val IMPORT      = "IMPORT"

    val values = IndexedSeq(DIMENSIONAL, IMPORT)
  }

  /**
    * Segments in your account.
    */
  @js.native
  trait SegmentsResponse extends js.Object {
    var Item: js.UndefOr[ListOfSegmentResponse]
    var NextToken: js.UndefOr[__string]
  }

  object SegmentsResponse {
    def apply(
        Item: js.UndefOr[ListOfSegmentResponse] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): SegmentsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Item" -> Item.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SegmentsResponse]
    }
  }

  @js.native
  trait SendMessagesRequest extends js.Object {
    var ApplicationId: __string
    var MessageRequest: MessageRequest
  }

  object SendMessagesRequest {
    def apply(
        ApplicationId: __string,
        MessageRequest: MessageRequest
    ): SendMessagesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationId"  -> ApplicationId.asInstanceOf[js.Any],
        "MessageRequest" -> MessageRequest.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SendMessagesRequest]
    }
  }

  @js.native
  trait SendMessagesResponse extends js.Object {
    var MessageResponse: MessageResponse
  }

  object SendMessagesResponse {
    def apply(
        MessageResponse: MessageResponse
    ): SendMessagesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MessageResponse" -> MessageResponse.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SendMessagesResponse]
    }
  }

  /**
    * Send message request.
    */
  @js.native
  trait SendUsersMessageRequest extends js.Object {
    var Context: js.UndefOr[MapOf__string]
    var MessageConfiguration: js.UndefOr[DirectMessageConfiguration]
    var TraceId: js.UndefOr[__string]
    var Users: js.UndefOr[MapOfEndpointSendConfiguration]
  }

  object SendUsersMessageRequest {
    def apply(
        Context: js.UndefOr[MapOf__string] = js.undefined,
        MessageConfiguration: js.UndefOr[DirectMessageConfiguration] = js.undefined,
        TraceId: js.UndefOr[__string] = js.undefined,
        Users: js.UndefOr[MapOfEndpointSendConfiguration] = js.undefined
    ): SendUsersMessageRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Context" -> Context.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MessageConfiguration" -> MessageConfiguration.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TraceId" -> TraceId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Users" -> Users.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SendUsersMessageRequest]
    }
  }

  /**
    * User send message response.
    */
  @js.native
  trait SendUsersMessageResponse extends js.Object {
    var ApplicationId: js.UndefOr[__string]
    var RequestId: js.UndefOr[__string]
    var Result: js.UndefOr[MapOfMapOfEndpointMessageResult]
  }

  object SendUsersMessageResponse {
    def apply(
        ApplicationId: js.UndefOr[__string] = js.undefined,
        RequestId: js.UndefOr[__string] = js.undefined,
        Result: js.UndefOr[MapOfMapOfEndpointMessageResult] = js.undefined
    ): SendUsersMessageResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationId" -> ApplicationId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RequestId" -> RequestId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Result" -> Result.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SendUsersMessageResponse]
    }
  }

  @js.native
  trait SendUsersMessagesRequest extends js.Object {
    var ApplicationId: __string
    var SendUsersMessageRequest: SendUsersMessageRequest
  }

  object SendUsersMessagesRequest {
    def apply(
        ApplicationId: __string,
        SendUsersMessageRequest: SendUsersMessageRequest
    ): SendUsersMessagesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationId"           -> ApplicationId.asInstanceOf[js.Any],
        "SendUsersMessageRequest" -> SendUsersMessageRequest.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SendUsersMessagesRequest]
    }
  }

  @js.native
  trait SendUsersMessagesResponse extends js.Object {
    var SendUsersMessageResponse: SendUsersMessageResponse
  }

  object SendUsersMessagesResponse {
    def apply(
        SendUsersMessageResponse: SendUsersMessageResponse
    ): SendUsersMessagesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SendUsersMessageResponse" -> SendUsersMessageResponse.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SendUsersMessagesResponse]
    }
  }

  /**
    * Information about a session.
    */
  @js.native
  trait Session extends js.Object {
    var Duration: js.UndefOr[__integer]
    var Id: js.UndefOr[__string]
    var StartTimestamp: js.UndefOr[__string]
    var StopTimestamp: js.UndefOr[__string]
  }

  object Session {
    def apply(
        Duration: js.UndefOr[__integer] = js.undefined,
        Id: js.UndefOr[__string] = js.undefined,
        StartTimestamp: js.UndefOr[__string] = js.undefined,
        StopTimestamp: js.UndefOr[__string] = js.undefined
    ): Session = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Duration" -> Duration.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Id" -> Id.map { x =>
          x.asInstanceOf[js.Any]
        },
        "StartTimestamp" -> StartTimestamp.map { x =>
          x.asInstanceOf[js.Any]
        },
        "StopTimestamp" -> StopTimestamp.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Session]
    }
  }

  /**
    * Dimension specification of a segment.
    */
  @js.native
  trait SetDimension extends js.Object {
    var DimensionType: js.UndefOr[DimensionType]
    var Values: js.UndefOr[ListOf__string]
  }

  object SetDimension {
    def apply(
        DimensionType: js.UndefOr[DimensionType] = js.undefined,
        Values: js.UndefOr[ListOf__string] = js.undefined
    ): SetDimension = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DimensionType" -> DimensionType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Values" -> Values.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SetDimension]
    }
  }

  /**
    * An email composed of a subject, a text part and a html part.
    */
  @js.native
  trait SimpleEmail extends js.Object {
    var HtmlPart: js.UndefOr[SimpleEmailPart]
    var Subject: js.UndefOr[SimpleEmailPart]
    var TextPart: js.UndefOr[SimpleEmailPart]
  }

  object SimpleEmail {
    def apply(
        HtmlPart: js.UndefOr[SimpleEmailPart] = js.undefined,
        Subject: js.UndefOr[SimpleEmailPart] = js.undefined,
        TextPart: js.UndefOr[SimpleEmailPart] = js.undefined
    ): SimpleEmail = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HtmlPart" -> HtmlPart.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Subject" -> Subject.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TextPart" -> TextPart.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SimpleEmail]
    }
  }

  /**
    * Textual email data, plus an optional character set specification.
    */
  @js.native
  trait SimpleEmailPart extends js.Object {
    var Charset: js.UndefOr[__string]
    var Data: js.UndefOr[__string]
  }

  object SimpleEmailPart {
    def apply(
        Charset: js.UndefOr[__string] = js.undefined,
        Data: js.UndefOr[__string] = js.undefined
    ): SimpleEmailPart = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Charset" -> Charset.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Data" -> Data.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SimpleEmailPart]
    }
  }

  object SourceTypeEnum {
    val ALL  = "ALL"
    val ANY  = "ANY"
    val NONE = "NONE"

    val values = IndexedSeq(ALL, ANY, NONE)
  }

  @js.native
  trait TagResourceRequest extends js.Object {
    var ResourceArn: __string
    var TagsModel: TagsModel
  }

  object TagResourceRequest {
    def apply(
        ResourceArn: __string,
        TagsModel: TagsModel
    ): TagResourceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any],
        "TagsModel"   -> TagsModel.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TagResourceRequest]
    }
  }

  @js.native
  trait TagsModel extends js.Object {
    var tags: MapOf__string
  }

  object TagsModel {
    def apply(
        tags: MapOf__string
    ): TagsModel = {
      val _fields = IndexedSeq[(String, js.Any)](
        "tags" -> tags.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TagsModel]
    }
  }

  /**
    * Treatment resource
    */
  @js.native
  trait TreatmentResource extends js.Object {
    var Id: js.UndefOr[__string]
    var MessageConfiguration: js.UndefOr[MessageConfiguration]
    var Schedule: js.UndefOr[Schedule]
    var SizePercent: js.UndefOr[__integer]
    var State: js.UndefOr[CampaignState]
    var TreatmentDescription: js.UndefOr[__string]
    var TreatmentName: js.UndefOr[__string]
  }

  object TreatmentResource {
    def apply(
        Id: js.UndefOr[__string] = js.undefined,
        MessageConfiguration: js.UndefOr[MessageConfiguration] = js.undefined,
        Schedule: js.UndefOr[Schedule] = js.undefined,
        SizePercent: js.UndefOr[__integer] = js.undefined,
        State: js.UndefOr[CampaignState] = js.undefined,
        TreatmentDescription: js.UndefOr[__string] = js.undefined,
        TreatmentName: js.UndefOr[__string] = js.undefined
    ): TreatmentResource = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MessageConfiguration" -> MessageConfiguration.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Schedule" -> Schedule.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SizePercent" -> SizePercent.map { x =>
          x.asInstanceOf[js.Any]
        },
        "State" -> State.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TreatmentDescription" -> TreatmentDescription.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TreatmentName" -> TreatmentName.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TreatmentResource]
    }
  }

  object TypeEnum {
    val ALL  = "ALL"
    val ANY  = "ANY"
    val NONE = "NONE"

    val values = IndexedSeq(ALL, ANY, NONE)
  }

  @js.native
  trait UntagResourceRequest extends js.Object {
    var ResourceArn: __string
    var TagKeys: ListOf__string
  }

  object UntagResourceRequest {
    def apply(
        ResourceArn: __string,
        TagKeys: ListOf__string
    ): UntagResourceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any],
        "TagKeys"     -> TagKeys.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UntagResourceRequest]
    }
  }

  @js.native
  trait UpdateAdmChannelRequest extends js.Object {
    var ADMChannelRequest: ADMChannelRequest
    var ApplicationId: __string
  }

  object UpdateAdmChannelRequest {
    def apply(
        ADMChannelRequest: ADMChannelRequest,
        ApplicationId: __string
    ): UpdateAdmChannelRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ADMChannelRequest" -> ADMChannelRequest.asInstanceOf[js.Any],
        "ApplicationId"     -> ApplicationId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateAdmChannelRequest]
    }
  }

  @js.native
  trait UpdateAdmChannelResponse extends js.Object {
    var ADMChannelResponse: ADMChannelResponse
  }

  object UpdateAdmChannelResponse {
    def apply(
        ADMChannelResponse: ADMChannelResponse
    ): UpdateAdmChannelResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ADMChannelResponse" -> ADMChannelResponse.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateAdmChannelResponse]
    }
  }

  @js.native
  trait UpdateApnsChannelRequest extends js.Object {
    var APNSChannelRequest: APNSChannelRequest
    var ApplicationId: __string
  }

  object UpdateApnsChannelRequest {
    def apply(
        APNSChannelRequest: APNSChannelRequest,
        ApplicationId: __string
    ): UpdateApnsChannelRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "APNSChannelRequest" -> APNSChannelRequest.asInstanceOf[js.Any],
        "ApplicationId"      -> ApplicationId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateApnsChannelRequest]
    }
  }

  @js.native
  trait UpdateApnsChannelResponse extends js.Object {
    var APNSChannelResponse: APNSChannelResponse
  }

  object UpdateApnsChannelResponse {
    def apply(
        APNSChannelResponse: APNSChannelResponse
    ): UpdateApnsChannelResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "APNSChannelResponse" -> APNSChannelResponse.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateApnsChannelResponse]
    }
  }

  @js.native
  trait UpdateApnsSandboxChannelRequest extends js.Object {
    var APNSSandboxChannelRequest: APNSSandboxChannelRequest
    var ApplicationId: __string
  }

  object UpdateApnsSandboxChannelRequest {
    def apply(
        APNSSandboxChannelRequest: APNSSandboxChannelRequest,
        ApplicationId: __string
    ): UpdateApnsSandboxChannelRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "APNSSandboxChannelRequest" -> APNSSandboxChannelRequest.asInstanceOf[js.Any],
        "ApplicationId"             -> ApplicationId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateApnsSandboxChannelRequest]
    }
  }

  @js.native
  trait UpdateApnsSandboxChannelResponse extends js.Object {
    var APNSSandboxChannelResponse: APNSSandboxChannelResponse
  }

  object UpdateApnsSandboxChannelResponse {
    def apply(
        APNSSandboxChannelResponse: APNSSandboxChannelResponse
    ): UpdateApnsSandboxChannelResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "APNSSandboxChannelResponse" -> APNSSandboxChannelResponse.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateApnsSandboxChannelResponse]
    }
  }

  @js.native
  trait UpdateApnsVoipChannelRequest extends js.Object {
    var APNSVoipChannelRequest: APNSVoipChannelRequest
    var ApplicationId: __string
  }

  object UpdateApnsVoipChannelRequest {
    def apply(
        APNSVoipChannelRequest: APNSVoipChannelRequest,
        ApplicationId: __string
    ): UpdateApnsVoipChannelRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "APNSVoipChannelRequest" -> APNSVoipChannelRequest.asInstanceOf[js.Any],
        "ApplicationId"          -> ApplicationId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateApnsVoipChannelRequest]
    }
  }

  @js.native
  trait UpdateApnsVoipChannelResponse extends js.Object {
    var APNSVoipChannelResponse: APNSVoipChannelResponse
  }

  object UpdateApnsVoipChannelResponse {
    def apply(
        APNSVoipChannelResponse: APNSVoipChannelResponse
    ): UpdateApnsVoipChannelResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "APNSVoipChannelResponse" -> APNSVoipChannelResponse.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateApnsVoipChannelResponse]
    }
  }

  @js.native
  trait UpdateApnsVoipSandboxChannelRequest extends js.Object {
    var APNSVoipSandboxChannelRequest: APNSVoipSandboxChannelRequest
    var ApplicationId: __string
  }

  object UpdateApnsVoipSandboxChannelRequest {
    def apply(
        APNSVoipSandboxChannelRequest: APNSVoipSandboxChannelRequest,
        ApplicationId: __string
    ): UpdateApnsVoipSandboxChannelRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "APNSVoipSandboxChannelRequest" -> APNSVoipSandboxChannelRequest.asInstanceOf[js.Any],
        "ApplicationId"                 -> ApplicationId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateApnsVoipSandboxChannelRequest]
    }
  }

  @js.native
  trait UpdateApnsVoipSandboxChannelResponse extends js.Object {
    var APNSVoipSandboxChannelResponse: APNSVoipSandboxChannelResponse
  }

  object UpdateApnsVoipSandboxChannelResponse {
    def apply(
        APNSVoipSandboxChannelResponse: APNSVoipSandboxChannelResponse
    ): UpdateApnsVoipSandboxChannelResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "APNSVoipSandboxChannelResponse" -> APNSVoipSandboxChannelResponse.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateApnsVoipSandboxChannelResponse]
    }
  }

  @js.native
  trait UpdateApplicationSettingsRequest extends js.Object {
    var ApplicationId: __string
    var WriteApplicationSettingsRequest: WriteApplicationSettingsRequest
  }

  object UpdateApplicationSettingsRequest {
    def apply(
        ApplicationId: __string,
        WriteApplicationSettingsRequest: WriteApplicationSettingsRequest
    ): UpdateApplicationSettingsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationId"                   -> ApplicationId.asInstanceOf[js.Any],
        "WriteApplicationSettingsRequest" -> WriteApplicationSettingsRequest.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateApplicationSettingsRequest]
    }
  }

  @js.native
  trait UpdateApplicationSettingsResponse extends js.Object {
    var ApplicationSettingsResource: ApplicationSettingsResource
  }

  object UpdateApplicationSettingsResponse {
    def apply(
        ApplicationSettingsResource: ApplicationSettingsResource
    ): UpdateApplicationSettingsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationSettingsResource" -> ApplicationSettingsResource.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateApplicationSettingsResponse]
    }
  }

  /**
    * Update attributes request
    */
  @js.native
  trait UpdateAttributesRequest extends js.Object {
    var Blacklist: js.UndefOr[ListOf__string]
  }

  object UpdateAttributesRequest {
    def apply(
        Blacklist: js.UndefOr[ListOf__string] = js.undefined
    ): UpdateAttributesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Blacklist" -> Blacklist.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateAttributesRequest]
    }
  }

  @js.native
  trait UpdateBaiduChannelRequest extends js.Object {
    var ApplicationId: __string
    var BaiduChannelRequest: BaiduChannelRequest
  }

  object UpdateBaiduChannelRequest {
    def apply(
        ApplicationId: __string,
        BaiduChannelRequest: BaiduChannelRequest
    ): UpdateBaiduChannelRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationId"       -> ApplicationId.asInstanceOf[js.Any],
        "BaiduChannelRequest" -> BaiduChannelRequest.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateBaiduChannelRequest]
    }
  }

  @js.native
  trait UpdateBaiduChannelResponse extends js.Object {
    var BaiduChannelResponse: BaiduChannelResponse
  }

  object UpdateBaiduChannelResponse {
    def apply(
        BaiduChannelResponse: BaiduChannelResponse
    ): UpdateBaiduChannelResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BaiduChannelResponse" -> BaiduChannelResponse.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateBaiduChannelResponse]
    }
  }

  @js.native
  trait UpdateCampaignRequest extends js.Object {
    var ApplicationId: __string
    var CampaignId: __string
    var WriteCampaignRequest: WriteCampaignRequest
  }

  object UpdateCampaignRequest {
    def apply(
        ApplicationId: __string,
        CampaignId: __string,
        WriteCampaignRequest: WriteCampaignRequest
    ): UpdateCampaignRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationId"        -> ApplicationId.asInstanceOf[js.Any],
        "CampaignId"           -> CampaignId.asInstanceOf[js.Any],
        "WriteCampaignRequest" -> WriteCampaignRequest.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateCampaignRequest]
    }
  }

  @js.native
  trait UpdateCampaignResponse extends js.Object {
    var CampaignResponse: CampaignResponse
  }

  object UpdateCampaignResponse {
    def apply(
        CampaignResponse: CampaignResponse
    ): UpdateCampaignResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CampaignResponse" -> CampaignResponse.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateCampaignResponse]
    }
  }

  @js.native
  trait UpdateEmailChannelRequest extends js.Object {
    var ApplicationId: __string
    var EmailChannelRequest: EmailChannelRequest
  }

  object UpdateEmailChannelRequest {
    def apply(
        ApplicationId: __string,
        EmailChannelRequest: EmailChannelRequest
    ): UpdateEmailChannelRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationId"       -> ApplicationId.asInstanceOf[js.Any],
        "EmailChannelRequest" -> EmailChannelRequest.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateEmailChannelRequest]
    }
  }

  @js.native
  trait UpdateEmailChannelResponse extends js.Object {
    var EmailChannelResponse: EmailChannelResponse
  }

  object UpdateEmailChannelResponse {
    def apply(
        EmailChannelResponse: EmailChannelResponse
    ): UpdateEmailChannelResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EmailChannelResponse" -> EmailChannelResponse.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateEmailChannelResponse]
    }
  }

  @js.native
  trait UpdateEndpointRequest extends js.Object {
    var ApplicationId: __string
    var EndpointId: __string
    var EndpointRequest: EndpointRequest
  }

  object UpdateEndpointRequest {
    def apply(
        ApplicationId: __string,
        EndpointId: __string,
        EndpointRequest: EndpointRequest
    ): UpdateEndpointRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationId"   -> ApplicationId.asInstanceOf[js.Any],
        "EndpointId"      -> EndpointId.asInstanceOf[js.Any],
        "EndpointRequest" -> EndpointRequest.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateEndpointRequest]
    }
  }

  @js.native
  trait UpdateEndpointResponse extends js.Object {
    var MessageBody: MessageBody
  }

  object UpdateEndpointResponse {
    def apply(
        MessageBody: MessageBody
    ): UpdateEndpointResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MessageBody" -> MessageBody.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateEndpointResponse]
    }
  }

  @js.native
  trait UpdateEndpointsBatchRequest extends js.Object {
    var ApplicationId: __string
    var EndpointBatchRequest: EndpointBatchRequest
  }

  object UpdateEndpointsBatchRequest {
    def apply(
        ApplicationId: __string,
        EndpointBatchRequest: EndpointBatchRequest
    ): UpdateEndpointsBatchRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationId"        -> ApplicationId.asInstanceOf[js.Any],
        "EndpointBatchRequest" -> EndpointBatchRequest.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateEndpointsBatchRequest]
    }
  }

  @js.native
  trait UpdateEndpointsBatchResponse extends js.Object {
    var MessageBody: MessageBody
  }

  object UpdateEndpointsBatchResponse {
    def apply(
        MessageBody: MessageBody
    ): UpdateEndpointsBatchResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MessageBody" -> MessageBody.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateEndpointsBatchResponse]
    }
  }

  @js.native
  trait UpdateGcmChannelRequest extends js.Object {
    var ApplicationId: __string
    var GCMChannelRequest: GCMChannelRequest
  }

  object UpdateGcmChannelRequest {
    def apply(
        ApplicationId: __string,
        GCMChannelRequest: GCMChannelRequest
    ): UpdateGcmChannelRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationId"     -> ApplicationId.asInstanceOf[js.Any],
        "GCMChannelRequest" -> GCMChannelRequest.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateGcmChannelRequest]
    }
  }

  @js.native
  trait UpdateGcmChannelResponse extends js.Object {
    var GCMChannelResponse: GCMChannelResponse
  }

  object UpdateGcmChannelResponse {
    def apply(
        GCMChannelResponse: GCMChannelResponse
    ): UpdateGcmChannelResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GCMChannelResponse" -> GCMChannelResponse.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateGcmChannelResponse]
    }
  }

  @js.native
  trait UpdateSegmentRequest extends js.Object {
    var ApplicationId: __string
    var SegmentId: __string
    var WriteSegmentRequest: WriteSegmentRequest
  }

  object UpdateSegmentRequest {
    def apply(
        ApplicationId: __string,
        SegmentId: __string,
        WriteSegmentRequest: WriteSegmentRequest
    ): UpdateSegmentRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationId"       -> ApplicationId.asInstanceOf[js.Any],
        "SegmentId"           -> SegmentId.asInstanceOf[js.Any],
        "WriteSegmentRequest" -> WriteSegmentRequest.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateSegmentRequest]
    }
  }

  @js.native
  trait UpdateSegmentResponse extends js.Object {
    var SegmentResponse: SegmentResponse
  }

  object UpdateSegmentResponse {
    def apply(
        SegmentResponse: SegmentResponse
    ): UpdateSegmentResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SegmentResponse" -> SegmentResponse.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateSegmentResponse]
    }
  }

  @js.native
  trait UpdateSmsChannelRequest extends js.Object {
    var ApplicationId: __string
    var SMSChannelRequest: SMSChannelRequest
  }

  object UpdateSmsChannelRequest {
    def apply(
        ApplicationId: __string,
        SMSChannelRequest: SMSChannelRequest
    ): UpdateSmsChannelRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationId"     -> ApplicationId.asInstanceOf[js.Any],
        "SMSChannelRequest" -> SMSChannelRequest.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateSmsChannelRequest]
    }
  }

  @js.native
  trait UpdateSmsChannelResponse extends js.Object {
    var SMSChannelResponse: SMSChannelResponse
  }

  object UpdateSmsChannelResponse {
    def apply(
        SMSChannelResponse: SMSChannelResponse
    ): UpdateSmsChannelResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SMSChannelResponse" -> SMSChannelResponse.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateSmsChannelResponse]
    }
  }

  @js.native
  trait UpdateVoiceChannelRequest extends js.Object {
    var ApplicationId: __string
    var VoiceChannelRequest: VoiceChannelRequest
  }

  object UpdateVoiceChannelRequest {
    def apply(
        ApplicationId: __string,
        VoiceChannelRequest: VoiceChannelRequest
    ): UpdateVoiceChannelRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationId"       -> ApplicationId.asInstanceOf[js.Any],
        "VoiceChannelRequest" -> VoiceChannelRequest.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateVoiceChannelRequest]
    }
  }

  @js.native
  trait UpdateVoiceChannelResponse extends js.Object {
    var VoiceChannelResponse: VoiceChannelResponse
  }

  object UpdateVoiceChannelResponse {
    def apply(
        VoiceChannelResponse: VoiceChannelResponse
    ): UpdateVoiceChannelResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "VoiceChannelResponse" -> VoiceChannelResponse.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateVoiceChannelResponse]
    }
  }

  /**
    * Voice Channel Request
    */
  @js.native
  trait VoiceChannelRequest extends js.Object {
    var Enabled: js.UndefOr[__boolean]
  }

  object VoiceChannelRequest {
    def apply(
        Enabled: js.UndefOr[__boolean] = js.undefined
    ): VoiceChannelRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Enabled" -> Enabled.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VoiceChannelRequest]
    }
  }

  /**
    * Voice Channel Response.
    */
  @js.native
  trait VoiceChannelResponse extends js.Object {
    var ApplicationId: js.UndefOr[__string]
    var CreationDate: js.UndefOr[__string]
    var Enabled: js.UndefOr[__boolean]
    var HasCredential: js.UndefOr[__boolean]
    var Id: js.UndefOr[__string]
    var IsArchived: js.UndefOr[__boolean]
    var LastModifiedBy: js.UndefOr[__string]
    var LastModifiedDate: js.UndefOr[__string]
    var Platform: js.UndefOr[__string]
    var Version: js.UndefOr[__integer]
  }

  object VoiceChannelResponse {
    def apply(
        ApplicationId: js.UndefOr[__string] = js.undefined,
        CreationDate: js.UndefOr[__string] = js.undefined,
        Enabled: js.UndefOr[__boolean] = js.undefined,
        HasCredential: js.UndefOr[__boolean] = js.undefined,
        Id: js.UndefOr[__string] = js.undefined,
        IsArchived: js.UndefOr[__boolean] = js.undefined,
        LastModifiedBy: js.UndefOr[__string] = js.undefined,
        LastModifiedDate: js.UndefOr[__string] = js.undefined,
        Platform: js.UndefOr[__string] = js.undefined,
        Version: js.UndefOr[__integer] = js.undefined
    ): VoiceChannelResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationId" -> ApplicationId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CreationDate" -> CreationDate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Enabled" -> Enabled.map { x =>
          x.asInstanceOf[js.Any]
        },
        "HasCredential" -> HasCredential.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Id" -> Id.map { x =>
          x.asInstanceOf[js.Any]
        },
        "IsArchived" -> IsArchived.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LastModifiedBy" -> LastModifiedBy.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LastModifiedDate" -> LastModifiedDate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Platform" -> Platform.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Version" -> Version.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VoiceChannelResponse]
    }
  }

  /**
    * Voice Message.
    */
  @js.native
  trait VoiceMessage extends js.Object {
    var Body: js.UndefOr[__string]
    var LanguageCode: js.UndefOr[__string]
    var OriginationNumber: js.UndefOr[__string]
    var Substitutions: js.UndefOr[MapOfListOf__string]
    var VoiceId: js.UndefOr[__string]
  }

  object VoiceMessage {
    def apply(
        Body: js.UndefOr[__string] = js.undefined,
        LanguageCode: js.UndefOr[__string] = js.undefined,
        OriginationNumber: js.UndefOr[__string] = js.undefined,
        Substitutions: js.UndefOr[MapOfListOf__string] = js.undefined,
        VoiceId: js.UndefOr[__string] = js.undefined
    ): VoiceMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Body" -> Body.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LanguageCode" -> LanguageCode.map { x =>
          x.asInstanceOf[js.Any]
        },
        "OriginationNumber" -> OriginationNumber.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Substitutions" -> Substitutions.map { x =>
          x.asInstanceOf[js.Any]
        },
        "VoiceId" -> VoiceId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VoiceMessage]
    }
  }

  /**
    * Creating application setting request
    */
  @js.native
  trait WriteApplicationSettingsRequest extends js.Object {
    var CampaignHook: js.UndefOr[CampaignHook]
    var CloudWatchMetricsEnabled: js.UndefOr[__boolean]
    var Limits: js.UndefOr[CampaignLimits]
    var QuietTime: js.UndefOr[QuietTime]
  }

  object WriteApplicationSettingsRequest {
    def apply(
        CampaignHook: js.UndefOr[CampaignHook] = js.undefined,
        CloudWatchMetricsEnabled: js.UndefOr[__boolean] = js.undefined,
        Limits: js.UndefOr[CampaignLimits] = js.undefined,
        QuietTime: js.UndefOr[QuietTime] = js.undefined
    ): WriteApplicationSettingsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CampaignHook" -> CampaignHook.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CloudWatchMetricsEnabled" -> CloudWatchMetricsEnabled.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Limits" -> Limits.map { x =>
          x.asInstanceOf[js.Any]
        },
        "QuietTime" -> QuietTime.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[WriteApplicationSettingsRequest]
    }
  }

  /**
    * Used to create a campaign.
    */
  @js.native
  trait WriteCampaignRequest extends js.Object {
    var AdditionalTreatments: js.UndefOr[ListOfWriteTreatmentResource]
    var Description: js.UndefOr[__string]
    var HoldoutPercent: js.UndefOr[__integer]
    var Hook: js.UndefOr[CampaignHook]
    var IsPaused: js.UndefOr[__boolean]
    var Limits: js.UndefOr[CampaignLimits]
    var MessageConfiguration: js.UndefOr[MessageConfiguration]
    var Name: js.UndefOr[__string]
    var Schedule: js.UndefOr[Schedule]
    var SegmentId: js.UndefOr[__string]
    var SegmentVersion: js.UndefOr[__integer]
    var TreatmentDescription: js.UndefOr[__string]
    var TreatmentName: js.UndefOr[__string]
    var tags: js.UndefOr[MapOf__string]
  }

  object WriteCampaignRequest {
    def apply(
        AdditionalTreatments: js.UndefOr[ListOfWriteTreatmentResource] = js.undefined,
        Description: js.UndefOr[__string] = js.undefined,
        HoldoutPercent: js.UndefOr[__integer] = js.undefined,
        Hook: js.UndefOr[CampaignHook] = js.undefined,
        IsPaused: js.UndefOr[__boolean] = js.undefined,
        Limits: js.UndefOr[CampaignLimits] = js.undefined,
        MessageConfiguration: js.UndefOr[MessageConfiguration] = js.undefined,
        Name: js.UndefOr[__string] = js.undefined,
        Schedule: js.UndefOr[Schedule] = js.undefined,
        SegmentId: js.UndefOr[__string] = js.undefined,
        SegmentVersion: js.UndefOr[__integer] = js.undefined,
        TreatmentDescription: js.UndefOr[__string] = js.undefined,
        TreatmentName: js.UndefOr[__string] = js.undefined,
        tags: js.UndefOr[MapOf__string] = js.undefined
    ): WriteCampaignRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AdditionalTreatments" -> AdditionalTreatments.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Description" -> Description.map { x =>
          x.asInstanceOf[js.Any]
        },
        "HoldoutPercent" -> HoldoutPercent.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Hook" -> Hook.map { x =>
          x.asInstanceOf[js.Any]
        },
        "IsPaused" -> IsPaused.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Limits" -> Limits.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MessageConfiguration" -> MessageConfiguration.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Schedule" -> Schedule.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SegmentId" -> SegmentId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SegmentVersion" -> SegmentVersion.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TreatmentDescription" -> TreatmentDescription.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TreatmentName" -> TreatmentName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "tags" -> tags.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[WriteCampaignRequest]
    }
  }

  /**
    * Request to save an EventStream.
    */
  @js.native
  trait WriteEventStream extends js.Object {
    var DestinationStreamArn: js.UndefOr[__string]
    var RoleArn: js.UndefOr[__string]
  }

  object WriteEventStream {
    def apply(
        DestinationStreamArn: js.UndefOr[__string] = js.undefined,
        RoleArn: js.UndefOr[__string] = js.undefined
    ): WriteEventStream = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DestinationStreamArn" -> DestinationStreamArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RoleArn" -> RoleArn.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[WriteEventStream]
    }
  }

  /**
    * Segment definition.
    */
  @js.native
  trait WriteSegmentRequest extends js.Object {
    var Dimensions: js.UndefOr[SegmentDimensions]
    var Name: js.UndefOr[__string]
    var SegmentGroups: js.UndefOr[SegmentGroupList]
    var tags: js.UndefOr[MapOf__string]
  }

  object WriteSegmentRequest {
    def apply(
        Dimensions: js.UndefOr[SegmentDimensions] = js.undefined,
        Name: js.UndefOr[__string] = js.undefined,
        SegmentGroups: js.UndefOr[SegmentGroupList] = js.undefined,
        tags: js.UndefOr[MapOf__string] = js.undefined
    ): WriteSegmentRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Dimensions" -> Dimensions.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SegmentGroups" -> SegmentGroups.map { x =>
          x.asInstanceOf[js.Any]
        },
        "tags" -> tags.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[WriteSegmentRequest]
    }
  }

  /**
    * Used to create a campaign treatment.
    */
  @js.native
  trait WriteTreatmentResource extends js.Object {
    var MessageConfiguration: js.UndefOr[MessageConfiguration]
    var Schedule: js.UndefOr[Schedule]
    var SizePercent: js.UndefOr[__integer]
    var TreatmentDescription: js.UndefOr[__string]
    var TreatmentName: js.UndefOr[__string]
  }

  object WriteTreatmentResource {
    def apply(
        MessageConfiguration: js.UndefOr[MessageConfiguration] = js.undefined,
        Schedule: js.UndefOr[Schedule] = js.undefined,
        SizePercent: js.UndefOr[__integer] = js.undefined,
        TreatmentDescription: js.UndefOr[__string] = js.undefined,
        TreatmentName: js.UndefOr[__string] = js.undefined
    ): WriteTreatmentResource = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MessageConfiguration" -> MessageConfiguration.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Schedule" -> Schedule.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SizePercent" -> SizePercent.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TreatmentDescription" -> TreatmentDescription.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TreatmentName" -> TreatmentName.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[WriteTreatmentResource]
    }
  }
}
