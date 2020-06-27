package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object securityhub {
  type AccountDetailsList                      = js.Array[AccountDetails]
  type AccountId                               = String
  type AccountIdList                           = js.Array[NonEmptyString]
  type ActionTargetList                        = js.Array[ActionTarget]
  type ArnList                                 = js.Array[NonEmptyString]
  type AvailabilityZones                       = js.Array[AvailabilityZone]
  type AwsCloudFrontDistributionOriginItemList = js.Array[AwsCloudFrontDistributionOriginItem]
  type AwsEc2NetworkInterfaceSecurityGroupList = js.Array[AwsEc2NetworkInterfaceSecurityGroup]
  type AwsEc2SecurityGroupIpPermissionList     = js.Array[AwsEc2SecurityGroupIpPermission]
  type AwsEc2SecurityGroupIpRangeList          = js.Array[AwsEc2SecurityGroupIpRange]
  type AwsEc2SecurityGroupIpv6RangeList        = js.Array[AwsEc2SecurityGroupIpv6Range]
  type AwsEc2SecurityGroupPrefixListIdList     = js.Array[AwsEc2SecurityGroupPrefixListId]
  type AwsEc2SecurityGroupUserIdGroupPairList  = js.Array[AwsEc2SecurityGroupUserIdGroupPair]
  type AwsIamRoleAssumeRolePolicyDocument      = String
  type AwsLambdaFunctionLayerList              = js.Array[AwsLambdaFunctionLayer]
  type AwsLambdaLayerVersionNumber             = Double
  type AwsRdsDbInstanceAssociatedRoles         = js.Array[AwsRdsDbInstanceAssociatedRole]
  type AwsRdsDbInstanceVpcSecurityGroups       = js.Array[AwsRdsDbInstanceVpcSecurityGroup]
  type AwsSecurityFindingList                  = js.Array[AwsSecurityFinding]
  type AwsSnsTopicSubscriptionList             = js.Array[AwsSnsTopicSubscription]
  type AwsWafWebAclRuleList                    = js.Array[AwsWafWebAclRule]
  type CategoryList                            = js.Array[NonEmptyString]
  type DateFilterList                          = js.Array[DateFilter]
  type FieldMap                                = js.Dictionary[NonEmptyString]
  type ImportFindingsErrorList                 = js.Array[ImportFindingsError]
  type InsightList                             = js.Array[Insight]
  type InsightResultValueList                  = js.Array[InsightResultValue]
  type InvitationList                          = js.Array[Invitation]
  type IpFilterList                            = js.Array[IpFilter]
  type KeywordFilterList                       = js.Array[KeywordFilter]
  type MalwareList                             = js.Array[Malware]
  type MapFilterList                           = js.Array[MapFilter]
  type MaxResults                              = Int
  type MemberList                              = js.Array[Member]
  type NextToken                               = String
  type NonEmptyString                          = String
  type NonEmptyStringList                      = js.Array[NonEmptyString]
  type NumberFilterList                        = js.Array[NumberFilter]
  type ProductSubscriptionArnList              = js.Array[NonEmptyString]
  type ProductsList                            = js.Array[Product]
  type RelatedFindingList                      = js.Array[RelatedFinding]
  type RelatedRequirementsList                 = js.Array[NonEmptyString]
  type ResourceArn                             = String
  type ResourceList                            = js.Array[Resource]
  type ResultList                              = js.Array[Result]
  type SecurityGroups                          = js.Array[NonEmptyString]
  type SortCriteria                            = js.Array[SortCriterion]
  type Standards                               = js.Array[Standard]
  type StandardsControls                       = js.Array[StandardsControl]
  type StandardsInputParameterMap              = js.Dictionary[NonEmptyString]
  type StandardsSubscriptionArns               = js.Array[NonEmptyString]
  type StandardsSubscriptionRequests           = js.Array[StandardsSubscriptionRequest]
  type StandardsSubscriptions                  = js.Array[StandardsSubscription]
  type StringFilterList                        = js.Array[StringFilter]
  type StringList                              = js.Array[NonEmptyString]
  type TagKey                                  = String
  type TagKeyList                              = js.Array[TagKey]
  type TagMap                                  = js.Dictionary[TagValue]
  type TagValue                                = String
  type ThreatIntelIndicatorList                = js.Array[ThreatIntelIndicator]
  type Timestamp                               = js.Date
  type TypeList                                = js.Array[NonEmptyString]
  type WafExcludedRuleList                     = js.Array[WafExcludedRule]

  implicit final class SecurityHubOps(private val service: SecurityHub) extends AnyVal {

    @inline def acceptInvitationFuture(params: AcceptInvitationRequest): Future[AcceptInvitationResponse] =
      service.acceptInvitation(params).promise().toFuture
    @inline def batchDisableStandardsFuture(
        params: BatchDisableStandardsRequest
    ): Future[BatchDisableStandardsResponse] = service.batchDisableStandards(params).promise().toFuture
    @inline def batchEnableStandardsFuture(params: BatchEnableStandardsRequest): Future[BatchEnableStandardsResponse] =
      service.batchEnableStandards(params).promise().toFuture
    @inline def batchImportFindingsFuture(params: BatchImportFindingsRequest): Future[BatchImportFindingsResponse] =
      service.batchImportFindings(params).promise().toFuture
    @inline def createActionTargetFuture(params: CreateActionTargetRequest): Future[CreateActionTargetResponse] =
      service.createActionTarget(params).promise().toFuture
    @inline def createInsightFuture(params: CreateInsightRequest): Future[CreateInsightResponse] =
      service.createInsight(params).promise().toFuture
    @inline def createMembersFuture(params: CreateMembersRequest): Future[CreateMembersResponse] =
      service.createMembers(params).promise().toFuture
    @inline def declineInvitationsFuture(params: DeclineInvitationsRequest): Future[DeclineInvitationsResponse] =
      service.declineInvitations(params).promise().toFuture
    @inline def deleteActionTargetFuture(params: DeleteActionTargetRequest): Future[DeleteActionTargetResponse] =
      service.deleteActionTarget(params).promise().toFuture
    @inline def deleteInsightFuture(params: DeleteInsightRequest): Future[DeleteInsightResponse] =
      service.deleteInsight(params).promise().toFuture
    @inline def deleteInvitationsFuture(params: DeleteInvitationsRequest): Future[DeleteInvitationsResponse] =
      service.deleteInvitations(params).promise().toFuture
    @inline def deleteMembersFuture(params: DeleteMembersRequest): Future[DeleteMembersResponse] =
      service.deleteMembers(params).promise().toFuture
    @inline def describeActionTargetsFuture(
        params: DescribeActionTargetsRequest
    ): Future[DescribeActionTargetsResponse] = service.describeActionTargets(params).promise().toFuture
    @inline def describeHubFuture(params: DescribeHubRequest): Future[DescribeHubResponse] =
      service.describeHub(params).promise().toFuture
    @inline def describeProductsFuture(params: DescribeProductsRequest): Future[DescribeProductsResponse] =
      service.describeProducts(params).promise().toFuture
    @inline def describeStandardsControlsFuture(
        params: DescribeStandardsControlsRequest
    ): Future[DescribeStandardsControlsResponse] = service.describeStandardsControls(params).promise().toFuture
    @inline def describeStandardsFuture(params: DescribeStandardsRequest): Future[DescribeStandardsResponse] =
      service.describeStandards(params).promise().toFuture
    @inline def disableImportFindingsForProductFuture(
        params: DisableImportFindingsForProductRequest
    ): Future[DisableImportFindingsForProductResponse] =
      service.disableImportFindingsForProduct(params).promise().toFuture
    @inline def disableSecurityHubFuture(params: DisableSecurityHubRequest): Future[DisableSecurityHubResponse] =
      service.disableSecurityHub(params).promise().toFuture
    @inline def disassociateFromMasterAccountFuture(
        params: DisassociateFromMasterAccountRequest
    ): Future[DisassociateFromMasterAccountResponse] = service.disassociateFromMasterAccount(params).promise().toFuture
    @inline def disassociateMembersFuture(params: DisassociateMembersRequest): Future[DisassociateMembersResponse] =
      service.disassociateMembers(params).promise().toFuture
    @inline def enableImportFindingsForProductFuture(
        params: EnableImportFindingsForProductRequest
    ): Future[EnableImportFindingsForProductResponse] =
      service.enableImportFindingsForProduct(params).promise().toFuture
    @inline def enableSecurityHubFuture(params: EnableSecurityHubRequest): Future[EnableSecurityHubResponse] =
      service.enableSecurityHub(params).promise().toFuture
    @inline def getEnabledStandardsFuture(params: GetEnabledStandardsRequest): Future[GetEnabledStandardsResponse] =
      service.getEnabledStandards(params).promise().toFuture
    @inline def getFindingsFuture(params: GetFindingsRequest): Future[GetFindingsResponse] =
      service.getFindings(params).promise().toFuture
    @inline def getInsightResultsFuture(params: GetInsightResultsRequest): Future[GetInsightResultsResponse] =
      service.getInsightResults(params).promise().toFuture
    @inline def getInsightsFuture(params: GetInsightsRequest): Future[GetInsightsResponse] =
      service.getInsights(params).promise().toFuture
    @inline def getInvitationsCountFuture(params: GetInvitationsCountRequest): Future[GetInvitationsCountResponse] =
      service.getInvitationsCount(params).promise().toFuture
    @inline def getMasterAccountFuture(params: GetMasterAccountRequest): Future[GetMasterAccountResponse] =
      service.getMasterAccount(params).promise().toFuture
    @inline def getMembersFuture(params: GetMembersRequest): Future[GetMembersResponse] =
      service.getMembers(params).promise().toFuture
    @inline def inviteMembersFuture(params: InviteMembersRequest): Future[InviteMembersResponse] =
      service.inviteMembers(params).promise().toFuture
    @inline def listEnabledProductsForImportFuture(
        params: ListEnabledProductsForImportRequest
    ): Future[ListEnabledProductsForImportResponse] = service.listEnabledProductsForImport(params).promise().toFuture
    @inline def listInvitationsFuture(params: ListInvitationsRequest): Future[ListInvitationsResponse] =
      service.listInvitations(params).promise().toFuture
    @inline def listMembersFuture(params: ListMembersRequest): Future[ListMembersResponse] =
      service.listMembers(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] =
      service.listTagsForResource(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] =
      service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] =
      service.untagResource(params).promise().toFuture
    @inline def updateActionTargetFuture(params: UpdateActionTargetRequest): Future[UpdateActionTargetResponse] =
      service.updateActionTarget(params).promise().toFuture
    @inline def updateFindingsFuture(params: UpdateFindingsRequest): Future[UpdateFindingsResponse] =
      service.updateFindings(params).promise().toFuture
    @inline def updateInsightFuture(params: UpdateInsightRequest): Future[UpdateInsightResponse] =
      service.updateInsight(params).promise().toFuture
    @inline def updateStandardsControlFuture(
        params: UpdateStandardsControlRequest
    ): Future[UpdateStandardsControlResponse] = service.updateStandardsControl(params).promise().toFuture
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
    def describeStandards(params: DescribeStandardsRequest): Request[DescribeStandardsResponse]             = js.native
    def describeStandardsControls(
        params: DescribeStandardsControlsRequest
    ): Request[DescribeStandardsControlsResponse] = js.native
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
    def updateStandardsControl(params: UpdateStandardsControlRequest): Request[UpdateStandardsControlResponse] =
      js.native
  }

  @js.native
  @Factory
  trait AcceptInvitationRequest extends js.Object {
    var InvitationId: NonEmptyString
    var MasterId: NonEmptyString
  }

  @js.native
  @Factory
  trait AcceptInvitationResponse extends js.Object {}

  /**
    * The details of an AWS account.
    */
  @js.native
  @Factory
  trait AccountDetails extends js.Object {
    var AccountId: js.UndefOr[AccountId]
    var Email: js.UndefOr[NonEmptyString]
  }

  /**
    * An <code>ActionTarget</code> object.
    */
  @js.native
  @Factory
  trait ActionTarget extends js.Object {
    var ActionTargetArn: NonEmptyString
    var Description: NonEmptyString
    var Name: NonEmptyString
  }

  /**
    * Information about an Availability Zone.
    */
  @js.native
  @Factory
  trait AvailabilityZone extends js.Object {
    var SubnetId: js.UndefOr[NonEmptyString]
    var ZoneName: js.UndefOr[NonEmptyString]
  }

  /**
    * A distribution configuration.
    */
  @js.native
  @Factory
  trait AwsCloudFrontDistributionDetails extends js.Object {
    var DomainName: js.UndefOr[NonEmptyString]
    var ETag: js.UndefOr[NonEmptyString]
    var LastModifiedTime: js.UndefOr[NonEmptyString]
    var Logging: js.UndefOr[AwsCloudFrontDistributionLogging]
    var Origins: js.UndefOr[AwsCloudFrontDistributionOrigins]
    var Status: js.UndefOr[NonEmptyString]
    var WebAclId: js.UndefOr[NonEmptyString]
  }

  /**
    * A complex type that controls whether access logs are written for the distribution.
    */
  @js.native
  @Factory
  trait AwsCloudFrontDistributionLogging extends js.Object {
    var Bucket: js.UndefOr[NonEmptyString]
    var Enabled: js.UndefOr[Boolean]
    var IncludeCookies: js.UndefOr[Boolean]
    var Prefix: js.UndefOr[NonEmptyString]
  }

  /**
    * A complex type that describes the Amazon S3 bucket, HTTP server (for example, a web server), Amazon MediaStore, or other server from which CloudFront gets your files.
    */
  @js.native
  @Factory
  trait AwsCloudFrontDistributionOriginItem extends js.Object {
    var DomainName: js.UndefOr[NonEmptyString]
    var Id: js.UndefOr[NonEmptyString]
    var OriginPath: js.UndefOr[NonEmptyString]
  }

  /**
    * A complex type that contains information about origins and origin groups for this distribution.
    */
  @js.native
  @Factory
  trait AwsCloudFrontDistributionOrigins extends js.Object {
    var Items: js.UndefOr[AwsCloudFrontDistributionOriginItemList]
  }

  /**
    * Information about an AWS CodeBuild project.
    */
  @js.native
  @Factory
  trait AwsCodeBuildProjectDetails extends js.Object {
    var EncryptionKey: js.UndefOr[NonEmptyString]
    var Environment: js.UndefOr[AwsCodeBuildProjectEnvironment]
    var Name: js.UndefOr[NonEmptyString]
    var ServiceRole: js.UndefOr[NonEmptyString]
    var Source: js.UndefOr[AwsCodeBuildProjectSource]
    var VpcConfig: js.UndefOr[AwsCodeBuildProjectVpcConfig]
  }

  /**
    * Information about the build environment for this build project.
    */
  @js.native
  @Factory
  trait AwsCodeBuildProjectEnvironment extends js.Object {
    var Certificate: js.UndefOr[NonEmptyString]
    var ImagePullCredentialsType: js.UndefOr[NonEmptyString]
    var RegistryCredential: js.UndefOr[AwsCodeBuildProjectEnvironmentRegistryCredential]
    var Type: js.UndefOr[NonEmptyString]
  }

  /**
    * The credentials for access to a private registry.
    */
  @js.native
  @Factory
  trait AwsCodeBuildProjectEnvironmentRegistryCredential extends js.Object {
    var Credential: js.UndefOr[NonEmptyString]
    var CredentialProvider: js.UndefOr[NonEmptyString]
  }

  /**
    * Information about the build input source code for this build project.
    */
  @js.native
  @Factory
  trait AwsCodeBuildProjectSource extends js.Object {
    var GitCloneDepth: js.UndefOr[Int]
    var InsecureSsl: js.UndefOr[Boolean]
    var Location: js.UndefOr[NonEmptyString]
    var Type: js.UndefOr[NonEmptyString]
  }

  /**
    * Information about the VPC configuration that AWS CodeBuild accesses.
    */
  @js.native
  @Factory
  trait AwsCodeBuildProjectVpcConfig extends js.Object {
    var SecurityGroupIds: js.UndefOr[NonEmptyStringList]
    var Subnets: js.UndefOr[NonEmptyStringList]
    var VpcId: js.UndefOr[NonEmptyString]
  }

  /**
    * The details of an Amazon EC2 instance.
    */
  @js.native
  @Factory
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

  /**
    * Information about the network interface attachment.
    */
  @js.native
  @Factory
  trait AwsEc2NetworkInterfaceAttachment extends js.Object {
    var AttachTime: js.UndefOr[NonEmptyString]
    var AttachmentId: js.UndefOr[NonEmptyString]
    var DeleteOnTermination: js.UndefOr[Boolean]
    var DeviceIndex: js.UndefOr[Int]
    var InstanceId: js.UndefOr[NonEmptyString]
    var InstanceOwnerId: js.UndefOr[NonEmptyString]
    var Status: js.UndefOr[NonEmptyString]
  }

  /**
    * Details about the network interface
    */
  @js.native
  @Factory
  trait AwsEc2NetworkInterfaceDetails extends js.Object {
    var Attachment: js.UndefOr[AwsEc2NetworkInterfaceAttachment]
    var NetworkInterfaceId: js.UndefOr[NonEmptyString]
    var SecurityGroups: js.UndefOr[AwsEc2NetworkInterfaceSecurityGroupList]
    var SourceDestCheck: js.UndefOr[Boolean]
  }

  /**
    * A security group associated with the network interface.
    */
  @js.native
  @Factory
  trait AwsEc2NetworkInterfaceSecurityGroup extends js.Object {
    var GroupId: js.UndefOr[NonEmptyString]
    var GroupName: js.UndefOr[NonEmptyString]
  }

  /**
    * Details about an EC2 security group.
    */
  @js.native
  @Factory
  trait AwsEc2SecurityGroupDetails extends js.Object {
    var GroupId: js.UndefOr[NonEmptyString]
    var GroupName: js.UndefOr[NonEmptyString]
    var IpPermissions: js.UndefOr[AwsEc2SecurityGroupIpPermissionList]
    var IpPermissionsEgress: js.UndefOr[AwsEc2SecurityGroupIpPermissionList]
    var OwnerId: js.UndefOr[NonEmptyString]
    var VpcId: js.UndefOr[NonEmptyString]
  }

  /**
    * An IP permission for an EC2 security group.
    */
  @js.native
  @Factory
  trait AwsEc2SecurityGroupIpPermission extends js.Object {
    var FromPort: js.UndefOr[Int]
    var IpProtocol: js.UndefOr[NonEmptyString]
    var IpRanges: js.UndefOr[AwsEc2SecurityGroupIpRangeList]
    var Ipv6Ranges: js.UndefOr[AwsEc2SecurityGroupIpv6RangeList]
    var PrefixListIds: js.UndefOr[AwsEc2SecurityGroupPrefixListIdList]
    var ToPort: js.UndefOr[Int]
    var UserIdGroupPairs: js.UndefOr[AwsEc2SecurityGroupUserIdGroupPairList]
  }

  /**
    * A range of IPv4 addresses.
    */
  @js.native
  @Factory
  trait AwsEc2SecurityGroupIpRange extends js.Object {
    var CidrIp: js.UndefOr[NonEmptyString]
  }

  /**
    * A range of IPv6 addresses.
    */
  @js.native
  @Factory
  trait AwsEc2SecurityGroupIpv6Range extends js.Object {
    var CidrIpv6: js.UndefOr[NonEmptyString]
  }

  /**
    * A prefix list ID.
    */
  @js.native
  @Factory
  trait AwsEc2SecurityGroupPrefixListId extends js.Object {
    var PrefixListId: js.UndefOr[NonEmptyString]
  }

  /**
    * A relationship between a security group and a user.
    */
  @js.native
  @Factory
  trait AwsEc2SecurityGroupUserIdGroupPair extends js.Object {
    var GroupId: js.UndefOr[NonEmptyString]
    var GroupName: js.UndefOr[NonEmptyString]
    var PeeringStatus: js.UndefOr[NonEmptyString]
    var UserId: js.UndefOr[NonEmptyString]
    var VpcId: js.UndefOr[NonEmptyString]
    var VpcPeeringConnectionId: js.UndefOr[NonEmptyString]
  }

  /**
    * Information about an Elasticsearch domain.
    */
  @js.native
  @Factory
  trait AwsElasticsearchDomainDetails extends js.Object {
    var AccessPolicies: js.UndefOr[NonEmptyString]
    var DomainEndpointOptions: js.UndefOr[AwsElasticsearchDomainDomainEndpointOptions]
    var DomainId: js.UndefOr[NonEmptyString]
    var DomainName: js.UndefOr[NonEmptyString]
    var ElasticsearchVersion: js.UndefOr[NonEmptyString]
    var EncryptionAtRestOptions: js.UndefOr[AwsElasticsearchDomainEncryptionAtRestOptions]
    var Endpoint: js.UndefOr[NonEmptyString]
    var Endpoints: js.UndefOr[FieldMap]
    var NodeToNodeEncryptionOptions: js.UndefOr[AwsElasticsearchDomainNodeToNodeEncryptionOptions]
    var VPCOptions: js.UndefOr[AwsElasticsearchDomainVPCOptions]
  }

  /**
    * Additional options for the domain endpoint, such as whether to require HTTPS for all traffic.
    */
  @js.native
  @Factory
  trait AwsElasticsearchDomainDomainEndpointOptions extends js.Object {
    var EnforceHTTPS: js.UndefOr[Boolean]
    var TLSSecurityPolicy: js.UndefOr[NonEmptyString]
  }

  /**
    * Details about the configuration for encryption at rest.
    */
  @js.native
  @Factory
  trait AwsElasticsearchDomainEncryptionAtRestOptions extends js.Object {
    var Enabled: js.UndefOr[Boolean]
    var KmsKeyId: js.UndefOr[NonEmptyString]
  }

  /**
    * Details about the configuration for node-to-node encryption.
    */
  @js.native
  @Factory
  trait AwsElasticsearchDomainNodeToNodeEncryptionOptions extends js.Object {
    var Enabled: js.UndefOr[Boolean]
  }

  /**
    * Information that Amazon ES derives based on <code>VPCOptions</code> for the domain.
    */
  @js.native
  @Factory
  trait AwsElasticsearchDomainVPCOptions extends js.Object {
    var AvailabilityZones: js.UndefOr[NonEmptyStringList]
    var SecurityGroupIds: js.UndefOr[NonEmptyStringList]
    var SubnetIds: js.UndefOr[NonEmptyStringList]
    var VPCId: js.UndefOr[NonEmptyString]
  }

  /**
    * Information about a load balancer.
    */
  @js.native
  @Factory
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

  /**
    * IAM access key details related to a finding.
    */
  @js.native
  @Factory
  trait AwsIamAccessKeyDetails extends js.Object {
    var CreatedAt: js.UndefOr[NonEmptyString]
    var PrincipalId: js.UndefOr[NonEmptyString]
    var PrincipalName: js.UndefOr[NonEmptyString]
    var PrincipalType: js.UndefOr[NonEmptyString]
    var Status: js.UndefOr[AwsIamAccessKeyStatus]
    var UserName: js.UndefOr[NonEmptyString]
  }

  @js.native
  sealed trait AwsIamAccessKeyStatus extends js.Any
  object AwsIamAccessKeyStatus extends js.Object {
    val Active   = "Active".asInstanceOf[AwsIamAccessKeyStatus]
    val Inactive = "Inactive".asInstanceOf[AwsIamAccessKeyStatus]

    val values = js.Object.freeze(js.Array(Active, Inactive))
  }

  /**
    * Contains information about an IAM role, including all of the role's policies.
    */
  @js.native
  @Factory
  trait AwsIamRoleDetails extends js.Object {
    var AssumeRolePolicyDocument: js.UndefOr[AwsIamRoleAssumeRolePolicyDocument]
    var CreateDate: js.UndefOr[NonEmptyString]
    var MaxSessionDuration: js.UndefOr[Int]
    var Path: js.UndefOr[NonEmptyString]
    var RoleId: js.UndefOr[NonEmptyString]
    var RoleName: js.UndefOr[NonEmptyString]
  }

  /**
    * Contains metadata about a customer master key (CMK).
    */
  @js.native
  @Factory
  trait AwsKmsKeyDetails extends js.Object {
    var AWSAccountId: js.UndefOr[NonEmptyString]
    var CreationDate: js.UndefOr[Double]
    var KeyId: js.UndefOr[NonEmptyString]
    var KeyManager: js.UndefOr[NonEmptyString]
    var KeyState: js.UndefOr[NonEmptyString]
    var Origin: js.UndefOr[NonEmptyString]
  }

  /**
    * The code for the Lambda function. You can specify either an object in Amazon S3, or upload a deployment package directly.
    */
  @js.native
  @Factory
  trait AwsLambdaFunctionCode extends js.Object {
    var S3Bucket: js.UndefOr[NonEmptyString]
    var S3Key: js.UndefOr[NonEmptyString]
    var S3ObjectVersion: js.UndefOr[NonEmptyString]
    var ZipFile: js.UndefOr[NonEmptyString]
  }

  /**
    * The dead-letter queue for failed asynchronous invocations.
    */
  @js.native
  @Factory
  trait AwsLambdaFunctionDeadLetterConfig extends js.Object {
    var TargetArn: js.UndefOr[NonEmptyString]
  }

  /**
    * Details about a function's configuration.
    */
  @js.native
  @Factory
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

  /**
    * A function's environment variable settings.
    */
  @js.native
  @Factory
  trait AwsLambdaFunctionEnvironment extends js.Object {
    var Error: js.UndefOr[AwsLambdaFunctionEnvironmentError]
    var Variables: js.UndefOr[FieldMap]
  }

  /**
    * Error messages for environment variables that couldn't be applied.
    */
  @js.native
  @Factory
  trait AwsLambdaFunctionEnvironmentError extends js.Object {
    var ErrorCode: js.UndefOr[NonEmptyString]
    var Message: js.UndefOr[NonEmptyString]
  }

  /**
    * An AWS Lambda layer.
    */
  @js.native
  @Factory
  trait AwsLambdaFunctionLayer extends js.Object {
    var Arn: js.UndefOr[NonEmptyString]
    var CodeSize: js.UndefOr[Int]
  }

  /**
    * The function's AWS X-Ray tracing configuration.
    */
  @js.native
  @Factory
  trait AwsLambdaFunctionTracingConfig extends js.Object {
    var Mode: js.UndefOr[NonEmptyString]
  }

  /**
    * The VPC security groups and subnets that are attached to a Lambda function. For more information, see VPC Settings.
    */
  @js.native
  @Factory
  trait AwsLambdaFunctionVpcConfig extends js.Object {
    var SecurityGroupIds: js.UndefOr[NonEmptyStringList]
    var SubnetIds: js.UndefOr[NonEmptyStringList]
    var VpcId: js.UndefOr[NonEmptyString]
  }

  /**
    * Details about a Lambda layer version.
    */
  @js.native
  @Factory
  trait AwsLambdaLayerVersionDetails extends js.Object {
    var CompatibleRuntimes: js.UndefOr[NonEmptyStringList]
    var CreatedDate: js.UndefOr[NonEmptyString]
    var Version: js.UndefOr[AwsLambdaLayerVersionNumber]
  }

  /**
    * An AWS Identity and Access Management (IAM) role associated with the DB instance.
    */
  @js.native
  @Factory
  trait AwsRdsDbInstanceAssociatedRole extends js.Object {
    var FeatureName: js.UndefOr[NonEmptyString]
    var RoleArn: js.UndefOr[NonEmptyString]
    var Status: js.UndefOr[NonEmptyString]
  }

  /**
    * Contains the details of an Amazon RDS DB instance.
    */
  @js.native
  @Factory
  trait AwsRdsDbInstanceDetails extends js.Object {
    var AssociatedRoles: js.UndefOr[AwsRdsDbInstanceAssociatedRoles]
    var CACertificateIdentifier: js.UndefOr[NonEmptyString]
    var DBClusterIdentifier: js.UndefOr[NonEmptyString]
    var DBInstanceClass: js.UndefOr[NonEmptyString]
    var DBInstanceIdentifier: js.UndefOr[NonEmptyString]
    var DBName: js.UndefOr[NonEmptyString]
    var DbInstancePort: js.UndefOr[Int]
    var DbiResourceId: js.UndefOr[NonEmptyString]
    var DeletionProtection: js.UndefOr[Boolean]
    var Endpoint: js.UndefOr[AwsRdsDbInstanceEndpoint]
    var Engine: js.UndefOr[NonEmptyString]
    var EngineVersion: js.UndefOr[NonEmptyString]
    var IAMDatabaseAuthenticationEnabled: js.UndefOr[Boolean]
    var InstanceCreateTime: js.UndefOr[NonEmptyString]
    var KmsKeyId: js.UndefOr[NonEmptyString]
    var PubliclyAccessible: js.UndefOr[Boolean]
    var StorageEncrypted: js.UndefOr[Boolean]
    var TdeCredentialArn: js.UndefOr[NonEmptyString]
    var VpcSecurityGroups: js.UndefOr[AwsRdsDbInstanceVpcSecurityGroups]
  }

  /**
    * Specifies the connection endpoint.
    */
  @js.native
  @Factory
  trait AwsRdsDbInstanceEndpoint extends js.Object {
    var Address: js.UndefOr[NonEmptyString]
    var HostedZoneId: js.UndefOr[NonEmptyString]
    var Port: js.UndefOr[Int]
  }

  /**
    * A VPC security groups that the DB instance belongs to.
    */
  @js.native
  @Factory
  trait AwsRdsDbInstanceVpcSecurityGroup extends js.Object {
    var Status: js.UndefOr[NonEmptyString]
    var VpcSecurityGroupId: js.UndefOr[NonEmptyString]
  }

  /**
    * The details of an Amazon S3 bucket.
    */
  @js.native
  @Factory
  trait AwsS3BucketDetails extends js.Object {
    var OwnerId: js.UndefOr[NonEmptyString]
    var OwnerName: js.UndefOr[NonEmptyString]
  }

  /**
    * Provides consistent format for the contents of the Security Hub-aggregated findings. <code>AwsSecurityFinding</code> format enables you to share findings between AWS security services and third-party solutions, and compliance checks.
    *
    * '''Note:'''A finding is a potential security issue generated either by AWS services (Amazon GuardDuty, Amazon Inspector, and Amazon Macie) or by the integrated third-party solutions and compliance checks.
    */
  @js.native
  @Factory
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

  /**
    * A collection of attributes that are applied to all active Security Hub-aggregated findings and that result in a subset of findings that are included in this insight.
    */
  @js.native
  @Factory
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

  /**
    * A wrapper type for the topic's Amazon Resource Name (ARN).
    */
  @js.native
  @Factory
  trait AwsSnsTopicDetails extends js.Object {
    var KmsMasterKeyId: js.UndefOr[NonEmptyString]
    var Owner: js.UndefOr[NonEmptyString]
    var Subscription: js.UndefOr[AwsSnsTopicSubscriptionList]
    var TopicName: js.UndefOr[NonEmptyString]
  }

  /**
    * A wrapper type for the attributes of an Amazon SNS subscription.
    */
  @js.native
  @Factory
  trait AwsSnsTopicSubscription extends js.Object {
    var Endpoint: js.UndefOr[NonEmptyString]
    var Protocol: js.UndefOr[NonEmptyString]
  }

  /**
    * Data about a queue.
    */
  @js.native
  @Factory
  trait AwsSqsQueueDetails extends js.Object {
    var DeadLetterTargetArn: js.UndefOr[NonEmptyString]
    var KmsDataKeyReusePeriodSeconds: js.UndefOr[Int]
    var KmsMasterKeyId: js.UndefOr[NonEmptyString]
    var QueueName: js.UndefOr[NonEmptyString]
  }

  /**
    * Details about a WAF WebACL.
    */
  @js.native
  @Factory
  trait AwsWafWebAclDetails extends js.Object {
    var DefaultAction: js.UndefOr[NonEmptyString]
    var Name: js.UndefOr[NonEmptyString]
    var Rules: js.UndefOr[AwsWafWebAclRuleList]
    var WebAclId: js.UndefOr[NonEmptyString]
  }

  /**
    * Details for a rule in a WAF WebACL.
    */
  @js.native
  @Factory
  trait AwsWafWebAclRule extends js.Object {
    var Action: js.UndefOr[WafAction]
    var ExcludedRules: js.UndefOr[WafExcludedRuleList]
    var OverrideAction: js.UndefOr[WafOverrideAction]
    var Priority: js.UndefOr[Int]
    var RuleId: js.UndefOr[NonEmptyString]
    var Type: js.UndefOr[NonEmptyString]
  }

  @js.native
  @Factory
  trait BatchDisableStandardsRequest extends js.Object {
    var StandardsSubscriptionArns: StandardsSubscriptionArns
  }

  @js.native
  @Factory
  trait BatchDisableStandardsResponse extends js.Object {
    var StandardsSubscriptions: js.UndefOr[StandardsSubscriptions]
  }

  @js.native
  @Factory
  trait BatchEnableStandardsRequest extends js.Object {
    var StandardsSubscriptionRequests: StandardsSubscriptionRequests
  }

  @js.native
  @Factory
  trait BatchEnableStandardsResponse extends js.Object {
    var StandardsSubscriptions: js.UndefOr[StandardsSubscriptions]
  }

  @js.native
  @Factory
  trait BatchImportFindingsRequest extends js.Object {
    var Findings: AwsSecurityFindingList
  }

  @js.native
  @Factory
  trait BatchImportFindingsResponse extends js.Object {
    var FailedCount: Int
    var SuccessCount: Int
    var FailedFindings: js.UndefOr[ImportFindingsErrorList]
  }

  /**
    * Exclusive to findings that are generated as the result of a check run against a specific rule in a supported standard, such as CIS AWS Foundations. Contains compliance-related finding details.
    *  Values include the following:
    * * Allowed values are the following:
    * <li> <code>PASSED</code> - Compliance check passed for all evaluated resources.
    *  * <code>WARNING</code> - Some information is missing or this check is not supported given your configuration.
    *  * <code>FAILED</code> - Compliance check failed for at least one evaluated resource.
    *  * <code>NOT_AVAILABLE</code> - Check could not be performed due to a service outage, API error, or because the result of the AWS Config evaluation was <code>NOT_APPLICABLE</code>. If the AWS Config evaluation result was <code> NOT_APPLICABLE</code>, then after 3 days, Security Hub automatically archives the finding.
    * </li>
    */
  @js.native
  @Factory
  trait Compliance extends js.Object {
    var RelatedRequirements: js.UndefOr[RelatedRequirementsList]
    var Status: js.UndefOr[ComplianceStatus]
  }

  @js.native
  sealed trait ComplianceStatus extends js.Any
  object ComplianceStatus extends js.Object {
    val PASSED        = "PASSED".asInstanceOf[ComplianceStatus]
    val WARNING       = "WARNING".asInstanceOf[ComplianceStatus]
    val FAILED        = "FAILED".asInstanceOf[ComplianceStatus]
    val NOT_AVAILABLE = "NOT_AVAILABLE".asInstanceOf[ComplianceStatus]

    val values = js.Object.freeze(js.Array(PASSED, WARNING, FAILED, NOT_AVAILABLE))
  }

  /**
    * Container details related to a finding.
    */
  @js.native
  @Factory
  trait ContainerDetails extends js.Object {
    var ImageId: js.UndefOr[NonEmptyString]
    var ImageName: js.UndefOr[NonEmptyString]
    var LaunchedAt: js.UndefOr[NonEmptyString]
    var Name: js.UndefOr[NonEmptyString]
  }

  @js.native
  sealed trait ControlStatus extends js.Any
  object ControlStatus extends js.Object {
    val ENABLED  = "ENABLED".asInstanceOf[ControlStatus]
    val DISABLED = "DISABLED".asInstanceOf[ControlStatus]

    val values = js.Object.freeze(js.Array(ENABLED, DISABLED))
  }

  @js.native
  @Factory
  trait CreateActionTargetRequest extends js.Object {
    var Description: NonEmptyString
    var Id: NonEmptyString
    var Name: NonEmptyString
  }

  @js.native
  @Factory
  trait CreateActionTargetResponse extends js.Object {
    var ActionTargetArn: NonEmptyString
  }

  @js.native
  @Factory
  trait CreateInsightRequest extends js.Object {
    var Filters: AwsSecurityFindingFilters
    var GroupByAttribute: NonEmptyString
    var Name: NonEmptyString
  }

  @js.native
  @Factory
  trait CreateInsightResponse extends js.Object {
    var InsightArn: NonEmptyString
  }

  @js.native
  @Factory
  trait CreateMembersRequest extends js.Object {
    var AccountDetails: js.UndefOr[AccountDetailsList]
  }

  @js.native
  @Factory
  trait CreateMembersResponse extends js.Object {
    var UnprocessedAccounts: js.UndefOr[ResultList]
  }

  /**
    * A date filter for querying findings.
    */
  @js.native
  @Factory
  trait DateFilter extends js.Object {
    var DateRange: js.UndefOr[DateRange]
    var End: js.UndefOr[NonEmptyString]
    var Start: js.UndefOr[NonEmptyString]
  }

  /**
    * A date range for the date filter.
    */
  @js.native
  @Factory
  trait DateRange extends js.Object {
    var Unit: js.UndefOr[DateRangeUnit]
    var Value: js.UndefOr[Int]
  }

  @js.native
  sealed trait DateRangeUnit extends js.Any
  object DateRangeUnit extends js.Object {
    val DAYS = "DAYS".asInstanceOf[DateRangeUnit]

    val values = js.Object.freeze(js.Array(DAYS))
  }

  @js.native
  @Factory
  trait DeclineInvitationsRequest extends js.Object {
    var AccountIds: AccountIdList
  }

  @js.native
  @Factory
  trait DeclineInvitationsResponse extends js.Object {
    var UnprocessedAccounts: js.UndefOr[ResultList]
  }

  @js.native
  @Factory
  trait DeleteActionTargetRequest extends js.Object {
    var ActionTargetArn: NonEmptyString
  }

  @js.native
  @Factory
  trait DeleteActionTargetResponse extends js.Object {
    var ActionTargetArn: NonEmptyString
  }

  @js.native
  @Factory
  trait DeleteInsightRequest extends js.Object {
    var InsightArn: NonEmptyString
  }

  @js.native
  @Factory
  trait DeleteInsightResponse extends js.Object {
    var InsightArn: NonEmptyString
  }

  @js.native
  @Factory
  trait DeleteInvitationsRequest extends js.Object {
    var AccountIds: AccountIdList
  }

  @js.native
  @Factory
  trait DeleteInvitationsResponse extends js.Object {
    var UnprocessedAccounts: js.UndefOr[ResultList]
  }

  @js.native
  @Factory
  trait DeleteMembersRequest extends js.Object {
    var AccountIds: js.UndefOr[AccountIdList]
  }

  @js.native
  @Factory
  trait DeleteMembersResponse extends js.Object {
    var UnprocessedAccounts: js.UndefOr[ResultList]
  }

  @js.native
  @Factory
  trait DescribeActionTargetsRequest extends js.Object {
    var ActionTargetArns: js.UndefOr[ArnList]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait DescribeActionTargetsResponse extends js.Object {
    var ActionTargets: ActionTargetList
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait DescribeHubRequest extends js.Object {
    var HubArn: js.UndefOr[NonEmptyString]
  }

  @js.native
  @Factory
  trait DescribeHubResponse extends js.Object {
    var HubArn: js.UndefOr[NonEmptyString]
    var SubscribedAt: js.UndefOr[NonEmptyString]
  }

  @js.native
  @Factory
  trait DescribeProductsRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait DescribeProductsResponse extends js.Object {
    var Products: ProductsList
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait DescribeStandardsControlsRequest extends js.Object {
    var StandardsSubscriptionArn: NonEmptyString
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait DescribeStandardsControlsResponse extends js.Object {
    var Controls: js.UndefOr[StandardsControls]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait DescribeStandardsRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait DescribeStandardsResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Standards: js.UndefOr[Standards]
  }

  @js.native
  @Factory
  trait DisableImportFindingsForProductRequest extends js.Object {
    var ProductSubscriptionArn: NonEmptyString
  }

  @js.native
  @Factory
  trait DisableImportFindingsForProductResponse extends js.Object {}

  @js.native
  @Factory
  trait DisableSecurityHubRequest extends js.Object {}

  @js.native
  @Factory
  trait DisableSecurityHubResponse extends js.Object {}

  @js.native
  @Factory
  trait DisassociateFromMasterAccountRequest extends js.Object {}

  @js.native
  @Factory
  trait DisassociateFromMasterAccountResponse extends js.Object {}

  @js.native
  @Factory
  trait DisassociateMembersRequest extends js.Object {
    var AccountIds: js.UndefOr[AccountIdList]
  }

  @js.native
  @Factory
  trait DisassociateMembersResponse extends js.Object {}

  @js.native
  @Factory
  trait EnableImportFindingsForProductRequest extends js.Object {
    var ProductArn: NonEmptyString
  }

  @js.native
  @Factory
  trait EnableImportFindingsForProductResponse extends js.Object {
    var ProductSubscriptionArn: js.UndefOr[NonEmptyString]
  }

  @js.native
  @Factory
  trait EnableSecurityHubRequest extends js.Object {
    var Tags: js.UndefOr[TagMap]
  }

  @js.native
  @Factory
  trait EnableSecurityHubResponse extends js.Object {}

  @js.native
  @Factory
  trait GetEnabledStandardsRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
    var StandardsSubscriptionArns: js.UndefOr[StandardsSubscriptionArns]
  }

  @js.native
  @Factory
  trait GetEnabledStandardsResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var StandardsSubscriptions: js.UndefOr[StandardsSubscriptions]
  }

  @js.native
  @Factory
  trait GetFindingsRequest extends js.Object {
    var Filters: js.UndefOr[AwsSecurityFindingFilters]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
    var SortCriteria: js.UndefOr[SortCriteria]
  }

  @js.native
  @Factory
  trait GetFindingsResponse extends js.Object {
    var Findings: AwsSecurityFindingList
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait GetInsightResultsRequest extends js.Object {
    var InsightArn: NonEmptyString
  }

  @js.native
  @Factory
  trait GetInsightResultsResponse extends js.Object {
    var InsightResults: InsightResults
  }

  @js.native
  @Factory
  trait GetInsightsRequest extends js.Object {
    var InsightArns: js.UndefOr[ArnList]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait GetInsightsResponse extends js.Object {
    var Insights: InsightList
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait GetInvitationsCountRequest extends js.Object {}

  @js.native
  @Factory
  trait GetInvitationsCountResponse extends js.Object {
    var InvitationsCount: js.UndefOr[Int]
  }

  @js.native
  @Factory
  trait GetMasterAccountRequest extends js.Object {}

  @js.native
  @Factory
  trait GetMasterAccountResponse extends js.Object {
    var Master: js.UndefOr[Invitation]
  }

  @js.native
  @Factory
  trait GetMembersRequest extends js.Object {
    var AccountIds: AccountIdList
  }

  @js.native
  @Factory
  trait GetMembersResponse extends js.Object {
    var Members: js.UndefOr[MemberList]
    var UnprocessedAccounts: js.UndefOr[ResultList]
  }

  /**
    * Includes details of the list of the findings that cannot be imported.
    */
  @js.native
  @Factory
  trait ImportFindingsError extends js.Object {
    var ErrorCode: NonEmptyString
    var ErrorMessage: NonEmptyString
    var Id: NonEmptyString
  }

  /**
    * Contains information about a Security Hub insight.
    */
  @js.native
  @Factory
  trait Insight extends js.Object {
    var Filters: AwsSecurityFindingFilters
    var GroupByAttribute: NonEmptyString
    var InsightArn: NonEmptyString
    var Name: NonEmptyString
  }

  /**
    * The insight result values returned by the <code>GetInsightResults</code> operation.
    */
  @js.native
  @Factory
  trait InsightResultValue extends js.Object {
    var Count: Int
    var GroupByAttributeValue: NonEmptyString
  }

  /**
    * The insight results returned by the <code>GetInsightResults</code> operation.
    */
  @js.native
  @Factory
  trait InsightResults extends js.Object {
    var GroupByAttribute: NonEmptyString
    var InsightArn: NonEmptyString
    var ResultValues: InsightResultValueList
  }

  /**
    * Details about an invitation.
    */
  @js.native
  @Factory
  trait Invitation extends js.Object {
    var AccountId: js.UndefOr[AccountId]
    var InvitationId: js.UndefOr[NonEmptyString]
    var InvitedAt: js.UndefOr[Timestamp]
    var MemberStatus: js.UndefOr[NonEmptyString]
  }

  @js.native
  @Factory
  trait InviteMembersRequest extends js.Object {
    var AccountIds: js.UndefOr[AccountIdList]
  }

  @js.native
  @Factory
  trait InviteMembersResponse extends js.Object {
    var UnprocessedAccounts: js.UndefOr[ResultList]
  }

  /**
    * The IP filter for querying findings.
    */
  @js.native
  @Factory
  trait IpFilter extends js.Object {
    var Cidr: js.UndefOr[NonEmptyString]
  }

  /**
    * A keyword filter for querying findings.
    */
  @js.native
  @Factory
  trait KeywordFilter extends js.Object {
    var Value: js.UndefOr[NonEmptyString]
  }

  @js.native
  @Factory
  trait ListEnabledProductsForImportRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListEnabledProductsForImportResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var ProductSubscriptions: js.UndefOr[ProductSubscriptionArnList]
  }

  @js.native
  @Factory
  trait ListInvitationsRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListInvitationsResponse extends js.Object {
    var Invitations: js.UndefOr[InvitationList]
    var NextToken: js.UndefOr[NonEmptyString]
  }

  @js.native
  @Factory
  trait ListMembersRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
    var OnlyAssociated: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait ListMembersResponse extends js.Object {
    var Members: js.UndefOr[MemberList]
    var NextToken: js.UndefOr[NonEmptyString]
  }

  @js.native
  @Factory
  trait ListTagsForResourceRequest extends js.Object {
    var ResourceArn: ResourceArn
  }

  @js.native
  @Factory
  trait ListTagsForResourceResponse extends js.Object {
    var Tags: js.UndefOr[TagMap]
  }

  /**
    * Information about the state of the load balancer.
    */
  @js.native
  @Factory
  trait LoadBalancerState extends js.Object {
    var Code: js.UndefOr[NonEmptyString]
    var Reason: js.UndefOr[NonEmptyString]
  }

  /**
    * A list of malware related to a finding.
    */
  @js.native
  @Factory
  trait Malware extends js.Object {
    var Name: NonEmptyString
    var Path: js.UndefOr[NonEmptyString]
    var State: js.UndefOr[MalwareState]
    var Type: js.UndefOr[MalwareType]
  }

  @js.native
  sealed trait MalwareState extends js.Any
  object MalwareState extends js.Object {
    val OBSERVED       = "OBSERVED".asInstanceOf[MalwareState]
    val REMOVAL_FAILED = "REMOVAL_FAILED".asInstanceOf[MalwareState]
    val REMOVED        = "REMOVED".asInstanceOf[MalwareState]

    val values = js.Object.freeze(js.Array(OBSERVED, REMOVAL_FAILED, REMOVED))
  }

  @js.native
  sealed trait MalwareType extends js.Any
  object MalwareType extends js.Object {
    val ADWARE               = "ADWARE".asInstanceOf[MalwareType]
    val BLENDED_THREAT       = "BLENDED_THREAT".asInstanceOf[MalwareType]
    val BOTNET_AGENT         = "BOTNET_AGENT".asInstanceOf[MalwareType]
    val COIN_MINER           = "COIN_MINER".asInstanceOf[MalwareType]
    val EXPLOIT_KIT          = "EXPLOIT_KIT".asInstanceOf[MalwareType]
    val KEYLOGGER            = "KEYLOGGER".asInstanceOf[MalwareType]
    val MACRO                = "MACRO".asInstanceOf[MalwareType]
    val POTENTIALLY_UNWANTED = "POTENTIALLY_UNWANTED".asInstanceOf[MalwareType]
    val SPYWARE              = "SPYWARE".asInstanceOf[MalwareType]
    val RANSOMWARE           = "RANSOMWARE".asInstanceOf[MalwareType]
    val REMOTE_ACCESS        = "REMOTE_ACCESS".asInstanceOf[MalwareType]
    val ROOTKIT              = "ROOTKIT".asInstanceOf[MalwareType]
    val TROJAN               = "TROJAN".asInstanceOf[MalwareType]
    val VIRUS                = "VIRUS".asInstanceOf[MalwareType]
    val WORM                 = "WORM".asInstanceOf[MalwareType]

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
  @Factory
  trait MapFilter extends js.Object {
    var Comparison: js.UndefOr[MapFilterComparison]
    var Key: js.UndefOr[NonEmptyString]
    var Value: js.UndefOr[NonEmptyString]
  }

  @js.native
  sealed trait MapFilterComparison extends js.Any
  object MapFilterComparison extends js.Object {
    val EQUALS = "EQUALS".asInstanceOf[MapFilterComparison]

    val values = js.Object.freeze(js.Array(EQUALS))
  }

  /**
    * The details about a member account.
    */
  @js.native
  @Factory
  trait Member extends js.Object {
    var AccountId: js.UndefOr[AccountId]
    var Email: js.UndefOr[NonEmptyString]
    var InvitedAt: js.UndefOr[Timestamp]
    var MasterId: js.UndefOr[NonEmptyString]
    var MemberStatus: js.UndefOr[NonEmptyString]
    var UpdatedAt: js.UndefOr[Timestamp]
  }

  /**
    * The details of network-related information about a finding.
    */
  @js.native
  @Factory
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

  @js.native
  sealed trait NetworkDirection extends js.Any
  object NetworkDirection extends js.Object {
    val IN  = "IN".asInstanceOf[NetworkDirection]
    val OUT = "OUT".asInstanceOf[NetworkDirection]

    val values = js.Object.freeze(js.Array(IN, OUT))
  }

  /**
    * A user-defined note added to a finding.
    */
  @js.native
  @Factory
  trait Note extends js.Object {
    var Text: NonEmptyString
    var UpdatedAt: NonEmptyString
    var UpdatedBy: NonEmptyString
  }

  /**
    * The updated note.
    */
  @js.native
  @Factory
  trait NoteUpdate extends js.Object {
    var Text: NonEmptyString
    var UpdatedBy: NonEmptyString
  }

  /**
    * A number filter for querying findings.
    */
  @js.native
  @Factory
  trait NumberFilter extends js.Object {
    var Eq: js.UndefOr[Double]
    var Gte: js.UndefOr[Double]
    var Lte: js.UndefOr[Double]
  }

  @js.native
  sealed trait Partition extends js.Any
  object Partition extends js.Object {
    val aws          = "aws".asInstanceOf[Partition]
    val `aws-cn`     = "aws-cn".asInstanceOf[Partition]
    val `aws-us-gov` = "aws-us-gov".asInstanceOf[Partition]

    val values = js.Object.freeze(js.Array(aws, `aws-cn`, `aws-us-gov`))
  }

  /**
    * The details of process-related information about a finding.
    */
  @js.native
  @Factory
  trait ProcessDetails extends js.Object {
    var LaunchedAt: js.UndefOr[NonEmptyString]
    var Name: js.UndefOr[NonEmptyString]
    var ParentPid: js.UndefOr[Int]
    var Path: js.UndefOr[NonEmptyString]
    var Pid: js.UndefOr[Int]
    var TerminatedAt: js.UndefOr[NonEmptyString]
  }

  /**
    * Contains details about a product.
    */
  @js.native
  @Factory
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

  /**
    * A recommendation on how to remediate the issue identified in a finding.
    */
  @js.native
  @Factory
  trait Recommendation extends js.Object {
    var Text: js.UndefOr[NonEmptyString]
    var Url: js.UndefOr[NonEmptyString]
  }

  @js.native
  sealed trait RecordState extends js.Any
  object RecordState extends js.Object {
    val ACTIVE   = "ACTIVE".asInstanceOf[RecordState]
    val ARCHIVED = "ARCHIVED".asInstanceOf[RecordState]

    val values = js.Object.freeze(js.Array(ACTIVE, ARCHIVED))
  }

  /**
    * Details about a related finding.
    */
  @js.native
  @Factory
  trait RelatedFinding extends js.Object {
    var Id: NonEmptyString
    var ProductArn: NonEmptyString
  }

  /**
    * Details about the remediation steps for a finding.
    */
  @js.native
  @Factory
  trait Remediation extends js.Object {
    var Recommendation: js.UndefOr[Recommendation]
  }

  /**
    * A resource related to a finding.
    */
  @js.native
  @Factory
  trait Resource extends js.Object {
    var Id: NonEmptyString
    var Type: NonEmptyString
    var Details: js.UndefOr[ResourceDetails]
    var Partition: js.UndefOr[Partition]
    var Region: js.UndefOr[NonEmptyString]
    var Tags: js.UndefOr[FieldMap]
  }

  /**
    * Additional details about a resource related to a finding.
    *  To provide the details, use the object that corresponds to the resource type. For example, if the resource type is <code>AwsEc2Instance</code>, then you use the <code>AwsEc2Instance</code> object to provide the details.
    *  If the type-specific object does not contain all of the fields you want to populate, then you use the <code>Other</code> object to populate those additional fields.
    *  You also use the <code>Other</code> object to populate the details when the selected type does not have a corresponding object.
    */
  @js.native
  @Factory
  trait ResourceDetails extends js.Object {
    var AwsCloudFrontDistribution: js.UndefOr[AwsCloudFrontDistributionDetails]
    var AwsCodeBuildProject: js.UndefOr[AwsCodeBuildProjectDetails]
    var AwsEc2Instance: js.UndefOr[AwsEc2InstanceDetails]
    var AwsEc2NetworkInterface: js.UndefOr[AwsEc2NetworkInterfaceDetails]
    var AwsEc2SecurityGroup: js.UndefOr[AwsEc2SecurityGroupDetails]
    var AwsElasticsearchDomain: js.UndefOr[AwsElasticsearchDomainDetails]
    var AwsElbv2LoadBalancer: js.UndefOr[AwsElbv2LoadBalancerDetails]
    var AwsIamAccessKey: js.UndefOr[AwsIamAccessKeyDetails]
    var AwsIamRole: js.UndefOr[AwsIamRoleDetails]
    var AwsKmsKey: js.UndefOr[AwsKmsKeyDetails]
    var AwsLambdaFunction: js.UndefOr[AwsLambdaFunctionDetails]
    var AwsLambdaLayerVersion: js.UndefOr[AwsLambdaLayerVersionDetails]
    var AwsRdsDbInstance: js.UndefOr[AwsRdsDbInstanceDetails]
    var AwsS3Bucket: js.UndefOr[AwsS3BucketDetails]
    var AwsSnsTopic: js.UndefOr[AwsSnsTopicDetails]
    var AwsSqsQueue: js.UndefOr[AwsSqsQueueDetails]
    var AwsWafWebAcl: js.UndefOr[AwsWafWebAclDetails]
    var Container: js.UndefOr[ContainerDetails]
    var Other: js.UndefOr[FieldMap]
  }

  /**
    * Details about the account that was not processed.
    */
  @js.native
  @Factory
  trait Result extends js.Object {
    var AccountId: js.UndefOr[AccountId]
    var ProcessingResult: js.UndefOr[NonEmptyString]
  }

  /**
    * The severity of the finding.
    */
  @js.native
  @Factory
  trait Severity extends js.Object {
    var Normalized: Int
    var Product: js.UndefOr[Double]
  }

  @js.native
  sealed trait SeverityRating extends js.Any
  object SeverityRating extends js.Object {
    val LOW      = "LOW".asInstanceOf[SeverityRating]
    val MEDIUM   = "MEDIUM".asInstanceOf[SeverityRating]
    val HIGH     = "HIGH".asInstanceOf[SeverityRating]
    val CRITICAL = "CRITICAL".asInstanceOf[SeverityRating]

    val values = js.Object.freeze(js.Array(LOW, MEDIUM, HIGH, CRITICAL))
  }

  /**
    * A collection of finding attributes used to sort findings.
    */
  @js.native
  @Factory
  trait SortCriterion extends js.Object {
    var Field: js.UndefOr[NonEmptyString]
    var SortOrder: js.UndefOr[SortOrder]
  }

  @js.native
  sealed trait SortOrder extends js.Any
  object SortOrder extends js.Object {
    val asc  = "asc".asInstanceOf[SortOrder]
    val desc = "desc".asInstanceOf[SortOrder]

    val values = js.Object.freeze(js.Array(asc, desc))
  }

  /**
    * Provides information about a specific standard.
    */
  @js.native
  @Factory
  trait Standard extends js.Object {
    var Description: js.UndefOr[NonEmptyString]
    var Name: js.UndefOr[NonEmptyString]
    var StandardsArn: js.UndefOr[NonEmptyString]
  }

  /**
    * Details for an individual compliance standard control.
    */
  @js.native
  @Factory
  trait StandardsControl extends js.Object {
    var ControlId: js.UndefOr[NonEmptyString]
    var ControlStatus: js.UndefOr[ControlStatus]
    var ControlStatusUpdatedAt: js.UndefOr[Timestamp]
    var Description: js.UndefOr[NonEmptyString]
    var DisabledReason: js.UndefOr[NonEmptyString]
    var RelatedRequirements: js.UndefOr[RelatedRequirementsList]
    var RemediationUrl: js.UndefOr[NonEmptyString]
    var SeverityRating: js.UndefOr[SeverityRating]
    var StandardsControlArn: js.UndefOr[NonEmptyString]
    var Title: js.UndefOr[NonEmptyString]
  }

  @js.native
  sealed trait StandardsStatus extends js.Any
  object StandardsStatus extends js.Object {
    val PENDING    = "PENDING".asInstanceOf[StandardsStatus]
    val READY      = "READY".asInstanceOf[StandardsStatus]
    val FAILED     = "FAILED".asInstanceOf[StandardsStatus]
    val DELETING   = "DELETING".asInstanceOf[StandardsStatus]
    val INCOMPLETE = "INCOMPLETE".asInstanceOf[StandardsStatus]

    val values = js.Object.freeze(js.Array(PENDING, READY, FAILED, DELETING, INCOMPLETE))
  }

  /**
    * A resource that represents your subscription to a supported standard.
    */
  @js.native
  @Factory
  trait StandardsSubscription extends js.Object {
    var StandardsArn: NonEmptyString
    var StandardsInput: StandardsInputParameterMap
    var StandardsStatus: StandardsStatus
    var StandardsSubscriptionArn: NonEmptyString
  }

  /**
    * The standard that you want to enable.
    */
  @js.native
  @Factory
  trait StandardsSubscriptionRequest extends js.Object {
    var StandardsArn: NonEmptyString
    var StandardsInput: js.UndefOr[StandardsInputParameterMap]
  }

  /**
    * A string filter for querying findings.
    */
  @js.native
  @Factory
  trait StringFilter extends js.Object {
    var Comparison: js.UndefOr[StringFilterComparison]
    var Value: js.UndefOr[NonEmptyString]
  }

  @js.native
  sealed trait StringFilterComparison extends js.Any
  object StringFilterComparison extends js.Object {
    val EQUALS = "EQUALS".asInstanceOf[StringFilterComparison]
    val PREFIX = "PREFIX".asInstanceOf[StringFilterComparison]

    val values = js.Object.freeze(js.Array(EQUALS, PREFIX))
  }

  @js.native
  @Factory
  trait TagResourceRequest extends js.Object {
    var ResourceArn: ResourceArn
    var Tags: TagMap
  }

  @js.native
  @Factory
  trait TagResourceResponse extends js.Object {}

  /**
    * Details about the threat intelligence related to a finding.
    */
  @js.native
  @Factory
  trait ThreatIntelIndicator extends js.Object {
    var Category: js.UndefOr[ThreatIntelIndicatorCategory]
    var LastObservedAt: js.UndefOr[NonEmptyString]
    var Source: js.UndefOr[NonEmptyString]
    var SourceUrl: js.UndefOr[NonEmptyString]
    var Type: js.UndefOr[ThreatIntelIndicatorType]
    var Value: js.UndefOr[NonEmptyString]
  }

  @js.native
  sealed trait ThreatIntelIndicatorCategory extends js.Any
  object ThreatIntelIndicatorCategory extends js.Object {
    val BACKDOOR            = "BACKDOOR".asInstanceOf[ThreatIntelIndicatorCategory]
    val CARD_STEALER        = "CARD_STEALER".asInstanceOf[ThreatIntelIndicatorCategory]
    val COMMAND_AND_CONTROL = "COMMAND_AND_CONTROL".asInstanceOf[ThreatIntelIndicatorCategory]
    val DROP_SITE           = "DROP_SITE".asInstanceOf[ThreatIntelIndicatorCategory]
    val EXPLOIT_SITE        = "EXPLOIT_SITE".asInstanceOf[ThreatIntelIndicatorCategory]
    val KEYLOGGER           = "KEYLOGGER".asInstanceOf[ThreatIntelIndicatorCategory]

    val values =
      js.Object.freeze(js.Array(BACKDOOR, CARD_STEALER, COMMAND_AND_CONTROL, DROP_SITE, EXPLOIT_SITE, KEYLOGGER))
  }

  @js.native
  sealed trait ThreatIntelIndicatorType extends js.Any
  object ThreatIntelIndicatorType extends js.Object {
    val DOMAIN        = "DOMAIN".asInstanceOf[ThreatIntelIndicatorType]
    val EMAIL_ADDRESS = "EMAIL_ADDRESS".asInstanceOf[ThreatIntelIndicatorType]
    val HASH_MD5      = "HASH_MD5".asInstanceOf[ThreatIntelIndicatorType]
    val HASH_SHA1     = "HASH_SHA1".asInstanceOf[ThreatIntelIndicatorType]
    val HASH_SHA256   = "HASH_SHA256".asInstanceOf[ThreatIntelIndicatorType]
    val HASH_SHA512   = "HASH_SHA512".asInstanceOf[ThreatIntelIndicatorType]
    val IPV4_ADDRESS  = "IPV4_ADDRESS".asInstanceOf[ThreatIntelIndicatorType]
    val IPV6_ADDRESS  = "IPV6_ADDRESS".asInstanceOf[ThreatIntelIndicatorType]
    val MUTEX         = "MUTEX".asInstanceOf[ThreatIntelIndicatorType]
    val PROCESS       = "PROCESS".asInstanceOf[ThreatIntelIndicatorType]
    val URL           = "URL".asInstanceOf[ThreatIntelIndicatorType]

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
  @Factory
  trait UntagResourceRequest extends js.Object {
    var ResourceArn: ResourceArn
    var TagKeys: TagKeyList
  }

  @js.native
  @Factory
  trait UntagResourceResponse extends js.Object {}

  @js.native
  @Factory
  trait UpdateActionTargetRequest extends js.Object {
    var ActionTargetArn: NonEmptyString
    var Description: js.UndefOr[NonEmptyString]
    var Name: js.UndefOr[NonEmptyString]
  }

  @js.native
  @Factory
  trait UpdateActionTargetResponse extends js.Object {}

  @js.native
  @Factory
  trait UpdateFindingsRequest extends js.Object {
    var Filters: AwsSecurityFindingFilters
    var Note: js.UndefOr[NoteUpdate]
    var RecordState: js.UndefOr[RecordState]
  }

  @js.native
  @Factory
  trait UpdateFindingsResponse extends js.Object {}

  @js.native
  @Factory
  trait UpdateInsightRequest extends js.Object {
    var InsightArn: NonEmptyString
    var Filters: js.UndefOr[AwsSecurityFindingFilters]
    var GroupByAttribute: js.UndefOr[NonEmptyString]
    var Name: js.UndefOr[NonEmptyString]
  }

  @js.native
  @Factory
  trait UpdateInsightResponse extends js.Object {}

  @js.native
  @Factory
  trait UpdateStandardsControlRequest extends js.Object {
    var StandardsControlArn: NonEmptyString
    var ControlStatus: js.UndefOr[ControlStatus]
    var DisabledReason: js.UndefOr[NonEmptyString]
  }

  @js.native
  @Factory
  trait UpdateStandardsControlResponse extends js.Object {}

  @js.native
  sealed trait VerificationState extends js.Any
  object VerificationState extends js.Object {
    val UNKNOWN         = "UNKNOWN".asInstanceOf[VerificationState]
    val TRUE_POSITIVE   = "TRUE_POSITIVE".asInstanceOf[VerificationState]
    val FALSE_POSITIVE  = "FALSE_POSITIVE".asInstanceOf[VerificationState]
    val BENIGN_POSITIVE = "BENIGN_POSITIVE".asInstanceOf[VerificationState]

    val values = js.Object.freeze(js.Array(UNKNOWN, TRUE_POSITIVE, FALSE_POSITIVE, BENIGN_POSITIVE))
  }

  /**
    * Details about the action that CloudFront or AWS WAF takes when a web request matches the conditions in the Rule.
    */
  @js.native
  @Factory
  trait WafAction extends js.Object {
    var Type: js.UndefOr[NonEmptyString]
  }

  /**
    * Details about a rule to exclude from a rule group.
    */
  @js.native
  @Factory
  trait WafExcludedRule extends js.Object {
    var RuleId: js.UndefOr[NonEmptyString]
  }

  /**
    * Details about an override action for a rule.
    */
  @js.native
  @Factory
  trait WafOverrideAction extends js.Object {
    var Type: js.UndefOr[NonEmptyString]
  }

  @js.native
  sealed trait WorkflowState extends js.Any
  object WorkflowState extends js.Object {
    val NEW         = "NEW".asInstanceOf[WorkflowState]
    val ASSIGNED    = "ASSIGNED".asInstanceOf[WorkflowState]
    val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[WorkflowState]
    val DEFERRED    = "DEFERRED".asInstanceOf[WorkflowState]
    val RESOLVED    = "RESOLVED".asInstanceOf[WorkflowState]

    val values = js.Object.freeze(js.Array(NEW, ASSIGNED, IN_PROGRESS, DEFERRED, RESOLVED))
  }
}
