package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import scala.language.implicitConversions
import facade.amazonaws._

package object auditmanager {
  type AWSAccounts = js.Array[AWSAccount]
  type AWSServiceName = String
  type AWSServices = js.Array[AWSService]
  type AccountId = String
  type AccountName = String
  type ActionPlanInstructions = String
  type ActionPlanTitle = String
  type AssessmentControlSets = js.Array[AssessmentControlSet]
  type AssessmentControls = js.Array[AssessmentControl]
  type AssessmentDescription = String
  type AssessmentEvidenceFolderName = String
  type AssessmentEvidenceFolders = js.Array[AssessmentEvidenceFolder]
  type AssessmentFrameworkDescription = String
  type AssessmentFrameworkShareRequestList = js.Array[AssessmentFrameworkShareRequest]
  type AssessmentName = String
  type AssessmentReportDescription = String
  type AssessmentReportEvidenceErrors = js.Array[AssessmentReportEvidenceError]
  type AssessmentReportName = String
  type AssessmentReportsMetadata = js.Array[AssessmentReportMetadata]
  type AuditManagerArn = String
  type BatchCreateDelegationByAssessmentErrors = js.Array[BatchCreateDelegationByAssessmentError]
  type BatchDeleteDelegationByAssessmentErrors = js.Array[BatchDeleteDelegationByAssessmentError]
  type BatchImportEvidenceToAssessmentControlErrors = js.Array[BatchImportEvidenceToAssessmentControlError]
  type ChangeLogs = js.Array[ChangeLog]
  type ComplianceType = String
  type ControlCommentBody = String
  type ControlComments = js.Array[ControlComment]
  type ControlDescription = String
  type ControlDomainInsightsList = js.Array[ControlDomainInsights]
  type ControlInsightsMetadata = js.Array[ControlInsightsMetadataItem]
  type ControlInsightsMetadataByAssessment = js.Array[ControlInsightsMetadataByAssessmentItem]
  type ControlMappingSources = js.Array[ControlMappingSource]
  type ControlMetadataList = js.Array[ControlMetadata]
  type ControlName = String
  type ControlSetId = String
  type ControlSetName = String
  type ControlSets = js.Array[ControlSet]
  type ControlSetsCount = Int
  type ControlSources = String
  type Controls = js.Array[Control]
  type ControlsCount = Int
  type CreateAssessmentFrameworkControlSets = js.Array[CreateAssessmentFrameworkControlSet]
  type CreateAssessmentFrameworkControls = js.Array[CreateAssessmentFrameworkControl]
  type CreateControlMappingSources = js.Array[CreateControlMappingSource]
  type CreateDelegationRequests = js.Array[CreateDelegationRequest]
  type CreatedBy = String
  type DelegationComment = String
  type DelegationIds = js.Array[UUID]
  type DelegationMetadataList = js.Array[DelegationMetadata]
  type Delegations = js.Array[Delegation]
  type EmailAddress = String
  type ErrorCode = String
  type ErrorMessage = String
  type EventName = String
  type EvidenceAttributeKey = String
  type EvidenceAttributeValue = String
  type EvidenceAttributes = js.Dictionary[EvidenceAttributeValue]
  type EvidenceIds = js.Array[UUID]
  type EvidenceList = js.Array[Evidence]
  type EvidenceSources = js.Array[NonEmptyString]
  type Filename = String
  type FrameworkDescription = String
  type FrameworkMetadataList = js.Array[AssessmentFrameworkMetadata]
  type FrameworkName = String
  type GenericArn = String
  type HyperlinkName = String
  type IamArn = String
  type KeywordValue = String
  type Keywords = js.Array[KeywordValue]
  type KmsKey = String
  type LastUpdatedBy = String
  type ListAssessmentMetadata = js.Array[AssessmentMetadataItem]
  type ManualEvidenceList = js.Array[ManualEvidence]
  type MaxResults = Int
  type NonEmptyString = String
  type Notifications = js.Array[Notification]
  type NullableInteger = Int
  type Region = String
  type Resources = js.Array[Resource]
  type Roles = js.Array[Role]
  type S3Url = String
  type SNSTopic = String
  type ServiceMetadataList = js.Array[ServiceMetadata]
  type ShareRequestComment = String
  type SnsArn = String
  type SourceDescription = String
  type SourceName = String
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagMap = js.Dictionary[TagValue]
  type TagValue = String
  type TestingInformation = String
  type Timestamp = js.Date
  type TimestampUUID = String
  type Token = String
  type TroubleshootingText = String
  type UUID = String
  type UpdateAssessmentFrameworkControlSets = js.Array[UpdateAssessmentFrameworkControlSet]
  type UrlLink = String
  type Username = String
  type ValidationErrors = js.Array[NonEmptyString]
  type organizationId = String

  final class AuditManagerOps(private val service: AuditManager) extends AnyVal {

    @inline def associateAssessmentReportEvidenceFolderFuture(params: AssociateAssessmentReportEvidenceFolderRequest): Future[AssociateAssessmentReportEvidenceFolderResponse] = service.associateAssessmentReportEvidenceFolder(params).promise().toFuture
    @inline def batchAssociateAssessmentReportEvidenceFuture(params: BatchAssociateAssessmentReportEvidenceRequest): Future[BatchAssociateAssessmentReportEvidenceResponse] = service.batchAssociateAssessmentReportEvidence(params).promise().toFuture
    @inline def batchCreateDelegationByAssessmentFuture(params: BatchCreateDelegationByAssessmentRequest): Future[BatchCreateDelegationByAssessmentResponse] = service.batchCreateDelegationByAssessment(params).promise().toFuture
    @inline def batchDeleteDelegationByAssessmentFuture(params: BatchDeleteDelegationByAssessmentRequest): Future[BatchDeleteDelegationByAssessmentResponse] = service.batchDeleteDelegationByAssessment(params).promise().toFuture
    @inline def batchDisassociateAssessmentReportEvidenceFuture(params: BatchDisassociateAssessmentReportEvidenceRequest): Future[BatchDisassociateAssessmentReportEvidenceResponse] = service.batchDisassociateAssessmentReportEvidence(params).promise().toFuture
    @inline def batchImportEvidenceToAssessmentControlFuture(params: BatchImportEvidenceToAssessmentControlRequest): Future[BatchImportEvidenceToAssessmentControlResponse] = service.batchImportEvidenceToAssessmentControl(params).promise().toFuture
    @inline def createAssessmentFrameworkFuture(params: CreateAssessmentFrameworkRequest): Future[CreateAssessmentFrameworkResponse] = service.createAssessmentFramework(params).promise().toFuture
    @inline def createAssessmentFuture(params: CreateAssessmentRequest): Future[CreateAssessmentResponse] = service.createAssessment(params).promise().toFuture
    @inline def createAssessmentReportFuture(params: CreateAssessmentReportRequest): Future[CreateAssessmentReportResponse] = service.createAssessmentReport(params).promise().toFuture
    @inline def createControlFuture(params: CreateControlRequest): Future[CreateControlResponse] = service.createControl(params).promise().toFuture
    @inline def deleteAssessmentFrameworkFuture(params: DeleteAssessmentFrameworkRequest): Future[DeleteAssessmentFrameworkResponse] = service.deleteAssessmentFramework(params).promise().toFuture
    @inline def deleteAssessmentFrameworkShareFuture(params: DeleteAssessmentFrameworkShareRequest): Future[DeleteAssessmentFrameworkShareResponse] = service.deleteAssessmentFrameworkShare(params).promise().toFuture
    @inline def deleteAssessmentFuture(params: DeleteAssessmentRequest): Future[DeleteAssessmentResponse] = service.deleteAssessment(params).promise().toFuture
    @inline def deleteAssessmentReportFuture(params: DeleteAssessmentReportRequest): Future[DeleteAssessmentReportResponse] = service.deleteAssessmentReport(params).promise().toFuture
    @inline def deleteControlFuture(params: DeleteControlRequest): Future[DeleteControlResponse] = service.deleteControl(params).promise().toFuture
    @inline def deregisterAccountFuture(params: DeregisterAccountRequest): Future[DeregisterAccountResponse] = service.deregisterAccount(params).promise().toFuture
    @inline def deregisterOrganizationAdminAccountFuture(params: DeregisterOrganizationAdminAccountRequest): Future[DeregisterOrganizationAdminAccountResponse] = service.deregisterOrganizationAdminAccount(params).promise().toFuture
    @inline def disassociateAssessmentReportEvidenceFolderFuture(params: DisassociateAssessmentReportEvidenceFolderRequest): Future[DisassociateAssessmentReportEvidenceFolderResponse] = service.disassociateAssessmentReportEvidenceFolder(params).promise().toFuture
    @inline def getAccountStatusFuture(params: GetAccountStatusRequest): Future[GetAccountStatusResponse] = service.getAccountStatus(params).promise().toFuture
    @inline def getAssessmentFrameworkFuture(params: GetAssessmentFrameworkRequest): Future[GetAssessmentFrameworkResponse] = service.getAssessmentFramework(params).promise().toFuture
    @inline def getAssessmentFuture(params: GetAssessmentRequest): Future[GetAssessmentResponse] = service.getAssessment(params).promise().toFuture
    @inline def getAssessmentReportUrlFuture(params: GetAssessmentReportUrlRequest): Future[GetAssessmentReportUrlResponse] = service.getAssessmentReportUrl(params).promise().toFuture
    @inline def getChangeLogsFuture(params: GetChangeLogsRequest): Future[GetChangeLogsResponse] = service.getChangeLogs(params).promise().toFuture
    @inline def getControlFuture(params: GetControlRequest): Future[GetControlResponse] = service.getControl(params).promise().toFuture
    @inline def getDelegationsFuture(params: GetDelegationsRequest): Future[GetDelegationsResponse] = service.getDelegations(params).promise().toFuture
    @inline def getEvidenceByEvidenceFolderFuture(params: GetEvidenceByEvidenceFolderRequest): Future[GetEvidenceByEvidenceFolderResponse] = service.getEvidenceByEvidenceFolder(params).promise().toFuture
    @inline def getEvidenceFolderFuture(params: GetEvidenceFolderRequest): Future[GetEvidenceFolderResponse] = service.getEvidenceFolder(params).promise().toFuture
    @inline def getEvidenceFoldersByAssessmentControlFuture(params: GetEvidenceFoldersByAssessmentControlRequest): Future[GetEvidenceFoldersByAssessmentControlResponse] = service.getEvidenceFoldersByAssessmentControl(params).promise().toFuture
    @inline def getEvidenceFoldersByAssessmentFuture(params: GetEvidenceFoldersByAssessmentRequest): Future[GetEvidenceFoldersByAssessmentResponse] = service.getEvidenceFoldersByAssessment(params).promise().toFuture
    @inline def getEvidenceFuture(params: GetEvidenceRequest): Future[GetEvidenceResponse] = service.getEvidence(params).promise().toFuture
    @inline def getInsightsByAssessmentFuture(params: GetInsightsByAssessmentRequest): Future[GetInsightsByAssessmentResponse] = service.getInsightsByAssessment(params).promise().toFuture
    @inline def getInsightsFuture(params: GetInsightsRequest): Future[GetInsightsResponse] = service.getInsights(params).promise().toFuture
    @inline def getOrganizationAdminAccountFuture(params: GetOrganizationAdminAccountRequest): Future[GetOrganizationAdminAccountResponse] = service.getOrganizationAdminAccount(params).promise().toFuture
    @inline def getServicesInScopeFuture(params: GetServicesInScopeRequest): Future[GetServicesInScopeResponse] = service.getServicesInScope(params).promise().toFuture
    @inline def getSettingsFuture(params: GetSettingsRequest): Future[GetSettingsResponse] = service.getSettings(params).promise().toFuture
    @inline def listAssessmentControlInsightsByControlDomainFuture(params: ListAssessmentControlInsightsByControlDomainRequest): Future[ListAssessmentControlInsightsByControlDomainResponse] = service.listAssessmentControlInsightsByControlDomain(params).promise().toFuture
    @inline def listAssessmentFrameworkShareRequestsFuture(params: ListAssessmentFrameworkShareRequestsRequest): Future[ListAssessmentFrameworkShareRequestsResponse] = service.listAssessmentFrameworkShareRequests(params).promise().toFuture
    @inline def listAssessmentFrameworksFuture(params: ListAssessmentFrameworksRequest): Future[ListAssessmentFrameworksResponse] = service.listAssessmentFrameworks(params).promise().toFuture
    @inline def listAssessmentReportsFuture(params: ListAssessmentReportsRequest): Future[ListAssessmentReportsResponse] = service.listAssessmentReports(params).promise().toFuture
    @inline def listAssessmentsFuture(params: ListAssessmentsRequest): Future[ListAssessmentsResponse] = service.listAssessments(params).promise().toFuture
    @inline def listControlDomainInsightsByAssessmentFuture(params: ListControlDomainInsightsByAssessmentRequest): Future[ListControlDomainInsightsByAssessmentResponse] = service.listControlDomainInsightsByAssessment(params).promise().toFuture
    @inline def listControlDomainInsightsFuture(params: ListControlDomainInsightsRequest): Future[ListControlDomainInsightsResponse] = service.listControlDomainInsights(params).promise().toFuture
    @inline def listControlInsightsByControlDomainFuture(params: ListControlInsightsByControlDomainRequest): Future[ListControlInsightsByControlDomainResponse] = service.listControlInsightsByControlDomain(params).promise().toFuture
    @inline def listControlsFuture(params: ListControlsRequest): Future[ListControlsResponse] = service.listControls(params).promise().toFuture
    @inline def listKeywordsForDataSourceFuture(params: ListKeywordsForDataSourceRequest): Future[ListKeywordsForDataSourceResponse] = service.listKeywordsForDataSource(params).promise().toFuture
    @inline def listNotificationsFuture(params: ListNotificationsRequest): Future[ListNotificationsResponse] = service.listNotifications(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] = service.listTagsForResource(params).promise().toFuture
    @inline def registerAccountFuture(params: RegisterAccountRequest): Future[RegisterAccountResponse] = service.registerAccount(params).promise().toFuture
    @inline def registerOrganizationAdminAccountFuture(params: RegisterOrganizationAdminAccountRequest): Future[RegisterOrganizationAdminAccountResponse] = service.registerOrganizationAdminAccount(params).promise().toFuture
    @inline def startAssessmentFrameworkShareFuture(params: StartAssessmentFrameworkShareRequest): Future[StartAssessmentFrameworkShareResponse] = service.startAssessmentFrameworkShare(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] = service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] = service.untagResource(params).promise().toFuture
    @inline def updateAssessmentControlFuture(params: UpdateAssessmentControlRequest): Future[UpdateAssessmentControlResponse] = service.updateAssessmentControl(params).promise().toFuture
    @inline def updateAssessmentControlSetStatusFuture(params: UpdateAssessmentControlSetStatusRequest): Future[UpdateAssessmentControlSetStatusResponse] = service.updateAssessmentControlSetStatus(params).promise().toFuture
    @inline def updateAssessmentFrameworkFuture(params: UpdateAssessmentFrameworkRequest): Future[UpdateAssessmentFrameworkResponse] = service.updateAssessmentFramework(params).promise().toFuture
    @inline def updateAssessmentFrameworkShareFuture(params: UpdateAssessmentFrameworkShareRequest): Future[UpdateAssessmentFrameworkShareResponse] = service.updateAssessmentFrameworkShare(params).promise().toFuture
    @inline def updateAssessmentFuture(params: UpdateAssessmentRequest): Future[UpdateAssessmentResponse] = service.updateAssessment(params).promise().toFuture
    @inline def updateAssessmentStatusFuture(params: UpdateAssessmentStatusRequest): Future[UpdateAssessmentStatusResponse] = service.updateAssessmentStatus(params).promise().toFuture
    @inline def updateControlFuture(params: UpdateControlRequest): Future[UpdateControlResponse] = service.updateControl(params).promise().toFuture
    @inline def updateSettingsFuture(params: UpdateSettingsRequest): Future[UpdateSettingsResponse] = service.updateSettings(params).promise().toFuture
    @inline def validateAssessmentReportIntegrityFuture(params: ValidateAssessmentReportIntegrityRequest): Future[ValidateAssessmentReportIntegrityResponse] = service.validateAssessmentReportIntegrity(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/auditmanager", JSImport.Namespace, "AWS.AuditManager")
  class AuditManager() extends js.Object {
    def this(config: AWSConfig) = this()

    def associateAssessmentReportEvidenceFolder(params: AssociateAssessmentReportEvidenceFolderRequest): Request[AssociateAssessmentReportEvidenceFolderResponse] = js.native
    def batchAssociateAssessmentReportEvidence(params: BatchAssociateAssessmentReportEvidenceRequest): Request[BatchAssociateAssessmentReportEvidenceResponse] = js.native
    def batchCreateDelegationByAssessment(params: BatchCreateDelegationByAssessmentRequest): Request[BatchCreateDelegationByAssessmentResponse] = js.native
    def batchDeleteDelegationByAssessment(params: BatchDeleteDelegationByAssessmentRequest): Request[BatchDeleteDelegationByAssessmentResponse] = js.native
    def batchDisassociateAssessmentReportEvidence(params: BatchDisassociateAssessmentReportEvidenceRequest): Request[BatchDisassociateAssessmentReportEvidenceResponse] = js.native
    def batchImportEvidenceToAssessmentControl(params: BatchImportEvidenceToAssessmentControlRequest): Request[BatchImportEvidenceToAssessmentControlResponse] = js.native
    def createAssessment(params: CreateAssessmentRequest): Request[CreateAssessmentResponse] = js.native
    def createAssessmentFramework(params: CreateAssessmentFrameworkRequest): Request[CreateAssessmentFrameworkResponse] = js.native
    def createAssessmentReport(params: CreateAssessmentReportRequest): Request[CreateAssessmentReportResponse] = js.native
    def createControl(params: CreateControlRequest): Request[CreateControlResponse] = js.native
    def deleteAssessment(params: DeleteAssessmentRequest): Request[DeleteAssessmentResponse] = js.native
    def deleteAssessmentFramework(params: DeleteAssessmentFrameworkRequest): Request[DeleteAssessmentFrameworkResponse] = js.native
    def deleteAssessmentFrameworkShare(params: DeleteAssessmentFrameworkShareRequest): Request[DeleteAssessmentFrameworkShareResponse] = js.native
    def deleteAssessmentReport(params: DeleteAssessmentReportRequest): Request[DeleteAssessmentReportResponse] = js.native
    def deleteControl(params: DeleteControlRequest): Request[DeleteControlResponse] = js.native
    def deregisterAccount(params: DeregisterAccountRequest): Request[DeregisterAccountResponse] = js.native
    def deregisterOrganizationAdminAccount(params: DeregisterOrganizationAdminAccountRequest): Request[DeregisterOrganizationAdminAccountResponse] = js.native
    def disassociateAssessmentReportEvidenceFolder(params: DisassociateAssessmentReportEvidenceFolderRequest): Request[DisassociateAssessmentReportEvidenceFolderResponse] = js.native
    def getAccountStatus(params: GetAccountStatusRequest): Request[GetAccountStatusResponse] = js.native
    def getAssessment(params: GetAssessmentRequest): Request[GetAssessmentResponse] = js.native
    def getAssessmentFramework(params: GetAssessmentFrameworkRequest): Request[GetAssessmentFrameworkResponse] = js.native
    def getAssessmentReportUrl(params: GetAssessmentReportUrlRequest): Request[GetAssessmentReportUrlResponse] = js.native
    def getChangeLogs(params: GetChangeLogsRequest): Request[GetChangeLogsResponse] = js.native
    def getControl(params: GetControlRequest): Request[GetControlResponse] = js.native
    def getDelegations(params: GetDelegationsRequest): Request[GetDelegationsResponse] = js.native
    def getEvidence(params: GetEvidenceRequest): Request[GetEvidenceResponse] = js.native
    def getEvidenceByEvidenceFolder(params: GetEvidenceByEvidenceFolderRequest): Request[GetEvidenceByEvidenceFolderResponse] = js.native
    def getEvidenceFolder(params: GetEvidenceFolderRequest): Request[GetEvidenceFolderResponse] = js.native
    def getEvidenceFoldersByAssessment(params: GetEvidenceFoldersByAssessmentRequest): Request[GetEvidenceFoldersByAssessmentResponse] = js.native
    def getEvidenceFoldersByAssessmentControl(params: GetEvidenceFoldersByAssessmentControlRequest): Request[GetEvidenceFoldersByAssessmentControlResponse] = js.native
    def getInsights(params: GetInsightsRequest): Request[GetInsightsResponse] = js.native
    def getInsightsByAssessment(params: GetInsightsByAssessmentRequest): Request[GetInsightsByAssessmentResponse] = js.native
    def getOrganizationAdminAccount(params: GetOrganizationAdminAccountRequest): Request[GetOrganizationAdminAccountResponse] = js.native
    def getServicesInScope(params: GetServicesInScopeRequest): Request[GetServicesInScopeResponse] = js.native
    def getSettings(params: GetSettingsRequest): Request[GetSettingsResponse] = js.native
    def listAssessmentControlInsightsByControlDomain(params: ListAssessmentControlInsightsByControlDomainRequest): Request[ListAssessmentControlInsightsByControlDomainResponse] = js.native
    def listAssessmentFrameworkShareRequests(params: ListAssessmentFrameworkShareRequestsRequest): Request[ListAssessmentFrameworkShareRequestsResponse] = js.native
    def listAssessmentFrameworks(params: ListAssessmentFrameworksRequest): Request[ListAssessmentFrameworksResponse] = js.native
    def listAssessmentReports(params: ListAssessmentReportsRequest): Request[ListAssessmentReportsResponse] = js.native
    def listAssessments(params: ListAssessmentsRequest): Request[ListAssessmentsResponse] = js.native
    def listControlDomainInsights(params: ListControlDomainInsightsRequest): Request[ListControlDomainInsightsResponse] = js.native
    def listControlDomainInsightsByAssessment(params: ListControlDomainInsightsByAssessmentRequest): Request[ListControlDomainInsightsByAssessmentResponse] = js.native
    def listControlInsightsByControlDomain(params: ListControlInsightsByControlDomainRequest): Request[ListControlInsightsByControlDomainResponse] = js.native
    def listControls(params: ListControlsRequest): Request[ListControlsResponse] = js.native
    def listKeywordsForDataSource(params: ListKeywordsForDataSourceRequest): Request[ListKeywordsForDataSourceResponse] = js.native
    def listNotifications(params: ListNotificationsRequest): Request[ListNotificationsResponse] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def registerAccount(params: RegisterAccountRequest): Request[RegisterAccountResponse] = js.native
    def registerOrganizationAdminAccount(params: RegisterOrganizationAdminAccountRequest): Request[RegisterOrganizationAdminAccountResponse] = js.native
    def startAssessmentFrameworkShare(params: StartAssessmentFrameworkShareRequest): Request[StartAssessmentFrameworkShareResponse] = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse] = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse] = js.native
    def updateAssessment(params: UpdateAssessmentRequest): Request[UpdateAssessmentResponse] = js.native
    def updateAssessmentControl(params: UpdateAssessmentControlRequest): Request[UpdateAssessmentControlResponse] = js.native
    def updateAssessmentControlSetStatus(params: UpdateAssessmentControlSetStatusRequest): Request[UpdateAssessmentControlSetStatusResponse] = js.native
    def updateAssessmentFramework(params: UpdateAssessmentFrameworkRequest): Request[UpdateAssessmentFrameworkResponse] = js.native
    def updateAssessmentFrameworkShare(params: UpdateAssessmentFrameworkShareRequest): Request[UpdateAssessmentFrameworkShareResponse] = js.native
    def updateAssessmentStatus(params: UpdateAssessmentStatusRequest): Request[UpdateAssessmentStatusResponse] = js.native
    def updateControl(params: UpdateControlRequest): Request[UpdateControlResponse] = js.native
    def updateSettings(params: UpdateSettingsRequest): Request[UpdateSettingsResponse] = js.native
    def validateAssessmentReportIntegrity(params: ValidateAssessmentReportIntegrityRequest): Request[ValidateAssessmentReportIntegrityResponse] = js.native
  }
  object AuditManager {
    @inline implicit def toOps(service: AuditManager): AuditManagerOps = {
      new AuditManagerOps(service)
    }
  }

  /** The wrapper of Amazon Web Services account details, such as account ID or email address.
    */
  @js.native
  trait AWSAccount extends js.Object {
    var emailAddress: js.UndefOr[EmailAddress]
    var id: js.UndefOr[AccountId]
    var name: js.UndefOr[AccountName]
  }

  object AWSAccount {
    @inline
    def apply(
        emailAddress: js.UndefOr[EmailAddress] = js.undefined,
        id: js.UndefOr[AccountId] = js.undefined,
        name: js.UndefOr[AccountName] = js.undefined
    ): AWSAccount = {
      val __obj = js.Dynamic.literal()
      emailAddress.foreach(__v => __obj.updateDynamic("emailAddress")(__v.asInstanceOf[js.Any]))
      id.foreach(__v => __obj.updateDynamic("id")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AWSAccount]
    }
  }

  /** An Amazon Web Service such as Amazon S3 or CloudTrail.
    */
  @js.native
  trait AWSService extends js.Object {
    var serviceName: js.UndefOr[AWSServiceName]
  }

  object AWSService {
    @inline
    def apply(
        serviceName: js.UndefOr[AWSServiceName] = js.undefined
    ): AWSService = {
      val __obj = js.Dynamic.literal()
      serviceName.foreach(__v => __obj.updateDynamic("serviceName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AWSService]
    }
  }

  /** An entity that defines the scope of audit evidence collected by Audit Manager. An Audit Manager assessment is an implementation of an Audit Manager framework.
    */
  @js.native
  trait Assessment extends js.Object {
    var arn: js.UndefOr[AuditManagerArn]
    var awsAccount: js.UndefOr[AWSAccount]
    var framework: js.UndefOr[AssessmentFramework]
    var metadata: js.UndefOr[AssessmentMetadata]
    var tags: js.UndefOr[TagMap]
  }

  object Assessment {
    @inline
    def apply(
        arn: js.UndefOr[AuditManagerArn] = js.undefined,
        awsAccount: js.UndefOr[AWSAccount] = js.undefined,
        framework: js.UndefOr[AssessmentFramework] = js.undefined,
        metadata: js.UndefOr[AssessmentMetadata] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined
    ): Assessment = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      awsAccount.foreach(__v => __obj.updateDynamic("awsAccount")(__v.asInstanceOf[js.Any]))
      framework.foreach(__v => __obj.updateDynamic("framework")(__v.asInstanceOf[js.Any]))
      metadata.foreach(__v => __obj.updateDynamic("metadata")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Assessment]
    }
  }

  /** The control entity that represents a standard control or a custom control in an Audit Manager assessment.
    */
  @js.native
  trait AssessmentControl extends js.Object {
    var assessmentReportEvidenceCount: js.UndefOr[Int]
    var comments: js.UndefOr[ControlComments]
    var description: js.UndefOr[ControlDescription]
    var evidenceCount: js.UndefOr[Int]
    var evidenceSources: js.UndefOr[EvidenceSources]
    var id: js.UndefOr[UUID]
    var name: js.UndefOr[ControlName]
    var response: js.UndefOr[ControlResponse]
    var status: js.UndefOr[ControlStatus]
  }

  object AssessmentControl {
    @inline
    def apply(
        assessmentReportEvidenceCount: js.UndefOr[Int] = js.undefined,
        comments: js.UndefOr[ControlComments] = js.undefined,
        description: js.UndefOr[ControlDescription] = js.undefined,
        evidenceCount: js.UndefOr[Int] = js.undefined,
        evidenceSources: js.UndefOr[EvidenceSources] = js.undefined,
        id: js.UndefOr[UUID] = js.undefined,
        name: js.UndefOr[ControlName] = js.undefined,
        response: js.UndefOr[ControlResponse] = js.undefined,
        status: js.UndefOr[ControlStatus] = js.undefined
    ): AssessmentControl = {
      val __obj = js.Dynamic.literal()
      assessmentReportEvidenceCount.foreach(__v => __obj.updateDynamic("assessmentReportEvidenceCount")(__v.asInstanceOf[js.Any]))
      comments.foreach(__v => __obj.updateDynamic("comments")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      evidenceCount.foreach(__v => __obj.updateDynamic("evidenceCount")(__v.asInstanceOf[js.Any]))
      evidenceSources.foreach(__v => __obj.updateDynamic("evidenceSources")(__v.asInstanceOf[js.Any]))
      id.foreach(__v => __obj.updateDynamic("id")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      response.foreach(__v => __obj.updateDynamic("response")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssessmentControl]
    }
  }

  /** Represents a set of controls in an Audit Manager assessment.
    */
  @js.native
  trait AssessmentControlSet extends js.Object {
    var controls: js.UndefOr[AssessmentControls]
    var delegations: js.UndefOr[Delegations]
    var description: js.UndefOr[NonEmptyString]
    var id: js.UndefOr[ControlSetId]
    var manualEvidenceCount: js.UndefOr[Int]
    var roles: js.UndefOr[Roles]
    var status: js.UndefOr[ControlSetStatus]
    var systemEvidenceCount: js.UndefOr[Int]
  }

  object AssessmentControlSet {
    @inline
    def apply(
        controls: js.UndefOr[AssessmentControls] = js.undefined,
        delegations: js.UndefOr[Delegations] = js.undefined,
        description: js.UndefOr[NonEmptyString] = js.undefined,
        id: js.UndefOr[ControlSetId] = js.undefined,
        manualEvidenceCount: js.UndefOr[Int] = js.undefined,
        roles: js.UndefOr[Roles] = js.undefined,
        status: js.UndefOr[ControlSetStatus] = js.undefined,
        systemEvidenceCount: js.UndefOr[Int] = js.undefined
    ): AssessmentControlSet = {
      val __obj = js.Dynamic.literal()
      controls.foreach(__v => __obj.updateDynamic("controls")(__v.asInstanceOf[js.Any]))
      delegations.foreach(__v => __obj.updateDynamic("delegations")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      id.foreach(__v => __obj.updateDynamic("id")(__v.asInstanceOf[js.Any]))
      manualEvidenceCount.foreach(__v => __obj.updateDynamic("manualEvidenceCount")(__v.asInstanceOf[js.Any]))
      roles.foreach(__v => __obj.updateDynamic("roles")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      systemEvidenceCount.foreach(__v => __obj.updateDynamic("systemEvidenceCount")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssessmentControlSet]
    }
  }

  /** The folder where Audit Manager stores evidence for an assessment.
    */
  @js.native
  trait AssessmentEvidenceFolder extends js.Object {
    var assessmentId: js.UndefOr[UUID]
    var assessmentReportSelectionCount: js.UndefOr[Int]
    var author: js.UndefOr[String]
    var controlId: js.UndefOr[UUID]
    var controlName: js.UndefOr[ControlName]
    var controlSetId: js.UndefOr[ControlSetId]
    var dataSource: js.UndefOr[String]
    var date: js.UndefOr[Timestamp]
    var evidenceAwsServiceSourceCount: js.UndefOr[Int]
    var evidenceByTypeComplianceCheckCount: js.UndefOr[Int]
    var evidenceByTypeComplianceCheckIssuesCount: js.UndefOr[Int]
    var evidenceByTypeConfigurationDataCount: js.UndefOr[Int]
    var evidenceByTypeManualCount: js.UndefOr[Int]
    var evidenceByTypeUserActivityCount: js.UndefOr[Int]
    var evidenceResourcesIncludedCount: js.UndefOr[Int]
    var id: js.UndefOr[UUID]
    var name: js.UndefOr[AssessmentEvidenceFolderName]
    var totalEvidence: js.UndefOr[Int]
  }

  object AssessmentEvidenceFolder {
    @inline
    def apply(
        assessmentId: js.UndefOr[UUID] = js.undefined,
        assessmentReportSelectionCount: js.UndefOr[Int] = js.undefined,
        author: js.UndefOr[String] = js.undefined,
        controlId: js.UndefOr[UUID] = js.undefined,
        controlName: js.UndefOr[ControlName] = js.undefined,
        controlSetId: js.UndefOr[ControlSetId] = js.undefined,
        dataSource: js.UndefOr[String] = js.undefined,
        date: js.UndefOr[Timestamp] = js.undefined,
        evidenceAwsServiceSourceCount: js.UndefOr[Int] = js.undefined,
        evidenceByTypeComplianceCheckCount: js.UndefOr[Int] = js.undefined,
        evidenceByTypeComplianceCheckIssuesCount: js.UndefOr[Int] = js.undefined,
        evidenceByTypeConfigurationDataCount: js.UndefOr[Int] = js.undefined,
        evidenceByTypeManualCount: js.UndefOr[Int] = js.undefined,
        evidenceByTypeUserActivityCount: js.UndefOr[Int] = js.undefined,
        evidenceResourcesIncludedCount: js.UndefOr[Int] = js.undefined,
        id: js.UndefOr[UUID] = js.undefined,
        name: js.UndefOr[AssessmentEvidenceFolderName] = js.undefined,
        totalEvidence: js.UndefOr[Int] = js.undefined
    ): AssessmentEvidenceFolder = {
      val __obj = js.Dynamic.literal()
      assessmentId.foreach(__v => __obj.updateDynamic("assessmentId")(__v.asInstanceOf[js.Any]))
      assessmentReportSelectionCount.foreach(__v => __obj.updateDynamic("assessmentReportSelectionCount")(__v.asInstanceOf[js.Any]))
      author.foreach(__v => __obj.updateDynamic("author")(__v.asInstanceOf[js.Any]))
      controlId.foreach(__v => __obj.updateDynamic("controlId")(__v.asInstanceOf[js.Any]))
      controlName.foreach(__v => __obj.updateDynamic("controlName")(__v.asInstanceOf[js.Any]))
      controlSetId.foreach(__v => __obj.updateDynamic("controlSetId")(__v.asInstanceOf[js.Any]))
      dataSource.foreach(__v => __obj.updateDynamic("dataSource")(__v.asInstanceOf[js.Any]))
      date.foreach(__v => __obj.updateDynamic("date")(__v.asInstanceOf[js.Any]))
      evidenceAwsServiceSourceCount.foreach(__v => __obj.updateDynamic("evidenceAwsServiceSourceCount")(__v.asInstanceOf[js.Any]))
      evidenceByTypeComplianceCheckCount.foreach(__v => __obj.updateDynamic("evidenceByTypeComplianceCheckCount")(__v.asInstanceOf[js.Any]))
      evidenceByTypeComplianceCheckIssuesCount.foreach(__v => __obj.updateDynamic("evidenceByTypeComplianceCheckIssuesCount")(__v.asInstanceOf[js.Any]))
      evidenceByTypeConfigurationDataCount.foreach(__v => __obj.updateDynamic("evidenceByTypeConfigurationDataCount")(__v.asInstanceOf[js.Any]))
      evidenceByTypeManualCount.foreach(__v => __obj.updateDynamic("evidenceByTypeManualCount")(__v.asInstanceOf[js.Any]))
      evidenceByTypeUserActivityCount.foreach(__v => __obj.updateDynamic("evidenceByTypeUserActivityCount")(__v.asInstanceOf[js.Any]))
      evidenceResourcesIncludedCount.foreach(__v => __obj.updateDynamic("evidenceResourcesIncludedCount")(__v.asInstanceOf[js.Any]))
      id.foreach(__v => __obj.updateDynamic("id")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      totalEvidence.foreach(__v => __obj.updateDynamic("totalEvidence")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssessmentEvidenceFolder]
    }
  }

  /** The file used to structure and automate Audit Manager assessments for a given compliance standard.
    */
  @js.native
  trait AssessmentFramework extends js.Object {
    var arn: js.UndefOr[AuditManagerArn]
    var controlSets: js.UndefOr[AssessmentControlSets]
    var id: js.UndefOr[UUID]
    var metadata: js.UndefOr[FrameworkMetadata]
  }

  object AssessmentFramework {
    @inline
    def apply(
        arn: js.UndefOr[AuditManagerArn] = js.undefined,
        controlSets: js.UndefOr[AssessmentControlSets] = js.undefined,
        id: js.UndefOr[UUID] = js.undefined,
        metadata: js.UndefOr[FrameworkMetadata] = js.undefined
    ): AssessmentFramework = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      controlSets.foreach(__v => __obj.updateDynamic("controlSets")(__v.asInstanceOf[js.Any]))
      id.foreach(__v => __obj.updateDynamic("id")(__v.asInstanceOf[js.Any]))
      metadata.foreach(__v => __obj.updateDynamic("metadata")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssessmentFramework]
    }
  }

  /** The metadata that's associated with a standard framework or a custom framework.
    */
  @js.native
  trait AssessmentFrameworkMetadata extends js.Object {
    var arn: js.UndefOr[AuditManagerArn]
    var complianceType: js.UndefOr[ComplianceType]
    var controlSetsCount: js.UndefOr[ControlSetsCount]
    var controlsCount: js.UndefOr[ControlsCount]
    var createdAt: js.UndefOr[Timestamp]
    var description: js.UndefOr[FrameworkDescription]
    var id: js.UndefOr[UUID]
    var lastUpdatedAt: js.UndefOr[Timestamp]
    var logo: js.UndefOr[Filename]
    var name: js.UndefOr[FrameworkName]
    var `type`: js.UndefOr[FrameworkType]
  }

  object AssessmentFrameworkMetadata {
    @inline
    def apply(
        arn: js.UndefOr[AuditManagerArn] = js.undefined,
        complianceType: js.UndefOr[ComplianceType] = js.undefined,
        controlSetsCount: js.UndefOr[ControlSetsCount] = js.undefined,
        controlsCount: js.UndefOr[ControlsCount] = js.undefined,
        createdAt: js.UndefOr[Timestamp] = js.undefined,
        description: js.UndefOr[FrameworkDescription] = js.undefined,
        id: js.UndefOr[UUID] = js.undefined,
        lastUpdatedAt: js.UndefOr[Timestamp] = js.undefined,
        logo: js.UndefOr[Filename] = js.undefined,
        name: js.UndefOr[FrameworkName] = js.undefined,
        `type`: js.UndefOr[FrameworkType] = js.undefined
    ): AssessmentFrameworkMetadata = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      complianceType.foreach(__v => __obj.updateDynamic("complianceType")(__v.asInstanceOf[js.Any]))
      controlSetsCount.foreach(__v => __obj.updateDynamic("controlSetsCount")(__v.asInstanceOf[js.Any]))
      controlsCount.foreach(__v => __obj.updateDynamic("controlsCount")(__v.asInstanceOf[js.Any]))
      createdAt.foreach(__v => __obj.updateDynamic("createdAt")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      id.foreach(__v => __obj.updateDynamic("id")(__v.asInstanceOf[js.Any]))
      lastUpdatedAt.foreach(__v => __obj.updateDynamic("lastUpdatedAt")(__v.asInstanceOf[js.Any]))
      logo.foreach(__v => __obj.updateDynamic("logo")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      `type`.foreach(__v => __obj.updateDynamic("type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssessmentFrameworkMetadata]
    }
  }

  /** Represents a share request for a custom framework in Audit Manager.
    */
  @js.native
  trait AssessmentFrameworkShareRequest extends js.Object {
    var comment: js.UndefOr[ShareRequestComment]
    var complianceType: js.UndefOr[ComplianceType]
    var creationTime: js.UndefOr[Timestamp]
    var customControlsCount: js.UndefOr[NullableInteger]
    var destinationAccount: js.UndefOr[AccountId]
    var destinationRegion: js.UndefOr[Region]
    var expirationTime: js.UndefOr[Timestamp]
    var frameworkDescription: js.UndefOr[FrameworkDescription]
    var frameworkId: js.UndefOr[UUID]
    var frameworkName: js.UndefOr[FrameworkName]
    var id: js.UndefOr[UUID]
    var lastUpdated: js.UndefOr[Timestamp]
    var sourceAccount: js.UndefOr[AccountId]
    var standardControlsCount: js.UndefOr[NullableInteger]
    var status: js.UndefOr[ShareRequestStatus]
  }

  object AssessmentFrameworkShareRequest {
    @inline
    def apply(
        comment: js.UndefOr[ShareRequestComment] = js.undefined,
        complianceType: js.UndefOr[ComplianceType] = js.undefined,
        creationTime: js.UndefOr[Timestamp] = js.undefined,
        customControlsCount: js.UndefOr[NullableInteger] = js.undefined,
        destinationAccount: js.UndefOr[AccountId] = js.undefined,
        destinationRegion: js.UndefOr[Region] = js.undefined,
        expirationTime: js.UndefOr[Timestamp] = js.undefined,
        frameworkDescription: js.UndefOr[FrameworkDescription] = js.undefined,
        frameworkId: js.UndefOr[UUID] = js.undefined,
        frameworkName: js.UndefOr[FrameworkName] = js.undefined,
        id: js.UndefOr[UUID] = js.undefined,
        lastUpdated: js.UndefOr[Timestamp] = js.undefined,
        sourceAccount: js.UndefOr[AccountId] = js.undefined,
        standardControlsCount: js.UndefOr[NullableInteger] = js.undefined,
        status: js.UndefOr[ShareRequestStatus] = js.undefined
    ): AssessmentFrameworkShareRequest = {
      val __obj = js.Dynamic.literal()
      comment.foreach(__v => __obj.updateDynamic("comment")(__v.asInstanceOf[js.Any]))
      complianceType.foreach(__v => __obj.updateDynamic("complianceType")(__v.asInstanceOf[js.Any]))
      creationTime.foreach(__v => __obj.updateDynamic("creationTime")(__v.asInstanceOf[js.Any]))
      customControlsCount.foreach(__v => __obj.updateDynamic("customControlsCount")(__v.asInstanceOf[js.Any]))
      destinationAccount.foreach(__v => __obj.updateDynamic("destinationAccount")(__v.asInstanceOf[js.Any]))
      destinationRegion.foreach(__v => __obj.updateDynamic("destinationRegion")(__v.asInstanceOf[js.Any]))
      expirationTime.foreach(__v => __obj.updateDynamic("expirationTime")(__v.asInstanceOf[js.Any]))
      frameworkDescription.foreach(__v => __obj.updateDynamic("frameworkDescription")(__v.asInstanceOf[js.Any]))
      frameworkId.foreach(__v => __obj.updateDynamic("frameworkId")(__v.asInstanceOf[js.Any]))
      frameworkName.foreach(__v => __obj.updateDynamic("frameworkName")(__v.asInstanceOf[js.Any]))
      id.foreach(__v => __obj.updateDynamic("id")(__v.asInstanceOf[js.Any]))
      lastUpdated.foreach(__v => __obj.updateDynamic("lastUpdated")(__v.asInstanceOf[js.Any]))
      sourceAccount.foreach(__v => __obj.updateDynamic("sourceAccount")(__v.asInstanceOf[js.Any]))
      standardControlsCount.foreach(__v => __obj.updateDynamic("standardControlsCount")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssessmentFrameworkShareRequest]
    }
  }

  /** The metadata that's associated with the specified assessment.
    */
  @js.native
  trait AssessmentMetadata extends js.Object {
    var assessmentReportsDestination: js.UndefOr[AssessmentReportsDestination]
    var complianceType: js.UndefOr[ComplianceType]
    var creationTime: js.UndefOr[Timestamp]
    var delegations: js.UndefOr[Delegations]
    var description: js.UndefOr[AssessmentDescription]
    var id: js.UndefOr[UUID]
    var lastUpdated: js.UndefOr[Timestamp]
    var name: js.UndefOr[AssessmentName]
    var roles: js.UndefOr[Roles]
    var scope: js.UndefOr[Scope]
    var status: js.UndefOr[AssessmentStatus]
  }

  object AssessmentMetadata {
    @inline
    def apply(
        assessmentReportsDestination: js.UndefOr[AssessmentReportsDestination] = js.undefined,
        complianceType: js.UndefOr[ComplianceType] = js.undefined,
        creationTime: js.UndefOr[Timestamp] = js.undefined,
        delegations: js.UndefOr[Delegations] = js.undefined,
        description: js.UndefOr[AssessmentDescription] = js.undefined,
        id: js.UndefOr[UUID] = js.undefined,
        lastUpdated: js.UndefOr[Timestamp] = js.undefined,
        name: js.UndefOr[AssessmentName] = js.undefined,
        roles: js.UndefOr[Roles] = js.undefined,
        scope: js.UndefOr[Scope] = js.undefined,
        status: js.UndefOr[AssessmentStatus] = js.undefined
    ): AssessmentMetadata = {
      val __obj = js.Dynamic.literal()
      assessmentReportsDestination.foreach(__v => __obj.updateDynamic("assessmentReportsDestination")(__v.asInstanceOf[js.Any]))
      complianceType.foreach(__v => __obj.updateDynamic("complianceType")(__v.asInstanceOf[js.Any]))
      creationTime.foreach(__v => __obj.updateDynamic("creationTime")(__v.asInstanceOf[js.Any]))
      delegations.foreach(__v => __obj.updateDynamic("delegations")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      id.foreach(__v => __obj.updateDynamic("id")(__v.asInstanceOf[js.Any]))
      lastUpdated.foreach(__v => __obj.updateDynamic("lastUpdated")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      roles.foreach(__v => __obj.updateDynamic("roles")(__v.asInstanceOf[js.Any]))
      scope.foreach(__v => __obj.updateDynamic("scope")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssessmentMetadata]
    }
  }

  /** A metadata object that's associated with an assessment in Audit Manager.
    */
  @js.native
  trait AssessmentMetadataItem extends js.Object {
    var complianceType: js.UndefOr[ComplianceType]
    var creationTime: js.UndefOr[Timestamp]
    var delegations: js.UndefOr[Delegations]
    var id: js.UndefOr[UUID]
    var lastUpdated: js.UndefOr[Timestamp]
    var name: js.UndefOr[AssessmentName]
    var roles: js.UndefOr[Roles]
    var status: js.UndefOr[AssessmentStatus]
  }

  object AssessmentMetadataItem {
    @inline
    def apply(
        complianceType: js.UndefOr[ComplianceType] = js.undefined,
        creationTime: js.UndefOr[Timestamp] = js.undefined,
        delegations: js.UndefOr[Delegations] = js.undefined,
        id: js.UndefOr[UUID] = js.undefined,
        lastUpdated: js.UndefOr[Timestamp] = js.undefined,
        name: js.UndefOr[AssessmentName] = js.undefined,
        roles: js.UndefOr[Roles] = js.undefined,
        status: js.UndefOr[AssessmentStatus] = js.undefined
    ): AssessmentMetadataItem = {
      val __obj = js.Dynamic.literal()
      complianceType.foreach(__v => __obj.updateDynamic("complianceType")(__v.asInstanceOf[js.Any]))
      creationTime.foreach(__v => __obj.updateDynamic("creationTime")(__v.asInstanceOf[js.Any]))
      delegations.foreach(__v => __obj.updateDynamic("delegations")(__v.asInstanceOf[js.Any]))
      id.foreach(__v => __obj.updateDynamic("id")(__v.asInstanceOf[js.Any]))
      lastUpdated.foreach(__v => __obj.updateDynamic("lastUpdated")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      roles.foreach(__v => __obj.updateDynamic("roles")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssessmentMetadataItem]
    }
  }

  /** A finalized document that's generated from an Audit Manager assessment. These reports summarize the relevant evidence that was collected for your audit, and link to the relevant evidence folders. These evidence folders are named and organized according to the controls that are specified in your assessment.
    */
  @js.native
  trait AssessmentReport extends js.Object {
    var assessmentId: js.UndefOr[UUID]
    var assessmentName: js.UndefOr[AssessmentName]
    var author: js.UndefOr[Username]
    var awsAccountId: js.UndefOr[AccountId]
    var creationTime: js.UndefOr[Timestamp]
    var description: js.UndefOr[AssessmentReportDescription]
    var id: js.UndefOr[UUID]
    var name: js.UndefOr[AssessmentReportName]
    var status: js.UndefOr[AssessmentReportStatus]
  }

  object AssessmentReport {
    @inline
    def apply(
        assessmentId: js.UndefOr[UUID] = js.undefined,
        assessmentName: js.UndefOr[AssessmentName] = js.undefined,
        author: js.UndefOr[Username] = js.undefined,
        awsAccountId: js.UndefOr[AccountId] = js.undefined,
        creationTime: js.UndefOr[Timestamp] = js.undefined,
        description: js.UndefOr[AssessmentReportDescription] = js.undefined,
        id: js.UndefOr[UUID] = js.undefined,
        name: js.UndefOr[AssessmentReportName] = js.undefined,
        status: js.UndefOr[AssessmentReportStatus] = js.undefined
    ): AssessmentReport = {
      val __obj = js.Dynamic.literal()
      assessmentId.foreach(__v => __obj.updateDynamic("assessmentId")(__v.asInstanceOf[js.Any]))
      assessmentName.foreach(__v => __obj.updateDynamic("assessmentName")(__v.asInstanceOf[js.Any]))
      author.foreach(__v => __obj.updateDynamic("author")(__v.asInstanceOf[js.Any]))
      awsAccountId.foreach(__v => __obj.updateDynamic("awsAccountId")(__v.asInstanceOf[js.Any]))
      creationTime.foreach(__v => __obj.updateDynamic("creationTime")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      id.foreach(__v => __obj.updateDynamic("id")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssessmentReport]
    }
  }

  /** An error entity for the <code>AssessmentReportEvidence</code> API. This is used to provide more meaningful errors than a simple string message.
    */
  @js.native
  trait AssessmentReportEvidenceError extends js.Object {
    var errorCode: js.UndefOr[ErrorCode]
    var errorMessage: js.UndefOr[ErrorMessage]
    var evidenceId: js.UndefOr[UUID]
  }

  object AssessmentReportEvidenceError {
    @inline
    def apply(
        errorCode: js.UndefOr[ErrorCode] = js.undefined,
        errorMessage: js.UndefOr[ErrorMessage] = js.undefined,
        evidenceId: js.UndefOr[UUID] = js.undefined
    ): AssessmentReportEvidenceError = {
      val __obj = js.Dynamic.literal()
      errorCode.foreach(__v => __obj.updateDynamic("errorCode")(__v.asInstanceOf[js.Any]))
      errorMessage.foreach(__v => __obj.updateDynamic("errorMessage")(__v.asInstanceOf[js.Any]))
      evidenceId.foreach(__v => __obj.updateDynamic("evidenceId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssessmentReportEvidenceError]
    }
  }

  /** The metadata objects that are associated with the specified assessment report.
    */
  @js.native
  trait AssessmentReportMetadata extends js.Object {
    var assessmentId: js.UndefOr[UUID]
    var assessmentName: js.UndefOr[AssessmentName]
    var author: js.UndefOr[Username]
    var creationTime: js.UndefOr[Timestamp]
    var description: js.UndefOr[AssessmentReportDescription]
    var id: js.UndefOr[UUID]
    var name: js.UndefOr[AssessmentReportName]
    var status: js.UndefOr[AssessmentReportStatus]
  }

  object AssessmentReportMetadata {
    @inline
    def apply(
        assessmentId: js.UndefOr[UUID] = js.undefined,
        assessmentName: js.UndefOr[AssessmentName] = js.undefined,
        author: js.UndefOr[Username] = js.undefined,
        creationTime: js.UndefOr[Timestamp] = js.undefined,
        description: js.UndefOr[AssessmentReportDescription] = js.undefined,
        id: js.UndefOr[UUID] = js.undefined,
        name: js.UndefOr[AssessmentReportName] = js.undefined,
        status: js.UndefOr[AssessmentReportStatus] = js.undefined
    ): AssessmentReportMetadata = {
      val __obj = js.Dynamic.literal()
      assessmentId.foreach(__v => __obj.updateDynamic("assessmentId")(__v.asInstanceOf[js.Any]))
      assessmentName.foreach(__v => __obj.updateDynamic("assessmentName")(__v.asInstanceOf[js.Any]))
      author.foreach(__v => __obj.updateDynamic("author")(__v.asInstanceOf[js.Any]))
      creationTime.foreach(__v => __obj.updateDynamic("creationTime")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      id.foreach(__v => __obj.updateDynamic("id")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssessmentReportMetadata]
    }
  }

  /** The location where Audit Manager saves assessment reports for the given assessment.
    */
  @js.native
  trait AssessmentReportsDestination extends js.Object {
    var destination: js.UndefOr[S3Url]
    var destinationType: js.UndefOr[AssessmentReportDestinationType]
  }

  object AssessmentReportsDestination {
    @inline
    def apply(
        destination: js.UndefOr[S3Url] = js.undefined,
        destinationType: js.UndefOr[AssessmentReportDestinationType] = js.undefined
    ): AssessmentReportsDestination = {
      val __obj = js.Dynamic.literal()
      destination.foreach(__v => __obj.updateDynamic("destination")(__v.asInstanceOf[js.Any]))
      destinationType.foreach(__v => __obj.updateDynamic("destinationType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssessmentReportsDestination]
    }
  }

  @js.native
  trait AssociateAssessmentReportEvidenceFolderRequest extends js.Object {
    var assessmentId: UUID
    var evidenceFolderId: UUID
  }

  object AssociateAssessmentReportEvidenceFolderRequest {
    @inline
    def apply(
        assessmentId: UUID,
        evidenceFolderId: UUID
    ): AssociateAssessmentReportEvidenceFolderRequest = {
      val __obj = js.Dynamic.literal(
        "assessmentId" -> assessmentId.asInstanceOf[js.Any],
        "evidenceFolderId" -> evidenceFolderId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AssociateAssessmentReportEvidenceFolderRequest]
    }
  }

  @js.native
  trait AssociateAssessmentReportEvidenceFolderResponse extends js.Object

  object AssociateAssessmentReportEvidenceFolderResponse {
    @inline
    def apply(): AssociateAssessmentReportEvidenceFolderResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AssociateAssessmentReportEvidenceFolderResponse]
    }
  }

  @js.native
  trait BatchAssociateAssessmentReportEvidenceRequest extends js.Object {
    var assessmentId: UUID
    var evidenceFolderId: UUID
    var evidenceIds: EvidenceIds
  }

  object BatchAssociateAssessmentReportEvidenceRequest {
    @inline
    def apply(
        assessmentId: UUID,
        evidenceFolderId: UUID,
        evidenceIds: EvidenceIds
    ): BatchAssociateAssessmentReportEvidenceRequest = {
      val __obj = js.Dynamic.literal(
        "assessmentId" -> assessmentId.asInstanceOf[js.Any],
        "evidenceFolderId" -> evidenceFolderId.asInstanceOf[js.Any],
        "evidenceIds" -> evidenceIds.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[BatchAssociateAssessmentReportEvidenceRequest]
    }
  }

  @js.native
  trait BatchAssociateAssessmentReportEvidenceResponse extends js.Object {
    var errors: js.UndefOr[AssessmentReportEvidenceErrors]
    var evidenceIds: js.UndefOr[EvidenceIds]
  }

  object BatchAssociateAssessmentReportEvidenceResponse {
    @inline
    def apply(
        errors: js.UndefOr[AssessmentReportEvidenceErrors] = js.undefined,
        evidenceIds: js.UndefOr[EvidenceIds] = js.undefined
    ): BatchAssociateAssessmentReportEvidenceResponse = {
      val __obj = js.Dynamic.literal()
      errors.foreach(__v => __obj.updateDynamic("errors")(__v.asInstanceOf[js.Any]))
      evidenceIds.foreach(__v => __obj.updateDynamic("evidenceIds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchAssociateAssessmentReportEvidenceResponse]
    }
  }

  /** An error entity for the <code>BatchCreateDelegationByAssessment</code> API. This is used to provide more meaningful errors than a simple string message.
    */
  @js.native
  trait BatchCreateDelegationByAssessmentError extends js.Object {
    var createDelegationRequest: js.UndefOr[CreateDelegationRequest]
    var errorCode: js.UndefOr[ErrorCode]
    var errorMessage: js.UndefOr[ErrorMessage]
  }

  object BatchCreateDelegationByAssessmentError {
    @inline
    def apply(
        createDelegationRequest: js.UndefOr[CreateDelegationRequest] = js.undefined,
        errorCode: js.UndefOr[ErrorCode] = js.undefined,
        errorMessage: js.UndefOr[ErrorMessage] = js.undefined
    ): BatchCreateDelegationByAssessmentError = {
      val __obj = js.Dynamic.literal()
      createDelegationRequest.foreach(__v => __obj.updateDynamic("createDelegationRequest")(__v.asInstanceOf[js.Any]))
      errorCode.foreach(__v => __obj.updateDynamic("errorCode")(__v.asInstanceOf[js.Any]))
      errorMessage.foreach(__v => __obj.updateDynamic("errorMessage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchCreateDelegationByAssessmentError]
    }
  }

  @js.native
  trait BatchCreateDelegationByAssessmentRequest extends js.Object {
    var assessmentId: UUID
    var createDelegationRequests: CreateDelegationRequests
  }

  object BatchCreateDelegationByAssessmentRequest {
    @inline
    def apply(
        assessmentId: UUID,
        createDelegationRequests: CreateDelegationRequests
    ): BatchCreateDelegationByAssessmentRequest = {
      val __obj = js.Dynamic.literal(
        "assessmentId" -> assessmentId.asInstanceOf[js.Any],
        "createDelegationRequests" -> createDelegationRequests.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[BatchCreateDelegationByAssessmentRequest]
    }
  }

  @js.native
  trait BatchCreateDelegationByAssessmentResponse extends js.Object {
    var delegations: js.UndefOr[Delegations]
    var errors: js.UndefOr[BatchCreateDelegationByAssessmentErrors]
  }

  object BatchCreateDelegationByAssessmentResponse {
    @inline
    def apply(
        delegations: js.UndefOr[Delegations] = js.undefined,
        errors: js.UndefOr[BatchCreateDelegationByAssessmentErrors] = js.undefined
    ): BatchCreateDelegationByAssessmentResponse = {
      val __obj = js.Dynamic.literal()
      delegations.foreach(__v => __obj.updateDynamic("delegations")(__v.asInstanceOf[js.Any]))
      errors.foreach(__v => __obj.updateDynamic("errors")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchCreateDelegationByAssessmentResponse]
    }
  }

  /** An error entity for the <code>BatchDeleteDelegationByAssessment</code> API. This is used to provide more meaningful errors than a simple string message.
    */
  @js.native
  trait BatchDeleteDelegationByAssessmentError extends js.Object {
    var delegationId: js.UndefOr[UUID]
    var errorCode: js.UndefOr[ErrorCode]
    var errorMessage: js.UndefOr[ErrorMessage]
  }

  object BatchDeleteDelegationByAssessmentError {
    @inline
    def apply(
        delegationId: js.UndefOr[UUID] = js.undefined,
        errorCode: js.UndefOr[ErrorCode] = js.undefined,
        errorMessage: js.UndefOr[ErrorMessage] = js.undefined
    ): BatchDeleteDelegationByAssessmentError = {
      val __obj = js.Dynamic.literal()
      delegationId.foreach(__v => __obj.updateDynamic("delegationId")(__v.asInstanceOf[js.Any]))
      errorCode.foreach(__v => __obj.updateDynamic("errorCode")(__v.asInstanceOf[js.Any]))
      errorMessage.foreach(__v => __obj.updateDynamic("errorMessage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchDeleteDelegationByAssessmentError]
    }
  }

  @js.native
  trait BatchDeleteDelegationByAssessmentRequest extends js.Object {
    var assessmentId: UUID
    var delegationIds: DelegationIds
  }

  object BatchDeleteDelegationByAssessmentRequest {
    @inline
    def apply(
        assessmentId: UUID,
        delegationIds: DelegationIds
    ): BatchDeleteDelegationByAssessmentRequest = {
      val __obj = js.Dynamic.literal(
        "assessmentId" -> assessmentId.asInstanceOf[js.Any],
        "delegationIds" -> delegationIds.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[BatchDeleteDelegationByAssessmentRequest]
    }
  }

  @js.native
  trait BatchDeleteDelegationByAssessmentResponse extends js.Object {
    var errors: js.UndefOr[BatchDeleteDelegationByAssessmentErrors]
  }

  object BatchDeleteDelegationByAssessmentResponse {
    @inline
    def apply(
        errors: js.UndefOr[BatchDeleteDelegationByAssessmentErrors] = js.undefined
    ): BatchDeleteDelegationByAssessmentResponse = {
      val __obj = js.Dynamic.literal()
      errors.foreach(__v => __obj.updateDynamic("errors")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchDeleteDelegationByAssessmentResponse]
    }
  }

  @js.native
  trait BatchDisassociateAssessmentReportEvidenceRequest extends js.Object {
    var assessmentId: UUID
    var evidenceFolderId: UUID
    var evidenceIds: EvidenceIds
  }

  object BatchDisassociateAssessmentReportEvidenceRequest {
    @inline
    def apply(
        assessmentId: UUID,
        evidenceFolderId: UUID,
        evidenceIds: EvidenceIds
    ): BatchDisassociateAssessmentReportEvidenceRequest = {
      val __obj = js.Dynamic.literal(
        "assessmentId" -> assessmentId.asInstanceOf[js.Any],
        "evidenceFolderId" -> evidenceFolderId.asInstanceOf[js.Any],
        "evidenceIds" -> evidenceIds.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[BatchDisassociateAssessmentReportEvidenceRequest]
    }
  }

  @js.native
  trait BatchDisassociateAssessmentReportEvidenceResponse extends js.Object {
    var errors: js.UndefOr[AssessmentReportEvidenceErrors]
    var evidenceIds: js.UndefOr[EvidenceIds]
  }

  object BatchDisassociateAssessmentReportEvidenceResponse {
    @inline
    def apply(
        errors: js.UndefOr[AssessmentReportEvidenceErrors] = js.undefined,
        evidenceIds: js.UndefOr[EvidenceIds] = js.undefined
    ): BatchDisassociateAssessmentReportEvidenceResponse = {
      val __obj = js.Dynamic.literal()
      errors.foreach(__v => __obj.updateDynamic("errors")(__v.asInstanceOf[js.Any]))
      evidenceIds.foreach(__v => __obj.updateDynamic("evidenceIds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchDisassociateAssessmentReportEvidenceResponse]
    }
  }

  /** An error entity for the <code>BatchImportEvidenceToAssessmentControl</code> API. This is used to provide more meaningful errors than a simple string message.
    */
  @js.native
  trait BatchImportEvidenceToAssessmentControlError extends js.Object {
    var errorCode: js.UndefOr[ErrorCode]
    var errorMessage: js.UndefOr[ErrorMessage]
    var manualEvidence: js.UndefOr[ManualEvidence]
  }

  object BatchImportEvidenceToAssessmentControlError {
    @inline
    def apply(
        errorCode: js.UndefOr[ErrorCode] = js.undefined,
        errorMessage: js.UndefOr[ErrorMessage] = js.undefined,
        manualEvidence: js.UndefOr[ManualEvidence] = js.undefined
    ): BatchImportEvidenceToAssessmentControlError = {
      val __obj = js.Dynamic.literal()
      errorCode.foreach(__v => __obj.updateDynamic("errorCode")(__v.asInstanceOf[js.Any]))
      errorMessage.foreach(__v => __obj.updateDynamic("errorMessage")(__v.asInstanceOf[js.Any]))
      manualEvidence.foreach(__v => __obj.updateDynamic("manualEvidence")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchImportEvidenceToAssessmentControlError]
    }
  }

  @js.native
  trait BatchImportEvidenceToAssessmentControlRequest extends js.Object {
    var assessmentId: UUID
    var controlId: UUID
    var controlSetId: ControlSetId
    var manualEvidence: ManualEvidenceList
  }

  object BatchImportEvidenceToAssessmentControlRequest {
    @inline
    def apply(
        assessmentId: UUID,
        controlId: UUID,
        controlSetId: ControlSetId,
        manualEvidence: ManualEvidenceList
    ): BatchImportEvidenceToAssessmentControlRequest = {
      val __obj = js.Dynamic.literal(
        "assessmentId" -> assessmentId.asInstanceOf[js.Any],
        "controlId" -> controlId.asInstanceOf[js.Any],
        "controlSetId" -> controlSetId.asInstanceOf[js.Any],
        "manualEvidence" -> manualEvidence.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[BatchImportEvidenceToAssessmentControlRequest]
    }
  }

  @js.native
  trait BatchImportEvidenceToAssessmentControlResponse extends js.Object {
    var errors: js.UndefOr[BatchImportEvidenceToAssessmentControlErrors]
  }

  object BatchImportEvidenceToAssessmentControlResponse {
    @inline
    def apply(
        errors: js.UndefOr[BatchImportEvidenceToAssessmentControlErrors] = js.undefined
    ): BatchImportEvidenceToAssessmentControlResponse = {
      val __obj = js.Dynamic.literal()
      errors.foreach(__v => __obj.updateDynamic("errors")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchImportEvidenceToAssessmentControlResponse]
    }
  }

  /** The record of a change within Audit Manager. For example, this could be the status change of an assessment or the delegation of a control set.
    */
  @js.native
  trait ChangeLog extends js.Object {
    var action: js.UndefOr[ActionEnum]
    var createdAt: js.UndefOr[Timestamp]
    var createdBy: js.UndefOr[IamArn]
    var objectName: js.UndefOr[NonEmptyString]
    var objectType: js.UndefOr[ObjectTypeEnum]
  }

  object ChangeLog {
    @inline
    def apply(
        action: js.UndefOr[ActionEnum] = js.undefined,
        createdAt: js.UndefOr[Timestamp] = js.undefined,
        createdBy: js.UndefOr[IamArn] = js.undefined,
        objectName: js.UndefOr[NonEmptyString] = js.undefined,
        objectType: js.UndefOr[ObjectTypeEnum] = js.undefined
    ): ChangeLog = {
      val __obj = js.Dynamic.literal()
      action.foreach(__v => __obj.updateDynamic("action")(__v.asInstanceOf[js.Any]))
      createdAt.foreach(__v => __obj.updateDynamic("createdAt")(__v.asInstanceOf[js.Any]))
      createdBy.foreach(__v => __obj.updateDynamic("createdBy")(__v.asInstanceOf[js.Any]))
      objectName.foreach(__v => __obj.updateDynamic("objectName")(__v.asInstanceOf[js.Any]))
      objectType.foreach(__v => __obj.updateDynamic("objectType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ChangeLog]
    }
  }

  /** A control in Audit Manager.
    */
  @js.native
  trait Control extends js.Object {
    var actionPlanInstructions: js.UndefOr[ActionPlanInstructions]
    var actionPlanTitle: js.UndefOr[ActionPlanTitle]
    var arn: js.UndefOr[AuditManagerArn]
    var controlMappingSources: js.UndefOr[ControlMappingSources]
    var controlSources: js.UndefOr[ControlSources]
    var createdAt: js.UndefOr[Timestamp]
    var createdBy: js.UndefOr[CreatedBy]
    var description: js.UndefOr[ControlDescription]
    var id: js.UndefOr[UUID]
    var lastUpdatedAt: js.UndefOr[Timestamp]
    var lastUpdatedBy: js.UndefOr[LastUpdatedBy]
    var name: js.UndefOr[ControlName]
    var tags: js.UndefOr[TagMap]
    var testingInformation: js.UndefOr[TestingInformation]
    var `type`: js.UndefOr[ControlType]
  }

  object Control {
    @inline
    def apply(
        actionPlanInstructions: js.UndefOr[ActionPlanInstructions] = js.undefined,
        actionPlanTitle: js.UndefOr[ActionPlanTitle] = js.undefined,
        arn: js.UndefOr[AuditManagerArn] = js.undefined,
        controlMappingSources: js.UndefOr[ControlMappingSources] = js.undefined,
        controlSources: js.UndefOr[ControlSources] = js.undefined,
        createdAt: js.UndefOr[Timestamp] = js.undefined,
        createdBy: js.UndefOr[CreatedBy] = js.undefined,
        description: js.UndefOr[ControlDescription] = js.undefined,
        id: js.UndefOr[UUID] = js.undefined,
        lastUpdatedAt: js.UndefOr[Timestamp] = js.undefined,
        lastUpdatedBy: js.UndefOr[LastUpdatedBy] = js.undefined,
        name: js.UndefOr[ControlName] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined,
        testingInformation: js.UndefOr[TestingInformation] = js.undefined,
        `type`: js.UndefOr[ControlType] = js.undefined
    ): Control = {
      val __obj = js.Dynamic.literal()
      actionPlanInstructions.foreach(__v => __obj.updateDynamic("actionPlanInstructions")(__v.asInstanceOf[js.Any]))
      actionPlanTitle.foreach(__v => __obj.updateDynamic("actionPlanTitle")(__v.asInstanceOf[js.Any]))
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      controlMappingSources.foreach(__v => __obj.updateDynamic("controlMappingSources")(__v.asInstanceOf[js.Any]))
      controlSources.foreach(__v => __obj.updateDynamic("controlSources")(__v.asInstanceOf[js.Any]))
      createdAt.foreach(__v => __obj.updateDynamic("createdAt")(__v.asInstanceOf[js.Any]))
      createdBy.foreach(__v => __obj.updateDynamic("createdBy")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      id.foreach(__v => __obj.updateDynamic("id")(__v.asInstanceOf[js.Any]))
      lastUpdatedAt.foreach(__v => __obj.updateDynamic("lastUpdatedAt")(__v.asInstanceOf[js.Any]))
      lastUpdatedBy.foreach(__v => __obj.updateDynamic("lastUpdatedBy")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      testingInformation.foreach(__v => __obj.updateDynamic("testingInformation")(__v.asInstanceOf[js.Any]))
      `type`.foreach(__v => __obj.updateDynamic("type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Control]
    }
  }

  /** A comment that's posted by a user on a control. This includes the author's name, the comment text, and a timestamp.
    */
  @js.native
  trait ControlComment extends js.Object {
    var authorName: js.UndefOr[Username]
    var commentBody: js.UndefOr[ControlCommentBody]
    var postedDate: js.UndefOr[Timestamp]
  }

  object ControlComment {
    @inline
    def apply(
        authorName: js.UndefOr[Username] = js.undefined,
        commentBody: js.UndefOr[ControlCommentBody] = js.undefined,
        postedDate: js.UndefOr[Timestamp] = js.undefined
    ): ControlComment = {
      val __obj = js.Dynamic.literal()
      authorName.foreach(__v => __obj.updateDynamic("authorName")(__v.asInstanceOf[js.Any]))
      commentBody.foreach(__v => __obj.updateDynamic("commentBody")(__v.asInstanceOf[js.Any]))
      postedDate.foreach(__v => __obj.updateDynamic("postedDate")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ControlComment]
    }
  }

  /** A summary of the latest analytics data for a specific control domain. Control domain insights are grouped by control domain, and ranked by the highest total count of non-compliant evidence.
    */
  @js.native
  trait ControlDomainInsights extends js.Object {
    var controlsCountByNoncompliantEvidence: js.UndefOr[NullableInteger]
    var evidenceInsights: js.UndefOr[EvidenceInsights]
    var id: js.UndefOr[UUID]
    var lastUpdated: js.UndefOr[Timestamp]
    var name: js.UndefOr[NonEmptyString]
    var totalControlsCount: js.UndefOr[NullableInteger]
  }

  object ControlDomainInsights {
    @inline
    def apply(
        controlsCountByNoncompliantEvidence: js.UndefOr[NullableInteger] = js.undefined,
        evidenceInsights: js.UndefOr[EvidenceInsights] = js.undefined,
        id: js.UndefOr[UUID] = js.undefined,
        lastUpdated: js.UndefOr[Timestamp] = js.undefined,
        name: js.UndefOr[NonEmptyString] = js.undefined,
        totalControlsCount: js.UndefOr[NullableInteger] = js.undefined
    ): ControlDomainInsights = {
      val __obj = js.Dynamic.literal()
      controlsCountByNoncompliantEvidence.foreach(__v => __obj.updateDynamic("controlsCountByNoncompliantEvidence")(__v.asInstanceOf[js.Any]))
      evidenceInsights.foreach(__v => __obj.updateDynamic("evidenceInsights")(__v.asInstanceOf[js.Any]))
      id.foreach(__v => __obj.updateDynamic("id")(__v.asInstanceOf[js.Any]))
      lastUpdated.foreach(__v => __obj.updateDynamic("lastUpdated")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      totalControlsCount.foreach(__v => __obj.updateDynamic("totalControlsCount")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ControlDomainInsights]
    }
  }

  /** A summary of the latest analytics data for a specific control in a specific active assessment. Control insights are grouped by control domain, and ranked by the highest total count of non-compliant evidence.
    */
  @js.native
  trait ControlInsightsMetadataByAssessmentItem extends js.Object {
    var controlSetName: js.UndefOr[NonEmptyString]
    var evidenceInsights: js.UndefOr[EvidenceInsights]
    var id: js.UndefOr[UUID]
    var lastUpdated: js.UndefOr[Timestamp]
    var name: js.UndefOr[NonEmptyString]
  }

  object ControlInsightsMetadataByAssessmentItem {
    @inline
    def apply(
        controlSetName: js.UndefOr[NonEmptyString] = js.undefined,
        evidenceInsights: js.UndefOr[EvidenceInsights] = js.undefined,
        id: js.UndefOr[UUID] = js.undefined,
        lastUpdated: js.UndefOr[Timestamp] = js.undefined,
        name: js.UndefOr[NonEmptyString] = js.undefined
    ): ControlInsightsMetadataByAssessmentItem = {
      val __obj = js.Dynamic.literal()
      controlSetName.foreach(__v => __obj.updateDynamic("controlSetName")(__v.asInstanceOf[js.Any]))
      evidenceInsights.foreach(__v => __obj.updateDynamic("evidenceInsights")(__v.asInstanceOf[js.Any]))
      id.foreach(__v => __obj.updateDynamic("id")(__v.asInstanceOf[js.Any]))
      lastUpdated.foreach(__v => __obj.updateDynamic("lastUpdated")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ControlInsightsMetadataByAssessmentItem]
    }
  }

  /** A summary of the latest analytics data for a specific control. This data reflects the total counts for the specified control across all active assessments. Control insights are grouped by control domain, and ranked by the highest total count of non-compliant evidence.
    */
  @js.native
  trait ControlInsightsMetadataItem extends js.Object {
    var evidenceInsights: js.UndefOr[EvidenceInsights]
    var id: js.UndefOr[UUID]
    var lastUpdated: js.UndefOr[Timestamp]
    var name: js.UndefOr[NonEmptyString]
  }

  object ControlInsightsMetadataItem {
    @inline
    def apply(
        evidenceInsights: js.UndefOr[EvidenceInsights] = js.undefined,
        id: js.UndefOr[UUID] = js.undefined,
        lastUpdated: js.UndefOr[Timestamp] = js.undefined,
        name: js.UndefOr[NonEmptyString] = js.undefined
    ): ControlInsightsMetadataItem = {
      val __obj = js.Dynamic.literal()
      evidenceInsights.foreach(__v => __obj.updateDynamic("evidenceInsights")(__v.asInstanceOf[js.Any]))
      id.foreach(__v => __obj.updateDynamic("id")(__v.asInstanceOf[js.Any]))
      lastUpdated.foreach(__v => __obj.updateDynamic("lastUpdated")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ControlInsightsMetadataItem]
    }
  }

  /** The data source that determines where Audit Manager collects evidence from for the control.
    */
  @js.native
  trait ControlMappingSource extends js.Object {
    var sourceDescription: js.UndefOr[SourceDescription]
    var sourceFrequency: js.UndefOr[SourceFrequency]
    var sourceId: js.UndefOr[UUID]
    var sourceKeyword: js.UndefOr[SourceKeyword]
    var sourceName: js.UndefOr[SourceName]
    var sourceSetUpOption: js.UndefOr[SourceSetUpOption]
    var sourceType: js.UndefOr[SourceType]
    var troubleshootingText: js.UndefOr[TroubleshootingText]
  }

  object ControlMappingSource {
    @inline
    def apply(
        sourceDescription: js.UndefOr[SourceDescription] = js.undefined,
        sourceFrequency: js.UndefOr[SourceFrequency] = js.undefined,
        sourceId: js.UndefOr[UUID] = js.undefined,
        sourceKeyword: js.UndefOr[SourceKeyword] = js.undefined,
        sourceName: js.UndefOr[SourceName] = js.undefined,
        sourceSetUpOption: js.UndefOr[SourceSetUpOption] = js.undefined,
        sourceType: js.UndefOr[SourceType] = js.undefined,
        troubleshootingText: js.UndefOr[TroubleshootingText] = js.undefined
    ): ControlMappingSource = {
      val __obj = js.Dynamic.literal()
      sourceDescription.foreach(__v => __obj.updateDynamic("sourceDescription")(__v.asInstanceOf[js.Any]))
      sourceFrequency.foreach(__v => __obj.updateDynamic("sourceFrequency")(__v.asInstanceOf[js.Any]))
      sourceId.foreach(__v => __obj.updateDynamic("sourceId")(__v.asInstanceOf[js.Any]))
      sourceKeyword.foreach(__v => __obj.updateDynamic("sourceKeyword")(__v.asInstanceOf[js.Any]))
      sourceName.foreach(__v => __obj.updateDynamic("sourceName")(__v.asInstanceOf[js.Any]))
      sourceSetUpOption.foreach(__v => __obj.updateDynamic("sourceSetUpOption")(__v.asInstanceOf[js.Any]))
      sourceType.foreach(__v => __obj.updateDynamic("sourceType")(__v.asInstanceOf[js.Any]))
      troubleshootingText.foreach(__v => __obj.updateDynamic("troubleshootingText")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ControlMappingSource]
    }
  }

  /** The metadata that's associated with the standard control or custom control.
    */
  @js.native
  trait ControlMetadata extends js.Object {
    var arn: js.UndefOr[AuditManagerArn]
    var controlSources: js.UndefOr[ControlSources]
    var createdAt: js.UndefOr[Timestamp]
    var id: js.UndefOr[UUID]
    var lastUpdatedAt: js.UndefOr[Timestamp]
    var name: js.UndefOr[ControlName]
  }

  object ControlMetadata {
    @inline
    def apply(
        arn: js.UndefOr[AuditManagerArn] = js.undefined,
        controlSources: js.UndefOr[ControlSources] = js.undefined,
        createdAt: js.UndefOr[Timestamp] = js.undefined,
        id: js.UndefOr[UUID] = js.undefined,
        lastUpdatedAt: js.UndefOr[Timestamp] = js.undefined,
        name: js.UndefOr[ControlName] = js.undefined
    ): ControlMetadata = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      controlSources.foreach(__v => __obj.updateDynamic("controlSources")(__v.asInstanceOf[js.Any]))
      createdAt.foreach(__v => __obj.updateDynamic("createdAt")(__v.asInstanceOf[js.Any]))
      id.foreach(__v => __obj.updateDynamic("id")(__v.asInstanceOf[js.Any]))
      lastUpdatedAt.foreach(__v => __obj.updateDynamic("lastUpdatedAt")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ControlMetadata]
    }
  }

  /** A set of controls in Audit Manager.
    */
  @js.native
  trait ControlSet extends js.Object {
    var controls: js.UndefOr[Controls]
    var id: js.UndefOr[UUID]
    var name: js.UndefOr[ControlSetName]
  }

  object ControlSet {
    @inline
    def apply(
        controls: js.UndefOr[Controls] = js.undefined,
        id: js.UndefOr[UUID] = js.undefined,
        name: js.UndefOr[ControlSetName] = js.undefined
    ): ControlSet = {
      val __obj = js.Dynamic.literal()
      controls.foreach(__v => __obj.updateDynamic("controls")(__v.asInstanceOf[js.Any]))
      id.foreach(__v => __obj.updateDynamic("id")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ControlSet]
    }
  }

  /** The control entity attributes that uniquely identify an existing control to be added to a framework in Audit Manager.
    */
  @js.native
  trait CreateAssessmentFrameworkControl extends js.Object {
    var id: js.UndefOr[UUID]
  }

  object CreateAssessmentFrameworkControl {
    @inline
    def apply(
        id: js.UndefOr[UUID] = js.undefined
    ): CreateAssessmentFrameworkControl = {
      val __obj = js.Dynamic.literal()
      id.foreach(__v => __obj.updateDynamic("id")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateAssessmentFrameworkControl]
    }
  }

  /** A <code>controlSet</code> entity that represents a collection of controls in Audit Manager. This doesn't contain the control set ID.
    */
  @js.native
  trait CreateAssessmentFrameworkControlSet extends js.Object {
    var name: ControlSetName
    var controls: js.UndefOr[CreateAssessmentFrameworkControls]
  }

  object CreateAssessmentFrameworkControlSet {
    @inline
    def apply(
        name: ControlSetName,
        controls: js.UndefOr[CreateAssessmentFrameworkControls] = js.undefined
    ): CreateAssessmentFrameworkControlSet = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any]
      )

      controls.foreach(__v => __obj.updateDynamic("controls")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateAssessmentFrameworkControlSet]
    }
  }

  @js.native
  trait CreateAssessmentFrameworkRequest extends js.Object {
    var controlSets: CreateAssessmentFrameworkControlSets
    var name: FrameworkName
    var complianceType: js.UndefOr[ComplianceType]
    var description: js.UndefOr[FrameworkDescription]
    var tags: js.UndefOr[TagMap]
  }

  object CreateAssessmentFrameworkRequest {
    @inline
    def apply(
        controlSets: CreateAssessmentFrameworkControlSets,
        name: FrameworkName,
        complianceType: js.UndefOr[ComplianceType] = js.undefined,
        description: js.UndefOr[FrameworkDescription] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined
    ): CreateAssessmentFrameworkRequest = {
      val __obj = js.Dynamic.literal(
        "controlSets" -> controlSets.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any]
      )

      complianceType.foreach(__v => __obj.updateDynamic("complianceType")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateAssessmentFrameworkRequest]
    }
  }

  @js.native
  trait CreateAssessmentFrameworkResponse extends js.Object {
    var framework: js.UndefOr[Framework]
  }

  object CreateAssessmentFrameworkResponse {
    @inline
    def apply(
        framework: js.UndefOr[Framework] = js.undefined
    ): CreateAssessmentFrameworkResponse = {
      val __obj = js.Dynamic.literal()
      framework.foreach(__v => __obj.updateDynamic("framework")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateAssessmentFrameworkResponse]
    }
  }

  @js.native
  trait CreateAssessmentReportRequest extends js.Object {
    var assessmentId: UUID
    var name: AssessmentReportName
    var description: js.UndefOr[AssessmentReportDescription]
  }

  object CreateAssessmentReportRequest {
    @inline
    def apply(
        assessmentId: UUID,
        name: AssessmentReportName,
        description: js.UndefOr[AssessmentReportDescription] = js.undefined
    ): CreateAssessmentReportRequest = {
      val __obj = js.Dynamic.literal(
        "assessmentId" -> assessmentId.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateAssessmentReportRequest]
    }
  }

  @js.native
  trait CreateAssessmentReportResponse extends js.Object {
    var assessmentReport: js.UndefOr[AssessmentReport]
  }

  object CreateAssessmentReportResponse {
    @inline
    def apply(
        assessmentReport: js.UndefOr[AssessmentReport] = js.undefined
    ): CreateAssessmentReportResponse = {
      val __obj = js.Dynamic.literal()
      assessmentReport.foreach(__v => __obj.updateDynamic("assessmentReport")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateAssessmentReportResponse]
    }
  }

  @js.native
  trait CreateAssessmentRequest extends js.Object {
    var assessmentReportsDestination: AssessmentReportsDestination
    var frameworkId: UUID
    var name: AssessmentName
    var roles: Roles
    var scope: Scope
    var description: js.UndefOr[AssessmentDescription]
    var tags: js.UndefOr[TagMap]
  }

  object CreateAssessmentRequest {
    @inline
    def apply(
        assessmentReportsDestination: AssessmentReportsDestination,
        frameworkId: UUID,
        name: AssessmentName,
        roles: Roles,
        scope: Scope,
        description: js.UndefOr[AssessmentDescription] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined
    ): CreateAssessmentRequest = {
      val __obj = js.Dynamic.literal(
        "assessmentReportsDestination" -> assessmentReportsDestination.asInstanceOf[js.Any],
        "frameworkId" -> frameworkId.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any],
        "roles" -> roles.asInstanceOf[js.Any],
        "scope" -> scope.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateAssessmentRequest]
    }
  }

  @js.native
  trait CreateAssessmentResponse extends js.Object {
    var assessment: js.UndefOr[Assessment]
  }

  object CreateAssessmentResponse {
    @inline
    def apply(
        assessment: js.UndefOr[Assessment] = js.undefined
    ): CreateAssessmentResponse = {
      val __obj = js.Dynamic.literal()
      assessment.foreach(__v => __obj.updateDynamic("assessment")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateAssessmentResponse]
    }
  }

  /** The control mapping fields that represent the source for evidence collection, along with related parameters and metadata. This doesn't contain <code>mappingID</code>.
    */
  @js.native
  trait CreateControlMappingSource extends js.Object {
    var sourceDescription: js.UndefOr[SourceDescription]
    var sourceFrequency: js.UndefOr[SourceFrequency]
    var sourceKeyword: js.UndefOr[SourceKeyword]
    var sourceName: js.UndefOr[SourceName]
    var sourceSetUpOption: js.UndefOr[SourceSetUpOption]
    var sourceType: js.UndefOr[SourceType]
    var troubleshootingText: js.UndefOr[TroubleshootingText]
  }

  object CreateControlMappingSource {
    @inline
    def apply(
        sourceDescription: js.UndefOr[SourceDescription] = js.undefined,
        sourceFrequency: js.UndefOr[SourceFrequency] = js.undefined,
        sourceKeyword: js.UndefOr[SourceKeyword] = js.undefined,
        sourceName: js.UndefOr[SourceName] = js.undefined,
        sourceSetUpOption: js.UndefOr[SourceSetUpOption] = js.undefined,
        sourceType: js.UndefOr[SourceType] = js.undefined,
        troubleshootingText: js.UndefOr[TroubleshootingText] = js.undefined
    ): CreateControlMappingSource = {
      val __obj = js.Dynamic.literal()
      sourceDescription.foreach(__v => __obj.updateDynamic("sourceDescription")(__v.asInstanceOf[js.Any]))
      sourceFrequency.foreach(__v => __obj.updateDynamic("sourceFrequency")(__v.asInstanceOf[js.Any]))
      sourceKeyword.foreach(__v => __obj.updateDynamic("sourceKeyword")(__v.asInstanceOf[js.Any]))
      sourceName.foreach(__v => __obj.updateDynamic("sourceName")(__v.asInstanceOf[js.Any]))
      sourceSetUpOption.foreach(__v => __obj.updateDynamic("sourceSetUpOption")(__v.asInstanceOf[js.Any]))
      sourceType.foreach(__v => __obj.updateDynamic("sourceType")(__v.asInstanceOf[js.Any]))
      troubleshootingText.foreach(__v => __obj.updateDynamic("troubleshootingText")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateControlMappingSource]
    }
  }

  @js.native
  trait CreateControlRequest extends js.Object {
    var controlMappingSources: CreateControlMappingSources
    var name: ControlName
    var actionPlanInstructions: js.UndefOr[ActionPlanInstructions]
    var actionPlanTitle: js.UndefOr[ActionPlanTitle]
    var description: js.UndefOr[ControlDescription]
    var tags: js.UndefOr[TagMap]
    var testingInformation: js.UndefOr[TestingInformation]
  }

  object CreateControlRequest {
    @inline
    def apply(
        controlMappingSources: CreateControlMappingSources,
        name: ControlName,
        actionPlanInstructions: js.UndefOr[ActionPlanInstructions] = js.undefined,
        actionPlanTitle: js.UndefOr[ActionPlanTitle] = js.undefined,
        description: js.UndefOr[ControlDescription] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined,
        testingInformation: js.UndefOr[TestingInformation] = js.undefined
    ): CreateControlRequest = {
      val __obj = js.Dynamic.literal(
        "controlMappingSources" -> controlMappingSources.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any]
      )

      actionPlanInstructions.foreach(__v => __obj.updateDynamic("actionPlanInstructions")(__v.asInstanceOf[js.Any]))
      actionPlanTitle.foreach(__v => __obj.updateDynamic("actionPlanTitle")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      testingInformation.foreach(__v => __obj.updateDynamic("testingInformation")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateControlRequest]
    }
  }

  @js.native
  trait CreateControlResponse extends js.Object {
    var control: js.UndefOr[Control]
  }

  object CreateControlResponse {
    @inline
    def apply(
        control: js.UndefOr[Control] = js.undefined
    ): CreateControlResponse = {
      val __obj = js.Dynamic.literal()
      control.foreach(__v => __obj.updateDynamic("control")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateControlResponse]
    }
  }

  /** A collection of attributes that's used to create a delegation for an assessment in Audit Manager.
    */
  @js.native
  trait CreateDelegationRequest extends js.Object {
    var comment: js.UndefOr[DelegationComment]
    var controlSetId: js.UndefOr[ControlSetId]
    var roleArn: js.UndefOr[IamArn]
    var roleType: js.UndefOr[RoleType]
  }

  object CreateDelegationRequest {
    @inline
    def apply(
        comment: js.UndefOr[DelegationComment] = js.undefined,
        controlSetId: js.UndefOr[ControlSetId] = js.undefined,
        roleArn: js.UndefOr[IamArn] = js.undefined,
        roleType: js.UndefOr[RoleType] = js.undefined
    ): CreateDelegationRequest = {
      val __obj = js.Dynamic.literal()
      comment.foreach(__v => __obj.updateDynamic("comment")(__v.asInstanceOf[js.Any]))
      controlSetId.foreach(__v => __obj.updateDynamic("controlSetId")(__v.asInstanceOf[js.Any]))
      roleArn.foreach(__v => __obj.updateDynamic("roleArn")(__v.asInstanceOf[js.Any]))
      roleType.foreach(__v => __obj.updateDynamic("roleType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDelegationRequest]
    }
  }

  /** The assignment of a control set to a delegate for review.
    */
  @js.native
  trait Delegation extends js.Object {
    var assessmentId: js.UndefOr[UUID]
    var assessmentName: js.UndefOr[AssessmentName]
    var comment: js.UndefOr[DelegationComment]
    var controlSetId: js.UndefOr[ControlSetId]
    var createdBy: js.UndefOr[CreatedBy]
    var creationTime: js.UndefOr[Timestamp]
    var id: js.UndefOr[UUID]
    var lastUpdated: js.UndefOr[Timestamp]
    var roleArn: js.UndefOr[IamArn]
    var roleType: js.UndefOr[RoleType]
    var status: js.UndefOr[DelegationStatus]
  }

  object Delegation {
    @inline
    def apply(
        assessmentId: js.UndefOr[UUID] = js.undefined,
        assessmentName: js.UndefOr[AssessmentName] = js.undefined,
        comment: js.UndefOr[DelegationComment] = js.undefined,
        controlSetId: js.UndefOr[ControlSetId] = js.undefined,
        createdBy: js.UndefOr[CreatedBy] = js.undefined,
        creationTime: js.UndefOr[Timestamp] = js.undefined,
        id: js.UndefOr[UUID] = js.undefined,
        lastUpdated: js.UndefOr[Timestamp] = js.undefined,
        roleArn: js.UndefOr[IamArn] = js.undefined,
        roleType: js.UndefOr[RoleType] = js.undefined,
        status: js.UndefOr[DelegationStatus] = js.undefined
    ): Delegation = {
      val __obj = js.Dynamic.literal()
      assessmentId.foreach(__v => __obj.updateDynamic("assessmentId")(__v.asInstanceOf[js.Any]))
      assessmentName.foreach(__v => __obj.updateDynamic("assessmentName")(__v.asInstanceOf[js.Any]))
      comment.foreach(__v => __obj.updateDynamic("comment")(__v.asInstanceOf[js.Any]))
      controlSetId.foreach(__v => __obj.updateDynamic("controlSetId")(__v.asInstanceOf[js.Any]))
      createdBy.foreach(__v => __obj.updateDynamic("createdBy")(__v.asInstanceOf[js.Any]))
      creationTime.foreach(__v => __obj.updateDynamic("creationTime")(__v.asInstanceOf[js.Any]))
      id.foreach(__v => __obj.updateDynamic("id")(__v.asInstanceOf[js.Any]))
      lastUpdated.foreach(__v => __obj.updateDynamic("lastUpdated")(__v.asInstanceOf[js.Any]))
      roleArn.foreach(__v => __obj.updateDynamic("roleArn")(__v.asInstanceOf[js.Any]))
      roleType.foreach(__v => __obj.updateDynamic("roleType")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Delegation]
    }
  }

  /** The metadata that's associated with the delegation.
    */
  @js.native
  trait DelegationMetadata extends js.Object {
    var assessmentId: js.UndefOr[UUID]
    var assessmentName: js.UndefOr[AssessmentName]
    var controlSetName: js.UndefOr[NonEmptyString]
    var creationTime: js.UndefOr[Timestamp]
    var id: js.UndefOr[UUID]
    var roleArn: js.UndefOr[IamArn]
    var status: js.UndefOr[DelegationStatus]
  }

  object DelegationMetadata {
    @inline
    def apply(
        assessmentId: js.UndefOr[UUID] = js.undefined,
        assessmentName: js.UndefOr[AssessmentName] = js.undefined,
        controlSetName: js.UndefOr[NonEmptyString] = js.undefined,
        creationTime: js.UndefOr[Timestamp] = js.undefined,
        id: js.UndefOr[UUID] = js.undefined,
        roleArn: js.UndefOr[IamArn] = js.undefined,
        status: js.UndefOr[DelegationStatus] = js.undefined
    ): DelegationMetadata = {
      val __obj = js.Dynamic.literal()
      assessmentId.foreach(__v => __obj.updateDynamic("assessmentId")(__v.asInstanceOf[js.Any]))
      assessmentName.foreach(__v => __obj.updateDynamic("assessmentName")(__v.asInstanceOf[js.Any]))
      controlSetName.foreach(__v => __obj.updateDynamic("controlSetName")(__v.asInstanceOf[js.Any]))
      creationTime.foreach(__v => __obj.updateDynamic("creationTime")(__v.asInstanceOf[js.Any]))
      id.foreach(__v => __obj.updateDynamic("id")(__v.asInstanceOf[js.Any]))
      roleArn.foreach(__v => __obj.updateDynamic("roleArn")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DelegationMetadata]
    }
  }

  @js.native
  trait DeleteAssessmentFrameworkRequest extends js.Object {
    var frameworkId: UUID
  }

  object DeleteAssessmentFrameworkRequest {
    @inline
    def apply(
        frameworkId: UUID
    ): DeleteAssessmentFrameworkRequest = {
      val __obj = js.Dynamic.literal(
        "frameworkId" -> frameworkId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteAssessmentFrameworkRequest]
    }
  }

  @js.native
  trait DeleteAssessmentFrameworkResponse extends js.Object

  object DeleteAssessmentFrameworkResponse {
    @inline
    def apply(): DeleteAssessmentFrameworkResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteAssessmentFrameworkResponse]
    }
  }

  @js.native
  trait DeleteAssessmentFrameworkShareRequest extends js.Object {
    var requestId: UUID
    var requestType: ShareRequestType
  }

  object DeleteAssessmentFrameworkShareRequest {
    @inline
    def apply(
        requestId: UUID,
        requestType: ShareRequestType
    ): DeleteAssessmentFrameworkShareRequest = {
      val __obj = js.Dynamic.literal(
        "requestId" -> requestId.asInstanceOf[js.Any],
        "requestType" -> requestType.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteAssessmentFrameworkShareRequest]
    }
  }

  @js.native
  trait DeleteAssessmentFrameworkShareResponse extends js.Object

  object DeleteAssessmentFrameworkShareResponse {
    @inline
    def apply(): DeleteAssessmentFrameworkShareResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteAssessmentFrameworkShareResponse]
    }
  }

  @js.native
  trait DeleteAssessmentReportRequest extends js.Object {
    var assessmentId: UUID
    var assessmentReportId: UUID
  }

  object DeleteAssessmentReportRequest {
    @inline
    def apply(
        assessmentId: UUID,
        assessmentReportId: UUID
    ): DeleteAssessmentReportRequest = {
      val __obj = js.Dynamic.literal(
        "assessmentId" -> assessmentId.asInstanceOf[js.Any],
        "assessmentReportId" -> assessmentReportId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteAssessmentReportRequest]
    }
  }

  @js.native
  trait DeleteAssessmentReportResponse extends js.Object

  object DeleteAssessmentReportResponse {
    @inline
    def apply(): DeleteAssessmentReportResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteAssessmentReportResponse]
    }
  }

  @js.native
  trait DeleteAssessmentRequest extends js.Object {
    var assessmentId: UUID
  }

  object DeleteAssessmentRequest {
    @inline
    def apply(
        assessmentId: UUID
    ): DeleteAssessmentRequest = {
      val __obj = js.Dynamic.literal(
        "assessmentId" -> assessmentId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteAssessmentRequest]
    }
  }

  @js.native
  trait DeleteAssessmentResponse extends js.Object

  object DeleteAssessmentResponse {
    @inline
    def apply(): DeleteAssessmentResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteAssessmentResponse]
    }
  }

  @js.native
  trait DeleteControlRequest extends js.Object {
    var controlId: UUID
  }

  object DeleteControlRequest {
    @inline
    def apply(
        controlId: UUID
    ): DeleteControlRequest = {
      val __obj = js.Dynamic.literal(
        "controlId" -> controlId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteControlRequest]
    }
  }

  @js.native
  trait DeleteControlResponse extends js.Object

  object DeleteControlResponse {
    @inline
    def apply(): DeleteControlResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteControlResponse]
    }
  }

  @js.native
  trait DeregisterAccountRequest extends js.Object

  object DeregisterAccountRequest {
    @inline
    def apply(): DeregisterAccountRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeregisterAccountRequest]
    }
  }

  @js.native
  trait DeregisterAccountResponse extends js.Object {
    var status: js.UndefOr[AccountStatus]
  }

  object DeregisterAccountResponse {
    @inline
    def apply(
        status: js.UndefOr[AccountStatus] = js.undefined
    ): DeregisterAccountResponse = {
      val __obj = js.Dynamic.literal()
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeregisterAccountResponse]
    }
  }

  @js.native
  trait DeregisterOrganizationAdminAccountRequest extends js.Object {
    var adminAccountId: js.UndefOr[AccountId]
  }

  object DeregisterOrganizationAdminAccountRequest {
    @inline
    def apply(
        adminAccountId: js.UndefOr[AccountId] = js.undefined
    ): DeregisterOrganizationAdminAccountRequest = {
      val __obj = js.Dynamic.literal()
      adminAccountId.foreach(__v => __obj.updateDynamic("adminAccountId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeregisterOrganizationAdminAccountRequest]
    }
  }

  @js.native
  trait DeregisterOrganizationAdminAccountResponse extends js.Object

  object DeregisterOrganizationAdminAccountResponse {
    @inline
    def apply(): DeregisterOrganizationAdminAccountResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeregisterOrganizationAdminAccountResponse]
    }
  }

  @js.native
  trait DisassociateAssessmentReportEvidenceFolderRequest extends js.Object {
    var assessmentId: UUID
    var evidenceFolderId: UUID
  }

  object DisassociateAssessmentReportEvidenceFolderRequest {
    @inline
    def apply(
        assessmentId: UUID,
        evidenceFolderId: UUID
    ): DisassociateAssessmentReportEvidenceFolderRequest = {
      val __obj = js.Dynamic.literal(
        "assessmentId" -> assessmentId.asInstanceOf[js.Any],
        "evidenceFolderId" -> evidenceFolderId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DisassociateAssessmentReportEvidenceFolderRequest]
    }
  }

  @js.native
  trait DisassociateAssessmentReportEvidenceFolderResponse extends js.Object

  object DisassociateAssessmentReportEvidenceFolderResponse {
    @inline
    def apply(): DisassociateAssessmentReportEvidenceFolderResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DisassociateAssessmentReportEvidenceFolderResponse]
    }
  }

  /** A record that contains the information needed to demonstrate compliance with the requirements specified by a control. Examples of evidence include change activity triggered by a user, or a system configuration snapshot.
    */
  @js.native
  trait Evidence extends js.Object {
    var assessmentReportSelection: js.UndefOr[String]
    var attributes: js.UndefOr[EvidenceAttributes]
    var awsAccountId: js.UndefOr[AccountId]
    var awsOrganization: js.UndefOr[String]
    var complianceCheck: js.UndefOr[String]
    var dataSource: js.UndefOr[String]
    var eventName: js.UndefOr[EventName]
    var eventSource: js.UndefOr[AWSServiceName]
    var evidenceAwsAccountId: js.UndefOr[AccountId]
    var evidenceByType: js.UndefOr[String]
    var evidenceFolderId: js.UndefOr[UUID]
    var iamId: js.UndefOr[IamArn]
    var id: js.UndefOr[UUID]
    var resourcesIncluded: js.UndefOr[Resources]
    var time: js.UndefOr[Timestamp]
  }

  object Evidence {
    @inline
    def apply(
        assessmentReportSelection: js.UndefOr[String] = js.undefined,
        attributes: js.UndefOr[EvidenceAttributes] = js.undefined,
        awsAccountId: js.UndefOr[AccountId] = js.undefined,
        awsOrganization: js.UndefOr[String] = js.undefined,
        complianceCheck: js.UndefOr[String] = js.undefined,
        dataSource: js.UndefOr[String] = js.undefined,
        eventName: js.UndefOr[EventName] = js.undefined,
        eventSource: js.UndefOr[AWSServiceName] = js.undefined,
        evidenceAwsAccountId: js.UndefOr[AccountId] = js.undefined,
        evidenceByType: js.UndefOr[String] = js.undefined,
        evidenceFolderId: js.UndefOr[UUID] = js.undefined,
        iamId: js.UndefOr[IamArn] = js.undefined,
        id: js.UndefOr[UUID] = js.undefined,
        resourcesIncluded: js.UndefOr[Resources] = js.undefined,
        time: js.UndefOr[Timestamp] = js.undefined
    ): Evidence = {
      val __obj = js.Dynamic.literal()
      assessmentReportSelection.foreach(__v => __obj.updateDynamic("assessmentReportSelection")(__v.asInstanceOf[js.Any]))
      attributes.foreach(__v => __obj.updateDynamic("attributes")(__v.asInstanceOf[js.Any]))
      awsAccountId.foreach(__v => __obj.updateDynamic("awsAccountId")(__v.asInstanceOf[js.Any]))
      awsOrganization.foreach(__v => __obj.updateDynamic("awsOrganization")(__v.asInstanceOf[js.Any]))
      complianceCheck.foreach(__v => __obj.updateDynamic("complianceCheck")(__v.asInstanceOf[js.Any]))
      dataSource.foreach(__v => __obj.updateDynamic("dataSource")(__v.asInstanceOf[js.Any]))
      eventName.foreach(__v => __obj.updateDynamic("eventName")(__v.asInstanceOf[js.Any]))
      eventSource.foreach(__v => __obj.updateDynamic("eventSource")(__v.asInstanceOf[js.Any]))
      evidenceAwsAccountId.foreach(__v => __obj.updateDynamic("evidenceAwsAccountId")(__v.asInstanceOf[js.Any]))
      evidenceByType.foreach(__v => __obj.updateDynamic("evidenceByType")(__v.asInstanceOf[js.Any]))
      evidenceFolderId.foreach(__v => __obj.updateDynamic("evidenceFolderId")(__v.asInstanceOf[js.Any]))
      iamId.foreach(__v => __obj.updateDynamic("iamId")(__v.asInstanceOf[js.Any]))
      id.foreach(__v => __obj.updateDynamic("id")(__v.asInstanceOf[js.Any]))
      resourcesIncluded.foreach(__v => __obj.updateDynamic("resourcesIncluded")(__v.asInstanceOf[js.Any]))
      time.foreach(__v => __obj.updateDynamic("time")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Evidence]
    }
  }

  /** A breakdown of the latest compliance check status for the evidence in your Audit Manager assessments.
    */
  @js.native
  trait EvidenceInsights extends js.Object {
    var compliantEvidenceCount: js.UndefOr[NullableInteger]
    var inconclusiveEvidenceCount: js.UndefOr[NullableInteger]
    var noncompliantEvidenceCount: js.UndefOr[NullableInteger]
  }

  object EvidenceInsights {
    @inline
    def apply(
        compliantEvidenceCount: js.UndefOr[NullableInteger] = js.undefined,
        inconclusiveEvidenceCount: js.UndefOr[NullableInteger] = js.undefined,
        noncompliantEvidenceCount: js.UndefOr[NullableInteger] = js.undefined
    ): EvidenceInsights = {
      val __obj = js.Dynamic.literal()
      compliantEvidenceCount.foreach(__v => __obj.updateDynamic("compliantEvidenceCount")(__v.asInstanceOf[js.Any]))
      inconclusiveEvidenceCount.foreach(__v => __obj.updateDynamic("inconclusiveEvidenceCount")(__v.asInstanceOf[js.Any]))
      noncompliantEvidenceCount.foreach(__v => __obj.updateDynamic("noncompliantEvidenceCount")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EvidenceInsights]
    }
  }

  /** The file that's used to structure and automate Audit Manager assessments for a given compliance standard.
    */
  @js.native
  trait Framework extends js.Object {
    var arn: js.UndefOr[AuditManagerArn]
    var complianceType: js.UndefOr[ComplianceType]
    var controlSets: js.UndefOr[ControlSets]
    var controlSources: js.UndefOr[ControlSources]
    var createdAt: js.UndefOr[Timestamp]
    var createdBy: js.UndefOr[CreatedBy]
    var description: js.UndefOr[FrameworkDescription]
    var id: js.UndefOr[UUID]
    var lastUpdatedAt: js.UndefOr[Timestamp]
    var lastUpdatedBy: js.UndefOr[LastUpdatedBy]
    var logo: js.UndefOr[Filename]
    var name: js.UndefOr[FrameworkName]
    var tags: js.UndefOr[TagMap]
    var `type`: js.UndefOr[FrameworkType]
  }

  object Framework {
    @inline
    def apply(
        arn: js.UndefOr[AuditManagerArn] = js.undefined,
        complianceType: js.UndefOr[ComplianceType] = js.undefined,
        controlSets: js.UndefOr[ControlSets] = js.undefined,
        controlSources: js.UndefOr[ControlSources] = js.undefined,
        createdAt: js.UndefOr[Timestamp] = js.undefined,
        createdBy: js.UndefOr[CreatedBy] = js.undefined,
        description: js.UndefOr[FrameworkDescription] = js.undefined,
        id: js.UndefOr[UUID] = js.undefined,
        lastUpdatedAt: js.UndefOr[Timestamp] = js.undefined,
        lastUpdatedBy: js.UndefOr[LastUpdatedBy] = js.undefined,
        logo: js.UndefOr[Filename] = js.undefined,
        name: js.UndefOr[FrameworkName] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined,
        `type`: js.UndefOr[FrameworkType] = js.undefined
    ): Framework = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      complianceType.foreach(__v => __obj.updateDynamic("complianceType")(__v.asInstanceOf[js.Any]))
      controlSets.foreach(__v => __obj.updateDynamic("controlSets")(__v.asInstanceOf[js.Any]))
      controlSources.foreach(__v => __obj.updateDynamic("controlSources")(__v.asInstanceOf[js.Any]))
      createdAt.foreach(__v => __obj.updateDynamic("createdAt")(__v.asInstanceOf[js.Any]))
      createdBy.foreach(__v => __obj.updateDynamic("createdBy")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      id.foreach(__v => __obj.updateDynamic("id")(__v.asInstanceOf[js.Any]))
      lastUpdatedAt.foreach(__v => __obj.updateDynamic("lastUpdatedAt")(__v.asInstanceOf[js.Any]))
      lastUpdatedBy.foreach(__v => __obj.updateDynamic("lastUpdatedBy")(__v.asInstanceOf[js.Any]))
      logo.foreach(__v => __obj.updateDynamic("logo")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      `type`.foreach(__v => __obj.updateDynamic("type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Framework]
    }
  }

  /** The metadata of a framework, such as the name, ID, or description.
    */
  @js.native
  trait FrameworkMetadata extends js.Object {
    var complianceType: js.UndefOr[ComplianceType]
    var description: js.UndefOr[AssessmentFrameworkDescription]
    var logo: js.UndefOr[Filename]
    var name: js.UndefOr[AssessmentName]
  }

  object FrameworkMetadata {
    @inline
    def apply(
        complianceType: js.UndefOr[ComplianceType] = js.undefined,
        description: js.UndefOr[AssessmentFrameworkDescription] = js.undefined,
        logo: js.UndefOr[Filename] = js.undefined,
        name: js.UndefOr[AssessmentName] = js.undefined
    ): FrameworkMetadata = {
      val __obj = js.Dynamic.literal()
      complianceType.foreach(__v => __obj.updateDynamic("complianceType")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      logo.foreach(__v => __obj.updateDynamic("logo")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FrameworkMetadata]
    }
  }

  @js.native
  trait GetAccountStatusRequest extends js.Object

  object GetAccountStatusRequest {
    @inline
    def apply(): GetAccountStatusRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetAccountStatusRequest]
    }
  }

  @js.native
  trait GetAccountStatusResponse extends js.Object {
    var status: js.UndefOr[AccountStatus]
  }

  object GetAccountStatusResponse {
    @inline
    def apply(
        status: js.UndefOr[AccountStatus] = js.undefined
    ): GetAccountStatusResponse = {
      val __obj = js.Dynamic.literal()
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetAccountStatusResponse]
    }
  }

  @js.native
  trait GetAssessmentFrameworkRequest extends js.Object {
    var frameworkId: UUID
  }

  object GetAssessmentFrameworkRequest {
    @inline
    def apply(
        frameworkId: UUID
    ): GetAssessmentFrameworkRequest = {
      val __obj = js.Dynamic.literal(
        "frameworkId" -> frameworkId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetAssessmentFrameworkRequest]
    }
  }

  @js.native
  trait GetAssessmentFrameworkResponse extends js.Object {
    var framework: js.UndefOr[Framework]
  }

  object GetAssessmentFrameworkResponse {
    @inline
    def apply(
        framework: js.UndefOr[Framework] = js.undefined
    ): GetAssessmentFrameworkResponse = {
      val __obj = js.Dynamic.literal()
      framework.foreach(__v => __obj.updateDynamic("framework")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetAssessmentFrameworkResponse]
    }
  }

  @js.native
  trait GetAssessmentReportUrlRequest extends js.Object {
    var assessmentId: UUID
    var assessmentReportId: UUID
  }

  object GetAssessmentReportUrlRequest {
    @inline
    def apply(
        assessmentId: UUID,
        assessmentReportId: UUID
    ): GetAssessmentReportUrlRequest = {
      val __obj = js.Dynamic.literal(
        "assessmentId" -> assessmentId.asInstanceOf[js.Any],
        "assessmentReportId" -> assessmentReportId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetAssessmentReportUrlRequest]
    }
  }

  @js.native
  trait GetAssessmentReportUrlResponse extends js.Object {
    var preSignedUrl: js.UndefOr[URL]
  }

  object GetAssessmentReportUrlResponse {
    @inline
    def apply(
        preSignedUrl: js.UndefOr[URL] = js.undefined
    ): GetAssessmentReportUrlResponse = {
      val __obj = js.Dynamic.literal()
      preSignedUrl.foreach(__v => __obj.updateDynamic("preSignedUrl")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetAssessmentReportUrlResponse]
    }
  }

  @js.native
  trait GetAssessmentRequest extends js.Object {
    var assessmentId: UUID
  }

  object GetAssessmentRequest {
    @inline
    def apply(
        assessmentId: UUID
    ): GetAssessmentRequest = {
      val __obj = js.Dynamic.literal(
        "assessmentId" -> assessmentId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetAssessmentRequest]
    }
  }

  @js.native
  trait GetAssessmentResponse extends js.Object {
    var assessment: js.UndefOr[Assessment]
    var userRole: js.UndefOr[Role]
  }

  object GetAssessmentResponse {
    @inline
    def apply(
        assessment: js.UndefOr[Assessment] = js.undefined,
        userRole: js.UndefOr[Role] = js.undefined
    ): GetAssessmentResponse = {
      val __obj = js.Dynamic.literal()
      assessment.foreach(__v => __obj.updateDynamic("assessment")(__v.asInstanceOf[js.Any]))
      userRole.foreach(__v => __obj.updateDynamic("userRole")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetAssessmentResponse]
    }
  }

  @js.native
  trait GetChangeLogsRequest extends js.Object {
    var assessmentId: UUID
    var controlId: js.UndefOr[UUID]
    var controlSetId: js.UndefOr[ControlSetId]
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[Token]
  }

  object GetChangeLogsRequest {
    @inline
    def apply(
        assessmentId: UUID,
        controlId: js.UndefOr[UUID] = js.undefined,
        controlSetId: js.UndefOr[ControlSetId] = js.undefined,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[Token] = js.undefined
    ): GetChangeLogsRequest = {
      val __obj = js.Dynamic.literal(
        "assessmentId" -> assessmentId.asInstanceOf[js.Any]
      )

      controlId.foreach(__v => __obj.updateDynamic("controlId")(__v.asInstanceOf[js.Any]))
      controlSetId.foreach(__v => __obj.updateDynamic("controlSetId")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetChangeLogsRequest]
    }
  }

  @js.native
  trait GetChangeLogsResponse extends js.Object {
    var changeLogs: js.UndefOr[ChangeLogs]
    var nextToken: js.UndefOr[Token]
  }

  object GetChangeLogsResponse {
    @inline
    def apply(
        changeLogs: js.UndefOr[ChangeLogs] = js.undefined,
        nextToken: js.UndefOr[Token] = js.undefined
    ): GetChangeLogsResponse = {
      val __obj = js.Dynamic.literal()
      changeLogs.foreach(__v => __obj.updateDynamic("changeLogs")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetChangeLogsResponse]
    }
  }

  @js.native
  trait GetControlRequest extends js.Object {
    var controlId: UUID
  }

  object GetControlRequest {
    @inline
    def apply(
        controlId: UUID
    ): GetControlRequest = {
      val __obj = js.Dynamic.literal(
        "controlId" -> controlId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetControlRequest]
    }
  }

  @js.native
  trait GetControlResponse extends js.Object {
    var control: js.UndefOr[Control]
  }

  object GetControlResponse {
    @inline
    def apply(
        control: js.UndefOr[Control] = js.undefined
    ): GetControlResponse = {
      val __obj = js.Dynamic.literal()
      control.foreach(__v => __obj.updateDynamic("control")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetControlResponse]
    }
  }

  @js.native
  trait GetDelegationsRequest extends js.Object {
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[Token]
  }

  object GetDelegationsRequest {
    @inline
    def apply(
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[Token] = js.undefined
    ): GetDelegationsRequest = {
      val __obj = js.Dynamic.literal()
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDelegationsRequest]
    }
  }

  @js.native
  trait GetDelegationsResponse extends js.Object {
    var delegations: js.UndefOr[DelegationMetadataList]
    var nextToken: js.UndefOr[Token]
  }

  object GetDelegationsResponse {
    @inline
    def apply(
        delegations: js.UndefOr[DelegationMetadataList] = js.undefined,
        nextToken: js.UndefOr[Token] = js.undefined
    ): GetDelegationsResponse = {
      val __obj = js.Dynamic.literal()
      delegations.foreach(__v => __obj.updateDynamic("delegations")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDelegationsResponse]
    }
  }

  @js.native
  trait GetEvidenceByEvidenceFolderRequest extends js.Object {
    var assessmentId: UUID
    var controlSetId: ControlSetId
    var evidenceFolderId: UUID
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[Token]
  }

  object GetEvidenceByEvidenceFolderRequest {
    @inline
    def apply(
        assessmentId: UUID,
        controlSetId: ControlSetId,
        evidenceFolderId: UUID,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[Token] = js.undefined
    ): GetEvidenceByEvidenceFolderRequest = {
      val __obj = js.Dynamic.literal(
        "assessmentId" -> assessmentId.asInstanceOf[js.Any],
        "controlSetId" -> controlSetId.asInstanceOf[js.Any],
        "evidenceFolderId" -> evidenceFolderId.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetEvidenceByEvidenceFolderRequest]
    }
  }

  @js.native
  trait GetEvidenceByEvidenceFolderResponse extends js.Object {
    var evidence: js.UndefOr[EvidenceList]
    var nextToken: js.UndefOr[Token]
  }

  object GetEvidenceByEvidenceFolderResponse {
    @inline
    def apply(
        evidence: js.UndefOr[EvidenceList] = js.undefined,
        nextToken: js.UndefOr[Token] = js.undefined
    ): GetEvidenceByEvidenceFolderResponse = {
      val __obj = js.Dynamic.literal()
      evidence.foreach(__v => __obj.updateDynamic("evidence")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetEvidenceByEvidenceFolderResponse]
    }
  }

  @js.native
  trait GetEvidenceFolderRequest extends js.Object {
    var assessmentId: UUID
    var controlSetId: ControlSetId
    var evidenceFolderId: UUID
  }

  object GetEvidenceFolderRequest {
    @inline
    def apply(
        assessmentId: UUID,
        controlSetId: ControlSetId,
        evidenceFolderId: UUID
    ): GetEvidenceFolderRequest = {
      val __obj = js.Dynamic.literal(
        "assessmentId" -> assessmentId.asInstanceOf[js.Any],
        "controlSetId" -> controlSetId.asInstanceOf[js.Any],
        "evidenceFolderId" -> evidenceFolderId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetEvidenceFolderRequest]
    }
  }

  @js.native
  trait GetEvidenceFolderResponse extends js.Object {
    var evidenceFolder: js.UndefOr[AssessmentEvidenceFolder]
  }

  object GetEvidenceFolderResponse {
    @inline
    def apply(
        evidenceFolder: js.UndefOr[AssessmentEvidenceFolder] = js.undefined
    ): GetEvidenceFolderResponse = {
      val __obj = js.Dynamic.literal()
      evidenceFolder.foreach(__v => __obj.updateDynamic("evidenceFolder")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetEvidenceFolderResponse]
    }
  }

  @js.native
  trait GetEvidenceFoldersByAssessmentControlRequest extends js.Object {
    var assessmentId: UUID
    var controlId: UUID
    var controlSetId: ControlSetId
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[Token]
  }

  object GetEvidenceFoldersByAssessmentControlRequest {
    @inline
    def apply(
        assessmentId: UUID,
        controlId: UUID,
        controlSetId: ControlSetId,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[Token] = js.undefined
    ): GetEvidenceFoldersByAssessmentControlRequest = {
      val __obj = js.Dynamic.literal(
        "assessmentId" -> assessmentId.asInstanceOf[js.Any],
        "controlId" -> controlId.asInstanceOf[js.Any],
        "controlSetId" -> controlSetId.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetEvidenceFoldersByAssessmentControlRequest]
    }
  }

  @js.native
  trait GetEvidenceFoldersByAssessmentControlResponse extends js.Object {
    var evidenceFolders: js.UndefOr[AssessmentEvidenceFolders]
    var nextToken: js.UndefOr[Token]
  }

  object GetEvidenceFoldersByAssessmentControlResponse {
    @inline
    def apply(
        evidenceFolders: js.UndefOr[AssessmentEvidenceFolders] = js.undefined,
        nextToken: js.UndefOr[Token] = js.undefined
    ): GetEvidenceFoldersByAssessmentControlResponse = {
      val __obj = js.Dynamic.literal()
      evidenceFolders.foreach(__v => __obj.updateDynamic("evidenceFolders")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetEvidenceFoldersByAssessmentControlResponse]
    }
  }

  @js.native
  trait GetEvidenceFoldersByAssessmentRequest extends js.Object {
    var assessmentId: UUID
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[Token]
  }

  object GetEvidenceFoldersByAssessmentRequest {
    @inline
    def apply(
        assessmentId: UUID,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[Token] = js.undefined
    ): GetEvidenceFoldersByAssessmentRequest = {
      val __obj = js.Dynamic.literal(
        "assessmentId" -> assessmentId.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetEvidenceFoldersByAssessmentRequest]
    }
  }

  @js.native
  trait GetEvidenceFoldersByAssessmentResponse extends js.Object {
    var evidenceFolders: js.UndefOr[AssessmentEvidenceFolders]
    var nextToken: js.UndefOr[Token]
  }

  object GetEvidenceFoldersByAssessmentResponse {
    @inline
    def apply(
        evidenceFolders: js.UndefOr[AssessmentEvidenceFolders] = js.undefined,
        nextToken: js.UndefOr[Token] = js.undefined
    ): GetEvidenceFoldersByAssessmentResponse = {
      val __obj = js.Dynamic.literal()
      evidenceFolders.foreach(__v => __obj.updateDynamic("evidenceFolders")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetEvidenceFoldersByAssessmentResponse]
    }
  }

  @js.native
  trait GetEvidenceRequest extends js.Object {
    var assessmentId: UUID
    var controlSetId: ControlSetId
    var evidenceFolderId: UUID
    var evidenceId: UUID
  }

  object GetEvidenceRequest {
    @inline
    def apply(
        assessmentId: UUID,
        controlSetId: ControlSetId,
        evidenceFolderId: UUID,
        evidenceId: UUID
    ): GetEvidenceRequest = {
      val __obj = js.Dynamic.literal(
        "assessmentId" -> assessmentId.asInstanceOf[js.Any],
        "controlSetId" -> controlSetId.asInstanceOf[js.Any],
        "evidenceFolderId" -> evidenceFolderId.asInstanceOf[js.Any],
        "evidenceId" -> evidenceId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetEvidenceRequest]
    }
  }

  @js.native
  trait GetEvidenceResponse extends js.Object {
    var evidence: js.UndefOr[Evidence]
  }

  object GetEvidenceResponse {
    @inline
    def apply(
        evidence: js.UndefOr[Evidence] = js.undefined
    ): GetEvidenceResponse = {
      val __obj = js.Dynamic.literal()
      evidence.foreach(__v => __obj.updateDynamic("evidence")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetEvidenceResponse]
    }
  }

  @js.native
  trait GetInsightsByAssessmentRequest extends js.Object {
    var assessmentId: UUID
  }

  object GetInsightsByAssessmentRequest {
    @inline
    def apply(
        assessmentId: UUID
    ): GetInsightsByAssessmentRequest = {
      val __obj = js.Dynamic.literal(
        "assessmentId" -> assessmentId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetInsightsByAssessmentRequest]
    }
  }

  @js.native
  trait GetInsightsByAssessmentResponse extends js.Object {
    var insights: js.UndefOr[InsightsByAssessment]
  }

  object GetInsightsByAssessmentResponse {
    @inline
    def apply(
        insights: js.UndefOr[InsightsByAssessment] = js.undefined
    ): GetInsightsByAssessmentResponse = {
      val __obj = js.Dynamic.literal()
      insights.foreach(__v => __obj.updateDynamic("insights")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetInsightsByAssessmentResponse]
    }
  }

  @js.native
  trait GetInsightsRequest extends js.Object

  object GetInsightsRequest {
    @inline
    def apply(): GetInsightsRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetInsightsRequest]
    }
  }

  @js.native
  trait GetInsightsResponse extends js.Object {
    var insights: js.UndefOr[Insights]
  }

  object GetInsightsResponse {
    @inline
    def apply(
        insights: js.UndefOr[Insights] = js.undefined
    ): GetInsightsResponse = {
      val __obj = js.Dynamic.literal()
      insights.foreach(__v => __obj.updateDynamic("insights")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetInsightsResponse]
    }
  }

  @js.native
  trait GetOrganizationAdminAccountRequest extends js.Object

  object GetOrganizationAdminAccountRequest {
    @inline
    def apply(): GetOrganizationAdminAccountRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetOrganizationAdminAccountRequest]
    }
  }

  @js.native
  trait GetOrganizationAdminAccountResponse extends js.Object {
    var adminAccountId: js.UndefOr[AccountId]
    var organizationId: js.UndefOr[organizationId]
  }

  object GetOrganizationAdminAccountResponse {
    @inline
    def apply(
        adminAccountId: js.UndefOr[AccountId] = js.undefined,
        organizationId: js.UndefOr[organizationId] = js.undefined
    ): GetOrganizationAdminAccountResponse = {
      val __obj = js.Dynamic.literal()
      adminAccountId.foreach(__v => __obj.updateDynamic("adminAccountId")(__v.asInstanceOf[js.Any]))
      organizationId.foreach(__v => __obj.updateDynamic("organizationId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetOrganizationAdminAccountResponse]
    }
  }

  @js.native
  trait GetServicesInScopeRequest extends js.Object

  object GetServicesInScopeRequest {
    @inline
    def apply(): GetServicesInScopeRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetServicesInScopeRequest]
    }
  }

  @js.native
  trait GetServicesInScopeResponse extends js.Object {
    var serviceMetadata: js.UndefOr[ServiceMetadataList]
  }

  object GetServicesInScopeResponse {
    @inline
    def apply(
        serviceMetadata: js.UndefOr[ServiceMetadataList] = js.undefined
    ): GetServicesInScopeResponse = {
      val __obj = js.Dynamic.literal()
      serviceMetadata.foreach(__v => __obj.updateDynamic("serviceMetadata")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetServicesInScopeResponse]
    }
  }

  @js.native
  trait GetSettingsRequest extends js.Object {
    var attribute: SettingAttribute
  }

  object GetSettingsRequest {
    @inline
    def apply(
        attribute: SettingAttribute
    ): GetSettingsRequest = {
      val __obj = js.Dynamic.literal(
        "attribute" -> attribute.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetSettingsRequest]
    }
  }

  @js.native
  trait GetSettingsResponse extends js.Object {
    var settings: js.UndefOr[Settings]
  }

  object GetSettingsResponse {
    @inline
    def apply(
        settings: js.UndefOr[Settings] = js.undefined
    ): GetSettingsResponse = {
      val __obj = js.Dynamic.literal()
      settings.foreach(__v => __obj.updateDynamic("settings")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetSettingsResponse]
    }
  }

  /** A summary of the latest analytics data for all your active assessments. This summary is a snapshot of the data that your active assessments collected on the <code>lastUpdated</code> date. It’s important to understand that the following totals are daily counts based on this date — they aren’t a total sum to date. The <code>Insights</code> data is eventually consistent. This means that, when you read data from <code>Insights</code>, the response might not instantly reflect the results of a recently completed write or update operation. If you repeat your read request after a few hours, the response should return the latest data.
    *
    * '''Note:'''If you delete an assessment or change its status to inactive, <code>InsightsByAssessment</code> includes data for that assessment as follows. * ```Inactive assessments``` - If Audit Manager collected evidence for your assessment before you changed it inactive, that evidence is included in the <code>InsightsByAssessment</code> counts for that day. * ```Deleted assessments``` - If Audit Manager collected evidence for your assessment before you deleted it, that evidence isn't included in the <code>InsightsByAssessment</code> counts for that day.
    */
  @js.native
  trait Insights extends js.Object {
    var activeAssessmentsCount: js.UndefOr[NullableInteger]
    var assessmentControlsCountByNoncompliantEvidence: js.UndefOr[NullableInteger]
    var compliantEvidenceCount: js.UndefOr[NullableInteger]
    var inconclusiveEvidenceCount: js.UndefOr[NullableInteger]
    var lastUpdated: js.UndefOr[Timestamp]
    var noncompliantEvidenceCount: js.UndefOr[NullableInteger]
    var totalAssessmentControlsCount: js.UndefOr[NullableInteger]
  }

  object Insights {
    @inline
    def apply(
        activeAssessmentsCount: js.UndefOr[NullableInteger] = js.undefined,
        assessmentControlsCountByNoncompliantEvidence: js.UndefOr[NullableInteger] = js.undefined,
        compliantEvidenceCount: js.UndefOr[NullableInteger] = js.undefined,
        inconclusiveEvidenceCount: js.UndefOr[NullableInteger] = js.undefined,
        lastUpdated: js.UndefOr[Timestamp] = js.undefined,
        noncompliantEvidenceCount: js.UndefOr[NullableInteger] = js.undefined,
        totalAssessmentControlsCount: js.UndefOr[NullableInteger] = js.undefined
    ): Insights = {
      val __obj = js.Dynamic.literal()
      activeAssessmentsCount.foreach(__v => __obj.updateDynamic("activeAssessmentsCount")(__v.asInstanceOf[js.Any]))
      assessmentControlsCountByNoncompliantEvidence.foreach(__v => __obj.updateDynamic("assessmentControlsCountByNoncompliantEvidence")(__v.asInstanceOf[js.Any]))
      compliantEvidenceCount.foreach(__v => __obj.updateDynamic("compliantEvidenceCount")(__v.asInstanceOf[js.Any]))
      inconclusiveEvidenceCount.foreach(__v => __obj.updateDynamic("inconclusiveEvidenceCount")(__v.asInstanceOf[js.Any]))
      lastUpdated.foreach(__v => __obj.updateDynamic("lastUpdated")(__v.asInstanceOf[js.Any]))
      noncompliantEvidenceCount.foreach(__v => __obj.updateDynamic("noncompliantEvidenceCount")(__v.asInstanceOf[js.Any]))
      totalAssessmentControlsCount.foreach(__v => __obj.updateDynamic("totalAssessmentControlsCount")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Insights]
    }
  }

  /** A summary of the latest analytics data for a specific active assessment. This summary is a snapshot of the data that was collected on the <code>lastUpdated</code> date. It’s important to understand that the totals in <code>InsightsByAssessment</code> are daily counts based on this date — they aren’t a total sum to date. The <code>InsightsByAssessment</code> data is eventually consistent. This means that when you read data from <code>InsightsByAssessment</code>, the response might not instantly reflect the results of a recently completed write or update operation. If you repeat your read request after a few hours, the response returns the latest data.
    *
    * '''Note:'''If you delete an assessment or change its status to inactive, <code>InsightsByAssessment</code> includes data for that assessment as follows. * ```Inactive assessments``` - If Audit Manager collected evidence for your assessment before you changed it inactive, that evidence is included in the <code>InsightsByAssessment</code> counts for that day. * ```Deleted assessments``` - If Audit Manager collected evidence for your assessment before you deleted it, that evidence isn't included in the <code>InsightsByAssessment</code> counts for that day.
    */
  @js.native
  trait InsightsByAssessment extends js.Object {
    var assessmentControlsCountByNoncompliantEvidence: js.UndefOr[NullableInteger]
    var compliantEvidenceCount: js.UndefOr[NullableInteger]
    var inconclusiveEvidenceCount: js.UndefOr[NullableInteger]
    var lastUpdated: js.UndefOr[Timestamp]
    var noncompliantEvidenceCount: js.UndefOr[NullableInteger]
    var totalAssessmentControlsCount: js.UndefOr[NullableInteger]
  }

  object InsightsByAssessment {
    @inline
    def apply(
        assessmentControlsCountByNoncompliantEvidence: js.UndefOr[NullableInteger] = js.undefined,
        compliantEvidenceCount: js.UndefOr[NullableInteger] = js.undefined,
        inconclusiveEvidenceCount: js.UndefOr[NullableInteger] = js.undefined,
        lastUpdated: js.UndefOr[Timestamp] = js.undefined,
        noncompliantEvidenceCount: js.UndefOr[NullableInteger] = js.undefined,
        totalAssessmentControlsCount: js.UndefOr[NullableInteger] = js.undefined
    ): InsightsByAssessment = {
      val __obj = js.Dynamic.literal()
      assessmentControlsCountByNoncompliantEvidence.foreach(__v => __obj.updateDynamic("assessmentControlsCountByNoncompliantEvidence")(__v.asInstanceOf[js.Any]))
      compliantEvidenceCount.foreach(__v => __obj.updateDynamic("compliantEvidenceCount")(__v.asInstanceOf[js.Any]))
      inconclusiveEvidenceCount.foreach(__v => __obj.updateDynamic("inconclusiveEvidenceCount")(__v.asInstanceOf[js.Any]))
      lastUpdated.foreach(__v => __obj.updateDynamic("lastUpdated")(__v.asInstanceOf[js.Any]))
      noncompliantEvidenceCount.foreach(__v => __obj.updateDynamic("noncompliantEvidenceCount")(__v.asInstanceOf[js.Any]))
      totalAssessmentControlsCount.foreach(__v => __obj.updateDynamic("totalAssessmentControlsCount")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InsightsByAssessment]
    }
  }

  @js.native
  trait ListAssessmentControlInsightsByControlDomainRequest extends js.Object {
    var assessmentId: UUID
    var controlDomainId: UUID
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[Token]
  }

  object ListAssessmentControlInsightsByControlDomainRequest {
    @inline
    def apply(
        assessmentId: UUID,
        controlDomainId: UUID,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[Token] = js.undefined
    ): ListAssessmentControlInsightsByControlDomainRequest = {
      val __obj = js.Dynamic.literal(
        "assessmentId" -> assessmentId.asInstanceOf[js.Any],
        "controlDomainId" -> controlDomainId.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAssessmentControlInsightsByControlDomainRequest]
    }
  }

  @js.native
  trait ListAssessmentControlInsightsByControlDomainResponse extends js.Object {
    var controlInsightsByAssessment: js.UndefOr[ControlInsightsMetadataByAssessment]
    var nextToken: js.UndefOr[Token]
  }

  object ListAssessmentControlInsightsByControlDomainResponse {
    @inline
    def apply(
        controlInsightsByAssessment: js.UndefOr[ControlInsightsMetadataByAssessment] = js.undefined,
        nextToken: js.UndefOr[Token] = js.undefined
    ): ListAssessmentControlInsightsByControlDomainResponse = {
      val __obj = js.Dynamic.literal()
      controlInsightsByAssessment.foreach(__v => __obj.updateDynamic("controlInsightsByAssessment")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAssessmentControlInsightsByControlDomainResponse]
    }
  }

  @js.native
  trait ListAssessmentFrameworkShareRequestsRequest extends js.Object {
    var requestType: ShareRequestType
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[Token]
  }

  object ListAssessmentFrameworkShareRequestsRequest {
    @inline
    def apply(
        requestType: ShareRequestType,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[Token] = js.undefined
    ): ListAssessmentFrameworkShareRequestsRequest = {
      val __obj = js.Dynamic.literal(
        "requestType" -> requestType.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAssessmentFrameworkShareRequestsRequest]
    }
  }

  @js.native
  trait ListAssessmentFrameworkShareRequestsResponse extends js.Object {
    var assessmentFrameworkShareRequests: js.UndefOr[AssessmentFrameworkShareRequestList]
    var nextToken: js.UndefOr[Token]
  }

  object ListAssessmentFrameworkShareRequestsResponse {
    @inline
    def apply(
        assessmentFrameworkShareRequests: js.UndefOr[AssessmentFrameworkShareRequestList] = js.undefined,
        nextToken: js.UndefOr[Token] = js.undefined
    ): ListAssessmentFrameworkShareRequestsResponse = {
      val __obj = js.Dynamic.literal()
      assessmentFrameworkShareRequests.foreach(__v => __obj.updateDynamic("assessmentFrameworkShareRequests")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAssessmentFrameworkShareRequestsResponse]
    }
  }

  @js.native
  trait ListAssessmentFrameworksRequest extends js.Object {
    var frameworkType: FrameworkType
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[Token]
  }

  object ListAssessmentFrameworksRequest {
    @inline
    def apply(
        frameworkType: FrameworkType,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[Token] = js.undefined
    ): ListAssessmentFrameworksRequest = {
      val __obj = js.Dynamic.literal(
        "frameworkType" -> frameworkType.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAssessmentFrameworksRequest]
    }
  }

  @js.native
  trait ListAssessmentFrameworksResponse extends js.Object {
    var frameworkMetadataList: js.UndefOr[FrameworkMetadataList]
    var nextToken: js.UndefOr[Token]
  }

  object ListAssessmentFrameworksResponse {
    @inline
    def apply(
        frameworkMetadataList: js.UndefOr[FrameworkMetadataList] = js.undefined,
        nextToken: js.UndefOr[Token] = js.undefined
    ): ListAssessmentFrameworksResponse = {
      val __obj = js.Dynamic.literal()
      frameworkMetadataList.foreach(__v => __obj.updateDynamic("frameworkMetadataList")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAssessmentFrameworksResponse]
    }
  }

  @js.native
  trait ListAssessmentReportsRequest extends js.Object {
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[Token]
  }

  object ListAssessmentReportsRequest {
    @inline
    def apply(
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[Token] = js.undefined
    ): ListAssessmentReportsRequest = {
      val __obj = js.Dynamic.literal()
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAssessmentReportsRequest]
    }
  }

  @js.native
  trait ListAssessmentReportsResponse extends js.Object {
    var assessmentReports: js.UndefOr[AssessmentReportsMetadata]
    var nextToken: js.UndefOr[Token]
  }

  object ListAssessmentReportsResponse {
    @inline
    def apply(
        assessmentReports: js.UndefOr[AssessmentReportsMetadata] = js.undefined,
        nextToken: js.UndefOr[Token] = js.undefined
    ): ListAssessmentReportsResponse = {
      val __obj = js.Dynamic.literal()
      assessmentReports.foreach(__v => __obj.updateDynamic("assessmentReports")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAssessmentReportsResponse]
    }
  }

  @js.native
  trait ListAssessmentsRequest extends js.Object {
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[Token]
    var status: js.UndefOr[AssessmentStatus]
  }

  object ListAssessmentsRequest {
    @inline
    def apply(
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[Token] = js.undefined,
        status: js.UndefOr[AssessmentStatus] = js.undefined
    ): ListAssessmentsRequest = {
      val __obj = js.Dynamic.literal()
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAssessmentsRequest]
    }
  }

  @js.native
  trait ListAssessmentsResponse extends js.Object {
    var assessmentMetadata: js.UndefOr[ListAssessmentMetadata]
    var nextToken: js.UndefOr[Token]
  }

  object ListAssessmentsResponse {
    @inline
    def apply(
        assessmentMetadata: js.UndefOr[ListAssessmentMetadata] = js.undefined,
        nextToken: js.UndefOr[Token] = js.undefined
    ): ListAssessmentsResponse = {
      val __obj = js.Dynamic.literal()
      assessmentMetadata.foreach(__v => __obj.updateDynamic("assessmentMetadata")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAssessmentsResponse]
    }
  }

  @js.native
  trait ListControlDomainInsightsByAssessmentRequest extends js.Object {
    var assessmentId: UUID
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[Token]
  }

  object ListControlDomainInsightsByAssessmentRequest {
    @inline
    def apply(
        assessmentId: UUID,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[Token] = js.undefined
    ): ListControlDomainInsightsByAssessmentRequest = {
      val __obj = js.Dynamic.literal(
        "assessmentId" -> assessmentId.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListControlDomainInsightsByAssessmentRequest]
    }
  }

  @js.native
  trait ListControlDomainInsightsByAssessmentResponse extends js.Object {
    var controlDomainInsights: js.UndefOr[ControlDomainInsightsList]
    var nextToken: js.UndefOr[Token]
  }

  object ListControlDomainInsightsByAssessmentResponse {
    @inline
    def apply(
        controlDomainInsights: js.UndefOr[ControlDomainInsightsList] = js.undefined,
        nextToken: js.UndefOr[Token] = js.undefined
    ): ListControlDomainInsightsByAssessmentResponse = {
      val __obj = js.Dynamic.literal()
      controlDomainInsights.foreach(__v => __obj.updateDynamic("controlDomainInsights")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListControlDomainInsightsByAssessmentResponse]
    }
  }

  @js.native
  trait ListControlDomainInsightsRequest extends js.Object {
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[Token]
  }

  object ListControlDomainInsightsRequest {
    @inline
    def apply(
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[Token] = js.undefined
    ): ListControlDomainInsightsRequest = {
      val __obj = js.Dynamic.literal()
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListControlDomainInsightsRequest]
    }
  }

  @js.native
  trait ListControlDomainInsightsResponse extends js.Object {
    var controlDomainInsights: js.UndefOr[ControlDomainInsightsList]
    var nextToken: js.UndefOr[Token]
  }

  object ListControlDomainInsightsResponse {
    @inline
    def apply(
        controlDomainInsights: js.UndefOr[ControlDomainInsightsList] = js.undefined,
        nextToken: js.UndefOr[Token] = js.undefined
    ): ListControlDomainInsightsResponse = {
      val __obj = js.Dynamic.literal()
      controlDomainInsights.foreach(__v => __obj.updateDynamic("controlDomainInsights")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListControlDomainInsightsResponse]
    }
  }

  @js.native
  trait ListControlInsightsByControlDomainRequest extends js.Object {
    var controlDomainId: UUID
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[Token]
  }

  object ListControlInsightsByControlDomainRequest {
    @inline
    def apply(
        controlDomainId: UUID,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[Token] = js.undefined
    ): ListControlInsightsByControlDomainRequest = {
      val __obj = js.Dynamic.literal(
        "controlDomainId" -> controlDomainId.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListControlInsightsByControlDomainRequest]
    }
  }

  @js.native
  trait ListControlInsightsByControlDomainResponse extends js.Object {
    var controlInsightsMetadata: js.UndefOr[ControlInsightsMetadata]
    var nextToken: js.UndefOr[Token]
  }

  object ListControlInsightsByControlDomainResponse {
    @inline
    def apply(
        controlInsightsMetadata: js.UndefOr[ControlInsightsMetadata] = js.undefined,
        nextToken: js.UndefOr[Token] = js.undefined
    ): ListControlInsightsByControlDomainResponse = {
      val __obj = js.Dynamic.literal()
      controlInsightsMetadata.foreach(__v => __obj.updateDynamic("controlInsightsMetadata")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListControlInsightsByControlDomainResponse]
    }
  }

  @js.native
  trait ListControlsRequest extends js.Object {
    var controlType: ControlType
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[Token]
  }

  object ListControlsRequest {
    @inline
    def apply(
        controlType: ControlType,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[Token] = js.undefined
    ): ListControlsRequest = {
      val __obj = js.Dynamic.literal(
        "controlType" -> controlType.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListControlsRequest]
    }
  }

  @js.native
  trait ListControlsResponse extends js.Object {
    var controlMetadataList: js.UndefOr[ControlMetadataList]
    var nextToken: js.UndefOr[Token]
  }

  object ListControlsResponse {
    @inline
    def apply(
        controlMetadataList: js.UndefOr[ControlMetadataList] = js.undefined,
        nextToken: js.UndefOr[Token] = js.undefined
    ): ListControlsResponse = {
      val __obj = js.Dynamic.literal()
      controlMetadataList.foreach(__v => __obj.updateDynamic("controlMetadataList")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListControlsResponse]
    }
  }

  @js.native
  trait ListKeywordsForDataSourceRequest extends js.Object {
    var source: SourceType
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[Token]
  }

  object ListKeywordsForDataSourceRequest {
    @inline
    def apply(
        source: SourceType,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[Token] = js.undefined
    ): ListKeywordsForDataSourceRequest = {
      val __obj = js.Dynamic.literal(
        "source" -> source.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListKeywordsForDataSourceRequest]
    }
  }

  @js.native
  trait ListKeywordsForDataSourceResponse extends js.Object {
    var keywords: js.UndefOr[Keywords]
    var nextToken: js.UndefOr[Token]
  }

  object ListKeywordsForDataSourceResponse {
    @inline
    def apply(
        keywords: js.UndefOr[Keywords] = js.undefined,
        nextToken: js.UndefOr[Token] = js.undefined
    ): ListKeywordsForDataSourceResponse = {
      val __obj = js.Dynamic.literal()
      keywords.foreach(__v => __obj.updateDynamic("keywords")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListKeywordsForDataSourceResponse]
    }
  }

  @js.native
  trait ListNotificationsRequest extends js.Object {
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[Token]
  }

  object ListNotificationsRequest {
    @inline
    def apply(
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[Token] = js.undefined
    ): ListNotificationsRequest = {
      val __obj = js.Dynamic.literal()
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListNotificationsRequest]
    }
  }

  @js.native
  trait ListNotificationsResponse extends js.Object {
    var nextToken: js.UndefOr[Token]
    var notifications: js.UndefOr[Notifications]
  }

  object ListNotificationsResponse {
    @inline
    def apply(
        nextToken: js.UndefOr[Token] = js.undefined,
        notifications: js.UndefOr[Notifications] = js.undefined
    ): ListNotificationsResponse = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      notifications.foreach(__v => __obj.updateDynamic("notifications")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListNotificationsResponse]
    }
  }

  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var resourceArn: AuditManagerArn
  }

  object ListTagsForResourceRequest {
    @inline
    def apply(
        resourceArn: AuditManagerArn
    ): ListTagsForResourceRequest = {
      val __obj = js.Dynamic.literal(
        "resourceArn" -> resourceArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ListTagsForResourceRequest]
    }
  }

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

  /** Evidence that's uploaded to Audit Manager manually.
    */
  @js.native
  trait ManualEvidence extends js.Object {
    var s3ResourcePath: js.UndefOr[S3Url]
  }

  object ManualEvidence {
    @inline
    def apply(
        s3ResourcePath: js.UndefOr[S3Url] = js.undefined
    ): ManualEvidence = {
      val __obj = js.Dynamic.literal()
      s3ResourcePath.foreach(__v => __obj.updateDynamic("s3ResourcePath")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ManualEvidence]
    }
  }

  /** The notification that informs a user of an update in Audit Manager. For example, this includes the notification that's sent when a control set is delegated for review.
    */
  @js.native
  trait Notification extends js.Object {
    var assessmentId: js.UndefOr[UUID]
    var assessmentName: js.UndefOr[AssessmentName]
    var controlSetId: js.UndefOr[ControlSetId]
    var controlSetName: js.UndefOr[NonEmptyString]
    var description: js.UndefOr[NonEmptyString]
    var eventTime: js.UndefOr[Timestamp]
    var id: js.UndefOr[TimestampUUID]
    var source: js.UndefOr[NonEmptyString]
  }

  object Notification {
    @inline
    def apply(
        assessmentId: js.UndefOr[UUID] = js.undefined,
        assessmentName: js.UndefOr[AssessmentName] = js.undefined,
        controlSetId: js.UndefOr[ControlSetId] = js.undefined,
        controlSetName: js.UndefOr[NonEmptyString] = js.undefined,
        description: js.UndefOr[NonEmptyString] = js.undefined,
        eventTime: js.UndefOr[Timestamp] = js.undefined,
        id: js.UndefOr[TimestampUUID] = js.undefined,
        source: js.UndefOr[NonEmptyString] = js.undefined
    ): Notification = {
      val __obj = js.Dynamic.literal()
      assessmentId.foreach(__v => __obj.updateDynamic("assessmentId")(__v.asInstanceOf[js.Any]))
      assessmentName.foreach(__v => __obj.updateDynamic("assessmentName")(__v.asInstanceOf[js.Any]))
      controlSetId.foreach(__v => __obj.updateDynamic("controlSetId")(__v.asInstanceOf[js.Any]))
      controlSetName.foreach(__v => __obj.updateDynamic("controlSetName")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      eventTime.foreach(__v => __obj.updateDynamic("eventTime")(__v.asInstanceOf[js.Any]))
      id.foreach(__v => __obj.updateDynamic("id")(__v.asInstanceOf[js.Any]))
      source.foreach(__v => __obj.updateDynamic("source")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Notification]
    }
  }

  @js.native
  trait RegisterAccountRequest extends js.Object {
    var delegatedAdminAccount: js.UndefOr[AccountId]
    var kmsKey: js.UndefOr[KmsKey]
  }

  object RegisterAccountRequest {
    @inline
    def apply(
        delegatedAdminAccount: js.UndefOr[AccountId] = js.undefined,
        kmsKey: js.UndefOr[KmsKey] = js.undefined
    ): RegisterAccountRequest = {
      val __obj = js.Dynamic.literal()
      delegatedAdminAccount.foreach(__v => __obj.updateDynamic("delegatedAdminAccount")(__v.asInstanceOf[js.Any]))
      kmsKey.foreach(__v => __obj.updateDynamic("kmsKey")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RegisterAccountRequest]
    }
  }

  @js.native
  trait RegisterAccountResponse extends js.Object {
    var status: js.UndefOr[AccountStatus]
  }

  object RegisterAccountResponse {
    @inline
    def apply(
        status: js.UndefOr[AccountStatus] = js.undefined
    ): RegisterAccountResponse = {
      val __obj = js.Dynamic.literal()
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RegisterAccountResponse]
    }
  }

  @js.native
  trait RegisterOrganizationAdminAccountRequest extends js.Object {
    var adminAccountId: AccountId
  }

  object RegisterOrganizationAdminAccountRequest {
    @inline
    def apply(
        adminAccountId: AccountId
    ): RegisterOrganizationAdminAccountRequest = {
      val __obj = js.Dynamic.literal(
        "adminAccountId" -> adminAccountId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[RegisterOrganizationAdminAccountRequest]
    }
  }

  @js.native
  trait RegisterOrganizationAdminAccountResponse extends js.Object {
    var adminAccountId: js.UndefOr[AccountId]
    var organizationId: js.UndefOr[organizationId]
  }

  object RegisterOrganizationAdminAccountResponse {
    @inline
    def apply(
        adminAccountId: js.UndefOr[AccountId] = js.undefined,
        organizationId: js.UndefOr[organizationId] = js.undefined
    ): RegisterOrganizationAdminAccountResponse = {
      val __obj = js.Dynamic.literal()
      adminAccountId.foreach(__v => __obj.updateDynamic("adminAccountId")(__v.asInstanceOf[js.Any]))
      organizationId.foreach(__v => __obj.updateDynamic("organizationId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RegisterOrganizationAdminAccountResponse]
    }
  }

  /** A system asset that's evaluated in an Audit Manager assessment.
    */
  @js.native
  trait Resource extends js.Object {
    var arn: js.UndefOr[GenericArn]
    var value: js.UndefOr[String]
  }

  object Resource {
    @inline
    def apply(
        arn: js.UndefOr[GenericArn] = js.undefined,
        value: js.UndefOr[String] = js.undefined
    ): Resource = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      value.foreach(__v => __obj.updateDynamic("value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Resource]
    }
  }

  /** The wrapper that contains the Audit Manager role information of the current user. This includes the role type and IAM Amazon Resource Name (ARN).
    */
  @js.native
  trait Role extends js.Object {
    var roleArn: js.UndefOr[IamArn]
    var roleType: js.UndefOr[RoleType]
  }

  object Role {
    @inline
    def apply(
        roleArn: js.UndefOr[IamArn] = js.undefined,
        roleType: js.UndefOr[RoleType] = js.undefined
    ): Role = {
      val __obj = js.Dynamic.literal()
      roleArn.foreach(__v => __obj.updateDynamic("roleArn")(__v.asInstanceOf[js.Any]))
      roleType.foreach(__v => __obj.updateDynamic("roleType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Role]
    }
  }

  /** The wrapper that contains the Amazon Web Services accounts and services that are in scope for the assessment.
    */
  @js.native
  trait Scope extends js.Object {
    var awsAccounts: js.UndefOr[AWSAccounts]
    var awsServices: js.UndefOr[AWSServices]
  }

  object Scope {
    @inline
    def apply(
        awsAccounts: js.UndefOr[AWSAccounts] = js.undefined,
        awsServices: js.UndefOr[AWSServices] = js.undefined
    ): Scope = {
      val __obj = js.Dynamic.literal()
      awsAccounts.foreach(__v => __obj.updateDynamic("awsAccounts")(__v.asInstanceOf[js.Any]))
      awsServices.foreach(__v => __obj.updateDynamic("awsServices")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Scope]
    }
  }

  /** The metadata that's associated with the Amazon Web Service.
    */
  @js.native
  trait ServiceMetadata extends js.Object {
    var category: js.UndefOr[NonEmptyString]
    var description: js.UndefOr[NonEmptyString]
    var displayName: js.UndefOr[NonEmptyString]
    var name: js.UndefOr[AWSServiceName]
  }

  object ServiceMetadata {
    @inline
    def apply(
        category: js.UndefOr[NonEmptyString] = js.undefined,
        description: js.UndefOr[NonEmptyString] = js.undefined,
        displayName: js.UndefOr[NonEmptyString] = js.undefined,
        name: js.UndefOr[AWSServiceName] = js.undefined
    ): ServiceMetadata = {
      val __obj = js.Dynamic.literal()
      category.foreach(__v => __obj.updateDynamic("category")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      displayName.foreach(__v => __obj.updateDynamic("displayName")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ServiceMetadata]
    }
  }

  /** The settings object that holds all supported Audit Manager settings.
    */
  @js.native
  trait Settings extends js.Object {
    var defaultAssessmentReportsDestination: js.UndefOr[AssessmentReportsDestination]
    var defaultProcessOwners: js.UndefOr[Roles]
    var isAwsOrgEnabled: js.UndefOr[Boolean]
    var kmsKey: js.UndefOr[KmsKey]
    var snsTopic: js.UndefOr[SNSTopic]
  }

  object Settings {
    @inline
    def apply(
        defaultAssessmentReportsDestination: js.UndefOr[AssessmentReportsDestination] = js.undefined,
        defaultProcessOwners: js.UndefOr[Roles] = js.undefined,
        isAwsOrgEnabled: js.UndefOr[Boolean] = js.undefined,
        kmsKey: js.UndefOr[KmsKey] = js.undefined,
        snsTopic: js.UndefOr[SNSTopic] = js.undefined
    ): Settings = {
      val __obj = js.Dynamic.literal()
      defaultAssessmentReportsDestination.foreach(__v => __obj.updateDynamic("defaultAssessmentReportsDestination")(__v.asInstanceOf[js.Any]))
      defaultProcessOwners.foreach(__v => __obj.updateDynamic("defaultProcessOwners")(__v.asInstanceOf[js.Any]))
      isAwsOrgEnabled.foreach(__v => __obj.updateDynamic("isAwsOrgEnabled")(__v.asInstanceOf[js.Any]))
      kmsKey.foreach(__v => __obj.updateDynamic("kmsKey")(__v.asInstanceOf[js.Any]))
      snsTopic.foreach(__v => __obj.updateDynamic("snsTopic")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Settings]
    }
  }

  /** The keyword to search for in CloudTrail logs, Config rules, Security Hub checks, and Amazon Web Services API names.
    */
  @js.native
  trait SourceKeyword extends js.Object {
    var keywordInputType: js.UndefOr[KeywordInputType]
    var keywordValue: js.UndefOr[KeywordValue]
  }

  object SourceKeyword {
    @inline
    def apply(
        keywordInputType: js.UndefOr[KeywordInputType] = js.undefined,
        keywordValue: js.UndefOr[KeywordValue] = js.undefined
    ): SourceKeyword = {
      val __obj = js.Dynamic.literal()
      keywordInputType.foreach(__v => __obj.updateDynamic("keywordInputType")(__v.asInstanceOf[js.Any]))
      keywordValue.foreach(__v => __obj.updateDynamic("keywordValue")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SourceKeyword]
    }
  }

  @js.native
  trait StartAssessmentFrameworkShareRequest extends js.Object {
    var destinationAccount: AccountId
    var destinationRegion: Region
    var frameworkId: UUID
    var comment: js.UndefOr[ShareRequestComment]
  }

  object StartAssessmentFrameworkShareRequest {
    @inline
    def apply(
        destinationAccount: AccountId,
        destinationRegion: Region,
        frameworkId: UUID,
        comment: js.UndefOr[ShareRequestComment] = js.undefined
    ): StartAssessmentFrameworkShareRequest = {
      val __obj = js.Dynamic.literal(
        "destinationAccount" -> destinationAccount.asInstanceOf[js.Any],
        "destinationRegion" -> destinationRegion.asInstanceOf[js.Any],
        "frameworkId" -> frameworkId.asInstanceOf[js.Any]
      )

      comment.foreach(__v => __obj.updateDynamic("comment")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartAssessmentFrameworkShareRequest]
    }
  }

  @js.native
  trait StartAssessmentFrameworkShareResponse extends js.Object {
    var assessmentFrameworkShareRequest: js.UndefOr[AssessmentFrameworkShareRequest]
  }

  object StartAssessmentFrameworkShareResponse {
    @inline
    def apply(
        assessmentFrameworkShareRequest: js.UndefOr[AssessmentFrameworkShareRequest] = js.undefined
    ): StartAssessmentFrameworkShareResponse = {
      val __obj = js.Dynamic.literal()
      assessmentFrameworkShareRequest.foreach(__v => __obj.updateDynamic("assessmentFrameworkShareRequest")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartAssessmentFrameworkShareResponse]
    }
  }

  @js.native
  trait TagResourceRequest extends js.Object {
    var resourceArn: AuditManagerArn
    var tags: TagMap
  }

  object TagResourceRequest {
    @inline
    def apply(
        resourceArn: AuditManagerArn,
        tags: TagMap
    ): TagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "resourceArn" -> resourceArn.asInstanceOf[js.Any],
        "tags" -> tags.asInstanceOf[js.Any]
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

  /** Short for uniform resource locator. A URL is used as a unique identifier to locate a resource on the internet.
    */
  @js.native
  trait URL extends js.Object {
    var hyperlinkName: js.UndefOr[HyperlinkName]
    var link: js.UndefOr[UrlLink]
  }

  object URL {
    @inline
    def apply(
        hyperlinkName: js.UndefOr[HyperlinkName] = js.undefined,
        link: js.UndefOr[UrlLink] = js.undefined
    ): URL = {
      val __obj = js.Dynamic.literal()
      hyperlinkName.foreach(__v => __obj.updateDynamic("hyperlinkName")(__v.asInstanceOf[js.Any]))
      link.foreach(__v => __obj.updateDynamic("link")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[URL]
    }
  }

  @js.native
  trait UntagResourceRequest extends js.Object {
    var resourceArn: AuditManagerArn
    var tagKeys: TagKeyList
  }

  object UntagResourceRequest {
    @inline
    def apply(
        resourceArn: AuditManagerArn,
        tagKeys: TagKeyList
    ): UntagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "resourceArn" -> resourceArn.asInstanceOf[js.Any],
        "tagKeys" -> tagKeys.asInstanceOf[js.Any]
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

  @js.native
  trait UpdateAssessmentControlRequest extends js.Object {
    var assessmentId: UUID
    var controlId: UUID
    var controlSetId: ControlSetId
    var commentBody: js.UndefOr[ControlCommentBody]
    var controlStatus: js.UndefOr[ControlStatus]
  }

  object UpdateAssessmentControlRequest {
    @inline
    def apply(
        assessmentId: UUID,
        controlId: UUID,
        controlSetId: ControlSetId,
        commentBody: js.UndefOr[ControlCommentBody] = js.undefined,
        controlStatus: js.UndefOr[ControlStatus] = js.undefined
    ): UpdateAssessmentControlRequest = {
      val __obj = js.Dynamic.literal(
        "assessmentId" -> assessmentId.asInstanceOf[js.Any],
        "controlId" -> controlId.asInstanceOf[js.Any],
        "controlSetId" -> controlSetId.asInstanceOf[js.Any]
      )

      commentBody.foreach(__v => __obj.updateDynamic("commentBody")(__v.asInstanceOf[js.Any]))
      controlStatus.foreach(__v => __obj.updateDynamic("controlStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateAssessmentControlRequest]
    }
  }

  @js.native
  trait UpdateAssessmentControlResponse extends js.Object {
    var control: js.UndefOr[AssessmentControl]
  }

  object UpdateAssessmentControlResponse {
    @inline
    def apply(
        control: js.UndefOr[AssessmentControl] = js.undefined
    ): UpdateAssessmentControlResponse = {
      val __obj = js.Dynamic.literal()
      control.foreach(__v => __obj.updateDynamic("control")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateAssessmentControlResponse]
    }
  }

  @js.native
  trait UpdateAssessmentControlSetStatusRequest extends js.Object {
    var assessmentId: UUID
    var comment: DelegationComment
    var controlSetId: String
    var status: ControlSetStatus
  }

  object UpdateAssessmentControlSetStatusRequest {
    @inline
    def apply(
        assessmentId: UUID,
        comment: DelegationComment,
        controlSetId: String,
        status: ControlSetStatus
    ): UpdateAssessmentControlSetStatusRequest = {
      val __obj = js.Dynamic.literal(
        "assessmentId" -> assessmentId.asInstanceOf[js.Any],
        "comment" -> comment.asInstanceOf[js.Any],
        "controlSetId" -> controlSetId.asInstanceOf[js.Any],
        "status" -> status.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateAssessmentControlSetStatusRequest]
    }
  }

  @js.native
  trait UpdateAssessmentControlSetStatusResponse extends js.Object {
    var controlSet: js.UndefOr[AssessmentControlSet]
  }

  object UpdateAssessmentControlSetStatusResponse {
    @inline
    def apply(
        controlSet: js.UndefOr[AssessmentControlSet] = js.undefined
    ): UpdateAssessmentControlSetStatusResponse = {
      val __obj = js.Dynamic.literal()
      controlSet.foreach(__v => __obj.updateDynamic("controlSet")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateAssessmentControlSetStatusResponse]
    }
  }

  /** A <code>controlSet</code> entity that represents a collection of controls in Audit Manager. This doesn't contain the control set ID.
    */
  @js.native
  trait UpdateAssessmentFrameworkControlSet extends js.Object {
    var name: ControlSetName
    var controls: js.UndefOr[CreateAssessmentFrameworkControls]
    var id: js.UndefOr[ControlSetName]
  }

  object UpdateAssessmentFrameworkControlSet {
    @inline
    def apply(
        name: ControlSetName,
        controls: js.UndefOr[CreateAssessmentFrameworkControls] = js.undefined,
        id: js.UndefOr[ControlSetName] = js.undefined
    ): UpdateAssessmentFrameworkControlSet = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any]
      )

      controls.foreach(__v => __obj.updateDynamic("controls")(__v.asInstanceOf[js.Any]))
      id.foreach(__v => __obj.updateDynamic("id")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateAssessmentFrameworkControlSet]
    }
  }

  @js.native
  trait UpdateAssessmentFrameworkRequest extends js.Object {
    var controlSets: UpdateAssessmentFrameworkControlSets
    var frameworkId: UUID
    var name: FrameworkName
    var complianceType: js.UndefOr[ComplianceType]
    var description: js.UndefOr[FrameworkDescription]
  }

  object UpdateAssessmentFrameworkRequest {
    @inline
    def apply(
        controlSets: UpdateAssessmentFrameworkControlSets,
        frameworkId: UUID,
        name: FrameworkName,
        complianceType: js.UndefOr[ComplianceType] = js.undefined,
        description: js.UndefOr[FrameworkDescription] = js.undefined
    ): UpdateAssessmentFrameworkRequest = {
      val __obj = js.Dynamic.literal(
        "controlSets" -> controlSets.asInstanceOf[js.Any],
        "frameworkId" -> frameworkId.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any]
      )

      complianceType.foreach(__v => __obj.updateDynamic("complianceType")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateAssessmentFrameworkRequest]
    }
  }

  @js.native
  trait UpdateAssessmentFrameworkResponse extends js.Object {
    var framework: js.UndefOr[Framework]
  }

  object UpdateAssessmentFrameworkResponse {
    @inline
    def apply(
        framework: js.UndefOr[Framework] = js.undefined
    ): UpdateAssessmentFrameworkResponse = {
      val __obj = js.Dynamic.literal()
      framework.foreach(__v => __obj.updateDynamic("framework")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateAssessmentFrameworkResponse]
    }
  }

  @js.native
  trait UpdateAssessmentFrameworkShareRequest extends js.Object {
    var action: ShareRequestAction
    var requestId: UUID
    var requestType: ShareRequestType
  }

  object UpdateAssessmentFrameworkShareRequest {
    @inline
    def apply(
        action: ShareRequestAction,
        requestId: UUID,
        requestType: ShareRequestType
    ): UpdateAssessmentFrameworkShareRequest = {
      val __obj = js.Dynamic.literal(
        "action" -> action.asInstanceOf[js.Any],
        "requestId" -> requestId.asInstanceOf[js.Any],
        "requestType" -> requestType.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateAssessmentFrameworkShareRequest]
    }
  }

  @js.native
  trait UpdateAssessmentFrameworkShareResponse extends js.Object {
    var assessmentFrameworkShareRequest: js.UndefOr[AssessmentFrameworkShareRequest]
  }

  object UpdateAssessmentFrameworkShareResponse {
    @inline
    def apply(
        assessmentFrameworkShareRequest: js.UndefOr[AssessmentFrameworkShareRequest] = js.undefined
    ): UpdateAssessmentFrameworkShareResponse = {
      val __obj = js.Dynamic.literal()
      assessmentFrameworkShareRequest.foreach(__v => __obj.updateDynamic("assessmentFrameworkShareRequest")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateAssessmentFrameworkShareResponse]
    }
  }

  @js.native
  trait UpdateAssessmentRequest extends js.Object {
    var assessmentId: UUID
    var scope: Scope
    var assessmentDescription: js.UndefOr[AssessmentDescription]
    var assessmentName: js.UndefOr[AssessmentName]
    var assessmentReportsDestination: js.UndefOr[AssessmentReportsDestination]
    var roles: js.UndefOr[Roles]
  }

  object UpdateAssessmentRequest {
    @inline
    def apply(
        assessmentId: UUID,
        scope: Scope,
        assessmentDescription: js.UndefOr[AssessmentDescription] = js.undefined,
        assessmentName: js.UndefOr[AssessmentName] = js.undefined,
        assessmentReportsDestination: js.UndefOr[AssessmentReportsDestination] = js.undefined,
        roles: js.UndefOr[Roles] = js.undefined
    ): UpdateAssessmentRequest = {
      val __obj = js.Dynamic.literal(
        "assessmentId" -> assessmentId.asInstanceOf[js.Any],
        "scope" -> scope.asInstanceOf[js.Any]
      )

      assessmentDescription.foreach(__v => __obj.updateDynamic("assessmentDescription")(__v.asInstanceOf[js.Any]))
      assessmentName.foreach(__v => __obj.updateDynamic("assessmentName")(__v.asInstanceOf[js.Any]))
      assessmentReportsDestination.foreach(__v => __obj.updateDynamic("assessmentReportsDestination")(__v.asInstanceOf[js.Any]))
      roles.foreach(__v => __obj.updateDynamic("roles")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateAssessmentRequest]
    }
  }

  @js.native
  trait UpdateAssessmentResponse extends js.Object {
    var assessment: js.UndefOr[Assessment]
  }

  object UpdateAssessmentResponse {
    @inline
    def apply(
        assessment: js.UndefOr[Assessment] = js.undefined
    ): UpdateAssessmentResponse = {
      val __obj = js.Dynamic.literal()
      assessment.foreach(__v => __obj.updateDynamic("assessment")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateAssessmentResponse]
    }
  }

  @js.native
  trait UpdateAssessmentStatusRequest extends js.Object {
    var assessmentId: UUID
    var status: AssessmentStatus
  }

  object UpdateAssessmentStatusRequest {
    @inline
    def apply(
        assessmentId: UUID,
        status: AssessmentStatus
    ): UpdateAssessmentStatusRequest = {
      val __obj = js.Dynamic.literal(
        "assessmentId" -> assessmentId.asInstanceOf[js.Any],
        "status" -> status.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateAssessmentStatusRequest]
    }
  }

  @js.native
  trait UpdateAssessmentStatusResponse extends js.Object {
    var assessment: js.UndefOr[Assessment]
  }

  object UpdateAssessmentStatusResponse {
    @inline
    def apply(
        assessment: js.UndefOr[Assessment] = js.undefined
    ): UpdateAssessmentStatusResponse = {
      val __obj = js.Dynamic.literal()
      assessment.foreach(__v => __obj.updateDynamic("assessment")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateAssessmentStatusResponse]
    }
  }

  @js.native
  trait UpdateControlRequest extends js.Object {
    var controlId: UUID
    var controlMappingSources: ControlMappingSources
    var name: ControlName
    var actionPlanInstructions: js.UndefOr[ActionPlanInstructions]
    var actionPlanTitle: js.UndefOr[ActionPlanTitle]
    var description: js.UndefOr[ControlDescription]
    var testingInformation: js.UndefOr[TestingInformation]
  }

  object UpdateControlRequest {
    @inline
    def apply(
        controlId: UUID,
        controlMappingSources: ControlMappingSources,
        name: ControlName,
        actionPlanInstructions: js.UndefOr[ActionPlanInstructions] = js.undefined,
        actionPlanTitle: js.UndefOr[ActionPlanTitle] = js.undefined,
        description: js.UndefOr[ControlDescription] = js.undefined,
        testingInformation: js.UndefOr[TestingInformation] = js.undefined
    ): UpdateControlRequest = {
      val __obj = js.Dynamic.literal(
        "controlId" -> controlId.asInstanceOf[js.Any],
        "controlMappingSources" -> controlMappingSources.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any]
      )

      actionPlanInstructions.foreach(__v => __obj.updateDynamic("actionPlanInstructions")(__v.asInstanceOf[js.Any]))
      actionPlanTitle.foreach(__v => __obj.updateDynamic("actionPlanTitle")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      testingInformation.foreach(__v => __obj.updateDynamic("testingInformation")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateControlRequest]
    }
  }

  @js.native
  trait UpdateControlResponse extends js.Object {
    var control: js.UndefOr[Control]
  }

  object UpdateControlResponse {
    @inline
    def apply(
        control: js.UndefOr[Control] = js.undefined
    ): UpdateControlResponse = {
      val __obj = js.Dynamic.literal()
      control.foreach(__v => __obj.updateDynamic("control")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateControlResponse]
    }
  }

  @js.native
  trait UpdateSettingsRequest extends js.Object {
    var defaultAssessmentReportsDestination: js.UndefOr[AssessmentReportsDestination]
    var defaultProcessOwners: js.UndefOr[Roles]
    var kmsKey: js.UndefOr[KmsKey]
    var snsTopic: js.UndefOr[SnsArn]
  }

  object UpdateSettingsRequest {
    @inline
    def apply(
        defaultAssessmentReportsDestination: js.UndefOr[AssessmentReportsDestination] = js.undefined,
        defaultProcessOwners: js.UndefOr[Roles] = js.undefined,
        kmsKey: js.UndefOr[KmsKey] = js.undefined,
        snsTopic: js.UndefOr[SnsArn] = js.undefined
    ): UpdateSettingsRequest = {
      val __obj = js.Dynamic.literal()
      defaultAssessmentReportsDestination.foreach(__v => __obj.updateDynamic("defaultAssessmentReportsDestination")(__v.asInstanceOf[js.Any]))
      defaultProcessOwners.foreach(__v => __obj.updateDynamic("defaultProcessOwners")(__v.asInstanceOf[js.Any]))
      kmsKey.foreach(__v => __obj.updateDynamic("kmsKey")(__v.asInstanceOf[js.Any]))
      snsTopic.foreach(__v => __obj.updateDynamic("snsTopic")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateSettingsRequest]
    }
  }

  @js.native
  trait UpdateSettingsResponse extends js.Object {
    var settings: js.UndefOr[Settings]
  }

  object UpdateSettingsResponse {
    @inline
    def apply(
        settings: js.UndefOr[Settings] = js.undefined
    ): UpdateSettingsResponse = {
      val __obj = js.Dynamic.literal()
      settings.foreach(__v => __obj.updateDynamic("settings")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateSettingsResponse]
    }
  }

  @js.native
  trait ValidateAssessmentReportIntegrityRequest extends js.Object {
    var s3RelativePath: S3Url
  }

  object ValidateAssessmentReportIntegrityRequest {
    @inline
    def apply(
        s3RelativePath: S3Url
    ): ValidateAssessmentReportIntegrityRequest = {
      val __obj = js.Dynamic.literal(
        "s3RelativePath" -> s3RelativePath.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ValidateAssessmentReportIntegrityRequest]
    }
  }

  @js.native
  trait ValidateAssessmentReportIntegrityResponse extends js.Object {
    var signatureAlgorithm: js.UndefOr[String]
    var signatureDateTime: js.UndefOr[String]
    var signatureKeyId: js.UndefOr[String]
    var signatureValid: js.UndefOr[Boolean]
    var validationErrors: js.UndefOr[ValidationErrors]
  }

  object ValidateAssessmentReportIntegrityResponse {
    @inline
    def apply(
        signatureAlgorithm: js.UndefOr[String] = js.undefined,
        signatureDateTime: js.UndefOr[String] = js.undefined,
        signatureKeyId: js.UndefOr[String] = js.undefined,
        signatureValid: js.UndefOr[Boolean] = js.undefined,
        validationErrors: js.UndefOr[ValidationErrors] = js.undefined
    ): ValidateAssessmentReportIntegrityResponse = {
      val __obj = js.Dynamic.literal()
      signatureAlgorithm.foreach(__v => __obj.updateDynamic("signatureAlgorithm")(__v.asInstanceOf[js.Any]))
      signatureDateTime.foreach(__v => __obj.updateDynamic("signatureDateTime")(__v.asInstanceOf[js.Any]))
      signatureKeyId.foreach(__v => __obj.updateDynamic("signatureKeyId")(__v.asInstanceOf[js.Any]))
      signatureValid.foreach(__v => __obj.updateDynamic("signatureValid")(__v.asInstanceOf[js.Any]))
      validationErrors.foreach(__v => __obj.updateDynamic("validationErrors")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ValidateAssessmentReportIntegrityResponse]
    }
  }
}
