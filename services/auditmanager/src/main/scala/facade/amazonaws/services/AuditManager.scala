package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
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
  type Resources = js.Array[Resource]
  type Roles = js.Array[Role]
  type S3Url = String
  type SNSTopic = String
  type ServiceMetadataList = js.Array[ServiceMetadata]
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

  implicit final class AuditManagerOps(private val service: AuditManager) extends AnyVal {

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
    @inline def getOrganizationAdminAccountFuture(params: GetOrganizationAdminAccountRequest): Future[GetOrganizationAdminAccountResponse] = service.getOrganizationAdminAccount(params).promise().toFuture
    @inline def getServicesInScopeFuture(params: GetServicesInScopeRequest): Future[GetServicesInScopeResponse] = service.getServicesInScope(params).promise().toFuture
    @inline def getSettingsFuture(params: GetSettingsRequest): Future[GetSettingsResponse] = service.getSettings(params).promise().toFuture
    @inline def listAssessmentFrameworksFuture(params: ListAssessmentFrameworksRequest): Future[ListAssessmentFrameworksResponse] = service.listAssessmentFrameworks(params).promise().toFuture
    @inline def listAssessmentReportsFuture(params: ListAssessmentReportsRequest): Future[ListAssessmentReportsResponse] = service.listAssessmentReports(params).promise().toFuture
    @inline def listAssessmentsFuture(params: ListAssessmentsRequest): Future[ListAssessmentsResponse] = service.listAssessments(params).promise().toFuture
    @inline def listControlsFuture(params: ListControlsRequest): Future[ListControlsResponse] = service.listControls(params).promise().toFuture
    @inline def listKeywordsForDataSourceFuture(params: ListKeywordsForDataSourceRequest): Future[ListKeywordsForDataSourceResponse] = service.listKeywordsForDataSource(params).promise().toFuture
    @inline def listNotificationsFuture(params: ListNotificationsRequest): Future[ListNotificationsResponse] = service.listNotifications(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] = service.listTagsForResource(params).promise().toFuture
    @inline def registerAccountFuture(params: RegisterAccountRequest): Future[RegisterAccountResponse] = service.registerAccount(params).promise().toFuture
    @inline def registerOrganizationAdminAccountFuture(params: RegisterOrganizationAdminAccountRequest): Future[RegisterOrganizationAdminAccountResponse] = service.registerOrganizationAdminAccount(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] = service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] = service.untagResource(params).promise().toFuture
    @inline def updateAssessmentControlFuture(params: UpdateAssessmentControlRequest): Future[UpdateAssessmentControlResponse] = service.updateAssessmentControl(params).promise().toFuture
    @inline def updateAssessmentControlSetStatusFuture(params: UpdateAssessmentControlSetStatusRequest): Future[UpdateAssessmentControlSetStatusResponse] = service.updateAssessmentControlSetStatus(params).promise().toFuture
    @inline def updateAssessmentFrameworkFuture(params: UpdateAssessmentFrameworkRequest): Future[UpdateAssessmentFrameworkResponse] = service.updateAssessmentFramework(params).promise().toFuture
    @inline def updateAssessmentFuture(params: UpdateAssessmentRequest): Future[UpdateAssessmentResponse] = service.updateAssessment(params).promise().toFuture
    @inline def updateAssessmentStatusFuture(params: UpdateAssessmentStatusRequest): Future[UpdateAssessmentStatusResponse] = service.updateAssessmentStatus(params).promise().toFuture
    @inline def updateControlFuture(params: UpdateControlRequest): Future[UpdateControlResponse] = service.updateControl(params).promise().toFuture
    @inline def updateSettingsFuture(params: UpdateSettingsRequest): Future[UpdateSettingsResponse] = service.updateSettings(params).promise().toFuture
    @inline def validateAssessmentReportIntegrityFuture(params: ValidateAssessmentReportIntegrityRequest): Future[ValidateAssessmentReportIntegrityResponse] = service.validateAssessmentReportIntegrity(params).promise().toFuture

  }
}

package auditmanager {
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
    def getOrganizationAdminAccount(params: GetOrganizationAdminAccountRequest): Request[GetOrganizationAdminAccountResponse] = js.native
    def getServicesInScope(params: GetServicesInScopeRequest): Request[GetServicesInScopeResponse] = js.native
    def getSettings(params: GetSettingsRequest): Request[GetSettingsResponse] = js.native
    def listAssessmentFrameworks(params: ListAssessmentFrameworksRequest): Request[ListAssessmentFrameworksResponse] = js.native
    def listAssessmentReports(params: ListAssessmentReportsRequest): Request[ListAssessmentReportsResponse] = js.native
    def listAssessments(params: ListAssessmentsRequest): Request[ListAssessmentsResponse] = js.native
    def listControls(params: ListControlsRequest): Request[ListControlsResponse] = js.native
    def listKeywordsForDataSource(params: ListKeywordsForDataSourceRequest): Request[ListKeywordsForDataSourceResponse] = js.native
    def listNotifications(params: ListNotificationsRequest): Request[ListNotificationsResponse] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def registerAccount(params: RegisterAccountRequest): Request[RegisterAccountResponse] = js.native
    def registerOrganizationAdminAccount(params: RegisterOrganizationAdminAccountRequest): Request[RegisterOrganizationAdminAccountResponse] = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse] = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse] = js.native
    def updateAssessment(params: UpdateAssessmentRequest): Request[UpdateAssessmentResponse] = js.native
    def updateAssessmentControl(params: UpdateAssessmentControlRequest): Request[UpdateAssessmentControlResponse] = js.native
    def updateAssessmentControlSetStatus(params: UpdateAssessmentControlSetStatusRequest): Request[UpdateAssessmentControlSetStatusResponse] = js.native
    def updateAssessmentFramework(params: UpdateAssessmentFrameworkRequest): Request[UpdateAssessmentFrameworkResponse] = js.native
    def updateAssessmentStatus(params: UpdateAssessmentStatusRequest): Request[UpdateAssessmentStatusResponse] = js.native
    def updateControl(params: UpdateControlRequest): Request[UpdateControlResponse] = js.native
    def updateSettings(params: UpdateSettingsRequest): Request[UpdateSettingsResponse] = js.native
    def validateAssessmentReportIntegrity(params: ValidateAssessmentReportIntegrityRequest): Request[ValidateAssessmentReportIntegrityResponse] = js.native
  }

  /** The wrapper of AWS account details, such as account ID, email address, and so on.
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

  /** An AWS service such as Amazon S3, AWS CloudTrail, and so on.
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

  @js.native
  sealed trait AccountStatus extends js.Any
  object AccountStatus {
    val ACTIVE = "ACTIVE".asInstanceOf[AccountStatus]
    val INACTIVE = "INACTIVE".asInstanceOf[AccountStatus]
    val PENDING_ACTIVATION = "PENDING_ACTIVATION".asInstanceOf[AccountStatus]

    @inline def values = js.Array(ACTIVE, INACTIVE, PENDING_ACTIVATION)
  }

  @js.native
  sealed trait ActionEnum extends js.Any
  object ActionEnum {
    val CREATE = "CREATE".asInstanceOf[ActionEnum]
    val UPDATE_METADATA = "UPDATE_METADATA".asInstanceOf[ActionEnum]
    val ACTIVE = "ACTIVE".asInstanceOf[ActionEnum]
    val INACTIVE = "INACTIVE".asInstanceOf[ActionEnum]
    val DELETE = "DELETE".asInstanceOf[ActionEnum]
    val UNDER_REVIEW = "UNDER_REVIEW".asInstanceOf[ActionEnum]
    val REVIEWED = "REVIEWED".asInstanceOf[ActionEnum]
    val IMPORT_EVIDENCE = "IMPORT_EVIDENCE".asInstanceOf[ActionEnum]

    @inline def values = js.Array(CREATE, UPDATE_METADATA, ACTIVE, INACTIVE, DELETE, UNDER_REVIEW, REVIEWED, IMPORT_EVIDENCE)
  }

  /** An entity that defines the scope of audit evidence collected by AWS Audit Manager. An AWS Audit Manager assessment is an implementation of an AWS Audit Manager framework.
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

  /** The control entity that represents a standard or custom control used in an AWS Audit Manager assessment.
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

  /** Represents a set of controls in an AWS Audit Manager assessment.
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

  /** The folder in which AWS Audit Manager stores evidence for an assessment.
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

  /** The file used to structure and automate AWS Audit Manager assessments for a given compliance standard.
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

  /** The metadata associated with a standard or custom framework.
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

  /** The metadata associated with the specified assessment.
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

  /** A metadata object associated with an assessment in AWS Audit Manager.
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

  /** A finalized document generated from an AWS Audit Manager assessment. These reports summarize the relevant evidence collected for your audit, and link to the relevant evidence folders which are named and organized according to the controls specified in your assessment.
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

  @js.native
  sealed trait AssessmentReportDestinationType extends js.Any
  object AssessmentReportDestinationType {
    val S3 = "S3".asInstanceOf[AssessmentReportDestinationType]

    @inline def values = js.Array(S3)
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

  /** The metadata objects associated with the specified assessment report.
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

  @js.native
  sealed trait AssessmentReportStatus extends js.Any
  object AssessmentReportStatus {
    val COMPLETE = "COMPLETE".asInstanceOf[AssessmentReportStatus]
    val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[AssessmentReportStatus]
    val FAILED = "FAILED".asInstanceOf[AssessmentReportStatus]

    @inline def values = js.Array(COMPLETE, IN_PROGRESS, FAILED)
  }

  /** The location in which AWS Audit Manager saves assessment reports for the given assessment.
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
  sealed trait AssessmentStatus extends js.Any
  object AssessmentStatus {
    val ACTIVE = "ACTIVE".asInstanceOf[AssessmentStatus]
    val INACTIVE = "INACTIVE".asInstanceOf[AssessmentStatus]

    @inline def values = js.Array(ACTIVE, INACTIVE)
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

  /** The record of a change within AWS Audit Manager, such as a modified assessment, a delegated control set, and so on.
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

  /** A control in AWS Audit Manager.
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

  /** A comment posted by a user on a control. This includes the author's name, the comment text, and a timestamp.
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

  /** The data source that determines from where AWS Audit Manager collects evidence for the control.
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

  /** The metadata associated with the specified standard or custom control.
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

  @js.native
  sealed trait ControlResponse extends js.Any
  object ControlResponse {
    val MANUAL = "MANUAL".asInstanceOf[ControlResponse]
    val AUTOMATE = "AUTOMATE".asInstanceOf[ControlResponse]
    val DEFER = "DEFER".asInstanceOf[ControlResponse]
    val IGNORE = "IGNORE".asInstanceOf[ControlResponse]

    @inline def values = js.Array(MANUAL, AUTOMATE, DEFER, IGNORE)
  }

  /** A set of controls in AWS Audit Manager.
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

  @js.native
  sealed trait ControlSetStatus extends js.Any
  object ControlSetStatus {
    val ACTIVE = "ACTIVE".asInstanceOf[ControlSetStatus]
    val UNDER_REVIEW = "UNDER_REVIEW".asInstanceOf[ControlSetStatus]
    val REVIEWED = "REVIEWED".asInstanceOf[ControlSetStatus]

    @inline def values = js.Array(ACTIVE, UNDER_REVIEW, REVIEWED)
  }

  @js.native
  sealed trait ControlStatus extends js.Any
  object ControlStatus {
    val UNDER_REVIEW = "UNDER_REVIEW".asInstanceOf[ControlStatus]
    val REVIEWED = "REVIEWED".asInstanceOf[ControlStatus]
    val INACTIVE = "INACTIVE".asInstanceOf[ControlStatus]

    @inline def values = js.Array(UNDER_REVIEW, REVIEWED, INACTIVE)
  }

  @js.native
  sealed trait ControlType extends js.Any
  object ControlType {
    val Standard = "Standard".asInstanceOf[ControlType]
    val Custom = "Custom".asInstanceOf[ControlType]

    @inline def values = js.Array(Standard, Custom)
  }

  /** Control entity attributes that uniquely identify an existing control to be added to a framework in AWS Audit Manager.
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

  /** A <code>controlSet</code> entity that represents a collection of controls in AWS Audit Manager. This does not contain the control set ID.
    */
  @js.native
  trait CreateAssessmentFrameworkControlSet extends js.Object {
    var controls: js.UndefOr[CreateAssessmentFrameworkControls]
    var name: js.UndefOr[ControlSetName]
  }

  object CreateAssessmentFrameworkControlSet {
    @inline
    def apply(
        controls: js.UndefOr[CreateAssessmentFrameworkControls] = js.undefined,
        name: js.UndefOr[ControlSetName] = js.undefined
    ): CreateAssessmentFrameworkControlSet = {
      val __obj = js.Dynamic.literal()
      controls.foreach(__v => __obj.updateDynamic("controls")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
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

  /** Control mapping fields that represent the source for evidence collection, along with related parameters and metadata. This does not contain <code>mappingID</code>.
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

  /** A collection of attributes used to create a delegation for an assessment in AWS Audit Manager.
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

  /** The metadata associated with the specified delegation.
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
  sealed trait DelegationStatus extends js.Any
  object DelegationStatus {
    val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[DelegationStatus]
    val UNDER_REVIEW = "UNDER_REVIEW".asInstanceOf[DelegationStatus]
    val COMPLETE = "COMPLETE".asInstanceOf[DelegationStatus]

    @inline def values = js.Array(IN_PROGRESS, UNDER_REVIEW, COMPLETE)
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

  /** The file used to structure and automate AWS Audit Manager assessments for a given compliance standard.
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

  /** The metadata of a framework, such as the name, ID, description, and so on.
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
  sealed trait FrameworkType extends js.Any
  object FrameworkType {
    val Standard = "Standard".asInstanceOf[FrameworkType]
    val Custom = "Custom".asInstanceOf[FrameworkType]

    @inline def values = js.Array(Standard, Custom)
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
  }

  object GetAssessmentResponse {
    @inline
    def apply(
        assessment: js.UndefOr[Assessment] = js.undefined
    ): GetAssessmentResponse = {
      val __obj = js.Dynamic.literal()
      assessment.foreach(__v => __obj.updateDynamic("assessment")(__v.asInstanceOf[js.Any]))
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

  @js.native
  sealed trait KeywordInputType extends js.Any
  object KeywordInputType {
    val SELECT_FROM_LIST = "SELECT_FROM_LIST".asInstanceOf[KeywordInputType]

    @inline def values = js.Array(SELECT_FROM_LIST)
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
  }

  object ListAssessmentsRequest {
    @inline
    def apply(
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[Token] = js.undefined
    ): ListAssessmentsRequest = {
      val __obj = js.Dynamic.literal()
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
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

  /** Evidence that is uploaded to AWS Audit Manager manually.
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

  /** The notification used to inform a user of an update in AWS Audit Manager. For example, this includes the notification that is sent when a control set is delegated for review.
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
  sealed trait ObjectTypeEnum extends js.Any
  object ObjectTypeEnum {
    val ASSESSMENT = "ASSESSMENT".asInstanceOf[ObjectTypeEnum]
    val CONTROL_SET = "CONTROL_SET".asInstanceOf[ObjectTypeEnum]
    val CONTROL = "CONTROL".asInstanceOf[ObjectTypeEnum]
    val DELEGATION = "DELEGATION".asInstanceOf[ObjectTypeEnum]
    val ASSESSMENT_REPORT = "ASSESSMENT_REPORT".asInstanceOf[ObjectTypeEnum]

    @inline def values = js.Array(ASSESSMENT, CONTROL_SET, CONTROL, DELEGATION, ASSESSMENT_REPORT)
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

  /** A system asset that is evaluated in an AWS Audit Manager assessment.
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

  /** The wrapper that contains AWS Audit Manager role information, such as the role type and IAM Amazon Resource Name (ARN).
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

  @js.native
  sealed trait RoleType extends js.Any
  object RoleType {
    val PROCESS_OWNER = "PROCESS_OWNER".asInstanceOf[RoleType]
    val RESOURCE_OWNER = "RESOURCE_OWNER".asInstanceOf[RoleType]

    @inline def values = js.Array(PROCESS_OWNER, RESOURCE_OWNER)
  }

  /** The wrapper that contains the AWS accounts and AWS services in scope for the assessment.
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

  /** The metadata associated with the specified AWS service.
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

  @js.native
  sealed trait SettingAttribute extends js.Any
  object SettingAttribute {
    val ALL = "ALL".asInstanceOf[SettingAttribute]
    val IS_AWS_ORG_ENABLED = "IS_AWS_ORG_ENABLED".asInstanceOf[SettingAttribute]
    val SNS_TOPIC = "SNS_TOPIC".asInstanceOf[SettingAttribute]
    val DEFAULT_ASSESSMENT_REPORTS_DESTINATION = "DEFAULT_ASSESSMENT_REPORTS_DESTINATION".asInstanceOf[SettingAttribute]
    val DEFAULT_PROCESS_OWNERS = "DEFAULT_PROCESS_OWNERS".asInstanceOf[SettingAttribute]

    @inline def values = js.Array(ALL, IS_AWS_ORG_ENABLED, SNS_TOPIC, DEFAULT_ASSESSMENT_REPORTS_DESTINATION, DEFAULT_PROCESS_OWNERS)
  }

  /** The settings object that holds all supported AWS Audit Manager settings.
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

  @js.native
  sealed trait SourceFrequency extends js.Any
  object SourceFrequency {
    val DAILY = "DAILY".asInstanceOf[SourceFrequency]
    val WEEKLY = "WEEKLY".asInstanceOf[SourceFrequency]
    val MONTHLY = "MONTHLY".asInstanceOf[SourceFrequency]

    @inline def values = js.Array(DAILY, WEEKLY, MONTHLY)
  }

  /** The keyword to search for in AWS CloudTrail logs.
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
  sealed trait SourceSetUpOption extends js.Any
  object SourceSetUpOption {
    val System_Controls_Mapping = "System_Controls_Mapping".asInstanceOf[SourceSetUpOption]
    val Procedural_Controls_Mapping = "Procedural_Controls_Mapping".asInstanceOf[SourceSetUpOption]

    @inline def values = js.Array(System_Controls_Mapping, Procedural_Controls_Mapping)
  }

  @js.native
  sealed trait SourceType extends js.Any
  object SourceType {
    val AWS_Cloudtrail = "AWS_Cloudtrail".asInstanceOf[SourceType]
    val AWS_Config = "AWS_Config".asInstanceOf[SourceType]
    val AWS_Security_Hub = "AWS_Security_Hub".asInstanceOf[SourceType]
    val AWS_API_Call = "AWS_API_Call".asInstanceOf[SourceType]
    val MANUAL = "MANUAL".asInstanceOf[SourceType]

    @inline def values = js.Array(AWS_Cloudtrail, AWS_Config, AWS_Security_Hub, AWS_API_Call, MANUAL)
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

  /** A uniform resource locator, used as a unique identifier to locate a resource on the internet.
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

  /** A <code>controlSet</code> entity that represents a collection of controls in AWS Audit Manager. This does not contain the control set ID.
    */
  @js.native
  trait UpdateAssessmentFrameworkControlSet extends js.Object {
    var controls: js.UndefOr[CreateAssessmentFrameworkControls]
    var id: js.UndefOr[UUID]
    var name: js.UndefOr[ControlSetName]
  }

  object UpdateAssessmentFrameworkControlSet {
    @inline
    def apply(
        controls: js.UndefOr[CreateAssessmentFrameworkControls] = js.undefined,
        id: js.UndefOr[UUID] = js.undefined,
        name: js.UndefOr[ControlSetName] = js.undefined
    ): UpdateAssessmentFrameworkControlSet = {
      val __obj = js.Dynamic.literal()
      controls.foreach(__v => __obj.updateDynamic("controls")(__v.asInstanceOf[js.Any]))
      id.foreach(__v => __obj.updateDynamic("id")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
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
