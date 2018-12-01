package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import io.scalajs.nodejs
import facade.amazonaws._

package object securityhub {
  type AccountDetailsList = js.Array[AccountDetails]
  type AccountId = String
  type AccountIdList = js.Array[NonEmptyString]
  type ArnList = js.Array[NonEmptyString]
  type AwsIamAccessKeyStatus = String
  type AwsSecurityFindingList = js.Array[AwsSecurityFinding]
  type ComplianceStatus = String
  type DateFilterList = js.Array[DateFilter]
  type DateRangeUnit = String
  type FieldMap = js.Dictionary[NonEmptyString]
  type ImportFindingsErrorList = js.Array[ImportFindingsError]
  type InsightList = js.Array[Insight]
  type InsightResultValueList = js.Array[InsightResultValue]
  type InvitationList = js.Array[Invitation]
  type IpFilterList = js.Array[IpFilter]
  type KeywordFilterList = js.Array[KeywordFilter]
  type MalwareList = js.Array[Malware]
  type MalwareState = String
  type MalwareType = String
  type MapFilterComparison = String
  type MapFilterList = js.Array[MapFilter]
  type MaxResults = Int
  type MemberList = js.Array[Member]
  type NetworkDirection = String
  type NextToken = String
  type NonEmptyString = String
  type NumberFilterList = js.Array[NumberFilter]
  type Partition = String
  type ProductSubscriptionArnList = js.Array[NonEmptyString]
  type RecordState = String
  type RelatedFindingList = js.Array[RelatedFinding]
  type ResourceList = js.Array[Resource]
  type ResultList = js.Array[Result]
  type SortCriteria = js.Array[SortCriterion]
  type SortOrder = String
  type StandardsInputParameterMap = js.Dictionary[NonEmptyString]
  type StandardsStatus = String
  type StandardsSubscriptionArns = js.Array[NonEmptyString]
  type StandardsSubscriptionRequests = js.Array[StandardsSubscriptionRequest]
  type StandardsSubscriptions = js.Array[StandardsSubscription]
  type StringFilterComparison = String
  type StringFilterList = js.Array[StringFilter]
  type StringList = js.Array[NonEmptyString]
  type ThreatIntelIndicatorCategory = String
  type ThreatIntelIndicatorList = js.Array[ThreatIntelIndicator]
  type ThreatIntelIndicatorType = String
  type Timestamp = js.Date
  type TypeList = js.Array[NonEmptyString]
  type VerificationState = String
  type WorkflowState = String
}

package securityhub {
  @js.native
  @JSImport("aws-sdk", "SecurityHub")
  class SecurityHub(config: AWSConfig) extends js.Object {
    def acceptInvitation(params: AcceptInvitationRequest): Request[AcceptInvitationResponse] = js.native
    def batchDisableStandards(params: BatchDisableStandardsRequest): Request[BatchDisableStandardsResponse] = js.native
    def batchEnableStandards(params: BatchEnableStandardsRequest): Request[BatchEnableStandardsResponse] = js.native
    def batchImportFindings(params: BatchImportFindingsRequest): Request[BatchImportFindingsResponse] = js.native
    def createInsight(params: CreateInsightRequest): Request[CreateInsightResponse] = js.native
    def createMembers(params: CreateMembersRequest): Request[CreateMembersResponse] = js.native
    def declineInvitations(params: DeclineInvitationsRequest): Request[DeclineInvitationsResponse] = js.native
    def deleteInsight(params: DeleteInsightRequest): Request[DeleteInsightResponse] = js.native
    def deleteInvitations(params: DeleteInvitationsRequest): Request[DeleteInvitationsResponse] = js.native
    def deleteMembers(params: DeleteMembersRequest): Request[DeleteMembersResponse] = js.native
    def disableImportFindingsForProduct(params: DisableImportFindingsForProductRequest): Request[DisableImportFindingsForProductResponse] = js.native
    def disableSecurityHub(params: DisableSecurityHubRequest): Request[DisableSecurityHubResponse] = js.native
    def disassociateFromMasterAccount(params: DisassociateFromMasterAccountRequest): Request[DisassociateFromMasterAccountResponse] = js.native
    def disassociateMembers(params: DisassociateMembersRequest): Request[DisassociateMembersResponse] = js.native
    def enableImportFindingsForProduct(params: EnableImportFindingsForProductRequest): Request[EnableImportFindingsForProductResponse] = js.native
    def enableSecurityHub(params: EnableSecurityHubRequest): Request[EnableSecurityHubResponse] = js.native
    def getEnabledStandards(params: GetEnabledStandardsRequest): Request[GetEnabledStandardsResponse] = js.native
    def getFindings(params: GetFindingsRequest): Request[GetFindingsResponse] = js.native
    def getInsightResults(params: GetInsightResultsRequest): Request[GetInsightResultsResponse] = js.native
    def getInsights(params: GetInsightsRequest): Request[GetInsightsResponse] = js.native
    def getInvitationsCount(params: GetInvitationsCountRequest): Request[GetInvitationsCountResponse] = js.native
    def getMasterAccount(params: GetMasterAccountRequest): Request[GetMasterAccountResponse] = js.native
    def getMembers(params: GetMembersRequest): Request[GetMembersResponse] = js.native
    def inviteMembers(params: InviteMembersRequest): Request[InviteMembersResponse] = js.native
    def listEnabledProductsForImport(params: ListEnabledProductsForImportRequest): Request[ListEnabledProductsForImportResponse] = js.native
    def listInvitations(params: ListInvitationsRequest): Request[ListInvitationsResponse] = js.native
    def listMembers(params: ListMembersRequest): Request[ListMembersResponse] = js.native
    def updateFindings(params: UpdateFindingsRequest): Request[UpdateFindingsResponse] = js.native
    def updateInsight(params: UpdateInsightRequest): Request[UpdateInsightResponse] = js.native
  }

  @js.native
  trait AcceptInvitationRequest extends js.Object {
    var MasterId: js.UndefOr[NonEmptyString]
    var InvitationId: js.UndefOr[NonEmptyString]
  }

  object AcceptInvitationRequest {
    def apply(
      MasterId: js.UndefOr[NonEmptyString] = js.undefined,
      InvitationId: js.UndefOr[NonEmptyString] = js.undefined): AcceptInvitationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MasterId" -> MasterId.map { x => x.asInstanceOf[js.Any] },
        "InvitationId" -> InvitationId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AcceptInvitationRequest]
    }
  }

  @js.native
  trait AcceptInvitationResponse extends js.Object {

  }

  object AcceptInvitationResponse {
    def apply(): AcceptInvitationResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AcceptInvitationResponse]
    }
  }

  /**
   * <p>The details of an AWS account.</p>
   */
  @js.native
  trait AccountDetails extends js.Object {
    var AccountId: js.UndefOr[AccountId]
    var Email: js.UndefOr[NonEmptyString]
  }

  object AccountDetails {
    def apply(
      AccountId: js.UndefOr[AccountId] = js.undefined,
      Email: js.UndefOr[NonEmptyString] = js.undefined): AccountDetails = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AccountId" -> AccountId.map { x => x.asInstanceOf[js.Any] },
        "Email" -> Email.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AccountDetails]
    }
  }

  /**
   * <p>The details of an AWS EC2 instance.</p>
   */
  @js.native
  trait AwsEc2InstanceDetails extends js.Object {
    var IamInstanceProfileArn: js.UndefOr[NonEmptyString]
    var IpV4Addresses: js.UndefOr[StringList]
    var ImageId: js.UndefOr[NonEmptyString]
    var KeyName: js.UndefOr[NonEmptyString]
    var LaunchedAt: js.UndefOr[NonEmptyString]
    var IpV6Addresses: js.UndefOr[StringList]
    var Type: js.UndefOr[NonEmptyString]
    var VpcId: js.UndefOr[NonEmptyString]
    var SubnetId: js.UndefOr[NonEmptyString]
  }

  object AwsEc2InstanceDetails {
    def apply(
      IamInstanceProfileArn: js.UndefOr[NonEmptyString] = js.undefined,
      IpV4Addresses: js.UndefOr[StringList] = js.undefined,
      ImageId: js.UndefOr[NonEmptyString] = js.undefined,
      KeyName: js.UndefOr[NonEmptyString] = js.undefined,
      LaunchedAt: js.UndefOr[NonEmptyString] = js.undefined,
      IpV6Addresses: js.UndefOr[StringList] = js.undefined,
      Type: js.UndefOr[NonEmptyString] = js.undefined,
      VpcId: js.UndefOr[NonEmptyString] = js.undefined,
      SubnetId: js.UndefOr[NonEmptyString] = js.undefined): AwsEc2InstanceDetails = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IamInstanceProfileArn" -> IamInstanceProfileArn.map { x => x.asInstanceOf[js.Any] },
        "IpV4Addresses" -> IpV4Addresses.map { x => x.asInstanceOf[js.Any] },
        "ImageId" -> ImageId.map { x => x.asInstanceOf[js.Any] },
        "KeyName" -> KeyName.map { x => x.asInstanceOf[js.Any] },
        "LaunchedAt" -> LaunchedAt.map { x => x.asInstanceOf[js.Any] },
        "IpV6Addresses" -> IpV6Addresses.map { x => x.asInstanceOf[js.Any] },
        "Type" -> Type.map { x => x.asInstanceOf[js.Any] },
        "VpcId" -> VpcId.map { x => x.asInstanceOf[js.Any] },
        "SubnetId" -> SubnetId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AwsEc2InstanceDetails]
    }
  }

  /**
   * <p>AWS IAM access key details related to a finding.</p>
   */
  @js.native
  trait AwsIamAccessKeyDetails extends js.Object {
    var UserName: js.UndefOr[NonEmptyString]
    var Status: js.UndefOr[AwsIamAccessKeyStatus]
    var CreatedAt: js.UndefOr[NonEmptyString]
  }

  object AwsIamAccessKeyDetails {
    def apply(
      UserName: js.UndefOr[NonEmptyString] = js.undefined,
      Status: js.UndefOr[AwsIamAccessKeyStatus] = js.undefined,
      CreatedAt: js.UndefOr[NonEmptyString] = js.undefined): AwsIamAccessKeyDetails = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserName" -> UserName.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] },
        "CreatedAt" -> CreatedAt.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AwsIamAccessKeyDetails]
    }
  }

  object AwsIamAccessKeyStatusEnum {
    val Active = "Active"
    val Inactive = "Inactive"

    val values = IndexedSeq(Active, Inactive)
  }

  /**
   * <p>The details of an AWS S3 Bucket.</p>
   */
  @js.native
  trait AwsS3BucketDetails extends js.Object {
    var OwnerId: js.UndefOr[NonEmptyString]
    var OwnerName: js.UndefOr[NonEmptyString]
  }

  object AwsS3BucketDetails {
    def apply(
      OwnerId: js.UndefOr[NonEmptyString] = js.undefined,
      OwnerName: js.UndefOr[NonEmptyString] = js.undefined): AwsS3BucketDetails = {
      val _fields = IndexedSeq[(String, js.Any)](
        "OwnerId" -> OwnerId.map { x => x.asInstanceOf[js.Any] },
        "OwnerName" -> OwnerName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AwsS3BucketDetails]
    }
  }

  /**
   * <p>Provides consistent format for the contents of the Security Hub-aggregated findings. AwsSecurityFinding format enables you to share findings between AWS security services and third-party solutions, and compliance checks.</p> <note> <p>A finding is a potential security issue generated either by AWS services (GuardDuty, Inspector, Macie) or by the integrated third-party solutions and compliance checks.</p> </note>
   */
  @js.native
  trait AwsSecurityFinding extends js.Object {
    var Id: js.UndefOr[NonEmptyString]
    var Resources: js.UndefOr[ResourceList]
    var AwsAccountId: js.UndefOr[NonEmptyString]
    var UpdatedAt: js.UndefOr[NonEmptyString]
    var FirstObservedAt: js.UndefOr[NonEmptyString]
    var Title: js.UndefOr[NonEmptyString]
    var LastObservedAt: js.UndefOr[NonEmptyString]
    var ThreatIntelIndicators: js.UndefOr[ThreatIntelIndicatorList]
    var WorkflowState: js.UndefOr[WorkflowState]
    var Note: js.UndefOr[Note]
    var VerificationState: js.UndefOr[VerificationState]
    var UserDefinedFields: js.UndefOr[FieldMap]
    var RecordState: js.UndefOr[RecordState]
    var SchemaVersion: js.UndefOr[NonEmptyString]
    var Description: js.UndefOr[NonEmptyString]
    var GeneratorId: js.UndefOr[NonEmptyString]
    var Network: js.UndefOr[Network]
    var RelatedFindings: js.UndefOr[RelatedFindingList]
    var Compliance: js.UndefOr[Compliance]
    var Types: js.UndefOr[TypeList]
    var Remediation: js.UndefOr[Remediation]
    var CreatedAt: js.UndefOr[NonEmptyString]
    var Malware: js.UndefOr[MalwareList]
    var Confidence: js.UndefOr[Int]
    var ProductArn: js.UndefOr[NonEmptyString]
    var ProductFields: js.UndefOr[FieldMap]
    var Process: js.UndefOr[ProcessDetails]
    var SourceUrl: js.UndefOr[NonEmptyString]
    var Severity: js.UndefOr[Severity]
    var Criticality: js.UndefOr[Int]
  }

  object AwsSecurityFinding {
    def apply(
      Id: js.UndefOr[NonEmptyString] = js.undefined,
      Resources: js.UndefOr[ResourceList] = js.undefined,
      AwsAccountId: js.UndefOr[NonEmptyString] = js.undefined,
      UpdatedAt: js.UndefOr[NonEmptyString] = js.undefined,
      FirstObservedAt: js.UndefOr[NonEmptyString] = js.undefined,
      Title: js.UndefOr[NonEmptyString] = js.undefined,
      LastObservedAt: js.UndefOr[NonEmptyString] = js.undefined,
      ThreatIntelIndicators: js.UndefOr[ThreatIntelIndicatorList] = js.undefined,
      WorkflowState: js.UndefOr[WorkflowState] = js.undefined,
      Note: js.UndefOr[Note] = js.undefined,
      VerificationState: js.UndefOr[VerificationState] = js.undefined,
      UserDefinedFields: js.UndefOr[FieldMap] = js.undefined,
      RecordState: js.UndefOr[RecordState] = js.undefined,
      SchemaVersion: js.UndefOr[NonEmptyString] = js.undefined,
      Description: js.UndefOr[NonEmptyString] = js.undefined,
      GeneratorId: js.UndefOr[NonEmptyString] = js.undefined,
      Network: js.UndefOr[Network] = js.undefined,
      RelatedFindings: js.UndefOr[RelatedFindingList] = js.undefined,
      Compliance: js.UndefOr[Compliance] = js.undefined,
      Types: js.UndefOr[TypeList] = js.undefined,
      Remediation: js.UndefOr[Remediation] = js.undefined,
      CreatedAt: js.UndefOr[NonEmptyString] = js.undefined,
      Malware: js.UndefOr[MalwareList] = js.undefined,
      Confidence: js.UndefOr[Int] = js.undefined,
      ProductArn: js.UndefOr[NonEmptyString] = js.undefined,
      ProductFields: js.UndefOr[FieldMap] = js.undefined,
      Process: js.UndefOr[ProcessDetails] = js.undefined,
      SourceUrl: js.UndefOr[NonEmptyString] = js.undefined,
      Severity: js.UndefOr[Severity] = js.undefined,
      Criticality: js.UndefOr[Int] = js.undefined): AwsSecurityFinding = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] },
        "Resources" -> Resources.map { x => x.asInstanceOf[js.Any] },
        "AwsAccountId" -> AwsAccountId.map { x => x.asInstanceOf[js.Any] },
        "UpdatedAt" -> UpdatedAt.map { x => x.asInstanceOf[js.Any] },
        "FirstObservedAt" -> FirstObservedAt.map { x => x.asInstanceOf[js.Any] },
        "Title" -> Title.map { x => x.asInstanceOf[js.Any] },
        "LastObservedAt" -> LastObservedAt.map { x => x.asInstanceOf[js.Any] },
        "ThreatIntelIndicators" -> ThreatIntelIndicators.map { x => x.asInstanceOf[js.Any] },
        "WorkflowState" -> WorkflowState.map { x => x.asInstanceOf[js.Any] },
        "Note" -> Note.map { x => x.asInstanceOf[js.Any] },
        "VerificationState" -> VerificationState.map { x => x.asInstanceOf[js.Any] },
        "UserDefinedFields" -> UserDefinedFields.map { x => x.asInstanceOf[js.Any] },
        "RecordState" -> RecordState.map { x => x.asInstanceOf[js.Any] },
        "SchemaVersion" -> SchemaVersion.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "GeneratorId" -> GeneratorId.map { x => x.asInstanceOf[js.Any] },
        "Network" -> Network.map { x => x.asInstanceOf[js.Any] },
        "RelatedFindings" -> RelatedFindings.map { x => x.asInstanceOf[js.Any] },
        "Compliance" -> Compliance.map { x => x.asInstanceOf[js.Any] },
        "Types" -> Types.map { x => x.asInstanceOf[js.Any] },
        "Remediation" -> Remediation.map { x => x.asInstanceOf[js.Any] },
        "CreatedAt" -> CreatedAt.map { x => x.asInstanceOf[js.Any] },
        "Malware" -> Malware.map { x => x.asInstanceOf[js.Any] },
        "Confidence" -> Confidence.map { x => x.asInstanceOf[js.Any] },
        "ProductArn" -> ProductArn.map { x => x.asInstanceOf[js.Any] },
        "ProductFields" -> ProductFields.map { x => x.asInstanceOf[js.Any] },
        "Process" -> Process.map { x => x.asInstanceOf[js.Any] },
        "SourceUrl" -> SourceUrl.map { x => x.asInstanceOf[js.Any] },
        "Severity" -> Severity.map { x => x.asInstanceOf[js.Any] },
        "Criticality" -> Criticality.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AwsSecurityFinding]
    }
  }

  /**
   * <p>A collection of attributes that are applied to all active Security Hub-aggregated findings and that result in a subset of findings that are included in this insight. </p>
   */
  @js.native
  trait AwsSecurityFindingFilters extends js.Object {
    var ComplianceStatus: js.UndefOr[StringFilterList]
    var ResourceAwsIamAccessKeyStatus: js.UndefOr[StringFilterList]
    var NetworkDestinationIpV4: js.UndefOr[IpFilterList]
    var CompanyName: js.UndefOr[StringFilterList]
    var Id: js.UndefOr[StringFilterList]
    var ResourceAwsEc2InstanceType: js.UndefOr[StringFilterList]
    var ResourceAwsEc2InstanceIpV6Addresses: js.UndefOr[IpFilterList]
    var AwsAccountId: js.UndefOr[StringFilterList]
    var ResourceRegion: js.UndefOr[StringFilterList]
    var ResourceId: js.UndefOr[StringFilterList]
    var ResourceAwsEc2InstanceLaunchedAt: js.UndefOr[DateFilterList]
    var UpdatedAt: js.UndefOr[DateFilterList]
    var FirstObservedAt: js.UndefOr[DateFilterList]
    var Title: js.UndefOr[StringFilterList]
    var ProcessLaunchedAt: js.UndefOr[DateFilterList]
    var LastObservedAt: js.UndefOr[DateFilterList]
    var NoteUpdatedAt: js.UndefOr[DateFilterList]
    var WorkflowState: js.UndefOr[StringFilterList]
    var ThreatIntelIndicatorCategory: js.UndefOr[StringFilterList]
    var ResourceContainerImageId: js.UndefOr[StringFilterList]
    var VerificationState: js.UndefOr[StringFilterList]
    var ResourceAwsEc2InstanceVpcId: js.UndefOr[StringFilterList]
    var ResourceAwsEc2InstanceIamInstanceProfileArn: js.UndefOr[StringFilterList]
    var ResourceAwsEc2InstanceSubnetId: js.UndefOr[StringFilterList]
    var NetworkDestinationPort: js.UndefOr[NumberFilterList]
    var RelatedFindingsProductArn: js.UndefOr[StringFilterList]
    var NetworkSourceIpV4: js.UndefOr[IpFilterList]
    var UserDefinedFields: js.UndefOr[MapFilterList]
    var RecordState: js.UndefOr[StringFilterList]
    var Description: js.UndefOr[StringFilterList]
    var NetworkSourcePort: js.UndefOr[NumberFilterList]
    var MalwarePath: js.UndefOr[StringFilterList]
    var GeneratorId: js.UndefOr[StringFilterList]
    var ResourceType: js.UndefOr[StringFilterList]
    var ResourceContainerName: js.UndefOr[StringFilterList]
    var ProcessPid: js.UndefOr[NumberFilterList]
    var ResourceContainerLaunchedAt: js.UndefOr[DateFilterList]
    var ThreatIntelIndicatorType: js.UndefOr[StringFilterList]
    var ThreatIntelIndicatorLastObservedAt: js.UndefOr[DateFilterList]
    var ThreatIntelIndicatorValue: js.UndefOr[StringFilterList]
    var ProcessName: js.UndefOr[StringFilterList]
    var MalwareType: js.UndefOr[StringFilterList]
    var ResourceDetailsOther: js.UndefOr[MapFilterList]
    var ThreatIntelIndicatorSourceUrl: js.UndefOr[StringFilterList]
    var NetworkDestinationIpV6: js.UndefOr[IpFilterList]
    var ResourceContainerImageName: js.UndefOr[StringFilterList]
    var ProcessParentPid: js.UndefOr[NumberFilterList]
    var NetworkDirection: js.UndefOr[StringFilterList]
    var RelatedFindingsId: js.UndefOr[StringFilterList]
    var NetworkDestinationDomain: js.UndefOr[StringFilterList]
    var ThreatIntelIndicatorSource: js.UndefOr[StringFilterList]
    var ResourcePartition: js.UndefOr[StringFilterList]
    var ResourceAwsS3BucketOwnerName: js.UndefOr[StringFilterList]
    var ResourceAwsIamAccessKeyUserName: js.UndefOr[StringFilterList]
    var ResourceAwsS3BucketOwnerId: js.UndefOr[StringFilterList]
    var SeverityNormalized: js.UndefOr[NumberFilterList]
    var CreatedAt: js.UndefOr[DateFilterList]
    var SeverityLabel: js.UndefOr[StringFilterList]
    var MalwareState: js.UndefOr[StringFilterList]
    var Confidence: js.UndefOr[NumberFilterList]
    var NetworkSourceDomain: js.UndefOr[StringFilterList]
    var ProcessPath: js.UndefOr[StringFilterList]
    var Keyword: js.UndefOr[KeywordFilterList]
    var ResourceTags: js.UndefOr[MapFilterList]
    var ProcessTerminatedAt: js.UndefOr[DateFilterList]
    var ProductArn: js.UndefOr[StringFilterList]
    var ProductFields: js.UndefOr[MapFilterList]
    var NetworkSourceMac: js.UndefOr[StringFilterList]
    var NoteText: js.UndefOr[StringFilterList]
    var ProductName: js.UndefOr[StringFilterList]
    var RecommendationText: js.UndefOr[StringFilterList]
    var ResourceAwsEc2InstanceImageId: js.UndefOr[StringFilterList]
    var NetworkProtocol: js.UndefOr[StringFilterList]
    var ResourceAwsEc2InstanceIpV4Addresses: js.UndefOr[IpFilterList]
    var NetworkSourceIpV6: js.UndefOr[IpFilterList]
    var MalwareName: js.UndefOr[StringFilterList]
    var ResourceAwsEc2InstanceKeyName: js.UndefOr[StringFilterList]
    var SeverityProduct: js.UndefOr[NumberFilterList]
    var NoteUpdatedBy: js.UndefOr[StringFilterList]
    var SourceUrl: js.UndefOr[StringFilterList]
    var Criticality: js.UndefOr[NumberFilterList]
    var Type: js.UndefOr[StringFilterList]
    var ResourceAwsIamAccessKeyCreatedAt: js.UndefOr[DateFilterList]
  }

  object AwsSecurityFindingFilters {
    def apply(
      ComplianceStatus: js.UndefOr[StringFilterList] = js.undefined,
      ResourceAwsIamAccessKeyStatus: js.UndefOr[StringFilterList] = js.undefined,
      NetworkDestinationIpV4: js.UndefOr[IpFilterList] = js.undefined,
      CompanyName: js.UndefOr[StringFilterList] = js.undefined,
      Id: js.UndefOr[StringFilterList] = js.undefined,
      ResourceAwsEc2InstanceType: js.UndefOr[StringFilterList] = js.undefined,
      ResourceAwsEc2InstanceIpV6Addresses: js.UndefOr[IpFilterList] = js.undefined,
      AwsAccountId: js.UndefOr[StringFilterList] = js.undefined,
      ResourceRegion: js.UndefOr[StringFilterList] = js.undefined,
      ResourceId: js.UndefOr[StringFilterList] = js.undefined,
      ResourceAwsEc2InstanceLaunchedAt: js.UndefOr[DateFilterList] = js.undefined,
      UpdatedAt: js.UndefOr[DateFilterList] = js.undefined,
      FirstObservedAt: js.UndefOr[DateFilterList] = js.undefined,
      Title: js.UndefOr[StringFilterList] = js.undefined,
      ProcessLaunchedAt: js.UndefOr[DateFilterList] = js.undefined,
      LastObservedAt: js.UndefOr[DateFilterList] = js.undefined,
      NoteUpdatedAt: js.UndefOr[DateFilterList] = js.undefined,
      WorkflowState: js.UndefOr[StringFilterList] = js.undefined,
      ThreatIntelIndicatorCategory: js.UndefOr[StringFilterList] = js.undefined,
      ResourceContainerImageId: js.UndefOr[StringFilterList] = js.undefined,
      VerificationState: js.UndefOr[StringFilterList] = js.undefined,
      ResourceAwsEc2InstanceVpcId: js.UndefOr[StringFilterList] = js.undefined,
      ResourceAwsEc2InstanceIamInstanceProfileArn: js.UndefOr[StringFilterList] = js.undefined,
      ResourceAwsEc2InstanceSubnetId: js.UndefOr[StringFilterList] = js.undefined,
      NetworkDestinationPort: js.UndefOr[NumberFilterList] = js.undefined,
      RelatedFindingsProductArn: js.UndefOr[StringFilterList] = js.undefined,
      NetworkSourceIpV4: js.UndefOr[IpFilterList] = js.undefined,
      UserDefinedFields: js.UndefOr[MapFilterList] = js.undefined,
      RecordState: js.UndefOr[StringFilterList] = js.undefined,
      Description: js.UndefOr[StringFilterList] = js.undefined,
      NetworkSourcePort: js.UndefOr[NumberFilterList] = js.undefined,
      MalwarePath: js.UndefOr[StringFilterList] = js.undefined,
      GeneratorId: js.UndefOr[StringFilterList] = js.undefined,
      ResourceType: js.UndefOr[StringFilterList] = js.undefined,
      ResourceContainerName: js.UndefOr[StringFilterList] = js.undefined,
      ProcessPid: js.UndefOr[NumberFilterList] = js.undefined,
      ResourceContainerLaunchedAt: js.UndefOr[DateFilterList] = js.undefined,
      ThreatIntelIndicatorType: js.UndefOr[StringFilterList] = js.undefined,
      ThreatIntelIndicatorLastObservedAt: js.UndefOr[DateFilterList] = js.undefined,
      ThreatIntelIndicatorValue: js.UndefOr[StringFilterList] = js.undefined,
      ProcessName: js.UndefOr[StringFilterList] = js.undefined,
      MalwareType: js.UndefOr[StringFilterList] = js.undefined,
      ResourceDetailsOther: js.UndefOr[MapFilterList] = js.undefined,
      ThreatIntelIndicatorSourceUrl: js.UndefOr[StringFilterList] = js.undefined,
      NetworkDestinationIpV6: js.UndefOr[IpFilterList] = js.undefined,
      ResourceContainerImageName: js.UndefOr[StringFilterList] = js.undefined,
      ProcessParentPid: js.UndefOr[NumberFilterList] = js.undefined,
      NetworkDirection: js.UndefOr[StringFilterList] = js.undefined,
      RelatedFindingsId: js.UndefOr[StringFilterList] = js.undefined,
      NetworkDestinationDomain: js.UndefOr[StringFilterList] = js.undefined,
      ThreatIntelIndicatorSource: js.UndefOr[StringFilterList] = js.undefined,
      ResourcePartition: js.UndefOr[StringFilterList] = js.undefined,
      ResourceAwsS3BucketOwnerName: js.UndefOr[StringFilterList] = js.undefined,
      ResourceAwsIamAccessKeyUserName: js.UndefOr[StringFilterList] = js.undefined,
      ResourceAwsS3BucketOwnerId: js.UndefOr[StringFilterList] = js.undefined,
      SeverityNormalized: js.UndefOr[NumberFilterList] = js.undefined,
      CreatedAt: js.UndefOr[DateFilterList] = js.undefined,
      SeverityLabel: js.UndefOr[StringFilterList] = js.undefined,
      MalwareState: js.UndefOr[StringFilterList] = js.undefined,
      Confidence: js.UndefOr[NumberFilterList] = js.undefined,
      NetworkSourceDomain: js.UndefOr[StringFilterList] = js.undefined,
      ProcessPath: js.UndefOr[StringFilterList] = js.undefined,
      Keyword: js.UndefOr[KeywordFilterList] = js.undefined,
      ResourceTags: js.UndefOr[MapFilterList] = js.undefined,
      ProcessTerminatedAt: js.UndefOr[DateFilterList] = js.undefined,
      ProductArn: js.UndefOr[StringFilterList] = js.undefined,
      ProductFields: js.UndefOr[MapFilterList] = js.undefined,
      NetworkSourceMac: js.UndefOr[StringFilterList] = js.undefined,
      NoteText: js.UndefOr[StringFilterList] = js.undefined,
      ProductName: js.UndefOr[StringFilterList] = js.undefined,
      RecommendationText: js.UndefOr[StringFilterList] = js.undefined,
      ResourceAwsEc2InstanceImageId: js.UndefOr[StringFilterList] = js.undefined,
      NetworkProtocol: js.UndefOr[StringFilterList] = js.undefined,
      ResourceAwsEc2InstanceIpV4Addresses: js.UndefOr[IpFilterList] = js.undefined,
      NetworkSourceIpV6: js.UndefOr[IpFilterList] = js.undefined,
      MalwareName: js.UndefOr[StringFilterList] = js.undefined,
      ResourceAwsEc2InstanceKeyName: js.UndefOr[StringFilterList] = js.undefined,
      SeverityProduct: js.UndefOr[NumberFilterList] = js.undefined,
      NoteUpdatedBy: js.UndefOr[StringFilterList] = js.undefined,
      SourceUrl: js.UndefOr[StringFilterList] = js.undefined,
      Criticality: js.UndefOr[NumberFilterList] = js.undefined,
      Type: js.UndefOr[StringFilterList] = js.undefined,
      ResourceAwsIamAccessKeyCreatedAt: js.UndefOr[DateFilterList] = js.undefined): AwsSecurityFindingFilters = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ComplianceStatus" -> ComplianceStatus.map { x => x.asInstanceOf[js.Any] },
        "ResourceAwsIamAccessKeyStatus" -> ResourceAwsIamAccessKeyStatus.map { x => x.asInstanceOf[js.Any] },
        "NetworkDestinationIpV4" -> NetworkDestinationIpV4.map { x => x.asInstanceOf[js.Any] },
        "CompanyName" -> CompanyName.map { x => x.asInstanceOf[js.Any] },
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] },
        "ResourceAwsEc2InstanceType" -> ResourceAwsEc2InstanceType.map { x => x.asInstanceOf[js.Any] },
        "ResourceAwsEc2InstanceIpV6Addresses" -> ResourceAwsEc2InstanceIpV6Addresses.map { x => x.asInstanceOf[js.Any] },
        "AwsAccountId" -> AwsAccountId.map { x => x.asInstanceOf[js.Any] },
        "ResourceRegion" -> ResourceRegion.map { x => x.asInstanceOf[js.Any] },
        "ResourceId" -> ResourceId.map { x => x.asInstanceOf[js.Any] },
        "ResourceAwsEc2InstanceLaunchedAt" -> ResourceAwsEc2InstanceLaunchedAt.map { x => x.asInstanceOf[js.Any] },
        "UpdatedAt" -> UpdatedAt.map { x => x.asInstanceOf[js.Any] },
        "FirstObservedAt" -> FirstObservedAt.map { x => x.asInstanceOf[js.Any] },
        "Title" -> Title.map { x => x.asInstanceOf[js.Any] },
        "ProcessLaunchedAt" -> ProcessLaunchedAt.map { x => x.asInstanceOf[js.Any] },
        "LastObservedAt" -> LastObservedAt.map { x => x.asInstanceOf[js.Any] },
        "NoteUpdatedAt" -> NoteUpdatedAt.map { x => x.asInstanceOf[js.Any] },
        "WorkflowState" -> WorkflowState.map { x => x.asInstanceOf[js.Any] },
        "ThreatIntelIndicatorCategory" -> ThreatIntelIndicatorCategory.map { x => x.asInstanceOf[js.Any] },
        "ResourceContainerImageId" -> ResourceContainerImageId.map { x => x.asInstanceOf[js.Any] },
        "VerificationState" -> VerificationState.map { x => x.asInstanceOf[js.Any] },
        "ResourceAwsEc2InstanceVpcId" -> ResourceAwsEc2InstanceVpcId.map { x => x.asInstanceOf[js.Any] },
        "ResourceAwsEc2InstanceIamInstanceProfileArn" -> ResourceAwsEc2InstanceIamInstanceProfileArn.map { x => x.asInstanceOf[js.Any] },
        "ResourceAwsEc2InstanceSubnetId" -> ResourceAwsEc2InstanceSubnetId.map { x => x.asInstanceOf[js.Any] },
        "NetworkDestinationPort" -> NetworkDestinationPort.map { x => x.asInstanceOf[js.Any] },
        "RelatedFindingsProductArn" -> RelatedFindingsProductArn.map { x => x.asInstanceOf[js.Any] },
        "NetworkSourceIpV4" -> NetworkSourceIpV4.map { x => x.asInstanceOf[js.Any] },
        "UserDefinedFields" -> UserDefinedFields.map { x => x.asInstanceOf[js.Any] },
        "RecordState" -> RecordState.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "NetworkSourcePort" -> NetworkSourcePort.map { x => x.asInstanceOf[js.Any] },
        "MalwarePath" -> MalwarePath.map { x => x.asInstanceOf[js.Any] },
        "GeneratorId" -> GeneratorId.map { x => x.asInstanceOf[js.Any] },
        "ResourceType" -> ResourceType.map { x => x.asInstanceOf[js.Any] },
        "ResourceContainerName" -> ResourceContainerName.map { x => x.asInstanceOf[js.Any] },
        "ProcessPid" -> ProcessPid.map { x => x.asInstanceOf[js.Any] },
        "ResourceContainerLaunchedAt" -> ResourceContainerLaunchedAt.map { x => x.asInstanceOf[js.Any] },
        "ThreatIntelIndicatorType" -> ThreatIntelIndicatorType.map { x => x.asInstanceOf[js.Any] },
        "ThreatIntelIndicatorLastObservedAt" -> ThreatIntelIndicatorLastObservedAt.map { x => x.asInstanceOf[js.Any] },
        "ThreatIntelIndicatorValue" -> ThreatIntelIndicatorValue.map { x => x.asInstanceOf[js.Any] },
        "ProcessName" -> ProcessName.map { x => x.asInstanceOf[js.Any] },
        "MalwareType" -> MalwareType.map { x => x.asInstanceOf[js.Any] },
        "ResourceDetailsOther" -> ResourceDetailsOther.map { x => x.asInstanceOf[js.Any] },
        "ThreatIntelIndicatorSourceUrl" -> ThreatIntelIndicatorSourceUrl.map { x => x.asInstanceOf[js.Any] },
        "NetworkDestinationIpV6" -> NetworkDestinationIpV6.map { x => x.asInstanceOf[js.Any] },
        "ResourceContainerImageName" -> ResourceContainerImageName.map { x => x.asInstanceOf[js.Any] },
        "ProcessParentPid" -> ProcessParentPid.map { x => x.asInstanceOf[js.Any] },
        "NetworkDirection" -> NetworkDirection.map { x => x.asInstanceOf[js.Any] },
        "RelatedFindingsId" -> RelatedFindingsId.map { x => x.asInstanceOf[js.Any] },
        "NetworkDestinationDomain" -> NetworkDestinationDomain.map { x => x.asInstanceOf[js.Any] },
        "ThreatIntelIndicatorSource" -> ThreatIntelIndicatorSource.map { x => x.asInstanceOf[js.Any] },
        "ResourcePartition" -> ResourcePartition.map { x => x.asInstanceOf[js.Any] },
        "ResourceAwsS3BucketOwnerName" -> ResourceAwsS3BucketOwnerName.map { x => x.asInstanceOf[js.Any] },
        "ResourceAwsIamAccessKeyUserName" -> ResourceAwsIamAccessKeyUserName.map { x => x.asInstanceOf[js.Any] },
        "ResourceAwsS3BucketOwnerId" -> ResourceAwsS3BucketOwnerId.map { x => x.asInstanceOf[js.Any] },
        "SeverityNormalized" -> SeverityNormalized.map { x => x.asInstanceOf[js.Any] },
        "CreatedAt" -> CreatedAt.map { x => x.asInstanceOf[js.Any] },
        "SeverityLabel" -> SeverityLabel.map { x => x.asInstanceOf[js.Any] },
        "MalwareState" -> MalwareState.map { x => x.asInstanceOf[js.Any] },
        "Confidence" -> Confidence.map { x => x.asInstanceOf[js.Any] },
        "NetworkSourceDomain" -> NetworkSourceDomain.map { x => x.asInstanceOf[js.Any] },
        "ProcessPath" -> ProcessPath.map { x => x.asInstanceOf[js.Any] },
        "Keyword" -> Keyword.map { x => x.asInstanceOf[js.Any] },
        "ResourceTags" -> ResourceTags.map { x => x.asInstanceOf[js.Any] },
        "ProcessTerminatedAt" -> ProcessTerminatedAt.map { x => x.asInstanceOf[js.Any] },
        "ProductArn" -> ProductArn.map { x => x.asInstanceOf[js.Any] },
        "ProductFields" -> ProductFields.map { x => x.asInstanceOf[js.Any] },
        "NetworkSourceMac" -> NetworkSourceMac.map { x => x.asInstanceOf[js.Any] },
        "NoteText" -> NoteText.map { x => x.asInstanceOf[js.Any] },
        "ProductName" -> ProductName.map { x => x.asInstanceOf[js.Any] },
        "RecommendationText" -> RecommendationText.map { x => x.asInstanceOf[js.Any] },
        "ResourceAwsEc2InstanceImageId" -> ResourceAwsEc2InstanceImageId.map { x => x.asInstanceOf[js.Any] },
        "NetworkProtocol" -> NetworkProtocol.map { x => x.asInstanceOf[js.Any] },
        "ResourceAwsEc2InstanceIpV4Addresses" -> ResourceAwsEc2InstanceIpV4Addresses.map { x => x.asInstanceOf[js.Any] },
        "NetworkSourceIpV6" -> NetworkSourceIpV6.map { x => x.asInstanceOf[js.Any] },
        "MalwareName" -> MalwareName.map { x => x.asInstanceOf[js.Any] },
        "ResourceAwsEc2InstanceKeyName" -> ResourceAwsEc2InstanceKeyName.map { x => x.asInstanceOf[js.Any] },
        "SeverityProduct" -> SeverityProduct.map { x => x.asInstanceOf[js.Any] },
        "NoteUpdatedBy" -> NoteUpdatedBy.map { x => x.asInstanceOf[js.Any] },
        "SourceUrl" -> SourceUrl.map { x => x.asInstanceOf[js.Any] },
        "Criticality" -> Criticality.map { x => x.asInstanceOf[js.Any] },
        "Type" -> Type.map { x => x.asInstanceOf[js.Any] },
        "ResourceAwsIamAccessKeyCreatedAt" -> ResourceAwsIamAccessKeyCreatedAt.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AwsSecurityFindingFilters]
    }
  }

  @js.native
  trait BatchDisableStandardsRequest extends js.Object {
    var StandardsSubscriptionArns: js.UndefOr[StandardsSubscriptionArns]
  }

  object BatchDisableStandardsRequest {
    def apply(
      StandardsSubscriptionArns: js.UndefOr[StandardsSubscriptionArns] = js.undefined): BatchDisableStandardsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StandardsSubscriptionArns" -> StandardsSubscriptionArns.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchDisableStandardsRequest]
    }
  }

  @js.native
  trait BatchDisableStandardsResponse extends js.Object {
    var StandardsSubscriptions: js.UndefOr[StandardsSubscriptions]
  }

  object BatchDisableStandardsResponse {
    def apply(
      StandardsSubscriptions: js.UndefOr[StandardsSubscriptions] = js.undefined): BatchDisableStandardsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StandardsSubscriptions" -> StandardsSubscriptions.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchDisableStandardsResponse]
    }
  }

  @js.native
  trait BatchEnableStandardsRequest extends js.Object {
    var StandardsSubscriptionRequests: js.UndefOr[StandardsSubscriptionRequests]
  }

  object BatchEnableStandardsRequest {
    def apply(
      StandardsSubscriptionRequests: js.UndefOr[StandardsSubscriptionRequests] = js.undefined): BatchEnableStandardsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StandardsSubscriptionRequests" -> StandardsSubscriptionRequests.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchEnableStandardsRequest]
    }
  }

  @js.native
  trait BatchEnableStandardsResponse extends js.Object {
    var StandardsSubscriptions: js.UndefOr[StandardsSubscriptions]
  }

  object BatchEnableStandardsResponse {
    def apply(
      StandardsSubscriptions: js.UndefOr[StandardsSubscriptions] = js.undefined): BatchEnableStandardsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StandardsSubscriptions" -> StandardsSubscriptions.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchEnableStandardsResponse]
    }
  }

  @js.native
  trait BatchImportFindingsRequest extends js.Object {
    var Findings: js.UndefOr[AwsSecurityFindingList]
  }

  object BatchImportFindingsRequest {
    def apply(
      Findings: js.UndefOr[AwsSecurityFindingList] = js.undefined): BatchImportFindingsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Findings" -> Findings.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchImportFindingsRequest]
    }
  }

  @js.native
  trait BatchImportFindingsResponse extends js.Object {
    var FailedCount: js.UndefOr[Int]
    var SuccessCount: js.UndefOr[Int]
    var FailedFindings: js.UndefOr[ImportFindingsErrorList]
  }

  object BatchImportFindingsResponse {
    def apply(
      FailedCount: js.UndefOr[Int] = js.undefined,
      SuccessCount: js.UndefOr[Int] = js.undefined,
      FailedFindings: js.UndefOr[ImportFindingsErrorList] = js.undefined): BatchImportFindingsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FailedCount" -> FailedCount.map { x => x.asInstanceOf[js.Any] },
        "SuccessCount" -> SuccessCount.map { x => x.asInstanceOf[js.Any] },
        "FailedFindings" -> FailedFindings.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchImportFindingsResponse]
    }
  }

  /**
   * <p>Exclusive to findings that are generated as the result of a check run against a specific rule in a supported standard (for example, AWS CIS Foundations). Contains compliance-related finding details.</p>
   */
  @js.native
  trait Compliance extends js.Object {
    var Status: js.UndefOr[ComplianceStatus]
  }

  object Compliance {
    def apply(
      Status: js.UndefOr[ComplianceStatus] = js.undefined): Compliance = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Compliance]
    }
  }

  object ComplianceStatusEnum {
    val PASSED = "PASSED"
    val WARNING = "WARNING"
    val FAILED = "FAILED"
    val NOT_AVAILABLE = "NOT_AVAILABLE"

    val values = IndexedSeq(PASSED, WARNING, FAILED, NOT_AVAILABLE)
  }

  /**
   * <p>Container details related to a finding.</p>
   */
  @js.native
  trait ContainerDetails extends js.Object {
    var Name: js.UndefOr[NonEmptyString]
    var ImageId: js.UndefOr[NonEmptyString]
    var ImageName: js.UndefOr[NonEmptyString]
    var LaunchedAt: js.UndefOr[NonEmptyString]
  }

  object ContainerDetails {
    def apply(
      Name: js.UndefOr[NonEmptyString] = js.undefined,
      ImageId: js.UndefOr[NonEmptyString] = js.undefined,
      ImageName: js.UndefOr[NonEmptyString] = js.undefined,
      LaunchedAt: js.UndefOr[NonEmptyString] = js.undefined): ContainerDetails = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "ImageId" -> ImageId.map { x => x.asInstanceOf[js.Any] },
        "ImageName" -> ImageName.map { x => x.asInstanceOf[js.Any] },
        "LaunchedAt" -> LaunchedAt.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ContainerDetails]
    }
  }

  @js.native
  trait CreateInsightRequest extends js.Object {
    var Name: js.UndefOr[NonEmptyString]
    var Filters: js.UndefOr[AwsSecurityFindingFilters]
    var GroupByAttribute: js.UndefOr[NonEmptyString]
  }

  object CreateInsightRequest {
    def apply(
      Name: js.UndefOr[NonEmptyString] = js.undefined,
      Filters: js.UndefOr[AwsSecurityFindingFilters] = js.undefined,
      GroupByAttribute: js.UndefOr[NonEmptyString] = js.undefined): CreateInsightRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "GroupByAttribute" -> GroupByAttribute.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateInsightRequest]
    }
  }

  @js.native
  trait CreateInsightResponse extends js.Object {
    var InsightArn: js.UndefOr[NonEmptyString]
  }

  object CreateInsightResponse {
    def apply(
      InsightArn: js.UndefOr[NonEmptyString] = js.undefined): CreateInsightResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InsightArn" -> InsightArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateInsightResponse]
    }
  }

  @js.native
  trait CreateMembersRequest extends js.Object {
    var AccountDetails: js.UndefOr[AccountDetailsList]
  }

  object CreateMembersRequest {
    def apply(
      AccountDetails: js.UndefOr[AccountDetailsList] = js.undefined): CreateMembersRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AccountDetails" -> AccountDetails.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateMembersRequest]
    }
  }

  @js.native
  trait CreateMembersResponse extends js.Object {
    var UnprocessedAccounts: js.UndefOr[ResultList]
  }

  object CreateMembersResponse {
    def apply(
      UnprocessedAccounts: js.UndefOr[ResultList] = js.undefined): CreateMembersResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UnprocessedAccounts" -> UnprocessedAccounts.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateMembersResponse]
    }
  }

  /**
   * <p>A date filter for querying findings.</p>
   */
  @js.native
  trait DateFilter extends js.Object {
    var Start: js.UndefOr[NonEmptyString]
    var End: js.UndefOr[NonEmptyString]
    var DateRange: js.UndefOr[DateRange]
  }

  object DateFilter {
    def apply(
      Start: js.UndefOr[NonEmptyString] = js.undefined,
      End: js.UndefOr[NonEmptyString] = js.undefined,
      DateRange: js.UndefOr[DateRange] = js.undefined): DateFilter = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Start" -> Start.map { x => x.asInstanceOf[js.Any] },
        "End" -> End.map { x => x.asInstanceOf[js.Any] },
        "DateRange" -> DateRange.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DateFilter]
    }
  }

  /**
   * <p>A date range for the date filter.</p>
   */
  @js.native
  trait DateRange extends js.Object {
    var Value: js.UndefOr[Int]
    var Unit: js.UndefOr[DateRangeUnit]
  }

  object DateRange {
    def apply(
      Value: js.UndefOr[Int] = js.undefined,
      Unit: js.UndefOr[DateRangeUnit] = js.undefined): DateRange = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Value" -> Value.map { x => x.asInstanceOf[js.Any] },
        "Unit" -> Unit.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DateRange]
    }
  }

  object DateRangeUnitEnum {
    val DAYS = "DAYS"

    val values = IndexedSeq(DAYS)
  }

  @js.native
  trait DeclineInvitationsRequest extends js.Object {
    var AccountIds: js.UndefOr[AccountIdList]
  }

  object DeclineInvitationsRequest {
    def apply(
      AccountIds: js.UndefOr[AccountIdList] = js.undefined): DeclineInvitationsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AccountIds" -> AccountIds.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeclineInvitationsRequest]
    }
  }

  @js.native
  trait DeclineInvitationsResponse extends js.Object {
    var UnprocessedAccounts: js.UndefOr[ResultList]
  }

  object DeclineInvitationsResponse {
    def apply(
      UnprocessedAccounts: js.UndefOr[ResultList] = js.undefined): DeclineInvitationsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UnprocessedAccounts" -> UnprocessedAccounts.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeclineInvitationsResponse]
    }
  }

  @js.native
  trait DeleteInsightRequest extends js.Object {
    var InsightArn: js.UndefOr[NonEmptyString]
  }

  object DeleteInsightRequest {
    def apply(
      InsightArn: js.UndefOr[NonEmptyString] = js.undefined): DeleteInsightRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InsightArn" -> InsightArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteInsightRequest]
    }
  }

  @js.native
  trait DeleteInsightResponse extends js.Object {
    var InsightArn: js.UndefOr[NonEmptyString]
  }

  object DeleteInsightResponse {
    def apply(
      InsightArn: js.UndefOr[NonEmptyString] = js.undefined): DeleteInsightResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InsightArn" -> InsightArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteInsightResponse]
    }
  }

  @js.native
  trait DeleteInvitationsRequest extends js.Object {
    var AccountIds: js.UndefOr[AccountIdList]
  }

  object DeleteInvitationsRequest {
    def apply(
      AccountIds: js.UndefOr[AccountIdList] = js.undefined): DeleteInvitationsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AccountIds" -> AccountIds.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteInvitationsRequest]
    }
  }

  @js.native
  trait DeleteInvitationsResponse extends js.Object {
    var UnprocessedAccounts: js.UndefOr[ResultList]
  }

  object DeleteInvitationsResponse {
    def apply(
      UnprocessedAccounts: js.UndefOr[ResultList] = js.undefined): DeleteInvitationsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UnprocessedAccounts" -> UnprocessedAccounts.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteInvitationsResponse]
    }
  }

  @js.native
  trait DeleteMembersRequest extends js.Object {
    var AccountIds: js.UndefOr[AccountIdList]
  }

  object DeleteMembersRequest {
    def apply(
      AccountIds: js.UndefOr[AccountIdList] = js.undefined): DeleteMembersRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AccountIds" -> AccountIds.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteMembersRequest]
    }
  }

  @js.native
  trait DeleteMembersResponse extends js.Object {
    var UnprocessedAccounts: js.UndefOr[ResultList]
  }

  object DeleteMembersResponse {
    def apply(
      UnprocessedAccounts: js.UndefOr[ResultList] = js.undefined): DeleteMembersResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UnprocessedAccounts" -> UnprocessedAccounts.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteMembersResponse]
    }
  }

  @js.native
  trait DisableImportFindingsForProductRequest extends js.Object {
    var ProductSubscriptionArn: js.UndefOr[NonEmptyString]
  }

  object DisableImportFindingsForProductRequest {
    def apply(
      ProductSubscriptionArn: js.UndefOr[NonEmptyString] = js.undefined): DisableImportFindingsForProductRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ProductSubscriptionArn" -> ProductSubscriptionArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DisableImportFindingsForProductRequest]
    }
  }

  @js.native
  trait DisableImportFindingsForProductResponse extends js.Object {

  }

  object DisableImportFindingsForProductResponse {
    def apply(): DisableImportFindingsForProductResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DisableImportFindingsForProductResponse]
    }
  }

  @js.native
  trait DisableSecurityHubRequest extends js.Object {

  }

  object DisableSecurityHubRequest {
    def apply(): DisableSecurityHubRequest = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DisableSecurityHubRequest]
    }
  }

  @js.native
  trait DisableSecurityHubResponse extends js.Object {

  }

  object DisableSecurityHubResponse {
    def apply(): DisableSecurityHubResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DisableSecurityHubResponse]
    }
  }

  @js.native
  trait DisassociateFromMasterAccountRequest extends js.Object {

  }

  object DisassociateFromMasterAccountRequest {
    def apply(): DisassociateFromMasterAccountRequest = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DisassociateFromMasterAccountRequest]
    }
  }

  @js.native
  trait DisassociateFromMasterAccountResponse extends js.Object {

  }

  object DisassociateFromMasterAccountResponse {
    def apply(): DisassociateFromMasterAccountResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DisassociateFromMasterAccountResponse]
    }
  }

  @js.native
  trait DisassociateMembersRequest extends js.Object {
    var AccountIds: js.UndefOr[AccountIdList]
  }

  object DisassociateMembersRequest {
    def apply(
      AccountIds: js.UndefOr[AccountIdList] = js.undefined): DisassociateMembersRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AccountIds" -> AccountIds.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DisassociateMembersRequest]
    }
  }

  @js.native
  trait DisassociateMembersResponse extends js.Object {

  }

  object DisassociateMembersResponse {
    def apply(): DisassociateMembersResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DisassociateMembersResponse]
    }
  }

  @js.native
  trait EnableImportFindingsForProductRequest extends js.Object {
    var ProductArn: js.UndefOr[NonEmptyString]
  }

  object EnableImportFindingsForProductRequest {
    def apply(
      ProductArn: js.UndefOr[NonEmptyString] = js.undefined): EnableImportFindingsForProductRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ProductArn" -> ProductArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EnableImportFindingsForProductRequest]
    }
  }

  @js.native
  trait EnableImportFindingsForProductResponse extends js.Object {
    var ProductSubscriptionArn: js.UndefOr[NonEmptyString]
  }

  object EnableImportFindingsForProductResponse {
    def apply(
      ProductSubscriptionArn: js.UndefOr[NonEmptyString] = js.undefined): EnableImportFindingsForProductResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ProductSubscriptionArn" -> ProductSubscriptionArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EnableImportFindingsForProductResponse]
    }
  }

  @js.native
  trait EnableSecurityHubRequest extends js.Object {

  }

  object EnableSecurityHubRequest {
    def apply(): EnableSecurityHubRequest = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EnableSecurityHubRequest]
    }
  }

  @js.native
  trait EnableSecurityHubResponse extends js.Object {

  }

  object EnableSecurityHubResponse {
    def apply(): EnableSecurityHubResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EnableSecurityHubResponse]
    }
  }

  @js.native
  trait GetEnabledStandardsRequest extends js.Object {
    var StandardsSubscriptionArns: js.UndefOr[StandardsSubscriptionArns]
    var NextToken: js.UndefOr[NextToken]
    var MaxResults: js.UndefOr[MaxResults]
  }

  object GetEnabledStandardsRequest {
    def apply(
      StandardsSubscriptionArns: js.UndefOr[StandardsSubscriptionArns] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined,
      MaxResults: js.UndefOr[MaxResults] = js.undefined): GetEnabledStandardsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StandardsSubscriptionArns" -> StandardsSubscriptionArns.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetEnabledStandardsRequest]
    }
  }

  @js.native
  trait GetEnabledStandardsResponse extends js.Object {
    var StandardsSubscriptions: js.UndefOr[StandardsSubscriptions]
    var NextToken: js.UndefOr[NextToken]
  }

  object GetEnabledStandardsResponse {
    def apply(
      StandardsSubscriptions: js.UndefOr[StandardsSubscriptions] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): GetEnabledStandardsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StandardsSubscriptions" -> StandardsSubscriptions.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetEnabledStandardsResponse]
    }
  }

  @js.native
  trait GetFindingsRequest extends js.Object {
    var Filters: js.UndefOr[AwsSecurityFindingFilters]
    var SortCriteria: js.UndefOr[SortCriteria]
    var NextToken: js.UndefOr[NextToken]
    var MaxResults: js.UndefOr[MaxResults]
  }

  object GetFindingsRequest {
    def apply(
      Filters: js.UndefOr[AwsSecurityFindingFilters] = js.undefined,
      SortCriteria: js.UndefOr[SortCriteria] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined,
      MaxResults: js.UndefOr[MaxResults] = js.undefined): GetFindingsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "SortCriteria" -> SortCriteria.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetFindingsRequest]
    }
  }

  @js.native
  trait GetFindingsResponse extends js.Object {
    var Findings: js.UndefOr[AwsSecurityFindingList]
    var NextToken: js.UndefOr[NextToken]
  }

  object GetFindingsResponse {
    def apply(
      Findings: js.UndefOr[AwsSecurityFindingList] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): GetFindingsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Findings" -> Findings.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetFindingsResponse]
    }
  }

  @js.native
  trait GetInsightResultsRequest extends js.Object {
    var InsightArn: js.UndefOr[NonEmptyString]
  }

  object GetInsightResultsRequest {
    def apply(
      InsightArn: js.UndefOr[NonEmptyString] = js.undefined): GetInsightResultsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InsightArn" -> InsightArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetInsightResultsRequest]
    }
  }

  @js.native
  trait GetInsightResultsResponse extends js.Object {
    var InsightResults: js.UndefOr[InsightResults]
  }

  object GetInsightResultsResponse {
    def apply(
      InsightResults: js.UndefOr[InsightResults] = js.undefined): GetInsightResultsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InsightResults" -> InsightResults.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetInsightResultsResponse]
    }
  }

  @js.native
  trait GetInsightsRequest extends js.Object {
    var InsightArns: js.UndefOr[ArnList]
    var NextToken: js.UndefOr[NextToken]
    var MaxResults: js.UndefOr[MaxResults]
  }

  object GetInsightsRequest {
    def apply(
      InsightArns: js.UndefOr[ArnList] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined,
      MaxResults: js.UndefOr[MaxResults] = js.undefined): GetInsightsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InsightArns" -> InsightArns.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetInsightsRequest]
    }
  }

  @js.native
  trait GetInsightsResponse extends js.Object {
    var Insights: js.UndefOr[InsightList]
    var NextToken: js.UndefOr[NextToken]
  }

  object GetInsightsResponse {
    def apply(
      Insights: js.UndefOr[InsightList] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): GetInsightsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Insights" -> Insights.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetInsightsResponse]
    }
  }

  @js.native
  trait GetInvitationsCountRequest extends js.Object {

  }

  object GetInvitationsCountRequest {
    def apply(): GetInvitationsCountRequest = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetInvitationsCountRequest]
    }
  }

  @js.native
  trait GetInvitationsCountResponse extends js.Object {
    var InvitationsCount: js.UndefOr[Int]
  }

  object GetInvitationsCountResponse {
    def apply(
      InvitationsCount: js.UndefOr[Int] = js.undefined): GetInvitationsCountResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InvitationsCount" -> InvitationsCount.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetInvitationsCountResponse]
    }
  }

  @js.native
  trait GetMasterAccountRequest extends js.Object {

  }

  object GetMasterAccountRequest {
    def apply(): GetMasterAccountRequest = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetMasterAccountRequest]
    }
  }

  @js.native
  trait GetMasterAccountResponse extends js.Object {
    var Master: js.UndefOr[Invitation]
  }

  object GetMasterAccountResponse {
    def apply(
      Master: js.UndefOr[Invitation] = js.undefined): GetMasterAccountResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Master" -> Master.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetMasterAccountResponse]
    }
  }

  @js.native
  trait GetMembersRequest extends js.Object {
    var AccountIds: js.UndefOr[AccountIdList]
  }

  object GetMembersRequest {
    def apply(
      AccountIds: js.UndefOr[AccountIdList] = js.undefined): GetMembersRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AccountIds" -> AccountIds.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetMembersRequest]
    }
  }

  @js.native
  trait GetMembersResponse extends js.Object {
    var Members: js.UndefOr[MemberList]
    var UnprocessedAccounts: js.UndefOr[ResultList]
  }

  object GetMembersResponse {
    def apply(
      Members: js.UndefOr[MemberList] = js.undefined,
      UnprocessedAccounts: js.UndefOr[ResultList] = js.undefined): GetMembersResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Members" -> Members.map { x => x.asInstanceOf[js.Any] },
        "UnprocessedAccounts" -> UnprocessedAccounts.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetMembersResponse]
    }
  }

  /**
   * <p>Includes details of the list of the findings that cannot be imported. </p>
   */
  @js.native
  trait ImportFindingsError extends js.Object {
    var Id: js.UndefOr[NonEmptyString]
    var ErrorCode: js.UndefOr[NonEmptyString]
    var ErrorMessage: js.UndefOr[NonEmptyString]
  }

  object ImportFindingsError {
    def apply(
      Id: js.UndefOr[NonEmptyString] = js.undefined,
      ErrorCode: js.UndefOr[NonEmptyString] = js.undefined,
      ErrorMessage: js.UndefOr[NonEmptyString] = js.undefined): ImportFindingsError = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] },
        "ErrorCode" -> ErrorCode.map { x => x.asInstanceOf[js.Any] },
        "ErrorMessage" -> ErrorMessage.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ImportFindingsError]
    }
  }

  /**
   * <p>Contains information about a Security Hub insight. </p>
   */
  @js.native
  trait Insight extends js.Object {
    var InsightArn: js.UndefOr[NonEmptyString]
    var Name: js.UndefOr[NonEmptyString]
    var Filters: js.UndefOr[AwsSecurityFindingFilters]
    var GroupByAttribute: js.UndefOr[NonEmptyString]
  }

  object Insight {
    def apply(
      InsightArn: js.UndefOr[NonEmptyString] = js.undefined,
      Name: js.UndefOr[NonEmptyString] = js.undefined,
      Filters: js.UndefOr[AwsSecurityFindingFilters] = js.undefined,
      GroupByAttribute: js.UndefOr[NonEmptyString] = js.undefined): Insight = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InsightArn" -> InsightArn.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "GroupByAttribute" -> GroupByAttribute.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Insight]
    }
  }

  /**
   * <p>The insight result values returned by the GetInsightResults operation.</p>
   */
  @js.native
  trait InsightResultValue extends js.Object {
    var GroupByAttributeValue: js.UndefOr[NonEmptyString]
    var Count: js.UndefOr[Int]
  }

  object InsightResultValue {
    def apply(
      GroupByAttributeValue: js.UndefOr[NonEmptyString] = js.undefined,
      Count: js.UndefOr[Int] = js.undefined): InsightResultValue = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GroupByAttributeValue" -> GroupByAttributeValue.map { x => x.asInstanceOf[js.Any] },
        "Count" -> Count.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InsightResultValue]
    }
  }

  /**
   * <p>The insight results returned by the GetInsightResults operation.</p>
   */
  @js.native
  trait InsightResults extends js.Object {
    var InsightArn: js.UndefOr[NonEmptyString]
    var GroupByAttribute: js.UndefOr[NonEmptyString]
    var ResultValues: js.UndefOr[InsightResultValueList]
  }

  object InsightResults {
    def apply(
      InsightArn: js.UndefOr[NonEmptyString] = js.undefined,
      GroupByAttribute: js.UndefOr[NonEmptyString] = js.undefined,
      ResultValues: js.UndefOr[InsightResultValueList] = js.undefined): InsightResults = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InsightArn" -> InsightArn.map { x => x.asInstanceOf[js.Any] },
        "GroupByAttribute" -> GroupByAttribute.map { x => x.asInstanceOf[js.Any] },
        "ResultValues" -> ResultValues.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InsightResults]
    }
  }

  /**
   * <p>The details of an invitation sent to an AWS account by the Security Hub master account. </p>
   */
  @js.native
  trait Invitation extends js.Object {
    var AccountId: js.UndefOr[AccountId]
    var InvitationId: js.UndefOr[NonEmptyString]
    var InvitedAt: js.UndefOr[Timestamp]
    var MemberStatus: js.UndefOr[NonEmptyString]
  }

  object Invitation {
    def apply(
      AccountId: js.UndefOr[AccountId] = js.undefined,
      InvitationId: js.UndefOr[NonEmptyString] = js.undefined,
      InvitedAt: js.UndefOr[Timestamp] = js.undefined,
      MemberStatus: js.UndefOr[NonEmptyString] = js.undefined): Invitation = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AccountId" -> AccountId.map { x => x.asInstanceOf[js.Any] },
        "InvitationId" -> InvitationId.map { x => x.asInstanceOf[js.Any] },
        "InvitedAt" -> InvitedAt.map { x => x.asInstanceOf[js.Any] },
        "MemberStatus" -> MemberStatus.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Invitation]
    }
  }

  @js.native
  trait InviteMembersRequest extends js.Object {
    var AccountIds: js.UndefOr[AccountIdList]
  }

  object InviteMembersRequest {
    def apply(
      AccountIds: js.UndefOr[AccountIdList] = js.undefined): InviteMembersRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AccountIds" -> AccountIds.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InviteMembersRequest]
    }
  }

  @js.native
  trait InviteMembersResponse extends js.Object {
    var UnprocessedAccounts: js.UndefOr[ResultList]
  }

  object InviteMembersResponse {
    def apply(
      UnprocessedAccounts: js.UndefOr[ResultList] = js.undefined): InviteMembersResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UnprocessedAccounts" -> UnprocessedAccounts.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InviteMembersResponse]
    }
  }

  /**
   * <p>The IP filter for querying findings.&gt;</p>
   */
  @js.native
  trait IpFilter extends js.Object {
    var Cidr: js.UndefOr[NonEmptyString]
  }

  object IpFilter {
    def apply(
      Cidr: js.UndefOr[NonEmptyString] = js.undefined): IpFilter = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Cidr" -> Cidr.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[IpFilter]
    }
  }

  /**
   * <p>A keyword filter for querying findings.</p>
   */
  @js.native
  trait KeywordFilter extends js.Object {
    var Value: js.UndefOr[NonEmptyString]
  }

  object KeywordFilter {
    def apply(
      Value: js.UndefOr[NonEmptyString] = js.undefined): KeywordFilter = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Value" -> Value.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[KeywordFilter]
    }
  }

  @js.native
  trait ListEnabledProductsForImportRequest extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var MaxResults: js.UndefOr[MaxResults]
  }

  object ListEnabledProductsForImportRequest {
    def apply(
      NextToken: js.UndefOr[NextToken] = js.undefined,
      MaxResults: js.UndefOr[MaxResults] = js.undefined): ListEnabledProductsForImportRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListEnabledProductsForImportRequest]
    }
  }

  @js.native
  trait ListEnabledProductsForImportResponse extends js.Object {
    var ProductSubscriptions: js.UndefOr[ProductSubscriptionArnList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListEnabledProductsForImportResponse {
    def apply(
      ProductSubscriptions: js.UndefOr[ProductSubscriptionArnList] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): ListEnabledProductsForImportResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ProductSubscriptions" -> ProductSubscriptions.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListEnabledProductsForImportResponse]
    }
  }

  @js.native
  trait ListInvitationsRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListInvitationsRequest {
    def apply(
      MaxResults: js.UndefOr[MaxResults] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): ListInvitationsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListInvitationsRequest]
    }
  }

  @js.native
  trait ListInvitationsResponse extends js.Object {
    var Invitations: js.UndefOr[InvitationList]
    var NextToken: js.UndefOr[NonEmptyString]
  }

  object ListInvitationsResponse {
    def apply(
      Invitations: js.UndefOr[InvitationList] = js.undefined,
      NextToken: js.UndefOr[NonEmptyString] = js.undefined): ListInvitationsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Invitations" -> Invitations.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListInvitationsResponse]
    }
  }

  @js.native
  trait ListMembersRequest extends js.Object {
    var OnlyAssociated: js.UndefOr[Boolean]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListMembersRequest {
    def apply(
      OnlyAssociated: js.UndefOr[Boolean] = js.undefined,
      MaxResults: js.UndefOr[MaxResults] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): ListMembersRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "OnlyAssociated" -> OnlyAssociated.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListMembersRequest]
    }
  }

  @js.native
  trait ListMembersResponse extends js.Object {
    var Members: js.UndefOr[MemberList]
    var NextToken: js.UndefOr[NonEmptyString]
  }

  object ListMembersResponse {
    def apply(
      Members: js.UndefOr[MemberList] = js.undefined,
      NextToken: js.UndefOr[NonEmptyString] = js.undefined): ListMembersResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Members" -> Members.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListMembersResponse]
    }
  }

  /**
   * <p>A list of malware related to a finding.</p>
   */
  @js.native
  trait Malware extends js.Object {
    var Name: js.UndefOr[NonEmptyString]
    var Type: js.UndefOr[MalwareType]
    var Path: js.UndefOr[NonEmptyString]
    var State: js.UndefOr[MalwareState]
  }

  object Malware {
    def apply(
      Name: js.UndefOr[NonEmptyString] = js.undefined,
      Type: js.UndefOr[MalwareType] = js.undefined,
      Path: js.UndefOr[NonEmptyString] = js.undefined,
      State: js.UndefOr[MalwareState] = js.undefined): Malware = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "Type" -> Type.map { x => x.asInstanceOf[js.Any] },
        "Path" -> Path.map { x => x.asInstanceOf[js.Any] },
        "State" -> State.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Malware]
    }
  }

  object MalwareStateEnum {
    val OBSERVED = "OBSERVED"
    val REMOVAL_FAILED = "REMOVAL_FAILED"
    val REMOVED = "REMOVED"

    val values = IndexedSeq(OBSERVED, REMOVAL_FAILED, REMOVED)
  }

  object MalwareTypeEnum {
    val ADWARE = "ADWARE"
    val BLENDED_THREAT = "BLENDED_THREAT"
    val BOTNET_AGENT = "BOTNET_AGENT"
    val COIN_MINER = "COIN_MINER"
    val EXPLOIT_KIT = "EXPLOIT_KIT"
    val KEYLOGGER = "KEYLOGGER"
    val MACRO = "MACRO"
    val POTENTIALLY_UNWANTED = "POTENTIALLY_UNWANTED"
    val SPYWARE = "SPYWARE"
    val RANSOMWARE = "RANSOMWARE"
    val REMOTE_ACCESS = "REMOTE_ACCESS"
    val ROOTKIT = "ROOTKIT"
    val TROJAN = "TROJAN"
    val VIRUS = "VIRUS"
    val WORM = "WORM"

    val values = IndexedSeq(ADWARE, BLENDED_THREAT, BOTNET_AGENT, COIN_MINER, EXPLOIT_KIT, KEYLOGGER, MACRO, POTENTIALLY_UNWANTED, SPYWARE, RANSOMWARE, REMOTE_ACCESS, ROOTKIT, TROJAN, VIRUS, WORM)
  }

  /**
   * <p>The map filter for querying findings.</p>
   */
  @js.native
  trait MapFilter extends js.Object {
    var Key: js.UndefOr[NonEmptyString]
    var Value: js.UndefOr[NonEmptyString]
    var Comparison: js.UndefOr[MapFilterComparison]
  }

  object MapFilter {
    def apply(
      Key: js.UndefOr[NonEmptyString] = js.undefined,
      Value: js.UndefOr[NonEmptyString] = js.undefined,
      Comparison: js.UndefOr[MapFilterComparison] = js.undefined): MapFilter = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Key" -> Key.map { x => x.asInstanceOf[js.Any] },
        "Value" -> Value.map { x => x.asInstanceOf[js.Any] },
        "Comparison" -> Comparison.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MapFilter]
    }
  }

  object MapFilterComparisonEnum {
    val CONTAINS = "CONTAINS"

    val values = IndexedSeq(CONTAINS)
  }

  /**
   * <p>The details for a Security Hub member account.</p>
   */
  @js.native
  trait Member extends js.Object {
    var UpdatedAt: js.UndefOr[Timestamp]
    var MasterId: js.UndefOr[NonEmptyString]
    var Email: js.UndefOr[NonEmptyString]
    var MemberStatus: js.UndefOr[NonEmptyString]
    var AccountId: js.UndefOr[AccountId]
    var InvitedAt: js.UndefOr[Timestamp]
  }

  object Member {
    def apply(
      UpdatedAt: js.UndefOr[Timestamp] = js.undefined,
      MasterId: js.UndefOr[NonEmptyString] = js.undefined,
      Email: js.UndefOr[NonEmptyString] = js.undefined,
      MemberStatus: js.UndefOr[NonEmptyString] = js.undefined,
      AccountId: js.UndefOr[AccountId] = js.undefined,
      InvitedAt: js.UndefOr[Timestamp] = js.undefined): Member = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UpdatedAt" -> UpdatedAt.map { x => x.asInstanceOf[js.Any] },
        "MasterId" -> MasterId.map { x => x.asInstanceOf[js.Any] },
        "Email" -> Email.map { x => x.asInstanceOf[js.Any] },
        "MemberStatus" -> MemberStatus.map { x => x.asInstanceOf[js.Any] },
        "AccountId" -> AccountId.map { x => x.asInstanceOf[js.Any] },
        "InvitedAt" -> InvitedAt.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Member]
    }
  }

  /**
   * <p>The details of network-related information about a finding.</p>
   */
  @js.native
  trait Network extends js.Object {
    var SourceIpV4: js.UndefOr[NonEmptyString]
    var SourceIpV6: js.UndefOr[NonEmptyString]
    var DestinationIpV4: js.UndefOr[NonEmptyString]
    var DestinationPort: js.UndefOr[Int]
    var DestinationDomain: js.UndefOr[NonEmptyString]
    var SourceMac: js.UndefOr[NonEmptyString]
    var Protocol: js.UndefOr[NonEmptyString]
    var SourcePort: js.UndefOr[Int]
    var DestinationIpV6: js.UndefOr[NonEmptyString]
    var SourceDomain: js.UndefOr[NonEmptyString]
    var Direction: js.UndefOr[NetworkDirection]
  }

  object Network {
    def apply(
      SourceIpV4: js.UndefOr[NonEmptyString] = js.undefined,
      SourceIpV6: js.UndefOr[NonEmptyString] = js.undefined,
      DestinationIpV4: js.UndefOr[NonEmptyString] = js.undefined,
      DestinationPort: js.UndefOr[Int] = js.undefined,
      DestinationDomain: js.UndefOr[NonEmptyString] = js.undefined,
      SourceMac: js.UndefOr[NonEmptyString] = js.undefined,
      Protocol: js.UndefOr[NonEmptyString] = js.undefined,
      SourcePort: js.UndefOr[Int] = js.undefined,
      DestinationIpV6: js.UndefOr[NonEmptyString] = js.undefined,
      SourceDomain: js.UndefOr[NonEmptyString] = js.undefined,
      Direction: js.UndefOr[NetworkDirection] = js.undefined): Network = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SourceIpV4" -> SourceIpV4.map { x => x.asInstanceOf[js.Any] },
        "SourceIpV6" -> SourceIpV6.map { x => x.asInstanceOf[js.Any] },
        "DestinationIpV4" -> DestinationIpV4.map { x => x.asInstanceOf[js.Any] },
        "DestinationPort" -> DestinationPort.map { x => x.asInstanceOf[js.Any] },
        "DestinationDomain" -> DestinationDomain.map { x => x.asInstanceOf[js.Any] },
        "SourceMac" -> SourceMac.map { x => x.asInstanceOf[js.Any] },
        "Protocol" -> Protocol.map { x => x.asInstanceOf[js.Any] },
        "SourcePort" -> SourcePort.map { x => x.asInstanceOf[js.Any] },
        "DestinationIpV6" -> DestinationIpV6.map { x => x.asInstanceOf[js.Any] },
        "SourceDomain" -> SourceDomain.map { x => x.asInstanceOf[js.Any] },
        "Direction" -> Direction.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Network]
    }
  }

  object NetworkDirectionEnum {
    val IN = "IN"
    val OUT = "OUT"

    val values = IndexedSeq(IN, OUT)
  }

  /**
   * <p>A user-defined note added to a finding.</p>
   */
  @js.native
  trait Note extends js.Object {
    var Text: js.UndefOr[NonEmptyString]
    var UpdatedBy: js.UndefOr[NonEmptyString]
    var UpdatedAt: js.UndefOr[NonEmptyString]
  }

  object Note {
    def apply(
      Text: js.UndefOr[NonEmptyString] = js.undefined,
      UpdatedBy: js.UndefOr[NonEmptyString] = js.undefined,
      UpdatedAt: js.UndefOr[NonEmptyString] = js.undefined): Note = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Text" -> Text.map { x => x.asInstanceOf[js.Any] },
        "UpdatedBy" -> UpdatedBy.map { x => x.asInstanceOf[js.Any] },
        "UpdatedAt" -> UpdatedAt.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Note]
    }
  }

  /**
   * <p>The updated note.</p>
   */
  @js.native
  trait NoteUpdate extends js.Object {
    var Text: js.UndefOr[NonEmptyString]
    var UpdatedBy: js.UndefOr[NonEmptyString]
  }

  object NoteUpdate {
    def apply(
      Text: js.UndefOr[NonEmptyString] = js.undefined,
      UpdatedBy: js.UndefOr[NonEmptyString] = js.undefined): NoteUpdate = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Text" -> Text.map { x => x.asInstanceOf[js.Any] },
        "UpdatedBy" -> UpdatedBy.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[NoteUpdate]
    }
  }

  /**
   * <p>A number filter for querying findings.</p>
   */
  @js.native
  trait NumberFilter extends js.Object {
    var Gte: js.UndefOr[Double]
    var Lte: js.UndefOr[Double]
    var Eq: js.UndefOr[Double]
  }

  object NumberFilter {
    def apply(
      Gte: js.UndefOr[Double] = js.undefined,
      Lte: js.UndefOr[Double] = js.undefined,
      Eq: js.UndefOr[Double] = js.undefined): NumberFilter = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Gte" -> Gte.map { x => x.asInstanceOf[js.Any] },
        "Lte" -> Lte.map { x => x.asInstanceOf[js.Any] },
        "Eq" -> Eq.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[NumberFilter]
    }
  }

  object PartitionEnum {
    val aws = "aws"
    val `aws-cn` = "aws-cn"
    val `aws-us-gov` = "aws-us-gov"

    val values = IndexedSeq(aws, `aws-cn`, `aws-us-gov`)
  }

  /**
   * <p>The details of process-related information about a finding.</p>
   */
  @js.native
  trait ProcessDetails extends js.Object {
    var Name: js.UndefOr[NonEmptyString]
    var Path: js.UndefOr[NonEmptyString]
    var TerminatedAt: js.UndefOr[NonEmptyString]
    var LaunchedAt: js.UndefOr[NonEmptyString]
    var ParentPid: js.UndefOr[Int]
    var Pid: js.UndefOr[Int]
  }

  object ProcessDetails {
    def apply(
      Name: js.UndefOr[NonEmptyString] = js.undefined,
      Path: js.UndefOr[NonEmptyString] = js.undefined,
      TerminatedAt: js.UndefOr[NonEmptyString] = js.undefined,
      LaunchedAt: js.UndefOr[NonEmptyString] = js.undefined,
      ParentPid: js.UndefOr[Int] = js.undefined,
      Pid: js.UndefOr[Int] = js.undefined): ProcessDetails = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "Path" -> Path.map { x => x.asInstanceOf[js.Any] },
        "TerminatedAt" -> TerminatedAt.map { x => x.asInstanceOf[js.Any] },
        "LaunchedAt" -> LaunchedAt.map { x => x.asInstanceOf[js.Any] },
        "ParentPid" -> ParentPid.map { x => x.asInstanceOf[js.Any] },
        "Pid" -> Pid.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ProcessDetails]
    }
  }

  /**
   * <p>Provides a recommendation on how to remediate the issue identified within a finding.</p>
   */
  @js.native
  trait Recommendation extends js.Object {
    var Text: js.UndefOr[NonEmptyString]
    var Url: js.UndefOr[NonEmptyString]
  }

  object Recommendation {
    def apply(
      Text: js.UndefOr[NonEmptyString] = js.undefined,
      Url: js.UndefOr[NonEmptyString] = js.undefined): Recommendation = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Text" -> Text.map { x => x.asInstanceOf[js.Any] },
        "Url" -> Url.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Recommendation]
    }
  }

  object RecordStateEnum {
    val ACTIVE = "ACTIVE"
    val ARCHIVED = "ARCHIVED"

    val values = IndexedSeq(ACTIVE, ARCHIVED)
  }

  /**
   * <p>Related finding's details.</p>
   */
  @js.native
  trait RelatedFinding extends js.Object {
    var ProductArn: js.UndefOr[NonEmptyString]
    var Id: js.UndefOr[NonEmptyString]
  }

  object RelatedFinding {
    def apply(
      ProductArn: js.UndefOr[NonEmptyString] = js.undefined,
      Id: js.UndefOr[NonEmptyString] = js.undefined): RelatedFinding = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ProductArn" -> ProductArn.map { x => x.asInstanceOf[js.Any] },
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RelatedFinding]
    }
  }

  /**
   * <p>The remediation options for a finding. </p>
   */
  @js.native
  trait Remediation extends js.Object {
    var Recommendation: js.UndefOr[Recommendation]
  }

  object Remediation {
    def apply(
      Recommendation: js.UndefOr[Recommendation] = js.undefined): Remediation = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Recommendation" -> Recommendation.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Remediation]
    }
  }

  /**
   * <p>A resource data type that describes a resource to which the finding refers.</p>
   */
  @js.native
  trait Resource extends js.Object {
    var Id: js.UndefOr[NonEmptyString]
    var Region: js.UndefOr[NonEmptyString]
    var Details: js.UndefOr[ResourceDetails]
    var Partition: js.UndefOr[Partition]
    var Tags: js.UndefOr[FieldMap]
    var Type: js.UndefOr[NonEmptyString]
  }

  object Resource {
    def apply(
      Id: js.UndefOr[NonEmptyString] = js.undefined,
      Region: js.UndefOr[NonEmptyString] = js.undefined,
      Details: js.UndefOr[ResourceDetails] = js.undefined,
      Partition: js.UndefOr[Partition] = js.undefined,
      Tags: js.UndefOr[FieldMap] = js.undefined,
      Type: js.UndefOr[NonEmptyString] = js.undefined): Resource = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] },
        "Region" -> Region.map { x => x.asInstanceOf[js.Any] },
        "Details" -> Details.map { x => x.asInstanceOf[js.Any] },
        "Partition" -> Partition.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] },
        "Type" -> Type.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Resource]
    }
  }

  /**
   * <p>Provides additional details about the resource.</p>
   */
  @js.native
  trait ResourceDetails extends js.Object {
    var AwsEc2Instance: js.UndefOr[AwsEc2InstanceDetails]
    var Other: js.UndefOr[FieldMap]
    var AwsIamAccessKey: js.UndefOr[AwsIamAccessKeyDetails]
    var AwsS3Bucket: js.UndefOr[AwsS3BucketDetails]
    var Container: js.UndefOr[ContainerDetails]
  }

  object ResourceDetails {
    def apply(
      AwsEc2Instance: js.UndefOr[AwsEc2InstanceDetails] = js.undefined,
      Other: js.UndefOr[FieldMap] = js.undefined,
      AwsIamAccessKey: js.UndefOr[AwsIamAccessKeyDetails] = js.undefined,
      AwsS3Bucket: js.UndefOr[AwsS3BucketDetails] = js.undefined,
      Container: js.UndefOr[ContainerDetails] = js.undefined): ResourceDetails = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AwsEc2Instance" -> AwsEc2Instance.map { x => x.asInstanceOf[js.Any] },
        "Other" -> Other.map { x => x.asInstanceOf[js.Any] },
        "AwsIamAccessKey" -> AwsIamAccessKey.map { x => x.asInstanceOf[js.Any] },
        "AwsS3Bucket" -> AwsS3Bucket.map { x => x.asInstanceOf[js.Any] },
        "Container" -> Container.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResourceDetails]
    }
  }

  /**
   * <p>The account details that could not be processed.</p>
   */
  @js.native
  trait Result extends js.Object {
    var AccountId: js.UndefOr[AccountId]
    var ProcessingResult: js.UndefOr[NonEmptyString]
  }

  object Result {
    def apply(
      AccountId: js.UndefOr[AccountId] = js.undefined,
      ProcessingResult: js.UndefOr[NonEmptyString] = js.undefined): Result = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AccountId" -> AccountId.map { x => x.asInstanceOf[js.Any] },
        "ProcessingResult" -> ProcessingResult.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Result]
    }
  }

  /**
   * <p>A finding's severity.</p>
   */
  @js.native
  trait Severity extends js.Object {
    var Product: js.UndefOr[Double]
    var Normalized: js.UndefOr[Int]
  }

  object Severity {
    def apply(
      Product: js.UndefOr[Double] = js.undefined,
      Normalized: js.UndefOr[Int] = js.undefined): Severity = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Product" -> Product.map { x => x.asInstanceOf[js.Any] },
        "Normalized" -> Normalized.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Severity]
    }
  }

  /**
   * <p>A collection of attributes used for sorting findings.</p>
   */
  @js.native
  trait SortCriterion extends js.Object {
    var Field: js.UndefOr[NonEmptyString]
    var SortOrder: js.UndefOr[SortOrder]
  }

  object SortCriterion {
    def apply(
      Field: js.UndefOr[NonEmptyString] = js.undefined,
      SortOrder: js.UndefOr[SortOrder] = js.undefined): SortCriterion = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Field" -> Field.map { x => x.asInstanceOf[js.Any] },
        "SortOrder" -> SortOrder.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SortCriterion]
    }
  }

  object SortOrderEnum {
    val asc = "asc"
    val desc = "desc"

    val values = IndexedSeq(asc, desc)
  }

  object StandardsStatusEnum {
    val PENDING = "PENDING"
    val READY = "READY"
    val FAILED = "FAILED"
    val DELETING = "DELETING"

    val values = IndexedSeq(PENDING, READY, FAILED, DELETING)
  }

  /**
   * <p>A resource that represents your subscription to a supported standard.</p>
   */
  @js.native
  trait StandardsSubscription extends js.Object {
    var StandardsSubscriptionArn: js.UndefOr[NonEmptyString]
    var StandardsArn: js.UndefOr[NonEmptyString]
    var StandardsInput: js.UndefOr[StandardsInputParameterMap]
    var StandardsStatus: js.UndefOr[StandardsStatus]
  }

  object StandardsSubscription {
    def apply(
      StandardsSubscriptionArn: js.UndefOr[NonEmptyString] = js.undefined,
      StandardsArn: js.UndefOr[NonEmptyString] = js.undefined,
      StandardsInput: js.UndefOr[StandardsInputParameterMap] = js.undefined,
      StandardsStatus: js.UndefOr[StandardsStatus] = js.undefined): StandardsSubscription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StandardsSubscriptionArn" -> StandardsSubscriptionArn.map { x => x.asInstanceOf[js.Any] },
        "StandardsArn" -> StandardsArn.map { x => x.asInstanceOf[js.Any] },
        "StandardsInput" -> StandardsInput.map { x => x.asInstanceOf[js.Any] },
        "StandardsStatus" -> StandardsStatus.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StandardsSubscription]
    }
  }

  /**
   * <p>The standard that you want to enable.</p>
   */
  @js.native
  trait StandardsSubscriptionRequest extends js.Object {
    var StandardsArn: js.UndefOr[NonEmptyString]
    var StandardsInput: js.UndefOr[StandardsInputParameterMap]
  }

  object StandardsSubscriptionRequest {
    def apply(
      StandardsArn: js.UndefOr[NonEmptyString] = js.undefined,
      StandardsInput: js.UndefOr[StandardsInputParameterMap] = js.undefined): StandardsSubscriptionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StandardsArn" -> StandardsArn.map { x => x.asInstanceOf[js.Any] },
        "StandardsInput" -> StandardsInput.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StandardsSubscriptionRequest]
    }
  }

  /**
   * <p>A string filter for querying findings.</p>
   */
  @js.native
  trait StringFilter extends js.Object {
    var Value: js.UndefOr[NonEmptyString]
    var Comparison: js.UndefOr[StringFilterComparison]
  }

  object StringFilter {
    def apply(
      Value: js.UndefOr[NonEmptyString] = js.undefined,
      Comparison: js.UndefOr[StringFilterComparison] = js.undefined): StringFilter = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Value" -> Value.map { x => x.asInstanceOf[js.Any] },
        "Comparison" -> Comparison.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StringFilter]
    }
  }

  object StringFilterComparisonEnum {
    val EQUALS = "EQUALS"
    val CONTAINS = "CONTAINS"
    val PREFIX = "PREFIX"

    val values = IndexedSeq(EQUALS, CONTAINS, PREFIX)
  }

  /**
   * <p>Threat intel details related to a finding.</p>
   */
  @js.native
  trait ThreatIntelIndicator extends js.Object {
    var Category: js.UndefOr[ThreatIntelIndicatorCategory]
    var LastObservedAt: js.UndefOr[NonEmptyString]
    var Value: js.UndefOr[NonEmptyString]
    var Source: js.UndefOr[NonEmptyString]
    var SourceUrl: js.UndefOr[NonEmptyString]
    var Type: js.UndefOr[ThreatIntelIndicatorType]
  }

  object ThreatIntelIndicator {
    def apply(
      Category: js.UndefOr[ThreatIntelIndicatorCategory] = js.undefined,
      LastObservedAt: js.UndefOr[NonEmptyString] = js.undefined,
      Value: js.UndefOr[NonEmptyString] = js.undefined,
      Source: js.UndefOr[NonEmptyString] = js.undefined,
      SourceUrl: js.UndefOr[NonEmptyString] = js.undefined,
      Type: js.UndefOr[ThreatIntelIndicatorType] = js.undefined): ThreatIntelIndicator = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Category" -> Category.map { x => x.asInstanceOf[js.Any] },
        "LastObservedAt" -> LastObservedAt.map { x => x.asInstanceOf[js.Any] },
        "Value" -> Value.map { x => x.asInstanceOf[js.Any] },
        "Source" -> Source.map { x => x.asInstanceOf[js.Any] },
        "SourceUrl" -> SourceUrl.map { x => x.asInstanceOf[js.Any] },
        "Type" -> Type.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ThreatIntelIndicator]
    }
  }

  object ThreatIntelIndicatorCategoryEnum {
    val BACKDOOR = "BACKDOOR"
    val CARD_STEALER = "CARD_STEALER"
    val COMMAND_AND_CONTROL = "COMMAND_AND_CONTROL"
    val DROP_SITE = "DROP_SITE"
    val EXPLOIT_SITE = "EXPLOIT_SITE"
    val KEYLOGGER = "KEYLOGGER"

    val values = IndexedSeq(BACKDOOR, CARD_STEALER, COMMAND_AND_CONTROL, DROP_SITE, EXPLOIT_SITE, KEYLOGGER)
  }

  object ThreatIntelIndicatorTypeEnum {
    val DOMAIN = "DOMAIN"
    val EMAIL_ADDRESS = "EMAIL_ADDRESS"
    val HASH_MD5 = "HASH_MD5"
    val HASH_SHA1 = "HASH_SHA1"
    val HASH_SHA256 = "HASH_SHA256"
    val HASH_SHA512 = "HASH_SHA512"
    val IPV4_ADDRESS = "IPV4_ADDRESS"
    val IPV6_ADDRESS = "IPV6_ADDRESS"
    val MUTEX = "MUTEX"
    val PROCESS = "PROCESS"
    val URL = "URL"

    val values = IndexedSeq(DOMAIN, EMAIL_ADDRESS, HASH_MD5, HASH_SHA1, HASH_SHA256, HASH_SHA512, IPV4_ADDRESS, IPV6_ADDRESS, MUTEX, PROCESS, URL)
  }

  @js.native
  trait UpdateFindingsRequest extends js.Object {
    var Filters: js.UndefOr[AwsSecurityFindingFilters]
    var Note: js.UndefOr[NoteUpdate]
    var RecordState: js.UndefOr[RecordState]
  }

  object UpdateFindingsRequest {
    def apply(
      Filters: js.UndefOr[AwsSecurityFindingFilters] = js.undefined,
      Note: js.UndefOr[NoteUpdate] = js.undefined,
      RecordState: js.UndefOr[RecordState] = js.undefined): UpdateFindingsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "Note" -> Note.map { x => x.asInstanceOf[js.Any] },
        "RecordState" -> RecordState.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateFindingsRequest]
    }
  }

  @js.native
  trait UpdateFindingsResponse extends js.Object {

  }

  object UpdateFindingsResponse {
    def apply(): UpdateFindingsResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateFindingsResponse]
    }
  }

  @js.native
  trait UpdateInsightRequest extends js.Object {
    var InsightArn: js.UndefOr[NonEmptyString]
    var Name: js.UndefOr[NonEmptyString]
    var Filters: js.UndefOr[AwsSecurityFindingFilters]
    var GroupByAttribute: js.UndefOr[NonEmptyString]
  }

  object UpdateInsightRequest {
    def apply(
      InsightArn: js.UndefOr[NonEmptyString] = js.undefined,
      Name: js.UndefOr[NonEmptyString] = js.undefined,
      Filters: js.UndefOr[AwsSecurityFindingFilters] = js.undefined,
      GroupByAttribute: js.UndefOr[NonEmptyString] = js.undefined): UpdateInsightRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InsightArn" -> InsightArn.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "GroupByAttribute" -> GroupByAttribute.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateInsightRequest]
    }
  }

  @js.native
  trait UpdateInsightResponse extends js.Object {

  }

  object UpdateInsightResponse {
    def apply(): UpdateInsightResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateInsightResponse]
    }
  }

  object VerificationStateEnum {
    val UNKNOWN = "UNKNOWN"
    val TRUE_POSITIVE = "TRUE_POSITIVE"
    val FALSE_POSITIVE = "FALSE_POSITIVE"
    val BENIGN_POSITIVE = "BENIGN_POSITIVE"

    val values = IndexedSeq(UNKNOWN, TRUE_POSITIVE, FALSE_POSITIVE, BENIGN_POSITIVE)
  }

  object WorkflowStateEnum {
    val NEW = "NEW"
    val ASSIGNED = "ASSIGNED"
    val IN_PROGRESS = "IN_PROGRESS"
    val DEFERRED = "DEFERRED"
    val RESOLVED = "RESOLVED"

    val values = IndexedSeq(NEW, ASSIGNED, IN_PROGRESS, DEFERRED, RESOLVED)
  }
}
