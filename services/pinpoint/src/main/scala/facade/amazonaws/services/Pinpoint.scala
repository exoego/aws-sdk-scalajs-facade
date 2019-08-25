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
      val __obj = js.Dictionary.empty[js.Any]
      ClientId.foreach(__v => __obj.update("ClientId", __v.asInstanceOf[js.Any]))
      ClientSecret.foreach(__v => __obj.update("ClientSecret", __v.asInstanceOf[js.Any]))
      Enabled.foreach(__v => __obj.update("Enabled", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ADMChannelRequest]
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
      val __obj = js.Dictionary.empty[js.Any]
      ApplicationId.foreach(__v => __obj.update("ApplicationId", __v.asInstanceOf[js.Any]))
      CreationDate.foreach(__v => __obj.update("CreationDate", __v.asInstanceOf[js.Any]))
      Enabled.foreach(__v => __obj.update("Enabled", __v.asInstanceOf[js.Any]))
      HasCredential.foreach(__v => __obj.update("HasCredential", __v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.update("Id", __v.asInstanceOf[js.Any]))
      IsArchived.foreach(__v => __obj.update("IsArchived", __v.asInstanceOf[js.Any]))
      LastModifiedBy.foreach(__v => __obj.update("LastModifiedBy", __v.asInstanceOf[js.Any]))
      LastModifiedDate.foreach(__v => __obj.update("LastModifiedDate", __v.asInstanceOf[js.Any]))
      Platform.foreach(__v => __obj.update("Platform", __v.asInstanceOf[js.Any]))
      Version.foreach(__v => __obj.update("Version", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ADMChannelResponse]
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
      val __obj = js.Dictionary.empty[js.Any]
      Action.foreach(__v => __obj.update("Action", __v.asInstanceOf[js.Any]))
      Body.foreach(__v => __obj.update("Body", __v.asInstanceOf[js.Any]))
      ConsolidationKey.foreach(__v => __obj.update("ConsolidationKey", __v.asInstanceOf[js.Any]))
      Data.foreach(__v => __obj.update("Data", __v.asInstanceOf[js.Any]))
      ExpiresAfter.foreach(__v => __obj.update("ExpiresAfter", __v.asInstanceOf[js.Any]))
      IconReference.foreach(__v => __obj.update("IconReference", __v.asInstanceOf[js.Any]))
      ImageIconUrl.foreach(__v => __obj.update("ImageIconUrl", __v.asInstanceOf[js.Any]))
      ImageUrl.foreach(__v => __obj.update("ImageUrl", __v.asInstanceOf[js.Any]))
      MD5.foreach(__v => __obj.update("MD5", __v.asInstanceOf[js.Any]))
      RawContent.foreach(__v => __obj.update("RawContent", __v.asInstanceOf[js.Any]))
      SilentPush.foreach(__v => __obj.update("SilentPush", __v.asInstanceOf[js.Any]))
      SmallImageIconUrl.foreach(__v => __obj.update("SmallImageIconUrl", __v.asInstanceOf[js.Any]))
      Sound.foreach(__v => __obj.update("Sound", __v.asInstanceOf[js.Any]))
      Substitutions.foreach(__v => __obj.update("Substitutions", __v.asInstanceOf[js.Any]))
      Title.foreach(__v => __obj.update("Title", __v.asInstanceOf[js.Any]))
      Url.foreach(__v => __obj.update("Url", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ADMMessage]
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
      val __obj = js.Dictionary.empty[js.Any]
      BundleId.foreach(__v => __obj.update("BundleId", __v.asInstanceOf[js.Any]))
      Certificate.foreach(__v => __obj.update("Certificate", __v.asInstanceOf[js.Any]))
      DefaultAuthenticationMethod.foreach(__v => __obj.update("DefaultAuthenticationMethod", __v.asInstanceOf[js.Any]))
      Enabled.foreach(__v => __obj.update("Enabled", __v.asInstanceOf[js.Any]))
      PrivateKey.foreach(__v => __obj.update("PrivateKey", __v.asInstanceOf[js.Any]))
      TeamId.foreach(__v => __obj.update("TeamId", __v.asInstanceOf[js.Any]))
      TokenKey.foreach(__v => __obj.update("TokenKey", __v.asInstanceOf[js.Any]))
      TokenKeyId.foreach(__v => __obj.update("TokenKeyId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[APNSChannelRequest]
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
      val __obj = js.Dictionary.empty[js.Any]
      ApplicationId.foreach(__v => __obj.update("ApplicationId", __v.asInstanceOf[js.Any]))
      CreationDate.foreach(__v => __obj.update("CreationDate", __v.asInstanceOf[js.Any]))
      DefaultAuthenticationMethod.foreach(__v => __obj.update("DefaultAuthenticationMethod", __v.asInstanceOf[js.Any]))
      Enabled.foreach(__v => __obj.update("Enabled", __v.asInstanceOf[js.Any]))
      HasCredential.foreach(__v => __obj.update("HasCredential", __v.asInstanceOf[js.Any]))
      HasTokenKey.foreach(__v => __obj.update("HasTokenKey", __v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.update("Id", __v.asInstanceOf[js.Any]))
      IsArchived.foreach(__v => __obj.update("IsArchived", __v.asInstanceOf[js.Any]))
      LastModifiedBy.foreach(__v => __obj.update("LastModifiedBy", __v.asInstanceOf[js.Any]))
      LastModifiedDate.foreach(__v => __obj.update("LastModifiedDate", __v.asInstanceOf[js.Any]))
      Platform.foreach(__v => __obj.update("Platform", __v.asInstanceOf[js.Any]))
      Version.foreach(__v => __obj.update("Version", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[APNSChannelResponse]
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
      val __obj = js.Dictionary.empty[js.Any]
      Action.foreach(__v => __obj.update("Action", __v.asInstanceOf[js.Any]))
      Badge.foreach(__v => __obj.update("Badge", __v.asInstanceOf[js.Any]))
      Body.foreach(__v => __obj.update("Body", __v.asInstanceOf[js.Any]))
      Category.foreach(__v => __obj.update("Category", __v.asInstanceOf[js.Any]))
      CollapseId.foreach(__v => __obj.update("CollapseId", __v.asInstanceOf[js.Any]))
      Data.foreach(__v => __obj.update("Data", __v.asInstanceOf[js.Any]))
      MediaUrl.foreach(__v => __obj.update("MediaUrl", __v.asInstanceOf[js.Any]))
      PreferredAuthenticationMethod.foreach(
        __v => __obj.update("PreferredAuthenticationMethod", __v.asInstanceOf[js.Any])
      )
      Priority.foreach(__v => __obj.update("Priority", __v.asInstanceOf[js.Any]))
      RawContent.foreach(__v => __obj.update("RawContent", __v.asInstanceOf[js.Any]))
      SilentPush.foreach(__v => __obj.update("SilentPush", __v.asInstanceOf[js.Any]))
      Sound.foreach(__v => __obj.update("Sound", __v.asInstanceOf[js.Any]))
      Substitutions.foreach(__v => __obj.update("Substitutions", __v.asInstanceOf[js.Any]))
      ThreadId.foreach(__v => __obj.update("ThreadId", __v.asInstanceOf[js.Any]))
      TimeToLive.foreach(__v => __obj.update("TimeToLive", __v.asInstanceOf[js.Any]))
      Title.foreach(__v => __obj.update("Title", __v.asInstanceOf[js.Any]))
      Url.foreach(__v => __obj.update("Url", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[APNSMessage]
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
      val __obj = js.Dictionary.empty[js.Any]
      BundleId.foreach(__v => __obj.update("BundleId", __v.asInstanceOf[js.Any]))
      Certificate.foreach(__v => __obj.update("Certificate", __v.asInstanceOf[js.Any]))
      DefaultAuthenticationMethod.foreach(__v => __obj.update("DefaultAuthenticationMethod", __v.asInstanceOf[js.Any]))
      Enabled.foreach(__v => __obj.update("Enabled", __v.asInstanceOf[js.Any]))
      PrivateKey.foreach(__v => __obj.update("PrivateKey", __v.asInstanceOf[js.Any]))
      TeamId.foreach(__v => __obj.update("TeamId", __v.asInstanceOf[js.Any]))
      TokenKey.foreach(__v => __obj.update("TokenKey", __v.asInstanceOf[js.Any]))
      TokenKeyId.foreach(__v => __obj.update("TokenKeyId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[APNSSandboxChannelRequest]
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
      val __obj = js.Dictionary.empty[js.Any]
      ApplicationId.foreach(__v => __obj.update("ApplicationId", __v.asInstanceOf[js.Any]))
      CreationDate.foreach(__v => __obj.update("CreationDate", __v.asInstanceOf[js.Any]))
      DefaultAuthenticationMethod.foreach(__v => __obj.update("DefaultAuthenticationMethod", __v.asInstanceOf[js.Any]))
      Enabled.foreach(__v => __obj.update("Enabled", __v.asInstanceOf[js.Any]))
      HasCredential.foreach(__v => __obj.update("HasCredential", __v.asInstanceOf[js.Any]))
      HasTokenKey.foreach(__v => __obj.update("HasTokenKey", __v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.update("Id", __v.asInstanceOf[js.Any]))
      IsArchived.foreach(__v => __obj.update("IsArchived", __v.asInstanceOf[js.Any]))
      LastModifiedBy.foreach(__v => __obj.update("LastModifiedBy", __v.asInstanceOf[js.Any]))
      LastModifiedDate.foreach(__v => __obj.update("LastModifiedDate", __v.asInstanceOf[js.Any]))
      Platform.foreach(__v => __obj.update("Platform", __v.asInstanceOf[js.Any]))
      Version.foreach(__v => __obj.update("Version", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[APNSSandboxChannelResponse]
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
      val __obj = js.Dictionary.empty[js.Any]
      BundleId.foreach(__v => __obj.update("BundleId", __v.asInstanceOf[js.Any]))
      Certificate.foreach(__v => __obj.update("Certificate", __v.asInstanceOf[js.Any]))
      DefaultAuthenticationMethod.foreach(__v => __obj.update("DefaultAuthenticationMethod", __v.asInstanceOf[js.Any]))
      Enabled.foreach(__v => __obj.update("Enabled", __v.asInstanceOf[js.Any]))
      PrivateKey.foreach(__v => __obj.update("PrivateKey", __v.asInstanceOf[js.Any]))
      TeamId.foreach(__v => __obj.update("TeamId", __v.asInstanceOf[js.Any]))
      TokenKey.foreach(__v => __obj.update("TokenKey", __v.asInstanceOf[js.Any]))
      TokenKeyId.foreach(__v => __obj.update("TokenKeyId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[APNSVoipChannelRequest]
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
      val __obj = js.Dictionary.empty[js.Any]
      ApplicationId.foreach(__v => __obj.update("ApplicationId", __v.asInstanceOf[js.Any]))
      CreationDate.foreach(__v => __obj.update("CreationDate", __v.asInstanceOf[js.Any]))
      DefaultAuthenticationMethod.foreach(__v => __obj.update("DefaultAuthenticationMethod", __v.asInstanceOf[js.Any]))
      Enabled.foreach(__v => __obj.update("Enabled", __v.asInstanceOf[js.Any]))
      HasCredential.foreach(__v => __obj.update("HasCredential", __v.asInstanceOf[js.Any]))
      HasTokenKey.foreach(__v => __obj.update("HasTokenKey", __v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.update("Id", __v.asInstanceOf[js.Any]))
      IsArchived.foreach(__v => __obj.update("IsArchived", __v.asInstanceOf[js.Any]))
      LastModifiedBy.foreach(__v => __obj.update("LastModifiedBy", __v.asInstanceOf[js.Any]))
      LastModifiedDate.foreach(__v => __obj.update("LastModifiedDate", __v.asInstanceOf[js.Any]))
      Platform.foreach(__v => __obj.update("Platform", __v.asInstanceOf[js.Any]))
      Version.foreach(__v => __obj.update("Version", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[APNSVoipChannelResponse]
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
      val __obj = js.Dictionary.empty[js.Any]
      BundleId.foreach(__v => __obj.update("BundleId", __v.asInstanceOf[js.Any]))
      Certificate.foreach(__v => __obj.update("Certificate", __v.asInstanceOf[js.Any]))
      DefaultAuthenticationMethod.foreach(__v => __obj.update("DefaultAuthenticationMethod", __v.asInstanceOf[js.Any]))
      Enabled.foreach(__v => __obj.update("Enabled", __v.asInstanceOf[js.Any]))
      PrivateKey.foreach(__v => __obj.update("PrivateKey", __v.asInstanceOf[js.Any]))
      TeamId.foreach(__v => __obj.update("TeamId", __v.asInstanceOf[js.Any]))
      TokenKey.foreach(__v => __obj.update("TokenKey", __v.asInstanceOf[js.Any]))
      TokenKeyId.foreach(__v => __obj.update("TokenKeyId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[APNSVoipSandboxChannelRequest]
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
      val __obj = js.Dictionary.empty[js.Any]
      ApplicationId.foreach(__v => __obj.update("ApplicationId", __v.asInstanceOf[js.Any]))
      CreationDate.foreach(__v => __obj.update("CreationDate", __v.asInstanceOf[js.Any]))
      DefaultAuthenticationMethod.foreach(__v => __obj.update("DefaultAuthenticationMethod", __v.asInstanceOf[js.Any]))
      Enabled.foreach(__v => __obj.update("Enabled", __v.asInstanceOf[js.Any]))
      HasCredential.foreach(__v => __obj.update("HasCredential", __v.asInstanceOf[js.Any]))
      HasTokenKey.foreach(__v => __obj.update("HasTokenKey", __v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.update("Id", __v.asInstanceOf[js.Any]))
      IsArchived.foreach(__v => __obj.update("IsArchived", __v.asInstanceOf[js.Any]))
      LastModifiedBy.foreach(__v => __obj.update("LastModifiedBy", __v.asInstanceOf[js.Any]))
      LastModifiedDate.foreach(__v => __obj.update("LastModifiedDate", __v.asInstanceOf[js.Any]))
      Platform.foreach(__v => __obj.update("Platform", __v.asInstanceOf[js.Any]))
      Version.foreach(__v => __obj.update("Version", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[APNSVoipSandboxChannelResponse]
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
      val __obj = js.Dictionary.empty[js.Any]
      Item.foreach(__v => __obj.update("Item", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ActivitiesResponse]
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
      val __obj = js.Dictionary.empty[js.Any]
      ApplicationId.foreach(__v => __obj.update("ApplicationId", __v.asInstanceOf[js.Any]))
      CampaignId.foreach(__v => __obj.update("CampaignId", __v.asInstanceOf[js.Any]))
      End.foreach(__v => __obj.update("End", __v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.update("Id", __v.asInstanceOf[js.Any]))
      Result.foreach(__v => __obj.update("Result", __v.asInstanceOf[js.Any]))
      ScheduledStart.foreach(__v => __obj.update("ScheduledStart", __v.asInstanceOf[js.Any]))
      Start.foreach(__v => __obj.update("Start", __v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.update("State", __v.asInstanceOf[js.Any]))
      SuccessfulEndpointCount.foreach(__v => __obj.update("SuccessfulEndpointCount", __v.asInstanceOf[js.Any]))
      TimezonesCompletedCount.foreach(__v => __obj.update("TimezonesCompletedCount", __v.asInstanceOf[js.Any]))
      TimezonesTotalCount.foreach(__v => __obj.update("TimezonesTotalCount", __v.asInstanceOf[js.Any]))
      TotalEndpointCount.foreach(__v => __obj.update("TotalEndpointCount", __v.asInstanceOf[js.Any]))
      TreatmentId.foreach(__v => __obj.update("TreatmentId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ActivityResponse]
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
      val __obj = js.Dictionary.empty[js.Any]
      BodyOverride.foreach(__v => __obj.update("BodyOverride", __v.asInstanceOf[js.Any]))
      ChannelType.foreach(__v => __obj.update("ChannelType", __v.asInstanceOf[js.Any]))
      Context.foreach(__v => __obj.update("Context", __v.asInstanceOf[js.Any]))
      RawContent.foreach(__v => __obj.update("RawContent", __v.asInstanceOf[js.Any]))
      Substitutions.foreach(__v => __obj.update("Substitutions", __v.asInstanceOf[js.Any]))
      TitleOverride.foreach(__v => __obj.update("TitleOverride", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AddressConfiguration]
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
      val __obj = js.Dictionary.empty[js.Any]
      Arn.foreach(__v => __obj.update("Arn", __v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.update("Id", __v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.update("tags", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ApplicationResponse]
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
      val __obj = js.Dictionary.empty[js.Any]
      ApplicationId.foreach(__v => __obj.update("ApplicationId", __v.asInstanceOf[js.Any]))
      CampaignHook.foreach(__v => __obj.update("CampaignHook", __v.asInstanceOf[js.Any]))
      LastModifiedDate.foreach(__v => __obj.update("LastModifiedDate", __v.asInstanceOf[js.Any]))
      Limits.foreach(__v => __obj.update("Limits", __v.asInstanceOf[js.Any]))
      QuietTime.foreach(__v => __obj.update("QuietTime", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ApplicationSettingsResource]
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
      val __obj = js.Dictionary.empty[js.Any]
      Item.foreach(__v => __obj.update("Item", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ApplicationsResponse]
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
      val __obj = js.Dictionary.empty[js.Any]
      AttributeType.foreach(__v => __obj.update("AttributeType", __v.asInstanceOf[js.Any]))
      Values.foreach(__v => __obj.update("Values", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AttributeDimension]
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
      val __obj = js.Dictionary.empty[js.Any]
      ApplicationId.foreach(__v => __obj.update("ApplicationId", __v.asInstanceOf[js.Any]))
      AttributeType.foreach(__v => __obj.update("AttributeType", __v.asInstanceOf[js.Any]))
      Attributes.foreach(__v => __obj.update("Attributes", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AttributesResource]
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
      val __obj = js.Dictionary.empty[js.Any]
      ApiKey.foreach(__v => __obj.update("ApiKey", __v.asInstanceOf[js.Any]))
      Enabled.foreach(__v => __obj.update("Enabled", __v.asInstanceOf[js.Any]))
      SecretKey.foreach(__v => __obj.update("SecretKey", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BaiduChannelRequest]
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
      val __obj = js.Dictionary.empty[js.Any]
      ApplicationId.foreach(__v => __obj.update("ApplicationId", __v.asInstanceOf[js.Any]))
      CreationDate.foreach(__v => __obj.update("CreationDate", __v.asInstanceOf[js.Any]))
      Credential.foreach(__v => __obj.update("Credential", __v.asInstanceOf[js.Any]))
      Enabled.foreach(__v => __obj.update("Enabled", __v.asInstanceOf[js.Any]))
      HasCredential.foreach(__v => __obj.update("HasCredential", __v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.update("Id", __v.asInstanceOf[js.Any]))
      IsArchived.foreach(__v => __obj.update("IsArchived", __v.asInstanceOf[js.Any]))
      LastModifiedBy.foreach(__v => __obj.update("LastModifiedBy", __v.asInstanceOf[js.Any]))
      LastModifiedDate.foreach(__v => __obj.update("LastModifiedDate", __v.asInstanceOf[js.Any]))
      Platform.foreach(__v => __obj.update("Platform", __v.asInstanceOf[js.Any]))
      Version.foreach(__v => __obj.update("Version", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BaiduChannelResponse]
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
      val __obj = js.Dictionary.empty[js.Any]
      Action.foreach(__v => __obj.update("Action", __v.asInstanceOf[js.Any]))
      Body.foreach(__v => __obj.update("Body", __v.asInstanceOf[js.Any]))
      Data.foreach(__v => __obj.update("Data", __v.asInstanceOf[js.Any]))
      IconReference.foreach(__v => __obj.update("IconReference", __v.asInstanceOf[js.Any]))
      ImageIconUrl.foreach(__v => __obj.update("ImageIconUrl", __v.asInstanceOf[js.Any]))
      ImageUrl.foreach(__v => __obj.update("ImageUrl", __v.asInstanceOf[js.Any]))
      RawContent.foreach(__v => __obj.update("RawContent", __v.asInstanceOf[js.Any]))
      SilentPush.foreach(__v => __obj.update("SilentPush", __v.asInstanceOf[js.Any]))
      SmallImageIconUrl.foreach(__v => __obj.update("SmallImageIconUrl", __v.asInstanceOf[js.Any]))
      Sound.foreach(__v => __obj.update("Sound", __v.asInstanceOf[js.Any]))
      Substitutions.foreach(__v => __obj.update("Substitutions", __v.asInstanceOf[js.Any]))
      TimeToLive.foreach(__v => __obj.update("TimeToLive", __v.asInstanceOf[js.Any]))
      Title.foreach(__v => __obj.update("Title", __v.asInstanceOf[js.Any]))
      Url.foreach(__v => __obj.update("Url", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BaiduMessage]
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
      val __obj = js.Dictionary.empty[js.Any]
      Body.foreach(__v => __obj.update("Body", __v.asInstanceOf[js.Any]))
      FromAddress.foreach(__v => __obj.update("FromAddress", __v.asInstanceOf[js.Any]))
      HtmlBody.foreach(__v => __obj.update("HtmlBody", __v.asInstanceOf[js.Any]))
      Title.foreach(__v => __obj.update("Title", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CampaignEmailMessage]
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
      val __obj = js.Dictionary.empty[js.Any]
      Dimensions.foreach(__v => __obj.update("Dimensions", __v.asInstanceOf[js.Any]))
      FilterType.foreach(__v => __obj.update("FilterType", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CampaignEventFilter]
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
      val __obj = js.Dictionary.empty[js.Any]
      LambdaFunctionName.foreach(__v => __obj.update("LambdaFunctionName", __v.asInstanceOf[js.Any]))
      Mode.foreach(__v => __obj.update("Mode", __v.asInstanceOf[js.Any]))
      WebUrl.foreach(__v => __obj.update("WebUrl", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CampaignHook]
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
      val __obj = js.Dictionary.empty[js.Any]
      Daily.foreach(__v => __obj.update("Daily", __v.asInstanceOf[js.Any]))
      MaximumDuration.foreach(__v => __obj.update("MaximumDuration", __v.asInstanceOf[js.Any]))
      MessagesPerSecond.foreach(__v => __obj.update("MessagesPerSecond", __v.asInstanceOf[js.Any]))
      Total.foreach(__v => __obj.update("Total", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CampaignLimits]
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
      val __obj = js.Dictionary.empty[js.Any]
      AdditionalTreatments.foreach(__v => __obj.update("AdditionalTreatments", __v.asInstanceOf[js.Any]))
      ApplicationId.foreach(__v => __obj.update("ApplicationId", __v.asInstanceOf[js.Any]))
      Arn.foreach(__v => __obj.update("Arn", __v.asInstanceOf[js.Any]))
      CreationDate.foreach(__v => __obj.update("CreationDate", __v.asInstanceOf[js.Any]))
      DefaultState.foreach(__v => __obj.update("DefaultState", __v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      HoldoutPercent.foreach(__v => __obj.update("HoldoutPercent", __v.asInstanceOf[js.Any]))
      Hook.foreach(__v => __obj.update("Hook", __v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.update("Id", __v.asInstanceOf[js.Any]))
      IsPaused.foreach(__v => __obj.update("IsPaused", __v.asInstanceOf[js.Any]))
      LastModifiedDate.foreach(__v => __obj.update("LastModifiedDate", __v.asInstanceOf[js.Any]))
      Limits.foreach(__v => __obj.update("Limits", __v.asInstanceOf[js.Any]))
      MessageConfiguration.foreach(__v => __obj.update("MessageConfiguration", __v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      Schedule.foreach(__v => __obj.update("Schedule", __v.asInstanceOf[js.Any]))
      SegmentId.foreach(__v => __obj.update("SegmentId", __v.asInstanceOf[js.Any]))
      SegmentVersion.foreach(__v => __obj.update("SegmentVersion", __v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.update("State", __v.asInstanceOf[js.Any]))
      TreatmentDescription.foreach(__v => __obj.update("TreatmentDescription", __v.asInstanceOf[js.Any]))
      TreatmentName.foreach(__v => __obj.update("TreatmentName", __v.asInstanceOf[js.Any]))
      Version.foreach(__v => __obj.update("Version", __v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.update("tags", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CampaignResponse]
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
      val __obj = js.Dictionary.empty[js.Any]
      Body.foreach(__v => __obj.update("Body", __v.asInstanceOf[js.Any]))
      MessageType.foreach(__v => __obj.update("MessageType", __v.asInstanceOf[js.Any]))
      SenderId.foreach(__v => __obj.update("SenderId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CampaignSmsMessage]
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
      val __obj = js.Dictionary.empty[js.Any]
      CampaignStatus.foreach(__v => __obj.update("CampaignStatus", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CampaignState]
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
      val __obj = js.Dictionary.empty[js.Any]
      Item.foreach(__v => __obj.update("Item", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CampaignsResponse]
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
      val __obj = js.Dictionary.empty[js.Any]
      ApplicationId.foreach(__v => __obj.update("ApplicationId", __v.asInstanceOf[js.Any]))
      CreationDate.foreach(__v => __obj.update("CreationDate", __v.asInstanceOf[js.Any]))
      Enabled.foreach(__v => __obj.update("Enabled", __v.asInstanceOf[js.Any]))
      HasCredential.foreach(__v => __obj.update("HasCredential", __v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.update("Id", __v.asInstanceOf[js.Any]))
      IsArchived.foreach(__v => __obj.update("IsArchived", __v.asInstanceOf[js.Any]))
      LastModifiedBy.foreach(__v => __obj.update("LastModifiedBy", __v.asInstanceOf[js.Any]))
      LastModifiedDate.foreach(__v => __obj.update("LastModifiedDate", __v.asInstanceOf[js.Any]))
      Version.foreach(__v => __obj.update("Version", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ChannelResponse]
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
      val __obj = js.Dictionary.empty[js.Any]
      Channels.foreach(__v => __obj.update("Channels", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ChannelsResponse]
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
      val __obj = js.Dictionary[js.Any](
        "CreateApplicationRequest" -> CreateApplicationRequest.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateAppRequest]
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
      val __obj = js.Dictionary[js.Any](
        "ApplicationResponse" -> ApplicationResponse.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateAppResponse]
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
      val __obj = js.Dictionary.empty[js.Any]
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.update("tags", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateApplicationRequest]
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
      val __obj = js.Dictionary[js.Any](
        "ApplicationId"        -> ApplicationId.asInstanceOf[js.Any],
        "WriteCampaignRequest" -> WriteCampaignRequest.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateCampaignRequest]
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
      val __obj = js.Dictionary[js.Any](
        "CampaignResponse" -> CampaignResponse.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateCampaignResponse]
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
      val __obj = js.Dictionary[js.Any](
        "ApplicationId"    -> ApplicationId.asInstanceOf[js.Any],
        "ExportJobRequest" -> ExportJobRequest.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateExportJobRequest]
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
      val __obj = js.Dictionary[js.Any](
        "ExportJobResponse" -> ExportJobResponse.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateExportJobResponse]
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
      val __obj = js.Dictionary[js.Any](
        "ApplicationId"    -> ApplicationId.asInstanceOf[js.Any],
        "ImportJobRequest" -> ImportJobRequest.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateImportJobRequest]
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
      val __obj = js.Dictionary[js.Any](
        "ImportJobResponse" -> ImportJobResponse.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateImportJobResponse]
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
      val __obj = js.Dictionary[js.Any](
        "ApplicationId"       -> ApplicationId.asInstanceOf[js.Any],
        "WriteSegmentRequest" -> WriteSegmentRequest.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateSegmentRequest]
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
      val __obj = js.Dictionary[js.Any](
        "SegmentResponse" -> SegmentResponse.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateSegmentResponse]
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
      val __obj = js.Dictionary.empty[js.Any]
      Body.foreach(__v => __obj.update("Body", __v.asInstanceOf[js.Any]))
      Substitutions.foreach(__v => __obj.update("Substitutions", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DefaultMessage]
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
      val __obj = js.Dictionary.empty[js.Any]
      Action.foreach(__v => __obj.update("Action", __v.asInstanceOf[js.Any]))
      Body.foreach(__v => __obj.update("Body", __v.asInstanceOf[js.Any]))
      Data.foreach(__v => __obj.update("Data", __v.asInstanceOf[js.Any]))
      SilentPush.foreach(__v => __obj.update("SilentPush", __v.asInstanceOf[js.Any]))
      Substitutions.foreach(__v => __obj.update("Substitutions", __v.asInstanceOf[js.Any]))
      Title.foreach(__v => __obj.update("Title", __v.asInstanceOf[js.Any]))
      Url.foreach(__v => __obj.update("Url", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DefaultPushNotificationMessage]
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
      val __obj = js.Dictionary[js.Any](
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteAdmChannelRequest]
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
      val __obj = js.Dictionary[js.Any](
        "ADMChannelResponse" -> ADMChannelResponse.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteAdmChannelResponse]
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
      val __obj = js.Dictionary[js.Any](
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteApnsChannelRequest]
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
      val __obj = js.Dictionary[js.Any](
        "APNSChannelResponse" -> APNSChannelResponse.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteApnsChannelResponse]
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
      val __obj = js.Dictionary[js.Any](
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteApnsSandboxChannelRequest]
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
      val __obj = js.Dictionary[js.Any](
        "APNSSandboxChannelResponse" -> APNSSandboxChannelResponse.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteApnsSandboxChannelResponse]
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
      val __obj = js.Dictionary[js.Any](
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteApnsVoipChannelRequest]
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
      val __obj = js.Dictionary[js.Any](
        "APNSVoipChannelResponse" -> APNSVoipChannelResponse.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteApnsVoipChannelResponse]
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
      val __obj = js.Dictionary[js.Any](
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteApnsVoipSandboxChannelRequest]
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
      val __obj = js.Dictionary[js.Any](
        "APNSVoipSandboxChannelResponse" -> APNSVoipSandboxChannelResponse.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteApnsVoipSandboxChannelResponse]
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
      val __obj = js.Dictionary[js.Any](
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteAppRequest]
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
      val __obj = js.Dictionary[js.Any](
        "ApplicationResponse" -> ApplicationResponse.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteAppResponse]
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
      val __obj = js.Dictionary[js.Any](
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteBaiduChannelRequest]
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
      val __obj = js.Dictionary[js.Any](
        "BaiduChannelResponse" -> BaiduChannelResponse.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteBaiduChannelResponse]
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
      val __obj = js.Dictionary[js.Any](
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any],
        "CampaignId"    -> CampaignId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteCampaignRequest]
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
      val __obj = js.Dictionary[js.Any](
        "CampaignResponse" -> CampaignResponse.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteCampaignResponse]
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
      val __obj = js.Dictionary[js.Any](
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteEmailChannelRequest]
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
      val __obj = js.Dictionary[js.Any](
        "EmailChannelResponse" -> EmailChannelResponse.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteEmailChannelResponse]
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
      val __obj = js.Dictionary[js.Any](
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any],
        "EndpointId"    -> EndpointId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteEndpointRequest]
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
      val __obj = js.Dictionary[js.Any](
        "EndpointResponse" -> EndpointResponse.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteEndpointResponse]
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
      val __obj = js.Dictionary[js.Any](
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteEventStreamRequest]
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
      val __obj = js.Dictionary[js.Any](
        "EventStream" -> EventStream.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteEventStreamResponse]
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
      val __obj = js.Dictionary[js.Any](
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteGcmChannelRequest]
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
      val __obj = js.Dictionary[js.Any](
        "GCMChannelResponse" -> GCMChannelResponse.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteGcmChannelResponse]
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
      val __obj = js.Dictionary[js.Any](
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any],
        "SegmentId"     -> SegmentId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteSegmentRequest]
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
      val __obj = js.Dictionary[js.Any](
        "SegmentResponse" -> SegmentResponse.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteSegmentResponse]
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
      val __obj = js.Dictionary[js.Any](
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteSmsChannelRequest]
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
      val __obj = js.Dictionary[js.Any](
        "SMSChannelResponse" -> SMSChannelResponse.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteSmsChannelResponse]
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
      val __obj = js.Dictionary[js.Any](
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any],
        "UserId"        -> UserId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteUserEndpointsRequest]
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
      val __obj = js.Dictionary[js.Any](
        "EndpointsResponse" -> EndpointsResponse.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteUserEndpointsResponse]
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
      val __obj = js.Dictionary[js.Any](
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteVoiceChannelRequest]
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
      val __obj = js.Dictionary[js.Any](
        "VoiceChannelResponse" -> VoiceChannelResponse.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteVoiceChannelResponse]
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
      val __obj = js.Dictionary.empty[js.Any]
      ADMMessage.foreach(__v => __obj.update("ADMMessage", __v.asInstanceOf[js.Any]))
      APNSMessage.foreach(__v => __obj.update("APNSMessage", __v.asInstanceOf[js.Any]))
      BaiduMessage.foreach(__v => __obj.update("BaiduMessage", __v.asInstanceOf[js.Any]))
      DefaultMessage.foreach(__v => __obj.update("DefaultMessage", __v.asInstanceOf[js.Any]))
      DefaultPushNotificationMessage.foreach(
        __v => __obj.update("DefaultPushNotificationMessage", __v.asInstanceOf[js.Any])
      )
      EmailMessage.foreach(__v => __obj.update("EmailMessage", __v.asInstanceOf[js.Any]))
      GCMMessage.foreach(__v => __obj.update("GCMMessage", __v.asInstanceOf[js.Any]))
      SMSMessage.foreach(__v => __obj.update("SMSMessage", __v.asInstanceOf[js.Any]))
      VoiceMessage.foreach(__v => __obj.update("VoiceMessage", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DirectMessageConfiguration]
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
      val __obj = js.Dictionary.empty[js.Any]
      ConfigurationSet.foreach(__v => __obj.update("ConfigurationSet", __v.asInstanceOf[js.Any]))
      Enabled.foreach(__v => __obj.update("Enabled", __v.asInstanceOf[js.Any]))
      FromAddress.foreach(__v => __obj.update("FromAddress", __v.asInstanceOf[js.Any]))
      Identity.foreach(__v => __obj.update("Identity", __v.asInstanceOf[js.Any]))
      RoleArn.foreach(__v => __obj.update("RoleArn", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EmailChannelRequest]
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
      val __obj = js.Dictionary.empty[js.Any]
      ApplicationId.foreach(__v => __obj.update("ApplicationId", __v.asInstanceOf[js.Any]))
      ConfigurationSet.foreach(__v => __obj.update("ConfigurationSet", __v.asInstanceOf[js.Any]))
      CreationDate.foreach(__v => __obj.update("CreationDate", __v.asInstanceOf[js.Any]))
      Enabled.foreach(__v => __obj.update("Enabled", __v.asInstanceOf[js.Any]))
      FromAddress.foreach(__v => __obj.update("FromAddress", __v.asInstanceOf[js.Any]))
      HasCredential.foreach(__v => __obj.update("HasCredential", __v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.update("Id", __v.asInstanceOf[js.Any]))
      Identity.foreach(__v => __obj.update("Identity", __v.asInstanceOf[js.Any]))
      IsArchived.foreach(__v => __obj.update("IsArchived", __v.asInstanceOf[js.Any]))
      LastModifiedBy.foreach(__v => __obj.update("LastModifiedBy", __v.asInstanceOf[js.Any]))
      LastModifiedDate.foreach(__v => __obj.update("LastModifiedDate", __v.asInstanceOf[js.Any]))
      MessagesPerSecond.foreach(__v => __obj.update("MessagesPerSecond", __v.asInstanceOf[js.Any]))
      Platform.foreach(__v => __obj.update("Platform", __v.asInstanceOf[js.Any]))
      RoleArn.foreach(__v => __obj.update("RoleArn", __v.asInstanceOf[js.Any]))
      Version.foreach(__v => __obj.update("Version", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EmailChannelResponse]
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
      val __obj = js.Dictionary.empty[js.Any]
      Body.foreach(__v => __obj.update("Body", __v.asInstanceOf[js.Any]))
      FeedbackForwardingAddress.foreach(__v => __obj.update("FeedbackForwardingAddress", __v.asInstanceOf[js.Any]))
      FromAddress.foreach(__v => __obj.update("FromAddress", __v.asInstanceOf[js.Any]))
      RawEmail.foreach(__v => __obj.update("RawEmail", __v.asInstanceOf[js.Any]))
      ReplyToAddresses.foreach(__v => __obj.update("ReplyToAddresses", __v.asInstanceOf[js.Any]))
      SimpleEmail.foreach(__v => __obj.update("SimpleEmail", __v.asInstanceOf[js.Any]))
      Substitutions.foreach(__v => __obj.update("Substitutions", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EmailMessage]
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
      val __obj = js.Dictionary.empty[js.Any]
      Address.foreach(__v => __obj.update("Address", __v.asInstanceOf[js.Any]))
      Attributes.foreach(__v => __obj.update("Attributes", __v.asInstanceOf[js.Any]))
      ChannelType.foreach(__v => __obj.update("ChannelType", __v.asInstanceOf[js.Any]))
      Demographic.foreach(__v => __obj.update("Demographic", __v.asInstanceOf[js.Any]))
      EffectiveDate.foreach(__v => __obj.update("EffectiveDate", __v.asInstanceOf[js.Any]))
      EndpointStatus.foreach(__v => __obj.update("EndpointStatus", __v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.update("Id", __v.asInstanceOf[js.Any]))
      Location.foreach(__v => __obj.update("Location", __v.asInstanceOf[js.Any]))
      Metrics.foreach(__v => __obj.update("Metrics", __v.asInstanceOf[js.Any]))
      OptOut.foreach(__v => __obj.update("OptOut", __v.asInstanceOf[js.Any]))
      RequestId.foreach(__v => __obj.update("RequestId", __v.asInstanceOf[js.Any]))
      User.foreach(__v => __obj.update("User", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EndpointBatchItem]
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
      val __obj = js.Dictionary.empty[js.Any]
      Item.foreach(__v => __obj.update("Item", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EndpointBatchRequest]
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
      val __obj = js.Dictionary.empty[js.Any]
      AppVersion.foreach(__v => __obj.update("AppVersion", __v.asInstanceOf[js.Any]))
      Locale.foreach(__v => __obj.update("Locale", __v.asInstanceOf[js.Any]))
      Make.foreach(__v => __obj.update("Make", __v.asInstanceOf[js.Any]))
      Model.foreach(__v => __obj.update("Model", __v.asInstanceOf[js.Any]))
      ModelVersion.foreach(__v => __obj.update("ModelVersion", __v.asInstanceOf[js.Any]))
      Platform.foreach(__v => __obj.update("Platform", __v.asInstanceOf[js.Any]))
      PlatformVersion.foreach(__v => __obj.update("PlatformVersion", __v.asInstanceOf[js.Any]))
      Timezone.foreach(__v => __obj.update("Timezone", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EndpointDemographic]
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
      val __obj = js.Dictionary.empty[js.Any]
      Message.foreach(__v => __obj.update("Message", __v.asInstanceOf[js.Any]))
      StatusCode.foreach(__v => __obj.update("StatusCode", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EndpointItemResponse]
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
      val __obj = js.Dictionary.empty[js.Any]
      City.foreach(__v => __obj.update("City", __v.asInstanceOf[js.Any]))
      Country.foreach(__v => __obj.update("Country", __v.asInstanceOf[js.Any]))
      Latitude.foreach(__v => __obj.update("Latitude", __v.asInstanceOf[js.Any]))
      Longitude.foreach(__v => __obj.update("Longitude", __v.asInstanceOf[js.Any]))
      PostalCode.foreach(__v => __obj.update("PostalCode", __v.asInstanceOf[js.Any]))
      Region.foreach(__v => __obj.update("Region", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EndpointLocation]
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
      val __obj = js.Dictionary.empty[js.Any]
      Address.foreach(__v => __obj.update("Address", __v.asInstanceOf[js.Any]))
      DeliveryStatus.foreach(__v => __obj.update("DeliveryStatus", __v.asInstanceOf[js.Any]))
      MessageId.foreach(__v => __obj.update("MessageId", __v.asInstanceOf[js.Any]))
      StatusCode.foreach(__v => __obj.update("StatusCode", __v.asInstanceOf[js.Any]))
      StatusMessage.foreach(__v => __obj.update("StatusMessage", __v.asInstanceOf[js.Any]))
      UpdatedToken.foreach(__v => __obj.update("UpdatedToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EndpointMessageResult]
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
      val __obj = js.Dictionary.empty[js.Any]
      Address.foreach(__v => __obj.update("Address", __v.asInstanceOf[js.Any]))
      Attributes.foreach(__v => __obj.update("Attributes", __v.asInstanceOf[js.Any]))
      ChannelType.foreach(__v => __obj.update("ChannelType", __v.asInstanceOf[js.Any]))
      Demographic.foreach(__v => __obj.update("Demographic", __v.asInstanceOf[js.Any]))
      EffectiveDate.foreach(__v => __obj.update("EffectiveDate", __v.asInstanceOf[js.Any]))
      EndpointStatus.foreach(__v => __obj.update("EndpointStatus", __v.asInstanceOf[js.Any]))
      Location.foreach(__v => __obj.update("Location", __v.asInstanceOf[js.Any]))
      Metrics.foreach(__v => __obj.update("Metrics", __v.asInstanceOf[js.Any]))
      OptOut.foreach(__v => __obj.update("OptOut", __v.asInstanceOf[js.Any]))
      RequestId.foreach(__v => __obj.update("RequestId", __v.asInstanceOf[js.Any]))
      User.foreach(__v => __obj.update("User", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EndpointRequest]
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
      val __obj = js.Dictionary.empty[js.Any]
      Address.foreach(__v => __obj.update("Address", __v.asInstanceOf[js.Any]))
      ApplicationId.foreach(__v => __obj.update("ApplicationId", __v.asInstanceOf[js.Any]))
      Attributes.foreach(__v => __obj.update("Attributes", __v.asInstanceOf[js.Any]))
      ChannelType.foreach(__v => __obj.update("ChannelType", __v.asInstanceOf[js.Any]))
      CohortId.foreach(__v => __obj.update("CohortId", __v.asInstanceOf[js.Any]))
      CreationDate.foreach(__v => __obj.update("CreationDate", __v.asInstanceOf[js.Any]))
      Demographic.foreach(__v => __obj.update("Demographic", __v.asInstanceOf[js.Any]))
      EffectiveDate.foreach(__v => __obj.update("EffectiveDate", __v.asInstanceOf[js.Any]))
      EndpointStatus.foreach(__v => __obj.update("EndpointStatus", __v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.update("Id", __v.asInstanceOf[js.Any]))
      Location.foreach(__v => __obj.update("Location", __v.asInstanceOf[js.Any]))
      Metrics.foreach(__v => __obj.update("Metrics", __v.asInstanceOf[js.Any]))
      OptOut.foreach(__v => __obj.update("OptOut", __v.asInstanceOf[js.Any]))
      RequestId.foreach(__v => __obj.update("RequestId", __v.asInstanceOf[js.Any]))
      User.foreach(__v => __obj.update("User", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EndpointResponse]
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
      val __obj = js.Dictionary.empty[js.Any]
      BodyOverride.foreach(__v => __obj.update("BodyOverride", __v.asInstanceOf[js.Any]))
      Context.foreach(__v => __obj.update("Context", __v.asInstanceOf[js.Any]))
      RawContent.foreach(__v => __obj.update("RawContent", __v.asInstanceOf[js.Any]))
      Substitutions.foreach(__v => __obj.update("Substitutions", __v.asInstanceOf[js.Any]))
      TitleOverride.foreach(__v => __obj.update("TitleOverride", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EndpointSendConfiguration]
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
      val __obj = js.Dictionary.empty[js.Any]
      UserAttributes.foreach(__v => __obj.update("UserAttributes", __v.asInstanceOf[js.Any]))
      UserId.foreach(__v => __obj.update("UserId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EndpointUser]
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
      val __obj = js.Dictionary.empty[js.Any]
      Item.foreach(__v => __obj.update("Item", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EndpointsResponse]
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
      val __obj = js.Dictionary.empty[js.Any]
      AppPackageName.foreach(__v => __obj.update("AppPackageName", __v.asInstanceOf[js.Any]))
      AppTitle.foreach(__v => __obj.update("AppTitle", __v.asInstanceOf[js.Any]))
      AppVersionCode.foreach(__v => __obj.update("AppVersionCode", __v.asInstanceOf[js.Any]))
      Attributes.foreach(__v => __obj.update("Attributes", __v.asInstanceOf[js.Any]))
      ClientSdkVersion.foreach(__v => __obj.update("ClientSdkVersion", __v.asInstanceOf[js.Any]))
      EventType.foreach(__v => __obj.update("EventType", __v.asInstanceOf[js.Any]))
      Metrics.foreach(__v => __obj.update("Metrics", __v.asInstanceOf[js.Any]))
      SdkName.foreach(__v => __obj.update("SdkName", __v.asInstanceOf[js.Any]))
      Session.foreach(__v => __obj.update("Session", __v.asInstanceOf[js.Any]))
      Timestamp.foreach(__v => __obj.update("Timestamp", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Event]
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
      val __obj = js.Dictionary.empty[js.Any]
      Attributes.foreach(__v => __obj.update("Attributes", __v.asInstanceOf[js.Any]))
      EventType.foreach(__v => __obj.update("EventType", __v.asInstanceOf[js.Any]))
      Metrics.foreach(__v => __obj.update("Metrics", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EventDimensions]
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
      val __obj = js.Dictionary.empty[js.Any]
      Message.foreach(__v => __obj.update("Message", __v.asInstanceOf[js.Any]))
      StatusCode.foreach(__v => __obj.update("StatusCode", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EventItemResponse]
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
      val __obj = js.Dictionary.empty[js.Any]
      ApplicationId.foreach(__v => __obj.update("ApplicationId", __v.asInstanceOf[js.Any]))
      DestinationStreamArn.foreach(__v => __obj.update("DestinationStreamArn", __v.asInstanceOf[js.Any]))
      ExternalId.foreach(__v => __obj.update("ExternalId", __v.asInstanceOf[js.Any]))
      LastModifiedDate.foreach(__v => __obj.update("LastModifiedDate", __v.asInstanceOf[js.Any]))
      LastUpdatedBy.foreach(__v => __obj.update("LastUpdatedBy", __v.asInstanceOf[js.Any]))
      RoleArn.foreach(__v => __obj.update("RoleArn", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EventStream]
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
      val __obj = js.Dictionary.empty[js.Any]
      Endpoint.foreach(__v => __obj.update("Endpoint", __v.asInstanceOf[js.Any]))
      Events.foreach(__v => __obj.update("Events", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EventsBatch]
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
      val __obj = js.Dictionary.empty[js.Any]
      BatchItem.foreach(__v => __obj.update("BatchItem", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EventsRequest]
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
      val __obj = js.Dictionary.empty[js.Any]
      Results.foreach(__v => __obj.update("Results", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EventsResponse]
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
      val __obj = js.Dictionary.empty[js.Any]
      RoleArn.foreach(__v => __obj.update("RoleArn", __v.asInstanceOf[js.Any]))
      S3UrlPrefix.foreach(__v => __obj.update("S3UrlPrefix", __v.asInstanceOf[js.Any]))
      SegmentId.foreach(__v => __obj.update("SegmentId", __v.asInstanceOf[js.Any]))
      SegmentVersion.foreach(__v => __obj.update("SegmentVersion", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ExportJobRequest]
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
      val __obj = js.Dictionary.empty[js.Any]
      RoleArn.foreach(__v => __obj.update("RoleArn", __v.asInstanceOf[js.Any]))
      S3UrlPrefix.foreach(__v => __obj.update("S3UrlPrefix", __v.asInstanceOf[js.Any]))
      SegmentId.foreach(__v => __obj.update("SegmentId", __v.asInstanceOf[js.Any]))
      SegmentVersion.foreach(__v => __obj.update("SegmentVersion", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ExportJobResource]
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
      val __obj = js.Dictionary.empty[js.Any]
      ApplicationId.foreach(__v => __obj.update("ApplicationId", __v.asInstanceOf[js.Any]))
      CompletedPieces.foreach(__v => __obj.update("CompletedPieces", __v.asInstanceOf[js.Any]))
      CompletionDate.foreach(__v => __obj.update("CompletionDate", __v.asInstanceOf[js.Any]))
      CreationDate.foreach(__v => __obj.update("CreationDate", __v.asInstanceOf[js.Any]))
      Definition.foreach(__v => __obj.update("Definition", __v.asInstanceOf[js.Any]))
      FailedPieces.foreach(__v => __obj.update("FailedPieces", __v.asInstanceOf[js.Any]))
      Failures.foreach(__v => __obj.update("Failures", __v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.update("Id", __v.asInstanceOf[js.Any]))
      JobStatus.foreach(__v => __obj.update("JobStatus", __v.asInstanceOf[js.Any]))
      TotalFailures.foreach(__v => __obj.update("TotalFailures", __v.asInstanceOf[js.Any]))
      TotalPieces.foreach(__v => __obj.update("TotalPieces", __v.asInstanceOf[js.Any]))
      TotalProcessed.foreach(__v => __obj.update("TotalProcessed", __v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.update("Type", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ExportJobResponse]
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
      val __obj = js.Dictionary.empty[js.Any]
      Item.foreach(__v => __obj.update("Item", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ExportJobsResponse]
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
      val __obj = js.Dictionary.empty[js.Any]
      ApiKey.foreach(__v => __obj.update("ApiKey", __v.asInstanceOf[js.Any]))
      Enabled.foreach(__v => __obj.update("Enabled", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GCMChannelRequest]
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
      val __obj = js.Dictionary.empty[js.Any]
      ApplicationId.foreach(__v => __obj.update("ApplicationId", __v.asInstanceOf[js.Any]))
      CreationDate.foreach(__v => __obj.update("CreationDate", __v.asInstanceOf[js.Any]))
      Credential.foreach(__v => __obj.update("Credential", __v.asInstanceOf[js.Any]))
      Enabled.foreach(__v => __obj.update("Enabled", __v.asInstanceOf[js.Any]))
      HasCredential.foreach(__v => __obj.update("HasCredential", __v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.update("Id", __v.asInstanceOf[js.Any]))
      IsArchived.foreach(__v => __obj.update("IsArchived", __v.asInstanceOf[js.Any]))
      LastModifiedBy.foreach(__v => __obj.update("LastModifiedBy", __v.asInstanceOf[js.Any]))
      LastModifiedDate.foreach(__v => __obj.update("LastModifiedDate", __v.asInstanceOf[js.Any]))
      Platform.foreach(__v => __obj.update("Platform", __v.asInstanceOf[js.Any]))
      Version.foreach(__v => __obj.update("Version", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GCMChannelResponse]
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
      val __obj = js.Dictionary.empty[js.Any]
      Action.foreach(__v => __obj.update("Action", __v.asInstanceOf[js.Any]))
      Body.foreach(__v => __obj.update("Body", __v.asInstanceOf[js.Any]))
      CollapseKey.foreach(__v => __obj.update("CollapseKey", __v.asInstanceOf[js.Any]))
      Data.foreach(__v => __obj.update("Data", __v.asInstanceOf[js.Any]))
      IconReference.foreach(__v => __obj.update("IconReference", __v.asInstanceOf[js.Any]))
      ImageIconUrl.foreach(__v => __obj.update("ImageIconUrl", __v.asInstanceOf[js.Any]))
      ImageUrl.foreach(__v => __obj.update("ImageUrl", __v.asInstanceOf[js.Any]))
      Priority.foreach(__v => __obj.update("Priority", __v.asInstanceOf[js.Any]))
      RawContent.foreach(__v => __obj.update("RawContent", __v.asInstanceOf[js.Any]))
      RestrictedPackageName.foreach(__v => __obj.update("RestrictedPackageName", __v.asInstanceOf[js.Any]))
      SilentPush.foreach(__v => __obj.update("SilentPush", __v.asInstanceOf[js.Any]))
      SmallImageIconUrl.foreach(__v => __obj.update("SmallImageIconUrl", __v.asInstanceOf[js.Any]))
      Sound.foreach(__v => __obj.update("Sound", __v.asInstanceOf[js.Any]))
      Substitutions.foreach(__v => __obj.update("Substitutions", __v.asInstanceOf[js.Any]))
      TimeToLive.foreach(__v => __obj.update("TimeToLive", __v.asInstanceOf[js.Any]))
      Title.foreach(__v => __obj.update("Title", __v.asInstanceOf[js.Any]))
      Url.foreach(__v => __obj.update("Url", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GCMMessage]
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
      val __obj = js.Dictionary.empty[js.Any]
      Latitude.foreach(__v => __obj.update("Latitude", __v.asInstanceOf[js.Any]))
      Longitude.foreach(__v => __obj.update("Longitude", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GPSCoordinates]
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
      val __obj = js.Dictionary.empty[js.Any]
      Coordinates.foreach(__v => __obj.update("Coordinates", __v.asInstanceOf[js.Any]))
      RangeInKilometers.foreach(__v => __obj.update("RangeInKilometers", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GPSPointDimension]
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
      val __obj = js.Dictionary[js.Any](
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetAdmChannelRequest]
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
      val __obj = js.Dictionary[js.Any](
        "ADMChannelResponse" -> ADMChannelResponse.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetAdmChannelResponse]
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
      val __obj = js.Dictionary[js.Any](
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetApnsChannelRequest]
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
      val __obj = js.Dictionary[js.Any](
        "APNSChannelResponse" -> APNSChannelResponse.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetApnsChannelResponse]
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
      val __obj = js.Dictionary[js.Any](
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetApnsSandboxChannelRequest]
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
      val __obj = js.Dictionary[js.Any](
        "APNSSandboxChannelResponse" -> APNSSandboxChannelResponse.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetApnsSandboxChannelResponse]
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
      val __obj = js.Dictionary[js.Any](
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetApnsVoipChannelRequest]
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
      val __obj = js.Dictionary[js.Any](
        "APNSVoipChannelResponse" -> APNSVoipChannelResponse.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetApnsVoipChannelResponse]
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
      val __obj = js.Dictionary[js.Any](
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetApnsVoipSandboxChannelRequest]
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
      val __obj = js.Dictionary[js.Any](
        "APNSVoipSandboxChannelResponse" -> APNSVoipSandboxChannelResponse.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetApnsVoipSandboxChannelResponse]
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
      val __obj = js.Dictionary[js.Any](
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetAppRequest]
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
      val __obj = js.Dictionary[js.Any](
        "ApplicationResponse" -> ApplicationResponse.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetAppResponse]
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
      val __obj = js.Dictionary[js.Any](
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetApplicationSettingsRequest]
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
      val __obj = js.Dictionary[js.Any](
        "ApplicationSettingsResource" -> ApplicationSettingsResource.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetApplicationSettingsResponse]
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
      val __obj = js.Dictionary.empty[js.Any]
      PageSize.foreach(__v => __obj.update("PageSize", __v.asInstanceOf[js.Any]))
      Token.foreach(__v => __obj.update("Token", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetAppsRequest]
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
      val __obj = js.Dictionary[js.Any](
        "ApplicationsResponse" -> ApplicationsResponse.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetAppsResponse]
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
      val __obj = js.Dictionary[js.Any](
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetBaiduChannelRequest]
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
      val __obj = js.Dictionary[js.Any](
        "BaiduChannelResponse" -> BaiduChannelResponse.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetBaiduChannelResponse]
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
      val __obj = js.Dictionary[js.Any](
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any],
        "CampaignId"    -> CampaignId.asInstanceOf[js.Any]
      )

      PageSize.foreach(__v => __obj.update("PageSize", __v.asInstanceOf[js.Any]))
      Token.foreach(__v => __obj.update("Token", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetCampaignActivitiesRequest]
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
      val __obj = js.Dictionary[js.Any](
        "ActivitiesResponse" -> ActivitiesResponse.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetCampaignActivitiesResponse]
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
      val __obj = js.Dictionary[js.Any](
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any],
        "CampaignId"    -> CampaignId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetCampaignRequest]
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
      val __obj = js.Dictionary[js.Any](
        "CampaignResponse" -> CampaignResponse.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetCampaignResponse]
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
      val __obj = js.Dictionary[js.Any](
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any],
        "CampaignId"    -> CampaignId.asInstanceOf[js.Any],
        "Version"       -> Version.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetCampaignVersionRequest]
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
      val __obj = js.Dictionary[js.Any](
        "CampaignResponse" -> CampaignResponse.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetCampaignVersionResponse]
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
      val __obj = js.Dictionary[js.Any](
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any],
        "CampaignId"    -> CampaignId.asInstanceOf[js.Any]
      )

      PageSize.foreach(__v => __obj.update("PageSize", __v.asInstanceOf[js.Any]))
      Token.foreach(__v => __obj.update("Token", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetCampaignVersionsRequest]
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
      val __obj = js.Dictionary[js.Any](
        "CampaignsResponse" -> CampaignsResponse.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetCampaignVersionsResponse]
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
      val __obj = js.Dictionary[js.Any](
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any]
      )

      PageSize.foreach(__v => __obj.update("PageSize", __v.asInstanceOf[js.Any]))
      Token.foreach(__v => __obj.update("Token", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetCampaignsRequest]
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
      val __obj = js.Dictionary[js.Any](
        "CampaignsResponse" -> CampaignsResponse.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetCampaignsResponse]
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
      val __obj = js.Dictionary[js.Any](
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetChannelsRequest]
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
      val __obj = js.Dictionary[js.Any](
        "ChannelsResponse" -> ChannelsResponse.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetChannelsResponse]
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
      val __obj = js.Dictionary[js.Any](
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetEmailChannelRequest]
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
      val __obj = js.Dictionary[js.Any](
        "EmailChannelResponse" -> EmailChannelResponse.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetEmailChannelResponse]
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
      val __obj = js.Dictionary[js.Any](
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any],
        "EndpointId"    -> EndpointId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetEndpointRequest]
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
      val __obj = js.Dictionary[js.Any](
        "EndpointResponse" -> EndpointResponse.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetEndpointResponse]
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
      val __obj = js.Dictionary[js.Any](
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetEventStreamRequest]
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
      val __obj = js.Dictionary[js.Any](
        "EventStream" -> EventStream.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetEventStreamResponse]
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
      val __obj = js.Dictionary[js.Any](
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any],
        "JobId"         -> JobId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetExportJobRequest]
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
      val __obj = js.Dictionary[js.Any](
        "ExportJobResponse" -> ExportJobResponse.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetExportJobResponse]
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
      val __obj = js.Dictionary[js.Any](
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any]
      )

      PageSize.foreach(__v => __obj.update("PageSize", __v.asInstanceOf[js.Any]))
      Token.foreach(__v => __obj.update("Token", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetExportJobsRequest]
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
      val __obj = js.Dictionary[js.Any](
        "ExportJobsResponse" -> ExportJobsResponse.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetExportJobsResponse]
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
      val __obj = js.Dictionary[js.Any](
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetGcmChannelRequest]
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
      val __obj = js.Dictionary[js.Any](
        "GCMChannelResponse" -> GCMChannelResponse.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetGcmChannelResponse]
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
      val __obj = js.Dictionary[js.Any](
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any],
        "JobId"         -> JobId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetImportJobRequest]
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
      val __obj = js.Dictionary[js.Any](
        "ImportJobResponse" -> ImportJobResponse.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetImportJobResponse]
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
      val __obj = js.Dictionary[js.Any](
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any]
      )

      PageSize.foreach(__v => __obj.update("PageSize", __v.asInstanceOf[js.Any]))
      Token.foreach(__v => __obj.update("Token", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetImportJobsRequest]
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
      val __obj = js.Dictionary[js.Any](
        "ImportJobsResponse" -> ImportJobsResponse.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetImportJobsResponse]
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
      val __obj = js.Dictionary[js.Any](
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any],
        "SegmentId"     -> SegmentId.asInstanceOf[js.Any]
      )

      PageSize.foreach(__v => __obj.update("PageSize", __v.asInstanceOf[js.Any]))
      Token.foreach(__v => __obj.update("Token", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetSegmentExportJobsRequest]
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
      val __obj = js.Dictionary[js.Any](
        "ExportJobsResponse" -> ExportJobsResponse.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetSegmentExportJobsResponse]
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
      val __obj = js.Dictionary[js.Any](
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any],
        "SegmentId"     -> SegmentId.asInstanceOf[js.Any]
      )

      PageSize.foreach(__v => __obj.update("PageSize", __v.asInstanceOf[js.Any]))
      Token.foreach(__v => __obj.update("Token", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetSegmentImportJobsRequest]
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
      val __obj = js.Dictionary[js.Any](
        "ImportJobsResponse" -> ImportJobsResponse.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetSegmentImportJobsResponse]
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
      val __obj = js.Dictionary[js.Any](
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any],
        "SegmentId"     -> SegmentId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetSegmentRequest]
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
      val __obj = js.Dictionary[js.Any](
        "SegmentResponse" -> SegmentResponse.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetSegmentResponse]
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
      val __obj = js.Dictionary[js.Any](
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any],
        "SegmentId"     -> SegmentId.asInstanceOf[js.Any],
        "Version"       -> Version.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetSegmentVersionRequest]
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
      val __obj = js.Dictionary[js.Any](
        "SegmentResponse" -> SegmentResponse.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetSegmentVersionResponse]
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
      val __obj = js.Dictionary[js.Any](
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any],
        "SegmentId"     -> SegmentId.asInstanceOf[js.Any]
      )

      PageSize.foreach(__v => __obj.update("PageSize", __v.asInstanceOf[js.Any]))
      Token.foreach(__v => __obj.update("Token", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetSegmentVersionsRequest]
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
      val __obj = js.Dictionary[js.Any](
        "SegmentsResponse" -> SegmentsResponse.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetSegmentVersionsResponse]
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
      val __obj = js.Dictionary[js.Any](
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any]
      )

      PageSize.foreach(__v => __obj.update("PageSize", __v.asInstanceOf[js.Any]))
      Token.foreach(__v => __obj.update("Token", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetSegmentsRequest]
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
      val __obj = js.Dictionary[js.Any](
        "SegmentsResponse" -> SegmentsResponse.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetSegmentsResponse]
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
      val __obj = js.Dictionary[js.Any](
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetSmsChannelRequest]
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
      val __obj = js.Dictionary[js.Any](
        "SMSChannelResponse" -> SMSChannelResponse.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetSmsChannelResponse]
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
      val __obj = js.Dictionary[js.Any](
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any],
        "UserId"        -> UserId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetUserEndpointsRequest]
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
      val __obj = js.Dictionary[js.Any](
        "EndpointsResponse" -> EndpointsResponse.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetUserEndpointsResponse]
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
      val __obj = js.Dictionary[js.Any](
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetVoiceChannelRequest]
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
      val __obj = js.Dictionary[js.Any](
        "VoiceChannelResponse" -> VoiceChannelResponse.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetVoiceChannelResponse]
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
      val __obj = js.Dictionary.empty[js.Any]
      DefineSegment.foreach(__v => __obj.update("DefineSegment", __v.asInstanceOf[js.Any]))
      ExternalId.foreach(__v => __obj.update("ExternalId", __v.asInstanceOf[js.Any]))
      Format.foreach(__v => __obj.update("Format", __v.asInstanceOf[js.Any]))
      RegisterEndpoints.foreach(__v => __obj.update("RegisterEndpoints", __v.asInstanceOf[js.Any]))
      RoleArn.foreach(__v => __obj.update("RoleArn", __v.asInstanceOf[js.Any]))
      S3Url.foreach(__v => __obj.update("S3Url", __v.asInstanceOf[js.Any]))
      SegmentId.foreach(__v => __obj.update("SegmentId", __v.asInstanceOf[js.Any]))
      SegmentName.foreach(__v => __obj.update("SegmentName", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ImportJobRequest]
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
      val __obj = js.Dictionary.empty[js.Any]
      DefineSegment.foreach(__v => __obj.update("DefineSegment", __v.asInstanceOf[js.Any]))
      ExternalId.foreach(__v => __obj.update("ExternalId", __v.asInstanceOf[js.Any]))
      Format.foreach(__v => __obj.update("Format", __v.asInstanceOf[js.Any]))
      RegisterEndpoints.foreach(__v => __obj.update("RegisterEndpoints", __v.asInstanceOf[js.Any]))
      RoleArn.foreach(__v => __obj.update("RoleArn", __v.asInstanceOf[js.Any]))
      S3Url.foreach(__v => __obj.update("S3Url", __v.asInstanceOf[js.Any]))
      SegmentId.foreach(__v => __obj.update("SegmentId", __v.asInstanceOf[js.Any]))
      SegmentName.foreach(__v => __obj.update("SegmentName", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ImportJobResource]
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
      val __obj = js.Dictionary.empty[js.Any]
      ApplicationId.foreach(__v => __obj.update("ApplicationId", __v.asInstanceOf[js.Any]))
      CompletedPieces.foreach(__v => __obj.update("CompletedPieces", __v.asInstanceOf[js.Any]))
      CompletionDate.foreach(__v => __obj.update("CompletionDate", __v.asInstanceOf[js.Any]))
      CreationDate.foreach(__v => __obj.update("CreationDate", __v.asInstanceOf[js.Any]))
      Definition.foreach(__v => __obj.update("Definition", __v.asInstanceOf[js.Any]))
      FailedPieces.foreach(__v => __obj.update("FailedPieces", __v.asInstanceOf[js.Any]))
      Failures.foreach(__v => __obj.update("Failures", __v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.update("Id", __v.asInstanceOf[js.Any]))
      JobStatus.foreach(__v => __obj.update("JobStatus", __v.asInstanceOf[js.Any]))
      TotalFailures.foreach(__v => __obj.update("TotalFailures", __v.asInstanceOf[js.Any]))
      TotalPieces.foreach(__v => __obj.update("TotalPieces", __v.asInstanceOf[js.Any]))
      TotalProcessed.foreach(__v => __obj.update("TotalProcessed", __v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.update("Type", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ImportJobResponse]
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
      val __obj = js.Dictionary.empty[js.Any]
      Item.foreach(__v => __obj.update("Item", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ImportJobsResponse]
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
      val __obj = js.Dictionary.empty[js.Any]
      EndpointItemResponse.foreach(__v => __obj.update("EndpointItemResponse", __v.asInstanceOf[js.Any]))
      EventsItemResponse.foreach(__v => __obj.update("EventsItemResponse", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ItemResponse]
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
      val __obj = js.Dictionary[js.Any](
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ListTagsForResourceRequest]
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
      val __obj = js.Dictionary[js.Any](
        "TagsModel" -> TagsModel.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ListTagsForResourceResponse]
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
      val __obj = js.Dictionary.empty[js.Any]
      Action.foreach(__v => __obj.update("Action", __v.asInstanceOf[js.Any]))
      Body.foreach(__v => __obj.update("Body", __v.asInstanceOf[js.Any]))
      ImageIconUrl.foreach(__v => __obj.update("ImageIconUrl", __v.asInstanceOf[js.Any]))
      ImageSmallIconUrl.foreach(__v => __obj.update("ImageSmallIconUrl", __v.asInstanceOf[js.Any]))
      ImageUrl.foreach(__v => __obj.update("ImageUrl", __v.asInstanceOf[js.Any]))
      JsonBody.foreach(__v => __obj.update("JsonBody", __v.asInstanceOf[js.Any]))
      MediaUrl.foreach(__v => __obj.update("MediaUrl", __v.asInstanceOf[js.Any]))
      RawContent.foreach(__v => __obj.update("RawContent", __v.asInstanceOf[js.Any]))
      SilentPush.foreach(__v => __obj.update("SilentPush", __v.asInstanceOf[js.Any]))
      TimeToLive.foreach(__v => __obj.update("TimeToLive", __v.asInstanceOf[js.Any]))
      Title.foreach(__v => __obj.update("Title", __v.asInstanceOf[js.Any]))
      Url.foreach(__v => __obj.update("Url", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Message]
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
      val __obj = js.Dictionary.empty[js.Any]
      Message.foreach(__v => __obj.update("Message", __v.asInstanceOf[js.Any]))
      RequestID.foreach(__v => __obj.update("RequestID", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MessageBody]
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
      val __obj = js.Dictionary.empty[js.Any]
      ADMMessage.foreach(__v => __obj.update("ADMMessage", __v.asInstanceOf[js.Any]))
      APNSMessage.foreach(__v => __obj.update("APNSMessage", __v.asInstanceOf[js.Any]))
      BaiduMessage.foreach(__v => __obj.update("BaiduMessage", __v.asInstanceOf[js.Any]))
      DefaultMessage.foreach(__v => __obj.update("DefaultMessage", __v.asInstanceOf[js.Any]))
      EmailMessage.foreach(__v => __obj.update("EmailMessage", __v.asInstanceOf[js.Any]))
      GCMMessage.foreach(__v => __obj.update("GCMMessage", __v.asInstanceOf[js.Any]))
      SMSMessage.foreach(__v => __obj.update("SMSMessage", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MessageConfiguration]
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
      val __obj = js.Dictionary.empty[js.Any]
      Addresses.foreach(__v => __obj.update("Addresses", __v.asInstanceOf[js.Any]))
      Context.foreach(__v => __obj.update("Context", __v.asInstanceOf[js.Any]))
      Endpoints.foreach(__v => __obj.update("Endpoints", __v.asInstanceOf[js.Any]))
      MessageConfiguration.foreach(__v => __obj.update("MessageConfiguration", __v.asInstanceOf[js.Any]))
      TraceId.foreach(__v => __obj.update("TraceId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MessageRequest]
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
      val __obj = js.Dictionary.empty[js.Any]
      ApplicationId.foreach(__v => __obj.update("ApplicationId", __v.asInstanceOf[js.Any]))
      EndpointResult.foreach(__v => __obj.update("EndpointResult", __v.asInstanceOf[js.Any]))
      RequestId.foreach(__v => __obj.update("RequestId", __v.asInstanceOf[js.Any]))
      Result.foreach(__v => __obj.update("Result", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MessageResponse]
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
      val __obj = js.Dictionary.empty[js.Any]
      DeliveryStatus.foreach(__v => __obj.update("DeliveryStatus", __v.asInstanceOf[js.Any]))
      MessageId.foreach(__v => __obj.update("MessageId", __v.asInstanceOf[js.Any]))
      StatusCode.foreach(__v => __obj.update("StatusCode", __v.asInstanceOf[js.Any]))
      StatusMessage.foreach(__v => __obj.update("StatusMessage", __v.asInstanceOf[js.Any]))
      UpdatedToken.foreach(__v => __obj.update("UpdatedToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MessageResult]
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
      val __obj = js.Dictionary.empty[js.Any]
      ComparisonOperator.foreach(__v => __obj.update("ComparisonOperator", __v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.update("Value", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MetricDimension]
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
      val __obj = js.Dictionary.empty[js.Any]
      IsoCountryCode.foreach(__v => __obj.update("IsoCountryCode", __v.asInstanceOf[js.Any]))
      PhoneNumber.foreach(__v => __obj.update("PhoneNumber", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NumberValidateRequest]
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
      val __obj = js.Dictionary.empty[js.Any]
      Carrier.foreach(__v => __obj.update("Carrier", __v.asInstanceOf[js.Any]))
      City.foreach(__v => __obj.update("City", __v.asInstanceOf[js.Any]))
      CleansedPhoneNumberE164.foreach(__v => __obj.update("CleansedPhoneNumberE164", __v.asInstanceOf[js.Any]))
      CleansedPhoneNumberNational.foreach(__v => __obj.update("CleansedPhoneNumberNational", __v.asInstanceOf[js.Any]))
      Country.foreach(__v => __obj.update("Country", __v.asInstanceOf[js.Any]))
      CountryCodeIso2.foreach(__v => __obj.update("CountryCodeIso2", __v.asInstanceOf[js.Any]))
      CountryCodeNumeric.foreach(__v => __obj.update("CountryCodeNumeric", __v.asInstanceOf[js.Any]))
      County.foreach(__v => __obj.update("County", __v.asInstanceOf[js.Any]))
      OriginalCountryCodeIso2.foreach(__v => __obj.update("OriginalCountryCodeIso2", __v.asInstanceOf[js.Any]))
      OriginalPhoneNumber.foreach(__v => __obj.update("OriginalPhoneNumber", __v.asInstanceOf[js.Any]))
      PhoneType.foreach(__v => __obj.update("PhoneType", __v.asInstanceOf[js.Any]))
      PhoneTypeCode.foreach(__v => __obj.update("PhoneTypeCode", __v.asInstanceOf[js.Any]))
      Timezone.foreach(__v => __obj.update("Timezone", __v.asInstanceOf[js.Any]))
      ZipCode.foreach(__v => __obj.update("ZipCode", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NumberValidateResponse]
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
      val __obj = js.Dictionary[js.Any](
        "NumberValidateRequest" -> NumberValidateRequest.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[PhoneNumberValidateRequest]
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
      val __obj = js.Dictionary[js.Any](
        "NumberValidateResponse" -> NumberValidateResponse.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[PhoneNumberValidateResponse]
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
      val __obj = js.Dictionary.empty[js.Any]
      Address.foreach(__v => __obj.update("Address", __v.asInstanceOf[js.Any]))
      Attributes.foreach(__v => __obj.update("Attributes", __v.asInstanceOf[js.Any]))
      ChannelType.foreach(__v => __obj.update("ChannelType", __v.asInstanceOf[js.Any]))
      Demographic.foreach(__v => __obj.update("Demographic", __v.asInstanceOf[js.Any]))
      EffectiveDate.foreach(__v => __obj.update("EffectiveDate", __v.asInstanceOf[js.Any]))
      EndpointStatus.foreach(__v => __obj.update("EndpointStatus", __v.asInstanceOf[js.Any]))
      Location.foreach(__v => __obj.update("Location", __v.asInstanceOf[js.Any]))
      Metrics.foreach(__v => __obj.update("Metrics", __v.asInstanceOf[js.Any]))
      OptOut.foreach(__v => __obj.update("OptOut", __v.asInstanceOf[js.Any]))
      RequestId.foreach(__v => __obj.update("RequestId", __v.asInstanceOf[js.Any]))
      User.foreach(__v => __obj.update("User", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PublicEndpoint]
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
      val __obj = js.Dictionary[js.Any](
        "ApplicationId"    -> ApplicationId.asInstanceOf[js.Any],
        "WriteEventStream" -> WriteEventStream.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[PutEventStreamRequest]
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
      val __obj = js.Dictionary[js.Any](
        "EventStream" -> EventStream.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[PutEventStreamResponse]
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
      val __obj = js.Dictionary[js.Any](
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any],
        "EventsRequest" -> EventsRequest.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[PutEventsRequest]
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
      val __obj = js.Dictionary[js.Any](
        "EventsResponse" -> EventsResponse.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[PutEventsResponse]
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
      val __obj = js.Dictionary.empty[js.Any]
      End.foreach(__v => __obj.update("End", __v.asInstanceOf[js.Any]))
      Start.foreach(__v => __obj.update("Start", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[QuietTime]
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
      val __obj = js.Dictionary.empty[js.Any]
      Data.foreach(__v => __obj.update("Data", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RawEmail]
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
      val __obj = js.Dictionary.empty[js.Any]
      Duration.foreach(__v => __obj.update("Duration", __v.asInstanceOf[js.Any]))
      RecencyType.foreach(__v => __obj.update("RecencyType", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RecencyDimension]
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
      val __obj = js.Dictionary[js.Any](
        "ApplicationId"           -> ApplicationId.asInstanceOf[js.Any],
        "AttributeType"           -> AttributeType.asInstanceOf[js.Any],
        "UpdateAttributesRequest" -> UpdateAttributesRequest.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[RemoveAttributesRequest]
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
      val __obj = js.Dictionary[js.Any](
        "AttributesResource" -> AttributesResource.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[RemoveAttributesResponse]
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
      val __obj = js.Dictionary.empty[js.Any]
      Enabled.foreach(__v => __obj.update("Enabled", __v.asInstanceOf[js.Any]))
      SenderId.foreach(__v => __obj.update("SenderId", __v.asInstanceOf[js.Any]))
      ShortCode.foreach(__v => __obj.update("ShortCode", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SMSChannelRequest]
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
      val __obj = js.Dictionary.empty[js.Any]
      ApplicationId.foreach(__v => __obj.update("ApplicationId", __v.asInstanceOf[js.Any]))
      CreationDate.foreach(__v => __obj.update("CreationDate", __v.asInstanceOf[js.Any]))
      Enabled.foreach(__v => __obj.update("Enabled", __v.asInstanceOf[js.Any]))
      HasCredential.foreach(__v => __obj.update("HasCredential", __v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.update("Id", __v.asInstanceOf[js.Any]))
      IsArchived.foreach(__v => __obj.update("IsArchived", __v.asInstanceOf[js.Any]))
      LastModifiedBy.foreach(__v => __obj.update("LastModifiedBy", __v.asInstanceOf[js.Any]))
      LastModifiedDate.foreach(__v => __obj.update("LastModifiedDate", __v.asInstanceOf[js.Any]))
      Platform.foreach(__v => __obj.update("Platform", __v.asInstanceOf[js.Any]))
      PromotionalMessagesPerSecond.foreach(
        __v => __obj.update("PromotionalMessagesPerSecond", __v.asInstanceOf[js.Any])
      )
      SenderId.foreach(__v => __obj.update("SenderId", __v.asInstanceOf[js.Any]))
      ShortCode.foreach(__v => __obj.update("ShortCode", __v.asInstanceOf[js.Any]))
      TransactionalMessagesPerSecond.foreach(
        __v => __obj.update("TransactionalMessagesPerSecond", __v.asInstanceOf[js.Any])
      )
      Version.foreach(__v => __obj.update("Version", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SMSChannelResponse]
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
      val __obj = js.Dictionary.empty[js.Any]
      Body.foreach(__v => __obj.update("Body", __v.asInstanceOf[js.Any]))
      Keyword.foreach(__v => __obj.update("Keyword", __v.asInstanceOf[js.Any]))
      MessageType.foreach(__v => __obj.update("MessageType", __v.asInstanceOf[js.Any]))
      OriginationNumber.foreach(__v => __obj.update("OriginationNumber", __v.asInstanceOf[js.Any]))
      SenderId.foreach(__v => __obj.update("SenderId", __v.asInstanceOf[js.Any]))
      Substitutions.foreach(__v => __obj.update("Substitutions", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SMSMessage]
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
      val __obj = js.Dictionary.empty[js.Any]
      EndTime.foreach(__v => __obj.update("EndTime", __v.asInstanceOf[js.Any]))
      EventFilter.foreach(__v => __obj.update("EventFilter", __v.asInstanceOf[js.Any]))
      Frequency.foreach(__v => __obj.update("Frequency", __v.asInstanceOf[js.Any]))
      IsLocalTime.foreach(__v => __obj.update("IsLocalTime", __v.asInstanceOf[js.Any]))
      QuietTime.foreach(__v => __obj.update("QuietTime", __v.asInstanceOf[js.Any]))
      StartTime.foreach(__v => __obj.update("StartTime", __v.asInstanceOf[js.Any]))
      Timezone.foreach(__v => __obj.update("Timezone", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Schedule]
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
      val __obj = js.Dictionary.empty[js.Any]
      Recency.foreach(__v => __obj.update("Recency", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SegmentBehaviors]
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
      val __obj = js.Dictionary.empty[js.Any]
      AppVersion.foreach(__v => __obj.update("AppVersion", __v.asInstanceOf[js.Any]))
      Channel.foreach(__v => __obj.update("Channel", __v.asInstanceOf[js.Any]))
      DeviceType.foreach(__v => __obj.update("DeviceType", __v.asInstanceOf[js.Any]))
      Make.foreach(__v => __obj.update("Make", __v.asInstanceOf[js.Any]))
      Model.foreach(__v => __obj.update("Model", __v.asInstanceOf[js.Any]))
      Platform.foreach(__v => __obj.update("Platform", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SegmentDemographics]
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
      val __obj = js.Dictionary.empty[js.Any]
      Attributes.foreach(__v => __obj.update("Attributes", __v.asInstanceOf[js.Any]))
      Behavior.foreach(__v => __obj.update("Behavior", __v.asInstanceOf[js.Any]))
      Demographic.foreach(__v => __obj.update("Demographic", __v.asInstanceOf[js.Any]))
      Location.foreach(__v => __obj.update("Location", __v.asInstanceOf[js.Any]))
      Metrics.foreach(__v => __obj.update("Metrics", __v.asInstanceOf[js.Any]))
      UserAttributes.foreach(__v => __obj.update("UserAttributes", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SegmentDimensions]
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
      val __obj = js.Dictionary.empty[js.Any]
      Dimensions.foreach(__v => __obj.update("Dimensions", __v.asInstanceOf[js.Any]))
      SourceSegments.foreach(__v => __obj.update("SourceSegments", __v.asInstanceOf[js.Any]))
      SourceType.foreach(__v => __obj.update("SourceType", __v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.update("Type", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SegmentGroup]
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
      val __obj = js.Dictionary.empty[js.Any]
      Groups.foreach(__v => __obj.update("Groups", __v.asInstanceOf[js.Any]))
      Include.foreach(__v => __obj.update("Include", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SegmentGroupList]
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
      val __obj = js.Dictionary.empty[js.Any]
      ChannelCounts.foreach(__v => __obj.update("ChannelCounts", __v.asInstanceOf[js.Any]))
      ExternalId.foreach(__v => __obj.update("ExternalId", __v.asInstanceOf[js.Any]))
      Format.foreach(__v => __obj.update("Format", __v.asInstanceOf[js.Any]))
      RoleArn.foreach(__v => __obj.update("RoleArn", __v.asInstanceOf[js.Any]))
      S3Url.foreach(__v => __obj.update("S3Url", __v.asInstanceOf[js.Any]))
      Size.foreach(__v => __obj.update("Size", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SegmentImportResource]
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
      val __obj = js.Dictionary.empty[js.Any]
      Country.foreach(__v => __obj.update("Country", __v.asInstanceOf[js.Any]))
      GPSPoint.foreach(__v => __obj.update("GPSPoint", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SegmentLocation]
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
      val __obj = js.Dictionary.empty[js.Any]
      Id.foreach(__v => __obj.update("Id", __v.asInstanceOf[js.Any]))
      Version.foreach(__v => __obj.update("Version", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SegmentReference]
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
      val __obj = js.Dictionary.empty[js.Any]
      ApplicationId.foreach(__v => __obj.update("ApplicationId", __v.asInstanceOf[js.Any]))
      Arn.foreach(__v => __obj.update("Arn", __v.asInstanceOf[js.Any]))
      CreationDate.foreach(__v => __obj.update("CreationDate", __v.asInstanceOf[js.Any]))
      Dimensions.foreach(__v => __obj.update("Dimensions", __v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.update("Id", __v.asInstanceOf[js.Any]))
      ImportDefinition.foreach(__v => __obj.update("ImportDefinition", __v.asInstanceOf[js.Any]))
      LastModifiedDate.foreach(__v => __obj.update("LastModifiedDate", __v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      SegmentGroups.foreach(__v => __obj.update("SegmentGroups", __v.asInstanceOf[js.Any]))
      SegmentType.foreach(__v => __obj.update("SegmentType", __v.asInstanceOf[js.Any]))
      Version.foreach(__v => __obj.update("Version", __v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.update("tags", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SegmentResponse]
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
      val __obj = js.Dictionary.empty[js.Any]
      Item.foreach(__v => __obj.update("Item", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SegmentsResponse]
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
      val __obj = js.Dictionary[js.Any](
        "ApplicationId"  -> ApplicationId.asInstanceOf[js.Any],
        "MessageRequest" -> MessageRequest.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[SendMessagesRequest]
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
      val __obj = js.Dictionary[js.Any](
        "MessageResponse" -> MessageResponse.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[SendMessagesResponse]
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
      val __obj = js.Dictionary.empty[js.Any]
      Context.foreach(__v => __obj.update("Context", __v.asInstanceOf[js.Any]))
      MessageConfiguration.foreach(__v => __obj.update("MessageConfiguration", __v.asInstanceOf[js.Any]))
      TraceId.foreach(__v => __obj.update("TraceId", __v.asInstanceOf[js.Any]))
      Users.foreach(__v => __obj.update("Users", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SendUsersMessageRequest]
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
      val __obj = js.Dictionary.empty[js.Any]
      ApplicationId.foreach(__v => __obj.update("ApplicationId", __v.asInstanceOf[js.Any]))
      RequestId.foreach(__v => __obj.update("RequestId", __v.asInstanceOf[js.Any]))
      Result.foreach(__v => __obj.update("Result", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SendUsersMessageResponse]
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
      val __obj = js.Dictionary[js.Any](
        "ApplicationId"           -> ApplicationId.asInstanceOf[js.Any],
        "SendUsersMessageRequest" -> SendUsersMessageRequest.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[SendUsersMessagesRequest]
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
      val __obj = js.Dictionary[js.Any](
        "SendUsersMessageResponse" -> SendUsersMessageResponse.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[SendUsersMessagesResponse]
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
      val __obj = js.Dictionary.empty[js.Any]
      Duration.foreach(__v => __obj.update("Duration", __v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.update("Id", __v.asInstanceOf[js.Any]))
      StartTimestamp.foreach(__v => __obj.update("StartTimestamp", __v.asInstanceOf[js.Any]))
      StopTimestamp.foreach(__v => __obj.update("StopTimestamp", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Session]
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
      val __obj = js.Dictionary.empty[js.Any]
      DimensionType.foreach(__v => __obj.update("DimensionType", __v.asInstanceOf[js.Any]))
      Values.foreach(__v => __obj.update("Values", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SetDimension]
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
      val __obj = js.Dictionary.empty[js.Any]
      HtmlPart.foreach(__v => __obj.update("HtmlPart", __v.asInstanceOf[js.Any]))
      Subject.foreach(__v => __obj.update("Subject", __v.asInstanceOf[js.Any]))
      TextPart.foreach(__v => __obj.update("TextPart", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SimpleEmail]
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
      val __obj = js.Dictionary.empty[js.Any]
      Charset.foreach(__v => __obj.update("Charset", __v.asInstanceOf[js.Any]))
      Data.foreach(__v => __obj.update("Data", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SimpleEmailPart]
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
      val __obj = js.Dictionary[js.Any](
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any],
        "TagsModel"   -> TagsModel.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[TagResourceRequest]
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
      val __obj = js.Dictionary[js.Any](
        "tags" -> tags.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[TagsModel]
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
      val __obj = js.Dictionary.empty[js.Any]
      Id.foreach(__v => __obj.update("Id", __v.asInstanceOf[js.Any]))
      MessageConfiguration.foreach(__v => __obj.update("MessageConfiguration", __v.asInstanceOf[js.Any]))
      Schedule.foreach(__v => __obj.update("Schedule", __v.asInstanceOf[js.Any]))
      SizePercent.foreach(__v => __obj.update("SizePercent", __v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.update("State", __v.asInstanceOf[js.Any]))
      TreatmentDescription.foreach(__v => __obj.update("TreatmentDescription", __v.asInstanceOf[js.Any]))
      TreatmentName.foreach(__v => __obj.update("TreatmentName", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TreatmentResource]
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
      val __obj = js.Dictionary[js.Any](
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any],
        "TagKeys"     -> TagKeys.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UntagResourceRequest]
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
      val __obj = js.Dictionary[js.Any](
        "ADMChannelRequest" -> ADMChannelRequest.asInstanceOf[js.Any],
        "ApplicationId"     -> ApplicationId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UpdateAdmChannelRequest]
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
      val __obj = js.Dictionary[js.Any](
        "ADMChannelResponse" -> ADMChannelResponse.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UpdateAdmChannelResponse]
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
      val __obj = js.Dictionary[js.Any](
        "APNSChannelRequest" -> APNSChannelRequest.asInstanceOf[js.Any],
        "ApplicationId"      -> ApplicationId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UpdateApnsChannelRequest]
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
      val __obj = js.Dictionary[js.Any](
        "APNSChannelResponse" -> APNSChannelResponse.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UpdateApnsChannelResponse]
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
      val __obj = js.Dictionary[js.Any](
        "APNSSandboxChannelRequest" -> APNSSandboxChannelRequest.asInstanceOf[js.Any],
        "ApplicationId"             -> ApplicationId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UpdateApnsSandboxChannelRequest]
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
      val __obj = js.Dictionary[js.Any](
        "APNSSandboxChannelResponse" -> APNSSandboxChannelResponse.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UpdateApnsSandboxChannelResponse]
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
      val __obj = js.Dictionary[js.Any](
        "APNSVoipChannelRequest" -> APNSVoipChannelRequest.asInstanceOf[js.Any],
        "ApplicationId"          -> ApplicationId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UpdateApnsVoipChannelRequest]
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
      val __obj = js.Dictionary[js.Any](
        "APNSVoipChannelResponse" -> APNSVoipChannelResponse.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UpdateApnsVoipChannelResponse]
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
      val __obj = js.Dictionary[js.Any](
        "APNSVoipSandboxChannelRequest" -> APNSVoipSandboxChannelRequest.asInstanceOf[js.Any],
        "ApplicationId"                 -> ApplicationId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UpdateApnsVoipSandboxChannelRequest]
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
      val __obj = js.Dictionary[js.Any](
        "APNSVoipSandboxChannelResponse" -> APNSVoipSandboxChannelResponse.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UpdateApnsVoipSandboxChannelResponse]
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
      val __obj = js.Dictionary[js.Any](
        "ApplicationId"                   -> ApplicationId.asInstanceOf[js.Any],
        "WriteApplicationSettingsRequest" -> WriteApplicationSettingsRequest.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UpdateApplicationSettingsRequest]
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
      val __obj = js.Dictionary[js.Any](
        "ApplicationSettingsResource" -> ApplicationSettingsResource.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UpdateApplicationSettingsResponse]
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
      val __obj = js.Dictionary.empty[js.Any]
      Blacklist.foreach(__v => __obj.update("Blacklist", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateAttributesRequest]
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
      val __obj = js.Dictionary[js.Any](
        "ApplicationId"       -> ApplicationId.asInstanceOf[js.Any],
        "BaiduChannelRequest" -> BaiduChannelRequest.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UpdateBaiduChannelRequest]
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
      val __obj = js.Dictionary[js.Any](
        "BaiduChannelResponse" -> BaiduChannelResponse.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UpdateBaiduChannelResponse]
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
      val __obj = js.Dictionary[js.Any](
        "ApplicationId"        -> ApplicationId.asInstanceOf[js.Any],
        "CampaignId"           -> CampaignId.asInstanceOf[js.Any],
        "WriteCampaignRequest" -> WriteCampaignRequest.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UpdateCampaignRequest]
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
      val __obj = js.Dictionary[js.Any](
        "CampaignResponse" -> CampaignResponse.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UpdateCampaignResponse]
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
      val __obj = js.Dictionary[js.Any](
        "ApplicationId"       -> ApplicationId.asInstanceOf[js.Any],
        "EmailChannelRequest" -> EmailChannelRequest.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UpdateEmailChannelRequest]
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
      val __obj = js.Dictionary[js.Any](
        "EmailChannelResponse" -> EmailChannelResponse.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UpdateEmailChannelResponse]
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
      val __obj = js.Dictionary[js.Any](
        "ApplicationId"   -> ApplicationId.asInstanceOf[js.Any],
        "EndpointId"      -> EndpointId.asInstanceOf[js.Any],
        "EndpointRequest" -> EndpointRequest.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UpdateEndpointRequest]
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
      val __obj = js.Dictionary[js.Any](
        "MessageBody" -> MessageBody.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UpdateEndpointResponse]
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
      val __obj = js.Dictionary[js.Any](
        "ApplicationId"        -> ApplicationId.asInstanceOf[js.Any],
        "EndpointBatchRequest" -> EndpointBatchRequest.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UpdateEndpointsBatchRequest]
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
      val __obj = js.Dictionary[js.Any](
        "MessageBody" -> MessageBody.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UpdateEndpointsBatchResponse]
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
      val __obj = js.Dictionary[js.Any](
        "ApplicationId"     -> ApplicationId.asInstanceOf[js.Any],
        "GCMChannelRequest" -> GCMChannelRequest.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UpdateGcmChannelRequest]
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
      val __obj = js.Dictionary[js.Any](
        "GCMChannelResponse" -> GCMChannelResponse.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UpdateGcmChannelResponse]
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
      val __obj = js.Dictionary[js.Any](
        "ApplicationId"       -> ApplicationId.asInstanceOf[js.Any],
        "SegmentId"           -> SegmentId.asInstanceOf[js.Any],
        "WriteSegmentRequest" -> WriteSegmentRequest.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UpdateSegmentRequest]
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
      val __obj = js.Dictionary[js.Any](
        "SegmentResponse" -> SegmentResponse.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UpdateSegmentResponse]
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
      val __obj = js.Dictionary[js.Any](
        "ApplicationId"     -> ApplicationId.asInstanceOf[js.Any],
        "SMSChannelRequest" -> SMSChannelRequest.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UpdateSmsChannelRequest]
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
      val __obj = js.Dictionary[js.Any](
        "SMSChannelResponse" -> SMSChannelResponse.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UpdateSmsChannelResponse]
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
      val __obj = js.Dictionary[js.Any](
        "ApplicationId"       -> ApplicationId.asInstanceOf[js.Any],
        "VoiceChannelRequest" -> VoiceChannelRequest.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UpdateVoiceChannelRequest]
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
      val __obj = js.Dictionary[js.Any](
        "VoiceChannelResponse" -> VoiceChannelResponse.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UpdateVoiceChannelResponse]
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
      val __obj = js.Dictionary.empty[js.Any]
      Enabled.foreach(__v => __obj.update("Enabled", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VoiceChannelRequest]
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
      val __obj = js.Dictionary.empty[js.Any]
      ApplicationId.foreach(__v => __obj.update("ApplicationId", __v.asInstanceOf[js.Any]))
      CreationDate.foreach(__v => __obj.update("CreationDate", __v.asInstanceOf[js.Any]))
      Enabled.foreach(__v => __obj.update("Enabled", __v.asInstanceOf[js.Any]))
      HasCredential.foreach(__v => __obj.update("HasCredential", __v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.update("Id", __v.asInstanceOf[js.Any]))
      IsArchived.foreach(__v => __obj.update("IsArchived", __v.asInstanceOf[js.Any]))
      LastModifiedBy.foreach(__v => __obj.update("LastModifiedBy", __v.asInstanceOf[js.Any]))
      LastModifiedDate.foreach(__v => __obj.update("LastModifiedDate", __v.asInstanceOf[js.Any]))
      Platform.foreach(__v => __obj.update("Platform", __v.asInstanceOf[js.Any]))
      Version.foreach(__v => __obj.update("Version", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VoiceChannelResponse]
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
      val __obj = js.Dictionary.empty[js.Any]
      Body.foreach(__v => __obj.update("Body", __v.asInstanceOf[js.Any]))
      LanguageCode.foreach(__v => __obj.update("LanguageCode", __v.asInstanceOf[js.Any]))
      OriginationNumber.foreach(__v => __obj.update("OriginationNumber", __v.asInstanceOf[js.Any]))
      Substitutions.foreach(__v => __obj.update("Substitutions", __v.asInstanceOf[js.Any]))
      VoiceId.foreach(__v => __obj.update("VoiceId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VoiceMessage]
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
      val __obj = js.Dictionary.empty[js.Any]
      CampaignHook.foreach(__v => __obj.update("CampaignHook", __v.asInstanceOf[js.Any]))
      CloudWatchMetricsEnabled.foreach(__v => __obj.update("CloudWatchMetricsEnabled", __v.asInstanceOf[js.Any]))
      Limits.foreach(__v => __obj.update("Limits", __v.asInstanceOf[js.Any]))
      QuietTime.foreach(__v => __obj.update("QuietTime", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[WriteApplicationSettingsRequest]
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
      val __obj = js.Dictionary.empty[js.Any]
      AdditionalTreatments.foreach(__v => __obj.update("AdditionalTreatments", __v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      HoldoutPercent.foreach(__v => __obj.update("HoldoutPercent", __v.asInstanceOf[js.Any]))
      Hook.foreach(__v => __obj.update("Hook", __v.asInstanceOf[js.Any]))
      IsPaused.foreach(__v => __obj.update("IsPaused", __v.asInstanceOf[js.Any]))
      Limits.foreach(__v => __obj.update("Limits", __v.asInstanceOf[js.Any]))
      MessageConfiguration.foreach(__v => __obj.update("MessageConfiguration", __v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      Schedule.foreach(__v => __obj.update("Schedule", __v.asInstanceOf[js.Any]))
      SegmentId.foreach(__v => __obj.update("SegmentId", __v.asInstanceOf[js.Any]))
      SegmentVersion.foreach(__v => __obj.update("SegmentVersion", __v.asInstanceOf[js.Any]))
      TreatmentDescription.foreach(__v => __obj.update("TreatmentDescription", __v.asInstanceOf[js.Any]))
      TreatmentName.foreach(__v => __obj.update("TreatmentName", __v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.update("tags", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[WriteCampaignRequest]
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
      val __obj = js.Dictionary.empty[js.Any]
      DestinationStreamArn.foreach(__v => __obj.update("DestinationStreamArn", __v.asInstanceOf[js.Any]))
      RoleArn.foreach(__v => __obj.update("RoleArn", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[WriteEventStream]
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
      val __obj = js.Dictionary.empty[js.Any]
      Dimensions.foreach(__v => __obj.update("Dimensions", __v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      SegmentGroups.foreach(__v => __obj.update("SegmentGroups", __v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.update("tags", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[WriteSegmentRequest]
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
      val __obj = js.Dictionary.empty[js.Any]
      MessageConfiguration.foreach(__v => __obj.update("MessageConfiguration", __v.asInstanceOf[js.Any]))
      Schedule.foreach(__v => __obj.update("Schedule", __v.asInstanceOf[js.Any]))
      SizePercent.foreach(__v => __obj.update("SizePercent", __v.asInstanceOf[js.Any]))
      TreatmentDescription.foreach(__v => __obj.update("TreatmentDescription", __v.asInstanceOf[js.Any]))
      TreatmentName.foreach(__v => __obj.update("TreatmentName", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[WriteTreatmentResource]
    }
  }
}
