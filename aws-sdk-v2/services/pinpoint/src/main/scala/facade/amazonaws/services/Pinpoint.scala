package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import scala.language.implicitConversions
import facade.amazonaws._

package object pinpoint {
  type ListOfActivityResponse = js.Array[ActivityResponse]
  type ListOfApplicationResponse = js.Array[ApplicationResponse]
  type ListOfCampaignResponse = js.Array[CampaignResponse]
  type ListOfClosedDaysRules = js.Array[ClosedDaysRule]
  type ListOfEndpointBatchItem = js.Array[EndpointBatchItem]
  type ListOfEndpointResponse = js.Array[EndpointResponse]
  type ListOfExportJobResponse = js.Array[ExportJobResponse]
  type ListOfImportJobResponse = js.Array[ImportJobResponse]
  type ListOfInAppMessageCampaign = js.Array[InAppMessageCampaign]
  type ListOfInAppMessageContent = js.Array[InAppMessageContent]
  type ListOfJourneyResponse = js.Array[JourneyResponse]
  type ListOfMultiConditionalBranch = js.Array[MultiConditionalBranch]
  type ListOfOpenHoursRules = js.Array[OpenHoursRule]
  type ListOfRandomSplitEntry = js.Array[RandomSplitEntry]
  type ListOfRecommenderConfigurationResponse = js.Array[RecommenderConfigurationResponse]
  type ListOfResultRow = js.Array[ResultRow]
  type ListOfResultRowValue = js.Array[ResultRowValue]
  type ListOfSegmentDimensions = js.Array[SegmentDimensions]
  type ListOfSegmentGroup = js.Array[SegmentGroup]
  type ListOfSegmentReference = js.Array[SegmentReference]
  type ListOfSegmentResponse = js.Array[SegmentResponse]
  type ListOfSimpleCondition = js.Array[SimpleCondition]
  type ListOfTemplateResponse = js.Array[TemplateResponse]
  type ListOfTemplateVersionResponse = js.Array[TemplateVersionResponse]
  type ListOfTreatmentResource = js.Array[TreatmentResource]
  type ListOfWriteTreatmentResource = js.Array[WriteTreatmentResource]
  type ListOf__EndpointTypesElement = js.Array[__EndpointTypesElement]
  type ListOf__string = js.Array[__string]
  type MapOfActivity = js.Dictionary[Activity]
  type MapOfAddressConfiguration = js.Dictionary[AddressConfiguration]
  type MapOfAttributeDimension = js.Dictionary[AttributeDimension]
  type MapOfChannelResponse = js.Dictionary[ChannelResponse]
  type MapOfEndpointMessageResult = js.Dictionary[EndpointMessageResult]
  type MapOfEndpointSendConfiguration = js.Dictionary[EndpointSendConfiguration]
  type MapOfEvent = js.Dictionary[Event]
  type MapOfEventItemResponse = js.Dictionary[EventItemResponse]
  type MapOfEventsBatch = js.Dictionary[EventsBatch]
  type MapOfItemResponse = js.Dictionary[ItemResponse]
  type MapOfListOfOpenHoursRules = js.Dictionary[ListOfOpenHoursRules]
  type MapOfListOf__string = js.Dictionary[ListOf__string]
  type MapOfMapOfEndpointMessageResult = js.Dictionary[MapOfEndpointMessageResult]
  type MapOfMessageResult = js.Dictionary[MessageResult]
  type MapOfMetricDimension = js.Dictionary[MetricDimension]
  type MapOf__double = js.Dictionary[__double]
  type MapOf__integer = js.Dictionary[__integer]
  type MapOf__string = js.Dictionary[__string]
  type __blob = js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type __boolean = Boolean
  type __double = Double
  type __integer = Int
  type __string = String
  type __timestampIso8601 = js.Date

  final class PinpointOps(private val service: Pinpoint) extends AnyVal {

    @inline def createAppFuture(params: CreateAppRequest): Future[CreateAppResponse] = service.createApp(params).promise().toFuture
    @inline def createCampaignFuture(params: CreateCampaignRequest): Future[CreateCampaignResponse] = service.createCampaign(params).promise().toFuture
    @inline def createEmailTemplateFuture(params: CreateEmailTemplateRequest): Future[CreateEmailTemplateResponse] = service.createEmailTemplate(params).promise().toFuture
    @inline def createExportJobFuture(params: CreateExportJobRequest): Future[CreateExportJobResponse] = service.createExportJob(params).promise().toFuture
    @inline def createImportJobFuture(params: CreateImportJobRequest): Future[CreateImportJobResponse] = service.createImportJob(params).promise().toFuture
    @inline def createInAppTemplateFuture(params: CreateInAppTemplateRequest): Future[CreateInAppTemplateResponse] = service.createInAppTemplate(params).promise().toFuture
    @inline def createJourneyFuture(params: CreateJourneyRequest): Future[CreateJourneyResponse] = service.createJourney(params).promise().toFuture
    @inline def createPushTemplateFuture(params: CreatePushTemplateRequest): Future[CreatePushTemplateResponse] = service.createPushTemplate(params).promise().toFuture
    @inline def createRecommenderConfigurationFuture(params: CreateRecommenderConfigurationRequest): Future[CreateRecommenderConfigurationResponse] = service.createRecommenderConfiguration(params).promise().toFuture
    @inline def createSegmentFuture(params: CreateSegmentRequest): Future[CreateSegmentResponse] = service.createSegment(params).promise().toFuture
    @inline def createSmsTemplateFuture(params: CreateSmsTemplateRequest): Future[CreateSmsTemplateResponse] = service.createSmsTemplate(params).promise().toFuture
    @inline def createVoiceTemplateFuture(params: CreateVoiceTemplateRequest): Future[CreateVoiceTemplateResponse] = service.createVoiceTemplate(params).promise().toFuture
    @inline def deleteAdmChannelFuture(params: DeleteAdmChannelRequest): Future[DeleteAdmChannelResponse] = service.deleteAdmChannel(params).promise().toFuture
    @inline def deleteApnsChannelFuture(params: DeleteApnsChannelRequest): Future[DeleteApnsChannelResponse] = service.deleteApnsChannel(params).promise().toFuture
    @inline def deleteApnsSandboxChannelFuture(params: DeleteApnsSandboxChannelRequest): Future[DeleteApnsSandboxChannelResponse] = service.deleteApnsSandboxChannel(params).promise().toFuture
    @inline def deleteApnsVoipChannelFuture(params: DeleteApnsVoipChannelRequest): Future[DeleteApnsVoipChannelResponse] = service.deleteApnsVoipChannel(params).promise().toFuture
    @inline def deleteApnsVoipSandboxChannelFuture(params: DeleteApnsVoipSandboxChannelRequest): Future[DeleteApnsVoipSandboxChannelResponse] = service.deleteApnsVoipSandboxChannel(params).promise().toFuture
    @inline def deleteAppFuture(params: DeleteAppRequest): Future[DeleteAppResponse] = service.deleteApp(params).promise().toFuture
    @inline def deleteBaiduChannelFuture(params: DeleteBaiduChannelRequest): Future[DeleteBaiduChannelResponse] = service.deleteBaiduChannel(params).promise().toFuture
    @inline def deleteCampaignFuture(params: DeleteCampaignRequest): Future[DeleteCampaignResponse] = service.deleteCampaign(params).promise().toFuture
    @inline def deleteEmailChannelFuture(params: DeleteEmailChannelRequest): Future[DeleteEmailChannelResponse] = service.deleteEmailChannel(params).promise().toFuture
    @inline def deleteEmailTemplateFuture(params: DeleteEmailTemplateRequest): Future[DeleteEmailTemplateResponse] = service.deleteEmailTemplate(params).promise().toFuture
    @inline def deleteEndpointFuture(params: DeleteEndpointRequest): Future[DeleteEndpointResponse] = service.deleteEndpoint(params).promise().toFuture
    @inline def deleteEventStreamFuture(params: DeleteEventStreamRequest): Future[DeleteEventStreamResponse] = service.deleteEventStream(params).promise().toFuture
    @inline def deleteGcmChannelFuture(params: DeleteGcmChannelRequest): Future[DeleteGcmChannelResponse] = service.deleteGcmChannel(params).promise().toFuture
    @inline def deleteInAppTemplateFuture(params: DeleteInAppTemplateRequest): Future[DeleteInAppTemplateResponse] = service.deleteInAppTemplate(params).promise().toFuture
    @inline def deleteJourneyFuture(params: DeleteJourneyRequest): Future[DeleteJourneyResponse] = service.deleteJourney(params).promise().toFuture
    @inline def deletePushTemplateFuture(params: DeletePushTemplateRequest): Future[DeletePushTemplateResponse] = service.deletePushTemplate(params).promise().toFuture
    @inline def deleteRecommenderConfigurationFuture(params: DeleteRecommenderConfigurationRequest): Future[DeleteRecommenderConfigurationResponse] = service.deleteRecommenderConfiguration(params).promise().toFuture
    @inline def deleteSegmentFuture(params: DeleteSegmentRequest): Future[DeleteSegmentResponse] = service.deleteSegment(params).promise().toFuture
    @inline def deleteSmsChannelFuture(params: DeleteSmsChannelRequest): Future[DeleteSmsChannelResponse] = service.deleteSmsChannel(params).promise().toFuture
    @inline def deleteSmsTemplateFuture(params: DeleteSmsTemplateRequest): Future[DeleteSmsTemplateResponse] = service.deleteSmsTemplate(params).promise().toFuture
    @inline def deleteUserEndpointsFuture(params: DeleteUserEndpointsRequest): Future[DeleteUserEndpointsResponse] = service.deleteUserEndpoints(params).promise().toFuture
    @inline def deleteVoiceChannelFuture(params: DeleteVoiceChannelRequest): Future[DeleteVoiceChannelResponse] = service.deleteVoiceChannel(params).promise().toFuture
    @inline def deleteVoiceTemplateFuture(params: DeleteVoiceTemplateRequest): Future[DeleteVoiceTemplateResponse] = service.deleteVoiceTemplate(params).promise().toFuture
    @inline def getAdmChannelFuture(params: GetAdmChannelRequest): Future[GetAdmChannelResponse] = service.getAdmChannel(params).promise().toFuture
    @inline def getApnsChannelFuture(params: GetApnsChannelRequest): Future[GetApnsChannelResponse] = service.getApnsChannel(params).promise().toFuture
    @inline def getApnsSandboxChannelFuture(params: GetApnsSandboxChannelRequest): Future[GetApnsSandboxChannelResponse] = service.getApnsSandboxChannel(params).promise().toFuture
    @inline def getApnsVoipChannelFuture(params: GetApnsVoipChannelRequest): Future[GetApnsVoipChannelResponse] = service.getApnsVoipChannel(params).promise().toFuture
    @inline def getApnsVoipSandboxChannelFuture(params: GetApnsVoipSandboxChannelRequest): Future[GetApnsVoipSandboxChannelResponse] = service.getApnsVoipSandboxChannel(params).promise().toFuture
    @inline def getAppFuture(params: GetAppRequest): Future[GetAppResponse] = service.getApp(params).promise().toFuture
    @inline def getApplicationDateRangeKpiFuture(params: GetApplicationDateRangeKpiRequest): Future[GetApplicationDateRangeKpiResponse] = service.getApplicationDateRangeKpi(params).promise().toFuture
    @inline def getApplicationSettingsFuture(params: GetApplicationSettingsRequest): Future[GetApplicationSettingsResponse] = service.getApplicationSettings(params).promise().toFuture
    @inline def getAppsFuture(params: GetAppsRequest): Future[GetAppsResponse] = service.getApps(params).promise().toFuture
    @inline def getBaiduChannelFuture(params: GetBaiduChannelRequest): Future[GetBaiduChannelResponse] = service.getBaiduChannel(params).promise().toFuture
    @inline def getCampaignActivitiesFuture(params: GetCampaignActivitiesRequest): Future[GetCampaignActivitiesResponse] = service.getCampaignActivities(params).promise().toFuture
    @inline def getCampaignDateRangeKpiFuture(params: GetCampaignDateRangeKpiRequest): Future[GetCampaignDateRangeKpiResponse] = service.getCampaignDateRangeKpi(params).promise().toFuture
    @inline def getCampaignFuture(params: GetCampaignRequest): Future[GetCampaignResponse] = service.getCampaign(params).promise().toFuture
    @inline def getCampaignVersionFuture(params: GetCampaignVersionRequest): Future[GetCampaignVersionResponse] = service.getCampaignVersion(params).promise().toFuture
    @inline def getCampaignVersionsFuture(params: GetCampaignVersionsRequest): Future[GetCampaignVersionsResponse] = service.getCampaignVersions(params).promise().toFuture
    @inline def getCampaignsFuture(params: GetCampaignsRequest): Future[GetCampaignsResponse] = service.getCampaigns(params).promise().toFuture
    @inline def getChannelsFuture(params: GetChannelsRequest): Future[GetChannelsResponse] = service.getChannels(params).promise().toFuture
    @inline def getEmailChannelFuture(params: GetEmailChannelRequest): Future[GetEmailChannelResponse] = service.getEmailChannel(params).promise().toFuture
    @inline def getEmailTemplateFuture(params: GetEmailTemplateRequest): Future[GetEmailTemplateResponse] = service.getEmailTemplate(params).promise().toFuture
    @inline def getEndpointFuture(params: GetEndpointRequest): Future[GetEndpointResponse] = service.getEndpoint(params).promise().toFuture
    @inline def getEventStreamFuture(params: GetEventStreamRequest): Future[GetEventStreamResponse] = service.getEventStream(params).promise().toFuture
    @inline def getExportJobFuture(params: GetExportJobRequest): Future[GetExportJobResponse] = service.getExportJob(params).promise().toFuture
    @inline def getExportJobsFuture(params: GetExportJobsRequest): Future[GetExportJobsResponse] = service.getExportJobs(params).promise().toFuture
    @inline def getGcmChannelFuture(params: GetGcmChannelRequest): Future[GetGcmChannelResponse] = service.getGcmChannel(params).promise().toFuture
    @inline def getImportJobFuture(params: GetImportJobRequest): Future[GetImportJobResponse] = service.getImportJob(params).promise().toFuture
    @inline def getImportJobsFuture(params: GetImportJobsRequest): Future[GetImportJobsResponse] = service.getImportJobs(params).promise().toFuture
    @inline def getInAppMessagesFuture(params: GetInAppMessagesRequest): Future[GetInAppMessagesResponse] = service.getInAppMessages(params).promise().toFuture
    @inline def getInAppTemplateFuture(params: GetInAppTemplateRequest): Future[GetInAppTemplateResponse] = service.getInAppTemplate(params).promise().toFuture
    @inline def getJourneyDateRangeKpiFuture(params: GetJourneyDateRangeKpiRequest): Future[GetJourneyDateRangeKpiResponse] = service.getJourneyDateRangeKpi(params).promise().toFuture
    @inline def getJourneyExecutionActivityMetricsFuture(params: GetJourneyExecutionActivityMetricsRequest): Future[GetJourneyExecutionActivityMetricsResponse] = service.getJourneyExecutionActivityMetrics(params).promise().toFuture
    @inline def getJourneyExecutionMetricsFuture(params: GetJourneyExecutionMetricsRequest): Future[GetJourneyExecutionMetricsResponse] = service.getJourneyExecutionMetrics(params).promise().toFuture
    @inline def getJourneyFuture(params: GetJourneyRequest): Future[GetJourneyResponse] = service.getJourney(params).promise().toFuture
    @inline def getPushTemplateFuture(params: GetPushTemplateRequest): Future[GetPushTemplateResponse] = service.getPushTemplate(params).promise().toFuture
    @inline def getRecommenderConfigurationFuture(params: GetRecommenderConfigurationRequest): Future[GetRecommenderConfigurationResponse] = service.getRecommenderConfiguration(params).promise().toFuture
    @inline def getRecommenderConfigurationsFuture(params: GetRecommenderConfigurationsRequest): Future[GetRecommenderConfigurationsResponse] = service.getRecommenderConfigurations(params).promise().toFuture
    @inline def getSegmentExportJobsFuture(params: GetSegmentExportJobsRequest): Future[GetSegmentExportJobsResponse] = service.getSegmentExportJobs(params).promise().toFuture
    @inline def getSegmentFuture(params: GetSegmentRequest): Future[GetSegmentResponse] = service.getSegment(params).promise().toFuture
    @inline def getSegmentImportJobsFuture(params: GetSegmentImportJobsRequest): Future[GetSegmentImportJobsResponse] = service.getSegmentImportJobs(params).promise().toFuture
    @inline def getSegmentVersionFuture(params: GetSegmentVersionRequest): Future[GetSegmentVersionResponse] = service.getSegmentVersion(params).promise().toFuture
    @inline def getSegmentVersionsFuture(params: GetSegmentVersionsRequest): Future[GetSegmentVersionsResponse] = service.getSegmentVersions(params).promise().toFuture
    @inline def getSegmentsFuture(params: GetSegmentsRequest): Future[GetSegmentsResponse] = service.getSegments(params).promise().toFuture
    @inline def getSmsChannelFuture(params: GetSmsChannelRequest): Future[GetSmsChannelResponse] = service.getSmsChannel(params).promise().toFuture
    @inline def getSmsTemplateFuture(params: GetSmsTemplateRequest): Future[GetSmsTemplateResponse] = service.getSmsTemplate(params).promise().toFuture
    @inline def getUserEndpointsFuture(params: GetUserEndpointsRequest): Future[GetUserEndpointsResponse] = service.getUserEndpoints(params).promise().toFuture
    @inline def getVoiceChannelFuture(params: GetVoiceChannelRequest): Future[GetVoiceChannelResponse] = service.getVoiceChannel(params).promise().toFuture
    @inline def getVoiceTemplateFuture(params: GetVoiceTemplateRequest): Future[GetVoiceTemplateResponse] = service.getVoiceTemplate(params).promise().toFuture
    @inline def listJourneysFuture(params: ListJourneysRequest): Future[ListJourneysResponse] = service.listJourneys(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] = service.listTagsForResource(params).promise().toFuture
    @inline def listTemplateVersionsFuture(params: ListTemplateVersionsRequest): Future[ListTemplateVersionsResponse] = service.listTemplateVersions(params).promise().toFuture
    @inline def listTemplatesFuture(params: ListTemplatesRequest): Future[ListTemplatesResponse] = service.listTemplates(params).promise().toFuture
    @inline def phoneNumberValidateFuture(params: PhoneNumberValidateRequest): Future[PhoneNumberValidateResponse] = service.phoneNumberValidate(params).promise().toFuture
    @inline def putEventStreamFuture(params: PutEventStreamRequest): Future[PutEventStreamResponse] = service.putEventStream(params).promise().toFuture
    @inline def putEventsFuture(params: PutEventsRequest): Future[PutEventsResponse] = service.putEvents(params).promise().toFuture
    @inline def removeAttributesFuture(params: RemoveAttributesRequest): Future[RemoveAttributesResponse] = service.removeAttributes(params).promise().toFuture
    @inline def sendMessagesFuture(params: SendMessagesRequest): Future[SendMessagesResponse] = service.sendMessages(params).promise().toFuture
    @inline def sendOTPMessageFuture(params: SendOTPMessageRequest): Future[SendOTPMessageResponse] = service.sendOTPMessage(params).promise().toFuture
    @inline def sendUsersMessagesFuture(params: SendUsersMessagesRequest): Future[SendUsersMessagesResponse] = service.sendUsersMessages(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[js.Object] = service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[js.Object] = service.untagResource(params).promise().toFuture
    @inline def updateAdmChannelFuture(params: UpdateAdmChannelRequest): Future[UpdateAdmChannelResponse] = service.updateAdmChannel(params).promise().toFuture
    @inline def updateApnsChannelFuture(params: UpdateApnsChannelRequest): Future[UpdateApnsChannelResponse] = service.updateApnsChannel(params).promise().toFuture
    @inline def updateApnsSandboxChannelFuture(params: UpdateApnsSandboxChannelRequest): Future[UpdateApnsSandboxChannelResponse] = service.updateApnsSandboxChannel(params).promise().toFuture
    @inline def updateApnsVoipChannelFuture(params: UpdateApnsVoipChannelRequest): Future[UpdateApnsVoipChannelResponse] = service.updateApnsVoipChannel(params).promise().toFuture
    @inline def updateApnsVoipSandboxChannelFuture(params: UpdateApnsVoipSandboxChannelRequest): Future[UpdateApnsVoipSandboxChannelResponse] = service.updateApnsVoipSandboxChannel(params).promise().toFuture
    @inline def updateApplicationSettingsFuture(params: UpdateApplicationSettingsRequest): Future[UpdateApplicationSettingsResponse] = service.updateApplicationSettings(params).promise().toFuture
    @inline def updateBaiduChannelFuture(params: UpdateBaiduChannelRequest): Future[UpdateBaiduChannelResponse] = service.updateBaiduChannel(params).promise().toFuture
    @inline def updateCampaignFuture(params: UpdateCampaignRequest): Future[UpdateCampaignResponse] = service.updateCampaign(params).promise().toFuture
    @inline def updateEmailChannelFuture(params: UpdateEmailChannelRequest): Future[UpdateEmailChannelResponse] = service.updateEmailChannel(params).promise().toFuture
    @inline def updateEmailTemplateFuture(params: UpdateEmailTemplateRequest): Future[UpdateEmailTemplateResponse] = service.updateEmailTemplate(params).promise().toFuture
    @inline def updateEndpointFuture(params: UpdateEndpointRequest): Future[UpdateEndpointResponse] = service.updateEndpoint(params).promise().toFuture
    @inline def updateEndpointsBatchFuture(params: UpdateEndpointsBatchRequest): Future[UpdateEndpointsBatchResponse] = service.updateEndpointsBatch(params).promise().toFuture
    @inline def updateGcmChannelFuture(params: UpdateGcmChannelRequest): Future[UpdateGcmChannelResponse] = service.updateGcmChannel(params).promise().toFuture
    @inline def updateInAppTemplateFuture(params: UpdateInAppTemplateRequest): Future[UpdateInAppTemplateResponse] = service.updateInAppTemplate(params).promise().toFuture
    @inline def updateJourneyFuture(params: UpdateJourneyRequest): Future[UpdateJourneyResponse] = service.updateJourney(params).promise().toFuture
    @inline def updateJourneyStateFuture(params: UpdateJourneyStateRequest): Future[UpdateJourneyStateResponse] = service.updateJourneyState(params).promise().toFuture
    @inline def updatePushTemplateFuture(params: UpdatePushTemplateRequest): Future[UpdatePushTemplateResponse] = service.updatePushTemplate(params).promise().toFuture
    @inline def updateRecommenderConfigurationFuture(params: UpdateRecommenderConfigurationRequest): Future[UpdateRecommenderConfigurationResponse] = service.updateRecommenderConfiguration(params).promise().toFuture
    @inline def updateSegmentFuture(params: UpdateSegmentRequest): Future[UpdateSegmentResponse] = service.updateSegment(params).promise().toFuture
    @inline def updateSmsChannelFuture(params: UpdateSmsChannelRequest): Future[UpdateSmsChannelResponse] = service.updateSmsChannel(params).promise().toFuture
    @inline def updateSmsTemplateFuture(params: UpdateSmsTemplateRequest): Future[UpdateSmsTemplateResponse] = service.updateSmsTemplate(params).promise().toFuture
    @inline def updateTemplateActiveVersionFuture(params: UpdateTemplateActiveVersionRequest): Future[UpdateTemplateActiveVersionResponse] = service.updateTemplateActiveVersion(params).promise().toFuture
    @inline def updateVoiceChannelFuture(params: UpdateVoiceChannelRequest): Future[UpdateVoiceChannelResponse] = service.updateVoiceChannel(params).promise().toFuture
    @inline def updateVoiceTemplateFuture(params: UpdateVoiceTemplateRequest): Future[UpdateVoiceTemplateResponse] = service.updateVoiceTemplate(params).promise().toFuture
    @inline def verifyOTPMessageFuture(params: VerifyOTPMessageRequest): Future[VerifyOTPMessageResponse] = service.verifyOTPMessage(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/pinpoint", JSImport.Namespace, "AWS.Pinpoint")
  class Pinpoint() extends js.Object {
    def this(config: AWSConfig) = this()

    def createApp(params: CreateAppRequest): Request[CreateAppResponse] = js.native
    def createCampaign(params: CreateCampaignRequest): Request[CreateCampaignResponse] = js.native
    def createEmailTemplate(params: CreateEmailTemplateRequest): Request[CreateEmailTemplateResponse] = js.native
    def createExportJob(params: CreateExportJobRequest): Request[CreateExportJobResponse] = js.native
    def createImportJob(params: CreateImportJobRequest): Request[CreateImportJobResponse] = js.native
    def createInAppTemplate(params: CreateInAppTemplateRequest): Request[CreateInAppTemplateResponse] = js.native
    def createJourney(params: CreateJourneyRequest): Request[CreateJourneyResponse] = js.native
    def createPushTemplate(params: CreatePushTemplateRequest): Request[CreatePushTemplateResponse] = js.native
    def createRecommenderConfiguration(params: CreateRecommenderConfigurationRequest): Request[CreateRecommenderConfigurationResponse] = js.native
    def createSegment(params: CreateSegmentRequest): Request[CreateSegmentResponse] = js.native
    def createSmsTemplate(params: CreateSmsTemplateRequest): Request[CreateSmsTemplateResponse] = js.native
    def createVoiceTemplate(params: CreateVoiceTemplateRequest): Request[CreateVoiceTemplateResponse] = js.native
    def deleteAdmChannel(params: DeleteAdmChannelRequest): Request[DeleteAdmChannelResponse] = js.native
    def deleteApnsChannel(params: DeleteApnsChannelRequest): Request[DeleteApnsChannelResponse] = js.native
    def deleteApnsSandboxChannel(params: DeleteApnsSandboxChannelRequest): Request[DeleteApnsSandboxChannelResponse] = js.native
    def deleteApnsVoipChannel(params: DeleteApnsVoipChannelRequest): Request[DeleteApnsVoipChannelResponse] = js.native
    def deleteApnsVoipSandboxChannel(params: DeleteApnsVoipSandboxChannelRequest): Request[DeleteApnsVoipSandboxChannelResponse] = js.native
    def deleteApp(params: DeleteAppRequest): Request[DeleteAppResponse] = js.native
    def deleteBaiduChannel(params: DeleteBaiduChannelRequest): Request[DeleteBaiduChannelResponse] = js.native
    def deleteCampaign(params: DeleteCampaignRequest): Request[DeleteCampaignResponse] = js.native
    def deleteEmailChannel(params: DeleteEmailChannelRequest): Request[DeleteEmailChannelResponse] = js.native
    def deleteEmailTemplate(params: DeleteEmailTemplateRequest): Request[DeleteEmailTemplateResponse] = js.native
    def deleteEndpoint(params: DeleteEndpointRequest): Request[DeleteEndpointResponse] = js.native
    def deleteEventStream(params: DeleteEventStreamRequest): Request[DeleteEventStreamResponse] = js.native
    def deleteGcmChannel(params: DeleteGcmChannelRequest): Request[DeleteGcmChannelResponse] = js.native
    def deleteInAppTemplate(params: DeleteInAppTemplateRequest): Request[DeleteInAppTemplateResponse] = js.native
    def deleteJourney(params: DeleteJourneyRequest): Request[DeleteJourneyResponse] = js.native
    def deletePushTemplate(params: DeletePushTemplateRequest): Request[DeletePushTemplateResponse] = js.native
    def deleteRecommenderConfiguration(params: DeleteRecommenderConfigurationRequest): Request[DeleteRecommenderConfigurationResponse] = js.native
    def deleteSegment(params: DeleteSegmentRequest): Request[DeleteSegmentResponse] = js.native
    def deleteSmsChannel(params: DeleteSmsChannelRequest): Request[DeleteSmsChannelResponse] = js.native
    def deleteSmsTemplate(params: DeleteSmsTemplateRequest): Request[DeleteSmsTemplateResponse] = js.native
    def deleteUserEndpoints(params: DeleteUserEndpointsRequest): Request[DeleteUserEndpointsResponse] = js.native
    def deleteVoiceChannel(params: DeleteVoiceChannelRequest): Request[DeleteVoiceChannelResponse] = js.native
    def deleteVoiceTemplate(params: DeleteVoiceTemplateRequest): Request[DeleteVoiceTemplateResponse] = js.native
    def getAdmChannel(params: GetAdmChannelRequest): Request[GetAdmChannelResponse] = js.native
    def getApnsChannel(params: GetApnsChannelRequest): Request[GetApnsChannelResponse] = js.native
    def getApnsSandboxChannel(params: GetApnsSandboxChannelRequest): Request[GetApnsSandboxChannelResponse] = js.native
    def getApnsVoipChannel(params: GetApnsVoipChannelRequest): Request[GetApnsVoipChannelResponse] = js.native
    def getApnsVoipSandboxChannel(params: GetApnsVoipSandboxChannelRequest): Request[GetApnsVoipSandboxChannelResponse] = js.native
    def getApp(params: GetAppRequest): Request[GetAppResponse] = js.native
    def getApplicationDateRangeKpi(params: GetApplicationDateRangeKpiRequest): Request[GetApplicationDateRangeKpiResponse] = js.native
    def getApplicationSettings(params: GetApplicationSettingsRequest): Request[GetApplicationSettingsResponse] = js.native
    def getApps(params: GetAppsRequest): Request[GetAppsResponse] = js.native
    def getBaiduChannel(params: GetBaiduChannelRequest): Request[GetBaiduChannelResponse] = js.native
    def getCampaign(params: GetCampaignRequest): Request[GetCampaignResponse] = js.native
    def getCampaignActivities(params: GetCampaignActivitiesRequest): Request[GetCampaignActivitiesResponse] = js.native
    def getCampaignDateRangeKpi(params: GetCampaignDateRangeKpiRequest): Request[GetCampaignDateRangeKpiResponse] = js.native
    def getCampaignVersion(params: GetCampaignVersionRequest): Request[GetCampaignVersionResponse] = js.native
    def getCampaignVersions(params: GetCampaignVersionsRequest): Request[GetCampaignVersionsResponse] = js.native
    def getCampaigns(params: GetCampaignsRequest): Request[GetCampaignsResponse] = js.native
    def getChannels(params: GetChannelsRequest): Request[GetChannelsResponse] = js.native
    def getEmailChannel(params: GetEmailChannelRequest): Request[GetEmailChannelResponse] = js.native
    def getEmailTemplate(params: GetEmailTemplateRequest): Request[GetEmailTemplateResponse] = js.native
    def getEndpoint(params: GetEndpointRequest): Request[GetEndpointResponse] = js.native
    def getEventStream(params: GetEventStreamRequest): Request[GetEventStreamResponse] = js.native
    def getExportJob(params: GetExportJobRequest): Request[GetExportJobResponse] = js.native
    def getExportJobs(params: GetExportJobsRequest): Request[GetExportJobsResponse] = js.native
    def getGcmChannel(params: GetGcmChannelRequest): Request[GetGcmChannelResponse] = js.native
    def getImportJob(params: GetImportJobRequest): Request[GetImportJobResponse] = js.native
    def getImportJobs(params: GetImportJobsRequest): Request[GetImportJobsResponse] = js.native
    def getInAppMessages(params: GetInAppMessagesRequest): Request[GetInAppMessagesResponse] = js.native
    def getInAppTemplate(params: GetInAppTemplateRequest): Request[GetInAppTemplateResponse] = js.native
    def getJourney(params: GetJourneyRequest): Request[GetJourneyResponse] = js.native
    def getJourneyDateRangeKpi(params: GetJourneyDateRangeKpiRequest): Request[GetJourneyDateRangeKpiResponse] = js.native
    def getJourneyExecutionActivityMetrics(params: GetJourneyExecutionActivityMetricsRequest): Request[GetJourneyExecutionActivityMetricsResponse] = js.native
    def getJourneyExecutionMetrics(params: GetJourneyExecutionMetricsRequest): Request[GetJourneyExecutionMetricsResponse] = js.native
    def getPushTemplate(params: GetPushTemplateRequest): Request[GetPushTemplateResponse] = js.native
    def getRecommenderConfiguration(params: GetRecommenderConfigurationRequest): Request[GetRecommenderConfigurationResponse] = js.native
    def getRecommenderConfigurations(params: GetRecommenderConfigurationsRequest): Request[GetRecommenderConfigurationsResponse] = js.native
    def getSegment(params: GetSegmentRequest): Request[GetSegmentResponse] = js.native
    def getSegmentExportJobs(params: GetSegmentExportJobsRequest): Request[GetSegmentExportJobsResponse] = js.native
    def getSegmentImportJobs(params: GetSegmentImportJobsRequest): Request[GetSegmentImportJobsResponse] = js.native
    def getSegmentVersion(params: GetSegmentVersionRequest): Request[GetSegmentVersionResponse] = js.native
    def getSegmentVersions(params: GetSegmentVersionsRequest): Request[GetSegmentVersionsResponse] = js.native
    def getSegments(params: GetSegmentsRequest): Request[GetSegmentsResponse] = js.native
    def getSmsChannel(params: GetSmsChannelRequest): Request[GetSmsChannelResponse] = js.native
    def getSmsTemplate(params: GetSmsTemplateRequest): Request[GetSmsTemplateResponse] = js.native
    def getUserEndpoints(params: GetUserEndpointsRequest): Request[GetUserEndpointsResponse] = js.native
    def getVoiceChannel(params: GetVoiceChannelRequest): Request[GetVoiceChannelResponse] = js.native
    def getVoiceTemplate(params: GetVoiceTemplateRequest): Request[GetVoiceTemplateResponse] = js.native
    def listJourneys(params: ListJourneysRequest): Request[ListJourneysResponse] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def listTemplateVersions(params: ListTemplateVersionsRequest): Request[ListTemplateVersionsResponse] = js.native
    def listTemplates(params: ListTemplatesRequest): Request[ListTemplatesResponse] = js.native
    def phoneNumberValidate(params: PhoneNumberValidateRequest): Request[PhoneNumberValidateResponse] = js.native
    def putEventStream(params: PutEventStreamRequest): Request[PutEventStreamResponse] = js.native
    def putEvents(params: PutEventsRequest): Request[PutEventsResponse] = js.native
    def removeAttributes(params: RemoveAttributesRequest): Request[RemoveAttributesResponse] = js.native
    def sendMessages(params: SendMessagesRequest): Request[SendMessagesResponse] = js.native
    def sendOTPMessage(params: SendOTPMessageRequest): Request[SendOTPMessageResponse] = js.native
    def sendUsersMessages(params: SendUsersMessagesRequest): Request[SendUsersMessagesResponse] = js.native
    def tagResource(params: TagResourceRequest): Request[js.Object] = js.native
    def untagResource(params: UntagResourceRequest): Request[js.Object] = js.native
    def updateAdmChannel(params: UpdateAdmChannelRequest): Request[UpdateAdmChannelResponse] = js.native
    def updateApnsChannel(params: UpdateApnsChannelRequest): Request[UpdateApnsChannelResponse] = js.native
    def updateApnsSandboxChannel(params: UpdateApnsSandboxChannelRequest): Request[UpdateApnsSandboxChannelResponse] = js.native
    def updateApnsVoipChannel(params: UpdateApnsVoipChannelRequest): Request[UpdateApnsVoipChannelResponse] = js.native
    def updateApnsVoipSandboxChannel(params: UpdateApnsVoipSandboxChannelRequest): Request[UpdateApnsVoipSandboxChannelResponse] = js.native
    def updateApplicationSettings(params: UpdateApplicationSettingsRequest): Request[UpdateApplicationSettingsResponse] = js.native
    def updateBaiduChannel(params: UpdateBaiduChannelRequest): Request[UpdateBaiduChannelResponse] = js.native
    def updateCampaign(params: UpdateCampaignRequest): Request[UpdateCampaignResponse] = js.native
    def updateEmailChannel(params: UpdateEmailChannelRequest): Request[UpdateEmailChannelResponse] = js.native
    def updateEmailTemplate(params: UpdateEmailTemplateRequest): Request[UpdateEmailTemplateResponse] = js.native
    def updateEndpoint(params: UpdateEndpointRequest): Request[UpdateEndpointResponse] = js.native
    def updateEndpointsBatch(params: UpdateEndpointsBatchRequest): Request[UpdateEndpointsBatchResponse] = js.native
    def updateGcmChannel(params: UpdateGcmChannelRequest): Request[UpdateGcmChannelResponse] = js.native
    def updateInAppTemplate(params: UpdateInAppTemplateRequest): Request[UpdateInAppTemplateResponse] = js.native
    def updateJourney(params: UpdateJourneyRequest): Request[UpdateJourneyResponse] = js.native
    def updateJourneyState(params: UpdateJourneyStateRequest): Request[UpdateJourneyStateResponse] = js.native
    def updatePushTemplate(params: UpdatePushTemplateRequest): Request[UpdatePushTemplateResponse] = js.native
    def updateRecommenderConfiguration(params: UpdateRecommenderConfigurationRequest): Request[UpdateRecommenderConfigurationResponse] = js.native
    def updateSegment(params: UpdateSegmentRequest): Request[UpdateSegmentResponse] = js.native
    def updateSmsChannel(params: UpdateSmsChannelRequest): Request[UpdateSmsChannelResponse] = js.native
    def updateSmsTemplate(params: UpdateSmsTemplateRequest): Request[UpdateSmsTemplateResponse] = js.native
    def updateTemplateActiveVersion(params: UpdateTemplateActiveVersionRequest): Request[UpdateTemplateActiveVersionResponse] = js.native
    def updateVoiceChannel(params: UpdateVoiceChannelRequest): Request[UpdateVoiceChannelResponse] = js.native
    def updateVoiceTemplate(params: UpdateVoiceTemplateRequest): Request[UpdateVoiceTemplateResponse] = js.native
    def verifyOTPMessage(params: VerifyOTPMessageRequest): Request[VerifyOTPMessageResponse] = js.native
  }
  object Pinpoint {
    @inline implicit def toOps(service: Pinpoint): PinpointOps = {
      new PinpointOps(service)
    }
  }

  /** Specifies the status and settings of the ADM (Amazon Device Messaging) channel for an application.
    */
  @js.native
  trait ADMChannelRequest extends js.Object {
    var ClientId: __string
    var ClientSecret: __string
    var Enabled: js.UndefOr[__boolean]
  }

  object ADMChannelRequest {
    @inline
    def apply(
        ClientId: __string,
        ClientSecret: __string,
        Enabled: js.UndefOr[__boolean] = js.undefined
    ): ADMChannelRequest = {
      val __obj = js.Dynamic.literal(
        "ClientId" -> ClientId.asInstanceOf[js.Any],
        "ClientSecret" -> ClientSecret.asInstanceOf[js.Any]
      )

      Enabled.foreach(__v => __obj.updateDynamic("Enabled")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ADMChannelRequest]
    }
  }

  /** Provides information about the status and settings of the ADM (Amazon Device Messaging) channel for an application.
    */
  @js.native
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

  object ADMChannelResponse {
    @inline
    def apply(
        Platform: __string,
        ApplicationId: js.UndefOr[__string] = js.undefined,
        CreationDate: js.UndefOr[__string] = js.undefined,
        Enabled: js.UndefOr[__boolean] = js.undefined,
        HasCredential: js.UndefOr[__boolean] = js.undefined,
        Id: js.UndefOr[__string] = js.undefined,
        IsArchived: js.UndefOr[__boolean] = js.undefined,
        LastModifiedBy: js.UndefOr[__string] = js.undefined,
        LastModifiedDate: js.UndefOr[__string] = js.undefined,
        Version: js.UndefOr[__integer] = js.undefined
    ): ADMChannelResponse = {
      val __obj = js.Dynamic.literal(
        "Platform" -> Platform.asInstanceOf[js.Any]
      )

      ApplicationId.foreach(__v => __obj.updateDynamic("ApplicationId")(__v.asInstanceOf[js.Any]))
      CreationDate.foreach(__v => __obj.updateDynamic("CreationDate")(__v.asInstanceOf[js.Any]))
      Enabled.foreach(__v => __obj.updateDynamic("Enabled")(__v.asInstanceOf[js.Any]))
      HasCredential.foreach(__v => __obj.updateDynamic("HasCredential")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      IsArchived.foreach(__v => __obj.updateDynamic("IsArchived")(__v.asInstanceOf[js.Any]))
      LastModifiedBy.foreach(__v => __obj.updateDynamic("LastModifiedBy")(__v.asInstanceOf[js.Any]))
      LastModifiedDate.foreach(__v => __obj.updateDynamic("LastModifiedDate")(__v.asInstanceOf[js.Any]))
      Version.foreach(__v => __obj.updateDynamic("Version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ADMChannelResponse]
    }
  }

  /** Specifies the settings for a one-time message that's sent directly to an endpoint through the ADM (Amazon Device Messaging) channel.
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
    @inline
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
      val __obj = js.Dynamic.literal()
      Action.foreach(__v => __obj.updateDynamic("Action")(__v.asInstanceOf[js.Any]))
      Body.foreach(__v => __obj.updateDynamic("Body")(__v.asInstanceOf[js.Any]))
      ConsolidationKey.foreach(__v => __obj.updateDynamic("ConsolidationKey")(__v.asInstanceOf[js.Any]))
      Data.foreach(__v => __obj.updateDynamic("Data")(__v.asInstanceOf[js.Any]))
      ExpiresAfter.foreach(__v => __obj.updateDynamic("ExpiresAfter")(__v.asInstanceOf[js.Any]))
      IconReference.foreach(__v => __obj.updateDynamic("IconReference")(__v.asInstanceOf[js.Any]))
      ImageIconUrl.foreach(__v => __obj.updateDynamic("ImageIconUrl")(__v.asInstanceOf[js.Any]))
      ImageUrl.foreach(__v => __obj.updateDynamic("ImageUrl")(__v.asInstanceOf[js.Any]))
      MD5.foreach(__v => __obj.updateDynamic("MD5")(__v.asInstanceOf[js.Any]))
      RawContent.foreach(__v => __obj.updateDynamic("RawContent")(__v.asInstanceOf[js.Any]))
      SilentPush.foreach(__v => __obj.updateDynamic("SilentPush")(__v.asInstanceOf[js.Any]))
      SmallImageIconUrl.foreach(__v => __obj.updateDynamic("SmallImageIconUrl")(__v.asInstanceOf[js.Any]))
      Sound.foreach(__v => __obj.updateDynamic("Sound")(__v.asInstanceOf[js.Any]))
      Substitutions.foreach(__v => __obj.updateDynamic("Substitutions")(__v.asInstanceOf[js.Any]))
      Title.foreach(__v => __obj.updateDynamic("Title")(__v.asInstanceOf[js.Any]))
      Url.foreach(__v => __obj.updateDynamic("Url")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ADMMessage]
    }
  }

  /** Specifies the status and settings of the APNs (Apple Push Notification service) channel for an application.
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
    @inline
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
      val __obj = js.Dynamic.literal()
      BundleId.foreach(__v => __obj.updateDynamic("BundleId")(__v.asInstanceOf[js.Any]))
      Certificate.foreach(__v => __obj.updateDynamic("Certificate")(__v.asInstanceOf[js.Any]))
      DefaultAuthenticationMethod.foreach(__v => __obj.updateDynamic("DefaultAuthenticationMethod")(__v.asInstanceOf[js.Any]))
      Enabled.foreach(__v => __obj.updateDynamic("Enabled")(__v.asInstanceOf[js.Any]))
      PrivateKey.foreach(__v => __obj.updateDynamic("PrivateKey")(__v.asInstanceOf[js.Any]))
      TeamId.foreach(__v => __obj.updateDynamic("TeamId")(__v.asInstanceOf[js.Any]))
      TokenKey.foreach(__v => __obj.updateDynamic("TokenKey")(__v.asInstanceOf[js.Any]))
      TokenKeyId.foreach(__v => __obj.updateDynamic("TokenKeyId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[APNSChannelRequest]
    }
  }

  /** Provides information about the status and settings of the APNs (Apple Push Notification service) channel for an application.
    */
  @js.native
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

  object APNSChannelResponse {
    @inline
    def apply(
        Platform: __string,
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
        Version: js.UndefOr[__integer] = js.undefined
    ): APNSChannelResponse = {
      val __obj = js.Dynamic.literal(
        "Platform" -> Platform.asInstanceOf[js.Any]
      )

      ApplicationId.foreach(__v => __obj.updateDynamic("ApplicationId")(__v.asInstanceOf[js.Any]))
      CreationDate.foreach(__v => __obj.updateDynamic("CreationDate")(__v.asInstanceOf[js.Any]))
      DefaultAuthenticationMethod.foreach(__v => __obj.updateDynamic("DefaultAuthenticationMethod")(__v.asInstanceOf[js.Any]))
      Enabled.foreach(__v => __obj.updateDynamic("Enabled")(__v.asInstanceOf[js.Any]))
      HasCredential.foreach(__v => __obj.updateDynamic("HasCredential")(__v.asInstanceOf[js.Any]))
      HasTokenKey.foreach(__v => __obj.updateDynamic("HasTokenKey")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      IsArchived.foreach(__v => __obj.updateDynamic("IsArchived")(__v.asInstanceOf[js.Any]))
      LastModifiedBy.foreach(__v => __obj.updateDynamic("LastModifiedBy")(__v.asInstanceOf[js.Any]))
      LastModifiedDate.foreach(__v => __obj.updateDynamic("LastModifiedDate")(__v.asInstanceOf[js.Any]))
      Version.foreach(__v => __obj.updateDynamic("Version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[APNSChannelResponse]
    }
  }

  /** Specifies the settings for a one-time message that's sent directly to an endpoint through the APNs (Apple Push Notification service) channel.
    */
  @js.native
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

  object APNSMessage {
    @inline
    def apply(
        APNSPushType: js.UndefOr[__string] = js.undefined,
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
      val __obj = js.Dynamic.literal()
      APNSPushType.foreach(__v => __obj.updateDynamic("APNSPushType")(__v.asInstanceOf[js.Any]))
      Action.foreach(__v => __obj.updateDynamic("Action")(__v.asInstanceOf[js.Any]))
      Badge.foreach(__v => __obj.updateDynamic("Badge")(__v.asInstanceOf[js.Any]))
      Body.foreach(__v => __obj.updateDynamic("Body")(__v.asInstanceOf[js.Any]))
      Category.foreach(__v => __obj.updateDynamic("Category")(__v.asInstanceOf[js.Any]))
      CollapseId.foreach(__v => __obj.updateDynamic("CollapseId")(__v.asInstanceOf[js.Any]))
      Data.foreach(__v => __obj.updateDynamic("Data")(__v.asInstanceOf[js.Any]))
      MediaUrl.foreach(__v => __obj.updateDynamic("MediaUrl")(__v.asInstanceOf[js.Any]))
      PreferredAuthenticationMethod.foreach(__v => __obj.updateDynamic("PreferredAuthenticationMethod")(__v.asInstanceOf[js.Any]))
      Priority.foreach(__v => __obj.updateDynamic("Priority")(__v.asInstanceOf[js.Any]))
      RawContent.foreach(__v => __obj.updateDynamic("RawContent")(__v.asInstanceOf[js.Any]))
      SilentPush.foreach(__v => __obj.updateDynamic("SilentPush")(__v.asInstanceOf[js.Any]))
      Sound.foreach(__v => __obj.updateDynamic("Sound")(__v.asInstanceOf[js.Any]))
      Substitutions.foreach(__v => __obj.updateDynamic("Substitutions")(__v.asInstanceOf[js.Any]))
      ThreadId.foreach(__v => __obj.updateDynamic("ThreadId")(__v.asInstanceOf[js.Any]))
      TimeToLive.foreach(__v => __obj.updateDynamic("TimeToLive")(__v.asInstanceOf[js.Any]))
      Title.foreach(__v => __obj.updateDynamic("Title")(__v.asInstanceOf[js.Any]))
      Url.foreach(__v => __obj.updateDynamic("Url")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[APNSMessage]
    }
  }

  /** Specifies channel-specific content and settings for a message template that can be used in push notifications that are sent through the APNs (Apple Push Notification service) channel.
    */
  @js.native
  trait APNSPushNotificationTemplate extends js.Object {
    var Action: js.UndefOr[Action]
    var Body: js.UndefOr[__string]
    var MediaUrl: js.UndefOr[__string]
    var RawContent: js.UndefOr[__string]
    var Sound: js.UndefOr[__string]
    var Title: js.UndefOr[__string]
    var Url: js.UndefOr[__string]
  }

  object APNSPushNotificationTemplate {
    @inline
    def apply(
        Action: js.UndefOr[Action] = js.undefined,
        Body: js.UndefOr[__string] = js.undefined,
        MediaUrl: js.UndefOr[__string] = js.undefined,
        RawContent: js.UndefOr[__string] = js.undefined,
        Sound: js.UndefOr[__string] = js.undefined,
        Title: js.UndefOr[__string] = js.undefined,
        Url: js.UndefOr[__string] = js.undefined
    ): APNSPushNotificationTemplate = {
      val __obj = js.Dynamic.literal()
      Action.foreach(__v => __obj.updateDynamic("Action")(__v.asInstanceOf[js.Any]))
      Body.foreach(__v => __obj.updateDynamic("Body")(__v.asInstanceOf[js.Any]))
      MediaUrl.foreach(__v => __obj.updateDynamic("MediaUrl")(__v.asInstanceOf[js.Any]))
      RawContent.foreach(__v => __obj.updateDynamic("RawContent")(__v.asInstanceOf[js.Any]))
      Sound.foreach(__v => __obj.updateDynamic("Sound")(__v.asInstanceOf[js.Any]))
      Title.foreach(__v => __obj.updateDynamic("Title")(__v.asInstanceOf[js.Any]))
      Url.foreach(__v => __obj.updateDynamic("Url")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[APNSPushNotificationTemplate]
    }
  }

  /** Specifies the status and settings of the APNs (Apple Push Notification service) sandbox channel for an application.
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
    @inline
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
      val __obj = js.Dynamic.literal()
      BundleId.foreach(__v => __obj.updateDynamic("BundleId")(__v.asInstanceOf[js.Any]))
      Certificate.foreach(__v => __obj.updateDynamic("Certificate")(__v.asInstanceOf[js.Any]))
      DefaultAuthenticationMethod.foreach(__v => __obj.updateDynamic("DefaultAuthenticationMethod")(__v.asInstanceOf[js.Any]))
      Enabled.foreach(__v => __obj.updateDynamic("Enabled")(__v.asInstanceOf[js.Any]))
      PrivateKey.foreach(__v => __obj.updateDynamic("PrivateKey")(__v.asInstanceOf[js.Any]))
      TeamId.foreach(__v => __obj.updateDynamic("TeamId")(__v.asInstanceOf[js.Any]))
      TokenKey.foreach(__v => __obj.updateDynamic("TokenKey")(__v.asInstanceOf[js.Any]))
      TokenKeyId.foreach(__v => __obj.updateDynamic("TokenKeyId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[APNSSandboxChannelRequest]
    }
  }

  /** Provides information about the status and settings of the APNs (Apple Push Notification service) sandbox channel for an application.
    */
  @js.native
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

  object APNSSandboxChannelResponse {
    @inline
    def apply(
        Platform: __string,
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
        Version: js.UndefOr[__integer] = js.undefined
    ): APNSSandboxChannelResponse = {
      val __obj = js.Dynamic.literal(
        "Platform" -> Platform.asInstanceOf[js.Any]
      )

      ApplicationId.foreach(__v => __obj.updateDynamic("ApplicationId")(__v.asInstanceOf[js.Any]))
      CreationDate.foreach(__v => __obj.updateDynamic("CreationDate")(__v.asInstanceOf[js.Any]))
      DefaultAuthenticationMethod.foreach(__v => __obj.updateDynamic("DefaultAuthenticationMethod")(__v.asInstanceOf[js.Any]))
      Enabled.foreach(__v => __obj.updateDynamic("Enabled")(__v.asInstanceOf[js.Any]))
      HasCredential.foreach(__v => __obj.updateDynamic("HasCredential")(__v.asInstanceOf[js.Any]))
      HasTokenKey.foreach(__v => __obj.updateDynamic("HasTokenKey")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      IsArchived.foreach(__v => __obj.updateDynamic("IsArchived")(__v.asInstanceOf[js.Any]))
      LastModifiedBy.foreach(__v => __obj.updateDynamic("LastModifiedBy")(__v.asInstanceOf[js.Any]))
      LastModifiedDate.foreach(__v => __obj.updateDynamic("LastModifiedDate")(__v.asInstanceOf[js.Any]))
      Version.foreach(__v => __obj.updateDynamic("Version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[APNSSandboxChannelResponse]
    }
  }

  /** Specifies the status and settings of the APNs (Apple Push Notification service) VoIP channel for an application.
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
    @inline
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
      val __obj = js.Dynamic.literal()
      BundleId.foreach(__v => __obj.updateDynamic("BundleId")(__v.asInstanceOf[js.Any]))
      Certificate.foreach(__v => __obj.updateDynamic("Certificate")(__v.asInstanceOf[js.Any]))
      DefaultAuthenticationMethod.foreach(__v => __obj.updateDynamic("DefaultAuthenticationMethod")(__v.asInstanceOf[js.Any]))
      Enabled.foreach(__v => __obj.updateDynamic("Enabled")(__v.asInstanceOf[js.Any]))
      PrivateKey.foreach(__v => __obj.updateDynamic("PrivateKey")(__v.asInstanceOf[js.Any]))
      TeamId.foreach(__v => __obj.updateDynamic("TeamId")(__v.asInstanceOf[js.Any]))
      TokenKey.foreach(__v => __obj.updateDynamic("TokenKey")(__v.asInstanceOf[js.Any]))
      TokenKeyId.foreach(__v => __obj.updateDynamic("TokenKeyId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[APNSVoipChannelRequest]
    }
  }

  /** Provides information about the status and settings of the APNs (Apple Push Notification service) VoIP channel for an application.
    */
  @js.native
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

  object APNSVoipChannelResponse {
    @inline
    def apply(
        Platform: __string,
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
        Version: js.UndefOr[__integer] = js.undefined
    ): APNSVoipChannelResponse = {
      val __obj = js.Dynamic.literal(
        "Platform" -> Platform.asInstanceOf[js.Any]
      )

      ApplicationId.foreach(__v => __obj.updateDynamic("ApplicationId")(__v.asInstanceOf[js.Any]))
      CreationDate.foreach(__v => __obj.updateDynamic("CreationDate")(__v.asInstanceOf[js.Any]))
      DefaultAuthenticationMethod.foreach(__v => __obj.updateDynamic("DefaultAuthenticationMethod")(__v.asInstanceOf[js.Any]))
      Enabled.foreach(__v => __obj.updateDynamic("Enabled")(__v.asInstanceOf[js.Any]))
      HasCredential.foreach(__v => __obj.updateDynamic("HasCredential")(__v.asInstanceOf[js.Any]))
      HasTokenKey.foreach(__v => __obj.updateDynamic("HasTokenKey")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      IsArchived.foreach(__v => __obj.updateDynamic("IsArchived")(__v.asInstanceOf[js.Any]))
      LastModifiedBy.foreach(__v => __obj.updateDynamic("LastModifiedBy")(__v.asInstanceOf[js.Any]))
      LastModifiedDate.foreach(__v => __obj.updateDynamic("LastModifiedDate")(__v.asInstanceOf[js.Any]))
      Version.foreach(__v => __obj.updateDynamic("Version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[APNSVoipChannelResponse]
    }
  }

  /** Specifies the status and settings of the APNs (Apple Push Notification service) VoIP sandbox channel for an application.
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
    @inline
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
      val __obj = js.Dynamic.literal()
      BundleId.foreach(__v => __obj.updateDynamic("BundleId")(__v.asInstanceOf[js.Any]))
      Certificate.foreach(__v => __obj.updateDynamic("Certificate")(__v.asInstanceOf[js.Any]))
      DefaultAuthenticationMethod.foreach(__v => __obj.updateDynamic("DefaultAuthenticationMethod")(__v.asInstanceOf[js.Any]))
      Enabled.foreach(__v => __obj.updateDynamic("Enabled")(__v.asInstanceOf[js.Any]))
      PrivateKey.foreach(__v => __obj.updateDynamic("PrivateKey")(__v.asInstanceOf[js.Any]))
      TeamId.foreach(__v => __obj.updateDynamic("TeamId")(__v.asInstanceOf[js.Any]))
      TokenKey.foreach(__v => __obj.updateDynamic("TokenKey")(__v.asInstanceOf[js.Any]))
      TokenKeyId.foreach(__v => __obj.updateDynamic("TokenKeyId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[APNSVoipSandboxChannelRequest]
    }
  }

  /** Provides information about the status and settings of the APNs (Apple Push Notification service) VoIP sandbox channel for an application.
    */
  @js.native
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

  object APNSVoipSandboxChannelResponse {
    @inline
    def apply(
        Platform: __string,
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
        Version: js.UndefOr[__integer] = js.undefined
    ): APNSVoipSandboxChannelResponse = {
      val __obj = js.Dynamic.literal(
        "Platform" -> Platform.asInstanceOf[js.Any]
      )

      ApplicationId.foreach(__v => __obj.updateDynamic("ApplicationId")(__v.asInstanceOf[js.Any]))
      CreationDate.foreach(__v => __obj.updateDynamic("CreationDate")(__v.asInstanceOf[js.Any]))
      DefaultAuthenticationMethod.foreach(__v => __obj.updateDynamic("DefaultAuthenticationMethod")(__v.asInstanceOf[js.Any]))
      Enabled.foreach(__v => __obj.updateDynamic("Enabled")(__v.asInstanceOf[js.Any]))
      HasCredential.foreach(__v => __obj.updateDynamic("HasCredential")(__v.asInstanceOf[js.Any]))
      HasTokenKey.foreach(__v => __obj.updateDynamic("HasTokenKey")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      IsArchived.foreach(__v => __obj.updateDynamic("IsArchived")(__v.asInstanceOf[js.Any]))
      LastModifiedBy.foreach(__v => __obj.updateDynamic("LastModifiedBy")(__v.asInstanceOf[js.Any]))
      LastModifiedDate.foreach(__v => __obj.updateDynamic("LastModifiedDate")(__v.asInstanceOf[js.Any]))
      Version.foreach(__v => __obj.updateDynamic("Version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[APNSVoipSandboxChannelResponse]
    }
  }

  /** Provides information about the activities that were performed by a campaign.
    */
  @js.native
  trait ActivitiesResponse extends js.Object {
    var Item: ListOfActivityResponse
    var NextToken: js.UndefOr[__string]
  }

  object ActivitiesResponse {
    @inline
    def apply(
        Item: ListOfActivityResponse,
        NextToken: js.UndefOr[__string] = js.undefined
    ): ActivitiesResponse = {
      val __obj = js.Dynamic.literal(
        "Item" -> Item.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ActivitiesResponse]
    }
  }

  /** Specifies the configuration and other settings for an activity in a journey.
    */
  @js.native
  trait Activity extends js.Object {
    var CUSTOM: js.UndefOr[CustomMessageActivity]
    var ConditionalSplit: js.UndefOr[ConditionalSplitActivity]
    var ContactCenter: js.UndefOr[ContactCenterActivity]
    var Description: js.UndefOr[__string]
    var EMAIL: js.UndefOr[EmailMessageActivity]
    var Holdout: js.UndefOr[HoldoutActivity]
    var MultiCondition: js.UndefOr[MultiConditionalSplitActivity]
    var PUSH: js.UndefOr[PushMessageActivity]
    var RandomSplit: js.UndefOr[RandomSplitActivity]
    var SMS: js.UndefOr[SMSMessageActivity]
    var Wait: js.UndefOr[WaitActivity]
  }

  object Activity {
    @inline
    def apply(
        CUSTOM: js.UndefOr[CustomMessageActivity] = js.undefined,
        ConditionalSplit: js.UndefOr[ConditionalSplitActivity] = js.undefined,
        ContactCenter: js.UndefOr[ContactCenterActivity] = js.undefined,
        Description: js.UndefOr[__string] = js.undefined,
        EMAIL: js.UndefOr[EmailMessageActivity] = js.undefined,
        Holdout: js.UndefOr[HoldoutActivity] = js.undefined,
        MultiCondition: js.UndefOr[MultiConditionalSplitActivity] = js.undefined,
        PUSH: js.UndefOr[PushMessageActivity] = js.undefined,
        RandomSplit: js.UndefOr[RandomSplitActivity] = js.undefined,
        SMS: js.UndefOr[SMSMessageActivity] = js.undefined,
        Wait: js.UndefOr[WaitActivity] = js.undefined
    ): Activity = {
      val __obj = js.Dynamic.literal()
      CUSTOM.foreach(__v => __obj.updateDynamic("CUSTOM")(__v.asInstanceOf[js.Any]))
      ConditionalSplit.foreach(__v => __obj.updateDynamic("ConditionalSplit")(__v.asInstanceOf[js.Any]))
      ContactCenter.foreach(__v => __obj.updateDynamic("ContactCenter")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      EMAIL.foreach(__v => __obj.updateDynamic("EMAIL")(__v.asInstanceOf[js.Any]))
      Holdout.foreach(__v => __obj.updateDynamic("Holdout")(__v.asInstanceOf[js.Any]))
      MultiCondition.foreach(__v => __obj.updateDynamic("MultiCondition")(__v.asInstanceOf[js.Any]))
      PUSH.foreach(__v => __obj.updateDynamic("PUSH")(__v.asInstanceOf[js.Any]))
      RandomSplit.foreach(__v => __obj.updateDynamic("RandomSplit")(__v.asInstanceOf[js.Any]))
      SMS.foreach(__v => __obj.updateDynamic("SMS")(__v.asInstanceOf[js.Any]))
      Wait.foreach(__v => __obj.updateDynamic("Wait")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Activity]
    }
  }

  /** Provides information about an activity that was performed by a campaign.
    */
  @js.native
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

  object ActivityResponse {
    @inline
    def apply(
        ApplicationId: __string,
        CampaignId: __string,
        Id: __string,
        End: js.UndefOr[__string] = js.undefined,
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
      val __obj = js.Dynamic.literal(
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any],
        "CampaignId" -> CampaignId.asInstanceOf[js.Any],
        "Id" -> Id.asInstanceOf[js.Any]
      )

      End.foreach(__v => __obj.updateDynamic("End")(__v.asInstanceOf[js.Any]))
      Result.foreach(__v => __obj.updateDynamic("Result")(__v.asInstanceOf[js.Any]))
      ScheduledStart.foreach(__v => __obj.updateDynamic("ScheduledStart")(__v.asInstanceOf[js.Any]))
      Start.foreach(__v => __obj.updateDynamic("Start")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      SuccessfulEndpointCount.foreach(__v => __obj.updateDynamic("SuccessfulEndpointCount")(__v.asInstanceOf[js.Any]))
      TimezonesCompletedCount.foreach(__v => __obj.updateDynamic("TimezonesCompletedCount")(__v.asInstanceOf[js.Any]))
      TimezonesTotalCount.foreach(__v => __obj.updateDynamic("TimezonesTotalCount")(__v.asInstanceOf[js.Any]))
      TotalEndpointCount.foreach(__v => __obj.updateDynamic("TotalEndpointCount")(__v.asInstanceOf[js.Any]))
      TreatmentId.foreach(__v => __obj.updateDynamic("TreatmentId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ActivityResponse]
    }
  }

  /** Specifies address-based configuration settings for a message that's sent directly to an endpoint.
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
    @inline
    def apply(
        BodyOverride: js.UndefOr[__string] = js.undefined,
        ChannelType: js.UndefOr[ChannelType] = js.undefined,
        Context: js.UndefOr[MapOf__string] = js.undefined,
        RawContent: js.UndefOr[__string] = js.undefined,
        Substitutions: js.UndefOr[MapOfListOf__string] = js.undefined,
        TitleOverride: js.UndefOr[__string] = js.undefined
    ): AddressConfiguration = {
      val __obj = js.Dynamic.literal()
      BodyOverride.foreach(__v => __obj.updateDynamic("BodyOverride")(__v.asInstanceOf[js.Any]))
      ChannelType.foreach(__v => __obj.updateDynamic("ChannelType")(__v.asInstanceOf[js.Any]))
      Context.foreach(__v => __obj.updateDynamic("Context")(__v.asInstanceOf[js.Any]))
      RawContent.foreach(__v => __obj.updateDynamic("RawContent")(__v.asInstanceOf[js.Any]))
      Substitutions.foreach(__v => __obj.updateDynamic("Substitutions")(__v.asInstanceOf[js.Any]))
      TitleOverride.foreach(__v => __obj.updateDynamic("TitleOverride")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AddressConfiguration]
    }
  }

  /** Specifies channel-specific content and settings for a message template that can be used in push notifications that are sent through the ADM (Amazon Device Messaging), Baidu (Baidu Cloud Push), or GCM (Firebase Cloud Messaging, formerly Google Cloud Messaging) channel.
    */
  @js.native
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

  object AndroidPushNotificationTemplate {
    @inline
    def apply(
        Action: js.UndefOr[Action] = js.undefined,
        Body: js.UndefOr[__string] = js.undefined,
        ImageIconUrl: js.UndefOr[__string] = js.undefined,
        ImageUrl: js.UndefOr[__string] = js.undefined,
        RawContent: js.UndefOr[__string] = js.undefined,
        SmallImageIconUrl: js.UndefOr[__string] = js.undefined,
        Sound: js.UndefOr[__string] = js.undefined,
        Title: js.UndefOr[__string] = js.undefined,
        Url: js.UndefOr[__string] = js.undefined
    ): AndroidPushNotificationTemplate = {
      val __obj = js.Dynamic.literal()
      Action.foreach(__v => __obj.updateDynamic("Action")(__v.asInstanceOf[js.Any]))
      Body.foreach(__v => __obj.updateDynamic("Body")(__v.asInstanceOf[js.Any]))
      ImageIconUrl.foreach(__v => __obj.updateDynamic("ImageIconUrl")(__v.asInstanceOf[js.Any]))
      ImageUrl.foreach(__v => __obj.updateDynamic("ImageUrl")(__v.asInstanceOf[js.Any]))
      RawContent.foreach(__v => __obj.updateDynamic("RawContent")(__v.asInstanceOf[js.Any]))
      SmallImageIconUrl.foreach(__v => __obj.updateDynamic("SmallImageIconUrl")(__v.asInstanceOf[js.Any]))
      Sound.foreach(__v => __obj.updateDynamic("Sound")(__v.asInstanceOf[js.Any]))
      Title.foreach(__v => __obj.updateDynamic("Title")(__v.asInstanceOf[js.Any]))
      Url.foreach(__v => __obj.updateDynamic("Url")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AndroidPushNotificationTemplate]
    }
  }

  /** Provides the results of a query that retrieved the data for a standard metric that applies to an application, and provides information about that query.
    */
  @js.native
  trait ApplicationDateRangeKpiResponse extends js.Object {
    var ApplicationId: __string
    var EndTime: __timestampIso8601
    var KpiName: __string
    var KpiResult: BaseKpiResult
    var StartTime: __timestampIso8601
    var NextToken: js.UndefOr[__string]
  }

  object ApplicationDateRangeKpiResponse {
    @inline
    def apply(
        ApplicationId: __string,
        EndTime: __timestampIso8601,
        KpiName: __string,
        KpiResult: BaseKpiResult,
        StartTime: __timestampIso8601,
        NextToken: js.UndefOr[__string] = js.undefined
    ): ApplicationDateRangeKpiResponse = {
      val __obj = js.Dynamic.literal(
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any],
        "EndTime" -> EndTime.asInstanceOf[js.Any],
        "KpiName" -> KpiName.asInstanceOf[js.Any],
        "KpiResult" -> KpiResult.asInstanceOf[js.Any],
        "StartTime" -> StartTime.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ApplicationDateRangeKpiResponse]
    }
  }

  /** Provides information about an application.
    */
  @js.native
  trait ApplicationResponse extends js.Object {
    var Arn: __string
    var Id: __string
    var Name: __string
    var CreationDate: js.UndefOr[__string]
    var tags: js.UndefOr[MapOf__string]
  }

  object ApplicationResponse {
    @inline
    def apply(
        Arn: __string,
        Id: __string,
        Name: __string,
        CreationDate: js.UndefOr[__string] = js.undefined,
        tags: js.UndefOr[MapOf__string] = js.undefined
    ): ApplicationResponse = {
      val __obj = js.Dynamic.literal(
        "Arn" -> Arn.asInstanceOf[js.Any],
        "Id" -> Id.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]
      )

      CreationDate.foreach(__v => __obj.updateDynamic("CreationDate")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ApplicationResponse]
    }
  }

  /** Provides information about an application, including the default settings for an application.
    */
  @js.native
  trait ApplicationSettingsResource extends js.Object {
    var ApplicationId: __string
    var CampaignHook: js.UndefOr[CampaignHook]
    var LastModifiedDate: js.UndefOr[__string]
    var Limits: js.UndefOr[CampaignLimits]
    var QuietTime: js.UndefOr[QuietTime]
  }

  object ApplicationSettingsResource {
    @inline
    def apply(
        ApplicationId: __string,
        CampaignHook: js.UndefOr[CampaignHook] = js.undefined,
        LastModifiedDate: js.UndefOr[__string] = js.undefined,
        Limits: js.UndefOr[CampaignLimits] = js.undefined,
        QuietTime: js.UndefOr[QuietTime] = js.undefined
    ): ApplicationSettingsResource = {
      val __obj = js.Dynamic.literal(
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any]
      )

      CampaignHook.foreach(__v => __obj.updateDynamic("CampaignHook")(__v.asInstanceOf[js.Any]))
      LastModifiedDate.foreach(__v => __obj.updateDynamic("LastModifiedDate")(__v.asInstanceOf[js.Any]))
      Limits.foreach(__v => __obj.updateDynamic("Limits")(__v.asInstanceOf[js.Any]))
      QuietTime.foreach(__v => __obj.updateDynamic("QuietTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ApplicationSettingsResource]
    }
  }

  /** Provides information about all of your applications.
    */
  @js.native
  trait ApplicationsResponse extends js.Object {
    var Item: js.UndefOr[ListOfApplicationResponse]
    var NextToken: js.UndefOr[__string]
  }

  object ApplicationsResponse {
    @inline
    def apply(
        Item: js.UndefOr[ListOfApplicationResponse] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): ApplicationsResponse = {
      val __obj = js.Dynamic.literal()
      Item.foreach(__v => __obj.updateDynamic("Item")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ApplicationsResponse]
    }
  }

  /** Specifies attribute-based criteria for including or excluding endpoints from a segment.
    */
  @js.native
  trait AttributeDimension extends js.Object {
    var Values: ListOf__string
    var AttributeType: js.UndefOr[AttributeType]
  }

  object AttributeDimension {
    @inline
    def apply(
        Values: ListOf__string,
        AttributeType: js.UndefOr[AttributeType] = js.undefined
    ): AttributeDimension = {
      val __obj = js.Dynamic.literal(
        "Values" -> Values.asInstanceOf[js.Any]
      )

      AttributeType.foreach(__v => __obj.updateDynamic("AttributeType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AttributeDimension]
    }
  }

  /** Provides information about the type and the names of attributes that were removed from all the endpoints that are associated with an application.
    */
  @js.native
  trait AttributesResource extends js.Object {
    var ApplicationId: __string
    var AttributeType: __string
    var Attributes: js.UndefOr[ListOf__string]
  }

  object AttributesResource {
    @inline
    def apply(
        ApplicationId: __string,
        AttributeType: __string,
        Attributes: js.UndefOr[ListOf__string] = js.undefined
    ): AttributesResource = {
      val __obj = js.Dynamic.literal(
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any],
        "AttributeType" -> AttributeType.asInstanceOf[js.Any]
      )

      Attributes.foreach(__v => __obj.updateDynamic("Attributes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AttributesResource]
    }
  }

  /** Specifies the status and settings of the Baidu (Baidu Cloud Push) channel for an application.
    */
  @js.native
  trait BaiduChannelRequest extends js.Object {
    var ApiKey: __string
    var SecretKey: __string
    var Enabled: js.UndefOr[__boolean]
  }

  object BaiduChannelRequest {
    @inline
    def apply(
        ApiKey: __string,
        SecretKey: __string,
        Enabled: js.UndefOr[__boolean] = js.undefined
    ): BaiduChannelRequest = {
      val __obj = js.Dynamic.literal(
        "ApiKey" -> ApiKey.asInstanceOf[js.Any],
        "SecretKey" -> SecretKey.asInstanceOf[js.Any]
      )

      Enabled.foreach(__v => __obj.updateDynamic("Enabled")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BaiduChannelRequest]
    }
  }

  /** Provides information about the status and settings of the Baidu (Baidu Cloud Push) channel for an application.
    */
  @js.native
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

  object BaiduChannelResponse {
    @inline
    def apply(
        Credential: __string,
        Platform: __string,
        ApplicationId: js.UndefOr[__string] = js.undefined,
        CreationDate: js.UndefOr[__string] = js.undefined,
        Enabled: js.UndefOr[__boolean] = js.undefined,
        HasCredential: js.UndefOr[__boolean] = js.undefined,
        Id: js.UndefOr[__string] = js.undefined,
        IsArchived: js.UndefOr[__boolean] = js.undefined,
        LastModifiedBy: js.UndefOr[__string] = js.undefined,
        LastModifiedDate: js.UndefOr[__string] = js.undefined,
        Version: js.UndefOr[__integer] = js.undefined
    ): BaiduChannelResponse = {
      val __obj = js.Dynamic.literal(
        "Credential" -> Credential.asInstanceOf[js.Any],
        "Platform" -> Platform.asInstanceOf[js.Any]
      )

      ApplicationId.foreach(__v => __obj.updateDynamic("ApplicationId")(__v.asInstanceOf[js.Any]))
      CreationDate.foreach(__v => __obj.updateDynamic("CreationDate")(__v.asInstanceOf[js.Any]))
      Enabled.foreach(__v => __obj.updateDynamic("Enabled")(__v.asInstanceOf[js.Any]))
      HasCredential.foreach(__v => __obj.updateDynamic("HasCredential")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      IsArchived.foreach(__v => __obj.updateDynamic("IsArchived")(__v.asInstanceOf[js.Any]))
      LastModifiedBy.foreach(__v => __obj.updateDynamic("LastModifiedBy")(__v.asInstanceOf[js.Any]))
      LastModifiedDate.foreach(__v => __obj.updateDynamic("LastModifiedDate")(__v.asInstanceOf[js.Any]))
      Version.foreach(__v => __obj.updateDynamic("Version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BaiduChannelResponse]
    }
  }

  /** Specifies the settings for a one-time message that's sent directly to an endpoint through the Baidu (Baidu Cloud Push) channel.
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
    @inline
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
      val __obj = js.Dynamic.literal()
      Action.foreach(__v => __obj.updateDynamic("Action")(__v.asInstanceOf[js.Any]))
      Body.foreach(__v => __obj.updateDynamic("Body")(__v.asInstanceOf[js.Any]))
      Data.foreach(__v => __obj.updateDynamic("Data")(__v.asInstanceOf[js.Any]))
      IconReference.foreach(__v => __obj.updateDynamic("IconReference")(__v.asInstanceOf[js.Any]))
      ImageIconUrl.foreach(__v => __obj.updateDynamic("ImageIconUrl")(__v.asInstanceOf[js.Any]))
      ImageUrl.foreach(__v => __obj.updateDynamic("ImageUrl")(__v.asInstanceOf[js.Any]))
      RawContent.foreach(__v => __obj.updateDynamic("RawContent")(__v.asInstanceOf[js.Any]))
      SilentPush.foreach(__v => __obj.updateDynamic("SilentPush")(__v.asInstanceOf[js.Any]))
      SmallImageIconUrl.foreach(__v => __obj.updateDynamic("SmallImageIconUrl")(__v.asInstanceOf[js.Any]))
      Sound.foreach(__v => __obj.updateDynamic("Sound")(__v.asInstanceOf[js.Any]))
      Substitutions.foreach(__v => __obj.updateDynamic("Substitutions")(__v.asInstanceOf[js.Any]))
      TimeToLive.foreach(__v => __obj.updateDynamic("TimeToLive")(__v.asInstanceOf[js.Any]))
      Title.foreach(__v => __obj.updateDynamic("Title")(__v.asInstanceOf[js.Any]))
      Url.foreach(__v => __obj.updateDynamic("Url")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BaiduMessage]
    }
  }

  /** Provides the results of a query that retrieved the data for a standard metric that applies to an application, campaign, or journey.
    */
  @js.native
  trait BaseKpiResult extends js.Object {
    var Rows: ListOfResultRow
  }

  object BaseKpiResult {
    @inline
    def apply(
        Rows: ListOfResultRow
    ): BaseKpiResult = {
      val __obj = js.Dynamic.literal(
        "Rows" -> Rows.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[BaseKpiResult]
    }
  }

  /** Specifies the contents of a message that's sent through a custom channel to recipients of a campaign.
    */
  @js.native
  trait CampaignCustomMessage extends js.Object {
    var Data: js.UndefOr[__string]
  }

  object CampaignCustomMessage {
    @inline
    def apply(
        Data: js.UndefOr[__string] = js.undefined
    ): CampaignCustomMessage = {
      val __obj = js.Dynamic.literal()
      Data.foreach(__v => __obj.updateDynamic("Data")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CampaignCustomMessage]
    }
  }

  /** Provides the results of a query that retrieved the data for a standard metric that applies to a campaign, and provides information about that query.
    */
  @js.native
  trait CampaignDateRangeKpiResponse extends js.Object {
    var ApplicationId: __string
    var CampaignId: __string
    var EndTime: __timestampIso8601
    var KpiName: __string
    var KpiResult: BaseKpiResult
    var StartTime: __timestampIso8601
    var NextToken: js.UndefOr[__string]
  }

  object CampaignDateRangeKpiResponse {
    @inline
    def apply(
        ApplicationId: __string,
        CampaignId: __string,
        EndTime: __timestampIso8601,
        KpiName: __string,
        KpiResult: BaseKpiResult,
        StartTime: __timestampIso8601,
        NextToken: js.UndefOr[__string] = js.undefined
    ): CampaignDateRangeKpiResponse = {
      val __obj = js.Dynamic.literal(
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any],
        "CampaignId" -> CampaignId.asInstanceOf[js.Any],
        "EndTime" -> EndTime.asInstanceOf[js.Any],
        "KpiName" -> KpiName.asInstanceOf[js.Any],
        "KpiResult" -> KpiResult.asInstanceOf[js.Any],
        "StartTime" -> StartTime.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CampaignDateRangeKpiResponse]
    }
  }

  /** Specifies the content and "From" address for an email message that's sent to recipients of a campaign.
    */
  @js.native
  trait CampaignEmailMessage extends js.Object {
    var Body: js.UndefOr[__string]
    var FromAddress: js.UndefOr[__string]
    var HtmlBody: js.UndefOr[__string]
    var Title: js.UndefOr[__string]
  }

  object CampaignEmailMessage {
    @inline
    def apply(
        Body: js.UndefOr[__string] = js.undefined,
        FromAddress: js.UndefOr[__string] = js.undefined,
        HtmlBody: js.UndefOr[__string] = js.undefined,
        Title: js.UndefOr[__string] = js.undefined
    ): CampaignEmailMessage = {
      val __obj = js.Dynamic.literal()
      Body.foreach(__v => __obj.updateDynamic("Body")(__v.asInstanceOf[js.Any]))
      FromAddress.foreach(__v => __obj.updateDynamic("FromAddress")(__v.asInstanceOf[js.Any]))
      HtmlBody.foreach(__v => __obj.updateDynamic("HtmlBody")(__v.asInstanceOf[js.Any]))
      Title.foreach(__v => __obj.updateDynamic("Title")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CampaignEmailMessage]
    }
  }

  /** Specifies the settings for events that cause a campaign to be sent.
    */
  @js.native
  trait CampaignEventFilter extends js.Object {
    var Dimensions: EventDimensions
    var FilterType: FilterType
  }

  object CampaignEventFilter {
    @inline
    def apply(
        Dimensions: EventDimensions,
        FilterType: FilterType
    ): CampaignEventFilter = {
      val __obj = js.Dynamic.literal(
        "Dimensions" -> Dimensions.asInstanceOf[js.Any],
        "FilterType" -> FilterType.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CampaignEventFilter]
    }
  }

  /** Specifies settings for invoking an AWS Lambda function that customizes a segment for a campaign.
    */
  @js.native
  trait CampaignHook extends js.Object {
    var LambdaFunctionName: js.UndefOr[__string]
    var Mode: js.UndefOr[Mode]
    var WebUrl: js.UndefOr[__string]
  }

  object CampaignHook {
    @inline
    def apply(
        LambdaFunctionName: js.UndefOr[__string] = js.undefined,
        Mode: js.UndefOr[Mode] = js.undefined,
        WebUrl: js.UndefOr[__string] = js.undefined
    ): CampaignHook = {
      val __obj = js.Dynamic.literal()
      LambdaFunctionName.foreach(__v => __obj.updateDynamic("LambdaFunctionName")(__v.asInstanceOf[js.Any]))
      Mode.foreach(__v => __obj.updateDynamic("Mode")(__v.asInstanceOf[js.Any]))
      WebUrl.foreach(__v => __obj.updateDynamic("WebUrl")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CampaignHook]
    }
  }

  /** In-app message configuration.
    */
  @js.native
  trait CampaignInAppMessage extends js.Object {
    var Body: js.UndefOr[__string]
    var Content: js.UndefOr[ListOfInAppMessageContent]
    var CustomConfig: js.UndefOr[MapOf__string]
    var Layout: js.UndefOr[Layout]
  }

  object CampaignInAppMessage {
    @inline
    def apply(
        Body: js.UndefOr[__string] = js.undefined,
        Content: js.UndefOr[ListOfInAppMessageContent] = js.undefined,
        CustomConfig: js.UndefOr[MapOf__string] = js.undefined,
        Layout: js.UndefOr[Layout] = js.undefined
    ): CampaignInAppMessage = {
      val __obj = js.Dynamic.literal()
      Body.foreach(__v => __obj.updateDynamic("Body")(__v.asInstanceOf[js.Any]))
      Content.foreach(__v => __obj.updateDynamic("Content")(__v.asInstanceOf[js.Any]))
      CustomConfig.foreach(__v => __obj.updateDynamic("CustomConfig")(__v.asInstanceOf[js.Any]))
      Layout.foreach(__v => __obj.updateDynamic("Layout")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CampaignInAppMessage]
    }
  }

  /** For a campaign, specifies limits on the messages that the campaign can send. For an application, specifies the default limits for messages that campaigns in the application can send.
    */
  @js.native
  trait CampaignLimits extends js.Object {
    var Daily: js.UndefOr[__integer]
    var MaximumDuration: js.UndefOr[__integer]
    var MessagesPerSecond: js.UndefOr[__integer]
    var Session: js.UndefOr[__integer]
    var Total: js.UndefOr[__integer]
  }

  object CampaignLimits {
    @inline
    def apply(
        Daily: js.UndefOr[__integer] = js.undefined,
        MaximumDuration: js.UndefOr[__integer] = js.undefined,
        MessagesPerSecond: js.UndefOr[__integer] = js.undefined,
        Session: js.UndefOr[__integer] = js.undefined,
        Total: js.UndefOr[__integer] = js.undefined
    ): CampaignLimits = {
      val __obj = js.Dynamic.literal()
      Daily.foreach(__v => __obj.updateDynamic("Daily")(__v.asInstanceOf[js.Any]))
      MaximumDuration.foreach(__v => __obj.updateDynamic("MaximumDuration")(__v.asInstanceOf[js.Any]))
      MessagesPerSecond.foreach(__v => __obj.updateDynamic("MessagesPerSecond")(__v.asInstanceOf[js.Any]))
      Session.foreach(__v => __obj.updateDynamic("Session")(__v.asInstanceOf[js.Any]))
      Total.foreach(__v => __obj.updateDynamic("Total")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CampaignLimits]
    }
  }

  /** Provides information about the status, configuration, and other settings for a campaign.
    */
  @js.native
  trait CampaignResponse extends js.Object {
    var ApplicationId: __string
    var Arn: __string
    var CreationDate: __string
    var Id: __string
    var LastModifiedDate: __string
    var SegmentId: __string
    var SegmentVersion: __integer
    var AdditionalTreatments: js.UndefOr[ListOfTreatmentResource]
    var CustomDeliveryConfiguration: js.UndefOr[CustomDeliveryConfiguration]
    var DefaultState: js.UndefOr[CampaignState]
    var Description: js.UndefOr[__string]
    var HoldoutPercent: js.UndefOr[__integer]
    var Hook: js.UndefOr[CampaignHook]
    var IsPaused: js.UndefOr[__boolean]
    var Limits: js.UndefOr[CampaignLimits]
    var MessageConfiguration: js.UndefOr[MessageConfiguration]
    var Name: js.UndefOr[__string]
    var Priority: js.UndefOr[__integer]
    var Schedule: js.UndefOr[Schedule]
    var State: js.UndefOr[CampaignState]
    var TemplateConfiguration: js.UndefOr[TemplateConfiguration]
    var TreatmentDescription: js.UndefOr[__string]
    var TreatmentName: js.UndefOr[__string]
    var Version: js.UndefOr[__integer]
    var tags: js.UndefOr[MapOf__string]
  }

  object CampaignResponse {
    @inline
    def apply(
        ApplicationId: __string,
        Arn: __string,
        CreationDate: __string,
        Id: __string,
        LastModifiedDate: __string,
        SegmentId: __string,
        SegmentVersion: __integer,
        AdditionalTreatments: js.UndefOr[ListOfTreatmentResource] = js.undefined,
        CustomDeliveryConfiguration: js.UndefOr[CustomDeliveryConfiguration] = js.undefined,
        DefaultState: js.UndefOr[CampaignState] = js.undefined,
        Description: js.UndefOr[__string] = js.undefined,
        HoldoutPercent: js.UndefOr[__integer] = js.undefined,
        Hook: js.UndefOr[CampaignHook] = js.undefined,
        IsPaused: js.UndefOr[__boolean] = js.undefined,
        Limits: js.UndefOr[CampaignLimits] = js.undefined,
        MessageConfiguration: js.UndefOr[MessageConfiguration] = js.undefined,
        Name: js.UndefOr[__string] = js.undefined,
        Priority: js.UndefOr[__integer] = js.undefined,
        Schedule: js.UndefOr[Schedule] = js.undefined,
        State: js.UndefOr[CampaignState] = js.undefined,
        TemplateConfiguration: js.UndefOr[TemplateConfiguration] = js.undefined,
        TreatmentDescription: js.UndefOr[__string] = js.undefined,
        TreatmentName: js.UndefOr[__string] = js.undefined,
        Version: js.UndefOr[__integer] = js.undefined,
        tags: js.UndefOr[MapOf__string] = js.undefined
    ): CampaignResponse = {
      val __obj = js.Dynamic.literal(
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any],
        "Arn" -> Arn.asInstanceOf[js.Any],
        "CreationDate" -> CreationDate.asInstanceOf[js.Any],
        "Id" -> Id.asInstanceOf[js.Any],
        "LastModifiedDate" -> LastModifiedDate.asInstanceOf[js.Any],
        "SegmentId" -> SegmentId.asInstanceOf[js.Any],
        "SegmentVersion" -> SegmentVersion.asInstanceOf[js.Any]
      )

      AdditionalTreatments.foreach(__v => __obj.updateDynamic("AdditionalTreatments")(__v.asInstanceOf[js.Any]))
      CustomDeliveryConfiguration.foreach(__v => __obj.updateDynamic("CustomDeliveryConfiguration")(__v.asInstanceOf[js.Any]))
      DefaultState.foreach(__v => __obj.updateDynamic("DefaultState")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      HoldoutPercent.foreach(__v => __obj.updateDynamic("HoldoutPercent")(__v.asInstanceOf[js.Any]))
      Hook.foreach(__v => __obj.updateDynamic("Hook")(__v.asInstanceOf[js.Any]))
      IsPaused.foreach(__v => __obj.updateDynamic("IsPaused")(__v.asInstanceOf[js.Any]))
      Limits.foreach(__v => __obj.updateDynamic("Limits")(__v.asInstanceOf[js.Any]))
      MessageConfiguration.foreach(__v => __obj.updateDynamic("MessageConfiguration")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Priority.foreach(__v => __obj.updateDynamic("Priority")(__v.asInstanceOf[js.Any]))
      Schedule.foreach(__v => __obj.updateDynamic("Schedule")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      TemplateConfiguration.foreach(__v => __obj.updateDynamic("TemplateConfiguration")(__v.asInstanceOf[js.Any]))
      TreatmentDescription.foreach(__v => __obj.updateDynamic("TreatmentDescription")(__v.asInstanceOf[js.Any]))
      TreatmentName.foreach(__v => __obj.updateDynamic("TreatmentName")(__v.asInstanceOf[js.Any]))
      Version.foreach(__v => __obj.updateDynamic("Version")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CampaignResponse]
    }
  }

  /** Specifies the content and settings for an SMS message that's sent to recipients of a campaign.
    */
  @js.native
  trait CampaignSmsMessage extends js.Object {
    var Body: js.UndefOr[__string]
    var EntityId: js.UndefOr[__string]
    var MessageType: js.UndefOr[MessageType]
    var OriginationNumber: js.UndefOr[__string]
    var SenderId: js.UndefOr[__string]
    var TemplateId: js.UndefOr[__string]
  }

  object CampaignSmsMessage {
    @inline
    def apply(
        Body: js.UndefOr[__string] = js.undefined,
        EntityId: js.UndefOr[__string] = js.undefined,
        MessageType: js.UndefOr[MessageType] = js.undefined,
        OriginationNumber: js.UndefOr[__string] = js.undefined,
        SenderId: js.UndefOr[__string] = js.undefined,
        TemplateId: js.UndefOr[__string] = js.undefined
    ): CampaignSmsMessage = {
      val __obj = js.Dynamic.literal()
      Body.foreach(__v => __obj.updateDynamic("Body")(__v.asInstanceOf[js.Any]))
      EntityId.foreach(__v => __obj.updateDynamic("EntityId")(__v.asInstanceOf[js.Any]))
      MessageType.foreach(__v => __obj.updateDynamic("MessageType")(__v.asInstanceOf[js.Any]))
      OriginationNumber.foreach(__v => __obj.updateDynamic("OriginationNumber")(__v.asInstanceOf[js.Any]))
      SenderId.foreach(__v => __obj.updateDynamic("SenderId")(__v.asInstanceOf[js.Any]))
      TemplateId.foreach(__v => __obj.updateDynamic("TemplateId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CampaignSmsMessage]
    }
  }

  /** Provides information about the status of a campaign.
    */
  @js.native
  trait CampaignState extends js.Object {
    var CampaignStatus: js.UndefOr[CampaignStatus]
  }

  object CampaignState {
    @inline
    def apply(
        CampaignStatus: js.UndefOr[CampaignStatus] = js.undefined
    ): CampaignState = {
      val __obj = js.Dynamic.literal()
      CampaignStatus.foreach(__v => __obj.updateDynamic("CampaignStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CampaignState]
    }
  }

  /** Provides information about the configuration and other settings for all the campaigns that are associated with an application.
    */
  @js.native
  trait CampaignsResponse extends js.Object {
    var Item: ListOfCampaignResponse
    var NextToken: js.UndefOr[__string]
  }

  object CampaignsResponse {
    @inline
    def apply(
        Item: ListOfCampaignResponse,
        NextToken: js.UndefOr[__string] = js.undefined
    ): CampaignsResponse = {
      val __obj = js.Dynamic.literal(
        "Item" -> Item.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CampaignsResponse]
    }
  }

  /** Provides information about the general settings and status of a channel for an application.
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
    @inline
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
      val __obj = js.Dynamic.literal()
      ApplicationId.foreach(__v => __obj.updateDynamic("ApplicationId")(__v.asInstanceOf[js.Any]))
      CreationDate.foreach(__v => __obj.updateDynamic("CreationDate")(__v.asInstanceOf[js.Any]))
      Enabled.foreach(__v => __obj.updateDynamic("Enabled")(__v.asInstanceOf[js.Any]))
      HasCredential.foreach(__v => __obj.updateDynamic("HasCredential")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      IsArchived.foreach(__v => __obj.updateDynamic("IsArchived")(__v.asInstanceOf[js.Any]))
      LastModifiedBy.foreach(__v => __obj.updateDynamic("LastModifiedBy")(__v.asInstanceOf[js.Any]))
      LastModifiedDate.foreach(__v => __obj.updateDynamic("LastModifiedDate")(__v.asInstanceOf[js.Any]))
      Version.foreach(__v => __obj.updateDynamic("Version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ChannelResponse]
    }
  }

  /** Provides information about the general settings and status of all channels for an application, including channels that aren't enabled for the application.
    */
  @js.native
  trait ChannelsResponse extends js.Object {
    var Channels: MapOfChannelResponse
  }

  object ChannelsResponse {
    @inline
    def apply(
        Channels: MapOfChannelResponse
    ): ChannelsResponse = {
      val __obj = js.Dynamic.literal(
        "Channels" -> Channels.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ChannelsResponse]
    }
  }

  /** The time when journey will stop sending messages.
    */
  @js.native
  trait ClosedDays extends js.Object {
    var CUSTOM: js.UndefOr[ListOfClosedDaysRules]
    var EMAIL: js.UndefOr[ListOfClosedDaysRules]
    var PUSH: js.UndefOr[ListOfClosedDaysRules]
    var SMS: js.UndefOr[ListOfClosedDaysRules]
    var VOICE: js.UndefOr[ListOfClosedDaysRules]
  }

  object ClosedDays {
    @inline
    def apply(
        CUSTOM: js.UndefOr[ListOfClosedDaysRules] = js.undefined,
        EMAIL: js.UndefOr[ListOfClosedDaysRules] = js.undefined,
        PUSH: js.UndefOr[ListOfClosedDaysRules] = js.undefined,
        SMS: js.UndefOr[ListOfClosedDaysRules] = js.undefined,
        VOICE: js.UndefOr[ListOfClosedDaysRules] = js.undefined
    ): ClosedDays = {
      val __obj = js.Dynamic.literal()
      CUSTOM.foreach(__v => __obj.updateDynamic("CUSTOM")(__v.asInstanceOf[js.Any]))
      EMAIL.foreach(__v => __obj.updateDynamic("EMAIL")(__v.asInstanceOf[js.Any]))
      PUSH.foreach(__v => __obj.updateDynamic("PUSH")(__v.asInstanceOf[js.Any]))
      SMS.foreach(__v => __obj.updateDynamic("SMS")(__v.asInstanceOf[js.Any]))
      VOICE.foreach(__v => __obj.updateDynamic("VOICE")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ClosedDays]
    }
  }

  /** Closed Days Rule. Part of Journey sending schedule.
    */
  @js.native
  trait ClosedDaysRule extends js.Object {
    var EndDateTime: js.UndefOr[__string]
    var Name: js.UndefOr[__string]
    var StartDateTime: js.UndefOr[__string]
  }

  object ClosedDaysRule {
    @inline
    def apply(
        EndDateTime: js.UndefOr[__string] = js.undefined,
        Name: js.UndefOr[__string] = js.undefined,
        StartDateTime: js.UndefOr[__string] = js.undefined
    ): ClosedDaysRule = {
      val __obj = js.Dynamic.literal()
      EndDateTime.foreach(__v => __obj.updateDynamic("EndDateTime")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      StartDateTime.foreach(__v => __obj.updateDynamic("StartDateTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ClosedDaysRule]
    }
  }

  /** Specifies the conditions to evaluate for an activity in a journey, and how to evaluate those conditions.
    */
  @js.native
  trait Condition extends js.Object {
    var Conditions: js.UndefOr[ListOfSimpleCondition]
    var Operator: js.UndefOr[Operator]
  }

  object Condition {
    @inline
    def apply(
        Conditions: js.UndefOr[ListOfSimpleCondition] = js.undefined,
        Operator: js.UndefOr[Operator] = js.undefined
    ): Condition = {
      val __obj = js.Dynamic.literal()
      Conditions.foreach(__v => __obj.updateDynamic("Conditions")(__v.asInstanceOf[js.Any]))
      Operator.foreach(__v => __obj.updateDynamic("Operator")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Condition]
    }
  }

  /** Specifies the settings for a yes/no split activity in a journey. This type of activity sends participants down one of two paths in a journey, based on conditions that you specify.
    *
    * '''Note:'''To create yes/no split activities that send participants down different paths based on push notification events (such as Open or Received events), your mobile app has to specify the User ID and Endpoint ID values. For more information, see [[https://docs.aws.amazon.com/pinpoint/latest/developerguide/integrate.html|Integrating Amazon Pinpoint with your application]] in the <i>Amazon Pinpoint Developer Guide</i>.
    */
  @js.native
  trait ConditionalSplitActivity extends js.Object {
    var Condition: js.UndefOr[Condition]
    var EvaluationWaitTime: js.UndefOr[WaitTime]
    var FalseActivity: js.UndefOr[__string]
    var TrueActivity: js.UndefOr[__string]
  }

  object ConditionalSplitActivity {
    @inline
    def apply(
        Condition: js.UndefOr[Condition] = js.undefined,
        EvaluationWaitTime: js.UndefOr[WaitTime] = js.undefined,
        FalseActivity: js.UndefOr[__string] = js.undefined,
        TrueActivity: js.UndefOr[__string] = js.undefined
    ): ConditionalSplitActivity = {
      val __obj = js.Dynamic.literal()
      Condition.foreach(__v => __obj.updateDynamic("Condition")(__v.asInstanceOf[js.Any]))
      EvaluationWaitTime.foreach(__v => __obj.updateDynamic("EvaluationWaitTime")(__v.asInstanceOf[js.Any]))
      FalseActivity.foreach(__v => __obj.updateDynamic("FalseActivity")(__v.asInstanceOf[js.Any]))
      TrueActivity.foreach(__v => __obj.updateDynamic("TrueActivity")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ConditionalSplitActivity]
    }
  }

  @js.native
  trait ContactCenterActivity extends js.Object {
    var NextActivity: js.UndefOr[__string]
  }

  object ContactCenterActivity {
    @inline
    def apply(
        NextActivity: js.UndefOr[__string] = js.undefined
    ): ContactCenterActivity = {
      val __obj = js.Dynamic.literal()
      NextActivity.foreach(__v => __obj.updateDynamic("NextActivity")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ContactCenterActivity]
    }
  }

  @js.native
  trait CreateAppRequest extends js.Object {
    var CreateApplicationRequest: CreateApplicationRequest
  }

  object CreateAppRequest {
    @inline
    def apply(
        CreateApplicationRequest: CreateApplicationRequest
    ): CreateAppRequest = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        ApplicationResponse: ApplicationResponse
    ): CreateAppResponse = {
      val __obj = js.Dynamic.literal(
        "ApplicationResponse" -> ApplicationResponse.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateAppResponse]
    }
  }

  /** Specifies the display name of an application and the tags to associate with the application.
    */
  @js.native
  trait CreateApplicationRequest extends js.Object {
    var Name: __string
    var tags: js.UndefOr[MapOf__string]
  }

  object CreateApplicationRequest {
    @inline
    def apply(
        Name: __string,
        tags: js.UndefOr[MapOf__string] = js.undefined
    ): CreateApplicationRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateApplicationRequest]
    }
  }

  @js.native
  trait CreateCampaignRequest extends js.Object {
    var ApplicationId: __string
    var WriteCampaignRequest: WriteCampaignRequest
  }

  object CreateCampaignRequest {
    @inline
    def apply(
        ApplicationId: __string,
        WriteCampaignRequest: WriteCampaignRequest
    ): CreateCampaignRequest = {
      val __obj = js.Dynamic.literal(
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any],
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
    @inline
    def apply(
        CampaignResponse: CampaignResponse
    ): CreateCampaignResponse = {
      val __obj = js.Dynamic.literal(
        "CampaignResponse" -> CampaignResponse.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateCampaignResponse]
    }
  }

  @js.native
  trait CreateEmailTemplateRequest extends js.Object {
    var EmailTemplateRequest: EmailTemplateRequest
    var TemplateName: __string
  }

  object CreateEmailTemplateRequest {
    @inline
    def apply(
        EmailTemplateRequest: EmailTemplateRequest,
        TemplateName: __string
    ): CreateEmailTemplateRequest = {
      val __obj = js.Dynamic.literal(
        "EmailTemplateRequest" -> EmailTemplateRequest.asInstanceOf[js.Any],
        "TemplateName" -> TemplateName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateEmailTemplateRequest]
    }
  }

  @js.native
  trait CreateEmailTemplateResponse extends js.Object {
    var CreateTemplateMessageBody: CreateTemplateMessageBody
  }

  object CreateEmailTemplateResponse {
    @inline
    def apply(
        CreateTemplateMessageBody: CreateTemplateMessageBody
    ): CreateEmailTemplateResponse = {
      val __obj = js.Dynamic.literal(
        "CreateTemplateMessageBody" -> CreateTemplateMessageBody.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateEmailTemplateResponse]
    }
  }

  @js.native
  trait CreateExportJobRequest extends js.Object {
    var ApplicationId: __string
    var ExportJobRequest: ExportJobRequest
  }

  object CreateExportJobRequest {
    @inline
    def apply(
        ApplicationId: __string,
        ExportJobRequest: ExportJobRequest
    ): CreateExportJobRequest = {
      val __obj = js.Dynamic.literal(
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any],
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
    @inline
    def apply(
        ExportJobResponse: ExportJobResponse
    ): CreateExportJobResponse = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        ApplicationId: __string,
        ImportJobRequest: ImportJobRequest
    ): CreateImportJobRequest = {
      val __obj = js.Dynamic.literal(
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any],
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
    @inline
    def apply(
        ImportJobResponse: ImportJobResponse
    ): CreateImportJobResponse = {
      val __obj = js.Dynamic.literal(
        "ImportJobResponse" -> ImportJobResponse.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateImportJobResponse]
    }
  }

  @js.native
  trait CreateInAppTemplateRequest extends js.Object {
    var InAppTemplateRequest: InAppTemplateRequest
    var TemplateName: __string
  }

  object CreateInAppTemplateRequest {
    @inline
    def apply(
        InAppTemplateRequest: InAppTemplateRequest,
        TemplateName: __string
    ): CreateInAppTemplateRequest = {
      val __obj = js.Dynamic.literal(
        "InAppTemplateRequest" -> InAppTemplateRequest.asInstanceOf[js.Any],
        "TemplateName" -> TemplateName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateInAppTemplateRequest]
    }
  }

  @js.native
  trait CreateInAppTemplateResponse extends js.Object {
    var TemplateCreateMessageBody: TemplateCreateMessageBody
  }

  object CreateInAppTemplateResponse {
    @inline
    def apply(
        TemplateCreateMessageBody: TemplateCreateMessageBody
    ): CreateInAppTemplateResponse = {
      val __obj = js.Dynamic.literal(
        "TemplateCreateMessageBody" -> TemplateCreateMessageBody.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateInAppTemplateResponse]
    }
  }

  @js.native
  trait CreateJourneyRequest extends js.Object {
    var ApplicationId: __string
    var WriteJourneyRequest: WriteJourneyRequest
  }

  object CreateJourneyRequest {
    @inline
    def apply(
        ApplicationId: __string,
        WriteJourneyRequest: WriteJourneyRequest
    ): CreateJourneyRequest = {
      val __obj = js.Dynamic.literal(
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any],
        "WriteJourneyRequest" -> WriteJourneyRequest.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateJourneyRequest]
    }
  }

  @js.native
  trait CreateJourneyResponse extends js.Object {
    var JourneyResponse: JourneyResponse
  }

  object CreateJourneyResponse {
    @inline
    def apply(
        JourneyResponse: JourneyResponse
    ): CreateJourneyResponse = {
      val __obj = js.Dynamic.literal(
        "JourneyResponse" -> JourneyResponse.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateJourneyResponse]
    }
  }

  @js.native
  trait CreatePushTemplateRequest extends js.Object {
    var PushNotificationTemplateRequest: PushNotificationTemplateRequest
    var TemplateName: __string
  }

  object CreatePushTemplateRequest {
    @inline
    def apply(
        PushNotificationTemplateRequest: PushNotificationTemplateRequest,
        TemplateName: __string
    ): CreatePushTemplateRequest = {
      val __obj = js.Dynamic.literal(
        "PushNotificationTemplateRequest" -> PushNotificationTemplateRequest.asInstanceOf[js.Any],
        "TemplateName" -> TemplateName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreatePushTemplateRequest]
    }
  }

  @js.native
  trait CreatePushTemplateResponse extends js.Object {
    var CreateTemplateMessageBody: CreateTemplateMessageBody
  }

  object CreatePushTemplateResponse {
    @inline
    def apply(
        CreateTemplateMessageBody: CreateTemplateMessageBody
    ): CreatePushTemplateResponse = {
      val __obj = js.Dynamic.literal(
        "CreateTemplateMessageBody" -> CreateTemplateMessageBody.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreatePushTemplateResponse]
    }
  }

  /** Specifies Amazon Pinpoint configuration settings for retrieving and processing recommendation data from a recommender model.
    */
  @js.native
  trait CreateRecommenderConfiguration extends js.Object {
    var RecommendationProviderRoleArn: __string
    var RecommendationProviderUri: __string
    var Attributes: js.UndefOr[MapOf__string]
    var Description: js.UndefOr[__string]
    var Name: js.UndefOr[__string]
    var RecommendationProviderIdType: js.UndefOr[__string]
    var RecommendationTransformerUri: js.UndefOr[__string]
    var RecommendationsDisplayName: js.UndefOr[__string]
    var RecommendationsPerMessage: js.UndefOr[__integer]
  }

  object CreateRecommenderConfiguration {
    @inline
    def apply(
        RecommendationProviderRoleArn: __string,
        RecommendationProviderUri: __string,
        Attributes: js.UndefOr[MapOf__string] = js.undefined,
        Description: js.UndefOr[__string] = js.undefined,
        Name: js.UndefOr[__string] = js.undefined,
        RecommendationProviderIdType: js.UndefOr[__string] = js.undefined,
        RecommendationTransformerUri: js.UndefOr[__string] = js.undefined,
        RecommendationsDisplayName: js.UndefOr[__string] = js.undefined,
        RecommendationsPerMessage: js.UndefOr[__integer] = js.undefined
    ): CreateRecommenderConfiguration = {
      val __obj = js.Dynamic.literal(
        "RecommendationProviderRoleArn" -> RecommendationProviderRoleArn.asInstanceOf[js.Any],
        "RecommendationProviderUri" -> RecommendationProviderUri.asInstanceOf[js.Any]
      )

      Attributes.foreach(__v => __obj.updateDynamic("Attributes")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      RecommendationProviderIdType.foreach(__v => __obj.updateDynamic("RecommendationProviderIdType")(__v.asInstanceOf[js.Any]))
      RecommendationTransformerUri.foreach(__v => __obj.updateDynamic("RecommendationTransformerUri")(__v.asInstanceOf[js.Any]))
      RecommendationsDisplayName.foreach(__v => __obj.updateDynamic("RecommendationsDisplayName")(__v.asInstanceOf[js.Any]))
      RecommendationsPerMessage.foreach(__v => __obj.updateDynamic("RecommendationsPerMessage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateRecommenderConfiguration]
    }
  }

  @js.native
  trait CreateRecommenderConfigurationRequest extends js.Object {
    var CreateRecommenderConfiguration: CreateRecommenderConfiguration
  }

  object CreateRecommenderConfigurationRequest {
    @inline
    def apply(
        CreateRecommenderConfiguration: CreateRecommenderConfiguration
    ): CreateRecommenderConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "CreateRecommenderConfiguration" -> CreateRecommenderConfiguration.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateRecommenderConfigurationRequest]
    }
  }

  @js.native
  trait CreateRecommenderConfigurationResponse extends js.Object {
    var RecommenderConfigurationResponse: RecommenderConfigurationResponse
  }

  object CreateRecommenderConfigurationResponse {
    @inline
    def apply(
        RecommenderConfigurationResponse: RecommenderConfigurationResponse
    ): CreateRecommenderConfigurationResponse = {
      val __obj = js.Dynamic.literal(
        "RecommenderConfigurationResponse" -> RecommenderConfigurationResponse.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateRecommenderConfigurationResponse]
    }
  }

  @js.native
  trait CreateSegmentRequest extends js.Object {
    var ApplicationId: __string
    var WriteSegmentRequest: WriteSegmentRequest
  }

  object CreateSegmentRequest {
    @inline
    def apply(
        ApplicationId: __string,
        WriteSegmentRequest: WriteSegmentRequest
    ): CreateSegmentRequest = {
      val __obj = js.Dynamic.literal(
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any],
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
    @inline
    def apply(
        SegmentResponse: SegmentResponse
    ): CreateSegmentResponse = {
      val __obj = js.Dynamic.literal(
        "SegmentResponse" -> SegmentResponse.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateSegmentResponse]
    }
  }

  @js.native
  trait CreateSmsTemplateRequest extends js.Object {
    var SMSTemplateRequest: SMSTemplateRequest
    var TemplateName: __string
  }

  object CreateSmsTemplateRequest {
    @inline
    def apply(
        SMSTemplateRequest: SMSTemplateRequest,
        TemplateName: __string
    ): CreateSmsTemplateRequest = {
      val __obj = js.Dynamic.literal(
        "SMSTemplateRequest" -> SMSTemplateRequest.asInstanceOf[js.Any],
        "TemplateName" -> TemplateName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateSmsTemplateRequest]
    }
  }

  @js.native
  trait CreateSmsTemplateResponse extends js.Object {
    var CreateTemplateMessageBody: CreateTemplateMessageBody
  }

  object CreateSmsTemplateResponse {
    @inline
    def apply(
        CreateTemplateMessageBody: CreateTemplateMessageBody
    ): CreateSmsTemplateResponse = {
      val __obj = js.Dynamic.literal(
        "CreateTemplateMessageBody" -> CreateTemplateMessageBody.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateSmsTemplateResponse]
    }
  }

  /** Provides information about a request to create a message template.
    */
  @js.native
  trait CreateTemplateMessageBody extends js.Object {
    var Arn: js.UndefOr[__string]
    var Message: js.UndefOr[__string]
    var RequestID: js.UndefOr[__string]
  }

  object CreateTemplateMessageBody {
    @inline
    def apply(
        Arn: js.UndefOr[__string] = js.undefined,
        Message: js.UndefOr[__string] = js.undefined,
        RequestID: js.UndefOr[__string] = js.undefined
    ): CreateTemplateMessageBody = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      Message.foreach(__v => __obj.updateDynamic("Message")(__v.asInstanceOf[js.Any]))
      RequestID.foreach(__v => __obj.updateDynamic("RequestID")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateTemplateMessageBody]
    }
  }

  @js.native
  trait CreateVoiceTemplateRequest extends js.Object {
    var TemplateName: __string
    var VoiceTemplateRequest: VoiceTemplateRequest
  }

  object CreateVoiceTemplateRequest {
    @inline
    def apply(
        TemplateName: __string,
        VoiceTemplateRequest: VoiceTemplateRequest
    ): CreateVoiceTemplateRequest = {
      val __obj = js.Dynamic.literal(
        "TemplateName" -> TemplateName.asInstanceOf[js.Any],
        "VoiceTemplateRequest" -> VoiceTemplateRequest.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateVoiceTemplateRequest]
    }
  }

  @js.native
  trait CreateVoiceTemplateResponse extends js.Object {
    var CreateTemplateMessageBody: CreateTemplateMessageBody
  }

  object CreateVoiceTemplateResponse {
    @inline
    def apply(
        CreateTemplateMessageBody: CreateTemplateMessageBody
    ): CreateVoiceTemplateResponse = {
      val __obj = js.Dynamic.literal(
        "CreateTemplateMessageBody" -> CreateTemplateMessageBody.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateVoiceTemplateResponse]
    }
  }

  /** Specifies the delivery configuration settings for sending a campaign or campaign treatment through a custom channel. This object is required if you use the CampaignCustomMessage object to define the message to send for the campaign or campaign treatment.
    */
  @js.native
  trait CustomDeliveryConfiguration extends js.Object {
    var DeliveryUri: __string
    var EndpointTypes: js.UndefOr[ListOf__EndpointTypesElement]
  }

  object CustomDeliveryConfiguration {
    @inline
    def apply(
        DeliveryUri: __string,
        EndpointTypes: js.UndefOr[ListOf__EndpointTypesElement] = js.undefined
    ): CustomDeliveryConfiguration = {
      val __obj = js.Dynamic.literal(
        "DeliveryUri" -> DeliveryUri.asInstanceOf[js.Any]
      )

      EndpointTypes.foreach(__v => __obj.updateDynamic("EndpointTypes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CustomDeliveryConfiguration]
    }
  }

  /** The settings for a custom message activity. This type of activity calls an AWS Lambda function or web hook that sends messages to participants.
    */
  @js.native
  trait CustomMessageActivity extends js.Object {
    var DeliveryUri: js.UndefOr[__string]
    var EndpointTypes: js.UndefOr[ListOf__EndpointTypesElement]
    var MessageConfig: js.UndefOr[JourneyCustomMessage]
    var NextActivity: js.UndefOr[__string]
    var TemplateName: js.UndefOr[__string]
    var TemplateVersion: js.UndefOr[__string]
  }

  object CustomMessageActivity {
    @inline
    def apply(
        DeliveryUri: js.UndefOr[__string] = js.undefined,
        EndpointTypes: js.UndefOr[ListOf__EndpointTypesElement] = js.undefined,
        MessageConfig: js.UndefOr[JourneyCustomMessage] = js.undefined,
        NextActivity: js.UndefOr[__string] = js.undefined,
        TemplateName: js.UndefOr[__string] = js.undefined,
        TemplateVersion: js.UndefOr[__string] = js.undefined
    ): CustomMessageActivity = {
      val __obj = js.Dynamic.literal()
      DeliveryUri.foreach(__v => __obj.updateDynamic("DeliveryUri")(__v.asInstanceOf[js.Any]))
      EndpointTypes.foreach(__v => __obj.updateDynamic("EndpointTypes")(__v.asInstanceOf[js.Any]))
      MessageConfig.foreach(__v => __obj.updateDynamic("MessageConfig")(__v.asInstanceOf[js.Any]))
      NextActivity.foreach(__v => __obj.updateDynamic("NextActivity")(__v.asInstanceOf[js.Any]))
      TemplateName.foreach(__v => __obj.updateDynamic("TemplateName")(__v.asInstanceOf[js.Any]))
      TemplateVersion.foreach(__v => __obj.updateDynamic("TemplateVersion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CustomMessageActivity]
    }
  }

  /** Default button configuration.
    */
  @js.native
  trait DefaultButtonConfiguration extends js.Object {
    var ButtonAction: ButtonAction
    var Text: __string
    var BackgroundColor: js.UndefOr[__string]
    var BorderRadius: js.UndefOr[__integer]
    var Link: js.UndefOr[__string]
    var TextColor: js.UndefOr[__string]
  }

  object DefaultButtonConfiguration {
    @inline
    def apply(
        ButtonAction: ButtonAction,
        Text: __string,
        BackgroundColor: js.UndefOr[__string] = js.undefined,
        BorderRadius: js.UndefOr[__integer] = js.undefined,
        Link: js.UndefOr[__string] = js.undefined,
        TextColor: js.UndefOr[__string] = js.undefined
    ): DefaultButtonConfiguration = {
      val __obj = js.Dynamic.literal(
        "ButtonAction" -> ButtonAction.asInstanceOf[js.Any],
        "Text" -> Text.asInstanceOf[js.Any]
      )

      BackgroundColor.foreach(__v => __obj.updateDynamic("BackgroundColor")(__v.asInstanceOf[js.Any]))
      BorderRadius.foreach(__v => __obj.updateDynamic("BorderRadius")(__v.asInstanceOf[js.Any]))
      Link.foreach(__v => __obj.updateDynamic("Link")(__v.asInstanceOf[js.Any]))
      TextColor.foreach(__v => __obj.updateDynamic("TextColor")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DefaultButtonConfiguration]
    }
  }

  /** Specifies the default message for all channels.
    */
  @js.native
  trait DefaultMessage extends js.Object {
    var Body: js.UndefOr[__string]
    var Substitutions: js.UndefOr[MapOfListOf__string]
  }

  object DefaultMessage {
    @inline
    def apply(
        Body: js.UndefOr[__string] = js.undefined,
        Substitutions: js.UndefOr[MapOfListOf__string] = js.undefined
    ): DefaultMessage = {
      val __obj = js.Dynamic.literal()
      Body.foreach(__v => __obj.updateDynamic("Body")(__v.asInstanceOf[js.Any]))
      Substitutions.foreach(__v => __obj.updateDynamic("Substitutions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DefaultMessage]
    }
  }

  /** Specifies the default settings and content for a push notification that's sent directly to an endpoint.
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
    @inline
    def apply(
        Action: js.UndefOr[Action] = js.undefined,
        Body: js.UndefOr[__string] = js.undefined,
        Data: js.UndefOr[MapOf__string] = js.undefined,
        SilentPush: js.UndefOr[__boolean] = js.undefined,
        Substitutions: js.UndefOr[MapOfListOf__string] = js.undefined,
        Title: js.UndefOr[__string] = js.undefined,
        Url: js.UndefOr[__string] = js.undefined
    ): DefaultPushNotificationMessage = {
      val __obj = js.Dynamic.literal()
      Action.foreach(__v => __obj.updateDynamic("Action")(__v.asInstanceOf[js.Any]))
      Body.foreach(__v => __obj.updateDynamic("Body")(__v.asInstanceOf[js.Any]))
      Data.foreach(__v => __obj.updateDynamic("Data")(__v.asInstanceOf[js.Any]))
      SilentPush.foreach(__v => __obj.updateDynamic("SilentPush")(__v.asInstanceOf[js.Any]))
      Substitutions.foreach(__v => __obj.updateDynamic("Substitutions")(__v.asInstanceOf[js.Any]))
      Title.foreach(__v => __obj.updateDynamic("Title")(__v.asInstanceOf[js.Any]))
      Url.foreach(__v => __obj.updateDynamic("Url")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DefaultPushNotificationMessage]
    }
  }

  /** Specifies the default settings and content for a message template that can be used in messages that are sent through a push notification channel.
    */
  @js.native
  trait DefaultPushNotificationTemplate extends js.Object {
    var Action: js.UndefOr[Action]
    var Body: js.UndefOr[__string]
    var Sound: js.UndefOr[__string]
    var Title: js.UndefOr[__string]
    var Url: js.UndefOr[__string]
  }

  object DefaultPushNotificationTemplate {
    @inline
    def apply(
        Action: js.UndefOr[Action] = js.undefined,
        Body: js.UndefOr[__string] = js.undefined,
        Sound: js.UndefOr[__string] = js.undefined,
        Title: js.UndefOr[__string] = js.undefined,
        Url: js.UndefOr[__string] = js.undefined
    ): DefaultPushNotificationTemplate = {
      val __obj = js.Dynamic.literal()
      Action.foreach(__v => __obj.updateDynamic("Action")(__v.asInstanceOf[js.Any]))
      Body.foreach(__v => __obj.updateDynamic("Body")(__v.asInstanceOf[js.Any]))
      Sound.foreach(__v => __obj.updateDynamic("Sound")(__v.asInstanceOf[js.Any]))
      Title.foreach(__v => __obj.updateDynamic("Title")(__v.asInstanceOf[js.Any]))
      Url.foreach(__v => __obj.updateDynamic("Url")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DefaultPushNotificationTemplate]
    }
  }

  @js.native
  trait DeleteAdmChannelRequest extends js.Object {
    var ApplicationId: __string
  }

  object DeleteAdmChannelRequest {
    @inline
    def apply(
        ApplicationId: __string
    ): DeleteAdmChannelRequest = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        ADMChannelResponse: ADMChannelResponse
    ): DeleteAdmChannelResponse = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        ApplicationId: __string
    ): DeleteApnsChannelRequest = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        APNSChannelResponse: APNSChannelResponse
    ): DeleteApnsChannelResponse = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        ApplicationId: __string
    ): DeleteApnsSandboxChannelRequest = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        APNSSandboxChannelResponse: APNSSandboxChannelResponse
    ): DeleteApnsSandboxChannelResponse = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        ApplicationId: __string
    ): DeleteApnsVoipChannelRequest = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        APNSVoipChannelResponse: APNSVoipChannelResponse
    ): DeleteApnsVoipChannelResponse = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        ApplicationId: __string
    ): DeleteApnsVoipSandboxChannelRequest = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        APNSVoipSandboxChannelResponse: APNSVoipSandboxChannelResponse
    ): DeleteApnsVoipSandboxChannelResponse = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        ApplicationId: __string
    ): DeleteAppRequest = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        ApplicationResponse: ApplicationResponse
    ): DeleteAppResponse = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        ApplicationId: __string
    ): DeleteBaiduChannelRequest = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        BaiduChannelResponse: BaiduChannelResponse
    ): DeleteBaiduChannelResponse = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        ApplicationId: __string,
        CampaignId: __string
    ): DeleteCampaignRequest = {
      val __obj = js.Dynamic.literal(
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any],
        "CampaignId" -> CampaignId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteCampaignRequest]
    }
  }

  @js.native
  trait DeleteCampaignResponse extends js.Object {
    var CampaignResponse: CampaignResponse
  }

  object DeleteCampaignResponse {
    @inline
    def apply(
        CampaignResponse: CampaignResponse
    ): DeleteCampaignResponse = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        ApplicationId: __string
    ): DeleteEmailChannelRequest = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        EmailChannelResponse: EmailChannelResponse
    ): DeleteEmailChannelResponse = {
      val __obj = js.Dynamic.literal(
        "EmailChannelResponse" -> EmailChannelResponse.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteEmailChannelResponse]
    }
  }

  @js.native
  trait DeleteEmailTemplateRequest extends js.Object {
    var TemplateName: __string
    var Version: js.UndefOr[__string]
  }

  object DeleteEmailTemplateRequest {
    @inline
    def apply(
        TemplateName: __string,
        Version: js.UndefOr[__string] = js.undefined
    ): DeleteEmailTemplateRequest = {
      val __obj = js.Dynamic.literal(
        "TemplateName" -> TemplateName.asInstanceOf[js.Any]
      )

      Version.foreach(__v => __obj.updateDynamic("Version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteEmailTemplateRequest]
    }
  }

  @js.native
  trait DeleteEmailTemplateResponse extends js.Object {
    var MessageBody: MessageBody
  }

  object DeleteEmailTemplateResponse {
    @inline
    def apply(
        MessageBody: MessageBody
    ): DeleteEmailTemplateResponse = {
      val __obj = js.Dynamic.literal(
        "MessageBody" -> MessageBody.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteEmailTemplateResponse]
    }
  }

  @js.native
  trait DeleteEndpointRequest extends js.Object {
    var ApplicationId: __string
    var EndpointId: __string
  }

  object DeleteEndpointRequest {
    @inline
    def apply(
        ApplicationId: __string,
        EndpointId: __string
    ): DeleteEndpointRequest = {
      val __obj = js.Dynamic.literal(
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any],
        "EndpointId" -> EndpointId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteEndpointRequest]
    }
  }

  @js.native
  trait DeleteEndpointResponse extends js.Object {
    var EndpointResponse: EndpointResponse
  }

  object DeleteEndpointResponse {
    @inline
    def apply(
        EndpointResponse: EndpointResponse
    ): DeleteEndpointResponse = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        ApplicationId: __string
    ): DeleteEventStreamRequest = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        EventStream: EventStream
    ): DeleteEventStreamResponse = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        ApplicationId: __string
    ): DeleteGcmChannelRequest = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        GCMChannelResponse: GCMChannelResponse
    ): DeleteGcmChannelResponse = {
      val __obj = js.Dynamic.literal(
        "GCMChannelResponse" -> GCMChannelResponse.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteGcmChannelResponse]
    }
  }

  @js.native
  trait DeleteInAppTemplateRequest extends js.Object {
    var TemplateName: __string
    var Version: js.UndefOr[__string]
  }

  object DeleteInAppTemplateRequest {
    @inline
    def apply(
        TemplateName: __string,
        Version: js.UndefOr[__string] = js.undefined
    ): DeleteInAppTemplateRequest = {
      val __obj = js.Dynamic.literal(
        "TemplateName" -> TemplateName.asInstanceOf[js.Any]
      )

      Version.foreach(__v => __obj.updateDynamic("Version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteInAppTemplateRequest]
    }
  }

  @js.native
  trait DeleteInAppTemplateResponse extends js.Object {
    var MessageBody: MessageBody
  }

  object DeleteInAppTemplateResponse {
    @inline
    def apply(
        MessageBody: MessageBody
    ): DeleteInAppTemplateResponse = {
      val __obj = js.Dynamic.literal(
        "MessageBody" -> MessageBody.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteInAppTemplateResponse]
    }
  }

  @js.native
  trait DeleteJourneyRequest extends js.Object {
    var ApplicationId: __string
    var JourneyId: __string
  }

  object DeleteJourneyRequest {
    @inline
    def apply(
        ApplicationId: __string,
        JourneyId: __string
    ): DeleteJourneyRequest = {
      val __obj = js.Dynamic.literal(
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any],
        "JourneyId" -> JourneyId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteJourneyRequest]
    }
  }

  @js.native
  trait DeleteJourneyResponse extends js.Object {
    var JourneyResponse: JourneyResponse
  }

  object DeleteJourneyResponse {
    @inline
    def apply(
        JourneyResponse: JourneyResponse
    ): DeleteJourneyResponse = {
      val __obj = js.Dynamic.literal(
        "JourneyResponse" -> JourneyResponse.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteJourneyResponse]
    }
  }

  @js.native
  trait DeletePushTemplateRequest extends js.Object {
    var TemplateName: __string
    var Version: js.UndefOr[__string]
  }

  object DeletePushTemplateRequest {
    @inline
    def apply(
        TemplateName: __string,
        Version: js.UndefOr[__string] = js.undefined
    ): DeletePushTemplateRequest = {
      val __obj = js.Dynamic.literal(
        "TemplateName" -> TemplateName.asInstanceOf[js.Any]
      )

      Version.foreach(__v => __obj.updateDynamic("Version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeletePushTemplateRequest]
    }
  }

  @js.native
  trait DeletePushTemplateResponse extends js.Object {
    var MessageBody: MessageBody
  }

  object DeletePushTemplateResponse {
    @inline
    def apply(
        MessageBody: MessageBody
    ): DeletePushTemplateResponse = {
      val __obj = js.Dynamic.literal(
        "MessageBody" -> MessageBody.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeletePushTemplateResponse]
    }
  }

  @js.native
  trait DeleteRecommenderConfigurationRequest extends js.Object {
    var RecommenderId: __string
  }

  object DeleteRecommenderConfigurationRequest {
    @inline
    def apply(
        RecommenderId: __string
    ): DeleteRecommenderConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "RecommenderId" -> RecommenderId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteRecommenderConfigurationRequest]
    }
  }

  @js.native
  trait DeleteRecommenderConfigurationResponse extends js.Object {
    var RecommenderConfigurationResponse: RecommenderConfigurationResponse
  }

  object DeleteRecommenderConfigurationResponse {
    @inline
    def apply(
        RecommenderConfigurationResponse: RecommenderConfigurationResponse
    ): DeleteRecommenderConfigurationResponse = {
      val __obj = js.Dynamic.literal(
        "RecommenderConfigurationResponse" -> RecommenderConfigurationResponse.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteRecommenderConfigurationResponse]
    }
  }

  @js.native
  trait DeleteSegmentRequest extends js.Object {
    var ApplicationId: __string
    var SegmentId: __string
  }

  object DeleteSegmentRequest {
    @inline
    def apply(
        ApplicationId: __string,
        SegmentId: __string
    ): DeleteSegmentRequest = {
      val __obj = js.Dynamic.literal(
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any],
        "SegmentId" -> SegmentId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteSegmentRequest]
    }
  }

  @js.native
  trait DeleteSegmentResponse extends js.Object {
    var SegmentResponse: SegmentResponse
  }

  object DeleteSegmentResponse {
    @inline
    def apply(
        SegmentResponse: SegmentResponse
    ): DeleteSegmentResponse = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        ApplicationId: __string
    ): DeleteSmsChannelRequest = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        SMSChannelResponse: SMSChannelResponse
    ): DeleteSmsChannelResponse = {
      val __obj = js.Dynamic.literal(
        "SMSChannelResponse" -> SMSChannelResponse.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteSmsChannelResponse]
    }
  }

  @js.native
  trait DeleteSmsTemplateRequest extends js.Object {
    var TemplateName: __string
    var Version: js.UndefOr[__string]
  }

  object DeleteSmsTemplateRequest {
    @inline
    def apply(
        TemplateName: __string,
        Version: js.UndefOr[__string] = js.undefined
    ): DeleteSmsTemplateRequest = {
      val __obj = js.Dynamic.literal(
        "TemplateName" -> TemplateName.asInstanceOf[js.Any]
      )

      Version.foreach(__v => __obj.updateDynamic("Version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteSmsTemplateRequest]
    }
  }

  @js.native
  trait DeleteSmsTemplateResponse extends js.Object {
    var MessageBody: MessageBody
  }

  object DeleteSmsTemplateResponse {
    @inline
    def apply(
        MessageBody: MessageBody
    ): DeleteSmsTemplateResponse = {
      val __obj = js.Dynamic.literal(
        "MessageBody" -> MessageBody.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteSmsTemplateResponse]
    }
  }

  @js.native
  trait DeleteUserEndpointsRequest extends js.Object {
    var ApplicationId: __string
    var UserId: __string
  }

  object DeleteUserEndpointsRequest {
    @inline
    def apply(
        ApplicationId: __string,
        UserId: __string
    ): DeleteUserEndpointsRequest = {
      val __obj = js.Dynamic.literal(
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any],
        "UserId" -> UserId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteUserEndpointsRequest]
    }
  }

  @js.native
  trait DeleteUserEndpointsResponse extends js.Object {
    var EndpointsResponse: EndpointsResponse
  }

  object DeleteUserEndpointsResponse {
    @inline
    def apply(
        EndpointsResponse: EndpointsResponse
    ): DeleteUserEndpointsResponse = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        ApplicationId: __string
    ): DeleteVoiceChannelRequest = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        VoiceChannelResponse: VoiceChannelResponse
    ): DeleteVoiceChannelResponse = {
      val __obj = js.Dynamic.literal(
        "VoiceChannelResponse" -> VoiceChannelResponse.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteVoiceChannelResponse]
    }
  }

  @js.native
  trait DeleteVoiceTemplateRequest extends js.Object {
    var TemplateName: __string
    var Version: js.UndefOr[__string]
  }

  object DeleteVoiceTemplateRequest {
    @inline
    def apply(
        TemplateName: __string,
        Version: js.UndefOr[__string] = js.undefined
    ): DeleteVoiceTemplateRequest = {
      val __obj = js.Dynamic.literal(
        "TemplateName" -> TemplateName.asInstanceOf[js.Any]
      )

      Version.foreach(__v => __obj.updateDynamic("Version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteVoiceTemplateRequest]
    }
  }

  @js.native
  trait DeleteVoiceTemplateResponse extends js.Object {
    var MessageBody: MessageBody
  }

  object DeleteVoiceTemplateResponse {
    @inline
    def apply(
        MessageBody: MessageBody
    ): DeleteVoiceTemplateResponse = {
      val __obj = js.Dynamic.literal(
        "MessageBody" -> MessageBody.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteVoiceTemplateResponse]
    }
  }

  /** Specifies the settings and content for the default message and any default messages that you tailored for specific channels.
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
    @inline
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
      val __obj = js.Dynamic.literal()
      ADMMessage.foreach(__v => __obj.updateDynamic("ADMMessage")(__v.asInstanceOf[js.Any]))
      APNSMessage.foreach(__v => __obj.updateDynamic("APNSMessage")(__v.asInstanceOf[js.Any]))
      BaiduMessage.foreach(__v => __obj.updateDynamic("BaiduMessage")(__v.asInstanceOf[js.Any]))
      DefaultMessage.foreach(__v => __obj.updateDynamic("DefaultMessage")(__v.asInstanceOf[js.Any]))
      DefaultPushNotificationMessage.foreach(__v => __obj.updateDynamic("DefaultPushNotificationMessage")(__v.asInstanceOf[js.Any]))
      EmailMessage.foreach(__v => __obj.updateDynamic("EmailMessage")(__v.asInstanceOf[js.Any]))
      GCMMessage.foreach(__v => __obj.updateDynamic("GCMMessage")(__v.asInstanceOf[js.Any]))
      SMSMessage.foreach(__v => __obj.updateDynamic("SMSMessage")(__v.asInstanceOf[js.Any]))
      VoiceMessage.foreach(__v => __obj.updateDynamic("VoiceMessage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DirectMessageConfiguration]
    }
  }

  /** Specifies the status and settings of the email channel for an application.
    */
  @js.native
  trait EmailChannelRequest extends js.Object {
    var FromAddress: __string
    var Identity: __string
    var ConfigurationSet: js.UndefOr[__string]
    var Enabled: js.UndefOr[__boolean]
    var RoleArn: js.UndefOr[__string]
  }

  object EmailChannelRequest {
    @inline
    def apply(
        FromAddress: __string,
        Identity: __string,
        ConfigurationSet: js.UndefOr[__string] = js.undefined,
        Enabled: js.UndefOr[__boolean] = js.undefined,
        RoleArn: js.UndefOr[__string] = js.undefined
    ): EmailChannelRequest = {
      val __obj = js.Dynamic.literal(
        "FromAddress" -> FromAddress.asInstanceOf[js.Any],
        "Identity" -> Identity.asInstanceOf[js.Any]
      )

      ConfigurationSet.foreach(__v => __obj.updateDynamic("ConfigurationSet")(__v.asInstanceOf[js.Any]))
      Enabled.foreach(__v => __obj.updateDynamic("Enabled")(__v.asInstanceOf[js.Any]))
      RoleArn.foreach(__v => __obj.updateDynamic("RoleArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EmailChannelRequest]
    }
  }

  /** Provides information about the status and settings of the email channel for an application.
    */
  @js.native
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

  object EmailChannelResponse {
    @inline
    def apply(
        Platform: __string,
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
        RoleArn: js.UndefOr[__string] = js.undefined,
        Version: js.UndefOr[__integer] = js.undefined
    ): EmailChannelResponse = {
      val __obj = js.Dynamic.literal(
        "Platform" -> Platform.asInstanceOf[js.Any]
      )

      ApplicationId.foreach(__v => __obj.updateDynamic("ApplicationId")(__v.asInstanceOf[js.Any]))
      ConfigurationSet.foreach(__v => __obj.updateDynamic("ConfigurationSet")(__v.asInstanceOf[js.Any]))
      CreationDate.foreach(__v => __obj.updateDynamic("CreationDate")(__v.asInstanceOf[js.Any]))
      Enabled.foreach(__v => __obj.updateDynamic("Enabled")(__v.asInstanceOf[js.Any]))
      FromAddress.foreach(__v => __obj.updateDynamic("FromAddress")(__v.asInstanceOf[js.Any]))
      HasCredential.foreach(__v => __obj.updateDynamic("HasCredential")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      Identity.foreach(__v => __obj.updateDynamic("Identity")(__v.asInstanceOf[js.Any]))
      IsArchived.foreach(__v => __obj.updateDynamic("IsArchived")(__v.asInstanceOf[js.Any]))
      LastModifiedBy.foreach(__v => __obj.updateDynamic("LastModifiedBy")(__v.asInstanceOf[js.Any]))
      LastModifiedDate.foreach(__v => __obj.updateDynamic("LastModifiedDate")(__v.asInstanceOf[js.Any]))
      MessagesPerSecond.foreach(__v => __obj.updateDynamic("MessagesPerSecond")(__v.asInstanceOf[js.Any]))
      RoleArn.foreach(__v => __obj.updateDynamic("RoleArn")(__v.asInstanceOf[js.Any]))
      Version.foreach(__v => __obj.updateDynamic("Version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EmailChannelResponse]
    }
  }

  /** Specifies the default settings and content for a one-time email message that's sent directly to an endpoint.
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
    @inline
    def apply(
        Body: js.UndefOr[__string] = js.undefined,
        FeedbackForwardingAddress: js.UndefOr[__string] = js.undefined,
        FromAddress: js.UndefOr[__string] = js.undefined,
        RawEmail: js.UndefOr[RawEmail] = js.undefined,
        ReplyToAddresses: js.UndefOr[ListOf__string] = js.undefined,
        SimpleEmail: js.UndefOr[SimpleEmail] = js.undefined,
        Substitutions: js.UndefOr[MapOfListOf__string] = js.undefined
    ): EmailMessage = {
      val __obj = js.Dynamic.literal()
      Body.foreach(__v => __obj.updateDynamic("Body")(__v.asInstanceOf[js.Any]))
      FeedbackForwardingAddress.foreach(__v => __obj.updateDynamic("FeedbackForwardingAddress")(__v.asInstanceOf[js.Any]))
      FromAddress.foreach(__v => __obj.updateDynamic("FromAddress")(__v.asInstanceOf[js.Any]))
      RawEmail.foreach(__v => __obj.updateDynamic("RawEmail")(__v.asInstanceOf[js.Any]))
      ReplyToAddresses.foreach(__v => __obj.updateDynamic("ReplyToAddresses")(__v.asInstanceOf[js.Any]))
      SimpleEmail.foreach(__v => __obj.updateDynamic("SimpleEmail")(__v.asInstanceOf[js.Any]))
      Substitutions.foreach(__v => __obj.updateDynamic("Substitutions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EmailMessage]
    }
  }

  /** Specifies the settings for an email activity in a journey. This type of activity sends an email message to participants.
    */
  @js.native
  trait EmailMessageActivity extends js.Object {
    var MessageConfig: js.UndefOr[JourneyEmailMessage]
    var NextActivity: js.UndefOr[__string]
    var TemplateName: js.UndefOr[__string]
    var TemplateVersion: js.UndefOr[__string]
  }

  object EmailMessageActivity {
    @inline
    def apply(
        MessageConfig: js.UndefOr[JourneyEmailMessage] = js.undefined,
        NextActivity: js.UndefOr[__string] = js.undefined,
        TemplateName: js.UndefOr[__string] = js.undefined,
        TemplateVersion: js.UndefOr[__string] = js.undefined
    ): EmailMessageActivity = {
      val __obj = js.Dynamic.literal()
      MessageConfig.foreach(__v => __obj.updateDynamic("MessageConfig")(__v.asInstanceOf[js.Any]))
      NextActivity.foreach(__v => __obj.updateDynamic("NextActivity")(__v.asInstanceOf[js.Any]))
      TemplateName.foreach(__v => __obj.updateDynamic("TemplateName")(__v.asInstanceOf[js.Any]))
      TemplateVersion.foreach(__v => __obj.updateDynamic("TemplateVersion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EmailMessageActivity]
    }
  }

  /** Specifies the content and settings for a message template that can be used in messages that are sent through the email channel.
    */
  @js.native
  trait EmailTemplateRequest extends js.Object {
    var DefaultSubstitutions: js.UndefOr[__string]
    var HtmlPart: js.UndefOr[__string]
    var RecommenderId: js.UndefOr[__string]
    var Subject: js.UndefOr[__string]
    var TemplateDescription: js.UndefOr[__string]
    var TextPart: js.UndefOr[__string]
    var tags: js.UndefOr[MapOf__string]
  }

  object EmailTemplateRequest {
    @inline
    def apply(
        DefaultSubstitutions: js.UndefOr[__string] = js.undefined,
        HtmlPart: js.UndefOr[__string] = js.undefined,
        RecommenderId: js.UndefOr[__string] = js.undefined,
        Subject: js.UndefOr[__string] = js.undefined,
        TemplateDescription: js.UndefOr[__string] = js.undefined,
        TextPart: js.UndefOr[__string] = js.undefined,
        tags: js.UndefOr[MapOf__string] = js.undefined
    ): EmailTemplateRequest = {
      val __obj = js.Dynamic.literal()
      DefaultSubstitutions.foreach(__v => __obj.updateDynamic("DefaultSubstitutions")(__v.asInstanceOf[js.Any]))
      HtmlPart.foreach(__v => __obj.updateDynamic("HtmlPart")(__v.asInstanceOf[js.Any]))
      RecommenderId.foreach(__v => __obj.updateDynamic("RecommenderId")(__v.asInstanceOf[js.Any]))
      Subject.foreach(__v => __obj.updateDynamic("Subject")(__v.asInstanceOf[js.Any]))
      TemplateDescription.foreach(__v => __obj.updateDynamic("TemplateDescription")(__v.asInstanceOf[js.Any]))
      TextPart.foreach(__v => __obj.updateDynamic("TextPart")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EmailTemplateRequest]
    }
  }

  /** Provides information about the content and settings for a message template that can be used in messages that are sent through the email channel.
    */
  @js.native
  trait EmailTemplateResponse extends js.Object {
    var CreationDate: __string
    var LastModifiedDate: __string
    var TemplateName: __string
    var TemplateType: TemplateType
    var Arn: js.UndefOr[__string]
    var DefaultSubstitutions: js.UndefOr[__string]
    var HtmlPart: js.UndefOr[__string]
    var RecommenderId: js.UndefOr[__string]
    var Subject: js.UndefOr[__string]
    var TemplateDescription: js.UndefOr[__string]
    var TextPart: js.UndefOr[__string]
    var Version: js.UndefOr[__string]
    var tags: js.UndefOr[MapOf__string]
  }

  object EmailTemplateResponse {
    @inline
    def apply(
        CreationDate: __string,
        LastModifiedDate: __string,
        TemplateName: __string,
        TemplateType: TemplateType,
        Arn: js.UndefOr[__string] = js.undefined,
        DefaultSubstitutions: js.UndefOr[__string] = js.undefined,
        HtmlPart: js.UndefOr[__string] = js.undefined,
        RecommenderId: js.UndefOr[__string] = js.undefined,
        Subject: js.UndefOr[__string] = js.undefined,
        TemplateDescription: js.UndefOr[__string] = js.undefined,
        TextPart: js.UndefOr[__string] = js.undefined,
        Version: js.UndefOr[__string] = js.undefined,
        tags: js.UndefOr[MapOf__string] = js.undefined
    ): EmailTemplateResponse = {
      val __obj = js.Dynamic.literal(
        "CreationDate" -> CreationDate.asInstanceOf[js.Any],
        "LastModifiedDate" -> LastModifiedDate.asInstanceOf[js.Any],
        "TemplateName" -> TemplateName.asInstanceOf[js.Any],
        "TemplateType" -> TemplateType.asInstanceOf[js.Any]
      )

      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      DefaultSubstitutions.foreach(__v => __obj.updateDynamic("DefaultSubstitutions")(__v.asInstanceOf[js.Any]))
      HtmlPart.foreach(__v => __obj.updateDynamic("HtmlPart")(__v.asInstanceOf[js.Any]))
      RecommenderId.foreach(__v => __obj.updateDynamic("RecommenderId")(__v.asInstanceOf[js.Any]))
      Subject.foreach(__v => __obj.updateDynamic("Subject")(__v.asInstanceOf[js.Any]))
      TemplateDescription.foreach(__v => __obj.updateDynamic("TemplateDescription")(__v.asInstanceOf[js.Any]))
      TextPart.foreach(__v => __obj.updateDynamic("TextPart")(__v.asInstanceOf[js.Any]))
      Version.foreach(__v => __obj.updateDynamic("Version")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EmailTemplateResponse]
    }
  }

  /** Specifies an endpoint to create or update and the settings and attributes to set or change for the endpoint.
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
    @inline
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
      val __obj = js.Dynamic.literal()
      Address.foreach(__v => __obj.updateDynamic("Address")(__v.asInstanceOf[js.Any]))
      Attributes.foreach(__v => __obj.updateDynamic("Attributes")(__v.asInstanceOf[js.Any]))
      ChannelType.foreach(__v => __obj.updateDynamic("ChannelType")(__v.asInstanceOf[js.Any]))
      Demographic.foreach(__v => __obj.updateDynamic("Demographic")(__v.asInstanceOf[js.Any]))
      EffectiveDate.foreach(__v => __obj.updateDynamic("EffectiveDate")(__v.asInstanceOf[js.Any]))
      EndpointStatus.foreach(__v => __obj.updateDynamic("EndpointStatus")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      Location.foreach(__v => __obj.updateDynamic("Location")(__v.asInstanceOf[js.Any]))
      Metrics.foreach(__v => __obj.updateDynamic("Metrics")(__v.asInstanceOf[js.Any]))
      OptOut.foreach(__v => __obj.updateDynamic("OptOut")(__v.asInstanceOf[js.Any]))
      RequestId.foreach(__v => __obj.updateDynamic("RequestId")(__v.asInstanceOf[js.Any]))
      User.foreach(__v => __obj.updateDynamic("User")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EndpointBatchItem]
    }
  }

  /** Specifies a batch of endpoints to create or update and the settings and attributes to set or change for each endpoint.
    */
  @js.native
  trait EndpointBatchRequest extends js.Object {
    var Item: ListOfEndpointBatchItem
  }

  object EndpointBatchRequest {
    @inline
    def apply(
        Item: ListOfEndpointBatchItem
    ): EndpointBatchRequest = {
      val __obj = js.Dynamic.literal(
        "Item" -> Item.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[EndpointBatchRequest]
    }
  }

  /** Specifies demographic information about an endpoint, such as the applicable time zone and platform.
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
    @inline
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
      val __obj = js.Dynamic.literal()
      AppVersion.foreach(__v => __obj.updateDynamic("AppVersion")(__v.asInstanceOf[js.Any]))
      Locale.foreach(__v => __obj.updateDynamic("Locale")(__v.asInstanceOf[js.Any]))
      Make.foreach(__v => __obj.updateDynamic("Make")(__v.asInstanceOf[js.Any]))
      Model.foreach(__v => __obj.updateDynamic("Model")(__v.asInstanceOf[js.Any]))
      ModelVersion.foreach(__v => __obj.updateDynamic("ModelVersion")(__v.asInstanceOf[js.Any]))
      Platform.foreach(__v => __obj.updateDynamic("Platform")(__v.asInstanceOf[js.Any]))
      PlatformVersion.foreach(__v => __obj.updateDynamic("PlatformVersion")(__v.asInstanceOf[js.Any]))
      Timezone.foreach(__v => __obj.updateDynamic("Timezone")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EndpointDemographic]
    }
  }

  /** Provides the status code and message that result from processing data for an endpoint.
    */
  @js.native
  trait EndpointItemResponse extends js.Object {
    var Message: js.UndefOr[__string]
    var StatusCode: js.UndefOr[__integer]
  }

  object EndpointItemResponse {
    @inline
    def apply(
        Message: js.UndefOr[__string] = js.undefined,
        StatusCode: js.UndefOr[__integer] = js.undefined
    ): EndpointItemResponse = {
      val __obj = js.Dynamic.literal()
      Message.foreach(__v => __obj.updateDynamic("Message")(__v.asInstanceOf[js.Any]))
      StatusCode.foreach(__v => __obj.updateDynamic("StatusCode")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EndpointItemResponse]
    }
  }

  /** Specifies geographic information about an endpoint.
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
    @inline
    def apply(
        City: js.UndefOr[__string] = js.undefined,
        Country: js.UndefOr[__string] = js.undefined,
        Latitude: js.UndefOr[__double] = js.undefined,
        Longitude: js.UndefOr[__double] = js.undefined,
        PostalCode: js.UndefOr[__string] = js.undefined,
        Region: js.UndefOr[__string] = js.undefined
    ): EndpointLocation = {
      val __obj = js.Dynamic.literal()
      City.foreach(__v => __obj.updateDynamic("City")(__v.asInstanceOf[js.Any]))
      Country.foreach(__v => __obj.updateDynamic("Country")(__v.asInstanceOf[js.Any]))
      Latitude.foreach(__v => __obj.updateDynamic("Latitude")(__v.asInstanceOf[js.Any]))
      Longitude.foreach(__v => __obj.updateDynamic("Longitude")(__v.asInstanceOf[js.Any]))
      PostalCode.foreach(__v => __obj.updateDynamic("PostalCode")(__v.asInstanceOf[js.Any]))
      Region.foreach(__v => __obj.updateDynamic("Region")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EndpointLocation]
    }
  }

  /** Provides information about the delivery status and results of sending a message directly to an endpoint.
    */
  @js.native
  trait EndpointMessageResult extends js.Object {
    var DeliveryStatus: DeliveryStatus
    var StatusCode: __integer
    var Address: js.UndefOr[__string]
    var MessageId: js.UndefOr[__string]
    var StatusMessage: js.UndefOr[__string]
    var UpdatedToken: js.UndefOr[__string]
  }

  object EndpointMessageResult {
    @inline
    def apply(
        DeliveryStatus: DeliveryStatus,
        StatusCode: __integer,
        Address: js.UndefOr[__string] = js.undefined,
        MessageId: js.UndefOr[__string] = js.undefined,
        StatusMessage: js.UndefOr[__string] = js.undefined,
        UpdatedToken: js.UndefOr[__string] = js.undefined
    ): EndpointMessageResult = {
      val __obj = js.Dynamic.literal(
        "DeliveryStatus" -> DeliveryStatus.asInstanceOf[js.Any],
        "StatusCode" -> StatusCode.asInstanceOf[js.Any]
      )

      Address.foreach(__v => __obj.updateDynamic("Address")(__v.asInstanceOf[js.Any]))
      MessageId.foreach(__v => __obj.updateDynamic("MessageId")(__v.asInstanceOf[js.Any]))
      StatusMessage.foreach(__v => __obj.updateDynamic("StatusMessage")(__v.asInstanceOf[js.Any]))
      UpdatedToken.foreach(__v => __obj.updateDynamic("UpdatedToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EndpointMessageResult]
    }
  }

  /** Specifies the channel type and other settings for an endpoint.
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
    @inline
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
      val __obj = js.Dynamic.literal()
      Address.foreach(__v => __obj.updateDynamic("Address")(__v.asInstanceOf[js.Any]))
      Attributes.foreach(__v => __obj.updateDynamic("Attributes")(__v.asInstanceOf[js.Any]))
      ChannelType.foreach(__v => __obj.updateDynamic("ChannelType")(__v.asInstanceOf[js.Any]))
      Demographic.foreach(__v => __obj.updateDynamic("Demographic")(__v.asInstanceOf[js.Any]))
      EffectiveDate.foreach(__v => __obj.updateDynamic("EffectiveDate")(__v.asInstanceOf[js.Any]))
      EndpointStatus.foreach(__v => __obj.updateDynamic("EndpointStatus")(__v.asInstanceOf[js.Any]))
      Location.foreach(__v => __obj.updateDynamic("Location")(__v.asInstanceOf[js.Any]))
      Metrics.foreach(__v => __obj.updateDynamic("Metrics")(__v.asInstanceOf[js.Any]))
      OptOut.foreach(__v => __obj.updateDynamic("OptOut")(__v.asInstanceOf[js.Any]))
      RequestId.foreach(__v => __obj.updateDynamic("RequestId")(__v.asInstanceOf[js.Any]))
      User.foreach(__v => __obj.updateDynamic("User")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EndpointRequest]
    }
  }

  /** Provides information about the channel type and other settings for an endpoint.
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
    @inline
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
      val __obj = js.Dynamic.literal()
      Address.foreach(__v => __obj.updateDynamic("Address")(__v.asInstanceOf[js.Any]))
      ApplicationId.foreach(__v => __obj.updateDynamic("ApplicationId")(__v.asInstanceOf[js.Any]))
      Attributes.foreach(__v => __obj.updateDynamic("Attributes")(__v.asInstanceOf[js.Any]))
      ChannelType.foreach(__v => __obj.updateDynamic("ChannelType")(__v.asInstanceOf[js.Any]))
      CohortId.foreach(__v => __obj.updateDynamic("CohortId")(__v.asInstanceOf[js.Any]))
      CreationDate.foreach(__v => __obj.updateDynamic("CreationDate")(__v.asInstanceOf[js.Any]))
      Demographic.foreach(__v => __obj.updateDynamic("Demographic")(__v.asInstanceOf[js.Any]))
      EffectiveDate.foreach(__v => __obj.updateDynamic("EffectiveDate")(__v.asInstanceOf[js.Any]))
      EndpointStatus.foreach(__v => __obj.updateDynamic("EndpointStatus")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      Location.foreach(__v => __obj.updateDynamic("Location")(__v.asInstanceOf[js.Any]))
      Metrics.foreach(__v => __obj.updateDynamic("Metrics")(__v.asInstanceOf[js.Any]))
      OptOut.foreach(__v => __obj.updateDynamic("OptOut")(__v.asInstanceOf[js.Any]))
      RequestId.foreach(__v => __obj.updateDynamic("RequestId")(__v.asInstanceOf[js.Any]))
      User.foreach(__v => __obj.updateDynamic("User")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EndpointResponse]
    }
  }

  /** Specifies the content, including message variables and attributes, to use in a message that's sent directly to an endpoint.
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
    @inline
    def apply(
        BodyOverride: js.UndefOr[__string] = js.undefined,
        Context: js.UndefOr[MapOf__string] = js.undefined,
        RawContent: js.UndefOr[__string] = js.undefined,
        Substitutions: js.UndefOr[MapOfListOf__string] = js.undefined,
        TitleOverride: js.UndefOr[__string] = js.undefined
    ): EndpointSendConfiguration = {
      val __obj = js.Dynamic.literal()
      BodyOverride.foreach(__v => __obj.updateDynamic("BodyOverride")(__v.asInstanceOf[js.Any]))
      Context.foreach(__v => __obj.updateDynamic("Context")(__v.asInstanceOf[js.Any]))
      RawContent.foreach(__v => __obj.updateDynamic("RawContent")(__v.asInstanceOf[js.Any]))
      Substitutions.foreach(__v => __obj.updateDynamic("Substitutions")(__v.asInstanceOf[js.Any]))
      TitleOverride.foreach(__v => __obj.updateDynamic("TitleOverride")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EndpointSendConfiguration]
    }
  }

  /** Specifies data for one or more attributes that describe the user who's associated with an endpoint.
    */
  @js.native
  trait EndpointUser extends js.Object {
    var UserAttributes: js.UndefOr[MapOfListOf__string]
    var UserId: js.UndefOr[__string]
  }

  object EndpointUser {
    @inline
    def apply(
        UserAttributes: js.UndefOr[MapOfListOf__string] = js.undefined,
        UserId: js.UndefOr[__string] = js.undefined
    ): EndpointUser = {
      val __obj = js.Dynamic.literal()
      UserAttributes.foreach(__v => __obj.updateDynamic("UserAttributes")(__v.asInstanceOf[js.Any]))
      UserId.foreach(__v => __obj.updateDynamic("UserId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EndpointUser]
    }
  }

  /** Provides information about all the endpoints that are associated with a user ID.
    */
  @js.native
  trait EndpointsResponse extends js.Object {
    var Item: ListOfEndpointResponse
  }

  object EndpointsResponse {
    @inline
    def apply(
        Item: ListOfEndpointResponse
    ): EndpointsResponse = {
      val __obj = js.Dynamic.literal(
        "Item" -> Item.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[EndpointsResponse]
    }
  }

  /** Specifies information about an event that reports data to Amazon Pinpoint.
    */
  @js.native
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

  object Event {
    @inline
    def apply(
        EventType: __string,
        Timestamp: __string,
        AppPackageName: js.UndefOr[__string] = js.undefined,
        AppTitle: js.UndefOr[__string] = js.undefined,
        AppVersionCode: js.UndefOr[__string] = js.undefined,
        Attributes: js.UndefOr[MapOf__string] = js.undefined,
        ClientSdkVersion: js.UndefOr[__string] = js.undefined,
        Metrics: js.UndefOr[MapOf__double] = js.undefined,
        SdkName: js.UndefOr[__string] = js.undefined,
        Session: js.UndefOr[Session] = js.undefined
    ): Event = {
      val __obj = js.Dynamic.literal(
        "EventType" -> EventType.asInstanceOf[js.Any],
        "Timestamp" -> Timestamp.asInstanceOf[js.Any]
      )

      AppPackageName.foreach(__v => __obj.updateDynamic("AppPackageName")(__v.asInstanceOf[js.Any]))
      AppTitle.foreach(__v => __obj.updateDynamic("AppTitle")(__v.asInstanceOf[js.Any]))
      AppVersionCode.foreach(__v => __obj.updateDynamic("AppVersionCode")(__v.asInstanceOf[js.Any]))
      Attributes.foreach(__v => __obj.updateDynamic("Attributes")(__v.asInstanceOf[js.Any]))
      ClientSdkVersion.foreach(__v => __obj.updateDynamic("ClientSdkVersion")(__v.asInstanceOf[js.Any]))
      Metrics.foreach(__v => __obj.updateDynamic("Metrics")(__v.asInstanceOf[js.Any]))
      SdkName.foreach(__v => __obj.updateDynamic("SdkName")(__v.asInstanceOf[js.Any]))
      Session.foreach(__v => __obj.updateDynamic("Session")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Event]
    }
  }

  /** Specifies the conditions to evaluate for an event that applies to an activity in a journey.
    */
  @js.native
  trait EventCondition extends js.Object {
    var Dimensions: js.UndefOr[EventDimensions]
    var MessageActivity: js.UndefOr[__string]
  }

  object EventCondition {
    @inline
    def apply(
        Dimensions: js.UndefOr[EventDimensions] = js.undefined,
        MessageActivity: js.UndefOr[__string] = js.undefined
    ): EventCondition = {
      val __obj = js.Dynamic.literal()
      Dimensions.foreach(__v => __obj.updateDynamic("Dimensions")(__v.asInstanceOf[js.Any]))
      MessageActivity.foreach(__v => __obj.updateDynamic("MessageActivity")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EventCondition]
    }
  }

  /** Specifies the dimensions for an event filter that determines when a campaign is sent or a journey activity is performed.
    */
  @js.native
  trait EventDimensions extends js.Object {
    var Attributes: js.UndefOr[MapOfAttributeDimension]
    var EventType: js.UndefOr[SetDimension]
    var Metrics: js.UndefOr[MapOfMetricDimension]
  }

  object EventDimensions {
    @inline
    def apply(
        Attributes: js.UndefOr[MapOfAttributeDimension] = js.undefined,
        EventType: js.UndefOr[SetDimension] = js.undefined,
        Metrics: js.UndefOr[MapOfMetricDimension] = js.undefined
    ): EventDimensions = {
      val __obj = js.Dynamic.literal()
      Attributes.foreach(__v => __obj.updateDynamic("Attributes")(__v.asInstanceOf[js.Any]))
      EventType.foreach(__v => __obj.updateDynamic("EventType")(__v.asInstanceOf[js.Any]))
      Metrics.foreach(__v => __obj.updateDynamic("Metrics")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EventDimensions]
    }
  }

  /** Specifies the settings for an event that causes a campaign to be sent or a journey activity to be performed.
    */
  @js.native
  trait EventFilter extends js.Object {
    var Dimensions: EventDimensions
    var FilterType: FilterType
  }

  object EventFilter {
    @inline
    def apply(
        Dimensions: EventDimensions,
        FilterType: FilterType
    ): EventFilter = {
      val __obj = js.Dynamic.literal(
        "Dimensions" -> Dimensions.asInstanceOf[js.Any],
        "FilterType" -> FilterType.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[EventFilter]
    }
  }

  /** Provides the status code and message that result from processing an event.
    */
  @js.native
  trait EventItemResponse extends js.Object {
    var Message: js.UndefOr[__string]
    var StatusCode: js.UndefOr[__integer]
  }

  object EventItemResponse {
    @inline
    def apply(
        Message: js.UndefOr[__string] = js.undefined,
        StatusCode: js.UndefOr[__integer] = js.undefined
    ): EventItemResponse = {
      val __obj = js.Dynamic.literal()
      Message.foreach(__v => __obj.updateDynamic("Message")(__v.asInstanceOf[js.Any]))
      StatusCode.foreach(__v => __obj.updateDynamic("StatusCode")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EventItemResponse]
    }
  }

  /** Specifies the settings for an event that causes a journey activity to start.
    */
  @js.native
  trait EventStartCondition extends js.Object {
    var EventFilter: js.UndefOr[EventFilter]
    var SegmentId: js.UndefOr[__string]
  }

  object EventStartCondition {
    @inline
    def apply(
        EventFilter: js.UndefOr[EventFilter] = js.undefined,
        SegmentId: js.UndefOr[__string] = js.undefined
    ): EventStartCondition = {
      val __obj = js.Dynamic.literal()
      EventFilter.foreach(__v => __obj.updateDynamic("EventFilter")(__v.asInstanceOf[js.Any]))
      SegmentId.foreach(__v => __obj.updateDynamic("SegmentId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EventStartCondition]
    }
  }

  /** Specifies settings for publishing event data to an Amazon Kinesis data stream or an Amazon Kinesis Data Firehose delivery stream.
    */
  @js.native
  trait EventStream extends js.Object {
    var ApplicationId: __string
    var DestinationStreamArn: __string
    var RoleArn: __string
    var ExternalId: js.UndefOr[__string]
    var LastModifiedDate: js.UndefOr[__string]
    var LastUpdatedBy: js.UndefOr[__string]
  }

  object EventStream {
    @inline
    def apply(
        ApplicationId: __string,
        DestinationStreamArn: __string,
        RoleArn: __string,
        ExternalId: js.UndefOr[__string] = js.undefined,
        LastModifiedDate: js.UndefOr[__string] = js.undefined,
        LastUpdatedBy: js.UndefOr[__string] = js.undefined
    ): EventStream = {
      val __obj = js.Dynamic.literal(
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any],
        "DestinationStreamArn" -> DestinationStreamArn.asInstanceOf[js.Any],
        "RoleArn" -> RoleArn.asInstanceOf[js.Any]
      )

      ExternalId.foreach(__v => __obj.updateDynamic("ExternalId")(__v.asInstanceOf[js.Any]))
      LastModifiedDate.foreach(__v => __obj.updateDynamic("LastModifiedDate")(__v.asInstanceOf[js.Any]))
      LastUpdatedBy.foreach(__v => __obj.updateDynamic("LastUpdatedBy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EventStream]
    }
  }

  /** Specifies a batch of endpoints and events to process.
    */
  @js.native
  trait EventsBatch extends js.Object {
    var Endpoint: PublicEndpoint
    var Events: MapOfEvent
  }

  object EventsBatch {
    @inline
    def apply(
        Endpoint: PublicEndpoint,
        Events: MapOfEvent
    ): EventsBatch = {
      val __obj = js.Dynamic.literal(
        "Endpoint" -> Endpoint.asInstanceOf[js.Any],
        "Events" -> Events.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[EventsBatch]
    }
  }

  /** Specifies a batch of events to process.
    */
  @js.native
  trait EventsRequest extends js.Object {
    var BatchItem: MapOfEventsBatch
  }

  object EventsRequest {
    @inline
    def apply(
        BatchItem: MapOfEventsBatch
    ): EventsRequest = {
      val __obj = js.Dynamic.literal(
        "BatchItem" -> BatchItem.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[EventsRequest]
    }
  }

  /** Provides information about endpoints and the events that they're associated with.
    */
  @js.native
  trait EventsResponse extends js.Object {
    var Results: js.UndefOr[MapOfItemResponse]
  }

  object EventsResponse {
    @inline
    def apply(
        Results: js.UndefOr[MapOfItemResponse] = js.undefined
    ): EventsResponse = {
      val __obj = js.Dynamic.literal()
      Results.foreach(__v => __obj.updateDynamic("Results")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EventsResponse]
    }
  }

  /** Specifies the settings for a job that exports endpoint definitions to an Amazon Simple Storage Service (Amazon S3) bucket.
    */
  @js.native
  trait ExportJobRequest extends js.Object {
    var RoleArn: __string
    var S3UrlPrefix: __string
    var SegmentId: js.UndefOr[__string]
    var SegmentVersion: js.UndefOr[__integer]
  }

  object ExportJobRequest {
    @inline
    def apply(
        RoleArn: __string,
        S3UrlPrefix: __string,
        SegmentId: js.UndefOr[__string] = js.undefined,
        SegmentVersion: js.UndefOr[__integer] = js.undefined
    ): ExportJobRequest = {
      val __obj = js.Dynamic.literal(
        "RoleArn" -> RoleArn.asInstanceOf[js.Any],
        "S3UrlPrefix" -> S3UrlPrefix.asInstanceOf[js.Any]
      )

      SegmentId.foreach(__v => __obj.updateDynamic("SegmentId")(__v.asInstanceOf[js.Any]))
      SegmentVersion.foreach(__v => __obj.updateDynamic("SegmentVersion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ExportJobRequest]
    }
  }

  /** Provides information about the resource settings for a job that exports endpoint definitions to a file. The file can be added directly to an Amazon Simple Storage Service (Amazon S3) bucket by using the Amazon Pinpoint API or downloaded directly to a computer by using the Amazon Pinpoint console.
    */
  @js.native
  trait ExportJobResource extends js.Object {
    var RoleArn: __string
    var S3UrlPrefix: __string
    var SegmentId: js.UndefOr[__string]
    var SegmentVersion: js.UndefOr[__integer]
  }

  object ExportJobResource {
    @inline
    def apply(
        RoleArn: __string,
        S3UrlPrefix: __string,
        SegmentId: js.UndefOr[__string] = js.undefined,
        SegmentVersion: js.UndefOr[__integer] = js.undefined
    ): ExportJobResource = {
      val __obj = js.Dynamic.literal(
        "RoleArn" -> RoleArn.asInstanceOf[js.Any],
        "S3UrlPrefix" -> S3UrlPrefix.asInstanceOf[js.Any]
      )

      SegmentId.foreach(__v => __obj.updateDynamic("SegmentId")(__v.asInstanceOf[js.Any]))
      SegmentVersion.foreach(__v => __obj.updateDynamic("SegmentVersion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ExportJobResource]
    }
  }

  /** Provides information about the status and settings of a job that exports endpoint definitions to a file. The file can be added directly to an Amazon Simple Storage Service (Amazon S3) bucket by using the Amazon Pinpoint API or downloaded directly to a computer by using the Amazon Pinpoint console.
    */
  @js.native
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

  object ExportJobResponse {
    @inline
    def apply(
        ApplicationId: __string,
        CreationDate: __string,
        Definition: ExportJobResource,
        Id: __string,
        JobStatus: JobStatus,
        Type: __string,
        CompletedPieces: js.UndefOr[__integer] = js.undefined,
        CompletionDate: js.UndefOr[__string] = js.undefined,
        FailedPieces: js.UndefOr[__integer] = js.undefined,
        Failures: js.UndefOr[ListOf__string] = js.undefined,
        TotalFailures: js.UndefOr[__integer] = js.undefined,
        TotalPieces: js.UndefOr[__integer] = js.undefined,
        TotalProcessed: js.UndefOr[__integer] = js.undefined
    ): ExportJobResponse = {
      val __obj = js.Dynamic.literal(
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any],
        "CreationDate" -> CreationDate.asInstanceOf[js.Any],
        "Definition" -> Definition.asInstanceOf[js.Any],
        "Id" -> Id.asInstanceOf[js.Any],
        "JobStatus" -> JobStatus.asInstanceOf[js.Any],
        "Type" -> Type.asInstanceOf[js.Any]
      )

      CompletedPieces.foreach(__v => __obj.updateDynamic("CompletedPieces")(__v.asInstanceOf[js.Any]))
      CompletionDate.foreach(__v => __obj.updateDynamic("CompletionDate")(__v.asInstanceOf[js.Any]))
      FailedPieces.foreach(__v => __obj.updateDynamic("FailedPieces")(__v.asInstanceOf[js.Any]))
      Failures.foreach(__v => __obj.updateDynamic("Failures")(__v.asInstanceOf[js.Any]))
      TotalFailures.foreach(__v => __obj.updateDynamic("TotalFailures")(__v.asInstanceOf[js.Any]))
      TotalPieces.foreach(__v => __obj.updateDynamic("TotalPieces")(__v.asInstanceOf[js.Any]))
      TotalProcessed.foreach(__v => __obj.updateDynamic("TotalProcessed")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ExportJobResponse]
    }
  }

  /** Provides information about all the export jobs that are associated with an application or segment. An export job is a job that exports endpoint definitions to a file.
    */
  @js.native
  trait ExportJobsResponse extends js.Object {
    var Item: ListOfExportJobResponse
    var NextToken: js.UndefOr[__string]
  }

  object ExportJobsResponse {
    @inline
    def apply(
        Item: ListOfExportJobResponse,
        NextToken: js.UndefOr[__string] = js.undefined
    ): ExportJobsResponse = {
      val __obj = js.Dynamic.literal(
        "Item" -> Item.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ExportJobsResponse]
    }
  }

  /** Specifies the status and settings of the GCM channel for an application. This channel enables Amazon Pinpoint to send push notifications through the Firebase Cloud Messaging (FCM), formerly Google Cloud Messaging (GCM), service.
    */
  @js.native
  trait GCMChannelRequest extends js.Object {
    var ApiKey: __string
    var Enabled: js.UndefOr[__boolean]
  }

  object GCMChannelRequest {
    @inline
    def apply(
        ApiKey: __string,
        Enabled: js.UndefOr[__boolean] = js.undefined
    ): GCMChannelRequest = {
      val __obj = js.Dynamic.literal(
        "ApiKey" -> ApiKey.asInstanceOf[js.Any]
      )

      Enabled.foreach(__v => __obj.updateDynamic("Enabled")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GCMChannelRequest]
    }
  }

  /** Provides information about the status and settings of the GCM channel for an application. The GCM channel enables Amazon Pinpoint to send push notifications through the Firebase Cloud Messaging (FCM), formerly Google Cloud Messaging (GCM), service.
    */
  @js.native
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

  object GCMChannelResponse {
    @inline
    def apply(
        Credential: __string,
        Platform: __string,
        ApplicationId: js.UndefOr[__string] = js.undefined,
        CreationDate: js.UndefOr[__string] = js.undefined,
        Enabled: js.UndefOr[__boolean] = js.undefined,
        HasCredential: js.UndefOr[__boolean] = js.undefined,
        Id: js.UndefOr[__string] = js.undefined,
        IsArchived: js.UndefOr[__boolean] = js.undefined,
        LastModifiedBy: js.UndefOr[__string] = js.undefined,
        LastModifiedDate: js.UndefOr[__string] = js.undefined,
        Version: js.UndefOr[__integer] = js.undefined
    ): GCMChannelResponse = {
      val __obj = js.Dynamic.literal(
        "Credential" -> Credential.asInstanceOf[js.Any],
        "Platform" -> Platform.asInstanceOf[js.Any]
      )

      ApplicationId.foreach(__v => __obj.updateDynamic("ApplicationId")(__v.asInstanceOf[js.Any]))
      CreationDate.foreach(__v => __obj.updateDynamic("CreationDate")(__v.asInstanceOf[js.Any]))
      Enabled.foreach(__v => __obj.updateDynamic("Enabled")(__v.asInstanceOf[js.Any]))
      HasCredential.foreach(__v => __obj.updateDynamic("HasCredential")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      IsArchived.foreach(__v => __obj.updateDynamic("IsArchived")(__v.asInstanceOf[js.Any]))
      LastModifiedBy.foreach(__v => __obj.updateDynamic("LastModifiedBy")(__v.asInstanceOf[js.Any]))
      LastModifiedDate.foreach(__v => __obj.updateDynamic("LastModifiedDate")(__v.asInstanceOf[js.Any]))
      Version.foreach(__v => __obj.updateDynamic("Version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GCMChannelResponse]
    }
  }

  /** Specifies the settings for a one-time message that's sent directly to an endpoint through the GCM channel. The GCM channel enables Amazon Pinpoint to send messages to the Firebase Cloud Messaging (FCM), formerly Google Cloud Messaging (GCM), service.
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
    @inline
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
      val __obj = js.Dynamic.literal()
      Action.foreach(__v => __obj.updateDynamic("Action")(__v.asInstanceOf[js.Any]))
      Body.foreach(__v => __obj.updateDynamic("Body")(__v.asInstanceOf[js.Any]))
      CollapseKey.foreach(__v => __obj.updateDynamic("CollapseKey")(__v.asInstanceOf[js.Any]))
      Data.foreach(__v => __obj.updateDynamic("Data")(__v.asInstanceOf[js.Any]))
      IconReference.foreach(__v => __obj.updateDynamic("IconReference")(__v.asInstanceOf[js.Any]))
      ImageIconUrl.foreach(__v => __obj.updateDynamic("ImageIconUrl")(__v.asInstanceOf[js.Any]))
      ImageUrl.foreach(__v => __obj.updateDynamic("ImageUrl")(__v.asInstanceOf[js.Any]))
      Priority.foreach(__v => __obj.updateDynamic("Priority")(__v.asInstanceOf[js.Any]))
      RawContent.foreach(__v => __obj.updateDynamic("RawContent")(__v.asInstanceOf[js.Any]))
      RestrictedPackageName.foreach(__v => __obj.updateDynamic("RestrictedPackageName")(__v.asInstanceOf[js.Any]))
      SilentPush.foreach(__v => __obj.updateDynamic("SilentPush")(__v.asInstanceOf[js.Any]))
      SmallImageIconUrl.foreach(__v => __obj.updateDynamic("SmallImageIconUrl")(__v.asInstanceOf[js.Any]))
      Sound.foreach(__v => __obj.updateDynamic("Sound")(__v.asInstanceOf[js.Any]))
      Substitutions.foreach(__v => __obj.updateDynamic("Substitutions")(__v.asInstanceOf[js.Any]))
      TimeToLive.foreach(__v => __obj.updateDynamic("TimeToLive")(__v.asInstanceOf[js.Any]))
      Title.foreach(__v => __obj.updateDynamic("Title")(__v.asInstanceOf[js.Any]))
      Url.foreach(__v => __obj.updateDynamic("Url")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GCMMessage]
    }
  }

  /** Specifies the GPS coordinates of a location.
    */
  @js.native
  trait GPSCoordinates extends js.Object {
    var Latitude: __double
    var Longitude: __double
  }

  object GPSCoordinates {
    @inline
    def apply(
        Latitude: __double,
        Longitude: __double
    ): GPSCoordinates = {
      val __obj = js.Dynamic.literal(
        "Latitude" -> Latitude.asInstanceOf[js.Any],
        "Longitude" -> Longitude.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GPSCoordinates]
    }
  }

  /** Specifies GPS-based criteria for including or excluding endpoints from a segment.
    */
  @js.native
  trait GPSPointDimension extends js.Object {
    var Coordinates: GPSCoordinates
    var RangeInKilometers: js.UndefOr[__double]
  }

  object GPSPointDimension {
    @inline
    def apply(
        Coordinates: GPSCoordinates,
        RangeInKilometers: js.UndefOr[__double] = js.undefined
    ): GPSPointDimension = {
      val __obj = js.Dynamic.literal(
        "Coordinates" -> Coordinates.asInstanceOf[js.Any]
      )

      RangeInKilometers.foreach(__v => __obj.updateDynamic("RangeInKilometers")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GPSPointDimension]
    }
  }

  @js.native
  trait GetAdmChannelRequest extends js.Object {
    var ApplicationId: __string
  }

  object GetAdmChannelRequest {
    @inline
    def apply(
        ApplicationId: __string
    ): GetAdmChannelRequest = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        ADMChannelResponse: ADMChannelResponse
    ): GetAdmChannelResponse = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        ApplicationId: __string
    ): GetApnsChannelRequest = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        APNSChannelResponse: APNSChannelResponse
    ): GetApnsChannelResponse = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        ApplicationId: __string
    ): GetApnsSandboxChannelRequest = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        APNSSandboxChannelResponse: APNSSandboxChannelResponse
    ): GetApnsSandboxChannelResponse = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        ApplicationId: __string
    ): GetApnsVoipChannelRequest = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        APNSVoipChannelResponse: APNSVoipChannelResponse
    ): GetApnsVoipChannelResponse = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        ApplicationId: __string
    ): GetApnsVoipSandboxChannelRequest = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        APNSVoipSandboxChannelResponse: APNSVoipSandboxChannelResponse
    ): GetApnsVoipSandboxChannelResponse = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        ApplicationId: __string
    ): GetAppRequest = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        ApplicationResponse: ApplicationResponse
    ): GetAppResponse = {
      val __obj = js.Dynamic.literal(
        "ApplicationResponse" -> ApplicationResponse.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetAppResponse]
    }
  }

  @js.native
  trait GetApplicationDateRangeKpiRequest extends js.Object {
    var ApplicationId: __string
    var KpiName: __string
    var EndTime: js.UndefOr[__timestampIso8601]
    var NextToken: js.UndefOr[__string]
    var PageSize: js.UndefOr[__string]
    var StartTime: js.UndefOr[__timestampIso8601]
  }

  object GetApplicationDateRangeKpiRequest {
    @inline
    def apply(
        ApplicationId: __string,
        KpiName: __string,
        EndTime: js.UndefOr[__timestampIso8601] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined,
        PageSize: js.UndefOr[__string] = js.undefined,
        StartTime: js.UndefOr[__timestampIso8601] = js.undefined
    ): GetApplicationDateRangeKpiRequest = {
      val __obj = js.Dynamic.literal(
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any],
        "KpiName" -> KpiName.asInstanceOf[js.Any]
      )

      EndTime.foreach(__v => __obj.updateDynamic("EndTime")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      PageSize.foreach(__v => __obj.updateDynamic("PageSize")(__v.asInstanceOf[js.Any]))
      StartTime.foreach(__v => __obj.updateDynamic("StartTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetApplicationDateRangeKpiRequest]
    }
  }

  @js.native
  trait GetApplicationDateRangeKpiResponse extends js.Object {
    var ApplicationDateRangeKpiResponse: ApplicationDateRangeKpiResponse
  }

  object GetApplicationDateRangeKpiResponse {
    @inline
    def apply(
        ApplicationDateRangeKpiResponse: ApplicationDateRangeKpiResponse
    ): GetApplicationDateRangeKpiResponse = {
      val __obj = js.Dynamic.literal(
        "ApplicationDateRangeKpiResponse" -> ApplicationDateRangeKpiResponse.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetApplicationDateRangeKpiResponse]
    }
  }

  @js.native
  trait GetApplicationSettingsRequest extends js.Object {
    var ApplicationId: __string
  }

  object GetApplicationSettingsRequest {
    @inline
    def apply(
        ApplicationId: __string
    ): GetApplicationSettingsRequest = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        ApplicationSettingsResource: ApplicationSettingsResource
    ): GetApplicationSettingsResponse = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        PageSize: js.UndefOr[__string] = js.undefined,
        Token: js.UndefOr[__string] = js.undefined
    ): GetAppsRequest = {
      val __obj = js.Dynamic.literal()
      PageSize.foreach(__v => __obj.updateDynamic("PageSize")(__v.asInstanceOf[js.Any]))
      Token.foreach(__v => __obj.updateDynamic("Token")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetAppsRequest]
    }
  }

  @js.native
  trait GetAppsResponse extends js.Object {
    var ApplicationsResponse: ApplicationsResponse
  }

  object GetAppsResponse {
    @inline
    def apply(
        ApplicationsResponse: ApplicationsResponse
    ): GetAppsResponse = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        ApplicationId: __string
    ): GetBaiduChannelRequest = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        BaiduChannelResponse: BaiduChannelResponse
    ): GetBaiduChannelResponse = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        ApplicationId: __string,
        CampaignId: __string,
        PageSize: js.UndefOr[__string] = js.undefined,
        Token: js.UndefOr[__string] = js.undefined
    ): GetCampaignActivitiesRequest = {
      val __obj = js.Dynamic.literal(
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any],
        "CampaignId" -> CampaignId.asInstanceOf[js.Any]
      )

      PageSize.foreach(__v => __obj.updateDynamic("PageSize")(__v.asInstanceOf[js.Any]))
      Token.foreach(__v => __obj.updateDynamic("Token")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetCampaignActivitiesRequest]
    }
  }

  @js.native
  trait GetCampaignActivitiesResponse extends js.Object {
    var ActivitiesResponse: ActivitiesResponse
  }

  object GetCampaignActivitiesResponse {
    @inline
    def apply(
        ActivitiesResponse: ActivitiesResponse
    ): GetCampaignActivitiesResponse = {
      val __obj = js.Dynamic.literal(
        "ActivitiesResponse" -> ActivitiesResponse.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetCampaignActivitiesResponse]
    }
  }

  @js.native
  trait GetCampaignDateRangeKpiRequest extends js.Object {
    var ApplicationId: __string
    var CampaignId: __string
    var KpiName: __string
    var EndTime: js.UndefOr[__timestampIso8601]
    var NextToken: js.UndefOr[__string]
    var PageSize: js.UndefOr[__string]
    var StartTime: js.UndefOr[__timestampIso8601]
  }

  object GetCampaignDateRangeKpiRequest {
    @inline
    def apply(
        ApplicationId: __string,
        CampaignId: __string,
        KpiName: __string,
        EndTime: js.UndefOr[__timestampIso8601] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined,
        PageSize: js.UndefOr[__string] = js.undefined,
        StartTime: js.UndefOr[__timestampIso8601] = js.undefined
    ): GetCampaignDateRangeKpiRequest = {
      val __obj = js.Dynamic.literal(
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any],
        "CampaignId" -> CampaignId.asInstanceOf[js.Any],
        "KpiName" -> KpiName.asInstanceOf[js.Any]
      )

      EndTime.foreach(__v => __obj.updateDynamic("EndTime")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      PageSize.foreach(__v => __obj.updateDynamic("PageSize")(__v.asInstanceOf[js.Any]))
      StartTime.foreach(__v => __obj.updateDynamic("StartTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetCampaignDateRangeKpiRequest]
    }
  }

  @js.native
  trait GetCampaignDateRangeKpiResponse extends js.Object {
    var CampaignDateRangeKpiResponse: CampaignDateRangeKpiResponse
  }

  object GetCampaignDateRangeKpiResponse {
    @inline
    def apply(
        CampaignDateRangeKpiResponse: CampaignDateRangeKpiResponse
    ): GetCampaignDateRangeKpiResponse = {
      val __obj = js.Dynamic.literal(
        "CampaignDateRangeKpiResponse" -> CampaignDateRangeKpiResponse.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetCampaignDateRangeKpiResponse]
    }
  }

  @js.native
  trait GetCampaignRequest extends js.Object {
    var ApplicationId: __string
    var CampaignId: __string
  }

  object GetCampaignRequest {
    @inline
    def apply(
        ApplicationId: __string,
        CampaignId: __string
    ): GetCampaignRequest = {
      val __obj = js.Dynamic.literal(
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any],
        "CampaignId" -> CampaignId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetCampaignRequest]
    }
  }

  @js.native
  trait GetCampaignResponse extends js.Object {
    var CampaignResponse: CampaignResponse
  }

  object GetCampaignResponse {
    @inline
    def apply(
        CampaignResponse: CampaignResponse
    ): GetCampaignResponse = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        ApplicationId: __string,
        CampaignId: __string,
        Version: __string
    ): GetCampaignVersionRequest = {
      val __obj = js.Dynamic.literal(
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any],
        "CampaignId" -> CampaignId.asInstanceOf[js.Any],
        "Version" -> Version.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetCampaignVersionRequest]
    }
  }

  @js.native
  trait GetCampaignVersionResponse extends js.Object {
    var CampaignResponse: CampaignResponse
  }

  object GetCampaignVersionResponse {
    @inline
    def apply(
        CampaignResponse: CampaignResponse
    ): GetCampaignVersionResponse = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        ApplicationId: __string,
        CampaignId: __string,
        PageSize: js.UndefOr[__string] = js.undefined,
        Token: js.UndefOr[__string] = js.undefined
    ): GetCampaignVersionsRequest = {
      val __obj = js.Dynamic.literal(
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any],
        "CampaignId" -> CampaignId.asInstanceOf[js.Any]
      )

      PageSize.foreach(__v => __obj.updateDynamic("PageSize")(__v.asInstanceOf[js.Any]))
      Token.foreach(__v => __obj.updateDynamic("Token")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetCampaignVersionsRequest]
    }
  }

  @js.native
  trait GetCampaignVersionsResponse extends js.Object {
    var CampaignsResponse: CampaignsResponse
  }

  object GetCampaignVersionsResponse {
    @inline
    def apply(
        CampaignsResponse: CampaignsResponse
    ): GetCampaignVersionsResponse = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        ApplicationId: __string,
        PageSize: js.UndefOr[__string] = js.undefined,
        Token: js.UndefOr[__string] = js.undefined
    ): GetCampaignsRequest = {
      val __obj = js.Dynamic.literal(
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any]
      )

      PageSize.foreach(__v => __obj.updateDynamic("PageSize")(__v.asInstanceOf[js.Any]))
      Token.foreach(__v => __obj.updateDynamic("Token")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetCampaignsRequest]
    }
  }

  @js.native
  trait GetCampaignsResponse extends js.Object {
    var CampaignsResponse: CampaignsResponse
  }

  object GetCampaignsResponse {
    @inline
    def apply(
        CampaignsResponse: CampaignsResponse
    ): GetCampaignsResponse = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        ApplicationId: __string
    ): GetChannelsRequest = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        ChannelsResponse: ChannelsResponse
    ): GetChannelsResponse = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        ApplicationId: __string
    ): GetEmailChannelRequest = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        EmailChannelResponse: EmailChannelResponse
    ): GetEmailChannelResponse = {
      val __obj = js.Dynamic.literal(
        "EmailChannelResponse" -> EmailChannelResponse.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetEmailChannelResponse]
    }
  }

  @js.native
  trait GetEmailTemplateRequest extends js.Object {
    var TemplateName: __string
    var Version: js.UndefOr[__string]
  }

  object GetEmailTemplateRequest {
    @inline
    def apply(
        TemplateName: __string,
        Version: js.UndefOr[__string] = js.undefined
    ): GetEmailTemplateRequest = {
      val __obj = js.Dynamic.literal(
        "TemplateName" -> TemplateName.asInstanceOf[js.Any]
      )

      Version.foreach(__v => __obj.updateDynamic("Version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetEmailTemplateRequest]
    }
  }

  @js.native
  trait GetEmailTemplateResponse extends js.Object {
    var EmailTemplateResponse: EmailTemplateResponse
  }

  object GetEmailTemplateResponse {
    @inline
    def apply(
        EmailTemplateResponse: EmailTemplateResponse
    ): GetEmailTemplateResponse = {
      val __obj = js.Dynamic.literal(
        "EmailTemplateResponse" -> EmailTemplateResponse.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetEmailTemplateResponse]
    }
  }

  @js.native
  trait GetEndpointRequest extends js.Object {
    var ApplicationId: __string
    var EndpointId: __string
  }

  object GetEndpointRequest {
    @inline
    def apply(
        ApplicationId: __string,
        EndpointId: __string
    ): GetEndpointRequest = {
      val __obj = js.Dynamic.literal(
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any],
        "EndpointId" -> EndpointId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetEndpointRequest]
    }
  }

  @js.native
  trait GetEndpointResponse extends js.Object {
    var EndpointResponse: EndpointResponse
  }

  object GetEndpointResponse {
    @inline
    def apply(
        EndpointResponse: EndpointResponse
    ): GetEndpointResponse = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        ApplicationId: __string
    ): GetEventStreamRequest = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        EventStream: EventStream
    ): GetEventStreamResponse = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        ApplicationId: __string,
        JobId: __string
    ): GetExportJobRequest = {
      val __obj = js.Dynamic.literal(
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any],
        "JobId" -> JobId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetExportJobRequest]
    }
  }

  @js.native
  trait GetExportJobResponse extends js.Object {
    var ExportJobResponse: ExportJobResponse
  }

  object GetExportJobResponse {
    @inline
    def apply(
        ExportJobResponse: ExportJobResponse
    ): GetExportJobResponse = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        ApplicationId: __string,
        PageSize: js.UndefOr[__string] = js.undefined,
        Token: js.UndefOr[__string] = js.undefined
    ): GetExportJobsRequest = {
      val __obj = js.Dynamic.literal(
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any]
      )

      PageSize.foreach(__v => __obj.updateDynamic("PageSize")(__v.asInstanceOf[js.Any]))
      Token.foreach(__v => __obj.updateDynamic("Token")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetExportJobsRequest]
    }
  }

  @js.native
  trait GetExportJobsResponse extends js.Object {
    var ExportJobsResponse: ExportJobsResponse
  }

  object GetExportJobsResponse {
    @inline
    def apply(
        ExportJobsResponse: ExportJobsResponse
    ): GetExportJobsResponse = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        ApplicationId: __string
    ): GetGcmChannelRequest = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        GCMChannelResponse: GCMChannelResponse
    ): GetGcmChannelResponse = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        ApplicationId: __string,
        JobId: __string
    ): GetImportJobRequest = {
      val __obj = js.Dynamic.literal(
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any],
        "JobId" -> JobId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetImportJobRequest]
    }
  }

  @js.native
  trait GetImportJobResponse extends js.Object {
    var ImportJobResponse: ImportJobResponse
  }

  object GetImportJobResponse {
    @inline
    def apply(
        ImportJobResponse: ImportJobResponse
    ): GetImportJobResponse = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        ApplicationId: __string,
        PageSize: js.UndefOr[__string] = js.undefined,
        Token: js.UndefOr[__string] = js.undefined
    ): GetImportJobsRequest = {
      val __obj = js.Dynamic.literal(
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any]
      )

      PageSize.foreach(__v => __obj.updateDynamic("PageSize")(__v.asInstanceOf[js.Any]))
      Token.foreach(__v => __obj.updateDynamic("Token")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetImportJobsRequest]
    }
  }

  @js.native
  trait GetImportJobsResponse extends js.Object {
    var ImportJobsResponse: ImportJobsResponse
  }

  object GetImportJobsResponse {
    @inline
    def apply(
        ImportJobsResponse: ImportJobsResponse
    ): GetImportJobsResponse = {
      val __obj = js.Dynamic.literal(
        "ImportJobsResponse" -> ImportJobsResponse.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetImportJobsResponse]
    }
  }

  @js.native
  trait GetInAppMessagesRequest extends js.Object {
    var ApplicationId: __string
    var EndpointId: __string
  }

  object GetInAppMessagesRequest {
    @inline
    def apply(
        ApplicationId: __string,
        EndpointId: __string
    ): GetInAppMessagesRequest = {
      val __obj = js.Dynamic.literal(
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any],
        "EndpointId" -> EndpointId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetInAppMessagesRequest]
    }
  }

  @js.native
  trait GetInAppMessagesResponse extends js.Object {
    var InAppMessagesResponse: InAppMessagesResponse
  }

  object GetInAppMessagesResponse {
    @inline
    def apply(
        InAppMessagesResponse: InAppMessagesResponse
    ): GetInAppMessagesResponse = {
      val __obj = js.Dynamic.literal(
        "InAppMessagesResponse" -> InAppMessagesResponse.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetInAppMessagesResponse]
    }
  }

  @js.native
  trait GetInAppTemplateRequest extends js.Object {
    var TemplateName: __string
    var Version: js.UndefOr[__string]
  }

  object GetInAppTemplateRequest {
    @inline
    def apply(
        TemplateName: __string,
        Version: js.UndefOr[__string] = js.undefined
    ): GetInAppTemplateRequest = {
      val __obj = js.Dynamic.literal(
        "TemplateName" -> TemplateName.asInstanceOf[js.Any]
      )

      Version.foreach(__v => __obj.updateDynamic("Version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetInAppTemplateRequest]
    }
  }

  @js.native
  trait GetInAppTemplateResponse extends js.Object {
    var InAppTemplateResponse: InAppTemplateResponse
  }

  object GetInAppTemplateResponse {
    @inline
    def apply(
        InAppTemplateResponse: InAppTemplateResponse
    ): GetInAppTemplateResponse = {
      val __obj = js.Dynamic.literal(
        "InAppTemplateResponse" -> InAppTemplateResponse.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetInAppTemplateResponse]
    }
  }

  @js.native
  trait GetJourneyDateRangeKpiRequest extends js.Object {
    var ApplicationId: __string
    var JourneyId: __string
    var KpiName: __string
    var EndTime: js.UndefOr[__timestampIso8601]
    var NextToken: js.UndefOr[__string]
    var PageSize: js.UndefOr[__string]
    var StartTime: js.UndefOr[__timestampIso8601]
  }

  object GetJourneyDateRangeKpiRequest {
    @inline
    def apply(
        ApplicationId: __string,
        JourneyId: __string,
        KpiName: __string,
        EndTime: js.UndefOr[__timestampIso8601] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined,
        PageSize: js.UndefOr[__string] = js.undefined,
        StartTime: js.UndefOr[__timestampIso8601] = js.undefined
    ): GetJourneyDateRangeKpiRequest = {
      val __obj = js.Dynamic.literal(
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any],
        "JourneyId" -> JourneyId.asInstanceOf[js.Any],
        "KpiName" -> KpiName.asInstanceOf[js.Any]
      )

      EndTime.foreach(__v => __obj.updateDynamic("EndTime")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      PageSize.foreach(__v => __obj.updateDynamic("PageSize")(__v.asInstanceOf[js.Any]))
      StartTime.foreach(__v => __obj.updateDynamic("StartTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetJourneyDateRangeKpiRequest]
    }
  }

  @js.native
  trait GetJourneyDateRangeKpiResponse extends js.Object {
    var JourneyDateRangeKpiResponse: JourneyDateRangeKpiResponse
  }

  object GetJourneyDateRangeKpiResponse {
    @inline
    def apply(
        JourneyDateRangeKpiResponse: JourneyDateRangeKpiResponse
    ): GetJourneyDateRangeKpiResponse = {
      val __obj = js.Dynamic.literal(
        "JourneyDateRangeKpiResponse" -> JourneyDateRangeKpiResponse.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetJourneyDateRangeKpiResponse]
    }
  }

  @js.native
  trait GetJourneyExecutionActivityMetricsRequest extends js.Object {
    var ApplicationId: __string
    var JourneyActivityId: __string
    var JourneyId: __string
    var NextToken: js.UndefOr[__string]
    var PageSize: js.UndefOr[__string]
  }

  object GetJourneyExecutionActivityMetricsRequest {
    @inline
    def apply(
        ApplicationId: __string,
        JourneyActivityId: __string,
        JourneyId: __string,
        NextToken: js.UndefOr[__string] = js.undefined,
        PageSize: js.UndefOr[__string] = js.undefined
    ): GetJourneyExecutionActivityMetricsRequest = {
      val __obj = js.Dynamic.literal(
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any],
        "JourneyActivityId" -> JourneyActivityId.asInstanceOf[js.Any],
        "JourneyId" -> JourneyId.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      PageSize.foreach(__v => __obj.updateDynamic("PageSize")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetJourneyExecutionActivityMetricsRequest]
    }
  }

  @js.native
  trait GetJourneyExecutionActivityMetricsResponse extends js.Object {
    var JourneyExecutionActivityMetricsResponse: JourneyExecutionActivityMetricsResponse
  }

  object GetJourneyExecutionActivityMetricsResponse {
    @inline
    def apply(
        JourneyExecutionActivityMetricsResponse: JourneyExecutionActivityMetricsResponse
    ): GetJourneyExecutionActivityMetricsResponse = {
      val __obj = js.Dynamic.literal(
        "JourneyExecutionActivityMetricsResponse" -> JourneyExecutionActivityMetricsResponse.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetJourneyExecutionActivityMetricsResponse]
    }
  }

  @js.native
  trait GetJourneyExecutionMetricsRequest extends js.Object {
    var ApplicationId: __string
    var JourneyId: __string
    var NextToken: js.UndefOr[__string]
    var PageSize: js.UndefOr[__string]
  }

  object GetJourneyExecutionMetricsRequest {
    @inline
    def apply(
        ApplicationId: __string,
        JourneyId: __string,
        NextToken: js.UndefOr[__string] = js.undefined,
        PageSize: js.UndefOr[__string] = js.undefined
    ): GetJourneyExecutionMetricsRequest = {
      val __obj = js.Dynamic.literal(
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any],
        "JourneyId" -> JourneyId.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      PageSize.foreach(__v => __obj.updateDynamic("PageSize")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetJourneyExecutionMetricsRequest]
    }
  }

  @js.native
  trait GetJourneyExecutionMetricsResponse extends js.Object {
    var JourneyExecutionMetricsResponse: JourneyExecutionMetricsResponse
  }

  object GetJourneyExecutionMetricsResponse {
    @inline
    def apply(
        JourneyExecutionMetricsResponse: JourneyExecutionMetricsResponse
    ): GetJourneyExecutionMetricsResponse = {
      val __obj = js.Dynamic.literal(
        "JourneyExecutionMetricsResponse" -> JourneyExecutionMetricsResponse.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetJourneyExecutionMetricsResponse]
    }
  }

  @js.native
  trait GetJourneyRequest extends js.Object {
    var ApplicationId: __string
    var JourneyId: __string
  }

  object GetJourneyRequest {
    @inline
    def apply(
        ApplicationId: __string,
        JourneyId: __string
    ): GetJourneyRequest = {
      val __obj = js.Dynamic.literal(
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any],
        "JourneyId" -> JourneyId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetJourneyRequest]
    }
  }

  @js.native
  trait GetJourneyResponse extends js.Object {
    var JourneyResponse: JourneyResponse
  }

  object GetJourneyResponse {
    @inline
    def apply(
        JourneyResponse: JourneyResponse
    ): GetJourneyResponse = {
      val __obj = js.Dynamic.literal(
        "JourneyResponse" -> JourneyResponse.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetJourneyResponse]
    }
  }

  @js.native
  trait GetPushTemplateRequest extends js.Object {
    var TemplateName: __string
    var Version: js.UndefOr[__string]
  }

  object GetPushTemplateRequest {
    @inline
    def apply(
        TemplateName: __string,
        Version: js.UndefOr[__string] = js.undefined
    ): GetPushTemplateRequest = {
      val __obj = js.Dynamic.literal(
        "TemplateName" -> TemplateName.asInstanceOf[js.Any]
      )

      Version.foreach(__v => __obj.updateDynamic("Version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetPushTemplateRequest]
    }
  }

  @js.native
  trait GetPushTemplateResponse extends js.Object {
    var PushNotificationTemplateResponse: PushNotificationTemplateResponse
  }

  object GetPushTemplateResponse {
    @inline
    def apply(
        PushNotificationTemplateResponse: PushNotificationTemplateResponse
    ): GetPushTemplateResponse = {
      val __obj = js.Dynamic.literal(
        "PushNotificationTemplateResponse" -> PushNotificationTemplateResponse.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetPushTemplateResponse]
    }
  }

  @js.native
  trait GetRecommenderConfigurationRequest extends js.Object {
    var RecommenderId: __string
  }

  object GetRecommenderConfigurationRequest {
    @inline
    def apply(
        RecommenderId: __string
    ): GetRecommenderConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "RecommenderId" -> RecommenderId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetRecommenderConfigurationRequest]
    }
  }

  @js.native
  trait GetRecommenderConfigurationResponse extends js.Object {
    var RecommenderConfigurationResponse: RecommenderConfigurationResponse
  }

  object GetRecommenderConfigurationResponse {
    @inline
    def apply(
        RecommenderConfigurationResponse: RecommenderConfigurationResponse
    ): GetRecommenderConfigurationResponse = {
      val __obj = js.Dynamic.literal(
        "RecommenderConfigurationResponse" -> RecommenderConfigurationResponse.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetRecommenderConfigurationResponse]
    }
  }

  @js.native
  trait GetRecommenderConfigurationsRequest extends js.Object {
    var PageSize: js.UndefOr[__string]
    var Token: js.UndefOr[__string]
  }

  object GetRecommenderConfigurationsRequest {
    @inline
    def apply(
        PageSize: js.UndefOr[__string] = js.undefined,
        Token: js.UndefOr[__string] = js.undefined
    ): GetRecommenderConfigurationsRequest = {
      val __obj = js.Dynamic.literal()
      PageSize.foreach(__v => __obj.updateDynamic("PageSize")(__v.asInstanceOf[js.Any]))
      Token.foreach(__v => __obj.updateDynamic("Token")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetRecommenderConfigurationsRequest]
    }
  }

  @js.native
  trait GetRecommenderConfigurationsResponse extends js.Object {
    var ListRecommenderConfigurationsResponse: ListRecommenderConfigurationsResponse
  }

  object GetRecommenderConfigurationsResponse {
    @inline
    def apply(
        ListRecommenderConfigurationsResponse: ListRecommenderConfigurationsResponse
    ): GetRecommenderConfigurationsResponse = {
      val __obj = js.Dynamic.literal(
        "ListRecommenderConfigurationsResponse" -> ListRecommenderConfigurationsResponse.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetRecommenderConfigurationsResponse]
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
    @inline
    def apply(
        ApplicationId: __string,
        SegmentId: __string,
        PageSize: js.UndefOr[__string] = js.undefined,
        Token: js.UndefOr[__string] = js.undefined
    ): GetSegmentExportJobsRequest = {
      val __obj = js.Dynamic.literal(
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any],
        "SegmentId" -> SegmentId.asInstanceOf[js.Any]
      )

      PageSize.foreach(__v => __obj.updateDynamic("PageSize")(__v.asInstanceOf[js.Any]))
      Token.foreach(__v => __obj.updateDynamic("Token")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetSegmentExportJobsRequest]
    }
  }

  @js.native
  trait GetSegmentExportJobsResponse extends js.Object {
    var ExportJobsResponse: ExportJobsResponse
  }

  object GetSegmentExportJobsResponse {
    @inline
    def apply(
        ExportJobsResponse: ExportJobsResponse
    ): GetSegmentExportJobsResponse = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        ApplicationId: __string,
        SegmentId: __string,
        PageSize: js.UndefOr[__string] = js.undefined,
        Token: js.UndefOr[__string] = js.undefined
    ): GetSegmentImportJobsRequest = {
      val __obj = js.Dynamic.literal(
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any],
        "SegmentId" -> SegmentId.asInstanceOf[js.Any]
      )

      PageSize.foreach(__v => __obj.updateDynamic("PageSize")(__v.asInstanceOf[js.Any]))
      Token.foreach(__v => __obj.updateDynamic("Token")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetSegmentImportJobsRequest]
    }
  }

  @js.native
  trait GetSegmentImportJobsResponse extends js.Object {
    var ImportJobsResponse: ImportJobsResponse
  }

  object GetSegmentImportJobsResponse {
    @inline
    def apply(
        ImportJobsResponse: ImportJobsResponse
    ): GetSegmentImportJobsResponse = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        ApplicationId: __string,
        SegmentId: __string
    ): GetSegmentRequest = {
      val __obj = js.Dynamic.literal(
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any],
        "SegmentId" -> SegmentId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetSegmentRequest]
    }
  }

  @js.native
  trait GetSegmentResponse extends js.Object {
    var SegmentResponse: SegmentResponse
  }

  object GetSegmentResponse {
    @inline
    def apply(
        SegmentResponse: SegmentResponse
    ): GetSegmentResponse = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        ApplicationId: __string,
        SegmentId: __string,
        Version: __string
    ): GetSegmentVersionRequest = {
      val __obj = js.Dynamic.literal(
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any],
        "SegmentId" -> SegmentId.asInstanceOf[js.Any],
        "Version" -> Version.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetSegmentVersionRequest]
    }
  }

  @js.native
  trait GetSegmentVersionResponse extends js.Object {
    var SegmentResponse: SegmentResponse
  }

  object GetSegmentVersionResponse {
    @inline
    def apply(
        SegmentResponse: SegmentResponse
    ): GetSegmentVersionResponse = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        ApplicationId: __string,
        SegmentId: __string,
        PageSize: js.UndefOr[__string] = js.undefined,
        Token: js.UndefOr[__string] = js.undefined
    ): GetSegmentVersionsRequest = {
      val __obj = js.Dynamic.literal(
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any],
        "SegmentId" -> SegmentId.asInstanceOf[js.Any]
      )

      PageSize.foreach(__v => __obj.updateDynamic("PageSize")(__v.asInstanceOf[js.Any]))
      Token.foreach(__v => __obj.updateDynamic("Token")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetSegmentVersionsRequest]
    }
  }

  @js.native
  trait GetSegmentVersionsResponse extends js.Object {
    var SegmentsResponse: SegmentsResponse
  }

  object GetSegmentVersionsResponse {
    @inline
    def apply(
        SegmentsResponse: SegmentsResponse
    ): GetSegmentVersionsResponse = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        ApplicationId: __string,
        PageSize: js.UndefOr[__string] = js.undefined,
        Token: js.UndefOr[__string] = js.undefined
    ): GetSegmentsRequest = {
      val __obj = js.Dynamic.literal(
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any]
      )

      PageSize.foreach(__v => __obj.updateDynamic("PageSize")(__v.asInstanceOf[js.Any]))
      Token.foreach(__v => __obj.updateDynamic("Token")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetSegmentsRequest]
    }
  }

  @js.native
  trait GetSegmentsResponse extends js.Object {
    var SegmentsResponse: SegmentsResponse
  }

  object GetSegmentsResponse {
    @inline
    def apply(
        SegmentsResponse: SegmentsResponse
    ): GetSegmentsResponse = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        ApplicationId: __string
    ): GetSmsChannelRequest = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        SMSChannelResponse: SMSChannelResponse
    ): GetSmsChannelResponse = {
      val __obj = js.Dynamic.literal(
        "SMSChannelResponse" -> SMSChannelResponse.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetSmsChannelResponse]
    }
  }

  @js.native
  trait GetSmsTemplateRequest extends js.Object {
    var TemplateName: __string
    var Version: js.UndefOr[__string]
  }

  object GetSmsTemplateRequest {
    @inline
    def apply(
        TemplateName: __string,
        Version: js.UndefOr[__string] = js.undefined
    ): GetSmsTemplateRequest = {
      val __obj = js.Dynamic.literal(
        "TemplateName" -> TemplateName.asInstanceOf[js.Any]
      )

      Version.foreach(__v => __obj.updateDynamic("Version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetSmsTemplateRequest]
    }
  }

  @js.native
  trait GetSmsTemplateResponse extends js.Object {
    var SMSTemplateResponse: SMSTemplateResponse
  }

  object GetSmsTemplateResponse {
    @inline
    def apply(
        SMSTemplateResponse: SMSTemplateResponse
    ): GetSmsTemplateResponse = {
      val __obj = js.Dynamic.literal(
        "SMSTemplateResponse" -> SMSTemplateResponse.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetSmsTemplateResponse]
    }
  }

  @js.native
  trait GetUserEndpointsRequest extends js.Object {
    var ApplicationId: __string
    var UserId: __string
  }

  object GetUserEndpointsRequest {
    @inline
    def apply(
        ApplicationId: __string,
        UserId: __string
    ): GetUserEndpointsRequest = {
      val __obj = js.Dynamic.literal(
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any],
        "UserId" -> UserId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetUserEndpointsRequest]
    }
  }

  @js.native
  trait GetUserEndpointsResponse extends js.Object {
    var EndpointsResponse: EndpointsResponse
  }

  object GetUserEndpointsResponse {
    @inline
    def apply(
        EndpointsResponse: EndpointsResponse
    ): GetUserEndpointsResponse = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        ApplicationId: __string
    ): GetVoiceChannelRequest = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        VoiceChannelResponse: VoiceChannelResponse
    ): GetVoiceChannelResponse = {
      val __obj = js.Dynamic.literal(
        "VoiceChannelResponse" -> VoiceChannelResponse.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetVoiceChannelResponse]
    }
  }

  @js.native
  trait GetVoiceTemplateRequest extends js.Object {
    var TemplateName: __string
    var Version: js.UndefOr[__string]
  }

  object GetVoiceTemplateRequest {
    @inline
    def apply(
        TemplateName: __string,
        Version: js.UndefOr[__string] = js.undefined
    ): GetVoiceTemplateRequest = {
      val __obj = js.Dynamic.literal(
        "TemplateName" -> TemplateName.asInstanceOf[js.Any]
      )

      Version.foreach(__v => __obj.updateDynamic("Version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetVoiceTemplateRequest]
    }
  }

  @js.native
  trait GetVoiceTemplateResponse extends js.Object {
    var VoiceTemplateResponse: VoiceTemplateResponse
  }

  object GetVoiceTemplateResponse {
    @inline
    def apply(
        VoiceTemplateResponse: VoiceTemplateResponse
    ): GetVoiceTemplateResponse = {
      val __obj = js.Dynamic.literal(
        "VoiceTemplateResponse" -> VoiceTemplateResponse.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetVoiceTemplateResponse]
    }
  }

  /** Specifies the settings for a holdout activity in a journey. This type of activity stops a journey for a specified percentage of participants.
    */
  @js.native
  trait HoldoutActivity extends js.Object {
    var Percentage: __integer
    var NextActivity: js.UndefOr[__string]
  }

  object HoldoutActivity {
    @inline
    def apply(
        Percentage: __integer,
        NextActivity: js.UndefOr[__string] = js.undefined
    ): HoldoutActivity = {
      val __obj = js.Dynamic.literal(
        "Percentage" -> Percentage.asInstanceOf[js.Any]
      )

      NextActivity.foreach(__v => __obj.updateDynamic("NextActivity")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HoldoutActivity]
    }
  }

  /** Specifies the settings for a job that imports endpoint definitions from an Amazon Simple Storage Service (Amazon S3) bucket.
    */
  @js.native
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

  object ImportJobRequest {
    @inline
    def apply(
        Format: Format,
        RoleArn: __string,
        S3Url: __string,
        DefineSegment: js.UndefOr[__boolean] = js.undefined,
        ExternalId: js.UndefOr[__string] = js.undefined,
        RegisterEndpoints: js.UndefOr[__boolean] = js.undefined,
        SegmentId: js.UndefOr[__string] = js.undefined,
        SegmentName: js.UndefOr[__string] = js.undefined
    ): ImportJobRequest = {
      val __obj = js.Dynamic.literal(
        "Format" -> Format.asInstanceOf[js.Any],
        "RoleArn" -> RoleArn.asInstanceOf[js.Any],
        "S3Url" -> S3Url.asInstanceOf[js.Any]
      )

      DefineSegment.foreach(__v => __obj.updateDynamic("DefineSegment")(__v.asInstanceOf[js.Any]))
      ExternalId.foreach(__v => __obj.updateDynamic("ExternalId")(__v.asInstanceOf[js.Any]))
      RegisterEndpoints.foreach(__v => __obj.updateDynamic("RegisterEndpoints")(__v.asInstanceOf[js.Any]))
      SegmentId.foreach(__v => __obj.updateDynamic("SegmentId")(__v.asInstanceOf[js.Any]))
      SegmentName.foreach(__v => __obj.updateDynamic("SegmentName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ImportJobRequest]
    }
  }

  /** Provides information about the resource settings for a job that imports endpoint definitions from one or more files. The files can be stored in an Amazon Simple Storage Service (Amazon S3) bucket or uploaded directly from a computer by using the Amazon Pinpoint console.
    */
  @js.native
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

  object ImportJobResource {
    @inline
    def apply(
        Format: Format,
        RoleArn: __string,
        S3Url: __string,
        DefineSegment: js.UndefOr[__boolean] = js.undefined,
        ExternalId: js.UndefOr[__string] = js.undefined,
        RegisterEndpoints: js.UndefOr[__boolean] = js.undefined,
        SegmentId: js.UndefOr[__string] = js.undefined,
        SegmentName: js.UndefOr[__string] = js.undefined
    ): ImportJobResource = {
      val __obj = js.Dynamic.literal(
        "Format" -> Format.asInstanceOf[js.Any],
        "RoleArn" -> RoleArn.asInstanceOf[js.Any],
        "S3Url" -> S3Url.asInstanceOf[js.Any]
      )

      DefineSegment.foreach(__v => __obj.updateDynamic("DefineSegment")(__v.asInstanceOf[js.Any]))
      ExternalId.foreach(__v => __obj.updateDynamic("ExternalId")(__v.asInstanceOf[js.Any]))
      RegisterEndpoints.foreach(__v => __obj.updateDynamic("RegisterEndpoints")(__v.asInstanceOf[js.Any]))
      SegmentId.foreach(__v => __obj.updateDynamic("SegmentId")(__v.asInstanceOf[js.Any]))
      SegmentName.foreach(__v => __obj.updateDynamic("SegmentName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ImportJobResource]
    }
  }

  /** Provides information about the status and settings of a job that imports endpoint definitions from one or more files. The files can be stored in an Amazon Simple Storage Service (Amazon S3) bucket or uploaded directly from a computer by using the Amazon Pinpoint console.
    */
  @js.native
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

  object ImportJobResponse {
    @inline
    def apply(
        ApplicationId: __string,
        CreationDate: __string,
        Definition: ImportJobResource,
        Id: __string,
        JobStatus: JobStatus,
        Type: __string,
        CompletedPieces: js.UndefOr[__integer] = js.undefined,
        CompletionDate: js.UndefOr[__string] = js.undefined,
        FailedPieces: js.UndefOr[__integer] = js.undefined,
        Failures: js.UndefOr[ListOf__string] = js.undefined,
        TotalFailures: js.UndefOr[__integer] = js.undefined,
        TotalPieces: js.UndefOr[__integer] = js.undefined,
        TotalProcessed: js.UndefOr[__integer] = js.undefined
    ): ImportJobResponse = {
      val __obj = js.Dynamic.literal(
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any],
        "CreationDate" -> CreationDate.asInstanceOf[js.Any],
        "Definition" -> Definition.asInstanceOf[js.Any],
        "Id" -> Id.asInstanceOf[js.Any],
        "JobStatus" -> JobStatus.asInstanceOf[js.Any],
        "Type" -> Type.asInstanceOf[js.Any]
      )

      CompletedPieces.foreach(__v => __obj.updateDynamic("CompletedPieces")(__v.asInstanceOf[js.Any]))
      CompletionDate.foreach(__v => __obj.updateDynamic("CompletionDate")(__v.asInstanceOf[js.Any]))
      FailedPieces.foreach(__v => __obj.updateDynamic("FailedPieces")(__v.asInstanceOf[js.Any]))
      Failures.foreach(__v => __obj.updateDynamic("Failures")(__v.asInstanceOf[js.Any]))
      TotalFailures.foreach(__v => __obj.updateDynamic("TotalFailures")(__v.asInstanceOf[js.Any]))
      TotalPieces.foreach(__v => __obj.updateDynamic("TotalPieces")(__v.asInstanceOf[js.Any]))
      TotalProcessed.foreach(__v => __obj.updateDynamic("TotalProcessed")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ImportJobResponse]
    }
  }

  /** Provides information about the status and settings of all the import jobs that are associated with an application or segment. An import job is a job that imports endpoint definitions from one or more files.
    */
  @js.native
  trait ImportJobsResponse extends js.Object {
    var Item: ListOfImportJobResponse
    var NextToken: js.UndefOr[__string]
  }

  object ImportJobsResponse {
    @inline
    def apply(
        Item: ListOfImportJobResponse,
        NextToken: js.UndefOr[__string] = js.undefined
    ): ImportJobsResponse = {
      val __obj = js.Dynamic.literal(
        "Item" -> Item.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ImportJobsResponse]
    }
  }

  /** Schedule of the campaign.
    */
  @js.native
  trait InAppCampaignSchedule extends js.Object {
    var EndDate: js.UndefOr[__string]
    var EventFilter: js.UndefOr[CampaignEventFilter]
    var QuietTime: js.UndefOr[QuietTime]
  }

  object InAppCampaignSchedule {
    @inline
    def apply(
        EndDate: js.UndefOr[__string] = js.undefined,
        EventFilter: js.UndefOr[CampaignEventFilter] = js.undefined,
        QuietTime: js.UndefOr[QuietTime] = js.undefined
    ): InAppCampaignSchedule = {
      val __obj = js.Dynamic.literal()
      EndDate.foreach(__v => __obj.updateDynamic("EndDate")(__v.asInstanceOf[js.Any]))
      EventFilter.foreach(__v => __obj.updateDynamic("EventFilter")(__v.asInstanceOf[js.Any]))
      QuietTime.foreach(__v => __obj.updateDynamic("QuietTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InAppCampaignSchedule]
    }
  }

  /** Provides all fields required for building an in-app message.
    */
  @js.native
  trait InAppMessage extends js.Object {
    var Content: js.UndefOr[ListOfInAppMessageContent]
    var CustomConfig: js.UndefOr[MapOf__string]
    var Layout: js.UndefOr[Layout]
  }

  object InAppMessage {
    @inline
    def apply(
        Content: js.UndefOr[ListOfInAppMessageContent] = js.undefined,
        CustomConfig: js.UndefOr[MapOf__string] = js.undefined,
        Layout: js.UndefOr[Layout] = js.undefined
    ): InAppMessage = {
      val __obj = js.Dynamic.literal()
      Content.foreach(__v => __obj.updateDynamic("Content")(__v.asInstanceOf[js.Any]))
      CustomConfig.foreach(__v => __obj.updateDynamic("CustomConfig")(__v.asInstanceOf[js.Any]))
      Layout.foreach(__v => __obj.updateDynamic("Layout")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InAppMessage]
    }
  }

  /** Text config for Message Body.
    */
  @js.native
  trait InAppMessageBodyConfig extends js.Object {
    var Alignment: Alignment
    var Body: __string
    var TextColor: __string
  }

  object InAppMessageBodyConfig {
    @inline
    def apply(
        Alignment: Alignment,
        Body: __string,
        TextColor: __string
    ): InAppMessageBodyConfig = {
      val __obj = js.Dynamic.literal(
        "Alignment" -> Alignment.asInstanceOf[js.Any],
        "Body" -> Body.asInstanceOf[js.Any],
        "TextColor" -> TextColor.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[InAppMessageBodyConfig]
    }
  }

  /** Button Config for an in-app message.
    */
  @js.native
  trait InAppMessageButton extends js.Object {
    var Android: js.UndefOr[OverrideButtonConfiguration]
    var DefaultConfig: js.UndefOr[DefaultButtonConfiguration]
    var IOS: js.UndefOr[OverrideButtonConfiguration]
    var Web: js.UndefOr[OverrideButtonConfiguration]
  }

  object InAppMessageButton {
    @inline
    def apply(
        Android: js.UndefOr[OverrideButtonConfiguration] = js.undefined,
        DefaultConfig: js.UndefOr[DefaultButtonConfiguration] = js.undefined,
        IOS: js.UndefOr[OverrideButtonConfiguration] = js.undefined,
        Web: js.UndefOr[OverrideButtonConfiguration] = js.undefined
    ): InAppMessageButton = {
      val __obj = js.Dynamic.literal()
      Android.foreach(__v => __obj.updateDynamic("Android")(__v.asInstanceOf[js.Any]))
      DefaultConfig.foreach(__v => __obj.updateDynamic("DefaultConfig")(__v.asInstanceOf[js.Any]))
      IOS.foreach(__v => __obj.updateDynamic("IOS")(__v.asInstanceOf[js.Any]))
      Web.foreach(__v => __obj.updateDynamic("Web")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InAppMessageButton]
    }
  }

  /** Targeted in-app message campaign.
    */
  @js.native
  trait InAppMessageCampaign extends js.Object {
    var CampaignId: js.UndefOr[__string]
    var DailyCap: js.UndefOr[__integer]
    var InAppMessage: js.UndefOr[InAppMessage]
    var Priority: js.UndefOr[__integer]
    var Schedule: js.UndefOr[InAppCampaignSchedule]
    var SessionCap: js.UndefOr[__integer]
    var TotalCap: js.UndefOr[__integer]
    var TreatmentId: js.UndefOr[__string]
  }

  object InAppMessageCampaign {
    @inline
    def apply(
        CampaignId: js.UndefOr[__string] = js.undefined,
        DailyCap: js.UndefOr[__integer] = js.undefined,
        InAppMessage: js.UndefOr[InAppMessage] = js.undefined,
        Priority: js.UndefOr[__integer] = js.undefined,
        Schedule: js.UndefOr[InAppCampaignSchedule] = js.undefined,
        SessionCap: js.UndefOr[__integer] = js.undefined,
        TotalCap: js.UndefOr[__integer] = js.undefined,
        TreatmentId: js.UndefOr[__string] = js.undefined
    ): InAppMessageCampaign = {
      val __obj = js.Dynamic.literal()
      CampaignId.foreach(__v => __obj.updateDynamic("CampaignId")(__v.asInstanceOf[js.Any]))
      DailyCap.foreach(__v => __obj.updateDynamic("DailyCap")(__v.asInstanceOf[js.Any]))
      InAppMessage.foreach(__v => __obj.updateDynamic("InAppMessage")(__v.asInstanceOf[js.Any]))
      Priority.foreach(__v => __obj.updateDynamic("Priority")(__v.asInstanceOf[js.Any]))
      Schedule.foreach(__v => __obj.updateDynamic("Schedule")(__v.asInstanceOf[js.Any]))
      SessionCap.foreach(__v => __obj.updateDynamic("SessionCap")(__v.asInstanceOf[js.Any]))
      TotalCap.foreach(__v => __obj.updateDynamic("TotalCap")(__v.asInstanceOf[js.Any]))
      TreatmentId.foreach(__v => __obj.updateDynamic("TreatmentId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InAppMessageCampaign]
    }
  }

  /** The configuration for the message content.
    */
  @js.native
  trait InAppMessageContent extends js.Object {
    var BackgroundColor: js.UndefOr[__string]
    var BodyConfig: js.UndefOr[InAppMessageBodyConfig]
    var HeaderConfig: js.UndefOr[InAppMessageHeaderConfig]
    var ImageUrl: js.UndefOr[__string]
    var PrimaryBtn: js.UndefOr[InAppMessageButton]
    var SecondaryBtn: js.UndefOr[InAppMessageButton]
  }

  object InAppMessageContent {
    @inline
    def apply(
        BackgroundColor: js.UndefOr[__string] = js.undefined,
        BodyConfig: js.UndefOr[InAppMessageBodyConfig] = js.undefined,
        HeaderConfig: js.UndefOr[InAppMessageHeaderConfig] = js.undefined,
        ImageUrl: js.UndefOr[__string] = js.undefined,
        PrimaryBtn: js.UndefOr[InAppMessageButton] = js.undefined,
        SecondaryBtn: js.UndefOr[InAppMessageButton] = js.undefined
    ): InAppMessageContent = {
      val __obj = js.Dynamic.literal()
      BackgroundColor.foreach(__v => __obj.updateDynamic("BackgroundColor")(__v.asInstanceOf[js.Any]))
      BodyConfig.foreach(__v => __obj.updateDynamic("BodyConfig")(__v.asInstanceOf[js.Any]))
      HeaderConfig.foreach(__v => __obj.updateDynamic("HeaderConfig")(__v.asInstanceOf[js.Any]))
      ImageUrl.foreach(__v => __obj.updateDynamic("ImageUrl")(__v.asInstanceOf[js.Any]))
      PrimaryBtn.foreach(__v => __obj.updateDynamic("PrimaryBtn")(__v.asInstanceOf[js.Any]))
      SecondaryBtn.foreach(__v => __obj.updateDynamic("SecondaryBtn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InAppMessageContent]
    }
  }

  /** Text config for Message Header.
    */
  @js.native
  trait InAppMessageHeaderConfig extends js.Object {
    var Alignment: Alignment
    var Header: __string
    var TextColor: __string
  }

  object InAppMessageHeaderConfig {
    @inline
    def apply(
        Alignment: Alignment,
        Header: __string,
        TextColor: __string
    ): InAppMessageHeaderConfig = {
      val __obj = js.Dynamic.literal(
        "Alignment" -> Alignment.asInstanceOf[js.Any],
        "Header" -> Header.asInstanceOf[js.Any],
        "TextColor" -> TextColor.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[InAppMessageHeaderConfig]
    }
  }

  /** Get in-app messages response object.
    */
  @js.native
  trait InAppMessagesResponse extends js.Object {
    var InAppMessageCampaigns: js.UndefOr[ListOfInAppMessageCampaign]
  }

  object InAppMessagesResponse {
    @inline
    def apply(
        InAppMessageCampaigns: js.UndefOr[ListOfInAppMessageCampaign] = js.undefined
    ): InAppMessagesResponse = {
      val __obj = js.Dynamic.literal()
      InAppMessageCampaigns.foreach(__v => __obj.updateDynamic("InAppMessageCampaigns")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InAppMessagesResponse]
    }
  }

  /** InApp Template Request.
    */
  @js.native
  trait InAppTemplateRequest extends js.Object {
    var Content: js.UndefOr[ListOfInAppMessageContent]
    var CustomConfig: js.UndefOr[MapOf__string]
    var Layout: js.UndefOr[Layout]
    var TemplateDescription: js.UndefOr[__string]
    var tags: js.UndefOr[MapOf__string]
  }

  object InAppTemplateRequest {
    @inline
    def apply(
        Content: js.UndefOr[ListOfInAppMessageContent] = js.undefined,
        CustomConfig: js.UndefOr[MapOf__string] = js.undefined,
        Layout: js.UndefOr[Layout] = js.undefined,
        TemplateDescription: js.UndefOr[__string] = js.undefined,
        tags: js.UndefOr[MapOf__string] = js.undefined
    ): InAppTemplateRequest = {
      val __obj = js.Dynamic.literal()
      Content.foreach(__v => __obj.updateDynamic("Content")(__v.asInstanceOf[js.Any]))
      CustomConfig.foreach(__v => __obj.updateDynamic("CustomConfig")(__v.asInstanceOf[js.Any]))
      Layout.foreach(__v => __obj.updateDynamic("Layout")(__v.asInstanceOf[js.Any]))
      TemplateDescription.foreach(__v => __obj.updateDynamic("TemplateDescription")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InAppTemplateRequest]
    }
  }

  /** In-App Template Response.
    */
  @js.native
  trait InAppTemplateResponse extends js.Object {
    var CreationDate: __string
    var LastModifiedDate: __string
    var TemplateName: __string
    var TemplateType: TemplateType
    var Arn: js.UndefOr[__string]
    var Content: js.UndefOr[ListOfInAppMessageContent]
    var CustomConfig: js.UndefOr[MapOf__string]
    var Layout: js.UndefOr[Layout]
    var TemplateDescription: js.UndefOr[__string]
    var Version: js.UndefOr[__string]
    var tags: js.UndefOr[MapOf__string]
  }

  object InAppTemplateResponse {
    @inline
    def apply(
        CreationDate: __string,
        LastModifiedDate: __string,
        TemplateName: __string,
        TemplateType: TemplateType,
        Arn: js.UndefOr[__string] = js.undefined,
        Content: js.UndefOr[ListOfInAppMessageContent] = js.undefined,
        CustomConfig: js.UndefOr[MapOf__string] = js.undefined,
        Layout: js.UndefOr[Layout] = js.undefined,
        TemplateDescription: js.UndefOr[__string] = js.undefined,
        Version: js.UndefOr[__string] = js.undefined,
        tags: js.UndefOr[MapOf__string] = js.undefined
    ): InAppTemplateResponse = {
      val __obj = js.Dynamic.literal(
        "CreationDate" -> CreationDate.asInstanceOf[js.Any],
        "LastModifiedDate" -> LastModifiedDate.asInstanceOf[js.Any],
        "TemplateName" -> TemplateName.asInstanceOf[js.Any],
        "TemplateType" -> TemplateType.asInstanceOf[js.Any]
      )

      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      Content.foreach(__v => __obj.updateDynamic("Content")(__v.asInstanceOf[js.Any]))
      CustomConfig.foreach(__v => __obj.updateDynamic("CustomConfig")(__v.asInstanceOf[js.Any]))
      Layout.foreach(__v => __obj.updateDynamic("Layout")(__v.asInstanceOf[js.Any]))
      TemplateDescription.foreach(__v => __obj.updateDynamic("TemplateDescription")(__v.asInstanceOf[js.Any]))
      Version.foreach(__v => __obj.updateDynamic("Version")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InAppTemplateResponse]
    }
  }

  /** Provides information about the results of a request to create or update an endpoint that's associated with an event.
    */
  @js.native
  trait ItemResponse extends js.Object {
    var EndpointItemResponse: js.UndefOr[EndpointItemResponse]
    var EventsItemResponse: js.UndefOr[MapOfEventItemResponse]
  }

  object ItemResponse {
    @inline
    def apply(
        EndpointItemResponse: js.UndefOr[EndpointItemResponse] = js.undefined,
        EventsItemResponse: js.UndefOr[MapOfEventItemResponse] = js.undefined
    ): ItemResponse = {
      val __obj = js.Dynamic.literal()
      EndpointItemResponse.foreach(__v => __obj.updateDynamic("EndpointItemResponse")(__v.asInstanceOf[js.Any]))
      EventsItemResponse.foreach(__v => __obj.updateDynamic("EventsItemResponse")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ItemResponse]
    }
  }

  /** The channel-specific configurations for the journey.
    */
  @js.native
  trait JourneyChannelSettings extends js.Object {
    var ConnectCampaignArn: js.UndefOr[__string]
    var ConnectCampaignExecutionRoleArn: js.UndefOr[__string]
  }

  object JourneyChannelSettings {
    @inline
    def apply(
        ConnectCampaignArn: js.UndefOr[__string] = js.undefined,
        ConnectCampaignExecutionRoleArn: js.UndefOr[__string] = js.undefined
    ): JourneyChannelSettings = {
      val __obj = js.Dynamic.literal()
      ConnectCampaignArn.foreach(__v => __obj.updateDynamic("ConnectCampaignArn")(__v.asInstanceOf[js.Any]))
      ConnectCampaignExecutionRoleArn.foreach(__v => __obj.updateDynamic("ConnectCampaignExecutionRoleArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[JourneyChannelSettings]
    }
  }

  /** Specifies the message content for a custom channel message that's sent to participants in a journey.
    */
  @js.native
  trait JourneyCustomMessage extends js.Object {
    var Data: js.UndefOr[__string]
  }

  object JourneyCustomMessage {
    @inline
    def apply(
        Data: js.UndefOr[__string] = js.undefined
    ): JourneyCustomMessage = {
      val __obj = js.Dynamic.literal()
      Data.foreach(__v => __obj.updateDynamic("Data")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[JourneyCustomMessage]
    }
  }

  /** Provides the results of a query that retrieved the data for a standard engagement metric that applies to a journey, and provides information about that query.
    */
  @js.native
  trait JourneyDateRangeKpiResponse extends js.Object {
    var ApplicationId: __string
    var EndTime: __timestampIso8601
    var JourneyId: __string
    var KpiName: __string
    var KpiResult: BaseKpiResult
    var StartTime: __timestampIso8601
    var NextToken: js.UndefOr[__string]
  }

  object JourneyDateRangeKpiResponse {
    @inline
    def apply(
        ApplicationId: __string,
        EndTime: __timestampIso8601,
        JourneyId: __string,
        KpiName: __string,
        KpiResult: BaseKpiResult,
        StartTime: __timestampIso8601,
        NextToken: js.UndefOr[__string] = js.undefined
    ): JourneyDateRangeKpiResponse = {
      val __obj = js.Dynamic.literal(
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any],
        "EndTime" -> EndTime.asInstanceOf[js.Any],
        "JourneyId" -> JourneyId.asInstanceOf[js.Any],
        "KpiName" -> KpiName.asInstanceOf[js.Any],
        "KpiResult" -> KpiResult.asInstanceOf[js.Any],
        "StartTime" -> StartTime.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[JourneyDateRangeKpiResponse]
    }
  }

  /** Specifies the "From" address for an email message that's sent to participants in a journey.
    */
  @js.native
  trait JourneyEmailMessage extends js.Object {
    var FromAddress: js.UndefOr[__string]
  }

  object JourneyEmailMessage {
    @inline
    def apply(
        FromAddress: js.UndefOr[__string] = js.undefined
    ): JourneyEmailMessage = {
      val __obj = js.Dynamic.literal()
      FromAddress.foreach(__v => __obj.updateDynamic("FromAddress")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[JourneyEmailMessage]
    }
  }

  /** Provides the results of a query that retrieved the data for a standard execution metric that applies to a journey activity, and provides information about that query.
    */
  @js.native
  trait JourneyExecutionActivityMetricsResponse extends js.Object {
    var ActivityType: __string
    var ApplicationId: __string
    var JourneyActivityId: __string
    var JourneyId: __string
    var LastEvaluatedTime: __string
    var Metrics: MapOf__string
  }

  object JourneyExecutionActivityMetricsResponse {
    @inline
    def apply(
        ActivityType: __string,
        ApplicationId: __string,
        JourneyActivityId: __string,
        JourneyId: __string,
        LastEvaluatedTime: __string,
        Metrics: MapOf__string
    ): JourneyExecutionActivityMetricsResponse = {
      val __obj = js.Dynamic.literal(
        "ActivityType" -> ActivityType.asInstanceOf[js.Any],
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any],
        "JourneyActivityId" -> JourneyActivityId.asInstanceOf[js.Any],
        "JourneyId" -> JourneyId.asInstanceOf[js.Any],
        "LastEvaluatedTime" -> LastEvaluatedTime.asInstanceOf[js.Any],
        "Metrics" -> Metrics.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[JourneyExecutionActivityMetricsResponse]
    }
  }

  /** Provides the results of a query that retrieved the data for a standard execution metric that applies to a journey, and provides information about that query.
    */
  @js.native
  trait JourneyExecutionMetricsResponse extends js.Object {
    var ApplicationId: __string
    var JourneyId: __string
    var LastEvaluatedTime: __string
    var Metrics: MapOf__string
  }

  object JourneyExecutionMetricsResponse {
    @inline
    def apply(
        ApplicationId: __string,
        JourneyId: __string,
        LastEvaluatedTime: __string,
        Metrics: MapOf__string
    ): JourneyExecutionMetricsResponse = {
      val __obj = js.Dynamic.literal(
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any],
        "JourneyId" -> JourneyId.asInstanceOf[js.Any],
        "LastEvaluatedTime" -> LastEvaluatedTime.asInstanceOf[js.Any],
        "Metrics" -> Metrics.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[JourneyExecutionMetricsResponse]
    }
  }

  /** Specifies limits on the messages that a journey can send and the number of times participants can enter a journey.
    */
  @js.native
  trait JourneyLimits extends js.Object {
    var DailyCap: js.UndefOr[__integer]
    var EndpointReentryCap: js.UndefOr[__integer]
    var EndpointReentryInterval: js.UndefOr[__string]
    var MessagesPerSecond: js.UndefOr[__integer]
  }

  object JourneyLimits {
    @inline
    def apply(
        DailyCap: js.UndefOr[__integer] = js.undefined,
        EndpointReentryCap: js.UndefOr[__integer] = js.undefined,
        EndpointReentryInterval: js.UndefOr[__string] = js.undefined,
        MessagesPerSecond: js.UndefOr[__integer] = js.undefined
    ): JourneyLimits = {
      val __obj = js.Dynamic.literal()
      DailyCap.foreach(__v => __obj.updateDynamic("DailyCap")(__v.asInstanceOf[js.Any]))
      EndpointReentryCap.foreach(__v => __obj.updateDynamic("EndpointReentryCap")(__v.asInstanceOf[js.Any]))
      EndpointReentryInterval.foreach(__v => __obj.updateDynamic("EndpointReentryInterval")(__v.asInstanceOf[js.Any]))
      MessagesPerSecond.foreach(__v => __obj.updateDynamic("MessagesPerSecond")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[JourneyLimits]
    }
  }

  /** Specifies the message configuration for a push notification that's sent to participants in a journey.
    */
  @js.native
  trait JourneyPushMessage extends js.Object {
    var TimeToLive: js.UndefOr[__string]
  }

  object JourneyPushMessage {
    @inline
    def apply(
        TimeToLive: js.UndefOr[__string] = js.undefined
    ): JourneyPushMessage = {
      val __obj = js.Dynamic.literal()
      TimeToLive.foreach(__v => __obj.updateDynamic("TimeToLive")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[JourneyPushMessage]
    }
  }

  /** Provides information about the status, configuration, and other settings for a journey.
    */
  @js.native
  trait JourneyResponse extends js.Object {
    var ApplicationId: __string
    var Id: __string
    var Name: __string
    var Activities: js.UndefOr[MapOfActivity]
    var ClosedDays: js.UndefOr[ClosedDays]
    var CreationDate: js.UndefOr[__string]
    var JourneyChannelSettings: js.UndefOr[JourneyChannelSettings]
    var LastModifiedDate: js.UndefOr[__string]
    var Limits: js.UndefOr[JourneyLimits]
    var LocalTime: js.UndefOr[__boolean]
    var OpenHours: js.UndefOr[OpenHours]
    var QuietTime: js.UndefOr[QuietTime]
    var RefreshFrequency: js.UndefOr[__string]
    var RefreshOnSegmentUpdate: js.UndefOr[__boolean]
    var Schedule: js.UndefOr[JourneySchedule]
    var SendingSchedule: js.UndefOr[__boolean]
    var StartActivity: js.UndefOr[__string]
    var StartCondition: js.UndefOr[StartCondition]
    var State: js.UndefOr[State]
    var WaitForQuietTime: js.UndefOr[__boolean]
    var tags: js.UndefOr[MapOf__string]
  }

  object JourneyResponse {
    @inline
    def apply(
        ApplicationId: __string,
        Id: __string,
        Name: __string,
        Activities: js.UndefOr[MapOfActivity] = js.undefined,
        ClosedDays: js.UndefOr[ClosedDays] = js.undefined,
        CreationDate: js.UndefOr[__string] = js.undefined,
        JourneyChannelSettings: js.UndefOr[JourneyChannelSettings] = js.undefined,
        LastModifiedDate: js.UndefOr[__string] = js.undefined,
        Limits: js.UndefOr[JourneyLimits] = js.undefined,
        LocalTime: js.UndefOr[__boolean] = js.undefined,
        OpenHours: js.UndefOr[OpenHours] = js.undefined,
        QuietTime: js.UndefOr[QuietTime] = js.undefined,
        RefreshFrequency: js.UndefOr[__string] = js.undefined,
        RefreshOnSegmentUpdate: js.UndefOr[__boolean] = js.undefined,
        Schedule: js.UndefOr[JourneySchedule] = js.undefined,
        SendingSchedule: js.UndefOr[__boolean] = js.undefined,
        StartActivity: js.UndefOr[__string] = js.undefined,
        StartCondition: js.UndefOr[StartCondition] = js.undefined,
        State: js.UndefOr[State] = js.undefined,
        WaitForQuietTime: js.UndefOr[__boolean] = js.undefined,
        tags: js.UndefOr[MapOf__string] = js.undefined
    ): JourneyResponse = {
      val __obj = js.Dynamic.literal(
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any],
        "Id" -> Id.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]
      )

      Activities.foreach(__v => __obj.updateDynamic("Activities")(__v.asInstanceOf[js.Any]))
      ClosedDays.foreach(__v => __obj.updateDynamic("ClosedDays")(__v.asInstanceOf[js.Any]))
      CreationDate.foreach(__v => __obj.updateDynamic("CreationDate")(__v.asInstanceOf[js.Any]))
      JourneyChannelSettings.foreach(__v => __obj.updateDynamic("JourneyChannelSettings")(__v.asInstanceOf[js.Any]))
      LastModifiedDate.foreach(__v => __obj.updateDynamic("LastModifiedDate")(__v.asInstanceOf[js.Any]))
      Limits.foreach(__v => __obj.updateDynamic("Limits")(__v.asInstanceOf[js.Any]))
      LocalTime.foreach(__v => __obj.updateDynamic("LocalTime")(__v.asInstanceOf[js.Any]))
      OpenHours.foreach(__v => __obj.updateDynamic("OpenHours")(__v.asInstanceOf[js.Any]))
      QuietTime.foreach(__v => __obj.updateDynamic("QuietTime")(__v.asInstanceOf[js.Any]))
      RefreshFrequency.foreach(__v => __obj.updateDynamic("RefreshFrequency")(__v.asInstanceOf[js.Any]))
      RefreshOnSegmentUpdate.foreach(__v => __obj.updateDynamic("RefreshOnSegmentUpdate")(__v.asInstanceOf[js.Any]))
      Schedule.foreach(__v => __obj.updateDynamic("Schedule")(__v.asInstanceOf[js.Any]))
      SendingSchedule.foreach(__v => __obj.updateDynamic("SendingSchedule")(__v.asInstanceOf[js.Any]))
      StartActivity.foreach(__v => __obj.updateDynamic("StartActivity")(__v.asInstanceOf[js.Any]))
      StartCondition.foreach(__v => __obj.updateDynamic("StartCondition")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      WaitForQuietTime.foreach(__v => __obj.updateDynamic("WaitForQuietTime")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[JourneyResponse]
    }
  }

  /** Specifies the sender ID and message type for an SMS message that's sent to participants in a journey.
    */
  @js.native
  trait JourneySMSMessage extends js.Object {
    var EntityId: js.UndefOr[__string]
    var MessageType: js.UndefOr[MessageType]
    var OriginationNumber: js.UndefOr[__string]
    var SenderId: js.UndefOr[__string]
    var TemplateId: js.UndefOr[__string]
  }

  object JourneySMSMessage {
    @inline
    def apply(
        EntityId: js.UndefOr[__string] = js.undefined,
        MessageType: js.UndefOr[MessageType] = js.undefined,
        OriginationNumber: js.UndefOr[__string] = js.undefined,
        SenderId: js.UndefOr[__string] = js.undefined,
        TemplateId: js.UndefOr[__string] = js.undefined
    ): JourneySMSMessage = {
      val __obj = js.Dynamic.literal()
      EntityId.foreach(__v => __obj.updateDynamic("EntityId")(__v.asInstanceOf[js.Any]))
      MessageType.foreach(__v => __obj.updateDynamic("MessageType")(__v.asInstanceOf[js.Any]))
      OriginationNumber.foreach(__v => __obj.updateDynamic("OriginationNumber")(__v.asInstanceOf[js.Any]))
      SenderId.foreach(__v => __obj.updateDynamic("SenderId")(__v.asInstanceOf[js.Any]))
      TemplateId.foreach(__v => __obj.updateDynamic("TemplateId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[JourneySMSMessage]
    }
  }

  /** Specifies the schedule settings for a journey.
    */
  @js.native
  trait JourneySchedule extends js.Object {
    var EndTime: js.UndefOr[__timestampIso8601]
    var StartTime: js.UndefOr[__timestampIso8601]
    var Timezone: js.UndefOr[__string]
  }

  object JourneySchedule {
    @inline
    def apply(
        EndTime: js.UndefOr[__timestampIso8601] = js.undefined,
        StartTime: js.UndefOr[__timestampIso8601] = js.undefined,
        Timezone: js.UndefOr[__string] = js.undefined
    ): JourneySchedule = {
      val __obj = js.Dynamic.literal()
      EndTime.foreach(__v => __obj.updateDynamic("EndTime")(__v.asInstanceOf[js.Any]))
      StartTime.foreach(__v => __obj.updateDynamic("StartTime")(__v.asInstanceOf[js.Any]))
      Timezone.foreach(__v => __obj.updateDynamic("Timezone")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[JourneySchedule]
    }
  }

  /** Changes the status of a journey.
    */
  @js.native
  trait JourneyStateRequest extends js.Object {
    var State: js.UndefOr[State]
  }

  object JourneyStateRequest {
    @inline
    def apply(
        State: js.UndefOr[State] = js.undefined
    ): JourneyStateRequest = {
      val __obj = js.Dynamic.literal()
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[JourneyStateRequest]
    }
  }

  /** Provides information about the status, configuration, and other settings for all the journeys that are associated with an application.
    */
  @js.native
  trait JourneysResponse extends js.Object {
    var Item: ListOfJourneyResponse
    var NextToken: js.UndefOr[__string]
  }

  object JourneysResponse {
    @inline
    def apply(
        Item: ListOfJourneyResponse,
        NextToken: js.UndefOr[__string] = js.undefined
    ): JourneysResponse = {
      val __obj = js.Dynamic.literal(
        "Item" -> Item.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[JourneysResponse]
    }
  }

  @js.native
  trait ListJourneysRequest extends js.Object {
    var ApplicationId: __string
    var PageSize: js.UndefOr[__string]
    var Token: js.UndefOr[__string]
  }

  object ListJourneysRequest {
    @inline
    def apply(
        ApplicationId: __string,
        PageSize: js.UndefOr[__string] = js.undefined,
        Token: js.UndefOr[__string] = js.undefined
    ): ListJourneysRequest = {
      val __obj = js.Dynamic.literal(
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any]
      )

      PageSize.foreach(__v => __obj.updateDynamic("PageSize")(__v.asInstanceOf[js.Any]))
      Token.foreach(__v => __obj.updateDynamic("Token")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListJourneysRequest]
    }
  }

  @js.native
  trait ListJourneysResponse extends js.Object {
    var JourneysResponse: JourneysResponse
  }

  object ListJourneysResponse {
    @inline
    def apply(
        JourneysResponse: JourneysResponse
    ): ListJourneysResponse = {
      val __obj = js.Dynamic.literal(
        "JourneysResponse" -> JourneysResponse.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ListJourneysResponse]
    }
  }

  /** Provides information about all the recommender model configurations that are associated with your Amazon Pinpoint account.
    */
  @js.native
  trait ListRecommenderConfigurationsResponse extends js.Object {
    var Item: ListOfRecommenderConfigurationResponse
    var NextToken: js.UndefOr[__string]
  }

  object ListRecommenderConfigurationsResponse {
    @inline
    def apply(
        Item: ListOfRecommenderConfigurationResponse,
        NextToken: js.UndefOr[__string] = js.undefined
    ): ListRecommenderConfigurationsResponse = {
      val __obj = js.Dynamic.literal(
        "Item" -> Item.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListRecommenderConfigurationsResponse]
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
    var TagsModel: TagsModel
  }

  object ListTagsForResourceResponse {
    @inline
    def apply(
        TagsModel: TagsModel
    ): ListTagsForResourceResponse = {
      val __obj = js.Dynamic.literal(
        "TagsModel" -> TagsModel.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ListTagsForResourceResponse]
    }
  }

  @js.native
  trait ListTemplateVersionsRequest extends js.Object {
    var TemplateName: __string
    var TemplateType: __string
    var NextToken: js.UndefOr[__string]
    var PageSize: js.UndefOr[__string]
  }

  object ListTemplateVersionsRequest {
    @inline
    def apply(
        TemplateName: __string,
        TemplateType: __string,
        NextToken: js.UndefOr[__string] = js.undefined,
        PageSize: js.UndefOr[__string] = js.undefined
    ): ListTemplateVersionsRequest = {
      val __obj = js.Dynamic.literal(
        "TemplateName" -> TemplateName.asInstanceOf[js.Any],
        "TemplateType" -> TemplateType.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      PageSize.foreach(__v => __obj.updateDynamic("PageSize")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTemplateVersionsRequest]
    }
  }

  @js.native
  trait ListTemplateVersionsResponse extends js.Object {
    var TemplateVersionsResponse: TemplateVersionsResponse
  }

  object ListTemplateVersionsResponse {
    @inline
    def apply(
        TemplateVersionsResponse: TemplateVersionsResponse
    ): ListTemplateVersionsResponse = {
      val __obj = js.Dynamic.literal(
        "TemplateVersionsResponse" -> TemplateVersionsResponse.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ListTemplateVersionsResponse]
    }
  }

  @js.native
  trait ListTemplatesRequest extends js.Object {
    var NextToken: js.UndefOr[__string]
    var PageSize: js.UndefOr[__string]
    var Prefix: js.UndefOr[__string]
    var TemplateType: js.UndefOr[__string]
  }

  object ListTemplatesRequest {
    @inline
    def apply(
        NextToken: js.UndefOr[__string] = js.undefined,
        PageSize: js.UndefOr[__string] = js.undefined,
        Prefix: js.UndefOr[__string] = js.undefined,
        TemplateType: js.UndefOr[__string] = js.undefined
    ): ListTemplatesRequest = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      PageSize.foreach(__v => __obj.updateDynamic("PageSize")(__v.asInstanceOf[js.Any]))
      Prefix.foreach(__v => __obj.updateDynamic("Prefix")(__v.asInstanceOf[js.Any]))
      TemplateType.foreach(__v => __obj.updateDynamic("TemplateType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTemplatesRequest]
    }
  }

  @js.native
  trait ListTemplatesResponse extends js.Object {
    var TemplatesResponse: TemplatesResponse
  }

  object ListTemplatesResponse {
    @inline
    def apply(
        TemplatesResponse: TemplatesResponse
    ): ListTemplatesResponse = {
      val __obj = js.Dynamic.literal(
        "TemplatesResponse" -> TemplatesResponse.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ListTemplatesResponse]
    }
  }

  /** Specifies the content and settings for a push notification that's sent to recipients of a campaign.
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
    @inline
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
      val __obj = js.Dynamic.literal()
      Action.foreach(__v => __obj.updateDynamic("Action")(__v.asInstanceOf[js.Any]))
      Body.foreach(__v => __obj.updateDynamic("Body")(__v.asInstanceOf[js.Any]))
      ImageIconUrl.foreach(__v => __obj.updateDynamic("ImageIconUrl")(__v.asInstanceOf[js.Any]))
      ImageSmallIconUrl.foreach(__v => __obj.updateDynamic("ImageSmallIconUrl")(__v.asInstanceOf[js.Any]))
      ImageUrl.foreach(__v => __obj.updateDynamic("ImageUrl")(__v.asInstanceOf[js.Any]))
      JsonBody.foreach(__v => __obj.updateDynamic("JsonBody")(__v.asInstanceOf[js.Any]))
      MediaUrl.foreach(__v => __obj.updateDynamic("MediaUrl")(__v.asInstanceOf[js.Any]))
      RawContent.foreach(__v => __obj.updateDynamic("RawContent")(__v.asInstanceOf[js.Any]))
      SilentPush.foreach(__v => __obj.updateDynamic("SilentPush")(__v.asInstanceOf[js.Any]))
      TimeToLive.foreach(__v => __obj.updateDynamic("TimeToLive")(__v.asInstanceOf[js.Any]))
      Title.foreach(__v => __obj.updateDynamic("Title")(__v.asInstanceOf[js.Any]))
      Url.foreach(__v => __obj.updateDynamic("Url")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Message]
    }
  }

  /** Provides information about an API request or response.
    */
  @js.native
  trait MessageBody extends js.Object {
    var Message: js.UndefOr[__string]
    var RequestID: js.UndefOr[__string]
  }

  object MessageBody {
    @inline
    def apply(
        Message: js.UndefOr[__string] = js.undefined,
        RequestID: js.UndefOr[__string] = js.undefined
    ): MessageBody = {
      val __obj = js.Dynamic.literal()
      Message.foreach(__v => __obj.updateDynamic("Message")(__v.asInstanceOf[js.Any]))
      RequestID.foreach(__v => __obj.updateDynamic("RequestID")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MessageBody]
    }
  }

  /** Specifies the message configuration settings for a campaign.
    */
  @js.native
  trait MessageConfiguration extends js.Object {
    var ADMMessage: js.UndefOr[Message]
    var APNSMessage: js.UndefOr[Message]
    var BaiduMessage: js.UndefOr[Message]
    var CustomMessage: js.UndefOr[CampaignCustomMessage]
    var DefaultMessage: js.UndefOr[Message]
    var EmailMessage: js.UndefOr[CampaignEmailMessage]
    var GCMMessage: js.UndefOr[Message]
    var InAppMessage: js.UndefOr[CampaignInAppMessage]
    var SMSMessage: js.UndefOr[CampaignSmsMessage]
  }

  object MessageConfiguration {
    @inline
    def apply(
        ADMMessage: js.UndefOr[Message] = js.undefined,
        APNSMessage: js.UndefOr[Message] = js.undefined,
        BaiduMessage: js.UndefOr[Message] = js.undefined,
        CustomMessage: js.UndefOr[CampaignCustomMessage] = js.undefined,
        DefaultMessage: js.UndefOr[Message] = js.undefined,
        EmailMessage: js.UndefOr[CampaignEmailMessage] = js.undefined,
        GCMMessage: js.UndefOr[Message] = js.undefined,
        InAppMessage: js.UndefOr[CampaignInAppMessage] = js.undefined,
        SMSMessage: js.UndefOr[CampaignSmsMessage] = js.undefined
    ): MessageConfiguration = {
      val __obj = js.Dynamic.literal()
      ADMMessage.foreach(__v => __obj.updateDynamic("ADMMessage")(__v.asInstanceOf[js.Any]))
      APNSMessage.foreach(__v => __obj.updateDynamic("APNSMessage")(__v.asInstanceOf[js.Any]))
      BaiduMessage.foreach(__v => __obj.updateDynamic("BaiduMessage")(__v.asInstanceOf[js.Any]))
      CustomMessage.foreach(__v => __obj.updateDynamic("CustomMessage")(__v.asInstanceOf[js.Any]))
      DefaultMessage.foreach(__v => __obj.updateDynamic("DefaultMessage")(__v.asInstanceOf[js.Any]))
      EmailMessage.foreach(__v => __obj.updateDynamic("EmailMessage")(__v.asInstanceOf[js.Any]))
      GCMMessage.foreach(__v => __obj.updateDynamic("GCMMessage")(__v.asInstanceOf[js.Any]))
      InAppMessage.foreach(__v => __obj.updateDynamic("InAppMessage")(__v.asInstanceOf[js.Any]))
      SMSMessage.foreach(__v => __obj.updateDynamic("SMSMessage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MessageConfiguration]
    }
  }

  /** Specifies the configuration and other settings for a message.
    */
  @js.native
  trait MessageRequest extends js.Object {
    var MessageConfiguration: DirectMessageConfiguration
    var Addresses: js.UndefOr[MapOfAddressConfiguration]
    var Context: js.UndefOr[MapOf__string]
    var Endpoints: js.UndefOr[MapOfEndpointSendConfiguration]
    var TemplateConfiguration: js.UndefOr[TemplateConfiguration]
    var TraceId: js.UndefOr[__string]
  }

  object MessageRequest {
    @inline
    def apply(
        MessageConfiguration: DirectMessageConfiguration,
        Addresses: js.UndefOr[MapOfAddressConfiguration] = js.undefined,
        Context: js.UndefOr[MapOf__string] = js.undefined,
        Endpoints: js.UndefOr[MapOfEndpointSendConfiguration] = js.undefined,
        TemplateConfiguration: js.UndefOr[TemplateConfiguration] = js.undefined,
        TraceId: js.UndefOr[__string] = js.undefined
    ): MessageRequest = {
      val __obj = js.Dynamic.literal(
        "MessageConfiguration" -> MessageConfiguration.asInstanceOf[js.Any]
      )

      Addresses.foreach(__v => __obj.updateDynamic("Addresses")(__v.asInstanceOf[js.Any]))
      Context.foreach(__v => __obj.updateDynamic("Context")(__v.asInstanceOf[js.Any]))
      Endpoints.foreach(__v => __obj.updateDynamic("Endpoints")(__v.asInstanceOf[js.Any]))
      TemplateConfiguration.foreach(__v => __obj.updateDynamic("TemplateConfiguration")(__v.asInstanceOf[js.Any]))
      TraceId.foreach(__v => __obj.updateDynamic("TraceId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MessageRequest]
    }
  }

  /** Provides information about the results of a request to send a message to an endpoint address.
    */
  @js.native
  trait MessageResponse extends js.Object {
    var ApplicationId: __string
    var EndpointResult: js.UndefOr[MapOfEndpointMessageResult]
    var RequestId: js.UndefOr[__string]
    var Result: js.UndefOr[MapOfMessageResult]
  }

  object MessageResponse {
    @inline
    def apply(
        ApplicationId: __string,
        EndpointResult: js.UndefOr[MapOfEndpointMessageResult] = js.undefined,
        RequestId: js.UndefOr[__string] = js.undefined,
        Result: js.UndefOr[MapOfMessageResult] = js.undefined
    ): MessageResponse = {
      val __obj = js.Dynamic.literal(
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any]
      )

      EndpointResult.foreach(__v => __obj.updateDynamic("EndpointResult")(__v.asInstanceOf[js.Any]))
      RequestId.foreach(__v => __obj.updateDynamic("RequestId")(__v.asInstanceOf[js.Any]))
      Result.foreach(__v => __obj.updateDynamic("Result")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MessageResponse]
    }
  }

  /** Provides information about the results of sending a message directly to an endpoint address.
    */
  @js.native
  trait MessageResult extends js.Object {
    var DeliveryStatus: DeliveryStatus
    var StatusCode: __integer
    var MessageId: js.UndefOr[__string]
    var StatusMessage: js.UndefOr[__string]
    var UpdatedToken: js.UndefOr[__string]
  }

  object MessageResult {
    @inline
    def apply(
        DeliveryStatus: DeliveryStatus,
        StatusCode: __integer,
        MessageId: js.UndefOr[__string] = js.undefined,
        StatusMessage: js.UndefOr[__string] = js.undefined,
        UpdatedToken: js.UndefOr[__string] = js.undefined
    ): MessageResult = {
      val __obj = js.Dynamic.literal(
        "DeliveryStatus" -> DeliveryStatus.asInstanceOf[js.Any],
        "StatusCode" -> StatusCode.asInstanceOf[js.Any]
      )

      MessageId.foreach(__v => __obj.updateDynamic("MessageId")(__v.asInstanceOf[js.Any]))
      StatusMessage.foreach(__v => __obj.updateDynamic("StatusMessage")(__v.asInstanceOf[js.Any]))
      UpdatedToken.foreach(__v => __obj.updateDynamic("UpdatedToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MessageResult]
    }
  }

  /** Specifies metric-based criteria for including or excluding endpoints from a segment. These criteria derive from custom metrics that you define for endpoints.
    */
  @js.native
  trait MetricDimension extends js.Object {
    var ComparisonOperator: __string
    var Value: __double
  }

  object MetricDimension {
    @inline
    def apply(
        ComparisonOperator: __string,
        Value: __double
    ): MetricDimension = {
      val __obj = js.Dynamic.literal(
        "ComparisonOperator" -> ComparisonOperator.asInstanceOf[js.Any],
        "Value" -> Value.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[MetricDimension]
    }
  }

  /** Specifies a condition to evaluate for an activity path in a journey.
    */
  @js.native
  trait MultiConditionalBranch extends js.Object {
    var Condition: js.UndefOr[SimpleCondition]
    var NextActivity: js.UndefOr[__string]
  }

  object MultiConditionalBranch {
    @inline
    def apply(
        Condition: js.UndefOr[SimpleCondition] = js.undefined,
        NextActivity: js.UndefOr[__string] = js.undefined
    ): MultiConditionalBranch = {
      val __obj = js.Dynamic.literal()
      Condition.foreach(__v => __obj.updateDynamic("Condition")(__v.asInstanceOf[js.Any]))
      NextActivity.foreach(__v => __obj.updateDynamic("NextActivity")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MultiConditionalBranch]
    }
  }

  /** Specifies the settings for a multivariate split activity in a journey. This type of activity sends participants down one of as many as five paths (including a default <i>Else</i> path) in a journey, based on conditions that you specify.
    *
    * '''Note:'''To create multivariate split activities that send participants down different paths based on push notification events (such as Open or Received events), your mobile app has to specify the User ID and Endpoint ID values. For more information, see [[https://docs.aws.amazon.com/pinpoint/latest/developerguide/integrate.html|Integrating Amazon Pinpoint with your application]] in the <i>Amazon Pinpoint Developer Guide</i>.
    */
  @js.native
  trait MultiConditionalSplitActivity extends js.Object {
    var Branches: js.UndefOr[ListOfMultiConditionalBranch]
    var DefaultActivity: js.UndefOr[__string]
    var EvaluationWaitTime: js.UndefOr[WaitTime]
  }

  object MultiConditionalSplitActivity {
    @inline
    def apply(
        Branches: js.UndefOr[ListOfMultiConditionalBranch] = js.undefined,
        DefaultActivity: js.UndefOr[__string] = js.undefined,
        EvaluationWaitTime: js.UndefOr[WaitTime] = js.undefined
    ): MultiConditionalSplitActivity = {
      val __obj = js.Dynamic.literal()
      Branches.foreach(__v => __obj.updateDynamic("Branches")(__v.asInstanceOf[js.Any]))
      DefaultActivity.foreach(__v => __obj.updateDynamic("DefaultActivity")(__v.asInstanceOf[js.Any]))
      EvaluationWaitTime.foreach(__v => __obj.updateDynamic("EvaluationWaitTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MultiConditionalSplitActivity]
    }
  }

  /** Specifies a phone number to validate and retrieve information about.
    */
  @js.native
  trait NumberValidateRequest extends js.Object {
    var IsoCountryCode: js.UndefOr[__string]
    var PhoneNumber: js.UndefOr[__string]
  }

  object NumberValidateRequest {
    @inline
    def apply(
        IsoCountryCode: js.UndefOr[__string] = js.undefined,
        PhoneNumber: js.UndefOr[__string] = js.undefined
    ): NumberValidateRequest = {
      val __obj = js.Dynamic.literal()
      IsoCountryCode.foreach(__v => __obj.updateDynamic("IsoCountryCode")(__v.asInstanceOf[js.Any]))
      PhoneNumber.foreach(__v => __obj.updateDynamic("PhoneNumber")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NumberValidateRequest]
    }
  }

  /** Provides information about a phone number.
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
    @inline
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
      val __obj = js.Dynamic.literal()
      Carrier.foreach(__v => __obj.updateDynamic("Carrier")(__v.asInstanceOf[js.Any]))
      City.foreach(__v => __obj.updateDynamic("City")(__v.asInstanceOf[js.Any]))
      CleansedPhoneNumberE164.foreach(__v => __obj.updateDynamic("CleansedPhoneNumberE164")(__v.asInstanceOf[js.Any]))
      CleansedPhoneNumberNational.foreach(__v => __obj.updateDynamic("CleansedPhoneNumberNational")(__v.asInstanceOf[js.Any]))
      Country.foreach(__v => __obj.updateDynamic("Country")(__v.asInstanceOf[js.Any]))
      CountryCodeIso2.foreach(__v => __obj.updateDynamic("CountryCodeIso2")(__v.asInstanceOf[js.Any]))
      CountryCodeNumeric.foreach(__v => __obj.updateDynamic("CountryCodeNumeric")(__v.asInstanceOf[js.Any]))
      County.foreach(__v => __obj.updateDynamic("County")(__v.asInstanceOf[js.Any]))
      OriginalCountryCodeIso2.foreach(__v => __obj.updateDynamic("OriginalCountryCodeIso2")(__v.asInstanceOf[js.Any]))
      OriginalPhoneNumber.foreach(__v => __obj.updateDynamic("OriginalPhoneNumber")(__v.asInstanceOf[js.Any]))
      PhoneType.foreach(__v => __obj.updateDynamic("PhoneType")(__v.asInstanceOf[js.Any]))
      PhoneTypeCode.foreach(__v => __obj.updateDynamic("PhoneTypeCode")(__v.asInstanceOf[js.Any]))
      Timezone.foreach(__v => __obj.updateDynamic("Timezone")(__v.asInstanceOf[js.Any]))
      ZipCode.foreach(__v => __obj.updateDynamic("ZipCode")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NumberValidateResponse]
    }
  }

  /** The time when journey allow to send messages. QuietTime should be configured first and SendingSchedule should be set to true.
    */
  @js.native
  trait OpenHours extends js.Object {
    var CUSTOM: js.UndefOr[MapOfListOfOpenHoursRules]
    var EMAIL: js.UndefOr[MapOfListOfOpenHoursRules]
    var PUSH: js.UndefOr[MapOfListOfOpenHoursRules]
    var SMS: js.UndefOr[MapOfListOfOpenHoursRules]
    var VOICE: js.UndefOr[MapOfListOfOpenHoursRules]
  }

  object OpenHours {
    @inline
    def apply(
        CUSTOM: js.UndefOr[MapOfListOfOpenHoursRules] = js.undefined,
        EMAIL: js.UndefOr[MapOfListOfOpenHoursRules] = js.undefined,
        PUSH: js.UndefOr[MapOfListOfOpenHoursRules] = js.undefined,
        SMS: js.UndefOr[MapOfListOfOpenHoursRules] = js.undefined,
        VOICE: js.UndefOr[MapOfListOfOpenHoursRules] = js.undefined
    ): OpenHours = {
      val __obj = js.Dynamic.literal()
      CUSTOM.foreach(__v => __obj.updateDynamic("CUSTOM")(__v.asInstanceOf[js.Any]))
      EMAIL.foreach(__v => __obj.updateDynamic("EMAIL")(__v.asInstanceOf[js.Any]))
      PUSH.foreach(__v => __obj.updateDynamic("PUSH")(__v.asInstanceOf[js.Any]))
      SMS.foreach(__v => __obj.updateDynamic("SMS")(__v.asInstanceOf[js.Any]))
      VOICE.foreach(__v => __obj.updateDynamic("VOICE")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OpenHours]
    }
  }

  /** List of OpenHours Rules.
    */
  @js.native
  trait OpenHoursRule extends js.Object {
    var EndTime: js.UndefOr[__string]
    var StartTime: js.UndefOr[__string]
  }

  object OpenHoursRule {
    @inline
    def apply(
        EndTime: js.UndefOr[__string] = js.undefined,
        StartTime: js.UndefOr[__string] = js.undefined
    ): OpenHoursRule = {
      val __obj = js.Dynamic.literal()
      EndTime.foreach(__v => __obj.updateDynamic("EndTime")(__v.asInstanceOf[js.Any]))
      StartTime.foreach(__v => __obj.updateDynamic("StartTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OpenHoursRule]
    }
  }

  /** Override button configuration.
    */
  @js.native
  trait OverrideButtonConfiguration extends js.Object {
    var ButtonAction: ButtonAction
    var Link: js.UndefOr[__string]
  }

  object OverrideButtonConfiguration {
    @inline
    def apply(
        ButtonAction: ButtonAction,
        Link: js.UndefOr[__string] = js.undefined
    ): OverrideButtonConfiguration = {
      val __obj = js.Dynamic.literal(
        "ButtonAction" -> ButtonAction.asInstanceOf[js.Any]
      )

      Link.foreach(__v => __obj.updateDynamic("Link")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OverrideButtonConfiguration]
    }
  }

  @js.native
  trait PhoneNumberValidateRequest extends js.Object {
    var NumberValidateRequest: NumberValidateRequest
  }

  object PhoneNumberValidateRequest {
    @inline
    def apply(
        NumberValidateRequest: NumberValidateRequest
    ): PhoneNumberValidateRequest = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        NumberValidateResponse: NumberValidateResponse
    ): PhoneNumberValidateResponse = {
      val __obj = js.Dynamic.literal(
        "NumberValidateResponse" -> NumberValidateResponse.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[PhoneNumberValidateResponse]
    }
  }

  /** Specifies the properties and attributes of an endpoint that's associated with an event.
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
    @inline
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
      val __obj = js.Dynamic.literal()
      Address.foreach(__v => __obj.updateDynamic("Address")(__v.asInstanceOf[js.Any]))
      Attributes.foreach(__v => __obj.updateDynamic("Attributes")(__v.asInstanceOf[js.Any]))
      ChannelType.foreach(__v => __obj.updateDynamic("ChannelType")(__v.asInstanceOf[js.Any]))
      Demographic.foreach(__v => __obj.updateDynamic("Demographic")(__v.asInstanceOf[js.Any]))
      EffectiveDate.foreach(__v => __obj.updateDynamic("EffectiveDate")(__v.asInstanceOf[js.Any]))
      EndpointStatus.foreach(__v => __obj.updateDynamic("EndpointStatus")(__v.asInstanceOf[js.Any]))
      Location.foreach(__v => __obj.updateDynamic("Location")(__v.asInstanceOf[js.Any]))
      Metrics.foreach(__v => __obj.updateDynamic("Metrics")(__v.asInstanceOf[js.Any]))
      OptOut.foreach(__v => __obj.updateDynamic("OptOut")(__v.asInstanceOf[js.Any]))
      RequestId.foreach(__v => __obj.updateDynamic("RequestId")(__v.asInstanceOf[js.Any]))
      User.foreach(__v => __obj.updateDynamic("User")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PublicEndpoint]
    }
  }

  /** Specifies the settings for a push notification activity in a journey. This type of activity sends a push notification to participants.
    */
  @js.native
  trait PushMessageActivity extends js.Object {
    var MessageConfig: js.UndefOr[JourneyPushMessage]
    var NextActivity: js.UndefOr[__string]
    var TemplateName: js.UndefOr[__string]
    var TemplateVersion: js.UndefOr[__string]
  }

  object PushMessageActivity {
    @inline
    def apply(
        MessageConfig: js.UndefOr[JourneyPushMessage] = js.undefined,
        NextActivity: js.UndefOr[__string] = js.undefined,
        TemplateName: js.UndefOr[__string] = js.undefined,
        TemplateVersion: js.UndefOr[__string] = js.undefined
    ): PushMessageActivity = {
      val __obj = js.Dynamic.literal()
      MessageConfig.foreach(__v => __obj.updateDynamic("MessageConfig")(__v.asInstanceOf[js.Any]))
      NextActivity.foreach(__v => __obj.updateDynamic("NextActivity")(__v.asInstanceOf[js.Any]))
      TemplateName.foreach(__v => __obj.updateDynamic("TemplateName")(__v.asInstanceOf[js.Any]))
      TemplateVersion.foreach(__v => __obj.updateDynamic("TemplateVersion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PushMessageActivity]
    }
  }

  /** Specifies the content and settings for a message template that can be used in messages that are sent through a push notification channel.
    */
  @js.native
  trait PushNotificationTemplateRequest extends js.Object {
    var ADM: js.UndefOr[AndroidPushNotificationTemplate]
    var APNS: js.UndefOr[APNSPushNotificationTemplate]
    var Baidu: js.UndefOr[AndroidPushNotificationTemplate]
    var Default: js.UndefOr[DefaultPushNotificationTemplate]
    var DefaultSubstitutions: js.UndefOr[__string]
    var GCM: js.UndefOr[AndroidPushNotificationTemplate]
    var RecommenderId: js.UndefOr[__string]
    var TemplateDescription: js.UndefOr[__string]
    var tags: js.UndefOr[MapOf__string]
  }

  object PushNotificationTemplateRequest {
    @inline
    def apply(
        ADM: js.UndefOr[AndroidPushNotificationTemplate] = js.undefined,
        APNS: js.UndefOr[APNSPushNotificationTemplate] = js.undefined,
        Baidu: js.UndefOr[AndroidPushNotificationTemplate] = js.undefined,
        Default: js.UndefOr[DefaultPushNotificationTemplate] = js.undefined,
        DefaultSubstitutions: js.UndefOr[__string] = js.undefined,
        GCM: js.UndefOr[AndroidPushNotificationTemplate] = js.undefined,
        RecommenderId: js.UndefOr[__string] = js.undefined,
        TemplateDescription: js.UndefOr[__string] = js.undefined,
        tags: js.UndefOr[MapOf__string] = js.undefined
    ): PushNotificationTemplateRequest = {
      val __obj = js.Dynamic.literal()
      ADM.foreach(__v => __obj.updateDynamic("ADM")(__v.asInstanceOf[js.Any]))
      APNS.foreach(__v => __obj.updateDynamic("APNS")(__v.asInstanceOf[js.Any]))
      Baidu.foreach(__v => __obj.updateDynamic("Baidu")(__v.asInstanceOf[js.Any]))
      Default.foreach(__v => __obj.updateDynamic("Default")(__v.asInstanceOf[js.Any]))
      DefaultSubstitutions.foreach(__v => __obj.updateDynamic("DefaultSubstitutions")(__v.asInstanceOf[js.Any]))
      GCM.foreach(__v => __obj.updateDynamic("GCM")(__v.asInstanceOf[js.Any]))
      RecommenderId.foreach(__v => __obj.updateDynamic("RecommenderId")(__v.asInstanceOf[js.Any]))
      TemplateDescription.foreach(__v => __obj.updateDynamic("TemplateDescription")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PushNotificationTemplateRequest]
    }
  }

  /** Provides information about the content and settings for a message template that can be used in messages that are sent through a push notification channel.
    */
  @js.native
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
    var RecommenderId: js.UndefOr[__string]
    var TemplateDescription: js.UndefOr[__string]
    var Version: js.UndefOr[__string]
    var tags: js.UndefOr[MapOf__string]
  }

  object PushNotificationTemplateResponse {
    @inline
    def apply(
        CreationDate: __string,
        LastModifiedDate: __string,
        TemplateName: __string,
        TemplateType: TemplateType,
        ADM: js.UndefOr[AndroidPushNotificationTemplate] = js.undefined,
        APNS: js.UndefOr[APNSPushNotificationTemplate] = js.undefined,
        Arn: js.UndefOr[__string] = js.undefined,
        Baidu: js.UndefOr[AndroidPushNotificationTemplate] = js.undefined,
        Default: js.UndefOr[DefaultPushNotificationTemplate] = js.undefined,
        DefaultSubstitutions: js.UndefOr[__string] = js.undefined,
        GCM: js.UndefOr[AndroidPushNotificationTemplate] = js.undefined,
        RecommenderId: js.UndefOr[__string] = js.undefined,
        TemplateDescription: js.UndefOr[__string] = js.undefined,
        Version: js.UndefOr[__string] = js.undefined,
        tags: js.UndefOr[MapOf__string] = js.undefined
    ): PushNotificationTemplateResponse = {
      val __obj = js.Dynamic.literal(
        "CreationDate" -> CreationDate.asInstanceOf[js.Any],
        "LastModifiedDate" -> LastModifiedDate.asInstanceOf[js.Any],
        "TemplateName" -> TemplateName.asInstanceOf[js.Any],
        "TemplateType" -> TemplateType.asInstanceOf[js.Any]
      )

      ADM.foreach(__v => __obj.updateDynamic("ADM")(__v.asInstanceOf[js.Any]))
      APNS.foreach(__v => __obj.updateDynamic("APNS")(__v.asInstanceOf[js.Any]))
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      Baidu.foreach(__v => __obj.updateDynamic("Baidu")(__v.asInstanceOf[js.Any]))
      Default.foreach(__v => __obj.updateDynamic("Default")(__v.asInstanceOf[js.Any]))
      DefaultSubstitutions.foreach(__v => __obj.updateDynamic("DefaultSubstitutions")(__v.asInstanceOf[js.Any]))
      GCM.foreach(__v => __obj.updateDynamic("GCM")(__v.asInstanceOf[js.Any]))
      RecommenderId.foreach(__v => __obj.updateDynamic("RecommenderId")(__v.asInstanceOf[js.Any]))
      TemplateDescription.foreach(__v => __obj.updateDynamic("TemplateDescription")(__v.asInstanceOf[js.Any]))
      Version.foreach(__v => __obj.updateDynamic("Version")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PushNotificationTemplateResponse]
    }
  }

  @js.native
  trait PutEventStreamRequest extends js.Object {
    var ApplicationId: __string
    var WriteEventStream: WriteEventStream
  }

  object PutEventStreamRequest {
    @inline
    def apply(
        ApplicationId: __string,
        WriteEventStream: WriteEventStream
    ): PutEventStreamRequest = {
      val __obj = js.Dynamic.literal(
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any],
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
    @inline
    def apply(
        EventStream: EventStream
    ): PutEventStreamResponse = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        ApplicationId: __string,
        EventsRequest: EventsRequest
    ): PutEventsRequest = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        EventsResponse: EventsResponse
    ): PutEventsResponse = {
      val __obj = js.Dynamic.literal(
        "EventsResponse" -> EventsResponse.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[PutEventsResponse]
    }
  }

  /** Specifies the start and end times that define a time range when messages aren't sent to endpoints.
    */
  @js.native
  trait QuietTime extends js.Object {
    var End: js.UndefOr[__string]
    var Start: js.UndefOr[__string]
  }

  object QuietTime {
    @inline
    def apply(
        End: js.UndefOr[__string] = js.undefined,
        Start: js.UndefOr[__string] = js.undefined
    ): QuietTime = {
      val __obj = js.Dynamic.literal()
      End.foreach(__v => __obj.updateDynamic("End")(__v.asInstanceOf[js.Any]))
      Start.foreach(__v => __obj.updateDynamic("Start")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[QuietTime]
    }
  }

  /** Specifies the settings for a random split activity in a journey. This type of activity randomly sends specified percentages of participants down one of as many as five paths in a journey, based on conditions that you specify.
    */
  @js.native
  trait RandomSplitActivity extends js.Object {
    var Branches: js.UndefOr[ListOfRandomSplitEntry]
  }

  object RandomSplitActivity {
    @inline
    def apply(
        Branches: js.UndefOr[ListOfRandomSplitEntry] = js.undefined
    ): RandomSplitActivity = {
      val __obj = js.Dynamic.literal()
      Branches.foreach(__v => __obj.updateDynamic("Branches")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RandomSplitActivity]
    }
  }

  /** Specifies the settings for a path in a random split activity in a journey.
    */
  @js.native
  trait RandomSplitEntry extends js.Object {
    var NextActivity: js.UndefOr[__string]
    var Percentage: js.UndefOr[__integer]
  }

  object RandomSplitEntry {
    @inline
    def apply(
        NextActivity: js.UndefOr[__string] = js.undefined,
        Percentage: js.UndefOr[__integer] = js.undefined
    ): RandomSplitEntry = {
      val __obj = js.Dynamic.literal()
      NextActivity.foreach(__v => __obj.updateDynamic("NextActivity")(__v.asInstanceOf[js.Any]))
      Percentage.foreach(__v => __obj.updateDynamic("Percentage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RandomSplitEntry]
    }
  }

  /** Specifies the contents of an email message, represented as a raw MIME message.
    */
  @js.native
  trait RawEmail extends js.Object {
    var Data: js.UndefOr[__blob]
  }

  object RawEmail {
    @inline
    def apply(
        Data: js.UndefOr[__blob] = js.undefined
    ): RawEmail = {
      val __obj = js.Dynamic.literal()
      Data.foreach(__v => __obj.updateDynamic("Data")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RawEmail]
    }
  }

  /** Specifies criteria for including or excluding endpoints from a segment based on how recently an endpoint was active.
    */
  @js.native
  trait RecencyDimension extends js.Object {
    var Duration: Duration
    var RecencyType: RecencyType
  }

  object RecencyDimension {
    @inline
    def apply(
        Duration: Duration,
        RecencyType: RecencyType
    ): RecencyDimension = {
      val __obj = js.Dynamic.literal(
        "Duration" -> Duration.asInstanceOf[js.Any],
        "RecencyType" -> RecencyType.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[RecencyDimension]
    }
  }

  /** Provides information about Amazon Pinpoint configuration settings for retrieving and processing data from a recommender model.
    */
  @js.native
  trait RecommenderConfigurationResponse extends js.Object {
    var CreationDate: __string
    var Id: __string
    var LastModifiedDate: __string
    var RecommendationProviderRoleArn: __string
    var RecommendationProviderUri: __string
    var Attributes: js.UndefOr[MapOf__string]
    var Description: js.UndefOr[__string]
    var Name: js.UndefOr[__string]
    var RecommendationProviderIdType: js.UndefOr[__string]
    var RecommendationTransformerUri: js.UndefOr[__string]
    var RecommendationsDisplayName: js.UndefOr[__string]
    var RecommendationsPerMessage: js.UndefOr[__integer]
  }

  object RecommenderConfigurationResponse {
    @inline
    def apply(
        CreationDate: __string,
        Id: __string,
        LastModifiedDate: __string,
        RecommendationProviderRoleArn: __string,
        RecommendationProviderUri: __string,
        Attributes: js.UndefOr[MapOf__string] = js.undefined,
        Description: js.UndefOr[__string] = js.undefined,
        Name: js.UndefOr[__string] = js.undefined,
        RecommendationProviderIdType: js.UndefOr[__string] = js.undefined,
        RecommendationTransformerUri: js.UndefOr[__string] = js.undefined,
        RecommendationsDisplayName: js.UndefOr[__string] = js.undefined,
        RecommendationsPerMessage: js.UndefOr[__integer] = js.undefined
    ): RecommenderConfigurationResponse = {
      val __obj = js.Dynamic.literal(
        "CreationDate" -> CreationDate.asInstanceOf[js.Any],
        "Id" -> Id.asInstanceOf[js.Any],
        "LastModifiedDate" -> LastModifiedDate.asInstanceOf[js.Any],
        "RecommendationProviderRoleArn" -> RecommendationProviderRoleArn.asInstanceOf[js.Any],
        "RecommendationProviderUri" -> RecommendationProviderUri.asInstanceOf[js.Any]
      )

      Attributes.foreach(__v => __obj.updateDynamic("Attributes")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      RecommendationProviderIdType.foreach(__v => __obj.updateDynamic("RecommendationProviderIdType")(__v.asInstanceOf[js.Any]))
      RecommendationTransformerUri.foreach(__v => __obj.updateDynamic("RecommendationTransformerUri")(__v.asInstanceOf[js.Any]))
      RecommendationsDisplayName.foreach(__v => __obj.updateDynamic("RecommendationsDisplayName")(__v.asInstanceOf[js.Any]))
      RecommendationsPerMessage.foreach(__v => __obj.updateDynamic("RecommendationsPerMessage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RecommenderConfigurationResponse]
    }
  }

  @js.native
  trait RemoveAttributesRequest extends js.Object {
    var ApplicationId: __string
    var AttributeType: __string
    var UpdateAttributesRequest: UpdateAttributesRequest
  }

  object RemoveAttributesRequest {
    @inline
    def apply(
        ApplicationId: __string,
        AttributeType: __string,
        UpdateAttributesRequest: UpdateAttributesRequest
    ): RemoveAttributesRequest = {
      val __obj = js.Dynamic.literal(
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any],
        "AttributeType" -> AttributeType.asInstanceOf[js.Any],
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
    @inline
    def apply(
        AttributesResource: AttributesResource
    ): RemoveAttributesResponse = {
      val __obj = js.Dynamic.literal(
        "AttributesResource" -> AttributesResource.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[RemoveAttributesResponse]
    }
  }

  /** Provides the results of a query that retrieved the data for a standard metric that applies to an application, campaign, or journey.
    */
  @js.native
  trait ResultRow extends js.Object {
    var GroupedBys: ListOfResultRowValue
    var Values: ListOfResultRowValue
  }

  object ResultRow {
    @inline
    def apply(
        GroupedBys: ListOfResultRowValue,
        Values: ListOfResultRowValue
    ): ResultRow = {
      val __obj = js.Dynamic.literal(
        "GroupedBys" -> GroupedBys.asInstanceOf[js.Any],
        "Values" -> Values.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ResultRow]
    }
  }

  /** Provides a single value and metadata about that value as part of an array of query results for a standard metric that applies to an application, campaign, or journey.
    */
  @js.native
  trait ResultRowValue extends js.Object {
    var Key: __string
    var Type: __string
    var Value: __string
  }

  object ResultRowValue {
    @inline
    def apply(
        Key: __string,
        Type: __string,
        Value: __string
    ): ResultRowValue = {
      val __obj = js.Dynamic.literal(
        "Key" -> Key.asInstanceOf[js.Any],
        "Type" -> Type.asInstanceOf[js.Any],
        "Value" -> Value.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ResultRowValue]
    }
  }

  /** Specifies the status and settings of the SMS channel for an application.
    */
  @js.native
  trait SMSChannelRequest extends js.Object {
    var Enabled: js.UndefOr[__boolean]
    var SenderId: js.UndefOr[__string]
    var ShortCode: js.UndefOr[__string]
  }

  object SMSChannelRequest {
    @inline
    def apply(
        Enabled: js.UndefOr[__boolean] = js.undefined,
        SenderId: js.UndefOr[__string] = js.undefined,
        ShortCode: js.UndefOr[__string] = js.undefined
    ): SMSChannelRequest = {
      val __obj = js.Dynamic.literal()
      Enabled.foreach(__v => __obj.updateDynamic("Enabled")(__v.asInstanceOf[js.Any]))
      SenderId.foreach(__v => __obj.updateDynamic("SenderId")(__v.asInstanceOf[js.Any]))
      ShortCode.foreach(__v => __obj.updateDynamic("ShortCode")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SMSChannelRequest]
    }
  }

  /** Provides information about the status and settings of the SMS channel for an application.
    */
  @js.native
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

  object SMSChannelResponse {
    @inline
    def apply(
        Platform: __string,
        ApplicationId: js.UndefOr[__string] = js.undefined,
        CreationDate: js.UndefOr[__string] = js.undefined,
        Enabled: js.UndefOr[__boolean] = js.undefined,
        HasCredential: js.UndefOr[__boolean] = js.undefined,
        Id: js.UndefOr[__string] = js.undefined,
        IsArchived: js.UndefOr[__boolean] = js.undefined,
        LastModifiedBy: js.UndefOr[__string] = js.undefined,
        LastModifiedDate: js.UndefOr[__string] = js.undefined,
        PromotionalMessagesPerSecond: js.UndefOr[__integer] = js.undefined,
        SenderId: js.UndefOr[__string] = js.undefined,
        ShortCode: js.UndefOr[__string] = js.undefined,
        TransactionalMessagesPerSecond: js.UndefOr[__integer] = js.undefined,
        Version: js.UndefOr[__integer] = js.undefined
    ): SMSChannelResponse = {
      val __obj = js.Dynamic.literal(
        "Platform" -> Platform.asInstanceOf[js.Any]
      )

      ApplicationId.foreach(__v => __obj.updateDynamic("ApplicationId")(__v.asInstanceOf[js.Any]))
      CreationDate.foreach(__v => __obj.updateDynamic("CreationDate")(__v.asInstanceOf[js.Any]))
      Enabled.foreach(__v => __obj.updateDynamic("Enabled")(__v.asInstanceOf[js.Any]))
      HasCredential.foreach(__v => __obj.updateDynamic("HasCredential")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      IsArchived.foreach(__v => __obj.updateDynamic("IsArchived")(__v.asInstanceOf[js.Any]))
      LastModifiedBy.foreach(__v => __obj.updateDynamic("LastModifiedBy")(__v.asInstanceOf[js.Any]))
      LastModifiedDate.foreach(__v => __obj.updateDynamic("LastModifiedDate")(__v.asInstanceOf[js.Any]))
      PromotionalMessagesPerSecond.foreach(__v => __obj.updateDynamic("PromotionalMessagesPerSecond")(__v.asInstanceOf[js.Any]))
      SenderId.foreach(__v => __obj.updateDynamic("SenderId")(__v.asInstanceOf[js.Any]))
      ShortCode.foreach(__v => __obj.updateDynamic("ShortCode")(__v.asInstanceOf[js.Any]))
      TransactionalMessagesPerSecond.foreach(__v => __obj.updateDynamic("TransactionalMessagesPerSecond")(__v.asInstanceOf[js.Any]))
      Version.foreach(__v => __obj.updateDynamic("Version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SMSChannelResponse]
    }
  }

  /** Specifies the default settings for a one-time SMS message that's sent directly to an endpoint.
    */
  @js.native
  trait SMSMessage extends js.Object {
    var Body: js.UndefOr[__string]
    var EntityId: js.UndefOr[__string]
    var Keyword: js.UndefOr[__string]
    var MediaUrl: js.UndefOr[__string]
    var MessageType: js.UndefOr[MessageType]
    var OriginationNumber: js.UndefOr[__string]
    var SenderId: js.UndefOr[__string]
    var Substitutions: js.UndefOr[MapOfListOf__string]
    var TemplateId: js.UndefOr[__string]
  }

  object SMSMessage {
    @inline
    def apply(
        Body: js.UndefOr[__string] = js.undefined,
        EntityId: js.UndefOr[__string] = js.undefined,
        Keyword: js.UndefOr[__string] = js.undefined,
        MediaUrl: js.UndefOr[__string] = js.undefined,
        MessageType: js.UndefOr[MessageType] = js.undefined,
        OriginationNumber: js.UndefOr[__string] = js.undefined,
        SenderId: js.UndefOr[__string] = js.undefined,
        Substitutions: js.UndefOr[MapOfListOf__string] = js.undefined,
        TemplateId: js.UndefOr[__string] = js.undefined
    ): SMSMessage = {
      val __obj = js.Dynamic.literal()
      Body.foreach(__v => __obj.updateDynamic("Body")(__v.asInstanceOf[js.Any]))
      EntityId.foreach(__v => __obj.updateDynamic("EntityId")(__v.asInstanceOf[js.Any]))
      Keyword.foreach(__v => __obj.updateDynamic("Keyword")(__v.asInstanceOf[js.Any]))
      MediaUrl.foreach(__v => __obj.updateDynamic("MediaUrl")(__v.asInstanceOf[js.Any]))
      MessageType.foreach(__v => __obj.updateDynamic("MessageType")(__v.asInstanceOf[js.Any]))
      OriginationNumber.foreach(__v => __obj.updateDynamic("OriginationNumber")(__v.asInstanceOf[js.Any]))
      SenderId.foreach(__v => __obj.updateDynamic("SenderId")(__v.asInstanceOf[js.Any]))
      Substitutions.foreach(__v => __obj.updateDynamic("Substitutions")(__v.asInstanceOf[js.Any]))
      TemplateId.foreach(__v => __obj.updateDynamic("TemplateId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SMSMessage]
    }
  }

  /** Specifies the settings for an SMS activity in a journey. This type of activity sends a text message to participants.
    */
  @js.native
  trait SMSMessageActivity extends js.Object {
    var MessageConfig: js.UndefOr[JourneySMSMessage]
    var NextActivity: js.UndefOr[__string]
    var TemplateName: js.UndefOr[__string]
    var TemplateVersion: js.UndefOr[__string]
  }

  object SMSMessageActivity {
    @inline
    def apply(
        MessageConfig: js.UndefOr[JourneySMSMessage] = js.undefined,
        NextActivity: js.UndefOr[__string] = js.undefined,
        TemplateName: js.UndefOr[__string] = js.undefined,
        TemplateVersion: js.UndefOr[__string] = js.undefined
    ): SMSMessageActivity = {
      val __obj = js.Dynamic.literal()
      MessageConfig.foreach(__v => __obj.updateDynamic("MessageConfig")(__v.asInstanceOf[js.Any]))
      NextActivity.foreach(__v => __obj.updateDynamic("NextActivity")(__v.asInstanceOf[js.Any]))
      TemplateName.foreach(__v => __obj.updateDynamic("TemplateName")(__v.asInstanceOf[js.Any]))
      TemplateVersion.foreach(__v => __obj.updateDynamic("TemplateVersion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SMSMessageActivity]
    }
  }

  /** Specifies the content and settings for a message template that can be used in text messages that are sent through the SMS channel.
    */
  @js.native
  trait SMSTemplateRequest extends js.Object {
    var Body: js.UndefOr[__string]
    var DefaultSubstitutions: js.UndefOr[__string]
    var RecommenderId: js.UndefOr[__string]
    var TemplateDescription: js.UndefOr[__string]
    var tags: js.UndefOr[MapOf__string]
  }

  object SMSTemplateRequest {
    @inline
    def apply(
        Body: js.UndefOr[__string] = js.undefined,
        DefaultSubstitutions: js.UndefOr[__string] = js.undefined,
        RecommenderId: js.UndefOr[__string] = js.undefined,
        TemplateDescription: js.UndefOr[__string] = js.undefined,
        tags: js.UndefOr[MapOf__string] = js.undefined
    ): SMSTemplateRequest = {
      val __obj = js.Dynamic.literal()
      Body.foreach(__v => __obj.updateDynamic("Body")(__v.asInstanceOf[js.Any]))
      DefaultSubstitutions.foreach(__v => __obj.updateDynamic("DefaultSubstitutions")(__v.asInstanceOf[js.Any]))
      RecommenderId.foreach(__v => __obj.updateDynamic("RecommenderId")(__v.asInstanceOf[js.Any]))
      TemplateDescription.foreach(__v => __obj.updateDynamic("TemplateDescription")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SMSTemplateRequest]
    }
  }

  /** Provides information about the content and settings for a message template that can be used in text messages that are sent through the SMS channel.
    */
  @js.native
  trait SMSTemplateResponse extends js.Object {
    var CreationDate: __string
    var LastModifiedDate: __string
    var TemplateName: __string
    var TemplateType: TemplateType
    var Arn: js.UndefOr[__string]
    var Body: js.UndefOr[__string]
    var DefaultSubstitutions: js.UndefOr[__string]
    var RecommenderId: js.UndefOr[__string]
    var TemplateDescription: js.UndefOr[__string]
    var Version: js.UndefOr[__string]
    var tags: js.UndefOr[MapOf__string]
  }

  object SMSTemplateResponse {
    @inline
    def apply(
        CreationDate: __string,
        LastModifiedDate: __string,
        TemplateName: __string,
        TemplateType: TemplateType,
        Arn: js.UndefOr[__string] = js.undefined,
        Body: js.UndefOr[__string] = js.undefined,
        DefaultSubstitutions: js.UndefOr[__string] = js.undefined,
        RecommenderId: js.UndefOr[__string] = js.undefined,
        TemplateDescription: js.UndefOr[__string] = js.undefined,
        Version: js.UndefOr[__string] = js.undefined,
        tags: js.UndefOr[MapOf__string] = js.undefined
    ): SMSTemplateResponse = {
      val __obj = js.Dynamic.literal(
        "CreationDate" -> CreationDate.asInstanceOf[js.Any],
        "LastModifiedDate" -> LastModifiedDate.asInstanceOf[js.Any],
        "TemplateName" -> TemplateName.asInstanceOf[js.Any],
        "TemplateType" -> TemplateType.asInstanceOf[js.Any]
      )

      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      Body.foreach(__v => __obj.updateDynamic("Body")(__v.asInstanceOf[js.Any]))
      DefaultSubstitutions.foreach(__v => __obj.updateDynamic("DefaultSubstitutions")(__v.asInstanceOf[js.Any]))
      RecommenderId.foreach(__v => __obj.updateDynamic("RecommenderId")(__v.asInstanceOf[js.Any]))
      TemplateDescription.foreach(__v => __obj.updateDynamic("TemplateDescription")(__v.asInstanceOf[js.Any]))
      Version.foreach(__v => __obj.updateDynamic("Version")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SMSTemplateResponse]
    }
  }

  /** Specifies the schedule settings for a campaign.
    */
  @js.native
  trait Schedule extends js.Object {
    var StartTime: __string
    var EndTime: js.UndefOr[__string]
    var EventFilter: js.UndefOr[CampaignEventFilter]
    var Frequency: js.UndefOr[Frequency]
    var IsLocalTime: js.UndefOr[__boolean]
    var QuietTime: js.UndefOr[QuietTime]
    var Timezone: js.UndefOr[__string]
  }

  object Schedule {
    @inline
    def apply(
        StartTime: __string,
        EndTime: js.UndefOr[__string] = js.undefined,
        EventFilter: js.UndefOr[CampaignEventFilter] = js.undefined,
        Frequency: js.UndefOr[Frequency] = js.undefined,
        IsLocalTime: js.UndefOr[__boolean] = js.undefined,
        QuietTime: js.UndefOr[QuietTime] = js.undefined,
        Timezone: js.UndefOr[__string] = js.undefined
    ): Schedule = {
      val __obj = js.Dynamic.literal(
        "StartTime" -> StartTime.asInstanceOf[js.Any]
      )

      EndTime.foreach(__v => __obj.updateDynamic("EndTime")(__v.asInstanceOf[js.Any]))
      EventFilter.foreach(__v => __obj.updateDynamic("EventFilter")(__v.asInstanceOf[js.Any]))
      Frequency.foreach(__v => __obj.updateDynamic("Frequency")(__v.asInstanceOf[js.Any]))
      IsLocalTime.foreach(__v => __obj.updateDynamic("IsLocalTime")(__v.asInstanceOf[js.Any]))
      QuietTime.foreach(__v => __obj.updateDynamic("QuietTime")(__v.asInstanceOf[js.Any]))
      Timezone.foreach(__v => __obj.updateDynamic("Timezone")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Schedule]
    }
  }

  /** Specifies dimension settings for including or excluding endpoints from a segment based on how recently an endpoint was active.
    */
  @js.native
  trait SegmentBehaviors extends js.Object {
    var Recency: js.UndefOr[RecencyDimension]
  }

  object SegmentBehaviors {
    @inline
    def apply(
        Recency: js.UndefOr[RecencyDimension] = js.undefined
    ): SegmentBehaviors = {
      val __obj = js.Dynamic.literal()
      Recency.foreach(__v => __obj.updateDynamic("Recency")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SegmentBehaviors]
    }
  }

  /** Specifies a segment to associate with an activity in a journey.
    */
  @js.native
  trait SegmentCondition extends js.Object {
    var SegmentId: __string
  }

  object SegmentCondition {
    @inline
    def apply(
        SegmentId: __string
    ): SegmentCondition = {
      val __obj = js.Dynamic.literal(
        "SegmentId" -> SegmentId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[SegmentCondition]
    }
  }

  /** Specifies demographic-based dimension settings for including or excluding endpoints from a segment. These settings derive from characteristics of endpoint devices, such as platform, make, and model.
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
    @inline
    def apply(
        AppVersion: js.UndefOr[SetDimension] = js.undefined,
        Channel: js.UndefOr[SetDimension] = js.undefined,
        DeviceType: js.UndefOr[SetDimension] = js.undefined,
        Make: js.UndefOr[SetDimension] = js.undefined,
        Model: js.UndefOr[SetDimension] = js.undefined,
        Platform: js.UndefOr[SetDimension] = js.undefined
    ): SegmentDemographics = {
      val __obj = js.Dynamic.literal()
      AppVersion.foreach(__v => __obj.updateDynamic("AppVersion")(__v.asInstanceOf[js.Any]))
      Channel.foreach(__v => __obj.updateDynamic("Channel")(__v.asInstanceOf[js.Any]))
      DeviceType.foreach(__v => __obj.updateDynamic("DeviceType")(__v.asInstanceOf[js.Any]))
      Make.foreach(__v => __obj.updateDynamic("Make")(__v.asInstanceOf[js.Any]))
      Model.foreach(__v => __obj.updateDynamic("Model")(__v.asInstanceOf[js.Any]))
      Platform.foreach(__v => __obj.updateDynamic("Platform")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SegmentDemographics]
    }
  }

  /** Specifies the dimension settings for a segment.
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
    @inline
    def apply(
        Attributes: js.UndefOr[MapOfAttributeDimension] = js.undefined,
        Behavior: js.UndefOr[SegmentBehaviors] = js.undefined,
        Demographic: js.UndefOr[SegmentDemographics] = js.undefined,
        Location: js.UndefOr[SegmentLocation] = js.undefined,
        Metrics: js.UndefOr[MapOfMetricDimension] = js.undefined,
        UserAttributes: js.UndefOr[MapOfAttributeDimension] = js.undefined
    ): SegmentDimensions = {
      val __obj = js.Dynamic.literal()
      Attributes.foreach(__v => __obj.updateDynamic("Attributes")(__v.asInstanceOf[js.Any]))
      Behavior.foreach(__v => __obj.updateDynamic("Behavior")(__v.asInstanceOf[js.Any]))
      Demographic.foreach(__v => __obj.updateDynamic("Demographic")(__v.asInstanceOf[js.Any]))
      Location.foreach(__v => __obj.updateDynamic("Location")(__v.asInstanceOf[js.Any]))
      Metrics.foreach(__v => __obj.updateDynamic("Metrics")(__v.asInstanceOf[js.Any]))
      UserAttributes.foreach(__v => __obj.updateDynamic("UserAttributes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SegmentDimensions]
    }
  }

  /** Specifies the base segments and dimensions for a segment, and the relationships between these base segments and dimensions.
    */
  @js.native
  trait SegmentGroup extends js.Object {
    var Dimensions: js.UndefOr[ListOfSegmentDimensions]
    var SourceSegments: js.UndefOr[ListOfSegmentReference]
    var SourceType: js.UndefOr[SourceType]
    var Type: js.UndefOr[Type]
  }

  object SegmentGroup {
    @inline
    def apply(
        Dimensions: js.UndefOr[ListOfSegmentDimensions] = js.undefined,
        SourceSegments: js.UndefOr[ListOfSegmentReference] = js.undefined,
        SourceType: js.UndefOr[SourceType] = js.undefined,
        Type: js.UndefOr[Type] = js.undefined
    ): SegmentGroup = {
      val __obj = js.Dynamic.literal()
      Dimensions.foreach(__v => __obj.updateDynamic("Dimensions")(__v.asInstanceOf[js.Any]))
      SourceSegments.foreach(__v => __obj.updateDynamic("SourceSegments")(__v.asInstanceOf[js.Any]))
      SourceType.foreach(__v => __obj.updateDynamic("SourceType")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SegmentGroup]
    }
  }

  /** Specifies the settings that define the relationships between segment groups for a segment.
    */
  @js.native
  trait SegmentGroupList extends js.Object {
    var Groups: js.UndefOr[ListOfSegmentGroup]
    var Include: js.UndefOr[Include]
  }

  object SegmentGroupList {
    @inline
    def apply(
        Groups: js.UndefOr[ListOfSegmentGroup] = js.undefined,
        Include: js.UndefOr[Include] = js.undefined
    ): SegmentGroupList = {
      val __obj = js.Dynamic.literal()
      Groups.foreach(__v => __obj.updateDynamic("Groups")(__v.asInstanceOf[js.Any]))
      Include.foreach(__v => __obj.updateDynamic("Include")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SegmentGroupList]
    }
  }

  /** Provides information about the import job that created a segment. An import job is a job that creates a user segment by importing endpoint definitions.
    */
  @js.native
  trait SegmentImportResource extends js.Object {
    var ExternalId: __string
    var Format: Format
    var RoleArn: __string
    var S3Url: __string
    var Size: __integer
    var ChannelCounts: js.UndefOr[MapOf__integer]
  }

  object SegmentImportResource {
    @inline
    def apply(
        ExternalId: __string,
        Format: Format,
        RoleArn: __string,
        S3Url: __string,
        Size: __integer,
        ChannelCounts: js.UndefOr[MapOf__integer] = js.undefined
    ): SegmentImportResource = {
      val __obj = js.Dynamic.literal(
        "ExternalId" -> ExternalId.asInstanceOf[js.Any],
        "Format" -> Format.asInstanceOf[js.Any],
        "RoleArn" -> RoleArn.asInstanceOf[js.Any],
        "S3Url" -> S3Url.asInstanceOf[js.Any],
        "Size" -> Size.asInstanceOf[js.Any]
      )

      ChannelCounts.foreach(__v => __obj.updateDynamic("ChannelCounts")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SegmentImportResource]
    }
  }

  /** Specifies geographical dimension settings for a segment.
    */
  @js.native
  trait SegmentLocation extends js.Object {
    var Country: js.UndefOr[SetDimension]
    var GPSPoint: js.UndefOr[GPSPointDimension]
  }

  object SegmentLocation {
    @inline
    def apply(
        Country: js.UndefOr[SetDimension] = js.undefined,
        GPSPoint: js.UndefOr[GPSPointDimension] = js.undefined
    ): SegmentLocation = {
      val __obj = js.Dynamic.literal()
      Country.foreach(__v => __obj.updateDynamic("Country")(__v.asInstanceOf[js.Any]))
      GPSPoint.foreach(__v => __obj.updateDynamic("GPSPoint")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SegmentLocation]
    }
  }

  /** Specifies the segment identifier and version of a segment.
    */
  @js.native
  trait SegmentReference extends js.Object {
    var Id: __string
    var Version: js.UndefOr[__integer]
  }

  object SegmentReference {
    @inline
    def apply(
        Id: __string,
        Version: js.UndefOr[__integer] = js.undefined
    ): SegmentReference = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any]
      )

      Version.foreach(__v => __obj.updateDynamic("Version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SegmentReference]
    }
  }

  /** Provides information about the configuration, dimension, and other settings for a segment.
    */
  @js.native
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

  object SegmentResponse {
    @inline
    def apply(
        ApplicationId: __string,
        Arn: __string,
        CreationDate: __string,
        Id: __string,
        SegmentType: SegmentType,
        Dimensions: js.UndefOr[SegmentDimensions] = js.undefined,
        ImportDefinition: js.UndefOr[SegmentImportResource] = js.undefined,
        LastModifiedDate: js.UndefOr[__string] = js.undefined,
        Name: js.UndefOr[__string] = js.undefined,
        SegmentGroups: js.UndefOr[SegmentGroupList] = js.undefined,
        Version: js.UndefOr[__integer] = js.undefined,
        tags: js.UndefOr[MapOf__string] = js.undefined
    ): SegmentResponse = {
      val __obj = js.Dynamic.literal(
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any],
        "Arn" -> Arn.asInstanceOf[js.Any],
        "CreationDate" -> CreationDate.asInstanceOf[js.Any],
        "Id" -> Id.asInstanceOf[js.Any],
        "SegmentType" -> SegmentType.asInstanceOf[js.Any]
      )

      Dimensions.foreach(__v => __obj.updateDynamic("Dimensions")(__v.asInstanceOf[js.Any]))
      ImportDefinition.foreach(__v => __obj.updateDynamic("ImportDefinition")(__v.asInstanceOf[js.Any]))
      LastModifiedDate.foreach(__v => __obj.updateDynamic("LastModifiedDate")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      SegmentGroups.foreach(__v => __obj.updateDynamic("SegmentGroups")(__v.asInstanceOf[js.Any]))
      Version.foreach(__v => __obj.updateDynamic("Version")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SegmentResponse]
    }
  }

  /** Provides information about all the segments that are associated with an application.
    */
  @js.native
  trait SegmentsResponse extends js.Object {
    var Item: ListOfSegmentResponse
    var NextToken: js.UndefOr[__string]
  }

  object SegmentsResponse {
    @inline
    def apply(
        Item: ListOfSegmentResponse,
        NextToken: js.UndefOr[__string] = js.undefined
    ): SegmentsResponse = {
      val __obj = js.Dynamic.literal(
        "Item" -> Item.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SegmentsResponse]
    }
  }

  @js.native
  trait SendMessagesRequest extends js.Object {
    var ApplicationId: __string
    var MessageRequest: MessageRequest
  }

  object SendMessagesRequest {
    @inline
    def apply(
        ApplicationId: __string,
        MessageRequest: MessageRequest
    ): SendMessagesRequest = {
      val __obj = js.Dynamic.literal(
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any],
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
    @inline
    def apply(
        MessageResponse: MessageResponse
    ): SendMessagesResponse = {
      val __obj = js.Dynamic.literal(
        "MessageResponse" -> MessageResponse.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[SendMessagesResponse]
    }
  }

  @js.native
  trait SendOTPMessageRequest extends js.Object {
    var ApplicationId: __string
    var SendOTPMessageRequestParameters: SendOTPMessageRequestParameters
  }

  object SendOTPMessageRequest {
    @inline
    def apply(
        ApplicationId: __string,
        SendOTPMessageRequestParameters: SendOTPMessageRequestParameters
    ): SendOTPMessageRequest = {
      val __obj = js.Dynamic.literal(
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any],
        "SendOTPMessageRequestParameters" -> SendOTPMessageRequestParameters.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[SendOTPMessageRequest]
    }
  }

  /** Send OTP message request parameters.
    */
  @js.native
  trait SendOTPMessageRequestParameters extends js.Object {
    var BrandName: __string
    var Channel: __string
    var DestinationIdentity: __string
    var OriginationIdentity: __string
    var ReferenceId: __string
    var AllowedAttempts: js.UndefOr[__integer]
    var CodeLength: js.UndefOr[__integer]
    var EntityId: js.UndefOr[__string]
    var Language: js.UndefOr[__string]
    var TemplateId: js.UndefOr[__string]
    var ValidityPeriod: js.UndefOr[__integer]
  }

  object SendOTPMessageRequestParameters {
    @inline
    def apply(
        BrandName: __string,
        Channel: __string,
        DestinationIdentity: __string,
        OriginationIdentity: __string,
        ReferenceId: __string,
        AllowedAttempts: js.UndefOr[__integer] = js.undefined,
        CodeLength: js.UndefOr[__integer] = js.undefined,
        EntityId: js.UndefOr[__string] = js.undefined,
        Language: js.UndefOr[__string] = js.undefined,
        TemplateId: js.UndefOr[__string] = js.undefined,
        ValidityPeriod: js.UndefOr[__integer] = js.undefined
    ): SendOTPMessageRequestParameters = {
      val __obj = js.Dynamic.literal(
        "BrandName" -> BrandName.asInstanceOf[js.Any],
        "Channel" -> Channel.asInstanceOf[js.Any],
        "DestinationIdentity" -> DestinationIdentity.asInstanceOf[js.Any],
        "OriginationIdentity" -> OriginationIdentity.asInstanceOf[js.Any],
        "ReferenceId" -> ReferenceId.asInstanceOf[js.Any]
      )

      AllowedAttempts.foreach(__v => __obj.updateDynamic("AllowedAttempts")(__v.asInstanceOf[js.Any]))
      CodeLength.foreach(__v => __obj.updateDynamic("CodeLength")(__v.asInstanceOf[js.Any]))
      EntityId.foreach(__v => __obj.updateDynamic("EntityId")(__v.asInstanceOf[js.Any]))
      Language.foreach(__v => __obj.updateDynamic("Language")(__v.asInstanceOf[js.Any]))
      TemplateId.foreach(__v => __obj.updateDynamic("TemplateId")(__v.asInstanceOf[js.Any]))
      ValidityPeriod.foreach(__v => __obj.updateDynamic("ValidityPeriod")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SendOTPMessageRequestParameters]
    }
  }

  @js.native
  trait SendOTPMessageResponse extends js.Object {
    var MessageResponse: MessageResponse
  }

  object SendOTPMessageResponse {
    @inline
    def apply(
        MessageResponse: MessageResponse
    ): SendOTPMessageResponse = {
      val __obj = js.Dynamic.literal(
        "MessageResponse" -> MessageResponse.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[SendOTPMessageResponse]
    }
  }

  /** Specifies the configuration and other settings for a message to send to all the endpoints that are associated with a list of users.
    */
  @js.native
  trait SendUsersMessageRequest extends js.Object {
    var MessageConfiguration: DirectMessageConfiguration
    var Users: MapOfEndpointSendConfiguration
    var Context: js.UndefOr[MapOf__string]
    var TemplateConfiguration: js.UndefOr[TemplateConfiguration]
    var TraceId: js.UndefOr[__string]
  }

  object SendUsersMessageRequest {
    @inline
    def apply(
        MessageConfiguration: DirectMessageConfiguration,
        Users: MapOfEndpointSendConfiguration,
        Context: js.UndefOr[MapOf__string] = js.undefined,
        TemplateConfiguration: js.UndefOr[TemplateConfiguration] = js.undefined,
        TraceId: js.UndefOr[__string] = js.undefined
    ): SendUsersMessageRequest = {
      val __obj = js.Dynamic.literal(
        "MessageConfiguration" -> MessageConfiguration.asInstanceOf[js.Any],
        "Users" -> Users.asInstanceOf[js.Any]
      )

      Context.foreach(__v => __obj.updateDynamic("Context")(__v.asInstanceOf[js.Any]))
      TemplateConfiguration.foreach(__v => __obj.updateDynamic("TemplateConfiguration")(__v.asInstanceOf[js.Any]))
      TraceId.foreach(__v => __obj.updateDynamic("TraceId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SendUsersMessageRequest]
    }
  }

  /** Provides information about which users and endpoints a message was sent to.
    */
  @js.native
  trait SendUsersMessageResponse extends js.Object {
    var ApplicationId: __string
    var RequestId: js.UndefOr[__string]
    var Result: js.UndefOr[MapOfMapOfEndpointMessageResult]
  }

  object SendUsersMessageResponse {
    @inline
    def apply(
        ApplicationId: __string,
        RequestId: js.UndefOr[__string] = js.undefined,
        Result: js.UndefOr[MapOfMapOfEndpointMessageResult] = js.undefined
    ): SendUsersMessageResponse = {
      val __obj = js.Dynamic.literal(
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any]
      )

      RequestId.foreach(__v => __obj.updateDynamic("RequestId")(__v.asInstanceOf[js.Any]))
      Result.foreach(__v => __obj.updateDynamic("Result")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SendUsersMessageResponse]
    }
  }

  @js.native
  trait SendUsersMessagesRequest extends js.Object {
    var ApplicationId: __string
    var SendUsersMessageRequest: SendUsersMessageRequest
  }

  object SendUsersMessagesRequest {
    @inline
    def apply(
        ApplicationId: __string,
        SendUsersMessageRequest: SendUsersMessageRequest
    ): SendUsersMessagesRequest = {
      val __obj = js.Dynamic.literal(
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any],
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
    @inline
    def apply(
        SendUsersMessageResponse: SendUsersMessageResponse
    ): SendUsersMessagesResponse = {
      val __obj = js.Dynamic.literal(
        "SendUsersMessageResponse" -> SendUsersMessageResponse.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[SendUsersMessagesResponse]
    }
  }

  /** Provides information about a session.
    */
  @js.native
  trait Session extends js.Object {
    var Id: __string
    var StartTimestamp: __string
    var Duration: js.UndefOr[__integer]
    var StopTimestamp: js.UndefOr[__string]
  }

  object Session {
    @inline
    def apply(
        Id: __string,
        StartTimestamp: __string,
        Duration: js.UndefOr[__integer] = js.undefined,
        StopTimestamp: js.UndefOr[__string] = js.undefined
    ): Session = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any],
        "StartTimestamp" -> StartTimestamp.asInstanceOf[js.Any]
      )

      Duration.foreach(__v => __obj.updateDynamic("Duration")(__v.asInstanceOf[js.Any]))
      StopTimestamp.foreach(__v => __obj.updateDynamic("StopTimestamp")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Session]
    }
  }

  /** Specifies the dimension type and values for a segment dimension.
    */
  @js.native
  trait SetDimension extends js.Object {
    var Values: ListOf__string
    var DimensionType: js.UndefOr[DimensionType]
  }

  object SetDimension {
    @inline
    def apply(
        Values: ListOf__string,
        DimensionType: js.UndefOr[DimensionType] = js.undefined
    ): SetDimension = {
      val __obj = js.Dynamic.literal(
        "Values" -> Values.asInstanceOf[js.Any]
      )

      DimensionType.foreach(__v => __obj.updateDynamic("DimensionType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SetDimension]
    }
  }

  /** Specifies a condition to evaluate for an activity in a journey.
    */
  @js.native
  trait SimpleCondition extends js.Object {
    var EventCondition: js.UndefOr[EventCondition]
    var SegmentCondition: js.UndefOr[SegmentCondition]
    var SegmentDimensions: js.UndefOr[SegmentDimensions]
  }

  object SimpleCondition {
    @inline
    def apply(
        EventCondition: js.UndefOr[EventCondition] = js.undefined,
        SegmentCondition: js.UndefOr[SegmentCondition] = js.undefined,
        SegmentDimensions: js.UndefOr[SegmentDimensions] = js.undefined
    ): SimpleCondition = {
      val __obj = js.Dynamic.literal()
      EventCondition.foreach(__v => __obj.updateDynamic("EventCondition")(__v.asInstanceOf[js.Any]))
      SegmentCondition.foreach(__v => __obj.updateDynamic("SegmentCondition")(__v.asInstanceOf[js.Any]))
      SegmentDimensions.foreach(__v => __obj.updateDynamic("SegmentDimensions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SimpleCondition]
    }
  }

  /** Specifies the contents of an email message, composed of a subject, a text part, and an HTML part.
    */
  @js.native
  trait SimpleEmail extends js.Object {
    var HtmlPart: js.UndefOr[SimpleEmailPart]
    var Subject: js.UndefOr[SimpleEmailPart]
    var TextPart: js.UndefOr[SimpleEmailPart]
  }

  object SimpleEmail {
    @inline
    def apply(
        HtmlPart: js.UndefOr[SimpleEmailPart] = js.undefined,
        Subject: js.UndefOr[SimpleEmailPart] = js.undefined,
        TextPart: js.UndefOr[SimpleEmailPart] = js.undefined
    ): SimpleEmail = {
      val __obj = js.Dynamic.literal()
      HtmlPart.foreach(__v => __obj.updateDynamic("HtmlPart")(__v.asInstanceOf[js.Any]))
      Subject.foreach(__v => __obj.updateDynamic("Subject")(__v.asInstanceOf[js.Any]))
      TextPart.foreach(__v => __obj.updateDynamic("TextPart")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SimpleEmail]
    }
  }

  /** Specifies the subject or body of an email message, represented as textual email data and the applicable character set.
    */
  @js.native
  trait SimpleEmailPart extends js.Object {
    var Charset: js.UndefOr[__string]
    var Data: js.UndefOr[__string]
  }

  object SimpleEmailPart {
    @inline
    def apply(
        Charset: js.UndefOr[__string] = js.undefined,
        Data: js.UndefOr[__string] = js.undefined
    ): SimpleEmailPart = {
      val __obj = js.Dynamic.literal()
      Charset.foreach(__v => __obj.updateDynamic("Charset")(__v.asInstanceOf[js.Any]))
      Data.foreach(__v => __obj.updateDynamic("Data")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SimpleEmailPart]
    }
  }

  /** Specifies the conditions for the first activity in a journey. This activity and its conditions determine which users are participants in a journey.
    */
  @js.native
  trait StartCondition extends js.Object {
    var Description: js.UndefOr[__string]
    var EventStartCondition: js.UndefOr[EventStartCondition]
    var SegmentStartCondition: js.UndefOr[SegmentCondition]
  }

  object StartCondition {
    @inline
    def apply(
        Description: js.UndefOr[__string] = js.undefined,
        EventStartCondition: js.UndefOr[EventStartCondition] = js.undefined,
        SegmentStartCondition: js.UndefOr[SegmentCondition] = js.undefined
    ): StartCondition = {
      val __obj = js.Dynamic.literal()
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      EventStartCondition.foreach(__v => __obj.updateDynamic("EventStartCondition")(__v.asInstanceOf[js.Any]))
      SegmentStartCondition.foreach(__v => __obj.updateDynamic("SegmentStartCondition")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartCondition]
    }
  }

  @js.native
  trait TagResourceRequest extends js.Object {
    var ResourceArn: __string
    var TagsModel: TagsModel
  }

  object TagResourceRequest {
    @inline
    def apply(
        ResourceArn: __string,
        TagsModel: TagsModel
    ): TagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any],
        "TagsModel" -> TagsModel.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[TagResourceRequest]
    }
  }

  /** Specifies the tags (keys and values) for an application, campaign, message template, or segment.
    */
  @js.native
  trait TagsModel extends js.Object {
    var tags: MapOf__string
  }

  object TagsModel {
    @inline
    def apply(
        tags: MapOf__string
    ): TagsModel = {
      val __obj = js.Dynamic.literal(
        "tags" -> tags.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[TagsModel]
    }
  }

  /** Specifies the name and version of the message template to use for the message.
    */
  @js.native
  trait Template extends js.Object {
    var Name: js.UndefOr[__string]
    var Version: js.UndefOr[__string]
  }

  object Template {
    @inline
    def apply(
        Name: js.UndefOr[__string] = js.undefined,
        Version: js.UndefOr[__string] = js.undefined
    ): Template = {
      val __obj = js.Dynamic.literal()
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Version.foreach(__v => __obj.updateDynamic("Version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Template]
    }
  }

  /** Specifies which version of a message template to use as the active version of the template.
    */
  @js.native
  trait TemplateActiveVersionRequest extends js.Object {
    var Version: js.UndefOr[__string]
  }

  object TemplateActiveVersionRequest {
    @inline
    def apply(
        Version: js.UndefOr[__string] = js.undefined
    ): TemplateActiveVersionRequest = {
      val __obj = js.Dynamic.literal()
      Version.foreach(__v => __obj.updateDynamic("Version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TemplateActiveVersionRequest]
    }
  }

  /** Specifies the message template to use for the message, for each type of channel.
    */
  @js.native
  trait TemplateConfiguration extends js.Object {
    var EmailTemplate: js.UndefOr[Template]
    var PushTemplate: js.UndefOr[Template]
    var SMSTemplate: js.UndefOr[Template]
    var VoiceTemplate: js.UndefOr[Template]
  }

  object TemplateConfiguration {
    @inline
    def apply(
        EmailTemplate: js.UndefOr[Template] = js.undefined,
        PushTemplate: js.UndefOr[Template] = js.undefined,
        SMSTemplate: js.UndefOr[Template] = js.undefined,
        VoiceTemplate: js.UndefOr[Template] = js.undefined
    ): TemplateConfiguration = {
      val __obj = js.Dynamic.literal()
      EmailTemplate.foreach(__v => __obj.updateDynamic("EmailTemplate")(__v.asInstanceOf[js.Any]))
      PushTemplate.foreach(__v => __obj.updateDynamic("PushTemplate")(__v.asInstanceOf[js.Any]))
      SMSTemplate.foreach(__v => __obj.updateDynamic("SMSTemplate")(__v.asInstanceOf[js.Any]))
      VoiceTemplate.foreach(__v => __obj.updateDynamic("VoiceTemplate")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TemplateConfiguration]
    }
  }

  /** Provides information about a request to create a message template.
    */
  @js.native
  trait TemplateCreateMessageBody extends js.Object {
    var Arn: js.UndefOr[__string]
    var Message: js.UndefOr[__string]
    var RequestID: js.UndefOr[__string]
  }

  object TemplateCreateMessageBody {
    @inline
    def apply(
        Arn: js.UndefOr[__string] = js.undefined,
        Message: js.UndefOr[__string] = js.undefined,
        RequestID: js.UndefOr[__string] = js.undefined
    ): TemplateCreateMessageBody = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      Message.foreach(__v => __obj.updateDynamic("Message")(__v.asInstanceOf[js.Any]))
      RequestID.foreach(__v => __obj.updateDynamic("RequestID")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TemplateCreateMessageBody]
    }
  }

  /** Provides information about a message template that's associated with your Amazon Pinpoint account.
    */
  @js.native
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

  object TemplateResponse {
    @inline
    def apply(
        CreationDate: __string,
        LastModifiedDate: __string,
        TemplateName: __string,
        TemplateType: TemplateType,
        Arn: js.UndefOr[__string] = js.undefined,
        DefaultSubstitutions: js.UndefOr[__string] = js.undefined,
        TemplateDescription: js.UndefOr[__string] = js.undefined,
        Version: js.UndefOr[__string] = js.undefined,
        tags: js.UndefOr[MapOf__string] = js.undefined
    ): TemplateResponse = {
      val __obj = js.Dynamic.literal(
        "CreationDate" -> CreationDate.asInstanceOf[js.Any],
        "LastModifiedDate" -> LastModifiedDate.asInstanceOf[js.Any],
        "TemplateName" -> TemplateName.asInstanceOf[js.Any],
        "TemplateType" -> TemplateType.asInstanceOf[js.Any]
      )

      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      DefaultSubstitutions.foreach(__v => __obj.updateDynamic("DefaultSubstitutions")(__v.asInstanceOf[js.Any]))
      TemplateDescription.foreach(__v => __obj.updateDynamic("TemplateDescription")(__v.asInstanceOf[js.Any]))
      Version.foreach(__v => __obj.updateDynamic("Version")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TemplateResponse]
    }
  }

  /** Provides information about a specific version of a message template.
    */
  @js.native
  trait TemplateVersionResponse extends js.Object {
    var CreationDate: __string
    var LastModifiedDate: __string
    var TemplateName: __string
    var TemplateType: __string
    var DefaultSubstitutions: js.UndefOr[__string]
    var TemplateDescription: js.UndefOr[__string]
    var Version: js.UndefOr[__string]
  }

  object TemplateVersionResponse {
    @inline
    def apply(
        CreationDate: __string,
        LastModifiedDate: __string,
        TemplateName: __string,
        TemplateType: __string,
        DefaultSubstitutions: js.UndefOr[__string] = js.undefined,
        TemplateDescription: js.UndefOr[__string] = js.undefined,
        Version: js.UndefOr[__string] = js.undefined
    ): TemplateVersionResponse = {
      val __obj = js.Dynamic.literal(
        "CreationDate" -> CreationDate.asInstanceOf[js.Any],
        "LastModifiedDate" -> LastModifiedDate.asInstanceOf[js.Any],
        "TemplateName" -> TemplateName.asInstanceOf[js.Any],
        "TemplateType" -> TemplateType.asInstanceOf[js.Any]
      )

      DefaultSubstitutions.foreach(__v => __obj.updateDynamic("DefaultSubstitutions")(__v.asInstanceOf[js.Any]))
      TemplateDescription.foreach(__v => __obj.updateDynamic("TemplateDescription")(__v.asInstanceOf[js.Any]))
      Version.foreach(__v => __obj.updateDynamic("Version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TemplateVersionResponse]
    }
  }

  /** Provides information about all the versions of a specific message template.
    */
  @js.native
  trait TemplateVersionsResponse extends js.Object {
    var Item: ListOfTemplateVersionResponse
    var Message: js.UndefOr[__string]
    var NextToken: js.UndefOr[__string]
    var RequestID: js.UndefOr[__string]
  }

  object TemplateVersionsResponse {
    @inline
    def apply(
        Item: ListOfTemplateVersionResponse,
        Message: js.UndefOr[__string] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined,
        RequestID: js.UndefOr[__string] = js.undefined
    ): TemplateVersionsResponse = {
      val __obj = js.Dynamic.literal(
        "Item" -> Item.asInstanceOf[js.Any]
      )

      Message.foreach(__v => __obj.updateDynamic("Message")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      RequestID.foreach(__v => __obj.updateDynamic("RequestID")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TemplateVersionsResponse]
    }
  }

  /** Provides information about all the message templates that are associated with your Amazon Pinpoint account.
    */
  @js.native
  trait TemplatesResponse extends js.Object {
    var Item: ListOfTemplateResponse
    var NextToken: js.UndefOr[__string]
  }

  object TemplatesResponse {
    @inline
    def apply(
        Item: ListOfTemplateResponse,
        NextToken: js.UndefOr[__string] = js.undefined
    ): TemplatesResponse = {
      val __obj = js.Dynamic.literal(
        "Item" -> Item.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TemplatesResponse]
    }
  }

  /** Specifies the settings for a campaign treatment. A <i>treatment</i> is a variation of a campaign that's used for A/B testing of a campaign.
    */
  @js.native
  trait TreatmentResource extends js.Object {
    var Id: __string
    var SizePercent: __integer
    var CustomDeliveryConfiguration: js.UndefOr[CustomDeliveryConfiguration]
    var MessageConfiguration: js.UndefOr[MessageConfiguration]
    var Schedule: js.UndefOr[Schedule]
    var State: js.UndefOr[CampaignState]
    var TemplateConfiguration: js.UndefOr[TemplateConfiguration]
    var TreatmentDescription: js.UndefOr[__string]
    var TreatmentName: js.UndefOr[__string]
  }

  object TreatmentResource {
    @inline
    def apply(
        Id: __string,
        SizePercent: __integer,
        CustomDeliveryConfiguration: js.UndefOr[CustomDeliveryConfiguration] = js.undefined,
        MessageConfiguration: js.UndefOr[MessageConfiguration] = js.undefined,
        Schedule: js.UndefOr[Schedule] = js.undefined,
        State: js.UndefOr[CampaignState] = js.undefined,
        TemplateConfiguration: js.UndefOr[TemplateConfiguration] = js.undefined,
        TreatmentDescription: js.UndefOr[__string] = js.undefined,
        TreatmentName: js.UndefOr[__string] = js.undefined
    ): TreatmentResource = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any],
        "SizePercent" -> SizePercent.asInstanceOf[js.Any]
      )

      CustomDeliveryConfiguration.foreach(__v => __obj.updateDynamic("CustomDeliveryConfiguration")(__v.asInstanceOf[js.Any]))
      MessageConfiguration.foreach(__v => __obj.updateDynamic("MessageConfiguration")(__v.asInstanceOf[js.Any]))
      Schedule.foreach(__v => __obj.updateDynamic("Schedule")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      TemplateConfiguration.foreach(__v => __obj.updateDynamic("TemplateConfiguration")(__v.asInstanceOf[js.Any]))
      TreatmentDescription.foreach(__v => __obj.updateDynamic("TreatmentDescription")(__v.asInstanceOf[js.Any]))
      TreatmentName.foreach(__v => __obj.updateDynamic("TreatmentName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TreatmentResource]
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

  @js.native
  trait UpdateAdmChannelRequest extends js.Object {
    var ADMChannelRequest: ADMChannelRequest
    var ApplicationId: __string
  }

  object UpdateAdmChannelRequest {
    @inline
    def apply(
        ADMChannelRequest: ADMChannelRequest,
        ApplicationId: __string
    ): UpdateAdmChannelRequest = {
      val __obj = js.Dynamic.literal(
        "ADMChannelRequest" -> ADMChannelRequest.asInstanceOf[js.Any],
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateAdmChannelRequest]
    }
  }

  @js.native
  trait UpdateAdmChannelResponse extends js.Object {
    var ADMChannelResponse: ADMChannelResponse
  }

  object UpdateAdmChannelResponse {
    @inline
    def apply(
        ADMChannelResponse: ADMChannelResponse
    ): UpdateAdmChannelResponse = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        APNSChannelRequest: APNSChannelRequest,
        ApplicationId: __string
    ): UpdateApnsChannelRequest = {
      val __obj = js.Dynamic.literal(
        "APNSChannelRequest" -> APNSChannelRequest.asInstanceOf[js.Any],
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateApnsChannelRequest]
    }
  }

  @js.native
  trait UpdateApnsChannelResponse extends js.Object {
    var APNSChannelResponse: APNSChannelResponse
  }

  object UpdateApnsChannelResponse {
    @inline
    def apply(
        APNSChannelResponse: APNSChannelResponse
    ): UpdateApnsChannelResponse = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        APNSSandboxChannelRequest: APNSSandboxChannelRequest,
        ApplicationId: __string
    ): UpdateApnsSandboxChannelRequest = {
      val __obj = js.Dynamic.literal(
        "APNSSandboxChannelRequest" -> APNSSandboxChannelRequest.asInstanceOf[js.Any],
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateApnsSandboxChannelRequest]
    }
  }

  @js.native
  trait UpdateApnsSandboxChannelResponse extends js.Object {
    var APNSSandboxChannelResponse: APNSSandboxChannelResponse
  }

  object UpdateApnsSandboxChannelResponse {
    @inline
    def apply(
        APNSSandboxChannelResponse: APNSSandboxChannelResponse
    ): UpdateApnsSandboxChannelResponse = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        APNSVoipChannelRequest: APNSVoipChannelRequest,
        ApplicationId: __string
    ): UpdateApnsVoipChannelRequest = {
      val __obj = js.Dynamic.literal(
        "APNSVoipChannelRequest" -> APNSVoipChannelRequest.asInstanceOf[js.Any],
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateApnsVoipChannelRequest]
    }
  }

  @js.native
  trait UpdateApnsVoipChannelResponse extends js.Object {
    var APNSVoipChannelResponse: APNSVoipChannelResponse
  }

  object UpdateApnsVoipChannelResponse {
    @inline
    def apply(
        APNSVoipChannelResponse: APNSVoipChannelResponse
    ): UpdateApnsVoipChannelResponse = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        APNSVoipSandboxChannelRequest: APNSVoipSandboxChannelRequest,
        ApplicationId: __string
    ): UpdateApnsVoipSandboxChannelRequest = {
      val __obj = js.Dynamic.literal(
        "APNSVoipSandboxChannelRequest" -> APNSVoipSandboxChannelRequest.asInstanceOf[js.Any],
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateApnsVoipSandboxChannelRequest]
    }
  }

  @js.native
  trait UpdateApnsVoipSandboxChannelResponse extends js.Object {
    var APNSVoipSandboxChannelResponse: APNSVoipSandboxChannelResponse
  }

  object UpdateApnsVoipSandboxChannelResponse {
    @inline
    def apply(
        APNSVoipSandboxChannelResponse: APNSVoipSandboxChannelResponse
    ): UpdateApnsVoipSandboxChannelResponse = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        ApplicationId: __string,
        WriteApplicationSettingsRequest: WriteApplicationSettingsRequest
    ): UpdateApplicationSettingsRequest = {
      val __obj = js.Dynamic.literal(
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any],
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
    @inline
    def apply(
        ApplicationSettingsResource: ApplicationSettingsResource
    ): UpdateApplicationSettingsResponse = {
      val __obj = js.Dynamic.literal(
        "ApplicationSettingsResource" -> ApplicationSettingsResource.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateApplicationSettingsResponse]
    }
  }

  /** Specifies one or more attributes to remove from all the endpoints that are associated with an application.
    */
  @js.native
  trait UpdateAttributesRequest extends js.Object {
    var Blacklist: js.UndefOr[ListOf__string]
  }

  object UpdateAttributesRequest {
    @inline
    def apply(
        Blacklist: js.UndefOr[ListOf__string] = js.undefined
    ): UpdateAttributesRequest = {
      val __obj = js.Dynamic.literal()
      Blacklist.foreach(__v => __obj.updateDynamic("Blacklist")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateAttributesRequest]
    }
  }

  @js.native
  trait UpdateBaiduChannelRequest extends js.Object {
    var ApplicationId: __string
    var BaiduChannelRequest: BaiduChannelRequest
  }

  object UpdateBaiduChannelRequest {
    @inline
    def apply(
        ApplicationId: __string,
        BaiduChannelRequest: BaiduChannelRequest
    ): UpdateBaiduChannelRequest = {
      val __obj = js.Dynamic.literal(
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any],
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
    @inline
    def apply(
        BaiduChannelResponse: BaiduChannelResponse
    ): UpdateBaiduChannelResponse = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        ApplicationId: __string,
        CampaignId: __string,
        WriteCampaignRequest: WriteCampaignRequest
    ): UpdateCampaignRequest = {
      val __obj = js.Dynamic.literal(
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any],
        "CampaignId" -> CampaignId.asInstanceOf[js.Any],
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
    @inline
    def apply(
        CampaignResponse: CampaignResponse
    ): UpdateCampaignResponse = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        ApplicationId: __string,
        EmailChannelRequest: EmailChannelRequest
    ): UpdateEmailChannelRequest = {
      val __obj = js.Dynamic.literal(
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any],
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
    @inline
    def apply(
        EmailChannelResponse: EmailChannelResponse
    ): UpdateEmailChannelResponse = {
      val __obj = js.Dynamic.literal(
        "EmailChannelResponse" -> EmailChannelResponse.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateEmailChannelResponse]
    }
  }

  @js.native
  trait UpdateEmailTemplateRequest extends js.Object {
    var EmailTemplateRequest: EmailTemplateRequest
    var TemplateName: __string
    var CreateNewVersion: js.UndefOr[__boolean]
    var Version: js.UndefOr[__string]
  }

  object UpdateEmailTemplateRequest {
    @inline
    def apply(
        EmailTemplateRequest: EmailTemplateRequest,
        TemplateName: __string,
        CreateNewVersion: js.UndefOr[__boolean] = js.undefined,
        Version: js.UndefOr[__string] = js.undefined
    ): UpdateEmailTemplateRequest = {
      val __obj = js.Dynamic.literal(
        "EmailTemplateRequest" -> EmailTemplateRequest.asInstanceOf[js.Any],
        "TemplateName" -> TemplateName.asInstanceOf[js.Any]
      )

      CreateNewVersion.foreach(__v => __obj.updateDynamic("CreateNewVersion")(__v.asInstanceOf[js.Any]))
      Version.foreach(__v => __obj.updateDynamic("Version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateEmailTemplateRequest]
    }
  }

  @js.native
  trait UpdateEmailTemplateResponse extends js.Object {
    var MessageBody: MessageBody
  }

  object UpdateEmailTemplateResponse {
    @inline
    def apply(
        MessageBody: MessageBody
    ): UpdateEmailTemplateResponse = {
      val __obj = js.Dynamic.literal(
        "MessageBody" -> MessageBody.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateEmailTemplateResponse]
    }
  }

  @js.native
  trait UpdateEndpointRequest extends js.Object {
    var ApplicationId: __string
    var EndpointId: __string
    var EndpointRequest: EndpointRequest
  }

  object UpdateEndpointRequest {
    @inline
    def apply(
        ApplicationId: __string,
        EndpointId: __string,
        EndpointRequest: EndpointRequest
    ): UpdateEndpointRequest = {
      val __obj = js.Dynamic.literal(
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any],
        "EndpointId" -> EndpointId.asInstanceOf[js.Any],
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
    @inline
    def apply(
        MessageBody: MessageBody
    ): UpdateEndpointResponse = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        ApplicationId: __string,
        EndpointBatchRequest: EndpointBatchRequest
    ): UpdateEndpointsBatchRequest = {
      val __obj = js.Dynamic.literal(
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any],
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
    @inline
    def apply(
        MessageBody: MessageBody
    ): UpdateEndpointsBatchResponse = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        ApplicationId: __string,
        GCMChannelRequest: GCMChannelRequest
    ): UpdateGcmChannelRequest = {
      val __obj = js.Dynamic.literal(
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any],
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
    @inline
    def apply(
        GCMChannelResponse: GCMChannelResponse
    ): UpdateGcmChannelResponse = {
      val __obj = js.Dynamic.literal(
        "GCMChannelResponse" -> GCMChannelResponse.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateGcmChannelResponse]
    }
  }

  @js.native
  trait UpdateInAppTemplateRequest extends js.Object {
    var InAppTemplateRequest: InAppTemplateRequest
    var TemplateName: __string
    var CreateNewVersion: js.UndefOr[__boolean]
    var Version: js.UndefOr[__string]
  }

  object UpdateInAppTemplateRequest {
    @inline
    def apply(
        InAppTemplateRequest: InAppTemplateRequest,
        TemplateName: __string,
        CreateNewVersion: js.UndefOr[__boolean] = js.undefined,
        Version: js.UndefOr[__string] = js.undefined
    ): UpdateInAppTemplateRequest = {
      val __obj = js.Dynamic.literal(
        "InAppTemplateRequest" -> InAppTemplateRequest.asInstanceOf[js.Any],
        "TemplateName" -> TemplateName.asInstanceOf[js.Any]
      )

      CreateNewVersion.foreach(__v => __obj.updateDynamic("CreateNewVersion")(__v.asInstanceOf[js.Any]))
      Version.foreach(__v => __obj.updateDynamic("Version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateInAppTemplateRequest]
    }
  }

  @js.native
  trait UpdateInAppTemplateResponse extends js.Object {
    var MessageBody: MessageBody
  }

  object UpdateInAppTemplateResponse {
    @inline
    def apply(
        MessageBody: MessageBody
    ): UpdateInAppTemplateResponse = {
      val __obj = js.Dynamic.literal(
        "MessageBody" -> MessageBody.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateInAppTemplateResponse]
    }
  }

  @js.native
  trait UpdateJourneyRequest extends js.Object {
    var ApplicationId: __string
    var JourneyId: __string
    var WriteJourneyRequest: WriteJourneyRequest
  }

  object UpdateJourneyRequest {
    @inline
    def apply(
        ApplicationId: __string,
        JourneyId: __string,
        WriteJourneyRequest: WriteJourneyRequest
    ): UpdateJourneyRequest = {
      val __obj = js.Dynamic.literal(
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any],
        "JourneyId" -> JourneyId.asInstanceOf[js.Any],
        "WriteJourneyRequest" -> WriteJourneyRequest.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateJourneyRequest]
    }
  }

  @js.native
  trait UpdateJourneyResponse extends js.Object {
    var JourneyResponse: JourneyResponse
  }

  object UpdateJourneyResponse {
    @inline
    def apply(
        JourneyResponse: JourneyResponse
    ): UpdateJourneyResponse = {
      val __obj = js.Dynamic.literal(
        "JourneyResponse" -> JourneyResponse.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateJourneyResponse]
    }
  }

  @js.native
  trait UpdateJourneyStateRequest extends js.Object {
    var ApplicationId: __string
    var JourneyId: __string
    var JourneyStateRequest: JourneyStateRequest
  }

  object UpdateJourneyStateRequest {
    @inline
    def apply(
        ApplicationId: __string,
        JourneyId: __string,
        JourneyStateRequest: JourneyStateRequest
    ): UpdateJourneyStateRequest = {
      val __obj = js.Dynamic.literal(
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any],
        "JourneyId" -> JourneyId.asInstanceOf[js.Any],
        "JourneyStateRequest" -> JourneyStateRequest.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateJourneyStateRequest]
    }
  }

  @js.native
  trait UpdateJourneyStateResponse extends js.Object {
    var JourneyResponse: JourneyResponse
  }

  object UpdateJourneyStateResponse {
    @inline
    def apply(
        JourneyResponse: JourneyResponse
    ): UpdateJourneyStateResponse = {
      val __obj = js.Dynamic.literal(
        "JourneyResponse" -> JourneyResponse.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateJourneyStateResponse]
    }
  }

  @js.native
  trait UpdatePushTemplateRequest extends js.Object {
    var PushNotificationTemplateRequest: PushNotificationTemplateRequest
    var TemplateName: __string
    var CreateNewVersion: js.UndefOr[__boolean]
    var Version: js.UndefOr[__string]
  }

  object UpdatePushTemplateRequest {
    @inline
    def apply(
        PushNotificationTemplateRequest: PushNotificationTemplateRequest,
        TemplateName: __string,
        CreateNewVersion: js.UndefOr[__boolean] = js.undefined,
        Version: js.UndefOr[__string] = js.undefined
    ): UpdatePushTemplateRequest = {
      val __obj = js.Dynamic.literal(
        "PushNotificationTemplateRequest" -> PushNotificationTemplateRequest.asInstanceOf[js.Any],
        "TemplateName" -> TemplateName.asInstanceOf[js.Any]
      )

      CreateNewVersion.foreach(__v => __obj.updateDynamic("CreateNewVersion")(__v.asInstanceOf[js.Any]))
      Version.foreach(__v => __obj.updateDynamic("Version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdatePushTemplateRequest]
    }
  }

  @js.native
  trait UpdatePushTemplateResponse extends js.Object {
    var MessageBody: MessageBody
  }

  object UpdatePushTemplateResponse {
    @inline
    def apply(
        MessageBody: MessageBody
    ): UpdatePushTemplateResponse = {
      val __obj = js.Dynamic.literal(
        "MessageBody" -> MessageBody.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdatePushTemplateResponse]
    }
  }

  /** Specifies Amazon Pinpoint configuration settings for retrieving and processing recommendation data from a recommender model.
    */
  @js.native
  trait UpdateRecommenderConfiguration extends js.Object {
    var RecommendationProviderRoleArn: __string
    var RecommendationProviderUri: __string
    var Attributes: js.UndefOr[MapOf__string]
    var Description: js.UndefOr[__string]
    var Name: js.UndefOr[__string]
    var RecommendationProviderIdType: js.UndefOr[__string]
    var RecommendationTransformerUri: js.UndefOr[__string]
    var RecommendationsDisplayName: js.UndefOr[__string]
    var RecommendationsPerMessage: js.UndefOr[__integer]
  }

  object UpdateRecommenderConfiguration {
    @inline
    def apply(
        RecommendationProviderRoleArn: __string,
        RecommendationProviderUri: __string,
        Attributes: js.UndefOr[MapOf__string] = js.undefined,
        Description: js.UndefOr[__string] = js.undefined,
        Name: js.UndefOr[__string] = js.undefined,
        RecommendationProviderIdType: js.UndefOr[__string] = js.undefined,
        RecommendationTransformerUri: js.UndefOr[__string] = js.undefined,
        RecommendationsDisplayName: js.UndefOr[__string] = js.undefined,
        RecommendationsPerMessage: js.UndefOr[__integer] = js.undefined
    ): UpdateRecommenderConfiguration = {
      val __obj = js.Dynamic.literal(
        "RecommendationProviderRoleArn" -> RecommendationProviderRoleArn.asInstanceOf[js.Any],
        "RecommendationProviderUri" -> RecommendationProviderUri.asInstanceOf[js.Any]
      )

      Attributes.foreach(__v => __obj.updateDynamic("Attributes")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      RecommendationProviderIdType.foreach(__v => __obj.updateDynamic("RecommendationProviderIdType")(__v.asInstanceOf[js.Any]))
      RecommendationTransformerUri.foreach(__v => __obj.updateDynamic("RecommendationTransformerUri")(__v.asInstanceOf[js.Any]))
      RecommendationsDisplayName.foreach(__v => __obj.updateDynamic("RecommendationsDisplayName")(__v.asInstanceOf[js.Any]))
      RecommendationsPerMessage.foreach(__v => __obj.updateDynamic("RecommendationsPerMessage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateRecommenderConfiguration]
    }
  }

  @js.native
  trait UpdateRecommenderConfigurationRequest extends js.Object {
    var RecommenderId: __string
    var UpdateRecommenderConfiguration: UpdateRecommenderConfiguration
  }

  object UpdateRecommenderConfigurationRequest {
    @inline
    def apply(
        RecommenderId: __string,
        UpdateRecommenderConfiguration: UpdateRecommenderConfiguration
    ): UpdateRecommenderConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "RecommenderId" -> RecommenderId.asInstanceOf[js.Any],
        "UpdateRecommenderConfiguration" -> UpdateRecommenderConfiguration.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateRecommenderConfigurationRequest]
    }
  }

  @js.native
  trait UpdateRecommenderConfigurationResponse extends js.Object {
    var RecommenderConfigurationResponse: RecommenderConfigurationResponse
  }

  object UpdateRecommenderConfigurationResponse {
    @inline
    def apply(
        RecommenderConfigurationResponse: RecommenderConfigurationResponse
    ): UpdateRecommenderConfigurationResponse = {
      val __obj = js.Dynamic.literal(
        "RecommenderConfigurationResponse" -> RecommenderConfigurationResponse.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateRecommenderConfigurationResponse]
    }
  }

  @js.native
  trait UpdateSegmentRequest extends js.Object {
    var ApplicationId: __string
    var SegmentId: __string
    var WriteSegmentRequest: WriteSegmentRequest
  }

  object UpdateSegmentRequest {
    @inline
    def apply(
        ApplicationId: __string,
        SegmentId: __string,
        WriteSegmentRequest: WriteSegmentRequest
    ): UpdateSegmentRequest = {
      val __obj = js.Dynamic.literal(
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any],
        "SegmentId" -> SegmentId.asInstanceOf[js.Any],
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
    @inline
    def apply(
        SegmentResponse: SegmentResponse
    ): UpdateSegmentResponse = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        ApplicationId: __string,
        SMSChannelRequest: SMSChannelRequest
    ): UpdateSmsChannelRequest = {
      val __obj = js.Dynamic.literal(
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any],
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
    @inline
    def apply(
        SMSChannelResponse: SMSChannelResponse
    ): UpdateSmsChannelResponse = {
      val __obj = js.Dynamic.literal(
        "SMSChannelResponse" -> SMSChannelResponse.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateSmsChannelResponse]
    }
  }

  @js.native
  trait UpdateSmsTemplateRequest extends js.Object {
    var SMSTemplateRequest: SMSTemplateRequest
    var TemplateName: __string
    var CreateNewVersion: js.UndefOr[__boolean]
    var Version: js.UndefOr[__string]
  }

  object UpdateSmsTemplateRequest {
    @inline
    def apply(
        SMSTemplateRequest: SMSTemplateRequest,
        TemplateName: __string,
        CreateNewVersion: js.UndefOr[__boolean] = js.undefined,
        Version: js.UndefOr[__string] = js.undefined
    ): UpdateSmsTemplateRequest = {
      val __obj = js.Dynamic.literal(
        "SMSTemplateRequest" -> SMSTemplateRequest.asInstanceOf[js.Any],
        "TemplateName" -> TemplateName.asInstanceOf[js.Any]
      )

      CreateNewVersion.foreach(__v => __obj.updateDynamic("CreateNewVersion")(__v.asInstanceOf[js.Any]))
      Version.foreach(__v => __obj.updateDynamic("Version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateSmsTemplateRequest]
    }
  }

  @js.native
  trait UpdateSmsTemplateResponse extends js.Object {
    var MessageBody: MessageBody
  }

  object UpdateSmsTemplateResponse {
    @inline
    def apply(
        MessageBody: MessageBody
    ): UpdateSmsTemplateResponse = {
      val __obj = js.Dynamic.literal(
        "MessageBody" -> MessageBody.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateSmsTemplateResponse]
    }
  }

  @js.native
  trait UpdateTemplateActiveVersionRequest extends js.Object {
    var TemplateActiveVersionRequest: TemplateActiveVersionRequest
    var TemplateName: __string
    var TemplateType: __string
  }

  object UpdateTemplateActiveVersionRequest {
    @inline
    def apply(
        TemplateActiveVersionRequest: TemplateActiveVersionRequest,
        TemplateName: __string,
        TemplateType: __string
    ): UpdateTemplateActiveVersionRequest = {
      val __obj = js.Dynamic.literal(
        "TemplateActiveVersionRequest" -> TemplateActiveVersionRequest.asInstanceOf[js.Any],
        "TemplateName" -> TemplateName.asInstanceOf[js.Any],
        "TemplateType" -> TemplateType.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateTemplateActiveVersionRequest]
    }
  }

  @js.native
  trait UpdateTemplateActiveVersionResponse extends js.Object {
    var MessageBody: MessageBody
  }

  object UpdateTemplateActiveVersionResponse {
    @inline
    def apply(
        MessageBody: MessageBody
    ): UpdateTemplateActiveVersionResponse = {
      val __obj = js.Dynamic.literal(
        "MessageBody" -> MessageBody.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateTemplateActiveVersionResponse]
    }
  }

  @js.native
  trait UpdateVoiceChannelRequest extends js.Object {
    var ApplicationId: __string
    var VoiceChannelRequest: VoiceChannelRequest
  }

  object UpdateVoiceChannelRequest {
    @inline
    def apply(
        ApplicationId: __string,
        VoiceChannelRequest: VoiceChannelRequest
    ): UpdateVoiceChannelRequest = {
      val __obj = js.Dynamic.literal(
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any],
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
    @inline
    def apply(
        VoiceChannelResponse: VoiceChannelResponse
    ): UpdateVoiceChannelResponse = {
      val __obj = js.Dynamic.literal(
        "VoiceChannelResponse" -> VoiceChannelResponse.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateVoiceChannelResponse]
    }
  }

  @js.native
  trait UpdateVoiceTemplateRequest extends js.Object {
    var TemplateName: __string
    var VoiceTemplateRequest: VoiceTemplateRequest
    var CreateNewVersion: js.UndefOr[__boolean]
    var Version: js.UndefOr[__string]
  }

  object UpdateVoiceTemplateRequest {
    @inline
    def apply(
        TemplateName: __string,
        VoiceTemplateRequest: VoiceTemplateRequest,
        CreateNewVersion: js.UndefOr[__boolean] = js.undefined,
        Version: js.UndefOr[__string] = js.undefined
    ): UpdateVoiceTemplateRequest = {
      val __obj = js.Dynamic.literal(
        "TemplateName" -> TemplateName.asInstanceOf[js.Any],
        "VoiceTemplateRequest" -> VoiceTemplateRequest.asInstanceOf[js.Any]
      )

      CreateNewVersion.foreach(__v => __obj.updateDynamic("CreateNewVersion")(__v.asInstanceOf[js.Any]))
      Version.foreach(__v => __obj.updateDynamic("Version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateVoiceTemplateRequest]
    }
  }

  @js.native
  trait UpdateVoiceTemplateResponse extends js.Object {
    var MessageBody: MessageBody
  }

  object UpdateVoiceTemplateResponse {
    @inline
    def apply(
        MessageBody: MessageBody
    ): UpdateVoiceTemplateResponse = {
      val __obj = js.Dynamic.literal(
        "MessageBody" -> MessageBody.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateVoiceTemplateResponse]
    }
  }

  /** Verify OTP Message Response.
    */
  @js.native
  trait VerificationResponse extends js.Object {
    var Valid: js.UndefOr[__boolean]
  }

  object VerificationResponse {
    @inline
    def apply(
        Valid: js.UndefOr[__boolean] = js.undefined
    ): VerificationResponse = {
      val __obj = js.Dynamic.literal()
      Valid.foreach(__v => __obj.updateDynamic("Valid")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VerificationResponse]
    }
  }

  @js.native
  trait VerifyOTPMessageRequest extends js.Object {
    var ApplicationId: __string
    var VerifyOTPMessageRequestParameters: VerifyOTPMessageRequestParameters
  }

  object VerifyOTPMessageRequest {
    @inline
    def apply(
        ApplicationId: __string,
        VerifyOTPMessageRequestParameters: VerifyOTPMessageRequestParameters
    ): VerifyOTPMessageRequest = {
      val __obj = js.Dynamic.literal(
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any],
        "VerifyOTPMessageRequestParameters" -> VerifyOTPMessageRequestParameters.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[VerifyOTPMessageRequest]
    }
  }

  /** Verify OTP message request.
    */
  @js.native
  trait VerifyOTPMessageRequestParameters extends js.Object {
    var DestinationIdentity: __string
    var Otp: __string
    var ReferenceId: __string
  }

  object VerifyOTPMessageRequestParameters {
    @inline
    def apply(
        DestinationIdentity: __string,
        Otp: __string,
        ReferenceId: __string
    ): VerifyOTPMessageRequestParameters = {
      val __obj = js.Dynamic.literal(
        "DestinationIdentity" -> DestinationIdentity.asInstanceOf[js.Any],
        "Otp" -> Otp.asInstanceOf[js.Any],
        "ReferenceId" -> ReferenceId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[VerifyOTPMessageRequestParameters]
    }
  }

  @js.native
  trait VerifyOTPMessageResponse extends js.Object {
    var VerificationResponse: VerificationResponse
  }

  object VerifyOTPMessageResponse {
    @inline
    def apply(
        VerificationResponse: VerificationResponse
    ): VerifyOTPMessageResponse = {
      val __obj = js.Dynamic.literal(
        "VerificationResponse" -> VerificationResponse.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[VerifyOTPMessageResponse]
    }
  }

  /** Specifies the status and settings of the voice channel for an application.
    */
  @js.native
  trait VoiceChannelRequest extends js.Object {
    var Enabled: js.UndefOr[__boolean]
  }

  object VoiceChannelRequest {
    @inline
    def apply(
        Enabled: js.UndefOr[__boolean] = js.undefined
    ): VoiceChannelRequest = {
      val __obj = js.Dynamic.literal()
      Enabled.foreach(__v => __obj.updateDynamic("Enabled")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VoiceChannelRequest]
    }
  }

  /** Provides information about the status and settings of the voice channel for an application.
    */
  @js.native
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

  object VoiceChannelResponse {
    @inline
    def apply(
        Platform: __string,
        ApplicationId: js.UndefOr[__string] = js.undefined,
        CreationDate: js.UndefOr[__string] = js.undefined,
        Enabled: js.UndefOr[__boolean] = js.undefined,
        HasCredential: js.UndefOr[__boolean] = js.undefined,
        Id: js.UndefOr[__string] = js.undefined,
        IsArchived: js.UndefOr[__boolean] = js.undefined,
        LastModifiedBy: js.UndefOr[__string] = js.undefined,
        LastModifiedDate: js.UndefOr[__string] = js.undefined,
        Version: js.UndefOr[__integer] = js.undefined
    ): VoiceChannelResponse = {
      val __obj = js.Dynamic.literal(
        "Platform" -> Platform.asInstanceOf[js.Any]
      )

      ApplicationId.foreach(__v => __obj.updateDynamic("ApplicationId")(__v.asInstanceOf[js.Any]))
      CreationDate.foreach(__v => __obj.updateDynamic("CreationDate")(__v.asInstanceOf[js.Any]))
      Enabled.foreach(__v => __obj.updateDynamic("Enabled")(__v.asInstanceOf[js.Any]))
      HasCredential.foreach(__v => __obj.updateDynamic("HasCredential")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      IsArchived.foreach(__v => __obj.updateDynamic("IsArchived")(__v.asInstanceOf[js.Any]))
      LastModifiedBy.foreach(__v => __obj.updateDynamic("LastModifiedBy")(__v.asInstanceOf[js.Any]))
      LastModifiedDate.foreach(__v => __obj.updateDynamic("LastModifiedDate")(__v.asInstanceOf[js.Any]))
      Version.foreach(__v => __obj.updateDynamic("Version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VoiceChannelResponse]
    }
  }

  /** Specifies the settings for a one-time voice message that's sent directly to an endpoint through the voice channel.
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
    @inline
    def apply(
        Body: js.UndefOr[__string] = js.undefined,
        LanguageCode: js.UndefOr[__string] = js.undefined,
        OriginationNumber: js.UndefOr[__string] = js.undefined,
        Substitutions: js.UndefOr[MapOfListOf__string] = js.undefined,
        VoiceId: js.UndefOr[__string] = js.undefined
    ): VoiceMessage = {
      val __obj = js.Dynamic.literal()
      Body.foreach(__v => __obj.updateDynamic("Body")(__v.asInstanceOf[js.Any]))
      LanguageCode.foreach(__v => __obj.updateDynamic("LanguageCode")(__v.asInstanceOf[js.Any]))
      OriginationNumber.foreach(__v => __obj.updateDynamic("OriginationNumber")(__v.asInstanceOf[js.Any]))
      Substitutions.foreach(__v => __obj.updateDynamic("Substitutions")(__v.asInstanceOf[js.Any]))
      VoiceId.foreach(__v => __obj.updateDynamic("VoiceId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VoiceMessage]
    }
  }

  /** Specifies the content and settings for a message template that can be used in messages that are sent through the voice channel.
    */
  @js.native
  trait VoiceTemplateRequest extends js.Object {
    var Body: js.UndefOr[__string]
    var DefaultSubstitutions: js.UndefOr[__string]
    var LanguageCode: js.UndefOr[__string]
    var TemplateDescription: js.UndefOr[__string]
    var VoiceId: js.UndefOr[__string]
    var tags: js.UndefOr[MapOf__string]
  }

  object VoiceTemplateRequest {
    @inline
    def apply(
        Body: js.UndefOr[__string] = js.undefined,
        DefaultSubstitutions: js.UndefOr[__string] = js.undefined,
        LanguageCode: js.UndefOr[__string] = js.undefined,
        TemplateDescription: js.UndefOr[__string] = js.undefined,
        VoiceId: js.UndefOr[__string] = js.undefined,
        tags: js.UndefOr[MapOf__string] = js.undefined
    ): VoiceTemplateRequest = {
      val __obj = js.Dynamic.literal()
      Body.foreach(__v => __obj.updateDynamic("Body")(__v.asInstanceOf[js.Any]))
      DefaultSubstitutions.foreach(__v => __obj.updateDynamic("DefaultSubstitutions")(__v.asInstanceOf[js.Any]))
      LanguageCode.foreach(__v => __obj.updateDynamic("LanguageCode")(__v.asInstanceOf[js.Any]))
      TemplateDescription.foreach(__v => __obj.updateDynamic("TemplateDescription")(__v.asInstanceOf[js.Any]))
      VoiceId.foreach(__v => __obj.updateDynamic("VoiceId")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VoiceTemplateRequest]
    }
  }

  /** Provides information about the content and settings for a message template that can be used in messages that are sent through the voice channel.
    */
  @js.native
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

  object VoiceTemplateResponse {
    @inline
    def apply(
        CreationDate: __string,
        LastModifiedDate: __string,
        TemplateName: __string,
        TemplateType: TemplateType,
        Arn: js.UndefOr[__string] = js.undefined,
        Body: js.UndefOr[__string] = js.undefined,
        DefaultSubstitutions: js.UndefOr[__string] = js.undefined,
        LanguageCode: js.UndefOr[__string] = js.undefined,
        TemplateDescription: js.UndefOr[__string] = js.undefined,
        Version: js.UndefOr[__string] = js.undefined,
        VoiceId: js.UndefOr[__string] = js.undefined,
        tags: js.UndefOr[MapOf__string] = js.undefined
    ): VoiceTemplateResponse = {
      val __obj = js.Dynamic.literal(
        "CreationDate" -> CreationDate.asInstanceOf[js.Any],
        "LastModifiedDate" -> LastModifiedDate.asInstanceOf[js.Any],
        "TemplateName" -> TemplateName.asInstanceOf[js.Any],
        "TemplateType" -> TemplateType.asInstanceOf[js.Any]
      )

      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      Body.foreach(__v => __obj.updateDynamic("Body")(__v.asInstanceOf[js.Any]))
      DefaultSubstitutions.foreach(__v => __obj.updateDynamic("DefaultSubstitutions")(__v.asInstanceOf[js.Any]))
      LanguageCode.foreach(__v => __obj.updateDynamic("LanguageCode")(__v.asInstanceOf[js.Any]))
      TemplateDescription.foreach(__v => __obj.updateDynamic("TemplateDescription")(__v.asInstanceOf[js.Any]))
      Version.foreach(__v => __obj.updateDynamic("Version")(__v.asInstanceOf[js.Any]))
      VoiceId.foreach(__v => __obj.updateDynamic("VoiceId")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VoiceTemplateResponse]
    }
  }

  /** Specifies the settings for a wait activity in a journey. This type of activity waits for a certain amount of time or until a specific date and time before moving participants to the next activity in a journey.
    */
  @js.native
  trait WaitActivity extends js.Object {
    var NextActivity: js.UndefOr[__string]
    var WaitTime: js.UndefOr[WaitTime]
  }

  object WaitActivity {
    @inline
    def apply(
        NextActivity: js.UndefOr[__string] = js.undefined,
        WaitTime: js.UndefOr[WaitTime] = js.undefined
    ): WaitActivity = {
      val __obj = js.Dynamic.literal()
      NextActivity.foreach(__v => __obj.updateDynamic("NextActivity")(__v.asInstanceOf[js.Any]))
      WaitTime.foreach(__v => __obj.updateDynamic("WaitTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[WaitActivity]
    }
  }

  /** Specifies a duration or a date and time that indicates when Amazon Pinpoint determines whether an activity's conditions have been met or an activity moves participants to the next activity in a journey.
    */
  @js.native
  trait WaitTime extends js.Object {
    var WaitFor: js.UndefOr[__string]
    var WaitUntil: js.UndefOr[__string]
  }

  object WaitTime {
    @inline
    def apply(
        WaitFor: js.UndefOr[__string] = js.undefined,
        WaitUntil: js.UndefOr[__string] = js.undefined
    ): WaitTime = {
      val __obj = js.Dynamic.literal()
      WaitFor.foreach(__v => __obj.updateDynamic("WaitFor")(__v.asInstanceOf[js.Any]))
      WaitUntil.foreach(__v => __obj.updateDynamic("WaitUntil")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[WaitTime]
    }
  }

  /** Specifies the default settings for an application.
    */
  @js.native
  trait WriteApplicationSettingsRequest extends js.Object {
    var CampaignHook: js.UndefOr[CampaignHook]
    var CloudWatchMetricsEnabled: js.UndefOr[__boolean]
    var EventTaggingEnabled: js.UndefOr[__boolean]
    var Limits: js.UndefOr[CampaignLimits]
    var QuietTime: js.UndefOr[QuietTime]
  }

  object WriteApplicationSettingsRequest {
    @inline
    def apply(
        CampaignHook: js.UndefOr[CampaignHook] = js.undefined,
        CloudWatchMetricsEnabled: js.UndefOr[__boolean] = js.undefined,
        EventTaggingEnabled: js.UndefOr[__boolean] = js.undefined,
        Limits: js.UndefOr[CampaignLimits] = js.undefined,
        QuietTime: js.UndefOr[QuietTime] = js.undefined
    ): WriteApplicationSettingsRequest = {
      val __obj = js.Dynamic.literal()
      CampaignHook.foreach(__v => __obj.updateDynamic("CampaignHook")(__v.asInstanceOf[js.Any]))
      CloudWatchMetricsEnabled.foreach(__v => __obj.updateDynamic("CloudWatchMetricsEnabled")(__v.asInstanceOf[js.Any]))
      EventTaggingEnabled.foreach(__v => __obj.updateDynamic("EventTaggingEnabled")(__v.asInstanceOf[js.Any]))
      Limits.foreach(__v => __obj.updateDynamic("Limits")(__v.asInstanceOf[js.Any]))
      QuietTime.foreach(__v => __obj.updateDynamic("QuietTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[WriteApplicationSettingsRequest]
    }
  }

  /** Specifies the configuration and other settings for a campaign.
    */
  @js.native
  trait WriteCampaignRequest extends js.Object {
    var AdditionalTreatments: js.UndefOr[ListOfWriteTreatmentResource]
    var CustomDeliveryConfiguration: js.UndefOr[CustomDeliveryConfiguration]
    var Description: js.UndefOr[__string]
    var HoldoutPercent: js.UndefOr[__integer]
    var Hook: js.UndefOr[CampaignHook]
    var IsPaused: js.UndefOr[__boolean]
    var Limits: js.UndefOr[CampaignLimits]
    var MessageConfiguration: js.UndefOr[MessageConfiguration]
    var Name: js.UndefOr[__string]
    var Priority: js.UndefOr[__integer]
    var Schedule: js.UndefOr[Schedule]
    var SegmentId: js.UndefOr[__string]
    var SegmentVersion: js.UndefOr[__integer]
    var TemplateConfiguration: js.UndefOr[TemplateConfiguration]
    var TreatmentDescription: js.UndefOr[__string]
    var TreatmentName: js.UndefOr[__string]
    var tags: js.UndefOr[MapOf__string]
  }

  object WriteCampaignRequest {
    @inline
    def apply(
        AdditionalTreatments: js.UndefOr[ListOfWriteTreatmentResource] = js.undefined,
        CustomDeliveryConfiguration: js.UndefOr[CustomDeliveryConfiguration] = js.undefined,
        Description: js.UndefOr[__string] = js.undefined,
        HoldoutPercent: js.UndefOr[__integer] = js.undefined,
        Hook: js.UndefOr[CampaignHook] = js.undefined,
        IsPaused: js.UndefOr[__boolean] = js.undefined,
        Limits: js.UndefOr[CampaignLimits] = js.undefined,
        MessageConfiguration: js.UndefOr[MessageConfiguration] = js.undefined,
        Name: js.UndefOr[__string] = js.undefined,
        Priority: js.UndefOr[__integer] = js.undefined,
        Schedule: js.UndefOr[Schedule] = js.undefined,
        SegmentId: js.UndefOr[__string] = js.undefined,
        SegmentVersion: js.UndefOr[__integer] = js.undefined,
        TemplateConfiguration: js.UndefOr[TemplateConfiguration] = js.undefined,
        TreatmentDescription: js.UndefOr[__string] = js.undefined,
        TreatmentName: js.UndefOr[__string] = js.undefined,
        tags: js.UndefOr[MapOf__string] = js.undefined
    ): WriteCampaignRequest = {
      val __obj = js.Dynamic.literal()
      AdditionalTreatments.foreach(__v => __obj.updateDynamic("AdditionalTreatments")(__v.asInstanceOf[js.Any]))
      CustomDeliveryConfiguration.foreach(__v => __obj.updateDynamic("CustomDeliveryConfiguration")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      HoldoutPercent.foreach(__v => __obj.updateDynamic("HoldoutPercent")(__v.asInstanceOf[js.Any]))
      Hook.foreach(__v => __obj.updateDynamic("Hook")(__v.asInstanceOf[js.Any]))
      IsPaused.foreach(__v => __obj.updateDynamic("IsPaused")(__v.asInstanceOf[js.Any]))
      Limits.foreach(__v => __obj.updateDynamic("Limits")(__v.asInstanceOf[js.Any]))
      MessageConfiguration.foreach(__v => __obj.updateDynamic("MessageConfiguration")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Priority.foreach(__v => __obj.updateDynamic("Priority")(__v.asInstanceOf[js.Any]))
      Schedule.foreach(__v => __obj.updateDynamic("Schedule")(__v.asInstanceOf[js.Any]))
      SegmentId.foreach(__v => __obj.updateDynamic("SegmentId")(__v.asInstanceOf[js.Any]))
      SegmentVersion.foreach(__v => __obj.updateDynamic("SegmentVersion")(__v.asInstanceOf[js.Any]))
      TemplateConfiguration.foreach(__v => __obj.updateDynamic("TemplateConfiguration")(__v.asInstanceOf[js.Any]))
      TreatmentDescription.foreach(__v => __obj.updateDynamic("TreatmentDescription")(__v.asInstanceOf[js.Any]))
      TreatmentName.foreach(__v => __obj.updateDynamic("TreatmentName")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[WriteCampaignRequest]
    }
  }

  /** Specifies the Amazon Resource Name (ARN) of an event stream to publish events to and the AWS Identity and Access Management (IAM) role to use when publishing those events.
    */
  @js.native
  trait WriteEventStream extends js.Object {
    var DestinationStreamArn: __string
    var RoleArn: __string
  }

  object WriteEventStream {
    @inline
    def apply(
        DestinationStreamArn: __string,
        RoleArn: __string
    ): WriteEventStream = {
      val __obj = js.Dynamic.literal(
        "DestinationStreamArn" -> DestinationStreamArn.asInstanceOf[js.Any],
        "RoleArn" -> RoleArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[WriteEventStream]
    }
  }

  /** Specifies the configuration and other settings for a journey.
    */
  @js.native
  trait WriteJourneyRequest extends js.Object {
    var Name: __string
    var Activities: js.UndefOr[MapOfActivity]
    var ClosedDays: js.UndefOr[ClosedDays]
    var CreationDate: js.UndefOr[__string]
    var JourneyChannelSettings: js.UndefOr[JourneyChannelSettings]
    var LastModifiedDate: js.UndefOr[__string]
    var Limits: js.UndefOr[JourneyLimits]
    var LocalTime: js.UndefOr[__boolean]
    var OpenHours: js.UndefOr[OpenHours]
    var QuietTime: js.UndefOr[QuietTime]
    var RefreshFrequency: js.UndefOr[__string]
    var RefreshOnSegmentUpdate: js.UndefOr[__boolean]
    var Schedule: js.UndefOr[JourneySchedule]
    var SendingSchedule: js.UndefOr[__boolean]
    var StartActivity: js.UndefOr[__string]
    var StartCondition: js.UndefOr[StartCondition]
    var State: js.UndefOr[State]
    var WaitForQuietTime: js.UndefOr[__boolean]
  }

  object WriteJourneyRequest {
    @inline
    def apply(
        Name: __string,
        Activities: js.UndefOr[MapOfActivity] = js.undefined,
        ClosedDays: js.UndefOr[ClosedDays] = js.undefined,
        CreationDate: js.UndefOr[__string] = js.undefined,
        JourneyChannelSettings: js.UndefOr[JourneyChannelSettings] = js.undefined,
        LastModifiedDate: js.UndefOr[__string] = js.undefined,
        Limits: js.UndefOr[JourneyLimits] = js.undefined,
        LocalTime: js.UndefOr[__boolean] = js.undefined,
        OpenHours: js.UndefOr[OpenHours] = js.undefined,
        QuietTime: js.UndefOr[QuietTime] = js.undefined,
        RefreshFrequency: js.UndefOr[__string] = js.undefined,
        RefreshOnSegmentUpdate: js.UndefOr[__boolean] = js.undefined,
        Schedule: js.UndefOr[JourneySchedule] = js.undefined,
        SendingSchedule: js.UndefOr[__boolean] = js.undefined,
        StartActivity: js.UndefOr[__string] = js.undefined,
        StartCondition: js.UndefOr[StartCondition] = js.undefined,
        State: js.UndefOr[State] = js.undefined,
        WaitForQuietTime: js.UndefOr[__boolean] = js.undefined
    ): WriteJourneyRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      Activities.foreach(__v => __obj.updateDynamic("Activities")(__v.asInstanceOf[js.Any]))
      ClosedDays.foreach(__v => __obj.updateDynamic("ClosedDays")(__v.asInstanceOf[js.Any]))
      CreationDate.foreach(__v => __obj.updateDynamic("CreationDate")(__v.asInstanceOf[js.Any]))
      JourneyChannelSettings.foreach(__v => __obj.updateDynamic("JourneyChannelSettings")(__v.asInstanceOf[js.Any]))
      LastModifiedDate.foreach(__v => __obj.updateDynamic("LastModifiedDate")(__v.asInstanceOf[js.Any]))
      Limits.foreach(__v => __obj.updateDynamic("Limits")(__v.asInstanceOf[js.Any]))
      LocalTime.foreach(__v => __obj.updateDynamic("LocalTime")(__v.asInstanceOf[js.Any]))
      OpenHours.foreach(__v => __obj.updateDynamic("OpenHours")(__v.asInstanceOf[js.Any]))
      QuietTime.foreach(__v => __obj.updateDynamic("QuietTime")(__v.asInstanceOf[js.Any]))
      RefreshFrequency.foreach(__v => __obj.updateDynamic("RefreshFrequency")(__v.asInstanceOf[js.Any]))
      RefreshOnSegmentUpdate.foreach(__v => __obj.updateDynamic("RefreshOnSegmentUpdate")(__v.asInstanceOf[js.Any]))
      Schedule.foreach(__v => __obj.updateDynamic("Schedule")(__v.asInstanceOf[js.Any]))
      SendingSchedule.foreach(__v => __obj.updateDynamic("SendingSchedule")(__v.asInstanceOf[js.Any]))
      StartActivity.foreach(__v => __obj.updateDynamic("StartActivity")(__v.asInstanceOf[js.Any]))
      StartCondition.foreach(__v => __obj.updateDynamic("StartCondition")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      WaitForQuietTime.foreach(__v => __obj.updateDynamic("WaitForQuietTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[WriteJourneyRequest]
    }
  }

  /** Specifies the configuration, dimension, and other settings for a segment. A WriteSegmentRequest object can include a Dimensions object or a SegmentGroups object, but not both.
    */
  @js.native
  trait WriteSegmentRequest extends js.Object {
    var Dimensions: js.UndefOr[SegmentDimensions]
    var Name: js.UndefOr[__string]
    var SegmentGroups: js.UndefOr[SegmentGroupList]
    var tags: js.UndefOr[MapOf__string]
  }

  object WriteSegmentRequest {
    @inline
    def apply(
        Dimensions: js.UndefOr[SegmentDimensions] = js.undefined,
        Name: js.UndefOr[__string] = js.undefined,
        SegmentGroups: js.UndefOr[SegmentGroupList] = js.undefined,
        tags: js.UndefOr[MapOf__string] = js.undefined
    ): WriteSegmentRequest = {
      val __obj = js.Dynamic.literal()
      Dimensions.foreach(__v => __obj.updateDynamic("Dimensions")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      SegmentGroups.foreach(__v => __obj.updateDynamic("SegmentGroups")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[WriteSegmentRequest]
    }
  }

  /** Specifies the settings for a campaign treatment. A <i>treatment</i> is a variation of a campaign that's used for A/B testing of a campaign.
    */
  @js.native
  trait WriteTreatmentResource extends js.Object {
    var SizePercent: __integer
    var CustomDeliveryConfiguration: js.UndefOr[CustomDeliveryConfiguration]
    var MessageConfiguration: js.UndefOr[MessageConfiguration]
    var Schedule: js.UndefOr[Schedule]
    var TemplateConfiguration: js.UndefOr[TemplateConfiguration]
    var TreatmentDescription: js.UndefOr[__string]
    var TreatmentName: js.UndefOr[__string]
  }

  object WriteTreatmentResource {
    @inline
    def apply(
        SizePercent: __integer,
        CustomDeliveryConfiguration: js.UndefOr[CustomDeliveryConfiguration] = js.undefined,
        MessageConfiguration: js.UndefOr[MessageConfiguration] = js.undefined,
        Schedule: js.UndefOr[Schedule] = js.undefined,
        TemplateConfiguration: js.UndefOr[TemplateConfiguration] = js.undefined,
        TreatmentDescription: js.UndefOr[__string] = js.undefined,
        TreatmentName: js.UndefOr[__string] = js.undefined
    ): WriteTreatmentResource = {
      val __obj = js.Dynamic.literal(
        "SizePercent" -> SizePercent.asInstanceOf[js.Any]
      )

      CustomDeliveryConfiguration.foreach(__v => __obj.updateDynamic("CustomDeliveryConfiguration")(__v.asInstanceOf[js.Any]))
      MessageConfiguration.foreach(__v => __obj.updateDynamic("MessageConfiguration")(__v.asInstanceOf[js.Any]))
      Schedule.foreach(__v => __obj.updateDynamic("Schedule")(__v.asInstanceOf[js.Any]))
      TemplateConfiguration.foreach(__v => __obj.updateDynamic("TemplateConfiguration")(__v.asInstanceOf[js.Any]))
      TreatmentDescription.foreach(__v => __obj.updateDynamic("TreatmentDescription")(__v.asInstanceOf[js.Any]))
      TreatmentName.foreach(__v => __obj.updateDynamic("TreatmentName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[WriteTreatmentResource]
    }
  }
}
