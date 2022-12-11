package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import scala.language.implicitConversions
import facade.amazonaws._

package object sesv2 {
  type AdditionalContactEmailAddress = String
  type AdditionalContactEmailAddresses = js.Array[AdditionalContactEmailAddress]
  type AmazonResourceName = String
  type AttributesData = String
  type BatchGetMetricDataQueries = js.Array[BatchGetMetricDataQuery]
  type BlacklistEntries = js.Array[BlacklistEntry]
  type BlacklistItemName = String
  type BlacklistItemNames = js.Array[BlacklistItemName]
  type BlacklistReport = js.Dictionary[BlacklistEntries]
  type BlacklistingDescription = String
  type BulkEmailEntryList = js.Array[BulkEmailEntry]
  type BulkEmailEntryResultList = js.Array[BulkEmailEntryResult]
  type CampaignId = String
  type CaseId = String
  type Charset = String
  type CloudWatchDimensionConfigurations = js.Array[CloudWatchDimensionConfiguration]
  type ConfigurationSetName = String
  type ConfigurationSetNameList = js.Array[ConfigurationSetName]
  type ContactListName = String
  type Counter = Double
  type CustomRedirectDomain = String
  type CustomVerificationEmailTemplatesList = js.Array[CustomVerificationEmailTemplateMetadata]
  type DailyVolumes = js.Array[DailyVolume]
  type DedicatedIpList = js.Array[DedicatedIp]
  type DefaultDimensionValue = String
  type DeliverabilityTestReports = js.Array[DeliverabilityTestReport]
  type DeliverabilityTestSubject = String
  type Description = String
  type DimensionName = String
  type Dimensions = js.Dictionary[MetricDimensionValue]
  type DisplayName = String
  type DnsToken = String
  type DnsTokenList = js.Array[DnsToken]
  type Domain = String
  type DomainDeliverabilityCampaignList = js.Array[DomainDeliverabilityCampaign]
  type DomainDeliverabilityTrackingOptions = js.Array[DomainDeliverabilityTrackingOption]
  type DomainIspPlacements = js.Array[DomainIspPlacement]
  type EmailAddress = String
  type EmailAddressList = js.Array[EmailAddress]
  type EmailTemplateData = String
  type EmailTemplateHtml = String
  type EmailTemplateMetadataList = js.Array[EmailTemplateMetadata]
  type EmailTemplateName = String
  type EmailTemplateSubject = String
  type EmailTemplateText = String
  type Enabled = Boolean
  type EnabledWrapper = Boolean
  type ErrorMessage = String
  type Esp = String
  type Esps = js.Array[Esp]
  type EventDestinationName = String
  type EventDestinations = js.Array[EventDestination]
  type EventTypes = js.Array[EventType]
  type FailedRecordsCount = Int
  type FailedRecordsS3Url = String
  type FailureRedirectionURL = String
  type FeedbackId = String
  type GeneralEnforcementStatus = String
  type Identity = String
  type IdentityInfoList = js.Array[IdentityInfo]
  type ImageUrl = String
  type ImportJobSummaryList = js.Array[ImportJobSummary]
  type Ip = String
  type IpList = js.Array[Ip]
  type IspName = String
  type IspNameList = js.Array[IspName]
  type IspPlacements = js.Array[IspPlacement]
  type JobId = String
  type LastFreshStart = js.Date
  type ListOfContactLists = js.Array[ContactList]
  type ListOfContacts = js.Array[Contact]
  type ListOfDedicatedIpPools = js.Array[PoolName]
  type ListRecommendationFilterValue = String
  type ListRecommendationsFilter = js.Dictionary[ListRecommendationFilterValue]
  type MailFromDomainName = String
  type Max24HourSend = Double
  type MaxItems = Int
  type MaxSendRate = Double
  type MessageContent = String
  type MessageData = String
  type MessageTagList = js.Array[MessageTag]
  type MessageTagName = String
  type MessageTagValue = String
  type MetricDataErrorList = js.Array[MetricDataError]
  type MetricDataResultList = js.Array[MetricDataResult]
  type MetricDimensionValue = String
  type MetricValueList = js.Array[Counter]
  type NextToken = String
  type OutboundMessageId = String
  type Percentage = Double
  type Percentage100Wrapper = Int
  type Policy = String
  type PolicyMap = js.Dictionary[Policy]
  type PolicyName = String
  type PoolName = String
  type PrivateKey = String
  type ProcessedRecordsCount = Int
  type QueryErrorMessage = String
  type QueryIdentifier = String
  type RawMessageData = js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type RblName = String
  type RecommendationDescription = String
  type RecommendationsList = js.Array[Recommendation]
  type RenderedEmailTemplate = String
  type ReportId = String
  type ReportName = String
  type S3Url = String
  type Selector = String
  type SendingPoolName = String
  type SentLast24Hours = Double
  type Subject = String
  type SuccessRedirectionURL = String
  type SuppressedDestinationSummaries = js.Array[SuppressedDestinationSummary]
  type SuppressionListReasons = js.Array[SuppressionListReason]
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagList = js.Array[Tag]
  type TagValue = String
  type TemplateContent = String
  type Timestamp = js.Date
  type TimestampList = js.Array[Timestamp]
  type TopicName = String
  type TopicPreferenceList = js.Array[TopicPreference]
  type Topics = js.Array[Topic]
  type UnsubscribeAll = Boolean
  type UseCaseDescription = String
  type UseDefaultIfPreferenceUnavailable = Boolean
  type Volume = Double
  type WebsiteURL = String

  final class SESv2Ops(private val service: SESv2) extends AnyVal {

    @inline def batchGetMetricDataFuture(params: BatchGetMetricDataRequest): Future[BatchGetMetricDataResponse] = service.batchGetMetricData(params).promise().toFuture
    @inline def createConfigurationSetEventDestinationFuture(params: CreateConfigurationSetEventDestinationRequest): Future[CreateConfigurationSetEventDestinationResponse] = service.createConfigurationSetEventDestination(params).promise().toFuture
    @inline def createConfigurationSetFuture(params: CreateConfigurationSetRequest): Future[CreateConfigurationSetResponse] = service.createConfigurationSet(params).promise().toFuture
    @inline def createContactFuture(params: CreateContactRequest): Future[CreateContactResponse] = service.createContact(params).promise().toFuture
    @inline def createContactListFuture(params: CreateContactListRequest): Future[CreateContactListResponse] = service.createContactList(params).promise().toFuture
    @inline def createCustomVerificationEmailTemplateFuture(params: CreateCustomVerificationEmailTemplateRequest): Future[CreateCustomVerificationEmailTemplateResponse] = service.createCustomVerificationEmailTemplate(params).promise().toFuture
    @inline def createDedicatedIpPoolFuture(params: CreateDedicatedIpPoolRequest): Future[CreateDedicatedIpPoolResponse] = service.createDedicatedIpPool(params).promise().toFuture
    @inline def createDeliverabilityTestReportFuture(params: CreateDeliverabilityTestReportRequest): Future[CreateDeliverabilityTestReportResponse] = service.createDeliverabilityTestReport(params).promise().toFuture
    @inline def createEmailIdentityFuture(params: CreateEmailIdentityRequest): Future[CreateEmailIdentityResponse] = service.createEmailIdentity(params).promise().toFuture
    @inline def createEmailIdentityPolicyFuture(params: CreateEmailIdentityPolicyRequest): Future[CreateEmailIdentityPolicyResponse] = service.createEmailIdentityPolicy(params).promise().toFuture
    @inline def createEmailTemplateFuture(params: CreateEmailTemplateRequest): Future[CreateEmailTemplateResponse] = service.createEmailTemplate(params).promise().toFuture
    @inline def createImportJobFuture(params: CreateImportJobRequest): Future[CreateImportJobResponse] = service.createImportJob(params).promise().toFuture
    @inline def deleteConfigurationSetEventDestinationFuture(params: DeleteConfigurationSetEventDestinationRequest): Future[DeleteConfigurationSetEventDestinationResponse] = service.deleteConfigurationSetEventDestination(params).promise().toFuture
    @inline def deleteConfigurationSetFuture(params: DeleteConfigurationSetRequest): Future[DeleteConfigurationSetResponse] = service.deleteConfigurationSet(params).promise().toFuture
    @inline def deleteContactFuture(params: DeleteContactRequest): Future[DeleteContactResponse] = service.deleteContact(params).promise().toFuture
    @inline def deleteContactListFuture(params: DeleteContactListRequest): Future[DeleteContactListResponse] = service.deleteContactList(params).promise().toFuture
    @inline def deleteCustomVerificationEmailTemplateFuture(params: DeleteCustomVerificationEmailTemplateRequest): Future[DeleteCustomVerificationEmailTemplateResponse] = service.deleteCustomVerificationEmailTemplate(params).promise().toFuture
    @inline def deleteDedicatedIpPoolFuture(params: DeleteDedicatedIpPoolRequest): Future[DeleteDedicatedIpPoolResponse] = service.deleteDedicatedIpPool(params).promise().toFuture
    @inline def deleteEmailIdentityFuture(params: DeleteEmailIdentityRequest): Future[DeleteEmailIdentityResponse] = service.deleteEmailIdentity(params).promise().toFuture
    @inline def deleteEmailIdentityPolicyFuture(params: DeleteEmailIdentityPolicyRequest): Future[DeleteEmailIdentityPolicyResponse] = service.deleteEmailIdentityPolicy(params).promise().toFuture
    @inline def deleteEmailTemplateFuture(params: DeleteEmailTemplateRequest): Future[DeleteEmailTemplateResponse] = service.deleteEmailTemplate(params).promise().toFuture
    @inline def deleteSuppressedDestinationFuture(params: DeleteSuppressedDestinationRequest): Future[DeleteSuppressedDestinationResponse] = service.deleteSuppressedDestination(params).promise().toFuture
    @inline def getAccountFuture(params: GetAccountRequest): Future[GetAccountResponse] = service.getAccount(params).promise().toFuture
    @inline def getBlacklistReportsFuture(params: GetBlacklistReportsRequest): Future[GetBlacklistReportsResponse] = service.getBlacklistReports(params).promise().toFuture
    @inline def getConfigurationSetEventDestinationsFuture(params: GetConfigurationSetEventDestinationsRequest): Future[GetConfigurationSetEventDestinationsResponse] = service.getConfigurationSetEventDestinations(params).promise().toFuture
    @inline def getConfigurationSetFuture(params: GetConfigurationSetRequest): Future[GetConfigurationSetResponse] = service.getConfigurationSet(params).promise().toFuture
    @inline def getContactFuture(params: GetContactRequest): Future[GetContactResponse] = service.getContact(params).promise().toFuture
    @inline def getContactListFuture(params: GetContactListRequest): Future[GetContactListResponse] = service.getContactList(params).promise().toFuture
    @inline def getCustomVerificationEmailTemplateFuture(params: GetCustomVerificationEmailTemplateRequest): Future[GetCustomVerificationEmailTemplateResponse] = service.getCustomVerificationEmailTemplate(params).promise().toFuture
    @inline def getDedicatedIpFuture(params: GetDedicatedIpRequest): Future[GetDedicatedIpResponse] = service.getDedicatedIp(params).promise().toFuture
    @inline def getDedicatedIpPoolFuture(params: GetDedicatedIpPoolRequest): Future[GetDedicatedIpPoolResponse] = service.getDedicatedIpPool(params).promise().toFuture
    @inline def getDedicatedIpsFuture(params: GetDedicatedIpsRequest): Future[GetDedicatedIpsResponse] = service.getDedicatedIps(params).promise().toFuture
    @inline def getDeliverabilityDashboardOptionsFuture(params: GetDeliverabilityDashboardOptionsRequest): Future[GetDeliverabilityDashboardOptionsResponse] = service.getDeliverabilityDashboardOptions(params).promise().toFuture
    @inline def getDeliverabilityTestReportFuture(params: GetDeliverabilityTestReportRequest): Future[GetDeliverabilityTestReportResponse] = service.getDeliverabilityTestReport(params).promise().toFuture
    @inline def getDomainDeliverabilityCampaignFuture(params: GetDomainDeliverabilityCampaignRequest): Future[GetDomainDeliverabilityCampaignResponse] = service.getDomainDeliverabilityCampaign(params).promise().toFuture
    @inline def getDomainStatisticsReportFuture(params: GetDomainStatisticsReportRequest): Future[GetDomainStatisticsReportResponse] = service.getDomainStatisticsReport(params).promise().toFuture
    @inline def getEmailIdentityFuture(params: GetEmailIdentityRequest): Future[GetEmailIdentityResponse] = service.getEmailIdentity(params).promise().toFuture
    @inline def getEmailIdentityPoliciesFuture(params: GetEmailIdentityPoliciesRequest): Future[GetEmailIdentityPoliciesResponse] = service.getEmailIdentityPolicies(params).promise().toFuture
    @inline def getEmailTemplateFuture(params: GetEmailTemplateRequest): Future[GetEmailTemplateResponse] = service.getEmailTemplate(params).promise().toFuture
    @inline def getImportJobFuture(params: GetImportJobRequest): Future[GetImportJobResponse] = service.getImportJob(params).promise().toFuture
    @inline def getSuppressedDestinationFuture(params: GetSuppressedDestinationRequest): Future[GetSuppressedDestinationResponse] = service.getSuppressedDestination(params).promise().toFuture
    @inline def listConfigurationSetsFuture(params: ListConfigurationSetsRequest): Future[ListConfigurationSetsResponse] = service.listConfigurationSets(params).promise().toFuture
    @inline def listContactListsFuture(params: ListContactListsRequest): Future[ListContactListsResponse] = service.listContactLists(params).promise().toFuture
    @inline def listContactsFuture(params: ListContactsRequest): Future[ListContactsResponse] = service.listContacts(params).promise().toFuture
    @inline def listCustomVerificationEmailTemplatesFuture(params: ListCustomVerificationEmailTemplatesRequest): Future[ListCustomVerificationEmailTemplatesResponse] = service.listCustomVerificationEmailTemplates(params).promise().toFuture
    @inline def listDedicatedIpPoolsFuture(params: ListDedicatedIpPoolsRequest): Future[ListDedicatedIpPoolsResponse] = service.listDedicatedIpPools(params).promise().toFuture
    @inline def listDeliverabilityTestReportsFuture(params: ListDeliverabilityTestReportsRequest): Future[ListDeliverabilityTestReportsResponse] = service.listDeliverabilityTestReports(params).promise().toFuture
    @inline def listDomainDeliverabilityCampaignsFuture(params: ListDomainDeliverabilityCampaignsRequest): Future[ListDomainDeliverabilityCampaignsResponse] = service.listDomainDeliverabilityCampaigns(params).promise().toFuture
    @inline def listEmailIdentitiesFuture(params: ListEmailIdentitiesRequest): Future[ListEmailIdentitiesResponse] = service.listEmailIdentities(params).promise().toFuture
    @inline def listEmailTemplatesFuture(params: ListEmailTemplatesRequest): Future[ListEmailTemplatesResponse] = service.listEmailTemplates(params).promise().toFuture
    @inline def listImportJobsFuture(params: ListImportJobsRequest): Future[ListImportJobsResponse] = service.listImportJobs(params).promise().toFuture
    @inline def listRecommendationsFuture(params: ListRecommendationsRequest): Future[ListRecommendationsResponse] = service.listRecommendations(params).promise().toFuture
    @inline def listSuppressedDestinationsFuture(params: ListSuppressedDestinationsRequest): Future[ListSuppressedDestinationsResponse] = service.listSuppressedDestinations(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] = service.listTagsForResource(params).promise().toFuture
    @inline def putAccountDedicatedIpWarmupAttributesFuture(params: PutAccountDedicatedIpWarmupAttributesRequest): Future[PutAccountDedicatedIpWarmupAttributesResponse] = service.putAccountDedicatedIpWarmupAttributes(params).promise().toFuture
    @inline def putAccountDetailsFuture(params: PutAccountDetailsRequest): Future[PutAccountDetailsResponse] = service.putAccountDetails(params).promise().toFuture
    @inline def putAccountSendingAttributesFuture(params: PutAccountSendingAttributesRequest): Future[PutAccountSendingAttributesResponse] = service.putAccountSendingAttributes(params).promise().toFuture
    @inline def putAccountSuppressionAttributesFuture(params: PutAccountSuppressionAttributesRequest): Future[PutAccountSuppressionAttributesResponse] = service.putAccountSuppressionAttributes(params).promise().toFuture
    @inline def putAccountVdmAttributesFuture(params: PutAccountVdmAttributesRequest): Future[PutAccountVdmAttributesResponse] = service.putAccountVdmAttributes(params).promise().toFuture
    @inline def putConfigurationSetDeliveryOptionsFuture(params: PutConfigurationSetDeliveryOptionsRequest): Future[PutConfigurationSetDeliveryOptionsResponse] = service.putConfigurationSetDeliveryOptions(params).promise().toFuture
    @inline def putConfigurationSetReputationOptionsFuture(params: PutConfigurationSetReputationOptionsRequest): Future[PutConfigurationSetReputationOptionsResponse] = service.putConfigurationSetReputationOptions(params).promise().toFuture
    @inline def putConfigurationSetSendingOptionsFuture(params: PutConfigurationSetSendingOptionsRequest): Future[PutConfigurationSetSendingOptionsResponse] = service.putConfigurationSetSendingOptions(params).promise().toFuture
    @inline def putConfigurationSetSuppressionOptionsFuture(params: PutConfigurationSetSuppressionOptionsRequest): Future[PutConfigurationSetSuppressionOptionsResponse] = service.putConfigurationSetSuppressionOptions(params).promise().toFuture
    @inline def putConfigurationSetTrackingOptionsFuture(params: PutConfigurationSetTrackingOptionsRequest): Future[PutConfigurationSetTrackingOptionsResponse] = service.putConfigurationSetTrackingOptions(params).promise().toFuture
    @inline def putConfigurationSetVdmOptionsFuture(params: PutConfigurationSetVdmOptionsRequest): Future[PutConfigurationSetVdmOptionsResponse] = service.putConfigurationSetVdmOptions(params).promise().toFuture
    @inline def putDedicatedIpInPoolFuture(params: PutDedicatedIpInPoolRequest): Future[PutDedicatedIpInPoolResponse] = service.putDedicatedIpInPool(params).promise().toFuture
    @inline def putDedicatedIpWarmupAttributesFuture(params: PutDedicatedIpWarmupAttributesRequest): Future[PutDedicatedIpWarmupAttributesResponse] = service.putDedicatedIpWarmupAttributes(params).promise().toFuture
    @inline def putDeliverabilityDashboardOptionFuture(params: PutDeliverabilityDashboardOptionRequest): Future[PutDeliverabilityDashboardOptionResponse] = service.putDeliverabilityDashboardOption(params).promise().toFuture
    @inline def putEmailIdentityConfigurationSetAttributesFuture(params: PutEmailIdentityConfigurationSetAttributesRequest): Future[PutEmailIdentityConfigurationSetAttributesResponse] = service.putEmailIdentityConfigurationSetAttributes(params).promise().toFuture
    @inline def putEmailIdentityDkimAttributesFuture(params: PutEmailIdentityDkimAttributesRequest): Future[PutEmailIdentityDkimAttributesResponse] = service.putEmailIdentityDkimAttributes(params).promise().toFuture
    @inline def putEmailIdentityDkimSigningAttributesFuture(params: PutEmailIdentityDkimSigningAttributesRequest): Future[PutEmailIdentityDkimSigningAttributesResponse] = service.putEmailIdentityDkimSigningAttributes(params).promise().toFuture
    @inline def putEmailIdentityFeedbackAttributesFuture(params: PutEmailIdentityFeedbackAttributesRequest): Future[PutEmailIdentityFeedbackAttributesResponse] = service.putEmailIdentityFeedbackAttributes(params).promise().toFuture
    @inline def putEmailIdentityMailFromAttributesFuture(params: PutEmailIdentityMailFromAttributesRequest): Future[PutEmailIdentityMailFromAttributesResponse] = service.putEmailIdentityMailFromAttributes(params).promise().toFuture
    @inline def putSuppressedDestinationFuture(params: PutSuppressedDestinationRequest): Future[PutSuppressedDestinationResponse] = service.putSuppressedDestination(params).promise().toFuture
    @inline def sendBulkEmailFuture(params: SendBulkEmailRequest): Future[SendBulkEmailResponse] = service.sendBulkEmail(params).promise().toFuture
    @inline def sendCustomVerificationEmailFuture(params: SendCustomVerificationEmailRequest): Future[SendCustomVerificationEmailResponse] = service.sendCustomVerificationEmail(params).promise().toFuture
    @inline def sendEmailFuture(params: SendEmailRequest): Future[SendEmailResponse] = service.sendEmail(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] = service.tagResource(params).promise().toFuture
    @inline def testRenderEmailTemplateFuture(params: TestRenderEmailTemplateRequest): Future[TestRenderEmailTemplateResponse] = service.testRenderEmailTemplate(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] = service.untagResource(params).promise().toFuture
    @inline def updateConfigurationSetEventDestinationFuture(params: UpdateConfigurationSetEventDestinationRequest): Future[UpdateConfigurationSetEventDestinationResponse] = service.updateConfigurationSetEventDestination(params).promise().toFuture
    @inline def updateContactFuture(params: UpdateContactRequest): Future[UpdateContactResponse] = service.updateContact(params).promise().toFuture
    @inline def updateContactListFuture(params: UpdateContactListRequest): Future[UpdateContactListResponse] = service.updateContactList(params).promise().toFuture
    @inline def updateCustomVerificationEmailTemplateFuture(params: UpdateCustomVerificationEmailTemplateRequest): Future[UpdateCustomVerificationEmailTemplateResponse] = service.updateCustomVerificationEmailTemplate(params).promise().toFuture
    @inline def updateEmailIdentityPolicyFuture(params: UpdateEmailIdentityPolicyRequest): Future[UpdateEmailIdentityPolicyResponse] = service.updateEmailIdentityPolicy(params).promise().toFuture
    @inline def updateEmailTemplateFuture(params: UpdateEmailTemplateRequest): Future[UpdateEmailTemplateResponse] = service.updateEmailTemplate(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/sesv2", JSImport.Namespace, "AWS.SESV2")
  class SESv2() extends js.Object {
    def this(config: AWSConfig) = this()

    def batchGetMetricData(params: BatchGetMetricDataRequest): Request[BatchGetMetricDataResponse] = js.native
    def createConfigurationSet(params: CreateConfigurationSetRequest): Request[CreateConfigurationSetResponse] = js.native
    def createConfigurationSetEventDestination(params: CreateConfigurationSetEventDestinationRequest): Request[CreateConfigurationSetEventDestinationResponse] = js.native
    def createContact(params: CreateContactRequest): Request[CreateContactResponse] = js.native
    def createContactList(params: CreateContactListRequest): Request[CreateContactListResponse] = js.native
    def createCustomVerificationEmailTemplate(params: CreateCustomVerificationEmailTemplateRequest): Request[CreateCustomVerificationEmailTemplateResponse] = js.native
    def createDedicatedIpPool(params: CreateDedicatedIpPoolRequest): Request[CreateDedicatedIpPoolResponse] = js.native
    def createDeliverabilityTestReport(params: CreateDeliverabilityTestReportRequest): Request[CreateDeliverabilityTestReportResponse] = js.native
    def createEmailIdentity(params: CreateEmailIdentityRequest): Request[CreateEmailIdentityResponse] = js.native
    def createEmailIdentityPolicy(params: CreateEmailIdentityPolicyRequest): Request[CreateEmailIdentityPolicyResponse] = js.native
    def createEmailTemplate(params: CreateEmailTemplateRequest): Request[CreateEmailTemplateResponse] = js.native
    def createImportJob(params: CreateImportJobRequest): Request[CreateImportJobResponse] = js.native
    def deleteConfigurationSet(params: DeleteConfigurationSetRequest): Request[DeleteConfigurationSetResponse] = js.native
    def deleteConfigurationSetEventDestination(params: DeleteConfigurationSetEventDestinationRequest): Request[DeleteConfigurationSetEventDestinationResponse] = js.native
    def deleteContact(params: DeleteContactRequest): Request[DeleteContactResponse] = js.native
    def deleteContactList(params: DeleteContactListRequest): Request[DeleteContactListResponse] = js.native
    def deleteCustomVerificationEmailTemplate(params: DeleteCustomVerificationEmailTemplateRequest): Request[DeleteCustomVerificationEmailTemplateResponse] = js.native
    def deleteDedicatedIpPool(params: DeleteDedicatedIpPoolRequest): Request[DeleteDedicatedIpPoolResponse] = js.native
    def deleteEmailIdentity(params: DeleteEmailIdentityRequest): Request[DeleteEmailIdentityResponse] = js.native
    def deleteEmailIdentityPolicy(params: DeleteEmailIdentityPolicyRequest): Request[DeleteEmailIdentityPolicyResponse] = js.native
    def deleteEmailTemplate(params: DeleteEmailTemplateRequest): Request[DeleteEmailTemplateResponse] = js.native
    def deleteSuppressedDestination(params: DeleteSuppressedDestinationRequest): Request[DeleteSuppressedDestinationResponse] = js.native
    def getAccount(params: GetAccountRequest): Request[GetAccountResponse] = js.native
    def getBlacklistReports(params: GetBlacklistReportsRequest): Request[GetBlacklistReportsResponse] = js.native
    def getConfigurationSet(params: GetConfigurationSetRequest): Request[GetConfigurationSetResponse] = js.native
    def getConfigurationSetEventDestinations(params: GetConfigurationSetEventDestinationsRequest): Request[GetConfigurationSetEventDestinationsResponse] = js.native
    def getContact(params: GetContactRequest): Request[GetContactResponse] = js.native
    def getContactList(params: GetContactListRequest): Request[GetContactListResponse] = js.native
    def getCustomVerificationEmailTemplate(params: GetCustomVerificationEmailTemplateRequest): Request[GetCustomVerificationEmailTemplateResponse] = js.native
    def getDedicatedIp(params: GetDedicatedIpRequest): Request[GetDedicatedIpResponse] = js.native
    def getDedicatedIpPool(params: GetDedicatedIpPoolRequest): Request[GetDedicatedIpPoolResponse] = js.native
    def getDedicatedIps(params: GetDedicatedIpsRequest): Request[GetDedicatedIpsResponse] = js.native
    def getDeliverabilityDashboardOptions(params: GetDeliverabilityDashboardOptionsRequest): Request[GetDeliverabilityDashboardOptionsResponse] = js.native
    def getDeliverabilityTestReport(params: GetDeliverabilityTestReportRequest): Request[GetDeliverabilityTestReportResponse] = js.native
    def getDomainDeliverabilityCampaign(params: GetDomainDeliverabilityCampaignRequest): Request[GetDomainDeliverabilityCampaignResponse] = js.native
    def getDomainStatisticsReport(params: GetDomainStatisticsReportRequest): Request[GetDomainStatisticsReportResponse] = js.native
    def getEmailIdentity(params: GetEmailIdentityRequest): Request[GetEmailIdentityResponse] = js.native
    def getEmailIdentityPolicies(params: GetEmailIdentityPoliciesRequest): Request[GetEmailIdentityPoliciesResponse] = js.native
    def getEmailTemplate(params: GetEmailTemplateRequest): Request[GetEmailTemplateResponse] = js.native
    def getImportJob(params: GetImportJobRequest): Request[GetImportJobResponse] = js.native
    def getSuppressedDestination(params: GetSuppressedDestinationRequest): Request[GetSuppressedDestinationResponse] = js.native
    def listConfigurationSets(params: ListConfigurationSetsRequest): Request[ListConfigurationSetsResponse] = js.native
    def listContactLists(params: ListContactListsRequest): Request[ListContactListsResponse] = js.native
    def listContacts(params: ListContactsRequest): Request[ListContactsResponse] = js.native
    def listCustomVerificationEmailTemplates(params: ListCustomVerificationEmailTemplatesRequest): Request[ListCustomVerificationEmailTemplatesResponse] = js.native
    def listDedicatedIpPools(params: ListDedicatedIpPoolsRequest): Request[ListDedicatedIpPoolsResponse] = js.native
    def listDeliverabilityTestReports(params: ListDeliverabilityTestReportsRequest): Request[ListDeliverabilityTestReportsResponse] = js.native
    def listDomainDeliverabilityCampaigns(params: ListDomainDeliverabilityCampaignsRequest): Request[ListDomainDeliverabilityCampaignsResponse] = js.native
    def listEmailIdentities(params: ListEmailIdentitiesRequest): Request[ListEmailIdentitiesResponse] = js.native
    def listEmailTemplates(params: ListEmailTemplatesRequest): Request[ListEmailTemplatesResponse] = js.native
    def listImportJobs(params: ListImportJobsRequest): Request[ListImportJobsResponse] = js.native
    def listRecommendations(params: ListRecommendationsRequest): Request[ListRecommendationsResponse] = js.native
    def listSuppressedDestinations(params: ListSuppressedDestinationsRequest): Request[ListSuppressedDestinationsResponse] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def putAccountDedicatedIpWarmupAttributes(params: PutAccountDedicatedIpWarmupAttributesRequest): Request[PutAccountDedicatedIpWarmupAttributesResponse] = js.native
    def putAccountDetails(params: PutAccountDetailsRequest): Request[PutAccountDetailsResponse] = js.native
    def putAccountSendingAttributes(params: PutAccountSendingAttributesRequest): Request[PutAccountSendingAttributesResponse] = js.native
    def putAccountSuppressionAttributes(params: PutAccountSuppressionAttributesRequest): Request[PutAccountSuppressionAttributesResponse] = js.native
    def putAccountVdmAttributes(params: PutAccountVdmAttributesRequest): Request[PutAccountVdmAttributesResponse] = js.native
    def putConfigurationSetDeliveryOptions(params: PutConfigurationSetDeliveryOptionsRequest): Request[PutConfigurationSetDeliveryOptionsResponse] = js.native
    def putConfigurationSetReputationOptions(params: PutConfigurationSetReputationOptionsRequest): Request[PutConfigurationSetReputationOptionsResponse] = js.native
    def putConfigurationSetSendingOptions(params: PutConfigurationSetSendingOptionsRequest): Request[PutConfigurationSetSendingOptionsResponse] = js.native
    def putConfigurationSetSuppressionOptions(params: PutConfigurationSetSuppressionOptionsRequest): Request[PutConfigurationSetSuppressionOptionsResponse] = js.native
    def putConfigurationSetTrackingOptions(params: PutConfigurationSetTrackingOptionsRequest): Request[PutConfigurationSetTrackingOptionsResponse] = js.native
    def putConfigurationSetVdmOptions(params: PutConfigurationSetVdmOptionsRequest): Request[PutConfigurationSetVdmOptionsResponse] = js.native
    def putDedicatedIpInPool(params: PutDedicatedIpInPoolRequest): Request[PutDedicatedIpInPoolResponse] = js.native
    def putDedicatedIpWarmupAttributes(params: PutDedicatedIpWarmupAttributesRequest): Request[PutDedicatedIpWarmupAttributesResponse] = js.native
    def putDeliverabilityDashboardOption(params: PutDeliverabilityDashboardOptionRequest): Request[PutDeliverabilityDashboardOptionResponse] = js.native
    def putEmailIdentityConfigurationSetAttributes(params: PutEmailIdentityConfigurationSetAttributesRequest): Request[PutEmailIdentityConfigurationSetAttributesResponse] = js.native
    def putEmailIdentityDkimAttributes(params: PutEmailIdentityDkimAttributesRequest): Request[PutEmailIdentityDkimAttributesResponse] = js.native
    def putEmailIdentityDkimSigningAttributes(params: PutEmailIdentityDkimSigningAttributesRequest): Request[PutEmailIdentityDkimSigningAttributesResponse] = js.native
    def putEmailIdentityFeedbackAttributes(params: PutEmailIdentityFeedbackAttributesRequest): Request[PutEmailIdentityFeedbackAttributesResponse] = js.native
    def putEmailIdentityMailFromAttributes(params: PutEmailIdentityMailFromAttributesRequest): Request[PutEmailIdentityMailFromAttributesResponse] = js.native
    def putSuppressedDestination(params: PutSuppressedDestinationRequest): Request[PutSuppressedDestinationResponse] = js.native
    def sendBulkEmail(params: SendBulkEmailRequest): Request[SendBulkEmailResponse] = js.native
    def sendCustomVerificationEmail(params: SendCustomVerificationEmailRequest): Request[SendCustomVerificationEmailResponse] = js.native
    def sendEmail(params: SendEmailRequest): Request[SendEmailResponse] = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse] = js.native
    def testRenderEmailTemplate(params: TestRenderEmailTemplateRequest): Request[TestRenderEmailTemplateResponse] = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse] = js.native
    def updateConfigurationSetEventDestination(params: UpdateConfigurationSetEventDestinationRequest): Request[UpdateConfigurationSetEventDestinationResponse] = js.native
    def updateContact(params: UpdateContactRequest): Request[UpdateContactResponse] = js.native
    def updateContactList(params: UpdateContactListRequest): Request[UpdateContactListResponse] = js.native
    def updateCustomVerificationEmailTemplate(params: UpdateCustomVerificationEmailTemplateRequest): Request[UpdateCustomVerificationEmailTemplateResponse] = js.native
    def updateEmailIdentityPolicy(params: UpdateEmailIdentityPolicyRequest): Request[UpdateEmailIdentityPolicyResponse] = js.native
    def updateEmailTemplate(params: UpdateEmailTemplateRequest): Request[UpdateEmailTemplateResponse] = js.native
  }
  object SESv2 {
    @inline implicit def toOps(service: SESv2): SESv2Ops = {
      new SESv2Ops(service)
    }
  }

  /** An object that contains information about your account details.
    */
  @js.native
  trait AccountDetails extends js.Object {
    var AdditionalContactEmailAddresses: js.UndefOr[AdditionalContactEmailAddresses]
    var ContactLanguage: js.UndefOr[ContactLanguage]
    var MailType: js.UndefOr[MailType]
    var ReviewDetails: js.UndefOr[ReviewDetails]
    var UseCaseDescription: js.UndefOr[UseCaseDescription]
    var WebsiteURL: js.UndefOr[WebsiteURL]
  }

  object AccountDetails {
    @inline
    def apply(
        AdditionalContactEmailAddresses: js.UndefOr[AdditionalContactEmailAddresses] = js.undefined,
        ContactLanguage: js.UndefOr[ContactLanguage] = js.undefined,
        MailType: js.UndefOr[MailType] = js.undefined,
        ReviewDetails: js.UndefOr[ReviewDetails] = js.undefined,
        UseCaseDescription: js.UndefOr[UseCaseDescription] = js.undefined,
        WebsiteURL: js.UndefOr[WebsiteURL] = js.undefined
    ): AccountDetails = {
      val __obj = js.Dynamic.literal()
      AdditionalContactEmailAddresses.foreach(__v => __obj.updateDynamic("AdditionalContactEmailAddresses")(__v.asInstanceOf[js.Any]))
      ContactLanguage.foreach(__v => __obj.updateDynamic("ContactLanguage")(__v.asInstanceOf[js.Any]))
      MailType.foreach(__v => __obj.updateDynamic("MailType")(__v.asInstanceOf[js.Any]))
      ReviewDetails.foreach(__v => __obj.updateDynamic("ReviewDetails")(__v.asInstanceOf[js.Any]))
      UseCaseDescription.foreach(__v => __obj.updateDynamic("UseCaseDescription")(__v.asInstanceOf[js.Any]))
      WebsiteURL.foreach(__v => __obj.updateDynamic("WebsiteURL")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AccountDetails]
    }
  }

  /** Represents a single metric data query to include in a batch.
    */
  @js.native
  trait BatchGetMetricDataQuery extends js.Object {
    var EndDate: Timestamp
    var Id: QueryIdentifier
    var Metric: Metric
    var Namespace: MetricNamespace
    var StartDate: Timestamp
    var Dimensions: js.UndefOr[Dimensions]
  }

  object BatchGetMetricDataQuery {
    @inline
    def apply(
        EndDate: Timestamp,
        Id: QueryIdentifier,
        Metric: Metric,
        Namespace: MetricNamespace,
        StartDate: Timestamp,
        Dimensions: js.UndefOr[Dimensions] = js.undefined
    ): BatchGetMetricDataQuery = {
      val __obj = js.Dynamic.literal(
        "EndDate" -> EndDate.asInstanceOf[js.Any],
        "Id" -> Id.asInstanceOf[js.Any],
        "Metric" -> Metric.asInstanceOf[js.Any],
        "Namespace" -> Namespace.asInstanceOf[js.Any],
        "StartDate" -> StartDate.asInstanceOf[js.Any]
      )

      Dimensions.foreach(__v => __obj.updateDynamic("Dimensions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchGetMetricDataQuery]
    }
  }

  /** Represents a request to retrieve a batch of metric data.
    */
  @js.native
  trait BatchGetMetricDataRequest extends js.Object {
    var Queries: BatchGetMetricDataQueries
  }

  object BatchGetMetricDataRequest {
    @inline
    def apply(
        Queries: BatchGetMetricDataQueries
    ): BatchGetMetricDataRequest = {
      val __obj = js.Dynamic.literal(
        "Queries" -> Queries.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[BatchGetMetricDataRequest]
    }
  }

  /** Represents the result of processing your metric data batch request
    */
  @js.native
  trait BatchGetMetricDataResponse extends js.Object {
    var Errors: js.UndefOr[MetricDataErrorList]
    var Results: js.UndefOr[MetricDataResultList]
  }

  object BatchGetMetricDataResponse {
    @inline
    def apply(
        Errors: js.UndefOr[MetricDataErrorList] = js.undefined,
        Results: js.UndefOr[MetricDataResultList] = js.undefined
    ): BatchGetMetricDataResponse = {
      val __obj = js.Dynamic.literal()
      Errors.foreach(__v => __obj.updateDynamic("Errors")(__v.asInstanceOf[js.Any]))
      Results.foreach(__v => __obj.updateDynamic("Results")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchGetMetricDataResponse]
    }
  }

  /** An object that contains information about a blacklisting event that impacts one of the dedicated IP addresses that is associated with your account.
    */
  @js.native
  trait BlacklistEntry extends js.Object {
    var Description: js.UndefOr[BlacklistingDescription]
    var ListingTime: js.UndefOr[Timestamp]
    var RblName: js.UndefOr[RblName]
  }

  object BlacklistEntry {
    @inline
    def apply(
        Description: js.UndefOr[BlacklistingDescription] = js.undefined,
        ListingTime: js.UndefOr[Timestamp] = js.undefined,
        RblName: js.UndefOr[RblName] = js.undefined
    ): BlacklistEntry = {
      val __obj = js.Dynamic.literal()
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      ListingTime.foreach(__v => __obj.updateDynamic("ListingTime")(__v.asInstanceOf[js.Any]))
      RblName.foreach(__v => __obj.updateDynamic("RblName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BlacklistEntry]
    }
  }

  /** Represents the body of the email message.
    */
  @js.native
  trait Body extends js.Object {
    var Html: js.UndefOr[Content]
    var Text: js.UndefOr[Content]
  }

  object Body {
    @inline
    def apply(
        Html: js.UndefOr[Content] = js.undefined,
        Text: js.UndefOr[Content] = js.undefined
    ): Body = {
      val __obj = js.Dynamic.literal()
      Html.foreach(__v => __obj.updateDynamic("Html")(__v.asInstanceOf[js.Any]))
      Text.foreach(__v => __obj.updateDynamic("Text")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Body]
    }
  }

  /** An object that contains the body of the message. You can specify a template message.
    */
  @js.native
  trait BulkEmailContent extends js.Object {
    var Template: js.UndefOr[Template]
  }

  object BulkEmailContent {
    @inline
    def apply(
        Template: js.UndefOr[Template] = js.undefined
    ): BulkEmailContent = {
      val __obj = js.Dynamic.literal()
      Template.foreach(__v => __obj.updateDynamic("Template")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BulkEmailContent]
    }
  }

  @js.native
  trait BulkEmailEntry extends js.Object {
    var Destination: Destination
    var ReplacementEmailContent: js.UndefOr[ReplacementEmailContent]
    var ReplacementTags: js.UndefOr[MessageTagList]
  }

  object BulkEmailEntry {
    @inline
    def apply(
        Destination: Destination,
        ReplacementEmailContent: js.UndefOr[ReplacementEmailContent] = js.undefined,
        ReplacementTags: js.UndefOr[MessageTagList] = js.undefined
    ): BulkEmailEntry = {
      val __obj = js.Dynamic.literal(
        "Destination" -> Destination.asInstanceOf[js.Any]
      )

      ReplacementEmailContent.foreach(__v => __obj.updateDynamic("ReplacementEmailContent")(__v.asInstanceOf[js.Any]))
      ReplacementTags.foreach(__v => __obj.updateDynamic("ReplacementTags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BulkEmailEntry]
    }
  }

  /** The result of the <code>SendBulkEmail</code> operation of each specified <code>BulkEmailEntry</code>.
    */
  @js.native
  trait BulkEmailEntryResult extends js.Object {
    var Error: js.UndefOr[ErrorMessage]
    var MessageId: js.UndefOr[OutboundMessageId]
    var Status: js.UndefOr[BulkEmailStatus]
  }

  object BulkEmailEntryResult {
    @inline
    def apply(
        Error: js.UndefOr[ErrorMessage] = js.undefined,
        MessageId: js.UndefOr[OutboundMessageId] = js.undefined,
        Status: js.UndefOr[BulkEmailStatus] = js.undefined
    ): BulkEmailEntryResult = {
      val __obj = js.Dynamic.literal()
      Error.foreach(__v => __obj.updateDynamic("Error")(__v.asInstanceOf[js.Any]))
      MessageId.foreach(__v => __obj.updateDynamic("MessageId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BulkEmailEntryResult]
    }
  }

  /** An object that defines an Amazon CloudWatch destination for email events. You can use Amazon CloudWatch to monitor and gain insights on your email sending metrics.
    */
  @js.native
  trait CloudWatchDestination extends js.Object {
    var DimensionConfigurations: CloudWatchDimensionConfigurations
  }

  object CloudWatchDestination {
    @inline
    def apply(
        DimensionConfigurations: CloudWatchDimensionConfigurations
    ): CloudWatchDestination = {
      val __obj = js.Dynamic.literal(
        "DimensionConfigurations" -> DimensionConfigurations.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CloudWatchDestination]
    }
  }

  /** An object that defines the dimension configuration to use when you send email events to Amazon CloudWatch.
    */
  @js.native
  trait CloudWatchDimensionConfiguration extends js.Object {
    var DefaultDimensionValue: DefaultDimensionValue
    var DimensionName: DimensionName
    var DimensionValueSource: DimensionValueSource
  }

  object CloudWatchDimensionConfiguration {
    @inline
    def apply(
        DefaultDimensionValue: DefaultDimensionValue,
        DimensionName: DimensionName,
        DimensionValueSource: DimensionValueSource
    ): CloudWatchDimensionConfiguration = {
      val __obj = js.Dynamic.literal(
        "DefaultDimensionValue" -> DefaultDimensionValue.asInstanceOf[js.Any],
        "DimensionName" -> DimensionName.asInstanceOf[js.Any],
        "DimensionValueSource" -> DimensionValueSource.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CloudWatchDimensionConfiguration]
    }
  }

  /** A contact is the end-user who is receiving the email.
    */
  @js.native
  trait Contact extends js.Object {
    var EmailAddress: js.UndefOr[EmailAddress]
    var LastUpdatedTimestamp: js.UndefOr[Timestamp]
    var TopicDefaultPreferences: js.UndefOr[TopicPreferenceList]
    var TopicPreferences: js.UndefOr[TopicPreferenceList]
    var UnsubscribeAll: js.UndefOr[UnsubscribeAll]
  }

  object Contact {
    @inline
    def apply(
        EmailAddress: js.UndefOr[EmailAddress] = js.undefined,
        LastUpdatedTimestamp: js.UndefOr[Timestamp] = js.undefined,
        TopicDefaultPreferences: js.UndefOr[TopicPreferenceList] = js.undefined,
        TopicPreferences: js.UndefOr[TopicPreferenceList] = js.undefined,
        UnsubscribeAll: js.UndefOr[UnsubscribeAll] = js.undefined
    ): Contact = {
      val __obj = js.Dynamic.literal()
      EmailAddress.foreach(__v => __obj.updateDynamic("EmailAddress")(__v.asInstanceOf[js.Any]))
      LastUpdatedTimestamp.foreach(__v => __obj.updateDynamic("LastUpdatedTimestamp")(__v.asInstanceOf[js.Any]))
      TopicDefaultPreferences.foreach(__v => __obj.updateDynamic("TopicDefaultPreferences")(__v.asInstanceOf[js.Any]))
      TopicPreferences.foreach(__v => __obj.updateDynamic("TopicPreferences")(__v.asInstanceOf[js.Any]))
      UnsubscribeAll.foreach(__v => __obj.updateDynamic("UnsubscribeAll")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Contact]
    }
  }

  /** A list that contains contacts that have subscribed to a particular topic or topics.
    */
  @js.native
  trait ContactList extends js.Object {
    var ContactListName: js.UndefOr[ContactListName]
    var LastUpdatedTimestamp: js.UndefOr[Timestamp]
  }

  object ContactList {
    @inline
    def apply(
        ContactListName: js.UndefOr[ContactListName] = js.undefined,
        LastUpdatedTimestamp: js.UndefOr[Timestamp] = js.undefined
    ): ContactList = {
      val __obj = js.Dynamic.literal()
      ContactListName.foreach(__v => __obj.updateDynamic("ContactListName")(__v.asInstanceOf[js.Any]))
      LastUpdatedTimestamp.foreach(__v => __obj.updateDynamic("LastUpdatedTimestamp")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ContactList]
    }
  }

  /** An object that contains details about the action of a contact list.
    */
  @js.native
  trait ContactListDestination extends js.Object {
    var ContactListImportAction: ContactListImportAction
    var ContactListName: ContactListName
  }

  object ContactListDestination {
    @inline
    def apply(
        ContactListImportAction: ContactListImportAction,
        ContactListName: ContactListName
    ): ContactListDestination = {
      val __obj = js.Dynamic.literal(
        "ContactListImportAction" -> ContactListImportAction.asInstanceOf[js.Any],
        "ContactListName" -> ContactListName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ContactListDestination]
    }
  }

  /** An object that represents the content of the email, and optionally a character set specification.
    */
  @js.native
  trait Content extends js.Object {
    var Data: MessageData
    var Charset: js.UndefOr[Charset]
  }

  object Content {
    @inline
    def apply(
        Data: MessageData,
        Charset: js.UndefOr[Charset] = js.undefined
    ): Content = {
      val __obj = js.Dynamic.literal(
        "Data" -> Data.asInstanceOf[js.Any]
      )

      Charset.foreach(__v => __obj.updateDynamic("Charset")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Content]
    }
  }

  /** A request to add an event destination to a configuration set.
    */
  @js.native
  trait CreateConfigurationSetEventDestinationRequest extends js.Object {
    var ConfigurationSetName: ConfigurationSetName
    var EventDestination: EventDestinationDefinition
    var EventDestinationName: EventDestinationName
  }

  object CreateConfigurationSetEventDestinationRequest {
    @inline
    def apply(
        ConfigurationSetName: ConfigurationSetName,
        EventDestination: EventDestinationDefinition,
        EventDestinationName: EventDestinationName
    ): CreateConfigurationSetEventDestinationRequest = {
      val __obj = js.Dynamic.literal(
        "ConfigurationSetName" -> ConfigurationSetName.asInstanceOf[js.Any],
        "EventDestination" -> EventDestination.asInstanceOf[js.Any],
        "EventDestinationName" -> EventDestinationName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateConfigurationSetEventDestinationRequest]
    }
  }

  /** An HTTP 200 response if the request succeeds, or an error message if the request fails.
    */
  @js.native
  trait CreateConfigurationSetEventDestinationResponse extends js.Object

  object CreateConfigurationSetEventDestinationResponse {
    @inline
    def apply(): CreateConfigurationSetEventDestinationResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateConfigurationSetEventDestinationResponse]
    }
  }

  /** A request to create a configuration set.
    */
  @js.native
  trait CreateConfigurationSetRequest extends js.Object {
    var ConfigurationSetName: ConfigurationSetName
    var DeliveryOptions: js.UndefOr[DeliveryOptions]
    var ReputationOptions: js.UndefOr[ReputationOptions]
    var SendingOptions: js.UndefOr[SendingOptions]
    var SuppressionOptions: js.UndefOr[SuppressionOptions]
    var Tags: js.UndefOr[TagList]
    var TrackingOptions: js.UndefOr[TrackingOptions]
    var VdmOptions: js.UndefOr[VdmOptions]
  }

  object CreateConfigurationSetRequest {
    @inline
    def apply(
        ConfigurationSetName: ConfigurationSetName,
        DeliveryOptions: js.UndefOr[DeliveryOptions] = js.undefined,
        ReputationOptions: js.UndefOr[ReputationOptions] = js.undefined,
        SendingOptions: js.UndefOr[SendingOptions] = js.undefined,
        SuppressionOptions: js.UndefOr[SuppressionOptions] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined,
        TrackingOptions: js.UndefOr[TrackingOptions] = js.undefined,
        VdmOptions: js.UndefOr[VdmOptions] = js.undefined
    ): CreateConfigurationSetRequest = {
      val __obj = js.Dynamic.literal(
        "ConfigurationSetName" -> ConfigurationSetName.asInstanceOf[js.Any]
      )

      DeliveryOptions.foreach(__v => __obj.updateDynamic("DeliveryOptions")(__v.asInstanceOf[js.Any]))
      ReputationOptions.foreach(__v => __obj.updateDynamic("ReputationOptions")(__v.asInstanceOf[js.Any]))
      SendingOptions.foreach(__v => __obj.updateDynamic("SendingOptions")(__v.asInstanceOf[js.Any]))
      SuppressionOptions.foreach(__v => __obj.updateDynamic("SuppressionOptions")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      TrackingOptions.foreach(__v => __obj.updateDynamic("TrackingOptions")(__v.asInstanceOf[js.Any]))
      VdmOptions.foreach(__v => __obj.updateDynamic("VdmOptions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateConfigurationSetRequest]
    }
  }

  /** An HTTP 200 response if the request succeeds, or an error message if the request fails.
    */
  @js.native
  trait CreateConfigurationSetResponse extends js.Object

  object CreateConfigurationSetResponse {
    @inline
    def apply(): CreateConfigurationSetResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateConfigurationSetResponse]
    }
  }

  @js.native
  trait CreateContactListRequest extends js.Object {
    var ContactListName: ContactListName
    var Description: js.UndefOr[Description]
    var Tags: js.UndefOr[TagList]
    var Topics: js.UndefOr[Topics]
  }

  object CreateContactListRequest {
    @inline
    def apply(
        ContactListName: ContactListName,
        Description: js.UndefOr[Description] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined,
        Topics: js.UndefOr[Topics] = js.undefined
    ): CreateContactListRequest = {
      val __obj = js.Dynamic.literal(
        "ContactListName" -> ContactListName.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      Topics.foreach(__v => __obj.updateDynamic("Topics")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateContactListRequest]
    }
  }

  @js.native
  trait CreateContactListResponse extends js.Object

  object CreateContactListResponse {
    @inline
    def apply(): CreateContactListResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateContactListResponse]
    }
  }

  @js.native
  trait CreateContactRequest extends js.Object {
    var ContactListName: ContactListName
    var EmailAddress: EmailAddress
    var AttributesData: js.UndefOr[AttributesData]
    var TopicPreferences: js.UndefOr[TopicPreferenceList]
    var UnsubscribeAll: js.UndefOr[UnsubscribeAll]
  }

  object CreateContactRequest {
    @inline
    def apply(
        ContactListName: ContactListName,
        EmailAddress: EmailAddress,
        AttributesData: js.UndefOr[AttributesData] = js.undefined,
        TopicPreferences: js.UndefOr[TopicPreferenceList] = js.undefined,
        UnsubscribeAll: js.UndefOr[UnsubscribeAll] = js.undefined
    ): CreateContactRequest = {
      val __obj = js.Dynamic.literal(
        "ContactListName" -> ContactListName.asInstanceOf[js.Any],
        "EmailAddress" -> EmailAddress.asInstanceOf[js.Any]
      )

      AttributesData.foreach(__v => __obj.updateDynamic("AttributesData")(__v.asInstanceOf[js.Any]))
      TopicPreferences.foreach(__v => __obj.updateDynamic("TopicPreferences")(__v.asInstanceOf[js.Any]))
      UnsubscribeAll.foreach(__v => __obj.updateDynamic("UnsubscribeAll")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateContactRequest]
    }
  }

  @js.native
  trait CreateContactResponse extends js.Object

  object CreateContactResponse {
    @inline
    def apply(): CreateContactResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateContactResponse]
    }
  }

  /** Represents a request to create a custom verification email template.
    */
  @js.native
  trait CreateCustomVerificationEmailTemplateRequest extends js.Object {
    var FailureRedirectionURL: FailureRedirectionURL
    var FromEmailAddress: EmailAddress
    var SuccessRedirectionURL: SuccessRedirectionURL
    var TemplateContent: TemplateContent
    var TemplateName: EmailTemplateName
    var TemplateSubject: EmailTemplateSubject
  }

  object CreateCustomVerificationEmailTemplateRequest {
    @inline
    def apply(
        FailureRedirectionURL: FailureRedirectionURL,
        FromEmailAddress: EmailAddress,
        SuccessRedirectionURL: SuccessRedirectionURL,
        TemplateContent: TemplateContent,
        TemplateName: EmailTemplateName,
        TemplateSubject: EmailTemplateSubject
    ): CreateCustomVerificationEmailTemplateRequest = {
      val __obj = js.Dynamic.literal(
        "FailureRedirectionURL" -> FailureRedirectionURL.asInstanceOf[js.Any],
        "FromEmailAddress" -> FromEmailAddress.asInstanceOf[js.Any],
        "SuccessRedirectionURL" -> SuccessRedirectionURL.asInstanceOf[js.Any],
        "TemplateContent" -> TemplateContent.asInstanceOf[js.Any],
        "TemplateName" -> TemplateName.asInstanceOf[js.Any],
        "TemplateSubject" -> TemplateSubject.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateCustomVerificationEmailTemplateRequest]
    }
  }

  /** If the action is successful, the service sends back an HTTP 200 response with an empty HTTP body.
    */
  @js.native
  trait CreateCustomVerificationEmailTemplateResponse extends js.Object

  object CreateCustomVerificationEmailTemplateResponse {
    @inline
    def apply(): CreateCustomVerificationEmailTemplateResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateCustomVerificationEmailTemplateResponse]
    }
  }

  /** A request to create a new dedicated IP pool.
    */
  @js.native
  trait CreateDedicatedIpPoolRequest extends js.Object {
    var PoolName: PoolName
    var ScalingMode: js.UndefOr[ScalingMode]
    var Tags: js.UndefOr[TagList]
  }

  object CreateDedicatedIpPoolRequest {
    @inline
    def apply(
        PoolName: PoolName,
        ScalingMode: js.UndefOr[ScalingMode] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateDedicatedIpPoolRequest = {
      val __obj = js.Dynamic.literal(
        "PoolName" -> PoolName.asInstanceOf[js.Any]
      )

      ScalingMode.foreach(__v => __obj.updateDynamic("ScalingMode")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDedicatedIpPoolRequest]
    }
  }

  /** An HTTP 200 response if the request succeeds, or an error message if the request fails.
    */
  @js.native
  trait CreateDedicatedIpPoolResponse extends js.Object

  object CreateDedicatedIpPoolResponse {
    @inline
    def apply(): CreateDedicatedIpPoolResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateDedicatedIpPoolResponse]
    }
  }

  /** A request to perform a predictive inbox placement test. Predictive inbox placement tests can help you predict how your messages will be handled by various email providers around the world. When you perform a predictive inbox placement test, you provide a sample message that contains the content that you plan to send to your customers. We send that message to special email addresses spread across several major email providers around the world. The test takes about 24 hours to complete. When the test is complete, you can use the <code>GetDeliverabilityTestReport</code> operation to view the results of the test.
    */
  @js.native
  trait CreateDeliverabilityTestReportRequest extends js.Object {
    var Content: EmailContent
    var FromEmailAddress: EmailAddress
    var ReportName: js.UndefOr[ReportName]
    var Tags: js.UndefOr[TagList]
  }

  object CreateDeliverabilityTestReportRequest {
    @inline
    def apply(
        Content: EmailContent,
        FromEmailAddress: EmailAddress,
        ReportName: js.UndefOr[ReportName] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateDeliverabilityTestReportRequest = {
      val __obj = js.Dynamic.literal(
        "Content" -> Content.asInstanceOf[js.Any],
        "FromEmailAddress" -> FromEmailAddress.asInstanceOf[js.Any]
      )

      ReportName.foreach(__v => __obj.updateDynamic("ReportName")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDeliverabilityTestReportRequest]
    }
  }

  /** Information about the predictive inbox placement test that you created.
    */
  @js.native
  trait CreateDeliverabilityTestReportResponse extends js.Object {
    var DeliverabilityTestStatus: DeliverabilityTestStatus
    var ReportId: ReportId
  }

  object CreateDeliverabilityTestReportResponse {
    @inline
    def apply(
        DeliverabilityTestStatus: DeliverabilityTestStatus,
        ReportId: ReportId
    ): CreateDeliverabilityTestReportResponse = {
      val __obj = js.Dynamic.literal(
        "DeliverabilityTestStatus" -> DeliverabilityTestStatus.asInstanceOf[js.Any],
        "ReportId" -> ReportId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateDeliverabilityTestReportResponse]
    }
  }

  /** Represents a request to create a sending authorization policy for an identity. Sending authorization is an Amazon SES feature that enables you to authorize other senders to use your identities. For information, see the [[https://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization-identity-owner-tasks-management.html|Amazon SES Developer Guide]].
    */
  @js.native
  trait CreateEmailIdentityPolicyRequest extends js.Object {
    var EmailIdentity: Identity
    var Policy: Policy
    var PolicyName: PolicyName
  }

  object CreateEmailIdentityPolicyRequest {
    @inline
    def apply(
        EmailIdentity: Identity,
        Policy: Policy,
        PolicyName: PolicyName
    ): CreateEmailIdentityPolicyRequest = {
      val __obj = js.Dynamic.literal(
        "EmailIdentity" -> EmailIdentity.asInstanceOf[js.Any],
        "Policy" -> Policy.asInstanceOf[js.Any],
        "PolicyName" -> PolicyName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateEmailIdentityPolicyRequest]
    }
  }

  /** An HTTP 200 response if the request succeeds, or an error message if the request fails.
    */
  @js.native
  trait CreateEmailIdentityPolicyResponse extends js.Object

  object CreateEmailIdentityPolicyResponse {
    @inline
    def apply(): CreateEmailIdentityPolicyResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateEmailIdentityPolicyResponse]
    }
  }

  /** A request to begin the verification process for an email identity (an email address or domain).
    */
  @js.native
  trait CreateEmailIdentityRequest extends js.Object {
    var EmailIdentity: Identity
    var ConfigurationSetName: js.UndefOr[ConfigurationSetName]
    var DkimSigningAttributes: js.UndefOr[DkimSigningAttributes]
    var Tags: js.UndefOr[TagList]
  }

  object CreateEmailIdentityRequest {
    @inline
    def apply(
        EmailIdentity: Identity,
        ConfigurationSetName: js.UndefOr[ConfigurationSetName] = js.undefined,
        DkimSigningAttributes: js.UndefOr[DkimSigningAttributes] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateEmailIdentityRequest = {
      val __obj = js.Dynamic.literal(
        "EmailIdentity" -> EmailIdentity.asInstanceOf[js.Any]
      )

      ConfigurationSetName.foreach(__v => __obj.updateDynamic("ConfigurationSetName")(__v.asInstanceOf[js.Any]))
      DkimSigningAttributes.foreach(__v => __obj.updateDynamic("DkimSigningAttributes")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateEmailIdentityRequest]
    }
  }

  /** If the email identity is a domain, this object contains information about the DKIM verification status for the domain. If the email identity is an email address, this object is empty.
    */
  @js.native
  trait CreateEmailIdentityResponse extends js.Object {
    var DkimAttributes: js.UndefOr[DkimAttributes]
    var IdentityType: js.UndefOr[IdentityType]
    var VerifiedForSendingStatus: js.UndefOr[Enabled]
  }

  object CreateEmailIdentityResponse {
    @inline
    def apply(
        DkimAttributes: js.UndefOr[DkimAttributes] = js.undefined,
        IdentityType: js.UndefOr[IdentityType] = js.undefined,
        VerifiedForSendingStatus: js.UndefOr[Enabled] = js.undefined
    ): CreateEmailIdentityResponse = {
      val __obj = js.Dynamic.literal()
      DkimAttributes.foreach(__v => __obj.updateDynamic("DkimAttributes")(__v.asInstanceOf[js.Any]))
      IdentityType.foreach(__v => __obj.updateDynamic("IdentityType")(__v.asInstanceOf[js.Any]))
      VerifiedForSendingStatus.foreach(__v => __obj.updateDynamic("VerifiedForSendingStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateEmailIdentityResponse]
    }
  }

  /** Represents a request to create an email template. For more information, see the [[https://docs.aws.amazon.com/ses/latest/DeveloperGuide/send-personalized-email-api.html|Amazon SES Developer Guide]].
    */
  @js.native
  trait CreateEmailTemplateRequest extends js.Object {
    var TemplateContent: EmailTemplateContent
    var TemplateName: EmailTemplateName
  }

  object CreateEmailTemplateRequest {
    @inline
    def apply(
        TemplateContent: EmailTemplateContent,
        TemplateName: EmailTemplateName
    ): CreateEmailTemplateRequest = {
      val __obj = js.Dynamic.literal(
        "TemplateContent" -> TemplateContent.asInstanceOf[js.Any],
        "TemplateName" -> TemplateName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateEmailTemplateRequest]
    }
  }

  /** If the action is successful, the service sends back an HTTP 200 response with an empty HTTP body.
    */
  @js.native
  trait CreateEmailTemplateResponse extends js.Object

  object CreateEmailTemplateResponse {
    @inline
    def apply(): CreateEmailTemplateResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateEmailTemplateResponse]
    }
  }

  /** Represents a request to create an import job from a data source for a data destination.
    */
  @js.native
  trait CreateImportJobRequest extends js.Object {
    var ImportDataSource: ImportDataSource
    var ImportDestination: ImportDestination
  }

  object CreateImportJobRequest {
    @inline
    def apply(
        ImportDataSource: ImportDataSource,
        ImportDestination: ImportDestination
    ): CreateImportJobRequest = {
      val __obj = js.Dynamic.literal(
        "ImportDataSource" -> ImportDataSource.asInstanceOf[js.Any],
        "ImportDestination" -> ImportDestination.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateImportJobRequest]
    }
  }

  /** An HTTP 200 response if the request succeeds, or an error message if the request fails.
    */
  @js.native
  trait CreateImportJobResponse extends js.Object {
    var JobId: js.UndefOr[JobId]
  }

  object CreateImportJobResponse {
    @inline
    def apply(
        JobId: js.UndefOr[JobId] = js.undefined
    ): CreateImportJobResponse = {
      val __obj = js.Dynamic.literal()
      JobId.foreach(__v => __obj.updateDynamic("JobId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateImportJobResponse]
    }
  }

  /** Contains information about a custom verification email template.
    */
  @js.native
  trait CustomVerificationEmailTemplateMetadata extends js.Object {
    var FailureRedirectionURL: js.UndefOr[FailureRedirectionURL]
    var FromEmailAddress: js.UndefOr[EmailAddress]
    var SuccessRedirectionURL: js.UndefOr[SuccessRedirectionURL]
    var TemplateName: js.UndefOr[EmailTemplateName]
    var TemplateSubject: js.UndefOr[EmailTemplateSubject]
  }

  object CustomVerificationEmailTemplateMetadata {
    @inline
    def apply(
        FailureRedirectionURL: js.UndefOr[FailureRedirectionURL] = js.undefined,
        FromEmailAddress: js.UndefOr[EmailAddress] = js.undefined,
        SuccessRedirectionURL: js.UndefOr[SuccessRedirectionURL] = js.undefined,
        TemplateName: js.UndefOr[EmailTemplateName] = js.undefined,
        TemplateSubject: js.UndefOr[EmailTemplateSubject] = js.undefined
    ): CustomVerificationEmailTemplateMetadata = {
      val __obj = js.Dynamic.literal()
      FailureRedirectionURL.foreach(__v => __obj.updateDynamic("FailureRedirectionURL")(__v.asInstanceOf[js.Any]))
      FromEmailAddress.foreach(__v => __obj.updateDynamic("FromEmailAddress")(__v.asInstanceOf[js.Any]))
      SuccessRedirectionURL.foreach(__v => __obj.updateDynamic("SuccessRedirectionURL")(__v.asInstanceOf[js.Any]))
      TemplateName.foreach(__v => __obj.updateDynamic("TemplateName")(__v.asInstanceOf[js.Any]))
      TemplateSubject.foreach(__v => __obj.updateDynamic("TemplateSubject")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CustomVerificationEmailTemplateMetadata]
    }
  }

  /** An object that contains information about the volume of email sent on each day of the analysis period.
    */
  @js.native
  trait DailyVolume extends js.Object {
    var DomainIspPlacements: js.UndefOr[DomainIspPlacements]
    var StartDate: js.UndefOr[Timestamp]
    var VolumeStatistics: js.UndefOr[VolumeStatistics]
  }

  object DailyVolume {
    @inline
    def apply(
        DomainIspPlacements: js.UndefOr[DomainIspPlacements] = js.undefined,
        StartDate: js.UndefOr[Timestamp] = js.undefined,
        VolumeStatistics: js.UndefOr[VolumeStatistics] = js.undefined
    ): DailyVolume = {
      val __obj = js.Dynamic.literal()
      DomainIspPlacements.foreach(__v => __obj.updateDynamic("DomainIspPlacements")(__v.asInstanceOf[js.Any]))
      StartDate.foreach(__v => __obj.updateDynamic("StartDate")(__v.asInstanceOf[js.Any]))
      VolumeStatistics.foreach(__v => __obj.updateDynamic("VolumeStatistics")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DailyVolume]
    }
  }

  /** An object containing additional settings for your VDM configuration as applicable to the Dashboard.
    */
  @js.native
  trait DashboardAttributes extends js.Object {
    var EngagementMetrics: js.UndefOr[FeatureStatus]
  }

  object DashboardAttributes {
    @inline
    def apply(
        EngagementMetrics: js.UndefOr[FeatureStatus] = js.undefined
    ): DashboardAttributes = {
      val __obj = js.Dynamic.literal()
      EngagementMetrics.foreach(__v => __obj.updateDynamic("EngagementMetrics")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DashboardAttributes]
    }
  }

  /** An object containing additional settings for your VDM configuration as applicable to the Dashboard.
    */
  @js.native
  trait DashboardOptions extends js.Object {
    var EngagementMetrics: js.UndefOr[FeatureStatus]
  }

  object DashboardOptions {
    @inline
    def apply(
        EngagementMetrics: js.UndefOr[FeatureStatus] = js.undefined
    ): DashboardOptions = {
      val __obj = js.Dynamic.literal()
      EngagementMetrics.foreach(__v => __obj.updateDynamic("EngagementMetrics")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DashboardOptions]
    }
  }

  /** Contains information about a dedicated IP address that is associated with your Amazon SES account. To learn more about requesting dedicated IP addresses, see [[https://docs.aws.amazon.com/ses/latest/DeveloperGuide/dedicated-ip-case.html|Requesting and Relinquishing Dedicated IP Addresses]] in the <i>Amazon SES Developer Guide</i>.
    */
  @js.native
  trait DedicatedIp extends js.Object {
    var Ip: Ip
    var WarmupPercentage: Percentage100Wrapper
    var WarmupStatus: WarmupStatus
    var PoolName: js.UndefOr[PoolName]
  }

  object DedicatedIp {
    @inline
    def apply(
        Ip: Ip,
        WarmupPercentage: Percentage100Wrapper,
        WarmupStatus: WarmupStatus,
        PoolName: js.UndefOr[PoolName] = js.undefined
    ): DedicatedIp = {
      val __obj = js.Dynamic.literal(
        "Ip" -> Ip.asInstanceOf[js.Any],
        "WarmupPercentage" -> WarmupPercentage.asInstanceOf[js.Any],
        "WarmupStatus" -> WarmupStatus.asInstanceOf[js.Any]
      )

      PoolName.foreach(__v => __obj.updateDynamic("PoolName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DedicatedIp]
    }
  }

  /** Contains information about a dedicated IP pool.
    */
  @js.native
  trait DedicatedIpPool extends js.Object {
    var PoolName: PoolName
    var ScalingMode: ScalingMode
  }

  object DedicatedIpPool {
    @inline
    def apply(
        PoolName: PoolName,
        ScalingMode: ScalingMode
    ): DedicatedIpPool = {
      val __obj = js.Dynamic.literal(
        "PoolName" -> PoolName.asInstanceOf[js.Any],
        "ScalingMode" -> ScalingMode.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DedicatedIpPool]
    }
  }

  /** A request to delete an event destination from a configuration set.
    */
  @js.native
  trait DeleteConfigurationSetEventDestinationRequest extends js.Object {
    var ConfigurationSetName: ConfigurationSetName
    var EventDestinationName: EventDestinationName
  }

  object DeleteConfigurationSetEventDestinationRequest {
    @inline
    def apply(
        ConfigurationSetName: ConfigurationSetName,
        EventDestinationName: EventDestinationName
    ): DeleteConfigurationSetEventDestinationRequest = {
      val __obj = js.Dynamic.literal(
        "ConfigurationSetName" -> ConfigurationSetName.asInstanceOf[js.Any],
        "EventDestinationName" -> EventDestinationName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteConfigurationSetEventDestinationRequest]
    }
  }

  /** An HTTP 200 response if the request succeeds, or an error message if the request fails.
    */
  @js.native
  trait DeleteConfigurationSetEventDestinationResponse extends js.Object

  object DeleteConfigurationSetEventDestinationResponse {
    @inline
    def apply(): DeleteConfigurationSetEventDestinationResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteConfigurationSetEventDestinationResponse]
    }
  }

  /** A request to delete a configuration set.
    */
  @js.native
  trait DeleteConfigurationSetRequest extends js.Object {
    var ConfigurationSetName: ConfigurationSetName
  }

  object DeleteConfigurationSetRequest {
    @inline
    def apply(
        ConfigurationSetName: ConfigurationSetName
    ): DeleteConfigurationSetRequest = {
      val __obj = js.Dynamic.literal(
        "ConfigurationSetName" -> ConfigurationSetName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteConfigurationSetRequest]
    }
  }

  /** An HTTP 200 response if the request succeeds, or an error message if the request fails.
    */
  @js.native
  trait DeleteConfigurationSetResponse extends js.Object

  object DeleteConfigurationSetResponse {
    @inline
    def apply(): DeleteConfigurationSetResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteConfigurationSetResponse]
    }
  }

  @js.native
  trait DeleteContactListRequest extends js.Object {
    var ContactListName: ContactListName
  }

  object DeleteContactListRequest {
    @inline
    def apply(
        ContactListName: ContactListName
    ): DeleteContactListRequest = {
      val __obj = js.Dynamic.literal(
        "ContactListName" -> ContactListName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteContactListRequest]
    }
  }

  @js.native
  trait DeleteContactListResponse extends js.Object

  object DeleteContactListResponse {
    @inline
    def apply(): DeleteContactListResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteContactListResponse]
    }
  }

  @js.native
  trait DeleteContactRequest extends js.Object {
    var ContactListName: ContactListName
    var EmailAddress: EmailAddress
  }

  object DeleteContactRequest {
    @inline
    def apply(
        ContactListName: ContactListName,
        EmailAddress: EmailAddress
    ): DeleteContactRequest = {
      val __obj = js.Dynamic.literal(
        "ContactListName" -> ContactListName.asInstanceOf[js.Any],
        "EmailAddress" -> EmailAddress.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteContactRequest]
    }
  }

  @js.native
  trait DeleteContactResponse extends js.Object

  object DeleteContactResponse {
    @inline
    def apply(): DeleteContactResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteContactResponse]
    }
  }

  /** Represents a request to delete an existing custom verification email template.
    */
  @js.native
  trait DeleteCustomVerificationEmailTemplateRequest extends js.Object {
    var TemplateName: EmailTemplateName
  }

  object DeleteCustomVerificationEmailTemplateRequest {
    @inline
    def apply(
        TemplateName: EmailTemplateName
    ): DeleteCustomVerificationEmailTemplateRequest = {
      val __obj = js.Dynamic.literal(
        "TemplateName" -> TemplateName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteCustomVerificationEmailTemplateRequest]
    }
  }

  /** If the action is successful, the service sends back an HTTP 200 response with an empty HTTP body.
    */
  @js.native
  trait DeleteCustomVerificationEmailTemplateResponse extends js.Object

  object DeleteCustomVerificationEmailTemplateResponse {
    @inline
    def apply(): DeleteCustomVerificationEmailTemplateResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteCustomVerificationEmailTemplateResponse]
    }
  }

  /** A request to delete a dedicated IP pool.
    */
  @js.native
  trait DeleteDedicatedIpPoolRequest extends js.Object {
    var PoolName: PoolName
  }

  object DeleteDedicatedIpPoolRequest {
    @inline
    def apply(
        PoolName: PoolName
    ): DeleteDedicatedIpPoolRequest = {
      val __obj = js.Dynamic.literal(
        "PoolName" -> PoolName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteDedicatedIpPoolRequest]
    }
  }

  /** An HTTP 200 response if the request succeeds, or an error message if the request fails.
    */
  @js.native
  trait DeleteDedicatedIpPoolResponse extends js.Object

  object DeleteDedicatedIpPoolResponse {
    @inline
    def apply(): DeleteDedicatedIpPoolResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteDedicatedIpPoolResponse]
    }
  }

  /** Represents a request to delete a sending authorization policy for an identity. Sending authorization is an Amazon SES feature that enables you to authorize other senders to use your identities. For information, see the [[https://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization-identity-owner-tasks-management.html|Amazon SES Developer Guide]].
    */
  @js.native
  trait DeleteEmailIdentityPolicyRequest extends js.Object {
    var EmailIdentity: Identity
    var PolicyName: PolicyName
  }

  object DeleteEmailIdentityPolicyRequest {
    @inline
    def apply(
        EmailIdentity: Identity,
        PolicyName: PolicyName
    ): DeleteEmailIdentityPolicyRequest = {
      val __obj = js.Dynamic.literal(
        "EmailIdentity" -> EmailIdentity.asInstanceOf[js.Any],
        "PolicyName" -> PolicyName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteEmailIdentityPolicyRequest]
    }
  }

  /** An HTTP 200 response if the request succeeds, or an error message if the request fails.
    */
  @js.native
  trait DeleteEmailIdentityPolicyResponse extends js.Object

  object DeleteEmailIdentityPolicyResponse {
    @inline
    def apply(): DeleteEmailIdentityPolicyResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteEmailIdentityPolicyResponse]
    }
  }

  /** A request to delete an existing email identity. When you delete an identity, you lose the ability to send email from that identity. You can restore your ability to send email by completing the verification process for the identity again.
    */
  @js.native
  trait DeleteEmailIdentityRequest extends js.Object {
    var EmailIdentity: Identity
  }

  object DeleteEmailIdentityRequest {
    @inline
    def apply(
        EmailIdentity: Identity
    ): DeleteEmailIdentityRequest = {
      val __obj = js.Dynamic.literal(
        "EmailIdentity" -> EmailIdentity.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteEmailIdentityRequest]
    }
  }

  /** An HTTP 200 response if the request succeeds, or an error message if the request fails.
    */
  @js.native
  trait DeleteEmailIdentityResponse extends js.Object

  object DeleteEmailIdentityResponse {
    @inline
    def apply(): DeleteEmailIdentityResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteEmailIdentityResponse]
    }
  }

  /** Represents a request to delete an email template. For more information, see the [[https://docs.aws.amazon.com/ses/latest/DeveloperGuide/send-personalized-email-api.html|Amazon SES Developer Guide]].
    */
  @js.native
  trait DeleteEmailTemplateRequest extends js.Object {
    var TemplateName: EmailTemplateName
  }

  object DeleteEmailTemplateRequest {
    @inline
    def apply(
        TemplateName: EmailTemplateName
    ): DeleteEmailTemplateRequest = {
      val __obj = js.Dynamic.literal(
        "TemplateName" -> TemplateName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteEmailTemplateRequest]
    }
  }

  /** If the action is successful, the service sends back an HTTP 200 response with an empty HTTP body.
    */
  @js.native
  trait DeleteEmailTemplateResponse extends js.Object

  object DeleteEmailTemplateResponse {
    @inline
    def apply(): DeleteEmailTemplateResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteEmailTemplateResponse]
    }
  }

  /** A request to remove an email address from the suppression list for your account.
    */
  @js.native
  trait DeleteSuppressedDestinationRequest extends js.Object {
    var EmailAddress: EmailAddress
  }

  object DeleteSuppressedDestinationRequest {
    @inline
    def apply(
        EmailAddress: EmailAddress
    ): DeleteSuppressedDestinationRequest = {
      val __obj = js.Dynamic.literal(
        "EmailAddress" -> EmailAddress.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteSuppressedDestinationRequest]
    }
  }

  /** An HTTP 200 response if the request succeeds, or an error message if the request fails.
    */
  @js.native
  trait DeleteSuppressedDestinationResponse extends js.Object

  object DeleteSuppressedDestinationResponse {
    @inline
    def apply(): DeleteSuppressedDestinationResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteSuppressedDestinationResponse]
    }
  }

  /** An object that contains metadata related to a predictive inbox placement test.
    */
  @js.native
  trait DeliverabilityTestReport extends js.Object {
    var CreateDate: js.UndefOr[Timestamp]
    var DeliverabilityTestStatus: js.UndefOr[DeliverabilityTestStatus]
    var FromEmailAddress: js.UndefOr[EmailAddress]
    var ReportId: js.UndefOr[ReportId]
    var ReportName: js.UndefOr[ReportName]
    var Subject: js.UndefOr[DeliverabilityTestSubject]
  }

  object DeliverabilityTestReport {
    @inline
    def apply(
        CreateDate: js.UndefOr[Timestamp] = js.undefined,
        DeliverabilityTestStatus: js.UndefOr[DeliverabilityTestStatus] = js.undefined,
        FromEmailAddress: js.UndefOr[EmailAddress] = js.undefined,
        ReportId: js.UndefOr[ReportId] = js.undefined,
        ReportName: js.UndefOr[ReportName] = js.undefined,
        Subject: js.UndefOr[DeliverabilityTestSubject] = js.undefined
    ): DeliverabilityTestReport = {
      val __obj = js.Dynamic.literal()
      CreateDate.foreach(__v => __obj.updateDynamic("CreateDate")(__v.asInstanceOf[js.Any]))
      DeliverabilityTestStatus.foreach(__v => __obj.updateDynamic("DeliverabilityTestStatus")(__v.asInstanceOf[js.Any]))
      FromEmailAddress.foreach(__v => __obj.updateDynamic("FromEmailAddress")(__v.asInstanceOf[js.Any]))
      ReportId.foreach(__v => __obj.updateDynamic("ReportId")(__v.asInstanceOf[js.Any]))
      ReportName.foreach(__v => __obj.updateDynamic("ReportName")(__v.asInstanceOf[js.Any]))
      Subject.foreach(__v => __obj.updateDynamic("Subject")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeliverabilityTestReport]
    }
  }

  /** Used to associate a configuration set with a dedicated IP pool.
    */
  @js.native
  trait DeliveryOptions extends js.Object {
    var SendingPoolName: js.UndefOr[PoolName]
    var TlsPolicy: js.UndefOr[TlsPolicy]
  }

  object DeliveryOptions {
    @inline
    def apply(
        SendingPoolName: js.UndefOr[PoolName] = js.undefined,
        TlsPolicy: js.UndefOr[TlsPolicy] = js.undefined
    ): DeliveryOptions = {
      val __obj = js.Dynamic.literal()
      SendingPoolName.foreach(__v => __obj.updateDynamic("SendingPoolName")(__v.asInstanceOf[js.Any]))
      TlsPolicy.foreach(__v => __obj.updateDynamic("TlsPolicy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeliveryOptions]
    }
  }

  /** An object that describes the recipients for an email.
    *
    * '''Note:'''Amazon SES does not support the SMTPUTF8 extension, as described in [[https://tools.ietf.org/html/rfc6531|RFC6531]]. For this reason, the <i>local part</i> of a destination email address (the part of the email address that precedes the @ sign) may only contain [[https://en.wikipedia.org/wiki/Email_address#Local-part|7-bit ASCII characters]]. If the <i>domain part</i> of an address (the part after the @ sign) contains non-ASCII characters, they must be encoded using Punycode, as described in [[https://tools.ietf.org/html/rfc3492.html|RFC3492]].
    */
  @js.native
  trait Destination extends js.Object {
    var BccAddresses: js.UndefOr[EmailAddressList]
    var CcAddresses: js.UndefOr[EmailAddressList]
    var ToAddresses: js.UndefOr[EmailAddressList]
  }

  object Destination {
    @inline
    def apply(
        BccAddresses: js.UndefOr[EmailAddressList] = js.undefined,
        CcAddresses: js.UndefOr[EmailAddressList] = js.undefined,
        ToAddresses: js.UndefOr[EmailAddressList] = js.undefined
    ): Destination = {
      val __obj = js.Dynamic.literal()
      BccAddresses.foreach(__v => __obj.updateDynamic("BccAddresses")(__v.asInstanceOf[js.Any]))
      CcAddresses.foreach(__v => __obj.updateDynamic("CcAddresses")(__v.asInstanceOf[js.Any]))
      ToAddresses.foreach(__v => __obj.updateDynamic("ToAddresses")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Destination]
    }
  }

  /** An object that contains information about the DKIM authentication status for an email identity. Amazon SES determines the authentication status by searching for specific records in the DNS configuration for the domain. If you used [[https://docs.aws.amazon.com/ses/latest/DeveloperGuide/easy-dkim.html|Easy DKIM]] to set up DKIM authentication, Amazon SES tries to find three unique CNAME records in the DNS configuration for your domain. If you provided a public key to perform DKIM authentication, Amazon SES tries to find a TXT record that uses the selector that you specified. The value of the TXT record must be a public key that's paired with the private key that you specified in the process of creating the identity
    */
  @js.native
  trait DkimAttributes extends js.Object {
    var CurrentSigningKeyLength: js.UndefOr[DkimSigningKeyLength]
    var LastKeyGenerationTimestamp: js.UndefOr[Timestamp]
    var NextSigningKeyLength: js.UndefOr[DkimSigningKeyLength]
    var SigningAttributesOrigin: js.UndefOr[DkimSigningAttributesOrigin]
    var SigningEnabled: js.UndefOr[Enabled]
    var Status: js.UndefOr[DkimStatus]
    var Tokens: js.UndefOr[DnsTokenList]
  }

  object DkimAttributes {
    @inline
    def apply(
        CurrentSigningKeyLength: js.UndefOr[DkimSigningKeyLength] = js.undefined,
        LastKeyGenerationTimestamp: js.UndefOr[Timestamp] = js.undefined,
        NextSigningKeyLength: js.UndefOr[DkimSigningKeyLength] = js.undefined,
        SigningAttributesOrigin: js.UndefOr[DkimSigningAttributesOrigin] = js.undefined,
        SigningEnabled: js.UndefOr[Enabled] = js.undefined,
        Status: js.UndefOr[DkimStatus] = js.undefined,
        Tokens: js.UndefOr[DnsTokenList] = js.undefined
    ): DkimAttributes = {
      val __obj = js.Dynamic.literal()
      CurrentSigningKeyLength.foreach(__v => __obj.updateDynamic("CurrentSigningKeyLength")(__v.asInstanceOf[js.Any]))
      LastKeyGenerationTimestamp.foreach(__v => __obj.updateDynamic("LastKeyGenerationTimestamp")(__v.asInstanceOf[js.Any]))
      NextSigningKeyLength.foreach(__v => __obj.updateDynamic("NextSigningKeyLength")(__v.asInstanceOf[js.Any]))
      SigningAttributesOrigin.foreach(__v => __obj.updateDynamic("SigningAttributesOrigin")(__v.asInstanceOf[js.Any]))
      SigningEnabled.foreach(__v => __obj.updateDynamic("SigningEnabled")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      Tokens.foreach(__v => __obj.updateDynamic("Tokens")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DkimAttributes]
    }
  }

  /** An object that contains configuration for Bring Your Own DKIM (BYODKIM), or, for Easy DKIM
    */
  @js.native
  trait DkimSigningAttributes extends js.Object {
    var DomainSigningPrivateKey: js.UndefOr[PrivateKey]
    var DomainSigningSelector: js.UndefOr[Selector]
    var NextSigningKeyLength: js.UndefOr[DkimSigningKeyLength]
  }

  object DkimSigningAttributes {
    @inline
    def apply(
        DomainSigningPrivateKey: js.UndefOr[PrivateKey] = js.undefined,
        DomainSigningSelector: js.UndefOr[Selector] = js.undefined,
        NextSigningKeyLength: js.UndefOr[DkimSigningKeyLength] = js.undefined
    ): DkimSigningAttributes = {
      val __obj = js.Dynamic.literal()
      DomainSigningPrivateKey.foreach(__v => __obj.updateDynamic("DomainSigningPrivateKey")(__v.asInstanceOf[js.Any]))
      DomainSigningSelector.foreach(__v => __obj.updateDynamic("DomainSigningSelector")(__v.asInstanceOf[js.Any]))
      NextSigningKeyLength.foreach(__v => __obj.updateDynamic("NextSigningKeyLength")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DkimSigningAttributes]
    }
  }

  /** An object that contains the deliverability data for a specific campaign. This data is available for a campaign only if the campaign sent email by using a domain that the Deliverability dashboard is enabled for (<code>PutDeliverabilityDashboardOption</code> operation).
    */
  @js.native
  trait DomainDeliverabilityCampaign extends js.Object {
    var CampaignId: js.UndefOr[CampaignId]
    var DeleteRate: js.UndefOr[Percentage]
    var Esps: js.UndefOr[Esps]
    var FirstSeenDateTime: js.UndefOr[Timestamp]
    var FromAddress: js.UndefOr[Identity]
    var ImageUrl: js.UndefOr[ImageUrl]
    var InboxCount: js.UndefOr[Volume]
    var LastSeenDateTime: js.UndefOr[Timestamp]
    var ProjectedVolume: js.UndefOr[Volume]
    var ReadDeleteRate: js.UndefOr[Percentage]
    var ReadRate: js.UndefOr[Percentage]
    var SendingIps: js.UndefOr[IpList]
    var SpamCount: js.UndefOr[Volume]
    var Subject: js.UndefOr[Subject]
  }

  object DomainDeliverabilityCampaign {
    @inline
    def apply(
        CampaignId: js.UndefOr[CampaignId] = js.undefined,
        DeleteRate: js.UndefOr[Percentage] = js.undefined,
        Esps: js.UndefOr[Esps] = js.undefined,
        FirstSeenDateTime: js.UndefOr[Timestamp] = js.undefined,
        FromAddress: js.UndefOr[Identity] = js.undefined,
        ImageUrl: js.UndefOr[ImageUrl] = js.undefined,
        InboxCount: js.UndefOr[Volume] = js.undefined,
        LastSeenDateTime: js.UndefOr[Timestamp] = js.undefined,
        ProjectedVolume: js.UndefOr[Volume] = js.undefined,
        ReadDeleteRate: js.UndefOr[Percentage] = js.undefined,
        ReadRate: js.UndefOr[Percentage] = js.undefined,
        SendingIps: js.UndefOr[IpList] = js.undefined,
        SpamCount: js.UndefOr[Volume] = js.undefined,
        Subject: js.UndefOr[Subject] = js.undefined
    ): DomainDeliverabilityCampaign = {
      val __obj = js.Dynamic.literal()
      CampaignId.foreach(__v => __obj.updateDynamic("CampaignId")(__v.asInstanceOf[js.Any]))
      DeleteRate.foreach(__v => __obj.updateDynamic("DeleteRate")(__v.asInstanceOf[js.Any]))
      Esps.foreach(__v => __obj.updateDynamic("Esps")(__v.asInstanceOf[js.Any]))
      FirstSeenDateTime.foreach(__v => __obj.updateDynamic("FirstSeenDateTime")(__v.asInstanceOf[js.Any]))
      FromAddress.foreach(__v => __obj.updateDynamic("FromAddress")(__v.asInstanceOf[js.Any]))
      ImageUrl.foreach(__v => __obj.updateDynamic("ImageUrl")(__v.asInstanceOf[js.Any]))
      InboxCount.foreach(__v => __obj.updateDynamic("InboxCount")(__v.asInstanceOf[js.Any]))
      LastSeenDateTime.foreach(__v => __obj.updateDynamic("LastSeenDateTime")(__v.asInstanceOf[js.Any]))
      ProjectedVolume.foreach(__v => __obj.updateDynamic("ProjectedVolume")(__v.asInstanceOf[js.Any]))
      ReadDeleteRate.foreach(__v => __obj.updateDynamic("ReadDeleteRate")(__v.asInstanceOf[js.Any]))
      ReadRate.foreach(__v => __obj.updateDynamic("ReadRate")(__v.asInstanceOf[js.Any]))
      SendingIps.foreach(__v => __obj.updateDynamic("SendingIps")(__v.asInstanceOf[js.Any]))
      SpamCount.foreach(__v => __obj.updateDynamic("SpamCount")(__v.asInstanceOf[js.Any]))
      Subject.foreach(__v => __obj.updateDynamic("Subject")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DomainDeliverabilityCampaign]
    }
  }

  /** An object that contains information about the Deliverability dashboard subscription for a verified domain that you use to send email and currently has an active Deliverability dashboard subscription. If a Deliverability dashboard subscription is active for a domain, you gain access to reputation, inbox placement, and other metrics for the domain.
    */
  @js.native
  trait DomainDeliverabilityTrackingOption extends js.Object {
    var Domain: js.UndefOr[Domain]
    var InboxPlacementTrackingOption: js.UndefOr[InboxPlacementTrackingOption]
    var SubscriptionStartDate: js.UndefOr[Timestamp]
  }

  object DomainDeliverabilityTrackingOption {
    @inline
    def apply(
        Domain: js.UndefOr[Domain] = js.undefined,
        InboxPlacementTrackingOption: js.UndefOr[InboxPlacementTrackingOption] = js.undefined,
        SubscriptionStartDate: js.UndefOr[Timestamp] = js.undefined
    ): DomainDeliverabilityTrackingOption = {
      val __obj = js.Dynamic.literal()
      Domain.foreach(__v => __obj.updateDynamic("Domain")(__v.asInstanceOf[js.Any]))
      InboxPlacementTrackingOption.foreach(__v => __obj.updateDynamic("InboxPlacementTrackingOption")(__v.asInstanceOf[js.Any]))
      SubscriptionStartDate.foreach(__v => __obj.updateDynamic("SubscriptionStartDate")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DomainDeliverabilityTrackingOption]
    }
  }

  /** An object that contains inbox placement data for email sent from one of your email domains to a specific email provider.
    */
  @js.native
  trait DomainIspPlacement extends js.Object {
    var InboxPercentage: js.UndefOr[Percentage]
    var InboxRawCount: js.UndefOr[Volume]
    var IspName: js.UndefOr[IspName]
    var SpamPercentage: js.UndefOr[Percentage]
    var SpamRawCount: js.UndefOr[Volume]
  }

  object DomainIspPlacement {
    @inline
    def apply(
        InboxPercentage: js.UndefOr[Percentage] = js.undefined,
        InboxRawCount: js.UndefOr[Volume] = js.undefined,
        IspName: js.UndefOr[IspName] = js.undefined,
        SpamPercentage: js.UndefOr[Percentage] = js.undefined,
        SpamRawCount: js.UndefOr[Volume] = js.undefined
    ): DomainIspPlacement = {
      val __obj = js.Dynamic.literal()
      InboxPercentage.foreach(__v => __obj.updateDynamic("InboxPercentage")(__v.asInstanceOf[js.Any]))
      InboxRawCount.foreach(__v => __obj.updateDynamic("InboxRawCount")(__v.asInstanceOf[js.Any]))
      IspName.foreach(__v => __obj.updateDynamic("IspName")(__v.asInstanceOf[js.Any]))
      SpamPercentage.foreach(__v => __obj.updateDynamic("SpamPercentage")(__v.asInstanceOf[js.Any]))
      SpamRawCount.foreach(__v => __obj.updateDynamic("SpamRawCount")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DomainIspPlacement]
    }
  }

  /** An object that defines the entire content of the email, including the message headers and the body content. You can create a simple email message, in which you specify the subject and the text and HTML versions of the message body. You can also create raw messages, in which you specify a complete MIME-formatted message. Raw messages can include attachments and custom headers.
    */
  @js.native
  trait EmailContent extends js.Object {
    var Raw: js.UndefOr[RawMessage]
    var Simple: js.UndefOr[Message]
    var Template: js.UndefOr[Template]
  }

  object EmailContent {
    @inline
    def apply(
        Raw: js.UndefOr[RawMessage] = js.undefined,
        Simple: js.UndefOr[Message] = js.undefined,
        Template: js.UndefOr[Template] = js.undefined
    ): EmailContent = {
      val __obj = js.Dynamic.literal()
      Raw.foreach(__v => __obj.updateDynamic("Raw")(__v.asInstanceOf[js.Any]))
      Simple.foreach(__v => __obj.updateDynamic("Simple")(__v.asInstanceOf[js.Any]))
      Template.foreach(__v => __obj.updateDynamic("Template")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EmailContent]
    }
  }

  /** The content of the email, composed of a subject line, an HTML part, and a text-only part.
    */
  @js.native
  trait EmailTemplateContent extends js.Object {
    var Html: js.UndefOr[EmailTemplateHtml]
    var Subject: js.UndefOr[EmailTemplateSubject]
    var Text: js.UndefOr[EmailTemplateText]
  }

  object EmailTemplateContent {
    @inline
    def apply(
        Html: js.UndefOr[EmailTemplateHtml] = js.undefined,
        Subject: js.UndefOr[EmailTemplateSubject] = js.undefined,
        Text: js.UndefOr[EmailTemplateText] = js.undefined
    ): EmailTemplateContent = {
      val __obj = js.Dynamic.literal()
      Html.foreach(__v => __obj.updateDynamic("Html")(__v.asInstanceOf[js.Any]))
      Subject.foreach(__v => __obj.updateDynamic("Subject")(__v.asInstanceOf[js.Any]))
      Text.foreach(__v => __obj.updateDynamic("Text")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EmailTemplateContent]
    }
  }

  /** Contains information about an email template.
    */
  @js.native
  trait EmailTemplateMetadata extends js.Object {
    var CreatedTimestamp: js.UndefOr[Timestamp]
    var TemplateName: js.UndefOr[EmailTemplateName]
  }

  object EmailTemplateMetadata {
    @inline
    def apply(
        CreatedTimestamp: js.UndefOr[Timestamp] = js.undefined,
        TemplateName: js.UndefOr[EmailTemplateName] = js.undefined
    ): EmailTemplateMetadata = {
      val __obj = js.Dynamic.literal()
      CreatedTimestamp.foreach(__v => __obj.updateDynamic("CreatedTimestamp")(__v.asInstanceOf[js.Any]))
      TemplateName.foreach(__v => __obj.updateDynamic("TemplateName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EmailTemplateMetadata]
    }
  }

  /** In the Amazon SES API v2, <i>events</i> include message sends, deliveries, opens, clicks, bounces, complaints and delivery delays. <i>Event destinations</i> are places that you can send information about these events to. For example, you can send event data to Amazon SNS to receive notifications when you receive bounces or complaints, or you can use Amazon Kinesis Data Firehose to stream data to Amazon S3 for long-term storage.
    */
  @js.native
  trait EventDestination extends js.Object {
    var MatchingEventTypes: EventTypes
    var Name: EventDestinationName
    var CloudWatchDestination: js.UndefOr[CloudWatchDestination]
    var Enabled: js.UndefOr[Enabled]
    var KinesisFirehoseDestination: js.UndefOr[KinesisFirehoseDestination]
    var PinpointDestination: js.UndefOr[PinpointDestination]
    var SnsDestination: js.UndefOr[SnsDestination]
  }

  object EventDestination {
    @inline
    def apply(
        MatchingEventTypes: EventTypes,
        Name: EventDestinationName,
        CloudWatchDestination: js.UndefOr[CloudWatchDestination] = js.undefined,
        Enabled: js.UndefOr[Enabled] = js.undefined,
        KinesisFirehoseDestination: js.UndefOr[KinesisFirehoseDestination] = js.undefined,
        PinpointDestination: js.UndefOr[PinpointDestination] = js.undefined,
        SnsDestination: js.UndefOr[SnsDestination] = js.undefined
    ): EventDestination = {
      val __obj = js.Dynamic.literal(
        "MatchingEventTypes" -> MatchingEventTypes.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]
      )

      CloudWatchDestination.foreach(__v => __obj.updateDynamic("CloudWatchDestination")(__v.asInstanceOf[js.Any]))
      Enabled.foreach(__v => __obj.updateDynamic("Enabled")(__v.asInstanceOf[js.Any]))
      KinesisFirehoseDestination.foreach(__v => __obj.updateDynamic("KinesisFirehoseDestination")(__v.asInstanceOf[js.Any]))
      PinpointDestination.foreach(__v => __obj.updateDynamic("PinpointDestination")(__v.asInstanceOf[js.Any]))
      SnsDestination.foreach(__v => __obj.updateDynamic("SnsDestination")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EventDestination]
    }
  }

  /** An object that defines the event destination. Specifically, it defines which services receive events from emails sent using the configuration set that the event destination is associated with. Also defines the types of events that are sent to the event destination.
    */
  @js.native
  trait EventDestinationDefinition extends js.Object {
    var CloudWatchDestination: js.UndefOr[CloudWatchDestination]
    var Enabled: js.UndefOr[Enabled]
    var KinesisFirehoseDestination: js.UndefOr[KinesisFirehoseDestination]
    var MatchingEventTypes: js.UndefOr[EventTypes]
    var PinpointDestination: js.UndefOr[PinpointDestination]
    var SnsDestination: js.UndefOr[SnsDestination]
  }

  object EventDestinationDefinition {
    @inline
    def apply(
        CloudWatchDestination: js.UndefOr[CloudWatchDestination] = js.undefined,
        Enabled: js.UndefOr[Enabled] = js.undefined,
        KinesisFirehoseDestination: js.UndefOr[KinesisFirehoseDestination] = js.undefined,
        MatchingEventTypes: js.UndefOr[EventTypes] = js.undefined,
        PinpointDestination: js.UndefOr[PinpointDestination] = js.undefined,
        SnsDestination: js.UndefOr[SnsDestination] = js.undefined
    ): EventDestinationDefinition = {
      val __obj = js.Dynamic.literal()
      CloudWatchDestination.foreach(__v => __obj.updateDynamic("CloudWatchDestination")(__v.asInstanceOf[js.Any]))
      Enabled.foreach(__v => __obj.updateDynamic("Enabled")(__v.asInstanceOf[js.Any]))
      KinesisFirehoseDestination.foreach(__v => __obj.updateDynamic("KinesisFirehoseDestination")(__v.asInstanceOf[js.Any]))
      MatchingEventTypes.foreach(__v => __obj.updateDynamic("MatchingEventTypes")(__v.asInstanceOf[js.Any]))
      PinpointDestination.foreach(__v => __obj.updateDynamic("PinpointDestination")(__v.asInstanceOf[js.Any]))
      SnsDestination.foreach(__v => __obj.updateDynamic("SnsDestination")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EventDestinationDefinition]
    }
  }

  /** An object that contains the failure details about an import job.
    */
  @js.native
  trait FailureInfo extends js.Object {
    var ErrorMessage: js.UndefOr[ErrorMessage]
    var FailedRecordsS3Url: js.UndefOr[FailedRecordsS3Url]
  }

  object FailureInfo {
    @inline
    def apply(
        ErrorMessage: js.UndefOr[ErrorMessage] = js.undefined,
        FailedRecordsS3Url: js.UndefOr[FailedRecordsS3Url] = js.undefined
    ): FailureInfo = {
      val __obj = js.Dynamic.literal()
      ErrorMessage.foreach(__v => __obj.updateDynamic("ErrorMessage")(__v.asInstanceOf[js.Any]))
      FailedRecordsS3Url.foreach(__v => __obj.updateDynamic("FailedRecordsS3Url")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FailureInfo]
    }
  }

  /** A request to obtain information about the email-sending capabilities of your Amazon SES account.
    */
  @js.native
  trait GetAccountRequest extends js.Object

  object GetAccountRequest {
    @inline
    def apply(): GetAccountRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetAccountRequest]
    }
  }

  /** A list of details about the email-sending capabilities of your Amazon SES account in the current Amazon Web Services Region.
    */
  @js.native
  trait GetAccountResponse extends js.Object {
    var DedicatedIpAutoWarmupEnabled: js.UndefOr[Enabled]
    var Details: js.UndefOr[AccountDetails]
    var EnforcementStatus: js.UndefOr[GeneralEnforcementStatus]
    var ProductionAccessEnabled: js.UndefOr[Enabled]
    var SendQuota: js.UndefOr[SendQuota]
    var SendingEnabled: js.UndefOr[Enabled]
    var SuppressionAttributes: js.UndefOr[SuppressionAttributes]
    var VdmAttributes: js.UndefOr[VdmAttributes]
  }

  object GetAccountResponse {
    @inline
    def apply(
        DedicatedIpAutoWarmupEnabled: js.UndefOr[Enabled] = js.undefined,
        Details: js.UndefOr[AccountDetails] = js.undefined,
        EnforcementStatus: js.UndefOr[GeneralEnforcementStatus] = js.undefined,
        ProductionAccessEnabled: js.UndefOr[Enabled] = js.undefined,
        SendQuota: js.UndefOr[SendQuota] = js.undefined,
        SendingEnabled: js.UndefOr[Enabled] = js.undefined,
        SuppressionAttributes: js.UndefOr[SuppressionAttributes] = js.undefined,
        VdmAttributes: js.UndefOr[VdmAttributes] = js.undefined
    ): GetAccountResponse = {
      val __obj = js.Dynamic.literal()
      DedicatedIpAutoWarmupEnabled.foreach(__v => __obj.updateDynamic("DedicatedIpAutoWarmupEnabled")(__v.asInstanceOf[js.Any]))
      Details.foreach(__v => __obj.updateDynamic("Details")(__v.asInstanceOf[js.Any]))
      EnforcementStatus.foreach(__v => __obj.updateDynamic("EnforcementStatus")(__v.asInstanceOf[js.Any]))
      ProductionAccessEnabled.foreach(__v => __obj.updateDynamic("ProductionAccessEnabled")(__v.asInstanceOf[js.Any]))
      SendQuota.foreach(__v => __obj.updateDynamic("SendQuota")(__v.asInstanceOf[js.Any]))
      SendingEnabled.foreach(__v => __obj.updateDynamic("SendingEnabled")(__v.asInstanceOf[js.Any]))
      SuppressionAttributes.foreach(__v => __obj.updateDynamic("SuppressionAttributes")(__v.asInstanceOf[js.Any]))
      VdmAttributes.foreach(__v => __obj.updateDynamic("VdmAttributes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetAccountResponse]
    }
  }

  /** A request to retrieve a list of the blacklists that your dedicated IP addresses appear on.
    */
  @js.native
  trait GetBlacklistReportsRequest extends js.Object {
    var BlacklistItemNames: BlacklistItemNames
  }

  object GetBlacklistReportsRequest {
    @inline
    def apply(
        BlacklistItemNames: BlacklistItemNames
    ): GetBlacklistReportsRequest = {
      val __obj = js.Dynamic.literal(
        "BlacklistItemNames" -> BlacklistItemNames.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetBlacklistReportsRequest]
    }
  }

  /** An object that contains information about blacklist events.
    */
  @js.native
  trait GetBlacklistReportsResponse extends js.Object {
    var BlacklistReport: BlacklistReport
  }

  object GetBlacklistReportsResponse {
    @inline
    def apply(
        BlacklistReport: BlacklistReport
    ): GetBlacklistReportsResponse = {
      val __obj = js.Dynamic.literal(
        "BlacklistReport" -> BlacklistReport.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetBlacklistReportsResponse]
    }
  }

  /** A request to obtain information about the event destinations for a configuration set.
    */
  @js.native
  trait GetConfigurationSetEventDestinationsRequest extends js.Object {
    var ConfigurationSetName: ConfigurationSetName
  }

  object GetConfigurationSetEventDestinationsRequest {
    @inline
    def apply(
        ConfigurationSetName: ConfigurationSetName
    ): GetConfigurationSetEventDestinationsRequest = {
      val __obj = js.Dynamic.literal(
        "ConfigurationSetName" -> ConfigurationSetName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetConfigurationSetEventDestinationsRequest]
    }
  }

  /** Information about an event destination for a configuration set.
    */
  @js.native
  trait GetConfigurationSetEventDestinationsResponse extends js.Object {
    var EventDestinations: js.UndefOr[EventDestinations]
  }

  object GetConfigurationSetEventDestinationsResponse {
    @inline
    def apply(
        EventDestinations: js.UndefOr[EventDestinations] = js.undefined
    ): GetConfigurationSetEventDestinationsResponse = {
      val __obj = js.Dynamic.literal()
      EventDestinations.foreach(__v => __obj.updateDynamic("EventDestinations")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetConfigurationSetEventDestinationsResponse]
    }
  }

  /** A request to obtain information about a configuration set.
    */
  @js.native
  trait GetConfigurationSetRequest extends js.Object {
    var ConfigurationSetName: ConfigurationSetName
  }

  object GetConfigurationSetRequest {
    @inline
    def apply(
        ConfigurationSetName: ConfigurationSetName
    ): GetConfigurationSetRequest = {
      val __obj = js.Dynamic.literal(
        "ConfigurationSetName" -> ConfigurationSetName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetConfigurationSetRequest]
    }
  }

  /** Information about a configuration set.
    */
  @js.native
  trait GetConfigurationSetResponse extends js.Object {
    var ConfigurationSetName: js.UndefOr[ConfigurationSetName]
    var DeliveryOptions: js.UndefOr[DeliveryOptions]
    var ReputationOptions: js.UndefOr[ReputationOptions]
    var SendingOptions: js.UndefOr[SendingOptions]
    var SuppressionOptions: js.UndefOr[SuppressionOptions]
    var Tags: js.UndefOr[TagList]
    var TrackingOptions: js.UndefOr[TrackingOptions]
    var VdmOptions: js.UndefOr[VdmOptions]
  }

  object GetConfigurationSetResponse {
    @inline
    def apply(
        ConfigurationSetName: js.UndefOr[ConfigurationSetName] = js.undefined,
        DeliveryOptions: js.UndefOr[DeliveryOptions] = js.undefined,
        ReputationOptions: js.UndefOr[ReputationOptions] = js.undefined,
        SendingOptions: js.UndefOr[SendingOptions] = js.undefined,
        SuppressionOptions: js.UndefOr[SuppressionOptions] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined,
        TrackingOptions: js.UndefOr[TrackingOptions] = js.undefined,
        VdmOptions: js.UndefOr[VdmOptions] = js.undefined
    ): GetConfigurationSetResponse = {
      val __obj = js.Dynamic.literal()
      ConfigurationSetName.foreach(__v => __obj.updateDynamic("ConfigurationSetName")(__v.asInstanceOf[js.Any]))
      DeliveryOptions.foreach(__v => __obj.updateDynamic("DeliveryOptions")(__v.asInstanceOf[js.Any]))
      ReputationOptions.foreach(__v => __obj.updateDynamic("ReputationOptions")(__v.asInstanceOf[js.Any]))
      SendingOptions.foreach(__v => __obj.updateDynamic("SendingOptions")(__v.asInstanceOf[js.Any]))
      SuppressionOptions.foreach(__v => __obj.updateDynamic("SuppressionOptions")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      TrackingOptions.foreach(__v => __obj.updateDynamic("TrackingOptions")(__v.asInstanceOf[js.Any]))
      VdmOptions.foreach(__v => __obj.updateDynamic("VdmOptions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetConfigurationSetResponse]
    }
  }

  @js.native
  trait GetContactListRequest extends js.Object {
    var ContactListName: ContactListName
  }

  object GetContactListRequest {
    @inline
    def apply(
        ContactListName: ContactListName
    ): GetContactListRequest = {
      val __obj = js.Dynamic.literal(
        "ContactListName" -> ContactListName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetContactListRequest]
    }
  }

  @js.native
  trait GetContactListResponse extends js.Object {
    var ContactListName: js.UndefOr[ContactListName]
    var CreatedTimestamp: js.UndefOr[Timestamp]
    var Description: js.UndefOr[Description]
    var LastUpdatedTimestamp: js.UndefOr[Timestamp]
    var Tags: js.UndefOr[TagList]
    var Topics: js.UndefOr[Topics]
  }

  object GetContactListResponse {
    @inline
    def apply(
        ContactListName: js.UndefOr[ContactListName] = js.undefined,
        CreatedTimestamp: js.UndefOr[Timestamp] = js.undefined,
        Description: js.UndefOr[Description] = js.undefined,
        LastUpdatedTimestamp: js.UndefOr[Timestamp] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined,
        Topics: js.UndefOr[Topics] = js.undefined
    ): GetContactListResponse = {
      val __obj = js.Dynamic.literal()
      ContactListName.foreach(__v => __obj.updateDynamic("ContactListName")(__v.asInstanceOf[js.Any]))
      CreatedTimestamp.foreach(__v => __obj.updateDynamic("CreatedTimestamp")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      LastUpdatedTimestamp.foreach(__v => __obj.updateDynamic("LastUpdatedTimestamp")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      Topics.foreach(__v => __obj.updateDynamic("Topics")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetContactListResponse]
    }
  }

  @js.native
  trait GetContactRequest extends js.Object {
    var ContactListName: ContactListName
    var EmailAddress: EmailAddress
  }

  object GetContactRequest {
    @inline
    def apply(
        ContactListName: ContactListName,
        EmailAddress: EmailAddress
    ): GetContactRequest = {
      val __obj = js.Dynamic.literal(
        "ContactListName" -> ContactListName.asInstanceOf[js.Any],
        "EmailAddress" -> EmailAddress.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetContactRequest]
    }
  }

  @js.native
  trait GetContactResponse extends js.Object {
    var AttributesData: js.UndefOr[AttributesData]
    var ContactListName: js.UndefOr[ContactListName]
    var CreatedTimestamp: js.UndefOr[Timestamp]
    var EmailAddress: js.UndefOr[EmailAddress]
    var LastUpdatedTimestamp: js.UndefOr[Timestamp]
    var TopicDefaultPreferences: js.UndefOr[TopicPreferenceList]
    var TopicPreferences: js.UndefOr[TopicPreferenceList]
    var UnsubscribeAll: js.UndefOr[UnsubscribeAll]
  }

  object GetContactResponse {
    @inline
    def apply(
        AttributesData: js.UndefOr[AttributesData] = js.undefined,
        ContactListName: js.UndefOr[ContactListName] = js.undefined,
        CreatedTimestamp: js.UndefOr[Timestamp] = js.undefined,
        EmailAddress: js.UndefOr[EmailAddress] = js.undefined,
        LastUpdatedTimestamp: js.UndefOr[Timestamp] = js.undefined,
        TopicDefaultPreferences: js.UndefOr[TopicPreferenceList] = js.undefined,
        TopicPreferences: js.UndefOr[TopicPreferenceList] = js.undefined,
        UnsubscribeAll: js.UndefOr[UnsubscribeAll] = js.undefined
    ): GetContactResponse = {
      val __obj = js.Dynamic.literal()
      AttributesData.foreach(__v => __obj.updateDynamic("AttributesData")(__v.asInstanceOf[js.Any]))
      ContactListName.foreach(__v => __obj.updateDynamic("ContactListName")(__v.asInstanceOf[js.Any]))
      CreatedTimestamp.foreach(__v => __obj.updateDynamic("CreatedTimestamp")(__v.asInstanceOf[js.Any]))
      EmailAddress.foreach(__v => __obj.updateDynamic("EmailAddress")(__v.asInstanceOf[js.Any]))
      LastUpdatedTimestamp.foreach(__v => __obj.updateDynamic("LastUpdatedTimestamp")(__v.asInstanceOf[js.Any]))
      TopicDefaultPreferences.foreach(__v => __obj.updateDynamic("TopicDefaultPreferences")(__v.asInstanceOf[js.Any]))
      TopicPreferences.foreach(__v => __obj.updateDynamic("TopicPreferences")(__v.asInstanceOf[js.Any]))
      UnsubscribeAll.foreach(__v => __obj.updateDynamic("UnsubscribeAll")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetContactResponse]
    }
  }

  /** Represents a request to retrieve an existing custom verification email template.
    */
  @js.native
  trait GetCustomVerificationEmailTemplateRequest extends js.Object {
    var TemplateName: EmailTemplateName
  }

  object GetCustomVerificationEmailTemplateRequest {
    @inline
    def apply(
        TemplateName: EmailTemplateName
    ): GetCustomVerificationEmailTemplateRequest = {
      val __obj = js.Dynamic.literal(
        "TemplateName" -> TemplateName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetCustomVerificationEmailTemplateRequest]
    }
  }

  /** The following elements are returned by the service.
    */
  @js.native
  trait GetCustomVerificationEmailTemplateResponse extends js.Object {
    var FailureRedirectionURL: js.UndefOr[FailureRedirectionURL]
    var FromEmailAddress: js.UndefOr[EmailAddress]
    var SuccessRedirectionURL: js.UndefOr[SuccessRedirectionURL]
    var TemplateContent: js.UndefOr[TemplateContent]
    var TemplateName: js.UndefOr[EmailTemplateName]
    var TemplateSubject: js.UndefOr[EmailTemplateSubject]
  }

  object GetCustomVerificationEmailTemplateResponse {
    @inline
    def apply(
        FailureRedirectionURL: js.UndefOr[FailureRedirectionURL] = js.undefined,
        FromEmailAddress: js.UndefOr[EmailAddress] = js.undefined,
        SuccessRedirectionURL: js.UndefOr[SuccessRedirectionURL] = js.undefined,
        TemplateContent: js.UndefOr[TemplateContent] = js.undefined,
        TemplateName: js.UndefOr[EmailTemplateName] = js.undefined,
        TemplateSubject: js.UndefOr[EmailTemplateSubject] = js.undefined
    ): GetCustomVerificationEmailTemplateResponse = {
      val __obj = js.Dynamic.literal()
      FailureRedirectionURL.foreach(__v => __obj.updateDynamic("FailureRedirectionURL")(__v.asInstanceOf[js.Any]))
      FromEmailAddress.foreach(__v => __obj.updateDynamic("FromEmailAddress")(__v.asInstanceOf[js.Any]))
      SuccessRedirectionURL.foreach(__v => __obj.updateDynamic("SuccessRedirectionURL")(__v.asInstanceOf[js.Any]))
      TemplateContent.foreach(__v => __obj.updateDynamic("TemplateContent")(__v.asInstanceOf[js.Any]))
      TemplateName.foreach(__v => __obj.updateDynamic("TemplateName")(__v.asInstanceOf[js.Any]))
      TemplateSubject.foreach(__v => __obj.updateDynamic("TemplateSubject")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetCustomVerificationEmailTemplateResponse]
    }
  }

  /** A request to obtain more information about a dedicated IP pool.
    */
  @js.native
  trait GetDedicatedIpPoolRequest extends js.Object {
    var PoolName: PoolName
  }

  object GetDedicatedIpPoolRequest {
    @inline
    def apply(
        PoolName: PoolName
    ): GetDedicatedIpPoolRequest = {
      val __obj = js.Dynamic.literal(
        "PoolName" -> PoolName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetDedicatedIpPoolRequest]
    }
  }

  /** The following element is returned by the service.
    */
  @js.native
  trait GetDedicatedIpPoolResponse extends js.Object {
    var DedicatedIpPool: js.UndefOr[DedicatedIpPool]
  }

  object GetDedicatedIpPoolResponse {
    @inline
    def apply(
        DedicatedIpPool: js.UndefOr[DedicatedIpPool] = js.undefined
    ): GetDedicatedIpPoolResponse = {
      val __obj = js.Dynamic.literal()
      DedicatedIpPool.foreach(__v => __obj.updateDynamic("DedicatedIpPool")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDedicatedIpPoolResponse]
    }
  }

  /** A request to obtain more information about a dedicated IP address.
    */
  @js.native
  trait GetDedicatedIpRequest extends js.Object {
    var Ip: Ip
  }

  object GetDedicatedIpRequest {
    @inline
    def apply(
        Ip: Ip
    ): GetDedicatedIpRequest = {
      val __obj = js.Dynamic.literal(
        "Ip" -> Ip.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetDedicatedIpRequest]
    }
  }

  /** Information about a dedicated IP address.
    */
  @js.native
  trait GetDedicatedIpResponse extends js.Object {
    var DedicatedIp: js.UndefOr[DedicatedIp]
  }

  object GetDedicatedIpResponse {
    @inline
    def apply(
        DedicatedIp: js.UndefOr[DedicatedIp] = js.undefined
    ): GetDedicatedIpResponse = {
      val __obj = js.Dynamic.literal()
      DedicatedIp.foreach(__v => __obj.updateDynamic("DedicatedIp")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDedicatedIpResponse]
    }
  }

  /** A request to obtain more information about dedicated IP pools.
    */
  @js.native
  trait GetDedicatedIpsRequest extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var PageSize: js.UndefOr[MaxItems]
    var PoolName: js.UndefOr[PoolName]
  }

  object GetDedicatedIpsRequest {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        PageSize: js.UndefOr[MaxItems] = js.undefined,
        PoolName: js.UndefOr[PoolName] = js.undefined
    ): GetDedicatedIpsRequest = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      PageSize.foreach(__v => __obj.updateDynamic("PageSize")(__v.asInstanceOf[js.Any]))
      PoolName.foreach(__v => __obj.updateDynamic("PoolName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDedicatedIpsRequest]
    }
  }

  /** Information about the dedicated IP addresses that are associated with your Amazon Web Services account.
    */
  @js.native
  trait GetDedicatedIpsResponse extends js.Object {
    var DedicatedIps: js.UndefOr[DedicatedIpList]
    var NextToken: js.UndefOr[NextToken]
  }

  object GetDedicatedIpsResponse {
    @inline
    def apply(
        DedicatedIps: js.UndefOr[DedicatedIpList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): GetDedicatedIpsResponse = {
      val __obj = js.Dynamic.literal()
      DedicatedIps.foreach(__v => __obj.updateDynamic("DedicatedIps")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDedicatedIpsResponse]
    }
  }

  /** Retrieve information about the status of the Deliverability dashboard for your Amazon Web Services account. When the Deliverability dashboard is enabled, you gain access to reputation, deliverability, and other metrics for your domains. You also gain the ability to perform predictive inbox placement tests. When you use the Deliverability dashboard, you pay a monthly subscription charge, in addition to any other fees that you accrue by using Amazon SES and other Amazon Web Services services. For more information about the features and cost of a Deliverability dashboard subscription, see [[http://aws.amazon.com/pinpoint/pricing/|Amazon Pinpoint Pricing]].
    */
  @js.native
  trait GetDeliverabilityDashboardOptionsRequest extends js.Object

  object GetDeliverabilityDashboardOptionsRequest {
    @inline
    def apply(): GetDeliverabilityDashboardOptionsRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetDeliverabilityDashboardOptionsRequest]
    }
  }

  /** An object that shows the status of the Deliverability dashboard.
    */
  @js.native
  trait GetDeliverabilityDashboardOptionsResponse extends js.Object {
    var DashboardEnabled: Enabled
    var AccountStatus: js.UndefOr[DeliverabilityDashboardAccountStatus]
    var ActiveSubscribedDomains: js.UndefOr[DomainDeliverabilityTrackingOptions]
    var PendingExpirationSubscribedDomains: js.UndefOr[DomainDeliverabilityTrackingOptions]
    var SubscriptionExpiryDate: js.UndefOr[Timestamp]
  }

  object GetDeliverabilityDashboardOptionsResponse {
    @inline
    def apply(
        DashboardEnabled: Enabled,
        AccountStatus: js.UndefOr[DeliverabilityDashboardAccountStatus] = js.undefined,
        ActiveSubscribedDomains: js.UndefOr[DomainDeliverabilityTrackingOptions] = js.undefined,
        PendingExpirationSubscribedDomains: js.UndefOr[DomainDeliverabilityTrackingOptions] = js.undefined,
        SubscriptionExpiryDate: js.UndefOr[Timestamp] = js.undefined
    ): GetDeliverabilityDashboardOptionsResponse = {
      val __obj = js.Dynamic.literal(
        "DashboardEnabled" -> DashboardEnabled.asInstanceOf[js.Any]
      )

      AccountStatus.foreach(__v => __obj.updateDynamic("AccountStatus")(__v.asInstanceOf[js.Any]))
      ActiveSubscribedDomains.foreach(__v => __obj.updateDynamic("ActiveSubscribedDomains")(__v.asInstanceOf[js.Any]))
      PendingExpirationSubscribedDomains.foreach(__v => __obj.updateDynamic("PendingExpirationSubscribedDomains")(__v.asInstanceOf[js.Any]))
      SubscriptionExpiryDate.foreach(__v => __obj.updateDynamic("SubscriptionExpiryDate")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDeliverabilityDashboardOptionsResponse]
    }
  }

  /** A request to retrieve the results of a predictive inbox placement test.
    */
  @js.native
  trait GetDeliverabilityTestReportRequest extends js.Object {
    var ReportId: ReportId
  }

  object GetDeliverabilityTestReportRequest {
    @inline
    def apply(
        ReportId: ReportId
    ): GetDeliverabilityTestReportRequest = {
      val __obj = js.Dynamic.literal(
        "ReportId" -> ReportId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetDeliverabilityTestReportRequest]
    }
  }

  /** The results of the predictive inbox placement test.
    */
  @js.native
  trait GetDeliverabilityTestReportResponse extends js.Object {
    var DeliverabilityTestReport: DeliverabilityTestReport
    var IspPlacements: IspPlacements
    var OverallPlacement: PlacementStatistics
    var Message: js.UndefOr[MessageContent]
    var Tags: js.UndefOr[TagList]
  }

  object GetDeliverabilityTestReportResponse {
    @inline
    def apply(
        DeliverabilityTestReport: DeliverabilityTestReport,
        IspPlacements: IspPlacements,
        OverallPlacement: PlacementStatistics,
        Message: js.UndefOr[MessageContent] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): GetDeliverabilityTestReportResponse = {
      val __obj = js.Dynamic.literal(
        "DeliverabilityTestReport" -> DeliverabilityTestReport.asInstanceOf[js.Any],
        "IspPlacements" -> IspPlacements.asInstanceOf[js.Any],
        "OverallPlacement" -> OverallPlacement.asInstanceOf[js.Any]
      )

      Message.foreach(__v => __obj.updateDynamic("Message")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDeliverabilityTestReportResponse]
    }
  }

  /** Retrieve all the deliverability data for a specific campaign. This data is available for a campaign only if the campaign sent email by using a domain that the Deliverability dashboard is enabled for (<code>PutDeliverabilityDashboardOption</code> operation).
    */
  @js.native
  trait GetDomainDeliverabilityCampaignRequest extends js.Object {
    var CampaignId: CampaignId
  }

  object GetDomainDeliverabilityCampaignRequest {
    @inline
    def apply(
        CampaignId: CampaignId
    ): GetDomainDeliverabilityCampaignRequest = {
      val __obj = js.Dynamic.literal(
        "CampaignId" -> CampaignId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetDomainDeliverabilityCampaignRequest]
    }
  }

  /** An object that contains all the deliverability data for a specific campaign. This data is available for a campaign only if the campaign sent email by using a domain that the Deliverability dashboard is enabled for.
    */
  @js.native
  trait GetDomainDeliverabilityCampaignResponse extends js.Object {
    var DomainDeliverabilityCampaign: DomainDeliverabilityCampaign
  }

  object GetDomainDeliverabilityCampaignResponse {
    @inline
    def apply(
        DomainDeliverabilityCampaign: DomainDeliverabilityCampaign
    ): GetDomainDeliverabilityCampaignResponse = {
      val __obj = js.Dynamic.literal(
        "DomainDeliverabilityCampaign" -> DomainDeliverabilityCampaign.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetDomainDeliverabilityCampaignResponse]
    }
  }

  /** A request to obtain deliverability metrics for a domain.
    */
  @js.native
  trait GetDomainStatisticsReportRequest extends js.Object {
    var Domain: Identity
    var EndDate: Timestamp
    var StartDate: Timestamp
  }

  object GetDomainStatisticsReportRequest {
    @inline
    def apply(
        Domain: Identity,
        EndDate: Timestamp,
        StartDate: Timestamp
    ): GetDomainStatisticsReportRequest = {
      val __obj = js.Dynamic.literal(
        "Domain" -> Domain.asInstanceOf[js.Any],
        "EndDate" -> EndDate.asInstanceOf[js.Any],
        "StartDate" -> StartDate.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetDomainStatisticsReportRequest]
    }
  }

  /** An object that includes statistics that are related to the domain that you specified.
    */
  @js.native
  trait GetDomainStatisticsReportResponse extends js.Object {
    var DailyVolumes: DailyVolumes
    var OverallVolume: OverallVolume
  }

  object GetDomainStatisticsReportResponse {
    @inline
    def apply(
        DailyVolumes: DailyVolumes,
        OverallVolume: OverallVolume
    ): GetDomainStatisticsReportResponse = {
      val __obj = js.Dynamic.literal(
        "DailyVolumes" -> DailyVolumes.asInstanceOf[js.Any],
        "OverallVolume" -> OverallVolume.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetDomainStatisticsReportResponse]
    }
  }

  /** A request to return the policies of an email identity.
    */
  @js.native
  trait GetEmailIdentityPoliciesRequest extends js.Object {
    var EmailIdentity: Identity
  }

  object GetEmailIdentityPoliciesRequest {
    @inline
    def apply(
        EmailIdentity: Identity
    ): GetEmailIdentityPoliciesRequest = {
      val __obj = js.Dynamic.literal(
        "EmailIdentity" -> EmailIdentity.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetEmailIdentityPoliciesRequest]
    }
  }

  /** Identity policies associated with email identity.
    */
  @js.native
  trait GetEmailIdentityPoliciesResponse extends js.Object {
    var Policies: js.UndefOr[PolicyMap]
  }

  object GetEmailIdentityPoliciesResponse {
    @inline
    def apply(
        Policies: js.UndefOr[PolicyMap] = js.undefined
    ): GetEmailIdentityPoliciesResponse = {
      val __obj = js.Dynamic.literal()
      Policies.foreach(__v => __obj.updateDynamic("Policies")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetEmailIdentityPoliciesResponse]
    }
  }

  /** A request to return details about an email identity.
    */
  @js.native
  trait GetEmailIdentityRequest extends js.Object {
    var EmailIdentity: Identity
  }

  object GetEmailIdentityRequest {
    @inline
    def apply(
        EmailIdentity: Identity
    ): GetEmailIdentityRequest = {
      val __obj = js.Dynamic.literal(
        "EmailIdentity" -> EmailIdentity.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetEmailIdentityRequest]
    }
  }

  /** Details about an email identity.
    */
  @js.native
  trait GetEmailIdentityResponse extends js.Object {
    var ConfigurationSetName: js.UndefOr[ConfigurationSetName]
    var DkimAttributes: js.UndefOr[DkimAttributes]
    var FeedbackForwardingStatus: js.UndefOr[Enabled]
    var IdentityType: js.UndefOr[IdentityType]
    var MailFromAttributes: js.UndefOr[MailFromAttributes]
    var Policies: js.UndefOr[PolicyMap]
    var Tags: js.UndefOr[TagList]
    var VerificationStatus: js.UndefOr[VerificationStatus]
    var VerifiedForSendingStatus: js.UndefOr[Enabled]
  }

  object GetEmailIdentityResponse {
    @inline
    def apply(
        ConfigurationSetName: js.UndefOr[ConfigurationSetName] = js.undefined,
        DkimAttributes: js.UndefOr[DkimAttributes] = js.undefined,
        FeedbackForwardingStatus: js.UndefOr[Enabled] = js.undefined,
        IdentityType: js.UndefOr[IdentityType] = js.undefined,
        MailFromAttributes: js.UndefOr[MailFromAttributes] = js.undefined,
        Policies: js.UndefOr[PolicyMap] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined,
        VerificationStatus: js.UndefOr[VerificationStatus] = js.undefined,
        VerifiedForSendingStatus: js.UndefOr[Enabled] = js.undefined
    ): GetEmailIdentityResponse = {
      val __obj = js.Dynamic.literal()
      ConfigurationSetName.foreach(__v => __obj.updateDynamic("ConfigurationSetName")(__v.asInstanceOf[js.Any]))
      DkimAttributes.foreach(__v => __obj.updateDynamic("DkimAttributes")(__v.asInstanceOf[js.Any]))
      FeedbackForwardingStatus.foreach(__v => __obj.updateDynamic("FeedbackForwardingStatus")(__v.asInstanceOf[js.Any]))
      IdentityType.foreach(__v => __obj.updateDynamic("IdentityType")(__v.asInstanceOf[js.Any]))
      MailFromAttributes.foreach(__v => __obj.updateDynamic("MailFromAttributes")(__v.asInstanceOf[js.Any]))
      Policies.foreach(__v => __obj.updateDynamic("Policies")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      VerificationStatus.foreach(__v => __obj.updateDynamic("VerificationStatus")(__v.asInstanceOf[js.Any]))
      VerifiedForSendingStatus.foreach(__v => __obj.updateDynamic("VerifiedForSendingStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetEmailIdentityResponse]
    }
  }

  /** Represents a request to display the template object (which includes the subject line, HTML part and text part) for the template you specify.
    */
  @js.native
  trait GetEmailTemplateRequest extends js.Object {
    var TemplateName: EmailTemplateName
  }

  object GetEmailTemplateRequest {
    @inline
    def apply(
        TemplateName: EmailTemplateName
    ): GetEmailTemplateRequest = {
      val __obj = js.Dynamic.literal(
        "TemplateName" -> TemplateName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetEmailTemplateRequest]
    }
  }

  /** The following element is returned by the service.
    */
  @js.native
  trait GetEmailTemplateResponse extends js.Object {
    var TemplateContent: EmailTemplateContent
    var TemplateName: EmailTemplateName
  }

  object GetEmailTemplateResponse {
    @inline
    def apply(
        TemplateContent: EmailTemplateContent,
        TemplateName: EmailTemplateName
    ): GetEmailTemplateResponse = {
      val __obj = js.Dynamic.literal(
        "TemplateContent" -> TemplateContent.asInstanceOf[js.Any],
        "TemplateName" -> TemplateName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetEmailTemplateResponse]
    }
  }

  /** Represents a request for information about an import job using the import job ID.
    */
  @js.native
  trait GetImportJobRequest extends js.Object {
    var JobId: JobId
  }

  object GetImportJobRequest {
    @inline
    def apply(
        JobId: JobId
    ): GetImportJobRequest = {
      val __obj = js.Dynamic.literal(
        "JobId" -> JobId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetImportJobRequest]
    }
  }

  /** An HTTP 200 response if the request succeeds, or an error message if the request fails.
    */
  @js.native
  trait GetImportJobResponse extends js.Object {
    var CompletedTimestamp: js.UndefOr[Timestamp]
    var CreatedTimestamp: js.UndefOr[Timestamp]
    var FailedRecordsCount: js.UndefOr[FailedRecordsCount]
    var FailureInfo: js.UndefOr[FailureInfo]
    var ImportDataSource: js.UndefOr[ImportDataSource]
    var ImportDestination: js.UndefOr[ImportDestination]
    var JobId: js.UndefOr[JobId]
    var JobStatus: js.UndefOr[JobStatus]
    var ProcessedRecordsCount: js.UndefOr[ProcessedRecordsCount]
  }

  object GetImportJobResponse {
    @inline
    def apply(
        CompletedTimestamp: js.UndefOr[Timestamp] = js.undefined,
        CreatedTimestamp: js.UndefOr[Timestamp] = js.undefined,
        FailedRecordsCount: js.UndefOr[FailedRecordsCount] = js.undefined,
        FailureInfo: js.UndefOr[FailureInfo] = js.undefined,
        ImportDataSource: js.UndefOr[ImportDataSource] = js.undefined,
        ImportDestination: js.UndefOr[ImportDestination] = js.undefined,
        JobId: js.UndefOr[JobId] = js.undefined,
        JobStatus: js.UndefOr[JobStatus] = js.undefined,
        ProcessedRecordsCount: js.UndefOr[ProcessedRecordsCount] = js.undefined
    ): GetImportJobResponse = {
      val __obj = js.Dynamic.literal()
      CompletedTimestamp.foreach(__v => __obj.updateDynamic("CompletedTimestamp")(__v.asInstanceOf[js.Any]))
      CreatedTimestamp.foreach(__v => __obj.updateDynamic("CreatedTimestamp")(__v.asInstanceOf[js.Any]))
      FailedRecordsCount.foreach(__v => __obj.updateDynamic("FailedRecordsCount")(__v.asInstanceOf[js.Any]))
      FailureInfo.foreach(__v => __obj.updateDynamic("FailureInfo")(__v.asInstanceOf[js.Any]))
      ImportDataSource.foreach(__v => __obj.updateDynamic("ImportDataSource")(__v.asInstanceOf[js.Any]))
      ImportDestination.foreach(__v => __obj.updateDynamic("ImportDestination")(__v.asInstanceOf[js.Any]))
      JobId.foreach(__v => __obj.updateDynamic("JobId")(__v.asInstanceOf[js.Any]))
      JobStatus.foreach(__v => __obj.updateDynamic("JobStatus")(__v.asInstanceOf[js.Any]))
      ProcessedRecordsCount.foreach(__v => __obj.updateDynamic("ProcessedRecordsCount")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetImportJobResponse]
    }
  }

  /** A request to retrieve information about an email address that's on the suppression list for your account.
    */
  @js.native
  trait GetSuppressedDestinationRequest extends js.Object {
    var EmailAddress: EmailAddress
  }

  object GetSuppressedDestinationRequest {
    @inline
    def apply(
        EmailAddress: EmailAddress
    ): GetSuppressedDestinationRequest = {
      val __obj = js.Dynamic.literal(
        "EmailAddress" -> EmailAddress.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetSuppressedDestinationRequest]
    }
  }

  /** Information about the suppressed email address.
    */
  @js.native
  trait GetSuppressedDestinationResponse extends js.Object {
    var SuppressedDestination: SuppressedDestination
  }

  object GetSuppressedDestinationResponse {
    @inline
    def apply(
        SuppressedDestination: SuppressedDestination
    ): GetSuppressedDestinationResponse = {
      val __obj = js.Dynamic.literal(
        "SuppressedDestination" -> SuppressedDestination.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetSuppressedDestinationResponse]
    }
  }

  /** An object containing additional settings for your VDM configuration as applicable to the Guardian.
    */
  @js.native
  trait GuardianAttributes extends js.Object {
    var OptimizedSharedDelivery: js.UndefOr[FeatureStatus]
  }

  object GuardianAttributes {
    @inline
    def apply(
        OptimizedSharedDelivery: js.UndefOr[FeatureStatus] = js.undefined
    ): GuardianAttributes = {
      val __obj = js.Dynamic.literal()
      OptimizedSharedDelivery.foreach(__v => __obj.updateDynamic("OptimizedSharedDelivery")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GuardianAttributes]
    }
  }

  /** An object containing additional settings for your VDM configuration as applicable to the Guardian.
    */
  @js.native
  trait GuardianOptions extends js.Object {
    var OptimizedSharedDelivery: js.UndefOr[FeatureStatus]
  }

  object GuardianOptions {
    @inline
    def apply(
        OptimizedSharedDelivery: js.UndefOr[FeatureStatus] = js.undefined
    ): GuardianOptions = {
      val __obj = js.Dynamic.literal()
      OptimizedSharedDelivery.foreach(__v => __obj.updateDynamic("OptimizedSharedDelivery")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GuardianOptions]
    }
  }

  /** Information about an email identity.
    */
  @js.native
  trait IdentityInfo extends js.Object {
    var IdentityName: js.UndefOr[Identity]
    var IdentityType: js.UndefOr[IdentityType]
    var SendingEnabled: js.UndefOr[Enabled]
    var VerificationStatus: js.UndefOr[VerificationStatus]
  }

  object IdentityInfo {
    @inline
    def apply(
        IdentityName: js.UndefOr[Identity] = js.undefined,
        IdentityType: js.UndefOr[IdentityType] = js.undefined,
        SendingEnabled: js.UndefOr[Enabled] = js.undefined,
        VerificationStatus: js.UndefOr[VerificationStatus] = js.undefined
    ): IdentityInfo = {
      val __obj = js.Dynamic.literal()
      IdentityName.foreach(__v => __obj.updateDynamic("IdentityName")(__v.asInstanceOf[js.Any]))
      IdentityType.foreach(__v => __obj.updateDynamic("IdentityType")(__v.asInstanceOf[js.Any]))
      SendingEnabled.foreach(__v => __obj.updateDynamic("SendingEnabled")(__v.asInstanceOf[js.Any]))
      VerificationStatus.foreach(__v => __obj.updateDynamic("VerificationStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[IdentityInfo]
    }
  }

  /** An object that contains details about the data source of the import job.
    */
  @js.native
  trait ImportDataSource extends js.Object {
    var DataFormat: DataFormat
    var S3Url: S3Url
  }

  object ImportDataSource {
    @inline
    def apply(
        DataFormat: DataFormat,
        S3Url: S3Url
    ): ImportDataSource = {
      val __obj = js.Dynamic.literal(
        "DataFormat" -> DataFormat.asInstanceOf[js.Any],
        "S3Url" -> S3Url.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ImportDataSource]
    }
  }

  /** An object that contains details about the resource destination the import job is going to target.
    */
  @js.native
  trait ImportDestination extends js.Object {
    var ContactListDestination: js.UndefOr[ContactListDestination]
    var SuppressionListDestination: js.UndefOr[SuppressionListDestination]
  }

  object ImportDestination {
    @inline
    def apply(
        ContactListDestination: js.UndefOr[ContactListDestination] = js.undefined,
        SuppressionListDestination: js.UndefOr[SuppressionListDestination] = js.undefined
    ): ImportDestination = {
      val __obj = js.Dynamic.literal()
      ContactListDestination.foreach(__v => __obj.updateDynamic("ContactListDestination")(__v.asInstanceOf[js.Any]))
      SuppressionListDestination.foreach(__v => __obj.updateDynamic("SuppressionListDestination")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ImportDestination]
    }
  }

  /** A summary of the import job.
    */
  @js.native
  trait ImportJobSummary extends js.Object {
    var CreatedTimestamp: js.UndefOr[Timestamp]
    var FailedRecordsCount: js.UndefOr[FailedRecordsCount]
    var ImportDestination: js.UndefOr[ImportDestination]
    var JobId: js.UndefOr[JobId]
    var JobStatus: js.UndefOr[JobStatus]
    var ProcessedRecordsCount: js.UndefOr[ProcessedRecordsCount]
  }

  object ImportJobSummary {
    @inline
    def apply(
        CreatedTimestamp: js.UndefOr[Timestamp] = js.undefined,
        FailedRecordsCount: js.UndefOr[FailedRecordsCount] = js.undefined,
        ImportDestination: js.UndefOr[ImportDestination] = js.undefined,
        JobId: js.UndefOr[JobId] = js.undefined,
        JobStatus: js.UndefOr[JobStatus] = js.undefined,
        ProcessedRecordsCount: js.UndefOr[ProcessedRecordsCount] = js.undefined
    ): ImportJobSummary = {
      val __obj = js.Dynamic.literal()
      CreatedTimestamp.foreach(__v => __obj.updateDynamic("CreatedTimestamp")(__v.asInstanceOf[js.Any]))
      FailedRecordsCount.foreach(__v => __obj.updateDynamic("FailedRecordsCount")(__v.asInstanceOf[js.Any]))
      ImportDestination.foreach(__v => __obj.updateDynamic("ImportDestination")(__v.asInstanceOf[js.Any]))
      JobId.foreach(__v => __obj.updateDynamic("JobId")(__v.asInstanceOf[js.Any]))
      JobStatus.foreach(__v => __obj.updateDynamic("JobStatus")(__v.asInstanceOf[js.Any]))
      ProcessedRecordsCount.foreach(__v => __obj.updateDynamic("ProcessedRecordsCount")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ImportJobSummary]
    }
  }

  /** An object that contains information about the inbox placement data settings for a verified domain that’s associated with your Amazon Web Services account. This data is available only if you enabled the Deliverability dashboard for the domain.
    */
  @js.native
  trait InboxPlacementTrackingOption extends js.Object {
    var Global: js.UndefOr[Enabled]
    var TrackedIsps: js.UndefOr[IspNameList]
  }

  object InboxPlacementTrackingOption {
    @inline
    def apply(
        Global: js.UndefOr[Enabled] = js.undefined,
        TrackedIsps: js.UndefOr[IspNameList] = js.undefined
    ): InboxPlacementTrackingOption = {
      val __obj = js.Dynamic.literal()
      Global.foreach(__v => __obj.updateDynamic("Global")(__v.asInstanceOf[js.Any]))
      TrackedIsps.foreach(__v => __obj.updateDynamic("TrackedIsps")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InboxPlacementTrackingOption]
    }
  }

  /** An object that describes how email sent during the predictive inbox placement test was handled by a certain email provider.
    */
  @js.native
  trait IspPlacement extends js.Object {
    var IspName: js.UndefOr[IspName]
    var PlacementStatistics: js.UndefOr[PlacementStatistics]
  }

  object IspPlacement {
    @inline
    def apply(
        IspName: js.UndefOr[IspName] = js.undefined,
        PlacementStatistics: js.UndefOr[PlacementStatistics] = js.undefined
    ): IspPlacement = {
      val __obj = js.Dynamic.literal()
      IspName.foreach(__v => __obj.updateDynamic("IspName")(__v.asInstanceOf[js.Any]))
      PlacementStatistics.foreach(__v => __obj.updateDynamic("PlacementStatistics")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[IspPlacement]
    }
  }

  /** An object that defines an Amazon Kinesis Data Firehose destination for email events. You can use Amazon Kinesis Data Firehose to stream data to other services, such as Amazon S3 and Amazon Redshift.
    */
  @js.native
  trait KinesisFirehoseDestination extends js.Object {
    var DeliveryStreamArn: AmazonResourceName
    var IamRoleArn: AmazonResourceName
  }

  object KinesisFirehoseDestination {
    @inline
    def apply(
        DeliveryStreamArn: AmazonResourceName,
        IamRoleArn: AmazonResourceName
    ): KinesisFirehoseDestination = {
      val __obj = js.Dynamic.literal(
        "DeliveryStreamArn" -> DeliveryStreamArn.asInstanceOf[js.Any],
        "IamRoleArn" -> IamRoleArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[KinesisFirehoseDestination]
    }
  }

  /** A request to obtain a list of configuration sets for your Amazon SES account in the current Amazon Web Services Region.
    */
  @js.native
  trait ListConfigurationSetsRequest extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var PageSize: js.UndefOr[MaxItems]
  }

  object ListConfigurationSetsRequest {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        PageSize: js.UndefOr[MaxItems] = js.undefined
    ): ListConfigurationSetsRequest = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      PageSize.foreach(__v => __obj.updateDynamic("PageSize")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListConfigurationSetsRequest]
    }
  }

  /** A list of configuration sets in your Amazon SES account in the current Amazon Web Services Region.
    */
  @js.native
  trait ListConfigurationSetsResponse extends js.Object {
    var ConfigurationSets: js.UndefOr[ConfigurationSetNameList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListConfigurationSetsResponse {
    @inline
    def apply(
        ConfigurationSets: js.UndefOr[ConfigurationSetNameList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListConfigurationSetsResponse = {
      val __obj = js.Dynamic.literal()
      ConfigurationSets.foreach(__v => __obj.updateDynamic("ConfigurationSets")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListConfigurationSetsResponse]
    }
  }

  @js.native
  trait ListContactListsRequest extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var PageSize: js.UndefOr[MaxItems]
  }

  object ListContactListsRequest {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        PageSize: js.UndefOr[MaxItems] = js.undefined
    ): ListContactListsRequest = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      PageSize.foreach(__v => __obj.updateDynamic("PageSize")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListContactListsRequest]
    }
  }

  @js.native
  trait ListContactListsResponse extends js.Object {
    var ContactLists: js.UndefOr[ListOfContactLists]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListContactListsResponse {
    @inline
    def apply(
        ContactLists: js.UndefOr[ListOfContactLists] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListContactListsResponse = {
      val __obj = js.Dynamic.literal()
      ContactLists.foreach(__v => __obj.updateDynamic("ContactLists")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListContactListsResponse]
    }
  }

  /** A filter that can be applied to a list of contacts.
    */
  @js.native
  trait ListContactsFilter extends js.Object {
    var FilteredStatus: js.UndefOr[SubscriptionStatus]
    var TopicFilter: js.UndefOr[TopicFilter]
  }

  object ListContactsFilter {
    @inline
    def apply(
        FilteredStatus: js.UndefOr[SubscriptionStatus] = js.undefined,
        TopicFilter: js.UndefOr[TopicFilter] = js.undefined
    ): ListContactsFilter = {
      val __obj = js.Dynamic.literal()
      FilteredStatus.foreach(__v => __obj.updateDynamic("FilteredStatus")(__v.asInstanceOf[js.Any]))
      TopicFilter.foreach(__v => __obj.updateDynamic("TopicFilter")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListContactsFilter]
    }
  }

  @js.native
  trait ListContactsRequest extends js.Object {
    var ContactListName: ContactListName
    var Filter: js.UndefOr[ListContactsFilter]
    var NextToken: js.UndefOr[NextToken]
    var PageSize: js.UndefOr[MaxItems]
  }

  object ListContactsRequest {
    @inline
    def apply(
        ContactListName: ContactListName,
        Filter: js.UndefOr[ListContactsFilter] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        PageSize: js.UndefOr[MaxItems] = js.undefined
    ): ListContactsRequest = {
      val __obj = js.Dynamic.literal(
        "ContactListName" -> ContactListName.asInstanceOf[js.Any]
      )

      Filter.foreach(__v => __obj.updateDynamic("Filter")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      PageSize.foreach(__v => __obj.updateDynamic("PageSize")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListContactsRequest]
    }
  }

  @js.native
  trait ListContactsResponse extends js.Object {
    var Contacts: js.UndefOr[ListOfContacts]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListContactsResponse {
    @inline
    def apply(
        Contacts: js.UndefOr[ListOfContacts] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListContactsResponse = {
      val __obj = js.Dynamic.literal()
      Contacts.foreach(__v => __obj.updateDynamic("Contacts")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListContactsResponse]
    }
  }

  /** Represents a request to list the existing custom verification email templates for your account.
    */
  @js.native
  trait ListCustomVerificationEmailTemplatesRequest extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var PageSize: js.UndefOr[MaxItems]
  }

  object ListCustomVerificationEmailTemplatesRequest {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        PageSize: js.UndefOr[MaxItems] = js.undefined
    ): ListCustomVerificationEmailTemplatesRequest = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      PageSize.foreach(__v => __obj.updateDynamic("PageSize")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListCustomVerificationEmailTemplatesRequest]
    }
  }

  /** The following elements are returned by the service.
    */
  @js.native
  trait ListCustomVerificationEmailTemplatesResponse extends js.Object {
    var CustomVerificationEmailTemplates: js.UndefOr[CustomVerificationEmailTemplatesList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListCustomVerificationEmailTemplatesResponse {
    @inline
    def apply(
        CustomVerificationEmailTemplates: js.UndefOr[CustomVerificationEmailTemplatesList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListCustomVerificationEmailTemplatesResponse = {
      val __obj = js.Dynamic.literal()
      CustomVerificationEmailTemplates.foreach(__v => __obj.updateDynamic("CustomVerificationEmailTemplates")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListCustomVerificationEmailTemplatesResponse]
    }
  }

  /** A request to obtain a list of dedicated IP pools.
    */
  @js.native
  trait ListDedicatedIpPoolsRequest extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var PageSize: js.UndefOr[MaxItems]
  }

  object ListDedicatedIpPoolsRequest {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        PageSize: js.UndefOr[MaxItems] = js.undefined
    ): ListDedicatedIpPoolsRequest = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      PageSize.foreach(__v => __obj.updateDynamic("PageSize")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDedicatedIpPoolsRequest]
    }
  }

  /** A list of dedicated IP pools.
    */
  @js.native
  trait ListDedicatedIpPoolsResponse extends js.Object {
    var DedicatedIpPools: js.UndefOr[ListOfDedicatedIpPools]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListDedicatedIpPoolsResponse {
    @inline
    def apply(
        DedicatedIpPools: js.UndefOr[ListOfDedicatedIpPools] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListDedicatedIpPoolsResponse = {
      val __obj = js.Dynamic.literal()
      DedicatedIpPools.foreach(__v => __obj.updateDynamic("DedicatedIpPools")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDedicatedIpPoolsResponse]
    }
  }

  /** A request to list all of the predictive inbox placement tests that you've performed.
    */
  @js.native
  trait ListDeliverabilityTestReportsRequest extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var PageSize: js.UndefOr[MaxItems]
  }

  object ListDeliverabilityTestReportsRequest {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        PageSize: js.UndefOr[MaxItems] = js.undefined
    ): ListDeliverabilityTestReportsRequest = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      PageSize.foreach(__v => __obj.updateDynamic("PageSize")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDeliverabilityTestReportsRequest]
    }
  }

  /** A list of the predictive inbox placement test reports that are available for your account, regardless of whether or not those tests are complete.
    */
  @js.native
  trait ListDeliverabilityTestReportsResponse extends js.Object {
    var DeliverabilityTestReports: DeliverabilityTestReports
    var NextToken: js.UndefOr[NextToken]
  }

  object ListDeliverabilityTestReportsResponse {
    @inline
    def apply(
        DeliverabilityTestReports: DeliverabilityTestReports,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListDeliverabilityTestReportsResponse = {
      val __obj = js.Dynamic.literal(
        "DeliverabilityTestReports" -> DeliverabilityTestReports.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDeliverabilityTestReportsResponse]
    }
  }

  /** Retrieve deliverability data for all the campaigns that used a specific domain to send email during a specified time range. This data is available for a domain only if you enabled the Deliverability dashboard.
    */
  @js.native
  trait ListDomainDeliverabilityCampaignsRequest extends js.Object {
    var EndDate: Timestamp
    var StartDate: Timestamp
    var SubscribedDomain: Domain
    var NextToken: js.UndefOr[NextToken]
    var PageSize: js.UndefOr[MaxItems]
  }

  object ListDomainDeliverabilityCampaignsRequest {
    @inline
    def apply(
        EndDate: Timestamp,
        StartDate: Timestamp,
        SubscribedDomain: Domain,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        PageSize: js.UndefOr[MaxItems] = js.undefined
    ): ListDomainDeliverabilityCampaignsRequest = {
      val __obj = js.Dynamic.literal(
        "EndDate" -> EndDate.asInstanceOf[js.Any],
        "StartDate" -> StartDate.asInstanceOf[js.Any],
        "SubscribedDomain" -> SubscribedDomain.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      PageSize.foreach(__v => __obj.updateDynamic("PageSize")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDomainDeliverabilityCampaignsRequest]
    }
  }

  /** An array of objects that provide deliverability data for all the campaigns that used a specific domain to send email during a specified time range. This data is available for a domain only if you enabled the Deliverability dashboard for the domain.
    */
  @js.native
  trait ListDomainDeliverabilityCampaignsResponse extends js.Object {
    var DomainDeliverabilityCampaigns: DomainDeliverabilityCampaignList
    var NextToken: js.UndefOr[NextToken]
  }

  object ListDomainDeliverabilityCampaignsResponse {
    @inline
    def apply(
        DomainDeliverabilityCampaigns: DomainDeliverabilityCampaignList,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListDomainDeliverabilityCampaignsResponse = {
      val __obj = js.Dynamic.literal(
        "DomainDeliverabilityCampaigns" -> DomainDeliverabilityCampaigns.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDomainDeliverabilityCampaignsResponse]
    }
  }

  /** A request to list all of the email identities associated with your Amazon Web Services account. This list includes identities that you've already verified, identities that are unverified, and identities that were verified in the past, but are no longer verified.
    */
  @js.native
  trait ListEmailIdentitiesRequest extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var PageSize: js.UndefOr[MaxItems]
  }

  object ListEmailIdentitiesRequest {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        PageSize: js.UndefOr[MaxItems] = js.undefined
    ): ListEmailIdentitiesRequest = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      PageSize.foreach(__v => __obj.updateDynamic("PageSize")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListEmailIdentitiesRequest]
    }
  }

  /** A list of all of the identities that you've attempted to verify, regardless of whether or not those identities were successfully verified.
    */
  @js.native
  trait ListEmailIdentitiesResponse extends js.Object {
    var EmailIdentities: js.UndefOr[IdentityInfoList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListEmailIdentitiesResponse {
    @inline
    def apply(
        EmailIdentities: js.UndefOr[IdentityInfoList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListEmailIdentitiesResponse = {
      val __obj = js.Dynamic.literal()
      EmailIdentities.foreach(__v => __obj.updateDynamic("EmailIdentities")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListEmailIdentitiesResponse]
    }
  }

  /** Represents a request to list the email templates present in your Amazon SES account in the current Amazon Web Services Region. For more information, see the [[https://docs.aws.amazon.com/ses/latest/DeveloperGuide/send-personalized-email-api.html|Amazon SES Developer Guide]].
    */
  @js.native
  trait ListEmailTemplatesRequest extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var PageSize: js.UndefOr[MaxItems]
  }

  object ListEmailTemplatesRequest {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        PageSize: js.UndefOr[MaxItems] = js.undefined
    ): ListEmailTemplatesRequest = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      PageSize.foreach(__v => __obj.updateDynamic("PageSize")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListEmailTemplatesRequest]
    }
  }

  /** The following elements are returned by the service.
    */
  @js.native
  trait ListEmailTemplatesResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var TemplatesMetadata: js.UndefOr[EmailTemplateMetadataList]
  }

  object ListEmailTemplatesResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        TemplatesMetadata: js.UndefOr[EmailTemplateMetadataList] = js.undefined
    ): ListEmailTemplatesResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      TemplatesMetadata.foreach(__v => __obj.updateDynamic("TemplatesMetadata")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListEmailTemplatesResponse]
    }
  }

  /** Represents a request to list all of the import jobs for a data destination within the specified maximum number of import jobs.
    */
  @js.native
  trait ListImportJobsRequest extends js.Object {
    var ImportDestinationType: js.UndefOr[ImportDestinationType]
    var NextToken: js.UndefOr[NextToken]
    var PageSize: js.UndefOr[MaxItems]
  }

  object ListImportJobsRequest {
    @inline
    def apply(
        ImportDestinationType: js.UndefOr[ImportDestinationType] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        PageSize: js.UndefOr[MaxItems] = js.undefined
    ): ListImportJobsRequest = {
      val __obj = js.Dynamic.literal()
      ImportDestinationType.foreach(__v => __obj.updateDynamic("ImportDestinationType")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      PageSize.foreach(__v => __obj.updateDynamic("PageSize")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListImportJobsRequest]
    }
  }

  /** An HTTP 200 response if the request succeeds, or an error message if the request fails.
    */
  @js.native
  trait ListImportJobsResponse extends js.Object {
    var ImportJobs: js.UndefOr[ImportJobSummaryList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListImportJobsResponse {
    @inline
    def apply(
        ImportJobs: js.UndefOr[ImportJobSummaryList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListImportJobsResponse = {
      val __obj = js.Dynamic.literal()
      ImportJobs.foreach(__v => __obj.updateDynamic("ImportJobs")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListImportJobsResponse]
    }
  }

  /** An object used to specify a list or topic to which an email belongs, which will be used when a contact chooses to unsubscribe.
    */
  @js.native
  trait ListManagementOptions extends js.Object {
    var ContactListName: ContactListName
    var TopicName: js.UndefOr[TopicName]
  }

  object ListManagementOptions {
    @inline
    def apply(
        ContactListName: ContactListName,
        TopicName: js.UndefOr[TopicName] = js.undefined
    ): ListManagementOptions = {
      val __obj = js.Dynamic.literal(
        "ContactListName" -> ContactListName.asInstanceOf[js.Any]
      )

      TopicName.foreach(__v => __obj.updateDynamic("TopicName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListManagementOptions]
    }
  }

  /** Represents a request to list the existing recommendations for your account.
    */
  @js.native
  trait ListRecommendationsRequest extends js.Object {
    var Filter: js.UndefOr[ListRecommendationsFilter]
    var NextToken: js.UndefOr[NextToken]
    var PageSize: js.UndefOr[MaxItems]
  }

  object ListRecommendationsRequest {
    @inline
    def apply(
        Filter: js.UndefOr[ListRecommendationsFilter] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        PageSize: js.UndefOr[MaxItems] = js.undefined
    ): ListRecommendationsRequest = {
      val __obj = js.Dynamic.literal()
      Filter.foreach(__v => __obj.updateDynamic("Filter")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      PageSize.foreach(__v => __obj.updateDynamic("PageSize")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListRecommendationsRequest]
    }
  }

  /** Contains the response to your request to retrieve the list of recommendations for your account.
    */
  @js.native
  trait ListRecommendationsResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Recommendations: js.UndefOr[RecommendationsList]
  }

  object ListRecommendationsResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        Recommendations: js.UndefOr[RecommendationsList] = js.undefined
    ): ListRecommendationsResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Recommendations.foreach(__v => __obj.updateDynamic("Recommendations")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListRecommendationsResponse]
    }
  }

  /** A request to obtain a list of email destinations that are on the suppression list for your account.
    */
  @js.native
  trait ListSuppressedDestinationsRequest extends js.Object {
    var EndDate: js.UndefOr[Timestamp]
    var NextToken: js.UndefOr[NextToken]
    var PageSize: js.UndefOr[MaxItems]
    var Reasons: js.UndefOr[SuppressionListReasons]
    var StartDate: js.UndefOr[Timestamp]
  }

  object ListSuppressedDestinationsRequest {
    @inline
    def apply(
        EndDate: js.UndefOr[Timestamp] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        PageSize: js.UndefOr[MaxItems] = js.undefined,
        Reasons: js.UndefOr[SuppressionListReasons] = js.undefined,
        StartDate: js.UndefOr[Timestamp] = js.undefined
    ): ListSuppressedDestinationsRequest = {
      val __obj = js.Dynamic.literal()
      EndDate.foreach(__v => __obj.updateDynamic("EndDate")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      PageSize.foreach(__v => __obj.updateDynamic("PageSize")(__v.asInstanceOf[js.Any]))
      Reasons.foreach(__v => __obj.updateDynamic("Reasons")(__v.asInstanceOf[js.Any]))
      StartDate.foreach(__v => __obj.updateDynamic("StartDate")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSuppressedDestinationsRequest]
    }
  }

  /** A list of suppressed email addresses.
    */
  @js.native
  trait ListSuppressedDestinationsResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var SuppressedDestinationSummaries: js.UndefOr[SuppressedDestinationSummaries]
  }

  object ListSuppressedDestinationsResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        SuppressedDestinationSummaries: js.UndefOr[SuppressedDestinationSummaries] = js.undefined
    ): ListSuppressedDestinationsResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      SuppressedDestinationSummaries.foreach(__v => __obj.updateDynamic("SuppressedDestinationSummaries")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSuppressedDestinationsResponse]
    }
  }

  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var ResourceArn: AmazonResourceName
  }

  object ListTagsForResourceRequest {
    @inline
    def apply(
        ResourceArn: AmazonResourceName
    ): ListTagsForResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ListTagsForResourceRequest]
    }
  }

  @js.native
  trait ListTagsForResourceResponse extends js.Object {
    var Tags: TagList
  }

  object ListTagsForResourceResponse {
    @inline
    def apply(
        Tags: TagList
    ): ListTagsForResourceResponse = {
      val __obj = js.Dynamic.literal(
        "Tags" -> Tags.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ListTagsForResourceResponse]
    }
  }

  /** A list of attributes that are associated with a MAIL FROM domain.
    */
  @js.native
  trait MailFromAttributes extends js.Object {
    var BehaviorOnMxFailure: BehaviorOnMxFailure
    var MailFromDomain: MailFromDomainName
    var MailFromDomainStatus: MailFromDomainStatus
  }

  object MailFromAttributes {
    @inline
    def apply(
        BehaviorOnMxFailure: BehaviorOnMxFailure,
        MailFromDomain: MailFromDomainName,
        MailFromDomainStatus: MailFromDomainStatus
    ): MailFromAttributes = {
      val __obj = js.Dynamic.literal(
        "BehaviorOnMxFailure" -> BehaviorOnMxFailure.asInstanceOf[js.Any],
        "MailFromDomain" -> MailFromDomain.asInstanceOf[js.Any],
        "MailFromDomainStatus" -> MailFromDomainStatus.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[MailFromAttributes]
    }
  }

  /** Represents the email message that you're sending. The <code>Message</code> object consists of a subject line and a message body.
    */
  @js.native
  trait Message extends js.Object {
    var Body: Body
    var Subject: Content
  }

  object Message {
    @inline
    def apply(
        Body: Body,
        Subject: Content
    ): Message = {
      val __obj = js.Dynamic.literal(
        "Body" -> Body.asInstanceOf[js.Any],
        "Subject" -> Subject.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[Message]
    }
  }

  /** Contains the name and value of a tag that you apply to an email. You can use message tags when you publish email sending events.
    */
  @js.native
  trait MessageTag extends js.Object {
    var Name: MessageTagName
    var Value: MessageTagValue
  }

  object MessageTag {
    @inline
    def apply(
        Name: MessageTagName,
        Value: MessageTagValue
    ): MessageTag = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "Value" -> Value.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[MessageTag]
    }
  }

  /** An error corresponding to the unsuccessful processing of a single metric data query.
    */
  @js.native
  trait MetricDataError extends js.Object {
    var Code: js.UndefOr[QueryErrorCode]
    var Id: js.UndefOr[QueryIdentifier]
    var Message: js.UndefOr[QueryErrorMessage]
  }

  object MetricDataError {
    @inline
    def apply(
        Code: js.UndefOr[QueryErrorCode] = js.undefined,
        Id: js.UndefOr[QueryIdentifier] = js.undefined,
        Message: js.UndefOr[QueryErrorMessage] = js.undefined
    ): MetricDataError = {
      val __obj = js.Dynamic.literal()
      Code.foreach(__v => __obj.updateDynamic("Code")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      Message.foreach(__v => __obj.updateDynamic("Message")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MetricDataError]
    }
  }

  /** The result of a single metric data query.
    */
  @js.native
  trait MetricDataResult extends js.Object {
    var Id: js.UndefOr[QueryIdentifier]
    var Timestamps: js.UndefOr[TimestampList]
    var Values: js.UndefOr[MetricValueList]
  }

  object MetricDataResult {
    @inline
    def apply(
        Id: js.UndefOr[QueryIdentifier] = js.undefined,
        Timestamps: js.UndefOr[TimestampList] = js.undefined,
        Values: js.UndefOr[MetricValueList] = js.undefined
    ): MetricDataResult = {
      val __obj = js.Dynamic.literal()
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      Timestamps.foreach(__v => __obj.updateDynamic("Timestamps")(__v.asInstanceOf[js.Any]))
      Values.foreach(__v => __obj.updateDynamic("Values")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MetricDataResult]
    }
  }

  /** An object that contains information about email that was sent from the selected domain.
    */
  @js.native
  trait OverallVolume extends js.Object {
    var DomainIspPlacements: js.UndefOr[DomainIspPlacements]
    var ReadRatePercent: js.UndefOr[Percentage]
    var VolumeStatistics: js.UndefOr[VolumeStatistics]
  }

  object OverallVolume {
    @inline
    def apply(
        DomainIspPlacements: js.UndefOr[DomainIspPlacements] = js.undefined,
        ReadRatePercent: js.UndefOr[Percentage] = js.undefined,
        VolumeStatistics: js.UndefOr[VolumeStatistics] = js.undefined
    ): OverallVolume = {
      val __obj = js.Dynamic.literal()
      DomainIspPlacements.foreach(__v => __obj.updateDynamic("DomainIspPlacements")(__v.asInstanceOf[js.Any]))
      ReadRatePercent.foreach(__v => __obj.updateDynamic("ReadRatePercent")(__v.asInstanceOf[js.Any]))
      VolumeStatistics.foreach(__v => __obj.updateDynamic("VolumeStatistics")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OverallVolume]
    }
  }

  /** An object that defines an Amazon Pinpoint project destination for email events. You can send email event data to a Amazon Pinpoint project to view metrics using the Transactional Messaging dashboards that are built in to Amazon Pinpoint. For more information, see [[https://docs.aws.amazon.com/pinpoint/latest/userguide/analytics-transactional-messages.html|Transactional Messaging Charts]] in the <i>Amazon Pinpoint User Guide</i>.
    */
  @js.native
  trait PinpointDestination extends js.Object {
    var ApplicationArn: js.UndefOr[AmazonResourceName]
  }

  object PinpointDestination {
    @inline
    def apply(
        ApplicationArn: js.UndefOr[AmazonResourceName] = js.undefined
    ): PinpointDestination = {
      val __obj = js.Dynamic.literal()
      ApplicationArn.foreach(__v => __obj.updateDynamic("ApplicationArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PinpointDestination]
    }
  }

  /** An object that contains inbox placement data for an email provider.
    */
  @js.native
  trait PlacementStatistics extends js.Object {
    var DkimPercentage: js.UndefOr[Percentage]
    var InboxPercentage: js.UndefOr[Percentage]
    var MissingPercentage: js.UndefOr[Percentage]
    var SpamPercentage: js.UndefOr[Percentage]
    var SpfPercentage: js.UndefOr[Percentage]
  }

  object PlacementStatistics {
    @inline
    def apply(
        DkimPercentage: js.UndefOr[Percentage] = js.undefined,
        InboxPercentage: js.UndefOr[Percentage] = js.undefined,
        MissingPercentage: js.UndefOr[Percentage] = js.undefined,
        SpamPercentage: js.UndefOr[Percentage] = js.undefined,
        SpfPercentage: js.UndefOr[Percentage] = js.undefined
    ): PlacementStatistics = {
      val __obj = js.Dynamic.literal()
      DkimPercentage.foreach(__v => __obj.updateDynamic("DkimPercentage")(__v.asInstanceOf[js.Any]))
      InboxPercentage.foreach(__v => __obj.updateDynamic("InboxPercentage")(__v.asInstanceOf[js.Any]))
      MissingPercentage.foreach(__v => __obj.updateDynamic("MissingPercentage")(__v.asInstanceOf[js.Any]))
      SpamPercentage.foreach(__v => __obj.updateDynamic("SpamPercentage")(__v.asInstanceOf[js.Any]))
      SpfPercentage.foreach(__v => __obj.updateDynamic("SpfPercentage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PlacementStatistics]
    }
  }

  /** A request to enable or disable the automatic IP address warm-up feature.
    */
  @js.native
  trait PutAccountDedicatedIpWarmupAttributesRequest extends js.Object {
    var AutoWarmupEnabled: js.UndefOr[Enabled]
  }

  object PutAccountDedicatedIpWarmupAttributesRequest {
    @inline
    def apply(
        AutoWarmupEnabled: js.UndefOr[Enabled] = js.undefined
    ): PutAccountDedicatedIpWarmupAttributesRequest = {
      val __obj = js.Dynamic.literal()
      AutoWarmupEnabled.foreach(__v => __obj.updateDynamic("AutoWarmupEnabled")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutAccountDedicatedIpWarmupAttributesRequest]
    }
  }

  /** An HTTP 200 response if the request succeeds, or an error message if the request fails.
    */
  @js.native
  trait PutAccountDedicatedIpWarmupAttributesResponse extends js.Object

  object PutAccountDedicatedIpWarmupAttributesResponse {
    @inline
    def apply(): PutAccountDedicatedIpWarmupAttributesResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PutAccountDedicatedIpWarmupAttributesResponse]
    }
  }

  /** A request to submit new account details.
    */
  @js.native
  trait PutAccountDetailsRequest extends js.Object {
    var MailType: MailType
    var UseCaseDescription: UseCaseDescription
    var WebsiteURL: WebsiteURL
    var AdditionalContactEmailAddresses: js.UndefOr[AdditionalContactEmailAddresses]
    var ContactLanguage: js.UndefOr[ContactLanguage]
    var ProductionAccessEnabled: js.UndefOr[EnabledWrapper]
  }

  object PutAccountDetailsRequest {
    @inline
    def apply(
        MailType: MailType,
        UseCaseDescription: UseCaseDescription,
        WebsiteURL: WebsiteURL,
        AdditionalContactEmailAddresses: js.UndefOr[AdditionalContactEmailAddresses] = js.undefined,
        ContactLanguage: js.UndefOr[ContactLanguage] = js.undefined,
        ProductionAccessEnabled: js.UndefOr[EnabledWrapper] = js.undefined
    ): PutAccountDetailsRequest = {
      val __obj = js.Dynamic.literal(
        "MailType" -> MailType.asInstanceOf[js.Any],
        "UseCaseDescription" -> UseCaseDescription.asInstanceOf[js.Any],
        "WebsiteURL" -> WebsiteURL.asInstanceOf[js.Any]
      )

      AdditionalContactEmailAddresses.foreach(__v => __obj.updateDynamic("AdditionalContactEmailAddresses")(__v.asInstanceOf[js.Any]))
      ContactLanguage.foreach(__v => __obj.updateDynamic("ContactLanguage")(__v.asInstanceOf[js.Any]))
      ProductionAccessEnabled.foreach(__v => __obj.updateDynamic("ProductionAccessEnabled")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutAccountDetailsRequest]
    }
  }

  /** An HTTP 200 response if the request succeeds, or an error message if the request fails.
    */
  @js.native
  trait PutAccountDetailsResponse extends js.Object

  object PutAccountDetailsResponse {
    @inline
    def apply(): PutAccountDetailsResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PutAccountDetailsResponse]
    }
  }

  /** A request to change the ability of your account to send email.
    */
  @js.native
  trait PutAccountSendingAttributesRequest extends js.Object {
    var SendingEnabled: js.UndefOr[Enabled]
  }

  object PutAccountSendingAttributesRequest {
    @inline
    def apply(
        SendingEnabled: js.UndefOr[Enabled] = js.undefined
    ): PutAccountSendingAttributesRequest = {
      val __obj = js.Dynamic.literal()
      SendingEnabled.foreach(__v => __obj.updateDynamic("SendingEnabled")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutAccountSendingAttributesRequest]
    }
  }

  /** An HTTP 200 response if the request succeeds, or an error message if the request fails.
    */
  @js.native
  trait PutAccountSendingAttributesResponse extends js.Object

  object PutAccountSendingAttributesResponse {
    @inline
    def apply(): PutAccountSendingAttributesResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PutAccountSendingAttributesResponse]
    }
  }

  /** A request to change your account's suppression preferences.
    */
  @js.native
  trait PutAccountSuppressionAttributesRequest extends js.Object {
    var SuppressedReasons: js.UndefOr[SuppressionListReasons]
  }

  object PutAccountSuppressionAttributesRequest {
    @inline
    def apply(
        SuppressedReasons: js.UndefOr[SuppressionListReasons] = js.undefined
    ): PutAccountSuppressionAttributesRequest = {
      val __obj = js.Dynamic.literal()
      SuppressedReasons.foreach(__v => __obj.updateDynamic("SuppressedReasons")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutAccountSuppressionAttributesRequest]
    }
  }

  /** An HTTP 200 response if the request succeeds, or an error message if the request fails.
    */
  @js.native
  trait PutAccountSuppressionAttributesResponse extends js.Object

  object PutAccountSuppressionAttributesResponse {
    @inline
    def apply(): PutAccountSuppressionAttributesResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PutAccountSuppressionAttributesResponse]
    }
  }

  /** A request to submit new account VDM attributes.
    */
  @js.native
  trait PutAccountVdmAttributesRequest extends js.Object {
    var VdmAttributes: VdmAttributes
  }

  object PutAccountVdmAttributesRequest {
    @inline
    def apply(
        VdmAttributes: VdmAttributes
    ): PutAccountVdmAttributesRequest = {
      val __obj = js.Dynamic.literal(
        "VdmAttributes" -> VdmAttributes.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[PutAccountVdmAttributesRequest]
    }
  }

  @js.native
  trait PutAccountVdmAttributesResponse extends js.Object

  object PutAccountVdmAttributesResponse {
    @inline
    def apply(): PutAccountVdmAttributesResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PutAccountVdmAttributesResponse]
    }
  }

  /** A request to associate a configuration set with a dedicated IP pool.
    */
  @js.native
  trait PutConfigurationSetDeliveryOptionsRequest extends js.Object {
    var ConfigurationSetName: ConfigurationSetName
    var SendingPoolName: js.UndefOr[SendingPoolName]
    var TlsPolicy: js.UndefOr[TlsPolicy]
  }

  object PutConfigurationSetDeliveryOptionsRequest {
    @inline
    def apply(
        ConfigurationSetName: ConfigurationSetName,
        SendingPoolName: js.UndefOr[SendingPoolName] = js.undefined,
        TlsPolicy: js.UndefOr[TlsPolicy] = js.undefined
    ): PutConfigurationSetDeliveryOptionsRequest = {
      val __obj = js.Dynamic.literal(
        "ConfigurationSetName" -> ConfigurationSetName.asInstanceOf[js.Any]
      )

      SendingPoolName.foreach(__v => __obj.updateDynamic("SendingPoolName")(__v.asInstanceOf[js.Any]))
      TlsPolicy.foreach(__v => __obj.updateDynamic("TlsPolicy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutConfigurationSetDeliveryOptionsRequest]
    }
  }

  /** An HTTP 200 response if the request succeeds, or an error message if the request fails.
    */
  @js.native
  trait PutConfigurationSetDeliveryOptionsResponse extends js.Object

  object PutConfigurationSetDeliveryOptionsResponse {
    @inline
    def apply(): PutConfigurationSetDeliveryOptionsResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PutConfigurationSetDeliveryOptionsResponse]
    }
  }

  /** A request to enable or disable tracking of reputation metrics for a configuration set.
    */
  @js.native
  trait PutConfigurationSetReputationOptionsRequest extends js.Object {
    var ConfigurationSetName: ConfigurationSetName
    var ReputationMetricsEnabled: js.UndefOr[Enabled]
  }

  object PutConfigurationSetReputationOptionsRequest {
    @inline
    def apply(
        ConfigurationSetName: ConfigurationSetName,
        ReputationMetricsEnabled: js.UndefOr[Enabled] = js.undefined
    ): PutConfigurationSetReputationOptionsRequest = {
      val __obj = js.Dynamic.literal(
        "ConfigurationSetName" -> ConfigurationSetName.asInstanceOf[js.Any]
      )

      ReputationMetricsEnabled.foreach(__v => __obj.updateDynamic("ReputationMetricsEnabled")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutConfigurationSetReputationOptionsRequest]
    }
  }

  /** An HTTP 200 response if the request succeeds, or an error message if the request fails.
    */
  @js.native
  trait PutConfigurationSetReputationOptionsResponse extends js.Object

  object PutConfigurationSetReputationOptionsResponse {
    @inline
    def apply(): PutConfigurationSetReputationOptionsResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PutConfigurationSetReputationOptionsResponse]
    }
  }

  /** A request to enable or disable the ability of Amazon SES to send emails that use a specific configuration set.
    */
  @js.native
  trait PutConfigurationSetSendingOptionsRequest extends js.Object {
    var ConfigurationSetName: ConfigurationSetName
    var SendingEnabled: js.UndefOr[Enabled]
  }

  object PutConfigurationSetSendingOptionsRequest {
    @inline
    def apply(
        ConfigurationSetName: ConfigurationSetName,
        SendingEnabled: js.UndefOr[Enabled] = js.undefined
    ): PutConfigurationSetSendingOptionsRequest = {
      val __obj = js.Dynamic.literal(
        "ConfigurationSetName" -> ConfigurationSetName.asInstanceOf[js.Any]
      )

      SendingEnabled.foreach(__v => __obj.updateDynamic("SendingEnabled")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutConfigurationSetSendingOptionsRequest]
    }
  }

  /** An HTTP 200 response if the request succeeds, or an error message if the request fails.
    */
  @js.native
  trait PutConfigurationSetSendingOptionsResponse extends js.Object

  object PutConfigurationSetSendingOptionsResponse {
    @inline
    def apply(): PutConfigurationSetSendingOptionsResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PutConfigurationSetSendingOptionsResponse]
    }
  }

  /** A request to change the account suppression list preferences for a specific configuration set.
    */
  @js.native
  trait PutConfigurationSetSuppressionOptionsRequest extends js.Object {
    var ConfigurationSetName: ConfigurationSetName
    var SuppressedReasons: js.UndefOr[SuppressionListReasons]
  }

  object PutConfigurationSetSuppressionOptionsRequest {
    @inline
    def apply(
        ConfigurationSetName: ConfigurationSetName,
        SuppressedReasons: js.UndefOr[SuppressionListReasons] = js.undefined
    ): PutConfigurationSetSuppressionOptionsRequest = {
      val __obj = js.Dynamic.literal(
        "ConfigurationSetName" -> ConfigurationSetName.asInstanceOf[js.Any]
      )

      SuppressedReasons.foreach(__v => __obj.updateDynamic("SuppressedReasons")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutConfigurationSetSuppressionOptionsRequest]
    }
  }

  /** An HTTP 200 response if the request succeeds, or an error message if the request fails.
    */
  @js.native
  trait PutConfigurationSetSuppressionOptionsResponse extends js.Object

  object PutConfigurationSetSuppressionOptionsResponse {
    @inline
    def apply(): PutConfigurationSetSuppressionOptionsResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PutConfigurationSetSuppressionOptionsResponse]
    }
  }

  /** A request to add a custom domain for tracking open and click events to a configuration set.
    */
  @js.native
  trait PutConfigurationSetTrackingOptionsRequest extends js.Object {
    var ConfigurationSetName: ConfigurationSetName
    var CustomRedirectDomain: js.UndefOr[CustomRedirectDomain]
  }

  object PutConfigurationSetTrackingOptionsRequest {
    @inline
    def apply(
        ConfigurationSetName: ConfigurationSetName,
        CustomRedirectDomain: js.UndefOr[CustomRedirectDomain] = js.undefined
    ): PutConfigurationSetTrackingOptionsRequest = {
      val __obj = js.Dynamic.literal(
        "ConfigurationSetName" -> ConfigurationSetName.asInstanceOf[js.Any]
      )

      CustomRedirectDomain.foreach(__v => __obj.updateDynamic("CustomRedirectDomain")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutConfigurationSetTrackingOptionsRequest]
    }
  }

  /** An HTTP 200 response if the request succeeds, or an error message if the request fails.
    */
  @js.native
  trait PutConfigurationSetTrackingOptionsResponse extends js.Object

  object PutConfigurationSetTrackingOptionsResponse {
    @inline
    def apply(): PutConfigurationSetTrackingOptionsResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PutConfigurationSetTrackingOptionsResponse]
    }
  }

  /** A request to add specific VDM settings to a configuration set.
    */
  @js.native
  trait PutConfigurationSetVdmOptionsRequest extends js.Object {
    var ConfigurationSetName: ConfigurationSetName
    var VdmOptions: js.UndefOr[VdmOptions]
  }

  object PutConfigurationSetVdmOptionsRequest {
    @inline
    def apply(
        ConfigurationSetName: ConfigurationSetName,
        VdmOptions: js.UndefOr[VdmOptions] = js.undefined
    ): PutConfigurationSetVdmOptionsRequest = {
      val __obj = js.Dynamic.literal(
        "ConfigurationSetName" -> ConfigurationSetName.asInstanceOf[js.Any]
      )

      VdmOptions.foreach(__v => __obj.updateDynamic("VdmOptions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutConfigurationSetVdmOptionsRequest]
    }
  }

  /** An HTTP 200 response if the request succeeds, or an error message if the request fails.
    */
  @js.native
  trait PutConfigurationSetVdmOptionsResponse extends js.Object

  object PutConfigurationSetVdmOptionsResponse {
    @inline
    def apply(): PutConfigurationSetVdmOptionsResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PutConfigurationSetVdmOptionsResponse]
    }
  }

  /** A request to move a dedicated IP address to a dedicated IP pool.
    */
  @js.native
  trait PutDedicatedIpInPoolRequest extends js.Object {
    var DestinationPoolName: PoolName
    var Ip: Ip
  }

  object PutDedicatedIpInPoolRequest {
    @inline
    def apply(
        DestinationPoolName: PoolName,
        Ip: Ip
    ): PutDedicatedIpInPoolRequest = {
      val __obj = js.Dynamic.literal(
        "DestinationPoolName" -> DestinationPoolName.asInstanceOf[js.Any],
        "Ip" -> Ip.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[PutDedicatedIpInPoolRequest]
    }
  }

  /** An HTTP 200 response if the request succeeds, or an error message if the request fails.
    */
  @js.native
  trait PutDedicatedIpInPoolResponse extends js.Object

  object PutDedicatedIpInPoolResponse {
    @inline
    def apply(): PutDedicatedIpInPoolResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PutDedicatedIpInPoolResponse]
    }
  }

  /** A request to change the warm-up attributes for a dedicated IP address. This operation is useful when you want to resume the warm-up process for an existing IP address.
    */
  @js.native
  trait PutDedicatedIpWarmupAttributesRequest extends js.Object {
    var Ip: Ip
    var WarmupPercentage: Percentage100Wrapper
  }

  object PutDedicatedIpWarmupAttributesRequest {
    @inline
    def apply(
        Ip: Ip,
        WarmupPercentage: Percentage100Wrapper
    ): PutDedicatedIpWarmupAttributesRequest = {
      val __obj = js.Dynamic.literal(
        "Ip" -> Ip.asInstanceOf[js.Any],
        "WarmupPercentage" -> WarmupPercentage.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[PutDedicatedIpWarmupAttributesRequest]
    }
  }

  /** An HTTP 200 response if the request succeeds, or an error message if the request fails.
    */
  @js.native
  trait PutDedicatedIpWarmupAttributesResponse extends js.Object

  object PutDedicatedIpWarmupAttributesResponse {
    @inline
    def apply(): PutDedicatedIpWarmupAttributesResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PutDedicatedIpWarmupAttributesResponse]
    }
  }

  /** Enable or disable the Deliverability dashboard. When you enable the Deliverability dashboard, you gain access to reputation, deliverability, and other metrics for the domains that you use to send email using Amazon SES API v2. You also gain the ability to perform predictive inbox placement tests. When you use the Deliverability dashboard, you pay a monthly subscription charge, in addition to any other fees that you accrue by using Amazon SES and other Amazon Web Services services. For more information about the features and cost of a Deliverability dashboard subscription, see [[http://aws.amazon.com/pinpoint/pricing/|Amazon Pinpoint Pricing]].
    */
  @js.native
  trait PutDeliverabilityDashboardOptionRequest extends js.Object {
    var DashboardEnabled: Enabled
    var SubscribedDomains: js.UndefOr[DomainDeliverabilityTrackingOptions]
  }

  object PutDeliverabilityDashboardOptionRequest {
    @inline
    def apply(
        DashboardEnabled: Enabled,
        SubscribedDomains: js.UndefOr[DomainDeliverabilityTrackingOptions] = js.undefined
    ): PutDeliverabilityDashboardOptionRequest = {
      val __obj = js.Dynamic.literal(
        "DashboardEnabled" -> DashboardEnabled.asInstanceOf[js.Any]
      )

      SubscribedDomains.foreach(__v => __obj.updateDynamic("SubscribedDomains")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutDeliverabilityDashboardOptionRequest]
    }
  }

  /** A response that indicates whether the Deliverability dashboard is enabled.
    */
  @js.native
  trait PutDeliverabilityDashboardOptionResponse extends js.Object

  object PutDeliverabilityDashboardOptionResponse {
    @inline
    def apply(): PutDeliverabilityDashboardOptionResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PutDeliverabilityDashboardOptionResponse]
    }
  }

  /** A request to associate a configuration set with an email identity.
    */
  @js.native
  trait PutEmailIdentityConfigurationSetAttributesRequest extends js.Object {
    var EmailIdentity: Identity
    var ConfigurationSetName: js.UndefOr[ConfigurationSetName]
  }

  object PutEmailIdentityConfigurationSetAttributesRequest {
    @inline
    def apply(
        EmailIdentity: Identity,
        ConfigurationSetName: js.UndefOr[ConfigurationSetName] = js.undefined
    ): PutEmailIdentityConfigurationSetAttributesRequest = {
      val __obj = js.Dynamic.literal(
        "EmailIdentity" -> EmailIdentity.asInstanceOf[js.Any]
      )

      ConfigurationSetName.foreach(__v => __obj.updateDynamic("ConfigurationSetName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutEmailIdentityConfigurationSetAttributesRequest]
    }
  }

  /** If the action is successful, the service sends back an HTTP 200 response with an empty HTTP body.
    */
  @js.native
  trait PutEmailIdentityConfigurationSetAttributesResponse extends js.Object

  object PutEmailIdentityConfigurationSetAttributesResponse {
    @inline
    def apply(): PutEmailIdentityConfigurationSetAttributesResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PutEmailIdentityConfigurationSetAttributesResponse]
    }
  }

  /** A request to enable or disable DKIM signing of email that you send from an email identity.
    */
  @js.native
  trait PutEmailIdentityDkimAttributesRequest extends js.Object {
    var EmailIdentity: Identity
    var SigningEnabled: js.UndefOr[Enabled]
  }

  object PutEmailIdentityDkimAttributesRequest {
    @inline
    def apply(
        EmailIdentity: Identity,
        SigningEnabled: js.UndefOr[Enabled] = js.undefined
    ): PutEmailIdentityDkimAttributesRequest = {
      val __obj = js.Dynamic.literal(
        "EmailIdentity" -> EmailIdentity.asInstanceOf[js.Any]
      )

      SigningEnabled.foreach(__v => __obj.updateDynamic("SigningEnabled")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutEmailIdentityDkimAttributesRequest]
    }
  }

  /** An HTTP 200 response if the request succeeds, or an error message if the request fails.
    */
  @js.native
  trait PutEmailIdentityDkimAttributesResponse extends js.Object

  object PutEmailIdentityDkimAttributesResponse {
    @inline
    def apply(): PutEmailIdentityDkimAttributesResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PutEmailIdentityDkimAttributesResponse]
    }
  }

  /** A request to change the DKIM attributes for an email identity.
    */
  @js.native
  trait PutEmailIdentityDkimSigningAttributesRequest extends js.Object {
    var EmailIdentity: Identity
    var SigningAttributesOrigin: DkimSigningAttributesOrigin
    var SigningAttributes: js.UndefOr[DkimSigningAttributes]
  }

  object PutEmailIdentityDkimSigningAttributesRequest {
    @inline
    def apply(
        EmailIdentity: Identity,
        SigningAttributesOrigin: DkimSigningAttributesOrigin,
        SigningAttributes: js.UndefOr[DkimSigningAttributes] = js.undefined
    ): PutEmailIdentityDkimSigningAttributesRequest = {
      val __obj = js.Dynamic.literal(
        "EmailIdentity" -> EmailIdentity.asInstanceOf[js.Any],
        "SigningAttributesOrigin" -> SigningAttributesOrigin.asInstanceOf[js.Any]
      )

      SigningAttributes.foreach(__v => __obj.updateDynamic("SigningAttributes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutEmailIdentityDkimSigningAttributesRequest]
    }
  }

  /** If the action is successful, the service sends back an HTTP 200 response. The following data is returned in JSON format by the service.
    */
  @js.native
  trait PutEmailIdentityDkimSigningAttributesResponse extends js.Object {
    var DkimStatus: js.UndefOr[DkimStatus]
    var DkimTokens: js.UndefOr[DnsTokenList]
  }

  object PutEmailIdentityDkimSigningAttributesResponse {
    @inline
    def apply(
        DkimStatus: js.UndefOr[DkimStatus] = js.undefined,
        DkimTokens: js.UndefOr[DnsTokenList] = js.undefined
    ): PutEmailIdentityDkimSigningAttributesResponse = {
      val __obj = js.Dynamic.literal()
      DkimStatus.foreach(__v => __obj.updateDynamic("DkimStatus")(__v.asInstanceOf[js.Any]))
      DkimTokens.foreach(__v => __obj.updateDynamic("DkimTokens")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutEmailIdentityDkimSigningAttributesResponse]
    }
  }

  /** A request to set the attributes that control how bounce and complaint events are processed.
    */
  @js.native
  trait PutEmailIdentityFeedbackAttributesRequest extends js.Object {
    var EmailIdentity: Identity
    var EmailForwardingEnabled: js.UndefOr[Enabled]
  }

  object PutEmailIdentityFeedbackAttributesRequest {
    @inline
    def apply(
        EmailIdentity: Identity,
        EmailForwardingEnabled: js.UndefOr[Enabled] = js.undefined
    ): PutEmailIdentityFeedbackAttributesRequest = {
      val __obj = js.Dynamic.literal(
        "EmailIdentity" -> EmailIdentity.asInstanceOf[js.Any]
      )

      EmailForwardingEnabled.foreach(__v => __obj.updateDynamic("EmailForwardingEnabled")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutEmailIdentityFeedbackAttributesRequest]
    }
  }

  /** An HTTP 200 response if the request succeeds, or an error message if the request fails.
    */
  @js.native
  trait PutEmailIdentityFeedbackAttributesResponse extends js.Object

  object PutEmailIdentityFeedbackAttributesResponse {
    @inline
    def apply(): PutEmailIdentityFeedbackAttributesResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PutEmailIdentityFeedbackAttributesResponse]
    }
  }

  /** A request to configure the custom MAIL FROM domain for a verified identity.
    */
  @js.native
  trait PutEmailIdentityMailFromAttributesRequest extends js.Object {
    var EmailIdentity: Identity
    var BehaviorOnMxFailure: js.UndefOr[BehaviorOnMxFailure]
    var MailFromDomain: js.UndefOr[MailFromDomainName]
  }

  object PutEmailIdentityMailFromAttributesRequest {
    @inline
    def apply(
        EmailIdentity: Identity,
        BehaviorOnMxFailure: js.UndefOr[BehaviorOnMxFailure] = js.undefined,
        MailFromDomain: js.UndefOr[MailFromDomainName] = js.undefined
    ): PutEmailIdentityMailFromAttributesRequest = {
      val __obj = js.Dynamic.literal(
        "EmailIdentity" -> EmailIdentity.asInstanceOf[js.Any]
      )

      BehaviorOnMxFailure.foreach(__v => __obj.updateDynamic("BehaviorOnMxFailure")(__v.asInstanceOf[js.Any]))
      MailFromDomain.foreach(__v => __obj.updateDynamic("MailFromDomain")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutEmailIdentityMailFromAttributesRequest]
    }
  }

  /** An HTTP 200 response if the request succeeds, or an error message if the request fails.
    */
  @js.native
  trait PutEmailIdentityMailFromAttributesResponse extends js.Object

  object PutEmailIdentityMailFromAttributesResponse {
    @inline
    def apply(): PutEmailIdentityMailFromAttributesResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PutEmailIdentityMailFromAttributesResponse]
    }
  }

  /** A request to add an email destination to the suppression list for your account.
    */
  @js.native
  trait PutSuppressedDestinationRequest extends js.Object {
    var EmailAddress: EmailAddress
    var Reason: SuppressionListReason
  }

  object PutSuppressedDestinationRequest {
    @inline
    def apply(
        EmailAddress: EmailAddress,
        Reason: SuppressionListReason
    ): PutSuppressedDestinationRequest = {
      val __obj = js.Dynamic.literal(
        "EmailAddress" -> EmailAddress.asInstanceOf[js.Any],
        "Reason" -> Reason.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[PutSuppressedDestinationRequest]
    }
  }

  /** An HTTP 200 response if the request succeeds, or an error message if the request fails.
    */
  @js.native
  trait PutSuppressedDestinationResponse extends js.Object

  object PutSuppressedDestinationResponse {
    @inline
    def apply(): PutSuppressedDestinationResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PutSuppressedDestinationResponse]
    }
  }

  /** Represents the raw content of an email message.
    */
  @js.native
  trait RawMessage extends js.Object {
    var Data: RawMessageData
  }

  object RawMessage {
    @inline
    def apply(
        Data: RawMessageData
    ): RawMessage = {
      val __obj = js.Dynamic.literal(
        "Data" -> Data.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[RawMessage]
    }
  }

  /** A recommendation generated for your account.
    */
  @js.native
  trait Recommendation extends js.Object {
    var CreatedTimestamp: js.UndefOr[Timestamp]
    var Description: js.UndefOr[RecommendationDescription]
    var Impact: js.UndefOr[RecommendationImpact]
    var LastUpdatedTimestamp: js.UndefOr[Timestamp]
    var ResourceArn: js.UndefOr[AmazonResourceName]
    var Status: js.UndefOr[RecommendationStatus]
    var Type: js.UndefOr[RecommendationType]
  }

  object Recommendation {
    @inline
    def apply(
        CreatedTimestamp: js.UndefOr[Timestamp] = js.undefined,
        Description: js.UndefOr[RecommendationDescription] = js.undefined,
        Impact: js.UndefOr[RecommendationImpact] = js.undefined,
        LastUpdatedTimestamp: js.UndefOr[Timestamp] = js.undefined,
        ResourceArn: js.UndefOr[AmazonResourceName] = js.undefined,
        Status: js.UndefOr[RecommendationStatus] = js.undefined,
        Type: js.UndefOr[RecommendationType] = js.undefined
    ): Recommendation = {
      val __obj = js.Dynamic.literal()
      CreatedTimestamp.foreach(__v => __obj.updateDynamic("CreatedTimestamp")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Impact.foreach(__v => __obj.updateDynamic("Impact")(__v.asInstanceOf[js.Any]))
      LastUpdatedTimestamp.foreach(__v => __obj.updateDynamic("LastUpdatedTimestamp")(__v.asInstanceOf[js.Any]))
      ResourceArn.foreach(__v => __obj.updateDynamic("ResourceArn")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Recommendation]
    }
  }

  /** The <code>ReplaceEmailContent</code> object to be used for a specific <code>BulkEmailEntry</code>. The <code>ReplacementTemplate</code> can be specified within this object.
    */
  @js.native
  trait ReplacementEmailContent extends js.Object {
    var ReplacementTemplate: js.UndefOr[ReplacementTemplate]
  }

  object ReplacementEmailContent {
    @inline
    def apply(
        ReplacementTemplate: js.UndefOr[ReplacementTemplate] = js.undefined
    ): ReplacementEmailContent = {
      val __obj = js.Dynamic.literal()
      ReplacementTemplate.foreach(__v => __obj.updateDynamic("ReplacementTemplate")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ReplacementEmailContent]
    }
  }

  /** An object which contains <code>ReplacementTemplateData</code> to be used for a specific <code>BulkEmailEntry</code>.
    */
  @js.native
  trait ReplacementTemplate extends js.Object {
    var ReplacementTemplateData: js.UndefOr[EmailTemplateData]
  }

  object ReplacementTemplate {
    @inline
    def apply(
        ReplacementTemplateData: js.UndefOr[EmailTemplateData] = js.undefined
    ): ReplacementTemplate = {
      val __obj = js.Dynamic.literal()
      ReplacementTemplateData.foreach(__v => __obj.updateDynamic("ReplacementTemplateData")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ReplacementTemplate]
    }
  }

  /** Enable or disable collection of reputation metrics for emails that you send using this configuration set in the current Amazon Web Services Region.
    */
  @js.native
  trait ReputationOptions extends js.Object {
    var LastFreshStart: js.UndefOr[LastFreshStart]
    var ReputationMetricsEnabled: js.UndefOr[Enabled]
  }

  object ReputationOptions {
    @inline
    def apply(
        LastFreshStart: js.UndefOr[LastFreshStart] = js.undefined,
        ReputationMetricsEnabled: js.UndefOr[Enabled] = js.undefined
    ): ReputationOptions = {
      val __obj = js.Dynamic.literal()
      LastFreshStart.foreach(__v => __obj.updateDynamic("LastFreshStart")(__v.asInstanceOf[js.Any]))
      ReputationMetricsEnabled.foreach(__v => __obj.updateDynamic("ReputationMetricsEnabled")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ReputationOptions]
    }
  }

  /** An object that contains information about your account details review.
    */
  @js.native
  trait ReviewDetails extends js.Object {
    var CaseId: js.UndefOr[CaseId]
    var Status: js.UndefOr[ReviewStatus]
  }

  object ReviewDetails {
    @inline
    def apply(
        CaseId: js.UndefOr[CaseId] = js.undefined,
        Status: js.UndefOr[ReviewStatus] = js.undefined
    ): ReviewDetails = {
      val __obj = js.Dynamic.literal()
      CaseId.foreach(__v => __obj.updateDynamic("CaseId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ReviewDetails]
    }
  }

  /** Represents a request to send email messages to multiple destinations using Amazon SES. For more information, see the [[https://docs.aws.amazon.com/ses/latest/DeveloperGuide/send-personalized-email-api.html|Amazon SES Developer Guide]].
    */
  @js.native
  trait SendBulkEmailRequest extends js.Object {
    var BulkEmailEntries: BulkEmailEntryList
    var DefaultContent: BulkEmailContent
    var ConfigurationSetName: js.UndefOr[ConfigurationSetName]
    var DefaultEmailTags: js.UndefOr[MessageTagList]
    var FeedbackForwardingEmailAddress: js.UndefOr[EmailAddress]
    var FeedbackForwardingEmailAddressIdentityArn: js.UndefOr[AmazonResourceName]
    var FromEmailAddress: js.UndefOr[EmailAddress]
    var FromEmailAddressIdentityArn: js.UndefOr[AmazonResourceName]
    var ReplyToAddresses: js.UndefOr[EmailAddressList]
  }

  object SendBulkEmailRequest {
    @inline
    def apply(
        BulkEmailEntries: BulkEmailEntryList,
        DefaultContent: BulkEmailContent,
        ConfigurationSetName: js.UndefOr[ConfigurationSetName] = js.undefined,
        DefaultEmailTags: js.UndefOr[MessageTagList] = js.undefined,
        FeedbackForwardingEmailAddress: js.UndefOr[EmailAddress] = js.undefined,
        FeedbackForwardingEmailAddressIdentityArn: js.UndefOr[AmazonResourceName] = js.undefined,
        FromEmailAddress: js.UndefOr[EmailAddress] = js.undefined,
        FromEmailAddressIdentityArn: js.UndefOr[AmazonResourceName] = js.undefined,
        ReplyToAddresses: js.UndefOr[EmailAddressList] = js.undefined
    ): SendBulkEmailRequest = {
      val __obj = js.Dynamic.literal(
        "BulkEmailEntries" -> BulkEmailEntries.asInstanceOf[js.Any],
        "DefaultContent" -> DefaultContent.asInstanceOf[js.Any]
      )

      ConfigurationSetName.foreach(__v => __obj.updateDynamic("ConfigurationSetName")(__v.asInstanceOf[js.Any]))
      DefaultEmailTags.foreach(__v => __obj.updateDynamic("DefaultEmailTags")(__v.asInstanceOf[js.Any]))
      FeedbackForwardingEmailAddress.foreach(__v => __obj.updateDynamic("FeedbackForwardingEmailAddress")(__v.asInstanceOf[js.Any]))
      FeedbackForwardingEmailAddressIdentityArn.foreach(__v => __obj.updateDynamic("FeedbackForwardingEmailAddressIdentityArn")(__v.asInstanceOf[js.Any]))
      FromEmailAddress.foreach(__v => __obj.updateDynamic("FromEmailAddress")(__v.asInstanceOf[js.Any]))
      FromEmailAddressIdentityArn.foreach(__v => __obj.updateDynamic("FromEmailAddressIdentityArn")(__v.asInstanceOf[js.Any]))
      ReplyToAddresses.foreach(__v => __obj.updateDynamic("ReplyToAddresses")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SendBulkEmailRequest]
    }
  }

  /** The following data is returned in JSON format by the service.
    */
  @js.native
  trait SendBulkEmailResponse extends js.Object {
    var BulkEmailEntryResults: BulkEmailEntryResultList
  }

  object SendBulkEmailResponse {
    @inline
    def apply(
        BulkEmailEntryResults: BulkEmailEntryResultList
    ): SendBulkEmailResponse = {
      val __obj = js.Dynamic.literal(
        "BulkEmailEntryResults" -> BulkEmailEntryResults.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[SendBulkEmailResponse]
    }
  }

  /** Represents a request to send a custom verification email to a specified recipient.
    */
  @js.native
  trait SendCustomVerificationEmailRequest extends js.Object {
    var EmailAddress: EmailAddress
    var TemplateName: EmailTemplateName
    var ConfigurationSetName: js.UndefOr[ConfigurationSetName]
  }

  object SendCustomVerificationEmailRequest {
    @inline
    def apply(
        EmailAddress: EmailAddress,
        TemplateName: EmailTemplateName,
        ConfigurationSetName: js.UndefOr[ConfigurationSetName] = js.undefined
    ): SendCustomVerificationEmailRequest = {
      val __obj = js.Dynamic.literal(
        "EmailAddress" -> EmailAddress.asInstanceOf[js.Any],
        "TemplateName" -> TemplateName.asInstanceOf[js.Any]
      )

      ConfigurationSetName.foreach(__v => __obj.updateDynamic("ConfigurationSetName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SendCustomVerificationEmailRequest]
    }
  }

  /** The following element is returned by the service.
    */
  @js.native
  trait SendCustomVerificationEmailResponse extends js.Object {
    var MessageId: js.UndefOr[OutboundMessageId]
  }

  object SendCustomVerificationEmailResponse {
    @inline
    def apply(
        MessageId: js.UndefOr[OutboundMessageId] = js.undefined
    ): SendCustomVerificationEmailResponse = {
      val __obj = js.Dynamic.literal()
      MessageId.foreach(__v => __obj.updateDynamic("MessageId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SendCustomVerificationEmailResponse]
    }
  }

  /** Represents a request to send a single formatted email using Amazon SES. For more information, see the [[https://docs.aws.amazon.com/ses/latest/DeveloperGuide/send-email-formatted.html|Amazon SES Developer Guide]].
    */
  @js.native
  trait SendEmailRequest extends js.Object {
    var Content: EmailContent
    var ConfigurationSetName: js.UndefOr[ConfigurationSetName]
    var Destination: js.UndefOr[Destination]
    var EmailTags: js.UndefOr[MessageTagList]
    var FeedbackForwardingEmailAddress: js.UndefOr[EmailAddress]
    var FeedbackForwardingEmailAddressIdentityArn: js.UndefOr[AmazonResourceName]
    var FromEmailAddress: js.UndefOr[EmailAddress]
    var FromEmailAddressIdentityArn: js.UndefOr[AmazonResourceName]
    var ListManagementOptions: js.UndefOr[ListManagementOptions]
    var ReplyToAddresses: js.UndefOr[EmailAddressList]
  }

  object SendEmailRequest {
    @inline
    def apply(
        Content: EmailContent,
        ConfigurationSetName: js.UndefOr[ConfigurationSetName] = js.undefined,
        Destination: js.UndefOr[Destination] = js.undefined,
        EmailTags: js.UndefOr[MessageTagList] = js.undefined,
        FeedbackForwardingEmailAddress: js.UndefOr[EmailAddress] = js.undefined,
        FeedbackForwardingEmailAddressIdentityArn: js.UndefOr[AmazonResourceName] = js.undefined,
        FromEmailAddress: js.UndefOr[EmailAddress] = js.undefined,
        FromEmailAddressIdentityArn: js.UndefOr[AmazonResourceName] = js.undefined,
        ListManagementOptions: js.UndefOr[ListManagementOptions] = js.undefined,
        ReplyToAddresses: js.UndefOr[EmailAddressList] = js.undefined
    ): SendEmailRequest = {
      val __obj = js.Dynamic.literal(
        "Content" -> Content.asInstanceOf[js.Any]
      )

      ConfigurationSetName.foreach(__v => __obj.updateDynamic("ConfigurationSetName")(__v.asInstanceOf[js.Any]))
      Destination.foreach(__v => __obj.updateDynamic("Destination")(__v.asInstanceOf[js.Any]))
      EmailTags.foreach(__v => __obj.updateDynamic("EmailTags")(__v.asInstanceOf[js.Any]))
      FeedbackForwardingEmailAddress.foreach(__v => __obj.updateDynamic("FeedbackForwardingEmailAddress")(__v.asInstanceOf[js.Any]))
      FeedbackForwardingEmailAddressIdentityArn.foreach(__v => __obj.updateDynamic("FeedbackForwardingEmailAddressIdentityArn")(__v.asInstanceOf[js.Any]))
      FromEmailAddress.foreach(__v => __obj.updateDynamic("FromEmailAddress")(__v.asInstanceOf[js.Any]))
      FromEmailAddressIdentityArn.foreach(__v => __obj.updateDynamic("FromEmailAddressIdentityArn")(__v.asInstanceOf[js.Any]))
      ListManagementOptions.foreach(__v => __obj.updateDynamic("ListManagementOptions")(__v.asInstanceOf[js.Any]))
      ReplyToAddresses.foreach(__v => __obj.updateDynamic("ReplyToAddresses")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SendEmailRequest]
    }
  }

  /** A unique message ID that you receive when an email is accepted for sending.
    */
  @js.native
  trait SendEmailResponse extends js.Object {
    var MessageId: js.UndefOr[OutboundMessageId]
  }

  object SendEmailResponse {
    @inline
    def apply(
        MessageId: js.UndefOr[OutboundMessageId] = js.undefined
    ): SendEmailResponse = {
      val __obj = js.Dynamic.literal()
      MessageId.foreach(__v => __obj.updateDynamic("MessageId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SendEmailResponse]
    }
  }

  /** An object that contains information about the per-day and per-second sending limits for your Amazon SES account in the current Amazon Web Services Region.
    */
  @js.native
  trait SendQuota extends js.Object {
    var Max24HourSend: js.UndefOr[Max24HourSend]
    var MaxSendRate: js.UndefOr[MaxSendRate]
    var SentLast24Hours: js.UndefOr[SentLast24Hours]
  }

  object SendQuota {
    @inline
    def apply(
        Max24HourSend: js.UndefOr[Max24HourSend] = js.undefined,
        MaxSendRate: js.UndefOr[MaxSendRate] = js.undefined,
        SentLast24Hours: js.UndefOr[SentLast24Hours] = js.undefined
    ): SendQuota = {
      val __obj = js.Dynamic.literal()
      Max24HourSend.foreach(__v => __obj.updateDynamic("Max24HourSend")(__v.asInstanceOf[js.Any]))
      MaxSendRate.foreach(__v => __obj.updateDynamic("MaxSendRate")(__v.asInstanceOf[js.Any]))
      SentLast24Hours.foreach(__v => __obj.updateDynamic("SentLast24Hours")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SendQuota]
    }
  }

  /** Used to enable or disable email sending for messages that use this configuration set in the current Amazon Web Services Region.
    */
  @js.native
  trait SendingOptions extends js.Object {
    var SendingEnabled: js.UndefOr[Enabled]
  }

  object SendingOptions {
    @inline
    def apply(
        SendingEnabled: js.UndefOr[Enabled] = js.undefined
    ): SendingOptions = {
      val __obj = js.Dynamic.literal()
      SendingEnabled.foreach(__v => __obj.updateDynamic("SendingEnabled")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SendingOptions]
    }
  }

  /** An object that defines an Amazon SNS destination for email events. You can use Amazon SNS to send notification when certain email events occur.
    */
  @js.native
  trait SnsDestination extends js.Object {
    var TopicArn: AmazonResourceName
  }

  object SnsDestination {
    @inline
    def apply(
        TopicArn: AmazonResourceName
    ): SnsDestination = {
      val __obj = js.Dynamic.literal(
        "TopicArn" -> TopicArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[SnsDestination]
    }
  }

  /** An object that contains information about an email address that is on the suppression list for your account.
    */
  @js.native
  trait SuppressedDestination extends js.Object {
    var EmailAddress: EmailAddress
    var LastUpdateTime: Timestamp
    var Reason: SuppressionListReason
    var Attributes: js.UndefOr[SuppressedDestinationAttributes]
  }

  object SuppressedDestination {
    @inline
    def apply(
        EmailAddress: EmailAddress,
        LastUpdateTime: Timestamp,
        Reason: SuppressionListReason,
        Attributes: js.UndefOr[SuppressedDestinationAttributes] = js.undefined
    ): SuppressedDestination = {
      val __obj = js.Dynamic.literal(
        "EmailAddress" -> EmailAddress.asInstanceOf[js.Any],
        "LastUpdateTime" -> LastUpdateTime.asInstanceOf[js.Any],
        "Reason" -> Reason.asInstanceOf[js.Any]
      )

      Attributes.foreach(__v => __obj.updateDynamic("Attributes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SuppressedDestination]
    }
  }

  /** An object that contains additional attributes that are related an email address that is on the suppression list for your account.
    */
  @js.native
  trait SuppressedDestinationAttributes extends js.Object {
    var FeedbackId: js.UndefOr[FeedbackId]
    var MessageId: js.UndefOr[OutboundMessageId]
  }

  object SuppressedDestinationAttributes {
    @inline
    def apply(
        FeedbackId: js.UndefOr[FeedbackId] = js.undefined,
        MessageId: js.UndefOr[OutboundMessageId] = js.undefined
    ): SuppressedDestinationAttributes = {
      val __obj = js.Dynamic.literal()
      FeedbackId.foreach(__v => __obj.updateDynamic("FeedbackId")(__v.asInstanceOf[js.Any]))
      MessageId.foreach(__v => __obj.updateDynamic("MessageId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SuppressedDestinationAttributes]
    }
  }

  /** A summary that describes the suppressed email address.
    */
  @js.native
  trait SuppressedDestinationSummary extends js.Object {
    var EmailAddress: EmailAddress
    var LastUpdateTime: Timestamp
    var Reason: SuppressionListReason
  }

  object SuppressedDestinationSummary {
    @inline
    def apply(
        EmailAddress: EmailAddress,
        LastUpdateTime: Timestamp,
        Reason: SuppressionListReason
    ): SuppressedDestinationSummary = {
      val __obj = js.Dynamic.literal(
        "EmailAddress" -> EmailAddress.asInstanceOf[js.Any],
        "LastUpdateTime" -> LastUpdateTime.asInstanceOf[js.Any],
        "Reason" -> Reason.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[SuppressedDestinationSummary]
    }
  }

  /** An object that contains information about the email address suppression preferences for your account in the current Amazon Web Services Region.
    */
  @js.native
  trait SuppressionAttributes extends js.Object {
    var SuppressedReasons: js.UndefOr[SuppressionListReasons]
  }

  object SuppressionAttributes {
    @inline
    def apply(
        SuppressedReasons: js.UndefOr[SuppressionListReasons] = js.undefined
    ): SuppressionAttributes = {
      val __obj = js.Dynamic.literal()
      SuppressedReasons.foreach(__v => __obj.updateDynamic("SuppressedReasons")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SuppressionAttributes]
    }
  }

  /** An object that contains details about the action of suppression list.
    */
  @js.native
  trait SuppressionListDestination extends js.Object {
    var SuppressionListImportAction: SuppressionListImportAction
  }

  object SuppressionListDestination {
    @inline
    def apply(
        SuppressionListImportAction: SuppressionListImportAction
    ): SuppressionListDestination = {
      val __obj = js.Dynamic.literal(
        "SuppressionListImportAction" -> SuppressionListImportAction.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[SuppressionListDestination]
    }
  }

  /** An object that contains information about the suppression list preferences for your account.
    */
  @js.native
  trait SuppressionOptions extends js.Object {
    var SuppressedReasons: js.UndefOr[SuppressionListReasons]
  }

  object SuppressionOptions {
    @inline
    def apply(
        SuppressedReasons: js.UndefOr[SuppressionListReasons] = js.undefined
    ): SuppressionOptions = {
      val __obj = js.Dynamic.literal()
      SuppressedReasons.foreach(__v => __obj.updateDynamic("SuppressedReasons")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SuppressionOptions]
    }
  }

  /** An object that defines the tags that are associated with a resource. A <i>tag</i> is a label that you optionally define and associate with a resource. Tags can help you categorize and manage resources in different ways, such as by purpose, owner, environment, or other criteria. A resource can have as many as 50 tags. Each tag consists of a required <i>tag key</i> and an associated <i>tag value</i>, both of which you define. A tag key is a general label that acts as a category for a more specific tag value. A tag value acts as a descriptor within a tag key. A tag key can contain as many as 128 characters. A tag value can contain as many as 256 characters. The characters can be Unicode letters, digits, white space, or one of the following symbols: _ . : / = + -. The following additional restrictions apply to tags: * Tag keys and values are case sensitive. * For each associated resource, each tag key must be unique and it can have only one value. * The <code>aws:</code> prefix is
    * reserved for use by Amazon Web Services; you can’t use it in any tag keys or values that you define. In addition, you can't edit or remove tag keys or values that use this prefix. Tags that use this prefix don’t count against the limit of 50 tags per resource. * You can associate tags with public or shared resources, but the tags are available only for your Amazon Web Services account, not any other accounts that share the resource. In addition, the tags are available only for resources that are located in the specified Amazon Web Services Region for your Amazon Web Services account.
    */
  @js.native
  trait Tag extends js.Object {
    var Key: TagKey
    var Value: TagValue
  }

  object Tag {
    @inline
    def apply(
        Key: TagKey,
        Value: TagValue
    ): Tag = {
      val __obj = js.Dynamic.literal(
        "Key" -> Key.asInstanceOf[js.Any],
        "Value" -> Value.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[Tag]
    }
  }

  @js.native
  trait TagResourceRequest extends js.Object {
    var ResourceArn: AmazonResourceName
    var Tags: TagList
  }

  object TagResourceRequest {
    @inline
    def apply(
        ResourceArn: AmazonResourceName,
        Tags: TagList
    ): TagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any],
        "Tags" -> Tags.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[TagResourceRequest]
    }
  }

  @js.native
  trait TagResourceResponse extends js.Object

  object TagResourceResponse {
    @inline
    def apply(): TagResourceResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TagResourceResponse]
    }
  }

  /** An object that defines the email template to use for an email message, and the values to use for any message variables in that template. An <i>email template</i> is a type of message template that contains content that you want to define, save, and reuse in email messages that you send.
    */
  @js.native
  trait Template extends js.Object {
    var TemplateArn: js.UndefOr[AmazonResourceName]
    var TemplateData: js.UndefOr[EmailTemplateData]
    var TemplateName: js.UndefOr[EmailTemplateName]
  }

  object Template {
    @inline
    def apply(
        TemplateArn: js.UndefOr[AmazonResourceName] = js.undefined,
        TemplateData: js.UndefOr[EmailTemplateData] = js.undefined,
        TemplateName: js.UndefOr[EmailTemplateName] = js.undefined
    ): Template = {
      val __obj = js.Dynamic.literal()
      TemplateArn.foreach(__v => __obj.updateDynamic("TemplateArn")(__v.asInstanceOf[js.Any]))
      TemplateData.foreach(__v => __obj.updateDynamic("TemplateData")(__v.asInstanceOf[js.Any]))
      TemplateName.foreach(__v => __obj.updateDynamic("TemplateName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Template]
    }
  }

  /** &gt;Represents a request to create a preview of the MIME content of an email when provided with a template and a set of replacement data.
    */
  @js.native
  trait TestRenderEmailTemplateRequest extends js.Object {
    var TemplateData: EmailTemplateData
    var TemplateName: EmailTemplateName
  }

  object TestRenderEmailTemplateRequest {
    @inline
    def apply(
        TemplateData: EmailTemplateData,
        TemplateName: EmailTemplateName
    ): TestRenderEmailTemplateRequest = {
      val __obj = js.Dynamic.literal(
        "TemplateData" -> TemplateData.asInstanceOf[js.Any],
        "TemplateName" -> TemplateName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[TestRenderEmailTemplateRequest]
    }
  }

  /** The following element is returned by the service.
    */
  @js.native
  trait TestRenderEmailTemplateResponse extends js.Object {
    var RenderedTemplate: RenderedEmailTemplate
  }

  object TestRenderEmailTemplateResponse {
    @inline
    def apply(
        RenderedTemplate: RenderedEmailTemplate
    ): TestRenderEmailTemplateResponse = {
      val __obj = js.Dynamic.literal(
        "RenderedTemplate" -> RenderedTemplate.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[TestRenderEmailTemplateResponse]
    }
  }

  /** An interest group, theme, or label within a list. Lists can have multiple topics.
    */
  @js.native
  trait Topic extends js.Object {
    var DefaultSubscriptionStatus: SubscriptionStatus
    var DisplayName: DisplayName
    var TopicName: TopicName
    var Description: js.UndefOr[Description]
  }

  object Topic {
    @inline
    def apply(
        DefaultSubscriptionStatus: SubscriptionStatus,
        DisplayName: DisplayName,
        TopicName: TopicName,
        Description: js.UndefOr[Description] = js.undefined
    ): Topic = {
      val __obj = js.Dynamic.literal(
        "DefaultSubscriptionStatus" -> DefaultSubscriptionStatus.asInstanceOf[js.Any],
        "DisplayName" -> DisplayName.asInstanceOf[js.Any],
        "TopicName" -> TopicName.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Topic]
    }
  }

  /** Used for filtering by a specific topic preference.
    */
  @js.native
  trait TopicFilter extends js.Object {
    var TopicName: js.UndefOr[TopicName]
    var UseDefaultIfPreferenceUnavailable: js.UndefOr[UseDefaultIfPreferenceUnavailable]
  }

  object TopicFilter {
    @inline
    def apply(
        TopicName: js.UndefOr[TopicName] = js.undefined,
        UseDefaultIfPreferenceUnavailable: js.UndefOr[UseDefaultIfPreferenceUnavailable] = js.undefined
    ): TopicFilter = {
      val __obj = js.Dynamic.literal()
      TopicName.foreach(__v => __obj.updateDynamic("TopicName")(__v.asInstanceOf[js.Any]))
      UseDefaultIfPreferenceUnavailable.foreach(__v => __obj.updateDynamic("UseDefaultIfPreferenceUnavailable")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TopicFilter]
    }
  }

  /** The contact's preference for being opted-in to or opted-out of a topic.
    */
  @js.native
  trait TopicPreference extends js.Object {
    var SubscriptionStatus: SubscriptionStatus
    var TopicName: TopicName
  }

  object TopicPreference {
    @inline
    def apply(
        SubscriptionStatus: SubscriptionStatus,
        TopicName: TopicName
    ): TopicPreference = {
      val __obj = js.Dynamic.literal(
        "SubscriptionStatus" -> SubscriptionStatus.asInstanceOf[js.Any],
        "TopicName" -> TopicName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[TopicPreference]
    }
  }

  /** An object that defines the tracking options for a configuration set. When you use the Amazon SES API v2 to send an email, it contains an invisible image that's used to track when recipients open your email. If your email contains links, those links are changed slightly in order to track when recipients click them. These images and links include references to a domain operated by Amazon Web Services. You can optionally configure the Amazon SES to use a domain that you operate for these images and links.
    */
  @js.native
  trait TrackingOptions extends js.Object {
    var CustomRedirectDomain: CustomRedirectDomain
  }

  object TrackingOptions {
    @inline
    def apply(
        CustomRedirectDomain: CustomRedirectDomain
    ): TrackingOptions = {
      val __obj = js.Dynamic.literal(
        "CustomRedirectDomain" -> CustomRedirectDomain.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[TrackingOptions]
    }
  }

  @js.native
  trait UntagResourceRequest extends js.Object {
    var ResourceArn: AmazonResourceName
    var TagKeys: TagKeyList
  }

  object UntagResourceRequest {
    @inline
    def apply(
        ResourceArn: AmazonResourceName,
        TagKeys: TagKeyList
    ): UntagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any],
        "TagKeys" -> TagKeys.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UntagResourceRequest]
    }
  }

  @js.native
  trait UntagResourceResponse extends js.Object

  object UntagResourceResponse {
    @inline
    def apply(): UntagResourceResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UntagResourceResponse]
    }
  }

  /** A request to change the settings for an event destination for a configuration set.
    */
  @js.native
  trait UpdateConfigurationSetEventDestinationRequest extends js.Object {
    var ConfigurationSetName: ConfigurationSetName
    var EventDestination: EventDestinationDefinition
    var EventDestinationName: EventDestinationName
  }

  object UpdateConfigurationSetEventDestinationRequest {
    @inline
    def apply(
        ConfigurationSetName: ConfigurationSetName,
        EventDestination: EventDestinationDefinition,
        EventDestinationName: EventDestinationName
    ): UpdateConfigurationSetEventDestinationRequest = {
      val __obj = js.Dynamic.literal(
        "ConfigurationSetName" -> ConfigurationSetName.asInstanceOf[js.Any],
        "EventDestination" -> EventDestination.asInstanceOf[js.Any],
        "EventDestinationName" -> EventDestinationName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateConfigurationSetEventDestinationRequest]
    }
  }

  /** An HTTP 200 response if the request succeeds, or an error message if the request fails.
    */
  @js.native
  trait UpdateConfigurationSetEventDestinationResponse extends js.Object

  object UpdateConfigurationSetEventDestinationResponse {
    @inline
    def apply(): UpdateConfigurationSetEventDestinationResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateConfigurationSetEventDestinationResponse]
    }
  }

  @js.native
  trait UpdateContactListRequest extends js.Object {
    var ContactListName: ContactListName
    var Description: js.UndefOr[Description]
    var Topics: js.UndefOr[Topics]
  }

  object UpdateContactListRequest {
    @inline
    def apply(
        ContactListName: ContactListName,
        Description: js.UndefOr[Description] = js.undefined,
        Topics: js.UndefOr[Topics] = js.undefined
    ): UpdateContactListRequest = {
      val __obj = js.Dynamic.literal(
        "ContactListName" -> ContactListName.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Topics.foreach(__v => __obj.updateDynamic("Topics")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateContactListRequest]
    }
  }

  @js.native
  trait UpdateContactListResponse extends js.Object

  object UpdateContactListResponse {
    @inline
    def apply(): UpdateContactListResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateContactListResponse]
    }
  }

  @js.native
  trait UpdateContactRequest extends js.Object {
    var ContactListName: ContactListName
    var EmailAddress: EmailAddress
    var AttributesData: js.UndefOr[AttributesData]
    var TopicPreferences: js.UndefOr[TopicPreferenceList]
    var UnsubscribeAll: js.UndefOr[UnsubscribeAll]
  }

  object UpdateContactRequest {
    @inline
    def apply(
        ContactListName: ContactListName,
        EmailAddress: EmailAddress,
        AttributesData: js.UndefOr[AttributesData] = js.undefined,
        TopicPreferences: js.UndefOr[TopicPreferenceList] = js.undefined,
        UnsubscribeAll: js.UndefOr[UnsubscribeAll] = js.undefined
    ): UpdateContactRequest = {
      val __obj = js.Dynamic.literal(
        "ContactListName" -> ContactListName.asInstanceOf[js.Any],
        "EmailAddress" -> EmailAddress.asInstanceOf[js.Any]
      )

      AttributesData.foreach(__v => __obj.updateDynamic("AttributesData")(__v.asInstanceOf[js.Any]))
      TopicPreferences.foreach(__v => __obj.updateDynamic("TopicPreferences")(__v.asInstanceOf[js.Any]))
      UnsubscribeAll.foreach(__v => __obj.updateDynamic("UnsubscribeAll")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateContactRequest]
    }
  }

  @js.native
  trait UpdateContactResponse extends js.Object

  object UpdateContactResponse {
    @inline
    def apply(): UpdateContactResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateContactResponse]
    }
  }

  /** Represents a request to update an existing custom verification email template.
    */
  @js.native
  trait UpdateCustomVerificationEmailTemplateRequest extends js.Object {
    var FailureRedirectionURL: FailureRedirectionURL
    var FromEmailAddress: EmailAddress
    var SuccessRedirectionURL: SuccessRedirectionURL
    var TemplateContent: TemplateContent
    var TemplateName: EmailTemplateName
    var TemplateSubject: EmailTemplateSubject
  }

  object UpdateCustomVerificationEmailTemplateRequest {
    @inline
    def apply(
        FailureRedirectionURL: FailureRedirectionURL,
        FromEmailAddress: EmailAddress,
        SuccessRedirectionURL: SuccessRedirectionURL,
        TemplateContent: TemplateContent,
        TemplateName: EmailTemplateName,
        TemplateSubject: EmailTemplateSubject
    ): UpdateCustomVerificationEmailTemplateRequest = {
      val __obj = js.Dynamic.literal(
        "FailureRedirectionURL" -> FailureRedirectionURL.asInstanceOf[js.Any],
        "FromEmailAddress" -> FromEmailAddress.asInstanceOf[js.Any],
        "SuccessRedirectionURL" -> SuccessRedirectionURL.asInstanceOf[js.Any],
        "TemplateContent" -> TemplateContent.asInstanceOf[js.Any],
        "TemplateName" -> TemplateName.asInstanceOf[js.Any],
        "TemplateSubject" -> TemplateSubject.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateCustomVerificationEmailTemplateRequest]
    }
  }

  /** If the action is successful, the service sends back an HTTP 200 response with an empty HTTP body.
    */
  @js.native
  trait UpdateCustomVerificationEmailTemplateResponse extends js.Object

  object UpdateCustomVerificationEmailTemplateResponse {
    @inline
    def apply(): UpdateCustomVerificationEmailTemplateResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateCustomVerificationEmailTemplateResponse]
    }
  }

  /** Represents a request to update a sending authorization policy for an identity. Sending authorization is an Amazon SES feature that enables you to authorize other senders to use your identities. For information, see the [[https://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization-identity-owner-tasks-management.html|Amazon SES Developer Guide]].
    */
  @js.native
  trait UpdateEmailIdentityPolicyRequest extends js.Object {
    var EmailIdentity: Identity
    var Policy: Policy
    var PolicyName: PolicyName
  }

  object UpdateEmailIdentityPolicyRequest {
    @inline
    def apply(
        EmailIdentity: Identity,
        Policy: Policy,
        PolicyName: PolicyName
    ): UpdateEmailIdentityPolicyRequest = {
      val __obj = js.Dynamic.literal(
        "EmailIdentity" -> EmailIdentity.asInstanceOf[js.Any],
        "Policy" -> Policy.asInstanceOf[js.Any],
        "PolicyName" -> PolicyName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateEmailIdentityPolicyRequest]
    }
  }

  /** An HTTP 200 response if the request succeeds, or an error message if the request fails.
    */
  @js.native
  trait UpdateEmailIdentityPolicyResponse extends js.Object

  object UpdateEmailIdentityPolicyResponse {
    @inline
    def apply(): UpdateEmailIdentityPolicyResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateEmailIdentityPolicyResponse]
    }
  }

  /** Represents a request to update an email template. For more information, see the [[https://docs.aws.amazon.com/ses/latest/DeveloperGuide/send-personalized-email-api.html|Amazon SES Developer Guide]].
    */
  @js.native
  trait UpdateEmailTemplateRequest extends js.Object {
    var TemplateContent: EmailTemplateContent
    var TemplateName: EmailTemplateName
  }

  object UpdateEmailTemplateRequest {
    @inline
    def apply(
        TemplateContent: EmailTemplateContent,
        TemplateName: EmailTemplateName
    ): UpdateEmailTemplateRequest = {
      val __obj = js.Dynamic.literal(
        "TemplateContent" -> TemplateContent.asInstanceOf[js.Any],
        "TemplateName" -> TemplateName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateEmailTemplateRequest]
    }
  }

  /** If the action is successful, the service sends back an HTTP 200 response with an empty HTTP body.
    */
  @js.native
  trait UpdateEmailTemplateResponse extends js.Object

  object UpdateEmailTemplateResponse {
    @inline
    def apply(): UpdateEmailTemplateResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateEmailTemplateResponse]
    }
  }

  /** The VDM attributes that apply to your Amazon SES account.
    */
  @js.native
  trait VdmAttributes extends js.Object {
    var VdmEnabled: FeatureStatus
    var DashboardAttributes: js.UndefOr[DashboardAttributes]
    var GuardianAttributes: js.UndefOr[GuardianAttributes]
  }

  object VdmAttributes {
    @inline
    def apply(
        VdmEnabled: FeatureStatus,
        DashboardAttributes: js.UndefOr[DashboardAttributes] = js.undefined,
        GuardianAttributes: js.UndefOr[GuardianAttributes] = js.undefined
    ): VdmAttributes = {
      val __obj = js.Dynamic.literal(
        "VdmEnabled" -> VdmEnabled.asInstanceOf[js.Any]
      )

      DashboardAttributes.foreach(__v => __obj.updateDynamic("DashboardAttributes")(__v.asInstanceOf[js.Any]))
      GuardianAttributes.foreach(__v => __obj.updateDynamic("GuardianAttributes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VdmAttributes]
    }
  }

  /** An object that defines the VDM settings that apply to emails that you send using the configuration set.
    */
  @js.native
  trait VdmOptions extends js.Object {
    var DashboardOptions: js.UndefOr[DashboardOptions]
    var GuardianOptions: js.UndefOr[GuardianOptions]
  }

  object VdmOptions {
    @inline
    def apply(
        DashboardOptions: js.UndefOr[DashboardOptions] = js.undefined,
        GuardianOptions: js.UndefOr[GuardianOptions] = js.undefined
    ): VdmOptions = {
      val __obj = js.Dynamic.literal()
      DashboardOptions.foreach(__v => __obj.updateDynamic("DashboardOptions")(__v.asInstanceOf[js.Any]))
      GuardianOptions.foreach(__v => __obj.updateDynamic("GuardianOptions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VdmOptions]
    }
  }

  /** An object that contains information about the amount of email that was delivered to recipients.
    */
  @js.native
  trait VolumeStatistics extends js.Object {
    var InboxRawCount: js.UndefOr[Volume]
    var ProjectedInbox: js.UndefOr[Volume]
    var ProjectedSpam: js.UndefOr[Volume]
    var SpamRawCount: js.UndefOr[Volume]
  }

  object VolumeStatistics {
    @inline
    def apply(
        InboxRawCount: js.UndefOr[Volume] = js.undefined,
        ProjectedInbox: js.UndefOr[Volume] = js.undefined,
        ProjectedSpam: js.UndefOr[Volume] = js.undefined,
        SpamRawCount: js.UndefOr[Volume] = js.undefined
    ): VolumeStatistics = {
      val __obj = js.Dynamic.literal()
      InboxRawCount.foreach(__v => __obj.updateDynamic("InboxRawCount")(__v.asInstanceOf[js.Any]))
      ProjectedInbox.foreach(__v => __obj.updateDynamic("ProjectedInbox")(__v.asInstanceOf[js.Any]))
      ProjectedSpam.foreach(__v => __obj.updateDynamic("ProjectedSpam")(__v.asInstanceOf[js.Any]))
      SpamRawCount.foreach(__v => __obj.updateDynamic("SpamRawCount")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VolumeStatistics]
    }
  }
}
