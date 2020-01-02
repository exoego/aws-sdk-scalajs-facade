package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import io.scalajs.nodejs
import facade.amazonaws._

package object securityhub {
  type AccountDetailsList                      = js.Array[AccountDetails]
  type AccountId                               = String
  type AccountIdList                           = js.Array[NonEmptyString]
  type ActionTargetList                        = js.Array[ActionTarget]
  type ArnList                                 = js.Array[NonEmptyString]
  type AvailabilityZones                       = js.Array[AvailabilityZone]
  type AwsCloudFrontDistributionOriginItemList = js.Array[AwsCloudFrontDistributionOriginItem]
  type AwsIamAccessKeyStatus                   = String
  type AwsIamRoleAssumeRolePolicyDocument      = String
  type AwsLambdaFunctionLayerList              = js.Array[AwsLambdaFunctionLayer]
  type AwsSecurityFindingList                  = js.Array[AwsSecurityFinding]
  type AwsSnsTopicSubscriptionList             = js.Array[AwsSnsTopicSubscription]
  type CategoryList                            = js.Array[NonEmptyString]
  type ComplianceStatus                        = String
  type DateFilterList                          = js.Array[DateFilter]
  type DateRangeUnit                           = String
  type FieldMap                                = js.Dictionary[NonEmptyString]
  type ImportFindingsErrorList                 = js.Array[ImportFindingsError]
  type InsightList                             = js.Array[Insight]
  type InsightResultValueList                  = js.Array[InsightResultValue]
  type InvitationList                          = js.Array[Invitation]
  type IpFilterList                            = js.Array[IpFilter]
  type KeywordFilterList                       = js.Array[KeywordFilter]
  type MalwareList                             = js.Array[Malware]
  type MalwareState                            = String
  type MalwareType                             = String
  type MapFilterComparison                     = String
  type MapFilterList                           = js.Array[MapFilter]
  type MaxResults                              = Int
  type MemberList                              = js.Array[Member]
  type NetworkDirection                        = String
  type NextToken                               = String
  type NonEmptyString                          = String
  type NonEmptyStringList                      = js.Array[NonEmptyString]
  type NumberFilterList                        = js.Array[NumberFilter]
  type Partition                               = String
  type ProductSubscriptionArnList              = js.Array[NonEmptyString]
  type ProductsList                            = js.Array[Product]
  type RecordState                             = String
  type RelatedFindingList                      = js.Array[RelatedFinding]
  type ResourceArn                             = String
  type ResourceList                            = js.Array[Resource]
  type ResultList                              = js.Array[Result]
  type SecurityGroups                          = js.Array[NonEmptyString]
  type SortCriteria                            = js.Array[SortCriterion]
  type SortOrder                               = String
  type StandardsInputParameterMap              = js.Dictionary[NonEmptyString]
  type StandardsStatus                         = String
  type StandardsSubscriptionArns               = js.Array[NonEmptyString]
  type StandardsSubscriptionRequests           = js.Array[StandardsSubscriptionRequest]
  type StandardsSubscriptions                  = js.Array[StandardsSubscription]
  type StringFilterComparison                  = String
  type StringFilterList                        = js.Array[StringFilter]
  type StringList                              = js.Array[NonEmptyString]
  type TagKey                                  = String
  type TagKeyList                              = js.Array[TagKey]
  type TagMap                                  = js.Dictionary[TagValue]
  type TagValue                                = String
  type ThreatIntelIndicatorCategory            = String
  type ThreatIntelIndicatorList                = js.Array[ThreatIntelIndicator]
  type ThreatIntelIndicatorType                = String
  type Timestamp                               = js.Date
  type TypeList                                = js.Array[NonEmptyString]
  type VerificationState                       = String
  type WorkflowState                           = String

  implicit final class SecurityHubOps(private val service: SecurityHub) extends AnyVal {

    @inline def acceptInvitationFuture(params: AcceptInvitationRequest): Future[AcceptInvitationResponse] =
      service.acceptInvitation(params).promise.toFuture
    @inline def batchDisableStandardsFuture(
        params: BatchDisableStandardsRequest
    ): Future[BatchDisableStandardsResponse] = service.batchDisableStandards(params).promise.toFuture
    @inline def batchEnableStandardsFuture(params: BatchEnableStandardsRequest): Future[BatchEnableStandardsResponse] =
      service.batchEnableStandards(params).promise.toFuture
    @inline def batchImportFindingsFuture(params: BatchImportFindingsRequest): Future[BatchImportFindingsResponse] =
      service.batchImportFindings(params).promise.toFuture
    @inline def createActionTargetFuture(params: CreateActionTargetRequest): Future[CreateActionTargetResponse] =
      service.createActionTarget(params).promise.toFuture
    @inline def createInsightFuture(params: CreateInsightRequest): Future[CreateInsightResponse] =
      service.createInsight(params).promise.toFuture
    @inline def createMembersFuture(params: CreateMembersRequest): Future[CreateMembersResponse] =
      service.createMembers(params).promise.toFuture
    @inline def declineInvitationsFuture(params: DeclineInvitationsRequest): Future[DeclineInvitationsResponse] =
      service.declineInvitations(params).promise.toFuture
    @inline def deleteActionTargetFuture(params: DeleteActionTargetRequest): Future[DeleteActionTargetResponse] =
      service.deleteActionTarget(params).promise.toFuture
    @inline def deleteInsightFuture(params: DeleteInsightRequest): Future[DeleteInsightResponse] =
      service.deleteInsight(params).promise.toFuture
    @inline def deleteInvitationsFuture(params: DeleteInvitationsRequest): Future[DeleteInvitationsResponse] =
      service.deleteInvitations(params).promise.toFuture
    @inline def deleteMembersFuture(params: DeleteMembersRequest): Future[DeleteMembersResponse] =
      service.deleteMembers(params).promise.toFuture
    @inline def describeActionTargetsFuture(
        params: DescribeActionTargetsRequest
    ): Future[DescribeActionTargetsResponse] = service.describeActionTargets(params).promise.toFuture
    @inline def describeHubFuture(params: DescribeHubRequest): Future[DescribeHubResponse] =
      service.describeHub(params).promise.toFuture
    @inline def describeProductsFuture(params: DescribeProductsRequest): Future[DescribeProductsResponse] =
      service.describeProducts(params).promise.toFuture
    @inline def disableImportFindingsForProductFuture(
        params: DisableImportFindingsForProductRequest
    ): Future[DisableImportFindingsForProductResponse] =
      service.disableImportFindingsForProduct(params).promise.toFuture
    @inline def disableSecurityHubFuture(params: DisableSecurityHubRequest): Future[DisableSecurityHubResponse] =
      service.disableSecurityHub(params).promise.toFuture
    @inline def disassociateFromMasterAccountFuture(
        params: DisassociateFromMasterAccountRequest
    ): Future[DisassociateFromMasterAccountResponse] = service.disassociateFromMasterAccount(params).promise.toFuture
    @inline def disassociateMembersFuture(params: DisassociateMembersRequest): Future[DisassociateMembersResponse] =
      service.disassociateMembers(params).promise.toFuture
    @inline def enableImportFindingsForProductFuture(
        params: EnableImportFindingsForProductRequest
    ): Future[EnableImportFindingsForProductResponse] = service.enableImportFindingsForProduct(params).promise.toFuture
    @inline def enableSecurityHubFuture(params: EnableSecurityHubRequest): Future[EnableSecurityHubResponse] =
      service.enableSecurityHub(params).promise.toFuture
    @inline def getEnabledStandardsFuture(params: GetEnabledStandardsRequest): Future[GetEnabledStandardsResponse] =
      service.getEnabledStandards(params).promise.toFuture
    @inline def getFindingsFuture(params: GetFindingsRequest): Future[GetFindingsResponse] =
      service.getFindings(params).promise.toFuture
    @inline def getInsightResultsFuture(params: GetInsightResultsRequest): Future[GetInsightResultsResponse] =
      service.getInsightResults(params).promise.toFuture
    @inline def getInsightsFuture(params: GetInsightsRequest): Future[GetInsightsResponse] =
      service.getInsights(params).promise.toFuture
    @inline def getInvitationsCountFuture(params: GetInvitationsCountRequest): Future[GetInvitationsCountResponse] =
      service.getInvitationsCount(params).promise.toFuture
    @inline def getMasterAccountFuture(params: GetMasterAccountRequest): Future[GetMasterAccountResponse] =
      service.getMasterAccount(params).promise.toFuture
    @inline def getMembersFuture(params: GetMembersRequest): Future[GetMembersResponse] =
      service.getMembers(params).promise.toFuture
    @inline def inviteMembersFuture(params: InviteMembersRequest): Future[InviteMembersResponse] =
      service.inviteMembers(params).promise.toFuture
    @inline def listEnabledProductsForImportFuture(
        params: ListEnabledProductsForImportRequest
    ): Future[ListEnabledProductsForImportResponse] = service.listEnabledProductsForImport(params).promise.toFuture
    @inline def listInvitationsFuture(params: ListInvitationsRequest): Future[ListInvitationsResponse] =
      service.listInvitations(params).promise.toFuture
    @inline def listMembersFuture(params: ListMembersRequest): Future[ListMembersResponse] =
      service.listMembers(params).promise.toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] =
      service.listTagsForResource(params).promise.toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] =
      service.tagResource(params).promise.toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] =
      service.untagResource(params).promise.toFuture
    @inline def updateActionTargetFuture(params: UpdateActionTargetRequest): Future[UpdateActionTargetResponse] =
      service.updateActionTarget(params).promise.toFuture
    @inline def updateFindingsFuture(params: UpdateFindingsRequest): Future[UpdateFindingsResponse] =
      service.updateFindings(params).promise.toFuture
    @inline def updateInsightFuture(params: UpdateInsightRequest): Future[UpdateInsightResponse] =
      service.updateInsight(params).promise.toFuture
  }
}

package securityhub {
  @js.native
  @JSImport("aws-sdk", "SecurityHub")
  class SecurityHub() extends js.Object {
    def this(config: AWSConfig) = this()

    def acceptInvitation(params: AcceptInvitationRequest): Request[AcceptInvitationResponse]                = js.native
    def batchDisableStandards(params: BatchDisableStandardsRequest): Request[BatchDisableStandardsResponse] = js.native
    def batchEnableStandards(params: BatchEnableStandardsRequest): Request[BatchEnableStandardsResponse]    = js.native
    def batchImportFindings(params: BatchImportFindingsRequest): Request[BatchImportFindingsResponse]       = js.native
    def createActionTarget(params: CreateActionTargetRequest): Request[CreateActionTargetResponse]          = js.native
    def createInsight(params: CreateInsightRequest): Request[CreateInsightResponse]                         = js.native
    def createMembers(params: CreateMembersRequest): Request[CreateMembersResponse]                         = js.native
    def declineInvitations(params: DeclineInvitationsRequest): Request[DeclineInvitationsResponse]          = js.native
    def deleteActionTarget(params: DeleteActionTargetRequest): Request[DeleteActionTargetResponse]          = js.native
    def deleteInsight(params: DeleteInsightRequest): Request[DeleteInsightResponse]                         = js.native
    def deleteInvitations(params: DeleteInvitationsRequest): Request[DeleteInvitationsResponse]             = js.native
    def deleteMembers(params: DeleteMembersRequest): Request[DeleteMembersResponse]                         = js.native
    def describeActionTargets(params: DescribeActionTargetsRequest): Request[DescribeActionTargetsResponse] = js.native
    def describeHub(params: DescribeHubRequest): Request[DescribeHubResponse]                               = js.native
    def describeProducts(params: DescribeProductsRequest): Request[DescribeProductsResponse]                = js.native
    def disableImportFindingsForProduct(
        params: DisableImportFindingsForProductRequest
    ): Request[DisableImportFindingsForProductResponse]                                            = js.native
    def disableSecurityHub(params: DisableSecurityHubRequest): Request[DisableSecurityHubResponse] = js.native
    def disassociateFromMasterAccount(
        params: DisassociateFromMasterAccountRequest
    ): Request[DisassociateFromMasterAccountResponse]                                                 = js.native
    def disassociateMembers(params: DisassociateMembersRequest): Request[DisassociateMembersResponse] = js.native
    def enableImportFindingsForProduct(
        params: EnableImportFindingsForProductRequest
    ): Request[EnableImportFindingsForProductResponse]                                                = js.native
    def enableSecurityHub(params: EnableSecurityHubRequest): Request[EnableSecurityHubResponse]       = js.native
    def getEnabledStandards(params: GetEnabledStandardsRequest): Request[GetEnabledStandardsResponse] = js.native
    def getFindings(params: GetFindingsRequest): Request[GetFindingsResponse]                         = js.native
    def getInsightResults(params: GetInsightResultsRequest): Request[GetInsightResultsResponse]       = js.native
    def getInsights(params: GetInsightsRequest): Request[GetInsightsResponse]                         = js.native
    def getInvitationsCount(params: GetInvitationsCountRequest): Request[GetInvitationsCountResponse] = js.native
    def getMasterAccount(params: GetMasterAccountRequest): Request[GetMasterAccountResponse]          = js.native
    def getMembers(params: GetMembersRequest): Request[GetMembersResponse]                            = js.native
    def inviteMembers(params: InviteMembersRequest): Request[InviteMembersResponse]                   = js.native
    def listEnabledProductsForImport(
        params: ListEnabledProductsForImportRequest
    ): Request[ListEnabledProductsForImportResponse]                                                  = js.native
    def listInvitations(params: ListInvitationsRequest): Request[ListInvitationsResponse]             = js.native
    def listMembers(params: ListMembersRequest): Request[ListMembersResponse]                         = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse]                         = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse]                   = js.native
    def updateActionTarget(params: UpdateActionTargetRequest): Request[UpdateActionTargetResponse]    = js.native
    def updateFindings(params: UpdateFindingsRequest): Request[UpdateFindingsResponse]                = js.native
    def updateInsight(params: UpdateInsightRequest): Request[UpdateInsightResponse]                   = js.native
  }

  @js.native
  trait AcceptInvitationRequest extends js.Object {
    var InvitationId: NonEmptyString
    var MasterId: NonEmptyString
  }

  object AcceptInvitationRequest {
    @inline
    def apply(
        InvitationId: NonEmptyString,
        MasterId: NonEmptyString
    ): AcceptInvitationRequest = {
      val __obj = js.Dynamic.literal(
        "InvitationId" -> InvitationId.asInstanceOf[js.Any],
        "MasterId"     -> MasterId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[AcceptInvitationRequest]
    }
  }

  @js.native
  trait AcceptInvitationResponse extends js.Object {}

  object AcceptInvitationResponse {
    @inline
    def apply(
        ): AcceptInvitationResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[AcceptInvitationResponse]
    }
  }

  /**
    * The details of an AWS account.
    */
  @js.native
  trait AccountDetails extends js.Object {
    var AccountId: js.UndefOr[AccountId]
    var Email: js.UndefOr[NonEmptyString]
  }

  object AccountDetails {
    @inline
    def apply(
        AccountId: js.UndefOr[AccountId] = js.undefined,
        Email: js.UndefOr[NonEmptyString] = js.undefined
    ): AccountDetails = {
      val __obj = js.Dynamic.literal()
      AccountId.foreach(__v => __obj.updateDynamic("AccountId")(__v.asInstanceOf[js.Any]))
      Email.foreach(__v => __obj.updateDynamic("Email")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AccountDetails]
    }
  }

  /**
    * An <code>ActionTarget</code> object.
    */
  @js.native
  trait ActionTarget extends js.Object {
    var ActionTargetArn: NonEmptyString
    var Description: NonEmptyString
    var Name: NonEmptyString
  }

  object ActionTarget {
    @inline
    def apply(
        ActionTargetArn: NonEmptyString,
        Description: NonEmptyString,
        Name: NonEmptyString
    ): ActionTarget = {
      val __obj = js.Dynamic.literal(
        "ActionTargetArn" -> ActionTargetArn.asInstanceOf[js.Any],
        "Description"     -> Description.asInstanceOf[js.Any],
        "Name"            -> Name.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ActionTarget]
    }
  }

  /**
    * Information about an Availability Zone.
    */
  @js.native
  trait AvailabilityZone extends js.Object {
    var SubnetId: js.UndefOr[NonEmptyString]
    var ZoneName: js.UndefOr[NonEmptyString]
  }

  object AvailabilityZone {
    @inline
    def apply(
        SubnetId: js.UndefOr[NonEmptyString] = js.undefined,
        ZoneName: js.UndefOr[NonEmptyString] = js.undefined
    ): AvailabilityZone = {
      val __obj = js.Dynamic.literal()
      SubnetId.foreach(__v => __obj.updateDynamic("SubnetId")(__v.asInstanceOf[js.Any]))
      ZoneName.foreach(__v => __obj.updateDynamic("ZoneName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AvailabilityZone]
    }
  }

  /**
    * A distribution configuration.
    */
  @js.native
  trait AwsCloudFrontDistributionDetails extends js.Object {
    var DomainName: js.UndefOr[NonEmptyString]
    var ETag: js.UndefOr[NonEmptyString]
    var LastModifiedTime: js.UndefOr[NonEmptyString]
    var Logging: js.UndefOr[AwsCloudFrontDistributionLogging]
    var Origins: js.UndefOr[AwsCloudFrontDistributionOrigins]
    var Status: js.UndefOr[NonEmptyString]
    var WebAclId: js.UndefOr[NonEmptyString]
  }

  object AwsCloudFrontDistributionDetails {
    @inline
    def apply(
        DomainName: js.UndefOr[NonEmptyString] = js.undefined,
        ETag: js.UndefOr[NonEmptyString] = js.undefined,
        LastModifiedTime: js.UndefOr[NonEmptyString] = js.undefined,
        Logging: js.UndefOr[AwsCloudFrontDistributionLogging] = js.undefined,
        Origins: js.UndefOr[AwsCloudFrontDistributionOrigins] = js.undefined,
        Status: js.UndefOr[NonEmptyString] = js.undefined,
        WebAclId: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsCloudFrontDistributionDetails = {
      val __obj = js.Dynamic.literal()
      DomainName.foreach(__v => __obj.updateDynamic("DomainName")(__v.asInstanceOf[js.Any]))
      ETag.foreach(__v => __obj.updateDynamic("ETag")(__v.asInstanceOf[js.Any]))
      LastModifiedTime.foreach(__v => __obj.updateDynamic("LastModifiedTime")(__v.asInstanceOf[js.Any]))
      Logging.foreach(__v => __obj.updateDynamic("Logging")(__v.asInstanceOf[js.Any]))
      Origins.foreach(__v => __obj.updateDynamic("Origins")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      WebAclId.foreach(__v => __obj.updateDynamic("WebAclId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsCloudFrontDistributionDetails]
    }
  }

  /**
    * A complex type that controls whether access logs are written for the distribution.
    */
  @js.native
  trait AwsCloudFrontDistributionLogging extends js.Object {
    var Bucket: js.UndefOr[NonEmptyString]
    var Enabled: js.UndefOr[Boolean]
    var IncludeCookies: js.UndefOr[Boolean]
    var Prefix: js.UndefOr[NonEmptyString]
  }

  object AwsCloudFrontDistributionLogging {
    @inline
    def apply(
        Bucket: js.UndefOr[NonEmptyString] = js.undefined,
        Enabled: js.UndefOr[Boolean] = js.undefined,
        IncludeCookies: js.UndefOr[Boolean] = js.undefined,
        Prefix: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsCloudFrontDistributionLogging = {
      val __obj = js.Dynamic.literal()
      Bucket.foreach(__v => __obj.updateDynamic("Bucket")(__v.asInstanceOf[js.Any]))
      Enabled.foreach(__v => __obj.updateDynamic("Enabled")(__v.asInstanceOf[js.Any]))
      IncludeCookies.foreach(__v => __obj.updateDynamic("IncludeCookies")(__v.asInstanceOf[js.Any]))
      Prefix.foreach(__v => __obj.updateDynamic("Prefix")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsCloudFrontDistributionLogging]
    }
  }

  /**
    * A complex type that describes the Amazon S3 bucket, HTTP server (for example, a web server), Amazon MediaStore, or other server from which CloudFront gets your files.
    */
  @js.native
  trait AwsCloudFrontDistributionOriginItem extends js.Object {
    var DomainName: js.UndefOr[NonEmptyString]
    var Id: js.UndefOr[NonEmptyString]
    var OriginPath: js.UndefOr[NonEmptyString]
  }

  object AwsCloudFrontDistributionOriginItem {
    @inline
    def apply(
        DomainName: js.UndefOr[NonEmptyString] = js.undefined,
        Id: js.UndefOr[NonEmptyString] = js.undefined,
        OriginPath: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsCloudFrontDistributionOriginItem = {
      val __obj = js.Dynamic.literal()
      DomainName.foreach(__v => __obj.updateDynamic("DomainName")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      OriginPath.foreach(__v => __obj.updateDynamic("OriginPath")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsCloudFrontDistributionOriginItem]
    }
  }

  /**
    * A complex type that contains information about origins and origin groups for this distribution.
    */
  @js.native
  trait AwsCloudFrontDistributionOrigins extends js.Object {
    var Items: js.UndefOr[AwsCloudFrontDistributionOriginItemList]
  }

  object AwsCloudFrontDistributionOrigins {
    @inline
    def apply(
        Items: js.UndefOr[AwsCloudFrontDistributionOriginItemList] = js.undefined
    ): AwsCloudFrontDistributionOrigins = {
      val __obj = js.Dynamic.literal()
      Items.foreach(__v => __obj.updateDynamic("Items")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsCloudFrontDistributionOrigins]
    }
  }

  /**
    * The details of an Amazon EC2 instance.
    */
  @js.native
  trait AwsEc2InstanceDetails extends js.Object {
    var IamInstanceProfileArn: js.UndefOr[NonEmptyString]
    var ImageId: js.UndefOr[NonEmptyString]
    var IpV4Addresses: js.UndefOr[StringList]
    var IpV6Addresses: js.UndefOr[StringList]
    var KeyName: js.UndefOr[NonEmptyString]
    var LaunchedAt: js.UndefOr[NonEmptyString]
    var SubnetId: js.UndefOr[NonEmptyString]
    var Type: js.UndefOr[NonEmptyString]
    var VpcId: js.UndefOr[NonEmptyString]
  }

  object AwsEc2InstanceDetails {
    @inline
    def apply(
        IamInstanceProfileArn: js.UndefOr[NonEmptyString] = js.undefined,
        ImageId: js.UndefOr[NonEmptyString] = js.undefined,
        IpV4Addresses: js.UndefOr[StringList] = js.undefined,
        IpV6Addresses: js.UndefOr[StringList] = js.undefined,
        KeyName: js.UndefOr[NonEmptyString] = js.undefined,
        LaunchedAt: js.UndefOr[NonEmptyString] = js.undefined,
        SubnetId: js.UndefOr[NonEmptyString] = js.undefined,
        Type: js.UndefOr[NonEmptyString] = js.undefined,
        VpcId: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsEc2InstanceDetails = {
      val __obj = js.Dynamic.literal()
      IamInstanceProfileArn.foreach(__v => __obj.updateDynamic("IamInstanceProfileArn")(__v.asInstanceOf[js.Any]))
      ImageId.foreach(__v => __obj.updateDynamic("ImageId")(__v.asInstanceOf[js.Any]))
      IpV4Addresses.foreach(__v => __obj.updateDynamic("IpV4Addresses")(__v.asInstanceOf[js.Any]))
      IpV6Addresses.foreach(__v => __obj.updateDynamic("IpV6Addresses")(__v.asInstanceOf[js.Any]))
      KeyName.foreach(__v => __obj.updateDynamic("KeyName")(__v.asInstanceOf[js.Any]))
      LaunchedAt.foreach(__v => __obj.updateDynamic("LaunchedAt")(__v.asInstanceOf[js.Any]))
      SubnetId.foreach(__v => __obj.updateDynamic("SubnetId")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      VpcId.foreach(__v => __obj.updateDynamic("VpcId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsEc2InstanceDetails]
    }
  }

  /**
    * Information about a load balancer.
    */
  @js.native
  trait AwsElbv2LoadBalancerDetails extends js.Object {
    var AvailabilityZones: js.UndefOr[AvailabilityZones]
    var CanonicalHostedZoneId: js.UndefOr[NonEmptyString]
    var CreatedTime: js.UndefOr[NonEmptyString]
    var DNSName: js.UndefOr[NonEmptyString]
    var IpAddressType: js.UndefOr[NonEmptyString]
    var Scheme: js.UndefOr[NonEmptyString]
    var SecurityGroups: js.UndefOr[SecurityGroups]
    var State: js.UndefOr[LoadBalancerState]
    var Type: js.UndefOr[NonEmptyString]
    var VpcId: js.UndefOr[NonEmptyString]
  }

  object AwsElbv2LoadBalancerDetails {
    @inline
    def apply(
        AvailabilityZones: js.UndefOr[AvailabilityZones] = js.undefined,
        CanonicalHostedZoneId: js.UndefOr[NonEmptyString] = js.undefined,
        CreatedTime: js.UndefOr[NonEmptyString] = js.undefined,
        DNSName: js.UndefOr[NonEmptyString] = js.undefined,
        IpAddressType: js.UndefOr[NonEmptyString] = js.undefined,
        Scheme: js.UndefOr[NonEmptyString] = js.undefined,
        SecurityGroups: js.UndefOr[SecurityGroups] = js.undefined,
        State: js.UndefOr[LoadBalancerState] = js.undefined,
        Type: js.UndefOr[NonEmptyString] = js.undefined,
        VpcId: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsElbv2LoadBalancerDetails = {
      val __obj = js.Dynamic.literal()
      AvailabilityZones.foreach(__v => __obj.updateDynamic("AvailabilityZones")(__v.asInstanceOf[js.Any]))
      CanonicalHostedZoneId.foreach(__v => __obj.updateDynamic("CanonicalHostedZoneId")(__v.asInstanceOf[js.Any]))
      CreatedTime.foreach(__v => __obj.updateDynamic("CreatedTime")(__v.asInstanceOf[js.Any]))
      DNSName.foreach(__v => __obj.updateDynamic("DNSName")(__v.asInstanceOf[js.Any]))
      IpAddressType.foreach(__v => __obj.updateDynamic("IpAddressType")(__v.asInstanceOf[js.Any]))
      Scheme.foreach(__v => __obj.updateDynamic("Scheme")(__v.asInstanceOf[js.Any]))
      SecurityGroups.foreach(__v => __obj.updateDynamic("SecurityGroups")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      VpcId.foreach(__v => __obj.updateDynamic("VpcId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsElbv2LoadBalancerDetails]
    }
  }

  /**
    * IAM access key details related to a finding.
    */
  @js.native
  trait AwsIamAccessKeyDetails extends js.Object {
    var CreatedAt: js.UndefOr[NonEmptyString]
    var PrincipalId: js.UndefOr[NonEmptyString]
    var PrincipalName: js.UndefOr[NonEmptyString]
    var PrincipalType: js.UndefOr[NonEmptyString]
    var Status: js.UndefOr[AwsIamAccessKeyStatus]
    var UserName: js.UndefOr[NonEmptyString]
  }

  object AwsIamAccessKeyDetails {
    @inline
    def apply(
        CreatedAt: js.UndefOr[NonEmptyString] = js.undefined,
        PrincipalId: js.UndefOr[NonEmptyString] = js.undefined,
        PrincipalName: js.UndefOr[NonEmptyString] = js.undefined,
        PrincipalType: js.UndefOr[NonEmptyString] = js.undefined,
        Status: js.UndefOr[AwsIamAccessKeyStatus] = js.undefined,
        UserName: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsIamAccessKeyDetails = {
      val __obj = js.Dynamic.literal()
      CreatedAt.foreach(__v => __obj.updateDynamic("CreatedAt")(__v.asInstanceOf[js.Any]))
      PrincipalId.foreach(__v => __obj.updateDynamic("PrincipalId")(__v.asInstanceOf[js.Any]))
      PrincipalName.foreach(__v => __obj.updateDynamic("PrincipalName")(__v.asInstanceOf[js.Any]))
      PrincipalType.foreach(__v => __obj.updateDynamic("PrincipalType")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      UserName.foreach(__v => __obj.updateDynamic("UserName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsIamAccessKeyDetails]
    }
  }

  object AwsIamAccessKeyStatusEnum {
    val Active   = "Active"
    val Inactive = "Inactive"

    val values = js.Object.freeze(js.Array(Active, Inactive))
  }

  /**
    * Contains information about an IAM role, including all of the role's policies.
    */
  @js.native
  trait AwsIamRoleDetails extends js.Object {
    var AssumeRolePolicyDocument: js.UndefOr[AwsIamRoleAssumeRolePolicyDocument]
    var CreateDate: js.UndefOr[NonEmptyString]
    var MaxSessionDuration: js.UndefOr[Int]
    var Path: js.UndefOr[NonEmptyString]
    var RoleId: js.UndefOr[NonEmptyString]
    var RoleName: js.UndefOr[NonEmptyString]
  }

  object AwsIamRoleDetails {
    @inline
    def apply(
        AssumeRolePolicyDocument: js.UndefOr[AwsIamRoleAssumeRolePolicyDocument] = js.undefined,
        CreateDate: js.UndefOr[NonEmptyString] = js.undefined,
        MaxSessionDuration: js.UndefOr[Int] = js.undefined,
        Path: js.UndefOr[NonEmptyString] = js.undefined,
        RoleId: js.UndefOr[NonEmptyString] = js.undefined,
        RoleName: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsIamRoleDetails = {
      val __obj = js.Dynamic.literal()
      AssumeRolePolicyDocument.foreach(__v => __obj.updateDynamic("AssumeRolePolicyDocument")(__v.asInstanceOf[js.Any]))
      CreateDate.foreach(__v => __obj.updateDynamic("CreateDate")(__v.asInstanceOf[js.Any]))
      MaxSessionDuration.foreach(__v => __obj.updateDynamic("MaxSessionDuration")(__v.asInstanceOf[js.Any]))
      Path.foreach(__v => __obj.updateDynamic("Path")(__v.asInstanceOf[js.Any]))
      RoleId.foreach(__v => __obj.updateDynamic("RoleId")(__v.asInstanceOf[js.Any]))
      RoleName.foreach(__v => __obj.updateDynamic("RoleName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsIamRoleDetails]
    }
  }

  /**
    * Contains metadata about a customer master key (CMK).
    */
  @js.native
  trait AwsKmsKeyDetails extends js.Object {
    var AWSAccountId: js.UndefOr[NonEmptyString]
    var CreationDate: js.UndefOr[Double]
    var KeyId: js.UndefOr[NonEmptyString]
    var KeyManager: js.UndefOr[NonEmptyString]
    var KeyState: js.UndefOr[NonEmptyString]
    var Origin: js.UndefOr[NonEmptyString]
  }

  object AwsKmsKeyDetails {
    @inline
    def apply(
        AWSAccountId: js.UndefOr[NonEmptyString] = js.undefined,
        CreationDate: js.UndefOr[Double] = js.undefined,
        KeyId: js.UndefOr[NonEmptyString] = js.undefined,
        KeyManager: js.UndefOr[NonEmptyString] = js.undefined,
        KeyState: js.UndefOr[NonEmptyString] = js.undefined,
        Origin: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsKmsKeyDetails = {
      val __obj = js.Dynamic.literal()
      AWSAccountId.foreach(__v => __obj.updateDynamic("AWSAccountId")(__v.asInstanceOf[js.Any]))
      CreationDate.foreach(__v => __obj.updateDynamic("CreationDate")(__v.asInstanceOf[js.Any]))
      KeyId.foreach(__v => __obj.updateDynamic("KeyId")(__v.asInstanceOf[js.Any]))
      KeyManager.foreach(__v => __obj.updateDynamic("KeyManager")(__v.asInstanceOf[js.Any]))
      KeyState.foreach(__v => __obj.updateDynamic("KeyState")(__v.asInstanceOf[js.Any]))
      Origin.foreach(__v => __obj.updateDynamic("Origin")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsKmsKeyDetails]
    }
  }

  /**
    * The code for the Lambda function. You can specify either an object in Amazon S3, or upload a deployment package directly.
    */
  @js.native
  trait AwsLambdaFunctionCode extends js.Object {
    var S3Bucket: js.UndefOr[NonEmptyString]
    var S3Key: js.UndefOr[NonEmptyString]
    var S3ObjectVersion: js.UndefOr[NonEmptyString]
    var ZipFile: js.UndefOr[NonEmptyString]
  }

  object AwsLambdaFunctionCode {
    @inline
    def apply(
        S3Bucket: js.UndefOr[NonEmptyString] = js.undefined,
        S3Key: js.UndefOr[NonEmptyString] = js.undefined,
        S3ObjectVersion: js.UndefOr[NonEmptyString] = js.undefined,
        ZipFile: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsLambdaFunctionCode = {
      val __obj = js.Dynamic.literal()
      S3Bucket.foreach(__v => __obj.updateDynamic("S3Bucket")(__v.asInstanceOf[js.Any]))
      S3Key.foreach(__v => __obj.updateDynamic("S3Key")(__v.asInstanceOf[js.Any]))
      S3ObjectVersion.foreach(__v => __obj.updateDynamic("S3ObjectVersion")(__v.asInstanceOf[js.Any]))
      ZipFile.foreach(__v => __obj.updateDynamic("ZipFile")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsLambdaFunctionCode]
    }
  }

  /**
    * The dead-letter queue for failed asynchronous invocations.
    */
  @js.native
  trait AwsLambdaFunctionDeadLetterConfig extends js.Object {
    var TargetArn: js.UndefOr[NonEmptyString]
  }

  object AwsLambdaFunctionDeadLetterConfig {
    @inline
    def apply(
        TargetArn: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsLambdaFunctionDeadLetterConfig = {
      val __obj = js.Dynamic.literal()
      TargetArn.foreach(__v => __obj.updateDynamic("TargetArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsLambdaFunctionDeadLetterConfig]
    }
  }

  /**
    * Details about a function's configuration.
    */
  @js.native
  trait AwsLambdaFunctionDetails extends js.Object {
    var Code: js.UndefOr[AwsLambdaFunctionCode]
    var CodeSha256: js.UndefOr[NonEmptyString]
    var DeadLetterConfig: js.UndefOr[AwsLambdaFunctionDeadLetterConfig]
    var Environment: js.UndefOr[AwsLambdaFunctionEnvironment]
    var FunctionName: js.UndefOr[NonEmptyString]
    var Handler: js.UndefOr[NonEmptyString]
    var KmsKeyArn: js.UndefOr[NonEmptyString]
    var LastModified: js.UndefOr[NonEmptyString]
    var Layers: js.UndefOr[AwsLambdaFunctionLayerList]
    var MasterArn: js.UndefOr[NonEmptyString]
    var MemorySize: js.UndefOr[Int]
    var RevisionId: js.UndefOr[NonEmptyString]
    var Role: js.UndefOr[NonEmptyString]
    var Runtime: js.UndefOr[NonEmptyString]
    var Timeout: js.UndefOr[Int]
    var TracingConfig: js.UndefOr[AwsLambdaFunctionTracingConfig]
    var Version: js.UndefOr[NonEmptyString]
    var VpcConfig: js.UndefOr[AwsLambdaFunctionVpcConfig]
  }

  object AwsLambdaFunctionDetails {
    @inline
    def apply(
        Code: js.UndefOr[AwsLambdaFunctionCode] = js.undefined,
        CodeSha256: js.UndefOr[NonEmptyString] = js.undefined,
        DeadLetterConfig: js.UndefOr[AwsLambdaFunctionDeadLetterConfig] = js.undefined,
        Environment: js.UndefOr[AwsLambdaFunctionEnvironment] = js.undefined,
        FunctionName: js.UndefOr[NonEmptyString] = js.undefined,
        Handler: js.UndefOr[NonEmptyString] = js.undefined,
        KmsKeyArn: js.UndefOr[NonEmptyString] = js.undefined,
        LastModified: js.UndefOr[NonEmptyString] = js.undefined,
        Layers: js.UndefOr[AwsLambdaFunctionLayerList] = js.undefined,
        MasterArn: js.UndefOr[NonEmptyString] = js.undefined,
        MemorySize: js.UndefOr[Int] = js.undefined,
        RevisionId: js.UndefOr[NonEmptyString] = js.undefined,
        Role: js.UndefOr[NonEmptyString] = js.undefined,
        Runtime: js.UndefOr[NonEmptyString] = js.undefined,
        Timeout: js.UndefOr[Int] = js.undefined,
        TracingConfig: js.UndefOr[AwsLambdaFunctionTracingConfig] = js.undefined,
        Version: js.UndefOr[NonEmptyString] = js.undefined,
        VpcConfig: js.UndefOr[AwsLambdaFunctionVpcConfig] = js.undefined
    ): AwsLambdaFunctionDetails = {
      val __obj = js.Dynamic.literal()
      Code.foreach(__v => __obj.updateDynamic("Code")(__v.asInstanceOf[js.Any]))
      CodeSha256.foreach(__v => __obj.updateDynamic("CodeSha256")(__v.asInstanceOf[js.Any]))
      DeadLetterConfig.foreach(__v => __obj.updateDynamic("DeadLetterConfig")(__v.asInstanceOf[js.Any]))
      Environment.foreach(__v => __obj.updateDynamic("Environment")(__v.asInstanceOf[js.Any]))
      FunctionName.foreach(__v => __obj.updateDynamic("FunctionName")(__v.asInstanceOf[js.Any]))
      Handler.foreach(__v => __obj.updateDynamic("Handler")(__v.asInstanceOf[js.Any]))
      KmsKeyArn.foreach(__v => __obj.updateDynamic("KmsKeyArn")(__v.asInstanceOf[js.Any]))
      LastModified.foreach(__v => __obj.updateDynamic("LastModified")(__v.asInstanceOf[js.Any]))
      Layers.foreach(__v => __obj.updateDynamic("Layers")(__v.asInstanceOf[js.Any]))
      MasterArn.foreach(__v => __obj.updateDynamic("MasterArn")(__v.asInstanceOf[js.Any]))
      MemorySize.foreach(__v => __obj.updateDynamic("MemorySize")(__v.asInstanceOf[js.Any]))
      RevisionId.foreach(__v => __obj.updateDynamic("RevisionId")(__v.asInstanceOf[js.Any]))
      Role.foreach(__v => __obj.updateDynamic("Role")(__v.asInstanceOf[js.Any]))
      Runtime.foreach(__v => __obj.updateDynamic("Runtime")(__v.asInstanceOf[js.Any]))
      Timeout.foreach(__v => __obj.updateDynamic("Timeout")(__v.asInstanceOf[js.Any]))
      TracingConfig.foreach(__v => __obj.updateDynamic("TracingConfig")(__v.asInstanceOf[js.Any]))
      Version.foreach(__v => __obj.updateDynamic("Version")(__v.asInstanceOf[js.Any]))
      VpcConfig.foreach(__v => __obj.updateDynamic("VpcConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsLambdaFunctionDetails]
    }
  }

  /**
    * A function's environment variable settings.
    */
  @js.native
  trait AwsLambdaFunctionEnvironment extends js.Object {
    var Error: js.UndefOr[AwsLambdaFunctionEnvironmentError]
    var Variables: js.UndefOr[FieldMap]
  }

  object AwsLambdaFunctionEnvironment {
    @inline
    def apply(
        Error: js.UndefOr[AwsLambdaFunctionEnvironmentError] = js.undefined,
        Variables: js.UndefOr[FieldMap] = js.undefined
    ): AwsLambdaFunctionEnvironment = {
      val __obj = js.Dynamic.literal()
      Error.foreach(__v => __obj.updateDynamic("Error")(__v.asInstanceOf[js.Any]))
      Variables.foreach(__v => __obj.updateDynamic("Variables")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsLambdaFunctionEnvironment]
    }
  }

  /**
    * Error messages for environment variables that couldn't be applied.
    */
  @js.native
  trait AwsLambdaFunctionEnvironmentError extends js.Object {
    var ErrorCode: js.UndefOr[NonEmptyString]
    var Message: js.UndefOr[NonEmptyString]
  }

  object AwsLambdaFunctionEnvironmentError {
    @inline
    def apply(
        ErrorCode: js.UndefOr[NonEmptyString] = js.undefined,
        Message: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsLambdaFunctionEnvironmentError = {
      val __obj = js.Dynamic.literal()
      ErrorCode.foreach(__v => __obj.updateDynamic("ErrorCode")(__v.asInstanceOf[js.Any]))
      Message.foreach(__v => __obj.updateDynamic("Message")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsLambdaFunctionEnvironmentError]
    }
  }

  /**
    * An AWS Lambda layer.
    */
  @js.native
  trait AwsLambdaFunctionLayer extends js.Object {
    var Arn: js.UndefOr[NonEmptyString]
    var CodeSize: js.UndefOr[Int]
  }

  object AwsLambdaFunctionLayer {
    @inline
    def apply(
        Arn: js.UndefOr[NonEmptyString] = js.undefined,
        CodeSize: js.UndefOr[Int] = js.undefined
    ): AwsLambdaFunctionLayer = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      CodeSize.foreach(__v => __obj.updateDynamic("CodeSize")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsLambdaFunctionLayer]
    }
  }

  /**
    * The function's AWS X-Ray tracing configuration.
    */
  @js.native
  trait AwsLambdaFunctionTracingConfig extends js.Object {
    var Mode: js.UndefOr[NonEmptyString]
  }

  object AwsLambdaFunctionTracingConfig {
    @inline
    def apply(
        Mode: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsLambdaFunctionTracingConfig = {
      val __obj = js.Dynamic.literal()
      Mode.foreach(__v => __obj.updateDynamic("Mode")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsLambdaFunctionTracingConfig]
    }
  }

  /**
    * The VPC security groups and subnets that are attached to a Lambda function. For more information, see VPC Settings.
    */
  @js.native
  trait AwsLambdaFunctionVpcConfig extends js.Object {
    var SecurityGroupIds: js.UndefOr[NonEmptyStringList]
    var SubnetIds: js.UndefOr[NonEmptyStringList]
    var VpcId: js.UndefOr[NonEmptyString]
  }

  object AwsLambdaFunctionVpcConfig {
    @inline
    def apply(
        SecurityGroupIds: js.UndefOr[NonEmptyStringList] = js.undefined,
        SubnetIds: js.UndefOr[NonEmptyStringList] = js.undefined,
        VpcId: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsLambdaFunctionVpcConfig = {
      val __obj = js.Dynamic.literal()
      SecurityGroupIds.foreach(__v => __obj.updateDynamic("SecurityGroupIds")(__v.asInstanceOf[js.Any]))
      SubnetIds.foreach(__v => __obj.updateDynamic("SubnetIds")(__v.asInstanceOf[js.Any]))
      VpcId.foreach(__v => __obj.updateDynamic("VpcId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsLambdaFunctionVpcConfig]
    }
  }

  /**
    * The details of an Amazon S3 bucket.
    */
  @js.native
  trait AwsS3BucketDetails extends js.Object {
    var OwnerId: js.UndefOr[NonEmptyString]
    var OwnerName: js.UndefOr[NonEmptyString]
  }

  object AwsS3BucketDetails {
    @inline
    def apply(
        OwnerId: js.UndefOr[NonEmptyString] = js.undefined,
        OwnerName: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsS3BucketDetails = {
      val __obj = js.Dynamic.literal()
      OwnerId.foreach(__v => __obj.updateDynamic("OwnerId")(__v.asInstanceOf[js.Any]))
      OwnerName.foreach(__v => __obj.updateDynamic("OwnerName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsS3BucketDetails]
    }
  }

  /**
    * Provides consistent format for the contents of the Security Hub-aggregated findings. <code>AwsSecurityFinding</code> format enables you to share findings between AWS security services and third-party solutions, and compliance checks.
    *
    * '''Note:'''A finding is a potential security issue generated either by AWS services (Amazon GuardDuty, Amazon Inspector, and Amazon Macie) or by the integrated third-party solutions and compliance checks.
    */
  @js.native
  trait AwsSecurityFinding extends js.Object {
    var AwsAccountId: NonEmptyString
    var CreatedAt: NonEmptyString
    var Description: NonEmptyString
    var GeneratorId: NonEmptyString
    var Id: NonEmptyString
    var ProductArn: NonEmptyString
    var Resources: ResourceList
    var SchemaVersion: NonEmptyString
    var Severity: Severity
    var Title: NonEmptyString
    var Types: TypeList
    var UpdatedAt: NonEmptyString
    var Compliance: js.UndefOr[Compliance]
    var Confidence: js.UndefOr[Int]
    var Criticality: js.UndefOr[Int]
    var FirstObservedAt: js.UndefOr[NonEmptyString]
    var LastObservedAt: js.UndefOr[NonEmptyString]
    var Malware: js.UndefOr[MalwareList]
    var Network: js.UndefOr[Network]
    var Note: js.UndefOr[Note]
    var Process: js.UndefOr[ProcessDetails]
    var ProductFields: js.UndefOr[FieldMap]
    var RecordState: js.UndefOr[RecordState]
    var RelatedFindings: js.UndefOr[RelatedFindingList]
    var Remediation: js.UndefOr[Remediation]
    var SourceUrl: js.UndefOr[NonEmptyString]
    var ThreatIntelIndicators: js.UndefOr[ThreatIntelIndicatorList]
    var UserDefinedFields: js.UndefOr[FieldMap]
    var VerificationState: js.UndefOr[VerificationState]
    var WorkflowState: js.UndefOr[WorkflowState]
  }

  object AwsSecurityFinding {
    @inline
    def apply(
        AwsAccountId: NonEmptyString,
        CreatedAt: NonEmptyString,
        Description: NonEmptyString,
        GeneratorId: NonEmptyString,
        Id: NonEmptyString,
        ProductArn: NonEmptyString,
        Resources: ResourceList,
        SchemaVersion: NonEmptyString,
        Severity: Severity,
        Title: NonEmptyString,
        Types: TypeList,
        UpdatedAt: NonEmptyString,
        Compliance: js.UndefOr[Compliance] = js.undefined,
        Confidence: js.UndefOr[Int] = js.undefined,
        Criticality: js.UndefOr[Int] = js.undefined,
        FirstObservedAt: js.UndefOr[NonEmptyString] = js.undefined,
        LastObservedAt: js.UndefOr[NonEmptyString] = js.undefined,
        Malware: js.UndefOr[MalwareList] = js.undefined,
        Network: js.UndefOr[Network] = js.undefined,
        Note: js.UndefOr[Note] = js.undefined,
        Process: js.UndefOr[ProcessDetails] = js.undefined,
        ProductFields: js.UndefOr[FieldMap] = js.undefined,
        RecordState: js.UndefOr[RecordState] = js.undefined,
        RelatedFindings: js.UndefOr[RelatedFindingList] = js.undefined,
        Remediation: js.UndefOr[Remediation] = js.undefined,
        SourceUrl: js.UndefOr[NonEmptyString] = js.undefined,
        ThreatIntelIndicators: js.UndefOr[ThreatIntelIndicatorList] = js.undefined,
        UserDefinedFields: js.UndefOr[FieldMap] = js.undefined,
        VerificationState: js.UndefOr[VerificationState] = js.undefined,
        WorkflowState: js.UndefOr[WorkflowState] = js.undefined
    ): AwsSecurityFinding = {
      val __obj = js.Dynamic.literal(
        "AwsAccountId"  -> AwsAccountId.asInstanceOf[js.Any],
        "CreatedAt"     -> CreatedAt.asInstanceOf[js.Any],
        "Description"   -> Description.asInstanceOf[js.Any],
        "GeneratorId"   -> GeneratorId.asInstanceOf[js.Any],
        "Id"            -> Id.asInstanceOf[js.Any],
        "ProductArn"    -> ProductArn.asInstanceOf[js.Any],
        "Resources"     -> Resources.asInstanceOf[js.Any],
        "SchemaVersion" -> SchemaVersion.asInstanceOf[js.Any],
        "Severity"      -> Severity.asInstanceOf[js.Any],
        "Title"         -> Title.asInstanceOf[js.Any],
        "Types"         -> Types.asInstanceOf[js.Any],
        "UpdatedAt"     -> UpdatedAt.asInstanceOf[js.Any]
      )

      Compliance.foreach(__v => __obj.updateDynamic("Compliance")(__v.asInstanceOf[js.Any]))
      Confidence.foreach(__v => __obj.updateDynamic("Confidence")(__v.asInstanceOf[js.Any]))
      Criticality.foreach(__v => __obj.updateDynamic("Criticality")(__v.asInstanceOf[js.Any]))
      FirstObservedAt.foreach(__v => __obj.updateDynamic("FirstObservedAt")(__v.asInstanceOf[js.Any]))
      LastObservedAt.foreach(__v => __obj.updateDynamic("LastObservedAt")(__v.asInstanceOf[js.Any]))
      Malware.foreach(__v => __obj.updateDynamic("Malware")(__v.asInstanceOf[js.Any]))
      Network.foreach(__v => __obj.updateDynamic("Network")(__v.asInstanceOf[js.Any]))
      Note.foreach(__v => __obj.updateDynamic("Note")(__v.asInstanceOf[js.Any]))
      Process.foreach(__v => __obj.updateDynamic("Process")(__v.asInstanceOf[js.Any]))
      ProductFields.foreach(__v => __obj.updateDynamic("ProductFields")(__v.asInstanceOf[js.Any]))
      RecordState.foreach(__v => __obj.updateDynamic("RecordState")(__v.asInstanceOf[js.Any]))
      RelatedFindings.foreach(__v => __obj.updateDynamic("RelatedFindings")(__v.asInstanceOf[js.Any]))
      Remediation.foreach(__v => __obj.updateDynamic("Remediation")(__v.asInstanceOf[js.Any]))
      SourceUrl.foreach(__v => __obj.updateDynamic("SourceUrl")(__v.asInstanceOf[js.Any]))
      ThreatIntelIndicators.foreach(__v => __obj.updateDynamic("ThreatIntelIndicators")(__v.asInstanceOf[js.Any]))
      UserDefinedFields.foreach(__v => __obj.updateDynamic("UserDefinedFields")(__v.asInstanceOf[js.Any]))
      VerificationState.foreach(__v => __obj.updateDynamic("VerificationState")(__v.asInstanceOf[js.Any]))
      WorkflowState.foreach(__v => __obj.updateDynamic("WorkflowState")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsSecurityFinding]
    }
  }

  /**
    * A collection of attributes that are applied to all active Security Hub-aggregated findings and that result in a subset of findings that are included in this insight.
    */
  @js.native
  trait AwsSecurityFindingFilters extends js.Object {
    var AwsAccountId: js.UndefOr[StringFilterList]
    var CompanyName: js.UndefOr[StringFilterList]
    var ComplianceStatus: js.UndefOr[StringFilterList]
    var Confidence: js.UndefOr[NumberFilterList]
    var CreatedAt: js.UndefOr[DateFilterList]
    var Criticality: js.UndefOr[NumberFilterList]
    var Description: js.UndefOr[StringFilterList]
    var FirstObservedAt: js.UndefOr[DateFilterList]
    var GeneratorId: js.UndefOr[StringFilterList]
    var Id: js.UndefOr[StringFilterList]
    var Keyword: js.UndefOr[KeywordFilterList]
    var LastObservedAt: js.UndefOr[DateFilterList]
    var MalwareName: js.UndefOr[StringFilterList]
    var MalwarePath: js.UndefOr[StringFilterList]
    var MalwareState: js.UndefOr[StringFilterList]
    var MalwareType: js.UndefOr[StringFilterList]
    var NetworkDestinationDomain: js.UndefOr[StringFilterList]
    var NetworkDestinationIpV4: js.UndefOr[IpFilterList]
    var NetworkDestinationIpV6: js.UndefOr[IpFilterList]
    var NetworkDestinationPort: js.UndefOr[NumberFilterList]
    var NetworkDirection: js.UndefOr[StringFilterList]
    var NetworkProtocol: js.UndefOr[StringFilterList]
    var NetworkSourceDomain: js.UndefOr[StringFilterList]
    var NetworkSourceIpV4: js.UndefOr[IpFilterList]
    var NetworkSourceIpV6: js.UndefOr[IpFilterList]
    var NetworkSourceMac: js.UndefOr[StringFilterList]
    var NetworkSourcePort: js.UndefOr[NumberFilterList]
    var NoteText: js.UndefOr[StringFilterList]
    var NoteUpdatedAt: js.UndefOr[DateFilterList]
    var NoteUpdatedBy: js.UndefOr[StringFilterList]
    var ProcessLaunchedAt: js.UndefOr[DateFilterList]
    var ProcessName: js.UndefOr[StringFilterList]
    var ProcessParentPid: js.UndefOr[NumberFilterList]
    var ProcessPath: js.UndefOr[StringFilterList]
    var ProcessPid: js.UndefOr[NumberFilterList]
    var ProcessTerminatedAt: js.UndefOr[DateFilterList]
    var ProductArn: js.UndefOr[StringFilterList]
    var ProductFields: js.UndefOr[MapFilterList]
    var ProductName: js.UndefOr[StringFilterList]
    var RecommendationText: js.UndefOr[StringFilterList]
    var RecordState: js.UndefOr[StringFilterList]
    var RelatedFindingsId: js.UndefOr[StringFilterList]
    var RelatedFindingsProductArn: js.UndefOr[StringFilterList]
    var ResourceAwsEc2InstanceIamInstanceProfileArn: js.UndefOr[StringFilterList]
    var ResourceAwsEc2InstanceImageId: js.UndefOr[StringFilterList]
    var ResourceAwsEc2InstanceIpV4Addresses: js.UndefOr[IpFilterList]
    var ResourceAwsEc2InstanceIpV6Addresses: js.UndefOr[IpFilterList]
    var ResourceAwsEc2InstanceKeyName: js.UndefOr[StringFilterList]
    var ResourceAwsEc2InstanceLaunchedAt: js.UndefOr[DateFilterList]
    var ResourceAwsEc2InstanceSubnetId: js.UndefOr[StringFilterList]
    var ResourceAwsEc2InstanceType: js.UndefOr[StringFilterList]
    var ResourceAwsEc2InstanceVpcId: js.UndefOr[StringFilterList]
    var ResourceAwsIamAccessKeyCreatedAt: js.UndefOr[DateFilterList]
    var ResourceAwsIamAccessKeyStatus: js.UndefOr[StringFilterList]
    var ResourceAwsIamAccessKeyUserName: js.UndefOr[StringFilterList]
    var ResourceAwsS3BucketOwnerId: js.UndefOr[StringFilterList]
    var ResourceAwsS3BucketOwnerName: js.UndefOr[StringFilterList]
    var ResourceContainerImageId: js.UndefOr[StringFilterList]
    var ResourceContainerImageName: js.UndefOr[StringFilterList]
    var ResourceContainerLaunchedAt: js.UndefOr[DateFilterList]
    var ResourceContainerName: js.UndefOr[StringFilterList]
    var ResourceDetailsOther: js.UndefOr[MapFilterList]
    var ResourceId: js.UndefOr[StringFilterList]
    var ResourcePartition: js.UndefOr[StringFilterList]
    var ResourceRegion: js.UndefOr[StringFilterList]
    var ResourceTags: js.UndefOr[MapFilterList]
    var ResourceType: js.UndefOr[StringFilterList]
    var SeverityLabel: js.UndefOr[StringFilterList]
    var SeverityNormalized: js.UndefOr[NumberFilterList]
    var SeverityProduct: js.UndefOr[NumberFilterList]
    var SourceUrl: js.UndefOr[StringFilterList]
    var ThreatIntelIndicatorCategory: js.UndefOr[StringFilterList]
    var ThreatIntelIndicatorLastObservedAt: js.UndefOr[DateFilterList]
    var ThreatIntelIndicatorSource: js.UndefOr[StringFilterList]
    var ThreatIntelIndicatorSourceUrl: js.UndefOr[StringFilterList]
    var ThreatIntelIndicatorType: js.UndefOr[StringFilterList]
    var ThreatIntelIndicatorValue: js.UndefOr[StringFilterList]
    var Title: js.UndefOr[StringFilterList]
    var Type: js.UndefOr[StringFilterList]
    var UpdatedAt: js.UndefOr[DateFilterList]
    var UserDefinedFields: js.UndefOr[MapFilterList]
    var VerificationState: js.UndefOr[StringFilterList]
    var WorkflowState: js.UndefOr[StringFilterList]
  }

  object AwsSecurityFindingFilters {
    @inline
    def apply(
        AwsAccountId: js.UndefOr[StringFilterList] = js.undefined,
        CompanyName: js.UndefOr[StringFilterList] = js.undefined,
        ComplianceStatus: js.UndefOr[StringFilterList] = js.undefined,
        Confidence: js.UndefOr[NumberFilterList] = js.undefined,
        CreatedAt: js.UndefOr[DateFilterList] = js.undefined,
        Criticality: js.UndefOr[NumberFilterList] = js.undefined,
        Description: js.UndefOr[StringFilterList] = js.undefined,
        FirstObservedAt: js.UndefOr[DateFilterList] = js.undefined,
        GeneratorId: js.UndefOr[StringFilterList] = js.undefined,
        Id: js.UndefOr[StringFilterList] = js.undefined,
        Keyword: js.UndefOr[KeywordFilterList] = js.undefined,
        LastObservedAt: js.UndefOr[DateFilterList] = js.undefined,
        MalwareName: js.UndefOr[StringFilterList] = js.undefined,
        MalwarePath: js.UndefOr[StringFilterList] = js.undefined,
        MalwareState: js.UndefOr[StringFilterList] = js.undefined,
        MalwareType: js.UndefOr[StringFilterList] = js.undefined,
        NetworkDestinationDomain: js.UndefOr[StringFilterList] = js.undefined,
        NetworkDestinationIpV4: js.UndefOr[IpFilterList] = js.undefined,
        NetworkDestinationIpV6: js.UndefOr[IpFilterList] = js.undefined,
        NetworkDestinationPort: js.UndefOr[NumberFilterList] = js.undefined,
        NetworkDirection: js.UndefOr[StringFilterList] = js.undefined,
        NetworkProtocol: js.UndefOr[StringFilterList] = js.undefined,
        NetworkSourceDomain: js.UndefOr[StringFilterList] = js.undefined,
        NetworkSourceIpV4: js.UndefOr[IpFilterList] = js.undefined,
        NetworkSourceIpV6: js.UndefOr[IpFilterList] = js.undefined,
        NetworkSourceMac: js.UndefOr[StringFilterList] = js.undefined,
        NetworkSourcePort: js.UndefOr[NumberFilterList] = js.undefined,
        NoteText: js.UndefOr[StringFilterList] = js.undefined,
        NoteUpdatedAt: js.UndefOr[DateFilterList] = js.undefined,
        NoteUpdatedBy: js.UndefOr[StringFilterList] = js.undefined,
        ProcessLaunchedAt: js.UndefOr[DateFilterList] = js.undefined,
        ProcessName: js.UndefOr[StringFilterList] = js.undefined,
        ProcessParentPid: js.UndefOr[NumberFilterList] = js.undefined,
        ProcessPath: js.UndefOr[StringFilterList] = js.undefined,
        ProcessPid: js.UndefOr[NumberFilterList] = js.undefined,
        ProcessTerminatedAt: js.UndefOr[DateFilterList] = js.undefined,
        ProductArn: js.UndefOr[StringFilterList] = js.undefined,
        ProductFields: js.UndefOr[MapFilterList] = js.undefined,
        ProductName: js.UndefOr[StringFilterList] = js.undefined,
        RecommendationText: js.UndefOr[StringFilterList] = js.undefined,
        RecordState: js.UndefOr[StringFilterList] = js.undefined,
        RelatedFindingsId: js.UndefOr[StringFilterList] = js.undefined,
        RelatedFindingsProductArn: js.UndefOr[StringFilterList] = js.undefined,
        ResourceAwsEc2InstanceIamInstanceProfileArn: js.UndefOr[StringFilterList] = js.undefined,
        ResourceAwsEc2InstanceImageId: js.UndefOr[StringFilterList] = js.undefined,
        ResourceAwsEc2InstanceIpV4Addresses: js.UndefOr[IpFilterList] = js.undefined,
        ResourceAwsEc2InstanceIpV6Addresses: js.UndefOr[IpFilterList] = js.undefined,
        ResourceAwsEc2InstanceKeyName: js.UndefOr[StringFilterList] = js.undefined,
        ResourceAwsEc2InstanceLaunchedAt: js.UndefOr[DateFilterList] = js.undefined,
        ResourceAwsEc2InstanceSubnetId: js.UndefOr[StringFilterList] = js.undefined,
        ResourceAwsEc2InstanceType: js.UndefOr[StringFilterList] = js.undefined,
        ResourceAwsEc2InstanceVpcId: js.UndefOr[StringFilterList] = js.undefined,
        ResourceAwsIamAccessKeyCreatedAt: js.UndefOr[DateFilterList] = js.undefined,
        ResourceAwsIamAccessKeyStatus: js.UndefOr[StringFilterList] = js.undefined,
        ResourceAwsIamAccessKeyUserName: js.UndefOr[StringFilterList] = js.undefined,
        ResourceAwsS3BucketOwnerId: js.UndefOr[StringFilterList] = js.undefined,
        ResourceAwsS3BucketOwnerName: js.UndefOr[StringFilterList] = js.undefined,
        ResourceContainerImageId: js.UndefOr[StringFilterList] = js.undefined,
        ResourceContainerImageName: js.UndefOr[StringFilterList] = js.undefined,
        ResourceContainerLaunchedAt: js.UndefOr[DateFilterList] = js.undefined,
        ResourceContainerName: js.UndefOr[StringFilterList] = js.undefined,
        ResourceDetailsOther: js.UndefOr[MapFilterList] = js.undefined,
        ResourceId: js.UndefOr[StringFilterList] = js.undefined,
        ResourcePartition: js.UndefOr[StringFilterList] = js.undefined,
        ResourceRegion: js.UndefOr[StringFilterList] = js.undefined,
        ResourceTags: js.UndefOr[MapFilterList] = js.undefined,
        ResourceType: js.UndefOr[StringFilterList] = js.undefined,
        SeverityLabel: js.UndefOr[StringFilterList] = js.undefined,
        SeverityNormalized: js.UndefOr[NumberFilterList] = js.undefined,
        SeverityProduct: js.UndefOr[NumberFilterList] = js.undefined,
        SourceUrl: js.UndefOr[StringFilterList] = js.undefined,
        ThreatIntelIndicatorCategory: js.UndefOr[StringFilterList] = js.undefined,
        ThreatIntelIndicatorLastObservedAt: js.UndefOr[DateFilterList] = js.undefined,
        ThreatIntelIndicatorSource: js.UndefOr[StringFilterList] = js.undefined,
        ThreatIntelIndicatorSourceUrl: js.UndefOr[StringFilterList] = js.undefined,
        ThreatIntelIndicatorType: js.UndefOr[StringFilterList] = js.undefined,
        ThreatIntelIndicatorValue: js.UndefOr[StringFilterList] = js.undefined,
        Title: js.UndefOr[StringFilterList] = js.undefined,
        Type: js.UndefOr[StringFilterList] = js.undefined,
        UpdatedAt: js.UndefOr[DateFilterList] = js.undefined,
        UserDefinedFields: js.UndefOr[MapFilterList] = js.undefined,
        VerificationState: js.UndefOr[StringFilterList] = js.undefined,
        WorkflowState: js.UndefOr[StringFilterList] = js.undefined
    ): AwsSecurityFindingFilters = {
      val __obj = js.Dynamic.literal()
      AwsAccountId.foreach(__v => __obj.updateDynamic("AwsAccountId")(__v.asInstanceOf[js.Any]))
      CompanyName.foreach(__v => __obj.updateDynamic("CompanyName")(__v.asInstanceOf[js.Any]))
      ComplianceStatus.foreach(__v => __obj.updateDynamic("ComplianceStatus")(__v.asInstanceOf[js.Any]))
      Confidence.foreach(__v => __obj.updateDynamic("Confidence")(__v.asInstanceOf[js.Any]))
      CreatedAt.foreach(__v => __obj.updateDynamic("CreatedAt")(__v.asInstanceOf[js.Any]))
      Criticality.foreach(__v => __obj.updateDynamic("Criticality")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      FirstObservedAt.foreach(__v => __obj.updateDynamic("FirstObservedAt")(__v.asInstanceOf[js.Any]))
      GeneratorId.foreach(__v => __obj.updateDynamic("GeneratorId")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      Keyword.foreach(__v => __obj.updateDynamic("Keyword")(__v.asInstanceOf[js.Any]))
      LastObservedAt.foreach(__v => __obj.updateDynamic("LastObservedAt")(__v.asInstanceOf[js.Any]))
      MalwareName.foreach(__v => __obj.updateDynamic("MalwareName")(__v.asInstanceOf[js.Any]))
      MalwarePath.foreach(__v => __obj.updateDynamic("MalwarePath")(__v.asInstanceOf[js.Any]))
      MalwareState.foreach(__v => __obj.updateDynamic("MalwareState")(__v.asInstanceOf[js.Any]))
      MalwareType.foreach(__v => __obj.updateDynamic("MalwareType")(__v.asInstanceOf[js.Any]))
      NetworkDestinationDomain.foreach(__v => __obj.updateDynamic("NetworkDestinationDomain")(__v.asInstanceOf[js.Any]))
      NetworkDestinationIpV4.foreach(__v => __obj.updateDynamic("NetworkDestinationIpV4")(__v.asInstanceOf[js.Any]))
      NetworkDestinationIpV6.foreach(__v => __obj.updateDynamic("NetworkDestinationIpV6")(__v.asInstanceOf[js.Any]))
      NetworkDestinationPort.foreach(__v => __obj.updateDynamic("NetworkDestinationPort")(__v.asInstanceOf[js.Any]))
      NetworkDirection.foreach(__v => __obj.updateDynamic("NetworkDirection")(__v.asInstanceOf[js.Any]))
      NetworkProtocol.foreach(__v => __obj.updateDynamic("NetworkProtocol")(__v.asInstanceOf[js.Any]))
      NetworkSourceDomain.foreach(__v => __obj.updateDynamic("NetworkSourceDomain")(__v.asInstanceOf[js.Any]))
      NetworkSourceIpV4.foreach(__v => __obj.updateDynamic("NetworkSourceIpV4")(__v.asInstanceOf[js.Any]))
      NetworkSourceIpV6.foreach(__v => __obj.updateDynamic("NetworkSourceIpV6")(__v.asInstanceOf[js.Any]))
      NetworkSourceMac.foreach(__v => __obj.updateDynamic("NetworkSourceMac")(__v.asInstanceOf[js.Any]))
      NetworkSourcePort.foreach(__v => __obj.updateDynamic("NetworkSourcePort")(__v.asInstanceOf[js.Any]))
      NoteText.foreach(__v => __obj.updateDynamic("NoteText")(__v.asInstanceOf[js.Any]))
      NoteUpdatedAt.foreach(__v => __obj.updateDynamic("NoteUpdatedAt")(__v.asInstanceOf[js.Any]))
      NoteUpdatedBy.foreach(__v => __obj.updateDynamic("NoteUpdatedBy")(__v.asInstanceOf[js.Any]))
      ProcessLaunchedAt.foreach(__v => __obj.updateDynamic("ProcessLaunchedAt")(__v.asInstanceOf[js.Any]))
      ProcessName.foreach(__v => __obj.updateDynamic("ProcessName")(__v.asInstanceOf[js.Any]))
      ProcessParentPid.foreach(__v => __obj.updateDynamic("ProcessParentPid")(__v.asInstanceOf[js.Any]))
      ProcessPath.foreach(__v => __obj.updateDynamic("ProcessPath")(__v.asInstanceOf[js.Any]))
      ProcessPid.foreach(__v => __obj.updateDynamic("ProcessPid")(__v.asInstanceOf[js.Any]))
      ProcessTerminatedAt.foreach(__v => __obj.updateDynamic("ProcessTerminatedAt")(__v.asInstanceOf[js.Any]))
      ProductArn.foreach(__v => __obj.updateDynamic("ProductArn")(__v.asInstanceOf[js.Any]))
      ProductFields.foreach(__v => __obj.updateDynamic("ProductFields")(__v.asInstanceOf[js.Any]))
      ProductName.foreach(__v => __obj.updateDynamic("ProductName")(__v.asInstanceOf[js.Any]))
      RecommendationText.foreach(__v => __obj.updateDynamic("RecommendationText")(__v.asInstanceOf[js.Any]))
      RecordState.foreach(__v => __obj.updateDynamic("RecordState")(__v.asInstanceOf[js.Any]))
      RelatedFindingsId.foreach(__v => __obj.updateDynamic("RelatedFindingsId")(__v.asInstanceOf[js.Any]))
      RelatedFindingsProductArn.foreach(__v =>
        __obj.updateDynamic("RelatedFindingsProductArn")(__v.asInstanceOf[js.Any])
      )
      ResourceAwsEc2InstanceIamInstanceProfileArn.foreach(__v =>
        __obj.updateDynamic("ResourceAwsEc2InstanceIamInstanceProfileArn")(__v.asInstanceOf[js.Any])
      )
      ResourceAwsEc2InstanceImageId.foreach(__v =>
        __obj.updateDynamic("ResourceAwsEc2InstanceImageId")(__v.asInstanceOf[js.Any])
      )
      ResourceAwsEc2InstanceIpV4Addresses.foreach(__v =>
        __obj.updateDynamic("ResourceAwsEc2InstanceIpV4Addresses")(__v.asInstanceOf[js.Any])
      )
      ResourceAwsEc2InstanceIpV6Addresses.foreach(__v =>
        __obj.updateDynamic("ResourceAwsEc2InstanceIpV6Addresses")(__v.asInstanceOf[js.Any])
      )
      ResourceAwsEc2InstanceKeyName.foreach(__v =>
        __obj.updateDynamic("ResourceAwsEc2InstanceKeyName")(__v.asInstanceOf[js.Any])
      )
      ResourceAwsEc2InstanceLaunchedAt.foreach(__v =>
        __obj.updateDynamic("ResourceAwsEc2InstanceLaunchedAt")(__v.asInstanceOf[js.Any])
      )
      ResourceAwsEc2InstanceSubnetId.foreach(__v =>
        __obj.updateDynamic("ResourceAwsEc2InstanceSubnetId")(__v.asInstanceOf[js.Any])
      )
      ResourceAwsEc2InstanceType.foreach(__v =>
        __obj.updateDynamic("ResourceAwsEc2InstanceType")(__v.asInstanceOf[js.Any])
      )
      ResourceAwsEc2InstanceVpcId.foreach(__v =>
        __obj.updateDynamic("ResourceAwsEc2InstanceVpcId")(__v.asInstanceOf[js.Any])
      )
      ResourceAwsIamAccessKeyCreatedAt.foreach(__v =>
        __obj.updateDynamic("ResourceAwsIamAccessKeyCreatedAt")(__v.asInstanceOf[js.Any])
      )
      ResourceAwsIamAccessKeyStatus.foreach(__v =>
        __obj.updateDynamic("ResourceAwsIamAccessKeyStatus")(__v.asInstanceOf[js.Any])
      )
      ResourceAwsIamAccessKeyUserName.foreach(__v =>
        __obj.updateDynamic("ResourceAwsIamAccessKeyUserName")(__v.asInstanceOf[js.Any])
      )
      ResourceAwsS3BucketOwnerId.foreach(__v =>
        __obj.updateDynamic("ResourceAwsS3BucketOwnerId")(__v.asInstanceOf[js.Any])
      )
      ResourceAwsS3BucketOwnerName.foreach(__v =>
        __obj.updateDynamic("ResourceAwsS3BucketOwnerName")(__v.asInstanceOf[js.Any])
      )
      ResourceContainerImageId.foreach(__v => __obj.updateDynamic("ResourceContainerImageId")(__v.asInstanceOf[js.Any]))
      ResourceContainerImageName.foreach(__v =>
        __obj.updateDynamic("ResourceContainerImageName")(__v.asInstanceOf[js.Any])
      )
      ResourceContainerLaunchedAt.foreach(__v =>
        __obj.updateDynamic("ResourceContainerLaunchedAt")(__v.asInstanceOf[js.Any])
      )
      ResourceContainerName.foreach(__v => __obj.updateDynamic("ResourceContainerName")(__v.asInstanceOf[js.Any]))
      ResourceDetailsOther.foreach(__v => __obj.updateDynamic("ResourceDetailsOther")(__v.asInstanceOf[js.Any]))
      ResourceId.foreach(__v => __obj.updateDynamic("ResourceId")(__v.asInstanceOf[js.Any]))
      ResourcePartition.foreach(__v => __obj.updateDynamic("ResourcePartition")(__v.asInstanceOf[js.Any]))
      ResourceRegion.foreach(__v => __obj.updateDynamic("ResourceRegion")(__v.asInstanceOf[js.Any]))
      ResourceTags.foreach(__v => __obj.updateDynamic("ResourceTags")(__v.asInstanceOf[js.Any]))
      ResourceType.foreach(__v => __obj.updateDynamic("ResourceType")(__v.asInstanceOf[js.Any]))
      SeverityLabel.foreach(__v => __obj.updateDynamic("SeverityLabel")(__v.asInstanceOf[js.Any]))
      SeverityNormalized.foreach(__v => __obj.updateDynamic("SeverityNormalized")(__v.asInstanceOf[js.Any]))
      SeverityProduct.foreach(__v => __obj.updateDynamic("SeverityProduct")(__v.asInstanceOf[js.Any]))
      SourceUrl.foreach(__v => __obj.updateDynamic("SourceUrl")(__v.asInstanceOf[js.Any]))
      ThreatIntelIndicatorCategory.foreach(__v =>
        __obj.updateDynamic("ThreatIntelIndicatorCategory")(__v.asInstanceOf[js.Any])
      )
      ThreatIntelIndicatorLastObservedAt.foreach(__v =>
        __obj.updateDynamic("ThreatIntelIndicatorLastObservedAt")(__v.asInstanceOf[js.Any])
      )
      ThreatIntelIndicatorSource.foreach(__v =>
        __obj.updateDynamic("ThreatIntelIndicatorSource")(__v.asInstanceOf[js.Any])
      )
      ThreatIntelIndicatorSourceUrl.foreach(__v =>
        __obj.updateDynamic("ThreatIntelIndicatorSourceUrl")(__v.asInstanceOf[js.Any])
      )
      ThreatIntelIndicatorType.foreach(__v => __obj.updateDynamic("ThreatIntelIndicatorType")(__v.asInstanceOf[js.Any]))
      ThreatIntelIndicatorValue.foreach(__v =>
        __obj.updateDynamic("ThreatIntelIndicatorValue")(__v.asInstanceOf[js.Any])
      )
      Title.foreach(__v => __obj.updateDynamic("Title")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      UpdatedAt.foreach(__v => __obj.updateDynamic("UpdatedAt")(__v.asInstanceOf[js.Any]))
      UserDefinedFields.foreach(__v => __obj.updateDynamic("UserDefinedFields")(__v.asInstanceOf[js.Any]))
      VerificationState.foreach(__v => __obj.updateDynamic("VerificationState")(__v.asInstanceOf[js.Any]))
      WorkflowState.foreach(__v => __obj.updateDynamic("WorkflowState")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsSecurityFindingFilters]
    }
  }

  /**
    * A wrapper type for the topic's Amazon Resource Name (ARN).
    */
  @js.native
  trait AwsSnsTopicDetails extends js.Object {
    var KmsMasterKeyId: js.UndefOr[NonEmptyString]
    var Owner: js.UndefOr[NonEmptyString]
    var Subscription: js.UndefOr[AwsSnsTopicSubscriptionList]
    var TopicName: js.UndefOr[NonEmptyString]
  }

  object AwsSnsTopicDetails {
    @inline
    def apply(
        KmsMasterKeyId: js.UndefOr[NonEmptyString] = js.undefined,
        Owner: js.UndefOr[NonEmptyString] = js.undefined,
        Subscription: js.UndefOr[AwsSnsTopicSubscriptionList] = js.undefined,
        TopicName: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsSnsTopicDetails = {
      val __obj = js.Dynamic.literal()
      KmsMasterKeyId.foreach(__v => __obj.updateDynamic("KmsMasterKeyId")(__v.asInstanceOf[js.Any]))
      Owner.foreach(__v => __obj.updateDynamic("Owner")(__v.asInstanceOf[js.Any]))
      Subscription.foreach(__v => __obj.updateDynamic("Subscription")(__v.asInstanceOf[js.Any]))
      TopicName.foreach(__v => __obj.updateDynamic("TopicName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsSnsTopicDetails]
    }
  }

  /**
    * A wrapper type for the attributes of an Amazon SNS subscription.
    */
  @js.native
  trait AwsSnsTopicSubscription extends js.Object {
    var Endpoint: js.UndefOr[NonEmptyString]
    var Protocol: js.UndefOr[NonEmptyString]
  }

  object AwsSnsTopicSubscription {
    @inline
    def apply(
        Endpoint: js.UndefOr[NonEmptyString] = js.undefined,
        Protocol: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsSnsTopicSubscription = {
      val __obj = js.Dynamic.literal()
      Endpoint.foreach(__v => __obj.updateDynamic("Endpoint")(__v.asInstanceOf[js.Any]))
      Protocol.foreach(__v => __obj.updateDynamic("Protocol")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsSnsTopicSubscription]
    }
  }

  /**
    * Data about a queue.
    */
  @js.native
  trait AwsSqsQueueDetails extends js.Object {
    var DeadLetterTargetArn: js.UndefOr[NonEmptyString]
    var KmsDataKeyReusePeriodSeconds: js.UndefOr[Int]
    var KmsMasterKeyId: js.UndefOr[NonEmptyString]
    var QueueName: js.UndefOr[NonEmptyString]
  }

  object AwsSqsQueueDetails {
    @inline
    def apply(
        DeadLetterTargetArn: js.UndefOr[NonEmptyString] = js.undefined,
        KmsDataKeyReusePeriodSeconds: js.UndefOr[Int] = js.undefined,
        KmsMasterKeyId: js.UndefOr[NonEmptyString] = js.undefined,
        QueueName: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsSqsQueueDetails = {
      val __obj = js.Dynamic.literal()
      DeadLetterTargetArn.foreach(__v => __obj.updateDynamic("DeadLetterTargetArn")(__v.asInstanceOf[js.Any]))
      KmsDataKeyReusePeriodSeconds.foreach(__v =>
        __obj.updateDynamic("KmsDataKeyReusePeriodSeconds")(__v.asInstanceOf[js.Any])
      )
      KmsMasterKeyId.foreach(__v => __obj.updateDynamic("KmsMasterKeyId")(__v.asInstanceOf[js.Any]))
      QueueName.foreach(__v => __obj.updateDynamic("QueueName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsSqsQueueDetails]
    }
  }

  @js.native
  trait BatchDisableStandardsRequest extends js.Object {
    var StandardsSubscriptionArns: StandardsSubscriptionArns
  }

  object BatchDisableStandardsRequest {
    @inline
    def apply(
        StandardsSubscriptionArns: StandardsSubscriptionArns
    ): BatchDisableStandardsRequest = {
      val __obj = js.Dynamic.literal(
        "StandardsSubscriptionArns" -> StandardsSubscriptionArns.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[BatchDisableStandardsRequest]
    }
  }

  @js.native
  trait BatchDisableStandardsResponse extends js.Object {
    var StandardsSubscriptions: js.UndefOr[StandardsSubscriptions]
  }

  object BatchDisableStandardsResponse {
    @inline
    def apply(
        StandardsSubscriptions: js.UndefOr[StandardsSubscriptions] = js.undefined
    ): BatchDisableStandardsResponse = {
      val __obj = js.Dynamic.literal()
      StandardsSubscriptions.foreach(__v => __obj.updateDynamic("StandardsSubscriptions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchDisableStandardsResponse]
    }
  }

  @js.native
  trait BatchEnableStandardsRequest extends js.Object {
    var StandardsSubscriptionRequests: StandardsSubscriptionRequests
  }

  object BatchEnableStandardsRequest {
    @inline
    def apply(
        StandardsSubscriptionRequests: StandardsSubscriptionRequests
    ): BatchEnableStandardsRequest = {
      val __obj = js.Dynamic.literal(
        "StandardsSubscriptionRequests" -> StandardsSubscriptionRequests.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[BatchEnableStandardsRequest]
    }
  }

  @js.native
  trait BatchEnableStandardsResponse extends js.Object {
    var StandardsSubscriptions: js.UndefOr[StandardsSubscriptions]
  }

  object BatchEnableStandardsResponse {
    @inline
    def apply(
        StandardsSubscriptions: js.UndefOr[StandardsSubscriptions] = js.undefined
    ): BatchEnableStandardsResponse = {
      val __obj = js.Dynamic.literal()
      StandardsSubscriptions.foreach(__v => __obj.updateDynamic("StandardsSubscriptions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchEnableStandardsResponse]
    }
  }

  @js.native
  trait BatchImportFindingsRequest extends js.Object {
    var Findings: AwsSecurityFindingList
  }

  object BatchImportFindingsRequest {
    @inline
    def apply(
        Findings: AwsSecurityFindingList
    ): BatchImportFindingsRequest = {
      val __obj = js.Dynamic.literal(
        "Findings" -> Findings.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[BatchImportFindingsRequest]
    }
  }

  @js.native
  trait BatchImportFindingsResponse extends js.Object {
    var FailedCount: Int
    var SuccessCount: Int
    var FailedFindings: js.UndefOr[ImportFindingsErrorList]
  }

  object BatchImportFindingsResponse {
    @inline
    def apply(
        FailedCount: Int,
        SuccessCount: Int,
        FailedFindings: js.UndefOr[ImportFindingsErrorList] = js.undefined
    ): BatchImportFindingsResponse = {
      val __obj = js.Dynamic.literal(
        "FailedCount"  -> FailedCount.asInstanceOf[js.Any],
        "SuccessCount" -> SuccessCount.asInstanceOf[js.Any]
      )

      FailedFindings.foreach(__v => __obj.updateDynamic("FailedFindings")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchImportFindingsResponse]
    }
  }

  /**
    * Exclusive to findings that are generated as the result of a check run against a specific rule in a supported standard (for example, CIS AWS Foundations). Contains compliance-related finding details.
    *  Values include the following:
    * * Allowed values are the following:
    * <li> <code>PASSED</code> - Compliance check passed for all evaluated resources.
    *  * <code>WARNING</code> - Some information is missing or this check is not supported given your configuration.
    *  * <code>FAILED</code> - Compliance check failed for at least one evaluated resource.
    *  * <code>NOT_AVAILABLE</code> - Check could not be performed due to a service outage or API error.
    * </li>
    */
  @js.native
  trait Compliance extends js.Object {
    var Status: js.UndefOr[ComplianceStatus]
  }

  object Compliance {
    @inline
    def apply(
        Status: js.UndefOr[ComplianceStatus] = js.undefined
    ): Compliance = {
      val __obj = js.Dynamic.literal()
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Compliance]
    }
  }

  object ComplianceStatusEnum {
    val PASSED        = "PASSED"
    val WARNING       = "WARNING"
    val FAILED        = "FAILED"
    val NOT_AVAILABLE = "NOT_AVAILABLE"

    val values = js.Object.freeze(js.Array(PASSED, WARNING, FAILED, NOT_AVAILABLE))
  }

  /**
    * Container details related to a finding.
    */
  @js.native
  trait ContainerDetails extends js.Object {
    var ImageId: js.UndefOr[NonEmptyString]
    var ImageName: js.UndefOr[NonEmptyString]
    var LaunchedAt: js.UndefOr[NonEmptyString]
    var Name: js.UndefOr[NonEmptyString]
  }

  object ContainerDetails {
    @inline
    def apply(
        ImageId: js.UndefOr[NonEmptyString] = js.undefined,
        ImageName: js.UndefOr[NonEmptyString] = js.undefined,
        LaunchedAt: js.UndefOr[NonEmptyString] = js.undefined,
        Name: js.UndefOr[NonEmptyString] = js.undefined
    ): ContainerDetails = {
      val __obj = js.Dynamic.literal()
      ImageId.foreach(__v => __obj.updateDynamic("ImageId")(__v.asInstanceOf[js.Any]))
      ImageName.foreach(__v => __obj.updateDynamic("ImageName")(__v.asInstanceOf[js.Any]))
      LaunchedAt.foreach(__v => __obj.updateDynamic("LaunchedAt")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ContainerDetails]
    }
  }

  @js.native
  trait CreateActionTargetRequest extends js.Object {
    var Description: NonEmptyString
    var Id: NonEmptyString
    var Name: NonEmptyString
  }

  object CreateActionTargetRequest {
    @inline
    def apply(
        Description: NonEmptyString,
        Id: NonEmptyString,
        Name: NonEmptyString
    ): CreateActionTargetRequest = {
      val __obj = js.Dynamic.literal(
        "Description" -> Description.asInstanceOf[js.Any],
        "Id"          -> Id.asInstanceOf[js.Any],
        "Name"        -> Name.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateActionTargetRequest]
    }
  }

  @js.native
  trait CreateActionTargetResponse extends js.Object {
    var ActionTargetArn: NonEmptyString
  }

  object CreateActionTargetResponse {
    @inline
    def apply(
        ActionTargetArn: NonEmptyString
    ): CreateActionTargetResponse = {
      val __obj = js.Dynamic.literal(
        "ActionTargetArn" -> ActionTargetArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateActionTargetResponse]
    }
  }

  @js.native
  trait CreateInsightRequest extends js.Object {
    var Filters: AwsSecurityFindingFilters
    var GroupByAttribute: NonEmptyString
    var Name: NonEmptyString
  }

  object CreateInsightRequest {
    @inline
    def apply(
        Filters: AwsSecurityFindingFilters,
        GroupByAttribute: NonEmptyString,
        Name: NonEmptyString
    ): CreateInsightRequest = {
      val __obj = js.Dynamic.literal(
        "Filters"          -> Filters.asInstanceOf[js.Any],
        "GroupByAttribute" -> GroupByAttribute.asInstanceOf[js.Any],
        "Name"             -> Name.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateInsightRequest]
    }
  }

  @js.native
  trait CreateInsightResponse extends js.Object {
    var InsightArn: NonEmptyString
  }

  object CreateInsightResponse {
    @inline
    def apply(
        InsightArn: NonEmptyString
    ): CreateInsightResponse = {
      val __obj = js.Dynamic.literal(
        "InsightArn" -> InsightArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateInsightResponse]
    }
  }

  @js.native
  trait CreateMembersRequest extends js.Object {
    var AccountDetails: js.UndefOr[AccountDetailsList]
  }

  object CreateMembersRequest {
    @inline
    def apply(
        AccountDetails: js.UndefOr[AccountDetailsList] = js.undefined
    ): CreateMembersRequest = {
      val __obj = js.Dynamic.literal()
      AccountDetails.foreach(__v => __obj.updateDynamic("AccountDetails")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateMembersRequest]
    }
  }

  @js.native
  trait CreateMembersResponse extends js.Object {
    var UnprocessedAccounts: js.UndefOr[ResultList]
  }

  object CreateMembersResponse {
    @inline
    def apply(
        UnprocessedAccounts: js.UndefOr[ResultList] = js.undefined
    ): CreateMembersResponse = {
      val __obj = js.Dynamic.literal()
      UnprocessedAccounts.foreach(__v => __obj.updateDynamic("UnprocessedAccounts")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateMembersResponse]
    }
  }

  /**
    * A date filter for querying findings.
    */
  @js.native
  trait DateFilter extends js.Object {
    var DateRange: js.UndefOr[DateRange]
    var End: js.UndefOr[NonEmptyString]
    var Start: js.UndefOr[NonEmptyString]
  }

  object DateFilter {
    @inline
    def apply(
        DateRange: js.UndefOr[DateRange] = js.undefined,
        End: js.UndefOr[NonEmptyString] = js.undefined,
        Start: js.UndefOr[NonEmptyString] = js.undefined
    ): DateFilter = {
      val __obj = js.Dynamic.literal()
      DateRange.foreach(__v => __obj.updateDynamic("DateRange")(__v.asInstanceOf[js.Any]))
      End.foreach(__v => __obj.updateDynamic("End")(__v.asInstanceOf[js.Any]))
      Start.foreach(__v => __obj.updateDynamic("Start")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DateFilter]
    }
  }

  /**
    * A date range for the date filter.
    */
  @js.native
  trait DateRange extends js.Object {
    var Unit: js.UndefOr[DateRangeUnit]
    var Value: js.UndefOr[Int]
  }

  object DateRange {
    @inline
    def apply(
        Unit: js.UndefOr[DateRangeUnit] = js.undefined,
        Value: js.UndefOr[Int] = js.undefined
    ): DateRange = {
      val __obj = js.Dynamic.literal()
      Unit.foreach(__v => __obj.updateDynamic("Unit")(__v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DateRange]
    }
  }

  object DateRangeUnitEnum {
    val DAYS = "DAYS"

    val values = js.Object.freeze(js.Array(DAYS))
  }

  @js.native
  trait DeclineInvitationsRequest extends js.Object {
    var AccountIds: AccountIdList
  }

  object DeclineInvitationsRequest {
    @inline
    def apply(
        AccountIds: AccountIdList
    ): DeclineInvitationsRequest = {
      val __obj = js.Dynamic.literal(
        "AccountIds" -> AccountIds.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeclineInvitationsRequest]
    }
  }

  @js.native
  trait DeclineInvitationsResponse extends js.Object {
    var UnprocessedAccounts: js.UndefOr[ResultList]
  }

  object DeclineInvitationsResponse {
    @inline
    def apply(
        UnprocessedAccounts: js.UndefOr[ResultList] = js.undefined
    ): DeclineInvitationsResponse = {
      val __obj = js.Dynamic.literal()
      UnprocessedAccounts.foreach(__v => __obj.updateDynamic("UnprocessedAccounts")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeclineInvitationsResponse]
    }
  }

  @js.native
  trait DeleteActionTargetRequest extends js.Object {
    var ActionTargetArn: NonEmptyString
  }

  object DeleteActionTargetRequest {
    @inline
    def apply(
        ActionTargetArn: NonEmptyString
    ): DeleteActionTargetRequest = {
      val __obj = js.Dynamic.literal(
        "ActionTargetArn" -> ActionTargetArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteActionTargetRequest]
    }
  }

  @js.native
  trait DeleteActionTargetResponse extends js.Object {
    var ActionTargetArn: NonEmptyString
  }

  object DeleteActionTargetResponse {
    @inline
    def apply(
        ActionTargetArn: NonEmptyString
    ): DeleteActionTargetResponse = {
      val __obj = js.Dynamic.literal(
        "ActionTargetArn" -> ActionTargetArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteActionTargetResponse]
    }
  }

  @js.native
  trait DeleteInsightRequest extends js.Object {
    var InsightArn: NonEmptyString
  }

  object DeleteInsightRequest {
    @inline
    def apply(
        InsightArn: NonEmptyString
    ): DeleteInsightRequest = {
      val __obj = js.Dynamic.literal(
        "InsightArn" -> InsightArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteInsightRequest]
    }
  }

  @js.native
  trait DeleteInsightResponse extends js.Object {
    var InsightArn: NonEmptyString
  }

  object DeleteInsightResponse {
    @inline
    def apply(
        InsightArn: NonEmptyString
    ): DeleteInsightResponse = {
      val __obj = js.Dynamic.literal(
        "InsightArn" -> InsightArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteInsightResponse]
    }
  }

  @js.native
  trait DeleteInvitationsRequest extends js.Object {
    var AccountIds: AccountIdList
  }

  object DeleteInvitationsRequest {
    @inline
    def apply(
        AccountIds: AccountIdList
    ): DeleteInvitationsRequest = {
      val __obj = js.Dynamic.literal(
        "AccountIds" -> AccountIds.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteInvitationsRequest]
    }
  }

  @js.native
  trait DeleteInvitationsResponse extends js.Object {
    var UnprocessedAccounts: js.UndefOr[ResultList]
  }

  object DeleteInvitationsResponse {
    @inline
    def apply(
        UnprocessedAccounts: js.UndefOr[ResultList] = js.undefined
    ): DeleteInvitationsResponse = {
      val __obj = js.Dynamic.literal()
      UnprocessedAccounts.foreach(__v => __obj.updateDynamic("UnprocessedAccounts")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteInvitationsResponse]
    }
  }

  @js.native
  trait DeleteMembersRequest extends js.Object {
    var AccountIds: js.UndefOr[AccountIdList]
  }

  object DeleteMembersRequest {
    @inline
    def apply(
        AccountIds: js.UndefOr[AccountIdList] = js.undefined
    ): DeleteMembersRequest = {
      val __obj = js.Dynamic.literal()
      AccountIds.foreach(__v => __obj.updateDynamic("AccountIds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteMembersRequest]
    }
  }

  @js.native
  trait DeleteMembersResponse extends js.Object {
    var UnprocessedAccounts: js.UndefOr[ResultList]
  }

  object DeleteMembersResponse {
    @inline
    def apply(
        UnprocessedAccounts: js.UndefOr[ResultList] = js.undefined
    ): DeleteMembersResponse = {
      val __obj = js.Dynamic.literal()
      UnprocessedAccounts.foreach(__v => __obj.updateDynamic("UnprocessedAccounts")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteMembersResponse]
    }
  }

  @js.native
  trait DescribeActionTargetsRequest extends js.Object {
    var ActionTargetArns: js.UndefOr[ArnList]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribeActionTargetsRequest {
    @inline
    def apply(
        ActionTargetArns: js.UndefOr[ArnList] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeActionTargetsRequest = {
      val __obj = js.Dynamic.literal()
      ActionTargetArns.foreach(__v => __obj.updateDynamic("ActionTargetArns")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeActionTargetsRequest]
    }
  }

  @js.native
  trait DescribeActionTargetsResponse extends js.Object {
    var ActionTargets: ActionTargetList
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribeActionTargetsResponse {
    @inline
    def apply(
        ActionTargets: ActionTargetList,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeActionTargetsResponse = {
      val __obj = js.Dynamic.literal(
        "ActionTargets" -> ActionTargets.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeActionTargetsResponse]
    }
  }

  @js.native
  trait DescribeHubRequest extends js.Object {
    var HubArn: js.UndefOr[NonEmptyString]
  }

  object DescribeHubRequest {
    @inline
    def apply(
        HubArn: js.UndefOr[NonEmptyString] = js.undefined
    ): DescribeHubRequest = {
      val __obj = js.Dynamic.literal()
      HubArn.foreach(__v => __obj.updateDynamic("HubArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeHubRequest]
    }
  }

  @js.native
  trait DescribeHubResponse extends js.Object {
    var HubArn: js.UndefOr[NonEmptyString]
    var SubscribedAt: js.UndefOr[NonEmptyString]
  }

  object DescribeHubResponse {
    @inline
    def apply(
        HubArn: js.UndefOr[NonEmptyString] = js.undefined,
        SubscribedAt: js.UndefOr[NonEmptyString] = js.undefined
    ): DescribeHubResponse = {
      val __obj = js.Dynamic.literal()
      HubArn.foreach(__v => __obj.updateDynamic("HubArn")(__v.asInstanceOf[js.Any]))
      SubscribedAt.foreach(__v => __obj.updateDynamic("SubscribedAt")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeHubResponse]
    }
  }

  @js.native
  trait DescribeProductsRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribeProductsRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeProductsRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeProductsRequest]
    }
  }

  @js.native
  trait DescribeProductsResponse extends js.Object {
    var Products: ProductsList
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribeProductsResponse {
    @inline
    def apply(
        Products: ProductsList,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeProductsResponse = {
      val __obj = js.Dynamic.literal(
        "Products" -> Products.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeProductsResponse]
    }
  }

  @js.native
  trait DisableImportFindingsForProductRequest extends js.Object {
    var ProductSubscriptionArn: NonEmptyString
  }

  object DisableImportFindingsForProductRequest {
    @inline
    def apply(
        ProductSubscriptionArn: NonEmptyString
    ): DisableImportFindingsForProductRequest = {
      val __obj = js.Dynamic.literal(
        "ProductSubscriptionArn" -> ProductSubscriptionArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DisableImportFindingsForProductRequest]
    }
  }

  @js.native
  trait DisableImportFindingsForProductResponse extends js.Object {}

  object DisableImportFindingsForProductResponse {
    @inline
    def apply(
        ): DisableImportFindingsForProductResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DisableImportFindingsForProductResponse]
    }
  }

  @js.native
  trait DisableSecurityHubRequest extends js.Object {}

  object DisableSecurityHubRequest {
    @inline
    def apply(
        ): DisableSecurityHubRequest = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DisableSecurityHubRequest]
    }
  }

  @js.native
  trait DisableSecurityHubResponse extends js.Object {}

  object DisableSecurityHubResponse {
    @inline
    def apply(
        ): DisableSecurityHubResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DisableSecurityHubResponse]
    }
  }

  @js.native
  trait DisassociateFromMasterAccountRequest extends js.Object {}

  object DisassociateFromMasterAccountRequest {
    @inline
    def apply(
        ): DisassociateFromMasterAccountRequest = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DisassociateFromMasterAccountRequest]
    }
  }

  @js.native
  trait DisassociateFromMasterAccountResponse extends js.Object {}

  object DisassociateFromMasterAccountResponse {
    @inline
    def apply(
        ): DisassociateFromMasterAccountResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DisassociateFromMasterAccountResponse]
    }
  }

  @js.native
  trait DisassociateMembersRequest extends js.Object {
    var AccountIds: js.UndefOr[AccountIdList]
  }

  object DisassociateMembersRequest {
    @inline
    def apply(
        AccountIds: js.UndefOr[AccountIdList] = js.undefined
    ): DisassociateMembersRequest = {
      val __obj = js.Dynamic.literal()
      AccountIds.foreach(__v => __obj.updateDynamic("AccountIds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DisassociateMembersRequest]
    }
  }

  @js.native
  trait DisassociateMembersResponse extends js.Object {}

  object DisassociateMembersResponse {
    @inline
    def apply(
        ): DisassociateMembersResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DisassociateMembersResponse]
    }
  }

  @js.native
  trait EnableImportFindingsForProductRequest extends js.Object {
    var ProductArn: NonEmptyString
  }

  object EnableImportFindingsForProductRequest {
    @inline
    def apply(
        ProductArn: NonEmptyString
    ): EnableImportFindingsForProductRequest = {
      val __obj = js.Dynamic.literal(
        "ProductArn" -> ProductArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[EnableImportFindingsForProductRequest]
    }
  }

  @js.native
  trait EnableImportFindingsForProductResponse extends js.Object {
    var ProductSubscriptionArn: js.UndefOr[NonEmptyString]
  }

  object EnableImportFindingsForProductResponse {
    @inline
    def apply(
        ProductSubscriptionArn: js.UndefOr[NonEmptyString] = js.undefined
    ): EnableImportFindingsForProductResponse = {
      val __obj = js.Dynamic.literal()
      ProductSubscriptionArn.foreach(__v => __obj.updateDynamic("ProductSubscriptionArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EnableImportFindingsForProductResponse]
    }
  }

  @js.native
  trait EnableSecurityHubRequest extends js.Object {
    var Tags: js.UndefOr[TagMap]
  }

  object EnableSecurityHubRequest {
    @inline
    def apply(
        Tags: js.UndefOr[TagMap] = js.undefined
    ): EnableSecurityHubRequest = {
      val __obj = js.Dynamic.literal()
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EnableSecurityHubRequest]
    }
  }

  @js.native
  trait EnableSecurityHubResponse extends js.Object {}

  object EnableSecurityHubResponse {
    @inline
    def apply(
        ): EnableSecurityHubResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[EnableSecurityHubResponse]
    }
  }

  @js.native
  trait GetEnabledStandardsRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
    var StandardsSubscriptionArns: js.UndefOr[StandardsSubscriptionArns]
  }

  object GetEnabledStandardsRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        StandardsSubscriptionArns: js.UndefOr[StandardsSubscriptionArns] = js.undefined
    ): GetEnabledStandardsRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      StandardsSubscriptionArns.foreach(__v =>
        __obj.updateDynamic("StandardsSubscriptionArns")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[GetEnabledStandardsRequest]
    }
  }

  @js.native
  trait GetEnabledStandardsResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var StandardsSubscriptions: js.UndefOr[StandardsSubscriptions]
  }

  object GetEnabledStandardsResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        StandardsSubscriptions: js.UndefOr[StandardsSubscriptions] = js.undefined
    ): GetEnabledStandardsResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      StandardsSubscriptions.foreach(__v => __obj.updateDynamic("StandardsSubscriptions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetEnabledStandardsResponse]
    }
  }

  @js.native
  trait GetFindingsRequest extends js.Object {
    var Filters: js.UndefOr[AwsSecurityFindingFilters]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
    var SortCriteria: js.UndefOr[SortCriteria]
  }

  object GetFindingsRequest {
    @inline
    def apply(
        Filters: js.UndefOr[AwsSecurityFindingFilters] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        SortCriteria: js.UndefOr[SortCriteria] = js.undefined
    ): GetFindingsRequest = {
      val __obj = js.Dynamic.literal()
      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      SortCriteria.foreach(__v => __obj.updateDynamic("SortCriteria")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetFindingsRequest]
    }
  }

  @js.native
  trait GetFindingsResponse extends js.Object {
    var Findings: AwsSecurityFindingList
    var NextToken: js.UndefOr[NextToken]
  }

  object GetFindingsResponse {
    @inline
    def apply(
        Findings: AwsSecurityFindingList,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): GetFindingsResponse = {
      val __obj = js.Dynamic.literal(
        "Findings" -> Findings.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetFindingsResponse]
    }
  }

  @js.native
  trait GetInsightResultsRequest extends js.Object {
    var InsightArn: NonEmptyString
  }

  object GetInsightResultsRequest {
    @inline
    def apply(
        InsightArn: NonEmptyString
    ): GetInsightResultsRequest = {
      val __obj = js.Dynamic.literal(
        "InsightArn" -> InsightArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetInsightResultsRequest]
    }
  }

  @js.native
  trait GetInsightResultsResponse extends js.Object {
    var InsightResults: InsightResults
  }

  object GetInsightResultsResponse {
    @inline
    def apply(
        InsightResults: InsightResults
    ): GetInsightResultsResponse = {
      val __obj = js.Dynamic.literal(
        "InsightResults" -> InsightResults.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetInsightResultsResponse]
    }
  }

  @js.native
  trait GetInsightsRequest extends js.Object {
    var InsightArns: js.UndefOr[ArnList]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object GetInsightsRequest {
    @inline
    def apply(
        InsightArns: js.UndefOr[ArnList] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): GetInsightsRequest = {
      val __obj = js.Dynamic.literal()
      InsightArns.foreach(__v => __obj.updateDynamic("InsightArns")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetInsightsRequest]
    }
  }

  @js.native
  trait GetInsightsResponse extends js.Object {
    var Insights: InsightList
    var NextToken: js.UndefOr[NextToken]
  }

  object GetInsightsResponse {
    @inline
    def apply(
        Insights: InsightList,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): GetInsightsResponse = {
      val __obj = js.Dynamic.literal(
        "Insights" -> Insights.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetInsightsResponse]
    }
  }

  @js.native
  trait GetInvitationsCountRequest extends js.Object {}

  object GetInvitationsCountRequest {
    @inline
    def apply(
        ): GetInvitationsCountRequest = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[GetInvitationsCountRequest]
    }
  }

  @js.native
  trait GetInvitationsCountResponse extends js.Object {
    var InvitationsCount: js.UndefOr[Int]
  }

  object GetInvitationsCountResponse {
    @inline
    def apply(
        InvitationsCount: js.UndefOr[Int] = js.undefined
    ): GetInvitationsCountResponse = {
      val __obj = js.Dynamic.literal()
      InvitationsCount.foreach(__v => __obj.updateDynamic("InvitationsCount")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetInvitationsCountResponse]
    }
  }

  @js.native
  trait GetMasterAccountRequest extends js.Object {}

  object GetMasterAccountRequest {
    @inline
    def apply(
        ): GetMasterAccountRequest = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[GetMasterAccountRequest]
    }
  }

  @js.native
  trait GetMasterAccountResponse extends js.Object {
    var Master: js.UndefOr[Invitation]
  }

  object GetMasterAccountResponse {
    @inline
    def apply(
        Master: js.UndefOr[Invitation] = js.undefined
    ): GetMasterAccountResponse = {
      val __obj = js.Dynamic.literal()
      Master.foreach(__v => __obj.updateDynamic("Master")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetMasterAccountResponse]
    }
  }

  @js.native
  trait GetMembersRequest extends js.Object {
    var AccountIds: AccountIdList
  }

  object GetMembersRequest {
    @inline
    def apply(
        AccountIds: AccountIdList
    ): GetMembersRequest = {
      val __obj = js.Dynamic.literal(
        "AccountIds" -> AccountIds.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetMembersRequest]
    }
  }

  @js.native
  trait GetMembersResponse extends js.Object {
    var Members: js.UndefOr[MemberList]
    var UnprocessedAccounts: js.UndefOr[ResultList]
  }

  object GetMembersResponse {
    @inline
    def apply(
        Members: js.UndefOr[MemberList] = js.undefined,
        UnprocessedAccounts: js.UndefOr[ResultList] = js.undefined
    ): GetMembersResponse = {
      val __obj = js.Dynamic.literal()
      Members.foreach(__v => __obj.updateDynamic("Members")(__v.asInstanceOf[js.Any]))
      UnprocessedAccounts.foreach(__v => __obj.updateDynamic("UnprocessedAccounts")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetMembersResponse]
    }
  }

  /**
    * Includes details of the list of the findings that can't be imported.
    */
  @js.native
  trait ImportFindingsError extends js.Object {
    var ErrorCode: NonEmptyString
    var ErrorMessage: NonEmptyString
    var Id: NonEmptyString
  }

  object ImportFindingsError {
    @inline
    def apply(
        ErrorCode: NonEmptyString,
        ErrorMessage: NonEmptyString,
        Id: NonEmptyString
    ): ImportFindingsError = {
      val __obj = js.Dynamic.literal(
        "ErrorCode"    -> ErrorCode.asInstanceOf[js.Any],
        "ErrorMessage" -> ErrorMessage.asInstanceOf[js.Any],
        "Id"           -> Id.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ImportFindingsError]
    }
  }

  /**
    * Contains information about a Security Hub insight.
    */
  @js.native
  trait Insight extends js.Object {
    var Filters: AwsSecurityFindingFilters
    var GroupByAttribute: NonEmptyString
    var InsightArn: NonEmptyString
    var Name: NonEmptyString
  }

  object Insight {
    @inline
    def apply(
        Filters: AwsSecurityFindingFilters,
        GroupByAttribute: NonEmptyString,
        InsightArn: NonEmptyString,
        Name: NonEmptyString
    ): Insight = {
      val __obj = js.Dynamic.literal(
        "Filters"          -> Filters.asInstanceOf[js.Any],
        "GroupByAttribute" -> GroupByAttribute.asInstanceOf[js.Any],
        "InsightArn"       -> InsightArn.asInstanceOf[js.Any],
        "Name"             -> Name.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[Insight]
    }
  }

  /**
    * The insight result values returned by the <code>GetInsightResults</code> operation.
    */
  @js.native
  trait InsightResultValue extends js.Object {
    var Count: Int
    var GroupByAttributeValue: NonEmptyString
  }

  object InsightResultValue {
    @inline
    def apply(
        Count: Int,
        GroupByAttributeValue: NonEmptyString
    ): InsightResultValue = {
      val __obj = js.Dynamic.literal(
        "Count"                 -> Count.asInstanceOf[js.Any],
        "GroupByAttributeValue" -> GroupByAttributeValue.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[InsightResultValue]
    }
  }

  /**
    * The insight results returned by the <code>GetInsightResults</code> operation.
    */
  @js.native
  trait InsightResults extends js.Object {
    var GroupByAttribute: NonEmptyString
    var InsightArn: NonEmptyString
    var ResultValues: InsightResultValueList
  }

  object InsightResults {
    @inline
    def apply(
        GroupByAttribute: NonEmptyString,
        InsightArn: NonEmptyString,
        ResultValues: InsightResultValueList
    ): InsightResults = {
      val __obj = js.Dynamic.literal(
        "GroupByAttribute" -> GroupByAttribute.asInstanceOf[js.Any],
        "InsightArn"       -> InsightArn.asInstanceOf[js.Any],
        "ResultValues"     -> ResultValues.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[InsightResults]
    }
  }

  /**
    * Details about an invitation.
    */
  @js.native
  trait Invitation extends js.Object {
    var AccountId: js.UndefOr[AccountId]
    var InvitationId: js.UndefOr[NonEmptyString]
    var InvitedAt: js.UndefOr[Timestamp]
    var MemberStatus: js.UndefOr[NonEmptyString]
  }

  object Invitation {
    @inline
    def apply(
        AccountId: js.UndefOr[AccountId] = js.undefined,
        InvitationId: js.UndefOr[NonEmptyString] = js.undefined,
        InvitedAt: js.UndefOr[Timestamp] = js.undefined,
        MemberStatus: js.UndefOr[NonEmptyString] = js.undefined
    ): Invitation = {
      val __obj = js.Dynamic.literal()
      AccountId.foreach(__v => __obj.updateDynamic("AccountId")(__v.asInstanceOf[js.Any]))
      InvitationId.foreach(__v => __obj.updateDynamic("InvitationId")(__v.asInstanceOf[js.Any]))
      InvitedAt.foreach(__v => __obj.updateDynamic("InvitedAt")(__v.asInstanceOf[js.Any]))
      MemberStatus.foreach(__v => __obj.updateDynamic("MemberStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Invitation]
    }
  }

  @js.native
  trait InviteMembersRequest extends js.Object {
    var AccountIds: js.UndefOr[AccountIdList]
  }

  object InviteMembersRequest {
    @inline
    def apply(
        AccountIds: js.UndefOr[AccountIdList] = js.undefined
    ): InviteMembersRequest = {
      val __obj = js.Dynamic.literal()
      AccountIds.foreach(__v => __obj.updateDynamic("AccountIds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InviteMembersRequest]
    }
  }

  @js.native
  trait InviteMembersResponse extends js.Object {
    var UnprocessedAccounts: js.UndefOr[ResultList]
  }

  object InviteMembersResponse {
    @inline
    def apply(
        UnprocessedAccounts: js.UndefOr[ResultList] = js.undefined
    ): InviteMembersResponse = {
      val __obj = js.Dynamic.literal()
      UnprocessedAccounts.foreach(__v => __obj.updateDynamic("UnprocessedAccounts")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InviteMembersResponse]
    }
  }

  /**
    * The IP filter for querying findings.
    */
  @js.native
  trait IpFilter extends js.Object {
    var Cidr: js.UndefOr[NonEmptyString]
  }

  object IpFilter {
    @inline
    def apply(
        Cidr: js.UndefOr[NonEmptyString] = js.undefined
    ): IpFilter = {
      val __obj = js.Dynamic.literal()
      Cidr.foreach(__v => __obj.updateDynamic("Cidr")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[IpFilter]
    }
  }

  /**
    * A keyword filter for querying findings.
    */
  @js.native
  trait KeywordFilter extends js.Object {
    var Value: js.UndefOr[NonEmptyString]
  }

  object KeywordFilter {
    @inline
    def apply(
        Value: js.UndefOr[NonEmptyString] = js.undefined
    ): KeywordFilter = {
      val __obj = js.Dynamic.literal()
      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[KeywordFilter]
    }
  }

  @js.native
  trait ListEnabledProductsForImportRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListEnabledProductsForImportRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListEnabledProductsForImportRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListEnabledProductsForImportRequest]
    }
  }

  @js.native
  trait ListEnabledProductsForImportResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var ProductSubscriptions: js.UndefOr[ProductSubscriptionArnList]
  }

  object ListEnabledProductsForImportResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        ProductSubscriptions: js.UndefOr[ProductSubscriptionArnList] = js.undefined
    ): ListEnabledProductsForImportResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      ProductSubscriptions.foreach(__v => __obj.updateDynamic("ProductSubscriptions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListEnabledProductsForImportResponse]
    }
  }

  @js.native
  trait ListInvitationsRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListInvitationsRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListInvitationsRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListInvitationsRequest]
    }
  }

  @js.native
  trait ListInvitationsResponse extends js.Object {
    var Invitations: js.UndefOr[InvitationList]
    var NextToken: js.UndefOr[NonEmptyString]
  }

  object ListInvitationsResponse {
    @inline
    def apply(
        Invitations: js.UndefOr[InvitationList] = js.undefined,
        NextToken: js.UndefOr[NonEmptyString] = js.undefined
    ): ListInvitationsResponse = {
      val __obj = js.Dynamic.literal()
      Invitations.foreach(__v => __obj.updateDynamic("Invitations")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListInvitationsResponse]
    }
  }

  @js.native
  trait ListMembersRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
    var OnlyAssociated: js.UndefOr[Boolean]
  }

  object ListMembersRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        OnlyAssociated: js.UndefOr[Boolean] = js.undefined
    ): ListMembersRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      OnlyAssociated.foreach(__v => __obj.updateDynamic("OnlyAssociated")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListMembersRequest]
    }
  }

  @js.native
  trait ListMembersResponse extends js.Object {
    var Members: js.UndefOr[MemberList]
    var NextToken: js.UndefOr[NonEmptyString]
  }

  object ListMembersResponse {
    @inline
    def apply(
        Members: js.UndefOr[MemberList] = js.undefined,
        NextToken: js.UndefOr[NonEmptyString] = js.undefined
    ): ListMembersResponse = {
      val __obj = js.Dynamic.literal()
      Members.foreach(__v => __obj.updateDynamic("Members")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListMembersResponse]
    }
  }

  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var ResourceArn: ResourceArn
  }

  object ListTagsForResourceRequest {
    @inline
    def apply(
        ResourceArn: ResourceArn
    ): ListTagsForResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ListTagsForResourceRequest]
    }
  }

  @js.native
  trait ListTagsForResourceResponse extends js.Object {
    var Tags: js.UndefOr[TagMap]
  }

  object ListTagsForResourceResponse {
    @inline
    def apply(
        Tags: js.UndefOr[TagMap] = js.undefined
    ): ListTagsForResourceResponse = {
      val __obj = js.Dynamic.literal()
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceResponse]
    }
  }

  /**
    * Information about the state of the load balancer.
    */
  @js.native
  trait LoadBalancerState extends js.Object {
    var Code: js.UndefOr[NonEmptyString]
    var Reason: js.UndefOr[NonEmptyString]
  }

  object LoadBalancerState {
    @inline
    def apply(
        Code: js.UndefOr[NonEmptyString] = js.undefined,
        Reason: js.UndefOr[NonEmptyString] = js.undefined
    ): LoadBalancerState = {
      val __obj = js.Dynamic.literal()
      Code.foreach(__v => __obj.updateDynamic("Code")(__v.asInstanceOf[js.Any]))
      Reason.foreach(__v => __obj.updateDynamic("Reason")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LoadBalancerState]
    }
  }

  /**
    * A list of malware related to a finding.
    */
  @js.native
  trait Malware extends js.Object {
    var Name: NonEmptyString
    var Path: js.UndefOr[NonEmptyString]
    var State: js.UndefOr[MalwareState]
    var Type: js.UndefOr[MalwareType]
  }

  object Malware {
    @inline
    def apply(
        Name: NonEmptyString,
        Path: js.UndefOr[NonEmptyString] = js.undefined,
        State: js.UndefOr[MalwareState] = js.undefined,
        Type: js.UndefOr[MalwareType] = js.undefined
    ): Malware = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      Path.foreach(__v => __obj.updateDynamic("Path")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Malware]
    }
  }

  object MalwareStateEnum {
    val OBSERVED       = "OBSERVED"
    val REMOVAL_FAILED = "REMOVAL_FAILED"
    val REMOVED        = "REMOVED"

    val values = js.Object.freeze(js.Array(OBSERVED, REMOVAL_FAILED, REMOVED))
  }

  object MalwareTypeEnum {
    val ADWARE               = "ADWARE"
    val BLENDED_THREAT       = "BLENDED_THREAT"
    val BOTNET_AGENT         = "BOTNET_AGENT"
    val COIN_MINER           = "COIN_MINER"
    val EXPLOIT_KIT          = "EXPLOIT_KIT"
    val KEYLOGGER            = "KEYLOGGER"
    val MACRO                = "MACRO"
    val POTENTIALLY_UNWANTED = "POTENTIALLY_UNWANTED"
    val SPYWARE              = "SPYWARE"
    val RANSOMWARE           = "RANSOMWARE"
    val REMOTE_ACCESS        = "REMOTE_ACCESS"
    val ROOTKIT              = "ROOTKIT"
    val TROJAN               = "TROJAN"
    val VIRUS                = "VIRUS"
    val WORM                 = "WORM"

    val values = js.Object.freeze(
      js.Array(
        ADWARE,
        BLENDED_THREAT,
        BOTNET_AGENT,
        COIN_MINER,
        EXPLOIT_KIT,
        KEYLOGGER,
        MACRO,
        POTENTIALLY_UNWANTED,
        SPYWARE,
        RANSOMWARE,
        REMOTE_ACCESS,
        ROOTKIT,
        TROJAN,
        VIRUS,
        WORM
      )
    )
  }

  /**
    * The map filter for querying findings.
    */
  @js.native
  trait MapFilter extends js.Object {
    var Comparison: js.UndefOr[MapFilterComparison]
    var Key: js.UndefOr[NonEmptyString]
    var Value: js.UndefOr[NonEmptyString]
  }

  object MapFilter {
    @inline
    def apply(
        Comparison: js.UndefOr[MapFilterComparison] = js.undefined,
        Key: js.UndefOr[NonEmptyString] = js.undefined,
        Value: js.UndefOr[NonEmptyString] = js.undefined
    ): MapFilter = {
      val __obj = js.Dynamic.literal()
      Comparison.foreach(__v => __obj.updateDynamic("Comparison")(__v.asInstanceOf[js.Any]))
      Key.foreach(__v => __obj.updateDynamic("Key")(__v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MapFilter]
    }
  }

  object MapFilterComparisonEnum {
    val EQUALS = "EQUALS"

    val values = js.Object.freeze(js.Array(EQUALS))
  }

  /**
    * The details about a member account.
    */
  @js.native
  trait Member extends js.Object {
    var AccountId: js.UndefOr[AccountId]
    var Email: js.UndefOr[NonEmptyString]
    var InvitedAt: js.UndefOr[Timestamp]
    var MasterId: js.UndefOr[NonEmptyString]
    var MemberStatus: js.UndefOr[NonEmptyString]
    var UpdatedAt: js.UndefOr[Timestamp]
  }

  object Member {
    @inline
    def apply(
        AccountId: js.UndefOr[AccountId] = js.undefined,
        Email: js.UndefOr[NonEmptyString] = js.undefined,
        InvitedAt: js.UndefOr[Timestamp] = js.undefined,
        MasterId: js.UndefOr[NonEmptyString] = js.undefined,
        MemberStatus: js.UndefOr[NonEmptyString] = js.undefined,
        UpdatedAt: js.UndefOr[Timestamp] = js.undefined
    ): Member = {
      val __obj = js.Dynamic.literal()
      AccountId.foreach(__v => __obj.updateDynamic("AccountId")(__v.asInstanceOf[js.Any]))
      Email.foreach(__v => __obj.updateDynamic("Email")(__v.asInstanceOf[js.Any]))
      InvitedAt.foreach(__v => __obj.updateDynamic("InvitedAt")(__v.asInstanceOf[js.Any]))
      MasterId.foreach(__v => __obj.updateDynamic("MasterId")(__v.asInstanceOf[js.Any]))
      MemberStatus.foreach(__v => __obj.updateDynamic("MemberStatus")(__v.asInstanceOf[js.Any]))
      UpdatedAt.foreach(__v => __obj.updateDynamic("UpdatedAt")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Member]
    }
  }

  /**
    * The details of network-related information about a finding.
    */
  @js.native
  trait Network extends js.Object {
    var DestinationDomain: js.UndefOr[NonEmptyString]
    var DestinationIpV4: js.UndefOr[NonEmptyString]
    var DestinationIpV6: js.UndefOr[NonEmptyString]
    var DestinationPort: js.UndefOr[Int]
    var Direction: js.UndefOr[NetworkDirection]
    var Protocol: js.UndefOr[NonEmptyString]
    var SourceDomain: js.UndefOr[NonEmptyString]
    var SourceIpV4: js.UndefOr[NonEmptyString]
    var SourceIpV6: js.UndefOr[NonEmptyString]
    var SourceMac: js.UndefOr[NonEmptyString]
    var SourcePort: js.UndefOr[Int]
  }

  object Network {
    @inline
    def apply(
        DestinationDomain: js.UndefOr[NonEmptyString] = js.undefined,
        DestinationIpV4: js.UndefOr[NonEmptyString] = js.undefined,
        DestinationIpV6: js.UndefOr[NonEmptyString] = js.undefined,
        DestinationPort: js.UndefOr[Int] = js.undefined,
        Direction: js.UndefOr[NetworkDirection] = js.undefined,
        Protocol: js.UndefOr[NonEmptyString] = js.undefined,
        SourceDomain: js.UndefOr[NonEmptyString] = js.undefined,
        SourceIpV4: js.UndefOr[NonEmptyString] = js.undefined,
        SourceIpV6: js.UndefOr[NonEmptyString] = js.undefined,
        SourceMac: js.UndefOr[NonEmptyString] = js.undefined,
        SourcePort: js.UndefOr[Int] = js.undefined
    ): Network = {
      val __obj = js.Dynamic.literal()
      DestinationDomain.foreach(__v => __obj.updateDynamic("DestinationDomain")(__v.asInstanceOf[js.Any]))
      DestinationIpV4.foreach(__v => __obj.updateDynamic("DestinationIpV4")(__v.asInstanceOf[js.Any]))
      DestinationIpV6.foreach(__v => __obj.updateDynamic("DestinationIpV6")(__v.asInstanceOf[js.Any]))
      DestinationPort.foreach(__v => __obj.updateDynamic("DestinationPort")(__v.asInstanceOf[js.Any]))
      Direction.foreach(__v => __obj.updateDynamic("Direction")(__v.asInstanceOf[js.Any]))
      Protocol.foreach(__v => __obj.updateDynamic("Protocol")(__v.asInstanceOf[js.Any]))
      SourceDomain.foreach(__v => __obj.updateDynamic("SourceDomain")(__v.asInstanceOf[js.Any]))
      SourceIpV4.foreach(__v => __obj.updateDynamic("SourceIpV4")(__v.asInstanceOf[js.Any]))
      SourceIpV6.foreach(__v => __obj.updateDynamic("SourceIpV6")(__v.asInstanceOf[js.Any]))
      SourceMac.foreach(__v => __obj.updateDynamic("SourceMac")(__v.asInstanceOf[js.Any]))
      SourcePort.foreach(__v => __obj.updateDynamic("SourcePort")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Network]
    }
  }

  object NetworkDirectionEnum {
    val IN  = "IN"
    val OUT = "OUT"

    val values = js.Object.freeze(js.Array(IN, OUT))
  }

  /**
    * A user-defined note added to a finding.
    */
  @js.native
  trait Note extends js.Object {
    var Text: NonEmptyString
    var UpdatedAt: NonEmptyString
    var UpdatedBy: NonEmptyString
  }

  object Note {
    @inline
    def apply(
        Text: NonEmptyString,
        UpdatedAt: NonEmptyString,
        UpdatedBy: NonEmptyString
    ): Note = {
      val __obj = js.Dynamic.literal(
        "Text"      -> Text.asInstanceOf[js.Any],
        "UpdatedAt" -> UpdatedAt.asInstanceOf[js.Any],
        "UpdatedBy" -> UpdatedBy.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[Note]
    }
  }

  /**
    * The updated note.
    */
  @js.native
  trait NoteUpdate extends js.Object {
    var Text: NonEmptyString
    var UpdatedBy: NonEmptyString
  }

  object NoteUpdate {
    @inline
    def apply(
        Text: NonEmptyString,
        UpdatedBy: NonEmptyString
    ): NoteUpdate = {
      val __obj = js.Dynamic.literal(
        "Text"      -> Text.asInstanceOf[js.Any],
        "UpdatedBy" -> UpdatedBy.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[NoteUpdate]
    }
  }

  /**
    * A number filter for querying findings.
    */
  @js.native
  trait NumberFilter extends js.Object {
    var Eq: js.UndefOr[Double]
    var Gte: js.UndefOr[Double]
    var Lte: js.UndefOr[Double]
  }

  object NumberFilter {
    @inline
    def apply(
        Eq: js.UndefOr[Double] = js.undefined,
        Gte: js.UndefOr[Double] = js.undefined,
        Lte: js.UndefOr[Double] = js.undefined
    ): NumberFilter = {
      val __obj = js.Dynamic.literal()
      Eq.foreach(__v => __obj.updateDynamic("Eq")(__v.asInstanceOf[js.Any]))
      Gte.foreach(__v => __obj.updateDynamic("Gte")(__v.asInstanceOf[js.Any]))
      Lte.foreach(__v => __obj.updateDynamic("Lte")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NumberFilter]
    }
  }

  object PartitionEnum {
    val aws          = "aws"
    val `aws-cn`     = "aws-cn"
    val `aws-us-gov` = "aws-us-gov"

    val values = js.Object.freeze(js.Array(aws, `aws-cn`, `aws-us-gov`))
  }

  /**
    * The details of process-related information about a finding.
    */
  @js.native
  trait ProcessDetails extends js.Object {
    var LaunchedAt: js.UndefOr[NonEmptyString]
    var Name: js.UndefOr[NonEmptyString]
    var ParentPid: js.UndefOr[Int]
    var Path: js.UndefOr[NonEmptyString]
    var Pid: js.UndefOr[Int]
    var TerminatedAt: js.UndefOr[NonEmptyString]
  }

  object ProcessDetails {
    @inline
    def apply(
        LaunchedAt: js.UndefOr[NonEmptyString] = js.undefined,
        Name: js.UndefOr[NonEmptyString] = js.undefined,
        ParentPid: js.UndefOr[Int] = js.undefined,
        Path: js.UndefOr[NonEmptyString] = js.undefined,
        Pid: js.UndefOr[Int] = js.undefined,
        TerminatedAt: js.UndefOr[NonEmptyString] = js.undefined
    ): ProcessDetails = {
      val __obj = js.Dynamic.literal()
      LaunchedAt.foreach(__v => __obj.updateDynamic("LaunchedAt")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      ParentPid.foreach(__v => __obj.updateDynamic("ParentPid")(__v.asInstanceOf[js.Any]))
      Path.foreach(__v => __obj.updateDynamic("Path")(__v.asInstanceOf[js.Any]))
      Pid.foreach(__v => __obj.updateDynamic("Pid")(__v.asInstanceOf[js.Any]))
      TerminatedAt.foreach(__v => __obj.updateDynamic("TerminatedAt")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ProcessDetails]
    }
  }

  /**
    * Contains details about a product.
    */
  @js.native
  trait Product extends js.Object {
    var ProductArn: NonEmptyString
    var ActivationUrl: js.UndefOr[NonEmptyString]
    var Categories: js.UndefOr[CategoryList]
    var CompanyName: js.UndefOr[NonEmptyString]
    var Description: js.UndefOr[NonEmptyString]
    var MarketplaceUrl: js.UndefOr[NonEmptyString]
    var ProductName: js.UndefOr[NonEmptyString]
    var ProductSubscriptionResourcePolicy: js.UndefOr[NonEmptyString]
  }

  object Product {
    @inline
    def apply(
        ProductArn: NonEmptyString,
        ActivationUrl: js.UndefOr[NonEmptyString] = js.undefined,
        Categories: js.UndefOr[CategoryList] = js.undefined,
        CompanyName: js.UndefOr[NonEmptyString] = js.undefined,
        Description: js.UndefOr[NonEmptyString] = js.undefined,
        MarketplaceUrl: js.UndefOr[NonEmptyString] = js.undefined,
        ProductName: js.UndefOr[NonEmptyString] = js.undefined,
        ProductSubscriptionResourcePolicy: js.UndefOr[NonEmptyString] = js.undefined
    ): Product = {
      val __obj = js.Dynamic.literal(
        "ProductArn" -> ProductArn.asInstanceOf[js.Any]
      )

      ActivationUrl.foreach(__v => __obj.updateDynamic("ActivationUrl")(__v.asInstanceOf[js.Any]))
      Categories.foreach(__v => __obj.updateDynamic("Categories")(__v.asInstanceOf[js.Any]))
      CompanyName.foreach(__v => __obj.updateDynamic("CompanyName")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      MarketplaceUrl.foreach(__v => __obj.updateDynamic("MarketplaceUrl")(__v.asInstanceOf[js.Any]))
      ProductName.foreach(__v => __obj.updateDynamic("ProductName")(__v.asInstanceOf[js.Any]))
      ProductSubscriptionResourcePolicy.foreach(__v =>
        __obj.updateDynamic("ProductSubscriptionResourcePolicy")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[Product]
    }
  }

  /**
    * A recommendation on how to remediate the issue identified in a finding.
    */
  @js.native
  trait Recommendation extends js.Object {
    var Text: js.UndefOr[NonEmptyString]
    var Url: js.UndefOr[NonEmptyString]
  }

  object Recommendation {
    @inline
    def apply(
        Text: js.UndefOr[NonEmptyString] = js.undefined,
        Url: js.UndefOr[NonEmptyString] = js.undefined
    ): Recommendation = {
      val __obj = js.Dynamic.literal()
      Text.foreach(__v => __obj.updateDynamic("Text")(__v.asInstanceOf[js.Any]))
      Url.foreach(__v => __obj.updateDynamic("Url")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Recommendation]
    }
  }

  object RecordStateEnum {
    val ACTIVE   = "ACTIVE"
    val ARCHIVED = "ARCHIVED"

    val values = js.Object.freeze(js.Array(ACTIVE, ARCHIVED))
  }

  /**
    * Details about a related finding.
    */
  @js.native
  trait RelatedFinding extends js.Object {
    var Id: NonEmptyString
    var ProductArn: NonEmptyString
  }

  object RelatedFinding {
    @inline
    def apply(
        Id: NonEmptyString,
        ProductArn: NonEmptyString
    ): RelatedFinding = {
      val __obj = js.Dynamic.literal(
        "Id"         -> Id.asInstanceOf[js.Any],
        "ProductArn" -> ProductArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[RelatedFinding]
    }
  }

  /**
    * Details about the remediation steps for a finding.
    */
  @js.native
  trait Remediation extends js.Object {
    var Recommendation: js.UndefOr[Recommendation]
  }

  object Remediation {
    @inline
    def apply(
        Recommendation: js.UndefOr[Recommendation] = js.undefined
    ): Remediation = {
      val __obj = js.Dynamic.literal()
      Recommendation.foreach(__v => __obj.updateDynamic("Recommendation")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Remediation]
    }
  }

  /**
    * A resource related to a finding.
    */
  @js.native
  trait Resource extends js.Object {
    var Id: NonEmptyString
    var Type: NonEmptyString
    var Details: js.UndefOr[ResourceDetails]
    var Partition: js.UndefOr[Partition]
    var Region: js.UndefOr[NonEmptyString]
    var Tags: js.UndefOr[FieldMap]
  }

  object Resource {
    @inline
    def apply(
        Id: NonEmptyString,
        Type: NonEmptyString,
        Details: js.UndefOr[ResourceDetails] = js.undefined,
        Partition: js.UndefOr[Partition] = js.undefined,
        Region: js.UndefOr[NonEmptyString] = js.undefined,
        Tags: js.UndefOr[FieldMap] = js.undefined
    ): Resource = {
      val __obj = js.Dynamic.literal(
        "Id"   -> Id.asInstanceOf[js.Any],
        "Type" -> Type.asInstanceOf[js.Any]
      )

      Details.foreach(__v => __obj.updateDynamic("Details")(__v.asInstanceOf[js.Any]))
      Partition.foreach(__v => __obj.updateDynamic("Partition")(__v.asInstanceOf[js.Any]))
      Region.foreach(__v => __obj.updateDynamic("Region")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Resource]
    }
  }

  /**
    * Additional details about a resource related to a finding.
    */
  @js.native
  trait ResourceDetails extends js.Object {
    var AwsCloudFrontDistribution: js.UndefOr[AwsCloudFrontDistributionDetails]
    var AwsEc2Instance: js.UndefOr[AwsEc2InstanceDetails]
    var AwsElbv2LoadBalancer: js.UndefOr[AwsElbv2LoadBalancerDetails]
    var AwsIamAccessKey: js.UndefOr[AwsIamAccessKeyDetails]
    var AwsIamRole: js.UndefOr[AwsIamRoleDetails]
    var AwsKmsKey: js.UndefOr[AwsKmsKeyDetails]
    var AwsLambdaFunction: js.UndefOr[AwsLambdaFunctionDetails]
    var AwsS3Bucket: js.UndefOr[AwsS3BucketDetails]
    var AwsSnsTopic: js.UndefOr[AwsSnsTopicDetails]
    var AwsSqsQueue: js.UndefOr[AwsSqsQueueDetails]
    var Container: js.UndefOr[ContainerDetails]
    var Other: js.UndefOr[FieldMap]
  }

  object ResourceDetails {
    @inline
    def apply(
        AwsCloudFrontDistribution: js.UndefOr[AwsCloudFrontDistributionDetails] = js.undefined,
        AwsEc2Instance: js.UndefOr[AwsEc2InstanceDetails] = js.undefined,
        AwsElbv2LoadBalancer: js.UndefOr[AwsElbv2LoadBalancerDetails] = js.undefined,
        AwsIamAccessKey: js.UndefOr[AwsIamAccessKeyDetails] = js.undefined,
        AwsIamRole: js.UndefOr[AwsIamRoleDetails] = js.undefined,
        AwsKmsKey: js.UndefOr[AwsKmsKeyDetails] = js.undefined,
        AwsLambdaFunction: js.UndefOr[AwsLambdaFunctionDetails] = js.undefined,
        AwsS3Bucket: js.UndefOr[AwsS3BucketDetails] = js.undefined,
        AwsSnsTopic: js.UndefOr[AwsSnsTopicDetails] = js.undefined,
        AwsSqsQueue: js.UndefOr[AwsSqsQueueDetails] = js.undefined,
        Container: js.UndefOr[ContainerDetails] = js.undefined,
        Other: js.UndefOr[FieldMap] = js.undefined
    ): ResourceDetails = {
      val __obj = js.Dynamic.literal()
      AwsCloudFrontDistribution.foreach(__v =>
        __obj.updateDynamic("AwsCloudFrontDistribution")(__v.asInstanceOf[js.Any])
      )
      AwsEc2Instance.foreach(__v => __obj.updateDynamic("AwsEc2Instance")(__v.asInstanceOf[js.Any]))
      AwsElbv2LoadBalancer.foreach(__v => __obj.updateDynamic("AwsElbv2LoadBalancer")(__v.asInstanceOf[js.Any]))
      AwsIamAccessKey.foreach(__v => __obj.updateDynamic("AwsIamAccessKey")(__v.asInstanceOf[js.Any]))
      AwsIamRole.foreach(__v => __obj.updateDynamic("AwsIamRole")(__v.asInstanceOf[js.Any]))
      AwsKmsKey.foreach(__v => __obj.updateDynamic("AwsKmsKey")(__v.asInstanceOf[js.Any]))
      AwsLambdaFunction.foreach(__v => __obj.updateDynamic("AwsLambdaFunction")(__v.asInstanceOf[js.Any]))
      AwsS3Bucket.foreach(__v => __obj.updateDynamic("AwsS3Bucket")(__v.asInstanceOf[js.Any]))
      AwsSnsTopic.foreach(__v => __obj.updateDynamic("AwsSnsTopic")(__v.asInstanceOf[js.Any]))
      AwsSqsQueue.foreach(__v => __obj.updateDynamic("AwsSqsQueue")(__v.asInstanceOf[js.Any]))
      Container.foreach(__v => __obj.updateDynamic("Container")(__v.asInstanceOf[js.Any]))
      Other.foreach(__v => __obj.updateDynamic("Other")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResourceDetails]
    }
  }

  /**
    * Details about the account that wasn't processed.
    */
  @js.native
  trait Result extends js.Object {
    var AccountId: js.UndefOr[AccountId]
    var ProcessingResult: js.UndefOr[NonEmptyString]
  }

  object Result {
    @inline
    def apply(
        AccountId: js.UndefOr[AccountId] = js.undefined,
        ProcessingResult: js.UndefOr[NonEmptyString] = js.undefined
    ): Result = {
      val __obj = js.Dynamic.literal()
      AccountId.foreach(__v => __obj.updateDynamic("AccountId")(__v.asInstanceOf[js.Any]))
      ProcessingResult.foreach(__v => __obj.updateDynamic("ProcessingResult")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Result]
    }
  }

  /**
    * The severity of the finding.
    */
  @js.native
  trait Severity extends js.Object {
    var Normalized: Int
    var Product: js.UndefOr[Double]
  }

  object Severity {
    @inline
    def apply(
        Normalized: Int,
        Product: js.UndefOr[Double] = js.undefined
    ): Severity = {
      val __obj = js.Dynamic.literal(
        "Normalized" -> Normalized.asInstanceOf[js.Any]
      )

      Product.foreach(__v => __obj.updateDynamic("Product")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Severity]
    }
  }

  /**
    * A collection of finding attributes used to sort findings.
    */
  @js.native
  trait SortCriterion extends js.Object {
    var Field: js.UndefOr[NonEmptyString]
    var SortOrder: js.UndefOr[SortOrder]
  }

  object SortCriterion {
    @inline
    def apply(
        Field: js.UndefOr[NonEmptyString] = js.undefined,
        SortOrder: js.UndefOr[SortOrder] = js.undefined
    ): SortCriterion = {
      val __obj = js.Dynamic.literal()
      Field.foreach(__v => __obj.updateDynamic("Field")(__v.asInstanceOf[js.Any]))
      SortOrder.foreach(__v => __obj.updateDynamic("SortOrder")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SortCriterion]
    }
  }

  object SortOrderEnum {
    val asc  = "asc"
    val desc = "desc"

    val values = js.Object.freeze(js.Array(asc, desc))
  }

  object StandardsStatusEnum {
    val PENDING    = "PENDING"
    val READY      = "READY"
    val FAILED     = "FAILED"
    val DELETING   = "DELETING"
    val INCOMPLETE = "INCOMPLETE"

    val values = js.Object.freeze(js.Array(PENDING, READY, FAILED, DELETING, INCOMPLETE))
  }

  /**
    * A resource that represents your subscription to a supported standard.
    */
  @js.native
  trait StandardsSubscription extends js.Object {
    var StandardsArn: NonEmptyString
    var StandardsInput: StandardsInputParameterMap
    var StandardsStatus: StandardsStatus
    var StandardsSubscriptionArn: NonEmptyString
  }

  object StandardsSubscription {
    @inline
    def apply(
        StandardsArn: NonEmptyString,
        StandardsInput: StandardsInputParameterMap,
        StandardsStatus: StandardsStatus,
        StandardsSubscriptionArn: NonEmptyString
    ): StandardsSubscription = {
      val __obj = js.Dynamic.literal(
        "StandardsArn"             -> StandardsArn.asInstanceOf[js.Any],
        "StandardsInput"           -> StandardsInput.asInstanceOf[js.Any],
        "StandardsStatus"          -> StandardsStatus.asInstanceOf[js.Any],
        "StandardsSubscriptionArn" -> StandardsSubscriptionArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[StandardsSubscription]
    }
  }

  /**
    * The standard that you want to enable.
    */
  @js.native
  trait StandardsSubscriptionRequest extends js.Object {
    var StandardsArn: NonEmptyString
    var StandardsInput: js.UndefOr[StandardsInputParameterMap]
  }

  object StandardsSubscriptionRequest {
    @inline
    def apply(
        StandardsArn: NonEmptyString,
        StandardsInput: js.UndefOr[StandardsInputParameterMap] = js.undefined
    ): StandardsSubscriptionRequest = {
      val __obj = js.Dynamic.literal(
        "StandardsArn" -> StandardsArn.asInstanceOf[js.Any]
      )

      StandardsInput.foreach(__v => __obj.updateDynamic("StandardsInput")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StandardsSubscriptionRequest]
    }
  }

  /**
    * A string filter for querying findings.
    */
  @js.native
  trait StringFilter extends js.Object {
    var Comparison: js.UndefOr[StringFilterComparison]
    var Value: js.UndefOr[NonEmptyString]
  }

  object StringFilter {
    @inline
    def apply(
        Comparison: js.UndefOr[StringFilterComparison] = js.undefined,
        Value: js.UndefOr[NonEmptyString] = js.undefined
    ): StringFilter = {
      val __obj = js.Dynamic.literal()
      Comparison.foreach(__v => __obj.updateDynamic("Comparison")(__v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StringFilter]
    }
  }

  object StringFilterComparisonEnum {
    val EQUALS = "EQUALS"
    val PREFIX = "PREFIX"

    val values = js.Object.freeze(js.Array(EQUALS, PREFIX))
  }

  @js.native
  trait TagResourceRequest extends js.Object {
    var ResourceArn: ResourceArn
    var Tags: TagMap
  }

  object TagResourceRequest {
    @inline
    def apply(
        ResourceArn: ResourceArn,
        Tags: TagMap
    ): TagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any],
        "Tags"        -> Tags.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[TagResourceRequest]
    }
  }

  @js.native
  trait TagResourceResponse extends js.Object {}

  object TagResourceResponse {
    @inline
    def apply(
        ): TagResourceResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[TagResourceResponse]
    }
  }

  /**
    * Details about the threat intel related to a finding.
    */
  @js.native
  trait ThreatIntelIndicator extends js.Object {
    var Category: js.UndefOr[ThreatIntelIndicatorCategory]
    var LastObservedAt: js.UndefOr[NonEmptyString]
    var Source: js.UndefOr[NonEmptyString]
    var SourceUrl: js.UndefOr[NonEmptyString]
    var Type: js.UndefOr[ThreatIntelIndicatorType]
    var Value: js.UndefOr[NonEmptyString]
  }

  object ThreatIntelIndicator {
    @inline
    def apply(
        Category: js.UndefOr[ThreatIntelIndicatorCategory] = js.undefined,
        LastObservedAt: js.UndefOr[NonEmptyString] = js.undefined,
        Source: js.UndefOr[NonEmptyString] = js.undefined,
        SourceUrl: js.UndefOr[NonEmptyString] = js.undefined,
        Type: js.UndefOr[ThreatIntelIndicatorType] = js.undefined,
        Value: js.UndefOr[NonEmptyString] = js.undefined
    ): ThreatIntelIndicator = {
      val __obj = js.Dynamic.literal()
      Category.foreach(__v => __obj.updateDynamic("Category")(__v.asInstanceOf[js.Any]))
      LastObservedAt.foreach(__v => __obj.updateDynamic("LastObservedAt")(__v.asInstanceOf[js.Any]))
      Source.foreach(__v => __obj.updateDynamic("Source")(__v.asInstanceOf[js.Any]))
      SourceUrl.foreach(__v => __obj.updateDynamic("SourceUrl")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ThreatIntelIndicator]
    }
  }

  object ThreatIntelIndicatorCategoryEnum {
    val BACKDOOR            = "BACKDOOR"
    val CARD_STEALER        = "CARD_STEALER"
    val COMMAND_AND_CONTROL = "COMMAND_AND_CONTROL"
    val DROP_SITE           = "DROP_SITE"
    val EXPLOIT_SITE        = "EXPLOIT_SITE"
    val KEYLOGGER           = "KEYLOGGER"

    val values =
      js.Object.freeze(js.Array(BACKDOOR, CARD_STEALER, COMMAND_AND_CONTROL, DROP_SITE, EXPLOIT_SITE, KEYLOGGER))
  }

  object ThreatIntelIndicatorTypeEnum {
    val DOMAIN        = "DOMAIN"
    val EMAIL_ADDRESS = "EMAIL_ADDRESS"
    val HASH_MD5      = "HASH_MD5"
    val HASH_SHA1     = "HASH_SHA1"
    val HASH_SHA256   = "HASH_SHA256"
    val HASH_SHA512   = "HASH_SHA512"
    val IPV4_ADDRESS  = "IPV4_ADDRESS"
    val IPV6_ADDRESS  = "IPV6_ADDRESS"
    val MUTEX         = "MUTEX"
    val PROCESS       = "PROCESS"
    val URL           = "URL"

    val values = js.Object.freeze(
      js.Array(
        DOMAIN,
        EMAIL_ADDRESS,
        HASH_MD5,
        HASH_SHA1,
        HASH_SHA256,
        HASH_SHA512,
        IPV4_ADDRESS,
        IPV6_ADDRESS,
        MUTEX,
        PROCESS,
        URL
      )
    )
  }

  @js.native
  trait UntagResourceRequest extends js.Object {
    var ResourceArn: ResourceArn
    var TagKeys: TagKeyList
  }

  object UntagResourceRequest {
    @inline
    def apply(
        ResourceArn: ResourceArn,
        TagKeys: TagKeyList
    ): UntagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any],
        "TagKeys"     -> TagKeys.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UntagResourceRequest]
    }
  }

  @js.native
  trait UntagResourceResponse extends js.Object {}

  object UntagResourceResponse {
    @inline
    def apply(
        ): UntagResourceResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[UntagResourceResponse]
    }
  }

  @js.native
  trait UpdateActionTargetRequest extends js.Object {
    var ActionTargetArn: NonEmptyString
    var Description: js.UndefOr[NonEmptyString]
    var Name: js.UndefOr[NonEmptyString]
  }

  object UpdateActionTargetRequest {
    @inline
    def apply(
        ActionTargetArn: NonEmptyString,
        Description: js.UndefOr[NonEmptyString] = js.undefined,
        Name: js.UndefOr[NonEmptyString] = js.undefined
    ): UpdateActionTargetRequest = {
      val __obj = js.Dynamic.literal(
        "ActionTargetArn" -> ActionTargetArn.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateActionTargetRequest]
    }
  }

  @js.native
  trait UpdateActionTargetResponse extends js.Object {}

  object UpdateActionTargetResponse {
    @inline
    def apply(
        ): UpdateActionTargetResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[UpdateActionTargetResponse]
    }
  }

  @js.native
  trait UpdateFindingsRequest extends js.Object {
    var Filters: AwsSecurityFindingFilters
    var Note: js.UndefOr[NoteUpdate]
    var RecordState: js.UndefOr[RecordState]
  }

  object UpdateFindingsRequest {
    @inline
    def apply(
        Filters: AwsSecurityFindingFilters,
        Note: js.UndefOr[NoteUpdate] = js.undefined,
        RecordState: js.UndefOr[RecordState] = js.undefined
    ): UpdateFindingsRequest = {
      val __obj = js.Dynamic.literal(
        "Filters" -> Filters.asInstanceOf[js.Any]
      )

      Note.foreach(__v => __obj.updateDynamic("Note")(__v.asInstanceOf[js.Any]))
      RecordState.foreach(__v => __obj.updateDynamic("RecordState")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateFindingsRequest]
    }
  }

  @js.native
  trait UpdateFindingsResponse extends js.Object {}

  object UpdateFindingsResponse {
    @inline
    def apply(
        ): UpdateFindingsResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[UpdateFindingsResponse]
    }
  }

  @js.native
  trait UpdateInsightRequest extends js.Object {
    var InsightArn: NonEmptyString
    var Filters: js.UndefOr[AwsSecurityFindingFilters]
    var GroupByAttribute: js.UndefOr[NonEmptyString]
    var Name: js.UndefOr[NonEmptyString]
  }

  object UpdateInsightRequest {
    @inline
    def apply(
        InsightArn: NonEmptyString,
        Filters: js.UndefOr[AwsSecurityFindingFilters] = js.undefined,
        GroupByAttribute: js.UndefOr[NonEmptyString] = js.undefined,
        Name: js.UndefOr[NonEmptyString] = js.undefined
    ): UpdateInsightRequest = {
      val __obj = js.Dynamic.literal(
        "InsightArn" -> InsightArn.asInstanceOf[js.Any]
      )

      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      GroupByAttribute.foreach(__v => __obj.updateDynamic("GroupByAttribute")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateInsightRequest]
    }
  }

  @js.native
  trait UpdateInsightResponse extends js.Object {}

  object UpdateInsightResponse {
    @inline
    def apply(
        ): UpdateInsightResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[UpdateInsightResponse]
    }
  }

  object VerificationStateEnum {
    val UNKNOWN         = "UNKNOWN"
    val TRUE_POSITIVE   = "TRUE_POSITIVE"
    val FALSE_POSITIVE  = "FALSE_POSITIVE"
    val BENIGN_POSITIVE = "BENIGN_POSITIVE"

    val values = js.Object.freeze(js.Array(UNKNOWN, TRUE_POSITIVE, FALSE_POSITIVE, BENIGN_POSITIVE))
  }

  object WorkflowStateEnum {
    val NEW         = "NEW"
    val ASSIGNED    = "ASSIGNED"
    val IN_PROGRESS = "IN_PROGRESS"
    val DEFERRED    = "DEFERRED"
    val RESOLVED    = "RESOLVED"

    val values = js.Object.freeze(js.Array(NEW, ASSIGNED, IN_PROGRESS, DEFERRED, RESOLVED))
  }
}
