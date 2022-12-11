package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import scala.language.implicitConversions
import facade.amazonaws._

package object connectcampaigns {
  type Arn = String
  type AttributeName = String
  type AttributeValue = String
  type Attributes = js.Dictionary[AttributeValue]
  type BandwidthAllocation = Double
  type CampaignArn = String
  type CampaignId = String
  type CampaignName = String
  type CampaignSummaryList = js.Array[CampaignSummary]
  type ClientToken = String
  type ContactFlowId = String
  type DestinationPhoneNumber = String
  type DialRequestId = String
  type DialRequestList = js.Array[DialRequest]
  type Enabled = Boolean
  type EncryptionKey = String
  type FailedCampaignStateResponseList = js.Array[FailedCampaignStateResponse]
  type FailedRequestList = js.Array[FailedRequest]
  type GetCampaignStateBatchRequestCampaignIdsList = js.Array[CampaignId]
  type InstanceId = String
  type MaxResults = Int
  type NextToken = String
  type QueueId = String
  type ServiceLinkedRoleArn = String
  type SourcePhoneNumber = String
  type SuccessfulCampaignStateResponseList = js.Array[SuccessfulCampaignStateResponse]
  type SuccessfulRequestList = js.Array[SuccessfulRequest]
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagMap = js.Dictionary[TagValue]
  type TagValue = String
  type TimeStamp = js.Date

  final class ConnectCampaignsOps(private val service: ConnectCampaigns) extends AnyVal {

    @inline def createCampaignFuture(params: CreateCampaignRequest): Future[CreateCampaignResponse] = service.createCampaign(params).promise().toFuture
    @inline def deleteCampaignFuture(params: DeleteCampaignRequest): Future[js.Object] = service.deleteCampaign(params).promise().toFuture
    @inline def deleteConnectInstanceConfigFuture(params: DeleteConnectInstanceConfigRequest): Future[js.Object] = service.deleteConnectInstanceConfig(params).promise().toFuture
    @inline def deleteInstanceOnboardingJobFuture(params: DeleteInstanceOnboardingJobRequest): Future[js.Object] = service.deleteInstanceOnboardingJob(params).promise().toFuture
    @inline def describeCampaignFuture(params: DescribeCampaignRequest): Future[DescribeCampaignResponse] = service.describeCampaign(params).promise().toFuture
    @inline def getCampaignStateBatchFuture(params: GetCampaignStateBatchRequest): Future[GetCampaignStateBatchResponse] = service.getCampaignStateBatch(params).promise().toFuture
    @inline def getCampaignStateFuture(params: GetCampaignStateRequest): Future[GetCampaignStateResponse] = service.getCampaignState(params).promise().toFuture
    @inline def getConnectInstanceConfigFuture(params: GetConnectInstanceConfigRequest): Future[GetConnectInstanceConfigResponse] = service.getConnectInstanceConfig(params).promise().toFuture
    @inline def getInstanceOnboardingJobStatusFuture(params: GetInstanceOnboardingJobStatusRequest): Future[GetInstanceOnboardingJobStatusResponse] = service.getInstanceOnboardingJobStatus(params).promise().toFuture
    @inline def listCampaignsFuture(params: ListCampaignsRequest): Future[ListCampaignsResponse] = service.listCampaigns(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] = service.listTagsForResource(params).promise().toFuture
    @inline def pauseCampaignFuture(params: PauseCampaignRequest): Future[js.Object] = service.pauseCampaign(params).promise().toFuture
    @inline def putDialRequestBatchFuture(params: PutDialRequestBatchRequest): Future[PutDialRequestBatchResponse] = service.putDialRequestBatch(params).promise().toFuture
    @inline def resumeCampaignFuture(params: ResumeCampaignRequest): Future[js.Object] = service.resumeCampaign(params).promise().toFuture
    @inline def startCampaignFuture(params: StartCampaignRequest): Future[js.Object] = service.startCampaign(params).promise().toFuture
    @inline def startInstanceOnboardingJobFuture(params: StartInstanceOnboardingJobRequest): Future[StartInstanceOnboardingJobResponse] = service.startInstanceOnboardingJob(params).promise().toFuture
    @inline def stopCampaignFuture(params: StopCampaignRequest): Future[js.Object] = service.stopCampaign(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[js.Object] = service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[js.Object] = service.untagResource(params).promise().toFuture
    @inline def updateCampaignDialerConfigFuture(params: UpdateCampaignDialerConfigRequest): Future[js.Object] = service.updateCampaignDialerConfig(params).promise().toFuture
    @inline def updateCampaignNameFuture(params: UpdateCampaignNameRequest): Future[js.Object] = service.updateCampaignName(params).promise().toFuture
    @inline def updateCampaignOutboundCallConfigFuture(params: UpdateCampaignOutboundCallConfigRequest): Future[js.Object] = service.updateCampaignOutboundCallConfig(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/connectcampaigns", JSImport.Namespace, "AWS.ConnectCampaigns")
  class ConnectCampaigns() extends js.Object {
    def this(config: AWSConfig) = this()

    def createCampaign(params: CreateCampaignRequest): Request[CreateCampaignResponse] = js.native
    def deleteCampaign(params: DeleteCampaignRequest): Request[js.Object] = js.native
    def deleteConnectInstanceConfig(params: DeleteConnectInstanceConfigRequest): Request[js.Object] = js.native
    def deleteInstanceOnboardingJob(params: DeleteInstanceOnboardingJobRequest): Request[js.Object] = js.native
    def describeCampaign(params: DescribeCampaignRequest): Request[DescribeCampaignResponse] = js.native
    def getCampaignState(params: GetCampaignStateRequest): Request[GetCampaignStateResponse] = js.native
    def getCampaignStateBatch(params: GetCampaignStateBatchRequest): Request[GetCampaignStateBatchResponse] = js.native
    def getConnectInstanceConfig(params: GetConnectInstanceConfigRequest): Request[GetConnectInstanceConfigResponse] = js.native
    def getInstanceOnboardingJobStatus(params: GetInstanceOnboardingJobStatusRequest): Request[GetInstanceOnboardingJobStatusResponse] = js.native
    def listCampaigns(params: ListCampaignsRequest): Request[ListCampaignsResponse] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def pauseCampaign(params: PauseCampaignRequest): Request[js.Object] = js.native
    def putDialRequestBatch(params: PutDialRequestBatchRequest): Request[PutDialRequestBatchResponse] = js.native
    def resumeCampaign(params: ResumeCampaignRequest): Request[js.Object] = js.native
    def startCampaign(params: StartCampaignRequest): Request[js.Object] = js.native
    def startInstanceOnboardingJob(params: StartInstanceOnboardingJobRequest): Request[StartInstanceOnboardingJobResponse] = js.native
    def stopCampaign(params: StopCampaignRequest): Request[js.Object] = js.native
    def tagResource(params: TagResourceRequest): Request[js.Object] = js.native
    def untagResource(params: UntagResourceRequest): Request[js.Object] = js.native
    def updateCampaignDialerConfig(params: UpdateCampaignDialerConfigRequest): Request[js.Object] = js.native
    def updateCampaignName(params: UpdateCampaignNameRequest): Request[js.Object] = js.native
    def updateCampaignOutboundCallConfig(params: UpdateCampaignOutboundCallConfigRequest): Request[js.Object] = js.native
  }
  object ConnectCampaigns {
    @inline implicit def toOps(service: ConnectCampaigns): ConnectCampaignsOps = {
      new ConnectCampaignsOps(service)
    }
  }

  /** Answering Machine Detection config
    */
  @js.native
  trait AnswerMachineDetectionConfig extends js.Object {
    var enableAnswerMachineDetection: Boolean
  }

  object AnswerMachineDetectionConfig {
    @inline
    def apply(
        enableAnswerMachineDetection: Boolean
    ): AnswerMachineDetectionConfig = {
      val __obj = js.Dynamic.literal(
        "enableAnswerMachineDetection" -> enableAnswerMachineDetection.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AnswerMachineDetectionConfig]
    }
  }

  /** An Amazon Connect campaign.
    */
  @js.native
  trait Campaign extends js.Object {
    var arn: CampaignArn
    var connectInstanceId: InstanceId
    var dialerConfig: DialerConfig
    var id: CampaignId
    var name: CampaignName
    var outboundCallConfig: OutboundCallConfig
    var tags: js.UndefOr[TagMap]
  }

  object Campaign {
    @inline
    def apply(
        arn: CampaignArn,
        connectInstanceId: InstanceId,
        dialerConfig: DialerConfig,
        id: CampaignId,
        name: CampaignName,
        outboundCallConfig: OutboundCallConfig,
        tags: js.UndefOr[TagMap] = js.undefined
    ): Campaign = {
      val __obj = js.Dynamic.literal(
        "arn" -> arn.asInstanceOf[js.Any],
        "connectInstanceId" -> connectInstanceId.asInstanceOf[js.Any],
        "dialerConfig" -> dialerConfig.asInstanceOf[js.Any],
        "id" -> id.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any],
        "outboundCallConfig" -> outboundCallConfig.asInstanceOf[js.Any]
      )

      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Campaign]
    }
  }

  /** Filter model by type
    */
  @js.native
  trait CampaignFilters extends js.Object {
    var instanceIdFilter: js.UndefOr[InstanceIdFilter]
  }

  object CampaignFilters {
    @inline
    def apply(
        instanceIdFilter: js.UndefOr[InstanceIdFilter] = js.undefined
    ): CampaignFilters = {
      val __obj = js.Dynamic.literal()
      instanceIdFilter.foreach(__v => __obj.updateDynamic("instanceIdFilter")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CampaignFilters]
    }
  }

  /** An Amazon Connect campaign summary.
    */
  @js.native
  trait CampaignSummary extends js.Object {
    var arn: CampaignArn
    var connectInstanceId: InstanceId
    var id: CampaignId
    var name: CampaignName
  }

  object CampaignSummary {
    @inline
    def apply(
        arn: CampaignArn,
        connectInstanceId: InstanceId,
        id: CampaignId,
        name: CampaignName
    ): CampaignSummary = {
      val __obj = js.Dynamic.literal(
        "arn" -> arn.asInstanceOf[js.Any],
        "connectInstanceId" -> connectInstanceId.asInstanceOf[js.Any],
        "id" -> id.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CampaignSummary]
    }
  }

  /** The request for Create Campaign API.
    */
  @js.native
  trait CreateCampaignRequest extends js.Object {
    var connectInstanceId: InstanceId
    var dialerConfig: DialerConfig
    var name: CampaignName
    var outboundCallConfig: OutboundCallConfig
    var tags: js.UndefOr[TagMap]
  }

  object CreateCampaignRequest {
    @inline
    def apply(
        connectInstanceId: InstanceId,
        dialerConfig: DialerConfig,
        name: CampaignName,
        outboundCallConfig: OutboundCallConfig,
        tags: js.UndefOr[TagMap] = js.undefined
    ): CreateCampaignRequest = {
      val __obj = js.Dynamic.literal(
        "connectInstanceId" -> connectInstanceId.asInstanceOf[js.Any],
        "dialerConfig" -> dialerConfig.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any],
        "outboundCallConfig" -> outboundCallConfig.asInstanceOf[js.Any]
      )

      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateCampaignRequest]
    }
  }

  /** The response for Create Campaign API
    */
  @js.native
  trait CreateCampaignResponse extends js.Object {
    var arn: js.UndefOr[CampaignArn]
    var id: js.UndefOr[CampaignId]
    var tags: js.UndefOr[TagMap]
  }

  object CreateCampaignResponse {
    @inline
    def apply(
        arn: js.UndefOr[CampaignArn] = js.undefined,
        id: js.UndefOr[CampaignId] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined
    ): CreateCampaignResponse = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      id.foreach(__v => __obj.updateDynamic("id")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateCampaignResponse]
    }
  }

  @js.native
  trait DeleteCampaignRequest extends js.Object {
    var id: CampaignId
  }

  object DeleteCampaignRequest {
    @inline
    def apply(
        id: CampaignId
    ): DeleteCampaignRequest = {
      val __obj = js.Dynamic.literal(
        "id" -> id.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteCampaignRequest]
    }
  }

  /** DeleteCampaignRequest
    */
  @js.native
  trait DeleteConnectInstanceConfigRequest extends js.Object {
    var connectInstanceId: InstanceId
  }

  object DeleteConnectInstanceConfigRequest {
    @inline
    def apply(
        connectInstanceId: InstanceId
    ): DeleteConnectInstanceConfigRequest = {
      val __obj = js.Dynamic.literal(
        "connectInstanceId" -> connectInstanceId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteConnectInstanceConfigRequest]
    }
  }

  /** The request for DeleteInstanceOnboardingJob API.
    */
  @js.native
  trait DeleteInstanceOnboardingJobRequest extends js.Object {
    var connectInstanceId: InstanceId
  }

  object DeleteInstanceOnboardingJobRequest {
    @inline
    def apply(
        connectInstanceId: InstanceId
    ): DeleteInstanceOnboardingJobRequest = {
      val __obj = js.Dynamic.literal(
        "connectInstanceId" -> connectInstanceId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteInstanceOnboardingJobRequest]
    }
  }

  /** DescribeCampaignRequests
    */
  @js.native
  trait DescribeCampaignRequest extends js.Object {
    var id: CampaignId
  }

  object DescribeCampaignRequest {
    @inline
    def apply(
        id: CampaignId
    ): DescribeCampaignRequest = {
      val __obj = js.Dynamic.literal(
        "id" -> id.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeCampaignRequest]
    }
  }

  @js.native
  trait DescribeCampaignResponse extends js.Object {
    var campaign: js.UndefOr[Campaign]
  }

  object DescribeCampaignResponse {
    @inline
    def apply(
        campaign: js.UndefOr[Campaign] = js.undefined
    ): DescribeCampaignResponse = {
      val __obj = js.Dynamic.literal()
      campaign.foreach(__v => __obj.updateDynamic("campaign")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeCampaignResponse]
    }
  }

  /** A dial request for a campaign.
    */
  @js.native
  trait DialRequest extends js.Object {
    var attributes: Attributes
    var clientToken: ClientToken
    var expirationTime: TimeStamp
    var phoneNumber: DestinationPhoneNumber
  }

  object DialRequest {
    @inline
    def apply(
        attributes: Attributes,
        clientToken: ClientToken,
        expirationTime: TimeStamp,
        phoneNumber: DestinationPhoneNumber
    ): DialRequest = {
      val __obj = js.Dynamic.literal(
        "attributes" -> attributes.asInstanceOf[js.Any],
        "clientToken" -> clientToken.asInstanceOf[js.Any],
        "expirationTime" -> expirationTime.asInstanceOf[js.Any],
        "phoneNumber" -> phoneNumber.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DialRequest]
    }
  }

  /** The possible types of dialer config parameters
    */
  @js.native
  trait DialerConfig extends js.Object {
    var predictiveDialerConfig: js.UndefOr[PredictiveDialerConfig]
    var progressiveDialerConfig: js.UndefOr[ProgressiveDialerConfig]
  }

  object DialerConfig {
    @inline
    def apply(
        predictiveDialerConfig: js.UndefOr[PredictiveDialerConfig] = js.undefined,
        progressiveDialerConfig: js.UndefOr[ProgressiveDialerConfig] = js.undefined
    ): DialerConfig = {
      val __obj = js.Dynamic.literal()
      predictiveDialerConfig.foreach(__v => __obj.updateDynamic("predictiveDialerConfig")(__v.asInstanceOf[js.Any]))
      progressiveDialerConfig.foreach(__v => __obj.updateDynamic("progressiveDialerConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DialerConfig]
    }
  }

  /** Encryption config for Connect Instance. Note that sensitive data will always be encrypted. If disabled, service will perform encryption with its own key. If enabled, a KMS key id needs to be provided and KMS charges will apply. KMS is only type supported
    */
  @js.native
  trait EncryptionConfig extends js.Object {
    var enabled: Enabled
    var encryptionType: js.UndefOr[EncryptionType]
    var keyArn: js.UndefOr[EncryptionKey]
  }

  object EncryptionConfig {
    @inline
    def apply(
        enabled: Enabled,
        encryptionType: js.UndefOr[EncryptionType] = js.undefined,
        keyArn: js.UndefOr[EncryptionKey] = js.undefined
    ): EncryptionConfig = {
      val __obj = js.Dynamic.literal(
        "enabled" -> enabled.asInstanceOf[js.Any]
      )

      encryptionType.foreach(__v => __obj.updateDynamic("encryptionType")(__v.asInstanceOf[js.Any]))
      keyArn.foreach(__v => __obj.updateDynamic("keyArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EncryptionConfig]
    }
  }

  /** Failed response of campaign state
    */
  @js.native
  trait FailedCampaignStateResponse extends js.Object {
    var campaignId: js.UndefOr[CampaignId]
    var failureCode: js.UndefOr[GetCampaignStateBatchFailureCode]
  }

  object FailedCampaignStateResponse {
    @inline
    def apply(
        campaignId: js.UndefOr[CampaignId] = js.undefined,
        failureCode: js.UndefOr[GetCampaignStateBatchFailureCode] = js.undefined
    ): FailedCampaignStateResponse = {
      val __obj = js.Dynamic.literal()
      campaignId.foreach(__v => __obj.updateDynamic("campaignId")(__v.asInstanceOf[js.Any]))
      failureCode.foreach(__v => __obj.updateDynamic("failureCode")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FailedCampaignStateResponse]
    }
  }

  /** A failed request identified by the unique client token.
    */
  @js.native
  trait FailedRequest extends js.Object {
    var clientToken: js.UndefOr[ClientToken]
    var failureCode: js.UndefOr[FailureCode]
    var id: js.UndefOr[DialRequestId]
  }

  object FailedRequest {
    @inline
    def apply(
        clientToken: js.UndefOr[ClientToken] = js.undefined,
        failureCode: js.UndefOr[FailureCode] = js.undefined,
        id: js.UndefOr[DialRequestId] = js.undefined
    ): FailedRequest = {
      val __obj = js.Dynamic.literal()
      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      failureCode.foreach(__v => __obj.updateDynamic("failureCode")(__v.asInstanceOf[js.Any]))
      id.foreach(__v => __obj.updateDynamic("id")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FailedRequest]
    }
  }

  @js.native
  trait GetCampaignStateBatchRequest extends js.Object {
    var campaignIds: GetCampaignStateBatchRequestCampaignIdsList
  }

  object GetCampaignStateBatchRequest {
    @inline
    def apply(
        campaignIds: GetCampaignStateBatchRequestCampaignIdsList
    ): GetCampaignStateBatchRequest = {
      val __obj = js.Dynamic.literal(
        "campaignIds" -> campaignIds.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetCampaignStateBatchRequest]
    }
  }

  @js.native
  trait GetCampaignStateBatchResponse extends js.Object {
    var failedRequests: js.UndefOr[FailedCampaignStateResponseList]
    var successfulRequests: js.UndefOr[SuccessfulCampaignStateResponseList]
  }

  object GetCampaignStateBatchResponse {
    @inline
    def apply(
        failedRequests: js.UndefOr[FailedCampaignStateResponseList] = js.undefined,
        successfulRequests: js.UndefOr[SuccessfulCampaignStateResponseList] = js.undefined
    ): GetCampaignStateBatchResponse = {
      val __obj = js.Dynamic.literal()
      failedRequests.foreach(__v => __obj.updateDynamic("failedRequests")(__v.asInstanceOf[js.Any]))
      successfulRequests.foreach(__v => __obj.updateDynamic("successfulRequests")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetCampaignStateBatchResponse]
    }
  }

  @js.native
  trait GetCampaignStateRequest extends js.Object {
    var id: CampaignId
  }

  object GetCampaignStateRequest {
    @inline
    def apply(
        id: CampaignId
    ): GetCampaignStateRequest = {
      val __obj = js.Dynamic.literal(
        "id" -> id.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetCampaignStateRequest]
    }
  }

  @js.native
  trait GetCampaignStateResponse extends js.Object {
    var state: js.UndefOr[CampaignState]
  }

  object GetCampaignStateResponse {
    @inline
    def apply(
        state: js.UndefOr[CampaignState] = js.undefined
    ): GetCampaignStateResponse = {
      val __obj = js.Dynamic.literal()
      state.foreach(__v => __obj.updateDynamic("state")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetCampaignStateResponse]
    }
  }

  @js.native
  trait GetConnectInstanceConfigRequest extends js.Object {
    var connectInstanceId: InstanceId
  }

  object GetConnectInstanceConfigRequest {
    @inline
    def apply(
        connectInstanceId: InstanceId
    ): GetConnectInstanceConfigRequest = {
      val __obj = js.Dynamic.literal(
        "connectInstanceId" -> connectInstanceId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetConnectInstanceConfigRequest]
    }
  }

  @js.native
  trait GetConnectInstanceConfigResponse extends js.Object {
    var connectInstanceConfig: js.UndefOr[InstanceConfig]
  }

  object GetConnectInstanceConfigResponse {
    @inline
    def apply(
        connectInstanceConfig: js.UndefOr[InstanceConfig] = js.undefined
    ): GetConnectInstanceConfigResponse = {
      val __obj = js.Dynamic.literal()
      connectInstanceConfig.foreach(__v => __obj.updateDynamic("connectInstanceConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetConnectInstanceConfigResponse]
    }
  }

  @js.native
  trait GetInstanceOnboardingJobStatusRequest extends js.Object {
    var connectInstanceId: InstanceId
  }

  object GetInstanceOnboardingJobStatusRequest {
    @inline
    def apply(
        connectInstanceId: InstanceId
    ): GetInstanceOnboardingJobStatusRequest = {
      val __obj = js.Dynamic.literal(
        "connectInstanceId" -> connectInstanceId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetInstanceOnboardingJobStatusRequest]
    }
  }

  @js.native
  trait GetInstanceOnboardingJobStatusResponse extends js.Object {
    var connectInstanceOnboardingJobStatus: js.UndefOr[InstanceOnboardingJobStatus]
  }

  object GetInstanceOnboardingJobStatusResponse {
    @inline
    def apply(
        connectInstanceOnboardingJobStatus: js.UndefOr[InstanceOnboardingJobStatus] = js.undefined
    ): GetInstanceOnboardingJobStatusResponse = {
      val __obj = js.Dynamic.literal()
      connectInstanceOnboardingJobStatus.foreach(__v => __obj.updateDynamic("connectInstanceOnboardingJobStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetInstanceOnboardingJobStatusResponse]
    }
  }

  /** Instance config object
    */
  @js.native
  trait InstanceConfig extends js.Object {
    var connectInstanceId: InstanceId
    var encryptionConfig: EncryptionConfig
    var serviceLinkedRoleArn: ServiceLinkedRoleArn
  }

  object InstanceConfig {
    @inline
    def apply(
        connectInstanceId: InstanceId,
        encryptionConfig: EncryptionConfig,
        serviceLinkedRoleArn: ServiceLinkedRoleArn
    ): InstanceConfig = {
      val __obj = js.Dynamic.literal(
        "connectInstanceId" -> connectInstanceId.asInstanceOf[js.Any],
        "encryptionConfig" -> encryptionConfig.asInstanceOf[js.Any],
        "serviceLinkedRoleArn" -> serviceLinkedRoleArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[InstanceConfig]
    }
  }

  /** Connect instance identifier filter
    */
  @js.native
  trait InstanceIdFilter extends js.Object {
    var operator: InstanceIdFilterOperator
    var value: InstanceId
  }

  object InstanceIdFilter {
    @inline
    def apply(
        operator: InstanceIdFilterOperator,
        value: InstanceId
    ): InstanceIdFilter = {
      val __obj = js.Dynamic.literal(
        "operator" -> operator.asInstanceOf[js.Any],
        "value" -> value.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[InstanceIdFilter]
    }
  }

  /** Instance onboarding job status object
    */
  @js.native
  trait InstanceOnboardingJobStatus extends js.Object {
    var connectInstanceId: InstanceId
    var status: InstanceOnboardingJobStatusCode
    var failureCode: js.UndefOr[InstanceOnboardingJobFailureCode]
  }

  object InstanceOnboardingJobStatus {
    @inline
    def apply(
        connectInstanceId: InstanceId,
        status: InstanceOnboardingJobStatusCode,
        failureCode: js.UndefOr[InstanceOnboardingJobFailureCode] = js.undefined
    ): InstanceOnboardingJobStatus = {
      val __obj = js.Dynamic.literal(
        "connectInstanceId" -> connectInstanceId.asInstanceOf[js.Any],
        "status" -> status.asInstanceOf[js.Any]
      )

      failureCode.foreach(__v => __obj.updateDynamic("failureCode")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InstanceOnboardingJobStatus]
    }
  }

  @js.native
  trait ListCampaignsRequest extends js.Object {
    var filters: js.UndefOr[CampaignFilters]
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListCampaignsRequest {
    @inline
    def apply(
        filters: js.UndefOr[CampaignFilters] = js.undefined,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListCampaignsRequest = {
      val __obj = js.Dynamic.literal()
      filters.foreach(__v => __obj.updateDynamic("filters")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListCampaignsRequest]
    }
  }

  @js.native
  trait ListCampaignsResponse extends js.Object {
    var campaignSummaryList: js.UndefOr[CampaignSummaryList]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListCampaignsResponse {
    @inline
    def apply(
        campaignSummaryList: js.UndefOr[CampaignSummaryList] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListCampaignsResponse = {
      val __obj = js.Dynamic.literal()
      campaignSummaryList.foreach(__v => __obj.updateDynamic("campaignSummaryList")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListCampaignsResponse]
    }
  }

  /** ListTagsForResource
    */
  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var arn: Arn
  }

  object ListTagsForResourceRequest {
    @inline
    def apply(
        arn: Arn
    ): ListTagsForResourceRequest = {
      val __obj = js.Dynamic.literal(
        "arn" -> arn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ListTagsForResourceRequest]
    }
  }

  /** ListTagsForResponse
    */
  @js.native
  trait ListTagsForResourceResponse extends js.Object {
    var tags: js.UndefOr[TagMap]
  }

  object ListTagsForResourceResponse {
    @inline
    def apply(
        tags: js.UndefOr[TagMap] = js.undefined
    ): ListTagsForResourceResponse = {
      val __obj = js.Dynamic.literal()
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceResponse]
    }
  }

  /** The configuration used for outbound calls.
    */
  @js.native
  trait OutboundCallConfig extends js.Object {
    var connectContactFlowId: ContactFlowId
    var connectQueueId: QueueId
    var answerMachineDetectionConfig: js.UndefOr[AnswerMachineDetectionConfig]
    var connectSourcePhoneNumber: js.UndefOr[SourcePhoneNumber]
  }

  object OutboundCallConfig {
    @inline
    def apply(
        connectContactFlowId: ContactFlowId,
        connectQueueId: QueueId,
        answerMachineDetectionConfig: js.UndefOr[AnswerMachineDetectionConfig] = js.undefined,
        connectSourcePhoneNumber: js.UndefOr[SourcePhoneNumber] = js.undefined
    ): OutboundCallConfig = {
      val __obj = js.Dynamic.literal(
        "connectContactFlowId" -> connectContactFlowId.asInstanceOf[js.Any],
        "connectQueueId" -> connectQueueId.asInstanceOf[js.Any]
      )

      answerMachineDetectionConfig.foreach(__v => __obj.updateDynamic("answerMachineDetectionConfig")(__v.asInstanceOf[js.Any]))
      connectSourcePhoneNumber.foreach(__v => __obj.updateDynamic("connectSourcePhoneNumber")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OutboundCallConfig]
    }
  }

  @js.native
  trait PauseCampaignRequest extends js.Object {
    var id: CampaignId
  }

  object PauseCampaignRequest {
    @inline
    def apply(
        id: CampaignId
    ): PauseCampaignRequest = {
      val __obj = js.Dynamic.literal(
        "id" -> id.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[PauseCampaignRequest]
    }
  }

  /** Predictive Dialer config
    */
  @js.native
  trait PredictiveDialerConfig extends js.Object {
    var bandwidthAllocation: BandwidthAllocation
  }

  object PredictiveDialerConfig {
    @inline
    def apply(
        bandwidthAllocation: BandwidthAllocation
    ): PredictiveDialerConfig = {
      val __obj = js.Dynamic.literal(
        "bandwidthAllocation" -> bandwidthAllocation.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[PredictiveDialerConfig]
    }
  }

  /** Progressive Dialer config
    */
  @js.native
  trait ProgressiveDialerConfig extends js.Object {
    var bandwidthAllocation: BandwidthAllocation
  }

  object ProgressiveDialerConfig {
    @inline
    def apply(
        bandwidthAllocation: BandwidthAllocation
    ): ProgressiveDialerConfig = {
      val __obj = js.Dynamic.literal(
        "bandwidthAllocation" -> bandwidthAllocation.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ProgressiveDialerConfig]
    }
  }

  @js.native
  trait PutDialRequestBatchRequest extends js.Object {
    var dialRequests: DialRequestList
    var id: CampaignId
  }

  object PutDialRequestBatchRequest {
    @inline
    def apply(
        dialRequests: DialRequestList,
        id: CampaignId
    ): PutDialRequestBatchRequest = {
      val __obj = js.Dynamic.literal(
        "dialRequests" -> dialRequests.asInstanceOf[js.Any],
        "id" -> id.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[PutDialRequestBatchRequest]
    }
  }

  @js.native
  trait PutDialRequestBatchResponse extends js.Object {
    var failedRequests: js.UndefOr[FailedRequestList]
    var successfulRequests: js.UndefOr[SuccessfulRequestList]
  }

  object PutDialRequestBatchResponse {
    @inline
    def apply(
        failedRequests: js.UndefOr[FailedRequestList] = js.undefined,
        successfulRequests: js.UndefOr[SuccessfulRequestList] = js.undefined
    ): PutDialRequestBatchResponse = {
      val __obj = js.Dynamic.literal()
      failedRequests.foreach(__v => __obj.updateDynamic("failedRequests")(__v.asInstanceOf[js.Any]))
      successfulRequests.foreach(__v => __obj.updateDynamic("successfulRequests")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutDialRequestBatchResponse]
    }
  }

  @js.native
  trait ResumeCampaignRequest extends js.Object {
    var id: CampaignId
  }

  object ResumeCampaignRequest {
    @inline
    def apply(
        id: CampaignId
    ): ResumeCampaignRequest = {
      val __obj = js.Dynamic.literal(
        "id" -> id.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ResumeCampaignRequest]
    }
  }

  @js.native
  trait StartCampaignRequest extends js.Object {
    var id: CampaignId
  }

  object StartCampaignRequest {
    @inline
    def apply(
        id: CampaignId
    ): StartCampaignRequest = {
      val __obj = js.Dynamic.literal(
        "id" -> id.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[StartCampaignRequest]
    }
  }

  /** The request for StartInstanceOnboardingJob API.
    */
  @js.native
  trait StartInstanceOnboardingJobRequest extends js.Object {
    var connectInstanceId: InstanceId
    var encryptionConfig: EncryptionConfig
  }

  object StartInstanceOnboardingJobRequest {
    @inline
    def apply(
        connectInstanceId: InstanceId,
        encryptionConfig: EncryptionConfig
    ): StartInstanceOnboardingJobRequest = {
      val __obj = js.Dynamic.literal(
        "connectInstanceId" -> connectInstanceId.asInstanceOf[js.Any],
        "encryptionConfig" -> encryptionConfig.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[StartInstanceOnboardingJobRequest]
    }
  }

  /** The response for StartInstanceOnboardingJob API.
    */
  @js.native
  trait StartInstanceOnboardingJobResponse extends js.Object {
    var connectInstanceOnboardingJobStatus: js.UndefOr[InstanceOnboardingJobStatus]
  }

  object StartInstanceOnboardingJobResponse {
    @inline
    def apply(
        connectInstanceOnboardingJobStatus: js.UndefOr[InstanceOnboardingJobStatus] = js.undefined
    ): StartInstanceOnboardingJobResponse = {
      val __obj = js.Dynamic.literal()
      connectInstanceOnboardingJobStatus.foreach(__v => __obj.updateDynamic("connectInstanceOnboardingJobStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartInstanceOnboardingJobResponse]
    }
  }

  @js.native
  trait StopCampaignRequest extends js.Object {
    var id: CampaignId
  }

  object StopCampaignRequest {
    @inline
    def apply(
        id: CampaignId
    ): StopCampaignRequest = {
      val __obj = js.Dynamic.literal(
        "id" -> id.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[StopCampaignRequest]
    }
  }

  /** Successful response of campaign state
    */
  @js.native
  trait SuccessfulCampaignStateResponse extends js.Object {
    var campaignId: js.UndefOr[CampaignId]
    var state: js.UndefOr[CampaignState]
  }

  object SuccessfulCampaignStateResponse {
    @inline
    def apply(
        campaignId: js.UndefOr[CampaignId] = js.undefined,
        state: js.UndefOr[CampaignState] = js.undefined
    ): SuccessfulCampaignStateResponse = {
      val __obj = js.Dynamic.literal()
      campaignId.foreach(__v => __obj.updateDynamic("campaignId")(__v.asInstanceOf[js.Any]))
      state.foreach(__v => __obj.updateDynamic("state")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SuccessfulCampaignStateResponse]
    }
  }

  /** A successful request identified by the unique client token.
    */
  @js.native
  trait SuccessfulRequest extends js.Object {
    var clientToken: js.UndefOr[ClientToken]
    var id: js.UndefOr[DialRequestId]
  }

  object SuccessfulRequest {
    @inline
    def apply(
        clientToken: js.UndefOr[ClientToken] = js.undefined,
        id: js.UndefOr[DialRequestId] = js.undefined
    ): SuccessfulRequest = {
      val __obj = js.Dynamic.literal()
      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      id.foreach(__v => __obj.updateDynamic("id")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SuccessfulRequest]
    }
  }

  @js.native
  trait TagResourceRequest extends js.Object {
    var arn: Arn
    var tags: TagMap
  }

  object TagResourceRequest {
    @inline
    def apply(
        arn: Arn,
        tags: TagMap
    ): TagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "arn" -> arn.asInstanceOf[js.Any],
        "tags" -> tags.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[TagResourceRequest]
    }
  }

  @js.native
  trait UntagResourceRequest extends js.Object {
    var arn: Arn
    var tagKeys: TagKeyList
  }

  object UntagResourceRequest {
    @inline
    def apply(
        arn: Arn,
        tagKeys: TagKeyList
    ): UntagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "arn" -> arn.asInstanceOf[js.Any],
        "tagKeys" -> tagKeys.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UntagResourceRequest]
    }
  }

  @js.native
  trait UpdateCampaignDialerConfigRequest extends js.Object {
    var dialerConfig: DialerConfig
    var id: CampaignId
  }

  object UpdateCampaignDialerConfigRequest {
    @inline
    def apply(
        dialerConfig: DialerConfig,
        id: CampaignId
    ): UpdateCampaignDialerConfigRequest = {
      val __obj = js.Dynamic.literal(
        "dialerConfig" -> dialerConfig.asInstanceOf[js.Any],
        "id" -> id.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateCampaignDialerConfigRequest]
    }
  }

  @js.native
  trait UpdateCampaignNameRequest extends js.Object {
    var id: CampaignId
    var name: CampaignName
  }

  object UpdateCampaignNameRequest {
    @inline
    def apply(
        id: CampaignId,
        name: CampaignName
    ): UpdateCampaignNameRequest = {
      val __obj = js.Dynamic.literal(
        "id" -> id.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateCampaignNameRequest]
    }
  }

  @js.native
  trait UpdateCampaignOutboundCallConfigRequest extends js.Object {
    var id: CampaignId
    var answerMachineDetectionConfig: js.UndefOr[AnswerMachineDetectionConfig]
    var connectContactFlowId: js.UndefOr[ContactFlowId]
    var connectSourcePhoneNumber: js.UndefOr[SourcePhoneNumber]
  }

  object UpdateCampaignOutboundCallConfigRequest {
    @inline
    def apply(
        id: CampaignId,
        answerMachineDetectionConfig: js.UndefOr[AnswerMachineDetectionConfig] = js.undefined,
        connectContactFlowId: js.UndefOr[ContactFlowId] = js.undefined,
        connectSourcePhoneNumber: js.UndefOr[SourcePhoneNumber] = js.undefined
    ): UpdateCampaignOutboundCallConfigRequest = {
      val __obj = js.Dynamic.literal(
        "id" -> id.asInstanceOf[js.Any]
      )

      answerMachineDetectionConfig.foreach(__v => __obj.updateDynamic("answerMachineDetectionConfig")(__v.asInstanceOf[js.Any]))
      connectContactFlowId.foreach(__v => __obj.updateDynamic("connectContactFlowId")(__v.asInstanceOf[js.Any]))
      connectSourcePhoneNumber.foreach(__v => __obj.updateDynamic("connectSourcePhoneNumber")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateCampaignOutboundCallConfigRequest]
    }
  }
}
