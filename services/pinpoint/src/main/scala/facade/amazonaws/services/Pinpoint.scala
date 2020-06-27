package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object pinpoint {
  type ListOfActivityResponse          = js.Array[ActivityResponse]
  type ListOfApplicationResponse       = js.Array[ApplicationResponse]
  type ListOfCampaignResponse          = js.Array[CampaignResponse]
  type ListOfEndpointBatchItem         = js.Array[EndpointBatchItem]
  type ListOfEndpointResponse          = js.Array[EndpointResponse]
  type ListOfExportJobResponse         = js.Array[ExportJobResponse]
  type ListOfImportJobResponse         = js.Array[ImportJobResponse]
  type ListOfJourneyResponse           = js.Array[JourneyResponse]
  type ListOfMultiConditionalBranch    = js.Array[MultiConditionalBranch]
  type ListOfRandomSplitEntry          = js.Array[RandomSplitEntry]
  type ListOfResultRow                 = js.Array[ResultRow]
  type ListOfResultRowValue            = js.Array[ResultRowValue]
  type ListOfSegmentDimensions         = js.Array[SegmentDimensions]
  type ListOfSegmentGroup              = js.Array[SegmentGroup]
  type ListOfSegmentReference          = js.Array[SegmentReference]
  type ListOfSegmentResponse           = js.Array[SegmentResponse]
  type ListOfSimpleCondition           = js.Array[SimpleCondition]
  type ListOfTemplateResponse          = js.Array[TemplateResponse]
  type ListOfTemplateVersionResponse   = js.Array[TemplateVersionResponse]
  type ListOfTreatmentResource         = js.Array[TreatmentResource]
  type ListOfWriteTreatmentResource    = js.Array[WriteTreatmentResource]
  type ListOf__string                  = js.Array[__string]
  type MapOfActivity                   = js.Dictionary[Activity]
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
  type __blob                          = js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type __boolean                       = Boolean
  type __double                        = Double
  type __integer                       = Int
  type __string                        = String
  type __timestampIso8601              = js.Date

  implicit final class PinpointOps(private val service: Pinpoint) extends AnyVal {

    @inline def createAppFuture(params: CreateAppRequest): Future[CreateAppResponse] =
      service.createApp(params).promise().toFuture
    @inline def createCampaignFuture(params: CreateCampaignRequest): Future[CreateCampaignResponse] =
      service.createCampaign(params).promise().toFuture
    @inline def createEmailTemplateFuture(params: CreateEmailTemplateRequest): Future[CreateEmailTemplateResponse] =
      service.createEmailTemplate(params).promise().toFuture
    @inline def createExportJobFuture(params: CreateExportJobRequest): Future[CreateExportJobResponse] =
      service.createExportJob(params).promise().toFuture
    @inline def createImportJobFuture(params: CreateImportJobRequest): Future[CreateImportJobResponse] =
      service.createImportJob(params).promise().toFuture
    @inline def createJourneyFuture(params: CreateJourneyRequest): Future[CreateJourneyResponse] =
      service.createJourney(params).promise().toFuture
    @inline def createPushTemplateFuture(params: CreatePushTemplateRequest): Future[CreatePushTemplateResponse] =
      service.createPushTemplate(params).promise().toFuture
    @inline def createSegmentFuture(params: CreateSegmentRequest): Future[CreateSegmentResponse] =
      service.createSegment(params).promise().toFuture
    @inline def createSmsTemplateFuture(params: CreateSmsTemplateRequest): Future[CreateSmsTemplateResponse] =
      service.createSmsTemplate(params).promise().toFuture
    @inline def createVoiceTemplateFuture(params: CreateVoiceTemplateRequest): Future[CreateVoiceTemplateResponse] =
      service.createVoiceTemplate(params).promise().toFuture
    @inline def deleteAdmChannelFuture(params: DeleteAdmChannelRequest): Future[DeleteAdmChannelResponse] =
      service.deleteAdmChannel(params).promise().toFuture
    @inline def deleteApnsChannelFuture(params: DeleteApnsChannelRequest): Future[DeleteApnsChannelResponse] =
      service.deleteApnsChannel(params).promise().toFuture
    @inline def deleteApnsSandboxChannelFuture(
        params: DeleteApnsSandboxChannelRequest
    ): Future[DeleteApnsSandboxChannelResponse] = service.deleteApnsSandboxChannel(params).promise().toFuture
    @inline def deleteApnsVoipChannelFuture(
        params: DeleteApnsVoipChannelRequest
    ): Future[DeleteApnsVoipChannelResponse] = service.deleteApnsVoipChannel(params).promise().toFuture
    @inline def deleteApnsVoipSandboxChannelFuture(
        params: DeleteApnsVoipSandboxChannelRequest
    ): Future[DeleteApnsVoipSandboxChannelResponse] = service.deleteApnsVoipSandboxChannel(params).promise().toFuture
    @inline def deleteAppFuture(params: DeleteAppRequest): Future[DeleteAppResponse] =
      service.deleteApp(params).promise().toFuture
    @inline def deleteBaiduChannelFuture(params: DeleteBaiduChannelRequest): Future[DeleteBaiduChannelResponse] =
      service.deleteBaiduChannel(params).promise().toFuture
    @inline def deleteCampaignFuture(params: DeleteCampaignRequest): Future[DeleteCampaignResponse] =
      service.deleteCampaign(params).promise().toFuture
    @inline def deleteEmailChannelFuture(params: DeleteEmailChannelRequest): Future[DeleteEmailChannelResponse] =
      service.deleteEmailChannel(params).promise().toFuture
    @inline def deleteEmailTemplateFuture(params: DeleteEmailTemplateRequest): Future[DeleteEmailTemplateResponse] =
      service.deleteEmailTemplate(params).promise().toFuture
    @inline def deleteEndpointFuture(params: DeleteEndpointRequest): Future[DeleteEndpointResponse] =
      service.deleteEndpoint(params).promise().toFuture
    @inline def deleteEventStreamFuture(params: DeleteEventStreamRequest): Future[DeleteEventStreamResponse] =
      service.deleteEventStream(params).promise().toFuture
    @inline def deleteGcmChannelFuture(params: DeleteGcmChannelRequest): Future[DeleteGcmChannelResponse] =
      service.deleteGcmChannel(params).promise().toFuture
    @inline def deleteJourneyFuture(params: DeleteJourneyRequest): Future[DeleteJourneyResponse] =
      service.deleteJourney(params).promise().toFuture
    @inline def deletePushTemplateFuture(params: DeletePushTemplateRequest): Future[DeletePushTemplateResponse] =
      service.deletePushTemplate(params).promise().toFuture
    @inline def deleteSegmentFuture(params: DeleteSegmentRequest): Future[DeleteSegmentResponse] =
      service.deleteSegment(params).promise().toFuture
    @inline def deleteSmsChannelFuture(params: DeleteSmsChannelRequest): Future[DeleteSmsChannelResponse] =
      service.deleteSmsChannel(params).promise().toFuture
    @inline def deleteSmsTemplateFuture(params: DeleteSmsTemplateRequest): Future[DeleteSmsTemplateResponse] =
      service.deleteSmsTemplate(params).promise().toFuture
    @inline def deleteUserEndpointsFuture(params: DeleteUserEndpointsRequest): Future[DeleteUserEndpointsResponse] =
      service.deleteUserEndpoints(params).promise().toFuture
    @inline def deleteVoiceChannelFuture(params: DeleteVoiceChannelRequest): Future[DeleteVoiceChannelResponse] =
      service.deleteVoiceChannel(params).promise().toFuture
    @inline def deleteVoiceTemplateFuture(params: DeleteVoiceTemplateRequest): Future[DeleteVoiceTemplateResponse] =
      service.deleteVoiceTemplate(params).promise().toFuture
    @inline def getAdmChannelFuture(params: GetAdmChannelRequest): Future[GetAdmChannelResponse] =
      service.getAdmChannel(params).promise().toFuture
    @inline def getApnsChannelFuture(params: GetApnsChannelRequest): Future[GetApnsChannelResponse] =
      service.getApnsChannel(params).promise().toFuture
    @inline def getApnsSandboxChannelFuture(
        params: GetApnsSandboxChannelRequest
    ): Future[GetApnsSandboxChannelResponse] = service.getApnsSandboxChannel(params).promise().toFuture
    @inline def getApnsVoipChannelFuture(params: GetApnsVoipChannelRequest): Future[GetApnsVoipChannelResponse] =
      service.getApnsVoipChannel(params).promise().toFuture
    @inline def getApnsVoipSandboxChannelFuture(
        params: GetApnsVoipSandboxChannelRequest
    ): Future[GetApnsVoipSandboxChannelResponse]                            = service.getApnsVoipSandboxChannel(params).promise().toFuture
    @inline def getAppFuture(params: GetAppRequest): Future[GetAppResponse] = service.getApp(params).promise().toFuture
    @inline def getApplicationDateRangeKpiFuture(
        params: GetApplicationDateRangeKpiRequest
    ): Future[GetApplicationDateRangeKpiResponse] = service.getApplicationDateRangeKpi(params).promise().toFuture
    @inline def getApplicationSettingsFuture(
        params: GetApplicationSettingsRequest
    ): Future[GetApplicationSettingsResponse] = service.getApplicationSettings(params).promise().toFuture
    @inline def getAppsFuture(params: GetAppsRequest): Future[GetAppsResponse] =
      service.getApps(params).promise().toFuture
    @inline def getBaiduChannelFuture(params: GetBaiduChannelRequest): Future[GetBaiduChannelResponse] =
      service.getBaiduChannel(params).promise().toFuture
    @inline def getCampaignActivitiesFuture(
        params: GetCampaignActivitiesRequest
    ): Future[GetCampaignActivitiesResponse] = service.getCampaignActivities(params).promise().toFuture
    @inline def getCampaignDateRangeKpiFuture(
        params: GetCampaignDateRangeKpiRequest
    ): Future[GetCampaignDateRangeKpiResponse] = service.getCampaignDateRangeKpi(params).promise().toFuture
    @inline def getCampaignFuture(params: GetCampaignRequest): Future[GetCampaignResponse] =
      service.getCampaign(params).promise().toFuture
    @inline def getCampaignVersionFuture(params: GetCampaignVersionRequest): Future[GetCampaignVersionResponse] =
      service.getCampaignVersion(params).promise().toFuture
    @inline def getCampaignVersionsFuture(params: GetCampaignVersionsRequest): Future[GetCampaignVersionsResponse] =
      service.getCampaignVersions(params).promise().toFuture
    @inline def getCampaignsFuture(params: GetCampaignsRequest): Future[GetCampaignsResponse] =
      service.getCampaigns(params).promise().toFuture
    @inline def getChannelsFuture(params: GetChannelsRequest): Future[GetChannelsResponse] =
      service.getChannels(params).promise().toFuture
    @inline def getEmailChannelFuture(params: GetEmailChannelRequest): Future[GetEmailChannelResponse] =
      service.getEmailChannel(params).promise().toFuture
    @inline def getEmailTemplateFuture(params: GetEmailTemplateRequest): Future[GetEmailTemplateResponse] =
      service.getEmailTemplate(params).promise().toFuture
    @inline def getEndpointFuture(params: GetEndpointRequest): Future[GetEndpointResponse] =
      service.getEndpoint(params).promise().toFuture
    @inline def getEventStreamFuture(params: GetEventStreamRequest): Future[GetEventStreamResponse] =
      service.getEventStream(params).promise().toFuture
    @inline def getExportJobFuture(params: GetExportJobRequest): Future[GetExportJobResponse] =
      service.getExportJob(params).promise().toFuture
    @inline def getExportJobsFuture(params: GetExportJobsRequest): Future[GetExportJobsResponse] =
      service.getExportJobs(params).promise().toFuture
    @inline def getGcmChannelFuture(params: GetGcmChannelRequest): Future[GetGcmChannelResponse] =
      service.getGcmChannel(params).promise().toFuture
    @inline def getImportJobFuture(params: GetImportJobRequest): Future[GetImportJobResponse] =
      service.getImportJob(params).promise().toFuture
    @inline def getImportJobsFuture(params: GetImportJobsRequest): Future[GetImportJobsResponse] =
      service.getImportJobs(params).promise().toFuture
    @inline def getJourneyDateRangeKpiFuture(
        params: GetJourneyDateRangeKpiRequest
    ): Future[GetJourneyDateRangeKpiResponse] = service.getJourneyDateRangeKpi(params).promise().toFuture
    @inline def getJourneyExecutionActivityMetricsFuture(
        params: GetJourneyExecutionActivityMetricsRequest
    ): Future[GetJourneyExecutionActivityMetricsResponse] =
      service.getJourneyExecutionActivityMetrics(params).promise().toFuture
    @inline def getJourneyExecutionMetricsFuture(
        params: GetJourneyExecutionMetricsRequest
    ): Future[GetJourneyExecutionMetricsResponse] = service.getJourneyExecutionMetrics(params).promise().toFuture
    @inline def getJourneyFuture(params: GetJourneyRequest): Future[GetJourneyResponse] =
      service.getJourney(params).promise().toFuture
    @inline def getPushTemplateFuture(params: GetPushTemplateRequest): Future[GetPushTemplateResponse] =
      service.getPushTemplate(params).promise().toFuture
    @inline def getSegmentExportJobsFuture(params: GetSegmentExportJobsRequest): Future[GetSegmentExportJobsResponse] =
      service.getSegmentExportJobs(params).promise().toFuture
    @inline def getSegmentFuture(params: GetSegmentRequest): Future[GetSegmentResponse] =
      service.getSegment(params).promise().toFuture
    @inline def getSegmentImportJobsFuture(params: GetSegmentImportJobsRequest): Future[GetSegmentImportJobsResponse] =
      service.getSegmentImportJobs(params).promise().toFuture
    @inline def getSegmentVersionFuture(params: GetSegmentVersionRequest): Future[GetSegmentVersionResponse] =
      service.getSegmentVersion(params).promise().toFuture
    @inline def getSegmentVersionsFuture(params: GetSegmentVersionsRequest): Future[GetSegmentVersionsResponse] =
      service.getSegmentVersions(params).promise().toFuture
    @inline def getSegmentsFuture(params: GetSegmentsRequest): Future[GetSegmentsResponse] =
      service.getSegments(params).promise().toFuture
    @inline def getSmsChannelFuture(params: GetSmsChannelRequest): Future[GetSmsChannelResponse] =
      service.getSmsChannel(params).promise().toFuture
    @inline def getSmsTemplateFuture(params: GetSmsTemplateRequest): Future[GetSmsTemplateResponse] =
      service.getSmsTemplate(params).promise().toFuture
    @inline def getUserEndpointsFuture(params: GetUserEndpointsRequest): Future[GetUserEndpointsResponse] =
      service.getUserEndpoints(params).promise().toFuture
    @inline def getVoiceChannelFuture(params: GetVoiceChannelRequest): Future[GetVoiceChannelResponse] =
      service.getVoiceChannel(params).promise().toFuture
    @inline def getVoiceTemplateFuture(params: GetVoiceTemplateRequest): Future[GetVoiceTemplateResponse] =
      service.getVoiceTemplate(params).promise().toFuture
    @inline def listJourneysFuture(params: ListJourneysRequest): Future[ListJourneysResponse] =
      service.listJourneys(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] =
      service.listTagsForResource(params).promise().toFuture
    @inline def listTemplateVersionsFuture(params: ListTemplateVersionsRequest): Future[ListTemplateVersionsResponse] =
      service.listTemplateVersions(params).promise().toFuture
    @inline def listTemplatesFuture(params: ListTemplatesRequest): Future[ListTemplatesResponse] =
      service.listTemplates(params).promise().toFuture
    @inline def phoneNumberValidateFuture(params: PhoneNumberValidateRequest): Future[PhoneNumberValidateResponse] =
      service.phoneNumberValidate(params).promise().toFuture
    @inline def putEventStreamFuture(params: PutEventStreamRequest): Future[PutEventStreamResponse] =
      service.putEventStream(params).promise().toFuture
    @inline def putEventsFuture(params: PutEventsRequest): Future[PutEventsResponse] =
      service.putEvents(params).promise().toFuture
    @inline def removeAttributesFuture(params: RemoveAttributesRequest): Future[RemoveAttributesResponse] =
      service.removeAttributes(params).promise().toFuture
    @inline def sendMessagesFuture(params: SendMessagesRequest): Future[SendMessagesResponse] =
      service.sendMessages(params).promise().toFuture
    @inline def sendUsersMessagesFuture(params: SendUsersMessagesRequest): Future[SendUsersMessagesResponse] =
      service.sendUsersMessages(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[js.Object] =
      service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[js.Object] =
      service.untagResource(params).promise().toFuture
    @inline def updateAdmChannelFuture(params: UpdateAdmChannelRequest): Future[UpdateAdmChannelResponse] =
      service.updateAdmChannel(params).promise().toFuture
    @inline def updateApnsChannelFuture(params: UpdateApnsChannelRequest): Future[UpdateApnsChannelResponse] =
      service.updateApnsChannel(params).promise().toFuture
    @inline def updateApnsSandboxChannelFuture(
        params: UpdateApnsSandboxChannelRequest
    ): Future[UpdateApnsSandboxChannelResponse] = service.updateApnsSandboxChannel(params).promise().toFuture
    @inline def updateApnsVoipChannelFuture(
        params: UpdateApnsVoipChannelRequest
    ): Future[UpdateApnsVoipChannelResponse] = service.updateApnsVoipChannel(params).promise().toFuture
    @inline def updateApnsVoipSandboxChannelFuture(
        params: UpdateApnsVoipSandboxChannelRequest
    ): Future[UpdateApnsVoipSandboxChannelResponse] = service.updateApnsVoipSandboxChannel(params).promise().toFuture
    @inline def updateApplicationSettingsFuture(
        params: UpdateApplicationSettingsRequest
    ): Future[UpdateApplicationSettingsResponse] = service.updateApplicationSettings(params).promise().toFuture
    @inline def updateBaiduChannelFuture(params: UpdateBaiduChannelRequest): Future[UpdateBaiduChannelResponse] =
      service.updateBaiduChannel(params).promise().toFuture
    @inline def updateCampaignFuture(params: UpdateCampaignRequest): Future[UpdateCampaignResponse] =
      service.updateCampaign(params).promise().toFuture
    @inline def updateEmailChannelFuture(params: UpdateEmailChannelRequest): Future[UpdateEmailChannelResponse] =
      service.updateEmailChannel(params).promise().toFuture
    @inline def updateEmailTemplateFuture(params: UpdateEmailTemplateRequest): Future[UpdateEmailTemplateResponse] =
      service.updateEmailTemplate(params).promise().toFuture
    @inline def updateEndpointFuture(params: UpdateEndpointRequest): Future[UpdateEndpointResponse] =
      service.updateEndpoint(params).promise().toFuture
    @inline def updateEndpointsBatchFuture(params: UpdateEndpointsBatchRequest): Future[UpdateEndpointsBatchResponse] =
      service.updateEndpointsBatch(params).promise().toFuture
    @inline def updateGcmChannelFuture(params: UpdateGcmChannelRequest): Future[UpdateGcmChannelResponse] =
      service.updateGcmChannel(params).promise().toFuture
    @inline def updateJourneyFuture(params: UpdateJourneyRequest): Future[UpdateJourneyResponse] =
      service.updateJourney(params).promise().toFuture
    @inline def updateJourneyStateFuture(params: UpdateJourneyStateRequest): Future[UpdateJourneyStateResponse] =
      service.updateJourneyState(params).promise().toFuture
    @inline def updatePushTemplateFuture(params: UpdatePushTemplateRequest): Future[UpdatePushTemplateResponse] =
      service.updatePushTemplate(params).promise().toFuture
    @inline def updateSegmentFuture(params: UpdateSegmentRequest): Future[UpdateSegmentResponse] =
      service.updateSegment(params).promise().toFuture
    @inline def updateSmsChannelFuture(params: UpdateSmsChannelRequest): Future[UpdateSmsChannelResponse] =
      service.updateSmsChannel(params).promise().toFuture
    @inline def updateSmsTemplateFuture(params: UpdateSmsTemplateRequest): Future[UpdateSmsTemplateResponse] =
      service.updateSmsTemplate(params).promise().toFuture
    @inline def updateTemplateActiveVersionFuture(
        params: UpdateTemplateActiveVersionRequest
    ): Future[UpdateTemplateActiveVersionResponse] = service.updateTemplateActiveVersion(params).promise().toFuture
    @inline def updateVoiceChannelFuture(params: UpdateVoiceChannelRequest): Future[UpdateVoiceChannelResponse] =
      service.updateVoiceChannel(params).promise().toFuture
    @inline def updateVoiceTemplateFuture(params: UpdateVoiceTemplateRequest): Future[UpdateVoiceTemplateResponse] =
      service.updateVoiceTemplate(params).promise().toFuture
  }
}

package pinpoint {
  @js.native
  @JSImport("aws-sdk", "Pinpoint")
  class Pinpoint() extends js.Object {
    def this(config: AWSConfig) = this()

    def createApp(params: CreateAppRequest): Request[CreateAppResponse]                               = js.native
    def createCampaign(params: CreateCampaignRequest): Request[CreateCampaignResponse]                = js.native
    def createEmailTemplate(params: CreateEmailTemplateRequest): Request[CreateEmailTemplateResponse] = js.native
    def createExportJob(params: CreateExportJobRequest): Request[CreateExportJobResponse]             = js.native
    def createImportJob(params: CreateImportJobRequest): Request[CreateImportJobResponse]             = js.native
    def createJourney(params: CreateJourneyRequest): Request[CreateJourneyResponse]                   = js.native
    def createPushTemplate(params: CreatePushTemplateRequest): Request[CreatePushTemplateResponse]    = js.native
    def createSegment(params: CreateSegmentRequest): Request[CreateSegmentResponse]                   = js.native
    def createSmsTemplate(params: CreateSmsTemplateRequest): Request[CreateSmsTemplateResponse]       = js.native
    def createVoiceTemplate(params: CreateVoiceTemplateRequest): Request[CreateVoiceTemplateResponse] = js.native
    def deleteAdmChannel(params: DeleteAdmChannelRequest): Request[DeleteAdmChannelResponse]          = js.native
    def deleteApnsChannel(params: DeleteApnsChannelRequest): Request[DeleteApnsChannelResponse]       = js.native
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
    def deleteEmailTemplate(params: DeleteEmailTemplateRequest): Request[DeleteEmailTemplateResponse]       = js.native
    def deleteEndpoint(params: DeleteEndpointRequest): Request[DeleteEndpointResponse]                      = js.native
    def deleteEventStream(params: DeleteEventStreamRequest): Request[DeleteEventStreamResponse]             = js.native
    def deleteGcmChannel(params: DeleteGcmChannelRequest): Request[DeleteGcmChannelResponse]                = js.native
    def deleteJourney(params: DeleteJourneyRequest): Request[DeleteJourneyResponse]                         = js.native
    def deletePushTemplate(params: DeletePushTemplateRequest): Request[DeletePushTemplateResponse]          = js.native
    def deleteSegment(params: DeleteSegmentRequest): Request[DeleteSegmentResponse]                         = js.native
    def deleteSmsChannel(params: DeleteSmsChannelRequest): Request[DeleteSmsChannelResponse]                = js.native
    def deleteSmsTemplate(params: DeleteSmsTemplateRequest): Request[DeleteSmsTemplateResponse]             = js.native
    def deleteUserEndpoints(params: DeleteUserEndpointsRequest): Request[DeleteUserEndpointsResponse]       = js.native
    def deleteVoiceChannel(params: DeleteVoiceChannelRequest): Request[DeleteVoiceChannelResponse]          = js.native
    def deleteVoiceTemplate(params: DeleteVoiceTemplateRequest): Request[DeleteVoiceTemplateResponse]       = js.native
    def getAdmChannel(params: GetAdmChannelRequest): Request[GetAdmChannelResponse]                         = js.native
    def getApnsChannel(params: GetApnsChannelRequest): Request[GetApnsChannelResponse]                      = js.native
    def getApnsSandboxChannel(params: GetApnsSandboxChannelRequest): Request[GetApnsSandboxChannelResponse] = js.native
    def getApnsVoipChannel(params: GetApnsVoipChannelRequest): Request[GetApnsVoipChannelResponse]          = js.native
    def getApnsVoipSandboxChannel(
        params: GetApnsVoipSandboxChannelRequest
    ): Request[GetApnsVoipSandboxChannelResponse]              = js.native
    def getApp(params: GetAppRequest): Request[GetAppResponse] = js.native
    def getApplicationDateRangeKpi(
        params: GetApplicationDateRangeKpiRequest
    ): Request[GetApplicationDateRangeKpiResponse] = js.native
    def getApplicationSettings(params: GetApplicationSettingsRequest): Request[GetApplicationSettingsResponse] =
      js.native
    def getApps(params: GetAppsRequest): Request[GetAppsResponse]                                           = js.native
    def getBaiduChannel(params: GetBaiduChannelRequest): Request[GetBaiduChannelResponse]                   = js.native
    def getCampaign(params: GetCampaignRequest): Request[GetCampaignResponse]                               = js.native
    def getCampaignActivities(params: GetCampaignActivitiesRequest): Request[GetCampaignActivitiesResponse] = js.native
    def getCampaignDateRangeKpi(params: GetCampaignDateRangeKpiRequest): Request[GetCampaignDateRangeKpiResponse] =
      js.native
    def getCampaignVersion(params: GetCampaignVersionRequest): Request[GetCampaignVersionResponse]    = js.native
    def getCampaignVersions(params: GetCampaignVersionsRequest): Request[GetCampaignVersionsResponse] = js.native
    def getCampaigns(params: GetCampaignsRequest): Request[GetCampaignsResponse]                      = js.native
    def getChannels(params: GetChannelsRequest): Request[GetChannelsResponse]                         = js.native
    def getEmailChannel(params: GetEmailChannelRequest): Request[GetEmailChannelResponse]             = js.native
    def getEmailTemplate(params: GetEmailTemplateRequest): Request[GetEmailTemplateResponse]          = js.native
    def getEndpoint(params: GetEndpointRequest): Request[GetEndpointResponse]                         = js.native
    def getEventStream(params: GetEventStreamRequest): Request[GetEventStreamResponse]                = js.native
    def getExportJob(params: GetExportJobRequest): Request[GetExportJobResponse]                      = js.native
    def getExportJobs(params: GetExportJobsRequest): Request[GetExportJobsResponse]                   = js.native
    def getGcmChannel(params: GetGcmChannelRequest): Request[GetGcmChannelResponse]                   = js.native
    def getImportJob(params: GetImportJobRequest): Request[GetImportJobResponse]                      = js.native
    def getImportJobs(params: GetImportJobsRequest): Request[GetImportJobsResponse]                   = js.native
    def getJourney(params: GetJourneyRequest): Request[GetJourneyResponse]                            = js.native
    def getJourneyDateRangeKpi(params: GetJourneyDateRangeKpiRequest): Request[GetJourneyDateRangeKpiResponse] =
      js.native
    def getJourneyExecutionActivityMetrics(
        params: GetJourneyExecutionActivityMetricsRequest
    ): Request[GetJourneyExecutionActivityMetricsResponse] = js.native
    def getJourneyExecutionMetrics(
        params: GetJourneyExecutionMetricsRequest
    ): Request[GetJourneyExecutionMetricsResponse]                                                       = js.native
    def getPushTemplate(params: GetPushTemplateRequest): Request[GetPushTemplateResponse]                = js.native
    def getSegment(params: GetSegmentRequest): Request[GetSegmentResponse]                               = js.native
    def getSegmentExportJobs(params: GetSegmentExportJobsRequest): Request[GetSegmentExportJobsResponse] = js.native
    def getSegmentImportJobs(params: GetSegmentImportJobsRequest): Request[GetSegmentImportJobsResponse] = js.native
    def getSegmentVersion(params: GetSegmentVersionRequest): Request[GetSegmentVersionResponse]          = js.native
    def getSegmentVersions(params: GetSegmentVersionsRequest): Request[GetSegmentVersionsResponse]       = js.native
    def getSegments(params: GetSegmentsRequest): Request[GetSegmentsResponse]                            = js.native
    def getSmsChannel(params: GetSmsChannelRequest): Request[GetSmsChannelResponse]                      = js.native
    def getSmsTemplate(params: GetSmsTemplateRequest): Request[GetSmsTemplateResponse]                   = js.native
    def getUserEndpoints(params: GetUserEndpointsRequest): Request[GetUserEndpointsResponse]             = js.native
    def getVoiceChannel(params: GetVoiceChannelRequest): Request[GetVoiceChannelResponse]                = js.native
    def getVoiceTemplate(params: GetVoiceTemplateRequest): Request[GetVoiceTemplateResponse]             = js.native
    def listJourneys(params: ListJourneysRequest): Request[ListJourneysResponse]                         = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse]    = js.native
    def listTemplateVersions(params: ListTemplateVersionsRequest): Request[ListTemplateVersionsResponse] = js.native
    def listTemplates(params: ListTemplatesRequest): Request[ListTemplatesResponse]                      = js.native
    def phoneNumberValidate(params: PhoneNumberValidateRequest): Request[PhoneNumberValidateResponse]    = js.native
    def putEventStream(params: PutEventStreamRequest): Request[PutEventStreamResponse]                   = js.native
    def putEvents(params: PutEventsRequest): Request[PutEventsResponse]                                  = js.native
    def removeAttributes(params: RemoveAttributesRequest): Request[RemoveAttributesResponse]             = js.native
    def sendMessages(params: SendMessagesRequest): Request[SendMessagesResponse]                         = js.native
    def sendUsersMessages(params: SendUsersMessagesRequest): Request[SendUsersMessagesResponse]          = js.native
    def tagResource(params: TagResourceRequest): Request[js.Object]                                      = js.native
    def untagResource(params: UntagResourceRequest): Request[js.Object]                                  = js.native
    def updateAdmChannel(params: UpdateAdmChannelRequest): Request[UpdateAdmChannelResponse]             = js.native
    def updateApnsChannel(params: UpdateApnsChannelRequest): Request[UpdateApnsChannelResponse]          = js.native
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
    def updateEmailTemplate(params: UpdateEmailTemplateRequest): Request[UpdateEmailTemplateResponse]    = js.native
    def updateEndpoint(params: UpdateEndpointRequest): Request[UpdateEndpointResponse]                   = js.native
    def updateEndpointsBatch(params: UpdateEndpointsBatchRequest): Request[UpdateEndpointsBatchResponse] = js.native
    def updateGcmChannel(params: UpdateGcmChannelRequest): Request[UpdateGcmChannelResponse]             = js.native
    def updateJourney(params: UpdateJourneyRequest): Request[UpdateJourneyResponse]                      = js.native
    def updateJourneyState(params: UpdateJourneyStateRequest): Request[UpdateJourneyStateResponse]       = js.native
    def updatePushTemplate(params: UpdatePushTemplateRequest): Request[UpdatePushTemplateResponse]       = js.native
    def updateSegment(params: UpdateSegmentRequest): Request[UpdateSegmentResponse]                      = js.native
    def updateSmsChannel(params: UpdateSmsChannelRequest): Request[UpdateSmsChannelResponse]             = js.native
    def updateSmsTemplate(params: UpdateSmsTemplateRequest): Request[UpdateSmsTemplateResponse]          = js.native
    def updateTemplateActiveVersion(
        params: UpdateTemplateActiveVersionRequest
    ): Request[UpdateTemplateActiveVersionResponse]                                                   = js.native
    def updateVoiceChannel(params: UpdateVoiceChannelRequest): Request[UpdateVoiceChannelResponse]    = js.native
    def updateVoiceTemplate(params: UpdateVoiceTemplateRequest): Request[UpdateVoiceTemplateResponse] = js.native
  }

  /**
    * Specifies the status and settings of the ADM (Amazon Device Messaging) channel for an application.
    */
  @js.native
  @Factory
  trait ADMChannelRequest extends js.Object {
    var ClientId: __string
    var ClientSecret: __string
    var Enabled: js.UndefOr[__boolean]
  }

  /**
    * Provides information about the status and settings of the ADM (Amazon Device Messaging) channel for an application.
    */
  @js.native
  @Factory
  trait ADMChannelResponse extends js.Object {
    var Platform: __string
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

  /**
    * Specifies the settings for a one-time message that's sent directly to an endpoint through the ADM (Amazon Device Messaging) channel.
    */
  @js.native
  @Factory
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

  /**
    * Specifies the status and settings of the APNs (Apple Push Notification service) channel for an application.
    */
  @js.native
  @Factory
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

  /**
    * Provides information about the status and settings of the APNs (Apple Push Notification service) channel for an application.
    */
  @js.native
  @Factory
  trait APNSChannelResponse extends js.Object {
    var Platform: __string
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
    var Version: js.UndefOr[__integer]
  }

  /**
    * Specifies the settings for a one-time message that's sent directly to an endpoint through the APNs (Apple Push Notification service) channel.
    */
  @js.native
  @Factory
  trait APNSMessage extends js.Object {
    var APNSPushType: js.UndefOr[__string]
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

  /**
    * Specifies channel-specific content and settings for a message template that can be used in push notifications that are sent through the APNs (Apple Push Notification service) channel.
    */
  @js.native
  @Factory
  trait APNSPushNotificationTemplate extends js.Object {
    var Action: js.UndefOr[Action]
    var Body: js.UndefOr[__string]
    var MediaUrl: js.UndefOr[__string]
    var RawContent: js.UndefOr[__string]
    var Sound: js.UndefOr[__string]
    var Title: js.UndefOr[__string]
    var Url: js.UndefOr[__string]
  }

  /**
    * Specifies the status and settings of the APNs (Apple Push Notification service) sandbox channel for an application.
    */
  @js.native
  @Factory
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

  /**
    * Provides information about the status and settings of the APNs (Apple Push Notification service) sandbox channel for an application.
    */
  @js.native
  @Factory
  trait APNSSandboxChannelResponse extends js.Object {
    var Platform: __string
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
    var Version: js.UndefOr[__integer]
  }

  /**
    * Specifies the status and settings of the APNs (Apple Push Notification service) VoIP channel for an application.
    */
  @js.native
  @Factory
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

  /**
    * Provides information about the status and settings of the APNs (Apple Push Notification service) VoIP channel for an application.
    */
  @js.native
  @Factory
  trait APNSVoipChannelResponse extends js.Object {
    var Platform: __string
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
    var Version: js.UndefOr[__integer]
  }

  /**
    * Specifies the status and settings of the APNs (Apple Push Notification service) VoIP sandbox channel for an application.
    */
  @js.native
  @Factory
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

  /**
    * Provides information about the status and settings of the APNs (Apple Push Notification service) VoIP sandbox channel for an application.
    */
  @js.native
  @Factory
  trait APNSVoipSandboxChannelResponse extends js.Object {
    var Platform: __string
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
    var Version: js.UndefOr[__integer]
  }

  @js.native
  sealed trait Action extends js.Any
  object Action extends js.Object {
    val OPEN_APP  = "OPEN_APP".asInstanceOf[Action]
    val DEEP_LINK = "DEEP_LINK".asInstanceOf[Action]
    val URL       = "URL".asInstanceOf[Action]

    val values = js.Object.freeze(js.Array(OPEN_APP, DEEP_LINK, URL))
  }

  /**
    * Provides information about the activities that were performed by a campaign.
    */
  @js.native
  @Factory
  trait ActivitiesResponse extends js.Object {
    var Item: ListOfActivityResponse
    var NextToken: js.UndefOr[__string]
  }

  /**
    * Specifies the configuration and other settings for an activity in a journey.
    */
  @js.native
  @Factory
  trait Activity extends js.Object {
    var ConditionalSplit: js.UndefOr[ConditionalSplitActivity]
    var Description: js.UndefOr[__string]
    var EMAIL: js.UndefOr[EmailMessageActivity]
    var Holdout: js.UndefOr[HoldoutActivity]
    var MultiCondition: js.UndefOr[MultiConditionalSplitActivity]
    var RandomSplit: js.UndefOr[RandomSplitActivity]
    var Wait: js.UndefOr[WaitActivity]
  }

  /**
    * Provides information about an activity that was performed by a campaign.
    */
  @js.native
  @Factory
  trait ActivityResponse extends js.Object {
    var ApplicationId: __string
    var CampaignId: __string
    var Id: __string
    var End: js.UndefOr[__string]
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

  /**
    * Specifies address-based configuration settings for a message that's sent directly to an endpoint.
    */
  @js.native
  @Factory
  trait AddressConfiguration extends js.Object {
    var BodyOverride: js.UndefOr[__string]
    var ChannelType: js.UndefOr[ChannelType]
    var Context: js.UndefOr[MapOf__string]
    var RawContent: js.UndefOr[__string]
    var Substitutions: js.UndefOr[MapOfListOf__string]
    var TitleOverride: js.UndefOr[__string]
  }

  /**
    * Specifies channel-specific content and settings for a message template that can be used in push notifications that are sent through the ADM (Amazon Device Messaging), Baidu (Baidu Cloud Push), or GCM (Firebase Cloud Messaging, formerly Google Cloud Messaging) channel.
    */
  @js.native
  @Factory
  trait AndroidPushNotificationTemplate extends js.Object {
    var Action: js.UndefOr[Action]
    var Body: js.UndefOr[__string]
    var ImageIconUrl: js.UndefOr[__string]
    var ImageUrl: js.UndefOr[__string]
    var RawContent: js.UndefOr[__string]
    var SmallImageIconUrl: js.UndefOr[__string]
    var Sound: js.UndefOr[__string]
    var Title: js.UndefOr[__string]
    var Url: js.UndefOr[__string]
  }

  /**
    * Provides the results of a query that retrieved the data for a standard metric that applies to an application, and provides information about that query.
    */
  @js.native
  @Factory
  trait ApplicationDateRangeKpiResponse extends js.Object {
    var ApplicationId: __string
    var EndTime: __timestampIso8601
    var KpiName: __string
    var KpiResult: BaseKpiResult
    var StartTime: __timestampIso8601
    var NextToken: js.UndefOr[__string]
  }

  /**
    * Provides information about an application.
    */
  @js.native
  @Factory
  trait ApplicationResponse extends js.Object {
    var Arn: __string
    var Id: __string
    var Name: __string
    var tags: js.UndefOr[MapOf__string]
  }

  /**
    * Provides information about an application, including the default settings for an application.
    */
  @js.native
  @Factory
  trait ApplicationSettingsResource extends js.Object {
    var ApplicationId: __string
    var CampaignHook: js.UndefOr[CampaignHook]
    var LastModifiedDate: js.UndefOr[__string]
    var Limits: js.UndefOr[CampaignLimits]
    var QuietTime: js.UndefOr[QuietTime]
  }

  /**
    * Provides information about all of your applications.
    */
  @js.native
  @Factory
  trait ApplicationsResponse extends js.Object {
    var Item: js.UndefOr[ListOfApplicationResponse]
    var NextToken: js.UndefOr[__string]
  }

  /**
    * Specifies attribute-based criteria for including or excluding endpoints from a segment.
    */
  @js.native
  @Factory
  trait AttributeDimension extends js.Object {
    var Values: ListOf__string
    var AttributeType: js.UndefOr[AttributeType]
  }

  @js.native
  sealed trait AttributeType extends js.Any
  object AttributeType extends js.Object {
    val INCLUSIVE = "INCLUSIVE".asInstanceOf[AttributeType]
    val EXCLUSIVE = "EXCLUSIVE".asInstanceOf[AttributeType]

    val values = js.Object.freeze(js.Array(INCLUSIVE, EXCLUSIVE))
  }

  /**
    * Provides information about the type and the names of attributes that were removed from all the endpoints that are associated with an application.
    */
  @js.native
  @Factory
  trait AttributesResource extends js.Object {
    var ApplicationId: __string
    var AttributeType: __string
    var Attributes: js.UndefOr[ListOf__string]
  }

  /**
    * Specifies the status and settings of the Baidu (Baidu Cloud Push) channel for an application.
    */
  @js.native
  @Factory
  trait BaiduChannelRequest extends js.Object {
    var ApiKey: __string
    var SecretKey: __string
    var Enabled: js.UndefOr[__boolean]
  }

  /**
    * Provides information about the status and settings of the Baidu (Baidu Cloud Push) channel for an application.
    */
  @js.native
  @Factory
  trait BaiduChannelResponse extends js.Object {
    var Credential: __string
    var Platform: __string
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

  /**
    * Specifies the settings for a one-time message that's sent directly to an endpoint through the Baidu (Baidu Cloud Push) channel.
    */
  @js.native
  @Factory
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

  /**
    * Provides the results of a query that retrieved the data for a standard metric that applies to an application, campaign, or journey.
    */
  @js.native
  @Factory
  trait BaseKpiResult extends js.Object {
    var Rows: ListOfResultRow
  }

  /**
    * Provides the results of a query that retrieved the data for a standard metric that applies to a campaign, and provides information about that query.
    */
  @js.native
  @Factory
  trait CampaignDateRangeKpiResponse extends js.Object {
    var ApplicationId: __string
    var CampaignId: __string
    var EndTime: __timestampIso8601
    var KpiName: __string
    var KpiResult: BaseKpiResult
    var StartTime: __timestampIso8601
    var NextToken: js.UndefOr[__string]
  }

  /**
    * Specifies the content and "From" address for an email message that's sent to recipients of a campaign.
    */
  @js.native
  @Factory
  trait CampaignEmailMessage extends js.Object {
    var Body: js.UndefOr[__string]
    var FromAddress: js.UndefOr[__string]
    var HtmlBody: js.UndefOr[__string]
    var Title: js.UndefOr[__string]
  }

  /**
    * Specifies the settings for events that cause a campaign to be sent.
    */
  @js.native
  @Factory
  trait CampaignEventFilter extends js.Object {
    var Dimensions: EventDimensions
    var FilterType: FilterType
  }

  /**
    * Specifies the AWS Lambda function to use as a code hook for a campaign.
    */
  @js.native
  @Factory
  trait CampaignHook extends js.Object {
    var LambdaFunctionName: js.UndefOr[__string]
    var Mode: js.UndefOr[Mode]
    var WebUrl: js.UndefOr[__string]
  }

  /**
    * Specifies limits on the messages that a campaign can send.
    */
  @js.native
  @Factory
  trait CampaignLimits extends js.Object {
    var Daily: js.UndefOr[__integer]
    var MaximumDuration: js.UndefOr[__integer]
    var MessagesPerSecond: js.UndefOr[__integer]
    var Total: js.UndefOr[__integer]
  }

  /**
    * Provides information about the status, configuration, and other settings for a campaign.
    */
  @js.native
  @Factory
  trait CampaignResponse extends js.Object {
    var ApplicationId: __string
    var Arn: __string
    var CreationDate: __string
    var Id: __string
    var LastModifiedDate: __string
    var SegmentId: __string
    var SegmentVersion: __integer
    var AdditionalTreatments: js.UndefOr[ListOfTreatmentResource]
    var DefaultState: js.UndefOr[CampaignState]
    var Description: js.UndefOr[__string]
    var HoldoutPercent: js.UndefOr[__integer]
    var Hook: js.UndefOr[CampaignHook]
    var IsPaused: js.UndefOr[__boolean]
    var Limits: js.UndefOr[CampaignLimits]
    var MessageConfiguration: js.UndefOr[MessageConfiguration]
    var Name: js.UndefOr[__string]
    var Schedule: js.UndefOr[Schedule]
    var State: js.UndefOr[CampaignState]
    var TemplateConfiguration: js.UndefOr[TemplateConfiguration]
    var TreatmentDescription: js.UndefOr[__string]
    var TreatmentName: js.UndefOr[__string]
    var Version: js.UndefOr[__integer]
    var tags: js.UndefOr[MapOf__string]
  }

  /**
    * Specifies the content and settings for an SMS message that's sent to recipients of a campaign.
    */
  @js.native
  @Factory
  trait CampaignSmsMessage extends js.Object {
    var Body: js.UndefOr[__string]
    var MessageType: js.UndefOr[MessageType]
    var SenderId: js.UndefOr[__string]
  }

  /**
    * Provides information about the status of a campaign.
    */
  @js.native
  @Factory
  trait CampaignState extends js.Object {
    var CampaignStatus: js.UndefOr[CampaignStatus]
  }

  @js.native
  sealed trait CampaignStatus extends js.Any
  object CampaignStatus extends js.Object {
    val SCHEDULED        = "SCHEDULED".asInstanceOf[CampaignStatus]
    val EXECUTING        = "EXECUTING".asInstanceOf[CampaignStatus]
    val PENDING_NEXT_RUN = "PENDING_NEXT_RUN".asInstanceOf[CampaignStatus]
    val COMPLETED        = "COMPLETED".asInstanceOf[CampaignStatus]
    val PAUSED           = "PAUSED".asInstanceOf[CampaignStatus]
    val DELETED          = "DELETED".asInstanceOf[CampaignStatus]

    val values = js.Object.freeze(js.Array(SCHEDULED, EXECUTING, PENDING_NEXT_RUN, COMPLETED, PAUSED, DELETED))
  }

  /**
    * Provides information about the configuration and other settings for all the campaigns that are associated with an application.
    */
  @js.native
  @Factory
  trait CampaignsResponse extends js.Object {
    var Item: ListOfCampaignResponse
    var NextToken: js.UndefOr[__string]
  }

  /**
    * Provides information about the general settings and status of a channel for an application.
    */
  @js.native
  @Factory
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

  @js.native
  sealed trait ChannelType extends js.Any
  object ChannelType extends js.Object {
    val GCM               = "GCM".asInstanceOf[ChannelType]
    val APNS              = "APNS".asInstanceOf[ChannelType]
    val APNS_SANDBOX      = "APNS_SANDBOX".asInstanceOf[ChannelType]
    val APNS_VOIP         = "APNS_VOIP".asInstanceOf[ChannelType]
    val APNS_VOIP_SANDBOX = "APNS_VOIP_SANDBOX".asInstanceOf[ChannelType]
    val ADM               = "ADM".asInstanceOf[ChannelType]
    val SMS               = "SMS".asInstanceOf[ChannelType]
    val VOICE             = "VOICE".asInstanceOf[ChannelType]
    val EMAIL             = "EMAIL".asInstanceOf[ChannelType]
    val BAIDU             = "BAIDU".asInstanceOf[ChannelType]
    val CUSTOM            = "CUSTOM".asInstanceOf[ChannelType]

    val values = js.Object.freeze(
      js.Array(GCM, APNS, APNS_SANDBOX, APNS_VOIP, APNS_VOIP_SANDBOX, ADM, SMS, VOICE, EMAIL, BAIDU, CUSTOM)
    )
  }

  /**
    * Provides information about the general settings and status of all channels for an application, including channels that aren't enabled for the application.
    */
  @js.native
  @Factory
  trait ChannelsResponse extends js.Object {
    var Channels: MapOfChannelResponse
  }

  /**
    * Specifies the conditions to evaluate for an activity in a journey, and how to evaluate those conditions.
    */
  @js.native
  @Factory
  trait Condition extends js.Object {
    var Conditions: js.UndefOr[ListOfSimpleCondition]
    var Operator: js.UndefOr[Operator]
  }

  /**
    * Specifies the settings for a yes/no split activity in a journey. This type of activity sends participants down one of two paths in a journey, based on conditions that you specify.
    */
  @js.native
  @Factory
  trait ConditionalSplitActivity extends js.Object {
    var Condition: js.UndefOr[Condition]
    var EvaluationWaitTime: js.UndefOr[WaitTime]
    var FalseActivity: js.UndefOr[__string]
    var TrueActivity: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait CreateAppRequest extends js.Object {
    var CreateApplicationRequest: CreateApplicationRequest
  }

  @js.native
  @Factory
  trait CreateAppResponse extends js.Object {
    var ApplicationResponse: ApplicationResponse
  }

  /**
    * Specifies the display name of an application and the tags to associate with the application.
    */
  @js.native
  @Factory
  trait CreateApplicationRequest extends js.Object {
    var Name: __string
    var tags: js.UndefOr[MapOf__string]
  }

  @js.native
  @Factory
  trait CreateCampaignRequest extends js.Object {
    var ApplicationId: __string
    var WriteCampaignRequest: WriteCampaignRequest
  }

  @js.native
  @Factory
  trait CreateCampaignResponse extends js.Object {
    var CampaignResponse: CampaignResponse
  }

  @js.native
  @Factory
  trait CreateEmailTemplateRequest extends js.Object {
    var EmailTemplateRequest: EmailTemplateRequest
    var TemplateName: __string
  }

  @js.native
  @Factory
  trait CreateEmailTemplateResponse extends js.Object {
    var CreateTemplateMessageBody: CreateTemplateMessageBody
  }

  @js.native
  @Factory
  trait CreateExportJobRequest extends js.Object {
    var ApplicationId: __string
    var ExportJobRequest: ExportJobRequest
  }

  @js.native
  @Factory
  trait CreateExportJobResponse extends js.Object {
    var ExportJobResponse: ExportJobResponse
  }

  @js.native
  @Factory
  trait CreateImportJobRequest extends js.Object {
    var ApplicationId: __string
    var ImportJobRequest: ImportJobRequest
  }

  @js.native
  @Factory
  trait CreateImportJobResponse extends js.Object {
    var ImportJobResponse: ImportJobResponse
  }

  @js.native
  @Factory
  trait CreateJourneyRequest extends js.Object {
    var ApplicationId: __string
    var WriteJourneyRequest: WriteJourneyRequest
  }

  @js.native
  @Factory
  trait CreateJourneyResponse extends js.Object {
    var JourneyResponse: JourneyResponse
  }

  @js.native
  @Factory
  trait CreatePushTemplateRequest extends js.Object {
    var PushNotificationTemplateRequest: PushNotificationTemplateRequest
    var TemplateName: __string
  }

  @js.native
  @Factory
  trait CreatePushTemplateResponse extends js.Object {
    var CreateTemplateMessageBody: CreateTemplateMessageBody
  }

  @js.native
  @Factory
  trait CreateSegmentRequest extends js.Object {
    var ApplicationId: __string
    var WriteSegmentRequest: WriteSegmentRequest
  }

  @js.native
  @Factory
  trait CreateSegmentResponse extends js.Object {
    var SegmentResponse: SegmentResponse
  }

  @js.native
  @Factory
  trait CreateSmsTemplateRequest extends js.Object {
    var SMSTemplateRequest: SMSTemplateRequest
    var TemplateName: __string
  }

  @js.native
  @Factory
  trait CreateSmsTemplateResponse extends js.Object {
    var CreateTemplateMessageBody: CreateTemplateMessageBody
  }

  /**
    * Provides information about a request to create a message template.
    */
  @js.native
  @Factory
  trait CreateTemplateMessageBody extends js.Object {
    var Arn: js.UndefOr[__string]
    var Message: js.UndefOr[__string]
    var RequestID: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait CreateVoiceTemplateRequest extends js.Object {
    var TemplateName: __string
    var VoiceTemplateRequest: VoiceTemplateRequest
  }

  @js.native
  @Factory
  trait CreateVoiceTemplateResponse extends js.Object {
    var CreateTemplateMessageBody: CreateTemplateMessageBody
  }

  /**
    * Specifies the default message for all channels.
    */
  @js.native
  @Factory
  trait DefaultMessage extends js.Object {
    var Body: js.UndefOr[__string]
    var Substitutions: js.UndefOr[MapOfListOf__string]
  }

  /**
    * Specifies the default settings and content for a push notification that's sent directly to an endpoint.
    */
  @js.native
  @Factory
  trait DefaultPushNotificationMessage extends js.Object {
    var Action: js.UndefOr[Action]
    var Body: js.UndefOr[__string]
    var Data: js.UndefOr[MapOf__string]
    var SilentPush: js.UndefOr[__boolean]
    var Substitutions: js.UndefOr[MapOfListOf__string]
    var Title: js.UndefOr[__string]
    var Url: js.UndefOr[__string]
  }

  /**
    * Specifies the default settings and content for a message template that can be used in messages that are sent through a push notification channel.
    */
  @js.native
  @Factory
  trait DefaultPushNotificationTemplate extends js.Object {
    var Action: js.UndefOr[Action]
    var Body: js.UndefOr[__string]
    var Sound: js.UndefOr[__string]
    var Title: js.UndefOr[__string]
    var Url: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait DeleteAdmChannelRequest extends js.Object {
    var ApplicationId: __string
  }

  @js.native
  @Factory
  trait DeleteAdmChannelResponse extends js.Object {
    var ADMChannelResponse: ADMChannelResponse
  }

  @js.native
  @Factory
  trait DeleteApnsChannelRequest extends js.Object {
    var ApplicationId: __string
  }

  @js.native
  @Factory
  trait DeleteApnsChannelResponse extends js.Object {
    var APNSChannelResponse: APNSChannelResponse
  }

  @js.native
  @Factory
  trait DeleteApnsSandboxChannelRequest extends js.Object {
    var ApplicationId: __string
  }

  @js.native
  @Factory
  trait DeleteApnsSandboxChannelResponse extends js.Object {
    var APNSSandboxChannelResponse: APNSSandboxChannelResponse
  }

  @js.native
  @Factory
  trait DeleteApnsVoipChannelRequest extends js.Object {
    var ApplicationId: __string
  }

  @js.native
  @Factory
  trait DeleteApnsVoipChannelResponse extends js.Object {
    var APNSVoipChannelResponse: APNSVoipChannelResponse
  }

  @js.native
  @Factory
  trait DeleteApnsVoipSandboxChannelRequest extends js.Object {
    var ApplicationId: __string
  }

  @js.native
  @Factory
  trait DeleteApnsVoipSandboxChannelResponse extends js.Object {
    var APNSVoipSandboxChannelResponse: APNSVoipSandboxChannelResponse
  }

  @js.native
  @Factory
  trait DeleteAppRequest extends js.Object {
    var ApplicationId: __string
  }

  @js.native
  @Factory
  trait DeleteAppResponse extends js.Object {
    var ApplicationResponse: ApplicationResponse
  }

  @js.native
  @Factory
  trait DeleteBaiduChannelRequest extends js.Object {
    var ApplicationId: __string
  }

  @js.native
  @Factory
  trait DeleteBaiduChannelResponse extends js.Object {
    var BaiduChannelResponse: BaiduChannelResponse
  }

  @js.native
  @Factory
  trait DeleteCampaignRequest extends js.Object {
    var ApplicationId: __string
    var CampaignId: __string
  }

  @js.native
  @Factory
  trait DeleteCampaignResponse extends js.Object {
    var CampaignResponse: CampaignResponse
  }

  @js.native
  @Factory
  trait DeleteEmailChannelRequest extends js.Object {
    var ApplicationId: __string
  }

  @js.native
  @Factory
  trait DeleteEmailChannelResponse extends js.Object {
    var EmailChannelResponse: EmailChannelResponse
  }

  @js.native
  @Factory
  trait DeleteEmailTemplateRequest extends js.Object {
    var TemplateName: __string
    var Version: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait DeleteEmailTemplateResponse extends js.Object {
    var MessageBody: MessageBody
  }

  @js.native
  @Factory
  trait DeleteEndpointRequest extends js.Object {
    var ApplicationId: __string
    var EndpointId: __string
  }

  @js.native
  @Factory
  trait DeleteEndpointResponse extends js.Object {
    var EndpointResponse: EndpointResponse
  }

  @js.native
  @Factory
  trait DeleteEventStreamRequest extends js.Object {
    var ApplicationId: __string
  }

  @js.native
  @Factory
  trait DeleteEventStreamResponse extends js.Object {
    var EventStream: EventStream
  }

  @js.native
  @Factory
  trait DeleteGcmChannelRequest extends js.Object {
    var ApplicationId: __string
  }

  @js.native
  @Factory
  trait DeleteGcmChannelResponse extends js.Object {
    var GCMChannelResponse: GCMChannelResponse
  }

  @js.native
  @Factory
  trait DeleteJourneyRequest extends js.Object {
    var ApplicationId: __string
    var JourneyId: __string
  }

  @js.native
  @Factory
  trait DeleteJourneyResponse extends js.Object {
    var JourneyResponse: JourneyResponse
  }

  @js.native
  @Factory
  trait DeletePushTemplateRequest extends js.Object {
    var TemplateName: __string
    var Version: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait DeletePushTemplateResponse extends js.Object {
    var MessageBody: MessageBody
  }

  @js.native
  @Factory
  trait DeleteSegmentRequest extends js.Object {
    var ApplicationId: __string
    var SegmentId: __string
  }

  @js.native
  @Factory
  trait DeleteSegmentResponse extends js.Object {
    var SegmentResponse: SegmentResponse
  }

  @js.native
  @Factory
  trait DeleteSmsChannelRequest extends js.Object {
    var ApplicationId: __string
  }

  @js.native
  @Factory
  trait DeleteSmsChannelResponse extends js.Object {
    var SMSChannelResponse: SMSChannelResponse
  }

  @js.native
  @Factory
  trait DeleteSmsTemplateRequest extends js.Object {
    var TemplateName: __string
    var Version: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait DeleteSmsTemplateResponse extends js.Object {
    var MessageBody: MessageBody
  }

  @js.native
  @Factory
  trait DeleteUserEndpointsRequest extends js.Object {
    var ApplicationId: __string
    var UserId: __string
  }

  @js.native
  @Factory
  trait DeleteUserEndpointsResponse extends js.Object {
    var EndpointsResponse: EndpointsResponse
  }

  @js.native
  @Factory
  trait DeleteVoiceChannelRequest extends js.Object {
    var ApplicationId: __string
  }

  @js.native
  @Factory
  trait DeleteVoiceChannelResponse extends js.Object {
    var VoiceChannelResponse: VoiceChannelResponse
  }

  @js.native
  @Factory
  trait DeleteVoiceTemplateRequest extends js.Object {
    var TemplateName: __string
    var Version: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait DeleteVoiceTemplateResponse extends js.Object {
    var MessageBody: MessageBody
  }

  @js.native
  sealed trait DeliveryStatus extends js.Any
  object DeliveryStatus extends js.Object {
    val SUCCESSFUL        = "SUCCESSFUL".asInstanceOf[DeliveryStatus]
    val THROTTLED         = "THROTTLED".asInstanceOf[DeliveryStatus]
    val TEMPORARY_FAILURE = "TEMPORARY_FAILURE".asInstanceOf[DeliveryStatus]
    val PERMANENT_FAILURE = "PERMANENT_FAILURE".asInstanceOf[DeliveryStatus]
    val UNKNOWN_FAILURE   = "UNKNOWN_FAILURE".asInstanceOf[DeliveryStatus]
    val OPT_OUT           = "OPT_OUT".asInstanceOf[DeliveryStatus]
    val DUPLICATE         = "DUPLICATE".asInstanceOf[DeliveryStatus]

    val values = js.Object.freeze(
      js.Array(SUCCESSFUL, THROTTLED, TEMPORARY_FAILURE, PERMANENT_FAILURE, UNKNOWN_FAILURE, OPT_OUT, DUPLICATE)
    )
  }

  @js.native
  sealed trait DimensionType extends js.Any
  object DimensionType extends js.Object {
    val INCLUSIVE = "INCLUSIVE".asInstanceOf[DimensionType]
    val EXCLUSIVE = "EXCLUSIVE".asInstanceOf[DimensionType]

    val values = js.Object.freeze(js.Array(INCLUSIVE, EXCLUSIVE))
  }

  /**
    * Specifies the settings and content for the default message and any default messages that you tailored for specific channels.
    */
  @js.native
  @Factory
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

  @js.native
  sealed trait Duration extends js.Any
  object Duration extends js.Object {
    val HR_24  = "HR_24".asInstanceOf[Duration]
    val DAY_7  = "DAY_7".asInstanceOf[Duration]
    val DAY_14 = "DAY_14".asInstanceOf[Duration]
    val DAY_30 = "DAY_30".asInstanceOf[Duration]

    val values = js.Object.freeze(js.Array(HR_24, DAY_7, DAY_14, DAY_30))
  }

  /**
    * Specifies the status and settings of the email channel for an application.
    */
  @js.native
  @Factory
  trait EmailChannelRequest extends js.Object {
    var FromAddress: __string
    var Identity: __string
    var ConfigurationSet: js.UndefOr[__string]
    var Enabled: js.UndefOr[__boolean]
    var RoleArn: js.UndefOr[__string]
  }

  /**
    * Provides information about the status and settings of the email channel for an application.
    */
  @js.native
  @Factory
  trait EmailChannelResponse extends js.Object {
    var Platform: __string
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
    var RoleArn: js.UndefOr[__string]
    var Version: js.UndefOr[__integer]
  }

  /**
    * Specifies the default settings and content for a one-time email message that's sent directly to an endpoint.
    */
  @js.native
  @Factory
  trait EmailMessage extends js.Object {
    var Body: js.UndefOr[__string]
    var FeedbackForwardingAddress: js.UndefOr[__string]
    var FromAddress: js.UndefOr[__string]
    var RawEmail: js.UndefOr[RawEmail]
    var ReplyToAddresses: js.UndefOr[ListOf__string]
    var SimpleEmail: js.UndefOr[SimpleEmail]
    var Substitutions: js.UndefOr[MapOfListOf__string]
  }

  /**
    * Specifies the settings for an email activity in a journey. This type of activity sends an email message to participants.
    */
  @js.native
  @Factory
  trait EmailMessageActivity extends js.Object {
    var MessageConfig: js.UndefOr[JourneyEmailMessage]
    var NextActivity: js.UndefOr[__string]
    var TemplateName: js.UndefOr[__string]
    var TemplateVersion: js.UndefOr[__string]
  }

  /**
    * Specifies the content and settings for a message template that can be used in messages that are sent through the email channel.
    */
  @js.native
  @Factory
  trait EmailTemplateRequest extends js.Object {
    var DefaultSubstitutions: js.UndefOr[__string]
    var HtmlPart: js.UndefOr[__string]
    var Subject: js.UndefOr[__string]
    var TemplateDescription: js.UndefOr[__string]
    var TextPart: js.UndefOr[__string]
    var tags: js.UndefOr[MapOf__string]
  }

  /**
    * Provides information about the content and settings for a message template that can be used in messages that are sent through the email channel.
    */
  @js.native
  @Factory
  trait EmailTemplateResponse extends js.Object {
    var CreationDate: __string
    var LastModifiedDate: __string
    var TemplateName: __string
    var TemplateType: TemplateType
    var Arn: js.UndefOr[__string]
    var DefaultSubstitutions: js.UndefOr[__string]
    var HtmlPart: js.UndefOr[__string]
    var Subject: js.UndefOr[__string]
    var TemplateDescription: js.UndefOr[__string]
    var TextPart: js.UndefOr[__string]
    var Version: js.UndefOr[__string]
    var tags: js.UndefOr[MapOf__string]
  }

  /**
    * Specifies an endpoint to create or update and the settings and attributes to set or change for the endpoint.
    */
  @js.native
  @Factory
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

  /**
    * Specifies a batch of endpoints to create or update and the settings and attributes to set or change for each endpoint.
    */
  @js.native
  @Factory
  trait EndpointBatchRequest extends js.Object {
    var Item: ListOfEndpointBatchItem
  }

  /**
    * Specifies demographic information about an endpoint, such as the applicable time zone and platform.
    */
  @js.native
  @Factory
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

  /**
    * Provides the status code and message that result from processing data for an endpoint.
    */
  @js.native
  @Factory
  trait EndpointItemResponse extends js.Object {
    var Message: js.UndefOr[__string]
    var StatusCode: js.UndefOr[__integer]
  }

  /**
    * Specifies geographic information about an endpoint.
    */
  @js.native
  @Factory
  trait EndpointLocation extends js.Object {
    var City: js.UndefOr[__string]
    var Country: js.UndefOr[__string]
    var Latitude: js.UndefOr[__double]
    var Longitude: js.UndefOr[__double]
    var PostalCode: js.UndefOr[__string]
    var Region: js.UndefOr[__string]
  }

  /**
    * Provides information about the delivery status and results of sending a message directly to an endpoint.
    */
  @js.native
  @Factory
  trait EndpointMessageResult extends js.Object {
    var DeliveryStatus: DeliveryStatus
    var StatusCode: __integer
    var Address: js.UndefOr[__string]
    var MessageId: js.UndefOr[__string]
    var StatusMessage: js.UndefOr[__string]
    var UpdatedToken: js.UndefOr[__string]
  }

  /**
    * Specifies the channel type and other settings for an endpoint.
    */
  @js.native
  @Factory
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

  /**
    * Provides information about the channel type and other settings for an endpoint.
    */
  @js.native
  @Factory
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

  /**
    * Specifies the content, including message variables and attributes, to use in a message that's sent directly to an endpoint.
    */
  @js.native
  @Factory
  trait EndpointSendConfiguration extends js.Object {
    var BodyOverride: js.UndefOr[__string]
    var Context: js.UndefOr[MapOf__string]
    var RawContent: js.UndefOr[__string]
    var Substitutions: js.UndefOr[MapOfListOf__string]
    var TitleOverride: js.UndefOr[__string]
  }

  /**
    * Specifies data for one or more attributes that describe the user who's associated with an endpoint.
    */
  @js.native
  @Factory
  trait EndpointUser extends js.Object {
    var UserAttributes: js.UndefOr[MapOfListOf__string]
    var UserId: js.UndefOr[__string]
  }

  /**
    * Provides information about all the endpoints that are associated with a user ID.
    */
  @js.native
  @Factory
  trait EndpointsResponse extends js.Object {
    var Item: ListOfEndpointResponse
  }

  /**
    * Specifies information about an event that reports data to Amazon Pinpoint.
    */
  @js.native
  @Factory
  trait Event extends js.Object {
    var EventType: __string
    var Timestamp: __string
    var AppPackageName: js.UndefOr[__string]
    var AppTitle: js.UndefOr[__string]
    var AppVersionCode: js.UndefOr[__string]
    var Attributes: js.UndefOr[MapOf__string]
    var ClientSdkVersion: js.UndefOr[__string]
    var Metrics: js.UndefOr[MapOf__double]
    var SdkName: js.UndefOr[__string]
    var Session: js.UndefOr[Session]
  }

  /**
    * Specifies the conditions to evaluate for an event that applies to an activity in a journey.
    */
  @js.native
  @Factory
  trait EventCondition extends js.Object {
    var Dimensions: EventDimensions
    var MessageActivity: js.UndefOr[__string]
  }

  /**
    * Specifies the dimensions for an event filter that determines when a campaign is sent or a journey activity is performed.
    */
  @js.native
  @Factory
  trait EventDimensions extends js.Object {
    var Attributes: js.UndefOr[MapOfAttributeDimension]
    var EventType: js.UndefOr[SetDimension]
    var Metrics: js.UndefOr[MapOfMetricDimension]
  }

  /**
    * Provides the status code and message that result from processing an event.
    */
  @js.native
  @Factory
  trait EventItemResponse extends js.Object {
    var Message: js.UndefOr[__string]
    var StatusCode: js.UndefOr[__integer]
  }

  /**
    * Specifies settings for publishing event data to an Amazon Kinesis data stream or an Amazon Kinesis Data Firehose delivery stream.
    */
  @js.native
  @Factory
  trait EventStream extends js.Object {
    var ApplicationId: __string
    var DestinationStreamArn: __string
    var RoleArn: __string
    var ExternalId: js.UndefOr[__string]
    var LastModifiedDate: js.UndefOr[__string]
    var LastUpdatedBy: js.UndefOr[__string]
  }

  /**
    * Specifies a batch of endpoints and events to process.
    */
  @js.native
  @Factory
  trait EventsBatch extends js.Object {
    var Endpoint: PublicEndpoint
    var Events: MapOfEvent
  }

  /**
    * Specifies a batch of events to process.
    */
  @js.native
  @Factory
  trait EventsRequest extends js.Object {
    var BatchItem: MapOfEventsBatch
  }

  /**
    * Provides information about endpoints and the events that they're associated with.
    */
  @js.native
  @Factory
  trait EventsResponse extends js.Object {
    var Results: js.UndefOr[MapOfItemResponse]
  }

  /**
    * Specifies the settings for a job that exports endpoint definitions to an Amazon Simple Storage Service (Amazon S3) bucket.
    */
  @js.native
  @Factory
  trait ExportJobRequest extends js.Object {
    var RoleArn: __string
    var S3UrlPrefix: __string
    var SegmentId: js.UndefOr[__string]
    var SegmentVersion: js.UndefOr[__integer]
  }

  /**
    * Provides information about the resource settings for a job that exports endpoint definitions to a file. The file can be added directly to an Amazon Simple Storage Service (Amazon S3) bucket by using the Amazon Pinpoint API or downloaded directly to a computer by using the Amazon Pinpoint console.
    */
  @js.native
  @Factory
  trait ExportJobResource extends js.Object {
    var RoleArn: __string
    var S3UrlPrefix: __string
    var SegmentId: js.UndefOr[__string]
    var SegmentVersion: js.UndefOr[__integer]
  }

  /**
    * Provides information about the status and settings of a job that exports endpoint definitions to a file. The file can be added directly to an Amazon Simple Storage Service (Amazon S3) bucket by using the Amazon Pinpoint API or downloaded directly to a computer by using the Amazon Pinpoint console.
    */
  @js.native
  @Factory
  trait ExportJobResponse extends js.Object {
    var ApplicationId: __string
    var CreationDate: __string
    var Definition: ExportJobResource
    var Id: __string
    var JobStatus: JobStatus
    var Type: __string
    var CompletedPieces: js.UndefOr[__integer]
    var CompletionDate: js.UndefOr[__string]
    var FailedPieces: js.UndefOr[__integer]
    var Failures: js.UndefOr[ListOf__string]
    var TotalFailures: js.UndefOr[__integer]
    var TotalPieces: js.UndefOr[__integer]
    var TotalProcessed: js.UndefOr[__integer]
  }

  /**
    * Provides information about all the export jobs that are associated with an application or segment. An export job is a job that exports endpoint definitions to a file.
    */
  @js.native
  @Factory
  trait ExportJobsResponse extends js.Object {
    var Item: ListOfExportJobResponse
    var NextToken: js.UndefOr[__string]
  }

  @js.native
  sealed trait FilterType extends js.Any
  object FilterType extends js.Object {
    val SYSTEM   = "SYSTEM".asInstanceOf[FilterType]
    val ENDPOINT = "ENDPOINT".asInstanceOf[FilterType]

    val values = js.Object.freeze(js.Array(SYSTEM, ENDPOINT))
  }

  @js.native
  sealed trait Format extends js.Any
  object Format extends js.Object {
    val CSV  = "CSV".asInstanceOf[Format]
    val JSON = "JSON".asInstanceOf[Format]

    val values = js.Object.freeze(js.Array(CSV, JSON))
  }

  @js.native
  sealed trait Frequency extends js.Any
  object Frequency extends js.Object {
    val ONCE    = "ONCE".asInstanceOf[Frequency]
    val HOURLY  = "HOURLY".asInstanceOf[Frequency]
    val DAILY   = "DAILY".asInstanceOf[Frequency]
    val WEEKLY  = "WEEKLY".asInstanceOf[Frequency]
    val MONTHLY = "MONTHLY".asInstanceOf[Frequency]
    val EVENT   = "EVENT".asInstanceOf[Frequency]

    val values = js.Object.freeze(js.Array(ONCE, HOURLY, DAILY, WEEKLY, MONTHLY, EVENT))
  }

  /**
    * Specifies the status and settings of the GCM channel for an application. This channel enables Amazon Pinpoint to send push notifications through the Firebase Cloud Messaging (FCM), formerly Google Cloud Messaging (GCM), service.
    */
  @js.native
  @Factory
  trait GCMChannelRequest extends js.Object {
    var ApiKey: __string
    var Enabled: js.UndefOr[__boolean]
  }

  /**
    * Provides information about the status and settings of the GCM channel for an application. The GCM channel enables Amazon Pinpoint to send push notifications through the Firebase Cloud Messaging (FCM), formerly Google Cloud Messaging (GCM), service.
    */
  @js.native
  @Factory
  trait GCMChannelResponse extends js.Object {
    var Credential: __string
    var Platform: __string
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

  /**
    * Specifies the settings for a one-time message that's sent directly to an endpoint through the GCM channel. The GCM channel enables Amazon Pinpoint to send messages to the Firebase Cloud Messaging (FCM), formerly Google Cloud Messaging (GCM), service.
    */
  @js.native
  @Factory
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

  /**
    * Specifies the GPS coordinates of a location.
    */
  @js.native
  @Factory
  trait GPSCoordinates extends js.Object {
    var Latitude: __double
    var Longitude: __double
  }

  /**
    * Specifies GPS-based criteria for including or excluding endpoints from a segment.
    */
  @js.native
  @Factory
  trait GPSPointDimension extends js.Object {
    var Coordinates: GPSCoordinates
    var RangeInKilometers: js.UndefOr[__double]
  }

  @js.native
  @Factory
  trait GetAdmChannelRequest extends js.Object {
    var ApplicationId: __string
  }

  @js.native
  @Factory
  trait GetAdmChannelResponse extends js.Object {
    var ADMChannelResponse: ADMChannelResponse
  }

  @js.native
  @Factory
  trait GetApnsChannelRequest extends js.Object {
    var ApplicationId: __string
  }

  @js.native
  @Factory
  trait GetApnsChannelResponse extends js.Object {
    var APNSChannelResponse: APNSChannelResponse
  }

  @js.native
  @Factory
  trait GetApnsSandboxChannelRequest extends js.Object {
    var ApplicationId: __string
  }

  @js.native
  @Factory
  trait GetApnsSandboxChannelResponse extends js.Object {
    var APNSSandboxChannelResponse: APNSSandboxChannelResponse
  }

  @js.native
  @Factory
  trait GetApnsVoipChannelRequest extends js.Object {
    var ApplicationId: __string
  }

  @js.native
  @Factory
  trait GetApnsVoipChannelResponse extends js.Object {
    var APNSVoipChannelResponse: APNSVoipChannelResponse
  }

  @js.native
  @Factory
  trait GetApnsVoipSandboxChannelRequest extends js.Object {
    var ApplicationId: __string
  }

  @js.native
  @Factory
  trait GetApnsVoipSandboxChannelResponse extends js.Object {
    var APNSVoipSandboxChannelResponse: APNSVoipSandboxChannelResponse
  }

  @js.native
  @Factory
  trait GetAppRequest extends js.Object {
    var ApplicationId: __string
  }

  @js.native
  @Factory
  trait GetAppResponse extends js.Object {
    var ApplicationResponse: ApplicationResponse
  }

  @js.native
  @Factory
  trait GetApplicationDateRangeKpiRequest extends js.Object {
    var ApplicationId: __string
    var KpiName: __string
    var EndTime: js.UndefOr[__timestampIso8601]
    var NextToken: js.UndefOr[__string]
    var PageSize: js.UndefOr[__string]
    var StartTime: js.UndefOr[__timestampIso8601]
  }

  @js.native
  @Factory
  trait GetApplicationDateRangeKpiResponse extends js.Object {
    var ApplicationDateRangeKpiResponse: ApplicationDateRangeKpiResponse
  }

  @js.native
  @Factory
  trait GetApplicationSettingsRequest extends js.Object {
    var ApplicationId: __string
  }

  @js.native
  @Factory
  trait GetApplicationSettingsResponse extends js.Object {
    var ApplicationSettingsResource: ApplicationSettingsResource
  }

  @js.native
  @Factory
  trait GetAppsRequest extends js.Object {
    var PageSize: js.UndefOr[__string]
    var Token: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait GetAppsResponse extends js.Object {
    var ApplicationsResponse: ApplicationsResponse
  }

  @js.native
  @Factory
  trait GetBaiduChannelRequest extends js.Object {
    var ApplicationId: __string
  }

  @js.native
  @Factory
  trait GetBaiduChannelResponse extends js.Object {
    var BaiduChannelResponse: BaiduChannelResponse
  }

  @js.native
  @Factory
  trait GetCampaignActivitiesRequest extends js.Object {
    var ApplicationId: __string
    var CampaignId: __string
    var PageSize: js.UndefOr[__string]
    var Token: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait GetCampaignActivitiesResponse extends js.Object {
    var ActivitiesResponse: ActivitiesResponse
  }

  @js.native
  @Factory
  trait GetCampaignDateRangeKpiRequest extends js.Object {
    var ApplicationId: __string
    var CampaignId: __string
    var KpiName: __string
    var EndTime: js.UndefOr[__timestampIso8601]
    var NextToken: js.UndefOr[__string]
    var PageSize: js.UndefOr[__string]
    var StartTime: js.UndefOr[__timestampIso8601]
  }

  @js.native
  @Factory
  trait GetCampaignDateRangeKpiResponse extends js.Object {
    var CampaignDateRangeKpiResponse: CampaignDateRangeKpiResponse
  }

  @js.native
  @Factory
  trait GetCampaignRequest extends js.Object {
    var ApplicationId: __string
    var CampaignId: __string
  }

  @js.native
  @Factory
  trait GetCampaignResponse extends js.Object {
    var CampaignResponse: CampaignResponse
  }

  @js.native
  @Factory
  trait GetCampaignVersionRequest extends js.Object {
    var ApplicationId: __string
    var CampaignId: __string
    var Version: __string
  }

  @js.native
  @Factory
  trait GetCampaignVersionResponse extends js.Object {
    var CampaignResponse: CampaignResponse
  }

  @js.native
  @Factory
  trait GetCampaignVersionsRequest extends js.Object {
    var ApplicationId: __string
    var CampaignId: __string
    var PageSize: js.UndefOr[__string]
    var Token: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait GetCampaignVersionsResponse extends js.Object {
    var CampaignsResponse: CampaignsResponse
  }

  @js.native
  @Factory
  trait GetCampaignsRequest extends js.Object {
    var ApplicationId: __string
    var PageSize: js.UndefOr[__string]
    var Token: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait GetCampaignsResponse extends js.Object {
    var CampaignsResponse: CampaignsResponse
  }

  @js.native
  @Factory
  trait GetChannelsRequest extends js.Object {
    var ApplicationId: __string
  }

  @js.native
  @Factory
  trait GetChannelsResponse extends js.Object {
    var ChannelsResponse: ChannelsResponse
  }

  @js.native
  @Factory
  trait GetEmailChannelRequest extends js.Object {
    var ApplicationId: __string
  }

  @js.native
  @Factory
  trait GetEmailChannelResponse extends js.Object {
    var EmailChannelResponse: EmailChannelResponse
  }

  @js.native
  @Factory
  trait GetEmailTemplateRequest extends js.Object {
    var TemplateName: __string
    var Version: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait GetEmailTemplateResponse extends js.Object {
    var EmailTemplateResponse: EmailTemplateResponse
  }

  @js.native
  @Factory
  trait GetEndpointRequest extends js.Object {
    var ApplicationId: __string
    var EndpointId: __string
  }

  @js.native
  @Factory
  trait GetEndpointResponse extends js.Object {
    var EndpointResponse: EndpointResponse
  }

  @js.native
  @Factory
  trait GetEventStreamRequest extends js.Object {
    var ApplicationId: __string
  }

  @js.native
  @Factory
  trait GetEventStreamResponse extends js.Object {
    var EventStream: EventStream
  }

  @js.native
  @Factory
  trait GetExportJobRequest extends js.Object {
    var ApplicationId: __string
    var JobId: __string
  }

  @js.native
  @Factory
  trait GetExportJobResponse extends js.Object {
    var ExportJobResponse: ExportJobResponse
  }

  @js.native
  @Factory
  trait GetExportJobsRequest extends js.Object {
    var ApplicationId: __string
    var PageSize: js.UndefOr[__string]
    var Token: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait GetExportJobsResponse extends js.Object {
    var ExportJobsResponse: ExportJobsResponse
  }

  @js.native
  @Factory
  trait GetGcmChannelRequest extends js.Object {
    var ApplicationId: __string
  }

  @js.native
  @Factory
  trait GetGcmChannelResponse extends js.Object {
    var GCMChannelResponse: GCMChannelResponse
  }

  @js.native
  @Factory
  trait GetImportJobRequest extends js.Object {
    var ApplicationId: __string
    var JobId: __string
  }

  @js.native
  @Factory
  trait GetImportJobResponse extends js.Object {
    var ImportJobResponse: ImportJobResponse
  }

  @js.native
  @Factory
  trait GetImportJobsRequest extends js.Object {
    var ApplicationId: __string
    var PageSize: js.UndefOr[__string]
    var Token: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait GetImportJobsResponse extends js.Object {
    var ImportJobsResponse: ImportJobsResponse
  }

  @js.native
  @Factory
  trait GetJourneyDateRangeKpiRequest extends js.Object {
    var ApplicationId: __string
    var JourneyId: __string
    var KpiName: __string
    var EndTime: js.UndefOr[__timestampIso8601]
    var NextToken: js.UndefOr[__string]
    var PageSize: js.UndefOr[__string]
    var StartTime: js.UndefOr[__timestampIso8601]
  }

  @js.native
  @Factory
  trait GetJourneyDateRangeKpiResponse extends js.Object {
    var JourneyDateRangeKpiResponse: JourneyDateRangeKpiResponse
  }

  @js.native
  @Factory
  trait GetJourneyExecutionActivityMetricsRequest extends js.Object {
    var ApplicationId: __string
    var JourneyActivityId: __string
    var JourneyId: __string
    var NextToken: js.UndefOr[__string]
    var PageSize: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait GetJourneyExecutionActivityMetricsResponse extends js.Object {
    var JourneyExecutionActivityMetricsResponse: JourneyExecutionActivityMetricsResponse
  }

  @js.native
  @Factory
  trait GetJourneyExecutionMetricsRequest extends js.Object {
    var ApplicationId: __string
    var JourneyId: __string
    var NextToken: js.UndefOr[__string]
    var PageSize: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait GetJourneyExecutionMetricsResponse extends js.Object {
    var JourneyExecutionMetricsResponse: JourneyExecutionMetricsResponse
  }

  @js.native
  @Factory
  trait GetJourneyRequest extends js.Object {
    var ApplicationId: __string
    var JourneyId: __string
  }

  @js.native
  @Factory
  trait GetJourneyResponse extends js.Object {
    var JourneyResponse: JourneyResponse
  }

  @js.native
  @Factory
  trait GetPushTemplateRequest extends js.Object {
    var TemplateName: __string
    var Version: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait GetPushTemplateResponse extends js.Object {
    var PushNotificationTemplateResponse: PushNotificationTemplateResponse
  }

  @js.native
  @Factory
  trait GetSegmentExportJobsRequest extends js.Object {
    var ApplicationId: __string
    var SegmentId: __string
    var PageSize: js.UndefOr[__string]
    var Token: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait GetSegmentExportJobsResponse extends js.Object {
    var ExportJobsResponse: ExportJobsResponse
  }

  @js.native
  @Factory
  trait GetSegmentImportJobsRequest extends js.Object {
    var ApplicationId: __string
    var SegmentId: __string
    var PageSize: js.UndefOr[__string]
    var Token: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait GetSegmentImportJobsResponse extends js.Object {
    var ImportJobsResponse: ImportJobsResponse
  }

  @js.native
  @Factory
  trait GetSegmentRequest extends js.Object {
    var ApplicationId: __string
    var SegmentId: __string
  }

  @js.native
  @Factory
  trait GetSegmentResponse extends js.Object {
    var SegmentResponse: SegmentResponse
  }

  @js.native
  @Factory
  trait GetSegmentVersionRequest extends js.Object {
    var ApplicationId: __string
    var SegmentId: __string
    var Version: __string
  }

  @js.native
  @Factory
  trait GetSegmentVersionResponse extends js.Object {
    var SegmentResponse: SegmentResponse
  }

  @js.native
  @Factory
  trait GetSegmentVersionsRequest extends js.Object {
    var ApplicationId: __string
    var SegmentId: __string
    var PageSize: js.UndefOr[__string]
    var Token: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait GetSegmentVersionsResponse extends js.Object {
    var SegmentsResponse: SegmentsResponse
  }

  @js.native
  @Factory
  trait GetSegmentsRequest extends js.Object {
    var ApplicationId: __string
    var PageSize: js.UndefOr[__string]
    var Token: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait GetSegmentsResponse extends js.Object {
    var SegmentsResponse: SegmentsResponse
  }

  @js.native
  @Factory
  trait GetSmsChannelRequest extends js.Object {
    var ApplicationId: __string
  }

  @js.native
  @Factory
  trait GetSmsChannelResponse extends js.Object {
    var SMSChannelResponse: SMSChannelResponse
  }

  @js.native
  @Factory
  trait GetSmsTemplateRequest extends js.Object {
    var TemplateName: __string
    var Version: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait GetSmsTemplateResponse extends js.Object {
    var SMSTemplateResponse: SMSTemplateResponse
  }

  @js.native
  @Factory
  trait GetUserEndpointsRequest extends js.Object {
    var ApplicationId: __string
    var UserId: __string
  }

  @js.native
  @Factory
  trait GetUserEndpointsResponse extends js.Object {
    var EndpointsResponse: EndpointsResponse
  }

  @js.native
  @Factory
  trait GetVoiceChannelRequest extends js.Object {
    var ApplicationId: __string
  }

  @js.native
  @Factory
  trait GetVoiceChannelResponse extends js.Object {
    var VoiceChannelResponse: VoiceChannelResponse
  }

  @js.native
  @Factory
  trait GetVoiceTemplateRequest extends js.Object {
    var TemplateName: __string
    var Version: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait GetVoiceTemplateResponse extends js.Object {
    var VoiceTemplateResponse: VoiceTemplateResponse
  }

  /**
    * Specifies the settings for a holdout activity in a journey. This type of activity stops a journey for a specified percentage of participants.
    */
  @js.native
  @Factory
  trait HoldoutActivity extends js.Object {
    var Percentage: __integer
    var NextActivity: js.UndefOr[__string]
  }

  /**
    * Specifies the settings for a job that imports endpoint definitions from an Amazon Simple Storage Service (Amazon S3) bucket.
    */
  @js.native
  @Factory
  trait ImportJobRequest extends js.Object {
    var Format: Format
    var RoleArn: __string
    var S3Url: __string
    var DefineSegment: js.UndefOr[__boolean]
    var ExternalId: js.UndefOr[__string]
    var RegisterEndpoints: js.UndefOr[__boolean]
    var SegmentId: js.UndefOr[__string]
    var SegmentName: js.UndefOr[__string]
  }

  /**
    * Provides information about the resource settings for a job that imports endpoint definitions from one or more files. The files can be stored in an Amazon Simple Storage Service (Amazon S3) bucket or uploaded directly from a computer by using the Amazon Pinpoint console.
    */
  @js.native
  @Factory
  trait ImportJobResource extends js.Object {
    var Format: Format
    var RoleArn: __string
    var S3Url: __string
    var DefineSegment: js.UndefOr[__boolean]
    var ExternalId: js.UndefOr[__string]
    var RegisterEndpoints: js.UndefOr[__boolean]
    var SegmentId: js.UndefOr[__string]
    var SegmentName: js.UndefOr[__string]
  }

  /**
    * Provides information about the status and settings of a job that imports endpoint definitions from one or more files. The files can be stored in an Amazon Simple Storage Service (Amazon S3) bucket or uploaded directly from a computer by using the Amazon Pinpoint console.
    */
  @js.native
  @Factory
  trait ImportJobResponse extends js.Object {
    var ApplicationId: __string
    var CreationDate: __string
    var Definition: ImportJobResource
    var Id: __string
    var JobStatus: JobStatus
    var Type: __string
    var CompletedPieces: js.UndefOr[__integer]
    var CompletionDate: js.UndefOr[__string]
    var FailedPieces: js.UndefOr[__integer]
    var Failures: js.UndefOr[ListOf__string]
    var TotalFailures: js.UndefOr[__integer]
    var TotalPieces: js.UndefOr[__integer]
    var TotalProcessed: js.UndefOr[__integer]
  }

  /**
    * Provides information about the status and settings of all the import jobs that are associated with an application or segment. An import job is a job that imports endpoint definitions from one or more files.
    */
  @js.native
  @Factory
  trait ImportJobsResponse extends js.Object {
    var Item: ListOfImportJobResponse
    var NextToken: js.UndefOr[__string]
  }

  @js.native
  sealed trait Include extends js.Any
  object Include extends js.Object {
    val ALL  = "ALL".asInstanceOf[Include]
    val ANY  = "ANY".asInstanceOf[Include]
    val NONE = "NONE".asInstanceOf[Include]

    val values = js.Object.freeze(js.Array(ALL, ANY, NONE))
  }

  /**
    * Provides information about the results of a request to create or update an endpoint that's associated with an event.
    */
  @js.native
  @Factory
  trait ItemResponse extends js.Object {
    var EndpointItemResponse: js.UndefOr[EndpointItemResponse]
    var EventsItemResponse: js.UndefOr[MapOfEventItemResponse]
  }

  @js.native
  sealed trait JobStatus extends js.Any
  object JobStatus extends js.Object {
    val CREATED                      = "CREATED".asInstanceOf[JobStatus]
    val PREPARING_FOR_INITIALIZATION = "PREPARING_FOR_INITIALIZATION".asInstanceOf[JobStatus]
    val INITIALIZING                 = "INITIALIZING".asInstanceOf[JobStatus]
    val PROCESSING                   = "PROCESSING".asInstanceOf[JobStatus]
    val PENDING_JOB                  = "PENDING_JOB".asInstanceOf[JobStatus]
    val COMPLETING                   = "COMPLETING".asInstanceOf[JobStatus]
    val COMPLETED                    = "COMPLETED".asInstanceOf[JobStatus]
    val FAILING                      = "FAILING".asInstanceOf[JobStatus]
    val FAILED                       = "FAILED".asInstanceOf[JobStatus]

    val values = js.Object.freeze(
      js.Array(
        CREATED,
        PREPARING_FOR_INITIALIZATION,
        INITIALIZING,
        PROCESSING,
        PENDING_JOB,
        COMPLETING,
        COMPLETED,
        FAILING,
        FAILED
      )
    )
  }

  /**
    * Provides the results of a query that retrieved the data for a standard engagement metric that applies to a journey, and provides information about that query.
    */
  @js.native
  @Factory
  trait JourneyDateRangeKpiResponse extends js.Object {
    var ApplicationId: __string
    var EndTime: __timestampIso8601
    var JourneyId: __string
    var KpiName: __string
    var KpiResult: BaseKpiResult
    var StartTime: __timestampIso8601
    var NextToken: js.UndefOr[__string]
  }

  /**
    * Specifies the "From" address for an email message that's sent to participants in a journey.
    */
  @js.native
  @Factory
  trait JourneyEmailMessage extends js.Object {
    var FromAddress: js.UndefOr[__string]
  }

  /**
    * Provides the results of a query that retrieved the data for a standard execution metric that applies to a journey activity, and provides information about that query.
    */
  @js.native
  @Factory
  trait JourneyExecutionActivityMetricsResponse extends js.Object {
    var ActivityType: __string
    var ApplicationId: __string
    var JourneyActivityId: __string
    var JourneyId: __string
    var LastEvaluatedTime: __string
    var Metrics: MapOf__string
  }

  /**
    * Provides the results of a query that retrieved the data for a standard execution metric that applies to a journey, and provides information about that query.
    */
  @js.native
  @Factory
  trait JourneyExecutionMetricsResponse extends js.Object {
    var ApplicationId: __string
    var JourneyId: __string
    var LastEvaluatedTime: __string
    var Metrics: MapOf__string
  }

  /**
    * Specifies limits on the messages that a journey can send and the number of times participants can enter a journey.
    */
  @js.native
  @Factory
  trait JourneyLimits extends js.Object {
    var DailyCap: js.UndefOr[__integer]
    var EndpointReentryCap: js.UndefOr[__integer]
    var MessagesPerSecond: js.UndefOr[__integer]
  }

  /**
    * Provides information about the status, configuration, and other settings for a journey.
    */
  @js.native
  @Factory
  trait JourneyResponse extends js.Object {
    var ApplicationId: __string
    var Id: __string
    var Name: __string
    var Activities: js.UndefOr[MapOfActivity]
    var CreationDate: js.UndefOr[__string]
    var LastModifiedDate: js.UndefOr[__string]
    var Limits: js.UndefOr[JourneyLimits]
    var LocalTime: js.UndefOr[__boolean]
    var QuietTime: js.UndefOr[QuietTime]
    var RefreshFrequency: js.UndefOr[__string]
    var Schedule: js.UndefOr[JourneySchedule]
    var StartActivity: js.UndefOr[__string]
    var StartCondition: js.UndefOr[StartCondition]
    var State: js.UndefOr[State]
    var tags: js.UndefOr[MapOf__string]
  }

  /**
    * Specifies the schedule settings for a journey.
    */
  @js.native
  @Factory
  trait JourneySchedule extends js.Object {
    var EndTime: js.UndefOr[__timestampIso8601]
    var StartTime: js.UndefOr[__timestampIso8601]
    var Timezone: js.UndefOr[__string]
  }

  /**
    * Changes the status of a journey.
    */
  @js.native
  @Factory
  trait JourneyStateRequest extends js.Object {
    var State: js.UndefOr[State]
  }

  /**
    * Provides information about the status, configuration, and other settings for all the journeys that are associated with an application.
    */
  @js.native
  @Factory
  trait JourneysResponse extends js.Object {
    var Item: ListOfJourneyResponse
    var NextToken: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait ListJourneysRequest extends js.Object {
    var ApplicationId: __string
    var PageSize: js.UndefOr[__string]
    var Token: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait ListJourneysResponse extends js.Object {
    var JourneysResponse: JourneysResponse
  }

  @js.native
  @Factory
  trait ListTagsForResourceRequest extends js.Object {
    var ResourceArn: __string
  }

  @js.native
  @Factory
  trait ListTagsForResourceResponse extends js.Object {
    var TagsModel: TagsModel
  }

  @js.native
  @Factory
  trait ListTemplateVersionsRequest extends js.Object {
    var TemplateName: __string
    var TemplateType: __string
    var NextToken: js.UndefOr[__string]
    var PageSize: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait ListTemplateVersionsResponse extends js.Object {
    var TemplateVersionsResponse: TemplateVersionsResponse
  }

  @js.native
  @Factory
  trait ListTemplatesRequest extends js.Object {
    var NextToken: js.UndefOr[__string]
    var PageSize: js.UndefOr[__string]
    var Prefix: js.UndefOr[__string]
    var TemplateType: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait ListTemplatesResponse extends js.Object {
    var TemplatesResponse: TemplatesResponse
  }

  /**
    * Specifies the content and settings for a push notification that's sent to recipients of a campaign.
    */
  @js.native
  @Factory
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

  /**
    * Provides information about an API request or response.
    */
  @js.native
  @Factory
  trait MessageBody extends js.Object {
    var Message: js.UndefOr[__string]
    var RequestID: js.UndefOr[__string]
  }

  /**
    * Specifies the message configuration settings for a campaign.
    */
  @js.native
  @Factory
  trait MessageConfiguration extends js.Object {
    var ADMMessage: js.UndefOr[Message]
    var APNSMessage: js.UndefOr[Message]
    var BaiduMessage: js.UndefOr[Message]
    var DefaultMessage: js.UndefOr[Message]
    var EmailMessage: js.UndefOr[CampaignEmailMessage]
    var GCMMessage: js.UndefOr[Message]
    var SMSMessage: js.UndefOr[CampaignSmsMessage]
  }

  /**
    * Specifies the configuration and other settings for a message.
    */
  @js.native
  @Factory
  trait MessageRequest extends js.Object {
    var MessageConfiguration: DirectMessageConfiguration
    var Addresses: js.UndefOr[MapOfAddressConfiguration]
    var Context: js.UndefOr[MapOf__string]
    var Endpoints: js.UndefOr[MapOfEndpointSendConfiguration]
    var TemplateConfiguration: js.UndefOr[TemplateConfiguration]
    var TraceId: js.UndefOr[__string]
  }

  /**
    * Provides information about the results of a request to send a message to an endpoint address.
    */
  @js.native
  @Factory
  trait MessageResponse extends js.Object {
    var ApplicationId: __string
    var EndpointResult: js.UndefOr[MapOfEndpointMessageResult]
    var RequestId: js.UndefOr[__string]
    var Result: js.UndefOr[MapOfMessageResult]
  }

  /**
    * Provides information about the results of sending a message directly to an endpoint address.
    */
  @js.native
  @Factory
  trait MessageResult extends js.Object {
    var DeliveryStatus: DeliveryStatus
    var StatusCode: __integer
    var MessageId: js.UndefOr[__string]
    var StatusMessage: js.UndefOr[__string]
    var UpdatedToken: js.UndefOr[__string]
  }

  @js.native
  sealed trait MessageType extends js.Any
  object MessageType extends js.Object {
    val TRANSACTIONAL = "TRANSACTIONAL".asInstanceOf[MessageType]
    val PROMOTIONAL   = "PROMOTIONAL".asInstanceOf[MessageType]

    val values = js.Object.freeze(js.Array(TRANSACTIONAL, PROMOTIONAL))
  }

  /**
    * Specifies metric-based criteria for including or excluding endpoints from a segment. These criteria derive from custom metrics that you define for endpoints.
    */
  @js.native
  @Factory
  trait MetricDimension extends js.Object {
    var ComparisonOperator: __string
    var Value: __double
  }

  @js.native
  sealed trait Mode extends js.Any
  object Mode extends js.Object {
    val DELIVERY = "DELIVERY".asInstanceOf[Mode]
    val FILTER   = "FILTER".asInstanceOf[Mode]

    val values = js.Object.freeze(js.Array(DELIVERY, FILTER))
  }

  /**
    * Specifies a condition to evaluate for an activity path in a journey.
    */
  @js.native
  @Factory
  trait MultiConditionalBranch extends js.Object {
    var Condition: js.UndefOr[SimpleCondition]
    var NextActivity: js.UndefOr[__string]
  }

  /**
    * Specifies the settings for a multivariate split activity in a journey. This type of activity sends participants down one of as many as five paths (including a default <i>Else</i> path) in a journey, based on conditions that you specify.
    */
  @js.native
  @Factory
  trait MultiConditionalSplitActivity extends js.Object {
    var Branches: js.UndefOr[ListOfMultiConditionalBranch]
    var DefaultActivity: js.UndefOr[__string]
    var EvaluationWaitTime: js.UndefOr[WaitTime]
  }

  /**
    * Specifies a phone number to validate and retrieve information about.
    */
  @js.native
  @Factory
  trait NumberValidateRequest extends js.Object {
    var IsoCountryCode: js.UndefOr[__string]
    var PhoneNumber: js.UndefOr[__string]
  }

  /**
    * Provides information about a phone number.
    */
  @js.native
  @Factory
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

  @js.native
  sealed trait Operator extends js.Any
  object Operator extends js.Object {
    val ALL = "ALL".asInstanceOf[Operator]
    val ANY = "ANY".asInstanceOf[Operator]

    val values = js.Object.freeze(js.Array(ALL, ANY))
  }

  @js.native
  @Factory
  trait PhoneNumberValidateRequest extends js.Object {
    var NumberValidateRequest: NumberValidateRequest
  }

  @js.native
  @Factory
  trait PhoneNumberValidateResponse extends js.Object {
    var NumberValidateResponse: NumberValidateResponse
  }

  /**
    * Specifies the properties and attributes of an endpoint that's associated with an event.
    */
  @js.native
  @Factory
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

  /**
    * Specifies the content and settings for a message template that can be used in messages that are sent through a push notification channel.
    */
  @js.native
  @Factory
  trait PushNotificationTemplateRequest extends js.Object {
    var ADM: js.UndefOr[AndroidPushNotificationTemplate]
    var APNS: js.UndefOr[APNSPushNotificationTemplate]
    var Baidu: js.UndefOr[AndroidPushNotificationTemplate]
    var Default: js.UndefOr[DefaultPushNotificationTemplate]
    var DefaultSubstitutions: js.UndefOr[__string]
    var GCM: js.UndefOr[AndroidPushNotificationTemplate]
    var TemplateDescription: js.UndefOr[__string]
    var tags: js.UndefOr[MapOf__string]
  }

  /**
    * Provides information about the content and settings for a message template that can be used in messages that are sent through a push notification channel.
    */
  @js.native
  @Factory
  trait PushNotificationTemplateResponse extends js.Object {
    var CreationDate: __string
    var LastModifiedDate: __string
    var TemplateName: __string
    var TemplateType: TemplateType
    var ADM: js.UndefOr[AndroidPushNotificationTemplate]
    var APNS: js.UndefOr[APNSPushNotificationTemplate]
    var Arn: js.UndefOr[__string]
    var Baidu: js.UndefOr[AndroidPushNotificationTemplate]
    var Default: js.UndefOr[DefaultPushNotificationTemplate]
    var DefaultSubstitutions: js.UndefOr[__string]
    var GCM: js.UndefOr[AndroidPushNotificationTemplate]
    var TemplateDescription: js.UndefOr[__string]
    var Version: js.UndefOr[__string]
    var tags: js.UndefOr[MapOf__string]
  }

  @js.native
  @Factory
  trait PutEventStreamRequest extends js.Object {
    var ApplicationId: __string
    var WriteEventStream: WriteEventStream
  }

  @js.native
  @Factory
  trait PutEventStreamResponse extends js.Object {
    var EventStream: EventStream
  }

  @js.native
  @Factory
  trait PutEventsRequest extends js.Object {
    var ApplicationId: __string
    var EventsRequest: EventsRequest
  }

  @js.native
  @Factory
  trait PutEventsResponse extends js.Object {
    var EventsResponse: EventsResponse
  }

  /**
    * Specifies the start and end times that define a time range when messages aren't sent to endpoints.
    */
  @js.native
  @Factory
  trait QuietTime extends js.Object {
    var End: js.UndefOr[__string]
    var Start: js.UndefOr[__string]
  }

  /**
    * Specifies the settings for a random split activity in a journey. This type of activity randomly sends specified percentages of participants down one of as many as five paths in a journey, based on conditions that you specify.
    */
  @js.native
  @Factory
  trait RandomSplitActivity extends js.Object {
    var Branches: js.UndefOr[ListOfRandomSplitEntry]
  }

  /**
    * Specifies the settings for a path in a random split activity in a journey.
    */
  @js.native
  @Factory
  trait RandomSplitEntry extends js.Object {
    var NextActivity: js.UndefOr[__string]
    var Percentage: js.UndefOr[__integer]
  }

  /**
    * Specifies the contents of an email message, represented as a raw MIME message.
    */
  @js.native
  @Factory
  trait RawEmail extends js.Object {
    var Data: js.UndefOr[__blob]
  }

  /**
    * Specifies criteria for including or excluding endpoints from a segment based on how recently an endpoint was active.
    */
  @js.native
  @Factory
  trait RecencyDimension extends js.Object {
    var Duration: Duration
    var RecencyType: RecencyType
  }

  @js.native
  sealed trait RecencyType extends js.Any
  object RecencyType extends js.Object {
    val ACTIVE   = "ACTIVE".asInstanceOf[RecencyType]
    val INACTIVE = "INACTIVE".asInstanceOf[RecencyType]

    val values = js.Object.freeze(js.Array(ACTIVE, INACTIVE))
  }

  @js.native
  @Factory
  trait RemoveAttributesRequest extends js.Object {
    var ApplicationId: __string
    var AttributeType: __string
    var UpdateAttributesRequest: UpdateAttributesRequest
  }

  @js.native
  @Factory
  trait RemoveAttributesResponse extends js.Object {
    var AttributesResource: AttributesResource
  }

  /**
    * Provides the results of a query that retrieved the data for a standard metric that applies to an application, campaign, or journey.
    */
  @js.native
  @Factory
  trait ResultRow extends js.Object {
    var GroupedBys: ListOfResultRowValue
    var Values: ListOfResultRowValue
  }

  /**
    * Provides a single value and metadata about that value as part of an array of query results for a standard metric that applies to an application, campaign, or journey.
    */
  @js.native
  @Factory
  trait ResultRowValue extends js.Object {
    var Key: __string
    var Type: __string
    var Value: __string
  }

  /**
    * Specifies the status and settings of the SMS channel for an application.
    */
  @js.native
  @Factory
  trait SMSChannelRequest extends js.Object {
    var Enabled: js.UndefOr[__boolean]
    var SenderId: js.UndefOr[__string]
    var ShortCode: js.UndefOr[__string]
  }

  /**
    * Provides information about the status and settings of the SMS channel for an application.
    */
  @js.native
  @Factory
  trait SMSChannelResponse extends js.Object {
    var Platform: __string
    var ApplicationId: js.UndefOr[__string]
    var CreationDate: js.UndefOr[__string]
    var Enabled: js.UndefOr[__boolean]
    var HasCredential: js.UndefOr[__boolean]
    var Id: js.UndefOr[__string]
    var IsArchived: js.UndefOr[__boolean]
    var LastModifiedBy: js.UndefOr[__string]
    var LastModifiedDate: js.UndefOr[__string]
    var PromotionalMessagesPerSecond: js.UndefOr[__integer]
    var SenderId: js.UndefOr[__string]
    var ShortCode: js.UndefOr[__string]
    var TransactionalMessagesPerSecond: js.UndefOr[__integer]
    var Version: js.UndefOr[__integer]
  }

  /**
    * Specifies the default settings for a one-time SMS message that's sent directly to an endpoint.
    */
  @js.native
  @Factory
  trait SMSMessage extends js.Object {
    var Body: js.UndefOr[__string]
    var Keyword: js.UndefOr[__string]
    var MessageType: js.UndefOr[MessageType]
    var OriginationNumber: js.UndefOr[__string]
    var SenderId: js.UndefOr[__string]
    var Substitutions: js.UndefOr[MapOfListOf__string]
  }

  /**
    * Specifies the content and settings for a message template that can be used in text messages that are sent through the SMS channel.
    */
  @js.native
  @Factory
  trait SMSTemplateRequest extends js.Object {
    var Body: js.UndefOr[__string]
    var DefaultSubstitutions: js.UndefOr[__string]
    var TemplateDescription: js.UndefOr[__string]
    var tags: js.UndefOr[MapOf__string]
  }

  /**
    * Provides information about the content and settings for a message template that can be used in text messages that are sent through the SMS channel.
    */
  @js.native
  @Factory
  trait SMSTemplateResponse extends js.Object {
    var CreationDate: __string
    var LastModifiedDate: __string
    var TemplateName: __string
    var TemplateType: TemplateType
    var Arn: js.UndefOr[__string]
    var Body: js.UndefOr[__string]
    var DefaultSubstitutions: js.UndefOr[__string]
    var TemplateDescription: js.UndefOr[__string]
    var Version: js.UndefOr[__string]
    var tags: js.UndefOr[MapOf__string]
  }

  /**
    * Specifies the schedule settings for a campaign.
    */
  @js.native
  @Factory
  trait Schedule extends js.Object {
    var StartTime: __string
    var EndTime: js.UndefOr[__string]
    var EventFilter: js.UndefOr[CampaignEventFilter]
    var Frequency: js.UndefOr[Frequency]
    var IsLocalTime: js.UndefOr[__boolean]
    var QuietTime: js.UndefOr[QuietTime]
    var Timezone: js.UndefOr[__string]
  }

  /**
    * Specifies dimension settings for including or excluding endpoints from a segment based on how recently an endpoint was active.
    */
  @js.native
  @Factory
  trait SegmentBehaviors extends js.Object {
    var Recency: js.UndefOr[RecencyDimension]
  }

  /**
    * Specifies a segment to associate with an activity in a journey.
    */
  @js.native
  @Factory
  trait SegmentCondition extends js.Object {
    var SegmentId: __string
  }

  /**
    * Specifies demographic-based dimension settings for including or excluding endpoints from a segment. These settings derive from characteristics of endpoint devices, such as platform, make, and model.
    */
  @js.native
  @Factory
  trait SegmentDemographics extends js.Object {
    var AppVersion: js.UndefOr[SetDimension]
    var Channel: js.UndefOr[SetDimension]
    var DeviceType: js.UndefOr[SetDimension]
    var Make: js.UndefOr[SetDimension]
    var Model: js.UndefOr[SetDimension]
    var Platform: js.UndefOr[SetDimension]
  }

  /**
    * Specifies the dimension settings for a segment.
    */
  @js.native
  @Factory
  trait SegmentDimensions extends js.Object {
    var Attributes: js.UndefOr[MapOfAttributeDimension]
    var Behavior: js.UndefOr[SegmentBehaviors]
    var Demographic: js.UndefOr[SegmentDemographics]
    var Location: js.UndefOr[SegmentLocation]
    var Metrics: js.UndefOr[MapOfMetricDimension]
    var UserAttributes: js.UndefOr[MapOfAttributeDimension]
  }

  /**
    * Specifies the base segments and dimensions for a segment, and the relationships between these base segments and dimensions.
    */
  @js.native
  @Factory
  trait SegmentGroup extends js.Object {
    var Dimensions: js.UndefOr[ListOfSegmentDimensions]
    var SourceSegments: js.UndefOr[ListOfSegmentReference]
    var SourceType: js.UndefOr[SourceType]
    var Type: js.UndefOr[Type]
  }

  /**
    * Specifies the settings that define the relationships between segment groups for a segment.
    */
  @js.native
  @Factory
  trait SegmentGroupList extends js.Object {
    var Groups: js.UndefOr[ListOfSegmentGroup]
    var Include: js.UndefOr[Include]
  }

  /**
    * Provides information about the import job that created a segment. An import job is a job that creates a user segment by importing endpoint definitions.
    */
  @js.native
  @Factory
  trait SegmentImportResource extends js.Object {
    var ExternalId: __string
    var Format: Format
    var RoleArn: __string
    var S3Url: __string
    var Size: __integer
    var ChannelCounts: js.UndefOr[MapOf__integer]
  }

  /**
    * Specifies geographical dimension settings for a segment.
    */
  @js.native
  @Factory
  trait SegmentLocation extends js.Object {
    var Country: js.UndefOr[SetDimension]
    var GPSPoint: js.UndefOr[GPSPointDimension]
  }

  /**
    * Specifies the segment identifier and version of a segment.
    */
  @js.native
  @Factory
  trait SegmentReference extends js.Object {
    var Id: __string
    var Version: js.UndefOr[__integer]
  }

  /**
    * Provides information about the configuration, dimension, and other settings for a segment.
    */
  @js.native
  @Factory
  trait SegmentResponse extends js.Object {
    var ApplicationId: __string
    var Arn: __string
    var CreationDate: __string
    var Id: __string
    var SegmentType: SegmentType
    var Dimensions: js.UndefOr[SegmentDimensions]
    var ImportDefinition: js.UndefOr[SegmentImportResource]
    var LastModifiedDate: js.UndefOr[__string]
    var Name: js.UndefOr[__string]
    var SegmentGroups: js.UndefOr[SegmentGroupList]
    var Version: js.UndefOr[__integer]
    var tags: js.UndefOr[MapOf__string]
  }

  @js.native
  sealed trait SegmentType extends js.Any
  object SegmentType extends js.Object {
    val DIMENSIONAL = "DIMENSIONAL".asInstanceOf[SegmentType]
    val IMPORT      = "IMPORT".asInstanceOf[SegmentType]

    val values = js.Object.freeze(js.Array(DIMENSIONAL, IMPORT))
  }

  /**
    * Provides information about all the segments that are associated with an application.
    */
  @js.native
  @Factory
  trait SegmentsResponse extends js.Object {
    var Item: ListOfSegmentResponse
    var NextToken: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait SendMessagesRequest extends js.Object {
    var ApplicationId: __string
    var MessageRequest: MessageRequest
  }

  @js.native
  @Factory
  trait SendMessagesResponse extends js.Object {
    var MessageResponse: MessageResponse
  }

  /**
    * Specifies the configuration and other settings for a message to send to all the endpoints that are associated with a list of users.
    */
  @js.native
  @Factory
  trait SendUsersMessageRequest extends js.Object {
    var MessageConfiguration: DirectMessageConfiguration
    var Users: MapOfEndpointSendConfiguration
    var Context: js.UndefOr[MapOf__string]
    var TemplateConfiguration: js.UndefOr[TemplateConfiguration]
    var TraceId: js.UndefOr[__string]
  }

  /**
    * Provides information about which users and endpoints a message was sent to.
    */
  @js.native
  @Factory
  trait SendUsersMessageResponse extends js.Object {
    var ApplicationId: __string
    var RequestId: js.UndefOr[__string]
    var Result: js.UndefOr[MapOfMapOfEndpointMessageResult]
  }

  @js.native
  @Factory
  trait SendUsersMessagesRequest extends js.Object {
    var ApplicationId: __string
    var SendUsersMessageRequest: SendUsersMessageRequest
  }

  @js.native
  @Factory
  trait SendUsersMessagesResponse extends js.Object {
    var SendUsersMessageResponse: SendUsersMessageResponse
  }

  /**
    * Provides information about a session.
    */
  @js.native
  @Factory
  trait Session extends js.Object {
    var Id: __string
    var StartTimestamp: __string
    var Duration: js.UndefOr[__integer]
    var StopTimestamp: js.UndefOr[__string]
  }

  /**
    * Specifies the dimension type and values for a segment dimension.
    */
  @js.native
  @Factory
  trait SetDimension extends js.Object {
    var Values: ListOf__string
    var DimensionType: js.UndefOr[DimensionType]
  }

  /**
    * Specifies a condition to evaluate for an activity in a journey.
    */
  @js.native
  @Factory
  trait SimpleCondition extends js.Object {
    var EventCondition: js.UndefOr[EventCondition]
    var SegmentCondition: js.UndefOr[SegmentCondition]
    var SegmentDimensions: js.UndefOr[SegmentDimensions]
  }

  /**
    * Specifies the contents of an email message, composed of a subject, a text part, and an HTML part.
    */
  @js.native
  @Factory
  trait SimpleEmail extends js.Object {
    var HtmlPart: js.UndefOr[SimpleEmailPart]
    var Subject: js.UndefOr[SimpleEmailPart]
    var TextPart: js.UndefOr[SimpleEmailPart]
  }

  /**
    * Specifies the subject or body of an email message, represented as textual email data and the applicable character set.
    */
  @js.native
  @Factory
  trait SimpleEmailPart extends js.Object {
    var Charset: js.UndefOr[__string]
    var Data: js.UndefOr[__string]
  }

  @js.native
  sealed trait SourceType extends js.Any
  object SourceType extends js.Object {
    val ALL  = "ALL".asInstanceOf[SourceType]
    val ANY  = "ANY".asInstanceOf[SourceType]
    val NONE = "NONE".asInstanceOf[SourceType]

    val values = js.Object.freeze(js.Array(ALL, ANY, NONE))
  }

  /**
    * Specifies the conditions for the first activity in a journey. This activity and its conditions determine which users are participants in a journey.
    */
  @js.native
  @Factory
  trait StartCondition extends js.Object {
    var Description: js.UndefOr[__string]
    var SegmentStartCondition: js.UndefOr[SegmentCondition]
  }

  @js.native
  sealed trait State extends js.Any
  object State extends js.Object {
    val DRAFT     = "DRAFT".asInstanceOf[State]
    val ACTIVE    = "ACTIVE".asInstanceOf[State]
    val COMPLETED = "COMPLETED".asInstanceOf[State]
    val CANCELLED = "CANCELLED".asInstanceOf[State]
    val CLOSED    = "CLOSED".asInstanceOf[State]

    val values = js.Object.freeze(js.Array(DRAFT, ACTIVE, COMPLETED, CANCELLED, CLOSED))
  }

  @js.native
  @Factory
  trait TagResourceRequest extends js.Object {
    var ResourceArn: __string
    var TagsModel: TagsModel
  }

  /**
    * Specifies the tags (keys and values) for an application, campaign, journey, message template, or segment.
    */
  @js.native
  @Factory
  trait TagsModel extends js.Object {
    var tags: MapOf__string
  }

  /**
    * Specifies the name and version of the message template to use for the message.
    */
  @js.native
  @Factory
  trait Template extends js.Object {
    var Name: js.UndefOr[__string]
    var Version: js.UndefOr[__string]
  }

  /**
    * Specifies which version of a message template to use as the active version of the template.
    */
  @js.native
  @Factory
  trait TemplateActiveVersionRequest extends js.Object {
    var Version: js.UndefOr[__string]
  }

  /**
    * Specifies the message template to use for the message, for each type of channel.
    */
  @js.native
  @Factory
  trait TemplateConfiguration extends js.Object {
    var EmailTemplate: js.UndefOr[Template]
    var PushTemplate: js.UndefOr[Template]
    var SMSTemplate: js.UndefOr[Template]
    var VoiceTemplate: js.UndefOr[Template]
  }

  /**
    * Provides information about a message template that's associated with your Amazon Pinpoint account.
    */
  @js.native
  @Factory
  trait TemplateResponse extends js.Object {
    var CreationDate: __string
    var LastModifiedDate: __string
    var TemplateName: __string
    var TemplateType: TemplateType
    var Arn: js.UndefOr[__string]
    var DefaultSubstitutions: js.UndefOr[__string]
    var TemplateDescription: js.UndefOr[__string]
    var Version: js.UndefOr[__string]
    var tags: js.UndefOr[MapOf__string]
  }

  @js.native
  sealed trait TemplateType extends js.Any
  object TemplateType extends js.Object {
    val EMAIL = "EMAIL".asInstanceOf[TemplateType]
    val SMS   = "SMS".asInstanceOf[TemplateType]
    val VOICE = "VOICE".asInstanceOf[TemplateType]
    val PUSH  = "PUSH".asInstanceOf[TemplateType]

    val values = js.Object.freeze(js.Array(EMAIL, SMS, VOICE, PUSH))
  }

  /**
    * Provides information about a specific version of a message template.
    */
  @js.native
  @Factory
  trait TemplateVersionResponse extends js.Object {
    var CreationDate: __string
    var LastModifiedDate: __string
    var TemplateName: __string
    var TemplateType: __string
    var DefaultSubstitutions: js.UndefOr[__string]
    var TemplateDescription: js.UndefOr[__string]
    var Version: js.UndefOr[__string]
  }

  /**
    * Provides information about all the versions of a specific message template.
    */
  @js.native
  @Factory
  trait TemplateVersionsResponse extends js.Object {
    var Item: ListOfTemplateVersionResponse
    var Message: js.UndefOr[__string]
    var NextToken: js.UndefOr[__string]
    var RequestID: js.UndefOr[__string]
  }

  /**
    * Provides information about all the message templates that are associated with your Amazon Pinpoint account.
    */
  @js.native
  @Factory
  trait TemplatesResponse extends js.Object {
    var Item: ListOfTemplateResponse
    var NextToken: js.UndefOr[__string]
  }

  /**
    * Specifies the settings for a campaign treatment. A treatment is a variation of a campaign that's used for A/B testing of a campaign.
    */
  @js.native
  @Factory
  trait TreatmentResource extends js.Object {
    var Id: __string
    var SizePercent: __integer
    var MessageConfiguration: js.UndefOr[MessageConfiguration]
    var Schedule: js.UndefOr[Schedule]
    var State: js.UndefOr[CampaignState]
    var TemplateConfiguration: js.UndefOr[TemplateConfiguration]
    var TreatmentDescription: js.UndefOr[__string]
    var TreatmentName: js.UndefOr[__string]
  }

  @js.native
  sealed trait Type extends js.Any
  object Type extends js.Object {
    val ALL  = "ALL".asInstanceOf[Type]
    val ANY  = "ANY".asInstanceOf[Type]
    val NONE = "NONE".asInstanceOf[Type]

    val values = js.Object.freeze(js.Array(ALL, ANY, NONE))
  }

  @js.native
  @Factory
  trait UntagResourceRequest extends js.Object {
    var ResourceArn: __string
    var TagKeys: ListOf__string
  }

  @js.native
  @Factory
  trait UpdateAdmChannelRequest extends js.Object {
    var ADMChannelRequest: ADMChannelRequest
    var ApplicationId: __string
  }

  @js.native
  @Factory
  trait UpdateAdmChannelResponse extends js.Object {
    var ADMChannelResponse: ADMChannelResponse
  }

  @js.native
  @Factory
  trait UpdateApnsChannelRequest extends js.Object {
    var APNSChannelRequest: APNSChannelRequest
    var ApplicationId: __string
  }

  @js.native
  @Factory
  trait UpdateApnsChannelResponse extends js.Object {
    var APNSChannelResponse: APNSChannelResponse
  }

  @js.native
  @Factory
  trait UpdateApnsSandboxChannelRequest extends js.Object {
    var APNSSandboxChannelRequest: APNSSandboxChannelRequest
    var ApplicationId: __string
  }

  @js.native
  @Factory
  trait UpdateApnsSandboxChannelResponse extends js.Object {
    var APNSSandboxChannelResponse: APNSSandboxChannelResponse
  }

  @js.native
  @Factory
  trait UpdateApnsVoipChannelRequest extends js.Object {
    var APNSVoipChannelRequest: APNSVoipChannelRequest
    var ApplicationId: __string
  }

  @js.native
  @Factory
  trait UpdateApnsVoipChannelResponse extends js.Object {
    var APNSVoipChannelResponse: APNSVoipChannelResponse
  }

  @js.native
  @Factory
  trait UpdateApnsVoipSandboxChannelRequest extends js.Object {
    var APNSVoipSandboxChannelRequest: APNSVoipSandboxChannelRequest
    var ApplicationId: __string
  }

  @js.native
  @Factory
  trait UpdateApnsVoipSandboxChannelResponse extends js.Object {
    var APNSVoipSandboxChannelResponse: APNSVoipSandboxChannelResponse
  }

  @js.native
  @Factory
  trait UpdateApplicationSettingsRequest extends js.Object {
    var ApplicationId: __string
    var WriteApplicationSettingsRequest: WriteApplicationSettingsRequest
  }

  @js.native
  @Factory
  trait UpdateApplicationSettingsResponse extends js.Object {
    var ApplicationSettingsResource: ApplicationSettingsResource
  }

  /**
    * Specifies one or more attributes to remove from all the endpoints that are associated with an application.
    */
  @js.native
  @Factory
  trait UpdateAttributesRequest extends js.Object {
    var Blacklist: js.UndefOr[ListOf__string]
  }

  @js.native
  @Factory
  trait UpdateBaiduChannelRequest extends js.Object {
    var ApplicationId: __string
    var BaiduChannelRequest: BaiduChannelRequest
  }

  @js.native
  @Factory
  trait UpdateBaiduChannelResponse extends js.Object {
    var BaiduChannelResponse: BaiduChannelResponse
  }

  @js.native
  @Factory
  trait UpdateCampaignRequest extends js.Object {
    var ApplicationId: __string
    var CampaignId: __string
    var WriteCampaignRequest: WriteCampaignRequest
  }

  @js.native
  @Factory
  trait UpdateCampaignResponse extends js.Object {
    var CampaignResponse: CampaignResponse
  }

  @js.native
  @Factory
  trait UpdateEmailChannelRequest extends js.Object {
    var ApplicationId: __string
    var EmailChannelRequest: EmailChannelRequest
  }

  @js.native
  @Factory
  trait UpdateEmailChannelResponse extends js.Object {
    var EmailChannelResponse: EmailChannelResponse
  }

  @js.native
  @Factory
  trait UpdateEmailTemplateRequest extends js.Object {
    var EmailTemplateRequest: EmailTemplateRequest
    var TemplateName: __string
    var CreateNewVersion: js.UndefOr[__boolean]
    var Version: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait UpdateEmailTemplateResponse extends js.Object {
    var MessageBody: MessageBody
  }

  @js.native
  @Factory
  trait UpdateEndpointRequest extends js.Object {
    var ApplicationId: __string
    var EndpointId: __string
    var EndpointRequest: EndpointRequest
  }

  @js.native
  @Factory
  trait UpdateEndpointResponse extends js.Object {
    var MessageBody: MessageBody
  }

  @js.native
  @Factory
  trait UpdateEndpointsBatchRequest extends js.Object {
    var ApplicationId: __string
    var EndpointBatchRequest: EndpointBatchRequest
  }

  @js.native
  @Factory
  trait UpdateEndpointsBatchResponse extends js.Object {
    var MessageBody: MessageBody
  }

  @js.native
  @Factory
  trait UpdateGcmChannelRequest extends js.Object {
    var ApplicationId: __string
    var GCMChannelRequest: GCMChannelRequest
  }

  @js.native
  @Factory
  trait UpdateGcmChannelResponse extends js.Object {
    var GCMChannelResponse: GCMChannelResponse
  }

  @js.native
  @Factory
  trait UpdateJourneyRequest extends js.Object {
    var ApplicationId: __string
    var JourneyId: __string
    var WriteJourneyRequest: WriteJourneyRequest
  }

  @js.native
  @Factory
  trait UpdateJourneyResponse extends js.Object {
    var JourneyResponse: JourneyResponse
  }

  @js.native
  @Factory
  trait UpdateJourneyStateRequest extends js.Object {
    var ApplicationId: __string
    var JourneyId: __string
    var JourneyStateRequest: JourneyStateRequest
  }

  @js.native
  @Factory
  trait UpdateJourneyStateResponse extends js.Object {
    var JourneyResponse: JourneyResponse
  }

  @js.native
  @Factory
  trait UpdatePushTemplateRequest extends js.Object {
    var PushNotificationTemplateRequest: PushNotificationTemplateRequest
    var TemplateName: __string
    var CreateNewVersion: js.UndefOr[__boolean]
    var Version: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait UpdatePushTemplateResponse extends js.Object {
    var MessageBody: MessageBody
  }

  @js.native
  @Factory
  trait UpdateSegmentRequest extends js.Object {
    var ApplicationId: __string
    var SegmentId: __string
    var WriteSegmentRequest: WriteSegmentRequest
  }

  @js.native
  @Factory
  trait UpdateSegmentResponse extends js.Object {
    var SegmentResponse: SegmentResponse
  }

  @js.native
  @Factory
  trait UpdateSmsChannelRequest extends js.Object {
    var ApplicationId: __string
    var SMSChannelRequest: SMSChannelRequest
  }

  @js.native
  @Factory
  trait UpdateSmsChannelResponse extends js.Object {
    var SMSChannelResponse: SMSChannelResponse
  }

  @js.native
  @Factory
  trait UpdateSmsTemplateRequest extends js.Object {
    var SMSTemplateRequest: SMSTemplateRequest
    var TemplateName: __string
    var CreateNewVersion: js.UndefOr[__boolean]
    var Version: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait UpdateSmsTemplateResponse extends js.Object {
    var MessageBody: MessageBody
  }

  @js.native
  @Factory
  trait UpdateTemplateActiveVersionRequest extends js.Object {
    var TemplateActiveVersionRequest: TemplateActiveVersionRequest
    var TemplateName: __string
    var TemplateType: __string
  }

  @js.native
  @Factory
  trait UpdateTemplateActiveVersionResponse extends js.Object {
    var MessageBody: MessageBody
  }

  @js.native
  @Factory
  trait UpdateVoiceChannelRequest extends js.Object {
    var ApplicationId: __string
    var VoiceChannelRequest: VoiceChannelRequest
  }

  @js.native
  @Factory
  trait UpdateVoiceChannelResponse extends js.Object {
    var VoiceChannelResponse: VoiceChannelResponse
  }

  @js.native
  @Factory
  trait UpdateVoiceTemplateRequest extends js.Object {
    var TemplateName: __string
    var VoiceTemplateRequest: VoiceTemplateRequest
    var CreateNewVersion: js.UndefOr[__boolean]
    var Version: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait UpdateVoiceTemplateResponse extends js.Object {
    var MessageBody: MessageBody
  }

  /**
    * Specifies the status and settings of the voice channel for an application.
    */
  @js.native
  @Factory
  trait VoiceChannelRequest extends js.Object {
    var Enabled: js.UndefOr[__boolean]
  }

  /**
    * Provides information about the status and settings of the voice channel for an application.
    */
  @js.native
  @Factory
  trait VoiceChannelResponse extends js.Object {
    var Platform: __string
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

  /**
    * Specifies the settings for a one-time voice message that's sent directly to an endpoint through the voice channel.
    */
  @js.native
  @Factory
  trait VoiceMessage extends js.Object {
    var Body: js.UndefOr[__string]
    var LanguageCode: js.UndefOr[__string]
    var OriginationNumber: js.UndefOr[__string]
    var Substitutions: js.UndefOr[MapOfListOf__string]
    var VoiceId: js.UndefOr[__string]
  }

  /**
    * Specifies the content and settings for a message template that can be used in messages that are sent through the voice channel.
    */
  @js.native
  @Factory
  trait VoiceTemplateRequest extends js.Object {
    var Body: js.UndefOr[__string]
    var DefaultSubstitutions: js.UndefOr[__string]
    var LanguageCode: js.UndefOr[__string]
    var TemplateDescription: js.UndefOr[__string]
    var VoiceId: js.UndefOr[__string]
    var tags: js.UndefOr[MapOf__string]
  }

  /**
    * Provides information about the content and settings for a message template that can be used in messages that are sent through the voice channel.
    */
  @js.native
  @Factory
  trait VoiceTemplateResponse extends js.Object {
    var CreationDate: __string
    var LastModifiedDate: __string
    var TemplateName: __string
    var TemplateType: TemplateType
    var Arn: js.UndefOr[__string]
    var Body: js.UndefOr[__string]
    var DefaultSubstitutions: js.UndefOr[__string]
    var LanguageCode: js.UndefOr[__string]
    var TemplateDescription: js.UndefOr[__string]
    var Version: js.UndefOr[__string]
    var VoiceId: js.UndefOr[__string]
    var tags: js.UndefOr[MapOf__string]
  }

  /**
    * Specifies the settings for a wait activity in a journey. This type of activity waits for a certain amount of time or until a specific date and time before moving participants to the next activity in a journey.
    */
  @js.native
  @Factory
  trait WaitActivity extends js.Object {
    var NextActivity: js.UndefOr[__string]
    var WaitTime: js.UndefOr[WaitTime]
  }

  /**
    * Specifies a duration or a date and time that indicates when Amazon Pinpoint determines whether an activity's conditions have been met or an activity moves participants to the next activity in a journey.
    */
  @js.native
  @Factory
  trait WaitTime extends js.Object {
    var WaitFor: js.UndefOr[__string]
    var WaitUntil: js.UndefOr[__string]
  }

  /**
    * Specifies the default settings for an application.
    */
  @js.native
  @Factory
  trait WriteApplicationSettingsRequest extends js.Object {
    var CampaignHook: js.UndefOr[CampaignHook]
    var CloudWatchMetricsEnabled: js.UndefOr[__boolean]
    var Limits: js.UndefOr[CampaignLimits]
    var QuietTime: js.UndefOr[QuietTime]
  }

  /**
    * Specifies the configuration and other settings for a campaign.
    */
  @js.native
  @Factory
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
    var TemplateConfiguration: js.UndefOr[TemplateConfiguration]
    var TreatmentDescription: js.UndefOr[__string]
    var TreatmentName: js.UndefOr[__string]
    var tags: js.UndefOr[MapOf__string]
  }

  /**
    * Specifies the Amazon Resource Name (ARN) of an event stream to publish events to and the AWS Identity and Access Management (IAM) role to use when publishing those events.
    */
  @js.native
  @Factory
  trait WriteEventStream extends js.Object {
    var DestinationStreamArn: __string
    var RoleArn: __string
  }

  /**
    * Specifies the configuration and other settings for a journey.
    */
  @js.native
  @Factory
  trait WriteJourneyRequest extends js.Object {
    var Name: __string
    var Activities: js.UndefOr[MapOfActivity]
    var CreationDate: js.UndefOr[__string]
    var LastModifiedDate: js.UndefOr[__string]
    var Limits: js.UndefOr[JourneyLimits]
    var LocalTime: js.UndefOr[__boolean]
    var QuietTime: js.UndefOr[QuietTime]
    var RefreshFrequency: js.UndefOr[__string]
    var Schedule: js.UndefOr[JourneySchedule]
    var StartActivity: js.UndefOr[__string]
    var StartCondition: js.UndefOr[StartCondition]
    var State: js.UndefOr[State]
  }

  /**
    * Specifies the configuration, dimension, and other settings for a segment. A WriteSegmentRequest object can include a Dimensions object or a SegmentGroups object, but not both.
    */
  @js.native
  @Factory
  trait WriteSegmentRequest extends js.Object {
    var Dimensions: js.UndefOr[SegmentDimensions]
    var Name: js.UndefOr[__string]
    var SegmentGroups: js.UndefOr[SegmentGroupList]
    var tags: js.UndefOr[MapOf__string]
  }

  /**
    * Specifies the settings for a campaign treatment. A treatment is a variation of a campaign that's used for A/B testing of a campaign.
    */
  @js.native
  @Factory
  trait WriteTreatmentResource extends js.Object {
    var SizePercent: __integer
    var MessageConfiguration: js.UndefOr[MessageConfiguration]
    var Schedule: js.UndefOr[Schedule]
    var TemplateConfiguration: js.UndefOr[TemplateConfiguration]
    var TreatmentDescription: js.UndefOr[__string]
    var TreatmentName: js.UndefOr[__string]
  }
}
